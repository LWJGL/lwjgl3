/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.vulkan;

/**
 * This extension adds Vulkan support for the <a href="https://htmlpreview.github.io/?https://github.com/KhronosGroup/SPIRV-Registry/blob/master/extensions/KHR/SPV_KHR_compute_shader_derivatives.html">{@code SPV_KHR_compute_shader_derivatives}</a> SPIR-V extension.
 * 
 * <p>The SPIR-V extension provides two new execution modes, both of which allow execution models with defined workgroups to use built-ins that evaluate derivatives explicitly or implicitly. Derivatives will be computed via differencing over a 2x2 group of shader invocations. The {@code DerivativeGroupQuadsKHR} execution mode assembles shader invocations into 2x2 groups, where each group has x and y coordinates of the local invocation ID of the form (2m+{0,1}, 2n+{0,1}). The {@code DerivativeGroupLinearKHR} execution mode assembles shader invocations into 2x2 groups, where each group has local invocation index values of the form 4m+{0,1,2,3}.</p>
 * 
 * <p>The new execution modes are supported in compute shaders and optionally (see <a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html#limits-meshAndTaskShaderDerivatives">meshAndTaskShaderDerivatives</a>) in mesh and task shaders.</p>
 * 
 * <h5>Examples</h5>
 * 
 * <p>None.</p>
 * 
 * <dl>
 * <dt><b>Name String</b></dt>
 * <dd>{@code VK_KHR_compute_shader_derivatives}</dd>
 * <dt><b>Extension Type</b></dt>
 * <dd>Device extension</dd>
 * <dt><b>Registered Extension Number</b></dt>
 * <dd>512</dd>
 * <dt><b>Revision</b></dt>
 * <dd>1</dd>
 * <dt><b>Extension and Version Dependencies</b></dt>
 * <dd>{@link KHRGetPhysicalDeviceProperties2 VK_KHR_get_physical_device_properties2}</dd>
 * <dt><b>SPIR-V Dependencies</b></dt>
 * <dd><ul>
 * <li><a href="https://htmlpreview.github.io/?https://github.com/KhronosGroup/SPIRV-Registry/blob/master/extensions/KHR/SPV_KHR_compute_shader_derivatives.html">SPV_KHR_compute_shader_derivatives</a></li>
 * </ul></dd>
 * <dt><b>Contact</b></dt>
 * <dd><ul>
 * <li>Jean-Noe Morissette <a href="https://github.com/KhronosGroup/Vulkan-Docs/issues/new?body=[VK_KHR_compute_shader_derivatives]%20@MagicPoncho%250A*Here%20describe%20the%20issue%20or%20question%20you%20have%20about%20the%20VK_KHR_compute_shader_derivatives%20extension*">MagicPoncho</a></li>
 * </ul></dd>
 * <dt><b>Extension Proposal</b></dt>
 * <dd><a href="https://github.com/KhronosGroup/Vulkan-Docs/tree/main/proposals/VK_KHR_compute_shader_derivatives.adoc">VK_KHR_compute_shader_derivatives</a></dd>
 * </dl>
 * 
 * <h5>Other Extension Metadata</h5>
 * 
 * <dl>
 * <dt><b>Last Modified Date</b></dt>
 * <dd>2024-06-26</dd>
 * <dt><b>IP Status</b></dt>
 * <dd>No known IP claims.</dd>
 * <dt><b>Interactions and External Dependencies</b></dt>
 * <dd><ul>
 * <li>This extension requires <a href="https://htmlpreview.github.io/?https://github.com/KhronosGroup/SPIRV-Registry/blob/master/extensions/KHR/SPV_KHR_compute_shader_derivatives.html">{@code SPV_KHR_compute_shader_derivatives}</a></li>
 * <li>This extension provides API support for <a href="https://github.com/KhronosGroup/GLSL/blob/main/extensions/khr/GLSL_KHR_compute_shader_derivatives.txt">{@code GL_KHR_compute_shader_derivatives}</a></li>
 * </ul></dd>
 * <dt><b>Contributors</b></dt>
 * <dd><ul>
 * <li>Jean-Noe Morissette, Epic Games</li>
 * <li>Daniel Koch, NVIDIA</li>
 * <li>Pat Brown, NVIDIA</li>
 * <li>Stu Smith, AMD</li>
 * <li>Jan-Harald Fredriksen, Arm</li>
 * <li>Tobias Hector, AMD</li>
 * <li>Ralph Potter, Samsung</li>
 * <li>Pan Gao, Huawei</li>
 * <li>Samuel (Sheng-Wen) Huang, MediaTek</li>
 * <li>Graeme Leese, Broadcom</li>
 * <li>Hans-Kristian Arntzen, Valve</li>
 * <li>Matthew Netsh, Qualcomm</li>
 * </ul></dd>
 * </dl>
 */
public final class KHRComputeShaderDerivatives {

    /** The extension specification version. */
    public static final int VK_KHR_COMPUTE_SHADER_DERIVATIVES_SPEC_VERSION = 1;

    /** The extension name. */
    public static final String VK_KHR_COMPUTE_SHADER_DERIVATIVES_EXTENSION_NAME = "VK_KHR_compute_shader_derivatives";

    /**
     * Extends {@code VkStructureType}.
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_COMPUTE_SHADER_DERIVATIVES_FEATURES_KHR STRUCTURE_TYPE_PHYSICAL_DEVICE_COMPUTE_SHADER_DERIVATIVES_FEATURES_KHR}</li>
     * <li>{@link #VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_COMPUTE_SHADER_DERIVATIVES_PROPERTIES_KHR STRUCTURE_TYPE_PHYSICAL_DEVICE_COMPUTE_SHADER_DERIVATIVES_PROPERTIES_KHR}</li>
     * </ul>
     */
    public static final int
        VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_COMPUTE_SHADER_DERIVATIVES_FEATURES_KHR   = 1000201000,
        VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_COMPUTE_SHADER_DERIVATIVES_PROPERTIES_KHR = 1000511000;

    private KHRComputeShaderDerivatives() {}

}