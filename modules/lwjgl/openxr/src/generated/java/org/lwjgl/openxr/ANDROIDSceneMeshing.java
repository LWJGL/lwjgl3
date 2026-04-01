/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.openxr;

import org.jspecify.annotations.*;

import java.nio.*;

import org.lwjgl.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.JNI.*;
import static org.lwjgl.system.MemoryUtil.*;

public class ANDROIDSceneMeshing {

    public static final int XR_ANDROID_scene_meshing_SPEC_VERSION = 3;

    public static final String XR_ANDROID_SCENE_MESHING_EXTENSION_NAME = "XR_ANDROID_scene_meshing";

    public static final int
        XR_TYPE_SYSTEM_SCENE_MESHING_PROPERTIES_ANDROID     = 1000718000,
        XR_TYPE_SCENE_MESHING_TRACKER_CREATE_INFO_ANDROID   = 1000718001,
        XR_TYPE_SCENE_MESH_SNAPSHOT_CREATE_INFO_ANDROID     = 1000718002,
        XR_TYPE_SCENE_MESH_SNAPSHOT_CREATION_RESULT_ANDROID = 1000718003,
        XR_TYPE_SCENE_SUBMESH_STATE_ANDROID                 = 1000718004,
        XR_TYPE_SCENE_SUBMESH_DATA_ANDROID                  = 1000718005;

    public static final int
        XR_OBJECT_TYPE_SCENE_MESHING_TRACKER_ANDROID = 1000718000,
        XR_OBJECT_TYPE_SCENE_MESH_SNAPSHOT_ANDROID   = 1000718001;

    public static final int
        XR_SCENE_MESH_SEMANTIC_LABEL_SET_NONE_ANDROID    = 0,
        XR_SCENE_MESH_SEMANTIC_LABEL_SET_DEFAULT_ANDROID = 1;

    public static final int
        XR_SCENE_MESH_TRACKING_STATE_INITIALIZING_ANDROID = 0,
        XR_SCENE_MESH_TRACKING_STATE_TRACKING_ANDROID     = 1,
        XR_SCENE_MESH_TRACKING_STATE_WAITING_ANDROID      = 2,
        XR_SCENE_MESH_TRACKING_STATE_ERROR_ANDROID        = 3;

    public static final int
        XR_SCENE_MESH_SEMANTIC_LABEL_OTHER_ANDROID   = 0,
        XR_SCENE_MESH_SEMANTIC_LABEL_FLOOR_ANDROID   = 1,
        XR_SCENE_MESH_SEMANTIC_LABEL_CEILING_ANDROID = 2,
        XR_SCENE_MESH_SEMANTIC_LABEL_WALL_ANDROID    = 3,
        XR_SCENE_MESH_SEMANTIC_LABEL_TABLE_ANDROID   = 4;

    protected ANDROIDSceneMeshing() {
        throw new UnsupportedOperationException();
    }

    // --- [ xrEnumerateSupportedSemanticLabelSetsANDROID ] ---

    /** {@code XrResult xrEnumerateSupportedSemanticLabelSetsANDROID(XrInstance instance, XrSystemId systemId, uint32_t supportedSemanticLabelSetsInputCapacity, uint32_t * supportedSemanticLabelSetsOutputCount, XrSceneMeshSemanticLabelSetANDROID * supportedSemanticLabelSets)} */
    public static int nxrEnumerateSupportedSemanticLabelSetsANDROID(XrInstance instance, long systemId, int supportedSemanticLabelSetsInputCapacity, long supportedSemanticLabelSetsOutputCount, long supportedSemanticLabelSets) {
        long __functionAddress = instance.getCapabilities().xrEnumerateSupportedSemanticLabelSetsANDROID;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPJPPI(instance.address(), systemId, supportedSemanticLabelSetsInputCapacity, supportedSemanticLabelSetsOutputCount, supportedSemanticLabelSets, __functionAddress);
    }

    /** {@code XrResult xrEnumerateSupportedSemanticLabelSetsANDROID(XrInstance instance, XrSystemId systemId, uint32_t supportedSemanticLabelSetsInputCapacity, uint32_t * supportedSemanticLabelSetsOutputCount, XrSceneMeshSemanticLabelSetANDROID * supportedSemanticLabelSets)} */
    @NativeType("XrResult")
    public static int xrEnumerateSupportedSemanticLabelSetsANDROID(XrInstance instance, @NativeType("XrSystemId") long systemId, @NativeType("uint32_t *") IntBuffer supportedSemanticLabelSetsOutputCount, @NativeType("XrSceneMeshSemanticLabelSetANDROID *") @Nullable IntBuffer supportedSemanticLabelSets) {
        if (CHECKS) {
            check(supportedSemanticLabelSetsOutputCount, 1);
        }
        return nxrEnumerateSupportedSemanticLabelSetsANDROID(instance, systemId, remainingSafe(supportedSemanticLabelSets), memAddress(supportedSemanticLabelSetsOutputCount), memAddressSafe(supportedSemanticLabelSets));
    }

    // --- [ xrCreateSceneMeshingTrackerANDROID ] ---

    /** {@code XrResult xrCreateSceneMeshingTrackerANDROID(XrSession session, XrSceneMeshingTrackerCreateInfoANDROID const * createInfo, XrSceneMeshingTrackerANDROID * tracker)} */
    public static int nxrCreateSceneMeshingTrackerANDROID(XrSession session, long createInfo, long tracker) {
        long __functionAddress = session.getCapabilities().xrCreateSceneMeshingTrackerANDROID;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPPPI(session.address(), createInfo, tracker, __functionAddress);
    }

    /** {@code XrResult xrCreateSceneMeshingTrackerANDROID(XrSession session, XrSceneMeshingTrackerCreateInfoANDROID const * createInfo, XrSceneMeshingTrackerANDROID * tracker)} */
    @NativeType("XrResult")
    public static int xrCreateSceneMeshingTrackerANDROID(XrSession session, @NativeType("XrSceneMeshingTrackerCreateInfoANDROID const *") XrSceneMeshingTrackerCreateInfoANDROID createInfo, @NativeType("XrSceneMeshingTrackerANDROID *") PointerBuffer tracker) {
        if (CHECKS) {
            check(tracker, 1);
        }
        return nxrCreateSceneMeshingTrackerANDROID(session, createInfo.address(), memAddress(tracker));
    }

    // --- [ xrDestroySceneMeshingTrackerANDROID ] ---

    /** {@code XrResult xrDestroySceneMeshingTrackerANDROID(XrSceneMeshingTrackerANDROID tracker)} */
    @NativeType("XrResult")
    public static int xrDestroySceneMeshingTrackerANDROID(XrSceneMeshingTrackerANDROID tracker) {
        long __functionAddress = tracker.getCapabilities().xrDestroySceneMeshingTrackerANDROID;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPI(tracker.address(), __functionAddress);
    }

    // --- [ xrCreateSceneMeshSnapshotANDROID ] ---

    /** {@code XrResult xrCreateSceneMeshSnapshotANDROID(XrSceneMeshingTrackerANDROID tracker, XrSceneMeshSnapshotCreateInfoANDROID const * createInfo, XrSceneMeshSnapshotCreationResultANDROID * outSnapshotCreationResult)} */
    public static int nxrCreateSceneMeshSnapshotANDROID(XrSceneMeshingTrackerANDROID tracker, long createInfo, long outSnapshotCreationResult) {
        long __functionAddress = tracker.getCapabilities().xrCreateSceneMeshSnapshotANDROID;
        if (CHECKS) {
            check(__functionAddress);
            XrSceneMeshSnapshotCreateInfoANDROID.validate(createInfo);
        }
        return callPPPI(tracker.address(), createInfo, outSnapshotCreationResult, __functionAddress);
    }

    /** {@code XrResult xrCreateSceneMeshSnapshotANDROID(XrSceneMeshingTrackerANDROID tracker, XrSceneMeshSnapshotCreateInfoANDROID const * createInfo, XrSceneMeshSnapshotCreationResultANDROID * outSnapshotCreationResult)} */
    @NativeType("XrResult")
    public static int xrCreateSceneMeshSnapshotANDROID(XrSceneMeshingTrackerANDROID tracker, @NativeType("XrSceneMeshSnapshotCreateInfoANDROID const *") XrSceneMeshSnapshotCreateInfoANDROID createInfo, @NativeType("XrSceneMeshSnapshotCreationResultANDROID *") XrSceneMeshSnapshotCreationResultANDROID outSnapshotCreationResult) {
        return nxrCreateSceneMeshSnapshotANDROID(tracker, createInfo.address(), outSnapshotCreationResult.address());
    }

    // --- [ xrDestroySceneMeshSnapshotANDROID ] ---

    /** {@code XrResult xrDestroySceneMeshSnapshotANDROID(XrSceneMeshSnapshotANDROID snapshot)} */
    @NativeType("XrResult")
    public static int xrDestroySceneMeshSnapshotANDROID(XrSceneMeshSnapshotANDROID snapshot) {
        long __functionAddress = snapshot.getCapabilities().xrDestroySceneMeshSnapshotANDROID;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPI(snapshot.address(), __functionAddress);
    }

    // --- [ xrGetAllSubmeshStatesANDROID ] ---

    /** {@code XrResult xrGetAllSubmeshStatesANDROID(XrSceneMeshSnapshotANDROID snapshot, uint32_t submeshStateCapacityInput, uint32_t * submeshStateCountOutput, XrSceneSubmeshStateANDROID * submeshStates)} */
    public static int nxrGetAllSubmeshStatesANDROID(XrSceneMeshSnapshotANDROID snapshot, int submeshStateCapacityInput, long submeshStateCountOutput, long submeshStates) {
        long __functionAddress = snapshot.getCapabilities().xrGetAllSubmeshStatesANDROID;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPPPI(snapshot.address(), submeshStateCapacityInput, submeshStateCountOutput, submeshStates, __functionAddress);
    }

    /** {@code XrResult xrGetAllSubmeshStatesANDROID(XrSceneMeshSnapshotANDROID snapshot, uint32_t submeshStateCapacityInput, uint32_t * submeshStateCountOutput, XrSceneSubmeshStateANDROID * submeshStates)} */
    @NativeType("XrResult")
    public static int xrGetAllSubmeshStatesANDROID(XrSceneMeshSnapshotANDROID snapshot, @NativeType("uint32_t *") IntBuffer submeshStateCountOutput, @NativeType("XrSceneSubmeshStateANDROID *") XrSceneSubmeshStateANDROID.@Nullable Buffer submeshStates) {
        if (CHECKS) {
            check(submeshStateCountOutput, 1);
        }
        return nxrGetAllSubmeshStatesANDROID(snapshot, remainingSafe(submeshStates), memAddress(submeshStateCountOutput), memAddressSafe(submeshStates));
    }

    // --- [ xrGetSubmeshDataANDROID ] ---

    /** {@code XrResult xrGetSubmeshDataANDROID(XrSceneMeshSnapshotANDROID snapshot, uint32_t submeshDataCount, XrSceneSubmeshDataANDROID * inoutSubmeshData)} */
    public static int nxrGetSubmeshDataANDROID(XrSceneMeshSnapshotANDROID snapshot, int submeshDataCount, long inoutSubmeshData) {
        long __functionAddress = snapshot.getCapabilities().xrGetSubmeshDataANDROID;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPPI(snapshot.address(), submeshDataCount, inoutSubmeshData, __functionAddress);
    }

    /** {@code XrResult xrGetSubmeshDataANDROID(XrSceneMeshSnapshotANDROID snapshot, uint32_t submeshDataCount, XrSceneSubmeshDataANDROID * inoutSubmeshData)} */
    @NativeType("XrResult")
    public static int xrGetSubmeshDataANDROID(XrSceneMeshSnapshotANDROID snapshot, @NativeType("XrSceneSubmeshDataANDROID *") XrSceneSubmeshDataANDROID.Buffer inoutSubmeshData) {
        return nxrGetSubmeshDataANDROID(snapshot, inoutSubmeshData.remaining(), inoutSubmeshData.address());
    }

}