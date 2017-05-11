/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package org.lwjgl.openvr.templates

import org.lwjgl.generator.*
import org.lwjgl.openvr.*

val VRScreenshots = "VRScreenshots".nativeClass(
    packageName = OPENVR_PACKAGE,
    prefixMethod = "VRScreenshots_",
    library = OPENVR_LIBRARY,
    binding = OPENVR_FNTABLE_BINDING
) {
    documentation = "Allows the application to generate screenshots."

    EVRScreenshotError(
        "RequestScreenshot",
        """
        Request a screenshot of the requested type.

        A request of the #EVRScreenshotType_VRScreenshotType_Stereo type will always work. Other types will depend on the underlying application support.

        The first file name is for the preview image and should be a regular screenshot (ideally from the left eye). The second is the VR screenshot in the
        correct format. They should be in the same aspect ratio.

        Note that the VR dashboard will call this function when the user presses the screenshot binding (currently System Button + Trigger). If Steam is
        running, the destination file names will be in %TEMP% and will be copied into Steam's screenshot library for the running application once
        #SubmitScreenshot() is called. If Steam is not running, the paths will be in the user's documents folder under Documents\SteamVR\Screenshots. Other VR
        applications can call this to initate a screenshot outside of user control. The destination file names do not need an extension, will be replaced with
        the correct one for the format which is currently .png.
        """,

        Check(1)..ScreenshotHandle_t.p.OUT("pOutScreenshotHandle", ""),
        EVRScreenshotType.IN("type", "", "EVRScreenshotType_\\w+"),
        const..charASCII_p.IN("pchPreviewFilename", ""),
        const..charASCII_p.IN("pchVRFilename", "")
    )

    EVRScreenshotError(
        "HookScreenshot",
        """
        Called by the running VR application to indicate that it wishes to be in charge of screenshots. If the application does not call this, the Compositor
        will only support #EVRScreenshotType_VRScreenshotType_Stereo screenshots that will be captured without notification to the running app.

        Once hooked your application will receive a #EVREventType_VREvent_RequestScreenshot event when the user presses the buttons to take a screenshot.
        """,

        const..EVRScreenshotType.p.IN("pSupportedTypes", ""),
        AutoSize("pSupportedTypes")..int.IN("numTypes", "")
    )

    EVRScreenshotType(
        "GetScreenshotPropertyType",
        "When your application receives a #EVREventType_VREvent_RequestScreenshot event, call these functions to get the details of the screenshot request.",

        ScreenshotHandle_t.IN("screenshotHandle", ""),
        Check(1)..EVRScreenshotError.p.OUT("pError", "")
    )

    uint32_t(
        "GetScreenshotPropertyFilename",
        "Get the filename for the preview or vr image (see {@code EScreenshotPropertyFilenames}).",

        ScreenshotHandle_t.IN("screenshotHandle", ""),
        EVRScreenshotPropertyFilenames.IN("filenameType", "", "EVRScreenshotPropertyFilenames_\\w+"),
        Return(RESULT, includesNT = true)..nullable..charASCII_p.OUT("pchFilename", ""),
        AutoSize("pchFilename")..uint32_t.IN("cchFilename", ""),
        Check(1)..EVRScreenshotError.p.OUT("pError", ""),

        returnDoc = "the size of the string"
    )

    EVRScreenshotError(
        "UpdateScreenshotProgress",
        """
        Call this if the application is taking the screen shot will take more than a few ms processing. This will result in an overlay being presented that
        shows a completion bar.
        """,

        ScreenshotHandle_t.IN("screenshotHandle", ""),
        float.IN("flProgress", "")
    )

    EVRScreenshotError(
        "TakeStereoScreenshot",
        """
        Tells the compositor to take an internal screenshot of type #EVRScreenshotType_VRScreenshotType_Stereo. It will take the current submitted scene
        textures of the running application and write them into the preview image and a side-by-side file for the VR image.

        This is similiar to request screenshot, but doesn't ever talk to the application, just takes the shot and submits.
        """,

        Check(1)..ScreenshotHandle_t.p.OUT("pOutScreenshotHandle", ""),
        const..charASCII_p.IN("pchPreviewFilename", ""),
        const..charASCII_p.IN("pchVRFilename", "")
    )

    EVRScreenshotError(
        "SubmitScreenshot",
        """
        Submit the completed screenshot.

        If Steam is running this will call into the Steam client and upload the screenshot to the screenshots section of the library for the running
        application. If Steam is not running, this function will display a notification to the user that the screenshot was taken. The paths should be full
        paths with extensions.

        File paths should be absolute including extensions.

        {@code screenshotHandle} can be #k_unScreenshotHandleInvalid if this was a new shot taking by the app to be saved and not initiated by a user
        (achievement earned or something).
        """,

        ScreenshotHandle_t.IN("screenshotHandle", ""),
        EVRScreenshotType.IN("type", "", "EVRScreenshotType_\\w+"),
        const..charASCII_p.IN("pchSourcePreviewFilename", ""),
        const..charASCII_p.IN("pchSourceVRFilename", "")
    )
}