/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package org.lwjgl.openvr.templates

import org.lwjgl.generator.*
import org.lwjgl.openvr.*

val VRSettings = "VRSettings".nativeClass(
    packageName = OPENVR_PACKAGE,
    prefixMethod = "VRSettings_",
    library = OPENVR_LIBRARY,
    binding = OPENVR_FNTABLE_BINDING
) {
    documentation =
        """
        """

    const..charASCII_p(
        "GetSettingsErrorNameFromEnum",
        "",

        EVRSettingsError.IN("eError", "")
    )

    bool(
        "Sync",
        "Returns true if file sync occurred (force or settings dirty).",

        bool.IN("bForce", ""),
        Check(1)..EVRSettingsError.p.OUT("peError", "")
    )

    void(
        "SetBool",
        "",

        const..charASCII_p.IN("pchSection", ""),
        const..charASCII_p.IN("pchSettingsKey", ""),
        bool.IN("bValue", ""),
        Check(1)..EVRSettingsError.p.OUT("peError", "")
    )

    void(
        "SetInt32",
        "",

        const..charASCII_p.IN("pchSection", ""),
        const..charASCII_p.IN("pchSettingsKey", ""),
        int32_t.IN("nValue", ""),
        Check(1)..EVRSettingsError.p.OUT("peError", "")
    )

    void(
        "SetFloat",
        "",

        const..charASCII_p.IN("pchSection", ""),
        const..charASCII_p.IN("pchSettingsKey", ""),
        float.IN("flValue", ""),
        Check(1)..EVRSettingsError.p.OUT("peError", "")
    )

    void(
        "SetString",
        "",

        const..charASCII_p.IN("pchSection", ""),
        const..charASCII_p.IN("pchSettingsKey", ""),
        const..charASCII_p.IN("pchValue", ""),
        Check(1)..EVRSettingsError.p.OUT("peError", "")
    )

    bool(
        "GetBool",
        "",

        const..charASCII_p.IN("pchSection", ""),
        const..charASCII_p.IN("pchSettingsKey", ""),
        Check(1)..EVRSettingsError.p.OUT("peError", "")
    )

    int32_t(
        "GetInt32",
        "",

        const..charASCII_p.IN("pchSection", ""),
        const..charASCII_p.IN("pchSettingsKey", ""),
        Check(1)..EVRSettingsError.p.OUT("peError", "")
    )

    float(
        "GetFloat",
        "",

        const..charASCII_p.IN("pchSection", ""),
        const..charASCII_p.IN("pchSettingsKey", ""),
        Check(1)..EVRSettingsError.p.OUT("peError", "")
    )

    void(
        "GetString",
        "",

        const..charASCII_p.IN("pchSection", ""),
        const..charASCII_p.IN("pchSettingsKey", ""),
        char_p.OUT("pchValue", ""),
        AutoSize("pchValue")..uint32_t.IN("unValueLen", ""),
        Check(1)..EVRSettingsError.p.OUT("peError", "")
    )

    void(
        "RemoveSection",
        "",

        const..charASCII_p.IN("pchSection", ""),
        Check(1)..EVRSettingsError.p.OUT("peError", "")
    )

    void(
        "RemoveKeyInSection",
        "",

        const..charASCII_p.IN("pchSection", ""),
        const..charASCII_p.IN("pchSettingsKey", ""),
        Check(1)..EVRSettingsError.p.OUT("peError", "")
    )
}