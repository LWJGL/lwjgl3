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

public class OCULUSAudioDeviceGuid {

    public static final int XR_OCULUS_audio_device_guid_SPEC_VERSION = 1;

    public static final String XR_OCULUS_AUDIO_DEVICE_GUID_EXTENSION_NAME = "XR_OCULUS_audio_device_guid";

    public static final int XR_MAX_AUDIO_DEVICE_STR_SIZE_OCULUS = 128;

    protected OCULUSAudioDeviceGuid() {
        throw new UnsupportedOperationException();
    }

    // --- [ xrGetAudioOutputDeviceGuidOculus ] ---

    /** {@code XrResult xrGetAudioOutputDeviceGuidOculus(XrInstance instance, wchar_t * buffer)} */
    public static int nxrGetAudioOutputDeviceGuidOculus(XrInstance instance, long buffer) {
        long __functionAddress = instance.getCapabilities().xrGetAudioOutputDeviceGuidOculus;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPPI(instance.address(), buffer, __functionAddress);
    }

    /** {@code XrResult xrGetAudioOutputDeviceGuidOculus(XrInstance instance, wchar_t * buffer)} */
    @NativeType("XrResult")
    public static int xrGetAudioOutputDeviceGuidOculus(XrInstance instance, @NativeType("wchar_t *") ByteBuffer buffer) {
        if (CHECKS) {
            check(buffer, XR_MAX_AUDIO_DEVICE_STR_SIZE_OCULUS);
        }
        return nxrGetAudioOutputDeviceGuidOculus(instance, memAddress(buffer));
    }

    // --- [ xrGetAudioInputDeviceGuidOculus ] ---

    /** {@code XrResult xrGetAudioInputDeviceGuidOculus(XrInstance instance, wchar_t * buffer)} */
    public static int nxrGetAudioInputDeviceGuidOculus(XrInstance instance, long buffer) {
        long __functionAddress = instance.getCapabilities().xrGetAudioInputDeviceGuidOculus;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPPI(instance.address(), buffer, __functionAddress);
    }

    /** {@code XrResult xrGetAudioInputDeviceGuidOculus(XrInstance instance, wchar_t * buffer)} */
    @NativeType("XrResult")
    public static int xrGetAudioInputDeviceGuidOculus(XrInstance instance, @NativeType("wchar_t *") ByteBuffer buffer) {
        if (CHECKS) {
            check(buffer, XR_MAX_AUDIO_DEVICE_STR_SIZE_OCULUS);
        }
        return nxrGetAudioInputDeviceGuidOculus(instance, memAddress(buffer));
    }

}