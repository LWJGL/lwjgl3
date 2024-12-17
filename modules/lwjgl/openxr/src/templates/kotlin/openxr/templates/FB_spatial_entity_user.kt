/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package openxr.templates

import org.lwjgl.generator.*
import openxr.*

val FB_spatial_entity_user = "FBSpatialEntityUser".nativeClassXR("FB_spatial_entity_user", type = "instance", postfix = "FB") {
    IntConstant(
        "FB_spatial_entity_user_SPEC_VERSION".."1"
    )

    StringConstant(
        "FB_SPATIAL_ENTITY_USER_EXTENSION_NAME".."XR_FB_spatial_entity_user"
    )

    EnumConstant(
        "TYPE_SPACE_USER_CREATE_INFO_FB".."1000241001"
    )

    EnumConstant(
        "OBJECT_TYPE_SPACE_USER_FB".."1000241000"
    )

    XrResult(
        "CreateSpaceUserFB",

        XrSession("session"),
        XrSpaceUserCreateInfoFB.const.p("info"),
        Check(1)..XrSpaceUserFB.p("user")
    )

    XrResult(
        "GetSpaceUserIdFB",

        XrSpaceUserFB("user"),
        Check(1)..XrSpaceUserIdFB.p("userId")
    )

    XrResult(
        "DestroySpaceUserFB",

        XrSpaceUserFB("user")
    )
}