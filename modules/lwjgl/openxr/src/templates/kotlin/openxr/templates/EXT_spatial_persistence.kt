/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package openxr.templates

import org.lwjgl.generator.*
import openxr.*

val EXT_spatial_persistence = "EXTSpatialPersistence".nativeClassXR("EXT_spatial_persistence", type = "instance", postfix = "EXT") {
    IntConstant(
        "EXT_spatial_persistence_SPEC_VERSION".."1"
    )

    StringConstant(
        "EXT_SPATIAL_PERSISTENCE_EXTENSION_NAME".."XR_EXT_spatial_persistence"
    )

    EnumConstant(
        "SPATIAL_COMPONENT_TYPE_PERSISTENCE_EXT".."1000763000"
    )

    EnumConstant(
        "OBJECT_TYPE_SPATIAL_PERSISTENCE_CONTEXT_EXT".."1000763000"
    )

    EnumConstant(
        "ERROR_SPATIAL_PERSISTENCE_SCOPE_UNSUPPORTED_EXT".."-1000763001"
    )

    EnumConstant(
        "TYPE_SPATIAL_PERSISTENCE_CONTEXT_CREATE_INFO_EXT".."1000763000",
        "TYPE_CREATE_SPATIAL_PERSISTENCE_CONTEXT_COMPLETION_EXT".."1000763001",
        "TYPE_SPATIAL_CONTEXT_PERSISTENCE_CONFIG_EXT".."1000763002",
        "TYPE_SPATIAL_DISCOVERY_PERSISTENCE_UUID_FILTER_EXT".."1000763003",
        "TYPE_SPATIAL_COMPONENT_PERSISTENCE_LIST_EXT".."1000763004"
    )

    EnumConstant(
        "SPATIAL_PERSISTENCE_SCOPE_SYSTEM_MANAGED_EXT".."1"
    )

    EnumConstant(
        "SPATIAL_PERSISTENCE_CONTEXT_RESULT_SUCCESS_EXT".."0"
    )

    EnumConstant(
        "SPATIAL_PERSISTENCE_STATE_LOADED_EXT".."1",
        "SPATIAL_PERSISTENCE_STATE_NOT_FOUND_EXT".."2"
    )

    XrResult(
        "EnumerateSpatialPersistenceScopesEXT",

        XrInstance("instance"),
        XrSystemId("systemId"),
        AutoSize("persistenceScopes")..uint32_t("persistenceScopeCapacityInput"),
        Check(1)..uint32_t.p("persistenceScopeCountOutput"),
        nullable..XrSpatialPersistenceScopeEXT.p("persistenceScopes")
    )

    XrResult(
        "CreateSpatialPersistenceContextAsyncEXT",

        XrSession("session"),
        XrSpatialPersistenceContextCreateInfoEXT.const.p("createInfo"),
        Check(1)..XrFutureEXT.p("future")
    )

    XrResult(
        "CreateSpatialPersistenceContextCompleteEXT",

        XrSession("session"),
        XrFutureEXT("future"),
        XrCreateSpatialPersistenceContextCompletionEXT.p("completion")
    )

    XrResult(
        "DestroySpatialPersistenceContextEXT",

        XrSpatialPersistenceContextEXT("persistenceContext")
    )
}