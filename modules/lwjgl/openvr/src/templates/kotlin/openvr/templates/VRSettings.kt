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

    void(
        "SetBool",
        "",

        charASCII.const.p("pchSection", ""),
        charASCII.const.p("pchSettingsKey", ""),
        bool("bValue", ""),
        Check(1)..EVRSettingsError.p("peError", "")
    )

    void(
        "SetInt32",
        "",

        charASCII.const.p("pchSection", ""),
        charASCII.const.p("pchSettingsKey", ""),
        int32_t("nValue", ""),
        Check(1)..EVRSettingsError.p("peError", "")
    )

    void(
        "SetFloat",
        "",

        charASCII.const.p("pchSection", ""),
        charASCII.const.p("pchSettingsKey", ""),
        float("flValue", ""),
        Check(1)..EVRSettingsError.p("peError", "")
    )

    void(
        "SetString",
        "",

        charASCII.const.p("pchSection", ""),
        charASCII.const.p("pchSettingsKey", ""),
        charASCII.const.p("pchValue", ""),
        Check(1)..EVRSettingsError.p("peError", "")
    )

    bool(
        "GetBool",
        "",

        charASCII.const.p("pchSection", ""),
        charASCII.const.p("pchSettingsKey", ""),
        Check(1)..EVRSettingsError.p("peError", "")
    )

    int32_t(
        "GetInt32",
        "",

        charASCII.const.p("pchSection", ""),
        charASCII.const.p("pchSettingsKey", ""),
        Check(1)..EVRSettingsError.p("peError", "")
    )

    float(
        "GetFloat",
        "",

        charASCII.const.p("pchSection", ""),
        charASCII.const.p("pchSettingsKey", ""),
        Check(1)..EVRSettingsError.p("peError", "")
    )

    void(
        "GetString",
        "",

        charASCII.const.p("pchSection", ""),
        charASCII.const.p("pchSettingsKey", ""),
        char.p("pchValue", ""),
        AutoSize("pchValue")..uint32_t("unValueLen", ""),
        Check(1)..EVRSettingsError.p("peError", "")
    )

    void(
        "RemoveSection",
        "",

        charASCII.const.p("pchSection", ""),
        Check(1)..EVRSettingsError.p("peError", "")
    )

    void(
        "RemoveKeyInSection",
        "",

        charASCII.const.p("pchSection", ""),
        charASCII.const.p("pchSettingsKey", ""),
        Check(1)..EVRSettingsError.p("peError", "")
    )
}