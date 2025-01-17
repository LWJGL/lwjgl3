/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package openxr.templates

import org.lwjgl.generator.*
import openxr.*

val FB_face_tracking = "FBFaceTracking".nativeClassXR("FB_face_tracking", type = "instance", postfix = "FB") {
    IntConstant(
        "FB_face_tracking_SPEC_VERSION".."1"
    )

    StringConstant(
        "FB_FACE_TRACKING_EXTENSION_NAME".."XR_FB_face_tracking"
    )

    EnumConstant(
        "OBJECT_TYPE_FACE_TRACKER_FB".."1000201000"
    )

    EnumConstant(
        "TYPE_FACE_EXPRESSION_INFO_FB".."1000201002",
        "TYPE_SYSTEM_FACE_TRACKING_PROPERTIES_FB".."1000201004",
        "TYPE_FACE_TRACKER_CREATE_INFO_FB".."1000201005",
        "TYPE_FACE_EXPRESSION_WEIGHTS_FB".."1000201006"
    )

    EnumConstant(
        "FACE_EXPRESSION_BROW_LOWERER_L_FB".."0",
        "FACE_EXPRESSION_BROW_LOWERER_R_FB".."1",
        "FACE_EXPRESSION_CHEEK_PUFF_L_FB".."2",
        "FACE_EXPRESSION_CHEEK_PUFF_R_FB".."3",
        "FACE_EXPRESSION_CHEEK_RAISER_L_FB".."4",
        "FACE_EXPRESSION_CHEEK_RAISER_R_FB".."5",
        "FACE_EXPRESSION_CHEEK_SUCK_L_FB".."6",
        "FACE_EXPRESSION_CHEEK_SUCK_R_FB".."7",
        "FACE_EXPRESSION_CHIN_RAISER_B_FB".."8",
        "FACE_EXPRESSION_CHIN_RAISER_T_FB".."9",
        "FACE_EXPRESSION_DIMPLER_L_FB".."10",
        "FACE_EXPRESSION_DIMPLER_R_FB".."11",
        "FACE_EXPRESSION_EYES_CLOSED_L_FB".."12",
        "FACE_EXPRESSION_EYES_CLOSED_R_FB".."13",
        "FACE_EXPRESSION_EYES_LOOK_DOWN_L_FB".."14",
        "FACE_EXPRESSION_EYES_LOOK_DOWN_R_FB".."15",
        "FACE_EXPRESSION_EYES_LOOK_LEFT_L_FB".."16",
        "FACE_EXPRESSION_EYES_LOOK_LEFT_R_FB".."17",
        "FACE_EXPRESSION_EYES_LOOK_RIGHT_L_FB".."18",
        "FACE_EXPRESSION_EYES_LOOK_RIGHT_R_FB".."19",
        "FACE_EXPRESSION_EYES_LOOK_UP_L_FB".."20",
        "FACE_EXPRESSION_EYES_LOOK_UP_R_FB".."21",
        "FACE_EXPRESSION_INNER_BROW_RAISER_L_FB".."22",
        "FACE_EXPRESSION_INNER_BROW_RAISER_R_FB".."23",
        "FACE_EXPRESSION_JAW_DROP_FB".."24",
        "FACE_EXPRESSION_JAW_SIDEWAYS_LEFT_FB".."25",
        "FACE_EXPRESSION_JAW_SIDEWAYS_RIGHT_FB".."26",
        "FACE_EXPRESSION_JAW_THRUST_FB".."27",
        "FACE_EXPRESSION_LID_TIGHTENER_L_FB".."28",
        "FACE_EXPRESSION_LID_TIGHTENER_R_FB".."29",
        "FACE_EXPRESSION_LIP_CORNER_DEPRESSOR_L_FB".."30",
        "FACE_EXPRESSION_LIP_CORNER_DEPRESSOR_R_FB".."31",
        "FACE_EXPRESSION_LIP_CORNER_PULLER_L_FB".."32",
        "FACE_EXPRESSION_LIP_CORNER_PULLER_R_FB".."33",
        "FACE_EXPRESSION_LIP_FUNNELER_LB_FB".."34",
        "FACE_EXPRESSION_LIP_FUNNELER_LT_FB".."35",
        "FACE_EXPRESSION_LIP_FUNNELER_RB_FB".."36",
        "FACE_EXPRESSION_LIP_FUNNELER_RT_FB".."37",
        "FACE_EXPRESSION_LIP_PRESSOR_L_FB".."38",
        "FACE_EXPRESSION_LIP_PRESSOR_R_FB".."39",
        "FACE_EXPRESSION_LIP_PUCKER_L_FB".."40",
        "FACE_EXPRESSION_LIP_PUCKER_R_FB".."41",
        "FACE_EXPRESSION_LIP_STRETCHER_L_FB".."42",
        "FACE_EXPRESSION_LIP_STRETCHER_R_FB".."43",
        "FACE_EXPRESSION_LIP_SUCK_LB_FB".."44",
        "FACE_EXPRESSION_LIP_SUCK_LT_FB".."45",
        "FACE_EXPRESSION_LIP_SUCK_RB_FB".."46",
        "FACE_EXPRESSION_LIP_SUCK_RT_FB".."47",
        "FACE_EXPRESSION_LIP_TIGHTENER_L_FB".."48",
        "FACE_EXPRESSION_LIP_TIGHTENER_R_FB".."49",
        "FACE_EXPRESSION_LIPS_TOWARD_FB".."50",
        "FACE_EXPRESSION_LOWER_LIP_DEPRESSOR_L_FB".."51",
        "FACE_EXPRESSION_LOWER_LIP_DEPRESSOR_R_FB".."52",
        "FACE_EXPRESSION_MOUTH_LEFT_FB".."53",
        "FACE_EXPRESSION_MOUTH_RIGHT_FB".."54",
        "FACE_EXPRESSION_NOSE_WRINKLER_L_FB".."55",
        "FACE_EXPRESSION_NOSE_WRINKLER_R_FB".."56",
        "FACE_EXPRESSION_OUTER_BROW_RAISER_L_FB".."57",
        "FACE_EXPRESSION_OUTER_BROW_RAISER_R_FB".."58",
        "FACE_EXPRESSION_UPPER_LID_RAISER_L_FB".."59",
        "FACE_EXPRESSION_UPPER_LID_RAISER_R_FB".."60",
        "FACE_EXPRESSION_UPPER_LIP_RAISER_L_FB".."61",
        "FACE_EXPRESSION_UPPER_LIP_RAISER_R_FB".."62",
        "FACE_EXPRESSION_COUNT_FB".."63"
    )

    EnumConstant(
        "FACE_EXPRESSION_SET_DEFAULT_FB".."0"
    )

    EnumConstant(
        "FACE_CONFIDENCE_LOWER_FACE_FB".."0",
        "FACE_CONFIDENCE_UPPER_FACE_FB".."1",
        "FACE_CONFIDENCE_COUNT_FB".."2"
    )

    XrResult(
        "CreateFaceTrackerFB",

        XrSession("session"),
        XrFaceTrackerCreateInfoFB.const.p("createInfo"),
        Check(1)..XrFaceTrackerFB.p("faceTracker")
    )

    XrResult(
        "DestroyFaceTrackerFB",

        XrFaceTrackerFB("faceTracker")
    )

    XrResult(
        "GetFaceExpressionWeightsFB",

        XrFaceTrackerFB("faceTracker"),
        XrFaceExpressionInfoFB.const.p("expressionInfo"),
        XrFaceExpressionWeightsFB.p("expressionWeights")
    )
}