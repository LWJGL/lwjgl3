/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package openvr.templates

import org.lwjgl.generator.*
import openvr.*

val VRInput = "VRInput".nativeClass(
    Module.OPENVR,
    prefixMethod = "VRInput_",
    library = OPENVR_LIBRARY,
    binding = OPENVR_FNTABLE_BINDING
) {
    documentation =
        """
        """

    EVRInputError(
        "SetActionManifestPath",
        """
        Sets the path to the action manifest JSON file that is used by this application. If this information was set on the Steam partner site, calls to this
        function are ignored. If the Steam partner site setting and the path provided by this call are different,
        #EVRInputError_VRInputError_MismatchedActionManifest is returned.

        This call must be made before the first call to #UpdateActionState() or #PollNextEvent().
        """,

        charASCII.const.p.IN("pchActionManifestPath", "")
    )

    EVRInputError(
        "GetActionSetHandle",
        "Returns a handle for an action set. This handle is used for all performance-sensitive calls.",

        charASCII.const.p.IN("pchActionSetName", ""),
        Check(1)..VRActionSetHandle_t.p.OUT("pHandle", "")
    )

    EVRInputError(
        "GetActionHandle",
        "Returns a handle for an action. This handle is used for all performance-sensitive calls.",

        charASCII.const.p.IN("pchActionName", ""),
        Check(1)..VRActionHandle_t.p.OUT("pHandle", "")
    )

    EVRInputError(
        "GetInputSourceHandle",
        "Returns a handle for any path in the input system. E.g. {@code /user/hand/right}.",

        charASCII.const.p.IN("pchInputSourcePath", ""),
        Check(1)..VRInputValueHandle_t.p.OUT("pHandle", "")
    )

    EVRInputError(
        "UpdateActionState",
        """
        Reads the current state into all actions. After this call, the results of {@code Get*Action} calls will be the same until the next call to
        {@code UpdateActionState}.
        """,

        VRActiveActionSet_t.p.INOUT("pSets", ""),
        uint32_t.IN("unSizeOfVRSelectedActionSet_t", ""),
        AutoSize("pSets")..uint32_t.IN("unSetCount", "")
    )

    EVRInputError(
        "GetDigitalActionData",
        """
        Reads the state of a digital action given its handle. This will return #EVRInputError_VRInputError_WrongType if the type of action is something other
        than digital.
        """,

        VRActionHandle_t.IN("action", ""),
        InputDigitalActionData_t.p.OUT("pActionData", ""),
        AutoSize("pActionData")..uint32_t.IN("unActionDataSize", "")
    )

    EVRInputError(
        "GetAnalogActionData",
        """
        Reads the state of an analog action given its handle. This will return #EVRInputError_VRInputError_WrongType if the type of action is something other
        than analog.
        """,

        VRActionHandle_t.IN("action", ""),
        InputAnalogActionData_t.p.OUT("pActionData", ""),
        AutoSize("pActionData")..uint32_t.IN("unActionDataSize", "")
    )

    EVRInputError(
        "GetPoseActionData",
        "Reads the state of a pose action given its handle.",

        VRActionHandle_t.IN("action", ""),
        ETrackingUniverseOrigin.IN("eOrigin", "", "ETrackingUniverseOrigin_\\w+"),
        float.IN("fPredictedSecondsFromNow", ""),
        InputPoseActionData_t.p.OUT("pActionData", ""),
        AutoSize("pActionData")..uint32_t.IN("unActionDataSize", "")
    )

    EVRInputError(
        "GetSkeletalActionData",
        "Reads the state of a skeletal action given its handle.",

        VRActionHandle_t.IN("action", ""),
        EVRSkeletalTransformSpace.IN("eBoneParent", "", "EVRSkeletalTransformSpace_\\w+"),
        float.IN("fPredictedSecondsFromNow", ""),
        InputSkeletonActionData_t.p.OUT("pActionData", ""),
        AutoSize("pActionData")..uint32_t.IN("unActionDataSize", ""),
        VRBoneTransform_t.p.OUT("pTransformArray", ""),
        AutoSize("pTransformArray")..uint32_t.IN("unTransformArrayCount", "")
    )

    EVRInputError(
        "GetSkeletalActionDataCompressed",
        """
        Reads the state of a skeletal action given its handle in a compressed form that is suitable for sending over the network. The required buffer size will
        never exceed ({@code sizeof(VR_BoneTransform_t)*boneCount + 2}). Usually the size will be much smaller.
        """,

        VRActionHandle_t.IN("action", ""),
        EVRSkeletalTransformSpace.IN("eBoneParent", "", "EVRSkeletalTransformSpace_\\w+"),
        float.IN("fPredictedSecondsFromNow", ""),
        nullable..void.p.OUT("pvCompressedData", ""),
        AutoSize("pvCompressedData")..uint32_t.IN("unCompressedSize", ""),
        Check(1)..nullable..uint32_t.p.OUT("punRequiredCompressedSize", "")
    )

    EVRInputError(
        "UncompressSkeletalActionData",
        "Turns a compressed buffer from #GetSkeletalActionDataCompressed() and turns it back into a bone transform array.",

        void.p.IN("pvCompressedBuffer", ""),
        AutoSize("pvCompressedBuffer")..uint32_t.IN("unCompressedBufferSize", ""),
        Check(1)..EVRSkeletalTransformSpace.p.OUT("peBoneParent", ""),
        VRBoneTransform_t.p.OUT("pTransformArray", ""),
        AutoSize("pTransformArray")..uint32_t.IN("unTransformArrayCount", "")
    )

    EVRInputError(
        "TriggerHapticVibrationAction",
        "Triggers a haptic event as described by the specified action.",

        VRActionHandle_t.IN("action", ""),
        float.IN("fStartSecondsFromNow", ""),
        float.IN("fDurationSeconds", ""),
        float.IN("fFrequency", ""),
        float.IN("fAmplitude", "")
    )

    EVRInputError(
        "GetActionOrigins",
        "Retrieve origin handles for an action.",

        VRActionSetHandle_t.IN("actionSetHandle", ""),
        VRActionHandle_t.IN("digitalActionHandle", ""),
        VRInputValueHandle_t.p.OUT("originsOut", ""),
        AutoSize("originsOut")..uint32_t.IN("originOutCount", "")
    )

    EVRInputError(
        "GetOriginLocalizedName",
        "Retrieves the name of the origin in the current language.",

        VRInputValueHandle_t.IN("origin", ""),
        charASCII.p.OUT("pchNameArray", ""),
        AutoSize("pchNameArray")..uint32_t.IN("unNameArraySize", "")
    )

    EVRInputError(
        "GetOriginTrackedDeviceInfo",
        "Retrieves useful information for the origin of this action.",

        VRInputValueHandle_t.IN("origin", ""),
        InputOriginInfo_t.p.OUT("pOriginInfo", ""),
        AutoSize("pOriginInfo")..uint32_t.IN("unOriginInfoSize", "")
    )

    EVRInputError(
        "ShowActionOrigins",
        "Shows the current binding for the action in-headset.",

        VRActionSetHandle_t.IN("actionSetHandle", ""),
        VRActionHandle_t.IN("ulActionHandle", "")
    )

    EVRInputError(
        "ShowBindingsForActionSet",
        "Shows the current binding all the actions in the specified action sets.",

        VRActiveActionSet_t.p.IN("pSets", ""),
        uint32_t.IN("unSizeOfVRSelectedActionSet_t", ""),
        AutoSize("pSets")..uint32_t.IN("unSetCount", ""),
        VRInputValueHandle_t.IN("originToHighlight", "")
    )
}