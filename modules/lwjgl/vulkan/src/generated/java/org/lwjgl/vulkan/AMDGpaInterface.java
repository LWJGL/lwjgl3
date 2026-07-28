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

public class AMDGpaInterface {

    public static final int VK_AMD_GPA_INTERFACE_SPEC_VERSION = 1;

    public static final String VK_AMD_GPA_INTERFACE_EXTENSION_NAME = "VK_AMD_gpa_interface";

    public static final int VK_OBJECT_TYPE_GPA_SESSION_AMD = 1000133000;

    public static final int
        VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_GPA_FEATURES_AMD     = 1000133000,
        VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_GPA_PROPERTIES_AMD   = 1000133001,
        VK_STRUCTURE_TYPE_GPA_SAMPLE_BEGIN_INFO_AMD            = 1000133002,
        VK_STRUCTURE_TYPE_GPA_SESSION_CREATE_INFO_AMD          = 1000133003,
        VK_STRUCTURE_TYPE_GPA_DEVICE_CLOCK_MODE_INFO_AMD       = 1000133004,
        VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_GPA_PROPERTIES_2_AMD = 1000133005,
        VK_STRUCTURE_TYPE_GPA_DEVICE_GET_CLOCK_INFO_AMD        = 1000133006;

    public static final int
        VK_GPA_SQ_SHADER_STAGE_PS_BIT_AMD = 0x1,
        VK_GPA_SQ_SHADER_STAGE_VS_BIT_AMD = 0x2,
        VK_GPA_SQ_SHADER_STAGE_GS_BIT_AMD = 0x4,
        VK_GPA_SQ_SHADER_STAGE_ES_BIT_AMD = 0x8,
        VK_GPA_SQ_SHADER_STAGE_HS_BIT_AMD = 0x10,
        VK_GPA_SQ_SHADER_STAGE_LS_BIT_AMD = 0x20,
        VK_GPA_SQ_SHADER_STAGE_CS_BIT_AMD = 0x40;

    public static final int
        VK_GPA_PERF_BLOCK_CPF_AMD      = 0,
        VK_GPA_PERF_BLOCK_IA_AMD       = 1,
        VK_GPA_PERF_BLOCK_VGT_AMD      = 2,
        VK_GPA_PERF_BLOCK_PA_AMD       = 3,
        VK_GPA_PERF_BLOCK_SC_AMD       = 4,
        VK_GPA_PERF_BLOCK_SPI_AMD      = 5,
        VK_GPA_PERF_BLOCK_SQ_AMD       = 6,
        VK_GPA_PERF_BLOCK_SX_AMD       = 7,
        VK_GPA_PERF_BLOCK_TA_AMD       = 8,
        VK_GPA_PERF_BLOCK_TD_AMD       = 9,
        VK_GPA_PERF_BLOCK_TCP_AMD      = 10,
        VK_GPA_PERF_BLOCK_TCC_AMD      = 11,
        VK_GPA_PERF_BLOCK_TCA_AMD      = 12,
        VK_GPA_PERF_BLOCK_DB_AMD       = 13,
        VK_GPA_PERF_BLOCK_CB_AMD       = 14,
        VK_GPA_PERF_BLOCK_GDS_AMD      = 15,
        VK_GPA_PERF_BLOCK_SRBM_AMD     = 16,
        VK_GPA_PERF_BLOCK_GRBM_AMD     = 17,
        VK_GPA_PERF_BLOCK_GRBM_SE_AMD  = 18,
        VK_GPA_PERF_BLOCK_RLC_AMD      = 19,
        VK_GPA_PERF_BLOCK_DMA_AMD      = 20,
        VK_GPA_PERF_BLOCK_MC_AMD       = 21,
        VK_GPA_PERF_BLOCK_CPG_AMD      = 22,
        VK_GPA_PERF_BLOCK_CPC_AMD      = 23,
        VK_GPA_PERF_BLOCK_WD_AMD       = 24,
        VK_GPA_PERF_BLOCK_TCS_AMD      = 25,
        VK_GPA_PERF_BLOCK_ATC_AMD      = 26,
        VK_GPA_PERF_BLOCK_ATC_L2_AMD   = 27,
        VK_GPA_PERF_BLOCK_MC_VM_L2_AMD = 28,
        VK_GPA_PERF_BLOCK_EA_AMD       = 29,
        VK_GPA_PERF_BLOCK_RPB_AMD      = 30,
        VK_GPA_PERF_BLOCK_RMI_AMD      = 31,
        VK_GPA_PERF_BLOCK_UMCCH_AMD    = 32,
        VK_GPA_PERF_BLOCK_GE_AMD       = 33,
        VK_GPA_PERF_BLOCK_GE1_AMD      = 33,
        VK_GPA_PERF_BLOCK_GL1A_AMD     = 34,
        VK_GPA_PERF_BLOCK_GL1C_AMD     = 35,
        VK_GPA_PERF_BLOCK_GL1CG_AMD    = 36,
        VK_GPA_PERF_BLOCK_GL2A_AMD     = 37,
        VK_GPA_PERF_BLOCK_GL2C_AMD     = 38,
        VK_GPA_PERF_BLOCK_CHA_AMD      = 39,
        VK_GPA_PERF_BLOCK_CHC_AMD      = 40,
        VK_GPA_PERF_BLOCK_CHCG_AMD     = 41,
        VK_GPA_PERF_BLOCK_GUS_AMD      = 42,
        VK_GPA_PERF_BLOCK_GCR_AMD      = 43,
        VK_GPA_PERF_BLOCK_PH_AMD       = 44,
        VK_GPA_PERF_BLOCK_UTCL1_AMD    = 45,
        VK_GPA_PERF_BLOCK_GE_DIST_AMD  = 46,
        VK_GPA_PERF_BLOCK_GE_SE_AMD    = 47,
        VK_GPA_PERF_BLOCK_DF_MALL_AMD  = 48,
        VK_GPA_PERF_BLOCK_SQ_WGP_AMD   = 49,
        VK_GPA_PERF_BLOCK_PC_AMD       = 50,
        VK_GPA_PERF_BLOCK_GL1XA_AMD    = 51,
        VK_GPA_PERF_BLOCK_GL1XC_AMD    = 52,
        VK_GPA_PERF_BLOCK_WGS_AMD      = 53,
        VK_GPA_PERF_BLOCK_EACPWD_AMD   = 54,
        VK_GPA_PERF_BLOCK_EASE_AMD     = 55,
        VK_GPA_PERF_BLOCK_RLCUSER_AMD  = 56,
        VK_GPA_PERF_BLOCK_RLCLOCAL_AMD = 56;

    public static final int
        VK_GPA_SAMPLE_TYPE_CUMULATIVE_AMD = 0,
        VK_GPA_SAMPLE_TYPE_TRACE_AMD      = 1,
        VK_GPA_SAMPLE_TYPE_TIMING_AMD     = 2;

    public static final int
        VK_GPA_DEVICE_CLOCK_MODE_DEFAULT_AMD    = 0,
        VK_GPA_DEVICE_CLOCK_MODE_QUERY_AMD      = 1,
        VK_GPA_DEVICE_CLOCK_MODE_PROFILING_AMD  = 2,
        VK_GPA_DEVICE_CLOCK_MODE_MIN_MEMORY_AMD = 3,
        VK_GPA_DEVICE_CLOCK_MODE_MIN_ENGINE_AMD = 4,
        VK_GPA_DEVICE_CLOCK_MODE_PEAK_AMD       = 5;

    protected AMDGpaInterface() {
        throw new UnsupportedOperationException();
    }

    // --- [ vkCreateGpaSessionAMD ] ---

    /** {@code VkResult vkCreateGpaSessionAMD(VkDevice device, VkGpaSessionCreateInfoAMD const * pCreateInfo, VkAllocationCallbacks const * pAllocator, VkGpaSessionAMD * pGpaSession)} */
    public static int nvkCreateGpaSessionAMD(VkDevice device, long pCreateInfo, long pAllocator, long pGpaSession) {
        long __functionAddress = device.getCapabilities().vkCreateGpaSessionAMD;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPPPPI(device.address(), pCreateInfo, pAllocator, pGpaSession, __functionAddress);
    }

    /** {@code VkResult vkCreateGpaSessionAMD(VkDevice device, VkGpaSessionCreateInfoAMD const * pCreateInfo, VkAllocationCallbacks const * pAllocator, VkGpaSessionAMD * pGpaSession)} */
    @NativeType("VkResult")
    public static int vkCreateGpaSessionAMD(VkDevice device, @NativeType("VkGpaSessionCreateInfoAMD const *") VkGpaSessionCreateInfoAMD pCreateInfo, @NativeType("VkAllocationCallbacks const *") @Nullable VkAllocationCallbacks pAllocator, @NativeType("VkGpaSessionAMD *") LongBuffer pGpaSession) {
        if (CHECKS) {
            check(pGpaSession, 1);
        }
        return nvkCreateGpaSessionAMD(device, pCreateInfo.address(), memAddressSafe(pAllocator), memAddress(pGpaSession));
    }

    // --- [ vkDestroyGpaSessionAMD ] ---

    /** {@code void vkDestroyGpaSessionAMD(VkDevice device, VkGpaSessionAMD gpaSession, VkAllocationCallbacks const * pAllocator)} */
    public static void nvkDestroyGpaSessionAMD(VkDevice device, long gpaSession, long pAllocator) {
        long __functionAddress = device.getCapabilities().vkDestroyGpaSessionAMD;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPJPV(device.address(), gpaSession, pAllocator, __functionAddress);
    }

    /** {@code void vkDestroyGpaSessionAMD(VkDevice device, VkGpaSessionAMD gpaSession, VkAllocationCallbacks const * pAllocator)} */
    public static void vkDestroyGpaSessionAMD(VkDevice device, @NativeType("VkGpaSessionAMD") long gpaSession, @NativeType("VkAllocationCallbacks const *") @Nullable VkAllocationCallbacks pAllocator) {
        nvkDestroyGpaSessionAMD(device, gpaSession, memAddressSafe(pAllocator));
    }

    // --- [ vkSetGpaDeviceClockModeAMD ] ---

    /** {@code VkResult vkSetGpaDeviceClockModeAMD(VkDevice device, VkGpaDeviceClockModeInfoAMD * pInfo)} */
    public static int nvkSetGpaDeviceClockModeAMD(VkDevice device, long pInfo) {
        long __functionAddress = device.getCapabilities().vkSetGpaDeviceClockModeAMD;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPPI(device.address(), pInfo, __functionAddress);
    }

    /** {@code VkResult vkSetGpaDeviceClockModeAMD(VkDevice device, VkGpaDeviceClockModeInfoAMD * pInfo)} */
    @NativeType("VkResult")
    public static int vkSetGpaDeviceClockModeAMD(VkDevice device, @NativeType("VkGpaDeviceClockModeInfoAMD *") VkGpaDeviceClockModeInfoAMD pInfo) {
        return nvkSetGpaDeviceClockModeAMD(device, pInfo.address());
    }

    // --- [ vkGetGpaDeviceClockInfoAMD ] ---

    /** {@code VkResult vkGetGpaDeviceClockInfoAMD(VkDevice device, VkGpaDeviceGetClockInfoAMD * pInfo)} */
    public static int nvkGetGpaDeviceClockInfoAMD(VkDevice device, long pInfo) {
        long __functionAddress = device.getCapabilities().vkGetGpaDeviceClockInfoAMD;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPPI(device.address(), pInfo, __functionAddress);
    }

    /** {@code VkResult vkGetGpaDeviceClockInfoAMD(VkDevice device, VkGpaDeviceGetClockInfoAMD * pInfo)} */
    @NativeType("VkResult")
    public static int vkGetGpaDeviceClockInfoAMD(VkDevice device, @NativeType("VkGpaDeviceGetClockInfoAMD *") VkGpaDeviceGetClockInfoAMD pInfo) {
        return nvkGetGpaDeviceClockInfoAMD(device, pInfo.address());
    }

    // --- [ vkCmdBeginGpaSessionAMD ] ---

    /** {@code VkResult vkCmdBeginGpaSessionAMD(VkCommandBuffer commandBuffer, VkGpaSessionAMD gpaSession)} */
    @NativeType("VkResult")
    public static int vkCmdBeginGpaSessionAMD(VkCommandBuffer commandBuffer, @NativeType("VkGpaSessionAMD") long gpaSession) {
        long __functionAddress = commandBuffer.getCapabilities().vkCmdBeginGpaSessionAMD;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPJI(commandBuffer.address(), gpaSession, __functionAddress);
    }

    // --- [ vkCmdEndGpaSessionAMD ] ---

    /** {@code VkResult vkCmdEndGpaSessionAMD(VkCommandBuffer commandBuffer, VkGpaSessionAMD gpaSession)} */
    @NativeType("VkResult")
    public static int vkCmdEndGpaSessionAMD(VkCommandBuffer commandBuffer, @NativeType("VkGpaSessionAMD") long gpaSession) {
        long __functionAddress = commandBuffer.getCapabilities().vkCmdEndGpaSessionAMD;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPJI(commandBuffer.address(), gpaSession, __functionAddress);
    }

    // --- [ vkCmdBeginGpaSampleAMD ] ---

    /** {@code VkResult vkCmdBeginGpaSampleAMD(VkCommandBuffer commandBuffer, VkGpaSessionAMD gpaSession, VkGpaSampleBeginInfoAMD const * pGpaSampleBeginInfo, uint32_t * pSampleID)} */
    public static int nvkCmdBeginGpaSampleAMD(VkCommandBuffer commandBuffer, long gpaSession, long pGpaSampleBeginInfo, long pSampleID) {
        long __functionAddress = commandBuffer.getCapabilities().vkCmdBeginGpaSampleAMD;
        if (CHECKS) {
            check(__functionAddress);
            VkGpaSampleBeginInfoAMD.validate(pGpaSampleBeginInfo);
        }
        return callPJPPI(commandBuffer.address(), gpaSession, pGpaSampleBeginInfo, pSampleID, __functionAddress);
    }

    /** {@code VkResult vkCmdBeginGpaSampleAMD(VkCommandBuffer commandBuffer, VkGpaSessionAMD gpaSession, VkGpaSampleBeginInfoAMD const * pGpaSampleBeginInfo, uint32_t * pSampleID)} */
    @NativeType("VkResult")
    public static int vkCmdBeginGpaSampleAMD(VkCommandBuffer commandBuffer, @NativeType("VkGpaSessionAMD") long gpaSession, @NativeType("VkGpaSampleBeginInfoAMD const *") VkGpaSampleBeginInfoAMD pGpaSampleBeginInfo, @NativeType("uint32_t *") IntBuffer pSampleID) {
        return nvkCmdBeginGpaSampleAMD(commandBuffer, gpaSession, pGpaSampleBeginInfo.address(), memAddress(pSampleID));
    }

    // --- [ vkCmdEndGpaSampleAMD ] ---

    /** {@code void vkCmdEndGpaSampleAMD(VkCommandBuffer commandBuffer, VkGpaSessionAMD gpaSession, uint32_t sampleID)} */
    public static void vkCmdEndGpaSampleAMD(VkCommandBuffer commandBuffer, @NativeType("VkGpaSessionAMD") long gpaSession, @NativeType("uint32_t") int sampleID) {
        long __functionAddress = commandBuffer.getCapabilities().vkCmdEndGpaSampleAMD;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPJV(commandBuffer.address(), gpaSession, sampleID, __functionAddress);
    }

    // --- [ vkGetGpaSessionStatusAMD ] ---

    /** {@code VkResult vkGetGpaSessionStatusAMD(VkDevice device, VkGpaSessionAMD gpaSession)} */
    @NativeType("VkResult")
    public static int vkGetGpaSessionStatusAMD(VkDevice device, @NativeType("VkGpaSessionAMD") long gpaSession) {
        long __functionAddress = device.getCapabilities().vkGetGpaSessionStatusAMD;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPJI(device.address(), gpaSession, __functionAddress);
    }

    // --- [ vkGetGpaSessionResultsAMD ] ---

    /** {@code VkResult vkGetGpaSessionResultsAMD(VkDevice device, VkGpaSessionAMD gpaSession, uint32_t sampleID, size_t * pSizeInBytes, void * pData)} */
    public static int nvkGetGpaSessionResultsAMD(VkDevice device, long gpaSession, int sampleID, long pSizeInBytes, long pData) {
        long __functionAddress = device.getCapabilities().vkGetGpaSessionResultsAMD;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPJPPI(device.address(), gpaSession, sampleID, pSizeInBytes, pData, __functionAddress);
    }

    /** {@code VkResult vkGetGpaSessionResultsAMD(VkDevice device, VkGpaSessionAMD gpaSession, uint32_t sampleID, size_t * pSizeInBytes, void * pData)} */
    @NativeType("VkResult")
    public static int vkGetGpaSessionResultsAMD(VkDevice device, @NativeType("VkGpaSessionAMD") long gpaSession, @NativeType("uint32_t") int sampleID, @NativeType("size_t *") PointerBuffer pSizeInBytes, @NativeType("void *") @Nullable ByteBuffer pData) {
        if (CHECKS) {
            check(pSizeInBytes, 1);
            checkSafe(pData, pSizeInBytes.get(pSizeInBytes.position()));
        }
        return nvkGetGpaSessionResultsAMD(device, gpaSession, sampleID, memAddress(pSizeInBytes), memAddressSafe(pData));
    }

    // --- [ vkResetGpaSessionAMD ] ---

    /** {@code VkResult vkResetGpaSessionAMD(VkDevice device, VkGpaSessionAMD gpaSession)} */
    @NativeType("VkResult")
    public static int vkResetGpaSessionAMD(VkDevice device, @NativeType("VkGpaSessionAMD") long gpaSession) {
        long __functionAddress = device.getCapabilities().vkResetGpaSessionAMD;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPJI(device.address(), gpaSession, __functionAddress);
    }

    // --- [ vkCmdCopyGpaSessionResultsAMD ] ---

    /** {@code void vkCmdCopyGpaSessionResultsAMD(VkCommandBuffer commandBuffer, VkGpaSessionAMD gpaSession)} */
    public static void vkCmdCopyGpaSessionResultsAMD(VkCommandBuffer commandBuffer, @NativeType("VkGpaSessionAMD") long gpaSession) {
        long __functionAddress = commandBuffer.getCapabilities().vkCmdCopyGpaSessionResultsAMD;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPJV(commandBuffer.address(), gpaSession, __functionAddress);
    }

    /** {@code VkResult vkCreateGpaSessionAMD(VkDevice device, VkGpaSessionCreateInfoAMD const * pCreateInfo, VkAllocationCallbacks const * pAllocator, VkGpaSessionAMD * pGpaSession)} */
    @NativeType("VkResult")
    public static int vkCreateGpaSessionAMD(VkDevice device, @NativeType("VkGpaSessionCreateInfoAMD const *") VkGpaSessionCreateInfoAMD pCreateInfo, @NativeType("VkAllocationCallbacks const *") @Nullable VkAllocationCallbacks pAllocator, @NativeType("VkGpaSessionAMD *") long[] pGpaSession) {
        long __functionAddress = device.getCapabilities().vkCreateGpaSessionAMD;
        if (CHECKS) {
            check(__functionAddress);
            check(pGpaSession, 1);
        }
        return callPPPPI(device.address(), pCreateInfo.address(), memAddressSafe(pAllocator), pGpaSession, __functionAddress);
    }

    /** {@code VkResult vkCmdBeginGpaSampleAMD(VkCommandBuffer commandBuffer, VkGpaSessionAMD gpaSession, VkGpaSampleBeginInfoAMD const * pGpaSampleBeginInfo, uint32_t * pSampleID)} */
    @NativeType("VkResult")
    public static int vkCmdBeginGpaSampleAMD(VkCommandBuffer commandBuffer, @NativeType("VkGpaSessionAMD") long gpaSession, @NativeType("VkGpaSampleBeginInfoAMD const *") VkGpaSampleBeginInfoAMD pGpaSampleBeginInfo, @NativeType("uint32_t *") int[] pSampleID) {
        long __functionAddress = commandBuffer.getCapabilities().vkCmdBeginGpaSampleAMD;
        if (CHECKS) {
            check(__functionAddress);
            VkGpaSampleBeginInfoAMD.validate(pGpaSampleBeginInfo.address());
        }
        return callPJPPI(commandBuffer.address(), gpaSession, pGpaSampleBeginInfo.address(), pSampleID, __functionAddress);
    }

}