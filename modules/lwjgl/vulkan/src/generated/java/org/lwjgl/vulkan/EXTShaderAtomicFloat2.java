/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.vulkan;

/**
 * This extension allows a shader to perform 16-bit floating-point atomic operations on buffer and workgroup memory as well as floating-point atomic minimum and maximum operations on buffer, workgroup, and image memory. It advertises the SPIR-V {@code AtomicFloat16AddEXT} capability which allows atomic add operations on 16-bit floating-point numbers and the SPIR-V {@code AtomicFloat16MinMaxEXT}, {@code AtomicFloat32MinMaxEXT} and {@code AtomicFloat64MinMaxEXT} capabilities which allow atomic minimum and maximum operations on floating-point numbers. The supported operations include {@code OpAtomicFAddEXT}, {@code OpAtomicFMinEXT} and {@code OpAtomicFMaxEXT}.
 * 
 * <h5>VK_EXT_shader_atomic_float2</h5>
 * 
 * <dl>
 * <dt><b>Name String</b></dt>
 * <dd>{@code VK_EXT_shader_atomic_float2}</dd>
 * <dt><b>Extension Type</b></dt>
 * <dd>Device extension</dd>
 * <dt><b>Registered Extension Number</b></dt>
 * <dd>274</dd>
 * <dt><b>Revision</b></dt>
 * <dd>1</dd>
 * <dt><b>Extension and Version Dependencies</b></dt>
 * <dd><ul>
 * <li>Requires Vulkan 1.0</li>
 * <li>Requires {@link EXTShaderAtomicFloat VK_EXT_shader_atomic_float}</li>
 * </ul></dd>
 * <dt><b>Contact</b></dt>
 * <dd><ul>
 * <li>Jason Ekstrand <a target="_blank" href="https://github.com/KhronosGroup/Vulkan-Docs/issues/new?body=[VK_EXT_shader_atomic_float2]%20@jekstrand%250A%3C%3CHere%20describe%20the%20issue%20or%20question%20you%20have%20about%20the%20VK_EXT_shader_atomic_float2%20extension%3E%3E">jekstrand</a></li>
 * </ul></dd>
 * </dl>
 * 
 * <h5>Other Extension Metadata</h5>
 * 
 * <dl>
 * <dt><b>Last Modified Date</b></dt>
 * <dd>2020-08-14</dd>
 * <dt><b>IP Status</b></dt>
 * <dd>No known IP claims.</dd>
 * <dt><b>Interactions and External Dependencies</b></dt>
 * <dd><ul>
 * <li>This extension requires the VK_EXT_shader_atomic_float extension.</li>
 * <li>This extension requires <a target="_blank" href="https://htmlpreview.github.io/?https://github.com/KhronosGroup/SPIRV-Registry/blob/master/extensions/EXT/SPV_EXT_shader_atomic_float_min_max.html">{@code SPV_EXT_shader_atomic_float_min_max}</a> and <a target="_blank" href="https://htmlpreview.github.io/?https://github.com/KhronosGroup/SPIRV-Registry/blob/master/extensions/EXT/SPV_EXT_shader_atomic_float16_add.html">{@code SPV_EXT_shader_atomic_float16_add}</a></li>
 * <li>This extension provides API support for <a target="_blank" href="https://github.com/KhronosGroup/GLSL/blob/master/extensions/ext/GLSL_EXT_shader_atomic_float2.txt">{@code GLSL_EXT_shader_atomic_float2}</a></li>
 * </ul></dd>
 * <dt><b>Contributors</b></dt>
 * <dd><ul>
 * <li>Jason Ekstrand, Intel</li>
 * </ul></dd>
 * </dl>
 */
public final class EXTShaderAtomicFloat2 {

    /** The extension specification version. */
    public static final int VK_EXT_SHADER_ATOMIC_FLOAT_2_SPEC_VERSION = 1;

    /** The extension name. */
    public static final String VK_EXT_SHADER_ATOMIC_FLOAT_2_EXTENSION_NAME = "VK_EXT_shader_atomic_float2";

    /** Extends {@code VkStructureType}. */
    public static final int VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_SHADER_ATOMIC_FLOAT_2_FEATURES_EXT = 1000273000;

    private EXTShaderAtomicFloat2() {}

}