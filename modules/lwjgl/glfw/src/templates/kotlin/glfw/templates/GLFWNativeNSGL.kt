/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package glfw.templates

import org.lwjgl.generator.*
import glfw.*
import core.macos.*

val GLFWNativeNSGL = "GLFWNativeNSGL".nativeClass(Module.GLFW, nativeSubPath = "macos", prefix = "GLFW", binding = GLFW_BINDING_DELEGATE) {
    javaImport(
        "org.jspecify.annotations.*",
        "org.lwjgl.system.macosx.*",
        "static org.lwjgl.system.MemoryUtil.*"
    )

    id(
        "GetNSGLContext",

        GLFWwindow.p("window")
    )

}