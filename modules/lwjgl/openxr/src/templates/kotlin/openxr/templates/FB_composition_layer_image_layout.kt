/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package openxr.templates

import org.lwjgl.generator.*
import openxr.*

val FB_composition_layer_image_layout = "FBCompositionLayerImageLayout".nativeClassXR("FB_composition_layer_image_layout", type = "instance", postfix = "FB") {
    documentation =
        """
        The <a href="https://registry.khronos.org/OpenXR/specs/1.0/html/xrspec.html\#XR_FB_composition_layer_image_layout">XR_FB_composition_layer_image_layout</a> extension.

        This extension does not define a new composition layer type, but rather it defines parameters that change the interpretation of the image layout, where the default image layout is dictated by the Graphics API.

        In order to enable the functionality of this extension, you <b>must</b> pass the name of the extension into #CreateInstance() via the ##XrInstanceCreateInfo{@code ::enabledExtensionNames} parameter as indicated in the <a href="https://www.khronos.org/registry/OpenXR/specs/1.0/html/xrspec.html\#extensions">extensions</a> section.
        """

    IntConstant(
        "The extension specification version.",

        "FB_composition_layer_image_layout_SPEC_VERSION".."1"
    )

    StringConstant(
        "The extension name.",

        "FB_COMPOSITION_LAYER_IMAGE_LAYOUT_EXTENSION_NAME".."XR_FB_composition_layer_image_layout"
    )

    EnumConstant(
        "Extends {@code XrStructureType}.",

        "TYPE_COMPOSITION_LAYER_IMAGE_LAYOUT_FB".."1000040000"
    )

    EnumConstant(
        """
        XrCompositionLayerImageLayoutFlagBitsFB - XrCompositionLayerImageLayoutFlagBitsFB
        """,

        "COMPOSITION_LAYER_IMAGE_LAYOUT_VERTICAL_FLIP_BIT_FB".enum(0x00000001)
    )
}