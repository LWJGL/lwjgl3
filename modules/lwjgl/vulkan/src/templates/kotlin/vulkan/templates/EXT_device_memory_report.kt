/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package vulkan.templates

import org.lwjgl.generator.*
import vulkan.*

val EXT_device_memory_report = "EXTDeviceMemoryReport".nativeClassVK("EXT_device_memory_report", type = "device", postfix = "EXT") {
    documentation =
        """
        This device extension allows registration of device memory event callbacks upon device creation, so that applications or middleware can obtain detailed information about memory usage and how memory is associated with Vulkan objects. This extension exposes the actual underlying device memory usage, including allocations that are not normally visible to the application, such as memory consumed by #CreateGraphicsPipelines(). It is intended primarily for use by debug tooling rather than for production applications.

        <h5>VK_EXT_device_memory_report</h5>
        <dl>
            <dt><b>Name String</b></dt>
            <dd>{@code VK_EXT_device_memory_report}</dd>

            <dt><b>Extension Type</b></dt>
            <dd>Device extension</dd>

            <dt><b>Registered Extension Number</b></dt>
            <dd>285</dd>

            <dt><b>Revision</b></dt>
            <dd>2</dd>

            <dt><b>Extension and Version Dependencies</b></dt>
            <dd><ul>
                <li>Requires Vulkan 1.0</li>
                <li>Requires {@link KHRGetPhysicalDeviceProperties2 VK_KHR_get_physical_device_properties2}</li>
            </ul></dd>

            <dt><b>Special Use</b></dt>
            <dd><ul>
                <li><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html\#extendingvulkan-compatibility-specialuse">Developer tools</a></li>
            </ul></dd>

            <dt><b>Contact</b></dt>
            <dd><ul>
                <li>Yiwei Zhang <a target="_blank" href="https://github.com/KhronosGroup/Vulkan-Docs/issues/new?body=[VK_EXT_device_memory_report]%20@zhangyiwei%250A%3C%3CHere%20describe%20the%20issue%20or%20question%20you%20have%20about%20the%20VK_EXT_device_memory_report%20extension%3E%3E">zhangyiwei</a></li>
            </ul></dd>
        </dl>

        <h5>Other Extension Metadata</h5>
        <dl>
            <dt><b>Last Modified Date</b></dt>
            <dd>2021-01-06</dd>

            <dt><b>IP Status</b></dt>
            <dd>No known IP claims.</dd>

            <dt><b>Contributors</b></dt>
            <dd><ul>
                <li>Yiwei Zhang, Google</li>
                <li>Jesse Hall, Google</li>
            </ul></dd>
        </dl>
        """

    IntConstant(
        "The extension specification version.",

        "EXT_DEVICE_MEMORY_REPORT_SPEC_VERSION".."2"
    )

    StringConstant(
        "The extension name.",

        "EXT_DEVICE_MEMORY_REPORT_EXTENSION_NAME".."VK_EXT_device_memory_report"
    )

    EnumConstant(
        "Extends {@code VkStructureType}.",

        "STRUCTURE_TYPE_PHYSICAL_DEVICE_DEVICE_MEMORY_REPORT_FEATURES_EXT".."1000284000",
        "STRUCTURE_TYPE_DEVICE_DEVICE_MEMORY_REPORT_CREATE_INFO_EXT".."1000284001",
        "STRUCTURE_TYPE_DEVICE_MEMORY_REPORT_CALLBACK_DATA_EXT".."1000284002"
    )

    EnumConstant(
        """
        VkDeviceMemoryReportEventTypeEXT - Events that can occur on a device memory object

        <h5>Description</h5>
        <ul>
            <li>#DEVICE_MEMORY_REPORT_EVENT_TYPE_ALLOCATE_EXT specifies this event corresponds to the allocation of an internal device memory object or a {@code VkDeviceMemory}.</li>
            <li>#DEVICE_MEMORY_REPORT_EVENT_TYPE_FREE_EXT specifies this event corresponds to the deallocation of an internally-allocated device memory object or a {@code VkDeviceMemory}.</li>
            <li>#DEVICE_MEMORY_REPORT_EVENT_TYPE_IMPORT_EXT specifies this event corresponds to the import of an external memory object.</li>
            <li>#DEVICE_MEMORY_REPORT_EVENT_TYPE_UNIMPORT_EXT specifies this event is the release of an imported external memory object.</li>
            <li>#DEVICE_MEMORY_REPORT_EVENT_TYPE_ALLOCATION_FAILED_EXT specifies this event corresponds to the failed allocation of an internal device memory object or a {@code VkDeviceMemory}.</li>
        </ul>

        <h5>See Also</h5>
        ##VkDeviceMemoryReportCallbackDataEXT
        """,

        "DEVICE_MEMORY_REPORT_EVENT_TYPE_ALLOCATE_EXT".."0",
        "DEVICE_MEMORY_REPORT_EVENT_TYPE_FREE_EXT".."1",
        "DEVICE_MEMORY_REPORT_EVENT_TYPE_IMPORT_EXT".."2",
        "DEVICE_MEMORY_REPORT_EVENT_TYPE_UNIMPORT_EXT".."3",
        "DEVICE_MEMORY_REPORT_EVENT_TYPE_ALLOCATION_FAILED_EXT".."4"
    )
}