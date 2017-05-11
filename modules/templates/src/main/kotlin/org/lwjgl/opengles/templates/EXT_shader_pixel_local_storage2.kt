/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package org.lwjgl.opengles.templates

import org.lwjgl.generator.*
import org.lwjgl.opengles.*

val EXT_shader_pixel_local_storage2 = "EXTShaderPixelLocalStorage2".nativeClassGLES("EXT_shader_pixel_local_storage2", postfix = EXT) {
    documentation =
        """
        Native bindings to the $registryLink extension.

        This extension builds on ${EXT_shader_pixel_local_storage.link} by lifting the restriction that pixel local storage is not supported when rendering to
        multiple draw buffers.

        Moreover, pixel local storage values are no longer lost when writing to user-defined fragment outputs, and, correspondingly, framebuffer pixel values
        do not always become undefined when the shader writes to pixel local storage.

        This extension adds the following capabilities:
        ${ul(
            "support for pixel local storage in combination with multiple user-defined fragment outputs",
            "support for clearing pixel local storage variables",
            "support for multi-word pixel local storage variables"
        )}
        """

    IntConstant(
        "Accepted by the {@code pname} parameters of GetBooleanv, GetIntegerv, GetInteger64v, or GetFloatv.",

        "MAX_SHADER_COMBINED_LOCAL_STORAGE_FAST_SIZE_EXT"..0x9650,
        "MAX_SHADER_COMBINED_LOCAL_STORAGE_SIZE_EXT"..0x9651
    )

    IntConstant(
        "Returned by CheckFramebufferStatus.",

        "FRAMEBUFFER_INCOMPLETE_INSUFFICIENT_SHADER_COMBINED_LOCAL_STORAGE_EXT"..0x9652
    )

    void(
        "FramebufferPixelLocalStorageSizeEXT",
        "",

        GLuint.IN("target", ""),
        GLsizei.IN("size", "")
    )

    GLsizei(
        "GetFramebufferPixelLocalStorageSizeEXT",
        "",

        GLuint.IN("target", "")
    )

    void(
        "ClearPixelLocalStorageuiEXT",
        "",

        GLsizei.IN("offset", ""),
        AutoSize("values")..GLsizei.IN("n", ""),
        const..GLuint_p.IN("values", "")
    )
}