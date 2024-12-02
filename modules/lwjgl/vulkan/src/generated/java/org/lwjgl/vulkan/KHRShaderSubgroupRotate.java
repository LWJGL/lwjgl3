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
 * <li>{@link VkPhysicalDeviceShaderSubgroupRotateFeaturesKHR}</li>
 * </ul>
 * </li>
 * </ul>
 * 
 * <h5>Promotion to Vulkan 1.4</h5>
 * 
 * <p>Functionality in this extension is included in core Vulkan 1.4 with the KHR suffix omitted. The original type, enum and command names are still available as aliases of the core functionality.</p>
 * 
 * <dl>
 * <dt><b>Name String</b></dt>
 * <dd>{@code VK_KHR_shader_subgroup_rotate}</dd>
 * <dt><b>Extension Type</b></dt>
 * <dd>Device extension</dd>
 * <dt><b>Registered Extension Number</b></dt>
 * <dd>417</dd>
 * <dt><b>Revision</b></dt>
 * <dd>2</dd>
 * <dt><b>SPIR-V Dependencies</b></dt>
 * <dd><ul>
 * <li><a href="https://htmlpreview.github.io/?https://github.com/KhronosGroup/SPIRV-Registry/blob/master/extensions/KHR/SPV_KHR_subgroup_rotate.html">SPV_KHR_subgroup_rotate</a></li>
 * </ul></dd>
 * <dt><b>Deprecation State</b></dt>
 * <dd><ul>
 * <li><em>Promoted</em> to Vulkan 1.4</li>
 * </ul></dd>
 * <dt><b>Contact</b></dt>
 * <dd><ul>
 * <li>Kevin Petit <a href="https://github.com/KhronosGroup/Vulkan-Docs/issues/new?body=[VK_KHR_shader_subgroup_rotate]%20@kpet%250A*Here%20describe%20the%20issue%20or%20question%20you%20have%20about%20the%20VK_KHR_shader_subgroup_rotate%20extension*">kpet</a></li>
 * </ul></dd>
 * <dt><b>Extension Proposal</b></dt>
 * <dd><a href="https://github.com/KhronosGroup/Vulkan-Docs/tree/main/proposals/VK_KHR_shader_subgroup_rotate.adoc">VK_KHR_shader_subgroup_rotate</a></dd>
 * <dt><b>Last Modified Date</b></dt>
 * <dd>2024-01-29</dd>
 * <dt><b>IP Status</b></dt>
 * <dd>No known IP claims.</dd>
 * <dt><b>Contributors</b></dt>
 * <dd><ul>
 * <li>Kévin Petit, Arm Ltd.</li>
 * <li>Tobias Hector, AMD</li>
 * <li>Jon Leech, Khronos</li>
 * <li>Matthew Netsch, Qualcomm</li>
 * <li>Jan-Harald Fredriksen, Arm Ltd.</li>
 * <li>Graeme Leese, Broadcom</li>
 * <li>Tom Olson, Arm Ltd.</li>
 * <li>Spencer Fricke, LunarG Inc.</li>
 * </ul></dd>
 * </dl>
 * 
 * <p>This extension adds support for the subgroup rotate instruction defined in SPV_KHR_subgroup_rotate.</p>
 */
public final class KHRShaderSubgroupRotate {

    /** The extension specification version. */
    public static final int VK_KHR_SHADER_SUBGROUP_ROTATE_SPEC_VERSION = 2;

    /** The extension name. */
    public static final String VK_KHR_SHADER_SUBGROUP_ROTATE_EXTENSION_NAME = "VK_KHR_shader_subgroup_rotate";

    /** Extends {@code VkStructureType}. */
    public static final int VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_SHADER_SUBGROUP_ROTATE_FEATURES_KHR = 1000416000;

    /**
     * Extends {@code VkSubgroupFeatureFlagBits}.
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #VK_SUBGROUP_FEATURE_ROTATE_BIT_KHR SUBGROUP_FEATURE_ROTATE_BIT_KHR}</li>
     * <li>{@link #VK_SUBGROUP_FEATURE_ROTATE_CLUSTERED_BIT_KHR SUBGROUP_FEATURE_ROTATE_CLUSTERED_BIT_KHR}</li>
     * </ul>
     */
    public static final int
        VK_SUBGROUP_FEATURE_ROTATE_BIT_KHR           = 0x200,
        VK_SUBGROUP_FEATURE_ROTATE_CLUSTERED_BIT_KHR = 0x400;

    private KHRShaderSubgroupRotate() {}

}