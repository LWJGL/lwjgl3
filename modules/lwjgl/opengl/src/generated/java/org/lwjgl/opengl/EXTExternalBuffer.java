/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.opengl;

import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;

public class EXTExternalBuffer {

    static { GL.initialize(); }

    protected EXTExternalBuffer() {
        throw new UnsupportedOperationException();
    }

    // --- [ glBufferStorageExternalEXT ] ---

    /** {@code void glBufferStorageExternalEXT(GLenum target, GLintptr offset, GLsizeiptr size, GLeglClientBufferEXT clientBuffer, GLbitfield flags)} */
    public static native void nglBufferStorageExternalEXT(int target, long offset, long size, long clientBuffer, int flags);

    /** {@code void glBufferStorageExternalEXT(GLenum target, GLintptr offset, GLsizeiptr size, GLeglClientBufferEXT clientBuffer, GLbitfield flags)} */
    public static void glBufferStorageExternalEXT(@NativeType("GLenum") int target, @NativeType("GLintptr") long offset, @NativeType("GLsizeiptr") long size, @NativeType("GLeglClientBufferEXT") long clientBuffer, @NativeType("GLbitfield") int flags) {
        if (CHECKS) {
            check(clientBuffer);
        }
        nglBufferStorageExternalEXT(target, offset, size, clientBuffer, flags);
    }

    // --- [ glNamedBufferStorageExternalEXT ] ---

    /** {@code void glNamedBufferStorageExternalEXT(GLuint buffer, GLintptr offset, GLsizeiptr size, GLeglClientBufferEXT clientBuffer, GLbitfield flags)} */
    public static native void nglNamedBufferStorageExternalEXT(int buffer, long offset, long size, long clientBuffer, int flags);

    /** {@code void glNamedBufferStorageExternalEXT(GLuint buffer, GLintptr offset, GLsizeiptr size, GLeglClientBufferEXT clientBuffer, GLbitfield flags)} */
    public static void glNamedBufferStorageExternalEXT(@NativeType("GLuint") int buffer, @NativeType("GLintptr") long offset, @NativeType("GLsizeiptr") long size, @NativeType("GLeglClientBufferEXT") long clientBuffer, @NativeType("GLbitfield") int flags) {
        if (CHECKS) {
            check(clientBuffer);
        }
        nglNamedBufferStorageExternalEXT(buffer, offset, size, clientBuffer, flags);
    }

}