/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package opengl.templates

import org.lwjgl.generator.*
import opengl.*

val NV_texgen_reflection = "NVTexgenReflection".nativeClassGL("NV_texgen_reflection", postfix = NV) {
    IntConstant(
        "NORMAL_MAP_NV"..0x8511,
        "REFLECTION_MAP_NV"..0x8512
    )
}