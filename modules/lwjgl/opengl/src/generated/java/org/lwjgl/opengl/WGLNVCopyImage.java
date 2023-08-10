/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.opengl;

import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.JNI.*;

/**
 * Native bindings to the <a href="https://www.khronos.org/registry/OpenGL/extensions/NV/NV_copy_image.txt">WGL_NV_copy_image</a> extension.
 * 
 * <p>This extension enables efficient image data transfer between image objects (i.e. textures and renderbuffers) without the need to bind the objects or
 * otherwise configure the rendering pipeline. The WGL version allows copying between images in different contexts, even if those contexts are in
 * different sharelists or even on different physical devices.</p>
 */
public class WGLNVCopyImage {

    protected WGLNVCopyImage() {
        throw new UnsupportedOperationException();
    }

    // --- [ wglCopyImageSubDataNV ] ---

    /**
     * Behaves identically to the core function {@link #wglCopyImageSubDataNV CopyImageSubDataNV}, except that the {@code srcRC} and {@code dstRC} parameters specify
     * the contexts in which to look up the source and destination objects, respectively. A value of zero indicates that the currently bound context should be
     * used instead.
     *
     * @param srcRC     the source OpenGL context
     * @param srcName   the source object
     * @param srcTarget the source object target
     * @param srcLevel  the source level-of-detail number
     * @param srcX      the source texel x coordinate
     * @param srcY      the source texel y coordinate
     * @param srcZ      the source texel z coordinate
     * @param dstRC     the destination OpenGL context
     * @param dstName   the destination object
     * @param dstTarget the destination object target
     * @param dstLevel  the destination level-of-detail number
     * @param dstX      the destination texel x coordinate
     * @param dstY      the destination texel y coordinate
     * @param dstZ      the destination texel z coordinate
     * @param width     the number of texels to copy in the x-dimension
     * @param height    the number of texels to copy in the y-dimension
     * @param depth     the number of texels to copy in the z-dimension
     */
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