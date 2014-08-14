/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 */
package org.lwjgl.opengl.templates

import org.lwjgl.generator.*
import org.lwjgl.opengl.*

fun ARB_ES3_1_compatibility() = "ARBES31Compatibility".nativeClassGL("ARB_ES3_1_compatibility") {
	nativeImport (
		"OpenGL.h"
	)

	documentation =
		"""
		Native bindings to the ${url("http://www.opengl.org/registry/specs/ARB/ES3_1_compatibility.txt", templateName)} extension.

		This extension adds support for features of OpenGL ES 3.1 that are missing from OpenGL 4.4. Enabling these features will ease the process of porting
		applications from OpenGL ES 3.1 to OpenGL.
		"""

	GL45 reuse "MemoryBarrierByRegion"
}