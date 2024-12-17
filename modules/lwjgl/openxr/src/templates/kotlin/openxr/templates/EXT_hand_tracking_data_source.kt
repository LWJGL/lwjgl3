/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package openxr.templates

import org.lwjgl.generator.*
import openxr.*

val EXT_hand_tracking_data_source = "EXTHandTrackingDataSource".nativeClassXR("EXT_hand_tracking_data_source", type = "instance", postfix = "EXT") {
    IntConstant(
        "EXT_hand_tracking_data_source_SPEC_VERSION".."1"
    )

    StringConstant(
        "EXT_HAND_TRACKING_DATA_SOURCE_EXTENSION_NAME".."XR_EXT_hand_tracking_data_source"
    )

    EnumConstant(
        "TYPE_HAND_TRACKING_DATA_SOURCE_INFO_EXT".."1000428000",
        "TYPE_HAND_TRACKING_DATA_SOURCE_STATE_EXT".."1000428001"
    )

    EnumConstant(
        "HAND_TRACKING_DATA_SOURCE_UNOBSTRUCTED_EXT".."1",
        "HAND_TRACKING_DATA_SOURCE_CONTROLLER_EXT".."2"
    )
}