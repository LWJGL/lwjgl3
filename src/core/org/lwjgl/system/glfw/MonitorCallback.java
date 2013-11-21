/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 */
package org.lwjgl.system.glfw;

import java.lang.reflect.Method;

import static org.lwjgl.system.APIUtil.*;
import static org.lwjgl.system.MemoryUtil.*;

/** Instances of this interface may be passed to the {@link GLFW#glfwSetMonitorCallback(MonitorCallback) SetMonitorCallback} method. */
/*@FunctionalInterface*/
public interface MonitorCallback {

	/**
	 * This method will be called when a GLFW monitor event occurs.
	 *
	 * @param monitor the monitor that was connected or disconnected
	 * @param event   one of {@link GLFW#GLFW_CONNECTED} or {@link GLFW#GLFW_DISCONNECTED}
	 */
	void invoke(long monitor, int event);

	final class Util {

		static final long CALLBACK = setCallback(apiCallbackMethod(MonitorCallback.Util.class, long.class, int.class));

		private static final MonitorCallback DEFAULT = new MonitorCallback() {
			@Override
			public void invoke(long monitor, int event) {
				System.out.printf("[LWJGL] Monitor [0x%X] %s.\n", monitor, event == GLFW.GLFW_CONNECTED ? "connected" : "disconnected");
			}
		};

		private static MonitorCallback callback;

		private Util() {
		}

		private static native long setCallback(Method callback);

		static long register(MonitorCallback proc) {
			callback = proc;
			return proc == null ? NULL : CALLBACK;
		}

		private static void invoke(long monitor, int event) {
			callback.invoke(monitor, event);
		}

		/**
		 * Returns a default {@code MonitorCallback} implementation that prints a simple description in the standard output stream.
		 *
		 * @return the default implementation
		 */
		public static MonitorCallback getDefault() {
			return DEFAULT;
		}

	}

}