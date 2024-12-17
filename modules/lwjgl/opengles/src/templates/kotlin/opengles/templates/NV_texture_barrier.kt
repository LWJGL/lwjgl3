/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package opengles.templates

import org.lwjgl.generator.*
import opengles.*

val NV_texture_barrier = "NVTextureBarrier".nativeClassGLES("NV_texture_barrier", postfix = NV) {
    void("TextureBarrierNV")
}