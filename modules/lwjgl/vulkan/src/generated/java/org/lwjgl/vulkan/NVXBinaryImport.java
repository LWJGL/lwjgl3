/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.vulkan;

import org.jspecify.annotations.*;

import java.nio.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.JNI.*;
import static org.lwjgl.system.MemoryUtil.*;

public class NVXBinaryImport {

    public static final int VK_NVX_BINARY_IMPORT_SPEC_VERSION = 2;

    public static final String VK_NVX_BINARY_IMPORT_EXTENSION_NAME = "VK_NVX_binary_import";

    public static final int
        VK_STRUCTURE_TYPE_CU_MODULE_CREATE_INFO_NVX                = 1000029000,
        VK_STRUCTURE_TYPE_CU_FUNCTION_CREATE_INFO_NVX              = 1000029001,
        VK_STRUCTURE_TYPE_CU_LAUNCH_INFO_NVX                       = 1000029002,
        VK_STRUCTURE_TYPE_CU_MODULE_TEXTURING_MODE_CREATE_INFO_NVX = 1000029004;

    public static final int
        VK_OBJECT_TYPE_CU_MODULE_NVX   = 1000029000,
        VK_OBJECT_TYPE_CU_FUNCTION_NVX = 1000029001;

    public static final int
        VK_DEBUG_REPORT_OBJECT_TYPE_CU_MODULE_NVX_EXT   = 1000029000,
        VK_DEBUG_REPORT_OBJECT_TYPE_CU_FUNCTION_NVX_EXT = 1000029001;

    protected NVXBinaryImport() {
        throw new UnsupportedOperationException();
    }

    // --- [ vkCreateCuModuleNVX ] ---

    /** {@code VkResult vkCreateCuModuleNVX(VkDevice device, VkCuModuleCreateInfoNVX const * pCreateInfo, VkAllocationCallbacks const * pAllocator, VkCuModuleNVX * pModule)} */
    public static int nvkCreateCuModuleNVX(VkDevice device, long pCreateInfo, long pAllocator, long pModule) {
        long __functionAddress = device.getCapabilities().vkCreateCuModuleNVX;
        if (CHECKS) {
            check(__functionAddress);
            VkCuModuleCreateInfoNVX.validate(pCreateInfo);
        }
        return callPPPPI(device.address(), pCreateInfo, pAllocator, pModule, __functionAddress);
    }

    /** {@code VkResult vkCreateCuModuleNVX(VkDevice device, VkCuModuleCreateInfoNVX const * pCreateInfo, VkAllocationCallbacks const * pAllocator, VkCuModuleNVX * pModule)} */
    @NativeType("VkResult")
    public static int vkCreateCuModuleNVX(VkDevice device, @NativeType("VkCuModuleCreateInfoNVX const *") VkCuModuleCreateInfoNVX pCreateInfo, @NativeType("VkAllocationCallbacks const *") @Nullable VkAllocationCallbacks pAllocator, @NativeType("VkCuModuleNVX *") LongBuffer pModule) {
        if (CHECKS) {
            check(pModule, 1);
        }
        return nvkCreateCuModuleNVX(device, pCreateInfo.address(), memAddressSafe(pAllocator), memAddress(pModule));
    }

    // --- [ vkCreateCuFunctionNVX ] ---

    /** {@code VkResult vkCreateCuFunctionNVX(VkDevice device, VkCuFunctionCreateInfoNVX const * pCreateInfo, VkAllocationCallbacks const * pAllocator, VkCuFunctionNVX * pFunction)} */
    public static int nvkCreateCuFunctionNVX(VkDevice device, long pCreateInfo, long pAllocator, long pFunction) {
        long __functionAddress = device.getCapabilities().vkCreateCuFunctionNVX;
        if (CHECKS) {
            check(__functionAddress);
            VkCuFunctionCreateInfoNVX.validate(pCreateInfo);
        }
        return callPPPPI(device.address(), pCreateInfo, pAllocator, pFunction, __functionAddress);
    }

    /** {@code VkResult vkCreateCuFunctionNVX(VkDevice device, VkCuFunctionCreateInfoNVX const * pCreateInfo, VkAllocationCallbacks const * pAllocator, VkCuFunctionNVX * pFunction)} */
    @NativeType("VkResult")
    public static int vkCreateCuFunctionNVX(VkDevice device, @NativeType("VkCuFunctionCreateInfoNVX const *") VkCuFunctionCreateInfoNVX pCreateInfo, @NativeType("VkAllocationCallbacks const *") @Nullable VkAllocationCallbacks pAllocator, @NativeType("VkCuFunctionNVX *") LongBuffer pFunction) {
        if (CHECKS) {
            check(pFunction, 1);
        }
        return nvkCreateCuFunctionNVX(device, pCreateInfo.address(), memAddressSafe(pAllocator), memAddress(pFunction));
    }

    // --- [ vkDestroyCuModuleNVX ] ---

    /** {@code void vkDestroyCuModuleNVX(VkDevice device, VkCuModuleNVX module, VkAllocationCallbacks const * pAllocator)} */
    public static void nvkDestroyCuModuleNVX(VkDevice device, long module, long pAllocator) {
        long __functionAddress = device.getCapabilities().vkDestroyCuModuleNVX;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPJPV(device.address(), module, pAllocator, __functionAddress);
    }

    /** {@code void vkDestroyCuModuleNVX(VkDevice device, VkCuModuleNVX module, VkAllocationCallbacks const * pAllocator)} */
    public static void vkDestroyCuModuleNVX(VkDevice device, @NativeType("VkCuModuleNVX") long module, @NativeType("VkAllocationCallbacks const *") @Nullable VkAllocationCallbacks pAllocator) {
        nvkDestroyCuModuleNVX(device, module, memAddressSafe(pAllocator));
    }

    // --- [ vkDestroyCuFunctionNVX ] ---

    /** {@code void vkDestroyCuFunctionNVX(VkDevice device, VkCuFunctionNVX function, VkAllocationCallbacks const * pAllocator)} */
    public static void nvkDestroyCuFunctionNVX(VkDevice device, long function, long pAllocator) {
        long __functionAddress = device.getCapabilities().vkDestroyCuFunctionNVX;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPJPV(device.address(), function, pAllocator, __functionAddress);
    }

    /** {@code void vkDestroyCuFunctionNVX(VkDevice device, VkCuFunctionNVX function, VkAllocationCallbacks const * pAllocator)} */
    public static void vkDestroyCuFunctionNVX(VkDevice device, @NativeType("VkCuFunctionNVX") long function, @NativeType("VkAllocationCallbacks const *") @Nullable VkAllocationCallbacks pAllocator) {
        nvkDestroyCuFunctionNVX(device, function, memAddressSafe(pAllocator));
    }

    // --- [ vkCmdCuLaunchKernelNVX ] ---

    /** {@code void vkCmdCuLaunchKernelNVX(VkCommandBuffer commandBuffer, VkCuLaunchInfoNVX const * pLaunchInfo)} */
    public static void nvkCmdCuLaunchKernelNVX(VkCommandBuffer commandBuffer, long pLaunchInfo) {
        long __functionAddress = commandBuffer.getCapabilities().vkCmdCuLaunchKernelNVX;
        if (CHECKS) {
            check(__functionAddress);
            VkCuLaunchInfoNVX.validate(pLaunchInfo);
        }
        callPPV(commandBuffer.address(), pLaunchInfo, __functionAddress);
    }

    /** {@code void vkCmdCuLaunchKernelNVX(VkCommandBuffer commandBuffer, VkCuLaunchInfoNVX const * pLaunchInfo)} */
    public static void vkCmdCuLaunchKernelNVX(VkCommandBuffer commandBuffer, @NativeType("VkCuLaunchInfoNVX const *") VkCuLaunchInfoNVX pLaunchInfo) {
        nvkCmdCuLaunchKernelNVX(commandBuffer, pLaunchInfo.address());
    }

    /** {@code VkResult vkCreateCuModuleNVX(VkDevice device, VkCuModuleCreateInfoNVX const * pCreateInfo, VkAllocationCallbacks const * pAllocator, VkCuModuleNVX * pModule)} */
    @NativeType("VkResult")
    public static int vkCreateCuModuleNVX(VkDevice device, @NativeType("VkCuModuleCreateInfoNVX const *") VkCuModuleCreateInfoNVX pCreateInfo, @NativeType("VkAllocationCallbacks const *") @Nullable VkAllocationCallbacks pAllocator, @NativeType("VkCuModuleNVX *") long[] pModule) {
        long __functionAddress = device.getCapabilities().vkCreateCuModuleNVX;
        if (CHECKS) {
            check(__functionAddress);
            check(pModule, 1);
            VkCuModuleCreateInfoNVX.validate(pCreateInfo.address());
        }
        return callPPPPI(device.address(), pCreateInfo.address(), memAddressSafe(pAllocator), pModule, __functionAddress);
    }

    /** {@code VkResult vkCreateCuFunctionNVX(VkDevice device, VkCuFunctionCreateInfoNVX const * pCreateInfo, VkAllocationCallbacks const * pAllocator, VkCuFunctionNVX * pFunction)} */
    @NativeType("VkResult")
    public static int vkCreateCuFunctionNVX(VkDevice device, @NativeType("VkCuFunctionCreateInfoNVX const *") VkCuFunctionCreateInfoNVX pCreateInfo, @NativeType("VkAllocationCallbacks const *") @Nullable VkAllocationCallbacks pAllocator, @NativeType("VkCuFunctionNVX *") long[] pFunction) {
        long __functionAddress = device.getCapabilities().vkCreateCuFunctionNVX;
        if (CHECKS) {
            check(__functionAddress);
            check(pFunction, 1);
            VkCuFunctionCreateInfoNVX.validate(pCreateInfo.address());
        }
        return callPPPPI(device.address(), pCreateInfo.address(), memAddressSafe(pAllocator), pFunction, __functionAddress);
    }

}