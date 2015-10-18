/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 */
package org.lwjgl.glfw;

import org.lwjgl.LWJGLUtil;
import org.lwjgl.LWJGLUtil.Platform;

import static org.lwjgl.system.macosx.Unistd.*;

/**
 * Contains checks for the event loop issues on OS X.
 *
 * <p>On-screen GLFW windows can only be used in the main thread and only if that thread is the first thread in the process. This requires running the JVM with
 * {@code -XstartOnFirstThread}, which means that other Java window-system APIs (AWT/Swing or JavaFX) cannot be used at the same time.</p>
 *
 * <p>A Java window-system API can be used if GLFW windows are never shown (created with {@link GLFW#GLFW_VISIBLE} equal to {@link GLFW#GLFW_FALSE}) and only
 * used as contexts for offscreen rendering. This is possible if the window-system is initialized and has taken control of the first thread before a GLFW
 * window is created. We cannot reliably check for this, so a simple warning is printed in debug mode.</p>
 */
final class EventLoop {

	static final class OffScreen {
		static {
			if ( LWJGLUtil.DEBUG && LWJGLUtil.getPlatform() == Platform.MACOSX ) {
				if ( !isJavaStartedOnFirstThread() )
					LWJGLUtil.log(
						"GLFW can only be used for offscreen rendering. Make sure AWT or JavaFX is initialized before creating a GLFW window. Otherwise, " +
						"please run the JVM with -XstartOnFirstThread."
					);
			}
		}

		private OffScreen() {
		}

		static void check() {
			// intentionally empty to trigger the static initializer
		}
	}

	static final class OnScreen {
		static {
			if ( LWJGLUtil.getPlatform() == Platform.MACOSX ) {
				if ( !isJavaStartedOnFirstThread() )
					throw new IllegalStateException("Please run the JVM with -XstartOnFirstThread and make sure AWT or JavaFX is not initialized.");
			}
		}

		private OnScreen() {
		}

		static void check() {
			// intentionally empty to trigger the static initializer
		}
	}

	private EventLoop() {
	}

	private static boolean isJavaStartedOnFirstThread() {
		return "1".equals(System.getenv().get("JAVA_STARTED_ON_FIRST_THREAD_" + getpid()));
	}

}