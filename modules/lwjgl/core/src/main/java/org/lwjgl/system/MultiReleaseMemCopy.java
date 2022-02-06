/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package org.lwjgl.system;

import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.Pointer.*;
import static org.lwjgl.system.libc.LibCString.*;

final class MultiReleaseMemCopy {

    private MultiReleaseMemCopy() {
    }

    static void copy(long src, long dst, long bytes) {
        if (bytes < 384) {
            // A custom Java loop is fastest at small sizes, approximately up to 384 bytes.
            int s = (int)src;
            int d = (int)dst;
            if (BITS64) {
                if ((s & 7) == 0 && (d & 7) == 0) { // both src and dst must be aligned to 8 bytes
                    memCopyAligned64(src, dst, (int)bytes & 0x1FF);
                    return;
                }
            } else {
                if ((s & 3) == 0 && (d & 3) == 0) { // both src and dst must be aligned to 4 bytes
                    memCopyAligned32(s, d, (int)bytes & 0x1FF);
                    return;
                }
            }

            // Unaligned fallback. Poor performance until Java 10.
            UNSAFE.copyMemory(null, src, null, dst, bytes);
            return;
        }

        // Fastest at bigger sizes, when the JNI overhead becomes negligible.
        nmemcpy(dst, src, bytes);
    }

}
