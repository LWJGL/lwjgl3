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

final class MemoryUtilTunables {

    private static final int  FILL_PATTERN_32 = Integer.divideUnsigned(-1, 255);
    private static final long FILL_PATTERN_64 = Long.divideUnsigned(-1L, 255L);

    static {
        apiLog("Java 17 memcpy enabled");
    }

    private MemoryUtilTunables() {
    }

    static void memset(long ptr, int value, long bytes) {
        /*
        - Unsafe.setMemory is very slow.
        - A custom Java loop is fastest at small sizes, approximately up to 256 bytes.
        - The native memset becomes fastest at bigger sizes, when the JNI overhead becomes negligible.
         */
        if (bytes < 256L) {
            var p = (int)ptr;
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
        var limit = (int)bytes & 0xFF;

        var l = (value & 0xFF) * FILL_PATTERN_64;

        var offset = 0;

        // Aligned body
        for (var aligned = limit & ~7; offset < aligned; offset += 8) {
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
        var limit = (int)bytes & 0xFF;

        var i = (value & 0xFF) * FILL_PATTERN_32;

        var offset = 0;

        // Aligned body
        for (var aligned = limit & ~3; offset < aligned; offset += 4) {
            UNSAFE.putInt(null, (ptr + offset) & 0xFFFF_FFFFL, i);
        }

        // Unaligned tail
        if (offset < (limit & ~1)) {
            UNSAFE.putShort(null, ptr + offset, (short)i);
            offset += 2;
        }

        if (offset < limit) {
            UNSAFE.putByte(null, ptr + offset, (byte)i);
        }
    }

    static void memcpy(long src, long dst, long bytes) {
        // Much better performance on Java 16+
        //UNSAFE.copyMemory(null, src, null, dst, bytes);

        // On x64, copyMemory has degraded performance with byte counts that are multiple of 4.
        // Workaround by copying all but the last byte with copyMemory, then copying the last byte separately.
        // Does not hurt on non-x64.
        if (bytes <= 0L) {
            return;
        }

        var lastByteIndex = bytes - 1L;
        UNSAFE.copyMemory(null, src, null, dst, lastByteIndex + (bytes & 1L));
        UNSAFE.putByte(null, dst + lastByteIndex, UNSAFE.getByte(null, src + lastByteIndex));
    }

    private static final long BASE_OFFSET_BYTE   = Integer.toUnsignedLong(ARRAY_BYTE_BASE_OFFSET);
    private static final long BASE_OFFSET_SHORT  = Integer.toUnsignedLong(ARRAY_SHORT_BASE_OFFSET);
    private static final long BASE_OFFSET_INT    = Integer.toUnsignedLong(ARRAY_INT_BASE_OFFSET);
    private static final long BASE_OFFSET_LONG   = Integer.toUnsignedLong(ARRAY_LONG_BASE_OFFSET);
    private static final long BASE_OFFSET_FLOAT  = Integer.toUnsignedLong(ARRAY_FLOAT_BASE_OFFSET);
    private static final long BASE_OFFSET_DOUBLE = Integer.toUnsignedLong(ARRAY_DOUBLE_BASE_OFFSET);

    private static void memcpy(Object src, long dst, long srcOffset, long bytes) {
        if (bytes <= 0L) {
            return;
        }

        var lastByteIndex = bytes - 1L;

        UNSAFE.copyMemory(src, srcOffset, null, dst, lastByteIndex + (bytes & 1L));
        UNSAFE.putByte(null, dst + lastByteIndex, UNSAFE.getByte(src, srcOffset + lastByteIndex));
    }
    static void memcpy(byte[] src, long dst, int offset, int size) {
        checkMemcpy(dst, offset, size, src.length);
        memcpy(src, dst, BASE_OFFSET_BYTE + offset, size);
    }
    static void memcpy(short[] src, long dst, int offset, int size) {
        checkMemcpy(dst, offset, size, src.length);
        memcpy(src, dst, BASE_OFFSET_SHORT + apiGetBytes(offset, 1), apiGetBytes(size, 1));
    }
    static void memcpy(int[] src, long dst, int offset, int size) {
        checkMemcpy(dst, offset, size, src.length);
        memcpy(src, dst, BASE_OFFSET_INT + apiGetBytes(offset, 2), apiGetBytes(size, 2));
    }
    static void memcpy(long[] src, long dst, int offset, int size) {
        checkMemcpy(dst, offset, size, src.length);
        memcpy(src, dst, BASE_OFFSET_LONG + apiGetBytes(offset, 3), apiGetBytes(size, 3));
    }
    static void memcpy(float[] src, long dst, int offset, int size) {
        checkMemcpy(dst, offset, size, src.length);
        memcpy(src, dst, BASE_OFFSET_FLOAT + apiGetBytes(offset, 2), apiGetBytes(size, 2));
    }
    static void memcpy(double[] src, long dst, int offset, int size) {
        checkMemcpy(dst, offset, size, src.length);
        memcpy(src, dst, BASE_OFFSET_DOUBLE + apiGetBytes(offset, 3), apiGetBytes(size, 3));
    }

    private static void memcpy(long src, Object dst, long dstOffset, long bytes) {
        if (bytes <= 0L) {
            return;
        }

        var lastByteIndex = bytes - 1L;

        UNSAFE.copyMemory(null, src, dst, dstOffset, lastByteIndex + (bytes & 1L));
        UNSAFE.putByte(dst, dstOffset + lastByteIndex, UNSAFE.getByte(null, src + lastByteIndex));
    }
    static void memcpy(long src, byte[] dst, int offset, int size) {
        checkMemcpy(src, offset, size, dst.length);
        memcpy(src, dst, BASE_OFFSET_BYTE + offset, size);
    }
    static void memcpy(long src, short[] dst, int offset, int size) {
        checkMemcpy(src, offset, size, dst.length);
        memcpy(src, dst, BASE_OFFSET_SHORT + apiGetBytes(offset, 1), apiGetBytes(size, 1));
    }
    static void memcpy(long src, int[] dst, int offset, int size) {
        checkMemcpy(src, offset, size, dst.length);
        memcpy(src, dst, BASE_OFFSET_INT + apiGetBytes(offset, 2), apiGetBytes(size, 2));
    }
    static void memcpy(long src, long[] dst, int offset, int size) {
        checkMemcpy(src, offset, size, dst.length);
        memcpy(src, dst, BASE_OFFSET_LONG + apiGetBytes(offset, 3), apiGetBytes(size, 3));
    }
    static void memcpy(long src, float[] dst, int offset, int size) {
        checkMemcpy(src, offset, size, dst.length);
        memcpy(src, dst, BASE_OFFSET_FLOAT + apiGetBytes(offset, 2), apiGetBytes(size, 2));
    }
    static void memcpy(long src, double[] dst, int offset, int size) {
        checkMemcpy(src, offset, size, dst.length);
        memcpy(src, dst, BASE_OFFSET_DOUBLE + apiGetBytes(offset, 3), apiGetBytes(size, 3));
    }

}