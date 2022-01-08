/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package openxr.templates

import org.lwjgl.generator.*
import openxr.*

val FB_swapchain_update_state_opengl_es = "FBSwapchainUpdateStateOpenGLES".nativeClassXR("FB_swapchain_update_state_opengl_es", type = "instance", postfix = "FB") {
    documentation =
        """
        The $templateName extension.
        """

    IntConstant(
        "The extension specification version.",

        "FB_swapchain_update_state_opengl_es_SPEC_VERSION".."1"
    )

    StringConstant(
        "The extension name.",

        "FB_SWAPCHAIN_UPDATE_STATE_OPENGL_ES_EXTENSION_NAME".."XR_FB_swapchain_update_state_opengl_es"
    )

    EnumConstant(
        "Extends {@code XrStructureType}.",

        "TYPE_SWAPCHAIN_STATE_SAMPLER_OPENGL_ES_FB".."1000162000"
    )
}