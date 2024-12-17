/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package vulkan.templates

import org.lwjgl.generator.*
import vulkan.*

val EXT_shader_replicated_composites = "EXTShaderReplicatedComposites".nativeClassVK("EXT_shader_replicated_composites", type = "device", postfix = "EXT") {
    IntConstant(
        "EXT_SHADER_REPLICATED_COMPOSITES_SPEC_VERSION".."1"
    )

    StringConstant(
        "EXT_SHADER_REPLICATED_COMPOSITES_EXTENSION_NAME".."VK_EXT_shader_replicated_composites"
    )

    EnumConstant(
        "STRUCTURE_TYPE_PHYSICAL_DEVICE_SHADER_REPLICATED_COMPOSITES_FEATURES_EXT".."1000564000"
    )
}