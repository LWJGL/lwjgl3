/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 */
package org.lwjgl.stb.templates

import org.lwjgl.generator.*
import org.lwjgl.stb.*

val stb_easy_font = "STBEasyFont".nativeClass(packageName = STB_PACKAGE, prefix = "STB", prefixMethod = "stb_") {
	includeSTBAPI(
		"""#include <math.h>
#include "stb_easy_font.h"""")

	documentation =
		"""
		Native bindings to stb_easy_font.h from the <a href="https://github.com/nothings/stb">stb library</a>.

		Bitmap font for use in 3D APIs:
		${ul(
			"Easy-to-deploy",
			"reasonably compact",
			"extremely inefficient performance-wise",
			"crappy-looking",
			"ASCII-only"
		)}
		Intended for when you just want to get some text displaying in a 3D app as quickly as possible.

		Doesn't use any textures, instead builds characters out of quads.

		<h3>SAMPLE CODE</h3>

		Here's sample code for old OpenGL; it's a lot more complicated to make work on modern APIs, and that's your problem.
		${codeBlock("""
void print_string(float x, float y, char *text, float r, float g, float b)
{
	static char buffer[99999]; // ~500 chars
	int num_quads;

	num_quads = stb_easy_font_print(x, y, text, NULL, buffer, sizeof(buffer));

	glColor3f(r,g,b);
	glEnableClientState(GL_VERTEX_ARRAY);
	glVertexPointer(2, GL_FLOAT, 16, buffer);
	glDrawArrays(GL_QUADS, 0, num_quads*4);
	glDisableClientState(GL_VERTEX_ARRAY);
}""")}
	"""

	int(
		"easy_font_width",
		"Takes a string without newlines and returns the horizontal size.",

		charASCII_p.IN("text", "an ASCII string"),

		returnDoc = "the horizontal size, in pixels"
	)

	int(
		"easy_font_print",
		"""
		Takes a string (which can contain '\n') and fills out a vertex buffer with renderable data to draw the string. Output data assumes increasing x is
		rightwards, increasing y is downwards.

		The vertex data is divided into quads, i.e. there are four vertices in the vertex buffer for each quad.

		The vertices are stored in an interleaved format:
		${codeBlock("""
x:float
y:float
z:float
color:uint8[4]""")}
		You can ignore z and color if you get them from elsewhere. This format was chosen in the hopes it would make it easier for you to reuse existing
		buffer-drawing code.

		If you pass in $NULL for color, it becomes {@code 255,255,255,255}.

		If the buffer isn't large enough, it will truncate. Expect it to use an average of ~270 bytes per character.

		If your API doesn't draw quads, build a reusable index list that allows you to render quads as indexed triangles.
		""",

		float.IN("x", "the x offset"),
		float.IN("y", "the y offset"),
		charASCII_p.IN("text", "an ASCII string"),
		nullable _ Check(4) _ unsigned_char_p.IN("color", "the text color, in RGBA (4 bytes)"),
		void_p.OUT("vertex_buffer", "a pointer to memory in which to store the vertex data"),
		AutoSize("vertex_buffer") _ int.IN("vbuf_size", "the {@code vertex_buffer} size, in bytes"),

		returnDoc = "the number of quads"
	)

	void(
		"easy_font_spacing",
		"""
		Use positive values to expand the space between characters, and small negative values (no smaller than {@code -1.5}) to contract the space between characters.

		E.g. {@code spacing = 1} adds one "pixel" of spacing between the characters. {@code spacing = -1} is reasonable but feels a bit too compact to me;
		{@code -0.5} is a reasonable compromise as long as you're scaling the font up.
		""",

		float.IN("spacing", "the font spacing")
	)
}