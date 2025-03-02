/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package glfw.templates

import org.lwjgl.generator.*
import glfw.*
import core.windows.*

val GLFWNativeWin32 = "GLFWNativeWin32".nativeClass(Module.GLFW, nativeSubPath = "windows", prefix = "GLFW", binding = GLFW_BINDING_DELEGATE) {
    charUTF8.const.p(
        "GetWin32Adapter",

        GLFWmonitor.p("monitor")
    )

    charUTF8.const.p(
        "GetWin32Monitor",

        GLFWmonitor.p("monitor")
    )

    HWND(
        "GetWin32Window",

        GLFWwindow.p("window")
    )

    IgnoreMissing..GLFWwindow.p(
        "AttachWin32Window",

        HWND("handle"),
        nullable..GLFWwindow.p("share")
    )
}