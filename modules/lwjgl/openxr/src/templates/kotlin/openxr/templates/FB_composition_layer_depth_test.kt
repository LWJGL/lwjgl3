/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package openxr.templates

import org.lwjgl.generator.*
import openxr.*

val FB_composition_layer_depth_test = "FBCompositionLayerDepthTest".nativeClassXR("FB_composition_layer_depth_test", type = "instance", postfix = "FB") {
    documentation =
        """
        The <a href="https://registry.khronos.org/OpenXR/specs/1.0/html/xrspec.html\#XR_FB_composition_layer_depth_test">XR_FB_composition_layer_depth_test</a> extension.

        This extension enables depth-tested layer composition. The compositor will maintain a depth buffer in addition to a color buffer. The depth buffer is cleared to a depth corresponding to the infinitely far distance at the beginning of composition.

        When composing each layer, if depth testing is requested, the incoming layer depths are transformed into the compositor window space depth and compared to the depth stored in the frame buffer. After the transformation, incoming depths that are outside of the range of the compositor window space depth <b>must</b> be clamped. If the depth test fails, the fragment is discarded. If the depth test passes the depth buffer is updated if depth writes are enabled, and color processing continues.

        Depth testing requires depth values for the layer. For projection layers, this can be supplied via the {@link KHRCompositionLayerDepth XR_KHR_composition_layer_depth} extension. For geometric primitive layers, the runtime computes the depth of the sample directly from the layer parameters. An ##XrCompositionLayerDepthTestFB chained to layers without depth <b>must</b> be ignored.
        """

    IntConstant(
        "The extension specification version.",

        "FB_composition_layer_depth_test_SPEC_VERSION".."1"
    )

    StringConstant(
        "The extension name.",

        "FB_COMPOSITION_LAYER_DEPTH_TEST_EXTENSION_NAME".."XR_FB_composition_layer_depth_test"
    )

    EnumConstant(
        "Extends {@code XrStructureType}.",

        "TYPE_COMPOSITION_LAYER_DEPTH_TEST_FB".."1000212000"
    )

    EnumConstant(
        """
        XrCompareOpFB - Compare Operation

        <h5>Enumerant Descriptions</h5>
        <ul>
            <li>#COMPARE_OP_NEVER_FB — Comparison is never true.</li>
            <li>#COMPARE_OP_LESS_FB — Comparison is true if source less than is destination.</li>
            <li>#COMPARE_OP_EQUAL_FB — Comparison is true if source is equal to destination.</li>
            <li>#COMPARE_OP_LESS_OR_EQUAL_FB — Comparison is true if source is less than or equal to destination.</li>
            <li>#COMPARE_OP_GREATER_FB — Comparison is true if source is greater than destination.</li>
            <li>#COMPARE_OP_NOT_EQUAL_FB — Comparison is true if source is not equal to destination.</li>
            <li>#COMPARE_OP_GREATER_OR_EQUAL_FB — Comparison is true if source is greater than or equal to destination.</li>
            <li>#COMPARE_OP_ALWAYS_FB — Comparison is always true.</li>
        </ul>

        <h5>See Also</h5>
        ##XrCompositionLayerDepthTestFB
        """,

        "COMPARE_OP_NEVER_FB".."0",
        "COMPARE_OP_LESS_FB".."1",
        "COMPARE_OP_EQUAL_FB".."2",
        "COMPARE_OP_LESS_OR_EQUAL_FB".."3",
        "COMPARE_OP_GREATER_FB".."4",
        "COMPARE_OP_NOT_EQUAL_FB".."5",
        "COMPARE_OP_GREATER_OR_EQUAL_FB".."6",
        "COMPARE_OP_ALWAYS_FB".."7"
    )
}