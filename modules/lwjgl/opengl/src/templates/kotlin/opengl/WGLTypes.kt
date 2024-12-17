/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package opengl

import org.lwjgl.generator.*
import core.windows.*

val HPBUFFERARB = "HPBUFFERARB".handle

// WGL_NV_gpu_affinity
val HGPUNV = "HGPUNV".handle

val GPU_DEVICE = struct(Module.OPENGL, "GPU_DEVICE", nativeSubPath = "wgl", mutable = false) {
    javaImport("org.lwjgl.system.windows.*")

    DWORD("cb")
    CHAR("DeviceName")[32]
    CHAR("DeviceString")[128]
    DWORD("Flags")
    RECT("rcVirtualScreen")
}
val PGPU_DEVICE = typedef(GPU_DEVICE.p, "PGPU_DEVICE")