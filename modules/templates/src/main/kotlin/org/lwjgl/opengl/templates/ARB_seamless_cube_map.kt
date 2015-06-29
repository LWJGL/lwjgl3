/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 */
package org.lwjgl.opengl.templates

import org.lwjgl.generator.*
import org.lwjgl.opengl.*

val ARB_seamless_cube_map = "ARBSeamlessCubeMap".nativeClassGL("ARB_seamless_cube_map") {
	documentation =
		"""
		Native bindings to the $registryLink extension.

		When sampling from cube map textures, a three-dimensional texture coordinate is used to select one of the cube map faces and generate a two dimensional
		texture coordinate ( s t ), at which a texel is sampled from the determined face of the cube map texture. Each face of the texture is treated as an
		independent two-dimensional texture, and the generated ( s t ) coordinate is subjected to the same clamping and wrapping rules as for any other two
		dimensional texture fetch.

		Although it is unlikely that the generated ( s t ) coordinate lies significantly outside the determined cube map face, it is often the case that the
		locations of the individual elements required during a linear sampling do not lie within the determined face, and their coordinates will therefore be
		modified by the selected clamping and wrapping rules. This often has the effect of producing seams or other discontinuities in the sampled texture.

		This extension allows implementations to take samples from adjacent cube map faces, providing the ability to create seamless cube maps.

		${GL32.promoted}
		"""

	IntConstant(
		"""
		Accepted by the {@code cap} parameter of Enable, Disable and IsEnabled, and by the {@code pname} parameter of GetBooleanv, GetIntegerv, GetFloatv and
		GetDoublev.
		""",

		"TEXTURE_CUBE_MAP_SEAMLESS" _ 0x884F
	)
}