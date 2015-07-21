/* 
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 */
package org.lwjgl.opengl

import org.lwjgl.generator.*
import org.lwjgl.system.windows.*

val HPBUFFERARB = "HPBUFFERARB".opaque_p

// WGL_NV_gpu_affinity
val HGPUNV = "HGPUNV".opaque_p
val HGPUNV_p = HGPUNV.p
val PGPU_DEVICE = StructType(
	name = "PGPU_DEVICE",
	includesPointer = true,
	definition = struct(OPENGL_PACKAGE, "GPU_DEVICE", "wgl") {
		documentation =
			"""
			Receives information about the display device specified by the {@code deviceIndex} parameter of the WGLNVGPUAffinity##wglEnumGpuDevicesNV()
			function.
			"""
		javaImport("org.lwjgl.system.windows.*")
		nativeImport("WindowsLWJGL.h", "WGL.h")
		DWORD.member("cb")
		TCHAR.member(nativeName = "DeviceName", size = 32, nullTerminated = true)
		TCHAR.member(nativeName = "DeviceString", size = 128, nullTerminated = true)
		DWORD.member("Flags")
		RECT.member(nativeName = "rcVirtualScreen", name = "virtualScreen");
	}
)