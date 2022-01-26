/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package vulkan.templates

import org.lwjgl.generator.*
import vulkan.*

val KHR_maintenance4 = "KHRMaintenance4".nativeClassVK("KHR_maintenance4", type = "device", postfix = "KHR") {
    documentation =
        """
        {@code VK_KHR_maintenance4} adds a collection of minor features, none of which would warrant an entire extension of their own.

        The new features are as follows:

        <ul>
            <li>Allow the application to destroy their {@code VkPipelineLayout} object immediately after it was used to create another object. It is no longer necessary to keep its handle valid while the created object is in use.</li>
            <li>Add a new <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html\#limits-maxBufferSize">{@code maxBufferSize}</a> implementation-defined limit for the maximum size {@code VkBuffer} that <b>can</b> be created.</li>
            <li>Add support for the SPIR-V 1.2 {@code LocalSizeId} execution mode, which can be used as an alternative to {@code LocalSize} to specify the local workgroup size with specialization constants.</li>
            <li>Add a guarantee that images created with identical creation parameters will always have the same alignment requirements.</li>
            <li>Add new #GetDeviceBufferMemoryRequirementsKHR(), #GetDeviceImageMemoryRequirementsKHR(), and #GetDeviceImageSparseMemoryRequirementsKHR() to allow the application to query the image memory requirements without having to create an image object and query it.</li>
            <li>Relax the requirement that push constants must be initialized before they are dynamically accessed.</li>
            <li>Relax the interface matching rules to allow a larger output vector to match with a smaller input vector, with additional values being discarded.</li>
            <li>Add a guarantee for buffer memory requirement that the size memory requirement is never greater than the result of aligning create size with the alignment memory requirement.</li>
        </ul>

        <h5>Promotion to Vulkan 1.3</h5>
        Functionality in this extension is included in core Vulkan 1.3, with the KHR suffix omitted. The original type, enum and command names are still available as aliases of the core functionality.

        <h5>VK_KHR_maintenance4</h5>
        <dl>
            <dt><b>Name String</b></dt>
            <dd>{@code VK_KHR_maintenance4}</dd>

            <dt><b>Extension Type</b></dt>
            <dd>Device extension</dd>

            <dt><b>Registered Extension Number</b></dt>
            <dd>414</dd>

            <dt><b>Revision</b></dt>
            <dd>2</dd>

            <dt><b>Extension and Version Dependencies</b></dt>
            <dd><ul>
                <li>Requires Vulkan 1.1</li>
            </ul></dd>

            <dt><b>Deprecation state</b></dt>
            <dd><ul>
                <li><em>Promoted</em> to <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html\#versions-1.3-promotions">Vulkan 1.3</a></li>
            </ul></dd>

            <dt><b>Contact</b></dt>
            <dd><ul>
                <li>Piers Daniell <a target="_blank" href="https://github.com/KhronosGroup/Vulkan-Docs/issues/new?body=[VK_KHR_maintenance4]%20@pdaniell-nv%250A%3C%3CHere%20describe%20the%20issue%20or%20question%20you%20have%20about%20the%20VK_KHR_maintenance4%20extension%3E%3E">pdaniell-nv</a></li>
            </ul></dd>
        </dl>

        <h5>Other Extension Metadata</h5>
        <dl>
            <dt><b>Last Modified Date</b></dt>
            <dd>2021-10-25</dd>

            <dt><b>Interactions and External Dependencies</b></dt>
            <dd><ul>
                <li>Promoted to Vulkan 1.3 Core</li>
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
                <li>Yiwei Zhang, Google</li>
            </ul></dd>
        </dl>
        """

    IntConstant(
        "The extension specification version.",

        "KHR_MAINTENANCE_4_SPEC_VERSION".."2"
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

    EnumConstant(
        "Extends {@code VkImageAspectFlagBits}.",

        "IMAGE_ASPECT_NONE_KHR".."0"
    )

    void(
        "GetDeviceBufferMemoryRequirementsKHR",
        "See #GetDeviceBufferMemoryRequirements().",

        VkDevice("device", "the logical device intended to own the buffer."),
        VkDeviceBufferMemoryRequirements.const.p("pInfo", "a pointer to a ##VkDeviceBufferMemoryRequirements structure containing parameters required for the memory requirements query."),
        VkMemoryRequirements2.p("pMemoryRequirements", "a pointer to a ##VkMemoryRequirements2 structure in which the memory requirements of the buffer object are returned.")
    )

    void(
        "GetDeviceImageMemoryRequirementsKHR",
        "See #GetDeviceImageMemoryRequirements().",

        VkDevice("device", "the logical device intended to own the image."),
        VkDeviceImageMemoryRequirements.const.p("pInfo", "a pointer to a ##VkDeviceImageMemoryRequirements structure containing parameters required for the memory requirements query."),
        VkMemoryRequirements2.p("pMemoryRequirements", "a pointer to a ##VkMemoryRequirements2 structure in which the memory requirements of the image object are returned.")
    )

    void(
        "GetDeviceImageSparseMemoryRequirementsKHR",
        "See #GetDeviceImageSparseMemoryRequirements().",

        VkDevice("device", "the logical device intended to own the image."),
        VkDeviceImageMemoryRequirements.const.p("pInfo", "a pointer to a ##VkDeviceImageMemoryRequirements structure containing parameters required for the memory requirements query."),
        AutoSize("pSparseMemoryRequirements")..Check(1)..uint32_t.p("pSparseMemoryRequirementCount", "a pointer to an integer related to the number of sparse memory requirements available or queried, as described below."),
        nullable..VkSparseImageMemoryRequirements2.p("pSparseMemoryRequirements", "either {@code NULL} or a pointer to an array of ##VkSparseImageMemoryRequirements2 structures.")
    )
}