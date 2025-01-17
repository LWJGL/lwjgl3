/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package openxr.templates

import org.lwjgl.generator.*
import openxr.*

val HTC_facial_tracking = "HTCFacialTracking".nativeClassXR("HTC_facial_tracking", type = "instance", postfix = "HTC") {
    IntConstant(
        "HTC_facial_tracking_SPEC_VERSION".."3"
    )

    StringConstant(
        "HTC_FACIAL_TRACKING_EXTENSION_NAME".."XR_HTC_facial_tracking"
    )

    EnumConstant(
        "OBJECT_TYPE_FACIAL_TRACKER_HTC".."1000104000"
    )

    EnumConstant(
        "TYPE_SYSTEM_FACIAL_TRACKING_PROPERTIES_HTC".."1000104000",
        "TYPE_FACIAL_TRACKER_CREATE_INFO_HTC".."1000104001",
        "TYPE_FACIAL_EXPRESSIONS_HTC".."1000104002"
    )

    EnumConstant(
        "LIP_EXPRESSION_JAW_RIGHT_HTC".."0",
        "LIP_EXPRESSION_JAW_LEFT_HTC".."1",
        "LIP_EXPRESSION_JAW_FORWARD_HTC".."2",
        "LIP_EXPRESSION_JAW_OPEN_HTC".."3",
        "LIP_EXPRESSION_MOUTH_APE_SHAPE_HTC".."4",
        "LIP_EXPRESSION_MOUTH_UPPER_RIGHT_HTC".."5",
        "LIP_EXPRESSION_MOUTH_UPPER_LEFT_HTC".."6",
        "LIP_EXPRESSION_MOUTH_LOWER_RIGHT_HTC".."7",
        "LIP_EXPRESSION_MOUTH_LOWER_LEFT_HTC".."8",
        "LIP_EXPRESSION_MOUTH_UPPER_OVERTURN_HTC".."9",
        "LIP_EXPRESSION_MOUTH_LOWER_OVERTURN_HTC".."10",
        "LIP_EXPRESSION_MOUTH_POUT_HTC".."11",
        "LIP_EXPRESSION_MOUTH_SMILE_RIGHT_HTC".."12",
        "LIP_EXPRESSION_MOUTH_RAISER_RIGHT_HTC".."12",
        "LIP_EXPRESSION_MOUTH_SMILE_LEFT_HTC".."13",
        "LIP_EXPRESSION_MOUTH_RAISER_LEFT_HTC".."13",
        "LIP_EXPRESSION_MOUTH_SAD_RIGHT_HTC".."14",
        "LIP_EXPRESSION_MOUTH_STRETCHER_RIGHT_HTC".."14",
        "LIP_EXPRESSION_MOUTH_SAD_LEFT_HTC".."15",
        "LIP_EXPRESSION_MOUTH_STRETCHER_LEFT_HTC".."15",
        "LIP_EXPRESSION_CHEEK_PUFF_RIGHT_HTC".."16",
        "LIP_EXPRESSION_CHEEK_PUFF_LEFT_HTC".."17",
        "LIP_EXPRESSION_CHEEK_SUCK_HTC".."18",
        "LIP_EXPRESSION_MOUTH_UPPER_UPRIGHT_HTC".."19",
        "LIP_EXPRESSION_MOUTH_UPPER_UPLEFT_HTC".."20",
        "LIP_EXPRESSION_MOUTH_LOWER_DOWNRIGHT_HTC".."21",
        "LIP_EXPRESSION_MOUTH_LOWER_DOWNLEFT_HTC".."22",
        "LIP_EXPRESSION_MOUTH_UPPER_INSIDE_HTC".."23",
        "LIP_EXPRESSION_MOUTH_LOWER_INSIDE_HTC".."24",
        "LIP_EXPRESSION_MOUTH_LOWER_OVERLAY_HTC".."25",
        "LIP_EXPRESSION_TONGUE_LONGSTEP1_HTC".."26",
        "LIP_EXPRESSION_TONGUE_LEFT_HTC".."27",
        "LIP_EXPRESSION_TONGUE_RIGHT_HTC".."28",
        "LIP_EXPRESSION_TONGUE_UP_HTC".."29",
        "LIP_EXPRESSION_TONGUE_DOWN_HTC".."30",
        "LIP_EXPRESSION_TONGUE_ROLL_HTC".."31",
        "LIP_EXPRESSION_TONGUE_LONGSTEP2_HTC".."32",
        "LIP_EXPRESSION_TONGUE_UPRIGHT_MORPH_HTC".."33",
        "LIP_EXPRESSION_TONGUE_UPLEFT_MORPH_HTC".."34",
        "LIP_EXPRESSION_TONGUE_DOWNRIGHT_MORPH_HTC".."35",
        "LIP_EXPRESSION_TONGUE_DOWNLEFT_MORPH_HTC".."36"
    )

    EnumConstant(
        "EYE_EXPRESSION_LEFT_BLINK_HTC".."0",
        "EYE_EXPRESSION_LEFT_WIDE_HTC".."1",
        "EYE_EXPRESSION_RIGHT_BLINK_HTC".."2",
        "EYE_EXPRESSION_RIGHT_WIDE_HTC".."3",
        "EYE_EXPRESSION_LEFT_SQUEEZE_HTC".."4",
        "EYE_EXPRESSION_RIGHT_SQUEEZE_HTC".."5",
        "EYE_EXPRESSION_LEFT_DOWN_HTC".."6",
        "EYE_EXPRESSION_RIGHT_DOWN_HTC".."7",
        "EYE_EXPRESSION_LEFT_OUT_HTC".."8",
        "EYE_EXPRESSION_RIGHT_IN_HTC".."9",
        "EYE_EXPRESSION_LEFT_IN_HTC".."10",
        "EYE_EXPRESSION_RIGHT_OUT_HTC".."11",
        "EYE_EXPRESSION_LEFT_UP_HTC".."12",
        "EYE_EXPRESSION_RIGHT_UP_HTC".."13"
    )

    EnumConstant(
        "FACIAL_TRACKING_TYPE_EYE_DEFAULT_HTC".."1",
        "FACIAL_TRACKING_TYPE_LIP_DEFAULT_HTC".."2"
    )

    XrResult(
        "CreateFacialTrackerHTC",

        XrSession("session"),
        XrFacialTrackerCreateInfoHTC.const.p("createInfo"),
        Check(1)..XrFacialTrackerHTC.p("facialTracker")
    )

    XrResult(
        "DestroyFacialTrackerHTC",

        XrFacialTrackerHTC("facialTracker")
    )

    XrResult(
        "GetFacialExpressionsHTC",

        XrFacialTrackerHTC("facialTracker"),
        XrFacialExpressionsHTC.p("facialExpressions")
    )
}