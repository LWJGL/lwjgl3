/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.openxr;

/** The FB_composition_layer_alpha_blend extension. */
public final class FBCompositionLayerAlphaBlend {

    /** The extension specification version. */
    public static final int XR_FB_composition_layer_alpha_blend_SPEC_VERSION = 2;

    /** The extension name. */
    public static final String XR_FB_COMPOSITION_LAYER_ALPHA_BLEND_EXTENSION_NAME = "XR_FB_composition_layer_alpha_blend";

    /** Extends {@code XrStructureType}. */
    public static final int XR_TYPE_COMPOSITION_LAYER_ALPHA_BLEND_FB = 1000041001;

    /**
     * XrBlendFactorFB - Blend Factor Types
     * 
     * <h5>See Also</h5>
     * 
     * <p>{@link XrCompositionLayerAlphaBlendFB}</p>
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #XR_BLEND_FACTOR_ZERO_FB BLEND_FACTOR_ZERO_FB}</li>
     * <li>{@link #XR_BLEND_FACTOR_ONE_FB BLEND_FACTOR_ONE_FB}</li>
     * <li>{@link #XR_BLEND_FACTOR_SRC_ALPHA_FB BLEND_FACTOR_SRC_ALPHA_FB}</li>
     * <li>{@link #XR_BLEND_FACTOR_ONE_MINUS_SRC_ALPHA_FB BLEND_FACTOR_ONE_MINUS_SRC_ALPHA_FB}</li>
     * <li>{@link #XR_BLEND_FACTOR_DST_ALPHA_FB BLEND_FACTOR_DST_ALPHA_FB}</li>
     * <li>{@link #XR_BLEND_FACTOR_ONE_MINUS_DST_ALPHA_FB BLEND_FACTOR_ONE_MINUS_DST_ALPHA_FB}</li>
     * </ul>
     */
    public static final int
        XR_BLEND_FACTOR_ZERO_FB                = 0,
        XR_BLEND_FACTOR_ONE_FB                 = 1,
        XR_BLEND_FACTOR_SRC_ALPHA_FB           = 2,
        XR_BLEND_FACTOR_ONE_MINUS_SRC_ALPHA_FB = 3,
        XR_BLEND_FACTOR_DST_ALPHA_FB           = 4,
        XR_BLEND_FACTOR_ONE_MINUS_DST_ALPHA_FB = 5;

    private FBCompositionLayerAlphaBlend() {}

}