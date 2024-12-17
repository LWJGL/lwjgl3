/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package opengles.templates

import org.lwjgl.generator.*
import opengles.*
import opengles.BufferType.*

val EXT_draw_instanced = "EXTDrawInstanced".nativeClassGLES("EXT_draw_instanced", postfix = EXT) {
    reuse(EXT_instanced_arrays, "DrawArraysInstancedEXT")
    reuse(EXT_instanced_arrays, "DrawElementsInstancedEXT")
}