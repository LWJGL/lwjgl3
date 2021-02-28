/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package openxr.templates

import org.lwjgl.generator.*
import opengl.*
import openxr.*

val KHR_opengl_es_enable = "KHROpenglEsEnable".nativeClassXR("KHR_opengl_es_enable", type = "instance", postfix = KHR) {
    documentation =
        """
        The $templateName extension.
        """

    IntConstant(
        "The extension specification version.",

        "KHR_opengl_es_enable_SPEC_VERSION".."7"
    )

    StringConstant(
        "The extension name.",

        "KHR_OPENGL_ES_ENABLE_EXTENSION_NAME".."XR_KHR_opengl_es_enable"
    )

    EnumConstant(
        "Extends {@code XrStructureType}.",

        "TYPE_GRAPHICS_BINDING_OPENGL_ES_ANDROID_KHR".."1000024001",
        "TYPE_SWAPCHAIN_IMAGE_OPENGL_ES_KHR".."1000024002",
        "TYPE_GRAPHICS_REQUIREMENTS_OPENGL_ES_KHR".."1000024003"
    )

    XrResult(
        "GetOpenGLESGraphicsRequirementsKHR",
        "",

        XrInstance("instance", ""),
        XrSystemId("systemId", ""),
        XrGraphicsRequirementsOpenGLESKHR.p("graphicsRequirements", "")
    )
}