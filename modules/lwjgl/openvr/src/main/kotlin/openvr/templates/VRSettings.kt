/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package openvr.templates

import org.lwjgl.generator.*
import openvr.*

val VRSettings = "VRSettings".nativeClass(
    Module.OPENVR,
    prefixMethod = "VRSettings_",
    library = OPENVR_LIBRARY,
    binding = OPENVR_FNTABLE_BINDING
) {
    documentation =
        """
        """

    charASCII.const.p(
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

        charASCII.const.p.IN("pchSection", ""),
        charASCII.const.p.IN("pchSettingsKey", ""),
        bool.IN("bValue", ""),
        Check(1)..EVRSettingsError.p.OUT("peError", "")
    )

    void(
        "SetInt32",
        "",

        charASCII.const.p.IN("pchSection", ""),
        charASCII.const.p.IN("pchSettingsKey", ""),
        int32_t.IN("nValue", ""),
        Check(1)..EVRSettingsError.p.OUT("peError", "")
    )

    void(
        "SetFloat",
        "",

        charASCII.const.p.IN("pchSection", ""),
        charASCII.const.p.IN("pchSettingsKey", ""),
        float.IN("flValue", ""),
        Check(1)..EVRSettingsError.p.OUT("peError", "")
    )

    void(
        "SetString",
        "",

        charASCII.const.p.IN("pchSection", ""),
        charASCII.const.p.IN("pchSettingsKey", ""),
        charASCII.const.p.IN("pchValue", ""),
        Check(1)..EVRSettingsError.p.OUT("peError", "")
    )

    bool(
        "GetBool",
        "",

        charASCII.const.p.IN("pchSection", ""),
        charASCII.const.p.IN("pchSettingsKey", ""),
        Check(1)..EVRSettingsError.p.OUT("peError", "")
    )

    int32_t(
        "GetInt32",
        "",

        charASCII.const.p.IN("pchSection", ""),
        charASCII.const.p.IN("pchSettingsKey", ""),
        Check(1)..EVRSettingsError.p.OUT("peError", "")
    )

    float(
        "GetFloat",
        "",

        charASCII.const.p.IN("pchSection", ""),
        charASCII.const.p.IN("pchSettingsKey", ""),
        Check(1)..EVRSettingsError.p.OUT("peError", "")
    )

    void(
        "GetString",
        "",

        charASCII.const.p.IN("pchSection", ""),
        charASCII.const.p.IN("pchSettingsKey", ""),
        char.p.OUT("pchValue", ""),
        AutoSize("pchValue")..uint32_t.IN("unValueLen", ""),
        Check(1)..EVRSettingsError.p.OUT("peError", "")
    )

    void(
        "RemoveSection",
        "",

        charASCII.const.p.IN("pchSection", ""),
        Check(1)..EVRSettingsError.p.OUT("peError", "")
    )

    void(
        "RemoveKeyInSection",
        "",

        charASCII.const.p.IN("pchSection", ""),
        charASCII.const.p.IN("pchSettingsKey", ""),
        Check(1)..EVRSettingsError.p.OUT("peError", "")
    )
}