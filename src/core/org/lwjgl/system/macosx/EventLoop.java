/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 */
package org.lwjgl.system.macosx;

import static org.lwjgl.system.macosx.Unistd.*;

/** MacOX event loop utility class. */
public final class EventLoop {

	public static final boolean STARTED_ON_FIRST_THREAD =
		"1".equals(System.getenv().get("JAVA_STARTED_ON_FIRST_THREAD_" + getpid()));

	private EventLoop() {
	}

	/** Ensures that the Cocoa NSApplication event loop is running. */
	public static void initSharedApplication() {
		String type = System.getProperty("org.lwjgl.macosx.nsloop", STARTED_ON_FIRST_THREAD ? "NA" : "AWT");

		if ( "AWT".equals(type) ) {
			java.awt.Toolkit.getDefaultToolkit();
		} else if ( "JFX".equals(type) ) { // TODO: Implement
			throw new UnsupportedOperationException("not implemented yet");
		} else if ( "NA".equals(type) ) {// don't start anything

		} else {
			throw new IllegalStateException("Invalid NS event loop setting: " + type);
		}
	}

}