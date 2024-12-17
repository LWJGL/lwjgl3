/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package egl.templates

import egl.*
import org.lwjgl.generator.*

val NV_system_time = "NVSystemTime".nativeClassEGL("NV_system_time", postfix = NV) {
    EGLuint64NV("GetSystemTimeFrequencyNV", void())
    EGLuint64NV("GetSystemTimeNV", void())
}