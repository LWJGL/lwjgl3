/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.openxr;

import java.nio.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.JNI.*;
import static org.lwjgl.system.MemoryUtil.*;

/** The OCULUS_audio_device_guid extension. */
public class OCULUSAudioDeviceGuid {

    /** The extension specification version. */
    public static final int XR_OCULUS_audio_device_guid_SPEC_VERSION = 1;

    /** The extension name. */
    public static final String XR_OCULUS_AUDIO_DEVICE_GUID_EXTENSION_NAME = "XR_OCULUS_audio_device_guid";

    /** XR_MAX_AUDIO_DEVICE_STR_SIZE_OCULUS */
    public static final int XR_MAX_AUDIO_DEVICE_STR_SIZE_OCULUS = 128;

    protected OCULUSAudioDeviceGuid() {
        throw new UnsupportedOperationException();
    }

    // --- [ xrGetAudioOutputDeviceGuidOculus ] ---

    /** Unsafe version of: {@link #xrGetAudioOutputDeviceGuidOculus GetAudioOutputDeviceGuidOculus} */
    public static int nxrGetAudioOutputDeviceGuidOculus(XrInstance instance, long buffer) {
        long __functionAddress = instance.getCapabilities().xrGetAudioOutputDeviceGuidOculus;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPPI(instance.address(), buffer, __functionAddress);
    }

    /**
     * Query the GUID for the active audio output device.
     * 
     * <h5>C Specification</h5>
     * 
     * <pre><code>
     * XrResult xrGetAudioOutputDeviceGuidOculus(
     *     XrInstance                                  instance,
     *     wchar_t                                     buffer[XR_MAX_AUDIO_DEVICE_STR_SIZE_OCULUS]);</code></pre>
     * 
     * <h5>Valid Usage (Implicit)</h5>
     * 
     * <ul>
     * <li>The {@link OCULUSAudioDeviceGuid XR_OCULUS_audio_device_guid} extension <b>must</b> be enabled prior to calling {@link #xrGetAudioOutputDeviceGuidOculus GetAudioOutputDeviceGuidOculus}</li>
     * <li>{@code instance} <b>must</b> be a valid {@code XrInstance} handle</li>
     * <li>{@code buffer} <b>must</b> be a wide character array of length {@link #XR_MAX_AUDIO_DEVICE_STR_SIZE_OCULUS MAX_AUDIO_DEVICE_STR_SIZE_OCULUS}</li>
     * </ul>
     * 
     * <h5>Return Codes</h5>
     * 
     * <dl>
     * <dt>On success, this command returns</dt>
     * <dd><ul>
     * <li>{@link XR10#XR_SUCCESS SUCCESS}</li>
     * </ul></dd>
     * <dt>On failure, this command returns</dt>
     * <dd><ul>
     * <li>{@link XR10#XR_ERROR_FUNCTION_UNSUPPORTED ERROR_FUNCTION_UNSUPPORTED}</li>
     * <li>{@link XR10#XR_ERROR_VALIDATION_FAILURE ERROR_VALIDATION_FAILURE}</li>
     * <li>{@link XR10#XR_ERROR_RUNTIME_FAILURE ERROR_RUNTIME_FAILURE}</li>
     * <li>{@link XR10#XR_ERROR_HANDLE_INVALID ERROR_HANDLE_INVALID}</li>
     * <li>{@link XR10#XR_ERROR_INSTANCE_LOST ERROR_INSTANCE_LOST}</li>
     * <li>{@link XR10#XR_ERROR_FEATURE_UNSUPPORTED ERROR_FEATURE_UNSUPPORTED}</li>
     * </ul></dd>
     * </dl>
     * 
     * <h5>See Also</h5>
     * 
     * <p>{@link #xrGetAudioInputDeviceGuidOculus GetAudioInputDeviceGuidOculus}</p>
     *
     * @param instance the {@code XrInstance} to query the audio device state in.
     * @param buffer   a fixed size buffer which will contain the audio device GUID. The format of this data matches the <a target="_blank" href="https://docs.microsoft.com/en-us/windows/win32/api/mmdeviceapi/nf-mmdeviceapi-immdevice-getid">IMMDevice::GetId</a> API.
     */
    @NativeType("XrResult")
    public static int xrGetAudioOutputDeviceGuidOculus(XrInstance instance, @NativeType("wchar_t *") ByteBuffer buffer) {
        if (CHECKS) {
            check(buffer, XR_MAX_AUDIO_DEVICE_STR_SIZE_OCULUS);
        }
        return nxrGetAudioOutputDeviceGuidOculus(instance, memAddress(buffer));
    }

    // --- [ xrGetAudioInputDeviceGuidOculus ] ---

    /** Unsafe version of: {@link #xrGetAudioInputDeviceGuidOculus GetAudioInputDeviceGuidOculus} */
    public static int nxrGetAudioInputDeviceGuidOculus(XrInstance instance, long buffer) {
        long __functionAddress = instance.getCapabilities().xrGetAudioInputDeviceGuidOculus;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPPI(instance.address(), buffer, __functionAddress);
    }

    /**
     * Query the GUID for the active audio input device.
     * 
     * <h5>C Specification</h5>
     * 
     * <pre><code>
     * XrResult xrGetAudioInputDeviceGuidOculus(
     *     XrInstance                                  instance,
     *     wchar_t                                     buffer[XR_MAX_AUDIO_DEVICE_STR_SIZE_OCULUS]);</code></pre>
     * 
     * <h5>Valid Usage (Implicit)</h5>
     * 
     * <ul>
     * <li>The {@link OCULUSAudioDeviceGuid XR_OCULUS_audio_device_guid} extension <b>must</b> be enabled prior to calling {@link #xrGetAudioInputDeviceGuidOculus GetAudioInputDeviceGuidOculus}</li>
     * <li>{@code instance} <b>must</b> be a valid {@code XrInstance} handle</li>
     * <li>{@code buffer} <b>must</b> be a wide character array of length {@link #XR_MAX_AUDIO_DEVICE_STR_SIZE_OCULUS MAX_AUDIO_DEVICE_STR_SIZE_OCULUS}</li>
     * </ul>
     * 
     * <h5>Return Codes</h5>
     * 
     * <dl>
     * <dt>On success, this command returns</dt>
     * <dd><ul>
     * <li>{@link XR10#XR_SUCCESS SUCCESS}</li>
     * </ul></dd>
     * <dt>On failure, this command returns</dt>
     * <dd><ul>
     * <li>{@link XR10#XR_ERROR_FUNCTION_UNSUPPORTED ERROR_FUNCTION_UNSUPPORTED}</li>
     * <li>{@link XR10#XR_ERROR_VALIDATION_FAILURE ERROR_VALIDATION_FAILURE}</li>
     * <li>{@link XR10#XR_ERROR_RUNTIME_FAILURE ERROR_RUNTIME_FAILURE}</li>
     * <li>{@link XR10#XR_ERROR_HANDLE_INVALID ERROR_HANDLE_INVALID}</li>
     * <li>{@link XR10#XR_ERROR_INSTANCE_LOST ERROR_INSTANCE_LOST}</li>
     * <li>{@link XR10#XR_ERROR_FEATURE_UNSUPPORTED ERROR_FEATURE_UNSUPPORTED}</li>
     * </ul></dd>
     * </dl>
     * 
     * <h5>See Also</h5>
     * 
     * <p>{@link #xrGetAudioOutputDeviceGuidOculus GetAudioOutputDeviceGuidOculus}</p>
     *
     * @param instance the {@code XrInstance} to query the audio device state in.
     * @param buffer   a fixed size buffer which will contain the audio device GUID. The format of this data matches the <a target="_blank" href="https://docs.microsoft.com/en-us/windows/win32/api/mmdeviceapi/nf-mmdeviceapi-immdevice-getid">IMMDevice::GetId</a> API.
     */
    @NativeType("XrResult")
    public static int xrGetAudioInputDeviceGuidOculus(XrInstance instance, @NativeType("wchar_t *") ByteBuffer buffer) {
        if (CHECKS) {
            check(buffer, XR_MAX_AUDIO_DEVICE_STR_SIZE_OCULUS);
        }
        return nxrGetAudioInputDeviceGuidOculus(instance, memAddress(buffer));
    }

}