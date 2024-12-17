/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package opengl.templates

import org.lwjgl.generator.*
import opengl.*

val ARB_shading_language_100 = "ARBShadingLanguage100".nativeClassGL("ARB_shading_language_100", postfix = ARB) {
    IntConstant(
        "SHADING_LANGUAGE_VERSION_ARB"..0x8B8C
    )
}