/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.openxr;

import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.JNI.*;

public class ALMALENCEDigitalLensControl {

    public static final int XR_ALMALENCE_digital_lens_control_SPEC_VERSION = 1;

    public static final String XR_ALMALENCE_DIGITAL_LENS_CONTROL_EXTENSION_NAME = "XR_ALMALENCE_digital_lens_control";

    public static final int XR_TYPE_DIGITAL_LENS_CONTROL_ALMALENCE = 1000196000;

    public static final int XR_DIGITAL_LENS_CONTROL_PROCESSING_DISABLE_BIT_ALMALENCE = 0x1;

    protected ALMALENCEDigitalLensControl() {
        throw new UnsupportedOperationException();
    }

    // --- [ xrSetDigitalLensControlALMALENCE ] ---

    /** {@code XrResult xrSetDigitalLensControlALMALENCE(XrSession session, XrDigitalLensControlALMALENCE const * digitalLensControl)} */
    public static int nxrSetDigitalLensControlALMALENCE(XrSession session, long digitalLensControl) {
        long __functionAddress = session.getCapabilities().xrSetDigitalLensControlALMALENCE;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPPI(session.address(), digitalLensControl, __functionAddress);
    }

    /** {@code XrResult xrSetDigitalLensControlALMALENCE(XrSession session, XrDigitalLensControlALMALENCE const * digitalLensControl)} */
    @NativeType("XrResult")
    public static int xrSetDigitalLensControlALMALENCE(XrSession session, @NativeType("XrDigitalLensControlALMALENCE const *") XrDigitalLensControlALMALENCE digitalLensControl) {
        return nxrSetDigitalLensControlALMALENCE(session, digitalLensControl.address());
    }

}