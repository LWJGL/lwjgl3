/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package openxr.templates

import org.lwjgl.generator.*
import openxr.*

val META_passthrough_layer_resumed_event = "METAPassthroughLayerResumedEvent".nativeClassXR("META_passthrough_layer_resumed_event", type = "instance", postfix = "META") {
    IntConstant(
        "META_passthrough_layer_resumed_event_SPEC_VERSION".."1"
    )

    StringConstant(
        "META_PASSTHROUGH_LAYER_RESUMED_EVENT_EXTENSION_NAME".."XR_META_passthrough_layer_resumed_event"
    )

    EnumConstant(
        "TYPE_EVENT_DATA_PASSTHROUGH_LAYER_RESUMED_META".."1000282000"
    )
}