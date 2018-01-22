/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package org.lwjgl.opengl.templates

import org.lwjgl.generator.*
import org.lwjgl.opengl.*

val WGL_NV_vertex_array_range = "WGLNVVertexArrayRange".nativeClassWGL("WGL_NV_vertex_array_range", postfix = NV) {
    void_p(
        "AllocateMemoryNV",
        "",

        AutoSizeResult..GLsizei.IN("size", ""),
        GLfloat.IN("readfreq", ""),
        GLfloat.IN("writefreq", ""),
        GLfloat.IN("priority", "")
    )

    void(
        "FreeMemoryNV",
        "",

        Unsafe..void_p.IN("pointer", "")
    )
}