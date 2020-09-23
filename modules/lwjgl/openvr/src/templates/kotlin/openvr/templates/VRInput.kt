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

        charASCII.const.p("pchActionManifestPath", "")
    )

    EVRInputError(
        "GetActionSetHandle",
        "Returns a handle for an action set. This handle is used for all performance-sensitive calls.",

        charASCII.const.p("pchActionSetName", ""),
        Check(1)..VRActionSetHandle_t.p("pHandle", "")
    )

    EVRInputError(
        "GetActionHandle",
        "Returns a handle for an action. This handle is used for all performance-sensitive calls.",

        charASCII.const.p("pchActionName", ""),
        Check(1)..VRActionHandle_t.p("pHandle", "")
    )

    EVRInputError(
        "GetInputSourceHandle",
        "Returns a handle for any path in the input system. E.g. {@code /user/hand/right}.",

        charASCII.const.p("pchInputSourcePath", ""),
        Check(1)..VRInputValueHandle_t.p("pHandle", "")
    )

    EVRInputError(
        "UpdateActionState",
        """
        Reads the current state into all actions. After this call, the results of {@code Get*Action} calls will be the same until the next call to
        {@code UpdateActionState}.
        """,

        VRActiveActionSet_t.p("pSets", ""),
        uint32_t("unSizeOfVRSelectedActionSet_t", ""),
        AutoSize("pSets")..uint32_t("unSetCount", "")
    )

    EVRInputError(
        "GetDigitalActionData",
        """
        Reads the state of a digital action given its handle. This will return #EVRInputError_VRInputError_WrongType if the type of action is something other
        than digital.
        """,

        VRActionHandle_t("action", ""),
        InputDigitalActionData_t.p("pActionData", ""),
        Expression("InputDigitalActionData.SIZEOF")..uint32_t("unActionDataSize", ""),
        VRInputValueHandle_t("ulRestrictToDevice", "")
    )

    EVRInputError(
        "GetAnalogActionData",
        """
        Reads the state of an analog action given its handle. This will return #EVRInputError_VRInputError_WrongType if the type of action is something other
        than analog.
        """,

        VRActionHandle_t("action", ""),
        InputAnalogActionData_t.p("pActionData", ""),
        Expression("InputAnalogActionData.SIZEOF")..uint32_t("unActionDataSize", ""),
        VRInputValueHandle_t("ulRestrictToDevice", "")
    )

    EVRInputError(
        "GetPoseActionDataRelativeToNow",
        """
        Reads the state of a pose action given its handle for the number of seconds relative to now.
        
        This will generally be called with negative times from the {@code fUpdateTime} fields in other actions.
        """,

        VRActionHandle_t("action", ""),
        ETrackingUniverseOrigin("eOrigin", "", "ETrackingUniverseOrigin_\\w+"),
        float("fPredictedSecondsFromNow", ""),
        InputPoseActionData_t.p("pActionData", ""),
        Expression("InputPoseActionData.SIZEOF")..uint32_t("unActionDataSize", ""),
        VRInputValueHandle_t("ulRestrictToDevice", "")
    )

    EVRInputError(
        "GetPoseActionDataForNextFrame",
        """
        Reads the state of a pose action given its handle.

        The returned values will match the values returned by the last call to #WaitGetPoses().
        """,

        VRActionHandle_t("action", ""),
        ETrackingUniverseOrigin("eOrigin", "", "ETrackingUniverseOrigin_\\w+"),
        InputPoseActionData_t.p("pActionData", ""),
        Expression("InputPoseActionData.SIZEOF")..uint32_t("unActionDataSize", ""),
        VRInputValueHandle_t("ulRestrictToDevice", "")
    )

    EVRInputError(
        "GetSkeletalActionData",
        "Reads the state of a skeletal action given its handle.",

        VRActionHandle_t("action", ""),
        InputSkeletalActionData_t.p("pActionData", ""),
        Expression("InputSkeletalActionData.SIZEOF")..uint32_t("unActionDataSize", "")
    )

    EVRInputError(
        "GetDominantHand",
        """
        Returns the current dominant hand for the user for this application.

        This function will only return success for applications which include {@code "supports_dominant_hand_setting": true} in their action manifests. The
        dominant hand will only change after a call to #UpdateActionState(), and the action data returned after that point will use the new dominant hand.
        """,

        Check(1)..ETrackedControllerRole.p("peDominantHand", "")
    )

    EVRInputError(
        "SetDominantHand",
        "Sets the dominant hand for the user for this application.",

        ETrackedControllerRole("eDominantHand", "", "ETrackedControllerRole_\\w+")
    );

    EVRInputError(
        "GetBoneCount",
        "Reads the number of bones in skeleton associated with the given action.",

        VRActionHandle_t("action", ""),
        Check(1)..uint32_t.p("pBoneCount", "")
    )

    EVRInputError(
        "GetBoneHierarchy",
        "Fills the given array with the index of each bone's parent in the skeleton associated with the given action.",

        VRActionHandle_t("action", ""),
        BoneIndex_t.p("pParentIndices", ""),
        AutoSize("pParentIndices")..uint32_t("unIndexArrayCount", "")
    )

    EVRInputError(
        "GetBoneName",
        "Fills the given buffer with the name of the bone at the given index in the skeleton associated with the given action.",

        VRActionHandle_t("action", ""),
        BoneIndex_t("nBoneIndex", ""),
        charASCII.p("pchBoneName", ""),
        AutoSize("pchBoneName")..uint32_t("unNameBufferSize", "")
    )

    EVRInputError(
        "GetSkeletalReferenceTransforms",
        "Fills the given buffer with the transforms for a specific static skeletal reference pose.",

        VRActionHandle_t("action", ""),
        EVRSkeletalTransformSpace("eTransformSpace", "", "EVRSkeletalTransformSpace_\\w+"),
        EVRSkeletalReferencePose("eReferencePose", "", "EVRSkeletalReferencePose_\\w+"),
        VRBoneTransform_t.p("pTransformArray", ""),
        AutoSize("pTransformArray")..uint32_t("unTransformArrayCount", "")
    )

    EVRInputError(
        "GetSkeletalTrackingLevel",
        "Reads the level of accuracy to which the controller is able to track the user to recreate a skeletal pose.",

        VRActionHandle_t("action", ""),
        Check(1)..EVRSkeletalTrackingLevel.p("pSkeletalTrackingLevel", "")
    )

    EVRInputError(
        "GetSkeletalBoneData",
        "Reads the state of the skeletal bone data associated with this action and copies it into the given buffer.",

        VRActionHandle_t("action", ""),
        EVRSkeletalTransformSpace("eTransformSpace", "", "EVRSkeletalTransformSpace_\\w+"),
        EVRSkeletalMotionRange("eMotionRange", "", "EVRSkeletalMotionRange_\\w+"),
        VRBoneTransform_t.p("pTransformArray", ""),
        AutoSize("pTransformArray")..uint32_t("unTransformArrayCount", "")
    )

    EVRInputError(
        "GetSkeletalSummaryData",
        "Reads summary information about the current pose of the skeleton associated with the given action.",

        VRActionHandle_t("action", ""),
        EVRSummaryType("eSummaryType", ""),
        VRSkeletalSummaryData_t.p("pSkeletalSummaryData", "")
    )

    EVRInputError(
        "GetSkeletalBoneDataCompressed",
        """
        Reads the state of the skeletal bone data in a compressed form that is suitable for sending over the network. The required buffer size will never
        exceed ({@code sizeof(VR_BoneTransform_t)*boneCount + 2}). Usually the size will be much smaller.
        """,

        VRActionHandle_t("action", ""),
        EVRSkeletalMotionRange("eMotionRange", "", "EVRSkeletalMotionRange_\\w+"),
        nullable..void.p("pvCompressedData", ""),
        AutoSize("pvCompressedData")..uint32_t("unCompressedSize", ""),
        Check(1)..nullable..uint32_t.p("punRequiredCompressedSize", "")
    )

    EVRInputError(
        "DecompressSkeletalBoneData",
        "Turns a compressed buffer from #GetSkeletalBoneDataCompressed() and turns it back into a bone transform array.",

        void.p("pvCompressedBuffer", ""),
        AutoSize("pvCompressedBuffer")..uint32_t("unCompressedBufferSize", ""),
        EVRSkeletalTransformSpace("eTransformSpace", "", "EVRSkeletalTransformSpace_\\w+"),
        VRBoneTransform_t.p("pTransformArray", ""),
        AutoSize("pTransformArray")..uint32_t("unTransformArrayCount", "")
    )

    EVRInputError(
        "TriggerHapticVibrationAction",
        "Triggers a haptic event as described by the specified action.",

        VRActionHandle_t("action", ""),
        float("fStartSecondsFromNow", ""),
        float("fDurationSeconds", ""),
        float("fFrequency", ""),
        float("fAmplitude", ""),
        VRInputValueHandle_t("ulRestrictToDevice", "")
    )

    EVRInputError(
        "GetActionOrigins",
        "Retrieve origin handles for an action.",

        VRActionSetHandle_t("actionSetHandle", ""),
        VRActionHandle_t("digitalActionHandle", ""),
        VRInputValueHandle_t.p("originsOut", ""),
        AutoSize("originsOut")..uint32_t("originOutCount", "")
    )

    EVRInputError(
        "GetOriginLocalizedName",
        "Retrieves the name of the origin in the current language.",

        VRInputValueHandle_t("origin", ""),
        charASCII.p("pchNameArray", ""),
        AutoSize("pchNameArray")..uint32_t("unNameArraySize", ""),
        int32_t(
            "unStringSectionsToInclude",
            """
            a bitfield of values in {@code EVRInputStringBits} that allows the application to specify which parts of the origin's information it wants a string
            for
            """,
            "EVRInputStringBits_\\w+", LinkMode.BITFIELD
        )
    )

    EVRInputError(
        "GetOriginTrackedDeviceInfo",
        "Retrieves useful information for the origin of this action.",

        VRInputValueHandle_t("origin", ""),
        InputOriginInfo_t.p("pOriginInfo", ""),
        Expression("InputOriginInfo.SIZEOF")..uint32_t("unOriginInfoSize", "")
    )

    EVRInputError(
        "GetActionBindingInfo",
        "Retrieves useful information about the bindings for an action.",

        VRActionHandle_t("action", ""),
        InputBindingInfo_t.p("pOriginInfo", ""),
        Expression("InputBindingInfo.SIZEOF")..uint32_t("unBindingInfoSize", ""),
        AutoSize("pOriginInfo")..uint32_t("unBindingInfoCount", ""),
        Check(1)..uint32_t.p("punReturnedBindingInfoCount", "")
    )

    EVRInputError(
        "ShowActionOrigins",
        "Shows the current binding for the action in-headset.",

        VRActionSetHandle_t("actionSetHandle", ""),
        VRActionHandle_t("ulActionHandle", "")
    )

    EVRInputError(
        "ShowBindingsForActionSet",
        "Shows the current binding all the actions in the specified action sets.",

        VRActiveActionSet_t.p("pSets", ""),
        uint32_t("unSizeOfVRSelectedActionSet_t", ""),
        AutoSize("pSets")..uint32_t("unSetCount", ""),
        VRInputValueHandle_t("originToHighlight", "")
    )

    EVRInputError(
        "GetComponentStateForBinding",
        "Use this to query what action on the component returned by #GetOriginTrackedDeviceInfo() would trigger this binding.",

        charASCII.const.p("pchRenderModelName", ""),
        charASCII.const.p("pchComponentName", ""),
        InputBindingInfo_t.const.p("pOriginInfo", ""),
        Expression("InputBindingInfo.SIZEOF")..uint32_t("unBindingInfoSize", ""),
        AutoSize("pOriginInfo")..uint32_t("unBindingInfoCount", ""),
        Check(1)..RenderModel_ComponentState_t.p("pComponentState", "")
    )

    bool(
        "IsUsingLegacyInput",
        ""
    )

    EVRInputError(
        "OpenBindingUI",
        """
        Opens the binding user interface.

        If no app key is provided it will use the key from the calling process. If no set is provided it will open to the root of the app binding page.
        """,

        charASCII.const.p("pchAppKey", ""),
        VRActionSetHandle_t("ulActionSetHandle", ""),
        VRInputValueHandle_t("ulDeviceHandle", ""),
        bool("bShowOnDesktop", "")
    )

    EVRInputError(
        "GetBindingVariant",
        "Returns the variant set in the current bindings. If the binding doesn't include a variant setting, this function will return an empty string.",

        VRInputValueHandle_t("ulDevicePath", ""),
        charASCII.p("pchVariantArray", ""),
        AutoSize("pchVariantArray")..uint32_t("unVariantArraySize", "")
    )
}