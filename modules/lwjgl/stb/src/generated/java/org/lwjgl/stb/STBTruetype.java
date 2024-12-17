/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.stb;

import org.jspecify.annotations.*;

import java.nio.*;

import org.lwjgl.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.MemoryStack.*;
import static org.lwjgl.system.MemoryUtil.*;

public class STBTruetype {

    static { LibSTB.initialize(); }

    public static final byte
        STBTT_vmove  = 1,
        STBTT_vline  = 2,
        STBTT_vcurve = 3,
        STBTT_vcubic = 4;

    public static final int
        STBTT_MACSTYLE_DONTCARE   = 0,
        STBTT_MACSTYLE_BOLD       = 1,
        STBTT_MACSTYLE_ITALIC     = 2,
        STBTT_MACSTYLE_UNDERSCORE = 4,
        STBTT_MACSTYLE_NONE       = 8;

    public static final int
        STBTT_PLATFORM_ID_UNICODE   = 0,
        STBTT_PLATFORM_ID_MAC       = 1,
        STBTT_PLATFORM_ID_ISO       = 2,
        STBTT_PLATFORM_ID_MICROSOFT = 3;

    public static final int
        STBTT_UNICODE_EID_UNICODE_1_0      = 0,
        STBTT_UNICODE_EID_UNICODE_1_1      = 1,
        STBTT_UNICODE_EID_ISO_10646        = 2,
        STBTT_UNICODE_EID_UNICODE_2_0_BMP  = 3,
        STBTT_UNICODE_EID_UNICODE_2_0_FULL = 4;

    public static final int
        STBTT_MS_EID_SYMBOL       = 0,
        STBTT_MS_EID_UNICODE_BMP  = 1,
        STBTT_MS_EID_SHIFTJIS     = 2,
        STBTT_MS_EID_UNICODE_FULL = 10;

    public static final int
        STBTT_MAC_EID_ROMAN        = 0,
        STBTT_MAC_EID_JAPANESE     = 1,
        STBTT_MAC_EID_CHINESE_TRAD = 2,
        STBTT_MAC_EID_KOREAN       = 3,
        STBTT_MAC_EID_ARABIC       = 4,
        STBTT_MAC_EID_HEBREW       = 5,
        STBTT_MAC_EID_GREEK        = 6,
        STBTT_MAC_EID_RUSSIAN      = 7;

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

    /** {@code int stbtt_BakeFontBitmap(unsigned char const * data, int offset, float pixel_height, unsigned char * pixels, int pw, int ph, int first_char, int num_chars, stbtt_bakedchar * chardata)} */
    public static native int nstbtt_BakeFontBitmap(long data, int offset, float pixel_height, long pixels, int pw, int ph, int first_char, int num_chars, long chardata);

    /** {@code int stbtt_BakeFontBitmap(unsigned char const * data, int offset, float pixel_height, unsigned char * pixels, int pw, int ph, int first_char, int num_chars, stbtt_bakedchar * chardata)} */
    public static int stbtt_BakeFontBitmap(@NativeType("unsigned char const *") ByteBuffer data, float pixel_height, @NativeType("unsigned char *") ByteBuffer pixels, int pw, int ph, int first_char, @NativeType("stbtt_bakedchar *") STBTTBakedChar.Buffer chardata) {
        if (CHECKS) {
            check(pixels, pw * ph);
        }
        return nstbtt_BakeFontBitmap(memAddress(data), 0, pixel_height, memAddress(pixels), pw, ph, first_char, chardata.remaining(), chardata.address());
    }

    // --- [ stbtt_GetBakedQuad ] ---

    /** {@code void stbtt_GetBakedQuad(stbtt_bakedchar const * chardata, int pw, int ph, int char_index, float * xpos, float * ypos, stbtt_aligned_quad * q, int opengl_fillrule)} */
    public static native void nstbtt_GetBakedQuad(long chardata, int pw, int ph, int char_index, long xpos, long ypos, long q, int opengl_fillrule);

    /** {@code void stbtt_GetBakedQuad(stbtt_bakedchar const * chardata, int pw, int ph, int char_index, float * xpos, float * ypos, stbtt_aligned_quad * q, int opengl_fillrule)} */
    public static void stbtt_GetBakedQuad(@NativeType("stbtt_bakedchar const *") STBTTBakedChar.Buffer chardata, int pw, int ph, int char_index, @NativeType("float *") FloatBuffer xpos, @NativeType("float *") FloatBuffer ypos, @NativeType("stbtt_aligned_quad *") STBTTAlignedQuad q, @NativeType("int") boolean opengl_fillrule) {
        if (CHECKS) {
            check(chardata, char_index + 1);
            check(xpos, 1);
            check(ypos, 1);
        }
        nstbtt_GetBakedQuad(chardata.address(), pw, ph, char_index, memAddress(xpos), memAddress(ypos), q.address(), opengl_fillrule ? 1 : 0);
    }

    // --- [ stbtt_GetScaledFontVMetrics ] ---

    /** {@code void stbtt_GetScaledFontVMetrics(unsigned char const * fontdata, int index, float size, float * ascent, float * descent, float * lineGap)} */
    public static native void nstbtt_GetScaledFontVMetrics(long fontdata, int index, float size, long ascent, long descent, long lineGap);

    /** {@code void stbtt_GetScaledFontVMetrics(unsigned char const * fontdata, int index, float size, float * ascent, float * descent, float * lineGap)} */
    public static void stbtt_GetScaledFontVMetrics(@NativeType("unsigned char const *") ByteBuffer fontdata, int index, float size, @NativeType("float *") FloatBuffer ascent, @NativeType("float *") FloatBuffer descent, @NativeType("float *") FloatBuffer lineGap) {
        if (CHECKS) {
            check(ascent, 1);
            check(descent, 1);
            check(lineGap, 1);
        }
        nstbtt_GetScaledFontVMetrics(memAddress(fontdata), index, size, memAddress(ascent), memAddress(descent), memAddress(lineGap));
    }

    // --- [ stbtt_PackBegin ] ---

    /** {@code int stbtt_PackBegin(stbtt_pack_context * spc, unsigned char * pixels, int width, int height, int stride_in_bytes, int padding, void * alloc_context)} */
    public static native int nstbtt_PackBegin(long spc, long pixels, int width, int height, int stride_in_bytes, int padding, long alloc_context);

    /** {@code int stbtt_PackBegin(stbtt_pack_context * spc, unsigned char * pixels, int width, int height, int stride_in_bytes, int padding, void * alloc_context)} */
    @NativeType("int")
    public static boolean stbtt_PackBegin(@NativeType("stbtt_pack_context *") STBTTPackContext spc, @NativeType("unsigned char *") @Nullable ByteBuffer pixels, int width, int height, int stride_in_bytes, int padding, @NativeType("void *") long alloc_context) {
        if (CHECKS) {
            checkSafe(pixels, (stride_in_bytes != 0 ? stride_in_bytes : width) * height);
        }
        return nstbtt_PackBegin(spc.address(), memAddressSafe(pixels), width, height, stride_in_bytes, padding, alloc_context) != 0;
    }

    /** {@code int stbtt_PackBegin(stbtt_pack_context * spc, unsigned char * pixels, int width, int height, int stride_in_bytes, int padding, void * alloc_context)} */
    @NativeType("int")
    public static boolean stbtt_PackBegin(@NativeType("stbtt_pack_context *") STBTTPackContext spc, @NativeType("unsigned char *") @Nullable ByteBuffer pixels, int width, int height, int stride_in_bytes, int padding) {
        if (CHECKS) {
            checkSafe(pixels, (stride_in_bytes != 0 ? stride_in_bytes : width) * height);
        }
        return nstbtt_PackBegin(spc.address(), memAddressSafe(pixels), width, height, stride_in_bytes, padding, NULL) != 0;
    }

    // --- [ stbtt_PackEnd ] ---

    /** {@code void stbtt_PackEnd(stbtt_pack_context * spc)} */
    public static native void nstbtt_PackEnd(long spc);

    /** {@code void stbtt_PackEnd(stbtt_pack_context * spc)} */
    public static void stbtt_PackEnd(@NativeType("stbtt_pack_context *") STBTTPackContext spc) {
        nstbtt_PackEnd(spc.address());
    }

    // --- [ STBTT_POINT_SIZE ] ---

    /** {@code int STBTT_POINT_SIZE(int font_size)} */
    public static int STBTT_POINT_SIZE(int font_size) {
        return -font_size;
    }

    // --- [ stbtt_PackFontRange ] ---

    /** {@code int stbtt_PackFontRange(stbtt_pack_context * spc, unsigned char const * fontdata, int font_index, float font_size, int first_unicode_char_in_range, int num_chars_in_range, stbtt_packedchar * chardata_for_range)} */
    public static native int nstbtt_PackFontRange(long spc, long fontdata, int font_index, float font_size, int first_unicode_char_in_range, int num_chars_in_range, long chardata_for_range);

    /** {@code int stbtt_PackFontRange(stbtt_pack_context * spc, unsigned char const * fontdata, int font_index, float font_size, int first_unicode_char_in_range, int num_chars_in_range, stbtt_packedchar * chardata_for_range)} */
    @NativeType("int")
    public static boolean stbtt_PackFontRange(@NativeType("stbtt_pack_context *") STBTTPackContext spc, @NativeType("unsigned char const *") ByteBuffer fontdata, int font_index, float font_size, int first_unicode_char_in_range, @NativeType("stbtt_packedchar *") STBTTPackedchar.Buffer chardata_for_range) {
        return nstbtt_PackFontRange(spc.address(), memAddress(fontdata), font_index, font_size, first_unicode_char_in_range, chardata_for_range.remaining(), chardata_for_range.address()) != 0;
    }

    // --- [ stbtt_PackFontRanges ] ---

    /** {@code int stbtt_PackFontRanges(stbtt_pack_context * spc, unsigned char const * fontdata, int font_index, stbtt_pack_range * ranges, int num_ranges)} */
    public static native int nstbtt_PackFontRanges(long spc, long fontdata, int font_index, long ranges, int num_ranges);

    /** {@code int stbtt_PackFontRanges(stbtt_pack_context * spc, unsigned char const * fontdata, int font_index, stbtt_pack_range * ranges, int num_ranges)} */
    @NativeType("int")
    public static boolean stbtt_PackFontRanges(@NativeType("stbtt_pack_context *") STBTTPackContext spc, @NativeType("unsigned char const *") ByteBuffer fontdata, int font_index, @NativeType("stbtt_pack_range *") STBTTPackRange.Buffer ranges) {
        if (CHECKS) {
            Struct.validate(ranges.address(), ranges.remaining(), STBTTPackRange.SIZEOF, STBTTPackRange::validate);
        }
        return nstbtt_PackFontRanges(spc.address(), memAddress(fontdata), font_index, ranges.address(), ranges.remaining()) != 0;
    }

    // --- [ stbtt_PackSetOversampling ] ---

    /** {@code void stbtt_PackSetOversampling(stbtt_pack_context * spc, unsigned int h_oversample, unsigned int v_oversample)} */
    public static native void nstbtt_PackSetOversampling(long spc, int h_oversample, int v_oversample);

    /** {@code void stbtt_PackSetOversampling(stbtt_pack_context * spc, unsigned int h_oversample, unsigned int v_oversample)} */
    public static void stbtt_PackSetOversampling(@NativeType("stbtt_pack_context *") STBTTPackContext spc, @NativeType("unsigned int") int h_oversample, @NativeType("unsigned int") int v_oversample) {
        nstbtt_PackSetOversampling(spc.address(), h_oversample, v_oversample);
    }

    // --- [ stbtt_PackSetSkipMissingCodepoints ] ---

    /** {@code void stbtt_PackSetSkipMissingCodepoints(stbtt_pack_context * spc, int skip)} */
    public static native void nstbtt_PackSetSkipMissingCodepoints(long spc, int skip);

    /** {@code void stbtt_PackSetSkipMissingCodepoints(stbtt_pack_context * spc, int skip)} */
    public static void stbtt_PackSetSkipMissingCodepoints(@NativeType("stbtt_pack_context *") STBTTPackContext spc, @NativeType("int") boolean skip) {
        nstbtt_PackSetSkipMissingCodepoints(spc.address(), skip ? 1 : 0);
    }

    // --- [ stbtt_GetPackedQuad ] ---

    /** {@code void stbtt_GetPackedQuad(stbtt_packedchar const * chardata, int pw, int ph, int char_index, float * xpos, float * ypos, stbtt_aligned_quad * q, int align_to_integer)} */
    public static native void nstbtt_GetPackedQuad(long chardata, int pw, int ph, int char_index, long xpos, long ypos, long q, int align_to_integer);

    /** {@code void stbtt_GetPackedQuad(stbtt_packedchar const * chardata, int pw, int ph, int char_index, float * xpos, float * ypos, stbtt_aligned_quad * q, int align_to_integer)} */
    public static void stbtt_GetPackedQuad(@NativeType("stbtt_packedchar const *") STBTTPackedchar.Buffer chardata, int pw, int ph, int char_index, @NativeType("float *") FloatBuffer xpos, @NativeType("float *") FloatBuffer ypos, @NativeType("stbtt_aligned_quad *") STBTTAlignedQuad q, @NativeType("int") boolean align_to_integer) {
        if (CHECKS) {
            check(chardata, char_index + 1);
            check(xpos, 1);
            check(ypos, 1);
        }
        nstbtt_GetPackedQuad(chardata.address(), pw, ph, char_index, memAddress(xpos), memAddress(ypos), q.address(), align_to_integer ? 1 : 0);
    }

    // --- [ stbtt_PackFontRangesGatherRects ] ---

    /** {@code int stbtt_PackFontRangesGatherRects(stbtt_pack_context * spc, stbtt_fontinfo * info, stbtt_pack_range * ranges, int num_ranges, stbrp_rect * rects)} */
    public static native int nstbtt_PackFontRangesGatherRects(long spc, long info, long ranges, int num_ranges, long rects);

    /** {@code int stbtt_PackFontRangesGatherRects(stbtt_pack_context * spc, stbtt_fontinfo * info, stbtt_pack_range * ranges, int num_ranges, stbrp_rect * rects)} */
    public static int stbtt_PackFontRangesGatherRects(@NativeType("stbtt_pack_context *") STBTTPackContext spc, @NativeType("stbtt_fontinfo *") STBTTFontinfo info, @NativeType("stbtt_pack_range *") STBTTPackRange.Buffer ranges, @NativeType("stbrp_rect *") STBRPRect.Buffer rects) {
        if (CHECKS) {
            Struct.validate(ranges.address(), ranges.remaining(), STBTTPackRange.SIZEOF, STBTTPackRange::validate);
        }
        return nstbtt_PackFontRangesGatherRects(spc.address(), info.address(), ranges.address(), ranges.remaining(), rects.address());
    }

    // --- [ stbtt_PackFontRangesPackRects ] ---

    /** {@code void stbtt_PackFontRangesPackRects(stbtt_pack_context * spc, stbrp_rect * rects, int num_rects)} */
    public static native void nstbtt_PackFontRangesPackRects(long spc, long rects, int num_rects);

    /** {@code void stbtt_PackFontRangesPackRects(stbtt_pack_context * spc, stbrp_rect * rects, int num_rects)} */
    public static void stbtt_PackFontRangesPackRects(@NativeType("stbtt_pack_context *") STBTTPackContext spc, @NativeType("stbrp_rect *") STBRPRect.Buffer rects) {
        nstbtt_PackFontRangesPackRects(spc.address(), rects.address(), rects.remaining());
    }

    // --- [ stbtt_PackFontRangesRenderIntoRects ] ---

    /** {@code int stbtt_PackFontRangesRenderIntoRects(stbtt_pack_context * spc, stbtt_fontinfo * info, stbtt_pack_range * ranges, int num_ranges, stbrp_rect * rects)} */
    public static native int nstbtt_PackFontRangesRenderIntoRects(long spc, long info, long ranges, int num_ranges, long rects);

    /** {@code int stbtt_PackFontRangesRenderIntoRects(stbtt_pack_context * spc, stbtt_fontinfo * info, stbtt_pack_range * ranges, int num_ranges, stbrp_rect * rects)} */
    @NativeType("int")
    public static boolean stbtt_PackFontRangesRenderIntoRects(@NativeType("stbtt_pack_context *") STBTTPackContext spc, @NativeType("stbtt_fontinfo *") STBTTFontinfo info, @NativeType("stbtt_pack_range *") STBTTPackRange.Buffer ranges, @NativeType("stbrp_rect *") STBRPRect.Buffer rects) {
        if (CHECKS) {
            Struct.validate(ranges.address(), ranges.remaining(), STBTTPackRange.SIZEOF, STBTTPackRange::validate);
        }
        return nstbtt_PackFontRangesRenderIntoRects(spc.address(), info.address(), ranges.address(), ranges.remaining(), rects.address()) != 0;
    }

    // --- [ stbtt_GetNumberOfFonts ] ---

    /** {@code int stbtt_GetNumberOfFonts(unsigned char const * data)} */
    public static native int nstbtt_GetNumberOfFonts(long data);

    /** {@code int stbtt_GetNumberOfFonts(unsigned char const * data)} */
    public static int stbtt_GetNumberOfFonts(@NativeType("unsigned char const *") ByteBuffer data) {
        return nstbtt_GetNumberOfFonts(memAddress(data));
    }

    // --- [ stbtt_GetFontOffsetForIndex ] ---

    /** {@code int stbtt_GetFontOffsetForIndex(unsigned char const * data, int index)} */
    public static native int nstbtt_GetFontOffsetForIndex(long data, int index);

    /** {@code int stbtt_GetFontOffsetForIndex(unsigned char const * data, int index)} */
    public static int stbtt_GetFontOffsetForIndex(@NativeType("unsigned char const *") ByteBuffer data, int index) {
        return nstbtt_GetFontOffsetForIndex(memAddress(data), index);
    }

    // --- [ stbtt_InitFont ] ---

    /** {@code int stbtt_InitFont(stbtt_fontinfo * info, unsigned char const * data, int offset)} */
    public static native int nstbtt_InitFont(long info, long data, int offset);

    /** {@code int stbtt_InitFont(stbtt_fontinfo * info, unsigned char const * data, int offset)} */
    @NativeType("int")
    public static boolean stbtt_InitFont(@NativeType("stbtt_fontinfo *") STBTTFontinfo info, @NativeType("unsigned char const *") ByteBuffer data, int offset) {
        return nstbtt_InitFont(info.address(), memAddress(data), offset) != 0;
    }

    /** {@code int stbtt_InitFont(stbtt_fontinfo * info, unsigned char const * data, int offset)} */
    @NativeType("int")
    public static boolean stbtt_InitFont(@NativeType("stbtt_fontinfo *") STBTTFontinfo info, @NativeType("unsigned char const *") ByteBuffer data) {
        return nstbtt_InitFont(info.address(), memAddress(data), 0) != 0;
    }

    // --- [ stbtt_FindGlyphIndex ] ---

    /** {@code int stbtt_FindGlyphIndex(stbtt_fontinfo const * info, int unicode_codepoint)} */
    public static native int nstbtt_FindGlyphIndex(long info, int unicode_codepoint);

    /** {@code int stbtt_FindGlyphIndex(stbtt_fontinfo const * info, int unicode_codepoint)} */
    public static int stbtt_FindGlyphIndex(@NativeType("stbtt_fontinfo const *") STBTTFontinfo info, int unicode_codepoint) {
        return nstbtt_FindGlyphIndex(info.address(), unicode_codepoint);
    }

    // --- [ stbtt_ScaleForPixelHeight ] ---

    /** {@code float stbtt_ScaleForPixelHeight(stbtt_fontinfo const * info, float pixels)} */
    public static native float nstbtt_ScaleForPixelHeight(long info, float pixels);

    /** {@code float stbtt_ScaleForPixelHeight(stbtt_fontinfo const * info, float pixels)} */
    public static float stbtt_ScaleForPixelHeight(@NativeType("stbtt_fontinfo const *") STBTTFontinfo info, float pixels) {
        return nstbtt_ScaleForPixelHeight(info.address(), pixels);
    }

    // --- [ stbtt_ScaleForMappingEmToPixels ] ---

    /** {@code float stbtt_ScaleForMappingEmToPixels(stbtt_fontinfo const * info, float pixels)} */
    public static native float nstbtt_ScaleForMappingEmToPixels(long info, float pixels);

    /** {@code float stbtt_ScaleForMappingEmToPixels(stbtt_fontinfo const * info, float pixels)} */
    public static float stbtt_ScaleForMappingEmToPixels(@NativeType("stbtt_fontinfo const *") STBTTFontinfo info, float pixels) {
        return nstbtt_ScaleForMappingEmToPixels(info.address(), pixels);
    }

    // --- [ stbtt_GetFontVMetrics ] ---

    /** {@code void stbtt_GetFontVMetrics(stbtt_fontinfo const * info, int * ascent, int * descent, int * lineGap)} */
    public static native void nstbtt_GetFontVMetrics(long info, long ascent, long descent, long lineGap);

    /** {@code void stbtt_GetFontVMetrics(stbtt_fontinfo const * info, int * ascent, int * descent, int * lineGap)} */
    public static void stbtt_GetFontVMetrics(@NativeType("stbtt_fontinfo const *") STBTTFontinfo info, @NativeType("int *") @Nullable IntBuffer ascent, @NativeType("int *") @Nullable IntBuffer descent, @NativeType("int *") @Nullable IntBuffer lineGap) {
        if (CHECKS) {
            checkSafe(ascent, 1);
            checkSafe(descent, 1);
            checkSafe(lineGap, 1);
        }
        nstbtt_GetFontVMetrics(info.address(), memAddressSafe(ascent), memAddressSafe(descent), memAddressSafe(lineGap));
    }

    // --- [ stbtt_GetFontVMetricsOS2 ] ---

    /** {@code int stbtt_GetFontVMetricsOS2(stbtt_fontinfo const * info, int * typoAscent, int * typoDescent, int * typoLineGap)} */
    public static native int nstbtt_GetFontVMetricsOS2(long info, long typoAscent, long typoDescent, long typoLineGap);

    /** {@code int stbtt_GetFontVMetricsOS2(stbtt_fontinfo const * info, int * typoAscent, int * typoDescent, int * typoLineGap)} */
    @NativeType("int")
    public static boolean stbtt_GetFontVMetricsOS2(@NativeType("stbtt_fontinfo const *") STBTTFontinfo info, @NativeType("int *") @Nullable IntBuffer typoAscent, @NativeType("int *") @Nullable IntBuffer typoDescent, @NativeType("int *") @Nullable IntBuffer typoLineGap) {
        if (CHECKS) {
            checkSafe(typoAscent, 1);
            checkSafe(typoDescent, 1);
            checkSafe(typoLineGap, 1);
        }
        return nstbtt_GetFontVMetricsOS2(info.address(), memAddressSafe(typoAscent), memAddressSafe(typoDescent), memAddressSafe(typoLineGap)) != 0;
    }

    // --- [ stbtt_GetFontBoundingBox ] ---

    /** {@code void stbtt_GetFontBoundingBox(stbtt_fontinfo const * info, int * x0, int * y0, int * x1, int * y1)} */
    public static native void nstbtt_GetFontBoundingBox(long info, long x0, long y0, long x1, long y1);

    /** {@code void stbtt_GetFontBoundingBox(stbtt_fontinfo const * info, int * x0, int * y0, int * x1, int * y1)} */
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

    /** {@code void stbtt_GetCodepointHMetrics(stbtt_fontinfo const * info, int codepoint, int * advanceWidth, int * leftSideBearing)} */
    public static native void nstbtt_GetCodepointHMetrics(long info, int codepoint, long advanceWidth, long leftSideBearing);

    /** {@code void stbtt_GetCodepointHMetrics(stbtt_fontinfo const * info, int codepoint, int * advanceWidth, int * leftSideBearing)} */
    public static void stbtt_GetCodepointHMetrics(@NativeType("stbtt_fontinfo const *") STBTTFontinfo info, int codepoint, @NativeType("int *") @Nullable IntBuffer advanceWidth, @NativeType("int *") @Nullable IntBuffer leftSideBearing) {
        if (CHECKS) {
            checkSafe(advanceWidth, 1);
            checkSafe(leftSideBearing, 1);
        }
        nstbtt_GetCodepointHMetrics(info.address(), codepoint, memAddressSafe(advanceWidth), memAddressSafe(leftSideBearing));
    }

    // --- [ stbtt_GetCodepointKernAdvance ] ---

    /** {@code int stbtt_GetCodepointKernAdvance(stbtt_fontinfo const * info, int ch1, int ch2)} */
    public static native int nstbtt_GetCodepointKernAdvance(long info, int ch1, int ch2);

    /** {@code int stbtt_GetCodepointKernAdvance(stbtt_fontinfo const * info, int ch1, int ch2)} */
    public static int stbtt_GetCodepointKernAdvance(@NativeType("stbtt_fontinfo const *") STBTTFontinfo info, int ch1, int ch2) {
        return nstbtt_GetCodepointKernAdvance(info.address(), ch1, ch2);
    }

    // --- [ stbtt_GetCodepointBox ] ---

    /** {@code int stbtt_GetCodepointBox(stbtt_fontinfo const * info, int codepoint, int * x0, int * y0, int * x1, int * y1)} */
    public static native int nstbtt_GetCodepointBox(long info, int codepoint, long x0, long y0, long x1, long y1);

    /** {@code int stbtt_GetCodepointBox(stbtt_fontinfo const * info, int codepoint, int * x0, int * y0, int * x1, int * y1)} */
    @NativeType("int")
    public static boolean stbtt_GetCodepointBox(@NativeType("stbtt_fontinfo const *") STBTTFontinfo info, int codepoint, @NativeType("int *") @Nullable IntBuffer x0, @NativeType("int *") @Nullable IntBuffer y0, @NativeType("int *") @Nullable IntBuffer x1, @NativeType("int *") @Nullable IntBuffer y1) {
        if (CHECKS) {
            checkSafe(x0, 1);
            checkSafe(y0, 1);
            checkSafe(x1, 1);
            checkSafe(y1, 1);
        }
        return nstbtt_GetCodepointBox(info.address(), codepoint, memAddressSafe(x0), memAddressSafe(y0), memAddressSafe(x1), memAddressSafe(y1)) != 0;
    }

    // --- [ stbtt_GetGlyphHMetrics ] ---

    /** {@code void stbtt_GetGlyphHMetrics(stbtt_fontinfo const * info, int glyph_index, int * advanceWidth, int * leftSideBearing)} */
    public static native void nstbtt_GetGlyphHMetrics(long info, int glyph_index, long advanceWidth, long leftSideBearing);

    /** {@code void stbtt_GetGlyphHMetrics(stbtt_fontinfo const * info, int glyph_index, int * advanceWidth, int * leftSideBearing)} */
    public static void stbtt_GetGlyphHMetrics(@NativeType("stbtt_fontinfo const *") STBTTFontinfo info, int glyph_index, @NativeType("int *") @Nullable IntBuffer advanceWidth, @NativeType("int *") @Nullable IntBuffer leftSideBearing) {
        if (CHECKS) {
            checkSafe(advanceWidth, 1);
            checkSafe(leftSideBearing, 1);
        }
        nstbtt_GetGlyphHMetrics(info.address(), glyph_index, memAddressSafe(advanceWidth), memAddressSafe(leftSideBearing));
    }

    // --- [ stbtt_GetGlyphKernAdvance ] ---

    /** {@code int stbtt_GetGlyphKernAdvance(stbtt_fontinfo const * info, int glyph1, int glyph2)} */
    public static native int nstbtt_GetGlyphKernAdvance(long info, int glyph1, int glyph2);

    /** {@code int stbtt_GetGlyphKernAdvance(stbtt_fontinfo const * info, int glyph1, int glyph2)} */
    public static int stbtt_GetGlyphKernAdvance(@NativeType("stbtt_fontinfo const *") STBTTFontinfo info, int glyph1, int glyph2) {
        return nstbtt_GetGlyphKernAdvance(info.address(), glyph1, glyph2);
    }

    // --- [ stbtt_GetGlyphBox ] ---

    /** {@code int stbtt_GetGlyphBox(stbtt_fontinfo const * info, int glyph_index, int * x0, int * y0, int * x1, int * y1)} */
    public static native int nstbtt_GetGlyphBox(long info, int glyph_index, long x0, long y0, long x1, long y1);

    /** {@code int stbtt_GetGlyphBox(stbtt_fontinfo const * info, int glyph_index, int * x0, int * y0, int * x1, int * y1)} */
    @NativeType("int")
    public static boolean stbtt_GetGlyphBox(@NativeType("stbtt_fontinfo const *") STBTTFontinfo info, int glyph_index, @NativeType("int *") @Nullable IntBuffer x0, @NativeType("int *") @Nullable IntBuffer y0, @NativeType("int *") @Nullable IntBuffer x1, @NativeType("int *") @Nullable IntBuffer y1) {
        if (CHECKS) {
            checkSafe(x0, 1);
            checkSafe(y0, 1);
            checkSafe(x1, 1);
            checkSafe(y1, 1);
        }
        return nstbtt_GetGlyphBox(info.address(), glyph_index, memAddressSafe(x0), memAddressSafe(y0), memAddressSafe(x1), memAddressSafe(y1)) != 0;
    }

    // --- [ stbtt_GetKerningTableLength ] ---

    /** {@code int stbtt_GetKerningTableLength(stbtt_fontinfo const * info)} */
    public static native int nstbtt_GetKerningTableLength(long info);

    /** {@code int stbtt_GetKerningTableLength(stbtt_fontinfo const * info)} */
    public static int stbtt_GetKerningTableLength(@NativeType("stbtt_fontinfo const *") STBTTFontinfo info) {
        return nstbtt_GetKerningTableLength(info.address());
    }

    // --- [ stbtt_GetKerningTable ] ---

    /** {@code int stbtt_GetKerningTable(stbtt_fontinfo const * info, stbtt_kerningentry * table, int table_length)} */
    public static native int nstbtt_GetKerningTable(long info, long table, int table_length);

    /** {@code int stbtt_GetKerningTable(stbtt_fontinfo const * info, stbtt_kerningentry * table, int table_length)} */
    public static int stbtt_GetKerningTable(@NativeType("stbtt_fontinfo const *") STBTTFontinfo info, @NativeType("stbtt_kerningentry *") STBTTKerningentry.Buffer table) {
        return nstbtt_GetKerningTable(info.address(), table.address(), table.remaining());
    }

    // --- [ stbtt_IsGlyphEmpty ] ---

    /** {@code int stbtt_IsGlyphEmpty(stbtt_fontinfo const * info, int glyph_index)} */
    public static native int nstbtt_IsGlyphEmpty(long info, int glyph_index);

    /** {@code int stbtt_IsGlyphEmpty(stbtt_fontinfo const * info, int glyph_index)} */
    @NativeType("int")
    public static boolean stbtt_IsGlyphEmpty(@NativeType("stbtt_fontinfo const *") STBTTFontinfo info, int glyph_index) {
        return nstbtt_IsGlyphEmpty(info.address(), glyph_index) != 0;
    }

    // --- [ stbtt_GetCodepointShape ] ---

    /** {@code int stbtt_GetCodepointShape(stbtt_fontinfo const * info, int unicode_codepoint, stbtt_vertex ** vertices)} */
    public static native int nstbtt_GetCodepointShape(long info, int unicode_codepoint, long vertices);

    /** {@code int stbtt_GetCodepointShape(stbtt_fontinfo const * info, int unicode_codepoint, stbtt_vertex ** vertices)} */
    public static int stbtt_GetCodepointShape(@NativeType("stbtt_fontinfo const *") STBTTFontinfo info, int unicode_codepoint, @NativeType("stbtt_vertex **") PointerBuffer vertices) {
        if (CHECKS) {
            check(vertices, 1);
        }
        return nstbtt_GetCodepointShape(info.address(), unicode_codepoint, memAddress(vertices));
    }

    /** {@code int stbtt_GetCodepointShape(stbtt_fontinfo const * info, int unicode_codepoint, stbtt_vertex ** vertices)} */
    @NativeType("int")
    public static STBTTVertex.@Nullable Buffer stbtt_GetCodepointShape(@NativeType("stbtt_fontinfo const *") STBTTFontinfo info, int unicode_codepoint) {
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

    /** {@code int stbtt_GetGlyphShape(stbtt_fontinfo const * info, int glyph_index, stbtt_vertex ** vertices)} */
    public static native int nstbtt_GetGlyphShape(long info, int glyph_index, long vertices);

    /** {@code int stbtt_GetGlyphShape(stbtt_fontinfo const * info, int glyph_index, stbtt_vertex ** vertices)} */
    public static int stbtt_GetGlyphShape(@NativeType("stbtt_fontinfo const *") STBTTFontinfo info, int glyph_index, @NativeType("stbtt_vertex **") PointerBuffer vertices) {
        if (CHECKS) {
            check(vertices, 1);
        }
        return nstbtt_GetGlyphShape(info.address(), glyph_index, memAddress(vertices));
    }

    /** {@code int stbtt_GetGlyphShape(stbtt_fontinfo const * info, int glyph_index, stbtt_vertex ** vertices)} */
    @NativeType("int")
    public static STBTTVertex.@Nullable Buffer stbtt_GetGlyphShape(@NativeType("stbtt_fontinfo const *") STBTTFontinfo info, int glyph_index) {
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

    /** {@code void stbtt_FreeShape(stbtt_fontinfo const * info, stbtt_vertex * vertices)} */
    public static native void nstbtt_FreeShape(long info, long vertices);

    /** {@code void stbtt_FreeShape(stbtt_fontinfo const * info, stbtt_vertex * vertices)} */
    public static void stbtt_FreeShape(@NativeType("stbtt_fontinfo const *") STBTTFontinfo info, @NativeType("stbtt_vertex *") STBTTVertex.Buffer vertices) {
        if (CHECKS) {
            check(vertices, 1);
        }
        nstbtt_FreeShape(info.address(), vertices.address());
    }

    // --- [ stbtt_FindSVGDoc ] ---

    /** {@code unsigned char * stbtt_FindSVGDoc(stbtt_fontinfo const * info, int gl)} */
    public static native long nstbtt_FindSVGDoc(long info, int gl);

    /** {@code unsigned char * stbtt_FindSVGDoc(stbtt_fontinfo const * info, int gl)} */
    @NativeType("unsigned char *")
    public static long stbtt_FindSVGDoc(@NativeType("stbtt_fontinfo const *") STBTTFontinfo info, int gl) {
        return nstbtt_FindSVGDoc(info.address(), gl);
    }

    // --- [ stbtt_GetCodepointSVG ] ---

    /** {@code int stbtt_GetCodepointSVG(stbtt_fontinfo const * info, int unicode_codepoint, char const ** svg)} */
    public static native int nstbtt_GetCodepointSVG(long info, int unicode_codepoint, long svg);

    /** {@code int stbtt_GetCodepointSVG(stbtt_fontinfo const * info, int unicode_codepoint, char const ** svg)} */
    public static int stbtt_GetCodepointSVG(@NativeType("stbtt_fontinfo const *") STBTTFontinfo info, int unicode_codepoint, @NativeType("char const **") PointerBuffer svg) {
        if (CHECKS) {
            check(svg, 1);
        }
        return nstbtt_GetCodepointSVG(info.address(), unicode_codepoint, memAddress(svg));
    }

    // --- [ stbtt_GetGlyphSVG ] ---

    /** {@code int stbtt_GetGlyphSVG(stbtt_fontinfo const * info, int gl, char const ** svg)} */
    public static native int nstbtt_GetGlyphSVG(long info, int gl, long svg);

    /** {@code int stbtt_GetGlyphSVG(stbtt_fontinfo const * info, int gl, char const ** svg)} */
    public static int stbtt_GetGlyphSVG(@NativeType("stbtt_fontinfo const *") STBTTFontinfo info, int gl, @NativeType("char const **") PointerBuffer svg) {
        if (CHECKS) {
            check(svg, 1);
        }
        return nstbtt_GetGlyphSVG(info.address(), gl, memAddress(svg));
    }

    // --- [ stbtt_FreeBitmap ] ---

    /** {@code void stbtt_FreeBitmap(unsigned char * bitmap, void * userdata)} */
    public static native void nstbtt_FreeBitmap(long bitmap, long userdata);

    /** {@code void stbtt_FreeBitmap(unsigned char * bitmap, void * userdata)} */
    public static void stbtt_FreeBitmap(@NativeType("unsigned char *") ByteBuffer bitmap, @NativeType("void *") long userdata) {
        nstbtt_FreeBitmap(memAddress(bitmap), userdata);
    }

    /** {@code void stbtt_FreeBitmap(unsigned char * bitmap, void * userdata)} */
    public static void stbtt_FreeBitmap(@NativeType("unsigned char *") ByteBuffer bitmap) {
        nstbtt_FreeBitmap(memAddress(bitmap), NULL);
    }

    // --- [ stbtt_GetCodepointBitmap ] ---

    /** {@code unsigned char * stbtt_GetCodepointBitmap(stbtt_fontinfo const * info, float scale_x, float scale_y, int codepoint, int * width, int * height, int * xoff, int * yoff)} */
    public static native long nstbtt_GetCodepointBitmap(long info, float scale_x, float scale_y, int codepoint, long width, long height, long xoff, long yoff);

    /** {@code unsigned char * stbtt_GetCodepointBitmap(stbtt_fontinfo const * info, float scale_x, float scale_y, int codepoint, int * width, int * height, int * xoff, int * yoff)} */
    @NativeType("unsigned char *")
    public static @Nullable ByteBuffer stbtt_GetCodepointBitmap(@NativeType("stbtt_fontinfo const *") STBTTFontinfo info, float scale_x, float scale_y, int codepoint, @NativeType("int *") IntBuffer width, @NativeType("int *") IntBuffer height, @NativeType("int *") @Nullable IntBuffer xoff, @NativeType("int *") @Nullable IntBuffer yoff) {
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

    /** {@code unsigned char * stbtt_GetCodepointBitmapSubpixel(stbtt_fontinfo const * info, float scale_x, float scale_y, float shift_x, float shift_y, int codepoint, int * width, int * height, int * xoff, int * yoff)} */
    public static native long nstbtt_GetCodepointBitmapSubpixel(long info, float scale_x, float scale_y, float shift_x, float shift_y, int codepoint, long width, long height, long xoff, long yoff);

    /** {@code unsigned char * stbtt_GetCodepointBitmapSubpixel(stbtt_fontinfo const * info, float scale_x, float scale_y, float shift_x, float shift_y, int codepoint, int * width, int * height, int * xoff, int * yoff)} */
    @NativeType("unsigned char *")
    public static @Nullable ByteBuffer stbtt_GetCodepointBitmapSubpixel(@NativeType("stbtt_fontinfo const *") STBTTFontinfo info, float scale_x, float scale_y, float shift_x, float shift_y, int codepoint, @NativeType("int *") IntBuffer width, @NativeType("int *") IntBuffer height, @NativeType("int *") @Nullable IntBuffer xoff, @NativeType("int *") @Nullable IntBuffer yoff) {
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

    /** {@code void stbtt_MakeCodepointBitmap(stbtt_fontinfo const * info, unsigned char * output, int out_w, int out_h, int out_stride, float scale_x, float scale_y, int codepoint)} */
    public static native void nstbtt_MakeCodepointBitmap(long info, long output, int out_w, int out_h, int out_stride, float scale_x, float scale_y, int codepoint);

    /** {@code void stbtt_MakeCodepointBitmap(stbtt_fontinfo const * info, unsigned char * output, int out_w, int out_h, int out_stride, float scale_x, float scale_y, int codepoint)} */
    public static void stbtt_MakeCodepointBitmap(@NativeType("stbtt_fontinfo const *") STBTTFontinfo info, @NativeType("unsigned char *") ByteBuffer output, int out_w, int out_h, int out_stride, float scale_x, float scale_y, int codepoint) {
        if (CHECKS) {
            check(output, (out_stride != 0 ? out_stride : out_w) * out_h);
        }
        nstbtt_MakeCodepointBitmap(info.address(), memAddress(output), out_w, out_h, out_stride, scale_x, scale_y, codepoint);
    }

    // --- [ stbtt_MakeCodepointBitmapSubpixel ] ---

    /** {@code void stbtt_MakeCodepointBitmapSubpixel(stbtt_fontinfo const * info, unsigned char * output, int out_w, int out_h, int out_stride, float scale_x, float scale_y, float shift_x, float shift_y, int codepoint)} */
    public static native void nstbtt_MakeCodepointBitmapSubpixel(long info, long output, int out_w, int out_h, int out_stride, float scale_x, float scale_y, float shift_x, float shift_y, int codepoint);

    /** {@code void stbtt_MakeCodepointBitmapSubpixel(stbtt_fontinfo const * info, unsigned char * output, int out_w, int out_h, int out_stride, float scale_x, float scale_y, float shift_x, float shift_y, int codepoint)} */
    public static void stbtt_MakeCodepointBitmapSubpixel(@NativeType("stbtt_fontinfo const *") STBTTFontinfo info, @NativeType("unsigned char *") ByteBuffer output, int out_w, int out_h, int out_stride, float scale_x, float scale_y, float shift_x, float shift_y, int codepoint) {
        if (CHECKS) {
            check(output, (out_stride != 0 ? out_stride : out_w) * out_h);
        }
        nstbtt_MakeCodepointBitmapSubpixel(info.address(), memAddress(output), out_w, out_h, out_stride, scale_x, scale_y, shift_x, shift_y, codepoint);
    }

    // --- [ stbtt_MakeCodepointBitmapSubpixelPrefilter ] ---

    /** {@code void stbtt_MakeCodepointBitmapSubpixelPrefilter(stbtt_fontinfo const * info, unsigned char * output, int out_w, int out_h, int out_stride, float scale_x, float scale_y, float shift_x, float shift_y, int oversample_x, int oversample_y, float * sub_x, float * sub_y, int codepoint)} */
    public static native void nstbtt_MakeCodepointBitmapSubpixelPrefilter(long info, long output, int out_w, int out_h, int out_stride, float scale_x, float scale_y, float shift_x, float shift_y, int oversample_x, int oversample_y, long sub_x, long sub_y, int codepoint);

    /** {@code void stbtt_MakeCodepointBitmapSubpixelPrefilter(stbtt_fontinfo const * info, unsigned char * output, int out_w, int out_h, int out_stride, float scale_x, float scale_y, float shift_x, float shift_y, int oversample_x, int oversample_y, float * sub_x, float * sub_y, int codepoint)} */
    public static void stbtt_MakeCodepointBitmapSubpixelPrefilter(@NativeType("stbtt_fontinfo const *") STBTTFontinfo info, @NativeType("unsigned char *") ByteBuffer output, int out_w, int out_h, int out_stride, float scale_x, float scale_y, float shift_x, float shift_y, int oversample_x, int oversample_y, @NativeType("float *") FloatBuffer sub_x, @NativeType("float *") FloatBuffer sub_y, int codepoint) {
        if (CHECKS) {
            check(output, (out_stride != 0 ? out_stride : out_w) * out_h);
            check(sub_x, 1);
            check(sub_y, 1);
        }
        nstbtt_MakeCodepointBitmapSubpixelPrefilter(info.address(), memAddress(output), out_w, out_h, out_stride, scale_x, scale_y, shift_x, shift_y, oversample_x, oversample_y, memAddress(sub_x), memAddress(sub_y), codepoint);
    }

    // --- [ stbtt_GetCodepointBitmapBox ] ---

    /** {@code void stbtt_GetCodepointBitmapBox(stbtt_fontinfo const * font, int codepoint, float scale_x, float scale_y, int * ix0, int * iy0, int * ix1, int * iy1)} */
    public static native void nstbtt_GetCodepointBitmapBox(long font, int codepoint, float scale_x, float scale_y, long ix0, long iy0, long ix1, long iy1);

    /** {@code void stbtt_GetCodepointBitmapBox(stbtt_fontinfo const * font, int codepoint, float scale_x, float scale_y, int * ix0, int * iy0, int * ix1, int * iy1)} */
    public static void stbtt_GetCodepointBitmapBox(@NativeType("stbtt_fontinfo const *") STBTTFontinfo font, int codepoint, float scale_x, float scale_y, @NativeType("int *") @Nullable IntBuffer ix0, @NativeType("int *") @Nullable IntBuffer iy0, @NativeType("int *") @Nullable IntBuffer ix1, @NativeType("int *") @Nullable IntBuffer iy1) {
        if (CHECKS) {
            checkSafe(ix0, 1);
            checkSafe(iy0, 1);
            checkSafe(ix1, 1);
            checkSafe(iy1, 1);
        }
        nstbtt_GetCodepointBitmapBox(font.address(), codepoint, scale_x, scale_y, memAddressSafe(ix0), memAddressSafe(iy0), memAddressSafe(ix1), memAddressSafe(iy1));
    }

    // --- [ stbtt_GetCodepointBitmapBoxSubpixel ] ---

    /** {@code void stbtt_GetCodepointBitmapBoxSubpixel(stbtt_fontinfo const * font, int codepoint, float scale_x, float scale_y, float shift_x, float shift_y, int * ix0, int * iy0, int * ix1, int * iy1)} */
    public static native void nstbtt_GetCodepointBitmapBoxSubpixel(long font, int codepoint, float scale_x, float scale_y, float shift_x, float shift_y, long ix0, long iy0, long ix1, long iy1);

    /** {@code void stbtt_GetCodepointBitmapBoxSubpixel(stbtt_fontinfo const * font, int codepoint, float scale_x, float scale_y, float shift_x, float shift_y, int * ix0, int * iy0, int * ix1, int * iy1)} */
    public static void stbtt_GetCodepointBitmapBoxSubpixel(@NativeType("stbtt_fontinfo const *") STBTTFontinfo font, int codepoint, float scale_x, float scale_y, float shift_x, float shift_y, @NativeType("int *") @Nullable IntBuffer ix0, @NativeType("int *") @Nullable IntBuffer iy0, @NativeType("int *") @Nullable IntBuffer ix1, @NativeType("int *") @Nullable IntBuffer iy1) {
        if (CHECKS) {
            checkSafe(ix0, 1);
            checkSafe(iy0, 1);
            checkSafe(ix1, 1);
            checkSafe(iy1, 1);
        }
        nstbtt_GetCodepointBitmapBoxSubpixel(font.address(), codepoint, scale_x, scale_y, shift_x, shift_y, memAddressSafe(ix0), memAddressSafe(iy0), memAddressSafe(ix1), memAddressSafe(iy1));
    }

    // --- [ stbtt_GetGlyphBitmap ] ---

    /** {@code unsigned char * stbtt_GetGlyphBitmap(stbtt_fontinfo const * info, float scale_x, float scale_y, int glyph, int * width, int * height, int * xoff, int * yoff)} */
    public static native long nstbtt_GetGlyphBitmap(long info, float scale_x, float scale_y, int glyph, long width, long height, long xoff, long yoff);

    /** {@code unsigned char * stbtt_GetGlyphBitmap(stbtt_fontinfo const * info, float scale_x, float scale_y, int glyph, int * width, int * height, int * xoff, int * yoff)} */
    @NativeType("unsigned char *")
    public static @Nullable ByteBuffer stbtt_GetGlyphBitmap(@NativeType("stbtt_fontinfo const *") STBTTFontinfo info, float scale_x, float scale_y, int glyph, @NativeType("int *") IntBuffer width, @NativeType("int *") IntBuffer height, @NativeType("int *") @Nullable IntBuffer xoff, @NativeType("int *") @Nullable IntBuffer yoff) {
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

    /** {@code unsigned char * stbtt_GetGlyphBitmapSubpixel(stbtt_fontinfo const * info, float scale_x, float scale_y, float shift_x, float shift_y, int glyph, int * width, int * height, int * xoff, int * yoff)} */
    public static native long nstbtt_GetGlyphBitmapSubpixel(long info, float scale_x, float scale_y, float shift_x, float shift_y, int glyph, long width, long height, long xoff, long yoff);

    /** {@code unsigned char * stbtt_GetGlyphBitmapSubpixel(stbtt_fontinfo const * info, float scale_x, float scale_y, float shift_x, float shift_y, int glyph, int * width, int * height, int * xoff, int * yoff)} */
    @NativeType("unsigned char *")
    public static @Nullable ByteBuffer stbtt_GetGlyphBitmapSubpixel(@NativeType("stbtt_fontinfo const *") STBTTFontinfo info, float scale_x, float scale_y, float shift_x, float shift_y, int glyph, @NativeType("int *") IntBuffer width, @NativeType("int *") IntBuffer height, @NativeType("int *") @Nullable IntBuffer xoff, @NativeType("int *") @Nullable IntBuffer yoff) {
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

    /** {@code void stbtt_MakeGlyphBitmap(stbtt_fontinfo const * info, unsigned char * output, int out_w, int out_h, int out_stride, float scale_x, float scale_y, int glyph)} */
    public static native void nstbtt_MakeGlyphBitmap(long info, long output, int out_w, int out_h, int out_stride, float scale_x, float scale_y, int glyph);

    /** {@code void stbtt_MakeGlyphBitmap(stbtt_fontinfo const * info, unsigned char * output, int out_w, int out_h, int out_stride, float scale_x, float scale_y, int glyph)} */
    public static void stbtt_MakeGlyphBitmap(@NativeType("stbtt_fontinfo const *") STBTTFontinfo info, @NativeType("unsigned char *") ByteBuffer output, int out_w, int out_h, int out_stride, float scale_x, float scale_y, int glyph) {
        if (CHECKS) {
            check(output, (out_stride != 0 ? out_stride : out_w) * out_h);
        }
        nstbtt_MakeGlyphBitmap(info.address(), memAddress(output), out_w, out_h, out_stride, scale_x, scale_y, glyph);
    }

    // --- [ stbtt_MakeGlyphBitmapSubpixel ] ---

    /** {@code void stbtt_MakeGlyphBitmapSubpixel(stbtt_fontinfo const * info, unsigned char * output, int out_w, int out_h, int out_stride, float scale_x, float scale_y, float shift_x, float shift_y, int glyph)} */
    public static native void nstbtt_MakeGlyphBitmapSubpixel(long info, long output, int out_w, int out_h, int out_stride, float scale_x, float scale_y, float shift_x, float shift_y, int glyph);

    /** {@code void stbtt_MakeGlyphBitmapSubpixel(stbtt_fontinfo const * info, unsigned char * output, int out_w, int out_h, int out_stride, float scale_x, float scale_y, float shift_x, float shift_y, int glyph)} */
    public static void stbtt_MakeGlyphBitmapSubpixel(@NativeType("stbtt_fontinfo const *") STBTTFontinfo info, @NativeType("unsigned char *") ByteBuffer output, int out_w, int out_h, int out_stride, float scale_x, float scale_y, float shift_x, float shift_y, int glyph) {
        if (CHECKS) {
            check(output, (out_stride != 0 ? out_stride : out_w) * out_h);
        }
        nstbtt_MakeGlyphBitmapSubpixel(info.address(), memAddress(output), out_w, out_h, out_stride, scale_x, scale_y, shift_x, shift_y, glyph);
    }

    // --- [ stbtt_MakeGlyphBitmapSubpixelPrefilter ] ---

    /** {@code void stbtt_MakeGlyphBitmapSubpixelPrefilter(stbtt_fontinfo const * info, unsigned char * output, int out_w, int out_h, int out_stride, float scale_x, float scale_y, float shift_x, float shift_y, int oversample_x, int oversample_y, float * sub_x, float * sub_y, int glyph)} */
    public static native void nstbtt_MakeGlyphBitmapSubpixelPrefilter(long info, long output, int out_w, int out_h, int out_stride, float scale_x, float scale_y, float shift_x, float shift_y, int oversample_x, int oversample_y, long sub_x, long sub_y, int glyph);

    /** {@code void stbtt_MakeGlyphBitmapSubpixelPrefilter(stbtt_fontinfo const * info, unsigned char * output, int out_w, int out_h, int out_stride, float scale_x, float scale_y, float shift_x, float shift_y, int oversample_x, int oversample_y, float * sub_x, float * sub_y, int glyph)} */
    public static void stbtt_MakeGlyphBitmapSubpixelPrefilter(@NativeType("stbtt_fontinfo const *") STBTTFontinfo info, @NativeType("unsigned char *") ByteBuffer output, int out_w, int out_h, int out_stride, float scale_x, float scale_y, float shift_x, float shift_y, int oversample_x, int oversample_y, @NativeType("float *") FloatBuffer sub_x, @NativeType("float *") FloatBuffer sub_y, int glyph) {
        if (CHECKS) {
            check(output, (out_stride != 0 ? out_stride : out_w) * out_h);
            check(sub_x, 1);
            check(sub_y, 1);
        }
        nstbtt_MakeGlyphBitmapSubpixelPrefilter(info.address(), memAddress(output), out_w, out_h, out_stride, scale_x, scale_y, shift_x, shift_y, oversample_x, oversample_y, memAddress(sub_x), memAddress(sub_y), glyph);
    }

    // --- [ stbtt_GetGlyphBitmapBox ] ---

    /** {@code void stbtt_GetGlyphBitmapBox(stbtt_fontinfo const * font, int glyph, float scale_x, float scale_y, int * ix0, int * iy0, int * ix1, int * iy1)} */
    public static native void nstbtt_GetGlyphBitmapBox(long font, int glyph, float scale_x, float scale_y, long ix0, long iy0, long ix1, long iy1);

    /** {@code void stbtt_GetGlyphBitmapBox(stbtt_fontinfo const * font, int glyph, float scale_x, float scale_y, int * ix0, int * iy0, int * ix1, int * iy1)} */
    public static void stbtt_GetGlyphBitmapBox(@NativeType("stbtt_fontinfo const *") STBTTFontinfo font, int glyph, float scale_x, float scale_y, @NativeType("int *") @Nullable IntBuffer ix0, @NativeType("int *") @Nullable IntBuffer iy0, @NativeType("int *") @Nullable IntBuffer ix1, @NativeType("int *") @Nullable IntBuffer iy1) {
        if (CHECKS) {
            checkSafe(ix0, 1);
            checkSafe(iy0, 1);
            checkSafe(ix1, 1);
            checkSafe(iy1, 1);
        }
        nstbtt_GetGlyphBitmapBox(font.address(), glyph, scale_x, scale_y, memAddressSafe(ix0), memAddressSafe(iy0), memAddressSafe(ix1), memAddressSafe(iy1));
    }

    // --- [ stbtt_GetGlyphBitmapBoxSubpixel ] ---

    /** {@code void stbtt_GetGlyphBitmapBoxSubpixel(stbtt_fontinfo const * font, int glyph, float scale_x, float scale_y, float shift_x, float shift_y, int * ix0, int * iy0, int * ix1, int * iy1)} */
    public static native void nstbtt_GetGlyphBitmapBoxSubpixel(long font, int glyph, float scale_x, float scale_y, float shift_x, float shift_y, long ix0, long iy0, long ix1, long iy1);

    /** {@code void stbtt_GetGlyphBitmapBoxSubpixel(stbtt_fontinfo const * font, int glyph, float scale_x, float scale_y, float shift_x, float shift_y, int * ix0, int * iy0, int * ix1, int * iy1)} */
    public static void stbtt_GetGlyphBitmapBoxSubpixel(@NativeType("stbtt_fontinfo const *") STBTTFontinfo font, int glyph, float scale_x, float scale_y, float shift_x, float shift_y, @NativeType("int *") @Nullable IntBuffer ix0, @NativeType("int *") @Nullable IntBuffer iy0, @NativeType("int *") @Nullable IntBuffer ix1, @NativeType("int *") @Nullable IntBuffer iy1) {
        if (CHECKS) {
            checkSafe(ix0, 1);
            checkSafe(iy0, 1);
            checkSafe(ix1, 1);
            checkSafe(iy1, 1);
        }
        nstbtt_GetGlyphBitmapBoxSubpixel(font.address(), glyph, scale_x, scale_y, shift_x, shift_y, memAddressSafe(ix0), memAddressSafe(iy0), memAddressSafe(ix1), memAddressSafe(iy1));
    }

    // --- [ stbtt_Rasterize ] ---

    /** {@code void stbtt_Rasterize(stbtt__bitmap * result, float flatness_in_pixels, stbtt_vertex * vertices, int num_verts, float scale_x, float scale_y, float shift_x, float shift_y, int x_off, int y_off, int invert, void * alloc_context)} */
    public static native void nstbtt_Rasterize(long result, float flatness_in_pixels, long vertices, int num_verts, float scale_x, float scale_y, float shift_x, float shift_y, int x_off, int y_off, int invert, long alloc_context);

    /** {@code void stbtt_Rasterize(stbtt__bitmap * result, float flatness_in_pixels, stbtt_vertex * vertices, int num_verts, float scale_x, float scale_y, float shift_x, float shift_y, int x_off, int y_off, int invert, void * alloc_context)} */
    public static void stbtt_Rasterize(@NativeType("stbtt__bitmap *") STBTTBitmap result, float flatness_in_pixels, @NativeType("stbtt_vertex *") STBTTVertex.Buffer vertices, float scale_x, float scale_y, float shift_x, float shift_y, int x_off, int y_off, @NativeType("int") boolean invert) {
        nstbtt_Rasterize(result.address(), flatness_in_pixels, vertices.address(), vertices.remaining(), scale_x, scale_y, shift_x, shift_y, x_off, y_off, invert ? 1 : 0, NULL);
    }

    // --- [ stbtt_FreeSDF ] ---

    /** {@code void stbtt_FreeSDF(unsigned char * bitmap, void * userdata)} */
    public static native void nstbtt_FreeSDF(long bitmap, long userdata);

    /** {@code void stbtt_FreeSDF(unsigned char * bitmap, void * userdata)} */
    public static void stbtt_FreeSDF(@NativeType("unsigned char *") ByteBuffer bitmap, @NativeType("void *") long userdata) {
        nstbtt_FreeSDF(memAddress(bitmap), userdata);
    }

    /** {@code void stbtt_FreeSDF(unsigned char * bitmap, void * userdata)} */
    public static void stbtt_FreeSDF(@NativeType("unsigned char *") ByteBuffer bitmap) {
        nstbtt_FreeSDF(memAddress(bitmap), NULL);
    }

    // --- [ stbtt_GetGlyphSDF ] ---

    /** {@code unsigned char * stbtt_GetGlyphSDF(stbtt_fontinfo const * font, float scale, int glyph, int padding, unsigned char onedge_value, float pixel_dist_scale, int * width, int * height, int * xoff, int * yoff)} */
    public static native long nstbtt_GetGlyphSDF(long font, float scale, int glyph, int padding, byte onedge_value, float pixel_dist_scale, long width, long height, long xoff, long yoff);

    /** {@code unsigned char * stbtt_GetGlyphSDF(stbtt_fontinfo const * font, float scale, int glyph, int padding, unsigned char onedge_value, float pixel_dist_scale, int * width, int * height, int * xoff, int * yoff)} */
    @NativeType("unsigned char *")
    public static @Nullable ByteBuffer stbtt_GetGlyphSDF(@NativeType("stbtt_fontinfo const *") STBTTFontinfo font, float scale, int glyph, int padding, @NativeType("unsigned char") byte onedge_value, float pixel_dist_scale, @NativeType("int *") IntBuffer width, @NativeType("int *") IntBuffer height, @NativeType("int *") IntBuffer xoff, @NativeType("int *") IntBuffer yoff) {
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

    /** {@code unsigned char * stbtt_GetCodepointSDF(stbtt_fontinfo const * font, float scale, int codepoint, int padding, unsigned char onedge_value, float pixel_dist_scale, int * width, int * height, int * xoff, int * yoff)} */
    public static native long nstbtt_GetCodepointSDF(long font, float scale, int codepoint, int padding, byte onedge_value, float pixel_dist_scale, long width, long height, long xoff, long yoff);

    /** {@code unsigned char * stbtt_GetCodepointSDF(stbtt_fontinfo const * font, float scale, int codepoint, int padding, unsigned char onedge_value, float pixel_dist_scale, int * width, int * height, int * xoff, int * yoff)} */
    @NativeType("unsigned char *")
    public static @Nullable ByteBuffer stbtt_GetCodepointSDF(@NativeType("stbtt_fontinfo const *") STBTTFontinfo font, float scale, int codepoint, int padding, @NativeType("unsigned char") byte onedge_value, float pixel_dist_scale, @NativeType("int *") IntBuffer width, @NativeType("int *") IntBuffer height, @NativeType("int *") IntBuffer xoff, @NativeType("int *") IntBuffer yoff) {
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

    /** {@code int stbtt_FindMatchingFont(unsigned char const * fontdata, char const * name, int flags)} */
    public static native int nstbtt_FindMatchingFont(long fontdata, long name, int flags);

    /** {@code int stbtt_FindMatchingFont(unsigned char const * fontdata, char const * name, int flags)} */
    public static int stbtt_FindMatchingFont(@NativeType("unsigned char const *") ByteBuffer fontdata, @NativeType("char const *") ByteBuffer name, int flags) {
        if (CHECKS) {
            checkNT1(name);
        }
        return nstbtt_FindMatchingFont(memAddress(fontdata), memAddress(name), flags);
    }

    /** {@code int stbtt_FindMatchingFont(unsigned char const * fontdata, char const * name, int flags)} */
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

    /** {@code int stbtt_CompareUTF8toUTF16_bigendian(char const * s1, int len1, char const * s2, int len2)} */
    public static native int nstbtt_CompareUTF8toUTF16_bigendian(long s1, int len1, long s2, int len2);

    /** {@code int stbtt_CompareUTF8toUTF16_bigendian(char const * s1, int len1, char const * s2, int len2)} */
    @NativeType("int")
    public static boolean stbtt_CompareUTF8toUTF16_bigendian(@NativeType("char const *") ByteBuffer s1, @NativeType("char const *") ByteBuffer s2) {
        return nstbtt_CompareUTF8toUTF16_bigendian(memAddress(s1), s1.remaining(), memAddress(s2), s2.remaining()) != 0;
    }

    // --- [ stbtt_GetFontNameString ] ---

    /** {@code char const * stbtt_GetFontNameString(stbtt_fontinfo const * font, int * length, int platformID, int encodingID, int languageID, int nameID)} */
    public static native long nstbtt_GetFontNameString(long font, long length, int platformID, int encodingID, int languageID, int nameID);

    /** {@code char const * stbtt_GetFontNameString(stbtt_fontinfo const * font, int * length, int platformID, int encodingID, int languageID, int nameID)} */
    @NativeType("char const *")
    public static @Nullable ByteBuffer stbtt_GetFontNameString(@NativeType("stbtt_fontinfo const *") STBTTFontinfo font, int platformID, int encodingID, int languageID, int nameID) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        IntBuffer length = stack.callocInt(1);
        try {
            long __result = nstbtt_GetFontNameString(font.address(), memAddress(length), platformID, encodingID, languageID, nameID);
            return memByteBufferSafe(__result, length.get(0));
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    /** {@code void stbtt_GetBakedQuad(stbtt_bakedchar const * chardata, int pw, int ph, int char_index, float * xpos, float * ypos, stbtt_aligned_quad * q, int opengl_fillrule)} */
    public static native void nstbtt_GetBakedQuad(long chardata, int pw, int ph, int char_index, float[] xpos, float[] ypos, long q, int opengl_fillrule);

    /** {@code void stbtt_GetBakedQuad(stbtt_bakedchar const * chardata, int pw, int ph, int char_index, float * xpos, float * ypos, stbtt_aligned_quad * q, int opengl_fillrule)} */
    public static void stbtt_GetBakedQuad(@NativeType("stbtt_bakedchar const *") STBTTBakedChar.Buffer chardata, int pw, int ph, int char_index, @NativeType("float *") float[] xpos, @NativeType("float *") float[] ypos, @NativeType("stbtt_aligned_quad *") STBTTAlignedQuad q, @NativeType("int") boolean opengl_fillrule) {
        if (CHECKS) {
            check(chardata, char_index + 1);
            check(xpos, 1);
            check(ypos, 1);
        }
        nstbtt_GetBakedQuad(chardata.address(), pw, ph, char_index, xpos, ypos, q.address(), opengl_fillrule ? 1 : 0);
    }

    /** {@code void stbtt_GetScaledFontVMetrics(unsigned char const * fontdata, int index, float size, float * ascent, float * descent, float * lineGap)} */
    public static native void nstbtt_GetScaledFontVMetrics(long fontdata, int index, float size, float[] ascent, float[] descent, float[] lineGap);

    /** {@code void stbtt_GetScaledFontVMetrics(unsigned char const * fontdata, int index, float size, float * ascent, float * descent, float * lineGap)} */
    public static void stbtt_GetScaledFontVMetrics(@NativeType("unsigned char const *") ByteBuffer fontdata, int index, float size, @NativeType("float *") float[] ascent, @NativeType("float *") float[] descent, @NativeType("float *") float[] lineGap) {
        if (CHECKS) {
            check(ascent, 1);
            check(descent, 1);
            check(lineGap, 1);
        }
        nstbtt_GetScaledFontVMetrics(memAddress(fontdata), index, size, ascent, descent, lineGap);
    }

    /** {@code void stbtt_GetPackedQuad(stbtt_packedchar const * chardata, int pw, int ph, int char_index, float * xpos, float * ypos, stbtt_aligned_quad * q, int align_to_integer)} */
    public static native void nstbtt_GetPackedQuad(long chardata, int pw, int ph, int char_index, float[] xpos, float[] ypos, long q, int align_to_integer);

    /** {@code void stbtt_GetPackedQuad(stbtt_packedchar const * chardata, int pw, int ph, int char_index, float * xpos, float * ypos, stbtt_aligned_quad * q, int align_to_integer)} */
    public static void stbtt_GetPackedQuad(@NativeType("stbtt_packedchar const *") STBTTPackedchar.Buffer chardata, int pw, int ph, int char_index, @NativeType("float *") float[] xpos, @NativeType("float *") float[] ypos, @NativeType("stbtt_aligned_quad *") STBTTAlignedQuad q, @NativeType("int") boolean align_to_integer) {
        if (CHECKS) {
            check(chardata, char_index + 1);
            check(xpos, 1);
            check(ypos, 1);
        }
        nstbtt_GetPackedQuad(chardata.address(), pw, ph, char_index, xpos, ypos, q.address(), align_to_integer ? 1 : 0);
    }

    /** {@code void stbtt_GetFontVMetrics(stbtt_fontinfo const * info, int * ascent, int * descent, int * lineGap)} */
    public static native void nstbtt_GetFontVMetrics(long info, int[] ascent, int[] descent, int[] lineGap);

    /** {@code void stbtt_GetFontVMetrics(stbtt_fontinfo const * info, int * ascent, int * descent, int * lineGap)} */
    public static void stbtt_GetFontVMetrics(@NativeType("stbtt_fontinfo const *") STBTTFontinfo info, @NativeType("int *") int @Nullable [] ascent, @NativeType("int *") int @Nullable [] descent, @NativeType("int *") int @Nullable [] lineGap) {
        if (CHECKS) {
            checkSafe(ascent, 1);
            checkSafe(descent, 1);
            checkSafe(lineGap, 1);
        }
        nstbtt_GetFontVMetrics(info.address(), ascent, descent, lineGap);
    }

    /** {@code int stbtt_GetFontVMetricsOS2(stbtt_fontinfo const * info, int * typoAscent, int * typoDescent, int * typoLineGap)} */
    public static native int nstbtt_GetFontVMetricsOS2(long info, int[] typoAscent, int[] typoDescent, int[] typoLineGap);

    /** {@code int stbtt_GetFontVMetricsOS2(stbtt_fontinfo const * info, int * typoAscent, int * typoDescent, int * typoLineGap)} */
    @NativeType("int")
    public static boolean stbtt_GetFontVMetricsOS2(@NativeType("stbtt_fontinfo const *") STBTTFontinfo info, @NativeType("int *") int @Nullable [] typoAscent, @NativeType("int *") int @Nullable [] typoDescent, @NativeType("int *") int @Nullable [] typoLineGap) {
        if (CHECKS) {
            checkSafe(typoAscent, 1);
            checkSafe(typoDescent, 1);
            checkSafe(typoLineGap, 1);
        }
        return nstbtt_GetFontVMetricsOS2(info.address(), typoAscent, typoDescent, typoLineGap) != 0;
    }

    /** {@code void stbtt_GetFontBoundingBox(stbtt_fontinfo const * info, int * x0, int * y0, int * x1, int * y1)} */
    public static native void nstbtt_GetFontBoundingBox(long info, int[] x0, int[] y0, int[] x1, int[] y1);

    /** {@code void stbtt_GetFontBoundingBox(stbtt_fontinfo const * info, int * x0, int * y0, int * x1, int * y1)} */
    public static void stbtt_GetFontBoundingBox(@NativeType("stbtt_fontinfo const *") STBTTFontinfo info, @NativeType("int *") int[] x0, @NativeType("int *") int[] y0, @NativeType("int *") int[] x1, @NativeType("int *") int[] y1) {
        if (CHECKS) {
            check(x0, 1);
            check(y0, 1);
            check(x1, 1);
            check(y1, 1);
        }
        nstbtt_GetFontBoundingBox(info.address(), x0, y0, x1, y1);
    }

    /** {@code void stbtt_GetCodepointHMetrics(stbtt_fontinfo const * info, int codepoint, int * advanceWidth, int * leftSideBearing)} */
    public static native void nstbtt_GetCodepointHMetrics(long info, int codepoint, int[] advanceWidth, int[] leftSideBearing);

    /** {@code void stbtt_GetCodepointHMetrics(stbtt_fontinfo const * info, int codepoint, int * advanceWidth, int * leftSideBearing)} */
    public static void stbtt_GetCodepointHMetrics(@NativeType("stbtt_fontinfo const *") STBTTFontinfo info, int codepoint, @NativeType("int *") int @Nullable [] advanceWidth, @NativeType("int *") int @Nullable [] leftSideBearing) {
        if (CHECKS) {
            checkSafe(advanceWidth, 1);
            checkSafe(leftSideBearing, 1);
        }
        nstbtt_GetCodepointHMetrics(info.address(), codepoint, advanceWidth, leftSideBearing);
    }

    /** {@code int stbtt_GetCodepointBox(stbtt_fontinfo const * info, int codepoint, int * x0, int * y0, int * x1, int * y1)} */
    public static native int nstbtt_GetCodepointBox(long info, int codepoint, int[] x0, int[] y0, int[] x1, int[] y1);

    /** {@code int stbtt_GetCodepointBox(stbtt_fontinfo const * info, int codepoint, int * x0, int * y0, int * x1, int * y1)} */
    @NativeType("int")
    public static boolean stbtt_GetCodepointBox(@NativeType("stbtt_fontinfo const *") STBTTFontinfo info, int codepoint, @NativeType("int *") int @Nullable [] x0, @NativeType("int *") int @Nullable [] y0, @NativeType("int *") int @Nullable [] x1, @NativeType("int *") int @Nullable [] y1) {
        if (CHECKS) {
            checkSafe(x0, 1);
            checkSafe(y0, 1);
            checkSafe(x1, 1);
            checkSafe(y1, 1);
        }
        return nstbtt_GetCodepointBox(info.address(), codepoint, x0, y0, x1, y1) != 0;
    }

    /** {@code void stbtt_GetGlyphHMetrics(stbtt_fontinfo const * info, int glyph_index, int * advanceWidth, int * leftSideBearing)} */
    public static native void nstbtt_GetGlyphHMetrics(long info, int glyph_index, int[] advanceWidth, int[] leftSideBearing);

    /** {@code void stbtt_GetGlyphHMetrics(stbtt_fontinfo const * info, int glyph_index, int * advanceWidth, int * leftSideBearing)} */
    public static void stbtt_GetGlyphHMetrics(@NativeType("stbtt_fontinfo const *") STBTTFontinfo info, int glyph_index, @NativeType("int *") int @Nullable [] advanceWidth, @NativeType("int *") int @Nullable [] leftSideBearing) {
        if (CHECKS) {
            checkSafe(advanceWidth, 1);
            checkSafe(leftSideBearing, 1);
        }
        nstbtt_GetGlyphHMetrics(info.address(), glyph_index, advanceWidth, leftSideBearing);
    }

    /** {@code int stbtt_GetGlyphBox(stbtt_fontinfo const * info, int glyph_index, int * x0, int * y0, int * x1, int * y1)} */
    public static native int nstbtt_GetGlyphBox(long info, int glyph_index, int[] x0, int[] y0, int[] x1, int[] y1);

    /** {@code int stbtt_GetGlyphBox(stbtt_fontinfo const * info, int glyph_index, int * x0, int * y0, int * x1, int * y1)} */
    @NativeType("int")
    public static boolean stbtt_GetGlyphBox(@NativeType("stbtt_fontinfo const *") STBTTFontinfo info, int glyph_index, @NativeType("int *") int @Nullable [] x0, @NativeType("int *") int @Nullable [] y0, @NativeType("int *") int @Nullable [] x1, @NativeType("int *") int @Nullable [] y1) {
        if (CHECKS) {
            checkSafe(x0, 1);
            checkSafe(y0, 1);
            checkSafe(x1, 1);
            checkSafe(y1, 1);
        }
        return nstbtt_GetGlyphBox(info.address(), glyph_index, x0, y0, x1, y1) != 0;
    }

    /** {@code unsigned char * stbtt_GetCodepointBitmap(stbtt_fontinfo const * info, float scale_x, float scale_y, int codepoint, int * width, int * height, int * xoff, int * yoff)} */
    public static native long nstbtt_GetCodepointBitmap(long info, float scale_x, float scale_y, int codepoint, int[] width, int[] height, int[] xoff, int[] yoff);

    /** {@code unsigned char * stbtt_GetCodepointBitmap(stbtt_fontinfo const * info, float scale_x, float scale_y, int codepoint, int * width, int * height, int * xoff, int * yoff)} */
    @NativeType("unsigned char *")
    public static @Nullable ByteBuffer stbtt_GetCodepointBitmap(@NativeType("stbtt_fontinfo const *") STBTTFontinfo info, float scale_x, float scale_y, int codepoint, @NativeType("int *") int[] width, @NativeType("int *") int[] height, @NativeType("int *") int @Nullable [] xoff, @NativeType("int *") int @Nullable [] yoff) {
        if (CHECKS) {
            check(width, 1);
            check(height, 1);
            checkSafe(xoff, 1);
            checkSafe(yoff, 1);
        }
        long __result = nstbtt_GetCodepointBitmap(info.address(), scale_x, scale_y, codepoint, width, height, xoff, yoff);
        return memByteBufferSafe(__result, width[0] * height[0]);
    }

    /** {@code unsigned char * stbtt_GetCodepointBitmapSubpixel(stbtt_fontinfo const * info, float scale_x, float scale_y, float shift_x, float shift_y, int codepoint, int * width, int * height, int * xoff, int * yoff)} */
    public static native long nstbtt_GetCodepointBitmapSubpixel(long info, float scale_x, float scale_y, float shift_x, float shift_y, int codepoint, int[] width, int[] height, int[] xoff, int[] yoff);

    /** {@code unsigned char * stbtt_GetCodepointBitmapSubpixel(stbtt_fontinfo const * info, float scale_x, float scale_y, float shift_x, float shift_y, int codepoint, int * width, int * height, int * xoff, int * yoff)} */
    @NativeType("unsigned char *")
    public static @Nullable ByteBuffer stbtt_GetCodepointBitmapSubpixel(@NativeType("stbtt_fontinfo const *") STBTTFontinfo info, float scale_x, float scale_y, float shift_x, float shift_y, int codepoint, @NativeType("int *") int[] width, @NativeType("int *") int[] height, @NativeType("int *") int @Nullable [] xoff, @NativeType("int *") int @Nullable [] yoff) {
        if (CHECKS) {
            check(width, 1);
            check(height, 1);
            checkSafe(xoff, 1);
            checkSafe(yoff, 1);
        }
        long __result = nstbtt_GetCodepointBitmapSubpixel(info.address(), scale_x, scale_y, shift_x, shift_y, codepoint, width, height, xoff, yoff);
        return memByteBufferSafe(__result, width[0] * height[0]);
    }

    /** {@code void stbtt_MakeCodepointBitmapSubpixelPrefilter(stbtt_fontinfo const * info, unsigned char * output, int out_w, int out_h, int out_stride, float scale_x, float scale_y, float shift_x, float shift_y, int oversample_x, int oversample_y, float * sub_x, float * sub_y, int codepoint)} */
    public static native void nstbtt_MakeCodepointBitmapSubpixelPrefilter(long info, long output, int out_w, int out_h, int out_stride, float scale_x, float scale_y, float shift_x, float shift_y, int oversample_x, int oversample_y, float[] sub_x, float[] sub_y, int codepoint);

    /** {@code void stbtt_MakeCodepointBitmapSubpixelPrefilter(stbtt_fontinfo const * info, unsigned char * output, int out_w, int out_h, int out_stride, float scale_x, float scale_y, float shift_x, float shift_y, int oversample_x, int oversample_y, float * sub_x, float * sub_y, int codepoint)} */
    public static void stbtt_MakeCodepointBitmapSubpixelPrefilter(@NativeType("stbtt_fontinfo const *") STBTTFontinfo info, @NativeType("unsigned char *") ByteBuffer output, int out_w, int out_h, int out_stride, float scale_x, float scale_y, float shift_x, float shift_y, int oversample_x, int oversample_y, @NativeType("float *") float[] sub_x, @NativeType("float *") float[] sub_y, int codepoint) {
        if (CHECKS) {
            check(output, (out_stride != 0 ? out_stride : out_w) * out_h);
            check(sub_x, 1);
            check(sub_y, 1);
        }
        nstbtt_MakeCodepointBitmapSubpixelPrefilter(info.address(), memAddress(output), out_w, out_h, out_stride, scale_x, scale_y, shift_x, shift_y, oversample_x, oversample_y, sub_x, sub_y, codepoint);
    }

    /** {@code void stbtt_GetCodepointBitmapBox(stbtt_fontinfo const * font, int codepoint, float scale_x, float scale_y, int * ix0, int * iy0, int * ix1, int * iy1)} */
    public static native void nstbtt_GetCodepointBitmapBox(long font, int codepoint, float scale_x, float scale_y, int[] ix0, int[] iy0, int[] ix1, int[] iy1);

    /** {@code void stbtt_GetCodepointBitmapBox(stbtt_fontinfo const * font, int codepoint, float scale_x, float scale_y, int * ix0, int * iy0, int * ix1, int * iy1)} */
    public static void stbtt_GetCodepointBitmapBox(@NativeType("stbtt_fontinfo const *") STBTTFontinfo font, int codepoint, float scale_x, float scale_y, @NativeType("int *") int @Nullable [] ix0, @NativeType("int *") int @Nullable [] iy0, @NativeType("int *") int @Nullable [] ix1, @NativeType("int *") int @Nullable [] iy1) {
        if (CHECKS) {
            checkSafe(ix0, 1);
            checkSafe(iy0, 1);
            checkSafe(ix1, 1);
            checkSafe(iy1, 1);
        }
        nstbtt_GetCodepointBitmapBox(font.address(), codepoint, scale_x, scale_y, ix0, iy0, ix1, iy1);
    }

    /** {@code void stbtt_GetCodepointBitmapBoxSubpixel(stbtt_fontinfo const * font, int codepoint, float scale_x, float scale_y, float shift_x, float shift_y, int * ix0, int * iy0, int * ix1, int * iy1)} */
    public static native void nstbtt_GetCodepointBitmapBoxSubpixel(long font, int codepoint, float scale_x, float scale_y, float shift_x, float shift_y, int[] ix0, int[] iy0, int[] ix1, int[] iy1);

    /** {@code void stbtt_GetCodepointBitmapBoxSubpixel(stbtt_fontinfo const * font, int codepoint, float scale_x, float scale_y, float shift_x, float shift_y, int * ix0, int * iy0, int * ix1, int * iy1)} */
    public static void stbtt_GetCodepointBitmapBoxSubpixel(@NativeType("stbtt_fontinfo const *") STBTTFontinfo font, int codepoint, float scale_x, float scale_y, float shift_x, float shift_y, @NativeType("int *") int @Nullable [] ix0, @NativeType("int *") int @Nullable [] iy0, @NativeType("int *") int @Nullable [] ix1, @NativeType("int *") int @Nullable [] iy1) {
        if (CHECKS) {
            checkSafe(ix0, 1);
            checkSafe(iy0, 1);
            checkSafe(ix1, 1);
            checkSafe(iy1, 1);
        }
        nstbtt_GetCodepointBitmapBoxSubpixel(font.address(), codepoint, scale_x, scale_y, shift_x, shift_y, ix0, iy0, ix1, iy1);
    }

    /** {@code unsigned char * stbtt_GetGlyphBitmap(stbtt_fontinfo const * info, float scale_x, float scale_y, int glyph, int * width, int * height, int * xoff, int * yoff)} */
    public static native long nstbtt_GetGlyphBitmap(long info, float scale_x, float scale_y, int glyph, int[] width, int[] height, int[] xoff, int[] yoff);

    /** {@code unsigned char * stbtt_GetGlyphBitmap(stbtt_fontinfo const * info, float scale_x, float scale_y, int glyph, int * width, int * height, int * xoff, int * yoff)} */
    @NativeType("unsigned char *")
    public static @Nullable ByteBuffer stbtt_GetGlyphBitmap(@NativeType("stbtt_fontinfo const *") STBTTFontinfo info, float scale_x, float scale_y, int glyph, @NativeType("int *") int[] width, @NativeType("int *") int[] height, @NativeType("int *") int @Nullable [] xoff, @NativeType("int *") int @Nullable [] yoff) {
        if (CHECKS) {
            check(width, 1);
            check(height, 1);
            checkSafe(xoff, 1);
            checkSafe(yoff, 1);
        }
        long __result = nstbtt_GetGlyphBitmap(info.address(), scale_x, scale_y, glyph, width, height, xoff, yoff);
        return memByteBufferSafe(__result, width[0] * height[0]);
    }

    /** {@code unsigned char * stbtt_GetGlyphBitmapSubpixel(stbtt_fontinfo const * info, float scale_x, float scale_y, float shift_x, float shift_y, int glyph, int * width, int * height, int * xoff, int * yoff)} */
    public static native long nstbtt_GetGlyphBitmapSubpixel(long info, float scale_x, float scale_y, float shift_x, float shift_y, int glyph, int[] width, int[] height, int[] xoff, int[] yoff);

    /** {@code unsigned char * stbtt_GetGlyphBitmapSubpixel(stbtt_fontinfo const * info, float scale_x, float scale_y, float shift_x, float shift_y, int glyph, int * width, int * height, int * xoff, int * yoff)} */
    @NativeType("unsigned char *")
    public static @Nullable ByteBuffer stbtt_GetGlyphBitmapSubpixel(@NativeType("stbtt_fontinfo const *") STBTTFontinfo info, float scale_x, float scale_y, float shift_x, float shift_y, int glyph, @NativeType("int *") int[] width, @NativeType("int *") int[] height, @NativeType("int *") int @Nullable [] xoff, @NativeType("int *") int @Nullable [] yoff) {
        if (CHECKS) {
            check(width, 1);
            check(height, 1);
            checkSafe(xoff, 1);
            checkSafe(yoff, 1);
        }
        long __result = nstbtt_GetGlyphBitmapSubpixel(info.address(), scale_x, scale_y, shift_x, shift_y, glyph, width, height, xoff, yoff);
        return memByteBufferSafe(__result, width[0] * height[0]);
    }

    /** {@code void stbtt_MakeGlyphBitmapSubpixelPrefilter(stbtt_fontinfo const * info, unsigned char * output, int out_w, int out_h, int out_stride, float scale_x, float scale_y, float shift_x, float shift_y, int oversample_x, int oversample_y, float * sub_x, float * sub_y, int glyph)} */
    public static native void nstbtt_MakeGlyphBitmapSubpixelPrefilter(long info, long output, int out_w, int out_h, int out_stride, float scale_x, float scale_y, float shift_x, float shift_y, int oversample_x, int oversample_y, float[] sub_x, float[] sub_y, int glyph);

    /** {@code void stbtt_MakeGlyphBitmapSubpixelPrefilter(stbtt_fontinfo const * info, unsigned char * output, int out_w, int out_h, int out_stride, float scale_x, float scale_y, float shift_x, float shift_y, int oversample_x, int oversample_y, float * sub_x, float * sub_y, int glyph)} */
    public static void stbtt_MakeGlyphBitmapSubpixelPrefilter(@NativeType("stbtt_fontinfo const *") STBTTFontinfo info, @NativeType("unsigned char *") ByteBuffer output, int out_w, int out_h, int out_stride, float scale_x, float scale_y, float shift_x, float shift_y, int oversample_x, int oversample_y, @NativeType("float *") float[] sub_x, @NativeType("float *") float[] sub_y, int glyph) {
        if (CHECKS) {
            check(output, (out_stride != 0 ? out_stride : out_w) * out_h);
            check(sub_x, 1);
            check(sub_y, 1);
        }
        nstbtt_MakeGlyphBitmapSubpixelPrefilter(info.address(), memAddress(output), out_w, out_h, out_stride, scale_x, scale_y, shift_x, shift_y, oversample_x, oversample_y, sub_x, sub_y, glyph);
    }

    /** {@code void stbtt_GetGlyphBitmapBox(stbtt_fontinfo const * font, int glyph, float scale_x, float scale_y, int * ix0, int * iy0, int * ix1, int * iy1)} */
    public static native void nstbtt_GetGlyphBitmapBox(long font, int glyph, float scale_x, float scale_y, int[] ix0, int[] iy0, int[] ix1, int[] iy1);

    /** {@code void stbtt_GetGlyphBitmapBox(stbtt_fontinfo const * font, int glyph, float scale_x, float scale_y, int * ix0, int * iy0, int * ix1, int * iy1)} */
    public static void stbtt_GetGlyphBitmapBox(@NativeType("stbtt_fontinfo const *") STBTTFontinfo font, int glyph, float scale_x, float scale_y, @NativeType("int *") int @Nullable [] ix0, @NativeType("int *") int @Nullable [] iy0, @NativeType("int *") int @Nullable [] ix1, @NativeType("int *") int @Nullable [] iy1) {
        if (CHECKS) {
            checkSafe(ix0, 1);
            checkSafe(iy0, 1);
            checkSafe(ix1, 1);
            checkSafe(iy1, 1);
        }
        nstbtt_GetGlyphBitmapBox(font.address(), glyph, scale_x, scale_y, ix0, iy0, ix1, iy1);
    }

    /** {@code void stbtt_GetGlyphBitmapBoxSubpixel(stbtt_fontinfo const * font, int glyph, float scale_x, float scale_y, float shift_x, float shift_y, int * ix0, int * iy0, int * ix1, int * iy1)} */
    public static native void nstbtt_GetGlyphBitmapBoxSubpixel(long font, int glyph, float scale_x, float scale_y, float shift_x, float shift_y, int[] ix0, int[] iy0, int[] ix1, int[] iy1);

    /** {@code void stbtt_GetGlyphBitmapBoxSubpixel(stbtt_fontinfo const * font, int glyph, float scale_x, float scale_y, float shift_x, float shift_y, int * ix0, int * iy0, int * ix1, int * iy1)} */
    public static void stbtt_GetGlyphBitmapBoxSubpixel(@NativeType("stbtt_fontinfo const *") STBTTFontinfo font, int glyph, float scale_x, float scale_y, float shift_x, float shift_y, @NativeType("int *") int @Nullable [] ix0, @NativeType("int *") int @Nullable [] iy0, @NativeType("int *") int @Nullable [] ix1, @NativeType("int *") int @Nullable [] iy1) {
        if (CHECKS) {
            checkSafe(ix0, 1);
            checkSafe(iy0, 1);
            checkSafe(ix1, 1);
            checkSafe(iy1, 1);
        }
        nstbtt_GetGlyphBitmapBoxSubpixel(font.address(), glyph, scale_x, scale_y, shift_x, shift_y, ix0, iy0, ix1, iy1);
    }

    /** {@code unsigned char * stbtt_GetGlyphSDF(stbtt_fontinfo const * font, float scale, int glyph, int padding, unsigned char onedge_value, float pixel_dist_scale, int * width, int * height, int * xoff, int * yoff)} */
    public static native long nstbtt_GetGlyphSDF(long font, float scale, int glyph, int padding, byte onedge_value, float pixel_dist_scale, int[] width, int[] height, int[] xoff, int[] yoff);

    /** {@code unsigned char * stbtt_GetGlyphSDF(stbtt_fontinfo const * font, float scale, int glyph, int padding, unsigned char onedge_value, float pixel_dist_scale, int * width, int * height, int * xoff, int * yoff)} */
    @NativeType("unsigned char *")
    public static @Nullable ByteBuffer stbtt_GetGlyphSDF(@NativeType("stbtt_fontinfo const *") STBTTFontinfo font, float scale, int glyph, int padding, @NativeType("unsigned char") byte onedge_value, float pixel_dist_scale, @NativeType("int *") int[] width, @NativeType("int *") int[] height, @NativeType("int *") int[] xoff, @NativeType("int *") int[] yoff) {
        if (CHECKS) {
            check(width, 1);
            check(height, 1);
            check(xoff, 1);
            check(yoff, 1);
        }
        long __result = nstbtt_GetGlyphSDF(font.address(), scale, glyph, padding, onedge_value, pixel_dist_scale, width, height, xoff, yoff);
        return memByteBufferSafe(__result, width[0] * height[0]);
    }

    /** {@code unsigned char * stbtt_GetCodepointSDF(stbtt_fontinfo const * font, float scale, int codepoint, int padding, unsigned char onedge_value, float pixel_dist_scale, int * width, int * height, int * xoff, int * yoff)} */
    public static native long nstbtt_GetCodepointSDF(long font, float scale, int codepoint, int padding, byte onedge_value, float pixel_dist_scale, int[] width, int[] height, int[] xoff, int[] yoff);

    /** {@code unsigned char * stbtt_GetCodepointSDF(stbtt_fontinfo const * font, float scale, int codepoint, int padding, unsigned char onedge_value, float pixel_dist_scale, int * width, int * height, int * xoff, int * yoff)} */
    @NativeType("unsigned char *")
    public static @Nullable ByteBuffer stbtt_GetCodepointSDF(@NativeType("stbtt_fontinfo const *") STBTTFontinfo font, float scale, int codepoint, int padding, @NativeType("unsigned char") byte onedge_value, float pixel_dist_scale, @NativeType("int *") int[] width, @NativeType("int *") int[] height, @NativeType("int *") int[] xoff, @NativeType("int *") int[] yoff) {
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