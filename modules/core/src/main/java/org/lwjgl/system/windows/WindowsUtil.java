/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 */
package org.lwjgl.system.windows;

import org.lwjgl.system.Checks;

import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.windows.WinBase.*;

public final class WindowsUtil {

	private WindowsUtil() {
	}

	public static void windowsCheckHandle(long handle, String msg) {
		if ( handle == NULL )
			windowsThrowException(msg);
	}

	public static void windowsCheckResult(int result, String action) {
		if ( Checks.DEBUG && result == 0 )
			throw new RuntimeException(action + " failed (error code = " + getLastError() + ")");
	}

	public static void windowsThrowException(String msg) {
		throw new RuntimeException(msg + " (error code = " + getLastError() + ")");
	}

}