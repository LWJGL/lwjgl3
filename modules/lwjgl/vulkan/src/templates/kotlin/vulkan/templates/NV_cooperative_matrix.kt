/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package vulkan.templates

import org.lwjgl.generator.*
import vulkan.*

val NV_cooperative_matrix = "NVCooperativeMatrix".nativeClassVK("NV_cooperative_matrix", type = "device", postfix = "NV") {
    documentation =
        """
        This extension adds support for using cooperative matrix types in SPIR-V. Cooperative matrix types are medium-sized matrices that are primarily supported in compute shaders, where the storage for the matrix is spread across all invocations in some scope (usually a subgroup) and those invocations cooperate to efficiently perform matrix multiplies.

        Cooperative matrix types are defined by the <a href="https://htmlpreview.github.io/?https://github.com/KhronosGroup/SPIRV-Registry/blob/master/extensions/NV/SPV_NV_cooperative_matrix.html">{@code SPV_NV_cooperative_matrix}</a> SPIR-V extension and can be used with the <a href="https://github.com/KhronosGroup/GLSL/blob/master/extensions/nv/GLSL_NV_cooperative_matrix.txt">{@code GL_NV_cooperative_matrix}</a> GLSL extension.

        This extension includes support for enumerating the matrix types and dimensions that are supported by the implementation.

        <h5>VK_NV_cooperative_matrix</h5>
        <dl>
            <dt><b>Name String</b></dt>
            <dd>{@code VK_NV_cooperative_matrix}</dd>

            <dt><b>Extension Type</b></dt>
            <dd>Device extension</dd>

            <dt><b>Registered Extension Number</b></dt>
            <dd>250</dd>

            <dt><b>Revision</b></dt>
            <dd>1</dd>

            <dt><b>Extension and Version Dependencies</b></dt>
            <dd>{@link KHRGetPhysicalDeviceProperties2 VK_KHR_get_physical_device_properties2}</dd>

            <dt><b>Contact</b></dt>
            <dd><ul>
                <li>Jeff Bolz <a href="https://github.com/KhronosGroup/Vulkan-Docs/issues/new?body=[VK_NV_cooperative_matrix]%20@jeffbolznv%250A*Here%20describe%20the%20issue%20or%20question%20you%20have%20about%20the%20VK_NV_cooperative_matrix%20extension*">jeffbolznv</a></li>
            </ul></dd>
        </dl>

        <h5>Other Extension Metadata</h5>
        <dl>
            <dt><b>Last Modified Date</b></dt>
            <dd>2019-02-05</dd>

            <dt><b>Interactions and External Dependencies</b></dt>
            <dd><ul>
                <li>This extension requires <a href="https://htmlpreview.github.io/?https://github.com/KhronosGroup/SPIRV-Registry/blob/master/extensions/NV/SPV_NV_cooperative_matrix.html">{@code SPV_NV_cooperative_matrix}</a></li>
                <li>This extension provides API support for <a href="https://github.com/KhronosGroup/GLSL/blob/master/extensions/nv/GLSL_NV_cooperative_matrix.txt">{@code GL_NV_cooperative_matrix}</a></li>
            </ul></dd>

            <dt><b>Contributors</b></dt>
            <dd><ul>
                <li>Jeff Bolz, NVIDIA</li>
                <li>Markus Tavenrath, NVIDIA</li>
                <li>Daniel Koch, NVIDIA</li>
            </ul></dd>
        </dl>
        """

    IntConstant(
        "The extension specification version.",

        "NV_COOPERATIVE_MATRIX_SPEC_VERSION".."1"
    )

    StringConstant(
        "The extension name.",

        "NV_COOPERATIVE_MATRIX_EXTENSION_NAME".."VK_NV_cooperative_matrix"
    )

    EnumConstant(
        "Extends {@code VkStructureType}.",

        "STRUCTURE_TYPE_PHYSICAL_DEVICE_COOPERATIVE_MATRIX_FEATURES_NV".."1000249000",
        "STRUCTURE_TYPE_COOPERATIVE_MATRIX_PROPERTIES_NV".."1000249001",
        "STRUCTURE_TYPE_PHYSICAL_DEVICE_COOPERATIVE_MATRIX_PROPERTIES_NV".."1000249002"
    )

    EnumConstant(
        "Extends {@code VkScopeKHR}.",

        "SCOPE_DEVICE_NV".."1",
        "SCOPE_WORKGROUP_NV".."2",
        "SCOPE_SUBGROUP_NV".."3",
        "SCOPE_QUEUE_FAMILY_NV".."5"
    )

    EnumConstant(
        "Extends {@code VkComponentTypeKHR}.",

        "COMPONENT_TYPE_FLOAT16_NV".."0",
        "COMPONENT_TYPE_FLOAT32_NV".."1",
        "COMPONENT_TYPE_FLOAT64_NV".."2",
        "COMPONENT_TYPE_SINT8_NV".."3",
        "COMPONENT_TYPE_SINT16_NV".."4",
        "COMPONENT_TYPE_SINT32_NV".."5",
        "COMPONENT_TYPE_SINT64_NV".."6",
        "COMPONENT_TYPE_UINT8_NV".."7",
        "COMPONENT_TYPE_UINT16_NV".."8",
        "COMPONENT_TYPE_UINT32_NV".."9",
        "COMPONENT_TYPE_UINT64_NV".."10"
    )

    VkResult(
        "GetPhysicalDeviceCooperativeMatrixPropertiesNV",
        """
        Returns properties describing what cooperative matrix types are supported.

        <h5>C Specification</h5>
        To enumerate the supported cooperative matrix types and operations, call:

        <pre><code>
￿VkResult vkGetPhysicalDeviceCooperativeMatrixPropertiesNV(
￿    VkPhysicalDevice                            physicalDevice,
￿    uint32_t*                                   pPropertyCount,
￿    VkCooperativeMatrixPropertiesNV*            pProperties);</code></pre>

        <h5>Description</h5>
        If {@code pProperties} is {@code NULL}, then the number of cooperative matrix properties available is returned in {@code pPropertyCount}. Otherwise, {@code pPropertyCount} <b>must</b> point to a variable set by the user to the number of elements in the {@code pProperties} array, and on return the variable is overwritten with the number of structures actually written to {@code pProperties}. If {@code pPropertyCount} is less than the number of cooperative matrix properties available, at most {@code pPropertyCount} structures will be written, and #INCOMPLETE will be returned instead of #SUCCESS, to indicate that not all the available cooperative matrix properties were returned.

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code physicalDevice} <b>must</b> be a valid {@code VkPhysicalDevice} handle</li>
            <li>{@code pPropertyCount} <b>must</b> be a valid pointer to a {@code uint32_t} value</li>
            <li>If the value referenced by {@code pPropertyCount} is not 0, and {@code pProperties} is not {@code NULL}, {@code pProperties} <b>must</b> be a valid pointer to an array of {@code pPropertyCount} ##VkCooperativeMatrixPropertiesNV structures</li>
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
        ##VkCooperativeMatrixPropertiesNV
        """,

        VkPhysicalDevice("physicalDevice", "the physical device."),
        AutoSize("pProperties")..Check(1)..uint32_t.p("pPropertyCount", "a pointer to an integer related to the number of cooperative matrix properties available or queried."),
        nullable..VkCooperativeMatrixPropertiesNV.p("pProperties", "either {@code NULL} or a pointer to an array of ##VkCooperativeMatrixPropertiesNV structures.")
    )
}