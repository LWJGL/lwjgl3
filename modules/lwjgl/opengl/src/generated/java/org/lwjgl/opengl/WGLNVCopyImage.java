/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.opengl;

import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.JNI.*;

public class WGLNVCopyImage {

    protected WGLNVCopyImage() {
        throw new UnsupportedOperationException();
    }

    // --- [ wglCopyImageSubDataNV ] ---

    /** {@code BOOL wglCopyImageSubDataNV(HGLRC srcRC, GLuint srcName, GLenum srcTarget, GLint srcLevel, GLint srcX, GLint srcY, GLint srcZ, HGLRC dstRC, GLuint dstName, GLenum dstTarget, GLint dstLevel, GLint dstX, GLint dstY, GLint dstZ, GLsizei width, GLsizei height, GLsizei depth)} */
    @NativeType("BOOL")
    public static boolean wglCopyImageSubDataNV(@NativeType("HGLRC") long srcRC, @NativeType("GLuint") int srcName, @NativeType("GLenum") int srcTarget, @NativeType("GLint") int srcLevel, @NativeType("GLint") int srcX, @NativeType("GLint") int srcY, @NativeType("GLint") int srcZ, @NativeType("HGLRC") long dstRC, @NativeType("GLuint") int dstName, @NativeType("GLenum") int dstTarget, @NativeType("GLint") int dstLevel, @NativeType("GLint") int dstX, @NativeType("GLint") int dstY, @NativeType("GLint") int dstZ, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height, @NativeType("GLsizei") int depth) {
        long __functionAddress = GL.getCapabilitiesWGL().wglCopyImageSubDataNV;
        if (CHECKS) {
            check(__functionAddress);
            check(srcRC);
            check(dstRC);
        }
        return callPPI(srcRC, srcName, srcTarget, srcLevel, srcX, srcY, srcZ, dstRC, dstName, dstTarget, dstLevel, dstX, dstY, dstZ, width, height, depth, __functionAddress) != 0;
    }

}