/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package vulkan.templates

import org.lwjgl.generator.*
import core.windows.*
import vulkan.*

val KHR_external_memory_win32 = "KHRExternalMemoryWin32".nativeClassVK("KHR_external_memory_win32", type = "device", postfix = "KHR") {
    javaImport("org.lwjgl.system.windows.*")
    documentation =
        """
        An application may wish to reference device memory in multiple Vulkan logical devices or instances, in multiple processes, and/or in multiple APIs. This extension enables an application to export Windows handles from Vulkan memory objects and to import Vulkan memory objects from Windows handles exported from other Vulkan memory objects or from similar resources in other APIs.

        <h5>VK_KHR_external_memory_win32</h5>
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
                <li>Requires {@link KHRExternalMemory VK_KHR_external_memory}</li>
            </ul></dd>

            <dt><b>Contact</b></dt>
            <dd><ul>
                <li>James Jones <a target="_blank" href="https://github.com/KhronosGroup/Vulkan-Docs/issues/new?body=[VK_KHR_external_memory_win32]%20@cubanismo%250A%3C%3CHere%20describe%20the%20issue%20or%20question%20you%20have%20about%20the%20VK_KHR_external_memory_win32%20extension%3E%3E">cubanismo</a></li>
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
        To export a Windows handle representing the payload of a Vulkan device memory object, call:

        <pre><code>
￿VkResult vkGetMemoryWin32HandleKHR(
￿    VkDevice                                    device,
￿    const VkMemoryGetWin32HandleInfoKHR*        pGetWin32HandleInfo,
￿    HANDLE*                                     pHandle);</code></pre>

        <h5>Description</h5>
        For handle types defined as NT handles, the handles returned by {@code vkGetMemoryWin32HandleKHR} are owned by the application and hold a reference to their payload. To avoid leaking resources, the application <b>must</b> release ownership of them using the {@code CloseHandle} system call when they are no longer needed.

        <div style="margin-left: 26px; border-left: 1px solid gray; padding-left: 14px;"><h5>Note</h5>
        Non-NT handle types do not add a reference to their associated payload. If the original object owning the payload is destroyed, all resources and handles sharing that payload will become invalid.
        </div>

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code device} <b>must</b> be a valid {@code VkDevice} handle</li>
            <li>{@code pGetWin32HandleInfo} <b>must</b> be a valid pointer to a valid ##VkMemoryGetWin32HandleInfoKHR structure</li>
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
        ##VkMemoryGetWin32HandleInfoKHR
        """,

        VkDevice("device", "the logical device that created the device memory being exported."),
        VkMemoryGetWin32HandleInfoKHR.const.p("pGetWin32HandleInfo", "a pointer to a ##VkMemoryGetWin32HandleInfoKHR structure containing parameters of the export operation."),
        Check(1)..HANDLE.p("pHandle", "will return the Windows handle representing the payload of the device memory object.")
    )

    VkResult(
        "GetMemoryWin32HandlePropertiesKHR",
        """
        Get Properties of External Memory Win32 Handles.

        <h5>C Specification</h5>
        Windows memory handles compatible with Vulkan <b>may</b> also be created by non-Vulkan APIs using methods beyond the scope of this specification. To determine the correct parameters to use when importing such handles, call:

        <pre><code>
￿VkResult vkGetMemoryWin32HandlePropertiesKHR(
￿    VkDevice                                    device,
￿    VkExternalMemoryHandleTypeFlagBits          handleType,
￿    HANDLE                                      handle,
￿    VkMemoryWin32HandlePropertiesKHR*           pMemoryWin32HandleProperties);</code></pre>

        <h5>Valid Usage</h5>
        <ul>
            <li>{@code handle} <b>must</b> be an external memory handle created outside of the Vulkan API</li>
            <li>{@code handleType} <b>must</b> not be one of the handle types defined as opaque</li>
        </ul>

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code device} <b>must</b> be a valid {@code VkDevice} handle</li>
            <li>{@code handleType} <b>must</b> be a valid {@code VkExternalMemoryHandleTypeFlagBits} value</li>
            <li>{@code pMemoryWin32HandleProperties} <b>must</b> be a valid pointer to a ##VkMemoryWin32HandlePropertiesKHR structure</li>
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
        ##VkMemoryWin32HandlePropertiesKHR
        """,

        VkDevice("device", "the logical device that will be importing {@code handle}."),
        VkExternalMemoryHandleTypeFlagBits("handleType", "a {@code VkExternalMemoryHandleTypeFlagBits} value specifying the type of the handle {@code handle}."),
        HANDLE("handle", "the handle which will be imported."),
        VkMemoryWin32HandlePropertiesKHR.p("pMemoryWin32HandleProperties", "a pointer to a ##VkMemoryWin32HandlePropertiesKHR structure in which properties of {@code handle} are returned.")
    )
}