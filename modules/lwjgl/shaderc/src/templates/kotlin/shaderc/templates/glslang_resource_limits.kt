/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package shaderc.templates

import shaderc.*
import org.lwjgl.generator.*

val glslang_resource_limits = "GLSLangResourceLimits".nativeClass(Module.SHADERC, prefix = "GLSLANG", prefixMethod = "glslang_", binding = simpleBinding(
    Module.SHADERC,
    libraryExpression = """Configuration.GLSLANG_RESOURCE_LIBRARY_NAME, Shaderc::getLibrary"""
)) {
   // resource_limits_c.h

    glslang_resource_t.p(
        "resource",

        void()
    )

    glslang_resource_t.const.p(
        "default_resource",

        void()
    )

    "const char *".handle(
        "default_resource_string",

        void()
    )

    void(
        "decode_resource_limits",

        glslang_resource_t.p("resources"),
        charUTF8.p("config")
    )
}