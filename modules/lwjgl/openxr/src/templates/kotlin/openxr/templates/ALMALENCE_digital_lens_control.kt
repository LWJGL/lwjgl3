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
        The <a href="https://registry.khronos.org/OpenXR/specs/1.0/html/xrspec.html\#XR_ALMALENCE_digital_lens_control">XR_ALMALENCE_digital_lens_control</a> extension.

        Digital Lens for VR (DLVR) is a computational lens aberration correction technology enabling high resolution, visual clarity and fidelity in VR head mounted displays. The Digital Lens allows to overcome two fundamental factors limiting VR picture quality, size constraints and presence of a moving optical element — the eye pupil.

        Features:

        <ul>
            <li>Complete removal of lateral chromatic aberrations, across the entire FoV, at all gaze directions.</li>
            <li>Correction of longitudinal chromatic aberrations, lens blur and higher order aberrations.</li>
            <li>Increase of visible resolution.</li>
            <li>Enhancement of edge contrast (otherwise degraded due to lens smear).</li>
            <li>Enables high quality at wide FoV.</li>
        </ul>

        For OpenXR runtimes DLVR is implemented as implicit API Layer distributed by Almalence Inc. as installable package. DLVR utilize eye tracking data (eye pupil coordinates and gaze direction) to produce corrections of render frames. As long as current core OpenXR API doesn’t expose an eye tracking data, DLVR API Layer relies on 3rd-party eye tracking runtimes.

        List of supported eye tracking devices:

        <ul>
            <li><em>Tobii_VR4_CARBON_P1</em> (HP Reverb G2 Omnicept Edition)</li>
            <li><em>Tobii_VR4_U2_P2</em> (HTC Vive Pro Eye)</li>
        </ul>

        This extension enables the handling of the Digital Lens for VR API Layer by calling #SetDigitalLensControlALMALENCE().
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
        """
        XrDigitalLensControlFlagBitsALMALENCE - XrDigitalLensControlFlagBitsALMALENCE

        <h5>Flag Descriptions</h5>
        <ul>
            <li>#DIGITAL_LENS_CONTROL_PROCESSING_DISABLE_BIT_ALMALENCE — disables Digital Lens processing of render textures</li>
        </ul>
        """,

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