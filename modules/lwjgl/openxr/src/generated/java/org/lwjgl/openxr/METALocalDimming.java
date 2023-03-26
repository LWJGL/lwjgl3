/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.openxr;

/**
 * The <a href="https://registry.khronos.org/OpenXR/specs/1.0/html/xrspec.html#XR_META_local_dimming">XR_META_local_dimming</a> extension.
 * 
 * <p>Local dimming allows to adjust backlight intensity of dark areas on the screen in order to increase content dynamic range. Local dimming feature is not intended for optical see-through HMDs.</p>
 * 
 * <p>An application <b>can</b> request the local dimming mode on a frame basis by chaining an {@link XrLocalDimmingFrameEndInfoMETA} structure to the {@link XrFrameEndInfo}.</p>
 * 
 * <ul>
 * <li>Using XrFrameEndInfoLocalDimmingFB is considered as a hint and will not trigger {@link XR10#xrEndFrame EndFrame} errors whether or not the requested dimming mode is fulfilled by the runtime.</li>
 * <li>The runtime will have full control of the local dimming mode and <b>may</b> disregard app requests. For example, the runtime <b>may</b> allow only one primary client to control the local dimming mode.</li>
 * </ul>
 */
public final class METALocalDimming {

    /** The extension specification version. */
    public static final int XR_META_local_dimming_SPEC_VERSION = 1;

    /** The extension name. */
    public static final String XR_META_LOCAL_DIMMING_EXTENSION_NAME = "XR_META_local_dimming";

    /** Extends {@code XrStructureType}. */
    public static final int XR_TYPE_LOCAL_DIMMING_FRAME_END_INFO_META = 1000216000;

    /**
     * XrLocalDimmingModeMETA - Local dimming modes
     * 
     * <h5>Enumerant Descriptions</h5>
     * 
     * <ul>
     * <li>{@link #XR_LOCAL_DIMMING_MODE_OFF_META LOCAL_DIMMING_MODE_OFF_META} — Local dimming is turned off by default for the current submitted frame. This is the same as not chaining {@code XrLocalDimmingModeMETA}.</li>
     * <li>{@link #XR_LOCAL_DIMMING_MODE_ON_META LOCAL_DIMMING_MODE_ON_META} — Local dimming is turned on for the current submitted frame.</li>
     * </ul>
     * 
     * <h5>See Also</h5>
     * 
     * <p>{@link XrLocalDimmingFrameEndInfoMETA}</p>
     */
    public static final int
        XR_LOCAL_DIMMING_MODE_OFF_META = 0,
        XR_LOCAL_DIMMING_MODE_ON_META  = 1;

    private METALocalDimming() {}

}