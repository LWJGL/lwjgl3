/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package org.lwjgl.system.windows;

import java.nio.*;

public final class WindowsUtil {

    private WindowsUtil() {
    }

    public static void windowsThrowException(String msg, IntBuffer GetLastError) {
        throw new RuntimeException(msg + " (error code = " + GetLastError.get(GetLastError.position()) + ")");
    }

}