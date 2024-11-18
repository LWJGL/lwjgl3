/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.vulkan;

/**
 * This extension allows applications to assign HDR Vivid (T/UWA 005.1-2022) metadata to swapchains.
 * 
 * <p>HDR Vivid is an HDR standard released by UWA (UHD World Association). It defines tone mapping from the metadata to better preserve the creator’s intentions and achieve better consistency across devices with different display capabilities.</p>
 * 
 * <dl>
 * <dt><b>Name String</b></dt>
 * <dd>{@code VK_HUAWEI_hdr_vivid}</dd>
 * <dt><b>Extension Type</b></dt>
 * <dd>Device extension</dd>
 * <dt><b>Registered Extension Number</b></dt>
 * <dd>591</dd>
 * <dt><b>Revision</b></dt>
 * <dd>1</dd>
 * <dt><b>Extension and Version Dependencies</b></dt>
 * <dd>{@link KHRGetPhysicalDeviceProperties2 VK_KHR_get_physical_device_properties2} or <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#versions-1.1">Version 1.1</a> and {@link KHRSwapchain VK_KHR_swapchain} and {@link EXTHdrMetadata VK_EXT_hdr_metadata}</dd>
 * <dt><b>Contact</b></dt>
 * <dd><ul>
 * <li>Zehui Lin <a href="https://github.com/KhronosGroup/Vulkan-Docs/issues/new?body=[VK_HUAWEI_hdr_vivid]%20@bactlink%250A*Here%20describe%20the%20issue%20or%20question%20you%20have%20about%20the%20VK_HUAWEI_hdr_vivid%20extension*">bactlink</a></li>
 * </ul></dd>
 * </dl>
 * 
 * <h5>Other Extension Metadata</h5>
 * 
 * <dl>
 * <dt><b>Last Modified Date</b></dt>
 * <dd>2024-10-08</dd>
 * <dt><b>IP Status</b></dt>
 * <dd>No known IP claims.</dd>
 * <dt><b>Contributors</b></dt>
 * <dd><ul>
 * <li>Juntao Li, Huawei</li>
 * <li>Pan Gao, Huawei</li>
 * <li>Xiufeng Zhang, Huawei</li>
 * <li>Zehui Lin, Huawei</li>
 * </ul></dd>
 * </dl>
 */
public final class HUAWEIHdrVivid {

    /** The extension specification version. */
    public static final int VK_HUAWEI_HDR_VIVID_SPEC_VERSION = 1;

    /** The extension name. */
    public static final String VK_HUAWEI_HDR_VIVID_EXTENSION_NAME = "VK_HUAWEI_hdr_vivid";

    /**
     * Extends {@code VkStructureType}.
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_HDR_VIVID_FEATURES_HUAWEI STRUCTURE_TYPE_PHYSICAL_DEVICE_HDR_VIVID_FEATURES_HUAWEI}</li>
     * <li>{@link #VK_STRUCTURE_TYPE_HDR_VIVID_DYNAMIC_METADATA_HUAWEI STRUCTURE_TYPE_HDR_VIVID_DYNAMIC_METADATA_HUAWEI}</li>
     * </ul>
     */
    public static final int
        VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_HDR_VIVID_FEATURES_HUAWEI = 1000590000,
        VK_STRUCTURE_TYPE_HDR_VIVID_DYNAMIC_METADATA_HUAWEI         = 1000590001;

    private HUAWEIHdrVivid() {}

}