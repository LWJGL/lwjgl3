/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package openxr.templates

import org.lwjgl.generator.*
import openxr.*

val VARJO_composition_layer_depth_test = "VARJOCompositionLayerDepthTest".nativeClassXR("VARJO_composition_layer_depth_test", type = "instance", postfix = "VARJO") {
    documentation =
        """
        The <a href="https://registry.khronos.org/OpenXR/specs/1.0/html/xrspec.html\#XR_VARJO_composition_layer_depth_test">XR_VARJO_composition_layer_depth_test</a> extension.

        This extension enables depth-based layer composition inside the compositor.

        Core OpenXR specifies that layer compositing must happen in the layer submission order (as described in <a href="https://www.khronos.org/registry/OpenXR/specs/1.0/html/xrspec.html\#Compositing">Compositing</a>). However, an application may want to composite the final image against the other layers based on depth information for proper occlusion. Layers can now provide depth information that will be used to calculate occlusion between those layers, as well as with the environment depth estimator ({@link VARJOEnvironmentDepthEstimation XR_VARJO_environment_depth_estimation}) when enabled.

        This extension defines a new type, ##XrCompositionLayerDepthTestVARJO, which can be chained to ##XrCompositionLayerProjection in order to activate this functionality. An application must also specify a range where depth testing will happen, potentially covering only a subset of the full depth range.
        """

    IntConstant(
        "The extension specification version.",

        "VARJO_composition_layer_depth_test_SPEC_VERSION".."2"
    )

    StringConstant(
        "The extension name.",

        "VARJO_COMPOSITION_LAYER_DEPTH_TEST_EXTENSION_NAME".."XR_VARJO_composition_layer_depth_test"
    )

    EnumConstant(
        "Extends {@code XrStructureType}.",

        "TYPE_COMPOSITION_LAYER_DEPTH_TEST_VARJO".."1000122000"
    )
}