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
    IntConstant(
        "EXT_ACQUIRE_XLIB_DISPLAY_SPEC_VERSION".."1"
    )

    StringConstant(
        "EXT_ACQUIRE_XLIB_DISPLAY_EXTENSION_NAME".."VK_EXT_acquire_xlib_display"
    )

    VkResult(
        "AcquireXlibDisplayEXT",

        VkPhysicalDevice("physicalDevice"),
        Display.p("dpy"),
        VkDisplayKHR("display")
    )

    VkResult(
        "GetRandROutputDisplayEXT",

        VkPhysicalDevice("physicalDevice"),
        Display.p("dpy"),
        RROutput("rrOutput"),
        Check(1)..VkDisplayKHR.p("pDisplay")
    )
}