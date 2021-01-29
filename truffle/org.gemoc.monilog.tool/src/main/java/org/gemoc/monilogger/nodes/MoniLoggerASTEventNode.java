package org.gemoc.monilogger.nodes;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.espertech.esper.runtime.client.EPRuntime;
import com.oracle.truffle.api.CompilerDirectives;
import com.oracle.truffle.api.frame.FrameSlot;
import com.oracle.truffle.api.frame.VirtualFrame;
import com.oracle.truffle.api.instrumentation.ExecutionEventNode;
import com.oracle.truffle.api.nodes.ExplodeLoop;

public class MoniLoggerASTEventNode extends ExecutionEventNode {

	private final String name;
	private final boolean onEnter;
	private final String[] properties;
	@Child
	private MoniLoggerExecutableNode moniloggers;

	private FrameSlot[] frameSlots = null;

	private final EPRuntime epRuntime;

	public MoniLoggerASTEventNode(String name, boolean onEnter, List<String> properties,
			MoniLoggerExecutableNode moniloggers, EPRuntime epRuntime) {
		this.name = name;
		this.onEnter = onEnter;
		this.properties = properties.toArray(new String[0]);
		this.moniloggers = moniloggers;
		this.epRuntime = epRuntime;
	}

	@Override
	@ExplodeLoop
	protected void onEnter(VirtualFrame frame) {
		if (onEnter) {
			final Map<String, Object> event = new HashMap<>(properties.length + 1);
			event.put(name, name);
			if (frameSlots == null) {
				CompilerDirectives.transferToInterpreterAndInvalidate();
				frameSlots = new FrameSlot[properties.length];
				for (int i = 0; i < properties.length; i++) {
					frameSlots[i] = frame.getFrameDescriptor().findFrameSlot(properties[i]);
				}
			}
			for (int i = 0; i < properties.length; i++) {
				event.put(properties[i], frame.getValue(frameSlots[i]));
			}
//			TODO
//			epRuntime.getEventService().sendEventMap(event, name);
			moniloggers.execute(frame);
		}
	}

	@Override
	@ExplodeLoop
	protected void onReturnValue(VirtualFrame frame, Object result) {
		if (!onEnter) {
			final Map<String, Object> event = new HashMap<>(properties.length + 1);
			event.put(name, name);
			if (frameSlots == null) {
				CompilerDirectives.transferToInterpreterAndInvalidate();
				frameSlots = new FrameSlot[properties.length];
				for (int i = 0; i < properties.length; i++) {
					frameSlots[i] = frame.getFrameDescriptor().findFrameSlot(properties[i]);
				}
			}
			for (int i = 0; i < properties.length; i++) {
				event.put(properties[i], frame.getValue(frameSlots[i]));
			}
			event.put("result", result);
//			TODO
//			epRuntime.getEventService().sendEventMap(event, name);
			moniloggers.execute(frame);
		}
	}
}
