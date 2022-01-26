/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package vulkan.templates

import org.lwjgl.generator.*
import vulkan.*

val KHR_external_fence_fd = "KHRExternalFenceFd".nativeClassVK("KHR_external_fence_fd", type = "device", postfix = "KHR") {
    documentation =
        """
        An application using external memory may wish to synchronize access to that memory using fences. This extension enables an application to export fence payload to and import fence payload from POSIX file descriptors.

        <h5>VK_KHR_external_fence_fd</h5>
        <dl>
            <dt><b>Name String</b></dt>
            <dd>{@code VK_KHR_external_fence_fd}</dd>

            <dt><b>Extension Type</b></dt>
            <dd>Device extension</dd>

            <dt><b>Registered Extension Number</b></dt>
            <dd>116</dd>

            <dt><b>Revision</b></dt>
            <dd>1</dd>

            <dt><b>Extension and Version Dependencies</b></dt>
            <dd><ul>
                <li>Requires Vulkan 1.0</li>
                <li>Requires {@link KHRExternalFence VK_KHR_external_fence}</li>
            </ul></dd>

            <dt><b>Contact</b></dt>
            <dd><ul>
                <li>Jesse Hall <a target="_blank" href="https://github.com/KhronosGroup/Vulkan-Docs/issues/new?body=[VK_KHR_external_fence_fd]%20@critsec%250A%3C%3CHere%20describe%20the%20issue%20or%20question%20you%20have%20about%20the%20VK_KHR_external_fence_fd%20extension%3E%3E">critsec</a></li>
            </ul></dd>
        </dl>

        <h5>Other Extension Metadata</h5>
        <dl>
            <dt><b>Last Modified Date</b></dt>
            <dd>2017-05-08</dd>

            <dt><b>IP Status</b></dt>
            <dd>No known IP claims.</dd>

            <dt><b>Contributors</b></dt>
            <dd><ul>
                <li>Jesse Hall, Google</li>
                <li>James Jones, NVIDIA</li>
                <li>Jeff Juliano, NVIDIA</li>
                <li>Cass Everitt, Oculus</li>
                <li>Contributors to {@link KHRExternalSemaphoreFd VK_KHR_external_semaphore_fd}</li>
            </ul></dd>
        </dl>
        """

    IntConstant(
        "The extension specification version.",

        "KHR_EXTERNAL_FENCE_FD_SPEC_VERSION".."1"
    )

    StringConstant(
        "The extension name.",

        "KHR_EXTERNAL_FENCE_FD_EXTENSION_NAME".."VK_KHR_external_fence_fd"
    )

    EnumConstant(
        "Extends {@code VkStructureType}.",

        "STRUCTURE_TYPE_IMPORT_FENCE_FD_INFO_KHR".."1000115000",
        "STRUCTURE_TYPE_FENCE_GET_FD_INFO_KHR".."1000115001"
    )

    VkResult(
        "ImportFenceFdKHR",
        """
        Import a fence from a POSIX file descriptor.

        <h5>C Specification</h5>
        To import a fence payload from a POSIX file descriptor, call:

        <pre><code>
￿VkResult vkImportFenceFdKHR(
￿    VkDevice                                    device,
￿    const VkImportFenceFdInfoKHR*               pImportFenceFdInfo);</code></pre>

        <h5>Description</h5>
        Importing a fence payload from a file descriptor transfers ownership of the file descriptor from the application to the Vulkan implementation. The application <b>must</b> not perform any operations on the file descriptor after a successful import.

        Applications <b>can</b> import the same fence payload into multiple instances of Vulkan, into the same instance from which it was exported, and multiple times into a given Vulkan instance.

        <h5>Valid Usage</h5>
        <ul>
            <li>{@code fence} <b>must</b> not be associated with any queue command that has not yet completed execution on that queue</li>
        </ul>

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code device} <b>must</b> be a valid {@code VkDevice} handle</li>
            <li>{@code pImportFenceFdInfo} <b>must</b> be a valid pointer to a valid ##VkImportFenceFdInfoKHR structure</li>
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
        ##VkImportFenceFdInfoKHR
        """,

        VkDevice("device", "the logical device that created the fence."),
        VkImportFenceFdInfoKHR.const.p("pImportFenceFdInfo", "a pointer to a ##VkImportFenceFdInfoKHR structure specifying the fence and import parameters.")
    )

    VkResult(
        "GetFenceFdKHR",
        """
        Get a POSIX file descriptor handle for a fence.

        <h5>C Specification</h5>
        To export a POSIX file descriptor representing the payload of a fence, call:

        <pre><code>
￿VkResult vkGetFenceFdKHR(
￿    VkDevice                                    device,
￿    const VkFenceGetFdInfoKHR*                  pGetFdInfo,
￿    int*                                        pFd);</code></pre>

        <h5>Description</h5>
        Each call to {@code vkGetFenceFdKHR} <b>must</b> create a new file descriptor and transfer ownership of it to the application. To avoid leaking resources, the application <b>must</b> release ownership of the file descriptor when it is no longer needed.

        <div style="margin-left: 26px; border-left: 1px solid gray; padding-left: 14px;"><h5>Note</h5>
        Ownership can be released in many ways. For example, the application can call {@code close}() on the file descriptor, or transfer ownership back to Vulkan by using the file descriptor to import a fence payload.
        </div>

        If {@code pGetFdInfo→handleType} is #EXTERNAL_FENCE_HANDLE_TYPE_SYNC_FD_BIT and the fence is signaled at the time {@code vkGetFenceFdKHR} is called, {@code pFd} <b>may</b> return the value {@code -1} instead of a valid file descriptor.

        Where supported by the operating system, the implementation <b>must</b> set the file descriptor to be closed automatically when an {@code execve} system call is made.

        Exporting a file descriptor from a fence <b>may</b> have side effects depending on the transference of the specified handle type, as described in <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html\#synchronization-fences-importing">Importing Fence State</a>.

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code device} <b>must</b> be a valid {@code VkDevice} handle</li>
            <li>{@code pGetFdInfo} <b>must</b> be a valid pointer to a valid ##VkFenceGetFdInfoKHR structure</li>
            <li>{@code pFd} <b>must</b> be a valid pointer to an {@code int} value</li>
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
        ##VkFenceGetFdInfoKHR
        """,

        VkDevice("device", "the logical device that created the fence being exported."),
        VkFenceGetFdInfoKHR.const.p("pGetFdInfo", "a pointer to a ##VkFenceGetFdInfoKHR structure containing parameters of the export operation."),
        Check(1)..int.p("pFd", "will return the file descriptor representing the fence payload.")
    )
}