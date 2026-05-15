/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package org.lwjgl.system;

import org.jspecify.annotations.*;

import static org.lwjgl.system.APIUtil.*;

@NullMarked
class MemoryBackendUnsafeLegacy25 extends MemoryBackendUnsafeLegacy22 {

    static {
        apiLogMore("Java 25 memset enabled");
    }

    @SuppressWarnings("removal")
    @Override public final void memset(long ptr, int value, long bytes) {
        if (bytes == 0L) {
            return;
        }

        var b = (byte)(value & 0xFF);

        // On x64, setMemory has degraded performance with byte counts that are even.
        // Workaround by setting all but the last byte with setMemory, then setting the last byte separately.
        // Does not hurt on non-x64.
        var lastByteIndex = bytes - 1L;
        UNSAFE.setMemory(null, ptr, lastByteIndex + (bytes & 1L), b);
        UNSAFE.putByte(null, ptr + lastByteIndex, b);
    }

    // ----------------------------------------------
    // ----------------------------------------------
    // ----------------------------------------------

    static final class P64CL32 extends MemoryBackendUnsafeLegacy25 {
        @Override public long getCLong(long ptr)                      { return UNSAFE.getInt(null, ptr); }
        @Override public long getCLongUnaligned(long ptr)             { return getIntUnaligned(ptr); }

        @Override public void putCLong(long ptr, long value)          { UNSAFE.putInt(null, ptr, (int)value); }
        @Override public void putCLongUnaligned(long ptr, long value) { putIntUnaligned(ptr, (int)value); }
    }

    static final class P32 extends MemoryBackendUnsafeLegacy25 {
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