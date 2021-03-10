package org.gemoc.monilogger.temporalpatterns

import java.util.List
import java.util.Map
import org.gemoc.monilog.moniLog.Between
import org.gemoc.monilog.moniLog.ComplexEvent
import org.gemoc.monilog.moniLog.Existence
import org.gemoc.monilog.moniLog.MoniLogPackage

class ExistsPBetweenQAndR extends AbstractExistenceProperty {
	
	val String p
	val String q
	val String r
	
	new(ComplexEvent event, Existence exists, Between between) {
		this(event, 0, #[ TruthValue::SATISFIED ], exists, between)
	}
	
	new(ComplexEvent event, int windowLength, Existence exists, Between between) {
		this(event, windowLength, #[ TruthValue::SATISFIED ], exists, between)
	}
	
	new(ComplexEvent event, int windowLength, List<TruthValue> notifyOn, Existence exists, Between between) {
		super(event, windowLength, notifyOn, exists)
		p = exists.event.event.name
		q = between.lowerBound.event.name
		r = between.upperBound.event.name
	}
	
	override protected String getStatementString() {
		val result =
			'''
				select * from «safeName»«IF windowLength > 0»#length(«windowLength»)«ENDIF»
				match_recognize (
					measures P as P, Q as Q, EoE as EoE
					«pattern»
					define
						P as P.«p»? is not null,
						nPR as nPR.«p»? is null and nPR.«r»? is null,
						Q as Q.«q»? is not null,
						R as R.«r»? is not null,
						EoE as EoE.EoE? is not null
				)
			'''
		return result
	}
	
	private def getPattern() {
		val pattern =
			'''
				pattern (EoE | Q nPR* (P nPR*)* (R | EoE))
			'''
		return pattern
	}
	
	override protected getStatus(Map<String, List<Map<?, ?>>> events) {
		val lQ = events.get("Q")
		val reachedQ = !(lQ === null || lQ.empty)
		if (reachedQ) {
			val lEoE = events.get("EoE")
			val reachedEoE = !(lEoE === null || lEoE.empty)
			if (reachedEoE) {
				return TruthValue.SATISFIED
			} else {
				val lP = events.get("P")
				val nP = if (lP === null) 0 else lP.size
				return switch (exists.bound.eClass.classifierID) {
					case MoniLogPackage.EXACT_BOUND: {
						if (nP == exists.bound.n) TruthValue.UNKNOWN else TruthValue.VIOLATED
					}
					case MoniLogPackage.LOWER_BOUND: {
						if (nP >= exists.bound.n) TruthValue.UNKNOWN else TruthValue.VIOLATED
					}
					case MoniLogPackage.UPPER_BOUND: {
						if (nP <= exists.bound.n) TruthValue.UNKNOWN else TruthValue.VIOLATED
					}
				}
			}
		} else {
			return TruthValue.SATISFIED
		}
	}
}