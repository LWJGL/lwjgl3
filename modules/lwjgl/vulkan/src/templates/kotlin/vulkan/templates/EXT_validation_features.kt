/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package vulkan.templates

import org.lwjgl.generator.*
import vulkan.*

val EXT_validation_features = "EXTValidationFeatures".nativeClassVK("EXT_validation_features", type = "instance", postfix = "EXT") {
    IntConstant(
        "EXT_VALIDATION_FEATURES_SPEC_VERSION".."6"
    )

    StringConstant(
        "EXT_VALIDATION_FEATURES_EXTENSION_NAME".."VK_EXT_validation_features"
    )

    EnumConstant(
        "STRUCTURE_TYPE_VALIDATION_FEATURES_EXT".."1000247000"
    )

    EnumConstant(
        "VALIDATION_FEATURE_ENABLE_GPU_ASSISTED_EXT".."0",
        "VALIDATION_FEATURE_ENABLE_GPU_ASSISTED_RESERVE_BINDING_SLOT_EXT".."1",
        "VALIDATION_FEATURE_ENABLE_BEST_PRACTICES_EXT".."2",
        "VALIDATION_FEATURE_ENABLE_DEBUG_PRINTF_EXT".."3",
        "VALIDATION_FEATURE_ENABLE_SYNCHRONIZATION_VALIDATION_EXT".."4"
    )

    EnumConstant(
        "VALIDATION_FEATURE_DISABLE_ALL_EXT".."0",
        "VALIDATION_FEATURE_DISABLE_SHADERS_EXT".."1",
        "VALIDATION_FEATURE_DISABLE_THREAD_SAFETY_EXT".."2",
        "VALIDATION_FEATURE_DISABLE_API_PARAMETERS_EXT".."3",
        "VALIDATION_FEATURE_DISABLE_OBJECT_LIFETIMES_EXT".."4",
        "VALIDATION_FEATURE_DISABLE_CORE_CHECKS_EXT".."5",
        "VALIDATION_FEATURE_DISABLE_UNIQUE_HANDLES_EXT".."6",
        "VALIDATION_FEATURE_DISABLE_SHADER_VALIDATION_CACHE_EXT".."7"
    )
}