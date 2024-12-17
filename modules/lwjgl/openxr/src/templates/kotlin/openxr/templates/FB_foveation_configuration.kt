/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package openxr.templates

import org.lwjgl.generator.*
import openxr.*

val FB_foveation_configuration = "FBFoveationConfiguration".nativeClassXR("FB_foveation_configuration", type = "instance", postfix = "FB") {
    IntConstant(
        "FB_foveation_configuration_SPEC_VERSION".."1"
    )

    StringConstant(
        "FB_FOVEATION_CONFIGURATION_EXTENSION_NAME".."XR_FB_foveation_configuration"
    )

    EnumConstant(
        "TYPE_FOVEATION_LEVEL_PROFILE_CREATE_INFO_FB".."1000115000"
    )

    EnumConstant(
        "FOVEATION_LEVEL_NONE_FB".."0",
        "FOVEATION_LEVEL_LOW_FB".."1",
        "FOVEATION_LEVEL_MEDIUM_FB".."2",
        "FOVEATION_LEVEL_HIGH_FB".."3"
    )

    EnumConstant(
        "FOVEATION_DYNAMIC_DISABLED_FB".."0",
        "FOVEATION_DYNAMIC_LEVEL_ENABLED_FB".."1"
    )
}