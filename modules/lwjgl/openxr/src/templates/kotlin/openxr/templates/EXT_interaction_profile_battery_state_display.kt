/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package openxr.templates

import org.lwjgl.generator.*
import openxr.*

val EXT_interaction_profile_battery_state_display = "EXTInteractionProfileBatteryStateDisplay".nativeClassXR("EXT_interaction_profile_battery_state_display", type = "instance", postfix = "EXT") {
    IntConstant(
        "EXT_interaction_profile_battery_state_display_SPEC_VERSION".."1"
    )

    StringConstant(
        "EXT_INTERACTION_PROFILE_BATTERY_STATE_DISPLAY_EXTENSION_NAME".."XR_EXT_interaction_profile_battery_state_display"
    )

    EnumConstant(
        "TYPE_BATTERY_STATE_DISPLAY_EXT".."1000836000"
    )

    EnumConstant(
        "BATTERY_STATE_DISPLAY_STATE_VALID_BIT_EXT".enum(0x00000001),
        "BATTERY_STATE_DISPLAY_STATE_CHARGING_BIT_EXT".enum(0x00000002),
        "BATTERY_STATE_DISPLAY_STATE_PLUGGED_IN_BIT_EXT".enum(0x00000004),
        "BATTERY_STATE_DISPLAY_STATE_NO_BATTERY_BIT_EXT".enum(0x00000008)
    )
}