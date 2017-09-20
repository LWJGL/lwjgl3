/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package org.lwjgl.openvr.templates

import org.lwjgl.generator.*
import org.lwjgl.openvr.*

val VRCompositor = "VRCompositor".nativeClass(
    packageName = OPENVR_PACKAGE,
    prefixMethod = "VRCompositor_",
    library = OPENVR_LIBRARY,
    binding = OPENVR_FNTABLE_BINDING
) {
    nativeDirective("""
#ifdef LWJGL_WINDOWS
    #define APIENTRY __stdcall
#else
    #define APIENTRY
#endif

typedef struct HmdColor_t
{
    float r;
    float g;
    float b;
    float a;
} HmdColor_t;""")

    documentation = "Allows the application to interact with the compositor."

    void(
        "SetTrackingSpace",
        "Sets tracking space returned by #WaitGetPoses().",

        ETrackingUniverseOrigin.IN("eOrigin", "", "ETrackingUniverseOrigin_\\w+")
    )

    ETrackingUniverseOrigin(
        "GetTrackingSpace",
        "Gets current tracking space returned by #WaitGetPoses()."
    )

    EVRCompositorError(
        "WaitGetPoses",
        """
        Scene applications should call this function to get poses to render with (and optionally poses predicted an additional frame out to use for gameplay).
        This function will block until "running start" milliseconds before the start of the frame, and should be called at the last moment before needing to
        start rendering.
        """,

        TrackedDevicePose_t.p.OUT("pRenderPoseArray", ""),
        AutoSize("pRenderPoseArray")..uint32_t.IN("unRenderPoseArrayCount", ""),
        TrackedDevicePose_t.p.OUT("pGamePoseArray", ""),
        AutoSize("pGamePoseArray")..uint32_t.IN("unGamePoseArrayCount", "")
    )

    EVRCompositorError(
        "GetLastPoses",
        "Get the last set of poses returned by #WaitGetPoses().",

        TrackedDevicePose_t.p.OUT("pRenderPoseArray", ""),
        AutoSize("pRenderPoseArray")..uint32_t.IN("unRenderPoseArrayCount", ""),
        TrackedDevicePose_t.p.OUT("pGamePoseArray", ""),
        AutoSize("pGamePoseArray")..uint32_t.IN("unGamePoseArrayCount", "")
    )

    EVRCompositorError(
        "GetLastPoseForTrackedDeviceIndex",
        """
        Interface for accessing last set of poses returned by #WaitGetPoses() one at a time.

        It is okay to pass #NULL for either pose if you only want one of the values.
        """,

        TrackedDeviceIndex_t.IN("unDeviceIndex", ""),
        nullable..TrackedDevicePose_t.p.OUT("pOutputPose", ""),
        nullable..TrackedDevicePose_t.p.OUT("pOutputGamePose", ""),

        returnDoc =
        """
        #EVRCompositorError_VRCompositorError_IndexOutOfRange if {@code unDeviceIndex} not less than #k_unMaxTrackedDeviceCount otherwise
        #EVRCompositorError_VRCompositorError_None
        """
    )

    EVRCompositorError(
        "Submit",
        """
        Updated scene texture to display.

        If {@code pBounds} is #NULL the entire texture will be used. If called from an OpenGL app, consider adding a
        {@code glFlush} after submitting both frames to signal the driver to start processing, otherwise it may wait until the command buffer fills up, causing
        the app to miss frames.

        OpenGL dirty state: glBindTexture
        """,

        EVREye.IN("eEye", "", "EVREye_\\w+"),
        const..Texture_t.p.IN("pTexture", ""),
        nullable..const..VRTextureBounds_t.p.IN("pBounds", ""),
        EVRSubmitFlags.IN("nSubmitFlags", "", "EVRSubmitFlags_\\w+"),

        returnDoc =
        """
        return codes:
        ${ul(
            "IsNotSceneApplication (make sure to call VR_Init with VRApplication_Scene)",
            "DoNotHaveFocus (some other app has taken focus)",
            "TextureIsOnWrongDevice (application did not use proper AdapterIndex - see IVRSystem.GetDXGIOutputInfo)",
            "SharedTexturesNotSupported (application needs to call CreateDXGIFactory1 or later before creating DX device)",
            "TextureUsesUnsupportedFormat (scene textures must be compatible with DXGI sharing rules - e.g. uncompressed, no mips, etc.)",
            "InvalidTexture (usually means bad arguments passed in)",
            "AlreadySubmitted (app has submitted two left textures or two right textures in a single frame - i.e. before calling WaitGetPoses again)"
        )}
        """
    )

    void(
        "ClearLastSubmittedFrame",
        "Clears the frame that was sent with the last call to Submit. This will cause the compositor to show the grid until #Submit() is called again."
    )

    void(
        "PostPresentHandoff",
        """
        Call immediately after presenting your app's window (i.e. companion window) to unblock the compositor.

        This is an optional call, which only needs to be used if you can't instead call #WaitGetPoses() immediately after {@code Present()}. For example, if
        your engine's render and game loop are not on separate threads, or blocking the render thread until 3ms before the next vsync would introduce a
        deadlock of some sort. This function tells the compositor that you have finished all rendering after having Submitted buffers for both eyes, and it is
        free to start its rendering work. This should only be called from the same thread you are rendering on.
        """
    )

    bool(
        "GetFrameTiming",
        """
        Returns true if timing data is filled it. Sets oldest timing info if {@code nFramesAgo} is larger than the stored history.

        Be sure to set {@code timing.size = sizeof(Compositor_FrameTiming)} on struct passed in before calling this function.
        """,

        Compositor_FrameTiming.p.OUT("pTiming", ""),
        AutoSize("pTiming")..uint32_t.IN("unFramesAgo", "")
    )

    uint32_t(
        "GetFrameTimings",
        """
        Interface for copying a range of timing data. Frames are returned in ascending order (oldest to newest) with the last being the most recent frame. Only
        the first entry's {@code m_nSize} needs to be set, as the rest will be inferred from that. Returns total number of entries filled out.
        """,

        Compositor_FrameTiming.p.OUT("pTiming", ""),
        AutoSize("pTiming")..uint32_t.IN("nFrames", "")
    )

    float(
        "GetFrameTimeRemaining",
        """
        Returns the time in seconds left in the current (as identified by FrameTiming's frameIndex) frame.

        Due to "running start", this value may roll over to the next frame before ever reaching 0.0.
        """
    )

    void(
        "GetCumulativeStats",
        "Fills out stats accumulated for the last connected application.",

        Compositor_CumulativeStats.p.OUT("pStats", ""),
        Expression("CompositorCumulativeStats.SIZEOF")..uint32_t.IN("nStatsSizeInBytes", "must be {@code sizeof( Compositor_CumulativeStats )}")
    )

    void(
        "FadeToColor",
        """
        Fades the view on the HMD to the specified color.

        The fade will take {@code fSeconds}, and the color values are between 0.0 and 1.0. This color is faded on top of the scene based on the alpha
        parameter. Removing the fade color instantly would be {@code FadeToColor( 0.0, 0.0, 0.0, 0.0, 0.0 )}. Values are in un-premultiplied alpha space.
        """,

        float.IN("fSeconds", ""),
        float.IN("fRed", ""),
        float.IN("fGreen", ""),
        float.IN("fBlue", ""),
        float.IN("fAlpha", ""),
        bool.IN("bBackground", "")
    )

    HmdColor_t(
        "GetCurrentFadeColor",
        "Get current fade color value.",

        bool.IN("bBackground", "")
    )

    void(
        "FadeGrid",
        "Fading the Grid in or out in {@code fSeconds}.",

        float.IN("fSeconds", ""),
        bool.IN("bFadeIn", "")
    )

    float(
        "GetCurrentGridAlpha",
        "Get current alpha value of grid."
    )

    EVRCompositorError(
        "SetSkyboxOverride",
        """
        Override the skybox used in the compositor (e.g. for during level loads when the app can't feed scene images fast enough)

        Order is Front, Back, Left, Right, Top, Bottom. If only a single texture is passed, it is assumed in lat-long format. If two are passed, it is assumed
        a lat-long stereo pair.
        """,

        Texture_t.p.IN("pTextures", ""),
        AutoSize("pTextures")..uint32_t.IN("unTextureCount", "")
    )

    void(
        "ClearSkyboxOverride",
        "Resets compositor skybox back to defaults."
    )

    void(
        "CompositorBringToFront",
        "Brings the compositor window to the front. This is useful for covering any other window that may be on the HMD and is obscuring the compositor window."
    )

    void(
        "CompositorGoToBack",
        "Pushes the compositor window to the back. This is useful for allowing other applications to draw directly to the HMD."
    )

    void(
        "CompositorQuit",
        """
        Tells the compositor process to clean up and exit. You do not need to call this function at shutdown. Under normal circumstances the compositor will
        manage its own life cycle based on what applications are running.
        """
    )

    bool(
        "IsFullscreen",
        "Return whether the compositor is fullscreen."
    )

    uint32_t(
        "GetCurrentSceneFocusProcess",
        "Returns the process ID of the process that is currently rendering the scene."
    )

    uint32_t(
        "GetLastFrameRenderer",
        "Returns the process ID of the process that rendered the last frame (or 0 if the compositor itself rendered the frame).",

        returnDoc = "0 when fading out from an app and the app's process Id when fading into an app"
    )

    bool(
        "CanRenderScene",
        "Returns true if the current process has the scene focus."
    )

    void(
        "ShowMirrorWindow",
        "Creates a window on the primary monitor to display what is being shown in the headset."
    )

    void(
        "HideMirrorWindow",
        "Closes the mirror window."
    )

    bool(
        "IsMirrorWindowVisible",
        "Returns true if the mirror window is shown."
    )

    void(
        "CompositorDumpImages",
        "Writes all images that the compositor knows about (including overlays) to a 'screenshots' folder in the SteamVR runtime root."
    )

    bool(
        "ShouldAppRenderWithLowResources",
        "Let an app know it should be rendering with low resources."
    )

    void(
        "ForceInterleavedReprojectionOn",
        "Override interleaved reprojection logic to force on.",

        bool.IN("bOverride", "")
    )

    void(
        "ForceReconnectProcess",
        "Force reconnecting to the compositor process."
    )

    void(
        "SuspendRendering",
        "Temporarily suspends rendering (useful for finer control over scene transitions).",

        bool.IN("bSuspend", "")
    )

    EVRCompositorError(
        "GetMirrorTextureD3D11",
        """
        Opens a shared D3D11 texture with the undistorted composited image for each eye.

        Use #ReleaseMirrorTextureD3D11() when finished instead of calling Release on the resource itself.
        """,

        EVREye.IN("eEye", ""),
        opaque_p.IN("pD3D11DeviceOrResource", ""),
        Check(1)..void_pp.OUT("ppD3D11ShaderResourceView", "")
    )

    void(
        "ReleaseMirrorTextureD3D11",
        "Releases a shared D3D11 texture.",

        opaque_p.IN("pD3D11ShaderResourceView", "")
    )

    EVRCompositorError(
        "GetMirrorTextureGL",
        "Access to mirror textures from OpenGL.",

        EVREye.IN("eEye", ""),
        Check(1)..glUInt_t.p.OUT("pglTextureId", ""),
        Check(1)..glSharedTextureHandle_t.p.OUT("pglSharedTextureHandle", "")
    )

    bool(
        "ReleaseSharedGLTexture",
        "",

        glUInt_t.IN("glTextureId", ""),
        glSharedTextureHandle_t.IN("glSharedTextureHandle", "")
    )

    void(
        "LockGLSharedTextureForAccess",
        "",

        glSharedTextureHandle_t.IN("glSharedTextureHandle", "")
    )

    void(
        "UnlockGLSharedTextureForAccess",
        "",

        glSharedTextureHandle_t.IN("glSharedTextureHandle", "")
    )

    uint32_t(
        "GetVulkanInstanceExtensionsRequired",
        """
        Returns 0. Otherwise it returns the length of the number of bytes necessary to hold this string including the trailing null. The string will be a space
        separated list of-required instance extensions to enable in {@code VkCreateInstance}.
        """,

        Return(RESULT, includesNT = true)..nullable..charASCII_p.OUT("pchValue", ""),
        AutoSize("pchValue")..uint32_t.IN("unBufferSize", "")
    )

    uint32_t(
        "GetVulkanDeviceExtensionsRequired",
        """
        Returns 0. Otherwise it returns the length of the number of bytes necessary to hold this string including the trailing null. The string will be a space
        separated list of required device extensions to enable in {@code VkCreateDevice}.
        """,

        VkPhysicalDevice_T.IN("pPhysicalDevice", ""),
        Return(RESULT, includesNT = true)..nullable..charASCII_p.OUT("pchValue", ""),
        AutoSize("pchValue")..uint32_t.IN("unBufferSize", "")
    )

    void(
        "SetExplicitTimingMode",
        """
        <h3>Vulkan/D3D12 Only</h3>

        There are two purposes for {@code SetExplicitTimingMode}:
        ${ol(
            "To get a more accurate GPU timestamp for when the frame begins in Vulkan/D3D12 applications.",
            """
            (Optional) To avoid having #WaitGetPoses() access the Vulkan queue so that the queue can be accessed from another thread while {@code WaitGetPoses}
            is executing.
            """
        )}

        More accurate GPU timestamp for the start of the frame is achieved by the application calling #SubmitExplicitTimingData() immediately before its first
        submission to the Vulkan/D3D12 queue. This is more accurate because normally this GPU timestamp is recorded during #WaitGetPoses(). In D3D11,
        {@code WaitGetPoses} queues a GPU timestamp write, but it does not actually get submitted to the GPU until the application flushes. By using
        {@code SubmitExplicitTimingData}, the timestamp is recorded at the same place for Vulkan/D3D12 as it is for D3D11, resulting in a more accurate GPU
        time measurement for the frame.

        Avoiding {@code WaitGetPoses} accessing the Vulkan queue can be achieved using {@code SetExplicitTimingMode} as well. If this is desired, the
        application <b>MUST</b> call #PostPresentHandoff() itself prior to {@code WaitGetPoses}. If {@code SetExplicitTimingMode} is true and the application
        calls {@code PostPresentHandoff}, then {@code WaitGetPoses} is guaranteed not to access the queue. Note that {@code PostPresentHandoff} and
        {@code SubmitExplicitTimingData} will access the queue, so only {@code WaitGetPoses} becomes safe for accessing the queue from another thread.
        """,

        bool.IN("bExplicitTimingMode", "")
    )

    EVRCompositorError(
        "SubmitExplicitTimingData",
        """
        <h3>Vulkan/D3D12 Only</h3>

        Submit explicit timing data. When {@code SetExplicitTimingMode} is true, this must be called immediately before the application's first
        {@code vkQueueSubmit} (Vulkan) or {@code ID3D12CommandQueue::ExecuteCommandLists} (D3D12) of each frame. This function will insert a GPU timestamp
        write just before the application starts its rendering. This function will perform a {@code vkQueueSubmit} on Vulkan so must not be done simultaneously
        with {@code VkQueue} operations on another thread.
        """,

        returnDoc = "#EVRCompositorError_VRCompositorError_RequestFailed if {@code SetExplicitTimingMode} is not enabled"
    )
}