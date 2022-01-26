/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.vulkan;

import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.JNI.*;

/**
 * {@code VK_KHR_maintenance3} adds a collection of minor features that were intentionally left out or overlooked from the original Vulkan 1.0 release.
 * 
 * <p>The new features are as follows:</p>
 * 
 * <ul>
 * <li>A limit on the maximum number of descriptors that are supported in a single descriptor set layout. Some implementations have a limit on the total size of descriptors in a set, which cannot be expressed in terms of the limits in Vulkan 1.0.</li>
 * <li>A limit on the maximum size of a single memory allocation. Some platforms have kernel interfaces that limit the maximum size of an allocation.</li>
 * </ul>
 * 
 * <h5>Promotion to Vulkan 1.1</h5>
 * 
 * <p>All functionality in this extension is included in core Vulkan 1.1, with the KHR suffix omitted. The original type, enum and command names are still available as aliases of the core functionality.</p>
 * 
 * <h5>VK_KHR_maintenance3</h5>
 * 
 * <dl>
 * <dt><b>Name String</b></dt>
 * <dd>{@code VK_KHR_maintenance3}</dd>
 * <dt><b>Extension Type</b></dt>
 * <dd>Device extension</dd>
 * <dt><b>Registered Extension Number</b></dt>
 * <dd>169</dd>
 * <dt><b>Revision</b></dt>
 * <dd>1</dd>
 * <dt><b>Extension and Version Dependencies</b></dt>
 * <dd><ul>
 * <li>Requires Vulkan 1.0</li>
 * <li>Requires {@link KHRGetPhysicalDeviceProperties2 VK_KHR_get_physical_device_properties2}</li>
 * </ul></dd>
 * <dt><b>Deprecation state</b></dt>
 * <dd><ul>
 * <li><em>Promoted</em> to <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#versions-1.1-promotions">Vulkan 1.1</a></li>
 * </ul></dd>
 * <dt><b>Contact</b></dt>
 * <dd><ul>
 * <li>Jeff Bolz <a target="_blank" href="https://github.com/KhronosGroup/Vulkan-Docs/issues/new?body=[VK_KHR_maintenance3]%20@jeffbolznv%250A%3C%3CHere%20describe%20the%20issue%20or%20question%20you%20have%20about%20the%20VK_KHR_maintenance3%20extension%3E%3E">jeffbolznv</a></li>
 * </ul></dd>
 * </dl>
 * 
 * <h5>Other Extension Metadata</h5>
 * 
 * <dl>
 * <dt><b>Last Modified Date</b></dt>
 * <dd>2017-09-05</dd>
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
public class KHRMaintenance3 {

    /** The extension specification version. */
    public static final int VK_KHR_MAINTENANCE_3_SPEC_VERSION = 1;

    /** The extension name. */
    public static final String VK_KHR_MAINTENANCE_3_EXTENSION_NAME = "VK_KHR_maintenance3";

    /** The extension specification version. */
    public static final int VK_KHR_MAINTENANCE3_SPEC_VERSION = VK_KHR_MAINTENANCE_3_SPEC_VERSION;

    /** The extension name. */
    public static final String VK_KHR_MAINTENANCE3_EXTENSION_NAME = VK_KHR_MAINTENANCE_3_EXTENSION_NAME;

    /**
     * Extends {@code VkStructureType}.
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_MAINTENANCE_3_PROPERTIES_KHR STRUCTURE_TYPE_PHYSICAL_DEVICE_MAINTENANCE_3_PROPERTIES_KHR}</li>
     * <li>{@link #VK_STRUCTURE_TYPE_DESCRIPTOR_SET_LAYOUT_SUPPORT_KHR STRUCTURE_TYPE_DESCRIPTOR_SET_LAYOUT_SUPPORT_KHR}</li>
     * </ul>
     */
    public static final int
        VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_MAINTENANCE_3_PROPERTIES_KHR = 1000168000,
        VK_STRUCTURE_TYPE_DESCRIPTOR_SET_LAYOUT_SUPPORT_KHR            = 1000168001;

    protected KHRMaintenance3() {
        throw new UnsupportedOperationException();
    }

    // --- [ vkGetDescriptorSetLayoutSupportKHR ] ---

    /** Unsafe version of: {@link #vkGetDescriptorSetLayoutSupportKHR GetDescriptorSetLayoutSupportKHR} */
    public static void nvkGetDescriptorSetLayoutSupportKHR(VkDevice device, long pCreateInfo, long pSupport) {
        long __functionAddress = device.getCapabilities().vkGetDescriptorSetLayoutSupportKHR;
        if (CHECKS) {
            check(__functionAddress);
            VkDescriptorSetLayoutCreateInfo.validate(pCreateInfo);
        }
        callPPPV(device.address(), pCreateInfo, pSupport, __functionAddress);
    }

    /**
     * See {@link VK11#vkGetDescriptorSetLayoutSupport GetDescriptorSetLayoutSupport}.
     *
     * @param device      the logical device that would create the descriptor set layout.
     * @param pCreateInfo a pointer to a {@link VkDescriptorSetLayoutCreateInfo} structure specifying the state of the descriptor set layout object.
     * @param pSupport    a pointer to a {@link VkDescriptorSetLayoutSupport} structure, in which information about support for the descriptor set layout object is returned.
     */
    public static void vkGetDescriptorSetLayoutSupportKHR(VkDevice device, @NativeType("VkDescriptorSetLayoutCreateInfo const *") VkDescriptorSetLayoutCreateInfo pCreateInfo, @NativeType("VkDescriptorSetLayoutSupport *") VkDescriptorSetLayoutSupport pSupport) {
        nvkGetDescriptorSetLayoutSupportKHR(device, pCreateInfo.address(), pSupport.address());
    }

}