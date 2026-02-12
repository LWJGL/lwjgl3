/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.opengl;

import java.nio.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;

public class APPLEVertexArrayRange {

    static { GL.initialize(); }

    public static final int GL_VERTEX_ARRAY_RANGE_APPLE = 0x851D;

    public static final int
        GL_VERTEX_ARRAY_RANGE_LENGTH_APPLE      = 0x851E,
        GL_MAX_VERTEX_ARRAY_RANGE_ELEMENT_APPLE = 0x8520;

    public static final int GL_VERTEX_ARRAY_RANGE_POINTER_APPLE = 0x8521;

    public static final int GL_VERTEX_ARRAY_STORAGE_HINT_APPLE = 0x851F;

    public static final int
        GL_STORAGE_CLIENT_APPLE = 0x85B4,
        GL_STORAGE_CACHED_APPLE = 0x85BE,
        GL_STORAGE_SHARED_APPLE = 0x85BF;

    protected APPLEVertexArrayRange() {
        throw new UnsupportedOperationException();
    }

    // --- [ glVertexArrayRangeAPPLE ] ---

    /** {@code void glVertexArrayRangeAPPLE(GLsizei length, void * pointer)} */
    public static native void nglVertexArrayRangeAPPLE(int length, long pointer);

    /** {@code void glVertexArrayRangeAPPLE(GLsizei length, void * pointer)} */
    public static void glVertexArrayRangeAPPLE(@NativeType("void *") ByteBuffer pointer) {
        nglVertexArrayRangeAPPLE(pointer.remaining(), memAddress(pointer));
    }

    // --- [ glFlushVertexArrayRangeAPPLE ] ---

    /** {@code void glFlushVertexArrayRangeAPPLE(GLsizei length, void * pointer)} */
    public static native void nglFlushVertexArrayRangeAPPLE(int length, long pointer);

    /** {@code void glFlushVertexArrayRangeAPPLE(GLsizei length, void * pointer)} */
    public static void glFlushVertexArrayRangeAPPLE(@NativeType("void *") ByteBuffer pointer) {
        nglFlushVertexArrayRangeAPPLE(pointer.remaining(), memAddress(pointer));
    }

    // --- [ glVertexArrayParameteriAPPLE ] ---

    /** {@code void glVertexArrayParameteriAPPLE(GLenum pname, GLint param)} */
    public static native void glVertexArrayParameteriAPPLE(@NativeType("GLenum") int pname, @NativeType("GLint") int param);

}