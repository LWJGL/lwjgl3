/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package org.lwjgl.system;

import java.lang.foreign.*;

import static org.lwjgl.system.APIUtil.*;
import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.MemoryUtil.*;

final class MemoryUtilTunables {

    private static final String PROPERTY_PATH = "java.lang.foreign.native.threshold.power.";

    private static final long NATIVE_THRESHOLD_FILL  = powerOfPropertyOr("fill", 5);
    private static final long VECTOR_THRESHOLD_FILL  = 1L << 14;
    private static final long VECTOR_THRESHOLD_BATCH = VECTOR_THRESHOLD_FILL - 1;

    private static final long NATIVE_THRESHOLD_COPY = powerOfPropertyOr("copy", 6);
    private static final long VECTOR_THRESHOLD_COPY = 1L << 14;

    private static final long FILL_PATTERN_64 = Long.divideUnsigned(-1L, 255L);

    static {
        apiLog("Java 25 memset/memcpy enabled");
    }

    private MemoryUtilTunables() {
    }

    private static long powerOfPropertyOr(String name, int defaultPower) {
        int power = Integer.getInteger(PROPERTY_PATH + name, defaultPower);
        return 1L << Math.clamp(power, 0, Integer.SIZE - 2);
    }

    /*
     Performance depends on -Djava.lang.foreign.native.threshold.power.fill=<PoT bytes> (default: 5)

     See memcpy for tuning details.
    */
    static void memset(long ptr, int value, long bytes) {
        var b = (byte)(value & 0xFF);

        if (bytes < NATIVE_THRESHOLD_FILL) {
            MemorySegment
                .ofAddress(ptr)
                .reinterpret(bytes)
                .fill(b);
        /*} else if (bytes < VECTOR_THRESHOLD_FILL) {
            memsetMid(ptr, b, bytes);*/
        } else {
            //memsetHigh(ptr, b, bytes);

            // Unsafe.setMemory fallback

            // On x64, setMemory has degraded performance with byte counts that are even.
            // Workaround by setting all but the last byte with setMemory, then setting the last byte separately.
            // Does not hurt on non-x64.
            var lastByteIndex = bytes - 1L;

            MemorySegment
                .ofAddress(ptr)
                .reinterpret(lastByteIndex + (bytes & 1L))
                .fill(b);

            // write (or re-write) last byte
            MemorySegment
                .ofAddress(ptr + lastByteIndex)
                .reinterpret(1L)
                .set(ValueLayout.JAVA_BYTE, 0L, b);
        }
    }

    private static void memsetMid(long ptr, byte b, long bytes) {
        var limit = (int)(bytes & (VECTOR_THRESHOLD_FILL - 1));

        var longValue = FILL_PATTERN_64 * b;

        var offset = 0;
        for (var aligned = limit & ~7; offset < aligned; offset += 8) {
            memPutLong(ptr + offset, longValue);
        }

        if (offset < (limit & ~3)) {
            memPutInt(ptr + offset, (int)longValue);
            offset += 4;
        }

        if (offset < (limit & ~1)) {
            memPutShort(ptr + offset, (short)longValue);
            offset += Short.BYTES;
        }

        if (offset < limit) {
            memPutByte(ptr + offset, b);
        }
    }

    private static void memsetHigh(long ptr, byte b, long bytes) {
        var longValue = FILL_PATTERN_64 * b;

        var offset = 0;
        for (var aligned = bytes & ~7L; offset < aligned; offset += 8) {
            memPutLong(ptr + offset, longValue);
        }

        if (offset < (bytes & ~3)) {
            memPutInt(ptr + offset, (int)longValue);
            offset += 4;
        }

        if (offset < (bytes & ~1)) {
            memPutShort(ptr + offset, (short)longValue);
            offset += Short.BYTES;
        }

        if (offset < bytes) {
            memPutByte(ptr + offset, b);
        }
    }

    /*
     Performance depends on -Djava.lang.foreign.native.threshold.power.copy=<PoT bytes> (default: 6)

     This code is tuned for:

       * call sites with constant (at runtime) byte counts
       * call sites with variable byte counts

     Constant byte counts prefer a Java implementation that can be specialized by the JIT.
     Variable byte counts prefer the Unsafe::copyMemory intrinsic for consistent performance. A Java implementation would have to optimize for the worst
     case (high byte counts) and that hurts the common case (lower byte counts) too much.

     In practice, the JIT optimizes the Java implementation in 3 different modes:

       * Normal accesses, no safepoint polling. Best for small copies, roughly up to 1 << 6 bytes.
       * Normal accesses, with safepoint polling. Safepoints hurt a bit, but are necessary to avoid GC stalls. Used for copies roughly up to 1 << 14 bytes.
       * Vectorized accesses, with safepoint polling. Best for large copies.

     The implementation below currently supports JIT specialization only up to NATIVE_THRESHOLD_COPY bytes.
     Uncomment the withSafepoint and withVectorization paths to test the other modes.
     Also note that client-side Java implementations cannot really compete with the JDK, which has lower unsafe access (ScopedMemoryAccess).

     TODO: re-evaluate in future JDKs
     JDK 25: up to NATIVE_THRESHOLD_COPY inlines nicely, optimization suffers after that.
     JDK 26: massively improved loop unrolling + autovectorization for constant call sites, but Unsafe remains competitive for variable call sites.
    */
    static void memcpy(long src, long dst, long bytes) {
        if (bytes < NATIVE_THRESHOLD_COPY) {
            var S = MemorySegment.ofAddress(src).reinterpret(bytes);
            var D = MemorySegment.ofAddress(dst).reinterpret(bytes);

            D.copyFrom(S);
        /*} else if (bytes < VECTOR_THRESHOLD_COPY) {
            memcpyMid(src, dst, bytes);*/
        } else {
            //memcpyHigh(src, dst, bytes);

            // Unsafe.copyMemory fallback

            // On x64, copyMemory has degraded performance with byte counts that are multiple of 4.
            // Workaround by copying all but the last byte with copyMemory, then copying the last byte separately.
            // Does not hurt on non-x64.
            var lastByteIndex = bytes - 1L;
            var copyBytes     = lastByteIndex + (bytes & 1L);

            var S = MemorySegment.ofAddress(src).reinterpret(copyBytes);
            var D = MemorySegment.ofAddress(dst).reinterpret(copyBytes);

            D.copyFrom(S);

            memPutByte(dst + lastByteIndex, memGetByte(src + lastByteIndex));
        }
    }

    private static void memcpyMid(long src, long dst, long bytes) {
        var limit = (int)(bytes & (VECTOR_THRESHOLD_COPY - 1));

        var offset = 0;
        for (var aligned = limit & ~7; offset < aligned; offset += 8) {
            memPutLong(dst + offset, memGetLong(src + offset));
        }

        // 0...0X00
        if (offset < (limit & ~3)) {
            memPutInt(dst + offset, memGetInt(src + offset));
            offset += 4;
        }

        // 0...00X0
        if (offset < (limit & ~1)) {
            memPutShort(dst + offset, memGetShort(src + offset));
            offset += 2;
        }

        // 0...000X
        if (offset < limit) {
            memPutByte(dst + offset, memGetByte(src + offset));
        }
    }

    private static void memcpyHigh(long src, long dst, long bytes) {
        var offset = 0L;
        for (var limit = (bytes & ~7L); offset < limit; offset += 8) {
            memPutLong(dst + offset, memGetLong(src + offset));
        }

        // 0...0X00
        if (offset < (bytes & ~3L)) {
            memPutInt(dst + offset, memGetInt(src + offset));
            offset += 4;
        }

        // 0...00X0
        if (offset < (bytes & ~1L)) {
            memPutShort(dst + offset, memGetShort(src + offset));
            offset += 2;
        }

        // 0...000X
        if (offset < bytes) {
            memPutByte(dst + offset, memGetByte(src + offset));
        }
    }

    private static void memcpy(MemorySegment src, long dst, long offset, long bytes) {
        if (bytes < NATIVE_THRESHOLD_COPY) {
            var S = src.asSlice(offset, bytes);
            var D = MemorySegment.ofAddress(dst).reinterpret(bytes);

            D.copyFrom(S);
        } else {
            var lastByteIndex = bytes - 1L;
            var copyBytes     = lastByteIndex + (bytes & 1L);

            var S = src.asSlice(offset, copyBytes);
            var D = MemorySegment.ofAddress(dst).reinterpret(copyBytes);

            D.copyFrom(S);

            memPutByte(dst + lastByteIndex, src.get(ValueLayout.JAVA_BYTE, offset + lastByteIndex));
        }
    }
    static void memcpy(byte[] src, long dst, int offset, int size) {
        checkMemcpy(dst, offset, size, src.length);
        memcpy(MemorySegment.ofArray(src), dst, offset, size);
    }
    static void memcpy(short[] src, long dst, int offset, int size) {
        checkMemcpy(dst, offset, size, src.length);
        memcpy(MemorySegment.ofArray(src), dst, apiGetBytes(offset, 1), apiGetBytes(size, 1));
    }
    static void memcpy(int[] src, long dst, int offset, int size) {
        checkMemcpy(dst, offset, size, src.length);
        memcpy(MemorySegment.ofArray(src), dst, apiGetBytes(offset, 2), apiGetBytes(size, 2));
    }
    static void memcpy(long[] src, long dst, int offset, int size) {
        checkMemcpy(dst, offset, size, src.length);
        memcpy(MemorySegment.ofArray(src), dst, apiGetBytes(offset, 3), apiGetBytes(size, 3));
    }
    static void memcpy(float[] src, long dst, int offset, int size) {
        checkMemcpy(dst, offset, size, src.length);
        memcpy(MemorySegment.ofArray(src), dst, apiGetBytes(offset, 2), apiGetBytes(size, 2));
    }
    static void memcpy(double[] src, long dst, int offset, int size) {
        checkMemcpy(dst, offset, size, src.length);
        memcpy(MemorySegment.ofArray(src), dst, apiGetBytes(offset, 3), apiGetBytes(size, 3));
    }

    private static void memcpy(long src, MemorySegment dst, long offset, long bytes) {
        if (bytes < NATIVE_THRESHOLD_COPY) {
            var S = MemorySegment.ofAddress(src).reinterpret(bytes);
            var D = dst.asSlice(offset, bytes);

            D.copyFrom(S);
        } else {
            var lastByteIndex = bytes - 1L;
            var copyBytes     = lastByteIndex + (bytes & 1L);

            var S = MemorySegment.ofAddress(src).reinterpret(copyBytes);
            var D = dst.asSlice(offset, copyBytes);

            D.copyFrom(S);

            dst.set(ValueLayout.JAVA_BYTE, offset + lastByteIndex, memGetByte(src + lastByteIndex));
        }
    }
    static void memcpy(long src, byte[] dst, int offset, int size) {
        checkMemcpy(src, offset, size, dst.length);
        memcpy(src, MemorySegment.ofArray(dst), offset, size);
    }
    static void memcpy(long src, short[] dst, int offset, int size) {
        checkMemcpy(src, offset, size, dst.length);
        memcpy(src, MemorySegment.ofArray(dst), apiGetBytes(offset, 1), apiGetBytes(size, 1));
    }
    static void memcpy(long src, int[] dst, int offset, int size) {
        checkMemcpy(src, offset, size, dst.length);
        memcpy(src, MemorySegment.ofArray(dst), apiGetBytes(offset, 2), apiGetBytes(size, 2));
    }
    static void memcpy(long src, long[] dst, int offset, int size) {
        checkMemcpy(src, offset, size, dst.length);
        memcpy(src, MemorySegment.ofArray(dst), apiGetBytes(offset, 3), apiGetBytes(size, 3));
    }
    static void memcpy(long src, float[] dst, int offset, int size) {
        checkMemcpy(src, offset, size, dst.length);
        memcpy(src, MemorySegment.ofArray(dst), apiGetBytes(offset, 2), apiGetBytes(size, 2));
    }
    static void memcpy(long src, double[] dst, int offset, int size) {
        checkMemcpy(src, offset, size, dst.length);
        memcpy(src, MemorySegment.ofArray(dst), apiGetBytes(offset, 3), apiGetBytes(size, 3));
    }

}