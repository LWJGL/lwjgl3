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

        EVRSettingsError("eError", "")
    )

    bool(
        "Sync",
        "Returns true if file sync occurred (force or settings dirty).",

        bool("bForce", ""),
        Check(1)..EVRSettingsError.p.OUT("peError", "")
    )

    void(
        "SetBool",
        "",

        charASCII.const.p("pchSection", ""),
        charASCII.const.p("pchSettingsKey", ""),
        bool("bValue", ""),
        Check(1)..EVRSettingsError.p.OUT("peError", "")
    )

    void(
        "SetInt32",
        "",

        charASCII.const.p("pchSection", ""),
        charASCII.const.p("pchSettingsKey", ""),
        int32_t("nValue", ""),
        Check(1)..EVRSettingsError.p.OUT("peError", "")
    )

    void(
        "SetFloat",
        "",

        charASCII.const.p("pchSection", ""),
        charASCII.const.p("pchSettingsKey", ""),
        float("flValue", ""),
        Check(1)..EVRSettingsError.p.OUT("peError", "")
    )

    void(
        "SetString",
        "",

        charASCII.const.p("pchSection", ""),
        charASCII.const.p("pchSettingsKey", ""),
        charASCII.const.p("pchValue", ""),
        Check(1)..EVRSettingsError.p.OUT("peError", "")
    )

    bool(
        "GetBool",
        "",

        charASCII.const.p("pchSection", ""),
        charASCII.const.p("pchSettingsKey", ""),
        Check(1)..EVRSettingsError.p.OUT("peError", "")
    )

    int32_t(
        "GetInt32",
        "",

        charASCII.const.p("pchSection", ""),
        charASCII.const.p("pchSettingsKey", ""),
        Check(1)..EVRSettingsError.p.OUT("peError", "")
    )

    float(
        "GetFloat",
        "",

        charASCII.const.p("pchSection", ""),
        charASCII.const.p("pchSettingsKey", ""),
        Check(1)..EVRSettingsError.p.OUT("peError", "")
    )

    void(
        "GetString",
        "",

        charASCII.const.p("pchSection", ""),
        charASCII.const.p("pchSettingsKey", ""),
        char.p.OUT("pchValue", ""),
        AutoSize("pchValue")..uint32_t("unValueLen", ""),
        Check(1)..EVRSettingsError.p.OUT("peError", "")
    )

    void(
        "RemoveSection",
        "",

        charASCII.const.p("pchSection", ""),
        Check(1)..EVRSettingsError.p.OUT("peError", "")
    )

    void(
        "RemoveKeyInSection",
        "",

        charASCII.const.p("pchSection", ""),
        charASCII.const.p("pchSettingsKey", ""),
        Check(1)..EVRSettingsError.p.OUT("peError", "")
    )
}