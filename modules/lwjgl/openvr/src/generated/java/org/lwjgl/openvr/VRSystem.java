/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.openvr;

import org.jspecify.annotations.*;

import java.nio.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.JNI.*;
import static org.lwjgl.system.MemoryStack.*;
import static org.lwjgl.system.MemoryUtil.*;

public class VRSystem {

    static { OpenVR.initialize(); }

    protected VRSystem() {
        throw new UnsupportedOperationException();
    }

    // --- [ VRSystem_GetRecommendedRenderTargetSize ] ---

    /** {@code void VRSystem_GetRecommendedRenderTargetSize(uint32_t * pnWidth, uint32_t * pnHeight)} */
    public static void nVRSystem_GetRecommendedRenderTargetSize(long pnWidth, long pnHeight) {
        long __functionAddress = OpenVR.VRSystem.GetRecommendedRenderTargetSize;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPPV(pnWidth, pnHeight, __functionAddress);
    }

    /** {@code void VRSystem_GetRecommendedRenderTargetSize(uint32_t * pnWidth, uint32_t * pnHeight)} */
    public static void VRSystem_GetRecommendedRenderTargetSize(@NativeType("uint32_t *") IntBuffer pnWidth, @NativeType("uint32_t *") IntBuffer pnHeight) {
        if (CHECKS) {
            check(pnWidth, 1);
            check(pnHeight, 1);
        }
        nVRSystem_GetRecommendedRenderTargetSize(memAddress(pnWidth), memAddress(pnHeight));
    }

    // --- [ VRSystem_GetProjectionMatrix ] ---

    /** {@code HmdMatrix44_t VRSystem_GetProjectionMatrix(EVREye eEye, float fNearZ, float fFarZ)} */
    public static native void nVRSystem_GetProjectionMatrix(int eEye, float fNearZ, float fFarZ, long __functionAddress, long __result);

    /** {@code HmdMatrix44_t VRSystem_GetProjectionMatrix(EVREye eEye, float fNearZ, float fFarZ)} */
    public static void nVRSystem_GetProjectionMatrix(int eEye, float fNearZ, float fFarZ, long __result) {
        long __functionAddress = OpenVR.VRSystem.GetProjectionMatrix;
        if (CHECKS) {
            check(__functionAddress);
        }
        nVRSystem_GetProjectionMatrix(eEye, fNearZ, fFarZ, __functionAddress, __result);
    }

    /** {@code HmdMatrix44_t VRSystem_GetProjectionMatrix(EVREye eEye, float fNearZ, float fFarZ)} */
    @NativeType("HmdMatrix44_t")
    public static HmdMatrix44 VRSystem_GetProjectionMatrix(@NativeType("EVREye") int eEye, float fNearZ, float fFarZ, @NativeType("HmdMatrix44_t") HmdMatrix44 __result) {
        nVRSystem_GetProjectionMatrix(eEye, fNearZ, fFarZ, __result.address());
        return __result;
    }

    // --- [ VRSystem_GetProjectionRaw ] ---

    /** {@code void VRSystem_GetProjectionRaw(EVREye eEye, float * pfLeft, float * pfRight, float * pfTop, float * pfBottom)} */
    public static void nVRSystem_GetProjectionRaw(int eEye, long pfLeft, long pfRight, long pfTop, long pfBottom) {
        long __functionAddress = OpenVR.VRSystem.GetProjectionRaw;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPPPPV(eEye, pfLeft, pfRight, pfTop, pfBottom, __functionAddress);
    }

    /** {@code void VRSystem_GetProjectionRaw(EVREye eEye, float * pfLeft, float * pfRight, float * pfTop, float * pfBottom)} */
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

    /** {@code bool VRSystem_ComputeDistortion(EVREye eEye, float fU, float fV, DistortionCoordinates_t * pDistortionCoordinates)} */
    public static boolean nVRSystem_ComputeDistortion(int eEye, float fU, float fV, long pDistortionCoordinates) {
        long __functionAddress = OpenVR.VRSystem.ComputeDistortion;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPZ(eEye, fU, fV, pDistortionCoordinates, __functionAddress);
    }

    /** {@code bool VRSystem_ComputeDistortion(EVREye eEye, float fU, float fV, DistortionCoordinates_t * pDistortionCoordinates)} */
    @NativeType("bool")
    public static boolean VRSystem_ComputeDistortion(@NativeType("EVREye") int eEye, float fU, float fV, @NativeType("DistortionCoordinates_t *") DistortionCoordinates pDistortionCoordinates) {
        return nVRSystem_ComputeDistortion(eEye, fU, fV, pDistortionCoordinates.address());
    }

    // --- [ VRSystem_GetEyeToHeadTransform ] ---

    /** {@code HmdMatrix34_t VRSystem_GetEyeToHeadTransform(EVREye eEye)} */
    public static native void nVRSystem_GetEyeToHeadTransform(int eEye, long __functionAddress, long __result);

    /** {@code HmdMatrix34_t VRSystem_GetEyeToHeadTransform(EVREye eEye)} */
    public static void nVRSystem_GetEyeToHeadTransform(int eEye, long __result) {
        long __functionAddress = OpenVR.VRSystem.GetEyeToHeadTransform;
        if (CHECKS) {
            check(__functionAddress);
        }
        nVRSystem_GetEyeToHeadTransform(eEye, __functionAddress, __result);
    }

    /** {@code HmdMatrix34_t VRSystem_GetEyeToHeadTransform(EVREye eEye)} */
    @NativeType("HmdMatrix34_t")
    public static HmdMatrix34 VRSystem_GetEyeToHeadTransform(@NativeType("EVREye") int eEye, @NativeType("HmdMatrix34_t") HmdMatrix34 __result) {
        nVRSystem_GetEyeToHeadTransform(eEye, __result.address());
        return __result;
    }

    // --- [ VRSystem_GetTimeSinceLastVsync ] ---

    /** {@code bool VRSystem_GetTimeSinceLastVsync(float * pfSecondsSinceLastVsync, uint64_t * pulFrameCounter)} */
    public static boolean nVRSystem_GetTimeSinceLastVsync(long pfSecondsSinceLastVsync, long pulFrameCounter) {
        long __functionAddress = OpenVR.VRSystem.GetTimeSinceLastVsync;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPPZ(pfSecondsSinceLastVsync, pulFrameCounter, __functionAddress);
    }

    /** {@code bool VRSystem_GetTimeSinceLastVsync(float * pfSecondsSinceLastVsync, uint64_t * pulFrameCounter)} */
    @NativeType("bool")
    public static boolean VRSystem_GetTimeSinceLastVsync(@NativeType("float *") FloatBuffer pfSecondsSinceLastVsync, @NativeType("uint64_t *") LongBuffer pulFrameCounter) {
        if (CHECKS) {
            check(pfSecondsSinceLastVsync, 1);
            check(pulFrameCounter, 1);
        }
        return nVRSystem_GetTimeSinceLastVsync(memAddress(pfSecondsSinceLastVsync), memAddress(pulFrameCounter));
    }

    // --- [ VRSystem_GetD3D9AdapterIndex ] ---

    /** {@code int32_t VRSystem_GetD3D9AdapterIndex(void)} */
    @NativeType("int32_t")
    public static int VRSystem_GetD3D9AdapterIndex() {
        long __functionAddress = OpenVR.VRSystem.GetD3D9AdapterIndex;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callI(__functionAddress);
    }

    // --- [ VRSystem_GetDXGIOutputInfo ] ---

    /** {@code void VRSystem_GetDXGIOutputInfo(int32_t * pnAdapterIndex)} */
    public static void nVRSystem_GetDXGIOutputInfo(long pnAdapterIndex) {
        long __functionAddress = OpenVR.VRSystem.GetDXGIOutputInfo;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(pnAdapterIndex, __functionAddress);
    }

    /** {@code void VRSystem_GetDXGIOutputInfo(int32_t * pnAdapterIndex)} */
    public static void VRSystem_GetDXGIOutputInfo(@NativeType("int32_t *") IntBuffer pnAdapterIndex) {
        if (CHECKS) {
            check(pnAdapterIndex, 1);
        }
        nVRSystem_GetDXGIOutputInfo(memAddress(pnAdapterIndex));
    }

    // --- [ VRSystem_GetOutputDevice ] ---

    /** {@code void VRSystem_GetOutputDevice(uint64_t * pnDevice, ETextureType textureType, VkInstance_T * pInstance)} */
    public static void nVRSystem_GetOutputDevice(long pnDevice, int textureType, long pInstance) {
        long __functionAddress = OpenVR.VRSystem.GetOutputDevice;
        if (CHECKS) {
            check(__functionAddress);
            check(pInstance);
        }
        callPPV(pnDevice, textureType, pInstance, __functionAddress);
    }

    /** {@code void VRSystem_GetOutputDevice(uint64_t * pnDevice, ETextureType textureType, VkInstance_T * pInstance)} */
    public static void VRSystem_GetOutputDevice(@NativeType("uint64_t *") LongBuffer pnDevice, @NativeType("ETextureType") int textureType, @NativeType("VkInstance_T *") long pInstance) {
        if (CHECKS) {
            check(pnDevice, 1);
        }
        nVRSystem_GetOutputDevice(memAddress(pnDevice), textureType, pInstance);
    }

    // --- [ VRSystem_IsDisplayOnDesktop ] ---

    /** {@code bool VRSystem_IsDisplayOnDesktop(void)} */
    @NativeType("bool")
    public static boolean VRSystem_IsDisplayOnDesktop() {
        long __functionAddress = OpenVR.VRSystem.IsDisplayOnDesktop;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callZ(__functionAddress);
    }

    // --- [ VRSystem_SetDisplayVisibility ] ---

    /** {@code bool VRSystem_SetDisplayVisibility(bool bIsVisibleOnDesktop)} */
    @NativeType("bool")
    public static boolean VRSystem_SetDisplayVisibility(@NativeType("bool") boolean bIsVisibleOnDesktop) {
        long __functionAddress = OpenVR.VRSystem.SetDisplayVisibility;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callZ(bIsVisibleOnDesktop, __functionAddress);
    }

    // --- [ VRSystem_GetDeviceToAbsoluteTrackingPose ] ---

    /** {@code void VRSystem_GetDeviceToAbsoluteTrackingPose(ETrackingUniverseOrigin eOrigin, float fPredictedSecondsToPhotonsFromNow, TrackedDevicePose_t * pTrackedDevicePoseArray, uint32_t unTrackedDevicePoseArrayCount)} */
    public static void nVRSystem_GetDeviceToAbsoluteTrackingPose(int eOrigin, float fPredictedSecondsToPhotonsFromNow, long pTrackedDevicePoseArray, int unTrackedDevicePoseArrayCount) {
        long __functionAddress = OpenVR.VRSystem.GetDeviceToAbsoluteTrackingPose;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(eOrigin, fPredictedSecondsToPhotonsFromNow, pTrackedDevicePoseArray, unTrackedDevicePoseArrayCount, __functionAddress);
    }

    /** {@code void VRSystem_GetDeviceToAbsoluteTrackingPose(ETrackingUniverseOrigin eOrigin, float fPredictedSecondsToPhotonsFromNow, TrackedDevicePose_t * pTrackedDevicePoseArray, uint32_t unTrackedDevicePoseArrayCount)} */
    public static void VRSystem_GetDeviceToAbsoluteTrackingPose(@NativeType("ETrackingUniverseOrigin") int eOrigin, float fPredictedSecondsToPhotonsFromNow, @NativeType("TrackedDevicePose_t *") TrackedDevicePose.Buffer pTrackedDevicePoseArray) {
        nVRSystem_GetDeviceToAbsoluteTrackingPose(eOrigin, fPredictedSecondsToPhotonsFromNow, pTrackedDevicePoseArray.address(), pTrackedDevicePoseArray.remaining());
    }

    // --- [ VRSystem_GetSeatedZeroPoseToStandingAbsoluteTrackingPose ] ---

    /** {@code HmdMatrix34_t VRSystem_GetSeatedZeroPoseToStandingAbsoluteTrackingPose(void)} */
    public static native void nVRSystem_GetSeatedZeroPoseToStandingAbsoluteTrackingPose(long __functionAddress, long __result);

    /** {@code HmdMatrix34_t VRSystem_GetSeatedZeroPoseToStandingAbsoluteTrackingPose(void)} */
    public static void nVRSystem_GetSeatedZeroPoseToStandingAbsoluteTrackingPose(long __result) {
        long __functionAddress = OpenVR.VRSystem.GetSeatedZeroPoseToStandingAbsoluteTrackingPose;
        if (CHECKS) {
            check(__functionAddress);
        }
        nVRSystem_GetSeatedZeroPoseToStandingAbsoluteTrackingPose(__functionAddress, __result);
    }

    /** {@code HmdMatrix34_t VRSystem_GetSeatedZeroPoseToStandingAbsoluteTrackingPose(void)} */
    @NativeType("HmdMatrix34_t")
    public static HmdMatrix34 VRSystem_GetSeatedZeroPoseToStandingAbsoluteTrackingPose(@NativeType("HmdMatrix34_t") HmdMatrix34 __result) {
        nVRSystem_GetSeatedZeroPoseToStandingAbsoluteTrackingPose(__result.address());
        return __result;
    }

    // --- [ VRSystem_GetRawZeroPoseToStandingAbsoluteTrackingPose ] ---

    /** {@code HmdMatrix34_t VRSystem_GetRawZeroPoseToStandingAbsoluteTrackingPose(void)} */
    public static native void nVRSystem_GetRawZeroPoseToStandingAbsoluteTrackingPose(long __functionAddress, long __result);

    /** {@code HmdMatrix34_t VRSystem_GetRawZeroPoseToStandingAbsoluteTrackingPose(void)} */
    public static void nVRSystem_GetRawZeroPoseToStandingAbsoluteTrackingPose(long __result) {
        long __functionAddress = OpenVR.VRSystem.GetRawZeroPoseToStandingAbsoluteTrackingPose;
        if (CHECKS) {
            check(__functionAddress);
        }
        nVRSystem_GetRawZeroPoseToStandingAbsoluteTrackingPose(__functionAddress, __result);
    }

    /** {@code HmdMatrix34_t VRSystem_GetRawZeroPoseToStandingAbsoluteTrackingPose(void)} */
    @NativeType("HmdMatrix34_t")
    public static HmdMatrix34 VRSystem_GetRawZeroPoseToStandingAbsoluteTrackingPose(@NativeType("HmdMatrix34_t") HmdMatrix34 __result) {
        nVRSystem_GetRawZeroPoseToStandingAbsoluteTrackingPose(__result.address());
        return __result;
    }

    // --- [ VRSystem_GetSortedTrackedDeviceIndicesOfClass ] ---

    /** {@code uint32_t VRSystem_GetSortedTrackedDeviceIndicesOfClass(ETrackedDeviceClass eTrackedDeviceClass, TrackedDeviceIndex_t * punTrackedDeviceIndexArray, uint32_t unTrackedDeviceIndexArrayCount, TrackedDeviceIndex_t unRelativeToTrackedDeviceIndex)} */
    public static int nVRSystem_GetSortedTrackedDeviceIndicesOfClass(int eTrackedDeviceClass, long punTrackedDeviceIndexArray, int unTrackedDeviceIndexArrayCount, int unRelativeToTrackedDeviceIndex) {
        long __functionAddress = OpenVR.VRSystem.GetSortedTrackedDeviceIndicesOfClass;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPI(eTrackedDeviceClass, punTrackedDeviceIndexArray, unTrackedDeviceIndexArrayCount, unRelativeToTrackedDeviceIndex, __functionAddress);
    }

    /** {@code uint32_t VRSystem_GetSortedTrackedDeviceIndicesOfClass(ETrackedDeviceClass eTrackedDeviceClass, TrackedDeviceIndex_t * punTrackedDeviceIndexArray, uint32_t unTrackedDeviceIndexArrayCount, TrackedDeviceIndex_t unRelativeToTrackedDeviceIndex)} */
    @NativeType("uint32_t")
    public static int VRSystem_GetSortedTrackedDeviceIndicesOfClass(@NativeType("ETrackedDeviceClass") int eTrackedDeviceClass, @NativeType("TrackedDeviceIndex_t *") @Nullable IntBuffer punTrackedDeviceIndexArray, @NativeType("TrackedDeviceIndex_t") int unRelativeToTrackedDeviceIndex) {
        return nVRSystem_GetSortedTrackedDeviceIndicesOfClass(eTrackedDeviceClass, memAddressSafe(punTrackedDeviceIndexArray), remainingSafe(punTrackedDeviceIndexArray), unRelativeToTrackedDeviceIndex);
    }

    // --- [ VRSystem_GetTrackedDeviceActivityLevel ] ---

    /** {@code EDeviceActivityLevel VRSystem_GetTrackedDeviceActivityLevel(TrackedDeviceIndex_t unDeviceId)} */
    @NativeType("EDeviceActivityLevel")
    public static int VRSystem_GetTrackedDeviceActivityLevel(@NativeType("TrackedDeviceIndex_t") int unDeviceId) {
        long __functionAddress = OpenVR.VRSystem.GetTrackedDeviceActivityLevel;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callI(unDeviceId, __functionAddress);
    }

    // --- [ VRSystem_ApplyTransform ] ---

    /** {@code void VRSystem_ApplyTransform(TrackedDevicePose_t * pOutputPose, TrackedDevicePose_t const * pTrackedDevicePose, HmdMatrix34_t const * pTransform)} */
    public static void nVRSystem_ApplyTransform(long pOutputPose, long pTrackedDevicePose, long pTransform) {
        long __functionAddress = OpenVR.VRSystem.ApplyTransform;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPPPV(pOutputPose, pTrackedDevicePose, pTransform, __functionAddress);
    }

    /** {@code void VRSystem_ApplyTransform(TrackedDevicePose_t * pOutputPose, TrackedDevicePose_t const * pTrackedDevicePose, HmdMatrix34_t const * pTransform)} */
    public static void VRSystem_ApplyTransform(@NativeType("TrackedDevicePose_t *") TrackedDevicePose pOutputPose, @NativeType("TrackedDevicePose_t const *") TrackedDevicePose pTrackedDevicePose, @NativeType("HmdMatrix34_t const *") HmdMatrix34 pTransform) {
        nVRSystem_ApplyTransform(pOutputPose.address(), pTrackedDevicePose.address(), pTransform.address());
    }

    // --- [ VRSystem_GetTrackedDeviceIndexForControllerRole ] ---

    /** {@code TrackedDeviceIndex_t VRSystem_GetTrackedDeviceIndexForControllerRole(ETrackedControllerRole unDeviceType)} */
    @NativeType("TrackedDeviceIndex_t")
    public static int VRSystem_GetTrackedDeviceIndexForControllerRole(@NativeType("ETrackedControllerRole") int unDeviceType) {
        long __functionAddress = OpenVR.VRSystem.GetTrackedDeviceIndexForControllerRole;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callI(unDeviceType, __functionAddress);
    }

    // --- [ VRSystem_GetControllerRoleForTrackedDeviceIndex ] ---

    /** {@code ETrackedControllerRole VRSystem_GetControllerRoleForTrackedDeviceIndex(TrackedDeviceIndex_t unDeviceIndex)} */
    @NativeType("ETrackedControllerRole")
    public static int VRSystem_GetControllerRoleForTrackedDeviceIndex(@NativeType("TrackedDeviceIndex_t") int unDeviceIndex) {
        long __functionAddress = OpenVR.VRSystem.GetControllerRoleForTrackedDeviceIndex;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callI(unDeviceIndex, __functionAddress);
    }

    // --- [ VRSystem_GetTrackedDeviceClass ] ---

    /** {@code ETrackedDeviceClass VRSystem_GetTrackedDeviceClass(TrackedDeviceIndex_t unDeviceIndex)} */
    @NativeType("ETrackedDeviceClass")
    public static int VRSystem_GetTrackedDeviceClass(@NativeType("TrackedDeviceIndex_t") int unDeviceIndex) {
        long __functionAddress = OpenVR.VRSystem.GetTrackedDeviceClass;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callI(unDeviceIndex, __functionAddress);
    }

    // --- [ VRSystem_IsTrackedDeviceConnected ] ---

    /** {@code bool VRSystem_IsTrackedDeviceConnected(TrackedDeviceIndex_t unDeviceIndex)} */
    @NativeType("bool")
    public static boolean VRSystem_IsTrackedDeviceConnected(@NativeType("TrackedDeviceIndex_t") int unDeviceIndex) {
        long __functionAddress = OpenVR.VRSystem.IsTrackedDeviceConnected;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callZ(unDeviceIndex, __functionAddress);
    }

    // --- [ VRSystem_GetBoolTrackedDeviceProperty ] ---

    /** {@code bool VRSystem_GetBoolTrackedDeviceProperty(TrackedDeviceIndex_t unDeviceIndex, ETrackedDeviceProperty prop, ETrackedPropertyError * pError)} */
    public static boolean nVRSystem_GetBoolTrackedDeviceProperty(int unDeviceIndex, int prop, long pError) {
        long __functionAddress = OpenVR.VRSystem.GetBoolTrackedDeviceProperty;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPZ(unDeviceIndex, prop, pError, __functionAddress);
    }

    /** {@code bool VRSystem_GetBoolTrackedDeviceProperty(TrackedDeviceIndex_t unDeviceIndex, ETrackedDeviceProperty prop, ETrackedPropertyError * pError)} */
    @NativeType("bool")
    public static boolean VRSystem_GetBoolTrackedDeviceProperty(@NativeType("TrackedDeviceIndex_t") int unDeviceIndex, @NativeType("ETrackedDeviceProperty") int prop, @NativeType("ETrackedPropertyError *") @Nullable IntBuffer pError) {
        if (CHECKS) {
            checkSafe(pError, 1);
        }
        return nVRSystem_GetBoolTrackedDeviceProperty(unDeviceIndex, prop, memAddressSafe(pError));
    }

    // --- [ VRSystem_GetFloatTrackedDeviceProperty ] ---

    /** {@code float VRSystem_GetFloatTrackedDeviceProperty(TrackedDeviceIndex_t unDeviceIndex, ETrackedDeviceProperty prop, ETrackedPropertyError * pError)} */
    public static float nVRSystem_GetFloatTrackedDeviceProperty(int unDeviceIndex, int prop, long pError) {
        long __functionAddress = OpenVR.VRSystem.GetFloatTrackedDeviceProperty;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPF(unDeviceIndex, prop, pError, __functionAddress);
    }

    /** {@code float VRSystem_GetFloatTrackedDeviceProperty(TrackedDeviceIndex_t unDeviceIndex, ETrackedDeviceProperty prop, ETrackedPropertyError * pError)} */
    public static float VRSystem_GetFloatTrackedDeviceProperty(@NativeType("TrackedDeviceIndex_t") int unDeviceIndex, @NativeType("ETrackedDeviceProperty") int prop, @NativeType("ETrackedPropertyError *") @Nullable IntBuffer pError) {
        if (CHECKS) {
            checkSafe(pError, 1);
        }
        return nVRSystem_GetFloatTrackedDeviceProperty(unDeviceIndex, prop, memAddressSafe(pError));
    }

    // --- [ VRSystem_GetInt32TrackedDeviceProperty ] ---

    /** {@code int32_t VRSystem_GetInt32TrackedDeviceProperty(TrackedDeviceIndex_t unDeviceIndex, ETrackedDeviceProperty prop, ETrackedPropertyError * pError)} */
    public static int nVRSystem_GetInt32TrackedDeviceProperty(int unDeviceIndex, int prop, long pError) {
        long __functionAddress = OpenVR.VRSystem.GetInt32TrackedDeviceProperty;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPI(unDeviceIndex, prop, pError, __functionAddress);
    }

    /** {@code int32_t VRSystem_GetInt32TrackedDeviceProperty(TrackedDeviceIndex_t unDeviceIndex, ETrackedDeviceProperty prop, ETrackedPropertyError * pError)} */
    @NativeType("int32_t")
    public static int VRSystem_GetInt32TrackedDeviceProperty(@NativeType("TrackedDeviceIndex_t") int unDeviceIndex, @NativeType("ETrackedDeviceProperty") int prop, @NativeType("ETrackedPropertyError *") @Nullable IntBuffer pError) {
        if (CHECKS) {
            checkSafe(pError, 1);
        }
        return nVRSystem_GetInt32TrackedDeviceProperty(unDeviceIndex, prop, memAddressSafe(pError));
    }

    // --- [ VRSystem_GetUint64TrackedDeviceProperty ] ---

    /** {@code uint64_t VRSystem_GetUint64TrackedDeviceProperty(TrackedDeviceIndex_t unDeviceIndex, ETrackedDeviceProperty prop, ETrackedPropertyError * pError)} */
    public static long nVRSystem_GetUint64TrackedDeviceProperty(int unDeviceIndex, int prop, long pError) {
        long __functionAddress = OpenVR.VRSystem.GetUint64TrackedDeviceProperty;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPJ(unDeviceIndex, prop, pError, __functionAddress);
    }

    /** {@code uint64_t VRSystem_GetUint64TrackedDeviceProperty(TrackedDeviceIndex_t unDeviceIndex, ETrackedDeviceProperty prop, ETrackedPropertyError * pError)} */
    @NativeType("uint64_t")
    public static long VRSystem_GetUint64TrackedDeviceProperty(@NativeType("TrackedDeviceIndex_t") int unDeviceIndex, @NativeType("ETrackedDeviceProperty") int prop, @NativeType("ETrackedPropertyError *") @Nullable IntBuffer pError) {
        if (CHECKS) {
            checkSafe(pError, 1);
        }
        return nVRSystem_GetUint64TrackedDeviceProperty(unDeviceIndex, prop, memAddressSafe(pError));
    }

    // --- [ VRSystem_GetMatrix34TrackedDeviceProperty ] ---

    /** {@code HmdMatrix34_t VRSystem_GetMatrix34TrackedDeviceProperty(TrackedDeviceIndex_t unDeviceIndex, ETrackedDeviceProperty prop, ETrackedPropertyError * pError)} */
    public static native void nVRSystem_GetMatrix34TrackedDeviceProperty(int unDeviceIndex, int prop, long pError, long __functionAddress, long __result);

    /** {@code HmdMatrix34_t VRSystem_GetMatrix34TrackedDeviceProperty(TrackedDeviceIndex_t unDeviceIndex, ETrackedDeviceProperty prop, ETrackedPropertyError * pError)} */
    public static void nVRSystem_GetMatrix34TrackedDeviceProperty(int unDeviceIndex, int prop, long pError, long __result) {
        long __functionAddress = OpenVR.VRSystem.GetMatrix34TrackedDeviceProperty;
        if (CHECKS) {
            check(__functionAddress);
        }
        nVRSystem_GetMatrix34TrackedDeviceProperty(unDeviceIndex, prop, pError, __functionAddress, __result);
    }

    /** {@code HmdMatrix34_t VRSystem_GetMatrix34TrackedDeviceProperty(TrackedDeviceIndex_t unDeviceIndex, ETrackedDeviceProperty prop, ETrackedPropertyError * pError)} */
    @NativeType("HmdMatrix34_t")
    public static HmdMatrix34 VRSystem_GetMatrix34TrackedDeviceProperty(@NativeType("TrackedDeviceIndex_t") int unDeviceIndex, @NativeType("ETrackedDeviceProperty") int prop, @NativeType("ETrackedPropertyError *") @Nullable IntBuffer pError, @NativeType("HmdMatrix34_t") HmdMatrix34 __result) {
        if (CHECKS) {
            checkSafe(pError, 1);
        }
        nVRSystem_GetMatrix34TrackedDeviceProperty(unDeviceIndex, prop, memAddressSafe(pError), __result.address());
        return __result;
    }

    // --- [ VRSystem_GetArrayTrackedDeviceProperty ] ---

    /** {@code uint32_t VRSystem_GetArrayTrackedDeviceProperty(TrackedDeviceIndex_t unDeviceIndex, ETrackedDeviceProperty prop, PropertyTypeTag_t propType, void * pBuffer, uint32_t unBufferSize, ETrackedPropertyError * pError)} */
    public static int nVRSystem_GetArrayTrackedDeviceProperty(int unDeviceIndex, int prop, int propType, long pBuffer, int unBufferSize, long pError) {
        long __functionAddress = OpenVR.VRSystem.GetArrayTrackedDeviceProperty;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPPI(unDeviceIndex, prop, propType, pBuffer, unBufferSize, pError, __functionAddress);
    }

    /** {@code uint32_t VRSystem_GetArrayTrackedDeviceProperty(TrackedDeviceIndex_t unDeviceIndex, ETrackedDeviceProperty prop, PropertyTypeTag_t propType, void * pBuffer, uint32_t unBufferSize, ETrackedPropertyError * pError)} */
    @NativeType("uint32_t")
    public static int VRSystem_GetArrayTrackedDeviceProperty(@NativeType("TrackedDeviceIndex_t") int unDeviceIndex, @NativeType("ETrackedDeviceProperty") int prop, @NativeType("PropertyTypeTag_t") int propType, @NativeType("void *") @Nullable ByteBuffer pBuffer, @NativeType("ETrackedPropertyError *") @Nullable IntBuffer pError) {
        if (CHECKS) {
            checkSafe(pError, 1);
        }
        return nVRSystem_GetArrayTrackedDeviceProperty(unDeviceIndex, prop, propType, memAddressSafe(pBuffer), remainingSafe(pBuffer), memAddressSafe(pError));
    }

    // --- [ VRSystem_GetStringTrackedDeviceProperty ] ---

    /** {@code uint32_t VRSystem_GetStringTrackedDeviceProperty(TrackedDeviceIndex_t unDeviceIndex, ETrackedDeviceProperty prop, char * pchValue, uint32_t unBufferSize, ETrackedPropertyError * pError)} */
    public static int nVRSystem_GetStringTrackedDeviceProperty(int unDeviceIndex, int prop, long pchValue, int unBufferSize, long pError) {
        long __functionAddress = OpenVR.VRSystem.GetStringTrackedDeviceProperty;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPPI(unDeviceIndex, prop, pchValue, unBufferSize, pError, __functionAddress);
    }

    /** {@code uint32_t VRSystem_GetStringTrackedDeviceProperty(TrackedDeviceIndex_t unDeviceIndex, ETrackedDeviceProperty prop, char * pchValue, uint32_t unBufferSize, ETrackedPropertyError * pError)} */
    @NativeType("uint32_t")
    public static int VRSystem_GetStringTrackedDeviceProperty(@NativeType("TrackedDeviceIndex_t") int unDeviceIndex, @NativeType("ETrackedDeviceProperty") int prop, @NativeType("char *") @Nullable ByteBuffer pchValue, @NativeType("ETrackedPropertyError *") @Nullable IntBuffer pError) {
        if (CHECKS) {
            checkSafe(pError, 1);
        }
        return nVRSystem_GetStringTrackedDeviceProperty(unDeviceIndex, prop, memAddressSafe(pchValue), remainingSafe(pchValue), memAddressSafe(pError));
    }

    /** {@code uint32_t VRSystem_GetStringTrackedDeviceProperty(TrackedDeviceIndex_t unDeviceIndex, ETrackedDeviceProperty prop, char * pchValue, uint32_t unBufferSize, ETrackedPropertyError * pError)} */
    @NativeType("uint32_t")
    public static String VRSystem_GetStringTrackedDeviceProperty(@NativeType("TrackedDeviceIndex_t") int unDeviceIndex, @NativeType("ETrackedDeviceProperty") int prop, @NativeType("uint32_t") int unBufferSize, @NativeType("ETrackedPropertyError *") @Nullable IntBuffer pError) {
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

    /** {@code uint32_t VRSystem_GetStringTrackedDeviceProperty(TrackedDeviceIndex_t unDeviceIndex, ETrackedDeviceProperty prop, char * pchValue, uint32_t unBufferSize, ETrackedPropertyError * pError)} */
    @NativeType("uint32_t")
    public static String VRSystem_GetStringTrackedDeviceProperty(@NativeType("TrackedDeviceIndex_t") int unDeviceIndex, @NativeType("ETrackedDeviceProperty") int prop, @NativeType("ETrackedPropertyError *") @Nullable IntBuffer pError) {
        return VRSystem_GetStringTrackedDeviceProperty(unDeviceIndex, prop, VR.k_unMaxPropertyStringSize, pError);
    }

    // --- [ VRSystem_GetPropErrorNameFromEnum ] ---

    /** {@code char * VRSystem_GetPropErrorNameFromEnum(ETrackedPropertyError error)} */
    public static long nVRSystem_GetPropErrorNameFromEnum(int error) {
        long __functionAddress = OpenVR.VRSystem.GetPropErrorNameFromEnum;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callP(error, __functionAddress);
    }

    /** {@code char * VRSystem_GetPropErrorNameFromEnum(ETrackedPropertyError error)} */
    @NativeType("char *")
    public static @Nullable String VRSystem_GetPropErrorNameFromEnum(@NativeType("ETrackedPropertyError") int error) {
        long __result = nVRSystem_GetPropErrorNameFromEnum(error);
        return memASCIISafe(__result);
    }

    // --- [ VRSystem_PollNextEvent ] ---

    /** {@code bool VRSystem_PollNextEvent(VREvent_t * pEvent, uint32_t uncbVREvent)} */
    public static boolean nVRSystem_PollNextEvent(long pEvent, int uncbVREvent) {
        long __functionAddress = OpenVR.VRSystem.PollNextEvent;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPZ(pEvent, uncbVREvent, __functionAddress);
    }

    /** {@code bool VRSystem_PollNextEvent(VREvent_t * pEvent, uint32_t uncbVREvent)} */
    @NativeType("bool")
    public static boolean VRSystem_PollNextEvent(@NativeType("VREvent_t *") VREvent pEvent, @NativeType("uint32_t") int uncbVREvent) {
        return nVRSystem_PollNextEvent(pEvent.address(), uncbVREvent);
    }

    /** {@code bool VRSystem_PollNextEvent(VREvent_t * pEvent, uint32_t uncbVREvent)} */
    @NativeType("bool")
    public static boolean VRSystem_PollNextEvent(@NativeType("VREvent_t *") VREvent pEvent) {
        return nVRSystem_PollNextEvent(pEvent.address(), VREvent.SIZEOF);
    }

    // --- [ VRSystem_PollNextEventWithPose ] ---

    /** {@code bool VRSystem_PollNextEventWithPose(ETrackingUniverseOrigin eOrigin, VREvent_t * pEvent, uint32_t uncbVREvent, TrackedDevicePose_t * pTrackedDevicePose)} */
    public static boolean nVRSystem_PollNextEventWithPose(int eOrigin, long pEvent, int uncbVREvent, long pTrackedDevicePose) {
        long __functionAddress = OpenVR.VRSystem.PollNextEventWithPose;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPPZ(eOrigin, pEvent, uncbVREvent, pTrackedDevicePose, __functionAddress);
    }

    /** {@code bool VRSystem_PollNextEventWithPose(ETrackingUniverseOrigin eOrigin, VREvent_t * pEvent, uint32_t uncbVREvent, TrackedDevicePose_t * pTrackedDevicePose)} */
    @NativeType("bool")
    public static boolean VRSystem_PollNextEventWithPose(@NativeType("ETrackingUniverseOrigin") int eOrigin, @NativeType("VREvent_t *") VREvent pEvent, @NativeType("uint32_t") int uncbVREvent, @NativeType("TrackedDevicePose_t *") TrackedDevicePose pTrackedDevicePose) {
        return nVRSystem_PollNextEventWithPose(eOrigin, pEvent.address(), uncbVREvent, pTrackedDevicePose.address());
    }

    /** {@code bool VRSystem_PollNextEventWithPose(ETrackingUniverseOrigin eOrigin, VREvent_t * pEvent, uint32_t uncbVREvent, TrackedDevicePose_t * pTrackedDevicePose)} */
    @NativeType("bool")
    public static boolean VRSystem_PollNextEventWithPose(@NativeType("ETrackingUniverseOrigin") int eOrigin, @NativeType("VREvent_t *") VREvent pEvent, @NativeType("TrackedDevicePose_t *") TrackedDevicePose pTrackedDevicePose) {
        return nVRSystem_PollNextEventWithPose(eOrigin, pEvent.address(), VREvent.SIZEOF, pTrackedDevicePose.address());
    }

    // --- [ VRSystem_GetEventTypeNameFromEnum ] ---

    /** {@code char * VRSystem_GetEventTypeNameFromEnum(EVREventType eType)} */
    public static long nVRSystem_GetEventTypeNameFromEnum(int eType) {
        long __functionAddress = OpenVR.VRSystem.GetEventTypeNameFromEnum;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callP(eType, __functionAddress);
    }

    /** {@code char * VRSystem_GetEventTypeNameFromEnum(EVREventType eType)} */
    @NativeType("char *")
    public static @Nullable String VRSystem_GetEventTypeNameFromEnum(@NativeType("EVREventType") int eType) {
        long __result = nVRSystem_GetEventTypeNameFromEnum(eType);
        return memASCIISafe(__result);
    }

    // --- [ VRSystem_GetHiddenAreaMesh ] ---

    /** {@code HiddenAreaMesh_t VRSystem_GetHiddenAreaMesh(EVREye eEye, EHiddenAreaMeshType type)} */
    public static native void nVRSystem_GetHiddenAreaMesh(int eEye, int type, long __functionAddress, long __result);

    /** {@code HiddenAreaMesh_t VRSystem_GetHiddenAreaMesh(EVREye eEye, EHiddenAreaMeshType type)} */
    public static void nVRSystem_GetHiddenAreaMesh(int eEye, int type, long __result) {
        long __functionAddress = OpenVR.VRSystem.GetHiddenAreaMesh;
        if (CHECKS) {
            check(__functionAddress);
        }
        nVRSystem_GetHiddenAreaMesh(eEye, type, __functionAddress, __result);
    }

    /** {@code HiddenAreaMesh_t VRSystem_GetHiddenAreaMesh(EVREye eEye, EHiddenAreaMeshType type)} */
    @NativeType("HiddenAreaMesh_t")
    public static HiddenAreaMesh VRSystem_GetHiddenAreaMesh(@NativeType("EVREye") int eEye, @NativeType("EHiddenAreaMeshType") int type, @NativeType("HiddenAreaMesh_t") HiddenAreaMesh __result) {
        nVRSystem_GetHiddenAreaMesh(eEye, type, __result.address());
        return __result;
    }

    // --- [ VRSystem_GetControllerState ] ---

    /** {@code bool VRSystem_GetControllerState(TrackedDeviceIndex_t unControllerDeviceIndex, VRControllerState_t * pControllerState, uint32_t unControllerStateSize)} */
    public static boolean nVRSystem_GetControllerState(int unControllerDeviceIndex, long pControllerState, int unControllerStateSize) {
        long __functionAddress = OpenVR.VRSystem.GetControllerState;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPZ(unControllerDeviceIndex, pControllerState, unControllerStateSize, __functionAddress);
    }

    /** {@code bool VRSystem_GetControllerState(TrackedDeviceIndex_t unControllerDeviceIndex, VRControllerState_t * pControllerState, uint32_t unControllerStateSize)} */
    @NativeType("bool")
    public static boolean VRSystem_GetControllerState(@NativeType("TrackedDeviceIndex_t") int unControllerDeviceIndex, @NativeType("VRControllerState_t *") VRControllerState pControllerState, @NativeType("uint32_t") int unControllerStateSize) {
        return nVRSystem_GetControllerState(unControllerDeviceIndex, pControllerState.address(), unControllerStateSize);
    }

    /** {@code bool VRSystem_GetControllerState(TrackedDeviceIndex_t unControllerDeviceIndex, VRControllerState_t * pControllerState, uint32_t unControllerStateSize)} */
    @NativeType("bool")
    public static boolean VRSystem_GetControllerState(@NativeType("TrackedDeviceIndex_t") int unControllerDeviceIndex, @NativeType("VRControllerState_t *") VRControllerState pControllerState) {
        return nVRSystem_GetControllerState(unControllerDeviceIndex, pControllerState.address(), VRControllerState.SIZEOF);
    }

    // --- [ VRSystem_GetControllerStateWithPose ] ---

    /** {@code bool VRSystem_GetControllerStateWithPose(ETrackingUniverseOrigin eOrigin, TrackedDeviceIndex_t unControllerDeviceIndex, VRControllerState_t * pControllerState, uint32_t unControllerStateSize, TrackedDevicePose_t * pTrackedDevicePose)} */
    public static boolean nVRSystem_GetControllerStateWithPose(int eOrigin, int unControllerDeviceIndex, long pControllerState, int unControllerStateSize, long pTrackedDevicePose) {
        long __functionAddress = OpenVR.VRSystem.GetControllerStateWithPose;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPPZ(eOrigin, unControllerDeviceIndex, pControllerState, unControllerStateSize, pTrackedDevicePose, __functionAddress);
    }

    /** {@code bool VRSystem_GetControllerStateWithPose(ETrackingUniverseOrigin eOrigin, TrackedDeviceIndex_t unControllerDeviceIndex, VRControllerState_t * pControllerState, uint32_t unControllerStateSize, TrackedDevicePose_t * pTrackedDevicePose)} */
    @NativeType("bool")
    public static boolean VRSystem_GetControllerStateWithPose(@NativeType("ETrackingUniverseOrigin") int eOrigin, @NativeType("TrackedDeviceIndex_t") int unControllerDeviceIndex, @NativeType("VRControllerState_t *") VRControllerState pControllerState, @NativeType("uint32_t") int unControllerStateSize, @NativeType("TrackedDevicePose_t *") TrackedDevicePose pTrackedDevicePose) {
        return nVRSystem_GetControllerStateWithPose(eOrigin, unControllerDeviceIndex, pControllerState.address(), unControllerStateSize, pTrackedDevicePose.address());
    }

    /** {@code bool VRSystem_GetControllerStateWithPose(ETrackingUniverseOrigin eOrigin, TrackedDeviceIndex_t unControllerDeviceIndex, VRControllerState_t * pControllerState, uint32_t unControllerStateSize, TrackedDevicePose_t * pTrackedDevicePose)} */
    @NativeType("bool")
    public static boolean VRSystem_GetControllerStateWithPose(@NativeType("ETrackingUniverseOrigin") int eOrigin, @NativeType("TrackedDeviceIndex_t") int unControllerDeviceIndex, @NativeType("VRControllerState_t *") VRControllerState pControllerState, @NativeType("TrackedDevicePose_t *") TrackedDevicePose pTrackedDevicePose) {
        return nVRSystem_GetControllerStateWithPose(eOrigin, unControllerDeviceIndex, pControllerState.address(), VRControllerState.SIZEOF, pTrackedDevicePose.address());
    }

    // --- [ VRSystem_TriggerHapticPulse ] ---

    /** {@code void VRSystem_TriggerHapticPulse(TrackedDeviceIndex_t unControllerDeviceIndex, uint32_t unAxisId, unsigned short usDurationMicroSec)} */
    public static void VRSystem_TriggerHapticPulse(@NativeType("TrackedDeviceIndex_t") int unControllerDeviceIndex, @NativeType("uint32_t") int unAxisId, @NativeType("unsigned short") short usDurationMicroSec) {
        long __functionAddress = OpenVR.VRSystem.TriggerHapticPulse;
        if (CHECKS) {
            check(__functionAddress);
        }
        callCV(unControllerDeviceIndex, unAxisId, usDurationMicroSec, __functionAddress);
    }

    // --- [ VRSystem_GetButtonIdNameFromEnum ] ---

    /** {@code char * VRSystem_GetButtonIdNameFromEnum(EVRButtonId eButtonId)} */
    public static long nVRSystem_GetButtonIdNameFromEnum(int eButtonId) {
        long __functionAddress = OpenVR.VRSystem.GetButtonIdNameFromEnum;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callP(eButtonId, __functionAddress);
    }

    /** {@code char * VRSystem_GetButtonIdNameFromEnum(EVRButtonId eButtonId)} */
    @NativeType("char *")
    public static @Nullable String VRSystem_GetButtonIdNameFromEnum(@NativeType("EVRButtonId") int eButtonId) {
        long __result = nVRSystem_GetButtonIdNameFromEnum(eButtonId);
        return memASCIISafe(__result);
    }

    // --- [ VRSystem_GetControllerAxisTypeNameFromEnum ] ---

    /** {@code char * VRSystem_GetControllerAxisTypeNameFromEnum(EVRControllerAxisType eAxisType)} */
    public static long nVRSystem_GetControllerAxisTypeNameFromEnum(int eAxisType) {
        long __functionAddress = OpenVR.VRSystem.GetControllerAxisTypeNameFromEnum;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callP(eAxisType, __functionAddress);
    }

    /** {@code char * VRSystem_GetControllerAxisTypeNameFromEnum(EVRControllerAxisType eAxisType)} */
    @NativeType("char *")
    public static @Nullable String VRSystem_GetControllerAxisTypeNameFromEnum(@NativeType("EVRControllerAxisType") int eAxisType) {
        long __result = nVRSystem_GetControllerAxisTypeNameFromEnum(eAxisType);
        return memASCIISafe(__result);
    }

    // --- [ VRSystem_IsInputAvailable ] ---

    /** {@code bool VRSystem_IsInputAvailable(void)} */
    @NativeType("bool")
    public static boolean VRSystem_IsInputAvailable() {
        long __functionAddress = OpenVR.VRSystem.IsInputAvailable;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callZ(__functionAddress);
    }

    // --- [ VRSystem_IsSteamVRDrawingControllers ] ---

    /** {@code bool VRSystem_IsSteamVRDrawingControllers(void)} */
    @NativeType("bool")
    public static boolean VRSystem_IsSteamVRDrawingControllers() {
        long __functionAddress = OpenVR.VRSystem.IsSteamVRDrawingControllers;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callZ(__functionAddress);
    }

    // --- [ VRSystem_ShouldApplicationPause ] ---

    /** {@code bool VRSystem_ShouldApplicationPause(void)} */
    @NativeType("bool")
    public static boolean VRSystem_ShouldApplicationPause() {
        long __functionAddress = OpenVR.VRSystem.ShouldApplicationPause;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callZ(__functionAddress);
    }

    // --- [ VRSystem_ShouldApplicationReduceRenderingWork ] ---

    /** {@code bool VRSystem_ShouldApplicationReduceRenderingWork(void)} */
    @NativeType("bool")
    public static boolean VRSystem_ShouldApplicationReduceRenderingWork() {
        long __functionAddress = OpenVR.VRSystem.ShouldApplicationReduceRenderingWork;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callZ(__functionAddress);
    }

    // --- [ VRSystem_PerformFirmwareUpdate ] ---

    /** {@code EVRFirmwareError VRSystem_PerformFirmwareUpdate(TrackedDeviceIndex_t unDeviceIndex)} */
    @NativeType("EVRFirmwareError")
    public static int VRSystem_PerformFirmwareUpdate(@NativeType("TrackedDeviceIndex_t") int unDeviceIndex) {
        long __functionAddress = OpenVR.VRSystem.PerformFirmwareUpdate;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callI(unDeviceIndex, __functionAddress);
    }

    // --- [ VRSystem_AcknowledgeQuit_Exiting ] ---

    /** {@code void VRSystem_AcknowledgeQuit_Exiting(void)} */
    public static void VRSystem_AcknowledgeQuit_Exiting() {
        long __functionAddress = OpenVR.VRSystem.AcknowledgeQuit_Exiting;
        if (CHECKS) {
            check(__functionAddress);
        }
        callV(__functionAddress);
    }

    // --- [ VRSystem_GetAppContainerFilePaths ] ---

    /** {@code uint32_t VRSystem_GetAppContainerFilePaths(char * pchBuffer, uint32_t unBufferSize)} */
    public static int nVRSystem_GetAppContainerFilePaths(long pchBuffer, int unBufferSize) {
        long __functionAddress = OpenVR.VRSystem.GetAppContainerFilePaths;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPI(pchBuffer, unBufferSize, __functionAddress);
    }

    /** {@code uint32_t VRSystem_GetAppContainerFilePaths(char * pchBuffer, uint32_t unBufferSize)} */
    @NativeType("uint32_t")
    public static int VRSystem_GetAppContainerFilePaths(@NativeType("char *") @Nullable ByteBuffer pchBuffer) {
        return nVRSystem_GetAppContainerFilePaths(memAddressSafe(pchBuffer), remainingSafe(pchBuffer));
    }

    /** {@code uint32_t VRSystem_GetAppContainerFilePaths(char * pchBuffer, uint32_t unBufferSize)} */
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

    /** {@code char * VRSystem_GetRuntimeVersion(void)} */
    public static long nVRSystem_GetRuntimeVersion() {
        long __functionAddress = OpenVR.VRSystem.GetRuntimeVersion;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callP(__functionAddress);
    }

    /** {@code char * VRSystem_GetRuntimeVersion(void)} */
    @NativeType("char *")
    public static @Nullable String VRSystem_GetRuntimeVersion() {
        long __result = nVRSystem_GetRuntimeVersion();
        return memASCIISafe(__result);
    }

}