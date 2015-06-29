/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 */
package org.lwjgl.opengl.templates

import org.lwjgl.generator.*
import org.lwjgl.opengl.*

val ARB_fragment_shader = "ARBFragmentShader".nativeClassGL("ARB_fragment_shader", postfix = ARB) {
	documentation =
		"""
		Native bindings to the $registryLink extension.

		This extension adds functionality to define fragment shader objects. A fragment shader object is a shader object (see the ARB_shader_objects extension)
		that, when attached to a program object, can be compiled and linked to produce an executable that runs on the fragment processor in OpenGL. The fragment
		processor is a programmable unit that replaces the OpenGL 1.4 fixed-function texturing, color sum and fog stages. This extension also defines how such
		an executable interacts with the fixed functionality fragment processing of OpenGL 1.4. The language is defined in the OpenGL Shading Language
		specification as the Fragment Shading Language.

		${GL20.promoted}
		"""

	IntConstant(
		"Accepted by the {@code shaderType} argument of CreateShaderObjectARB and returned by the {@code params} parameter of GetObjectParameter{fi}vARB.",

		"FRAGMENT_SHADER_ARB" _ 0x8B30
	)

	IntConstant(
		"Accepted by the {@code pname} parameter of GetBooleanv, GetIntegerv, GetFloatv, and GetDoublev.",

		"MAX_FRAGMENT_UNIFORM_COMPONENTS_ARB" _ 0x8B49,
		"MAX_TEXTURE_COORDS_ARB" _ 0x8871,
		"MAX_TEXTURE_IMAGE_UNITS_ARB" _ 0x8872
	)

	IntConstant(
		"Accepted by the {@code target} parameter of Hint and the {@code pname} parameter of GetBooleanv, GetIntegerv, GetFloatv, and GetDoublev.",

		"FRAGMENT_SHADER_DERIVATIVE_HINT_ARB" _ 0x8B8B
	)
}