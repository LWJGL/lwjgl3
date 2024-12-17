/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.opengl;

import java.nio.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;

public class NVVertexArrayRange {

    static { GL.initialize(); }

    public static final int GL_VERTEX_ARRAY_RANGE_NV = 0x851D;

    public static final int
        GL_VERTEX_ARRAY_RANGE_LENGTH_NV      = 0x851E,
        GL_VERTEX_ARRAY_RANGE_VALID_NV       = 0x851F,
        GL_MAX_VERTEX_ARRAY_RANGE_ELEMENT_NV = 0x8520;

    public static final int GL_VERTEX_ARRAY_RANGE_POINTER_NV = 0x8521;

    protected NVVertexArrayRange() {
        throw new UnsupportedOperationException();
    }

    // --- [ glVertexArrayRangeNV ] ---

    /** {@code void glVertexArrayRangeNV(GLsizei length, void * pointer)} */
    public static native void nglVertexArrayRangeNV(int length, long pointer);

    /** {@code void glVertexArrayRangeNV(GLsizei length, void * pointer)} */
    public static void glVertexArrayRangeNV(@NativeType("void *") ByteBuffer pointer) {
        nglVertexArrayRangeNV(pointer.remaining(), memAddress(pointer));
    }

    // --- [ glFlushVertexArrayRangeNV ] ---

    /** {@code void glFlushVertexArrayRangeNV(void)} */
    public static native void glFlushVertexArrayRangeNV();

}