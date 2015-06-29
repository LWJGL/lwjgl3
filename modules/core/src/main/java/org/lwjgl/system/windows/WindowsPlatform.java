/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 */
package org.lwjgl.system.windows;

import org.lwjgl.LWJGLUtil;
import org.lwjgl.system.Platform;

import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.windows.WinBase.*;

public class WindowsPlatform implements Platform {

	public WindowsPlatform() {
	}

	@Override
	public boolean has64Bit() {
		return true;
	}

	public static void windowsCheckHandle(long handle, String msg) {
		if ( handle == NULL )
			windowsThrowException(msg);
	}

	public static void windowsCheckResult(int result, String action) {
		if ( LWJGLUtil.DEBUG && result == 0 )
			throw new RuntimeException(action + " failed (error code = " + GetLastError() + ")");
	}

	public static void windowsThrowException(String msg) {
		throw new RuntimeException(msg + " (error code = " + GetLastError() + ")");
	}

}