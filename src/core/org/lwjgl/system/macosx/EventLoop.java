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

		switch ( type ) {
			case "AWT":
				java.awt.Toolkit.getDefaultToolkit();
				break;
			case "JFX":
				// TODO: Implement
				throw new UnsupportedOperationException("not implemented yet");
			case "NA":
				// don't start anything
				break;
			default:
				throw new IllegalStateException("Invalid NS event loop setting: " + type);
		}
	}

}