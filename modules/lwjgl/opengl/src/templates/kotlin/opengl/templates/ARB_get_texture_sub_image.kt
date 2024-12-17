/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package opengl.templates

import opengl.*

val ARB_get_texture_sub_image = "ARBGetTextureSubImage".nativeClassGL("ARB_get_texture_sub_image") {
    reuse(GL45C, "GetTextureSubImage")
    reuse(GL45C, "GetCompressedTextureSubImage")
}