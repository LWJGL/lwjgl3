/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package openxr.templates

import org.lwjgl.generator.*
import openxr.*

val MSFT_secondary_view_configuration = "MSFTSecondaryViewConfiguration".nativeClassXR("MSFT_secondary_view_configuration", type = "instance", postfix = "MSFT") {
    documentation =
        """
        The <a href="https://registry.khronos.org/OpenXR/specs/1.0/html/xrspec.html\#XR_MSFT_secondary_view_configuration">XR_MSFT_secondary_view_configuration</a> extension.

        This extension allows an application to enable support for one or more <b>secondary view configurations</b>. A secondary view configuration is a well-known set of views that the runtime can make active while a session is running. In a frame where a secondary view configuration is active, the application’s single frame loop should additionally render into those active secondary views, sharing the frame waiting logic and update loop with the primary view configuration for that running session.

        A proper secondary view configuration support includes following steps:

        <ul>
            <li>When calling #CreateInstance(), enable the {@link MSFTSecondaryViewConfiguration XR_MSFT_secondary_view_configuration} extension and the extension defines a concrete secondary view configuration type, for example, {@link MSFTFirstPersonObserver XR_MSFT_first_person_observer}.</li>
            <li>Inspect supported secondary view configurations using the #EnumerateViewConfigurations() function.</li>
            <li>Enable supported secondary view configurations using the #BeginSession() function with an ##XrSecondaryViewConfigurationSessionBeginInfoMSFT chained extension structure.</li>
            <li>Inspect if an enabled secondary view configuration is activated by the system or the user using the #WaitFrame() function with an ##XrSecondaryViewConfigurationFrameStateMSFT chained extension structure.</li>
            <li>When a secondary view configuration is changed to active, get the latest view configuration properties using the #GetViewConfigurationProperties() and #EnumerateViewConfigurationViews() functions.</li>
            <li>Create the swapchain images for the active secondary view configuration using the #CreateSwapchain() function with an ##XrSecondaryViewConfigurationSwapchainCreateInfoMSFT chained extension structure using {@code recommendedImageRectWidth} and {@code recommendedImageRectHeight} in the corresponding ##XrViewConfigurationView structure returned from #EnumerateViewConfigurationViews().</li>
            <li>Locate the secondary view configuration views using the #LocateViews() function with the active secondary view configuration type.</li>
            <li>Submit the composition layers using the swapchain images for an active secondary view configuration using the #EndFrame() function with the ##XrSecondaryViewConfigurationFrameEndInfoMSFT chained extension structure.</li>
        </ul>
        """

    IntConstant(
        "The extension specification version.",

        "MSFT_secondary_view_configuration_SPEC_VERSION".."1"
    )

    StringConstant(
        "The extension name.",

        "MSFT_SECONDARY_VIEW_CONFIGURATION_EXTENSION_NAME".."XR_MSFT_secondary_view_configuration"
    )

    EnumConstant(
        "Extends {@code XrStructureType}.",

        "TYPE_SECONDARY_VIEW_CONFIGURATION_SESSION_BEGIN_INFO_MSFT".."1000053000",
        "TYPE_SECONDARY_VIEW_CONFIGURATION_STATE_MSFT".."1000053001",
        "TYPE_SECONDARY_VIEW_CONFIGURATION_FRAME_STATE_MSFT".."1000053002",
        "TYPE_SECONDARY_VIEW_CONFIGURATION_FRAME_END_INFO_MSFT".."1000053003",
        "TYPE_SECONDARY_VIEW_CONFIGURATION_LAYER_INFO_MSFT".."1000053004",
        "TYPE_SECONDARY_VIEW_CONFIGURATION_SWAPCHAIN_CREATE_INFO_MSFT".."1000053005"
    )

    EnumConstant(
        "Extends {@code XrResult}.",

        "ERROR_SECONDARY_VIEW_CONFIGURATION_TYPE_NOT_ENABLED_MSFT".."-1000053000"
    )
}