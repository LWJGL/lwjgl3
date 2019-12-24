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
    documentation = "Application management."

    EVRApplicationError(
        "AddApplicationManifest",
        """
        Adds an application manifest to the list to load when building the list of installed applications.

        Temporary manifests are not automatically loaded.
        """,

        charASCII.const.p("pchApplicationManifestFullPath", ""),
        bool("bTemporary", "")
    )

    EVRApplicationError(
        "RemoveApplicationManifest",
        "Removes an application manifest from the list to load when building the list of installed applications.",

        charASCII.const.p("pchApplicationManifestFullPath", "")
    )

    bool(
        "IsApplicationInstalled",
        "Returns true if an application is installed.",

        charASCII.const.p("pchAppKey", "")
    )

    uint32_t("GetApplicationCount", "Returns the number of applications available in the list.", void())

    EVRApplicationError(
        "GetApplicationKeyByIndex",
        """
        Returns the key of the specified application. The index is at least 0 and is less than the return value of #GetApplicationCount(). The buffer should be
        at least #k_unMaxApplicationKeyLength in order to fit the key.
        """,

        uint32_t("unApplicationIndex", ""),
        nullable..char.p("pchAppKeyBuffer", ""),
        AutoSize("pchAppKeyBuffer")..uint32_t("unAppKeyBufferLen", "")
    )

    EVRApplicationError(
        "GetApplicationKeyByProcessId",
        """
        Returns the key of the application for the specified Process Id. The buffer should be at least #k_unMaxApplicationKeyLength in order to fit the key.
        """,

        uint32_t("unProcessId", ""),
        nullable..char.p("pchAppKeyBuffer", ""),
        AutoSize("pchAppKeyBuffer")..uint32_t("unAppKeyBufferLen", "")
    )

    EVRApplicationError(
        "LaunchApplication",
        """
        Launches the application. The existing scene application will exit and then the new application will start.

        This call is not valid for dashboard overlay applications.
        """,

        charASCII.const.p("pchAppKey", "")
    )

    EVRApplicationError(
        "LaunchTemplateApplication",
        """
        Launches an instance of an application of type template, with its app key being {@code pchNewAppKey} (which must be unique) and optionally override
        sections from the manifest file via ##AppOverrideKeys.
        """,

        charASCII.const.p("pchTemplateAppKey", ""),
        charASCII.const.p("pchNewAppKey", ""),
        AppOverrideKeys_t.const.p("pKeys", ""),
        AutoSize("pKeys")..uint32_t("unKeys", "")
    )

    EVRApplicationError(
        "LaunchApplicationFromMimeType",
        """
        Launches the application currently associated with this mime type and passes it the option args, typically the filename or object name of the item
        being launched.
        """,

        charASCII.const.p("pchMimeType", ""),
        charASCII.const.p("pchArgs", "")
    )

    EVRApplicationError(
        "LaunchDashboardOverlay",
        "Launches the dashboard overlay application if it is not already running. This call is only valid for dashboard overlay applications.",

        charASCII.const.p("pchAppKey", "")
    )

    bool(
        "CancelApplicationLaunch",
        "Cancel a pending launch for an application.",

        charASCII.const.p("pchAppKey", "")
    )

    EVRApplicationError(
        "IdentifyApplication",
        """
        Identifies a running application. OpenVR can't always tell which process started in response to a URL. This function allows a URL handler (or the
        process itself) to identify the app key for the now running application. Passing a process ID of 0 identifies the calling process. The application must
        be one that's known to the system via a call to #AddApplicationManifest().
        """,

        uint32_t("unProcessId", ""),
        charASCII.const.p("pchAppKey", "")
    )

    uint32_t(
        "GetApplicationProcessId",
        "Returns the process ID for an application. Return 0 if the application was not found or is not running.",

        charASCII.const.p("pchAppKey", "")
    )

    charASCII.const.p(
        "GetApplicationsErrorNameFromEnum",
        "Returns a string for an applications error.",

        EVRApplicationError("error", "", "EVRApplicationError_\\w+")
    )

    uint32_t(
        "GetApplicationPropertyString",
        "Returns a value for an application property. The required buffer size to fit this value will be returned.",

        charASCII.const.p("pchAppKey", ""),
        EVRApplicationProperty("eProperty", "", "EVRApplicationProperty_\\w+_String"),
        Return(RESULT, "VR.k_unMaxPropertyStringSize", includesNT = true)..nullable..charASCII.p("pchPropertyValueBuffer", ""),
        AutoSize("pchPropertyValueBuffer")..uint32_t("unPropertyValueBufferLen", ""),
        Check(1)..EVRApplicationError.p("peError", "")
    )

    bool(
        "GetApplicationPropertyBool",
        "Returns a bool value for an application property. Returns false in all error cases.",

        charASCII.const.p("pchAppKey", ""),
        EVRApplicationProperty("eProperty", "", "EVRApplicationProperty_\\w+_Bool"),
        Check(1)..EVRApplicationError.p("peError", "")
    )

    uint64_t(
        "GetApplicationPropertyUint64",
        "Returns a uint64 value for an application property. Returns 0 in all error cases.",

        charASCII.const.p("pchAppKey", ""),
        EVRApplicationProperty("eProperty", "", "EVRApplicationProperty_\\w+_Uint64"),
        Check(1)..EVRApplicationError.p("peError", "")
    )

    EVRApplicationError(
        "SetApplicationAutoLaunch",
        """
        Sets the application auto-launch flag. This is only valid for applications which return true for
        #EVRApplicationProperty_VRApplicationProperty_IsDashboardOverlay_Bool.
        """,

        charASCII.const.p("pchAppKey", ""),
        bool("bAutoLaunch", "")
    )

    bool(
        "GetApplicationAutoLaunch",
        """
        Gets the application auto-launch flag. This is only valid for applications which return true for
        #EVRApplicationProperty_VRApplicationProperty_IsDashboardOverlay_Bool.
        """,

        charASCII.const.p("pchAppKey", "")
    )

    EVRApplicationError(
        "SetDefaultApplicationForMimeType",
        "Adds this mime-type to the list of supported mime types for this application.",

        charASCII.const.p("pchAppKey", ""),
        charASCII.const.p("pchMimeType", "")
    )

    bool(
        "GetDefaultApplicationForMimeType",
        "Return the app key that will open this mime type.",

        charASCII.const.p("pchMimeType", ""),
        nullable..char.p("pchAppKeyBuffer", ""),
        AutoSize("pchAppKeyBuffer")..uint32_t("unAppKeyBufferLen", "")
    )

    bool(
        "GetApplicationSupportedMimeTypes",
        "Get the list of supported mime types for this application, comma-delimited.",

        charASCII.const.p("pchAppKey", ""),
        nullable..char.p("pchMimeTypesBuffer", ""),
        AutoSize("pchMimeTypesBuffer")..uint32_t("unMimeTypesBuffer", "")
    )

    uint32_t(
        "GetApplicationsThatSupportMimeType",
        "Get the list of app-keys that support this mime type, comma-delimited, the return value is number of bytes you need to return the full string.",

        charASCII.const.p("pchMimeType", ""),
        Return(RESULT, includesNT = true)..nullable..charASCII.p("pchAppKeysThatSupportBuffer", ""),
        AutoSize("pchAppKeysThatSupportBuffer")..uint32_t("unAppKeysThatSupportBuffer", "")
    )

    uint32_t(
        "GetApplicationLaunchArguments",
        "Get the args list from an app launch that had the process already running, you call this when you get a #EVREventType_VREvent_ApplicationMimeTypeLoad.",

        uint32_t("unHandle", ""),
        Return(RESULT, includesNT = true)..nullable..charASCII.p("pchArgs", ""),
        AutoSize("pchArgs")..uint32_t("unArgs", "")
    )

    EVRApplicationError(
        "GetStartingApplication",
        "Returns the app key for the application that is starting up.",

        char.p("pchAppKeyBuffer", ""),
        AutoSize("pchAppKeyBuffer")..uint32_t("unAppKeyBufferLen", "")
    )

    EVRSceneApplicationState(
        "GetSceneApplicationState",
        "Returns the application transition state.",
        void()
    )

    EVRApplicationError(
        "PerformApplicationPrelaunchCheck",
        """
        Returns errors that would prevent the specified application from launching immediately. Calling this function will cause the current scene application
        to quit, so only call it when you are actually about to launch something else.

        What the caller should do about these failures depends on the failure:
        ${ul(
            """
            #EVRApplicationError_VRApplicationError_OldApplicationQuitting - An existing application has been told to quit. Wait for a
            #EVREventType_VREvent_ProcessQuit and try again.
            """,
            "#EVRApplicationError_VRApplicationError_ApplicationAlreadyStarting - This application is already starting. This is a permanent failure.",
            "#EVRApplicationError_VRApplicationError_LaunchInProgress - A different application is already starting. This is a permanent failure.",
            "#EVRApplicationError_VRApplicationError_None - Go ahead and launch. Everything is clear."
        )}
        """,

        charASCII.const.p("pchAppKey", "")
    )

    charASCII.const.p(
        "GetSceneApplicationStateNameFromEnum",
        "Returns a string for an application transition state.",

        EVRSceneApplicationState("state", "", "EVRSceneApplicationState_\\w+")
    )

    EVRApplicationError(
        "LaunchInternalProcess",
        """
        Starts a subprocess within the calling application. This suppresses all application transition UI and automatically identifies the new executable as
        part of the same application. On success the calling process should exit immediately. If working directory is #NULL or "" the directory portion of the
        binary path will be the working directory.
        """,

        charASCII.const.p("pchBinaryPath", ""),
        charASCII.const.p("pchArguments", ""),
        charASCII.const.p("pchWorkingDirectory", "")
    )

    uint32_t(
        "GetCurrentSceneProcessId",
        """
        Returns the current scene process ID according to the application system. A scene process will get scene focus once it starts rendering, but it will
        appear here once it calls {@code VR_Init} with the Scene application type.
        """,
        void()
    )
}