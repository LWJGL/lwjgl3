/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
#include "common_tools.h"
#define SPNG_USE_MINIZ
        
#include "miniz.c"
#include "spng.c"

typedef struct spng_ihdr spng_ihdr;
typedef struct spng_plte_entry spng_plte_entry;
typedef struct spng_plte spng_plte;
typedef struct spng_trns spng_trns;
typedef struct spng_chrm_int spng_chrm_int;
typedef struct spng_chrm spng_chrm;
typedef struct spng_iccp spng_iccp;
typedef struct spng_sbit spng_sbit;
typedef struct spng_text spng_text;
typedef struct spng_bkgd spng_bkgd;
typedef struct spng_hist spng_hist;
typedef struct spng_phys spng_phys;
typedef struct spng_splt_entry spng_splt_entry;
typedef struct spng_splt spng_splt;
typedef struct spng_time spng_time;
typedef struct spng_offs spng_offs;
typedef struct spng_exif spng_exif;
typedef struct spng_chunk spng_chunk;
typedef struct spng_unknown_chunk spng_unknown_chunk;
typedef struct spng_alloc spng_alloc;
typedef struct spng_row_info spng_row_info;

typedef enum spng_option spng_option;

EXTERN_C_ENTER

JNIEXPORT jlong JNICALL Java_org_lwjgl_util_spng_Spng_spng_1ctx_1new(JNIEnv *__env, jclass clazz, jint flags) {
    UNUSED_PARAMS(__env, clazz)
    return (jlong)(uintptr_t)spng_ctx_new(flags);
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_util_spng_Spng_nspng_1ctx_1new2(JNIEnv *__env, jclass clazz, jlong allocAddress, jint flags) {
    spng_alloc *alloc = (spng_alloc *)(uintptr_t)allocAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jlong)(uintptr_t)spng_ctx_new2(alloc, flags);
}

JNIEXPORT void JNICALL Java_org_lwjgl_util_spng_Spng_nspng_1ctx_1free(JNIEnv *__env, jclass clazz, jlong ctxAddress) {
    spng_ctx *ctx = (spng_ctx *)(uintptr_t)ctxAddress;
    UNUSED_PARAMS(__env, clazz)
    spng_ctx_free(ctx);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_util_spng_Spng_nspng_1set_1png_1buffer(JNIEnv *__env, jclass clazz, jlong ctxAddress, jlong bufAddress, jlong size) {
    spng_ctx *ctx = (spng_ctx *)(uintptr_t)ctxAddress;
    void const *buf = (void const *)(uintptr_t)bufAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)spng_set_png_buffer(ctx, buf, (size_t)size);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_util_spng_Spng_nspng_1set_1png_1stream(JNIEnv *__env, jclass clazz, jlong ctxAddress, jlong rw_funcAddress, jlong userAddress) {
    spng_ctx *ctx = (spng_ctx *)(uintptr_t)ctxAddress;
    spng_rw_fn *rw_func = (spng_rw_fn *)(uintptr_t)rw_funcAddress;
    void *user = (void *)(uintptr_t)userAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)spng_set_png_stream(ctx, rw_func, user);
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_util_spng_Spng_nspng_1get_1png_1buffer__JJJ(JNIEnv *__env, jclass clazz, jlong ctxAddress, jlong lenAddress, jlong errorAddress) {
    spng_ctx *ctx = (spng_ctx *)(uintptr_t)ctxAddress;
    size_t *len = (size_t *)(uintptr_t)lenAddress;
    int *error = (int *)(uintptr_t)errorAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jlong)(uintptr_t)spng_get_png_buffer(ctx, len, error);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_util_spng_Spng_nspng_1set_1image_1limits(JNIEnv *__env, jclass clazz, jlong ctxAddress, jint width, jint height) {
    spng_ctx *ctx = (spng_ctx *)(uintptr_t)ctxAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)spng_set_image_limits(ctx, (uint32_t)width, (uint32_t)height);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_util_spng_Spng_nspng_1get_1image_1limits__JJJ(JNIEnv *__env, jclass clazz, jlong ctxAddress, jlong widthAddress, jlong heightAddress) {
    spng_ctx *ctx = (spng_ctx *)(uintptr_t)ctxAddress;
    uint32_t *width = (uint32_t *)(uintptr_t)widthAddress;
    uint32_t *height = (uint32_t *)(uintptr_t)heightAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)spng_get_image_limits(ctx, width, height);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_util_spng_Spng_nspng_1set_1chunk_1limits(JNIEnv *__env, jclass clazz, jlong ctxAddress, jlong chunk_size, jlong cache_size) {
    spng_ctx *ctx = (spng_ctx *)(uintptr_t)ctxAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)spng_set_chunk_limits(ctx, (size_t)chunk_size, (size_t)cache_size);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_util_spng_Spng_nspng_1get_1chunk_1limits(JNIEnv *__env, jclass clazz, jlong ctxAddress, jlong chunk_sizeAddress, jlong cache_sizeAddress) {
    spng_ctx *ctx = (spng_ctx *)(uintptr_t)ctxAddress;
    size_t *chunk_size = (size_t *)(uintptr_t)chunk_sizeAddress;
    size_t *cache_size = (size_t *)(uintptr_t)cache_sizeAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)spng_get_chunk_limits(ctx, chunk_size, cache_size);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_util_spng_Spng_nspng_1set_1crc_1action(JNIEnv *__env, jclass clazz, jlong ctxAddress, jint critical, jint ancillary) {
    spng_ctx *ctx = (spng_ctx *)(uintptr_t)ctxAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)spng_set_crc_action(ctx, critical, ancillary);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_util_spng_Spng_nspng_1set_1option(JNIEnv *__env, jclass clazz, jlong ctxAddress, jint option, jint value) {
    spng_ctx *ctx = (spng_ctx *)(uintptr_t)ctxAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)spng_set_option(ctx, (spng_option)option, value);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_util_spng_Spng_nspng_1get_1option__JIJ(JNIEnv *__env, jclass clazz, jlong ctxAddress, jint option, jlong valueAddress) {
    spng_ctx *ctx = (spng_ctx *)(uintptr_t)ctxAddress;
    int *value = (int *)(uintptr_t)valueAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)spng_get_option(ctx, (spng_option)option, value);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_util_spng_Spng_nspng_1decoded_1image_1size(JNIEnv *__env, jclass clazz, jlong ctxAddress, jint fmt, jlong lenAddress) {
    spng_ctx *ctx = (spng_ctx *)(uintptr_t)ctxAddress;
    size_t *len = (size_t *)(uintptr_t)lenAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)spng_decoded_image_size(ctx, fmt, len);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_util_spng_Spng_nspng_1decode_1image(JNIEnv *__env, jclass clazz, jlong ctxAddress, jlong outAddress, jlong len, jint fmt, jint flags) {
    spng_ctx *ctx = (spng_ctx *)(uintptr_t)ctxAddress;
    void *out = (void *)(uintptr_t)outAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)spng_decode_image(ctx, out, (size_t)len, fmt, flags);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_util_spng_Spng_nspng_1decode_1scanline(JNIEnv *__env, jclass clazz, jlong ctxAddress, jlong outAddress, jlong len) {
    spng_ctx *ctx = (spng_ctx *)(uintptr_t)ctxAddress;
    void *out = (void *)(uintptr_t)outAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)spng_decode_scanline(ctx, out, (size_t)len);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_util_spng_Spng_nspng_1decode_1row(JNIEnv *__env, jclass clazz, jlong ctxAddress, jlong outAddress, jlong len) {
    spng_ctx *ctx = (spng_ctx *)(uintptr_t)ctxAddress;
    void *out = (void *)(uintptr_t)outAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)spng_decode_row(ctx, out, (size_t)len);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_util_spng_Spng_nspng_1decode_1chunks(JNIEnv *__env, jclass clazz, jlong ctxAddress) {
    spng_ctx *ctx = (spng_ctx *)(uintptr_t)ctxAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)spng_decode_chunks(ctx);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_util_spng_Spng_nspng_1get_1row_1info(JNIEnv *__env, jclass clazz, jlong ctxAddress, jlong row_infoAddress) {
    spng_ctx *ctx = (spng_ctx *)(uintptr_t)ctxAddress;
    spng_row_info *row_info = (spng_row_info *)(uintptr_t)row_infoAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)spng_get_row_info(ctx, row_info);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_util_spng_Spng_nspng_1encode_1image(JNIEnv *__env, jclass clazz, jlong ctxAddress, jlong imgAddress, jlong len, jint fmt, jint flags) {
    spng_ctx *ctx = (spng_ctx *)(uintptr_t)ctxAddress;
    void const *img = (void const *)(uintptr_t)imgAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)spng_encode_image(ctx, img, (size_t)len, fmt, flags);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_util_spng_Spng_nspng_1encode_1scanline(JNIEnv *__env, jclass clazz, jlong ctxAddress, jlong scanlineAddress, jlong len) {
    spng_ctx *ctx = (spng_ctx *)(uintptr_t)ctxAddress;
    void const *scanline = (void const *)(uintptr_t)scanlineAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)spng_encode_scanline(ctx, scanline, (size_t)len);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_util_spng_Spng_nspng_1encode_1row(JNIEnv *__env, jclass clazz, jlong ctxAddress, jlong rowAddress, jlong len) {
    spng_ctx *ctx = (spng_ctx *)(uintptr_t)ctxAddress;
    void const *row = (void const *)(uintptr_t)rowAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)spng_encode_row(ctx, row, (size_t)len);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_util_spng_Spng_nspng_1encode_1chunks(JNIEnv *__env, jclass clazz, jlong ctxAddress) {
    spng_ctx *ctx = (spng_ctx *)(uintptr_t)ctxAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)spng_encode_chunks(ctx);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_util_spng_Spng_nspng_1get_1ihdr(JNIEnv *__env, jclass clazz, jlong ctxAddress, jlong ihdrAddress) {
    spng_ctx *ctx = (spng_ctx *)(uintptr_t)ctxAddress;
    spng_ihdr *ihdr = (spng_ihdr *)(uintptr_t)ihdrAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)spng_get_ihdr(ctx, ihdr);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_util_spng_Spng_nspng_1get_1plte(JNIEnv *__env, jclass clazz, jlong ctxAddress, jlong plteAddress) {
    spng_ctx *ctx = (spng_ctx *)(uintptr_t)ctxAddress;
    spng_plte *plte = (spng_plte *)(uintptr_t)plteAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)spng_get_plte(ctx, plte);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_util_spng_Spng_nspng_1get_1trns(JNIEnv *__env, jclass clazz, jlong ctxAddress, jlong trnsAddress) {
    spng_ctx *ctx = (spng_ctx *)(uintptr_t)ctxAddress;
    spng_trns *trns = (spng_trns *)(uintptr_t)trnsAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)spng_get_trns(ctx, trns);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_util_spng_Spng_nspng_1get_1chrm(JNIEnv *__env, jclass clazz, jlong ctxAddress, jlong chrmAddress) {
    spng_ctx *ctx = (spng_ctx *)(uintptr_t)ctxAddress;
    spng_chrm *chrm = (spng_chrm *)(uintptr_t)chrmAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)spng_get_chrm(ctx, chrm);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_util_spng_Spng_nspng_1get_1chrm_1int(JNIEnv *__env, jclass clazz, jlong ctxAddress, jlong chrm_intAddress) {
    spng_ctx *ctx = (spng_ctx *)(uintptr_t)ctxAddress;
    spng_chrm_int *chrm_int = (spng_chrm_int *)(uintptr_t)chrm_intAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)spng_get_chrm_int(ctx, chrm_int);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_util_spng_Spng_nspng_1get_1gama__JJ(JNIEnv *__env, jclass clazz, jlong ctxAddress, jlong gammaAddress) {
    spng_ctx *ctx = (spng_ctx *)(uintptr_t)ctxAddress;
    double *gamma = (double *)(uintptr_t)gammaAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)spng_get_gama(ctx, gamma);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_util_spng_Spng_nspng_1get_1gama_1int__JJ(JNIEnv *__env, jclass clazz, jlong ctxAddress, jlong gama_intAddress) {
    spng_ctx *ctx = (spng_ctx *)(uintptr_t)ctxAddress;
    uint32_t *gama_int = (uint32_t *)(uintptr_t)gama_intAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)spng_get_gama_int(ctx, gama_int);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_util_spng_Spng_nspng_1get_1iccp(JNIEnv *__env, jclass clazz, jlong ctxAddress, jlong iccpAddress) {
    spng_ctx *ctx = (spng_ctx *)(uintptr_t)ctxAddress;
    spng_iccp *iccp = (spng_iccp *)(uintptr_t)iccpAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)spng_get_iccp(ctx, iccp);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_util_spng_Spng_nspng_1get_1sbit(JNIEnv *__env, jclass clazz, jlong ctxAddress, jlong sbitAddress) {
    spng_ctx *ctx = (spng_ctx *)(uintptr_t)ctxAddress;
    spng_sbit *sbit = (spng_sbit *)(uintptr_t)sbitAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)spng_get_sbit(ctx, sbit);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_util_spng_Spng_nspng_1get_1srgb(JNIEnv *__env, jclass clazz, jlong ctxAddress, jlong rendering_intentAddress) {
    spng_ctx *ctx = (spng_ctx *)(uintptr_t)ctxAddress;
    uint8_t *rendering_intent = (uint8_t *)(uintptr_t)rendering_intentAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)spng_get_srgb(ctx, rendering_intent);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_util_spng_Spng_nspng_1get_1text__JJJ(JNIEnv *__env, jclass clazz, jlong ctxAddress, jlong textAddress, jlong n_textAddress) {
    spng_ctx *ctx = (spng_ctx *)(uintptr_t)ctxAddress;
    spng_text *text = (spng_text *)(uintptr_t)textAddress;
    uint32_t *n_text = (uint32_t *)(uintptr_t)n_textAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)spng_get_text(ctx, text, n_text);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_util_spng_Spng_nspng_1get_1bkgd(JNIEnv *__env, jclass clazz, jlong ctxAddress, jlong bkgdAddress) {
    spng_ctx *ctx = (spng_ctx *)(uintptr_t)ctxAddress;
    spng_bkgd *bkgd = (spng_bkgd *)(uintptr_t)bkgdAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)spng_get_bkgd(ctx, bkgd);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_util_spng_Spng_nspng_1get_1hist(JNIEnv *__env, jclass clazz, jlong ctxAddress, jlong histAddress) {
    spng_ctx *ctx = (spng_ctx *)(uintptr_t)ctxAddress;
    spng_hist *hist = (spng_hist *)(uintptr_t)histAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)spng_get_hist(ctx, hist);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_util_spng_Spng_nspng_1get_1phys(JNIEnv *__env, jclass clazz, jlong ctxAddress, jlong physAddress) {
    spng_ctx *ctx = (spng_ctx *)(uintptr_t)ctxAddress;
    spng_phys *phys = (spng_phys *)(uintptr_t)physAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)spng_get_phys(ctx, phys);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_util_spng_Spng_nspng_1get_1splt__JJJ(JNIEnv *__env, jclass clazz, jlong ctxAddress, jlong spltAddress, jlong n_spltAddress) {
    spng_ctx *ctx = (spng_ctx *)(uintptr_t)ctxAddress;
    spng_splt *splt = (spng_splt *)(uintptr_t)spltAddress;
    uint32_t *n_splt = (uint32_t *)(uintptr_t)n_spltAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)spng_get_splt(ctx, splt, n_splt);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_util_spng_Spng_nspng_1get_1time(JNIEnv *__env, jclass clazz, jlong ctxAddress, jlong timeAddress) {
    spng_ctx *ctx = (spng_ctx *)(uintptr_t)ctxAddress;
    spng_time *time = (spng_time *)(uintptr_t)timeAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)spng_get_time(ctx, time);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_util_spng_Spng_nspng_1get_1unknown_1chunks__JJJ(JNIEnv *__env, jclass clazz, jlong ctxAddress, jlong chunksAddress, jlong n_chunksAddress) {
    spng_ctx *ctx = (spng_ctx *)(uintptr_t)ctxAddress;
    spng_unknown_chunk *chunks = (spng_unknown_chunk *)(uintptr_t)chunksAddress;
    uint32_t *n_chunks = (uint32_t *)(uintptr_t)n_chunksAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)spng_get_unknown_chunks(ctx, chunks, n_chunks);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_util_spng_Spng_nspng_1get_1offs(JNIEnv *__env, jclass clazz, jlong ctxAddress, jlong offsAddress) {
    spng_ctx *ctx = (spng_ctx *)(uintptr_t)ctxAddress;
    spng_offs *offs = (spng_offs *)(uintptr_t)offsAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)spng_get_offs(ctx, offs);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_util_spng_Spng_nspng_1get_1exif(JNIEnv *__env, jclass clazz, jlong ctxAddress, jlong exifAddress) {
    spng_ctx *ctx = (spng_ctx *)(uintptr_t)ctxAddress;
    spng_exif *exif = (spng_exif *)(uintptr_t)exifAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)spng_get_exif(ctx, exif);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_util_spng_Spng_nspng_1set_1ihdr(JNIEnv *__env, jclass clazz, jlong ctxAddress, jlong ihdrAddress) {
    spng_ctx *ctx = (spng_ctx *)(uintptr_t)ctxAddress;
    spng_ihdr *ihdr = (spng_ihdr *)(uintptr_t)ihdrAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)spng_set_ihdr(ctx, ihdr);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_util_spng_Spng_nspng_1set_1plte(JNIEnv *__env, jclass clazz, jlong ctxAddress, jlong plteAddress) {
    spng_ctx *ctx = (spng_ctx *)(uintptr_t)ctxAddress;
    spng_plte *plte = (spng_plte *)(uintptr_t)plteAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)spng_set_plte(ctx, plte);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_util_spng_Spng_nspng_1set_1trns(JNIEnv *__env, jclass clazz, jlong ctxAddress, jlong trnsAddress) {
    spng_ctx *ctx = (spng_ctx *)(uintptr_t)ctxAddress;
    spng_trns *trns = (spng_trns *)(uintptr_t)trnsAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)spng_set_trns(ctx, trns);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_util_spng_Spng_nspng_1set_1chrm(JNIEnv *__env, jclass clazz, jlong ctxAddress, jlong chrmAddress) {
    spng_ctx *ctx = (spng_ctx *)(uintptr_t)ctxAddress;
    spng_chrm *chrm = (spng_chrm *)(uintptr_t)chrmAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)spng_set_chrm(ctx, chrm);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_util_spng_Spng_nspng_1set_1chrm_1int(JNIEnv *__env, jclass clazz, jlong ctxAddress, jlong chrm_intAddress) {
    spng_ctx *ctx = (spng_ctx *)(uintptr_t)ctxAddress;
    spng_chrm_int *chrm_int = (spng_chrm_int *)(uintptr_t)chrm_intAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)spng_set_chrm_int(ctx, chrm_int);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_util_spng_Spng_nspng_1set_1gama(JNIEnv *__env, jclass clazz, jlong ctxAddress, jdouble gamma) {
    spng_ctx *ctx = (spng_ctx *)(uintptr_t)ctxAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)spng_set_gama(ctx, gamma);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_util_spng_Spng_nspng_1set_1gama_1int(JNIEnv *__env, jclass clazz, jlong ctxAddress, jint gamma) {
    spng_ctx *ctx = (spng_ctx *)(uintptr_t)ctxAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)spng_set_gama_int(ctx, (uint32_t)gamma);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_util_spng_Spng_nspng_1set_1iccp(JNIEnv *__env, jclass clazz, jlong ctxAddress, jlong iccpAddress) {
    spng_ctx *ctx = (spng_ctx *)(uintptr_t)ctxAddress;
    spng_iccp *iccp = (spng_iccp *)(uintptr_t)iccpAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)spng_set_iccp(ctx, iccp);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_util_spng_Spng_nspng_1set_1sbit(JNIEnv *__env, jclass clazz, jlong ctxAddress, jlong sbitAddress) {
    spng_ctx *ctx = (spng_ctx *)(uintptr_t)ctxAddress;
    spng_sbit *sbit = (spng_sbit *)(uintptr_t)sbitAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)spng_set_sbit(ctx, sbit);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_util_spng_Spng_nspng_1set_1srgb(JNIEnv *__env, jclass clazz, jlong ctxAddress, jbyte rendering_intent) {
    spng_ctx *ctx = (spng_ctx *)(uintptr_t)ctxAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)spng_set_srgb(ctx, (uint8_t)rendering_intent);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_util_spng_Spng_nspng_1set_1text(JNIEnv *__env, jclass clazz, jlong ctxAddress, jlong textAddress, jint n_text) {
    spng_ctx *ctx = (spng_ctx *)(uintptr_t)ctxAddress;
    spng_text *text = (spng_text *)(uintptr_t)textAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)spng_set_text(ctx, text, (uint32_t)n_text);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_util_spng_Spng_nspng_1set_1bkgd(JNIEnv *__env, jclass clazz, jlong ctxAddress, jlong bkgdAddress) {
    spng_ctx *ctx = (spng_ctx *)(uintptr_t)ctxAddress;
    spng_bkgd *bkgd = (spng_bkgd *)(uintptr_t)bkgdAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)spng_set_bkgd(ctx, bkgd);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_util_spng_Spng_nspng_1set_1hist(JNIEnv *__env, jclass clazz, jlong ctxAddress, jlong histAddress) {
    spng_ctx *ctx = (spng_ctx *)(uintptr_t)ctxAddress;
    spng_hist *hist = (spng_hist *)(uintptr_t)histAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)spng_set_hist(ctx, hist);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_util_spng_Spng_nspng_1set_1phys(JNIEnv *__env, jclass clazz, jlong ctxAddress, jlong physAddress) {
    spng_ctx *ctx = (spng_ctx *)(uintptr_t)ctxAddress;
    spng_phys *phys = (spng_phys *)(uintptr_t)physAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)spng_set_phys(ctx, phys);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_util_spng_Spng_nspng_1set_1splt(JNIEnv *__env, jclass clazz, jlong ctxAddress, jlong spltAddress, jint n_splt) {
    spng_ctx *ctx = (spng_ctx *)(uintptr_t)ctxAddress;
    spng_splt *splt = (spng_splt *)(uintptr_t)spltAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)spng_set_splt(ctx, splt, (uint32_t)n_splt);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_util_spng_Spng_nspng_1set_1time(JNIEnv *__env, jclass clazz, jlong ctxAddress, jlong timeAddress) {
    spng_ctx *ctx = (spng_ctx *)(uintptr_t)ctxAddress;
    spng_time *time = (spng_time *)(uintptr_t)timeAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)spng_set_time(ctx, time);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_util_spng_Spng_nspng_1set_1unknown_1chunks(JNIEnv *__env, jclass clazz, jlong ctxAddress, jlong chunksAddress, jint n_chunks) {
    spng_ctx *ctx = (spng_ctx *)(uintptr_t)ctxAddress;
    spng_unknown_chunk *chunks = (spng_unknown_chunk *)(uintptr_t)chunksAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)spng_set_unknown_chunks(ctx, chunks, (uint32_t)n_chunks);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_util_spng_Spng_nspng_1set_1offs(JNIEnv *__env, jclass clazz, jlong ctxAddress, jlong offsAddress) {
    spng_ctx *ctx = (spng_ctx *)(uintptr_t)ctxAddress;
    spng_offs *offs = (spng_offs *)(uintptr_t)offsAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)spng_set_offs(ctx, offs);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_util_spng_Spng_nspng_1set_1exif(JNIEnv *__env, jclass clazz, jlong ctxAddress, jlong exifAddress) {
    spng_ctx *ctx = (spng_ctx *)(uintptr_t)ctxAddress;
    spng_exif *exif = (spng_exif *)(uintptr_t)exifAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)spng_set_exif(ctx, exif);
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_util_spng_Spng_nspng_1strerror(JNIEnv *__env, jclass clazz, jint err) {
    UNUSED_PARAMS(__env, clazz)
    return (jlong)(uintptr_t)spng_strerror(err);
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_util_spng_Spng_nspng_1version_1string(JNIEnv *__env, jclass clazz) {
    UNUSED_PARAMS(__env, clazz)
    return (jlong)(uintptr_t)spng_version_string();
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_util_spng_Spng_nspng_1get_1png_1buffer__JJ_3I(JNIEnv *__env, jclass clazz, jlong ctxAddress, jlong lenAddress, jintArray errorAddress) {
    spng_ctx *ctx = (spng_ctx *)(uintptr_t)ctxAddress;
    size_t *len = (size_t *)(uintptr_t)lenAddress;
    jlong __result;
    jint *error = (*__env)->GetIntArrayElements(__env, errorAddress, NULL);
    UNUSED_PARAMS(__env, clazz)
    __result = (jlong)(uintptr_t)spng_get_png_buffer(ctx, len, (int *)error);
    (*__env)->ReleaseIntArrayElements(__env, errorAddress, error, 0);
    return __result;
}

JNIEXPORT jint JNICALL Java_org_lwjgl_util_spng_Spng_nspng_1get_1image_1limits__J_3I_3I(JNIEnv *__env, jclass clazz, jlong ctxAddress, jintArray widthAddress, jintArray heightAddress) {
    spng_ctx *ctx = (spng_ctx *)(uintptr_t)ctxAddress;
    jint __result;
    jint *width = (*__env)->GetIntArrayElements(__env, widthAddress, NULL);
    jint *height = (*__env)->GetIntArrayElements(__env, heightAddress, NULL);
    UNUSED_PARAMS(__env, clazz)
    __result = (jint)spng_get_image_limits(ctx, (uint32_t *)width, (uint32_t *)height);
    (*__env)->ReleaseIntArrayElements(__env, heightAddress, height, 0);
    (*__env)->ReleaseIntArrayElements(__env, widthAddress, width, 0);
    return __result;
}

JNIEXPORT jint JNICALL Java_org_lwjgl_util_spng_Spng_nspng_1get_1option__JI_3I(JNIEnv *__env, jclass clazz, jlong ctxAddress, jint option, jintArray valueAddress) {
    spng_ctx *ctx = (spng_ctx *)(uintptr_t)ctxAddress;
    jint __result;
    jint *value = (*__env)->GetIntArrayElements(__env, valueAddress, NULL);
    UNUSED_PARAMS(__env, clazz)
    __result = (jint)spng_get_option(ctx, (spng_option)option, (int *)value);
    (*__env)->ReleaseIntArrayElements(__env, valueAddress, value, 0);
    return __result;
}

JNIEXPORT jint JNICALL Java_org_lwjgl_util_spng_Spng_nspng_1get_1gama__J_3D(JNIEnv *__env, jclass clazz, jlong ctxAddress, jdoubleArray gammaAddress) {
    spng_ctx *ctx = (spng_ctx *)(uintptr_t)ctxAddress;
    jint __result;
    jdouble *gamma = (*__env)->GetDoubleArrayElements(__env, gammaAddress, NULL);
    UNUSED_PARAMS(__env, clazz)
    __result = (jint)spng_get_gama(ctx, (double *)gamma);
    (*__env)->ReleaseDoubleArrayElements(__env, gammaAddress, gamma, 0);
    return __result;
}

JNIEXPORT jint JNICALL Java_org_lwjgl_util_spng_Spng_nspng_1get_1gama_1int__J_3I(JNIEnv *__env, jclass clazz, jlong ctxAddress, jintArray gama_intAddress) {
    spng_ctx *ctx = (spng_ctx *)(uintptr_t)ctxAddress;
    jint __result;
    jint *gama_int = (*__env)->GetIntArrayElements(__env, gama_intAddress, NULL);
    UNUSED_PARAMS(__env, clazz)
    __result = (jint)spng_get_gama_int(ctx, (uint32_t *)gama_int);
    (*__env)->ReleaseIntArrayElements(__env, gama_intAddress, gama_int, 0);
    return __result;
}

JNIEXPORT jint JNICALL Java_org_lwjgl_util_spng_Spng_nspng_1get_1text__JJ_3I(JNIEnv *__env, jclass clazz, jlong ctxAddress, jlong textAddress, jintArray n_textAddress) {
    spng_ctx *ctx = (spng_ctx *)(uintptr_t)ctxAddress;
    spng_text *text = (spng_text *)(uintptr_t)textAddress;
    jint __result;
    jint *n_text = (*__env)->GetIntArrayElements(__env, n_textAddress, NULL);
    UNUSED_PARAMS(__env, clazz)
    __result = (jint)spng_get_text(ctx, text, (uint32_t *)n_text);
    (*__env)->ReleaseIntArrayElements(__env, n_textAddress, n_text, 0);
    return __result;
}

JNIEXPORT jint JNICALL Java_org_lwjgl_util_spng_Spng_nspng_1get_1splt__JJ_3I(JNIEnv *__env, jclass clazz, jlong ctxAddress, jlong spltAddress, jintArray n_spltAddress) {
    spng_ctx *ctx = (spng_ctx *)(uintptr_t)ctxAddress;
    spng_splt *splt = (spng_splt *)(uintptr_t)spltAddress;
    jint __result;
    jint *n_splt = (*__env)->GetIntArrayElements(__env, n_spltAddress, NULL);
    UNUSED_PARAMS(__env, clazz)
    __result = (jint)spng_get_splt(ctx, splt, (uint32_t *)n_splt);
    (*__env)->ReleaseIntArrayElements(__env, n_spltAddress, n_splt, 0);
    return __result;
}

JNIEXPORT jint JNICALL Java_org_lwjgl_util_spng_Spng_nspng_1get_1unknown_1chunks__JJ_3I(JNIEnv *__env, jclass clazz, jlong ctxAddress, jlong chunksAddress, jintArray n_chunksAddress) {
    spng_ctx *ctx = (spng_ctx *)(uintptr_t)ctxAddress;
    spng_unknown_chunk *chunks = (spng_unknown_chunk *)(uintptr_t)chunksAddress;
    jint __result;
    jint *n_chunks = (*__env)->GetIntArrayElements(__env, n_chunksAddress, NULL);
    UNUSED_PARAMS(__env, clazz)
    __result = (jint)spng_get_unknown_chunks(ctx, chunks, (uint32_t *)n_chunks);
    (*__env)->ReleaseIntArrayElements(__env, n_chunksAddress, n_chunks, 0);
    return __result;
}

EXTERN_C_EXIT
