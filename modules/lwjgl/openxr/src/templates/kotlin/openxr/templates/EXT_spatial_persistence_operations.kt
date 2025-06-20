/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package openxr.templates

import org.lwjgl.generator.*
import openxr.*

val EXT_spatial_persistence_operations = "EXTSpatialPersistenceOperations".nativeClassXR("EXT_spatial_persistence_operations", type = "instance", postfix = "EXT") {
    IntConstant(
        "EXT_spatial_persistence_operations_SPEC_VERSION".."1"
    )

    StringConstant(
        "EXT_SPATIAL_PERSISTENCE_OPERATIONS_EXTENSION_NAME".."XR_EXT_spatial_persistence_operations"
    )

    EnumConstant(
        "ERROR_SPATIAL_PERSISTENCE_SCOPE_INCOMPATIBLE_EXT".."-1000781001"
    )

    EnumConstant(
        "SPATIAL_PERSISTENCE_SCOPE_LOCAL_ANCHORS_EXT".."1000781000"
    )

    EnumConstant(
        "SPATIAL_PERSISTENCE_CONTEXT_RESULT_ENTITY_NOT_TRACKING_EXT".."-1000781001",
        "SPATIAL_PERSISTENCE_CONTEXT_RESULT_PERSIST_UUID_NOT_FOUND_EXT".."-1000781002"
    )

    EnumConstant(
        "TYPE_SPATIAL_ENTITY_PERSIST_INFO_EXT".."1000781000",
        "TYPE_PERSIST_SPATIAL_ENTITY_COMPLETION_EXT".."1000781001",
        "TYPE_SPATIAL_ENTITY_UNPERSIST_INFO_EXT".."1000781002",
        "TYPE_UNPERSIST_SPATIAL_ENTITY_COMPLETION_EXT".."1000781003"
    )

    XrResult(
        "PersistSpatialEntityAsyncEXT",

        XrSpatialPersistenceContextEXT("persistenceContext"),
        XrSpatialEntityPersistInfoEXT.const.p("persistInfo"),
        Check(1)..XrFutureEXT.p("future")
    )

    XrResult(
        "PersistSpatialEntityCompleteEXT",

        XrSpatialPersistenceContextEXT("persistenceContext"),
        XrFutureEXT("future"),
        XrPersistSpatialEntityCompletionEXT.p("completion")
    )

    XrResult(
        "UnpersistSpatialEntityAsyncEXT",

        XrSpatialPersistenceContextEXT("persistenceContext"),
        XrSpatialEntityUnpersistInfoEXT.const.p("unpersistInfo"),
        Check(1)..XrFutureEXT.p("future")
    )

    XrResult(
        "UnpersistSpatialEntityCompleteEXT",

        XrSpatialPersistenceContextEXT("persistenceContext"),
        XrFutureEXT("future"),
        XrUnpersistSpatialEntityCompletionEXT.p("completion")
    )
}