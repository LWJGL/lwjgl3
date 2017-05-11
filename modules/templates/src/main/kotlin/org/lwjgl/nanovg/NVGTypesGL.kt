/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package org.lwjgl.nanovg

import org.lwjgl.generator.*
import org.lwjgl.opengl.*

val NVGLUframebuffer_p = struct(NANOVG_PACKAGE, "NVGLUFramebuffer", nativeName = "NVGLUframebuffer", mutable = false) {
    documentation = "A framebuffer object."

    GLuint.member("fbo", "the OpenGL framebuffer object handle")
    GLuint.member("rbo", "the OpenGL renderbuffer handle")
    GLuint.member("texture", "the OpenGL texture handle")
    int.member("image", "the NanoVG image handle")
}.p
