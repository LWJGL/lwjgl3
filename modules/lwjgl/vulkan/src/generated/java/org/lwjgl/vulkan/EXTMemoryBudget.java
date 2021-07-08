/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.vulkan;

/**
 * While running a Vulkan application, other processes on the machine might also be attempting to use the same device memory, which can pose problems. This extension adds support for querying the amount of memory used and the total memory budget for a memory heap. The values returned by this query are implementation-dependent and can depend on a variety of factors including operating system and system load.
 * 
 * <p>The {@link VkPhysicalDeviceMemoryBudgetPropertiesEXT}{@code ::heapBudget} values can be used as a guideline for how much total memory from each heap the <b>current process</b> can use at any given time, before allocations may start failing or causing performance degradation. The values may change based on other activity in the system that is outside the scope and control of the Vulkan implementation.</p>
 * 
 * <p>The {@link VkPhysicalDeviceMemoryBudgetPropertiesEXT}{@code ::heapUsage} will display the <b>current process</b> estimated heap usage.</p>
 * 
 * <p>With this information, the idea is for an application at some interval (once per frame, per few seconds, etc) to query {@code heapBudget} and {@code heapUsage}. From here the application can notice if it is over budget and decide how it wants to handle the memory situation (free it, move to host memory, changing mipmap levels, etc). This extension is designed to be used in concert with <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html#VK_EXT_memory_priority">VK_EXT_memory_priority</a> to help with this part of memory management.</p>
 * 
 * <h5>VK_EXT_memory_budget</h5>
 * 
 * <dl>
 * <dt><b>Name String</b></dt>
 * <dd>{@code VK_EXT_memory_budget}</dd>
 * <dt><b>Extension Type</b></dt>
 * <dd>Device extension</dd>
 * <dt><b>Registered Extension Number</b></dt>
 * <dd>238</dd>
 * <dt><b>Revision</b></dt>
 * <dd>1</dd>
 * <dt><b>Extension and Version Dependencies</b></dt>
 * <dd><ul>
 * <li>Requires Vulkan 1.0</li>
 * <li>Requires {@link KHRGetPhysicalDeviceProperties2 VK_KHR_get_physical_device_properties2}</li>
 * </ul></dd>
 * <dt><b>Contact</b></dt>
 * <dd><ul>
 * <li>Jeff Bolz <a target="_blank" href="https://github.com/KhronosGroup/Vulkan-Docs/issues/new?title=VK_EXT_memory_budget:%20&amp;body=@jeffbolznv%20">jeffbolznv</a></li>
 * </ul></dd>
 * </dl>
 * 
 * <h5>Other Extension Metadata</h5>
 * 
 * <dl>
 * <dt><b>Last Modified Date</b></dt>
 * <dd>2018-10-08</dd>
 * <dt><b>Contributors</b></dt>
 * <dd><ul>
 * <li>Jeff Bolz, NVIDIA</li>
 * <li>Jeff Juliano, NVIDIA</li>
 * </ul></dd>
 * </dl>
 */
public final class EXTMemoryBudget {

    /** The extension specification version. */
    public static final int VK_EXT_MEMORY_BUDGET_SPEC_VERSION = 1;

    /** The extension name. */
    public static final String VK_EXT_MEMORY_BUDGET_EXTENSION_NAME = "VK_EXT_memory_budget";

    /** Extends {@code VkStructureType}. */
    public static final int VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_MEMORY_BUDGET_PROPERTIES_EXT = 1000237000;

    private EXTMemoryBudget() {}

}