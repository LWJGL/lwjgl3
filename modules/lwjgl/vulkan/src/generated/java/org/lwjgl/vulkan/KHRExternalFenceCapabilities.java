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
 * An application may wish to reference device fences in multiple Vulkan logical devices or instances, in multiple processes, and/or in multiple APIs. This extension provides a set of capability queries and handle definitions that allow an application to determine what types of "{@code external}" fence handles an implementation supports for a given set of use cases.
 * 
 * <h5>Promotion to Vulkan 1.1</h5>
 * 
 * <p>All functionality in this extension is included in core Vulkan 1.1, with the KHR suffix omitted. The original type, enum and command names are still available as aliases of the core functionality.</p>
 * 
 * <h5>VK_KHR_external_fence_capabilities</h5>
 * 
 * <dl>
 * <dt><b>Name String</b></dt>
 * <dd>{@code VK_KHR_external_fence_capabilities}</dd>
 * <dt><b>Extension Type</b></dt>
 * <dd>Instance extension</dd>
 * <dt><b>Registered Extension Number</b></dt>
 * <dd>113</dd>
 * <dt><b>Revision</b></dt>
 * <dd>1</dd>
 * <dt><b>Extension and Version Dependencies</b></dt>
 * <dd><ul>
 * <li>Requires Vulkan 1.0</li>
 * <li>Requires {@link KHRGetPhysicalDeviceProperties2 VK_KHR_get_physical_device_properties2}</li>
 * </ul></dd>
 * <dt><b>Deprecation state</b></dt>
 * <dd><ul>
 * <li><em>Promoted</em> to <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html#versions-1.1-promotions">Vulkan 1.1</a></li>
 * </ul></dd>
 * <dt><b>Contact</b></dt>
 * <dd><ul>
 * <li>Jesse Hall <a target="_blank" href="https://github.com/KhronosGroup/Vulkan-Docs/issues/new?title=VK_KHR_external_fence_capabilities:%20&amp;body=@critsec%20">critsec</a></li>
 * </ul></dd>
 * </dl>
 * 
 * <h5>Other Extension Metadata</h5>
 * 
 * <dl>
 * <dt><b>Last Modified Date</b></dt>
 * <dd>2017-05-08</dd>
 * <dt><b>IP Status</b></dt>
 * <dd>No known IP claims.</dd>
 * <dt><b>Interactions and External Dependencies</b></dt>
 * <dd><ul>
 * <li>Promoted to Vulkan 1.1 Core</li>
 * </ul></dd>
 * <dt><b>Contributors</b></dt>
 * <dd><ul>
 * <li>Jesse Hall, Google</li>
 * <li>James Jones, NVIDIA</li>
 * <li>Jeff Juliano, NVIDIA</li>
 * <li>Cass Everitt, Oculus</li>
 * <li>Contributors to {@link KHRExternalSemaphoreCapabilities VK_KHR_external_semaphore_capabilities}</li>
 * </ul></dd>
 * </dl>
 */
public class KHRExternalFenceCapabilities {

    /** The extension specification version. */
    public static final int VK_KHR_EXTERNAL_FENCE_CAPABILITIES_SPEC_VERSION = 1;

    /** The extension name. */
    public static final String VK_KHR_EXTERNAL_FENCE_CAPABILITIES_EXTENSION_NAME = "VK_KHR_external_fence_capabilities";

    /**
     * Extends {@code VkStructureType}.
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_EXTERNAL_FENCE_INFO_KHR STRUCTURE_TYPE_PHYSICAL_DEVICE_EXTERNAL_FENCE_INFO_KHR}</li>
     * <li>{@link #VK_STRUCTURE_TYPE_EXTERNAL_FENCE_PROPERTIES_KHR STRUCTURE_TYPE_EXTERNAL_FENCE_PROPERTIES_KHR}</li>
     * <li>{@link #VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_ID_PROPERTIES_KHR STRUCTURE_TYPE_PHYSICAL_DEVICE_ID_PROPERTIES_KHR}</li>
     * </ul>
     */
    public static final int
        VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_EXTERNAL_FENCE_INFO_KHR = 1000112000,
        VK_STRUCTURE_TYPE_EXTERNAL_FENCE_PROPERTIES_KHR           = 1000112001,
        VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_ID_PROPERTIES_KHR       = 1000071004;

    /** VK_LUID_SIZE_KHR */
    public static final int VK_LUID_SIZE_KHR = 8;

    /**
     * Extends {@code VkExternalFenceHandleTypeFlagBits}.
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #VK_EXTERNAL_FENCE_HANDLE_TYPE_OPAQUE_FD_BIT_KHR EXTERNAL_FENCE_HANDLE_TYPE_OPAQUE_FD_BIT_KHR}</li>
     * <li>{@link #VK_EXTERNAL_FENCE_HANDLE_TYPE_OPAQUE_WIN32_BIT_KHR EXTERNAL_FENCE_HANDLE_TYPE_OPAQUE_WIN32_BIT_KHR}</li>
     * <li>{@link #VK_EXTERNAL_FENCE_HANDLE_TYPE_OPAQUE_WIN32_KMT_BIT_KHR EXTERNAL_FENCE_HANDLE_TYPE_OPAQUE_WIN32_KMT_BIT_KHR}</li>
     * <li>{@link #VK_EXTERNAL_FENCE_HANDLE_TYPE_SYNC_FD_BIT_KHR EXTERNAL_FENCE_HANDLE_TYPE_SYNC_FD_BIT_KHR}</li>
     * </ul>
     */
    public static final int
        VK_EXTERNAL_FENCE_HANDLE_TYPE_OPAQUE_FD_BIT_KHR        = 0x1,
        VK_EXTERNAL_FENCE_HANDLE_TYPE_OPAQUE_WIN32_BIT_KHR     = 0x2,
        VK_EXTERNAL_FENCE_HANDLE_TYPE_OPAQUE_WIN32_KMT_BIT_KHR = 0x4,
        VK_EXTERNAL_FENCE_HANDLE_TYPE_SYNC_FD_BIT_KHR          = 0x8;

    /**
     * Extends {@code VkExternalFenceFeatureFlagBits}.
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #VK_EXTERNAL_FENCE_FEATURE_EXPORTABLE_BIT_KHR EXTERNAL_FENCE_FEATURE_EXPORTABLE_BIT_KHR}</li>
     * <li>{@link #VK_EXTERNAL_FENCE_FEATURE_IMPORTABLE_BIT_KHR EXTERNAL_FENCE_FEATURE_IMPORTABLE_BIT_KHR}</li>
     * </ul>
     */
    public static final int
        VK_EXTERNAL_FENCE_FEATURE_EXPORTABLE_BIT_KHR = 0x1,
        VK_EXTERNAL_FENCE_FEATURE_IMPORTABLE_BIT_KHR = 0x2;

    protected KHRExternalFenceCapabilities() {
        throw new UnsupportedOperationException();
    }

    // --- [ vkGetPhysicalDeviceExternalFencePropertiesKHR ] ---

    /** Unsafe version of: {@link #vkGetPhysicalDeviceExternalFencePropertiesKHR GetPhysicalDeviceExternalFencePropertiesKHR} */
    public static void nvkGetPhysicalDeviceExternalFencePropertiesKHR(VkPhysicalDevice physicalDevice, long pExternalFenceInfo, long pExternalFenceProperties) {
        long __functionAddress = physicalDevice.getCapabilities().vkGetPhysicalDeviceExternalFencePropertiesKHR;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPPPV(physicalDevice.address(), pExternalFenceInfo, pExternalFenceProperties, __functionAddress);
    }

    /**
     * See {@link VK11#vkGetPhysicalDeviceExternalFenceProperties GetPhysicalDeviceExternalFenceProperties}.
     *
     * @param physicalDevice           the physical device from which to query the fence capabilities.
     * @param pExternalFenceInfo       a pointer to a {@link VkPhysicalDeviceExternalFenceInfo} structure describing the parameters that would be consumed by {@link VK10#vkCreateFence CreateFence}.
     * @param pExternalFenceProperties a pointer to a {@link VkExternalFenceProperties} structure in which capabilities are returned.
     */
    public static void vkGetPhysicalDeviceExternalFencePropertiesKHR(VkPhysicalDevice physicalDevice, @NativeType("VkPhysicalDeviceExternalFenceInfo const *") VkPhysicalDeviceExternalFenceInfo pExternalFenceInfo, @NativeType("VkExternalFenceProperties *") VkExternalFenceProperties pExternalFenceProperties) {
        nvkGetPhysicalDeviceExternalFencePropertiesKHR(physicalDevice, pExternalFenceInfo.address(), pExternalFenceProperties.address());
    }

}