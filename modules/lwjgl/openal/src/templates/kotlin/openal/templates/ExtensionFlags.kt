/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package openal.templates

import org.lwjgl.generator.*
import openal.*

const val AL = "AL"
const val ALC = "ALC"

const val EXT = "EXT"
const val SOFT = "SOFT"

val ALC_ENUMERATION_EXT = EXT_FLAG.nativeClassALC("ENUMERATION_EXT") {
}

val ALC_EXT_debug = EXT_FLAG.nativeClassALC("EXT_debug") {
}

val AL_EXT_direct_context = EXT_FLAG.nativeClassAL("EXT_direct_context") {
}