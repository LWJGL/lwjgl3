/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.egl;

/**
 * Native bindings to the <a href="https://www.khronos.org/registry/EGL/extensions/EXT/EGL_EXT_device_drm.txt">EXT_output_drm</a> extension.
 * 
 * <p>Increasingly, EGL and its client APIs are being used in place of "native" rendering APIs to implement the basic graphics functionality of native
 * windowing systems. This creates demand for a method to initialize EGL displays and surfaces directly on top of native GPU or device objects rather than
 * native window system objects. The mechanics of enumerating the underlying native devices and constructing EGL displays and surfaces from them have been
 * solved in various platform and implementation- specific ways. The EGL device family of extensions offers a standardized framework for bootstrapping EGL
 * without the use of any underlying "native" APIs or functionality.</p>
 * 
 * <p>These extensions define how to map device and output handles between EGL and DRM/KMS. An EGL implementation which provides these extensions must have
 * access to sufficient knowledge of the DRM implementation to be able to perform these mappings. No requirements are imposed on how this information is
 * obtained, nor does this support have any implications for how EGL devices and outputs are implemented. Among the possibilities, support may be
 * implemented in a generic fashion by layering on top of DRM, or EGL and DRM backends may be provided by the same vendor and share privileged lower level
 * resources. An implementation which supports these extensions may support other low level device interfaces, such as OpenWF Display, as well.</p>
 * 
 * <p>Requires {@link EXTOutputBase EXT_output_base}.</p>
 */
public final class EXTOutputDRM {

    public static final int
        EGL_DRM_CRTC_EXT      = 0x3234,
        EGL_DRM_PLANE_EXT     = 0x3235,
        EGL_DRM_CONNECTOR_EXT = 0x3236;

    private EXTOutputDRM() {}

}