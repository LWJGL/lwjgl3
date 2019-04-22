/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package vulkan.templates

import org.lwjgl.generator.*
import vulkan.*

val EXT_buffer_device_address = "EXTBufferDeviceAddress".nativeClassVK("EXT_buffer_device_address", type = "device", postfix = EXT) {
    documentation =
        """
        This extension allows the application to query a 64-bit buffer device address value for a buffer, which can be used to access the buffer memory via the {@code PhysicalStorageBufferEXT} storage class in the <a target="_blank" href="https://github.com/KhronosGroup/GLSL/blob/master/extensions/ext/GLSL_EXT_buffer_reference.txt">{@code GL_EXT_buffer_reference}</a> GLSL extension and <a target="_blank" href="http://htmlpreview.github.io/?https://github.com/KhronosGroup/SPIRV-Registry/blob/master/extensions/EXT/SPV_EXT_physical_storage_buffer.html">{@code SPV_EXT_physical_storage_buffer}</a> SPIR-V extension.

        It also allows buffer device addresses to be provided by a trace replay tool, so that it matches the address used when the trace was captured.

        <dl>
            <dt><b>Name String</b></dt>
            <dd>{@code VK_EXT_buffer_device_address}</dd>

            <dt><b>Extension Type</b></dt>
            <dd>Device extension</dd>

            <dt><b>Registered Extension Number</b></dt>
            <dd>245</dd>

            <dt><b>Revision</b></dt>
            <dd>2</dd>

            <dt><b>Extension and Version Dependencies</b></dt>
            <dd><ul>
                <li>Requires Vulkan 1.0</li>
                <li>Requires {@link KHRGetPhysicalDeviceProperties2 VK_KHR_get_physical_device_properties2}</li>
            </ul></dd>

            <dt><b>Contact</b></dt>
            <dd><ul>
                <li>Jeff Bolz <a target="_blank" href="https://github.com/KhronosGroup/Vulkan-Docs/issues/new?title=VK_EXT_buffer_device_address:%20&amp;body=@jeffbolznv%20">jeffbolznv</a></li>
            </ul></dd>

            <dt><b>Last Modified Date</b></dt>
            <dd>2019-01-06</dd>

            <dt><b>IP Status</b></dt>
            <dd>No known IP claims.</dd>

            <dt><b>Contributors</b></dt>
            <dd><ul>
                <li>Jeff Bolz, NVIDIA</li>
                <li>Neil Henning, AMD</li>
                <li>Tobias Hector, AMD</li>
                <li>Jason Ekstrand, Intel</li>
                <li>Baldur Karlsson, Valve</li>
            </ul></dd>
        </dl>
        """

    IntConstant(
        "The extension specification version.",

        "EXT_BUFFER_DEVICE_ADDRESS_SPEC_VERSION".."2"
    )

    StringConstant(
        "The extension name.",

        "EXT_BUFFER_DEVICE_ADDRESS_EXTENSION_NAME".."VK_EXT_buffer_device_address"
    )

    EnumConstant(
        "Extends {@code VkStructureType}.",

        "STRUCTURE_TYPE_PHYSICAL_DEVICE_BUFFER_DEVICE_ADDRESS_FEATURES_EXT".."1000244000",
        "STRUCTURE_TYPE_PHYSICAL_DEVICE_BUFFER_ADDRESS_FEATURES_EXT".."1000244000",
        "STRUCTURE_TYPE_BUFFER_DEVICE_ADDRESS_INFO_EXT".."1000244001",
        "STRUCTURE_TYPE_BUFFER_DEVICE_ADDRESS_CREATE_INFO_EXT".."1000244002"
    )

    EnumConstant(
        "Extends {@code VkBufferUsageFlagBits}.",

        "BUFFER_USAGE_SHADER_DEVICE_ADDRESS_BIT_EXT".enum(0x00020000)
    )

    EnumConstant(
        "Extends {@code VkBufferCreateFlagBits}.",

        "BUFFER_CREATE_DEVICE_ADDRESS_CAPTURE_REPLAY_BIT_EXT".enum(0x00000010)
    )

    EnumConstant(
        "Extends {@code VkResult}.",

        "ERROR_INVALID_DEVICE_ADDRESS_EXT".."-1000244000"
    )

    VkDeviceAddress(
        "GetBufferDeviceAddressEXT",
        """
        Query an address of a buffer.

        <h5>C Specification</h5>
        To query a 64-bit buffer device address value through which buffer memory <b>can</b> be accessed in a shader, call:

        <pre><code>
￿VkDeviceAddress vkGetBufferDeviceAddressEXT(
￿    VkDevice                                    device,
￿    const VkBufferDeviceAddressInfoEXT*         pInfo);</code></pre>

        <h5>Description</h5>
        The 64-bit return value is an address of the start of {@code pInfo}{@code ::buffer}. The address range starting at this value and whose size is the size of the buffer <b>can</b> be used in a shader to access the memory bound to that buffer, using the {@code SPV_EXT_physical_storage_buffer} extension and the {@code PhysicalStorageBufferEXT} storage class. For example, this value <b>can</b> be stored in a uniform buffer, and the shader <b>can</b> read the value from the uniform buffer and use it to do a dependent read/write to this buffer. A value of zero is reserved as a "{@code null}" pointer and <b>must</b> not be returned as a valid buffer device address. All loads, stores, and atomics in a shader through {@code PhysicalStorageBufferEXT} pointers <b>must</b> access addresses in the address range of some buffer.

        If the buffer was created with a non-zero value of ##VkBufferDeviceAddressCreateInfoEXT{@code ::deviceAddress}, the return value will be the same address.

        <h5>Valid Usage</h5>
        <ul>
            <li>The <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/html/vkspec.html\#features-bufferDeviceAddress">bufferDeviceAddress</a> feature <b>must</b> be enabled</li>
            <li>If {@code device} was created with multiple physical devices, then the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/html/vkspec.html\#features-bufferDeviceAddressMultiDevice">bufferDeviceAddressMultiDevice</a> feature <b>must</b> be enabled</li>
        </ul>

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code device} <b>must</b> be a valid {@code VkDevice} handle</li>
            <li>{@code pInfo} <b>must</b> be a valid pointer to a valid ##VkBufferDeviceAddressInfoEXT structure</li>
        </ul>

        <h5>See Also</h5>
        ##VkBufferDeviceAddressInfoEXT
        """,

        VkDevice("device", "the logical device that the buffer was created on."),
        VkBufferDeviceAddressInfoEXT.const.p("pInfo", "a pointer to an instance of the ##VkBufferDeviceAddressInfoEXT structure specifying the buffer to retrieve an address for.")
    )
}