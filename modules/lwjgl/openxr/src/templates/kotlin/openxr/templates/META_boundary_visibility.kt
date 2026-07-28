/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package openxr.templates

import org.lwjgl.generator.*
import openxr.*

val META_boundary_visibility = "METABoundaryVisibility".nativeClassXR("META_boundary_visibility", type = "instance", postfix = "META") {
    IntConstant(
        "META_boundary_visibility_SPEC_VERSION".."1"
    )

    StringConstant(
        "META_BOUNDARY_VISIBILITY_EXTENSION_NAME".."XR_META_boundary_visibility"
    )

    EnumConstant(
        "BOUNDARY_VISIBILITY_SUPPRESSION_NOT_ALLOWED_META".."1000528000"
    )

    EnumConstant(
        "TYPE_SYSTEM_BOUNDARY_VISIBILITY_PROPERTIES_META".."1000528000",
        "TYPE_EVENT_DATA_BOUNDARY_VISIBILITY_CHANGED_META".."1000528001"
    )

    EnumConstant(
        "BOUNDARY_VISIBILITY_NOT_SUPPRESSED_META".."1",
        "BOUNDARY_VISIBILITY_SUPPRESSED_META".."2"
    )

    XrResult(
        "RequestBoundaryVisibilityMETA",

        XrSession("session"),
        XrBoundaryVisibilityMETA("boundaryVisibility")
    )
}