/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package stb.templates

import org.lwjgl.generator.*
import stb.*

val stb_easy_font = "STBEasyFont".nativeClass(Module.STB, prefix = "STB", prefixMethod = "stb_") {
    includeSTBAPI("#include \"stb_easy_font.h\"")

    documentation =
        """
        Native bindings to stb_easy_font.h from the ${url("https://github.com/nothings/stb", "stb library")}.

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
        "Takes a string and returns the horizontal size.",

        Input..charASCII.p("text", "an ASCII string"),

        returnDoc = "the horizontal size, in pixels"
    )

    int(
        "easy_font_height",
        "Takes a string and returns the vertical size (which can vary if {@code text} has newlines).",

        Input..charASCII.p("text", "an ASCII string"),

        returnDoc = "the vertical size, in pixels"
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

        If you pass in #NULL for color, it becomes {@code 255,255,255,255}.

        If the buffer isn't large enough, it will truncate. Expect it to use an average of ~270 bytes per character.

        If your API doesn't draw quads, build a reusable index list that allows you to render quads as indexed triangles.
        """,

        float("x", "the x offset"),
        float("y", "the y offset"),
        Input..charASCII.p("text", "an ASCII string"),
        nullable..Check(4)..unsigned_char.p("color", "the text color, in RGBA (4 bytes)"),
        void.p("vertex_buffer", "a pointer to memory in which to store the vertex data"),
        AutoSize("vertex_buffer")..int("vbuf_size", "the {@code vertex_buffer} size, in bytes"),

        returnDoc = "the number of quads"
    )

    void(
        "easy_font_spacing",
        """
        Use positive values to expand the space between characters, and small negative values (no smaller than {@code -1.5}) to contract the space between characters.

        E.g. {@code spacing = 1} adds one "pixel" of spacing between the characters. {@code spacing = -1} is reasonable but feels a bit too compact to me;
        {@code -0.5} is a reasonable compromise as long as you're scaling the font up.
        """,

        float("spacing", "the font spacing")
    )
}