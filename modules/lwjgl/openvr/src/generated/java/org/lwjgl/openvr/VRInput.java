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

public class VRInput {

    protected VRInput() {
        throw new UnsupportedOperationException();
    }

    // --- [ VRInput_SetActionManifestPath ] ---

    /** Unsafe version of: {@link #VRInput_SetActionManifestPath SetActionManifestPath} */
    public static int nVRInput_SetActionManifestPath(long pchActionManifestPath) {
        long __functionAddress = OpenVR.VRInput.SetActionManifestPath;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPI(__functionAddress, pchActionManifestPath);
    }

    /**
     * Sets the path to the action manifest JSON file that is used by this application. If this information was set on the Steam partner site, calls to this
     * function are ignored. If the Steam partner site setting and the path provided by this call are different,
     * {@link VR#EVRInputError_VRInputError_MismatchedActionManifest} is returned.
     * 
     * <p>This call must be made before the first call to {@link #VRInput_UpdateActionState UpdateActionState} or {@link VRSystem#VRSystem_PollNextEvent PollNextEvent}.</p>
     */
    @NativeType("EVRInputError")
    public static int VRInput_SetActionManifestPath(@NativeType("char const *") ByteBuffer pchActionManifestPath) {
        if (CHECKS) {
            checkNT1(pchActionManifestPath);
        }
        return nVRInput_SetActionManifestPath(memAddress(pchActionManifestPath));
    }

    /**
     * Sets the path to the action manifest JSON file that is used by this application. If this information was set on the Steam partner site, calls to this
     * function are ignored. If the Steam partner site setting and the path provided by this call are different,
     * {@link VR#EVRInputError_VRInputError_MismatchedActionManifest} is returned.
     * 
     * <p>This call must be made before the first call to {@link #VRInput_UpdateActionState UpdateActionState} or {@link VRSystem#VRSystem_PollNextEvent PollNextEvent}.</p>
     */
    @NativeType("EVRInputError")
    public static int VRInput_SetActionManifestPath(@NativeType("char const *") CharSequence pchActionManifestPath) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            ByteBuffer pchActionManifestPathEncoded = stack.ASCII(pchActionManifestPath);
            return nVRInput_SetActionManifestPath(memAddress(pchActionManifestPathEncoded));
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ VRInput_GetActionSetHandle ] ---

    /** Unsafe version of: {@link #VRInput_GetActionSetHandle GetActionSetHandle} */
    public static int nVRInput_GetActionSetHandle(long pchActionSetName, long pHandle) {
        long __functionAddress = OpenVR.VRInput.GetActionSetHandle;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPPI(__functionAddress, pchActionSetName, pHandle);
    }

    /** Returns a handle for an action set. This handle is used for all performance-sensitive calls. */
    @NativeType("EVRInputError")
    public static int VRInput_GetActionSetHandle(@NativeType("char const *") ByteBuffer pchActionSetName, @NativeType("VRActionSetHandle_t *") LongBuffer pHandle) {
        if (CHECKS) {
            checkNT1(pchActionSetName);
            check(pHandle, 1);
        }
        return nVRInput_GetActionSetHandle(memAddress(pchActionSetName), memAddress(pHandle));
    }

    /** Returns a handle for an action set. This handle is used for all performance-sensitive calls. */
    @NativeType("EVRInputError")
    public static int VRInput_GetActionSetHandle(@NativeType("char const *") CharSequence pchActionSetName, @NativeType("VRActionSetHandle_t *") LongBuffer pHandle) {
        if (CHECKS) {
            check(pHandle, 1);
        }
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            ByteBuffer pchActionSetNameEncoded = stack.ASCII(pchActionSetName);
            return nVRInput_GetActionSetHandle(memAddress(pchActionSetNameEncoded), memAddress(pHandle));
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ VRInput_GetActionHandle ] ---

    /** Unsafe version of: {@link #VRInput_GetActionHandle GetActionHandle} */
    public static int nVRInput_GetActionHandle(long pchActionName, long pHandle) {
        long __functionAddress = OpenVR.VRInput.GetActionHandle;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPPI(__functionAddress, pchActionName, pHandle);
    }

    /** Returns a handle for an action. This handle is used for all performance-sensitive calls. */
    @NativeType("EVRInputError")
    public static int VRInput_GetActionHandle(@NativeType("char const *") ByteBuffer pchActionName, @NativeType("VRActionHandle_t *") LongBuffer pHandle) {
        if (CHECKS) {
            checkNT1(pchActionName);
            check(pHandle, 1);
        }
        return nVRInput_GetActionHandle(memAddress(pchActionName), memAddress(pHandle));
    }

    /** Returns a handle for an action. This handle is used for all performance-sensitive calls. */
    @NativeType("EVRInputError")
    public static int VRInput_GetActionHandle(@NativeType("char const *") CharSequence pchActionName, @NativeType("VRActionHandle_t *") LongBuffer pHandle) {
        if (CHECKS) {
            check(pHandle, 1);
        }
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            ByteBuffer pchActionNameEncoded = stack.ASCII(pchActionName);
            return nVRInput_GetActionHandle(memAddress(pchActionNameEncoded), memAddress(pHandle));
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ VRInput_GetInputSourceHandle ] ---

    /** Unsafe version of: {@link #VRInput_GetInputSourceHandle GetInputSourceHandle} */
    public static int nVRInput_GetInputSourceHandle(long pchInputSourcePath, long pHandle) {
        long __functionAddress = OpenVR.VRInput.GetInputSourceHandle;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPPI(__functionAddress, pchInputSourcePath, pHandle);
    }

    /** Returns a handle for any path in the input system. E.g. {@code /user/hand/right}. */
    @NativeType("EVRInputError")
    public static int VRInput_GetInputSourceHandle(@NativeType("char const *") ByteBuffer pchInputSourcePath, @NativeType("VRInputValueHandle_t *") LongBuffer pHandle) {
        if (CHECKS) {
            checkNT1(pchInputSourcePath);
            check(pHandle, 1);
        }
        return nVRInput_GetInputSourceHandle(memAddress(pchInputSourcePath), memAddress(pHandle));
    }

    /** Returns a handle for any path in the input system. E.g. {@code /user/hand/right}. */
    @NativeType("EVRInputError")
    public static int VRInput_GetInputSourceHandle(@NativeType("char const *") CharSequence pchInputSourcePath, @NativeType("VRInputValueHandle_t *") LongBuffer pHandle) {
        if (CHECKS) {
            check(pHandle, 1);
        }
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            ByteBuffer pchInputSourcePathEncoded = stack.ASCII(pchInputSourcePath);
            return nVRInput_GetInputSourceHandle(memAddress(pchInputSourcePathEncoded), memAddress(pHandle));
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ VRInput_UpdateActionState ] ---

    /** Unsafe version of: {@link #VRInput_UpdateActionState UpdateActionState} */
    public static int nVRInput_UpdateActionState(long pSets, int unSizeOfVRSelectedActionSet_t, int unSetCount) {
        long __functionAddress = OpenVR.VRInput.UpdateActionState;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPI(__functionAddress, pSets, unSizeOfVRSelectedActionSet_t, unSetCount);
    }

    /**
     * Reads the current state into all actions. After this call, the results of {@code Get*Action} calls will be the same until the next call to
     * {@code UpdateActionState}.
     */
    @NativeType("EVRInputError")
    public static int VRInput_UpdateActionState(@NativeType("VRActiveActionSet_t *") VRActiveActionSet.Buffer pSets, @NativeType("uint32_t") int unSizeOfVRSelectedActionSet_t) {
        return nVRInput_UpdateActionState(pSets.address(), unSizeOfVRSelectedActionSet_t, pSets.remaining());
    }

    // --- [ VRInput_GetDigitalActionData ] ---

    /** Unsafe version of: {@link #VRInput_GetDigitalActionData GetDigitalActionData} */
    public static int nVRInput_GetDigitalActionData(long action, long pActionData, int unActionDataSize, long ulRestrictToDevice) {
        long __functionAddress = OpenVR.VRInput.GetDigitalActionData;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callJPJI(__functionAddress, action, pActionData, unActionDataSize, ulRestrictToDevice);
    }

    /**
     * Reads the state of a digital action given its handle. This will return {@link VR#EVRInputError_VRInputError_WrongType} if the type of action is something other
     * than digital.
     */
    @NativeType("EVRInputError")
    public static int VRInput_GetDigitalActionData(@NativeType("VRActionHandle_t") long action, @NativeType("InputDigitalActionData_t *") InputDigitalActionData.Buffer pActionData, @NativeType("VRInputValueHandle_t") long ulRestrictToDevice) {
        return nVRInput_GetDigitalActionData(action, pActionData.address(), pActionData.remaining(), ulRestrictToDevice);
    }

    // --- [ VRInput_GetAnalogActionData ] ---

    /** Unsafe version of: {@link #VRInput_GetAnalogActionData GetAnalogActionData} */
    public static int nVRInput_GetAnalogActionData(long action, long pActionData, int unActionDataSize, long ulRestrictToDevice) {
        long __functionAddress = OpenVR.VRInput.GetAnalogActionData;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callJPJI(__functionAddress, action, pActionData, unActionDataSize, ulRestrictToDevice);
    }

    /**
     * Reads the state of an analog action given its handle. This will return {@link VR#EVRInputError_VRInputError_WrongType} if the type of action is something other
     * than analog.
     */
    @NativeType("EVRInputError")
    public static int VRInput_GetAnalogActionData(@NativeType("VRActionHandle_t") long action, @NativeType("InputAnalogActionData_t *") InputAnalogActionData.Buffer pActionData, @NativeType("VRInputValueHandle_t") long ulRestrictToDevice) {
        return nVRInput_GetAnalogActionData(action, pActionData.address(), pActionData.remaining(), ulRestrictToDevice);
    }

    // --- [ VRInput_GetPoseActionData ] ---

    /** Unsafe version of: {@link #VRInput_GetPoseActionData GetPoseActionData} */
    public static int nVRInput_GetPoseActionData(long action, int eOrigin, float fPredictedSecondsFromNow, long pActionData, int unActionDataSize, long ulRestrictToDevice) {
        long __functionAddress = OpenVR.VRInput.GetPoseActionData;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callJPJI(__functionAddress, action, eOrigin, fPredictedSecondsFromNow, pActionData, unActionDataSize, ulRestrictToDevice);
    }

    /**
     * Reads the state of a pose action given its handle.
     *
     * @param eOrigin one of:<br><table><tr><td>{@link VR#ETrackingUniverseOrigin_TrackingUniverseSeated}</td></tr><tr><td>{@link VR#ETrackingUniverseOrigin_TrackingUniverseStanding}</td></tr><tr><td>{@link VR#ETrackingUniverseOrigin_TrackingUniverseRawAndUncalibrated}</td></tr></table>
     */
    @NativeType("EVRInputError")
    public static int VRInput_GetPoseActionData(@NativeType("VRActionHandle_t") long action, @NativeType("ETrackingUniverseOrigin") int eOrigin, float fPredictedSecondsFromNow, @NativeType("InputPoseActionData_t *") InputPoseActionData.Buffer pActionData, @NativeType("VRInputValueHandle_t") long ulRestrictToDevice) {
        return nVRInput_GetPoseActionData(action, eOrigin, fPredictedSecondsFromNow, pActionData.address(), pActionData.remaining(), ulRestrictToDevice);
    }

    // --- [ VRInput_GetSkeletalActionData ] ---

    /** Unsafe version of: {@link #VRInput_GetSkeletalActionData GetSkeletalActionData} */
    public static int nVRInput_GetSkeletalActionData(long action, long pActionData, int unActionDataSize, long ulRestrictToDevice) {
        long __functionAddress = OpenVR.VRInput.GetSkeletalActionData;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callJPJI(__functionAddress, action, pActionData, unActionDataSize, ulRestrictToDevice);
    }

    /** Reads the state of a skeletal action given its handle. */
    @NativeType("EVRInputError")
    public static int VRInput_GetSkeletalActionData(@NativeType("VRActionHandle_t") long action, @NativeType("InputSkeletalActionData_t *") InputSkeletalActionData.Buffer pActionData, @NativeType("VRInputValueHandle_t") long ulRestrictToDevice) {
        return nVRInput_GetSkeletalActionData(action, pActionData.address(), pActionData.remaining(), ulRestrictToDevice);
    }

    // --- [ VRInput_GetSkeletalBoneData ] ---

    /** Unsafe version of: {@link #VRInput_GetSkeletalBoneData GetSkeletalBoneData} */
    public static int nVRInput_GetSkeletalBoneData(long action, int eTransformSpace, int eMotionRange, long pTransformArray, int unTransformArrayCount, long ulRestrictToDevice) {
        long __functionAddress = OpenVR.VRInput.GetSkeletalBoneData;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callJPJI(__functionAddress, action, eTransformSpace, eMotionRange, pTransformArray, unTransformArrayCount, ulRestrictToDevice);
    }

    /**
     * Reads the state of the skeletal bone data associated with this action and copies it into the given buffer.
     *
     * @param eTransformSpace one of:<br><table><tr><td>{@link VR#EVRSkeletalTransformSpace_VRSkeletalTransformSpace_Model}</td></tr><tr><td>{@link VR#EVRSkeletalTransformSpace_VRSkeletalTransformSpace_Parent}</td></tr><tr><td>{@link VR#EVRSkeletalTransformSpace_VRSkeletalTransformSpace_Additive}</td></tr></table>
     * @param eMotionRange    one of:<br><table><tr><td>{@link VR#EVRSkeletalMotionRange_VRSkeletalMotionRange_WithController}</td></tr><tr><td>{@link VR#EVRSkeletalMotionRange_VRSkeletalMotionRange_WithoutController}</td></tr></table>
     */
    @NativeType("EVRInputError")
    public static int VRInput_GetSkeletalBoneData(@NativeType("VRActionHandle_t") long action, @NativeType("EVRSkeletalTransformSpace") int eTransformSpace, @NativeType("EVRSkeletalMotionRange") int eMotionRange, @NativeType("VRBoneTransform_t *") VRBoneTransform.Buffer pTransformArray, @NativeType("VRInputValueHandle_t") long ulRestrictToDevice) {
        return nVRInput_GetSkeletalBoneData(action, eTransformSpace, eMotionRange, pTransformArray.address(), pTransformArray.remaining(), ulRestrictToDevice);
    }

    // --- [ VRInput_GetSkeletalBoneDataCompressed ] ---

    /** Unsafe version of: {@link #VRInput_GetSkeletalBoneDataCompressed GetSkeletalBoneDataCompressed} */
    public static int nVRInput_GetSkeletalBoneDataCompressed(long action, int eTransformSpace, int eMotionRange, long pvCompressedData, int unCompressedSize, long punRequiredCompressedSize, long ulRestrictToDevice) {
        long __functionAddress = OpenVR.VRInput.GetSkeletalBoneDataCompressed;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callJPPJI(__functionAddress, action, eTransformSpace, eMotionRange, pvCompressedData, unCompressedSize, punRequiredCompressedSize, ulRestrictToDevice);
    }

    /**
     * Reads the state of the skeletal bone data in a compressed form that is suitable for sending over the network. The required buffer size will never
     * exceed ({@code sizeof(VR_BoneTransform_t)*boneCount + 2}). Usually the size will be much smaller.
     *
     * @param eTransformSpace one of:<br><table><tr><td>{@link VR#EVRSkeletalTransformSpace_VRSkeletalTransformSpace_Model}</td></tr><tr><td>{@link VR#EVRSkeletalTransformSpace_VRSkeletalTransformSpace_Parent}</td></tr><tr><td>{@link VR#EVRSkeletalTransformSpace_VRSkeletalTransformSpace_Additive}</td></tr></table>
     * @param eMotionRange    one of:<br><table><tr><td>{@link VR#EVRSkeletalMotionRange_VRSkeletalMotionRange_WithController}</td></tr><tr><td>{@link VR#EVRSkeletalMotionRange_VRSkeletalMotionRange_WithoutController}</td></tr></table>
     */
    @NativeType("EVRInputError")
    public static int VRInput_GetSkeletalBoneDataCompressed(@NativeType("VRActionHandle_t") long action, @NativeType("EVRSkeletalTransformSpace") int eTransformSpace, @NativeType("EVRSkeletalMotionRange") int eMotionRange, @Nullable @NativeType("void *") ByteBuffer pvCompressedData, @Nullable @NativeType("uint32_t *") IntBuffer punRequiredCompressedSize, @NativeType("VRInputValueHandle_t") long ulRestrictToDevice) {
        if (CHECKS) {
            checkSafe(punRequiredCompressedSize, 1);
        }
        return nVRInput_GetSkeletalBoneDataCompressed(action, eTransformSpace, eMotionRange, memAddressSafe(pvCompressedData), remainingSafe(pvCompressedData), memAddressSafe(punRequiredCompressedSize), ulRestrictToDevice);
    }

    // --- [ VRInput_UncompressSkeletalActionData ] ---

    /** Unsafe version of: {@link #VRInput_UncompressSkeletalActionData UncompressSkeletalActionData} */
    public static int nVRInput_UncompressSkeletalActionData(long pvCompressedBuffer, int unCompressedBufferSize, long peTransformSpace, long pTransformArray, int unTransformArrayCount) {
        long __functionAddress = OpenVR.VRInput.UncompressSkeletalActionData;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPPPI(__functionAddress, pvCompressedBuffer, unCompressedBufferSize, peTransformSpace, pTransformArray, unTransformArrayCount);
    }

    /** Turns a compressed buffer from {@link #VRInput_GetSkeletalBoneDataCompressed GetSkeletalBoneDataCompressed} and turns it back into a bone transform array. */
    @NativeType("EVRInputError")
    public static int VRInput_UncompressSkeletalActionData(@NativeType("void *") ByteBuffer pvCompressedBuffer, @NativeType("EVRSkeletalTransformSpace *") IntBuffer peTransformSpace, @NativeType("VRBoneTransform_t *") VRBoneTransform.Buffer pTransformArray) {
        if (CHECKS) {
            check(peTransformSpace, 1);
        }
        return nVRInput_UncompressSkeletalActionData(memAddress(pvCompressedBuffer), pvCompressedBuffer.remaining(), memAddress(peTransformSpace), pTransformArray.address(), pTransformArray.remaining());
    }

    // --- [ VRInput_TriggerHapticVibrationAction ] ---

    /** Triggers a haptic event as described by the specified action. */
    @NativeType("EVRInputError")
    public static int VRInput_TriggerHapticVibrationAction(@NativeType("VRActionHandle_t") long action, float fStartSecondsFromNow, float fDurationSeconds, float fFrequency, float fAmplitude, @NativeType("VRInputValueHandle_t") long ulRestrictToDevice) {
        long __functionAddress = OpenVR.VRInput.TriggerHapticVibrationAction;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callJJI(__functionAddress, action, fStartSecondsFromNow, fDurationSeconds, fFrequency, fAmplitude, ulRestrictToDevice);
    }

    // --- [ VRInput_GetActionOrigins ] ---

    /** Unsafe version of: {@link #VRInput_GetActionOrigins GetActionOrigins} */
    public static int nVRInput_GetActionOrigins(long actionSetHandle, long digitalActionHandle, long originsOut, int originOutCount) {
        long __functionAddress = OpenVR.VRInput.GetActionOrigins;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callJJPI(__functionAddress, actionSetHandle, digitalActionHandle, originsOut, originOutCount);
    }

    /** Retrieve origin handles for an action. */
    @NativeType("EVRInputError")
    public static int VRInput_GetActionOrigins(@NativeType("VRActionSetHandle_t") long actionSetHandle, @NativeType("VRActionHandle_t") long digitalActionHandle, @NativeType("VRInputValueHandle_t *") LongBuffer originsOut) {
        return nVRInput_GetActionOrigins(actionSetHandle, digitalActionHandle, memAddress(originsOut), originsOut.remaining());
    }

    // --- [ VRInput_GetOriginLocalizedName ] ---

    /** Unsafe version of: {@link #VRInput_GetOriginLocalizedName GetOriginLocalizedName} */
    public static int nVRInput_GetOriginLocalizedName(long origin, long pchNameArray, int unNameArraySize) {
        long __functionAddress = OpenVR.VRInput.GetOriginLocalizedName;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callJPI(__functionAddress, origin, pchNameArray, unNameArraySize);
    }

    /** Retrieves the name of the origin in the current language. */
    @NativeType("EVRInputError")
    public static int VRInput_GetOriginLocalizedName(@NativeType("VRInputValueHandle_t") long origin, @NativeType("char *") ByteBuffer pchNameArray) {
        return nVRInput_GetOriginLocalizedName(origin, memAddress(pchNameArray), pchNameArray.remaining());
    }

    // --- [ VRInput_GetOriginTrackedDeviceInfo ] ---

    /** Unsafe version of: {@link #VRInput_GetOriginTrackedDeviceInfo GetOriginTrackedDeviceInfo} */
    public static int nVRInput_GetOriginTrackedDeviceInfo(long origin, long pOriginInfo, int unOriginInfoSize) {
        long __functionAddress = OpenVR.VRInput.GetOriginTrackedDeviceInfo;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callJPI(__functionAddress, origin, pOriginInfo, unOriginInfoSize);
    }

    /** Retrieves useful information for the origin of this action. */
    @NativeType("EVRInputError")
    public static int VRInput_GetOriginTrackedDeviceInfo(@NativeType("VRInputValueHandle_t") long origin, @NativeType("InputOriginInfo_t *") InputOriginInfo.Buffer pOriginInfo) {
        return nVRInput_GetOriginTrackedDeviceInfo(origin, pOriginInfo.address(), pOriginInfo.remaining());
    }

    // --- [ VRInput_ShowActionOrigins ] ---

    /** Shows the current binding for the action in-headset. */
    @NativeType("EVRInputError")
    public static int VRInput_ShowActionOrigins(@NativeType("VRActionSetHandle_t") long actionSetHandle, @NativeType("VRActionHandle_t") long ulActionHandle) {
        long __functionAddress = OpenVR.VRInput.ShowActionOrigins;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callJJI(__functionAddress, actionSetHandle, ulActionHandle);
    }

    // --- [ VRInput_ShowBindingsForActionSet ] ---

    /** Unsafe version of: {@link #VRInput_ShowBindingsForActionSet ShowBindingsForActionSet} */
    public static int nVRInput_ShowBindingsForActionSet(long pSets, int unSizeOfVRSelectedActionSet_t, int unSetCount, long originToHighlight) {
        long __functionAddress = OpenVR.VRInput.ShowBindingsForActionSet;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPJI(__functionAddress, pSets, unSizeOfVRSelectedActionSet_t, unSetCount, originToHighlight);
    }

    /** Shows the current binding all the actions in the specified action sets. */
    @NativeType("EVRInputError")
    public static int VRInput_ShowBindingsForActionSet(@NativeType("VRActiveActionSet_t *") VRActiveActionSet.Buffer pSets, @NativeType("uint32_t") int unSizeOfVRSelectedActionSet_t, @NativeType("VRInputValueHandle_t") long originToHighlight) {
        return nVRInput_ShowBindingsForActionSet(pSets.address(), unSizeOfVRSelectedActionSet_t, pSets.remaining(), originToHighlight);
    }

}