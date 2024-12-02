/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package vulkan.templates

import org.lwjgl.generator.*
import vulkan.*

val NV_cooperative_matrix2 = "NVCooperativeMatrix2".nativeClassVK("NV_cooperative_matrix2", type = "device", postfix = "NV") {
    documentation =
        """
        This extension adds several new features building on the cooperative matrix types added in VK_KHR_cooperative_matrix. The goal is to add and accelerate features beyond just simple GEMM kernels, including adding support for type/use conversions, reductions, per-element operations, and tensor addressing, and also to improve usability and out-of-the-box performance by adding support for more flexible matrix sizes, and workgroup scope matrices with compiler-managed staging through shared memory.

        The new functionality is defined by the <a href="https://htmlpreview.github.io/?https://github.com/KhronosGroup/SPIRV-Registry/blob/master/extensions/NV/SPV_NV_tensor_addressing.html">{@code SPV_NV_tensor_addressing}</a> and <a href="https://htmlpreview.github.io/?https://github.com/KhronosGroup/SPIRV-Registry/blob/master/extensions/NV/SPV_NV_cooperative_matrix2.html">{@code SPV_NV_cooperative_matrix2}</a> SPIR-V extensions and can be used with the <a href="https://github.com/KhronosGroup/GLSL/blob/main/extensions/nv/GLSL_NV_cooperative_matrix2.txt">{@code GLSL_NV_cooperative_matrix2}</a> GLSL extension.

        This extension includes support for enumerating the matrix types and dimensions that are supported by the implementation, and which specific features are supported.

        <dl>
            <dt><b>Name String</b></dt>
            <dd>{@code VK_NV_cooperative_matrix2}</dd>

            <dt><b>Extension Type</b></dt>
            <dd>Device extension</dd>

            <dt><b>Registered Extension Number</b></dt>
            <dd>594</dd>

            <dt><b>Revision</b></dt>
            <dd>1</dd>

            <dt><b>Extension and Version Dependencies</b></dt>
            <dd>{@link KHRCooperativeMatrix VK_KHR_cooperative_matrix}</dd>

            <dt><b>SPIR-V Dependencies</b></dt>
            <dd><ul>
                <li><a href="https://htmlpreview.github.io/?https://github.com/KhronosGroup/SPIRV-Registry/blob/master/extensions/NV/SPV_NV_cooperative_matrix2.html">SPV_NV_cooperative_matrix2</a></li>
                <li><a href="https://htmlpreview.github.io/?https://github.com/KhronosGroup/SPIRV-Registry/blob/master/extensions/NV/SPV_NV_tensor_addressing.html">SPV_NV_tensor_addressing</a></li>
            </ul></dd>

            <dt><b>Contact</b></dt>
            <dd><ul>
                <li>Jeff Bolz <a href="https://github.com/KhronosGroup/Vulkan-Docs/issues/new?body=[VK_NV_cooperative_matrix2]%20@jeffbolznv%250A*Here%20describe%20the%20issue%20or%20question%20you%20have%20about%20the%20VK_NV_cooperative_matrix2%20extension*">jeffbolznv</a></li>
            </ul></dd>

            <dt><b>Extension Proposal</b></dt>
            <dd><a href="https://github.com/KhronosGroup/Vulkan-Docs/tree/main/proposals/VK_NV_cooperative_matrix2.adoc">VK_NV_cooperative_matrix2</a></dd>
        </dl>

        <h5>Other Extension Metadata</h5>
        <dl>
            <dt><b>Last Modified Date</b></dt>
            <dd>2024-08-01</dd>

            <dt><b>Interactions and External Dependencies</b></dt>
            <dd><ul>
                <li>This extension provides API support for <a href="https://github.com/KhronosGroup/GLSL/blob/main/extensions/nv/GLSL_NV_cooperative_matrix2.txt">{@code GLSL_NV_cooperative_matrix2}</a></li>
            </ul></dd>

            <dt><b>Contributors</b></dt>
            <dd><ul>
                <li>Jeff Bolz, NVIDIA</li>
                <li>Karthik Vaidyanathan, NVIDIA</li>
            </ul></dd>
        </dl>
        """

    IntConstant(
        "The extension specification version.",

        "NV_COOPERATIVE_MATRIX_2_SPEC_VERSION".."1"
    )

    StringConstant(
        "The extension name.",

        "NV_COOPERATIVE_MATRIX_2_EXTENSION_NAME".."VK_NV_cooperative_matrix2"
    )

    EnumConstant(
        "Extends {@code VkStructureType}.",

        "STRUCTURE_TYPE_PHYSICAL_DEVICE_COOPERATIVE_MATRIX_2_FEATURES_NV".."1000593000",
        "STRUCTURE_TYPE_COOPERATIVE_MATRIX_FLEXIBLE_DIMENSIONS_PROPERTIES_NV".."1000593001",
        "STRUCTURE_TYPE_PHYSICAL_DEVICE_COOPERATIVE_MATRIX_2_PROPERTIES_NV".."1000593002"
    )

    VkResult(
        "GetPhysicalDeviceCooperativeMatrixFlexibleDimensionsPropertiesNV",
        """
        Returns properties describing what cooperative matrix types are supported.

        <h5>C Specification</h5>
        To enumerate additional supported cooperative matrix types and operations, call:

        <pre><code>
￿VkResult vkGetPhysicalDeviceCooperativeMatrixFlexibleDimensionsPropertiesNV(
￿    VkPhysicalDevice                            physicalDevice,
￿    uint32_t*                                   pPropertyCount,
￿    VkCooperativeMatrixFlexibleDimensionsPropertiesNV* pProperties);</code></pre>

        <h5>Description</h5>
        If {@code pProperties} is {@code NULL}, then the number of flexible dimensions properties available is returned in {@code pPropertyCount}. Otherwise, {@code pPropertyCount} <b>must</b> point to a variable set by the application to the number of elements in the {@code pProperties} array, and on return the variable is overwritten with the number of structures actually written to {@code pProperties}. If {@code pPropertyCount} is less than the number flexible dimensions properties available, at most {@code pPropertyCount} structures will be written, and #INCOMPLETE will be returned instead of #SUCCESS, to indicate that not all the available flexible dimensions properties were returned.

        If the <a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html\#features-cooperativeMatrixFlexibleDimensions">{@code cooperativeMatrixFlexibleDimensions}</a> feature is not supported, the implementation <b>must</b> advertise zero properties.

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code physicalDevice} <b>must</b> be a valid {@code VkPhysicalDevice} handle</li>
            <li>{@code pPropertyCount} <b>must</b> be a valid pointer to a {@code uint32_t} value</li>
            <li>If the value referenced by {@code pPropertyCount} is not 0, and {@code pProperties} is not {@code NULL}, {@code pProperties} <b>must</b> be a valid pointer to an array of {@code pPropertyCount} ##VkCooperativeMatrixFlexibleDimensionsPropertiesNV structures</li>
        </ul>

        <h5>Return Codes</h5>
        <dl>
            <dt>On success, this command returns</dt>
            <dd><ul>
                <li>#SUCCESS</li>
                <li>#INCOMPLETE</li>
            </ul></dd>

            <dt>On failure, this command returns</dt>
            <dd><ul>
                <li>#ERROR_OUT_OF_HOST_MEMORY</li>
                <li>#ERROR_OUT_OF_DEVICE_MEMORY</li>
            </ul></dd>
        </dl>

        <h5>See Also</h5>
        ##VkCooperativeMatrixFlexibleDimensionsPropertiesNV
        """,

        VkPhysicalDevice("physicalDevice", "the physical device."),
        AutoSize("pProperties")..Check(1)..uint32_t.p("pPropertyCount", "a pointer to an integer related to the number of cooperative matrix properties available or queried."),
        nullable..VkCooperativeMatrixFlexibleDimensionsPropertiesNV.p("pProperties", "either {@code NULL} or a pointer to an array of ##VkCooperativeMatrixFlexibleDimensionsPropertiesNV structures.")
    )
}