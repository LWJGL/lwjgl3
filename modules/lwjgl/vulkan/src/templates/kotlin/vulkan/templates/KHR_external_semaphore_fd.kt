/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package vulkan.templates

import org.lwjgl.generator.*
import vulkan.*

val KHR_external_semaphore_fd = "KHRExternalSemaphoreFd".nativeClassVK("KHR_external_semaphore_fd", type = "device", postfix = "KHR") {
    documentation =
        """
        An application using external memory may wish to synchronize access to that memory using semaphores. This extension enables an application to export semaphore payload to and import semaphore payload from POSIX file descriptors.

        <h5>VK_KHR_external_semaphore_fd</h5>
        <dl>
            <dt><b>Name String</b></dt>
            <dd>{@code VK_KHR_external_semaphore_fd}</dd>

            <dt><b>Extension Type</b></dt>
            <dd>Device extension</dd>

            <dt><b>Registered Extension Number</b></dt>
            <dd>80</dd>

            <dt><b>Revision</b></dt>
            <dd>1</dd>

            <dt><b>Extension and Version Dependencies</b></dt>
            <dd><ul>
                <li>Requires Vulkan 1.0</li>
                <li>Requires {@link KHRExternalSemaphore VK_KHR_external_semaphore}</li>
            </ul></dd>

            <dt><b>Contact</b></dt>
            <dd><ul>
                <li>James Jones <a target="_blank" href="https://github.com/KhronosGroup/Vulkan-Docs/issues/new?body=[VK_KHR_external_semaphore_fd]%20@cubanismo%250A%3C%3CHere%20describe%20the%20issue%20or%20question%20you%20have%20about%20the%20VK_KHR_external_semaphore_fd%20extension%3E%3E">cubanismo</a></li>
            </ul></dd>
        </dl>

        <h5>Other Extension Metadata</h5>
        <dl>
            <dt><b>Last Modified Date</b></dt>
            <dd>2016-10-21</dd>

            <dt><b>IP Status</b></dt>
            <dd>No known IP claims.</dd>

            <dt><b>Contributors</b></dt>
            <dd><ul>
                <li>Jesse Hall, Google</li>
                <li>James Jones, NVIDIA</li>
                <li>Jeff Juliano, NVIDIA</li>
                <li>Carsten Rohde, NVIDIA</li>
            </ul></dd>
        </dl>
        """

    IntConstant(
        "The extension specification version.",

        "KHR_EXTERNAL_SEMAPHORE_FD_SPEC_VERSION".."1"
    )

    StringConstant(
        "The extension name.",

        "KHR_EXTERNAL_SEMAPHORE_FD_EXTENSION_NAME".."VK_KHR_external_semaphore_fd"
    )

    EnumConstant(
        "Extends {@code VkStructureType}.",

        "STRUCTURE_TYPE_IMPORT_SEMAPHORE_FD_INFO_KHR".."1000079000",
        "STRUCTURE_TYPE_SEMAPHORE_GET_FD_INFO_KHR".."1000079001"
    )

    VkResult(
        "ImportSemaphoreFdKHR",
        """
        Import a semaphore from a POSIX file descriptor.

        <h5>C Specification</h5>
        To import a semaphore payload from a POSIX file descriptor, call:

        <pre><code>
￿VkResult vkImportSemaphoreFdKHR(
￿    VkDevice                                    device,
￿    const VkImportSemaphoreFdInfoKHR*           pImportSemaphoreFdInfo);</code></pre>

        <h5>Description</h5>
        Importing a semaphore payload from a file descriptor transfers ownership of the file descriptor from the application to the Vulkan implementation. The application <b>must</b> not perform any operations on the file descriptor after a successful import.

        Applications <b>can</b> import the same semaphore payload into multiple instances of Vulkan, into the same instance from which it was exported, and multiple times into a given Vulkan instance.

        <h5>Valid Usage</h5>
        <ul>
            <li>{@code semaphore} <b>must</b> not be associated with any queue command that has not yet completed execution on that queue</li>
        </ul>

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code device} <b>must</b> be a valid {@code VkDevice} handle</li>
            <li>{@code pImportSemaphoreFdInfo} <b>must</b> be a valid pointer to a valid ##VkImportSemaphoreFdInfoKHR structure</li>
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
        ##VkImportSemaphoreFdInfoKHR
        """,

        VkDevice("device", "the logical device that created the semaphore."),
        VkImportSemaphoreFdInfoKHR.const.p("pImportSemaphoreFdInfo", "a pointer to a ##VkImportSemaphoreFdInfoKHR structure specifying the semaphore and import parameters.")
    )

    VkResult(
        "GetSemaphoreFdKHR",
        """
        Get a POSIX file descriptor handle for a semaphore.

        <h5>C Specification</h5>
        To export a POSIX file descriptor representing the payload of a semaphore, call:

        <pre><code>
￿VkResult vkGetSemaphoreFdKHR(
￿    VkDevice                                    device,
￿    const VkSemaphoreGetFdInfoKHR*              pGetFdInfo,
￿    int*                                        pFd);</code></pre>

        <h5>Description</h5>
        Each call to {@code vkGetSemaphoreFdKHR} <b>must</b> create a new file descriptor and transfer ownership of it to the application. To avoid leaking resources, the application <b>must</b> release ownership of the file descriptor when it is no longer needed.

        <div style="margin-left: 26px; border-left: 1px solid gray; padding-left: 14px;"><h5>Note</h5>
        Ownership can be released in many ways. For example, the application can call {@code close}() on the file descriptor, or transfer ownership back to Vulkan by using the file descriptor to import a semaphore payload.
        </div>

        Where supported by the operating system, the implementation <b>must</b> set the file descriptor to be closed automatically when an {@code execve} system call is made.

        Exporting a file descriptor from a semaphore <b>may</b> have side effects depending on the transference of the specified handle type, as described in <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html\#synchronization-semaphores-importing">Importing Semaphore State</a>.

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code device} <b>must</b> be a valid {@code VkDevice} handle</li>
            <li>{@code pGetFdInfo} <b>must</b> be a valid pointer to a valid ##VkSemaphoreGetFdInfoKHR structure</li>
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
        ##VkSemaphoreGetFdInfoKHR
        """,

        VkDevice("device", "the logical device that created the semaphore being exported."),
        VkSemaphoreGetFdInfoKHR.const.p("pGetFdInfo", "a pointer to a ##VkSemaphoreGetFdInfoKHR structure containing parameters of the export operation."),
        Check(1)..int.p("pFd", "will return the file descriptor representing the semaphore payload.")
    )
}