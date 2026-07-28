/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package org.lwjgl.system;

import org.jspecify.annotations.*;

import java.lang.foreign.*;

import static java.nio.charset.StandardCharsets.*;
import static org.lwjgl.system.APIUtil.*;

@NullMarked
class MemoryBackendUnsafeLegacy26 extends MemoryBackendUnsafeLegacy25 {

    protected static final MemorySegment VIRTUAL_MEMORY = MemorySegment
        .ofAddress(0L)
        .reinterpret(Long.MAX_VALUE);

    static {
        apiLogMore("Java 26 MemorySegment::getString(long) enabled");
    }

    @Override public final String getStringASCII(long source) {
        return VIRTUAL_MEMORY.getString(source, ISO_8859_1);
    }

    @Override public final String getStringUTF8(long source) {
        return VIRTUAL_MEMORY.getString(source, UTF_8);
    }

    // UTF-16 path is slower than new String(char[], int, int)
    /*@Override public final String getStringUTF16(long source) {
        return VIRTUAL_MEMORY.getString(source, UTF16);
    }*/

    // ----------------------------------------------
    // ----------------------------------------------
    // ----------------------------------------------

    static final class P64CL32 extends MemoryBackendUnsafeLegacy26 {
        @Override public long getCLong(long ptr)                      { return UNSAFE.getInt(null, ptr); }
        @Override public long getCLongUnaligned(long ptr)             { return getIntUnaligned(ptr); }

        @Override public void putCLong(long ptr, long value)          { UNSAFE.putInt(null, ptr, (int)value); }
        @Override public void putCLongUnaligned(long ptr, long value) { putIntUnaligned(ptr, (int)value); }
    }

    static final class P32 extends MemoryBackendUnsafeLegacy26 {
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