/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.vulkan.templates

import org.lwjgl.generator.*
import org.lwjgl.vulkan.*

val KHR_external_memory_fd = "KHRExternalMemoryFd".nativeClassVK("KHR_external_memory_fd", type = "device", postfix = KHR) {
    documentation =
        """
        An application may wish to reference device memory in multiple Vulkan logical devices or instances, in multiple processes, and/or in multiple APIs. This extension enables an application to export POSIX file descriptor handles from Vulkan memory objects and to import Vulkan memory objects from POSIX file descriptor handles exported from other Vulkan memory objects or from similar resources in other APIs.

        <dl>
            <dt><b>Name String</b></dt>
            <dd>{@code VK_KHR_external_memory_fd}</dd>

            <dt><b>Extension Type</b></dt>
            <dd>Device extension</dd>

            <dt><b>Registered Extension Number</b></dt>
            <dd>75</dd>

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
            </ul></dd>
        </dl>
        """

    IntConstant(
        "The extension specification version.",

        "KHR_EXTERNAL_MEMORY_FD_SPEC_VERSION".."1"
    )

    StringConstant(
        "The extension name.",

        "KHR_EXTERNAL_MEMORY_FD_EXTENSION_NAME".."VK_KHR_external_memory_fd"
    )

    EnumConstant(
        "Extends {@code VkStructureType}.",

        "STRUCTURE_TYPE_IMPORT_MEMORY_FD_INFO_KHR".."1000074000",
        "STRUCTURE_TYPE_MEMORY_FD_PROPERTIES_KHR".."1000074001",
        "STRUCTURE_TYPE_MEMORY_GET_FD_INFO_KHR".."1000074002"
    )

    VkResult(
        "GetMemoryFdKHR",
        """
        Get a POSIX file descriptor for a memory object.

        <h5>C Specification</h5>
        To export a POSIX file descriptor representing the underlying resources of a Vulkan device memory object, call:

        <code><pre>
￿VkResult vkGetMemoryFdKHR(
￿    VkDevice                                    device,
￿    const VkMemoryGetFdInfoKHR*                 pGetFdInfo,
￿    int*                                        pFd);</pre></code>

        <h5>Description</h5>
        Each call to #GetMemoryFdKHR() <b>must</b> create a new file descriptor and transfer ownership of it to the application. To avoid leaking resources, the application <b>must</b> release ownership of the file descriptor using the fname:close system call when it is no longer needed, or by importing a Vulkan memory object from it. Where supported by the operating system, the implementation <b>must</b> set the file descriptor to be closed automatically when an fname:execve system call is made.

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code device} <b>must</b> be a valid {@code VkDevice} handle</li>
            <li>{@code pGetFdInfo} <b>must</b> be a pointer to a valid ##VkMemoryGetFdInfoKHR structure</li>
            <li>{@code pFd} <b>must</b> be a pointer to a {@code int} value</li>
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
        ##VkMemoryGetFdInfoKHR
        """,

        VkDevice.IN("device", "the logical device that created the device memory being exported."),
        const..VkMemoryGetFdInfoKHR.p.IN("pGetFdInfo", "a pointer to an instance of the ##VkMemoryGetFdInfoKHR structure containing parameters of the export operation."),
        Check(1)..int_p.OUT("pFd", "will return a file descriptor representing the underlying resources of the device memory object.")
    )

    VkResult(
        "GetMemoryFdPropertiesKHR",
        """
        Get Properties of External Memory File Descriptors.

        <h5>C Specification</h5>
        POSIX file descriptor memory handles compatible with Vulkan <b>may</b> also be created by non-Vulkan APIs using methods beyond the scope of this specification. To determine the correct parameters to use when importing such handles, call:

        <code><pre>
￿VkResult vkGetMemoryFdPropertiesKHR(
￿    VkDevice                                    device,
￿    VkExternalMemoryHandleTypeFlagBitsKHR       handleType,
￿    int                                         fd,
￿    VkMemoryFdPropertiesKHR*                    pMemoryFdProperties);</pre></code>

        <h5>Valid Usage</h5>
        <ul>
            <li>{@code fd} <b>must</b> be an external memory handle created outside of the Vulkan API.</li>
            <li>{@code handleType} <b>must</b> not be one of the handle types defined as opaque.</li>
        </ul>

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code device} <b>must</b> be a valid {@code VkDevice} handle</li>
            <li>{@code handleType} <b>must</b> be a valid {@code VkExternalMemoryHandleTypeFlagBitsKHR} value</li>
            <li>{@code pMemoryFdProperties} <b>must</b> be a pointer to a ##VkMemoryFdPropertiesKHR structure</li>
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
        ##VkMemoryFdPropertiesKHR
        """,

        VkDevice.IN("device", "the logical device that will be importing {@code fd}."),
        VkExternalMemoryHandleTypeFlagBitsKHR.IN("handleType", "the type of the handle {@code fd}."),
        int.IN("fd", "the handle which will be imported."),
        VkMemoryFdPropertiesKHR.p.OUT("pMemoryFdProperties", "will return properties of the handle {@code fd}.")
    )
}