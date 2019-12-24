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
        return callPI(pchActionManifestPath, __functionAddress);
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
            stack.nASCII(pchActionManifestPath, true);
            long pchActionManifestPathEncoded = stack.getPointerAddress();
            return nVRInput_SetActionManifestPath(pchActionManifestPathEncoded);
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
        return callPPI(pchActionSetName, pHandle, __functionAddress);
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
            stack.nASCII(pchActionSetName, true);
            long pchActionSetNameEncoded = stack.getPointerAddress();
            return nVRInput_GetActionSetHandle(pchActionSetNameEncoded, memAddress(pHandle));
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
        return callPPI(pchActionName, pHandle, __functionAddress);
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
            stack.nASCII(pchActionName, true);
            long pchActionNameEncoded = stack.getPointerAddress();
            return nVRInput_GetActionHandle(pchActionNameEncoded, memAddress(pHandle));
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
        return callPPI(pchInputSourcePath, pHandle, __functionAddress);
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
            stack.nASCII(pchInputSourcePath, true);
            long pchInputSourcePathEncoded = stack.getPointerAddress();
            return nVRInput_GetInputSourceHandle(pchInputSourcePathEncoded, memAddress(pHandle));
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
        return callPI(pSets, unSizeOfVRSelectedActionSet_t, unSetCount, __functionAddress);
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
        return callJPJI(action, pActionData, unActionDataSize, ulRestrictToDevice, __functionAddress);
    }

    /**
     * Reads the state of a digital action given its handle. This will return {@link VR#EVRInputError_VRInputError_WrongType} if the type of action is something other
     * than digital.
     */
    @NativeType("EVRInputError")
    public static int VRInput_GetDigitalActionData(@NativeType("VRActionHandle_t") long action, @NativeType("InputDigitalActionData_t *") InputDigitalActionData pActionData, @NativeType("uint32_t") int unActionDataSize, @NativeType("VRInputValueHandle_t") long ulRestrictToDevice) {
        return nVRInput_GetDigitalActionData(action, pActionData.address(), unActionDataSize, ulRestrictToDevice);
    }

    /**
     * Reads the state of a digital action given its handle. This will return {@link VR#EVRInputError_VRInputError_WrongType} if the type of action is something other
     * than digital.
     */
    @NativeType("EVRInputError")
    public static int VRInput_GetDigitalActionData(@NativeType("VRActionHandle_t") long action, @NativeType("InputDigitalActionData_t *") InputDigitalActionData pActionData, @NativeType("VRInputValueHandle_t") long ulRestrictToDevice) {
        return nVRInput_GetDigitalActionData(action, pActionData.address(), InputDigitalActionData.SIZEOF, ulRestrictToDevice);
    }

    // --- [ VRInput_GetAnalogActionData ] ---

    /** Unsafe version of: {@link #VRInput_GetAnalogActionData GetAnalogActionData} */
    public static int nVRInput_GetAnalogActionData(long action, long pActionData, int unActionDataSize, long ulRestrictToDevice) {
        long __functionAddress = OpenVR.VRInput.GetAnalogActionData;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callJPJI(action, pActionData, unActionDataSize, ulRestrictToDevice, __functionAddress);
    }

    /**
     * Reads the state of an analog action given its handle. This will return {@link VR#EVRInputError_VRInputError_WrongType} if the type of action is something other
     * than analog.
     */
    @NativeType("EVRInputError")
    public static int VRInput_GetAnalogActionData(@NativeType("VRActionHandle_t") long action, @NativeType("InputAnalogActionData_t *") InputAnalogActionData pActionData, @NativeType("uint32_t") int unActionDataSize, @NativeType("VRInputValueHandle_t") long ulRestrictToDevice) {
        return nVRInput_GetAnalogActionData(action, pActionData.address(), unActionDataSize, ulRestrictToDevice);
    }

    /**
     * Reads the state of an analog action given its handle. This will return {@link VR#EVRInputError_VRInputError_WrongType} if the type of action is something other
     * than analog.
     */
    @NativeType("EVRInputError")
    public static int VRInput_GetAnalogActionData(@NativeType("VRActionHandle_t") long action, @NativeType("InputAnalogActionData_t *") InputAnalogActionData pActionData, @NativeType("VRInputValueHandle_t") long ulRestrictToDevice) {
        return nVRInput_GetAnalogActionData(action, pActionData.address(), InputAnalogActionData.SIZEOF, ulRestrictToDevice);
    }

    // --- [ VRInput_GetPoseActionDataRelativeToNow ] ---

    /** Unsafe version of: {@link #VRInput_GetPoseActionDataRelativeToNow GetPoseActionDataRelativeToNow} */
    public static int nVRInput_GetPoseActionDataRelativeToNow(long action, int eOrigin, float fPredictedSecondsFromNow, long pActionData, int unActionDataSize, long ulRestrictToDevice) {
        long __functionAddress = OpenVR.VRInput.GetPoseActionDataRelativeToNow;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callJPJI(action, eOrigin, fPredictedSecondsFromNow, pActionData, unActionDataSize, ulRestrictToDevice, __functionAddress);
    }

    /**
     * Reads the state of a pose action given its handle for the number of seconds relative to now.
     * 
     * <p>This will generally be called with negative times from the {@code fUpdateTime} fields in other actions.</p>
     *
     * @param eOrigin one of:<br><table><tr><td>{@link VR#ETrackingUniverseOrigin_TrackingUniverseSeated}</td></tr><tr><td>{@link VR#ETrackingUniverseOrigin_TrackingUniverseStanding}</td></tr><tr><td>{@link VR#ETrackingUniverseOrigin_TrackingUniverseRawAndUncalibrated}</td></tr></table>
     */
    @NativeType("EVRInputError")
    public static int VRInput_GetPoseActionDataRelativeToNow(@NativeType("VRActionHandle_t") long action, @NativeType("ETrackingUniverseOrigin") int eOrigin, float fPredictedSecondsFromNow, @NativeType("InputPoseActionData_t *") InputPoseActionData pActionData, @NativeType("uint32_t") int unActionDataSize, @NativeType("VRInputValueHandle_t") long ulRestrictToDevice) {
        return nVRInput_GetPoseActionDataRelativeToNow(action, eOrigin, fPredictedSecondsFromNow, pActionData.address(), unActionDataSize, ulRestrictToDevice);
    }

    /**
     * Reads the state of a pose action given its handle for the number of seconds relative to now.
     * 
     * <p>This will generally be called with negative times from the {@code fUpdateTime} fields in other actions.</p>
     *
     * @param eOrigin one of:<br><table><tr><td>{@link VR#ETrackingUniverseOrigin_TrackingUniverseSeated}</td></tr><tr><td>{@link VR#ETrackingUniverseOrigin_TrackingUniverseStanding}</td></tr><tr><td>{@link VR#ETrackingUniverseOrigin_TrackingUniverseRawAndUncalibrated}</td></tr></table>
     */
    @NativeType("EVRInputError")
    public static int VRInput_GetPoseActionDataRelativeToNow(@NativeType("VRActionHandle_t") long action, @NativeType("ETrackingUniverseOrigin") int eOrigin, float fPredictedSecondsFromNow, @NativeType("InputPoseActionData_t *") InputPoseActionData pActionData, @NativeType("VRInputValueHandle_t") long ulRestrictToDevice) {
        return nVRInput_GetPoseActionDataRelativeToNow(action, eOrigin, fPredictedSecondsFromNow, pActionData.address(), InputPoseActionData.SIZEOF, ulRestrictToDevice);
    }

    // --- [ VRInput_GetPoseActionDataForNextFrame ] ---

    /** Unsafe version of: {@link #VRInput_GetPoseActionDataForNextFrame GetPoseActionDataForNextFrame} */
    public static int nVRInput_GetPoseActionDataForNextFrame(long action, int eOrigin, long pActionData, int unActionDataSize, long ulRestrictToDevice) {
        long __functionAddress = OpenVR.VRInput.GetPoseActionDataForNextFrame;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callJPJI(action, eOrigin, pActionData, unActionDataSize, ulRestrictToDevice, __functionAddress);
    }

    /**
     * Reads the state of a pose action given its handle.
     * 
     * <p>The returned values will match the values returned by the last call to {@link VRCompositor#VRCompositor_WaitGetPoses WaitGetPoses}.</p>
     *
     * @param eOrigin one of:<br><table><tr><td>{@link VR#ETrackingUniverseOrigin_TrackingUniverseSeated}</td></tr><tr><td>{@link VR#ETrackingUniverseOrigin_TrackingUniverseStanding}</td></tr><tr><td>{@link VR#ETrackingUniverseOrigin_TrackingUniverseRawAndUncalibrated}</td></tr></table>
     */
    @NativeType("EVRInputError")
    public static int VRInput_GetPoseActionDataForNextFrame(@NativeType("VRActionHandle_t") long action, @NativeType("ETrackingUniverseOrigin") int eOrigin, @NativeType("InputPoseActionData_t *") InputPoseActionData pActionData, @NativeType("uint32_t") int unActionDataSize, @NativeType("VRInputValueHandle_t") long ulRestrictToDevice) {
        return nVRInput_GetPoseActionDataForNextFrame(action, eOrigin, pActionData.address(), unActionDataSize, ulRestrictToDevice);
    }

    /**
     * Reads the state of a pose action given its handle.
     * 
     * <p>The returned values will match the values returned by the last call to {@link VRCompositor#VRCompositor_WaitGetPoses WaitGetPoses}.</p>
     *
     * @param eOrigin one of:<br><table><tr><td>{@link VR#ETrackingUniverseOrigin_TrackingUniverseSeated}</td></tr><tr><td>{@link VR#ETrackingUniverseOrigin_TrackingUniverseStanding}</td></tr><tr><td>{@link VR#ETrackingUniverseOrigin_TrackingUniverseRawAndUncalibrated}</td></tr></table>
     */
    @NativeType("EVRInputError")
    public static int VRInput_GetPoseActionDataForNextFrame(@NativeType("VRActionHandle_t") long action, @NativeType("ETrackingUniverseOrigin") int eOrigin, @NativeType("InputPoseActionData_t *") InputPoseActionData pActionData, @NativeType("VRInputValueHandle_t") long ulRestrictToDevice) {
        return nVRInput_GetPoseActionDataForNextFrame(action, eOrigin, pActionData.address(), InputPoseActionData.SIZEOF, ulRestrictToDevice);
    }

    // --- [ VRInput_GetSkeletalActionData ] ---

    /** Unsafe version of: {@link #VRInput_GetSkeletalActionData GetSkeletalActionData} */
    public static int nVRInput_GetSkeletalActionData(long action, long pActionData, int unActionDataSize) {
        long __functionAddress = OpenVR.VRInput.GetSkeletalActionData;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callJPI(action, pActionData, unActionDataSize, __functionAddress);
    }

    /** Reads the state of a skeletal action given its handle. */
    @NativeType("EVRInputError")
    public static int VRInput_GetSkeletalActionData(@NativeType("VRActionHandle_t") long action, @NativeType("InputSkeletalActionData_t *") InputSkeletalActionData pActionData, @NativeType("uint32_t") int unActionDataSize) {
        return nVRInput_GetSkeletalActionData(action, pActionData.address(), unActionDataSize);
    }

    /** Reads the state of a skeletal action given its handle. */
    @NativeType("EVRInputError")
    public static int VRInput_GetSkeletalActionData(@NativeType("VRActionHandle_t") long action, @NativeType("InputSkeletalActionData_t *") InputSkeletalActionData pActionData) {
        return nVRInput_GetSkeletalActionData(action, pActionData.address(), InputSkeletalActionData.SIZEOF);
    }

    // --- [ VRInput_GetBoneCount ] ---

    /** Unsafe version of: {@link #VRInput_GetBoneCount GetBoneCount} */
    public static int nVRInput_GetBoneCount(long action, long pBoneCount) {
        long __functionAddress = OpenVR.VRInput.GetBoneCount;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callJPI(action, pBoneCount, __functionAddress);
    }

    /** Reads the number of bones in skeleton associated with the given action. */
    @NativeType("EVRInputError")
    public static int VRInput_GetBoneCount(@NativeType("VRActionHandle_t") long action, @NativeType("uint32_t *") IntBuffer pBoneCount) {
        if (CHECKS) {
            check(pBoneCount, 1);
        }
        return nVRInput_GetBoneCount(action, memAddress(pBoneCount));
    }

    // --- [ VRInput_GetBoneHierarchy ] ---

    /** Unsafe version of: {@link #VRInput_GetBoneHierarchy GetBoneHierarchy} */
    public static int nVRInput_GetBoneHierarchy(long action, long pParentIndices, int unIndexArrayCount) {
        long __functionAddress = OpenVR.VRInput.GetBoneHierarchy;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callJPI(action, pParentIndices, unIndexArrayCount, __functionAddress);
    }

    /** Fills the given array with the index of each bone's parent in the skeleton associated with the given action. */
    @NativeType("EVRInputError")
    public static int VRInput_GetBoneHierarchy(@NativeType("VRActionHandle_t") long action, @NativeType("BoneIndex_t *") IntBuffer pParentIndices) {
        return nVRInput_GetBoneHierarchy(action, memAddress(pParentIndices), pParentIndices.remaining());
    }

    // --- [ VRInput_GetBoneName ] ---

    /** Unsafe version of: {@link #VRInput_GetBoneName GetBoneName} */
    public static int nVRInput_GetBoneName(long action, int nBoneIndex, long pchBoneName, int unNameBufferSize) {
        long __functionAddress = OpenVR.VRInput.GetBoneName;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callJPI(action, nBoneIndex, pchBoneName, unNameBufferSize, __functionAddress);
    }

    /** Fills the given buffer with the name of the bone at the given index in the skeleton associated with the given action. */
    @NativeType("EVRInputError")
    public static int VRInput_GetBoneName(@NativeType("VRActionHandle_t") long action, @NativeType("BoneIndex_t") int nBoneIndex, @NativeType("char *") ByteBuffer pchBoneName) {
        return nVRInput_GetBoneName(action, nBoneIndex, memAddress(pchBoneName), pchBoneName.remaining());
    }

    // --- [ VRInput_GetSkeletalReferenceTransforms ] ---

    /** Unsafe version of: {@link #VRInput_GetSkeletalReferenceTransforms GetSkeletalReferenceTransforms} */
    public static int nVRInput_GetSkeletalReferenceTransforms(long action, int eTransformSpace, int eReferencePose, long pTransformArray, int unTransformArrayCount) {
        long __functionAddress = OpenVR.VRInput.GetSkeletalReferenceTransforms;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callJPI(action, eTransformSpace, eReferencePose, pTransformArray, unTransformArrayCount, __functionAddress);
    }

    /**
     * Fills the given buffer with the transforms for a specific static skeletal reference pose.
     *
     * @param eTransformSpace one of:<br><table><tr><td>{@link VR#EVRSkeletalTransformSpace_VRSkeletalTransformSpace_Model}</td></tr><tr><td>{@link VR#EVRSkeletalTransformSpace_VRSkeletalTransformSpace_Parent}</td></tr></table>
     * @param eReferencePose  one of:<br><table><tr><td>{@link VR#EVRSkeletalReferencePose_VRSkeletalReferencePose_BindPose}</td></tr><tr><td>{@link VR#EVRSkeletalReferencePose_VRSkeletalReferencePose_OpenHand}</td></tr><tr><td>{@link VR#EVRSkeletalReferencePose_VRSkeletalReferencePose_Fist}</td></tr><tr><td>{@link VR#EVRSkeletalReferencePose_VRSkeletalReferencePose_GripLimit}</td></tr></table>
     */
    @NativeType("EVRInputError")
    public static int VRInput_GetSkeletalReferenceTransforms(@NativeType("VRActionHandle_t") long action, @NativeType("EVRSkeletalTransformSpace") int eTransformSpace, @NativeType("EVRSkeletalReferencePose") int eReferencePose, @NativeType("VRBoneTransform_t *") VRBoneTransform.Buffer pTransformArray) {
        return nVRInput_GetSkeletalReferenceTransforms(action, eTransformSpace, eReferencePose, pTransformArray.address(), pTransformArray.remaining());
    }

    // --- [ VRInput_GetSkeletalTrackingLevel ] ---

    /** Unsafe version of: {@link #VRInput_GetSkeletalTrackingLevel GetSkeletalTrackingLevel} */
    public static int nVRInput_GetSkeletalTrackingLevel(long action, long pSkeletalTrackingLevel) {
        long __functionAddress = OpenVR.VRInput.GetSkeletalTrackingLevel;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callJPI(action, pSkeletalTrackingLevel, __functionAddress);
    }

    /** Reads the level of accuracy to which the controller is able to track the user to recreate a skeletal pose. */
    @NativeType("EVRInputError")
    public static int VRInput_GetSkeletalTrackingLevel(@NativeType("VRActionHandle_t") long action, @NativeType("EVRSkeletalTrackingLevel *") IntBuffer pSkeletalTrackingLevel) {
        if (CHECKS) {
            check(pSkeletalTrackingLevel, 1);
        }
        return nVRInput_GetSkeletalTrackingLevel(action, memAddress(pSkeletalTrackingLevel));
    }

    // --- [ VRInput_GetSkeletalBoneData ] ---

    /** Unsafe version of: {@link #VRInput_GetSkeletalBoneData GetSkeletalBoneData} */
    public static int nVRInput_GetSkeletalBoneData(long action, int eTransformSpace, int eMotionRange, long pTransformArray, int unTransformArrayCount) {
        long __functionAddress = OpenVR.VRInput.GetSkeletalBoneData;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callJPI(action, eTransformSpace, eMotionRange, pTransformArray, unTransformArrayCount, __functionAddress);
    }

    /**
     * Reads the state of the skeletal bone data associated with this action and copies it into the given buffer.
     *
     * @param eTransformSpace one of:<br><table><tr><td>{@link VR#EVRSkeletalTransformSpace_VRSkeletalTransformSpace_Model}</td></tr><tr><td>{@link VR#EVRSkeletalTransformSpace_VRSkeletalTransformSpace_Parent}</td></tr></table>
     * @param eMotionRange    one of:<br><table><tr><td>{@link VR#EVRSkeletalMotionRange_VRSkeletalMotionRange_WithController}</td></tr><tr><td>{@link VR#EVRSkeletalMotionRange_VRSkeletalMotionRange_WithoutController}</td></tr></table>
     */
    @NativeType("EVRInputError")
    public static int VRInput_GetSkeletalBoneData(@NativeType("VRActionHandle_t") long action, @NativeType("EVRSkeletalTransformSpace") int eTransformSpace, @NativeType("EVRSkeletalMotionRange") int eMotionRange, @NativeType("VRBoneTransform_t *") VRBoneTransform.Buffer pTransformArray) {
        return nVRInput_GetSkeletalBoneData(action, eTransformSpace, eMotionRange, pTransformArray.address(), pTransformArray.remaining());
    }

    // --- [ VRInput_GetSkeletalSummaryData ] ---

    /** Unsafe version of: {@link #VRInput_GetSkeletalSummaryData GetSkeletalSummaryData} */
    public static int nVRInput_GetSkeletalSummaryData(long action, int eSummaryType, long pSkeletalSummaryData) {
        long __functionAddress = OpenVR.VRInput.GetSkeletalSummaryData;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callJPI(action, eSummaryType, pSkeletalSummaryData, __functionAddress);
    }

    /** Reads summary information about the current pose of the skeleton associated with the given action. */
    @NativeType("EVRInputError")
    public static int VRInput_GetSkeletalSummaryData(@NativeType("VRActionHandle_t") long action, @NativeType("EVRSummaryType") int eSummaryType, @NativeType("VRSkeletalSummaryData_t *") VRSkeletalSummaryData pSkeletalSummaryData) {
        return nVRInput_GetSkeletalSummaryData(action, eSummaryType, pSkeletalSummaryData.address());
    }

    // --- [ VRInput_GetSkeletalBoneDataCompressed ] ---

    /** Unsafe version of: {@link #VRInput_GetSkeletalBoneDataCompressed GetSkeletalBoneDataCompressed} */
    public static int nVRInput_GetSkeletalBoneDataCompressed(long action, int eMotionRange, long pvCompressedData, int unCompressedSize, long punRequiredCompressedSize) {
        long __functionAddress = OpenVR.VRInput.GetSkeletalBoneDataCompressed;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callJPPI(action, eMotionRange, pvCompressedData, unCompressedSize, punRequiredCompressedSize, __functionAddress);
    }

    /**
     * Reads the state of the skeletal bone data in a compressed form that is suitable for sending over the network. The required buffer size will never
     * exceed ({@code sizeof(VR_BoneTransform_t)*boneCount + 2}). Usually the size will be much smaller.
     *
     * @param eMotionRange one of:<br><table><tr><td>{@link VR#EVRSkeletalMotionRange_VRSkeletalMotionRange_WithController}</td></tr><tr><td>{@link VR#EVRSkeletalMotionRange_VRSkeletalMotionRange_WithoutController}</td></tr></table>
     */
    @NativeType("EVRInputError")
    public static int VRInput_GetSkeletalBoneDataCompressed(@NativeType("VRActionHandle_t") long action, @NativeType("EVRSkeletalMotionRange") int eMotionRange, @Nullable @NativeType("void *") ByteBuffer pvCompressedData, @Nullable @NativeType("uint32_t *") IntBuffer punRequiredCompressedSize) {
        if (CHECKS) {
            checkSafe(punRequiredCompressedSize, 1);
        }
        return nVRInput_GetSkeletalBoneDataCompressed(action, eMotionRange, memAddressSafe(pvCompressedData), remainingSafe(pvCompressedData), memAddressSafe(punRequiredCompressedSize));
    }

    // --- [ VRInput_DecompressSkeletalBoneData ] ---

    /** Unsafe version of: {@link #VRInput_DecompressSkeletalBoneData DecompressSkeletalBoneData} */
    public static int nVRInput_DecompressSkeletalBoneData(long pvCompressedBuffer, int unCompressedBufferSize, int eTransformSpace, long pTransformArray, int unTransformArrayCount) {
        long __functionAddress = OpenVR.VRInput.DecompressSkeletalBoneData;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPPI(pvCompressedBuffer, unCompressedBufferSize, eTransformSpace, pTransformArray, unTransformArrayCount, __functionAddress);
    }

    /**
     * Turns a compressed buffer from {@link #VRInput_GetSkeletalBoneDataCompressed GetSkeletalBoneDataCompressed} and turns it back into a bone transform array.
     *
     * @param eTransformSpace one of:<br><table><tr><td>{@link VR#EVRSkeletalTransformSpace_VRSkeletalTransformSpace_Model}</td></tr><tr><td>{@link VR#EVRSkeletalTransformSpace_VRSkeletalTransformSpace_Parent}</td></tr></table>
     */
    @NativeType("EVRInputError")
    public static int VRInput_DecompressSkeletalBoneData(@NativeType("void *") ByteBuffer pvCompressedBuffer, @NativeType("EVRSkeletalTransformSpace") int eTransformSpace, @NativeType("VRBoneTransform_t *") VRBoneTransform.Buffer pTransformArray) {
        return nVRInput_DecompressSkeletalBoneData(memAddress(pvCompressedBuffer), pvCompressedBuffer.remaining(), eTransformSpace, pTransformArray.address(), pTransformArray.remaining());
    }

    // --- [ VRInput_TriggerHapticVibrationAction ] ---

    /** Triggers a haptic event as described by the specified action. */
    @NativeType("EVRInputError")
    public static int VRInput_TriggerHapticVibrationAction(@NativeType("VRActionHandle_t") long action, float fStartSecondsFromNow, float fDurationSeconds, float fFrequency, float fAmplitude, @NativeType("VRInputValueHandle_t") long ulRestrictToDevice) {
        long __functionAddress = OpenVR.VRInput.TriggerHapticVibrationAction;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callJJI(action, fStartSecondsFromNow, fDurationSeconds, fFrequency, fAmplitude, ulRestrictToDevice, __functionAddress);
    }

    // --- [ VRInput_GetActionOrigins ] ---

    /** Unsafe version of: {@link #VRInput_GetActionOrigins GetActionOrigins} */
    public static int nVRInput_GetActionOrigins(long actionSetHandle, long digitalActionHandle, long originsOut, int originOutCount) {
        long __functionAddress = OpenVR.VRInput.GetActionOrigins;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callJJPI(actionSetHandle, digitalActionHandle, originsOut, originOutCount, __functionAddress);
    }

    /** Retrieve origin handles for an action. */
    @NativeType("EVRInputError")
    public static int VRInput_GetActionOrigins(@NativeType("VRActionSetHandle_t") long actionSetHandle, @NativeType("VRActionHandle_t") long digitalActionHandle, @NativeType("VRInputValueHandle_t *") LongBuffer originsOut) {
        return nVRInput_GetActionOrigins(actionSetHandle, digitalActionHandle, memAddress(originsOut), originsOut.remaining());
    }

    // --- [ VRInput_GetOriginLocalizedName ] ---

    /** Unsafe version of: {@link #VRInput_GetOriginLocalizedName GetOriginLocalizedName} */
    public static int nVRInput_GetOriginLocalizedName(long origin, long pchNameArray, int unNameArraySize, int unStringSectionsToInclude) {
        long __functionAddress = OpenVR.VRInput.GetOriginLocalizedName;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callJPI(origin, pchNameArray, unNameArraySize, unStringSectionsToInclude, __functionAddress);
    }

    /**
     * Retrieves the name of the origin in the current language.
     *
     * @param unStringSectionsToInclude a bitfield of values in {@code EVRInputStringBits} that allows the application to specify which parts of the origin's information it wants a string
     *                                  for. One or more of:<br><table><tr><td>{@link VR#EVRInputStringBits_VRInputString_Hand}</td></tr><tr><td>{@link VR#EVRInputStringBits_VRInputString_ControllerType}</td></tr><tr><td>{@link VR#EVRInputStringBits_VRInputString_InputSource}</td></tr><tr><td>{@link VR#EVRInputStringBits_VRInputString_All}</td></tr></table>
     */
    @NativeType("EVRInputError")
    public static int VRInput_GetOriginLocalizedName(@NativeType("VRInputValueHandle_t") long origin, @NativeType("char *") ByteBuffer pchNameArray, @NativeType("int32_t") int unStringSectionsToInclude) {
        return nVRInput_GetOriginLocalizedName(origin, memAddress(pchNameArray), pchNameArray.remaining(), unStringSectionsToInclude);
    }

    // --- [ VRInput_GetOriginTrackedDeviceInfo ] ---

    /** Unsafe version of: {@link #VRInput_GetOriginTrackedDeviceInfo GetOriginTrackedDeviceInfo} */
    public static int nVRInput_GetOriginTrackedDeviceInfo(long origin, long pOriginInfo, int unOriginInfoSize) {
        long __functionAddress = OpenVR.VRInput.GetOriginTrackedDeviceInfo;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callJPI(origin, pOriginInfo, unOriginInfoSize, __functionAddress);
    }

    /** Retrieves useful information for the origin of this action. */
    @NativeType("EVRInputError")
    public static int VRInput_GetOriginTrackedDeviceInfo(@NativeType("VRInputValueHandle_t") long origin, @NativeType("InputOriginInfo_t *") InputOriginInfo pOriginInfo, @NativeType("uint32_t") int unOriginInfoSize) {
        return nVRInput_GetOriginTrackedDeviceInfo(origin, pOriginInfo.address(), unOriginInfoSize);
    }

    /** Retrieves useful information for the origin of this action. */
    @NativeType("EVRInputError")
    public static int VRInput_GetOriginTrackedDeviceInfo(@NativeType("VRInputValueHandle_t") long origin, @NativeType("InputOriginInfo_t *") InputOriginInfo pOriginInfo) {
        return nVRInput_GetOriginTrackedDeviceInfo(origin, pOriginInfo.address(), InputOriginInfo.SIZEOF);
    }

    // --- [ VRInput_GetActionBindingInfo ] ---

    /** Unsafe version of: {@link #VRInput_GetActionBindingInfo GetActionBindingInfo} */
    public static int nVRInput_GetActionBindingInfo(long action, long pOriginInfo, int unBindingInfoSize, int unBindingInfoCount, long punReturnedBindingInfoCount) {
        long __functionAddress = OpenVR.VRInput.GetActionBindingInfo;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callJPPI(action, pOriginInfo, unBindingInfoSize, unBindingInfoCount, punReturnedBindingInfoCount, __functionAddress);
    }

    /** Retrieves useful information about the bindings for an action. */
    @NativeType("EVRInputError")
    public static int VRInput_GetActionBindingInfo(@NativeType("VRActionHandle_t") long action, @NativeType("InputBindingInfo_t *") InputBindingInfo.Buffer pOriginInfo, @NativeType("uint32_t *") IntBuffer punReturnedBindingInfoCount) {
        if (CHECKS) {
            check(punReturnedBindingInfoCount, 1);
        }
        return nVRInput_GetActionBindingInfo(action, pOriginInfo.address(), InputBindingInfo.SIZEOF, pOriginInfo.remaining(), memAddress(punReturnedBindingInfoCount));
    }

    // --- [ VRInput_ShowActionOrigins ] ---

    /** Shows the current binding for the action in-headset. */
    @NativeType("EVRInputError")
    public static int VRInput_ShowActionOrigins(@NativeType("VRActionSetHandle_t") long actionSetHandle, @NativeType("VRActionHandle_t") long ulActionHandle) {
        long __functionAddress = OpenVR.VRInput.ShowActionOrigins;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callJJI(actionSetHandle, ulActionHandle, __functionAddress);
    }

    // --- [ VRInput_ShowBindingsForActionSet ] ---

    /** Unsafe version of: {@link #VRInput_ShowBindingsForActionSet ShowBindingsForActionSet} */
    public static int nVRInput_ShowBindingsForActionSet(long pSets, int unSizeOfVRSelectedActionSet_t, int unSetCount, long originToHighlight) {
        long __functionAddress = OpenVR.VRInput.ShowBindingsForActionSet;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPJI(pSets, unSizeOfVRSelectedActionSet_t, unSetCount, originToHighlight, __functionAddress);
    }

    /** Shows the current binding all the actions in the specified action sets. */
    @NativeType("EVRInputError")
    public static int VRInput_ShowBindingsForActionSet(@NativeType("VRActiveActionSet_t *") VRActiveActionSet.Buffer pSets, @NativeType("uint32_t") int unSizeOfVRSelectedActionSet_t, @NativeType("VRInputValueHandle_t") long originToHighlight) {
        return nVRInput_ShowBindingsForActionSet(pSets.address(), unSizeOfVRSelectedActionSet_t, pSets.remaining(), originToHighlight);
    }

    // --- [ VRInput_OpenBindingUI ] ---

    /** Unsafe version of: {@link #VRInput_OpenBindingUI OpenBindingUI} */
    public static int nVRInput_OpenBindingUI(long pchAppKey, long ulActionSetHandle, long ulDeviceHandle, boolean bShowOnDesktop) {
        long __functionAddress = OpenVR.VRInput.OpenBindingUI;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPJJI(pchAppKey, ulActionSetHandle, ulDeviceHandle, bShowOnDesktop, __functionAddress);
    }

    /**
     * Opens the binding user interface.
     * 
     * <p>If no app key is provided it will use the key from the calling process. If no set is provided it will open to the root of the app binding page.</p>
     */
    @NativeType("EVRInputError")
    public static int VRInput_OpenBindingUI(@NativeType("char const *") ByteBuffer pchAppKey, @NativeType("VRActionSetHandle_t") long ulActionSetHandle, @NativeType("VRInputValueHandle_t") long ulDeviceHandle, @NativeType("bool") boolean bShowOnDesktop) {
        if (CHECKS) {
            checkNT1(pchAppKey);
        }
        return nVRInput_OpenBindingUI(memAddress(pchAppKey), ulActionSetHandle, ulDeviceHandle, bShowOnDesktop);
    }

    /**
     * Opens the binding user interface.
     * 
     * <p>If no app key is provided it will use the key from the calling process. If no set is provided it will open to the root of the app binding page.</p>
     */
    @NativeType("EVRInputError")
    public static int VRInput_OpenBindingUI(@NativeType("char const *") CharSequence pchAppKey, @NativeType("VRActionSetHandle_t") long ulActionSetHandle, @NativeType("VRInputValueHandle_t") long ulDeviceHandle, @NativeType("bool") boolean bShowOnDesktop) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nASCII(pchAppKey, true);
            long pchAppKeyEncoded = stack.getPointerAddress();
            return nVRInput_OpenBindingUI(pchAppKeyEncoded, ulActionSetHandle, ulDeviceHandle, bShowOnDesktop);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

}