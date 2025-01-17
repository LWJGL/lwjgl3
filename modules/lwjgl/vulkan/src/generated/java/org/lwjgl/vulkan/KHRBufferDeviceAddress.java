/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.vulkan;

import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.JNI.*;

public class KHRBufferDeviceAddress {

    public static final int VK_KHR_BUFFER_DEVICE_ADDRESS_SPEC_VERSION = 1;

    public static final String VK_KHR_BUFFER_DEVICE_ADDRESS_EXTENSION_NAME = "VK_KHR_buffer_device_address";

    public static final int
        VK_STRUCTURE_TYPE_BUFFER_DEVICE_ADDRESS_INFO_KHR                     = 1000244001,
        VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_BUFFER_DEVICE_ADDRESS_FEATURES_KHR = 1000257000,
        VK_STRUCTURE_TYPE_BUFFER_OPAQUE_CAPTURE_ADDRESS_CREATE_INFO_KHR      = 1000257002,
        VK_STRUCTURE_TYPE_MEMORY_OPAQUE_CAPTURE_ADDRESS_ALLOCATE_INFO_KHR    = 1000257003,
        VK_STRUCTURE_TYPE_DEVICE_MEMORY_OPAQUE_CAPTURE_ADDRESS_INFO_KHR      = 1000257004;

    public static final int VK_BUFFER_USAGE_SHADER_DEVICE_ADDRESS_BIT_KHR = 0x20000;

    public static final int VK_BUFFER_CREATE_DEVICE_ADDRESS_CAPTURE_REPLAY_BIT_KHR = 0x10;

    public static final int
        VK_MEMORY_ALLOCATE_DEVICE_ADDRESS_BIT_KHR                = 0x2,
        VK_MEMORY_ALLOCATE_DEVICE_ADDRESS_CAPTURE_REPLAY_BIT_KHR = 0x4;

    public static final int VK_ERROR_INVALID_OPAQUE_CAPTURE_ADDRESS_KHR = -1000257000;

    protected KHRBufferDeviceAddress() {
        throw new UnsupportedOperationException();
    }

    // --- [ vkGetBufferDeviceAddressKHR ] ---

    /** {@code VkDeviceAddress vkGetBufferDeviceAddressKHR(VkDevice device, VkBufferDeviceAddressInfo const * pInfo)} */
    public static long nvkGetBufferDeviceAddressKHR(VkDevice device, long pInfo) {
        long __functionAddress = device.getCapabilities().vkGetBufferDeviceAddressKHR;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPPJ(device.address(), pInfo, __functionAddress);
    }

    /** {@code VkDeviceAddress vkGetBufferDeviceAddressKHR(VkDevice device, VkBufferDeviceAddressInfo const * pInfo)} */
    @NativeType("VkDeviceAddress")
    public static long vkGetBufferDeviceAddressKHR(VkDevice device, @NativeType("VkBufferDeviceAddressInfo const *") VkBufferDeviceAddressInfo pInfo) {
        return nvkGetBufferDeviceAddressKHR(device, pInfo.address());
    }

    // --- [ vkGetBufferOpaqueCaptureAddressKHR ] ---

    /** {@code uint64_t vkGetBufferOpaqueCaptureAddressKHR(VkDevice device, VkBufferDeviceAddressInfo const * pInfo)} */
    public static long nvkGetBufferOpaqueCaptureAddressKHR(VkDevice device, long pInfo) {
        long __functionAddress = device.getCapabilities().vkGetBufferOpaqueCaptureAddressKHR;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPPJ(device.address(), pInfo, __functionAddress);
    }

    /** {@code uint64_t vkGetBufferOpaqueCaptureAddressKHR(VkDevice device, VkBufferDeviceAddressInfo const * pInfo)} */
    @NativeType("uint64_t")
    public static long vkGetBufferOpaqueCaptureAddressKHR(VkDevice device, @NativeType("VkBufferDeviceAddressInfo const *") VkBufferDeviceAddressInfo pInfo) {
        return nvkGetBufferOpaqueCaptureAddressKHR(device, pInfo.address());
    }

    // --- [ vkGetDeviceMemoryOpaqueCaptureAddressKHR ] ---

    /** {@code uint64_t vkGetDeviceMemoryOpaqueCaptureAddressKHR(VkDevice device, VkDeviceMemoryOpaqueCaptureAddressInfo const * pInfo)} */
    public static long nvkGetDeviceMemoryOpaqueCaptureAddressKHR(VkDevice device, long pInfo) {
        long __functionAddress = device.getCapabilities().vkGetDeviceMemoryOpaqueCaptureAddressKHR;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPPJ(device.address(), pInfo, __functionAddress);
    }

    /** {@code uint64_t vkGetDeviceMemoryOpaqueCaptureAddressKHR(VkDevice device, VkDeviceMemoryOpaqueCaptureAddressInfo const * pInfo)} */
    @NativeType("uint64_t")
    public static long vkGetDeviceMemoryOpaqueCaptureAddressKHR(VkDevice device, @NativeType("VkDeviceMemoryOpaqueCaptureAddressInfo const *") VkDeviceMemoryOpaqueCaptureAddressInfo pInfo) {
        return nvkGetDeviceMemoryOpaqueCaptureAddressKHR(device, pInfo.address());
    }

}