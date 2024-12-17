/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package openxr.templates

import org.lwjgl.generator.*
import openxr.*

val ML_facial_expression = "MLFacialExpression".nativeClassXR("ML_facial_expression", type = "instance", postfix = "ML") {
    IntConstant(
        "ML_facial_expression_SPEC_VERSION".."1"
    )

    StringConstant(
        "ML_FACIAL_EXPRESSION_EXTENSION_NAME".."XR_ML_facial_expression"
    )

    EnumConstant(
        "ERROR_FACIAL_EXPRESSION_PERMISSION_DENIED_ML".."1000482000"
    )

    EnumConstant(
        "OBJECT_TYPE_FACIAL_EXPRESSION_CLIENT_ML".."1000482000"
    )

    EnumConstant(
        "TYPE_SYSTEM_FACIAL_EXPRESSION_PROPERTIES_ML".."1000482004",
        "TYPE_FACIAL_EXPRESSION_CLIENT_CREATE_INFO_ML".."1000482005",
        "TYPE_FACIAL_EXPRESSION_BLEND_SHAPE_GET_INFO_ML".."1000482006",
        "TYPE_FACIAL_EXPRESSION_BLEND_SHAPE_PROPERTIES_ML".."1000482007"
    )

    EnumConstant(
        "FACIAL_BLEND_SHAPE_BROW_LOWERER_L_ML".."0",
        "FACIAL_BLEND_SHAPE_BROW_LOWERER_R_ML".."1",
        "FACIAL_BLEND_SHAPE_CHEEK_RAISER_L_ML".."2",
        "FACIAL_BLEND_SHAPE_CHEEK_RAISER_R_ML".."3",
        "FACIAL_BLEND_SHAPE_CHIN_RAISER_ML".."4",
        "FACIAL_BLEND_SHAPE_DIMPLER_L_ML".."5",
        "FACIAL_BLEND_SHAPE_DIMPLER_R_ML".."6",
        "FACIAL_BLEND_SHAPE_EYES_CLOSED_L_ML".."7",
        "FACIAL_BLEND_SHAPE_EYES_CLOSED_R_ML".."8",
        "FACIAL_BLEND_SHAPE_INNER_BROW_RAISER_L_ML".."9",
        "FACIAL_BLEND_SHAPE_INNER_BROW_RAISER_R_ML".."10",
        "FACIAL_BLEND_SHAPE_JAW_DROP_ML".."11",
        "FACIAL_BLEND_SHAPE_LID_TIGHTENER_L_ML".."12",
        "FACIAL_BLEND_SHAPE_LID_TIGHTENER_R_ML".."13",
        "FACIAL_BLEND_SHAPE_LIP_CORNER_DEPRESSOR_L_ML".."14",
        "FACIAL_BLEND_SHAPE_LIP_CORNER_DEPRESSOR_R_ML".."15",
        "FACIAL_BLEND_SHAPE_LIP_CORNER_PULLER_L_ML".."16",
        "FACIAL_BLEND_SHAPE_LIP_CORNER_PULLER_R_ML".."17",
        "FACIAL_BLEND_SHAPE_LIP_FUNNELER_LB_ML".."18",
        "FACIAL_BLEND_SHAPE_LIP_FUNNELER_LT_ML".."19",
        "FACIAL_BLEND_SHAPE_LIP_FUNNELER_RB_ML".."20",
        "FACIAL_BLEND_SHAPE_LIP_FUNNELER_RT_ML".."21",
        "FACIAL_BLEND_SHAPE_LIP_PRESSOR_L_ML".."22",
        "FACIAL_BLEND_SHAPE_LIP_PRESSOR_R_ML".."23",
        "FACIAL_BLEND_SHAPE_LIP_PUCKER_L_ML".."24",
        "FACIAL_BLEND_SHAPE_LIP_PUCKER_R_ML".."25",
        "FACIAL_BLEND_SHAPE_LIP_STRETCHER_L_ML".."26",
        "FACIAL_BLEND_SHAPE_LIP_STRETCHER_R_ML".."27",
        "FACIAL_BLEND_SHAPE_LIP_SUCK_LB_ML".."28",
        "FACIAL_BLEND_SHAPE_LIP_SUCK_LT_ML".."29",
        "FACIAL_BLEND_SHAPE_LIP_SUCK_RB_ML".."30",
        "FACIAL_BLEND_SHAPE_LIP_SUCK_RT_ML".."31",
        "FACIAL_BLEND_SHAPE_LIP_TIGHTENER_L_ML".."32",
        "FACIAL_BLEND_SHAPE_LIP_TIGHTENER_R_ML".."33",
        "FACIAL_BLEND_SHAPE_LIPS_TOWARD_ML".."34",
        "FACIAL_BLEND_SHAPE_LOWER_LIP_DEPRESSOR_L_ML".."35",
        "FACIAL_BLEND_SHAPE_LOWER_LIP_DEPRESSOR_R_ML".."36",
        "FACIAL_BLEND_SHAPE_NOSE_WRINKLER_L_ML".."37",
        "FACIAL_BLEND_SHAPE_NOSE_WRINKLER_R_ML".."38",
        "FACIAL_BLEND_SHAPE_OUTER_BROW_RAISER_L_ML".."39",
        "FACIAL_BLEND_SHAPE_OUTER_BROW_RAISER_R_ML".."40",
        "FACIAL_BLEND_SHAPE_UPPER_LID_RAISER_L_ML".."41",
        "FACIAL_BLEND_SHAPE_UPPER_LID_RAISER_R_ML".."42",
        "FACIAL_BLEND_SHAPE_UPPER_LIP_RAISER_L_ML".."43",
        "FACIAL_BLEND_SHAPE_UPPER_LIP_RAISER_R_ML".."44",
        "FACIAL_BLEND_SHAPE_TONGUE_OUT_ML".."45"
    )

    EnumConstant(
        "FACIAL_EXPRESSION_BLEND_SHAPE_PROPERTIES_VALID_BIT_ML".enum(0x00000001),
        "FACIAL_EXPRESSION_BLEND_SHAPE_PROPERTIES_TRACKED_BIT_ML".enum(0x00000002)
    )

    XrResult(
        "CreateFacialExpressionClientML",

        XrSession("session"),
        XrFacialExpressionClientCreateInfoML.const.p("createInfo"),
        Check(1)..XrFacialExpressionClientML.p("facialExpressionClient")
    )

    XrResult(
        "DestroyFacialExpressionClientML",

        XrFacialExpressionClientML("facialExpressionClient")
    )

    XrResult(
        "GetFacialExpressionBlendShapePropertiesML",

        XrFacialExpressionClientML("facialExpressionClient"),
        XrFacialExpressionBlendShapeGetInfoML.const.p("blendShapeGetInfo"),
        AutoSize("blendShapes")..uint32_t("blendShapeCount"),
        XrFacialExpressionBlendShapePropertiesML.p("blendShapes")
    )
}