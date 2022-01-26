/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package vulkan.templates

import org.lwjgl.generator.*
import vulkan.*

val EXT_shader_subgroup_vote = "EXTShaderSubgroupVote".nativeClassVK("EXT_shader_subgroup_vote", type = "device", postfix = "EXT") {
    documentation =
        """
        This extension adds support for the following SPIR-V extension in Vulkan:

        <ul>
            <li>{@code SPV_KHR_subgroup_vote}</li>
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
            <li>{@code anyInvocationARB}() → {@code OpSubgroupAnyKHR},</li>
            <li>{@code allInvocationsARB}() → {@code OpSubgroupAllKHR}, and</li>
            <li>{@code allInvocationsEqualARB}() → {@code OpSubgroupAllEqualKHR}.</li>
        </ul>

        The subgroup across which the boolean conditions are evaluated is implementation-dependent, and this extension provides no guarantee over how individual shader invocations are assigned to subgroups. In particular, a subgroup has no necessary relationship with the compute shader <em>local workgroup</em> — any pair of shader invocations in a compute local workgroup may execute in different subgroups as used by these instructions.

        Compute shaders operate on an explicitly specified group of threads (a local workgroup), but many implementations will also group non-compute shader invocations and execute them concurrently. When executing code like

        <pre><code>
￿if (condition) {
￿  result = do_fast_path();
￿} else {
￿  result = do_general_path();
￿}</code></pre>

        where {@code condition} diverges between invocations, an implementation might first execute {@code do_fast_path}() for the invocations where {@code condition} is true and leave the other invocations dormant. Once {@code do_fast_path}() returns, it might call {@code do_general_path}() for invocations where {@code condition} is {@code false} and leave the other invocations dormant. In this case, the shader executes <b>both</b> the fast and the general path and might be better off just using the general path for all invocations.

        This extension provides the ability to avoid divergent execution by evaluating a condition across an entire subgroup using code like:

        <pre><code>
￿if (allInvocationsARB(condition)) {
￿  result = do_fast_path();
￿} else {
￿  result = do_general_path();
￿}</code></pre>

        The built-in function {@code allInvocationsARB}() will return the same value for all invocations in the group, so the group will either execute {@code do_fast_path}() or {@code do_general_path}(), but never both. For example, shader code might want to evaluate a complex function iteratively by starting with an approximation of the result and then refining the approximation. Some input values may require a small number of iterations to generate an accurate result ({@code do_fast_path}) while others require a larger number ({@code do_general_path}). In another example, shader code might want to evaluate a complex function ({@code do_general_path}) that can be greatly simplified when assuming a specific value for one of its inputs ({@code do_fast_path}).

        <h5>Deprecated by Vulkan 1.1</h5>
        All functionality in this extension is superseded by the core Vulkan 1.1 <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html\#VkPhysicalDeviceSubgroupProperties">subgroup operations</a>.

        <h5>VK_EXT_shader_subgroup_vote</h5>
        <dl>
            <dt><b>Name String</b></dt>
            <dd>{@code VK_EXT_shader_subgroup_vote}</dd>

            <dt><b>Extension Type</b></dt>
            <dd>Device extension</dd>

            <dt><b>Registered Extension Number</b></dt>
            <dd>66</dd>

            <dt><b>Revision</b></dt>
            <dd>1</dd>

            <dt><b>Extension and Version Dependencies</b></dt>
            <dd><ul>
                <li>Requires Vulkan 1.0</li>
            </ul></dd>

            <dt><b>Deprecation state</b></dt>
            <dd><ul>
                <li><em>Deprecated</em> by <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html\#versions-1.1-new-features">Vulkan 1.1</a></li>
            </ul></dd>

            <dt><b>Contact</b></dt>
            <dd><ul>
                <li>Daniel Koch <a target="_blank" href="https://github.com/KhronosGroup/Vulkan-Docs/issues/new?body=[VK_EXT_shader_subgroup_vote]%20@dgkoch%250A%3C%3CHere%20describe%20the%20issue%20or%20question%20you%20have%20about%20the%20VK_EXT_shader_subgroup_vote%20extension%3E%3E">dgkoch</a></li>
            </ul></dd>
        </dl>

        <h5>Other Extension Metadata</h5>
        <dl>
            <dt><b>Last Modified Date</b></dt>
            <dd>2016-11-28</dd>

            <dt><b>IP Status</b></dt>
            <dd>No known IP claims.</dd>

            <dt><b>Interactions and External Dependencies</b></dt>
            <dd><ul>
                <li>This extension requires <a target="_blank" href="https://htmlpreview.github.io/?https://github.com/KhronosGroup/SPIRV-Registry/blob/master/extensions/KHR/SPV_KHR_subgroup_vote.html">{@code SPV_KHR_subgroup_vote}</a></li>
                <li>This extension provides API support for <a target="_blank" href="https://www.khronos.org/registry/OpenGL/extensions/ARB/ARB_shader_group_vote.txt">{@code GL_ARB_shader_group_vote}</a></li>
            </ul></dd>

            <dt><b>Contributors</b></dt>
            <dd><ul>
                <li>Neil Henning, Codeplay</li>
                <li>Daniel Koch, NVIDIA Corporation</li>
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