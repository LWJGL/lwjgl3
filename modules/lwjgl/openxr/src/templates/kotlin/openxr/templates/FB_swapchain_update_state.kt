/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package openxr.templates

import org.lwjgl.generator.*
import openxr.*

val FB_swapchain_update_state = "FBSwapchainUpdateState".nativeClassXR("FB_swapchain_update_state", type = "instance", postfix = "FB") {
    IntConstant(
        "FB_swapchain_update_state_SPEC_VERSION".."3"
    )

    StringConstant(
        "FB_SWAPCHAIN_UPDATE_STATE_EXTENSION_NAME".."XR_FB_swapchain_update_state"
    )

    XrResult(
        "UpdateSwapchainFB",

        XrSwapchain("swapchain"),
        XrSwapchainStateBaseHeaderFB.const.p("state")
    )

    XrResult(
        "GetSwapchainStateFB",

        XrSwapchain("swapchain"),
        XrSwapchainStateBaseHeaderFB.p("state")
    )
}