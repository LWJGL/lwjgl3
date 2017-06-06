/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.vulkan.templates

import org.lwjgl.generator.*
import org.lwjgl.vulkan.*

val KHX_external_memory_capabilities = "KHXExternalMemoryCapabilities".nativeClassVK("KHX_external_memory_capabilities", type = "instance", postfix = KHX) {
    documentation =
        """
        An application may wish to reference device memory in multiple Vulkan logical devices or instances, in multiple processes, and/or in multiple APIs. This extension provides a set of capability queries and handle definitions that allow an application to determine what types of "{@code external}" memory handles an implementation supports for a given set of use cases.

        <dl>
            <dt><b>Name String</b></dt>
            <dd>VK_KHX_external_memory_capabilities</dd>

            <dt><b>Extension Type</b></dt>
            <dd>Instance extension</dd>

            <dt><b>Registered Extension Number</b></dt>
            <dd>72</dd>

            <dt><b>Status</b></dt>
            <dd>Draft</dd>

            <dt><b>Last Modified Date</b></dt>
            <dd>2016-10-17</dd>

            <dt><b>Revision</b></dt>
            <dd>1</dd>

            <dt><b>IP Status</b></dt>
            <dd>No known IP claims.</dd>

            <dt><b>Dependencies</b></dt>
            <dd><ul>
                <li>This extension is written against version 1.0 of the Vulkan API.</li>
                <li>Requires VK_KHR_get_physical_device_properties2.</li>
                <li>Interacts with VK_NV_dedicated_allocation.</li>
            </ul></dd>

            <dt><b>Contributors</b></dt>
            <dd><ul>
                <li>Ian Elliot, Google</li>
                <li>Jesse Hall, Google</li>
                <li>James Jones, NVIDIA</li>
            </ul></dd>

            <dt><b>Contact</b></dt>
            <dd>James Jones (jajones 'at' nvidia.com)</dd>
        </dl>
        """

    IntConstant(
        "The extension specification version.",

        "KHX_EXTERNAL_MEMORY_CAPABILITIES_SPEC_VERSION".."1"
    )

    StringConstant(
        "The extension name.",

        "KHX_EXTERNAL_MEMORY_CAPABILITIES_EXTENSION_NAME".."VK_KHX_external_memory_capabilities"
    )

    EnumConstant(
        "Extends {@code VkStructureType}.",

        "STRUCTURE_TYPE_PHYSICAL_DEVICE_EXTERNAL_IMAGE_FORMAT_INFO_KHX".."1000071000",
        "STRUCTURE_TYPE_EXTERNAL_IMAGE_FORMAT_PROPERTIES_KHX".."1000071001",
        "STRUCTURE_TYPE_PHYSICAL_DEVICE_EXTERNAL_BUFFER_INFO_KHX".."1000071002",
        "STRUCTURE_TYPE_EXTERNAL_BUFFER_PROPERTIES_KHX".."1000071003",
        "STRUCTURE_TYPE_PHYSICAL_DEVICE_ID_PROPERTIES_KHX".."1000071004"
    )

    EnumConstant(
        "VK_LUID_SIZE_KHX",

        "LUID_SIZE_KHX".."8"
    )

    EnumConstant(
        """
        VkExternalMemoryHandleTypeFlagBitsKHX - Bit specifying external memory handle types

        <h5>Description</h5>
        <ul>
            <li>#EXTERNAL_MEMORY_HANDLE_TYPE_OPAQUE_FD_BIT_KHX specifies a POSIX file descriptor handle that has only limited valid usage outside of Vulkan and other compatible APIs. It <b>must</b> be compatible with the POSIX system calls ftext:dup, ftext:dup2, ftext:close, and the non-standard system call ftext:dup3. Additionally, it <b>must</b> be transportable over a socket using an {@code SCM_RIGHTS} control message. It owns a reference to the underlying memory resource represented by its Vulkan memory object.</li>
            <li>#EXTERNAL_MEMORY_HANDLE_TYPE_OPAQUE_WIN32_BIT_KHX specifies an NT handle that has only limited valid usage outside of Vulkan and other compatible APIs. It <b>must</b> be compatible with the functions ftext:DuplicateHandle, ftext:CloseHandle, ftext:CompareObjectHandles, ftext:GetHandleInformation, and ftext:SetHandleInformation. It owns a reference to the underlying memory resource represented by its Vulkan memory object.</li>
            <li>#EXTERNAL_MEMORY_HANDLE_TYPE_OPAQUE_WIN32_KMT_BIT_KHX specifies a global share handle that has only limited valid usage outside of Vulkan and other compatible APIs. It is not compatible with any native APIs. It does not own a reference to the underlying memory resource represented its Vulkan memory object, and will therefore become invalid when all Vulkan memory objects associated with it are destroyed.</li>
            <li>#EXTERNAL_MEMORY_HANDLE_TYPE_D3D11_TEXTURE_BIT_KHX specifies an NT handle returned by {@code IDXGIResource1}::{@code CreateSharedHandle} referring to a Direct3D 10 or 11 texture resource. It owns a reference to the memory used by the Direct3D resource.</li>
            <li>#EXTERNAL_MEMORY_HANDLE_TYPE_D3D11_TEXTURE_KMT_BIT_KHX specifies a global share handle returned by {@code IDXGIResource}::{@code GetSharedHandle} referring to a Direct3D 10 or 11 texture resource. It does not own a reference to the underlying Direct3D resource, and will therefore become invalid when all Vulkan memory objects and Direct3D resources associated with it are destroyed.</li>
            <li>#EXTERNAL_MEMORY_HANDLE_TYPE_D3D12_HEAP_BIT_KHX specifies an NT handle returned by {@code ID3D12Device}::{@code CreateSharedHandle} referring to a Direct3D 12 heap resource. It owns a reference to the resources used by the Direct3D heap.</li>
            <li>#EXTERNAL_MEMORY_HANDLE_TYPE_D3D12_RESOURCE_BIT_KHX specifies an NT handle returned by {@code ID3D12Device}::{@code CreateSharedHandle} referring to a Direct3D 12 committed resource. It owns a reference to the memory used by the Direct3D resource.</li>
        </ul>

        <h5>See Also</h5>
        {@code VkExternalMemoryHandleTypeFlagsKHX}, ##VkImportMemoryFdInfoKHX, ##VkImportMemoryWin32HandleInfoKHX, ##VkPhysicalDeviceExternalBufferInfoKHX, ##VkPhysicalDeviceExternalImageFormatInfoKHX, #GetMemoryFdKHX(), #GetMemoryFdPropertiesKHX(), #GetMemoryWin32HandleKHX(), #GetMemoryWin32HandlePropertiesKHX()
        """,

        "EXTERNAL_MEMORY_HANDLE_TYPE_OPAQUE_FD_BIT_KHX".enum(0x00000001),
        "EXTERNAL_MEMORY_HANDLE_TYPE_OPAQUE_WIN32_BIT_KHX".enum(0x00000002),
        "EXTERNAL_MEMORY_HANDLE_TYPE_OPAQUE_WIN32_KMT_BIT_KHX".enum(0x00000004),
        "EXTERNAL_MEMORY_HANDLE_TYPE_D3D11_TEXTURE_BIT_KHX".enum(0x00000008),
        "EXTERNAL_MEMORY_HANDLE_TYPE_D3D11_TEXTURE_KMT_BIT_KHX".enum(0x00000010),
        "EXTERNAL_MEMORY_HANDLE_TYPE_D3D12_HEAP_BIT_KHX".enum(0x00000020),
        "EXTERNAL_MEMORY_HANDLE_TYPE_D3D12_RESOURCE_BIT_KHX".enum(0x00000040)
    )

    EnumConstant(
        """
        VkExternalMemoryFeatureFlagBitsKHX - Bitmask specifying features of an external memory handle type

        <h5>Description</h5>
        <ul>
            <li>#EXTERNAL_MEMORY_FEATURE_DEDICATED_ONLY_BIT_KHX specifies that images or buffers created with the specified parameters and handle type <b>must</b> use the mechanisms defined in the VK_NV_dedicated_allocation extension to create (or import) a dedicated allocation for the image or buffer.</li>
            <li>#EXTERNAL_MEMORY_FEATURE_EXPORTABLE_BIT_KHX specifies that handles of this type <b>can</b> be exported from Vulkan memory objects.</li>
            <li>#INTERNAL_MEMORY_FEATURE_IMPORTABLE_BIT_KHX specifies that handles of this type <b>can</b> be imported as Vulkan memory objects.</li>
        </ul>

        Because their semantics in external APIs roughly align with that of an image or buffer with a dedicated allocation in Vulkan, implementations are required: to report #EXTERNAL_MEMORY_FEATURE_DEDICATED_ONLY_BIT_KHX for the following external handle types:

        <ul>
            <li>#EXTERNAL_MEMORY_HANDLE_TYPE_D3D11_TEXTURE_BIT_KHX</li>
            <li>#EXTERNAL_MEMORY_HANDLE_TYPE_D3D11_TEXTURE_KMT_BIT_KHX</li>
            <li>#EXTERNAL_MEMORY_HANDLE_TYPE_D3D12_RESOURCE_BIT_KHX</li>
        </ul>

        <h5>See Also</h5>
        {@code VkExternalMemoryFeatureFlagsKHX}
        """,

        "EXTERNAL_MEMORY_FEATURE_DEDICATED_ONLY_BIT_KHX".enum(0x00000001),
        "EXTERNAL_MEMORY_FEATURE_EXPORTABLE_BIT_KHX".enum(0x00000002),
        "EXTERNAL_MEMORY_FEATURE_IMPORTABLE_BIT_KHX".enum(0x00000004)
    )

    void(
        "GetPhysicalDeviceExternalBufferPropertiesKHX",
        """
        Query external handle types supported by buffers.

        <h5>C Specification</h5>
        To query the external handle types supported by buffers, call:

        <code><pre>
￿void vkGetPhysicalDeviceExternalBufferPropertiesKHX(
￿    VkPhysicalDevice                            physicalDevice,
￿    const VkPhysicalDeviceExternalBufferInfoKHX* pExternalBufferInfo,
￿    VkExternalBufferPropertiesKHX*              pExternalBufferProperties);</pre></code>

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code physicalDevice} <b>must</b> be a valid {@code VkPhysicalDevice} handle</li>
            <li>{@code pExternalBufferInfo} <b>must</b> be a pointer to a valid ##VkPhysicalDeviceExternalBufferInfoKHX structure</li>
            <li>{@code pExternalBufferProperties} <b>must</b> be a pointer to a ##VkExternalBufferPropertiesKHX structure</li>
        </ul>

        <h5>See Also</h5>
        ##VkExternalBufferPropertiesKHX, ##VkPhysicalDeviceExternalBufferInfoKHX
        """,

        VkPhysicalDevice.IN("physicalDevice", "the physical device from which to query the buffer capabilities."),
        const..VkPhysicalDeviceExternalBufferInfoKHX.p.IN("pExternalBufferInfo", "points to an instance of the ##VkPhysicalDeviceExternalBufferInfoKHX structure, describing the parameters that would be consumed by #CreateBuffer()."),
        VkExternalBufferPropertiesKHX.p.OUT("pExternalBufferProperties", "points to an instance of the ##VkExternalBufferPropertiesKHX structure in which capabilities are returned.")
    )
}