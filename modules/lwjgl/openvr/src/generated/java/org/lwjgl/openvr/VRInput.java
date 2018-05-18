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
     *
     * @param pchActionManifestPath 
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
     *
     * @param pchActionManifestPath 
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

    /**
     * Returns a handle for an action set. This handle is used for all performance-sensitive calls.
     *
     * @param pchActionSetName 
     * @param pHandle          
     */
    @NativeType("EVRInputError")
    public static int VRInput_GetActionSetHandle(@NativeType("char const *") ByteBuffer pchActionSetName, @NativeType("VRActionSetHandle_t *") LongBuffer pHandle) {
        if (CHECKS) {
            checkNT1(pchActionSetName);
            check(pHandle, 1);
        }
        return nVRInput_GetActionSetHandle(memAddress(pchActionSetName), memAddress(pHandle));
    }

    /**
     * Returns a handle for an action set. This handle is used for all performance-sensitive calls.
     *
     * @param pchActionSetName 
     * @param pHandle          
     */
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

    /**
     * Returns a handle for an action. This handle is used for all performance-sensitive calls.
     *
     * @param pchActionName 
     * @param pHandle       
     */
    @NativeType("EVRInputError")
    public static int VRInput_GetActionHandle(@NativeType("char const *") ByteBuffer pchActionName, @NativeType("VRActionHandle_t *") LongBuffer pHandle) {
        if (CHECKS) {
            checkNT1(pchActionName);
            check(pHandle, 1);
        }
        return nVRInput_GetActionHandle(memAddress(pchActionName), memAddress(pHandle));
    }

    /**
     * Returns a handle for an action. This handle is used for all performance-sensitive calls.
     *
     * @param pchActionName 
     * @param pHandle       
     */
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

    /**
     * Returns a handle for any path in the input system. E.g. {@code /user/hand/right}.
     *
     * @param pchInputSourcePath 
     * @param pHandle            
     */
    @NativeType("EVRInputError")
    public static int VRInput_GetInputSourceHandle(@NativeType("char const *") ByteBuffer pchInputSourcePath, @NativeType("VRInputValueHandle_t *") LongBuffer pHandle) {
        if (CHECKS) {
            checkNT1(pchInputSourcePath);
            check(pHandle, 1);
        }
        return nVRInput_GetInputSourceHandle(memAddress(pchInputSourcePath), memAddress(pHandle));
    }

    /**
     * Returns a handle for any path in the input system. E.g. {@code /user/hand/right}.
     *
     * @param pchInputSourcePath 
     * @param pHandle            
     */
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
     *
     * @param pSets                         
     * @param unSizeOfVRSelectedActionSet_t 
     */
    @NativeType("EVRInputError")
    public static int VRInput_UpdateActionState(@NativeType("VRActiveActionSet_t *") VRActiveActionSet.Buffer pSets, @NativeType("uint32_t") int unSizeOfVRSelectedActionSet_t) {
        return nVRInput_UpdateActionState(pSets.address(), unSizeOfVRSelectedActionSet_t, pSets.remaining());
    }

    // --- [ VRInput_GetDigitalActionData ] ---

    /** Unsafe version of: {@link #VRInput_GetDigitalActionData GetDigitalActionData} */
    public static int nVRInput_GetDigitalActionData(long action, long pActionData, int unActionDataSize) {
        long __functionAddress = OpenVR.VRInput.GetDigitalActionData;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callJPI(__functionAddress, action, pActionData, unActionDataSize);
    }

    /**
     * Reads the state of a digital action given its handle. This will return {@link VR#EVRInputError_VRInputError_WrongType} if the type of action is something other
     * than digital.
     *
     * @param action      
     * @param pActionData 
     */
    @NativeType("EVRInputError")
    public static int VRInput_GetDigitalActionData(@NativeType("VRActionHandle_t") long action, @NativeType("InputDigitalActionData_t *") InputDigitalActionData.Buffer pActionData) {
        return nVRInput_GetDigitalActionData(action, pActionData.address(), pActionData.remaining());
    }

    // --- [ VRInput_GetAnalogActionData ] ---

    /** Unsafe version of: {@link #VRInput_GetAnalogActionData GetAnalogActionData} */
    public static int nVRInput_GetAnalogActionData(long action, long pActionData, int unActionDataSize) {
        long __functionAddress = OpenVR.VRInput.GetAnalogActionData;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callJPI(__functionAddress, action, pActionData, unActionDataSize);
    }

    /**
     * Reads the state of an analog action given its handle. This will return {@link VR#EVRInputError_VRInputError_WrongType} if the type of action is something other
     * than analog.
     *
     * @param action      
     * @param pActionData 
     */
    @NativeType("EVRInputError")
    public static int VRInput_GetAnalogActionData(@NativeType("VRActionHandle_t") long action, @NativeType("InputAnalogActionData_t *") InputAnalogActionData.Buffer pActionData) {
        return nVRInput_GetAnalogActionData(action, pActionData.address(), pActionData.remaining());
    }

    // --- [ VRInput_GetPoseActionData ] ---

    /** Unsafe version of: {@link #VRInput_GetPoseActionData GetPoseActionData} */
    public static int nVRInput_GetPoseActionData(long action, int eOrigin, float fPredictedSecondsFromNow, long pActionData, int unActionDataSize) {
        long __functionAddress = OpenVR.VRInput.GetPoseActionData;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callJPI(__functionAddress, action, eOrigin, fPredictedSecondsFromNow, pActionData, unActionDataSize);
    }

    /**
     * Reads the state of a pose action given its handle.
     *
     * @param action                   
     * @param eOrigin                  one of:<br><table><tr><td>{@link VR#ETrackingUniverseOrigin_TrackingUniverseSeated}</td></tr><tr><td>{@link VR#ETrackingUniverseOrigin_TrackingUniverseStanding}</td></tr><tr><td>{@link VR#ETrackingUniverseOrigin_TrackingUniverseRawAndUncalibrated}</td></tr></table>
     * @param fPredictedSecondsFromNow 
     * @param pActionData              
     */
    @NativeType("EVRInputError")
    public static int VRInput_GetPoseActionData(@NativeType("VRActionHandle_t") long action, @NativeType("ETrackingUniverseOrigin") int eOrigin, float fPredictedSecondsFromNow, @NativeType("InputPoseActionData_t *") InputPoseActionData.Buffer pActionData) {
        return nVRInput_GetPoseActionData(action, eOrigin, fPredictedSecondsFromNow, pActionData.address(), pActionData.remaining());
    }

    // --- [ VRInput_GetSkeletalActionData ] ---

    /** Unsafe version of: {@link #VRInput_GetSkeletalActionData GetSkeletalActionData} */
    public static int nVRInput_GetSkeletalActionData(long action, int eBoneParent, float fPredictedSecondsFromNow, long pActionData, int unActionDataSize, long pTransformArray, int unTransformArrayCount) {
        long __functionAddress = OpenVR.VRInput.GetSkeletalActionData;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callJPPI(__functionAddress, action, eBoneParent, fPredictedSecondsFromNow, pActionData, unActionDataSize, pTransformArray, unTransformArrayCount);
    }

    /**
     * Reads the state of a skeletal action given its handle.
     *
     * @param action                   
     * @param eBoneParent              one of:<br><table><tr><td>{@link VR#EVRSkeletalTransformSpace_VRSkeletalTransformSpace_Action}</td></tr><tr><td>{@link VR#EVRSkeletalTransformSpace_VRSkeletalTransformSpace_Parent}</td></tr><tr><td>{@link VR#EVRSkeletalTransformSpace_VRSkeletalTransformSpace_Additive}</td></tr></table>
     * @param fPredictedSecondsFromNow 
     * @param pActionData              
     * @param pTransformArray          
     */
    @NativeType("EVRInputError")
    public static int VRInput_GetSkeletalActionData(@NativeType("VRActionHandle_t") long action, @NativeType("EVRSkeletalTransformSpace") int eBoneParent, float fPredictedSecondsFromNow, @NativeType("InputSkeletonActionData_t *") InputSkeletonActionData.Buffer pActionData, @NativeType("VRBoneTransform_t *") VRBoneTransform_.Buffer pTransformArray) {
        return nVRInput_GetSkeletalActionData(action, eBoneParent, fPredictedSecondsFromNow, pActionData.address(), pActionData.remaining(), pTransformArray.address(), pTransformArray.remaining());
    }

    // --- [ VRInput_GetSkeletalActionDataCompressed ] ---

    /** Unsafe version of: {@link #VRInput_GetSkeletalActionDataCompressed GetSkeletalActionDataCompressed} */
    public static int nVRInput_GetSkeletalActionDataCompressed(long action, int eBoneParent, float fPredictedSecondsFromNow, long pvCompressedData, int unCompressedSize, long punRequiredCompressedSize) {
        long __functionAddress = OpenVR.VRInput.GetSkeletalActionDataCompressed;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callJPPI(__functionAddress, action, eBoneParent, fPredictedSecondsFromNow, pvCompressedData, unCompressedSize, punRequiredCompressedSize);
    }

    /**
     * Reads the state of a skeletal action given its handle in a compressed form that is suitable for sending over the network. The required buffer size will
     * never exceed ({@code sizeof(VR_BoneTransform_t)*boneCount + 2}). Usually the size will be much smaller.
     *
     * @param action                    
     * @param eBoneParent               one of:<br><table><tr><td>{@link VR#EVRSkeletalTransformSpace_VRSkeletalTransformSpace_Action}</td></tr><tr><td>{@link VR#EVRSkeletalTransformSpace_VRSkeletalTransformSpace_Parent}</td></tr><tr><td>{@link VR#EVRSkeletalTransformSpace_VRSkeletalTransformSpace_Additive}</td></tr></table>
     * @param fPredictedSecondsFromNow  
     * @param pvCompressedData          
     * @param punRequiredCompressedSize 
     */
    @NativeType("EVRInputError")
    public static int VRInput_GetSkeletalActionDataCompressed(@NativeType("VRActionHandle_t") long action, @NativeType("EVRSkeletalTransformSpace") int eBoneParent, float fPredictedSecondsFromNow, @Nullable @NativeType("void *") ByteBuffer pvCompressedData, @Nullable @NativeType("uint32_t *") IntBuffer punRequiredCompressedSize) {
        if (CHECKS) {
            checkSafe(punRequiredCompressedSize, 1);
        }
        return nVRInput_GetSkeletalActionDataCompressed(action, eBoneParent, fPredictedSecondsFromNow, memAddressSafe(pvCompressedData), remainingSafe(pvCompressedData), memAddressSafe(punRequiredCompressedSize));
    }

    // --- [ VRInput_UncompressSkeletalActionData ] ---

    /** Unsafe version of: {@link #VRInput_UncompressSkeletalActionData UncompressSkeletalActionData} */
    public static int nVRInput_UncompressSkeletalActionData(long pvCompressedBuffer, int unCompressedBufferSize, long peBoneParent, long pTransformArray, int unTransformArrayCount) {
        long __functionAddress = OpenVR.VRInput.UncompressSkeletalActionData;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPPPI(__functionAddress, pvCompressedBuffer, unCompressedBufferSize, peBoneParent, pTransformArray, unTransformArrayCount);
    }

    /**
     * Turns a compressed buffer from {@link #VRInput_GetSkeletalActionDataCompressed GetSkeletalActionDataCompressed} and turns it back into a bone transform array.
     *
     * @param pvCompressedBuffer 
     * @param peBoneParent       
     * @param pTransformArray    
     */
    @NativeType("EVRInputError")
    public static int VRInput_UncompressSkeletalActionData(@NativeType("void *") ByteBuffer pvCompressedBuffer, @NativeType("EVRSkeletalTransformSpace *") IntBuffer peBoneParent, @NativeType("VRBoneTransform_t *") VRBoneTransform_.Buffer pTransformArray) {
        if (CHECKS) {
            check(peBoneParent, 1);
        }
        return nVRInput_UncompressSkeletalActionData(memAddress(pvCompressedBuffer), pvCompressedBuffer.remaining(), memAddress(peBoneParent), pTransformArray.address(), pTransformArray.remaining());
    }

    // --- [ VRInput_TriggerHapticVibrationAction ] ---

    /**
     * Triggers a haptic event as described by the specified action.
     *
     * @param action               
     * @param fStartSecondsFromNow 
     * @param fDurationSeconds     
     * @param fFrequency           
     * @param fAmplitude           
     */
    @NativeType("EVRInputError")
    public static int VRInput_TriggerHapticVibrationAction(@NativeType("VRActionHandle_t") long action, float fStartSecondsFromNow, float fDurationSeconds, float fFrequency, float fAmplitude) {
        long __functionAddress = OpenVR.VRInput.TriggerHapticVibrationAction;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callJI(__functionAddress, action, fStartSecondsFromNow, fDurationSeconds, fFrequency, fAmplitude);
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

    /**
     * Retrieve origin handles for an action.
     *
     * @param actionSetHandle     
     * @param digitalActionHandle 
     * @param originsOut          
     */
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

    /**
     * Retrieves the name of the origin in the current language.
     *
     * @param origin       
     * @param pchNameArray 
     */
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

    /**
     * Retrieves useful information for the origin of this action.
     *
     * @param origin      
     * @param pOriginInfo 
     */
    @NativeType("EVRInputError")
    public static int VRInput_GetOriginTrackedDeviceInfo(@NativeType("VRInputValueHandle_t") long origin, @NativeType("InputOriginInfo_t *") InputOriginInfo.Buffer pOriginInfo) {
        return nVRInput_GetOriginTrackedDeviceInfo(origin, pOriginInfo.address(), pOriginInfo.remaining());
    }

    // --- [ VRInput_ShowActionOrigins ] ---

    /**
     * Shows the current binding for the action in-headset.
     *
     * @param actionSetHandle 
     * @param ulActionHandle  
     */
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

    /**
     * Shows the current binding all the actions in the specified action sets.
     *
     * @param pSets                         
     * @param unSizeOfVRSelectedActionSet_t 
     * @param originToHighlight             
     */
    @NativeType("EVRInputError")
    public static int VRInput_ShowBindingsForActionSet(@NativeType("VRActiveActionSet_t *") VRActiveActionSet.Buffer pSets, @NativeType("uint32_t") int unSizeOfVRSelectedActionSet_t, @NativeType("VRInputValueHandle_t") long originToHighlight) {
        return nVRInput_ShowBindingsForActionSet(pSets.address(), unSizeOfVRSelectedActionSet_t, pSets.remaining(), originToHighlight);
    }

}