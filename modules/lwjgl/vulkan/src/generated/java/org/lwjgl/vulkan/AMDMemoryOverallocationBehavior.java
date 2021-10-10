/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.vulkan;

/**
 * This extension allows controlling whether explicit overallocation beyond the device memory heap sizes (reported by {@link VkPhysicalDeviceMemoryProperties}) is allowed or not. Overallocation may lead to performance loss and is not supported for all platforms.
 * 
 * <h5>VK_AMD_memory_overallocation_behavior</h5>
 * 
 * <dl>
 * <dt><b>Name String</b></dt>
 * <dd>{@code VK_AMD_memory_overallocation_behavior}</dd>
 * <dt><b>Extension Type</b></dt>
 * <dd>Device extension</dd>
 * <dt><b>Registered Extension Number</b></dt>
 * <dd>190</dd>
 * <dt><b>Revision</b></dt>
 * <dd>1</dd>
 * <dt><b>Extension and Version Dependencies</b></dt>
 * <dd><ul>
 * <li>Requires Vulkan 1.0</li>
 * </ul></dd>
 * <dt><b>Contact</b></dt>
 * <dd><ul>
 * <li>Martin Dinkov <a target="_blank" href="https://github.com/KhronosGroup/Vulkan-Docs/issues/new?body=[VK_AMD_memory_overallocation_behavior]%20@mdinkov%250A%3C%3CHere%20describe%20the%20issue%20or%20question%20you%20have%20about%20the%20VK_AMD_memory_overallocation_behavior%20extension%3E%3E">mdinkov</a></li>
 * </ul></dd>
 * </dl>
 * 
 * <h5>Other Extension Metadata</h5>
 * 
 * <dl>
 * <dt><b>Last Modified Date</b></dt>
 * <dd>2018-09-19</dd>
 * <dt><b>IP Status</b></dt>
 * <dd>No known IP claims.</dd>
 * <dt><b>Contributors</b></dt>
 * <dd><ul>
 * <li>Martin Dinkov, AMD</li>
 * <li>Matthaeus Chajdas, AMD</li>
 * <li>Daniel Rakos, AMD</li>
 * <li>Jon Campbell, AMD</li>
 * </ul></dd>
 * </dl>
 */
public final class AMDMemoryOverallocationBehavior {

    /** The extension specification version. */
    public static final int VK_AMD_MEMORY_OVERALLOCATION_BEHAVIOR_SPEC_VERSION = 1;

    /** The extension name. */
    public static final String VK_AMD_MEMORY_OVERALLOCATION_BEHAVIOR_EXTENSION_NAME = "VK_AMD_memory_overallocation_behavior";

    /** Extends {@code VkStructureType}. */
    public static final int VK_STRUCTURE_TYPE_DEVICE_MEMORY_OVERALLOCATION_CREATE_INFO_AMD = 1000189000;

    /**
     * VkMemoryOverallocationBehaviorAMD - Specify memory overallocation behavior
     * 
     * <h5>Description</h5>
     * 
     * <ul>
     * <li>{@link #VK_MEMORY_OVERALLOCATION_BEHAVIOR_DEFAULT_AMD MEMORY_OVERALLOCATION_BEHAVIOR_DEFAULT_AMD} lets the implementation decide if overallocation is allowed.</li>
     * <li>{@link #VK_MEMORY_OVERALLOCATION_BEHAVIOR_ALLOWED_AMD MEMORY_OVERALLOCATION_BEHAVIOR_ALLOWED_AMD} specifies overallocation is allowed if platform permits.</li>
     * <li>{@link #VK_MEMORY_OVERALLOCATION_BEHAVIOR_DISALLOWED_AMD MEMORY_OVERALLOCATION_BEHAVIOR_DISALLOWED_AMD} specifies the application is not allowed to allocate device memory beyond the heap sizes reported by {@link VkPhysicalDeviceMemoryProperties}. Allocations that are not explicitly made by the application within the scope of the Vulkan instance are not accounted for.</li>
     * </ul>
     * 
     * <h5>See Also</h5>
     * 
     * <p>{@link VkDeviceMemoryOverallocationCreateInfoAMD}</p>
     */
    public static final int
        VK_MEMORY_OVERALLOCATION_BEHAVIOR_DEFAULT_AMD    = 0,
        VK_MEMORY_OVERALLOCATION_BEHAVIOR_ALLOWED_AMD    = 1,
        VK_MEMORY_OVERALLOCATION_BEHAVIOR_DISALLOWED_AMD = 2;

    private AMDMemoryOverallocationBehavior() {}

}