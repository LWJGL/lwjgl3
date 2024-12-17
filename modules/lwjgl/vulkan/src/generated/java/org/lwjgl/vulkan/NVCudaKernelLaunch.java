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

public class NVCudaKernelLaunch {

    public static final int VK_NV_CUDA_KERNEL_LAUNCH_SPEC_VERSION = 2;

    public static final String VK_NV_CUDA_KERNEL_LAUNCH_EXTENSION_NAME = "VK_NV_cuda_kernel_launch";

    public static final int
        VK_STRUCTURE_TYPE_CUDA_MODULE_CREATE_INFO_NV                       = 1000307000,
        VK_STRUCTURE_TYPE_CUDA_FUNCTION_CREATE_INFO_NV                     = 1000307001,
        VK_STRUCTURE_TYPE_CUDA_LAUNCH_INFO_NV                              = 1000307002,
        VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_CUDA_KERNEL_LAUNCH_FEATURES_NV   = 1000307003,
        VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_CUDA_KERNEL_LAUNCH_PROPERTIES_NV = 1000307004;

    public static final int
        VK_OBJECT_TYPE_CUDA_MODULE_NV   = 1000307000,
        VK_OBJECT_TYPE_CUDA_FUNCTION_NV = 1000307001;

    public static final int
        VK_DEBUG_REPORT_OBJECT_TYPE_CUDA_MODULE_NV_EXT   = 1000307000,
        VK_DEBUG_REPORT_OBJECT_TYPE_CUDA_FUNCTION_NV_EXT = 1000307001;

    protected NVCudaKernelLaunch() {
        throw new UnsupportedOperationException();
    }

    // --- [ vkCreateCudaModuleNV ] ---

    /** {@code VkResult vkCreateCudaModuleNV(VkDevice device, VkCudaModuleCreateInfoNV const * pCreateInfo, VkAllocationCallbacks const * pAllocator, VkCudaModuleNV * pModule)} */
    public static int nvkCreateCudaModuleNV(VkDevice device, long pCreateInfo, long pAllocator, long pModule) {
        long __functionAddress = device.getCapabilities().vkCreateCudaModuleNV;
        if (CHECKS) {
            check(__functionAddress);
            VkCudaModuleCreateInfoNV.validate(pCreateInfo);
        }
        return callPPPPI(device.address(), pCreateInfo, pAllocator, pModule, __functionAddress);
    }

    /** {@code VkResult vkCreateCudaModuleNV(VkDevice device, VkCudaModuleCreateInfoNV const * pCreateInfo, VkAllocationCallbacks const * pAllocator, VkCudaModuleNV * pModule)} */
    @NativeType("VkResult")
    public static int vkCreateCudaModuleNV(VkDevice device, @NativeType("VkCudaModuleCreateInfoNV const *") VkCudaModuleCreateInfoNV pCreateInfo, @NativeType("VkAllocationCallbacks const *") @Nullable VkAllocationCallbacks pAllocator, @NativeType("VkCudaModuleNV *") LongBuffer pModule) {
        if (CHECKS) {
            check(pModule, 1);
        }
        return nvkCreateCudaModuleNV(device, pCreateInfo.address(), memAddressSafe(pAllocator), memAddress(pModule));
    }

    // --- [ vkGetCudaModuleCacheNV ] ---

    /** {@code VkResult vkGetCudaModuleCacheNV(VkDevice device, VkCudaModuleNV module, size_t * pCacheSize, void * pCacheData)} */
    public static int nvkGetCudaModuleCacheNV(VkDevice device, long module, long pCacheSize, long pCacheData) {
        long __functionAddress = device.getCapabilities().vkGetCudaModuleCacheNV;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPJPPI(device.address(), module, pCacheSize, pCacheData, __functionAddress);
    }

    /** {@code VkResult vkGetCudaModuleCacheNV(VkDevice device, VkCudaModuleNV module, size_t * pCacheSize, void * pCacheData)} */
    @NativeType("VkResult")
    public static int vkGetCudaModuleCacheNV(VkDevice device, @NativeType("VkCudaModuleNV") long module, @NativeType("size_t *") PointerBuffer pCacheSize, @NativeType("void *") @Nullable ByteBuffer pCacheData) {
        if (CHECKS) {
            check(pCacheSize, 1);
            checkSafe(pCacheData, pCacheSize.get(pCacheSize.position()));
        }
        return nvkGetCudaModuleCacheNV(device, module, memAddress(pCacheSize), memAddressSafe(pCacheData));
    }

    // --- [ vkCreateCudaFunctionNV ] ---

    /** {@code VkResult vkCreateCudaFunctionNV(VkDevice device, VkCudaFunctionCreateInfoNV const * pCreateInfo, VkAllocationCallbacks const * pAllocator, VkCudaFunctionNV * pFunction)} */
    public static int nvkCreateCudaFunctionNV(VkDevice device, long pCreateInfo, long pAllocator, long pFunction) {
        long __functionAddress = device.getCapabilities().vkCreateCudaFunctionNV;
        if (CHECKS) {
            check(__functionAddress);
            VkCudaFunctionCreateInfoNV.validate(pCreateInfo);
        }
        return callPPPPI(device.address(), pCreateInfo, pAllocator, pFunction, __functionAddress);
    }

    /** {@code VkResult vkCreateCudaFunctionNV(VkDevice device, VkCudaFunctionCreateInfoNV const * pCreateInfo, VkAllocationCallbacks const * pAllocator, VkCudaFunctionNV * pFunction)} */
    @NativeType("VkResult")
    public static int vkCreateCudaFunctionNV(VkDevice device, @NativeType("VkCudaFunctionCreateInfoNV const *") VkCudaFunctionCreateInfoNV pCreateInfo, @NativeType("VkAllocationCallbacks const *") @Nullable VkAllocationCallbacks pAllocator, @NativeType("VkCudaFunctionNV *") LongBuffer pFunction) {
        if (CHECKS) {
            check(pFunction, 1);
        }
        return nvkCreateCudaFunctionNV(device, pCreateInfo.address(), memAddressSafe(pAllocator), memAddress(pFunction));
    }

    // --- [ vkDestroyCudaModuleNV ] ---

    /** {@code void vkDestroyCudaModuleNV(VkDevice device, VkCudaModuleNV module, VkAllocationCallbacks const * pAllocator)} */
    public static void nvkDestroyCudaModuleNV(VkDevice device, long module, long pAllocator) {
        long __functionAddress = device.getCapabilities().vkDestroyCudaModuleNV;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPJPV(device.address(), module, pAllocator, __functionAddress);
    }

    /** {@code void vkDestroyCudaModuleNV(VkDevice device, VkCudaModuleNV module, VkAllocationCallbacks const * pAllocator)} */
    public static void vkDestroyCudaModuleNV(VkDevice device, @NativeType("VkCudaModuleNV") long module, @NativeType("VkAllocationCallbacks const *") @Nullable VkAllocationCallbacks pAllocator) {
        nvkDestroyCudaModuleNV(device, module, memAddressSafe(pAllocator));
    }

    // --- [ vkDestroyCudaFunctionNV ] ---

    /** {@code void vkDestroyCudaFunctionNV(VkDevice device, VkCudaFunctionNV function, VkAllocationCallbacks const * pAllocator)} */
    public static void nvkDestroyCudaFunctionNV(VkDevice device, long function, long pAllocator) {
        long __functionAddress = device.getCapabilities().vkDestroyCudaFunctionNV;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPJPV(device.address(), function, pAllocator, __functionAddress);
    }

    /** {@code void vkDestroyCudaFunctionNV(VkDevice device, VkCudaFunctionNV function, VkAllocationCallbacks const * pAllocator)} */
    public static void vkDestroyCudaFunctionNV(VkDevice device, @NativeType("VkCudaFunctionNV") long function, @NativeType("VkAllocationCallbacks const *") @Nullable VkAllocationCallbacks pAllocator) {
        nvkDestroyCudaFunctionNV(device, function, memAddressSafe(pAllocator));
    }

    // --- [ vkCmdCudaLaunchKernelNV ] ---

    /** {@code void vkCmdCudaLaunchKernelNV(VkCommandBuffer commandBuffer, VkCudaLaunchInfoNV const * pLaunchInfo)} */
    public static void nvkCmdCudaLaunchKernelNV(VkCommandBuffer commandBuffer, long pLaunchInfo) {
        long __functionAddress = commandBuffer.getCapabilities().vkCmdCudaLaunchKernelNV;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPPV(commandBuffer.address(), pLaunchInfo, __functionAddress);
    }

    /** {@code void vkCmdCudaLaunchKernelNV(VkCommandBuffer commandBuffer, VkCudaLaunchInfoNV const * pLaunchInfo)} */
    public static void vkCmdCudaLaunchKernelNV(VkCommandBuffer commandBuffer, @NativeType("VkCudaLaunchInfoNV const *") VkCudaLaunchInfoNV pLaunchInfo) {
        nvkCmdCudaLaunchKernelNV(commandBuffer, pLaunchInfo.address());
    }

    /** {@code VkResult vkCreateCudaModuleNV(VkDevice device, VkCudaModuleCreateInfoNV const * pCreateInfo, VkAllocationCallbacks const * pAllocator, VkCudaModuleNV * pModule)} */
    @NativeType("VkResult")
    public static int vkCreateCudaModuleNV(VkDevice device, @NativeType("VkCudaModuleCreateInfoNV const *") VkCudaModuleCreateInfoNV pCreateInfo, @NativeType("VkAllocationCallbacks const *") @Nullable VkAllocationCallbacks pAllocator, @NativeType("VkCudaModuleNV *") long[] pModule) {
        long __functionAddress = device.getCapabilities().vkCreateCudaModuleNV;
        if (CHECKS) {
            check(__functionAddress);
            check(pModule, 1);
            VkCudaModuleCreateInfoNV.validate(pCreateInfo.address());
        }
        return callPPPPI(device.address(), pCreateInfo.address(), memAddressSafe(pAllocator), pModule, __functionAddress);
    }

    /** {@code VkResult vkCreateCudaFunctionNV(VkDevice device, VkCudaFunctionCreateInfoNV const * pCreateInfo, VkAllocationCallbacks const * pAllocator, VkCudaFunctionNV * pFunction)} */
    @NativeType("VkResult")
    public static int vkCreateCudaFunctionNV(VkDevice device, @NativeType("VkCudaFunctionCreateInfoNV const *") VkCudaFunctionCreateInfoNV pCreateInfo, @NativeType("VkAllocationCallbacks const *") @Nullable VkAllocationCallbacks pAllocator, @NativeType("VkCudaFunctionNV *") long[] pFunction) {
        long __functionAddress = device.getCapabilities().vkCreateCudaFunctionNV;
        if (CHECKS) {
            check(__functionAddress);
            check(pFunction, 1);
            VkCudaFunctionCreateInfoNV.validate(pCreateInfo.address());
        }
        return callPPPPI(device.address(), pCreateInfo.address(), memAddressSafe(pAllocator), pFunction, __functionAddress);
    }

}