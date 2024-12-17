/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package ovr.templates

import org.lwjgl.generator.*

val OVR_Keys = "OVRKeys".nativeClass(Module.OVR, prefix = "OVR") {
    StringConstant(
        "KEY_USER".."User", // string
        "KEY_NAME".."Name", // string
        "KEY_GENDER".."Gender", // string "Male", "Female", or "Unknown"
        "KEY_PLAYER_HEIGHT".."PlayerHeight", // float meters
        "KEY_EYE_HEIGHT".."EyeHeight", // float meters
        "KEY_NECK_TO_EYE_DISTANCE".."NeckEyeDistance", // float[2] meters
        "KEY_EYE_TO_NOSE_DISTANCE".."EyeToNoseDist" // float[2] meters
    )

    StringConstant(
        "DEFAULT_GENDER".."Unknown" // string
    )

    FloatConstant(
        "DEFAULT_PLAYER_HEIGHT"..1.778f,
        "DEFAULT_EYE_HEIGHT"..1.675f,
        "DEFAULT_NECK_TO_EYE_HORIZONTAL"..0.0805f,
        "DEFAULT_NECK_TO_EYE_VERTICAL"..0.075f
    )

    StringConstant(
        "PERF_HUDE_MODE".."PerfHudMode"
    )

    StringConstant(
        "LAYER_HUD_MODE".."LayerHudMode",
        "LAYER_HUD_CURRENT_LAYER".."LayerHudCurrentLayer",
        "LAYER_HUD_SHOW_ALL_LAYERS".."LayerHudShowAll"
    )

    StringConstant(
        "DEBUG_HUD_STEREO_MODE".."DebugHudStereoMode", // int, see enum ovrDebugHudStereoMode
        "DEBUG_HUD_STEREO_GUIDE_INFO_ENABLE".."DebugHudStereoGuideInfoEnable", // bool
        "DEBUG_HUD_STEREO_GUIDE_SIZE".."DebugHudStereoGuideSize2f", // float[2]
        "DEBUG_HUD_STEREO_GUIDE_POSITION".."DebugHudStereoGuidePosition3f", // float[3]
        "DEBUG_HUD_STEREO_GUIDE_YAWPITCHROLL".."DebugHudStereoGuideYawPitchRoll3f", // float[3]
        "DEBUG_HUD_STEREO_GUIDE_COLOR".."DebugHudStereoGuideColor4f" // float[4]
    )
}