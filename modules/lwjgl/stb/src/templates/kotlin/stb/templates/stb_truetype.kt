/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package stb.templates

import org.lwjgl.generator.*
import stb.*

val stb_truetype = "STBTruetype".nativeClass(Module.STB, prefix = "STBTT", prefixMethod = "stbtt_") {
    includeSTBAPI(
        """#include "lwjgl_malloc.h"
#define STBTT_malloc(x,u)  ((void)(u),org_lwjgl_malloc(x))
#define STBTT_free(x,u)    ((void)(u),org_lwjgl_free(x))
#define STBTT_assert
#define STB_TRUETYPE_IMPLEMENTATION
#define STBTT_STATIC
#include "stb_rect_pack.h"
#include "stb_truetype.h"""")

    documentation =
        """
        Native bindings to stb_truetype.h from the ${url("https://github.com/nothings/stb", "stb library")}.

        This library processes TrueType files:
        ${ul(
            "parse files",
            "extract glyph metrics",
            "extract glyph shapes",
            "render glyphs to one-channel bitmaps with antialiasing (box filter)"
        )}

        <h3>ADDITIONAL DOCUMENTATION</h3>
        Some important concepts to understand to use this library:

        <h4>Codepoint</h4>

        Characters are defined by unicode codepoints, e.g. 65 is uppercase A, 231 is lowercase c with a cedilla, 0x7e30 is the hiragana for "ma".

        <h4>Glyph</h4>

        A visual character shape (every codepoint is rendered as some glyph)

        <h4>Glyph index</h4>

        A font-specific integer ID representing a glyph

        <h4>Baseline</h4>

        Glyph shapes are defined relative to a baseline, which is the bottom of uppercase characters. Characters extend both above and below the baseline.

        <h4>Current Point</h4>

        As you draw text to the screen, you keep track of a "current point" which is the origin of each character. The current point's vertical position is the
        baseline. Even "baked fonts" use this model.

        <h4>Vertical Font Metrics</h4>

        The vertical qualities of the font, used to vertically position and space the characters. See docs for #GetFontVMetrics().

        <h4>Font Size in Pixels or Points</h4>

        The preferred interface for specifying font sizes in stb_truetype is to specify how tall the font's vertical extent should be in pixels. If that sounds
        good enough, skip the next paragraph.

        Most font APIs instead use "points", which are a common typographic measurement for describing font size, defined as 72 points per inch. stb_truetype
        provides a point API for compatibility. However, true "per inch" conventions don't make much sense on computer displays since different monitors have
        different number of pixels per inch. For example, Windows traditionally uses a convention that there are 96 pixels per inch, thus making 'inch'
        measurements have nothing to do with inches, and thus effectively defining a point to be 1.333 pixels. Additionally, the TrueType font data provides an
        explicit scale factor to scale a given font's glyphs to points, but the author has observed that this scale factor is often wrong for non-commercial
        fonts, thus making fonts scaled in points according to the TrueType spec incoherently sized in practice.

        <h3>DETAILED USAGE</h3>

        <h4>Scale:</h4>

        Select how high you want the font to be, in points or pixels. Call #()ScaleForPixelHeight or #ScaleForMappingEmToPixels() to compute a scale factor
        {@code SF} that will be used by all other functions.

        <h4>Baseline:</h4>

        You need to select a y-coordinate that is the baseline of where your text will appear. Call #GetFontBoundingBox() to get the baseline-relative bounding
        box for all characters. {@code SF*-y0} will be the distance in pixels that the worst-case character could extend above the baseline, so if you want the
        top edge of characters to appear at the top of the screen where {@code y=0}, then you would set the baseline to {@code SF*-y0}.

        <h4>Current point:</h4>

        Set the current point where the first character will appear. The first character could extend left of the current point; this is font dependent. You
        can either choose a current point that is the leftmost point and hope, or add some padding, or check the bounding box or left-side-bearing of the first
        character to be displayed and set the current point based on that.

        <h4>Displaying a character:</h4>

        Compute the bounding box of the character. It will contain signed values relative to {@code <current_point, baseline>}. I.e. if it returns
        {@code x0,y0,x1,y1}, then the character should be displayed in the rectangle from {@code <current_point+SF*x0, baseline+SF*y0>} to
        {@code <current_point+SF*x1,baseline+SF*y1)}.

        <h4>Advancing for the next character:</h4>

        Call #GetGlyphHMetrics(), and compute {@code current_point += SF * advance}.

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
        e.g. if you need a case-insensitive comparison, the details of that depend on the encoding &amp; language in a complex way (actually underspecified in
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

        Unsafe..unsigned_char.const.p("data", "the font data"),
        Expression("0")..int("offset", "the font data offset, use 0 for plain .ttf files"),
        float("pixel_height", "the font height, in pixels"),
        Check("pw * ph")..unsigned_char.p("pixels", "a buffer in which to write the font bitmap"),
        int("pw", "the bitmap width, in pixels"),
        int("ph", "the bitmap height, in pixels"),
        int("first_char", "the first character to bake"),
        AutoSize("chardata")..int("num_chars", "the number of characters to bake, starting at {@code first_char}"),
        stbtt_bakedchar.p("chardata", "an array of ##STBTTBakedChar structs, it's {@code num_chars} long"),

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

        Check("char_index + 1")..stbtt_bakedchar.const.p("chardata", "an array of ##STBTTBakedChar structs"),
        int("pw", "the bitmap width, in pixels"),
        int("ph", "the bitmap height, in pixels"),
        int("char_index", "the character index in the {@code chardata} array"),
        Check(1)..float.p("xpos", "the current x position, in screen pixel space"),
        Check(1)..float.p("ypos", "the current y position, in screen pixel space"),
        stbtt_aligned_quad.p("q", "an ##STBTTAlignedQuad struct in which to return the quad to draw"),
        intb("opengl_fillrule", "1 if opengl fill rule; 0 if DX9 or earlier")
    )

    void(
        "GetScaledFontVMetrics",
        "Query the font vertical metrics without having to create a font first.",

        Unsafe..unsigned_char.const.p("fontdata", ""),
        int("index", "the font index (use 0 if you don't know what that is)"),
        float("size", "the font height, in pixels"),
        Check(1)..float.p("ascent", "returns the coordinate above the baseline the font extends"),
        Check(1)..float.p("descent", "returns the coordinate below the baseline the font extends (i.e. it is typically negative)"),
        Check(1)..float.p("lineGap", "returns the spacing between one row's descent and the next row's ascent")
    )

    // NEW TEXTURE BAKING API

    intb(
        "PackBegin",
        """
        Initializes a packing context stored in the passed-in {@code stbtt_pack_context}. Future calls using this context will pack characters into the bitmap
        passed in here: a 1-channel bitmap that is width x height.
        """,

        stbtt_pack_context.p("spc", "an ##STBTTPackContext struct"),
        Check("(stride_in_bytes != 0 ? stride_in_bytes : width) * height")..nullable..unsigned_char.p(
            "pixels",
            "a buffer in which to store the bitmap data"
        ),
        int("width", "the bitmap width, in pixels"),
        int("height", "the bitmap height, in pixels"),
        int("stride_in_bytes", "the distance from one row to the next (or 0 to mean they are packed tightly together)"),
        int(
            "padding",
            "the amount of padding to leave between each character (normally you want '1' for bitmaps you'll use as textures with bilinear filtering)"
        ),
        Expression("NULL")..nullable..opaque_p("alloc_context", "a pointer to an allocation context"),

        returnDoc = "1 on success, 0 on failure"
    )

    void(
        "PackEnd",
        "Cleans up the packing context and frees all memory.",

        stbtt_pack_context.p("spc", "an ##STBTTPackContext struct")
    )

    macro(expression = "-font_size")..int(
        "STBTT_POINT_SIZE",
        """
        Converts the full height of a character from ascender to descender, as computed by #ScaleForPixelHeight(), to a point size as computed by
        #ScaleForMappingEmToPixels().
        """,

        int("font_size", "the full height of a character"),

        returnDoc = "the point size of the character",
        noPrefix = true
    )

    intb(
        "PackFontRange",
        """
        Creates character bitmaps from the {@code font_index}'th font found in fontdata (use {@code font_index=0} if you don't know what that is). It creates
        {@code num_chars_in_range} bitmaps for characters with unicode values starting at {@code first_unicode_char_in_range} and increasing. Data for how to
        render them is stored in {@code chardata_for_range}; pass these to #GetPackedQuad() to get back renderable quads.
        """,

        stbtt_pack_context.p("spc", "an ##STBTTPackContext struct"),
        Unsafe..unsigned_char.const.p("fontdata", "the font data"),
        int("font_index", "the font index (use 0 if you don't know what that is"),
        float(
            "font_size",
            """
            the full height of the character from ascender to descender, as computed by #ScaleForPixelHeight(). To use a point size as computed by
            #ScaleForMappingEmToPixels(), wrap the font size in #STBTT_POINT_SIZE() and pass the result, i.e.:
            ${codeBlock("""
...,                  20 , ... // font max minus min y is 20 pixels tall
..., STBTT_POINT_SIZE(20), ... // 'M' is 20 pixels tall""")}
            """
        ),
        int("first_unicode_char_in_range", "the first unicode code point in the range"),
        AutoSize("chardata_for_range")..int("num_chars_in_range", "the number of unicode code points in the range"),
        stbtt_packedchar.p("chardata_for_range", "an array of ##STBTTPackedchar structs"),

        returnDoc = "1 on success, 0 on failure"
    )

    intb(
        "PackFontRanges",
        """
        Creates character bitmaps from multiple ranges of characters stored in ranges. This will usually create a better-packed bitmap than multiple calls to
        #PackFontRange(). Note that you can call this multiple times within a single #PackBegin()/#PackEnd().
        """,

        stbtt_pack_context.p("spc", "an ##STBTTPackContext struct"),
        Unsafe..unsigned_char.const.p("fontdata", "the font data"),
        int("font_index", "the font index (use 0 if you don't know what that is)"),
        Input..stbtt_pack_range.p("ranges", "an array of ##STBTTPackRange structs"),
        AutoSize("ranges")..int("num_ranges", "the number of ##STBTTPackRange structs in {@code ranges}"),

        returnDoc = "1 on success, 0 on failure"
    )

    void(
        "PackSetOversampling",
        """
        Oversampling a font increases the quality by allowing higher-quality subpixel positioning, and is especially valuable at smaller text sizes.

        This function sets the amount of oversampling for all following calls to #PackFontRange() or #PackFontRangesGatherRects() for a given pack context. The
        default (no oversampling) is achieved by {@code h_oversample=1, v_oversample=1}. The total number of pixels required is
        {@code h_oversample*v_oversample} larger than the default; for example, 2x2 oversampling requires 4x the storage of 1x1. For best results, render
        oversampled textures with bilinear filtering. Look at the readme in
        ${url("https://github.com/nothings/stb/blob/master/tests/oversample/README.md", "stb/tests/oversample")} for information about oversampled fonts.

        To use with PackFontRangesGather etc., you must set it before calls to #PackFontRangesGatherRects().
        """,

        stbtt_pack_context.p("spc", "an ##STBTTPackContext struct"),
        unsigned_int("h_oversample", "the horizontal oversampling amount"),
        unsigned_int("v_oversample", "the vertical oversampling amount")
    )

    void(
        "PackSetSkipMissingCodepoints",
        """
        If {@code skip != 0}, this tells stb_truetype to skip any codepoints for which there is no corresponding glyph. If {@code skip=0}, which is the
        default, then codepoints without a glyph recived the font's "missing character" glyph, typically an empty box by convention.
        """,

        stbtt_pack_context.p("spc", "an ##STBTTPackContext struct"),
        intb("skip", "the skip flag")
    )

    void(
        "GetPackedQuad",
        """
        Computes quad to draw for a given char and advances the current position.

        The coordinate system used assumes y increases downwards. Characters will extend both above and below the current position; see discussion of
        "BASELINE" above.
        """,

        Check("char_index + 1")..stbtt_packedchar.const.p("chardata", "an array of ##STBTTPackedchar structs"),
        int("pw", "the bitmap width, in pixels"),
        int("ph", "the bitmap height, in pixels"),
        int("char_index", "the character index in the {@code chardata} array"),
        Check(1)..float.p("xpos", "the current x position, in screen pixel space"),
        Check(1)..float.p("ypos", "the current y position, in screen pixel space"),
        stbtt_aligned_quad.p("q", "an ##STBTTAlignedQuad struct in which to return the quad to draw"),
        intb("align_to_integer", "1 to align the quad to integer coordinates")
    )

    int(
        "PackFontRangesGatherRects",
        """
        Calling these functions in sequence is roughly equivalent to calling #PackFontRanges(). If you want more control over the packing of multiple fonts, or
        if you want to pack custom data into a font texture, take a look at the source of #PackFontRanges() and create a custom version using these functions,
        e.g. call #PackFontRangesGatherRects() multiple times, building up a single array of rects, then call #PackFontRangesPackRects() once, then call
        #PackFontRangesRenderIntoRects() repeatedly. This may result in a better packing than calling #PackFontRanges() multiple times (or it may not).
        """,

        stbtt_pack_context.p("spc", "an ##STBTTPackContext struct"),
        stbtt_fontinfo.p("info", "an ##STBTTFontinfo struct"),
        Input..stbtt_pack_range.p("ranges", "an array of ##STBTTPackRange structs"),
        AutoSize("ranges")..int("num_ranges", "the number of ##STBTTPackRange structs in {@code ranges}"),
        Unsafe..stbrp_rect.p("rects", "an array of ##STBRPRect structs. It must be big enough to accommodate all characters in the given ranges."),

        returnDoc = "the number of structs written in {@code rects}"
    )

    void(
        "PackFontRangesPackRects",
        "See #PackFontRangesGatherRects().",

        stbtt_pack_context.p("spc", "an ##STBTTPackContext struct"),
        stbrp_rect.p("rects", "an array of ##STBRPRect structs"),
        AutoSize("rects")..int("num_rects", "the number of structs in {@code rects}")
    )

    intb(
        "PackFontRangesRenderIntoRects",
        "See #PackFontRangesGatherRects().",

        stbtt_pack_context.p("spc", "an ##STBTTPackContext struct"),
        stbtt_fontinfo.p("info", "an ##STBTTFontinfo struct"),
        Input..stbtt_pack_range.p("ranges", "an array of ##STBTTPackRange structs"),
        AutoSize("ranges")..int("num_ranges", "the number of ##STBTTPackRange structs in {@code ranges}"),
        Unsafe..stbrp_rect.p("rects", "an array of ##STBRPRect structs. It must be big enough to accommodate all characters in the given ranges."),

        returnDoc = "1 on success, 0 on failure"
    )

    // FONT LOADING

    int(
        "GetNumberOfFonts",
        """
        Determines the number of fonts in a font file.

        TrueType collection (.ttc) files may contain multiple fonts, while TrueType font (.ttf) files only contain one font. The number of fonts can be used
        for indexing with #GetFontOffsetForIndex() where the index is between zero and one less than the total fonts. If an error occurs, -1 is returned.
        """,

        Unsafe..unsigned_char.const.p("data", "the font data")
    )

    int(
        "GetFontOffsetForIndex",
        """
        Each .ttf/.ttc file may have more than one font. Each font has a sequential index number starting from 0. Call this function to get the font offset for
        a given index; it returns -1 if the index is out of range. A regular .ttf file will only define one font and it always be at offset 0, so it will
        return '0' for index 0, and -1 for all other indices.
        """,

        Unsafe..unsigned_char.const.p("data", "the font data"),
        int("index", "the font index")
    )

    intb(
        "InitFont",
        """
        Given an offset into the file that defines a font, this function builds the necessary cached info for the rest of the system. You must allocate the
        ##STBTTFontinfo yourself, and stbtt_InitFont will fill it out. You don't need to do anything special to free it, because the contents are pure value
        data with no additional data structures.
        """,

        stbtt_fontinfo.p("info", "an ##STBTTFontinfo struct"),
        Unsafe..unsigned_char.const.p("data", "the font data"),
        Expression("0")..int("offset", "the font data offset"),

        returnDoc = "1 on success, 0 on failure"
    )

    // CHARACTER TO GLYPH-INDEX CONVERSION

    int(
        "FindGlyphIndex",
        """
        If you're going to perform multiple operations on the same character and you want a speed-up, call this function with the character you're going to
        process, then use glyph-based functions instead of the codepoint-based functions.
        """,

        stbtt_fontinfo.const.p("info", "an ##STBTTFontinfo struct"),
        int("unicode_codepoint", "the unicode code point"),

        returnDoc = "the glyph index or 0 if the character codepoint is not defined in the font"
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

        stbtt_fontinfo.const.p("info", "an ##STBTTFontinfo struct"),
        float("pixels", "the font height, in pixels"),

        returnDoc = "the scale factor"
    )

    float(
        "ScaleForMappingEmToPixels",
        """
        Computes a scale factor to produce a font whose EM size is mapped to {@code pixels} tall. This is probably what traditional APIs compute, but I'm not
        positive.
        """,

        stbtt_fontinfo.const.p("info", "an ##STBTTFontinfo struct"),
        float("pixels", "the font height, in pixels"),

        returnDoc = "the scale factor"
    )

    void(
        "GetFontVMetrics",
        """
        Returns vertical metrics for the specified font. You should advance the vertical position by {@code *ascent - *descent + *lineGap}

        The returned values are expressed in unscaled coordinates, so you must multiply by the scale factor for a given size.
        """,

        stbtt_fontinfo.const.p("info", "an ##STBTTFontinfo struct"),
        nullable..Check(1)..int.p("ascent", "returns the coordinate above the baseline the font extends"),
        nullable..Check(1)..int.p("descent", "returns the coordinate below the baseline the font extends (i.e. it is typically negative)"),
        nullable..Check(1)..int.p("lineGap", "returns the spacing between one row's descent and the next row's ascent")
    )

    intb(
        "GetFontVMetricsOS2",
        "Analogous to #GetFontVMetrics(), but returns the \"typographic\" values from the OS/2 table (specific to MS/Windows TTF files).",

        stbtt_fontinfo.const.p("info", "an ##STBTTFontinfo struct"),
        nullable..Check(1)..int.p("typoAscent", "returns the coordinate above the baseline the font extends"),
        nullable..Check(1)..int.p("typoDescent", "returns the coordinate below the baseline the font extends (i.e. it is typically negative)"),
        nullable..Check(1)..int.p("typoLineGap", "returns the spacing between one row's descent and the next row's ascent"),

        returnDoc = "1 on success (table present), 0 on failure"
    )

    void(
        "GetFontBoundingBox",
        "Returns the bounding box around all possible characters.",

        stbtt_fontinfo.const.p("info", "an ##STBTTFontinfo struct"),
        Check(1)..int.p("x0", "the left coordinate"),
        Check(1)..int.p("y0", "the bottom coordinate"),
        Check(1)..int.p("x1", "the right coordinate"),
        Check(1)..int.p("y1", "the top coordinate")
    )

    void(
        "GetCodepointHMetrics",
        """
        Returns horizontal metrics for the specified codepoint.

        The returned values are expressed in unscaled coordinates.
        """,

        stbtt_fontinfo.const.p("info", "an ##STBTTFontinfo struct"),
        int("codepoint", "the unicode codepoint"),
        nullable..Check(1)..int.p("advanceWidth", "the offset from the current horizontal position to the next horizontal position"),
        nullable..Check(1)..int.p("leftSideBearing", "the offset from the current horizontal position to the left edge of the character")
    )

    int(
        "GetCodepointKernAdvance",
        "Returns the additional amount to add to the {@code advance} value between {@code ch1} and {@code ch2}.",

        stbtt_fontinfo.const.p("info", "an ##STBTTFontinfo struct"),
        int("ch1", "the first unicode codepoint"),
        int("ch2", "the second unicode codepoint")
    )

    intb(
        "GetCodepointBox",
        "Gets the bounding box of the visible part of the glyph, in unscaled coordinates.",

        stbtt_fontinfo.const.p("info", "an ##STBTTFontinfo struct"),
        int("codepoint", "the unicode codepoint"),
        nullable..Check(1)..int.p("x0", "returns the left coordinate"),
        nullable..Check(1)..int.p("y0", "returns the bottom coordinate"),
        nullable..Check(1)..int.p("x1", "returns the right coordinate"),
        nullable..Check(1)..int.p("y1", "returns the top coordinate")
    )

    void(
        "GetGlyphHMetrics",
        "Glyph version of #GetCodepointHMetrics(), for greater efficiency.",

        stbtt_fontinfo.const.p("info", "an ##STBTTFontinfo struct"),
        int("glyph_index", "the glyph index"),
        nullable..Check(1)..int.p("advanceWidth", "the offset from the current horizontal position to the next horizontal position"),
        nullable..Check(1)..int.p("leftSideBearing", "the offset from the current horizontal position to the left edge of the character")
    )

    int(
        "GetGlyphKernAdvance",
        "Glyph version of #GetCodepointKernAdvance(), for greater efficiency.",

        stbtt_fontinfo.const.p("info", "an ##STBTTFontinfo struct"),
        int("glyph1", "the first glyph index"),
        int("glyph2", "the second glyph index")
    )

    intb(
        "GetGlyphBox",
        "Glyph version of #GetCodepointBox(), for greater efficiency.",

        stbtt_fontinfo.const.p("info", "an ##STBTTFontinfo struct"),
        int("glyph_index", "the glyph index"),
        nullable..Check(1)..int.p("x0", "returns the left coordinate"),
        nullable..Check(1)..int.p("y0", "returns the bottom coordinate"),
        nullable..Check(1)..int.p("x1", "returns the right coordinate"),
        nullable..Check(1)..int.p("y1", "returns the top coordinate")
    )

    int(
        "GetKerningTableLength",
        "",

        stbtt_fontinfo.const.p("info", "")
    )
    int(
        "GetKerningTable",
        """
        Retrieves a complete list of all of the kerning pairs provided by the font.
        
        {@code stbtt_GetKerningTable} never writes more than {@code table_length} entries and returns how many entries it did write. The table will be sorted
        by {@code (a.glyph1 == b.glyph1)?(a.glyph2 < b.glyph2):(a.glyph1 < b.glyph1)}        
        """,

        stbtt_fontinfo.const.p("info", ""),
        stbtt_kerningentry.p("table", ""),
        AutoSize("table")..int("table_length", "")
    )

    // GLYPH SHAPES

    ByteConstant(
        "Vertex type.",

        "vmove".."1",
        "vline".."2",
        "vcurve".."3",
        "vcubic".."4"
    )

    intb(
        "IsGlyphEmpty",
        "Returns non-zero if nothing is drawn for this glyph.",

        stbtt_fontinfo.const.p("info", "an ##STBTTFontinfo struct"),
        int("glyph_index", "the glyph index")
    )

    int(
        "GetCodepointShape",
        """
        Returns number of vertices and fills {@code *vertices} with the pointer to them

        The shape is a series of contours. Each one starts with a #vmove, then consists of a series of mixed #vline and #vcurve segments. A #vline draws a
        line from previous endpoint to its {@code x,y}; a #vcurve draws a quadratic bezier from previous endpoint to its {@code x,y}, using {@code cx,cy} as
        the bezier control point.

        The ##STBTTVertex values are expressed in "unscaled" coordinates.
        """,

        stbtt_fontinfo.const.p("info", "an ##STBTTFontinfo struct"),
        int("unicode_codepoint", "the unicode codepoint"),
        Check(1)..Return(RESULT)..stbtt_vertex.p.p("vertices", "returns a pointer to an array of ##STBTTVertex structs")
    )

    int(
        "GetGlyphShape",
        "Glyph version of #GetCodepointShape(), for greater efficiency.",

        stbtt_fontinfo.const.p("info", "an ##STBTTFontinfo struct"),
        int("glyph_index", "the unicode codepoint"),
        Check(1)..Return(RESULT)..stbtt_vertex.p.p("vertices", "returns a pointer to an array of ##STBTTVertex structs")
    )

    void(
        "FreeShape",
        "Frees the data allocated by #GetCodepointShape() and #GetGlyphShape().",

        stbtt_fontinfo.const.p("info", "an ##STBTTFontinfo struct"),
        Check(1)..stbtt_vertex.p("vertices", "the array of ##STBTTVertex structs to free")
    )

    "unsigned char".opaque.p(
        "FindSVGDoc",
        "",

        stbtt_fontinfo.const.p("info", ""),
        int("gl", "")
    )

    int(
        "GetCodepointSVG",
        "Fills {@code svg} with the character's SVG data.",

        stbtt_fontinfo.const.p("info", ""),
        int("unicode_codepoint", ""),
        Check(1)..char.const.p.p("svg", ""),

        returnDoc = "data size or 0 if SVG not found"
    )

    int(
        "GetGlyphSVG",
        "Fills {@code svg} with the character's SVG data.",

        stbtt_fontinfo.const.p("info", ""),
        int("gl", ""),
        Check(1)..char.const.p.p("svg", ""),

        returnDoc = "data size or 0 if SVG not found"
    )

    // BITMAP RENDERING

    void(
        "FreeBitmap",
        "Frees a bitmap allocated by #GetCodepointBitmap(), #GetCodepointBitmapSubpixel(), #GetGlyphBitmap() or #GetGlyphBitmapSubpixel().",

        Unsafe..unsigned_char.p("bitmap", "the bitmap to free"),
        Expression("NULL")..nullable..opaque_p("userdata", "a pointer to an allocation context")
    )

    unsigned_char.p(
        "GetCodepointBitmap",
        "Allocates a large-enough single-channel 8bpp bitmap and renders the specified character/glyph at the specified scale into it, with antialiasing.",

        stbtt_fontinfo.const.p("info", "an ##STBTTFontinfo struct"),
        float("scale_x", "the horizontal scale"),
        float("scale_y", "the vertical scale"),
        int("codepoint", "the unicode codepoint to render"),
        Check(1)..AutoSizeResult..int.p("width", "returns the bitmap width"),
        Check(1)..AutoSizeResult..int.p("height", "returns the bitmap height"),
        nullable..Check(1)..int.p("xoff", "returns the horizontal offset in pixel space from the glyph origin to the left of the bitmap"),
        nullable..Check(1)..int.p("yoff", "returns the vertical offset in pixel space from the glyph origin to the top of the bitmap")
    )

    unsigned_char.p(
        "GetCodepointBitmapSubpixel",
        "Same as #GetCodepointBitmap(), but you can specify a subpixel shift for the character.",

        stbtt_fontinfo.const.p("info", "an ##STBTTFontinfo struct"),
        float("scale_x", "the horizontal scale"),
        float("scale_y", "the vertical scale"),
        float("shift_x", "the horizontal subpixel shift"),
        float("shift_y", "the vertical subpixel shift"),
        int("codepoint", "the unicode codepoint to render"),
        Check(1)..AutoSizeResult..int.p("width", "returns the bitmap width"),
        Check(1)..AutoSizeResult..int.p("height", "returns the bitmap height"),
        nullable..Check(1)..int.p("xoff", "returns the horizontal offset in pixel space from the glyph origin to the left of the bitmap"),
        nullable..Check(1)..int.p("yoff", "returns the vertical offset in pixel space from the glyph origin to the top of the bitmap")
    )

    void(
        "MakeCodepointBitmap",
        """
        Same as #GetCodepointBitmap(), but you pass in storage for the bitmap in the form of {@code output}, with row spacing of {@code out_stride} bytes. The
        bitmap is clipped to {@code out_w/out_h} bytes. Call #GetCodepointBitmapBox() to get the width and height and positioning info for it first.
        """,

        stbtt_fontinfo.const.p("info", "an ##STBTTFontinfo struct"),
        Check("(out_stride != 0 ? out_stride : out_w) * out_h")..unsigned_char.p("output", "the bitmap storage"),
        int("out_w", "the bitmap width"),
        int("out_h", "the bitmap height"),
        int("out_stride", "the row stride, in bytes"),
        float("scale_x", "the horizontal scale"),
        float("scale_y", "the vertical scale"),
        int("codepoint", "the unicode codepoint to render")
    )

    void(
        "MakeCodepointBitmapSubpixel",
        "Same as #MakeCodepointBitmap(), but you can specify a subpixel shift for the character.",

        stbtt_fontinfo.const.p("info", "an ##STBTTFontinfo struct"),
        Check("(out_stride != 0 ? out_stride : out_w) * out_h")..unsigned_char.p("output", "the bitmap storage"),
        int("out_w", "the bitmap width"),
        int("out_h", "the bitmap height"),
        int("out_stride", "the row stride, in bytes"),
        float("scale_x", "the horizontal scale"),
        float("scale_y", "the vertical scale"),
        float("shift_x", "the horizontal subpixel shift"),
        float("shift_y", "the vertical subpixel shift"),
        int("codepoint", "the unicode codepoint to render")
    )

    void(
        "MakeCodepointBitmapSubpixelPrefilter",
        "Same as #MakeCodepointBitmapSubpixel(), but prefiltering is performed (see #PackSetOversampling()).",

        stbtt_fontinfo.const.p("info", "an ##STBTTFontinfo struct"),
        Check("(out_stride != 0 ? out_stride : out_w) * out_h")..unsigned_char.p("output", "the bitmap storage"),
        int("out_w", "the bitmap width"),
        int("out_h", "the bitmap height"),
        int("out_stride", "the row stride, in bytes"),
        float("scale_x", "the horizontal scale"),
        float("scale_y", "the vertical scale"),
        float("shift_x", "the horizontal subpixel shift"),
        float("shift_y", "the vertical subpixel shift"),
        int("oversample_x", "the horizontal oversampling amount"),
        int("oversample_y", "the vertical oversampling amount"),
        Check(1)..float.p("sub_x", "returns the horizontal oversample shift"),
        Check(1)..float.p("sub_y", "returns the vertical oversample shift"),
        int("codepoint", "the unicode codepoint to render")
    )

    void(
        "GetCodepointBitmapBox",
        """
        Get the bbox of the bitmap centered around the glyph origin; so the bitmap width is {@code ix1-ix0}, height is {@code iy1-iy0}, and location to place
        the bitmap top left is {@code (leftSideBearing*scale,iy0)}.

        Note that the bitmap uses y-increases-down, but the shape uses y-increases-up, so {@code CodepointBitmapBox} and {@code CodepointBox} are inverted.
        """,

        stbtt_fontinfo.const.p("font", "an ##STBTTFontinfo struct"),
        int("codepoint", "the unicode codepoint"),
        float("scale_x", "the horizontal scale"),
        float("scale_y", "the vertical scale"),
        nullable..Check(1)..int.p("ix0", "returns the left coordinate"),
        nullable..Check(1)..int.p("iy0", "returns the bottom coordinate"),
        nullable..Check(1)..int.p("ix1", "returns the right coordinate"),
        nullable..Check(1)..int.p("iy1", "returns the top coordinate")
    )

    void(
        "GetCodepointBitmapBoxSubpixel",
        "Same as #GetCodepointBitmapBox(), but you can specify a subpixel shift for the character.",

        stbtt_fontinfo.const.p("font", "an ##STBTTFontinfo struct"),
        int("codepoint", "the unicode codepoint"),
        float("scale_x", "the horizontal scale"),
        float("scale_y", "the vertical scale"),
        float("shift_x", "the horizontal subpixel shift"),
        float("shift_y", "the vertical subpixel shift"),
        nullable..Check(1)..int.p("ix0", "returns the left coordinate"),
        nullable..Check(1)..int.p("iy0", "returns the bottom coordinate"),
        nullable..Check(1)..int.p("ix1", "returns the right coordinate"),
        nullable..Check(1)..int.p("iy1", "returns the top coordinate")
    )

    unsigned_char.p(
        "GetGlyphBitmap",
        "Allocates a large-enough single-channel 8bpp bitmap and renders the specified character/glyph at the specified scale into it, with antialiasing.",

        stbtt_fontinfo.const.p("info", "an ##STBTTFontinfo struct"),
        float("scale_x", "the horizontal scale"),
        float("scale_y", "the vertical scale"),
        int("glyph", "the glyph index to render"),
        Check(1)..AutoSizeResult..int.p("width", "returns the bitmap width"),
        Check(1)..AutoSizeResult..int.p("height", "returns the bitmap height"),
        nullable..Check(1)..int.p("xoff", "returns the horizontal offset in pixel space from the glyph origin to the left of the bitmap"),
        nullable..Check(1)..int.p("yoff", "returns the vertical offset in pixel space from the glyph origin to the top of the bitmap")
    )

    unsigned_char.p(
        "GetGlyphBitmapSubpixel",
        "Same as #GetGlyphBitmap(), but you can specify a subpixel shift for the character.",

        stbtt_fontinfo.const.p("info", "an ##STBTTFontinfo struct"),
        float("scale_x", "the horizontal scale"),
        float("scale_y", "the vertical scale"),
        float("shift_x", "the horizontal subpixel shift"),
        float("shift_y", "the vertical subpixel shift"),
        int("glyph", "the glyph index to render"),
        Check(1)..AutoSizeResult..int.p("width", "returns the bitmap width"),
        Check(1)..AutoSizeResult..int.p("height", "returns the bitmap height"),
        nullable..Check(1)..int.p("xoff", "returns the horizontal offset in pixel space from the glyph origin to the left of the bitmap"),
        nullable..Check(1)..int.p("yoff", "returns the vertical offset in pixel space from the glyph origin to the top of the bitmap")
    )

    void(
        "MakeGlyphBitmap",
        """
        Same as #GetGlyphBitmap(), but you pass in storage for the bitmap in the form of {@code output}, with row spacing of {@code out_stride} bytes. The
        bitmap is clipped to {@code out_w/out_h} bytes. Call #GetGlyphBitmapBox() to get the width and height and positioning info for it first.
        """,

        stbtt_fontinfo.const.p("info", "an ##STBTTFontinfo struct"),
        Check("(out_stride != 0 ? out_stride : out_w) * out_h")..unsigned_char.p("output", "the bitmap storage"),
        int("out_w", "the bitmap width"),
        int("out_h", "the bitmap height"),
        int("out_stride", "the row stride, in bytes"),
        float("scale_x", "the horizontal scale"),
        float("scale_y", "the vertical scale"),
        int("glyph", "the glyph index to render")
    )

    void(
        "MakeGlyphBitmapSubpixel",
        "Same as #MakeGlyphBitmap(), but you can specify a subpixel shift for the character.",

        stbtt_fontinfo.const.p("info", "an ##STBTTFontinfo struct"),
        Check("(out_stride != 0 ? out_stride : out_w) * out_h")..unsigned_char.p("output", "the bitmap storage"),
        int("out_w", "the bitmap width"),
        int("out_h", "the bitmap height"),
        int("out_stride", "the row stride, in bytes"),
        float("scale_x", "the horizontal scale"),
        float("scale_y", "the vertical scale"),
        float("shift_x", "the horizontal subpixel shift"),
        float("shift_y", "the vertical subpixel shift"),
        int("glyph", "the glyph index to render")
    )

    void(
        "MakeGlyphBitmapSubpixelPrefilter",
        "Same as #MakeGlyphBitmapSubpixel(), but prefiltering is performed (see #PackSetOversampling()).",

        stbtt_fontinfo.const.p("info", "an ##STBTTFontinfo struct"),
        Check("(out_stride != 0 ? out_stride : out_w) * out_h")..unsigned_char.p("output", "the bitmap storage"),
        int("out_w", "the bitmap width"),
        int("out_h", "the bitmap height"),
        int("out_stride", "the row stride, in bytes"),
        float("scale_x", "the horizontal scale"),
        float("scale_y", "the vertical scale"),
        float("shift_x", "the horizontal subpixel shift"),
        float("shift_y", "the vertical subpixel shift"),
        int("oversample_x", "the horizontal oversampling amount"),
        int("oversample_y", "the vertical oversampling amount"),
        Check(1)..float.p("sub_x", "returns the horizontal oversample shift"),
        Check(1)..float.p("sub_y", "returns the vertical oversample shift"),
        int("glyph", "the glyph index to render")
    )

    void(
        "GetGlyphBitmapBox",
        """
        Get the bbox of the bitmap centered around the glyph origin; so the bitmap width is {@code ix1-ix0}, height is {@code iy1-iy0}, and location to place
        the bitmap top left is {@code (leftSideBearing*scale,iy0)}.

        Note that the bitmap uses y-increases-down, but the shape uses y-increases-up, so {@code GlyphBitmapBox} and {@code GlyphBox} are inverted.
        """,

        stbtt_fontinfo.const.p("font", "an ##STBTTFontinfo struct"),
        int("glyph", "the glyph index"),
        float("scale_x", "the horizontal scale"),
        float("scale_y", "the vertical scale"),
        nullable..Check(1)..int.p("ix0", "returns the left coordinate"),
        nullable..Check(1)..int.p("iy0", "returns the bottom coordinate"),
        nullable..Check(1)..int.p("ix1", "returns the right coordinate"),
        nullable..Check(1)..int.p("iy1", "returns the top coordinate")
    )

    void(
        "GetGlyphBitmapBoxSubpixel",
        "Same as #GetGlyphBitmapBox(), but you can specify a subpixel shift for the character.",

        stbtt_fontinfo.const.p("font", "an ##STBTTFontinfo struct"),
        int("glyph", "the glyph index"),
        float("scale_x", "the horizontal scale"),
        float("scale_y", "the vertical scale"),
        float("shift_x", "the horizontal subpixel shift"),
        float("shift_y", "the vertical subpixel shift"),
        nullable..Check(1)..int.p("ix0", "returns the left coordinate"),
        nullable..Check(1)..int.p("iy0", "returns the bottom coordinate"),
        nullable..Check(1)..int.p("ix1", "returns the right coordinate"),
        nullable..Check(1)..int.p("iy1", "returns the top coordinate")
    )

    void(
        "Rasterize",
        "Rasterize a shape with quadratic beziers into a bitmap.",

        stbtt__bitmap.p("result", "1-channel bitmap to draw into"),
        float("flatness_in_pixels", "allowable error of curve in pixels"),
        stbtt_vertex.p("vertices", "array of vertices defining shape"),
        AutoSize("vertices")..int("num_verts", "number of vertices in above array"),
        float("scale_x", "horizontal scale applied to input vertices"),
        float("scale_y", "vertical scale applied to input vertices"),
        float("shift_x", "horizontal translation applied to input vertices"),
        float("shift_y", "vertical translation applied to input vertices"),
        int("x_off", "another horizontal translation applied to input"),
        int("y_off", "another vertical translation applied to input"),
        intb("invert", "if non-zero, vertically flip shape"),
        Expression("NULL")..nullable..opaque_p("alloc_context", "a pointer to an allocation context")
    )

    // Signed Distance Function (or Field) rendering

    void(
        "FreeSDF",
        "Frees an SDF bitmap.",

        Unsafe..unsigned_char.p("bitmap", "the SDF bitmap to free"),
        Expression("NULL")..nullable..opaque_p("userdata", "a pointer to an allocation context")
    )

    unsigned_char.p(
        "GetGlyphSDF",
        """
        Computes a discretized SDF field for a single character, suitable for storing in a single-channel texture, sampling with bilinear filtering, and
        testing against larger than some threshold to produce scalable fonts.
        
        {@code pixel_dist_scale} &amp; {@code onedge_value} are a scale &amp; bias that allows you to make optimal use of the limited {@code 0..255} for your
        application, trading off precision and special effects. SDF values outside the range {@code 0..255} are clamped to {@code 0..255}.
        
        Example:
        ${codeBlock("""
scale = stbtt_ScaleForPixelHeight(22)
padding = 5
onedge_value = 180
pixel_dist_scale = 180/5.0 = 36.0""")}

        This will create an SDF bitmap in which the character is about 22 pixels high but the whole bitmap is about {@code 22+5+5=32} pixels high. To produce a
        filled shape, sample the SDF at each pixel and fill the pixel if the SDF value is greater than or equal to {@code 180/255}. (You'll actually want to
        antialias, which is beyond the scope of this example.) Additionally, you can compute offset outlines (e.g. to stroke the character border inside &amp;
        outside, or only outside). For example, to fill outside the character up to 3 SDF pixels, you would compare against {@code (180-36.0*3)/255 = 72/255}.
        The above choice of variables maps a range from 5 pixels outside the shape to 2 pixels inside the shape to {@code 0..255}; this is intended primarily
        for apply outside effects only (the interior range is needed to allow proper antialiasing of the font at <i>smaller</i> sizes).

        The function computes the SDF analytically at each SDF pixel, not by e.g. building a higher-res bitmap and approximating it. In theory the quality
        should be as high as possible for an SDF of this size &amp; representation, but unclear if this is true in practice (perhaps building a higher-res
        bitmap and computing from that can allow drop-out prevention).

        The algorithm has not been optimized at all, so expect it to be slow if computing lots of characters or very large sizes.
        """,

        stbtt_fontinfo.const.p("font", "an ##STBTTFontinfo struct"),
        float("scale", "controls the size of the resulting SDF bitmap, same as it would be creating a regular bitmap"),
        int("glyph", "the glyph to generate the SDF for"),
        int(
            "padding",
            "extra \"pixels\" around the character which are filled with the distance to the character (not 0), which allows effects like bit outlines"
        ),
        unsigned_char("onedge_value", "value 0-255 to test the SDF against to reconstruct the character (i.e. the isocontour of the character)"),
        float(
            "pixel_dist_scale",
            """
            what value the SDF should increase by when moving one SDF "pixel" away from the edge (on the 0..255 scale). If positive, &gt; {@code onedge_value}
            is inside; if negative, &lt; {@code onedge_value} is inside.
            """),
        AutoSizeResult..Check(1)..int.p("width", "output width of the SDF bitmap (including padding)"),
        AutoSizeResult..Check(1)..int.p("height", "output height of the SDF bitmap (including padding)"),
        Check(1)..int.p("xoff", "output horizontal origin of the character"),
        Check(1)..int.p("yoff", "output vertical origin of the character")
    )

    unsigned_char.p(
        "GetCodepointSDF",
        "Codepoint version of #GetGlyphSDF().",

        stbtt_fontinfo.const.p("font", "an ##STBTTFontinfo struct"),
        float("scale", "controls the size of the resulting SDF bitmap, same as it would be creating a regular bitmap"),
        int("codepoint", "the codepoint to generate the SDF for"),
        int(
            "padding",
            "extra \"pixels\" around the character which are filled with the distance to the character (not 0), which allows effects like bit outlines"
        ),
        unsigned_char("onedge_value", "value 0-255 to test the SDF against to reconstruct the character (i.e. the isocontour of the character)"),
        float(
            "pixel_dist_scale",
            """
            what value the SDF should increase by when moving one SDF "pixel" away from the edge (on the 0..255 scale). If positive, &gt; {@code onedge_value}
            is inside; if negative, &lt; {@code onedge_value} is inside.
            """),
        AutoSizeResult..Check(1)..int.p("width", "output width of the SDF bitmap (including padding)"),
        AutoSizeResult..Check(1)..int.p("height", "output height of the SDF bitmap (including padding)"),
        Check(1)..int.p("xoff", "output horizontal origin of the character"),
        Check(1)..int.p("yoff", "output vertical origin of the character")
    )

    // Finding the right font...

    val StyleFlags = IntConstant(
        "Style flags, use in #FindMatchingFont().",

        "MACSTYLE_DONTCARE".."0",
        "MACSTYLE_BOLD".."1",
        "MACSTYLE_ITALIC".."2",
        "MACSTYLE_UNDERSCORE".."4",
        "MACSTYLE_NONE".."8"
    ).javaDocLinks

    val PlatformIDs = IntConstant(
        "Platform IDs.",

        "PLATFORM_ID_UNICODE".."0",
        "PLATFORM_ID_MAC".."1",
        "PLATFORM_ID_ISO".."2",
        "PLATFORM_ID_MICROSOFT".."3"
    ).javaDocLinks

    val EncodingIDsUnicode = IntConstant(
        "Encoding IDs for #PLATFORM_ID_UNICODE.",

        "UNICODE_EID_UNICODE_1_0".."0",
        "UNICODE_EID_UNICODE_1_1".."1",
        "UNICODE_EID_ISO_10646".."2",
        "UNICODE_EID_UNICODE_2_0_BMP".."3",
        "UNICODE_EID_UNICODE_2_0_FULL".."4"
    ).javaDocLinks

    val EncodingIDsMicrosoft = IntConstant(
        "Encoding IDs for #PLATFORM_ID_MICROSOFT.",

        "MS_EID_SYMBOL".."0",
        "MS_EID_UNICODE_BMP".."1",
        "MS_EID_SHIFTJIS".."2",
        "MS_EID_UNICODE_FULL".."10"
    ).javaDocLinks

    val EncodingIDsMac = IntConstant(
        "Encoding IDs for #PLATFORM_ID_MAC.",

        "MAC_EID_ROMAN".."0",
        "MAC_EID_JAPANESE".."1",
        "MAC_EID_CHINESE_TRAD".."2",
        "MAC_EID_KOREAN".."3",
        "MAC_EID_ARABIC".."4",
        "MAC_EID_HEBREW".."5",
        "MAC_EID_GREEK".."6",
        "MAC_EID_RUSSIAN".."7"
    ).javaDocLinks

    val LanguageIDsMicrosoft = IntConstant(
        "Language ID for #PLATFORM_ID_MICROSOFT.",

        "MS_LANG_ENGLISH"..0x0409,
        "MS_LANG_CHINESE"..0x0804,
        "MS_LANG_DUTCH"..0x0413,
        "MS_LANG_FRENCH"..0x040c,
        "MS_LANG_GERMAN"..0x0407,
        "MS_LANG_HEBREW"..0x040d,
        "MS_LANG_ITALIAN"..0x0410,
        "MS_LANG_JAPANESE"..0x0411,
        "MS_LANG_KOREAN"..0x0412,
        "MS_LANG_RUSSIAN"..0x0419,
        "MS_LANG_SPANISH"..0x0409,
        "MS_LANG_SWEDISH"..0x041D
    ).javaDocLinks

    val LanguageIDsMac = IntConstant(
        "Language ID for #PLATFORM_ID_MAC.",

        "MAC_LANG_ENGLISH".."0",
        "MAC_LANG_ARABIC".."12",
        "MAC_LANG_DUTCH".."4",
        "MAC_LANG_FRENCH".."1",
        "MAC_LANG_GERMAN".."2",
        "MAC_LANG_HEBREW".."10",
        "MAC_LANG_ITALIAN".."3",
        "MAC_LANG_JAPANESE".."11",
        "MAC_LANG_KOREAN".."23",
        "MAC_LANG_RUSSIAN".."32",
        "MAC_LANG_SPANISH".."6",
        "MAC_LANG_SWEDISH".."5",
        "MAC_LANG_CHINESE_SIMPLIFIED".."33",
        "MAC_LANG_CHINESE_TRAD".."19"
    ).javaDocLinks

    int(
        "FindMatchingFont",
        """
        Returns the offset (not index) of the font that matches, or -1 if none.

        If you use STBTT_MACSTYLE_DONTCARE, use a font name like "Arial Bold". If you use any other flag, use a font name like "Arial"; this checks the
        {@code macStyle} header field; I don't know if fonts set this consistently.
        """,

        Unsafe..unsigned_char.const.p("fontdata", "the font data"),
        charUTF8.const.p("name", "the font name"),
        int("flags", "the style flags", StyleFlags)
    )

    intb(
        "CompareUTF8toUTF16_bigendian",
        """
        Returns 1/0 whether the first string interpreted as utf8 is identical to the second string interpreted as big-endian utf16... useful for strings
        returned from #GetFontNameString().
        """,

        char.const.p("s1", "the first string"),
        AutoSize("s1")..int("len1", "the length of the first string, in bytes"),
        char.const.p("s2", "the second string"),
        AutoSize("s2")..int("len2", "the length of the second string, in bytes")
    )

    char.const.p(
        "GetFontNameString",
        """
        Returns the string (which may be big-endian double byte, e.g. for unicode) and puts the length in bytes in {@code *length}.

        See the truetype spec:
        ${ul(
            url("https://developer.apple.com/fonts/TrueType-Reference-Manual/RM06/Chap6name.html", "TrueType Reference Manual - The 'name' table"),
            url("http://www.microsoft.com/typography/otspec/name.htm", "OpenType™ Specification - The Naming Table")
        )}
        """,

        stbtt_fontinfo.const.p("font", "an ##STBTTFontinfo struct"),
        AutoSizeResult..int.p("length", "returns the string length, in bytes"),
        int("platformID", "the platform ID", PlatformIDs),
        int("encodingID", "the encoding ID", "$EncodingIDsUnicode $EncodingIDsMicrosoft $EncodingIDsMac"),
        int("languageID", "the language ID", "$LanguageIDsMicrosoft $LanguageIDsMac"),
        int("nameID", "the name ID")
    )
}