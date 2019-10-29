/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.openvr;

import javax.annotation.*;

import java.nio.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.JNI.*;
import static org.lwjgl.system.MemoryStack.*;
import static org.lwjgl.system.MemoryUtil.*;

/**
 * Main interface for display, distortion, tracking, controller, and event access.
 * 
 * <p>The {@code IVRSystem} interface provides access to display configuration information, tracking data, distortion functions, controller state, events,
 * and device properties. It is the main interface of OpenVR and can be initialized and retrieved with the {@link VR#VR_InitInternal InitInternal} function.</p>
 * 
 * <p>Many functions in {@code IVRSystem} use a tracked device index to identify a specific device attached to the computer. There will never be more than
 * {@link VR#k_unMaxTrackedDeviceCount} devices active in the system at any given time. Their indices will be 0 (for the HMD) and 1-15 for the other devices.</p>
 */
public class VRSystem {

    static { OpenVR.initialize(); }

    protected VRSystem() {
        throw new UnsupportedOperationException();
    }

    // --- [ VRSystem_GetRecommendedRenderTargetSize ] ---

    /** Unsafe version of: {@link #VRSystem_GetRecommendedRenderTargetSize GetRecommendedRenderTargetSize} */
    public static void nVRSystem_GetRecommendedRenderTargetSize(long pnWidth, long pnHeight) {
        long __functionAddress = OpenVR.VRSystem.GetRecommendedRenderTargetSize;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPPV(pnWidth, pnHeight, __functionAddress);
    }

    /**
     * Returns the suggested size for the intermediate render target that the distortion pulls from.
     *
     * @param pnWidth  recommended width for the offscreen render target
     * @param pnHeight recommended height for the offscreen render target
     */
    public static void VRSystem_GetRecommendedRenderTargetSize(@NativeType("uint32_t *") IntBuffer pnWidth, @NativeType("uint32_t *") IntBuffer pnHeight) {
        if (CHECKS) {
            check(pnWidth, 1);
            check(pnHeight, 1);
        }
        nVRSystem_GetRecommendedRenderTargetSize(memAddress(pnWidth), memAddress(pnHeight));
    }

    // --- [ VRSystem_GetProjectionMatrix ] ---

    /** Unsafe version of: {@link #VRSystem_GetProjectionMatrix GetProjectionMatrix} */
    public static native void nVRSystem_GetProjectionMatrix(int eEye, float fNearZ, float fFarZ, long __functionAddress, long __result);

    /** Unsafe version of: {@link #VRSystem_GetProjectionMatrix GetProjectionMatrix} */
    public static void nVRSystem_GetProjectionMatrix(int eEye, float fNearZ, float fFarZ, long __result) {
        long __functionAddress = OpenVR.VRSystem.GetProjectionMatrix;
        if (CHECKS) {
            check(__functionAddress);
        }
        nVRSystem_GetProjectionMatrix(eEye, fNearZ, fFarZ, __functionAddress, __result);
    }

    /**
     * Returns the projection matrix for the specified eye.
     *
     * @param eEye   determines which eye the function should return the projection for. One of:<br><table><tr><td>{@link VR#EVREye_Eye_Left}</td><td>{@link VR#EVREye_Eye_Right}</td></tr></table>
     * @param fNearZ distance to the near clip plane in meters
     * @param fFarZ  distance to the far clip plane in meters
     */
    @NativeType("HmdMatrix44_t")
    public static HmdMatrix44 VRSystem_GetProjectionMatrix(@NativeType("EVREye") int eEye, float fNearZ, float fFarZ, @NativeType("HmdMatrix44_t") HmdMatrix44 __result) {
        nVRSystem_GetProjectionMatrix(eEye, fNearZ, fFarZ, __result.address());
        return __result;
    }

    // --- [ VRSystem_GetProjectionRaw ] ---

    /** Unsafe version of: {@link #VRSystem_GetProjectionRaw GetProjectionRaw} */
    public static void nVRSystem_GetProjectionRaw(int eEye, long pfLeft, long pfRight, long pfTop, long pfBottom) {
        long __functionAddress = OpenVR.VRSystem.GetProjectionRaw;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPPPPV(eEye, pfLeft, pfRight, pfTop, pfBottom, __functionAddress);
    }

    /**
     * Returns the components necessary to build your own projection matrix in case your application is doing something fancy like infinite Z.
     *
     * @param eEye     determines which eye the function should return the projection for. One of:<br><table><tr><td>{@link VR#EVREye_Eye_Left}</td><td>{@link VR#EVREye_Eye_Right}</td></tr></table>
     * @param pfLeft   coordinate for the left clipping plane
     * @param pfRight  coordinate for the right clipping plane
     * @param pfTop    coordinate for the top clipping plane
     * @param pfBottom coordinate for the bottom clipping plane
     */
    public static void VRSystem_GetProjectionRaw(@NativeType("EVREye") int eEye, @NativeType("float *") FloatBuffer pfLeft, @NativeType("float *") FloatBuffer pfRight, @NativeType("float *") FloatBuffer pfTop, @NativeType("float *") FloatBuffer pfBottom) {
        if (CHECKS) {
            check(pfLeft, 1);
            check(pfRight, 1);
            check(pfTop, 1);
            check(pfBottom, 1);
        }
        nVRSystem_GetProjectionRaw(eEye, memAddress(pfLeft), memAddress(pfRight), memAddress(pfTop), memAddress(pfBottom));
    }

    // --- [ VRSystem_ComputeDistortion ] ---

    /** Unsafe version of: {@link #VRSystem_ComputeDistortion ComputeDistortion} */
    public static boolean nVRSystem_ComputeDistortion(int eEye, float fU, float fV, long pDistortionCoordinates) {
        long __functionAddress = OpenVR.VRSystem.ComputeDistortion;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPZ(eEye, fU, fV, pDistortionCoordinates, __functionAddress);
    }

    /**
     * Gets the result of the distortion function for the specified eye and input UVs. UVs go from 0,0 in the upper left of that eye's viewport and 1,1 in the
     * lower right of that eye's viewport.
     *
     * @param eEye                   determines which eye the function should return the distortion value for. One of:<br><table><tr><td>{@link VR#EVREye_Eye_Left}</td><td>{@link VR#EVREye_Eye_Right}</td></tr></table>
     * @param fU                     horizontal texture coordinate for the output pixel within the viewport
     * @param fV                     vertical texture coordinate for the output pixel within the viewport
     * @param pDistortionCoordinates a struct in which to return the distortion coordinates
     *
     * @return true for success. Otherwise, returns false, and distortion coordinates are not suitable.
     */
    @NativeType("bool")
    public static boolean VRSystem_ComputeDistortion(@NativeType("EVREye") int eEye, float fU, float fV, @NativeType("DistortionCoordinates_t *") DistortionCoordinates pDistortionCoordinates) {
        return nVRSystem_ComputeDistortion(eEye, fU, fV, pDistortionCoordinates.address());
    }

    // --- [ VRSystem_GetEyeToHeadTransform ] ---

    /** Unsafe version of: {@link #VRSystem_GetEyeToHeadTransform GetEyeToHeadTransform} */
    public static native void nVRSystem_GetEyeToHeadTransform(int eEye, long __functionAddress, long __result);

    /** Unsafe version of: {@link #VRSystem_GetEyeToHeadTransform GetEyeToHeadTransform} */
    public static void nVRSystem_GetEyeToHeadTransform(int eEye, long __result) {
        long __functionAddress = OpenVR.VRSystem.GetEyeToHeadTransform;
        if (CHECKS) {
            check(__functionAddress);
        }
        nVRSystem_GetEyeToHeadTransform(eEye, __functionAddress, __result);
    }

    /**
     * Returns the transform from eye space to the head space. Eye space is the per-eye flavor of head space that provides stereo disparity. Instead of
     * {@code Model * View * Projection} the sequence is {@code Model * View * Eye^-1 * Projection}. Normally {@code View} and {@code Eye^-1} will be
     * multiplied together and treated as {@code View} in your application.
     *
     * @param eEye determines which eye the function should return the eye matrix for. One of:<br><table><tr><td>{@link VR#EVREye_Eye_Left}</td><td>{@link VR#EVREye_Eye_Right}</td></tr></table>
     */
    @NativeType("HmdMatrix34_t")
    public static HmdMatrix34 VRSystem_GetEyeToHeadTransform(@NativeType("EVREye") int eEye, @NativeType("HmdMatrix34_t") HmdMatrix34 __result) {
        nVRSystem_GetEyeToHeadTransform(eEye, __result.address());
        return __result;
    }

    // --- [ VRSystem_GetTimeSinceLastVsync ] ---

    /** Unsafe version of: {@link #VRSystem_GetTimeSinceLastVsync GetTimeSinceLastVsync} */
    public static boolean nVRSystem_GetTimeSinceLastVsync(long pfSecondsSinceLastVsync, long pulFrameCounter) {
        long __functionAddress = OpenVR.VRSystem.GetTimeSinceLastVsync;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPPZ(pfSecondsSinceLastVsync, pulFrameCounter, __functionAddress);
    }

    /**
     * Returns the number of elapsed seconds since the last recorded vsync event. This will come from a vsync timer event in the timer if possible or from the
     * application-reported time if that is not available.
     *
     * @param pfSecondsSinceLastVsync fractional number of seconds since the last vsync event. This will never exceed the length of a single frame.
     * @param pulFrameCounter         the number of frames since vrserver.exe started
     *
     * @return if no vsync times are available the function will return zero for vsync time and frame counter and return false from the method
     */
    @NativeType("bool")
    public static boolean VRSystem_GetTimeSinceLastVsync(@NativeType("float *") FloatBuffer pfSecondsSinceLastVsync, @NativeType("uint64_t *") LongBuffer pulFrameCounter) {
        if (CHECKS) {
            check(pfSecondsSinceLastVsync, 1);
            check(pulFrameCounter, 1);
        }
        return nVRSystem_GetTimeSinceLastVsync(memAddress(pfSecondsSinceLastVsync), memAddress(pulFrameCounter));
    }

    // --- [ VRSystem_GetD3D9AdapterIndex ] ---

    /**
     * <h3>D3D9 Only</h3>
     * 
     * <p>Returns the adapter index that the user should pass into {@code CreateDevice} to set up D3D9 in such a way that it can go full screen exclusive on the
     * HMD.</p>
     *
     * @return -1 if there was an error
     */
    @NativeType("int32_t")
    public static int VRSystem_GetD3D9AdapterIndex() {
        long __functionAddress = OpenVR.VRSystem.GetD3D9AdapterIndex;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callI(__functionAddress);
    }

    // --- [ VRSystem_GetDXGIOutputInfo ] ---

    /** Unsafe version of: {@link #VRSystem_GetDXGIOutputInfo GetDXGIOutputInfo} */
    public static void nVRSystem_GetDXGIOutputInfo(long pnAdapterIndex) {
        long __functionAddress = OpenVR.VRSystem.GetDXGIOutputInfo;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(pnAdapterIndex, __functionAddress);
    }

    /**
     * <h3>D3D10/11 Only</h3>
     * 
     * <p>Returns the adapter index that the user should pass into {@code EnumAdapters} to create the device and swap chain in DX10 and DX11. If an error occurs
     * the index will be set to -1.</p>
     *
     * @param pnAdapterIndex the index of the adapter to use for this display
     */
    public static void VRSystem_GetDXGIOutputInfo(@NativeType("int32_t *") IntBuffer pnAdapterIndex) {
        if (CHECKS) {
            check(pnAdapterIndex, 1);
        }
        nVRSystem_GetDXGIOutputInfo(memAddress(pnAdapterIndex));
    }

    // --- [ VRSystem_GetOutputDevice ] ---

    /** Unsafe version of: {@link #VRSystem_GetOutputDevice GetOutputDevice} */
    public static void nVRSystem_GetOutputDevice(long pnDevice, int textureType, long pInstance) {
        long __functionAddress = OpenVR.VRSystem.GetOutputDevice;
        if (CHECKS) {
            check(__functionAddress);
            check(pInstance);
        }
        callPPV(pnDevice, textureType, pInstance, __functionAddress);
    }

    /**
     * Returns platform- and texture-type specific adapter identification so that applications and the compositor are creating textures and swap chains on the
     * same GPU. If an error occurs the device will be set to 0.
     * 
     * <h3>D3D10/11/12 Only (D3D9 Not Supported)</h3>
     * 
     * <p>Returns the adapter LUID that identifies the GPU attached to the HMD. The user should enumerate all adapters using {@code IDXGIFactory::EnumAdapters}
     * and {@code IDXGIAdapter::GetDesc} to find the adapter with the matching LUID, or use {@code IDXGIFactory4::EnumAdapterByLuid}. The discovered
     * {@code IDXGIAdapter} should be used to create the device and swap chain.</p>
     * 
     * <h3>Vulkan Only</h3>
     * 
     * <p>Returns the {@code VkPhysicalDevice} that should be used by the application. {@code pInstance} must be the instance the application will use to query
     * for the {@code VkPhysicalDevice}. The application must create the {@code VkInstance} with extensions returned by {@link VRCompositor#VRCompositor_GetVulkanInstanceExtensionsRequired GetVulkanInstanceExtensionsRequired}
     * enabled.</p>
     * 
     * <h3>macOS Only</h3>
     * 
     * <p>For {@link VR#ETextureType_TextureType_IOSurface} returns the {@code id<MTLDevice>} that should be used by the application.</p>
     * 
     * <p>On 10.13+ for {@link VR#ETextureType_TextureType_OpenGL} returns the {@code registryId} of the renderer which should be used by the application. See Apple
     * Technical Q&amp;A QA1168 for information on enumerating GL Renderers, and the new {@code kCGLRPRegistryIDLow} and {@code kCGLRPRegistryIDHigh}
     * {@code CGLRendererProperty} values in the 10.13 SDK.</p>
     * 
     * <p>Pre 10.13 for {@link VR#ETextureType_TextureType_OpenGL} returns 0, as there is no dependable way to correlate the HMDs {@code MTLDevice} with a GL Renderer.</p>
     *
     * @param textureType one of:<br><table><tr><td>{@link VR#ETextureType_TextureType_Invalid}</td><td>{@link VR#ETextureType_TextureType_DirectX}</td></tr><tr><td>{@link VR#ETextureType_TextureType_OpenGL}</td><td>{@link VR#ETextureType_TextureType_Vulkan}</td></tr><tr><td>{@link VR#ETextureType_TextureType_IOSurface}</td><td>{@link VR#ETextureType_TextureType_DirectX12}</td></tr><tr><td>{@link VR#ETextureType_TextureType_DXGISharedHandle}</td><td>{@link VR#ETextureType_TextureType_Metal}</td></tr></table>
     * @param pInstance   an optional parameter that is required only when {@code textureType} is {@link VR#ETextureType_TextureType_Vulkan}
     */
    public static void VRSystem_GetOutputDevice(@NativeType("uint64_t *") LongBuffer pnDevice, @NativeType("ETextureType") int textureType, @NativeType("VkInstance_T *") long pInstance) {
        if (CHECKS) {
            check(pnDevice, 1);
        }
        nVRSystem_GetOutputDevice(memAddress(pnDevice), textureType, pInstance);
    }

    // --- [ VRSystem_IsDisplayOnDesktop ] ---

    /** Use to determine if the headset display is part of the desktop (i.e. extended) or hidden (i.e. direct mode). */
    @NativeType("bool")
    public static boolean VRSystem_IsDisplayOnDesktop() {
        long __functionAddress = OpenVR.VRSystem.IsDisplayOnDesktop;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callZ(__functionAddress);
    }

    // --- [ VRSystem_SetDisplayVisibility ] ---

    /**
     * Sets the display visibility (true = extended, false = direct mode).
     *
     * @param bIsVisibleOnDesktop the display visibility
     *
     * @return true indicates that the change was successful
     */
    @NativeType("bool")
    public static boolean VRSystem_SetDisplayVisibility(@NativeType("bool") boolean bIsVisibleOnDesktop) {
        long __functionAddress = OpenVR.VRSystem.SetDisplayVisibility;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callZ(bIsVisibleOnDesktop, __functionAddress);
    }

    // --- [ VRSystem_GetDeviceToAbsoluteTrackingPose ] ---

    /** Unsafe version of: {@link #VRSystem_GetDeviceToAbsoluteTrackingPose GetDeviceToAbsoluteTrackingPose} */
    public static void nVRSystem_GetDeviceToAbsoluteTrackingPose(int eOrigin, float fPredictedSecondsToPhotonsFromNow, long pTrackedDevicePoseArray, int unTrackedDevicePoseArrayCount) {
        long __functionAddress = OpenVR.VRSystem.GetDeviceToAbsoluteTrackingPose;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(eOrigin, fPredictedSecondsToPhotonsFromNow, pTrackedDevicePoseArray, unTrackedDevicePoseArrayCount, __functionAddress);
    }

    /**
     * The pose that the tracker thinks that the HMD will be in at the specified number of seconds into the future. Pass 0 to get the state at the instant the
     * method is called. Most of the time the application should calculate the time until the photons will be emitted from the display and pass that time into
     * the method.
     * 
     * <p>This is roughly analogous to the inverse of the view matrix in most applications, though many games will need to do some additional rotation or
     * translation on top of the rotation and translation provided by the head pose.</p>
     * 
     * <p>For devices where {@code bPoseIsValid} is true the application can use the pose to position the device in question. The provided array can be any size
     * up to {@link VR#k_unMaxTrackedDeviceCount}.</p>
     * 
     * <p>Seated experiences should call this method with {@link VR#ETrackingUniverseOrigin_TrackingUniverseSeated} and receive poses relative to the seated zero pose.
     * Standing experiences should call this method with {@link VR#ETrackingUniverseOrigin_TrackingUniverseStanding} and receive poses relative to the Chaperone Play
     * Area. {@link VR#ETrackingUniverseOrigin_TrackingUniverseRawAndUncalibrated} should probably not be used unless the application is the Chaperone calibration tool
     * itself, but will provide poses relative to the hardware-specific coordinate system in the driver.</p>
     *
     * @param eOrigin                           tracking universe that returned poses should be relative to. One of:<br><table><tr><td>{@link VR#ETrackingUniverseOrigin_TrackingUniverseSeated}</td></tr><tr><td>{@link VR#ETrackingUniverseOrigin_TrackingUniverseStanding}</td></tr><tr><td>{@link VR#ETrackingUniverseOrigin_TrackingUniverseRawAndUncalibrated}</td></tr></table>
     * @param fPredictedSecondsToPhotonsFromNow number of seconds from now to predict poses for. Positive numbers are in the future. Pass 0 to get the state at the instant the function is called.
     */
    public static void VRSystem_GetDeviceToAbsoluteTrackingPose(@NativeType("ETrackingUniverseOrigin") int eOrigin, float fPredictedSecondsToPhotonsFromNow, @NativeType("TrackedDevicePose_t *") TrackedDevicePose.Buffer pTrackedDevicePoseArray) {
        nVRSystem_GetDeviceToAbsoluteTrackingPose(eOrigin, fPredictedSecondsToPhotonsFromNow, pTrackedDevicePoseArray.address(), pTrackedDevicePoseArray.remaining());
    }

    // --- [ VRSystem_ResetSeatedZeroPose ] ---

    /**
     * Sets the zero pose for the seated tracker coordinate system to the current position and yaw of the HMD. After {@code ResetSeatedZeroPose} all
     * {@link #VRSystem_GetDeviceToAbsoluteTrackingPose GetDeviceToAbsoluteTrackingPose} calls that pass {@link VR#ETrackingUniverseOrigin_TrackingUniverseSeated} as the origin will be relative to this new zero
     * pose. The new zero coordinate system will not change the fact that the Y axis is up in the real world, so the next pose returned from
     * {@code GetDeviceToAbsoluteTrackingPose} after a call to {@code ResetSeatedZeroPose} may not be exactly an identity matrix.
     * 
     * <p>NOTE: This function overrides the user's previously saved seated zero pose and should only be called as the result of a user action. Users are also
     * able to set their seated zero pose via the OpenVR Dashboard.</p>
     */
    public static void VRSystem_ResetSeatedZeroPose() {
        long __functionAddress = OpenVR.VRSystem.ResetSeatedZeroPose;
        if (CHECKS) {
            check(__functionAddress);
        }
        callV(__functionAddress);
    }

    // --- [ VRSystem_GetSeatedZeroPoseToStandingAbsoluteTrackingPose ] ---

    /** Unsafe version of: {@link #VRSystem_GetSeatedZeroPoseToStandingAbsoluteTrackingPose GetSeatedZeroPoseToStandingAbsoluteTrackingPose} */
    public static native void nVRSystem_GetSeatedZeroPoseToStandingAbsoluteTrackingPose(long __functionAddress, long __result);

    /** Unsafe version of: {@link #VRSystem_GetSeatedZeroPoseToStandingAbsoluteTrackingPose GetSeatedZeroPoseToStandingAbsoluteTrackingPose} */
    public static void nVRSystem_GetSeatedZeroPoseToStandingAbsoluteTrackingPose(long __result) {
        long __functionAddress = OpenVR.VRSystem.GetSeatedZeroPoseToStandingAbsoluteTrackingPose;
        if (CHECKS) {
            check(__functionAddress);
        }
        nVRSystem_GetSeatedZeroPoseToStandingAbsoluteTrackingPose(__functionAddress, __result);
    }

    /**
     * Returns the transform from the seated zero pose to the standing absolute tracking system. This allows  applications to represent the seated origin to
     * used or transform object positions from one coordinate system to the other.
     * 
     * <p>The seated origin may or may not be inside the Play Area or Collision Bounds returned by {@code IVRChaperone}. Its position depends on what the user
     * has set from the Dashboard settings and previous calls to {@link #VRSystem_ResetSeatedZeroPose ResetSeatedZeroPose}.</p>
     */
    @NativeType("HmdMatrix34_t")
    public static HmdMatrix34 VRSystem_GetSeatedZeroPoseToStandingAbsoluteTrackingPose(@NativeType("HmdMatrix34_t") HmdMatrix34 __result) {
        nVRSystem_GetSeatedZeroPoseToStandingAbsoluteTrackingPose(__result.address());
        return __result;
    }

    // --- [ VRSystem_GetRawZeroPoseToStandingAbsoluteTrackingPose ] ---

    /** Unsafe version of: {@link #VRSystem_GetRawZeroPoseToStandingAbsoluteTrackingPose GetRawZeroPoseToStandingAbsoluteTrackingPose} */
    public static native void nVRSystem_GetRawZeroPoseToStandingAbsoluteTrackingPose(long __functionAddress, long __result);

    /** Unsafe version of: {@link #VRSystem_GetRawZeroPoseToStandingAbsoluteTrackingPose GetRawZeroPoseToStandingAbsoluteTrackingPose} */
    public static void nVRSystem_GetRawZeroPoseToStandingAbsoluteTrackingPose(long __result) {
        long __functionAddress = OpenVR.VRSystem.GetRawZeroPoseToStandingAbsoluteTrackingPose;
        if (CHECKS) {
            check(__functionAddress);
        }
        nVRSystem_GetRawZeroPoseToStandingAbsoluteTrackingPose(__functionAddress, __result);
    }

    /**
     * Returns the transform from the tracking origin to the standing absolute tracking system. This allows applications to convert from raw tracking space to
     * the calibrated standing coordinate system.
     */
    @NativeType("HmdMatrix34_t")
    public static HmdMatrix34 VRSystem_GetRawZeroPoseToStandingAbsoluteTrackingPose(@NativeType("HmdMatrix34_t") HmdMatrix34 __result) {
        nVRSystem_GetRawZeroPoseToStandingAbsoluteTrackingPose(__result.address());
        return __result;
    }

    // --- [ VRSystem_GetSortedTrackedDeviceIndicesOfClass ] ---

    /** Unsafe version of: {@link #VRSystem_GetSortedTrackedDeviceIndicesOfClass GetSortedTrackedDeviceIndicesOfClass} */
    public static int nVRSystem_GetSortedTrackedDeviceIndicesOfClass(int eTrackedDeviceClass, long punTrackedDeviceIndexArray, int unTrackedDeviceIndexArrayCount, int unRelativeToTrackedDeviceIndex) {
        long __functionAddress = OpenVR.VRSystem.GetSortedTrackedDeviceIndicesOfClass;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPI(eTrackedDeviceClass, punTrackedDeviceIndexArray, unTrackedDeviceIndexArrayCount, unRelativeToTrackedDeviceIndex, __functionAddress);
    }

    /**
     * Get a sorted array of device indices of a given class of tracked devices (e.g. controllers).  Devices are sorted right to left relative to the
     * specified tracked device (default: hmd -- pass in -1 for absolute tracking space).
     *
     * @param eTrackedDeviceClass one of:<br><table><tr><td>{@link VR#ETrackedDeviceClass_TrackedDeviceClass_Invalid}</td></tr><tr><td>{@link VR#ETrackedDeviceClass_TrackedDeviceClass_HMD}</td></tr><tr><td>{@link VR#ETrackedDeviceClass_TrackedDeviceClass_Controller}</td></tr><tr><td>{@link VR#ETrackedDeviceClass_TrackedDeviceClass_GenericTracker}</td></tr><tr><td>{@link VR#ETrackedDeviceClass_TrackedDeviceClass_TrackingReference}</td></tr><tr><td>{@link VR#ETrackedDeviceClass_TrackedDeviceClass_DisplayRedirect}</td></tr><tr><td>{@link VR#ETrackedDeviceClass_TrackedDeviceClass_Max}</td></tr></table>
     *
     * @return the number of devices in the list, or the size of the array needed if not large enough
     */
    @NativeType("uint32_t")
    public static int VRSystem_GetSortedTrackedDeviceIndicesOfClass(@NativeType("ETrackedDeviceClass") int eTrackedDeviceClass, @Nullable @NativeType("TrackedDeviceIndex_t *") IntBuffer punTrackedDeviceIndexArray, @NativeType("TrackedDeviceIndex_t") int unRelativeToTrackedDeviceIndex) {
        return nVRSystem_GetSortedTrackedDeviceIndicesOfClass(eTrackedDeviceClass, memAddressSafe(punTrackedDeviceIndexArray), remainingSafe(punTrackedDeviceIndexArray), unRelativeToTrackedDeviceIndex);
    }

    // --- [ VRSystem_GetTrackedDeviceActivityLevel ] ---

    /** Returns the level of activity on the device. */
    @NativeType("EDeviceActivityLevel")
    public static int VRSystem_GetTrackedDeviceActivityLevel(@NativeType("TrackedDeviceIndex_t") int unDeviceId) {
        long __functionAddress = OpenVR.VRSystem.GetTrackedDeviceActivityLevel;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callI(unDeviceId, __functionAddress);
    }

    // --- [ VRSystem_ApplyTransform ] ---

    /** Unsafe version of: {@link #VRSystem_ApplyTransform ApplyTransform} */
    public static void nVRSystem_ApplyTransform(long pOutputPose, long pTrackedDevicePose, long pTransform) {
        long __functionAddress = OpenVR.VRSystem.ApplyTransform;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPPPV(pOutputPose, pTrackedDevicePose, pTransform, __functionAddress);
    }

    /**
     * Convenience utility to apply the specified transform to the specified pose. This properly transforms all pose components, including velocity and
     * angular velocity.
     */
    public static void VRSystem_ApplyTransform(@NativeType("TrackedDevicePose_t *") TrackedDevicePose pOutputPose, @NativeType("TrackedDevicePose_t const *") TrackedDevicePose pTrackedDevicePose, @NativeType("HmdMatrix34_t const *") HmdMatrix34 pTransform) {
        nVRSystem_ApplyTransform(pOutputPose.address(), pTrackedDevicePose.address(), pTransform.address());
    }

    // --- [ VRSystem_GetTrackedDeviceIndexForControllerRole ] ---

    /**
     * Returns the device index associated with a specific role, for example the left hand or the right hand.
     * 
     * <p>This function is deprecated in favor of the new {@code IVRInput} system.</p>
     *
     * @param unDeviceType one of:<br><table><tr><td>{@link VR#ETrackedControllerRole_TrackedControllerRole_Invalid}</td></tr><tr><td>{@link VR#ETrackedControllerRole_TrackedControllerRole_LeftHand}</td></tr><tr><td>{@link VR#ETrackedControllerRole_TrackedControllerRole_RightHand}</td></tr><tr><td>{@link VR#ETrackedControllerRole_TrackedControllerRole_OptOut}</td></tr><tr><td>{@link VR#ETrackedControllerRole_TrackedControllerRole_Treadmill}</td></tr><tr><td>{@link VR#ETrackedControllerRole_TrackedControllerRole_Max}</td></tr></table>
     */
    @NativeType("TrackedDeviceIndex_t")
    public static int VRSystem_GetTrackedDeviceIndexForControllerRole(@NativeType("ETrackedControllerRole") int unDeviceType) {
        long __functionAddress = OpenVR.VRSystem.GetTrackedDeviceIndexForControllerRole;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callI(unDeviceType, __functionAddress);
    }

    // --- [ VRSystem_GetControllerRoleForTrackedDeviceIndex ] ---

    /**
     * Returns the controller type associated with a device index.
     * 
     * <p>This function is deprecated in favor of the new {@code IVRInput} system.</p>
     */
    @NativeType("ETrackedControllerRole")
    public static int VRSystem_GetControllerRoleForTrackedDeviceIndex(@NativeType("TrackedDeviceIndex_t") int unDeviceIndex) {
        long __functionAddress = OpenVR.VRSystem.GetControllerRoleForTrackedDeviceIndex;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callI(unDeviceIndex, __functionAddress);
    }

    // --- [ VRSystem_GetTrackedDeviceClass ] ---

    /**
     * Returns the device class of a tracked device. If there has not been a device connected in this slot since the application started this function will
     * return {@link VR#ETrackedDeviceClass_TrackedDeviceClass_Invalid}. For previous detected devices the function will return the previously observed device class.
     * 
     * <p>To determine which devices exist on the system, just loop from 0 to {@link VR#k_unMaxTrackedDeviceCount} and check the device class. Every device with something
     * other than {@link VR#ETrackedDeviceClass_TrackedDeviceClass_Invalid} is associated with an actual tracked device.</p>
     *
     * @param unDeviceIndex index of the device to get the device class for.
     */
    @NativeType("ETrackedDeviceClass")
    public static int VRSystem_GetTrackedDeviceClass(@NativeType("TrackedDeviceIndex_t") int unDeviceIndex) {
        long __functionAddress = OpenVR.VRSystem.GetTrackedDeviceClass;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callI(unDeviceIndex, __functionAddress);
    }

    // --- [ VRSystem_IsTrackedDeviceConnected ] ---

    /**
     * Returns true if there is a device connected in this slot.
     *
     * @param unDeviceIndex index of the device to test connected state for
     */
    @NativeType("bool")
    public static boolean VRSystem_IsTrackedDeviceConnected(@NativeType("TrackedDeviceIndex_t") int unDeviceIndex) {
        long __functionAddress = OpenVR.VRSystem.IsTrackedDeviceConnected;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callZ(unDeviceIndex, __functionAddress);
    }

    // --- [ VRSystem_GetBoolTrackedDeviceProperty ] ---

    /** Unsafe version of: {@link #VRSystem_GetBoolTrackedDeviceProperty GetBoolTrackedDeviceProperty} */
    public static boolean nVRSystem_GetBoolTrackedDeviceProperty(int unDeviceIndex, int prop, long pError) {
        long __functionAddress = OpenVR.VRSystem.GetBoolTrackedDeviceProperty;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPZ(unDeviceIndex, prop, pError, __functionAddress);
    }

    /**
     * Returns a bool property. If the device index is not valid or the property is not a bool type this function will return false.
     *
     * @param unDeviceIndex index of the device to get the property for
     * @param prop          which property to get
     * @param pError        the error returned when attempting to fetch this property. This can be {@code NULL} if the caller doesn't care about the source of a property error.
     */
    @NativeType("bool")
    public static boolean VRSystem_GetBoolTrackedDeviceProperty(@NativeType("TrackedDeviceIndex_t") int unDeviceIndex, @NativeType("ETrackedDeviceProperty") int prop, @Nullable @NativeType("ETrackedPropertyError *") IntBuffer pError) {
        if (CHECKS) {
            checkSafe(pError, 1);
        }
        return nVRSystem_GetBoolTrackedDeviceProperty(unDeviceIndex, prop, memAddressSafe(pError));
    }

    // --- [ VRSystem_GetFloatTrackedDeviceProperty ] ---

    /** Unsafe version of: {@link #VRSystem_GetFloatTrackedDeviceProperty GetFloatTrackedDeviceProperty} */
    public static float nVRSystem_GetFloatTrackedDeviceProperty(int unDeviceIndex, int prop, long pError) {
        long __functionAddress = OpenVR.VRSystem.GetFloatTrackedDeviceProperty;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPF(unDeviceIndex, prop, pError, __functionAddress);
    }

    /**
     * Returns a float property. If the device index is not valid or the property is not a float type this function will return 0.
     *
     * @param unDeviceIndex index of the device to get the property for
     * @param prop          which property to get
     * @param pError        the error returned when attempting to fetch this property. This can be {@code NULL} if the caller doesn't care about the source of a property error.
     */
    public static float VRSystem_GetFloatTrackedDeviceProperty(@NativeType("TrackedDeviceIndex_t") int unDeviceIndex, @NativeType("ETrackedDeviceProperty") int prop, @Nullable @NativeType("ETrackedPropertyError *") IntBuffer pError) {
        if (CHECKS) {
            checkSafe(pError, 1);
        }
        return nVRSystem_GetFloatTrackedDeviceProperty(unDeviceIndex, prop, memAddressSafe(pError));
    }

    // --- [ VRSystem_GetInt32TrackedDeviceProperty ] ---

    /** Unsafe version of: {@link #VRSystem_GetInt32TrackedDeviceProperty GetInt32TrackedDeviceProperty} */
    public static int nVRSystem_GetInt32TrackedDeviceProperty(int unDeviceIndex, int prop, long pError) {
        long __functionAddress = OpenVR.VRSystem.GetInt32TrackedDeviceProperty;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPI(unDeviceIndex, prop, pError, __functionAddress);
    }

    /**
     * Returns an int property. If the device index is not valid or the property is not a int type this function will return 0.
     *
     * @param unDeviceIndex index of the device to get the property for
     * @param prop          which property to get
     * @param pError        the error returned when attempting to fetch this property. This can be {@code NULL} if the caller doesn't care about the source of a property error.
     */
    @NativeType("int32_t")
    public static int VRSystem_GetInt32TrackedDeviceProperty(@NativeType("TrackedDeviceIndex_t") int unDeviceIndex, @NativeType("ETrackedDeviceProperty") int prop, @Nullable @NativeType("ETrackedPropertyError *") IntBuffer pError) {
        if (CHECKS) {
            checkSafe(pError, 1);
        }
        return nVRSystem_GetInt32TrackedDeviceProperty(unDeviceIndex, prop, memAddressSafe(pError));
    }

    // --- [ VRSystem_GetUint64TrackedDeviceProperty ] ---

    /** Unsafe version of: {@link #VRSystem_GetUint64TrackedDeviceProperty GetUint64TrackedDeviceProperty} */
    public static long nVRSystem_GetUint64TrackedDeviceProperty(int unDeviceIndex, int prop, long pError) {
        long __functionAddress = OpenVR.VRSystem.GetUint64TrackedDeviceProperty;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPJ(unDeviceIndex, prop, pError, __functionAddress);
    }

    /**
     * Returns a uint64 property. If the device index is not valid or the property is not a uint64 type this function will return 0.
     *
     * @param unDeviceIndex index of the device to get the property for
     * @param prop          which property to get
     * @param pError        the error returned when attempting to fetch this property. This can be {@code NULL} if the caller doesn't care about the source of a property error.
     */
    @NativeType("uint64_t")
    public static long VRSystem_GetUint64TrackedDeviceProperty(@NativeType("TrackedDeviceIndex_t") int unDeviceIndex, @NativeType("ETrackedDeviceProperty") int prop, @Nullable @NativeType("ETrackedPropertyError *") IntBuffer pError) {
        if (CHECKS) {
            checkSafe(pError, 1);
        }
        return nVRSystem_GetUint64TrackedDeviceProperty(unDeviceIndex, prop, memAddressSafe(pError));
    }

    // --- [ VRSystem_GetMatrix34TrackedDeviceProperty ] ---

    /** Unsafe version of: {@link #VRSystem_GetMatrix34TrackedDeviceProperty GetMatrix34TrackedDeviceProperty} */
    public static native void nVRSystem_GetMatrix34TrackedDeviceProperty(int unDeviceIndex, int prop, long pError, long __functionAddress, long __result);

    /** Unsafe version of: {@link #VRSystem_GetMatrix34TrackedDeviceProperty GetMatrix34TrackedDeviceProperty} */
    public static void nVRSystem_GetMatrix34TrackedDeviceProperty(int unDeviceIndex, int prop, long pError, long __result) {
        long __functionAddress = OpenVR.VRSystem.GetMatrix34TrackedDeviceProperty;
        if (CHECKS) {
            check(__functionAddress);
        }
        nVRSystem_GetMatrix34TrackedDeviceProperty(unDeviceIndex, prop, pError, __functionAddress, __result);
    }

    /**
     * Returns a matrix property. If the device index is not valid or the property is not a matrix type, this function will return identity.
     *
     * @param unDeviceIndex index of the device to get the property for
     * @param prop          which property to get
     * @param pError        the error returned when attempting to fetch this property. This can be {@code NULL} if the caller doesn't care about the source of a property error.
     */
    @NativeType("HmdMatrix34_t")
    public static HmdMatrix34 VRSystem_GetMatrix34TrackedDeviceProperty(@NativeType("TrackedDeviceIndex_t") int unDeviceIndex, @NativeType("ETrackedDeviceProperty") int prop, @Nullable @NativeType("ETrackedPropertyError *") IntBuffer pError, @NativeType("HmdMatrix34_t") HmdMatrix34 __result) {
        if (CHECKS) {
            checkSafe(pError, 1);
        }
        nVRSystem_GetMatrix34TrackedDeviceProperty(unDeviceIndex, prop, memAddressSafe(pError), __result.address());
        return __result;
    }

    // --- [ VRSystem_GetArrayTrackedDeviceProperty ] ---

    /** Unsafe version of: {@link #VRSystem_GetArrayTrackedDeviceProperty GetArrayTrackedDeviceProperty} */
    public static int nVRSystem_GetArrayTrackedDeviceProperty(int unDeviceIndex, int prop, int propType, long pBuffer, int unBufferSize, long pError) {
        long __functionAddress = OpenVR.VRSystem.GetArrayTrackedDeviceProperty;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPPI(unDeviceIndex, prop, propType, pBuffer, unBufferSize, pError, __functionAddress);
    }

    /**
     * Returns an array of one type of property.
     * 
     * <p>If the device index is not valid or the property is not a single value or an array of the specified type, this function will return 0. Otherwise it
     * returns the number of bytes necessary to hold the array of properties. If {@code unBufferSize} is greater than the returned size and {@code pBuffer} is
     * non-{@code NULL}, {@code pBuffer} is filled with the contents of array of properties.</p>
     *
     * @param unDeviceIndex index of the device to get the property for
     * @param prop          which property to get
     * @param pError        the error returned when attempting to fetch this property. This can be {@code NULL} if the caller doesn't care about the source of a property error.
     */
    @NativeType("uint32_t")
    public static int VRSystem_GetArrayTrackedDeviceProperty(@NativeType("TrackedDeviceIndex_t") int unDeviceIndex, @NativeType("ETrackedDeviceProperty") int prop, @NativeType("PropertyTypeTag_t") int propType, @Nullable @NativeType("void *") ByteBuffer pBuffer, @Nullable @NativeType("ETrackedPropertyError *") IntBuffer pError) {
        if (CHECKS) {
            checkSafe(pError, 1);
        }
        return nVRSystem_GetArrayTrackedDeviceProperty(unDeviceIndex, prop, propType, memAddressSafe(pBuffer), remainingSafe(pBuffer), memAddressSafe(pError));
    }

    // --- [ VRSystem_GetStringTrackedDeviceProperty ] ---

    /**
     * Unsafe version of: {@link #VRSystem_GetStringTrackedDeviceProperty GetStringTrackedDeviceProperty}
     *
     * @param unBufferSize the size of the buffer pointed to by {@code pchValue}
     */
    public static int nVRSystem_GetStringTrackedDeviceProperty(int unDeviceIndex, int prop, long pchValue, int unBufferSize, long pError) {
        long __functionAddress = OpenVR.VRSystem.GetStringTrackedDeviceProperty;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPPI(unDeviceIndex, prop, pchValue, unBufferSize, pError, __functionAddress);
    }

    /**
     * Returns a string property. If the device index is not valid or the property is not a string type this function will return 0. Otherwise it returns the
     * length of the number of bytes necessary to hold this string including the trailing null. Strings will always fit in buffers of
     * {@link VR#k_unMaxPropertyStringSize} characters.
     *
     * @param unDeviceIndex index of the device to get the property for
     * @param prop          which property to get
     * @param pchValue      the buffer to store string properties in. {@code unBufferSize} should be the size of this buffer.
     * @param pError        the error returned when attempting to fetch this property. This can be {@code NULL} if the caller doesn't care about the source of a property error.
     */
    @NativeType("uint32_t")
    public static int VRSystem_GetStringTrackedDeviceProperty(@NativeType("TrackedDeviceIndex_t") int unDeviceIndex, @NativeType("ETrackedDeviceProperty") int prop, @Nullable @NativeType("char *") ByteBuffer pchValue, @Nullable @NativeType("ETrackedPropertyError *") IntBuffer pError) {
        if (CHECKS) {
            checkSafe(pError, 1);
        }
        return nVRSystem_GetStringTrackedDeviceProperty(unDeviceIndex, prop, memAddressSafe(pchValue), remainingSafe(pchValue), memAddressSafe(pError));
    }

    /**
     * Returns a string property. If the device index is not valid or the property is not a string type this function will return 0. Otherwise it returns the
     * length of the number of bytes necessary to hold this string including the trailing null. Strings will always fit in buffers of
     * {@link VR#k_unMaxPropertyStringSize} characters.
     *
     * @param unDeviceIndex index of the device to get the property for
     * @param prop          which property to get
     * @param unBufferSize  the size of the buffer pointed to by {@code pchValue}
     * @param pError        the error returned when attempting to fetch this property. This can be {@code NULL} if the caller doesn't care about the source of a property error.
     */
    @NativeType("uint32_t")
    public static String VRSystem_GetStringTrackedDeviceProperty(@NativeType("TrackedDeviceIndex_t") int unDeviceIndex, @NativeType("ETrackedDeviceProperty") int prop, @NativeType("uint32_t") int unBufferSize, @Nullable @NativeType("ETrackedPropertyError *") IntBuffer pError) {
        if (CHECKS) {
            checkSafe(pError, 1);
        }
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            ByteBuffer pchValue = stack.malloc(unBufferSize);
            int __result = nVRSystem_GetStringTrackedDeviceProperty(unDeviceIndex, prop, memAddress(pchValue), unBufferSize, memAddressSafe(pError));
            return memASCII(pchValue, __result - 1);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    /**
     * Returns a string property. If the device index is not valid or the property is not a string type this function will return 0. Otherwise it returns the
     * length of the number of bytes necessary to hold this string including the trailing null. Strings will always fit in buffers of
     * {@link VR#k_unMaxPropertyStringSize} characters.
     *
     * @param unDeviceIndex index of the device to get the property for
     * @param prop          which property to get
     * @param pError        the error returned when attempting to fetch this property. This can be {@code NULL} if the caller doesn't care about the source of a property error.
     */
    @NativeType("uint32_t")
    public static String VRSystem_GetStringTrackedDeviceProperty(@NativeType("TrackedDeviceIndex_t") int unDeviceIndex, @NativeType("ETrackedDeviceProperty") int prop, @Nullable @NativeType("ETrackedPropertyError *") IntBuffer pError) {
        return VRSystem_GetStringTrackedDeviceProperty(unDeviceIndex, prop, VR.k_unMaxPropertyStringSize, pError);
    }

    // --- [ VRSystem_GetPropErrorNameFromEnum ] ---

    /** Unsafe version of: {@link #VRSystem_GetPropErrorNameFromEnum GetPropErrorNameFromEnum} */
    public static long nVRSystem_GetPropErrorNameFromEnum(int error) {
        long __functionAddress = OpenVR.VRSystem.GetPropErrorNameFromEnum;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callP(error, __functionAddress);
    }

    /**
     * Returns a string that corresponds with the specified property error. The string will be the name of the error enum value for all valid error codes.
     *
     * @param error the error code to return a string for. One of:<br><table><tr><td>{@link VR#ETrackedPropertyError_TrackedProp_Success}</td></tr><tr><td>{@link VR#ETrackedPropertyError_TrackedProp_WrongDataType}</td></tr><tr><td>{@link VR#ETrackedPropertyError_TrackedProp_WrongDeviceClass}</td></tr><tr><td>{@link VR#ETrackedPropertyError_TrackedProp_BufferTooSmall}</td></tr><tr><td>{@link VR#ETrackedPropertyError_TrackedProp_UnknownProperty}</td></tr><tr><td>{@link VR#ETrackedPropertyError_TrackedProp_InvalidDevice}</td></tr><tr><td>{@link VR#ETrackedPropertyError_TrackedProp_CouldNotContactServer}</td></tr><tr><td>{@link VR#ETrackedPropertyError_TrackedProp_ValueNotProvidedByDevice}</td></tr><tr><td>{@link VR#ETrackedPropertyError_TrackedProp_StringExceedsMaximumLength}</td></tr><tr><td>{@link VR#ETrackedPropertyError_TrackedProp_NotYetAvailable}</td></tr><tr><td>{@link VR#ETrackedPropertyError_TrackedProp_PermissionDenied}</td></tr><tr><td>{@link VR#ETrackedPropertyError_TrackedProp_InvalidOperation}</td></tr><tr><td>{@link VR#ETrackedPropertyError_TrackedProp_CannotWriteToWildcards}</td></tr><tr><td>{@link VR#ETrackedPropertyError_TrackedProp_IPCReadFailure}</td></tr></table>
     */
    @Nullable
    @NativeType("char *")
    public static String VRSystem_GetPropErrorNameFromEnum(@NativeType("ETrackedPropertyError") int error) {
        long __result = nVRSystem_GetPropErrorNameFromEnum(error);
        return memASCIISafe(__result);
    }

    // --- [ VRSystem_PollNextEvent ] ---

    /** Unsafe version of: {@link #VRSystem_PollNextEvent PollNextEvent} */
    public static boolean nVRSystem_PollNextEvent(long pEvent, int uncbVREvent) {
        long __functionAddress = OpenVR.VRSystem.PollNextEvent;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPZ(pEvent, uncbVREvent, __functionAddress);
    }

    /**
     * Returns true and fills the event with the next event on the queue if there is one. If there are no events this method returns false.
     *
     * @param pEvent      an event structure to fill with the next event
     * @param uncbVREvent the size in bytes of the {@link VREvent} struct
     */
    @NativeType("bool")
    public static boolean VRSystem_PollNextEvent(@NativeType("VREvent_t *") VREvent pEvent, @NativeType("uint32_t") int uncbVREvent) {
        return nVRSystem_PollNextEvent(pEvent.address(), uncbVREvent);
    }

    /**
     * Returns true and fills the event with the next event on the queue if there is one. If there are no events this method returns false.
     *
     * @param pEvent an event structure to fill with the next event
     */
    @NativeType("bool")
    public static boolean VRSystem_PollNextEvent(@NativeType("VREvent_t *") VREvent pEvent) {
        return nVRSystem_PollNextEvent(pEvent.address(), VREvent.SIZEOF);
    }

    // --- [ VRSystem_PollNextEventWithPose ] ---

    /** Unsafe version of: {@link #VRSystem_PollNextEventWithPose PollNextEventWithPose} */
    public static boolean nVRSystem_PollNextEventWithPose(int eOrigin, long pEvent, int uncbVREvent, long pTrackedDevicePose) {
        long __functionAddress = OpenVR.VRSystem.PollNextEventWithPose;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPPZ(eOrigin, pEvent, uncbVREvent, pTrackedDevicePose, __functionAddress);
    }

    /**
     * Returns true and fills the event with the next event on the queue if there is one. If there are no events this method returns false. Fills in the pose
     * of the associated tracked device in the provided pose struct. This pose will always be older than the call to this function and should not be used to
     * render the device.
     *
     * @param eOrigin            the tracking system to return the event's pose in. One of:<br><table><tr><td>{@link VR#ETrackingUniverseOrigin_TrackingUniverseSeated}</td></tr><tr><td>{@link VR#ETrackingUniverseOrigin_TrackingUniverseStanding}</td></tr><tr><td>{@link VR#ETrackingUniverseOrigin_TrackingUniverseRawAndUncalibrated}</td></tr></table>
     * @param pEvent             an event structure to fill with the next event
     * @param uncbVREvent        the size in bytes of the {@link VREvent} struct
     * @param pTrackedDevicePose a pose struct to fill with the returned event's pose. Must not be {@code NULL}.
     */
    @NativeType("bool")
    public static boolean VRSystem_PollNextEventWithPose(@NativeType("ETrackingUniverseOrigin") int eOrigin, @NativeType("VREvent_t *") VREvent pEvent, @NativeType("uint32_t") int uncbVREvent, @NativeType("TrackedDevicePose_t *") TrackedDevicePose pTrackedDevicePose) {
        return nVRSystem_PollNextEventWithPose(eOrigin, pEvent.address(), uncbVREvent, pTrackedDevicePose.address());
    }

    /**
     * Returns true and fills the event with the next event on the queue if there is one. If there are no events this method returns false. Fills in the pose
     * of the associated tracked device in the provided pose struct. This pose will always be older than the call to this function and should not be used to
     * render the device.
     *
     * @param eOrigin            the tracking system to return the event's pose in. One of:<br><table><tr><td>{@link VR#ETrackingUniverseOrigin_TrackingUniverseSeated}</td></tr><tr><td>{@link VR#ETrackingUniverseOrigin_TrackingUniverseStanding}</td></tr><tr><td>{@link VR#ETrackingUniverseOrigin_TrackingUniverseRawAndUncalibrated}</td></tr></table>
     * @param pEvent             an event structure to fill with the next event
     * @param pTrackedDevicePose a pose struct to fill with the returned event's pose. Must not be {@code NULL}.
     */
    @NativeType("bool")
    public static boolean VRSystem_PollNextEventWithPose(@NativeType("ETrackingUniverseOrigin") int eOrigin, @NativeType("VREvent_t *") VREvent pEvent, @NativeType("TrackedDevicePose_t *") TrackedDevicePose pTrackedDevicePose) {
        return nVRSystem_PollNextEventWithPose(eOrigin, pEvent.address(), VREvent.SIZEOF, pTrackedDevicePose.address());
    }

    // --- [ VRSystem_GetEventTypeNameFromEnum ] ---

    /** Unsafe version of: {@link #VRSystem_GetEventTypeNameFromEnum GetEventTypeNameFromEnum} */
    public static long nVRSystem_GetEventTypeNameFromEnum(int eType) {
        long __functionAddress = OpenVR.VRSystem.GetEventTypeNameFromEnum;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callP(eType, __functionAddress);
    }

    /**
     * Returns the name of an {@code EVREvent} enum value.
     *
     * @param eType the event type to return a string for. One of:<br><table><tr><td>{@link VR#EVREventType_VREvent_None}</td></tr><tr><td>{@link VR#EVREventType_VREvent_TrackedDeviceActivated}</td></tr><tr><td>{@link VR#EVREventType_VREvent_TrackedDeviceDeactivated}</td></tr><tr><td>{@link VR#EVREventType_VREvent_TrackedDeviceUpdated}</td></tr><tr><td>{@link VR#EVREventType_VREvent_TrackedDeviceUserInteractionStarted}</td></tr><tr><td>{@link VR#EVREventType_VREvent_TrackedDeviceUserInteractionEnded}</td></tr><tr><td>{@link VR#EVREventType_VREvent_IpdChanged}</td></tr><tr><td>{@link VR#EVREventType_VREvent_EnterStandbyMode}</td></tr><tr><td>{@link VR#EVREventType_VREvent_LeaveStandbyMode}</td></tr><tr><td>{@link VR#EVREventType_VREvent_TrackedDeviceRoleChanged}</td></tr><tr><td>{@link VR#EVREventType_VREvent_WatchdogWakeUpRequested}</td></tr><tr><td>{@link VR#EVREventType_VREvent_LensDistortionChanged}</td></tr><tr><td>{@link VR#EVREventType_VREvent_PropertyChanged}</td></tr><tr><td>{@link VR#EVREventType_VREvent_WirelessDisconnect}</td></tr><tr><td>{@link VR#EVREventType_VREvent_WirelessReconnect}</td></tr><tr><td>{@link VR#EVREventType_VREvent_ButtonPress}</td></tr><tr><td>{@link VR#EVREventType_VREvent_ButtonUnpress}</td></tr><tr><td>{@link VR#EVREventType_VREvent_ButtonTouch}</td></tr><tr><td>{@link VR#EVREventType_VREvent_ButtonUntouch}</td></tr><tr><td>{@link VR#EVREventType_VREvent_DualAnalog_Press}</td></tr><tr><td>{@link VR#EVREventType_VREvent_DualAnalog_Unpress}</td></tr><tr><td>{@link VR#EVREventType_VREvent_DualAnalog_Touch}</td></tr><tr><td>{@link VR#EVREventType_VREvent_DualAnalog_Untouch}</td></tr><tr><td>{@link VR#EVREventType_VREvent_DualAnalog_Move}</td></tr><tr><td>{@link VR#EVREventType_VREvent_DualAnalog_ModeSwitch1}</td></tr><tr><td>{@link VR#EVREventType_VREvent_DualAnalog_ModeSwitch2}</td></tr><tr><td>{@link VR#EVREventType_VREvent_DualAnalog_Cancel}</td></tr><tr><td>{@link VR#EVREventType_VREvent_MouseMove}</td></tr><tr><td>{@link VR#EVREventType_VREvent_MouseButtonDown}</td></tr><tr><td>{@link VR#EVREventType_VREvent_MouseButtonUp}</td></tr><tr><td>{@link VR#EVREventType_VREvent_FocusEnter}</td></tr><tr><td>{@link VR#EVREventType_VREvent_FocusLeave}</td></tr><tr><td>{@link VR#EVREventType_VREvent_ScrollDiscrete}</td></tr><tr><td>{@link VR#EVREventType_VREvent_TouchPadMove}</td></tr><tr><td>{@link VR#EVREventType_VREvent_OverlayFocusChanged}</td></tr><tr><td>{@link VR#EVREventType_VREvent_ReloadOverlays}</td></tr><tr><td>{@link VR#EVREventType_VREvent_ScrollSmooth}</td></tr><tr><td>{@link VR#EVREventType_VREvent_InputFocusCaptured}</td></tr><tr><td>{@link VR#EVREventType_VREvent_InputFocusReleased}</td></tr><tr><td>{@link VR#EVREventType_VREvent_SceneFocusLost}</td></tr><tr><td>{@link VR#EVREventType_VREvent_SceneFocusGained}</td></tr><tr><td>{@link VR#EVREventType_VREvent_SceneApplicationChanged}</td></tr><tr><td>{@link VR#EVREventType_VREvent_SceneFocusChanged}</td></tr><tr><td>{@link VR#EVREventType_VREvent_InputFocusChanged}</td></tr><tr><td>{@link VR#EVREventType_VREvent_SceneApplicationSecondaryRenderingStarted}</td></tr><tr><td>{@link VR#EVREventType_VREvent_SceneApplicationUsingWrongGraphicsAdapter}</td></tr><tr><td>{@link VR#EVREventType_VREvent_ActionBindingReloaded}</td></tr><tr><td>{@link VR#EVREventType_VREvent_HideRenderModels}</td></tr><tr><td>{@link VR#EVREventType_VREvent_ShowRenderModels}</td></tr><tr><td>{@link VR#EVREventType_VREvent_ConsoleOpened}</td></tr><tr><td>{@link VR#EVREventType_VREvent_ConsoleClosed}</td></tr><tr><td>{@link VR#EVREventType_VREvent_OverlayShown}</td></tr><tr><td>{@link VR#EVREventType_VREvent_OverlayHidden}</td></tr><tr><td>{@link VR#EVREventType_VREvent_DashboardActivated}</td></tr><tr><td>{@link VR#EVREventType_VREvent_DashboardDeactivated}</td></tr><tr><td>{@link VR#EVREventType_VREvent_DashboardRequested}</td></tr><tr><td>{@link VR#EVREventType_VREvent_ResetDashboard}</td></tr><tr><td>{@link VR#EVREventType_VREvent_RenderToast}</td></tr><tr><td>{@link VR#EVREventType_VREvent_ImageLoaded}</td></tr><tr><td>{@link VR#EVREventType_VREvent_ShowKeyboard}</td></tr><tr><td>{@link VR#EVREventType_VREvent_HideKeyboard}</td></tr><tr><td>{@link VR#EVREventType_VREvent_OverlayGamepadFocusGained}</td></tr><tr><td>{@link VR#EVREventType_VREvent_OverlayGamepadFocusLost}</td></tr><tr><td>{@link VR#EVREventType_VREvent_OverlaySharedTextureChanged}</td></tr><tr><td>{@link VR#EVREventType_VREvent_ScreenshotTriggered}</td></tr><tr><td>{@link VR#EVREventType_VREvent_ImageFailed}</td></tr><tr><td>{@link VR#EVREventType_VREvent_DashboardOverlayCreated}</td></tr><tr><td>{@link VR#EVREventType_VREvent_SwitchGamepadFocus}</td></tr><tr><td>{@link VR#EVREventType_VREvent_RequestScreenshot}</td></tr><tr><td>{@link VR#EVREventType_VREvent_ScreenshotTaken}</td></tr><tr><td>{@link VR#EVREventType_VREvent_ScreenshotFailed}</td></tr><tr><td>{@link VR#EVREventType_VREvent_SubmitScreenshotToDashboard}</td></tr><tr><td>{@link VR#EVREventType_VREvent_ScreenshotProgressToDashboard}</td></tr><tr><td>{@link VR#EVREventType_VREvent_PrimaryDashboardDeviceChanged}</td></tr><tr><td>{@link VR#EVREventType_VREvent_RoomViewShown}</td></tr><tr><td>{@link VR#EVREventType_VREvent_RoomViewHidden}</td></tr><tr><td>{@link VR#EVREventType_VREvent_ShowUI}</td></tr><tr><td>{@link VR#EVREventType_VREvent_ShowDevTools}</td></tr><tr><td>{@link VR#EVREventType_VREvent_Notification_Shown}</td></tr><tr><td>{@link VR#EVREventType_VREvent_Notification_Hidden}</td></tr><tr><td>{@link VR#EVREventType_VREvent_Notification_BeginInteraction}</td></tr><tr><td>{@link VR#EVREventType_VREvent_Notification_Destroyed}</td></tr><tr><td>{@link VR#EVREventType_VREvent_Quit}</td></tr><tr><td>{@link VR#EVREventType_VREvent_ProcessQuit}</td></tr><tr><td>{@link VR#EVREventType_VREvent_QuitAborted_UserPrompt}</td></tr><tr><td>{@link VR#EVREventType_VREvent_QuitAcknowledged}</td></tr><tr><td>{@link VR#EVREventType_VREvent_DriverRequestedQuit}</td></tr><tr><td>{@link VR#EVREventType_VREvent_RestartRequested}</td></tr><tr><td>{@link VR#EVREventType_VREvent_ChaperoneDataHasChanged}</td></tr><tr><td>{@link VR#EVREventType_VREvent_ChaperoneUniverseHasChanged}</td></tr><tr><td>{@link VR#EVREventType_VREvent_ChaperoneTempDataHasChanged}</td></tr><tr><td>{@link VR#EVREventType_VREvent_ChaperoneSettingsHaveChanged}</td></tr><tr><td>{@link VR#EVREventType_VREvent_SeatedZeroPoseReset}</td></tr><tr><td>{@link VR#EVREventType_VREvent_ChaperoneFlushCache}</td></tr><tr><td>{@link VR#EVREventType_VREvent_ChaperoneRoomSetupStarting}</td></tr><tr><td>{@link VR#EVREventType_VREvent_ChaperoneRoomSetupFinished}</td></tr><tr><td>{@link VR#EVREventType_VREvent_AudioSettingsHaveChanged}</td></tr><tr><td>{@link VR#EVREventType_VREvent_BackgroundSettingHasChanged}</td></tr><tr><td>{@link VR#EVREventType_VREvent_CameraSettingsHaveChanged}</td></tr><tr><td>{@link VR#EVREventType_VREvent_ReprojectionSettingHasChanged}</td></tr><tr><td>{@link VR#EVREventType_VREvent_ModelSkinSettingsHaveChanged}</td></tr><tr><td>{@link VR#EVREventType_VREvent_EnvironmentSettingsHaveChanged}</td></tr><tr><td>{@link VR#EVREventType_VREvent_PowerSettingsHaveChanged}</td></tr><tr><td>{@link VR#EVREventType_VREvent_EnableHomeAppSettingsHaveChanged}</td></tr><tr><td>{@link VR#EVREventType_VREvent_SteamVRSectionSettingChanged}</td></tr><tr><td>{@link VR#EVREventType_VREvent_LighthouseSectionSettingChanged}</td></tr><tr><td>{@link VR#EVREventType_VREvent_NullSectionSettingChanged}</td></tr><tr><td>{@link VR#EVREventType_VREvent_UserInterfaceSectionSettingChanged}</td></tr><tr><td>{@link VR#EVREventType_VREvent_NotificationsSectionSettingChanged}</td></tr><tr><td>{@link VR#EVREventType_VREvent_KeyboardSectionSettingChanged}</td></tr><tr><td>{@link VR#EVREventType_VREvent_PerfSectionSettingChanged}</td></tr><tr><td>{@link VR#EVREventType_VREvent_DashboardSectionSettingChanged}</td></tr><tr><td>{@link VR#EVREventType_VREvent_WebInterfaceSectionSettingChanged}</td></tr><tr><td>{@link VR#EVREventType_VREvent_TrackersSectionSettingChanged}</td></tr><tr><td>{@link VR#EVREventType_VREvent_LastKnownSectionSettingChanged}</td></tr><tr><td>{@link VR#EVREventType_VREvent_DismissedWarningsSectionSettingChanged}</td></tr><tr><td>{@link VR#EVREventType_VREvent_StatusUpdate}</td></tr><tr><td>{@link VR#EVREventType_VREvent_WebInterface_InstallDriverCompleted}</td></tr><tr><td>{@link VR#EVREventType_VREvent_MCImageUpdated}</td></tr><tr><td>{@link VR#EVREventType_VREvent_FirmwareUpdateStarted}</td></tr><tr><td>{@link VR#EVREventType_VREvent_FirmwareUpdateFinished}</td></tr><tr><td>{@link VR#EVREventType_VREvent_KeyboardClosed}</td></tr><tr><td>{@link VR#EVREventType_VREvent_KeyboardCharInput}</td></tr><tr><td>{@link VR#EVREventType_VREvent_KeyboardDone}</td></tr><tr><td>{@link VR#EVREventType_VREvent_ApplicationTransitionStarted}</td></tr><tr><td>{@link VR#EVREventType_VREvent_ApplicationTransitionAborted}</td></tr><tr><td>{@link VR#EVREventType_VREvent_ApplicationTransitionNewAppStarted}</td></tr><tr><td>{@link VR#EVREventType_VREvent_ApplicationListUpdated}</td></tr><tr><td>{@link VR#EVREventType_VREvent_ApplicationMimeTypeLoad}</td></tr><tr><td>{@link VR#EVREventType_VREvent_ApplicationTransitionNewAppLaunchComplete}</td></tr><tr><td>{@link VR#EVREventType_VREvent_ProcessConnected}</td></tr><tr><td>{@link VR#EVREventType_VREvent_ProcessDisconnected}</td></tr><tr><td>{@link VR#EVREventType_VREvent_Compositor_ChaperoneBoundsShown}</td></tr><tr><td>{@link VR#EVREventType_VREvent_Compositor_ChaperoneBoundsHidden}</td></tr><tr><td>{@link VR#EVREventType_VREvent_Compositor_DisplayDisconnected}</td></tr><tr><td>{@link VR#EVREventType_VREvent_Compositor_DisplayReconnected}</td></tr><tr><td>{@link VR#EVREventType_VREvent_Compositor_HDCPError}</td></tr><tr><td>{@link VR#EVREventType_VREvent_Compositor_ApplicationNotResponding}</td></tr><tr><td>{@link VR#EVREventType_VREvent_Compositor_ApplicationResumed}</td></tr><tr><td>{@link VR#EVREventType_VREvent_Compositor_OutOfVideoMemory}</td></tr><tr><td>{@link VR#EVREventType_VREvent_TrackedCamera_StartVideoStream}</td></tr><tr><td>{@link VR#EVREventType_VREvent_TrackedCamera_StopVideoStream}</td></tr><tr><td>{@link VR#EVREventType_VREvent_TrackedCamera_PauseVideoStream}</td></tr><tr><td>{@link VR#EVREventType_VREvent_TrackedCamera_ResumeVideoStream}</td></tr><tr><td>{@link VR#EVREventType_VREvent_TrackedCamera_EditingSurface}</td></tr><tr><td>{@link VR#EVREventType_VREvent_PerformanceTest_EnableCapture}</td></tr><tr><td>{@link VR#EVREventType_VREvent_PerformanceTest_DisableCapture}</td></tr><tr><td>{@link VR#EVREventType_VREvent_PerformanceTest_FidelityLevel}</td></tr><tr><td>{@link VR#EVREventType_VREvent_MessageOverlay_Closed}</td></tr><tr><td>{@link VR#EVREventType_VREvent_MessageOverlayCloseRequested}</td></tr><tr><td>{@link VR#EVREventType_VREvent_Input_HapticVibration}</td></tr><tr><td>{@link VR#EVREventType_VREvent_Input_BindingLoadFailed}</td></tr><tr><td>{@link VR#EVREventType_VREvent_Input_BindingLoadSuccessful}</td></tr><tr><td>{@link VR#EVREventType_VREvent_Input_ActionManifestReloaded}</td></tr><tr><td>{@link VR#EVREventType_VREvent_Input_ActionManifestLoadFailed}</td></tr><tr><td>{@link VR#EVREventType_VREvent_Input_ProgressUpdate}</td></tr><tr><td>{@link VR#EVREventType_VREvent_Input_TrackerActivated}</td></tr><tr><td>{@link VR#EVREventType_VREvent_Input_BindingsUpdated}</td></tr><tr><td>{@link VR#EVREventType_VREvent_SpatialAnchors_PoseUpdated}</td></tr><tr><td>{@link VR#EVREventType_VREvent_SpatialAnchors_DescriptorUpdated}</td></tr><tr><td>{@link VR#EVREventType_VREvent_SpatialAnchors_RequestPoseUpdate}</td></tr><tr><td>{@link VR#EVREventType_VREvent_SpatialAnchors_RequestDescriptorUpdate}</td></tr><tr><td>{@link VR#EVREventType_VREvent_SystemReport_Started}</td></tr><tr><td>{@link VR#EVREventType_VREvent_Monitor_ShowHeadsetView}</td></tr><tr><td>{@link VR#EVREventType_VREvent_Monitor_HideHeadsetView}</td></tr><tr><td>{@link VR#EVREventType_VREvent_VendorSpecific_Reserved_Start}</td></tr><tr><td>{@link VR#EVREventType_VREvent_VendorSpecific_Reserved_End}</td></tr></table>
     */
    @Nullable
    @NativeType("char *")
    public static String VRSystem_GetEventTypeNameFromEnum(@NativeType("EVREventType") int eType) {
        long __result = nVRSystem_GetEventTypeNameFromEnum(eType);
        return memASCIISafe(__result);
    }

    // --- [ VRSystem_GetHiddenAreaMesh ] ---

    /** Unsafe version of: {@link #VRSystem_GetHiddenAreaMesh GetHiddenAreaMesh} */
    public static native void nVRSystem_GetHiddenAreaMesh(int eEye, int type, long __functionAddress, long __result);

    /** Unsafe version of: {@link #VRSystem_GetHiddenAreaMesh GetHiddenAreaMesh} */
    public static void nVRSystem_GetHiddenAreaMesh(int eEye, int type, long __result) {
        long __functionAddress = OpenVR.VRSystem.GetHiddenAreaMesh;
        if (CHECKS) {
            check(__functionAddress);
        }
        nVRSystem_GetHiddenAreaMesh(eEye, type, __functionAddress, __result);
    }

    /**
     * Returns the hidden area mesh for the current HMD. The pixels covered by this mesh will never be seen by the user after the lens distortion is applied
     * based on visibility to the panels. If this HMD does not have a hidden area mesh, the vertex data and count will be {@code NULL} and 0 respectively.
     * 
     * <p>This mesh is meant to be rendered into the stencil buffer (or into the depth buffer setting nearz) before rendering each eye's view. This will improve
     * performance by letting the GPU early-reject pixels the user will never see before running the pixel shader.</p>
     * 
     * <div style="margin-left: 26px; border-left: 1px solid gray; padding-left: 14px;"><h5>Note</h5>
     * 
     * <p>Render this mesh with backface culling disabled since the winding order of the vertices can be different per-HMD or per-eye.</p></div>
     *
     * @param eEye the eye to get the hidden area mesh for. One of:<br><table><tr><td>{@link VR#EVREye_Eye_Left}</td><td>{@link VR#EVREye_Eye_Right}</td></tr></table>
     * @param type one of:<br><table><tr><td>{@link VR#EHiddenAreaMeshType_k_eHiddenAreaMesh_Standard}</td></tr><tr><td>{@link VR#EHiddenAreaMeshType_k_eHiddenAreaMesh_Inverse}</td></tr><tr><td>{@link VR#EHiddenAreaMeshType_k_eHiddenAreaMesh_LineLoop}</td></tr><tr><td>{@link VR#EHiddenAreaMeshType_k_eHiddenAreaMesh_Max}</td></tr></table>
     */
    @NativeType("HiddenAreaMesh_t")
    public static HiddenAreaMesh VRSystem_GetHiddenAreaMesh(@NativeType("EVREye") int eEye, @NativeType("EHiddenAreaMeshType") int type, @NativeType("HiddenAreaMesh_t") HiddenAreaMesh __result) {
        nVRSystem_GetHiddenAreaMesh(eEye, type, __result.address());
        return __result;
    }

    // --- [ VRSystem_GetControllerState ] ---

    /** Unsafe version of: {@link #VRSystem_GetControllerState GetControllerState} */
    public static boolean nVRSystem_GetControllerState(int unControllerDeviceIndex, long pControllerState, int unControllerStateSize) {
        long __functionAddress = OpenVR.VRSystem.GetControllerState;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPZ(unControllerDeviceIndex, pControllerState, unControllerStateSize, __functionAddress);
    }

    /**
     * Fills the supplied struct with the current state of the controller.
     * 
     * <p>This function is deprecated in favor of the new {@code IVRInput} system.</p>
     *
     * @param unControllerDeviceIndex the tracked device index of the controller to get the state of
     * @param pControllerState        a struct to fill with the controller state
     * @param unControllerStateSize   the size in bytes of the {@link VRControllerState} struct
     *
     * @return false if the controller index is invalid
     */
    @NativeType("bool")
    public static boolean VRSystem_GetControllerState(@NativeType("TrackedDeviceIndex_t") int unControllerDeviceIndex, @NativeType("VRControllerState_t *") VRControllerState pControllerState, @NativeType("uint32_t") int unControllerStateSize) {
        return nVRSystem_GetControllerState(unControllerDeviceIndex, pControllerState.address(), unControllerStateSize);
    }

    /**
     * Fills the supplied struct with the current state of the controller.
     * 
     * <p>This function is deprecated in favor of the new {@code IVRInput} system.</p>
     *
     * @param unControllerDeviceIndex the tracked device index of the controller to get the state of
     * @param pControllerState        a struct to fill with the controller state
     *
     * @return false if the controller index is invalid
     */
    @NativeType("bool")
    public static boolean VRSystem_GetControllerState(@NativeType("TrackedDeviceIndex_t") int unControllerDeviceIndex, @NativeType("VRControllerState_t *") VRControllerState pControllerState) {
        return nVRSystem_GetControllerState(unControllerDeviceIndex, pControllerState.address(), VRControllerState.SIZEOF);
    }

    // --- [ VRSystem_GetControllerStateWithPose ] ---

    /** Unsafe version of: {@link #VRSystem_GetControllerStateWithPose GetControllerStateWithPose} */
    public static boolean nVRSystem_GetControllerStateWithPose(int eOrigin, int unControllerDeviceIndex, long pControllerState, int unControllerStateSize, long pTrackedDevicePose) {
        long __functionAddress = OpenVR.VRSystem.GetControllerStateWithPose;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPPZ(eOrigin, unControllerDeviceIndex, pControllerState, unControllerStateSize, pTrackedDevicePose, __functionAddress);
    }

    /**
     * Fills the supplied struct with the current state of the controller and the provided pose with the pose of the controller when the controller state was
     * updated most recently. Use this form if you need a precise controller pose as input to your application when the user presses or releases a button.
     * 
     * <p>This function is deprecated in favor of the new {@code IVRInput} system.</p>
     *
     * @param eOrigin                 the tracking coordinate system to return the pose in. One of:<br><table><tr><td>{@link VR#ETrackingUniverseOrigin_TrackingUniverseSeated}</td></tr><tr><td>{@link VR#ETrackingUniverseOrigin_TrackingUniverseStanding}</td></tr><tr><td>{@link VR#ETrackingUniverseOrigin_TrackingUniverseRawAndUncalibrated}</td></tr></table>
     * @param unControllerDeviceIndex the tracked device index of the controller to get the state of
     * @param pControllerState        a struct to fill with the controller state
     * @param unControllerStateSize   the size in bytes of the {@link VRControllerState} struct
     * @param pTrackedDevicePose      a pose struct to fill with the pose of the controller when the last button event occurred
     */
    @NativeType("bool")
    public static boolean VRSystem_GetControllerStateWithPose(@NativeType("ETrackingUniverseOrigin") int eOrigin, @NativeType("TrackedDeviceIndex_t") int unControllerDeviceIndex, @NativeType("VRControllerState_t *") VRControllerState pControllerState, @NativeType("uint32_t") int unControllerStateSize, @NativeType("TrackedDevicePose_t *") TrackedDevicePose pTrackedDevicePose) {
        return nVRSystem_GetControllerStateWithPose(eOrigin, unControllerDeviceIndex, pControllerState.address(), unControllerStateSize, pTrackedDevicePose.address());
    }

    /**
     * Fills the supplied struct with the current state of the controller and the provided pose with the pose of the controller when the controller state was
     * updated most recently. Use this form if you need a precise controller pose as input to your application when the user presses or releases a button.
     * 
     * <p>This function is deprecated in favor of the new {@code IVRInput} system.</p>
     *
     * @param eOrigin                 the tracking coordinate system to return the pose in. One of:<br><table><tr><td>{@link VR#ETrackingUniverseOrigin_TrackingUniverseSeated}</td></tr><tr><td>{@link VR#ETrackingUniverseOrigin_TrackingUniverseStanding}</td></tr><tr><td>{@link VR#ETrackingUniverseOrigin_TrackingUniverseRawAndUncalibrated}</td></tr></table>
     * @param unControllerDeviceIndex the tracked device index of the controller to get the state of
     * @param pControllerState        a struct to fill with the controller state
     * @param pTrackedDevicePose      a pose struct to fill with the pose of the controller when the last button event occurred
     */
    @NativeType("bool")
    public static boolean VRSystem_GetControllerStateWithPose(@NativeType("ETrackingUniverseOrigin") int eOrigin, @NativeType("TrackedDeviceIndex_t") int unControllerDeviceIndex, @NativeType("VRControllerState_t *") VRControllerState pControllerState, @NativeType("TrackedDevicePose_t *") TrackedDevicePose pTrackedDevicePose) {
        return nVRSystem_GetControllerStateWithPose(eOrigin, unControllerDeviceIndex, pControllerState.address(), VRControllerState.SIZEOF, pTrackedDevicePose.address());
    }

    // --- [ VRSystem_TriggerHapticPulse ] ---

    /**
     * Trigger a single haptic pulse on a controller. After this call the application may not trigger another haptic pulse on this controller and axis
     * combination for 5ms.
     * 
     * <p>This function is deprecated in favor of the new {@code IVRInput} system.</p>
     *
     * @param unControllerDeviceIndex the tracked device index of the controller to trigger a haptic pulse on
     * @param unAxisId                the ID of the axis to trigger a haptic pulse on
     * @param usDurationMicroSec      the duration of the desired haptic pulse in microseconds
     */
    public static void VRSystem_TriggerHapticPulse(@NativeType("TrackedDeviceIndex_t") int unControllerDeviceIndex, @NativeType("uint32_t") int unAxisId, @NativeType("unsigned short") short usDurationMicroSec) {
        long __functionAddress = OpenVR.VRSystem.TriggerHapticPulse;
        if (CHECKS) {
            check(__functionAddress);
        }
        callV(unControllerDeviceIndex, unAxisId, usDurationMicroSec, __functionAddress);
    }

    // --- [ VRSystem_GetButtonIdNameFromEnum ] ---

    /** Unsafe version of: {@link #VRSystem_GetButtonIdNameFromEnum GetButtonIdNameFromEnum} */
    public static long nVRSystem_GetButtonIdNameFromEnum(int eButtonId) {
        long __functionAddress = OpenVR.VRSystem.GetButtonIdNameFromEnum;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callP(eButtonId, __functionAddress);
    }

    /**
     * Returns the name of an {@code EVRButtonId} enum value.
     * 
     * <p>This function is deprecated in favor of the new {@code IVRInput} system.</p>
     *
     * @param eButtonId the button ID to return the name of. One of:<br><table><tr><td>{@link VR#EVRButtonId_k_EButton_System}</td><td>{@link VR#EVRButtonId_k_EButton_ApplicationMenu}</td></tr><tr><td>{@link VR#EVRButtonId_k_EButton_Grip}</td><td>{@link VR#EVRButtonId_k_EButton_DPad_Left}</td></tr><tr><td>{@link VR#EVRButtonId_k_EButton_DPad_Up}</td><td>{@link VR#EVRButtonId_k_EButton_DPad_Right}</td></tr><tr><td>{@link VR#EVRButtonId_k_EButton_DPad_Down}</td><td>{@link VR#EVRButtonId_k_EButton_A}</td></tr><tr><td>{@link VR#EVRButtonId_k_EButton_ProximitySensor}</td><td>{@link VR#EVRButtonId_k_EButton_Axis0}</td></tr><tr><td>{@link VR#EVRButtonId_k_EButton_Axis1}</td><td>{@link VR#EVRButtonId_k_EButton_Axis2}</td></tr><tr><td>{@link VR#EVRButtonId_k_EButton_Axis3}</td><td>{@link VR#EVRButtonId_k_EButton_Axis4}</td></tr><tr><td>{@link VR#EVRButtonId_k_EButton_SteamVR_Touchpad}</td><td>{@link VR#EVRButtonId_k_EButton_SteamVR_Trigger}</td></tr><tr><td>{@link VR#EVRButtonId_k_EButton_Dashboard_Back}</td><td>{@link VR#EVRButtonId_k_EButton_IndexController_A}</td></tr><tr><td>{@link VR#EVRButtonId_k_EButton_IndexController_B}</td><td>{@link VR#EVRButtonId_k_EButton_IndexController_JoyStick}</td></tr><tr><td>{@link VR#EVRButtonId_k_EButton_Max}</td></tr></table>
     */
    @Nullable
    @NativeType("char *")
    public static String VRSystem_GetButtonIdNameFromEnum(@NativeType("EVRButtonId") int eButtonId) {
        long __result = nVRSystem_GetButtonIdNameFromEnum(eButtonId);
        return memASCIISafe(__result);
    }

    // --- [ VRSystem_GetControllerAxisTypeNameFromEnum ] ---

    /** Unsafe version of: {@link #VRSystem_GetControllerAxisTypeNameFromEnum GetControllerAxisTypeNameFromEnum} */
    public static long nVRSystem_GetControllerAxisTypeNameFromEnum(int eAxisType) {
        long __functionAddress = OpenVR.VRSystem.GetControllerAxisTypeNameFromEnum;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callP(eAxisType, __functionAddress);
    }

    /**
     * Returns the name of an {@code EVRControllerAxisType} enum value.
     *
     * @param eAxisType the controller axis type to get a name for. One of:<br><table><tr><td>{@link VR#EVRControllerAxisType_k_eControllerAxis_None}</td></tr><tr><td>{@link VR#EVRControllerAxisType_k_eControllerAxis_TrackPad}</td></tr><tr><td>{@link VR#EVRControllerAxisType_k_eControllerAxis_Joystick}</td></tr><tr><td>{@link VR#EVRControllerAxisType_k_eControllerAxis_Trigger}</td></tr></table>
     */
    @Nullable
    @NativeType("char *")
    public static String VRSystem_GetControllerAxisTypeNameFromEnum(@NativeType("EVRControllerAxisType") int eAxisType) {
        long __result = nVRSystem_GetControllerAxisTypeNameFromEnum(eAxisType);
        return memASCIISafe(__result);
    }

    // --- [ VRSystem_IsInputAvailable ] ---

    /**
     * Returns true if this application is receiving input from the system. This would return false if system-related functionality is consuming the input
     * stream.
     */
    @NativeType("bool")
    public static boolean VRSystem_IsInputAvailable() {
        long __functionAddress = OpenVR.VRSystem.IsInputAvailable;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callZ(__functionAddress);
    }

    // --- [ VRSystem_IsSteamVRDrawingControllers ] ---

    /**
     * Returns true if SteamVR is drawing controllers on top of the application. Applications should consider not drawing anything attached to the user's
     * hands in this case.
     */
    @NativeType("bool")
    public static boolean VRSystem_IsSteamVRDrawingControllers() {
        long __functionAddress = OpenVR.VRSystem.IsSteamVRDrawingControllers;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callZ(__functionAddress);
    }

    // --- [ VRSystem_ShouldApplicationPause ] ---

    /**
     * Returns true if the user has put SteamVR into a mode that is distracting them from the application. For applications where this is appropriate, the
     * application should pause ongoing activity.
     */
    @NativeType("bool")
    public static boolean VRSystem_ShouldApplicationPause() {
        long __functionAddress = OpenVR.VRSystem.ShouldApplicationPause;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callZ(__functionAddress);
    }

    // --- [ VRSystem_ShouldApplicationReduceRenderingWork ] ---

    /**
     * Returns true if SteamVR is doing significant rendering work and the game should do what it can to reduce its own workload. One common way to do this is
     * to reduce the size of the render target provided for each eye.
     */
    @NativeType("bool")
    public static boolean VRSystem_ShouldApplicationReduceRenderingWork() {
        long __functionAddress = OpenVR.VRSystem.ShouldApplicationReduceRenderingWork;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callZ(__functionAddress);
    }

    // --- [ VRSystem_PerformFirmwareUpdate ] ---

    /**
     * Performs the actual firmware update if applicable.
     * 
     * <p>The following events will be sent, if {@link VR#EVRFirmwareError_VRFirmwareError_None} was returned: {@link VR#EVREventType_VREvent_FirmwareUpdateStarted},
     * {@link VR#EVREventType_VREvent_FirmwareUpdateFinished}</p>
     * 
     * <p>Use the properties {@link VR#ETrackedDeviceProperty_Prop_Firmware_UpdateAvailable_Bool}, {@link VR#ETrackedDeviceProperty_Prop_Firmware_ManualUpdate_Bool}, and
     * {@link VR#ETrackedDeviceProperty_Prop_Firmware_ManualUpdateURL_String} to figure our whether a firmware update is available, and to figure out whether its a
     * manual update. {@link VR#ETrackedDeviceProperty_Prop_Firmware_ManualUpdateURL_String} should point to an URL describing the manual update process.</p>
     */
    @NativeType("EVRFirmwareError")
    public static int VRSystem_PerformFirmwareUpdate(@NativeType("TrackedDeviceIndex_t") int unDeviceIndex) {
        long __functionAddress = OpenVR.VRSystem.PerformFirmwareUpdate;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callI(unDeviceIndex, __functionAddress);
    }

    // --- [ VRSystem_AcknowledgeQuit_Exiting ] ---

    /**
     * Call this to acknowledge to the system that {@link VR#EVREventType_VREvent_Quit} has been received and that the process is exiting. This extends the timeout
     * until the process is killed.
     */
    public static void VRSystem_AcknowledgeQuit_Exiting() {
        long __functionAddress = OpenVR.VRSystem.AcknowledgeQuit_Exiting;
        if (CHECKS) {
            check(__functionAddress);
        }
        callV(__functionAddress);
    }

    // --- [ VRSystem_AcknowledgeQuit_UserPrompt ] ---

    /**
     * Call this to tell the system that the user is being prompted to save data. This halts the timeout and dismisses the dashboard (if it was up).
     * Applications should be sure to actually prompt the user to save and then exit afterward, otherwise the user will be left in a confusing state.
     */
    public static void VRSystem_AcknowledgeQuit_UserPrompt() {
        long __functionAddress = OpenVR.VRSystem.AcknowledgeQuit_UserPrompt;
        if (CHECKS) {
            check(__functionAddress);
        }
        callV(__functionAddress);
    }

    // --- [ VRSystem_GetAppContainerFilePaths ] ---

    /** Unsafe version of: {@link #VRSystem_GetAppContainerFilePaths GetAppContainerFilePaths} */
    public static int nVRSystem_GetAppContainerFilePaths(long pchBuffer, int unBufferSize) {
        long __functionAddress = OpenVR.VRSystem.GetAppContainerFilePaths;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPI(pchBuffer, unBufferSize, __functionAddress);
    }

    /**
     * Retrieves a null-terminated, semicolon-delimited list of UTF8 file paths that an application must have read access to when running inside of an app
     * container.
     *
     * @return the number of bytes needed to hold the list
     */
    @NativeType("uint32_t")
    public static int VRSystem_GetAppContainerFilePaths(@Nullable @NativeType("char *") ByteBuffer pchBuffer) {
        return nVRSystem_GetAppContainerFilePaths(memAddressSafe(pchBuffer), remainingSafe(pchBuffer));
    }

    /**
     * Retrieves a null-terminated, semicolon-delimited list of UTF8 file paths that an application must have read access to when running inside of an app
     * container.
     *
     * @return the number of bytes needed to hold the list
     */
    @NativeType("uint32_t")
    public static String VRSystem_GetAppContainerFilePaths(@NativeType("uint32_t") int unBufferSize) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            ByteBuffer pchBuffer = stack.malloc(unBufferSize);
            int __result = nVRSystem_GetAppContainerFilePaths(memAddress(pchBuffer), unBufferSize);
            return memUTF8(pchBuffer, __result - 1);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ VRSystem_GetRuntimeVersion ] ---

    /** Unsafe version of: {@link #VRSystem_GetRuntimeVersion GetRuntimeVersion} */
    public static long nVRSystem_GetRuntimeVersion() {
        long __functionAddress = OpenVR.VRSystem.GetRuntimeVersion;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callP(__functionAddress);
    }

    /**
     * Returns the current version of the SteamVR runtime. The returned string will remain valid until {@link VR#VR_ShutdownInternal ShutdownInternal} is called.
     * 
     * <p>NOTE: Is it not appropriate to use this version to test for the presence of any SteamVR feature. Only use this version number for logging or showing to
     * a user, and not to try to detect anything at runtime. When appropriate, feature-specific presence information is provided by other APIs.</p>
     */
    @Nullable
    @NativeType("char *")
    public static String VRSystem_GetRuntimeVersion() {
        long __result = nVRSystem_GetRuntimeVersion();
        return memASCIISafe(__result);
    }

}