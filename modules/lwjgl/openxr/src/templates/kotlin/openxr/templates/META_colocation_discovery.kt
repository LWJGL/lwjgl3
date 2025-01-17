/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package openxr.templates

import org.lwjgl.generator.*
import openxr.*

val META_colocation_discovery = "METAColocationDiscovery".nativeClassXR("META_colocation_discovery", type = "instance", postfix = "META") {
    IntConstant(
        "META_colocation_discovery_SPEC_VERSION".."1"
    )

    StringConstant(
        "META_COLOCATION_DISCOVERY_EXTENSION_NAME".."XR_META_colocation_discovery"
    )

    EnumConstant(
        "MAX_COLOCATION_DISCOVERY_BUFFER_SIZE_META".."1024"
    )

    EnumConstant(
        "COLOCATION_DISCOVERY_ALREADY_ADVERTISING_META".."1000571003",
        "COLOCATION_DISCOVERY_ALREADY_DISCOVERING_META".."1000571004",
        "ERROR_COLOCATION_DISCOVERY_NETWORK_FAILED_META".."-1000571001",
        "ERROR_COLOCATION_DISCOVERY_NO_DISCOVERY_METHOD_META".."-1000571002"
    )

    EnumConstant(
        "TYPE_COLOCATION_DISCOVERY_START_INFO_META".."1000571010",
        "TYPE_COLOCATION_DISCOVERY_STOP_INFO_META".."1000571011",
        "TYPE_COLOCATION_ADVERTISEMENT_START_INFO_META".."1000571012",
        "TYPE_COLOCATION_ADVERTISEMENT_STOP_INFO_META".."1000571013",
        "TYPE_EVENT_DATA_START_COLOCATION_ADVERTISEMENT_COMPLETE_META".."1000571020",
        "TYPE_EVENT_DATA_STOP_COLOCATION_ADVERTISEMENT_COMPLETE_META".."1000571021",
        "TYPE_EVENT_DATA_COLOCATION_ADVERTISEMENT_COMPLETE_META".."1000571022",
        "TYPE_EVENT_DATA_START_COLOCATION_DISCOVERY_COMPLETE_META".."1000571023",
        "TYPE_EVENT_DATA_COLOCATION_DISCOVERY_RESULT_META".."1000571024",
        "TYPE_EVENT_DATA_COLOCATION_DISCOVERY_COMPLETE_META".."1000571025",
        "TYPE_EVENT_DATA_STOP_COLOCATION_DISCOVERY_COMPLETE_META".."1000571026",
        "TYPE_SYSTEM_COLOCATION_DISCOVERY_PROPERTIES_META".."1000571030"
    )

    XrResult(
        "StartColocationDiscoveryMETA",

        XrSession("session"),
        XrColocationDiscoveryStartInfoMETA.const.p("info"),
        Check(1)..XrAsyncRequestIdFB.p("discoveryRequestId")
    )

    XrResult(
        "StopColocationDiscoveryMETA",

        XrSession("session"),
        XrColocationDiscoveryStopInfoMETA.const.p("info"),
        Check(1)..XrAsyncRequestIdFB.p("requestId")
    )

    XrResult(
        "StartColocationAdvertisementMETA",

        XrSession("session"),
        XrColocationAdvertisementStartInfoMETA.const.p("info"),
        Check(1)..XrAsyncRequestIdFB.p("advertisementRequestId")
    )

    XrResult(
        "StopColocationAdvertisementMETA",

        XrSession("session"),
        XrColocationAdvertisementStopInfoMETA.const.p("info"),
        Check(1)..XrAsyncRequestIdFB.p("requestId")
    )
}