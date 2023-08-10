/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.openxr;

/**
 * The <a href="https://registry.khronos.org/OpenXR/specs/1.0/html/xrspec.html#XR_VARJO_composition_layer_depth_test">XR_VARJO_composition_layer_depth_test</a> extension.
 * 
 * <p>This extension enables depth-based layer composition inside the compositor.</p>
 * 
 * <p>Core OpenXR specifies that layer compositing must happen in the layer submission order (as described in <a href="https://www.khronos.org/registry/OpenXR/specs/1.0/html/xrspec.html#Compositing">Compositing</a>). However, an application may want to composite the final image against the other layers based on depth information for proper occlusion. Layers can now provide depth information that will be used to calculate occlusion between those layers, as well as with the environment depth estimator ({@link VARJOEnvironmentDepthEstimation XR_VARJO_environment_depth_estimation}) when enabled.</p>
 * 
 * <p>This extension defines a new type, {@link XrCompositionLayerDepthTestVARJO}, which can be chained to {@link XrCompositionLayerProjection} in order to activate this functionality. An application must also specify a range where depth testing will happen, potentially covering only a subset of the full depth range.</p>
 */
public final class VARJOCompositionLayerDepthTest {

    /** The extension specification version. */
    public static final int XR_VARJO_composition_layer_depth_test_SPEC_VERSION = 2;

    /** The extension name. */
    public static final String XR_VARJO_COMPOSITION_LAYER_DEPTH_TEST_EXTENSION_NAME = "XR_VARJO_composition_layer_depth_test";

    /** Extends {@code XrStructureType}. */
    public static final int XR_TYPE_COMPOSITION_LAYER_DEPTH_TEST_VARJO = 1000122000;

    private VARJOCompositionLayerDepthTest() {}

}