/* 
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 */
package org.lwjgl.opengl.templates

import org.lwjgl.generator.*
import org.lwjgl.opengl.*
import org.lwjgl.system.windows.*

fun WGL_NV_DX_interop2() = "WGLNVDXInterop2".nativeClassWGL("WGL_NV_DX_interop2", "NV") {
	javaDoc(
		"""
		Native bindings to the ${link("http://www.opengl.org/registry/specs/NV/DX_interop2.txt", templateName)} extension.

		This extension expands on the specification of {@link WGLNVDXInterop to add support for DirectX version 10, 10.1 and 11 resources.
		"""
	)
}