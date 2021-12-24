/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.vulkan;

/**
 * This extension allows an application to specify offsets to a fragment density map attachment, changing the framebuffer location where density values are applied to without having to regenerate the fragment density map.
 * 
 * <h5>VK_QCOM_fragment_density_map_offset</h5>
 * 
 * <dl>
 * <dt><b>Name String</b></dt>
 * <dd>{@code VK_QCOM_fragment_density_map_offset}</dd>
 * <dt><b>Extension Type</b></dt>
 * <dd>Device extension</dd>
 * <dt><b>Registered Extension Number</b></dt>
 * <dd>426</dd>
 * <dt><b>Revision</b></dt>
 * <dd>1</dd>
 * <dt><b>Extension and Version Dependencies</b></dt>
 * <dd><ul>
 * <li>Requires Vulkan 1.0</li>
 * <li>Requires {@link KHRGetPhysicalDeviceProperties2 VK_KHR_get_physical_device_properties2}</li>
 * <li>Requires {@link EXTFragmentDensityMap VK_EXT_fragment_density_map}</li>
 * </ul></dd>
 * <dt><b>Contact</b></dt>
 * <dd><ul>
 * <li>Matthew Netsch <a target="_blank" href="https://github.com/KhronosGroup/Vulkan-Docs/issues/new?body=[VK_QCOM_fragment_density_map_offset]%20@mnetsch%250A%3C%3CHere%20describe%20the%20issue%20or%20question%20you%20have%20about%20the%20VK_QCOM_fragment_density_map_offset%20extension%3E%3E">mnetsch</a></li>
 * </ul></dd>
 * </dl>
 * 
 * <h5>Other Extension Metadata</h5>
 * 
 * <dl>
 * <dt><b>Last Modified Date</b></dt>
 * <dd>2021-09-03</dd>
 * <dt><b>Contributors</b></dt>
 * <dd><ul>
 * <li>Matthew Netsch, Qualcomm Technologies, Inc.</li>
 * <li>Jonathan Wicks, Qualcomm Technologies, Inc.</li>
 * <li>Jonathan Tinkham, Qualcomm Technologies, Inc.</li>
 * <li>Jeff Leger, Qualcomm Technologies, Inc.</li>
 * </ul></dd>
 * </dl>
 */
public final class QCOMFragmentDensityMapOffset {

    /** The extension specification version. */
    public static final int VK_QCOM_FRAGMENT_DENSITY_MAP_OFFSET_SPEC_VERSION = 1;

    /** The extension name. */
    public static final String VK_QCOM_FRAGMENT_DENSITY_MAP_OFFSET_EXTENSION_NAME = "VK_QCOM_fragment_density_map_offset";

    /**
     * Extends {@code VkStructureType}.
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_FRAGMENT_DENSITY_MAP_OFFSET_FEATURES_QCOM STRUCTURE_TYPE_PHYSICAL_DEVICE_FRAGMENT_DENSITY_MAP_OFFSET_FEATURES_QCOM}</li>
     * <li>{@link #VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_FRAGMENT_DENSITY_MAP_OFFSET_PROPERTIES_QCOM STRUCTURE_TYPE_PHYSICAL_DEVICE_FRAGMENT_DENSITY_MAP_OFFSET_PROPERTIES_QCOM}</li>
     * <li>{@link #VK_STRUCTURE_TYPE_SUBPASS_FRAGMENT_DENSITY_MAP_OFFSET_END_INFO_QCOM STRUCTURE_TYPE_SUBPASS_FRAGMENT_DENSITY_MAP_OFFSET_END_INFO_QCOM}</li>
     * </ul>
     */
    public static final int
        VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_FRAGMENT_DENSITY_MAP_OFFSET_FEATURES_QCOM   = 1000425000,
        VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_FRAGMENT_DENSITY_MAP_OFFSET_PROPERTIES_QCOM = 1000425001,
        VK_STRUCTURE_TYPE_SUBPASS_FRAGMENT_DENSITY_MAP_OFFSET_END_INFO_QCOM           = 1000425002;

    /** Extends {@code VkImageCreateFlagBits}. */
    public static final int VK_IMAGE_CREATE_FRAGMENT_DENSITY_MAP_OFFSET_BIT_QCOM = 0x8000;

    private QCOMFragmentDensityMapOffset() {}

}