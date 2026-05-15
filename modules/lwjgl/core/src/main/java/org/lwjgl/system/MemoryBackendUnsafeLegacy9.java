/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package org.lwjgl.system;

import org.jspecify.annotations.*;
import sun.misc.*;

import java.nio.*;

import static java.nio.charset.StandardCharsets.*;
import static org.lwjgl.system.APIUtil.*;
import static org.lwjgl.system.MemoryUtil.*;

// No new API used, can build in core module
class MemoryBackendUnsafeLegacy9 extends MemoryBackendUnsafeLegacy {

    private static final long STRING_VALUE;
    private static final long STRING_CODER;

    private static final boolean COMPACT_STRINGS;

    static {
        try {
            STRING_VALUE = UNSAFE.objectFieldOffset(String.class.getDeclaredField("value"));
            //noinspection JavaReflectionMemberAccess
            STRING_CODER = UNSAFE.objectFieldOffset(String.class.getDeclaredField("coder"));

            COMPACT_STRINGS = UNSAFE.getByte("latin1", STRING_CODER) == 0;
        } catch (Throwable t) {
            throw new UnsupportedOperationException(t);
        }

        apiLogMore("Java 9 Compact String support enabled");
    }

    MemoryBackendUnsafeLegacy9() {
    }

    // Restore original implementation, more efficient with Compact Strings.
    @Override public String getStringUTF8(long source, int length) {
        byte[] bytes = length <= ARRAY_TLC_SIZE ? ARRAY_TLC_BYTE.get() : new byte[length];
        memcpy(source, bytes, 0, length);
        return new String(bytes, 0, length, UTF_8);
    }

    @Override public final void putStringASCII(String text, boolean nullTerminated, long target) {
        int length = text.length();

        byte[] bytes = (byte @NonNull [])UNSAFE.getObject(text, STRING_VALUE);
        if (COMPACT_STRINGS && UNSAFE.getByte(text, STRING_CODER) == 0) {
            memcpy(bytes, target, 0, bytes.length);
        } else {
            int i = 0;
            for (; i <= length - 4; i += 4) {
                long v = UNSAFE.getLong(bytes, BASE_OFFSET_BYTE + ((long)i << 1));

                v &= 0x00FF_00FF_00FF_00FFL;
                v = (v | (v >>> 8)) & 0x0000_FFFF_0000_FFFFL;
                v = (v | (v >>> 16));

                putIntUnaligned(target + i, (int)v);
            }
            for (; i < length; i++) {
                UNSAFE.putByte(null, target + i, (byte)text.charAt(i));
            }
        }
        if (nullTerminated) {
            UNSAFE.putByte(null, target + length, (byte)0);
        }
    }

    private static byte[] getUTF8Bytes(String text) {
        if (COMPACT_STRINGS && UNSAFE.getByte(text, STRING_CODER) == 0) {
            byte[] bytes = (byte @NonNull [])UNSAFE.getObject(text, STRING_VALUE);
            if (isCompactStringASCII(bytes)) {
                return bytes;
            }
        }
        return text.getBytes(UTF_8);
    }
    private static boolean isCompactStringASCII(byte[] bytes) {
        int i = 0;

        // Aligned longs for performance
        for (; i <= bytes.length - 8; i += 8) {
            if ((UNSAFE.getLong(bytes, BASE_OFFSET_BYTE + i) & 0x80_80_80_80_80_80_80_80L) != 0L) {
                return false;
            }
        }

        // Tail
        for (; i < bytes.length; i++) {
            if (bytes[i] < 0) {
                return false;
            }
        }

        return true;
    }

    @Override public final ByteBuffer allocateUTF8(String text, boolean nullTerminated, MemoryAllocator allocator) {
        return super.allocateUTF8(getUTF8Bytes(text), nullTerminated, allocator);
    }

    @Override
    public final int putStringUTF8(String text, boolean nullTerminated, long target, int maxLength) {
        byte[] bytes = getUTF8Bytes(text);

        int length = memLengthNT1(bytes, nullTerminated);
        if (maxLength < length) {
            throw new BufferOverflowException();
        }

        memcpy(bytes, target, BASE_OFFSET_BYTE, bytes.length);
        if (nullTerminated) {
            UNSAFE.putByte(null, target + bytes.length, (byte)0);
        }

        return length;
    }

    @Override public final void putStringUTF16(String text, boolean nullTerminated, long target) {
        int length = text.length();

        byte[] bytes = (byte @NonNull [])UNSAFE.getObject(text, STRING_VALUE);
        if (!COMPACT_STRINGS || UNSAFE.getByte(text, STRING_CODER) == 1) {
            memcpy(bytes, target, 0, bytes.length);
        } else {
            putStringUTF16Unpack(bytes, target);
        }
        if (nullTerminated) {
            UNSAFE.putChar(null, target + ((long)length << 1), '\0');
        }
    }
    private void putStringUTF16Unpack(byte[] bytes, long target) {
        int i = 0;
        for (; i <= bytes.length - 4; i += 4) {
            long v = UNSAFE.getInt(bytes, BASE_OFFSET_BYTE + i) & 0xFFFF_FFFFL;

            v = (v | (v << 16)) & 0x0000_FFFF_0000_FFFFL;
            v = (v | (v << 8)) & 0x00FF_00FF_00FF_00FFL;

            putLongUnaligned(target + ((long)i << 1), v);
        }
        for (; i < bytes.length; i++) {
            UNSAFE.putChar(null, target + ((long)i << 1), (char)(bytes[i] & 0xFF));
        }
    }

    // ----------------------------------------------
    // ----------------------------------------------
    // ----------------------------------------------

    static final class P64CL32 extends MemoryBackendUnsafeLegacy9 {
        @Override public long getCLong(long ptr)                      { return UNSAFE.getInt(null, ptr); }
        @Override public long getCLongUnaligned(long ptr)             { return getIntUnaligned(ptr); }

        @Override public void putCLong(long ptr, long value)          { UNSAFE.putInt(null, ptr, (int)value); }
        @Override public void putCLongUnaligned(long ptr, long value) { putIntUnaligned(ptr, (int)value); }
    }

    static final class P32 extends MemoryBackendUnsafeLegacy9 {
        @Override public long getCLong(long ptr)                        { return UNSAFE.getInt(null, ptr); }
        @Override public long getCLongUnaligned(long ptr)               { return getIntUnaligned(ptr); }

        @Override public long getAddress(long ptr)                      { return UNSAFE.getInt(null, ptr) & 0xFFFF_FFFFL; }
        @Override public long getAddressUnaligned(long ptr)             { return getIntUnaligned(ptr) & 0xFFFF_FFFFL; }

        @Override public void putCLong(long ptr, long value)            { UNSAFE.putInt(null, ptr, (int)value); }
        @Override public void putCLongUnaligned(long ptr, long value)   { putIntUnaligned(ptr, (int)value); }

        @Override public void putAddress(long ptr, long value)          { UNSAFE.putInt(null, ptr, (int)value); }
        @Override public void putAddressUnaligned(long ptr, long value) { putIntUnaligned(ptr, (int)value); }
    }

}