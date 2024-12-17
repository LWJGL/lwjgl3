/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package glfw.templates

import org.lwjgl.generator.*
import glfw.*
import core.linux.*

val GLFWNativeWayland = "GLFWNativeWayland".nativeClass(Module.GLFW, nativeSubPath = "linux", prefix = "GLFW", binding = GLFW_BINDING_DELEGATE) {
    wl_display.p(
        "GetWaylandDisplay",
        void()
    )

    wl_output.p(
        "GetWaylandMonitor",

        GLFWmonitor.p("monitor")
    )

    wl_surface.p(
        "GetWaylandWindow",

        GLFWwindow.p("window")
    )
}