/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package vulkan.templates

import org.lwjgl.generator.*
import vulkan.*

val NV_device_diagnostics_config = "NVDeviceDiagnosticsConfig".nativeClassVK("NV_device_diagnostics_config", type = "device", postfix = "NV") {
    IntConstant(
        "NV_DEVICE_DIAGNOSTICS_CONFIG_SPEC_VERSION".."2"
    )

    StringConstant(
        "NV_DEVICE_DIAGNOSTICS_CONFIG_EXTENSION_NAME".."VK_NV_device_diagnostics_config"
    )

    EnumConstant(
        "STRUCTURE_TYPE_PHYSICAL_DEVICE_DIAGNOSTICS_CONFIG_FEATURES_NV".."1000300000",
        "STRUCTURE_TYPE_DEVICE_DIAGNOSTICS_CONFIG_CREATE_INFO_NV".."1000300001"
    )

    EnumConstant(
        "DEVICE_DIAGNOSTICS_CONFIG_ENABLE_SHADER_DEBUG_INFO_BIT_NV".enum(0x00000001),
        "DEVICE_DIAGNOSTICS_CONFIG_ENABLE_RESOURCE_TRACKING_BIT_NV".enum(0x00000002),
        "DEVICE_DIAGNOSTICS_CONFIG_ENABLE_AUTOMATIC_CHECKPOINTS_BIT_NV".enum(0x00000004),
        "DEVICE_DIAGNOSTICS_CONFIG_ENABLE_SHADER_ERROR_REPORTING_BIT_NV".enum(0x00000008)
    )
}