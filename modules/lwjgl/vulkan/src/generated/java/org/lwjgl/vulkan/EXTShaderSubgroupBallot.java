/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.vulkan;

/**
 * This extension adds support for the following SPIR-V extension in Vulkan:
 * 
 * <ul>
 * <li>{@code SPV_KHR_shader_ballot}</li>
 * </ul>
 * 
 * <p>This extension provides the ability for a group of invocations, which execute in parallel, to do limited forms of cross-invocation communication via a group broadcast of a invocation value, or broadcast of a bitarray representing a predicate value from each invocation in the group.</p>
 * 
 * <p>This extension provides access to a number of additional built-in shader variables in Vulkan:</p>
 * 
 * <ul>
 * <li>{@code SubgroupEqMaskKHR}, which contains the subgroup mask of the current subgroup invocation,</li>
 * <li>{@code SubgroupGeMaskKHR}, which contains the subgroup mask of the invocations greater than or equal to the current invocation,</li>
 * <li>{@code SubgroupGtMaskKHR}, which contains the subgroup mask of the invocations greater than the current invocation,</li>
 * <li>{@code SubgroupLeMaskKHR}, which contains the subgroup mask of the invocations less than or equal to the current invocation,</li>
 * <li>{@code SubgroupLtMaskKHR}, which contains the subgroup mask of the invocations less than the current invocation,</li>
 * <li>{@code SubgroupLocalInvocationId}, which contains the index of an invocation within a subgroup, and</li>
 * <li>{@code SubgroupSize}, which contains the maximum number of invocations in a subgroup.</li>
 * </ul>
 * 
 * <p>Additionally, this extension provides access to the new SPIR-V instructions:</p>
 * 
 * <ul>
 * <li>{@code OpSubgroupBallotKHR},</li>
 * <li>{@code OpSubgroupFirstInvocationKHR}, and</li>
 * <li>{@code OpSubgroupReadInvocationKHR},</li>
 * </ul>
 * 
 * <p>When using GLSL source-based shader languages, the following variables and shader functions from GL_ARB_shader_ballot can map to these SPIR-V built-in decorations and instructions:</p>
 * 
 * <ul>
 * <li>{@code in uint64_t gl_SubGroupEqMaskARB;} &#8594; {@code SubgroupEqMaskKHR},</li>
 * <li>{@code in uint64_t gl_SubGroupGeMaskARB;} &#8594; {@code SubgroupGeMaskKHR},</li>
 * <li>{@code in uint64_t gl_SubGroupGtMaskARB;} &#8594; {@code SubgroupGtMaskKHR},</li>
 * <li>{@code in uint64_t gl_SubGroupLeMaskARB;} &#8594; {@code SubgroupLeMaskKHR},</li>
 * <li>{@code in uint64_t gl_SubGroupLtMaskARB;} &#8594; {@code SubgroupLtMaskKHR},</li>
 * <li>{@code in uint gl_SubGroupInvocationARB;} &#8594; {@code SubgroupLocalInvocationId},</li>
 * <li>{@code uniform uint gl_SubGroupSizeARB;} &#8594; {@code SubgroupSize},</li>
 * <li>{@code ballotARB}() &#8594; {@code OpSubgroupBallotKHR},</li>
 * <li>{@code readFirstInvocationARB}() &#8594; {@code OpSubgroupFirstInvocationKHR}, and</li>
 * <li>{@code readInvocationARB}() &#8594; {@code OpSubgroupReadInvocationKHR}.</li>
 * </ul>
 * 
 * <dl>
 * <dt><b>Name String</b></dt>
 * <dd>{@code VK_EXT_shader_subgroup_ballot}</dd>
 * <dt><b>Extension Type</b></dt>
 * <dd>Device extension</dd>
 * <dt><b>Registered Extension Number</b></dt>
 * <dd>65</dd>
 * <dt><b>Revision</b></dt>
 * <dd>1</dd>
 * <dt><b>Extension and Version Dependencies</b></dt>
 * <dd><ul>
 * <li>Requires Vulkan 1.0</li>
 * </ul></dd>
 * <dt><b>Contact</b></dt>
 * <dd><ul>
 * <li>Daniel Koch <a target="_blank" href="https://github.com/KhronosGroup/Vulkan-Docs/issues/new?title=VK_EXT_shader_subgroup_ballot:%20&amp;body=@dgkoch%20">dgkoch</a></li>
 * </ul></dd>
 * <dt><b>Last Modified Date</b></dt>
 * <dd>2016-11-28</dd>
 * <dt><b>IP Status</b></dt>
 * <dd>No known IP claims.</dd>
 * <dt><b>Interactions and External Dependencies</b></dt>
 * <dd><ul>
 * <li>This extension requires the <a target="_blank" href="https://htmlpreview.github.io/?https://github.com/KhronosGroup/SPIRV-Registry/blob/master/extensions/KHR/SPV_KHR_shader_ballot.html">{@code SPV_KHR_shader_ballot}</a> SPIR-V extension.</li>
 * <li>This extension requires the <a target="_blank" href="https://www.khronos.org/registry/OpenGL/extensions/ARB/ARB_shader_ballot.txt">{@code GL_ARB_shader_ballot}</a> extension for GLSL source languages.</li>
 * </ul></dd>
 * <dt><b>Contributors</b></dt>
 * <dd><ul>
 * <li>Jeff Bolz, NVIDIA</li>
 * <li>Neil Henning, Codeplay</li>
 * <li>Daniel Koch, NVIDIA Corporation</li>
 * </ul></dd>
 * </dl>
 */
public final class EXTShaderSubgroupBallot {

    /** The extension specification version. */
    public static final int VK_EXT_SHADER_SUBGROUP_BALLOT_SPEC_VERSION = 1;

    /** The extension name. */
    public static final String VK_EXT_SHADER_SUBGROUP_BALLOT_EXTENSION_NAME = "VK_EXT_shader_subgroup_ballot";

    private EXTShaderSubgroupBallot() {}

}