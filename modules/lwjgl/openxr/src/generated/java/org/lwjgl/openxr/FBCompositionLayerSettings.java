/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.openxr;

/**
 * The <a href="https://registry.khronos.org/OpenXR/specs/1.1/html/xrspec.html#XR_FB_composition_layer_settings">XR_FB_composition_layer_settings</a> extension.
 * 
 * <p>This extension allows applications to request the use of processing options such as sharpening or super-sampling on a composition layer.</p>
 * 
 * <p>In order to enable the functionality of this extension, you <b>must</b> pass the name of the extension into {@link XR10#xrCreateInstance CreateInstance} via the {@link XrInstanceCreateInfo}{@code ::enabledExtensionNames} parameter as indicated in the <a href="https://registry.khronos.org/OpenXR/specs/1.1/html/xrspec.html#fundamentals-extensions">extension</a> section.</p>
 */
public final class FBCompositionLayerSettings {

    /** The extension specification version. */
    public static final int XR_FB_composition_layer_settings_SPEC_VERSION = 1;

    /** The extension name. */
    public static final String XR_FB_COMPOSITION_LAYER_SETTINGS_EXTENSION_NAME = "XR_FB_composition_layer_settings";

    /** Extends {@code XrStructureType}. */
    public static final int XR_TYPE_COMPOSITION_LAYER_SETTINGS_FB = 1000204000;

    /**
     * XrCompositionLayerSettingsFlagBitsFB - XrCompositionLayerSettingsFlagBitsFB
     * 
     * <h5>Flag Descriptions</h5>
     * 
     * <ul>
     * <li>{@link #XR_COMPOSITION_LAYER_SETTINGS_NORMAL_SUPER_SAMPLING_BIT_FB COMPOSITION_LAYER_SETTINGS_NORMAL_SUPER_SAMPLING_BIT_FB} — Indicates compositor <b>may</b> use layer texture supersampling.</li>
     * <li>{@link #XR_COMPOSITION_LAYER_SETTINGS_QUALITY_SUPER_SAMPLING_BIT_FB COMPOSITION_LAYER_SETTINGS_QUALITY_SUPER_SAMPLING_BIT_FB} — Indicates compositor <b>may</b> use high quality layer texture supersampling.</li>
     * <li>{@link #XR_COMPOSITION_LAYER_SETTINGS_NORMAL_SHARPENING_BIT_FB COMPOSITION_LAYER_SETTINGS_NORMAL_SHARPENING_BIT_FB} — Indicates compositor <b>may</b> use layer texture sharpening.</li>
     * <li>{@link #XR_COMPOSITION_LAYER_SETTINGS_QUALITY_SHARPENING_BIT_FB COMPOSITION_LAYER_SETTINGS_QUALITY_SHARPENING_BIT_FB} — Indicates compositor <b>may</b> use high quality layer texture sharpening.</li>
     * <li>{@link METAAutomaticLayerFilter#XR_COMPOSITION_LAYER_SETTINGS_AUTO_LAYER_FILTER_BIT_META COMPOSITION_LAYER_SETTINGS_AUTO_LAYER_FILTER_BIT_META} — Indicates compositor <b>may</b> automatically toggle a texture filtering mechanism to improve visual quality of layer. This <b>must</b> not be the only bit set. (Added by {@link METAAutomaticLayerFilter XR_META_automatic_layer_filter})  (Added by the {@link METAAutomaticLayerFilter XR_META_automatic_layer_filter} extension)</li>
     * </ul>
     */
    public static final int
        XR_COMPOSITION_LAYER_SETTINGS_NORMAL_SUPER_SAMPLING_BIT_FB  = 0x1,
        XR_COMPOSITION_LAYER_SETTINGS_QUALITY_SUPER_SAMPLING_BIT_FB = 0x2,
        XR_COMPOSITION_LAYER_SETTINGS_NORMAL_SHARPENING_BIT_FB      = 0x4,
        XR_COMPOSITION_LAYER_SETTINGS_QUALITY_SHARPENING_BIT_FB     = 0x8;

    private FBCompositionLayerSettings() {}

}