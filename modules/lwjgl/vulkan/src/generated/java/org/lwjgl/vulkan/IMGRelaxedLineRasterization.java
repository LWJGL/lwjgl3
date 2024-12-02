/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.vulkan;

/**
 * OpenGL specifies that implementations should rasterize lines using the diamond exit rule (a slightly modified version of Bresenham’s algorithm). To implement OpenGL some implementations have a device-level compatibility mode to rasterize lines according to the OpenGL specification.
 * 
 * <p>This extension allows OpenGL emulation layers to enable the OpenGL compatible line rasterization mode of such implementations.</p>
 * 
 * <dl>
 * <dt><b>Name String</b></dt>
 * <dd>{@code VK_IMG_relaxed_line_rasterization}</dd>
 * <dt><b>Extension Type</b></dt>
 * <dd>Device extension</dd>
 * <dt><b>Registered Extension Number</b></dt>
 * <dd>111</dd>
 * <dt><b>Revision</b></dt>
 * <dd>1</dd>
 * <dt><b>Extension and Version Dependencies</b></dt>
 * <dd>{@link KHRGetPhysicalDeviceProperties2 VK_KHR_get_physical_device_properties2} or <a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html#versions-1.1">Version 1.1</a></dd>
 * <dt><b>Special Use</b></dt>
 * <dd><ul>
 * <li><a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html#extendingvulkan-compatibility-specialuse">OpenGL / ES support</a></li>
 * </ul></dd>
 * <dt><b>Contact</b></dt>
 * <dd><ul>
 * <li>James Fitzpatrick <a href="https://github.com/KhronosGroup/Vulkan-Docs/issues/new?body=[VK_IMG_relaxed_line_rasterization]%20@jamesfitzpatrick%250A*Here%20describe%20the%20issue%20or%20question%20you%20have%20about%20the%20VK_IMG_relaxed_line_rasterization%20extension*">jamesfitzpatrick</a></li>
 * </ul></dd>
 * </dl>
 * 
 * <h5>Other Extension Metadata</h5>
 * 
 * <dl>
 * <dt><b>Last Modified Date</b></dt>
 * <dd>2023-10-22</dd>
 * <dt><b>IP Status</b></dt>
 * <dd>No known IP claims.</dd>
 * <dt><b>Contributors</b></dt>
 * <dd><ul>
 * <li>James Fitzpatrick, Imagination</li>
 * <li>Andrew Garrard, Imagination</li>
 * <li>Alex Walters, Imagination</li>
 * </ul></dd>
 * </dl>
 */
public final class IMGRelaxedLineRasterization {

    /** The extension specification version. */
    public static final int VK_IMG_RELAXED_LINE_RASTERIZATION_SPEC_VERSION = 1;

    /** The extension name. */
    public static final String VK_IMG_RELAXED_LINE_RASTERIZATION_EXTENSION_NAME = "VK_IMG_relaxed_line_rasterization";

    /** Extends {@code VkStructureType}. */
    public static final int VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_RELAXED_LINE_RASTERIZATION_FEATURES_IMG = 1000110000;

    private IMGRelaxedLineRasterization() {}

}