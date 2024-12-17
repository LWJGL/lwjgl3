/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package openxr.templates

import org.lwjgl.generator.*
import openxr.*

val MNDX_egl_enable = "MNDXEGLEnable".nativeClassXR("MNDX_egl_enable", type = "instance", postfix = "MNDX") {
    IntConstant(
        "MNDX_egl_enable_SPEC_VERSION".."2"
    )

    StringConstant(
        "MNDX_EGL_ENABLE_EXTENSION_NAME".."XR_MNDX_egl_enable"
    )

    EnumConstant(
        "TYPE_GRAPHICS_BINDING_EGL_MNDX".."1000048004"
    )
}