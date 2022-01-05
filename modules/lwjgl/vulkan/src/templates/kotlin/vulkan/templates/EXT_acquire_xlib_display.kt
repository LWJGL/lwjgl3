/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package vulkan.templates

import org.lwjgl.generator.*
import core.linux.*
import vulkan.*

val EXT_acquire_xlib_display = "EXTAcquireXlibDisplay".nativeClassVK("EXT_acquire_xlib_display", type = "instance", postfix = "EXT") {
    javaImport("org.lwjgl.system.linux.*")
    documentation =
        """
        This extension allows an application to take exclusive control on a display currently associated with an X11 screen. When control is acquired, the display will be deassociated from the X11 screen until control is released or the specified display connection is closed. Essentially, the X11 screen will behave as if the monitor has been unplugged until control is released.

        <h5>VK_EXT_acquire_xlib_display</h5>
        <dl>
            <dt><b>Name String</b></dt>
            <dd>{@code VK_EXT_acquire_xlib_display}</dd>

            <dt><b>Extension Type</b></dt>
            <dd>Instance extension</dd>

            <dt><b>Registered Extension Number</b></dt>
            <dd>90</dd>

            <dt><b>Revision</b></dt>
            <dd>1</dd>

            <dt><b>Extension and Version Dependencies</b></dt>
            <dd><ul>
                <li>Requires Vulkan 1.0</li>
                <li>Requires {@link EXTDirectModeDisplay VK_EXT_direct_mode_display}</li>
            </ul></dd>

            <dt><b>Contact</b></dt>
            <dd><ul>
                <li>James Jones <a target="_blank" href="https://github.com/KhronosGroup/Vulkan-Docs/issues/new?body=[VK_EXT_acquire_xlib_display]%20@cubanismo%250A%3C%3CHere%20describe%20the%20issue%20or%20question%20you%20have%20about%20the%20VK_EXT_acquire_xlib_display%20extension%3E%3E">cubanismo</a></li>
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
                <li>Dave Airlie, Red Hat</li>
                <li>Pierre Boudier, NVIDIA</li>
                <li>James Jones, NVIDIA</li>
                <li>Damien Leone, NVIDIA</li>
                <li>Pierre-Loup Griffais, Valve</li>
                <li>Liam Middlebrook, NVIDIA</li>
                <li>Daniel Vetter, Intel</li>
            </ul></dd>
        </dl>
        """

    IntConstant(
        "The extension specification version.",

        "EXT_ACQUIRE_XLIB_DISPLAY_SPEC_VERSION".."1"
    )

    StringConstant(
        "The extension name.",

        "EXT_ACQUIRE_XLIB_DISPLAY_EXTENSION_NAME".."VK_EXT_acquire_xlib_display"
    )

    VkResult(
        "AcquireXlibDisplayEXT",
        """
        Acquire access to a VkDisplayKHR using Xlib.

        <h5>C Specification</h5>
        To acquire permission to directly access a display in Vulkan from an X11 server, call:

        <pre><code>
￿VkResult vkAcquireXlibDisplayEXT(
￿    VkPhysicalDevice                            physicalDevice,
￿    Display*                                    dpy,
￿    VkDisplayKHR                                display);</code></pre>

        <h5>Description</h5>
        All permissions necessary to control the display are granted to the Vulkan instance associated with {@code physicalDevice} until the display is released or the X11 connection specified by {@code dpy} is terminated. Permission to access the display <b>may</b> be temporarily revoked during periods when the X11 server from which control was acquired itself loses access to {@code display}. During such periods, operations which require access to the display <b>must</b> fail with an approriate error code. If the X11 server associated with {@code dpy} does not own {@code display}, or if permission to access it has already been acquired by another entity, the call <b>must</b> return the error code #ERROR_INITIALIZATION_FAILED.

        <div style="margin-left: 26px; border-left: 1px solid gray; padding-left: 14px;"><h5>Note</h5>
        One example of when an X11 server loses access to a display is when it loses ownership of its virtual terminal.
        </div>

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code physicalDevice} <b>must</b> be a valid {@code VkPhysicalDevice} handle</li>
            <li>{@code dpy} <b>must</b> be a valid pointer to a {@code Display} value</li>
            <li>{@code display} <b>must</b> be a valid {@code VkDisplayKHR} handle</li>
            <li>{@code display} <b>must</b> have been created, allocated, or retrieved from {@code physicalDevice}</li>
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
                <li>#ERROR_INITIALIZATION_FAILED</li>
            </ul></dd>
        </dl>
        """,

        VkPhysicalDevice("physicalDevice", "The physical device the display is on."),
        Display.p("dpy", "A connection to the X11 server that currently owns {@code display}."),
        VkDisplayKHR("display", "The display the caller wishes to control in Vulkan.")
    )

    VkResult(
        "GetRandROutputDisplayEXT",
        """
        Query the VkDisplayKHR corresponding to an X11 RandR Output.

        <h5>C Specification</h5>
        When acquiring displays from an X11 server, an application may also wish to enumerate and identify them using a native handle rather than a {@code VkDisplayKHR} handle. To determine the {@code VkDisplayKHR} handle corresponding to an X11 RandR Output, call:

        <pre><code>
￿VkResult vkGetRandROutputDisplayEXT(
￿    VkPhysicalDevice                            physicalDevice,
￿    Display*                                    dpy,
￿    RROutput                                    rrOutput,
￿    VkDisplayKHR*                               pDisplay);</code></pre>

        <h5>Description</h5>
        If there is no {@code VkDisplayKHR} corresponding to {@code rrOutput} on {@code physicalDevice}, #NULL_HANDLE <b>must</b> be returned in {@code pDisplay}.

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code physicalDevice} <b>must</b> be a valid {@code VkPhysicalDevice} handle</li>
            <li>{@code dpy} <b>must</b> be a valid pointer to a {@code Display} value</li>
            <li>{@code pDisplay} <b>must</b> be a valid pointer to a {@code VkDisplayKHR} handle</li>
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
            </ul></dd>
        </dl>
        """,

        VkPhysicalDevice("physicalDevice", "The physical device to query the display handle on."),
        Display.p("dpy", "A connection to the X11 server from which {@code rrOutput} was queried."),
        RROutput("rrOutput", "An X11 RandR output ID."),
        Check(1)..VkDisplayKHR.p("pDisplay", "The corresponding {@code VkDisplayKHR} handle will be returned here.")
    )
}