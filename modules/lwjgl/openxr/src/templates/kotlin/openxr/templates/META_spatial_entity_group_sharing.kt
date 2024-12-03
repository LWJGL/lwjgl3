/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package openxr.templates

import org.lwjgl.generator.*
import openxr.*

val META_spatial_entity_group_sharing = "METASpatialEntityGroupSharing".nativeClassXR("META_spatial_entity_group_sharing", type = "instance", postfix = "META") {
    documentation =
        """
        The <a href="https://registry.khronos.org/OpenXR/specs/1.1/html/xrspec.html\#XR_META_spatial_entity_group_sharing">XR_META_spatial_entity_group_sharing</a> extension.

        The {@link METASpatialEntityGroupSharing XR_META_spatial_entity_group_sharing} extension enables applications to share spatial entities to an application-specified group UUID. An application <b>can</b> share spatial entities with one or more group UUIDs, and query for spatial entities previously shared with a group UUID. A Group UUID is any application provided UUID. The Group will be established for the application simply by sharing spatial entities to it.
        """

    IntConstant(
        "The extension specification version.",

        "META_spatial_entity_group_sharing_SPEC_VERSION".."1"
    )

    StringConstant(
        "The extension name.",

        "META_SPATIAL_ENTITY_GROUP_SHARING_EXTENSION_NAME".."XR_META_spatial_entity_group_sharing"
    )

    EnumConstant(
        "Extends {@code XrResult}.",

        "ERROR_SPACE_GROUP_NOT_FOUND_META".."-1000572002"
    )

    EnumConstant(
        "Extends {@code XrStructureType}.",

        "TYPE_SHARE_SPACES_RECIPIENT_GROUPS_META".."1000572000",
        "TYPE_SPACE_GROUP_UUID_FILTER_INFO_META".."1000572001",
        "TYPE_SYSTEM_SPATIAL_ENTITY_GROUP_SHARING_PROPERTIES_META".."1000572100"
    )
}