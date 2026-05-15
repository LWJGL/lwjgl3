/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package org.lwjgl.system;

import org.jspecify.annotations.*;

import static java.nio.charset.StandardCharsets.*;
import static org.lwjgl.system.APIUtil.*;

@NullMarked
class MemoryBackendUnsafeLegacy27 extends MemoryBackendUnsafeLegacy26 {

    static {
        apiLogMore("Java 27 MemorySegment::getString(long, Charset, long) enabled");
    }

    @Override public final String getStringASCII(long source, int length) {
        return VIRTUAL_MEMORY.getString(source, ISO_8859_1, length);
    }

    @Override public final String getStringUTF8(long source, int length) {
        return VIRTUAL_MEMORY.getString(source, UTF_8, length);
    }

    // UTF-16 path is slower than new String(char[], int, int)
    /*@Override public final String getStringUTF16(long source, int length) {
        return VIRTUAL_MEMORY.getString(source, UTF16, (long)length << 1);
    }*/

    // ----------------------------------------------
    // ----------------------------------------------
    // ----------------------------------------------

    static final class P64CL32 extends MemoryBackendUnsafeLegacy27 {
        @Override public long getCLong(long ptr)                      { return UNSAFE.getInt(null, ptr); }
        @Override public long getCLongUnaligned(long ptr)             { return getIntUnaligned(ptr); }

        @Override public void putCLong(long ptr, long value)          { UNSAFE.putInt(null, ptr, (int)value); }
        @Override public void putCLongUnaligned(long ptr, long value) { putIntUnaligned(ptr, (int)value); }
    }

    static final class P32 extends MemoryBackendUnsafeLegacy27 {
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