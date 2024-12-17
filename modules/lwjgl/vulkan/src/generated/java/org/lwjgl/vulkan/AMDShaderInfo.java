/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.vulkan;

import org.jspecify.annotations.*;

import java.nio.*;

import org.lwjgl.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.JNI.*;
import static org.lwjgl.system.MemoryUtil.*;

public class AMDShaderInfo {

    public static final int VK_AMD_SHADER_INFO_SPEC_VERSION = 1;

    public static final String VK_AMD_SHADER_INFO_EXTENSION_NAME = "VK_AMD_shader_info";

    public static final int
        VK_SHADER_INFO_TYPE_STATISTICS_AMD  = 0,
        VK_SHADER_INFO_TYPE_BINARY_AMD      = 1,
        VK_SHADER_INFO_TYPE_DISASSEMBLY_AMD = 2;

    protected AMDShaderInfo() {
        throw new UnsupportedOperationException();
    }

    // --- [ vkGetShaderInfoAMD ] ---

    /** {@code VkResult vkGetShaderInfoAMD(VkDevice device, VkPipeline pipeline, VkShaderStageFlagBits shaderStage, VkShaderInfoTypeAMD infoType, size_t * pInfoSize, void * pInfo)} */
    public static int nvkGetShaderInfoAMD(VkDevice device, long pipeline, int shaderStage, int infoType, long pInfoSize, long pInfo) {
        long __functionAddress = device.getCapabilities().vkGetShaderInfoAMD;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPJPPI(device.address(), pipeline, shaderStage, infoType, pInfoSize, pInfo, __functionAddress);
    }

    /** {@code VkResult vkGetShaderInfoAMD(VkDevice device, VkPipeline pipeline, VkShaderStageFlagBits shaderStage, VkShaderInfoTypeAMD infoType, size_t * pInfoSize, void * pInfo)} */
    @NativeType("VkResult")
    public static int vkGetShaderInfoAMD(VkDevice device, @NativeType("VkPipeline") long pipeline, @NativeType("VkShaderStageFlagBits") int shaderStage, @NativeType("VkShaderInfoTypeAMD") int infoType, @NativeType("size_t *") PointerBuffer pInfoSize, @NativeType("void *") @Nullable ByteBuffer pInfo) {
        if (CHECKS) {
            check(pInfoSize, 1);
            checkSafe(pInfo, pInfoSize.get(pInfoSize.position()));
        }
        return nvkGetShaderInfoAMD(device, pipeline, shaderStage, infoType, memAddress(pInfoSize), memAddressSafe(pInfo));
    }

}