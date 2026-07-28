/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package org.lwjgl.system;

import org.jspecify.annotations.*;

import java.lang.foreign.*;
import java.nio.*;

import static java.nio.charset.StandardCharsets.*;
import static org.lwjgl.system.APIUtil.*;
import static org.lwjgl.system.MemoryUtil.*;

@NullMarked
class MemoryBackendFFM27 extends MemoryBackendFFM26 {

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

    @Override public final ByteBuffer allocateUTF8(String text, boolean nullTerminated, MemoryAllocator allocator) {
        var segment = new StringAllocator(allocator, nullTerminated ? 1L : 0L, 0L)
            .allocateFrom(text, UTF_8, 0, text.length());

        if (nullTerminated) {
            segment.set(ValueLayout.JAVA_BYTE, segment.byteSize() - 1L, (byte)0);
        }

        return segment
            .asByteBuffer()
            .order(ByteOrder.nativeOrder());
    }

    @Override public final int putStringUTF8(String text, boolean nullTerminated, long target, int maxLength) {
        var length = 0L;
        try {
            var segment = VIRTUAL_MEMORY.asSlice(target, maxLength - (nullTerminated ? 1 : 0));
            length = MemorySegment.copy(text, UTF_8, 0, segment, 0L, text.length());
            if (nullTerminated) {
                VIRTUAL_MEMORY.set(ValueLayout.JAVA_BYTE, target + length, (byte)0);
            }
        } catch (IndexOutOfBoundsException e) {
            throw new BufferOverflowException();
        }

        return (int)length + (nullTerminated ? 1 : 0);
    }

    // ----------------------------------------------
    // ----------------------------------------------
    // ----------------------------------------------

    static final class P64CL32 extends MemoryBackendFFM27 {
        @Override public long getCLong(long ptr)                      { return VIRTUAL_MEMORY.get(JAVA_INT, ptr); }
        @Override public long getCLongUnaligned(long ptr)             { return VIRTUAL_MEMORY.get(ValueLayout.JAVA_INT_UNALIGNED, ptr); }

        @Override public void putCLong(long ptr, long value)          { VIRTUAL_MEMORY.set(JAVA_INT, ptr, (int)value); }
        @Override public void putCLongUnaligned(long ptr, long value) { VIRTUAL_MEMORY.set(ValueLayout.JAVA_INT_UNALIGNED, ptr, (int)value); }
    }

    static final class P32 extends MemoryBackendFFM27 {
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