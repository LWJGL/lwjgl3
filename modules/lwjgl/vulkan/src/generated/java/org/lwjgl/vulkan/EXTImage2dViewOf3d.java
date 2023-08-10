/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.vulkan;

/**
 * This extension allows a single slice of a 3D image to be used as a 2D view in image descriptors, matching both the functionality of glBindImageTexture in OpenGL with the {@code layer} parameter set to true and 2D view binding provided by the extension EGL_KHR_gl_texture_3D_image. It is primarily intended to support GL emulation.
 * 
 * <h5>VK_EXT_image_2d_view_of_3d</h5>
 * 
 * <dl>
 * <dt><b>Name String</b></dt>
 * <dd>{@code VK_EXT_image_2d_view_of_3d}</dd>
 * <dt><b>Extension Type</b></dt>
 * <dd>Device extension</dd>
 * <dt><b>Registered Extension Number</b></dt>
 * <dd>394</dd>
 * <dt><b>Revision</b></dt>
 * <dd>1</dd>
 * <dt><b>Extension and Version Dependencies</b></dt>
 * <dd>{@link KHRMaintenance1 VK_KHR_maintenance1} and {@link KHRGetPhysicalDeviceProperties2 VK_KHR_get_physical_device_properties2}</dd>
 * <dt><b>Special Use</b></dt>
 * <dd><ul>
 * <li><a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#extendingvulkan-compatibility-specialuse">OpenGL / ES support</a></li>
 * </ul></dd>
 * <dt><b>Contact</b></dt>
 * <dd><ul>
 * <li>Mike Blumenkrantz <a href="https://github.com/KhronosGroup/Vulkan-Docs/issues/new?body=[VK_EXT_image_2d_view_of_3d]%20@zmike%250A*Here%20describe%20the%20issue%20or%20question%20you%20have%20about%20the%20VK_EXT_image_2d_view_of_3d%20extension*">zmike</a></li>
 * </ul></dd>
 * </dl>
 * 
 * <h5>Other Extension Metadata</h5>
 * 
 * <dl>
 * <dt><b>Last Modified Date</b></dt>
 * <dd>2022-02-22</dd>
 * <dt><b>IP Status</b></dt>
 * <dd>No known IP claims.</dd>
 * <dt><b>Contributors</b></dt>
 * <dd><ul>
 * <li>Mike Blumenkrantz, Valve</li>
 * <li>Piers Daniell, NVIDIA</li>
 * <li>Spencer Fricke, Samsung</li>
 * <li>Ricardo Garcia, Igalia</li>
 * <li>Graeme Leese, Broadcom</li>
 * <li>Ralph Potter, Samsung</li>
 * <li>Stu Smith, AMD</li>
 * <li>Shahbaz Youssefi, Google</li>
 * <li>Alex Walters, Imagination</li>
 * </ul></dd>
 * </dl>
 */
public final class EXTImage2dViewOf3d {

    /** The extension specification version. */
    public static final int VK_EXT_IMAGE_2D_VIEW_OF_3D_SPEC_VERSION = 1;

    /** The extension name. */
    public static final String VK_EXT_IMAGE_2D_VIEW_OF_3D_EXTENSION_NAME = "VK_EXT_image_2d_view_of_3d";

    /** Extends {@code VkStructureType}. */
    public static final int VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_IMAGE_2D_VIEW_OF_3D_FEATURES_EXT = 1000393000;

    /** Extends {@code VkImageCreateFlagBits}. */
    public static final int VK_IMAGE_CREATE_2D_VIEW_COMPATIBLE_BIT_EXT = 0x20000;

    private EXTImage2dViewOf3d() {}

}