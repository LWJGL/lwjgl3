/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package openxr.templates

import org.lwjgl.generator.*
import openxr.*

val OCULUS_audio_device_guid = "OCULUSAudioDeviceGuid".nativeClassXR("OCULUS_audio_device_guid", type = "instance", postfix = "OCULUS") {
    IntConstant(
        "OCULUS_audio_device_guid_SPEC_VERSION".."1"
    )

    StringConstant(
        "OCULUS_AUDIO_DEVICE_GUID_EXTENSION_NAME".."XR_OCULUS_audio_device_guid"
    )

    EnumConstant(
        "MAX_AUDIO_DEVICE_STR_SIZE_OCULUS".."128"
    )

    XrResult(
        "GetAudioOutputDeviceGuidOculus",

        XrInstance("instance"),
        Check("XR_MAX_AUDIO_DEVICE_STR_SIZE_OCULUS")..wchar_t.p("buffer")
    )

    XrResult(
        "GetAudioInputDeviceGuidOculus",

        XrInstance("instance"),
        Check("XR_MAX_AUDIO_DEVICE_STR_SIZE_OCULUS")..wchar_t.p("buffer")
    )
}