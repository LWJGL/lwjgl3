/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package vulkan.templates

import org.lwjgl.generator.*
import vulkan.*

val NV_display_stereo = "NVDisplayStereo".nativeClassVK("NV_display_stereo", type = "instance", postfix = "NV") {
    IntConstant(
        "NV_DISPLAY_STEREO_SPEC_VERSION".."1"
    )

    StringConstant(
        "NV_DISPLAY_STEREO_EXTENSION_NAME".."VK_NV_display_stereo"
    )

    EnumConstant(
        "STRUCTURE_TYPE_DISPLAY_SURFACE_STEREO_CREATE_INFO_NV".."1000551000",
        "STRUCTURE_TYPE_DISPLAY_MODE_STEREO_PROPERTIES_NV".."1000551001"
    )

    EnumConstant(
        "DISPLAY_SURFACE_STEREO_TYPE_NONE_NV".."0",
        "DISPLAY_SURFACE_STEREO_TYPE_ONBOARD_DIN_NV".."1",
        "DISPLAY_SURFACE_STEREO_TYPE_HDMI_3D_NV".."2",
        "DISPLAY_SURFACE_STEREO_TYPE_INBAND_DISPLAYPORT_NV".."3"
    )
}