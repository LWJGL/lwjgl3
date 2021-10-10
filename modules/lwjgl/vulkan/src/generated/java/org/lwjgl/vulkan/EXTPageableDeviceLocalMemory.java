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
 * Vulkan is frequently implemented on multi-user and multi-process operating systems where the device-local memory can be shared by more than one process. On such systems the size of the device-local memory available to the application may not be the full size of the memory heap at all times. In order for these operating systems to support multiple applications the device-local memory is virtualized and paging is used to move memory between device-local and host-local memory heaps, transparent to the application.
 * 
 * <p>The current Vulkan specification does not expose this behavior well and may cause applications to make suboptimal memory choices when allocating memory. For example, in a system with multiple applications running, the application may think that device-local memory is full and revert to making performance-sensitive allocations from host-local memory. In reality the memory heap might not have been full, it just appeared to be at the time memory consumption was queried, and a device-local allocation would have succeeded. A well designed operating system that implements pageable device-local memory will try to have all memory allocations for the foreground application paged into device-local memory, and paged out for other applications as needed when not in use.</p>
 * 
 * <p>When this extension is exposed by the Vulkan implementation it indicates to the application that the operating system implements pageable device-local memory and the application should adjust its memory allocation strategy accordingly. The extension also exposes a new {@link #vkSetDeviceMemoryPriorityEXT SetDeviceMemoryPriorityEXT} function to allow the application to dynamically adjust the priority of existing memory allocations based on its current needs. This will help the operating system page out lower priority memory allocations before higher priority allocations when needed. It will also help the operating system decide which memory allocations to page back into device-local memory first.</p>
 * 
 * <p>To take best advantage of pageable device-local memory the application must create the Vulkan device with the {@link VkPhysicalDevicePageableDeviceLocalMemoryFeaturesEXT}{@code ::pageableDeviceLocalMemory} feature enabled. When enabled the Vulkan implementation will allow device-local memory allocations to be paged in and out by the operating system, and <b>may</b> not return VK_ERROR_OUT_OF_DEVICE_MEMORY even if device-local memory appears to be full, but will instead page this, or other allocations, out to make room. The Vulkan implementation will also ensure that host-local memory allocations will never be promoted to device-local memory by the operating system, or consume device-local memory.</p>
 * 
 * <h5>VK_EXT_pageable_device_local_memory</h5>
 * 
 * <dl>
 * <dt><b>Name String</b></dt>
 * <dd>{@code VK_EXT_pageable_device_local_memory}</dd>
 * <dt><b>Extension Type</b></dt>
 * <dd>Device extension</dd>
 * <dt><b>Registered Extension Number</b></dt>
 * <dd>413</dd>
 * <dt><b>Revision</b></dt>
 * <dd>1</dd>
 * <dt><b>Extension and Version Dependencies</b></dt>
 * <dd><ul>
 * <li>Requires Vulkan 1.0</li>
 * <li>Requires {@link EXTMemoryPriority VK_EXT_memory_priority}</li>
 * </ul></dd>
 * <dt><b>Contact</b></dt>
 * <dd><ul>
 * <li>Piers Daniell <a target="_blank" href="https://github.com/KhronosGroup/Vulkan-Docs/issues/new?body=[VK_EXT_pageable_device_local_memory]%20@pdaniell-nv%250A%3C%3CHere%20describe%20the%20issue%20or%20question%20you%20have%20about%20the%20VK_EXT_pageable_device_local_memory%20extension%3E%3E">pdaniell-nv</a></li>
 * </ul></dd>
 * </dl>
 * 
 * <h5>Other Extension Metadata</h5>
 * 
 * <dl>
 * <dt><b>Last Modified Date</b></dt>
 * <dd>2021-08-24</dd>
 * <dt><b>Contributors</b></dt>
 * <dd><ul>
 * <li>Hans-Kristian Arntzen, Valve</li>
 * <li>Axel Gneiting, id Software</li>
 * <li>Billy Khan, id Software</li>
 * <li>Daniel Koch, NVIDIA</li>
 * <li>Chris Lentini, NVIDIA</li>
 * <li>Joshua Schnarr, NVIDIA</li>
 * <li>Stu Smith, AMD</li>
 * </ul></dd>
 * </dl>
 */
public class EXTPageableDeviceLocalMemory {

    /** The extension specification version. */
    public static final int VK_EXT_PAGEABLE_DEVICE_LOCAL_MEMORY_SPEC_VERSION = 1;

    /** The extension name. */
    public static final String VK_EXT_PAGEABLE_DEVICE_LOCAL_MEMORY_EXTENSION_NAME = "VK_EXT_pageable_device_local_memory";

    /** Extends {@code VkStructureType}. */
    public static final int VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_PAGEABLE_DEVICE_LOCAL_MEMORY_FEATURES_EXT = 1000412000;

    protected EXTPageableDeviceLocalMemory() {
        throw new UnsupportedOperationException();
    }

    // --- [ vkSetDeviceMemoryPriorityEXT ] ---

    /**
     * Change a memory allocation priority.
     * 
     * <h5>C Specification</h5>
     * 
     * <p>To modify the priority of an existing memory allocation, call:</p>
     * 
     * <pre><code>
     * void vkSetDeviceMemoryPriorityEXT(
     *     VkDevice                                    device,
     *     VkDeviceMemory                              memory,
     *     float                                       priority);</code></pre>
     * 
     * <h5>Description</h5>
     * 
     * <p>Memory allocations with higher priority <b>may</b> be more likely to stay in device-local memory when the system is under memory pressure.</p>
     * 
     * <h5>Valid Usage</h5>
     * 
     * <ul>
     * <li>{@code priority} <b>must</b> be between 0 and 1, inclusive</li>
     * </ul>
     * 
     * <h5>Valid Usage (Implicit)</h5>
     * 
     * <ul>
     * <li>{@code device} <b>must</b> be a valid {@code VkDevice} handle</li>
     * <li>{@code memory} <b>must</b> be a valid {@code VkDeviceMemory} handle</li>
     * <li>{@code memory} <b>must</b> have been created, allocated, or retrieved from {@code device}</li>
     * </ul>
     *
     * @param device   the logical device that owns the memory.
     * @param memory   the {@code VkDeviceMemory} object to which the new priority will be applied.
     * @param priority a floating-point value between 0 and 1, indicating the priority of the allocation relative to other memory allocations. Larger values are higher priority. The granularity of the priorities is implementation-dependent.
     */
    public static void vkSetDeviceMemoryPriorityEXT(VkDevice device, @NativeType("VkDeviceMemory") long memory, float priority) {
        long __functionAddress = device.getCapabilities().vkSetDeviceMemoryPriorityEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPJV(device.address(), memory, priority, __functionAddress);
    }

}