/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package opengl.templates

import org.lwjgl.generator.*
import opengl.*

val NV_texture_shader2 = "NVTextureShader2".nativeClassGL("NV_texture_shader2", postfix = NV) {
    documentation =
        """
        Native bindings to the $registryLink extension.

        This extension extends the {@code NV_texture_shader} functionality to support texture shader operations for 3D textures.
        
        Requires ${NV_texture_shader.link}.
        """

    IntConstant(
        """
        When the {@code target} and {@code pname} parameters of TexEnvf, TexEnvfv, TexEnvi, and TexEnviv are TEXTURE_SHADER_NV and SHADER_OPERATION_NV
        respectively, then the value of {@code param} or the value pointed to by {@code params} may be.
        """,

        "DOT_PRODUCT_TEXTURE_3D_NV"..0x86EF
    )
}
