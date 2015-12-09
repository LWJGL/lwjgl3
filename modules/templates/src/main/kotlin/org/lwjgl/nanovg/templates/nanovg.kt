/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 */
package org.lwjgl.nanovg.templates

import org.lwjgl.generator.*
import org.lwjgl.nanovg.*

val nanovg = "NanoVG".nativeClass(packageName = NANOVG_PACKAGE, prefix = "NVG") {
	nativeDirective(
		"""#ifdef LWJGL_WINDOWS
	#define _CRT_SECURE_NO_WARNINGS
	__pragma(warning(disable : 4710))
#endif""", beforeIncludes = true)

	includeNanoVGAPI("""#include <stdlib.h>
#include <string.h>
#ifdef LWJGL_WINDOWS
	__pragma(warning(disable : 4711 4738))
#endif
#include "nanovg.c"""")

	documentation =
		"""
		"""

	FloatConstant(
		"PI",

		"PI"..3.14159265358979323846264338327f
	)

	EnumConstant(
		"Winding order.",

		"CCW".enum("Winding for solid shapes", 1),
		"CW".enum("Winding for holes", 2)
	)

	EnumConstant(
		"Solidity.",

		"SOLID".enum("CCW", 1),
		"HOLE".enum("CW", 2)
	)

	EnumConstant(
		"Line caps.",

		"BUTT".enum,
		"ROUND".enum,
		"SQUARE".enum,
		"BEVEL".enum,
		"MITER".enum
	)

	EnumConstant(
		"Alignments.",

		"ALIGN_LEFT".enumExpr("Default, align text horizontally to left.", "1<<0"),
		"ALIGN_CENTER".enumExpr("Align text horizontally to center.", "1<<1"),
		"ALIGN_RIGHT".enumExpr("Align text horizontally to right.", "1<<2"),

		"ALIGN_TOP".enumExpr("Align text vertically to top.", "1<<3"),
		"ALIGN_MIDDLE".enumExpr("Align text vertically to middle.", "1<<4"),
		"ALIGN_BOTTOM".enumExpr("Align text vertically to bottom.", "1<<5"),
		"ALIGN_BASELINE".enumExpr("Default, align text vertically to baseline.", "1<<6")
	)

	EnumConstant(
		"Image flags.",

		"IMAGE_GENERATE_MIPMAPS".enumExpr("Generate mipmaps during creation of the image.", "1<<0"),
		"IMAGE_REPEATX".enumExpr("Repeat image in X direction.", "1<<1"),
		"IMAGE_REPEATY".enumExpr("Repeat image in Y direction.", "1<<2"),
		"IMAGE_FLIPY".enumExpr("Flips (inverses) image in Y direction when rendered.", "1<<3"),
		"IMAGE_PREMULTIPLIED".enumExpr("Image data has premultiplied alpha.", "1<<4")
	)
	
	val ctx = NVGcontext_p.IN("ctx", "")

	void(
		"BeginFrame",
		"",

		ctx,
		int.IN("windowWidth", ""),
		int.IN("windowHeight", ""),
		float.IN("devicePixelRatio", "")
	)

	void(
		"CancelFrame",
		"",

		ctx
	)

	void(
		"EndFrame",
		"",

		ctx
	)

	// Color utils

	NVGcolor(
		"RGB",
		"",

		unsigned_char.IN("r", ""),
		unsigned_char.IN("g", ""),
		unsigned_char.IN("b", "")
	)

	NVGcolor(
		"RGBf",
		"",

		float.IN("r", ""),
		float.IN("g", ""),
		float.IN("b", "")
	)

	NVGcolor(
		"RGBA",
		"",

		unsigned_char.IN("r", ""),
		unsigned_char.IN("g", ""),
		unsigned_char.IN("b", ""),
		unsigned_char.IN("a", "")
	)

	NVGcolor(
		"RGBAf",
		"",

		float.IN("r", ""),
		float.IN("g", ""),
		float.IN("b", ""),
		float.IN("a", "")
	)

	NVGcolor(
		"LerpRGBA",
		"",

		NVGcolor.IN("c0", ""),
		NVGcolor.IN("c1", ""),
		float.IN("u", "")
	)

	NVGcolor(
		"TransRGBA",
		"",

		NVGcolor.IN("c0", ""),
		unsigned_char.IN("a", "")
	)

	NVGcolor(
		"TransRGBAf",
		"",

		NVGcolor.IN("c0", ""),
		float.IN("a", "")
	)

	NVGcolor(
		"HSL",
		"",

		float.IN("h", ""),
		float.IN("s", ""),
		float.IN("l", "")
	)

	NVGcolor(
		"HSLA",
		"",

		float.IN("h", ""),
		float.IN("s", ""),
		float.IN("l", ""),
		unsigned_char.IN("a", "")
	)

	// State Handling

	void(
		"Save",
		"",

		ctx
	)

	void(
		"Restore",
		"",

		ctx
	)

	void(
		"Reset",
		"",

		ctx
	)

	// Render styles

	void(
		"StrokeColor",
		"",

		ctx,
		NVGcolor.IN("color", "")
	)

	void(
		"StrokePaint",
		"",

		ctx,
		NVGpaint.IN("paint", "")
	)

	void(
		"FillColor",
		"",

		ctx,
		NVGcolor.IN("color", "")
	)

	void(
		"FillPaint",
		"",

		ctx,
		NVGpaint.IN("paint", "")
	)

	void(
		"MiterLimit",
		"",

		ctx,
		float.IN("limit", "")
	)

	void(
		"StrokeWidth",
		"",

		ctx,
		float.IN("size", "")
	)

	void(
		"LineCap",
		"",

		ctx,
		int.IN("cap", "")
	)

	void(
		"LineJoin",
		"",

		ctx,
		int.IN("join", "")
	)

	void(
		"GlobalAlpha",
		"",

		ctx,
		float.IN("alpha", "")
	)

	// Transforms

	void(
		"ResetTransform",
		"",

		ctx
	)

	void(
		"Transform",
		"",

		ctx,
		float.IN("a", ""),
		float.IN("b", ""),
		float.IN("c", ""),
		float.IN("d", ""),
		float.IN("e", ""),
		float.IN("f", "")
	)

	void(
		"Translate",
		"",

		ctx,
		float.IN("x", ""),
		float.IN("y", "")
	)

	void(
		"Rotate",
		"",

		ctx,
		float.IN("angle", "")
	)

	void(
		"SkewX",
		"",

		ctx,
		float.IN("angle", "")
	)

	void(
		"SkewY",
		"",

		ctx,
		float.IN("angle", "")
	)

	void(
		"Scale",
		"",

		ctx,
		float.IN("x", ""),
		float.IN("y", "")
	)

	void(
		"CurrentTransform",
		"",

		ctx,
		Check(6)..float_p.OUT("xform", "")
	)

	void(
		"TransformIdentity",
		"",

		Check(6)..float_p.OUT("dst", "")
	)

	void(
		"TransformTranslate",
		"",

		Check(6)..float_p.OUT("dst", ""),
		float.IN("tx", ""),
		float.IN("ty", "")
	)

	void(
		"TransformScale",
		"",

		Check(6)..float_p.OUT("dst", ""),
		float.IN("sx", ""),
		float.IN("sy", "")
	)

	void(
		"TransformRotate",
		"",

		Check(6)..float_p.OUT("dst", ""),
		float.IN("a", "")
	)

	void(
		"TransformSkewX",
		"",

		Check(6)..float_p.OUT("dst", ""),
		float.IN("a", "")
	)

	void(
		"TransformSkewY",
		"",

		Check(6)..float_p.OUT("dst", ""),
		float.IN("a", "")
	)

	void(
		"TransformMultiply",
		"",

		Check(6)..float_p.OUT("dst", ""),
		Check(6)..const..float_p.IN("src", "")
	)

	void(
		"TransformPremultiply",
		"",

		Check(6)..float_p.OUT("dst", ""),
		Check(6)..const..float_p.IN("src", "")
	)

	int(
		"TransformInverse",
		"",

		Check(6)..float_p.OUT("dst", ""),
		Check(6)..const..float_p.IN("src", "")
	)

	void(
		"TransformPoint",
		"",

		Check(1)..float_p.OUT("dstx", ""),
		Check(1)..float_p.OUT("dsty", ""),
		Check(6)..const..float_p.IN("xform", ""),
		float.IN("srcx", ""),
		float.IN("srcy", "")
	)

	float(
		"DegToRad",
		"",

		float.IN("deg", "")
	)

	float(
		"RadToDeg",
		"",

		float.IN("rad", "")
	)

	// Images

	int(
		"CreateImage",
		"",

		ctx,
		const..charASCII_p.IN("filename", ""),
		int.IN("imageFlags", "")
	)

	int(
		"CreateImageMem",
		"",

		ctx,
		int.IN("imageFlags", ""),
		unsigned_char_p.IN("data", ""),
		AutoSize("data")..int.IN("ndata", "")
	)

	int(
		"CreateImageRGBA",
		"",

		ctx,
		int.IN("w", ""),
		int.IN("h", ""),
		int.IN("imageFlags", ""),
		const..unsigned_char_p.IN("data", "")
	)

	void(
		"UpdateImage",
		"",

		ctx,
		int.IN("image", ""),
		const..unsigned_char_p.IN("data", "")
	)

	void(
		"ImageSize",
		"",

		ctx,
		int.IN("image", ""),
		Check(1)..int_p.OUT("w", ""),
		Check(1)..int_p.OUT("h", "")
	)

	void(
		"DeleteImage",
		"",

		ctx,
		int.IN("image", "")
	)

	// Paints

	NVGpaint(
		"LinearGradient",
		"",

		ctx,
		float.IN("sx", ""),
		float.IN("sy", ""),
		float.IN("ex", ""),
		float.IN("ey", ""),
		NVGcolor.IN("icol", ""),
		NVGcolor.IN("ocol", "")
	)

	NVGpaint(
		"BoxGradient",
		"",

		ctx,
		float.IN("x", ""),
		float.IN("y", ""),
		float.IN("w", ""),
		float.IN("h", ""),
		float.IN("r", ""),
		float.IN("f", ""),
		NVGcolor.IN("icol", ""),
		NVGcolor.IN("ocol", "")
	)

	NVGpaint(
		"RadialGradient",
		"",

		ctx,
		float.IN("cx", ""),
		float.IN("cy", ""),
		float.IN("inr", ""),
		float.IN("outr", ""),
		NVGcolor.IN("icol", ""),
		NVGcolor.IN("ocol", "")
	)

	NVGpaint(
		"ImagePattern",
		"",

		ctx,
		float.IN("ox", ""),
		float.IN("oy", ""),
		float.IN("ex", ""),
		float.IN("ey", ""),
		float.IN("angle", ""),
		int.IN("image", ""),
		float.IN("alpha", "")
	)

	// Scissoring

	void(
		"Scissor",
		"",

		ctx,
		float.IN("x", ""),
		float.IN("y", ""),
		float.IN("w", ""),
		float.IN("h", "")
	)

	void(
		"IntersectScissor",
		"",

		ctx,
		float.IN("x", ""),
		float.IN("y", ""),
		float.IN("w", ""),
		float.IN("h", "")
	)

	void(
		"ResetScissor",
		"",

		ctx
	)

	// Paths

	void(
		"BeginPath",
		"",

		ctx
	)

	void(
		"MoveTo",
		"",

		ctx,
		float.IN("x", ""),
		float.IN("y", "")
	)

	void(
		"LineTo",
		"",

		ctx,
		float.IN("x", ""),
		float.IN("y", "")
	)

	void(
		"BezierTo",
		"",

		ctx,
		float.IN("c1x", ""),
		float.IN("c1y", ""),
		float.IN("c2x", ""),
		float.IN("c2y", ""),
		float.IN("x", ""),
		float.IN("y", "")
	)

	void(
		"QuadTo",
		"",

		ctx,
		float.IN("cx", ""),
		float.IN("cy", ""),
		float.IN("x", ""),
		float.IN("y", "")
	)

	void(
		"ArcTo",
		"",

		ctx,
		float.IN("x1", ""),
		float.IN("y1", ""),
		float.IN("x2", ""),
		float.IN("y2", ""),
		float.IN("radius", "")
	)

	void(
		"ClosePath",
		"",

		ctx
	)

	void(
		"PathWinding",
		"",

		ctx,
		int.IN("dir", "")
	)

	void(
		"Arc",
		"",

		ctx,
		float.IN("cx", ""),
		float.IN("cy", ""),
		float.IN("r", ""),
		float.IN("a0", ""),
		float.IN("a1", ""),
		int.IN("dir", "")
	)

	void(
		"Rect",
		"",

		ctx,
		float.IN("x", ""),
		float.IN("y", ""),
		float.IN("w", ""),
		float.IN("h", "")
	)

	void(
		"RoundedRect",
		"",

		ctx,
		float.IN("x", ""),
		float.IN("y", ""),
		float.IN("w", ""),
		float.IN("h", ""),
		float.IN("r", "")
	)

	void(
		"Ellipse",
		"",

		ctx,
		float.IN("cx", ""),
		float.IN("cy", ""),
		float.IN("rx", ""),
		float.IN("ry", "")
	)

	void(
		"Circle",
		"",

		ctx,
		float.IN("cx", ""),
		float.IN("cy", ""),
		float.IN("r", "")
	)

	void(
		"Fill",
		"",

		ctx
	)

	void(
		"Stroke",
		"",

		ctx
	)

	// Text

	int(
		"CreateFont",
		"",

		ctx,
		const..charASCII_p.IN("name", ""),
		const..charASCII_p.IN("filename", "")
	)

	int(
		"CreateFontMem",
		"",

		ctx,
		const..charASCII_p.IN("name", ""),
		unsigned_char_p.IN("data", ""),
		AutoSize("data")..int.IN("ndata", ""),
		int.IN("freeData", "")
	)

	int(
		"FindFont",
		"",

		ctx,
		const..charASCII_p.IN("name", "")
	)

	void(
		"FontSize",
		"",

		ctx,
		float.IN("size", "")
	)

	void(
		"FontBlur",
		"",

		ctx,
		float.IN("blur", "")
	)

	void(
		"TextLetterSpacing",
		"",

		ctx,
		float.IN("spacing", "")
	)

	void(
		"TextLineHeight",
		"",

		ctx,
		float.IN("lineHeight", "")
	)

	void(
		"TextAlign",
		"",

		ctx,
		int.IN("align", "")
	)

	void(
		"FontFaceId",
		"",

		ctx,
		int.IN("font", "")
	)

	void(
		"FontFace",
		"",

		ctx,
		const..charASCII_p.IN("font", "")
	)

	float(
		"Text",
		"",

		ctx,
		float.IN("x", ""),
		float.IN("y", ""),
		const..charUTF8_p.IN("string", ""),
		nullable..const..charptr.IN("end", "")
	)

	void(
		"TextBox",
		"",

		ctx,
		float.IN("x", ""),
		float.IN("y", ""),
		float.IN("breakRowWidth", ""),
		const..charUTF8_p.IN("string", ""),
		nullable..const..charptr.IN("end", "")
	)

	float(
		"TextBounds",
		"",

		ctx,
		float.IN("x", ""),
		float.IN("y", ""),
		const..charUTF8_p.IN("string", ""),
		nullable..const..charptr.IN("end", ""),
		nullable..Check(4)..float_p.OUT("bounds", "")
	)

	void(
		"TextBoxBounds",
		"",

		ctx,
		float.IN("x", ""),
		float.IN("y", ""),
		float.IN("breakRowWidth", ""),
		const..charUTF8_p.IN("string", ""),
		nullable..const..charptr.IN("end", ""),
		nullable..Check(4)..float_p.OUT("bounds", "")
	)

	int(
		"TextGlyphPositions",
		"",

		NVGcontext_p.IN("ctx", ""),
		float.IN("x", ""),
		float.IN("y", ""),
		const..charUTF8_p.IN("string", ""),
		nullable..const..charptr.IN("end", ""),
		StructBuffer..NVGglyphPosition_p.OUT("positions", ""),
		AutoSize("positions")..int.IN("maxPositions", "")
	)

	void(
		"TextMetrics",
		"",

		ctx,
		nullable..Check(1)..float_p.OUT("ascender", ""),
		nullable..Check(1)..float_p.OUT("descender", ""),
		nullable..Check(1)..float_p.OUT("lineh", "")
	)

	int(
		"TextBreakLines",
		"",

		NVGcontext_p.IN("ctx", ""),
		const..charUTF8_p.IN("string", ""),
		nullable..const..charptr.IN("end", ""),
		float.IN("breakRowWidth", ""),
		StructBuffer..NVGtextRow_p.OUT("rows", ""),
		AutoSize("rows")..int.IN("maxRows", "")
	)
}