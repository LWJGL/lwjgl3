/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package vulkan.templates

import org.lwjgl.generator.*
import vulkan.*

val VALVE_descriptor_set_host_mapping = "VALVEDescriptorSetHostMapping".nativeClassVK("VALVE_descriptor_set_host_mapping", type = "device", postfix = "VALVE") {
    IntConstant(
        "VALVE_DESCRIPTOR_SET_HOST_MAPPING_SPEC_VERSION".."1"
    )

    StringConstant(
        "VALVE_DESCRIPTOR_SET_HOST_MAPPING_EXTENSION_NAME".."VK_VALVE_descriptor_set_host_mapping"
    )

    EnumConstant(
        "STRUCTURE_TYPE_PHYSICAL_DEVICE_DESCRIPTOR_SET_HOST_MAPPING_FEATURES_VALVE".."1000420000",
        "STRUCTURE_TYPE_DESCRIPTOR_SET_BINDING_REFERENCE_VALVE".."1000420001",
        "STRUCTURE_TYPE_DESCRIPTOR_SET_LAYOUT_HOST_MAPPING_INFO_VALVE".."1000420002"
    )

    void(
        "GetDescriptorSetLayoutHostMappingInfoVALVE",

        VkDevice("device"),
        VkDescriptorSetBindingReferenceVALVE.const.p("pBindingReference"),
        VkDescriptorSetLayoutHostMappingInfoVALVE.p("pHostMapping")
    )

    void(
        "GetDescriptorSetHostMappingVALVE",

        VkDevice("device"),
        VkDescriptorSet("descriptorSet"),
        Check(1)..void.p.p("ppData")
    )
}