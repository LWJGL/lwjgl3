/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.vulkan;

/**
 * With careful usage of resolve attachments, multisampled image memory allocated with {@link VK10#VK_MEMORY_PROPERTY_LAZILY_ALLOCATED_BIT MEMORY_PROPERTY_LAZILY_ALLOCATED_BIT}, {@code loadOp} not equal to {@link VK10#VK_ATTACHMENT_LOAD_OP_LOAD ATTACHMENT_LOAD_OP_LOAD} and {@code storeOp} not equal to {@link VK10#VK_ATTACHMENT_STORE_OP_STORE ATTACHMENT_STORE_OP_STORE}, a Vulkan application is able to efficiently perform multisampled rendering without incurring any additional memory penalty on some implementations.
 * 
 * <p>Under certain circumstances however, the application may not be able to complete its multisampled rendering within a single render pass; for example if it does partial rasterization from frame to frame, blending on an image from a previous frame, or in emulation of GL_EXT_multisampled_render_to_texture. In such cases, the application can use an initial subpass to effectively load single-sampled data from the next subpass’s resolve attachment and fill in the multisampled attachment which otherwise uses {@code loadOp} equal to {@link VK10#VK_ATTACHMENT_LOAD_OP_DONT_CARE ATTACHMENT_LOAD_OP_DONT_CARE}. However, this is not always possible (for example for stencil in the absence of VK_EXT_shader_stencil_export) and has multiple drawbacks.</p>
 * 
 * <p>Some implementations are able to perform said operation efficiently in hardware, effectively loading a multisampled attachment from the contents of a single sampled one. Together with the ability to perform a resolve operation at the end of a subpass, these implementations are able to perform multisampled rendering on single-sampled attachments with no extra memory or bandwidth overhead. This extension exposes this capability by allowing a framebuffer and render pass to include single-sampled attachments while rendering is done with a specified number of samples.</p>
 * 
 * <h5>VK_EXT_multisampled_render_to_single_sampled</h5>
 * 
 * <dl>
 * <dt><b>Name String</b></dt>
 * <dd>{@code VK_EXT_multisampled_render_to_single_sampled}</dd>
 * <dt><b>Extension Type</b></dt>
 * <dd>Device extension</dd>
 * <dt><b>Registered Extension Number</b></dt>
 * <dd>377</dd>
 * <dt><b>Revision</b></dt>
 * <dd>1</dd>
 * <dt><b>Extension and Version Dependencies</b></dt>
 * <dd>{@link KHRCreateRenderpass2 VK_KHR_create_renderpass2} and {@link KHRDepthStencilResolve VK_KHR_depth_stencil_resolve}</dd>
 * <dt><b>Contact</b></dt>
 * <dd><ul>
 * <li>Shahbaz Youssefi <a href="https://github.com/KhronosGroup/Vulkan-Docs/issues/new?body=[VK_EXT_multisampled_render_to_single_sampled]%20@syoussefi%250A*Here%20describe%20the%20issue%20or%20question%20you%20have%20about%20the%20VK_EXT_multisampled_render_to_single_sampled%20extension*">syoussefi</a></li>
 * </ul></dd>
 * <dt><b>Extension Proposal</b></dt>
 * <dd><a href="https://github.com/KhronosGroup/Vulkan-Docs/tree/main/proposals/VK_EXT_multisampled_render_to_single_sampled.adoc">VK_EXT_multisampled_render_to_single_sampled</a></dd>
 * </dl>
 * 
 * <h5>Other Extension Metadata</h5>
 * 
 * <dl>
 * <dt><b>Last Modified Date</b></dt>
 * <dd>2021-04-16</dd>
 * <dt><b>IP Status</b></dt>
 * <dd>No known IP claims.</dd>
 * <dt><b>Contributors</b></dt>
 * <dd><ul>
 * <li>Shahbaz Youssefi, Google</li>
 * <li>Jan-Harald Fredriksen, Arm</li>
 * <li>Jörg Wagner, Arm</li>
 * <li>Matthew Netsch, Qualcomm Technologies, Inc.</li>
 * <li>Jarred Davies, Imagination Technologies</li>
 * </ul></dd>
 * </dl>
 */
public final class EXTMultisampledRenderToSingleSampled {

    /** The extension specification version. */
    public static final int VK_EXT_MULTISAMPLED_RENDER_TO_SINGLE_SAMPLED_SPEC_VERSION = 1;

    /** The extension name. */
    public static final String VK_EXT_MULTISAMPLED_RENDER_TO_SINGLE_SAMPLED_EXTENSION_NAME = "VK_EXT_multisampled_render_to_single_sampled";

    /**
     * Extends {@code VkStructureType}.
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_MULTISAMPLED_RENDER_TO_SINGLE_SAMPLED_FEATURES_EXT STRUCTURE_TYPE_PHYSICAL_DEVICE_MULTISAMPLED_RENDER_TO_SINGLE_SAMPLED_FEATURES_EXT}</li>
     * <li>{@link #VK_STRUCTURE_TYPE_SUBPASS_RESOLVE_PERFORMANCE_QUERY_EXT STRUCTURE_TYPE_SUBPASS_RESOLVE_PERFORMANCE_QUERY_EXT}</li>
     * <li>{@link #VK_STRUCTURE_TYPE_MULTISAMPLED_RENDER_TO_SINGLE_SAMPLED_INFO_EXT STRUCTURE_TYPE_MULTISAMPLED_RENDER_TO_SINGLE_SAMPLED_INFO_EXT}</li>
     * </ul>
     */
    public static final int
        VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_MULTISAMPLED_RENDER_TO_SINGLE_SAMPLED_FEATURES_EXT = 1000376000,
        VK_STRUCTURE_TYPE_SUBPASS_RESOLVE_PERFORMANCE_QUERY_EXT                              = 1000376001,
        VK_STRUCTURE_TYPE_MULTISAMPLED_RENDER_TO_SINGLE_SAMPLED_INFO_EXT                     = 1000376002;

    /** Extends {@code VkImageCreateFlagBits}. */
    public static final int VK_IMAGE_CREATE_MULTISAMPLED_RENDER_TO_SINGLE_SAMPLED_BIT_EXT = 0x40000;

    private EXTMultisampledRenderToSingleSampled() {}

}