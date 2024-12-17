/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.openvr;

import org.jspecify.annotations.*;

import java.nio.*;

import org.lwjgl.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.JNI.*;
import static org.lwjgl.system.MemoryStack.*;
import static org.lwjgl.system.MemoryUtil.*;

public class VRCompositor {

    static { OpenVR.initialize(); }

    public static final int
        VRCompositor_ReprojectionReason_Cpu = 0x01,
        VRCompositor_ReprojectionReason_Gpu = 0x02,
        VRCompositor_ReprojectionAsync      = 0x04,
        VRCompositor_ReprojectionMotion     = 0x08,
        VRCompositor_PredictionMask         = 0xF0,
        VRCompositor_ThrottleMask           = 0xF00;

    protected VRCompositor() {
        throw new UnsupportedOperationException();
    }

    // --- [ VRCompositor_SetTrackingSpace ] ---

    /** {@code void VRCompositor_SetTrackingSpace(ETrackingUniverseOrigin eOrigin)} */
    public static void VRCompositor_SetTrackingSpace(@NativeType("ETrackingUniverseOrigin") int eOrigin) {
        long __functionAddress = OpenVR.VRCompositor.SetTrackingSpace;
        if (CHECKS) {
            check(__functionAddress);
        }
        callV(eOrigin, __functionAddress);
    }

    // --- [ VRCompositor_GetTrackingSpace ] ---

    /** {@code ETrackingUniverseOrigin VRCompositor_GetTrackingSpace(void)} */
    @NativeType("ETrackingUniverseOrigin")
    public static int VRCompositor_GetTrackingSpace() {
        long __functionAddress = OpenVR.VRCompositor.GetTrackingSpace;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callI(__functionAddress);
    }

    // --- [ VRCompositor_WaitGetPoses ] ---

    /** {@code EVRCompositorError VRCompositor_WaitGetPoses(TrackedDevicePose_t * pRenderPoseArray, uint32_t unRenderPoseArrayCount, TrackedDevicePose_t * pGamePoseArray, uint32_t unGamePoseArrayCount)} */
    public static int nVRCompositor_WaitGetPoses(long pRenderPoseArray, int unRenderPoseArrayCount, long pGamePoseArray, int unGamePoseArrayCount) {
        long __functionAddress = OpenVR.VRCompositor.WaitGetPoses;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPPI(pRenderPoseArray, unRenderPoseArrayCount, pGamePoseArray, unGamePoseArrayCount, __functionAddress);
    }

    /** {@code EVRCompositorError VRCompositor_WaitGetPoses(TrackedDevicePose_t * pRenderPoseArray, uint32_t unRenderPoseArrayCount, TrackedDevicePose_t * pGamePoseArray, uint32_t unGamePoseArrayCount)} */
    @NativeType("EVRCompositorError")
    public static int VRCompositor_WaitGetPoses(@NativeType("TrackedDevicePose_t *") TrackedDevicePose.Buffer pRenderPoseArray, @NativeType("TrackedDevicePose_t *") TrackedDevicePose.@Nullable Buffer pGamePoseArray) {
        return nVRCompositor_WaitGetPoses(pRenderPoseArray.address(), pRenderPoseArray.remaining(), memAddressSafe(pGamePoseArray), remainingSafe(pGamePoseArray));
    }

    // --- [ VRCompositor_GetLastPoses ] ---

    /** {@code EVRCompositorError VRCompositor_GetLastPoses(TrackedDevicePose_t * pRenderPoseArray, uint32_t unRenderPoseArrayCount, TrackedDevicePose_t * pGamePoseArray, uint32_t unGamePoseArrayCount)} */
    public static int nVRCompositor_GetLastPoses(long pRenderPoseArray, int unRenderPoseArrayCount, long pGamePoseArray, int unGamePoseArrayCount) {
        long __functionAddress = OpenVR.VRCompositor.GetLastPoses;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPPI(pRenderPoseArray, unRenderPoseArrayCount, pGamePoseArray, unGamePoseArrayCount, __functionAddress);
    }

    /** {@code EVRCompositorError VRCompositor_GetLastPoses(TrackedDevicePose_t * pRenderPoseArray, uint32_t unRenderPoseArrayCount, TrackedDevicePose_t * pGamePoseArray, uint32_t unGamePoseArrayCount)} */
    @NativeType("EVRCompositorError")
    public static int VRCompositor_GetLastPoses(@NativeType("TrackedDevicePose_t *") TrackedDevicePose.Buffer pRenderPoseArray, @NativeType("TrackedDevicePose_t *") TrackedDevicePose.Buffer pGamePoseArray) {
        return nVRCompositor_GetLastPoses(pRenderPoseArray.address(), pRenderPoseArray.remaining(), pGamePoseArray.address(), pGamePoseArray.remaining());
    }

    // --- [ VRCompositor_GetLastPoseForTrackedDeviceIndex ] ---

    /** {@code EVRCompositorError VRCompositor_GetLastPoseForTrackedDeviceIndex(TrackedDeviceIndex_t unDeviceIndex, TrackedDevicePose_t * pOutputPose, TrackedDevicePose_t * pOutputGamePose)} */
    public static int nVRCompositor_GetLastPoseForTrackedDeviceIndex(int unDeviceIndex, long pOutputPose, long pOutputGamePose) {
        long __functionAddress = OpenVR.VRCompositor.GetLastPoseForTrackedDeviceIndex;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPPI(unDeviceIndex, pOutputPose, pOutputGamePose, __functionAddress);
    }

    /** {@code EVRCompositorError VRCompositor_GetLastPoseForTrackedDeviceIndex(TrackedDeviceIndex_t unDeviceIndex, TrackedDevicePose_t * pOutputPose, TrackedDevicePose_t * pOutputGamePose)} */
    @NativeType("EVRCompositorError")
    public static int VRCompositor_GetLastPoseForTrackedDeviceIndex(@NativeType("TrackedDeviceIndex_t") int unDeviceIndex, @NativeType("TrackedDevicePose_t *") @Nullable TrackedDevicePose pOutputPose, @NativeType("TrackedDevicePose_t *") @Nullable TrackedDevicePose pOutputGamePose) {
        return nVRCompositor_GetLastPoseForTrackedDeviceIndex(unDeviceIndex, memAddressSafe(pOutputPose), memAddressSafe(pOutputGamePose));
    }

    // --- [ VRCompositor_Submit ] ---

    /** {@code EVRCompositorError VRCompositor_Submit(EVREye eEye, Texture_t const * pTexture, VRTextureBounds_t const * pBounds, EVRSubmitFlags nSubmitFlags)} */
    public static int nVRCompositor_Submit(int eEye, long pTexture, long pBounds, int nSubmitFlags) {
        long __functionAddress = OpenVR.VRCompositor.Submit;
        if (CHECKS) {
            check(__functionAddress);
            Texture.validate(pTexture);
        }
        return callPPI(eEye, pTexture, pBounds, nSubmitFlags, __functionAddress);
    }

    /** {@code EVRCompositorError VRCompositor_Submit(EVREye eEye, Texture_t const * pTexture, VRTextureBounds_t const * pBounds, EVRSubmitFlags nSubmitFlags)} */
    @NativeType("EVRCompositorError")
    public static int VRCompositor_Submit(@NativeType("EVREye") int eEye, @NativeType("Texture_t const *") Texture pTexture, @NativeType("VRTextureBounds_t const *") @Nullable VRTextureBounds pBounds, @NativeType("EVRSubmitFlags") int nSubmitFlags) {
        return nVRCompositor_Submit(eEye, pTexture.address(), memAddressSafe(pBounds), nSubmitFlags);
    }

    // --- [ VRCompositor_SubmitWithArrayIndex ] ---

    /** {@code EVRCompositorError VRCompositor_SubmitWithArrayIndex(EVREye eEye, Texture_t const * pTexture, uint32_t unTextureArrayIndex, VRTextureBounds_t const * pBounds, EVRSubmitFlags nSubmitFlags)} */
    public static int nVRCompositor_SubmitWithArrayIndex(int eEye, long pTexture, int unTextureArrayIndex, long pBounds, int nSubmitFlags) {
        long __functionAddress = OpenVR.VRCompositor.SubmitWithArrayIndex;
        if (CHECKS) {
            check(__functionAddress);
            Texture.validate(pTexture);
        }
        return callPPI(eEye, pTexture, unTextureArrayIndex, pBounds, nSubmitFlags, __functionAddress);
    }

    /** {@code EVRCompositorError VRCompositor_SubmitWithArrayIndex(EVREye eEye, Texture_t const * pTexture, uint32_t unTextureArrayIndex, VRTextureBounds_t const * pBounds, EVRSubmitFlags nSubmitFlags)} */
    @NativeType("EVRCompositorError")
    public static int VRCompositor_SubmitWithArrayIndex(@NativeType("EVREye") int eEye, @NativeType("Texture_t const *") Texture pTexture, @NativeType("uint32_t") int unTextureArrayIndex, @NativeType("VRTextureBounds_t const *") @Nullable VRTextureBounds pBounds, @NativeType("EVRSubmitFlags") int nSubmitFlags) {
        return nVRCompositor_SubmitWithArrayIndex(eEye, pTexture.address(), unTextureArrayIndex, memAddressSafe(pBounds), nSubmitFlags);
    }

    // --- [ VRCompositor_ClearLastSubmittedFrame ] ---

    /** {@code void VRCompositor_ClearLastSubmittedFrame(void)} */
    public static void VRCompositor_ClearLastSubmittedFrame() {
        long __functionAddress = OpenVR.VRCompositor.ClearLastSubmittedFrame;
        if (CHECKS) {
            check(__functionAddress);
        }
        callV(__functionAddress);
    }

    // --- [ VRCompositor_PostPresentHandoff ] ---

    /** {@code void VRCompositor_PostPresentHandoff(void)} */
    public static void VRCompositor_PostPresentHandoff() {
        long __functionAddress = OpenVR.VRCompositor.PostPresentHandoff;
        if (CHECKS) {
            check(__functionAddress);
        }
        callV(__functionAddress);
    }

    // --- [ VRCompositor_GetFrameTiming ] ---

    /** {@code bool VRCompositor_GetFrameTiming(Compositor_FrameTiming * pTiming, uint32_t unFramesAgo)} */
    public static boolean nVRCompositor_GetFrameTiming(long pTiming, int unFramesAgo) {
        long __functionAddress = OpenVR.VRCompositor.GetFrameTiming;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPZ(pTiming, unFramesAgo, __functionAddress);
    }

    /** {@code bool VRCompositor_GetFrameTiming(Compositor_FrameTiming * pTiming, uint32_t unFramesAgo)} */
    @NativeType("bool")
    public static boolean VRCompositor_GetFrameTiming(@NativeType("Compositor_FrameTiming *") CompositorFrameTiming.Buffer pTiming) {
        return nVRCompositor_GetFrameTiming(pTiming.address(), pTiming.remaining());
    }

    // --- [ VRCompositor_GetFrameTimings ] ---

    /** {@code uint32_t VRCompositor_GetFrameTimings(Compositor_FrameTiming * pTiming, uint32_t nFrames)} */
    public static int nVRCompositor_GetFrameTimings(long pTiming, int nFrames) {
        long __functionAddress = OpenVR.VRCompositor.GetFrameTimings;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPI(pTiming, nFrames, __functionAddress);
    }

    /** {@code uint32_t VRCompositor_GetFrameTimings(Compositor_FrameTiming * pTiming, uint32_t nFrames)} */
    @NativeType("uint32_t")
    public static int VRCompositor_GetFrameTimings(@NativeType("Compositor_FrameTiming *") CompositorFrameTiming.Buffer pTiming) {
        return nVRCompositor_GetFrameTimings(pTiming.address(), pTiming.remaining());
    }

    // --- [ VRCompositor_GetFrameTimeRemaining ] ---

    /** {@code float VRCompositor_GetFrameTimeRemaining(void)} */
    public static float VRCompositor_GetFrameTimeRemaining() {
        long __functionAddress = OpenVR.VRCompositor.GetFrameTimeRemaining;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callF(__functionAddress);
    }

    // --- [ VRCompositor_GetCumulativeStats ] ---

    /** {@code void VRCompositor_GetCumulativeStats(Compositor_CumulativeStats * pStats, uint32_t nStatsSizeInBytes)} */
    public static void nVRCompositor_GetCumulativeStats(long pStats, int nStatsSizeInBytes) {
        long __functionAddress = OpenVR.VRCompositor.GetCumulativeStats;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(pStats, nStatsSizeInBytes, __functionAddress);
    }

    /** {@code void VRCompositor_GetCumulativeStats(Compositor_CumulativeStats * pStats, uint32_t nStatsSizeInBytes)} */
    public static void VRCompositor_GetCumulativeStats(@NativeType("Compositor_CumulativeStats *") CompositorCumulativeStats pStats, @NativeType("uint32_t") int nStatsSizeInBytes) {
        nVRCompositor_GetCumulativeStats(pStats.address(), nStatsSizeInBytes);
    }

    /** {@code void VRCompositor_GetCumulativeStats(Compositor_CumulativeStats * pStats, uint32_t nStatsSizeInBytes)} */
    public static void VRCompositor_GetCumulativeStats(@NativeType("Compositor_CumulativeStats *") CompositorCumulativeStats pStats) {
        nVRCompositor_GetCumulativeStats(pStats.address(), CompositorCumulativeStats.SIZEOF);
    }

    // --- [ VRCompositor_FadeToColor ] ---

    /** {@code void VRCompositor_FadeToColor(float fSeconds, float fRed, float fGreen, float fBlue, float fAlpha, bool bBackground)} */
    public static void VRCompositor_FadeToColor(float fSeconds, float fRed, float fGreen, float fBlue, float fAlpha, @NativeType("bool") boolean bBackground) {
        long __functionAddress = OpenVR.VRCompositor.FadeToColor;
        if (CHECKS) {
            check(__functionAddress);
        }
        callV(fSeconds, fRed, fGreen, fBlue, fAlpha, bBackground, __functionAddress);
    }

    // --- [ VRCompositor_GetCurrentFadeColor ] ---

    /** {@code HmdColor_t VRCompositor_GetCurrentFadeColor(bool bBackground)} */
    public static native void nVRCompositor_GetCurrentFadeColor(boolean bBackground, long __functionAddress, long __result);

    /** {@code HmdColor_t VRCompositor_GetCurrentFadeColor(bool bBackground)} */
    public static void nVRCompositor_GetCurrentFadeColor(boolean bBackground, long __result) {
        long __functionAddress = OpenVR.VRCompositor.GetCurrentFadeColor;
        if (CHECKS) {
            check(__functionAddress);
        }
        nVRCompositor_GetCurrentFadeColor(bBackground, __functionAddress, __result);
    }

    /** {@code HmdColor_t VRCompositor_GetCurrentFadeColor(bool bBackground)} */
    @NativeType("HmdColor_t")
    public static HmdColor VRCompositor_GetCurrentFadeColor(@NativeType("bool") boolean bBackground, @NativeType("HmdColor_t") HmdColor __result) {
        nVRCompositor_GetCurrentFadeColor(bBackground, __result.address());
        return __result;
    }

    // --- [ VRCompositor_FadeGrid ] ---

    /** {@code void VRCompositor_FadeGrid(float fSeconds, bool bFadeGridIn)} */
    public static void VRCompositor_FadeGrid(float fSeconds, @NativeType("bool") boolean bFadeGridIn) {
        long __functionAddress = OpenVR.VRCompositor.FadeGrid;
        if (CHECKS) {
            check(__functionAddress);
        }
        callV(fSeconds, bFadeGridIn, __functionAddress);
    }

    // --- [ VRCompositor_GetCurrentGridAlpha ] ---

    /** {@code float VRCompositor_GetCurrentGridAlpha(void)} */
    public static float VRCompositor_GetCurrentGridAlpha() {
        long __functionAddress = OpenVR.VRCompositor.GetCurrentGridAlpha;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callF(__functionAddress);
    }

    // --- [ VRCompositor_SetSkyboxOverride ] ---

    /** {@code EVRCompositorError VRCompositor_SetSkyboxOverride(Texture_t const * pTextures, uint32_t unTextureCount)} */
    public static int nVRCompositor_SetSkyboxOverride(long pTextures, int unTextureCount) {
        long __functionAddress = OpenVR.VRCompositor.SetSkyboxOverride;
        if (CHECKS) {
            check(__functionAddress);
            Struct.validate(pTextures, unTextureCount, Texture.SIZEOF, Texture::validate);
        }
        return callPI(pTextures, unTextureCount, __functionAddress);
    }

    /** {@code EVRCompositorError VRCompositor_SetSkyboxOverride(Texture_t const * pTextures, uint32_t unTextureCount)} */
    @NativeType("EVRCompositorError")
    public static int VRCompositor_SetSkyboxOverride(@NativeType("Texture_t const *") Texture.Buffer pTextures) {
        return nVRCompositor_SetSkyboxOverride(pTextures.address(), pTextures.remaining());
    }

    // --- [ VRCompositor_ClearSkyboxOverride ] ---

    /** {@code void VRCompositor_ClearSkyboxOverride(void)} */
    public static void VRCompositor_ClearSkyboxOverride() {
        long __functionAddress = OpenVR.VRCompositor.ClearSkyboxOverride;
        if (CHECKS) {
            check(__functionAddress);
        }
        callV(__functionAddress);
    }

    // --- [ VRCompositor_CompositorBringToFront ] ---

    /** {@code void VRCompositor_CompositorBringToFront(void)} */
    public static void VRCompositor_CompositorBringToFront() {
        long __functionAddress = OpenVR.VRCompositor.CompositorBringToFront;
        if (CHECKS) {
            check(__functionAddress);
        }
        callV(__functionAddress);
    }

    // --- [ VRCompositor_CompositorGoToBack ] ---

    /** {@code void VRCompositor_CompositorGoToBack(void)} */
    public static void VRCompositor_CompositorGoToBack() {
        long __functionAddress = OpenVR.VRCompositor.CompositorGoToBack;
        if (CHECKS) {
            check(__functionAddress);
        }
        callV(__functionAddress);
    }

    // --- [ VRCompositor_CompositorQuit ] ---

    /** {@code void VRCompositor_CompositorQuit(void)} */
    public static void VRCompositor_CompositorQuit() {
        long __functionAddress = OpenVR.VRCompositor.CompositorQuit;
        if (CHECKS) {
            check(__functionAddress);
        }
        callV(__functionAddress);
    }

    // --- [ VRCompositor_IsFullscreen ] ---

    /** {@code bool VRCompositor_IsFullscreen(void)} */
    @NativeType("bool")
    public static boolean VRCompositor_IsFullscreen() {
        long __functionAddress = OpenVR.VRCompositor.IsFullscreen;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callZ(__functionAddress);
    }

    // --- [ VRCompositor_GetCurrentSceneFocusProcess ] ---

    /** {@code uint32_t VRCompositor_GetCurrentSceneFocusProcess(void)} */
    @NativeType("uint32_t")
    public static int VRCompositor_GetCurrentSceneFocusProcess() {
        long __functionAddress = OpenVR.VRCompositor.GetCurrentSceneFocusProcess;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callI(__functionAddress);
    }

    // --- [ VRCompositor_GetLastFrameRenderer ] ---

    /** {@code uint32_t VRCompositor_GetLastFrameRenderer(void)} */
    @NativeType("uint32_t")
    public static int VRCompositor_GetLastFrameRenderer() {
        long __functionAddress = OpenVR.VRCompositor.GetLastFrameRenderer;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callI(__functionAddress);
    }

    // --- [ VRCompositor_CanRenderScene ] ---

    /** {@code bool VRCompositor_CanRenderScene(void)} */
    @NativeType("bool")
    public static boolean VRCompositor_CanRenderScene() {
        long __functionAddress = OpenVR.VRCompositor.CanRenderScene;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callZ(__functionAddress);
    }

    // --- [ VRCompositor_ShowMirrorWindow ] ---

    /** {@code void VRCompositor_ShowMirrorWindow(void)} */
    public static void VRCompositor_ShowMirrorWindow() {
        long __functionAddress = OpenVR.VRCompositor.ShowMirrorWindow;
        if (CHECKS) {
            check(__functionAddress);
        }
        callV(__functionAddress);
    }

    // --- [ VRCompositor_HideMirrorWindow ] ---

    /** {@code void VRCompositor_HideMirrorWindow(void)} */
    public static void VRCompositor_HideMirrorWindow() {
        long __functionAddress = OpenVR.VRCompositor.HideMirrorWindow;
        if (CHECKS) {
            check(__functionAddress);
        }
        callV(__functionAddress);
    }

    // --- [ VRCompositor_IsMirrorWindowVisible ] ---

    /** {@code bool VRCompositor_IsMirrorWindowVisible(void)} */
    @NativeType("bool")
    public static boolean VRCompositor_IsMirrorWindowVisible() {
        long __functionAddress = OpenVR.VRCompositor.IsMirrorWindowVisible;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callZ(__functionAddress);
    }

    // --- [ VRCompositor_CompositorDumpImages ] ---

    /** {@code void VRCompositor_CompositorDumpImages(void)} */
    public static void VRCompositor_CompositorDumpImages() {
        long __functionAddress = OpenVR.VRCompositor.CompositorDumpImages;
        if (CHECKS) {
            check(__functionAddress);
        }
        callV(__functionAddress);
    }

    // --- [ VRCompositor_ShouldAppRenderWithLowResources ] ---

    /** {@code bool VRCompositor_ShouldAppRenderWithLowResources(void)} */
    @NativeType("bool")
    public static boolean VRCompositor_ShouldAppRenderWithLowResources() {
        long __functionAddress = OpenVR.VRCompositor.ShouldAppRenderWithLowResources;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callZ(__functionAddress);
    }

    // --- [ VRCompositor_ForceInterleavedReprojectionOn ] ---

    /** {@code void VRCompositor_ForceInterleavedReprojectionOn(bool bOverride)} */
    public static void VRCompositor_ForceInterleavedReprojectionOn(@NativeType("bool") boolean bOverride) {
        long __functionAddress = OpenVR.VRCompositor.ForceInterleavedReprojectionOn;
        if (CHECKS) {
            check(__functionAddress);
        }
        callV(bOverride, __functionAddress);
    }

    // --- [ VRCompositor_ForceReconnectProcess ] ---

    /** {@code void VRCompositor_ForceReconnectProcess(void)} */
    public static void VRCompositor_ForceReconnectProcess() {
        long __functionAddress = OpenVR.VRCompositor.ForceReconnectProcess;
        if (CHECKS) {
            check(__functionAddress);
        }
        callV(__functionAddress);
    }

    // --- [ VRCompositor_SuspendRendering ] ---

    /** {@code void VRCompositor_SuspendRendering(bool bSuspend)} */
    public static void VRCompositor_SuspendRendering(@NativeType("bool") boolean bSuspend) {
        long __functionAddress = OpenVR.VRCompositor.SuspendRendering;
        if (CHECKS) {
            check(__functionAddress);
        }
        callV(bSuspend, __functionAddress);
    }

    // --- [ VRCompositor_GetMirrorTextureD3D11 ] ---

    /** {@code EVRCompositorError VRCompositor_GetMirrorTextureD3D11(EVREye eEye, void * pD3D11DeviceOrResource, void ** ppD3D11ShaderResourceView)} */
    public static int nVRCompositor_GetMirrorTextureD3D11(int eEye, long pD3D11DeviceOrResource, long ppD3D11ShaderResourceView) {
        long __functionAddress = OpenVR.VRCompositor.GetMirrorTextureD3D11;
        if (CHECKS) {
            check(__functionAddress);
            check(pD3D11DeviceOrResource);
        }
        return callPPI(eEye, pD3D11DeviceOrResource, ppD3D11ShaderResourceView, __functionAddress);
    }

    /** {@code EVRCompositorError VRCompositor_GetMirrorTextureD3D11(EVREye eEye, void * pD3D11DeviceOrResource, void ** ppD3D11ShaderResourceView)} */
    @NativeType("EVRCompositorError")
    public static int VRCompositor_GetMirrorTextureD3D11(@NativeType("EVREye") int eEye, @NativeType("void *") long pD3D11DeviceOrResource, @NativeType("void **") PointerBuffer ppD3D11ShaderResourceView) {
        if (CHECKS) {
            check(ppD3D11ShaderResourceView, 1);
        }
        return nVRCompositor_GetMirrorTextureD3D11(eEye, pD3D11DeviceOrResource, memAddress(ppD3D11ShaderResourceView));
    }

    // --- [ VRCompositor_ReleaseMirrorTextureD3D11 ] ---

    /** {@code void VRCompositor_ReleaseMirrorTextureD3D11(void * pD3D11ShaderResourceView)} */
    public static void VRCompositor_ReleaseMirrorTextureD3D11(@NativeType("void *") long pD3D11ShaderResourceView) {
        long __functionAddress = OpenVR.VRCompositor.ReleaseMirrorTextureD3D11;
        if (CHECKS) {
            check(__functionAddress);
            check(pD3D11ShaderResourceView);
        }
        callPV(pD3D11ShaderResourceView, __functionAddress);
    }

    // --- [ VRCompositor_GetMirrorTextureGL ] ---

    /** {@code EVRCompositorError VRCompositor_GetMirrorTextureGL(EVREye eEye, glUInt_t * pglTextureId, glSharedTextureHandle_t * pglSharedTextureHandle)} */
    public static int nVRCompositor_GetMirrorTextureGL(int eEye, long pglTextureId, long pglSharedTextureHandle) {
        long __functionAddress = OpenVR.VRCompositor.GetMirrorTextureGL;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPPI(eEye, pglTextureId, pglSharedTextureHandle, __functionAddress);
    }

    /** {@code EVRCompositorError VRCompositor_GetMirrorTextureGL(EVREye eEye, glUInt_t * pglTextureId, glSharedTextureHandle_t * pglSharedTextureHandle)} */
    @NativeType("EVRCompositorError")
    public static int VRCompositor_GetMirrorTextureGL(@NativeType("EVREye") int eEye, @NativeType("glUInt_t *") IntBuffer pglTextureId, @NativeType("glSharedTextureHandle_t *") PointerBuffer pglSharedTextureHandle) {
        if (CHECKS) {
            check(pglTextureId, 1);
            check(pglSharedTextureHandle, 1);
        }
        return nVRCompositor_GetMirrorTextureGL(eEye, memAddress(pglTextureId), memAddress(pglSharedTextureHandle));
    }

    // --- [ VRCompositor_ReleaseSharedGLTexture ] ---

    /** {@code bool VRCompositor_ReleaseSharedGLTexture(glUInt_t glTextureId, glSharedTextureHandle_t glSharedTextureHandle)} */
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

    /** {@code void VRCompositor_LockGLSharedTextureForAccess(glSharedTextureHandle_t glSharedTextureHandle)} */
    public static void VRCompositor_LockGLSharedTextureForAccess(@NativeType("glSharedTextureHandle_t") long glSharedTextureHandle) {
        long __functionAddress = OpenVR.VRCompositor.LockGLSharedTextureForAccess;
        if (CHECKS) {
            check(__functionAddress);
            check(glSharedTextureHandle);
        }
        callPV(glSharedTextureHandle, __functionAddress);
    }

    // --- [ VRCompositor_UnlockGLSharedTextureForAccess ] ---

    /** {@code void VRCompositor_UnlockGLSharedTextureForAccess(glSharedTextureHandle_t glSharedTextureHandle)} */
    public static void VRCompositor_UnlockGLSharedTextureForAccess(@NativeType("glSharedTextureHandle_t") long glSharedTextureHandle) {
        long __functionAddress = OpenVR.VRCompositor.UnlockGLSharedTextureForAccess;
        if (CHECKS) {
            check(__functionAddress);
            check(glSharedTextureHandle);
        }
        callPV(glSharedTextureHandle, __functionAddress);
    }

    // --- [ VRCompositor_GetVulkanInstanceExtensionsRequired ] ---

    /** {@code uint32_t VRCompositor_GetVulkanInstanceExtensionsRequired(char * pchValue, uint32_t unBufferSize)} */
    public static int nVRCompositor_GetVulkanInstanceExtensionsRequired(long pchValue, int unBufferSize) {
        long __functionAddress = OpenVR.VRCompositor.GetVulkanInstanceExtensionsRequired;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPI(pchValue, unBufferSize, __functionAddress);
    }

    /** {@code uint32_t VRCompositor_GetVulkanInstanceExtensionsRequired(char * pchValue, uint32_t unBufferSize)} */
    @NativeType("uint32_t")
    public static int VRCompositor_GetVulkanInstanceExtensionsRequired(@NativeType("char *") @Nullable ByteBuffer pchValue) {
        return nVRCompositor_GetVulkanInstanceExtensionsRequired(memAddressSafe(pchValue), remainingSafe(pchValue));
    }

    /** {@code uint32_t VRCompositor_GetVulkanInstanceExtensionsRequired(char * pchValue, uint32_t unBufferSize)} */
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

    /** {@code uint32_t VRCompositor_GetVulkanDeviceExtensionsRequired(VkPhysicalDevice_T * pPhysicalDevice, char * pchValue, uint32_t unBufferSize)} */
    public static int nVRCompositor_GetVulkanDeviceExtensionsRequired(long pPhysicalDevice, long pchValue, int unBufferSize) {
        long __functionAddress = OpenVR.VRCompositor.GetVulkanDeviceExtensionsRequired;
        if (CHECKS) {
            check(__functionAddress);
            check(pPhysicalDevice);
        }
        return callPPI(pPhysicalDevice, pchValue, unBufferSize, __functionAddress);
    }

    /** {@code uint32_t VRCompositor_GetVulkanDeviceExtensionsRequired(VkPhysicalDevice_T * pPhysicalDevice, char * pchValue, uint32_t unBufferSize)} */
    @NativeType("uint32_t")
    public static int VRCompositor_GetVulkanDeviceExtensionsRequired(@NativeType("VkPhysicalDevice_T *") long pPhysicalDevice, @NativeType("char *") @Nullable ByteBuffer pchValue) {
        return nVRCompositor_GetVulkanDeviceExtensionsRequired(pPhysicalDevice, memAddressSafe(pchValue), remainingSafe(pchValue));
    }

    /** {@code uint32_t VRCompositor_GetVulkanDeviceExtensionsRequired(VkPhysicalDevice_T * pPhysicalDevice, char * pchValue, uint32_t unBufferSize)} */
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

    /** {@code void VRCompositor_SetExplicitTimingMode(EVRCompositorTimingMode eTimingMode)} */
    public static void VRCompositor_SetExplicitTimingMode(@NativeType("EVRCompositorTimingMode") int eTimingMode) {
        long __functionAddress = OpenVR.VRCompositor.SetExplicitTimingMode;
        if (CHECKS) {
            check(__functionAddress);
        }
        callV(eTimingMode, __functionAddress);
    }

    // --- [ VRCompositor_SubmitExplicitTimingData ] ---

    /** {@code EVRCompositorError VRCompositor_SubmitExplicitTimingData(void)} */
    @NativeType("EVRCompositorError")
    public static int VRCompositor_SubmitExplicitTimingData() {
        long __functionAddress = OpenVR.VRCompositor.SubmitExplicitTimingData;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callI(__functionAddress);
    }

    // --- [ VRCompositor_IsMotionSmoothingEnabled ] ---

    /** {@code bool VRCompositor_IsMotionSmoothingEnabled(void)} */
    @NativeType("bool")
    public static boolean VRCompositor_IsMotionSmoothingEnabled() {
        long __functionAddress = OpenVR.VRCompositor.IsMotionSmoothingEnabled;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callZ(__functionAddress);
    }

    // --- [ VRCompositor_IsMotionSmoothingSupported ] ---

    /** {@code bool VRCompositor_IsMotionSmoothingSupported(void)} */
    @NativeType("bool")
    public static boolean VRCompositor_IsMotionSmoothingSupported() {
        long __functionAddress = OpenVR.VRCompositor.IsMotionSmoothingSupported;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callZ(__functionAddress);
    }

    // --- [ VRCompositor_IsCurrentSceneFocusAppLoading ] ---

    /** {@code bool VRCompositor_IsCurrentSceneFocusAppLoading(void)} */
    @NativeType("bool")
    public static boolean VRCompositor_IsCurrentSceneFocusAppLoading() {
        long __functionAddress = OpenVR.VRCompositor.IsCurrentSceneFocusAppLoading;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callZ(__functionAddress);
    }

    // --- [ VRCompositor_SetStageOverride_Async ] ---

    /** {@code EVRCompositorError VRCompositor_SetStageOverride_Async(char const * pchRenderModelPath, HmdMatrix34_t const * pTransform, Compositor_StageRenderSettings const * pRenderSettings, uint32_t nSizeOfRenderSettings)} */
    public static int nVRCompositor_SetStageOverride_Async(long pchRenderModelPath, long pTransform, long pRenderSettings, int nSizeOfRenderSettings) {
        long __functionAddress = OpenVR.VRCompositor.SetStageOverride_Async;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPPPI(pchRenderModelPath, pTransform, pRenderSettings, nSizeOfRenderSettings, __functionAddress);
    }

    /** {@code EVRCompositorError VRCompositor_SetStageOverride_Async(char const * pchRenderModelPath, HmdMatrix34_t const * pTransform, Compositor_StageRenderSettings const * pRenderSettings, uint32_t nSizeOfRenderSettings)} */
    @NativeType("EVRCompositorError")
    public static int VRCompositor_SetStageOverride_Async(@NativeType("char const *") ByteBuffer pchRenderModelPath, @NativeType("HmdMatrix34_t const *") HmdMatrix34 pTransform, @NativeType("Compositor_StageRenderSettings const *") CompositorStageRenderSettings pRenderSettings, @NativeType("uint32_t") int nSizeOfRenderSettings) {
        if (CHECKS) {
            checkNT1(pchRenderModelPath);
        }
        return nVRCompositor_SetStageOverride_Async(memAddress(pchRenderModelPath), pTransform.address(), pRenderSettings.address(), nSizeOfRenderSettings);
    }

    /** {@code EVRCompositorError VRCompositor_SetStageOverride_Async(char const * pchRenderModelPath, HmdMatrix34_t const * pTransform, Compositor_StageRenderSettings const * pRenderSettings, uint32_t nSizeOfRenderSettings)} */
    @NativeType("EVRCompositorError")
    public static int VRCompositor_SetStageOverride_Async(@NativeType("char const *") ByteBuffer pchRenderModelPath, @NativeType("HmdMatrix34_t const *") HmdMatrix34 pTransform, @NativeType("Compositor_StageRenderSettings const *") CompositorStageRenderSettings pRenderSettings) {
        if (CHECKS) {
            checkNT1(pchRenderModelPath);
        }
        return nVRCompositor_SetStageOverride_Async(memAddress(pchRenderModelPath), pTransform.address(), pRenderSettings.address(), CompositorStageRenderSettings.SIZEOF);
    }

    /** {@code EVRCompositorError VRCompositor_SetStageOverride_Async(char const * pchRenderModelPath, HmdMatrix34_t const * pTransform, Compositor_StageRenderSettings const * pRenderSettings, uint32_t nSizeOfRenderSettings)} */
    @NativeType("EVRCompositorError")
    public static int VRCompositor_SetStageOverride_Async(@NativeType("char const *") CharSequence pchRenderModelPath, @NativeType("HmdMatrix34_t const *") HmdMatrix34 pTransform, @NativeType("Compositor_StageRenderSettings const *") CompositorStageRenderSettings pRenderSettings) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nASCII(pchRenderModelPath, true);
            long pchRenderModelPathEncoded = stack.getPointerAddress();
            return nVRCompositor_SetStageOverride_Async(pchRenderModelPathEncoded, pTransform.address(), pRenderSettings.address(), CompositorStageRenderSettings.SIZEOF);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ VRCompositor_ClearStageOverride ] ---

    /** {@code void VRCompositor_ClearStageOverride(void)} */
    public static void VRCompositor_ClearStageOverride() {
        long __functionAddress = OpenVR.VRCompositor.ClearStageOverride;
        if (CHECKS) {
            check(__functionAddress);
        }
        callV(__functionAddress);
    }

    // --- [ VRCompositor_GetCompositorBenchmarkResults ] ---

    /** {@code bool VRCompositor_GetCompositorBenchmarkResults(Compositor_BenchmarkResults * pBenchmarkResults, uint32_t nSizeOfBenchmarkResults)} */
    public static boolean nVRCompositor_GetCompositorBenchmarkResults(long pBenchmarkResults, int nSizeOfBenchmarkResults) {
        long __functionAddress = OpenVR.VRCompositor.GetCompositorBenchmarkResults;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPZ(pBenchmarkResults, nSizeOfBenchmarkResults, __functionAddress);
    }

    /** {@code bool VRCompositor_GetCompositorBenchmarkResults(Compositor_BenchmarkResults * pBenchmarkResults, uint32_t nSizeOfBenchmarkResults)} */
    @NativeType("bool")
    public static boolean VRCompositor_GetCompositorBenchmarkResults(@NativeType("Compositor_BenchmarkResults *") Compositor_BenchmarkResults.Buffer pBenchmarkResults) {
        return nVRCompositor_GetCompositorBenchmarkResults(pBenchmarkResults.address(), pBenchmarkResults.remaining());
    }

    // --- [ VRCompositor_GetLastPosePredictionIDs ] ---

    /** {@code EVRCompositorError VRCompositor_GetLastPosePredictionIDs(uint32_t * pRenderPosePredictionID, uint32_t * pGamePosePredictionID)} */
    public static int nVRCompositor_GetLastPosePredictionIDs(long pRenderPosePredictionID, long pGamePosePredictionID) {
        long __functionAddress = OpenVR.VRCompositor.GetLastPosePredictionIDs;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPPI(pRenderPosePredictionID, pGamePosePredictionID, __functionAddress);
    }

    /** {@code EVRCompositorError VRCompositor_GetLastPosePredictionIDs(uint32_t * pRenderPosePredictionID, uint32_t * pGamePosePredictionID)} */
    @NativeType("EVRCompositorError")
    public static int VRCompositor_GetLastPosePredictionIDs(@NativeType("uint32_t *") IntBuffer pRenderPosePredictionID, @NativeType("uint32_t *") IntBuffer pGamePosePredictionID) {
        if (CHECKS) {
            check(pRenderPosePredictionID, 1);
            check(pGamePosePredictionID, 1);
        }
        return nVRCompositor_GetLastPosePredictionIDs(memAddress(pRenderPosePredictionID), memAddress(pGamePosePredictionID));
    }

    // --- [ VRCompositor_GetPosesForFrame ] ---

    /** {@code EVRCompositorError VRCompositor_GetPosesForFrame(uint32_t unPosePredictionID, TrackedDevicePose_t * pPoseArray, uint32_t unPoseArrayCount)} */
    public static int nVRCompositor_GetPosesForFrame(int unPosePredictionID, long pPoseArray, int unPoseArrayCount) {
        long __functionAddress = OpenVR.VRCompositor.GetPosesForFrame;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPI(unPosePredictionID, pPoseArray, unPoseArrayCount, __functionAddress);
    }

    /** {@code EVRCompositorError VRCompositor_GetPosesForFrame(uint32_t unPosePredictionID, TrackedDevicePose_t * pPoseArray, uint32_t unPoseArrayCount)} */
    @NativeType("EVRCompositorError")
    public static int VRCompositor_GetPosesForFrame(@NativeType("uint32_t") int unPosePredictionID, @NativeType("TrackedDevicePose_t *") TrackedDevicePose.Buffer pPoseArray) {
        return nVRCompositor_GetPosesForFrame(unPosePredictionID, pPoseArray.address(), pPoseArray.remaining());
    }

    public static int VR_COMPOSITOR_ADDITIONAL_PREDICTED_FRAMES(CompositorFrameTiming timing) {
        return (timing.m_nReprojectionFlags() & VRCompositor_PredictionMask) >> 4;
    }

    public static int VR_COMPOSITOR_NUMBER_OF_THROTTLED_FRAMES(CompositorFrameTiming timing) {
        return (timing.m_nReprojectionFlags() & VRCompositor_ThrottleMask) >> 6;
    }

}