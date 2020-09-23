/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package openvr.templates

import org.lwjgl.generator.*
import openvr.*

val VRCompositor = "VRCompositor".nativeClass(
    Module.OPENVR,
    prefixMethod = "VRCompositor_",
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

/*
/** Compositor frame timing reprojection flags. */
const uint32_t VRCompositor_ReprojectionReason_Cpu = 0x01;
const uint32_t VRCompositor_ReprojectionReason_Gpu = 0x02;
const uint32_t VRCompositor_ReprojectionAsync = 0x04;	// This flag indicates the async reprojection mode is active,
															// but does not indicate if reprojection actually happened or not.
															// Use the ReprojectionReason flags above to check if reprojection
															// was actually applied (i.e. scene texture was reused).
															// NumFramePresents > 1 also indicates the scene texture was reused,
															// and also the number of times that it was presented in total.

const uint32_t VRCompositor_ReprojectionMotion = 0x08;	// This flag indicates whether or not motion smoothing was triggered for this frame

const uint32_t VRCompositor_PredictionMask = 0x30;	// The runtime may predict more than one frame (up to four) ahead if
															// it detects the application is taking too long to render. These two
															// bits will contain the count of additional frames (normally zero).
															// Use the VR_COMPOSITOR_ADDITIONAL_PREDICTED_FRAMES macro to read from
															// the latest frame timing entry.

const uint32_t VRCompositor_ThrottleMask = 0xC0;	// Number of frames the compositor is throttling the application.
															// Use the VR_COMPOSITOR_NUMBER_OF_THROTTLED_FRAMES macro to read from
															// the latest frame timing entry.

#define VR_COMPOSITOR_ADDITIONAL_PREDICTED_FRAMES( timing ) ( ( ( timing ).m_nReprojectionFlags & vr::VRCompositor_PredictionMask ) >> 4 )
#define VR_COMPOSITOR_NUMBER_OF_THROTTLED_FRAMES( timing ) ( ( ( timing ).m_nReprojectionFlags & vr::VRCompositor_ThrottleMask ) >> 6 )
 */

    void(
        "SetTrackingSpace",
        "Sets tracking space returned by #WaitGetPoses().",

        ETrackingUniverseOrigin("eOrigin", "", "ETrackingUniverseOrigin_\\w+")
    )

    ETrackingUniverseOrigin(
        "GetTrackingSpace",
        "Gets current tracking space returned by #WaitGetPoses().",
        void()
    )

    EVRCompositorError(
        "WaitGetPoses",
        """
        Scene applications should call this function to get poses to render with (and optionally poses predicted an additional frame out to use for gameplay).
        This function will block until "running start" milliseconds before the start of the frame, and should be called at the last moment before needing to
        start rendering.
        """,

        TrackedDevicePose_t.p("pRenderPoseArray", ""),
        AutoSize("pRenderPoseArray")..uint32_t("unRenderPoseArrayCount", ""),
        nullable..TrackedDevicePose_t.p("pGamePoseArray", ""),
        AutoSize("pGamePoseArray")..uint32_t("unGamePoseArrayCount", "")
    )

    EVRCompositorError(
        "GetLastPoses",
        "Get the last set of poses returned by #WaitGetPoses().",

        TrackedDevicePose_t.p("pRenderPoseArray", ""),
        AutoSize("pRenderPoseArray")..uint32_t("unRenderPoseArrayCount", ""),
        TrackedDevicePose_t.p("pGamePoseArray", ""),
        AutoSize("pGamePoseArray")..uint32_t("unGamePoseArrayCount", "")
    )

    EVRCompositorError(
        "GetLastPoseForTrackedDeviceIndex",
        """
        Interface for accessing last set of poses returned by #WaitGetPoses() one at a time.

        It is okay to pass #NULL for either pose if you only want one of the values.
        """,

        TrackedDeviceIndex_t("unDeviceIndex", ""),
        nullable..TrackedDevicePose_t.p("pOutputPose", ""),
        nullable..TrackedDevicePose_t.p("pOutputGamePose", ""),

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

        EVREye("eEye", "", "EVREye_\\w+"),
        Texture_t.const.p("pTexture", ""),
        nullable..VRTextureBounds_t.const.p("pBounds", ""),
        EVRSubmitFlags("nSubmitFlags", "", "EVRSubmitFlags_\\w+"),

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

        Compositor_FrameTiming.p("pTiming", ""),
        AutoSize("pTiming")..uint32_t("unFramesAgo", "")
    )

    uint32_t(
        "GetFrameTimings",
        """
        Interface for copying a range of timing data. Frames are returned in ascending order (oldest to newest) with the last being the most recent frame. Only
        the first entry's {@code m_nSize} needs to be set, as the rest will be inferred from that. Returns total number of entries filled out.
        """,

        Compositor_FrameTiming.p("pTiming", ""),
        AutoSize("pTiming")..uint32_t("nFrames", "")
    )

    float(
        "GetFrameTimeRemaining",
        """
        Returns the time in seconds left in the current (as identified by FrameTiming's frameIndex) frame.

        Due to "running start", this value may roll over to the next frame before ever reaching 0.0.
        """,
        void()
    )

    void(
        "GetCumulativeStats",
        "Fills out stats accumulated for the last connected application.",

        Compositor_CumulativeStats.p("pStats", ""),
        Expression("CompositorCumulativeStats.SIZEOF")..uint32_t("nStatsSizeInBytes", "must be {@code sizeof( Compositor_CumulativeStats )}")
    )

    void(
        "FadeToColor",
        """
        Fades the view on the HMD to the specified color.

        The fade will take {@code fSeconds}, and the color values are between 0.0 and 1.0. This color is faded on top of the scene based on the alpha
        parameter. Removing the fade color instantly would be {@code FadeToColor( 0.0, 0.0, 0.0, 0.0, 0.0 )}. Values are in un-premultiplied alpha space.
        """,

        float("fSeconds", ""),
        float("fRed", ""),
        float("fGreen", ""),
        float("fBlue", ""),
        float("fAlpha", ""),
        bool("bBackground", "")
    )

    HmdColor_t(
        "GetCurrentFadeColor",
        "Get current fade color value.",

        bool("bBackground", "")
    )

    void(
        "FadeGrid",
        "Fading the Grid in or out in {@code fSeconds}.",

        float("fSeconds", ""),
        bool("bFadeIn", "")
    )

    float(
        "GetCurrentGridAlpha",
        "Get current alpha value of grid.",
        void()
    )

    EVRCompositorError(
        "SetSkyboxOverride",
        """
        Override the skybox used in the compositor (e.g. for during level loads when the app can't feed scene images fast enough)

        Order is Front, Back, Left, Right, Top, Bottom. If only a single texture is passed, it is assumed in lat-long format. If two are passed, it is assumed
        a lat-long stereo pair.
        """,

        Texture_t.const.p("pTextures", ""),
        AutoSize("pTextures")..uint32_t("unTextureCount", "")
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
        "Return whether the compositor is fullscreen.",
        void()
    )

    uint32_t(
        "GetCurrentSceneFocusProcess",
        "Returns the process ID of the process that is currently rendering the scene.",
        void()
    )

    uint32_t(
        "GetLastFrameRenderer",
        "Returns the process ID of the process that rendered the last frame (or 0 if the compositor itself rendered the frame).",
        void(),

        returnDoc = "0 when fading out from an app and the app's process Id when fading into an app"
    )

    bool(
        "CanRenderScene",
        "Returns true if the current process has the scene focus.",
        void()
    )

    void(
        "ShowMirrorWindow",
        "DEPRECATED: Opens the headset view (as either a window or docked widget depending on user's preferences) that displays what the user sees in the headset.",
        void()
    )

    void(
        "HideMirrorWindow",
        "DEPRECATED: Closes the headset view, either as a window or docked widget.",
        void()
    )

    bool(
        "IsMirrorWindowVisible",
        "DEPRECATED: Returns true if the headset view (either as a window or docked widget) is shown.",
        void()
    )

    void(
        "CompositorDumpImages",
        "Writes back buffer and stereo left/right pair from the application to a 'screenshots' folder in the SteamVR runtime root.",
        void()
    )

    bool(
        "ShouldAppRenderWithLowResources",
        "Let an app know it should be rendering with low resources.",
        void()
    )

    void(
        "ForceInterleavedReprojectionOn",
        "Override interleaved reprojection logic to force on.",

        bool("bOverride", "")
    )

    void(
        "ForceReconnectProcess",
        "Force reconnecting to the compositor process.",
        void()
    )

    void(
        "SuspendRendering",
        "Temporarily suspends rendering (useful for finer control over scene transitions).",

        bool("bSuspend", "")
    )

    EVRCompositorError(
        "GetMirrorTextureD3D11",
        """
        Opens a shared D3D11 texture with the undistorted composited image for each eye.

        Use #ReleaseMirrorTextureD3D11() when finished instead of calling Release on the resource itself.
        """,

        EVREye("eEye", ""),
        opaque_p("pD3D11DeviceOrResource", ""),
        Check(1)..void.p.p("ppD3D11ShaderResourceView", "")
    )

    void(
        "ReleaseMirrorTextureD3D11",
        "Releases a shared D3D11 texture.",

        opaque_p("pD3D11ShaderResourceView", "")
    )

    EVRCompositorError(
        "GetMirrorTextureGL",
        "Access to mirror textures from OpenGL.",

        EVREye("eEye", ""),
        Check(1)..glUInt_t.p("pglTextureId", ""),
        Check(1)..glSharedTextureHandle_t.p("pglSharedTextureHandle", "")
    )

    bool(
        "ReleaseSharedGLTexture",
        "",

        glUInt_t("glTextureId", ""),
        glSharedTextureHandle_t("glSharedTextureHandle", "")
    )

    void(
        "LockGLSharedTextureForAccess",
        "",

        glSharedTextureHandle_t("glSharedTextureHandle", "")
    )

    void(
        "UnlockGLSharedTextureForAccess",
        "",

        glSharedTextureHandle_t("glSharedTextureHandle", "")
    )

    uint32_t(
        "GetVulkanInstanceExtensionsRequired",
        """
        Returns 0. Otherwise it returns the length of the number of bytes necessary to hold this string including the trailing null. The string will be a space
        separated list of-required instance extensions to enable in {@code VkCreateInstance}.
        """,

        Return(RESULT, includesNT = true)..nullable..charASCII.p("pchValue", ""),
        AutoSize("pchValue")..uint32_t("unBufferSize", "")
    )

    uint32_t(
        "GetVulkanDeviceExtensionsRequired",
        """
        Returns 0. Otherwise it returns the length of the number of bytes necessary to hold this string including the trailing null. The string will be a space
        separated list of required device extensions to enable in {@code VkCreateDevice}.
        """,

        VkPhysicalDevice_T.p("pPhysicalDevice", ""),
        Return(RESULT, includesNT = true)..nullable..charASCII.p("pchValue", ""),
        AutoSize("pchValue")..uint32_t("unBufferSize", "")
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

        Avoiding #WaitGetPoses() accessing the Vulkan queue can be achieved using {@code SetExplicitTimingMode} as well. If this is desired, the application
        should set the timing mode to #EVRCompositorTimingMode_VRCompositorTimingMode_Explicit_ApplicationPerformsPostPresentHandoff and <b>MUST</b> call
        #PostPresentHandoff() itself. If these conditions are met, then {@code WaitGetPoses} is guaranteed not to access the queue. Note that
        {@code PostPresentHandoff} and {@code SubmitExplicitTimingData} will access the queue, so only {@code WaitGetPoses} becomes safe for accessing the
        queue from another thread.
        """,

        EVRCompositorTimingMode("eTimingMode", "")
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

    bool(
        "IsMotionSmoothingEnabled",
        """
        Indicates whether or not motion smoothing is enabled by the user settings.

        If you want to know if motion smoothing actually triggered due to a late frame, check ##CompositorFrameTiming {@code m_nReprojectionFlags} &amp;
        {@code VRCompositor_ReprojectionMotion} instead.
        """,

        void()
    )

    bool(
        "IsMotionSmoothingSupported",
        "Indicates whether or not motion smoothing is supported by the current hardware.",

        void()
    )

    bool(
        "IsCurrentSceneFocusAppLoading",
        """
        Indicates whether or not the current scene focus app is currently loading.
        
        This is inferred from its use of {@code FadeGrid} to explicitly fade to the compositor to cover up the fact that it cannot render at a sustained full
        framerate during this time.
        """,

        void()
    )

    EVRCompositorError(
        "SetStageOverride_Async",
        """
        Override the stage model used in the compositor to replace the grid.

        {@code RenderModelPath} is a full path the an OBJ file to load. This file will be loaded asynchronously from disk and uploaded to the gpu by the
        runtime. Once ready for rendering, the VREvent #EVREventType_VREvent_Compositor_StageOverrideReady will be sent. Use {@code FadeToGrid} to reveal. Call
        #ClearStageOverride() to free the associated resources when finished.
        """,

        charASCII.const.p("pchRenderModelPath", ""),
        HmdMatrix34_t.const.p("pTransform", ""),
        Compositor_StageRenderSettings.const.p("pRenderSettings", ""),
        Expression("CompositorStageRenderSettings.SIZEOF")..uint32_t("nSizeOfRenderSettings", "")
    )

    void(
        "ClearStageOverride",
        "Resets the stage to its default user specified setting.",

        void()
    )

    bool(
        "GetCompositorBenchmarkResults",
        "Returns true if {@code pBenchmarkResults} is filled it. Sets {@code pBenchmarkResults} with the result of the compositor benchmark.",

        Compositor_BenchmarkResults.p("pBenchmarkResults", ""),
        AutoSize("pBenchmarkResults")..uint32_t("nSizeOfBenchmarkResults", "should be set to {@code sizeof(Compositor_BenchmarkResults)}")
    )

    EVRCompositorError(
        "GetLastPosePredictionIDs",
        """
        Returns the frame id associated with the poses last returned by #WaitGetPoses().

        Deltas between IDs correspond to number of headset vsync intervals.
        """,

        Check(1)..uint32_t.p("pRenderPosePredictionID", ""),
        Check(1)..uint32_t.p("pGamePosePredictionID", "")
    )

    EVRCompositorError(
        "GetPosesForFrame",
        "Get the most up-to-date predicted (or recorded - up to 100ms old) set of poses for a given frame id.",

        uint32_t("unPosePredictionID", ""),
        TrackedDevicePose_t.p("pPoseArray", ""),
        AutoSize("pPoseArray")..uint32_t("unPoseArrayCount", "")
    )
}