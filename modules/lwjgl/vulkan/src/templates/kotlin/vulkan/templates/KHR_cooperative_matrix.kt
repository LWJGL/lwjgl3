/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package vulkan.templates

import org.lwjgl.generator.*
import vulkan.*

val KHR_cooperative_matrix = "KHRCooperativeMatrix".nativeClassVK("KHR_cooperative_matrix", type = "device", postfix = "KHR") {
    documentation =
        """
        This extension adds support for using cooperative matrix types in SPIR-V. Cooperative matrix types are medium-sized matrices that are primarily supported in compute shaders, where the storage for the matrix is spread across all invocations in some scope (usually a subgroup) and those invocations cooperate to efficiently perform matrix multiplies.

        Cooperative matrix types are defined by the <a href="https://htmlpreview.github.io/?https://github.com/KhronosGroup/SPIRV-Registry/blob/master/extensions/KHR/SPV_KHR_cooperative_matrix.html">{@code SPV_KHR_cooperative_matrix}</a> SPIR-V extension and can be used with the <a href="https://github.com/KhronosGroup/GLSL/blob/master/extensions/khr/GL_KHR_cooperative_matrix.txt">{@code GL_KHR_cooperative_matrix}</a> GLSL extension.

        This extension includes support for enumerating the matrix types and dimensions that are supported by the implementation.

        <h5>VK_KHR_cooperative_matrix</h5>
        <dl>
            <dt><b>Name String</b></dt>
            <dd>{@code VK_KHR_cooperative_matrix}</dd>

            <dt><b>Extension Type</b></dt>
            <dd>Device extension</dd>

            <dt><b>Registered Extension Number</b></dt>
            <dd>507</dd>

            <dt><b>Revision</b></dt>
            <dd>2</dd>

            <dt><b>Extension and Version Dependencies</b></dt>
            <dd>{@link KHRGetPhysicalDeviceProperties2 VK_KHR_get_physical_device_properties2}</dd>

            <dt><b>Contact</b></dt>
            <dd><ul>
                <li>Kevin Petit <a href="https://github.com/KhronosGroup/Vulkan-Docs/issues/new?body=[VK_KHR_cooperative_matrix]%20@kpet%250A*Here%20describe%20the%20issue%20or%20question%20you%20have%20about%20the%20VK_KHR_cooperative_matrix%20extension*">kpet</a></li>
            </ul></dd>
        </dl>

        <h5>Other Extension Metadata</h5>
        <dl>
            <dt><b>Last Modified Date</b></dt>
            <dd>2023-05-03</dd>

            <dt><b>Interactions and External Dependencies</b></dt>
            <dd><ul>
                <li>This extension requires <a href="https://htmlpreview.github.io/?https://github.com/KhronosGroup/SPIRV-Registry/blob/master/extensions/KHR/SPV_KHR_cooperative_matrix.html">{@code SPV_KHR_cooperative_matrix}</a></li>
                <li>This extension provides API support for <a href="https://github.com/KhronosGroup/GLSL/blob/master/extensions/khr/GL_KHR_cooperative_matrix.txt">{@code GL_KHR_cooperative_matrix}</a></li>
            </ul></dd>

            <dt><b>Contributors</b></dt>
            <dd><ul>
                <li>Jeff Bolz, NVIDIA</li>
                <li>Markus Tavenrath, NVIDIA</li>
                <li>Daniel Koch, NVIDIA</li>
                <li>Kevin Petit, Arm Ltd.</li>
                <li>Boris Zanin, AMD</li>
            </ul></dd>
        </dl>
        """

    IntConstant(
        "The extension specification version.",

        "KHR_COOPERATIVE_MATRIX_SPEC_VERSION".."2"
    )

    StringConstant(
        "The extension name.",

        "KHR_COOPERATIVE_MATRIX_EXTENSION_NAME".."VK_KHR_cooperative_matrix"
    )

    EnumConstant(
        "Extends {@code VkStructureType}.",

        "STRUCTURE_TYPE_PHYSICAL_DEVICE_COOPERATIVE_MATRIX_FEATURES_KHR".."1000506000",
        "STRUCTURE_TYPE_COOPERATIVE_MATRIX_PROPERTIES_KHR".."1000506001",
        "STRUCTURE_TYPE_PHYSICAL_DEVICE_COOPERATIVE_MATRIX_PROPERTIES_KHR".."1000506002"
    )

    EnumConstant(
        """
        VkComponentTypeKHR - Specify SPIR-V cooperative matrix component type

        <h5>Description</h5>
        <ul>
            <li>#COMPONENT_TYPE_FLOAT16_KHR corresponds to SPIR-V {@code OpTypeFloat} 16.</li>
            <li>#COMPONENT_TYPE_FLOAT32_KHR corresponds to SPIR-V {@code OpTypeFloat} 32.</li>
            <li>#COMPONENT_TYPE_FLOAT64_KHR corresponds to SPIR-V {@code OpTypeFloat} 64.</li>
            <li>#COMPONENT_TYPE_SINT8_KHR corresponds to SPIR-V {@code OpTypeInt} 8 1.</li>
            <li>#COMPONENT_TYPE_SINT16_KHR corresponds to SPIR-V {@code OpTypeInt} 16 1.</li>
            <li>#COMPONENT_TYPE_SINT32_KHR corresponds to SPIR-V {@code OpTypeInt} 32 1.</li>
            <li>#COMPONENT_TYPE_SINT64_KHR corresponds to SPIR-V {@code OpTypeInt} 64 1.</li>
            <li>#COMPONENT_TYPE_UINT8_KHR corresponds to SPIR-V {@code OpTypeInt} 8 0.</li>
            <li>#COMPONENT_TYPE_UINT16_KHR corresponds to SPIR-V {@code OpTypeInt} 16 0.</li>
            <li>#COMPONENT_TYPE_UINT32_KHR corresponds to SPIR-V {@code OpTypeInt} 32 0.</li>
            <li>#COMPONENT_TYPE_UINT64_KHR corresponds to SPIR-V {@code OpTypeInt} 64 0.</li>
        </ul>

        <h5>See Also</h5>
        ##VkCooperativeMatrixPropertiesKHR
        """,

        "COMPONENT_TYPE_FLOAT16_KHR".."0",
        "COMPONENT_TYPE_FLOAT32_KHR".."1",
        "COMPONENT_TYPE_FLOAT64_KHR".."2",
        "COMPONENT_TYPE_SINT8_KHR".."3",
        "COMPONENT_TYPE_SINT16_KHR".."4",
        "COMPONENT_TYPE_SINT32_KHR".."5",
        "COMPONENT_TYPE_SINT64_KHR".."6",
        "COMPONENT_TYPE_UINT8_KHR".."7",
        "COMPONENT_TYPE_UINT16_KHR".."8",
        "COMPONENT_TYPE_UINT32_KHR".."9",
        "COMPONENT_TYPE_UINT64_KHR".."10"
    )

    EnumConstant(
        """
        VkScopeKHR - Specify SPIR-V scope

        <h5>Description</h5>
        <ul>
            <li>#SCOPE_DEVICE_KHR corresponds to SPIR-V {@code Device} scope.</li>
            <li>#SCOPE_WORKGROUP_KHR corresponds to SPIR-V {@code Workgroup} scope.</li>
            <li>#SCOPE_SUBGROUP_KHR corresponds to SPIR-V {@code Subgroup} scope.</li>
            <li>#SCOPE_QUEUE_FAMILY_KHR corresponds to SPIR-V {@code QueueFamily} scope.</li>
        </ul>

        All enum values match the corresponding SPIR-V value.

        <h5>See Also</h5>
        ##VkCooperativeMatrixPropertiesKHR
        """,

        "SCOPE_DEVICE_KHR".."1",
        "SCOPE_WORKGROUP_KHR".."2",
        "SCOPE_SUBGROUP_KHR".."3",
        "SCOPE_QUEUE_FAMILY_KHR".."5"
    )

    VkResult(
        "GetPhysicalDeviceCooperativeMatrixPropertiesKHR",
        """
        Returns properties describing what cooperative matrix types are supported.

        <h5>C Specification</h5>
        To enumerate the supported cooperative matrix types and operations, call:

        <pre><code>
￿VkResult vkGetPhysicalDeviceCooperativeMatrixPropertiesKHR(
￿    VkPhysicalDevice                            physicalDevice,
￿    uint32_t*                                   pPropertyCount,
￿    VkCooperativeMatrixPropertiesKHR*           pProperties);</code></pre>

        <h5>Description</h5>
        If {@code pProperties} is {@code NULL}, then the number of cooperative matrix properties available is returned in {@code pPropertyCount}. Otherwise, {@code pPropertyCount} <b>must</b> point to a variable set by the user to the number of elements in the {@code pProperties} array, and on return the variable is overwritten with the number of structures actually written to {@code pProperties}. If {@code pPropertyCount} is less than the number of cooperative matrix properties available, at most {@code pPropertyCount} structures will be written, and #INCOMPLETE will be returned instead of #SUCCESS, to indicate that not all the available cooperative matrix properties were returned.

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code physicalDevice} <b>must</b> be a valid {@code VkPhysicalDevice} handle</li>
            <li>{@code pPropertyCount} <b>must</b> be a valid pointer to a {@code uint32_t} value</li>
            <li>If the value referenced by {@code pPropertyCount} is not 0, and {@code pProperties} is not {@code NULL}, {@code pProperties} <b>must</b> be a valid pointer to an array of {@code pPropertyCount} ##VkCooperativeMatrixPropertiesKHR structures</li>
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
        ##VkCooperativeMatrixPropertiesKHR
        """,

        VkPhysicalDevice("physicalDevice", "the physical device."),
        AutoSize("pProperties")..Check(1)..uint32_t.p("pPropertyCount", "a pointer to an integer related to the number of cooperative matrix properties available or queried."),
        nullable..VkCooperativeMatrixPropertiesKHR.p("pProperties", "either {@code NULL} or a pointer to an array of ##VkCooperativeMatrixPropertiesKHR structures.")
    )
}