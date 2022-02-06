/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package org.lwjgl.system;

import static org.lwjgl.system.APIUtil.*;
import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.Pointer.*;

final class MultiReleaseMemCopy {

    static {
        apiLog("Java 10 memcpy enabled");
    }

    private MultiReleaseMemCopy() {
    }

    static void copy(long src, long dst, long bytes) {
        if (bytes < 64) {
            // A custom Java loop is fastest at small sizes, approximately up to 64 bytes.
            int s = (int)src;
            int d = (int)dst;
            if (BITS64) {
                if ((s & 7) == 0 && (d & 7) == 0) { // both src and dst must be aligned to 8 bytes
                    memCopyAligned64(src, dst, (int)bytes & 0x3F);
                    return;
                }
            } else {
                if ((s & 3) == 0 && (d & 3) == 0) { // both src and dst must be aligned to 8 bytes
                    memCopyAligned32(s, d, (int)bytes & 0x3F);
                    return;
                }
            }
        }

        // Much better performance on Java 10+
        UNSAFE.copyMemory(null, src, null, dst, bytes);
    }

}
