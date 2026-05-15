/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package org.lwjgl.system;

import org.jspecify.annotations.*;

import java.lang.foreign.*;
import java.nio.*;

import static java.lang.Character.*;
import static java.nio.charset.StandardCharsets.*;
import static org.lwjgl.system.APIUtil.*;
import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.MemoryUtil.*;

@NullMarked
class MemoryBackendFFM implements MemoryBackend {

    private static final ByteOrder NATIVE_ORDER = ByteOrder.nativeOrder();

    protected static final ValueLayout.OfChar   JAVA_CHAR   = DEBUG ? ValueLayout.JAVA_CHAR : ValueLayout.JAVA_CHAR_UNALIGNED;
    protected static final ValueLayout.OfShort  JAVA_SHORT  = DEBUG ? ValueLayout.JAVA_SHORT : ValueLayout.JAVA_SHORT_UNALIGNED;
    protected static final ValueLayout.OfInt    JAVA_INT    = DEBUG ? ValueLayout.JAVA_INT : ValueLayout.JAVA_INT_UNALIGNED;
    protected static final ValueLayout.OfLong   JAVA_LONG   = DEBUG ? ValueLayout.JAVA_LONG : ValueLayout.JAVA_LONG_UNALIGNED;
    protected static final ValueLayout.OfFloat  JAVA_FLOAT  = DEBUG ? ValueLayout.JAVA_FLOAT : ValueLayout.JAVA_FLOAT_UNALIGNED;
    protected static final ValueLayout.OfDouble JAVA_DOUBLE = DEBUG ? ValueLayout.JAVA_DOUBLE : ValueLayout.JAVA_DOUBLE_UNALIGNED;
    protected static final AddressLayout        ADDRESS     = DEBUG ? ValueLayout.ADDRESS : ValueLayout.ADDRESS_UNALIGNED;

    protected static final MemorySegment VIRTUAL_MEMORY = MemorySegment
        .ofAddress(0L)
        .reinterpret(Long.MAX_VALUE);

    static {
        apiLog("MemoryUtil backend: FFM");
        apiLogMore("The FFM memory backend has lower performance than the alternatives. See Configuration::MEMORY_BACKEND for details.");
    }

    @Override public final boolean getBoolean(long ptr)                    { return VIRTUAL_MEMORY.get(ValueLayout.JAVA_BOOLEAN, ptr); }

    @Override public final byte getByte(long ptr)                          { return VIRTUAL_MEMORY.get(ValueLayout.JAVA_BYTE, ptr); }

    @Override public final char getChar(long ptr)                          { return VIRTUAL_MEMORY.get(JAVA_CHAR, ptr); }
    @Override public final char getCharUnaligned(long ptr)                 { return VIRTUAL_MEMORY.get(ValueLayout.JAVA_CHAR_UNALIGNED, ptr); }

    @Override public final short getShort(long ptr)                        { return VIRTUAL_MEMORY.get(JAVA_SHORT, ptr); }
    @Override public final short getShortUnaligned(long ptr)               { return VIRTUAL_MEMORY.get(ValueLayout.JAVA_SHORT_UNALIGNED, ptr); }

    @Override public final int getInt(long ptr)                            { return VIRTUAL_MEMORY.get(JAVA_INT, ptr); }
    @Override public final int getIntUnaligned(long ptr)                   { return VIRTUAL_MEMORY.get(ValueLayout.JAVA_INT_UNALIGNED, ptr); }

    @Override public final long getLong(long ptr)                          { return VIRTUAL_MEMORY.get(JAVA_LONG, ptr); }
    @Override public final long getLongUnaligned(long ptr)                 { return VIRTUAL_MEMORY.get(ValueLayout.JAVA_LONG_UNALIGNED, ptr); }

    @Override public final long getLong(byte[] o, long offset)             { return MemorySegment.ofArray(o).get(ValueLayout.JAVA_LONG_UNALIGNED, offset); }

    @Override public final float getFloat(long ptr)                        { return VIRTUAL_MEMORY.get(JAVA_FLOAT, ptr); }
    @Override public final float getFloatUnaligned(long ptr)               { return VIRTUAL_MEMORY.get(ValueLayout.JAVA_FLOAT_UNALIGNED, ptr); }

    @Override public final double getDouble(long ptr)                      { return VIRTUAL_MEMORY.get(JAVA_DOUBLE, ptr); }
    @Override public final double getDoubleUnaligned(long ptr)             { return VIRTUAL_MEMORY.get(ValueLayout.JAVA_DOUBLE_UNALIGNED, ptr); }

    @Override public long getCLong(long ptr)                               { return VIRTUAL_MEMORY.get(JAVA_LONG, ptr); }
    @Override public long getCLongUnaligned(long ptr)                      { return VIRTUAL_MEMORY.get(ValueLayout.JAVA_LONG_UNALIGNED, ptr); }

    @Override public long getAddress(long ptr)                             { return VIRTUAL_MEMORY.get(JAVA_LONG, ptr); }
    @Override public long getAddressUnaligned(long ptr)                    { return VIRTUAL_MEMORY.get(ValueLayout.JAVA_LONG_UNALIGNED, ptr); }

    @Override public final void putBoolean(long ptr, boolean value)        { VIRTUAL_MEMORY.set(ValueLayout.JAVA_BOOLEAN, ptr, value); }

    @Override public final void putByte(long ptr, byte value)              { VIRTUAL_MEMORY.set(ValueLayout.JAVA_BYTE, ptr, value); }

    @Override public final void putChar(long ptr, char value)              { VIRTUAL_MEMORY.set(JAVA_CHAR, ptr, value); }
    @Override public final void putCharUnaligned(long ptr, char value)     { VIRTUAL_MEMORY.set(ValueLayout.JAVA_CHAR_UNALIGNED, ptr, value); }

    @Override public final void putShort(long ptr, short value)            { VIRTUAL_MEMORY.set(JAVA_SHORT, ptr, value); }
    @Override public final void putShortUnaligned(long ptr, short value)   { VIRTUAL_MEMORY.set(ValueLayout.JAVA_SHORT_UNALIGNED, ptr, value); }

    @Override public final void putInt(long ptr, int value)                { VIRTUAL_MEMORY.set(JAVA_INT, ptr, value); }
    @Override public final void putIntUnaligned(long ptr, int value)       { VIRTUAL_MEMORY.set(ValueLayout.JAVA_INT_UNALIGNED, ptr, value); }

    @Override public final void putLong(long ptr, long value)              { VIRTUAL_MEMORY.set(JAVA_LONG, ptr, value); }
    @Override public final void putLongUnaligned(long ptr, long value)     { VIRTUAL_MEMORY.set(ValueLayout.JAVA_LONG_UNALIGNED, ptr, value); }

    @Override public final void putFloat(long ptr, float value)            { VIRTUAL_MEMORY.set(JAVA_FLOAT, ptr, value); }
    @Override public final void putFloatUnaligned(long ptr, float value)   { VIRTUAL_MEMORY.set(ValueLayout.JAVA_FLOAT_UNALIGNED, ptr, value); }

    @Override public final void putDouble(long ptr, double value)          { VIRTUAL_MEMORY.set(JAVA_DOUBLE, ptr, value); }
    @Override public final void putDoubleUnaligned(long ptr, double value) { VIRTUAL_MEMORY.set(ValueLayout.JAVA_DOUBLE_UNALIGNED, ptr, value); }

    @Override public void putCLong(long ptr, long value)                   { VIRTUAL_MEMORY.set(JAVA_LONG, ptr, value); }
    @Override public void putCLongUnaligned(long ptr, long value)          { VIRTUAL_MEMORY.set(ValueLayout.JAVA_LONG_UNALIGNED, ptr, value); }

    @Override public void putAddress(long ptr, long value)                 { VIRTUAL_MEMORY.set(JAVA_LONG, ptr, value); }
    @Override public void putAddressUnaligned(long ptr, long value)        { VIRTUAL_MEMORY.set(ValueLayout.JAVA_LONG_UNALIGNED, ptr, value); }

    @Override public final long getAddress0(Buffer buffer) {
        var elementShift = switch (buffer) {
            case ByteBuffer _ -> 0;
            case ShortBuffer _, CharBuffer _ -> 1;
            case IntBuffer _, FloatBuffer _ -> 2;
            default -> 3;
        };
        return MemorySegment.ofBuffer(buffer).address() - ((long)buffer.position() << elementShift);
    }
    @Override public final long getAddress0(ByteBuffer buffer)   { return MemorySegment.ofBuffer(buffer).address() - buffer.position(); }
    @Override public final long getAddress0(CharBuffer buffer)   { return MemorySegment.ofBuffer(buffer).address() - ((long)buffer.position() << 1); }
    @Override public final long getAddress0(ShortBuffer buffer)  { return MemorySegment.ofBuffer(buffer).address() - ((long)buffer.position() << 1); }
    @Override public final long getAddress0(IntBuffer buffer)    { return MemorySegment.ofBuffer(buffer).address() - ((long)buffer.position() << 2); }
    @Override public final long getAddress0(LongBuffer buffer)   { return MemorySegment.ofBuffer(buffer).address() - ((long)buffer.position() << 3); }
    @Override public final long getAddress0(FloatBuffer buffer)  { return MemorySegment.ofBuffer(buffer).address() - ((long)buffer.position() << 2); }
    @Override public final long getAddress0(DoubleBuffer buffer) { return MemorySegment.ofBuffer(buffer).address() - ((long)buffer.position() << 3); }

    private static long address(Buffer buffer, int position, int elementShift) {
        return MemorySegment.ofBuffer(buffer).address() + ((Integer.toUnsignedLong(position) - buffer.position()) << elementShift);
    }

    @Override public final long getAddress(Buffer buffer) { return MemorySegment.ofBuffer(buffer).address(); }
    @Override public final long getAddress(Buffer buffer, int position) {
        var elementShift = switch (buffer) {
            case ByteBuffer _ -> 0;
            case ShortBuffer _, CharBuffer _ -> 1;
            case IntBuffer _, FloatBuffer _ -> 2;
            default -> 3;
        };
        return address(buffer, position, elementShift);
    }

    @Override public final long getAddress(ByteBuffer buffer)                 { return MemorySegment.ofBuffer(buffer).address(); }
    @Override public final long getAddress(ByteBuffer buffer, int position)   { return MemorySegment.ofBuffer(buffer).address() + (Integer.toUnsignedLong(position) - buffer.position()); }

    @Override public final long getAddress(CharBuffer buffer)                 { return MemorySegment.ofBuffer(buffer).address(); }
    @Override public final long getAddress(CharBuffer buffer, int position)   { return address(buffer, position, 1); }

    @Override public final long getAddress(ShortBuffer buffer)                { return MemorySegment.ofBuffer(buffer).address(); }
    @Override public final long getAddress(ShortBuffer buffer, int position)  { return address(buffer, position, 1); }

    @Override public final long getAddress(IntBuffer buffer)                  { return MemorySegment.ofBuffer(buffer).address(); }
    @Override public final long getAddress(IntBuffer buffer, int position)    { return address(buffer, position, 2); }

    @Override public final long getAddress(LongBuffer buffer)                 { return MemorySegment.ofBuffer(buffer).address(); }
    @Override public final long getAddress(LongBuffer buffer, int position)   { return address(buffer, position, 3); }

    @Override public final long getAddress(FloatBuffer buffer)                { return MemorySegment.ofBuffer(buffer).address(); }
    @Override public final long getAddress(FloatBuffer buffer, int position)  { return address(buffer, position, 2); }

    @Override public final long getAddress(DoubleBuffer buffer)               { return MemorySegment.ofBuffer(buffer).address(); }
    @Override public final long getAddress(DoubleBuffer buffer, int position) { return address(buffer, position, 3); }

    @Override public final ByteBuffer wrapBufferByte(long address, int capacity) {
        return VIRTUAL_MEMORY
            .asSlice(address, capacity)
            .asByteBuffer()
            .order(NATIVE_ORDER);
    }
    private static ByteBuffer wrapBufferByte(long address, long capacity) {
        return VIRTUAL_MEMORY
            .asSlice(address, capacity)
            .asByteBuffer()
            .order(NATIVE_ORDER);
    }
    @Override public final ShortBuffer wrapBufferShort(long address, int capacity)   { return wrapBufferByte(address, Integer.toUnsignedLong(capacity) << 1).asShortBuffer(); }
    @Override public final CharBuffer wrapBufferChar(long address, int capacity)     { return wrapBufferByte(address, Integer.toUnsignedLong(capacity) << 1).asCharBuffer(); }
    @Override public final IntBuffer wrapBufferInt(long address, int capacity)       { return wrapBufferByte(address, Integer.toUnsignedLong(capacity) << 2).asIntBuffer(); }
    @Override public final LongBuffer wrapBufferLong(long address, int capacity)     { return wrapBufferByte(address, Integer.toUnsignedLong(capacity) << 3).asLongBuffer(); }
    @Override public final FloatBuffer wrapBufferFloat(long address, int capacity)   { return wrapBufferByte(address, Integer.toUnsignedLong(capacity) << 2).asFloatBuffer(); }
    @Override public final DoubleBuffer wrapBufferDouble(long address, int capacity) { return wrapBufferByte(address, Integer.toUnsignedLong(capacity) << 3).asDoubleBuffer(); }

    @Override public final ByteBuffer duplicate(ByteBuffer buffer)                   { return buffer.duplicate().order(buffer.order()); }
    @Override public final ShortBuffer duplicate(ShortBuffer buffer)                 { return buffer.duplicate(); }
    @Override public final CharBuffer duplicate(CharBuffer buffer)                   { return buffer.duplicate(); }
    @Override public final IntBuffer duplicate(IntBuffer buffer)                     { return buffer.duplicate(); }
    @Override public final LongBuffer duplicate(LongBuffer buffer)                   { return buffer.duplicate(); }
    @Override public final FloatBuffer duplicate(FloatBuffer buffer)                 { return buffer.duplicate(); }
    @Override public final DoubleBuffer duplicate(DoubleBuffer buffer)               { return buffer.duplicate(); }

    @Override public final ByteBuffer slice(ByteBuffer buffer)                       { return buffer.slice().order(buffer.order()); }
    @Override public final ByteBuffer slice(ByteBuffer buffer, int offset, int length) {
        var position = buffer.position() + offset;
        if ((offset | position) < 0 || buffer.limit() < position) {
            throw new IllegalArgumentException();
        }
        if (length < 0 || buffer.capacity() - position < length) {
            throw new IllegalArgumentException();
        }
        return buffer
            .duplicate()
            .limit(buffer.capacity())
            .slice(position, length)
            .order(buffer.order());
    }

    @Override public final CharBuffer slice(CharBuffer buffer) { return buffer.slice(); }
    @Override public final CharBuffer slice(CharBuffer buffer, int offset, int length) {
        var position = buffer.position() + offset;
        if ((offset | position) < 0 || buffer.limit() < position) {
            throw new IllegalArgumentException();
        }
        if (length < 0 || buffer.capacity() - position < length) {
            throw new IllegalArgumentException();
        }
        return buffer
            .duplicate()
            .limit(buffer.capacity())
            .slice(position, length);
    }

    @Override public final ShortBuffer slice(ShortBuffer buffer) { return buffer.slice(); }
    @Override public final ShortBuffer slice(ShortBuffer buffer, int offset, int length) {
        var position = buffer.position() + offset;
        if ((offset | position) < 0 || buffer.limit() < position) {
            throw new IllegalArgumentException();
        }
        if (length < 0 || buffer.capacity() - position < length) {
            throw new IllegalArgumentException();
        }
        return buffer
            .duplicate()
            .limit(buffer.capacity())
            .slice(position, length);
    }

    @Override public final IntBuffer slice(IntBuffer buffer) { return buffer.slice(); }
    @Override public final IntBuffer slice(IntBuffer buffer, int offset, int length) {
        var position = buffer.position() + offset;
        if ((offset | position) < 0 || buffer.limit() < position) {
            throw new IllegalArgumentException();
        }
        if (length < 0 || buffer.capacity() - position < length) {
            throw new IllegalArgumentException();
        }
        return buffer
            .duplicate()
            .limit(buffer.capacity())
            .slice(position, length);
    }

    @Override public final LongBuffer slice(LongBuffer buffer) { return buffer.slice(); }
    @Override public final LongBuffer slice(LongBuffer buffer, int offset, int length) {
        var position = buffer.position() + offset;
        if ((offset | position) < 0 || buffer.limit() < position) {
            throw new IllegalArgumentException();
        }
        if (length < 0 || buffer.capacity() - position < length) {
            throw new IllegalArgumentException();
        }
        return buffer
            .duplicate()
            .limit(buffer.capacity())
            .slice(position, length);
    }

    @Override public final FloatBuffer slice(FloatBuffer buffer) { return buffer.slice(); }
    @Override public final FloatBuffer slice(FloatBuffer buffer, int offset, int length) {
        var position = buffer.position() + offset;
        if ((offset | position) < 0 || buffer.limit() < position) {
            throw new IllegalArgumentException();
        }
        if (length < 0 || buffer.capacity() - position < length) {
            throw new IllegalArgumentException();
        }
        return buffer
            .duplicate()
            .limit(buffer.capacity())
            .slice(position, length);
    }

    @Override public final DoubleBuffer slice(DoubleBuffer buffer) { return buffer.slice(); }
    @Override public final DoubleBuffer slice(DoubleBuffer buffer, int offset, int length) {
        var position = buffer.position() + offset;
        if ((offset | position) < 0 || buffer.limit() < position) {
            throw new IllegalArgumentException();
        }
        if (length < 0 || buffer.capacity() - position < length) {
            throw new IllegalArgumentException();
        }
        return buffer
            .duplicate()
            .limit(buffer.capacity())
            .slice(position, length);
    }

    private static final String PROPERTY_PATH = "java.lang.foreign.native.threshold.power.";

    private static final long NATIVE_THRESHOLD_FILL  = powerOfPropertyOr("fill", 5);
    private static final long VECTOR_THRESHOLD_FILL  = 1L << 14;
    private static final long VECTOR_THRESHOLD_BATCH = VECTOR_THRESHOLD_FILL - 1;

    private static final long NATIVE_THRESHOLD_COPY = powerOfPropertyOr("copy", 6);
    private static final long VECTOR_THRESHOLD_COPY = 1L << 14;

    private static final long FILL_PATTERN_64 = Long.divideUnsigned(-1L, 255L);

    private static long powerOfPropertyOr(String name, int defaultPower) {
        int power = Integer.getInteger(PROPERTY_PATH + name, defaultPower);
        return 1L << Math.clamp(power, 0, Integer.SIZE - 2);
    }

    /*
     Performance depends on -Djava.lang.foreign.native.threshold.power.fill=<PoT bytes> (default: 5)

     See memcpy for tuning details.
    */
    @Override public final void memset(long ptr, int value, long bytes) {
        if (bytes == 0L) {
            return;
        }

        var b = (byte)(value & 0xFF);

        /*if (bytes < NATIVE_THRESHOLD_FILL) {
            MemorySegment
            .ofAddress(ptr)
            .reinterpret(bytes)
            //VIRTUAL_MEMORY.asSlice(ptr, bytes)
                .fill(b);
            //memsetMid(ptr, b, bytes);
        } else if (bytes < VECTOR_THRESHOLD_FILL) {
            memsetMid(ptr, b, bytes);
        } else {*/
        //memsetHigh(ptr, b, bytes);

        // Unsafe.setMemory fallback

        // On x64, setMemory has degraded performance with byte counts that are even.
        // Workaround by setting all but the last byte with setMemory, then setting the last byte separately.
        // Does not hurt on non-x64.
        var lastByteIndex = bytes - 1L;

        //MemorySegment
        //.ofAddress(ptr)
        //.reinterpret(lastByteIndex + (bytes & 1L))
        VIRTUAL_MEMORY.asSlice(ptr, lastByteIndex + (bytes & 1L))
            .fill(b);

        // write (or re-write) last byte
        //MemorySegment
        //.ofAddress(ptr + lastByteIndex)
        //.reinterpret(1L)
        VIRTUAL_MEMORY//.asSlice(ptr + lastByteIndex, 1L)
            .set(ValueLayout.JAVA_BYTE, ptr + lastByteIndex, b);

        //}
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
    @Override public final void memcpy(long src, long dst, long bytes) {
        if (bytes == 0L) {
            return;
        }

        /*if (bytes < NATIVE_THRESHOLD_COPY) {
            //var S = MemorySegment.ofAddress(src).reinterpret(bytes);
            //var D = MemorySegment.ofAddress(dst).reinterpret(bytes);
            var S = VIRTUAL_MEMORY.asSlice(src, bytes);
            var D = VIRTUAL_MEMORY.asSlice(dst, bytes);

            D.copyFrom(S);
        } else if (bytes < VECTOR_THRESHOLD_COPY) {
            memcpyMid(src, dst, bytes);
        } else {*/
        //memcpyHigh(src, dst, bytes);

        // Unsafe.copyMemory fallback

        // On x64, copyMemory has degraded performance with byte counts that are multiple of 4.
        // Workaround by copying all but the last byte with copyMemory, then copying the last byte separately.
        // Does not hurt on non-x64.
        var lastByteIndex = bytes - 1L;
        var copyBytes     = lastByteIndex + (bytes & 1L);

        //var S = MemorySegment.ofAddress(src).reinterpret(copyBytes);
        //var D = MemorySegment.ofAddress(dst).reinterpret(copyBytes);
        var S = VIRTUAL_MEMORY.asSlice(src, copyBytes);
        var D = VIRTUAL_MEMORY.asSlice(dst, copyBytes);

        D.copyFrom(S);

        VIRTUAL_MEMORY.set(ValueLayout.JAVA_BYTE, dst + lastByteIndex, VIRTUAL_MEMORY.get(ValueLayout.JAVA_BYTE, src + lastByteIndex));

        //}
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
            //var D = MemorySegment.ofAddress(dst).reinterpret(bytes);
            var D = VIRTUAL_MEMORY.asSlice(dst, bytes);

            D.copyFrom(S);
        } else {
            var lastByteIndex = bytes - 1L;
            var copyBytes     = lastByteIndex + (bytes & 1L);

            var S = src.asSlice(offset, copyBytes);
            //var D = MemorySegment.ofAddress(dst).reinterpret(copyBytes);
            var D = VIRTUAL_MEMORY.asSlice(dst, copyBytes);

            D.copyFrom(S);

            memPutByte(dst + lastByteIndex, src.get(ValueLayout.JAVA_BYTE, offset + lastByteIndex));
        }
    }

    @Override public final void memcpy(byte[] src, long dst, int offset, int size) {
        checkMemcpy(dst, offset, size, src.length);
        memcpy(MemorySegment.ofArray(src), dst, offset, size);
    }
    @Override public final void memcpy(char[] src, long dst, int offset, int size) {
        checkMemcpy(dst, offset, size, src.length);
        memcpy(MemorySegment.ofArray(src), dst, apiGetBytes(offset, 1), apiGetBytes(size, 1));
    }
    @Override public final void memcpy(short[] src, long dst, int offset, int size) {
        checkMemcpy(dst, offset, size, src.length);
        memcpy(MemorySegment.ofArray(src), dst, apiGetBytes(offset, 1), apiGetBytes(size, 1));
    }
    @Override public final void memcpy(int[] src, long dst, int offset, int size) {
        checkMemcpy(dst, offset, size, src.length);
        memcpy(MemorySegment.ofArray(src), dst, apiGetBytes(offset, 2), apiGetBytes(size, 2));
    }
    @Override public final void memcpy(long[] src, long dst, int offset, int size) {
        checkMemcpy(dst, offset, size, src.length);
        memcpy(MemorySegment.ofArray(src), dst, apiGetBytes(offset, 3), apiGetBytes(size, 3));
    }
    @Override public final void memcpy(float[] src, long dst, int offset, int size) {
        checkMemcpy(dst, offset, size, src.length);
        memcpy(MemorySegment.ofArray(src), dst, apiGetBytes(offset, 2), apiGetBytes(size, 2));
    }
    @Override public final void memcpy(double[] src, long dst, int offset, int size) {
        checkMemcpy(dst, offset, size, src.length);
        memcpy(MemorySegment.ofArray(src), dst, apiGetBytes(offset, 3), apiGetBytes(size, 3));
    }

    private static void memcpy(long src, MemorySegment dst, long offset, long bytes) {
        if (bytes < NATIVE_THRESHOLD_COPY) {
            //var S = MemorySegment.ofAddress(src).reinterpret(bytes);
            var S = VIRTUAL_MEMORY.asSlice(src, bytes);
            var D = dst.asSlice(offset, bytes);

            D.copyFrom(S);
        } else {
            var lastByteIndex = bytes - 1L;
            var copyBytes     = lastByteIndex + (bytes & 1L);

            //var S = MemorySegment.ofAddress(src).reinterpret(copyBytes);
            var S = VIRTUAL_MEMORY.asSlice(src, copyBytes);
            var D = dst.asSlice(offset, copyBytes);

            D.copyFrom(S);

            dst.set(ValueLayout.JAVA_BYTE, offset + lastByteIndex, memGetByte(src + lastByteIndex));
        }
    }

    @Override public final void memcpy(long src, byte[] dst, int offset, int size) {
        checkMemcpy(src, offset, size, dst.length);
        memcpy(src, MemorySegment.ofArray(dst), offset, size);
    }
    @Override public final void memcpy(long src, char[] dst, int offset, int size) {
        checkMemcpy(src, offset, size, dst.length);
        memcpy(src, MemorySegment.ofArray(dst), apiGetBytes(offset, 1), apiGetBytes(size, 1));
    }
    @Override public final void memcpy(long src, short[] dst, int offset, int size) {
        checkMemcpy(src, offset, size, dst.length);
        memcpy(src, MemorySegment.ofArray(dst), apiGetBytes(offset, 1), apiGetBytes(size, 1));
    }
    @Override public final void memcpy(long src, int[] dst, int offset, int size) {
        checkMemcpy(src, offset, size, dst.length);
        memcpy(src, MemorySegment.ofArray(dst), apiGetBytes(offset, 2), apiGetBytes(size, 2));
    }
    @Override public final void memcpy(long src, long[] dst, int offset, int size) {
        checkMemcpy(src, offset, size, dst.length);
        memcpy(src, MemorySegment.ofArray(dst), apiGetBytes(offset, 3), apiGetBytes(size, 3));
    }
    @Override public final void memcpy(long src, float[] dst, int offset, int size) {
        checkMemcpy(src, offset, size, dst.length);
        memcpy(src, MemorySegment.ofArray(dst), apiGetBytes(offset, 2), apiGetBytes(size, 2));
    }
    @Override public final void memcpy(long src, double[] dst, int offset, int size) {
        checkMemcpy(src, offset, size, dst.length);
        memcpy(src, MemorySegment.ofArray(dst), apiGetBytes(offset, 3), apiGetBytes(size, 3));
    }

    // Cannot use StandardCharsets.ISO_8859_1 for encoding, because it replaces unmappable characters
    // and replacing surrogates changes the string length.
    //@SuppressWarnings("deprecation")
    @Override public final void putStringASCII(String text, boolean nullTerminated, long target) {
        /*var length = text.length();
        var bytes = new byte[length];
        text.getBytes(0, length, bytes, 0);
        MemorySegment.copy(MemorySegment.ofArray(bytes), 0L, VIRTUAL_MEMORY, target, length);
        if (nullTerminated) {
            VIRTUAL_MEMORY.set(ValueLayout.JAVA_BYTE, target + length, (byte)0);
        }*/
        var length = text.length();
        for (var i = 0; i < length; i++) {
            VIRTUAL_MEMORY.set(ValueLayout.JAVA_BYTE, target + i, (byte)text.charAt(i));
        }
        if (nullTerminated) {
            VIRTUAL_MEMORY.set(ValueLayout.JAVA_BYTE, target + length, (byte)0);
        }
    }

    @Override public final void putStringASCII(CharSequence text, boolean nullTerminated, long target) {
        var length = text.length();
        for (var i = 0; i < length; i++) {
            VIRTUAL_MEMORY.set(ValueLayout.JAVA_BYTE, target + i, (byte)text.charAt(i));
        }
        if (nullTerminated) {
            VIRTUAL_MEMORY.set(ValueLayout.JAVA_BYTE, target + length, (byte)0);
        }
    }

    @Override public ByteBuffer allocateUTF8(String text, boolean nullTerminated, MemoryAllocator allocator) {
        var segment = new StringAllocator(allocator, 0L, nullTerminated ? 0L : -1L)
            .allocateFrom(text, UTF_8);

        if (!nullTerminated) {
            segment = segment.asSlice(0L, segment.byteSize() - 1L);
        }

        return segment
            .asByteBuffer()
            .order(ByteOrder.nativeOrder());
    }

    @Override
    public int putStringUTF8(String text, boolean nullTerminated, long target, int maxLength) {
        var bytes = text.getBytes(UTF_8);

        var length = memLengthNT1(bytes, nullTerminated);
        if (maxLength < length) {
            throw new BufferOverflowException();
        }

        memcpy(MemorySegment.ofArray(bytes), target, 0L, bytes.length);
        if (nullTerminated) {
            VIRTUAL_MEMORY.set(ValueLayout.JAVA_BYTE, target + bytes.length, (byte)0);
        }

        return length;
    }
    @Override public final void putStringUTF8(CharSequence text, boolean nullTerminated, long target) {
        int p = 0, i = 0, len = text.length();

        while (i < len) {
            var c = text.charAt(i++);
            if (c < 0x80) {
                VIRTUAL_MEMORY.set(ValueLayout.JAVA_BYTE, target + p++, (byte)c);
            } else {
                int cp = c;
                if (c < 0x800) {
                    VIRTUAL_MEMORY.set(ValueLayout.JAVA_BYTE, target + p++, (byte)(0xC0 | cp >> 6));
                } else {
                    if (!isHighSurrogate(c)) {
                        VIRTUAL_MEMORY.set(ValueLayout.JAVA_BYTE, target + p++, (byte)(0xE0 | cp >> 12));
                    } else {
                        cp = toCodePoint(c, text.charAt(i++));

                        VIRTUAL_MEMORY.set(ValueLayout.JAVA_BYTE, target + p++, (byte)(0xF0 | cp >> 18));
                        VIRTUAL_MEMORY.set(ValueLayout.JAVA_BYTE, target + p++, (byte)(0x80 | cp >> 12 & 0x3F));
                    }
                    VIRTUAL_MEMORY.set(ValueLayout.JAVA_BYTE, target + p++, (byte)(0x80 | cp >> 6 & 0x3F));
                }
                VIRTUAL_MEMORY.set(ValueLayout.JAVA_BYTE, target + p++, (byte)(0x80 | cp & 0x3F));
            }
        }

        if (nullTerminated) {
            VIRTUAL_MEMORY.set(ValueLayout.JAVA_BYTE, target + p, (byte)0);
        }
    }

    @Override public final void putStringUTF16(String text, boolean nullTerminated, long target) {
        /*var bytes = text.getBytes(UTF16);
        memcpy(MemorySegment.ofArray(bytes), target, 0L, bytes.length);
        if (nullTerminated) {
            VIRTUAL_MEMORY.set(JAVA_CHAR, target + bytes.length, '\0');
        }*/
        var length = text.length();
        for (var i = 0; i < length; i++) {
            VIRTUAL_MEMORY.set(JAVA_CHAR, target + ((long)i << 1), text.charAt(i));
        }
        if (nullTerminated) {
            VIRTUAL_MEMORY.set(JAVA_CHAR, target + ((long)length << 1), '\0');
        }
    }
    @Override public final void putStringUTF16(CharSequence text, boolean nullTerminated, long target) {
        var length = text.length();
        for (var i = 0; i < length; i++) {
            VIRTUAL_MEMORY.set(JAVA_CHAR, target + ((long)i << 1), text.charAt(i));
        }
        if (nullTerminated) {
            VIRTUAL_MEMORY.set(JAVA_CHAR, target + ((long)length << 1), '\0');
        }
    }

    // TODO: migrate to MemorySegment::setString & MemorySegment::copy when they get optimized

    // ----------------------------------------------
    // ----------------------------------------------
    // ----------------------------------------------

    protected record StringAllocator(MemoryAllocator allocator, long extraBytes, long reinterpretOffset) implements SegmentAllocator {
        @Override public MemorySegment allocate(long byteSize, long byteAlignment) {
            var length = byteSize + extraBytes;

            var reinterpretLength = length + reinterpretOffset;
            if (0x7FFF_FFFFL < reinterpretLength) {
                throw new BufferOverflowException();
            }

            var address = allocator.malloc(length);
            if (CHECKS && address == NULL) {
                throw new OutOfMemoryError();
            }

            return MemorySegment
                .ofAddress(address)
                .reinterpret(length);
        }
    }

    static final class P64CL32 extends MemoryBackendFFM {
        @Override public long getCLong(long ptr)                      { return VIRTUAL_MEMORY.get(JAVA_INT, ptr); }
        @Override public long getCLongUnaligned(long ptr)             { return VIRTUAL_MEMORY.get(ValueLayout.JAVA_INT_UNALIGNED, ptr); }

        @Override public void putCLong(long ptr, long value)          { VIRTUAL_MEMORY.set(JAVA_INT, ptr, (int)value); }
        @Override public void putCLongUnaligned(long ptr, long value) { VIRTUAL_MEMORY.set(ValueLayout.JAVA_INT_UNALIGNED, ptr, (int)value); }
    }

    static final class P32 extends MemoryBackendFFM {
        @Override public long getCLong(long ptr)                        { return VIRTUAL_MEMORY.get(JAVA_INT, ptr); }
        @Override public long getCLongUnaligned(long ptr)               { return VIRTUAL_MEMORY.get(ValueLayout.JAVA_INT_UNALIGNED, ptr); }

        @Override public long getAddress(long ptr)                      { return VIRTUAL_MEMORY.get(JAVA_INT, ptr) & 0xFFFF_FFFFL; }
        @Override public long getAddressUnaligned(long ptr)             { return VIRTUAL_MEMORY.get(ValueLayout.JAVA_INT_UNALIGNED, ptr) & 0xFFFF_FFFFL; }

        @Override public void putCLong(long ptr, long value)            { VIRTUAL_MEMORY.set(JAVA_INT, ptr, (int)value); }
        @Override public void putCLongUnaligned(long ptr, long value)   { VIRTUAL_MEMORY.set(ValueLayout.JAVA_INT_UNALIGNED, ptr, (int)value); }

        @Override public void putAddress(long ptr, long value)          { VIRTUAL_MEMORY.set(JAVA_INT, ptr, (int)value); }
        @Override public void putAddressUnaligned(long ptr, long value) { VIRTUAL_MEMORY.set(ValueLayout.JAVA_INT_UNALIGNED, ptr, (int)value); }
    }

    /*private static final VarHandle VH_JAVA_BYTE;

    private static final VarHandle VH_JAVA_SHORT_UNALIGNED;
    private static final VarHandle VH_JAVA_INT_UNALIGNED;
    private static final VarHandle VH_JAVA_LONG_UNALIGNED;
    private static final VarHandle VH_JAVA_FLOAT_UNALIGNED;
    private static final VarHandle VH_JAVA_DOUBLE_UNALIGNED;

    private static final VarHandle VH_CLONG_UNALIGNED;
    private static final VarHandle VH_ADDRESS_UNALIGNED;

    private static final VarHandle VH_JAVA_SHORT;
    private static final VarHandle VH_JAVA_INT;
    private static final VarHandle VH_JAVA_LONG;
    private static final VarHandle VH_JAVA_FLOAT;
    private static final VarHandle VH_JAVA_DOUBLE;

    private static final VarHandle VH_CLONG;
    private static final VarHandle VH_ADDRESS;

    static {
        try {
            var lookup = MethodHandles.lookup();

            var ofAddress = lookup
                .findStatic(MemorySegment.class, "ofAddress", MethodType.methodType(MemorySegment.class, long.class));

            var reinterpret = lookup
                .findVirtual(MemorySegment.class, "reinterpret", MethodType.methodType(MemorySegment.class, long.class));

            VH_JAVA_BYTE = createMemoryAccessVH(ValueLayout.JAVA_BYTE, ofAddress, reinterpret)
                .withInvokeExactBehavior();

            VH_JAVA_SHORT_UNALIGNED = createMemoryAccessVH(ValueLayout.JAVA_SHORT_UNALIGNED, ofAddress, reinterpret).withInvokeExactBehavior();
            VH_JAVA_INT_UNALIGNED = createMemoryAccessVH(ValueLayout.JAVA_INT_UNALIGNED, ofAddress, reinterpret).withInvokeExactBehavior();
            VH_JAVA_LONG_UNALIGNED = createMemoryAccessVH(ValueLayout.JAVA_LONG_UNALIGNED, ofAddress, reinterpret).withInvokeExactBehavior();
            VH_JAVA_FLOAT_UNALIGNED = createMemoryAccessVH(ValueLayout.JAVA_FLOAT_UNALIGNED, ofAddress, reinterpret).withInvokeExactBehavior();
            VH_JAVA_DOUBLE_UNALIGNED = createMemoryAccessVH(ValueLayout.JAVA_DOUBLE_UNALIGNED, ofAddress, reinterpret).withInvokeExactBehavior();

            var vh = createMemoryAccessVH(
                CLONG_SIZE == 8
                    ? (ValueLayout.JAVA_LONG_UNALIGNED)
                    : (ValueLayout.JAVA_INT_UNALIGNED), ofAddress, reinterpret);

            if (CLONG_SIZE == 4) {
                vh = MethodHandles.filterValue(vh,
                    MethodHandles.explicitCastArguments(
                        MethodHandles.identity(int.class),
                        MethodType.methodType(int.class, long.class)
                    ),
                    MethodHandles.explicitCastArguments(
                        MethodHandles.identity(long.class),
                        MethodType.methodType(long.class, int.class)
                    )
                );
            }

            VH_CLONG_UNALIGNED = vh.withInvokeExactBehavior();

            vh = createMemoryAccessVH(BITS64
                ? (ValueLayout.JAVA_LONG_UNALIGNED)
                : (ValueLayout.JAVA_INT_UNALIGNED), ofAddress, reinterpret);

            if (BITS32) {
                vh = MethodHandles.filterValue(vh,
                    MethodHandles.explicitCastArguments(
                        MethodHandles.identity(int.class),
                        MethodType.methodType(int.class, long.class)
                    ),
                    lookup.findStatic(
                        MemoryUtil.class, "castAddress32",
                        MethodType.methodType(long.class, int.class)
                    )
                );
            }

            VH_ADDRESS_UNALIGNED = vh.withInvokeExactBehavior();

            if (DEBUG) {
                VH_JAVA_SHORT = createMemoryAccessVH(ValueLayout.JAVA_SHORT, ofAddress, reinterpret).withInvokeExactBehavior();
                VH_JAVA_INT = createMemoryAccessVH(ValueLayout.JAVA_INT, ofAddress, reinterpret).withInvokeExactBehavior();
                VH_JAVA_LONG = createMemoryAccessVH(ValueLayout.JAVA_LONG, ofAddress, reinterpret).withInvokeExactBehavior();
                VH_JAVA_FLOAT = createMemoryAccessVH(ValueLayout.JAVA_FLOAT, ofAddress, reinterpret).withInvokeExactBehavior();
                VH_JAVA_DOUBLE = createMemoryAccessVH(ValueLayout.JAVA_DOUBLE, ofAddress, reinterpret).withInvokeExactBehavior();

                vh = createMemoryAccessVH(
                    CLONG_SIZE == 8
                        ? ValueLayout.JAVA_LONG
                        : ValueLayout.JAVA_INT, ofAddress, reinterpret);

                if (CLONG_SIZE == 4) {
                    vh = MethodHandles.filterValue(vh,
                        MethodHandles.explicitCastArguments(
                            MethodHandles.identity(int.class),
                            MethodType.methodType(int.class, long.class)
                        ),
                        MethodHandles.explicitCastArguments(
                            MethodHandles.identity(long.class),
                            MethodType.methodType(long.class, int.class)
                        )
                    );
                }

                VH_CLONG = vh.withInvokeExactBehavior();

                vh = createMemoryAccessVH(BITS64
                    ? ValueLayout.JAVA_LONG
                    : ValueLayout.JAVA_INT, ofAddress, reinterpret);

                if (BITS32) {
                    vh = MethodHandles.filterValue(vh,
                        MethodHandles.explicitCastArguments(
                            MethodHandles.identity(int.class),
                            MethodType.methodType(int.class, long.class)
                        ),
                        lookup.findStatic(
                            MemoryUtil.class, "castAddress32",
                            MethodType.methodType(long.class, int.class)
                        )
                    );
                }

                VH_ADDRESS = vh.withInvokeExactBehavior();
            } else {
                VH_JAVA_SHORT = VH_JAVA_SHORT_UNALIGNED;
                VH_JAVA_INT = VH_JAVA_INT_UNALIGNED;
                VH_JAVA_LONG = VH_JAVA_LONG_UNALIGNED;
                VH_JAVA_FLOAT = VH_JAVA_FLOAT_UNALIGNED;
                VH_JAVA_DOUBLE = VH_JAVA_DOUBLE_UNALIGNED;

                VH_CLONG = VH_CLONG_UNALIGNED;

                VH_ADDRESS = VH_ADDRESS_UNALIGNED;
            }
        } catch (NoSuchMethodException | IllegalAccessException e) {
            throw new RuntimeException(e);
        }
    }

    private static VarHandle createMemoryAccessVH(ValueLayout layout, MethodHandle ofAddress, MethodHandle reinterpret) {
        var vh = layout.varHandle();

        vh = MethodHandles.insertCoordinates(vh, 1, 0L);
        vh = MethodHandles.filterCoordinates(vh, 0, MethodHandles.filterReturnValue(
            ofAddress,
            MethodHandles.insertArguments(reinterpret, 1, layout.byteSize())
        ));

        return vh;
    }

    private static long castAddress32(int ptr) {
        return ptr & 0xFFFF_FFFFL;
    }*/

    /*public static boolean memGetBoolean(long ptr)           { return (byte)VH_JAVA_BYTE.get(ptr) != 0; }
    public static byte memGetByte(long ptr)                 { return (byte)VH_JAVA_BYTE.get(ptr); }
    public static short memGetShort(long ptr)               { return (short)VH_JAVA_SHORT.get(ptr); }
    public static int memGetInt(long ptr)                   { return (int)VH_JAVA_INT.get(ptr); }
    public static long memGetLong(long ptr)                 { return (long)VH_JAVA_LONG.get(ptr); }
    public static float memGetFloat(long ptr)               { return (float)VH_JAVA_FLOAT.get(ptr); }
    public static double memGetDouble(long ptr)             { return (double)VH_JAVA_DOUBLE.get(ptr); }
    public static long memGetCLong(long ptr)                { return (long)VH_CLONG.get(ptr); }
    public static long memGetAddress(long ptr)              { return (long)VH_ADDRESS.get(ptr); }

    public static void memPutByte(long ptr, byte value)     { VH_JAVA_BYTE.set(ptr, value); }
    public static void memPutShort(long ptr, short value)   { VH_JAVA_SHORT.set(ptr, value); }
    public static void memPutInt(long ptr, int value)       { VH_JAVA_INT.set(ptr, value); }
    public static void memPutLong(long ptr, long value)     { VH_JAVA_LONG.set(ptr, value); }
    public static void memPutFloat(long ptr, float value)   { VH_JAVA_FLOAT.set(ptr, value); }
    public static void memPutDouble(long ptr, double value) { VH_JAVA_DOUBLE.set(ptr, value); }
    public static void memPutCLong(long ptr, long value)    { VH_CLONG.set(ptr, value); }
    public static void memPutAddress(long ptr, long value)  { VH_ADDRESS.set(ptr, value); }*/

}