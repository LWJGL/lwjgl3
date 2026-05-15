/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package org.lwjgl.system;

import org.jspecify.annotations.*;

import static java.nio.charset.StandardCharsets.*;
import static org.lwjgl.system.APIUtil.*;
import static org.lwjgl.system.MemoryUtil.*;

// No new API used, can build in core module
class MemoryBackendUnsafeLegacy17 extends MemoryBackendUnsafeLegacy9 {

    static {
        apiLogMore("Java 17 memcpy enabled");
    }

    @Override public final void memcpy(long src, long dst, long bytes) {
        // Much better performance on Java 16+
        //UNSAFE.copyMemory(null, src, null, dst, bytes);

        if (bytes == 0L) {
            return;
        }

        // On x64, copyMemory has degraded performance with byte counts that are multiple of 4.
        // Workaround by copying all but the last byte with copyMemory, then copying the last byte separately.
        // Does not hurt on non-x64.
        long lastByteIndex = bytes - 1L;
        UNSAFE.copyMemory(null, src, null, dst, lastByteIndex + (bytes & 1L));
        UNSAFE.putByte(null, dst + lastByteIndex, UNSAFE.getByte(null, src + lastByteIndex));
    }

    @Override protected final void memcpy(Object src, long dst, long srcOffset, long bytes) {
        if (bytes == 0L) {
            return;
        }

        long lastByteIndex = bytes - 1L;

        UNSAFE.copyMemory(src, srcOffset, null, dst, lastByteIndex + (bytes & 1L));
        UNSAFE.putByte(null, dst + lastByteIndex, UNSAFE.getByte(src, srcOffset + lastByteIndex));
    }

    @Override protected final void memcpy(long src, Object dst, long dstOffset, long bytes) {
        if (bytes == 0L) {
            return;
        }

        long lastByteIndex = bytes - 1L;

        UNSAFE.copyMemory(null, src, dst, dstOffset, lastByteIndex + (bytes & 1L));
        UNSAFE.putByte(dst, dstOffset + lastByteIndex, UNSAFE.getByte(null, src + lastByteIndex));
    }

    // Restore original implementation
    @Override public String getStringASCII(long source, int length) {
        byte[] bytes = length <= ARRAY_TLC_SIZE ? ARRAY_TLC_BYTE.get() : new byte[length];
        memcpy(source, bytes, BASE_OFFSET_BYTE, length);
        return new String(bytes, 0, length, ISO_8859_1);
    }

    // ----------------------------------------------
    // ----------------------------------------------
    // ----------------------------------------------

    static final class P64CL32 extends MemoryBackendUnsafeLegacy17 {
        @Override public long getCLong(long ptr)                      { return UNSAFE.getInt(null, ptr); }
        @Override public long getCLongUnaligned(long ptr)             { return getIntUnaligned(ptr); }

        @Override public void putCLong(long ptr, long value)          { UNSAFE.putInt(null, ptr, (int)value); }
        @Override public void putCLongUnaligned(long ptr, long value) { putIntUnaligned(ptr, (int)value); }
    }

    static final class P32 extends MemoryBackendUnsafeLegacy17 {
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