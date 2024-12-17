/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package opengl.templates

import opengl.*

val ARB_multi_draw_indirect = "ARBMultiDrawIndirect".nativeClassGL("ARB_multi_draw_indirect") {
    reuse(GL43C, "MultiDrawArraysIndirect")
    reuse(GL43C, "MultiDrawElementsIndirect")
}