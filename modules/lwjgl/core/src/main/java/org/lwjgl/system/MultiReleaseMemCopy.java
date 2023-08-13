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
        if (bytes <= 160) {
            // A custom Java loop is fastest at small sizes, approximately up to 160 bytes.
            if (BITS64 && ((src | dst) & 7) == 0) {
                // both src and dst are aligned to 8 bytes
                memCopyAligned64(src, dst, (int)bytes & 0xFF);
            } else {
                // Unaligned fallback. Poor performance until Java 16.
                UNSAFE.copyMemory(null, src, null, dst, bytes);
            }
            return;
        }

        // Fastest at bigger sizes, when the JNI overhead becomes negligible.
        nmemcpy(dst, src, bytes);
    }

}
