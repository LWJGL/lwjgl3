/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 */
package org.lwjgl.stb.templates

import org.lwjgl.generator.*
import org.lwjgl.stb.*

val stb_truetype = "STBTruetype".nativeClass(packageName = STB_PACKAGE, prefix = "STBTT", prefixMethod = "stbtt_") {
	includeSTBAPI(
		"""#define STB_TRUETYPE_IMPLEMENTATION
#define STBTT_STATIC
#include "stb_rect_pack.h"
#include "stb_truetype.h"""")

	documentation =
		"""
		Native bindings to stb_truetype.h from the <a href="https://github.com/nothings/stb">stb library</a>.

		This library processes TrueType files:
		${ul(
			"parse files",
			"extract glyph metrics",
			"extract glyph shapes",
			"render glyphs to one-channel bitmaps with antialiasing (box filter)"
		)}

		<h3>ADDITIONAL DOCUMENTATION</h3>
		Some important concepts to understand to use this library:

		<b>Codepoint</b>

		Characters are defined by unicode codepoints, e.g. 65 is uppercase A, 231 is lowercase c with a cedilla, 0x7e30 is the hiragana for "ma".

		<b>Glyph</b>

		A visual character shape (every codepoint is rendered as some glyph)

		<b>Glyph index</b>

		A font-specific integer ID representing a glyph

		<b>Baseline</b>

		Glyph shapes are defined relative to a baseline, which is the bottom of uppercase characters. Characters extend both above and below the baseline.

		<b>Current Point</b>

		As you draw text to the screen, you keep track of a "current point" which is the origin of each character. The current point's vertical position is the
		baseline. Even "baked fonts" use this model.

		<b>Vertical Font Metrics</b>

		The vertical qualities of the font, used to vertically position and space the characters. See docs for #GetFontVMetrics().

		<b>Font Size in Pixels or Points</b>

		The preferred interface for specifying font sizes in stb_truetype is to specify how tall the font's vertical extent should be in pixels. If that sounds
		good enough, skip the next paragraph.

		Most font APIs instead use "points", which are a common typographic measurement for describing font size, defined as 72 points per inch. stb_truetype
		provides a point API for compatibility. However, true "per inch" conventions don't make much sense on computer displays since different monitors have
		different number of pixels per inch. For example, Windows traditionally uses a convention that there are 96 pixels per inch, thus making 'inch'
		measurements have nothing to do with inches, and thus effectively defining a point to be 1.333 pixels. Additionally, the TrueType font data provides an
		explicit scale factor to scale a given font's glyphs to points, but the author has observed that this scale factor is often wrong for non-commercial
		fonts, thus making fonts scaled in points according to the TrueType spec incoherently sized in practice.

		<h3>ADVANCED USAGE</h3>
		
		Quality:
		${ul(
			"""
			Use the functions with Subpixel at the end to allow your characters to have subpixel positioning. Since the font is anti-aliased, not hinted, this
			is very important for quality. (This is not possible with baked fonts.)
			""",
			"Kerning is now supported, and if you're supporting subpixel rendering then kerning is worth using to give your text a polished look."
		)}
		Performance:
		${ul(
			"""
			Convert Unicode codepoints to glyph indexes and operate on the glyphs; if you don't do this, stb_truetype is forced to do the conversion on every
			call.
			""",
			"""
		    There are a lot of memory allocations. We should modify it to take a temp buffer and allocate from the temp buffer (without freeing), should help
		    performance a lot.
		    """
		)}

		<h3>NOTES</h3>

		The system uses the raw data found in the .ttf file without changing it and without building auxiliary data structures. This is a bit inefficient on
		little-endian systems (the data is big-endian), but assuming you're caching the bitmaps or glyph shapes this shouldn't be a big deal.

		It appears to be very hard to programmatically determine what font a given file is in a general way. I provide an API for this, but I don't recommend
		it.

		<h3>SAMPLE PROGRAMS</h3>

		Incomplete text-in-3d-api example, which draws quads properly aligned to be lossless:
		${codeBlock(
			"""
unsigned char ttf_buffer[1<<20];
unsigned char temp_bitmap[512*512];

stbtt_bakedchar cdata[96]; // ASCII 32..126 is 95 glyphs
GLuint ftex;

void my_stbtt_initfont(void)
{
   fread(ttf_buffer, 1, 1<<20, fopen("c:/windows/fonts/times.ttf", "rb"));
   stbtt_BakeFontBitmap(ttf_buffer,0, 32.0, temp_bitmap,512,512, 32,96, cdata); // no guarantee this fits!
   // can free ttf_buffer at this point
   glGenTextures(1, &ftex);
   glBindTexture(GL_TEXTURE_2D, ftex);
   glTexImage2D(GL_TEXTURE_2D, 0, GL_ALPHA, 512,512, 0, GL_ALPHA, GL_UNSIGNED_BYTE, temp_bitmap);
   // can free temp_bitmap at this point
   glTexParameteri(GL_TEXTURE_2D, GL_TEXTURE_MIN_FILTER, GL_LINEAR);
}

void my_stbtt_print(float x, float y, char *text)
{
   // assume orthographic projection with units = screen pixels, origin at top left
   glEnable(GL_TEXTURE_2D);
   glBindTexture(GL_TEXTURE_2D, ftex);
   glBegin(GL_QUADS);
   while (*text) {
      if (*text >= 32 && *text < 128) {
         stbtt_aligned_quad q;
         stbtt_GetBakedQuad(cdata, 512,512, *text-32, &x,&y,&q,1);//1=opengl & d3d10+,0=d3d9
         glTexCoord2f(q.s0,q.t1); glVertex2f(q.x0,q.y0);
         glTexCoord2f(q.s1,q.t1); glVertex2f(q.x1,q.y0);
         glTexCoord2f(q.s1,q.t0); glVertex2f(q.x1,q.y1);
         glTexCoord2f(q.s0,q.t0); glVertex2f(q.x0,q.y1);
      }
      ++text;
   }
   glEnd();
}""")}
		Complete program (this compiles): get a single bitmap, print as ASCII art:
		${codeBlock(
			"""
char ttf_buffer[1<<25];

int main(int argc, char **argv)
{
   stbtt_fontinfo font;
   unsigned char *bitmap;
   int w,h,i,j,c = (argc > 1 ? atoi(argv[1]) : 'a'), s = (argc > 2 ? atoi(argv[2]) : 20);

   fread(ttf_buffer, 1, 1<<25, fopen(argc > 3 ? argv[3] : "c:/windows/fonts/arialbd.ttf", "rb"));

   stbtt_InitFont(&font, ttf_buffer, stbtt_GetFontOffsetForIndex(ttf_buffer,0));
   bitmap = stbtt_GetCodepointBitmap(&font, 0,stbtt_ScaleForPixelHeight(&font, s), c, &w, &h, 0,0);

   for (j=0; j < h; ++j) {
      for (i=0; i < w; ++i)
         putchar(" .:ioVM@"[bitmap[j*w+i]>>5]);
      putchar('\n');
   }
   return 0;
}""")}
		Complete program: print "Hello World!" banner, with bugs:
		${codeBlock(
			"""
char buffer[24<<20];
unsigned char screen[20][79];

int main(int arg, char **argv)
{
   stbtt_fontinfo font;
   int i,j,ascent,baseline,ch=0;
   float scale, xpos=2; // leave a little padding in case the character extends left
   char *text = "Heljo World!";

   fread(buffer, 1, 1000000, fopen("c:/windows/fonts/arialbd.ttf", "rb"));
   stbtt_InitFont(&font, buffer, 0);

   scale = stbtt_ScaleForPixelHeight(&font, 15);
   stbtt_GetFontVMetrics(&font, &ascent,0,0);
   baseline = (int) (ascent*scale);

   while (text[ch]) {
      int advance,lsb,x0,y0,x1,y1;
      float x_shift = xpos - (float) floor(xpos);
      stbtt_GetCodepointHMetrics(&font, text[ch], &advance, &lsb);
      stbtt_GetCodepointBitmapBoxSubpixel(&font, text[ch], scale,scale,x_shift,0, &x0,&y0,&x1,&y1);
      stbtt_MakeCodepointBitmapSubpixel(&font, &screen[baseline + y0][(int) xpos + x0], x1-x0,y1-y0, 79, scale,scale,x_shift,0, text[ch]);
      // note that this stomps the old data, so where character boxes overlap (e.g. 'lj') it's wrong
      // because this API is really for baking character bitmaps into textures. if you want to render
      // a sequence of characters, you really need to render each bitmap to a temp buffer, then
      // "alpha blend" that into the working buffer
      xpos += (advance * scale);
      if (text[ch+1])
         xpos += scale*stbtt_GetCodepointKernAdvance(&font, text[ch],text[ch+1]);
      ++ch;
   }

   for (j=0; j < 20; ++j) {
      for (i=0; i < 78; ++i)
         putchar(" .:ioVM@"[screen[j][i]>>5]);
      putchar('\n');
   }

   return 0;
}""")}
		<h3>Finding the right font...</h3>

		You should really just solve this offline, keep your own tables of what font is what, and don't try to get it out of the .ttf file. That's because
		getting it out of the .ttf file is really hard, because the names in the file can appear in many possible encodings, in many possible languages, and
		e.g. if you need a case-insensitive comparison, the details of that depend on the encoding & language in a complex way (actually underspecified in
		truetype, but also gigantic).

		But you can use the provided functions in two possible ways:
		${ul(
			"""
			#FindMatchingFont() will use *case-sensitive* comparisons on unicode-encoded names to try to find the font you want; you can run this before
			calling #InitFont()
			""",
			"""
		    #GetFontNameString() lets you get any of the various strings from the file yourself and do your own comparisons on them. You have to have called
		    #InitFont() first.
		    """
		)}
		"""

	// TEXTURE BAKING API

	int(
		"BakeFontBitmap",
		"""
		Bakes a font to a bitmap for use as texture.

		This uses a very simply packing, use with #GetBakedQuad().
		""",

		const _ unsigned_char_p.IN("data", "the font data"),
		Expression("0") _ int.IN("offset", "the font data offset, use 0 for plain .ttf files"),
		float.IN("pixel_height", "the font height, in pixels"),
		Check("pw * ph") _ unsigned_char_p.OUT("pixels", "a buffer in which to write the font bitmap"),
		int.IN("pw", "the bitmap width, in pixels"),
		int.IN("ph", "the bitmap height, in pixels"),
		int.IN("first_char", "the first character to bake"),
		AutoSize("chardata") _ int.IN("num_chars", "the number of characters to bake, starting at {@code first_char}"),
		stbtt_bakedchar_p.OUT("chardata", "an array of ##STBTTBakedChar structs, it's {@code num_chars} long"),

		returnDoc =
		"""
		if positive, the first unused row of the bitmap. If negative, returns the negative of the number of characters that fit. If 0, no characters fit and no
		rows were used.
		"""
	)

	void(
		"GetBakedQuad",
		"""
		Computes quad to draw for a given char and advances the current position.

		The coordinate system used assumes y increases downwards. Characters will extend both above and below the current position; see discussion of
		"BASELINE" above.
		""",

		Check("char_index + 1") _ stbtt_bakedchar_p.IN("chardata", "an array of ##STBTTBakedChar structs"),
		int.IN("pw", "the bitmap width, in pixels"),
		int.IN("ph", "the bitmap height, in pixels"),
		int.IN("char_index", "the character index in the {@code chardata} array"),
		Check(1) _ float_p.INOUT("xpos", "the current x position, in screen pixel space"),
		Check(1) _ float_p.INOUT("ypos", "the current y position, in screen pixel space"),
		stbtt_aligned_quad_p.IN("q", "an ##STBTTAlignedQuad struct in which to return the quad to draw"),
		int.IN("opengl_fillrule", "1 if opengl fill rule; 0 if DX9 or earlier")
	)

	// NEW TEXTURE BAKING API

	int(
		"PackBegin",
		"""
		Initializes a packing context stored in the passed-in {@code stbtt_pack_context}. Future calls using this context will pack characters into the bitmap
		passed in here: a 1-channel bitmap that is width x height.
		""",

		stbtt_pack_context_p.IN("spc", "an ##STBTTPackContext struct"),
		Check("width * height") _ unsigned_char_p.OUT(
			"pixels",
			"a buffer in which to store the bitmap data"
		),
		int.IN("width", "the bitmap width, in pixels"),
		int.IN("height", "the bitmap height, in pixels"),
		int.IN("stride_in_bytes", "the distance from one row to the next (or 0 to mean they are packed tightly together)"),
		int.IN(
			"padding",
			"the amount of padding to leave between each character (normally you want '1' for bitmaps you'll use as textures with bilinear filtering)"
		),
		Expression("0L") _ nullable _ void_p.IN("alloc_context", "a pointer to an allocation context"),

		returnDoc = "1 on success, 0 on failure"
	)

	void(
		"PackEnd",
		"Cleans up the packing context and frees all memory.",

		stbtt_pack_context_p.IN("spc", "an ##STBTTPackContext struct")
	)

	int(
		"STBTT_POINT_SIZE",
		"""
		Converts the full height of a character from ascender to descender, as computed by #ScaleForPixelHeight(), to a point size as computed by
		#ScaleForMappingEmToPixels().
		""",

		int.IN("font_size", "the full height of a character"),

		returnDoc = "the point size of the character",
		noPrefix = true
	)

	int(
		"PackFontRange",
		"""
		Creates character bitmaps from the {@code font_index}'th font found in fontdata (use {@code font_index=0} if you don't know what that is). It creates
		{@code num_chars_in_range} bitmaps for characters with unicode values starting at {@code first_unicode_char_in_range} and increasing. Data for how to
		render them is stored in {@code chardata_for_range}; pass these to #GetPackedQuad() to get back renderable quads.
		""",

		stbtt_pack_context_p.IN("spc", "an ##STBTTPackContext struct"),
		unsigned_char_p.IN("fontdata", "the font data"),
		int.IN("font_index", "the font index (use 0 if you don't know what that is"),
		float.IN(
			"font_size",
			"""
			the full height of the character from ascender to descender, as computed by #ScaleForPixelHeight(). To use a point size as computed by
			#ScaleForMappingEmToPixels(), wrap the font size in ##STBTT_POINT_SIZE() and pass the result, i.e.:
			${codeBlock("""
...,                  20 , ... // font max minus min y is 20 pixels tall
..., STBTT_POINT_SIZE(20), ... // 'M' is 20 pixels tall""")}
			"""
		),
		int.IN("first_unicode_char_in_range", "the first unicode code point in the range"),
		AutoSize("chardata_for_range") _ int.IN("num_chars_in_range", "the number of unicode code points in the range"),
		stbtt_packedchar_p.OUT("chardata_for_range", "an array of ##STBTTPackedchar structs"),

		returnDoc = "1 on success, 0 on failure"
	)

	int(
		"PackFontRanges",
		"""
		Creates character bitmaps from multiple ranges of characters stored in ranges. This will usually create a better-packed bitmap than multiple calls to
		#PackFontRange().
		""",

		stbtt_pack_context_p.IN("spc", "an ##STBTTPackContext struct"),
		unsigned_char_p.IN("fontdata", "the font data"),
		int.IN("font_index", "the font index (use 0 if you don't know what that is"),
		stbtt_pack_range_p.OUT("ranges", "an array of ##STBTTPackRange structs"),
		AutoSize("ranges") _ int.IN("num_ranges", "the number of ##STBTTPackRange structs in {@code ranges}"),

		returnDoc = "1 on success, 0 on failure"
	)

	void(
		"PackSetOversampling",
		"""
		Oversampling a font increases the quality by allowing higher-quality subpixel positioning, and is especially valuable at smaller text sizes.

		This function sets the amount of oversampling for all following calls to #PackFontRange(). The default (no oversampling) is achieved by
		{@code h_oversample=1, v_oversample=1}. The total number of pixels required is {@code h_oversample*v_oversample} larger than the default; for example,
		2x2 oversampling requires 4x the storage of 1x1. For best results, render oversampled textures with bilinear filtering. Look at the readme in
		<a href="https://github.com/nothings/stb/blob/master/tests/oversample/README.md">stb/tests/oversample</a> for information about oversampled fonts.
		""",

		stbtt_pack_context_p.IN("spc", "an ##STBTTPackContext struct"),
		unsigned_int.IN("h_oversample", "the horizontal oversampling amount"),
		unsigned_int.IN("v_oversample", "the vertical oversampling amount")
	)

	void(
		"GetPackedQuad",
		"""
		Computes quad to draw for a given char and advances the current position.

		The coordinate system used assumes y increases downwards. Characters will extend both above and below the current position; see discussion of
		"BASELINE" above.
		""",

		Check("char_index + 1") _ stbtt_packedchar_p.IN("chardata", "an array of ##STBTTPackedchar structs"),
		int.IN("pw", "the bitmap width, in pixels"),
		int.IN("ph", "the bitmap height, in pixels"),
		int.IN("char_index", "the character index in the {@code chardata} array"),
		Check(1) _ float_p.INOUT("xpos", "the current x position, in screen pixel space"),
		Check(1) _ float_p.INOUT("ypos", "the current y position, in screen pixel space"),
		stbtt_aligned_quad_p.OUT("q", "an ##STBTTAlignedQuad struct in which to return the quad to draw"),
		int.IN("align_to_integer", "1 to align the quad to integer coordinates")
	)

	// FONT LOADING

	int(
		"GetFontOffsetForIndex",
		"""
		Each .ttf/.ttc file may have more than one font. Each font has a sequential index number starting from 0. Call this function to get the font offset for
		a given index; it returns -1 if the index is out of range. A regular .ttf file will only define one font and it always be at offset 0, so it will
		return '0' for index 0, and -1 for all other indices. You can just skip this step if you know it's that kind of font.
		""",

		const _ unsigned_char_p.IN("data", "the font data"),
		int.IN("index", "the font index")
	)

	int(
		"InitFont",
		"""
		Given an offset into the file that defines a font, this function builds the necessary cached info for the rest of the system. You must allocate the
		##STBTTFontinfo yourself, and stbtt_InitFont will fill it out. You don't need to do anything special to free it, because the contents are pure value
		data with no additional data structures.
		""",

		stbtt_fontinfo_p.IN("info", "an ##STBTTFontinfo struct"),
		const _ unsigned_char_p.IN("data", "the font data"),
		Expression("0") _ int.IN("offset", "the font data offset"),

		returnDoc = "1 on success, 0 on failure"
	)

	// CHARACTER TO GLYPH-INDEX CONVERSION

	int(
		"FindGlyphIndex",
		"""
		If you're going to perform multiple operations on the same character and you want a speed-up, call this function with the character you're going to
		process, then use glyph-based functions instead of the codepoint-based functions.
		""",

		const _ stbtt_fontinfo_p.IN("info", "an ##STBTTFontinfo struct"),
		int.IN("unicode_codepoint", "the unicode code point"),

		returnDoc = "the glyph index"
	)

	// CHARACTER PROPERTIES

	float(
		"ScaleForPixelHeight",
		"""
		Computes a scale factor to produce a font whose "height" is {@code pixels} tall. Height is measured as the distance from the highest ascender to the
		lowest descender; in other words, it's equivalent to calling #GetFontVMetrics() and computing:
		${codeBlock("scale = pixels / (ascent - descent)")}
		so if you prefer to measure height by the ascent only, use a similar calculation.
		""",

		const _ stbtt_fontinfo_p.IN("info", "an ##STBTTFontinfo struct"),
		float.IN("pixels", "the font height, in pixels"),

		returnDoc = "the scale factor"
	)

	float(
		"ScaleForMappingEmToPixels",
		"""
		Computes a scale factor to produce a font whose EM size is mapped to {@code pixels} tall. This is probably what traditional APIs compute, but I'm not
		positive.
		""",

		const _ stbtt_fontinfo_p.IN("info", "an ##STBTTFontinfo struct"),
		float.IN("pixels", "the font height, in pixels"),

		returnDoc = "the scale factor"
	)

	void(
		"GetFontVMetrics",
		"""
		Returns vertical metrics for the specified font. You should advance the vertical position by {@code *ascent - *descent + *lineGap}

		The returned values are expressed in unscaled coordinates, so you must multiply by the scale factor for a given size.
		""",

		const _ stbtt_fontinfo_p.IN("info", "an ##STBTTFontinfo struct"),
		Check(1) _ int_p.OUT("ascent", "returns the coordinate above the baseline the font extends"),
		Check(1) _ int_p.OUT("descent", "returns the coordinate below the baseline the font extends (i.e. it is typically negative)"),
		Check(1) _ int_p.OUT("lineGap", "returns the spacing between one row's descent and the next row's ascent")
	)

	void(
		"GetFontBoundingBox",
		"Returns the bounding box around all possible characters.",

		const _ stbtt_fontinfo_p.IN("info", "an ##STBTTFontinfo struct"),
		Check(1) _ int_p.OUT("x0", "the left coordinate"),
		Check(1) _ int_p.OUT("y0", "the bottom coordinate"),
		Check(1) _ int_p.OUT("x1", "the right coordinate"),
		Check(1) _ int_p.OUT("y1", "the top coordinate")
	)

	void(
		"GetCodepointHMetrics",
		"""
		Returns horizontal metrics for the specified codepoint.

		The returned values are expressed in unscaled coordinates.
		""",

		const _ stbtt_fontinfo_p.IN("info", "an ##STBTTFontinfo struct"),
		int.IN("codepoint", "the unicode codepoint"),
		Check(1) _ int_p.OUT("advanceWidth", "the offset from the current horizontal position to the next horizontal position"),
		Check(1) _ int_p.OUT("leftSideBearing", "the offset from the current horizontal position to the left edge of the character")
	)

	int(
		"GetCodepointKernAdvance",
		"Returns the additional amount to add to the {@code advance} value between {@code ch1} and {@code ch2}.",

		const _ stbtt_fontinfo_p.IN("info", "an ##STBTTFontinfo struct"),
		int.IN("ch1", "the first unicode codepoint"),
		int.IN("ch2", "the second unicode codepoint")
	)

	int(
		"GetCodepointBox",
		"Gets the bounding box of the visible part of the glyph, in unscaled coordinates.",

		const _ stbtt_fontinfo_p.IN("info", "an ##STBTTFontinfo struct"),
		int.IN("codepoint", "the unicode codepoint"),
		Check(1) _ int_p.OUT("x0", "returns the left coordinate"),
		Check(1) _ int_p.OUT("y0", "returns the bottom coordinate"),
		Check(1) _ int_p.OUT("x1", "returns the right coordinate"),
		Check(1) _ int_p.OUT("y1", "returns the top coordinate")
	)

	void(
		"GetGlyphHMetrics",
		"Glyph version of #GetCodepointHMetrics(), for greater efficiency.",

		const _ stbtt_fontinfo_p.IN("info", "an ##STBTTFontinfo struct"),
		int.IN("glyph_index", "the glyph index"),
		Check(1) _ int_p.OUT("advanceWidth", "the offset from the current horizontal position to the next horizontal position"),
		Check(1) _ int_p.OUT("leftSideBearing", "the offset from the current horizontal position to the left edge of the character")
	)

	int(
		"GetGlyphKernAdvance",
		"Glyph version of #GetCodepointKernAdvance(), for greater efficiency.",

		const _ stbtt_fontinfo_p.IN("info", "an ##STBTTFontinfo struct"),
		int.IN("glyph1", "the first glyph index"),
		int.IN("glyph2", "the second glyph index")
	)

	int(
		"GetGlyphBox",
		"Glyph version of #GetCodepointBox(), for greater efficiency.",

		const _ stbtt_fontinfo_p.IN("info", "an ##STBTTFontinfo struct"),
		int.IN("glyph_index", "the glyph index"),
		Check(1) _ int_p.OUT("x0", "returns the left coordinate"),
		Check(1) _ int_p.OUT("y0", "returns the bottom coordinate"),
		Check(1) _ int_p.OUT("x1", "returns the right coordinate"),
		Check(1) _ int_p.OUT("y1", "returns the top coordinate")
	)

	// GLYPH SHAPES

	ByteConstant(
		"Vertex type.",

		"vmove" _ 1.b,
		"vline" _ 2.b,
		"vcurve" _ 3.b
	)

	int(
		"IsGlyphEmpty",
		"Returns non-zero if nothing is drawn for this glyph.",

		const _ stbtt_fontinfo_p.IN("info", "an ##STBTTFontinfo struct"),
		int.IN("glyph_index", "the glyph index")
	)

	int(
		"GetCodepointShape",
		"""
		Returns number of vertices and fills {@code *vertices} with the pointer to them

		The shape is a series of countours. Each one starts with a #vmove, then consists of a series of mixed #vline and #vcurve segments. A #vline draws a
		line from previous endpoint to its {@code x,y}; a #vcurve draws a quadratic bezier from previous endpoint to its {@code x,y}, using {@code cx,cy} as
		the bezier control point.

		The ##STBTTVertex values are expressed in "unscaled" coordinates.
		""",

		const _ stbtt_fontinfo_p.IN("info", "an ##STBTTFontinfo struct"),
		int.IN("unicode_codepoint", "the unicode codepoint"),
		Check(1) _ stbtt_vertex_pp.OUT("vertices", "returns a pointer to an array of ##STBTTVertex structs")
	)

	int(
		"GetGlyphShape",
		"Glyph version of #GetCodepointShape(), for greater efficiency.",

		const _ stbtt_fontinfo_p.IN("info", "an ##STBTTFontinfo struct"),
		int.IN("glyph_index", "the unicode codepoint"),
		stbtt_vertex_pp.OUT("vertices", "returns a pointer to an array of ##STBTTVertex structs")
	)

	void(
		"FreeShape",
		"Frees the data allocated by #GetCodepointShape() and #GetGlyphShape().",

		const _ stbtt_fontinfo_p.IN("info", "an ##STBTTFontinfo struct"),
		stbtt_vertex_p.OUT("vertices", "the array of ##STBTTVertex structs to free")
	)

	// BITMAP RENDERING

	void(
		"FreeBitmap",
		"Frees a bitmap allocated by #GetCodepointBitmap(), #GetCodepointBitmapSubpixel(), #GetGlyphBitmap() or #GetGlyphBitmapSubpixel().",

		unsigned_char_p.IN("bitmap", "the bitmap to free"),
		void_p.IN("userdata", "a pointer to user data")
	)

	unsigned_char_p(
		"GetCodepointBitmap",
		"Allocates a large-enough single-channel 8bpp bitmap and renders the specified character/glyph at the specified scale into it, with antialiasing.",

		const _ stbtt_fontinfo_p.IN("info", "an ##STBTTFontinfo struct"),
		float.IN("scale_x", "the horizontal scale"),
		float.IN("scale_y", "the vertical scale"),
		int.IN("codepoint", "the unicode codepoint to render"),
		Check(1) _ autoSizeResult _ int_p.OUT("width", "returns the bitmap width"),
		Check(1) _ autoSizeResult _ int_p.OUT("height", "returns the bitmap height"),
		Check(1) _ int_p.OUT("xoff", "returns the horizontal offset in pixel space from the glyph origin to the left of the bitmap"),
		Check(1) _ int_p.OUT("yoff", "returns the vertical offset in pixel space from the glyph origin to the top of the bitmap")
	)

	unsigned_char_p(
		"GetCodepointBitmapSubpixel",
		"Same as #GetCodepointBitmap(), but you can specify a subpixel shift for the character.",

		const _ stbtt_fontinfo_p.IN("info", "an ##STBTTFontinfo struct"),
		float.IN("scale_x", "the horizontal scale"),
		float.IN("scale_y", "the vertical scale"),
		float.IN("shift_x", "the horizontal subpixel shift"),
		float.IN("shift_y", "the vertical subpixel shift"),
		int.IN("codepoint", "the unicode codepoint to render"),
		Check(1) _ autoSizeResult _ int_p.OUT("width", "returns the bitmap width"),
		Check(1) _ autoSizeResult _ int_p.OUT("height", "returns the bitmap height"),
		Check(1) _ int_p.OUT("xoff", "returns the horizontal offset in pixel space from the glyph origin to the left of the bitmap"),
		Check(1) _ int_p.OUT("yoff", "returns the vertical offset in pixel space from the glyph origin to the top of the bitmap")
	)

	void(
		"MakeCodepointBitmap",
		"""
		Same as #GetCodepointBitmap(), but you pass in storage for the bitmap in the form of {@code output}, with row spacing of {@code out_stride} bytes. The
		bitmap is clipped to {@code out_w/out_h} bytes. Call #GetCodepointBitmapBox() to get the width and height and positioning info for it first.
		""",

		const _ stbtt_fontinfo_p.IN("info", "an ##STBTTFontinfo struct"),
		Check("out_w * out_h") _ unsigned_char_p.OUT("output", "the bitmap storage"),
		int.IN("out_w", "the bitmap width"),
		int.IN("out_h", "the bitmap height"),
		int.IN("out_stride", "the row stride, in bytes"),
		float.IN("scale_x", "the horizontal scale"),
		float.IN("scale_y", "the vertical scale"),
		int.IN("codepoint", "the unicode codepoint to render")
	)

	void(
		"MakeCodepointBitmapSubpixel",
		"Same as #MakeCodepointBitmap(), but you can specify a subpixel shift for the character.",

		const _ stbtt_fontinfo_p.IN("info", "an ##STBTTFontinfo struct"),
		Check("out_w * out_h") _ unsigned_char_p.OUT("output", "the bitmap storage"),
		int.IN("out_w", "the bitmap width"),
		int.IN("out_h", "the bitmap height"),
		int.IN("out_stride", "the row stride, in bytes"),
		float.IN("scale_x", "the horizontal scale"),
		float.IN("scale_y", "the vertical scale"),
		float.IN("shift_x", "the horizontal subpixel shift"),
		float.IN("shift_y", "the vertical subpixel shift"),
		int.IN("codepoint", "the unicode codepoint to render")
	)

	void(
		"GetCodepointBitmapBox",
		"""
		Get the bbox of the bitmap centered around the glyph origin; so the bitmap width is {@code ix1-ix0}, height is {@code iy1-iy0}, and location to place
		the bitmap top left is {@code (leftSideBearing*scale,iy0)}.

		Note that the bitmap uses y-increases-down, but the shape uses y-increases-up, so {@code CodepointBitmapBox} and {@code CodepointBox} are inverted.
		""",

		const _ stbtt_fontinfo_p.IN("font", "an ##STBTTFontinfo struct"),
		int.IN("codepoint", "the unicode codepoint"),
		float.IN("scale_x", "the horizontal scale"),
		float.IN("scale_y", "the vertical scale"),
		Check(1) _ int_p.OUT("ix0", "returns the left coordinate"),
		Check(1) _ int_p.OUT("iy0", "returns the bottom coordinate"),
		Check(1) _ int_p.OUT("ix1", "returns the right coordinate"),
		Check(1) _ int_p.OUT("iy1", "returns the top coordinate")
	)

	void(
		"GetCodepointBitmapBoxSubpixel",
		"Same as #GetCodepointBitmapBox(), but you can specify a subpixel shift for the character.",

		const _ stbtt_fontinfo_p.IN("font", "an ##STBTTFontinfo struct"),
		int.IN("codepoint", "the unicode codepoint"),
		float.IN("scale_x", "the horizontal scale"),
		float.IN("scale_y", "the vertical scale"),
		float.IN("shift_x", "the horizontal subpixel shift"),
		float.IN("shift_y", "the vertical subpixel shift"),
		Check(1) _ int_p.OUT("ix0", "returns the left coordinate"),
		Check(1) _ int_p.OUT("iy0", "returns the bottom coordinate"),
		Check(1) _ int_p.OUT("ix1", "returns the right coordinate"),
		Check(1) _ int_p.OUT("iy1", "returns the top coordinate")
	)

	unsigned_char_p(
		"GetGlyphBitmap",
		"Allocates a large-enough single-channel 8bpp bitmap and renders the specified character/glyph at the specified scale into it, with antialiasing.",

		const _ stbtt_fontinfo_p.IN("info", "an ##STBTTFontinfo struct"),
		float.IN("scale_x", "the horizontal scale"),
		float.IN("scale_y", "the vertical scale"),
		int.IN("glyph", "the glyph index to render"),
		Check(1) _ autoSizeResult _ int_p.OUT("width", "returns the bitmap width"),
		Check(1) _ autoSizeResult _ int_p.OUT("height", "returns the bitmap height"),
		Check(1) _ int_p.OUT("xoff", "returns the horizontal offset in pixel space from the glyph origin to the left of the bitmap"),
		Check(1) _ int_p.OUT("yoff", "returns the vertical offset in pixel space from the glyph origin to the top of the bitmap")
	)

	unsigned_char_p(
		"GetGlyphBitmapSubpixel",
		"Same as #GetGlyphBitmap(), but you can specify a subpixel shift for the character.",

		const _ stbtt_fontinfo_p.IN("info", "an ##STBTTFontinfo struct"),
		float.IN("scale_x", "the horizontal scale"),
		float.IN("scale_y", "the vertical scale"),
		float.IN("shift_x", "the horizontal subpixel shift"),
		float.IN("shift_y", "the vertical subpixel shift"),
		int.IN("glyph", "the glyph index to render"),
		Check(1) _ autoSizeResult _ int_p.OUT("width", "returns the bitmap width"),
		Check(1) _ autoSizeResult _ int_p.OUT("height", "returns the bitmap height"),
		Check(1) _ int_p.OUT("xoff", "returns the horizontal offset in pixel space from the glyph origin to the left of the bitmap"),
		Check(1) _ int_p.OUT("yoff", "returns the vertical offset in pixel space from the glyph origin to the top of the bitmap")
	)

	void(
		"MakeGlyphBitmap",
		"""
		Same as #GetGlyphBitmap(), but you pass in storage for the bitmap in the form of {@code output}, with row spacing of {@code out_stride} bytes. The
		bitmap is clipped to {@code out_w/out_h} bytes. Call #GetGlyphBitmapBox() to get the width and height and positioning info for it first.
		""",

		const _ stbtt_fontinfo_p.IN("info", "an ##STBTTFontinfo struct"),
		Check("out_w * out_h") _ unsigned_char_p.OUT("output", "the bitmap storage"),
		int.IN("out_w", "the bitmap width"),
		int.IN("out_h", "the bitmap height"),
		int.IN("out_stride", "the row stride, in bytes"),
		float.IN("scale_x", "the horizontal scale"),
		float.IN("scale_y", "the vertical scale"),
		int.IN("glyph", "the glyph index to render")
	)

	void(
		"MakeGlyphBitmapSubpixel",
		"Same as #MakeGlyphBitmap(), but you can specify a subpixel shift for the character.",

		const _ stbtt_fontinfo_p.IN("info", "an ##STBTTFontinfo struct"),
		Check("out_w * out_h") _ unsigned_char_p.OUT("output", "the bitmap storage"),
		int.IN("out_w", "the bitmap width"),
		int.IN("out_h", "the bitmap height"),
		int.IN("out_stride", "the row stride, in bytes"),
		float.IN("scale_x", "the horizontal scale"),
		float.IN("scale_y", "the vertical scale"),
		float.IN("shift_x", "the horizontal subpixel shift"),
		float.IN("shift_y", "the vertical subpixel shift"),
		int.IN("glyph", "the glyph index to render")
	)

	void(
		"GetGlyphBitmapBox",
		"""
		Get the bbox of the bitmap centered around the glyph origin; so the bitmap width is {@code ix1-ix0}, height is {@code iy1-iy0}, and location to place
		the bitmap top left is {@code (leftSideBearing*scale,iy0)}.

		Note that the bitmap uses y-increases-down, but the shape uses y-increases-up, so {@code GlyphBitmapBox} and {@code GlyphBox} are inverted.
		""",

		const _ stbtt_fontinfo_p.IN("font", "an ##STBTTFontinfo struct"),
		int.IN("glyph", "the glyph index"),
		float.IN("scale_x", "the horizontal scale"),
		float.IN("scale_y", "the vertical scale"),
		Check(1) _ int_p.OUT("ix0", "returns the left coordinate"),
		Check(1) _ int_p.OUT("iy0", "returns the bottom coordinate"),
		Check(1) _ int_p.OUT("ix1", "returns the right coordinate"),
		Check(1) _ int_p.OUT("iy1", "returns the top coordinate")
	)

	void(
		"GetGlyphBitmapBoxSubpixel",
		"Same as #GetGlyphBitmapBox(), but you can specify a subpixel shift for the character.",

		const _ stbtt_fontinfo_p.IN("font", "an ##STBTTFontinfo struct"),
		int.IN("glyph", "the glyph index"),
		float.IN("scale_x", "the horizontal scale"),
		float.IN("scale_y", "the vertical scale"),
		float.IN("shift_x", "the horizontal subpixel shift"),
		float.IN("shift_y", "the vertical subpixel shift"),
		Check(1) _ int_p.OUT("ix0", "returns the left coordinate"),
		Check(1) _ int_p.OUT("iy0", "returns the bottom coordinate"),
		Check(1) _ int_p.OUT("ix1", "returns the right coordinate"),
		Check(1) _ int_p.OUT("iy1", "returns the top coordinate")
	)

	/*
	void(
		"stbtt_Rasterize",
		"",

		stbtt__bitmap_p.OUT("result", ""),
		float.IN("flatness_in_pixels", ""),
		stbtt_vertex_p.OUT("vertices", ""),
		int.IN("num_verts", ""),
		float.IN("scale_x", ""),
		float.IN("scale_y", ""),
		float.IN("shift_x", ""),
		float.IN("shift_y", ""),
		int.IN("x_off", ""),
		int.IN("y_off", ""),
		int.IN("invert", ""),
		void_p.OUT("userdata", "")
	)
	*/

	// Finding the right font...

	val StyleFlags = IntConstant(
		"Style flags, use in #FindMatchingFont().",

		"MACSTYLE_DONTCARE" _ 0,
		"MACSTYLE_BOLD" _ 1,
		"MACSTYLE_ITALIC" _ 2,
		"MACSTYLE_UNDERSCORE" _ 4,
		"MACSTYLE_NONE" _ 8
	).javaDocLinks

	val PlatformIDs = IntConstant(
		"Platform IDs.",

		"PLATFORM_ID_UNICODE" _ 0,
		"PLATFORM_ID_MAC" _ 1,
		"PLATFORM_ID_ISO" _ 2,
		"PLATFORM_ID_MICROSOFT" _ 3
	).javaDocLinks

	val EncodingIDsUnicode = IntConstant(
		"Encoding IDs for #PLATFORM_ID_UNICODE.",

		"UNICODE_EID_UNICODE_1_0" _ 0,
		"UNICODE_EID_UNICODE_1_1" _ 1,
		"UNICODE_EID_ISO_10646" _ 2,
		"UNICODE_EID_UNICODE_2_0_BMP" _ 3,
		"UNICODE_EID_UNICODE_2_0_FULL" _ 4
	).javaDocLinks

	val EncodingIDsMicrosoft = IntConstant(
		"Encoding IDs for #PLATFORM_ID_MICROSOFT.",

		"MS_EID_SYMBOL" _ 0,
		"MS_EID_UNICODE_BMP" _ 1,
		"MS_EID_SHIFTJIS" _ 2,
		"MS_EID_UNICODE_FULL" _ 10
	).javaDocLinks

	val EncodingIDsMac = IntConstant(
		"Encoding IDs for #PLATFORM_ID_MAC.",

		"MAC_EID_ROMAN" _ 0,
		"MAC_EID_JAPANESE" _ 1,
		"MAC_EID_CHINESE_TRAD" _ 2,
		"MAC_EID_KOREAN" _ 3,
		"MAC_EID_ARABIC" _ 4,
		"MAC_EID_HEBREW" _ 5,
		"MAC_EID_GREEK" _ 6,
		"MAC_EID_RUSSIAN" _ 7
	).javaDocLinks

	val LanguageIDsMicrosoft = IntConstant(
		"Language ID for #PLATFORM_ID_MICROSOFT.",

		"MS_LANG_ENGLISH" _ 0x0409,
		"MS_LANG_CHINESE" _ 0x0804,
		"MS_LANG_DUTCH" _ 0x0413,
		"MS_LANG_FRENCH" _ 0x040c,
		"MS_LANG_GERMAN" _ 0x0407,
		"MS_LANG_HEBREW" _ 0x040d,
		"MS_LANG_ITALIAN" _ 0x0410,
		"MS_LANG_JAPANESE" _ 0x0411,
		"MS_LANG_KOREAN" _ 0x0412,
		"MS_LANG_RUSSIAN" _ 0x0419,
		"MS_LANG_SPANISH" _ 0x0409,
		"MS_LANG_SWEDISH" _ 0x041D
	).javaDocLinks

	val LanguageIDsMac = IntConstant(
		"Language ID for #PLATFORM_ID_MAC.",

		"MAC_LANG_ENGLISH" _ 0,
		"MAC_LANG_ARABIC" _ 12,
		"MAC_LANG_DUTCH" _ 4,
		"MAC_LANG_FRENCH" _ 1,
		"MAC_LANG_GERMAN" _ 2,
		"MAC_LANG_HEBREW" _ 10,
		"MAC_LANG_ITALIAN" _ 3,
		"MAC_LANG_JAPANESE" _ 11,
		"MAC_LANG_KOREAN" _ 23,
		"MAC_LANG_RUSSIAN" _ 32,
		"MAC_LANG_SPANISH" _ 6,
		"MAC_LANG_SWEDISH" _ 5,
		"MAC_LANG_CHINESE_SIMPLIFIED" _ 33,
		"MAC_LANG_CHINESE_TRAD" _ 19
	).javaDocLinks

	int(
		"FindMatchingFont",
		"""
		Returns the offset (not index) of the font that matches, or -1 if none.

		If you use STBTT_MACSTYLE_DONTCARE, use a font name like "Arial Bold". If you use any other flag, use a font name like "Arial"; this checks the
		{@code macStyle} header field; I don't know if fonts set this consistently.
		""",

		const _ unsigned_char_p.IN("fontdata", "the font data"),
		const _ charUTF8_p.IN("name", "the font name"),
		int.IN("flags", "the style flags", StyleFlags)
	)

	int(
		"CompareUTF8toUTF16_bigendian",
		"""
		Returns 1/0 whether the first string interpreted as utf8 is identical to the second string interpreted as big-endian utf16... useful for strings
		returned from #GetFontNameString().
		""",

		const _ char_p.IN("s1", "the first string"),
		AutoSize("s1") _ int.IN("len1", "the length of the first string, in bytes"),
		const _ char_p.IN("s2", "the second string"),
		AutoSize("s2") _ int.IN("len2", "the length of the second string, in bytes")
	)

	(const _ char_p)(
		"GetFontNameString",
		"""
		Returns the string (which may be big-endian double byte, e.g. for unicode) and puts the length in bytes in {@code *length}.

		See the truetype spec:
		${ul(
			"""<a href="https://developer.apple.com/fonts/TrueType-Reference-Manual/RM06/Chap6name.html">TrueType Reference Manual - The 'name' table</a>""",
			"""<a href="http://www.microsoft.com/typography/otspec/name.htm">OpenType™ Specification - The Naming Table</a>"""
		)}
		""",

		const _ stbtt_fontinfo_p.IN("font", "an ##STBTTFontinfo struct"),
		autoSizeResult _ int_p.OUT("length", "returns the string length, in bytes"),
		int.IN("platformID", "the platform ID", PlatformIDs),
		int.IN("encodingID", "the encoding ID", "$EncodingIDsUnicode $EncodingIDsMicrosoft $EncodingIDsMac"),
		int.IN("languageID", "the language ID", "$LanguageIDsMicrosoft $LanguageIDsMac"),
		int.IN("nameID", "the name ID")
	)
}