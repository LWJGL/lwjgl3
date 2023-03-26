/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.openxr;

/**
 * The <a href="https://registry.khronos.org/OpenXR/specs/1.0/html/xrspec.html#XR_ML_frame_end_info">XR_ML_frame_end_info</a> extension.
 * 
 * <p>This extension provides access to Magic Leap specific extensions to frame settings like focus distance, vignette, and protection.</p>
 */
public final class MLFrameEndInfo {

    /** The extension specification version. */
    public static final int XR_ML_frame_end_info_SPEC_VERSION = 1;

    /** The extension name. */
    public static final String XR_ML_FRAME_END_INFO_EXTENSION_NAME = "XR_ML_frame_end_info";

    /** Extends {@code XrStructureType}. */
    public static final int XR_TYPE_FRAME_END_INFO_ML = 1000135000;

    /**
     * XrFrameEndInfoFlagBitsML - XrFrameEndInfoFlagBitsML
     * 
     * <h5>Description</h5>
     * 
     * <p>The flag bits have the following meanings:</p>
     * 
     * <h5>Flag Descriptions</h5>
     * 
     * <ul>
     * <li>{@link #XR_FRAME_END_INFO_PROTECTED_BIT_ML FRAME_END_INFO_PROTECTED_BIT_ML} — Indicates that the content for this frame is protected and should not be recorded or captured outside the graphics system.</li>
     * <li>{@link #XR_FRAME_END_INFO_VIGNETTE_BIT_ML FRAME_END_INFO_VIGNETTE_BIT_ML} — Indicates that a soft fade to transparent should be added to the frame in the compositor to blend any hard edges at the FOV limits.</li>
     * </ul>
     * 
     * <h5>See Also</h5>
     * 
     * <p>{@link XrFrameEndInfoML}, {@link XR10#xrEndFrame EndFrame}</p>
     */
    public static final int
        XR_FRAME_END_INFO_PROTECTED_BIT_ML = 0x1,
        XR_FRAME_END_INFO_VIGNETTE_BIT_ML  = 0x2;

    private MLFrameEndInfo() {}

}