/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package opengl.templates

import org.lwjgl.generator.*
import opengl.*

val NV_texture_barrier = "NVTextureBarrier".nativeClassGL("NV_texture_barrier", postfix = NV) {
    void("TextureBarrierNV", void())
}