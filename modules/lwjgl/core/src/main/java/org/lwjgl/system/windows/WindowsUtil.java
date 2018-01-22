/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package org.lwjgl.system.windows;

import static org.lwjgl.system.windows.WinBase.*;

public final class WindowsUtil {

    private WindowsUtil() {
    }

    public static void windowsThrowException(String msg) {
        throw new RuntimeException(msg + " (error code = " + getLastError() + ")");
    }

}