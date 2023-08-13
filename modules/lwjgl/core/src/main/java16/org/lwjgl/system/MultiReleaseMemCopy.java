/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package org.lwjgl.system;

import static org.lwjgl.system.APIUtil.*;
import static org.lwjgl.system.MemoryUtil.*;

final class MultiReleaseMemCopy {

    static {
        apiLog("Java 16 memcpy enabled");
    }

    private MultiReleaseMemCopy() {
    }

    static void copy(long src, long dst, long bytes) {
        // Much better performance on Java 16+
        UNSAFE.copyMemory(null, src, null, dst, bytes);
    }

}