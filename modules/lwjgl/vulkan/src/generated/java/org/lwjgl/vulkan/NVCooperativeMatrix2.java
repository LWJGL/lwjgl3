/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.vulkan;

import org.jspecify.annotations.*;

import java.nio.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.JNI.*;
import static org.lwjgl.system.MemoryUtil.*;

/**
 * This extension adds several new features building on the cooperative matrix types added in VK_KHR_cooperative_matrix. The goal is to add and accelerate features beyond just simple GEMM kernels, including adding support for type/use conversions, reductions, per-element operations, and tensor addressing, and also to improve usability and out-of-the-box performance by adding support for more flexible matrix sizes, and workgroup scope matrices with compiler-managed staging through shared memory.
 * 
 * <p>The new functionality is defined by the <a href="https://htmlpreview.github.io/?https://github.com/KhronosGroup/SPIRV-Registry/blob/master/extensions/NV/SPV_NV_tensor_addressing.html">{@code SPV_NV_tensor_addressing}</a> and <a href="https://htmlpreview.github.io/?https://github.com/KhronosGroup/SPIRV-Registry/blob/master/extensions/NV/SPV_NV_cooperative_matrix2.html">{@code SPV_NV_cooperative_matrix2}</a> SPIR-V extensions and can be used with the <a href="https://github.com/KhronosGroup/GLSL/blob/main/extensions/nv/GLSL_NV_cooperative_matrix2.txt">{@code GLSL_NV_cooperative_matrix2}</a> GLSL extension.</p>
 * 
 * <p>This extension includes support for enumerating the matrix types and dimensions that are supported by the implementation, and which specific features are supported.</p>
 * 
 * <dl>
 * <dt><b>Name String</b></dt>
 * <dd>{@code VK_NV_cooperative_matrix2}</dd>
 * <dt><b>Extension Type</b></dt>
 * <dd>Device extension</dd>
 * <dt><b>Registered Extension Number</b></dt>
 * <dd>594</dd>
 * <dt><b>Revision</b></dt>
 * <dd>1</dd>
 * <dt><b>Extension and Version Dependencies</b></dt>
 * <dd>{@link KHRCooperativeMatrix VK_KHR_cooperative_matrix}</dd>
 * <dt><b>SPIR-V Dependencies</b></dt>
 * <dd><ul>
 * <li><a href="https://htmlpreview.github.io/?https://github.com/KhronosGroup/SPIRV-Registry/blob/master/extensions/NV/SPV_NV_cooperative_matrix2.html">SPV_NV_cooperative_matrix2</a></li>
 * <li><a href="https://htmlpreview.github.io/?https://github.com/KhronosGroup/SPIRV-Registry/blob/master/extensions/NV/SPV_NV_tensor_addressing.html">SPV_NV_tensor_addressing</a></li>
 * </ul></dd>
 * <dt><b>Contact</b></dt>
 * <dd><ul>
 * <li>Jeff Bolz <a href="https://github.com/KhronosGroup/Vulkan-Docs/issues/new?body=[VK_NV_cooperative_matrix2]%20@jeffbolznv%250A*Here%20describe%20the%20issue%20or%20question%20you%20have%20about%20the%20VK_NV_cooperative_matrix2%20extension*">jeffbolznv</a></li>
 * </ul></dd>
 * <dt><b>Extension Proposal</b></dt>
 * <dd><a href="https://github.com/KhronosGroup/Vulkan-Docs/tree/main/proposals/VK_NV_cooperative_matrix2.adoc">VK_NV_cooperative_matrix2</a></dd>
 * </dl>
 * 
 * <h5>Other Extension Metadata</h5>
 * 
 * <dl>
 * <dt><b>Last Modified Date</b></dt>
 * <dd>2024-08-01</dd>
 * <dt><b>Interactions and External Dependencies</b></dt>
 * <dd><ul>
 * <li>This extension provides API support for <a href="https://github.com/KhronosGroup/GLSL/blob/main/extensions/nv/GLSL_NV_cooperative_matrix2.txt">{@code GLSL_NV_cooperative_matrix2}</a></li>
 * </ul></dd>
 * <dt><b>Contributors</b></dt>
 * <dd><ul>
 * <li>Jeff Bolz, NVIDIA</li>
 * <li>Karthik Vaidyanathan, NVIDIA</li>
 * </ul></dd>
 * </dl>
 */
public class NVCooperativeMatrix2 {

    /** The extension specification version. */
    public static final int VK_NV_COOPERATIVE_MATRIX_2_SPEC_VERSION = 1;

    /** The extension name. */
    public static final String VK_NV_COOPERATIVE_MATRIX_2_EXTENSION_NAME = "VK_NV_cooperative_matrix2";

    /**
     * Extends {@code VkStructureType}.
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_COOPERATIVE_MATRIX_2_FEATURES_NV STRUCTURE_TYPE_PHYSICAL_DEVICE_COOPERATIVE_MATRIX_2_FEATURES_NV}</li>
     * <li>{@link #VK_STRUCTURE_TYPE_COOPERATIVE_MATRIX_FLEXIBLE_DIMENSIONS_PROPERTIES_NV STRUCTURE_TYPE_COOPERATIVE_MATRIX_FLEXIBLE_DIMENSIONS_PROPERTIES_NV}</li>
     * <li>{@link #VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_COOPERATIVE_MATRIX_2_PROPERTIES_NV STRUCTURE_TYPE_PHYSICAL_DEVICE_COOPERATIVE_MATRIX_2_PROPERTIES_NV}</li>
     * </ul>
     */
    public static final int
        VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_COOPERATIVE_MATRIX_2_FEATURES_NV     = 1000593000,
        VK_STRUCTURE_TYPE_COOPERATIVE_MATRIX_FLEXIBLE_DIMENSIONS_PROPERTIES_NV = 1000593001,
        VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_COOPERATIVE_MATRIX_2_PROPERTIES_NV   = 1000593002;

    protected NVCooperativeMatrix2() {
        throw new UnsupportedOperationException();
    }

    // --- [ vkGetPhysicalDeviceCooperativeMatrixFlexibleDimensionsPropertiesNV ] ---

    /**
     * Unsafe version of: {@link #vkGetPhysicalDeviceCooperativeMatrixFlexibleDimensionsPropertiesNV GetPhysicalDeviceCooperativeMatrixFlexibleDimensionsPropertiesNV}
     *
     * @param pPropertyCount a pointer to an integer related to the number of cooperative matrix properties available or queried.
     */
    public static int nvkGetPhysicalDeviceCooperativeMatrixFlexibleDimensionsPropertiesNV(VkPhysicalDevice physicalDevice, long pPropertyCount, long pProperties) {
        long __functionAddress = physicalDevice.getCapabilities().vkGetPhysicalDeviceCooperativeMatrixFlexibleDimensionsPropertiesNV;
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
     * <p>To enumerate additional supported cooperative matrix types and operations, call:</p>
     * 
     * <pre><code>
     * VkResult vkGetPhysicalDeviceCooperativeMatrixFlexibleDimensionsPropertiesNV(
     *     VkPhysicalDevice                            physicalDevice,
     *     uint32_t*                                   pPropertyCount,
     *     VkCooperativeMatrixFlexibleDimensionsPropertiesNV* pProperties);</code></pre>
     * 
     * <h5>Description</h5>
     * 
     * <p>If {@code pProperties} is {@code NULL}, then the number of flexible dimensions properties available is returned in {@code pPropertyCount}. Otherwise, {@code pPropertyCount} <b>must</b> point to a variable set by the application to the number of elements in the {@code pProperties} array, and on return the variable is overwritten with the number of structures actually written to {@code pProperties}. If {@code pPropertyCount} is less than the number flexible dimensions properties available, at most {@code pPropertyCount} structures will be written, and {@link VK10#VK_INCOMPLETE INCOMPLETE} will be returned instead of {@link VK10#VK_SUCCESS SUCCESS}, to indicate that not all the available flexible dimensions properties were returned.</p>
     * 
     * <p>If the <a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html#features-cooperativeMatrixFlexibleDimensions">{@code cooperativeMatrixFlexibleDimensions}</a> feature is not supported, the implementation <b>must</b> advertise zero properties.</p>
     * 
     * <h5>Valid Usage (Implicit)</h5>
     * 
     * <ul>
     * <li>{@code physicalDevice} <b>must</b> be a valid {@code VkPhysicalDevice} handle</li>
     * <li>{@code pPropertyCount} <b>must</b> be a valid pointer to a {@code uint32_t} value</li>
     * <li>If the value referenced by {@code pPropertyCount} is not 0, and {@code pProperties} is not {@code NULL}, {@code pProperties} <b>must</b> be a valid pointer to an array of {@code pPropertyCount} {@link VkCooperativeMatrixFlexibleDimensionsPropertiesNV} structures</li>
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
     * <p>{@link VkCooperativeMatrixFlexibleDimensionsPropertiesNV}</p>
     *
     * @param physicalDevice the physical device.
     * @param pPropertyCount a pointer to an integer related to the number of cooperative matrix properties available or queried.
     * @param pProperties    either {@code NULL} or a pointer to an array of {@link VkCooperativeMatrixFlexibleDimensionsPropertiesNV} structures.
     */
    @NativeType("VkResult")
    public static int vkGetPhysicalDeviceCooperativeMatrixFlexibleDimensionsPropertiesNV(VkPhysicalDevice physicalDevice, @NativeType("uint32_t *") IntBuffer pPropertyCount, @NativeType("VkCooperativeMatrixFlexibleDimensionsPropertiesNV *") VkCooperativeMatrixFlexibleDimensionsPropertiesNV.@Nullable Buffer pProperties) {
        if (CHECKS) {
            check(pPropertyCount, 1);
            checkSafe(pProperties, pPropertyCount.get(pPropertyCount.position()));
        }
        return nvkGetPhysicalDeviceCooperativeMatrixFlexibleDimensionsPropertiesNV(physicalDevice, memAddress(pPropertyCount), memAddressSafe(pProperties));
    }

    /** Array version of: {@link #vkGetPhysicalDeviceCooperativeMatrixFlexibleDimensionsPropertiesNV GetPhysicalDeviceCooperativeMatrixFlexibleDimensionsPropertiesNV} */
    @NativeType("VkResult")
    public static int vkGetPhysicalDeviceCooperativeMatrixFlexibleDimensionsPropertiesNV(VkPhysicalDevice physicalDevice, @NativeType("uint32_t *") int[] pPropertyCount, @NativeType("VkCooperativeMatrixFlexibleDimensionsPropertiesNV *") VkCooperativeMatrixFlexibleDimensionsPropertiesNV.@Nullable Buffer pProperties) {
        long __functionAddress = physicalDevice.getCapabilities().vkGetPhysicalDeviceCooperativeMatrixFlexibleDimensionsPropertiesNV;
        if (CHECKS) {
            check(__functionAddress);
            check(pPropertyCount, 1);
            checkSafe(pProperties, pPropertyCount[0]);
        }
        return callPPPI(physicalDevice.address(), pPropertyCount, memAddressSafe(pProperties), __functionAddress);
    }

}