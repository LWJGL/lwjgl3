/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package org.lwjgl.openal.templates

import org.lwjgl.generator.*
import org.lwjgl.openal.*

val ALC_ENUMERATE_ALL_EXT = "EnumerateAllExt".nativeClassALC("ENUMERATE_ALL_EXT") {
    documentation =
        """
        Native bindings to the $extensionName extension.

        The Enumerate All Extension enables the application developer to retrieve a complete list of device strings identifying all the available OpenAL
        rendering devices and paths present on the user's PC. It works in exactly the same manner as the Enumeration Extension, but it detects additional audio
        paths that the standard extension will ignore. For instance, it will return all the possible outputs in situations where the user has more than one
        audio device installed, or under Windows Vista where the audio system specifies different “endpoints” for sound such as Speakers, S/PDIF, etc... If you
        don’t require such complete control over the choice of output path, then use the standard Enumeration Extension.
        """

    IntConstant(
        "$extensionName tokens.",

        "DEFAULT_ALL_DEVICES_SPECIFIER"..0x1012,
        "ALL_DEVICES_SPECIFIER"..0x1013
    )
}