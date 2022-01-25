/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.openxr;

import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.JNI.*;

/** The ALMALENCE_digital_lens_control extension. */
public class ALMALENCEDigitalLensControl {

    /** The extension specification version. */
    public static final int XR_ALMALENCE_digital_lens_control_SPEC_VERSION = 1;

    /** The extension name. */
    public static final String XR_ALMALENCE_DIGITAL_LENS_CONTROL_EXTENSION_NAME = "XR_ALMALENCE_digital_lens_control";

    /** Extends {@code XrStructureType}. */
    public static final int XR_TYPE_DIGITAL_LENS_CONTROL_ALMALENCE = 1000196000;

    /** XrDigitalLensControlFlagBitsALMALENCE */
    public static final int XR_DIGITAL_LENS_CONTROL_PROCESSING_DISABLE_BIT_ALMALENCE = 0x1;

    protected ALMALENCEDigitalLensControl() {
        throw new UnsupportedOperationException();
    }

    // --- [ xrSetDigitalLensControlALMALENCE ] ---

    /** Unsafe version of: {@link #xrSetDigitalLensControlALMALENCE SetDigitalLensControlALMALENCE} */
    public static int nxrSetDigitalLensControlALMALENCE(XrSession session, long digitalLensControl) {
        long __functionAddress = session.getCapabilities().xrSetDigitalLensControlALMALENCE;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPPI(session.address(), digitalLensControl, __functionAddress);
    }

    /**
     * Sets DLVR status.
     * 
     * <h5>C Specification</h5>
     * 
     * <p>The {@link #xrSetDigitalLensControlALMALENCE SetDigitalLensControlALMALENCE} function is defined as:</p>
     * 
     * <pre><code>
     * XrResult xrSetDigitalLensControlALMALENCE(
     *     XrSession                                   session,
     *     const XrDigitalLensControlALMALENCE*        digitalLensControl);</code></pre>
     * 
     * <h5>Description</h5>
     * 
     * <p>{@link #xrSetDigitalLensControlALMALENCE SetDigitalLensControlALMALENCE} handles state of Digital Lens API Layer</p>
     * 
     * <h5>Valid Usage (Implicit)</h5>
     * 
     * <ul>
     * <li>The {@link ALMALENCEDigitalLensControl XR_ALMALENCE_digital_lens_control} extension <b>must</b> be enabled prior to calling {@link #xrSetDigitalLensControlALMALENCE SetDigitalLensControlALMALENCE}</li>
     * <li>{@code session} <b>must</b> be a valid {@code XrSession} handle</li>
     * <li>{@code digitalLensControl} <b>must</b> be a pointer to a valid {@link XrDigitalLensControlALMALENCE} structure</li>
     * </ul>
     * 
     * <h5>Return Codes</h5>
     * 
     * <dl>
     * <dt>On success, this command returns</dt>
     * <dd><ul>
     * <li>{@link XR10#XR_SUCCESS SUCCESS}</li>
     * <li>{@link XR10#XR_SESSION_LOSS_PENDING SESSION_LOSS_PENDING}</li>
     * </ul></dd>
     * <dt>On failure, this command returns</dt>
     * <dd><ul>
     * <li>{@link XR10#XR_ERROR_FUNCTION_UNSUPPORTED ERROR_FUNCTION_UNSUPPORTED}</li>
     * <li>{@link XR10#XR_ERROR_HANDLE_INVALID ERROR_HANDLE_INVALID}</li>
     * <li>{@link XR10#XR_ERROR_INSTANCE_LOST ERROR_INSTANCE_LOST}</li>
     * <li>{@link XR10#XR_ERROR_SESSION_LOST ERROR_SESSION_LOST}</li>
     * </ul></dd>
     * </dl>
     * 
     * <h5>See Also</h5>
     * 
     * <p>{@link XrDigitalLensControlALMALENCE}</p>
     *
     * @param session            a handle to a running {@code XrSession}.
     * @param digitalLensControl the {@link XrDigitalLensControlALMALENCE} that contains desired characteristics for the Digital Lens
     */
    @NativeType("XrResult")
    public static int xrSetDigitalLensControlALMALENCE(XrSession session, @NativeType("XrDigitalLensControlALMALENCE const *") XrDigitalLensControlALMALENCE digitalLensControl) {
        return nxrSetDigitalLensControlALMALENCE(session, digitalLensControl.address());
    }

}