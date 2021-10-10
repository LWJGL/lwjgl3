/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.vulkan;

/**
 * To be done.
 * 
 * <h5>VK_EXT_swapchain_colorspace</h5>
 * 
 * <dl>
 * <dt><b>Name String</b></dt>
 * <dd>{@code VK_EXT_swapchain_colorspace}</dd>
 * <dt><b>Extension Type</b></dt>
 * <dd>Instance extension</dd>
 * <dt><b>Registered Extension Number</b></dt>
 * <dd>105</dd>
 * <dt><b>Revision</b></dt>
 * <dd>4</dd>
 * <dt><b>Extension and Version Dependencies</b></dt>
 * <dd><ul>
 * <li>Requires Vulkan 1.0</li>
 * <li>Requires {@link KHRSurface VK_KHR_surface}</li>
 * </ul></dd>
 * <dt><b>Contact</b></dt>
 * <dd><ul>
 * <li>Courtney Goeltzenleuchter <a target="_blank" href="https://github.com/KhronosGroup/Vulkan-Docs/issues/new?body=[VK_EXT_swapchain_colorspace]%20@courtney-g%250A%3C%3CHere%20describe%20the%20issue%20or%20question%20you%20have%20about%20the%20VK_EXT_swapchain_colorspace%20extension%3E%3E">courtney-g</a></li>
 * </ul></dd>
 * </dl>
 * 
 * <h5>Other Extension Metadata</h5>
 * 
 * <dl>
 * <dt><b>Last Modified Date</b></dt>
 * <dd>2019-04-26</dd>
 * <dt><b>IP Status</b></dt>
 * <dd>No known IP claims.</dd>
 * <dt><b>Contributors</b></dt>
 * <dd><ul>
 * <li>Courtney Goeltzenleuchter, Google</li>
 * </ul></dd>
 * </dl>
 */
public final class EXTSwapchainColorspace {

    /** The extension specification version. */
    public static final int VK_EXT_SWAPCHAIN_COLOR_SPACE_SPEC_VERSION = 4;

    /** The extension name. */
    public static final String VK_EXT_SWAPCHAIN_COLOR_SPACE_EXTENSION_NAME = "VK_EXT_swapchain_colorspace";

    /**
     * Extends {@code VkColorSpaceKHR}.
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #VK_COLOR_SPACE_DISPLAY_P3_NONLINEAR_EXT COLOR_SPACE_DISPLAY_P3_NONLINEAR_EXT}</li>
     * <li>{@link #VK_COLOR_SPACE_EXTENDED_SRGB_LINEAR_EXT COLOR_SPACE_EXTENDED_SRGB_LINEAR_EXT}</li>
     * <li>{@link #VK_COLOR_SPACE_DISPLAY_P3_LINEAR_EXT COLOR_SPACE_DISPLAY_P3_LINEAR_EXT}</li>
     * <li>{@link #VK_COLOR_SPACE_DCI_P3_NONLINEAR_EXT COLOR_SPACE_DCI_P3_NONLINEAR_EXT}</li>
     * <li>{@link #VK_COLOR_SPACE_BT709_LINEAR_EXT COLOR_SPACE_BT709_LINEAR_EXT}</li>
     * <li>{@link #VK_COLOR_SPACE_BT709_NONLINEAR_EXT COLOR_SPACE_BT709_NONLINEAR_EXT}</li>
     * <li>{@link #VK_COLOR_SPACE_BT2020_LINEAR_EXT COLOR_SPACE_BT2020_LINEAR_EXT}</li>
     * <li>{@link #VK_COLOR_SPACE_HDR10_ST2084_EXT COLOR_SPACE_HDR10_ST2084_EXT}</li>
     * <li>{@link #VK_COLOR_SPACE_DOLBYVISION_EXT COLOR_SPACE_DOLBYVISION_EXT}</li>
     * <li>{@link #VK_COLOR_SPACE_HDR10_HLG_EXT COLOR_SPACE_HDR10_HLG_EXT}</li>
     * <li>{@link #VK_COLOR_SPACE_ADOBERGB_LINEAR_EXT COLOR_SPACE_ADOBERGB_LINEAR_EXT}</li>
     * <li>{@link #VK_COLOR_SPACE_ADOBERGB_NONLINEAR_EXT COLOR_SPACE_ADOBERGB_NONLINEAR_EXT}</li>
     * <li>{@link #VK_COLOR_SPACE_PASS_THROUGH_EXT COLOR_SPACE_PASS_THROUGH_EXT}</li>
     * <li>{@link #VK_COLOR_SPACE_EXTENDED_SRGB_NONLINEAR_EXT COLOR_SPACE_EXTENDED_SRGB_NONLINEAR_EXT}</li>
     * <li>{@link #VK_COLOR_SPACE_DCI_P3_LINEAR_EXT COLOR_SPACE_DCI_P3_LINEAR_EXT}</li>
     * </ul>
     */
    public static final int
        VK_COLOR_SPACE_DISPLAY_P3_NONLINEAR_EXT    = 1000104001,
        VK_COLOR_SPACE_EXTENDED_SRGB_LINEAR_EXT    = 1000104002,
        VK_COLOR_SPACE_DISPLAY_P3_LINEAR_EXT       = 1000104003,
        VK_COLOR_SPACE_DCI_P3_NONLINEAR_EXT        = 1000104004,
        VK_COLOR_SPACE_BT709_LINEAR_EXT            = 1000104005,
        VK_COLOR_SPACE_BT709_NONLINEAR_EXT         = 1000104006,
        VK_COLOR_SPACE_BT2020_LINEAR_EXT           = 1000104007,
        VK_COLOR_SPACE_HDR10_ST2084_EXT            = 1000104008,
        VK_COLOR_SPACE_DOLBYVISION_EXT             = 1000104009,
        VK_COLOR_SPACE_HDR10_HLG_EXT               = 1000104010,
        VK_COLOR_SPACE_ADOBERGB_LINEAR_EXT         = 1000104011,
        VK_COLOR_SPACE_ADOBERGB_NONLINEAR_EXT      = 1000104012,
        VK_COLOR_SPACE_PASS_THROUGH_EXT            = 1000104013,
        VK_COLOR_SPACE_EXTENDED_SRGB_NONLINEAR_EXT = 1000104014,
        VK_COLOR_SPACE_DCI_P3_LINEAR_EXT           = 1000104003;

    private EXTSwapchainColorspace() {}

}