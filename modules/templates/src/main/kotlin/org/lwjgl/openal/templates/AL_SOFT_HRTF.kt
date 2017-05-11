/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package org.lwjgl.openal.templates

import org.lwjgl.generator.*
import org.lwjgl.openal.*

val ALC_SOFT_HRTF = "SOFTHRTF".nativeClassALC("SOFT_HRTF") {
    documentation =
        """
        Native bindings to the $specLinkOpenALSoft extension.

        This extension allows an application to request and determine the status of HRTF mixing. HRTF, or Head-Related Transfer Function, is a method of mixing
        3D audio for "true" 3D panning, typically using filters designed to simulate how sound is affected by a listener's head as the sound waves travel
        between the ears.

        As a 3D sound API, OpenAL's design allows implementations to transparently render audio using HRTF. However, the OpenAL API currently has no concept of
        HRTF so there's no way to query if it's being used, and no way for an application to request it on behalf of the user. This aims to fix that.
        """

    IntConstant(
        """
        Accepted as part of the {@code attrList} parameter of #CreateContext() and #ResetDeviceSOFT(), and as the {@code paramName} parameter of
        ALC10#alcGetIntegerv().
        """,

        "HRTF_SOFT"..0x1992
    )

    IntConstant(
        "Accepted as part of the {@code attrList} parameter of #CreateContext() and #ResetDeviceSOFT().",

        "HRTF_ID_SOFT"..0x1996
    )

    IntConstant(
        "Accepted as part of the {@code attrList} parameter of #CreateContext() and #ResetDeviceSOFT(), for the #HRTF_SOFT attribute.",

        "DONT_CARE_SOFT"..0x0002
    )

    IntConstant(
        "Accepted as the {@code paramName} parameter of ALC10#alcGetIntegerv().",

        "HRTF_STATUS_SOFT"..0x1993,
        "NUM_HRTF_SPECIFIERS_SOFT"..0x1994
    )

    IntConstant(
        "Accepted as the {@code paramName} parameter of ALC10#alcGetString() and #GetStringiSOFT().",

        "HRTF_SPECIFIER_SOFT"..0x1995
    )

    IntConstant(
        "Possible results from a #HRTF_STATUS_SOFT query.",

        "HRTF_DISABLED_SOFT"..0x0000,
        "HRTF_ENABLED_SOFT"..0x0001,
        "HRTF_DENIED_SOFT"..0x0002,
        "HRTF_REQUIRED_SOFT"..0x0003,
        "HRTF_HEADPHONES_DETECTED_SOFT"..0x0004,
        "HRTF_UNSUPPORTED_FORMAT_SOFT"..0x0005
    )

    const..ALCcharUTF8_p(
        "GetStringiSOFT",
        """
        Returns a human-readable string for an HRTF.

        The returned string will be an implementation-defined UTF-8 encoded specifier for the given HRTF index, designed for display to the user. The returned
        strings are valid until the next enumeration point or the device is closed.
        """,

        ALCdevice_p.IN("device", "he same one that previously queried the number of HRTF specifiers"),
        ALCenum.IN("paramName", "the parameter to query", "#HRTF_SPECIFIER_SOFT"),
        ALCsizei.IN("index", "an index between 0 (inclusive) and the previously-queried HRTF count (exclusive)")
    )

    ALCboolean(
        "ResetDeviceSOFT",
        """
        Resets a device after it is opened for playback, to attempt changing the playback properties.
        """,

        ALCdevice_p.IN(
            "device",
            "a handle to a valid playback device as returned by #OpenDevice(), otherwise the call fails and an #INVALID_DEVICE error is generated"
        ),
        nullable..NullTerminated..const..ALCint_p.IN(
            "attrList",
            """
            the same as what could be passed to #CreateContext(). The AL is allowed to ignore attributes and attribute value combinations the device
            cannot support, for example if the device doesn't support the requested ALC10#ALC_FREQUENCY value, another value it does support may be set.
            """
        ),

        returnDoc =
        """
        on success the function returns ALC10#ALC_TRUE, and on failure the function returns ALC10#ALC_FALSE. Note that a return of ALC10#ALC_TRUE does not
        indicate any attributes were honored, just that the device was successfully reset. If you need to know what the attributes are after a reset, query the
        device using ALC10#alcGetIntegerv() with the relevant attributes.
        """
    )
}