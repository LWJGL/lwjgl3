/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.opengl;

import org.lwjgl.system.*;

public class APPLEFlushBufferRange {

    static { GL.initialize(); }

    public static final int
        GL_BUFFER_SERIALIZED_MODIFY_APPLE = 0x8A12,
        GL_BUFFER_FLUSHING_UNMAP_APPLE    = 0x8A13;

    protected APPLEFlushBufferRange() {
        throw new UnsupportedOperationException();
    }

    // --- [ glBufferParameteriAPPLE ] ---

    /** {@code void glBufferParameteriAPPLE(GLenum target, GLenum pname, GLint param)} */
    public static native void glBufferParameteriAPPLE(@NativeType("GLenum") int target, @NativeType("GLenum") int pname, @NativeType("GLint") int param);

    // --- [ glFlushMappedBufferRangeAPPLE ] ---

    /** {@code void glFlushMappedBufferRangeAPPLE(GLenum target, GLintptr offset, GLsizeiptr size)} */
    public static native void glFlushMappedBufferRangeAPPLE(@NativeType("GLenum") int target, @NativeType("GLintptr") long offset, @NativeType("GLsizeiptr") long size);

}