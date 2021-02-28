/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.openxr;

/** The MSFT_secondary_view_configuration extension. */
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