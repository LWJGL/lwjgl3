/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package opengl.templates

import org.lwjgl.generator.*
import opengl.*

val WGL_NV_vertex_array_range = "WGLNVVertexArrayRange".nativeClassWGL("WGL_NV_vertex_array_range", postfix = NV) {
    void.p(
        "AllocateMemoryNV",
        "",

        AutoSizeResult..GLsizei("size", ""),
        GLfloat("readfreq", ""),
        GLfloat("writefreq", ""),
        GLfloat("priority", "")
    )

    void(
        "FreeMemoryNV",
        "",

        Unsafe..void.p("pointer", "")
    )
}