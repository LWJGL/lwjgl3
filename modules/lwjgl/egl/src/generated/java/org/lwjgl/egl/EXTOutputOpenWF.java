/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.egl;

/**
 * Native bindings to the <a href="https://www.khronos.org/registry/EGL/extensions/EXT/EGL_EXT_device_openwf.txt">EXT_output_openwf</a> extension.
 * 
 * <p>Increasingly, EGL and its client APIs are being used in place of "native" rendering APIs to implement the basic graphics functionality of native
 * windowing systems. This creates demand for a method to initialize EGL displays and surfaces directly on top of native GPU or device objects rather than
 * native window system objects. The mechanics of enumerating the underlying native devices and constructing EGL displays and surfaces from them have been
 * solved in various platform and implementation- specific ways. The EGL device family of extensions offers a standardized framework for bootstrapping EGL
 * without the use of any underlying "native" APIs or functionality.</p>
 * 
 * <p>These extensions define how to map device and output handles between EGL and OpenWF Display. An EGL implementation which provides these extensions must
 * have access to sufficient knowledge of the OpenWF implementation to be able to perform these mappings. No requirements are imposed on how this
 * information is obtained, nor does this support have any implications for how EGL devices and outputs are implemented. An implementation which supports
 * these extensions may support other low level device interfaces, such as DRM/KMS, as well.</p>
 * 
 * <p>Requires {@link EXTOutputBase EXT_output_base}.</p>
 */
public final class EXTOutputOpenWF {

    public static final int
        EGL_OPENWF_PIPELINE_ID_EXT = 0x3238,
        EGL_OPENWF_PORT_ID_EXT     = 0x3239;

    private EXTOutputOpenWF() {}

}