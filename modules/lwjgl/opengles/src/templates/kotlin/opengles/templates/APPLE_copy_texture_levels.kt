/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package opengles.templates

import org.lwjgl.generator.*
import opengles.*

val APPLE_copy_texture_levels = "APPLECopyTextureLevels".nativeClassGLES("APPLE_copy_texture_levels", postfix = APPLE) {
    void(
        "CopyTextureLevelsAPPLE",

        GLuint("destinationTexture"),
        GLuint("sourceTexture"),
        GLint("sourceBaseLevel"),
        GLsizei("sourceLevelCount")
    )
}