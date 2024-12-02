/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.vulkan;

/**
 * This extension allows the use of the {@code SPV_KHR_maximal_reconvergence} SPIR-V extension in shader modules. {@code SPV_KHR_maximal_reconvergence} provides stronger guarantees that diverged subgroups will reconverge. These guarantees should match shader author intuition about divergence and reconvergence of invocations based on the structure of the code in the HLL.
 * 
 * <p>Developers should utilize this extension if they require stronger guarantees about reconvergence than either the core spec or SPV_KHR_subgroup_uniform_control_flow. This extension will define the rules that govern how invocations diverge and reconverge in a way that should match developer intuition. It allows robust programs to be written relying on subgroup operations and other tangled instructions.</p>
 * 
 * <dl>
 * <dt><b>Name String</b></dt>
 * <dd>{@code VK_KHR_shader_maximal_reconvergence}</dd>
 * <dt><b>Extension Type</b></dt>
 * <dd>Device extension</dd>
 * <dt><b>Registered Extension Number</b></dt>
 * <dd>435</dd>
 * <dt><b>Revision</b></dt>
 * <dd>1</dd>
 * <dt><b>Extension and Version Dependencies</b></dt>
 * <dd><a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html#versions-1.1">Version 1.1</a></dd>
 * <dt><b>SPIR-V Dependencies</b></dt>
 * <dd><ul>
 * <li><a href="https://htmlpreview.github.io/?https://github.com/KhronosGroup/SPIRV-Registry/blob/master/extensions/KHR/SPV_KHR_maximal_reconvergence.html">SPV_KHR_maximal_reconvergence</a></li>
 * </ul></dd>
 * <dt><b>Contact</b></dt>
 * <dd><ul>
 * <li>Alan Baker <a href="https://github.com/KhronosGroup/Vulkan-Docs/issues/new?body=[VK_KHR_shader_maximal_reconvergence]%20@alan-baker%250A*Here%20describe%20the%20issue%20or%20question%20you%20have%20about%20the%20VK_KHR_shader_maximal_reconvergence%20extension*">alan-baker</a></li>
 * </ul></dd>
 * <dt><b>Extension Proposal</b></dt>
 * <dd><a href="https://github.com/KhronosGroup/Vulkan-Docs/tree/main/proposals/VK_KHR_shader_maximal_reconvergence.adoc">VK_KHR_shader_maximal_reconvergence</a></dd>
 * </dl>
 * 
 * <h5>Other Extension Metadata</h5>
 * 
 * <dl>
 * <dt><b>Last Modified Date</b></dt>
 * <dd>2021-11-12</dd>
 * <dt><b>IP Status</b></dt>
 * <dd>No known IP claims.</dd>
 * <dt><b>Interactions and External Dependencies</b></dt>
 * <dd><ul>
 * <li>Requires SPIR-V 1.3.</li>
 * <li>This extension requires <a href="https://htmlpreview.github.io/?https://github.com/KhronosGroup/SPIRV-Registry/blob/master/extensions/KHR/SPV_KHR_maximal_reconvergence.html">{@code SPV_KHR_maximal_reconvergence}</a></li>
 * </ul></dd>
 * <dt><b>Contributors</b></dt>
 * <dd><ul>
 * <li>Alan Baker, Google</li>
 * </ul></dd>
 * </dl>
 */
public final class KHRShaderMaximalReconvergence {

    /** The extension specification version. */
    public static final int VK_KHR_SHADER_MAXIMAL_RECONVERGENCE_SPEC_VERSION = 1;

    /** The extension name. */
    public static final String VK_KHR_SHADER_MAXIMAL_RECONVERGENCE_EXTENSION_NAME = "VK_KHR_shader_maximal_reconvergence";

    /** Extends {@code VkStructureType}. */
    public static final int VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_SHADER_MAXIMAL_RECONVERGENCE_FEATURES_KHR = 1000434000;

    private KHRShaderMaximalReconvergence() {}

}