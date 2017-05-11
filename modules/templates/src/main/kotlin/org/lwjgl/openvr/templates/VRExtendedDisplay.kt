/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package org.lwjgl.openvr.templates

import org.lwjgl.generator.*
import org.lwjgl.openvr.*

val VRExtendedDisplay = "VRExtendedDisplay".nativeClass(
    packageName = OPENVR_PACKAGE,
    prefixMethod = "VRExtendedDisplay_",
    library = OPENVR_LIBRARY,
    binding = OPENVR_FNTABLE_BINDING
) {
    documentation =
        """
        """

    void(
        "GetWindowBounds",
        "Size and position that the window needs to be on the VR display.",

        Check(1)..int32_t_p.OUT("pnX", ""),
        Check(1)..int32_t_p.OUT("pnY", ""),
        Check(1)..uint32_t_p.OUT("pnWidth", ""),
        Check(1)..uint32_t_p.OUT("pnHeight", "")
    )

    void(
        "GetEyeOutputViewport",
        "Gets the viewport in the frame buffer to draw the output of the distortion into.",

        EVREye.IN("eEye", ""),
        Check(1)..uint32_t_p.OUT("pnX", ""),
        Check(1)..uint32_t_p.OUT("pnY", ""),
        Check(1)..uint32_t_p.OUT("pnWidth", ""),
        Check(1)..uint32_t_p.OUT("pnHeight", "")
    )

    void(
        "GetDXGIOutputInfo",
        """
        <h3>D3D10/11 Only</h3>

        Returns the adapter index and output index that the user should pass into {@code EnumAdapters} and {@code EnumOutputs} to create the device and swap
        chain in DX10 and DX11. If an error occurs both indices will be set to -1.
        """,

        Check(1)..int32_t_p.OUT("pnAdapterIndex", ""),
        Check(1)..int32_t_p.OUT("pnAdapterOutputIndex", "")
    )
}