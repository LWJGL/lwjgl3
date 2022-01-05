/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package vulkan.templates

import org.lwjgl.generator.*
import vulkan.*

val EXT_direct_mode_display = "EXTDirectModeDisplay".nativeClassVK("EXT_direct_mode_display", type = "instance", postfix = "EXT") {
    documentation =
        """
        This is extension, along with related platform extensions, allows applications to take exclusive control of displays associated with a native windowing system. This is especially useful for virtual reality applications that wish to hide HMDs (head mounted displays) from the native platform’s display management system, desktop, and/or other applications.

        <h5>VK_EXT_direct_mode_display</h5>
        <dl>
            <dt><b>Name String</b></dt>
            <dd>{@code VK_EXT_direct_mode_display}</dd>

            <dt><b>Extension Type</b></dt>
            <dd>Instance extension</dd>

            <dt><b>Registered Extension Number</b></dt>
            <dd>89</dd>

            <dt><b>Revision</b></dt>
            <dd>1</dd>

            <dt><b>Extension and Version Dependencies</b></dt>
            <dd><ul>
                <li>Requires Vulkan 1.0</li>
                <li>Requires {@link KHRDisplay VK_KHR_display}</li>
            </ul></dd>

            <dt><b>Contact</b></dt>
            <dd><ul>
                <li>James Jones <a target="_blank" href="https://github.com/KhronosGroup/Vulkan-Docs/issues/new?body=[VK_EXT_direct_mode_display]%20@cubanismo%250A%3C%3CHere%20describe%20the%20issue%20or%20question%20you%20have%20about%20the%20VK_EXT_direct_mode_display%20extension%3E%3E">cubanismo</a></li>
            </ul></dd>
        </dl>

        <h5>Other Extension Metadata</h5>
        <dl>
            <dt><b>Last Modified Date</b></dt>
            <dd>2016-12-13</dd>

            <dt><b>IP Status</b></dt>
            <dd>No known IP claims.</dd>

            <dt><b>Contributors</b></dt>
            <dd><ul>
                <li>Pierre Boudier, NVIDIA</li>
                <li>James Jones, NVIDIA</li>
                <li>Damien Leone, NVIDIA</li>
                <li>Pierre-Loup Griffais, Valve</li>
                <li>Liam Middlebrook, NVIDIA</li>
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

        <pre><code>
￿VkResult vkReleaseDisplayEXT(
￿    VkPhysicalDevice                            physicalDevice,
￿    VkDisplayKHR                                display);</code></pre>

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code physicalDevice} <b>must</b> be a valid {@code VkPhysicalDevice} handle</li>
            <li>{@code display} <b>must</b> be a valid {@code VkDisplayKHR} handle</li>
            <li>{@code display} <b>must</b> have been created, allocated, or retrieved from {@code physicalDevice}</li>
        </ul>

        <h5>Return Codes</h5>
        <dl>
            <dt>On success, this command returns</dt>
            <dd><ul>
                <li>#SUCCESS</li>
            </ul></dd>
        </dl>
        """,

        VkPhysicalDevice("physicalDevice", "The physical device the display is on."),
        VkDisplayKHR("display", "The display to release control of.")
    )
}