/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package vulkan.templates

import org.lwjgl.generator.*
import vulkan.*

val KHR_timeline_semaphore = "KHRTimelineSemaphore".nativeClassVK("KHR_timeline_semaphore", type = "device", postfix = "KHR") {
    documentation =
        """
        This extension introduces a new type of semaphore that has an integer payload identifying a point in a timeline. Such timeline semaphores support the following operations:

        <ul>
            <li>Host query - A host operation that allows querying the payload of the timeline semaphore.</li>
            <li>Host wait - A host operation that allows a blocking wait for a timeline semaphore to reach a specified value.</li>
            <li>Host signal - A host operation that allows advancing the timeline semaphore to a specified value.</li>
            <li>Device wait - A device operation that allows waiting for a timeline semaphore to reach a specified value.</li>
            <li>Device signal - A device operation that allows advancing the timeline semaphore to a specified value.</li>
        </ul>

        <h5>Promotion to Vulkan 1.2</h5>
        All functionality in this extension is included in core Vulkan 1.2, with the KHR suffix omitted. The original type, enum and command names are still available as aliases of the core functionality.

        <h5>VK_KHR_timeline_semaphore</h5>
        <dl>
            <dt><b>Name String</b></dt>
            <dd>{@code VK_KHR_timeline_semaphore}</dd>

            <dt><b>Extension Type</b></dt>
            <dd>Device extension</dd>

            <dt><b>Registered Extension Number</b></dt>
            <dd>208</dd>

            <dt><b>Revision</b></dt>
            <dd>2</dd>

            <dt><b>Extension and Version Dependencies</b></dt>
            <dd><ul>
                <li>Requires Vulkan 1.0</li>
                <li>Requires {@link KHRGetPhysicalDeviceProperties2 VK_KHR_get_physical_device_properties2}</li>
            </ul></dd>

            <dt><b>Deprecation state</b></dt>
            <dd><ul>
                <li><em>Promoted</em> to <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html\#versions-1.2-promotions">Vulkan 1.2</a></li>
            </ul></dd>

            <dt><b>Contact</b></dt>
            <dd><ul>
                <li>Jason Ekstrand <a target="_blank" href="https://github.com/KhronosGroup/Vulkan-Docs/issues/new?body=[VK_KHR_timeline_semaphore]%20@jekstrand%250A%3C%3CHere%20describe%20the%20issue%20or%20question%20you%20have%20about%20the%20VK_KHR_timeline_semaphore%20extension%3E%3E">jekstrand</a></li>
            </ul></dd>
        </dl>

        <h5>Other Extension Metadata</h5>
        <dl>
            <dt><b>Last Modified Date</b></dt>
            <dd>2019-06-12</dd>

            <dt><b>IP Status</b></dt>
            <dd>No known IP claims.</dd>

            <dt><b>Interactions and External Dependencies</b></dt>
            <dd><ul>
                <li>This extension interacts with {@link KHRExternalSemaphoreCapabilities VK_KHR_external_semaphore_capabilities}</li>
                <li>This extension interacts with {@link KHRExternalSemaphore VK_KHR_external_semaphore}</li>
                <li>This extension interacts with {@link KHRExternalSemaphoreWin32 VK_KHR_external_semaphore_win32}</li>
                <li>Promoted to Vulkan 1.2 Core</li>
            </ul></dd>

            <dt><b>Contributors</b></dt>
            <dd><ul>
                <li>Jeff Bolz, NVIDIA</li>
                <li>Yuriy O’Donnell, Epic Games</li>
                <li>Jason Ekstrand, Intel</li>
                <li>Jesse Hall, Google</li>
                <li>James Jones, NVIDIA</li>
                <li>Jeff Juliano, NVIDIA</li>
                <li>Daniel Rakos, AMD</li>
                <li>Ray Smith, Arm</li>
            </ul></dd>
        </dl>
        """

    IntConstant(
        "The extension specification version.",

        "KHR_TIMELINE_SEMAPHORE_SPEC_VERSION".."2"
    )

    StringConstant(
        "The extension name.",

        "KHR_TIMELINE_SEMAPHORE_EXTENSION_NAME".."VK_KHR_timeline_semaphore"
    )

    EnumConstant(
        "Extends {@code VkStructureType}.",

        "STRUCTURE_TYPE_PHYSICAL_DEVICE_TIMELINE_SEMAPHORE_FEATURES_KHR".."1000207000",
        "STRUCTURE_TYPE_PHYSICAL_DEVICE_TIMELINE_SEMAPHORE_PROPERTIES_KHR".."1000207001",
        "STRUCTURE_TYPE_SEMAPHORE_TYPE_CREATE_INFO_KHR".."1000207002",
        "STRUCTURE_TYPE_TIMELINE_SEMAPHORE_SUBMIT_INFO_KHR".."1000207003",
        "STRUCTURE_TYPE_SEMAPHORE_WAIT_INFO_KHR".."1000207004",
        "STRUCTURE_TYPE_SEMAPHORE_SIGNAL_INFO_KHR".."1000207005"
    )

    EnumConstant(
        "Extends {@code VkSemaphoreType}.",

        "SEMAPHORE_TYPE_BINARY_KHR".."0",
        "SEMAPHORE_TYPE_TIMELINE_KHR".."1"
    )

    EnumConstant(
        "Extends {@code VkSemaphoreWaitFlagBits}.",

        "SEMAPHORE_WAIT_ANY_BIT_KHR".enum(0x00000001)
    )

    VkResult(
        "GetSemaphoreCounterValueKHR",
        "See #GetSemaphoreCounterValue().",

        VkDevice("device", "the logical device that owns the semaphore."),
        VkSemaphore("semaphore", "the handle of the semaphore to query."),
        Check(1)..uint64_t.p("pValue", "a pointer to a 64-bit integer value in which the current counter value of the semaphore is returned.")
    )

    VkResult(
        "WaitSemaphoresKHR",
        "See #WaitSemaphores().",

        VkDevice("device", "the logical device that owns the semaphores."),
        VkSemaphoreWaitInfo.const.p("pWaitInfo", "a pointer to a ##VkSemaphoreWaitInfo structure containing information about the wait condition."),
        uint64_t("timeout", "the timeout period in units of nanoseconds. {@code timeout} is adjusted to the closest value allowed by the implementation-dependent timeout accuracy, which <b>may</b> be substantially longer than one nanosecond, and <b>may</b> be longer than the requested period.")
    )

    VkResult(
        "SignalSemaphoreKHR",
        "See #SignalSemaphore().",

        VkDevice("device", "the logical device that owns the semaphore."),
        VkSemaphoreSignalInfo.const.p("pSignalInfo", "a pointer to a ##VkSemaphoreSignalInfo structure containing information about the signal operation.")
    )
}