/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.vulkan;

import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.JNI.*;

public class EXTBufferDeviceAddress {

    public static final int VK_EXT_BUFFER_DEVICE_ADDRESS_SPEC_VERSION = 2;

    public static final String VK_EXT_BUFFER_DEVICE_ADDRESS_EXTENSION_NAME = "VK_EXT_buffer_device_address";

    public static final int
        VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_BUFFER_DEVICE_ADDRESS_FEATURES_EXT = 1000244000,
        VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_BUFFER_ADDRESS_FEATURES_EXT        = 1000244000,
        VK_STRUCTURE_TYPE_BUFFER_DEVICE_ADDRESS_INFO_EXT                     = 1000244001,
        VK_STRUCTURE_TYPE_BUFFER_DEVICE_ADDRESS_CREATE_INFO_EXT              = 1000244002;

    public static final int VK_BUFFER_USAGE_SHADER_DEVICE_ADDRESS_BIT_EXT = 0x20000;

    public static final int VK_BUFFER_CREATE_DEVICE_ADDRESS_CAPTURE_REPLAY_BIT_EXT = 0x10;

    public static final int VK_ERROR_INVALID_DEVICE_ADDRESS_EXT = -1000257000;

    protected EXTBufferDeviceAddress() {
        throw new UnsupportedOperationException();
    }

    // --- [ vkGetBufferDeviceAddressEXT ] ---

    /** {@code VkDeviceAddress vkGetBufferDeviceAddressEXT(VkDevice device, VkBufferDeviceAddressInfo const * pInfo)} */
    public static long nvkGetBufferDeviceAddressEXT(VkDevice device, long pInfo) {
        long __functionAddress = device.getCapabilities().vkGetBufferDeviceAddressEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPPJ(device.address(), pInfo, __functionAddress);
    }

    /** {@code VkDeviceAddress vkGetBufferDeviceAddressEXT(VkDevice device, VkBufferDeviceAddressInfo const * pInfo)} */
    @NativeType("VkDeviceAddress")
    public static long vkGetBufferDeviceAddressEXT(VkDevice device, @NativeType("VkBufferDeviceAddressInfo const *") VkBufferDeviceAddressInfo pInfo) {
        return nvkGetBufferDeviceAddressEXT(device, pInfo.address());
    }

}