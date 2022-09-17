/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package openxr.templates

import org.lwjgl.generator.*
import openxr.*

val MNDX_egl_enable = "MNDXEGLEnable".nativeClassXR("MNDX_egl_enable", type = "instance", postfix = "MNDX") {
    documentation =
        """
        The <a href="https://registry.khronos.org/OpenXR/specs/1.0/html/xrspec.html\#XR_MNDX_egl_enable">XR_MNDX_egl_enable</a> extension.

        This extension must be provided by runtimes supporting applications using the EGL API to create rendering contexts.

        <ul>
            <li>#USE_PLATFORM_EGL</li>
        </ul>
        """

    IntConstant(
        "The extension specification version.",

        "MNDX_egl_enable_SPEC_VERSION".."1"
    )

    StringConstant(
        "The extension name.",

        "MNDX_EGL_ENABLE_EXTENSION_NAME".."XR_MNDX_egl_enable"
    )

    EnumConstant(
        "Extends {@code XrStructureType}.",

        "TYPE_GRAPHICS_BINDING_EGL_MNDX".."1000048004"
    )
}