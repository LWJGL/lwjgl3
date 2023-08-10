/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.egl;

/**
 * Native bindings to the <a href="https://www.khronos.org/registry/EGL/extensions/EXT/EGL_EXT_protected_surface.txt">EXT_protected_surface</a> extension.
 * 
 * <p>This extension adds a new EGL surface attribute EGL_PROTECTED_CONTENT_EXT to indicate if the content in the surface buffer is protected or not. If
 * surface attribute EGL_PROTECTED_CONTENT_EXT is EGL_TRUE, then the surface content is only accessible to secure accesses. Any attempt to access the
 * buffer content non-securely will fail and result in undefined behavior up to and including program termination. Also, any copy operations from the
 * protected surface to any non-protected surface by GPU are considered illegal.</p>
 * 
 * <p>Requires {@link EGL14 EGL 1.4} and {@link KHRImageBase KHR_image_base}.</p>
 */
public final class EXTProtectedSurface {

    public static final int EGL_PROTECTED_CONTENT_EXT = 0x32C0;

    private EXTProtectedSurface() {}

}