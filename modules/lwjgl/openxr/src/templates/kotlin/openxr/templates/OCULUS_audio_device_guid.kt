/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package openxr.templates

import org.lwjgl.generator.*
import openxr.*

val OCULUS_audio_device_guid = "OCULUSAudioDeviceGuid".nativeClassXR("OCULUS_audio_device_guid", type = "instance", postfix = "OCULUS") {
    documentation =
        """
        The $templateName extension.
        """

    IntConstant(
        "The extension specification version.",

        "OCULUS_audio_device_guid_SPEC_VERSION".."1"
    )

    StringConstant(
        "The extension name.",

        "OCULUS_AUDIO_DEVICE_GUID_EXTENSION_NAME".."XR_OCULUS_audio_device_guid"
    )

    EnumConstant(
        "XR_MAX_AUDIO_DEVICE_STR_SIZE_OCULUS",

        "MAX_AUDIO_DEVICE_STR_SIZE_OCULUS".."128"
    )

    XrResult(
        "GetAudioOutputDeviceGuidOculus",
        """
        Query the GUID for the active audio output device.

        <h5>C Specification</h5>
        <pre><code>
￿XrResult xrGetAudioOutputDeviceGuidOculus(
￿    XrInstance                                  instance,
￿    wchar_t                                     buffer[XR_MAX_AUDIO_DEVICE_STR_SIZE_OCULUS]);</code></pre>

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>The {@link OCULUSAudioDeviceGuid XR_OCULUS_audio_device_guid} extension <b>must</b> be enabled prior to calling #GetAudioOutputDeviceGuidOculus()</li>
            <li>{@code instance} <b>must</b> be a valid {@code XrInstance} handle</li>
            <li>{@code buffer} <b>must</b> be a wide character array of length #MAX_AUDIO_DEVICE_STR_SIZE_OCULUS</li>
        </ul>

        <h5>Return Codes</h5>
        <dl>
            <dt>On success, this command returns</dt>
            <dd><ul>
                <li>#SUCCESS</li>
            </ul></dd>

            <dt>On failure, this command returns</dt>
            <dd><ul>
                <li>#ERROR_FUNCTION_UNSUPPORTED</li>
                <li>#ERROR_VALIDATION_FAILURE</li>
                <li>#ERROR_RUNTIME_FAILURE</li>
                <li>#ERROR_HANDLE_INVALID</li>
                <li>#ERROR_INSTANCE_LOST</li>
                <li>#ERROR_FEATURE_UNSUPPORTED</li>
            </ul></dd>
        </dl>

        <h5>See Also</h5>
        #GetAudioInputDeviceGuidOculus()
        """,

        XrInstance("instance", "the {@code XrInstance} to query the audio device state in."),
        Check("XR_MAX_AUDIO_DEVICE_STR_SIZE_OCULUS")..wchar_t.p("buffer", "a fixed size buffer which will contain the audio device GUID. The format of this data matches the <a target=\"_blank\" href=\"https://docs.microsoft.com/en-us/windows/win32/api/mmdeviceapi/nf-mmdeviceapi-immdevice-getid\">IMMDevice::GetId</a> API.")
    )

    XrResult(
        "GetAudioInputDeviceGuidOculus",
        """
        Query the GUID for the active audio input device.

        <h5>C Specification</h5>
        <pre><code>
￿XrResult xrGetAudioInputDeviceGuidOculus(
￿    XrInstance                                  instance,
￿    wchar_t                                     buffer[XR_MAX_AUDIO_DEVICE_STR_SIZE_OCULUS]);</code></pre>

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>The {@link OCULUSAudioDeviceGuid XR_OCULUS_audio_device_guid} extension <b>must</b> be enabled prior to calling #GetAudioInputDeviceGuidOculus()</li>
            <li>{@code instance} <b>must</b> be a valid {@code XrInstance} handle</li>
            <li>{@code buffer} <b>must</b> be a wide character array of length #MAX_AUDIO_DEVICE_STR_SIZE_OCULUS</li>
        </ul>

        <h5>Return Codes</h5>
        <dl>
            <dt>On success, this command returns</dt>
            <dd><ul>
                <li>#SUCCESS</li>
            </ul></dd>

            <dt>On failure, this command returns</dt>
            <dd><ul>
                <li>#ERROR_FUNCTION_UNSUPPORTED</li>
                <li>#ERROR_VALIDATION_FAILURE</li>
                <li>#ERROR_RUNTIME_FAILURE</li>
                <li>#ERROR_HANDLE_INVALID</li>
                <li>#ERROR_INSTANCE_LOST</li>
                <li>#ERROR_FEATURE_UNSUPPORTED</li>
            </ul></dd>
        </dl>

        <h5>See Also</h5>
        #GetAudioOutputDeviceGuidOculus()
        """,

        XrInstance("instance", "the {@code XrInstance} to query the audio device state in."),
        Check("XR_MAX_AUDIO_DEVICE_STR_SIZE_OCULUS")..wchar_t.p("buffer", "a fixed size buffer which will contain the audio device GUID. The format of this data matches the <a target=\"_blank\" href=\"https://docs.microsoft.com/en-us/windows/win32/api/mmdeviceapi/nf-mmdeviceapi-immdevice-getid\">IMMDevice::GetId</a> API.")
    )
}