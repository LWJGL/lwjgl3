/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.vulkan;

/**
 * This extension allows applications to reduce descriptor memory footprint by allowing a descriptor to be able to mutate to a given list of descriptor types depending on which descriptor types are written into, or copied into a descriptor set.
 * 
 * <p>The main use case this extension intends to address is descriptor indexing with {@link VK12#VK_DESCRIPTOR_BINDING_VARIABLE_DESCRIPTOR_COUNT_BIT DESCRIPTOR_BINDING_VARIABLE_DESCRIPTOR_COUNT_BIT} where the descriptor types are completely generic, as this means applications can allocate one large descriptor set, rather than having one large descriptor set per descriptor type, which significantly bloats descriptor memory usage and causes performance issues.</p>
 * 
 * <p>This extension also adds a mechanism to declare that a descriptor pool, and therefore the descriptor sets that are allocated from it, reside only in host memory; as such these descriptors can only be updated/copied, but not bound.</p>
 * 
 * <p>These features together allow much more efficient emulation of the raw D3D12 binding model. This extension is primarily intended to be useful for API layering efforts.</p>
 * 
 * <h5>VK_EXT_mutable_descriptor_type</h5>
 * 
 * <dl>
 * <dt><b>Name String</b></dt>
 * <dd>{@code VK_EXT_mutable_descriptor_type}</dd>
 * <dt><b>Extension Type</b></dt>
 * <dd>Device extension</dd>
 * <dt><b>Registered Extension Number</b></dt>
 * <dd>495</dd>
 * <dt><b>Revision</b></dt>
 * <dd>1</dd>
 * <dt><b>Extension and Version Dependencies</b></dt>
 * <dd>{@link KHRMaintenance3 VK_KHR_maintenance3}</dd>
 * <dt><b>Special Use</b></dt>
 * <dd><ul>
 * <li><a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#extendingvulkan-compatibility-specialuse">D3D support</a></li>
 * </ul></dd>
 * <dt><b>Contact</b></dt>
 * <dd><ul>
 * <li>Joshua Ashton <a href="https://github.com/KhronosGroup/Vulkan-Docs/issues/new?body=[VK_EXT_mutable_descriptor_type]%20@Joshua-Ashton%250A*Here%20describe%20the%20issue%20or%20question%20you%20have%20about%20the%20VK_EXT_mutable_descriptor_type%20extension*">Joshua-Ashton</a></li>
 * <li>Hans-Kristian Arntzen <a href="https://github.com/KhronosGroup/Vulkan-Docs/issues/new?body=[VK_EXT_mutable_descriptor_type]%20@HansKristian-Work%250A*Here%20describe%20the%20issue%20or%20question%20you%20have%20about%20the%20VK_EXT_mutable_descriptor_type%20extension*">HansKristian-Work</a></li>
 * </ul></dd>
 * <dt><b>Extension Proposal</b></dt>
 * <dd><a href="https://github.com/KhronosGroup/Vulkan-Docs/tree/main/proposals/VK_EXT_mutable_descriptor_type.adoc">VK_EXT_mutable_descriptor_type</a></dd>
 * </dl>
 * 
 * <h5>Other Extension Metadata</h5>
 * 
 * <dl>
 * <dt><b>Last Modified Date</b></dt>
 * <dd>2022-08-22</dd>
 * <dt><b>IP Status</b></dt>
 * <dd>No known IP claims.</dd>
 * <dt><b>Contributors</b></dt>
 * <dd><ul>
 * <li>Joshua Ashton, Valve</li>
 * <li>Hans-Kristian Arntzen, Valve</li>
 * </ul></dd>
 * </dl>
 */
public final class EXTMutableDescriptorType {

    /** The extension specification version. */
    public static final int VK_EXT_MUTABLE_DESCRIPTOR_TYPE_SPEC_VERSION = 1;

    /** The extension name. */
    public static final String VK_EXT_MUTABLE_DESCRIPTOR_TYPE_EXTENSION_NAME = "VK_EXT_mutable_descriptor_type";

    /**
     * Extends {@code VkStructureType}.
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_MUTABLE_DESCRIPTOR_TYPE_FEATURES_EXT STRUCTURE_TYPE_PHYSICAL_DEVICE_MUTABLE_DESCRIPTOR_TYPE_FEATURES_EXT}</li>
     * <li>{@link #VK_STRUCTURE_TYPE_MUTABLE_DESCRIPTOR_TYPE_CREATE_INFO_EXT STRUCTURE_TYPE_MUTABLE_DESCRIPTOR_TYPE_CREATE_INFO_EXT}</li>
     * </ul>
     */
    public static final int
        VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_MUTABLE_DESCRIPTOR_TYPE_FEATURES_EXT = 1000351000,
        VK_STRUCTURE_TYPE_MUTABLE_DESCRIPTOR_TYPE_CREATE_INFO_EXT              = 1000351002;

    /** Extends {@code VkDescriptorType}. */
    public static final int VK_DESCRIPTOR_TYPE_MUTABLE_EXT = 1000351000;

    /** Extends {@code VkDescriptorPoolCreateFlagBits}. */
    public static final int VK_DESCRIPTOR_POOL_CREATE_HOST_ONLY_BIT_EXT = 0x4;

    /** Extends {@code VkDescriptorSetLayoutCreateFlagBits}. */
    public static final int VK_DESCRIPTOR_SET_LAYOUT_CREATE_HOST_ONLY_POOL_BIT_EXT = 0x4;

    private EXTMutableDescriptorType() {}

}