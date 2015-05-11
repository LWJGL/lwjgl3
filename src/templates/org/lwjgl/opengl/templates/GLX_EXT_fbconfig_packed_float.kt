/* 
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 */
package org.lwjgl.opengl.templates

import org.lwjgl.generator.*
import org.lwjgl.opengl.*

val GLX_EXT_fbconfig_packed_float = "GLXEXTFBConfigPackedFloat".nativeClassGLX("GLX_EXT_fbconfig_packed_float", EXT) {
	javaImport(
		"org.lwjgl.system.linux.*"
	)

	documentation =
		"""
		Native bindings to the ${registryLink("EXT", "packed_float")} extension.

		This extension adds a new 3-component floating-point texture format that fits within a single 32-bit word.  This format stores 5 bits of biased exponent
		per component in the same manner as 16-bit floating-point formats, but rather than 10 mantissa bits, the red, green, and blue components have 6, 6, and
		5 bits respectively. Each mantissa is assumed to have an implied leading one except in the denorm exponent case.  There is no sign bit so only
		non-negative values can be represented.  Positive infinity, positive denorms, and positive NaN values are representable.  The value of the fourth
		component returned by a texture fetch is always 1.0.

		This extension also provides support for rendering into an unsigned floating-point rendering format with the assumption that the texture format
		described above could also be advertised as an unsigned floating-point format for rendering.

		The extension also provides a pixel external format for specifying packed float values directly.

		Requires ${GLX13.glx}.
		"""

	IntConstant(
		"Accepted as values of the {@code render_type} arguments in the GLX13#CreateNewContext() and GLX#CreateContext() functions.",

		"RGBA_UNSIGNED_FLOAT_TYPE_EXT" _ 0x20B1
	)

	IntConstant(
		"""
		Returned by GLX13#GetFBConfigAttrib() (when {@code attribute} is set to GLX_RENDER_TYPE) and accepted by the {@code attrib_list} parameter of
		GLX13#ChooseFBConfig() (following the GLX_RENDER_TYPE token).
		""",

		"RGBA_UNSIGNED_FLOAT_BIT_EXT" _ 0x00000008
	)

}