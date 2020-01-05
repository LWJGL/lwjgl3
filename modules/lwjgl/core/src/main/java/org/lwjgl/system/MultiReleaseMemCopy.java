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
            if (((int)src & 7) == 0 && ((int)dst & 7) == 0) { // both src and dst must be aligned to 8 bytes
                if (BITS64) {
                    memCopyAligned64(src, dst, (int)bytes & 0x1FF);
                } else {
                    memCopyAligned32((int)src, (int)dst, (int)bytes & 0x1FF);
                }
            } else {
                // Unaligned fallback. Poor performance until Java 10.
                UNSAFE.copyMemory(src, dst, bytes);
            }
        } else {
            // Fastest at bigger sizes, when the JNI overhead becomes negligible.
            nmemcpy(dst, src, bytes);
        }
    }

}
