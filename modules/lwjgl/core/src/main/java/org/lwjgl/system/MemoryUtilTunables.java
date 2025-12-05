/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package org.lwjgl.system;

import static org.lwjgl.system.APIUtil.*;
import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.Pointer.*;
import static org.lwjgl.system.libc.LibCString.*;
import static sun.misc.Unsafe.*;

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
        // A custom Java loop is fastest at small sizes, approximately up to 160 bytes.
        if (BITS64 && bytes <= 160L && ((src | dst) & 7L) == 0L) {
            // both src and dst are aligned to 8 bytes
            memcpyAligned64(src, dst, bytes);
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

    private static final long BASE_OFFSET_BYTE   = Integer.toUnsignedLong(ARRAY_BYTE_BASE_OFFSET);
    private static final long BASE_OFFSET_SHORT  = Integer.toUnsignedLong(ARRAY_SHORT_BASE_OFFSET);
    private static final long BASE_OFFSET_INT    = Integer.toUnsignedLong(ARRAY_INT_BASE_OFFSET);
    private static final long BASE_OFFSET_LONG   = Integer.toUnsignedLong(ARRAY_LONG_BASE_OFFSET);
    private static final long BASE_OFFSET_FLOAT  = Integer.toUnsignedLong(ARRAY_FLOAT_BASE_OFFSET);
    private static final long BASE_OFFSET_DOUBLE = Integer.toUnsignedLong(ARRAY_DOUBLE_BASE_OFFSET);

    static void memcpy(byte[] src, long dst, int offset, int size) {
        checkMemcpy(dst, offset, size, src.length);
        UNSAFE.copyMemory(src, BASE_OFFSET_BYTE + offset, null, dst, size);
    }
    static void memcpy(short[] src, long dst, int offset, int size) {
        checkMemcpy(dst, offset, size, src.length);
        UNSAFE.copyMemory(src, BASE_OFFSET_SHORT + apiGetBytes(offset, 1), null, dst, apiGetBytes(size, 1));
    }
    static void memcpy(int[] src, long dst, int offset, int size) {
        checkMemcpy(dst, offset, size, src.length);
        UNSAFE.copyMemory(src, BASE_OFFSET_INT + apiGetBytes(offset, 2), null, dst, apiGetBytes(size, 2));
    }
    static void memcpy(long[] src, long dst, int offset, int size) {
        checkMemcpy(dst, offset, size, src.length);
        UNSAFE.copyMemory(src, BASE_OFFSET_LONG + apiGetBytes(offset, 3), null, dst, apiGetBytes(size, 3));
    }
    static void memcpy(float[] src, long dst, int offset, int size) {
        checkMemcpy(dst, offset, size, src.length);
        UNSAFE.copyMemory(src, BASE_OFFSET_FLOAT + apiGetBytes(offset, 2), null, dst, apiGetBytes(size, 2));
    }
    static void memcpy(double[] src, long dst, int offset, int size) {
        checkMemcpy(dst, offset, size, src.length);
        UNSAFE.copyMemory(src, BASE_OFFSET_DOUBLE + apiGetBytes(offset, 3), null, dst, apiGetBytes(size, 3));
    }

    static void memcpy(long src, byte[] dst, int offset, int size) {
        checkMemcpy(src, offset, size, dst.length);
        UNSAFE.copyMemory(null, src, dst, BASE_OFFSET_BYTE + offset, size);
    }
    static void memcpy(long src, short[] dst, int offset, int size) {
        checkMemcpy(src, offset, size, dst.length);
        UNSAFE.copyMemory(null, src, dst, BASE_OFFSET_SHORT + apiGetBytes(offset, 1), apiGetBytes(size, 1));
    }
    static void memcpy(long src, int[] dst, int offset, int size) {
        checkMemcpy(src, offset, size, dst.length);
        UNSAFE.copyMemory(null, src, dst, BASE_OFFSET_INT + apiGetBytes(offset, 2), apiGetBytes(size, 2));
    }
    static void memcpy(long src, long[] dst, int offset, int size) {
        checkMemcpy(src, offset, size, dst.length);
        UNSAFE.copyMemory(null, src, dst, BASE_OFFSET_LONG + apiGetBytes(offset, 3), apiGetBytes(size, 3));
    }
    static void memcpy(long src, float[] dst, int offset, int size) {
        checkMemcpy(src, offset, size, dst.length);
        UNSAFE.copyMemory(null, src, dst, BASE_OFFSET_FLOAT + apiGetBytes(offset, 2), apiGetBytes(size, 2));
    }
    static void memcpy(long src, double[] dst, int offset, int size) {
        checkMemcpy(src, offset, size, dst.length);
        UNSAFE.copyMemory(null, src, dst, BASE_OFFSET_DOUBLE + apiGetBytes(offset, 3), apiGetBytes(size, 3));
    }

}