/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package openxr.templates

import org.lwjgl.generator.*
import openxr.*

val BD_facial_simulation = "BDFacialSimulation".nativeClassXR("BD_facial_simulation", type = "instance", postfix = "BD") {
    IntConstant(
        "BD_facial_simulation_SPEC_VERSION".."1"
    )

    StringConstant(
        "BD_FACIAL_SIMULATION_EXTENSION_NAME".."XR_BD_facial_simulation"
    )

    EnumConstant(
        "OBJECT_TYPE_FACE_TRACKER_BD".."1000386000"
    )

    EnumConstant(
        "TYPE_SYSTEM_FACIAL_SIMULATION_PROPERTIES_BD".."1000386001",
        "TYPE_FACE_TRACKER_CREATE_INFO_BD".."1000386002",
        "TYPE_FACIAL_SIMULATION_DATA_GET_INFO_BD".."1000386003",
        "TYPE_FACIAL_SIMULATION_DATA_BD".."1000386004",
        "TYPE_LIP_EXPRESSION_DATA_BD".."1000386005"
    )

    EnumConstant(
        "FACIAL_SIMULATION_MODE_DEFAULT_BD".."0",
        "FACIAL_SIMULATION_MODE_COMBINED_AUDIO_BD".."1",
        "FACIAL_SIMULATION_MODE_COMBINED_AUDIO_WITH_LIP_BD".."2",
        "FACIAL_SIMULATION_MODE_ONLY_AUDIO_WITH_LIP_BD".."3"
    )

    EnumConstant(
        "FACE_EXPRESSION_BROW_DROP_L_BD".."0",
        "FACE_EXPRESSION_BROW_DROP_R_BD".."1",
        "FACE_EXPRESSION_BROW_INNER_UPWARDS_BD".."2",
        "FACE_EXPRESSION_BROW_OUTER_UPWARDS_L_BD".."3",
        "FACE_EXPRESSION_BROW_OUTER_UPWARDS_R_BD".."4",
        "FACE_EXPRESSION_EYE_BLINK_L_BD".."5",
        "FACE_EXPRESSION_EYE_LOOK_DROP_L_BD".."6",
        "FACE_EXPRESSION_EYE_LOOK_IN_L_BD".."7",
        "FACE_EXPRESSION_EYE_LOOK_OUT_L_BD".."8",
        "FACE_EXPRESSION_EYE_LOOK_UPWARDS_L_BD".."9",
        "FACE_EXPRESSION_EYE_LOOK_SQUINT_L_BD".."10",
        "FACE_EXPRESSION_EYE_LOOK_WIDE_L_BD".."11",
        "FACE_EXPRESSION_EYE_BLINK_R_BD".."12",
        "FACE_EXPRESSION_EYE_LOOK_DROP_R_BD".."13",
        "FACE_EXPRESSION_EYE_LOOK_IN_R_BD".."14",
        "FACE_EXPRESSION_EYE_LOOK_OUT_R_BD".."15",
        "FACE_EXPRESSION_EYE_LOOK_UPWARDS_R_BD".."16",
        "FACE_EXPRESSION_EYE_LOOK_SQUINT_R_BD".."17",
        "FACE_EXPRESSION_EYE_LOOK_WIDE_R_BD".."18",
        "FACE_EXPRESSION_NOSE_SNEER_L_BD".."19",
        "FACE_EXPRESSION_NOSE_SNEER_R_BD".."20",
        "FACE_EXPRESSION_CHEEK_PUFF_BD".."21",
        "FACE_EXPRESSION_CHEEK_SQUINT_L_BD".."22",
        "FACE_EXPRESSION_CHEEK_SQUINT_R_BD".."23",
        "FACE_EXPRESSION_MOUTH_CLOSE_BD".."24",
        "FACE_EXPRESSION_MOUTH_FUNNEL_BD".."25",
        "FACE_EXPRESSION_MOUTH_PUCKER_BD".."26",
        "FACE_EXPRESSION_MOUTH_L_BD".."27",
        "FACE_EXPRESSION_MOUTH_R_BD".."28",
        "FACE_EXPRESSION_MOUTH_SMILE_L_BD".."29",
        "FACE_EXPRESSION_MOUTH_SMILE_R_BD".."30",
        "FACE_EXPRESSION_MOUTH_FROWN_L_BD".."31",
        "FACE_EXPRESSION_MOUTH_FROWN_R_BD".."32",
        "FACE_EXPRESSION_MOUTH_DIMPLE_L_BD".."33",
        "FACE_EXPRESSION_MOUTH_DIMPLE_R_BD".."34",
        "FACE_EXPRESSION_MOUTH_STRETCH_L_BD".."35",
        "FACE_EXPRESSION_MOUTH_STRETCH_R_BD".."36",
        "FACE_EXPRESSION_MOUTH_ROLL_LOWER_BD".."37",
        "FACE_EXPRESSION_MOUTH_ROLL_UPPER_BD".."38",
        "FACE_EXPRESSION_MOUTH_SHRUG_LOWER_BD".."39",
        "FACE_EXPRESSION_MOUTH_SHRUG_UPPER_BD".."40",
        "FACE_EXPRESSION_MOUTH_PRESS_L_BD".."41",
        "FACE_EXPRESSION_MOUTH_PRESS_R_BD".."42",
        "FACE_EXPRESSION_MOUTH_LOWER_DROP_L_BD".."43",
        "FACE_EXPRESSION_MOUTH_LOWER_DROP_R_BD".."44",
        "FACE_EXPRESSION_MOUTH_UPPER_UPWARDS_L_BD".."45",
        "FACE_EXPRESSION_MOUTH_UPPER_UPWARDS_R_BD".."46",
        "FACE_EXPRESSION_JAW_FORWARD_BD".."47",
        "FACE_EXPRESSION_JAW_L_BD".."48",
        "FACE_EXPRESSION_JAW_R_BD".."49",
        "FACE_EXPRESSION_JAW_OPEN_BD".."50",
        "FACE_EXPRESSION_TONGUE_OUT_BD".."51"
    )

    EnumConstant(
        "LIP_EXPRESSION_PP_BD".."0",
        "LIP_EXPRESSION_CH_BD".."1",
        "LIP_EXPRESSION_LO_BD".."2",
        "LIP_EXPRESSION_O_BD".."3",
        "LIP_EXPRESSION_I_BD".."4",
        "LIP_EXPRESSION_LU_BD".."5",
        "LIP_EXPRESSION_RR_BD".."6",
        "LIP_EXPRESSION_XX_BD".."7",
        "LIP_EXPRESSION_LAA_BD".."8",
        "LIP_EXPRESSION_LI_BD".."9",
        "LIP_EXPRESSION_FF_BD".."10",
        "LIP_EXPRESSION_U_BD".."11",
        "LIP_EXPRESSION_TH_BD".."12",
        "LIP_EXPRESSION_LKK_BD".."13",
        "LIP_EXPRESSION_SS_BD".."14",
        "LIP_EXPRESSION_LE_BD".."15",
        "LIP_EXPRESSION_DD_BD".."16",
        "LIP_EXPRESSION_E_BD".."17",
        "LIP_EXPRESSION_LNN_BD".."18",
        "LIP_EXPRESSION_SIL_BD".."19"
    )

    XrResult(
        "EnumerateFacialSimulationModesBD",

        XrSession("session"),
        AutoSize("modes")..uint32_t("modeCapacityInput"),
        Check(1)..uint32_t.p("modeCountOutput"),
        nullable..XrFacialSimulationModeBD.p("modes")
    )

    XrResult(
        "CreateFaceTrackerBD",

        XrSession("session"),
        XrFaceTrackerCreateInfoBD.const.p("createInfo"),
        Check(1)..XrFaceTrackerBD.p("tracker")
    )

    XrResult(
        "DestroyFaceTrackerBD",

        XrFaceTrackerBD("tracker")
    )

    XrResult(
        "GetFacialSimulationDataBD",

        XrFaceTrackerBD("tracker"),
        XrFacialSimulationDataGetInfoBD.const.p("info"),
        XrFacialSimulationDataBD.p("facialData")
    )

    XrResult(
        "SetFacialSimulationModeBD",

        XrFaceTrackerBD("tracker"),
        XrFacialSimulationModeBD("mode")
    )

    XrResult(
        "GetFacialSimulationModeBD",

        XrFaceTrackerBD("tracker"),
        Check(1)..XrFacialSimulationModeBD.p("mode")
    )
}