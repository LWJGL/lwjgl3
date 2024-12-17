/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package glfw.templates

import org.lwjgl.generator.*
import glfw.*
import core.linux.*

val GLFWNativeX11 = "GLFWNativeX11".nativeClass(Module.GLFW, nativeSubPath = "linux", prefix = "GLFW", binding = GLFW_BINDING_DELEGATE) {
    Display.p(
        "GetX11Display",
        void()
    )

    RRCrtc(
        "GetX11Adapter",

        GLFWmonitor.p("monitor")
    )

    RROutput(
        "GetX11Monitor",

        GLFWmonitor.p("monitor")
    )

    Window(
        "GetX11Window",

        GLFWwindow.p("window")
    )

    void(
        "SetX11SelectionString",

        charUTF8.const.p("string")
    )

    charUTF8.const.p(
        "GetX11SelectionString",
        void()
    )
}