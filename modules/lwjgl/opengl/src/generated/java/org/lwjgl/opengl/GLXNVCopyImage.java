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
 * Native bindings to the <a href="https://www.khronos.org/registry/OpenGL/extensions/NV/NV_copy_image.txt">GLX_NV_copy_image</a> extension.
 * 
 * <p>This extension enables efficient image data transfer between image objects (i.e. textures and renderbuffers) without the need to bind the objects or
 * otherwise configure the rendering pipeline. The GLX version allows copying between images in different contexts, even if those contexts are in different
 * sharelists or even on different physical devices.</p>
 */
public class GLXNVCopyImage {

    protected GLXNVCopyImage() {
        throw new UnsupportedOperationException();
    }

    // --- [ glXCopyImageSubDataNV ] ---

    /**
     * Behaves identically to the core function {@link #glXCopyImageSubDataNV CopyImageSubDataNV}, except that the {@code srcCtx} and {@code dstCtx} parameters specify
     * the contexts in which to look up the source and destination objects, respectively. A value of {@code NULL} for either context indicates that the value which is
     * returned by {@link GLX#glXGetCurrentContext GetCurrentContext} should be used instead. Both contexts must share the same address space.
     *
     * @param display the connection to the X server
     * @param srcCtx  the source context
     * @param dstCtx  the destination context
     */
    public static void glXCopyImageSubDataNV(@NativeType("Display *") long display, @NativeType("GLXContext") long srcCtx, @NativeType("GLuint") int srcName, @NativeType("GLenum") int srcTarget, @NativeType("GLint") int srcLevel, @NativeType("GLint") int srcX, @NativeType("GLint") int srcY, @NativeType("GLint") int srcZ, @NativeType("GLXContext") long dstCtx, @NativeType("GLuint") int dstName, @NativeType("GLenum") int dstTarget, @NativeType("GLint") int dstLevel, @NativeType("GLint") int dstX, @NativeType("GLint") int dstY, @NativeType("GLint") int dstZ, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height, @NativeType("GLsizei") int depth) {
        long __functionAddress = GL.getCapabilitiesGLXClient().glXCopyImageSubDataNV;
        if (CHECKS) {
            check(__functionAddress);
            check(display);
        }
        callPPPV(display, srcCtx, srcName, srcTarget, srcLevel, srcX, srcY, srcZ, dstCtx, dstName, dstTarget, dstLevel, dstX, dstY, dstZ, width, height, depth, __functionAddress);
    }

}