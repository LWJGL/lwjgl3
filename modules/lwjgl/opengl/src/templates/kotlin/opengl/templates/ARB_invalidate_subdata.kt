/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package opengl.templates

import org.lwjgl.generator.*
import opengl.*

val ARB_invalidate_subdata = "ARBInvalidateSubdata".nativeClassGL("ARB_invalidate_subdata") {
    reuse(GL43C, "InvalidateTexSubImage")
    reuse(GL43C, "InvalidateTexImage")

    reuse(GL43C, "InvalidateBufferSubData")
    reuse(GL43C, "InvalidateBufferData")

    reuse(GL43C, "InvalidateFramebuffer")
    reuse(GL43C, "InvalidateSubFramebuffer")
}