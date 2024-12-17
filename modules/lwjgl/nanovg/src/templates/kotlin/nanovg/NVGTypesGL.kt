/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package nanovg

import org.lwjgl.generator.*

val GLuint = IntegerType("GLuint", PrimitiveMapping.INT, unsigned = true)

val NVGLUframebuffer = struct(Module.NANOVG, "NVGLUFramebuffer", nativeName = "NVGLUframebuffer", mutable = false) {
    GLuint("fbo")
    GLuint("rbo")
    GLuint("texture")
    int("image")
}