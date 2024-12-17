/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package opengles.templates

import org.lwjgl.generator.*
import opengles.*

val EXT_shader_pixel_local_storage2 = "EXTShaderPixelLocalStorage2".nativeClassGLES("EXT_shader_pixel_local_storage2", postfix = EXT) {
    IntConstant(
        "MAX_SHADER_COMBINED_LOCAL_STORAGE_FAST_SIZE_EXT"..0x9650,
        "MAX_SHADER_COMBINED_LOCAL_STORAGE_SIZE_EXT"..0x9651
    )

    IntConstant(
        "FRAMEBUFFER_INCOMPLETE_INSUFFICIENT_SHADER_COMBINED_LOCAL_STORAGE_EXT"..0x9652
    )

    void(
        "FramebufferPixelLocalStorageSizeEXT",

        GLuint("target"),
        GLsizei("size")
    )

    GLsizei(
        "GetFramebufferPixelLocalStorageSizeEXT",

        GLuint("target")
    )

    void(
        "ClearPixelLocalStorageuiEXT",

        GLsizei("offset"),
        AutoSize("values")..GLsizei("n"),
        GLuint.const.p("values")
    )
}