/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.opengl;

import java.nio.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.JNI.*;
import static org.lwjgl.system.MemoryUtil.*;

public class NVQueryResource {

    static { GL.initialize(); }

    public static final int GL_QUERY_RESOURCE_TYPE_VIDMEM_ALLOC_NV = 0x9540;

    public static final int
        GL_QUERY_RESOURCE_MEMTYPE_VIDMEM_NV = 0x9542,
        GL_QUERY_RESOURCE_SYS_RESERVED_NV   = 0x9544,
        GL_QUERY_RESOURCE_TEXTURE_NV        = 0x9545,
        GL_QUERY_RESOURCE_RENDERBUFFER_NV   = 0x9546,
        GL_QUERY_RESOURCE_BUFFEROBJECT_NV   = 0x9547;

    protected NVQueryResource() {
        throw new UnsupportedOperationException();
    }

    // --- [ glQueryResourceNV ] ---

    /** {@code GLint glQueryResourceNV(GLenum queryType, GLint pname, GLuint bufSize, GLint * buffer)} */
    public static native int nglQueryResourceNV(int queryType, int pname, int bufSize, long buffer);

    /** {@code GLint glQueryResourceNV(GLenum queryType, GLint pname, GLuint bufSize, GLint * buffer)} */
    @NativeType("GLint")
    public static int glQueryResourceNV(@NativeType("GLenum") int queryType, @NativeType("GLint") int pname, @NativeType("GLint *") IntBuffer buffer) {
        return nglQueryResourceNV(queryType, pname, buffer.remaining(), memAddress(buffer));
    }

    /** {@code GLint glQueryResourceNV(GLenum queryType, GLint pname, GLuint bufSize, GLint * buffer)} */
    @NativeType("GLint")
    public static int glQueryResourceNV(@NativeType("GLenum") int queryType, @NativeType("GLint") int pname, @NativeType("GLint *") int[] buffer) {
        long __functionAddress = GL.getICD().glQueryResourceNV;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPI(queryType, pname, buffer.length, buffer, __functionAddress);
    }

}