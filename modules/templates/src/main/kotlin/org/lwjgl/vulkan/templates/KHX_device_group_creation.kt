/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.vulkan.templates

import org.lwjgl.generator.*
import org.lwjgl.vulkan.*

val KHX_device_group_creation = "KHXDeviceGroupCreation".nativeClassVK("KHX_device_group_creation", type = "instance", postfix = KHX) {
    documentation =
        """
        This extension provides instance-level commands to enumerate groups of physical devices, and to create a logical device from a subset of one of those groups. Such a logical device can then be used with new features in the VK_KHX_device_group extension.

        <h5>Examples</h5>
        <code><pre>
￿    VkDeviceCreateInfo devCreateInfo = { VK_STRUCTURE_TYPE_DEVICE_CREATE_INFO };
￿    // (not shown) fill out devCreateInfo as usual.
￿    uint32_t deviceGroupCount = 0;
￿    VkPhysicalDeviceGroupPropertiesKHX *props = NULL;
￿
￿    // Query the number of device groups
￿    vkEnumeratePhysicalDeviceGroupsKHX(g_vkInstance, &deviceGroupCount, NULL);
￿
￿    // Allocate and initialize structures to query the device groups
￿    props = (VkPhysicalDeviceGroupPropertiesKHX *)malloc(deviceGroupCount*sizeof(VkPhysicalDeviceGroupPropertiesKHX));
￿    for (i = 0; i < deviceGroupCount; ++i) {
￿        props[i].sType = VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_GROUP_PROPERTIES_KHX;
￿        props[i].pNext = NULL;
￿    }
￿    vkEnumeratePhysicalDeviceGroupsKHX(g_vkInstance, &deviceGroupCount, props);
￿
￿    // If the first device group has more than one physical device. create
￿    // a logical device using all of the physical devices.
￿    VkDeviceGroupDeviceCreateInfoKHX deviceGroupInfo = { VK_STRUCTURE_TYPE_DEVICE_GROUP_DEVICE_CREATE_INFO_KHX };
￿    if (props[0].physicalDeviceCount > 1) {
￿        deviceGroupInfo.physicalDeviceCount = props[0].physicalDeviceCount;
￿        deviceGroupInfo.pPhysicalDevices = props[0].physicalDevices;
￿        devCreateInfo.pNext = &deviceGroupInfo;
￿    }
￿
￿    vkCreateDevice(props[0].physicalDevices[0], &devCreateInfo, NULL, &g_vkDevice);
￿    free(props);</pre></code>

        <dl>
            <dt><b>Name String</b></dt>
            <dd>VK_KHX_device_group_creation</dd>

            <dt><b>Extension Type</b></dt>
            <dd>Instance extension</dd>

            <dt><b>Registered Extension Number</b></dt>
            <dd>71</dd>

            <dt><b>Status</b></dt>
            <dd>Draft.</dd>

            <dt><b>Last Modified Date</b></dt>
            <dd>2016-10-19</dd>

            <dt><b>Revision</b></dt>
            <dd>1</dd>

            <dt><b>IP Status</b></dt>
            <dd>No known IP claims.</dd>

            <dt><b>Dependencies</b></dt>
            <dd><ul>
                <li>This extension is written against version 1.0 of the Vulkan API.</li>
            </ul></dd>

            <dt><b>Contributors</b></dt>
            <dd><ul>
                <li>Jeff Bolz, NVIDIA</li>
            </ul></dd>

            <dt><b>Contacts</b></dt>
            <dd><ul>
                <li>Jeff Bolz (jbolz 'at' nvidia.com)</li>
            </ul></dd>
        </dl>
        """

    IntConstant(
        "The extension specification version.",

        "KHX_DEVICE_GROUP_CREATION_SPEC_VERSION".."1"
    )

    StringConstant(
        "The extension name.",

        "KHX_DEVICE_GROUP_CREATION_EXTENSION_NAME".."VK_KHX_device_group_creation"
    )

    EnumConstant(
        "Extends {@code VkStructureType}.",

        "STRUCTURE_TYPE_PHYSICAL_DEVICE_GROUP_PROPERTIES_KHX".."1000070000",
        "STRUCTURE_TYPE_DEVICE_GROUP_DEVICE_CREATE_INFO_KHX".."1000070001"
    )

    EnumConstant(
        "VK_MAX_DEVICE_GROUP_SIZE_KHX",

        "MAX_DEVICE_GROUP_SIZE_KHX".."32"
    )

    EnumConstant(
        "Extends {@code VkMemoryHeapFlagBits}.",

        "MEMORY_HEAP_MULTI_INSTANCE_BIT_KHX".enum(0x00000002)
    )

    VkResult(
        "EnumeratePhysicalDeviceGroupsKHX",
        """
        Enumerates groups of physical devices that can be used to create a single logical device.

        <h5>C Specification</h5>
        To retrieve a list of the device groups present in the system, call:

        <code><pre>
￿VkResult vkEnumeratePhysicalDeviceGroupsKHX(
￿    VkInstance                                  instance,
￿    uint32_t*                                   pPhysicalDeviceGroupCount,
￿    VkPhysicalDeviceGroupPropertiesKHX*         pPhysicalDeviceGroupProperties);</pre></code>

        <h5>Description</h5>
        If {@code pPhysicalDeviceGroupProperties} is {@code NULL}, then the number of device groups available is returned in {@code pPhysicalDeviceGroupCount}. Otherwise, {@code pPhysicalDeviceGroupCount} <b>must</b> point to a variable set by the user to the number of elements in the {@code pPhysicalDeviceGroupProperties} array, and on return the variable is overwritten with the number of structures actually written to {@code pPhysicalDeviceGroupProperties}. If {@code pPhysicalDeviceGroupCount} is less than the number of device groups available, at most {@code pPhysicalDeviceGroupCount} structures will be written. If {@code pPhysicalDeviceGroupCount} is smaller than the number of device groups available, #INCOMPLETE will be returned instead of #SUCCESS, to indicate that not all the available device groups were returned.

        Every physical device <b>must</b> be in exactly one device group.

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code instance} <b>must</b> be a valid {@code VkInstance} handle</li>
            <li>{@code pPhysicalDeviceGroupCount} <b>must</b> be a pointer to a {@code uint32_t} value</li>
            <li>If the value referenced by {@code pPhysicalDeviceGroupCount} is not 0, and {@code pPhysicalDeviceGroupProperties} is not {@code NULL}, {@code pPhysicalDeviceGroupProperties} <b>must</b> be a pointer to an array of {@code pPhysicalDeviceGroupCount} ##VkPhysicalDeviceGroupPropertiesKHX structures</li>
        </ul>

        <h5>Return Codes</h5>
        <dl>
            <dt>On success, this command returns</dt>
            <dd><ul>
                <li>#SUCCESS</li>
                <li>#INCOMPLETE</li>
            </ul></dd>

            <dt>On failure, this command returns</dt>
            <dd><ul>
                <li>#ERROR_OUT_OF_HOST_MEMORY</li>
                <li>#ERROR_OUT_OF_DEVICE_MEMORY</li>
                <li>#ERROR_INITIALIZATION_FAILED</li>
            </ul></dd>
        </dl>

        <h5>See Also</h5>
        ##VkPhysicalDeviceGroupPropertiesKHX
        """,

        VkInstance.IN("instance", "a handle to a Vulkan instance previously created with #CreateInstance()."),
        AutoSize("pPhysicalDeviceGroupProperties")..Check(1)..uint32_t_p.INOUT("pPhysicalDeviceGroupCount", "a pointer to an integer related to the number of device groups available or queried, as described below."),
        nullable..VkPhysicalDeviceGroupPropertiesKHX.p.OUT("pPhysicalDeviceGroupProperties", "either {@code NULL} or a pointer to an array of ##VkPhysicalDeviceGroupPropertiesKHX structures.")
    )
}