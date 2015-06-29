/* 
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 */
package org.lwjgl.opengl.templates

import org.lwjgl.generator.*
import org.lwjgl.opengl.OPENGL_PACKAGE
import org.lwjgl.system.windows.*

val WGL = "WGL".nativeClass(OPENGL_PACKAGE, nativeSubPath = "wgl", prefix = "WGL") {
	javaImport(
		"org.lwjgl.system.windows.*"
	)

	nativeImport (
		"WindowsLWJGL.h"
	)

	documentation = "Native bindings to WGL functionality."

	IntConstant(
		"UseFontOutlines format.",
		"FONT_LINES" _ 0,
		"FONT_POLYGONS" _ 1
	)

	IntConstant(
		"SwapLayerBuffers flags.",
		"SWAP_MAIN_PLANE" _ 0x00000001,
		"SWAP_OVERLAY1" _ 0x00000002,
		"SWAP_OVERLAY2" _ 0x00000004,
		"SWAP_OVERLAY3" _ 0x00000008,
		"SWAP_OVERLAY4" _ 0x00000010,
		"SWAP_OVERLAY5" _ 0x00000020,
		"SWAP_OVERLAY6" _ 0x00000040,
		"SWAP_OVERLAY7" _ 0x00000080,
		"SWAP_OVERLAY8" _ 0x00000100,
		"SWAP_OVERLAY9" _ 0x00000200,
		"SWAP_OVERLAY10" _ 0x00000400,
		"SWAP_OVERLAY11" _ 0x00000800,
		"SWAP_OVERLAY12" _ 0x00001000,
		"SWAP_OVERLAY13" _ 0x00002000,
		"SWAP_OVERLAY14" _ 0x00004000,
		"SWAP_OVERLAY15" _ 0x00008000,
		"SWAP_UNDERLAY1" _ 0x00010000,
		"SWAP_UNDERLAY2" _ 0x00020000,
		"SWAP_UNDERLAY3" _ 0x00040000,
		"SWAP_UNDERLAY4" _ 0x00080000,
		"SWAP_UNDERLAY5" _ 0x00100000,
		"SWAP_UNDERLAY6" _ 0x00200000,
		"SWAP_UNDERLAY7" _ 0x00400000,
		"SWAP_UNDERLAY8" _ 0x00800000,
		"SWAP_UNDERLAY9" _ 0x01000000,
		"SWAP_UNDERLAY10" _ 0x02000000,
		"SWAP_UNDERLAY11" _ 0x04000000,
		"SWAP_UNDERLAY12" _ 0x08000000,
		"SWAP_UNDERLAY13" _ 0x10000000,
		"SWAP_UNDERLAY14" _ 0x20000000,
		"SWAP_UNDERLAY15" _ 0x40000000
	)

	HGLRC(
		"CreateContext",
		"""
		Creates a new OpenGL rendering context, which is suitable for drawing on the device referenced by device. The rendering context has the same pixel
		format as the device context.
		""",

		HDC.IN("hdc", "handle to a device context for which the function creates a suitable OpenGL rendering context")
	)

	HGLRC(
		"CreateLayerContext",
		"Creates a new OpenGL rendering context for drawing to a specified layer plane on a device context.",

		HDC.IN("hdc", "the device context for a new rendering context"),
		int.IN(
			"layerPlane",
			"""
			the layer plane to which you want to bind a rendering context. The value 0 identifies the main plane. Positive values of {@code layerPlace} identify
			overlay planes, where 1 is the first overlay plane over the main plane, 2 is the second overlay plane over the first overlay plane, and so on.
			Negative values identify underlay planes, where 1 is the first underlay plane under the main plane, 2 is the second underlay plane under the first
			underlay plane, and so on. The number of overlay and underlay planes is given in the {@code reserved} member of the ##PIXELFORMATDESCRIPTOR
			structure.
			"""
		)
	)

	BOOL(
		"CopyContext",
		"Copies selected groups of rendering states from one OpenGL rendering context to another.",

		HGLRC.IN("src", "the source OpenGL rendering context whose state information is to be copied"),
		HGLRC.IN("dst", "the destination OpenGL rendering context to which state information is to be copied"),
		UINT.IN(
			"mask",
			"""
			which groups of the {@code src} rendering state are to be copied to {@code dst}. It contains the bitwise-OR of the same symbolic names that are
			passed to the org.lwjgl.opengl.GL11##glPushAttrib() function. You can use org.lwjgl.opengl.GL11##GL_ALL_ATTRIB_BITS to copy all the
			rendering state information.
			"""
		)
	)

	BOOL(
		"DeleteContext",
		"Deletes a specified OpenGL rendering context.",

		HGLRC.IN("context", "handle to an OpenGL rendering context that the function will delete")
	)

	HGLRC(
		"GetCurrentContext",
		"Obtains a handle to the current OpenGL rendering context of the calling thread."
	)

	HDC(
		"GetCurrentDC",
		"Obtains a handle to the device context that is associated with the current OpenGL rendering context of the calling thread."
	)

	PROC(
		"GetProcAddress",
		"Returns the address of an OpenGL extension function for use with the current OpenGL rendering context.",

		LPCSTR.IN(
			"proc",
			"""
			points to a null-terminated string that is the name of the extension function. The name of the extension function must be identical to a
			corresponding function implemented by OpenGL.
			"""
		)
	)

	BOOL(
		"MakeCurrent",
		"""
		Makes a specified OpenGL rendering context the calling thread's current rendering context. All subsequent OpenGL calls made by the thread are drawn on
		the device identified by device. You can also use MakeCurrent to change the calling thread's current rendering context so it's no longer current.
		""",

		nullable _ HDC.IN("hdc", "handle to a device context. Subsequent OpenGL calls made by the calling thread are drawn on the device identified by {@code dc}."),
		nullable _ HGLRC.IN(
			"context",
			"""
			handle to an OpenGL rendering context that the function sets as the calling thread's rendering context. If {@code context} is $NULL, the function
			makes the calling thread's current rendering context no longer current, and releases the device context that is used by the rendering context. In
			this case, {@code hdc} is ignored.
			"""
		)
	)

	BOOL(
		"ShareLists",
		"Enables multiple OpenGL rendering contexts to share a single display-list space.",

		HGLRC.IN("context1", "the OpenGL rendering context with which to share display lists."),
		HGLRC.IN(
			"context2",
			"""
			the OpenGL rendering context to share display lists with {@code context1}. The {@code context2} parameter should not contain any existing display
			lists when {@code wglShareLists} is called.
			"""
		)
	)

	/*
	WINGDIAPI BOOL  WINAPI DescribeLayerPlane(HDC, int, int, UINT, LPLAYERPLANEDESCRIPTOR);
	WINGDIAPI int   WINAPI SetLayerPaletteEntries(HDC, int, int, int, CONST COLORREF *);
	WINGDIAPI int   WINAPI GetLayerPaletteEntries(HDC, int, int, int, COLORREF *);
	WINGDIAPI BOOL  WINAPI RealizeLayerPalette(HDC, int, BOOL);
	WINGDIAPI BOOL  WINAPI SwapLayerBuffers(HDC, UINT);

	// WinVer >= 0x0500
	WINGDIAPI DWORD WINAPI SwapMultipleBuffers(UINT, CONST WGLSWAP *);
	*/

	BOOL(
		"UseFontBitmaps",
		"""
		Creates a set of bitmap display lists for use in the current OpenGL rendering context. The set of bitmap display lists is based on the glyphs in the
		currently selected font in the device context. You can then use bitmaps to draw characters in an OpenGL image.

		Creates count display lists, one for each of a run of count glyphs that begins with the first glyph in the device parameter's selected fonts.
		""",

		HDC.IN("hdc", "the device context whose currently selected font will be used to form the glyph bitmap display lists in the current OpenGL rendering context"),
		DWORD.IN("first", "the first glyph in the run of glyphs that will be used to form glyph bitmap display lists"),
		DWORD.IN("count", "the number of glyphs in the run of glyphs that will be used to form glyph bitmap display lists. The function creates count display lists, one for each glyph in the run."),
		DWORD.IN("listBase", "the starting display list")
	)

	BOOL(
		"UseFontOutlines",
		"""
		Creates a set of display lists, one for each glyph of the currently selected outline font of a device context, for use with the current rendering
		context. The display lists are used to draw 3-D characters of TrueType fonts. Each display list describes a glyph outline in floating-point coordinates.

		The run of glyphs begins with thefirstglyph of the font of the specified device context. The em square size of the font, the notional grid size of the
		original font outline from which the font is fitted, is mapped to 1.0 in the x- and y-coordinates in the display lists. The extrusion parameter sets how
		much depth the font has in the z direction.

		The glyphMetrics parameter returns a ##GLYPHMETRICSFLOAT structure that contains information about the placement and orientation of each glyph in
		a character cell.
		""",

		HDC.IN(
			"hdc",
			"""
			the device context with the desired outline font. The outline font of {@code dc} is used to create the display lists in the current rendering
			context.
			"""
		),
		DWORD.IN("first", "the first of the set of glyphs that form the font outline display lists"),
		DWORD.IN(
			"count",
			"""
			the number of glyphs in the set of glyphs used to form the font outline display lists. The {@code wglUseFontOutlines} function creates count display
			lists, one display list for each glyph in a set of glyphs.
			"""
		),
		DWORD.IN("listBase", "the starting display list"),
		FLOAT.IN(
			"deviation",
			"""
			the maximum chordal deviation from the original outlines. When deviation is zero, the chordal deviation is equivalent to one design unit of the
			original font. The value of deviation must be equal to or greater than 0.
			"""
		),
		FLOAT.IN(
			"extrusion",
			"""
			how much a font is extruded in the negative z direction. The value must be equal to or greater than 0. When extrusion is 0, the display lists are
			not extruded.
			"""
		),
		int.IN(
			"format",
			"""
			the format to use in the display lists. When format is #FONT_LINES, the {@code wglUseFontOutlines} function creates fonts with line
			segments. When format is #FONT_POLYGONS, {@code wglUseFontOutlines} creates fonts with polygons.
			""",
			"#FONT_LINES #FONT_POLYGONS"
		),
		Check("count * GLYPHMETRICSFLOAT.SIZEOF") _ nullable _ LPGLYPHMETRICSFLOAT.OUT(
			"glyphMetrics",
			"""
			an array of {@code count} ##GLYPHMETRICSFLOAT structures that is to receive the metrics of the glyphs. When {@code glyphMetrics} is $NULL, no
			glyph metrics are returned.
			"""
		)
	)
}