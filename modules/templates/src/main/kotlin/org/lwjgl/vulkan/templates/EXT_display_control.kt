/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.vulkan.templates

import org.lwjgl.generator.*
import org.lwjgl.vulkan.*

val EXT_display_control = "EXTDisplayControl".nativeClassVK("EXT_display_control", type = "device", postfix = EXT) {
    documentation =
        """
        This extension defines a set of utility functions for use with the {@code VK_KHR_display} and {@code VK_KHR_display_swapchain} extensions.

        <dl>
            <dt><b>Name String</b></dt>
            <dd>VK_EXT_display_control</dd>

            <dt><b>Extension Type</b></dt>
            <dd>Device extension</dd>

            <dt><b>Registered Extension Number</b></dt>
            <dd>92</dd>

            <dt><b>Last Modified Date</b></dt>
            <dd>2016-12-13</dd>

            <dt><b>Revision</b></dt>
            <dd>1</dd>

            <dt><b>IP Status</b></dt>
            <dd>No known IP claims.</dd>

            <dt><b>Dependencies</b></dt>
            <dd><ul>
                <li>This extension is written against version 1.0.37 of the Vulkan API.</li>
                <li>Requires VK_KHR_display</li>
                <li>Requires VK_EXT_display_surface_counter</li>
                <li>Requires VK_KHR_swapchain</li>
            </ul></dd>

            <dt><b>Contributors</b></dt>
            <dd><ul>
                <li>Pierre Boudier, NVIDIA</li>
                <li>James Jones, NVIDIA</li>
                <li>Damien Leone, NVIDIA</li>
                <li>Pierre-Loup Griffais, Valve</li>
                <li>Daniel Vetter, Intel</li>
            </ul></dd>

            <dt><b>Contacts</b></dt>
            <dd><ul>
                <li>James Jones, NVIDIA (jajones 'at' nvidia.com)</li>
            </ul></dd>
        </dl>
        """

    IntConstant(
        "The extension specification version.",

        "EXT_DISPLAY_CONTROL_SPEC_VERSION".."1"
    )

    StringConstant(
        "The extension name.",

        "EXT_DISPLAY_CONTROL_EXTENSION_NAME".."VK_EXT_display_control"
    )

    EnumConstant(
        "Extends {@code VkStructureType}.",

        "STRUCTURE_TYPE_DISPLAY_POWER_INFO_EXT".."1000091000",
        "STRUCTURE_TYPE_DEVICE_EVENT_INFO_EXT".."1000091001",
        "STRUCTURE_TYPE_DISPLAY_EVENT_INFO_EXT".."1000091002",
        "STRUCTURE_TYPE_SWAPCHAIN_COUNTER_CREATE_INFO_EXT".."1000091003"
    )

    EnumConstant(
        """
        VkDisplayPowerStateEXT - Possible power states for a display

        <h5>Description</h5>
        <ul>
            <li>#DISPLAY_POWER_STATE_OFF_EXT specifies that the display is powered down.</li>
            <li>#DISPLAY_POWER_STATE_SUSPEND_EXT specifies that the display is put into a low power mode, from which it <b>may</b> be able to transition back to #DISPLAY_POWER_STATE_ON_EXT more quickly than if it were in #DISPLAY_POWER_STATE_OFF_EXT. This state <b>may</b> be the same as #DISPLAY_POWER_STATE_OFF_EXT.</li>
            <li>#DISPLAY_POWER_STATE_ON_EXT specifies that the display is powered on.</li>
        </ul>

        <h5>See Also</h5>
        ##VkDisplayPowerInfoEXT
        """,

        "DISPLAY_POWER_STATE_OFF_EXT".."0",
        "DISPLAY_POWER_STATE_SUSPEND_EXT".."1",
        "DISPLAY_POWER_STATE_ON_EXT".."2"
    )

    EnumConstant(
        """
        VkDeviceEventTypeEXT - Events that can occur on a device object

        <h5>Description</h5>
        <ul>
            <li>#DEVICE_EVENT_TYPE_DISPLAY_HOTPLUG_EXT specifies that the fence is signaled when a display is plugged into or unplugged from the specified device. Applications <b>can</b> use this notification to determine when they need to re-enumerate the available displays on a device.</li>
        </ul>

        <h5>See Also</h5>
        ##VkDeviceEventInfoEXT
        """,

        "DEVICE_EVENT_TYPE_DISPLAY_HOTPLUG_EXT".."0"
    )

    EnumConstant(
        """
        VkDisplayEventTypeEXT - Events that can occur on a display object

        <h5>Description</h5>
        <ul>
            <li>#DISPLAY_EVENT_TYPE_FIRST_PIXEL_OUT_EXT specifies that the fence is signaled when the first pixel of the next display refresh cycle leaves the display engine for the display.</li>
        </ul>

        <h5>See Also</h5>
        ##VkDisplayEventInfoEXT
        """,

        "DISPLAY_EVENT_TYPE_FIRST_PIXEL_OUT_EXT".."0"
    )

    VkResult(
        "DisplayPowerControlEXT",
        """
        Set the power state of a display.

        <h5>C Specification</h5>
        To set the power state of a display, call:

        <code><pre>
￿VkResult vkDisplayPowerControlEXT(
￿    VkDevice                                    device,
￿    VkDisplayKHR                                display,
￿    const VkDisplayPowerInfoEXT*                pDisplayPowerInfo);</pre></code>

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code device} <b>must</b> be a valid {@code VkDevice} handle</li>
            <li>{@code display} <b>must</b> be a valid {@code VkDisplayKHR} handle</li>
            <li>{@code pDisplayPowerInfo} <b>must</b> be a pointer to a valid ##VkDisplayPowerInfoEXT structure</li>
        </ul>

        <h5>Return Codes</h5>
        <dl>
            <dt>On success, this command returns</dt>
            <dd><ul>
                <li>#SUCCESS</li>
            </ul></dd>
        </dl>

        <h5>See Also</h5>
        ##VkDisplayPowerInfoEXT
        """,

        VkDevice.IN("device", "a logical device associated with {@code display}."),
        VkDisplayKHR.IN("display", "the display whose power state is modified."),
        const..VkDisplayPowerInfoEXT.p.IN("pDisplayPowerInfo", "an instance of ##VkDisplayPowerInfoEXT specifying the new power state of {@code display}.")
    )

    VkResult(
        "RegisterDeviceEventEXT",
        """
        Signal a fence when a device event occurs.

        <h5>C Specification</h5>
        To create a fence that will be signaled when an event occurs on a device, call:

        <code><pre>
￿VkResult vkRegisterDeviceEventEXT(
￿    VkDevice                                    device,
￿    const VkDeviceEventInfoEXT*                 pDeviceEventInfo,
￿    const VkAllocationCallbacks*                pAllocator,
￿    VkFence*                                    pFence);</pre></code>

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code device} <b>must</b> be a valid {@code VkDevice} handle</li>
            <li>{@code pDeviceEventInfo} <b>must</b> be a pointer to a valid ##VkDeviceEventInfoEXT structure</li>
            <li>{@code pAllocator} <b>must</b> be a pointer to a valid ##VkAllocationCallbacks structure</li>
            <li>{@code pFence} <b>must</b> be a pointer to a {@code VkFence} handle</li>
        </ul>

        <h5>Return Codes</h5>
        <dl>
            <dt>On success, this command returns</dt>
            <dd><ul>
                <li>#SUCCESS</li>
            </ul></dd>
        </dl>

        <h5>See Also</h5>
        ##VkAllocationCallbacks, ##VkDeviceEventInfoEXT
        """,

        VkDevice.IN("device", "a logical device on which the event <b>may</b> occur."),
        const..VkDeviceEventInfoEXT.p.IN("pDeviceEventInfo", "a pointer to an instance of the ##VkDeviceEventInfoEXT structure describing the event of interest to the application."),
        const..VkAllocationCallbacks.p.IN("pAllocator", "controls host memory allocation as described in the <a target=\"_blank\" href=\"https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html\\#memory-allocation\">Memory Allocation</a> chapter."),
        Check(1)..VkFence.p.OUT("pFence", "points to a handle in which the resulting fence object is returned.")
    )

    VkResult(
        "RegisterDisplayEventEXT",
        """
        Signal a fence when a display event occurs.

        <h5>C Specification</h5>
        To create a fence that will be signaled when an event occurs on a VkDisplayKHR object, call:

        <code><pre>
￿VkResult vkRegisterDisplayEventEXT(
￿    VkDevice                                    device,
￿    VkDisplayKHR                                display,
￿    const VkDisplayEventInfoEXT*                pDisplayEventInfo,
￿    const VkAllocationCallbacks*                pAllocator,
￿    VkFence*                                    pFence);</pre></code>

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code device} <b>must</b> be a valid {@code VkDevice} handle</li>
            <li>{@code display} <b>must</b> be a valid {@code VkDisplayKHR} handle</li>
            <li>{@code pDisplayEventInfo} <b>must</b> be a pointer to a valid ##VkDisplayEventInfoEXT structure</li>
            <li>{@code pAllocator} <b>must</b> be a pointer to a valid ##VkAllocationCallbacks structure</li>
            <li>{@code pFence} <b>must</b> be a pointer to a {@code VkFence} handle</li>
        </ul>

        <h5>Return Codes</h5>
        <dl>
            <dt>On success, this command returns</dt>
            <dd><ul>
                <li>#SUCCESS</li>
            </ul></dd>
        </dl>

        <h5>See Also</h5>
        ##VkAllocationCallbacks, ##VkDisplayEventInfoEXT
        """,

        VkDevice.IN("device", "a logical device associated with {@code display}"),
        VkDisplayKHR.IN("display", "the display on which the event <b>may</b> occur."),
        const..VkDisplayEventInfoEXT.p.IN("pDisplayEventInfo", "a pointer to an instance of the ##VkDisplayEventInfoEXT structure describing the event of interest to the application."),
        const..VkAllocationCallbacks.p.IN("pAllocator", "controls host memory allocation as described in the <a target=\"_blank\" href=\"https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html\\#memory-allocation\">Memory Allocation</a> chapter."),
        Check(1)..VkFence.p.OUT("pFence", "points to a handle in which the resulting fence object is returned.")
    )

    VkResult(
        "GetSwapchainCounterEXT",
        """
        Query the current value of a surface counter.

        <h5>C Specification</h5>
        The requested counters become active when the first presentation command for the associated swapchain is processed by the presentation engine. To query the value of an active counter, use:

        <code><pre>
￿VkResult vkGetSwapchainCounterEXT(
￿    VkDevice                                    device,
￿    VkSwapchainKHR                              swapchain,
￿    VkSurfaceCounterFlagBitsEXT                 counter,
￿    uint64_t*                                   pCounterValue);</pre></code>

        <h5>Description</h5>
        If a counter is not available because the swapchain is out of date, the implementation <b>may</b> return #ERROR_OUT_OF_DATE_KHR.

        <h5>Valid Usage</h5>
        <ul>
            <li>One or more present commands on {@code swapchain} <b>must</b> have been processed by the presentation engine.</li>
        </ul>

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code device} <b>must</b> be a valid {@code VkDevice} handle</li>
            <li>{@code swapchain} <b>must</b> be a valid {@code VkSwapchainKHR} handle</li>
            <li>{@code counter} <b>must</b> be a valid {@code VkSurfaceCounterFlagBitsEXT} value</li>
            <li>{@code pCounterValue} <b>must</b> be a pointer to a {@code uint64_t} value</li>
        </ul>

        <h5>Return Codes</h5>
        <dl>
            <dt>On success, this command returns</dt>
            <dd><ul>
                <li>#SUCCESS</li>
                <li>#ERROR_DEVICE_LOST</li>
                <li>#ERROR_OUT_OF_DATE_KHR</li>
            </ul></dd>
        </dl>
        """,

        VkDevice.IN("device", "the {@code VkDevice} associated with {@code swapchain}."),
        VkSwapchainKHR.IN("swapchain", "the swapchain from which to query the counter value."),
        VkSurfaceCounterFlagBitsEXT.IN("counter", "the counter to query."),
        Check(1)..uint64_t_p.OUT("pCounterValue", "will return the current value of the counter.")
    )
}