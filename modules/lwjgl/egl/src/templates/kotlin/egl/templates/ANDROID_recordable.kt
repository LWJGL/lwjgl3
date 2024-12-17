/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package egl.templates

import egl.*
import org.lwjgl.generator.*

val ANDROID_recordable = "ANDROIDRecordable".nativeClassEGL("ANDROID_recordable", postfix = ANDROID) {
    IntConstant("RECORDABLE_ANDROID"..0x3142)
}