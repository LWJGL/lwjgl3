/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.openxr;

/**
 * The <a href="https://registry.khronos.org/OpenXR/specs/1.0/html/xrspec.html#XR_MSFT_secondary_view_configuration">XR_MSFT_secondary_view_configuration</a> extension.
 * 
 * <p>This extension allows an application to enable support for one or more <b>secondary view configurations</b>. A secondary view configuration is a well-known set of views that the runtime can make active while a session is running. In a frame where a secondary view configuration is active, the application’s single frame loop should additionally render into those active secondary views, sharing the frame waiting logic and update loop with the primary view configuration for that running session.</p>
 * 
 * <p>A proper secondary view configuration support includes following steps:</p>
 * 
 * <ul>
 * <li>When calling {@link XR10#xrCreateInstance CreateInstance}, enable the {@link MSFTSecondaryViewConfiguration XR_MSFT_secondary_view_configuration} extension and the extension defines a concrete secondary view configuration type, for example, {@link MSFTFirstPersonObserver XR_MSFT_first_person_observer}.</li>
 * <li>Inspect supported secondary view configurations using the {@link XR10#xrEnumerateViewConfigurations EnumerateViewConfigurations} function.</li>
 * <li>Enable supported secondary view configurations using the {@link XR10#xrBeginSession BeginSession} function with an {@link XrSecondaryViewConfigurationSessionBeginInfoMSFT} chained extension structure.</li>
 * <li>Inspect if an enabled secondary view configuration is activated by the system or the user using the {@link XR10#xrWaitFrame WaitFrame} function with an {@link XrSecondaryViewConfigurationFrameStateMSFT} chained extension structure.</li>
 * <li>When a secondary view configuration is changed to active, get the latest view configuration properties using the {@link XR10#xrGetViewConfigurationProperties GetViewConfigurationProperties} and {@link XR10#xrEnumerateViewConfigurationViews EnumerateViewConfigurationViews} functions.</li>
 * <li>Create the swapchain images for the active secondary view configuration using the {@link XR10#xrCreateSwapchain CreateSwapchain} function with an {@link XrSecondaryViewConfigurationSwapchainCreateInfoMSFT} chained extension structure using {@code recommendedImageRectWidth} and {@code recommendedImageRectHeight} in the corresponding {@link XrViewConfigurationView} structure returned from {@link XR10#xrEnumerateViewConfigurationViews EnumerateViewConfigurationViews}.</li>
 * <li>Locate the secondary view configuration views using the {@link XR10#xrLocateViews LocateViews} function with the active secondary view configuration type.</li>
 * <li>Submit the composition layers using the swapchain images for an active secondary view configuration using the {@link XR10#xrEndFrame EndFrame} function with the {@link XrSecondaryViewConfigurationFrameEndInfoMSFT} chained extension structure.</li>
 * </ul>
 */
public final class MSFTSecondaryViewConfiguration {

    /** The extension specification version. */
    public static final int XR_MSFT_secondary_view_configuration_SPEC_VERSION = 1;

    /** The extension name. */
    public static final String XR_MSFT_SECONDARY_VIEW_CONFIGURATION_EXTENSION_NAME = "XR_MSFT_secondary_view_configuration";

    /**
     * Extends {@code XrStructureType}.
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #XR_TYPE_SECONDARY_VIEW_CONFIGURATION_SESSION_BEGIN_INFO_MSFT TYPE_SECONDARY_VIEW_CONFIGURATION_SESSION_BEGIN_INFO_MSFT}</li>
     * <li>{@link #XR_TYPE_SECONDARY_VIEW_CONFIGURATION_STATE_MSFT TYPE_SECONDARY_VIEW_CONFIGURATION_STATE_MSFT}</li>
     * <li>{@link #XR_TYPE_SECONDARY_VIEW_CONFIGURATION_FRAME_STATE_MSFT TYPE_SECONDARY_VIEW_CONFIGURATION_FRAME_STATE_MSFT}</li>
     * <li>{@link #XR_TYPE_SECONDARY_VIEW_CONFIGURATION_FRAME_END_INFO_MSFT TYPE_SECONDARY_VIEW_CONFIGURATION_FRAME_END_INFO_MSFT}</li>
     * <li>{@link #XR_TYPE_SECONDARY_VIEW_CONFIGURATION_LAYER_INFO_MSFT TYPE_SECONDARY_VIEW_CONFIGURATION_LAYER_INFO_MSFT}</li>
     * <li>{@link #XR_TYPE_SECONDARY_VIEW_CONFIGURATION_SWAPCHAIN_CREATE_INFO_MSFT TYPE_SECONDARY_VIEW_CONFIGURATION_SWAPCHAIN_CREATE_INFO_MSFT}</li>
     * </ul>
     */
    public static final int
        XR_TYPE_SECONDARY_VIEW_CONFIGURATION_SESSION_BEGIN_INFO_MSFT    = 1000053000,
        XR_TYPE_SECONDARY_VIEW_CONFIGURATION_STATE_MSFT                 = 1000053001,
        XR_TYPE_SECONDARY_VIEW_CONFIGURATION_FRAME_STATE_MSFT           = 1000053002,
        XR_TYPE_SECONDARY_VIEW_CONFIGURATION_FRAME_END_INFO_MSFT        = 1000053003,
        XR_TYPE_SECONDARY_VIEW_CONFIGURATION_LAYER_INFO_MSFT            = 1000053004,
        XR_TYPE_SECONDARY_VIEW_CONFIGURATION_SWAPCHAIN_CREATE_INFO_MSFT = 1000053005;

    /** Extends {@code XrResult}. */
    public static final int XR_ERROR_SECONDARY_VIEW_CONFIGURATION_TYPE_NOT_ENABLED_MSFT = -1000053000;

    private MSFTSecondaryViewConfiguration() {}

}