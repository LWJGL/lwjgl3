/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.vulkan;

import org.lwjgl.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.JNI.*;
import static org.lwjgl.system.MemoryUtil.*;

public class VALVEDescriptorSetHostMapping {

    public static final int VK_VALVE_DESCRIPTOR_SET_HOST_MAPPING_SPEC_VERSION = 1;

    public static final String VK_VALVE_DESCRIPTOR_SET_HOST_MAPPING_EXTENSION_NAME = "VK_VALVE_descriptor_set_host_mapping";

    public static final int
        VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_DESCRIPTOR_SET_HOST_MAPPING_FEATURES_VALVE = 1000420000,
        VK_STRUCTURE_TYPE_DESCRIPTOR_SET_BINDING_REFERENCE_VALVE                     = 1000420001,
        VK_STRUCTURE_TYPE_DESCRIPTOR_SET_LAYOUT_HOST_MAPPING_INFO_VALVE              = 1000420002;

    protected VALVEDescriptorSetHostMapping() {
        throw new UnsupportedOperationException();
    }

    // --- [ vkGetDescriptorSetLayoutHostMappingInfoVALVE ] ---

    /** {@code void vkGetDescriptorSetLayoutHostMappingInfoVALVE(VkDevice device, VkDescriptorSetBindingReferenceVALVE const * pBindingReference, VkDescriptorSetLayoutHostMappingInfoVALVE * pHostMapping)} */
    public static void nvkGetDescriptorSetLayoutHostMappingInfoVALVE(VkDevice device, long pBindingReference, long pHostMapping) {
        long __functionAddress = device.getCapabilities().vkGetDescriptorSetLayoutHostMappingInfoVALVE;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPPPV(device.address(), pBindingReference, pHostMapping, __functionAddress);
    }

    /** {@code void vkGetDescriptorSetLayoutHostMappingInfoVALVE(VkDevice device, VkDescriptorSetBindingReferenceVALVE const * pBindingReference, VkDescriptorSetLayoutHostMappingInfoVALVE * pHostMapping)} */
    public static void vkGetDescriptorSetLayoutHostMappingInfoVALVE(VkDevice device, @NativeType("VkDescriptorSetBindingReferenceVALVE const *") VkDescriptorSetBindingReferenceVALVE pBindingReference, @NativeType("VkDescriptorSetLayoutHostMappingInfoVALVE *") VkDescriptorSetLayoutHostMappingInfoVALVE pHostMapping) {
        nvkGetDescriptorSetLayoutHostMappingInfoVALVE(device, pBindingReference.address(), pHostMapping.address());
    }

    // --- [ vkGetDescriptorSetHostMappingVALVE ] ---

    /** {@code void vkGetDescriptorSetHostMappingVALVE(VkDevice device, VkDescriptorSet descriptorSet, void ** ppData)} */
    public static void nvkGetDescriptorSetHostMappingVALVE(VkDevice device, long descriptorSet, long ppData) {
        long __functionAddress = device.getCapabilities().vkGetDescriptorSetHostMappingVALVE;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPJPV(device.address(), descriptorSet, ppData, __functionAddress);
    }

    /** {@code void vkGetDescriptorSetHostMappingVALVE(VkDevice device, VkDescriptorSet descriptorSet, void ** ppData)} */
    public static void vkGetDescriptorSetHostMappingVALVE(VkDevice device, @NativeType("VkDescriptorSet") long descriptorSet, @NativeType("void **") PointerBuffer ppData) {
        if (CHECKS) {
            check(ppData, 1);
        }
        nvkGetDescriptorSetHostMappingVALVE(device, descriptorSet, memAddress(ppData));
    }

}