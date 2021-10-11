/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package vulkan.templates

import org.lwjgl.generator.*
import vulkan.*

val KHR_maintenance4 = "KHRMaintenance4".nativeClassVK("KHR_maintenance4", type = "device", postfix = KHR) {
    documentation =
        """
        {@code VK_KHR_maintenance4} adds a collection of minor features, none of which would warrant an entire extension of their own.

        The new features are as follows:

        <ul>
            <li>Allow the application to destroy their {@code VkPipelineLayout} object immediately after it was used to create another object. It is no longer necessary to keep its handle valid while the created object is in use.</li>
            <li>Add a new <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#limits-maxBufferSize">{@code maxBufferSize}</a> implementation-defined limit for the maximum size {@code VkBuffer} that <b>can</b> be created.</li>
            <li>Add support for the SPIR-V 1.2 {@code LocalSizeId} execution mode, which can be used as an alternative to {@code LocalSize} to specify the local workgroup size with specialization constants.</li>
            <li>Add a guarantee that images created with identical creation parameters will always have the same alignment requirements.</li>
            <li>Add new #GetDeviceBufferMemoryRequirementsKHR(), #GetDeviceImageMemoryRequirementsKHR(), and #GetDeviceImageSparseMemoryRequirementsKHR() to allow the application to query the image memory requirements without having to create an image object and query it.</li>
            <li>Relax the requirement that push constants must be initialized before they are dynamically accessed.</li>
            <li>Relax the interface matching rules to allow a larger output vector to match with a smaller input vector, with additional values being discarded.</li>
        </ul>

        <h5>VK_KHR_maintenance4</h5>
        <dl>
            <dt><b>Name String</b></dt>
            <dd>{@code VK_KHR_maintenance4}</dd>

            <dt><b>Extension Type</b></dt>
            <dd>Device extension</dd>

            <dt><b>Registered Extension Number</b></dt>
            <dd>414</dd>

            <dt><b>Revision</b></dt>
            <dd>1</dd>

            <dt><b>Extension and Version Dependencies</b></dt>
            <dd><ul>
                <li>Requires Vulkan 1.1</li>
            </ul></dd>

            <dt><b>Contact</b></dt>
            <dd><ul>
                <li>Piers Daniell <a target="_blank" href="https://github.com/KhronosGroup/Vulkan-Docs/issues/new?body=[VK_KHR_maintenance4]%20@pdaniell-nv%250A%3C%3CHere%20describe%20the%20issue%20or%20question%20you%20have%20about%20the%20VK_KHR_maintenance4%20extension%3E%3E">pdaniell-nv</a></li>
            </ul></dd>
        </dl>

        <h5>Other Extension Metadata</h5>
        <dl>
            <dt><b>Last Modified Date</b></dt>
            <dd>2021-08-18</dd>

            <dt><b>Interactions and External Dependencies</b></dt>
            <dd><ul>
                <li>Requires SPIR-V 1.2 for {@code LocalSizeId}</li>
            </ul></dd>

            <dt><b>Contributors</b></dt>
            <dd><ul>
                <li>Lionel Duc, NVIDIA</li>
                <li>Jason Ekstrand, Intel</li>
                <li>Spencer Fricke, Samsung</li>
                <li>Tobias Hector, AMD</li>
                <li>Lionel Landwerlin, Intel</li>
                <li>Graeme Leese, Broadcom</li>
                <li>Tom Olson, Arm</li>
                <li>Stu Smith, AMD</li>
            </ul></dd>
        </dl>
        """

    IntConstant(
        "The extension specification version.",

        "KHR_MAINTENANCE_4_SPEC_VERSION".."1"
    )

    StringConstant(
        "The extension name.",

        "KHR_MAINTENANCE_4_EXTENSION_NAME".."VK_KHR_maintenance4"
    )

    EnumConstant(
        "Extends {@code VkStructureType}.",

        "STRUCTURE_TYPE_PHYSICAL_DEVICE_MAINTENANCE_4_FEATURES_KHR".."1000413000",
        "STRUCTURE_TYPE_PHYSICAL_DEVICE_MAINTENANCE_4_PROPERTIES_KHR".."1000413001",
        "STRUCTURE_TYPE_DEVICE_BUFFER_MEMORY_REQUIREMENTS_KHR".."1000413002",
        "STRUCTURE_TYPE_DEVICE_IMAGE_MEMORY_REQUIREMENTS_KHR".."1000413003"
    )

    void(
        "GetDeviceBufferMemoryRequirementsKHR",
        """
        Returns the memory requirements for specified Vulkan object.

        <h5>C Specification</h5>
        To determine the memory requirements for a buffer resource without creating an object, call:

        <pre><code>
￿void vkGetDeviceBufferMemoryRequirementsKHR(
￿    VkDevice                                    device,
￿    const VkDeviceBufferMemoryRequirementsKHR*  pInfo,
￿    VkMemoryRequirements2*                      pMemoryRequirements);</code></pre>

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code device} <b>must</b> be a valid {@code VkDevice} handle</li>
            <li>{@code pInfo} <b>must</b> be a valid pointer to a valid ##VkDeviceBufferMemoryRequirementsKHR structure</li>
            <li>{@code pMemoryRequirements} <b>must</b> be a valid pointer to a ##VkMemoryRequirements2 structure</li>
        </ul>

        <h5>See Also</h5>
        ##VkDeviceBufferMemoryRequirementsKHR, ##VkMemoryRequirements2
        """,

        VkDevice("device", "the logical device intended to own the buffer."),
        VkDeviceBufferMemoryRequirementsKHR.const.p("pInfo", "a pointer to a ##VkDeviceBufferMemoryRequirementsKHR structure containing parameters required for the memory requirements query."),
        VkMemoryRequirements2.p("pMemoryRequirements", "a pointer to a ##VkMemoryRequirements2 structure in which the memory requirements of the buffer object are returned.")
    )

    void(
        "GetDeviceImageMemoryRequirementsKHR",
        """
        Returns the memory requirements for specified Vulkan object.

        <h5>C Specification</h5>
        To determine the memory requirements for an image resource without creating an object, call:

        <pre><code>
￿void vkGetDeviceImageMemoryRequirementsKHR(
￿    VkDevice                                    device,
￿    const VkDeviceImageMemoryRequirementsKHR*   pInfo,
￿    VkMemoryRequirements2*                      pMemoryRequirements);</code></pre>

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code device} <b>must</b> be a valid {@code VkDevice} handle</li>
            <li>{@code pInfo} <b>must</b> be a valid pointer to a valid ##VkDeviceImageMemoryRequirementsKHR structure</li>
            <li>{@code pMemoryRequirements} <b>must</b> be a valid pointer to a ##VkMemoryRequirements2 structure</li>
        </ul>

        <h5>See Also</h5>
        ##VkDeviceImageMemoryRequirementsKHR, ##VkMemoryRequirements2
        """,

        VkDevice("device", "the logical device intended to own the image."),
        VkDeviceImageMemoryRequirementsKHR.const.p("pInfo", "a pointer to a ##VkDeviceImageMemoryRequirementsKHR structure containing parameters required for the memory requirements query."),
        VkMemoryRequirements2.p("pMemoryRequirements", "a pointer to a ##VkMemoryRequirements2 structure in which the memory requirements of the image object are returned.")
    )

    void(
        "GetDeviceImageSparseMemoryRequirementsKHR",
        """
        Query the memory requirements for a sparse image.

        <h5>C Specification</h5>
        To determine the sparse memory requirements for an image resource without creating an object, call:

        <pre><code>
￿void vkGetDeviceImageSparseMemoryRequirementsKHR(
￿    VkDevice                                    device,
￿    const VkDeviceImageMemoryRequirementsKHR*   pInfo,
￿    uint32_t*                                   pSparseMemoryRequirementCount,
￿    VkSparseImageMemoryRequirements2*           pSparseMemoryRequirements);</code></pre>

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code device} <b>must</b> be a valid {@code VkDevice} handle</li>
            <li>{@code pInfo} <b>must</b> be a valid pointer to a valid ##VkDeviceImageMemoryRequirementsKHR structure</li>
            <li>{@code pSparseMemoryRequirementCount} <b>must</b> be a valid pointer to a {@code uint32_t} value</li>
            <li>If the value referenced by {@code pSparseMemoryRequirementCount} is not 0, and {@code pSparseMemoryRequirements} is not {@code NULL}, {@code pSparseMemoryRequirements} <b>must</b> be a valid pointer to an array of {@code pSparseMemoryRequirementCount} ##VkSparseImageMemoryRequirements2 structures</li>
        </ul>

        <h5>See Also</h5>
        ##VkDeviceImageMemoryRequirementsKHR, ##VkSparseImageMemoryRequirements2
        """,

        VkDevice("device", "the logical device intended to own the image."),
        VkDeviceImageMemoryRequirementsKHR.const.p("pInfo", "a pointer to a ##VkDeviceImageMemoryRequirementsKHR structure containing parameters required for the memory requirements query."),
        AutoSize("pSparseMemoryRequirements")..Check(1)..uint32_t.p("pSparseMemoryRequirementCount", "a pointer to an integer related to the number of sparse memory requirements available or queried, as described below."),
        nullable..VkSparseImageMemoryRequirements2.p("pSparseMemoryRequirements", "either {@code NULL} or a pointer to an array of ##VkSparseImageMemoryRequirements2 structures.")
    )
}