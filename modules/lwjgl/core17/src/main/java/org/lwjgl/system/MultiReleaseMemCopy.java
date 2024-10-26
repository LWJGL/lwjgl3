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
        apiLog("Java 17 memcpy enabled");
    }

    private MultiReleaseMemCopy() {
    }

    static void copy(long src, long dst, long bytes) {
        if (BITS64 && bytes <= 160) {
            // A custom Java loop is fastest at small sizes, approximately up to 160 bytes.
            if (((src | dst) & 7) == 0) {
                // both src and dst are aligned to 8 bytes
                memCopyAligned64(src, dst, (int)bytes & 0xFF);
                return;
            }
        }
        // Much better performance on Java 16+
        UNSAFE.copyMemory(null, src, null, dst, bytes);
    }

}