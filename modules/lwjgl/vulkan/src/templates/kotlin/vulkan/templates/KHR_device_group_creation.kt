/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package vulkan.templates

import org.lwjgl.generator.*
import vulkan.*

val KHR_device_group_creation = "KHRDeviceGroupCreation".nativeClassVK("KHR_device_group_creation", type = "instance", postfix = "KHR") {
    documentation =
        """
        This extension provides instance-level commands to enumerate groups of physical devices, and to create a logical device from a subset of one of those groups. Such a logical device can then be used with new features in the {@link KHRDeviceGroup VK_KHR_device_group} extension.

        <h5>Promotion to Vulkan 1.1</h5>
        All functionality in this extension is included in core Vulkan 1.1, with the KHR suffix omitted. The original type, enum and command names are still available as aliases of the core functionality.

        <h5>Examples</h5>
        <pre><code>
￿    VkDeviceCreateInfo devCreateInfo = { VK_STRUCTURE_TYPE_DEVICE_CREATE_INFO };
￿    // (not shown) fill out devCreateInfo as usual.
￿    uint32_t deviceGroupCount = 0;
￿    VkPhysicalDeviceGroupPropertiesKHR *props = NULL;
￿
￿    // Query the number of device groups
￿    vkEnumeratePhysicalDeviceGroupsKHR(g_vkInstance, &amp;deviceGroupCount, NULL);
￿
￿    // Allocate and initialize structures to query the device groups
￿    props = (VkPhysicalDeviceGroupPropertiesKHR *)malloc(deviceGroupCount*sizeof(VkPhysicalDeviceGroupPropertiesKHR));
￿    for (i = 0; i &lt; deviceGroupCount; ++i) {
￿        props[i].sType = VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_GROUP_PROPERTIES_KHR;
￿        props[i].pNext = NULL;
￿    }
￿    vkEnumeratePhysicalDeviceGroupsKHR(g_vkInstance, &amp;deviceGroupCount, props);
￿
￿    // If the first device group has more than one physical device. create
￿    // a logical device using all of the physical devices.
￿    VkDeviceGroupDeviceCreateInfoKHR deviceGroupInfo = { VK_STRUCTURE_TYPE_DEVICE_GROUP_DEVICE_CREATE_INFO_KHR };
￿    if (props[0].physicalDeviceCount &gt; 1) {
￿        deviceGroupInfo.physicalDeviceCount = props[0].physicalDeviceCount;
￿        deviceGroupInfo.pPhysicalDevices = props[0].physicalDevices;
￿        devCreateInfo.pNext = &amp;deviceGroupInfo;
￿    }
￿
￿    vkCreateDevice(props[0].physicalDevices[0], &amp;devCreateInfo, NULL, &amp;g_vkDevice);
￿    free(props);</code></pre>

        <h5>VK_KHR_device_group_creation</h5>
        <dl>
            <dt><b>Name String</b></dt>
            <dd>{@code VK_KHR_device_group_creation}</dd>

            <dt><b>Extension Type</b></dt>
            <dd>Instance extension</dd>

            <dt><b>Registered Extension Number</b></dt>
            <dd>71</dd>

            <dt><b>Revision</b></dt>
            <dd>1</dd>

            <dt><b>Extension and Version Dependencies</b></dt>
            <dd><ul>
                <li>Requires Vulkan 1.0</li>
            </ul></dd>

            <dt><b>Deprecation state</b></dt>
            <dd><ul>
                <li><em>Promoted</em> to <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html\#versions-1.1-promotions">Vulkan 1.1</a></li>
            </ul></dd>

            <dt><b>Contact</b></dt>
            <dd><ul>
                <li>Jeff Bolz <a target="_blank" href="https://github.com/KhronosGroup/Vulkan-Docs/issues/new?body=[VK_KHR_device_group_creation]%20@jeffbolznv%250A%3C%3CHere%20describe%20the%20issue%20or%20question%20you%20have%20about%20the%20VK_KHR_device_group_creation%20extension%3E%3E">jeffbolznv</a></li>
            </ul></dd>
        </dl>

        <h5>Other Extension Metadata</h5>
        <dl>
            <dt><b>Last Modified Date</b></dt>
            <dd>2016-10-19</dd>

            <dt><b>IP Status</b></dt>
            <dd>No known IP claims.</dd>

            <dt><b>Interactions and External Dependencies</b></dt>
            <dd><ul>
                <li>Promoted to Vulkan 1.1 Core</li>
            </ul></dd>

            <dt><b>Contributors</b></dt>
            <dd><ul>
                <li>Jeff Bolz, NVIDIA</li>
            </ul></dd>
        </dl>
        """

    IntConstant(
        "The extension specification version.",

        "KHR_DEVICE_GROUP_CREATION_SPEC_VERSION".."1"
    )

    StringConstant(
        "The extension name.",

        "KHR_DEVICE_GROUP_CREATION_EXTENSION_NAME".."VK_KHR_device_group_creation"
    )

    EnumConstant(
        "Extends {@code VkStructureType}.",

        "STRUCTURE_TYPE_PHYSICAL_DEVICE_GROUP_PROPERTIES_KHR".."1000070000",
        "STRUCTURE_TYPE_DEVICE_GROUP_DEVICE_CREATE_INFO_KHR".."1000070001"
    )

    EnumConstant(
        "VK_MAX_DEVICE_GROUP_SIZE_KHR",

        "MAX_DEVICE_GROUP_SIZE_KHR".."32"
    )

    EnumConstant(
        "Extends {@code VkMemoryHeapFlagBits}.",

        "MEMORY_HEAP_MULTI_INSTANCE_BIT_KHR".enum(0x00000002)
    )

    VkResult(
        "EnumeratePhysicalDeviceGroupsKHR",
        "See #EnumeratePhysicalDeviceGroups().",

        VkInstance("instance", "a handle to a Vulkan instance previously created with #CreateInstance()."),
        AutoSize("pPhysicalDeviceGroupProperties")..Check(1)..uint32_t.p("pPhysicalDeviceGroupCount", "a pointer to an integer related to the number of device groups available or queried, as described below."),
        nullable..VkPhysicalDeviceGroupProperties.p("pPhysicalDeviceGroupProperties", "either {@code NULL} or a pointer to an array of ##VkPhysicalDeviceGroupProperties structures.")
    )
}