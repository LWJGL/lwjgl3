/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 */
package org.lwjgl.system.macosx;

import org.lwjgl.LWJGLUtil;
import org.lwjgl.LWJGLUtil.Platform;

import static org.lwjgl.system.macosx.Unistd.*;

/** MacOSX event loop utility class. */
public final class EventLoop {

	static {
		if ( LWJGLUtil.getPlatform() == Platform.MACOSX && !"1".equals(System.getenv().get("JAVA_STARTED_ON_FIRST_THREAD_" + getpid())) )
			throw new IllegalStateException("Please run the JVM with -XstartOnFirstThread.");
	}

	private EventLoop() {
	}

	public static void checkFirstThread() {
		// intentionally empty to trigger the static initializer
	}

}