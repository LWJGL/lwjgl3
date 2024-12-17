/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package openxr.templates

import org.lwjgl.generator.*
import openxr.*

val FB_composition_layer_image_layout = "FBCompositionLayerImageLayout".nativeClassXR("FB_composition_layer_image_layout", type = "instance", postfix = "FB") {
    IntConstant(
        "FB_composition_layer_image_layout_SPEC_VERSION".."1"
    )

    StringConstant(
        "FB_COMPOSITION_LAYER_IMAGE_LAYOUT_EXTENSION_NAME".."XR_FB_composition_layer_image_layout"
    )

    EnumConstant(
        "TYPE_COMPOSITION_LAYER_IMAGE_LAYOUT_FB".."1000040000"
    )

    EnumConstant(
        "COMPOSITION_LAYER_IMAGE_LAYOUT_VERTICAL_FLIP_BIT_FB".enum(0x00000001)
    )
}