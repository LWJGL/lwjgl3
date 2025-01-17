/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package openxr.templates

import org.lwjgl.generator.*
import openxr.*

val FB_render_model = "FBRenderModel".nativeClassXR("FB_render_model", type = "instance", postfix = "FB") {
    IntConstant(
        "FB_render_model_SPEC_VERSION".."4"
    )

    StringConstant(
        "FB_RENDER_MODEL_EXTENSION_NAME".."XR_FB_render_model"
    )

    EnumConstant(
        "MAX_RENDER_MODEL_NAME_SIZE_FB".."64"
    )

    EnumConstant(
        "TYPE_RENDER_MODEL_PATH_INFO_FB".."1000119000",
        "TYPE_RENDER_MODEL_PROPERTIES_FB".."1000119001",
        "TYPE_RENDER_MODEL_BUFFER_FB".."1000119002",
        "TYPE_RENDER_MODEL_LOAD_INFO_FB".."1000119003",
        "TYPE_SYSTEM_RENDER_MODEL_PROPERTIES_FB".."1000119004",
        "TYPE_RENDER_MODEL_CAPABILITIES_REQUEST_FB".."1000119005"
    )

    EnumConstant(
        "RENDER_MODEL_UNAVAILABLE_FB".."1000119020",
        "ERROR_RENDER_MODEL_KEY_INVALID_FB".."-1000119000"
    )

    EnumConstant(
        "RENDER_MODEL_SUPPORTS_GLTF_2_0_SUBSET_1_BIT_FB".enum(0x00000001),
        "RENDER_MODEL_SUPPORTS_GLTF_2_0_SUBSET_2_BIT_FB".enum(0x00000002)
    )

    XrResult(
        "EnumerateRenderModelPathsFB",

        XrSession("session"),
        AutoSize("paths")..uint32_t("pathCapacityInput"),
        Check(1)..uint32_t.p("pathCountOutput"),
        nullable..XrRenderModelPathInfoFB.p("paths")
    )

    XrResult(
        "GetRenderModelPropertiesFB",

        XrSession("session"),
        XrPath("path"),
        XrRenderModelPropertiesFB.p("properties")
    )

    XrResult(
        "LoadRenderModelFB",

        XrSession("session"),
        XrRenderModelLoadInfoFB.const.p("info"),
        XrRenderModelBufferFB.p("buffer")
    )
}