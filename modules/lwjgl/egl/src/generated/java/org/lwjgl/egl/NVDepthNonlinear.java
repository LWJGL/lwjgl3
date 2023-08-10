/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.egl;

/**
 * Native bindings to the <a href="https://www.khronos.org/registry/EGL/extensions/NV/EGL_NV_depth_nonlinear.txt">NV_depth_nonlinear</a> extension.
 * 
 * <p>Due to the perspective divide, conventional integer Z-buffers have a hyperbolic distribution of encodings between the near plane and the far plane.
 * This can result in inaccurate depth testing, particularly when the number of depth buffer bits is small and objects are rendered near the far plane.</p>
 * 
 * <p>Particularly when the number of depth buffer bits is limited (desirable and/or required in low-memory environments), artifacts due to this loss of
 * precision may occur even with relatively modest far plane-to-near plane ratios (e.g., greater than 100:1).</p>
 * 
 * <p>Many attempts have been made to provide alternate encodings for Z-buffer (or alternate formulations for the stored depth) to reduce the artifacts
 * caused by perspective division, such as W-buffers, Z-complement buffers and floating-point 1-Z buffers.</p>
 * 
 * <p>This extension adds a non-linear encoded Z buffer to OpenGL, which can improve the practically useful range of, e.g. 16-bit depth buffers by up to a
 * factor of 16, greatly improving depth test quality in applications where the ratio between the near and far planes can not be as tightly controlled.</p>
 * 
 * <p>Requires {@link EGL11 EGL 1.1}.</p>
 */
public final class NVDepthNonlinear {

    public static final int
        EGL_DEPTH_ENCODING_NV           = 0x30E2,
        EGL_DEPTH_ENCODING_NONE_NV      = 0,
        EGL_DEPTH_ENCODING_NONLINEAR_NV = 0x30E3;

    private NVDepthNonlinear() {}

}