/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package openxr.templates

import org.lwjgl.generator.*
import openxr.*

val ALMALENCE_digital_lens_control = "ALMALENCEDigitalLensControl".nativeClassXR("ALMALENCE_digital_lens_control", type = "instance", postfix = "ALMALENCE") {
    documentation =
        """
        The $templateName extension.
        """

    IntConstant(
        "The extension specification version.",

        "ALMALENCE_digital_lens_control_SPEC_VERSION".."1"
    )

    StringConstant(
        "The extension name.",

        "ALMALENCE_DIGITAL_LENS_CONTROL_EXTENSION_NAME".."XR_ALMALENCE_digital_lens_control"
    )

    EnumConstant(
        "Extends {@code XrStructureType}.",

        "TYPE_DIGITAL_LENS_CONTROL_ALMALENCE".."1000196000"
    )

    EnumConstant(
        "XrDigitalLensControlFlagBitsALMALENCE",

        "DIGITAL_LENS_CONTROL_PROCESSING_DISABLE_BIT_ALMALENCE".enum(0x00000001)
    )

    XrResult(
        "SetDigitalLensControlALMALENCE",
        """
        Sets DLVR status.

        <h5>C Specification</h5>
        The #SetDigitalLensControlALMALENCE() function is defined as:

        <pre><code>
￿XrResult xrSetDigitalLensControlALMALENCE(
￿    XrSession                                   session,
￿    const XrDigitalLensControlALMALENCE*        digitalLensControl);</code></pre>

        <h5>Description</h5>
        #SetDigitalLensControlALMALENCE() handles state of Digital Lens API Layer

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>The {@link ALMALENCEDigitalLensControl XR_ALMALENCE_digital_lens_control} extension <b>must</b> be enabled prior to calling #SetDigitalLensControlALMALENCE()</li>
            <li>{@code session} <b>must</b> be a valid {@code XrSession} handle</li>
            <li>{@code digitalLensControl} <b>must</b> be a pointer to a valid ##XrDigitalLensControlALMALENCE structure</li>
        </ul>

        <h5>Return Codes</h5>
        <dl>
            <dt>On success, this command returns</dt>
            <dd><ul>
                <li>#SUCCESS</li>
                <li>#SESSION_LOSS_PENDING</li>
            </ul></dd>

            <dt>On failure, this command returns</dt>
            <dd><ul>
                <li>#ERROR_FUNCTION_UNSUPPORTED</li>
                <li>#ERROR_HANDLE_INVALID</li>
                <li>#ERROR_INSTANCE_LOST</li>
                <li>#ERROR_SESSION_LOST</li>
            </ul></dd>
        </dl>

        <h5>See Also</h5>
        ##XrDigitalLensControlALMALENCE
        """,

        XrSession("session", "a handle to a running {@code XrSession}."),
        XrDigitalLensControlALMALENCE.const.p("digitalLensControl", "the ##XrDigitalLensControlALMALENCE that contains desired characteristics for the Digital Lens")
    )
}