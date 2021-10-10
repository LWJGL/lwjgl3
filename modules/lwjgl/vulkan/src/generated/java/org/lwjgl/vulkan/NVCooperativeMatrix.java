/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.vulkan;

import javax.annotation.*;

import java.nio.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.JNI.*;
import static org.lwjgl.system.MemoryUtil.*;

/**
 * This extension adds support for using cooperative matrix types in SPIR-V. Cooperative matrix types are medium-sized matrices that are primarily supported in compute shaders, where the storage for the matrix is spread across all invocations in some scope (usually a subgroup) and those invocations cooperate to efficiently perform matrix multiplies.
 * 
 * <p>Cooperative matrix types are defined by the <a target="_blank" href="https://htmlpreview.github.io/?https://github.com/KhronosGroup/SPIRV-Registry/blob/master/extensions/NV/SPV_NV_cooperative_matrix.html">{@code SPV_NV_cooperative_matrix}</a> SPIR-V extension and can be used with the <a target="_blank" href="https://github.com/KhronosGroup/GLSL/blob/master/extensions/nv/GLSL_NV_cooperative_matrix.txt">{@code GL_NV_cooperative_matrix}</a> GLSL extension.</p>
 * 
 * <p>This extension includes support for enumerating the matrix types and dimensions that are supported by the implementation.</p>
 * 
 * <h5>VK_NV_cooperative_matrix</h5>
 * 
 * <dl>
 * <dt><b>Name String</b></dt>
 * <dd>{@code VK_NV_cooperative_matrix}</dd>
 * <dt><b>Extension Type</b></dt>
 * <dd>Device extension</dd>
 * <dt><b>Registered Extension Number</b></dt>
 * <dd>250</dd>
 * <dt><b>Revision</b></dt>
 * <dd>1</dd>
 * <dt><b>Extension and Version Dependencies</b></dt>
 * <dd><ul>
 * <li>Requires Vulkan 1.0</li>
 * <li>Requires {@link KHRGetPhysicalDeviceProperties2 VK_KHR_get_physical_device_properties2}</li>
 * </ul></dd>
 * <dt><b>Contact</b></dt>
 * <dd><ul>
 * <li>Jeff Bolz <a target="_blank" href="https://github.com/KhronosGroup/Vulkan-Docs/issues/new?body=[VK_NV_cooperative_matrix]%20@jeffbolznv%250A%3C%3CHere%20describe%20the%20issue%20or%20question%20you%20have%20about%20the%20VK_NV_cooperative_matrix%20extension%3E%3E">jeffbolznv</a></li>
 * </ul></dd>
 * </dl>
 * 
 * <h5>Other Extension Metadata</h5>
 * 
 * <dl>
 * <dt><b>Last Modified Date</b></dt>
 * <dd>2019-02-05</dd>
 * <dt><b>Interactions and External Dependencies</b></dt>
 * <dd><ul>
 * <li>This extension requires <a target="_blank" href="https://htmlpreview.github.io/?https://github.com/KhronosGroup/SPIRV-Registry/blob/master/extensions/NV/SPV_NV_cooperative_matrix.html">{@code SPV_NV_cooperative_matrix}</a></li>
 * <li>This extension provides API support for <a target="_blank" href="https://github.com/KhronosGroup/GLSL/blob/master/extensions/nv/GLSL_NV_cooperative_matrix.txt">{@code GL_NV_cooperative_matrix}</a></li>
 * </ul></dd>
 * <dt><b>Contributors</b></dt>
 * <dd><ul>
 * <li>Jeff Bolz, NVIDIA</li>
 * <li>Markus Tavenrath, NVIDIA</li>
 * <li>Daniel Koch, NVIDIA</li>
 * </ul></dd>
 * </dl>
 */
public class NVCooperativeMatrix {

    /** The extension specification version. */
    public static final int VK_NV_COOPERATIVE_MATRIX_SPEC_VERSION = 1;

    /** The extension name. */
    public static final String VK_NV_COOPERATIVE_MATRIX_EXTENSION_NAME = "VK_NV_cooperative_matrix";

    /**
     * Extends {@code VkStructureType}.
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_COOPERATIVE_MATRIX_FEATURES_NV STRUCTURE_TYPE_PHYSICAL_DEVICE_COOPERATIVE_MATRIX_FEATURES_NV}</li>
     * <li>{@link #VK_STRUCTURE_TYPE_COOPERATIVE_MATRIX_PROPERTIES_NV STRUCTURE_TYPE_COOPERATIVE_MATRIX_PROPERTIES_NV}</li>
     * <li>{@link #VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_COOPERATIVE_MATRIX_PROPERTIES_NV STRUCTURE_TYPE_PHYSICAL_DEVICE_COOPERATIVE_MATRIX_PROPERTIES_NV}</li>
     * </ul>
     */
    public static final int
        VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_COOPERATIVE_MATRIX_FEATURES_NV   = 1000249000,
        VK_STRUCTURE_TYPE_COOPERATIVE_MATRIX_PROPERTIES_NV                 = 1000249001,
        VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_COOPERATIVE_MATRIX_PROPERTIES_NV = 1000249002;

    /**
     * VkComponentTypeNV - Specify SPIR-V cooperative matrix component type
     * 
     * <h5>Description</h5>
     * 
     * <ul>
     * <li>{@link #VK_COMPONENT_TYPE_FLOAT16_NV COMPONENT_TYPE_FLOAT16_NV} corresponds to SPIR-V {@code OpTypeFloat} 16.</li>
     * <li>{@link #VK_COMPONENT_TYPE_FLOAT32_NV COMPONENT_TYPE_FLOAT32_NV} corresponds to SPIR-V {@code OpTypeFloat} 32.</li>
     * <li>{@link #VK_COMPONENT_TYPE_FLOAT64_NV COMPONENT_TYPE_FLOAT64_NV} corresponds to SPIR-V {@code OpTypeFloat} 64.</li>
     * <li>{@link #VK_COMPONENT_TYPE_SINT8_NV COMPONENT_TYPE_SINT8_NV} corresponds to SPIR-V {@code OpTypeInt} 8 1.</li>
     * <li>{@link #VK_COMPONENT_TYPE_SINT16_NV COMPONENT_TYPE_SINT16_NV} corresponds to SPIR-V {@code OpTypeInt} 16 1.</li>
     * <li>{@link #VK_COMPONENT_TYPE_SINT32_NV COMPONENT_TYPE_SINT32_NV} corresponds to SPIR-V {@code OpTypeInt} 32 1.</li>
     * <li>{@link #VK_COMPONENT_TYPE_SINT64_NV COMPONENT_TYPE_SINT64_NV} corresponds to SPIR-V {@code OpTypeInt} 64 1.</li>
     * <li>{@link #VK_COMPONENT_TYPE_UINT8_NV COMPONENT_TYPE_UINT8_NV} corresponds to SPIR-V {@code OpTypeInt} 8 0.</li>
     * <li>{@link #VK_COMPONENT_TYPE_UINT16_NV COMPONENT_TYPE_UINT16_NV} corresponds to SPIR-V {@code OpTypeInt} 16 0.</li>
     * <li>{@link #VK_COMPONENT_TYPE_UINT32_NV COMPONENT_TYPE_UINT32_NV} corresponds to SPIR-V {@code OpTypeInt} 32 0.</li>
     * <li>{@link #VK_COMPONENT_TYPE_UINT64_NV COMPONENT_TYPE_UINT64_NV} corresponds to SPIR-V {@code OpTypeInt} 64 0.</li>
     * </ul>
     * 
     * <h5>See Also</h5>
     * 
     * <p>{@link VkCooperativeMatrixPropertiesNV}</p>
     */
    public static final int
        VK_COMPONENT_TYPE_FLOAT16_NV = 0,
        VK_COMPONENT_TYPE_FLOAT32_NV = 1,
        VK_COMPONENT_TYPE_FLOAT64_NV = 2,
        VK_COMPONENT_TYPE_SINT8_NV   = 3,
        VK_COMPONENT_TYPE_SINT16_NV  = 4,
        VK_COMPONENT_TYPE_SINT32_NV  = 5,
        VK_COMPONENT_TYPE_SINT64_NV  = 6,
        VK_COMPONENT_TYPE_UINT8_NV   = 7,
        VK_COMPONENT_TYPE_UINT16_NV  = 8,
        VK_COMPONENT_TYPE_UINT32_NV  = 9,
        VK_COMPONENT_TYPE_UINT64_NV  = 10;

    /**
     * VkScopeNV - Specify SPIR-V scope
     * 
     * <h5>Description</h5>
     * 
     * <ul>
     * <li>{@link #VK_SCOPE_DEVICE_NV SCOPE_DEVICE_NV} corresponds to SPIR-V {@code Device} scope.</li>
     * <li>{@link #VK_SCOPE_WORKGROUP_NV SCOPE_WORKGROUP_NV} corresponds to SPIR-V {@code Workgroup} scope.</li>
     * <li>{@link #VK_SCOPE_SUBGROUP_NV SCOPE_SUBGROUP_NV} corresponds to SPIR-V {@code Subgroup} scope.</li>
     * <li>{@link #VK_SCOPE_QUEUE_FAMILY_NV SCOPE_QUEUE_FAMILY_NV} corresponds to SPIR-V {@code QueueFamily} scope.</li>
     * </ul>
     * 
     * <p>All enum values match the corresponding SPIR-V value.</p>
     * 
     * <h5>See Also</h5>
     * 
     * <p>{@link VkCooperativeMatrixPropertiesNV}</p>
     */
    public static final int
        VK_SCOPE_DEVICE_NV       = 1,
        VK_SCOPE_WORKGROUP_NV    = 2,
        VK_SCOPE_SUBGROUP_NV     = 3,
        VK_SCOPE_QUEUE_FAMILY_NV = 5;

    protected NVCooperativeMatrix() {
        throw new UnsupportedOperationException();
    }

    // --- [ vkGetPhysicalDeviceCooperativeMatrixPropertiesNV ] ---

    /**
     * Unsafe version of: {@link #vkGetPhysicalDeviceCooperativeMatrixPropertiesNV GetPhysicalDeviceCooperativeMatrixPropertiesNV}
     *
     * @param pPropertyCount a pointer to an integer related to the number of cooperative matrix properties available or queried.
     */
    public static int nvkGetPhysicalDeviceCooperativeMatrixPropertiesNV(VkPhysicalDevice physicalDevice, long pPropertyCount, long pProperties) {
        long __functionAddress = physicalDevice.getCapabilities().vkGetPhysicalDeviceCooperativeMatrixPropertiesNV;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPPPI(physicalDevice.address(), pPropertyCount, pProperties, __functionAddress);
    }

    /**
     * Returns properties describing what cooperative matrix types are supported.
     * 
     * <h5>C Specification</h5>
     * 
     * <p>To enumerate the supported cooperative matrix types and operations, call:</p>
     * 
     * <pre><code>
     * VkResult vkGetPhysicalDeviceCooperativeMatrixPropertiesNV(
     *     VkPhysicalDevice                            physicalDevice,
     *     uint32_t*                                   pPropertyCount,
     *     VkCooperativeMatrixPropertiesNV*            pProperties);</code></pre>
     * 
     * <h5>Description</h5>
     * 
     * <p>If {@code pProperties} is {@code NULL}, then the number of cooperative matrix properties available is returned in {@code pPropertyCount}. Otherwise, {@code pPropertyCount} <b>must</b> point to a variable set by the user to the number of elements in the {@code pProperties} array, and on return the variable is overwritten with the number of structures actually written to {@code pProperties}. If {@code pPropertyCount} is less than the number of cooperative matrix properties available, at most {@code pPropertyCount} structures will be written, and {@link VK10#VK_INCOMPLETE INCOMPLETE} will be returned instead of {@link VK10#VK_SUCCESS SUCCESS}, to indicate that not all the available cooperative matrix properties were returned.</p>
     * 
     * <h5>Valid Usage (Implicit)</h5>
     * 
     * <ul>
     * <li>{@code physicalDevice} <b>must</b> be a valid {@code VkPhysicalDevice} handle</li>
     * <li>{@code pPropertyCount} <b>must</b> be a valid pointer to a {@code uint32_t} value</li>
     * <li>If the value referenced by {@code pPropertyCount} is not 0, and {@code pProperties} is not {@code NULL}, {@code pProperties} <b>must</b> be a valid pointer to an array of {@code pPropertyCount} {@link VkCooperativeMatrixPropertiesNV} structures</li>
     * </ul>
     * 
     * <h5>Return Codes</h5>
     * 
     * <dl>
     * <dt>On success, this command returns</dt>
     * <dd><ul>
     * <li>{@link VK10#VK_SUCCESS SUCCESS}</li>
     * <li>{@link VK10#VK_INCOMPLETE INCOMPLETE}</li>
     * </ul></dd>
     * <dt>On failure, this command returns</dt>
     * <dd><ul>
     * <li>{@link VK10#VK_ERROR_OUT_OF_HOST_MEMORY ERROR_OUT_OF_HOST_MEMORY}</li>
     * <li>{@link VK10#VK_ERROR_OUT_OF_DEVICE_MEMORY ERROR_OUT_OF_DEVICE_MEMORY}</li>
     * </ul></dd>
     * </dl>
     * 
     * <h5>See Also</h5>
     * 
     * <p>{@link VkCooperativeMatrixPropertiesNV}</p>
     *
     * @param physicalDevice the physical device.
     * @param pPropertyCount a pointer to an integer related to the number of cooperative matrix properties available or queried.
     * @param pProperties    either {@code NULL} or a pointer to an array of {@link VkCooperativeMatrixPropertiesNV} structures.
     */
    @NativeType("VkResult")
    public static int vkGetPhysicalDeviceCooperativeMatrixPropertiesNV(VkPhysicalDevice physicalDevice, @NativeType("uint32_t *") IntBuffer pPropertyCount, @Nullable @NativeType("VkCooperativeMatrixPropertiesNV *") VkCooperativeMatrixPropertiesNV.Buffer pProperties) {
        if (CHECKS) {
            check(pPropertyCount, 1);
            checkSafe(pProperties, pPropertyCount.get(pPropertyCount.position()));
        }
        return nvkGetPhysicalDeviceCooperativeMatrixPropertiesNV(physicalDevice, memAddress(pPropertyCount), memAddressSafe(pProperties));
    }

    /** Array version of: {@link #vkGetPhysicalDeviceCooperativeMatrixPropertiesNV GetPhysicalDeviceCooperativeMatrixPropertiesNV} */
    @NativeType("VkResult")
    public static int vkGetPhysicalDeviceCooperativeMatrixPropertiesNV(VkPhysicalDevice physicalDevice, @NativeType("uint32_t *") int[] pPropertyCount, @Nullable @NativeType("VkCooperativeMatrixPropertiesNV *") VkCooperativeMatrixPropertiesNV.Buffer pProperties) {
        long __functionAddress = physicalDevice.getCapabilities().vkGetPhysicalDeviceCooperativeMatrixPropertiesNV;
        if (CHECKS) {
            check(__functionAddress);
            check(pPropertyCount, 1);
            checkSafe(pProperties, pPropertyCount[0]);
        }
        return callPPPI(physicalDevice.address(), pPropertyCount, memAddressSafe(pProperties), __functionAddress);
    }

}