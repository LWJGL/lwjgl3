/* 
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 */
package org.lwjgl.opengl.templates

import org.lwjgl.generator.*
import org.lwjgl.opengl.*

val GLX_ARB_fbconfig_float = "GLXARBFBConfigFloat".nativeClassGLX("GLX_ARB_fbconfig_float", ARB) {
	javaImport("org.lwjgl.system.linux.*")

	documentation =
		"""
		Native bindings to the ${registryLink("ARB", "color_buffer_float")} extension.

		The standard OpenGL pipeline is based on a fixed-point pipeline. While color components are nominally floating-point values in the pipeline, components
		are frequently clamped to the range [0,1] to accomodate the fixed-point color buffer representation and allow for fixed-point computational hardware.

		This extension adds pixel formats or visuals with floating-point RGBA color components and controls for clamping of color components within the pipeline.
		"""

	IntConstant(
		"Accepted as values of the {@code render_type} arguments in the GLX13#CreateNewContext() and GLX#CreateContext() functions.",

		"RGBA_FLOAT_TYPE" _ 0x20B9
	)

	IntConstant(
		"Accepted as a bit set in the GLX_RENDER_TYPE variable.",

		"RGBA_FLOAT_BIT" _ 0x00000004
	)

}