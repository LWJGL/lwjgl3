/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package org.lwjgl.system;

import org.jspecify.annotations.*;

import java.lang.foreign.*;

import static java.nio.charset.StandardCharsets.*;
import static org.lwjgl.system.APIUtil.*;

// No new API used, can build in core25 module
@NullMarked
class MemoryBackendFFM26 extends MemoryBackendFFM {

    static {
        apiLogMore("Java 26 MemorySegment::getString(long) enabled");
    }

    @Override public final String getStringASCII(long source) {
        return VIRTUAL_MEMORY.getString(source, ISO_8859_1);
    }

    @Override public final String getStringUTF8(long source) {
        return VIRTUAL_MEMORY.getString(source, UTF_8);
    }

    @Override public final String getStringUTF16(long source) {
        return VIRTUAL_MEMORY.getString(source, MemoryUtil.UTF16);
    }

    // ----------------------------------------------
    // ----------------------------------------------
    // ----------------------------------------------

    static final class P64CL32 extends MemoryBackendFFM26 {
        @Override public long getCLong(long ptr)                      { return VIRTUAL_MEMORY.get(JAVA_INT, ptr); }
        @Override public long getCLongUnaligned(long ptr)             { return VIRTUAL_MEMORY.get(ValueLayout.JAVA_INT_UNALIGNED, ptr); }

        @Override public void putCLong(long ptr, long value)          { VIRTUAL_MEMORY.set(JAVA_INT, ptr, (int)value); }
        @Override public void putCLongUnaligned(long ptr, long value) { VIRTUAL_MEMORY.set(ValueLayout.JAVA_INT_UNALIGNED, ptr, (int)value); }
    }

    static final class P32 extends MemoryBackendFFM26 {
        @Override public long getCLong(long ptr)                        { return VIRTUAL_MEMORY.get(JAVA_INT, ptr); }
        @Override public long getCLongUnaligned(long ptr)               { return VIRTUAL_MEMORY.get(ValueLayout.JAVA_INT_UNALIGNED, ptr); }

        @Override public long getAddress(long ptr)                      { return VIRTUAL_MEMORY.get(JAVA_INT, ptr) & 0xFFFF_FFFFL; }
        @Override public long getAddressUnaligned(long ptr)             { return VIRTUAL_MEMORY.get(ValueLayout.JAVA_INT_UNALIGNED, ptr) & 0xFFFF_FFFFL; }

        @Override public void putCLong(long ptr, long value)            { VIRTUAL_MEMORY.set(JAVA_INT, ptr, (int)value); }
        @Override public void putCLongUnaligned(long ptr, long value)   { VIRTUAL_MEMORY.set(ValueLayout.JAVA_INT_UNALIGNED, ptr, (int)value); }

        @Override public void putAddress(long ptr, long value)          { VIRTUAL_MEMORY.set(JAVA_INT, ptr, (int)value); }
        @Override public void putAddressUnaligned(long ptr, long value) { VIRTUAL_MEMORY.set(ValueLayout.JAVA_INT_UNALIGNED, ptr, (int)value); }
    }

}