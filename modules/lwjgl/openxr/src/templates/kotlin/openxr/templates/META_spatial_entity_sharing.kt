/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package openxr.templates

import org.lwjgl.generator.*
import openxr.*

val META_spatial_entity_sharing = "METASpatialEntitySharing".nativeClassXR("META_spatial_entity_sharing", type = "instance", postfix = "META") {
    IntConstant(
        "META_spatial_entity_sharing_SPEC_VERSION".."1"
    )

    StringConstant(
        "META_SPATIAL_ENTITY_SHARING_EXTENSION_NAME".."XR_META_spatial_entity_sharing"
    )

    EnumConstant(
        "MAX_SPACES_PER_SHARE_REQUEST_META".."32"
    )

    EnumConstant(
        "TYPE_SYSTEM_SPATIAL_ENTITY_SHARING_PROPERTIES_META".."1000290000",
        "TYPE_SHARE_SPACES_INFO_META".."1000290001",
        "TYPE_EVENT_DATA_SHARE_SPACES_COMPLETE_META".."1000290002"
    )

    XrResult(
        "ShareSpacesMETA",

        XrSession("session"),
        XrShareSpacesInfoMETA.const.p("info"),
        Check(1)..XrAsyncRequestIdFB.p("requestId")
    )
}