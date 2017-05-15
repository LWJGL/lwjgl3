/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.vulkan.templates

import org.lwjgl.generator.*
import org.lwjgl.system.windows.*
import org.lwjgl.vulkan.*

val KHX_external_memory_win32 = "KHXExternalMemoryWin32".nativeClassVK("KHX_external_memory_win32", type = "device", postfix = KHX) {
    documentation =
        """
        An application may wish to reference device memory in multiple Vulkan logical devices or instances, in multiple processes, and/or in multiple APIs. This extension enables an application to export Windows handles from Vulkan memory objects and to import Vulkan memory objects from Windows handles exported from other Vulkan memory objects or from similar resources in other APIs.

        <dl>
            <dt><b>Name String</b></dt>
            <dd>VK_KHX_external_memory_win32</dd>

            <dt><b>Extension Type</b></dt>
            <dd>Device extension</dd>

            <dt><b>Registered Extension Number</b></dt>
            <dd>74</dd>

            <dt><b>Status</b></dt>
            <dd>Draft</dd>

            <dt><b>Last Modified Date</b></dt>
            <dd>2016-10-21</dd>

            <dt><b>Revision</b></dt>
            <dd>1</dd>

            <dt><b>IP Status</b></dt>
            <dd>No known IP claims.</dd>

            <dt><b>Dependencies</b></dt>
            <dd><ul>
                <li>This extension is written against version 1.0 of the Vulkan API.</li>
                <li>Requires VK_KHR_external_memory.</li>
            </ul></dd>

            <dt><b>Contributors</b></dt>
            <dd><ul>
                <li>James Jones, NVIDIA</li>
                <li>Jeff Juliano, NVIDIA</li>
                <li>Carsten Rohde, NVIDIA</li>
            </ul></dd>

            <dt><b>Contact</b></dt>
            <dd>James Jones (jajones 'at' nvidia.com)</dd>
        </dl>
        """

    IntConstant(
        "The extension specification version.",

        "KHX_EXTERNAL_MEMORY_WIN32_SPEC_VERSION".."1"
    )

    StringConstant(
        "The extension name.",

        "KHX_EXTERNAL_MEMORY_WIN32_EXTENSION_NAME".."VK_KHX_external_memory_win32"
    )

    EnumConstant(
        "Extends {@code VkStructureType}.",

        "STRUCTURE_TYPE_IMPORT_MEMORY_WIN32_HANDLE_INFO_KHX".."1000073000",
        "STRUCTURE_TYPE_EXPORT_MEMORY_WIN32_HANDLE_INFO_KHX".."1000073001",
        "STRUCTURE_TYPE_MEMORY_WIN32_HANDLE_PROPERTIES_KHX".."1000073002"
    )

    VkResult(
        "GetMemoryWin32HandleKHX",
        """
        Get a Windows HANDLE for a memory object.

        <h5>C Specification</h5>
        To export a Windows handle representing the underlying resources of a Vulkan device memory object, call:

        <code><pre>
￿VkResult vkGetMemoryWin32HandleKHX(
￿    VkDevice                                    device,
￿    VkDeviceMemory                              memory,
￿    VkExternalMemoryHandleTypeFlagBitsKHX       handleType,
￿    HANDLE*                                     pHandle);</pre></code>

        <h5>Description</h5>
        The properties of the handle returned depend on the value of {@code handleType}. See {@code VkExternalMemoryHandleTypeFlagBitsKHX} for a description of the properties of the defined external memory handle types.

        For handle types defined as NT handles, the handles returned by #GetMemoryWin32HandleKHX() are owned by the application. To avoid leaking resources, the application <b>must</b> release ownership of them using the fname:CloseHandle system call when they are no longer needed.

        <h5>Valid Usage</h5>
        <ul>
            <li>{@code handleType} <b>must</b> have been included in ##VkExportMemoryAllocateInfoKHX{@code ::handleTypes} when {@code memory} was created.</li>
            <li>If {@code handleType} is defined as an NT handle, #GetMemoryWin32HandleKHX() <b>must</b> be called no more than once for each valid unique combination of {@code memory} and {@code handleType}.</li>
            <li>{@code handleType} <b>must</b> be defined as an NT handle or a global share handle.</li>
        </ul>

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code device} <b>must</b> be a valid {@code VkDevice} handle</li>
            <li>{@code memory} <b>must</b> be a valid {@code VkDeviceMemory} handle</li>
            <li>{@code handleType} <b>must</b> be a valid {@code VkExternalMemoryHandleTypeFlagBitsKHX} value</li>
            <li>{@code pHandle} <b>must</b> be a pointer to a {@code HANDLE} value</li>
            <li>{@code memory} <b>must</b> have been created, allocated, or retrieved from {@code device}</li>
        </ul>

        <h5>Return Codes</h5>
        <dl>
            <dt>On success, this command returns</dt>
            <dd><ul>
                <li>#SUCCESS</li>
            </ul></dd>

            <dt>On failure, this command returns</dt>
            <dd><ul>
                <li>#ERROR_TOO_MANY_OBJECTS</li>
                <li>#ERROR_OUT_OF_HOST_MEMORY</li>
            </ul></dd>
        </dl>
        """,

        VkDevice.IN("device", "the logical device that created {@code memory}."),
        VkDeviceMemory.IN("memory", "the memory object from which the handle will be exported."),
        VkExternalMemoryHandleTypeFlagBitsKHX.IN("handleType", "the type of handle requested."),
        Check(1)..HANDLE.p.OUT("pHandle", "will return the Windows handle representing the underlying resources of the device memory object.")
    )

    VkResult(
        "GetMemoryWin32HandlePropertiesKHX",
        """
        Get Properties of External Memory Win32 Handles.

        <h5>C Specification</h5>
        Windows memory handles compatible with Vulkan <b>may</b> also be created by non-Vulkan APIs using methods beyond the scope of this specification. To determine the correct parameters to use when importing such handles, call:

        <code><pre>
￿VkResult vkGetMemoryWin32HandlePropertiesKHX(
￿    VkDevice                                    device,
￿    VkExternalMemoryHandleTypeFlagBitsKHX       handleType,
￿    HANDLE                                      handle,
￿    VkMemoryWin32HandlePropertiesKHX*           pMemoryWin32HandleProperties);</pre></code>

        <h5>Valid Usage</h5>
        <ul>
            <li>{@code handle} <b>must</b> be an external memory handle created outside of the Vulkan API.</li>
            <li>{@code handleType} <b>must</b> not be one of the handle types defined as opaque.</li>
        </ul>

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code device} <b>must</b> be a valid {@code VkDevice} handle</li>
            <li>{@code handleType} <b>must</b> be a valid {@code VkExternalMemoryHandleTypeFlagBitsKHX} value</li>
            <li>{@code pMemoryWin32HandleProperties} <b>must</b> be a pointer to a ##VkMemoryWin32HandlePropertiesKHX structure</li>
        </ul>

        <h5>Return Codes</h5>
        <dl>
            <dt>On success, this command returns</dt>
            <dd><ul>
                <li>#SUCCESS</li>
            </ul></dd>

            <dt>On failure, this command returns</dt>
            <dd><ul>
                <li>#ERROR_INVALID_EXTERNAL_HANDLE_KHX</li>
            </ul></dd>
        </dl>

        <h5>See Also</h5>
        ##VkMemoryWin32HandlePropertiesKHX
        """,

        VkDevice.IN("device", "the logical device that will be importing {@code handle}."),
        VkExternalMemoryHandleTypeFlagBitsKHX.IN("handleType", "the type of the handle {@code handle}."),
        HANDLE.IN("handle", "the handle which will be imported."),
        VkMemoryWin32HandlePropertiesKHX.p.OUT("pMemoryWin32HandleProperties", "will return properties of {@code handle}.")
    )
}