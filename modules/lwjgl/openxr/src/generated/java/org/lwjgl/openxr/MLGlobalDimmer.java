/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.openxr;

/**
 * The <a href="https://registry.khronos.org/OpenXR/specs/1.0/html/xrspec.html#XR_ML_global_dimmer">XR_ML_global_dimmer</a> extension.
 * 
 * <p>This extension provides control over the global dimmer panel of the Magic Leap 2. The Global Dimming™ feature dims the entire display without dimming digital content to make text and images more solid and precise.</p>
 * 
 * <p>Note that when using the {@link XR10#XR_ENVIRONMENT_BLEND_MODE_ALPHA_BLEND ENVIRONMENT_BLEND_MODE_ALPHA_BLEND} mode the alpha channel of the color swapchain image is combined with the global dimmer value. The global dimmer however is able to address the whole panel whereas the alpha channel covers the video addressable portion.</p>
 */
public final class MLGlobalDimmer {

    /** The extension specification version. */
    public static final int XR_ML_global_dimmer_SPEC_VERSION = 1;

    /** The extension name. */
    public static final String XR_ML_GLOBAL_DIMMER_EXTENSION_NAME = "XR_ML_global_dimmer";

    /** Extends {@code XrStructureType}. */
    public static final int XR_TYPE_GLOBAL_DIMMER_FRAME_END_INFO_ML = 1000136000;

    /**
     * XrGlobalDimmerFrameEndInfoFlagBitsML - XrGlobalDimmerFrameEndInfoFlagBitsML
     * 
     * <h5>Description</h5>
     * 
     * <p>The flag bits have the following meanings:</p>
     * 
     * <h5>Flag Descriptions</h5>
     * 
     * <ul>
     * <li>{@link #XR_GLOBAL_DIMMER_FRAME_END_INFO_ENABLED_BIT_ML GLOBAL_DIMMER_FRAME_END_INFO_ENABLED_BIT_ML} — Indicates that the global dimmer <b>should</b> be enabled and controlled by {@link XrGlobalDimmerFrameEndInfoML}{@code ::dimmerValue}.</li>
     * </ul>
     * 
     * <h5>See Also</h5>
     * 
     * <p>{@link XrGlobalDimmerFrameEndInfoML}, {@link XR10#xrEndFrame EndFrame}</p>
     */
    public static final int XR_GLOBAL_DIMMER_FRAME_END_INFO_ENABLED_BIT_ML = 0x1;

    private MLGlobalDimmer() {}

}