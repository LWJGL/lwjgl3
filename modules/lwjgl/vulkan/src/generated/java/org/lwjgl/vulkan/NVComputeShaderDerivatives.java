/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.vulkan;

/**
 * This extension adds Vulkan support for the <a target="_blank" href="https://htmlpreview.github.io/?https://github.com/KhronosGroup/SPIRV-Registry/blob/master/extensions/NV/SPV_NV_compute_shader_derivatives.html">{@code SPV_NV_compute_shader_derivatives}</a> SPIR-V extension.
 * 
 * <p>The SPIR-V extension provides two new execution modes, both of which allow compute shaders to use built-ins that evaluate compute derivatives explicitly or implicitly. Derivatives will be computed via differencing over a 2x2 group of shader invocations. The {@code DerivativeGroupQuadsNV} execution mode assembles shader invocations into 2x2 groups, where each group has x and y coordinates of the local invocation ID of the form (2m+{0,1}, 2n+{0,1}). The {@code DerivativeGroupLinearNV} execution mode assembles shader invocations into 2x2 groups, where each group has local invocation index values of the form 4m+{0,1,2,3}.</p>
 * 
 * <h5>Examples</h5>
 * 
 * <p>None.</p>
 * 
 * <h5>VK_NV_compute_shader_derivatives</h5>
 * 
 * <dl>
 * <dt><b>Name String</b></dt>
 * <dd>{@code VK_NV_compute_shader_derivatives}</dd>
 * <dt><b>Extension Type</b></dt>
 * <dd>Device extension</dd>
 * <dt><b>Registered Extension Number</b></dt>
 * <dd>202</dd>
 * <dt><b>Revision</b></dt>
 * <dd>1</dd>
 * <dt><b>Extension and Version Dependencies</b></dt>
 * <dd><ul>
 * <li>Requires Vulkan 1.0</li>
 * <li>Requires {@link KHRGetPhysicalDeviceProperties2 VK_KHR_get_physical_device_properties2}</li>
 * </ul></dd>
 * <dt><b>Contact</b></dt>
 * <dd><ul>
 * <li>Pat Brown <a target="_blank" href="https://github.com/KhronosGroup/Vulkan-Docs/issues/new?body=[VK_NV_compute_shader_derivatives]%20@nvpbrown%250A%3C%3CHere%20describe%20the%20issue%20or%20question%20you%20have%20about%20the%20VK_NV_compute_shader_derivatives%20extension%3E%3E">nvpbrown</a></li>
 * </ul></dd>
 * </dl>
 * 
 * <h5>Other Extension Metadata</h5>
 * 
 * <dl>
 * <dt><b>Last Modified Date</b></dt>
 * <dd>2018-07-19</dd>
 * <dt><b>IP Status</b></dt>
 * <dd>No known IP claims.</dd>
 * <dt><b>Interactions and External Dependencies</b></dt>
 * <dd><ul>
 * <li>This extension requires <a target="_blank" href="https://htmlpreview.github.io/?https://github.com/KhronosGroup/SPIRV-Registry/blob/master/extensions/NV/SPV_NV_compute_shader_derivatives.html">{@code SPV_NV_compute_shader_derivatives}</a></li>
 * <li>This extension provides API support for <a target="_blank" href="https://github.com/KhronosGroup/GLSL/blob/master/extensions/nv/GLSL_NV_compute_shader_derivatives.txt">{@code GL_NV_compute_shader_derivatives}</a></li>
 * </ul></dd>
 * <dt><b>Contributors</b></dt>
 * <dd><ul>
 * <li>Pat Brown, NVIDIA</li>
 * </ul></dd>
 * </dl>
 */
public final class NVComputeShaderDerivatives {

    /** The extension specification version. */
    public static final int VK_NV_COMPUTE_SHADER_DERIVATIVES_SPEC_VERSION = 1;

    /** The extension name. */
    public static final String VK_NV_COMPUTE_SHADER_DERIVATIVES_EXTENSION_NAME = "VK_NV_compute_shader_derivatives";

    /** Extends {@code VkStructureType}. */
    public static final int VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_COMPUTE_SHADER_DERIVATIVES_FEATURES_NV = 1000201000;

    private NVComputeShaderDerivatives() {}

}