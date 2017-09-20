/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.vulkan.templates

import org.lwjgl.generator.*
import org.lwjgl.vulkan.*

val KHR_external_semaphore_capabilities = "KHRExternalSemaphoreCapabilities".nativeClassVK("KHR_external_semaphore_capabilities", type = "instance", postfix = KHR) {
    documentation =
        """
        An application may wish to reference device semaphores in multiple Vulkan logical devices or instances, in multiple processes, and/or in multiple APIs. This extension provides a set of capability queries and handle definitions that allow an application to determine what types of "{@code external}" semaphore handles an implementation supports for a given set of use cases.

        <dl>
            <dt><b>Name String</b></dt>
            <dd>{@code VK_KHR_external_semaphore_capabilities}</dd>

            <dt><b>Extension Type</b></dt>
            <dd>Instance extension</dd>

            <dt><b>Registered Extension Number</b></dt>
            <dd>77</dd>

            <dt><b>Revision</b></dt>
            <dd>1</dd>

            <dt><b>Extension and Version Dependencies</b></dt>
            <dd><ul>
                <li>Requires Vulkan 1.0</li>
                <li>Requires <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html\#VK_KHR_get_physical_device_properties2">{@code VK_KHR_get_physical_device_properties2}</a></li>
            </ul></dd>

            <dt><b>Contact</b></dt>
            <dd><ul>
                <li>James Jones @cubanismo</li>
            </ul></dd>

            <dt><b>Last Modified Date</b></dt>
            <dd>2016-10-20</dd>

            <dt><b>IP Status</b></dt>
            <dd>No known IP claims.</dd>

            <dt><b>Contributors</b></dt>
            <dd><ul>
                <li>Jesse Hall, Google</li>
                <li>James Jones, NVIDIA</li>
                <li>Jeff Juliano, NVIDIA</li>
            </ul></dd>
        </dl>
        """

    IntConstant(
        "The extension specification version.",

        "KHR_EXTERNAL_SEMAPHORE_CAPABILITIES_SPEC_VERSION".."1"
    )

    StringConstant(
        "The extension name.",

        "KHR_EXTERNAL_SEMAPHORE_CAPABILITIES_EXTENSION_NAME".."VK_KHR_external_semaphore_capabilities"
    )

    EnumConstant(
        "Extends {@code VkStructureType}.",

        "STRUCTURE_TYPE_PHYSICAL_DEVICE_EXTERNAL_SEMAPHORE_INFO_KHR".."1000076000",
        "STRUCTURE_TYPE_EXTERNAL_SEMAPHORE_PROPERTIES_KHR".."1000076001"
    )

    EnumConstant(
        "VK_LUID_SIZE_KHR",

        "LUID_SIZE_KHR".."8"
    )

    EnumConstant(
        """
        VkExternalSemaphoreHandleTypeFlagBitsKHR - Bitmask of valid external semaphore handle types

        <h5>Description</h5>
        <ul>
            <li>#EXTERNAL_SEMAPHORE_HANDLE_TYPE_OPAQUE_FD_BIT_KHR specifies a POSIX file descriptor handle that has only limited valid usage outside of Vulkan and other compatible APIs. It <b>must</b> be compatible with the POSIX system calls {@code dup}, {@code dup2}, {@code close}, and the non-standard system call {@code dup3}. Additionally, it <b>must</b> be transportable over a socket using an {@code SCM_RIGHTS} control message. It owns a reference to the underlying synchronization primitive represented by its Vulkan semaphore object.</li>
            <li>#EXTERNAL_SEMAPHORE_HANDLE_TYPE_OPAQUE_WIN32_BIT_KHR specifies an NT handle that has only limited valid usage outside of Vulkan and other compatible APIs. It <b>must</b> be compatible with the functions {@code DuplicateHandle}, {@code CloseHandle}, {@code CompareObjectHandles}, {@code GetHandleInformation}, and {@code SetHandleInformation}. It owns a reference to the underlying synchronization primitive represented by its Vulkan semaphore object.</li>
            <li>#EXTERNAL_SEMAPHORE_HANDLE_TYPE_OPAQUE_WIN32_KMT_BIT_KHR specifies a global share handle that has only limited valid usage outside of Vulkan and other compatible APIs. It is not compatible with any native APIs. It does not own a reference to the underlying synchronization primitive represented its Vulkan semaphore object, and will therefore become invalid when all Vulkan semaphore objects associated with it are destroyed.</li>
            <li>#EXTERNAL_SEMAPHORE_HANDLE_TYPE_D3D12_FENCE_BIT_KHR specifies an NT handle returned by {@code ID3D12Device}::{@code CreateSharedHandle} referring to a Direct3D 12 fence. It owns a reference to the underlying synchronization primitive associated with the Direct3D fence.</li>
            <li>#EXTERNAL_SEMAPHORE_HANDLE_TYPE_SYNC_FD_BIT_KHR specifies a POSIX file descriptor handle to a Linux Sync File or Android Fence object. It can be used with any native API accepting a valid sync file or fence as input. It owns a reference to the underlying synchronization primitive associated with the file descriptor. Implementations which support importing this handle type <b>must</b> accept any type of sync or fence FD supported by the native system they are running on.</li>
        </ul>

        <div style="margin-left: 26px; border-left: 1px solid gray; padding-left: 14px;"><h5>Note</h5>
        Handles of type #EXTERNAL_SEMAPHORE_HANDLE_TYPE_SYNC_FD_BIT_KHR generated by the implementation may represent either Linux Sync Files or Android Fences at the implementation's discretion. Applications <b>should</b> only use operations defined for both types of file descriptors, unless they know via means external to Vulkan the type of the file descriptor, or are prepared to deal with the system-defined operation failures resulting from using the wrong type.
        </div>

        

        Some external semaphore handle types can only be shared within the same underlying physical device and/or the same driver version, as defined in the following table:

        <h6>External semaphore handle types compatibility</h6>
        <table class="lwjgl">
            <tbody>
                <tr><td>Handle type</td><td>##VkPhysicalDeviceIDPropertiesKHR{@code ::driverUUID}</td><td>##VkPhysicalDeviceIDPropertiesKHR{@code ::deviceUUID}</td></tr>
                <tr><td>#EXTERNAL_SEMAPHORE_HANDLE_TYPE_OPAQUE_FD_BIT_KHR</td><td>Must match</td><td>Must match</td></tr>
                <tr><td>#EXTERNAL_SEMAPHORE_HANDLE_TYPE_OPAQUE_WIN32_BIT_KHR</td><td>Must match</td><td>Must match</td></tr>
                <tr><td>#EXTERNAL_SEMAPHORE_HANDLE_TYPE_OPAQUE_WIN32_KMT_BIT_KHR</td><td>Must match</td><td>Must match</td></tr>
                <tr><td>#EXTERNAL_SEMAPHORE_HANDLE_TYPE_D3D12_FENCE_BIT_KHR</td><td>Must match</td><td>Must match</td></tr>
                <tr><td>#EXTERNAL_SEMAPHORE_HANDLE_TYPE_FENCE_FD_BIT_KHR</td><td>No restriction</td><td>No restriction</td></tr>
            </tbody>
        </table>

        <h5>See Also</h5>
        {@code VkExternalSemaphoreHandleTypeFlagsKHR}, ##VkImportSemaphoreFdInfoKHR, ##VkImportSemaphoreWin32HandleInfoKHR, ##VkPhysicalDeviceExternalSemaphoreInfoKHR, ##VkSemaphoreGetFdInfoKHR, ##VkSemaphoreGetWin32HandleInfoKHR
        """,

        "EXTERNAL_SEMAPHORE_HANDLE_TYPE_OPAQUE_FD_BIT_KHR".enum(0x00000001),
        "EXTERNAL_SEMAPHORE_HANDLE_TYPE_OPAQUE_WIN32_BIT_KHR".enum(0x00000002),
        "EXTERNAL_SEMAPHORE_HANDLE_TYPE_OPAQUE_WIN32_KMT_BIT_KHR".enum(0x00000004),
        "EXTERNAL_SEMAPHORE_HANDLE_TYPE_D3D12_FENCE_BIT_KHR".enum(0x00000008),
        "EXTERNAL_SEMAPHORE_HANDLE_TYPE_SYNC_FD_BIT_KHR".enum(0x00000010)
    )

    EnumConstant(
        """
        VkExternalSemaphoreFeatureFlagBitsKHR - Bitfield describing features of an external semaphore handle type

        <h5>Description</h5>
        <ul>
            <li>#EXTERNAL_SEMAPHORE_FEATURE_EXPORTABLE_BIT_KHR specifies that handles of this type <b>can</b> be exported from Vulkan semaphore objects.</li>
            <li>#EXTERNAL_SEMAPHORE_FEATURE_IMPORTABLE_BIT_KHR specifies that handles of this type <b>can</b> be imported as Vulkan semaphore objects.</li>
        </ul>

        <h5>See Also</h5>
        {@code VkExternalSemaphoreFeatureFlagsKHR}
        """,

        "EXTERNAL_SEMAPHORE_FEATURE_EXPORTABLE_BIT_KHR".enum(0x00000001),
        "EXTERNAL_SEMAPHORE_FEATURE_IMPORTABLE_BIT_KHR".enum(0x00000002)
    )

    void(
        "GetPhysicalDeviceExternalSemaphorePropertiesKHR",
        """
        Function for querying external semaphore handle capabilities.

        <h5>C Specification</h5>
        Semaphores <b>may</b> support import and export of their <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html\#synchronization-semaphores-payloads">payload</a> to external handles. To query the external handle types supported by semaphores, call:

        <code><pre>
￿void vkGetPhysicalDeviceExternalSemaphorePropertiesKHR(
￿    VkPhysicalDevice                            physicalDevice,
￿    const VkPhysicalDeviceExternalSemaphoreInfoKHR* pExternalSemaphoreInfo,
￿    VkExternalSemaphorePropertiesKHR*           pExternalSemaphoreProperties);</pre></code>

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code physicalDevice} <b>must</b> be a valid {@code VkPhysicalDevice} handle</li>
            <li>{@code pExternalSemaphoreInfo} <b>must</b> be a pointer to a valid ##VkPhysicalDeviceExternalSemaphoreInfoKHR structure</li>
            <li>{@code pExternalSemaphoreProperties} <b>must</b> be a pointer to a ##VkExternalSemaphorePropertiesKHR structure</li>
        </ul>

        <h5>See Also</h5>
        ##VkExternalSemaphorePropertiesKHR, ##VkPhysicalDeviceExternalSemaphoreInfoKHR
        """,

        VkPhysicalDevice.IN("physicalDevice", "the physical device from which to query the semaphore capabilities."),
        const..VkPhysicalDeviceExternalSemaphoreInfoKHR.p.IN("pExternalSemaphoreInfo", "points to an instance of the ##VkPhysicalDeviceExternalSemaphoreInfoKHR structure, describing the parameters that would be consumed by #CreateSemaphore()."),
        VkExternalSemaphorePropertiesKHR.p.OUT("pExternalSemaphoreProperties", "points to an instance of the ##VkExternalSemaphorePropertiesKHR structure in which capabilities are returned.")
    )
}