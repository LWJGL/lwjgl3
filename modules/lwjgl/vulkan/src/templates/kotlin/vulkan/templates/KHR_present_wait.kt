/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package vulkan.templates

import org.lwjgl.generator.*
import vulkan.*

val KHR_present_wait = "KHRPresentWait".nativeClassVK("KHR_present_wait", type = "device", postfix = "KHR") {
    documentation =
        """
        This device extension allows an application that uses the {@link KHRSwapchain VK_KHR_swapchain} extension to wait for present operations to complete. An application can use this to monitor and control the pacing of the application by managing the number of outstanding images yet to be presented.

        

        <h5>VK_KHR_present_wait</h5>
        <dl>
            <dt><b>Name String</b></dt>
            <dd>{@code VK_KHR_present_wait}</dd>

            <dt><b>Extension Type</b></dt>
            <dd>Device extension</dd>

            <dt><b>Registered Extension Number</b></dt>
            <dd>249</dd>

            <dt><b>Revision</b></dt>
            <dd>1</dd>

            <dt><b>Extension and Version Dependencies</b></dt>
            <dd><ul>
                <li>Requires Vulkan 1.0</li>
                <li>Requires {@link KHRSwapchain VK_KHR_swapchain}</li>
                <li>Requires {@link KHRPresentId VK_KHR_present_id}</li>
            </ul></dd>

            <dt><b>Contact</b></dt>
            <dd><ul>
                <li>Keith Packard <a target="_blank" href="https://github.com/KhronosGroup/Vulkan-Docs/issues/new?body=[VK_KHR_present_wait]%20@keithp%250A%3C%3CHere%20describe%20the%20issue%20or%20question%20you%20have%20about%20the%20VK_KHR_present_wait%20extension%3E%3E">keithp</a></li>
            </ul></dd>
        </dl>

        <h5>Other Extension Metadata</h5>
        <dl>
            <dt><b>Last Modified Date</b></dt>
            <dd>2019-05-15</dd>

            <dt><b>IP Status</b></dt>
            <dd>No known IP claims.</dd>

            <dt><b>Contributors</b></dt>
            <dd><ul>
                <li>Keith Packard, Valve</li>
                <li>Ian Elliott, Google</li>
                <li>Tobias Hector, AMD</li>
                <li>Daniel Stone, Collabora</li>
            </ul></dd>
        </dl>
        """

    IntConstant(
        "The extension specification version.",

        "KHR_PRESENT_WAIT_SPEC_VERSION".."1"
    )

    StringConstant(
        "The extension name.",

        "KHR_PRESENT_WAIT_EXTENSION_NAME".."VK_KHR_present_wait"
    )

    EnumConstant(
        "Extends {@code VkStructureType}.",

        "STRUCTURE_TYPE_PHYSICAL_DEVICE_PRESENT_WAIT_FEATURES_KHR".."1000248000"
    )

    VkResult(
        "WaitForPresentKHR",
        """
        Wait for presentation.

        <h5>C Specification</h5>
        When the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html\#features-presentWait">{@code presentWait}</a> feature is enabled, an application <b>can</b> wait for an image to be presented to the user by first specifying a presentId for the target presentation by adding a ##VkPresentIdKHR structure to the {@code pNext} chain of the ##VkPresentInfoKHR structure and then waiting for that presentation to complete by calling:

        <pre><code>
￿VkResult vkWaitForPresentKHR(
￿    VkDevice                                    device,
￿    VkSwapchainKHR                              swapchain,
￿    uint64_t                                    presentId,
￿    uint64_t                                    timeout);</code></pre>

        <h5>Description</h5>
        {@code vkWaitForPresentKHR} waits for the presentId associated with {@code swapchain} to be increased in value so that it is at least equal to {@code presentId}.

        For #PRESENT_MODE_MAILBOX_KHR (or other present mode where images may be replaced in the presentation queue) any wait of this type associated with such an image <b>must</b> be signaled no later than a wait associated with the replacing image would be signaled.

        When the presentation has completed, the presentId associated with the related {@code pSwapchains} entry will be increased in value so that it is at least equal to the value provided in the ##VkPresentIdKHR structure.

        There is no requirement for any precise timing relationship between the presentation of the image to the user and the update of the presentId value, but implementations <b>should</b> make this as close as possible to the presentation of the first pixel in the new image to the user.

        The call to {@code vkWaitForPresentKHR} will block until either the presentId associated with {@code swapchain} is greater than or equal to {@code presentId}, or {@code timeout} nanoseconds passes. When the swapchain becomes OUT_OF_DATE, the call will either return #SUCCESS (if the image was delivered to the presentation engine and may have been presented to the user) or will return early with status #ERROR_OUT_OF_DATE_KHR (if the image was not presented to the user).

        As an exception to the normal rules for objects which are externally synchronized, the {@code swapchain} passed to {@code vkWaitForPresentKHR} <b>may</b> be simultaneously used by other threads in calls to functions other than #DestroySwapchainKHR(). Access to the swapchain data associated with this extension <b>must</b> be atomic within the implementation.

        <h5>Valid Usage</h5>
        <ul>
            <li>{@code swapchain} <b>must</b> not be in the retired state</li>
            <li>The <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html\#features-presentWait">{@code presentWait}</a> feature <b>must</b> be enabled</li>
        </ul>

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code device} <b>must</b> be a valid {@code VkDevice} handle</li>
            <li>{@code swapchain} <b>must</b> be a valid {@code VkSwapchainKHR} handle</li>
            <li>Both of {@code device}, and {@code swapchain} <b>must</b> have been created, allocated, or retrieved from the same {@code VkInstance}</li>
        </ul>

        <h5>Host Synchronization</h5>
        <ul>
            <li>Host access to {@code swapchain} <b>must</b> be externally synchronized</li>
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
        """,

        VkDevice("device", "the device associated with {@code swapchain}."),
        VkSwapchainKHR("swapchain", "the non-retired swapchain on which an image was queued for presentation."),
        uint64_t("presentId", "the presentation presentId to wait for."),
        uint64_t("timeout", "the timeout period in units of nanoseconds. {@code timeout} is adjusted to the closest value allowed by the implementation-dependent timeout accuracy, which <b>may</b> be substantially longer than one nanosecond, and <b>may</b> be longer than the requested period.")
    )
}