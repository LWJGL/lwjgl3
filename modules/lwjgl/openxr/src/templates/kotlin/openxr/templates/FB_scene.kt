/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package openxr.templates

import org.lwjgl.generator.*
import openxr.*

val FB_scene = "FBScene".nativeClassXR("FB_scene", type = "instance", postfix = "FB") {
    IntConstant(
        "FB_scene_SPEC_VERSION".."4"
    )

    StringConstant(
        "FB_SCENE_EXTENSION_NAME".."XR_FB_scene"
    )

    EnumConstant(
        "TYPE_SEMANTIC_LABELS_FB".."1000175000",
        "TYPE_ROOM_LAYOUT_FB".."1000175001",
        "TYPE_BOUNDARY_2D_FB".."1000175002",
        "TYPE_SEMANTIC_LABELS_SUPPORT_INFO_FB".."1000175010"
    )

    EnumConstant(
        "SEMANTIC_LABELS_SUPPORT_MULTIPLE_SEMANTIC_LABELS_BIT_FB".enum(0x00000001),
        "SEMANTIC_LABELS_SUPPORT_ACCEPT_DESK_TO_TABLE_MIGRATION_BIT_FB".enum(0x00000002),
        "SEMANTIC_LABELS_SUPPORT_ACCEPT_INVISIBLE_WALL_FACE_BIT_FB".enum(0x00000004)
    )

    XrResult(
        "GetSpaceBoundingBox2DFB",

        XrSession("session"),
        XrSpace("space"),
        XrRect2Df.p("boundingBox2DOutput")
    )

    XrResult(
        "GetSpaceBoundingBox3DFB",

        XrSession("session"),
        XrSpace("space"),
        XrRect3DfFB.p("boundingBox3DOutput")
    )

    XrResult(
        "GetSpaceSemanticLabelsFB",

        XrSession("session"),
        XrSpace("space"),
        XrSemanticLabelsFB.p("semanticLabelsOutput")
    )

    XrResult(
        "GetSpaceBoundary2DFB",

        XrSession("session"),
        XrSpace("space"),
        XrBoundary2DFB.p("boundary2DOutput")
    )

    XrResult(
        "GetSpaceRoomLayoutFB",

        XrSession("session"),
        XrSpace("space"),
        XrRoomLayoutFB.p("roomLayoutOutput")
    )
}