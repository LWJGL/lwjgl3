/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package openvr.templates

import org.lwjgl.generator.*
import openvr.*

val VRScreenshots = "VRScreenshots".nativeClass(
    Module.OPENVR,
    prefixMethod = "VRScreenshots_",
    binding = OPENVR_FNTABLE_BINDING
) {
    EVRScreenshotError(
        "RequestScreenshot",

        Check(1)..ScreenshotHandle_t.p("pOutScreenshotHandle"),
        EVRScreenshotType("type"),
        charASCII.const.p("pchPreviewFilename"),
        charASCII.const.p("pchVRFilename")
    )

    EVRScreenshotError(
        "HookScreenshot",

        EVRScreenshotType.const.p("pSupportedTypes"),
        AutoSize("pSupportedTypes")..int("numTypes")
    )

    EVRScreenshotType(
        "GetScreenshotPropertyType",

        ScreenshotHandle_t("screenshotHandle"),
        Check(1)..EVRScreenshotError.p("pError")
    )

    uint32_t(
        "GetScreenshotPropertyFilename",

        ScreenshotHandle_t("screenshotHandle"),
        EVRScreenshotPropertyFilenames("filenameType"),
        Return(RESULT, includesNT = true)..nullable..charASCII.p("pchFilename"),
        AutoSize("pchFilename")..uint32_t("cchFilename"),
        Check(1)..EVRScreenshotError.p("pError")
    )

    EVRScreenshotError(
        "UpdateScreenshotProgress",

        ScreenshotHandle_t("screenshotHandle"),
        float("flProgress")
    )

    EVRScreenshotError(
        "TakeStereoScreenshot",

        Check(1)..ScreenshotHandle_t.p("pOutScreenshotHandle"),
        charASCII.const.p("pchPreviewFilename"),
        charASCII.const.p("pchVRFilename")
    )

    EVRScreenshotError(
        "SubmitScreenshot",

        ScreenshotHandle_t("screenshotHandle"),
        EVRScreenshotType("type"),
        charASCII.const.p("pchSourcePreviewFilename"),
        charASCII.const.p("pchSourceVRFilename")
    )
}