/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package openvr.templates

import org.lwjgl.generator.*
import openvr.*

val VRApplications = "VRApplications".nativeClass(
    Module.OPENVR,
    prefixMethod = "VRApplications_",
    binding = OPENVR_FNTABLE_BINDING
) {
    EVRApplicationError(
        "AddApplicationManifest",

        charASCII.const.p("pchApplicationManifestFullPath"),
        bool("bTemporary")
    )

    EVRApplicationError(
        "RemoveApplicationManifest",

        charASCII.const.p("pchApplicationManifestFullPath")
    )

    bool(
        "IsApplicationInstalled",

        charASCII.const.p("pchAppKey")
    )

    uint32_t("GetApplicationCount", void())

    EVRApplicationError(
        "GetApplicationKeyByIndex",

        uint32_t("unApplicationIndex"),
        nullable..char.p("pchAppKeyBuffer"),
        AutoSize("pchAppKeyBuffer")..uint32_t("unAppKeyBufferLen")
    )

    EVRApplicationError(
        "GetApplicationKeyByProcessId",

        uint32_t("unProcessId"),
        nullable..char.p("pchAppKeyBuffer"),
        AutoSize("pchAppKeyBuffer")..uint32_t("unAppKeyBufferLen")
    )

    EVRApplicationError(
        "LaunchApplication",

        charASCII.const.p("pchAppKey")
    )

    EVRApplicationError(
        "LaunchTemplateApplication",

        charASCII.const.p("pchTemplateAppKey"),
        charASCII.const.p("pchNewAppKey"),
        AppOverrideKeys_t.const.p("pKeys"),
        AutoSize("pKeys")..uint32_t("unKeys")
    )

    EVRApplicationError(
        "LaunchApplicationFromMimeType",

        charASCII.const.p("pchMimeType"),
        charASCII.const.p("pchArgs")
    )

    EVRApplicationError(
        "LaunchDashboardOverlay",

        charASCII.const.p("pchAppKey")
    )

    bool(
        "CancelApplicationLaunch",

        charASCII.const.p("pchAppKey")
    )

    EVRApplicationError(
        "IdentifyApplication",

        uint32_t("unProcessId"),
        charASCII.const.p("pchAppKey")
    )

    uint32_t(
        "GetApplicationProcessId",

        charASCII.const.p("pchAppKey")
    )

    charASCII.const.p(
        "GetApplicationsErrorNameFromEnum",

        EVRApplicationError("error")
    )

    uint32_t(
        "GetApplicationPropertyString",

        charASCII.const.p("pchAppKey"),
        EVRApplicationProperty("eProperty"),
        Return(RESULT, "VR.k_unMaxPropertyStringSize", includesNT = true)..nullable..charASCII.p("pchPropertyValueBuffer"),
        AutoSize("pchPropertyValueBuffer")..uint32_t("unPropertyValueBufferLen"),
        Check(1)..EVRApplicationError.p("peError")
    )

    bool(
        "GetApplicationPropertyBool",

        charASCII.const.p("pchAppKey"),
        EVRApplicationProperty("eProperty"),
        Check(1)..EVRApplicationError.p("peError")
    )

    uint64_t(
        "GetApplicationPropertyUint64",

        charASCII.const.p("pchAppKey"),
        EVRApplicationProperty("eProperty"),
        Check(1)..EVRApplicationError.p("peError")
    )

    EVRApplicationError(
        "SetApplicationAutoLaunch",

        charASCII.const.p("pchAppKey"),
        bool("bAutoLaunch")
    )

    bool(
        "GetApplicationAutoLaunch",

        charASCII.const.p("pchAppKey")
    )

    EVRApplicationError(
        "SetDefaultApplicationForMimeType",

        charASCII.const.p("pchAppKey"),
        charASCII.const.p("pchMimeType")
    )

    bool(
        "GetDefaultApplicationForMimeType",

        charASCII.const.p("pchMimeType"),
        nullable..char.p("pchAppKeyBuffer"),
        AutoSize("pchAppKeyBuffer")..uint32_t("unAppKeyBufferLen")
    )

    bool(
        "GetApplicationSupportedMimeTypes",

        charASCII.const.p("pchAppKey"),
        nullable..char.p("pchMimeTypesBuffer"),
        AutoSize("pchMimeTypesBuffer")..uint32_t("unMimeTypesBuffer")
    )

    uint32_t(
        "GetApplicationsThatSupportMimeType",

        charASCII.const.p("pchMimeType"),
        Return(RESULT, includesNT = true)..nullable..charASCII.p("pchAppKeysThatSupportBuffer"),
        AutoSize("pchAppKeysThatSupportBuffer")..uint32_t("unAppKeysThatSupportBuffer")
    )

    uint32_t(
        "GetApplicationLaunchArguments",

        uint32_t("unHandle"),
        Return(RESULT, includesNT = true)..nullable..charASCII.p("pchArgs"),
        AutoSize("pchArgs")..uint32_t("unArgs")
    )

    EVRApplicationError(
        "GetStartingApplication",

        char.p("pchAppKeyBuffer"),
        AutoSize("pchAppKeyBuffer")..uint32_t("unAppKeyBufferLen")
    )

    EVRSceneApplicationState(
        "GetSceneApplicationState",
        void()
    )

    EVRApplicationError(
        "PerformApplicationPrelaunchCheck",

        charASCII.const.p("pchAppKey")
    )

    charASCII.const.p(
        "GetSceneApplicationStateNameFromEnum",

        EVRSceneApplicationState("state")
    )

    EVRApplicationError(
        "LaunchInternalProcess",

        charASCII.const.p("pchBinaryPath"),
        charASCII.const.p("pchArguments"),
        charASCII.const.p("pchWorkingDirectory")
    )

    uint32_t(
        "GetCurrentSceneProcessId",
        void()
    )
}