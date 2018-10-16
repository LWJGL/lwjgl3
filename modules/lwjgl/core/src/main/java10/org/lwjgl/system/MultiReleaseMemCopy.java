/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package org.lwjgl.system;

import static org.lwjgl.system.APIUtil.*;
import static org.lwjgl.system.MemoryUtil.*;

final class MultiReleaseMemCopy {

    static {
        apiLog("Java 10 memcpy enabled");
    }

    private MultiReleaseMemCopy() {
    }

    static void copy(long src, long dst, long bytes) {
        // A custom Java loop is fastest at small sizes, approximately up to 64 bytes.
        if (bytes < 64 && ((int)src & 7) == 0 && ((int)dst & 7) == 0) { // both src and dst must be aligned to 8 bytes
            memCopyAligned(src, dst, (int)bytes & 0xFFFF_FFFF);
        } else {
            // Much better performance on Java 10+
            UNSAFE.copyMemory(src, dst, bytes);
        }
    }

}
