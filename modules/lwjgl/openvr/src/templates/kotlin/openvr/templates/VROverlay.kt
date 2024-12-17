/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package openvr.templates

import org.lwjgl.generator.*
import openvr.*

val VROverlay = "VROverlay".nativeClass(
    Module.OPENVR,
    prefixMethod = "VROverlay_",
    binding = OPENVR_FNTABLE_BINDING
) {
    nativeDirective("""
#ifdef LWJGL_WINDOWS
    #define APIENTRY __stdcall
#else
    #define APIENTRY
#endif

typedef struct HmdVector2_t
{
    float v[2];
} HmdVector2_t;

typedef struct HmdRect2_t
{
	struct HmdVector2_t vTopLeft;
	struct HmdVector2_t vBottomRight;
} HmdRect2_t;""")

    EVROverlayError(
        "FindOverlay",

        charASCII.const.p("pchOverlayKey"),
        Check(1)..VROverlayHandle_t.p("pOverlayHandle")
    )

    EVROverlayError(
        "CreateOverlay",

        charASCII.const.p("pchOverlayKey"),
        charASCII.const.p("pchOverlayName"),
        Check(1)..VROverlayHandle_t.p("pOverlayHandle")
    )

    EVROverlayError(
        "DestroyOverlay",

        VROverlayHandle_t("ulOverlayHandle")
    )

    uint32_t(
        "GetOverlayKey",

        VROverlayHandle_t("ulOverlayHandle"),
        Return(RESULT, includesNT = true)..nullable..charASCII.p("pchValue"),
        AutoSize("pchValue")..uint32_t("unBufferSize"),
        Check(1)..EVROverlayError.p("pError")
    )

    uint32_t(
        "GetOverlayName",

        VROverlayHandle_t("ulOverlayHandle"),
        Return(RESULT, includesNT = true)..nullable..charASCII.p("pchValue"),
        AutoSize("pchValue")..uint32_t("unBufferSize"),
        Check(1)..EVROverlayError.p("pError")
    )

    EVROverlayError(
        "SetOverlayName",

        VROverlayHandle_t("ulOverlayHandle"),
        charASCII.const.p("pchName")
    )

    EVROverlayError(
        "GetOverlayImageData",

        VROverlayHandle_t("ulOverlayHandle"),
        void.p("pvBuffer"),
        AutoSize("pvBuffer")..uint32_t("unBufferSize"),
        Check(1)..uint32_t.p("punWidth"),
        Check(1)..uint32_t.p("punHeight")
    )

    charASCII.const.p(
        "GetOverlayErrorNameFromEnum",

        EVROverlayError("error")
    )

    EVROverlayError(
        "SetOverlayRenderingPid",

        VROverlayHandle_t("ulOverlayHandle"),
        uint32_t("unPID")
    )

    uint32_t(
        "GetOverlayRenderingPid",

        VROverlayHandle_t("ulOverlayHandle")
    )

    EVROverlayError(
        "SetOverlayFlag",

        VROverlayHandle_t("ulOverlayHandle"),
        VROverlayFlags("eOverlayFlag"),
        bool("bEnabled")
    )

    EVROverlayError(
        "GetOverlayFlag",

        VROverlayHandle_t("ulOverlayHandle"),
        VROverlayFlags("eOverlayFlag"),
        Check(1)..bool.p("pbEnabled")
    )

    EVROverlayError(
        "GetOverlayFlags",

        VROverlayHandle_t("ulOverlayHandle"),
        Check(1)..uint32_t.p("pFlags")
    )

    EVROverlayError(
        "SetOverlayColor",

        VROverlayHandle_t("ulOverlayHandle"),
        float("fRed"),
        float("fGreen"),
        float("fBlue")
    )

    EVROverlayError(
        "GetOverlayColor",

        VROverlayHandle_t("ulOverlayHandle"),
        Check(1)..float.p("pfRed"),
        Check(1)..float.p("pfGreen"),
        Check(1)..float.p("pfBlue")
    )

    EVROverlayError(
        "SetOverlayAlpha",

        VROverlayHandle_t("ulOverlayHandle"),
        float("fAlpha")
    )

    EVROverlayError(
        "GetOverlayAlpha",

        VROverlayHandle_t("ulOverlayHandle"),
        Check(1)..float.p("pfAlpha")
    )

    EVROverlayError(
        "SetOverlayTexelAspect",

        VROverlayHandle_t("ulOverlayHandle"),
        float("fTexelAspect")
    )

    EVROverlayError(
        "GetOverlayTexelAspect",

        VROverlayHandle_t("ulOverlayHandle"),
        Check(1)..float.p("pfTexelAspect")
    )

    EVROverlayError(
        "SetOverlaySortOrder",

        VROverlayHandle_t("ulOverlayHandle"),
        uint32_t("unSortOrder")
    )

    EVROverlayError(
        "GetOverlaySortOrder",

        VROverlayHandle_t("ulOverlayHandle"),
        Check(1)..uint32_t.p("punSortOrder")
    )

    EVROverlayError(
        "SetOverlayWidthInMeters",

        VROverlayHandle_t("ulOverlayHandle"),
        float("fWidthInMeters")
    )

    EVROverlayError(
        "GetOverlayWidthInMeters",

        VROverlayHandle_t("ulOverlayHandle"),
        Check(1)..float.p("pfWidthInMeters")
    )

    EVROverlayError(
        "SetOverlayCurvature",

        VROverlayHandle_t("ulOverlayHandle"),
        float("fCurvature")
    )

    EVROverlayError(
        "GetOverlayCurvature",

        VROverlayHandle_t("ulOverlayHandle"),
        Check(1)..float.p("pfCurvature")
    )

    EVROverlayError(
        "SetOverlayPreCurvePitch",

        VROverlayHandle_t("ulOverlayHandle"),
        float("fRadians")
    )

    EVROverlayError(
        "GetOverlayPreCurvePitch",

        VROverlayHandle_t("ulOverlayHandle"),
        Check(1)..float.p("pfRadians")
    )

    EVROverlayError(
        "SetOverlayTextureColorSpace",

        VROverlayHandle_t("ulOverlayHandle"),
        EColorSpace("eTextureColorSpace")
    )

    EVROverlayError(
        "GetOverlayTextureColorSpace",

        VROverlayHandle_t("ulOverlayHandle"),
        Check(1)..EColorSpace.p("peTextureColorSpace")
    )

    EVROverlayError(
        "SetOverlayTextureBounds",

        VROverlayHandle_t("ulOverlayHandle"),
        VRTextureBounds_t.const.p("pOverlayTextureBounds")
    )

    EVROverlayError(
        "GetOverlayTextureBounds",

        VROverlayHandle_t("ulOverlayHandle"),
        VRTextureBounds_t.p("pOverlayTextureBounds")
    )

    EVROverlayError(
        "GetOverlayTransformType",

        VROverlayHandle_t("ulOverlayHandle"),
        Check(1)..VROverlayTransformType.p("peTransformType")
    )

    EVROverlayError(
        "SetOverlayTransformAbsolute",

        VROverlayHandle_t("ulOverlayHandle"),
        ETrackingUniverseOrigin("eTrackingOrigin"),
        HmdMatrix34_t.const.p("pmatTrackingOriginToOverlayTransform")
    )

    EVROverlayError(
        "GetOverlayTransformAbsolute",

        VROverlayHandle_t("ulOverlayHandle"),
        Check(1)..ETrackingUniverseOrigin.p("peTrackingOrigin"),
        HmdMatrix34_t.p("pmatTrackingOriginToOverlayTransform")
    )

    EVROverlayError(
        "SetOverlayTransformTrackedDeviceRelative",

        VROverlayHandle_t("ulOverlayHandle"),
        TrackedDeviceIndex_t("unTrackedDevice"),
        HmdMatrix34_t.const.p("pmatTrackedDeviceToOverlayTransform")
    )

    EVROverlayError(
        "GetOverlayTransformTrackedDeviceRelative",

        VROverlayHandle_t("ulOverlayHandle"),
        Check(1)..TrackedDeviceIndex_t.p("punTrackedDevice"),
        HmdMatrix34_t.p("pmatTrackedDeviceToOverlayTransform")
    )

    EVROverlayError(
        "SetOverlayTransformTrackedDeviceComponent",

        VROverlayHandle_t("ulOverlayHandle"),
        TrackedDeviceIndex_t("unDeviceIndex"),
        charASCII.const.p("pchComponentName")
    )

    EVROverlayError(
        "GetOverlayTransformTrackedDeviceComponent",

        VROverlayHandle_t("ulOverlayHandle"),
        Check(1)..TrackedDeviceIndex_t.p("punDeviceIndex"),
        char.p("pchComponentName"),
        AutoSize("pchComponentName")..uint32_t("unComponentNameSize")
    )

    EVROverlayError(
        "SetOverlayTransformCursor",

        VROverlayHandle_t("ulCursorOverlayHandle"),
        HmdVector2_t.const.p("pvHotspot")
    )

    EVROverlayError(
        "GetOverlayTransformCursor",

        VROverlayHandle_t("ulOverlayHandle"),
        HmdVector2_t.p("pvHotspot")
    )

    EVROverlayError(
        "SetOverlayTransformProjection",

        VROverlayHandle_t("ulOverlayHandle"),
        ETrackingUniverseOrigin("eTrackingOrigin"),
        HmdMatrix34_t.p("pmatTrackingOriginToOverlayTransform"),
        VROverlayProjection_t.p("pProjection"),
        EVREye("eEye")
    )

    EVROverlayError(
        "ShowOverlay",

        VROverlayHandle_t("ulOverlayHandle")
    )

    EVROverlayError(
        "HideOverlay",

        VROverlayHandle_t("ulOverlayHandle")
    )

    bool(
        "IsOverlayVisible",

        VROverlayHandle_t("ulOverlayHandle")
    )

    EVROverlayError(
        "GetTransformForOverlayCoordinates",

        VROverlayHandle_t("ulOverlayHandle"),
        ETrackingUniverseOrigin("eTrackingOrigin"),
        HmdVector2_t("coordinatesInOverlay"),
        HmdMatrix34_t.p("pmatTransform")
    )

    EVROverlayError(
        "WaitFrameSync",

        uint32_t("nTimeoutMs")
    )

    bool(
        "PollNextOverlayEvent",

        VROverlayHandle_t("ulOverlayHandle"),
        VREvent_t.p("pEvent"),
        Expression("VREvent.SIZEOF")..uint32_t("uncbVREvent")
    )

    EVROverlayError(
        "GetOverlayInputMethod",

        VROverlayHandle_t("ulOverlayHandle"),
        Check(1)..VROverlayInputMethod.p("peInputMethod")
    )

    EVROverlayError(
        "SetOverlayInputMethod",

        VROverlayHandle_t("ulOverlayHandle"),
        VROverlayInputMethod("eInputMethod")
    )

    EVROverlayError(
        "GetOverlayMouseScale",

        VROverlayHandle_t("ulOverlayHandle"),
        HmdVector2_t.p("pvecMouseScale")
    )

    EVROverlayError(
        "SetOverlayMouseScale",

        VROverlayHandle_t("ulOverlayHandle"),
        HmdVector2_t.const.p("pvecMouseScale")
    )

    bool(
        "ComputeOverlayIntersection",

        VROverlayHandle_t("ulOverlayHandle"),
        VROverlayIntersectionParams_t.const.p("pParams"),
        VROverlayIntersectionResults_t.p("pResults")
    )

    bool(
        "IsHoverTargetOverlay",

        VROverlayHandle_t("ulOverlayHandle")
    )

    EVROverlayError(
        "SetOverlayIntersectionMask",

        VROverlayHandle_t("ulOverlayHandle"),
        VROverlayIntersectionMaskPrimitive_t.p("pMaskPrimitives"),
        AutoSize("pMaskPrimitives")..uint32_t("unNumMaskPrimitives"),
        Expression("VROverlayIntersectionMaskPrimitive.SIZEOF")..uint32_t("unPrimitiveSize")
    )

    EVROverlayError(
        "TriggerLaserMouseHapticVibration",

        VROverlayHandle_t("ulOverlayHandle"),
        float("fDurationSeconds"),
        float("fFrequency"),
        float("fAmplitude")
    )

    EVROverlayError(
        "SetOverlayCursor",

        VROverlayHandle_t("ulOverlayHandle"),
        VROverlayHandle_t("ulCursorHandle")
    )

    EVROverlayError(
        "SetOverlayCursorPositionOverride",

        VROverlayHandle_t("ulOverlayHandle"),
        HmdVector2_t.const.p("pvCursor")
    )

    EVROverlayError(
        "ClearOverlayCursorPositionOverride",

        VROverlayHandle_t("ulOverlayHandle")
    )

    EVROverlayError(
        "SetOverlayTexture",

        VROverlayHandle_t("ulOverlayHandle"),
        Texture_t.const.p("pTexture")
    )

    EVROverlayError(
        "ClearOverlayTexture",

        VROverlayHandle_t("ulOverlayHandle")
    )

    EVROverlayError(
        "SetOverlayRaw",

        VROverlayHandle_t("ulOverlayHandle"),
        Unsafe..void.p("pvBuffer"),
        uint32_t("unWidth"),
        uint32_t("unHeight"),
        uint32_t("unBytesPerPixel")
    )

    EVROverlayError(
        "SetOverlayFromFile",

        VROverlayHandle_t("ulOverlayHandle"),
        charASCII.const.p("pchFilePath")
    )

    EVROverlayError(
        "GetOverlayTexture",

        VROverlayHandle_t("ulOverlayHandle"),
        Check(1)..void.p.p("pNativeTextureHandle"),
        opaque_p("pNativeTextureRef"),
        Check(1)..uint32_t.p("pWidth"),
        Check(1)..uint32_t.p("pHeight"),
        Check(1)..uint32_t.p("pNativeFormat"),
        Check(1)..ETextureType.p("pAPIType"),
        Check(1)..EColorSpace.p("pColorSpace"),
        VRTextureBounds_t.p("pTextureBounds")
    )

    EVROverlayError(
        "ReleaseNativeOverlayHandle",

        VROverlayHandle_t("ulOverlayHandle"),
        opaque_p("pNativeTextureHandle")
    )

    EVROverlayError(
        "GetOverlayTextureSize",

        VROverlayHandle_t("ulOverlayHandle"),
        Check(1)..uint32_t.p("pWidth"),
        Check(1)..uint32_t.p("pHeight")
    )

    EVROverlayError(
        "CreateDashboardOverlay",

        charASCII.const.p("pchOverlayKey"),
        charASCII.const.p("pchOverlayFriendlyName"),
        Check(1)..VROverlayHandle_t.p("pMainHandle"),
        Check(1)..VROverlayHandle_t.p("pThumbnailHandle")
    )

    bool(
        "IsDashboardVisible",
        void()
    )

    bool(
        "IsActiveDashboardOverlay",

        VROverlayHandle_t("ulOverlayHandle")
    )

    EVROverlayError(
        "SetDashboardOverlaySceneProcess",

        VROverlayHandle_t("ulOverlayHandle"),
        uint32_t("unProcessId")
    )

    EVROverlayError(
        "GetDashboardOverlaySceneProcess",

        VROverlayHandle_t("ulOverlayHandle"),
        Check(1)..uint32_t.p("punProcessId")
    )

    void(
        "ShowDashboard",

        charASCII.const.p("pchOverlayToShow")
    )

    TrackedDeviceIndex_t(
        "GetPrimaryDashboardDevice",
        void()
    )

    EVROverlayError(
        "ShowKeyboard",

        EGamepadTextInputMode("eInputMode"),
        EGamepadTextInputLineMode("eLineInputMode"),
        uint32_t("unFlags"),
        charASCII.const.p("pchDescription"),
        uint32_t("unCharMax"),
        charASCII.const.p("pchExistingText"),
        bool("bUseMinimalMode"),
        uint64_t("uUserValue")
    )

    EVROverlayError(
        "ShowKeyboardForOverlay",

        VROverlayHandle_t("ulOverlayHandle"),
        EGamepadTextInputMode("eInputMode"),
        EGamepadTextInputLineMode("eLineInputMode"),
        uint32_t("unFlags"),
        charASCII.const.p("pchDescription"),
        uint32_t("unCharMax"),
        charASCII.const.p("pchExistingText"),
        bool("bUseMinimalMode"),
        uint64_t("uUserValue")
    )

    uint32_t(
        "GetKeyboardText",

        Return(RESULT, includesNT = true)..nullable..charASCII.p("pchText"),
        AutoSize("pchText")..uint32_t("cchText")
    )

    void("HideKeyboard")

    void(
        "SetKeyboardTransformAbsolute",

        ETrackingUniverseOrigin("eTrackingOrigin"),
        HmdMatrix34_t.const.p("pmatTrackingOriginToKeyboardTransform")
    )

    void(
        "SetKeyboardPositionForOverlay",

        VROverlayHandle_t("ulOverlayHandle"),
        HmdRect2_t("avoidRect")
    )

    VRMessageOverlayResponse(
        "ShowMessageOverlay",

        charASCII.const.p("pchText"),
        charASCII.const.p("pchCaption"),
        charASCII.const.p("pchButton0Text"),
        nullable..charASCII.const.p("pchButton1Text"),
        nullable..charASCII.const.p("pchButton2Text"),
        nullable..charASCII.const.p("pchButton3Text")
    )

    void("CloseMessageOverlay")
}