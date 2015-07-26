/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 */
package org.lwjgl.egl.templates

import org.lwjgl.generator.*
import org.lwjgl.egl.*

val MESA_image_dma_buf_export = "MESAImageDMABufExport".nativeClassEGL("MESA_image_dma_buf_export", postfix = MESA) {
	includeEGLEXT()

	documentation =
		"""
		Native bindings to the $registryLink extension.

		This extension provides entry points for integrating EGLImage with the dma-buf infrastructure. The extension allows creating a Linux dma_buf file
		descriptor or multiple file descriptors, in the case of multi-plane YUV image, from an EGLImage.

		It is designed to provide the complementary functionality to EGL_EXT_image_dma_buf_import.

		Requires ${EGL14.core} and ${KHR_image_base.link}. The EGL implementation must be running on a Linux kernel supporting the dma_buf buffer sharing
		mechanism.
		"""

	EGLBoolean(
		"ExportDMABUFImageQueryMESA",
		"",

		EGLDisplay.IN("dpy", ""),
		EGLImageKHR.IN("image", ""),
		nullable _ Check(1) _ int_p.OUT("fourcc", ""),
		nullable _ Check(1) _ int_p.OUT("num_planes", ""),
		nullable _ Check(1) _ EGLuint64KHR_p.OUT("modifiers", "")
	)

	EGLBoolean(
		"ExportDMABUFImageMESA",
		"",

		EGLDisplay.IN("dpy", ""),
		EGLImageKHR.IN("image", ""),
		nullable _ Check(1) _ int_p.OUT("fds", ""),
		nullable _ Check(1) _ EGLint_p.OUT("strides", ""),
		nullable _ Check(1) _ EGLint_p.OUT("offsets", "")
	)
}