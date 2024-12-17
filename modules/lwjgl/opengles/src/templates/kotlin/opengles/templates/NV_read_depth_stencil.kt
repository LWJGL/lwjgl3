/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package opengles.templates

import org.lwjgl.generator.*
import opengles.*

val NV_read_depth = EXT_FLAG.nativeClassGLES("NV_read_depth", postfix = NV) {
}

val NV_read_depth_stencil = EXT_FLAG.nativeClassGLES("NV_read_depth_stencil", postfix = NV) {
}

val NV_read_stencil = EXT_FLAG.nativeClassGLES("NV_read_stencil", postfix = NV) {
}