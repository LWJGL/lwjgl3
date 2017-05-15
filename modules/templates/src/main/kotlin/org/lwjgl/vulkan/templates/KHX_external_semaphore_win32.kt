/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.vulkan.templates

import org.lwjgl.generator.*
import org.lwjgl.system.windows.*
import org.lwjgl.vulkan.*

val KHX_external_semaphore_win32 = "KHXExternalSemaphoreWin32".nativeClassVK("KHX_external_semaphore_win32", type = "device", postfix = KHX) {
    documentation =
        """
        An application using external memory may wish to synchronize access to that memory using semaphores. This extension enables an application to export semaphore state to and import semaphore state from Windows handles.

        <dl>
            <dt><b>Name String</b></dt>
            <dd>VK_KHX_external_semaphore_win32</dd>

            <dt><b>Extension Type</b></dt>
            <dd>Device extension</dd>

            <dt><b>Registered Extension Number</b></dt>
            <dd>79</dd>

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

        "KHX_EXTERNAL_SEMAPHORE_WIN32_SPEC_VERSION".."1"
    )

    StringConstant(
        "The extension name.",

        "KHX_EXTERNAL_SEMAPHORE_WIN32_EXTENSION_NAME".."VK_KHX_external_semaphore_win32"
    )

    EnumConstant(
        "Extends {@code VkStructureType}.",

        "STRUCTURE_TYPE_IMPORT_SEMAPHORE_WIN32_HANDLE_INFO_KHX".."1000078000",
        "STRUCTURE_TYPE_EXPORT_SEMAPHORE_WIN32_HANDLE_INFO_KHX".."1000078001",
        "STRUCTURE_TYPE_D3D12_FENCE_SUBMIT_INFO_KHX".."1000078002"
    )

    VkResult(
        "ImportSemaphoreWin32HandleKHX",
        """
        Import a semaphore from a Windows HANDLE.

        <h5>C Specification</h5>
        To import semaphore state from a Windows handle, call:

        <code><pre>
￿VkResult vkImportSemaphoreWin32HandleKHX(
￿    VkDevice                                    device,
￿    const VkImportSemaphoreWin32HandleInfoKHX*  pImportSemaphoreWin32HandleInfo);</pre></code>

        <h5>Description</h5>
        Importing semaphore state from Windows handles does not transfer ownership of the handle to the Vulkan implementation. For handle types defined as NT handles, the application <b>must</b> release ownership using the fname:CloseHandle system call when the handle is no longer needed.

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code device} <b>must</b> be a valid {@code VkDevice} handle</li>
            <li>{@code pImportSemaphoreWin32HandleInfo} <b>must</b> be a pointer to a valid ##VkImportSemaphoreWin32HandleInfoKHX structure</li>
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
        ##VkImportSemaphoreWin32HandleInfoKHX
        """,

        VkDevice.IN("device", "the logical device that created the semaphore."),
        const..VkImportSemaphoreWin32HandleInfoKHX.p.IN("pImportSemaphoreWin32HandleInfo", "points to a ##VkImportSemaphoreWin32HandleInfoKHX structure specifying the semaphore and import parameters.")
    )

    VkResult(
        "GetSemaphoreWin32HandleKHX",
        """
        Get a Windows HANDLE for a semaphore.

        <h5>C Specification</h5>
        To export a Windows handle representing the state of a semaphore, call:

        <code><pre>
￿VkResult vkGetSemaphoreWin32HandleKHX(
￿    VkDevice                                    device,
￿    VkSemaphore                                 semaphore,
￿    VkExternalSemaphoreHandleTypeFlagBitsKHX    handleType,
￿    HANDLE*                                     pHandle);</pre></code>

        <h5>Description</h5>
        The properties of the handle returned depend on the value of {@code handleType}. See {@code VkExternalSemaphoreHandleTypeFlagBitsKHX} for a description of the properties of the defined external semaphore handle types.

        For handle types defined as NT handles, the handles returned by #GetSemaphoreWin32HandleKHX() are owned by the application. To avoid leaking resources, the application <b>must</b> release ownership of them using the fname:CloseHandle system call when they are no longer needed.

        <h5>Valid Usage</h5>
        <ul>
            <li>{@code handleType} <b>must</b> have been included in ##VkExportSemaphoreCreateInfoKHX{@code ::handleTypes} when {@code semaphore}&#8217;s current state was created.</li>
            <li>If {@code handleType} is defined as an NT handle, #GetSemaphoreWin32HandleKHX() <b>must</b> be called no more than once for each valid unique combination of {@code semaphore} and {@code handleType}.</li>
            <li>{@code semaphore} <b>must</b> not currently have its state replaced by imported semaphore state as described below in <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html\#synchronization-semaphores-importing">Importing Semaphore State</a> unless that imported semaphore state&#8217;s handle type was included in ##VkExternalSemaphorePropertiesKHX{@code ::exportFromImportedHandleTypes}.</li>
            <li>If {@code handleType} refers to a handle type with temporary import semantics, as defined below in <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html\#synchronization-semaphores-importing">Importing Semaphore State</a>, there <b>must</b> be no queue waiting on {@code semaphore}.</li>
            <li>If {@code handleType} refers to a handle type with temporary import semantics, {@code semaphore} <b>must</b> be signaled, or have an associated <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html\#synchronization-semaphores-signaling">semaphore signal operation</a> pending execution.</li>
            <li>{@code handleType} <b>must</b> be defined as an NT handle or a global share handle.</li>
        </ul>

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code device} <b>must</b> be a valid {@code VkDevice} handle</li>
            <li>{@code semaphore} <b>must</b> be a valid {@code VkSemaphore} handle</li>
            <li>{@code handleType} <b>must</b> be a valid {@code VkExternalSemaphoreHandleTypeFlagBitsKHX} value</li>
            <li>{@code pHandle} <b>must</b> be a pointer to a {@code HANDLE} value</li>
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
        Check(1)..HANDLE.p.OUT("pHandle", "will return the Windows handle representing the semaphore state.")
    )
}