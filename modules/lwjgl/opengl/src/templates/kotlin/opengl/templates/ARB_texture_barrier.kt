/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package opengl.templates

import opengl.*

val ARB_texture_barrier = "ARBTextureBarrier".nativeClassGL("ARB_texture_barrier") {
    reuse(GL45C, "TextureBarrier")
}