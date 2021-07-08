/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.vulkan;

/**
 * This extension defines the {@link #VK_FORMAT_A4R4G4B4_UNORM_PACK16_EXT FORMAT_A4R4G4B4_UNORM_PACK16_EXT} and {@link #VK_FORMAT_A4B4G4R4_UNORM_PACK16_EXT FORMAT_A4B4G4R4_UNORM_PACK16_EXT} formats which are defined in other current graphics APIs.
 * 
 * <p>This extension may be useful for building translation layers for those APIs or for porting applications that use these formats without having to resort to swizzles.</p>
 * 
 * <p>When VK_EXT_custom_border_color is used, these formats are not subject to the same restrictions for border color without format as with VK_FORMAT_B4G4R4A4_UNORM_PACK16.</p>
 * 
 * <h5>VK_EXT_4444_formats</h5>
 * 
 * <dl>
 * <dt><b>Name String</b></dt>
 * <dd>{@code VK_EXT_4444_formats}</dd>
 * <dt><b>Extension Type</b></dt>
 * <dd>Device extension</dd>
 * <dt><b>Registered Extension Number</b></dt>
 * <dd>341</dd>
 * <dt><b>Revision</b></dt>
 * <dd>1</dd>
 * <dt><b>Extension and Version Dependencies</b></dt>
 * <dd><ul>
 * <li>Requires Vulkan 1.0</li>
 * <li>Requires {@link KHRGetPhysicalDeviceProperties2 VK_KHR_get_physical_device_properties2}</li>
 * </ul></dd>
 * <dt><b>Contact</b></dt>
 * <dd><ul>
 * <li>Joshua Ashton <a target="_blank" href="https://github.com/KhronosGroup/Vulkan-Docs/issues/new?title=VK_EXT_4444_formats:%20&amp;body=@Joshua-Ashton%20">Joshua-Ashton</a></li>
 * </ul></dd>
 * </dl>
 * 
 * <h5>Other Extension Metadata</h5>
 * 
 * <dl>
 * <dt><b>Last Modified Date</b></dt>
 * <dd>2020-07-28</dd>
 * <dt><b>IP Status</b></dt>
 * <dd>No known IP claims.</dd>
 * <dt><b>Contributors</b></dt>
 * <dd><ul>
 * <li>Joshua Ashton, Valve</li>
 * <li>Jason Ekstrand, Intel</li>
 * </ul></dd>
 * </dl>
 */
public final class EXT4444Formats {

    /** The extension specification version. */
    public static final int VK_EXT_4444_FORMATS_SPEC_VERSION = 1;

    /** The extension name. */
    public static final String VK_EXT_4444_FORMATS_EXTENSION_NAME = "VK_EXT_4444_formats";

    /** Extends {@code VkStructureType}. */
    public static final int VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_4444_FORMATS_FEATURES_EXT = 1000340000;

    /**
     * Extends {@code VkFormat}.
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #VK_FORMAT_A4R4G4B4_UNORM_PACK16_EXT FORMAT_A4R4G4B4_UNORM_PACK16_EXT}</li>
     * <li>{@link #VK_FORMAT_A4B4G4R4_UNORM_PACK16_EXT FORMAT_A4B4G4R4_UNORM_PACK16_EXT}</li>
     * </ul>
     */
    public static final int
        VK_FORMAT_A4R4G4B4_UNORM_PACK16_EXT = 1000340000,
        VK_FORMAT_A4B4G4R4_UNORM_PACK16_EXT = 1000340001;

    private EXT4444Formats() {}

}