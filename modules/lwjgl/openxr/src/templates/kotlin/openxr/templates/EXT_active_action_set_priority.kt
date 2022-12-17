/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package openxr.templates

import org.lwjgl.generator.*
import openxr.*

val EXT_active_action_set_priority = "EXTActiveActionSetPriority".nativeClassXR("EXT_active_action_set_priority", type = "instance", postfix = "EXT") {
    documentation =
        """
        The <a href="https://registry.khronos.org/OpenXR/specs/1.0/html/xrspec.html\#XR_EXT_active_action_set_priority">XR_EXT_active_action_set_priority</a> extension.

        The properties of an {@code XrActionSet} become immutable after it has been attached to a session. This currently includes the priority of the action set preventing the application from changing the priority number for the duration of the session.

        Given that most runtimes do not actually require this number to be immutable this extension adds the ability to provide a different priority number for every ##XrActiveActionSet provided to #SyncActions().

        When updating the action state with #SyncActions(), the application <b>can</b> provide a pointer to an ##XrActiveActionSetPrioritiesEXT structure in the {@code next} chain of ##XrActionsSyncInfo. This structure contains an array of ##XrActiveActionSetPriorityEXT structures mapping active action sets to their priority numbers.
        """

    IntConstant(
        "The extension specification version.",

        "EXT_active_action_set_priority_SPEC_VERSION".."1"
    )

    StringConstant(
        "The extension name.",

        "EXT_ACTIVE_ACTION_SET_PRIORITY_EXTENSION_NAME".."XR_EXT_active_action_set_priority"
    )

    EnumConstant(
        "Extends {@code XrStructureType}.",

        "TYPE_ACTIVE_ACTION_SET_PRIORITIES_EXT".."1000373000"
    )
}