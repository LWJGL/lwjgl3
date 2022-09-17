/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.openxr;

/**
 * The <a href="https://registry.khronos.org/OpenXR/specs/1.0/html/xrspec.html#XR_KHR_composition_layer_equirect2">XR_KHR_composition_layer_equirect2</a> extension.
 * 
 * <p>This extension adds an additional layer type where the XR runtime must map an equirectangular coded image stemming from a swapchain onto the inside of a sphere.</p>
 * 
 * <p>The equirect layer type provides most of the same benefits as a cubemap, but from an equirect 2D image source. This image source is appealing mostly because equirect environment maps are very common, and the highest quality you can get from them is by sampling them directly in the compositor.</p>
 * 
 * <p>This is not a projection type of layer but rather an object-in-world type of layer, similar to {@link XrCompositionLayerQuad}. Only the interior of the sphere surface <b>must</b> be visible; the exterior of the sphere is not visible and <b>must</b> not be drawn by the runtime.</p>
 * 
 * <p>This extension uses a different parameterization more in keeping with the formulation of KHR_composition_layer_cylinder but is functionally equivalent to KHR_composition_layer_equirect.</p>
 */
public final class KHRCompositionLayerEquirect2 {

    /** The extension specification version. */
    public static final int XR_KHR_composition_layer_equirect2_SPEC_VERSION = 1;

    /** The extension name. */
    public static final String XR_KHR_COMPOSITION_LAYER_EQUIRECT2_EXTENSION_NAME = "XR_KHR_composition_layer_equirect2";

    /** Extends {@code XrStructureType}. */
    public static final int XR_TYPE_COMPOSITION_LAYER_EQUIRECT2_KHR = 1000091000;

    private KHRCompositionLayerEquirect2() {}

}