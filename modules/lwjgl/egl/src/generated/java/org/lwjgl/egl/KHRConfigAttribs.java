/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.egl;

/**
 * Native bindings to the <a href="https://www.khronos.org/registry/EGL/extensions/KHR/EGL_KHR_config_attribs.txt">KHR_config_attribs</a> extension.
 * 
 * <p>This extension adds new EGL config attributes and attribute bits that express limitations of configs on a per-API basis, including whether client APIs
 * created with respect to a config are expected to pass conformance, and which optional OpenVG color space and alpha mask format attributes are valid at
 * surface creation time.</p>
 * 
 * <p>Requires {@link EGL12 EGL 1.2}.</p>
 */
public final class KHRConfigAttribs {

    public static final int
        EGL_CONFORMANT_KHR               = 0x3042,
        EGL_VG_COLORSPACE_LINEAR_BIT_KHR = 0x20,
        EGL_VG_ALPHA_FORMAT_PRE_BIT_KHR  = 0x40;

    private KHRConfigAttribs() {}

}