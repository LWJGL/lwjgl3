/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.vulkan;

import java.nio.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.JNI.*;
import static org.lwjgl.system.MemoryUtil.*;

public class EXTExtendedDynamicState3 {

    public static final int VK_EXT_EXTENDED_DYNAMIC_STATE_3_SPEC_VERSION = 2;

    public static final String VK_EXT_EXTENDED_DYNAMIC_STATE_3_EXTENSION_NAME = "VK_EXT_extended_dynamic_state3";

    public static final int
        VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_EXTENDED_DYNAMIC_STATE_3_FEATURES_EXT   = 1000455000,
        VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_EXTENDED_DYNAMIC_STATE_3_PROPERTIES_EXT = 1000455001;

    public static final int
        VK_DYNAMIC_STATE_TESSELLATION_DOMAIN_ORIGIN_EXT          = 1000455002,
        VK_DYNAMIC_STATE_DEPTH_CLAMP_ENABLE_EXT                  = 1000455003,
        VK_DYNAMIC_STATE_POLYGON_MODE_EXT                        = 1000455004,
        VK_DYNAMIC_STATE_RASTERIZATION_SAMPLES_EXT               = 1000455005,
        VK_DYNAMIC_STATE_SAMPLE_MASK_EXT                         = 1000455006,
        VK_DYNAMIC_STATE_ALPHA_TO_COVERAGE_ENABLE_EXT            = 1000455007,
        VK_DYNAMIC_STATE_ALPHA_TO_ONE_ENABLE_EXT                 = 1000455008,
        VK_DYNAMIC_STATE_LOGIC_OP_ENABLE_EXT                     = 1000455009,
        VK_DYNAMIC_STATE_COLOR_BLEND_ENABLE_EXT                  = 1000455010,
        VK_DYNAMIC_STATE_COLOR_BLEND_EQUATION_EXT                = 1000455011,
        VK_DYNAMIC_STATE_COLOR_WRITE_MASK_EXT                    = 1000455012,
        VK_DYNAMIC_STATE_RASTERIZATION_STREAM_EXT                = 1000455013,
        VK_DYNAMIC_STATE_CONSERVATIVE_RASTERIZATION_MODE_EXT     = 1000455014,
        VK_DYNAMIC_STATE_EXTRA_PRIMITIVE_OVERESTIMATION_SIZE_EXT = 1000455015,
        VK_DYNAMIC_STATE_DEPTH_CLIP_ENABLE_EXT                   = 1000455016,
        VK_DYNAMIC_STATE_SAMPLE_LOCATIONS_ENABLE_EXT             = 1000455017,
        VK_DYNAMIC_STATE_COLOR_BLEND_ADVANCED_EXT                = 1000455018,
        VK_DYNAMIC_STATE_PROVOKING_VERTEX_MODE_EXT               = 1000455019,
        VK_DYNAMIC_STATE_LINE_RASTERIZATION_MODE_EXT             = 1000455020,
        VK_DYNAMIC_STATE_LINE_STIPPLE_ENABLE_EXT                 = 1000455021,
        VK_DYNAMIC_STATE_DEPTH_CLIP_NEGATIVE_ONE_TO_ONE_EXT      = 1000455022,
        VK_DYNAMIC_STATE_VIEWPORT_W_SCALING_ENABLE_NV            = 1000455023,
        VK_DYNAMIC_STATE_VIEWPORT_SWIZZLE_NV                     = 1000455024,
        VK_DYNAMIC_STATE_COVERAGE_TO_COLOR_ENABLE_NV             = 1000455025,
        VK_DYNAMIC_STATE_COVERAGE_TO_COLOR_LOCATION_NV           = 1000455026,
        VK_DYNAMIC_STATE_COVERAGE_MODULATION_MODE_NV             = 1000455027,
        VK_DYNAMIC_STATE_COVERAGE_MODULATION_TABLE_ENABLE_NV     = 1000455028,
        VK_DYNAMIC_STATE_COVERAGE_MODULATION_TABLE_NV            = 1000455029,
        VK_DYNAMIC_STATE_SHADING_RATE_IMAGE_ENABLE_NV            = 1000455030,
        VK_DYNAMIC_STATE_REPRESENTATIVE_FRAGMENT_TEST_ENABLE_NV  = 1000455031,
        VK_DYNAMIC_STATE_COVERAGE_REDUCTION_MODE_NV              = 1000455032;

    protected EXTExtendedDynamicState3() {
        throw new UnsupportedOperationException();
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

    // --- [ vkCmdSetTessellationDomainOriginEXT ] ---

    /** {@code void vkCmdSetTessellationDomainOriginEXT(VkCommandBuffer commandBuffer, VkTessellationDomainOrigin domainOrigin)} */
    public static void vkCmdSetTessellationDomainOriginEXT(VkCommandBuffer commandBuffer, @NativeType("VkTessellationDomainOrigin") int domainOrigin) {
        long __functionAddress = commandBuffer.getCapabilities().vkCmdSetTessellationDomainOriginEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(commandBuffer.address(), domainOrigin, __functionAddress);
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