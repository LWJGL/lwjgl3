/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.opengl;

import java.nio.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;

/**
 * Native bindings to the <a href="https://www.khronos.org/registry/OpenGL/extensions/NV/NV_vertex_array_range.txt">NV_vertex_array_range</a> extension.
 * 
 * <p>The goal of this extension is to permit extremely high vertex processing rates via OpenGL vertex arrays even when the CPU lacks the necessary data
 * movement bandwidth to keep up with the rate at which the vertex engine can consume vertices.</p>
 */
public class NVVertexArrayRange {

    static { GL.initialize(); }

    /** Accepted by the {@code cap} parameter of EnableClientState, DisableClientState, and IsEnabled. */
    public static final int GL_VERTEX_ARRAY_RANGE_NV = 0x851D;

    /** Accepted by the {@code pname} parameter of GetBooleanv, GetIntegerv, GetFloatv, and GetDoublev. */
    public static final int
        GL_VERTEX_ARRAY_RANGE_LENGTH_NV      = 0x851E,
        GL_VERTEX_ARRAY_RANGE_VALID_NV       = 0x851F,
        GL_MAX_VERTEX_ARRAY_RANGE_ELEMENT_NV = 0x8520;

    /** Accepted by the {@code pname} parameter of GetPointerv. */
    public static final int GL_VERTEX_ARRAY_RANGE_POINTER_NV = 0x8521;

    protected NVVertexArrayRange() {
        throw new UnsupportedOperationException();
    }

    // --- [ glVertexArrayRangeNV ] ---

    public static native void nglVertexArrayRangeNV(int length, long pointer);

    public static void glVertexArrayRangeNV(@NativeType("void *") ByteBuffer pointer) {
        nglVertexArrayRangeNV(pointer.remaining(), memAddress(pointer));
    }

    // --- [ glFlushVertexArrayRangeNV ] ---

    public static native void glFlushVertexArrayRangeNV();

}