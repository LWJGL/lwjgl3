/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
#include "common_tools.h"
DISABLE_WARNINGS()
#include "lwjgl_malloc.h"
#define STBTT_malloc(x,u)  ((void)(u),org_lwjgl_malloc(x))
#define STBTT_free(x,u)    ((void)(u),org_lwjgl_free(x))
#define STBTT_assert
#define STB_TRUETYPE_IMPLEMENTATION
#define STBTT_STATIC
#include "stb_rect_pack.h"
#include "stb_truetype.h"
ENABLE_WARNINGS()

EXTERN_C_ENTER

JNIEXPORT jint JNICALL Java_org_lwjgl_stb_STBTruetype_nstbtt_1BakeFontBitmap(JNIEnv *__env, jclass clazz, jlong dataAddress, jint offset, jfloat pixel_height, jlong pixelsAddress, jint pw, jint ph, jint first_char, jint num_chars, jlong chardataAddress) {
    unsigned char const *data = (unsigned char const *)(intptr_t)dataAddress;
    unsigned char *pixels = (unsigned char *)(intptr_t)pixelsAddress;
    stbtt_bakedchar *chardata = (stbtt_bakedchar *)(intptr_t)chardataAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)stbtt_BakeFontBitmap(data, offset, pixel_height, pixels, pw, ph, first_char, num_chars, chardata);
}

JNIEXPORT void JNICALL Java_org_lwjgl_stb_STBTruetype_nstbtt_1GetBakedQuad__JIIIJJJI(JNIEnv *__env, jclass clazz, jlong chardataAddress, jint pw, jint ph, jint char_index, jlong xposAddress, jlong yposAddress, jlong qAddress, jint opengl_fillrule) {
    stbtt_bakedchar const *chardata = (stbtt_bakedchar const *)(intptr_t)chardataAddress;
    float *xpos = (float *)(intptr_t)xposAddress;
    float *ypos = (float *)(intptr_t)yposAddress;
    stbtt_aligned_quad *q = (stbtt_aligned_quad *)(intptr_t)qAddress;
    UNUSED_PARAMS(__env, clazz)
    stbtt_GetBakedQuad(chardata, pw, ph, char_index, xpos, ypos, q, opengl_fillrule);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_stb_STBTruetype_nstbtt_1PackBegin(JNIEnv *__env, jclass clazz, jlong spcAddress, jlong pixelsAddress, jint width, jint height, jint stride_in_bytes, jint padding, jlong alloc_contextAddress) {
    stbtt_pack_context *spc = (stbtt_pack_context *)(intptr_t)spcAddress;
    unsigned char *pixels = (unsigned char *)(intptr_t)pixelsAddress;
    void *alloc_context = (void *)(intptr_t)alloc_contextAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)stbtt_PackBegin(spc, pixels, width, height, stride_in_bytes, padding, alloc_context);
}

JNIEXPORT void JNICALL Java_org_lwjgl_stb_STBTruetype_nstbtt_1PackEnd(JNIEnv *__env, jclass clazz, jlong spcAddress) {
    stbtt_pack_context *spc = (stbtt_pack_context *)(intptr_t)spcAddress;
    UNUSED_PARAMS(__env, clazz)
    stbtt_PackEnd(spc);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_stb_STBTruetype_nstbtt_1PackFontRange(JNIEnv *__env, jclass clazz, jlong spcAddress, jlong fontdataAddress, jint font_index, jfloat font_size, jint first_unicode_char_in_range, jint num_chars_in_range, jlong chardata_for_rangeAddress) {
    stbtt_pack_context *spc = (stbtt_pack_context *)(intptr_t)spcAddress;
    unsigned char const *fontdata = (unsigned char const *)(intptr_t)fontdataAddress;
    stbtt_packedchar *chardata_for_range = (stbtt_packedchar *)(intptr_t)chardata_for_rangeAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)stbtt_PackFontRange(spc, fontdata, font_index, font_size, first_unicode_char_in_range, num_chars_in_range, chardata_for_range);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_stb_STBTruetype_nstbtt_1PackFontRanges(JNIEnv *__env, jclass clazz, jlong spcAddress, jlong fontdataAddress, jint font_index, jlong rangesAddress, jint num_ranges) {
    stbtt_pack_context *spc = (stbtt_pack_context *)(intptr_t)spcAddress;
    unsigned char const *fontdata = (unsigned char const *)(intptr_t)fontdataAddress;
    stbtt_pack_range *ranges = (stbtt_pack_range *)(intptr_t)rangesAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)stbtt_PackFontRanges(spc, fontdata, font_index, ranges, num_ranges);
}

JNIEXPORT void JNICALL Java_org_lwjgl_stb_STBTruetype_nstbtt_1PackSetOversampling(JNIEnv *__env, jclass clazz, jlong spcAddress, jint h_oversample, jint v_oversample) {
    stbtt_pack_context *spc = (stbtt_pack_context *)(intptr_t)spcAddress;
    UNUSED_PARAMS(__env, clazz)
    stbtt_PackSetOversampling(spc, (unsigned int)h_oversample, (unsigned int)v_oversample);
}

JNIEXPORT void JNICALL Java_org_lwjgl_stb_STBTruetype_nstbtt_1GetPackedQuad__JIIIJJJI(JNIEnv *__env, jclass clazz, jlong chardataAddress, jint pw, jint ph, jint char_index, jlong xposAddress, jlong yposAddress, jlong qAddress, jint align_to_integer) {
    stbtt_packedchar const *chardata = (stbtt_packedchar const *)(intptr_t)chardataAddress;
    float *xpos = (float *)(intptr_t)xposAddress;
    float *ypos = (float *)(intptr_t)yposAddress;
    stbtt_aligned_quad *q = (stbtt_aligned_quad *)(intptr_t)qAddress;
    UNUSED_PARAMS(__env, clazz)
    stbtt_GetPackedQuad(chardata, pw, ph, char_index, xpos, ypos, q, align_to_integer);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_stb_STBTruetype_nstbtt_1PackFontRangesGatherRects(JNIEnv *__env, jclass clazz, jlong spcAddress, jlong infoAddress, jlong rangesAddress, jint num_ranges, jlong rectsAddress) {
    stbtt_pack_context *spc = (stbtt_pack_context *)(intptr_t)spcAddress;
    stbtt_fontinfo *info = (stbtt_fontinfo *)(intptr_t)infoAddress;
    stbtt_pack_range *ranges = (stbtt_pack_range *)(intptr_t)rangesAddress;
    stbrp_rect *rects = (stbrp_rect *)(intptr_t)rectsAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)stbtt_PackFontRangesGatherRects(spc, info, ranges, num_ranges, rects);
}

JNIEXPORT void JNICALL Java_org_lwjgl_stb_STBTruetype_nstbtt_1PackFontRangesPackRects(JNIEnv *__env, jclass clazz, jlong spcAddress, jlong rectsAddress, jint num_rects) {
    stbtt_pack_context *spc = (stbtt_pack_context *)(intptr_t)spcAddress;
    stbrp_rect *rects = (stbrp_rect *)(intptr_t)rectsAddress;
    UNUSED_PARAMS(__env, clazz)
    stbtt_PackFontRangesPackRects(spc, rects, num_rects);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_stb_STBTruetype_nstbtt_1PackFontRangesRenderIntoRects(JNIEnv *__env, jclass clazz, jlong spcAddress, jlong infoAddress, jlong rangesAddress, jint num_ranges, jlong rectsAddress) {
    stbtt_pack_context *spc = (stbtt_pack_context *)(intptr_t)spcAddress;
    stbtt_fontinfo *info = (stbtt_fontinfo *)(intptr_t)infoAddress;
    stbtt_pack_range *ranges = (stbtt_pack_range *)(intptr_t)rangesAddress;
    stbrp_rect *rects = (stbrp_rect *)(intptr_t)rectsAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)stbtt_PackFontRangesRenderIntoRects(spc, info, ranges, num_ranges, rects);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_stb_STBTruetype_nstbtt_1GetNumberOfFonts(JNIEnv *__env, jclass clazz, jlong dataAddress) {
    unsigned char const *data = (unsigned char const *)(intptr_t)dataAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)stbtt_GetNumberOfFonts(data);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_stb_STBTruetype_nstbtt_1GetFontOffsetForIndex(JNIEnv *__env, jclass clazz, jlong dataAddress, jint index) {
    unsigned char const *data = (unsigned char const *)(intptr_t)dataAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)stbtt_GetFontOffsetForIndex(data, index);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_stb_STBTruetype_nstbtt_1InitFont(JNIEnv *__env, jclass clazz, jlong infoAddress, jlong dataAddress, jint offset) {
    stbtt_fontinfo *info = (stbtt_fontinfo *)(intptr_t)infoAddress;
    unsigned char const *data = (unsigned char const *)(intptr_t)dataAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)stbtt_InitFont(info, data, offset);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_stb_STBTruetype_nstbtt_1FindGlyphIndex(JNIEnv *__env, jclass clazz, jlong infoAddress, jint unicode_codepoint) {
    stbtt_fontinfo const *info = (stbtt_fontinfo const *)(intptr_t)infoAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)stbtt_FindGlyphIndex(info, unicode_codepoint);
}

JNIEXPORT jfloat JNICALL Java_org_lwjgl_stb_STBTruetype_nstbtt_1ScaleForPixelHeight(JNIEnv *__env, jclass clazz, jlong infoAddress, jfloat pixels) {
    stbtt_fontinfo const *info = (stbtt_fontinfo const *)(intptr_t)infoAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jfloat)stbtt_ScaleForPixelHeight(info, pixels);
}

JNIEXPORT jfloat JNICALL Java_org_lwjgl_stb_STBTruetype_nstbtt_1ScaleForMappingEmToPixels(JNIEnv *__env, jclass clazz, jlong infoAddress, jfloat pixels) {
    stbtt_fontinfo const *info = (stbtt_fontinfo const *)(intptr_t)infoAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jfloat)stbtt_ScaleForMappingEmToPixels(info, pixels);
}

JNIEXPORT void JNICALL Java_org_lwjgl_stb_STBTruetype_nstbtt_1GetFontVMetrics__JJJJ(JNIEnv *__env, jclass clazz, jlong infoAddress, jlong ascentAddress, jlong descentAddress, jlong lineGapAddress) {
    stbtt_fontinfo const *info = (stbtt_fontinfo const *)(intptr_t)infoAddress;
    int *ascent = (int *)(intptr_t)ascentAddress;
    int *descent = (int *)(intptr_t)descentAddress;
    int *lineGap = (int *)(intptr_t)lineGapAddress;
    UNUSED_PARAMS(__env, clazz)
    stbtt_GetFontVMetrics(info, ascent, descent, lineGap);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_stb_STBTruetype_nstbtt_1GetFontVMetricsOS2__JJJJ(JNIEnv *__env, jclass clazz, jlong infoAddress, jlong typoAscentAddress, jlong typoDescentAddress, jlong typoLineGapAddress) {
    stbtt_fontinfo const *info = (stbtt_fontinfo const *)(intptr_t)infoAddress;
    int *typoAscent = (int *)(intptr_t)typoAscentAddress;
    int *typoDescent = (int *)(intptr_t)typoDescentAddress;
    int *typoLineGap = (int *)(intptr_t)typoLineGapAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)stbtt_GetFontVMetricsOS2(info, typoAscent, typoDescent, typoLineGap);
}

JNIEXPORT void JNICALL Java_org_lwjgl_stb_STBTruetype_nstbtt_1GetFontBoundingBox__JJJJJ(JNIEnv *__env, jclass clazz, jlong infoAddress, jlong x0Address, jlong y0Address, jlong x1Address, jlong y1Address) {
    stbtt_fontinfo const *info = (stbtt_fontinfo const *)(intptr_t)infoAddress;
    int *x0 = (int *)(intptr_t)x0Address;
    int *y0 = (int *)(intptr_t)y0Address;
    int *x1 = (int *)(intptr_t)x1Address;
    int *y1 = (int *)(intptr_t)y1Address;
    UNUSED_PARAMS(__env, clazz)
    stbtt_GetFontBoundingBox(info, x0, y0, x1, y1);
}

JNIEXPORT void JNICALL Java_org_lwjgl_stb_STBTruetype_nstbtt_1GetCodepointHMetrics__JIJJ(JNIEnv *__env, jclass clazz, jlong infoAddress, jint codepoint, jlong advanceWidthAddress, jlong leftSideBearingAddress) {
    stbtt_fontinfo const *info = (stbtt_fontinfo const *)(intptr_t)infoAddress;
    int *advanceWidth = (int *)(intptr_t)advanceWidthAddress;
    int *leftSideBearing = (int *)(intptr_t)leftSideBearingAddress;
    UNUSED_PARAMS(__env, clazz)
    stbtt_GetCodepointHMetrics(info, codepoint, advanceWidth, leftSideBearing);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_stb_STBTruetype_nstbtt_1GetCodepointKernAdvance(JNIEnv *__env, jclass clazz, jlong infoAddress, jint ch1, jint ch2) {
    stbtt_fontinfo const *info = (stbtt_fontinfo const *)(intptr_t)infoAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)stbtt_GetCodepointKernAdvance(info, ch1, ch2);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_stb_STBTruetype_nstbtt_1GetCodepointBox__JIJJJJ(JNIEnv *__env, jclass clazz, jlong infoAddress, jint codepoint, jlong x0Address, jlong y0Address, jlong x1Address, jlong y1Address) {
    stbtt_fontinfo const *info = (stbtt_fontinfo const *)(intptr_t)infoAddress;
    int *x0 = (int *)(intptr_t)x0Address;
    int *y0 = (int *)(intptr_t)y0Address;
    int *x1 = (int *)(intptr_t)x1Address;
    int *y1 = (int *)(intptr_t)y1Address;
    UNUSED_PARAMS(__env, clazz)
    return (jint)stbtt_GetCodepointBox(info, codepoint, x0, y0, x1, y1);
}

JNIEXPORT void JNICALL Java_org_lwjgl_stb_STBTruetype_nstbtt_1GetGlyphHMetrics__JIJJ(JNIEnv *__env, jclass clazz, jlong infoAddress, jint glyph_index, jlong advanceWidthAddress, jlong leftSideBearingAddress) {
    stbtt_fontinfo const *info = (stbtt_fontinfo const *)(intptr_t)infoAddress;
    int *advanceWidth = (int *)(intptr_t)advanceWidthAddress;
    int *leftSideBearing = (int *)(intptr_t)leftSideBearingAddress;
    UNUSED_PARAMS(__env, clazz)
    stbtt_GetGlyphHMetrics(info, glyph_index, advanceWidth, leftSideBearing);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_stb_STBTruetype_nstbtt_1GetGlyphKernAdvance(JNIEnv *__env, jclass clazz, jlong infoAddress, jint glyph1, jint glyph2) {
    stbtt_fontinfo const *info = (stbtt_fontinfo const *)(intptr_t)infoAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)stbtt_GetGlyphKernAdvance(info, glyph1, glyph2);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_stb_STBTruetype_nstbtt_1GetGlyphBox__JIJJJJ(JNIEnv *__env, jclass clazz, jlong infoAddress, jint glyph_index, jlong x0Address, jlong y0Address, jlong x1Address, jlong y1Address) {
    stbtt_fontinfo const *info = (stbtt_fontinfo const *)(intptr_t)infoAddress;
    int *x0 = (int *)(intptr_t)x0Address;
    int *y0 = (int *)(intptr_t)y0Address;
    int *x1 = (int *)(intptr_t)x1Address;
    int *y1 = (int *)(intptr_t)y1Address;
    UNUSED_PARAMS(__env, clazz)
    return (jint)stbtt_GetGlyphBox(info, glyph_index, x0, y0, x1, y1);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_stb_STBTruetype_nstbtt_1IsGlyphEmpty(JNIEnv *__env, jclass clazz, jlong infoAddress, jint glyph_index) {
    stbtt_fontinfo const *info = (stbtt_fontinfo const *)(intptr_t)infoAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)stbtt_IsGlyphEmpty(info, glyph_index);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_stb_STBTruetype_nstbtt_1GetCodepointShape(JNIEnv *__env, jclass clazz, jlong infoAddress, jint unicode_codepoint, jlong verticesAddress) {
    stbtt_fontinfo const *info = (stbtt_fontinfo const *)(intptr_t)infoAddress;
    stbtt_vertex **vertices = (stbtt_vertex **)(intptr_t)verticesAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)stbtt_GetCodepointShape(info, unicode_codepoint, vertices);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_stb_STBTruetype_nstbtt_1GetGlyphShape(JNIEnv *__env, jclass clazz, jlong infoAddress, jint glyph_index, jlong verticesAddress) {
    stbtt_fontinfo const *info = (stbtt_fontinfo const *)(intptr_t)infoAddress;
    stbtt_vertex **vertices = (stbtt_vertex **)(intptr_t)verticesAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)stbtt_GetGlyphShape(info, glyph_index, vertices);
}

JNIEXPORT void JNICALL Java_org_lwjgl_stb_STBTruetype_nstbtt_1FreeShape(JNIEnv *__env, jclass clazz, jlong infoAddress, jlong verticesAddress) {
    stbtt_fontinfo const *info = (stbtt_fontinfo const *)(intptr_t)infoAddress;
    stbtt_vertex *vertices = (stbtt_vertex *)(intptr_t)verticesAddress;
    UNUSED_PARAMS(__env, clazz)
    stbtt_FreeShape(info, vertices);
}

JNIEXPORT void JNICALL Java_org_lwjgl_stb_STBTruetype_nstbtt_1FreeBitmap(JNIEnv *__env, jclass clazz, jlong bitmapAddress, jlong userdataAddress) {
    unsigned char *bitmap = (unsigned char *)(intptr_t)bitmapAddress;
    void *userdata = (void *)(intptr_t)userdataAddress;
    UNUSED_PARAMS(__env, clazz)
    stbtt_FreeBitmap(bitmap, userdata);
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_stb_STBTruetype_nstbtt_1GetCodepointBitmap__JFFIJJJJ(JNIEnv *__env, jclass clazz, jlong infoAddress, jfloat scale_x, jfloat scale_y, jint codepoint, jlong widthAddress, jlong heightAddress, jlong xoffAddress, jlong yoffAddress) {
    stbtt_fontinfo const *info = (stbtt_fontinfo const *)(intptr_t)infoAddress;
    int *width = (int *)(intptr_t)widthAddress;
    int *height = (int *)(intptr_t)heightAddress;
    int *xoff = (int *)(intptr_t)xoffAddress;
    int *yoff = (int *)(intptr_t)yoffAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jlong)(intptr_t)stbtt_GetCodepointBitmap(info, scale_x, scale_y, codepoint, width, height, xoff, yoff);
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_stb_STBTruetype_nstbtt_1GetCodepointBitmapSubpixel__JFFFFIJJJJ(JNIEnv *__env, jclass clazz, jlong infoAddress, jfloat scale_x, jfloat scale_y, jfloat shift_x, jfloat shift_y, jint codepoint, jlong widthAddress, jlong heightAddress, jlong xoffAddress, jlong yoffAddress) {
    stbtt_fontinfo const *info = (stbtt_fontinfo const *)(intptr_t)infoAddress;
    int *width = (int *)(intptr_t)widthAddress;
    int *height = (int *)(intptr_t)heightAddress;
    int *xoff = (int *)(intptr_t)xoffAddress;
    int *yoff = (int *)(intptr_t)yoffAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jlong)(intptr_t)stbtt_GetCodepointBitmapSubpixel(info, scale_x, scale_y, shift_x, shift_y, codepoint, width, height, xoff, yoff);
}

JNIEXPORT void JNICALL Java_org_lwjgl_stb_STBTruetype_nstbtt_1MakeCodepointBitmap(JNIEnv *__env, jclass clazz, jlong infoAddress, jlong outputAddress, jint out_w, jint out_h, jint out_stride, jfloat scale_x, jfloat scale_y, jint codepoint) {
    stbtt_fontinfo const *info = (stbtt_fontinfo const *)(intptr_t)infoAddress;
    unsigned char *output = (unsigned char *)(intptr_t)outputAddress;
    UNUSED_PARAMS(__env, clazz)
    stbtt_MakeCodepointBitmap(info, output, out_w, out_h, out_stride, scale_x, scale_y, codepoint);
}

JNIEXPORT void JNICALL Java_org_lwjgl_stb_STBTruetype_nstbtt_1MakeCodepointBitmapSubpixel(JNIEnv *__env, jclass clazz, jlong infoAddress, jlong outputAddress, jint out_w, jint out_h, jint out_stride, jfloat scale_x, jfloat scale_y, jfloat shift_x, jfloat shift_y, jint codepoint) {
    stbtt_fontinfo const *info = (stbtt_fontinfo const *)(intptr_t)infoAddress;
    unsigned char *output = (unsigned char *)(intptr_t)outputAddress;
    UNUSED_PARAMS(__env, clazz)
    stbtt_MakeCodepointBitmapSubpixel(info, output, out_w, out_h, out_stride, scale_x, scale_y, shift_x, shift_y, codepoint);
}

JNIEXPORT void JNICALL Java_org_lwjgl_stb_STBTruetype_nstbtt_1MakeCodepointBitmapSubpixelPrefilter__JJIIIFFFFIIJJI(JNIEnv *__env, jclass clazz, jlong infoAddress, jlong outputAddress, jint out_w, jint out_h, jint out_stride, jfloat scale_x, jfloat scale_y, jfloat shift_x, jfloat shift_y, jint oversample_x, jint oversample_y, jlong sub_xAddress, jlong sub_yAddress, jint codepoint) {
    stbtt_fontinfo const *info = (stbtt_fontinfo const *)(intptr_t)infoAddress;
    unsigned char *output = (unsigned char *)(intptr_t)outputAddress;
    float *sub_x = (float *)(intptr_t)sub_xAddress;
    float *sub_y = (float *)(intptr_t)sub_yAddress;
    UNUSED_PARAMS(__env, clazz)
    stbtt_MakeCodepointBitmapSubpixelPrefilter(info, output, out_w, out_h, out_stride, scale_x, scale_y, shift_x, shift_y, oversample_x, oversample_y, sub_x, sub_y, codepoint);
}

JNIEXPORT void JNICALL Java_org_lwjgl_stb_STBTruetype_nstbtt_1GetCodepointBitmapBox__JIFFJJJJ(JNIEnv *__env, jclass clazz, jlong fontAddress, jint codepoint, jfloat scale_x, jfloat scale_y, jlong ix0Address, jlong iy0Address, jlong ix1Address, jlong iy1Address) {
    stbtt_fontinfo const *font = (stbtt_fontinfo const *)(intptr_t)fontAddress;
    int *ix0 = (int *)(intptr_t)ix0Address;
    int *iy0 = (int *)(intptr_t)iy0Address;
    int *ix1 = (int *)(intptr_t)ix1Address;
    int *iy1 = (int *)(intptr_t)iy1Address;
    UNUSED_PARAMS(__env, clazz)
    stbtt_GetCodepointBitmapBox(font, codepoint, scale_x, scale_y, ix0, iy0, ix1, iy1);
}

JNIEXPORT void JNICALL Java_org_lwjgl_stb_STBTruetype_nstbtt_1GetCodepointBitmapBoxSubpixel__JIFFFFJJJJ(JNIEnv *__env, jclass clazz, jlong fontAddress, jint codepoint, jfloat scale_x, jfloat scale_y, jfloat shift_x, jfloat shift_y, jlong ix0Address, jlong iy0Address, jlong ix1Address, jlong iy1Address) {
    stbtt_fontinfo const *font = (stbtt_fontinfo const *)(intptr_t)fontAddress;
    int *ix0 = (int *)(intptr_t)ix0Address;
    int *iy0 = (int *)(intptr_t)iy0Address;
    int *ix1 = (int *)(intptr_t)ix1Address;
    int *iy1 = (int *)(intptr_t)iy1Address;
    UNUSED_PARAMS(__env, clazz)
    stbtt_GetCodepointBitmapBoxSubpixel(font, codepoint, scale_x, scale_y, shift_x, shift_y, ix0, iy0, ix1, iy1);
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_stb_STBTruetype_nstbtt_1GetGlyphBitmap__JFFIJJJJ(JNIEnv *__env, jclass clazz, jlong infoAddress, jfloat scale_x, jfloat scale_y, jint glyph, jlong widthAddress, jlong heightAddress, jlong xoffAddress, jlong yoffAddress) {
    stbtt_fontinfo const *info = (stbtt_fontinfo const *)(intptr_t)infoAddress;
    int *width = (int *)(intptr_t)widthAddress;
    int *height = (int *)(intptr_t)heightAddress;
    int *xoff = (int *)(intptr_t)xoffAddress;
    int *yoff = (int *)(intptr_t)yoffAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jlong)(intptr_t)stbtt_GetGlyphBitmap(info, scale_x, scale_y, glyph, width, height, xoff, yoff);
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_stb_STBTruetype_nstbtt_1GetGlyphBitmapSubpixel__JFFFFIJJJJ(JNIEnv *__env, jclass clazz, jlong infoAddress, jfloat scale_x, jfloat scale_y, jfloat shift_x, jfloat shift_y, jint glyph, jlong widthAddress, jlong heightAddress, jlong xoffAddress, jlong yoffAddress) {
    stbtt_fontinfo const *info = (stbtt_fontinfo const *)(intptr_t)infoAddress;
    int *width = (int *)(intptr_t)widthAddress;
    int *height = (int *)(intptr_t)heightAddress;
    int *xoff = (int *)(intptr_t)xoffAddress;
    int *yoff = (int *)(intptr_t)yoffAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jlong)(intptr_t)stbtt_GetGlyphBitmapSubpixel(info, scale_x, scale_y, shift_x, shift_y, glyph, width, height, xoff, yoff);
}

JNIEXPORT void JNICALL Java_org_lwjgl_stb_STBTruetype_nstbtt_1MakeGlyphBitmap(JNIEnv *__env, jclass clazz, jlong infoAddress, jlong outputAddress, jint out_w, jint out_h, jint out_stride, jfloat scale_x, jfloat scale_y, jint glyph) {
    stbtt_fontinfo const *info = (stbtt_fontinfo const *)(intptr_t)infoAddress;
    unsigned char *output = (unsigned char *)(intptr_t)outputAddress;
    UNUSED_PARAMS(__env, clazz)
    stbtt_MakeGlyphBitmap(info, output, out_w, out_h, out_stride, scale_x, scale_y, glyph);
}

JNIEXPORT void JNICALL Java_org_lwjgl_stb_STBTruetype_nstbtt_1MakeGlyphBitmapSubpixel(JNIEnv *__env, jclass clazz, jlong infoAddress, jlong outputAddress, jint out_w, jint out_h, jint out_stride, jfloat scale_x, jfloat scale_y, jfloat shift_x, jfloat shift_y, jint glyph) {
    stbtt_fontinfo const *info = (stbtt_fontinfo const *)(intptr_t)infoAddress;
    unsigned char *output = (unsigned char *)(intptr_t)outputAddress;
    UNUSED_PARAMS(__env, clazz)
    stbtt_MakeGlyphBitmapSubpixel(info, output, out_w, out_h, out_stride, scale_x, scale_y, shift_x, shift_y, glyph);
}

JNIEXPORT void JNICALL Java_org_lwjgl_stb_STBTruetype_nstbtt_1MakeGlyphBitmapSubpixelPrefilter__JJIIIFFFFIIJJI(JNIEnv *__env, jclass clazz, jlong infoAddress, jlong outputAddress, jint out_w, jint out_h, jint out_stride, jfloat scale_x, jfloat scale_y, jfloat shift_x, jfloat shift_y, jint oversample_x, jint oversample_y, jlong sub_xAddress, jlong sub_yAddress, jint glyph) {
    stbtt_fontinfo const *info = (stbtt_fontinfo const *)(intptr_t)infoAddress;
    unsigned char *output = (unsigned char *)(intptr_t)outputAddress;
    float *sub_x = (float *)(intptr_t)sub_xAddress;
    float *sub_y = (float *)(intptr_t)sub_yAddress;
    UNUSED_PARAMS(__env, clazz)
    stbtt_MakeGlyphBitmapSubpixelPrefilter(info, output, out_w, out_h, out_stride, scale_x, scale_y, shift_x, shift_y, oversample_x, oversample_y, sub_x, sub_y, glyph);
}

JNIEXPORT void JNICALL Java_org_lwjgl_stb_STBTruetype_nstbtt_1GetGlyphBitmapBox__JIFFJJJJ(JNIEnv *__env, jclass clazz, jlong fontAddress, jint glyph, jfloat scale_x, jfloat scale_y, jlong ix0Address, jlong iy0Address, jlong ix1Address, jlong iy1Address) {
    stbtt_fontinfo const *font = (stbtt_fontinfo const *)(intptr_t)fontAddress;
    int *ix0 = (int *)(intptr_t)ix0Address;
    int *iy0 = (int *)(intptr_t)iy0Address;
    int *ix1 = (int *)(intptr_t)ix1Address;
    int *iy1 = (int *)(intptr_t)iy1Address;
    UNUSED_PARAMS(__env, clazz)
    stbtt_GetGlyphBitmapBox(font, glyph, scale_x, scale_y, ix0, iy0, ix1, iy1);
}

JNIEXPORT void JNICALL Java_org_lwjgl_stb_STBTruetype_nstbtt_1GetGlyphBitmapBoxSubpixel__JIFFFFJJJJ(JNIEnv *__env, jclass clazz, jlong fontAddress, jint glyph, jfloat scale_x, jfloat scale_y, jfloat shift_x, jfloat shift_y, jlong ix0Address, jlong iy0Address, jlong ix1Address, jlong iy1Address) {
    stbtt_fontinfo const *font = (stbtt_fontinfo const *)(intptr_t)fontAddress;
    int *ix0 = (int *)(intptr_t)ix0Address;
    int *iy0 = (int *)(intptr_t)iy0Address;
    int *ix1 = (int *)(intptr_t)ix1Address;
    int *iy1 = (int *)(intptr_t)iy1Address;
    UNUSED_PARAMS(__env, clazz)
    stbtt_GetGlyphBitmapBoxSubpixel(font, glyph, scale_x, scale_y, shift_x, shift_y, ix0, iy0, ix1, iy1);
}

JNIEXPORT void JNICALL Java_org_lwjgl_stb_STBTruetype_nstbtt_1Rasterize(JNIEnv *__env, jclass clazz, jlong resultAddress, jfloat flatness_in_pixels, jlong verticesAddress, jint num_verts, jfloat scale_x, jfloat scale_y, jfloat shift_x, jfloat shift_y, jint x_off, jint y_off, jint invert, jlong alloc_contextAddress) {
    stbtt__bitmap *result = (stbtt__bitmap *)(intptr_t)resultAddress;
    stbtt_vertex *vertices = (stbtt_vertex *)(intptr_t)verticesAddress;
    void *alloc_context = (void *)(intptr_t)alloc_contextAddress;
    UNUSED_PARAMS(__env, clazz)
    stbtt_Rasterize(result, flatness_in_pixels, vertices, num_verts, scale_x, scale_y, shift_x, shift_y, x_off, y_off, invert, alloc_context);
}

JNIEXPORT void JNICALL Java_org_lwjgl_stb_STBTruetype_nstbtt_1FreeSDF(JNIEnv *__env, jclass clazz, jlong bitmapAddress, jlong userdataAddress) {
    unsigned char *bitmap = (unsigned char *)(intptr_t)bitmapAddress;
    void *userdata = (void *)(intptr_t)userdataAddress;
    UNUSED_PARAMS(__env, clazz)
    stbtt_FreeSDF(bitmap, userdata);
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_stb_STBTruetype_nstbtt_1GetGlyphSDF__JFIIBFJJJJ(JNIEnv *__env, jclass clazz, jlong fontAddress, jfloat scale, jint glyph, jint padding, jbyte onedge_value, jfloat pixel_dist_scale, jlong widthAddress, jlong heightAddress, jlong xoffAddress, jlong yoffAddress) {
    stbtt_fontinfo const *font = (stbtt_fontinfo const *)(intptr_t)fontAddress;
    int *width = (int *)(intptr_t)widthAddress;
    int *height = (int *)(intptr_t)heightAddress;
    int *xoff = (int *)(intptr_t)xoffAddress;
    int *yoff = (int *)(intptr_t)yoffAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jlong)(intptr_t)stbtt_GetGlyphSDF(font, scale, glyph, padding, (unsigned char)onedge_value, pixel_dist_scale, width, height, xoff, yoff);
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_stb_STBTruetype_nstbtt_1GetCodepointSDF__JFIIBFJJJJ(JNIEnv *__env, jclass clazz, jlong fontAddress, jfloat scale, jint codepoint, jint padding, jbyte onedge_value, jfloat pixel_dist_scale, jlong widthAddress, jlong heightAddress, jlong xoffAddress, jlong yoffAddress) {
    stbtt_fontinfo const *font = (stbtt_fontinfo const *)(intptr_t)fontAddress;
    int *width = (int *)(intptr_t)widthAddress;
    int *height = (int *)(intptr_t)heightAddress;
    int *xoff = (int *)(intptr_t)xoffAddress;
    int *yoff = (int *)(intptr_t)yoffAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jlong)(intptr_t)stbtt_GetCodepointSDF(font, scale, codepoint, padding, (unsigned char)onedge_value, pixel_dist_scale, width, height, xoff, yoff);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_stb_STBTruetype_nstbtt_1FindMatchingFont(JNIEnv *__env, jclass clazz, jlong fontdataAddress, jlong nameAddress, jint flags) {
    unsigned char const *fontdata = (unsigned char const *)(intptr_t)fontdataAddress;
    char const *name = (char const *)(intptr_t)nameAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)stbtt_FindMatchingFont(fontdata, name, flags);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_stb_STBTruetype_nstbtt_1CompareUTF8toUTF16_1bigendian(JNIEnv *__env, jclass clazz, jlong s1Address, jint len1, jlong s2Address, jint len2) {
    char const *s1 = (char const *)(intptr_t)s1Address;
    char const *s2 = (char const *)(intptr_t)s2Address;
    UNUSED_PARAMS(__env, clazz)
    return (jint)stbtt_CompareUTF8toUTF16_bigendian(s1, len1, s2, len2);
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_stb_STBTruetype_nstbtt_1GetFontNameString(JNIEnv *__env, jclass clazz, jlong fontAddress, jlong lengthAddress, jint platformID, jint encodingID, jint languageID, jint nameID) {
    stbtt_fontinfo const *font = (stbtt_fontinfo const *)(intptr_t)fontAddress;
    int *length = (int *)(intptr_t)lengthAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jlong)(intptr_t)stbtt_GetFontNameString(font, length, platformID, encodingID, languageID, nameID);
}

JNIEXPORT void JNICALL Java_org_lwjgl_stb_STBTruetype_nstbtt_1GetBakedQuad__JIII_3F_3FJI(JNIEnv *__env, jclass clazz, jlong chardataAddress, jint pw, jint ph, jint char_index, jfloatArray xposAddress, jfloatArray yposAddress, jlong qAddress, jint opengl_fillrule) {
    stbtt_bakedchar const *chardata = (stbtt_bakedchar const *)(intptr_t)chardataAddress;
    stbtt_aligned_quad *q = (stbtt_aligned_quad *)(intptr_t)qAddress;
    jfloat *xpos = (*__env)->GetPrimitiveArrayCritical(__env, xposAddress, 0);
    jfloat *ypos = (*__env)->GetPrimitiveArrayCritical(__env, yposAddress, 0);
    UNUSED_PARAMS(__env, clazz)
    stbtt_GetBakedQuad(chardata, pw, ph, char_index, (float *)xpos, (float *)ypos, q, opengl_fillrule);
    (*__env)->ReleasePrimitiveArrayCritical(__env, yposAddress, ypos, 0);
    (*__env)->ReleasePrimitiveArrayCritical(__env, xposAddress, xpos, 0);
}
#ifdef LWJGL_WINDOWS
JNIEXPORT void JNICALL JavaCritical_org_lwjgl_stb_STBTruetype_nstbtt_1GetBakedQuad__JIII_3F_3FJI(jlong chardataAddress, jint pw, jint ph, jint char_index, jint xpos__length, jfloat* xpos, jint ypos__length, jfloat* ypos, jlong qAddress, jint opengl_fillrule) {
    stbtt_bakedchar const *chardata = (stbtt_bakedchar const *)(intptr_t)chardataAddress;
    stbtt_aligned_quad *q = (stbtt_aligned_quad *)(intptr_t)qAddress;
    UNUSED_PARAM(xpos__length)
    UNUSED_PARAM(ypos__length)
    stbtt_GetBakedQuad(chardata, pw, ph, char_index, (float *)xpos, (float *)ypos, q, opengl_fillrule);
}
#endif

JNIEXPORT void JNICALL Java_org_lwjgl_stb_STBTruetype_nstbtt_1GetPackedQuad__JIII_3F_3FJI(JNIEnv *__env, jclass clazz, jlong chardataAddress, jint pw, jint ph, jint char_index, jfloatArray xposAddress, jfloatArray yposAddress, jlong qAddress, jint align_to_integer) {
    stbtt_packedchar const *chardata = (stbtt_packedchar const *)(intptr_t)chardataAddress;
    stbtt_aligned_quad *q = (stbtt_aligned_quad *)(intptr_t)qAddress;
    jfloat *xpos = (*__env)->GetPrimitiveArrayCritical(__env, xposAddress, 0);
    jfloat *ypos = (*__env)->GetPrimitiveArrayCritical(__env, yposAddress, 0);
    UNUSED_PARAMS(__env, clazz)
    stbtt_GetPackedQuad(chardata, pw, ph, char_index, (float *)xpos, (float *)ypos, q, align_to_integer);
    (*__env)->ReleasePrimitiveArrayCritical(__env, yposAddress, ypos, 0);
    (*__env)->ReleasePrimitiveArrayCritical(__env, xposAddress, xpos, 0);
}
#ifdef LWJGL_WINDOWS
JNIEXPORT void JNICALL JavaCritical_org_lwjgl_stb_STBTruetype_nstbtt_1GetPackedQuad__JIII_3F_3FJI(jlong chardataAddress, jint pw, jint ph, jint char_index, jint xpos__length, jfloat* xpos, jint ypos__length, jfloat* ypos, jlong qAddress, jint align_to_integer) {
    stbtt_packedchar const *chardata = (stbtt_packedchar const *)(intptr_t)chardataAddress;
    stbtt_aligned_quad *q = (stbtt_aligned_quad *)(intptr_t)qAddress;
    UNUSED_PARAM(xpos__length)
    UNUSED_PARAM(ypos__length)
    stbtt_GetPackedQuad(chardata, pw, ph, char_index, (float *)xpos, (float *)ypos, q, align_to_integer);
}
#endif

JNIEXPORT void JNICALL Java_org_lwjgl_stb_STBTruetype_nstbtt_1GetFontVMetrics__J_3I_3I_3I(JNIEnv *__env, jclass clazz, jlong infoAddress, jintArray ascentAddress, jintArray descentAddress, jintArray lineGapAddress) {
    stbtt_fontinfo const *info = (stbtt_fontinfo const *)(intptr_t)infoAddress;
    jint *ascent = ascentAddress == NULL ? NULL : (*__env)->GetPrimitiveArrayCritical(__env, ascentAddress, 0);
    jint *descent = descentAddress == NULL ? NULL : (*__env)->GetPrimitiveArrayCritical(__env, descentAddress, 0);
    jint *lineGap = lineGapAddress == NULL ? NULL : (*__env)->GetPrimitiveArrayCritical(__env, lineGapAddress, 0);
    UNUSED_PARAMS(__env, clazz)
    stbtt_GetFontVMetrics(info, (int *)ascent, (int *)descent, (int *)lineGap);
    if (lineGap != NULL) { (*__env)->ReleasePrimitiveArrayCritical(__env, lineGapAddress, lineGap, 0); }
    if (descent != NULL) { (*__env)->ReleasePrimitiveArrayCritical(__env, descentAddress, descent, 0); }
    if (ascent != NULL) { (*__env)->ReleasePrimitiveArrayCritical(__env, ascentAddress, ascent, 0); }
}
JNIEXPORT void JNICALL JavaCritical_org_lwjgl_stb_STBTruetype_nstbtt_1GetFontVMetrics__J_3I_3I_3I(jlong infoAddress, jint ascent__length, jint* ascent, jint descent__length, jint* descent, jint lineGap__length, jint* lineGap) {
    stbtt_fontinfo const *info = (stbtt_fontinfo const *)(intptr_t)infoAddress;
    UNUSED_PARAM(ascent__length)
    UNUSED_PARAM(descent__length)
    UNUSED_PARAM(lineGap__length)
    stbtt_GetFontVMetrics(info, (int *)ascent, (int *)descent, (int *)lineGap);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_stb_STBTruetype_nstbtt_1GetFontVMetricsOS2__J_3I_3I_3I(JNIEnv *__env, jclass clazz, jlong infoAddress, jintArray typoAscentAddress, jintArray typoDescentAddress, jintArray typoLineGapAddress) {
    stbtt_fontinfo const *info = (stbtt_fontinfo const *)(intptr_t)infoAddress;
    jint __result;
    jint *typoAscent = typoAscentAddress == NULL ? NULL : (*__env)->GetPrimitiveArrayCritical(__env, typoAscentAddress, 0);
    jint *typoDescent = typoDescentAddress == NULL ? NULL : (*__env)->GetPrimitiveArrayCritical(__env, typoDescentAddress, 0);
    jint *typoLineGap = typoLineGapAddress == NULL ? NULL : (*__env)->GetPrimitiveArrayCritical(__env, typoLineGapAddress, 0);
    UNUSED_PARAMS(__env, clazz)
    __result = (jint)stbtt_GetFontVMetricsOS2(info, (int *)typoAscent, (int *)typoDescent, (int *)typoLineGap);
    if (typoLineGap != NULL) { (*__env)->ReleasePrimitiveArrayCritical(__env, typoLineGapAddress, typoLineGap, 0); }
    if (typoDescent != NULL) { (*__env)->ReleasePrimitiveArrayCritical(__env, typoDescentAddress, typoDescent, 0); }
    if (typoAscent != NULL) { (*__env)->ReleasePrimitiveArrayCritical(__env, typoAscentAddress, typoAscent, 0); }
    return __result;
}
JNIEXPORT jint JNICALL JavaCritical_org_lwjgl_stb_STBTruetype_nstbtt_1GetFontVMetricsOS2__J_3I_3I_3I(jlong infoAddress, jint typoAscent__length, jint* typoAscent, jint typoDescent__length, jint* typoDescent, jint typoLineGap__length, jint* typoLineGap) {
    stbtt_fontinfo const *info = (stbtt_fontinfo const *)(intptr_t)infoAddress;
    UNUSED_PARAM(typoAscent__length)
    UNUSED_PARAM(typoDescent__length)
    UNUSED_PARAM(typoLineGap__length)
    return (jint)stbtt_GetFontVMetricsOS2(info, (int *)typoAscent, (int *)typoDescent, (int *)typoLineGap);
}

JNIEXPORT void JNICALL Java_org_lwjgl_stb_STBTruetype_nstbtt_1GetFontBoundingBox__J_3I_3I_3I_3I(JNIEnv *__env, jclass clazz, jlong infoAddress, jintArray x0Address, jintArray y0Address, jintArray x1Address, jintArray y1Address) {
    stbtt_fontinfo const *info = (stbtt_fontinfo const *)(intptr_t)infoAddress;
    jint *x0 = (*__env)->GetPrimitiveArrayCritical(__env, x0Address, 0);
    jint *y0 = (*__env)->GetPrimitiveArrayCritical(__env, y0Address, 0);
    jint *x1 = (*__env)->GetPrimitiveArrayCritical(__env, x1Address, 0);
    jint *y1 = (*__env)->GetPrimitiveArrayCritical(__env, y1Address, 0);
    UNUSED_PARAMS(__env, clazz)
    stbtt_GetFontBoundingBox(info, (int *)x0, (int *)y0, (int *)x1, (int *)y1);
    (*__env)->ReleasePrimitiveArrayCritical(__env, y1Address, y1, 0);
    (*__env)->ReleasePrimitiveArrayCritical(__env, x1Address, x1, 0);
    (*__env)->ReleasePrimitiveArrayCritical(__env, y0Address, y0, 0);
    (*__env)->ReleasePrimitiveArrayCritical(__env, x0Address, x0, 0);
}
JNIEXPORT void JNICALL JavaCritical_org_lwjgl_stb_STBTruetype_nstbtt_1GetFontBoundingBox__J_3I_3I_3I_3I(jlong infoAddress, jint x0__length, jint* x0, jint y0__length, jint* y0, jint x1__length, jint* x1, jint y1__length, jint* y1) {
    stbtt_fontinfo const *info = (stbtt_fontinfo const *)(intptr_t)infoAddress;
    UNUSED_PARAM(x0__length)
    UNUSED_PARAM(y0__length)
    UNUSED_PARAM(x1__length)
    UNUSED_PARAM(y1__length)
    stbtt_GetFontBoundingBox(info, (int *)x0, (int *)y0, (int *)x1, (int *)y1);
}

JNIEXPORT void JNICALL Java_org_lwjgl_stb_STBTruetype_nstbtt_1GetCodepointHMetrics__JI_3I_3I(JNIEnv *__env, jclass clazz, jlong infoAddress, jint codepoint, jintArray advanceWidthAddress, jintArray leftSideBearingAddress) {
    stbtt_fontinfo const *info = (stbtt_fontinfo const *)(intptr_t)infoAddress;
    jint *advanceWidth = advanceWidthAddress == NULL ? NULL : (*__env)->GetPrimitiveArrayCritical(__env, advanceWidthAddress, 0);
    jint *leftSideBearing = leftSideBearingAddress == NULL ? NULL : (*__env)->GetPrimitiveArrayCritical(__env, leftSideBearingAddress, 0);
    UNUSED_PARAMS(__env, clazz)
    stbtt_GetCodepointHMetrics(info, codepoint, (int *)advanceWidth, (int *)leftSideBearing);
    if (leftSideBearing != NULL) { (*__env)->ReleasePrimitiveArrayCritical(__env, leftSideBearingAddress, leftSideBearing, 0); }
    if (advanceWidth != NULL) { (*__env)->ReleasePrimitiveArrayCritical(__env, advanceWidthAddress, advanceWidth, 0); }
}
JNIEXPORT void JNICALL JavaCritical_org_lwjgl_stb_STBTruetype_nstbtt_1GetCodepointHMetrics__JI_3I_3I(jlong infoAddress, jint codepoint, jint advanceWidth__length, jint* advanceWidth, jint leftSideBearing__length, jint* leftSideBearing) {
    stbtt_fontinfo const *info = (stbtt_fontinfo const *)(intptr_t)infoAddress;
    UNUSED_PARAM(advanceWidth__length)
    UNUSED_PARAM(leftSideBearing__length)
    stbtt_GetCodepointHMetrics(info, codepoint, (int *)advanceWidth, (int *)leftSideBearing);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_stb_STBTruetype_nstbtt_1GetCodepointBox__JI_3I_3I_3I_3I(JNIEnv *__env, jclass clazz, jlong infoAddress, jint codepoint, jintArray x0Address, jintArray y0Address, jintArray x1Address, jintArray y1Address) {
    stbtt_fontinfo const *info = (stbtt_fontinfo const *)(intptr_t)infoAddress;
    jint __result;
    jint *x0 = x0Address == NULL ? NULL : (*__env)->GetPrimitiveArrayCritical(__env, x0Address, 0);
    jint *y0 = y0Address == NULL ? NULL : (*__env)->GetPrimitiveArrayCritical(__env, y0Address, 0);
    jint *x1 = x1Address == NULL ? NULL : (*__env)->GetPrimitiveArrayCritical(__env, x1Address, 0);
    jint *y1 = y1Address == NULL ? NULL : (*__env)->GetPrimitiveArrayCritical(__env, y1Address, 0);
    UNUSED_PARAMS(__env, clazz)
    __result = (jint)stbtt_GetCodepointBox(info, codepoint, (int *)x0, (int *)y0, (int *)x1, (int *)y1);
    if (y1 != NULL) { (*__env)->ReleasePrimitiveArrayCritical(__env, y1Address, y1, 0); }
    if (x1 != NULL) { (*__env)->ReleasePrimitiveArrayCritical(__env, x1Address, x1, 0); }
    if (y0 != NULL) { (*__env)->ReleasePrimitiveArrayCritical(__env, y0Address, y0, 0); }
    if (x0 != NULL) { (*__env)->ReleasePrimitiveArrayCritical(__env, x0Address, x0, 0); }
    return __result;
}
#ifdef LWJGL_WINDOWS
JNIEXPORT jint JNICALL JavaCritical_org_lwjgl_stb_STBTruetype_nstbtt_1GetCodepointBox__JI_3I_3I_3I_3I(jlong infoAddress, jint codepoint, jint x0__length, jint* x0, jint y0__length, jint* y0, jint x1__length, jint* x1, jint y1__length, jint* y1) {
    stbtt_fontinfo const *info = (stbtt_fontinfo const *)(intptr_t)infoAddress;
    UNUSED_PARAM(x0__length)
    UNUSED_PARAM(y0__length)
    UNUSED_PARAM(x1__length)
    UNUSED_PARAM(y1__length)
    return (jint)stbtt_GetCodepointBox(info, codepoint, (int *)x0, (int *)y0, (int *)x1, (int *)y1);
}
#endif

JNIEXPORT void JNICALL Java_org_lwjgl_stb_STBTruetype_nstbtt_1GetGlyphHMetrics__JI_3I_3I(JNIEnv *__env, jclass clazz, jlong infoAddress, jint glyph_index, jintArray advanceWidthAddress, jintArray leftSideBearingAddress) {
    stbtt_fontinfo const *info = (stbtt_fontinfo const *)(intptr_t)infoAddress;
    jint *advanceWidth = advanceWidthAddress == NULL ? NULL : (*__env)->GetPrimitiveArrayCritical(__env, advanceWidthAddress, 0);
    jint *leftSideBearing = leftSideBearingAddress == NULL ? NULL : (*__env)->GetPrimitiveArrayCritical(__env, leftSideBearingAddress, 0);
    UNUSED_PARAMS(__env, clazz)
    stbtt_GetGlyphHMetrics(info, glyph_index, (int *)advanceWidth, (int *)leftSideBearing);
    if (leftSideBearing != NULL) { (*__env)->ReleasePrimitiveArrayCritical(__env, leftSideBearingAddress, leftSideBearing, 0); }
    if (advanceWidth != NULL) { (*__env)->ReleasePrimitiveArrayCritical(__env, advanceWidthAddress, advanceWidth, 0); }
}
JNIEXPORT void JNICALL JavaCritical_org_lwjgl_stb_STBTruetype_nstbtt_1GetGlyphHMetrics__JI_3I_3I(jlong infoAddress, jint glyph_index, jint advanceWidth__length, jint* advanceWidth, jint leftSideBearing__length, jint* leftSideBearing) {
    stbtt_fontinfo const *info = (stbtt_fontinfo const *)(intptr_t)infoAddress;
    UNUSED_PARAM(advanceWidth__length)
    UNUSED_PARAM(leftSideBearing__length)
    stbtt_GetGlyphHMetrics(info, glyph_index, (int *)advanceWidth, (int *)leftSideBearing);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_stb_STBTruetype_nstbtt_1GetGlyphBox__JI_3I_3I_3I_3I(JNIEnv *__env, jclass clazz, jlong infoAddress, jint glyph_index, jintArray x0Address, jintArray y0Address, jintArray x1Address, jintArray y1Address) {
    stbtt_fontinfo const *info = (stbtt_fontinfo const *)(intptr_t)infoAddress;
    jint __result;
    jint *x0 = x0Address == NULL ? NULL : (*__env)->GetPrimitiveArrayCritical(__env, x0Address, 0);
    jint *y0 = y0Address == NULL ? NULL : (*__env)->GetPrimitiveArrayCritical(__env, y0Address, 0);
    jint *x1 = x1Address == NULL ? NULL : (*__env)->GetPrimitiveArrayCritical(__env, x1Address, 0);
    jint *y1 = y1Address == NULL ? NULL : (*__env)->GetPrimitiveArrayCritical(__env, y1Address, 0);
    UNUSED_PARAMS(__env, clazz)
    __result = (jint)stbtt_GetGlyphBox(info, glyph_index, (int *)x0, (int *)y0, (int *)x1, (int *)y1);
    if (y1 != NULL) { (*__env)->ReleasePrimitiveArrayCritical(__env, y1Address, y1, 0); }
    if (x1 != NULL) { (*__env)->ReleasePrimitiveArrayCritical(__env, x1Address, x1, 0); }
    if (y0 != NULL) { (*__env)->ReleasePrimitiveArrayCritical(__env, y0Address, y0, 0); }
    if (x0 != NULL) { (*__env)->ReleasePrimitiveArrayCritical(__env, x0Address, x0, 0); }
    return __result;
}
#ifdef LWJGL_WINDOWS
JNIEXPORT jint JNICALL JavaCritical_org_lwjgl_stb_STBTruetype_nstbtt_1GetGlyphBox__JI_3I_3I_3I_3I(jlong infoAddress, jint glyph_index, jint x0__length, jint* x0, jint y0__length, jint* y0, jint x1__length, jint* x1, jint y1__length, jint* y1) {
    stbtt_fontinfo const *info = (stbtt_fontinfo const *)(intptr_t)infoAddress;
    UNUSED_PARAM(x0__length)
    UNUSED_PARAM(y0__length)
    UNUSED_PARAM(x1__length)
    UNUSED_PARAM(y1__length)
    return (jint)stbtt_GetGlyphBox(info, glyph_index, (int *)x0, (int *)y0, (int *)x1, (int *)y1);
}
#endif

JNIEXPORT jlong JNICALL Java_org_lwjgl_stb_STBTruetype_nstbtt_1GetCodepointBitmap__JFFI_3I_3I_3I_3I(JNIEnv *__env, jclass clazz, jlong infoAddress, jfloat scale_x, jfloat scale_y, jint codepoint, jintArray widthAddress, jintArray heightAddress, jintArray xoffAddress, jintArray yoffAddress) {
    stbtt_fontinfo const *info = (stbtt_fontinfo const *)(intptr_t)infoAddress;
    jlong __result;
    jint *width = (*__env)->GetPrimitiveArrayCritical(__env, widthAddress, 0);
    jint *height = (*__env)->GetPrimitiveArrayCritical(__env, heightAddress, 0);
    jint *xoff = xoffAddress == NULL ? NULL : (*__env)->GetPrimitiveArrayCritical(__env, xoffAddress, 0);
    jint *yoff = yoffAddress == NULL ? NULL : (*__env)->GetPrimitiveArrayCritical(__env, yoffAddress, 0);
    UNUSED_PARAMS(__env, clazz)
    __result = (jlong)(intptr_t)stbtt_GetCodepointBitmap(info, scale_x, scale_y, codepoint, (int *)width, (int *)height, (int *)xoff, (int *)yoff);
    if (yoff != NULL) { (*__env)->ReleasePrimitiveArrayCritical(__env, yoffAddress, yoff, 0); }
    if (xoff != NULL) { (*__env)->ReleasePrimitiveArrayCritical(__env, xoffAddress, xoff, 0); }
    (*__env)->ReleasePrimitiveArrayCritical(__env, heightAddress, height, 0);
    (*__env)->ReleasePrimitiveArrayCritical(__env, widthAddress, width, 0);
    return __result;
}
#ifdef LWJGL_WINDOWS
JNIEXPORT jlong JNICALL JavaCritical_org_lwjgl_stb_STBTruetype_nstbtt_1GetCodepointBitmap__JFFI_3I_3I_3I_3I(jlong infoAddress, jfloat scale_x, jfloat scale_y, jint codepoint, jint width__length, jint* width, jint height__length, jint* height, jint xoff__length, jint* xoff, jint yoff__length, jint* yoff) {
    stbtt_fontinfo const *info = (stbtt_fontinfo const *)(intptr_t)infoAddress;
    UNUSED_PARAM(width__length)
    UNUSED_PARAM(height__length)
    UNUSED_PARAM(xoff__length)
    UNUSED_PARAM(yoff__length)
    return (jlong)(intptr_t)stbtt_GetCodepointBitmap(info, scale_x, scale_y, codepoint, (int *)width, (int *)height, (int *)xoff, (int *)yoff);
}
#endif

JNIEXPORT jlong JNICALL Java_org_lwjgl_stb_STBTruetype_nstbtt_1GetCodepointBitmapSubpixel__JFFFFI_3I_3I_3I_3I(JNIEnv *__env, jclass clazz, jlong infoAddress, jfloat scale_x, jfloat scale_y, jfloat shift_x, jfloat shift_y, jint codepoint, jintArray widthAddress, jintArray heightAddress, jintArray xoffAddress, jintArray yoffAddress) {
    stbtt_fontinfo const *info = (stbtt_fontinfo const *)(intptr_t)infoAddress;
    jlong __result;
    jint *width = (*__env)->GetPrimitiveArrayCritical(__env, widthAddress, 0);
    jint *height = (*__env)->GetPrimitiveArrayCritical(__env, heightAddress, 0);
    jint *xoff = xoffAddress == NULL ? NULL : (*__env)->GetPrimitiveArrayCritical(__env, xoffAddress, 0);
    jint *yoff = yoffAddress == NULL ? NULL : (*__env)->GetPrimitiveArrayCritical(__env, yoffAddress, 0);
    UNUSED_PARAMS(__env, clazz)
    __result = (jlong)(intptr_t)stbtt_GetCodepointBitmapSubpixel(info, scale_x, scale_y, shift_x, shift_y, codepoint, (int *)width, (int *)height, (int *)xoff, (int *)yoff);
    if (yoff != NULL) { (*__env)->ReleasePrimitiveArrayCritical(__env, yoffAddress, yoff, 0); }
    if (xoff != NULL) { (*__env)->ReleasePrimitiveArrayCritical(__env, xoffAddress, xoff, 0); }
    (*__env)->ReleasePrimitiveArrayCritical(__env, heightAddress, height, 0);
    (*__env)->ReleasePrimitiveArrayCritical(__env, widthAddress, width, 0);
    return __result;
}
#ifdef LWJGL_WINDOWS
JNIEXPORT jlong JNICALL JavaCritical_org_lwjgl_stb_STBTruetype_nstbtt_1GetCodepointBitmapSubpixel__JFFFFI_3I_3I_3I_3I(jlong infoAddress, jfloat scale_x, jfloat scale_y, jfloat shift_x, jfloat shift_y, jint codepoint, jint width__length, jint* width, jint height__length, jint* height, jint xoff__length, jint* xoff, jint yoff__length, jint* yoff) {
    stbtt_fontinfo const *info = (stbtt_fontinfo const *)(intptr_t)infoAddress;
    UNUSED_PARAM(width__length)
    UNUSED_PARAM(height__length)
    UNUSED_PARAM(xoff__length)
    UNUSED_PARAM(yoff__length)
    return (jlong)(intptr_t)stbtt_GetCodepointBitmapSubpixel(info, scale_x, scale_y, shift_x, shift_y, codepoint, (int *)width, (int *)height, (int *)xoff, (int *)yoff);
}
#endif

JNIEXPORT void JNICALL Java_org_lwjgl_stb_STBTruetype_nstbtt_1MakeCodepointBitmapSubpixelPrefilter__JJIIIFFFFII_3F_3FI(JNIEnv *__env, jclass clazz, jlong infoAddress, jlong outputAddress, jint out_w, jint out_h, jint out_stride, jfloat scale_x, jfloat scale_y, jfloat shift_x, jfloat shift_y, jint oversample_x, jint oversample_y, jfloatArray sub_xAddress, jfloatArray sub_yAddress, jint codepoint) {
    stbtt_fontinfo const *info = (stbtt_fontinfo const *)(intptr_t)infoAddress;
    unsigned char *output = (unsigned char *)(intptr_t)outputAddress;
    jfloat *sub_x = (*__env)->GetPrimitiveArrayCritical(__env, sub_xAddress, 0);
    jfloat *sub_y = (*__env)->GetPrimitiveArrayCritical(__env, sub_yAddress, 0);
    UNUSED_PARAMS(__env, clazz)
    stbtt_MakeCodepointBitmapSubpixelPrefilter(info, output, out_w, out_h, out_stride, scale_x, scale_y, shift_x, shift_y, oversample_x, oversample_y, (float *)sub_x, (float *)sub_y, codepoint);
    (*__env)->ReleasePrimitiveArrayCritical(__env, sub_yAddress, sub_y, 0);
    (*__env)->ReleasePrimitiveArrayCritical(__env, sub_xAddress, sub_x, 0);
}
#ifdef LWJGL_WINDOWS
JNIEXPORT void JNICALL JavaCritical_org_lwjgl_stb_STBTruetype_nstbtt_1MakeCodepointBitmapSubpixelPrefilter__JJIIIFFFFII_3F_3FI(jlong infoAddress, jlong outputAddress, jint out_w, jint out_h, jint out_stride, jfloat scale_x, jfloat scale_y, jfloat shift_x, jfloat shift_y, jint oversample_x, jint oversample_y, jint sub_x__length, jfloat* sub_x, jint sub_y__length, jfloat* sub_y, jint codepoint) {
    stbtt_fontinfo const *info = (stbtt_fontinfo const *)(intptr_t)infoAddress;
    unsigned char *output = (unsigned char *)(intptr_t)outputAddress;
    UNUSED_PARAM(sub_x__length)
    UNUSED_PARAM(sub_y__length)
    stbtt_MakeCodepointBitmapSubpixelPrefilter(info, output, out_w, out_h, out_stride, scale_x, scale_y, shift_x, shift_y, oversample_x, oversample_y, (float *)sub_x, (float *)sub_y, codepoint);
}
#endif

JNIEXPORT void JNICALL Java_org_lwjgl_stb_STBTruetype_nstbtt_1GetCodepointBitmapBox__JIFF_3I_3I_3I_3I(JNIEnv *__env, jclass clazz, jlong fontAddress, jint codepoint, jfloat scale_x, jfloat scale_y, jintArray ix0Address, jintArray iy0Address, jintArray ix1Address, jintArray iy1Address) {
    stbtt_fontinfo const *font = (stbtt_fontinfo const *)(intptr_t)fontAddress;
    jint *ix0 = ix0Address == NULL ? NULL : (*__env)->GetPrimitiveArrayCritical(__env, ix0Address, 0);
    jint *iy0 = iy0Address == NULL ? NULL : (*__env)->GetPrimitiveArrayCritical(__env, iy0Address, 0);
    jint *ix1 = ix1Address == NULL ? NULL : (*__env)->GetPrimitiveArrayCritical(__env, ix1Address, 0);
    jint *iy1 = iy1Address == NULL ? NULL : (*__env)->GetPrimitiveArrayCritical(__env, iy1Address, 0);
    UNUSED_PARAMS(__env, clazz)
    stbtt_GetCodepointBitmapBox(font, codepoint, scale_x, scale_y, (int *)ix0, (int *)iy0, (int *)ix1, (int *)iy1);
    if (iy1 != NULL) { (*__env)->ReleasePrimitiveArrayCritical(__env, iy1Address, iy1, 0); }
    if (ix1 != NULL) { (*__env)->ReleasePrimitiveArrayCritical(__env, ix1Address, ix1, 0); }
    if (iy0 != NULL) { (*__env)->ReleasePrimitiveArrayCritical(__env, iy0Address, iy0, 0); }
    if (ix0 != NULL) { (*__env)->ReleasePrimitiveArrayCritical(__env, ix0Address, ix0, 0); }
}
#ifdef LWJGL_WINDOWS
JNIEXPORT void JNICALL JavaCritical_org_lwjgl_stb_STBTruetype_nstbtt_1GetCodepointBitmapBox__JIFF_3I_3I_3I_3I(jlong fontAddress, jint codepoint, jfloat scale_x, jfloat scale_y, jint ix0__length, jint* ix0, jint iy0__length, jint* iy0, jint ix1__length, jint* ix1, jint iy1__length, jint* iy1) {
    stbtt_fontinfo const *font = (stbtt_fontinfo const *)(intptr_t)fontAddress;
    UNUSED_PARAM(ix0__length)
    UNUSED_PARAM(iy0__length)
    UNUSED_PARAM(ix1__length)
    UNUSED_PARAM(iy1__length)
    stbtt_GetCodepointBitmapBox(font, codepoint, scale_x, scale_y, (int *)ix0, (int *)iy0, (int *)ix1, (int *)iy1);
}
#endif

JNIEXPORT void JNICALL Java_org_lwjgl_stb_STBTruetype_nstbtt_1GetCodepointBitmapBoxSubpixel__JIFFFF_3I_3I_3I_3I(JNIEnv *__env, jclass clazz, jlong fontAddress, jint codepoint, jfloat scale_x, jfloat scale_y, jfloat shift_x, jfloat shift_y, jintArray ix0Address, jintArray iy0Address, jintArray ix1Address, jintArray iy1Address) {
    stbtt_fontinfo const *font = (stbtt_fontinfo const *)(intptr_t)fontAddress;
    jint *ix0 = ix0Address == NULL ? NULL : (*__env)->GetPrimitiveArrayCritical(__env, ix0Address, 0);
    jint *iy0 = iy0Address == NULL ? NULL : (*__env)->GetPrimitiveArrayCritical(__env, iy0Address, 0);
    jint *ix1 = ix1Address == NULL ? NULL : (*__env)->GetPrimitiveArrayCritical(__env, ix1Address, 0);
    jint *iy1 = iy1Address == NULL ? NULL : (*__env)->GetPrimitiveArrayCritical(__env, iy1Address, 0);
    UNUSED_PARAMS(__env, clazz)
    stbtt_GetCodepointBitmapBoxSubpixel(font, codepoint, scale_x, scale_y, shift_x, shift_y, (int *)ix0, (int *)iy0, (int *)ix1, (int *)iy1);
    if (iy1 != NULL) { (*__env)->ReleasePrimitiveArrayCritical(__env, iy1Address, iy1, 0); }
    if (ix1 != NULL) { (*__env)->ReleasePrimitiveArrayCritical(__env, ix1Address, ix1, 0); }
    if (iy0 != NULL) { (*__env)->ReleasePrimitiveArrayCritical(__env, iy0Address, iy0, 0); }
    if (ix0 != NULL) { (*__env)->ReleasePrimitiveArrayCritical(__env, ix0Address, ix0, 0); }
}
#ifdef LWJGL_WINDOWS
JNIEXPORT void JNICALL JavaCritical_org_lwjgl_stb_STBTruetype_nstbtt_1GetCodepointBitmapBoxSubpixel__JIFFFF_3I_3I_3I_3I(jlong fontAddress, jint codepoint, jfloat scale_x, jfloat scale_y, jfloat shift_x, jfloat shift_y, jint ix0__length, jint* ix0, jint iy0__length, jint* iy0, jint ix1__length, jint* ix1, jint iy1__length, jint* iy1) {
    stbtt_fontinfo const *font = (stbtt_fontinfo const *)(intptr_t)fontAddress;
    UNUSED_PARAM(ix0__length)
    UNUSED_PARAM(iy0__length)
    UNUSED_PARAM(ix1__length)
    UNUSED_PARAM(iy1__length)
    stbtt_GetCodepointBitmapBoxSubpixel(font, codepoint, scale_x, scale_y, shift_x, shift_y, (int *)ix0, (int *)iy0, (int *)ix1, (int *)iy1);
}
#endif

JNIEXPORT jlong JNICALL Java_org_lwjgl_stb_STBTruetype_nstbtt_1GetGlyphBitmap__JFFI_3I_3I_3I_3I(JNIEnv *__env, jclass clazz, jlong infoAddress, jfloat scale_x, jfloat scale_y, jint glyph, jintArray widthAddress, jintArray heightAddress, jintArray xoffAddress, jintArray yoffAddress) {
    stbtt_fontinfo const *info = (stbtt_fontinfo const *)(intptr_t)infoAddress;
    jlong __result;
    jint *width = (*__env)->GetPrimitiveArrayCritical(__env, widthAddress, 0);
    jint *height = (*__env)->GetPrimitiveArrayCritical(__env, heightAddress, 0);
    jint *xoff = xoffAddress == NULL ? NULL : (*__env)->GetPrimitiveArrayCritical(__env, xoffAddress, 0);
    jint *yoff = yoffAddress == NULL ? NULL : (*__env)->GetPrimitiveArrayCritical(__env, yoffAddress, 0);
    UNUSED_PARAMS(__env, clazz)
    __result = (jlong)(intptr_t)stbtt_GetGlyphBitmap(info, scale_x, scale_y, glyph, (int *)width, (int *)height, (int *)xoff, (int *)yoff);
    if (yoff != NULL) { (*__env)->ReleasePrimitiveArrayCritical(__env, yoffAddress, yoff, 0); }
    if (xoff != NULL) { (*__env)->ReleasePrimitiveArrayCritical(__env, xoffAddress, xoff, 0); }
    (*__env)->ReleasePrimitiveArrayCritical(__env, heightAddress, height, 0);
    (*__env)->ReleasePrimitiveArrayCritical(__env, widthAddress, width, 0);
    return __result;
}
#ifdef LWJGL_WINDOWS
JNIEXPORT jlong JNICALL JavaCritical_org_lwjgl_stb_STBTruetype_nstbtt_1GetGlyphBitmap__JFFI_3I_3I_3I_3I(jlong infoAddress, jfloat scale_x, jfloat scale_y, jint glyph, jint width__length, jint* width, jint height__length, jint* height, jint xoff__length, jint* xoff, jint yoff__length, jint* yoff) {
    stbtt_fontinfo const *info = (stbtt_fontinfo const *)(intptr_t)infoAddress;
    UNUSED_PARAM(width__length)
    UNUSED_PARAM(height__length)
    UNUSED_PARAM(xoff__length)
    UNUSED_PARAM(yoff__length)
    return (jlong)(intptr_t)stbtt_GetGlyphBitmap(info, scale_x, scale_y, glyph, (int *)width, (int *)height, (int *)xoff, (int *)yoff);
}
#endif

JNIEXPORT jlong JNICALL Java_org_lwjgl_stb_STBTruetype_nstbtt_1GetGlyphBitmapSubpixel__JFFFFI_3I_3I_3I_3I(JNIEnv *__env, jclass clazz, jlong infoAddress, jfloat scale_x, jfloat scale_y, jfloat shift_x, jfloat shift_y, jint glyph, jintArray widthAddress, jintArray heightAddress, jintArray xoffAddress, jintArray yoffAddress) {
    stbtt_fontinfo const *info = (stbtt_fontinfo const *)(intptr_t)infoAddress;
    jlong __result;
    jint *width = (*__env)->GetPrimitiveArrayCritical(__env, widthAddress, 0);
    jint *height = (*__env)->GetPrimitiveArrayCritical(__env, heightAddress, 0);
    jint *xoff = xoffAddress == NULL ? NULL : (*__env)->GetPrimitiveArrayCritical(__env, xoffAddress, 0);
    jint *yoff = yoffAddress == NULL ? NULL : (*__env)->GetPrimitiveArrayCritical(__env, yoffAddress, 0);
    UNUSED_PARAMS(__env, clazz)
    __result = (jlong)(intptr_t)stbtt_GetGlyphBitmapSubpixel(info, scale_x, scale_y, shift_x, shift_y, glyph, (int *)width, (int *)height, (int *)xoff, (int *)yoff);
    if (yoff != NULL) { (*__env)->ReleasePrimitiveArrayCritical(__env, yoffAddress, yoff, 0); }
    if (xoff != NULL) { (*__env)->ReleasePrimitiveArrayCritical(__env, xoffAddress, xoff, 0); }
    (*__env)->ReleasePrimitiveArrayCritical(__env, heightAddress, height, 0);
    (*__env)->ReleasePrimitiveArrayCritical(__env, widthAddress, width, 0);
    return __result;
}
#ifdef LWJGL_WINDOWS
JNIEXPORT jlong JNICALL JavaCritical_org_lwjgl_stb_STBTruetype_nstbtt_1GetGlyphBitmapSubpixel__JFFFFI_3I_3I_3I_3I(jlong infoAddress, jfloat scale_x, jfloat scale_y, jfloat shift_x, jfloat shift_y, jint glyph, jint width__length, jint* width, jint height__length, jint* height, jint xoff__length, jint* xoff, jint yoff__length, jint* yoff) {
    stbtt_fontinfo const *info = (stbtt_fontinfo const *)(intptr_t)infoAddress;
    UNUSED_PARAM(width__length)
    UNUSED_PARAM(height__length)
    UNUSED_PARAM(xoff__length)
    UNUSED_PARAM(yoff__length)
    return (jlong)(intptr_t)stbtt_GetGlyphBitmapSubpixel(info, scale_x, scale_y, shift_x, shift_y, glyph, (int *)width, (int *)height, (int *)xoff, (int *)yoff);
}
#endif

JNIEXPORT void JNICALL Java_org_lwjgl_stb_STBTruetype_nstbtt_1MakeGlyphBitmapSubpixelPrefilter__JJIIIFFFFII_3F_3FI(JNIEnv *__env, jclass clazz, jlong infoAddress, jlong outputAddress, jint out_w, jint out_h, jint out_stride, jfloat scale_x, jfloat scale_y, jfloat shift_x, jfloat shift_y, jint oversample_x, jint oversample_y, jfloatArray sub_xAddress, jfloatArray sub_yAddress, jint glyph) {
    stbtt_fontinfo const *info = (stbtt_fontinfo const *)(intptr_t)infoAddress;
    unsigned char *output = (unsigned char *)(intptr_t)outputAddress;
    jfloat *sub_x = (*__env)->GetPrimitiveArrayCritical(__env, sub_xAddress, 0);
    jfloat *sub_y = (*__env)->GetPrimitiveArrayCritical(__env, sub_yAddress, 0);
    UNUSED_PARAMS(__env, clazz)
    stbtt_MakeGlyphBitmapSubpixelPrefilter(info, output, out_w, out_h, out_stride, scale_x, scale_y, shift_x, shift_y, oversample_x, oversample_y, (float *)sub_x, (float *)sub_y, glyph);
    (*__env)->ReleasePrimitiveArrayCritical(__env, sub_yAddress, sub_y, 0);
    (*__env)->ReleasePrimitiveArrayCritical(__env, sub_xAddress, sub_x, 0);
}
#ifdef LWJGL_WINDOWS
JNIEXPORT void JNICALL JavaCritical_org_lwjgl_stb_STBTruetype_nstbtt_1MakeGlyphBitmapSubpixelPrefilter__JJIIIFFFFII_3F_3FI(jlong infoAddress, jlong outputAddress, jint out_w, jint out_h, jint out_stride, jfloat scale_x, jfloat scale_y, jfloat shift_x, jfloat shift_y, jint oversample_x, jint oversample_y, jint sub_x__length, jfloat* sub_x, jint sub_y__length, jfloat* sub_y, jint glyph) {
    stbtt_fontinfo const *info = (stbtt_fontinfo const *)(intptr_t)infoAddress;
    unsigned char *output = (unsigned char *)(intptr_t)outputAddress;
    UNUSED_PARAM(sub_x__length)
    UNUSED_PARAM(sub_y__length)
    stbtt_MakeGlyphBitmapSubpixelPrefilter(info, output, out_w, out_h, out_stride, scale_x, scale_y, shift_x, shift_y, oversample_x, oversample_y, (float *)sub_x, (float *)sub_y, glyph);
}
#endif

JNIEXPORT void JNICALL Java_org_lwjgl_stb_STBTruetype_nstbtt_1GetGlyphBitmapBox__JIFF_3I_3I_3I_3I(JNIEnv *__env, jclass clazz, jlong fontAddress, jint glyph, jfloat scale_x, jfloat scale_y, jintArray ix0Address, jintArray iy0Address, jintArray ix1Address, jintArray iy1Address) {
    stbtt_fontinfo const *font = (stbtt_fontinfo const *)(intptr_t)fontAddress;
    jint *ix0 = ix0Address == NULL ? NULL : (*__env)->GetPrimitiveArrayCritical(__env, ix0Address, 0);
    jint *iy0 = iy0Address == NULL ? NULL : (*__env)->GetPrimitiveArrayCritical(__env, iy0Address, 0);
    jint *ix1 = ix1Address == NULL ? NULL : (*__env)->GetPrimitiveArrayCritical(__env, ix1Address, 0);
    jint *iy1 = iy1Address == NULL ? NULL : (*__env)->GetPrimitiveArrayCritical(__env, iy1Address, 0);
    UNUSED_PARAMS(__env, clazz)
    stbtt_GetGlyphBitmapBox(font, glyph, scale_x, scale_y, (int *)ix0, (int *)iy0, (int *)ix1, (int *)iy1);
    if (iy1 != NULL) { (*__env)->ReleasePrimitiveArrayCritical(__env, iy1Address, iy1, 0); }
    if (ix1 != NULL) { (*__env)->ReleasePrimitiveArrayCritical(__env, ix1Address, ix1, 0); }
    if (iy0 != NULL) { (*__env)->ReleasePrimitiveArrayCritical(__env, iy0Address, iy0, 0); }
    if (ix0 != NULL) { (*__env)->ReleasePrimitiveArrayCritical(__env, ix0Address, ix0, 0); }
}
#ifdef LWJGL_WINDOWS
JNIEXPORT void JNICALL JavaCritical_org_lwjgl_stb_STBTruetype_nstbtt_1GetGlyphBitmapBox__JIFF_3I_3I_3I_3I(jlong fontAddress, jint glyph, jfloat scale_x, jfloat scale_y, jint ix0__length, jint* ix0, jint iy0__length, jint* iy0, jint ix1__length, jint* ix1, jint iy1__length, jint* iy1) {
    stbtt_fontinfo const *font = (stbtt_fontinfo const *)(intptr_t)fontAddress;
    UNUSED_PARAM(ix0__length)
    UNUSED_PARAM(iy0__length)
    UNUSED_PARAM(ix1__length)
    UNUSED_PARAM(iy1__length)
    stbtt_GetGlyphBitmapBox(font, glyph, scale_x, scale_y, (int *)ix0, (int *)iy0, (int *)ix1, (int *)iy1);
}
#endif

JNIEXPORT void JNICALL Java_org_lwjgl_stb_STBTruetype_nstbtt_1GetGlyphBitmapBoxSubpixel__JIFFFF_3I_3I_3I_3I(JNIEnv *__env, jclass clazz, jlong fontAddress, jint glyph, jfloat scale_x, jfloat scale_y, jfloat shift_x, jfloat shift_y, jintArray ix0Address, jintArray iy0Address, jintArray ix1Address, jintArray iy1Address) {
    stbtt_fontinfo const *font = (stbtt_fontinfo const *)(intptr_t)fontAddress;
    jint *ix0 = ix0Address == NULL ? NULL : (*__env)->GetPrimitiveArrayCritical(__env, ix0Address, 0);
    jint *iy0 = iy0Address == NULL ? NULL : (*__env)->GetPrimitiveArrayCritical(__env, iy0Address, 0);
    jint *ix1 = ix1Address == NULL ? NULL : (*__env)->GetPrimitiveArrayCritical(__env, ix1Address, 0);
    jint *iy1 = iy1Address == NULL ? NULL : (*__env)->GetPrimitiveArrayCritical(__env, iy1Address, 0);
    UNUSED_PARAMS(__env, clazz)
    stbtt_GetGlyphBitmapBoxSubpixel(font, glyph, scale_x, scale_y, shift_x, shift_y, (int *)ix0, (int *)iy0, (int *)ix1, (int *)iy1);
    if (iy1 != NULL) { (*__env)->ReleasePrimitiveArrayCritical(__env, iy1Address, iy1, 0); }
    if (ix1 != NULL) { (*__env)->ReleasePrimitiveArrayCritical(__env, ix1Address, ix1, 0); }
    if (iy0 != NULL) { (*__env)->ReleasePrimitiveArrayCritical(__env, iy0Address, iy0, 0); }
    if (ix0 != NULL) { (*__env)->ReleasePrimitiveArrayCritical(__env, ix0Address, ix0, 0); }
}
#ifdef LWJGL_WINDOWS
JNIEXPORT void JNICALL JavaCritical_org_lwjgl_stb_STBTruetype_nstbtt_1GetGlyphBitmapBoxSubpixel__JIFFFF_3I_3I_3I_3I(jlong fontAddress, jint glyph, jfloat scale_x, jfloat scale_y, jfloat shift_x, jfloat shift_y, jint ix0__length, jint* ix0, jint iy0__length, jint* iy0, jint ix1__length, jint* ix1, jint iy1__length, jint* iy1) {
    stbtt_fontinfo const *font = (stbtt_fontinfo const *)(intptr_t)fontAddress;
    UNUSED_PARAM(ix0__length)
    UNUSED_PARAM(iy0__length)
    UNUSED_PARAM(ix1__length)
    UNUSED_PARAM(iy1__length)
    stbtt_GetGlyphBitmapBoxSubpixel(font, glyph, scale_x, scale_y, shift_x, shift_y, (int *)ix0, (int *)iy0, (int *)ix1, (int *)iy1);
}
#endif

JNIEXPORT jlong JNICALL Java_org_lwjgl_stb_STBTruetype_nstbtt_1GetGlyphSDF__JFIIBF_3I_3I_3I_3I(JNIEnv *__env, jclass clazz, jlong fontAddress, jfloat scale, jint glyph, jint padding, jbyte onedge_value, jfloat pixel_dist_scale, jintArray widthAddress, jintArray heightAddress, jintArray xoffAddress, jintArray yoffAddress) {
    stbtt_fontinfo const *font = (stbtt_fontinfo const *)(intptr_t)fontAddress;
    jlong __result;
    jint *width = (*__env)->GetPrimitiveArrayCritical(__env, widthAddress, 0);
    jint *height = (*__env)->GetPrimitiveArrayCritical(__env, heightAddress, 0);
    jint *xoff = (*__env)->GetPrimitiveArrayCritical(__env, xoffAddress, 0);
    jint *yoff = (*__env)->GetPrimitiveArrayCritical(__env, yoffAddress, 0);
    UNUSED_PARAMS(__env, clazz)
    __result = (jlong)(intptr_t)stbtt_GetGlyphSDF(font, scale, glyph, padding, (unsigned char)onedge_value, pixel_dist_scale, (int *)width, (int *)height, (int *)xoff, (int *)yoff);
    (*__env)->ReleasePrimitiveArrayCritical(__env, yoffAddress, yoff, 0);
    (*__env)->ReleasePrimitiveArrayCritical(__env, xoffAddress, xoff, 0);
    (*__env)->ReleasePrimitiveArrayCritical(__env, heightAddress, height, 0);
    (*__env)->ReleasePrimitiveArrayCritical(__env, widthAddress, width, 0);
    return __result;
}
#ifdef LWJGL_WINDOWS
JNIEXPORT jlong JNICALL JavaCritical_org_lwjgl_stb_STBTruetype_nstbtt_1GetGlyphSDF__JFIIBF_3I_3I_3I_3I(jlong fontAddress, jfloat scale, jint glyph, jint padding, jbyte onedge_value, jfloat pixel_dist_scale, jint width__length, jint* width, jint height__length, jint* height, jint xoff__length, jint* xoff, jint yoff__length, jint* yoff) {
    stbtt_fontinfo const *font = (stbtt_fontinfo const *)(intptr_t)fontAddress;
    UNUSED_PARAM(width__length)
    UNUSED_PARAM(height__length)
    UNUSED_PARAM(xoff__length)
    UNUSED_PARAM(yoff__length)
    return (jlong)(intptr_t)stbtt_GetGlyphSDF(font, scale, glyph, padding, (unsigned char)onedge_value, pixel_dist_scale, (int *)width, (int *)height, (int *)xoff, (int *)yoff);
}
#endif

JNIEXPORT jlong JNICALL Java_org_lwjgl_stb_STBTruetype_nstbtt_1GetCodepointSDF__JFIIBF_3I_3I_3I_3I(JNIEnv *__env, jclass clazz, jlong fontAddress, jfloat scale, jint codepoint, jint padding, jbyte onedge_value, jfloat pixel_dist_scale, jintArray widthAddress, jintArray heightAddress, jintArray xoffAddress, jintArray yoffAddress) {
    stbtt_fontinfo const *font = (stbtt_fontinfo const *)(intptr_t)fontAddress;
    jlong __result;
    jint *width = (*__env)->GetPrimitiveArrayCritical(__env, widthAddress, 0);
    jint *height = (*__env)->GetPrimitiveArrayCritical(__env, heightAddress, 0);
    jint *xoff = (*__env)->GetPrimitiveArrayCritical(__env, xoffAddress, 0);
    jint *yoff = (*__env)->GetPrimitiveArrayCritical(__env, yoffAddress, 0);
    UNUSED_PARAMS(__env, clazz)
    __result = (jlong)(intptr_t)stbtt_GetCodepointSDF(font, scale, codepoint, padding, (unsigned char)onedge_value, pixel_dist_scale, (int *)width, (int *)height, (int *)xoff, (int *)yoff);
    (*__env)->ReleasePrimitiveArrayCritical(__env, yoffAddress, yoff, 0);
    (*__env)->ReleasePrimitiveArrayCritical(__env, xoffAddress, xoff, 0);
    (*__env)->ReleasePrimitiveArrayCritical(__env, heightAddress, height, 0);
    (*__env)->ReleasePrimitiveArrayCritical(__env, widthAddress, width, 0);
    return __result;
}
#ifdef LWJGL_WINDOWS
JNIEXPORT jlong JNICALL JavaCritical_org_lwjgl_stb_STBTruetype_nstbtt_1GetCodepointSDF__JFIIBF_3I_3I_3I_3I(jlong fontAddress, jfloat scale, jint codepoint, jint padding, jbyte onedge_value, jfloat pixel_dist_scale, jint width__length, jint* width, jint height__length, jint* height, jint xoff__length, jint* xoff, jint yoff__length, jint* yoff) {
    stbtt_fontinfo const *font = (stbtt_fontinfo const *)(intptr_t)fontAddress;
    UNUSED_PARAM(width__length)
    UNUSED_PARAM(height__length)
    UNUSED_PARAM(xoff__length)
    UNUSED_PARAM(yoff__length)
    return (jlong)(intptr_t)stbtt_GetCodepointSDF(font, scale, codepoint, padding, (unsigned char)onedge_value, pixel_dist_scale, (int *)width, (int *)height, (int *)xoff, (int *)yoff);
}
#endif

EXTERN_C_EXIT
