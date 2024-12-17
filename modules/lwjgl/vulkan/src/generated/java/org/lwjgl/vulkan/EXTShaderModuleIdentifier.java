/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.vulkan;

import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.JNI.*;

public class EXTShaderModuleIdentifier {

    public static final int VK_EXT_SHADER_MODULE_IDENTIFIER_SPEC_VERSION = 1;

    public static final String VK_EXT_SHADER_MODULE_IDENTIFIER_EXTENSION_NAME = "VK_EXT_shader_module_identifier";

    public static final int
        VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_SHADER_MODULE_IDENTIFIER_FEATURES_EXT   = 1000462000,
        VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_SHADER_MODULE_IDENTIFIER_PROPERTIES_EXT = 1000462001,
        VK_STRUCTURE_TYPE_PIPELINE_SHADER_STAGE_MODULE_IDENTIFIER_CREATE_INFO_EXT = 1000462002,
        VK_STRUCTURE_TYPE_SHADER_MODULE_IDENTIFIER_EXT                            = 1000462003;

    public static final int VK_MAX_SHADER_MODULE_IDENTIFIER_SIZE_EXT = 32;

    protected EXTShaderModuleIdentifier() {
        throw new UnsupportedOperationException();
    }

    // --- [ vkGetShaderModuleIdentifierEXT ] ---

    /** {@code void vkGetShaderModuleIdentifierEXT(VkDevice device, VkShaderModule shaderModule, VkShaderModuleIdentifierEXT * pIdentifier)} */
    public static void nvkGetShaderModuleIdentifierEXT(VkDevice device, long shaderModule, long pIdentifier) {
        long __functionAddress = device.getCapabilities().vkGetShaderModuleIdentifierEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPJPV(device.address(), shaderModule, pIdentifier, __functionAddress);
    }

    /** {@code void vkGetShaderModuleIdentifierEXT(VkDevice device, VkShaderModule shaderModule, VkShaderModuleIdentifierEXT * pIdentifier)} */
    public static void vkGetShaderModuleIdentifierEXT(VkDevice device, @NativeType("VkShaderModule") long shaderModule, @NativeType("VkShaderModuleIdentifierEXT *") VkShaderModuleIdentifierEXT pIdentifier) {
        nvkGetShaderModuleIdentifierEXT(device, shaderModule, pIdentifier.address());
    }

    // --- [ vkGetShaderModuleCreateInfoIdentifierEXT ] ---

    /** {@code void vkGetShaderModuleCreateInfoIdentifierEXT(VkDevice device, VkShaderModuleCreateInfo const * pCreateInfo, VkShaderModuleIdentifierEXT * pIdentifier)} */
    public static void nvkGetShaderModuleCreateInfoIdentifierEXT(VkDevice device, long pCreateInfo, long pIdentifier) {
        long __functionAddress = device.getCapabilities().vkGetShaderModuleCreateInfoIdentifierEXT;
        if (CHECKS) {
            check(__functionAddress);
            VkShaderModuleCreateInfo.validate(pCreateInfo);
        }
        callPPPV(device.address(), pCreateInfo, pIdentifier, __functionAddress);
    }

    /** {@code void vkGetShaderModuleCreateInfoIdentifierEXT(VkDevice device, VkShaderModuleCreateInfo const * pCreateInfo, VkShaderModuleIdentifierEXT * pIdentifier)} */
    public static void vkGetShaderModuleCreateInfoIdentifierEXT(VkDevice device, @NativeType("VkShaderModuleCreateInfo const *") VkShaderModuleCreateInfo pCreateInfo, @NativeType("VkShaderModuleIdentifierEXT *") VkShaderModuleIdentifierEXT pIdentifier) {
        nvkGetShaderModuleCreateInfoIdentifierEXT(device, pCreateInfo.address(), pIdentifier.address());
    }

}