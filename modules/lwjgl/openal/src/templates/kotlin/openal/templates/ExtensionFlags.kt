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
    documentation =
        """
        An OpenAL 1.1 implementation will always support the $extensionName extension. This extension provides for enumeration of the available OpenAL devices
        through ALC10#alcGetString(). An ALC10#alcGetString() query of #DEVICE_SPECIFIER with a #NULL device passed in will return a list of devices. Each
        device name will be separated by a single #NULL character and the list will be terminated with two #NULL characters.
        """
}

val ALC_EXT_debug = EXT_FLAG.nativeClassALC("EXT_debug") {
    documentation = "When true, the {@link EXTDebug ALC_EXT_debug} extension is supported."
}

val AL_EXT_direct_context = EXT_FLAG.nativeClassAL("EXT_direct_context") {
    documentation = "When true, the {@link EXTDirectContext AL_EXT_direct_context} extension is supported."
}