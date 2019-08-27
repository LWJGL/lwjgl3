/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.openvr;

import javax.annotation.*;

import java.nio.*;

import org.lwjgl.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.JNI.*;
import static org.lwjgl.system.MemoryStack.*;
import static org.lwjgl.system.MemoryUtil.*;

/** Allows the application to interact with the compositor. */
public class VRCompositor {

    static { OpenVR.initialize(); }

    protected VRCompositor() {
        throw new UnsupportedOperationException();
    }

    // --- [ VRCompositor_SetTrackingSpace ] ---

    /**
     * Sets tracking space returned by {@link #VRCompositor_WaitGetPoses WaitGetPoses}.
     *
     * @param eOrigin one of:<br><table><tr><td>{@link VR#ETrackingUniverseOrigin_TrackingUniverseSeated}</td></tr><tr><td>{@link VR#ETrackingUniverseOrigin_TrackingUniverseStanding}</td></tr><tr><td>{@link VR#ETrackingUniverseOrigin_TrackingUniverseRawAndUncalibrated}</td></tr></table>
     */
    public static void VRCompositor_SetTrackingSpace(@NativeType("ETrackingUniverseOrigin") int eOrigin) {
        long __functionAddress = OpenVR.VRCompositor.SetTrackingSpace;
        if (CHECKS) {
            check(__functionAddress);
        }
        callV(eOrigin, __functionAddress);
    }

    // --- [ VRCompositor_GetTrackingSpace ] ---

    /** Gets current tracking space returned by {@link #VRCompositor_WaitGetPoses WaitGetPoses}. */
    @NativeType("ETrackingUniverseOrigin")
    public static int VRCompositor_GetTrackingSpace() {
        long __functionAddress = OpenVR.VRCompositor.GetTrackingSpace;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callI(__functionAddress);
    }

    // --- [ VRCompositor_WaitGetPoses ] ---

    /** Unsafe version of: {@link #VRCompositor_WaitGetPoses WaitGetPoses} */
    public static int nVRCompositor_WaitGetPoses(long pRenderPoseArray, int unRenderPoseArrayCount, long pGamePoseArray, int unGamePoseArrayCount) {
        long __functionAddress = OpenVR.VRCompositor.WaitGetPoses;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPPI(pRenderPoseArray, unRenderPoseArrayCount, pGamePoseArray, unGamePoseArrayCount, __functionAddress);
    }

    /**
     * Scene applications should call this function to get poses to render with (and optionally poses predicted an additional frame out to use for gameplay).
     * This function will block until "running start" milliseconds before the start of the frame, and should be called at the last moment before needing to
     * start rendering.
     */
    @NativeType("EVRCompositorError")
    public static int VRCompositor_WaitGetPoses(@NativeType("TrackedDevicePose_t *") TrackedDevicePose.Buffer pRenderPoseArray, @Nullable @NativeType("TrackedDevicePose_t *") TrackedDevicePose.Buffer pGamePoseArray) {
        return nVRCompositor_WaitGetPoses(pRenderPoseArray.address(), pRenderPoseArray.remaining(), memAddressSafe(pGamePoseArray), remainingSafe(pGamePoseArray));
    }

    // --- [ VRCompositor_GetLastPoses ] ---

    /** Unsafe version of: {@link #VRCompositor_GetLastPoses GetLastPoses} */
    public static int nVRCompositor_GetLastPoses(long pRenderPoseArray, int unRenderPoseArrayCount, long pGamePoseArray, int unGamePoseArrayCount) {
        long __functionAddress = OpenVR.VRCompositor.GetLastPoses;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPPI(pRenderPoseArray, unRenderPoseArrayCount, pGamePoseArray, unGamePoseArrayCount, __functionAddress);
    }

    /** Get the last set of poses returned by {@link #VRCompositor_WaitGetPoses WaitGetPoses}. */
    @NativeType("EVRCompositorError")
    public static int VRCompositor_GetLastPoses(@NativeType("TrackedDevicePose_t *") TrackedDevicePose.Buffer pRenderPoseArray, @NativeType("TrackedDevicePose_t *") TrackedDevicePose.Buffer pGamePoseArray) {
        return nVRCompositor_GetLastPoses(pRenderPoseArray.address(), pRenderPoseArray.remaining(), pGamePoseArray.address(), pGamePoseArray.remaining());
    }

    // --- [ VRCompositor_GetLastPoseForTrackedDeviceIndex ] ---

    /** Unsafe version of: {@link #VRCompositor_GetLastPoseForTrackedDeviceIndex GetLastPoseForTrackedDeviceIndex} */
    public static int nVRCompositor_GetLastPoseForTrackedDeviceIndex(int unDeviceIndex, long pOutputPose, long pOutputGamePose) {
        long __functionAddress = OpenVR.VRCompositor.GetLastPoseForTrackedDeviceIndex;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPPI(unDeviceIndex, pOutputPose, pOutputGamePose, __functionAddress);
    }

    /**
     * Interface for accessing last set of poses returned by {@link #VRCompositor_WaitGetPoses WaitGetPoses} one at a time.
     * 
     * <p>It is okay to pass {@code NULL} for either pose if you only want one of the values.</p>
     *
     * @return {@link VR#EVRCompositorError_VRCompositorError_IndexOutOfRange} if {@code unDeviceIndex} not less than {@link VR#k_unMaxTrackedDeviceCount} otherwise
     *         {@link VR#EVRCompositorError_VRCompositorError_None}
     */
    @NativeType("EVRCompositorError")
    public static int VRCompositor_GetLastPoseForTrackedDeviceIndex(@NativeType("TrackedDeviceIndex_t") int unDeviceIndex, @Nullable @NativeType("TrackedDevicePose_t *") TrackedDevicePose pOutputPose, @Nullable @NativeType("TrackedDevicePose_t *") TrackedDevicePose pOutputGamePose) {
        return nVRCompositor_GetLastPoseForTrackedDeviceIndex(unDeviceIndex, memAddressSafe(pOutputPose), memAddressSafe(pOutputGamePose));
    }

    // --- [ VRCompositor_Submit ] ---

    /** Unsafe version of: {@link #VRCompositor_Submit Submit} */
    public static int nVRCompositor_Submit(int eEye, long pTexture, long pBounds, int nSubmitFlags) {
        long __functionAddress = OpenVR.VRCompositor.Submit;
        if (CHECKS) {
            check(__functionAddress);
            Texture.validate(pTexture);
        }
        return callPPI(eEye, pTexture, pBounds, nSubmitFlags, __functionAddress);
    }

    /**
     * Updated scene texture to display.
     * 
     * <p>If {@code pBounds} is {@code NULL} the entire texture will be used. If called from an OpenGL app, consider adding a
     * {@code glFlush} after submitting both frames to signal the driver to start processing, otherwise it may wait until the command buffer fills up, causing
     * the app to miss frames.</p>
     * 
     * <p>OpenGL dirty state: glBindTexture</p>
     *
     * @param eEye         one of:<br><table><tr><td>{@link VR#EVREye_Eye_Left}</td><td>{@link VR#EVREye_Eye_Right}</td></tr></table>
     * @param nSubmitFlags one of:<br><table><tr><td>{@link VR#EVRSubmitFlags_Submit_Default}</td><td>{@link VR#EVRSubmitFlags_Submit_LensDistortionAlreadyApplied}</td></tr><tr><td>{@link VR#EVRSubmitFlags_Submit_GlRenderBuffer}</td><td>{@link VR#EVRSubmitFlags_Submit_Reserved}</td></tr><tr><td>{@link VR#EVRSubmitFlags_Submit_TextureWithDepth}</td></tr></table>
     *
     * @return return codes:
     *         
     *         <ul>
     *         <li>IsNotSceneApplication (make sure to call VR_Init with VRApplication_Scene)</li>
     *         <li>DoNotHaveFocus (some other app has taken focus)</li>
     *         <li>TextureIsOnWrongDevice (application did not use proper AdapterIndex - see IVRSystem.GetDXGIOutputInfo)</li>
     *         <li>SharedTexturesNotSupported (application needs to call CreateDXGIFactory1 or later before creating DX device)</li>
     *         <li>TextureUsesUnsupportedFormat (scene textures must be compatible with DXGI sharing rules - e.g. uncompressed, no mips, etc.)</li>
     *         <li>InvalidTexture (usually means bad arguments passed in)</li>
     *         <li>AlreadySubmitted (app has submitted two left textures or two right textures in a single frame - i.e. before calling WaitGetPoses again)</li>
     *         </ul>
     */
    @NativeType("EVRCompositorError")
    public static int VRCompositor_Submit(@NativeType("EVREye") int eEye, @NativeType("Texture_t const *") Texture pTexture, @Nullable @NativeType("VRTextureBounds_t const *") VRTextureBounds pBounds, @NativeType("EVRSubmitFlags") int nSubmitFlags) {
        return nVRCompositor_Submit(eEye, pTexture.address(), memAddressSafe(pBounds), nSubmitFlags);
    }

    // --- [ VRCompositor_ClearLastSubmittedFrame ] ---

    /** Clears the frame that was sent with the last call to Submit. This will cause the compositor to show the grid until {@link #VRCompositor_Submit Submit} is called again. */
    public static void VRCompositor_ClearLastSubmittedFrame() {
        long __functionAddress = OpenVR.VRCompositor.ClearLastSubmittedFrame;
        if (CHECKS) {
            check(__functionAddress);
        }
        callV(__functionAddress);
    }

    // --- [ VRCompositor_PostPresentHandoff ] ---

    /**
     * Call immediately after presenting your app's window (i.e. companion window) to unblock the compositor.
     * 
     * <p>This is an optional call, which only needs to be used if you can't instead call {@link #VRCompositor_WaitGetPoses WaitGetPoses} immediately after {@code Present()}. For example, if
     * your engine's render and game loop are not on separate threads, or blocking the render thread until 3ms before the next vsync would introduce a
     * deadlock of some sort. This function tells the compositor that you have finished all rendering after having Submitted buffers for both eyes, and it is
     * free to start its rendering work. This should only be called from the same thread you are rendering on.</p>
     */
    public static void VRCompositor_PostPresentHandoff() {
        long __functionAddress = OpenVR.VRCompositor.PostPresentHandoff;
        if (CHECKS) {
            check(__functionAddress);
        }
        callV(__functionAddress);
    }

    // --- [ VRCompositor_GetFrameTiming ] ---

    /** Unsafe version of: {@link #VRCompositor_GetFrameTiming GetFrameTiming} */
    public static boolean nVRCompositor_GetFrameTiming(long pTiming, int unFramesAgo) {
        long __functionAddress = OpenVR.VRCompositor.GetFrameTiming;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPZ(pTiming, unFramesAgo, __functionAddress);
    }

    /**
     * Returns true if timing data is filled it. Sets oldest timing info if {@code nFramesAgo} is larger than the stored history.
     * 
     * <p>Be sure to set {@code timing.size = sizeof(Compositor_FrameTiming)} on struct passed in before calling this function.</p>
     */
    @NativeType("bool")
    public static boolean VRCompositor_GetFrameTiming(@NativeType("Compositor_FrameTiming *") CompositorFrameTiming.Buffer pTiming) {
        return nVRCompositor_GetFrameTiming(pTiming.address(), pTiming.remaining());
    }

    // --- [ VRCompositor_GetFrameTimings ] ---

    /** Unsafe version of: {@link #VRCompositor_GetFrameTimings GetFrameTimings} */
    public static int nVRCompositor_GetFrameTimings(long pTiming, int nFrames) {
        long __functionAddress = OpenVR.VRCompositor.GetFrameTimings;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPI(pTiming, nFrames, __functionAddress);
    }

    /**
     * Interface for copying a range of timing data. Frames are returned in ascending order (oldest to newest) with the last being the most recent frame. Only
     * the first entry's {@code m_nSize} needs to be set, as the rest will be inferred from that. Returns total number of entries filled out.
     */
    @NativeType("uint32_t")
    public static int VRCompositor_GetFrameTimings(@NativeType("Compositor_FrameTiming *") CompositorFrameTiming.Buffer pTiming) {
        return nVRCompositor_GetFrameTimings(pTiming.address(), pTiming.remaining());
    }

    // --- [ VRCompositor_GetFrameTimeRemaining ] ---

    /**
     * Returns the time in seconds left in the current (as identified by FrameTiming's frameIndex) frame.
     * 
     * <p>Due to "running start", this value may roll over to the next frame before ever reaching 0.0.</p>
     */
    public static float VRCompositor_GetFrameTimeRemaining() {
        long __functionAddress = OpenVR.VRCompositor.GetFrameTimeRemaining;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callF(__functionAddress);
    }

    // --- [ VRCompositor_GetCumulativeStats ] ---

    /** Unsafe version of: {@link #VRCompositor_GetCumulativeStats GetCumulativeStats} */
    public static void nVRCompositor_GetCumulativeStats(long pStats, int nStatsSizeInBytes) {
        long __functionAddress = OpenVR.VRCompositor.GetCumulativeStats;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(pStats, nStatsSizeInBytes, __functionAddress);
    }

    /**
     * Fills out stats accumulated for the last connected application.
     *
     * @param nStatsSizeInBytes must be {@code sizeof( Compositor_CumulativeStats )}
     */
    public static void VRCompositor_GetCumulativeStats(@NativeType("Compositor_CumulativeStats *") CompositorCumulativeStats pStats, @NativeType("uint32_t") int nStatsSizeInBytes) {
        nVRCompositor_GetCumulativeStats(pStats.address(), nStatsSizeInBytes);
    }

    /** Fills out stats accumulated for the last connected application. */
    public static void VRCompositor_GetCumulativeStats(@NativeType("Compositor_CumulativeStats *") CompositorCumulativeStats pStats) {
        nVRCompositor_GetCumulativeStats(pStats.address(), CompositorCumulativeStats.SIZEOF);
    }

    // --- [ VRCompositor_FadeToColor ] ---

    /**
     * Fades the view on the HMD to the specified color.
     * 
     * <p>The fade will take {@code fSeconds}, and the color values are between 0.0 and 1.0. This color is faded on top of the scene based on the alpha
     * parameter. Removing the fade color instantly would be {@code FadeToColor( 0.0, 0.0, 0.0, 0.0, 0.0 )}. Values are in un-premultiplied alpha space.</p>
     */
    public static void VRCompositor_FadeToColor(float fSeconds, float fRed, float fGreen, float fBlue, float fAlpha, @NativeType("bool") boolean bBackground) {
        long __functionAddress = OpenVR.VRCompositor.FadeToColor;
        if (CHECKS) {
            check(__functionAddress);
        }
        callV(fSeconds, fRed, fGreen, fBlue, fAlpha, bBackground, __functionAddress);
    }

    // --- [ VRCompositor_GetCurrentFadeColor ] ---

    /** Unsafe version of: {@link #VRCompositor_GetCurrentFadeColor GetCurrentFadeColor} */
    public static native void nVRCompositor_GetCurrentFadeColor(boolean bBackground, long __functionAddress, long __result);

    /** Unsafe version of: {@link #VRCompositor_GetCurrentFadeColor GetCurrentFadeColor} */
    public static void nVRCompositor_GetCurrentFadeColor(boolean bBackground, long __result) {
        long __functionAddress = OpenVR.VRCompositor.GetCurrentFadeColor;
        if (CHECKS) {
            check(__functionAddress);
        }
        nVRCompositor_GetCurrentFadeColor(bBackground, __functionAddress, __result);
    }

    /** Get current fade color value. */
    @NativeType("HmdColor_t")
    public static HmdColor VRCompositor_GetCurrentFadeColor(@NativeType("bool") boolean bBackground, @NativeType("HmdColor_t") HmdColor __result) {
        nVRCompositor_GetCurrentFadeColor(bBackground, __result.address());
        return __result;
    }

    // --- [ VRCompositor_FadeGrid ] ---

    /** Fading the Grid in or out in {@code fSeconds}. */
    public static void VRCompositor_FadeGrid(float fSeconds, @NativeType("bool") boolean bFadeIn) {
        long __functionAddress = OpenVR.VRCompositor.FadeGrid;
        if (CHECKS) {
            check(__functionAddress);
        }
        callV(fSeconds, bFadeIn, __functionAddress);
    }

    // --- [ VRCompositor_GetCurrentGridAlpha ] ---

    /** Get current alpha value of grid. */
    public static float VRCompositor_GetCurrentGridAlpha() {
        long __functionAddress = OpenVR.VRCompositor.GetCurrentGridAlpha;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callF(__functionAddress);
    }

    // --- [ VRCompositor_SetSkyboxOverride ] ---

    /** Unsafe version of: {@link #VRCompositor_SetSkyboxOverride SetSkyboxOverride} */
    public static int nVRCompositor_SetSkyboxOverride(long pTextures, int unTextureCount) {
        long __functionAddress = OpenVR.VRCompositor.SetSkyboxOverride;
        if (CHECKS) {
            check(__functionAddress);
            Texture.validate(pTextures, unTextureCount);
        }
        return callPI(pTextures, unTextureCount, __functionAddress);
    }

    /**
     * Override the skybox used in the compositor (e.g. for during level loads when the app can't feed scene images fast enough)
     * 
     * <p>Order is Front, Back, Left, Right, Top, Bottom. If only a single texture is passed, it is assumed in lat-long format. If two are passed, it is assumed
     * a lat-long stereo pair.</p>
     */
    @NativeType("EVRCompositorError")
    public static int VRCompositor_SetSkyboxOverride(@NativeType("Texture_t const *") Texture.Buffer pTextures) {
        return nVRCompositor_SetSkyboxOverride(pTextures.address(), pTextures.remaining());
    }

    // --- [ VRCompositor_ClearSkyboxOverride ] ---

    /** Resets compositor skybox back to defaults. */
    public static void VRCompositor_ClearSkyboxOverride() {
        long __functionAddress = OpenVR.VRCompositor.ClearSkyboxOverride;
        if (CHECKS) {
            check(__functionAddress);
        }
        callV(__functionAddress);
    }

    // --- [ VRCompositor_CompositorBringToFront ] ---

    /** Brings the compositor window to the front. This is useful for covering any other window that may be on the HMD and is obscuring the compositor window. */
    public static void VRCompositor_CompositorBringToFront() {
        long __functionAddress = OpenVR.VRCompositor.CompositorBringToFront;
        if (CHECKS) {
            check(__functionAddress);
        }
        callV(__functionAddress);
    }

    // --- [ VRCompositor_CompositorGoToBack ] ---

    /** Pushes the compositor window to the back. This is useful for allowing other applications to draw directly to the HMD. */
    public static void VRCompositor_CompositorGoToBack() {
        long __functionAddress = OpenVR.VRCompositor.CompositorGoToBack;
        if (CHECKS) {
            check(__functionAddress);
        }
        callV(__functionAddress);
    }

    // --- [ VRCompositor_CompositorQuit ] ---

    /**
     * Tells the compositor process to clean up and exit. You do not need to call this function at shutdown. Under normal circumstances the compositor will
     * manage its own life cycle based on what applications are running.
     */
    public static void VRCompositor_CompositorQuit() {
        long __functionAddress = OpenVR.VRCompositor.CompositorQuit;
        if (CHECKS) {
            check(__functionAddress);
        }
        callV(__functionAddress);
    }

    // --- [ VRCompositor_IsFullscreen ] ---

    /** Return whether the compositor is fullscreen. */
    @NativeType("bool")
    public static boolean VRCompositor_IsFullscreen() {
        long __functionAddress = OpenVR.VRCompositor.IsFullscreen;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callZ(__functionAddress);
    }

    // --- [ VRCompositor_GetCurrentSceneFocusProcess ] ---

    /** Returns the process ID of the process that is currently rendering the scene. */
    @NativeType("uint32_t")
    public static int VRCompositor_GetCurrentSceneFocusProcess() {
        long __functionAddress = OpenVR.VRCompositor.GetCurrentSceneFocusProcess;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callI(__functionAddress);
    }

    // --- [ VRCompositor_GetLastFrameRenderer ] ---

    /**
     * Returns the process ID of the process that rendered the last frame (or 0 if the compositor itself rendered the frame).
     *
     * @return 0 when fading out from an app and the app's process Id when fading into an app
     */
    @NativeType("uint32_t")
    public static int VRCompositor_GetLastFrameRenderer() {
        long __functionAddress = OpenVR.VRCompositor.GetLastFrameRenderer;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callI(__functionAddress);
    }

    // --- [ VRCompositor_CanRenderScene ] ---

    /** Returns true if the current process has the scene focus. */
    @NativeType("bool")
    public static boolean VRCompositor_CanRenderScene() {
        long __functionAddress = OpenVR.VRCompositor.CanRenderScene;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callZ(__functionAddress);
    }

    // --- [ VRCompositor_ShowMirrorWindow ] ---

    /** Opens the headset view (as either a window or docked widget depending on user's preferences) that displays what the user sees in the headset. */
    public static void VRCompositor_ShowMirrorWindow() {
        long __functionAddress = OpenVR.VRCompositor.ShowMirrorWindow;
        if (CHECKS) {
            check(__functionAddress);
        }
        callV(__functionAddress);
    }

    // --- [ VRCompositor_HideMirrorWindow ] ---

    /** Closes the headset view, either as a window or docked widget. */
    public static void VRCompositor_HideMirrorWindow() {
        long __functionAddress = OpenVR.VRCompositor.HideMirrorWindow;
        if (CHECKS) {
            check(__functionAddress);
        }
        callV(__functionAddress);
    }

    // --- [ VRCompositor_IsMirrorWindowVisible ] ---

    /** Returns true if the headset view (either as a window or docked widget) is shown. */
    @NativeType("bool")
    public static boolean VRCompositor_IsMirrorWindowVisible() {
        long __functionAddress = OpenVR.VRCompositor.IsMirrorWindowVisible;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callZ(__functionAddress);
    }

    // --- [ VRCompositor_CompositorDumpImages ] ---

    /** Writes back buffer and stereo left/right pair from the application to a 'screenshots' folder in the SteamVR runtime root. */
    public static void VRCompositor_CompositorDumpImages() {
        long __functionAddress = OpenVR.VRCompositor.CompositorDumpImages;
        if (CHECKS) {
            check(__functionAddress);
        }
        callV(__functionAddress);
    }

    // --- [ VRCompositor_ShouldAppRenderWithLowResources ] ---

    /** Let an app know it should be rendering with low resources. */
    @NativeType("bool")
    public static boolean VRCompositor_ShouldAppRenderWithLowResources() {
        long __functionAddress = OpenVR.VRCompositor.ShouldAppRenderWithLowResources;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callZ(__functionAddress);
    }

    // --- [ VRCompositor_ForceInterleavedReprojectionOn ] ---

    /** Override interleaved reprojection logic to force on. */
    public static void VRCompositor_ForceInterleavedReprojectionOn(@NativeType("bool") boolean bOverride) {
        long __functionAddress = OpenVR.VRCompositor.ForceInterleavedReprojectionOn;
        if (CHECKS) {
            check(__functionAddress);
        }
        callV(bOverride, __functionAddress);
    }

    // --- [ VRCompositor_ForceReconnectProcess ] ---

    /** Force reconnecting to the compositor process. */
    public static void VRCompositor_ForceReconnectProcess() {
        long __functionAddress = OpenVR.VRCompositor.ForceReconnectProcess;
        if (CHECKS) {
            check(__functionAddress);
        }
        callV(__functionAddress);
    }

    // --- [ VRCompositor_SuspendRendering ] ---

    /** Temporarily suspends rendering (useful for finer control over scene transitions). */
    public static void VRCompositor_SuspendRendering(@NativeType("bool") boolean bSuspend) {
        long __functionAddress = OpenVR.VRCompositor.SuspendRendering;
        if (CHECKS) {
            check(__functionAddress);
        }
        callV(bSuspend, __functionAddress);
    }

    // --- [ VRCompositor_GetMirrorTextureD3D11 ] ---

    /** Unsafe version of: {@link #VRCompositor_GetMirrorTextureD3D11 GetMirrorTextureD3D11} */
    public static int nVRCompositor_GetMirrorTextureD3D11(int eEye, long pD3D11DeviceOrResource, long ppD3D11ShaderResourceView) {
        long __functionAddress = OpenVR.VRCompositor.GetMirrorTextureD3D11;
        if (CHECKS) {
            check(__functionAddress);
            check(pD3D11DeviceOrResource);
        }
        return callPPI(eEye, pD3D11DeviceOrResource, ppD3D11ShaderResourceView, __functionAddress);
    }

    /**
     * Opens a shared D3D11 texture with the undistorted composited image for each eye.
     * 
     * <p>Use {@link #VRCompositor_ReleaseMirrorTextureD3D11 ReleaseMirrorTextureD3D11} when finished instead of calling Release on the resource itself.</p>
     */
    @NativeType("EVRCompositorError")
    public static int VRCompositor_GetMirrorTextureD3D11(@NativeType("EVREye") int eEye, @NativeType("void *") long pD3D11DeviceOrResource, @NativeType("void **") PointerBuffer ppD3D11ShaderResourceView) {
        if (CHECKS) {
            check(ppD3D11ShaderResourceView, 1);
        }
        return nVRCompositor_GetMirrorTextureD3D11(eEye, pD3D11DeviceOrResource, memAddress(ppD3D11ShaderResourceView));
    }

    // --- [ VRCompositor_ReleaseMirrorTextureD3D11 ] ---

    /** Releases a shared D3D11 texture. */
    public static void VRCompositor_ReleaseMirrorTextureD3D11(@NativeType("void *") long pD3D11ShaderResourceView) {
        long __functionAddress = OpenVR.VRCompositor.ReleaseMirrorTextureD3D11;
        if (CHECKS) {
            check(__functionAddress);
            check(pD3D11ShaderResourceView);
        }
        callPV(pD3D11ShaderResourceView, __functionAddress);
    }

    // --- [ VRCompositor_GetMirrorTextureGL ] ---

    /** Unsafe version of: {@link #VRCompositor_GetMirrorTextureGL GetMirrorTextureGL} */
    public static int nVRCompositor_GetMirrorTextureGL(int eEye, long pglTextureId, long pglSharedTextureHandle) {
        long __functionAddress = OpenVR.VRCompositor.GetMirrorTextureGL;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPPI(eEye, pglTextureId, pglSharedTextureHandle, __functionAddress);
    }

    /** Access to mirror textures from OpenGL. */
    @NativeType("EVRCompositorError")
    public static int VRCompositor_GetMirrorTextureGL(@NativeType("EVREye") int eEye, @NativeType("glUInt_t *") IntBuffer pglTextureId, @NativeType("glSharedTextureHandle_t *") PointerBuffer pglSharedTextureHandle) {
        if (CHECKS) {
            check(pglTextureId, 1);
            check(pglSharedTextureHandle, 1);
        }
        return nVRCompositor_GetMirrorTextureGL(eEye, memAddress(pglTextureId), memAddress(pglSharedTextureHandle));
    }

    // --- [ VRCompositor_ReleaseSharedGLTexture ] ---

    @NativeType("bool")
    public static boolean VRCompositor_ReleaseSharedGLTexture(@NativeType("glUInt_t") int glTextureId, @NativeType("glSharedTextureHandle_t") long glSharedTextureHandle) {
        long __functionAddress = OpenVR.VRCompositor.ReleaseSharedGLTexture;
        if (CHECKS) {
            check(__functionAddress);
            check(glSharedTextureHandle);
        }
        return callPZ(glTextureId, glSharedTextureHandle, __functionAddress);
    }

    // --- [ VRCompositor_LockGLSharedTextureForAccess ] ---

    public static void VRCompositor_LockGLSharedTextureForAccess(@NativeType("glSharedTextureHandle_t") long glSharedTextureHandle) {
        long __functionAddress = OpenVR.VRCompositor.LockGLSharedTextureForAccess;
        if (CHECKS) {
            check(__functionAddress);
            check(glSharedTextureHandle);
        }
        callPV(glSharedTextureHandle, __functionAddress);
    }

    // --- [ VRCompositor_UnlockGLSharedTextureForAccess ] ---

    public static void VRCompositor_UnlockGLSharedTextureForAccess(@NativeType("glSharedTextureHandle_t") long glSharedTextureHandle) {
        long __functionAddress = OpenVR.VRCompositor.UnlockGLSharedTextureForAccess;
        if (CHECKS) {
            check(__functionAddress);
            check(glSharedTextureHandle);
        }
        callPV(glSharedTextureHandle, __functionAddress);
    }

    // --- [ VRCompositor_GetVulkanInstanceExtensionsRequired ] ---

    /** Unsafe version of: {@link #VRCompositor_GetVulkanInstanceExtensionsRequired GetVulkanInstanceExtensionsRequired} */
    public static int nVRCompositor_GetVulkanInstanceExtensionsRequired(long pchValue, int unBufferSize) {
        long __functionAddress = OpenVR.VRCompositor.GetVulkanInstanceExtensionsRequired;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPI(pchValue, unBufferSize, __functionAddress);
    }

    /**
     * Returns 0. Otherwise it returns the length of the number of bytes necessary to hold this string including the trailing null. The string will be a space
     * separated list of-required instance extensions to enable in {@code VkCreateInstance}.
     */
    @NativeType("uint32_t")
    public static int VRCompositor_GetVulkanInstanceExtensionsRequired(@Nullable @NativeType("char *") ByteBuffer pchValue) {
        return nVRCompositor_GetVulkanInstanceExtensionsRequired(memAddressSafe(pchValue), remainingSafe(pchValue));
    }

    /**
     * Returns 0. Otherwise it returns the length of the number of bytes necessary to hold this string including the trailing null. The string will be a space
     * separated list of-required instance extensions to enable in {@code VkCreateInstance}.
     */
    @NativeType("uint32_t")
    public static String VRCompositor_GetVulkanInstanceExtensionsRequired(@NativeType("uint32_t") int unBufferSize) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            ByteBuffer pchValue = stack.malloc(unBufferSize);
            int __result = nVRCompositor_GetVulkanInstanceExtensionsRequired(memAddress(pchValue), unBufferSize);
            return memASCII(pchValue, __result - 1);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ VRCompositor_GetVulkanDeviceExtensionsRequired ] ---

    /** Unsafe version of: {@link #VRCompositor_GetVulkanDeviceExtensionsRequired GetVulkanDeviceExtensionsRequired} */
    public static int nVRCompositor_GetVulkanDeviceExtensionsRequired(long pPhysicalDevice, long pchValue, int unBufferSize) {
        long __functionAddress = OpenVR.VRCompositor.GetVulkanDeviceExtensionsRequired;
        if (CHECKS) {
            check(__functionAddress);
            check(pPhysicalDevice);
        }
        return callPPI(pPhysicalDevice, pchValue, unBufferSize, __functionAddress);
    }

    /**
     * Returns 0. Otherwise it returns the length of the number of bytes necessary to hold this string including the trailing null. The string will be a space
     * separated list of required device extensions to enable in {@code VkCreateDevice}.
     */
    @NativeType("uint32_t")
    public static int VRCompositor_GetVulkanDeviceExtensionsRequired(@NativeType("VkPhysicalDevice_T *") long pPhysicalDevice, @Nullable @NativeType("char *") ByteBuffer pchValue) {
        return nVRCompositor_GetVulkanDeviceExtensionsRequired(pPhysicalDevice, memAddressSafe(pchValue), remainingSafe(pchValue));
    }

    /**
     * Returns 0. Otherwise it returns the length of the number of bytes necessary to hold this string including the trailing null. The string will be a space
     * separated list of required device extensions to enable in {@code VkCreateDevice}.
     */
    @NativeType("uint32_t")
    public static String VRCompositor_GetVulkanDeviceExtensionsRequired(@NativeType("VkPhysicalDevice_T *") long pPhysicalDevice, @NativeType("uint32_t") int unBufferSize) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            ByteBuffer pchValue = stack.malloc(unBufferSize);
            int __result = nVRCompositor_GetVulkanDeviceExtensionsRequired(pPhysicalDevice, memAddress(pchValue), unBufferSize);
            return memASCII(pchValue, __result - 1);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ VRCompositor_SetExplicitTimingMode ] ---

    /**
     * <h3>Vulkan/D3D12 Only</h3>
     * 
     * <p>There are two purposes for {@code SetExplicitTimingMode}:</p>
     * 
     * <ol>
     * <li>To get a more accurate GPU timestamp for when the frame begins in Vulkan/D3D12 applications.</li>
     * <li>(Optional) To avoid having {@link #VRCompositor_WaitGetPoses WaitGetPoses} access the Vulkan queue so that the queue can be accessed from another thread while {@code WaitGetPoses}
     * is executing.</li>
     * </ol>
     * 
     * <p>More accurate GPU timestamp for the start of the frame is achieved by the application calling {@link #VRCompositor_SubmitExplicitTimingData SubmitExplicitTimingData} immediately before its first
     * submission to the Vulkan/D3D12 queue. This is more accurate because normally this GPU timestamp is recorded during {@link #VRCompositor_WaitGetPoses WaitGetPoses}. In D3D11,
     * {@code WaitGetPoses} queues a GPU timestamp write, but it does not actually get submitted to the GPU until the application flushes. By using
     * {@code SubmitExplicitTimingData}, the timestamp is recorded at the same place for Vulkan/D3D12 as it is for D3D11, resulting in a more accurate GPU
     * time measurement for the frame.</p>
     * 
     * <p>Avoiding {@link #VRCompositor_WaitGetPoses WaitGetPoses} accessing the Vulkan queue can be achieved using {@code SetExplicitTimingMode} as well. If this is desired, the application
     * should set the timing mode to {@link VR#EVRCompositorTimingMode_VRCompositorTimingMode_Explicit_ApplicationPerformsPostPresentHandoff} and <b>MUST</b> call
     * {@link #VRCompositor_PostPresentHandoff PostPresentHandoff} itself. If these conditions are met, then {@code WaitGetPoses} is guaranteed not to access the queue. Note that
     * {@code PostPresentHandoff} and {@code SubmitExplicitTimingData} will access the queue, so only {@code WaitGetPoses} becomes safe for accessing the
     * queue from another thread.</p>
     */
    public static void VRCompositor_SetExplicitTimingMode(@NativeType("EVRCompositorTimingMode") int eTimingMode) {
        long __functionAddress = OpenVR.VRCompositor.SetExplicitTimingMode;
        if (CHECKS) {
            check(__functionAddress);
        }
        callV(eTimingMode, __functionAddress);
    }

    // --- [ VRCompositor_SubmitExplicitTimingData ] ---

    /**
     * <h3>Vulkan/D3D12 Only</h3>
     * 
     * <p>Submit explicit timing data. When {@code SetExplicitTimingMode} is true, this must be called immediately before the application's first
     * {@code vkQueueSubmit} (Vulkan) or {@code ID3D12CommandQueue::ExecuteCommandLists} (D3D12) of each frame. This function will insert a GPU timestamp
     * write just before the application starts its rendering. This function will perform a {@code vkQueueSubmit} on Vulkan so must not be done simultaneously
     * with {@code VkQueue} operations on another thread.</p>
     *
     * @return {@link VR#EVRCompositorError_VRCompositorError_RequestFailed} if {@code SetExplicitTimingMode} is not enabled
     */
    @NativeType("EVRCompositorError")
    public static int VRCompositor_SubmitExplicitTimingData() {
        long __functionAddress = OpenVR.VRCompositor.SubmitExplicitTimingData;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callI(__functionAddress);
    }

    // --- [ VRCompositor_IsMotionSmoothingEnabled ] ---

    /**
     * Indicates whether or not motion smoothing is enabled by the user settings.
     * 
     * <p>If you want to know if motion smoothing actually triggered due to a late frame, check {@link CompositorFrameTiming} {@code m_nReprojectionFlags} &amp;
     * {@code VRCompositor_ReprojectionMotion} instead.</p>
     */
    @NativeType("bool")
    public static boolean VRCompositor_IsMotionSmoothingEnabled() {
        long __functionAddress = OpenVR.VRCompositor.IsMotionSmoothingEnabled;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callZ(__functionAddress);
    }

    // --- [ VRCompositor_IsMotionSmoothingSupported ] ---

    /** Indicates whether or not motion smoothing is supported by the current hardware. */
    @NativeType("bool")
    public static boolean VRCompositor_IsMotionSmoothingSupported() {
        long __functionAddress = OpenVR.VRCompositor.IsMotionSmoothingSupported;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callZ(__functionAddress);
    }

    // --- [ VRCompositor_IsCurrentSceneFocusAppLoading ] ---

    /**
     * Indicates whether or not the current scene focus app is currently loading.
     * 
     * <p>This is inferred from its use of {@code FadeGrid} to explicitly fade to the compositor to cover up the fact that it cannot render at a sustained full
     * framerate during this time.</p>
     */
    @NativeType("bool")
    public static boolean VRCompositor_IsCurrentSceneFocusAppLoading() {
        long __functionAddress = OpenVR.VRCompositor.IsCurrentSceneFocusAppLoading;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callZ(__functionAddress);
    }

}