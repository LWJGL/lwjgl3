/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package vulkan.templates

import org.lwjgl.generator.*
import vulkan.*

val EXT_external_memory_host = "EXTExternalMemoryHost".nativeClassVK("EXT_external_memory_host", type = "device", postfix = "EXT") {
    documentation =
        """
        This extension enables an application to import host allocations and host mapped foreign device memory to Vulkan memory objects.

        <h5>VK_EXT_external_memory_host</h5>
        <dl>
            <dt><b>Name String</b></dt>
            <dd>{@code VK_EXT_external_memory_host}</dd>

            <dt><b>Extension Type</b></dt>
            <dd>Device extension</dd>

            <dt><b>Registered Extension Number</b></dt>
            <dd>179</dd>

            <dt><b>Revision</b></dt>
            <dd>1</dd>

            <dt><b>Extension and Version Dependencies</b></dt>
            <dd><ul>
                <li>Requires Vulkan 1.0</li>
                <li>Requires {@link KHRExternalMemory VK_KHR_external_memory}</li>
            </ul></dd>

            <dt><b>Contact</b></dt>
            <dd><ul>
                <li>Daniel Rakos <a target="_blank" href="https://github.com/KhronosGroup/Vulkan-Docs/issues/new?body=[VK_EXT_external_memory_host]%20@drakos-amd%250A%3C%3CHere%20describe%20the%20issue%20or%20question%20you%20have%20about%20the%20VK_EXT_external_memory_host%20extension%3E%3E">drakos-amd</a></li>
            </ul></dd>
        </dl>

        <h5>Other Extension Metadata</h5>
        <dl>
            <dt><b>Last Modified Date</b></dt>
            <dd>2017-11-10</dd>

            <dt><b>IP Status</b></dt>
            <dd>No known IP claims.</dd>

            <dt><b>Contributors</b></dt>
            <dd><ul>
                <li>Jaakko Konttinen, AMD</li>
                <li>David Mao, AMD</li>
                <li>Daniel Rakos, AMD</li>
                <li>Tobias Hector, Imagination Technologies</li>
                <li>Jason Ekstrand, Intel</li>
                <li>James Jones, NVIDIA</li>
            </ul></dd>
        </dl>
        """

    IntConstant(
        "The extension specification version.",

        "EXT_EXTERNAL_MEMORY_HOST_SPEC_VERSION".."1"
    )

    StringConstant(
        "The extension name.",

        "EXT_EXTERNAL_MEMORY_HOST_EXTENSION_NAME".."VK_EXT_external_memory_host"
    )

    EnumConstant(
        "Extends {@code VkStructureType}.",

        "STRUCTURE_TYPE_IMPORT_MEMORY_HOST_POINTER_INFO_EXT".."1000178000",
        "STRUCTURE_TYPE_MEMORY_HOST_POINTER_PROPERTIES_EXT".."1000178001",
        "STRUCTURE_TYPE_PHYSICAL_DEVICE_EXTERNAL_MEMORY_HOST_PROPERTIES_EXT".."1000178002"
    )

    EnumConstant(
        "Extends {@code VkExternalMemoryHandleTypeFlagBits}.",

        "EXTERNAL_MEMORY_HANDLE_TYPE_HOST_ALLOCATION_BIT_EXT".enum(0x00000080),
        "EXTERNAL_MEMORY_HANDLE_TYPE_HOST_MAPPED_FOREIGN_MEMORY_BIT_EXT".enum(0x00000100)
    )

    VkResult(
        "GetMemoryHostPointerPropertiesEXT",
        """
        Get properties of external memory host pointer.

        <h5>C Specification</h5>
        To determine the correct parameters to use when importing host pointers, call:

        <pre><code>
￿VkResult vkGetMemoryHostPointerPropertiesEXT(
￿    VkDevice                                    device,
￿    VkExternalMemoryHandleTypeFlagBits          handleType,
￿    const void*                                 pHostPointer,
￿    VkMemoryHostPointerPropertiesEXT*           pMemoryHostPointerProperties);</code></pre>

        <h5>Valid Usage</h5>
        <ul>
            <li>{@code handleType} <b>must</b> be #EXTERNAL_MEMORY_HANDLE_TYPE_HOST_ALLOCATION_BIT_EXT or #EXTERNAL_MEMORY_HANDLE_TYPE_HOST_MAPPED_FOREIGN_MEMORY_BIT_EXT</li>
            <li>{@code pHostPointer} <b>must</b> be a pointer aligned to an integer multiple of ##VkPhysicalDeviceExternalMemoryHostPropertiesEXT{@code ::minImportedHostPointerAlignment}</li>
            <li>If {@code handleType} is #EXTERNAL_MEMORY_HANDLE_TYPE_HOST_ALLOCATION_BIT_EXT, {@code pHostPointer} <b>must</b> be a pointer to host memory</li>
            <li>If {@code handleType} is #EXTERNAL_MEMORY_HANDLE_TYPE_HOST_MAPPED_FOREIGN_MEMORY_BIT_EXT, {@code pHostPointer} <b>must</b> be a pointer to host mapped foreign memory</li>
        </ul>

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code device} <b>must</b> be a valid {@code VkDevice} handle</li>
            <li>{@code handleType} <b>must</b> be a valid {@code VkExternalMemoryHandleTypeFlagBits} value</li>
            <li>{@code pMemoryHostPointerProperties} <b>must</b> be a valid pointer to a ##VkMemoryHostPointerPropertiesEXT structure</li>
        </ul>

        <h5>Return Codes</h5>
        <dl>
            <dt>On success, this command returns</dt>
            <dd><ul>
                <li>#SUCCESS</li>
            </ul></dd>

            <dt>On failure, this command returns</dt>
            <dd><ul>
                <li>#ERROR_OUT_OF_HOST_MEMORY</li>
                <li>#ERROR_INVALID_EXTERNAL_HANDLE</li>
            </ul></dd>
        </dl>

        <h5>See Also</h5>
        ##VkMemoryHostPointerPropertiesEXT
        """,

        VkDevice("device", "the logical device that will be importing {@code pHostPointer}."),
        VkExternalMemoryHandleTypeFlagBits("handleType", "a {@code VkExternalMemoryHandleTypeFlagBits} value specifying the type of the handle {@code pHostPointer}."),
        opaque_const_p("pHostPointer", "the host pointer to import from."),
        VkMemoryHostPointerPropertiesEXT.p("pMemoryHostPointerProperties", "a pointer to a ##VkMemoryHostPointerPropertiesEXT structure in which the host pointer properties are returned.")
    )
}