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
    EVRInputError(
        "SetActionManifestPath",

        charASCII.const.p("pchActionManifestPath")
    )

    EVRInputError(
        "GetActionSetHandle",

        charASCII.const.p("pchActionSetName"),
        Check(1)..VRActionSetHandle_t.p("pHandle")
    )

    EVRInputError(
        "GetActionHandle",

        charASCII.const.p("pchActionName"),
        Check(1)..VRActionHandle_t.p("pHandle")
    )

    EVRInputError(
        "GetInputSourceHandle",

        charASCII.const.p("pchInputSourcePath"),
        Check(1)..VRInputValueHandle_t.p("pHandle")
    )

    EVRInputError(
        "UpdateActionState",

        VRActiveActionSet_t.p("pSets"),
        uint32_t("unSizeOfVRSelectedActionSet_t"),
        AutoSize("pSets")..uint32_t("unSetCount")
    )

    EVRInputError(
        "GetDigitalActionData",

        VRActionHandle_t("action"),
        InputDigitalActionData_t.p("pActionData"),
        Expression("InputDigitalActionData.SIZEOF")..uint32_t("unActionDataSize"),
        VRInputValueHandle_t("ulRestrictToDevice")
    )

    EVRInputError(
        "GetAnalogActionData",

        VRActionHandle_t("action"),
        InputAnalogActionData_t.p("pActionData"),
        Expression("InputAnalogActionData.SIZEOF")..uint32_t("unActionDataSize"),
        VRInputValueHandle_t("ulRestrictToDevice")
    )

    EVRInputError(
        "GetPoseActionDataRelativeToNow",

        VRActionHandle_t("action"),
        ETrackingUniverseOrigin("eOrigin"),
        float("fPredictedSecondsFromNow"),
        InputPoseActionData_t.p("pActionData"),
        Expression("InputPoseActionData.SIZEOF")..uint32_t("unActionDataSize"),
        VRInputValueHandle_t("ulRestrictToDevice")
    )

    EVRInputError(
        "GetPoseActionDataForNextFrame",

        VRActionHandle_t("action"),
        ETrackingUniverseOrigin("eOrigin"),
        InputPoseActionData_t.p("pActionData"),
        Expression("InputPoseActionData.SIZEOF")..uint32_t("unActionDataSize"),
        VRInputValueHandle_t("ulRestrictToDevice")
    )

    EVRInputError(
        "GetSkeletalActionData",

        VRActionHandle_t("action"),
        InputSkeletalActionData_t.p("pActionData"),
        Expression("InputSkeletalActionData.SIZEOF")..uint32_t("unActionDataSize")
    )

    EVRInputError(
        "GetDominantHand",

        Check(1)..ETrackedControllerRole.p("peDominantHand")
    )

    EVRInputError(
        "SetDominantHand",

        ETrackedControllerRole("eDominantHand")
    );

    EVRInputError(
        "GetBoneCount",

        VRActionHandle_t("action"),
        Check(1)..uint32_t.p("pBoneCount")
    )

    EVRInputError(
        "GetBoneHierarchy",

        VRActionHandle_t("action"),
        BoneIndex_t.p("pParentIndices"),
        AutoSize("pParentIndices")..uint32_t("unIndexArrayCount")
    )

    EVRInputError(
        "GetBoneName",

        VRActionHandle_t("action"),
        BoneIndex_t("nBoneIndex"),
        charASCII.p("pchBoneName"),
        AutoSize("pchBoneName")..uint32_t("unNameBufferSize")
    )

    EVRInputError(
        "GetSkeletalReferenceTransforms",

        VRActionHandle_t("action"),
        EVRSkeletalTransformSpace("eTransformSpace"),
        EVRSkeletalReferencePose("eReferencePose"),
        VRBoneTransform_t.p("pTransformArray"),
        AutoSize("pTransformArray")..uint32_t("unTransformArrayCount")
    )

    EVRInputError(
        "GetSkeletalTrackingLevel",

        VRActionHandle_t("action"),
        Check(1)..EVRSkeletalTrackingLevel.p("pSkeletalTrackingLevel")
    )

    EVRInputError(
        "GetSkeletalBoneData",

        VRActionHandle_t("action"),
        EVRSkeletalTransformSpace("eTransformSpace"),
        EVRSkeletalMotionRange("eMotionRange"),
        VRBoneTransform_t.p("pTransformArray"),
        AutoSize("pTransformArray")..uint32_t("unTransformArrayCount")
    )

    EVRInputError(
        "GetSkeletalSummaryData",

        VRActionHandle_t("action"),
        EVRSummaryType("eSummaryType"),
        VRSkeletalSummaryData_t.p("pSkeletalSummaryData")
    )

    EVRInputError(
        "GetSkeletalBoneDataCompressed",

        VRActionHandle_t("action"),
        EVRSkeletalMotionRange("eMotionRange"),
        nullable..void.p("pvCompressedData"),
        AutoSize("pvCompressedData")..uint32_t("unCompressedSize"),
        Check(1)..nullable..uint32_t.p("punRequiredCompressedSize")
    )

    EVRInputError(
        "DecompressSkeletalBoneData",

        void.p("pvCompressedBuffer"),
        AutoSize("pvCompressedBuffer")..uint32_t("unCompressedBufferSize"),
        EVRSkeletalTransformSpace("eTransformSpace"),
        VRBoneTransform_t.p("pTransformArray"),
        AutoSize("pTransformArray")..uint32_t("unTransformArrayCount")
    )

    EVRInputError(
        "TriggerHapticVibrationAction",

        VRActionHandle_t("action"),
        float("fStartSecondsFromNow"),
        float("fDurationSeconds"),
        float("fFrequency"),
        float("fAmplitude"),
        VRInputValueHandle_t("ulRestrictToDevice")
    )

    EVRInputError(
        "GetActionOrigins",

        VRActionSetHandle_t("actionSetHandle"),
        VRActionHandle_t("digitalActionHandle"),
        VRInputValueHandle_t.p("originsOut"),
        AutoSize("originsOut")..uint32_t("originOutCount")
    )

    EVRInputError(
        "GetOriginLocalizedName",

        VRInputValueHandle_t("origin"),
        charASCII.p("pchNameArray"),
        AutoSize("pchNameArray")..uint32_t("unNameArraySize"),
        int32_t("unStringSectionsToInclude")
    )

    EVRInputError(
        "GetOriginTrackedDeviceInfo",

        VRInputValueHandle_t("origin"),
        InputOriginInfo_t.p("pOriginInfo"),
        Expression("InputOriginInfo.SIZEOF")..uint32_t("unOriginInfoSize")
    )

    EVRInputError(
        "GetActionBindingInfo",

        VRActionHandle_t("action"),
        InputBindingInfo_t.p("pOriginInfo"),
        Expression("InputBindingInfo.SIZEOF")..uint32_t("unBindingInfoSize"),
        AutoSize("pOriginInfo")..uint32_t("unBindingInfoCount"),
        Check(1)..uint32_t.p("punReturnedBindingInfoCount")
    )

    EVRInputError(
        "ShowActionOrigins",

        VRActionSetHandle_t("actionSetHandle"),
        VRActionHandle_t("ulActionHandle")
    )

    EVRInputError(
        "ShowBindingsForActionSet",

        VRActiveActionSet_t.p("pSets"),
        uint32_t("unSizeOfVRSelectedActionSet_t"),
        AutoSize("pSets")..uint32_t("unSetCount"),
        VRInputValueHandle_t("originToHighlight")
    )

    EVRInputError(
        "GetComponentStateForBinding",

        charASCII.const.p("pchRenderModelName"),
        charASCII.const.p("pchComponentName"),
        InputBindingInfo_t.const.p("pOriginInfo"),
        Expression("InputBindingInfo.SIZEOF")..uint32_t("unBindingInfoSize"),
        AutoSize("pOriginInfo")..uint32_t("unBindingInfoCount"),
        Check(1)..RenderModel_ComponentState_t.p("pComponentState")
    )

    bool("IsUsingLegacyInput")

    EVRInputError(
        "OpenBindingUI",

        charASCII.const.p("pchAppKey"),
        VRActionSetHandle_t("ulActionSetHandle"),
        VRInputValueHandle_t("ulDeviceHandle"),
        bool("bShowOnDesktop")
    )

    EVRInputError(
        "GetBindingVariant",

        VRInputValueHandle_t("ulDevicePath"),
        charASCII.p("pchVariantArray"),
        AutoSize("pchVariantArray")..uint32_t("unVariantArraySize")
    )
}