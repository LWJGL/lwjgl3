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
 * Native bindings to the <a href="https://www.khronos.org/registry/OpenGL/extensions/ARB/WGL_ARB_make_current_read.txt">WGL_ARB_make_current_read</a> extension.
 * 
 * <p>The association of a separate "read" and "draw" DC with the current context allows for preprocessing of image data in an "off screen" DC which is then
 * read into a visible DC for final display.</p>
 * 
 * <p>Requires {@link WGLARBExtensionsString WGL_ARB_extensions_string}.</p>
 */
public class WGLARBMakeCurrentRead {

    /** New errors returned by {@link org.lwjgl.system.windows.WinBase#GetLastError}. */
    public static final int
        ERROR_INVALID_PIXEL_TYPE_ARB           = 0x2043,
        ERROR_INCOMPATIBLE_DEVICE_CONTEXTS_ARB = 0x2054;

    protected WGLARBMakeCurrentRead() {
        throw new UnsupportedOperationException();
    }

    // --- [ wglMakeContextCurrentARB ] ---

    /**
     * Associates the context {@code hglrc} with the device {@code drawDC} for draws and the device {@code readDC} for reads. All subsequent OpenGL calls made
     * by the calling thread are drawn on the device identified by {@code drawDC} and read on the device identified by {@code readDC}.
     * 
     * <p>The {@code drawDC} and {@code readDC} parameters must refer to drawing surfaces supported by OpenGL. These parameters need not be the same {@code hdc}
     * that was passed to {@link WGL#wglCreateContext CreateContext} when {@code hglrc} was created. {@code drawDC} must have the same pixel format and be created on the same
     * physical device as the {@code hdc} that was passed into wglCreateContext. {@code readDC} must be created on the same device as the {@code hdc} that was
     * passed to wglCreateContext and it must support the same pixel type as the pixel format of the {@code hdc} that was passed to wglCreateContext.</p>
     * 
     * <p>If {@code wglMakeContextCurrentARB} is used to associate a different device for reads than for draws, the "read" device will be used for the following
     * OpenGL operations:</p>
     * 
     * <ol>
     * <li>Any pixel data that are sourced based on the value of {@link GL11#GL_READ_BUFFER READ_BUFFER}. Note, that accumulation operations use the value of {@code READ_BUFFER}, but
     * are not allowed when a different device context is used for reads.  In this case, the accumulation operation will generate {@link GL11#GL_INVALID_OPERATION INVALID_OPERATION}.</li>
     * <li>Any depth values that are retrieved by {@link GL11C#glReadPixels ReadPixels}, {@link GL11#glCopyPixels CopyPixels}, or any OpenGL extension that sources depth images from the frame buffer in the
     * manner of {@code ReadPixels} and {@code CopyPixels}.</li>
     * <li>Any stencil values that are retrieved by {@code ReadPixels}, {@code CopyPixels}, or any OpenGL extension that sources stencil images from the
     * framebuffer in the manner of {@code ReadPixels} and {@code CopyPixels}.</li>
     * </ol>
     * 
     * <p>These frame buffer values are taken from the surface associated with the device context specified by {@code readDC}.</p>
     *
     * @param drawDC the "draw" device context
     * @param readDC the "read" device context
     * @param hglrc  the OpenGL context
     */
    @NativeType("BOOL")
    public static boolean wglMakeContextCurrentARB(@NativeType("HDC") long drawDC, @NativeType("HDC") long readDC, @NativeType("HGLRC") long hglrc) {
        long __functionAddress = GL.getCapabilitiesWGL().wglMakeContextCurrentARB;
        if (CHECKS) {
            check(__functionAddress);
            check(drawDC);
            check(readDC);
            check(hglrc);
        }
        return callPPPI(drawDC, readDC, hglrc, __functionAddress) != 0;
    }

    // --- [ wglGetCurrentReadDCARB ] ---

    /** Returns the "read" device context for the current OpenGL context. */
    @NativeType("HDC")
    public static long wglGetCurrentReadDCARB() {
        long __functionAddress = GL.getCapabilitiesWGL().wglGetCurrentReadDCARB;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callP(__functionAddress);
    }

}