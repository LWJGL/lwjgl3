/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.vulkan.templates

import org.lwjgl.generator.*
import org.lwjgl.vulkan.*

val AMD_rasterization_order = "AMDRasterizationOrder".nativeClassVK("AMD_rasterization_order", type = "device", postfix = AMD) {
    documentation =
        """
        This extension introduces the possibility for the application to control the order of primitive rasterization. In unextended Vulkan, the following stages are guaranteed to execute in <em>API order</em>:

        <ul>
            <li>depth bounds test</li>
            <li>stencil test, stencil op, and stencil write</li>
            <li>depth test and depth write</li>
            <li>occlusion queries</li>
            <li>blending, logic op, and color write</li>
        </ul>

        This extension enables applications to opt into a relaxed, implementation defined primitive rasterization order that may allow better parallel processing of primitives and thus enabling higher primitive throughput. It is applicable in cases where the primitive rasterization order is known to not affect the output of the rendering or any differences caused by a different rasterization order are not a concern from the point of view of the application's purpose.

        A few examples of cases when using the relaxed primitive rasterization order would not have an effect on the final rendering:

        <ul>
            <li>If the primitives rendered are known to not overlap in framebuffer space.</li>
            <li>If depth testing is used with a comparison operator of #COMPARE_OP_LESS, #COMPARE_OP_LESS_OR_EQUAL, #COMPARE_OP_GREATER, or #COMPARE_OP_GREATER_OR_EQUAL, and the primitives rendered are known to not overlap in clip space.</li>
            <li>If depth testing is not used and blending is enabled for all attachments with a commutative blend operator.</li>
        </ul>

        <h5>Examples</h5>
        None

        <dl>
            <dt><b>Name String</b></dt>
            <dd>VK_AMD_rasterization_order</dd>

            <dt><b>Extension Type</b></dt>
            <dd>Device extension</dd>

            <dt><b>Registered Extension Number</b></dt>
            <dd>19</dd>

            <dt><b>Last Modified Date</b></dt>
            <dd>2016-04-25</dd>

            <dt><b>Revision</b></dt>
            <dd>1</dd>

            <dt><b>IP Status</b></dt>
            <dd>No known IP claims.</dd>

            <dt><b>Dependencies</b></dt>
            <dd><ul>
                <li>This extension is written against version 1.0.11 of the Vulkan API.</li>
            </ul></dd>

            <dt><b>Contributors</b></dt>
            <dd><ul>
                <li>Matthaeus G. Chajdas, AMD</li>
                <li>Jaakko Konttinen, AMD</li>
                <li>Daniel Rakos, AMD</li>
                <li>Graham Sellers, AMD</li>
                <li>Dominik Witczak, AMD</li>
            </ul></dd>

            <dt><b>Contacts</b></dt>
            <dd><ul>
                <li>Daniel Rakos, AMD</li>
            </ul></dd>
        </dl>
        """

    IntConstant(
        "The extension specification version.",

        "AMD_RASTERIZATION_ORDER_SPEC_VERSION".."1"
    )

    StringConstant(
        "The extension name.",

        "AMD_RASTERIZATION_ORDER_EXTENSION_NAME".."VK_AMD_rasterization_order"
    )

    EnumConstant(
        "Extends {@code VkStructureType}.",

        "STRUCTURE_TYPE_PIPELINE_RASTERIZATION_STATE_RASTERIZATION_ORDER_AMD".."1000018000"
    )

    EnumConstant(
        """
        VkRasterizationOrderAMD - Specify rasterization order for a graphics pipeline

        <h5>Description</h5>
        <ul>
            <li>#RASTERIZATION_ORDER_STRICT_AMD specifies that operations for each primitive in a subpass <b>must</b> occur in <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html\#drawing-primitive-order">primitive order</a>.</li>
            <li>#RASTERIZATION_ORDER_RELAXED_AMD specifies that operations for each primitive in a subpass <b>may</b> not occur in <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html\#drawing-primitive-order">primitive order</a>.</li>
        </ul>

        <h5>See Also</h5>
        ##VkPipelineRasterizationStateRasterizationOrderAMD
        """,

        "RASTERIZATION_ORDER_STRICT_AMD".."0",
        "RASTERIZATION_ORDER_RELAXED_AMD".."1"
    )
}