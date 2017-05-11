/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package org.lwjgl.openvr.templates

import org.lwjgl.generator.*
import org.lwjgl.openvr.*

val VRApplications = "VRApplications".nativeClass(
    packageName = OPENVR_PACKAGE,
    prefixMethod = "VRApplications_",
    library = OPENVR_LIBRARY,
    binding = OPENVR_FNTABLE_BINDING
) {
    documentation = "Application management."

    EVRApplicationError(
        "AddApplicationManifest",
        """
        Adds an application manifest to the list to load when building the list of installed applications.

        Temporary manifests are not automatically loaded.
        """,

        const..charASCII_p.IN("pchApplicationManifestFullPath", ""),
        bool.IN("bTemporary", "")
    )

    EVRApplicationError(
        "RemoveApplicationManifest",
        "Removes an application manifest from the list to load when building the list of installed applications.",

        const..charASCII_p.IN("pchApplicationManifestFullPath", "")
    )

    bool(
        "IsApplicationInstalled",
        "Returns true if an application is installed.",

        const..charASCII_p.IN("pchAppKey", "")
    )

    uint32_t(
        "GetApplicationCount",
        "Returns the number of applications available in the list."
    )

    EVRApplicationError(
        "GetApplicationKeyByIndex",
        """
        Returns the key of the specified application. The index is at least 0 and is less than the return value of #GetApplicationCount(). The buffer should be
        at least #k_unMaxApplicationKeyLength in order to fit the key.
        """,

        uint32_t.IN("unApplicationIndex", ""),
        nullable..char_p.OUT("pchAppKeyBuffer", ""),
        AutoSize("pchAppKeyBuffer")..uint32_t.IN("unAppKeyBufferLen", "")
    )

    EVRApplicationError(
        "GetApplicationKeyByProcessId",
        """
        Returns the key of the application for the specified Process Id. The buffer should be at least #k_unMaxApplicationKeyLength in order to fit the key.
        """,

        uint32_t.IN("unProcessId", ""),
        nullable..char_p.OUT("pchAppKeyBuffer", ""),
        AutoSize("pchAppKeyBuffer")..uint32_t.IN("unAppKeyBufferLen", "")
    )

    EVRApplicationError(
        "LaunchApplication",
        """
        Launches the application. The existing scene application will exit and then the new application will start.

        This call is not valid for dashboard overlay applications.
        """,

        const..charASCII_p.IN("pchAppKey", "")
    )

    EVRApplicationError(
        "LaunchTemplateApplication",
        """
        Launches an instance of an application of type template, with its app key being {@code pchNewAppKey} (which must be unique) and optionally override
        sections from the manifest file via ##AppOverrideKeys.
        """,

        const..charASCII_p.IN("pchTemplateAppKey", ""),
        const..charASCII_p.IN("pchNewAppKey", ""),
        const..AppOverrideKeys_t.p.IN("pKeys", ""),
        AutoSize("pKeys")..uint32_t.IN("unKeys", "")
    )

    EVRApplicationError(
        "LaunchApplicationFromMimeType",
        """
        Launches the application currently associated with this mime type and passes it the option args, typically the filename or object name of the item
        being launched.
        """,

        const..charASCII_p.IN("pchMimeType", ""),
        const..charASCII_p.IN("pchArgs", "")
    )

    EVRApplicationError(
        "LaunchDashboardOverlay",
        "Launches the dashboard overlay application if it is not already running. This call is only valid for dashboard overlay applications.",

        const..charASCII_p.IN("pchAppKey", "")
    )

    bool(
        "CancelApplicationLaunch",
        "Cancel a pending launch for an application.",

        const..charASCII_p.IN("pchAppKey", "")
    )

    EVRApplicationError(
        "IdentifyApplication",
        """
        Identifies a running application. OpenVR can't always tell which process started in response to a URL. This function allows a URL handler (or the
        process itself) to identify the app key for the now running application. Passing a process ID of 0 identifies the calling process. The application must
        be one that's known to the system via a call to #AddApplicationManifest().
        """,

        uint32_t.IN("unProcessId", ""),
        const..charASCII_p.IN("pchAppKey", "")
    )

    uint32_t(
        "GetApplicationProcessId",
        "Returns the process ID for an application. Return 0 if the application was not found or is not running.",

        const..charASCII_p.IN("pchAppKey", "")
    )

    const..charASCII_p(
        "GetApplicationsErrorNameFromEnum",
        "Returns a string for an applications error.",

        EVRApplicationError.IN("error", "", "EVRApplicationError_\\w+")
    )

    uint32_t(
        "GetApplicationPropertyString",
        "Returns a value for an application property. The required buffer size to fit this value will be returned.",

        const..charASCII_p.IN("pchAppKey", ""),
        EVRApplicationProperty.IN("eProperty", "", "EVRApplicationProperty_\\w+_String"),
        Return(RESULT, "VR.k_unMaxPropertyStringSize", includesNT = true)..nullable..charASCII_p.OUT("pchPropertyValueBuffer", ""),
        AutoSize("pchPropertyValueBuffer")..uint32_t.IN("unPropertyValueBufferLen", ""),
        Check(1)..EVRApplicationError.p.OUT("peError", "")
    )

    bool(
        "GetApplicationPropertyBool",
        "Returns a bool value for an application property. Returns false in all error cases.",

        const..charASCII_p.IN("pchAppKey", ""),
        EVRApplicationProperty.IN("eProperty", "", "EVRApplicationProperty_\\w+_Bool"),
        Check(1)..EVRApplicationError.p.OUT("peError", "")
    )

    uint64_t(
        "GetApplicationPropertyUint64",
        "Returns a uint64 value for an application property. Returns 0 in all error cases.",

        const..charASCII_p.IN("pchAppKey", ""),
        EVRApplicationProperty.IN("eProperty", "", "EVRApplicationProperty_\\w+_Uint64"),
        Check(1)..EVRApplicationError.p.OUT("peError", "")
    )

    EVRApplicationError(
        "SetApplicationAutoLaunch",
        """
        Sets the application auto-launch flag. This is only valid for applications which return true for
        #EVRApplicationProperty_VRApplicationProperty_IsDashboardOverlay_Bool.
        """,

        const..charASCII_p.IN("pchAppKey", ""),
        bool.IN("bAutoLaunch", "")
    )

    bool(
        "GetApplicationAutoLaunch",
        """
        Gets the application auto-launch flag. This is only valid for applications which return true for
        #EVRApplicationProperty_VRApplicationProperty_IsDashboardOverlay_Bool.
        """,

        const..charASCII_p.IN("pchAppKey", "")
    )

    EVRApplicationError(
        "SetDefaultApplicationForMimeType",
        "Adds this mime-type to the list of supported mime types for this application.",

        const..charASCII_p.IN("pchAppKey", ""),
        const..charASCII_p.IN("pchMimeType", "")
    )

    bool(
        "GetDefaultApplicationForMimeType",
        "Return the app key that will open this mime type.",

        const..charASCII_p.IN("pchMimeType", ""),
        nullable..char_p.OUT("pchAppKeyBuffer", ""),
        AutoSize("pchAppKeyBuffer")..uint32_t.IN("unAppKeyBufferLen", "")
    )

    bool(
        "GetApplicationSupportedMimeTypes",
        "Get the list of supported mime types for this application, comma-delimited.",

        const..charASCII_p.IN("pchAppKey", ""),
        nullable..char_p.OUT("pchMimeTypesBuffer", ""),
        AutoSize("pchMimeTypesBuffer")..uint32_t.IN("unMimeTypesBuffer", "")
    )

    uint32_t(
        "GetApplicationsThatSupportMimeType",
        "Get the list of app-keys that support this mime type, comma-delimited, the return value is number of bytes you need to return the full string.",

        const..charASCII_p.IN("pchMimeType", ""),
        Return(RESULT, includesNT = true)..nullable..charASCII_p.OUT("pchAppKeysThatSupportBuffer", ""),
        AutoSize("pchAppKeysThatSupportBuffer")..uint32_t.IN("unAppKeysThatSupportBuffer", "")
    )

    uint32_t(
        "GetApplicationLaunchArguments",
        "Get the args list from an app launch that had the process already running, you call this when you get a #EVREventType_VREvent_ApplicationMimeTypeLoad.",

        uint32_t.IN("unHandle", ""),
        Return(RESULT, includesNT = true)..nullable..charASCII_p.OUT("pchArgs", ""),
        AutoSize("pchArgs")..uint32_t.IN("unArgs", "")
    )

    EVRApplicationError(
        "GetStartingApplication",
        "Returns the app key for the application that is starting up.",

        char_p.OUT("pchAppKeyBuffer", ""),
        AutoSize("pchAppKeyBuffer")..uint32_t.IN("unAppKeyBufferLen", "")
    )

    EVRApplicationTransitionState(
        "GetTransitionState",
        "Returns the application transition state."
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

        const..charASCII_p.IN("pchAppKey", "")
    )

    const..charASCII_p(
        "GetApplicationsTransitionStateNameFromEnum",
        "Returns a string for an application transition state.",

        EVRApplicationTransitionState.IN("state", "", "EVRApplicationTransitionState_\\w+")
    )

    bool(
        "IsQuitUserPromptRequested",
        "Returns true if the outgoing scene app has requested a save prompt before exiting."
    )

    EVRApplicationError(
        "LaunchInternalProcess",
        """
        Starts a subprocess within the calling application. This suppresses all application transition UI and automatically identifies the new executable as
        part of the same application. On success the calling process should exit immediately. If working directory is #NULL or "" the directory portion of the
        binary path will be the working directory.
        """,

        const..charASCII_p.IN("pchBinaryPath", ""),
        const..charASCII_p.IN("pchArguments", ""),
        const..charASCII_p.IN("pchWorkingDirectory", "")
    )

    uint32_t(
        "GetCurrentSceneProcessId",
        """
        Returns the current scene process ID according to the application system. A scene process will get scene focus once it starts rendering, but it will
        appear here once it calls {@code VR_Init} with the Scene application.
        * type.
        """
    )
}