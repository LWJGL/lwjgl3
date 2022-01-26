/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package vulkan.templates

import org.lwjgl.generator.*
import vulkan.*

val KHR_global_priority = "KHRGlobalPriority".nativeClassVK("KHR_global_priority", type = "device", postfix = "KHR") {
    documentation =
        """
        In Vulkan, users can specify device-scope queue priorities. In some cases it may be useful to extend this concept to a system-wide scope. This device extension allows applications to query the global queue priorities supported by a queue family, and then set a priority when creating queues. The default queue priority is #QUEUE_GLOBAL_PRIORITY_MEDIUM_EXT.

        Implementations can report which global priority levels are treated differently by the implementation. It is intended primarily for use in system integration along with certain platform-specific priority enforcement rules.

        The driver implementation will attempt to skew hardware resource allocation in favour of the higher-priority task. Therefore, higher-priority work may retain similar latency and throughput characteristics even if the system is congested with lower priority work.

        The global priority level of a queue shall take precedence over the per-process queue priority (##VkDeviceQueueCreateInfo{@code ::pQueuePriorities}).

        Abuse of this feature may result in starving the rest of the system from hardware resources. Therefore, the driver implementation may deny requests to acquire a priority above the default priority (#QUEUE_GLOBAL_PRIORITY_MEDIUM_EXT) if the caller does not have sufficient privileges. In this scenario #ERROR_NOT_PERMITTED_EXT is returned.

        The driver implementation may fail the queue allocation request if resources required to complete the operation have been exhausted (either by the same process or a different process). In this scenario #ERROR_INITIALIZATION_FAILED is returned.

        <h5>VK_KHR_global_priority</h5>
        <dl>
            <dt><b>Name String</b></dt>
            <dd>{@code VK_KHR_global_priority}</dd>

            <dt><b>Extension Type</b></dt>
            <dd>Device extension</dd>

            <dt><b>Registered Extension Number</b></dt>
            <dd>189</dd>

            <dt><b>Revision</b></dt>
            <dd>1</dd>

            <dt><b>Extension and Version Dependencies</b></dt>
            <dd><ul>
                <li>Requires Vulkan 1.0</li>
            </ul></dd>

            <dt><b>Contact</b></dt>
            <dd><ul>
                <li>Tobias Hector <a target="_blank" href="https://github.com/KhronosGroup/Vulkan-Docs/issues/new?body=[VK_KHR_global_priority]%20@tobski%250A%3C%3CHere%20describe%20the%20issue%20or%20question%20you%20have%20about%20the%20VK_KHR_global_priority%20extension%3E%3E">tobski</a></li>
            </ul></dd>
        </dl>

        <h5>Other Extension Metadata</h5>
        <dl>
            <dt><b>Last Modified Date</b></dt>
            <dd>2021-10-22</dd>

            <dt><b>Contributors</b></dt>
            <dd><ul>
                <li>Tobias Hector, AMD</li>
                <li>Contributors to {@link EXTGlobalPriority VK_EXT_global_priority}</li>
                <li>Contributors to {@link EXTGlobalPriorityQuery VK_EXT_global_priority_query}</li>
            </ul></dd>
        </dl>
        """

    IntConstant(
        "The extension specification version.",

        "KHR_GLOBAL_PRIORITY_SPEC_VERSION".."1"
    )

    StringConstant(
        "The extension name.",

        "KHR_GLOBAL_PRIORITY_EXTENSION_NAME".."VK_KHR_global_priority"
    )

    EnumConstant(
        "Extends {@code VkStructureType}.",

        "STRUCTURE_TYPE_DEVICE_QUEUE_GLOBAL_PRIORITY_CREATE_INFO_KHR".."1000174000",
        "STRUCTURE_TYPE_PHYSICAL_DEVICE_GLOBAL_PRIORITY_QUERY_FEATURES_KHR".."1000388000",
        "STRUCTURE_TYPE_QUEUE_FAMILY_GLOBAL_PRIORITY_PROPERTIES_KHR".."1000388001"
    )

    EnumConstant(
        "Extends {@code VkResult}.",

        "ERROR_NOT_PERMITTED_KHR".."-1000174001"
    )

    EnumConstant(
        "VK_MAX_GLOBAL_PRIORITY_SIZE_KHR",

        "MAX_GLOBAL_PRIORITY_SIZE_KHR".."16"
    )
}