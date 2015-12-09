/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 */
package org.lwjgl.nanovg

import org.lwjgl.generator.*

val NANOVG_PACKAGE = "org.lwjgl.nanovg"

fun config() {
	packageInfo(
		NANOVG_PACKAGE,
		"""
		Contains bindings to <a href="https://github.com/memononen/nanovg">NanoVG</a>, a small antialiased vector graphics rendering library for OpenGL. It has
		lean API modeled after HTML5 canvas API. It is aimed to be a practical and fun toolset for building scalable user interfaces and visualizations.
		"""
	)
}

fun GeneratorTargetNative.includeNanoVGAPI(directives: String) = nativeDirective(
	"""DISABLE_WARNINGS()
$directives
ENABLE_WARNINGS()""")

val NVGcontext_p = "NVGcontext".p

val NVGcolor = struct(NANOVG_PACKAGE, "NVGColor", nativeName = "NVGcolor") {
	documentation = ""

	union {
		float.array("rgba", "", size = 4)
		struct {
			float.member("r", "")
			float.member("g", "")
			float.member("b", "")
			float.member("a", "")
		}
	}
}.nativeType

val NVGpaint = struct(NANOVG_PACKAGE, "NVGPaint", nativeName = "NVGpaint") {
	documentation = ""

	float.array("xform", "", size = 6)
	float.array("extent", "", size = 2)
	float.member("radius", "")
	float.member("feather", "")
	NVGcolor.member("innerColor", "")
	NVGcolor.member("outerColor", "")
	int.member("image", "")
}.nativeType

val charptr = "char".p // address, not data

val NVGglyphPosition_p = struct_p(NANOVG_PACKAGE, "NVGGlyphPosition", nativeName = "NVGglyphPosition") {
	documentation = ""

	charptr.member("str", "position of the glyph in the input string")
	float.member("x", "the x-coordinate of the logical glyph position")
	float.member("minx", "the left bound of the glyph shape")
	float.member("maxx", "the right bound of the glyph shape")
}

val NVGtextRow_p = struct_p(NANOVG_PACKAGE, "NVGTextRow", nativeName = "NVGtextRow") {
	documentation = ""

	charptr.member("start", "pointer to the input text where the row starts")
	charptr.member("end", "pointer to the input text where the row ends (one past the last character")
	charptr.member("next", "pointer to the beginning of the next row")
	float.member("width", "logical width of the row")
	float.member("minx", "actual left bound of the row. Logical width and bounds can differ because of kerning and some parts over extending.")
	float.member("maxx", "actual right bound of the row. Logical width and bounds can differ because of kerning and some parts over extending.")
}
