/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.openxr;

/**
 * The <a href="https://registry.khronos.org/OpenXR/specs/1.1/html/xrspec.html#XR_META_spatial_entity_group_sharing">XR_META_spatial_entity_group_sharing</a> extension.
 * 
 * <p>The {@link METASpatialEntityGroupSharing XR_META_spatial_entity_group_sharing} extension enables applications to share spatial entities to an application-specified group UUID. An application <b>can</b> share spatial entities with one or more group UUIDs, and query for spatial entities previously shared with a group UUID. A Group UUID is any application provided UUID. The Group will be established for the application simply by sharing spatial entities to it.</p>
 */
public final class METASpatialEntityGroupSharing {

    /** The extension specification version. */
    public static final int XR_META_spatial_entity_group_sharing_SPEC_VERSION = 1;

    /** The extension name. */
    public static final String XR_META_SPATIAL_ENTITY_GROUP_SHARING_EXTENSION_NAME = "XR_META_spatial_entity_group_sharing";

    /** Extends {@code XrResult}. */
    public static final int XR_ERROR_SPACE_GROUP_NOT_FOUND_META = -1000572002;

    /**
     * Extends {@code XrStructureType}.
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #XR_TYPE_SHARE_SPACES_RECIPIENT_GROUPS_META TYPE_SHARE_SPACES_RECIPIENT_GROUPS_META}</li>
     * <li>{@link #XR_TYPE_SPACE_GROUP_UUID_FILTER_INFO_META TYPE_SPACE_GROUP_UUID_FILTER_INFO_META}</li>
     * <li>{@link #XR_TYPE_SYSTEM_SPATIAL_ENTITY_GROUP_SHARING_PROPERTIES_META TYPE_SYSTEM_SPATIAL_ENTITY_GROUP_SHARING_PROPERTIES_META}</li>
     * </ul>
     */
    public static final int
        XR_TYPE_SHARE_SPACES_RECIPIENT_GROUPS_META                  = 1000572000,
        XR_TYPE_SPACE_GROUP_UUID_FILTER_INFO_META                   = 1000572001,
        XR_TYPE_SYSTEM_SPATIAL_ENTITY_GROUP_SHARING_PROPERTIES_META = 1000572100;

    private METASpatialEntityGroupSharing() {}

}