/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package org.lwjgl.system;

import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.Pointer.*;
import static org.lwjgl.system.libc.LibCString.*;

/** Multi-release backend for memset & memcpy. */
final class MemoryUtilTunables {

    private static final int  FILL_PATTERN_32 = Integer.divideUnsigned(-1, 255);
    private static final long FILL_PATTERN_64 = Long.divideUnsigned(-1L, 255L);

    private MemoryUtilTunables() {
    }

    static void memset(long ptr, int value, long bytes) {
        /*
        - Unsafe.setMemory is very slow.
        - A custom Java loop is fastest at small sizes, approximately up to 256 bytes.
        - The native memset becomes fastest at bigger sizes, when the JNI overhead becomes negligible.
         */
        if (bytes < 256L) {
            int p = (int)ptr;
            if (BITS64) {
                if ((p & 7) == 0) {
                    memset64(ptr, value, bytes);
                    return;
                }
            } else {
                if ((p & 3) == 0) {
                    memset32(p, value, bytes);
                    return;
                }
            }
        }
        nmemset(ptr, value, bytes);
    }

    private static void memset64(long ptr, int value, long bytes) {
        int limit = (int)bytes & 0xFF;

        long l = (value & 0xFF) * FILL_PATTERN_64;

        int offset = 0;

        // Aligned body
        for (int aligned = limit & ~7; offset < aligned; offset += 8) {
            UNSAFE.putLong(null, ptr + offset, l);
        }

        // Unaligned tail
        if (offset < (limit & ~3)) {
            UNSAFE.putInt(null, ptr + offset, (int)l);
            offset += 4;
        }

        if (offset < (limit & ~1)) {
            UNSAFE.putShort(null, ptr + offset, (short)l);
            offset += 2;
        }

        if (offset < limit) {
            UNSAFE.putByte(null, ptr + offset, (byte)l);
        }
    }

    private static void memset32(int ptr, int value, long bytes) {
        int limit = (int)bytes & 0xFF;

        int i = (value & 0xFF) * FILL_PATTERN_32;

        int offset = 0;

        // Aligned body
        for (int aligned = limit & ~3; offset < aligned; offset += 4) {
            UNSAFE.putInt(null, Integer.toUnsignedLong(ptr + offset), i);
        }

        // Unaligned tail
        if (offset < (limit & ~1)) {
            UNSAFE.putShort(null, Integer.toUnsignedLong(ptr + offset), (short)i);
            offset += 2;
        }

        if (offset < limit) {
            UNSAFE.putByte(null, Integer.toUnsignedLong(ptr + offset), (byte)i);
        }
    }

    static void memcpy(long src, long dst, long bytes) {
        if (bytes <= 160L) {
            // A custom Java loop is fastest at small sizes, approximately up to 160 bytes.
            if (BITS64 && ((src | dst) & 7L) == 0L) {
                // both src and dst are aligned to 8 bytes
                memcpyAligned64(src, dst, bytes);
            } else {
                // Unaligned fallback. Poor performance until Java 16.
                UNSAFE.copyMemory(null, src, null, dst, bytes);
            }
            return;
        }

        // Fastest at bigger sizes, when the JNI overhead becomes negligible.
        nmemcpy(dst, src, bytes);
    }

    private static void memcpyAligned64(long src, long dst, long bytes) {
        int limit = (int)bytes & 0xFF;

        // Aligned body
        int offset = 0;
        for (int aligned = limit & ~7; offset < aligned; offset += 8) {
            UNSAFE.putLong(null, dst + offset, UNSAFE.getLong(null, src + offset));
        }

        // Unaligned tail
        if (offset < (limit & ~3)) {
            UNSAFE.putInt(null, dst + offset, UNSAFE.getInt(null, src + offset));
            offset += 4;
        }

        if (offset < (limit & ~1)) {
            UNSAFE.putShort(null, dst + offset, UNSAFE.getShort(null, src + offset));
            offset += 2;
        }

        if (offset < limit) {
            UNSAFE.putByte(null, dst + offset, UNSAFE.getByte(null, src + offset));
        }
    }

}
