/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package org.lwjgl.system.libffi;

import org.testng.annotations.*;

import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.Pointer.*;
import static org.lwjgl.system.libffi.LibFFI.*;
import static org.testng.Assert.*;

@Test
public class LibFFIStructTest {

    public void testStructLayout() {
        FFIType s = FFIType.malloc();
        s.free();

        assertEquals(FFIType.SIZE, 0);
        assertEquals(FFIType.ALIGNMENT, POINTER_SIZE);
        assertEquals(FFIType.TYPE, POINTER_SIZE + 2);
        assertEquals(FFIType.ELEMENTS, POINTER_SIZE * 2);
    }

    public void testStructContainer() {
        long c = nmemAlloc(FFIType.SIZEOF);

        FFIType.nsize(c, 4);
        FFIType.nalignment(c, (short)8);
        FFIType.ntype(c, FFI_TYPE_INT);
        FFIType.nelements(c, null);

        assertEquals(FFIType.nsize(c), 4);
        assertEquals(FFIType.nalignment(c), 8);
        assertEquals(FFIType.ntype(c), FFI_TYPE_INT);
        assertEquals(FFIType.nelements(c, 0), null);

        nmemFree(c);
    }

    public void testStructInstance() {
        FFIType s = FFIType.malloc().set(4, (short)8, FFI_TYPE_INT, null);

        assertEquals(s.size(), 4);
        assertEquals(s.alignment(), 8);
        assertEquals(s.type(), FFI_TYPE_INT);
        assertEquals(s.elements(0), null);

        s.free();
    }

    public void testStructCopy() {
        FFIType src = FFIType.malloc().set(4, (short)8, FFI_TYPE_INT, null);

        FFIType dst = FFIType.calloc();
        dst.set(src);

        assertEquals(dst.size(), src.size());
        assertEquals(dst.alignment(), src.alignment());
        assertEquals(dst.type(), src.type());
        assertEquals(FFIType.nelements(dst.address(), 0), FFIType.nelements(src.address(), 0));

        dst.free();
        src.free();
    }

    public void testStructBuffer() {
        FFIType.Buffer b = FFIType.calloc(1);

        // copy
        FFIType copy = FFIType.malloc();
        memSet(copy.address(), 0xFF, FFIType.SIZEOF); // garbage
        b.get(0, copy); // calloc above has filled with zeroes

        // view
        FFIType view = b.get(0);

        // flyweight API
        b
            .size(4)
            .alignment((short)8)
            .type(FFI_TYPE_INT)
            .elements(null);

        // buffer changed
        assertEquals(b.size(), 4);
        assertEquals(b.alignment(), 8);
        assertEquals(b.type(), FFI_TYPE_INT);
        assertEquals(b.elements(0), null);

        // view changed
        assertEquals(view.size(), 4);
        assertEquals(view.alignment(), 8);
        assertEquals(view.type(), FFI_TYPE_INT);
        assertEquals(view.elements(0), null);

        // copy not changed
        assertEquals(copy.size(), 0);
        assertEquals(copy.alignment(), 0);
        assertEquals(copy.type(), NULL);
        assertEquals(copy.elements(0), null);

        copy.free();
        b.free();
    }

    public void testStructBufferIteration() {
        FFIType.Buffer b = FFIType.calloc(10);

        while (b.hasRemaining()) {
            int pos = b.position();

            FFIType value = b.get();

            assertEquals(value.address(), b.address0() + pos * FFIType.SIZEOF);
            assertEquals(b.address(), value.address() + FFIType.SIZEOF);
        }

        assertEquals(b.remaining(), 0);
        b.flip();
        assertEquals(b.address(), b.address0());

        b.free();
    }

    public void testStructBufferIterationAbs() {
        FFIType.Buffer b = FFIType.calloc(10);

        int i = 0;
        while (i < b.capacity()) {
            FFIType value = b.get(i);

            assertEquals(value.address(), b.address0() + i * FFIType.SIZEOF);
            i++;
        }

        assertEquals(b.remaining(), b.capacity());
        assertEquals(b.address(), b.address0());

        b.free();
    }

}