/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package openxr.templates

import org.lwjgl.generator.*
import openxr.*

val KHR_opengl_enable = "KHROpenGLEnable".nativeClassXR("KHR_opengl_enable", type = "instance", postfix = "KHR") {
    IntConstant(
        "KHR_opengl_enable_SPEC_VERSION".."11"
    )

    StringConstant(
        "KHR_OPENGL_ENABLE_EXTENSION_NAME".."XR_KHR_opengl_enable"
    )

    EnumConstant(
        "TYPE_GRAPHICS_BINDING_OPENGL_WIN32_KHR".."1000023000",
        "TYPE_GRAPHICS_BINDING_OPENGL_XLIB_KHR".."1000023001",
        "TYPE_GRAPHICS_BINDING_OPENGL_XCB_KHR".."1000023002",
        "TYPE_GRAPHICS_BINDING_OPENGL_WAYLAND_KHR".."1000023003",
        "TYPE_SWAPCHAIN_IMAGE_OPENGL_KHR".."1000023004",
        "TYPE_GRAPHICS_REQUIREMENTS_OPENGL_KHR".."1000023005"
    )

    XrResult(
        "GetOpenGLGraphicsRequirementsKHR",

        XrInstance("instance"),
        XrSystemId("systemId"),
        XrGraphicsRequirementsOpenGLKHR.p("graphicsRequirements")
    )
}