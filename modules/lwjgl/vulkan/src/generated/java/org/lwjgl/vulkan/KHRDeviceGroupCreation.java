/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.vulkan;

import javax.annotation.*;

import java.nio.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.JNI.*;
import static org.lwjgl.system.MemoryUtil.*;

/**
 * This extension provides instance-level commands to enumerate groups of physical devices, and to create a logical device from a subset of one of those groups. Such a logical device can then be used with new features in the {@link KHRDeviceGroup VK_KHR_device_group} extension.
 * 
 * <h5>Promotion to Vulkan 1.1</h5>
 * 
 * <p>All functionality in this extension is included in core Vulkan 1.1, with the KHR suffix omitted. The original type, enum and command names are still available as aliases of the core functionality.</p>
 * 
 * <h5>Examples</h5>
 * 
 * <pre><code>
 *     VkDeviceCreateInfo devCreateInfo = { VK_STRUCTURE_TYPE_DEVICE_CREATE_INFO };
 *     // (not shown) fill out devCreateInfo as usual.
 *     uint32_t deviceGroupCount = 0;
 *     VkPhysicalDeviceGroupPropertiesKHR *props = NULL;
 * 
 *     // Query the number of device groups
 *     vkEnumeratePhysicalDeviceGroupsKHR(g_vkInstance, &amp;deviceGroupCount, NULL);
 * 
 *     // Allocate and initialize structures to query the device groups
 *     props = (VkPhysicalDeviceGroupPropertiesKHR *)malloc(deviceGroupCount*sizeof(VkPhysicalDeviceGroupPropertiesKHR));
 *     for (i = 0; i &lt; deviceGroupCount; ++i) {
 *         props[i].sType = VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_GROUP_PROPERTIES_KHR;
 *         props[i].pNext = NULL;
 *     }
 *     vkEnumeratePhysicalDeviceGroupsKHR(g_vkInstance, &amp;deviceGroupCount, props);
 * 
 *     // If the first device group has more than one physical device. create
 *     // a logical device using all of the physical devices.
 *     VkDeviceGroupDeviceCreateInfoKHR deviceGroupInfo = { VK_STRUCTURE_TYPE_DEVICE_GROUP_DEVICE_CREATE_INFO_KHR };
 *     if (props[0].physicalDeviceCount &gt; 1) {
 *         deviceGroupInfo.physicalDeviceCount = props[0].physicalDeviceCount;
 *         deviceGroupInfo.pPhysicalDevices = props[0].physicalDevices;
 *         devCreateInfo.pNext = &amp;deviceGroupInfo;
 *     }
 * 
 *     vkCreateDevice(props[0].physicalDevices[0], &amp;devCreateInfo, NULL, &amp;g_vkDevice);
 *     free(props);</code></pre>
 * 
 * <h5>VK_KHR_device_group_creation</h5>
 * 
 * <dl>
 * <dt><b>Name String</b></dt>
 * <dd>{@code VK_KHR_device_group_creation}</dd>
 * <dt><b>Extension Type</b></dt>
 * <dd>Instance extension</dd>
 * <dt><b>Registered Extension Number</b></dt>
 * <dd>71</dd>
 * <dt><b>Revision</b></dt>
 * <dd>1</dd>
 * <dt><b>Extension and Version Dependencies</b></dt>
 * <dd><ul>
 * <li>Requires Vulkan 1.0</li>
 * </ul></dd>
 * <dt><b>Deprecation state</b></dt>
 * <dd><ul>
 * <li><em>Promoted</em> to <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#versions-1.1-promotions">Vulkan 1.1</a></li>
 * </ul></dd>
 * <dt><b>Contact</b></dt>
 * <dd><ul>
 * <li>Jeff Bolz <a target="_blank" href="https://github.com/KhronosGroup/Vulkan-Docs/issues/new?body=[VK_KHR_device_group_creation]%20@jeffbolznv%250A%3C%3CHere%20describe%20the%20issue%20or%20question%20you%20have%20about%20the%20VK_KHR_device_group_creation%20extension%3E%3E">jeffbolznv</a></li>
 * </ul></dd>
 * </dl>
 * 
 * <h5>Other Extension Metadata</h5>
 * 
 * <dl>
 * <dt><b>Last Modified Date</b></dt>
 * <dd>2016-10-19</dd>
 * <dt><b>IP Status</b></dt>
 * <dd>No known IP claims.</dd>
 * <dt><b>Interactions and External Dependencies</b></dt>
 * <dd><ul>
 * <li>Promoted to Vulkan 1.1 Core</li>
 * </ul></dd>
 * <dt><b>Contributors</b></dt>
 * <dd><ul>
 * <li>Jeff Bolz, NVIDIA</li>
 * </ul></dd>
 * </dl>
 */
public class KHRDeviceGroupCreation {

    /** The extension specification version. */
    public static final int VK_KHR_DEVICE_GROUP_CREATION_SPEC_VERSION = 1;

    /** The extension name. */
    public static final String VK_KHR_DEVICE_GROUP_CREATION_EXTENSION_NAME = "VK_KHR_device_group_creation";

    /**
     * Extends {@code VkStructureType}.
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_GROUP_PROPERTIES_KHR STRUCTURE_TYPE_PHYSICAL_DEVICE_GROUP_PROPERTIES_KHR}</li>
     * <li>{@link #VK_STRUCTURE_TYPE_DEVICE_GROUP_DEVICE_CREATE_INFO_KHR STRUCTURE_TYPE_DEVICE_GROUP_DEVICE_CREATE_INFO_KHR}</li>
     * </ul>
     */
    public static final int
        VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_GROUP_PROPERTIES_KHR = 1000070000,
        VK_STRUCTURE_TYPE_DEVICE_GROUP_DEVICE_CREATE_INFO_KHR  = 1000070001;

    /** VK_MAX_DEVICE_GROUP_SIZE_KHR */
    public static final int VK_MAX_DEVICE_GROUP_SIZE_KHR = 32;

    /** Extends {@code VkMemoryHeapFlagBits}. */
    public static final int VK_MEMORY_HEAP_MULTI_INSTANCE_BIT_KHR = 0x2;

    protected KHRDeviceGroupCreation() {
        throw new UnsupportedOperationException();
    }

    // --- [ vkEnumeratePhysicalDeviceGroupsKHR ] ---

    /**
     * Unsafe version of: {@link #vkEnumeratePhysicalDeviceGroupsKHR EnumeratePhysicalDeviceGroupsKHR}
     *
     * @param pPhysicalDeviceGroupCount a pointer to an integer related to the number of device groups available or queried, as described below.
     */
    public static int nvkEnumeratePhysicalDeviceGroupsKHR(VkInstance instance, long pPhysicalDeviceGroupCount, long pPhysicalDeviceGroupProperties) {
        long __functionAddress = instance.getCapabilities().vkEnumeratePhysicalDeviceGroupsKHR;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPPPI(instance.address(), pPhysicalDeviceGroupCount, pPhysicalDeviceGroupProperties, __functionAddress);
    }

    /**
     * See {@link VK11#vkEnumeratePhysicalDeviceGroups EnumeratePhysicalDeviceGroups}.
     *
     * @param instance                       a handle to a Vulkan instance previously created with {@link VK10#vkCreateInstance CreateInstance}.
     * @param pPhysicalDeviceGroupCount      a pointer to an integer related to the number of device groups available or queried, as described below.
     * @param pPhysicalDeviceGroupProperties either {@code NULL} or a pointer to an array of {@link VkPhysicalDeviceGroupProperties} structures.
     */
    @NativeType("VkResult")
    public static int vkEnumeratePhysicalDeviceGroupsKHR(VkInstance instance, @NativeType("uint32_t *") IntBuffer pPhysicalDeviceGroupCount, @Nullable @NativeType("VkPhysicalDeviceGroupProperties *") VkPhysicalDeviceGroupProperties.Buffer pPhysicalDeviceGroupProperties) {
        if (CHECKS) {
            check(pPhysicalDeviceGroupCount, 1);
            checkSafe(pPhysicalDeviceGroupProperties, pPhysicalDeviceGroupCount.get(pPhysicalDeviceGroupCount.position()));
        }
        return nvkEnumeratePhysicalDeviceGroupsKHR(instance, memAddress(pPhysicalDeviceGroupCount), memAddressSafe(pPhysicalDeviceGroupProperties));
    }

    /** Array version of: {@link #vkEnumeratePhysicalDeviceGroupsKHR EnumeratePhysicalDeviceGroupsKHR} */
    @NativeType("VkResult")
    public static int vkEnumeratePhysicalDeviceGroupsKHR(VkInstance instance, @NativeType("uint32_t *") int[] pPhysicalDeviceGroupCount, @Nullable @NativeType("VkPhysicalDeviceGroupProperties *") VkPhysicalDeviceGroupProperties.Buffer pPhysicalDeviceGroupProperties) {
        long __functionAddress = instance.getCapabilities().vkEnumeratePhysicalDeviceGroupsKHR;
        if (CHECKS) {
            check(__functionAddress);
            check(pPhysicalDeviceGroupCount, 1);
            checkSafe(pPhysicalDeviceGroupProperties, pPhysicalDeviceGroupCount[0]);
        }
        return callPPPI(instance.address(), pPhysicalDeviceGroupCount, memAddressSafe(pPhysicalDeviceGroupProperties), __functionAddress);
    }

}