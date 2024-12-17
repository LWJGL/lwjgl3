/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.vulkan;

import org.jspecify.annotations.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.JNI.*;
import static org.lwjgl.system.MemoryUtil.*;

public class EXTPipelineProperties {

    public static final int VK_EXT_PIPELINE_PROPERTIES_SPEC_VERSION = 1;

    public static final String VK_EXT_PIPELINE_PROPERTIES_EXTENSION_NAME = "VK_EXT_pipeline_properties";

    public static final int
        VK_STRUCTURE_TYPE_PIPELINE_PROPERTIES_IDENTIFIER_EXT               = 1000372000,
        VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_PIPELINE_PROPERTIES_FEATURES_EXT = 1000372001,
        VK_STRUCTURE_TYPE_PIPELINE_INFO_EXT                                = 1000372001;

    protected EXTPipelineProperties() {
        throw new UnsupportedOperationException();
    }

    // --- [ vkGetPipelinePropertiesEXT ] ---

    /** {@code VkResult vkGetPipelinePropertiesEXT(VkDevice device, VkPipelineInfoEXT const * pPipelineInfo, VkBaseOutStructure * pPipelineProperties)} */
    public static int nvkGetPipelinePropertiesEXT(VkDevice device, long pPipelineInfo, long pPipelineProperties) {
        long __functionAddress = device.getCapabilities().vkGetPipelinePropertiesEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPPPI(device.address(), pPipelineInfo, pPipelineProperties, __functionAddress);
    }

    /** {@code VkResult vkGetPipelinePropertiesEXT(VkDevice device, VkPipelineInfoEXT const * pPipelineInfo, VkBaseOutStructure * pPipelineProperties)} */
    @NativeType("VkResult")
    public static int vkGetPipelinePropertiesEXT(VkDevice device, @NativeType("VkPipelineInfoEXT const *") VkPipelineInfoEXT pPipelineInfo, @NativeType("VkBaseOutStructure *") @Nullable VkBaseOutStructure pPipelineProperties) {
        return nvkGetPipelinePropertiesEXT(device, pPipelineInfo.address(), memAddressSafe(pPipelineProperties));
    }

}