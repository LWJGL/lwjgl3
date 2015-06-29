/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 */
package org.lwjgl.system.macosx;

import static org.lwjgl.system.macosx.Unistd.*;

/** MacOSX event loop utility class. */
public final class EventLoop {

	public static final boolean STARTED_ON_FIRST_THREAD =
		"1".equals(System.getenv().get("JAVA_STARTED_ON_FIRST_THREAD_" + getpid()));

	private EventLoop() {
	}

	public static void checkFirstThread() {
		if ( !STARTED_ON_FIRST_THREAD )
			throw new IllegalStateException("Please run the JVM with -XstartOnFirstThread.");
	}

}