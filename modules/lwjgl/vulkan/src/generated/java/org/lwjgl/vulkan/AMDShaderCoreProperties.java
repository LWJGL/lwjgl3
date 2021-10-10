/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.vulkan;

/**
 * This extension exposes shader core properties for a target physical device through the {@link KHRGetPhysicalDeviceProperties2 VK_KHR_get_physical_device_properties2} extension. Please refer to the example below for proper usage.
 * 
 * <h5>Examples</h5>
 * 
 * <p>This example retrieves the shader core properties for a physical device.</p>
 * 
 * <pre><code>
 * extern VkInstance       instance;
 * 
 * PFN_vkGetPhysicalDeviceProperties2 pfnVkGetPhysicalDeviceProperties2 =
 *     reinterpret_cast&lt;PFN_vkGetPhysicalDeviceProperties2&gt;
 *     (vkGetInstanceProcAddr(instance, "vkGetPhysicalDeviceProperties2") );
 * 
 * VkPhysicalDeviceProperties2             general_props;
 * VkPhysicalDeviceShaderCorePropertiesAMD shader_core_properties;
 * 
 * shader_core_properties.pNext = nullptr;
 * shader_core_properties.sType = VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_SHADER_CORE_PROPERTIES_AMD;
 * 
 * general_props.pNext = &amp;shader_core_properties;
 * general_props.sType = VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_PROPERTIES_2;
 * 
 * // After this call, shader_core_properties has been populated
 * pfnVkGetPhysicalDeviceProperties2(device, &amp;general_props);
 * 
 * printf("Number of shader engines: %d\n",
 *     m_shader_core_properties.shader_engine_count =
 *     shader_core_properties.shaderEngineCount;
 * printf("Number of shader arrays: %d\n",
 *     m_shader_core_properties.shader_arrays_per_engine_count =
 *     shader_core_properties.shaderArraysPerEngineCount;
 * printf("Number of CUs per shader array: %d\n",
 *     m_shader_core_properties.compute_units_per_shader_array =
 *     shader_core_properties.computeUnitsPerShaderArray;
 * printf("Number of SIMDs per compute unit: %d\n",
 *     m_shader_core_properties.simd_per_compute_unit =
 *     shader_core_properties.simdPerComputeUnit;
 * printf("Number of wavefront slots in each SIMD: %d\n",
 *     m_shader_core_properties.wavefronts_per_simd =
 *     shader_core_properties.wavefrontsPerSimd;
 * printf("Number of threads per wavefront: %d\n",
 *     m_shader_core_properties.wavefront_size =
 *     shader_core_properties.wavefrontSize;
 * printf("Number of physical SGPRs per SIMD: %d\n",
 *     m_shader_core_properties.sgprs_per_simd =
 *     shader_core_properties.sgprsPerSimd;
 * printf("Minimum number of SGPRs that can be allocated by a wave: %d\n",
 *     m_shader_core_properties.min_sgpr_allocation =
 *     shader_core_properties.minSgprAllocation;
 * printf("Number of available SGPRs: %d\n",
 *     m_shader_core_properties.max_sgpr_allocation =
 *     shader_core_properties.maxSgprAllocation;
 * printf("SGPRs are allocated in groups of this size: %d\n",
 *     m_shader_core_properties.sgpr_allocation_granularity =
 *     shader_core_properties.sgprAllocationGranularity;
 * printf("Number of physical VGPRs per SIMD: %d\n",
 *     m_shader_core_properties.vgprs_per_simd =
 *     shader_core_properties.vgprsPerSimd;
 * printf("Minimum number of VGPRs that can be allocated by a wave: %d\n",
 *     m_shader_core_properties.min_vgpr_allocation =
 *     shader_core_properties.minVgprAllocation;
 * printf("Number of available VGPRs: %d\n",
 *     m_shader_core_properties.max_vgpr_allocation =
 *     shader_core_properties.maxVgprAllocation;
 * printf("VGPRs are allocated in groups of this size: %d\n",
 *     m_shader_core_properties.vgpr_allocation_granularity =
 *     shader_core_properties.vgprAllocationGranularity;</code></pre>
 * 
 * <h5>VK_AMD_shader_core_properties</h5>
 * 
 * <dl>
 * <dt><b>Name String</b></dt>
 * <dd>{@code VK_AMD_shader_core_properties}</dd>
 * <dt><b>Extension Type</b></dt>
 * <dd>Device extension</dd>
 * <dt><b>Registered Extension Number</b></dt>
 * <dd>186</dd>
 * <dt><b>Revision</b></dt>
 * <dd>2</dd>
 * <dt><b>Extension and Version Dependencies</b></dt>
 * <dd><ul>
 * <li>Requires Vulkan 1.0</li>
 * <li>Requires {@link KHRGetPhysicalDeviceProperties2 VK_KHR_get_physical_device_properties2}</li>
 * </ul></dd>
 * <dt><b>Contact</b></dt>
 * <dd><ul>
 * <li>Martin Dinkov <a target="_blank" href="https://github.com/KhronosGroup/Vulkan-Docs/issues/new?body=[VK_AMD_shader_core_properties]%20@mdinkov%250A%3C%3CHere%20describe%20the%20issue%20or%20question%20you%20have%20about%20the%20VK_AMD_shader_core_properties%20extension%3E%3E">mdinkov</a></li>
 * </ul></dd>
 * </dl>
 * 
 * <h5>Other Extension Metadata</h5>
 * 
 * <dl>
 * <dt><b>Last Modified Date</b></dt>
 * <dd>2019-06-25</dd>
 * <dt><b>IP Status</b></dt>
 * <dd>No known IP claims.</dd>
 * <dt><b>Contributors</b></dt>
 * <dd><ul>
 * <li>Martin Dinkov, AMD</li>
 * <li>Matthaeus G. Chajdas, AMD</li>
 * </ul></dd>
 * </dl>
 */
public final class AMDShaderCoreProperties {

    /** The extension specification version. */
    public static final int VK_AMD_SHADER_CORE_PROPERTIES_SPEC_VERSION = 2;

    /** The extension name. */
    public static final String VK_AMD_SHADER_CORE_PROPERTIES_EXTENSION_NAME = "VK_AMD_shader_core_properties";

    /** Extends {@code VkStructureType}. */
    public static final int VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_SHADER_CORE_PROPERTIES_AMD = 1000185000;

    private AMDShaderCoreProperties() {}

}