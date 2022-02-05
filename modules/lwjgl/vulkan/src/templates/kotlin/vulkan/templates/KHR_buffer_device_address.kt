/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package vulkan.templates

import org.lwjgl.generator.*
import vulkan.*

val KHR_buffer_device_address = "KHRBufferDeviceAddress".nativeClassVK("KHR_buffer_device_address", type = "device", postfix = "KHR") {
    documentation =
        """
        This extension allows the application to query a 64-bit buffer device address value for a buffer, which can be used to access the buffer memory via the {@code PhysicalStorageBuffer} storage class in the <a target="_blank" href="https://github.com/KhronosGroup/GLSL/blob/master/extensions/ext/GLSL_EXT_buffer_reference.txt">{@code GL_EXT_buffer_reference}</a> GLSL extension and <a target="_blank" href="https://htmlpreview.github.io/?https://github.com/KhronosGroup/SPIRV-Registry/blob/master/extensions/KHR/SPV_KHR_physical_storage_buffer.html">{@code SPV_KHR_physical_storage_buffer}</a> SPIR-V extension.

        Another way to describe this extension is that it adds “{@code pointers to buffer memory in shaders}”. By calling #GetBufferDeviceAddress() with a {@code VkBuffer}, it will return a {@code VkDeviceAddress} value which represents the address of the start of the buffer.

        #GetBufferOpaqueCaptureAddress() and #GetDeviceMemoryOpaqueCaptureAddress() allow opaque addresses for buffers and memory objects to be queried for the current process. A trace capture and replay tool can then supply these addresses to be used at replay time to match the addresses used when the trace was captured. To enable tools to insert these queries, new memory allocation flags must be specified for memory objects that will be bound to buffers accessed via the {@code PhysicalStorageBuffer} storage class. Note that this mechanism is intended only to support capture/replay tools, and is not recommended for use in other applications.

        There are various use cases this extension is designed for. It is required for ray tracing, useful for DX12 portability, and by allowing buffer addresses to be stored in memory it enables more complex data structures to be created.

        This extension can also be used to hardcode a dedicated debug channel into all shaders by querying a pointer at startup and pushing that into shaders as a run-time constant (e.g. specialization constant) that avoids impacting other descriptor limits.

        There are examples of usage in the <a target="_blank" href="https://github.com/KhronosGroup/GLSL/blob/master/extensions/ext/GLSL_EXT_buffer_reference.txt">{@code GL_EXT_buffer_reference}</a> spec for how to use this in a high-level shading language such as GLSL. The <a target="_blank" href="https://github.com/KhronosGroup/GLSL/blob/master/extensions/ext/GLSL_EXT_buffer_reference2.txt">{@code GL_EXT_buffer_reference2}</a> and <a target="_blank" href="https://github.com/KhronosGroup/GLSL/blob/master/extensions/ext/GLSL_EXT_buffer_reference_uvec2.txt">{@code GL_EXT_buffer_reference_uvec2}</a> extensions were also added to help cover a few additional edge cases.

        <h5>Promotion to Vulkan 1.2</h5>
        All functionality in this extension is included in core Vulkan 1.2, with the KHR suffix omitted. However, if Vulkan 1.2 is supported and this extension is not, the {@code bufferDeviceAddress} feature is optional. The original type, enum and command names are still available as aliases of the core functionality.

        <h5>Promotion to Vulkan 1.3</h5>
        Support for the {@code bufferDeviceAddress} feature is mandatory in Vulkan 1.3, regardless of whether this extension is supported.

        <h5>VK_KHR_buffer_device_address</h5>
        <dl>
            <dt><b>Name String</b></dt>
            <dd>{@code VK_KHR_buffer_device_address}</dd>

            <dt><b>Extension Type</b></dt>
            <dd>Device extension</dd>

            <dt><b>Registered Extension Number</b></dt>
            <dd>258</dd>

            <dt><b>Revision</b></dt>
            <dd>1</dd>

            <dt><b>Extension and Version Dependencies</b></dt>
            <dd><ul>
                <li>Requires Vulkan 1.0</li>
                <li>Requires {@link KHRGetPhysicalDeviceProperties2 VK_KHR_get_physical_device_properties2}</li>
            </ul></dd>

            <dt><b>Deprecation state</b></dt>
            <dd><ul>
                <li><em>Promoted</em> to <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html\#versions-1.2-promotions">Vulkan 1.2</a></li>
            </ul></dd>

            <dt><b>Contact</b></dt>
            <dd><ul>
                <li>Jeff Bolz <a target="_blank" href="https://github.com/KhronosGroup/Vulkan-Docs/issues/new?body=[VK_KHR_buffer_device_address]%20@jeffbolznv%250A%3C%3CHere%20describe%20the%20issue%20or%20question%20you%20have%20about%20the%20VK_KHR_buffer_device_address%20extension%3E%3E">jeffbolznv</a></li>
            </ul></dd>
        </dl>

        <h5>Other Extension Metadata</h5>
        <dl>
            <dt><b>Last Modified Date</b></dt>
            <dd>2019-06-24</dd>

            <dt><b>IP Status</b></dt>
            <dd>No known IP claims.</dd>

            <dt><b>Interactions and External Dependencies</b></dt>
            <dd><ul>
                <li>Promoted to Vulkan 1.2 Core</li>
                <li>This extension requires <a target="_blank" href="https://htmlpreview.github.io/?https://github.com/KhronosGroup/SPIRV-Registry/blob/master/extensions/KHR/SPV_KHR_physical_storage_buffer.html">{@code SPV_KHR_physical_storage_buffer}</a></li>
                <li>This extension provides API support for <a target="_blank" href="https://github.com/KhronosGroup/GLSL/blob/master/extensions/ext/GLSL_EXT_buffer_reference.txt">{@code GL_EXT_buffer_reference}</a> and <a target="_blank" href="https://github.com/KhronosGroup/GLSL/blob/master/extensions/ext/GLSL_EXT_buffer_reference2.txt">{@code GL_EXT_buffer_reference2}</a> and <a target="_blank" href="https://github.com/KhronosGroup/GLSL/blob/master/extensions/ext/GLSL_EXT_buffer_reference_uvec2.txt">{@code GL_EXT_buffer_reference_uvec2}</a></li>
            </ul></dd>

            <dt><b>Contributors</b></dt>
            <dd><ul>
                <li>Jeff Bolz, NVIDIA</li>
                <li>Neil Henning, AMD</li>
                <li>Tobias Hector, AMD</li>
                <li>Jason Ekstrand, Intel</li>
                <li>Baldur Karlsson, Valve</li>
                <li>Jan-Harald Fredriksen, Arm</li>
            </ul></dd>
        </dl>
        """

    IntConstant(
        "The extension specification version.",

        "KHR_BUFFER_DEVICE_ADDRESS_SPEC_VERSION".."1"
    )

    StringConstant(
        "The extension name.",

        "KHR_BUFFER_DEVICE_ADDRESS_EXTENSION_NAME".."VK_KHR_buffer_device_address"
    )

    EnumConstant(
        "Extends {@code VkStructureType}.",

        "STRUCTURE_TYPE_PHYSICAL_DEVICE_BUFFER_DEVICE_ADDRESS_FEATURES_KHR".."1000257000",
        "STRUCTURE_TYPE_BUFFER_DEVICE_ADDRESS_INFO_KHR".."1000244001",
        "STRUCTURE_TYPE_BUFFER_OPAQUE_CAPTURE_ADDRESS_CREATE_INFO_KHR".."1000257002",
        "STRUCTURE_TYPE_MEMORY_OPAQUE_CAPTURE_ADDRESS_ALLOCATE_INFO_KHR".."1000257003",
        "STRUCTURE_TYPE_DEVICE_MEMORY_OPAQUE_CAPTURE_ADDRESS_INFO_KHR".."1000257004"
    )

    EnumConstant(
        "Extends {@code VkBufferUsageFlagBits}.",

        "BUFFER_USAGE_SHADER_DEVICE_ADDRESS_BIT_KHR".enum(0x00020000)
    )

    EnumConstant(
        "Extends {@code VkBufferCreateFlagBits}.",

        "BUFFER_CREATE_DEVICE_ADDRESS_CAPTURE_REPLAY_BIT_KHR".enum(0x00000010)
    )

    EnumConstant(
        "Extends {@code VkMemoryAllocateFlagBits}.",

        "MEMORY_ALLOCATE_DEVICE_ADDRESS_BIT_KHR".enum(0x00000002),
        "MEMORY_ALLOCATE_DEVICE_ADDRESS_CAPTURE_REPLAY_BIT_KHR".enum(0x00000004)
    )

    EnumConstant(
        "Extends {@code VkResult}.",

        "ERROR_INVALID_OPAQUE_CAPTURE_ADDRESS_KHR".."-1000257000"
    )

    VkDeviceAddress(
        "GetBufferDeviceAddressKHR",
        "See #GetBufferDeviceAddress().",

        VkDevice("device", "the logical device that the buffer was created on."),
        VkBufferDeviceAddressInfo.const.p("pInfo", "a pointer to a ##VkBufferDeviceAddressInfo structure specifying the buffer to retrieve an address for.")
    )

    uint64_t(
        "GetBufferOpaqueCaptureAddressKHR",
        "See #GetBufferOpaqueCaptureAddress().",

        VkDevice("device", "the logical device that the buffer was created on."),
        VkBufferDeviceAddressInfo.const.p("pInfo", "a pointer to a ##VkBufferDeviceAddressInfo structure specifying the buffer to retrieve an address for.")
    )

    uint64_t(
        "GetDeviceMemoryOpaqueCaptureAddressKHR",
        "See #GetDeviceMemoryOpaqueCaptureAddress().",

        VkDevice("device", "the logical device that the memory object was allocated on."),
        VkDeviceMemoryOpaqueCaptureAddressInfo.const.p("pInfo", "a pointer to a ##VkDeviceMemoryOpaqueCaptureAddressInfo structure specifying the memory object to retrieve an address for.")
    )
}