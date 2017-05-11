/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package org.lwjgl.system;

import java.nio.*;

import static java.lang.Character.*;
import static org.lwjgl.system.APIUtil.*;
import static org.lwjgl.system.MemoryAccessJNI.*;
import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.Pointer.*;
import static org.lwjgl.system.jni.JNINativeInterface.*;
import static org.lwjgl.system.libc.LibCString.*;

/** Provides {@link MemoryAccessor} implementations. The most efficient available will be used by {@link MemoryUtil}. */
final class MemoryAccess {

    static {
        Library.initialize();
    }

    private MemoryAccess() {
    }

    static MemoryAccessor getInstance() {
        MemoryAccessor accessor;
        try {
            // Depends on sun.misc.Unsafe
            accessor = new MemoryAccessorUnsafe();
        } catch (Throwable t) {
            t.printStackTrace(DEBUG_STREAM);
            DEBUG_STREAM
                .println("[LWJGL] [MemoryAccessor] Unsupported JVM detected, this will likely result in low performance. Please inform LWJGL developers.");
            accessor = new MemoryAccessorJNI();
        }

        return accessor;
    }

    /** Implements functionality for {@link MemoryUtil}. */
    interface MemoryAccessor {

        default int getPageSize() {
            // TODO: Can we do better?
            return 4096;
        }

        default int getCacheLineSize() {
            // TODO: Can we do better?
            return 64;
        }

        default long memAddress0(Buffer buffer) {
            return GetDirectBufferAddress(buffer);
        }

        default ByteBuffer memByteBuffer(long address, int capacity)     { return NewDirectByteBuffer(address, capacity).order(ByteOrder.nativeOrder()); }

        default ShortBuffer memShortBuffer(long address, int capacity)   { return memByteBuffer(address, capacity << 1).asShortBuffer(); }
        default CharBuffer memCharBuffer(long address, int capacity)     { return memByteBuffer(address, capacity << 1).asCharBuffer(); }
        default IntBuffer memIntBuffer(long address, int capacity)       { return memByteBuffer(address, capacity << 2).asIntBuffer(); }
        default LongBuffer memLongBuffer(long address, int capacity)     { return memByteBuffer(address, capacity << 3).asLongBuffer(); }
        default FloatBuffer memFloatBuffer(long address, int capacity)   { return memByteBuffer(address, capacity << 2).asFloatBuffer(); }
        default DoubleBuffer memDoubleBuffer(long address, int capacity) { return memByteBuffer(address, capacity << 3).asDoubleBuffer(); }

        default void memSet(long dst, int value, int bytes) {
            nmemset(dst, value, bytes);
        }

        default void memCopy(long src, long dst, int bytes) {
            nmemcpy(dst, src, bytes); // Note the swapped src & dst
        }

        default byte memGetByte(long ptr)                 { return getByte(ptr); }
        default short memGetShort(long ptr)               { return getShort(ptr); }
        default int memGetInt(long ptr)                   { return getInt(ptr); }
        default long memGetLong(long ptr)                 { return getLong(ptr); }
        default float memGetFloat(long ptr)               { return getFloat(ptr); }
        default double memGetDouble(long ptr)             { return getDouble(ptr); }
        default long memGetAddress(long ptr)              { return getAddress(ptr); }

        default void memPutByte(long ptr, byte value)     { putByte(ptr, value); }
        default void memPutShort(long ptr, short value)   { putShort(ptr, value); }
        default void memPutInt(long ptr, int value)       { putInt(ptr, value); }
        default void memPutLong(long ptr, long value)     { putLong(ptr, value); }
        default void memPutFloat(long ptr, float value)   { putFloat(ptr, value); }
        default void memPutDouble(long ptr, double value) { putDouble(ptr, value); }
        default void memPutAddress(long ptr, long value)  { putAddress(ptr, value); }

        default MemoryTextUtil getTextUtil() {
            return new MemoryTextUtil();
        }

    }

    private static final class MemoryAccessorJNI implements MemoryAccessor {
    }

    /** Implementation using sun.misc.Unsafe. */
    private static final class MemoryAccessorUnsafe implements MemoryAccessor {

        private static final Class<? extends ByteBuffer>   BYTE_BUFFER;
        private static final Class<? extends ShortBuffer>  SHORT_BUFFER;
        private static final Class<? extends CharBuffer>   CHAR_BUFFER;
        private static final Class<? extends IntBuffer>    INT_BUFFER;
        private static final Class<? extends LongBuffer>   LONG_BUFFER;
        private static final Class<? extends FloatBuffer>  FLOAT_BUFFER;
        private static final Class<? extends DoubleBuffer> DOUBLE_BUFFER;

        private static final sun.misc.Unsafe UNSAFE;

        private static final long ADDRESS;
        private static final long CAPACITY;

        static {
            ByteBuffer bb = ByteBuffer.allocateDirect(0).order(ByteOrder.nativeOrder());

            BYTE_BUFFER = bb.getClass();
            SHORT_BUFFER = bb.asShortBuffer().getClass();
            CHAR_BUFFER = bb.asCharBuffer().getClass();
            INT_BUFFER = bb.asIntBuffer().getClass();
            LONG_BUFFER = bb.asLongBuffer().getClass();
            FLOAT_BUFFER = bb.asFloatBuffer().getClass();
            DOUBLE_BUFFER = bb.asDoubleBuffer().getClass();

            try {
                UNSAFE = getUnsafeInstance();

                ADDRESS = getAddressOffset();
                CAPACITY = getCapacityOffset();
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }

        private static long getAddressOffset() {
            long MAGIC_ADDRESS = 0xDEADBEEF8BADF00DL;
            if (BITS32) {
                MAGIC_ADDRESS &= 0xFFFFFFFFL;
            }

            ByteBuffer bb = NewDirectByteBuffer(MAGIC_ADDRESS, 0);

            long offset = 8L; // 8 byte aligned, cannot be at 0
            while (true) {
                if (UNSAFE.getLong(bb, offset) == MAGIC_ADDRESS) {
                    return offset;
                }
                offset += 8L;
            }
        }

        private static long getCapacityOffset() {
            int MAGIC_CAPACITY = 0x0D15EA5E;

            ByteBuffer bb = NewDirectByteBuffer(-1L, MAGIC_CAPACITY);
            bb.limit(0);

            long offset = 4L; // 4 byte aligned, cannot be at 0
            while (true) {
                if (UNSAFE.getInt(bb, offset) == MAGIC_CAPACITY) {
                    return offset;
                }
                offset += 4L;
            }
        }

        MemoryAccessorUnsafe() {
        }

        @Override
        public int getPageSize() {
            return UNSAFE.pageSize();
        }

        @Override
        public long memAddress0(Buffer buffer) {
            return UNSAFE.getLong(buffer, ADDRESS);
        }

        @Override public ByteBuffer memByteBuffer(long address, int capacity)     { return setup(BYTE_BUFFER, address, capacity).order(ByteOrder.nativeOrder()); }
        @Override public ShortBuffer memShortBuffer(long address, int capacity)   { return setup(SHORT_BUFFER, address, capacity); }
        @Override public CharBuffer memCharBuffer(long address, int capacity)     { return setup(CHAR_BUFFER, address, capacity); }
        @Override public IntBuffer memIntBuffer(long address, int capacity)       { return setup(INT_BUFFER, address, capacity); }
        @Override public LongBuffer memLongBuffer(long address, int capacity)     { return setup(LONG_BUFFER, address, capacity); }
        @Override public FloatBuffer memFloatBuffer(long address, int capacity)   { return setup(FLOAT_BUFFER, address, capacity); }
        @Override public DoubleBuffer memDoubleBuffer(long address, int capacity) { return setup(DOUBLE_BUFFER, address, capacity); }

        @SuppressWarnings("unchecked")
        private static <T extends Buffer> T setup(Class<T> clazz, long address, int capacity) {
            T buffer;
            try {
                buffer = (T)UNSAFE.allocateInstance(clazz);
            } catch (InstantiationException e) {
                throw new UnsupportedOperationException(e);
            }

            UNSAFE.putLong(buffer, ADDRESS, address);
            UNSAFE.putInt(buffer, CAPACITY, capacity);

            buffer.clear();
            return buffer;
        }

        //  Left-shifts value by bytes*8 bits in big-endian archictures.
        // Right-shifts value by bytes*8 bits in little-endian archictures.
        private static long shl(long value, int bytes) {
            if (ByteOrder.nativeOrder() == ByteOrder.BIG_ENDIAN) {
                return value << (bytes << 3);
            } else {
                return value >>> (bytes << 3);
            }
        }

        // Right-shifts value by bytes*8 bits in big-endian archictures.
        //  Left-shifts value by bytes*8 bits in little-endian archictures.
        private static long shr(long value, int bytes) {
            if (ByteOrder.nativeOrder() == ByteOrder.BIG_ENDIAN) {
                return value >>> (bytes << 3);
            } else {
                return value << (bytes << 3);
            }
        }

        // Bit from a where mask bit is 0, bit from b where mask bit is 1.
        private static long merge(long a, long b, long mask) {
            return a ^ ((a ^ b) & mask);
        }

        // Returns a long where each byte is equal to value.
        private static long fill(byte value) {
            long fill = value;

            if (value != 0) {
                fill |= fill << 8;
                fill |= fill << 16;
                fill |= fill << 32;
            }

            return fill;
        }

        @Override
        public void memSet(long dst, int value, int bytes) {
            /*
            - Unsafe.setMemory is very slow.
            - A custom Java loop is fastest at small sizes, approximately up to 192 bytes.
            - The native memset becomes fastest at bigger sizes, when the JNI overhead becomes negligible.
             */

            //UNSAFE.setMemory(dst, bytes, (byte)(value & 0xFF));
            if (bytes < 192) {
                memSetLoop(dst, (byte)(value & 0xFF), bytes);
            } else {
                nmemset(dst, value, bytes);
            }
        }

        private void memSetLoop(long dst, byte value, int bytes) {
            int i = 0;

            int  misalignment = (int)dst & 7;
            long fill         = fill(value);

            if (8 <= bytes) {
                if (misalignment != 0) {
                    memPutLong(dst - misalignment, merge(
                        memGetLong(dst - misalignment),
                        fill,
                        shr(-1L, misalignment) // 0x00000000FFFFFFFF
                    ));
                    i += 8 - misalignment;
                }

                // Aligned longs for performance
                for (; i <= bytes - 8; i += 8) {
                    memPutLong(dst + i, fill);
                }
            } else if (misalignment != 0 && 0 < bytes) {
                memPutLong(dst - misalignment, merge(
                    memGetLong(dst - misalignment),
                    fill,
                    shr(shl(-1L, 8 - bytes), misalignment) // 0x0000FFFFFFFF0000
                ));
                i += 8 - misalignment;
            }

            // Aligned tail
            if (i < bytes) {
                memPutLong(dst + i, merge(
                    memGetLong(dst + i),
                    fill,
                    shl(-1L, 8 - (bytes - i)) // 0xFFFFFFFF00000000
                ));
            }
        }

        @Override
        public void memCopy(long src, long dst, int bytes) {
            /*
            - A custom Java loop is fastest at small sizes, approximately up to 64 bytes.
            - Unsafe.copyMemory is fastest at moderate sizes, approximately up to 384 bytes.
            - The native memcpy becomes fastest at bigger sizes, when the JNI overhead becomes negligible.
             */

            if (bytes < 64 && ((int)src & 7) == 0 && ((int)dst & 7) == 0) { // both src and dst must be aligned to 8 bytes
                memCopyAligned(src, dst, bytes);
            } else if (bytes < 384) {
                UNSAFE.copyMemory(src, dst, bytes);
            } else {
                nmemcpy(dst, src, bytes);
            }
        }

        private void memCopyAligned(long src, long dst, int bytes) {
            int i = 0;

            // Aligned longs for performance
            for (; i <= bytes - 8; i += 8) {
                memPutLong(dst + i, memGetLong(src + i));
            }

            // Aligned tail
            if (i < bytes) {
                memPutLong(dst + i, merge(
                    memGetLong(dst + i),
                    memGetLong(src + i),
                    shl(-1L, 8 - (bytes - i))
                ));
            }
        }

        @Override
        public byte memGetByte(long ptr) {
            return UNSAFE.getByte(ptr);
        }

        @Override
        public short memGetShort(long ptr) {
            return UNSAFE.getShort(ptr);
        }

        @Override
        public int memGetInt(long ptr) {
            return UNSAFE.getInt(ptr);
        }

        @Override
        public long memGetLong(long ptr) {
            return UNSAFE.getLong(ptr);
        }

        @Override
        public float memGetFloat(long ptr) {
            return UNSAFE.getFloat(ptr);
        }

        @Override
        public double memGetDouble(long ptr) {
            return UNSAFE.getDouble(ptr);
        }

        @Override
        public long memGetAddress(long ptr) {
            return UNSAFE.getAddress(ptr);
        }

        @Override
        public void memPutByte(long ptr, byte value) {
            UNSAFE.putByte(ptr, value);
        }

        @Override
        public void memPutShort(long ptr, short value) {
            UNSAFE.putShort(ptr, value);
        }

        @Override
        public void memPutInt(long ptr, int value) {
            UNSAFE.putInt(ptr, value);
        }

        @Override
        public void memPutLong(long ptr, long value) {
            UNSAFE.putLong(ptr, value);
        }

        @Override
        public void memPutFloat(long ptr, float value) {
            UNSAFE.putFloat(ptr, value);
        }

        @Override
        public void memPutDouble(long ptr, double value) {
            UNSAFE.putDouble(ptr, value);
        }

        @Override
        public void memPutAddress(long ptr, long value) {
            UNSAFE.putAddress(ptr, value);
        }

        @Override
        public MemoryTextUtil getTextUtil() {
            // This implementation uses Unsafe to write directly to the buffer's memory. We can do this because the original code specifies that the target
            // buffer is assumed to have enough space for the encoded string. This by itself isn't very useful.

            // The benefit comes from extracting the implementation to a separate method that only receives a raw pointer. This enables inlining of the base
            // method and, in many cases, elimination of the ByteBuffer allocation via escape analysis.
            return new MemoryTextUtilUnsafe();
        }

        private static class MemoryTextUtilUnsafe extends MemoryTextUtil {
            @Override
            int strlen64NT1(long address, int maxLength) {
                int i = 0;

                if (8 <= maxLength) {
                    int misalignment = (int)address & 7;
                    if (misalignment != 0) {
                        // Align to 8 bytes
                        for (int len = 8 - misalignment; i < len; i++) {
                            if (UNSAFE.getByte(address + i) == 0) {
                                return i;
                            }
                        }
                    }

                    // Aligned longs for performance
                    do {
                        long v = UNSAFE.getLong(address + i);
                        if (((v - 0x0101010101010101L) & ~v & 0x8080808080808080L) != 0) {
                            break;
                        }
                        i += 8;
                    } while (i <= maxLength - 8);
                }

                // Tail
                for (; i < maxLength; i++) {
                    if (UNSAFE.getByte(address + i) == 0) {
                        break;
                    }
                }

                return i;
            }

            @Override
            int strlen64NT2(long address, int maxLength) {
                int i = 0;

                if (8 <= maxLength) {
                    int misalignment = (int)address & 7;
                    if (misalignment != 0) {
                        // Align to 8 bytes
                        for (int len = 8 - misalignment; i < len; i += 2) {
                            if (UNSAFE.getShort(address + i) == 0) {
                                return i;
                            }
                        }
                    }

                    // Aligned longs for performance
                    do {
                        long v = UNSAFE.getLong(address + i);
                        if (((v - 0x0001000100010001L) & ~v & 0x8000800080008000L) != 0) {
                            break;
                        }
                        i += 8;
                    } while (i <= maxLength - 8);
                }

                // Tail
                for (; i < maxLength; i += 2) {
                    if (UNSAFE.getShort(address + i) == 0) {
                        break;
                    }
                }

                return i;
            }

            @Override
            int strlen32NT1(long address, int maxLength) {
                int i = 0;

                if (4 <= maxLength) {
                    int misalignment = (int)address & 3;
                    if (misalignment != 0) {
                        // Align to 4 bytes
                        for (int len = 4 - misalignment; i < len; i++) {
                            if (UNSAFE.getByte(address + i) == 0) {
                                return i;
                            }
                        }
                    }

                    // Aligned ints for performance
                    do {
                        int v = UNSAFE.getInt(address + i);
                        if (((v - 0x01010101) & ~v & 0x80808080) != 0) {
                            break;
                        }
                        i += 4;
                    } while (i <= maxLength - 4);
                }

                // Tail
                for (; i < maxLength; i++) {
                    if (UNSAFE.getByte(address + i) == 0) {
                        break;
                    }
                }

                return i;
            }

            @Override
            int strlen32NT2(long address, int maxLength) {
                int i = 0;

                if (4 <= maxLength) {
                    int misalignment = (int)address & 3;
                    if (misalignment != 0) {
                        // Align to 4 bytes
                        for (int len = 4 - misalignment; i < len; i += 2) {
                            if (UNSAFE.getShort(address + i) == 0) {
                                return i;
                            }
                        }
                    }

                    // Aligned longs for performance
                    do {
                        int v = UNSAFE.getInt(address + i);
                        if (((v - 0x00010001) & ~v & 0x80008000) != 0) {
                            break;
                        }
                        i += 4;
                    } while (i <= maxLength - 4);
                }

                // Tail
                for (; i < maxLength; i += 2) {
                    if (UNSAFE.getShort(address + i) == 0) {
                        break;
                    }
                }

                return i;
            }

            @Override
            int encodeASCII(CharSequence text, boolean nullTerminated, ByteBuffer target, int offset) {
                return encodeASCII(text, nullTerminated, memAddress(target) + offset);
            }

            private static int encodeASCII(CharSequence text, boolean nullTerminated, long target) {
                int p = 0, len = text.length();

                for (; p < len; p++) {
                    UNSAFE.putByte(target + p, (byte)text.charAt(p));
                }

                if (nullTerminated) {
                    UNSAFE.putByte(target + p++, (byte)0);
                }

                return p;
            }

            @Override
            int encodeUTF8(CharSequence text, boolean nullTerminated, ByteBuffer target, int offset) {
                return encodeUTF8(text, nullTerminated, memAddress(target) + offset);
            }

            private static int encodeUTF8(CharSequence text, boolean nullTerminated, long target) {
                int i = 0, len = text.length(), p = 0;

                char c;

                // ASCII fast path
                while (i < len && (c = text.charAt(i)) < 0x80) {
                    UNSAFE.putByte(target + p++, (byte)c);
                    i++;
                }

                // Slow path
                while (i < len) {
                    c = text.charAt(i++);
                    if (c < 0x80) {
                        UNSAFE.putByte(target + p++, (byte)c);
                    } else {
                        int cp = c;
                        if (c < 0x800) {
                            UNSAFE.putByte(target + p++, (byte)(0xC0 | cp >> 6));
                        } else {
                            if (!isHighSurrogate(c)) {
                                UNSAFE.putByte(target + p++, (byte)(0xE0 | cp >> 12));
                            } else {
                                cp = toCodePoint(c, text.charAt(i++));

                                UNSAFE.putByte(target + p++, (byte)(0xF0 | cp >> 18));
                                UNSAFE.putByte(target + p++, (byte)(0x80 | cp >> 12 & 0x3F));
                            }
                            UNSAFE.putByte(target + p++, (byte)(0x80 | cp >> 6 & 0x3F));
                        }
                        UNSAFE.putByte(target + p++, (byte)(0x80 | cp & 0x3F));
                    }
                }

                if (nullTerminated) {
                    UNSAFE.putByte(target + p, (byte)0);
                }

                return p;
            }

            @Override
            int encodeUTF16(CharSequence text, boolean nullTerminated, ByteBuffer target, int offset) {
                return encodeUTF16(text, nullTerminated, memAddress(target) + offset);
            }

            private static int encodeUTF16(CharSequence text, boolean nullTerminated, long target) {
                int p = 0, len = text.length();

                for (int i = 0; i < len; i++, p += 2) {
                    UNSAFE.putShort(target + p, (short)text.charAt(i));
                }

                if (nullTerminated) {
                    UNSAFE.putShort(target + p, (short)0);
                    p += 2;
                }

                return p;
            }
        }

    }

    static sun.misc.Unsafe getUnsafeInstance() {
        java.lang.reflect.Field[] fields = sun.misc.Unsafe.class.getDeclaredFields();

        /*
        Different runtimes use different names for the Unsafe singleton,
        so we cannot use .getDeclaredField and we scan instead. For example:

        Oracle: theUnsafe
        PERC : m_unsafe_instance
        Android: THE_ONE
        */
        for (java.lang.reflect.Field field : fields) {
            if (!field.getType().equals(sun.misc.Unsafe.class)) {
                continue;
            }

            int modifiers = field.getModifiers();
            if (!(java.lang.reflect.Modifier.isStatic(modifiers) && java.lang.reflect.Modifier.isFinal(modifiers))) {
                continue;
            }

            field.setAccessible(true);
            try {
                return (sun.misc.Unsafe)field.get(null);
            } catch (IllegalAccessException e) {
                // ignore
            }
            break;
        }

        throw new UnsupportedOperationException();
    }

}