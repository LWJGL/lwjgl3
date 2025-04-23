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

public class BDSpatialSensing {

    public static final int XR_BD_spatial_sensing_SPEC_VERSION = 1;

    public static final String XR_BD_SPATIAL_SENSING_EXTENSION_NAME = "XR_BD_spatial_sensing";

    public static final int
        XR_ERROR_SPATIAL_ENTITY_ID_INVALID_BD           = -1000389000,
        XR_ERROR_SPATIAL_SENSING_SERVICE_UNAVAILABLE_BD = -1000389001,
        XR_ERROR_ANCHOR_NOT_SUPPORTED_FOR_ENTITY_BD     = -1000389002;

    public static final int
        XR_TYPE_SYSTEM_SPATIAL_SENSING_PROPERTIES_BD             = 1000389000,
        XR_TYPE_SPATIAL_ENTITY_COMPONENT_GET_INFO_BD             = 1000389001,
        XR_TYPE_SPATIAL_ENTITY_LOCATION_GET_INFO_BD              = 1000389002,
        XR_TYPE_SPATIAL_ENTITY_COMPONENT_DATA_LOCATION_BD        = 1000389003,
        XR_TYPE_SPATIAL_ENTITY_COMPONENT_DATA_SEMANTIC_BD        = 1000389004,
        XR_TYPE_SPATIAL_ENTITY_COMPONENT_DATA_BOUNDING_BOX_2D_BD = 1000389005,
        XR_TYPE_SPATIAL_ENTITY_COMPONENT_DATA_POLYGON_BD         = 1000389006,
        XR_TYPE_SPATIAL_ENTITY_COMPONENT_DATA_BOUNDING_BOX_3D_BD = 1000389007,
        XR_TYPE_SPATIAL_ENTITY_COMPONENT_DATA_TRIANGLE_MESH_BD   = 1000389008,
        XR_TYPE_SENSE_DATA_PROVIDER_CREATE_INFO_BD               = 1000389009,
        XR_TYPE_SENSE_DATA_PROVIDER_START_INFO_BD                = 1000389010,
        XR_TYPE_EVENT_DATA_SENSE_DATA_PROVIDER_STATE_CHANGED_BD  = 1000389011,
        XR_TYPE_EVENT_DATA_SENSE_DATA_UPDATED_BD                 = 1000389012,
        XR_TYPE_SENSE_DATA_QUERY_INFO_BD                         = 1000389013,
        XR_TYPE_SENSE_DATA_QUERY_COMPLETION_BD                   = 1000389014,
        XR_TYPE_SENSE_DATA_FILTER_UUID_BD                        = 1000389015,
        XR_TYPE_SENSE_DATA_FILTER_SEMANTIC_BD                    = 1000389016,
        XR_TYPE_QUERIED_SENSE_DATA_GET_INFO_BD                   = 1000389017,
        XR_TYPE_QUERIED_SENSE_DATA_BD                            = 1000389018,
        XR_TYPE_SPATIAL_ENTITY_STATE_BD                          = 1000389019,
        XR_TYPE_SPATIAL_ENTITY_ANCHOR_CREATE_INFO_BD             = 1000389020,
        XR_TYPE_ANCHOR_SPACE_CREATE_INFO_BD                      = 1000389021;

    public static final int
        XR_OBJECT_TYPE_SENSE_DATA_PROVIDER_BD = 1000389000,
        XR_OBJECT_TYPE_SENSE_DATA_SNAPSHOT_BD = 1000389001,
        XR_OBJECT_TYPE_ANCHOR_BD              = 1000389002;

    public static final int
        XR_SPATIAL_ENTITY_COMPONENT_TYPE_LOCATION_BD        = 0,
        XR_SPATIAL_ENTITY_COMPONENT_TYPE_SEMANTIC_BD        = 1,
        XR_SPATIAL_ENTITY_COMPONENT_TYPE_BOUNDING_BOX_2D_BD = 2,
        XR_SPATIAL_ENTITY_COMPONENT_TYPE_POLYGON_BD         = 3,
        XR_SPATIAL_ENTITY_COMPONENT_TYPE_BOUNDING_BOX_3D_BD = 4,
        XR_SPATIAL_ENTITY_COMPONENT_TYPE_TRIANGLE_MESH_BD   = 5;

    public static final int
        XR_SEMANTIC_LABEL_UNKNOWN_BD         = 0,
        XR_SEMANTIC_LABEL_FLOOR_BD           = 1,
        XR_SEMANTIC_LABEL_CEILING_BD         = 2,
        XR_SEMANTIC_LABEL_WALL_BD            = 3,
        XR_SEMANTIC_LABEL_DOOR_BD            = 4,
        XR_SEMANTIC_LABEL_WINDOW_BD          = 5,
        XR_SEMANTIC_LABEL_OPENING_BD         = 6,
        XR_SEMANTIC_LABEL_TABLE_BD           = 7,
        XR_SEMANTIC_LABEL_SOFA_BD            = 8,
        XR_SEMANTIC_LABEL_CHAIR_BD           = 9,
        XR_SEMANTIC_LABEL_HUMAN_BD           = 10,
        XR_SEMANTIC_LABEL_BEAM_BD            = 11,
        XR_SEMANTIC_LABEL_COLUMN_BD          = 12,
        XR_SEMANTIC_LABEL_CURTAIN_BD         = 13,
        XR_SEMANTIC_LABEL_CABINET_BD         = 14,
        XR_SEMANTIC_LABEL_BED_BD             = 15,
        XR_SEMANTIC_LABEL_PLANT_BD           = 16,
        XR_SEMANTIC_LABEL_SCREEN_BD          = 17,
        XR_SEMANTIC_LABEL_VIRTUAL_WALL_BD    = 18,
        XR_SEMANTIC_LABEL_REFRIGERATOR_BD    = 19,
        XR_SEMANTIC_LABEL_WASHING_MACHINE_BD = 20,
        XR_SEMANTIC_LABEL_AIR_CONDITIONER_BD = 21,
        XR_SEMANTIC_LABEL_LAMP_BD            = 22,
        XR_SEMANTIC_LABEL_WALL_ART_BD        = 23,
        XR_SEMANTIC_LABEL_STAIRWAY_BD        = 24;

    public static final int
        XR_SENSE_DATA_PROVIDER_STATE_INITIALIZED_BD = 0,
        XR_SENSE_DATA_PROVIDER_STATE_RUNNING_BD     = 1,
        XR_SENSE_DATA_PROVIDER_STATE_STOPPED_BD     = 2;

    protected BDSpatialSensing() {
        throw new UnsupportedOperationException();
    }

    // --- [ xrEnumerateSpatialEntityComponentTypesBD ] ---

    /** {@code XrResult xrEnumerateSpatialEntityComponentTypesBD(XrSenseDataSnapshotBD snapshot, XrSpatialEntityIdBD entityId, uint32_t componentTypeCapacityInput, uint32_t * componentTypeCountOutput, XrSpatialEntityComponentTypeBD * componentTypes)} */
    public static int nxrEnumerateSpatialEntityComponentTypesBD(XrSenseDataSnapshotBD snapshot, long entityId, int componentTypeCapacityInput, long componentTypeCountOutput, long componentTypes) {
        long __functionAddress = snapshot.getCapabilities().xrEnumerateSpatialEntityComponentTypesBD;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPJPPI(snapshot.address(), entityId, componentTypeCapacityInput, componentTypeCountOutput, componentTypes, __functionAddress);
    }

    /** {@code XrResult xrEnumerateSpatialEntityComponentTypesBD(XrSenseDataSnapshotBD snapshot, XrSpatialEntityIdBD entityId, uint32_t componentTypeCapacityInput, uint32_t * componentTypeCountOutput, XrSpatialEntityComponentTypeBD * componentTypes)} */
    @NativeType("XrResult")
    public static int xrEnumerateSpatialEntityComponentTypesBD(XrSenseDataSnapshotBD snapshot, @NativeType("XrSpatialEntityIdBD") long entityId, @NativeType("uint32_t *") IntBuffer componentTypeCountOutput, @NativeType("XrSpatialEntityComponentTypeBD *") @Nullable IntBuffer componentTypes) {
        if (CHECKS) {
            check(componentTypeCountOutput, 1);
        }
        return nxrEnumerateSpatialEntityComponentTypesBD(snapshot, entityId, remainingSafe(componentTypes), memAddress(componentTypeCountOutput), memAddressSafe(componentTypes));
    }

    // --- [ xrGetSpatialEntityUuidBD ] ---

    /** {@code XrResult xrGetSpatialEntityUuidBD(XrSenseDataSnapshotBD snapshot, XrSpatialEntityIdBD entityId, XrUuidEXT * uuid)} */
    public static int nxrGetSpatialEntityUuidBD(XrSenseDataSnapshotBD snapshot, long entityId, long uuid) {
        long __functionAddress = snapshot.getCapabilities().xrGetSpatialEntityUuidBD;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPJPI(snapshot.address(), entityId, uuid, __functionAddress);
    }

    /** {@code XrResult xrGetSpatialEntityUuidBD(XrSenseDataSnapshotBD snapshot, XrSpatialEntityIdBD entityId, XrUuidEXT * uuid)} */
    @NativeType("XrResult")
    public static int xrGetSpatialEntityUuidBD(XrSenseDataSnapshotBD snapshot, @NativeType("XrSpatialEntityIdBD") long entityId, @NativeType("XrUuidEXT *") XrUuidEXT uuid) {
        return nxrGetSpatialEntityUuidBD(snapshot, entityId, uuid.address());
    }

    // --- [ xrGetSpatialEntityComponentDataBD ] ---

    /** {@code XrResult xrGetSpatialEntityComponentDataBD(XrSenseDataSnapshotBD snapshot, XrSpatialEntityComponentGetInfoBD const * getInfo, XrSpatialEntityComponentDataBaseHeaderBD * componentData)} */
    public static int nxrGetSpatialEntityComponentDataBD(XrSenseDataSnapshotBD snapshot, long getInfo, long componentData) {
        long __functionAddress = snapshot.getCapabilities().xrGetSpatialEntityComponentDataBD;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPPPI(snapshot.address(), getInfo, componentData, __functionAddress);
    }

    /** {@code XrResult xrGetSpatialEntityComponentDataBD(XrSenseDataSnapshotBD snapshot, XrSpatialEntityComponentGetInfoBD const * getInfo, XrSpatialEntityComponentDataBaseHeaderBD * componentData)} */
    @NativeType("XrResult")
    public static int xrGetSpatialEntityComponentDataBD(XrSenseDataSnapshotBD snapshot, @NativeType("XrSpatialEntityComponentGetInfoBD const *") XrSpatialEntityComponentGetInfoBD getInfo, @NativeType("XrSpatialEntityComponentDataBaseHeaderBD *") XrSpatialEntityComponentDataBaseHeaderBD componentData) {
        return nxrGetSpatialEntityComponentDataBD(snapshot, getInfo.address(), componentData.address());
    }

    // --- [ xrCreateSenseDataProviderBD ] ---

    /** {@code XrResult xrCreateSenseDataProviderBD(XrSession session, XrSenseDataProviderCreateInfoBD const * createInfo, XrSenseDataProviderBD * provider)} */
    public static int nxrCreateSenseDataProviderBD(XrSession session, long createInfo, long provider) {
        long __functionAddress = session.getCapabilities().xrCreateSenseDataProviderBD;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPPPI(session.address(), createInfo, provider, __functionAddress);
    }

    /** {@code XrResult xrCreateSenseDataProviderBD(XrSession session, XrSenseDataProviderCreateInfoBD const * createInfo, XrSenseDataProviderBD * provider)} */
    @NativeType("XrResult")
    public static int xrCreateSenseDataProviderBD(XrSession session, @NativeType("XrSenseDataProviderCreateInfoBD const *") XrSenseDataProviderCreateInfoBD createInfo, @NativeType("XrSenseDataProviderBD *") PointerBuffer provider) {
        if (CHECKS) {
            check(provider, 1);
        }
        return nxrCreateSenseDataProviderBD(session, createInfo.address(), memAddress(provider));
    }

    // --- [ xrStartSenseDataProviderAsyncBD ] ---

    /** {@code XrResult xrStartSenseDataProviderAsyncBD(XrSenseDataProviderBD provider, XrSenseDataProviderStartInfoBD const * startInfo, XrFutureEXT * future)} */
    public static int nxrStartSenseDataProviderAsyncBD(XrSenseDataProviderBD provider, long startInfo, long future) {
        long __functionAddress = provider.getCapabilities().xrStartSenseDataProviderAsyncBD;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPPPI(provider.address(), startInfo, future, __functionAddress);
    }

    /** {@code XrResult xrStartSenseDataProviderAsyncBD(XrSenseDataProviderBD provider, XrSenseDataProviderStartInfoBD const * startInfo, XrFutureEXT * future)} */
    @NativeType("XrResult")
    public static int xrStartSenseDataProviderAsyncBD(XrSenseDataProviderBD provider, @NativeType("XrSenseDataProviderStartInfoBD const *") XrSenseDataProviderStartInfoBD startInfo, @NativeType("XrFutureEXT *") LongBuffer future) {
        if (CHECKS) {
            check(future, 1);
        }
        return nxrStartSenseDataProviderAsyncBD(provider, startInfo.address(), memAddress(future));
    }

    // --- [ xrStartSenseDataProviderCompleteBD ] ---

    /** {@code XrResult xrStartSenseDataProviderCompleteBD(XrSession session, XrFutureEXT future, XrFutureCompletionEXT * completion)} */
    public static int nxrStartSenseDataProviderCompleteBD(XrSession session, long future, long completion) {
        long __functionAddress = session.getCapabilities().xrStartSenseDataProviderCompleteBD;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPJPI(session.address(), future, completion, __functionAddress);
    }

    /** {@code XrResult xrStartSenseDataProviderCompleteBD(XrSession session, XrFutureEXT future, XrFutureCompletionEXT * completion)} */
    @NativeType("XrResult")
    public static int xrStartSenseDataProviderCompleteBD(XrSession session, @NativeType("XrFutureEXT") long future, @NativeType("XrFutureCompletionEXT *") XrFutureCompletionEXT completion) {
        return nxrStartSenseDataProviderCompleteBD(session, future, completion.address());
    }

    // --- [ xrGetSenseDataProviderStateBD ] ---

    /** {@code XrResult xrGetSenseDataProviderStateBD(XrSenseDataProviderBD provider, XrSenseDataProviderStateBD * state)} */
    public static int nxrGetSenseDataProviderStateBD(XrSenseDataProviderBD provider, long state) {
        long __functionAddress = provider.getCapabilities().xrGetSenseDataProviderStateBD;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPPI(provider.address(), state, __functionAddress);
    }

    /** {@code XrResult xrGetSenseDataProviderStateBD(XrSenseDataProviderBD provider, XrSenseDataProviderStateBD * state)} */
    @NativeType("XrResult")
    public static int xrGetSenseDataProviderStateBD(XrSenseDataProviderBD provider, @NativeType("XrSenseDataProviderStateBD *") IntBuffer state) {
        if (CHECKS) {
            check(state, 1);
        }
        return nxrGetSenseDataProviderStateBD(provider, memAddress(state));
    }

    // --- [ xrQuerySenseDataAsyncBD ] ---

    /** {@code XrResult xrQuerySenseDataAsyncBD(XrSenseDataProviderBD provider, XrSenseDataQueryInfoBD const * queryInfo, XrFutureEXT * future)} */
    public static int nxrQuerySenseDataAsyncBD(XrSenseDataProviderBD provider, long queryInfo, long future) {
        long __functionAddress = provider.getCapabilities().xrQuerySenseDataAsyncBD;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPPPI(provider.address(), queryInfo, future, __functionAddress);
    }

    /** {@code XrResult xrQuerySenseDataAsyncBD(XrSenseDataProviderBD provider, XrSenseDataQueryInfoBD const * queryInfo, XrFutureEXT * future)} */
    @NativeType("XrResult")
    public static int xrQuerySenseDataAsyncBD(XrSenseDataProviderBD provider, @NativeType("XrSenseDataQueryInfoBD const *") XrSenseDataQueryInfoBD queryInfo, @NativeType("XrFutureEXT *") LongBuffer future) {
        if (CHECKS) {
            check(future, 1);
        }
        return nxrQuerySenseDataAsyncBD(provider, queryInfo.address(), memAddress(future));
    }

    // --- [ xrQuerySenseDataCompleteBD ] ---

    /** {@code XrResult xrQuerySenseDataCompleteBD(XrSenseDataProviderBD provider, XrFutureEXT future, XrSenseDataQueryCompletionBD * completion)} */
    public static int nxrQuerySenseDataCompleteBD(XrSenseDataProviderBD provider, long future, long completion) {
        long __functionAddress = provider.getCapabilities().xrQuerySenseDataCompleteBD;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPJPI(provider.address(), future, completion, __functionAddress);
    }

    /** {@code XrResult xrQuerySenseDataCompleteBD(XrSenseDataProviderBD provider, XrFutureEXT future, XrSenseDataQueryCompletionBD * completion)} */
    @NativeType("XrResult")
    public static int xrQuerySenseDataCompleteBD(XrSenseDataProviderBD provider, @NativeType("XrFutureEXT") long future, @NativeType("XrSenseDataQueryCompletionBD *") XrSenseDataQueryCompletionBD completion) {
        return nxrQuerySenseDataCompleteBD(provider, future, completion.address());
    }

    // --- [ xrDestroySenseDataSnapshotBD ] ---

    /** {@code XrResult xrDestroySenseDataSnapshotBD(XrSenseDataSnapshotBD snapshot)} */
    @NativeType("XrResult")
    public static int xrDestroySenseDataSnapshotBD(XrSenseDataSnapshotBD snapshot) {
        long __functionAddress = snapshot.getCapabilities().xrDestroySenseDataSnapshotBD;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPI(snapshot.address(), __functionAddress);
    }

    // --- [ xrGetQueriedSenseDataBD ] ---

    /** {@code XrResult xrGetQueriedSenseDataBD(XrSenseDataSnapshotBD snapshot, XrQueriedSenseDataGetInfoBD * getInfo, XrQueriedSenseDataBD * queriedSenseData)} */
    public static int nxrGetQueriedSenseDataBD(XrSenseDataSnapshotBD snapshot, long getInfo, long queriedSenseData) {
        long __functionAddress = snapshot.getCapabilities().xrGetQueriedSenseDataBD;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPPPI(snapshot.address(), getInfo, queriedSenseData, __functionAddress);
    }

    /** {@code XrResult xrGetQueriedSenseDataBD(XrSenseDataSnapshotBD snapshot, XrQueriedSenseDataGetInfoBD * getInfo, XrQueriedSenseDataBD * queriedSenseData)} */
    @NativeType("XrResult")
    public static int xrGetQueriedSenseDataBD(XrSenseDataSnapshotBD snapshot, @NativeType("XrQueriedSenseDataGetInfoBD *") XrQueriedSenseDataGetInfoBD getInfo, @NativeType("XrQueriedSenseDataBD *") XrQueriedSenseDataBD queriedSenseData) {
        return nxrGetQueriedSenseDataBD(snapshot, getInfo.address(), queriedSenseData.address());
    }

    // --- [ xrStopSenseDataProviderBD ] ---

    /** {@code XrResult xrStopSenseDataProviderBD(XrSenseDataProviderBD provider)} */
    @NativeType("XrResult")
    public static int xrStopSenseDataProviderBD(XrSenseDataProviderBD provider) {
        long __functionAddress = provider.getCapabilities().xrStopSenseDataProviderBD;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPI(provider.address(), __functionAddress);
    }

    // --- [ xrDestroySenseDataProviderBD ] ---

    /** {@code XrResult xrDestroySenseDataProviderBD(XrSenseDataProviderBD provider)} */
    @NativeType("XrResult")
    public static int xrDestroySenseDataProviderBD(XrSenseDataProviderBD provider) {
        long __functionAddress = provider.getCapabilities().xrDestroySenseDataProviderBD;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPI(provider.address(), __functionAddress);
    }

    // --- [ xrCreateSpatialEntityAnchorBD ] ---

    /** {@code XrResult xrCreateSpatialEntityAnchorBD(XrSenseDataProviderBD provider, XrSpatialEntityAnchorCreateInfoBD const * createInfo, XrAnchorBD * anchor)} */
    public static int nxrCreateSpatialEntityAnchorBD(XrSenseDataProviderBD provider, long createInfo, long anchor) {
        long __functionAddress = provider.getCapabilities().xrCreateSpatialEntityAnchorBD;
        if (CHECKS) {
            check(__functionAddress);
            XrSpatialEntityAnchorCreateInfoBD.validate(createInfo);
        }
        return callPPPI(provider.address(), createInfo, anchor, __functionAddress);
    }

    /** {@code XrResult xrCreateSpatialEntityAnchorBD(XrSenseDataProviderBD provider, XrSpatialEntityAnchorCreateInfoBD const * createInfo, XrAnchorBD * anchor)} */
    @NativeType("XrResult")
    public static int xrCreateSpatialEntityAnchorBD(XrSenseDataProviderBD provider, @NativeType("XrSpatialEntityAnchorCreateInfoBD const *") XrSpatialEntityAnchorCreateInfoBD createInfo, @NativeType("XrAnchorBD *") PointerBuffer anchor) {
        if (CHECKS) {
            check(anchor, 1);
        }
        return nxrCreateSpatialEntityAnchorBD(provider, createInfo.address(), memAddress(anchor));
    }

    // --- [ xrDestroyAnchorBD ] ---

    /** {@code XrResult xrDestroyAnchorBD(XrAnchorBD anchor)} */
    @NativeType("XrResult")
    public static int xrDestroyAnchorBD(XrAnchorBD anchor) {
        long __functionAddress = anchor.getCapabilities().xrDestroyAnchorBD;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPI(anchor.address(), __functionAddress);
    }

    // --- [ xrGetAnchorUuidBD ] ---

    /** {@code XrResult xrGetAnchorUuidBD(XrAnchorBD anchor, XrUuidEXT * uuid)} */
    public static int nxrGetAnchorUuidBD(XrAnchorBD anchor, long uuid) {
        long __functionAddress = anchor.getCapabilities().xrGetAnchorUuidBD;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPPI(anchor.address(), uuid, __functionAddress);
    }

    /** {@code XrResult xrGetAnchorUuidBD(XrAnchorBD anchor, XrUuidEXT * uuid)} */
    @NativeType("XrResult")
    public static int xrGetAnchorUuidBD(XrAnchorBD anchor, @NativeType("XrUuidEXT *") XrUuidEXT uuid) {
        return nxrGetAnchorUuidBD(anchor, uuid.address());
    }

    // --- [ xrCreateAnchorSpaceBD ] ---

    /** {@code XrResult xrCreateAnchorSpaceBD(XrSession session, XrAnchorSpaceCreateInfoBD const * createInfo, XrSpace * space)} */
    public static int nxrCreateAnchorSpaceBD(XrSession session, long createInfo, long space) {
        long __functionAddress = session.getCapabilities().xrCreateAnchorSpaceBD;
        if (CHECKS) {
            check(__functionAddress);
            XrAnchorSpaceCreateInfoBD.validate(createInfo);
        }
        return callPPPI(session.address(), createInfo, space, __functionAddress);
    }

    /** {@code XrResult xrCreateAnchorSpaceBD(XrSession session, XrAnchorSpaceCreateInfoBD const * createInfo, XrSpace * space)} */
    @NativeType("XrResult")
    public static int xrCreateAnchorSpaceBD(XrSession session, @NativeType("XrAnchorSpaceCreateInfoBD const *") XrAnchorSpaceCreateInfoBD createInfo, @NativeType("XrSpace *") PointerBuffer space) {
        if (CHECKS) {
            check(space, 1);
        }
        return nxrCreateAnchorSpaceBD(session, createInfo.address(), memAddress(space));
    }

}