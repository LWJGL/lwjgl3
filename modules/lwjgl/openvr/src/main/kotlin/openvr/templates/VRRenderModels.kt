/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package org.lwjgl.openvr.templates

import org.lwjgl.generator.*
import org.lwjgl.openvr.*

val VRRenderModels = "VRRenderModels".nativeClass(
    packageName = OPENVR_PACKAGE,
    prefixMethod = "VRRenderModels_",
    library = OPENVR_LIBRARY,
    binding = OPENVR_FNTABLE_BINDING
) {
    documentation =
        """
        """

    EVRRenderModelError(
        "LoadRenderModel_Async",
        """
        Loads and returns a render model for use in the application. {@code pchRenderModelName} should be a render model name from the
        #ETrackedDeviceProperty_Prop_RenderModelName_String property or an absolute path name to a render model on disk.

        The resulting render model is valid until #ShutdownInternal() is called or until #FreeRenderModel() is called. When the application is finished with
        the render model it should call #FreeRenderModel() to free the memory associated with the model.
        """,

        const..charASCII_p.IN("pchRenderModelName", ""),
        Check(1)..RenderModel_t.p.p.OUT("ppRenderModel", "")
    )

    void(
        "FreeRenderModel",
        "Frees a previously returned render model It is safe to call this on a null ptr.",

        nullable..RenderModel_t.p.IN("pRenderModel", "")
    )

    EVRRenderModelError(
        "LoadTexture_Async",
        "Loads and returns a texture for use in the application.",

        TextureID_t.IN("textureId", ""),
        Check(1)..RenderModel_TextureMap_t.p.p.OUT("ppTexture", "")
    )

    void(
        "FreeTexture",
        "Frees a previously returned texture. It is safe to call this on a null ptr.",

        nullable..RenderModel_TextureMap_t.p.IN("pTexture", "")
    )

    EVRRenderModelError(
        "LoadTextureD3D11_Async",
        "Creates a D3D11 texture and loads data into it.",

        TextureID_t.IN("textureId", ""),
        opaque_p.IN("pD3D11Device", ""),
        Check(1)..void_pp.OUT("ppD3D11Texture2D", "")
    )

    EVRRenderModelError(
        "LoadIntoTextureD3D11_Async",
        "Helper function to copy the bits into an existing texture.",

        TextureID_t.IN("textureId", ""),
        opaque_p.IN("pDstTexture", "")
    )

    void(
        "FreeTextureD3D11",
        "Use this to free textures created with LoadTextureD3D11_Async instead of calling Release on them.",

        opaque_p.IN("pD3D11Texture2D", "")
    )

    uint32_t(
        "GetRenderModelName",
        """
        Use this to get the names of available render models. Index does not correlate to a tracked device index, but is only used for iterating over all
        available render models. If the index is out of range, this function will return 0. Otherwise, it will return the size of the buffer required for the
        name.
        """,

        uint32_t.IN("unRenderModelIndex", ""),
        Return(RESULT, includesNT = true)..nullable..charASCII_p.OUT("pchRenderModelName", ""),
        AutoSize("pchRenderModelName")..uint32_t.IN("unRenderModelNameLen", "")
    )

    uint32_t(
        "GetRenderModelCount",
        "Returns the number of available render models."
    )

    uint32_t(
        "GetComponentCount",
        """
        Returns the number of components of the specified render model.

        Components are useful when client application wish to draw, label, or otherwise interact with components of tracked objects.
        """,

        const..charASCII_p.IN("pchRenderModelName", "")
    )

    uint32_t(
        "GetComponentName",
        """
        Use this to get the names of available components. Index does not correlate to a tracked device index, but is only used for iterating over all
        available components. If the index is out of range, this function will return 0. Otherwise, it will return the size of the buffer required for the
        name.
        """,

        const..charASCII_p.IN("pchRenderModelName", ""),
        uint32_t.IN("unComponentIndex", ""),
        Return(RESULT, includesNT = true)..nullable..charASCII_p.OUT("pchComponentName", ""),
        AutoSize("pchComponentName")..uint32_t.IN("unComponentNameLen", "")
    )

    uint64_t(
        "GetComponentButtonMask",
        """
        Get the button mask for all buttons associated with this component.

        If no buttons (or axes) are associated with this component, return 0

        ${note("multiple components may be associated with the same button. Ex: two grip buttons on a single controller.")}
        ${note("A single component may be associated with multiple buttons. Ex: A trackpad which also provides \"D-pad\" functionality")}
        """,

        const..charASCII_p.IN("pchRenderModelName", ""),
        const..charASCII_p.IN("pchComponentName", "")
    )

    uint32_t(
        "GetComponentRenderModelName",
        """
        Use this to get the render model name for the specified rendermode/component combination, to be passed to #LoadRenderModel_Async(). If the component
        name is out of range, this function will return 0. Otherwise, it will return the size of the buffer required for the name.
        """,

        const..charASCII_p.IN("pchRenderModelName", ""),
        const..charASCII_p.IN("pchComponentName", ""),
        Return(RESULT, includesNT = true)..nullable..charASCII_p.OUT("pchComponentRenderModelName", ""),
        AutoSize("pchComponentRenderModelName")..uint32_t.IN("unComponentRenderModelNameLen", "")
    )

    bool(
        "GetComponentState",
        """
        Use this to query information about the component, as a function of the controller state.

        For dynamic controller components (ex: trigger) values will reflect component motions. For static components this will return a consistent value
        independent of the ##VRControllerState.

        If the {@code pchRenderModelName} or {@code pchComponentName} is invalid, this will return false (and transforms will be set to identity). Otherwise,
        return true.

        ${note("For dynamic objects, visibility may be dynamic. (I.e., true/false will be returned based on controller state and controller mode state )")}
        """,

        const..charASCII_p.IN("pchRenderModelName", ""),
        const..charASCII_p.IN("pchComponentName", ""),
        const..VRControllerState_t.p.IN("pControllerState", ""),
        const..RenderModel_ControllerMode_State_t.p.IN("pState", ""),
        RenderModel_ComponentState_t.p.OUT("pComponentState", "")
    )

    bool(
        "RenderModelHasComponent",
        "Returns true if the render model has a component with the specified name.",

        const..charASCII_p.IN("pchRenderModelName", ""),
        const..charASCII_p.IN("pchComponentName", "")
    )

    uint32_t(
        "GetRenderModelThumbnailURL",
        "Returns the URL of the thumbnail image for this rendermodel.",

        const..charASCII_p.IN("pchRenderModelName", ""),
        Return(RESULT, includesNT = true)..nullable..charASCII_p.OUT("pchThumbnailURL", ""),
        AutoSize("pchThumbnailURL")..uint32_t.IN("unThumbnailURLLen", ""),
        Check(1)..EVRRenderModelError.p.OUT("peError", "")
    )

    uint32_t(
        "GetRenderModelOriginalPath",
        """
        Provides a render model path that will load the unskinned model if the model name provided has been replace by the user. If the model hasn't been
        replaced the path value will still be a valid path to load the model. Pass this to LoadRenderModel_Async, etc. to load the model.
        """,

        const..charASCII_p.IN("pchRenderModelName", ""),
        Return(RESULT, includesNT = true)..nullable..charASCII_p.OUT("pchOriginalPath", ""),
        AutoSize("pchOriginalPath")..uint32_t.IN("unOriginalPathLen", ""),
        Check(1)..EVRRenderModelError.p.OUT("peError", "")
    )

    const..charASCII_p(
        "GetRenderModelErrorNameFromEnum",
        "Returns a string for a render model error.",

        EVRRenderModelError.IN("error", "")
    )
}