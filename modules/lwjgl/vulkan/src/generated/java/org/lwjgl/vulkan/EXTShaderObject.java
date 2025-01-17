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

public class EXTShaderObject {

    public static final int VK_EXT_SHADER_OBJECT_SPEC_VERSION = 1;

    public static final String VK_EXT_SHADER_OBJECT_EXTENSION_NAME = "VK_EXT_shader_object";

    public static final int
        VK_STRUCTURE_TYPE_SHADER_REQUIRED_SUBGROUP_SIZE_CREATE_INFO_EXT = 1000225001,
        VK_STRUCTURE_TYPE_VERTEX_INPUT_BINDING_DESCRIPTION_2_EXT        = 1000352001,
        VK_STRUCTURE_TYPE_VERTEX_INPUT_ATTRIBUTE_DESCRIPTION_2_EXT      = 1000352002,
        VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_SHADER_OBJECT_FEATURES_EXT    = 1000482000,
        VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_SHADER_OBJECT_PROPERTIES_EXT  = 1000482001,
        VK_STRUCTURE_TYPE_SHADER_CREATE_INFO_EXT                        = 1000482002;

    public static final int VK_OBJECT_TYPE_SHADER_EXT = 1000482000;

    public static final int
        VK_INCOMPATIBLE_SHADER_BINARY_EXT       = 1000482000,
        VK_ERROR_INCOMPATIBLE_SHADER_BINARY_EXT = 1000482000;

    public static final int
        VK_SHADER_CREATE_LINK_STAGE_BIT_EXT                       = 0x1,
        VK_SHADER_CREATE_ALLOW_VARYING_SUBGROUP_SIZE_BIT_EXT      = 0x2,
        VK_SHADER_CREATE_REQUIRE_FULL_SUBGROUPS_BIT_EXT           = 0x4,
        VK_SHADER_CREATE_NO_TASK_SHADER_BIT_EXT                   = 0x8,
        VK_SHADER_CREATE_DISPATCH_BASE_BIT_EXT                    = 0x10,
        VK_SHADER_CREATE_FRAGMENT_SHADING_RATE_ATTACHMENT_BIT_EXT = 0x20,
        VK_SHADER_CREATE_FRAGMENT_DENSITY_MAP_ATTACHMENT_BIT_EXT  = 0x40;

    public static final int
        VK_SHADER_CODE_TYPE_BINARY_EXT = 0,
        VK_SHADER_CODE_TYPE_SPIRV_EXT  = 1;

    public static final int
        VK_DEPTH_CLAMP_MODE_VIEWPORT_RANGE_EXT     = 0,
        VK_DEPTH_CLAMP_MODE_USER_DEFINED_RANGE_EXT = 1;

    protected EXTShaderObject() {
        throw new UnsupportedOperationException();
    }

    // --- [ vkCreateShadersEXT ] ---

    /** {@code VkResult vkCreateShadersEXT(VkDevice device, uint32_t createInfoCount, VkShaderCreateInfoEXT const * pCreateInfos, VkAllocationCallbacks const * pAllocator, VkShaderEXT * pShaders)} */
    public static int nvkCreateShadersEXT(VkDevice device, int createInfoCount, long pCreateInfos, long pAllocator, long pShaders) {
        long __functionAddress = device.getCapabilities().vkCreateShadersEXT;
        if (CHECKS) {
            check(__functionAddress);
            Struct.validate(pCreateInfos, createInfoCount, VkShaderCreateInfoEXT.SIZEOF, VkShaderCreateInfoEXT::validate);
        }
        return callPPPPI(device.address(), createInfoCount, pCreateInfos, pAllocator, pShaders, __functionAddress);
    }

    /** {@code VkResult vkCreateShadersEXT(VkDevice device, uint32_t createInfoCount, VkShaderCreateInfoEXT const * pCreateInfos, VkAllocationCallbacks const * pAllocator, VkShaderEXT * pShaders)} */
    @NativeType("VkResult")
    public static int vkCreateShadersEXT(VkDevice device, @NativeType("VkShaderCreateInfoEXT const *") VkShaderCreateInfoEXT.Buffer pCreateInfos, @NativeType("VkAllocationCallbacks const *") @Nullable VkAllocationCallbacks pAllocator, @NativeType("VkShaderEXT *") LongBuffer pShaders) {
        if (CHECKS) {
            check(pShaders, pCreateInfos.remaining());
        }
        return nvkCreateShadersEXT(device, pCreateInfos.remaining(), pCreateInfos.address(), memAddressSafe(pAllocator), memAddress(pShaders));
    }

    // --- [ vkDestroyShaderEXT ] ---

    /** {@code void vkDestroyShaderEXT(VkDevice device, VkShaderEXT shader, VkAllocationCallbacks const * pAllocator)} */
    public static void nvkDestroyShaderEXT(VkDevice device, long shader, long pAllocator) {
        long __functionAddress = device.getCapabilities().vkDestroyShaderEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPJPV(device.address(), shader, pAllocator, __functionAddress);
    }

    /** {@code void vkDestroyShaderEXT(VkDevice device, VkShaderEXT shader, VkAllocationCallbacks const * pAllocator)} */
    public static void vkDestroyShaderEXT(VkDevice device, @NativeType("VkShaderEXT") long shader, @NativeType("VkAllocationCallbacks const *") @Nullable VkAllocationCallbacks pAllocator) {
        nvkDestroyShaderEXT(device, shader, memAddressSafe(pAllocator));
    }

    // --- [ vkGetShaderBinaryDataEXT ] ---

    /** {@code VkResult vkGetShaderBinaryDataEXT(VkDevice device, VkShaderEXT shader, size_t * pDataSize, void * pData)} */
    public static int nvkGetShaderBinaryDataEXT(VkDevice device, long shader, long pDataSize, long pData) {
        long __functionAddress = device.getCapabilities().vkGetShaderBinaryDataEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPJPPI(device.address(), shader, pDataSize, pData, __functionAddress);
    }

    /** {@code VkResult vkGetShaderBinaryDataEXT(VkDevice device, VkShaderEXT shader, size_t * pDataSize, void * pData)} */
    @NativeType("VkResult")
    public static int vkGetShaderBinaryDataEXT(VkDevice device, @NativeType("VkShaderEXT") long shader, @NativeType("size_t *") PointerBuffer pDataSize, @NativeType("void *") @Nullable ByteBuffer pData) {
        if (CHECKS) {
            check(pDataSize, 1);
            checkSafe(pData, pDataSize.get(pDataSize.position()));
        }
        return nvkGetShaderBinaryDataEXT(device, shader, memAddress(pDataSize), memAddressSafe(pData));
    }

    // --- [ vkCmdBindShadersEXT ] ---

    /** {@code void vkCmdBindShadersEXT(VkCommandBuffer commandBuffer, uint32_t stageCount, VkShaderStageFlagBits const * pStages, VkShaderEXT const * pShaders)} */
    public static void nvkCmdBindShadersEXT(VkCommandBuffer commandBuffer, int stageCount, long pStages, long pShaders) {
        long __functionAddress = commandBuffer.getCapabilities().vkCmdBindShadersEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPPPV(commandBuffer.address(), stageCount, pStages, pShaders, __functionAddress);
    }

    /** {@code void vkCmdBindShadersEXT(VkCommandBuffer commandBuffer, uint32_t stageCount, VkShaderStageFlagBits const * pStages, VkShaderEXT const * pShaders)} */
    public static void vkCmdBindShadersEXT(VkCommandBuffer commandBuffer, @NativeType("VkShaderStageFlagBits const *") IntBuffer pStages, @NativeType("VkShaderEXT const *") LongBuffer pShaders) {
        if (CHECKS) {
            check(pShaders, pStages.remaining());
        }
        nvkCmdBindShadersEXT(commandBuffer, pStages.remaining(), memAddress(pStages), memAddress(pShaders));
    }

    // --- [ vkCmdSetCullModeEXT ] ---

    /** {@code void vkCmdSetCullModeEXT(VkCommandBuffer commandBuffer, VkCullModeFlags cullMode)} */
    public static void vkCmdSetCullModeEXT(VkCommandBuffer commandBuffer, @NativeType("VkCullModeFlags") int cullMode) {
        long __functionAddress = commandBuffer.getCapabilities().vkCmdSetCullModeEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(commandBuffer.address(), cullMode, __functionAddress);
    }

    // --- [ vkCmdSetFrontFaceEXT ] ---

    /** {@code void vkCmdSetFrontFaceEXT(VkCommandBuffer commandBuffer, VkFrontFace frontFace)} */
    public static void vkCmdSetFrontFaceEXT(VkCommandBuffer commandBuffer, @NativeType("VkFrontFace") int frontFace) {
        long __functionAddress = commandBuffer.getCapabilities().vkCmdSetFrontFaceEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(commandBuffer.address(), frontFace, __functionAddress);
    }

    // --- [ vkCmdSetPrimitiveTopologyEXT ] ---

    /** {@code void vkCmdSetPrimitiveTopologyEXT(VkCommandBuffer commandBuffer, VkPrimitiveTopology primitiveTopology)} */
    public static void vkCmdSetPrimitiveTopologyEXT(VkCommandBuffer commandBuffer, @NativeType("VkPrimitiveTopology") int primitiveTopology) {
        long __functionAddress = commandBuffer.getCapabilities().vkCmdSetPrimitiveTopologyEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(commandBuffer.address(), primitiveTopology, __functionAddress);
    }

    // --- [ vkCmdSetViewportWithCountEXT ] ---

    /** {@code void vkCmdSetViewportWithCountEXT(VkCommandBuffer commandBuffer, uint32_t viewportCount, VkViewport const * pViewports)} */
    public static void nvkCmdSetViewportWithCountEXT(VkCommandBuffer commandBuffer, int viewportCount, long pViewports) {
        long __functionAddress = commandBuffer.getCapabilities().vkCmdSetViewportWithCountEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPPV(commandBuffer.address(), viewportCount, pViewports, __functionAddress);
    }

    /** {@code void vkCmdSetViewportWithCountEXT(VkCommandBuffer commandBuffer, uint32_t viewportCount, VkViewport const * pViewports)} */
    public static void vkCmdSetViewportWithCountEXT(VkCommandBuffer commandBuffer, @NativeType("VkViewport const *") VkViewport.Buffer pViewports) {
        nvkCmdSetViewportWithCountEXT(commandBuffer, pViewports.remaining(), pViewports.address());
    }

    // --- [ vkCmdSetScissorWithCountEXT ] ---

    /** {@code void vkCmdSetScissorWithCountEXT(VkCommandBuffer commandBuffer, uint32_t scissorCount, VkRect2D const * pScissors)} */
    public static void nvkCmdSetScissorWithCountEXT(VkCommandBuffer commandBuffer, int scissorCount, long pScissors) {
        long __functionAddress = commandBuffer.getCapabilities().vkCmdSetScissorWithCountEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPPV(commandBuffer.address(), scissorCount, pScissors, __functionAddress);
    }

    /** {@code void vkCmdSetScissorWithCountEXT(VkCommandBuffer commandBuffer, uint32_t scissorCount, VkRect2D const * pScissors)} */
    public static void vkCmdSetScissorWithCountEXT(VkCommandBuffer commandBuffer, @NativeType("VkRect2D const *") VkRect2D.Buffer pScissors) {
        nvkCmdSetScissorWithCountEXT(commandBuffer, pScissors.remaining(), pScissors.address());
    }

    // --- [ vkCmdBindVertexBuffers2EXT ] ---

    /** {@code void vkCmdBindVertexBuffers2EXT(VkCommandBuffer commandBuffer, uint32_t firstBinding, uint32_t bindingCount, VkBuffer const * pBuffers, VkDeviceSize const * pOffsets, VkDeviceSize const * pSizes, VkDeviceSize const * pStrides)} */
    public static void nvkCmdBindVertexBuffers2EXT(VkCommandBuffer commandBuffer, int firstBinding, int bindingCount, long pBuffers, long pOffsets, long pSizes, long pStrides) {
        long __functionAddress = commandBuffer.getCapabilities().vkCmdBindVertexBuffers2EXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPPPPPV(commandBuffer.address(), firstBinding, bindingCount, pBuffers, pOffsets, pSizes, pStrides, __functionAddress);
    }

    /** {@code void vkCmdBindVertexBuffers2EXT(VkCommandBuffer commandBuffer, uint32_t firstBinding, uint32_t bindingCount, VkBuffer const * pBuffers, VkDeviceSize const * pOffsets, VkDeviceSize const * pSizes, VkDeviceSize const * pStrides)} */
    public static void vkCmdBindVertexBuffers2EXT(VkCommandBuffer commandBuffer, @NativeType("uint32_t") int firstBinding, @NativeType("VkBuffer const *") LongBuffer pBuffers, @NativeType("VkDeviceSize const *") LongBuffer pOffsets, @NativeType("VkDeviceSize const *") @Nullable LongBuffer pSizes, @NativeType("VkDeviceSize const *") @Nullable LongBuffer pStrides) {
        if (CHECKS) {
            check(pOffsets, pBuffers.remaining());
            checkSafe(pSizes, pBuffers.remaining());
            checkSafe(pStrides, pBuffers.remaining());
        }
        nvkCmdBindVertexBuffers2EXT(commandBuffer, firstBinding, pBuffers.remaining(), memAddress(pBuffers), memAddress(pOffsets), memAddressSafe(pSizes), memAddressSafe(pStrides));
    }

    // --- [ vkCmdSetDepthTestEnableEXT ] ---

    /** {@code void vkCmdSetDepthTestEnableEXT(VkCommandBuffer commandBuffer, VkBool32 depthTestEnable)} */
    public static void vkCmdSetDepthTestEnableEXT(VkCommandBuffer commandBuffer, @NativeType("VkBool32") boolean depthTestEnable) {
        long __functionAddress = commandBuffer.getCapabilities().vkCmdSetDepthTestEnableEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(commandBuffer.address(), depthTestEnable ? 1 : 0, __functionAddress);
    }

    // --- [ vkCmdSetDepthWriteEnableEXT ] ---

    /** {@code void vkCmdSetDepthWriteEnableEXT(VkCommandBuffer commandBuffer, VkBool32 depthWriteEnable)} */
    public static void vkCmdSetDepthWriteEnableEXT(VkCommandBuffer commandBuffer, @NativeType("VkBool32") boolean depthWriteEnable) {
        long __functionAddress = commandBuffer.getCapabilities().vkCmdSetDepthWriteEnableEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(commandBuffer.address(), depthWriteEnable ? 1 : 0, __functionAddress);
    }

    // --- [ vkCmdSetDepthCompareOpEXT ] ---

    /** {@code void vkCmdSetDepthCompareOpEXT(VkCommandBuffer commandBuffer, VkCompareOp depthCompareOp)} */
    public static void vkCmdSetDepthCompareOpEXT(VkCommandBuffer commandBuffer, @NativeType("VkCompareOp") int depthCompareOp) {
        long __functionAddress = commandBuffer.getCapabilities().vkCmdSetDepthCompareOpEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(commandBuffer.address(), depthCompareOp, __functionAddress);
    }

    // --- [ vkCmdSetDepthBoundsTestEnableEXT ] ---

    /** {@code void vkCmdSetDepthBoundsTestEnableEXT(VkCommandBuffer commandBuffer, VkBool32 depthBoundsTestEnable)} */
    public static void vkCmdSetDepthBoundsTestEnableEXT(VkCommandBuffer commandBuffer, @NativeType("VkBool32") boolean depthBoundsTestEnable) {
        long __functionAddress = commandBuffer.getCapabilities().vkCmdSetDepthBoundsTestEnableEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(commandBuffer.address(), depthBoundsTestEnable ? 1 : 0, __functionAddress);
    }

    // --- [ vkCmdSetStencilTestEnableEXT ] ---

    /** {@code void vkCmdSetStencilTestEnableEXT(VkCommandBuffer commandBuffer, VkBool32 stencilTestEnable)} */
    public static void vkCmdSetStencilTestEnableEXT(VkCommandBuffer commandBuffer, @NativeType("VkBool32") boolean stencilTestEnable) {
        long __functionAddress = commandBuffer.getCapabilities().vkCmdSetStencilTestEnableEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(commandBuffer.address(), stencilTestEnable ? 1 : 0, __functionAddress);
    }

    // --- [ vkCmdSetStencilOpEXT ] ---

    /** {@code void vkCmdSetStencilOpEXT(VkCommandBuffer commandBuffer, VkStencilFaceFlags faceMask, VkStencilOp failOp, VkStencilOp passOp, VkStencilOp depthFailOp, VkCompareOp compareOp)} */
    public static void vkCmdSetStencilOpEXT(VkCommandBuffer commandBuffer, @NativeType("VkStencilFaceFlags") int faceMask, @NativeType("VkStencilOp") int failOp, @NativeType("VkStencilOp") int passOp, @NativeType("VkStencilOp") int depthFailOp, @NativeType("VkCompareOp") int compareOp) {
        long __functionAddress = commandBuffer.getCapabilities().vkCmdSetStencilOpEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(commandBuffer.address(), faceMask, failOp, passOp, depthFailOp, compareOp, __functionAddress);
    }

    // --- [ vkCmdSetVertexInputEXT ] ---

    /** {@code void vkCmdSetVertexInputEXT(VkCommandBuffer commandBuffer, uint32_t vertexBindingDescriptionCount, VkVertexInputBindingDescription2EXT const * pVertexBindingDescriptions, uint32_t vertexAttributeDescriptionCount, VkVertexInputAttributeDescription2EXT const * pVertexAttributeDescriptions)} */
    public static void nvkCmdSetVertexInputEXT(VkCommandBuffer commandBuffer, int vertexBindingDescriptionCount, long pVertexBindingDescriptions, int vertexAttributeDescriptionCount, long pVertexAttributeDescriptions) {
        long __functionAddress = commandBuffer.getCapabilities().vkCmdSetVertexInputEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPPPV(commandBuffer.address(), vertexBindingDescriptionCount, pVertexBindingDescriptions, vertexAttributeDescriptionCount, pVertexAttributeDescriptions, __functionAddress);
    }

    /** {@code void vkCmdSetVertexInputEXT(VkCommandBuffer commandBuffer, uint32_t vertexBindingDescriptionCount, VkVertexInputBindingDescription2EXT const * pVertexBindingDescriptions, uint32_t vertexAttributeDescriptionCount, VkVertexInputAttributeDescription2EXT const * pVertexAttributeDescriptions)} */
    public static void vkCmdSetVertexInputEXT(VkCommandBuffer commandBuffer, @NativeType("VkVertexInputBindingDescription2EXT const *") VkVertexInputBindingDescription2EXT.@Nullable Buffer pVertexBindingDescriptions, @NativeType("VkVertexInputAttributeDescription2EXT const *") VkVertexInputAttributeDescription2EXT.@Nullable Buffer pVertexAttributeDescriptions) {
        nvkCmdSetVertexInputEXT(commandBuffer, remainingSafe(pVertexBindingDescriptions), memAddressSafe(pVertexBindingDescriptions), remainingSafe(pVertexAttributeDescriptions), memAddressSafe(pVertexAttributeDescriptions));
    }

    // --- [ vkCmdSetPatchControlPointsEXT ] ---

    /** {@code void vkCmdSetPatchControlPointsEXT(VkCommandBuffer commandBuffer, uint32_t patchControlPoints)} */
    public static void vkCmdSetPatchControlPointsEXT(VkCommandBuffer commandBuffer, @NativeType("uint32_t") int patchControlPoints) {
        long __functionAddress = commandBuffer.getCapabilities().vkCmdSetPatchControlPointsEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(commandBuffer.address(), patchControlPoints, __functionAddress);
    }

    // --- [ vkCmdSetRasterizerDiscardEnableEXT ] ---

    /** {@code void vkCmdSetRasterizerDiscardEnableEXT(VkCommandBuffer commandBuffer, VkBool32 rasterizerDiscardEnable)} */
    public static void vkCmdSetRasterizerDiscardEnableEXT(VkCommandBuffer commandBuffer, @NativeType("VkBool32") boolean rasterizerDiscardEnable) {
        long __functionAddress = commandBuffer.getCapabilities().vkCmdSetRasterizerDiscardEnableEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(commandBuffer.address(), rasterizerDiscardEnable ? 1 : 0, __functionAddress);
    }

    // --- [ vkCmdSetDepthBiasEnableEXT ] ---

    /** {@code void vkCmdSetDepthBiasEnableEXT(VkCommandBuffer commandBuffer, VkBool32 depthBiasEnable)} */
    public static void vkCmdSetDepthBiasEnableEXT(VkCommandBuffer commandBuffer, @NativeType("VkBool32") boolean depthBiasEnable) {
        long __functionAddress = commandBuffer.getCapabilities().vkCmdSetDepthBiasEnableEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(commandBuffer.address(), depthBiasEnable ? 1 : 0, __functionAddress);
    }

    // --- [ vkCmdSetLogicOpEXT ] ---

    /** {@code void vkCmdSetLogicOpEXT(VkCommandBuffer commandBuffer, VkLogicOp logicOp)} */
    public static void vkCmdSetLogicOpEXT(VkCommandBuffer commandBuffer, @NativeType("VkLogicOp") int logicOp) {
        long __functionAddress = commandBuffer.getCapabilities().vkCmdSetLogicOpEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(commandBuffer.address(), logicOp, __functionAddress);
    }

    // --- [ vkCmdSetPrimitiveRestartEnableEXT ] ---

    /** {@code void vkCmdSetPrimitiveRestartEnableEXT(VkCommandBuffer commandBuffer, VkBool32 primitiveRestartEnable)} */
    public static void vkCmdSetPrimitiveRestartEnableEXT(VkCommandBuffer commandBuffer, @NativeType("VkBool32") boolean primitiveRestartEnable) {
        long __functionAddress = commandBuffer.getCapabilities().vkCmdSetPrimitiveRestartEnableEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(commandBuffer.address(), primitiveRestartEnable ? 1 : 0, __functionAddress);
    }

    // --- [ vkCmdSetTessellationDomainOriginEXT ] ---

    /** {@code void vkCmdSetTessellationDomainOriginEXT(VkCommandBuffer commandBuffer, VkTessellationDomainOrigin domainOrigin)} */
    public static void vkCmdSetTessellationDomainOriginEXT(VkCommandBuffer commandBuffer, @NativeType("VkTessellationDomainOrigin") int domainOrigin) {
        long __functionAddress = commandBuffer.getCapabilities().vkCmdSetTessellationDomainOriginEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(commandBuffer.address(), domainOrigin, __functionAddress);
    }

    // --- [ vkCmdSetDepthClampEnableEXT ] ---

    /** {@code void vkCmdSetDepthClampEnableEXT(VkCommandBuffer commandBuffer, VkBool32 depthClampEnable)} */
    public static void vkCmdSetDepthClampEnableEXT(VkCommandBuffer commandBuffer, @NativeType("VkBool32") boolean depthClampEnable) {
        long __functionAddress = commandBuffer.getCapabilities().vkCmdSetDepthClampEnableEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(commandBuffer.address(), depthClampEnable ? 1 : 0, __functionAddress);
    }

    // --- [ vkCmdSetPolygonModeEXT ] ---

    /** {@code void vkCmdSetPolygonModeEXT(VkCommandBuffer commandBuffer, VkPolygonMode polygonMode)} */
    public static void vkCmdSetPolygonModeEXT(VkCommandBuffer commandBuffer, @NativeType("VkPolygonMode") int polygonMode) {
        long __functionAddress = commandBuffer.getCapabilities().vkCmdSetPolygonModeEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(commandBuffer.address(), polygonMode, __functionAddress);
    }

    // --- [ vkCmdSetRasterizationSamplesEXT ] ---

    /** {@code void vkCmdSetRasterizationSamplesEXT(VkCommandBuffer commandBuffer, VkSampleCountFlagBits rasterizationSamples)} */
    public static void vkCmdSetRasterizationSamplesEXT(VkCommandBuffer commandBuffer, @NativeType("VkSampleCountFlagBits") int rasterizationSamples) {
        long __functionAddress = commandBuffer.getCapabilities().vkCmdSetRasterizationSamplesEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(commandBuffer.address(), rasterizationSamples, __functionAddress);
    }

    // --- [ vkCmdSetSampleMaskEXT ] ---

    /** {@code void vkCmdSetSampleMaskEXT(VkCommandBuffer commandBuffer, VkSampleCountFlagBits samples, VkSampleMask const * pSampleMask)} */
    public static void nvkCmdSetSampleMaskEXT(VkCommandBuffer commandBuffer, int samples, long pSampleMask) {
        long __functionAddress = commandBuffer.getCapabilities().vkCmdSetSampleMaskEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPPV(commandBuffer.address(), samples, pSampleMask, __functionAddress);
    }

    /** {@code void vkCmdSetSampleMaskEXT(VkCommandBuffer commandBuffer, VkSampleCountFlagBits samples, VkSampleMask const * pSampleMask)} */
    public static void vkCmdSetSampleMaskEXT(VkCommandBuffer commandBuffer, @NativeType("VkSampleCountFlagBits") int samples, @NativeType("VkSampleMask const *") IntBuffer pSampleMask) {
        nvkCmdSetSampleMaskEXT(commandBuffer, samples, memAddress(pSampleMask));
    }

    // --- [ vkCmdSetAlphaToCoverageEnableEXT ] ---

    /** {@code void vkCmdSetAlphaToCoverageEnableEXT(VkCommandBuffer commandBuffer, VkBool32 alphaToCoverageEnable)} */
    public static void vkCmdSetAlphaToCoverageEnableEXT(VkCommandBuffer commandBuffer, @NativeType("VkBool32") boolean alphaToCoverageEnable) {
        long __functionAddress = commandBuffer.getCapabilities().vkCmdSetAlphaToCoverageEnableEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(commandBuffer.address(), alphaToCoverageEnable ? 1 : 0, __functionAddress);
    }

    // --- [ vkCmdSetAlphaToOneEnableEXT ] ---

    /** {@code void vkCmdSetAlphaToOneEnableEXT(VkCommandBuffer commandBuffer, VkBool32 alphaToOneEnable)} */
    public static void vkCmdSetAlphaToOneEnableEXT(VkCommandBuffer commandBuffer, @NativeType("VkBool32") boolean alphaToOneEnable) {
        long __functionAddress = commandBuffer.getCapabilities().vkCmdSetAlphaToOneEnableEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(commandBuffer.address(), alphaToOneEnable ? 1 : 0, __functionAddress);
    }

    // --- [ vkCmdSetLogicOpEnableEXT ] ---

    /** {@code void vkCmdSetLogicOpEnableEXT(VkCommandBuffer commandBuffer, VkBool32 logicOpEnable)} */
    public static void vkCmdSetLogicOpEnableEXT(VkCommandBuffer commandBuffer, @NativeType("VkBool32") boolean logicOpEnable) {
        long __functionAddress = commandBuffer.getCapabilities().vkCmdSetLogicOpEnableEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(commandBuffer.address(), logicOpEnable ? 1 : 0, __functionAddress);
    }

    // --- [ vkCmdSetColorBlendEnableEXT ] ---

    /** {@code void vkCmdSetColorBlendEnableEXT(VkCommandBuffer commandBuffer, uint32_t firstAttachment, uint32_t attachmentCount, VkBool32 const * pColorBlendEnables)} */
    public static void nvkCmdSetColorBlendEnableEXT(VkCommandBuffer commandBuffer, int firstAttachment, int attachmentCount, long pColorBlendEnables) {
        long __functionAddress = commandBuffer.getCapabilities().vkCmdSetColorBlendEnableEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPPV(commandBuffer.address(), firstAttachment, attachmentCount, pColorBlendEnables, __functionAddress);
    }

    /** {@code void vkCmdSetColorBlendEnableEXT(VkCommandBuffer commandBuffer, uint32_t firstAttachment, uint32_t attachmentCount, VkBool32 const * pColorBlendEnables)} */
    public static void vkCmdSetColorBlendEnableEXT(VkCommandBuffer commandBuffer, @NativeType("uint32_t") int firstAttachment, @NativeType("VkBool32 const *") IntBuffer pColorBlendEnables) {
        nvkCmdSetColorBlendEnableEXT(commandBuffer, firstAttachment, pColorBlendEnables.remaining(), memAddress(pColorBlendEnables));
    }

    // --- [ vkCmdSetColorBlendEquationEXT ] ---

    /** {@code void vkCmdSetColorBlendEquationEXT(VkCommandBuffer commandBuffer, uint32_t firstAttachment, uint32_t attachmentCount, VkColorBlendEquationEXT const * pColorBlendEquations)} */
    public static void nvkCmdSetColorBlendEquationEXT(VkCommandBuffer commandBuffer, int firstAttachment, int attachmentCount, long pColorBlendEquations) {
        long __functionAddress = commandBuffer.getCapabilities().vkCmdSetColorBlendEquationEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPPV(commandBuffer.address(), firstAttachment, attachmentCount, pColorBlendEquations, __functionAddress);
    }

    /** {@code void vkCmdSetColorBlendEquationEXT(VkCommandBuffer commandBuffer, uint32_t firstAttachment, uint32_t attachmentCount, VkColorBlendEquationEXT const * pColorBlendEquations)} */
    public static void vkCmdSetColorBlendEquationEXT(VkCommandBuffer commandBuffer, @NativeType("uint32_t") int firstAttachment, @NativeType("VkColorBlendEquationEXT const *") VkColorBlendEquationEXT.Buffer pColorBlendEquations) {
        nvkCmdSetColorBlendEquationEXT(commandBuffer, firstAttachment, pColorBlendEquations.remaining(), pColorBlendEquations.address());
    }

    // --- [ vkCmdSetColorWriteMaskEXT ] ---

    /** {@code void vkCmdSetColorWriteMaskEXT(VkCommandBuffer commandBuffer, uint32_t firstAttachment, uint32_t attachmentCount, VkColorComponentFlags const * pColorWriteMasks)} */
    public static void nvkCmdSetColorWriteMaskEXT(VkCommandBuffer commandBuffer, int firstAttachment, int attachmentCount, long pColorWriteMasks) {
        long __functionAddress = commandBuffer.getCapabilities().vkCmdSetColorWriteMaskEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPPV(commandBuffer.address(), firstAttachment, attachmentCount, pColorWriteMasks, __functionAddress);
    }

    /** {@code void vkCmdSetColorWriteMaskEXT(VkCommandBuffer commandBuffer, uint32_t firstAttachment, uint32_t attachmentCount, VkColorComponentFlags const * pColorWriteMasks)} */
    public static void vkCmdSetColorWriteMaskEXT(VkCommandBuffer commandBuffer, @NativeType("uint32_t") int firstAttachment, @NativeType("VkColorComponentFlags const *") IntBuffer pColorWriteMasks) {
        nvkCmdSetColorWriteMaskEXT(commandBuffer, firstAttachment, pColorWriteMasks.remaining(), memAddress(pColorWriteMasks));
    }

    // --- [ vkCmdSetRasterizationStreamEXT ] ---

    /** {@code void vkCmdSetRasterizationStreamEXT(VkCommandBuffer commandBuffer, uint32_t rasterizationStream)} */
    public static void vkCmdSetRasterizationStreamEXT(VkCommandBuffer commandBuffer, @NativeType("uint32_t") int rasterizationStream) {
        long __functionAddress = commandBuffer.getCapabilities().vkCmdSetRasterizationStreamEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(commandBuffer.address(), rasterizationStream, __functionAddress);
    }

    // --- [ vkCmdSetConservativeRasterizationModeEXT ] ---

    /** {@code void vkCmdSetConservativeRasterizationModeEXT(VkCommandBuffer commandBuffer, VkConservativeRasterizationModeEXT conservativeRasterizationMode)} */
    public static void vkCmdSetConservativeRasterizationModeEXT(VkCommandBuffer commandBuffer, @NativeType("VkConservativeRasterizationModeEXT") int conservativeRasterizationMode) {
        long __functionAddress = commandBuffer.getCapabilities().vkCmdSetConservativeRasterizationModeEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(commandBuffer.address(), conservativeRasterizationMode, __functionAddress);
    }

    // --- [ vkCmdSetExtraPrimitiveOverestimationSizeEXT ] ---

    /** {@code void vkCmdSetExtraPrimitiveOverestimationSizeEXT(VkCommandBuffer commandBuffer, float extraPrimitiveOverestimationSize)} */
    public static void vkCmdSetExtraPrimitiveOverestimationSizeEXT(VkCommandBuffer commandBuffer, float extraPrimitiveOverestimationSize) {
        long __functionAddress = commandBuffer.getCapabilities().vkCmdSetExtraPrimitiveOverestimationSizeEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(commandBuffer.address(), extraPrimitiveOverestimationSize, __functionAddress);
    }

    // --- [ vkCmdSetDepthClipEnableEXT ] ---

    /** {@code void vkCmdSetDepthClipEnableEXT(VkCommandBuffer commandBuffer, VkBool32 depthClipEnable)} */
    public static void vkCmdSetDepthClipEnableEXT(VkCommandBuffer commandBuffer, @NativeType("VkBool32") boolean depthClipEnable) {
        long __functionAddress = commandBuffer.getCapabilities().vkCmdSetDepthClipEnableEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(commandBuffer.address(), depthClipEnable ? 1 : 0, __functionAddress);
    }

    // --- [ vkCmdSetSampleLocationsEnableEXT ] ---

    /** {@code void vkCmdSetSampleLocationsEnableEXT(VkCommandBuffer commandBuffer, VkBool32 sampleLocationsEnable)} */
    public static void vkCmdSetSampleLocationsEnableEXT(VkCommandBuffer commandBuffer, @NativeType("VkBool32") boolean sampleLocationsEnable) {
        long __functionAddress = commandBuffer.getCapabilities().vkCmdSetSampleLocationsEnableEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(commandBuffer.address(), sampleLocationsEnable ? 1 : 0, __functionAddress);
    }

    // --- [ vkCmdSetColorBlendAdvancedEXT ] ---

    /** {@code void vkCmdSetColorBlendAdvancedEXT(VkCommandBuffer commandBuffer, uint32_t firstAttachment, uint32_t attachmentCount, VkColorBlendAdvancedEXT const * pColorBlendAdvanced)} */
    public static void nvkCmdSetColorBlendAdvancedEXT(VkCommandBuffer commandBuffer, int firstAttachment, int attachmentCount, long pColorBlendAdvanced) {
        long __functionAddress = commandBuffer.getCapabilities().vkCmdSetColorBlendAdvancedEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPPV(commandBuffer.address(), firstAttachment, attachmentCount, pColorBlendAdvanced, __functionAddress);
    }

    /** {@code void vkCmdSetColorBlendAdvancedEXT(VkCommandBuffer commandBuffer, uint32_t firstAttachment, uint32_t attachmentCount, VkColorBlendAdvancedEXT const * pColorBlendAdvanced)} */
    public static void vkCmdSetColorBlendAdvancedEXT(VkCommandBuffer commandBuffer, @NativeType("uint32_t") int firstAttachment, @NativeType("VkColorBlendAdvancedEXT const *") VkColorBlendAdvancedEXT.Buffer pColorBlendAdvanced) {
        nvkCmdSetColorBlendAdvancedEXT(commandBuffer, firstAttachment, pColorBlendAdvanced.remaining(), pColorBlendAdvanced.address());
    }

    // --- [ vkCmdSetProvokingVertexModeEXT ] ---

    /** {@code void vkCmdSetProvokingVertexModeEXT(VkCommandBuffer commandBuffer, VkProvokingVertexModeEXT provokingVertexMode)} */
    public static void vkCmdSetProvokingVertexModeEXT(VkCommandBuffer commandBuffer, @NativeType("VkProvokingVertexModeEXT") int provokingVertexMode) {
        long __functionAddress = commandBuffer.getCapabilities().vkCmdSetProvokingVertexModeEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(commandBuffer.address(), provokingVertexMode, __functionAddress);
    }

    // --- [ vkCmdSetLineRasterizationModeEXT ] ---

    /** {@code void vkCmdSetLineRasterizationModeEXT(VkCommandBuffer commandBuffer, VkLineRasterizationModeEXT lineRasterizationMode)} */
    public static void vkCmdSetLineRasterizationModeEXT(VkCommandBuffer commandBuffer, @NativeType("VkLineRasterizationModeEXT") int lineRasterizationMode) {
        long __functionAddress = commandBuffer.getCapabilities().vkCmdSetLineRasterizationModeEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(commandBuffer.address(), lineRasterizationMode, __functionAddress);
    }

    // --- [ vkCmdSetLineStippleEnableEXT ] ---

    /** {@code void vkCmdSetLineStippleEnableEXT(VkCommandBuffer commandBuffer, VkBool32 stippledLineEnable)} */
    public static void vkCmdSetLineStippleEnableEXT(VkCommandBuffer commandBuffer, @NativeType("VkBool32") boolean stippledLineEnable) {
        long __functionAddress = commandBuffer.getCapabilities().vkCmdSetLineStippleEnableEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(commandBuffer.address(), stippledLineEnable ? 1 : 0, __functionAddress);
    }

    // --- [ vkCmdSetDepthClipNegativeOneToOneEXT ] ---

    /** {@code void vkCmdSetDepthClipNegativeOneToOneEXT(VkCommandBuffer commandBuffer, VkBool32 negativeOneToOne)} */
    public static void vkCmdSetDepthClipNegativeOneToOneEXT(VkCommandBuffer commandBuffer, @NativeType("VkBool32") boolean negativeOneToOne) {
        long __functionAddress = commandBuffer.getCapabilities().vkCmdSetDepthClipNegativeOneToOneEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(commandBuffer.address(), negativeOneToOne ? 1 : 0, __functionAddress);
    }

    // --- [ vkCmdSetViewportWScalingEnableNV ] ---

    /** {@code void vkCmdSetViewportWScalingEnableNV(VkCommandBuffer commandBuffer, VkBool32 viewportWScalingEnable)} */
    public static void vkCmdSetViewportWScalingEnableNV(VkCommandBuffer commandBuffer, @NativeType("VkBool32") boolean viewportWScalingEnable) {
        long __functionAddress = commandBuffer.getCapabilities().vkCmdSetViewportWScalingEnableNV;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(commandBuffer.address(), viewportWScalingEnable ? 1 : 0, __functionAddress);
    }

    // --- [ vkCmdSetViewportSwizzleNV ] ---

    /** {@code void vkCmdSetViewportSwizzleNV(VkCommandBuffer commandBuffer, uint32_t firstViewport, uint32_t viewportCount, VkViewportSwizzleNV const * pViewportSwizzles)} */
    public static void nvkCmdSetViewportSwizzleNV(VkCommandBuffer commandBuffer, int firstViewport, int viewportCount, long pViewportSwizzles) {
        long __functionAddress = commandBuffer.getCapabilities().vkCmdSetViewportSwizzleNV;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPPV(commandBuffer.address(), firstViewport, viewportCount, pViewportSwizzles, __functionAddress);
    }

    /** {@code void vkCmdSetViewportSwizzleNV(VkCommandBuffer commandBuffer, uint32_t firstViewport, uint32_t viewportCount, VkViewportSwizzleNV const * pViewportSwizzles)} */
    public static void vkCmdSetViewportSwizzleNV(VkCommandBuffer commandBuffer, @NativeType("uint32_t") int firstViewport, @NativeType("VkViewportSwizzleNV const *") VkViewportSwizzleNV.Buffer pViewportSwizzles) {
        nvkCmdSetViewportSwizzleNV(commandBuffer, firstViewport, pViewportSwizzles.remaining(), pViewportSwizzles.address());
    }

    // --- [ vkCmdSetCoverageToColorEnableNV ] ---

    /** {@code void vkCmdSetCoverageToColorEnableNV(VkCommandBuffer commandBuffer, VkBool32 coverageToColorEnable)} */
    public static void vkCmdSetCoverageToColorEnableNV(VkCommandBuffer commandBuffer, @NativeType("VkBool32") boolean coverageToColorEnable) {
        long __functionAddress = commandBuffer.getCapabilities().vkCmdSetCoverageToColorEnableNV;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(commandBuffer.address(), coverageToColorEnable ? 1 : 0, __functionAddress);
    }

    // --- [ vkCmdSetCoverageToColorLocationNV ] ---

    /** {@code void vkCmdSetCoverageToColorLocationNV(VkCommandBuffer commandBuffer, uint32_t coverageToColorLocation)} */
    public static void vkCmdSetCoverageToColorLocationNV(VkCommandBuffer commandBuffer, @NativeType("uint32_t") int coverageToColorLocation) {
        long __functionAddress = commandBuffer.getCapabilities().vkCmdSetCoverageToColorLocationNV;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(commandBuffer.address(), coverageToColorLocation, __functionAddress);
    }

    // --- [ vkCmdSetCoverageModulationModeNV ] ---

    /** {@code void vkCmdSetCoverageModulationModeNV(VkCommandBuffer commandBuffer, VkCoverageModulationModeNV coverageModulationMode)} */
    public static void vkCmdSetCoverageModulationModeNV(VkCommandBuffer commandBuffer, @NativeType("VkCoverageModulationModeNV") int coverageModulationMode) {
        long __functionAddress = commandBuffer.getCapabilities().vkCmdSetCoverageModulationModeNV;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(commandBuffer.address(), coverageModulationMode, __functionAddress);
    }

    // --- [ vkCmdSetCoverageModulationTableEnableNV ] ---

    /** {@code void vkCmdSetCoverageModulationTableEnableNV(VkCommandBuffer commandBuffer, VkBool32 coverageModulationTableEnable)} */
    public static void vkCmdSetCoverageModulationTableEnableNV(VkCommandBuffer commandBuffer, @NativeType("VkBool32") boolean coverageModulationTableEnable) {
        long __functionAddress = commandBuffer.getCapabilities().vkCmdSetCoverageModulationTableEnableNV;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(commandBuffer.address(), coverageModulationTableEnable ? 1 : 0, __functionAddress);
    }

    // --- [ vkCmdSetCoverageModulationTableNV ] ---

    /** {@code void vkCmdSetCoverageModulationTableNV(VkCommandBuffer commandBuffer, uint32_t coverageModulationTableCount, float const * pCoverageModulationTable)} */
    public static void nvkCmdSetCoverageModulationTableNV(VkCommandBuffer commandBuffer, int coverageModulationTableCount, long pCoverageModulationTable) {
        long __functionAddress = commandBuffer.getCapabilities().vkCmdSetCoverageModulationTableNV;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPPV(commandBuffer.address(), coverageModulationTableCount, pCoverageModulationTable, __functionAddress);
    }

    /** {@code void vkCmdSetCoverageModulationTableNV(VkCommandBuffer commandBuffer, uint32_t coverageModulationTableCount, float const * pCoverageModulationTable)} */
    public static void vkCmdSetCoverageModulationTableNV(VkCommandBuffer commandBuffer, @NativeType("float const *") FloatBuffer pCoverageModulationTable) {
        nvkCmdSetCoverageModulationTableNV(commandBuffer, pCoverageModulationTable.remaining(), memAddress(pCoverageModulationTable));
    }

    // --- [ vkCmdSetShadingRateImageEnableNV ] ---

    /** {@code void vkCmdSetShadingRateImageEnableNV(VkCommandBuffer commandBuffer, VkBool32 shadingRateImageEnable)} */
    public static void vkCmdSetShadingRateImageEnableNV(VkCommandBuffer commandBuffer, @NativeType("VkBool32") boolean shadingRateImageEnable) {
        long __functionAddress = commandBuffer.getCapabilities().vkCmdSetShadingRateImageEnableNV;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(commandBuffer.address(), shadingRateImageEnable ? 1 : 0, __functionAddress);
    }

    // --- [ vkCmdSetRepresentativeFragmentTestEnableNV ] ---

    /** {@code void vkCmdSetRepresentativeFragmentTestEnableNV(VkCommandBuffer commandBuffer, VkBool32 representativeFragmentTestEnable)} */
    public static void vkCmdSetRepresentativeFragmentTestEnableNV(VkCommandBuffer commandBuffer, @NativeType("VkBool32") boolean representativeFragmentTestEnable) {
        long __functionAddress = commandBuffer.getCapabilities().vkCmdSetRepresentativeFragmentTestEnableNV;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(commandBuffer.address(), representativeFragmentTestEnable ? 1 : 0, __functionAddress);
    }

    // --- [ vkCmdSetCoverageReductionModeNV ] ---

    /** {@code void vkCmdSetCoverageReductionModeNV(VkCommandBuffer commandBuffer, VkCoverageReductionModeNV coverageReductionMode)} */
    public static void vkCmdSetCoverageReductionModeNV(VkCommandBuffer commandBuffer, @NativeType("VkCoverageReductionModeNV") int coverageReductionMode) {
        long __functionAddress = commandBuffer.getCapabilities().vkCmdSetCoverageReductionModeNV;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(commandBuffer.address(), coverageReductionMode, __functionAddress);
    }

    // --- [ vkCmdSetDepthClampRangeEXT ] ---

    /** {@code void vkCmdSetDepthClampRangeEXT(VkCommandBuffer commandBuffer, VkDepthClampModeEXT depthClampMode, VkDepthClampRangeEXT const * pDepthClampRange)} */
    public static void nvkCmdSetDepthClampRangeEXT(VkCommandBuffer commandBuffer, int depthClampMode, long pDepthClampRange) {
        long __functionAddress = commandBuffer.getCapabilities().vkCmdSetDepthClampRangeEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPPV(commandBuffer.address(), depthClampMode, pDepthClampRange, __functionAddress);
    }

    /** {@code void vkCmdSetDepthClampRangeEXT(VkCommandBuffer commandBuffer, VkDepthClampModeEXT depthClampMode, VkDepthClampRangeEXT const * pDepthClampRange)} */
    public static void vkCmdSetDepthClampRangeEXT(VkCommandBuffer commandBuffer, @NativeType("VkDepthClampModeEXT") int depthClampMode, @NativeType("VkDepthClampRangeEXT const *") @Nullable VkDepthClampRangeEXT pDepthClampRange) {
        nvkCmdSetDepthClampRangeEXT(commandBuffer, depthClampMode, memAddressSafe(pDepthClampRange));
    }

    /** {@code VkResult vkCreateShadersEXT(VkDevice device, uint32_t createInfoCount, VkShaderCreateInfoEXT const * pCreateInfos, VkAllocationCallbacks const * pAllocator, VkShaderEXT * pShaders)} */
    @NativeType("VkResult")
    public static int vkCreateShadersEXT(VkDevice device, @NativeType("VkShaderCreateInfoEXT const *") VkShaderCreateInfoEXT.Buffer pCreateInfos, @NativeType("VkAllocationCallbacks const *") @Nullable VkAllocationCallbacks pAllocator, @NativeType("VkShaderEXT *") long[] pShaders) {
        long __functionAddress = device.getCapabilities().vkCreateShadersEXT;
        if (CHECKS) {
            check(__functionAddress);
            check(pShaders, pCreateInfos.remaining());
            Struct.validate(pCreateInfos.address(), pCreateInfos.remaining(), VkShaderCreateInfoEXT.SIZEOF, VkShaderCreateInfoEXT::validate);
        }
        return callPPPPI(device.address(), pCreateInfos.remaining(), pCreateInfos.address(), memAddressSafe(pAllocator), pShaders, __functionAddress);
    }

    /** {@code void vkCmdBindShadersEXT(VkCommandBuffer commandBuffer, uint32_t stageCount, VkShaderStageFlagBits const * pStages, VkShaderEXT const * pShaders)} */
    public static void vkCmdBindShadersEXT(VkCommandBuffer commandBuffer, @NativeType("VkShaderStageFlagBits const *") int[] pStages, @NativeType("VkShaderEXT const *") long[] pShaders) {
        long __functionAddress = commandBuffer.getCapabilities().vkCmdBindShadersEXT;
        if (CHECKS) {
            check(__functionAddress);
            check(pShaders, pStages.length);
        }
        callPPPV(commandBuffer.address(), pStages.length, pStages, pShaders, __functionAddress);
    }

    /** {@code void vkCmdBindVertexBuffers2EXT(VkCommandBuffer commandBuffer, uint32_t firstBinding, uint32_t bindingCount, VkBuffer const * pBuffers, VkDeviceSize const * pOffsets, VkDeviceSize const * pSizes, VkDeviceSize const * pStrides)} */
    public static void vkCmdBindVertexBuffers2EXT(VkCommandBuffer commandBuffer, @NativeType("uint32_t") int firstBinding, @NativeType("VkBuffer const *") long[] pBuffers, @NativeType("VkDeviceSize const *") long[] pOffsets, @NativeType("VkDeviceSize const *") long @Nullable [] pSizes, @NativeType("VkDeviceSize const *") long @Nullable [] pStrides) {
        long __functionAddress = commandBuffer.getCapabilities().vkCmdBindVertexBuffers2EXT;
        if (CHECKS) {
            check(__functionAddress);
            check(pOffsets, pBuffers.length);
            checkSafe(pSizes, pBuffers.length);
            checkSafe(pStrides, pBuffers.length);
        }
        callPPPPPV(commandBuffer.address(), firstBinding, pBuffers.length, pBuffers, pOffsets, pSizes, pStrides, __functionAddress);
    }

    /** {@code void vkCmdSetSampleMaskEXT(VkCommandBuffer commandBuffer, VkSampleCountFlagBits samples, VkSampleMask const * pSampleMask)} */
    public static void vkCmdSetSampleMaskEXT(VkCommandBuffer commandBuffer, @NativeType("VkSampleCountFlagBits") int samples, @NativeType("VkSampleMask const *") int[] pSampleMask) {
        long __functionAddress = commandBuffer.getCapabilities().vkCmdSetSampleMaskEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPPV(commandBuffer.address(), samples, pSampleMask, __functionAddress);
    }

    /** {@code void vkCmdSetColorBlendEnableEXT(VkCommandBuffer commandBuffer, uint32_t firstAttachment, uint32_t attachmentCount, VkBool32 const * pColorBlendEnables)} */
    public static void vkCmdSetColorBlendEnableEXT(VkCommandBuffer commandBuffer, @NativeType("uint32_t") int firstAttachment, @NativeType("VkBool32 const *") int[] pColorBlendEnables) {
        long __functionAddress = commandBuffer.getCapabilities().vkCmdSetColorBlendEnableEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPPV(commandBuffer.address(), firstAttachment, pColorBlendEnables.length, pColorBlendEnables, __functionAddress);
    }

    /** {@code void vkCmdSetColorWriteMaskEXT(VkCommandBuffer commandBuffer, uint32_t firstAttachment, uint32_t attachmentCount, VkColorComponentFlags const * pColorWriteMasks)} */
    public static void vkCmdSetColorWriteMaskEXT(VkCommandBuffer commandBuffer, @NativeType("uint32_t") int firstAttachment, @NativeType("VkColorComponentFlags const *") int[] pColorWriteMasks) {
        long __functionAddress = commandBuffer.getCapabilities().vkCmdSetColorWriteMaskEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPPV(commandBuffer.address(), firstAttachment, pColorWriteMasks.length, pColorWriteMasks, __functionAddress);
    }

    /** {@code void vkCmdSetCoverageModulationTableNV(VkCommandBuffer commandBuffer, uint32_t coverageModulationTableCount, float const * pCoverageModulationTable)} */
    public static void vkCmdSetCoverageModulationTableNV(VkCommandBuffer commandBuffer, @NativeType("float const *") float[] pCoverageModulationTable) {
        long __functionAddress = commandBuffer.getCapabilities().vkCmdSetCoverageModulationTableNV;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPPV(commandBuffer.address(), pCoverageModulationTable.length, pCoverageModulationTable, __functionAddress);
    }

}