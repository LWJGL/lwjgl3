/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package opengl.templates

import opengl.*

val ARB_copy_image = "ARBCopyImage".nativeClassGL("ARB_copy_image") {
    reuse(GL43C, "CopyImageSubData")
}