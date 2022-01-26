/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.vulkan;

/**
 * This extension introduces the possibility for the application to control the order of primitive rasterization. In unextended Vulkan, the following stages are guaranteed to execute in <em>API order</em>:
 * 
 * <ul>
 * <li>depth bounds test</li>
 * <li>stencil test, stencil op, and stencil write</li>
 * <li>depth test and depth write</li>
 * <li>occlusion queries</li>
 * <li>blending, logic op, and color write</li>
 * </ul>
 * 
 * <p>This extension enables applications to opt into a relaxed, implementation defined primitive rasterization order that may allow better parallel processing of primitives and thus enabling higher primitive throughput. It is applicable in cases where the primitive rasterization order is known to not affect the output of the rendering or any differences caused by a different rasterization order are not a concern from the point of view of the application’s purpose.</p>
 * 
 * <p>A few examples of cases when using the relaxed primitive rasterization order would not have an effect on the final rendering:</p>
 * 
 * <ul>
 * <li>If the primitives rendered are known to not overlap in framebuffer space.</li>
 * <li>If depth testing is used with a comparison operator of {@link VK10#VK_COMPARE_OP_LESS COMPARE_OP_LESS}, {@link VK10#VK_COMPARE_OP_LESS_OR_EQUAL COMPARE_OP_LESS_OR_EQUAL}, {@link VK10#VK_COMPARE_OP_GREATER COMPARE_OP_GREATER}, or {@link VK10#VK_COMPARE_OP_GREATER_OR_EQUAL COMPARE_OP_GREATER_OR_EQUAL}, and the primitives rendered are known to not overlap in clip space.</li>
 * <li>If depth testing is not used and blending is enabled for all attachments with a commutative blend operator.</li>
 * </ul>
 * 
 * <h5>Examples</h5>
 * 
 * <p>None</p>
 * 
 * <h5>VK_AMD_rasterization_order</h5>
 * 
 * <dl>
 * <dt><b>Name String</b></dt>
 * <dd>{@code VK_AMD_rasterization_order}</dd>
 * <dt><b>Extension Type</b></dt>
 * <dd>Device extension</dd>
 * <dt><b>Registered Extension Number</b></dt>
 * <dd>19</dd>
 * <dt><b>Revision</b></dt>
 * <dd>1</dd>
 * <dt><b>Extension and Version Dependencies</b></dt>
 * <dd><ul>
 * <li>Requires Vulkan 1.0</li>
 * </ul></dd>
 * <dt><b>Contact</b></dt>
 * <dd><ul>
 * <li>Daniel Rakos <a target="_blank" href="https://github.com/KhronosGroup/Vulkan-Docs/issues/new?body=[VK_AMD_rasterization_order]%20@drakos-amd%250A%3C%3CHere%20describe%20the%20issue%20or%20question%20you%20have%20about%20the%20VK_AMD_rasterization_order%20extension%3E%3E">drakos-amd</a></li>
 * </ul></dd>
 * </dl>
 * 
 * <h5>Other Extension Metadata</h5>
 * 
 * <dl>
 * <dt><b>Last Modified Date</b></dt>
 * <dd>2016-04-25</dd>
 * <dt><b>IP Status</b></dt>
 * <dd>No known IP claims.</dd>
 * <dt><b>Contributors</b></dt>
 * <dd><ul>
 * <li>Matthaeus G. Chajdas, AMD</li>
 * <li>Jaakko Konttinen, AMD</li>
 * <li>Daniel Rakos, AMD</li>
 * <li>Graham Sellers, AMD</li>
 * <li>Dominik Witczak, AMD</li>
 * </ul></dd>
 * </dl>
 */
public final class AMDRasterizationOrder {

    /** The extension specification version. */
    public static final int VK_AMD_RASTERIZATION_ORDER_SPEC_VERSION = 1;

    /** The extension name. */
    public static final String VK_AMD_RASTERIZATION_ORDER_EXTENSION_NAME = "VK_AMD_rasterization_order";

    /** Extends {@code VkStructureType}. */
    public static final int VK_STRUCTURE_TYPE_PIPELINE_RASTERIZATION_STATE_RASTERIZATION_ORDER_AMD = 1000018000;

    /**
     * VkRasterizationOrderAMD - Specify rasterization order for a graphics pipeline
     * 
     * <h5>Description</h5>
     * 
     * <ul>
     * <li>{@link #VK_RASTERIZATION_ORDER_STRICT_AMD RASTERIZATION_ORDER_STRICT_AMD} specifies that operations for each primitive in a subpass <b>must</b> occur in <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#drawing-primitive-order">primitive order</a>.</li>
     * <li>{@link #VK_RASTERIZATION_ORDER_RELAXED_AMD RASTERIZATION_ORDER_RELAXED_AMD} specifies that operations for each primitive in a subpass <b>may</b> not occur in <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#drawing-primitive-order">primitive order</a>.</li>
     * </ul>
     * 
     * <h5>See Also</h5>
     * 
     * <p>{@link VkPipelineRasterizationStateRasterizationOrderAMD}</p>
     */
    public static final int
        VK_RASTERIZATION_ORDER_STRICT_AMD  = 0,
        VK_RASTERIZATION_ORDER_RELAXED_AMD = 1;

    private AMDRasterizationOrder() {}

}