/* 
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 */
package org.lwjgl.opengl.templates

import org.lwjgl.generator.*
import org.lwjgl.opengl.*
import org.lwjgl.system.windows.*

val WGL_NV_gpu_affinity = "WGLNVGPUAffinity".nativeClassWGL("WGL_NV_gpu_affinity", NV) {
	nativeImport (
		"OpenGL.h",
		"WGL.h"
	)

	documentation =
		"""
		Native bindings to the ${registryLink("NV", "gpu_affinity")} extension.

		On systems with more than one GPU it is desirable to be able to select which GPU(s) in the system become the target for OpenGL rendering commands. This
		extension introduces the concept of a GPU affinity mask. OpenGL rendering commands are directed to the GPU(s) specified by the affinity mask. GPU
		affinity is immutable. Once set, it cannot be changed.

		This extension also introduces the concept called affinity-DC. An affinity-DC is a device context with a GPU affinity mask embedded in it. This
		restricts the device context to only allow OpenGL commands to be sent to the GPU(s) in the affinity mask.

		Requires ${WGL_ARB_extensions_string.link}.
		"""

	val wglMakeCurrent = "org.lwjgl.system.windows.WGL#MakeCurrent()"
	val wglMakeContextCurrentARB = "WGLARBMakeCurrentRead#MakeContextCurrentARB()"

	IntConstant(
		"New error code set by wglShareLists, wglMakeCurrent and $wglMakeContextCurrentARB.",

		"ERROR_INCOMPATIBLE_AFFINITY_MASKS_NV" _ 0x20D0
	).noPrefix()

	IntConstant(
		"New error code set by $wglMakeCurrent and $wglMakeContextCurrentARB.",

		"ERROR_MISSING_AFFINITY_MASK_NV" _ 0x20D1
	)

	// Functions

	BOOL(
		"EnumGpusNV",
		"""
		Returns the handles for all GPUs in a system.

		By looping over {@code wglEnumGpusNV} and incrementing {@code gpuIndex}, starting at index 0, all GPU handles can be queried. If the function succeeds,
		the return value is TRUE. If the function fails, the return value is FALSE and {@code gpu} will be unmodified. The function fails if {@code gpuIndex} is
		greater or equal than the number of GPUs supported by the system.
		""",

		UINT.IN("gpuIndex", "an index value that specifies a GPU"),
		HGPUNV_p.IN("gpu", "returns a handle for GPU number {@code gpuIndex}. The first GPU will be index 0.")
	)

	BOOL(
		"EnumGpuDevicesNV",
		"Retrieve information about the display devices supported by a GPU.",

		HGPUNV.IN("gpu", "a handle to the GPU to query"),
		UINT.IN("deviceIndex", "an index value that specifies a display device, supported by {@code gpu}, to query. The first display device will be index 0."),
		PGPU_DEVICE.IN("gpuDevice", "a ##GPU_DEVICE structure which will receive information about the display device at index {@code deviceIndex}.")
	)

	HDC(
		"CreateAffinityDCNV",
		"""
		Creates an affinity-DC. Affinity-DCs, a new type of DC, can be used to direct OpenGL commands to a specific GPU or set of GPUs. An affinity-DC is a
		device context with a GPU affinity mask embedded in it. This restricts the device context to only allow OpenGL commands to be sent to the GPU(s) in the
		affinity mask. An affinity-DC can be created directly, using the new function {@code wglCreateAffinityDCNV} and also indirectly by calling
		WGLARBPbuffer#CreatePbufferARB() followed by WGLARBPbuffer#GetPbufferDCARB().

		If successful, the function returns an affinity-DC handle. If it fails, NULL will be returned.
		""",

		const _ nullTerminated _ HGPUNV_p.IN("gpuList", "a NULL-terminated array of GPU handles to which the affinity-DC will be restricted")
	)

	BOOL(
		"EnumGpusFromAffinityDCNV",
		"""
		Retrieves a list of GPU handles that make up the affinity-mask of an affinity-DC.

		By looping over {@code wglEnumGpusFromAffinityDCNV} and incrementing {@code gpuIndex}, starting at index 0, all GPU handles associated with the DC can
		be queried. If the function succeeds, the return value is TRUE. If the function fails, the return value is FALSE and {@code gpu} will be unmodified. The
		function fails if {@code gpuIndex} is greater or equal than the number of GPUs associated with {@code affinityDC}.
		""",

		HDC.IN("affinityDC", "a handle of the affinity-DC to query"),
		UINT.IN("gpuIndex", "an index value of the GPU handle in the affinity mask of {@code affinityDC} to query"),
		HGPUNV_p.IN("gpu", "returns a handle for  GPU number {@code gpuIndex}. The first GPU will be at index 0.")
	)

	BOOL(
		"DeleteDCNV",
		"Deletes an affinity-DC.",

		HDC.IN("hdc", "a handle of an affinity-DC to delete")
	)
}