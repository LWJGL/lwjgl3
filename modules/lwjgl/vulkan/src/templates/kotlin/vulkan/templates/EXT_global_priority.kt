/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package vulkan.templates

import org.lwjgl.generator.*
import vulkan.*

val EXT_global_priority = "EXTGlobalPriority".nativeClassVK("EXT_global_priority", type = "device", postfix = EXT) {
    documentation =
        """
        In Vulkan, users can specify device-scope queue priorities. In some cases it may be useful to extend this concept to a system-wide scope. This extension provides a mechanism for caller's to set their system-wide priority. The default queue priority is #QUEUE_GLOBAL_PRIORITY_MEDIUM_EXT.

        The driver implementation will attempt to skew hardware resource allocation in favour of the higher-priority task. Therefore, higher-priority work may retain similar latency and throughput characteristics even if the system is congested with lower priority work.

        The global priority level of a queue shall take predence over the per-process queue priority (##VkDeviceQueueCreateInfo{@code ::pQueuePriorities}).

        Abuse of this feature may result in starving the rest of the system from hardware resources. Therefore, the driver implementation may deny requests to acquire a priority above the default priority (#QUEUE_GLOBAL_PRIORITY_MEDIUM_EXT) if the caller does not have sufficient privileges. In this scenario #ERROR_NOT_PERMITTED_EXT is returned.

        The driver implementation may fail the queue allocation request if resources required to complete the operation have been exhausted (either by the same process or a different process). In this scenario #ERROR_INITIALIZATION_FAILED is returned.

        <dl>
            <dt><b>Name String</b></dt>
            <dd>{@code VK_EXT_global_priority}</dd>

            <dt><b>Extension Type</b></dt>
            <dd>Device extension</dd>

            <dt><b>Registered Extension Number</b></dt>
            <dd>175</dd>

            <dt><b>Revision</b></dt>
            <dd>2</dd>

            <dt><b>Extension and Version Dependencies</b></dt>
            <dd><ul>
                <li>Requires Vulkan 1.0</li>
            </ul></dd>

            <dt><b>Contact</b></dt>
            <dd><ul>
                <li>Andres Rodriguez @lostgoat</li>
            </ul></dd>

            <dt><b>Last Modified Date</b></dt>
            <dd>2017-10-06</dd>

            <dt><b>IP Status</b></dt>
            <dd>No known IP claims.</dd>

            <dt><b>Contributors</b></dt>
            <dd><ul>
                <li>Andres Rodriguez, Valve</li>
                <li>Pierre-Loup Griffais, Valve</li>
                <li>Dan Ginsburg, Valve</li>
                <li>Mitch Singer, AMD</li>
            </ul></dd>
        </dl>
        """

    IntConstant(
        "The extension specification version.",

        "EXT_GLOBAL_PRIORITY_SPEC_VERSION".."2"
    )

    StringConstant(
        "The extension name.",

        "EXT_GLOBAL_PRIORITY_EXTENSION_NAME".."VK_EXT_global_priority"
    )

    EnumConstant(
        "Extends {@code VkStructureType}.",

        "STRUCTURE_TYPE_DEVICE_QUEUE_GLOBAL_PRIORITY_CREATE_INFO_EXT".."1000174000"
    )

    EnumConstant(
        "Extends {@code VkResult}.",

        "ERROR_NOT_PERMITTED_EXT".."-1000174001"
    )

    EnumConstant(
        """
        VkQueueGlobalPriorityEXT - Values specifying a system-wide queue priority

        <h5>Description</h5>
        Priority values are sorted in ascending order. A comparison operation on the enum values can be used to determine the priority order.

        <ul>
            <li>#QUEUE_GLOBAL_PRIORITY_LOW_EXT is below the system default. Useful for non-interactive tasks.</li>
            <li>#QUEUE_GLOBAL_PRIORITY_MEDIUM_EXT is the system default priority.</li>
            <li>#QUEUE_GLOBAL_PRIORITY_HIGH_EXT is above the system default.</li>
            <li>#QUEUE_GLOBAL_PRIORITY_REALTIME_EXT is the highest priority. Useful for critical tasks.</li>
        </ul>

        <h5>See Also</h5>
        ##VkDeviceQueueGlobalPriorityCreateInfoEXT
        """,

        "QUEUE_GLOBAL_PRIORITY_LOW_EXT".."128",
        "QUEUE_GLOBAL_PRIORITY_MEDIUM_EXT".."256",
        "QUEUE_GLOBAL_PRIORITY_HIGH_EXT".."512",
        "QUEUE_GLOBAL_PRIORITY_REALTIME_EXT".."1024"
    )
}