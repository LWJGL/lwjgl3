/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.vulkan;

/**
 * This extension allows an application to request that {@link KHRMapMemory2#vkMapMemory2KHR MapMemory2KHR} attempt to place the memory map at a particular virtual address.
 * 
 * <dl>
 * <dt><b>Name String</b></dt>
 * <dd>{@code VK_EXT_map_memory_placed}</dd>
 * <dt><b>Extension Type</b></dt>
 * <dd>Device extension</dd>
 * <dt><b>Registered Extension Number</b></dt>
 * <dd>273</dd>
 * <dt><b>Revision</b></dt>
 * <dd>1</dd>
 * <dt><b>Extension and Version Dependencies</b></dt>
 * <dd>{@link KHRMapMemory2 VK_KHR_map_memory2}</dd>
 * <dt><b>Contact</b></dt>
 * <dd><ul>
 * <li>Faith Ekstrand <a href="https://github.com/KhronosGroup/Vulkan-Docs/issues/new?body=[VK_EXT_map_memory_placed]%20@gfxstrand%250A*Here%20describe%20the%20issue%20or%20question%20you%20have%20about%20the%20VK_EXT_map_memory_placed%20extension*">gfxstrand</a></li>
 * </ul></dd>
 * <dt><b>Extension Proposal</b></dt>
 * <dd><a href="https://github.com/KhronosGroup/Vulkan-Docs/tree/main/proposals/VK_EXT_map_memory_placed.adoc">VK_EXT_map_memory_placed</a></dd>
 * </dl>
 * 
 * <h5>Other Extension Metadata</h5>
 * 
 * <dl>
 * <dt><b>Last Modified Date</b></dt>
 * <dd>2023-03-21</dd>
 * <dt><b>IP Status</b></dt>
 * <dd>No known IP claims.</dd>
 * <dt><b>Interactions and External Dependencies</b></dt>
 * <dd><ul>
 * <li>Depends on apitext:VK_KHR_map_memory2</li>
 * <li>Interacts with apitext:VK_EXT_external_memory_host</li>
 * </ul></dd>
 * <dt><b>Contributors</b></dt>
 * <dd><ul>
 * <li>Faith Ekstrand, Collabora</li>
 * <li>Tobias Hector, AMD</li>
 * <li>James Jones, NVIDIA</li>
 * <li>Georg Lehmann, Valve</li>
 * <li>Derek Lesho, Codeweavers</li>
 * </ul></dd>
 * </dl>
 */
public final class EXTMapMemoryPlaced {

    /** The extension specification version. */
    public static final int VK_EXT_MAP_MEMORY_PLACED_SPEC_VERSION = 1;

    /** The extension name. */
    public static final String VK_EXT_MAP_MEMORY_PLACED_EXTENSION_NAME = "VK_EXT_map_memory_placed";

    /**
     * Extends {@code VkStructureType}.
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_MAP_MEMORY_PLACED_FEATURES_EXT STRUCTURE_TYPE_PHYSICAL_DEVICE_MAP_MEMORY_PLACED_FEATURES_EXT}</li>
     * <li>{@link #VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_MAP_MEMORY_PLACED_PROPERTIES_EXT STRUCTURE_TYPE_PHYSICAL_DEVICE_MAP_MEMORY_PLACED_PROPERTIES_EXT}</li>
     * <li>{@link #VK_STRUCTURE_TYPE_MEMORY_MAP_PLACED_INFO_EXT STRUCTURE_TYPE_MEMORY_MAP_PLACED_INFO_EXT}</li>
     * </ul>
     */
    public static final int
        VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_MAP_MEMORY_PLACED_FEATURES_EXT   = 1000272000,
        VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_MAP_MEMORY_PLACED_PROPERTIES_EXT = 1000272001,
        VK_STRUCTURE_TYPE_MEMORY_MAP_PLACED_INFO_EXT                       = 1000272002;

    /** Extends {@code VkMemoryMapFlagBits}. */
    public static final int VK_MEMORY_MAP_PLACED_BIT_EXT = 0x1;

    /** Extends {@code VkMemoryUnmapFlagBitsKHR}. */
    public static final int VK_MEMORY_UNMAP_RESERVE_BIT_EXT = 0x1;

    private EXTMapMemoryPlaced() {}

}