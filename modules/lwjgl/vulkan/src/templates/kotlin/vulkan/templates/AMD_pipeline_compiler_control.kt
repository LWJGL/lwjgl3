/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package vulkan.templates

import org.lwjgl.generator.*
import vulkan.*

val AMD_pipeline_compiler_control = "AMDPipelineCompilerControl".nativeClassVK("AMD_pipeline_compiler_control", type = "device", postfix = "AMD") {
    IntConstant(
        "AMD_PIPELINE_COMPILER_CONTROL_SPEC_VERSION".."1"
    )

    StringConstant(
        "AMD_PIPELINE_COMPILER_CONTROL_EXTENSION_NAME".."VK_AMD_pipeline_compiler_control"
    )

    EnumConstant(
        "STRUCTURE_TYPE_PIPELINE_COMPILER_CONTROL_CREATE_INFO_AMD".."1000183000"
    )
}