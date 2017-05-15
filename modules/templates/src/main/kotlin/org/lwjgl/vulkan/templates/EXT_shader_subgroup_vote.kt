/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.vulkan.templates

import org.lwjgl.generator.*
import org.lwjgl.vulkan.*

val EXT_shader_subgroup_vote = "EXTShaderSubgroupVote".nativeClassVK("EXT_shader_subgroup_vote", type = "device", postfix = EXT) {
    documentation =
        """
        This extension adds support for the following SPIR-V extension in Vulkan:

        <ul>
            <li>SPV_KHR_subgroup_vote</li>
        </ul>

        This extension provides new SPIR-V instructions:

        <ul>
            <li>{@code OpSubgroupAllKHR},</li>
            <li>{@code OpSubgroupAnyKHR}, and</li>
            <li>{@code OpSubgroupAllEqualKHR}.</li>
        </ul>

        to compute the composite of a set of boolean conditions across a group of shader invocations that are running concurrently (a <em>subgroup</em>). These composite results may be used to execute shaders more efficiently on a {@code VkPhysicalDevice}.

        When using GLSL source-based shader languages, the following shader functions from GL_ARB_shader_group_vote can map to these SPIR-V instructions:

        <ul>
            <li>{@code anyInvocationARB}() &#8594; {@code OpSubgroupAnyKHR},</li>
            <li>{@code allInvocationsARB}() &#8594; {@code OpSubgroupAllKHR}, and</li>
            <li>{@code allInvocationsEqualARB}() &#8594; {@code OpSubgroupAllEqualKHR}.</li>
        </ul>

        The subgroup across which the boolean conditions are evaluated is implementation-dependent, and this extension provides no guarantee over how individual shader invocations are assigned to subgroups. In particular, a subgroup has no necessary relationship with the compute shader <em>local workgroup</em> -- any pair of shader invocations in a compute local workgroup may execute in different subgroups as used by these instructions.

        Compute shaders operate on an explicitly specified group of threads (a local workgroup), but many implementations will also group non-compute shader invocations and execute them concurrently. When executing code like

        <code><pre>
￿if (condition) {
￿  result = do_fast_path();
￿} else {
￿  result = do_general_path();
￿}</pre></code>

        where {@code condition} diverges between invocations, an implementation might first execute {@code do_fast_path}() for the invocations where {@code condition} is true and leave the other invocations dormant. Once {@code do_fast_path}() returns, it might call {@code do_general_path}() for invocations where {@code condition} is false and leave the other invocations dormant. In this case, the shader executes <b>both</b> the fast and the general path and might be better off just using the general path for all invocations.

        This extension provides the ability to avoid divergent execution by evaluating a condition across an entire subgroup using code like:

        <code><pre>
￿if (allInvocationsARB(condition)) {
￿  result = do_fast_path();
￿} else {
￿  result = do_general_path();
￿}</pre></code>

        The built-in function {@code allInvocationsARB}() will return the same value for all invocations in the group, so the group will either execute {@code do_fast_path}() or {@code do_general_path}(), but never both. For example, shader code might want to evaluate a complex function iteratively by starting with an approximation of the result and then refining the approximation. Some input values may require a small number of iterations to generate an accurate result ({@code do_fast_path}) while others require a larger number ({@code do_general_path}). In another example, shader code might want to evaluate a complex function ({@code do_general_path}) that can be greatly simplified when assuming a specific value for one of its inputs ({@code do_fast_path}).

        <dl>
            <dt><b>Name String</b></dt>
            <dd>VK_EXT_shader_subgroup_vote</dd>

            <dt><b>Extension Type</b></dt>
            <dd>Device extension</dd>

            <dt><b>Registered Extension Number</b></dt>
            <dd>66</dd>

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
                <li>This extension requires the <a target="_blank" href="https://www.khronos.org/registry/spir-v/extensions/KHR/SPV_KHR_subgroup_vote.html">SPV_KHR_subgroup_vote</a> SPIR-V extension.</li>
                <li>This extension requires the <a target="_blank" href="https://www.opengl.org/registry/specs/ARB/shader_group_vote.txt">GL_ARB_shader_group_vote</a> extension for GLSL source languages.</li>
            </ul></dd>

            <dt><b>Contributors</b></dt>
            <dd><ul>
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

        "EXT_SHADER_SUBGROUP_VOTE_SPEC_VERSION".."1"
    )

    StringConstant(
        "The extension name.",

        "EXT_SHADER_SUBGROUP_VOTE_EXTENSION_NAME".."VK_EXT_shader_subgroup_vote"
    )
}