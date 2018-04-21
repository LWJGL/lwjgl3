/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.ovr;

/** Keys for libOVR's CAPI calls. */
public final class OVRKeys {

    /** Keys for property function calls. */
    public static final String
        OVR_KEY_USER                 = "User",
        OVR_KEY_NAME                 = "Name",
        OVR_KEY_GENDER               = "Gender",
        OVR_KEY_PLAYER_HEIGHT        = "PlayerHeight",
        OVR_KEY_EYE_HEIGHT           = "EyeHeight",
        OVR_KEY_NECK_TO_EYE_DISTANCE = "NeckEyeDistance",
        OVR_KEY_EYE_TO_NOSE_DISTANCE = "EyeToNoseDist";

    public static final String OVR_DEFAULT_GENDER = "Unknown";

    /** Default measurements empirically determined at Oculus. */
    public static final float
        OVR_DEFAULT_PLAYER_HEIGHT          = 1.778f,
        OVR_DEFAULT_EYE_HEIGHT             = 1.675f,
        OVR_DEFAULT_NECK_TO_EYE_HORIZONTAL = 0.0805f,
        OVR_DEFAULT_NECK_TO_EYE_VERTICAL   = 0.075f;

    /** int, allowed values are defined in {@code enum ovrPerfHudMode} */
    public static final String OVR_PERF_HUDE_MODE = "PerfHudMode";

    /** int, allowed values are defined in {@code enum ovrLayerHudMode}. */
    public static final String OVR_LAYER_HUD_MODE = "LayerHudMode";

    /** int, the layer to show. */
    public static final String OVR_LAYER_HUD_CURRENT_LAYER = "LayerHudCurrentLayer";

    /** bool, hide other layers when the hud is enabled. */
    public static final String OVR_LAYER_HUD_SHOW_ALL_LAYERS = "LayerHudShowAll";

    public static final String
        OVR_DEBUG_HUD_STEREO_MODE               = "DebugHudStereoMode",
        OVR_DEBUG_HUD_STEREO_GUIDE_INFO_ENABLE  = "DebugHudStereoGuideInfoEnable",
        OVR_DEBUG_HUD_STEREO_GUIDE_SIZE         = "DebugHudStereoGuideSize2f",
        OVR_DEBUG_HUD_STEREO_GUIDE_POSITION     = "DebugHudStereoGuidePosition3f",
        OVR_DEBUG_HUD_STEREO_GUIDE_YAWPITCHROLL = "DebugHudStereoGuideYawPitchRoll3f",
        OVR_DEBUG_HUD_STEREO_GUIDE_COLOR        = "DebugHudStereoGuideColor4f";

    private OVRKeys() {}

}