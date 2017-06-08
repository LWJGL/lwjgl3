/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package org.lwjgl.ovr.templates

import org.lwjgl.generator.*
import org.lwjgl.ovr.*

val OVR_Keys = "OVRKeys".nativeClass(packageName = OVR_PACKAGE, prefix = "OVR") {
    documentation = "Keys for libOVR's CAPI calls."

    StringConstant(
        "Keys for property function calls.",

        "KEY_USER".."User", // string
        "KEY_NAME".."Name", // string
        "KEY_GENDER".."Gender", // string "Male", "Female", or "Unknown"
        "KEY_PLAYER_HEIGHT".."PlayerHeight", // float meters
        "KEY_EYE_HEIGHT".."EyeHeight", // float meters
        "KEY_NECK_TO_EYE_DISTANCE".."NeckEyeDistance", // float[2] meters
        "KEY_EYE_TO_NOSE_DISTANCE".."EyeToNoseDist" // float[2] meters
    )

    StringConstant(
        "",

        "DEFAULT_GENDER".."Unknown" // string
    )

    FloatConstant(
        "Default measurements empirically determined at Oculus.",

        "DEFAULT_PLAYER_HEIGHT"..1.778f,
        "DEFAULT_EYE_HEIGHT"..1.675f,
        "DEFAULT_NECK_TO_EYE_HORIZONTAL"..0.0805f,
        "DEFAULT_NECK_TO_EYE_VERTICAL"..0.075f
    )

    StringConstant(
        "int, allowed values are defined in {@code enum ovrPerfHudMode}",

        "PERF_HUDE_MODE".."PerfHudMode"
    )

    StringConstant("int, allowed values are defined in {@code enum ovrLayerHudMode}.", "LAYER_HUD_MODE".."LayerHudMode")
    StringConstant("int, the layer to show.", "LAYER_HUD_CURRENT_LAYER".."LayerHudCurrentLayer")
    StringConstant("bool, hide other layers when the hud is enabled.", "LAYER_HUD_SHOW_ALL_LAYERS".."LayerHudShowAll")

    StringConstant(
        "",

        "DEBUG_HUD_STEREO_MODE".."DebugHudStereoMode", // int, see enum ovrDebugHudStereoMode
        "DEBUG_HUD_STEREO_GUIDE_INFO_ENABLE".."DebugHudStereoGuideInfoEnable", // bool
        "DEBUG_HUD_STEREO_GUIDE_SIZE".."DebugHudStereoGuideSize2f", // float[2]
        "DEBUG_HUD_STEREO_GUIDE_POSITION".."DebugHudStereoGuidePosition3f", // float[3]
        "DEBUG_HUD_STEREO_GUIDE_YAWPITCHROLL".."DebugHudStereoGuideYawPitchRoll3f", // float[3]
        "DEBUG_HUD_STEREO_GUIDE_COLOR".."DebugHudStereoGuideColor4f" // float[4]
    )
}