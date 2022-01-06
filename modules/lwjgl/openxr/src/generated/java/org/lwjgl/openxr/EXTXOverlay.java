/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.openxr;

/** The EXTX_overlay extension. */
public final class EXTXOverlay {

    /** The extension specification version. */
    public static final int XR_EXTX_overlay_SPEC_VERSION = 5;

    /** The extension name. */
    public static final String XR_EXTX_OVERLAY_EXTENSION_NAME = "XR_EXTX_overlay";

    /**
     * Extends {@code XrStructureType}.
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #XR_TYPE_SESSION_CREATE_INFO_OVERLAY_EXTX TYPE_SESSION_CREATE_INFO_OVERLAY_EXTX}</li>
     * <li>{@link #XR_TYPE_EVENT_DATA_MAIN_SESSION_VISIBILITY_CHANGED_EXTX TYPE_EVENT_DATA_MAIN_SESSION_VISIBILITY_CHANGED_EXTX}</li>
     * </ul>
     */
    public static final int
        XR_TYPE_SESSION_CREATE_INFO_OVERLAY_EXTX                = 1000033000,
        XR_TYPE_EVENT_DATA_MAIN_SESSION_VISIBILITY_CHANGED_EXTX = 1000033003;

    /** XrOverlayMainSessionFlagBitsEXTX */
    public static final int XR_OVERLAY_MAIN_SESSION_ENABLED_COMPOSITION_LAYER_INFO_DEPTH_BIT_EXTX = 0x1;

    private EXTXOverlay() {}

}