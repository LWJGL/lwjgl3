/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.vulkan;

/**
 * This extension adds support for automatically resolving multisampled depth/stencil attachments in a subpass in a similar manner as for color attachments.
 * 
 * <dl>
 * <dt><b>Name String</b></dt>
 * <dd>{@code VK_KHR_depth_stencil_resolve}</dd>
 * <dt><b>Extension Type</b></dt>
 * <dd>Device extension</dd>
 * <dt><b>Registered Extension Number</b></dt>
 * <dd>200</dd>
 * <dt><b>Revision</b></dt>
 * <dd>1</dd>
 * <dt><b>Extension and Version Dependencies</b></dt>
 * <dd><ul>
 * <li>Requires Vulkan 1.0</li>
 * <li>Requires {@link KHRCreateRenderpass2 VK_KHR_create_renderpass2}</li>
 * </ul></dd>
 * <dt><b>Contact</b></dt>
 * <dd><ul>
 * <li>Jan-Harald Fredriksen <a target="_blank" href="https://github.com/KhronosGroup/Vulkan-Docs/issues/new?title=VK_KHR_depth_stencil_resolve:%20&amp;body=@janharald%20">janharald</a></li>
 * </ul></dd>
 * <dt>Last Modified Date</dt>
 * <dd>2018-04-09</dd>
 * <dt>Contributors</dt>
 * <dd><ul>
 * <li>Jan-Harald Fredriksen, Arm</li>
 * <li>Andrew Garrard, Samsung Electronics</li>
 * <li>Soowan Park, Samsung Electronics</li>
 * <li>Jeff Bolz, NVIDIA</li>
 * <li>Daniel Rakos, AMD</li>
 * </ul></dd>
 * </dl>
 */
public final class KHRDepthStencilResolve {

    /** The extension specification version. */
    public static final int VK_KHR_DEPTH_STENCIL_RESOLVE_SPEC_VERSION = 1;

    /** The extension name. */
    public static final String VK_KHR_DEPTH_STENCIL_RESOLVE_EXTENSION_NAME = "VK_KHR_depth_stencil_resolve";

    /**
     * Extends {@code VkStructureType}.
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_DEPTH_STENCIL_RESOLVE_PROPERTIES_KHR STRUCTURE_TYPE_PHYSICAL_DEVICE_DEPTH_STENCIL_RESOLVE_PROPERTIES_KHR}</li>
     * <li>{@link #VK_STRUCTURE_TYPE_SUBPASS_DESCRIPTION_DEPTH_STENCIL_RESOLVE_KHR STRUCTURE_TYPE_SUBPASS_DESCRIPTION_DEPTH_STENCIL_RESOLVE_KHR}</li>
     * </ul>
     */
    public static final int
        VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_DEPTH_STENCIL_RESOLVE_PROPERTIES_KHR = 1000199000,
        VK_STRUCTURE_TYPE_SUBPASS_DESCRIPTION_DEPTH_STENCIL_RESOLVE_KHR        = 1000199001;

    /**
     * VkResolveModeFlagBitsKHR - Bitmask indicating supported depth and stencil resolve modes
     * 
     * <h5>Description</h5>
     * 
     * <ul>
     * <li>{@link #VK_RESOLVE_MODE_NONE_KHR RESOLVE_MODE_NONE_KHR} indicates that no resolve operation is done.</li>
     * <li>{@link #VK_RESOLVE_MODE_SAMPLE_ZERO_BIT_KHR RESOLVE_MODE_SAMPLE_ZERO_BIT_KHR} indicates that result of the resolve operation is equal to the value of sample 0.</li>
     * <li>{@link #VK_RESOLVE_MODE_AVERAGE_BIT_KHR RESOLVE_MODE_AVERAGE_BIT_KHR} indicates that result of the resolve operation is the average of the sample values.</li>
     * <li>{@link #VK_RESOLVE_MODE_MIN_BIT_KHR RESOLVE_MODE_MIN_BIT_KHR} indicates that result of the resolve operation is the minimum of the sample values.</li>
     * <li>{@link #VK_RESOLVE_MODE_MAX_BIT_KHR RESOLVE_MODE_MAX_BIT_KHR} indicates that result of the resolve operation is the maximum of the sample values.</li>
     * </ul>
     * 
     * <h5>See Also</h5>
     * 
     * <p>{@code VkResolveModeFlagsKHR}, {@link VkSubpassDescriptionDepthStencilResolveKHR}</p>
     */
    public static final int
        VK_RESOLVE_MODE_NONE_KHR            = 0,
        VK_RESOLVE_MODE_SAMPLE_ZERO_BIT_KHR = 0x1,
        VK_RESOLVE_MODE_AVERAGE_BIT_KHR     = 0x2,
        VK_RESOLVE_MODE_MIN_BIT_KHR         = 0x4,
        VK_RESOLVE_MODE_MAX_BIT_KHR         = 0x8;

    private KHRDepthStencilResolve() {}

}