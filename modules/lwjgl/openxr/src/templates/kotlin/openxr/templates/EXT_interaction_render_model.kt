/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package openxr.templates

import org.lwjgl.generator.*
import openxr.*

val EXT_interaction_render_model = "EXTInteractionRenderModel".nativeClassXR("EXT_interaction_render_model", type = "instance", postfix = "EXT") {
    IntConstant(
        "EXT_interaction_render_model_SPEC_VERSION".."1"
    )

    StringConstant(
        "EXT_INTERACTION_RENDER_MODEL_EXTENSION_NAME".."XR_EXT_interaction_render_model"
    )

    EnumConstant(
        "TYPE_INTERACTION_RENDER_MODEL_IDS_ENUMERATE_INFO_EXT".."1000301000",
        "TYPE_INTERACTION_RENDER_MODEL_SUBACTION_PATH_INFO_EXT".."1000301001",
        "TYPE_EVENT_DATA_INTERACTION_RENDER_MODELS_CHANGED_EXT".."1000301002",
        "TYPE_INTERACTION_RENDER_MODEL_TOP_LEVEL_USER_PATH_GET_INFO_EXT".."1000301003"
    )

    EnumConstant(
        "ERROR_NOT_INTERACTION_RENDER_MODEL_EXT".."-1000301000"
    )

    XrResult(
        "EnumerateInteractionRenderModelIdsEXT",

        XrSession("session"),
        XrInteractionRenderModelIdsEnumerateInfoEXT.const.p("getInfo"),
        AutoSize("renderModelIds")..uint32_t("renderModelIdCapacityInput"),
        Check(1)..uint32_t.p("renderModelIdCountOutput"),
        nullable..XrRenderModelIdEXT.p("renderModelIds")
    )

    XrResult(
        "EnumerateRenderModelSubactionPathsEXT",

        XrRenderModelEXT("renderModel"),
        nullable..XrInteractionRenderModelSubactionPathInfoEXT.const.p("info"),
        AutoSize("paths")..uint32_t("pathCapacityInput"),
        Check(1)..uint32_t.p("pathCountOutput"),
        nullable..XrPath.p("paths")
    )

    XrResult(
        "GetRenderModelPoseTopLevelUserPathEXT",

        XrRenderModelEXT("renderModel"),
        XrInteractionRenderModelTopLevelUserPathGetInfoEXT.const.p("info"),
        Check(1)..XrPath.p("topLevelUserPath")
    )
}