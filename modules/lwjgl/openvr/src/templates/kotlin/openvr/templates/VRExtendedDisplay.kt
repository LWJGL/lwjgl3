/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package openvr.templates

import org.lwjgl.generator.*
import openvr.*

val VRExtendedDisplay = "VRExtendedDisplay".nativeClass(
    Module.OPENVR,
    prefixMethod = "VRExtendedDisplay_",
    binding = OPENVR_FNTABLE_BINDING
) {
    documentation =
        """
        """

    void(
        "GetWindowBounds",
        "Size and position that the window needs to be on the VR display.",

        Check(1)..int32_t.p("pnX", ""),
        Check(1)..int32_t.p("pnY", ""),
        Check(1)..uint32_t.p("pnWidth", ""),
        Check(1)..uint32_t.p("pnHeight", "")
    )

    void(
        "GetEyeOutputViewport",
        "Gets the viewport in the frame buffer to draw the output of the distortion into.",

        EVREye("eEye", ""),
        Check(1)..uint32_t.p("pnX", ""),
        Check(1)..uint32_t.p("pnY", ""),
        Check(1)..uint32_t.p("pnWidth", ""),
        Check(1)..uint32_t.p("pnHeight", "")
    )

    void(
        "GetDXGIOutputInfo",
        """
        <h3>D3D10/11 Only</h3>

        Returns the adapter index and output index that the user should pass into {@code EnumAdapters} and {@code EnumOutputs} to create the device and swap
        chain in DX10 and DX11. If an error occurs both indices will be set to -1.
        """,

        Check(1)..int32_t.p("pnAdapterIndex", ""),
        Check(1)..int32_t.p("pnAdapterOutputIndex", "")
    )
}