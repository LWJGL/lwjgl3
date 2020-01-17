/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.vulkan;

/**
 * This extension advertises the SPIR-V <b>Int64Atomics</b> capability for Vulkan, which allows a shader to contain 64-bit atomic operations on signed and unsigned integers. The supported operations include OpAtomicMin, OpAtomicMax, OpAtomicAnd, OpAtomicOr, OpAtomicXor, OpAtomicAdd, OpAtomicExchange, and OpAtomicCompareExchange.
 * 
 * <h5>Promotion to Vulkan 1.2</h5>
 * 
 * <p>All functionality in this extension is included in core Vulkan 1.2, with the KHR suffix omitted. The original type, enum and command names are still available as aliases of the core functionality.</p>
 * 
 * <dl>
 * <dt><b>Name String</b></dt>
 * <dd>{@code VK_KHR_shader_atomic_int64}</dd>
 * <dt><b>Extension Type</b></dt>
 * <dd>Device extension</dd>
 * <dt><b>Registered Extension Number</b></dt>
 * <dd>181</dd>
 * <dt><b>Revision</b></dt>
 * <dd>1</dd>
 * <dt><b>Extension and Version Dependencies</b></dt>
 * <dd><ul>
 * <li>Requires Vulkan 1.0</li>
 * <li>Requires {@link KHRGetPhysicalDeviceProperties2 VK_KHR_get_physical_device_properties2}</li>
 * </ul></dd>
 * <dt><b>Deprecation state</b></dt>
 * <dd><ul>
 * <li><em>Promoted</em> to <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html#versions-1.2-promotions">Vulkan 1.2</a></li>
 * </ul></dd>
 * <dt><b>Contact</b></dt>
 * <dd><ul>
 * <li>Aaron Hagan <a target="_blank" href="https://github.com/KhronosGroup/Vulkan-Docs/issues/new?title=VK_KHR_shader_atomic_int64:%20&amp;body=@ahagan%20">ahagan</a></li>
 * </ul></dd>
 * <dt><b>Last Modified Date</b></dt>
 * <dd>2018-07-05</dd>
 * <dt><b>Interactions and External Dependencies</b></dt>
 * <dd><ul>
 * <li>Promoted to Vulkan 1.2 Core</li>
 * </ul></dd>
 * <dt><b>Interactions and External Dependencies</b></dt>
 * <dd><ul>
 * <li>This extension requires the <a target="_blank" href="https://www.khronos.org/registry/OpenGL/extensions/ARB/ARB_gpu_shader_int64.txt">{@code GL_ARB_gpu_shader_int64}</a> and <a target="_blank" href="https://github.com/KhronosGroup/GLSL/tree/master/extensions/ext/GL_EXT_shader_atomic_int64.txt">{@code GL_EXT_shader_atomic_int64}</a> extensions for GLSL source languages.</li>
 * </ul></dd>
 * <dt><b>Contributors</b></dt>
 * <dd><ul>
 * <li>Aaron Hagan, AMD</li>
 * <li>Daniel Rakos, AMD</li>
 * <li>Jeff Bolz, NVIDIA</li>
 * <li>Neil Henning, Codeplay</li>
 * </ul></dd>
 * </dl>
 */
public final class KHRShaderAtomicInt64 {

    /** The extension specification version. */
    public static final int VK_KHR_SHADER_ATOMIC_INT64_SPEC_VERSION = 1;

    /** The extension name. */
    public static final String VK_KHR_SHADER_ATOMIC_INT64_EXTENSION_NAME = "VK_KHR_shader_atomic_int64";

    /** Extends {@code VkStructureType}. */
    public static final int VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_SHADER_ATOMIC_INT64_FEATURES_KHR = 1000180000;

    private KHRShaderAtomicInt64() {}

}