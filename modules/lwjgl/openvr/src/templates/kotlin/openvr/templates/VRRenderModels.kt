/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package openvr.templates

import org.lwjgl.generator.*
import openvr.*

val VRRenderModels = "VRRenderModels".nativeClass(
    Module.OPENVR,
    prefixMethod = "VRRenderModels_",
    binding = OPENVR_FNTABLE_BINDING
) {
    EVRRenderModelError(
        "LoadRenderModel_Async",

        charASCII.const.p("pchRenderModelName"),
        Check(1)..RenderModel_t.p.p("ppRenderModel")
    )

    void(
        "FreeRenderModel",

        nullable..Input..RenderModel_t.p("pRenderModel")
    )

    EVRRenderModelError(
        "LoadTexture_Async",

        TextureID_t("textureId"),
        Check(1)..RenderModel_TextureMap_t.p.p("ppTexture")
    )

    void(
        "FreeTexture",

        nullable..RenderModel_TextureMap_t.p("pTexture")
    )

    EVRRenderModelError(
        "LoadTextureD3D11_Async",

        TextureID_t("textureId"),
        opaque_p("pD3D11Device"),
        Check(1)..void.p.p("ppD3D11Texture2D")
    )

    EVRRenderModelError(
        "LoadIntoTextureD3D11_Async",

        TextureID_t("textureId"),
        opaque_p("pDstTexture")
    )

    void(
        "FreeTextureD3D11",

        opaque_p("pD3D11Texture2D")
    )

    uint32_t(
        "GetRenderModelName",

        uint32_t("unRenderModelIndex"),
        Return(RESULT, includesNT = true)..nullable..charASCII.p("pchRenderModelName"),
        AutoSize("pchRenderModelName")..uint32_t("unRenderModelNameLen")
    )

    uint32_t(
        "GetRenderModelCount",
        void()
    )

    uint32_t(
        "GetComponentCount",

        charASCII.const.p("pchRenderModelName")
    )

    uint32_t(
        "GetComponentName",

        charASCII.const.p("pchRenderModelName"),
        uint32_t("unComponentIndex"),
        Return(RESULT, includesNT = true)..nullable..charASCII.p("pchComponentName"),
        AutoSize("pchComponentName")..uint32_t("unComponentNameLen")
    )

    uint64_t(
        "GetComponentButtonMask",

        charASCII.const.p("pchRenderModelName"),
        charASCII.const.p("pchComponentName")
    )

    uint32_t(
        "GetComponentRenderModelName",

        charASCII.const.p("pchRenderModelName"),
        charASCII.const.p("pchComponentName"),
        Return(RESULT, includesNT = true)..nullable..charASCII.p("pchComponentRenderModelName"),
        AutoSize("pchComponentRenderModelName")..uint32_t("unComponentRenderModelNameLen")
    )

    bool(
        "GetComponentStateForDevicePath",

        charASCII.const.p("pchRenderModelName"),
        charASCII.const.p("pchComponentName"),
        VRInputValueHandle_t("devicePath"),
        RenderModel_ControllerMode_State_t.const.p("pState"),
        RenderModel_ComponentState_t.p("pComponentState")
    )

    bool(
        "GetComponentState",

        charASCII.const.p("pchRenderModelName"),
        charASCII.const.p("pchComponentName"),
        VRControllerState_t.const.p("pControllerState"),
        RenderModel_ControllerMode_State_t.const.p("pState"),
        RenderModel_ComponentState_t.p("pComponentState")
    )

    bool(
        "RenderModelHasComponent",

        charASCII.const.p("pchRenderModelName"),
        charASCII.const.p("pchComponentName")
    )

    uint32_t(
        "GetRenderModelThumbnailURL",

        charASCII.const.p("pchRenderModelName"),
        Return(RESULT, includesNT = true)..nullable..charASCII.p("pchThumbnailURL"),
        AutoSize("pchThumbnailURL")..uint32_t("unThumbnailURLLen"),
        Check(1)..EVRRenderModelError.p("peError")
    )

    uint32_t(
        "GetRenderModelOriginalPath",

        charASCII.const.p("pchRenderModelName"),
        Return(RESULT, includesNT = true)..nullable..charASCII.p("pchOriginalPath"),
        AutoSize("pchOriginalPath")..uint32_t("unOriginalPathLen"),
        Check(1)..EVRRenderModelError.p("peError")
    )

    charASCII.const.p(
        "GetRenderModelErrorNameFromEnum",

        EVRRenderModelError("error")
    )
}