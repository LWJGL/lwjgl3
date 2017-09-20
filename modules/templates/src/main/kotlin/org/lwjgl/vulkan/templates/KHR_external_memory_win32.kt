/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.vulkan.templates

import org.lwjgl.generator.*
import org.lwjgl.system.windows.*
import org.lwjgl.vulkan.*

val KHR_external_memory_win32 = "KHRExternalMemoryWin32".nativeClassVK("KHR_external_memory_win32", type = "device", postfix = KHR) {
    documentation =
        """
        An application may wish to reference device memory in multiple Vulkan logical devices or instances, in multiple processes, and/or in multiple APIs. This extension enables an application to export Windows handles from Vulkan memory objects and to import Vulkan memory objects from Windows handles exported from other Vulkan memory objects or from similar resources in other APIs.

        <dl>
            <dt><b>Name String</b></dt>
            <dd>{@code VK_KHR_external_memory_win32}</dd>

            <dt><b>Extension Type</b></dt>
            <dd>Device extension</dd>

            <dt><b>Registered Extension Number</b></dt>
            <dd>74</dd>

            <dt><b>Revision</b></dt>
            <dd>1</dd>

            <dt><b>Extension and Version Dependencies</b></dt>
            <dd><ul>
                <li>Requires Vulkan 1.0</li>
                <li>Requires <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html\#VK_KHR_external_memory">{@code VK_KHR_external_memory}</a></li>
            </ul></dd>

            <dt><b>Contact</b></dt>
            <dd><ul>
                <li>James Jones @cubanismo</li>
            </ul></dd>

            <dt><b>Last Modified Date</b></dt>
            <dd>2016-10-21</dd>

            <dt><b>IP Status</b></dt>
            <dd>No known IP claims.</dd>

            <dt><b>Contributors</b></dt>
            <dd><ul>
                <li>James Jones, NVIDIA</li>
                <li>Jeff Juliano, NVIDIA</li>
                <li>Carsten Rohde, NVIDIA</li>
            </ul></dd>
        </dl>
        """

    IntConstant(
        "The extension specification version.",

        "KHR_EXTERNAL_MEMORY_WIN32_SPEC_VERSION".."1"
    )

    StringConstant(
        "The extension name.",

        "KHR_EXTERNAL_MEMORY_WIN32_EXTENSION_NAME".."VK_KHR_external_memory_win32"
    )

    EnumConstant(
        "Extends {@code VkStructureType}.",

        "STRUCTURE_TYPE_IMPORT_MEMORY_WIN32_HANDLE_INFO_KHR".."1000073000",
        "STRUCTURE_TYPE_EXPORT_MEMORY_WIN32_HANDLE_INFO_KHR".."1000073001",
        "STRUCTURE_TYPE_MEMORY_WIN32_HANDLE_PROPERTIES_KHR".."1000073002",
        "STRUCTURE_TYPE_MEMORY_GET_WIN32_HANDLE_INFO_KHR".."1000073003"
    )

    VkResult(
        "GetMemoryWin32HandleKHR",
        """
        Get a Windows HANDLE for a memory object.

        <h5>C Specification</h5>
        To export a Windows handle representing the underlying resources of a Vulkan device memory object, call:

        <code><pre>
￿VkResult vkGetMemoryWin32HandleKHR(
￿    VkDevice                                    device,
￿    const VkMemoryGetWin32HandleInfoKHR*        pGetWin32HandleInfo,
￿    HANDLE*                                     pHandle);</pre></code>

        <h5>Description</h5>
        For handle types defined as NT handles, the handles returned by #GetMemoryWin32HandleKHR() are owned by the application. To avoid leaking resources, the application <b>must</b> release ownership of them using the fname:CloseHandle system call when they are no longer needed.

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code device} <b>must</b> be a valid {@code VkDevice} handle</li>
            <li>{@code pGetWin32HandleInfo} <b>must</b> be a pointer to a valid ##VkMemoryGetWin32HandleInfoKHR structure</li>
            <li>{@code pHandle} <b>must</b> be a pointer to a {@code HANDLE} value</li>
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

        <h5>See Also</h5>
        ##VkMemoryGetWin32HandleInfoKHR
        """,

        VkDevice.IN("device", "the logical device that created the device memory being exported."),
        const..VkMemoryGetWin32HandleInfoKHR.p.IN("pGetWin32HandleInfo", "a pointer to an instance of the ##VkMemoryGetWin32HandleInfoKHR structure containing parameters of the export operation."),
        Check(1)..HANDLE.p.OUT("pHandle", "will return the Windows handle representing the underlying resources of the device memory object.")
    )

    VkResult(
        "GetMemoryWin32HandlePropertiesKHR",
        """
        Get Properties of External Memory Win32 Handles.

        <h5>C Specification</h5>
        Windows memory handles compatible with Vulkan <b>may</b> also be created by non-Vulkan APIs using methods beyond the scope of this specification. To determine the correct parameters to use when importing such handles, call:

        <code><pre>
￿VkResult vkGetMemoryWin32HandlePropertiesKHR(
￿    VkDevice                                    device,
￿    VkExternalMemoryHandleTypeFlagBitsKHR       handleType,
￿    HANDLE                                      handle,
￿    VkMemoryWin32HandlePropertiesKHR*           pMemoryWin32HandleProperties);</pre></code>

        <h5>Valid Usage</h5>
        <ul>
            <li>{@code handle} <b>must</b> be an external memory handle created outside of the Vulkan API.</li>
            <li>{@code handleType} <b>must</b> not be one of the handle types defined as opaque.</li>
        </ul>

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code device} <b>must</b> be a valid {@code VkDevice} handle</li>
            <li>{@code handleType} <b>must</b> be a valid {@code VkExternalMemoryHandleTypeFlagBitsKHR} value</li>
            <li>{@code pMemoryWin32HandleProperties} <b>must</b> be a pointer to a ##VkMemoryWin32HandlePropertiesKHR structure</li>
        </ul>

        <h5>Return Codes</h5>
        <dl>
            <dt>On success, this command returns</dt>
            <dd><ul>
                <li>#SUCCESS</li>
            </ul></dd>

            <dt>On failure, this command returns</dt>
            <dd><ul>
                <li>#ERROR_INVALID_EXTERNAL_HANDLE_KHR</li>
            </ul></dd>
        </dl>

        <h5>See Also</h5>
        ##VkMemoryWin32HandlePropertiesKHR
        """,

        VkDevice.IN("device", "the logical device that will be importing {@code handle}."),
        VkExternalMemoryHandleTypeFlagBitsKHR.IN("handleType", "the type of the handle {@code handle}."),
        HANDLE.IN("handle", "the handle which will be imported."),
        VkMemoryWin32HandlePropertiesKHR.p.OUT("pMemoryWin32HandleProperties", "will return properties of {@code handle}.")
    )
}