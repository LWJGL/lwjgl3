/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package org.lwjgl.system;

import javax.annotation.*;
import java.nio.*;

import static org.lwjgl.system.MemoryUtil.*;

public final class SharedLibraryUtil {

    private static native int getLibraryPath(long pLib, long sOut, int bufSize);

    @Nullable
    public static String getLibraryPath(long pLib) {
        int maxLen = 256;

        ByteBuffer buffer = memAlloc(maxLen);
        try {
            while (true) {
                int len = getLibraryPath(pLib, memAddress(buffer), maxLen);
                if (len == 0) {
                    return null;
                }
                if (len < maxLen) {
                    return memUTF8(buffer, len - 1); // drop the null-terminator
                }
                buffer = memRealloc(buffer, maxLen = maxLen * 3 / 2);
            }
        } finally {
            memFree(buffer);
        }
    }

}