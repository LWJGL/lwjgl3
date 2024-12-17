/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package openxr.templates

import org.lwjgl.generator.*
import openxr.*

val EXT_user_presence = "EXTUserPresence".nativeClassXR("EXT_user_presence", type = "instance", postfix = "EXT") {
    IntConstant(
        "EXT_user_presence_SPEC_VERSION".."1"
    )

    StringConstant(
        "EXT_USER_PRESENCE_EXTENSION_NAME".."XR_EXT_user_presence"
    )

    EnumConstant(
        "TYPE_EVENT_DATA_USER_PRESENCE_CHANGED_EXT".."1000470000",
        "TYPE_SYSTEM_USER_PRESENCE_PROPERTIES_EXT".."1000470001"
    )
}