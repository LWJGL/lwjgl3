/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.vulkan.templates

import org.lwjgl.generator.*
import org.lwjgl.vulkan.*

val EXT_shader_subgroup_ballot = "EXTShaderSubgroupBallot".nativeClassVK("EXT_shader_subgroup_ballot", type = "device", postfix = EXT) {
    documentation =
        """
        This extension adds support for the following SPIR-V extension in Vulkan:

        <ul>
            <li>SPV_KHR_shader_ballot</li>
        </ul>

        This extension provides the ability for a group of invocations, which execute in parallel, to do limited forms of cross-invocation communication via a group broadcast of a invocation value, or broadcast of a bitarray representing a predicate value from each invocation in the group.

        This extension provides access to a number of additional built-in shader variables in Vulkan:

        <ul>
            <li>{@code SubgroupEqMaskKHR}, which contains the subgroup mask of the current subgroup invocation,</li>
            <li>{@code SubgroupGeMaskKHR}, which contains the subgroup mask of the invocations greater than or equal to the current invocation,</li>
            <li>{@code SubgroupGtMaskKHR}, which contains the subgroup mask of the invocations greater than the current invocation,</li>
            <li>{@code SubgroupLeMaskKHR}, which contains the subgroup mask of the invocations less than or equal to the current invocation,</li>
            <li>{@code SubgroupLtMaskKHR}, which contains the subgroup mask of the invocations less than the current invocation,</li>
            <li>{@code SubgroupLocalInvocationId}, which contains the index of an invocation within a subgroup, and</li>
            <li>{@code SubgroupSize}, which contains the maximum number of invocations in a subgroup.</li>
        </ul>

        Additionally, this extension provides access to the new SPIR-V instructions:

        <ul>
            <li>{@code OpSubgroupBallotKHR},</li>
            <li>{@code OpSubgroupFirstInvocationKHR}, and</li>
            <li>{@code OpSubgroupReadInvocationKHR},</li>
        </ul>

        When using GLSL source-based shader languages, the following variables and shader functions from GL_ARB_shader_ballot can map to these SPIR-V built-in decorations and instructions:

        <ul>
            <li>in uint64_t gl_SubGroupEqMaskARB; &#8594; {@code SubgroupEqMaskKHR},</li>
            <li>in uint64_t gl_SubGroupGeMaskARB; &#8594; {@code SubgroupGeMaskKHR},</li>
            <li>in uint64_t gl_SubGroupGtMaskARB; &#8594; {@code SubgroupGtMaskKHR},</li>
            <li>in uint64_t gl_SubGroupLeMaskARB; &#8594; {@code SubgroupLeMaskKHR},</li>
            <li>in uint64_t gl_SubGroupLtMaskARB; &#8594; {@code SubgroupLtMaskKHR},</li>
            <li>in uint gl_SubGroupInvocationARB; &#8594; {@code SubgroupLocalInvocationId},</li>
            <li>uniform uint gl_SubGroupSizeARB; &#8594; {@code SubgroupSize},</li>
            <li>ballotARB() &#8594; {@code OpSubgroupBallotKHR},</li>
            <li>readFirstInvocationARB() &#8594; {@code OpSubgroupFirstInvocationKHR}, and</li>
            <li>readInvocationARB() &#8594; {@code OpSubgroupReadInvocationKHR}.</li>
        </ul>

        <dl>
            <dt><b>Name String</b></dt>
            <dd>VK_EXT_shader_subgroup_ballot</dd>

            <dt><b>Extension Type</b></dt>
            <dd>Device extension</dd>

            <dt><b>Registered Extension Number</b></dt>
            <dd>65</dd>

            <dt><b>Status</b></dt>
            <dd>Draft</dd>

            <dt><b>Last Modified Date</b></dt>
            <dd>2016-11-28</dd>

            <dt><b>Revision</b></dt>
            <dd>1</dd>

            <dt><b>IP Status</b></dt>
            <dd>No known IP claims.</dd>

            <dt><b>Dependencies</b></dt>
            <dd><ul>
                <li>This extension is written against version 1.0 of the Vulkan API.</li>
                <li>This extension requires Vulkan 1.0.</li>
                <li>This extension requires the <a target="_blank" href="https://www.khronos.org/registry/spir-v/extensions/KHR/SPV_KHR_shader_ballot.html">SPV_KHR_shader_ballot</a> SPIR-V extension.</li>
                <li>This extension requires the <a target="_blank" href="https://www.opengl.org/registry/specs/ARB/shader_ballot.txt">GL_ARB_shader_ballot</a> extension for GLSL source languages.</li>
            </ul></dd>

            <dt><b>Contributors</b></dt>
            <dd><ul>
                <li>Jeff Bolz, NVIDIA</li>
                <li>Neil Henning, Codeplay</li>
                <li>Daniel Koch, NVIDIA Corporation</li>
            </ul></dd>

            <dt><b>Contact</b></dt>
            <dd><ul>
                <li>Daniel Koch (dkoch 'at' nvidia.com)</li>
            </ul></dd>
        </dl>
        """

    IntConstant(
        "The extension specification version.",

        "EXT_SHADER_SUBGROUP_BALLOT_SPEC_VERSION".."1"
    )

    StringConstant(
        "The extension name.",

        "EXT_SHADER_SUBGROUP_BALLOT_EXTENSION_NAME".."VK_EXT_shader_subgroup_ballot"
    )
}