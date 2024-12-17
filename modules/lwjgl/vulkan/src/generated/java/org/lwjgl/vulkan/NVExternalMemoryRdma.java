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

public class NVExternalMemoryRdma {

    public static final int VK_NV_EXTERNAL_MEMORY_RDMA_SPEC_VERSION = 1;

    public static final String VK_NV_EXTERNAL_MEMORY_RDMA_EXTENSION_NAME = "VK_NV_external_memory_rdma";

    public static final int
        VK_STRUCTURE_TYPE_MEMORY_GET_REMOTE_ADDRESS_INFO_NV                = 1000371000,
        VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_EXTERNAL_MEMORY_RDMA_FEATURES_NV = 1000371001;

    public static final int VK_MEMORY_PROPERTY_RDMA_CAPABLE_BIT_NV = 0x100;

    public static final int VK_EXTERNAL_MEMORY_HANDLE_TYPE_RDMA_ADDRESS_BIT_NV = 0x1000;

    protected NVExternalMemoryRdma() {
        throw new UnsupportedOperationException();
    }

    // --- [ vkGetMemoryRemoteAddressNV ] ---

    /** {@code VkResult vkGetMemoryRemoteAddressNV(VkDevice device, VkMemoryGetRemoteAddressInfoNV const * pMemoryGetRemoteAddressInfo, VkRemoteAddressNV * pAddress)} */
    public static int nvkGetMemoryRemoteAddressNV(VkDevice device, long pMemoryGetRemoteAddressInfo, long pAddress) {
        long __functionAddress = device.getCapabilities().vkGetMemoryRemoteAddressNV;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPPPI(device.address(), pMemoryGetRemoteAddressInfo, pAddress, __functionAddress);
    }

    /** {@code VkResult vkGetMemoryRemoteAddressNV(VkDevice device, VkMemoryGetRemoteAddressInfoNV const * pMemoryGetRemoteAddressInfo, VkRemoteAddressNV * pAddress)} */
    @NativeType("VkResult")
    public static int vkGetMemoryRemoteAddressNV(VkDevice device, @NativeType("VkMemoryGetRemoteAddressInfoNV const *") VkMemoryGetRemoteAddressInfoNV pMemoryGetRemoteAddressInfo, @NativeType("VkRemoteAddressNV *") PointerBuffer pAddress) {
        if (CHECKS) {
            check(pAddress, 1);
        }
        return nvkGetMemoryRemoteAddressNV(device, pMemoryGetRemoteAddressInfo.address(), memAddress(pAddress));
    }

}