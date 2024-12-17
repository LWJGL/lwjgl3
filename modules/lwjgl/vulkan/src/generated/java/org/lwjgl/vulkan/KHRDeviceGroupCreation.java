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

public class KHRDeviceGroupCreation {

    public static final int VK_KHR_DEVICE_GROUP_CREATION_SPEC_VERSION = 1;

    public static final String VK_KHR_DEVICE_GROUP_CREATION_EXTENSION_NAME = "VK_KHR_device_group_creation";

    public static final int
        VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_GROUP_PROPERTIES_KHR = 1000070000,
        VK_STRUCTURE_TYPE_DEVICE_GROUP_DEVICE_CREATE_INFO_KHR  = 1000070001;

    public static final int VK_MAX_DEVICE_GROUP_SIZE_KHR = 32;

    public static final int VK_MEMORY_HEAP_MULTI_INSTANCE_BIT_KHR = 0x2;

    protected KHRDeviceGroupCreation() {
        throw new UnsupportedOperationException();
    }

    // --- [ vkEnumeratePhysicalDeviceGroupsKHR ] ---

    /** {@code VkResult vkEnumeratePhysicalDeviceGroupsKHR(VkInstance instance, uint32_t * pPhysicalDeviceGroupCount, VkPhysicalDeviceGroupProperties * pPhysicalDeviceGroupProperties)} */
    public static int nvkEnumeratePhysicalDeviceGroupsKHR(VkInstance instance, long pPhysicalDeviceGroupCount, long pPhysicalDeviceGroupProperties) {
        long __functionAddress = instance.getCapabilities().vkEnumeratePhysicalDeviceGroupsKHR;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPPPI(instance.address(), pPhysicalDeviceGroupCount, pPhysicalDeviceGroupProperties, __functionAddress);
    }

    /** {@code VkResult vkEnumeratePhysicalDeviceGroupsKHR(VkInstance instance, uint32_t * pPhysicalDeviceGroupCount, VkPhysicalDeviceGroupProperties * pPhysicalDeviceGroupProperties)} */
    @NativeType("VkResult")
    public static int vkEnumeratePhysicalDeviceGroupsKHR(VkInstance instance, @NativeType("uint32_t *") IntBuffer pPhysicalDeviceGroupCount, @NativeType("VkPhysicalDeviceGroupProperties *") VkPhysicalDeviceGroupProperties.@Nullable Buffer pPhysicalDeviceGroupProperties) {
        if (CHECKS) {
            check(pPhysicalDeviceGroupCount, 1);
            checkSafe(pPhysicalDeviceGroupProperties, pPhysicalDeviceGroupCount.get(pPhysicalDeviceGroupCount.position()));
        }
        return nvkEnumeratePhysicalDeviceGroupsKHR(instance, memAddress(pPhysicalDeviceGroupCount), memAddressSafe(pPhysicalDeviceGroupProperties));
    }

    /** {@code VkResult vkEnumeratePhysicalDeviceGroupsKHR(VkInstance instance, uint32_t * pPhysicalDeviceGroupCount, VkPhysicalDeviceGroupProperties * pPhysicalDeviceGroupProperties)} */
    @NativeType("VkResult")
    public static int vkEnumeratePhysicalDeviceGroupsKHR(VkInstance instance, @NativeType("uint32_t *") int[] pPhysicalDeviceGroupCount, @NativeType("VkPhysicalDeviceGroupProperties *") VkPhysicalDeviceGroupProperties.@Nullable Buffer pPhysicalDeviceGroupProperties) {
        long __functionAddress = instance.getCapabilities().vkEnumeratePhysicalDeviceGroupsKHR;
        if (CHECKS) {
            check(__functionAddress);
            check(pPhysicalDeviceGroupCount, 1);
            checkSafe(pPhysicalDeviceGroupProperties, pPhysicalDeviceGroupCount[0]);
        }
        return callPPPI(instance.address(), pPhysicalDeviceGroupCount, memAddressSafe(pPhysicalDeviceGroupProperties), __functionAddress);
    }

}