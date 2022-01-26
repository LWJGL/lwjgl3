/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.vulkan;

/**
 * {@code VK_KHR_maintenance2} adds a collection of minor features that were intentionally left out or overlooked from the original Vulkan 1.0 release.
 * 
 * <p>The new features are as follows:</p>
 * 
 * <ul>
 * <li>Allow the application to specify which aspect of an input attachment might be read for a given subpass.</li>
 * <li>Allow implementations to express the clipping behavior of points.</li>
 * <li>Allow creating images with usage flags that may not be supported for the base image’s format, but are supported for image views of the image that have a different but compatible format.</li>
 * <li>Allow creating uncompressed image views of compressed images.</li>
 * <li>Allow the application to select between an upper-left and lower-left origin for the tessellation domain space.</li>
 * <li>Adds two new image layouts for depth stencil images to allow either the depth or stencil aspect to be read-only while the other aspect is writable.</li>
 * </ul>
 * 
 * <h5>Input Attachment Specification</h5>
 * 
 * <p>Input attachment specification allows an application to specify which aspect of a multi-aspect image (e.g. a combined depth stencil format) will be accessed via a {@code subpassLoad} operation.</p>
 * 
 * <p>On some implementations there <b>may</b> be a performance penalty if the implementation does not know (at {@link VK10#vkCreateRenderPass CreateRenderPass} time) which aspect(s) of multi-aspect images <b>can</b> be accessed as input attachments.</p>
 * 
 * <h5>Promotion to Vulkan 1.1</h5>
 * 
 * <p>All functionality in this extension is included in core Vulkan 1.1, with the KHR suffix omitted. The original type, enum and command names are still available as aliases of the core functionality.</p>
 * 
 * <h5>Input Attachment Specification Example</h5>
 * 
 * <p>Consider the case where a render pass has two subpasses and two attachments.</p>
 * 
 * <p>Attachment 0 has the format {@link VK10#VK_FORMAT_D24_UNORM_S8_UINT FORMAT_D24_UNORM_S8_UINT}, attachment 1 has some color format.</p>
 * 
 * <p>Subpass 0 writes to attachment 0, subpass 1 reads only the depth information from attachment 0 (using inputAttachmentRead) and writes to attachment 1.</p>
 * 
 * <pre><code>
 *     VkInputAttachmentAspectReferenceKHR references[] = {
 *         {
 *             .subpass = 1,
 *             .inputAttachmentIndex = 0,
 *             .aspectMask = VK_IMAGE_ASPECT_DEPTH_BIT
 *         }
 *     };
 * 
 *     VkRenderPassInputAttachmentAspectCreateInfoKHR specifyAspects = {
 *         .sType = VK_STRUCTURE_TYPE_RENDER_PASS_INPUT_ATTACHMENT_ASPECT_CREATE_INFO_KHR,
 *         .pNext = NULL,
 *         .aspectReferenceCount = 1,
 *         .pAspectReferences = references
 *     };
 * 
 * 
 *     VkRenderPassCreateInfo createInfo = {
 *         ...
 *         .pNext = &amp;specifyAspects,
 *         ...
 *     };
 * 
 *     vkCreateRenderPass(...);</code></pre>
 * 
 * <h5>VK_KHR_maintenance2</h5>
 * 
 * <dl>
 * <dt><b>Name String</b></dt>
 * <dd>{@code VK_KHR_maintenance2}</dd>
 * <dt><b>Extension Type</b></dt>
 * <dd>Device extension</dd>
 * <dt><b>Registered Extension Number</b></dt>
 * <dd>118</dd>
 * <dt><b>Revision</b></dt>
 * <dd>1</dd>
 * <dt><b>Extension and Version Dependencies</b></dt>
 * <dd><ul>
 * <li>Requires Vulkan 1.0</li>
 * </ul></dd>
 * <dt><b>Deprecation state</b></dt>
 * <dd><ul>
 * <li><em>Promoted</em> to <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#versions-1.1-promotions">Vulkan 1.1</a></li>
 * </ul></dd>
 * <dt><b>Contact</b></dt>
 * <dd><ul>
 * <li>Michael Worcester <a target="_blank" href="https://github.com/KhronosGroup/Vulkan-Docs/issues/new?body=[VK_KHR_maintenance2]%20@michaelworcester%250A%3C%3CHere%20describe%20the%20issue%20or%20question%20you%20have%20about%20the%20VK_KHR_maintenance2%20extension%3E%3E">michaelworcester</a></li>
 * </ul></dd>
 * </dl>
 * 
 * <h5>Other Extension Metadata</h5>
 * 
 * <dl>
 * <dt><b>Last Modified Date</b></dt>
 * <dd>2017-09-05</dd>
 * <dt><b>Interactions and External Dependencies</b></dt>
 * <dd><ul>
 * <li>Promoted to Vulkan 1.1 Core</li>
 * </ul></dd>
 * <dt><b>Contributors</b></dt>
 * <dd><ul>
 * <li>Michael Worcester, Imagination Technologies</li>
 * <li>Stuart Smith, Imagination Technologies</li>
 * <li>Jeff Bolz, NVIDIA</li>
 * <li>Daniel Koch, NVIDIA</li>
 * <li>Jan-Harald Fredriksen, ARM</li>
 * <li>Daniel Rakos, AMD</li>
 * <li>Neil Henning, Codeplay</li>
 * <li>Piers Daniell, NVIDIA</li>
 * </ul></dd>
 * </dl>
 */
public final class KHRMaintenance2 {

    /** The extension specification version. */
    public static final int VK_KHR_MAINTENANCE_2_SPEC_VERSION = 1;

    /** The extension name. */
    public static final String VK_KHR_MAINTENANCE_2_EXTENSION_NAME = "VK_KHR_maintenance2";

    /** The extension specification version. */
    public static final int VK_KHR_MAINTENANCE2_SPEC_VERSION = VK_KHR_MAINTENANCE_2_SPEC_VERSION;

    /** The extension name. */
    public static final String VK_KHR_MAINTENANCE2_EXTENSION_NAME = VK_KHR_MAINTENANCE_2_EXTENSION_NAME;

    /**
     * Extends {@code VkImageCreateFlagBits}.
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #VK_IMAGE_CREATE_BLOCK_TEXEL_VIEW_COMPATIBLE_BIT_KHR IMAGE_CREATE_BLOCK_TEXEL_VIEW_COMPATIBLE_BIT_KHR}</li>
     * <li>{@link #VK_IMAGE_CREATE_EXTENDED_USAGE_BIT_KHR IMAGE_CREATE_EXTENDED_USAGE_BIT_KHR}</li>
     * </ul>
     */
    public static final int
        VK_IMAGE_CREATE_BLOCK_TEXEL_VIEW_COMPATIBLE_BIT_KHR = 0x80,
        VK_IMAGE_CREATE_EXTENDED_USAGE_BIT_KHR              = 0x100;

    /**
     * Extends {@code VkStructureType}.
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_POINT_CLIPPING_PROPERTIES_KHR STRUCTURE_TYPE_PHYSICAL_DEVICE_POINT_CLIPPING_PROPERTIES_KHR}</li>
     * <li>{@link #VK_STRUCTURE_TYPE_RENDER_PASS_INPUT_ATTACHMENT_ASPECT_CREATE_INFO_KHR STRUCTURE_TYPE_RENDER_PASS_INPUT_ATTACHMENT_ASPECT_CREATE_INFO_KHR}</li>
     * <li>{@link #VK_STRUCTURE_TYPE_IMAGE_VIEW_USAGE_CREATE_INFO_KHR STRUCTURE_TYPE_IMAGE_VIEW_USAGE_CREATE_INFO_KHR}</li>
     * <li>{@link #VK_STRUCTURE_TYPE_PIPELINE_TESSELLATION_DOMAIN_ORIGIN_STATE_CREATE_INFO_KHR STRUCTURE_TYPE_PIPELINE_TESSELLATION_DOMAIN_ORIGIN_STATE_CREATE_INFO_KHR}</li>
     * </ul>
     */
    public static final int
        VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_POINT_CLIPPING_PROPERTIES_KHR             = 1000117000,
        VK_STRUCTURE_TYPE_RENDER_PASS_INPUT_ATTACHMENT_ASPECT_CREATE_INFO_KHR       = 1000117001,
        VK_STRUCTURE_TYPE_IMAGE_VIEW_USAGE_CREATE_INFO_KHR                          = 1000117002,
        VK_STRUCTURE_TYPE_PIPELINE_TESSELLATION_DOMAIN_ORIGIN_STATE_CREATE_INFO_KHR = 1000117003;

    /**
     * Extends {@code VkImageLayout}.
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #VK_IMAGE_LAYOUT_DEPTH_READ_ONLY_STENCIL_ATTACHMENT_OPTIMAL_KHR IMAGE_LAYOUT_DEPTH_READ_ONLY_STENCIL_ATTACHMENT_OPTIMAL_KHR}</li>
     * <li>{@link #VK_IMAGE_LAYOUT_DEPTH_ATTACHMENT_STENCIL_READ_ONLY_OPTIMAL_KHR IMAGE_LAYOUT_DEPTH_ATTACHMENT_STENCIL_READ_ONLY_OPTIMAL_KHR}</li>
     * </ul>
     */
    public static final int
        VK_IMAGE_LAYOUT_DEPTH_READ_ONLY_STENCIL_ATTACHMENT_OPTIMAL_KHR = 1000117000,
        VK_IMAGE_LAYOUT_DEPTH_ATTACHMENT_STENCIL_READ_ONLY_OPTIMAL_KHR = 1000117001;

    /**
     * Extends {@code VkPointClippingBehavior}.
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #VK_POINT_CLIPPING_BEHAVIOR_ALL_CLIP_PLANES_KHR POINT_CLIPPING_BEHAVIOR_ALL_CLIP_PLANES_KHR}</li>
     * <li>{@link #VK_POINT_CLIPPING_BEHAVIOR_USER_CLIP_PLANES_ONLY_KHR POINT_CLIPPING_BEHAVIOR_USER_CLIP_PLANES_ONLY_KHR}</li>
     * </ul>
     */
    public static final int
        VK_POINT_CLIPPING_BEHAVIOR_ALL_CLIP_PLANES_KHR       = 0,
        VK_POINT_CLIPPING_BEHAVIOR_USER_CLIP_PLANES_ONLY_KHR = 1;

    /**
     * Extends {@code VkTessellationDomainOrigin}.
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #VK_TESSELLATION_DOMAIN_ORIGIN_UPPER_LEFT_KHR TESSELLATION_DOMAIN_ORIGIN_UPPER_LEFT_KHR}</li>
     * <li>{@link #VK_TESSELLATION_DOMAIN_ORIGIN_LOWER_LEFT_KHR TESSELLATION_DOMAIN_ORIGIN_LOWER_LEFT_KHR}</li>
     * </ul>
     */
    public static final int
        VK_TESSELLATION_DOMAIN_ORIGIN_UPPER_LEFT_KHR = 0,
        VK_TESSELLATION_DOMAIN_ORIGIN_LOWER_LEFT_KHR = 1;

    private KHRMaintenance2() {}

}