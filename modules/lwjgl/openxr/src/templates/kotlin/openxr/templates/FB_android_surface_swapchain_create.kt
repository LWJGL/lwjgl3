/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package openxr.templates

import org.lwjgl.generator.*
import openxr.*

val FB_android_surface_swapchain_create = "FBAndroidSurfaceSwapchainCreate".nativeClassXR("FB_android_surface_swapchain_create", type = "instance", postfix = FB) {
    documentation =
        """
        The $templateName extension.
        """

    IntConstant(
        "The extension specification version.",

        "FB_android_surface_swapchain_create_SPEC_VERSION".."1"
    )

    StringConstant(
        "The extension name.",

        "FB_ANDROID_SURFACE_SWAPCHAIN_CREATE_EXTENSION_NAME".."XR_FB_android_surface_swapchain_create"
    )

    EnumConstant(
        "Extends {@code XrStructureType}.",

        "TYPE_ANDROID_SURFACE_SWAPCHAIN_CREATE_INFO_FB".."1000070000"
    )
}