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

public class VRInput {

    protected VRInput() {
        throw new UnsupportedOperationException();
    }

    // --- [ VRInput_SetActionManifestPath ] ---

    /** {@code EVRInputError VRInput_SetActionManifestPath(char const * pchActionManifestPath)} */
    public static int nVRInput_SetActionManifestPath(long pchActionManifestPath) {
        long __functionAddress = OpenVR.VRInput.SetActionManifestPath;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPI(pchActionManifestPath, __functionAddress);
    }

    /** {@code EVRInputError VRInput_SetActionManifestPath(char const * pchActionManifestPath)} */
    @NativeType("EVRInputError")
    public static int VRInput_SetActionManifestPath(@NativeType("char const *") ByteBuffer pchActionManifestPath) {
        if (CHECKS) {
            checkNT1(pchActionManifestPath);
        }
        return nVRInput_SetActionManifestPath(memAddress(pchActionManifestPath));
    }

    /** {@code EVRInputError VRInput_SetActionManifestPath(char const * pchActionManifestPath)} */
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

    /** {@code EVRInputError VRInput_GetActionSetHandle(char const * pchActionSetName, VRActionSetHandle_t * pHandle)} */
    public static int nVRInput_GetActionSetHandle(long pchActionSetName, long pHandle) {
        long __functionAddress = OpenVR.VRInput.GetActionSetHandle;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPPI(pchActionSetName, pHandle, __functionAddress);
    }

    /** {@code EVRInputError VRInput_GetActionSetHandle(char const * pchActionSetName, VRActionSetHandle_t * pHandle)} */
    @NativeType("EVRInputError")
    public static int VRInput_GetActionSetHandle(@NativeType("char const *") ByteBuffer pchActionSetName, @NativeType("VRActionSetHandle_t *") LongBuffer pHandle) {
        if (CHECKS) {
            checkNT1(pchActionSetName);
            check(pHandle, 1);
        }
        return nVRInput_GetActionSetHandle(memAddress(pchActionSetName), memAddress(pHandle));
    }

    /** {@code EVRInputError VRInput_GetActionSetHandle(char const * pchActionSetName, VRActionSetHandle_t * pHandle)} */
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

    /** {@code EVRInputError VRInput_GetActionHandle(char const * pchActionName, VRActionHandle_t * pHandle)} */
    public static int nVRInput_GetActionHandle(long pchActionName, long pHandle) {
        long __functionAddress = OpenVR.VRInput.GetActionHandle;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPPI(pchActionName, pHandle, __functionAddress);
    }

    /** {@code EVRInputError VRInput_GetActionHandle(char const * pchActionName, VRActionHandle_t * pHandle)} */
    @NativeType("EVRInputError")
    public static int VRInput_GetActionHandle(@NativeType("char const *") ByteBuffer pchActionName, @NativeType("VRActionHandle_t *") LongBuffer pHandle) {
        if (CHECKS) {
            checkNT1(pchActionName);
            check(pHandle, 1);
        }
        return nVRInput_GetActionHandle(memAddress(pchActionName), memAddress(pHandle));
    }

    /** {@code EVRInputError VRInput_GetActionHandle(char const * pchActionName, VRActionHandle_t * pHandle)} */
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

    /** {@code EVRInputError VRInput_GetInputSourceHandle(char const * pchInputSourcePath, VRInputValueHandle_t * pHandle)} */
    public static int nVRInput_GetInputSourceHandle(long pchInputSourcePath, long pHandle) {
        long __functionAddress = OpenVR.VRInput.GetInputSourceHandle;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPPI(pchInputSourcePath, pHandle, __functionAddress);
    }

    /** {@code EVRInputError VRInput_GetInputSourceHandle(char const * pchInputSourcePath, VRInputValueHandle_t * pHandle)} */
    @NativeType("EVRInputError")
    public static int VRInput_GetInputSourceHandle(@NativeType("char const *") ByteBuffer pchInputSourcePath, @NativeType("VRInputValueHandle_t *") LongBuffer pHandle) {
        if (CHECKS) {
            checkNT1(pchInputSourcePath);
            check(pHandle, 1);
        }
        return nVRInput_GetInputSourceHandle(memAddress(pchInputSourcePath), memAddress(pHandle));
    }

    /** {@code EVRInputError VRInput_GetInputSourceHandle(char const * pchInputSourcePath, VRInputValueHandle_t * pHandle)} */
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

    /** {@code EVRInputError VRInput_UpdateActionState(VRActiveActionSet_t * pSets, uint32_t unSizeOfVRSelectedActionSet_t, uint32_t unSetCount)} */
    public static int nVRInput_UpdateActionState(long pSets, int unSizeOfVRSelectedActionSet_t, int unSetCount) {
        long __functionAddress = OpenVR.VRInput.UpdateActionState;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPI(pSets, unSizeOfVRSelectedActionSet_t, unSetCount, __functionAddress);
    }

    /** {@code EVRInputError VRInput_UpdateActionState(VRActiveActionSet_t * pSets, uint32_t unSizeOfVRSelectedActionSet_t, uint32_t unSetCount)} */
    @NativeType("EVRInputError")
    public static int VRInput_UpdateActionState(@NativeType("VRActiveActionSet_t *") VRActiveActionSet.Buffer pSets, @NativeType("uint32_t") int unSizeOfVRSelectedActionSet_t) {
        return nVRInput_UpdateActionState(pSets.address(), unSizeOfVRSelectedActionSet_t, pSets.remaining());
    }

    // --- [ VRInput_GetDigitalActionData ] ---

    /** {@code EVRInputError VRInput_GetDigitalActionData(VRActionHandle_t action, InputDigitalActionData_t * pActionData, uint32_t unActionDataSize, VRInputValueHandle_t ulRestrictToDevice)} */
    public static int nVRInput_GetDigitalActionData(long action, long pActionData, int unActionDataSize, long ulRestrictToDevice) {
        long __functionAddress = OpenVR.VRInput.GetDigitalActionData;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callJPJI(action, pActionData, unActionDataSize, ulRestrictToDevice, __functionAddress);
    }

    /** {@code EVRInputError VRInput_GetDigitalActionData(VRActionHandle_t action, InputDigitalActionData_t * pActionData, uint32_t unActionDataSize, VRInputValueHandle_t ulRestrictToDevice)} */
    @NativeType("EVRInputError")
    public static int VRInput_GetDigitalActionData(@NativeType("VRActionHandle_t") long action, @NativeType("InputDigitalActionData_t *") InputDigitalActionData pActionData, @NativeType("uint32_t") int unActionDataSize, @NativeType("VRInputValueHandle_t") long ulRestrictToDevice) {
        return nVRInput_GetDigitalActionData(action, pActionData.address(), unActionDataSize, ulRestrictToDevice);
    }

    /** {@code EVRInputError VRInput_GetDigitalActionData(VRActionHandle_t action, InputDigitalActionData_t * pActionData, uint32_t unActionDataSize, VRInputValueHandle_t ulRestrictToDevice)} */
    @NativeType("EVRInputError")
    public static int VRInput_GetDigitalActionData(@NativeType("VRActionHandle_t") long action, @NativeType("InputDigitalActionData_t *") InputDigitalActionData pActionData, @NativeType("VRInputValueHandle_t") long ulRestrictToDevice) {
        return nVRInput_GetDigitalActionData(action, pActionData.address(), InputDigitalActionData.SIZEOF, ulRestrictToDevice);
    }

    // --- [ VRInput_GetAnalogActionData ] ---

    /** {@code EVRInputError VRInput_GetAnalogActionData(VRActionHandle_t action, InputAnalogActionData_t * pActionData, uint32_t unActionDataSize, VRInputValueHandle_t ulRestrictToDevice)} */
    public static int nVRInput_GetAnalogActionData(long action, long pActionData, int unActionDataSize, long ulRestrictToDevice) {
        long __functionAddress = OpenVR.VRInput.GetAnalogActionData;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callJPJI(action, pActionData, unActionDataSize, ulRestrictToDevice, __functionAddress);
    }

    /** {@code EVRInputError VRInput_GetAnalogActionData(VRActionHandle_t action, InputAnalogActionData_t * pActionData, uint32_t unActionDataSize, VRInputValueHandle_t ulRestrictToDevice)} */
    @NativeType("EVRInputError")
    public static int VRInput_GetAnalogActionData(@NativeType("VRActionHandle_t") long action, @NativeType("InputAnalogActionData_t *") InputAnalogActionData pActionData, @NativeType("uint32_t") int unActionDataSize, @NativeType("VRInputValueHandle_t") long ulRestrictToDevice) {
        return nVRInput_GetAnalogActionData(action, pActionData.address(), unActionDataSize, ulRestrictToDevice);
    }

    /** {@code EVRInputError VRInput_GetAnalogActionData(VRActionHandle_t action, InputAnalogActionData_t * pActionData, uint32_t unActionDataSize, VRInputValueHandle_t ulRestrictToDevice)} */
    @NativeType("EVRInputError")
    public static int VRInput_GetAnalogActionData(@NativeType("VRActionHandle_t") long action, @NativeType("InputAnalogActionData_t *") InputAnalogActionData pActionData, @NativeType("VRInputValueHandle_t") long ulRestrictToDevice) {
        return nVRInput_GetAnalogActionData(action, pActionData.address(), InputAnalogActionData.SIZEOF, ulRestrictToDevice);
    }

    // --- [ VRInput_GetPoseActionDataRelativeToNow ] ---

    /** {@code EVRInputError VRInput_GetPoseActionDataRelativeToNow(VRActionHandle_t action, ETrackingUniverseOrigin eOrigin, float fPredictedSecondsFromNow, InputPoseActionData_t * pActionData, uint32_t unActionDataSize, VRInputValueHandle_t ulRestrictToDevice)} */
    public static int nVRInput_GetPoseActionDataRelativeToNow(long action, int eOrigin, float fPredictedSecondsFromNow, long pActionData, int unActionDataSize, long ulRestrictToDevice) {
        long __functionAddress = OpenVR.VRInput.GetPoseActionDataRelativeToNow;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callJPJI(action, eOrigin, fPredictedSecondsFromNow, pActionData, unActionDataSize, ulRestrictToDevice, __functionAddress);
    }

    /** {@code EVRInputError VRInput_GetPoseActionDataRelativeToNow(VRActionHandle_t action, ETrackingUniverseOrigin eOrigin, float fPredictedSecondsFromNow, InputPoseActionData_t * pActionData, uint32_t unActionDataSize, VRInputValueHandle_t ulRestrictToDevice)} */
    @NativeType("EVRInputError")
    public static int VRInput_GetPoseActionDataRelativeToNow(@NativeType("VRActionHandle_t") long action, @NativeType("ETrackingUniverseOrigin") int eOrigin, float fPredictedSecondsFromNow, @NativeType("InputPoseActionData_t *") InputPoseActionData pActionData, @NativeType("uint32_t") int unActionDataSize, @NativeType("VRInputValueHandle_t") long ulRestrictToDevice) {
        return nVRInput_GetPoseActionDataRelativeToNow(action, eOrigin, fPredictedSecondsFromNow, pActionData.address(), unActionDataSize, ulRestrictToDevice);
    }

    /** {@code EVRInputError VRInput_GetPoseActionDataRelativeToNow(VRActionHandle_t action, ETrackingUniverseOrigin eOrigin, float fPredictedSecondsFromNow, InputPoseActionData_t * pActionData, uint32_t unActionDataSize, VRInputValueHandle_t ulRestrictToDevice)} */
    @NativeType("EVRInputError")
    public static int VRInput_GetPoseActionDataRelativeToNow(@NativeType("VRActionHandle_t") long action, @NativeType("ETrackingUniverseOrigin") int eOrigin, float fPredictedSecondsFromNow, @NativeType("InputPoseActionData_t *") InputPoseActionData pActionData, @NativeType("VRInputValueHandle_t") long ulRestrictToDevice) {
        return nVRInput_GetPoseActionDataRelativeToNow(action, eOrigin, fPredictedSecondsFromNow, pActionData.address(), InputPoseActionData.SIZEOF, ulRestrictToDevice);
    }

    // --- [ VRInput_GetPoseActionDataForNextFrame ] ---

    /** {@code EVRInputError VRInput_GetPoseActionDataForNextFrame(VRActionHandle_t action, ETrackingUniverseOrigin eOrigin, InputPoseActionData_t * pActionData, uint32_t unActionDataSize, VRInputValueHandle_t ulRestrictToDevice)} */
    public static int nVRInput_GetPoseActionDataForNextFrame(long action, int eOrigin, long pActionData, int unActionDataSize, long ulRestrictToDevice) {
        long __functionAddress = OpenVR.VRInput.GetPoseActionDataForNextFrame;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callJPJI(action, eOrigin, pActionData, unActionDataSize, ulRestrictToDevice, __functionAddress);
    }

    /** {@code EVRInputError VRInput_GetPoseActionDataForNextFrame(VRActionHandle_t action, ETrackingUniverseOrigin eOrigin, InputPoseActionData_t * pActionData, uint32_t unActionDataSize, VRInputValueHandle_t ulRestrictToDevice)} */
    @NativeType("EVRInputError")
    public static int VRInput_GetPoseActionDataForNextFrame(@NativeType("VRActionHandle_t") long action, @NativeType("ETrackingUniverseOrigin") int eOrigin, @NativeType("InputPoseActionData_t *") InputPoseActionData pActionData, @NativeType("uint32_t") int unActionDataSize, @NativeType("VRInputValueHandle_t") long ulRestrictToDevice) {
        return nVRInput_GetPoseActionDataForNextFrame(action, eOrigin, pActionData.address(), unActionDataSize, ulRestrictToDevice);
    }

    /** {@code EVRInputError VRInput_GetPoseActionDataForNextFrame(VRActionHandle_t action, ETrackingUniverseOrigin eOrigin, InputPoseActionData_t * pActionData, uint32_t unActionDataSize, VRInputValueHandle_t ulRestrictToDevice)} */
    @NativeType("EVRInputError")
    public static int VRInput_GetPoseActionDataForNextFrame(@NativeType("VRActionHandle_t") long action, @NativeType("ETrackingUniverseOrigin") int eOrigin, @NativeType("InputPoseActionData_t *") InputPoseActionData pActionData, @NativeType("VRInputValueHandle_t") long ulRestrictToDevice) {
        return nVRInput_GetPoseActionDataForNextFrame(action, eOrigin, pActionData.address(), InputPoseActionData.SIZEOF, ulRestrictToDevice);
    }

    // --- [ VRInput_GetSkeletalActionData ] ---

    /** {@code EVRInputError VRInput_GetSkeletalActionData(VRActionHandle_t action, InputSkeletalActionData_t * pActionData, uint32_t unActionDataSize)} */
    public static int nVRInput_GetSkeletalActionData(long action, long pActionData, int unActionDataSize) {
        long __functionAddress = OpenVR.VRInput.GetSkeletalActionData;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callJPI(action, pActionData, unActionDataSize, __functionAddress);
    }

    /** {@code EVRInputError VRInput_GetSkeletalActionData(VRActionHandle_t action, InputSkeletalActionData_t * pActionData, uint32_t unActionDataSize)} */
    @NativeType("EVRInputError")
    public static int VRInput_GetSkeletalActionData(@NativeType("VRActionHandle_t") long action, @NativeType("InputSkeletalActionData_t *") InputSkeletalActionData pActionData, @NativeType("uint32_t") int unActionDataSize) {
        return nVRInput_GetSkeletalActionData(action, pActionData.address(), unActionDataSize);
    }

    /** {@code EVRInputError VRInput_GetSkeletalActionData(VRActionHandle_t action, InputSkeletalActionData_t * pActionData, uint32_t unActionDataSize)} */
    @NativeType("EVRInputError")
    public static int VRInput_GetSkeletalActionData(@NativeType("VRActionHandle_t") long action, @NativeType("InputSkeletalActionData_t *") InputSkeletalActionData pActionData) {
        return nVRInput_GetSkeletalActionData(action, pActionData.address(), InputSkeletalActionData.SIZEOF);
    }

    // --- [ VRInput_GetDominantHand ] ---

    /** {@code EVRInputError VRInput_GetDominantHand(ETrackedControllerRole * peDominantHand)} */
    public static int nVRInput_GetDominantHand(long peDominantHand) {
        long __functionAddress = OpenVR.VRInput.GetDominantHand;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPI(peDominantHand, __functionAddress);
    }

    /** {@code EVRInputError VRInput_GetDominantHand(ETrackedControllerRole * peDominantHand)} */
    @NativeType("EVRInputError")
    public static int VRInput_GetDominantHand(@NativeType("ETrackedControllerRole *") IntBuffer peDominantHand) {
        if (CHECKS) {
            check(peDominantHand, 1);
        }
        return nVRInput_GetDominantHand(memAddress(peDominantHand));
    }

    // --- [ VRInput_SetDominantHand ] ---

    /** {@code EVRInputError VRInput_SetDominantHand(ETrackedControllerRole eDominantHand)} */
    @NativeType("EVRInputError")
    public static int VRInput_SetDominantHand(@NativeType("ETrackedControllerRole") int eDominantHand) {
        long __functionAddress = OpenVR.VRInput.SetDominantHand;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callI(eDominantHand, __functionAddress);
    }

    // --- [ VRInput_GetBoneCount ] ---

    /** {@code EVRInputError VRInput_GetBoneCount(VRActionHandle_t action, uint32_t * pBoneCount)} */
    public static int nVRInput_GetBoneCount(long action, long pBoneCount) {
        long __functionAddress = OpenVR.VRInput.GetBoneCount;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callJPI(action, pBoneCount, __functionAddress);
    }

    /** {@code EVRInputError VRInput_GetBoneCount(VRActionHandle_t action, uint32_t * pBoneCount)} */
    @NativeType("EVRInputError")
    public static int VRInput_GetBoneCount(@NativeType("VRActionHandle_t") long action, @NativeType("uint32_t *") IntBuffer pBoneCount) {
        if (CHECKS) {
            check(pBoneCount, 1);
        }
        return nVRInput_GetBoneCount(action, memAddress(pBoneCount));
    }

    // --- [ VRInput_GetBoneHierarchy ] ---

    /** {@code EVRInputError VRInput_GetBoneHierarchy(VRActionHandle_t action, BoneIndex_t * pParentIndices, uint32_t unIndexArrayCount)} */
    public static int nVRInput_GetBoneHierarchy(long action, long pParentIndices, int unIndexArrayCount) {
        long __functionAddress = OpenVR.VRInput.GetBoneHierarchy;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callJPI(action, pParentIndices, unIndexArrayCount, __functionAddress);
    }

    /** {@code EVRInputError VRInput_GetBoneHierarchy(VRActionHandle_t action, BoneIndex_t * pParentIndices, uint32_t unIndexArrayCount)} */
    @NativeType("EVRInputError")
    public static int VRInput_GetBoneHierarchy(@NativeType("VRActionHandle_t") long action, @NativeType("BoneIndex_t *") IntBuffer pParentIndices) {
        return nVRInput_GetBoneHierarchy(action, memAddress(pParentIndices), pParentIndices.remaining());
    }

    // --- [ VRInput_GetBoneName ] ---

    /** {@code EVRInputError VRInput_GetBoneName(VRActionHandle_t action, BoneIndex_t nBoneIndex, char * pchBoneName, uint32_t unNameBufferSize)} */
    public static int nVRInput_GetBoneName(long action, int nBoneIndex, long pchBoneName, int unNameBufferSize) {
        long __functionAddress = OpenVR.VRInput.GetBoneName;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callJPI(action, nBoneIndex, pchBoneName, unNameBufferSize, __functionAddress);
    }

    /** {@code EVRInputError VRInput_GetBoneName(VRActionHandle_t action, BoneIndex_t nBoneIndex, char * pchBoneName, uint32_t unNameBufferSize)} */
    @NativeType("EVRInputError")
    public static int VRInput_GetBoneName(@NativeType("VRActionHandle_t") long action, @NativeType("BoneIndex_t") int nBoneIndex, @NativeType("char *") ByteBuffer pchBoneName) {
        return nVRInput_GetBoneName(action, nBoneIndex, memAddress(pchBoneName), pchBoneName.remaining());
    }

    // --- [ VRInput_GetSkeletalReferenceTransforms ] ---

    /** {@code EVRInputError VRInput_GetSkeletalReferenceTransforms(VRActionHandle_t action, EVRSkeletalTransformSpace eTransformSpace, EVRSkeletalReferencePose eReferencePose, VRBoneTransform_t * pTransformArray, uint32_t unTransformArrayCount)} */
    public static int nVRInput_GetSkeletalReferenceTransforms(long action, int eTransformSpace, int eReferencePose, long pTransformArray, int unTransformArrayCount) {
        long __functionAddress = OpenVR.VRInput.GetSkeletalReferenceTransforms;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callJPI(action, eTransformSpace, eReferencePose, pTransformArray, unTransformArrayCount, __functionAddress);
    }

    /** {@code EVRInputError VRInput_GetSkeletalReferenceTransforms(VRActionHandle_t action, EVRSkeletalTransformSpace eTransformSpace, EVRSkeletalReferencePose eReferencePose, VRBoneTransform_t * pTransformArray, uint32_t unTransformArrayCount)} */
    @NativeType("EVRInputError")
    public static int VRInput_GetSkeletalReferenceTransforms(@NativeType("VRActionHandle_t") long action, @NativeType("EVRSkeletalTransformSpace") int eTransformSpace, @NativeType("EVRSkeletalReferencePose") int eReferencePose, @NativeType("VRBoneTransform_t *") VRBoneTransform.Buffer pTransformArray) {
        return nVRInput_GetSkeletalReferenceTransforms(action, eTransformSpace, eReferencePose, pTransformArray.address(), pTransformArray.remaining());
    }

    // --- [ VRInput_GetSkeletalTrackingLevel ] ---

    /** {@code EVRInputError VRInput_GetSkeletalTrackingLevel(VRActionHandle_t action, EVRSkeletalTrackingLevel * pSkeletalTrackingLevel)} */
    public static int nVRInput_GetSkeletalTrackingLevel(long action, long pSkeletalTrackingLevel) {
        long __functionAddress = OpenVR.VRInput.GetSkeletalTrackingLevel;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callJPI(action, pSkeletalTrackingLevel, __functionAddress);
    }

    /** {@code EVRInputError VRInput_GetSkeletalTrackingLevel(VRActionHandle_t action, EVRSkeletalTrackingLevel * pSkeletalTrackingLevel)} */
    @NativeType("EVRInputError")
    public static int VRInput_GetSkeletalTrackingLevel(@NativeType("VRActionHandle_t") long action, @NativeType("EVRSkeletalTrackingLevel *") IntBuffer pSkeletalTrackingLevel) {
        if (CHECKS) {
            check(pSkeletalTrackingLevel, 1);
        }
        return nVRInput_GetSkeletalTrackingLevel(action, memAddress(pSkeletalTrackingLevel));
    }

    // --- [ VRInput_GetSkeletalBoneData ] ---

    /** {@code EVRInputError VRInput_GetSkeletalBoneData(VRActionHandle_t action, EVRSkeletalTransformSpace eTransformSpace, EVRSkeletalMotionRange eMotionRange, VRBoneTransform_t * pTransformArray, uint32_t unTransformArrayCount)} */
    public static int nVRInput_GetSkeletalBoneData(long action, int eTransformSpace, int eMotionRange, long pTransformArray, int unTransformArrayCount) {
        long __functionAddress = OpenVR.VRInput.GetSkeletalBoneData;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callJPI(action, eTransformSpace, eMotionRange, pTransformArray, unTransformArrayCount, __functionAddress);
    }

    /** {@code EVRInputError VRInput_GetSkeletalBoneData(VRActionHandle_t action, EVRSkeletalTransformSpace eTransformSpace, EVRSkeletalMotionRange eMotionRange, VRBoneTransform_t * pTransformArray, uint32_t unTransformArrayCount)} */
    @NativeType("EVRInputError")
    public static int VRInput_GetSkeletalBoneData(@NativeType("VRActionHandle_t") long action, @NativeType("EVRSkeletalTransformSpace") int eTransformSpace, @NativeType("EVRSkeletalMotionRange") int eMotionRange, @NativeType("VRBoneTransform_t *") VRBoneTransform.Buffer pTransformArray) {
        return nVRInput_GetSkeletalBoneData(action, eTransformSpace, eMotionRange, pTransformArray.address(), pTransformArray.remaining());
    }

    // --- [ VRInput_GetSkeletalSummaryData ] ---

    /** {@code EVRInputError VRInput_GetSkeletalSummaryData(VRActionHandle_t action, EVRSummaryType eSummaryType, VRSkeletalSummaryData_t * pSkeletalSummaryData)} */
    public static int nVRInput_GetSkeletalSummaryData(long action, int eSummaryType, long pSkeletalSummaryData) {
        long __functionAddress = OpenVR.VRInput.GetSkeletalSummaryData;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callJPI(action, eSummaryType, pSkeletalSummaryData, __functionAddress);
    }

    /** {@code EVRInputError VRInput_GetSkeletalSummaryData(VRActionHandle_t action, EVRSummaryType eSummaryType, VRSkeletalSummaryData_t * pSkeletalSummaryData)} */
    @NativeType("EVRInputError")
    public static int VRInput_GetSkeletalSummaryData(@NativeType("VRActionHandle_t") long action, @NativeType("EVRSummaryType") int eSummaryType, @NativeType("VRSkeletalSummaryData_t *") VRSkeletalSummaryData pSkeletalSummaryData) {
        return nVRInput_GetSkeletalSummaryData(action, eSummaryType, pSkeletalSummaryData.address());
    }

    // --- [ VRInput_GetSkeletalBoneDataCompressed ] ---

    /** {@code EVRInputError VRInput_GetSkeletalBoneDataCompressed(VRActionHandle_t action, EVRSkeletalMotionRange eMotionRange, void * pvCompressedData, uint32_t unCompressedSize, uint32_t * punRequiredCompressedSize)} */
    public static int nVRInput_GetSkeletalBoneDataCompressed(long action, int eMotionRange, long pvCompressedData, int unCompressedSize, long punRequiredCompressedSize) {
        long __functionAddress = OpenVR.VRInput.GetSkeletalBoneDataCompressed;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callJPPI(action, eMotionRange, pvCompressedData, unCompressedSize, punRequiredCompressedSize, __functionAddress);
    }

    /** {@code EVRInputError VRInput_GetSkeletalBoneDataCompressed(VRActionHandle_t action, EVRSkeletalMotionRange eMotionRange, void * pvCompressedData, uint32_t unCompressedSize, uint32_t * punRequiredCompressedSize)} */
    @NativeType("EVRInputError")
    public static int VRInput_GetSkeletalBoneDataCompressed(@NativeType("VRActionHandle_t") long action, @NativeType("EVRSkeletalMotionRange") int eMotionRange, @NativeType("void *") @Nullable ByteBuffer pvCompressedData, @NativeType("uint32_t *") @Nullable IntBuffer punRequiredCompressedSize) {
        if (CHECKS) {
            checkSafe(punRequiredCompressedSize, 1);
        }
        return nVRInput_GetSkeletalBoneDataCompressed(action, eMotionRange, memAddressSafe(pvCompressedData), remainingSafe(pvCompressedData), memAddressSafe(punRequiredCompressedSize));
    }

    // --- [ VRInput_DecompressSkeletalBoneData ] ---

    /** {@code EVRInputError VRInput_DecompressSkeletalBoneData(void * pvCompressedBuffer, uint32_t unCompressedBufferSize, EVRSkeletalTransformSpace eTransformSpace, VRBoneTransform_t * pTransformArray, uint32_t unTransformArrayCount)} */
    public static int nVRInput_DecompressSkeletalBoneData(long pvCompressedBuffer, int unCompressedBufferSize, int eTransformSpace, long pTransformArray, int unTransformArrayCount) {
        long __functionAddress = OpenVR.VRInput.DecompressSkeletalBoneData;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPPI(pvCompressedBuffer, unCompressedBufferSize, eTransformSpace, pTransformArray, unTransformArrayCount, __functionAddress);
    }

    /** {@code EVRInputError VRInput_DecompressSkeletalBoneData(void * pvCompressedBuffer, uint32_t unCompressedBufferSize, EVRSkeletalTransformSpace eTransformSpace, VRBoneTransform_t * pTransformArray, uint32_t unTransformArrayCount)} */
    @NativeType("EVRInputError")
    public static int VRInput_DecompressSkeletalBoneData(@NativeType("void *") ByteBuffer pvCompressedBuffer, @NativeType("EVRSkeletalTransformSpace") int eTransformSpace, @NativeType("VRBoneTransform_t *") VRBoneTransform.Buffer pTransformArray) {
        return nVRInput_DecompressSkeletalBoneData(memAddress(pvCompressedBuffer), pvCompressedBuffer.remaining(), eTransformSpace, pTransformArray.address(), pTransformArray.remaining());
    }

    // --- [ VRInput_TriggerHapticVibrationAction ] ---

    /** {@code EVRInputError VRInput_TriggerHapticVibrationAction(VRActionHandle_t action, float fStartSecondsFromNow, float fDurationSeconds, float fFrequency, float fAmplitude, VRInputValueHandle_t ulRestrictToDevice)} */
    @NativeType("EVRInputError")
    public static int VRInput_TriggerHapticVibrationAction(@NativeType("VRActionHandle_t") long action, float fStartSecondsFromNow, float fDurationSeconds, float fFrequency, float fAmplitude, @NativeType("VRInputValueHandle_t") long ulRestrictToDevice) {
        long __functionAddress = OpenVR.VRInput.TriggerHapticVibrationAction;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callJJI(action, fStartSecondsFromNow, fDurationSeconds, fFrequency, fAmplitude, ulRestrictToDevice, __functionAddress);
    }

    // --- [ VRInput_GetActionOrigins ] ---

    /** {@code EVRInputError VRInput_GetActionOrigins(VRActionSetHandle_t actionSetHandle, VRActionHandle_t digitalActionHandle, VRInputValueHandle_t * originsOut, uint32_t originOutCount)} */
    public static int nVRInput_GetActionOrigins(long actionSetHandle, long digitalActionHandle, long originsOut, int originOutCount) {
        long __functionAddress = OpenVR.VRInput.GetActionOrigins;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callJJPI(actionSetHandle, digitalActionHandle, originsOut, originOutCount, __functionAddress);
    }

    /** {@code EVRInputError VRInput_GetActionOrigins(VRActionSetHandle_t actionSetHandle, VRActionHandle_t digitalActionHandle, VRInputValueHandle_t * originsOut, uint32_t originOutCount)} */
    @NativeType("EVRInputError")
    public static int VRInput_GetActionOrigins(@NativeType("VRActionSetHandle_t") long actionSetHandle, @NativeType("VRActionHandle_t") long digitalActionHandle, @NativeType("VRInputValueHandle_t *") LongBuffer originsOut) {
        return nVRInput_GetActionOrigins(actionSetHandle, digitalActionHandle, memAddress(originsOut), originsOut.remaining());
    }

    // --- [ VRInput_GetOriginLocalizedName ] ---

    /** {@code EVRInputError VRInput_GetOriginLocalizedName(VRInputValueHandle_t origin, char * pchNameArray, uint32_t unNameArraySize, int32_t unStringSectionsToInclude)} */
    public static int nVRInput_GetOriginLocalizedName(long origin, long pchNameArray, int unNameArraySize, int unStringSectionsToInclude) {
        long __functionAddress = OpenVR.VRInput.GetOriginLocalizedName;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callJPI(origin, pchNameArray, unNameArraySize, unStringSectionsToInclude, __functionAddress);
    }

    /** {@code EVRInputError VRInput_GetOriginLocalizedName(VRInputValueHandle_t origin, char * pchNameArray, uint32_t unNameArraySize, int32_t unStringSectionsToInclude)} */
    @NativeType("EVRInputError")
    public static int VRInput_GetOriginLocalizedName(@NativeType("VRInputValueHandle_t") long origin, @NativeType("char *") ByteBuffer pchNameArray, @NativeType("int32_t") int unStringSectionsToInclude) {
        return nVRInput_GetOriginLocalizedName(origin, memAddress(pchNameArray), pchNameArray.remaining(), unStringSectionsToInclude);
    }

    // --- [ VRInput_GetOriginTrackedDeviceInfo ] ---

    /** {@code EVRInputError VRInput_GetOriginTrackedDeviceInfo(VRInputValueHandle_t origin, InputOriginInfo_t * pOriginInfo, uint32_t unOriginInfoSize)} */
    public static int nVRInput_GetOriginTrackedDeviceInfo(long origin, long pOriginInfo, int unOriginInfoSize) {
        long __functionAddress = OpenVR.VRInput.GetOriginTrackedDeviceInfo;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callJPI(origin, pOriginInfo, unOriginInfoSize, __functionAddress);
    }

    /** {@code EVRInputError VRInput_GetOriginTrackedDeviceInfo(VRInputValueHandle_t origin, InputOriginInfo_t * pOriginInfo, uint32_t unOriginInfoSize)} */
    @NativeType("EVRInputError")
    public static int VRInput_GetOriginTrackedDeviceInfo(@NativeType("VRInputValueHandle_t") long origin, @NativeType("InputOriginInfo_t *") InputOriginInfo pOriginInfo, @NativeType("uint32_t") int unOriginInfoSize) {
        return nVRInput_GetOriginTrackedDeviceInfo(origin, pOriginInfo.address(), unOriginInfoSize);
    }

    /** {@code EVRInputError VRInput_GetOriginTrackedDeviceInfo(VRInputValueHandle_t origin, InputOriginInfo_t * pOriginInfo, uint32_t unOriginInfoSize)} */
    @NativeType("EVRInputError")
    public static int VRInput_GetOriginTrackedDeviceInfo(@NativeType("VRInputValueHandle_t") long origin, @NativeType("InputOriginInfo_t *") InputOriginInfo pOriginInfo) {
        return nVRInput_GetOriginTrackedDeviceInfo(origin, pOriginInfo.address(), InputOriginInfo.SIZEOF);
    }

    // --- [ VRInput_GetActionBindingInfo ] ---

    /** {@code EVRInputError VRInput_GetActionBindingInfo(VRActionHandle_t action, InputBindingInfo_t * pOriginInfo, uint32_t unBindingInfoSize, uint32_t unBindingInfoCount, uint32_t * punReturnedBindingInfoCount)} */
    public static int nVRInput_GetActionBindingInfo(long action, long pOriginInfo, int unBindingInfoSize, int unBindingInfoCount, long punReturnedBindingInfoCount) {
        long __functionAddress = OpenVR.VRInput.GetActionBindingInfo;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callJPPI(action, pOriginInfo, unBindingInfoSize, unBindingInfoCount, punReturnedBindingInfoCount, __functionAddress);
    }

    /** {@code EVRInputError VRInput_GetActionBindingInfo(VRActionHandle_t action, InputBindingInfo_t * pOriginInfo, uint32_t unBindingInfoSize, uint32_t unBindingInfoCount, uint32_t * punReturnedBindingInfoCount)} */
    @NativeType("EVRInputError")
    public static int VRInput_GetActionBindingInfo(@NativeType("VRActionHandle_t") long action, @NativeType("InputBindingInfo_t *") InputBindingInfo.Buffer pOriginInfo, @NativeType("uint32_t *") IntBuffer punReturnedBindingInfoCount) {
        if (CHECKS) {
            check(punReturnedBindingInfoCount, 1);
        }
        return nVRInput_GetActionBindingInfo(action, pOriginInfo.address(), InputBindingInfo.SIZEOF, pOriginInfo.remaining(), memAddress(punReturnedBindingInfoCount));
    }

    // --- [ VRInput_ShowActionOrigins ] ---

    /** {@code EVRInputError VRInput_ShowActionOrigins(VRActionSetHandle_t actionSetHandle, VRActionHandle_t ulActionHandle)} */
    @NativeType("EVRInputError")
    public static int VRInput_ShowActionOrigins(@NativeType("VRActionSetHandle_t") long actionSetHandle, @NativeType("VRActionHandle_t") long ulActionHandle) {
        long __functionAddress = OpenVR.VRInput.ShowActionOrigins;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callJJI(actionSetHandle, ulActionHandle, __functionAddress);
    }

    // --- [ VRInput_ShowBindingsForActionSet ] ---

    /** {@code EVRInputError VRInput_ShowBindingsForActionSet(VRActiveActionSet_t * pSets, uint32_t unSizeOfVRSelectedActionSet_t, uint32_t unSetCount, VRInputValueHandle_t originToHighlight)} */
    public static int nVRInput_ShowBindingsForActionSet(long pSets, int unSizeOfVRSelectedActionSet_t, int unSetCount, long originToHighlight) {
        long __functionAddress = OpenVR.VRInput.ShowBindingsForActionSet;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPJI(pSets, unSizeOfVRSelectedActionSet_t, unSetCount, originToHighlight, __functionAddress);
    }

    /** {@code EVRInputError VRInput_ShowBindingsForActionSet(VRActiveActionSet_t * pSets, uint32_t unSizeOfVRSelectedActionSet_t, uint32_t unSetCount, VRInputValueHandle_t originToHighlight)} */
    @NativeType("EVRInputError")
    public static int VRInput_ShowBindingsForActionSet(@NativeType("VRActiveActionSet_t *") VRActiveActionSet.Buffer pSets, @NativeType("uint32_t") int unSizeOfVRSelectedActionSet_t, @NativeType("VRInputValueHandle_t") long originToHighlight) {
        return nVRInput_ShowBindingsForActionSet(pSets.address(), unSizeOfVRSelectedActionSet_t, pSets.remaining(), originToHighlight);
    }

    // --- [ VRInput_GetComponentStateForBinding ] ---

    /** {@code EVRInputError VRInput_GetComponentStateForBinding(char const * pchRenderModelName, char const * pchComponentName, InputBindingInfo_t const * pOriginInfo, uint32_t unBindingInfoSize, uint32_t unBindingInfoCount, RenderModel_ComponentState_t * pComponentState)} */
    public static int nVRInput_GetComponentStateForBinding(long pchRenderModelName, long pchComponentName, long pOriginInfo, int unBindingInfoSize, int unBindingInfoCount, long pComponentState) {
        long __functionAddress = OpenVR.VRInput.GetComponentStateForBinding;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPPPPI(pchRenderModelName, pchComponentName, pOriginInfo, unBindingInfoSize, unBindingInfoCount, pComponentState, __functionAddress);
    }

    /** {@code EVRInputError VRInput_GetComponentStateForBinding(char const * pchRenderModelName, char const * pchComponentName, InputBindingInfo_t const * pOriginInfo, uint32_t unBindingInfoSize, uint32_t unBindingInfoCount, RenderModel_ComponentState_t * pComponentState)} */
    @NativeType("EVRInputError")
    public static int VRInput_GetComponentStateForBinding(@NativeType("char const *") ByteBuffer pchRenderModelName, @NativeType("char const *") ByteBuffer pchComponentName, @NativeType("InputBindingInfo_t const *") InputBindingInfo.Buffer pOriginInfo, @NativeType("RenderModel_ComponentState_t *") RenderModelComponentState.Buffer pComponentState) {
        if (CHECKS) {
            checkNT1(pchRenderModelName);
            checkNT1(pchComponentName);
            check(pComponentState, 1);
        }
        return nVRInput_GetComponentStateForBinding(memAddress(pchRenderModelName), memAddress(pchComponentName), pOriginInfo.address(), InputBindingInfo.SIZEOF, pOriginInfo.remaining(), pComponentState.address());
    }

    /** {@code EVRInputError VRInput_GetComponentStateForBinding(char const * pchRenderModelName, char const * pchComponentName, InputBindingInfo_t const * pOriginInfo, uint32_t unBindingInfoSize, uint32_t unBindingInfoCount, RenderModel_ComponentState_t * pComponentState)} */
    @NativeType("EVRInputError")
    public static int VRInput_GetComponentStateForBinding(@NativeType("char const *") CharSequence pchRenderModelName, @NativeType("char const *") CharSequence pchComponentName, @NativeType("InputBindingInfo_t const *") InputBindingInfo.Buffer pOriginInfo, @NativeType("RenderModel_ComponentState_t *") RenderModelComponentState.Buffer pComponentState) {
        if (CHECKS) {
            check(pComponentState, 1);
        }
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nASCII(pchRenderModelName, true);
            long pchRenderModelNameEncoded = stack.getPointerAddress();
            stack.nASCII(pchComponentName, true);
            long pchComponentNameEncoded = stack.getPointerAddress();
            return nVRInput_GetComponentStateForBinding(pchRenderModelNameEncoded, pchComponentNameEncoded, pOriginInfo.address(), InputBindingInfo.SIZEOF, pOriginInfo.remaining(), pComponentState.address());
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ VRInput_OpenBindingUI ] ---

    /** {@code EVRInputError VRInput_OpenBindingUI(char const * pchAppKey, VRActionSetHandle_t ulActionSetHandle, VRInputValueHandle_t ulDeviceHandle, bool bShowOnDesktop)} */
    public static int nVRInput_OpenBindingUI(long pchAppKey, long ulActionSetHandle, long ulDeviceHandle, boolean bShowOnDesktop) {
        long __functionAddress = OpenVR.VRInput.OpenBindingUI;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPJJI(pchAppKey, ulActionSetHandle, ulDeviceHandle, bShowOnDesktop, __functionAddress);
    }

    /** {@code EVRInputError VRInput_OpenBindingUI(char const * pchAppKey, VRActionSetHandle_t ulActionSetHandle, VRInputValueHandle_t ulDeviceHandle, bool bShowOnDesktop)} */
    @NativeType("EVRInputError")
    public static int VRInput_OpenBindingUI(@NativeType("char const *") ByteBuffer pchAppKey, @NativeType("VRActionSetHandle_t") long ulActionSetHandle, @NativeType("VRInputValueHandle_t") long ulDeviceHandle, @NativeType("bool") boolean bShowOnDesktop) {
        if (CHECKS) {
            checkNT1(pchAppKey);
        }
        return nVRInput_OpenBindingUI(memAddress(pchAppKey), ulActionSetHandle, ulDeviceHandle, bShowOnDesktop);
    }

    /** {@code EVRInputError VRInput_OpenBindingUI(char const * pchAppKey, VRActionSetHandle_t ulActionSetHandle, VRInputValueHandle_t ulDeviceHandle, bool bShowOnDesktop)} */
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

    // --- [ VRInput_GetBindingVariant ] ---

    /** {@code EVRInputError VRInput_GetBindingVariant(VRInputValueHandle_t ulDevicePath, char * pchVariantArray, uint32_t unVariantArraySize)} */
    public static int nVRInput_GetBindingVariant(long ulDevicePath, long pchVariantArray, int unVariantArraySize) {
        long __functionAddress = OpenVR.VRInput.GetBindingVariant;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callJPI(ulDevicePath, pchVariantArray, unVariantArraySize, __functionAddress);
    }

    /** {@code EVRInputError VRInput_GetBindingVariant(VRInputValueHandle_t ulDevicePath, char * pchVariantArray, uint32_t unVariantArraySize)} */
    @NativeType("EVRInputError")
    public static int VRInput_GetBindingVariant(@NativeType("VRInputValueHandle_t") long ulDevicePath, @NativeType("char *") ByteBuffer pchVariantArray) {
        return nVRInput_GetBindingVariant(ulDevicePath, memAddress(pchVariantArray), pchVariantArray.remaining());
    }

}