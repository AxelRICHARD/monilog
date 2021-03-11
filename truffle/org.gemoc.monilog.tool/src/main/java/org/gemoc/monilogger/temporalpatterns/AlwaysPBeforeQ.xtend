package org.gemoc.monilogger.temporalpatterns

import java.util.List
import java.util.Map
import org.gemoc.monilog.moniLog.Before
import org.gemoc.monilog.moniLog.ComplexEvent
import org.gemoc.monilog.moniLog.Universality

class AlwaysPBeforeQ extends AbstractTemporalProperty {
	
	val String p
	val String q
	
	new(ComplexEvent event, Universality always, Before before) {
		super(event)
		p = always.event.event.name
		q = before.upperBound.event.name
	}
	
	override protected String getStatementString() {
		val result =
			'''
				select * from «safeName»«IF windowLength > 0»#length(«windowLength»)«ENDIF»
				match_recognize (
					measures Q as Q, nP as nP
					pattern (P* ((EoE | Q) | nP))
					define
						P as P.«p»? is not null,
						nP as nP.«p»? is null,
						Q as Q.«q»? is not null,
						EoE as EoE.EoE? is not null
				)
			'''
		return result
	}
	
	override protected getStatus(Map<String, List<Map<?, ?>>> events) {
		val lnP = events.get("nP")
		return if (lnP === null || lnP.empty) TruthValue.SATISFIED else TruthValue.VIOLATED
	}
	
}