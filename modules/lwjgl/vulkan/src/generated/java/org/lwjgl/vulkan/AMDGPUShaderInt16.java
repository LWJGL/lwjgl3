/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.vulkan;

/**
 * This extension adds support for using 16-bit integer variables in shaders.
 * 
 * <h5>Deprecation by {@code VK_KHR_shader_float16_int8}</h5>
 * 
 * <p>Functionality in this extension was included in {@link KHRShaderFloat16Int8 VK_KHR_shader_float16_int8} extension, when {@link VkPhysicalDeviceFeatures}{@code ::shaderInt16} and {@link VkPhysicalDeviceShaderFloat16Int8FeaturesKHR}{@code ::shaderFloat16} are enabled.</p>
 * 
 * <h5>VK_AMD_gpu_shader_int16</h5>
 * 
 * <dl>
 * <dt><b>Name String</b></dt>
 * <dd>{@code VK_AMD_gpu_shader_int16}</dd>
 * <dt><b>Extension Type</b></dt>
 * <dd>Device extension</dd>
 * <dt><b>Registered Extension Number</b></dt>
 * <dd>133</dd>
 * <dt><b>Revision</b></dt>
 * <dd>2</dd>
 * <dt><b>Deprecation state</b></dt>
 * <dd><ul>
 * <li><em>Deprecated</em> by {@link KHRShaderFloat16Int8 VK_KHR_shader_float16_int8} extension
 * 
 * <ul>
 * <li>Which in turn was <em>promoted</em> to <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#versions-1.2-promotions">Vulkan 1.2</a></li>
 * </ul>
 * </li>
 * </ul></dd>
 * <dt><b>Contact</b></dt>
 * <dd><ul>
 * <li>Qun Lin <a href="https://github.com/KhronosGroup/Vulkan-Docs/issues/new?body=[VK_AMD_gpu_shader_int16]%20@linqun%250A*Here%20describe%20the%20issue%20or%20question%20you%20have%20about%20the%20VK_AMD_gpu_shader_int16%20extension*">linqun</a></li>
 * </ul></dd>
 * </dl>
 * 
 * <h5>Other Extension Metadata</h5>
 * 
 * <dl>
 * <dt><b>Last Modified Date</b></dt>
 * <dd>2019-04-11</dd>
 * <dt><b>IP Status</b></dt>
 * <dd>No known IP claims.</dd>
 * <dt><b>Interactions and External Dependencies</b></dt>
 * <dd><ul>
 * <li>This extension requires <a href="https://htmlpreview.github.io/?https://github.com/KhronosGroup/SPIRV-Registry/blob/master/extensions/AMD/SPV_AMD_gpu_shader_int16.html">{@code SPV_AMD_gpu_shader_int16}</a></li>
 * <li>This extension provides API support for <a href="https://registry.khronos.org/OpenGL/extensions/AMD/AMD_gpu_shader_int16.txt">{@code GL_AMD_gpu_shader_int16}</a></li>
 * </ul></dd>
 * <dt><b>Contributors</b></dt>
 * <dd><ul>
 * <li>Daniel Rakos, AMD</li>
 * <li>Dominik Witczak, AMD</li>
 * <li>Matthaeus G. Chajdas, AMD</li>
 * <li>Rex Xu, AMD</li>
 * <li>Timothy Lottes, AMD</li>
 * <li>Zhi Cai, AMD</li>
 * </ul></dd>
 * </dl>
 */
public final class AMDGPUShaderInt16 {

    /** The extension specification version. */
    public static final int VK_AMD_GPU_SHADER_INT16_SPEC_VERSION = 2;

    /** The extension name. */
    public static final String VK_AMD_GPU_SHADER_INT16_EXTENSION_NAME = "VK_AMD_gpu_shader_int16";

    private AMDGPUShaderInt16() {}

}