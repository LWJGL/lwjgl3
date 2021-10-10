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

/**
 * This extension adds support for allocating memory which can be used for remote direct memory access (RDMA) from other devices.
 * 
 * <h5>Examples</h5>
 * 
 * <pre><code>
 * VkPhysicalDeviceMemoryBudgetPropertiesEXT memoryBudgetProperties = { VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_MEMORY_BUDGET_PROPERTIES_EXT };
 * VkPhysicalDeviceMemoryProperties2 memoryProperties2 = { VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_MEMORY_PROPERTIES_2, &amp;memoryBudgetProperties };
 * vkGetPhysicalDeviceMemoryProperties2(physicalDevice, &amp;memoryProperties2);
 * uint32_t heapIndex = (uint32_t)-1;
 * for (uint32_t memoryType = 0; memoryType &lt; memoryProperties2.memoryProperties.memoryTypeCount; memoryType++) {
 *     if (memoryProperties2.memoryProperties.memoryTypes[memoryType].propertyFlags &amp; VK_MEMORY_PROPERTY_RDMA_CAPABLE_BIT_NV) {
 *         heapIndex = memoryProperties2.memoryProperties.memoryTypes[memoryType].heapIndex;
 *         break;
 *     }
 * }
 * if ((heapIndex == (uint32_t)-1) ||
 *     (memoryBudgetProperties.heapBudget[heapIndex] &lt; size)) {
 *     return;
 * }
 * 
 * VkPhysicalDeviceExternalBufferInfo externalBufferInfo = { VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_EXTERNAL_BUFFER_INFO };
 * externalBufferInfo.usage = VK_BUFFER_USAGE_TRANSFER_SRC_BIT | VK_BUFFER_USAGE_TRANSFER_DST_BIT;
 * externalBufferInfo.handleType = VK_EXTERNAL_MEMORY_HANDLE_TYPE_RDMA_ADDRESS_BIT_NV;
 * 
 * VkExternalBufferProperties externalBufferProperties = { VK_STRUCTURE_TYPE_EXTERNAL_BUFFER_PROPERTIES };
 * vkGetPhysicalDeviceExternalBufferProperties(physicalDevice, &amp;externalBufferInfo, &amp;externalBufferProperties);
 * 
 * if (!(externalBufferProperties.externalMemoryProperties.externalMemoryFeatures &amp; VK_EXTERNAL_MEMORY_FEATURE_EXPORTABLE_BIT)) {
 *     return;
 * }
 * 
 * VkExternalMemoryBufferCreateInfo externalMemoryBufferCreateInfo = { VK_STRUCTURE_TYPE_EXTERNAL_MEMORY_BUFFER_CREATE_INFO };
 * externalMemoryBufferCreateInfo.handleTypes = VK_EXTERNAL_MEMORY_HANDLE_TYPE_RDMA_ADDRESS_BIT_NV;
 * 
 * VkBufferCreateInfo bufferCreateInfo = { VK_STRUCTURE_TYPE_BUFFER_CREATE_INFO, &amp;externalMemoryBufferCreateInfo };
 * bufferCreateInfo.size = size;
 * bufferCreateInfo.usage = VK_BUFFER_USAGE_TRANSFER_SRC_BIT | VK_BUFFER_USAGE_TRANSFER_DST_BIT;
 * 
 * VkMemoryRequirements mem_reqs;
 * vkCreateBuffer(device, &amp;bufferCreateInfo, NULL, &amp;buffer);
 * vkGetBufferMemoryRequirements(device, buffer, &amp;mem_reqs);
 * 
 * VkExportMemoryAllocateInfo exportMemoryAllocateInfo = { VK_STRUCTURE_TYPE_EXPORT_MEMORY_ALLOCATE_INFO };
 * exportMemoryAllocateInfo.handleTypes = VK_EXTERNAL_MEMORY_HANDLE_TYPE_RDMA_ADDRESS_BIT_NV;
 * 
 * // Find memory type index
 * uint32_t i = 0;
 * for (; i &lt; VK_MAX_MEMORY_TYPES; i++) {
 *     if ((mem_reqs.memoryTypeBits &amp; (1 &lt;&lt; i)) &amp;&amp;
 *         (memoryProperties.memoryTypes[i].propertyFlags &amp; VK_MEMORY_PROPERTY_RDMA_CAPABLE_BIT_NV)) {
 *         break;
 *     }
 * }
 * 
 * VkMemoryAllocateInfo memAllocInfo = { VK_STRUCTURE_TYPE_MEMORY_ALLOCATE_INFO, &amp;exportMemoryAllocateInfo };
 * memAllocInfo.allocationSize = mem_reqs.size;
 * memAllocInfo.memoryTypeIndex = i;
 * 
 * vkAllocateMemory(device, &amp;memAllocInfo, NULL, &amp;mem);
 * vkBindBufferMemory(device, buffer, mem, 0);
 * 
 * VkMemoryGetRemoteAddressInfoNV getMemoryRemoteAddressInfo = { VK_STRUCTURE_TYPE_MEMORY_GET_REMOTE_ADDRESS_INFO_NV };
 * getMemoryRemoteAddressInfo.memory = mem;
 * getMemoryRemoteAddressInfo.handleType = VK_EXTERNAL_MEMORY_HANDLE_TYPE_RDMA_ADDRESS_BIT_NV;
 * 
 * VkRemoteAddressNV rdmaAddress;
 * vkGetMemoryRemoteAddressNV(device, &amp;getMemoryRemoteAddressInfo, &amp;rdmaAddress);
 * // address returned in 'rdmaAddress' can be used by external devices to initiate RDMA transfers</code></pre>
 * 
 * <h5>VK_NV_external_memory_rdma</h5>
 * 
 * <dl>
 * <dt><b>Name String</b></dt>
 * <dd>{@code VK_NV_external_memory_rdma}</dd>
 * <dt><b>Extension Type</b></dt>
 * <dd>Device extension</dd>
 * <dt><b>Registered Extension Number</b></dt>
 * <dd>372</dd>
 * <dt><b>Revision</b></dt>
 * <dd>1</dd>
 * <dt><b>Extension and Version Dependencies</b></dt>
 * <dd><ul>
 * <li>Requires Vulkan 1.0</li>
 * <li>Requires {@link KHRExternalMemory VK_KHR_external_memory}</li>
 * </ul></dd>
 * <dt><b>Contact</b></dt>
 * <dd><ul>
 * <li>Carsten Rohde <a target="_blank" href="https://github.com/KhronosGroup/Vulkan-Docs/issues/new?body=[VK_NV_external_memory_rdma]%20@crohde%250A%3C%3CHere%20describe%20the%20issue%20or%20question%20you%20have%20about%20the%20VK_NV_external_memory_rdma%20extension%3E%3E">crohde</a></li>
 * </ul></dd>
 * </dl>
 * 
 * <h5>Other Extension Metadata</h5>
 * 
 * <dl>
 * <dt><b>Last Modified Date</b></dt>
 * <dd>2021-04-19</dd>
 * <dt><b>IP Status</b></dt>
 * <dd>No known IP claims.</dd>
 * <dt><b>Contributors</b></dt>
 * <dd><ul>
 * <li>Carsten Rohde, NVIDIA</li>
 * </ul></dd>
 * </dl>
 */
public class NVExternalMemoryRdma {

    /** The extension specification version. */
    public static final int VK_NV_EXTERNAL_MEMORY_RDMA_SPEC_VERSION = 1;

    /** The extension name. */
    public static final String VK_NV_EXTERNAL_MEMORY_RDMA_EXTENSION_NAME = "VK_NV_external_memory_rdma";

    /**
     * Extends {@code VkStructureType}.
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #VK_STRUCTURE_TYPE_MEMORY_GET_REMOTE_ADDRESS_INFO_NV STRUCTURE_TYPE_MEMORY_GET_REMOTE_ADDRESS_INFO_NV}</li>
     * <li>{@link #VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_EXTERNAL_MEMORY_RDMA_FEATURES_NV STRUCTURE_TYPE_PHYSICAL_DEVICE_EXTERNAL_MEMORY_RDMA_FEATURES_NV}</li>
     * </ul>
     */
    public static final int
        VK_STRUCTURE_TYPE_MEMORY_GET_REMOTE_ADDRESS_INFO_NV                = 1000371000,
        VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_EXTERNAL_MEMORY_RDMA_FEATURES_NV = 1000371001;

    /** Extends {@code VkMemoryPropertyFlagBits}. */
    public static final int VK_MEMORY_PROPERTY_RDMA_CAPABLE_BIT_NV = 0x100;

    /** Extends {@code VkExternalMemoryHandleTypeFlagBits}. */
    public static final int VK_EXTERNAL_MEMORY_HANDLE_TYPE_RDMA_ADDRESS_BIT_NV = 0x1000;

    protected NVExternalMemoryRdma() {
        throw new UnsupportedOperationException();
    }

    // --- [ vkGetMemoryRemoteAddressNV ] ---

    /** Unsafe version of: {@link #vkGetMemoryRemoteAddressNV GetMemoryRemoteAddressNV} */
    public static int nvkGetMemoryRemoteAddressNV(VkDevice device, long pMemoryGetRemoteAddressInfo, long pAddress) {
        long __functionAddress = device.getCapabilities().vkGetMemoryRemoteAddressNV;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPPPI(device.address(), pMemoryGetRemoteAddressInfo, pAddress, __functionAddress);
    }

    /**
     * Get an address for a memory object accessible by remote devices.
     * 
     * <h5>C Specification</h5>
     * 
     * <p>To export an address representing the payload of a Vulkan device memory object accessible by remote devices, call:</p>
     * 
     * <pre><code>
     * VkResult vkGetMemoryRemoteAddressNV(
     *     VkDevice                                    device,
     *     const VkMemoryGetRemoteAddressInfoNV*       pMemoryGetRemoteAddressInfo,
     *     VkRemoteAddressNV*                          pAddress);</code></pre>
     * 
     * <h5>Description</h5>
     * 
     * <p>More communication may be required between the kernel-mode drivers of the devices involved. This information is out of scope of this documentation and should be requested from the vendors of the devices.</p>
     * 
     * <h5>Valid Usage (Implicit)</h5>
     * 
     * <ul>
     * <li>{@code device} <b>must</b> be a valid {@code VkDevice} handle</li>
     * <li>{@code pMemoryGetRemoteAddressInfo} <b>must</b> be a valid pointer to a valid {@link VkMemoryGetRemoteAddressInfoNV} structure</li>
     * <li>{@code pAddress} <b>must</b> be a valid pointer to a {@code VkRemoteAddressNV} value</li>
     * </ul>
     * 
     * <h5>Return Codes</h5>
     * 
     * <dl>
     * <dt>On success, this command returns</dt>
     * <dd><ul>
     * <li>{@link VK10#VK_SUCCESS SUCCESS}</li>
     * </ul></dd>
     * <dt>On failure, this command returns</dt>
     * <dd><ul>
     * <li>{@link VK11#VK_ERROR_INVALID_EXTERNAL_HANDLE ERROR_INVALID_EXTERNAL_HANDLE}</li>
     * </ul></dd>
     * </dl>
     * 
     * <h5>See Also</h5>
     * 
     * <p>{@link VkMemoryGetRemoteAddressInfoNV}</p>
     *
     * @param device                      the logical device that created the device memory being exported.
     * @param pMemoryGetRemoteAddressInfo a pointer to a {@link VkMemoryGetRemoteAddressInfoNV} structure containing parameters of the export operation.
     * @param pAddress                    will return the address representing the payload of the device memory object.
     */
    @NativeType("VkResult")
    public static int vkGetMemoryRemoteAddressNV(VkDevice device, @NativeType("VkMemoryGetRemoteAddressInfoNV const *") VkMemoryGetRemoteAddressInfoNV pMemoryGetRemoteAddressInfo, @NativeType("VkRemoteAddressNV *") PointerBuffer pAddress) {
        if (CHECKS) {
            check(pAddress, 1);
        }
        return nvkGetMemoryRemoteAddressNV(device, pMemoryGetRemoteAddressInfo.address(), memAddress(pAddress));
    }

}