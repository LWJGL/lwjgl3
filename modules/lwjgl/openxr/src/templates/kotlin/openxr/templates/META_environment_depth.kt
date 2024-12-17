/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package openxr.templates

import org.lwjgl.generator.*
import openxr.*

val META_environment_depth = "METAEnvironmentDepth".nativeClassXR("META_environment_depth", type = "instance", postfix = "META") {
    IntConstant(
        "META_environment_depth_SPEC_VERSION".."1"
    )

    StringConstant(
        "META_ENVIRONMENT_DEPTH_EXTENSION_NAME".."XR_META_environment_depth"
    )

    EnumConstant(
        "OBJECT_TYPE_ENVIRONMENT_DEPTH_PROVIDER_META".."1000291000",
        "OBJECT_TYPE_ENVIRONMENT_DEPTH_SWAPCHAIN_META".."1000291001"
    )

    EnumConstant(
        "TYPE_ENVIRONMENT_DEPTH_PROVIDER_CREATE_INFO_META".."1000291000",
        "TYPE_ENVIRONMENT_DEPTH_SWAPCHAIN_CREATE_INFO_META".."1000291001",
        "TYPE_ENVIRONMENT_DEPTH_SWAPCHAIN_STATE_META".."1000291002",
        "TYPE_ENVIRONMENT_DEPTH_IMAGE_ACQUIRE_INFO_META".."1000291003",
        "TYPE_ENVIRONMENT_DEPTH_IMAGE_VIEW_META".."1000291004",
        "TYPE_ENVIRONMENT_DEPTH_IMAGE_META".."1000291005",
        "TYPE_ENVIRONMENT_DEPTH_HAND_REMOVAL_SET_INFO_META".."1000291006",
        "TYPE_SYSTEM_ENVIRONMENT_DEPTH_PROPERTIES_META".."1000291007"
    )

    EnumConstant(
        "ENVIRONMENT_DEPTH_NOT_AVAILABLE_META".."1000291000"
    )

    XrResult(
        "CreateEnvironmentDepthProviderMETA",

        XrSession("session"),
        XrEnvironmentDepthProviderCreateInfoMETA.const.p("createInfo"),
        Check(1)..XrEnvironmentDepthProviderMETA.p("environmentDepthProvider")
    )

    XrResult(
        "DestroyEnvironmentDepthProviderMETA",

        XrEnvironmentDepthProviderMETA("environmentDepthProvider")
    )

    XrResult(
        "StartEnvironmentDepthProviderMETA",

        XrEnvironmentDepthProviderMETA("environmentDepthProvider")
    )

    XrResult(
        "StopEnvironmentDepthProviderMETA",

        XrEnvironmentDepthProviderMETA("environmentDepthProvider")
    )

    XrResult(
        "CreateEnvironmentDepthSwapchainMETA",

        XrEnvironmentDepthProviderMETA("environmentDepthProvider"),
        XrEnvironmentDepthSwapchainCreateInfoMETA.const.p("createInfo"),
        Check(1)..XrEnvironmentDepthSwapchainMETA.p("swapchain")
    )

    XrResult(
        "DestroyEnvironmentDepthSwapchainMETA",

        XrEnvironmentDepthSwapchainMETA("swapchain")
    )

    XrResult(
        "EnumerateEnvironmentDepthSwapchainImagesMETA",

        XrEnvironmentDepthSwapchainMETA("swapchain"),
        AutoSize("images")..uint32_t("imageCapacityInput"),
        Check(1)..uint32_t.p("imageCountOutput"),
        nullable..XrSwapchainImageBaseHeader.p("images")
    )

    XrResult(
        "GetEnvironmentDepthSwapchainStateMETA",

        XrEnvironmentDepthSwapchainMETA("swapchain"),
        XrEnvironmentDepthSwapchainStateMETA.p("state")
    )

    XrResult(
        "AcquireEnvironmentDepthImageMETA",

        XrEnvironmentDepthProviderMETA("environmentDepthProvider"),
        XrEnvironmentDepthImageAcquireInfoMETA.const.p("acquireInfo"),
        XrEnvironmentDepthImageMETA.p("environmentDepthImage")
    )

    XrResult(
        "SetEnvironmentDepthHandRemovalMETA",

        XrEnvironmentDepthProviderMETA("environmentDepthProvider"),
        XrEnvironmentDepthHandRemovalSetInfoMETA.const.p("setInfo")
    )
}