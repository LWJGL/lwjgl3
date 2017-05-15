/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.vulkan.templates

import org.lwjgl.generator.*
import org.lwjgl.vulkan.*

val EXT_direct_mode_display = "EXTDirectModeDisplay".nativeClassVK("EXT_direct_mode_display", type = "instance", postfix = EXT) {
    documentation =
        """
        This is extension, along with related platform exentions, allows applications to take exclusive control of displays associated with a native windowing system. This is especially useful for virtual reality applications that wish to hide HMDs (head mounted displays) from the native platform's display management system, desktop, and/or other applications.

        <dl>
            <dt><b>Name String</b></dt>
            <dd>VK_EXT_direct_mode_display</dd>

            <dt><b>Extension Type</b></dt>
            <dd>Instance extension</dd>

            <dt><b>Registered Extension Number</b></dt>
            <dd>89</dd>

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
            </ul></dd>

            <dt><b>Contributors</b></dt>
            <dd><ul>
                <li>Pierre Boudier, NVIDIA</li>
                <li>James Jones, NVIDIA</li>
                <li>Damien Leone, NVIDIA</li>
                <li>Pierre-Loup Griffais, Valve</li>
                <li>Liam Middlebrook, NVIDIA</li>
            </ul></dd>

            <dt><b>Contacts</b></dt>
            <dd><ul>
                <li>James Jones, NVIDIA (jajones 'at' nvidia.com)</li>
            </ul></dd>
        </dl>
        """

    IntConstant(
        "The extension specification version.",

        "EXT_DIRECT_MODE_DISPLAY_SPEC_VERSION".."1"
    )

    StringConstant(
        "The extension name.",

        "EXT_DIRECT_MODE_DISPLAY_EXTENSION_NAME".."VK_EXT_direct_mode_display"
    )

    VkResult(
        "ReleaseDisplayEXT",
        """
        Release access to an acquired VkDisplayKHR.

        <h5>C Specification</h5>
        To release a previously acquired display, call:

        <code><pre>
￿VkResult vkReleaseDisplayEXT(
￿    VkPhysicalDevice                            physicalDevice,
￿    VkDisplayKHR                                display);</pre></code>

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code physicalDevice} <b>must</b> be a valid {@code VkPhysicalDevice} handle</li>
            <li>{@code display} <b>must</b> be a valid {@code VkDisplayKHR} handle</li>
        </ul>

        <h5>Return Codes</h5>
        <dl>
            <dt>On success, this command returns</dt>
            <dd><ul>
                <li>#SUCCESS</li>
            </ul></dd>
        </dl>
        """,

        VkPhysicalDevice.IN("physicalDevice", "The physical device the display is on."),
        VkDisplayKHR.IN("display", "The display to release control of.")
    )
}