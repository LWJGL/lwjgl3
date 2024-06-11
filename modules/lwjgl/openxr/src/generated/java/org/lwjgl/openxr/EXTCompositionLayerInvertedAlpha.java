/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.openxr;

/**
 * The <a href="https://registry.khronos.org/OpenXR/specs/1.1/html/xrspec.html#XR_EXT_composition_layer_inverted_alpha">XR_EXT_composition_layer_inverted_alpha</a> extension.
 * 
 * <p>This extension provides a flag which, when applied to a composition layer, inverts the interpretation of the alpha value in the layer’s swapchain images. With this bit set, an alpha value of 1.0 represents fully transparent, and an alpha value of 0.0 represents fully opaque. This extension is primarily intended to allow applications using inverted alpha internally to submit composition layers with inverted alpha. Doing so using this extension over more general alternatives may result in less runtime overhead.</p>
 */
public final class EXTCompositionLayerInvertedAlpha {

    /** The extension specification version. */
    public static final int XR_EXT_composition_layer_inverted_alpha_SPEC_VERSION = 1;

    /** The extension name. */
    public static final String XR_EXT_COMPOSITION_LAYER_INVERTED_ALPHA_EXTENSION_NAME = "XR_EXT_composition_layer_inverted_alpha";

    /** Extends {@code XrCompositionLayerFlagBits}. */
    public static final int XR_COMPOSITION_LAYER_INVERTED_ALPHA_BIT_EXT = 0x8;

    private EXTCompositionLayerInvertedAlpha() {}

}