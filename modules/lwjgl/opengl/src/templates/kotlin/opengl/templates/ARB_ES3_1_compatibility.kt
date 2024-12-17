/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package opengl.templates

import org.lwjgl.generator.*
import opengl.*

val ARB_ES3_1_compatibility = "ARBES31Compatibility".nativeClassGL("ARB_ES3_1_compatibility") {
    reuse(GL45C, "MemoryBarrierByRegion")
}