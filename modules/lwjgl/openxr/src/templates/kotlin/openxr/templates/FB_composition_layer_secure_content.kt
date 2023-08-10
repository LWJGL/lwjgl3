/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package openxr.templates

import org.lwjgl.generator.*
import openxr.*

val FB_composition_layer_secure_content = "FBCompositionLayerSecureContent".nativeClassXR("FB_composition_layer_secure_content", type = "instance", postfix = "FB") {
    documentation =
        """
        The <a href="https://registry.khronos.org/OpenXR/specs/1.0/html/xrspec.html\#XR_FB_composition_layer_secure_content">XR_FB_composition_layer_secure_content</a> extension.

        This extension does not define a new composition layer type, but rather it provides support for the application to specify an existing composition layer type has secure content and whether it must be completely excluded from external outputs, like video or screen capture, or if proxy content must be rendered in its place.

        In order to enable the functionality of this extension, you <b>must</b> pass the name of the extension into #CreateInstance() via the ##XrInstanceCreateInfo{@code ::enabledExtensionNames} parameter as indicated in the <a href="https://www.khronos.org/registry/OpenXR/specs/1.0/html/xrspec.html\#extensions">extensions</a> section.
        """

    IntConstant(
        "The extension specification version.",

        "FB_composition_layer_secure_content_SPEC_VERSION".."1"
    )

    StringConstant(
        "The extension name.",

        "FB_COMPOSITION_LAYER_SECURE_CONTENT_EXTENSION_NAME".."XR_FB_composition_layer_secure_content"
    )

    EnumConstant(
        "Extends {@code XrStructureType}.",

        "TYPE_COMPOSITION_LAYER_SECURE_CONTENT_FB".."1000072000"
    )

    EnumConstant(
        """
        XrCompositionLayerSecureContentFlagBitsFB - XrCompositionLayerSecureContentFlagBitsFB

        <h5>Flag Descriptions</h5>
        <ul>
            <li>#COMPOSITION_LAYER_SECURE_CONTENT_EXCLUDE_LAYER_BIT_FB — Indicates the layer will only be visible inside the HMD, and not visible to external sources</li>
            <li>#COMPOSITION_LAYER_SECURE_CONTENT_REPLACE_LAYER_BIT_FB — Indicates the layer will be displayed inside the HMD, but replaced by proxy content when written to external sources</li>
        </ul>
        """,

        "COMPOSITION_LAYER_SECURE_CONTENT_EXCLUDE_LAYER_BIT_FB".enum(0x00000001),
        "COMPOSITION_LAYER_SECURE_CONTENT_REPLACE_LAYER_BIT_FB".enum(0x00000002)
    )
}