/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package openxr.templates

import org.lwjgl.generator.*
import openxr.*

val ANDROID_recommended_resolution = "ANDROIDRecommendedResolution".nativeClassXR("ANDROID_recommended_resolution", type = "instance", postfix = "ANDROID") {
    IntConstant(
        "ANDROID_recommended_resolution_SPEC_VERSION".."1"
    )

    StringConstant(
        "ANDROID_RECOMMENDED_RESOLUTION_EXTENSION_NAME".."XR_ANDROID_recommended_resolution"
    )

    EnumConstant(
        "TYPE_EVENT_DATA_RECOMMENDED_RESOLUTION_CHANGED_ANDROID".."1000461000"
    )
}