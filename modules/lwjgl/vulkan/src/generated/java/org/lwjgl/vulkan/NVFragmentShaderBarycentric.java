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
 * <li><a target="_blank" href="https://htmlpreview.github.io/?https://github.com/KhronosGroup/SPIRV-Registry/blob/master/extensions/NV/SPV_NV_fragment_shader_barycentric.html">{@code SPV_NV_fragment_shader_barycentric}</a></li>
 * </ul>
 * 
 * <p>The extension provides access to three additional fragment shader variable decorations in SPIR-V:</p>
 * 
 * <ul>
 * <li>{@code PerVertexNV}, which indicates that a fragment shader input will not have interpolated values, but instead must be accessed with an extra array index that identifies one of the vertices of the primitive producing the fragment</li>
 * <li>{@code BaryCoordNV}, which indicates that the variable is a three-component floating-point vector holding barycentric weights for the fragment produced using perspective interpolation</li>
 * <li>{@code BaryCoordNoPerspNV}, which indicates that the variable is a three-component floating-point vector holding barycentric weights for the fragment produced using linear interpolation</li>
 * </ul>
 * 
 * <p>When using GLSL source-based shader languages, the following variables from {@code GL_NV_fragment_shader_barycentric} maps to these SPIR-V built-in decorations:</p>
 * 
 * <ul>
 * <li>{@code in vec3 gl_BaryCoordNV;} → {@code BaryCoordNV}</li>
 * <li>{@code in vec3 gl_BaryCoordNoPerspNV;} → {@code BaryCoordNoPerspNV}</li>
 * </ul>
 * 
 * <p>GLSL variables declared using the {@code __pervertexNV} GLSL qualifier are expected to be decorated with {@code PerVertexNV} in SPIR-V.</p>
 * 
 * <h5>VK_NV_fragment_shader_barycentric</h5>
 * 
 * <dl>
 * <dt><b>Name String</b></dt>
 * <dd>{@code VK_NV_fragment_shader_barycentric}</dd>
 * <dt><b>Extension Type</b></dt>
 * <dd>Device extension</dd>
 * <dt><b>Registered Extension Number</b></dt>
 * <dd>204</dd>
 * <dt><b>Revision</b></dt>
 * <dd>1</dd>
 * <dt><b>Extension and Version Dependencies</b></dt>
 * <dd><ul>
 * <li>Requires Vulkan 1.0</li>
 * <li>Requires {@link KHRGetPhysicalDeviceProperties2 VK_KHR_get_physical_device_properties2}</li>
 * </ul></dd>
 * <dt><b>Contact</b></dt>
 * <dd><ul>
 * <li>Pat Brown <a target="_blank" href="https://github.com/KhronosGroup/Vulkan-Docs/issues/new?body=[VK_NV_fragment_shader_barycentric]%20@nvpbrown%250A%3C%3CHere%20describe%20the%20issue%20or%20question%20you%20have%20about%20the%20VK_NV_fragment_shader_barycentric%20extension%3E%3E">nvpbrown</a></li>
 * </ul></dd>
 * </dl>
 * 
 * <h5>Other Extension Metadata</h5>
 * 
 * <dl>
 * <dt><b>Last Modified Date</b></dt>
 * <dd>2018-08-03</dd>
 * <dt><b>IP Status</b></dt>
 * <dd>No known IP claims.</dd>
 * <dt><b>Interactions and External Dependencies</b></dt>
 * <dd><ul>
 * <li>This extension requires <a target="_blank" href="https://htmlpreview.github.io/?https://github.com/KhronosGroup/SPIRV-Registry/blob/master/extensions/NV/SPV_NV_fragment_shader_barycentric.html">{@code SPV_NV_fragment_shader_barycentric}</a></li>
 * <li>This extension provides API support for <a target="_blank" href="https://github.com/KhronosGroup/GLSL/blob/master/extensions/nv/GLSL_NV_fragment_shader_barycentric.txt">{@code GL_NV_fragment_shader_barycentric}</a></li>
 * </ul></dd>
 * <dt><b>Contributors</b></dt>
 * <dd><ul>
 * <li>Pat Brown, NVIDIA</li>
 * <li>Daniel Koch, NVIDIA</li>
 * </ul></dd>
 * </dl>
 */
public final class NVFragmentShaderBarycentric {

    /** The extension specification version. */
    public static final int VK_NV_FRAGMENT_SHADER_BARYCENTRIC_SPEC_VERSION = 1;

    /** The extension name. */
    public static final String VK_NV_FRAGMENT_SHADER_BARYCENTRIC_EXTENSION_NAME = "VK_NV_fragment_shader_barycentric";

    /** Extends {@code VkStructureType}. */
    public static final int VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_FRAGMENT_SHADER_BARYCENTRIC_FEATURES_NV = 1000203000;

    private NVFragmentShaderBarycentric() {}

}