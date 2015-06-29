/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 */
package org.lwjgl.stb.templates

import org.lwjgl.generator.*
import org.lwjgl.stb.*

val stb_dxt = "STBDXT".nativeClass(packageName = STB_PACKAGE, prefix = "STB", prefixMethod = "stb_") {
	includeSTBAPI(
		"""#define STB_DXT_IMPLEMENTATION
#include "stb_dxt.h"""")

	documentation =
		"""
		Native bindings to stb_dxt.h from the <a href="https://github.com/nothings/stb">stb library</a>.

		DXT1/DXT5 compressor.
		"""

	IntConstant("", "DXT_NORMAL" _ 0)
	IntConstant("Use dithering. Dubious win, never use for normal maps and the like!", "DXT_DITHER" _ 1)
	IntConstant("High quality mode, does two refinement steps instead of 1. ~30-40% slower.", "DXT_HIGHQUAL" _ 2)

	void(
		"compress_dxt_block",
		"""
		Call this function for every block (you must pad). The source should be a 4x4 block of RGBA data in row-major order; A is ignored if you specify
		{@code alpha=0}; you can turn on dithering and "high quality" using {@code mode}.
		""",

		unsigned_char_p.OUT("dest", "a buffer in which to store the compressed block"),
		Check(4 * 4 * 4) _ const _ unsigned_char_p.IN("src", "the block to compress"),
		int.IN("alpha", "1 to compress the alpha channel, 0 to ignore it"),
		int.IN("mode", "the compression mode", "#DXT_NORMAL #DXT_DITHER #DXT_HIGHQUAL")
	)
}