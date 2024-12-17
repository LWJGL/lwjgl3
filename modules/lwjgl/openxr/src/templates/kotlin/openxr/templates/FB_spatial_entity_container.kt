/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package openxr.templates

import org.lwjgl.generator.*
import openxr.*

val FB_spatial_entity_container = "FBSpatialEntityContainer".nativeClassXR("FB_spatial_entity_container", type = "instance", postfix = "FB") {
    IntConstant(
        "FB_spatial_entity_container_SPEC_VERSION".."2"
    )

    StringConstant(
        "FB_SPATIAL_ENTITY_CONTAINER_EXTENSION_NAME".."XR_FB_spatial_entity_container"
    )

    EnumConstant(
        "TYPE_SPACE_CONTAINER_FB".."1000199000"
    )

    XrResult(
        "GetSpaceContainerFB",

        XrSession("session"),
        XrSpace("space"),
        XrSpaceContainerFB.p("spaceContainerOutput")
    )
}