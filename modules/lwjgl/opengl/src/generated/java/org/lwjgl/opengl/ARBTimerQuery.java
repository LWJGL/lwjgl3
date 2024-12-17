/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.opengl;

import java.nio.*;

import org.lwjgl.system.*;

public class ARBTimerQuery {

    static { GL.initialize(); }

    public static final int GL_TIME_ELAPSED = 0x88BF;

    public static final int GL_TIMESTAMP = 0x8E28;

    protected ARBTimerQuery() {
        throw new UnsupportedOperationException();
    }

    // --- [ glQueryCounter ] ---

    /** {@code void glQueryCounter(GLuint id, GLenum target)} */
    public static void glQueryCounter(@NativeType("GLuint") int id, @NativeType("GLenum") int target) {
        GL33C.glQueryCounter(id, target);
    }

    // --- [ glGetQueryObjecti64v ] ---

    /** {@code void glGetQueryObjecti64v(GLuint id, GLenum pname, GLint64 * params)} */
    public static void nglGetQueryObjecti64v(int id, int pname, long params) {
        GL33C.nglGetQueryObjecti64v(id, pname, params);
    }

    /** {@code void glGetQueryObjecti64v(GLuint id, GLenum pname, GLint64 * params)} */
    public static void glGetQueryObjecti64v(@NativeType("GLuint") int id, @NativeType("GLenum") int pname, @NativeType("GLint64 *") LongBuffer params) {
        GL33C.glGetQueryObjecti64v(id, pname, params);
    }

    /** {@code void glGetQueryObjecti64v(GLuint id, GLenum pname, GLint64 * params)} */
    public static void glGetQueryObjecti64v(@NativeType("GLuint") int id, @NativeType("GLenum") int pname, @NativeType("GLint64 *") long params) {
        GL33C.glGetQueryObjecti64v(id, pname, params);
    }

    /** {@code void glGetQueryObjecti64v(GLuint id, GLenum pname, GLint64 * params)} */
    @NativeType("void")
    public static long glGetQueryObjecti64(@NativeType("GLuint") int id, @NativeType("GLenum") int pname) {
        return GL33C.glGetQueryObjecti64(id, pname);
    }

    // --- [ glGetQueryObjectui64v ] ---

    /** {@code void glGetQueryObjectui64v(GLuint id, GLenum pname, GLuint64 * params)} */
    public static void nglGetQueryObjectui64v(int id, int pname, long params) {
        GL33C.nglGetQueryObjectui64v(id, pname, params);
    }

    /** {@code void glGetQueryObjectui64v(GLuint id, GLenum pname, GLuint64 * params)} */
    public static void glGetQueryObjectui64v(@NativeType("GLuint") int id, @NativeType("GLenum") int pname, @NativeType("GLuint64 *") LongBuffer params) {
        GL33C.glGetQueryObjectui64v(id, pname, params);
    }

    /** {@code void glGetQueryObjectui64v(GLuint id, GLenum pname, GLuint64 * params)} */
    public static void glGetQueryObjectui64v(@NativeType("GLuint") int id, @NativeType("GLenum") int pname, @NativeType("GLuint64 *") long params) {
        GL33C.glGetQueryObjectui64v(id, pname, params);
    }

    /** {@code void glGetQueryObjectui64v(GLuint id, GLenum pname, GLuint64 * params)} */
    @NativeType("void")
    public static long glGetQueryObjectui64(@NativeType("GLuint") int id, @NativeType("GLenum") int pname) {
        return GL33C.glGetQueryObjectui64(id, pname);
    }

    /** {@code void glGetQueryObjecti64v(GLuint id, GLenum pname, GLint64 * params)} */
    public static void glGetQueryObjecti64v(@NativeType("GLuint") int id, @NativeType("GLenum") int pname, @NativeType("GLint64 *") long[] params) {
        GL33C.glGetQueryObjecti64v(id, pname, params);
    }

    /** {@code void glGetQueryObjectui64v(GLuint id, GLenum pname, GLuint64 * params)} */
    public static void glGetQueryObjectui64v(@NativeType("GLuint") int id, @NativeType("GLenum") int pname, @NativeType("GLuint64 *") long[] params) {
        GL33C.glGetQueryObjectui64v(id, pname, params);
    }

}