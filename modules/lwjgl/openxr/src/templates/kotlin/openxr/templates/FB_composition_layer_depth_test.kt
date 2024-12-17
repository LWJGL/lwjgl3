/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package openxr.templates

import org.lwjgl.generator.*
import openxr.*

val FB_composition_layer_depth_test = "FBCompositionLayerDepthTest".nativeClassXR("FB_composition_layer_depth_test", type = "instance", postfix = "FB") {
    IntConstant(
        "FB_composition_layer_depth_test_SPEC_VERSION".."1"
    )

    StringConstant(
        "FB_COMPOSITION_LAYER_DEPTH_TEST_EXTENSION_NAME".."XR_FB_composition_layer_depth_test"
    )

    EnumConstant(
        "TYPE_COMPOSITION_LAYER_DEPTH_TEST_FB".."1000212000"
    )

    EnumConstant(
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