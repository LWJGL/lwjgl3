/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 */
package org.lwjgl.system.windows;

import org.lwjgl.LWJGLUtil;
import org.lwjgl.system.Platform;

import static org.lwjgl.system.windows.WinBase.*;

public class WindowsPlatform implements Platform {

	public WindowsPlatform() {
	}

	public boolean has64Bit() {
		return true;
	}

	static void windowsCheckHandle(final long handle, final String msg) {
		if ( handle == 0 )
			windowsThrowException(msg);
	}

	static void windowsCheckResult(final int result, final String action) {
		if ( LWJGLUtil.DEBUG && result == 0 )
			throw new RuntimeException(action + " failed (error code = " + GetLastError() + ")");
	}

	static void windowsThrowException(final String msg) {
		throw new RuntimeException(msg + " (error code = " + GetLastError() + ")");
	}

}