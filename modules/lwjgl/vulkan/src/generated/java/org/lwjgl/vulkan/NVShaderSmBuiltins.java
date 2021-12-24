/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.vulkan;

/**
 * This extension provides the ability to determine device-specific properties on NVIDIA GPUs. It provides the number of streaming multiprocessors (SMs), the maximum number of warps (subgroups) that can run on an SM, and shader builtins to enable invocations to identify which SM and warp a shader invocation is executing on.
 * 
 * <p>This extension enables support for the SPIR-V {@code ShaderSMBuiltinsNV} capability.</p>
 * 
 * <p>These properties and built-ins <b>should</b> typically only be used for debugging purposes.</p>
 * 
 * <h5>VK_NV_shader_sm_builtins</h5>
 * 
 * <dl>
 * <dt><b>Name String</b></dt>
 * <dd>{@code VK_NV_shader_sm_builtins}</dd>
 * <dt><b>Extension Type</b></dt>
 * <dd>Device extension</dd>
 * <dt><b>Registered Extension Number</b></dt>
 * <dd>155</dd>
 * <dt><b>Revision</b></dt>
 * <dd>1</dd>
 * <dt><b>Extension and Version Dependencies</b></dt>
 * <dd><ul>
 * <li>Requires Vulkan 1.1</li>
 * </ul></dd>
 * <dt><b>Contact</b></dt>
 * <dd><ul>
 * <li>Daniel Koch <a target="_blank" href="https://github.com/KhronosGroup/Vulkan-Docs/issues/new?body=[VK_NV_shader_sm_builtins]%20@dgkoch%250A%3C%3CHere%20describe%20the%20issue%20or%20question%20you%20have%20about%20the%20VK_NV_shader_sm_builtins%20extension%3E%3E">dgkoch</a></li>
 * </ul></dd>
 * </dl>
 * 
 * <h5>Other Extension Metadata</h5>
 * 
 * <dl>
 * <dt><b>Last Modified Date</b></dt>
 * <dd>2019-05-28</dd>
 * <dt><b>Interactions and External Dependencies</b></dt>
 * <dd><ul>
 * <li>This extension requires <a target="_blank" href="https://htmlpreview.github.io/?https://github.com/KhronosGroup/SPIRV-Registry/blob/master/extensions/NV/SPV_NV_shader_sm_builtins.html">{@code SPV_NV_shader_sm_builtins}</a>.</li>
 * <li>This extension provides API support for <a target="_blank" href="https://github.com/KhronosGroup/GLSL/blob/master/extensions/nv/GLSL_NV_shader_sm_builtins.txt">{@code GL_NV_shader_sm_builtins}</a></li>
 * </ul></dd>
 * <dt><b>Contributors</b></dt>
 * <dd><ul>
 * <li>Jeff Bolz, NVIDIA</li>
 * <li>Eric Werness, NVIDIA</li>
 * </ul></dd>
 * </dl>
 */
public final class NVShaderSmBuiltins {

    /** The extension specification version. */
    public static final int VK_NV_SHADER_SM_BUILTINS_SPEC_VERSION = 1;

    /** The extension name. */
    public static final String VK_NV_SHADER_SM_BUILTINS_EXTENSION_NAME = "VK_NV_shader_sm_builtins";

    /**
     * Extends {@code VkStructureType}.
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_SHADER_SM_BUILTINS_FEATURES_NV STRUCTURE_TYPE_PHYSICAL_DEVICE_SHADER_SM_BUILTINS_FEATURES_NV}</li>
     * <li>{@link #VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_SHADER_SM_BUILTINS_PROPERTIES_NV STRUCTURE_TYPE_PHYSICAL_DEVICE_SHADER_SM_BUILTINS_PROPERTIES_NV}</li>
     * </ul>
     */
    public static final int
        VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_SHADER_SM_BUILTINS_FEATURES_NV   = 1000154000,
        VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_SHADER_SM_BUILTINS_PROPERTIES_NV = 1000154001;

    private NVShaderSmBuiltins() {}

}