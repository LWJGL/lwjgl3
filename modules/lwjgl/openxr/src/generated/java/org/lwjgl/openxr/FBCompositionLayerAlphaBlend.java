/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.openxr;

/**
 * The <a href="https://registry.khronos.org/OpenXR/specs/1.0/html/xrspec.html#XR_FB_composition_layer_alpha_blend">XR_FB_composition_layer_alpha_blend</a> extension.
 * 
 * <p>This extension provides explicit control over source and destination blend factors, with separate controls for color and alpha. When specified, these blend controls supersede the behavior of {@link XR10#XR_COMPOSITION_LAYER_BLEND_TEXTURE_SOURCE_ALPHA_BIT COMPOSITION_LAYER_BLEND_TEXTURE_SOURCE_ALPHA_BIT}.</p>
 * 
 * <p>When {@link XR10#XR_COMPOSITION_LAYER_UNPREMULTIPLIED_ALPHA_BIT COMPOSITION_LAYER_UNPREMULTIPLIED_ALPHA_BIT} is specified, the source color is unpremultiplied alpha.</p>
 * 
 * <p>Like color, destination alpha is initialized to 0 before composition begins.</p>
 * 
 * <p>In order to enable the functionality of this extension, the application <b>must</b> pass the name of the extension into {@link XR10#xrCreateInstance CreateInstance} via the {@link XrInstanceCreateInfo}{@code ::enabledExtensionNames} parameter as indicated in the <a href="https://www.khronos.org/registry/OpenXR/specs/1.0/html/xrspec.html#extensions">extensions</a> section.</p>
 * 
 * <p>These blend factors are specified by attaching a {@link XrCompositionLayerAlphaBlendFB} structure to the {@code next} chain of a {@link XrCompositionLayerBaseHeader}-derived layer structure.</p>
 */
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