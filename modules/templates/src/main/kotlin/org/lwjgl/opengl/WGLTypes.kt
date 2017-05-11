/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package org.lwjgl.opengl

import org.lwjgl.generator.*
import org.lwjgl.system.windows.*

val HPBUFFERARB = "HPBUFFERARB".opaque_p

// WGL_NV_gpu_affinity
val HGPUNV = "HGPUNV".opaque_p
val HGPUNV_p = HGPUNV.p
val GPU_DEVICE = struct(OPENGL_PACKAGE, "GPU_DEVICE", nativeSubPath = "wgl", mutable = false) {
    documentation =
        "Receives information about the display device specified by the {@code deviceIndex} parameter of the #EnumGpuDevicesNV() function."
    javaImport("org.lwjgl.system.windows.*")

    DWORD.member(
        "cb",
        """
        the size of the {@code GPU_DEVICE} structure. Before calling #EnumGpuDevicesNV(), set {@code cb} to the size, in bytes, of {@code GPU_DEVICE}.
        """
    )
    CHAR.array(
        "DeviceName",
        """
        a string identifying the display device name. This will be the same string as stored in the {@code DeviceName} field of the {@code DISPLAY_DEVICE}
        structure, which is filled in by {@code EnumDisplayDevices}.
        """,
        size = 32
    )
    CHAR.array(
        "DeviceString",
        """
        a string describing the GPU for this display device. It is the same string as stored in the {@code DeviceString} field in the {@code DISPLAY_DEVICE}
        structure that is filled in by {@code EnumDisplayDevices} when it describes a display adapter (and not a monitor).
        """,
        size = 128
    )
    DWORD.member("Flags", "indicates the state of the display device")
    RECT.member(
        "rcVirtualScreen",
        """
        specifies the display device rectangle, in virtual screen coordinates. The value of {@code rcVirtualScreen} is undefined if the device is not part of
        the desktop, i.e. {@code DISPLAY_DEVICE_ATTACHED_TO_DESKTOP} is not set in the {@code Flags} field.
        """
    )
}
val PGPU_DEVICE = GPU_DEVICE.p("PGPU_DEVICE")