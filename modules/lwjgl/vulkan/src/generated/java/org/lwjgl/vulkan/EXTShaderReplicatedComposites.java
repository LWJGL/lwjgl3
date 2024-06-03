/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.vulkan;

/**
 * <ul>
 * <li>Extending {@link VkPhysicalDeviceFeatures2}, {@link VkDeviceCreateInfo}:
 * 
 * <ul>
 * <li>{@link VkPhysicalDeviceShaderReplicatedCompositesFeaturesEXT}</li>
 * </ul>
 * </li>
 * </ul>
 * 
 * <dl>
 * <dt><b>Name String</b></dt>
 * <dd>{@code VK_EXT_shader_replicated_composites}</dd>
 * <dt><b>Extension Type</b></dt>
 * <dd>Device extension</dd>
 * <dt><b>Registered Extension Number</b></dt>
 * <dd>565</dd>
 * <dt><b>Revision</b></dt>
 * <dd>1</dd>
 * <dt><b>SPIR-V Dependencies</b></dt>
 * <dd><ul>
 * <li><a href="https://htmlpreview.github.io/?https://github.com/KhronosGroup/SPIRV-Registry/blob/master/extensions/EXT/SPV_EXT_replicated_composites.html">SPV_EXT_replicated_composites</a></li>
 * </ul></dd>
 * <dt><b>Contact</b></dt>
 * <dd><ul>
 * <li>Kevin Petit <a href="https://github.com/KhronosGroup/Vulkan-Docs/issues/new?body=[VK_EXT_shader_replicated_composites]%20@kpet%250A*Here%20describe%20the%20issue%20or%20question%20you%20have%20about%20the%20VK_EXT_shader_replicated_composites%20extension*">kpet</a></li>
 * </ul></dd>
 * <dt><b>Extension Proposal</b></dt>
 * <dd><a href="https://github.com/KhronosGroup/Vulkan-Docs/tree/main/proposals/VK_EXT_shader_replicated_composites.adoc">VK_EXT_shader_replicated_composites</a></dd>
 * <dt><b>Last Modified Date</b></dt>
 * <dd>2024-02-08</dd>
 * <dt><b>IP Status</b></dt>
 * <dd>No known IP claims.</dd>
 * <dt><b>Contributors</b></dt>
 * <dd><ul>
 * <li>Kévin Petit, Arm Ltd.</li>
 * <li>Jeff Bolz, NVIDIA</li>
 * <li>Piers Daniell, NVIDIA</li>
 * </ul></dd>
 * </dl>
 * 
 * <p>This extension adds support for creating composites from a single value in SPIR-V modules, as defined by SPV_EXT_replicated_composites.</p>
 */
public final class EXTShaderReplicatedComposites {

    /** The extension specification version. */
    public static final int VK_EXT_SHADER_REPLICATED_COMPOSITES_SPEC_VERSION = 1;

    /** The extension name. */
    public static final String VK_EXT_SHADER_REPLICATED_COMPOSITES_EXTENSION_NAME = "VK_EXT_shader_replicated_composites";

    /** Extends {@code VkStructureType}. */
    public static final int VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_SHADER_REPLICATED_COMPOSITES_FEATURES_EXT = 1000564000;

    private EXTShaderReplicatedComposites() {}

}