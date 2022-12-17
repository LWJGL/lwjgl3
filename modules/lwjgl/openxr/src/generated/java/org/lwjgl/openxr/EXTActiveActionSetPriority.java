/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.openxr;

/**
 * The <a href="https://registry.khronos.org/OpenXR/specs/1.0/html/xrspec.html#XR_EXT_active_action_set_priority">XR_EXT_active_action_set_priority</a> extension.
 * 
 * <p>The properties of an {@code XrActionSet} become immutable after it has been attached to a session. This currently includes the priority of the action set preventing the application from changing the priority number for the duration of the session.</p>
 * 
 * <p>Given that most runtimes do not actually require this number to be immutable this extension adds the ability to provide a different priority number for every {@link XrActiveActionSet} provided to {@link XR10#xrSyncActions SyncActions}.</p>
 * 
 * <p>When updating the action state with {@link XR10#xrSyncActions SyncActions}, the application <b>can</b> provide a pointer to an {@link XrActiveActionSetPrioritiesEXT} structure in the {@code next} chain of {@link XrActionsSyncInfo}. This structure contains an array of {@link XrActiveActionSetPriorityEXT} structures mapping active action sets to their priority numbers.</p>
 */
public final class EXTActiveActionSetPriority {

    /** The extension specification version. */
    public static final int XR_EXT_active_action_set_priority_SPEC_VERSION = 1;

    /** The extension name. */
    public static final String XR_EXT_ACTIVE_ACTION_SET_PRIORITY_EXTENSION_NAME = "XR_EXT_active_action_set_priority";

    /** Extends {@code XrStructureType}. */
    public static final int XR_TYPE_ACTIVE_ACTION_SET_PRIORITIES_EXT = 1000373000;

    private EXTActiveActionSetPriority() {}

}