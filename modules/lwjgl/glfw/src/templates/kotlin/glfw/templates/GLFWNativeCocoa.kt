/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package glfw.templates

import org.lwjgl.generator.*
import glfw.*
import core.macos.*

val GLFWNativeCocoa = "GLFWNativeCocoa".nativeClass(Module.GLFW, nativeSubPath = "macos", prefix = "GLFW", binding = GLFW_BINDING_DELEGATE) {
    CGDirectDisplayID(
        "GetCocoaMonitor",

        GLFWmonitor.p("monitor")
    )

    id(
        "GetCocoaWindow",

        GLFWwindow.p("window")
    )

    id(
        "GetCocoaView",

        GLFWwindow.p("window")
    )
}