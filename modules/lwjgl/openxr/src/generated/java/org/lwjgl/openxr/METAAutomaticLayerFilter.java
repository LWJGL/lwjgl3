/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.openxr;

/**
 * The <a href="https://registry.khronos.org/OpenXR/specs/1.1/html/xrspec.html#XR_META_automatic_layer_filter">XR_META_automatic_layer_filter</a> extension.
 * 
 * <p>This extension defines a new flag in {@code XrCompositionLayerSettingsFlagBitsFB} that allows applications to provide a hint to the runtime to automatically toggle a layer filtering mechanism. The layer filtering helps alleviate visual quality artifacts such as blur and flicker.</p>
 * 
 * <p>Note: The runtime <b>may</b> use any factors it wishes to apply a filter to the layer. These <b>may</b> include not only fixed factors such as screen resolution, HMD type, and swapchain resolution, but also dynamic ones such as layer pose and system-wide GPU utilization.</p>
 */
public final class METAAutomaticLayerFilter {

    /** The extension specification version. */
    public static final int XR_META_automatic_layer_filter_SPEC_VERSION = 1;

    /** The extension name. */
    public static final String XR_META_AUTOMATIC_LAYER_FILTER_EXTENSION_NAME = "XR_META_automatic_layer_filter";

    /** Extends {@code XrCompositionLayerSettingsFlagBitsFB}. */
    public static final int XR_COMPOSITION_LAYER_SETTINGS_AUTO_LAYER_FILTER_BIT_META = 0x20;

    private METAAutomaticLayerFilter() {}

}