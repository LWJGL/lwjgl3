/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package vulkan.templates

import org.lwjgl.generator.*
import vulkan.*

val NV_ray_tracing_validation = "NVRayTracingValidation".nativeClassVK("NV_ray_tracing_validation", type = "device", postfix = "NV") {
    IntConstant(
        "NV_RAY_TRACING_VALIDATION_SPEC_VERSION".."1"
    )

    StringConstant(
        "NV_RAY_TRACING_VALIDATION_EXTENSION_NAME".."VK_NV_ray_tracing_validation"
    )

    EnumConstant(
        "STRUCTURE_TYPE_PHYSICAL_DEVICE_RAY_TRACING_VALIDATION_FEATURES_NV".."1000568000"
    )
}