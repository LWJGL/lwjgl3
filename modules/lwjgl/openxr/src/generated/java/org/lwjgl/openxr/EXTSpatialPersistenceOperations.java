/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.openxr;

import java.nio.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.JNI.*;
import static org.lwjgl.system.MemoryUtil.*;

public class EXTSpatialPersistenceOperations {

    public static final int XR_EXT_spatial_persistence_operations_SPEC_VERSION = 1;

    public static final String XR_EXT_SPATIAL_PERSISTENCE_OPERATIONS_EXTENSION_NAME = "XR_EXT_spatial_persistence_operations";

    public static final int XR_ERROR_SPATIAL_PERSISTENCE_SCOPE_INCOMPATIBLE_EXT = -1000781001;

    public static final int XR_SPATIAL_PERSISTENCE_SCOPE_LOCAL_ANCHORS_EXT = 1000781000;

    public static final int
        XR_SPATIAL_PERSISTENCE_CONTEXT_RESULT_ENTITY_NOT_TRACKING_EXT    = -1000781001,
        XR_SPATIAL_PERSISTENCE_CONTEXT_RESULT_PERSIST_UUID_NOT_FOUND_EXT = -1000781002;

    public static final int
        XR_TYPE_SPATIAL_ENTITY_PERSIST_INFO_EXT         = 1000781000,
        XR_TYPE_PERSIST_SPATIAL_ENTITY_COMPLETION_EXT   = 1000781001,
        XR_TYPE_SPATIAL_ENTITY_UNPERSIST_INFO_EXT       = 1000781002,
        XR_TYPE_UNPERSIST_SPATIAL_ENTITY_COMPLETION_EXT = 1000781003;

    protected EXTSpatialPersistenceOperations() {
        throw new UnsupportedOperationException();
    }

    // --- [ xrPersistSpatialEntityAsyncEXT ] ---

    /** {@code XrResult xrPersistSpatialEntityAsyncEXT(XrSpatialPersistenceContextEXT persistenceContext, XrSpatialEntityPersistInfoEXT const * persistInfo, XrFutureEXT * future)} */
    public static int nxrPersistSpatialEntityAsyncEXT(XrSpatialPersistenceContextEXT persistenceContext, long persistInfo, long future) {
        long __functionAddress = persistenceContext.getCapabilities().xrPersistSpatialEntityAsyncEXT;
        if (CHECKS) {
            check(__functionAddress);
            XrSpatialEntityPersistInfoEXT.validate(persistInfo);
        }
        return callPPPI(persistenceContext.address(), persistInfo, future, __functionAddress);
    }

    /** {@code XrResult xrPersistSpatialEntityAsyncEXT(XrSpatialPersistenceContextEXT persistenceContext, XrSpatialEntityPersistInfoEXT const * persistInfo, XrFutureEXT * future)} */
    @NativeType("XrResult")
    public static int xrPersistSpatialEntityAsyncEXT(XrSpatialPersistenceContextEXT persistenceContext, @NativeType("XrSpatialEntityPersistInfoEXT const *") XrSpatialEntityPersistInfoEXT persistInfo, @NativeType("XrFutureEXT *") LongBuffer future) {
        if (CHECKS) {
            check(future, 1);
        }
        return nxrPersistSpatialEntityAsyncEXT(persistenceContext, persistInfo.address(), memAddress(future));
    }

    // --- [ xrPersistSpatialEntityCompleteEXT ] ---

    /** {@code XrResult xrPersistSpatialEntityCompleteEXT(XrSpatialPersistenceContextEXT persistenceContext, XrFutureEXT future, XrPersistSpatialEntityCompletionEXT * completion)} */
    public static int nxrPersistSpatialEntityCompleteEXT(XrSpatialPersistenceContextEXT persistenceContext, long future, long completion) {
        long __functionAddress = persistenceContext.getCapabilities().xrPersistSpatialEntityCompleteEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPJPI(persistenceContext.address(), future, completion, __functionAddress);
    }

    /** {@code XrResult xrPersistSpatialEntityCompleteEXT(XrSpatialPersistenceContextEXT persistenceContext, XrFutureEXT future, XrPersistSpatialEntityCompletionEXT * completion)} */
    @NativeType("XrResult")
    public static int xrPersistSpatialEntityCompleteEXT(XrSpatialPersistenceContextEXT persistenceContext, @NativeType("XrFutureEXT") long future, @NativeType("XrPersistSpatialEntityCompletionEXT *") XrPersistSpatialEntityCompletionEXT completion) {
        return nxrPersistSpatialEntityCompleteEXT(persistenceContext, future, completion.address());
    }

    // --- [ xrUnpersistSpatialEntityAsyncEXT ] ---

    /** {@code XrResult xrUnpersistSpatialEntityAsyncEXT(XrSpatialPersistenceContextEXT persistenceContext, XrSpatialEntityUnpersistInfoEXT const * unpersistInfo, XrFutureEXT * future)} */
    public static int nxrUnpersistSpatialEntityAsyncEXT(XrSpatialPersistenceContextEXT persistenceContext, long unpersistInfo, long future) {
        long __functionAddress = persistenceContext.getCapabilities().xrUnpersistSpatialEntityAsyncEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPPPI(persistenceContext.address(), unpersistInfo, future, __functionAddress);
    }

    /** {@code XrResult xrUnpersistSpatialEntityAsyncEXT(XrSpatialPersistenceContextEXT persistenceContext, XrSpatialEntityUnpersistInfoEXT const * unpersistInfo, XrFutureEXT * future)} */
    @NativeType("XrResult")
    public static int xrUnpersistSpatialEntityAsyncEXT(XrSpatialPersistenceContextEXT persistenceContext, @NativeType("XrSpatialEntityUnpersistInfoEXT const *") XrSpatialEntityUnpersistInfoEXT unpersistInfo, @NativeType("XrFutureEXT *") LongBuffer future) {
        if (CHECKS) {
            check(future, 1);
        }
        return nxrUnpersistSpatialEntityAsyncEXT(persistenceContext, unpersistInfo.address(), memAddress(future));
    }

    // --- [ xrUnpersistSpatialEntityCompleteEXT ] ---

    /** {@code XrResult xrUnpersistSpatialEntityCompleteEXT(XrSpatialPersistenceContextEXT persistenceContext, XrFutureEXT future, XrUnpersistSpatialEntityCompletionEXT * completion)} */
    public static int nxrUnpersistSpatialEntityCompleteEXT(XrSpatialPersistenceContextEXT persistenceContext, long future, long completion) {
        long __functionAddress = persistenceContext.getCapabilities().xrUnpersistSpatialEntityCompleteEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPJPI(persistenceContext.address(), future, completion, __functionAddress);
    }

    /** {@code XrResult xrUnpersistSpatialEntityCompleteEXT(XrSpatialPersistenceContextEXT persistenceContext, XrFutureEXT future, XrUnpersistSpatialEntityCompletionEXT * completion)} */
    @NativeType("XrResult")
    public static int xrUnpersistSpatialEntityCompleteEXT(XrSpatialPersistenceContextEXT persistenceContext, @NativeType("XrFutureEXT") long future, @NativeType("XrUnpersistSpatialEntityCompletionEXT *") XrUnpersistSpatialEntityCompletionEXT completion) {
        return nxrUnpersistSpatialEntityCompleteEXT(persistenceContext, future, completion.address());
    }

}