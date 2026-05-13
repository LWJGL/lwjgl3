/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package openxr.templates

import org.lwjgl.generator.*
import openxr.*

val META_face_tracking_visemes = "METAFaceTrackingVisemes".nativeClassXR("META_face_tracking_visemes", type = "instance", postfix = "META") {
    IntConstant(
        "META_face_tracking_visemes_SPEC_VERSION".."1"
    )

    StringConstant(
        "META_FACE_TRACKING_VISEMES_EXTENSION_NAME".."XR_META_face_tracking_visemes"
    )

    EnumConstant(
        "FACE_TRACKING_VISEME_COUNT_META".."15"
    )

    EnumConstant(
        "TYPE_FACE_TRACKING_VISEMES_META".."1000541000",
        "TYPE_SYSTEM_FACE_TRACKING_VISEMES_PROPERTIES_META".."1000541001"
    )

    EnumConstant(
        "FACE_TRACKING_VISEME_SIL_META".."0",
        "FACE_TRACKING_VISEME_PP_META".."1",
        "FACE_TRACKING_VISEME_FF_META".."2",
        "FACE_TRACKING_VISEME_TH_META".."3",
        "FACE_TRACKING_VISEME_DD_META".."4",
        "FACE_TRACKING_VISEME_KK_META".."5",
        "FACE_TRACKING_VISEME_CH_META".."6",
        "FACE_TRACKING_VISEME_SS_META".."7",
        "FACE_TRACKING_VISEME_NN_META".."8",
        "FACE_TRACKING_VISEME_RR_META".."9",
        "FACE_TRACKING_VISEME_AA_META".."10",
        "FACE_TRACKING_VISEME_E_META".."11",
        "FACE_TRACKING_VISEME_IH_META".."12",
        "FACE_TRACKING_VISEME_OH_META".."13",
        "FACE_TRACKING_VISEME_OU_META".."14"
    )
}