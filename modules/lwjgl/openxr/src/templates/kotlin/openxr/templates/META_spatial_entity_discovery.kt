/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package openxr.templates

import org.lwjgl.generator.*
import openxr.*

val META_spatial_entity_discovery = "METASpatialEntityDiscovery".nativeClassXR("META_spatial_entity_discovery", type = "instance", postfix = "META") {
    IntConstant(
        "META_spatial_entity_discovery_SPEC_VERSION".."1"
    )

    StringConstant(
        "META_SPATIAL_ENTITY_DISCOVERY_EXTENSION_NAME".."XR_META_spatial_entity_discovery"
    )

    EnumConstant(
        "TYPE_SYSTEM_SPACE_DISCOVERY_PROPERTIES_META".."1000247000",
        "TYPE_SPACE_DISCOVERY_INFO_META".."1000247001",
        "TYPE_SPACE_FILTER_UUID_META".."1000247003",
        "TYPE_SPACE_FILTER_COMPONENT_META".."1000247004",
        "TYPE_SPACE_DISCOVERY_RESULT_META".."1000247005",
        "TYPE_SPACE_DISCOVERY_RESULTS_META".."1000247006",
        "TYPE_EVENT_DATA_SPACE_DISCOVERY_RESULTS_AVAILABLE_META".."1000247007",
        "TYPE_EVENT_DATA_SPACE_DISCOVERY_COMPLETE_META".."1000247008"
    )

    XrResult(
        "DiscoverSpacesMETA",

        XrSession("session"),
        XrSpaceDiscoveryInfoMETA.const.p("info"),
        Check(1)..XrAsyncRequestIdFB.p("requestId")
    )

    XrResult(
        "RetrieveSpaceDiscoveryResultsMETA",

        XrSession("session"),
        XrAsyncRequestIdFB("requestId"),
        XrSpaceDiscoveryResultsMETA.p("results")
    )
}