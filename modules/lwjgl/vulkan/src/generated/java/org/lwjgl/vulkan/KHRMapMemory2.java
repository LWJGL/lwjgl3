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
 * This extension provides extensible versions of the Vulkan memory map and unmap entry points. The new entry points are functionally identical to the core entry points, except that their parameters are specified using extensible structures that can be used to pass extension-specific information.
 * 
 * <h5>VK_KHR_map_memory2</h5>
 * 
 * <dl>
 * <dt><b>Name String</b></dt>
 * <dd>{@code VK_KHR_map_memory2}</dd>
 * <dt><b>Extension Type</b></dt>
 * <dd>Device extension</dd>
 * <dt><b>Registered Extension Number</b></dt>
 * <dd>272</dd>
 * <dt><b>Revision</b></dt>
 * <dd>1</dd>
 * <dt><b>Contact</b></dt>
 * <dd><ul>
 * <li>Faith Ekstrand <a href="https://github.com/KhronosGroup/Vulkan-Docs/issues/new?body=[VK_KHR_map_memory2]%20@gfxstrand%250A*Here%20describe%20the%20issue%20or%20question%20you%20have%20about%20the%20VK_KHR_map_memory2%20extension*">gfxstrand</a></li>
 * </ul></dd>
 * <dt><b>Extension Proposal</b></dt>
 * <dd><a href="https://github.com/KhronosGroup/Vulkan-Docs/tree/main/proposals/VK_KHR_map_memory2.adoc">VK_KHR_map_memory2</a></dd>
 * </dl>
 * 
 * <h5>Other Extension Metadata</h5>
 * 
 * <dl>
 * <dt><b>Last Modified Date</b></dt>
 * <dd>2023-03-14</dd>
 * <dt><b>Interactions and External Dependencies</b></dt>
 * <dd><ul>
 * <li>None</li>
 * </ul></dd>
 * <dt><b>Contributors</b></dt>
 * <dd><ul>
 * <li>Faith Ekstrand, Collabora</li>
 * <li>Tobias Hector, AMD</li>
 * </ul></dd>
 * </dl>
 */
public class KHRMapMemory2 {

    /** The extension specification version. */
    public static final int VK_KHR_MAP_MEMORY_2_SPEC_VERSION = 1;

    /** The extension name. */
    public static final String VK_KHR_MAP_MEMORY_2_EXTENSION_NAME = "VK_KHR_map_memory2";

    /**
     * Extends {@code VkStructureType}.
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #VK_STRUCTURE_TYPE_MEMORY_MAP_INFO_KHR STRUCTURE_TYPE_MEMORY_MAP_INFO_KHR}</li>
     * <li>{@link #VK_STRUCTURE_TYPE_MEMORY_UNMAP_INFO_KHR STRUCTURE_TYPE_MEMORY_UNMAP_INFO_KHR}</li>
     * </ul>
     */
    public static final int
        VK_STRUCTURE_TYPE_MEMORY_MAP_INFO_KHR   = 1000271000,
        VK_STRUCTURE_TYPE_MEMORY_UNMAP_INFO_KHR = 1000271001;

    protected KHRMapMemory2() {
        throw new UnsupportedOperationException();
    }

    // --- [ vkMapMemory2KHR ] ---

    /** Unsafe version of: {@link #vkMapMemory2KHR MapMemory2KHR} */
    public static int nvkMapMemory2KHR(VkDevice device, long pMemoryMapInfo, long ppData) {
        long __functionAddress = device.getCapabilities().vkMapMemory2KHR;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPPPI(device.address(), pMemoryMapInfo, ppData, __functionAddress);
    }

    /**
     * Map a memory object into application address space.
     * 
     * <h5>C Specification</h5>
     * 
     * <p>Alternatively, to retrieve a host virtual address pointer to a region of a mappable memory object, call:</p>
     * 
     * <pre><code>
     * VkResult vkMapMemory2KHR(
     *     VkDevice                                    device,
     *     const VkMemoryMapInfoKHR*                   pMemoryMapInfo,
     *     void**                                      ppData);</code></pre>
     * 
     * <h5>Description</h5>
     * 
     * <p>This function behaves identically to {@link VK10#vkMapMemory MapMemory} except that it gets its parameters via an extensible structure pointer rather than directly as function arguments.</p>
     * 
     * <h5>Valid Usage (Implicit)</h5>
     * 
     * <ul>
     * <li>{@code device} <b>must</b> be a valid {@code VkDevice} handle</li>
     * <li>{@code pMemoryMapInfo} <b>must</b> be a valid pointer to a valid {@link VkMemoryMapInfoKHR} structure</li>
     * <li>{@code ppData} <b>must</b> be a valid pointer to a pointer value</li>
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
     * <li>{@link VK10#VK_ERROR_OUT_OF_HOST_MEMORY ERROR_OUT_OF_HOST_MEMORY}</li>
     * <li>{@link VK10#VK_ERROR_OUT_OF_DEVICE_MEMORY ERROR_OUT_OF_DEVICE_MEMORY}</li>
     * <li>{@link VK10#VK_ERROR_MEMORY_MAP_FAILED ERROR_MEMORY_MAP_FAILED}</li>
     * </ul></dd>
     * </dl>
     * 
     * <h5>See Also</h5>
     * 
     * <p>{@link VkMemoryMapInfoKHR}</p>
     *
     * @param device         the logical device that owns the memory.
     * @param pMemoryMapInfo a pointer to a {@link VkMemoryMapInfoKHR} structure describing parameters of the map.
     * @param ppData         a pointer to a {@code void *} variable in which is returned a host-accessible pointer to the beginning of the mapped range. This pointer minus {@link VkMemoryMapInfoKHR}{@code ::offset} <b>must</b> be aligned to at least {@link VkPhysicalDeviceLimits}{@code ::minMemoryMapAlignment}.
     */
    @NativeType("VkResult")
    public static int vkMapMemory2KHR(VkDevice device, @NativeType("VkMemoryMapInfoKHR const *") VkMemoryMapInfoKHR pMemoryMapInfo, @NativeType("void **") PointerBuffer ppData) {
        if (CHECKS) {
            check(ppData, 1);
        }
        return nvkMapMemory2KHR(device, pMemoryMapInfo.address(), memAddress(ppData));
    }

    // --- [ vkUnmapMemory2KHR ] ---

    /** Unsafe version of: {@link #vkUnmapMemory2KHR UnmapMemory2KHR} */
    public static int nvkUnmapMemory2KHR(VkDevice device, long pMemoryUnmapInfo) {
        long __functionAddress = device.getCapabilities().vkUnmapMemory2KHR;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPPI(device.address(), pMemoryUnmapInfo, __functionAddress);
    }

    /**
     * Unmap a previously mapped memory object.
     * 
     * <h5>C Specification</h5>
     * 
     * <p>Alternatively, to unmap a memory object once host access to it is no longer needed by the application, call:</p>
     * 
     * <pre><code>
     * VkResult vkUnmapMemory2KHR(
     *     VkDevice                                    device,
     *     const VkMemoryUnmapInfoKHR*                 pMemoryUnmapInfo);</code></pre>
     * 
     * <h5>Description</h5>
     * 
     * <p>This function behaves identically to {@link VK10#vkUnmapMemory UnmapMemory} except that it gets its parameters via an extensible structure pointer rather than directly as function arguments.</p>
     * 
     * <h5>Valid Usage (Implicit)</h5>
     * 
     * <ul>
     * <li>{@code device} <b>must</b> be a valid {@code VkDevice} handle</li>
     * <li>{@code pMemoryUnmapInfo} <b>must</b> be a valid pointer to a valid {@link VkMemoryUnmapInfoKHR} structure</li>
     * </ul>
     * 
     * <h5>Return Codes</h5>
     * 
     * <dl>
     * <dt>On success, this command returns</dt>
     * <dd><ul>
     * <li>{@link VK10#VK_SUCCESS SUCCESS}</li>
     * </ul></dd>
     * </dl>
     * 
     * <h5>See Also</h5>
     * 
     * <p>{@link VkMemoryUnmapInfoKHR}</p>
     *
     * @param device           the logical device that owns the memory.
     * @param pMemoryUnmapInfo a pointer to a {@link VkMemoryUnmapInfoKHR} structure describing parameters of the unmap.
     */
    @NativeType("VkResult")
    public static int vkUnmapMemory2KHR(VkDevice device, @NativeType("VkMemoryUnmapInfoKHR const *") VkMemoryUnmapInfoKHR pMemoryUnmapInfo) {
        return nvkUnmapMemory2KHR(device, pMemoryUnmapInfo.address());
    }

}