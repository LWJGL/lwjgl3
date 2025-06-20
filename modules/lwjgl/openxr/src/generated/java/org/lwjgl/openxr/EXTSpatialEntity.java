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

public class EXTSpatialEntity {

    public static final int XR_EXT_spatial_entity_SPEC_VERSION = 1;

    public static final String XR_EXT_SPATIAL_ENTITY_EXTENSION_NAME = "XR_EXT_spatial_entity";

    public static final int
        XR_OBJECT_TYPE_SPATIAL_ENTITY_EXT   = 1000740000,
        XR_OBJECT_TYPE_SPATIAL_CONTEXT_EXT  = 1000740001,
        XR_OBJECT_TYPE_SPATIAL_SNAPSHOT_EXT = 1000740002;

    public static final int
        XR_ERROR_SPATIAL_CAPABILITY_UNSUPPORTED_EXT               = -1000740001,
        XR_ERROR_SPATIAL_ENTITY_ID_INVALID_EXT                    = -1000740002,
        XR_ERROR_SPATIAL_BUFFER_ID_INVALID_EXT                    = -1000740003,
        XR_ERROR_SPATIAL_COMPONENT_UNSUPPORTED_FOR_CAPABILITY_EXT = -1000740004,
        XR_ERROR_SPATIAL_CAPABILITY_CONFIGURATION_INVALID_EXT     = -1000740005,
        XR_ERROR_SPATIAL_COMPONENT_NOT_ENABLED_EXT                = -1000740006;

    public static final int
        XR_TYPE_SPATIAL_CAPABILITY_COMPONENT_TYPES_EXT                = 1000740000,
        XR_TYPE_SPATIAL_CONTEXT_CREATE_INFO_EXT                       = 1000740001,
        XR_TYPE_CREATE_SPATIAL_CONTEXT_COMPLETION_EXT                 = 1000740002,
        XR_TYPE_SPATIAL_DISCOVERY_SNAPSHOT_CREATE_INFO_EXT            = 1000740003,
        XR_TYPE_CREATE_SPATIAL_DISCOVERY_SNAPSHOT_COMPLETION_INFO_EXT = 1000740004,
        XR_TYPE_CREATE_SPATIAL_DISCOVERY_SNAPSHOT_COMPLETION_EXT      = 1000740005,
        XR_TYPE_SPATIAL_COMPONENT_DATA_QUERY_CONDITION_EXT            = 1000740006,
        XR_TYPE_SPATIAL_COMPONENT_DATA_QUERY_RESULT_EXT               = 1000740007,
        XR_TYPE_SPATIAL_BUFFER_GET_INFO_EXT                           = 1000740008,
        XR_TYPE_SPATIAL_COMPONENT_BOUNDED_2D_LIST_EXT                 = 1000740009,
        XR_TYPE_SPATIAL_COMPONENT_BOUNDED_3D_LIST_EXT                 = 1000740010,
        XR_TYPE_SPATIAL_COMPONENT_PARENT_LIST_EXT                     = 1000740011,
        XR_TYPE_SPATIAL_COMPONENT_MESH_3D_LIST_EXT                    = 1000740012,
        XR_TYPE_SPATIAL_ENTITY_FROM_ID_CREATE_INFO_EXT                = 1000740013,
        XR_TYPE_SPATIAL_UPDATE_SNAPSHOT_CREATE_INFO_EXT               = 1000740014,
        XR_TYPE_EVENT_DATA_SPATIAL_DISCOVERY_RECOMMENDED_EXT          = 1000740015,
        XR_TYPE_SPATIAL_FILTER_TRACKING_STATE_EXT                     = 1000740016;

    public static final int
        XR_SPATIAL_COMPONENT_TYPE_BOUNDED_2D_EXT = 1,
        XR_SPATIAL_COMPONENT_TYPE_BOUNDED_3D_EXT = 2,
        XR_SPATIAL_COMPONENT_TYPE_PARENT_EXT     = 3,
        XR_SPATIAL_COMPONENT_TYPE_MESH_3D_EXT    = 4;

    public static final int
        XR_SPATIAL_ENTITY_TRACKING_STATE_STOPPED_EXT  = 1,
        XR_SPATIAL_ENTITY_TRACKING_STATE_PAUSED_EXT   = 2,
        XR_SPATIAL_ENTITY_TRACKING_STATE_TRACKING_EXT = 3;

    public static final int
        XR_SPATIAL_BUFFER_TYPE_UNKNOWN_EXT  = 0,
        XR_SPATIAL_BUFFER_TYPE_STRING_EXT   = 1,
        XR_SPATIAL_BUFFER_TYPE_UINT8_EXT    = 2,
        XR_SPATIAL_BUFFER_TYPE_UINT16_EXT   = 3,
        XR_SPATIAL_BUFFER_TYPE_UINT32_EXT   = 4,
        XR_SPATIAL_BUFFER_TYPE_FLOAT_EXT    = 5,
        XR_SPATIAL_BUFFER_TYPE_VECTOR2F_EXT = 6,
        XR_SPATIAL_BUFFER_TYPE_VECTOR3F_EXT = 7;

    protected EXTSpatialEntity() {
        throw new UnsupportedOperationException();
    }

    // --- [ xrEnumerateSpatialCapabilitiesEXT ] ---

    /** {@code XrResult xrEnumerateSpatialCapabilitiesEXT(XrInstance instance, XrSystemId systemId, uint32_t capabilityCapacityInput, uint32_t * capabilityCountOutput, XrSpatialCapabilityEXT * capabilities)} */
    public static int nxrEnumerateSpatialCapabilitiesEXT(XrInstance instance, long systemId, int capabilityCapacityInput, long capabilityCountOutput, long capabilities) {
        long __functionAddress = instance.getCapabilities().xrEnumerateSpatialCapabilitiesEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPJPPI(instance.address(), systemId, capabilityCapacityInput, capabilityCountOutput, capabilities, __functionAddress);
    }

    /** {@code XrResult xrEnumerateSpatialCapabilitiesEXT(XrInstance instance, XrSystemId systemId, uint32_t capabilityCapacityInput, uint32_t * capabilityCountOutput, XrSpatialCapabilityEXT * capabilities)} */
    @NativeType("XrResult")
    public static int xrEnumerateSpatialCapabilitiesEXT(XrInstance instance, @NativeType("XrSystemId") long systemId, @NativeType("uint32_t *") IntBuffer capabilityCountOutput, @NativeType("XrSpatialCapabilityEXT *") @Nullable IntBuffer capabilities) {
        if (CHECKS) {
            check(capabilityCountOutput, 1);
        }
        return nxrEnumerateSpatialCapabilitiesEXT(instance, systemId, remainingSafe(capabilities), memAddress(capabilityCountOutput), memAddressSafe(capabilities));
    }

    // --- [ xrEnumerateSpatialCapabilityComponentTypesEXT ] ---

    /** {@code XrResult xrEnumerateSpatialCapabilityComponentTypesEXT(XrInstance instance, XrSystemId systemId, XrSpatialCapabilityEXT capability, XrSpatialCapabilityComponentTypesEXT * capabilityComponents)} */
    public static int nxrEnumerateSpatialCapabilityComponentTypesEXT(XrInstance instance, long systemId, int capability, long capabilityComponents) {
        long __functionAddress = instance.getCapabilities().xrEnumerateSpatialCapabilityComponentTypesEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPJPI(instance.address(), systemId, capability, capabilityComponents, __functionAddress);
    }

    /** {@code XrResult xrEnumerateSpatialCapabilityComponentTypesEXT(XrInstance instance, XrSystemId systemId, XrSpatialCapabilityEXT capability, XrSpatialCapabilityComponentTypesEXT * capabilityComponents)} */
    @NativeType("XrResult")
    public static int xrEnumerateSpatialCapabilityComponentTypesEXT(XrInstance instance, @NativeType("XrSystemId") long systemId, @NativeType("XrSpatialCapabilityEXT") int capability, @NativeType("XrSpatialCapabilityComponentTypesEXT *") XrSpatialCapabilityComponentTypesEXT capabilityComponents) {
        return nxrEnumerateSpatialCapabilityComponentTypesEXT(instance, systemId, capability, capabilityComponents.address());
    }

    // --- [ xrEnumerateSpatialCapabilityFeaturesEXT ] ---

    /** {@code XrResult xrEnumerateSpatialCapabilityFeaturesEXT(XrInstance instance, XrSystemId systemId, XrSpatialCapabilityEXT capability, uint32_t capabilityFeatureCapacityInput, uint32_t * capabilityFeatureCountOutput, XrSpatialCapabilityFeatureEXT * capabilityFeatures)} */
    public static int nxrEnumerateSpatialCapabilityFeaturesEXT(XrInstance instance, long systemId, int capability, int capabilityFeatureCapacityInput, long capabilityFeatureCountOutput, long capabilityFeatures) {
        long __functionAddress = instance.getCapabilities().xrEnumerateSpatialCapabilityFeaturesEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPJPPI(instance.address(), systemId, capability, capabilityFeatureCapacityInput, capabilityFeatureCountOutput, capabilityFeatures, __functionAddress);
    }

    /** {@code XrResult xrEnumerateSpatialCapabilityFeaturesEXT(XrInstance instance, XrSystemId systemId, XrSpatialCapabilityEXT capability, uint32_t capabilityFeatureCapacityInput, uint32_t * capabilityFeatureCountOutput, XrSpatialCapabilityFeatureEXT * capabilityFeatures)} */
    @NativeType("XrResult")
    public static int xrEnumerateSpatialCapabilityFeaturesEXT(XrInstance instance, @NativeType("XrSystemId") long systemId, @NativeType("XrSpatialCapabilityEXT") int capability, @NativeType("uint32_t *") IntBuffer capabilityFeatureCountOutput, @NativeType("XrSpatialCapabilityFeatureEXT *") @Nullable IntBuffer capabilityFeatures) {
        if (CHECKS) {
            check(capabilityFeatureCountOutput, 1);
        }
        return nxrEnumerateSpatialCapabilityFeaturesEXT(instance, systemId, capability, remainingSafe(capabilityFeatures), memAddress(capabilityFeatureCountOutput), memAddressSafe(capabilityFeatures));
    }

    // --- [ xrCreateSpatialContextAsyncEXT ] ---

    /** {@code XrResult xrCreateSpatialContextAsyncEXT(XrSession session, XrSpatialContextCreateInfoEXT const * createInfo, XrFutureEXT * future)} */
    public static int nxrCreateSpatialContextAsyncEXT(XrSession session, long createInfo, long future) {
        long __functionAddress = session.getCapabilities().xrCreateSpatialContextAsyncEXT;
        if (CHECKS) {
            check(__functionAddress);
            XrSpatialContextCreateInfoEXT.validate(createInfo);
        }
        return callPPPI(session.address(), createInfo, future, __functionAddress);
    }

    /** {@code XrResult xrCreateSpatialContextAsyncEXT(XrSession session, XrSpatialContextCreateInfoEXT const * createInfo, XrFutureEXT * future)} */
    @NativeType("XrResult")
    public static int xrCreateSpatialContextAsyncEXT(XrSession session, @NativeType("XrSpatialContextCreateInfoEXT const *") XrSpatialContextCreateInfoEXT createInfo, @NativeType("XrFutureEXT *") LongBuffer future) {
        if (CHECKS) {
            check(future, 1);
        }
        return nxrCreateSpatialContextAsyncEXT(session, createInfo.address(), memAddress(future));
    }

    // --- [ xrCreateSpatialContextCompleteEXT ] ---

    /** {@code XrResult xrCreateSpatialContextCompleteEXT(XrSession session, XrFutureEXT future, XrCreateSpatialContextCompletionEXT * completion)} */
    public static int nxrCreateSpatialContextCompleteEXT(XrSession session, long future, long completion) {
        long __functionAddress = session.getCapabilities().xrCreateSpatialContextCompleteEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPJPI(session.address(), future, completion, __functionAddress);
    }

    /** {@code XrResult xrCreateSpatialContextCompleteEXT(XrSession session, XrFutureEXT future, XrCreateSpatialContextCompletionEXT * completion)} */
    @NativeType("XrResult")
    public static int xrCreateSpatialContextCompleteEXT(XrSession session, @NativeType("XrFutureEXT") long future, @NativeType("XrCreateSpatialContextCompletionEXT *") XrCreateSpatialContextCompletionEXT completion) {
        return nxrCreateSpatialContextCompleteEXT(session, future, completion.address());
    }

    // --- [ xrDestroySpatialContextEXT ] ---

    /** {@code XrResult xrDestroySpatialContextEXT(XrSpatialContextEXT spatialContext)} */
    @NativeType("XrResult")
    public static int xrDestroySpatialContextEXT(XrSpatialContextEXT spatialContext) {
        long __functionAddress = spatialContext.getCapabilities().xrDestroySpatialContextEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPI(spatialContext.address(), __functionAddress);
    }

    // --- [ xrCreateSpatialDiscoverySnapshotAsyncEXT ] ---

    /** {@code XrResult xrCreateSpatialDiscoverySnapshotAsyncEXT(XrSpatialContextEXT spatialContext, XrSpatialDiscoverySnapshotCreateInfoEXT const * createInfo, XrFutureEXT * future)} */
    public static int nxrCreateSpatialDiscoverySnapshotAsyncEXT(XrSpatialContextEXT spatialContext, long createInfo, long future) {
        long __functionAddress = spatialContext.getCapabilities().xrCreateSpatialDiscoverySnapshotAsyncEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPPPI(spatialContext.address(), createInfo, future, __functionAddress);
    }

    /** {@code XrResult xrCreateSpatialDiscoverySnapshotAsyncEXT(XrSpatialContextEXT spatialContext, XrSpatialDiscoverySnapshotCreateInfoEXT const * createInfo, XrFutureEXT * future)} */
    @NativeType("XrResult")
    public static int xrCreateSpatialDiscoverySnapshotAsyncEXT(XrSpatialContextEXT spatialContext, @NativeType("XrSpatialDiscoverySnapshotCreateInfoEXT const *") XrSpatialDiscoverySnapshotCreateInfoEXT createInfo, @NativeType("XrFutureEXT *") LongBuffer future) {
        if (CHECKS) {
            check(future, 1);
        }
        return nxrCreateSpatialDiscoverySnapshotAsyncEXT(spatialContext, createInfo.address(), memAddress(future));
    }

    // --- [ xrCreateSpatialDiscoverySnapshotCompleteEXT ] ---

    /** {@code XrResult xrCreateSpatialDiscoverySnapshotCompleteEXT(XrSpatialContextEXT spatialContext, XrCreateSpatialDiscoverySnapshotCompletionInfoEXT const * createSnapshotCompletionInfo, XrCreateSpatialDiscoverySnapshotCompletionEXT * completion)} */
    public static int nxrCreateSpatialDiscoverySnapshotCompleteEXT(XrSpatialContextEXT spatialContext, long createSnapshotCompletionInfo, long completion) {
        long __functionAddress = spatialContext.getCapabilities().xrCreateSpatialDiscoverySnapshotCompleteEXT;
        if (CHECKS) {
            check(__functionAddress);
            XrCreateSpatialDiscoverySnapshotCompletionInfoEXT.validate(createSnapshotCompletionInfo);
        }
        return callPPPI(spatialContext.address(), createSnapshotCompletionInfo, completion, __functionAddress);
    }

    /** {@code XrResult xrCreateSpatialDiscoverySnapshotCompleteEXT(XrSpatialContextEXT spatialContext, XrCreateSpatialDiscoverySnapshotCompletionInfoEXT const * createSnapshotCompletionInfo, XrCreateSpatialDiscoverySnapshotCompletionEXT * completion)} */
    @NativeType("XrResult")
    public static int xrCreateSpatialDiscoverySnapshotCompleteEXT(XrSpatialContextEXT spatialContext, @NativeType("XrCreateSpatialDiscoverySnapshotCompletionInfoEXT const *") XrCreateSpatialDiscoverySnapshotCompletionInfoEXT createSnapshotCompletionInfo, @NativeType("XrCreateSpatialDiscoverySnapshotCompletionEXT *") XrCreateSpatialDiscoverySnapshotCompletionEXT completion) {
        return nxrCreateSpatialDiscoverySnapshotCompleteEXT(spatialContext, createSnapshotCompletionInfo.address(), completion.address());
    }

    // --- [ xrQuerySpatialComponentDataEXT ] ---

    /** {@code XrResult xrQuerySpatialComponentDataEXT(XrSpatialSnapshotEXT snapshot, XrSpatialComponentDataQueryConditionEXT const * queryCondition, XrSpatialComponentDataQueryResultEXT * queryResult)} */
    public static int nxrQuerySpatialComponentDataEXT(XrSpatialSnapshotEXT snapshot, long queryCondition, long queryResult) {
        long __functionAddress = snapshot.getCapabilities().xrQuerySpatialComponentDataEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPPPI(snapshot.address(), queryCondition, queryResult, __functionAddress);
    }

    /** {@code XrResult xrQuerySpatialComponentDataEXT(XrSpatialSnapshotEXT snapshot, XrSpatialComponentDataQueryConditionEXT const * queryCondition, XrSpatialComponentDataQueryResultEXT * queryResult)} */
    @NativeType("XrResult")
    public static int xrQuerySpatialComponentDataEXT(XrSpatialSnapshotEXT snapshot, @NativeType("XrSpatialComponentDataQueryConditionEXT const *") XrSpatialComponentDataQueryConditionEXT queryCondition, @NativeType("XrSpatialComponentDataQueryResultEXT *") XrSpatialComponentDataQueryResultEXT queryResult) {
        return nxrQuerySpatialComponentDataEXT(snapshot, queryCondition.address(), queryResult.address());
    }

    // --- [ xrDestroySpatialSnapshotEXT ] ---

    /** {@code XrResult xrDestroySpatialSnapshotEXT(XrSpatialSnapshotEXT snapshot)} */
    @NativeType("XrResult")
    public static int xrDestroySpatialSnapshotEXT(XrSpatialSnapshotEXT snapshot) {
        long __functionAddress = snapshot.getCapabilities().xrDestroySpatialSnapshotEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPI(snapshot.address(), __functionAddress);
    }

    // --- [ xrCreateSpatialEntityFromIdEXT ] ---

    /** {@code XrResult xrCreateSpatialEntityFromIdEXT(XrSpatialContextEXT spatialContext, XrSpatialEntityFromIdCreateInfoEXT const * createInfo, XrSpatialEntityEXT * spatialEntity)} */
    public static int nxrCreateSpatialEntityFromIdEXT(XrSpatialContextEXT spatialContext, long createInfo, long spatialEntity) {
        long __functionAddress = spatialContext.getCapabilities().xrCreateSpatialEntityFromIdEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPPPI(spatialContext.address(), createInfo, spatialEntity, __functionAddress);
    }

    /** {@code XrResult xrCreateSpatialEntityFromIdEXT(XrSpatialContextEXT spatialContext, XrSpatialEntityFromIdCreateInfoEXT const * createInfo, XrSpatialEntityEXT * spatialEntity)} */
    @NativeType("XrResult")
    public static int xrCreateSpatialEntityFromIdEXT(XrSpatialContextEXT spatialContext, @NativeType("XrSpatialEntityFromIdCreateInfoEXT const *") XrSpatialEntityFromIdCreateInfoEXT createInfo, @NativeType("XrSpatialEntityEXT *") PointerBuffer spatialEntity) {
        if (CHECKS) {
            check(spatialEntity, 1);
        }
        return nxrCreateSpatialEntityFromIdEXT(spatialContext, createInfo.address(), memAddress(spatialEntity));
    }

    // --- [ xrDestroySpatialEntityEXT ] ---

    /** {@code XrResult xrDestroySpatialEntityEXT(XrSpatialEntityEXT spatialEntity)} */
    @NativeType("XrResult")
    public static int xrDestroySpatialEntityEXT(XrSpatialEntityEXT spatialEntity) {
        long __functionAddress = spatialEntity.getCapabilities().xrDestroySpatialEntityEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPI(spatialEntity.address(), __functionAddress);
    }

    // --- [ xrCreateSpatialUpdateSnapshotEXT ] ---

    /** {@code XrResult xrCreateSpatialUpdateSnapshotEXT(XrSpatialContextEXT spatialContext, XrSpatialUpdateSnapshotCreateInfoEXT const * createInfo, XrSpatialSnapshotEXT * snapshot)} */
    public static int nxrCreateSpatialUpdateSnapshotEXT(XrSpatialContextEXT spatialContext, long createInfo, long snapshot) {
        long __functionAddress = spatialContext.getCapabilities().xrCreateSpatialUpdateSnapshotEXT;
        if (CHECKS) {
            check(__functionAddress);
            XrSpatialUpdateSnapshotCreateInfoEXT.validate(createInfo);
        }
        return callPPPI(spatialContext.address(), createInfo, snapshot, __functionAddress);
    }

    /** {@code XrResult xrCreateSpatialUpdateSnapshotEXT(XrSpatialContextEXT spatialContext, XrSpatialUpdateSnapshotCreateInfoEXT const * createInfo, XrSpatialSnapshotEXT * snapshot)} */
    @NativeType("XrResult")
    public static int xrCreateSpatialUpdateSnapshotEXT(XrSpatialContextEXT spatialContext, @NativeType("XrSpatialUpdateSnapshotCreateInfoEXT const *") XrSpatialUpdateSnapshotCreateInfoEXT createInfo, @NativeType("XrSpatialSnapshotEXT *") PointerBuffer snapshot) {
        if (CHECKS) {
            check(snapshot, 1);
        }
        return nxrCreateSpatialUpdateSnapshotEXT(spatialContext, createInfo.address(), memAddress(snapshot));
    }

    // --- [ xrGetSpatialBufferStringEXT ] ---

    /** {@code XrResult xrGetSpatialBufferStringEXT(XrSpatialSnapshotEXT snapshot, XrSpatialBufferGetInfoEXT const * info, uint32_t bufferCapacityInput, uint32_t * bufferCountOutput, char * buffer)} */
    public static int nxrGetSpatialBufferStringEXT(XrSpatialSnapshotEXT snapshot, long info, int bufferCapacityInput, long bufferCountOutput, long buffer) {
        long __functionAddress = snapshot.getCapabilities().xrGetSpatialBufferStringEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPPPPI(snapshot.address(), info, bufferCapacityInput, bufferCountOutput, buffer, __functionAddress);
    }

    /** {@code XrResult xrGetSpatialBufferStringEXT(XrSpatialSnapshotEXT snapshot, XrSpatialBufferGetInfoEXT const * info, uint32_t bufferCapacityInput, uint32_t * bufferCountOutput, char * buffer)} */
    @NativeType("XrResult")
    public static int xrGetSpatialBufferStringEXT(XrSpatialSnapshotEXT snapshot, @NativeType("XrSpatialBufferGetInfoEXT const *") XrSpatialBufferGetInfoEXT info, @NativeType("uint32_t *") IntBuffer bufferCountOutput, @NativeType("char *") @Nullable ByteBuffer buffer) {
        if (CHECKS) {
            check(bufferCountOutput, 1);
        }
        return nxrGetSpatialBufferStringEXT(snapshot, info.address(), remainingSafe(buffer), memAddress(bufferCountOutput), memAddressSafe(buffer));
    }

    // --- [ xrGetSpatialBufferUint8EXT ] ---

    /** {@code XrResult xrGetSpatialBufferUint8EXT(XrSpatialSnapshotEXT snapshot, XrSpatialBufferGetInfoEXT const * info, uint32_t bufferCapacityInput, uint32_t * bufferCountOutput, uint8_t * buffer)} */
    public static int nxrGetSpatialBufferUint8EXT(XrSpatialSnapshotEXT snapshot, long info, int bufferCapacityInput, long bufferCountOutput, long buffer) {
        long __functionAddress = snapshot.getCapabilities().xrGetSpatialBufferUint8EXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPPPPI(snapshot.address(), info, bufferCapacityInput, bufferCountOutput, buffer, __functionAddress);
    }

    /** {@code XrResult xrGetSpatialBufferUint8EXT(XrSpatialSnapshotEXT snapshot, XrSpatialBufferGetInfoEXT const * info, uint32_t bufferCapacityInput, uint32_t * bufferCountOutput, uint8_t * buffer)} */
    @NativeType("XrResult")
    public static int xrGetSpatialBufferUint8EXT(XrSpatialSnapshotEXT snapshot, @NativeType("XrSpatialBufferGetInfoEXT const *") XrSpatialBufferGetInfoEXT info, @NativeType("uint32_t *") IntBuffer bufferCountOutput, @NativeType("uint8_t *") @Nullable ByteBuffer buffer) {
        if (CHECKS) {
            check(bufferCountOutput, 1);
        }
        return nxrGetSpatialBufferUint8EXT(snapshot, info.address(), remainingSafe(buffer), memAddress(bufferCountOutput), memAddressSafe(buffer));
    }

    // --- [ xrGetSpatialBufferUint16EXT ] ---

    /** {@code XrResult xrGetSpatialBufferUint16EXT(XrSpatialSnapshotEXT snapshot, XrSpatialBufferGetInfoEXT const * info, uint32_t bufferCapacityInput, uint32_t * bufferCountOutput, uint16_t * buffer)} */
    public static int nxrGetSpatialBufferUint16EXT(XrSpatialSnapshotEXT snapshot, long info, int bufferCapacityInput, long bufferCountOutput, long buffer) {
        long __functionAddress = snapshot.getCapabilities().xrGetSpatialBufferUint16EXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPPPPI(snapshot.address(), info, bufferCapacityInput, bufferCountOutput, buffer, __functionAddress);
    }

    /** {@code XrResult xrGetSpatialBufferUint16EXT(XrSpatialSnapshotEXT snapshot, XrSpatialBufferGetInfoEXT const * info, uint32_t bufferCapacityInput, uint32_t * bufferCountOutput, uint16_t * buffer)} */
    @NativeType("XrResult")
    public static int xrGetSpatialBufferUint16EXT(XrSpatialSnapshotEXT snapshot, @NativeType("XrSpatialBufferGetInfoEXT const *") XrSpatialBufferGetInfoEXT info, @NativeType("uint32_t *") IntBuffer bufferCountOutput, @NativeType("uint16_t *") @Nullable ShortBuffer buffer) {
        if (CHECKS) {
            check(bufferCountOutput, 1);
        }
        return nxrGetSpatialBufferUint16EXT(snapshot, info.address(), remainingSafe(buffer), memAddress(bufferCountOutput), memAddressSafe(buffer));
    }

    // --- [ xrGetSpatialBufferUint32EXT ] ---

    /** {@code XrResult xrGetSpatialBufferUint32EXT(XrSpatialSnapshotEXT snapshot, XrSpatialBufferGetInfoEXT const * info, uint32_t bufferCapacityInput, uint32_t * bufferCountOutput, uint32_t * buffer)} */
    public static int nxrGetSpatialBufferUint32EXT(XrSpatialSnapshotEXT snapshot, long info, int bufferCapacityInput, long bufferCountOutput, long buffer) {
        long __functionAddress = snapshot.getCapabilities().xrGetSpatialBufferUint32EXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPPPPI(snapshot.address(), info, bufferCapacityInput, bufferCountOutput, buffer, __functionAddress);
    }

    /** {@code XrResult xrGetSpatialBufferUint32EXT(XrSpatialSnapshotEXT snapshot, XrSpatialBufferGetInfoEXT const * info, uint32_t bufferCapacityInput, uint32_t * bufferCountOutput, uint32_t * buffer)} */
    @NativeType("XrResult")
    public static int xrGetSpatialBufferUint32EXT(XrSpatialSnapshotEXT snapshot, @NativeType("XrSpatialBufferGetInfoEXT const *") XrSpatialBufferGetInfoEXT info, @NativeType("uint32_t *") IntBuffer bufferCountOutput, @NativeType("uint32_t *") @Nullable IntBuffer buffer) {
        if (CHECKS) {
            check(bufferCountOutput, 1);
        }
        return nxrGetSpatialBufferUint32EXT(snapshot, info.address(), remainingSafe(buffer), memAddress(bufferCountOutput), memAddressSafe(buffer));
    }

    // --- [ xrGetSpatialBufferFloatEXT ] ---

    /** {@code XrResult xrGetSpatialBufferFloatEXT(XrSpatialSnapshotEXT snapshot, XrSpatialBufferGetInfoEXT const * info, uint32_t bufferCapacityInput, uint32_t * bufferCountOutput, float * buffer)} */
    public static int nxrGetSpatialBufferFloatEXT(XrSpatialSnapshotEXT snapshot, long info, int bufferCapacityInput, long bufferCountOutput, long buffer) {
        long __functionAddress = snapshot.getCapabilities().xrGetSpatialBufferFloatEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPPPPI(snapshot.address(), info, bufferCapacityInput, bufferCountOutput, buffer, __functionAddress);
    }

    /** {@code XrResult xrGetSpatialBufferFloatEXT(XrSpatialSnapshotEXT snapshot, XrSpatialBufferGetInfoEXT const * info, uint32_t bufferCapacityInput, uint32_t * bufferCountOutput, float * buffer)} */
    @NativeType("XrResult")
    public static int xrGetSpatialBufferFloatEXT(XrSpatialSnapshotEXT snapshot, @NativeType("XrSpatialBufferGetInfoEXT const *") XrSpatialBufferGetInfoEXT info, @NativeType("uint32_t *") IntBuffer bufferCountOutput, @NativeType("float *") @Nullable FloatBuffer buffer) {
        if (CHECKS) {
            check(bufferCountOutput, 1);
        }
        return nxrGetSpatialBufferFloatEXT(snapshot, info.address(), remainingSafe(buffer), memAddress(bufferCountOutput), memAddressSafe(buffer));
    }

    // --- [ xrGetSpatialBufferVector2fEXT ] ---

    /** {@code XrResult xrGetSpatialBufferVector2fEXT(XrSpatialSnapshotEXT snapshot, XrSpatialBufferGetInfoEXT const * info, uint32_t bufferCapacityInput, uint32_t * bufferCountOutput, XrVector2f * buffer)} */
    public static int nxrGetSpatialBufferVector2fEXT(XrSpatialSnapshotEXT snapshot, long info, int bufferCapacityInput, long bufferCountOutput, long buffer) {
        long __functionAddress = snapshot.getCapabilities().xrGetSpatialBufferVector2fEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPPPPI(snapshot.address(), info, bufferCapacityInput, bufferCountOutput, buffer, __functionAddress);
    }

    /** {@code XrResult xrGetSpatialBufferVector2fEXT(XrSpatialSnapshotEXT snapshot, XrSpatialBufferGetInfoEXT const * info, uint32_t bufferCapacityInput, uint32_t * bufferCountOutput, XrVector2f * buffer)} */
    @NativeType("XrResult")
    public static int xrGetSpatialBufferVector2fEXT(XrSpatialSnapshotEXT snapshot, @NativeType("XrSpatialBufferGetInfoEXT const *") XrSpatialBufferGetInfoEXT info, @NativeType("uint32_t *") IntBuffer bufferCountOutput, @NativeType("XrVector2f *") XrVector2f.@Nullable Buffer buffer) {
        if (CHECKS) {
            check(bufferCountOutput, 1);
        }
        return nxrGetSpatialBufferVector2fEXT(snapshot, info.address(), remainingSafe(buffer), memAddress(bufferCountOutput), memAddressSafe(buffer));
    }

    // --- [ xrGetSpatialBufferVector3fEXT ] ---

    /** {@code XrResult xrGetSpatialBufferVector3fEXT(XrSpatialSnapshotEXT snapshot, XrSpatialBufferGetInfoEXT const * info, uint32_t bufferCapacityInput, uint32_t * bufferCountOutput, XrVector3f * buffer)} */
    public static int nxrGetSpatialBufferVector3fEXT(XrSpatialSnapshotEXT snapshot, long info, int bufferCapacityInput, long bufferCountOutput, long buffer) {
        long __functionAddress = snapshot.getCapabilities().xrGetSpatialBufferVector3fEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPPPPI(snapshot.address(), info, bufferCapacityInput, bufferCountOutput, buffer, __functionAddress);
    }

    /** {@code XrResult xrGetSpatialBufferVector3fEXT(XrSpatialSnapshotEXT snapshot, XrSpatialBufferGetInfoEXT const * info, uint32_t bufferCapacityInput, uint32_t * bufferCountOutput, XrVector3f * buffer)} */
    @NativeType("XrResult")
    public static int xrGetSpatialBufferVector3fEXT(XrSpatialSnapshotEXT snapshot, @NativeType("XrSpatialBufferGetInfoEXT const *") XrSpatialBufferGetInfoEXT info, @NativeType("uint32_t *") IntBuffer bufferCountOutput, @NativeType("XrVector3f *") XrVector3f.@Nullable Buffer buffer) {
        if (CHECKS) {
            check(bufferCountOutput, 1);
        }
        return nxrGetSpatialBufferVector3fEXT(snapshot, info.address(), remainingSafe(buffer), memAddress(bufferCountOutput), memAddressSafe(buffer));
    }

}