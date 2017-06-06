/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.vulkan.templates

import org.lwjgl.generator.*
import org.lwjgl.vulkan.*

val NV_external_memory_capabilities = "NVExternalMemoryCapabilities".nativeClassVK("NV_external_memory_capabilities", type = "instance", postfix = NV) {
    documentation =
        """
        Applications may wish to import memory from the Direct 3D API, or export memory to other Vulkan instances. This extension provides a set of capability queries that allow applications determine what types of win32 memory handles an implementation supports for a given set of use cases.

        <dl>
            <dt><b>Name String</b></dt>
            <dd>VK_NV_external_memory_capabilities</dd>

            <dt><b>Extension Type</b></dt>
            <dd>Instance extension</dd>

            <dt><b>Registered Extension Number</b></dt>
            <dd>56</dd>

            <dt><b>Status</b></dt>
            <dd>Complete</dd>

            <dt><b>Last Modified Date</b></dt>
            <dd>2016-08-19</dd>

            <dt><b>Revision</b></dt>
            <dd>1</dd>

            <dt><b>IP Status</b></dt>
            <dd>No known IP claims.</dd>

            <dt><b>Dependencies</b></dt>
            <dd><ul>
                <li>This extension is written against version 1.0 of the Vulkan API.</li>
                <li>Interacts with VK_NV_dedicated_allocation.</li>
            </ul></dd>

            <dt><b>Contributors</b></dt>
            <dd><ul>
                <li>James Jones, NVIDIA</li>
            </ul></dd>

            <dt><b>Contact</b></dt>
            <dd>James Jones (jajones 'at' nvidia.com)</dd>
        </dl>
        """

    IntConstant(
        "The extension specification version.",

        "NV_EXTERNAL_MEMORY_CAPABILITIES_SPEC_VERSION".."1"
    )

    StringConstant(
        "The extension name.",

        "NV_EXTERNAL_MEMORY_CAPABILITIES_EXTENSION_NAME".."VK_NV_external_memory_capabilities"
    )

    EnumConstant(
        """
        VkExternalMemoryHandleTypeFlagBitsNV - Bitmask specifying external memory handle types

        <h5>Description</h5>
        <ul>
            <li>#EXTERNAL_MEMORY_HANDLE_TYPE_OPAQUE_WIN32_KMT_BIT_NV indicates a handle to memory returned by #GetMemoryWin32HandleNV().</li>
            <li>#EXTERNAL_MEMORY_HANDLE_TYPE_OPAQUE_WIN32_BIT_NV indicates a handle to memory returned by #GetMemoryWin32HandleNV(), or one duplicated from such a handle using {@code DuplicateHandle()}.</li>
            <li>#EXTERNAL_MEMORY_HANDLE_TYPE_D3D11_IMAGE_BIT_NV indicates a valid NT handle to memory returned by {@code IDXGIResource1::ftext:CreateSharedHandle()}, or a handle duplicated from such a handle using {@code DuplicateHandle()}.</li>
            <li>#EXTERNAL_MEMORY_HANDLE_TYPE_D3D11_IMAGE_KMT_BIT_NV indicates a handle to memory returned by {@code IDXGIResource::GetSharedHandle()}.</li>
        </ul>

        <h5>See Also</h5>
        {@code VkExternalMemoryHandleTypeFlagsNV}
        """,

        "EXTERNAL_MEMORY_HANDLE_TYPE_OPAQUE_WIN32_BIT_NV".enum(0x00000001),
        "EXTERNAL_MEMORY_HANDLE_TYPE_OPAQUE_WIN32_KMT_BIT_NV".enum(0x00000002),
        "EXTERNAL_MEMORY_HANDLE_TYPE_D3D11_IMAGE_BIT_NV".enum(0x00000004),
        "EXTERNAL_MEMORY_HANDLE_TYPE_D3D11_IMAGE_KMT_BIT_NV".enum(0x00000008)
    )

    EnumConstant(
        """
        VkExternalMemoryFeatureFlagBitsNV - Bitmask specifying external memory features

        <h5>Description</h5>
        <ul>
            <li>#EXTERNAL_MEMORY_FEATURE_DEDICATED_ONLY_BIT_NV indicates that external memory of the specified type <b>must</b> be created as a dedicated allocation when used in the manner specified.</li>
            <li>#EXTERNAL_MEMORY_FEATURE_EXPORTABLE_BIT_NV indicates that the implementation supports exporting handles of the specified type.</li>
            <li>#EXTERNAL_MEMORY_FEATURE_IMPORTABLE_BIT_NV indicates that the implementation supports importing handles of the specified type.</li>
        </ul>

        <h5>See Also</h5>
        ##VkExternalImageFormatPropertiesNV, {@code VkExternalMemoryFeatureFlagsNV}, #GetPhysicalDeviceExternalImageFormatPropertiesNV()
        """,

        "EXTERNAL_MEMORY_FEATURE_DEDICATED_ONLY_BIT_NV".enum(0x00000001),
        "EXTERNAL_MEMORY_FEATURE_EXPORTABLE_BIT_NV".enum(0x00000002),
        "EXTERNAL_MEMORY_FEATURE_IMPORTABLE_BIT_NV".enum(0x00000004)
    )

    VkResult(
        "GetPhysicalDeviceExternalImageFormatPropertiesNV",
        """
        determine image capabilities compatible with external memory handle types.

        <h5>C Specification</h5>
        To determine the image capabilities compatible with an external memory handle type, call:

        <code><pre>
￿VkResult vkGetPhysicalDeviceExternalImageFormatPropertiesNV(
￿    VkPhysicalDevice                            physicalDevice,
￿    VkFormat                                    format,
￿    VkImageType                                 type,
￿    VkImageTiling                               tiling,
￿    VkImageUsageFlags                           usage,
￿    VkImageCreateFlags                          flags,
￿    VkExternalMemoryHandleTypeFlagsNV           externalHandleType,
￿    VkExternalImageFormatPropertiesNV*          pExternalImageFormatProperties);</pre></code>

        <h5>Description</h5>
        If {@code externalHandleType} is 0, {@code pExternalImageFormatProperties}::imageFormatProperties will return the same values as a call to #GetPhysicalDeviceImageFormatProperties(), and the other members of {@code pExternalImageFormatProperties} will all be 0. Otherwise, they are filled in as described for ##VkExternalImageFormatPropertiesNV.

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code physicalDevice} <b>must</b> be a valid {@code VkPhysicalDevice} handle</li>
            <li>{@code format} <b>must</b> be a valid {@code VkFormat} value</li>
            <li>{@code type} <b>must</b> be a valid {@code VkImageType} value</li>
            <li>{@code tiling} <b>must</b> be a valid {@code VkImageTiling} value</li>
            <li>{@code usage} <b>must</b> be a valid combination of {@code VkImageUsageFlagBits} values</li>
            <li>{@code usage} <b>must</b> not be 0</li>
            <li>{@code flags} <b>must</b> be a valid combination of {@code VkImageCreateFlagBits} values</li>
            <li>{@code externalHandleType} <b>must</b> be a valid combination of {@code VkExternalMemoryHandleTypeFlagBitsNV} values</li>
            <li>{@code pExternalImageFormatProperties} <b>must</b> be a pointer to a ##VkExternalImageFormatPropertiesNV structure</li>
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
                <li>#ERROR_OUT_OF_DEVICE_MEMORY</li>
                <li>#ERROR_FORMAT_NOT_SUPPORTED</li>
            </ul></dd>
        </dl>

        <h5>See Also</h5>
        ##VkExternalImageFormatPropertiesNV
        """,

        VkPhysicalDevice.IN("physicalDevice", "the physical device from which to query the image capabilities"),
        VkFormat.IN("format", "the image format, corresponding to ##VkImageCreateInfo{@code ::format}."),
        VkImageType.IN("type", "the image type, corresponding to ##VkImageCreateInfo{@code ::imageType}."),
        VkImageTiling.IN("tiling", "the image tiling, corresponding to ##VkImageCreateInfo{@code ::tiling}."),
        VkImageUsageFlags.IN("usage", "the intended usage of the image, corresponding to ##VkImageCreateInfo{@code ::usage}."),
        VkImageCreateFlags.IN("flags", "a bitmask describing additional parameters of the image, corresponding to ##VkImageCreateInfo{@code ::flags}."),
        VkExternalMemoryHandleTypeFlagsNV.IN("externalHandleType", "either one of the bits from {@code VkExternalMemoryHandleTypeFlagBitsNV}, or 0."),
        VkExternalImageFormatPropertiesNV.p.OUT("pExternalImageFormatProperties", "points to an instance of the ##VkExternalImageFormatPropertiesNV structure in which capabilities are returned.")
    )
}