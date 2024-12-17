/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package vulkan.templates

import org.lwjgl.generator.*
import vulkan.*

val AMD_texture_gather_bias_lod = "AMDTextureGatherBiasLod".nativeClassVK("AMD_texture_gather_bias_lod", type = "device", postfix = "AMD") {
    IntConstant(
        "AMD_TEXTURE_GATHER_BIAS_LOD_SPEC_VERSION".."1"
    )

    StringConstant(
        "AMD_TEXTURE_GATHER_BIAS_LOD_EXTENSION_NAME".."VK_AMD_texture_gather_bias_lod"
    )

    EnumConstant(
        "STRUCTURE_TYPE_TEXTURE_LOD_GATHER_FORMAT_PROPERTIES_AMD".."1000041000"
    )
}