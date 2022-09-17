/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.openxr;

/**
 * The <a href="https://registry.khronos.org/OpenXR/specs/1.0/html/xrspec.html#XR_EXT_view_configuration_depth_range">XR_EXT_view_configuration_depth_range</a> extension.
 * 
 * <p>For XR systems there may exist a per view recommended min/max depth range at which content should be rendered into the virtual world. The depth range may be driven by several factors, including user comfort, or fundamental capabilities of the system.</p>
 * 
 * <p>Displaying rendered content outside the recommended min/max depth range would violate the system requirements for a properly integrated application, and can result in a poor user experience due to observed visual artifacts, visual discomfort, or fatigue. The near/far depth values will fall in the range of (0..+infinity] where max({@code recommendedNearZ}, {@code minNearZ}) &lt; min({@code recommendedFarZ}, {@code maxFarZ}). Infinity is defined matching the standard library definition such that std::isinf will return true for a returned infinite value.</p>
 * 
 * <p>In order to provide the application with the appropriate depth range at which to render content for each {@link XrViewConfigurationView}, this extension provides additional view configuration information, as defined by {@link XrViewConfigurationDepthRangeEXT}, to inform the application of the min/max recommended and absolute distances at which content should be rendered for that view.</p>
 */
public final class EXTViewConfigurationDepthRange {

    /** The extension specification version. */
    public static final int XR_EXT_view_configuration_depth_range_SPEC_VERSION = 1;

    /** The extension name. */
    public static final String XR_EXT_VIEW_CONFIGURATION_DEPTH_RANGE_EXTENSION_NAME = "XR_EXT_view_configuration_depth_range";

    /** Extends {@code XrStructureType}. */
    public static final int XR_TYPE_VIEW_CONFIGURATION_DEPTH_RANGE_EXT = 1000046000;

    private EXTViewConfigurationDepthRange() {}

}