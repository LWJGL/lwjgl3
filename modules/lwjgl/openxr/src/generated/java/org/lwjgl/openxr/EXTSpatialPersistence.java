/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.openxr;

import org.jspecify.annotations.*;

import java.nio.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.JNI.*;
import static org.lwjgl.system.MemoryUtil.*;

public class EXTSpatialPersistence {

    public static final int XR_EXT_spatial_persistence_SPEC_VERSION = 1;

    public static final String XR_EXT_SPATIAL_PERSISTENCE_EXTENSION_NAME = "XR_EXT_spatial_persistence";

    public static final int XR_SPATIAL_COMPONENT_TYPE_PERSISTENCE_EXT = 1000763000;

    public static final int XR_OBJECT_TYPE_SPATIAL_PERSISTENCE_CONTEXT_EXT = 1000763000;

    public static final int XR_ERROR_SPATIAL_PERSISTENCE_SCOPE_UNSUPPORTED_EXT = -1000763001;

    public static final int
        XR_TYPE_SPATIAL_PERSISTENCE_CONTEXT_CREATE_INFO_EXT       = 1000763000,
        XR_TYPE_CREATE_SPATIAL_PERSISTENCE_CONTEXT_COMPLETION_EXT = 1000763001,
        XR_TYPE_SPATIAL_CONTEXT_PERSISTENCE_CONFIG_EXT            = 1000763002,
        XR_TYPE_SPATIAL_DISCOVERY_PERSISTENCE_UUID_FILTER_EXT     = 1000763003,
        XR_TYPE_SPATIAL_COMPONENT_PERSISTENCE_LIST_EXT            = 1000763004;

    public static final int XR_SPATIAL_PERSISTENCE_SCOPE_SYSTEM_MANAGED_EXT = 1;

    public static final int XR_SPATIAL_PERSISTENCE_CONTEXT_RESULT_SUCCESS_EXT = 0;

    public static final int
        XR_SPATIAL_PERSISTENCE_STATE_LOADED_EXT    = 1,
        XR_SPATIAL_PERSISTENCE_STATE_NOT_FOUND_EXT = 2;

    protected EXTSpatialPersistence() {
        throw new UnsupportedOperationException();
    }

    // --- [ xrEnumerateSpatialPersistenceScopesEXT ] ---

    /** {@code XrResult xrEnumerateSpatialPersistenceScopesEXT(XrInstance instance, XrSystemId systemId, uint32_t persistenceScopeCapacityInput, uint32_t * persistenceScopeCountOutput, XrSpatialPersistenceScopeEXT * persistenceScopes)} */
    public static int nxrEnumerateSpatialPersistenceScopesEXT(XrInstance instance, long systemId, int persistenceScopeCapacityInput, long persistenceScopeCountOutput, long persistenceScopes) {
        long __functionAddress = instance.getCapabilities().xrEnumerateSpatialPersistenceScopesEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPJPPI(instance.address(), systemId, persistenceScopeCapacityInput, persistenceScopeCountOutput, persistenceScopes, __functionAddress);
    }

    /** {@code XrResult xrEnumerateSpatialPersistenceScopesEXT(XrInstance instance, XrSystemId systemId, uint32_t persistenceScopeCapacityInput, uint32_t * persistenceScopeCountOutput, XrSpatialPersistenceScopeEXT * persistenceScopes)} */
    @NativeType("XrResult")
    public static int xrEnumerateSpatialPersistenceScopesEXT(XrInstance instance, @NativeType("XrSystemId") long systemId, @NativeType("uint32_t *") IntBuffer persistenceScopeCountOutput, @NativeType("XrSpatialPersistenceScopeEXT *") @Nullable IntBuffer persistenceScopes) {
        if (CHECKS) {
            check(persistenceScopeCountOutput, 1);
        }
        return nxrEnumerateSpatialPersistenceScopesEXT(instance, systemId, remainingSafe(persistenceScopes), memAddress(persistenceScopeCountOutput), memAddressSafe(persistenceScopes));
    }

    // --- [ xrCreateSpatialPersistenceContextAsyncEXT ] ---

    /** {@code XrResult xrCreateSpatialPersistenceContextAsyncEXT(XrSession session, XrSpatialPersistenceContextCreateInfoEXT const * createInfo, XrFutureEXT * future)} */
    public static int nxrCreateSpatialPersistenceContextAsyncEXT(XrSession session, long createInfo, long future) {
        long __functionAddress = session.getCapabilities().xrCreateSpatialPersistenceContextAsyncEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPPPI(session.address(), createInfo, future, __functionAddress);
    }

    /** {@code XrResult xrCreateSpatialPersistenceContextAsyncEXT(XrSession session, XrSpatialPersistenceContextCreateInfoEXT const * createInfo, XrFutureEXT * future)} */
    @NativeType("XrResult")
    public static int xrCreateSpatialPersistenceContextAsyncEXT(XrSession session, @NativeType("XrSpatialPersistenceContextCreateInfoEXT const *") XrSpatialPersistenceContextCreateInfoEXT createInfo, @NativeType("XrFutureEXT *") LongBuffer future) {
        if (CHECKS) {
            check(future, 1);
        }
        return nxrCreateSpatialPersistenceContextAsyncEXT(session, createInfo.address(), memAddress(future));
    }

    // --- [ xrCreateSpatialPersistenceContextCompleteEXT ] ---

    /** {@code XrResult xrCreateSpatialPersistenceContextCompleteEXT(XrSession session, XrFutureEXT future, XrCreateSpatialPersistenceContextCompletionEXT * completion)} */
    public static int nxrCreateSpatialPersistenceContextCompleteEXT(XrSession session, long future, long completion) {
        long __functionAddress = session.getCapabilities().xrCreateSpatialPersistenceContextCompleteEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPJPI(session.address(), future, completion, __functionAddress);
    }

    /** {@code XrResult xrCreateSpatialPersistenceContextCompleteEXT(XrSession session, XrFutureEXT future, XrCreateSpatialPersistenceContextCompletionEXT * completion)} */
    @NativeType("XrResult")
    public static int xrCreateSpatialPersistenceContextCompleteEXT(XrSession session, @NativeType("XrFutureEXT") long future, @NativeType("XrCreateSpatialPersistenceContextCompletionEXT *") XrCreateSpatialPersistenceContextCompletionEXT completion) {
        return nxrCreateSpatialPersistenceContextCompleteEXT(session, future, completion.address());
    }

    // --- [ xrDestroySpatialPersistenceContextEXT ] ---

    /** {@code XrResult xrDestroySpatialPersistenceContextEXT(XrSpatialPersistenceContextEXT persistenceContext)} */
    @NativeType("XrResult")
    public static int xrDestroySpatialPersistenceContextEXT(XrSpatialPersistenceContextEXT persistenceContext) {
        long __functionAddress = persistenceContext.getCapabilities().xrDestroySpatialPersistenceContextEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPI(persistenceContext.address(), __functionAddress);
    }

}