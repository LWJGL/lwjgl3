/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 */
package org.lwjgl.system.macosx;

/** MacOX event loop utility class. */
public final class EventLoop {

	private EventLoop() {
	}

	/** Ensures that the Cocoa NSApplication event loop is running. */
	public static void initSharedApplication() {
		String type = System.getProperty("org.lwjgl.macosx.nsloop", "AWT");

		if ( "AWT".equals(type) )
			java.awt.Toolkit.getDefaultToolkit();
		else if ( "JFX".equals(type) ) {
			// TODO: Implement
			throw new UnsupportedOperationException("not implemented yet");
		} else if ( "NA".equals(type) ) {
			// don't start anything
		} else
			throw new IllegalStateException("Invalid NS event loop setting: " + type);
	}

}