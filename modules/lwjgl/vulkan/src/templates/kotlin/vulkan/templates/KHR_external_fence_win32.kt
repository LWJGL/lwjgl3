/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package vulkan.templates

import org.lwjgl.generator.*
import core.windows.*
import vulkan.*

val KHR_external_fence_win32 = "KHRExternalFenceWin32".nativeClassVK("KHR_external_fence_win32", type = "device", postfix = "KHR") {
    javaImport("org.lwjgl.system.windows.*")
    documentation =
        """
        An application using external memory may wish to synchronize access to that memory using fences. This extension enables an application to export fence payload to and import fence payload from Windows handles.

        <h5>VK_KHR_external_fence_win32</h5>
        <dl>
            <dt><b>Name String</b></dt>
            <dd>{@code VK_KHR_external_fence_win32}</dd>

            <dt><b>Extension Type</b></dt>
            <dd>Device extension</dd>

            <dt><b>Registered Extension Number</b></dt>
            <dd>115</dd>

            <dt><b>Revision</b></dt>
            <dd>1</dd>

            <dt><b>Extension and Version Dependencies</b></dt>
            <dd><ul>
                <li>Requires Vulkan 1.0</li>
                <li>Requires {@link KHRExternalFence VK_KHR_external_fence}</li>
            </ul></dd>

            <dt><b>Contact</b></dt>
            <dd><ul>
                <li>Jesse Hall <a target="_blank" href="https://github.com/KhronosGroup/Vulkan-Docs/issues/new?body=[VK_KHR_external_fence_win32]%20@critsec%250A%3C%3CHere%20describe%20the%20issue%20or%20question%20you%20have%20about%20the%20VK_KHR_external_fence_win32%20extension%3E%3E">critsec</a></li>
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
                <li>Contributors to {@link KHRExternalSemaphoreWin32 VK_KHR_external_semaphore_win32}</li>
            </ul></dd>
        </dl>
        """

    IntConstant(
        "The extension specification version.",

        "KHR_EXTERNAL_FENCE_WIN32_SPEC_VERSION".."1"
    )

    StringConstant(
        "The extension name.",

        "KHR_EXTERNAL_FENCE_WIN32_EXTENSION_NAME".."VK_KHR_external_fence_win32"
    )

    EnumConstant(
        "Extends {@code VkStructureType}.",

        "STRUCTURE_TYPE_IMPORT_FENCE_WIN32_HANDLE_INFO_KHR".."1000114000",
        "STRUCTURE_TYPE_EXPORT_FENCE_WIN32_HANDLE_INFO_KHR".."1000114001",
        "STRUCTURE_TYPE_FENCE_GET_WIN32_HANDLE_INFO_KHR".."1000114002"
    )

    VkResult(
        "ImportFenceWin32HandleKHR",
        """
        Import a fence from a Windows HANDLE.

        <h5>C Specification</h5>
        To import a fence payload from a Windows handle, call:

        <pre><code>
￿VkResult vkImportFenceWin32HandleKHR(
￿    VkDevice                                    device,
￿    const VkImportFenceWin32HandleInfoKHR*      pImportFenceWin32HandleInfo);</code></pre>

        <h5>Description</h5>
        Importing a fence payload from Windows handles does not transfer ownership of the handle to the Vulkan implementation. For handle types defined as NT handles, the application <b>must</b> release ownership using the {@code CloseHandle} system call when the handle is no longer needed.

        Applications <b>can</b> import the same fence payload into multiple instances of Vulkan, into the same instance from which it was exported, and multiple times into a given Vulkan instance.

        <h5>Valid Usage</h5>
        <ul>
            <li>{@code fence} <b>must</b> not be associated with any queue command that has not yet completed execution on that queue</li>
        </ul>

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code device} <b>must</b> be a valid {@code VkDevice} handle</li>
            <li>{@code pImportFenceWin32HandleInfo} <b>must</b> be a valid pointer to a valid ##VkImportFenceWin32HandleInfoKHR structure</li>
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
        ##VkImportFenceWin32HandleInfoKHR
        """,

        VkDevice("device", "the logical device that created the fence."),
        VkImportFenceWin32HandleInfoKHR.const.p("pImportFenceWin32HandleInfo", "a pointer to a ##VkImportFenceWin32HandleInfoKHR structure specifying the fence and import parameters.")
    )

    VkResult(
        "GetFenceWin32HandleKHR",
        """
        Get a Windows HANDLE for a fence.

        <h5>C Specification</h5>
        To export a Windows handle representing the state of a fence, call:

        <pre><code>
￿VkResult vkGetFenceWin32HandleKHR(
￿    VkDevice                                    device,
￿    const VkFenceGetWin32HandleInfoKHR*         pGetWin32HandleInfo,
￿    HANDLE*                                     pHandle);</code></pre>

        <h5>Description</h5>
        For handle types defined as NT handles, the handles returned by {@code vkGetFenceWin32HandleKHR} are owned by the application. To avoid leaking resources, the application <b>must</b> release ownership of them using the {@code CloseHandle} system call when they are no longer needed.

        Exporting a Windows handle from a fence <b>may</b> have side effects depending on the transference of the specified handle type, as described in <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html\#synchronization-fences-importing">Importing Fence Payloads</a>.

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code device} <b>must</b> be a valid {@code VkDevice} handle</li>
            <li>{@code pGetWin32HandleInfo} <b>must</b> be a valid pointer to a valid ##VkFenceGetWin32HandleInfoKHR structure</li>
            <li>{@code pHandle} <b>must</b> be a valid pointer to a {@code HANDLE} value</li>
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
        ##VkFenceGetWin32HandleInfoKHR
        """,

        VkDevice("device", "the logical device that created the fence being exported."),
        VkFenceGetWin32HandleInfoKHR.const.p("pGetWin32HandleInfo", "a pointer to a ##VkFenceGetWin32HandleInfoKHR structure containing parameters of the export operation."),
        Check(1)..HANDLE.p("pHandle", "will return the Windows handle representing the fence state.")
    )
}