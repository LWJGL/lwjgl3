/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package vulkan.templates

import org.lwjgl.generator.*
import vulkan.*

val KHR_external_semaphore_capabilities = "KHRExternalSemaphoreCapabilities".nativeClassVK("KHR_external_semaphore_capabilities", type = "instance", postfix = KHR) {
    documentation =
        """
        An application may wish to reference device semaphores in multiple Vulkan logical devices or instances, in multiple processes, and/or in multiple APIs. This extension provides a set of capability queries and handle definitions that allow an application to determine what types of "{@code external}" semaphore handles an implementation supports for a given set of use cases.

        <h5>Promotion to Vulkan 1.1</h5>
        All functionality in this extension is included in core Vulkan 1.1, with the KHR suffix omitted. The original type, enum and command names are still available as aliases of the core functionality.

        <h5>VK_KHR_external_semaphore_capabilities</h5>
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
                <li>Requires {@link KHRGetPhysicalDeviceProperties2 VK_KHR_get_physical_device_properties2}</li>
            </ul></dd>

            <dt><b>Deprecation state</b></dt>
            <dd><ul>
                <li><em>Promoted</em> to <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#versions-1.1-promotions">Vulkan 1.1</a></li>
            </ul></dd>

            <dt><b>Contact</b></dt>
            <dd><ul>
                <li>James Jones <a target="_blank" href="https://github.com/KhronosGroup/Vulkan-Docs/issues/new?title=VK_KHR_external_semaphore_capabilities:%20&amp;body=@cubanismo%20">cubanismo</a></li>
            </ul></dd>
        </dl>

        <h5>Other Extension Metadata</h5>
        <dl>
            <dt><b>Last Modified Date</b></dt>
            <dd>2016-10-20</dd>

            <dt><b>IP Status</b></dt>
            <dd>No known IP claims.</dd>

            <dt><b>Interactions and External Dependencies</b></dt>
            <dd><ul>
                <li>Promoted to Vulkan 1.1 Core</li>
            </ul></dd>

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
        "STRUCTURE_TYPE_EXTERNAL_SEMAPHORE_PROPERTIES_KHR".."1000076001",
        "STRUCTURE_TYPE_PHYSICAL_DEVICE_ID_PROPERTIES_KHR".."1000071004"
    )

    EnumConstant(
        "VK_LUID_SIZE_KHR",

        "LUID_SIZE_KHR".."8"
    )

    EnumConstant(
        "Extends {@code VkExternalSemaphoreHandleTypeFlagBits}.",

        "EXTERNAL_SEMAPHORE_HANDLE_TYPE_OPAQUE_FD_BIT_KHR".enum(0x00000001),
        "EXTERNAL_SEMAPHORE_HANDLE_TYPE_OPAQUE_WIN32_BIT_KHR".enum(0x00000002),
        "EXTERNAL_SEMAPHORE_HANDLE_TYPE_OPAQUE_WIN32_KMT_BIT_KHR".enum(0x00000004),
        "EXTERNAL_SEMAPHORE_HANDLE_TYPE_D3D12_FENCE_BIT_KHR".enum(0x00000008),
        "EXTERNAL_SEMAPHORE_HANDLE_TYPE_SYNC_FD_BIT_KHR".enum(0x00000010)
    )

    EnumConstant(
        "Extends {@code VkExternalSemaphoreFeatureFlagBits}.",

        "EXTERNAL_SEMAPHORE_FEATURE_EXPORTABLE_BIT_KHR".enum(0x00000001),
        "EXTERNAL_SEMAPHORE_FEATURE_IMPORTABLE_BIT_KHR".enum(0x00000002)
    )

    void(
        "GetPhysicalDeviceExternalSemaphorePropertiesKHR",
        "See #GetPhysicalDeviceExternalSemaphoreProperties().",

        VkPhysicalDevice("physicalDevice", "the physical device from which to query the semaphore capabilities."),
        VkPhysicalDeviceExternalSemaphoreInfo.const.p("pExternalSemaphoreInfo", "a pointer to a ##VkPhysicalDeviceExternalSemaphoreInfo structure describing the parameters that would be consumed by #CreateSemaphore()."),
        VkExternalSemaphoreProperties.p("pExternalSemaphoreProperties", "a pointer to a ##VkExternalSemaphoreProperties structure in which capabilities are returned.")
    )
}