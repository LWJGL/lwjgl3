/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.vulkan;

/**
 * This extension gives defined behavior to fragment depth values which end up outside the conventional [0, 1] range. It can be used to ensure portability in edge cases of features like depthBias. The particular behavior is chosen to match OpenGL to aid porting or emulation.
 * 
 * <h5>VK_EXT_depth_clamp_zero_one</h5>
 * 
 * <dl>
 * <dt><b>Name String</b></dt>
 * <dd>{@code VK_EXT_depth_clamp_zero_one}</dd>
 * <dt><b>Extension Type</b></dt>
 * <dd>Device extension</dd>
 * <dt><b>Registered Extension Number</b></dt>
 * <dd>422</dd>
 * <dt><b>Revision</b></dt>
 * <dd>1</dd>
 * <dt><b>Extension and Version Dependencies</b></dt>
 * <dd>{@link KHRGetPhysicalDeviceProperties2 VK_KHR_get_physical_device_properties2}</dd>
 * <dt><b>Contact</b></dt>
 * <dd><ul>
 * <li>Graeme Leese <a href="https://github.com/KhronosGroup/Vulkan-Docs/issues/new?body=[VK_EXT_depth_clamp_zero_one]%20@gnl21%250A*Here%20describe%20the%20issue%20or%20question%20you%20have%20about%20the%20VK_EXT_depth_clamp_zero_one%20extension*">gnl21</a></li>
 * </ul></dd>
 * </dl>
 * 
 * <h5>Other Extension Metadata</h5>
 * 
 * <dl>
 * <dt><b>Last Modified Date</b></dt>
 * <dd>2021-07-29</dd>
 * <dt><b>Contributors</b></dt>
 * <dd><ul>
 * <li>Graeme Leese, Broadcom</li>
 * </ul></dd>
 * </dl>
 */
public final class EXTDepthClampZeroOne {

    /** The extension specification version. */
    public static final int VK_EXT_DEPTH_CLAMP_ZERO_ONE_SPEC_VERSION = 1;

    /** The extension name. */
    public static final String VK_EXT_DEPTH_CLAMP_ZERO_ONE_EXTENSION_NAME = "VK_EXT_depth_clamp_zero_one";

    /** Extends {@code VkStructureType}. */
    public static final int VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_DEPTH_CLAMP_ZERO_ONE_FEATURES_EXT = 1000421000;

    private EXTDepthClampZeroOne() {}

}