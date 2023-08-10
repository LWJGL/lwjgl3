/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.vulkan;

/**
 * This extension adds a new image layout, {@link #VK_IMAGE_LAYOUT_ATTACHMENT_FEEDBACK_LOOP_OPTIMAL_EXT IMAGE_LAYOUT_ATTACHMENT_FEEDBACK_LOOP_OPTIMAL_EXT}, which allows applications to have an image layout in which they are able to both render to and sample/fetch from the same subresource of an image in a given render pass.
 * 
 * <h5>VK_EXT_attachment_feedback_loop_layout</h5>
 * 
 * <dl>
 * <dt><b>Name String</b></dt>
 * <dd>{@code VK_EXT_attachment_feedback_loop_layout}</dd>
 * <dt><b>Extension Type</b></dt>
 * <dd>Device extension</dd>
 * <dt><b>Registered Extension Number</b></dt>
 * <dd>340</dd>
 * <dt><b>Revision</b></dt>
 * <dd>2</dd>
 * <dt><b>Extension and Version Dependencies</b></dt>
 * <dd>{@link KHRGetPhysicalDeviceProperties2 VK_KHR_get_physical_device_properties2}</dd>
 * <dt><b>Contact</b></dt>
 * <dd><ul>
 * <li>Joshua Ashton <a href="https://github.com/KhronosGroup/Vulkan-Docs/issues/new?body=[VK_EXT_attachment_feedback_loop_layout]%20@Joshua-Ashton%250A*Here%20describe%20the%20issue%20or%20question%20you%20have%20about%20the%20VK_EXT_attachment_feedback_loop_layout%20extension*">Joshua-Ashton</a></li>
 * </ul></dd>
 * <dt><b>Extension Proposal</b></dt>
 * <dd><a href="https://github.com/KhronosGroup/Vulkan-Docs/tree/main/proposals/VK_EXT_attachment_feedback_loop_layout.adoc">VK_EXT_attachment_feedback_loop_layout</a></dd>
 * </dl>
 * 
 * <h5>Other Extension Metadata</h5>
 * 
 * <dl>
 * <dt><b>Last Modified Date</b></dt>
 * <dd>2022-04-04</dd>
 * <dt><b>IP Status</b></dt>
 * <dd>No known IP claims.</dd>
 * <dt><b>Contributors</b></dt>
 * <dd><ul>
 * <li>Joshua Ashton, Valve</li>
 * <li>Faith Ekstrand, Collabora</li>
 * <li>Bas Nieuwenhuizen, Google</li>
 * <li>Samuel Iglesias Gonsálvez, Igalia</li>
 * <li>Ralph Potter, Samsung</li>
 * <li>Jan-Harald Fredriksen, Arm</li>
 * <li>Ricardo Garcia, Igalia</li>
 * </ul></dd>
 * </dl>
 */
public final class EXTAttachmentFeedbackLoopLayout {

    /** The extension specification version. */
    public static final int VK_EXT_ATTACHMENT_FEEDBACK_LOOP_LAYOUT_SPEC_VERSION = 2;

    /** The extension name. */
    public static final String VK_EXT_ATTACHMENT_FEEDBACK_LOOP_LAYOUT_EXTENSION_NAME = "VK_EXT_attachment_feedback_loop_layout";

    /** Extends {@code VkStructureType}. */
    public static final int VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_ATTACHMENT_FEEDBACK_LOOP_LAYOUT_FEATURES_EXT = 1000339000;

    /** Extends {@code VkImageLayout}. */
    public static final int VK_IMAGE_LAYOUT_ATTACHMENT_FEEDBACK_LOOP_OPTIMAL_EXT = 1000339000;

    /** Extends {@code VkImageUsageFlagBits}. */
    public static final int VK_IMAGE_USAGE_ATTACHMENT_FEEDBACK_LOOP_BIT_EXT = 0x80000;

    /**
     * Extends {@code VkPipelineCreateFlagBits}.
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #VK_PIPELINE_CREATE_COLOR_ATTACHMENT_FEEDBACK_LOOP_BIT_EXT PIPELINE_CREATE_COLOR_ATTACHMENT_FEEDBACK_LOOP_BIT_EXT}</li>
     * <li>{@link #VK_PIPELINE_CREATE_DEPTH_STENCIL_ATTACHMENT_FEEDBACK_LOOP_BIT_EXT PIPELINE_CREATE_DEPTH_STENCIL_ATTACHMENT_FEEDBACK_LOOP_BIT_EXT}</li>
     * </ul>
     */
    public static final int
        VK_PIPELINE_CREATE_COLOR_ATTACHMENT_FEEDBACK_LOOP_BIT_EXT         = 0x2000000,
        VK_PIPELINE_CREATE_DEPTH_STENCIL_ATTACHMENT_FEEDBACK_LOOP_BIT_EXT = 0x4000000;

    /** Extends {@code VkDependencyFlagBits}. */
    public static final int VK_DEPENDENCY_FEEDBACK_LOOP_BIT_EXT = 0x8;

    private EXTAttachmentFeedbackLoopLayout() {}

}