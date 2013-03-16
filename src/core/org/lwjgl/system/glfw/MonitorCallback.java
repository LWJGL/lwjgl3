/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 */
package org.lwjgl.system.glfw;

import java.lang.reflect.Method;

/** Instances of this class may be passed to the {@link GLFW#glfwSetMonitorCallback(MonitorCallback)} method. */
public abstract class MonitorCallback {

	static final long CALLBACK;

	static {
		try {
			CALLBACK = setCallback(MonitorCallback.class.getDeclaredMethod(
				"callback", long.class, int.class
			));
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

	private static MonitorCallback callback;

	protected MonitorCallback() {
	}

	private static native long setCallback(Method callback);

	static long register(MonitorCallback proc) {
		callback = proc;
		return CALLBACK;
	}

	private static void callback(long monitor, int event) {
		callback.invoke(monitor, event);
	}

	/**
	 * This method will be called when a GLFW monitor event occurs.
	 *
	 * @param monitor the monitor that was connected or disconnected
	 * @param event   one of {@link GLFW#GLFW_CONNECTED} or {@link GLFW#GLFW_DISCONNECTED}
	 */
	public abstract void invoke(long monitor, int event);

}