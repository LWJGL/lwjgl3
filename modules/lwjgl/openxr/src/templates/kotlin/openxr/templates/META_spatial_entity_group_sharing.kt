/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package openxr.templates

import org.lwjgl.generator.*
import openxr.*

val META_spatial_entity_group_sharing = "METASpatialEntityGroupSharing".nativeClassXR("META_spatial_entity_group_sharing", type = "instance", postfix = "META") {
    IntConstant(
        "META_spatial_entity_group_sharing_SPEC_VERSION".."1"
    )

    StringConstant(
        "META_SPATIAL_ENTITY_GROUP_SHARING_EXTENSION_NAME".."XR_META_spatial_entity_group_sharing"
    )

    EnumConstant(
        "ERROR_SPACE_GROUP_NOT_FOUND_META".."-1000572002"
    )

    EnumConstant(
        "TYPE_SHARE_SPACES_RECIPIENT_GROUPS_META".."1000572000",
        "TYPE_SPACE_GROUP_UUID_FILTER_INFO_META".."1000572001",
        "TYPE_SYSTEM_SPATIAL_ENTITY_GROUP_SHARING_PROPERTIES_META".."1000572100"
    )
}