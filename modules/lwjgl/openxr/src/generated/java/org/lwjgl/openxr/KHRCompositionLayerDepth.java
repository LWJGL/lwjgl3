/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.openxr;

/**
 * The <a href="https://registry.khronos.org/OpenXR/specs/1.0/html/xrspec.html#XR_KHR_composition_layer_depth">XR_KHR_composition_layer_depth</a> extension.
 * 
 * <p>This extension defines an extra layer type which allows applications to submit depth images along with color images in projection layers, i.e. {@link XrCompositionLayerProjection}.</p>
 * 
 * <p>The XR runtime <b>may</b> use this information to perform more accurate reprojections taking depth into account. Use of this extension does not affect the order of layer composition as described in <a href="https://www.khronos.org/registry/OpenXR/specs/1.0/html/xrspec.html#Compositing">Compositing</a>.</p>
 */
public final class KHRCompositionLayerDepth {

    /** The extension specification version. */
    public static final int XR_KHR_composition_layer_depth_SPEC_VERSION = 6;

    /** The extension name. */
    public static final String XR_KHR_COMPOSITION_LAYER_DEPTH_EXTENSION_NAME = "XR_KHR_composition_layer_depth";

    /** Extends {@code XrStructureType}. */
    public static final int XR_TYPE_COMPOSITION_LAYER_DEPTH_INFO_KHR = 1000010000;

    private KHRCompositionLayerDepth() {}

}