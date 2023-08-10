/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.stb;

import javax.annotation.*;

import java.nio.*;

import org.lwjgl.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.MemoryStack.*;
import static org.lwjgl.system.MemoryUtil.*;

/**
 * Native bindings to stb_truetype.h from the <a href="https://github.com/nothings/stb">stb library</a>.
 * 
 * <p>This library processes TrueType files:</p>
 * 
 * <ul>
 * <li>parse files</li>
 * <li>extract glyph metrics</li>
 * <li>extract glyph shapes</li>
 * <li>render glyphs to one-channel bitmaps with antialiasing (box filter)</li>
 * </ul>
 * 
 * <h3>ADDITIONAL DOCUMENTATION</h3>
 * 
 * <p>Some important concepts to understand to use this library:</p>
 * 
 * <h4>Codepoint</h4>
 * 
 * <p>Characters are defined by unicode codepoints, e.g. 65 is uppercase A, 231 is lowercase c with a cedilla, 0x7e30 is the hiragana for "ma".</p>
 * 
 * <h4>Glyph</h4>
 * 
 * <p>A visual character shape (every codepoint is rendered as some glyph)</p>
 * 
 * <h4>Glyph index</h4>
 * 
 * <p>A font-specific integer ID representing a glyph</p>
 * 
 * <h4>Baseline</h4>
 * 
 * <p>Glyph shapes are defined relative to a baseline, which is the bottom of uppercase characters. Characters extend both above and below the baseline.</p>
 * 
 * <h4>Current Point</h4>
 * 
 * <p>As you draw text to the screen, you keep track of a "current point" which is the origin of each character. The current point's vertical position is the
 * baseline. Even "baked fonts" use this model.</p>
 * 
 * <h4>Vertical Font Metrics</h4>
 * 
 * <p>The vertical qualities of the font, used to vertically position and space the characters. See docs for {@link #stbtt_GetFontVMetrics GetFontVMetrics}.</p>
 * 
 * <h4>Font Size in Pixels or Points</h4>
 * 
 * <p>The preferred interface for specifying font sizes in stb_truetype is to specify how tall the font's vertical extent should be in pixels. If that sounds
 * good enough, skip the next paragraph.</p>
 * 
 * <p>Most font APIs instead use "points", which are a common typographic measurement for describing font size, defined as 72 points per inch. stb_truetype
 * provides a point API for compatibility. However, true "per inch" conventions don't make much sense on computer displays since different monitors have
 * different number of pixels per inch. For example, Windows traditionally uses a convention that there are 96 pixels per inch, thus making 'inch'
 * measurements have nothing to do with inches, and thus effectively defining a point to be 1.333 pixels. Additionally, the TrueType font data provides an
 * explicit scale factor to scale a given font's glyphs to points, but the author has observed that this scale factor is often wrong for non-commercial
 * fonts, thus making fonts scaled in points according to the TrueType spec incoherently sized in practice.</p>
 * 
 * <h3>DETAILED USAGE</h3>
 * 
 * <h4>Scale:</h4>
 * 
 * <p>Select how high you want the font to be, in points or pixels. Call #()ScaleForPixelHeight or {@link #stbtt_ScaleForMappingEmToPixels ScaleForMappingEmToPixels} to compute a scale factor
 * {@code SF} that will be used by all other functions.</p>
 * 
 * <h4>Baseline:</h4>
 * 
 * <p>You need to select a y-coordinate that is the baseline of where your text will appear. Call {@link #stbtt_GetFontBoundingBox GetFontBoundingBox} to get the baseline-relative bounding
 * box for all characters. {@code SF*-y0} will be the distance in pixels that the worst-case character could extend above the baseline, so if you want the
 * top edge of characters to appear at the top of the screen where {@code y=0}, then you would set the baseline to {@code SF*-y0}.</p>
 * 
 * <h4>Current point:</h4>
 * 
 * <p>Set the current point where the first character will appear. The first character could extend left of the current point; this is font dependent. You
 * can either choose a current point that is the leftmost point and hope, or add some padding, or check the bounding box or left-side-bearing of the first
 * character to be displayed and set the current point based on that.</p>
 * 
 * <h4>Displaying a character:</h4>
 * 
 * <p>Compute the bounding box of the character. It will contain signed values relative to {@code <current_point, baseline>}. I.e. if it returns
 * {@code x0,y0,x1,y1}, then the character should be displayed in the rectangle from {@code <current_point+SF*x0, baseline+SF*y0>} to
 * {@code <current_point+SF*x1,baseline+SF*y1)}.</p>
 * 
 * <h4>Advancing for the next character:</h4>
 * 
 * <p>Call {@link #stbtt_GetGlyphHMetrics GetGlyphHMetrics}, and compute {@code current_point += SF * advance}.</p>
 * 
 * <h3>ADVANCED USAGE</h3>
 * 
 * <p>Quality:</p>
 * 
 * <ul>
 * <li>Use the functions with Subpixel at the end to allow your characters to have subpixel positioning. Since the font is anti-aliased, not hinted, this
 * is very important for quality. (This is not possible with baked fonts.)</li>
 * <li>Kerning is now supported, and if you're supporting subpixel rendering then kerning is worth using to give your text a polished look.</li>
 * </ul>
 * 
 * <p>Performance:</p>
 * 
 * <ul>
 * <li>Convert Unicode codepoints to glyph indexes and operate on the glyphs; if you don't do this, stb_truetype is forced to do the conversion on every
 * call.</li>
 * <li>There are a lot of memory allocations. We should modify it to take a temp buffer and allocate from the temp buffer (without freeing), should help
 * performance a lot.</li>
 * </ul>
 * 
 * <h3>NOTES</h3>
 * 
 * <p>The system uses the raw data found in the .ttf file without changing it and without building auxiliary data structures. This is a bit inefficient on
 * little-endian systems (the data is big-endian), but assuming you're caching the bitmaps or glyph shapes this shouldn't be a big deal.</p>
 * 
 * <p>It appears to be very hard to programmatically determine what font a given file is in a general way. I provide an API for this, but I don't recommend
 * it.</p>
 * 
 * <h3>SAMPLE PROGRAMS</h3>
 * 
 * <p>Incomplete text-in-3d-api example, which draws quads properly aligned to be lossless:</p>
 * 
 * <pre><code>
 * unsigned char ttf_buffer[1&lt;&lt;20];
 * unsigned char temp_bitmap[512*512];
 * 
 * stbtt_bakedchar cdata[96]; // ASCII 32..126 is 95 glyphs
 * GLuint ftex;
 * 
 * void my_stbtt_initfont(void)
 * {
 *    fread(ttf_buffer, 1, 1&lt;&lt;20, fopen("c:/windows/fonts/times.ttf", "rb"));
 *    stbtt_BakeFontBitmap(ttf_buffer,0, 32.0, temp_bitmap,512,512, 32,96, cdata); // no guarantee this fits!
 *    // can free ttf_buffer at this point
 *    glGenTextures(1, &amp;ftex);
 *    glBindTexture(GL_TEXTURE_2D, ftex);
 *    glTexImage2D(GL_TEXTURE_2D, 0, GL_ALPHA, 512,512, 0, GL_ALPHA, GL_UNSIGNED_BYTE, temp_bitmap);
 *    // can free temp_bitmap at this point
 *    glTexParameteri(GL_TEXTURE_2D, GL_TEXTURE_MIN_FILTER, GL_LINEAR);
 * }
 * 
 * void my_stbtt_print(float x, float y, char *text)
 * {
 *    // assume orthographic projection with units = screen pixels, origin at top left
 *    glEnable(GL_TEXTURE_2D);
 *    glBindTexture(GL_TEXTURE_2D, ftex);
 *    glBegin(GL_QUADS);
 *    while (*text) {
 *       if (*text &ge; 32 &amp;&amp; *text &lt; 128) {
 *          stbtt_aligned_quad q;
 *          stbtt_GetBakedQuad(cdata, 512,512, *text-32, &amp;x,&amp;y,&amp;q,1);//1=opengl &amp; d3d10+,0=d3d9
 *          glTexCoord2f(q.s0,q.t1); glVertex2f(q.x0,q.y0);
 *          glTexCoord2f(q.s1,q.t1); glVertex2f(q.x1,q.y0);
 *          glTexCoord2f(q.s1,q.t0); glVertex2f(q.x1,q.y1);
 *          glTexCoord2f(q.s0,q.t0); glVertex2f(q.x0,q.y1);
 *       }
 *       ++text;
 *    }
 *    glEnd();
 * }</code></pre>
 * 
 * <p>Complete program (this compiles): get a single bitmap, print as ASCII art:</p>
 * 
 * <pre><code>
 * char ttf_buffer[1&lt;&lt;25];
 * 
 * int main(int argc, char **argv)
 * {
 *    stbtt_fontinfo font;
 *    unsigned char *bitmap;
 *    int w,h,i,j,c = (argc &gt; 1 ? atoi(argv[1]) : 'a'), s = (argc &gt; 2 ? atoi(argv[2]) : 20);
 * 
 *    fread(ttf_buffer, 1, 1&lt;&lt;25, fopen(argc &gt; 3 ? argv[3] : "c:/windows/fonts/arialbd.ttf", "rb"));
 * 
 *    stbtt_InitFont(&amp;font, ttf_buffer, stbtt_GetFontOffsetForIndex(ttf_buffer,0));
 *    bitmap = stbtt_GetCodepointBitmap(&amp;font, 0,stbtt_ScaleForPixelHeight(&amp;font, s), c, &amp;w, &amp;h, 0,0);
 * 
 *    for (j=0; j &lt; h; ++j) {
 *       for (i=0; i &lt; w; ++i)
 *          putchar(" .:ioVM@"[bitmap[j*w+i]&gt;&gt;5]);
 *       putchar('\n');
 *    }
 *    return 0;
 * }</code></pre>
 * 
 * <p>Complete program: print "Hello World!" banner, with bugs:</p>
 * 
 * <pre><code>
 * char buffer[24&lt;&lt;20];
 * unsigned char screen[20][79];
 * 
 * int main(int arg, char **argv)
 * {
 *    stbtt_fontinfo font;
 *    int i,j,ascent,baseline,ch=0;
 *    float scale, xpos=2; // leave a little padding in case the character extends left
 *    char *text = "Heljo World!";
 * 
 *    fread(buffer, 1, 1000000, fopen("c:/windows/fonts/arialbd.ttf", "rb"));
 *    stbtt_InitFont(&amp;font, buffer, 0);
 * 
 *    scale = stbtt_ScaleForPixelHeight(&amp;font, 15);
 *    stbtt_GetFontVMetrics(&amp;font, &amp;ascent,0,0);
 *    baseline = (int) (ascent*scale);
 * 
 *    while (text[ch]) {
 *       int advance,lsb,x0,y0,x1,y1;
 *       float x_shift = xpos - (float) floor(xpos);
 *       stbtt_GetCodepointHMetrics(&amp;font, text[ch], &amp;advance, &amp;lsb);
 *       stbtt_GetCodepointBitmapBoxSubpixel(&amp;font, text[ch], scale,scale,x_shift,0, &amp;x0,&amp;y0,&amp;x1,&amp;y1);
 *       stbtt_MakeCodepointBitmapSubpixel(&amp;font, &amp;screen[baseline + y0][(int) xpos + x0], x1-x0,y1-y0, 79, scale,scale,x_shift,0, text[ch]);
 *       // note that this stomps the old data, so where character boxes overlap (e.g. 'lj') it's wrong
 *       // because this API is really for baking character bitmaps into textures. if you want to render
 *       // a sequence of characters, you really need to render each bitmap to a temp buffer, then
 *       // "alpha blend" that into the working buffer
 *       xpos += (advance * scale);
 *       if (text[ch+1])
 *          xpos += scale*stbtt_GetCodepointKernAdvance(&amp;font, text[ch],text[ch+1]);
 *       ++ch;
 *    }
 * 
 *    for (j=0; j &lt; 20; ++j) {
 *       for (i=0; i &lt; 78; ++i)
 *          putchar(" .:ioVM@"[screen[j][i]&gt;&gt;5]);
 *       putchar('\n');
 *    }
 * 
 *    return 0;
 * }</code></pre>
 * 
 * <h3>Finding the right font...</h3>
 * 
 * <p>You should really just solve this offline, keep your own tables of what font is what, and don't try to get it out of the .ttf file. That's because
 * getting it out of the .ttf file is really hard, because the names in the file can appear in many possible encodings, in many possible languages, and
 * e.g. if you need a case-insensitive comparison, the details of that depend on the encoding &amp; language in a complex way (actually underspecified in
 * truetype, but also gigantic).</p>
 * 
 * <p>But you can use the provided functions in two possible ways:</p>
 * 
 * <ul>
 * <li>{@link #stbtt_FindMatchingFont FindMatchingFont} will use *case-sensitive* comparisons on unicode-encoded names to try to find the font you want; you can run this before
 * calling {@link #stbtt_InitFont InitFont}</li>
 * <li>{@link #stbtt_GetFontNameString GetFontNameString} lets you get any of the various strings from the file yourself and do your own comparisons on them. You have to have called
 * {@link #stbtt_InitFont InitFont} first.</li>
 * </ul>
 */
public class STBTruetype {

    static { LibSTB.initialize(); }

    /** Vertex type. */
    public static final byte
        STBTT_vmove  = 1,
        STBTT_vline  = 2,
        STBTT_vcurve = 3,
        STBTT_vcubic = 4;

    /** Style flags, use in {@link #stbtt_FindMatchingFont FindMatchingFont}. */
    public static final int
        STBTT_MACSTYLE_DONTCARE   = 0,
        STBTT_MACSTYLE_BOLD       = 1,
        STBTT_MACSTYLE_ITALIC     = 2,
        STBTT_MACSTYLE_UNDERSCORE = 4,
        STBTT_MACSTYLE_NONE       = 8;

    /** Platform IDs. */
    public static final int
        STBTT_PLATFORM_ID_UNICODE   = 0,
        STBTT_PLATFORM_ID_MAC       = 1,
        STBTT_PLATFORM_ID_ISO       = 2,
        STBTT_PLATFORM_ID_MICROSOFT = 3;

    /** Encoding IDs for {@link #STBTT_PLATFORM_ID_UNICODE PLATFORM_ID_UNICODE}. */
    public static final int
        STBTT_UNICODE_EID_UNICODE_1_0      = 0,
        STBTT_UNICODE_EID_UNICODE_1_1      = 1,
        STBTT_UNICODE_EID_ISO_10646        = 2,
        STBTT_UNICODE_EID_UNICODE_2_0_BMP  = 3,
        STBTT_UNICODE_EID_UNICODE_2_0_FULL = 4;

    /** Encoding IDs for {@link #STBTT_PLATFORM_ID_MICROSOFT PLATFORM_ID_MICROSOFT}. */
    public static final int
        STBTT_MS_EID_SYMBOL       = 0,
        STBTT_MS_EID_UNICODE_BMP  = 1,
        STBTT_MS_EID_SHIFTJIS     = 2,
        STBTT_MS_EID_UNICODE_FULL = 10;

    /** Encoding IDs for {@link #STBTT_PLATFORM_ID_MAC PLATFORM_ID_MAC}. */
    public static final int
        STBTT_MAC_EID_ROMAN        = 0,
        STBTT_MAC_EID_JAPANESE     = 1,
        STBTT_MAC_EID_CHINESE_TRAD = 2,
        STBTT_MAC_EID_KOREAN       = 3,
        STBTT_MAC_EID_ARABIC       = 4,
        STBTT_MAC_EID_HEBREW       = 5,
        STBTT_MAC_EID_GREEK        = 6,
        STBTT_MAC_EID_RUSSIAN      = 7;

    /** Language ID for {@link #STBTT_PLATFORM_ID_MICROSOFT PLATFORM_ID_MICROSOFT}. */
    public static final int
        STBTT_MS_LANG_ENGLISH  = 0x409,
        STBTT_MS_LANG_CHINESE  = 0x804,
        STBTT_MS_LANG_DUTCH    = 0x413,
        STBTT_MS_LANG_FRENCH   = 0x40C,
        STBTT_MS_LANG_GERMAN   = 0x407,
        STBTT_MS_LANG_HEBREW   = 0x40D,
        STBTT_MS_LANG_ITALIAN  = 0x410,
        STBTT_MS_LANG_JAPANESE = 0x411,
        STBTT_MS_LANG_KOREAN   = 0x412,
        STBTT_MS_LANG_RUSSIAN  = 0x419,
        STBTT_MS_LANG_SPANISH  = 0x409,
        STBTT_MS_LANG_SWEDISH  = 0x41D;

    /** Language ID for {@link #STBTT_PLATFORM_ID_MAC PLATFORM_ID_MAC}. */
    public static final int
        STBTT_MAC_LANG_ENGLISH            = 0,
        STBTT_MAC_LANG_ARABIC             = 12,
        STBTT_MAC_LANG_DUTCH              = 4,
        STBTT_MAC_LANG_FRENCH             = 1,
        STBTT_MAC_LANG_GERMAN             = 2,
        STBTT_MAC_LANG_HEBREW             = 10,
        STBTT_MAC_LANG_ITALIAN            = 3,
        STBTT_MAC_LANG_JAPANESE           = 11,
        STBTT_MAC_LANG_KOREAN             = 23,
        STBTT_MAC_LANG_RUSSIAN            = 32,
        STBTT_MAC_LANG_SPANISH            = 6,
        STBTT_MAC_LANG_SWEDISH            = 5,
        STBTT_MAC_LANG_CHINESE_SIMPLIFIED = 33,
        STBTT_MAC_LANG_CHINESE_TRAD       = 19;

    protected STBTruetype() {
        throw new UnsupportedOperationException();
    }

    // --- [ stbtt_BakeFontBitmap ] ---

    /**
     * Unsafe version of: {@link #stbtt_BakeFontBitmap BakeFontBitmap}
     *
     * @param num_chars the number of characters to bake, starting at {@code first_char}
     */
    public static native int nstbtt_BakeFontBitmap(long data, int offset, float pixel_height, long pixels, int pw, int ph, int first_char, int num_chars, long chardata);

    /**
     * Bakes a font to a bitmap for use as texture.
     * 
     * <p>This uses a very simply packing, use with {@link #stbtt_GetBakedQuad GetBakedQuad}.</p>
     *
     * @param data         the font data
     * @param pixel_height the font height, in pixels
     * @param pixels       a buffer in which to write the font bitmap
     * @param pw           the bitmap width, in pixels
     * @param ph           the bitmap height, in pixels
     * @param first_char   the first character to bake
     * @param chardata     an array of {@link STBTTBakedChar} structs, it's {@code num_chars} long
     *
     * @return if positive, the first unused row of the bitmap. If negative, returns the negative of the number of characters that fit. If 0, no characters fit and no
     *         rows were used.
     */
    public static int stbtt_BakeFontBitmap(@NativeType("unsigned char const *") ByteBuffer data, float pixel_height, @NativeType("unsigned char *") ByteBuffer pixels, int pw, int ph, int first_char, @NativeType("stbtt_bakedchar *") STBTTBakedChar.Buffer chardata) {
        if (CHECKS) {
            check(pixels, pw * ph);
        }
        return nstbtt_BakeFontBitmap(memAddress(data), 0, pixel_height, memAddress(pixels), pw, ph, first_char, chardata.remaining(), chardata.address());
    }

    // --- [ stbtt_GetBakedQuad ] ---

    /** Unsafe version of: {@link #stbtt_GetBakedQuad GetBakedQuad} */
    public static native void nstbtt_GetBakedQuad(long chardata, int pw, int ph, int char_index, long xpos, long ypos, long q, int opengl_fillrule);

    /**
     * Computes quad to draw for a given char and advances the current position.
     * 
     * <p>The coordinate system used assumes y increases downwards. Characters will extend both above and below the current position; see discussion of
     * "BASELINE" above.</p>
     *
     * @param chardata        an array of {@link STBTTBakedChar} structs
     * @param pw              the bitmap width, in pixels
     * @param ph              the bitmap height, in pixels
     * @param char_index      the character index in the {@code chardata} array
     * @param xpos            the current x position, in screen pixel space
     * @param ypos            the current y position, in screen pixel space
     * @param q               an {@link STBTTAlignedQuad} struct in which to return the quad to draw
     * @param opengl_fillrule 1 if opengl fill rule; 0 if DX9 or earlier
     */
    public static void stbtt_GetBakedQuad(@NativeType("stbtt_bakedchar const *") STBTTBakedChar.Buffer chardata, int pw, int ph, int char_index, @NativeType("float *") FloatBuffer xpos, @NativeType("float *") FloatBuffer ypos, @NativeType("stbtt_aligned_quad *") STBTTAlignedQuad q, @NativeType("int") boolean opengl_fillrule) {
        if (CHECKS) {
            check(chardata, char_index + 1);
            check(xpos, 1);
            check(ypos, 1);
        }
        nstbtt_GetBakedQuad(chardata.address(), pw, ph, char_index, memAddress(xpos), memAddress(ypos), q.address(), opengl_fillrule ? 1 : 0);
    }

    // --- [ stbtt_GetScaledFontVMetrics ] ---

    /** Unsafe version of: {@link #stbtt_GetScaledFontVMetrics GetScaledFontVMetrics} */
    public static native void nstbtt_GetScaledFontVMetrics(long fontdata, int index, float size, long ascent, long descent, long lineGap);

    /**
     * Query the font vertical metrics without having to create a font first.
     *
     * @param index   the font index (use 0 if you don't know what that is)
     * @param size    the font height, in pixels
     * @param ascent  returns the coordinate above the baseline the font extends
     * @param descent returns the coordinate below the baseline the font extends (i.e. it is typically negative)
     * @param lineGap returns the spacing between one row's descent and the next row's ascent
     */
    public static void stbtt_GetScaledFontVMetrics(@NativeType("unsigned char const *") ByteBuffer fontdata, int index, float size, @NativeType("float *") FloatBuffer ascent, @NativeType("float *") FloatBuffer descent, @NativeType("float *") FloatBuffer lineGap) {
        if (CHECKS) {
            check(ascent, 1);
            check(descent, 1);
            check(lineGap, 1);
        }
        nstbtt_GetScaledFontVMetrics(memAddress(fontdata), index, size, memAddress(ascent), memAddress(descent), memAddress(lineGap));
    }

    // --- [ stbtt_PackBegin ] ---

    /** Unsafe version of: {@link #stbtt_PackBegin PackBegin} */
    public static native int nstbtt_PackBegin(long spc, long pixels, int width, int height, int stride_in_bytes, int padding, long alloc_context);

    /**
     * Initializes a packing context stored in the passed-in {@code stbtt_pack_context}. Future calls using this context will pack characters into the bitmap
     * passed in here: a 1-channel bitmap that is width x height.
     *
     * @param spc             an {@link STBTTPackContext} struct
     * @param pixels          a buffer in which to store the bitmap data
     * @param width           the bitmap width, in pixels
     * @param height          the bitmap height, in pixels
     * @param stride_in_bytes the distance from one row to the next (or 0 to mean they are packed tightly together)
     * @param padding         the amount of padding to leave between each character (normally you want '1' for bitmaps you'll use as textures with bilinear filtering)
     * @param alloc_context   a pointer to an allocation context
     *
     * @return 1 on success, 0 on failure
     */
    @NativeType("int")
    public static boolean stbtt_PackBegin(@NativeType("stbtt_pack_context *") STBTTPackContext spc, @Nullable @NativeType("unsigned char *") ByteBuffer pixels, int width, int height, int stride_in_bytes, int padding, @NativeType("void *") long alloc_context) {
        if (CHECKS) {
            checkSafe(pixels, (stride_in_bytes != 0 ? stride_in_bytes : width) * height);
        }
        return nstbtt_PackBegin(spc.address(), memAddressSafe(pixels), width, height, stride_in_bytes, padding, alloc_context) != 0;
    }

    /**
     * Initializes a packing context stored in the passed-in {@code stbtt_pack_context}. Future calls using this context will pack characters into the bitmap
     * passed in here: a 1-channel bitmap that is width x height.
     *
     * @param spc             an {@link STBTTPackContext} struct
     * @param pixels          a buffer in which to store the bitmap data
     * @param width           the bitmap width, in pixels
     * @param height          the bitmap height, in pixels
     * @param stride_in_bytes the distance from one row to the next (or 0 to mean they are packed tightly together)
     * @param padding         the amount of padding to leave between each character (normally you want '1' for bitmaps you'll use as textures with bilinear filtering)
     *
     * @return 1 on success, 0 on failure
     */
    @NativeType("int")
    public static boolean stbtt_PackBegin(@NativeType("stbtt_pack_context *") STBTTPackContext spc, @Nullable @NativeType("unsigned char *") ByteBuffer pixels, int width, int height, int stride_in_bytes, int padding) {
        if (CHECKS) {
            checkSafe(pixels, (stride_in_bytes != 0 ? stride_in_bytes : width) * height);
        }
        return nstbtt_PackBegin(spc.address(), memAddressSafe(pixels), width, height, stride_in_bytes, padding, NULL) != 0;
    }

    // --- [ stbtt_PackEnd ] ---

    /** Unsafe version of: {@link #stbtt_PackEnd PackEnd} */
    public static native void nstbtt_PackEnd(long spc);

    /**
     * Cleans up the packing context and frees all memory.
     *
     * @param spc an {@link STBTTPackContext} struct
     */
    public static void stbtt_PackEnd(@NativeType("stbtt_pack_context *") STBTTPackContext spc) {
        nstbtt_PackEnd(spc.address());
    }

    // --- [ STBTT_POINT_SIZE ] ---

    /**
     * Converts the full height of a character from ascender to descender, as computed by {@link #stbtt_ScaleForPixelHeight ScaleForPixelHeight}, to a point size as computed by
     * {@link #stbtt_ScaleForMappingEmToPixels ScaleForMappingEmToPixels}.
     *
     * @param font_size the full height of a character
     *
     * @return the point size of the character
     */
    public static int STBTT_POINT_SIZE(int font_size) {
        return -font_size;
    }

    // --- [ stbtt_PackFontRange ] ---

    /**
     * Unsafe version of: {@link #stbtt_PackFontRange PackFontRange}
     *
     * @param num_chars_in_range the number of unicode code points in the range
     */
    public static native int nstbtt_PackFontRange(long spc, long fontdata, int font_index, float font_size, int first_unicode_char_in_range, int num_chars_in_range, long chardata_for_range);

    /**
     * Creates character bitmaps from the {@code font_index}'th font found in fontdata (use {@code font_index=0} if you don't know what that is). It creates
     * {@code num_chars_in_range} bitmaps for characters with unicode values starting at {@code first_unicode_char_in_range} and increasing. Data for how to
     * render them is stored in {@code chardata_for_range}; pass these to {@link #stbtt_GetPackedQuad GetPackedQuad} to get back renderable quads.
     *
     * @param spc                         an {@link STBTTPackContext} struct
     * @param fontdata                    the font data
     * @param font_index                  the font index (use 0 if you don't know what that is
     * @param font_size                   the full height of the character from ascender to descender, as computed by {@link #stbtt_ScaleForPixelHeight ScaleForPixelHeight}. To use a point size as computed by
     *                                    {@link #stbtt_ScaleForMappingEmToPixels ScaleForMappingEmToPixels}, wrap the font size in {@link #STBTT_POINT_SIZE} and pass the result, i.e.:
     *                                    
     *                                    <pre><code>
     *                                    ...,                  20 , ... // font max minus min y is 20 pixels tall
     *                                    ..., STBTT_POINT_SIZE(20), ... // 'M' is 20 pixels tall</code></pre>
     * @param first_unicode_char_in_range the first unicode code point in the range
     * @param chardata_for_range          an array of {@link STBTTPackedchar} structs
     *
     * @return 1 on success, 0 on failure
     */
    @NativeType("int")
    public static boolean stbtt_PackFontRange(@NativeType("stbtt_pack_context *") STBTTPackContext spc, @NativeType("unsigned char const *") ByteBuffer fontdata, int font_index, float font_size, int first_unicode_char_in_range, @NativeType("stbtt_packedchar *") STBTTPackedchar.Buffer chardata_for_range) {
        return nstbtt_PackFontRange(spc.address(), memAddress(fontdata), font_index, font_size, first_unicode_char_in_range, chardata_for_range.remaining(), chardata_for_range.address()) != 0;
    }

    // --- [ stbtt_PackFontRanges ] ---

    /**
     * Unsafe version of: {@link #stbtt_PackFontRanges PackFontRanges}
     *
     * @param num_ranges the number of {@link STBTTPackRange} structs in {@code ranges}
     */
    public static native int nstbtt_PackFontRanges(long spc, long fontdata, int font_index, long ranges, int num_ranges);

    /**
     * Creates character bitmaps from multiple ranges of characters stored in ranges. This will usually create a better-packed bitmap than multiple calls to
     * {@link #stbtt_PackFontRange PackFontRange}. Note that you can call this multiple times within a single {@link #stbtt_PackBegin PackBegin}/{@link #stbtt_PackEnd PackEnd}.
     *
     * @param spc        an {@link STBTTPackContext} struct
     * @param fontdata   the font data
     * @param font_index the font index (use 0 if you don't know what that is)
     * @param ranges     an array of {@link STBTTPackRange} structs
     *
     * @return 1 on success, 0 on failure
     */
    @NativeType("int")
    public static boolean stbtt_PackFontRanges(@NativeType("stbtt_pack_context *") STBTTPackContext spc, @NativeType("unsigned char const *") ByteBuffer fontdata, int font_index, @NativeType("stbtt_pack_range *") STBTTPackRange.Buffer ranges) {
        if (CHECKS) {
            Struct.validate(ranges.address(), ranges.remaining(), STBTTPackRange.SIZEOF, STBTTPackRange::validate);
        }
        return nstbtt_PackFontRanges(spc.address(), memAddress(fontdata), font_index, ranges.address(), ranges.remaining()) != 0;
    }

    // --- [ stbtt_PackSetOversampling ] ---

    /** Unsafe version of: {@link #stbtt_PackSetOversampling PackSetOversampling} */
    public static native void nstbtt_PackSetOversampling(long spc, int h_oversample, int v_oversample);

    /**
     * Oversampling a font increases the quality by allowing higher-quality subpixel positioning, and is especially valuable at smaller text sizes.
     * 
     * <p>This function sets the amount of oversampling for all following calls to {@link #stbtt_PackFontRange PackFontRange} or {@link #stbtt_PackFontRangesGatherRects PackFontRangesGatherRects} for a given pack context. The
     * default (no oversampling) is achieved by {@code h_oversample=1, v_oversample=1}. The total number of pixels required is
     * {@code h_oversample*v_oversample} larger than the default; for example, 2x2 oversampling requires 4x the storage of 1x1. For best results, render
     * oversampled textures with bilinear filtering. Look at the readme in
     * <a href="https://github.com/nothings/stb/blob/master/tests/oversample/README.md">stb/tests/oversample</a> for information about oversampled fonts.</p>
     * 
     * <p>To use with PackFontRangesGather etc., you must set it before calls to {@link #stbtt_PackFontRangesGatherRects PackFontRangesGatherRects}.</p>
     *
     * @param spc          an {@link STBTTPackContext} struct
     * @param h_oversample the horizontal oversampling amount
     * @param v_oversample the vertical oversampling amount
     */
    public static void stbtt_PackSetOversampling(@NativeType("stbtt_pack_context *") STBTTPackContext spc, @NativeType("unsigned int") int h_oversample, @NativeType("unsigned int") int v_oversample) {
        nstbtt_PackSetOversampling(spc.address(), h_oversample, v_oversample);
    }

    // --- [ stbtt_PackSetSkipMissingCodepoints ] ---

    /** Unsafe version of: {@link #stbtt_PackSetSkipMissingCodepoints PackSetSkipMissingCodepoints} */
    public static native void nstbtt_PackSetSkipMissingCodepoints(long spc, int skip);

    /**
     * If {@code skip != 0}, this tells stb_truetype to skip any codepoints for which there is no corresponding glyph. If {@code skip=0}, which is the
     * default, then codepoints without a glyph recived the font's "missing character" glyph, typically an empty box by convention.
     *
     * @param spc  an {@link STBTTPackContext} struct
     * @param skip the skip flag
     */
    public static void stbtt_PackSetSkipMissingCodepoints(@NativeType("stbtt_pack_context *") STBTTPackContext spc, @NativeType("int") boolean skip) {
        nstbtt_PackSetSkipMissingCodepoints(spc.address(), skip ? 1 : 0);
    }

    // --- [ stbtt_GetPackedQuad ] ---

    /** Unsafe version of: {@link #stbtt_GetPackedQuad GetPackedQuad} */
    public static native void nstbtt_GetPackedQuad(long chardata, int pw, int ph, int char_index, long xpos, long ypos, long q, int align_to_integer);

    /**
     * Computes quad to draw for a given char and advances the current position.
     * 
     * <p>The coordinate system used assumes y increases downwards. Characters will extend both above and below the current position; see discussion of
     * "BASELINE" above.</p>
     *
     * @param chardata         an array of {@link STBTTPackedchar} structs
     * @param pw               the bitmap width, in pixels
     * @param ph               the bitmap height, in pixels
     * @param char_index       the character index in the {@code chardata} array
     * @param xpos             the current x position, in screen pixel space
     * @param ypos             the current y position, in screen pixel space
     * @param q                an {@link STBTTAlignedQuad} struct in which to return the quad to draw
     * @param align_to_integer 1 to align the quad to integer coordinates
     */
    public static void stbtt_GetPackedQuad(@NativeType("stbtt_packedchar const *") STBTTPackedchar.Buffer chardata, int pw, int ph, int char_index, @NativeType("float *") FloatBuffer xpos, @NativeType("float *") FloatBuffer ypos, @NativeType("stbtt_aligned_quad *") STBTTAlignedQuad q, @NativeType("int") boolean align_to_integer) {
        if (CHECKS) {
            check(chardata, char_index + 1);
            check(xpos, 1);
            check(ypos, 1);
        }
        nstbtt_GetPackedQuad(chardata.address(), pw, ph, char_index, memAddress(xpos), memAddress(ypos), q.address(), align_to_integer ? 1 : 0);
    }

    // --- [ stbtt_PackFontRangesGatherRects ] ---

    /**
     * Unsafe version of: {@link #stbtt_PackFontRangesGatherRects PackFontRangesGatherRects}
     *
     * @param num_ranges the number of {@link STBTTPackRange} structs in {@code ranges}
     */
    public static native int nstbtt_PackFontRangesGatherRects(long spc, long info, long ranges, int num_ranges, long rects);

    /**
     * Calling these functions in sequence is roughly equivalent to calling {@link #stbtt_PackFontRanges PackFontRanges}. If you want more control over the packing of multiple fonts, or
     * if you want to pack custom data into a font texture, take a look at the source of {@link #stbtt_PackFontRanges PackFontRanges} and create a custom version using these functions,
     * e.g. call {@link #stbtt_PackFontRangesGatherRects PackFontRangesGatherRects} multiple times, building up a single array of rects, then call {@link #stbtt_PackFontRangesPackRects PackFontRangesPackRects} once, then call
     * {@link #stbtt_PackFontRangesRenderIntoRects PackFontRangesRenderIntoRects} repeatedly. This may result in a better packing than calling {@link #stbtt_PackFontRanges PackFontRanges} multiple times (or it may not).
     *
     * @param spc    an {@link STBTTPackContext} struct
     * @param info   an {@link STBTTFontinfo} struct
     * @param ranges an array of {@link STBTTPackRange} structs
     * @param rects  an array of {@link STBRPRect} structs. It must be big enough to accommodate all characters in the given ranges.
     *
     * @return the number of structs written in {@code rects}
     */
    public static int stbtt_PackFontRangesGatherRects(@NativeType("stbtt_pack_context *") STBTTPackContext spc, @NativeType("stbtt_fontinfo *") STBTTFontinfo info, @NativeType("stbtt_pack_range *") STBTTPackRange.Buffer ranges, @NativeType("stbrp_rect *") STBRPRect.Buffer rects) {
        if (CHECKS) {
            Struct.validate(ranges.address(), ranges.remaining(), STBTTPackRange.SIZEOF, STBTTPackRange::validate);
        }
        return nstbtt_PackFontRangesGatherRects(spc.address(), info.address(), ranges.address(), ranges.remaining(), rects.address());
    }

    // --- [ stbtt_PackFontRangesPackRects ] ---

    /**
     * Unsafe version of: {@link #stbtt_PackFontRangesPackRects PackFontRangesPackRects}
     *
     * @param num_rects the number of structs in {@code rects}
     */
    public static native void nstbtt_PackFontRangesPackRects(long spc, long rects, int num_rects);

    /**
     * See {@link #stbtt_PackFontRangesGatherRects PackFontRangesGatherRects}.
     *
     * @param spc   an {@link STBTTPackContext} struct
     * @param rects an array of {@link STBRPRect} structs
     */
    public static void stbtt_PackFontRangesPackRects(@NativeType("stbtt_pack_context *") STBTTPackContext spc, @NativeType("stbrp_rect *") STBRPRect.Buffer rects) {
        nstbtt_PackFontRangesPackRects(spc.address(), rects.address(), rects.remaining());
    }

    // --- [ stbtt_PackFontRangesRenderIntoRects ] ---

    /**
     * Unsafe version of: {@link #stbtt_PackFontRangesRenderIntoRects PackFontRangesRenderIntoRects}
     *
     * @param num_ranges the number of {@link STBTTPackRange} structs in {@code ranges}
     */
    public static native int nstbtt_PackFontRangesRenderIntoRects(long spc, long info, long ranges, int num_ranges, long rects);

    /**
     * See {@link #stbtt_PackFontRangesGatherRects PackFontRangesGatherRects}.
     *
     * @param spc    an {@link STBTTPackContext} struct
     * @param info   an {@link STBTTFontinfo} struct
     * @param ranges an array of {@link STBTTPackRange} structs
     * @param rects  an array of {@link STBRPRect} structs. It must be big enough to accommodate all characters in the given ranges.
     *
     * @return 1 on success, 0 on failure
     */
    @NativeType("int")
    public static boolean stbtt_PackFontRangesRenderIntoRects(@NativeType("stbtt_pack_context *") STBTTPackContext spc, @NativeType("stbtt_fontinfo *") STBTTFontinfo info, @NativeType("stbtt_pack_range *") STBTTPackRange.Buffer ranges, @NativeType("stbrp_rect *") STBRPRect.Buffer rects) {
        if (CHECKS) {
            Struct.validate(ranges.address(), ranges.remaining(), STBTTPackRange.SIZEOF, STBTTPackRange::validate);
        }
        return nstbtt_PackFontRangesRenderIntoRects(spc.address(), info.address(), ranges.address(), ranges.remaining(), rects.address()) != 0;
    }

    // --- [ stbtt_GetNumberOfFonts ] ---

    /** Unsafe version of: {@link #stbtt_GetNumberOfFonts GetNumberOfFonts} */
    public static native int nstbtt_GetNumberOfFonts(long data);

    /**
     * Determines the number of fonts in a font file.
     * 
     * <p>TrueType collection (.ttc) files may contain multiple fonts, while TrueType font (.ttf) files only contain one font. The number of fonts can be used
     * for indexing with {@link #stbtt_GetFontOffsetForIndex GetFontOffsetForIndex} where the index is between zero and one less than the total fonts. If an error occurs, -1 is returned.</p>
     *
     * @param data the font data
     */
    public static int stbtt_GetNumberOfFonts(@NativeType("unsigned char const *") ByteBuffer data) {
        return nstbtt_GetNumberOfFonts(memAddress(data));
    }

    // --- [ stbtt_GetFontOffsetForIndex ] ---

    /** Unsafe version of: {@link #stbtt_GetFontOffsetForIndex GetFontOffsetForIndex} */
    public static native int nstbtt_GetFontOffsetForIndex(long data, int index);

    /**
     * Each .ttf/.ttc file may have more than one font. Each font has a sequential index number starting from 0. Call this function to get the font offset for
     * a given index; it returns -1 if the index is out of range. A regular .ttf file will only define one font and it always be at offset 0, so it will
     * return '0' for index 0, and -1 for all other indices.
     *
     * @param data  the font data
     * @param index the font index
     */
    public static int stbtt_GetFontOffsetForIndex(@NativeType("unsigned char const *") ByteBuffer data, int index) {
        return nstbtt_GetFontOffsetForIndex(memAddress(data), index);
    }

    // --- [ stbtt_InitFont ] ---

    /** Unsafe version of: {@link #stbtt_InitFont InitFont} */
    public static native int nstbtt_InitFont(long info, long data, int offset);

    /**
     * Given an offset into the file that defines a font, this function builds the necessary cached info for the rest of the system. You must allocate the
     * {@link STBTTFontinfo} yourself, and stbtt_InitFont will fill it out. You don't need to do anything special to free it, because the contents are pure value
     * data with no additional data structures.
     *
     * @param info   an {@link STBTTFontinfo} struct
     * @param data   the font data
     * @param offset the font data offset
     *
     * @return 1 on success, 0 on failure
     */
    @NativeType("int")
    public static boolean stbtt_InitFont(@NativeType("stbtt_fontinfo *") STBTTFontinfo info, @NativeType("unsigned char const *") ByteBuffer data, int offset) {
        return nstbtt_InitFont(info.address(), memAddress(data), offset) != 0;
    }

    /**
     * Given an offset into the file that defines a font, this function builds the necessary cached info for the rest of the system. You must allocate the
     * {@link STBTTFontinfo} yourself, and stbtt_InitFont will fill it out. You don't need to do anything special to free it, because the contents are pure value
     * data with no additional data structures.
     *
     * @param info an {@link STBTTFontinfo} struct
     * @param data the font data
     *
     * @return 1 on success, 0 on failure
     */
    @NativeType("int")
    public static boolean stbtt_InitFont(@NativeType("stbtt_fontinfo *") STBTTFontinfo info, @NativeType("unsigned char const *") ByteBuffer data) {
        return nstbtt_InitFont(info.address(), memAddress(data), 0) != 0;
    }

    // --- [ stbtt_FindGlyphIndex ] ---

    /** Unsafe version of: {@link #stbtt_FindGlyphIndex FindGlyphIndex} */
    public static native int nstbtt_FindGlyphIndex(long info, int unicode_codepoint);

    /**
     * If you're going to perform multiple operations on the same character and you want a speed-up, call this function with the character you're going to
     * process, then use glyph-based functions instead of the codepoint-based functions.
     *
     * @param info              an {@link STBTTFontinfo} struct
     * @param unicode_codepoint the unicode code point
     *
     * @return the glyph index or 0 if the character codepoint is not defined in the font
     */
    public static int stbtt_FindGlyphIndex(@NativeType("stbtt_fontinfo const *") STBTTFontinfo info, int unicode_codepoint) {
        return nstbtt_FindGlyphIndex(info.address(), unicode_codepoint);
    }

    // --- [ stbtt_ScaleForPixelHeight ] ---

    /** Unsafe version of: {@link #stbtt_ScaleForPixelHeight ScaleForPixelHeight} */
    public static native float nstbtt_ScaleForPixelHeight(long info, float pixels);

    /**
     * Computes a scale factor to produce a font whose "height" is {@code pixels} tall. Height is measured as the distance from the highest ascender to the
     * lowest descender; in other words, it's equivalent to calling {@link #stbtt_GetFontVMetrics GetFontVMetrics} and computing:
     * 
     * <pre><code>
     * scale = pixels / (ascent - descent)</code></pre>
     * 
     * <p>so if you prefer to measure height by the ascent only, use a similar calculation.</p>
     *
     * @param info   an {@link STBTTFontinfo} struct
     * @param pixels the font height, in pixels
     *
     * @return the scale factor
     */
    public static float stbtt_ScaleForPixelHeight(@NativeType("stbtt_fontinfo const *") STBTTFontinfo info, float pixels) {
        return nstbtt_ScaleForPixelHeight(info.address(), pixels);
    }

    // --- [ stbtt_ScaleForMappingEmToPixels ] ---

    /** Unsafe version of: {@link #stbtt_ScaleForMappingEmToPixels ScaleForMappingEmToPixels} */
    public static native float nstbtt_ScaleForMappingEmToPixels(long info, float pixels);

    /**
     * Computes a scale factor to produce a font whose EM size is mapped to {@code pixels} tall. This is probably what traditional APIs compute, but I'm not
     * positive.
     *
     * @param info   an {@link STBTTFontinfo} struct
     * @param pixels the font height, in pixels
     *
     * @return the scale factor
     */
    public static float stbtt_ScaleForMappingEmToPixels(@NativeType("stbtt_fontinfo const *") STBTTFontinfo info, float pixels) {
        return nstbtt_ScaleForMappingEmToPixels(info.address(), pixels);
    }

    // --- [ stbtt_GetFontVMetrics ] ---

    /** Unsafe version of: {@link #stbtt_GetFontVMetrics GetFontVMetrics} */
    public static native void nstbtt_GetFontVMetrics(long info, long ascent, long descent, long lineGap);

    /**
     * Returns vertical metrics for the specified font. You should advance the vertical position by {@code *ascent - *descent + *lineGap}
     * 
     * <p>The returned values are expressed in unscaled coordinates, so you must multiply by the scale factor for a given size.</p>
     *
     * @param info    an {@link STBTTFontinfo} struct
     * @param ascent  returns the coordinate above the baseline the font extends
     * @param descent returns the coordinate below the baseline the font extends (i.e. it is typically negative)
     * @param lineGap returns the spacing between one row's descent and the next row's ascent
     */
    public static void stbtt_GetFontVMetrics(@NativeType("stbtt_fontinfo const *") STBTTFontinfo info, @Nullable @NativeType("int *") IntBuffer ascent, @Nullable @NativeType("int *") IntBuffer descent, @Nullable @NativeType("int *") IntBuffer lineGap) {
        if (CHECKS) {
            checkSafe(ascent, 1);
            checkSafe(descent, 1);
            checkSafe(lineGap, 1);
        }
        nstbtt_GetFontVMetrics(info.address(), memAddressSafe(ascent), memAddressSafe(descent), memAddressSafe(lineGap));
    }

    // --- [ stbtt_GetFontVMetricsOS2 ] ---

    /** Unsafe version of: {@link #stbtt_GetFontVMetricsOS2 GetFontVMetricsOS2} */
    public static native int nstbtt_GetFontVMetricsOS2(long info, long typoAscent, long typoDescent, long typoLineGap);

    /**
     * Analogous to {@link #stbtt_GetFontVMetrics GetFontVMetrics}, but returns the "typographic" values from the OS/2 table (specific to MS/Windows TTF files).
     *
     * @param info        an {@link STBTTFontinfo} struct
     * @param typoAscent  returns the coordinate above the baseline the font extends
     * @param typoDescent returns the coordinate below the baseline the font extends (i.e. it is typically negative)
     * @param typoLineGap returns the spacing between one row's descent and the next row's ascent
     *
     * @return 1 on success (table present), 0 on failure
     */
    @NativeType("int")
    public static boolean stbtt_GetFontVMetricsOS2(@NativeType("stbtt_fontinfo const *") STBTTFontinfo info, @Nullable @NativeType("int *") IntBuffer typoAscent, @Nullable @NativeType("int *") IntBuffer typoDescent, @Nullable @NativeType("int *") IntBuffer typoLineGap) {
        if (CHECKS) {
            checkSafe(typoAscent, 1);
            checkSafe(typoDescent, 1);
            checkSafe(typoLineGap, 1);
        }
        return nstbtt_GetFontVMetricsOS2(info.address(), memAddressSafe(typoAscent), memAddressSafe(typoDescent), memAddressSafe(typoLineGap)) != 0;
    }

    // --- [ stbtt_GetFontBoundingBox ] ---

    /** Unsafe version of: {@link #stbtt_GetFontBoundingBox GetFontBoundingBox} */
    public static native void nstbtt_GetFontBoundingBox(long info, long x0, long y0, long x1, long y1);

    /**
     * Returns the bounding box around all possible characters.
     *
     * @param info an {@link STBTTFontinfo} struct
     * @param x0   the left coordinate
     * @param y0   the bottom coordinate
     * @param x1   the right coordinate
     * @param y1   the top coordinate
     */
    public static void stbtt_GetFontBoundingBox(@NativeType("stbtt_fontinfo const *") STBTTFontinfo info, @NativeType("int *") IntBuffer x0, @NativeType("int *") IntBuffer y0, @NativeType("int *") IntBuffer x1, @NativeType("int *") IntBuffer y1) {
        if (CHECKS) {
            check(x0, 1);
            check(y0, 1);
            check(x1, 1);
            check(y1, 1);
        }
        nstbtt_GetFontBoundingBox(info.address(), memAddress(x0), memAddress(y0), memAddress(x1), memAddress(y1));
    }

    // --- [ stbtt_GetCodepointHMetrics ] ---

    /** Unsafe version of: {@link #stbtt_GetCodepointHMetrics GetCodepointHMetrics} */
    public static native void nstbtt_GetCodepointHMetrics(long info, int codepoint, long advanceWidth, long leftSideBearing);

    /**
     * Returns horizontal metrics for the specified codepoint.
     * 
     * <p>The returned values are expressed in unscaled coordinates.</p>
     *
     * @param info            an {@link STBTTFontinfo} struct
     * @param codepoint       the unicode codepoint
     * @param advanceWidth    the offset from the current horizontal position to the next horizontal position
     * @param leftSideBearing the offset from the current horizontal position to the left edge of the character
     */
    public static void stbtt_GetCodepointHMetrics(@NativeType("stbtt_fontinfo const *") STBTTFontinfo info, int codepoint, @Nullable @NativeType("int *") IntBuffer advanceWidth, @Nullable @NativeType("int *") IntBuffer leftSideBearing) {
        if (CHECKS) {
            checkSafe(advanceWidth, 1);
            checkSafe(leftSideBearing, 1);
        }
        nstbtt_GetCodepointHMetrics(info.address(), codepoint, memAddressSafe(advanceWidth), memAddressSafe(leftSideBearing));
    }

    // --- [ stbtt_GetCodepointKernAdvance ] ---

    /** Unsafe version of: {@link #stbtt_GetCodepointKernAdvance GetCodepointKernAdvance} */
    public static native int nstbtt_GetCodepointKernAdvance(long info, int ch1, int ch2);

    /**
     * Returns the additional amount to add to the {@code advance} value between {@code ch1} and {@code ch2}.
     *
     * @param info an {@link STBTTFontinfo} struct
     * @param ch1  the first unicode codepoint
     * @param ch2  the second unicode codepoint
     */
    public static int stbtt_GetCodepointKernAdvance(@NativeType("stbtt_fontinfo const *") STBTTFontinfo info, int ch1, int ch2) {
        return nstbtt_GetCodepointKernAdvance(info.address(), ch1, ch2);
    }

    // --- [ stbtt_GetCodepointBox ] ---

    /** Unsafe version of: {@link #stbtt_GetCodepointBox GetCodepointBox} */
    public static native int nstbtt_GetCodepointBox(long info, int codepoint, long x0, long y0, long x1, long y1);

    /**
     * Gets the bounding box of the visible part of the glyph, in unscaled coordinates.
     *
     * @param info      an {@link STBTTFontinfo} struct
     * @param codepoint the unicode codepoint
     * @param x0        returns the left coordinate
     * @param y0        returns the bottom coordinate
     * @param x1        returns the right coordinate
     * @param y1        returns the top coordinate
     */
    @NativeType("int")
    public static boolean stbtt_GetCodepointBox(@NativeType("stbtt_fontinfo const *") STBTTFontinfo info, int codepoint, @Nullable @NativeType("int *") IntBuffer x0, @Nullable @NativeType("int *") IntBuffer y0, @Nullable @NativeType("int *") IntBuffer x1, @Nullable @NativeType("int *") IntBuffer y1) {
        if (CHECKS) {
            checkSafe(x0, 1);
            checkSafe(y0, 1);
            checkSafe(x1, 1);
            checkSafe(y1, 1);
        }
        return nstbtt_GetCodepointBox(info.address(), codepoint, memAddressSafe(x0), memAddressSafe(y0), memAddressSafe(x1), memAddressSafe(y1)) != 0;
    }

    // --- [ stbtt_GetGlyphHMetrics ] ---

    /** Unsafe version of: {@link #stbtt_GetGlyphHMetrics GetGlyphHMetrics} */
    public static native void nstbtt_GetGlyphHMetrics(long info, int glyph_index, long advanceWidth, long leftSideBearing);

    /**
     * Glyph version of {@link #stbtt_GetCodepointHMetrics GetCodepointHMetrics}, for greater efficiency.
     *
     * @param info            an {@link STBTTFontinfo} struct
     * @param glyph_index     the glyph index
     * @param advanceWidth    the offset from the current horizontal position to the next horizontal position
     * @param leftSideBearing the offset from the current horizontal position to the left edge of the character
     */
    public static void stbtt_GetGlyphHMetrics(@NativeType("stbtt_fontinfo const *") STBTTFontinfo info, int glyph_index, @Nullable @NativeType("int *") IntBuffer advanceWidth, @Nullable @NativeType("int *") IntBuffer leftSideBearing) {
        if (CHECKS) {
            checkSafe(advanceWidth, 1);
            checkSafe(leftSideBearing, 1);
        }
        nstbtt_GetGlyphHMetrics(info.address(), glyph_index, memAddressSafe(advanceWidth), memAddressSafe(leftSideBearing));
    }

    // --- [ stbtt_GetGlyphKernAdvance ] ---

    /** Unsafe version of: {@link #stbtt_GetGlyphKernAdvance GetGlyphKernAdvance} */
    public static native int nstbtt_GetGlyphKernAdvance(long info, int glyph1, int glyph2);

    /**
     * Glyph version of {@link #stbtt_GetCodepointKernAdvance GetCodepointKernAdvance}, for greater efficiency.
     *
     * @param info   an {@link STBTTFontinfo} struct
     * @param glyph1 the first glyph index
     * @param glyph2 the second glyph index
     */
    public static int stbtt_GetGlyphKernAdvance(@NativeType("stbtt_fontinfo const *") STBTTFontinfo info, int glyph1, int glyph2) {
        return nstbtt_GetGlyphKernAdvance(info.address(), glyph1, glyph2);
    }

    // --- [ stbtt_GetGlyphBox ] ---

    /** Unsafe version of: {@link #stbtt_GetGlyphBox GetGlyphBox} */
    public static native int nstbtt_GetGlyphBox(long info, int glyph_index, long x0, long y0, long x1, long y1);

    /**
     * Glyph version of {@link #stbtt_GetCodepointBox GetCodepointBox}, for greater efficiency.
     *
     * @param info        an {@link STBTTFontinfo} struct
     * @param glyph_index the glyph index
     * @param x0          returns the left coordinate
     * @param y0          returns the bottom coordinate
     * @param x1          returns the right coordinate
     * @param y1          returns the top coordinate
     */
    @NativeType("int")
    public static boolean stbtt_GetGlyphBox(@NativeType("stbtt_fontinfo const *") STBTTFontinfo info, int glyph_index, @Nullable @NativeType("int *") IntBuffer x0, @Nullable @NativeType("int *") IntBuffer y0, @Nullable @NativeType("int *") IntBuffer x1, @Nullable @NativeType("int *") IntBuffer y1) {
        if (CHECKS) {
            checkSafe(x0, 1);
            checkSafe(y0, 1);
            checkSafe(x1, 1);
            checkSafe(y1, 1);
        }
        return nstbtt_GetGlyphBox(info.address(), glyph_index, memAddressSafe(x0), memAddressSafe(y0), memAddressSafe(x1), memAddressSafe(y1)) != 0;
    }

    // --- [ stbtt_GetKerningTableLength ] ---

    public static native int nstbtt_GetKerningTableLength(long info);

    public static int stbtt_GetKerningTableLength(@NativeType("stbtt_fontinfo const *") STBTTFontinfo info) {
        return nstbtt_GetKerningTableLength(info.address());
    }

    // --- [ stbtt_GetKerningTable ] ---

    /** Unsafe version of: {@link #stbtt_GetKerningTable GetKerningTable} */
    public static native int nstbtt_GetKerningTable(long info, long table, int table_length);

    /**
     * Retrieves a complete list of all of the kerning pairs provided by the font.
     * 
     * <p>{@code stbtt_GetKerningTable} never writes more than {@code table_length} entries and returns how many entries it did write. The table will be sorted
     * by {@code (a.glyph1 == b.glyph1)?(a.glyph2 < b.glyph2):(a.glyph1 < b.glyph1)}</p>
     */
    public static int stbtt_GetKerningTable(@NativeType("stbtt_fontinfo const *") STBTTFontinfo info, @NativeType("stbtt_kerningentry *") STBTTKerningentry.Buffer table) {
        return nstbtt_GetKerningTable(info.address(), table.address(), table.remaining());
    }

    // --- [ stbtt_IsGlyphEmpty ] ---

    /** Unsafe version of: {@link #stbtt_IsGlyphEmpty IsGlyphEmpty} */
    public static native int nstbtt_IsGlyphEmpty(long info, int glyph_index);

    /**
     * Returns non-zero if nothing is drawn for this glyph.
     *
     * @param info        an {@link STBTTFontinfo} struct
     * @param glyph_index the glyph index
     */
    @NativeType("int")
    public static boolean stbtt_IsGlyphEmpty(@NativeType("stbtt_fontinfo const *") STBTTFontinfo info, int glyph_index) {
        return nstbtt_IsGlyphEmpty(info.address(), glyph_index) != 0;
    }

    // --- [ stbtt_GetCodepointShape ] ---

    /** Unsafe version of: {@link #stbtt_GetCodepointShape GetCodepointShape} */
    public static native int nstbtt_GetCodepointShape(long info, int unicode_codepoint, long vertices);

    /**
     * Returns number of vertices and fills {@code *vertices} with the pointer to them
     * 
     * <p>The shape is a series of contours. Each one starts with a {@link #STBTT_vmove vmove}, then consists of a series of mixed {@link #STBTT_vline vline} and {@link #STBTT_vcurve vcurve} segments. A {@link #STBTT_vline vline} draws a
     * line from previous endpoint to its {@code x,y}; a {@link #STBTT_vcurve vcurve} draws a quadratic bezier from previous endpoint to its {@code x,y}, using {@code cx,cy} as
     * the bezier control point.</p>
     * 
     * <p>The {@link STBTTVertex} values are expressed in "unscaled" coordinates.</p>
     *
     * @param info              an {@link STBTTFontinfo} struct
     * @param unicode_codepoint the unicode codepoint
     * @param vertices          returns a pointer to an array of {@link STBTTVertex} structs
     */
    public static int stbtt_GetCodepointShape(@NativeType("stbtt_fontinfo const *") STBTTFontinfo info, int unicode_codepoint, @NativeType("stbtt_vertex **") PointerBuffer vertices) {
        if (CHECKS) {
            check(vertices, 1);
        }
        return nstbtt_GetCodepointShape(info.address(), unicode_codepoint, memAddress(vertices));
    }

    /**
     * Returns number of vertices and fills {@code *vertices} with the pointer to them
     * 
     * <p>The shape is a series of contours. Each one starts with a {@link #STBTT_vmove vmove}, then consists of a series of mixed {@link #STBTT_vline vline} and {@link #STBTT_vcurve vcurve} segments. A {@link #STBTT_vline vline} draws a
     * line from previous endpoint to its {@code x,y}; a {@link #STBTT_vcurve vcurve} draws a quadratic bezier from previous endpoint to its {@code x,y}, using {@code cx,cy} as
     * the bezier control point.</p>
     * 
     * <p>The {@link STBTTVertex} values are expressed in "unscaled" coordinates.</p>
     *
     * @param info              an {@link STBTTFontinfo} struct
     * @param unicode_codepoint the unicode codepoint
     */
    @Nullable
    @NativeType("int")
    public static STBTTVertex.Buffer stbtt_GetCodepointShape(@NativeType("stbtt_fontinfo const *") STBTTFontinfo info, int unicode_codepoint) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            PointerBuffer vertices = stack.pointers(NULL);
            int __result = nstbtt_GetCodepointShape(info.address(), unicode_codepoint, memAddress(vertices));
            return STBTTVertex.createSafe(vertices.get(0), __result);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ stbtt_GetGlyphShape ] ---

    /** Unsafe version of: {@link #stbtt_GetGlyphShape GetGlyphShape} */
    public static native int nstbtt_GetGlyphShape(long info, int glyph_index, long vertices);

    /**
     * Glyph version of {@link #stbtt_GetCodepointShape GetCodepointShape}, for greater efficiency.
     *
     * @param info        an {@link STBTTFontinfo} struct
     * @param glyph_index the unicode codepoint
     * @param vertices    returns a pointer to an array of {@link STBTTVertex} structs
     */
    public static int stbtt_GetGlyphShape(@NativeType("stbtt_fontinfo const *") STBTTFontinfo info, int glyph_index, @NativeType("stbtt_vertex **") PointerBuffer vertices) {
        if (CHECKS) {
            check(vertices, 1);
        }
        return nstbtt_GetGlyphShape(info.address(), glyph_index, memAddress(vertices));
    }

    /**
     * Glyph version of {@link #stbtt_GetCodepointShape GetCodepointShape}, for greater efficiency.
     *
     * @param info        an {@link STBTTFontinfo} struct
     * @param glyph_index the unicode codepoint
     */
    @Nullable
    @NativeType("int")
    public static STBTTVertex.Buffer stbtt_GetGlyphShape(@NativeType("stbtt_fontinfo const *") STBTTFontinfo info, int glyph_index) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            PointerBuffer vertices = stack.pointers(NULL);
            int __result = nstbtt_GetGlyphShape(info.address(), glyph_index, memAddress(vertices));
            return STBTTVertex.createSafe(vertices.get(0), __result);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ stbtt_FreeShape ] ---

    /** Unsafe version of: {@link #stbtt_FreeShape FreeShape} */
    public static native void nstbtt_FreeShape(long info, long vertices);

    /**
     * Frees the data allocated by {@link #stbtt_GetCodepointShape GetCodepointShape} and {@link #stbtt_GetGlyphShape GetGlyphShape}.
     *
     * @param info     an {@link STBTTFontinfo} struct
     * @param vertices the array of {@link STBTTVertex} structs to free
     */
    public static void stbtt_FreeShape(@NativeType("stbtt_fontinfo const *") STBTTFontinfo info, @NativeType("stbtt_vertex *") STBTTVertex.Buffer vertices) {
        if (CHECKS) {
            check(vertices, 1);
        }
        nstbtt_FreeShape(info.address(), vertices.address());
    }

    // --- [ stbtt_FindSVGDoc ] ---

    public static native long nstbtt_FindSVGDoc(long info, int gl);

    @NativeType("unsigned char *")
    public static long stbtt_FindSVGDoc(@NativeType("stbtt_fontinfo const *") STBTTFontinfo info, int gl) {
        return nstbtt_FindSVGDoc(info.address(), gl);
    }

    // --- [ stbtt_GetCodepointSVG ] ---

    /** Unsafe version of: {@link #stbtt_GetCodepointSVG GetCodepointSVG} */
    public static native int nstbtt_GetCodepointSVG(long info, int unicode_codepoint, long svg);

    /**
     * Fills {@code svg} with the character's SVG data.
     *
     * @return data size or 0 if SVG not found
     */
    public static int stbtt_GetCodepointSVG(@NativeType("stbtt_fontinfo const *") STBTTFontinfo info, int unicode_codepoint, @NativeType("char const **") PointerBuffer svg) {
        if (CHECKS) {
            check(svg, 1);
        }
        return nstbtt_GetCodepointSVG(info.address(), unicode_codepoint, memAddress(svg));
    }

    // --- [ stbtt_GetGlyphSVG ] ---

    /** Unsafe version of: {@link #stbtt_GetGlyphSVG GetGlyphSVG} */
    public static native int nstbtt_GetGlyphSVG(long info, int gl, long svg);

    /**
     * Fills {@code svg} with the character's SVG data.
     *
     * @return data size or 0 if SVG not found
     */
    public static int stbtt_GetGlyphSVG(@NativeType("stbtt_fontinfo const *") STBTTFontinfo info, int gl, @NativeType("char const **") PointerBuffer svg) {
        if (CHECKS) {
            check(svg, 1);
        }
        return nstbtt_GetGlyphSVG(info.address(), gl, memAddress(svg));
    }

    // --- [ stbtt_FreeBitmap ] ---

    /** Unsafe version of: {@link #stbtt_FreeBitmap FreeBitmap} */
    public static native void nstbtt_FreeBitmap(long bitmap, long userdata);

    /**
     * Frees a bitmap allocated by {@link #stbtt_GetCodepointBitmap GetCodepointBitmap}, {@link #stbtt_GetCodepointBitmapSubpixel GetCodepointBitmapSubpixel}, {@link #stbtt_GetGlyphBitmap GetGlyphBitmap} or {@link #stbtt_GetGlyphBitmapSubpixel GetGlyphBitmapSubpixel}.
     *
     * @param bitmap   the bitmap to free
     * @param userdata a pointer to an allocation context
     */
    public static void stbtt_FreeBitmap(@NativeType("unsigned char *") ByteBuffer bitmap, @NativeType("void *") long userdata) {
        nstbtt_FreeBitmap(memAddress(bitmap), userdata);
    }

    /**
     * Frees a bitmap allocated by {@link #stbtt_GetCodepointBitmap GetCodepointBitmap}, {@link #stbtt_GetCodepointBitmapSubpixel GetCodepointBitmapSubpixel}, {@link #stbtt_GetGlyphBitmap GetGlyphBitmap} or {@link #stbtt_GetGlyphBitmapSubpixel GetGlyphBitmapSubpixel}.
     *
     * @param bitmap the bitmap to free
     */
    public static void stbtt_FreeBitmap(@NativeType("unsigned char *") ByteBuffer bitmap) {
        nstbtt_FreeBitmap(memAddress(bitmap), NULL);
    }

    // --- [ stbtt_GetCodepointBitmap ] ---

    /** Unsafe version of: {@link #stbtt_GetCodepointBitmap GetCodepointBitmap} */
    public static native long nstbtt_GetCodepointBitmap(long info, float scale_x, float scale_y, int codepoint, long width, long height, long xoff, long yoff);

    /**
     * Allocates a large-enough single-channel 8bpp bitmap and renders the specified character/glyph at the specified scale into it, with antialiasing.
     *
     * @param info      an {@link STBTTFontinfo} struct
     * @param scale_x   the horizontal scale
     * @param scale_y   the vertical scale
     * @param codepoint the unicode codepoint to render
     * @param width     returns the bitmap width
     * @param height    returns the bitmap height
     * @param xoff      returns the horizontal offset in pixel space from the glyph origin to the left of the bitmap
     * @param yoff      returns the vertical offset in pixel space from the glyph origin to the top of the bitmap
     */
    @Nullable
    @NativeType("unsigned char *")
    public static ByteBuffer stbtt_GetCodepointBitmap(@NativeType("stbtt_fontinfo const *") STBTTFontinfo info, float scale_x, float scale_y, int codepoint, @NativeType("int *") IntBuffer width, @NativeType("int *") IntBuffer height, @Nullable @NativeType("int *") IntBuffer xoff, @Nullable @NativeType("int *") IntBuffer yoff) {
        if (CHECKS) {
            check(width, 1);
            check(height, 1);
            checkSafe(xoff, 1);
            checkSafe(yoff, 1);
        }
        long __result = nstbtt_GetCodepointBitmap(info.address(), scale_x, scale_y, codepoint, memAddress(width), memAddress(height), memAddressSafe(xoff), memAddressSafe(yoff));
        return memByteBufferSafe(__result, width.get(width.position()) * height.get(height.position()));
    }

    // --- [ stbtt_GetCodepointBitmapSubpixel ] ---

    /** Unsafe version of: {@link #stbtt_GetCodepointBitmapSubpixel GetCodepointBitmapSubpixel} */
    public static native long nstbtt_GetCodepointBitmapSubpixel(long info, float scale_x, float scale_y, float shift_x, float shift_y, int codepoint, long width, long height, long xoff, long yoff);

    /**
     * Same as {@link #stbtt_GetCodepointBitmap GetCodepointBitmap}, but you can specify a subpixel shift for the character.
     *
     * @param info      an {@link STBTTFontinfo} struct
     * @param scale_x   the horizontal scale
     * @param scale_y   the vertical scale
     * @param shift_x   the horizontal subpixel shift
     * @param shift_y   the vertical subpixel shift
     * @param codepoint the unicode codepoint to render
     * @param width     returns the bitmap width
     * @param height    returns the bitmap height
     * @param xoff      returns the horizontal offset in pixel space from the glyph origin to the left of the bitmap
     * @param yoff      returns the vertical offset in pixel space from the glyph origin to the top of the bitmap
     */
    @Nullable
    @NativeType("unsigned char *")
    public static ByteBuffer stbtt_GetCodepointBitmapSubpixel(@NativeType("stbtt_fontinfo const *") STBTTFontinfo info, float scale_x, float scale_y, float shift_x, float shift_y, int codepoint, @NativeType("int *") IntBuffer width, @NativeType("int *") IntBuffer height, @Nullable @NativeType("int *") IntBuffer xoff, @Nullable @NativeType("int *") IntBuffer yoff) {
        if (CHECKS) {
            check(width, 1);
            check(height, 1);
            checkSafe(xoff, 1);
            checkSafe(yoff, 1);
        }
        long __result = nstbtt_GetCodepointBitmapSubpixel(info.address(), scale_x, scale_y, shift_x, shift_y, codepoint, memAddress(width), memAddress(height), memAddressSafe(xoff), memAddressSafe(yoff));
        return memByteBufferSafe(__result, width.get(width.position()) * height.get(height.position()));
    }

    // --- [ stbtt_MakeCodepointBitmap ] ---

    /** Unsafe version of: {@link #stbtt_MakeCodepointBitmap MakeCodepointBitmap} */
    public static native void nstbtt_MakeCodepointBitmap(long info, long output, int out_w, int out_h, int out_stride, float scale_x, float scale_y, int codepoint);

    /**
     * Same as {@link #stbtt_GetCodepointBitmap GetCodepointBitmap}, but you pass in storage for the bitmap in the form of {@code output}, with row spacing of {@code out_stride} bytes. The
     * bitmap is clipped to {@code out_w/out_h} bytes. Call {@link #stbtt_GetCodepointBitmapBox GetCodepointBitmapBox} to get the width and height and positioning info for it first.
     *
     * @param info       an {@link STBTTFontinfo} struct
     * @param output     the bitmap storage
     * @param out_w      the bitmap width
     * @param out_h      the bitmap height
     * @param out_stride the row stride, in bytes
     * @param scale_x    the horizontal scale
     * @param scale_y    the vertical scale
     * @param codepoint  the unicode codepoint to render
     */
    public static void stbtt_MakeCodepointBitmap(@NativeType("stbtt_fontinfo const *") STBTTFontinfo info, @NativeType("unsigned char *") ByteBuffer output, int out_w, int out_h, int out_stride, float scale_x, float scale_y, int codepoint) {
        if (CHECKS) {
            check(output, (out_stride != 0 ? out_stride : out_w) * out_h);
        }
        nstbtt_MakeCodepointBitmap(info.address(), memAddress(output), out_w, out_h, out_stride, scale_x, scale_y, codepoint);
    }

    // --- [ stbtt_MakeCodepointBitmapSubpixel ] ---

    /** Unsafe version of: {@link #stbtt_MakeCodepointBitmapSubpixel MakeCodepointBitmapSubpixel} */
    public static native void nstbtt_MakeCodepointBitmapSubpixel(long info, long output, int out_w, int out_h, int out_stride, float scale_x, float scale_y, float shift_x, float shift_y, int codepoint);

    /**
     * Same as {@link #stbtt_MakeCodepointBitmap MakeCodepointBitmap}, but you can specify a subpixel shift for the character.
     *
     * @param info       an {@link STBTTFontinfo} struct
     * @param output     the bitmap storage
     * @param out_w      the bitmap width
     * @param out_h      the bitmap height
     * @param out_stride the row stride, in bytes
     * @param scale_x    the horizontal scale
     * @param scale_y    the vertical scale
     * @param shift_x    the horizontal subpixel shift
     * @param shift_y    the vertical subpixel shift
     * @param codepoint  the unicode codepoint to render
     */
    public static void stbtt_MakeCodepointBitmapSubpixel(@NativeType("stbtt_fontinfo const *") STBTTFontinfo info, @NativeType("unsigned char *") ByteBuffer output, int out_w, int out_h, int out_stride, float scale_x, float scale_y, float shift_x, float shift_y, int codepoint) {
        if (CHECKS) {
            check(output, (out_stride != 0 ? out_stride : out_w) * out_h);
        }
        nstbtt_MakeCodepointBitmapSubpixel(info.address(), memAddress(output), out_w, out_h, out_stride, scale_x, scale_y, shift_x, shift_y, codepoint);
    }

    // --- [ stbtt_MakeCodepointBitmapSubpixelPrefilter ] ---

    /** Unsafe version of: {@link #stbtt_MakeCodepointBitmapSubpixelPrefilter MakeCodepointBitmapSubpixelPrefilter} */
    public static native void nstbtt_MakeCodepointBitmapSubpixelPrefilter(long info, long output, int out_w, int out_h, int out_stride, float scale_x, float scale_y, float shift_x, float shift_y, int oversample_x, int oversample_y, long sub_x, long sub_y, int codepoint);

    /**
     * Same as {@link #stbtt_MakeCodepointBitmapSubpixel MakeCodepointBitmapSubpixel}, but prefiltering is performed (see {@link #stbtt_PackSetOversampling PackSetOversampling}).
     *
     * @param info         an {@link STBTTFontinfo} struct
     * @param output       the bitmap storage
     * @param out_w        the bitmap width
     * @param out_h        the bitmap height
     * @param out_stride   the row stride, in bytes
     * @param scale_x      the horizontal scale
     * @param scale_y      the vertical scale
     * @param shift_x      the horizontal subpixel shift
     * @param shift_y      the vertical subpixel shift
     * @param oversample_x the horizontal oversampling amount
     * @param oversample_y the vertical oversampling amount
     * @param sub_x        returns the horizontal oversample shift
     * @param sub_y        returns the vertical oversample shift
     * @param codepoint    the unicode codepoint to render
     */
    public static void stbtt_MakeCodepointBitmapSubpixelPrefilter(@NativeType("stbtt_fontinfo const *") STBTTFontinfo info, @NativeType("unsigned char *") ByteBuffer output, int out_w, int out_h, int out_stride, float scale_x, float scale_y, float shift_x, float shift_y, int oversample_x, int oversample_y, @NativeType("float *") FloatBuffer sub_x, @NativeType("float *") FloatBuffer sub_y, int codepoint) {
        if (CHECKS) {
            check(output, (out_stride != 0 ? out_stride : out_w) * out_h);
            check(sub_x, 1);
            check(sub_y, 1);
        }
        nstbtt_MakeCodepointBitmapSubpixelPrefilter(info.address(), memAddress(output), out_w, out_h, out_stride, scale_x, scale_y, shift_x, shift_y, oversample_x, oversample_y, memAddress(sub_x), memAddress(sub_y), codepoint);
    }

    // --- [ stbtt_GetCodepointBitmapBox ] ---

    /** Unsafe version of: {@link #stbtt_GetCodepointBitmapBox GetCodepointBitmapBox} */
    public static native void nstbtt_GetCodepointBitmapBox(long font, int codepoint, float scale_x, float scale_y, long ix0, long iy0, long ix1, long iy1);

    /**
     * Get the bbox of the bitmap centered around the glyph origin; so the bitmap width is {@code ix1-ix0}, height is {@code iy1-iy0}, and location to place
     * the bitmap top left is {@code (leftSideBearing*scale,iy0)}.
     * 
     * <p>Note that the bitmap uses y-increases-down, but the shape uses y-increases-up, so {@code CodepointBitmapBox} and {@code CodepointBox} are inverted.</p>
     *
     * @param font      an {@link STBTTFontinfo} struct
     * @param codepoint the unicode codepoint
     * @param scale_x   the horizontal scale
     * @param scale_y   the vertical scale
     * @param ix0       returns the left coordinate
     * @param iy0       returns the bottom coordinate
     * @param ix1       returns the right coordinate
     * @param iy1       returns the top coordinate
     */
    public static void stbtt_GetCodepointBitmapBox(@NativeType("stbtt_fontinfo const *") STBTTFontinfo font, int codepoint, float scale_x, float scale_y, @Nullable @NativeType("int *") IntBuffer ix0, @Nullable @NativeType("int *") IntBuffer iy0, @Nullable @NativeType("int *") IntBuffer ix1, @Nullable @NativeType("int *") IntBuffer iy1) {
        if (CHECKS) {
            checkSafe(ix0, 1);
            checkSafe(iy0, 1);
            checkSafe(ix1, 1);
            checkSafe(iy1, 1);
        }
        nstbtt_GetCodepointBitmapBox(font.address(), codepoint, scale_x, scale_y, memAddressSafe(ix0), memAddressSafe(iy0), memAddressSafe(ix1), memAddressSafe(iy1));
    }

    // --- [ stbtt_GetCodepointBitmapBoxSubpixel ] ---

    /** Unsafe version of: {@link #stbtt_GetCodepointBitmapBoxSubpixel GetCodepointBitmapBoxSubpixel} */
    public static native void nstbtt_GetCodepointBitmapBoxSubpixel(long font, int codepoint, float scale_x, float scale_y, float shift_x, float shift_y, long ix0, long iy0, long ix1, long iy1);

    /**
     * Same as {@link #stbtt_GetCodepointBitmapBox GetCodepointBitmapBox}, but you can specify a subpixel shift for the character.
     *
     * @param font      an {@link STBTTFontinfo} struct
     * @param codepoint the unicode codepoint
     * @param scale_x   the horizontal scale
     * @param scale_y   the vertical scale
     * @param shift_x   the horizontal subpixel shift
     * @param shift_y   the vertical subpixel shift
     * @param ix0       returns the left coordinate
     * @param iy0       returns the bottom coordinate
     * @param ix1       returns the right coordinate
     * @param iy1       returns the top coordinate
     */
    public static void stbtt_GetCodepointBitmapBoxSubpixel(@NativeType("stbtt_fontinfo const *") STBTTFontinfo font, int codepoint, float scale_x, float scale_y, float shift_x, float shift_y, @Nullable @NativeType("int *") IntBuffer ix0, @Nullable @NativeType("int *") IntBuffer iy0, @Nullable @NativeType("int *") IntBuffer ix1, @Nullable @NativeType("int *") IntBuffer iy1) {
        if (CHECKS) {
            checkSafe(ix0, 1);
            checkSafe(iy0, 1);
            checkSafe(ix1, 1);
            checkSafe(iy1, 1);
        }
        nstbtt_GetCodepointBitmapBoxSubpixel(font.address(), codepoint, scale_x, scale_y, shift_x, shift_y, memAddressSafe(ix0), memAddressSafe(iy0), memAddressSafe(ix1), memAddressSafe(iy1));
    }

    // --- [ stbtt_GetGlyphBitmap ] ---

    /** Unsafe version of: {@link #stbtt_GetGlyphBitmap GetGlyphBitmap} */
    public static native long nstbtt_GetGlyphBitmap(long info, float scale_x, float scale_y, int glyph, long width, long height, long xoff, long yoff);

    /**
     * Allocates a large-enough single-channel 8bpp bitmap and renders the specified character/glyph at the specified scale into it, with antialiasing.
     *
     * @param info    an {@link STBTTFontinfo} struct
     * @param scale_x the horizontal scale
     * @param scale_y the vertical scale
     * @param glyph   the glyph index to render
     * @param width   returns the bitmap width
     * @param height  returns the bitmap height
     * @param xoff    returns the horizontal offset in pixel space from the glyph origin to the left of the bitmap
     * @param yoff    returns the vertical offset in pixel space from the glyph origin to the top of the bitmap
     */
    @Nullable
    @NativeType("unsigned char *")
    public static ByteBuffer stbtt_GetGlyphBitmap(@NativeType("stbtt_fontinfo const *") STBTTFontinfo info, float scale_x, float scale_y, int glyph, @NativeType("int *") IntBuffer width, @NativeType("int *") IntBuffer height, @Nullable @NativeType("int *") IntBuffer xoff, @Nullable @NativeType("int *") IntBuffer yoff) {
        if (CHECKS) {
            check(width, 1);
            check(height, 1);
            checkSafe(xoff, 1);
            checkSafe(yoff, 1);
        }
        long __result = nstbtt_GetGlyphBitmap(info.address(), scale_x, scale_y, glyph, memAddress(width), memAddress(height), memAddressSafe(xoff), memAddressSafe(yoff));
        return memByteBufferSafe(__result, width.get(width.position()) * height.get(height.position()));
    }

    // --- [ stbtt_GetGlyphBitmapSubpixel ] ---

    /** Unsafe version of: {@link #stbtt_GetGlyphBitmapSubpixel GetGlyphBitmapSubpixel} */
    public static native long nstbtt_GetGlyphBitmapSubpixel(long info, float scale_x, float scale_y, float shift_x, float shift_y, int glyph, long width, long height, long xoff, long yoff);

    /**
     * Same as {@link #stbtt_GetGlyphBitmap GetGlyphBitmap}, but you can specify a subpixel shift for the character.
     *
     * @param info    an {@link STBTTFontinfo} struct
     * @param scale_x the horizontal scale
     * @param scale_y the vertical scale
     * @param shift_x the horizontal subpixel shift
     * @param shift_y the vertical subpixel shift
     * @param glyph   the glyph index to render
     * @param width   returns the bitmap width
     * @param height  returns the bitmap height
     * @param xoff    returns the horizontal offset in pixel space from the glyph origin to the left of the bitmap
     * @param yoff    returns the vertical offset in pixel space from the glyph origin to the top of the bitmap
     */
    @Nullable
    @NativeType("unsigned char *")
    public static ByteBuffer stbtt_GetGlyphBitmapSubpixel(@NativeType("stbtt_fontinfo const *") STBTTFontinfo info, float scale_x, float scale_y, float shift_x, float shift_y, int glyph, @NativeType("int *") IntBuffer width, @NativeType("int *") IntBuffer height, @Nullable @NativeType("int *") IntBuffer xoff, @Nullable @NativeType("int *") IntBuffer yoff) {
        if (CHECKS) {
            check(width, 1);
            check(height, 1);
            checkSafe(xoff, 1);
            checkSafe(yoff, 1);
        }
        long __result = nstbtt_GetGlyphBitmapSubpixel(info.address(), scale_x, scale_y, shift_x, shift_y, glyph, memAddress(width), memAddress(height), memAddressSafe(xoff), memAddressSafe(yoff));
        return memByteBufferSafe(__result, width.get(width.position()) * height.get(height.position()));
    }

    // --- [ stbtt_MakeGlyphBitmap ] ---

    /** Unsafe version of: {@link #stbtt_MakeGlyphBitmap MakeGlyphBitmap} */
    public static native void nstbtt_MakeGlyphBitmap(long info, long output, int out_w, int out_h, int out_stride, float scale_x, float scale_y, int glyph);

    /**
     * Same as {@link #stbtt_GetGlyphBitmap GetGlyphBitmap}, but you pass in storage for the bitmap in the form of {@code output}, with row spacing of {@code out_stride} bytes. The
     * bitmap is clipped to {@code out_w/out_h} bytes. Call {@link #stbtt_GetGlyphBitmapBox GetGlyphBitmapBox} to get the width and height and positioning info for it first.
     *
     * @param info       an {@link STBTTFontinfo} struct
     * @param output     the bitmap storage
     * @param out_w      the bitmap width
     * @param out_h      the bitmap height
     * @param out_stride the row stride, in bytes
     * @param scale_x    the horizontal scale
     * @param scale_y    the vertical scale
     * @param glyph      the glyph index to render
     */
    public static void stbtt_MakeGlyphBitmap(@NativeType("stbtt_fontinfo const *") STBTTFontinfo info, @NativeType("unsigned char *") ByteBuffer output, int out_w, int out_h, int out_stride, float scale_x, float scale_y, int glyph) {
        if (CHECKS) {
            check(output, (out_stride != 0 ? out_stride : out_w) * out_h);
        }
        nstbtt_MakeGlyphBitmap(info.address(), memAddress(output), out_w, out_h, out_stride, scale_x, scale_y, glyph);
    }

    // --- [ stbtt_MakeGlyphBitmapSubpixel ] ---

    /** Unsafe version of: {@link #stbtt_MakeGlyphBitmapSubpixel MakeGlyphBitmapSubpixel} */
    public static native void nstbtt_MakeGlyphBitmapSubpixel(long info, long output, int out_w, int out_h, int out_stride, float scale_x, float scale_y, float shift_x, float shift_y, int glyph);

    /**
     * Same as {@link #stbtt_MakeGlyphBitmap MakeGlyphBitmap}, but you can specify a subpixel shift for the character.
     *
     * @param info       an {@link STBTTFontinfo} struct
     * @param output     the bitmap storage
     * @param out_w      the bitmap width
     * @param out_h      the bitmap height
     * @param out_stride the row stride, in bytes
     * @param scale_x    the horizontal scale
     * @param scale_y    the vertical scale
     * @param shift_x    the horizontal subpixel shift
     * @param shift_y    the vertical subpixel shift
     * @param glyph      the glyph index to render
     */
    public static void stbtt_MakeGlyphBitmapSubpixel(@NativeType("stbtt_fontinfo const *") STBTTFontinfo info, @NativeType("unsigned char *") ByteBuffer output, int out_w, int out_h, int out_stride, float scale_x, float scale_y, float shift_x, float shift_y, int glyph) {
        if (CHECKS) {
            check(output, (out_stride != 0 ? out_stride : out_w) * out_h);
        }
        nstbtt_MakeGlyphBitmapSubpixel(info.address(), memAddress(output), out_w, out_h, out_stride, scale_x, scale_y, shift_x, shift_y, glyph);
    }

    // --- [ stbtt_MakeGlyphBitmapSubpixelPrefilter ] ---

    /** Unsafe version of: {@link #stbtt_MakeGlyphBitmapSubpixelPrefilter MakeGlyphBitmapSubpixelPrefilter} */
    public static native void nstbtt_MakeGlyphBitmapSubpixelPrefilter(long info, long output, int out_w, int out_h, int out_stride, float scale_x, float scale_y, float shift_x, float shift_y, int oversample_x, int oversample_y, long sub_x, long sub_y, int glyph);

    /**
     * Same as {@link #stbtt_MakeGlyphBitmapSubpixel MakeGlyphBitmapSubpixel}, but prefiltering is performed (see {@link #stbtt_PackSetOversampling PackSetOversampling}).
     *
     * @param info         an {@link STBTTFontinfo} struct
     * @param output       the bitmap storage
     * @param out_w        the bitmap width
     * @param out_h        the bitmap height
     * @param out_stride   the row stride, in bytes
     * @param scale_x      the horizontal scale
     * @param scale_y      the vertical scale
     * @param shift_x      the horizontal subpixel shift
     * @param shift_y      the vertical subpixel shift
     * @param oversample_x the horizontal oversampling amount
     * @param oversample_y the vertical oversampling amount
     * @param sub_x        returns the horizontal oversample shift
     * @param sub_y        returns the vertical oversample shift
     * @param glyph        the glyph index to render
     */
    public static void stbtt_MakeGlyphBitmapSubpixelPrefilter(@NativeType("stbtt_fontinfo const *") STBTTFontinfo info, @NativeType("unsigned char *") ByteBuffer output, int out_w, int out_h, int out_stride, float scale_x, float scale_y, float shift_x, float shift_y, int oversample_x, int oversample_y, @NativeType("float *") FloatBuffer sub_x, @NativeType("float *") FloatBuffer sub_y, int glyph) {
        if (CHECKS) {
            check(output, (out_stride != 0 ? out_stride : out_w) * out_h);
            check(sub_x, 1);
            check(sub_y, 1);
        }
        nstbtt_MakeGlyphBitmapSubpixelPrefilter(info.address(), memAddress(output), out_w, out_h, out_stride, scale_x, scale_y, shift_x, shift_y, oversample_x, oversample_y, memAddress(sub_x), memAddress(sub_y), glyph);
    }

    // --- [ stbtt_GetGlyphBitmapBox ] ---

    /** Unsafe version of: {@link #stbtt_GetGlyphBitmapBox GetGlyphBitmapBox} */
    public static native void nstbtt_GetGlyphBitmapBox(long font, int glyph, float scale_x, float scale_y, long ix0, long iy0, long ix1, long iy1);

    /**
     * Get the bbox of the bitmap centered around the glyph origin; so the bitmap width is {@code ix1-ix0}, height is {@code iy1-iy0}, and location to place
     * the bitmap top left is {@code (leftSideBearing*scale,iy0)}.
     * 
     * <p>Note that the bitmap uses y-increases-down, but the shape uses y-increases-up, so {@code GlyphBitmapBox} and {@code GlyphBox} are inverted.</p>
     *
     * @param font    an {@link STBTTFontinfo} struct
     * @param glyph   the glyph index
     * @param scale_x the horizontal scale
     * @param scale_y the vertical scale
     * @param ix0     returns the left coordinate
     * @param iy0     returns the bottom coordinate
     * @param ix1     returns the right coordinate
     * @param iy1     returns the top coordinate
     */
    public static void stbtt_GetGlyphBitmapBox(@NativeType("stbtt_fontinfo const *") STBTTFontinfo font, int glyph, float scale_x, float scale_y, @Nullable @NativeType("int *") IntBuffer ix0, @Nullable @NativeType("int *") IntBuffer iy0, @Nullable @NativeType("int *") IntBuffer ix1, @Nullable @NativeType("int *") IntBuffer iy1) {
        if (CHECKS) {
            checkSafe(ix0, 1);
            checkSafe(iy0, 1);
            checkSafe(ix1, 1);
            checkSafe(iy1, 1);
        }
        nstbtt_GetGlyphBitmapBox(font.address(), glyph, scale_x, scale_y, memAddressSafe(ix0), memAddressSafe(iy0), memAddressSafe(ix1), memAddressSafe(iy1));
    }

    // --- [ stbtt_GetGlyphBitmapBoxSubpixel ] ---

    /** Unsafe version of: {@link #stbtt_GetGlyphBitmapBoxSubpixel GetGlyphBitmapBoxSubpixel} */
    public static native void nstbtt_GetGlyphBitmapBoxSubpixel(long font, int glyph, float scale_x, float scale_y, float shift_x, float shift_y, long ix0, long iy0, long ix1, long iy1);

    /**
     * Same as {@link #stbtt_GetGlyphBitmapBox GetGlyphBitmapBox}, but you can specify a subpixel shift for the character.
     *
     * @param font    an {@link STBTTFontinfo} struct
     * @param glyph   the glyph index
     * @param scale_x the horizontal scale
     * @param scale_y the vertical scale
     * @param shift_x the horizontal subpixel shift
     * @param shift_y the vertical subpixel shift
     * @param ix0     returns the left coordinate
     * @param iy0     returns the bottom coordinate
     * @param ix1     returns the right coordinate
     * @param iy1     returns the top coordinate
     */
    public static void stbtt_GetGlyphBitmapBoxSubpixel(@NativeType("stbtt_fontinfo const *") STBTTFontinfo font, int glyph, float scale_x, float scale_y, float shift_x, float shift_y, @Nullable @NativeType("int *") IntBuffer ix0, @Nullable @NativeType("int *") IntBuffer iy0, @Nullable @NativeType("int *") IntBuffer ix1, @Nullable @NativeType("int *") IntBuffer iy1) {
        if (CHECKS) {
            checkSafe(ix0, 1);
            checkSafe(iy0, 1);
            checkSafe(ix1, 1);
            checkSafe(iy1, 1);
        }
        nstbtt_GetGlyphBitmapBoxSubpixel(font.address(), glyph, scale_x, scale_y, shift_x, shift_y, memAddressSafe(ix0), memAddressSafe(iy0), memAddressSafe(ix1), memAddressSafe(iy1));
    }

    // --- [ stbtt_Rasterize ] ---

    /**
     * Unsafe version of: {@link #stbtt_Rasterize Rasterize}
     *
     * @param num_verts number of vertices in above array
     */
    public static native void nstbtt_Rasterize(long result, float flatness_in_pixels, long vertices, int num_verts, float scale_x, float scale_y, float shift_x, float shift_y, int x_off, int y_off, int invert, long alloc_context);

    /**
     * Rasterize a shape with quadratic beziers into a bitmap.
     *
     * @param result             1-channel bitmap to draw into
     * @param flatness_in_pixels allowable error of curve in pixels
     * @param vertices           array of vertices defining shape
     * @param scale_x            horizontal scale applied to input vertices
     * @param scale_y            vertical scale applied to input vertices
     * @param shift_x            horizontal translation applied to input vertices
     * @param shift_y            vertical translation applied to input vertices
     * @param x_off              another horizontal translation applied to input
     * @param y_off              another vertical translation applied to input
     * @param invert             if non-zero, vertically flip shape
     */
    public static void stbtt_Rasterize(@NativeType("stbtt__bitmap *") STBTTBitmap result, float flatness_in_pixels, @NativeType("stbtt_vertex *") STBTTVertex.Buffer vertices, float scale_x, float scale_y, float shift_x, float shift_y, int x_off, int y_off, @NativeType("int") boolean invert) {
        nstbtt_Rasterize(result.address(), flatness_in_pixels, vertices.address(), vertices.remaining(), scale_x, scale_y, shift_x, shift_y, x_off, y_off, invert ? 1 : 0, NULL);
    }

    // --- [ stbtt_FreeSDF ] ---

    /** Unsafe version of: {@link #stbtt_FreeSDF FreeSDF} */
    public static native void nstbtt_FreeSDF(long bitmap, long userdata);

    /**
     * Frees an SDF bitmap.
     *
     * @param bitmap   the SDF bitmap to free
     * @param userdata a pointer to an allocation context
     */
    public static void stbtt_FreeSDF(@NativeType("unsigned char *") ByteBuffer bitmap, @NativeType("void *") long userdata) {
        nstbtt_FreeSDF(memAddress(bitmap), userdata);
    }

    /**
     * Frees an SDF bitmap.
     *
     * @param bitmap the SDF bitmap to free
     */
    public static void stbtt_FreeSDF(@NativeType("unsigned char *") ByteBuffer bitmap) {
        nstbtt_FreeSDF(memAddress(bitmap), NULL);
    }

    // --- [ stbtt_GetGlyphSDF ] ---

    /** Unsafe version of: {@link #stbtt_GetGlyphSDF GetGlyphSDF} */
    public static native long nstbtt_GetGlyphSDF(long font, float scale, int glyph, int padding, byte onedge_value, float pixel_dist_scale, long width, long height, long xoff, long yoff);

    /**
     * Computes a discretized SDF field for a single character, suitable for storing in a single-channel texture, sampling with bilinear filtering, and
     * testing against larger than some threshold to produce scalable fonts.
     * 
     * <p>{@code pixel_dist_scale} &amp; {@code onedge_value} are a scale &amp; bias that allows you to make optimal use of the limited {@code 0..255} for your
     * application, trading off precision and special effects. SDF values outside the range {@code 0..255} are clamped to {@code 0..255}.</p>
     * 
     * <p>Example:</p>
     * 
     * <pre><code>
     * scale = stbtt_ScaleForPixelHeight(22)
     * padding = 5
     * onedge_value = 180
     * pixel_dist_scale = 180/5.0 = 36.0</code></pre>
     * 
     * <p>This will create an SDF bitmap in which the character is about 22 pixels high but the whole bitmap is about {@code 22+5+5=32} pixels high. To produce a
     * filled shape, sample the SDF at each pixel and fill the pixel if the SDF value is greater than or equal to {@code 180/255}. (You'll actually want to
     * antialias, which is beyond the scope of this example.) Additionally, you can compute offset outlines (e.g. to stroke the character border inside &amp;
     * outside, or only outside). For example, to fill outside the character up to 3 SDF pixels, you would compare against {@code (180-36.0*3)/255 = 72/255}.
     * The above choice of variables maps a range from 5 pixels outside the shape to 2 pixels inside the shape to {@code 0..255}; this is intended primarily
     * for apply outside effects only (the interior range is needed to allow proper antialiasing of the font at <i>smaller</i> sizes).</p>
     * 
     * <p>The function computes the SDF analytically at each SDF pixel, not by e.g. building a higher-res bitmap and approximating it. In theory the quality
     * should be as high as possible for an SDF of this size &amp; representation, but unclear if this is true in practice (perhaps building a higher-res
     * bitmap and computing from that can allow drop-out prevention).</p>
     * 
     * <p>The algorithm has not been optimized at all, so expect it to be slow if computing lots of characters or very large sizes.</p>
     *
     * @param font             an {@link STBTTFontinfo} struct
     * @param scale            controls the size of the resulting SDF bitmap, same as it would be creating a regular bitmap
     * @param glyph            the glyph to generate the SDF for
     * @param padding          extra "pixels" around the character which are filled with the distance to the character (not 0), which allows effects like bit outlines
     * @param onedge_value     value 0-255 to test the SDF against to reconstruct the character (i.e. the isocontour of the character)
     * @param pixel_dist_scale what value the SDF should increase by when moving one SDF "pixel" away from the edge (on the 0..255 scale). If positive, &gt; {@code onedge_value}
     *                         is inside; if negative, &lt; {@code onedge_value} is inside.
     * @param width            output width of the SDF bitmap (including padding)
     * @param height           output height of the SDF bitmap (including padding)
     * @param xoff             output horizontal origin of the character
     * @param yoff             output vertical origin of the character
     */
    @Nullable
    @NativeType("unsigned char *")
    public static ByteBuffer stbtt_GetGlyphSDF(@NativeType("stbtt_fontinfo const *") STBTTFontinfo font, float scale, int glyph, int padding, @NativeType("unsigned char") byte onedge_value, float pixel_dist_scale, @NativeType("int *") IntBuffer width, @NativeType("int *") IntBuffer height, @NativeType("int *") IntBuffer xoff, @NativeType("int *") IntBuffer yoff) {
        if (CHECKS) {
            check(width, 1);
            check(height, 1);
            check(xoff, 1);
            check(yoff, 1);
        }
        long __result = nstbtt_GetGlyphSDF(font.address(), scale, glyph, padding, onedge_value, pixel_dist_scale, memAddress(width), memAddress(height), memAddress(xoff), memAddress(yoff));
        return memByteBufferSafe(__result, width.get(width.position()) * height.get(height.position()));
    }

    // --- [ stbtt_GetCodepointSDF ] ---

    /** Unsafe version of: {@link #stbtt_GetCodepointSDF GetCodepointSDF} */
    public static native long nstbtt_GetCodepointSDF(long font, float scale, int codepoint, int padding, byte onedge_value, float pixel_dist_scale, long width, long height, long xoff, long yoff);

    /**
     * Codepoint version of {@link #stbtt_GetGlyphSDF GetGlyphSDF}.
     *
     * @param font             an {@link STBTTFontinfo} struct
     * @param scale            controls the size of the resulting SDF bitmap, same as it would be creating a regular bitmap
     * @param codepoint        the codepoint to generate the SDF for
     * @param padding          extra "pixels" around the character which are filled with the distance to the character (not 0), which allows effects like bit outlines
     * @param onedge_value     value 0-255 to test the SDF against to reconstruct the character (i.e. the isocontour of the character)
     * @param pixel_dist_scale what value the SDF should increase by when moving one SDF "pixel" away from the edge (on the 0..255 scale). If positive, &gt; {@code onedge_value}
     *                         is inside; if negative, &lt; {@code onedge_value} is inside.
     * @param width            output width of the SDF bitmap (including padding)
     * @param height           output height of the SDF bitmap (including padding)
     * @param xoff             output horizontal origin of the character
     * @param yoff             output vertical origin of the character
     */
    @Nullable
    @NativeType("unsigned char *")
    public static ByteBuffer stbtt_GetCodepointSDF(@NativeType("stbtt_fontinfo const *") STBTTFontinfo font, float scale, int codepoint, int padding, @NativeType("unsigned char") byte onedge_value, float pixel_dist_scale, @NativeType("int *") IntBuffer width, @NativeType("int *") IntBuffer height, @NativeType("int *") IntBuffer xoff, @NativeType("int *") IntBuffer yoff) {
        if (CHECKS) {
            check(width, 1);
            check(height, 1);
            check(xoff, 1);
            check(yoff, 1);
        }
        long __result = nstbtt_GetCodepointSDF(font.address(), scale, codepoint, padding, onedge_value, pixel_dist_scale, memAddress(width), memAddress(height), memAddress(xoff), memAddress(yoff));
        return memByteBufferSafe(__result, width.get(width.position()) * height.get(height.position()));
    }

    // --- [ stbtt_FindMatchingFont ] ---

    /** Unsafe version of: {@link #stbtt_FindMatchingFont FindMatchingFont} */
    public static native int nstbtt_FindMatchingFont(long fontdata, long name, int flags);

    /**
     * Returns the offset (not index) of the font that matches, or -1 if none.
     * 
     * <p>If you use STBTT_MACSTYLE_DONTCARE, use a font name like "Arial Bold". If you use any other flag, use a font name like "Arial"; this checks the
     * {@code macStyle} header field; I don't know if fonts set this consistently.</p>
     *
     * @param fontdata the font data
     * @param name     the font name
     * @param flags    the style flags. One of:<br><table><tr><td>{@link #STBTT_MACSTYLE_DONTCARE MACSTYLE_DONTCARE}</td><td>{@link #STBTT_MACSTYLE_BOLD MACSTYLE_BOLD}</td><td>{@link #STBTT_MACSTYLE_ITALIC MACSTYLE_ITALIC}</td><td>{@link #STBTT_MACSTYLE_UNDERSCORE MACSTYLE_UNDERSCORE}</td><td>{@link #STBTT_MACSTYLE_NONE MACSTYLE_NONE}</td></tr></table>
     */
    public static int stbtt_FindMatchingFont(@NativeType("unsigned char const *") ByteBuffer fontdata, @NativeType("char const *") ByteBuffer name, int flags) {
        if (CHECKS) {
            checkNT1(name);
        }
        return nstbtt_FindMatchingFont(memAddress(fontdata), memAddress(name), flags);
    }

    /**
     * Returns the offset (not index) of the font that matches, or -1 if none.
     * 
     * <p>If you use STBTT_MACSTYLE_DONTCARE, use a font name like "Arial Bold". If you use any other flag, use a font name like "Arial"; this checks the
     * {@code macStyle} header field; I don't know if fonts set this consistently.</p>
     *
     * @param fontdata the font data
     * @param name     the font name
     * @param flags    the style flags. One of:<br><table><tr><td>{@link #STBTT_MACSTYLE_DONTCARE MACSTYLE_DONTCARE}</td><td>{@link #STBTT_MACSTYLE_BOLD MACSTYLE_BOLD}</td><td>{@link #STBTT_MACSTYLE_ITALIC MACSTYLE_ITALIC}</td><td>{@link #STBTT_MACSTYLE_UNDERSCORE MACSTYLE_UNDERSCORE}</td><td>{@link #STBTT_MACSTYLE_NONE MACSTYLE_NONE}</td></tr></table>
     */
    public static int stbtt_FindMatchingFont(@NativeType("unsigned char const *") ByteBuffer fontdata, @NativeType("char const *") CharSequence name, int flags) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nUTF8(name, true);
            long nameEncoded = stack.getPointerAddress();
            return nstbtt_FindMatchingFont(memAddress(fontdata), nameEncoded, flags);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ stbtt_CompareUTF8toUTF16_bigendian ] ---

    /**
     * Unsafe version of: {@link #stbtt_CompareUTF8toUTF16_bigendian CompareUTF8toUTF16_bigendian}
     *
     * @param len1 the length of the first string, in bytes
     * @param len2 the length of the second string, in bytes
     */
    public static native int nstbtt_CompareUTF8toUTF16_bigendian(long s1, int len1, long s2, int len2);

    /**
     * Returns 1/0 whether the first string interpreted as utf8 is identical to the second string interpreted as big-endian utf16... useful for strings
     * returned from {@link #stbtt_GetFontNameString GetFontNameString}.
     *
     * @param s1 the first string
     * @param s2 the second string
     */
    @NativeType("int")
    public static boolean stbtt_CompareUTF8toUTF16_bigendian(@NativeType("char const *") ByteBuffer s1, @NativeType("char const *") ByteBuffer s2) {
        return nstbtt_CompareUTF8toUTF16_bigendian(memAddress(s1), s1.remaining(), memAddress(s2), s2.remaining()) != 0;
    }

    // --- [ stbtt_GetFontNameString ] ---

    /**
     * Unsafe version of: {@link #stbtt_GetFontNameString GetFontNameString}
     *
     * @param length returns the string length, in bytes
     */
    public static native long nstbtt_GetFontNameString(long font, long length, int platformID, int encodingID, int languageID, int nameID);

    /**
     * Returns the string (which may be big-endian double byte, e.g. for unicode) and puts the length in bytes in {@code *length}.
     * 
     * <p>See the truetype spec:</p>
     * 
     * <ul>
     * <li><a href="https://developer.apple.com/fonts/TrueType-Reference-Manual/RM06/Chap6name.html">TrueType Reference Manual - The 'name' table</a></li>
     * <li><a href="https://learn.microsoft.com/en-us/typography/opentype/spec/name">OpenType™ Specification - The Naming Table</a></li>
     * </ul>
     *
     * @param font       an {@link STBTTFontinfo} struct
     * @param platformID the platform ID. One of:<br><table><tr><td>{@link #STBTT_PLATFORM_ID_UNICODE PLATFORM_ID_UNICODE}</td><td>{@link #STBTT_PLATFORM_ID_MAC PLATFORM_ID_MAC}</td><td>{@link #STBTT_PLATFORM_ID_ISO PLATFORM_ID_ISO}</td><td>{@link #STBTT_PLATFORM_ID_MICROSOFT PLATFORM_ID_MICROSOFT}</td></tr></table>
     * @param encodingID the encoding ID. One of:<br><table><tr><td>{@link #STBTT_UNICODE_EID_UNICODE_1_0 UNICODE_EID_UNICODE_1_0}</td><td>{@link #STBTT_UNICODE_EID_UNICODE_1_1 UNICODE_EID_UNICODE_1_1}</td><td>{@link #STBTT_UNICODE_EID_ISO_10646 UNICODE_EID_ISO_10646}</td><td>{@link #STBTT_UNICODE_EID_UNICODE_2_0_BMP UNICODE_EID_UNICODE_2_0_BMP}</td></tr><tr><td>{@link #STBTT_UNICODE_EID_UNICODE_2_0_FULL UNICODE_EID_UNICODE_2_0_FULL}</td><td>{@link #STBTT_MS_EID_SYMBOL MS_EID_SYMBOL}</td><td>{@link #STBTT_MS_EID_UNICODE_BMP MS_EID_UNICODE_BMP}</td><td>{@link #STBTT_MS_EID_SHIFTJIS MS_EID_SHIFTJIS}</td></tr><tr><td>{@link #STBTT_MS_EID_UNICODE_FULL MS_EID_UNICODE_FULL}</td><td>{@link #STBTT_MAC_EID_ROMAN MAC_EID_ROMAN}</td><td>{@link #STBTT_MAC_EID_JAPANESE MAC_EID_JAPANESE}</td><td>{@link #STBTT_MAC_EID_CHINESE_TRAD MAC_EID_CHINESE_TRAD}</td></tr><tr><td>{@link #STBTT_MAC_EID_KOREAN MAC_EID_KOREAN}</td><td>{@link #STBTT_MAC_EID_ARABIC MAC_EID_ARABIC}</td><td>{@link #STBTT_MAC_EID_HEBREW MAC_EID_HEBREW}</td><td>{@link #STBTT_MAC_EID_GREEK MAC_EID_GREEK}</td></tr><tr><td>{@link #STBTT_MAC_EID_RUSSIAN MAC_EID_RUSSIAN}</td></tr></table>
     * @param languageID the language ID. One of:<br><table><tr><td>{@link #STBTT_MS_LANG_ENGLISH MS_LANG_ENGLISH}</td><td>{@link #STBTT_MS_LANG_CHINESE MS_LANG_CHINESE}</td><td>{@link #STBTT_MS_LANG_DUTCH MS_LANG_DUTCH}</td><td>{@link #STBTT_MS_LANG_FRENCH MS_LANG_FRENCH}</td><td>{@link #STBTT_MS_LANG_GERMAN MS_LANG_GERMAN}</td></tr><tr><td>{@link #STBTT_MS_LANG_HEBREW MS_LANG_HEBREW}</td><td>{@link #STBTT_MS_LANG_ITALIAN MS_LANG_ITALIAN}</td><td>{@link #STBTT_MS_LANG_JAPANESE MS_LANG_JAPANESE}</td><td>{@link #STBTT_MS_LANG_KOREAN MS_LANG_KOREAN}</td><td>{@link #STBTT_MS_LANG_RUSSIAN MS_LANG_RUSSIAN}</td></tr><tr><td>{@link #STBTT_MS_LANG_SPANISH MS_LANG_SPANISH}</td><td>{@link #STBTT_MS_LANG_SWEDISH MS_LANG_SWEDISH}</td><td>{@link #STBTT_MAC_LANG_ENGLISH MAC_LANG_ENGLISH}</td><td>{@link #STBTT_MAC_LANG_ARABIC MAC_LANG_ARABIC}</td><td>{@link #STBTT_MAC_LANG_DUTCH MAC_LANG_DUTCH}</td></tr><tr><td>{@link #STBTT_MAC_LANG_FRENCH MAC_LANG_FRENCH}</td><td>{@link #STBTT_MAC_LANG_GERMAN MAC_LANG_GERMAN}</td><td>{@link #STBTT_MAC_LANG_HEBREW MAC_LANG_HEBREW}</td><td>{@link #STBTT_MAC_LANG_ITALIAN MAC_LANG_ITALIAN}</td><td>{@link #STBTT_MAC_LANG_JAPANESE MAC_LANG_JAPANESE}</td></tr><tr><td>{@link #STBTT_MAC_LANG_KOREAN MAC_LANG_KOREAN}</td><td>{@link #STBTT_MAC_LANG_RUSSIAN MAC_LANG_RUSSIAN}</td><td>{@link #STBTT_MAC_LANG_SPANISH MAC_LANG_SPANISH}</td><td>{@link #STBTT_MAC_LANG_SWEDISH MAC_LANG_SWEDISH}</td><td>{@link #STBTT_MAC_LANG_CHINESE_SIMPLIFIED MAC_LANG_CHINESE_SIMPLIFIED}</td></tr><tr><td>{@link #STBTT_MAC_LANG_CHINESE_TRAD MAC_LANG_CHINESE_TRAD}</td></tr></table>
     * @param nameID     the name ID
     */
    @Nullable
    @NativeType("char const *")
    public static ByteBuffer stbtt_GetFontNameString(@NativeType("stbtt_fontinfo const *") STBTTFontinfo font, int platformID, int encodingID, int languageID, int nameID) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        IntBuffer length = stack.callocInt(1);
        try {
            long __result = nstbtt_GetFontNameString(font.address(), memAddress(length), platformID, encodingID, languageID, nameID);
            return memByteBufferSafe(__result, length.get(0));
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    /** Array version of: {@link #nstbtt_GetBakedQuad} */
    public static native void nstbtt_GetBakedQuad(long chardata, int pw, int ph, int char_index, float[] xpos, float[] ypos, long q, int opengl_fillrule);

    /** Array version of: {@link #stbtt_GetBakedQuad GetBakedQuad} */
    public static void stbtt_GetBakedQuad(@NativeType("stbtt_bakedchar const *") STBTTBakedChar.Buffer chardata, int pw, int ph, int char_index, @NativeType("float *") float[] xpos, @NativeType("float *") float[] ypos, @NativeType("stbtt_aligned_quad *") STBTTAlignedQuad q, @NativeType("int") boolean opengl_fillrule) {
        if (CHECKS) {
            check(chardata, char_index + 1);
            check(xpos, 1);
            check(ypos, 1);
        }
        nstbtt_GetBakedQuad(chardata.address(), pw, ph, char_index, xpos, ypos, q.address(), opengl_fillrule ? 1 : 0);
    }

    /** Array version of: {@link #nstbtt_GetScaledFontVMetrics} */
    public static native void nstbtt_GetScaledFontVMetrics(long fontdata, int index, float size, float[] ascent, float[] descent, float[] lineGap);

    /** Array version of: {@link #stbtt_GetScaledFontVMetrics GetScaledFontVMetrics} */
    public static void stbtt_GetScaledFontVMetrics(@NativeType("unsigned char const *") ByteBuffer fontdata, int index, float size, @NativeType("float *") float[] ascent, @NativeType("float *") float[] descent, @NativeType("float *") float[] lineGap) {
        if (CHECKS) {
            check(ascent, 1);
            check(descent, 1);
            check(lineGap, 1);
        }
        nstbtt_GetScaledFontVMetrics(memAddress(fontdata), index, size, ascent, descent, lineGap);
    }

    /** Array version of: {@link #nstbtt_GetPackedQuad} */
    public static native void nstbtt_GetPackedQuad(long chardata, int pw, int ph, int char_index, float[] xpos, float[] ypos, long q, int align_to_integer);

    /** Array version of: {@link #stbtt_GetPackedQuad GetPackedQuad} */
    public static void stbtt_GetPackedQuad(@NativeType("stbtt_packedchar const *") STBTTPackedchar.Buffer chardata, int pw, int ph, int char_index, @NativeType("float *") float[] xpos, @NativeType("float *") float[] ypos, @NativeType("stbtt_aligned_quad *") STBTTAlignedQuad q, @NativeType("int") boolean align_to_integer) {
        if (CHECKS) {
            check(chardata, char_index + 1);
            check(xpos, 1);
            check(ypos, 1);
        }
        nstbtt_GetPackedQuad(chardata.address(), pw, ph, char_index, xpos, ypos, q.address(), align_to_integer ? 1 : 0);
    }

    /** Array version of: {@link #nstbtt_GetFontVMetrics} */
    public static native void nstbtt_GetFontVMetrics(long info, int[] ascent, int[] descent, int[] lineGap);

    /** Array version of: {@link #stbtt_GetFontVMetrics GetFontVMetrics} */
    public static void stbtt_GetFontVMetrics(@NativeType("stbtt_fontinfo const *") STBTTFontinfo info, @Nullable @NativeType("int *") int[] ascent, @Nullable @NativeType("int *") int[] descent, @Nullable @NativeType("int *") int[] lineGap) {
        if (CHECKS) {
            checkSafe(ascent, 1);
            checkSafe(descent, 1);
            checkSafe(lineGap, 1);
        }
        nstbtt_GetFontVMetrics(info.address(), ascent, descent, lineGap);
    }

    /** Array version of: {@link #nstbtt_GetFontVMetricsOS2} */
    public static native int nstbtt_GetFontVMetricsOS2(long info, int[] typoAscent, int[] typoDescent, int[] typoLineGap);

    /** Array version of: {@link #stbtt_GetFontVMetricsOS2 GetFontVMetricsOS2} */
    @NativeType("int")
    public static boolean stbtt_GetFontVMetricsOS2(@NativeType("stbtt_fontinfo const *") STBTTFontinfo info, @Nullable @NativeType("int *") int[] typoAscent, @Nullable @NativeType("int *") int[] typoDescent, @Nullable @NativeType("int *") int[] typoLineGap) {
        if (CHECKS) {
            checkSafe(typoAscent, 1);
            checkSafe(typoDescent, 1);
            checkSafe(typoLineGap, 1);
        }
        return nstbtt_GetFontVMetricsOS2(info.address(), typoAscent, typoDescent, typoLineGap) != 0;
    }

    /** Array version of: {@link #nstbtt_GetFontBoundingBox} */
    public static native void nstbtt_GetFontBoundingBox(long info, int[] x0, int[] y0, int[] x1, int[] y1);

    /** Array version of: {@link #stbtt_GetFontBoundingBox GetFontBoundingBox} */
    public static void stbtt_GetFontBoundingBox(@NativeType("stbtt_fontinfo const *") STBTTFontinfo info, @NativeType("int *") int[] x0, @NativeType("int *") int[] y0, @NativeType("int *") int[] x1, @NativeType("int *") int[] y1) {
        if (CHECKS) {
            check(x0, 1);
            check(y0, 1);
            check(x1, 1);
            check(y1, 1);
        }
        nstbtt_GetFontBoundingBox(info.address(), x0, y0, x1, y1);
    }

    /** Array version of: {@link #nstbtt_GetCodepointHMetrics} */
    public static native void nstbtt_GetCodepointHMetrics(long info, int codepoint, int[] advanceWidth, int[] leftSideBearing);

    /** Array version of: {@link #stbtt_GetCodepointHMetrics GetCodepointHMetrics} */
    public static void stbtt_GetCodepointHMetrics(@NativeType("stbtt_fontinfo const *") STBTTFontinfo info, int codepoint, @Nullable @NativeType("int *") int[] advanceWidth, @Nullable @NativeType("int *") int[] leftSideBearing) {
        if (CHECKS) {
            checkSafe(advanceWidth, 1);
            checkSafe(leftSideBearing, 1);
        }
        nstbtt_GetCodepointHMetrics(info.address(), codepoint, advanceWidth, leftSideBearing);
    }

    /** Array version of: {@link #nstbtt_GetCodepointBox} */
    public static native int nstbtt_GetCodepointBox(long info, int codepoint, int[] x0, int[] y0, int[] x1, int[] y1);

    /** Array version of: {@link #stbtt_GetCodepointBox GetCodepointBox} */
    @NativeType("int")
    public static boolean stbtt_GetCodepointBox(@NativeType("stbtt_fontinfo const *") STBTTFontinfo info, int codepoint, @Nullable @NativeType("int *") int[] x0, @Nullable @NativeType("int *") int[] y0, @Nullable @NativeType("int *") int[] x1, @Nullable @NativeType("int *") int[] y1) {
        if (CHECKS) {
            checkSafe(x0, 1);
            checkSafe(y0, 1);
            checkSafe(x1, 1);
            checkSafe(y1, 1);
        }
        return nstbtt_GetCodepointBox(info.address(), codepoint, x0, y0, x1, y1) != 0;
    }

    /** Array version of: {@link #nstbtt_GetGlyphHMetrics} */
    public static native void nstbtt_GetGlyphHMetrics(long info, int glyph_index, int[] advanceWidth, int[] leftSideBearing);

    /** Array version of: {@link #stbtt_GetGlyphHMetrics GetGlyphHMetrics} */
    public static void stbtt_GetGlyphHMetrics(@NativeType("stbtt_fontinfo const *") STBTTFontinfo info, int glyph_index, @Nullable @NativeType("int *") int[] advanceWidth, @Nullable @NativeType("int *") int[] leftSideBearing) {
        if (CHECKS) {
            checkSafe(advanceWidth, 1);
            checkSafe(leftSideBearing, 1);
        }
        nstbtt_GetGlyphHMetrics(info.address(), glyph_index, advanceWidth, leftSideBearing);
    }

    /** Array version of: {@link #nstbtt_GetGlyphBox} */
    public static native int nstbtt_GetGlyphBox(long info, int glyph_index, int[] x0, int[] y0, int[] x1, int[] y1);

    /** Array version of: {@link #stbtt_GetGlyphBox GetGlyphBox} */
    @NativeType("int")
    public static boolean stbtt_GetGlyphBox(@NativeType("stbtt_fontinfo const *") STBTTFontinfo info, int glyph_index, @Nullable @NativeType("int *") int[] x0, @Nullable @NativeType("int *") int[] y0, @Nullable @NativeType("int *") int[] x1, @Nullable @NativeType("int *") int[] y1) {
        if (CHECKS) {
            checkSafe(x0, 1);
            checkSafe(y0, 1);
            checkSafe(x1, 1);
            checkSafe(y1, 1);
        }
        return nstbtt_GetGlyphBox(info.address(), glyph_index, x0, y0, x1, y1) != 0;
    }

    /** Array version of: {@link #nstbtt_GetCodepointBitmap} */
    public static native long nstbtt_GetCodepointBitmap(long info, float scale_x, float scale_y, int codepoint, int[] width, int[] height, int[] xoff, int[] yoff);

    /** Array version of: {@link #stbtt_GetCodepointBitmap GetCodepointBitmap} */
    @Nullable
    @NativeType("unsigned char *")
    public static ByteBuffer stbtt_GetCodepointBitmap(@NativeType("stbtt_fontinfo const *") STBTTFontinfo info, float scale_x, float scale_y, int codepoint, @NativeType("int *") int[] width, @NativeType("int *") int[] height, @Nullable @NativeType("int *") int[] xoff, @Nullable @NativeType("int *") int[] yoff) {
        if (CHECKS) {
            check(width, 1);
            check(height, 1);
            checkSafe(xoff, 1);
            checkSafe(yoff, 1);
        }
        long __result = nstbtt_GetCodepointBitmap(info.address(), scale_x, scale_y, codepoint, width, height, xoff, yoff);
        return memByteBufferSafe(__result, width[0] * height[0]);
    }

    /** Array version of: {@link #nstbtt_GetCodepointBitmapSubpixel} */
    public static native long nstbtt_GetCodepointBitmapSubpixel(long info, float scale_x, float scale_y, float shift_x, float shift_y, int codepoint, int[] width, int[] height, int[] xoff, int[] yoff);

    /** Array version of: {@link #stbtt_GetCodepointBitmapSubpixel GetCodepointBitmapSubpixel} */
    @Nullable
    @NativeType("unsigned char *")
    public static ByteBuffer stbtt_GetCodepointBitmapSubpixel(@NativeType("stbtt_fontinfo const *") STBTTFontinfo info, float scale_x, float scale_y, float shift_x, float shift_y, int codepoint, @NativeType("int *") int[] width, @NativeType("int *") int[] height, @Nullable @NativeType("int *") int[] xoff, @Nullable @NativeType("int *") int[] yoff) {
        if (CHECKS) {
            check(width, 1);
            check(height, 1);
            checkSafe(xoff, 1);
            checkSafe(yoff, 1);
        }
        long __result = nstbtt_GetCodepointBitmapSubpixel(info.address(), scale_x, scale_y, shift_x, shift_y, codepoint, width, height, xoff, yoff);
        return memByteBufferSafe(__result, width[0] * height[0]);
    }

    /** Array version of: {@link #nstbtt_MakeCodepointBitmapSubpixelPrefilter} */
    public static native void nstbtt_MakeCodepointBitmapSubpixelPrefilter(long info, long output, int out_w, int out_h, int out_stride, float scale_x, float scale_y, float shift_x, float shift_y, int oversample_x, int oversample_y, float[] sub_x, float[] sub_y, int codepoint);

    /** Array version of: {@link #stbtt_MakeCodepointBitmapSubpixelPrefilter MakeCodepointBitmapSubpixelPrefilter} */
    public static void stbtt_MakeCodepointBitmapSubpixelPrefilter(@NativeType("stbtt_fontinfo const *") STBTTFontinfo info, @NativeType("unsigned char *") ByteBuffer output, int out_w, int out_h, int out_stride, float scale_x, float scale_y, float shift_x, float shift_y, int oversample_x, int oversample_y, @NativeType("float *") float[] sub_x, @NativeType("float *") float[] sub_y, int codepoint) {
        if (CHECKS) {
            check(output, (out_stride != 0 ? out_stride : out_w) * out_h);
            check(sub_x, 1);
            check(sub_y, 1);
        }
        nstbtt_MakeCodepointBitmapSubpixelPrefilter(info.address(), memAddress(output), out_w, out_h, out_stride, scale_x, scale_y, shift_x, shift_y, oversample_x, oversample_y, sub_x, sub_y, codepoint);
    }

    /** Array version of: {@link #nstbtt_GetCodepointBitmapBox} */
    public static native void nstbtt_GetCodepointBitmapBox(long font, int codepoint, float scale_x, float scale_y, int[] ix0, int[] iy0, int[] ix1, int[] iy1);

    /** Array version of: {@link #stbtt_GetCodepointBitmapBox GetCodepointBitmapBox} */
    public static void stbtt_GetCodepointBitmapBox(@NativeType("stbtt_fontinfo const *") STBTTFontinfo font, int codepoint, float scale_x, float scale_y, @Nullable @NativeType("int *") int[] ix0, @Nullable @NativeType("int *") int[] iy0, @Nullable @NativeType("int *") int[] ix1, @Nullable @NativeType("int *") int[] iy1) {
        if (CHECKS) {
            checkSafe(ix0, 1);
            checkSafe(iy0, 1);
            checkSafe(ix1, 1);
            checkSafe(iy1, 1);
        }
        nstbtt_GetCodepointBitmapBox(font.address(), codepoint, scale_x, scale_y, ix0, iy0, ix1, iy1);
    }

    /** Array version of: {@link #nstbtt_GetCodepointBitmapBoxSubpixel} */
    public static native void nstbtt_GetCodepointBitmapBoxSubpixel(long font, int codepoint, float scale_x, float scale_y, float shift_x, float shift_y, int[] ix0, int[] iy0, int[] ix1, int[] iy1);

    /** Array version of: {@link #stbtt_GetCodepointBitmapBoxSubpixel GetCodepointBitmapBoxSubpixel} */
    public static void stbtt_GetCodepointBitmapBoxSubpixel(@NativeType("stbtt_fontinfo const *") STBTTFontinfo font, int codepoint, float scale_x, float scale_y, float shift_x, float shift_y, @Nullable @NativeType("int *") int[] ix0, @Nullable @NativeType("int *") int[] iy0, @Nullable @NativeType("int *") int[] ix1, @Nullable @NativeType("int *") int[] iy1) {
        if (CHECKS) {
            checkSafe(ix0, 1);
            checkSafe(iy0, 1);
            checkSafe(ix1, 1);
            checkSafe(iy1, 1);
        }
        nstbtt_GetCodepointBitmapBoxSubpixel(font.address(), codepoint, scale_x, scale_y, shift_x, shift_y, ix0, iy0, ix1, iy1);
    }

    /** Array version of: {@link #nstbtt_GetGlyphBitmap} */
    public static native long nstbtt_GetGlyphBitmap(long info, float scale_x, float scale_y, int glyph, int[] width, int[] height, int[] xoff, int[] yoff);

    /** Array version of: {@link #stbtt_GetGlyphBitmap GetGlyphBitmap} */
    @Nullable
    @NativeType("unsigned char *")
    public static ByteBuffer stbtt_GetGlyphBitmap(@NativeType("stbtt_fontinfo const *") STBTTFontinfo info, float scale_x, float scale_y, int glyph, @NativeType("int *") int[] width, @NativeType("int *") int[] height, @Nullable @NativeType("int *") int[] xoff, @Nullable @NativeType("int *") int[] yoff) {
        if (CHECKS) {
            check(width, 1);
            check(height, 1);
            checkSafe(xoff, 1);
            checkSafe(yoff, 1);
        }
        long __result = nstbtt_GetGlyphBitmap(info.address(), scale_x, scale_y, glyph, width, height, xoff, yoff);
        return memByteBufferSafe(__result, width[0] * height[0]);
    }

    /** Array version of: {@link #nstbtt_GetGlyphBitmapSubpixel} */
    public static native long nstbtt_GetGlyphBitmapSubpixel(long info, float scale_x, float scale_y, float shift_x, float shift_y, int glyph, int[] width, int[] height, int[] xoff, int[] yoff);

    /** Array version of: {@link #stbtt_GetGlyphBitmapSubpixel GetGlyphBitmapSubpixel} */
    @Nullable
    @NativeType("unsigned char *")
    public static ByteBuffer stbtt_GetGlyphBitmapSubpixel(@NativeType("stbtt_fontinfo const *") STBTTFontinfo info, float scale_x, float scale_y, float shift_x, float shift_y, int glyph, @NativeType("int *") int[] width, @NativeType("int *") int[] height, @Nullable @NativeType("int *") int[] xoff, @Nullable @NativeType("int *") int[] yoff) {
        if (CHECKS) {
            check(width, 1);
            check(height, 1);
            checkSafe(xoff, 1);
            checkSafe(yoff, 1);
        }
        long __result = nstbtt_GetGlyphBitmapSubpixel(info.address(), scale_x, scale_y, shift_x, shift_y, glyph, width, height, xoff, yoff);
        return memByteBufferSafe(__result, width[0] * height[0]);
    }

    /** Array version of: {@link #nstbtt_MakeGlyphBitmapSubpixelPrefilter} */
    public static native void nstbtt_MakeGlyphBitmapSubpixelPrefilter(long info, long output, int out_w, int out_h, int out_stride, float scale_x, float scale_y, float shift_x, float shift_y, int oversample_x, int oversample_y, float[] sub_x, float[] sub_y, int glyph);

    /** Array version of: {@link #stbtt_MakeGlyphBitmapSubpixelPrefilter MakeGlyphBitmapSubpixelPrefilter} */
    public static void stbtt_MakeGlyphBitmapSubpixelPrefilter(@NativeType("stbtt_fontinfo const *") STBTTFontinfo info, @NativeType("unsigned char *") ByteBuffer output, int out_w, int out_h, int out_stride, float scale_x, float scale_y, float shift_x, float shift_y, int oversample_x, int oversample_y, @NativeType("float *") float[] sub_x, @NativeType("float *") float[] sub_y, int glyph) {
        if (CHECKS) {
            check(output, (out_stride != 0 ? out_stride : out_w) * out_h);
            check(sub_x, 1);
            check(sub_y, 1);
        }
        nstbtt_MakeGlyphBitmapSubpixelPrefilter(info.address(), memAddress(output), out_w, out_h, out_stride, scale_x, scale_y, shift_x, shift_y, oversample_x, oversample_y, sub_x, sub_y, glyph);
    }

    /** Array version of: {@link #nstbtt_GetGlyphBitmapBox} */
    public static native void nstbtt_GetGlyphBitmapBox(long font, int glyph, float scale_x, float scale_y, int[] ix0, int[] iy0, int[] ix1, int[] iy1);

    /** Array version of: {@link #stbtt_GetGlyphBitmapBox GetGlyphBitmapBox} */
    public static void stbtt_GetGlyphBitmapBox(@NativeType("stbtt_fontinfo const *") STBTTFontinfo font, int glyph, float scale_x, float scale_y, @Nullable @NativeType("int *") int[] ix0, @Nullable @NativeType("int *") int[] iy0, @Nullable @NativeType("int *") int[] ix1, @Nullable @NativeType("int *") int[] iy1) {
        if (CHECKS) {
            checkSafe(ix0, 1);
            checkSafe(iy0, 1);
            checkSafe(ix1, 1);
            checkSafe(iy1, 1);
        }
        nstbtt_GetGlyphBitmapBox(font.address(), glyph, scale_x, scale_y, ix0, iy0, ix1, iy1);
    }

    /** Array version of: {@link #nstbtt_GetGlyphBitmapBoxSubpixel} */
    public static native void nstbtt_GetGlyphBitmapBoxSubpixel(long font, int glyph, float scale_x, float scale_y, float shift_x, float shift_y, int[] ix0, int[] iy0, int[] ix1, int[] iy1);

    /** Array version of: {@link #stbtt_GetGlyphBitmapBoxSubpixel GetGlyphBitmapBoxSubpixel} */
    public static void stbtt_GetGlyphBitmapBoxSubpixel(@NativeType("stbtt_fontinfo const *") STBTTFontinfo font, int glyph, float scale_x, float scale_y, float shift_x, float shift_y, @Nullable @NativeType("int *") int[] ix0, @Nullable @NativeType("int *") int[] iy0, @Nullable @NativeType("int *") int[] ix1, @Nullable @NativeType("int *") int[] iy1) {
        if (CHECKS) {
            checkSafe(ix0, 1);
            checkSafe(iy0, 1);
            checkSafe(ix1, 1);
            checkSafe(iy1, 1);
        }
        nstbtt_GetGlyphBitmapBoxSubpixel(font.address(), glyph, scale_x, scale_y, shift_x, shift_y, ix0, iy0, ix1, iy1);
    }

    /** Array version of: {@link #nstbtt_GetGlyphSDF} */
    public static native long nstbtt_GetGlyphSDF(long font, float scale, int glyph, int padding, byte onedge_value, float pixel_dist_scale, int[] width, int[] height, int[] xoff, int[] yoff);

    /** Array version of: {@link #stbtt_GetGlyphSDF GetGlyphSDF} */
    @Nullable
    @NativeType("unsigned char *")
    public static ByteBuffer stbtt_GetGlyphSDF(@NativeType("stbtt_fontinfo const *") STBTTFontinfo font, float scale, int glyph, int padding, @NativeType("unsigned char") byte onedge_value, float pixel_dist_scale, @NativeType("int *") int[] width, @NativeType("int *") int[] height, @NativeType("int *") int[] xoff, @NativeType("int *") int[] yoff) {
        if (CHECKS) {
            check(width, 1);
            check(height, 1);
            check(xoff, 1);
            check(yoff, 1);
        }
        long __result = nstbtt_GetGlyphSDF(font.address(), scale, glyph, padding, onedge_value, pixel_dist_scale, width, height, xoff, yoff);
        return memByteBufferSafe(__result, width[0] * height[0]);
    }

    /** Array version of: {@link #nstbtt_GetCodepointSDF} */
    public static native long nstbtt_GetCodepointSDF(long font, float scale, int codepoint, int padding, byte onedge_value, float pixel_dist_scale, int[] width, int[] height, int[] xoff, int[] yoff);

    /** Array version of: {@link #stbtt_GetCodepointSDF GetCodepointSDF} */
    @Nullable
    @NativeType("unsigned char *")
    public static ByteBuffer stbtt_GetCodepointSDF(@NativeType("stbtt_fontinfo const *") STBTTFontinfo font, float scale, int codepoint, int padding, @NativeType("unsigned char") byte onedge_value, float pixel_dist_scale, @NativeType("int *") int[] width, @NativeType("int *") int[] height, @NativeType("int *") int[] xoff, @NativeType("int *") int[] yoff) {
        if (CHECKS) {
            check(width, 1);
            check(height, 1);
            check(xoff, 1);
            check(yoff, 1);
        }
        long __result = nstbtt_GetCodepointSDF(font.address(), scale, codepoint, padding, onedge_value, pixel_dist_scale, width, height, xoff, yoff);
        return memByteBufferSafe(__result, width[0] * height[0]);
    }

}