/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package vulkan.templates

import org.lwjgl.generator.*
import vulkan.*

val KHR_timeline_semaphore = "KHRTimelineSemaphore".nativeClassVK("KHR_timeline_semaphore", type = "device", postfix = KHR) {
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

            <dt><b>Contact</b></dt>
            <dd><ul>
                <li>Jason Ekstrand <a target="_blank" href="https://github.com/KhronosGroup/Vulkan-Docs/issues/new?title=VK_KHR_timeline_semaphore:%20&amp;body=@jekstrand%20">jekstrand</a></li>
            </ul></dd>

            <dt><b>Last Modified Date</b></dt>
            <dd>2019-06-12</dd>

            <dt><b>IP Status</b></dt>
            <dd>No known IP claims.</dd>

            <dt><b>Interactions and External Dependencies</b></dt>
            <dd><ul>
                <li>This extension interacts with {@link KHRExternalSemaphoreCapabilities VK_KHR_external_semaphore_capabilities}</li>
                <li>This extension interacts with {@link KHRExternalSemaphore VK_KHR_external_semaphore}</li>
                <li>This extension interacts with {@link KHRExternalSemaphoreWin32 VK_KHR_external_semaphore_win32}</li>
            </ul></dd>

            <dt><b>Contributors</b></dt>
            <dd><ul>
                <li>Jeff Bolz, NVIDIA</li>
                <li>Yuriy O&#8217;Donnell, Epic Games</li>
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
        """
        VkSemaphoreTypeKHR - Sepcifies the type of a semaphore object

        <h5>Description</h5>
        <ul>
            <li>#SEMAPHORE_TYPE_BINARY_KHR specifies a <em>binary semaphore</em> type that has a boolean payload indicating whether the semaphore is currently signaled or unsignaled. When created, the semaphore is in the unsignaled state.</li>
            <li>#SEMAPHORE_TYPE_TIMELINE_KHR specifies a <em>timeline semaphore</em> type that has a monotonically increasing 64-bit unsigned integer payload indicating whether the semaphore is signaled with respect to a particular reference value. When created, the semaphore payload has the value given by the {@code initialValue} field of ##VkSemaphoreTypeCreateInfoKHR.</li>
        </ul>

        <h5>See Also</h5>
        ##VkSemaphoreTypeCreateInfoKHR
        """,

        "SEMAPHORE_TYPE_BINARY_KHR".."0",
        "SEMAPHORE_TYPE_TIMELINE_KHR".."1"
    )

    EnumConstant(
        """
        VkSemaphoreWaitFlagBitsKHR - Bitmask specifying additional parameters of a semaphore wait operation

        <h5>Description</h5>
        <ul>
            <li>#SEMAPHORE_WAIT_ANY_BIT_KHR specifies that the semaphore wait condition is that at least one of the semaphores in ##VkSemaphoreWaitInfoKHR{@code ::pSemaphores} has reached the value specified by the corresponding element of ##VkSemaphoreWaitInfoKHR{@code ::pValues}. If #SEMAPHORE_WAIT_ANY_BIT_KHR is not set, the semaphore wait condition is that all of the semaphores in ##VkSemaphoreWaitInfoKHR{@code ::pSemaphores} have reached the value specified by the corresponding element of ##VkSemaphoreWaitInfoKHR{@code ::pValues}.</li>
        </ul>

        <h5>See Also</h5>
        {@code VkSemaphoreWaitFlagsKHR}
        """,

        "SEMAPHORE_WAIT_ANY_BIT_KHR".enum(0x00000001)
    )

    VkResult(
        "GetSemaphoreCounterValueKHR",
        """
        Query the current state of a timeline semaphore.

        <h5>C Specification</h5>
        To query the current counter value of a semaphore created with a {@code VkSemaphoreTypeKHR} of #SEMAPHORE_TYPE_TIMELINE_KHR from the host, call:

        <pre><code>
￿VkResult vkGetSemaphoreCounterValueKHR(
￿    VkDevice                                    device,
￿    VkSemaphore                                 semaphore,
￿    uint64_t*                                   pValue);</code></pre>

        <h5>Description</h5>
        <div style="margin-left: 26px; border-left: 1px solid gray; padding-left: 14px;"><h5>Note</h5>
        If a <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/html/vkspec.html\#devsandqueues-submission">queue submission</a> command is pending execution, then the value returned by this command <b>may</b> immediately be out of date.
        </div>

        <h5>Valid Usage</h5>
        <ul>
            <li>{@code semaphore} <b>must</b> have been created with a {@code VkSemaphoreTypeKHR} of #SEMAPHORE_TYPE_TIMELINE_KHR</li>
        </ul>

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code device} <b>must</b> be a valid {@code VkDevice} handle</li>
            <li>{@code semaphore} <b>must</b> be a valid {@code VkSemaphore} handle</li>
            <li>{@code pValue} <b>must</b> be a valid pointer to a {@code uint64_t} value</li>
            <li>{@code semaphore} <b>must</b> have been created, allocated, or retrieved from {@code device}</li>
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
                <li>#ERROR_DEVICE_LOST</li>
            </ul></dd>
        </dl>
        """,

        VkDevice("device", "the logical device that owns the semaphore."),
        VkSemaphore("semaphore", "the handle of the semaphore to query."),
        Check(1)..uint64_t.p("pValue", "a pointer to a 64-bit integer value in which the current counter value of the semaphore is returned.")
    )

    VkResult(
        "WaitSemaphoresKHR",
        """
        Wait for timeline semaphores on the host.

        <h5>C Specification</h5>
        To wait for a set of semaphores created with a {@code VkSemaphoreTypeKHR} of #SEMAPHORE_TYPE_TIMELINE_KHR to reach particular counter values on the host, call:

        <pre><code>
￿VkResult vkWaitSemaphoresKHR(
￿    VkDevice                                    device,
￿    const VkSemaphoreWaitInfoKHR*               pWaitInfo,
￿    uint64_t                                    timeout);</code></pre>

        <h5>Description</h5>
        If the condition is satisfied when {@code vkWaitSemaphoresKHR} is called, then {@code vkWaitSemaphoresKHR} returns immediately. If the condition is not satisfied at the time {@code vkWaitSemaphoresKHR} is called, then {@code vkWaitSemaphoresKHR} will block and wait up to {@code timeout} nanoseconds for the condition to become satisfied.

        If {@code timeout} is zero, then {@code vkWaitSemaphoresKHR} does not wait, but simply returns information about the current state of the semaphore. #TIMEOUT will be returned in this case if the condition is not satisfied, even though no actual wait was performed.

        If the specified timeout period expires before the condition is satisfied, {@code vkWaitSemaphoresKHR} returns #TIMEOUT. If the condition is satisfied before {@code timeout} nanoseconds has expired, {@code vkWaitSemaphoresKHR} returns #SUCCESS.

        If device loss occurs (see <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/html/vkspec.html\#devsandqueues-lost-device">Lost Device</a>) before the timeout has expired, {@code vkWaitSemaphoresKHR} <b>must</b> return in finite time with either #SUCCESS or #ERROR_DEVICE_LOST.

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code device} <b>must</b> be a valid {@code VkDevice} handle</li>
            <li>{@code pWaitInfo} <b>must</b> be a valid pointer to a valid ##VkSemaphoreWaitInfoKHR structure</li>
        </ul>

        <h5>Return Codes</h5>
        <dl>
            <dt>On success, this command returns</dt>
            <dd><ul>
                <li>#SUCCESS</li>
                <li>#TIMEOUT</li>
            </ul></dd>

            <dt>On failure, this command returns</dt>
            <dd><ul>
                <li>#ERROR_OUT_OF_HOST_MEMORY</li>
                <li>#ERROR_OUT_OF_DEVICE_MEMORY</li>
                <li>#ERROR_DEVICE_LOST</li>
            </ul></dd>
        </dl>

        <h5>See Also</h5>
        ##VkSemaphoreWaitInfoKHR
        """,

        VkDevice("device", "the logical device that owns the semaphore."),
        VkSemaphoreWaitInfoKHR.const.p("pWaitInfo", "a pointer to a ##VkSemaphoreWaitInfoKHR structure containing information about the wait condition."),
        uint64_t("timeout", "the timeout period in units of nanoseconds. {@code timeout} is adjusted to the closest value allowed by the implementation-dependent timeout accuracy, which <b>may</b> be substantially longer than one nanosecond, and <b>may</b> be longer than the requested period.")
    )

    VkResult(
        "SignalSemaphoreKHR",
        """
        Signal a timeline semaphore on the host.

        <h5>C Specification</h5>
        To signal a semaphore created with a {@code VkSemaphoreTypeKHR} of #SEMAPHORE_TYPE_TIMELINE_KHR with a particular counter value, on the host, call:

        <pre><code>
￿VkResult vkSignalSemaphoreKHR(
￿    VkDevice                                    device,
￿    const VkSemaphoreSignalInfoKHR*             pSignalInfo);</code></pre>

        <h5>Description</h5>
        When {@code vkSignalSemaphoreKHR} is executed on the host, it defines and immediately executes a <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/html/vkspec.html\#synchronization-semaphores-signaling"><em>semaphore signal operation</em></a> which sets the timeline semaphore to the given value.

        The first synchronization scope is defined by the host execution model, but includes execution of {@code vkSignalSemaphoreKHR} on the host and anything that happened-before it.

        The second synchronization scope is empty.

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code device} <b>must</b> be a valid {@code VkDevice} handle</li>
            <li>{@code pSignalInfo} <b>must</b> be a valid pointer to a valid ##VkSemaphoreSignalInfoKHR structure</li>
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
            </ul></dd>
        </dl>

        <h5>See Also</h5>
        ##VkSemaphoreSignalInfoKHR
        """,

        VkDevice("device", "the logical device that owns the semaphore."),
        VkSemaphoreSignalInfoKHR.const.p("pSignalInfo", "a pointer to a ##VkSemaphoreSignalInfoKHR structure containing information about the signal operation.")
    )
}