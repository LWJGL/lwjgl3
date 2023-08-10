/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.vulkan;

/**
 * This extension adds a mechanism to provide feedback to an application about whether the subpasses specified on render pass creation are merged by the implementation. Additionally, it provides a control to enable or disable subpass merging in the render pass.
 * 
 * <h5>VK_EXT_subpass_merge_feedback</h5>
 * 
 * <dl>
 * <dt><b>Name String</b></dt>
 * <dd>{@code VK_EXT_subpass_merge_feedback}</dd>
 * <dt><b>Extension Type</b></dt>
 * <dd>Device extension</dd>
 * <dt><b>Registered Extension Number</b></dt>
 * <dd>459</dd>
 * <dt><b>Revision</b></dt>
 * <dd>2</dd>
 * <dt><b>Extension and Version Dependencies</b></dt>
 * <dd>{@link KHRGetPhysicalDeviceProperties2 VK_KHR_get_physical_device_properties2}</dd>
 * <dt><b>Contact</b></dt>
 * <dd><ul>
 * <li>Ting Wei <a href="https://github.com/KhronosGroup/Vulkan-Docs/issues/new?body=[VK_EXT_subpass_merge_feedback]%20@catweiting%250A*Here%20describe%20the%20issue%20or%20question%20you%20have%20about%20the%20VK_EXT_subpass_merge_feedback%20extension*">catweiting</a></li>
 * </ul></dd>
 * <dt><b>Extension Proposal</b></dt>
 * <dd><a href="https://github.com/KhronosGroup/Vulkan-Docs/tree/main/proposals/VK_EXT_subpass_merge_feedback.adoc">VK_EXT_subpass_merge_feedback</a></dd>
 * </dl>
 * 
 * <h5>Other Extension Metadata</h5>
 * 
 * <dl>
 * <dt><b>Last Modified Date</b></dt>
 * <dd>2022-05-24</dd>
 * <dt><b>IP Status</b></dt>
 * <dd>No known IP claims.</dd>
 * <dt><b>Contributors</b></dt>
 * <dd><ul>
 * <li>Jan-Harald Fredriksen, Arm</li>
 * <li>Jorg Wagner, Arm</li>
 * <li>Ting Wei, Arm</li>
 * </ul></dd>
 * </dl>
 */
public final class EXTSubpassMergeFeedback {

    /** The extension specification version. */
    public static final int VK_EXT_SUBPASS_MERGE_FEEDBACK_SPEC_VERSION = 2;

    /** The extension name. */
    public static final String VK_EXT_SUBPASS_MERGE_FEEDBACK_EXTENSION_NAME = "VK_EXT_subpass_merge_feedback";

    /**
     * Extends {@code VkStructureType}.
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_SUBPASS_MERGE_FEEDBACK_FEATURES_EXT STRUCTURE_TYPE_PHYSICAL_DEVICE_SUBPASS_MERGE_FEEDBACK_FEATURES_EXT}</li>
     * <li>{@link #VK_STRUCTURE_TYPE_RENDER_PASS_CREATION_CONTROL_EXT STRUCTURE_TYPE_RENDER_PASS_CREATION_CONTROL_EXT}</li>
     * <li>{@link #VK_STRUCTURE_TYPE_RENDER_PASS_CREATION_FEEDBACK_CREATE_INFO_EXT STRUCTURE_TYPE_RENDER_PASS_CREATION_FEEDBACK_CREATE_INFO_EXT}</li>
     * <li>{@link #VK_STRUCTURE_TYPE_RENDER_PASS_SUBPASS_FEEDBACK_CREATE_INFO_EXT STRUCTURE_TYPE_RENDER_PASS_SUBPASS_FEEDBACK_CREATE_INFO_EXT}</li>
     * </ul>
     */
    public static final int
        VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_SUBPASS_MERGE_FEEDBACK_FEATURES_EXT = 1000458000,
        VK_STRUCTURE_TYPE_RENDER_PASS_CREATION_CONTROL_EXT                    = 1000458001,
        VK_STRUCTURE_TYPE_RENDER_PASS_CREATION_FEEDBACK_CREATE_INFO_EXT       = 1000458002,
        VK_STRUCTURE_TYPE_RENDER_PASS_SUBPASS_FEEDBACK_CREATE_INFO_EXT        = 1000458003;

    /**
     * VkSubpassMergeStatusEXT - Specify a subpass merging status
     * 
     * <h5>Description</h5>
     * 
     * <ul>
     * <li>{@link #VK_SUBPASS_MERGE_STATUS_MERGED_EXT SUBPASS_MERGE_STATUS_MERGED_EXT} specifies the subpass is merged with a previous subpass.</li>
     * <li>{@link #VK_SUBPASS_MERGE_STATUS_DISALLOWED_EXT SUBPASS_MERGE_STATUS_DISALLOWED_EXT} specifies the subpass is disallowed to merge with previous subpass. If the render pass does not allow subpass merging, then all subpass statuses are set to this value. If a subpass description does not allow subpass merging, then only that subpass’s status is set to this value.</li>
     * <li>{@link #VK_SUBPASS_MERGE_STATUS_NOT_MERGED_SIDE_EFFECTS_EXT SUBPASS_MERGE_STATUS_NOT_MERGED_SIDE_EFFECTS_EXT} specifies the subpass is not merged because it contains side effects.</li>
     * <li>{@link #VK_SUBPASS_MERGE_STATUS_NOT_MERGED_SAMPLES_MISMATCH_EXT SUBPASS_MERGE_STATUS_NOT_MERGED_SAMPLES_MISMATCH_EXT} specifies the subpass is not merged because sample count is not compatible with previous subpass.</li>
     * <li>{@link #VK_SUBPASS_MERGE_STATUS_NOT_MERGED_VIEWS_MISMATCH_EXT SUBPASS_MERGE_STATUS_NOT_MERGED_VIEWS_MISMATCH_EXT} specifies the subpass is not merged because view masks do not match with previous subpass.</li>
     * <li>{@link #VK_SUBPASS_MERGE_STATUS_NOT_MERGED_ALIASING_EXT SUBPASS_MERGE_STATUS_NOT_MERGED_ALIASING_EXT} specifies the subpass is not merged because of attachments aliasing between them.</li>
     * <li>{@link #VK_SUBPASS_MERGE_STATUS_NOT_MERGED_DEPENDENCIES_EXT SUBPASS_MERGE_STATUS_NOT_MERGED_DEPENDENCIES_EXT} specifies the subpass is not merged because subpass dependencies do not allow merging.</li>
     * <li>{@link #VK_SUBPASS_MERGE_STATUS_NOT_MERGED_INCOMPATIBLE_INPUT_ATTACHMENT_EXT SUBPASS_MERGE_STATUS_NOT_MERGED_INCOMPATIBLE_INPUT_ATTACHMENT_EXT} specifies the subpass is not merged because input attachment is not a color attachment from previous subpass or the formats are incompatible.</li>
     * <li>{@link #VK_SUBPASS_MERGE_STATUS_NOT_MERGED_TOO_MANY_ATTACHMENTS_EXT SUBPASS_MERGE_STATUS_NOT_MERGED_TOO_MANY_ATTACHMENTS_EXT} specifies the subpass is not merged because of too many attachments.</li>
     * <li>{@link #VK_SUBPASS_MERGE_STATUS_NOT_MERGED_INSUFFICIENT_STORAGE_EXT SUBPASS_MERGE_STATUS_NOT_MERGED_INSUFFICIENT_STORAGE_EXT} specifies the subpass is not merged because of insufficient memory.</li>
     * <li>{@link #VK_SUBPASS_MERGE_STATUS_NOT_MERGED_DEPTH_STENCIL_COUNT_EXT SUBPASS_MERGE_STATUS_NOT_MERGED_DEPTH_STENCIL_COUNT_EXT} specifies the subpass is not merged because of too many depth/stencil attachments.</li>
     * <li>{@link #VK_SUBPASS_MERGE_STATUS_NOT_MERGED_RESOLVE_ATTACHMENT_REUSE_EXT SUBPASS_MERGE_STATUS_NOT_MERGED_RESOLVE_ATTACHMENT_REUSE_EXT} specifies the subpass is not merged because a resolve attachment is reused as an input attachment in a subsequent subpass.</li>
     * <li>{@link #VK_SUBPASS_MERGE_STATUS_NOT_MERGED_SINGLE_SUBPASS_EXT SUBPASS_MERGE_STATUS_NOT_MERGED_SINGLE_SUBPASS_EXT} specifies the subpass is not merged because the render pass has only one subpass.</li>
     * <li>{@link #VK_SUBPASS_MERGE_STATUS_NOT_MERGED_UNSPECIFIED_EXT SUBPASS_MERGE_STATUS_NOT_MERGED_UNSPECIFIED_EXT} specifies other reasons why subpass is not merged. It is also the recommended default value that should be reported when a subpass is not merged and when no other value is appropriate.</li>
     * </ul>
     * 
     * <h5>See Also</h5>
     * 
     * <p>{@link VkRenderPassSubpassFeedbackInfoEXT}</p>
     */
    public static final int
        VK_SUBPASS_MERGE_STATUS_MERGED_EXT                                   = 0,
        VK_SUBPASS_MERGE_STATUS_DISALLOWED_EXT                               = 1,
        VK_SUBPASS_MERGE_STATUS_NOT_MERGED_SIDE_EFFECTS_EXT                  = 2,
        VK_SUBPASS_MERGE_STATUS_NOT_MERGED_SAMPLES_MISMATCH_EXT              = 3,
        VK_SUBPASS_MERGE_STATUS_NOT_MERGED_VIEWS_MISMATCH_EXT                = 4,
        VK_SUBPASS_MERGE_STATUS_NOT_MERGED_ALIASING_EXT                      = 5,
        VK_SUBPASS_MERGE_STATUS_NOT_MERGED_DEPENDENCIES_EXT                  = 6,
        VK_SUBPASS_MERGE_STATUS_NOT_MERGED_INCOMPATIBLE_INPUT_ATTACHMENT_EXT = 7,
        VK_SUBPASS_MERGE_STATUS_NOT_MERGED_TOO_MANY_ATTACHMENTS_EXT          = 8,
        VK_SUBPASS_MERGE_STATUS_NOT_MERGED_INSUFFICIENT_STORAGE_EXT          = 9,
        VK_SUBPASS_MERGE_STATUS_NOT_MERGED_DEPTH_STENCIL_COUNT_EXT           = 10,
        VK_SUBPASS_MERGE_STATUS_NOT_MERGED_RESOLVE_ATTACHMENT_REUSE_EXT      = 11,
        VK_SUBPASS_MERGE_STATUS_NOT_MERGED_SINGLE_SUBPASS_EXT                = 12,
        VK_SUBPASS_MERGE_STATUS_NOT_MERGED_UNSPECIFIED_EXT                   = 13;

    private EXTSubpassMergeFeedback() {}

}