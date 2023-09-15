/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.vulkan;

/**
 * {@link EXTFrameBoundary VK_EXT_frame_boundary} is a device extension that helps <b>tools</b> (such as debuggers) to group queue submissions per frames in non-trivial scenarios, typically when {@link KHRSwapchain#vkQueuePresentKHR QueuePresentKHR} is not a relevant frame boundary delimiter.
 * 
 * <h5>VK_EXT_frame_boundary</h5>
 * 
 * <dl>
 * <dt><b>Name String</b></dt>
 * <dd>{@code VK_EXT_frame_boundary}</dd>
 * <dt><b>Extension Type</b></dt>
 * <dd>Device extension</dd>
 * <dt><b>Registered Extension Number</b></dt>
 * <dd>376</dd>
 * <dt><b>Revision</b></dt>
 * <dd>1</dd>
 * <dt><b>Contact</b></dt>
 * <dd><ul>
 * <li>James Fitzpatrick <a href="https://github.com/KhronosGroup/Vulkan-Docs/issues/new?body=[VK_EXT_frame_boundary]%20@jamesfitzpatrick%250A*Here%20describe%20the%20issue%20or%20question%20you%20have%20about%20the%20VK_EXT_frame_boundary%20extension*">jamesfitzpatrick</a></li>
 * </ul></dd>
 * <dt><b>Extension Proposal</b></dt>
 * <dd><a href="https://github.com/KhronosGroup/Vulkan-Docs/tree/main/proposals/VK_EXT_frame_boundary.adoc">VK_EXT_frame_boundary</a></dd>
 * </dl>
 * 
 * <h5>Other Extension Metadata</h5>
 * 
 * <dl>
 * <dt><b>Last Modified Date</b></dt>
 * <dd>2023-06-14</dd>
 * <dt><b>Contributors</b></dt>
 * <dd><ul>
 * <li>James Fitzpatrick, Imagination Technologies</li>
 * <li>Hugues Evrard, Google</li>
 * <li>Melih Yasin Yalcin, Google</li>
 * <li>Andrew Garrard, Imagination Technologies</li>
 * <li>Jan-Harald Fredriksen, Arm</li>
 * <li>Vassili Nikolaev, NVIDIA</li>
 * <li>Ting Wei, Huawei</li>
 * </ul></dd>
 * </dl>
 */
public final class EXTFrameBoundary {

    /** The extension specification version. */
    public static final int VK_EXT_FRAME_BOUNDARY_SPEC_VERSION = 1;

    /** The extension name. */
    public static final String VK_EXT_FRAME_BOUNDARY_EXTENSION_NAME = "VK_EXT_frame_boundary";

    /**
     * Extends {@code VkStructureType}.
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_FRAME_BOUNDARY_FEATURES_EXT STRUCTURE_TYPE_PHYSICAL_DEVICE_FRAME_BOUNDARY_FEATURES_EXT}</li>
     * <li>{@link #VK_STRUCTURE_TYPE_FRAME_BOUNDARY_EXT STRUCTURE_TYPE_FRAME_BOUNDARY_EXT}</li>
     * </ul>
     */
    public static final int
        VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_FRAME_BOUNDARY_FEATURES_EXT = 1000375000,
        VK_STRUCTURE_TYPE_FRAME_BOUNDARY_EXT                          = 1000375001;

    /**
     * VkFrameBoundaryFlagBitsEXT - Bitmask specifying whether a queue submission is the last one for a given frame
     * 
     * <h5>Description</h5>
     * 
     * <ul>
     * <li>{@link #VK_FRAME_BOUNDARY_FRAME_END_BIT_EXT FRAME_BOUNDARY_FRAME_END_BIT_EXT} specifies that this queue submission is the last one for this frame, i.e. once this queue submission has terminated, then the work for this frame is completed.</li>
     * </ul>
     */
    public static final int VK_FRAME_BOUNDARY_FRAME_END_BIT_EXT = 0x1;

    private EXTFrameBoundary() {}

}