/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.vulkan.templates

import org.lwjgl.generator.*
import org.lwjgl.vulkan.*

val KHX_external_semaphore_fd = "KHXExternalSemaphoreFd".nativeClassVK("KHX_external_semaphore_fd", type = "device", postfix = KHX) {
    documentation =
        """
        An application using external memory may wish to synchronize access to that memory using semaphores. This extension enables an application to export semaphore state to and import semaphore state from POSIX file descriptors.

        <dl>
            <dt><b>Name String</b></dt>
            <dd>VK_KHX_external_semaphore_fd</dd>

            <dt><b>Extension Type</b></dt>
            <dd>Device extension</dd>

            <dt><b>Registered Extension Number</b></dt>
            <dd>80</dd>

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
                <li>Requires VK_KHR_external_semaphore_capabilities.</li>
            </ul></dd>

            <dt><b>Contributors</b></dt>
            <dd><ul>
                <li>Jesse Hall, Google</li>
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

        "KHX_EXTERNAL_SEMAPHORE_FD_SPEC_VERSION".."1"
    )

    StringConstant(
        "The extension name.",

        "KHX_EXTERNAL_SEMAPHORE_FD_EXTENSION_NAME".."VK_KHX_external_semaphore_fd"
    )

    EnumConstant(
        "Extends {@code VkStructureType}.",

        "STRUCTURE_TYPE_IMPORT_SEMAPHORE_FD_INFO_KHX".."1000079000"
    )

    VkResult(
        "ImportSemaphoreFdKHX",
        """
        Import a semaphore from a POSIX file descriptor.

        <h5>C Specification</h5>
        To import semaphore state from a POSIX file descriptor, call:

        <code><pre>
￿VkResult vkImportSemaphoreFdKHX(
￿    VkDevice                                    device,
￿    const VkImportSemaphoreFdInfoKHX*           pImportSemaphoreFdInfo);</pre></code>

        <h5>Description</h5>
        Importing semaphore state from a file descriptor transfers ownership of the file descriptor from the application to the Vulkan implementation. The application <b>must</b> not perform any operations on the file descriptor after a successful import.

        <h5>Valid Usage</h5>
        <ul>
            <li>{@code semaphore} <b>must</b> not be associated with any queue command that has not yet completed execution on that queue</li>
        </ul>

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code device} <b>must</b> be a valid {@code VkDevice} handle</li>
            <li>{@code pImportSemaphoreFdInfo} <b>must</b> be a pointer to a valid ##VkImportSemaphoreFdInfoKHX structure</li>
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
                <li>#ERROR_INVALID_EXTERNAL_HANDLE_KHX</li>
            </ul></dd>
        </dl>

        <h5>See Also</h5>
        ##VkImportSemaphoreFdInfoKHX
        """,

        VkDevice.IN("device", "the logical device that created the semaphore."),
        const..VkImportSemaphoreFdInfoKHX.p.IN("pImportSemaphoreFdInfo", "points to a ##VkImportSemaphoreFdInfoKHX structure specifying the semaphore and import parameters.")
    )

    VkResult(
        "GetSemaphoreFdKHX",
        """
        Get a POSIX file descriptor handle for a semaphore.

        <h5>C Specification</h5>
        To export a POSIX file descriptor representing the state of a semaphore, call:

        <code><pre>
￿VkResult vkGetSemaphoreFdKHX(
￿    VkDevice                                    device,
￿    VkSemaphore                                 semaphore,
￿    VkExternalSemaphoreHandleTypeFlagBitsKHX    handleType,
￿    int*                                        pFd);</pre></code>

        <h5>Description</h5>
        The properties of the file descriptor returned depend on the value of {@code handleType}. See {@code VkExternalSemaphoreHandleTypeFlagBitsKHX} for a description of the properties of the defined external semaphore handle types.

        Each call to #GetSemaphoreFdKHX() <b>must</b> create a new file descriptor and transfer ownership of it to the application. To avoid leaking resources, the application <b>must</b> release ownership of the file descriptor using the fname:close system call when it is no longer needed, or by importing Vulkan semaphore state from it.

        <h5>Valid Usage</h5>
        <ul>
            <li>{@code handleType} <b>must</b> have been included in ##VkExportSemaphoreCreateInfoKHX{@code ::handleTypes} when {@code semaphore}&#8217;s current state was created.</li>
            <li>{@code semaphore} <b>must</b> not currently have its state replaced by imported semaphore state as described below in <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html\#synchronization-semaphores-importing">Importing Semaphore State</a> unless that imported semaphore state&#8217;s handle type was included in ##VkExternalSemaphorePropertiesKHX{@code ::exportFromImportedHandleTypes}.</li>
            <li>If {@code handleType} refers to a handle type with temporary import semantics, as defined below in <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html\#synchronization-semaphores-importing">Importing Semaphore State</a>, there <b>must</b> be no queue waiting on {@code semaphore}.</li>
            <li>If {@code handleType} refers to a handle type with temporary import semantics, {@code semaphore} <b>must</b> be signaled, or have an associated <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html\#synchronization-semaphores-signaling">semaphore signal operation</a> pending execution.</li>
            <li>{@code handleType} <b>must</b> be defined as a POSIX file descriptor handle.</li>
        </ul>

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code device} <b>must</b> be a valid {@code VkDevice} handle</li>
            <li>{@code semaphore} <b>must</b> be a valid {@code VkSemaphore} handle</li>
            <li>{@code handleType} <b>must</b> be a valid {@code VkExternalSemaphoreHandleTypeFlagBitsKHX} value</li>
            <li>{@code pFd} <b>must</b> be a pointer to a {@code int} value</li>
            <li>{@code semaphore} <b>must</b> have been created, allocated, or retrieved from {@code device}</li>
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

        VkDevice.IN("device", "the logical device that created {@code semaphore}."),
        VkSemaphore.IN("semaphore", "the semaphore from which state will be exported."),
        VkExternalSemaphoreHandleTypeFlagBitsKHX.IN("handleType", "the type of handle requested."),
        Check(1)..int_p.OUT("pFd", "will return the file descriptor representing the semaphore state.")
    )
}