/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package openxr.templates

import org.lwjgl.generator.*
import openxr.*

val META_spatial_entity_semantic_label = "METASpatialEntitySemanticLabel".nativeClassXR("META_spatial_entity_semantic_label", type = "instance", postfix = "META") {
    IntConstant(
        "META_spatial_entity_semantic_label_SPEC_VERSION".."1"
    )

    StringConstant(
        "META_SPATIAL_ENTITY_SEMANTIC_LABEL_EXTENSION_NAME".."XR_META_spatial_entity_semantic_label"
    )

    EnumConstant(
        "SEMANTIC_LABEL_UNKNOWN_META".."0",
        "SEMANTIC_LABEL_FLOOR_META".."1",
        "SEMANTIC_LABEL_CEILING_META".."2",
        "SEMANTIC_LABEL_WALL_FACE_META".."3",
        "SEMANTIC_LABEL_INNER_WALL_FACE_META".."4",
        "SEMANTIC_LABEL_INVISIBLE_WALL_FACE_META".."5",
        "SEMANTIC_LABEL_DOOR_FRAME_META".."6",
        "SEMANTIC_LABEL_WINDOW_FRAME_META".."7"
    )
}