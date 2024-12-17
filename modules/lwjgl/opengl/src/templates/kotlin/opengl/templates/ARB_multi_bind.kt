/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package opengl.templates

import org.lwjgl.generator.*
import opengl.*

val ARB_multi_bind = "ARBMultiBind".nativeClassGL("ARB_multi_bind") {
    reuse(GL44C, "BindBuffersBase")
    reuse(GL44C, "BindBuffersRange")
    reuse(GL44C, "BindTextures")
    reuse(GL44C, "BindSamplers")
    reuse(GL44C, "BindImageTextures")
    reuse(GL44C, "BindVertexBuffers")
}