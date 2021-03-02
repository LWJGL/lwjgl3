/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package openxr.templates

import org.lwjgl.generator.*
import core.windows.*
import core.linux.*
import openxr.*
import openxr.KHR as KHR_

val KHR_opengl_enable = "KHROpenglEnable".nativeClassXR("KHR_opengl_enable", type = "instance", postfix = KHR_) {
    documentation =
        """
        The $templateName extension.
        """

    IntConstant(
        "The extension specification version.",

        "KHR_opengl_enable_SPEC_VERSION".."9"
    )

    StringConstant(
        "The extension name.",

        "KHR_OPENGL_ENABLE_EXTENSION_NAME".."XR_KHR_opengl_enable"
    )

    EnumConstant(
        "Extends {@code XrStructureType}.",

        "TYPE_GRAPHICS_BINDING_OPENGL_WIN32_KHR".."1000023000",
        "TYPE_GRAPHICS_BINDING_OPENGL_XLIB_KHR".."1000023001",
        "TYPE_GRAPHICS_BINDING_OPENGL_XCB_KHR".."1000023002",
        "TYPE_GRAPHICS_BINDING_OPENGL_WAYLAND_KHR".."1000023003",
        "TYPE_SWAPCHAIN_IMAGE_OPENGL_KHR".."1000023004",
        "TYPE_GRAPHICS_REQUIREMENTS_OPENGL_KHR".."1000023005"
    )

    XrResult(
        "GetOpenGLGraphicsRequirementsKHR",
        "",

        XrInstance("instance", ""),
        XrSystemId("systemId", ""),
        XrGraphicsRequirementsOpenGLKHR.p("graphicsRequirements", "")
    )
}