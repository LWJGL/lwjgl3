/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package nanovg

import org.lwjgl.generator.*

val GLuint = IntegerType("GLuint", PrimitiveMapping.INT, unsigned = true)

val NVGLUframebuffer = struct(Module.NANOVG, "NVGLUFramebuffer", nativeName = "NVGLUframebuffer", mutable = false) {
    documentation = "A framebuffer object."

    GLuint("fbo", "the OpenGL framebuffer object handle")
    GLuint("rbo", "the OpenGL renderbuffer handle")
    GLuint("texture", "the OpenGL texture handle")
    int("image", "the NanoVG image handle")
}