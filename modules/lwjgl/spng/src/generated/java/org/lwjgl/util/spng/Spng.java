/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.util.spng;

import org.jspecify.annotations.*;

import java.nio.*;

import org.lwjgl.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.MemoryStack.*;
import static org.lwjgl.system.MemoryUtil.*;

public class Spng {

    static { LibSpng.initialize(); }

    public static final int
        SPNG_IO_ERROR                 = -2,
        SPNG_IO_EOF                   = -1,
        SPNG_OK                       = 0,
        SPNG_EINVAL                   = 1,
        SPNG_EMEM                     = 2,
        SPNG_EOVERFLOW                = 3,
        SPNG_ESIGNATURE               = 4,
        SPNG_EWIDTH                   = 5,
        SPNG_EHEIGHT                  = 6,
        SPNG_EUSER_WIDTH              = 7,
        SPNG_EUSER_HEIGHT             = 8,
        SPNG_EBIT_DEPTH               = 9,
        SPNG_ECOLOR_TYPE              = 10,
        SPNG_ECOMPRESSION_METHOD      = 11,
        SPNG_EFILTER_METHOD           = 12,
        SPNG_EINTERLACE_METHOD        = 13,
        SPNG_EIHDR_SIZE               = 14,
        SPNG_ENOIHDR                  = 15,
        SPNG_ECHUNK_POS               = 16,
        SPNG_ECHUNK_SIZE              = 17,
        SPNG_ECHUNK_CRC               = 18,
        SPNG_ECHUNK_TYPE              = 19,
        SPNG_ECHUNK_UNKNOWN_CRITICAL  = 20,
        SPNG_EDUP_PLTE                = 21,
        SPNG_EDUP_CHRM                = 22,
        SPNG_EDUP_GAMA                = 23,
        SPNG_EDUP_ICCP                = 24,
        SPNG_EDUP_SBIT                = 25,
        SPNG_EDUP_SRGB                = 26,
        SPNG_EDUP_BKGD                = 27,
        SPNG_EDUP_HIST                = 28,
        SPNG_EDUP_TRNS                = 29,
        SPNG_EDUP_PHYS                = 30,
        SPNG_EDUP_TIME                = 31,
        SPNG_EDUP_OFFS                = 32,
        SPNG_EDUP_EXIF                = 33,
        SPNG_ECHRM                    = 34,
        SPNG_EPLTE_IDX                = 35,
        SPNG_ETRNS_COLOR_TYPE         = 36,
        SPNG_ETRNS_NO_PLTE            = 37,
        SPNG_EGAMA                    = 38,
        SPNG_EICCP_NAME               = 39,
        SPNG_EICCP_COMPRESSION_METHOD = 40,
        SPNG_ESBIT                    = 41,
        SPNG_ESRGB                    = 42,
        SPNG_ETEXT                    = 43,
        SPNG_ETEXT_KEYWORD            = 44,
        SPNG_EZTXT                    = 45,
        SPNG_EZTXT_COMPRESSION_METHOD = 46,
        SPNG_EITXT                    = 47,
        SPNG_EITXT_COMPRESSION_FLAG   = 48,
        SPNG_EITXT_COMPRESSION_METHOD = 49,
        SPNG_EITXT_LANG_TAG           = 50,
        SPNG_EITXT_TRANSLATED_KEY     = 51,
        SPNG_EBKGD_NO_PLTE            = 52,
        SPNG_EBKGD_PLTE_IDX           = 53,
        SPNG_EHIST_NO_PLTE            = 54,
        SPNG_EPHYS                    = 55,
        SPNG_ESPLT_NAME               = 56,
        SPNG_ESPLT_DUP_NAME           = 57,
        SPNG_ESPLT_DEPTH              = 58,
        SPNG_ETIME                    = 59,
        SPNG_EOFFS                    = 60,
        SPNG_EEXIF                    = 61,
        SPNG_EIDAT_TOO_SHORT          = 62,
        SPNG_EIDAT_STREAM             = 63,
        SPNG_EZLIB                    = 64,
        SPNG_EFILTER                  = 65,
        SPNG_EBUFSIZ                  = 66,
        SPNG_EIO                      = 67,
        SPNG_EOF                      = 68,
        SPNG_EBUF_SET                 = 69,
        SPNG_EBADSTATE                = 70,
        SPNG_EFMT                     = 71,
        SPNG_EFLAGS                   = 72,
        SPNG_ECHUNKAVAIL              = 73,
        SPNG_ENCODE_ONLY              = 74,
        SPNG_EOI                      = 75,
        SPNG_ENOPLTE                  = 76,
        SPNG_ECHUNK_LIMITS            = 77,
        SPNG_EZLIB_INIT               = 78,
        SPNG_ECHUNK_STDLEN            = 79,
        SPNG_EINTERNAL                = 80,
        SPNG_ECTXTYPE                 = 81,
        SPNG_ENOSRC                   = 82,
        SPNG_ENODST                   = 83,
        SPNG_EOPSTATE                 = 84,
        SPNG_ENOTFINAL                = 85;

    public static final int
        SPNG_TEXT = 1,
        SPNG_ZTXT = 2,
        SPNG_ITXT = 3;

    public static final byte
        SPNG_COLOR_TYPE_GRAYSCALE       = 0,
        SPNG_COLOR_TYPE_TRUECOLOR       = 2,
        SPNG_COLOR_TYPE_INDEXED         = 3,
        SPNG_COLOR_TYPE_GRAYSCALE_ALPHA = 4,
        SPNG_COLOR_TYPE_TRUECOLOR_ALPHA = 6;

    public static final byte
        SPNG_FILTER_NONE    = 0,
        SPNG_FILTER_SUB     = 1,
        SPNG_FILTER_UP      = 2,
        SPNG_FILTER_AVERAGE = 3,
        SPNG_FILTER_PAETH   = 4;

    public static final int
        SPNG_DISABLE_FILTERING   = 0,
        SPNG_FILTER_CHOICE_NONE  = 8,
        SPNG_FILTER_CHOICE_SUB   = 16,
        SPNG_FILTER_CHOICE_UP    = 32,
        SPNG_FILTER_CHOICE_AVG   = 64,
        SPNG_FILTER_CHOICE_PAETH = 128,
        SPNG_FILTER_CHOICE_ALL   = (8|16|32|64|128);

    public static final byte
        SPNG_INTERLACE_NONE  = 0,
        SPNG_INTERLACE_ADAM7 = 1;

    public static final int
        SPNG_FMT_RGBA8  = 1,
        SPNG_FMT_RGBA16 = 2,
        SPNG_FMT_RGB8   = 4,
        SPNG_FMT_GA8    = 16,
        SPNG_FMT_GA16   = 32,
        SPNG_FMT_G8     = 64,
        SPNG_FMT_PNG    = 256,
        SPNG_FMT_RAW    = 512;

    public static final int
        SPNG_CTX_IGNORE_ADLER32 = 1,
        SPNG_CTX_ENCODER        = 2;

    public static final int
        SPNG_DECODE_USE_TRNS    = 1,
        SPNG_DECODE_USE_GAMA    = 2,
        SPNG_DECODE_USE_SBIT    = 8,
        SPNG_DECODE_TRNS        = 1,
        SPNG_DECODE_GAMMA       = 2,
        SPNG_DECODE_PROGRESSIVE = 256;

    public static final int
        SPNG_CRC_ERROR   = 0,
        SPNG_CRC_DISCARD = 1,
        SPNG_CRC_USE     = 2;

    public static final int
        SPNG_ENCODE_PROGRESSIVE = 1,
        SPNG_ENCODE_FINALIZE    = 2;

    public static final int
        SPNG_AFTER_IHDR = 1,
        SPNG_AFTER_PLTE = 2,
        SPNG_AFTER_IDAT = 8;

    public static final int
        SPNG_KEEP_UNKNOWN_CHUNKS       = 1,
        SPNG_IMG_COMPRESSION_LEVEL     = 2,
        SPNG_IMG_WINDOW_BITS           = 3,
        SPNG_IMG_MEM_LEVEL             = 4,
        SPNG_IMG_COMPRESSION_STRATEGY  = 5,
        SPNG_TEXT_COMPRESSION_LEVEL    = 6,
        SPNG_TEXT_WINDOW_BITS          = 7,
        SPNG_TEXT_MEM_LEVEL            = 8,
        SPNG_TEXT_COMPRESSION_STRATEGY = 9,
        SPNG_FILTER_CHOICE             = 10,
        SPNG_CHUNK_COUNT_LIMIT         = 11,
        SPNG_ENCODE_TO_BUFFER          = 12;

    protected Spng() {
        throw new UnsupportedOperationException();
    }

    // --- [ spng_ctx_new ] ---

    /** {@code spng_ctx * spng_ctx_new(int flags)} */
    @NativeType("spng_ctx *")
    public static native long spng_ctx_new(int flags);

    // --- [ spng_ctx_new2 ] ---

    /** {@code spng_ctx * spng_ctx_new2(spng_alloc * alloc, int flags)} */
    public static native long nspng_ctx_new2(long alloc, int flags);

    /** {@code spng_ctx * spng_ctx_new2(spng_alloc * alloc, int flags)} */
    @NativeType("spng_ctx *")
    public static long spng_ctx_new2(@NativeType("spng_alloc *") SpngAlloc alloc, int flags) {
        return nspng_ctx_new2(alloc.address(), flags);
    }

    // --- [ spng_ctx_free ] ---

    /** {@code void spng_ctx_free(spng_ctx * ctx)} */
    public static native void nspng_ctx_free(long ctx);

    /** {@code void spng_ctx_free(spng_ctx * ctx)} */
    public static void spng_ctx_free(@NativeType("spng_ctx *") long ctx) {
        if (CHECKS) {
            check(ctx);
        }
        nspng_ctx_free(ctx);
    }

    // --- [ spng_set_png_buffer ] ---

    /** {@code int spng_set_png_buffer(spng_ctx * ctx, void const * buf, size_t size)} */
    public static native int nspng_set_png_buffer(long ctx, long buf, long size);

    /** {@code int spng_set_png_buffer(spng_ctx * ctx, void const * buf, size_t size)} */
    public static int spng_set_png_buffer(@NativeType("spng_ctx *") long ctx, @NativeType("void const *") ByteBuffer buf) {
        if (CHECKS) {
            check(ctx);
        }
        return nspng_set_png_buffer(ctx, memAddress(buf), buf.remaining());
    }

    // --- [ spng_set_png_stream ] ---

    /** {@code int spng_set_png_stream(spng_ctx * ctx, spng_rw_fn * rw_func, void * user)} */
    public static native int nspng_set_png_stream(long ctx, long rw_func, long user);

    /** {@code int spng_set_png_stream(spng_ctx * ctx, spng_rw_fn * rw_func, void * user)} */
    public static int spng_set_png_stream(@NativeType("spng_ctx *") long ctx, @NativeType("spng_rw_fn *") PointerBuffer rw_func, @NativeType("void *") long user) {
        if (CHECKS) {
            check(ctx);
            check(rw_func, 1);
            check(user);
        }
        return nspng_set_png_stream(ctx, memAddress(rw_func), user);
    }

    // --- [ spng_get_png_buffer ] ---

    /** {@code void * spng_get_png_buffer(spng_ctx * ctx, size_t * len, int * error)} */
    public static native long nspng_get_png_buffer(long ctx, long len, long error);

    /** {@code void * spng_get_png_buffer(spng_ctx * ctx, size_t * len, int * error)} */
    @NativeType("void *")
    public static @Nullable ByteBuffer spng_get_png_buffer(@NativeType("spng_ctx *") long ctx, @NativeType("int *") IntBuffer error) {
        if (CHECKS) {
            check(ctx);
            check(error, 1);
        }
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        PointerBuffer len = stack.callocPointer(1);
        try {
            long __result = nspng_get_png_buffer(ctx, memAddress(len), memAddress(error));
            return memByteBufferSafe(__result, (int)len.get(0));
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ spng_set_image_limits ] ---

    /** {@code int spng_set_image_limits(spng_ctx * ctx, uint32_t width, uint32_t height)} */
    public static native int nspng_set_image_limits(long ctx, int width, int height);

    /** {@code int spng_set_image_limits(spng_ctx * ctx, uint32_t width, uint32_t height)} */
    public static int spng_set_image_limits(@NativeType("spng_ctx *") long ctx, @NativeType("uint32_t") int width, @NativeType("uint32_t") int height) {
        if (CHECKS) {
            check(ctx);
        }
        return nspng_set_image_limits(ctx, width, height);
    }

    // --- [ spng_get_image_limits ] ---

    /** {@code int spng_get_image_limits(spng_ctx * ctx, uint32_t * width, uint32_t * height)} */
    public static native int nspng_get_image_limits(long ctx, long width, long height);

    /** {@code int spng_get_image_limits(spng_ctx * ctx, uint32_t * width, uint32_t * height)} */
    public static int spng_get_image_limits(@NativeType("spng_ctx *") long ctx, @NativeType("uint32_t *") IntBuffer width, @NativeType("uint32_t *") IntBuffer height) {
        if (CHECKS) {
            check(ctx);
            check(width, 1);
            check(height, 1);
        }
        return nspng_get_image_limits(ctx, memAddress(width), memAddress(height));
    }

    // --- [ spng_set_chunk_limits ] ---

    /** {@code int spng_set_chunk_limits(spng_ctx * ctx, size_t chunk_size, size_t cache_size)} */
    public static native int nspng_set_chunk_limits(long ctx, long chunk_size, long cache_size);

    /** {@code int spng_set_chunk_limits(spng_ctx * ctx, size_t chunk_size, size_t cache_size)} */
    public static int spng_set_chunk_limits(@NativeType("spng_ctx *") long ctx, @NativeType("size_t") long chunk_size, @NativeType("size_t") long cache_size) {
        if (CHECKS) {
            check(ctx);
        }
        return nspng_set_chunk_limits(ctx, chunk_size, cache_size);
    }

    // --- [ spng_get_chunk_limits ] ---

    /** {@code int spng_get_chunk_limits(spng_ctx * ctx, size_t * chunk_size, size_t * cache_size)} */
    public static native int nspng_get_chunk_limits(long ctx, long chunk_size, long cache_size);

    /** {@code int spng_get_chunk_limits(spng_ctx * ctx, size_t * chunk_size, size_t * cache_size)} */
    public static int spng_get_chunk_limits(@NativeType("spng_ctx *") long ctx, @NativeType("size_t *") PointerBuffer chunk_size, @NativeType("size_t *") PointerBuffer cache_size) {
        if (CHECKS) {
            check(ctx);
            check(chunk_size, 1);
            check(cache_size, 1);
        }
        return nspng_get_chunk_limits(ctx, memAddress(chunk_size), memAddress(cache_size));
    }

    // --- [ spng_set_crc_action ] ---

    /** {@code int spng_set_crc_action(spng_ctx * ctx, int critical, int ancillary)} */
    public static native int nspng_set_crc_action(long ctx, int critical, int ancillary);

    /** {@code int spng_set_crc_action(spng_ctx * ctx, int critical, int ancillary)} */
    public static int spng_set_crc_action(@NativeType("spng_ctx *") long ctx, int critical, int ancillary) {
        if (CHECKS) {
            check(ctx);
        }
        return nspng_set_crc_action(ctx, critical, ancillary);
    }

    // --- [ spng_set_option ] ---

    /** {@code int spng_set_option(spng_ctx * ctx, spng_option option, int value)} */
    public static native int nspng_set_option(long ctx, int option, int value);

    /** {@code int spng_set_option(spng_ctx * ctx, spng_option option, int value)} */
    public static int spng_set_option(@NativeType("spng_ctx *") long ctx, @NativeType("spng_option") int option, int value) {
        if (CHECKS) {
            check(ctx);
        }
        return nspng_set_option(ctx, option, value);
    }

    // --- [ spng_get_option ] ---

    /** {@code int spng_get_option(spng_ctx * ctx, spng_option option, int * value)} */
    public static native int nspng_get_option(long ctx, int option, long value);

    /** {@code int spng_get_option(spng_ctx * ctx, spng_option option, int * value)} */
    public static int spng_get_option(@NativeType("spng_ctx *") long ctx, @NativeType("spng_option") int option, @NativeType("int *") IntBuffer value) {
        if (CHECKS) {
            check(ctx);
            check(value, 1);
        }
        return nspng_get_option(ctx, option, memAddress(value));
    }

    // --- [ spng_decoded_image_size ] ---

    /** {@code int spng_decoded_image_size(spng_ctx * ctx, int fmt, size_t * len)} */
    public static native int nspng_decoded_image_size(long ctx, int fmt, long len);

    /** {@code int spng_decoded_image_size(spng_ctx * ctx, int fmt, size_t * len)} */
    public static int spng_decoded_image_size(@NativeType("spng_ctx *") long ctx, int fmt, @NativeType("size_t *") PointerBuffer len) {
        if (CHECKS) {
            check(ctx);
            check(len, 1);
        }
        return nspng_decoded_image_size(ctx, fmt, memAddress(len));
    }

    // --- [ spng_decode_image ] ---

    /** {@code int spng_decode_image(spng_ctx * ctx, void * out, size_t len, int fmt, int flags)} */
    public static native int nspng_decode_image(long ctx, long out, long len, int fmt, int flags);

    /** {@code int spng_decode_image(spng_ctx * ctx, void * out, size_t len, int fmt, int flags)} */
    public static int spng_decode_image(@NativeType("spng_ctx *") long ctx, @NativeType("void *") ByteBuffer out, int fmt, int flags) {
        if (CHECKS) {
            check(ctx);
        }
        return nspng_decode_image(ctx, memAddress(out), out.remaining(), fmt, flags);
    }

    // --- [ spng_decode_scanline ] ---

    /** {@code int spng_decode_scanline(spng_ctx * ctx, void * out, size_t len)} */
    public static native int nspng_decode_scanline(long ctx, long out, long len);

    /** {@code int spng_decode_scanline(spng_ctx * ctx, void * out, size_t len)} */
    public static int spng_decode_scanline(@NativeType("spng_ctx *") long ctx, @NativeType("void *") ByteBuffer out) {
        if (CHECKS) {
            check(ctx);
        }
        return nspng_decode_scanline(ctx, memAddress(out), out.remaining());
    }

    // --- [ spng_decode_row ] ---

    /** {@code int spng_decode_row(spng_ctx * ctx, void * out, size_t len)} */
    public static native int nspng_decode_row(long ctx, long out, long len);

    /** {@code int spng_decode_row(spng_ctx * ctx, void * out, size_t len)} */
    public static int spng_decode_row(@NativeType("spng_ctx *") long ctx, @NativeType("void *") ByteBuffer out) {
        if (CHECKS) {
            check(ctx);
        }
        return nspng_decode_row(ctx, memAddress(out), out.remaining());
    }

    // --- [ spng_decode_chunks ] ---

    /** {@code int spng_decode_chunks(spng_ctx * ctx)} */
    public static native int nspng_decode_chunks(long ctx);

    /** {@code int spng_decode_chunks(spng_ctx * ctx)} */
    public static int spng_decode_chunks(@NativeType("spng_ctx *") long ctx) {
        if (CHECKS) {
            check(ctx);
        }
        return nspng_decode_chunks(ctx);
    }

    // --- [ spng_get_row_info ] ---

    /** {@code int spng_get_row_info(spng_ctx * ctx, spng_row_info * row_info)} */
    public static native int nspng_get_row_info(long ctx, long row_info);

    /** {@code int spng_get_row_info(spng_ctx * ctx, spng_row_info * row_info)} */
    public static int spng_get_row_info(@NativeType("spng_ctx *") long ctx, @NativeType("spng_row_info *") SpngRowInfo row_info) {
        if (CHECKS) {
            check(ctx);
        }
        return nspng_get_row_info(ctx, row_info.address());
    }

    // --- [ spng_encode_image ] ---

    /** {@code int spng_encode_image(spng_ctx * ctx, void const * img, size_t len, int fmt, int flags)} */
    public static native int nspng_encode_image(long ctx, long img, long len, int fmt, int flags);

    /** {@code int spng_encode_image(spng_ctx * ctx, void const * img, size_t len, int fmt, int flags)} */
    public static int spng_encode_image(@NativeType("spng_ctx *") long ctx, @NativeType("void const *") ByteBuffer img, int fmt, int flags) {
        if (CHECKS) {
            check(ctx);
        }
        return nspng_encode_image(ctx, memAddress(img), img.remaining(), fmt, flags);
    }

    // --- [ spng_encode_scanline ] ---

    /** {@code int spng_encode_scanline(spng_ctx * ctx, void const * scanline, size_t len)} */
    public static native int nspng_encode_scanline(long ctx, long scanline, long len);

    /** {@code int spng_encode_scanline(spng_ctx * ctx, void const * scanline, size_t len)} */
    public static int spng_encode_scanline(@NativeType("spng_ctx *") long ctx, @NativeType("void const *") ByteBuffer scanline) {
        if (CHECKS) {
            check(ctx);
        }
        return nspng_encode_scanline(ctx, memAddress(scanline), scanline.remaining());
    }

    // --- [ spng_encode_row ] ---

    /** {@code int spng_encode_row(spng_ctx * ctx, void const * row, size_t len)} */
    public static native int nspng_encode_row(long ctx, long row, long len);

    /** {@code int spng_encode_row(spng_ctx * ctx, void const * row, size_t len)} */
    public static int spng_encode_row(@NativeType("spng_ctx *") long ctx, @NativeType("void const *") ByteBuffer row) {
        if (CHECKS) {
            check(ctx);
        }
        return nspng_encode_row(ctx, memAddress(row), row.remaining());
    }

    // --- [ spng_encode_chunks ] ---

    /** {@code int spng_encode_chunks(spng_ctx * ctx)} */
    public static native int nspng_encode_chunks(long ctx);

    /** {@code int spng_encode_chunks(spng_ctx * ctx)} */
    public static int spng_encode_chunks(@NativeType("spng_ctx *") long ctx) {
        if (CHECKS) {
            check(ctx);
        }
        return nspng_encode_chunks(ctx);
    }

    // --- [ spng_get_ihdr ] ---

    /** {@code int spng_get_ihdr(spng_ctx * ctx, spng_ihdr * ihdr)} */
    public static native int nspng_get_ihdr(long ctx, long ihdr);

    /** {@code int spng_get_ihdr(spng_ctx * ctx, spng_ihdr * ihdr)} */
    public static int spng_get_ihdr(@NativeType("spng_ctx *") long ctx, @NativeType("spng_ihdr *") SpngIhdr ihdr) {
        if (CHECKS) {
            check(ctx);
        }
        return nspng_get_ihdr(ctx, ihdr.address());
    }

    // --- [ spng_get_plte ] ---

    /** {@code int spng_get_plte(spng_ctx * ctx, spng_plte * plte)} */
    public static native int nspng_get_plte(long ctx, long plte);

    /** {@code int spng_get_plte(spng_ctx * ctx, spng_plte * plte)} */
    public static int spng_get_plte(@NativeType("spng_ctx *") long ctx, @NativeType("spng_plte *") SpngPlte plte) {
        if (CHECKS) {
            check(ctx);
        }
        return nspng_get_plte(ctx, plte.address());
    }

    // --- [ spng_get_trns ] ---

    /** {@code int spng_get_trns(spng_ctx * ctx, spng_trns * trns)} */
    public static native int nspng_get_trns(long ctx, long trns);

    /** {@code int spng_get_trns(spng_ctx * ctx, spng_trns * trns)} */
    public static int spng_get_trns(@NativeType("spng_ctx *") long ctx, @NativeType("spng_trns *") SpngTrns trns) {
        if (CHECKS) {
            check(ctx);
        }
        return nspng_get_trns(ctx, trns.address());
    }

    // --- [ spng_get_chrm ] ---

    /** {@code int spng_get_chrm(spng_ctx * ctx, spng_chrm * chrm)} */
    public static native int nspng_get_chrm(long ctx, long chrm);

    /** {@code int spng_get_chrm(spng_ctx * ctx, spng_chrm * chrm)} */
    public static int spng_get_chrm(@NativeType("spng_ctx *") long ctx, @NativeType("spng_chrm *") SpngChrm chrm) {
        if (CHECKS) {
            check(ctx);
        }
        return nspng_get_chrm(ctx, chrm.address());
    }

    // --- [ spng_get_chrm_int ] ---

    /** {@code int spng_get_chrm_int(spng_ctx * ctx, spng_chrm_int * chrm_int)} */
    public static native int nspng_get_chrm_int(long ctx, long chrm_int);

    /** {@code int spng_get_chrm_int(spng_ctx * ctx, spng_chrm_int * chrm_int)} */
    public static int spng_get_chrm_int(@NativeType("spng_ctx *") long ctx, @NativeType("spng_chrm_int *") SpngChrmInt chrm_int) {
        if (CHECKS) {
            check(ctx);
        }
        return nspng_get_chrm_int(ctx, chrm_int.address());
    }

    // --- [ spng_get_gama ] ---

    /** {@code int spng_get_gama(spng_ctx * ctx, double * gamma)} */
    public static native int nspng_get_gama(long ctx, long gamma);

    /** {@code int spng_get_gama(spng_ctx * ctx, double * gamma)} */
    public static int spng_get_gama(@NativeType("spng_ctx *") long ctx, @NativeType("double *") DoubleBuffer gamma) {
        if (CHECKS) {
            check(ctx);
            check(gamma, 1);
        }
        return nspng_get_gama(ctx, memAddress(gamma));
    }

    // --- [ spng_get_gama_int ] ---

    /** {@code int spng_get_gama_int(spng_ctx * ctx, uint32_t * gama_int)} */
    public static native int nspng_get_gama_int(long ctx, long gama_int);

    /** {@code int spng_get_gama_int(spng_ctx * ctx, uint32_t * gama_int)} */
    public static int spng_get_gama_int(@NativeType("spng_ctx *") long ctx, @NativeType("uint32_t *") IntBuffer gama_int) {
        if (CHECKS) {
            check(ctx);
            check(gama_int, 1);
        }
        return nspng_get_gama_int(ctx, memAddress(gama_int));
    }

    // --- [ spng_get_iccp ] ---

    /** {@code int spng_get_iccp(spng_ctx * ctx, spng_iccp * iccp)} */
    public static native int nspng_get_iccp(long ctx, long iccp);

    /** {@code int spng_get_iccp(spng_ctx * ctx, spng_iccp * iccp)} */
    public static int spng_get_iccp(@NativeType("spng_ctx *") long ctx, @NativeType("spng_iccp *") SpngIccp iccp) {
        if (CHECKS) {
            check(ctx);
        }
        return nspng_get_iccp(ctx, iccp.address());
    }

    // --- [ spng_get_sbit ] ---

    /** {@code int spng_get_sbit(spng_ctx * ctx, spng_sbit * sbit)} */
    public static native int nspng_get_sbit(long ctx, long sbit);

    /** {@code int spng_get_sbit(spng_ctx * ctx, spng_sbit * sbit)} */
    public static int spng_get_sbit(@NativeType("spng_ctx *") long ctx, @NativeType("spng_sbit *") SpngSbit sbit) {
        if (CHECKS) {
            check(ctx);
        }
        return nspng_get_sbit(ctx, sbit.address());
    }

    // --- [ spng_get_srgb ] ---

    /** {@code int spng_get_srgb(spng_ctx * ctx, uint8_t * rendering_intent)} */
    public static native int nspng_get_srgb(long ctx, long rendering_intent);

    /** {@code int spng_get_srgb(spng_ctx * ctx, uint8_t * rendering_intent)} */
    public static int spng_get_srgb(@NativeType("spng_ctx *") long ctx, @NativeType("uint8_t *") ByteBuffer rendering_intent) {
        if (CHECKS) {
            check(ctx);
            check(rendering_intent, 1);
        }
        return nspng_get_srgb(ctx, memAddress(rendering_intent));
    }

    // --- [ spng_get_text ] ---

    /** {@code int spng_get_text(spng_ctx * ctx, spng_text * text, uint32_t * n_text)} */
    public static native int nspng_get_text(long ctx, long text, long n_text);

    /** {@code int spng_get_text(spng_ctx * ctx, spng_text * text, uint32_t * n_text)} */
    public static int spng_get_text(@NativeType("spng_ctx *") long ctx, @NativeType("spng_text *") SpngText text, @NativeType("uint32_t *") IntBuffer n_text) {
        if (CHECKS) {
            check(ctx);
            check(n_text, 1);
        }
        return nspng_get_text(ctx, text.address(), memAddress(n_text));
    }

    // --- [ spng_get_bkgd ] ---

    /** {@code int spng_get_bkgd(spng_ctx * ctx, spng_bkgd * bkgd)} */
    public static native int nspng_get_bkgd(long ctx, long bkgd);

    /** {@code int spng_get_bkgd(spng_ctx * ctx, spng_bkgd * bkgd)} */
    public static int spng_get_bkgd(@NativeType("spng_ctx *") long ctx, @NativeType("spng_bkgd *") SpngBkgd bkgd) {
        if (CHECKS) {
            check(ctx);
        }
        return nspng_get_bkgd(ctx, bkgd.address());
    }

    // --- [ spng_get_hist ] ---

    /** {@code int spng_get_hist(spng_ctx * ctx, spng_hist * hist)} */
    public static native int nspng_get_hist(long ctx, long hist);

    /** {@code int spng_get_hist(spng_ctx * ctx, spng_hist * hist)} */
    public static int spng_get_hist(@NativeType("spng_ctx *") long ctx, @NativeType("spng_hist *") SpngHist hist) {
        if (CHECKS) {
            check(ctx);
        }
        return nspng_get_hist(ctx, hist.address());
    }

    // --- [ spng_get_phys ] ---

    /** {@code int spng_get_phys(spng_ctx * ctx, spng_phys * phys)} */
    public static native int nspng_get_phys(long ctx, long phys);

    /** {@code int spng_get_phys(spng_ctx * ctx, spng_phys * phys)} */
    public static int spng_get_phys(@NativeType("spng_ctx *") long ctx, @NativeType("spng_phys *") SpngPhys phys) {
        if (CHECKS) {
            check(ctx);
        }
        return nspng_get_phys(ctx, phys.address());
    }

    // --- [ spng_get_splt ] ---

    /** {@code int spng_get_splt(spng_ctx * ctx, spng_splt * splt, uint32_t * n_splt)} */
    public static native int nspng_get_splt(long ctx, long splt, long n_splt);

    /** {@code int spng_get_splt(spng_ctx * ctx, spng_splt * splt, uint32_t * n_splt)} */
    public static int spng_get_splt(@NativeType("spng_ctx *") long ctx, @NativeType("spng_splt *") SpngSplt splt, @NativeType("uint32_t *") IntBuffer n_splt) {
        if (CHECKS) {
            check(ctx);
            check(n_splt, 1);
        }
        return nspng_get_splt(ctx, splt.address(), memAddress(n_splt));
    }

    // --- [ spng_get_time ] ---

    /** {@code int spng_get_time(spng_ctx * ctx, spng_time * time)} */
    public static native int nspng_get_time(long ctx, long time);

    /** {@code int spng_get_time(spng_ctx * ctx, spng_time * time)} */
    public static int spng_get_time(@NativeType("spng_ctx *") long ctx, @NativeType("spng_time *") SpngTime time) {
        if (CHECKS) {
            check(ctx);
        }
        return nspng_get_time(ctx, time.address());
    }

    // --- [ spng_get_unknown_chunks ] ---

    /** {@code int spng_get_unknown_chunks(spng_ctx * ctx, spng_unknown_chunk * chunks, uint32_t * n_chunks)} */
    public static native int nspng_get_unknown_chunks(long ctx, long chunks, long n_chunks);

    /** {@code int spng_get_unknown_chunks(spng_ctx * ctx, spng_unknown_chunk * chunks, uint32_t * n_chunks)} */
    public static int spng_get_unknown_chunks(@NativeType("spng_ctx *") long ctx, @NativeType("spng_unknown_chunk *") SpngUnknownChunk chunks, @NativeType("uint32_t *") IntBuffer n_chunks) {
        if (CHECKS) {
            check(ctx);
            check(n_chunks, 1);
        }
        return nspng_get_unknown_chunks(ctx, chunks.address(), memAddress(n_chunks));
    }

    // --- [ spng_get_offs ] ---

    /** {@code int spng_get_offs(spng_ctx * ctx, spng_offs * offs)} */
    public static native int nspng_get_offs(long ctx, long offs);

    /** {@code int spng_get_offs(spng_ctx * ctx, spng_offs * offs)} */
    public static int spng_get_offs(@NativeType("spng_ctx *") long ctx, @NativeType("spng_offs *") SpngOffs offs) {
        if (CHECKS) {
            check(ctx);
        }
        return nspng_get_offs(ctx, offs.address());
    }

    // --- [ spng_get_exif ] ---

    /** {@code int spng_get_exif(spng_ctx * ctx, spng_exif * exif)} */
    public static native int nspng_get_exif(long ctx, long exif);

    /** {@code int spng_get_exif(spng_ctx * ctx, spng_exif * exif)} */
    public static int spng_get_exif(@NativeType("spng_ctx *") long ctx, @NativeType("spng_exif *") SpngExif exif) {
        if (CHECKS) {
            check(ctx);
        }
        return nspng_get_exif(ctx, exif.address());
    }

    // --- [ spng_set_ihdr ] ---

    /** {@code int spng_set_ihdr(spng_ctx * ctx, spng_ihdr * ihdr)} */
    public static native int nspng_set_ihdr(long ctx, long ihdr);

    /** {@code int spng_set_ihdr(spng_ctx * ctx, spng_ihdr * ihdr)} */
    public static int spng_set_ihdr(@NativeType("spng_ctx *") long ctx, @NativeType("spng_ihdr *") SpngIhdr ihdr) {
        if (CHECKS) {
            check(ctx);
        }
        return nspng_set_ihdr(ctx, ihdr.address());
    }

    // --- [ spng_set_plte ] ---

    /** {@code int spng_set_plte(spng_ctx * ctx, spng_plte * plte)} */
    public static native int nspng_set_plte(long ctx, long plte);

    /** {@code int spng_set_plte(spng_ctx * ctx, spng_plte * plte)} */
    public static int spng_set_plte(@NativeType("spng_ctx *") long ctx, @NativeType("spng_plte *") SpngPlte plte) {
        if (CHECKS) {
            check(ctx);
        }
        return nspng_set_plte(ctx, plte.address());
    }

    // --- [ spng_set_trns ] ---

    /** {@code int spng_set_trns(spng_ctx * ctx, spng_trns * trns)} */
    public static native int nspng_set_trns(long ctx, long trns);

    /** {@code int spng_set_trns(spng_ctx * ctx, spng_trns * trns)} */
    public static int spng_set_trns(@NativeType("spng_ctx *") long ctx, @NativeType("spng_trns *") SpngTrns trns) {
        if (CHECKS) {
            check(ctx);
        }
        return nspng_set_trns(ctx, trns.address());
    }

    // --- [ spng_set_chrm ] ---

    /** {@code int spng_set_chrm(spng_ctx * ctx, spng_chrm * chrm)} */
    public static native int nspng_set_chrm(long ctx, long chrm);

    /** {@code int spng_set_chrm(spng_ctx * ctx, spng_chrm * chrm)} */
    public static int spng_set_chrm(@NativeType("spng_ctx *") long ctx, @NativeType("spng_chrm *") SpngChrm chrm) {
        if (CHECKS) {
            check(ctx);
        }
        return nspng_set_chrm(ctx, chrm.address());
    }

    // --- [ spng_set_chrm_int ] ---

    /** {@code int spng_set_chrm_int(spng_ctx * ctx, spng_chrm_int * chrm_int)} */
    public static native int nspng_set_chrm_int(long ctx, long chrm_int);

    /** {@code int spng_set_chrm_int(spng_ctx * ctx, spng_chrm_int * chrm_int)} */
    public static int spng_set_chrm_int(@NativeType("spng_ctx *") long ctx, @NativeType("spng_chrm_int *") SpngChrmInt chrm_int) {
        if (CHECKS) {
            check(ctx);
        }
        return nspng_set_chrm_int(ctx, chrm_int.address());
    }

    // --- [ spng_set_gama ] ---

    /** {@code int spng_set_gama(spng_ctx * ctx, double gamma)} */
    public static native int nspng_set_gama(long ctx, double gamma);

    /** {@code int spng_set_gama(spng_ctx * ctx, double gamma)} */
    public static int spng_set_gama(@NativeType("spng_ctx *") long ctx, double gamma) {
        if (CHECKS) {
            check(ctx);
        }
        return nspng_set_gama(ctx, gamma);
    }

    // --- [ spng_set_gama_int ] ---

    /** {@code int spng_set_gama_int(spng_ctx * ctx, uint32_t gamma)} */
    public static native int nspng_set_gama_int(long ctx, int gamma);

    /** {@code int spng_set_gama_int(spng_ctx * ctx, uint32_t gamma)} */
    public static int spng_set_gama_int(@NativeType("spng_ctx *") long ctx, @NativeType("uint32_t") int gamma) {
        if (CHECKS) {
            check(ctx);
        }
        return nspng_set_gama_int(ctx, gamma);
    }

    // --- [ spng_set_iccp ] ---

    /** {@code int spng_set_iccp(spng_ctx * ctx, spng_iccp * iccp)} */
    public static native int nspng_set_iccp(long ctx, long iccp);

    /** {@code int spng_set_iccp(spng_ctx * ctx, spng_iccp * iccp)} */
    public static int spng_set_iccp(@NativeType("spng_ctx *") long ctx, @NativeType("spng_iccp *") SpngIccp iccp) {
        if (CHECKS) {
            check(ctx);
        }
        return nspng_set_iccp(ctx, iccp.address());
    }

    // --- [ spng_set_sbit ] ---

    /** {@code int spng_set_sbit(spng_ctx * ctx, spng_sbit * sbit)} */
    public static native int nspng_set_sbit(long ctx, long sbit);

    /** {@code int spng_set_sbit(spng_ctx * ctx, spng_sbit * sbit)} */
    public static int spng_set_sbit(@NativeType("spng_ctx *") long ctx, @NativeType("spng_sbit *") SpngSbit sbit) {
        if (CHECKS) {
            check(ctx);
        }
        return nspng_set_sbit(ctx, sbit.address());
    }

    // --- [ spng_set_srgb ] ---

    /** {@code int spng_set_srgb(spng_ctx * ctx, uint8_t rendering_intent)} */
    public static native int nspng_set_srgb(long ctx, byte rendering_intent);

    /** {@code int spng_set_srgb(spng_ctx * ctx, uint8_t rendering_intent)} */
    public static int spng_set_srgb(@NativeType("spng_ctx *") long ctx, @NativeType("uint8_t") byte rendering_intent) {
        if (CHECKS) {
            check(ctx);
        }
        return nspng_set_srgb(ctx, rendering_intent);
    }

    // --- [ spng_set_text ] ---

    /** {@code int spng_set_text(spng_ctx * ctx, spng_text * text, uint32_t n_text)} */
    public static native int nspng_set_text(long ctx, long text, int n_text);

    /** {@code int spng_set_text(spng_ctx * ctx, spng_text * text, uint32_t n_text)} */
    public static int spng_set_text(@NativeType("spng_ctx *") long ctx, @NativeType("spng_text *") SpngText text, @NativeType("uint32_t") int n_text) {
        if (CHECKS) {
            check(ctx);
        }
        return nspng_set_text(ctx, text.address(), n_text);
    }

    // --- [ spng_set_bkgd ] ---

    /** {@code int spng_set_bkgd(spng_ctx * ctx, spng_bkgd * bkgd)} */
    public static native int nspng_set_bkgd(long ctx, long bkgd);

    /** {@code int spng_set_bkgd(spng_ctx * ctx, spng_bkgd * bkgd)} */
    public static int spng_set_bkgd(@NativeType("spng_ctx *") long ctx, @NativeType("spng_bkgd *") SpngBkgd bkgd) {
        if (CHECKS) {
            check(ctx);
        }
        return nspng_set_bkgd(ctx, bkgd.address());
    }

    // --- [ spng_set_hist ] ---

    /** {@code int spng_set_hist(spng_ctx * ctx, spng_hist * hist)} */
    public static native int nspng_set_hist(long ctx, long hist);

    /** {@code int spng_set_hist(spng_ctx * ctx, spng_hist * hist)} */
    public static int spng_set_hist(@NativeType("spng_ctx *") long ctx, @NativeType("spng_hist *") SpngHist hist) {
        if (CHECKS) {
            check(ctx);
        }
        return nspng_set_hist(ctx, hist.address());
    }

    // --- [ spng_set_phys ] ---

    /** {@code int spng_set_phys(spng_ctx * ctx, spng_phys * phys)} */
    public static native int nspng_set_phys(long ctx, long phys);

    /** {@code int spng_set_phys(spng_ctx * ctx, spng_phys * phys)} */
    public static int spng_set_phys(@NativeType("spng_ctx *") long ctx, @NativeType("spng_phys *") SpngPhys phys) {
        if (CHECKS) {
            check(ctx);
        }
        return nspng_set_phys(ctx, phys.address());
    }

    // --- [ spng_set_splt ] ---

    /** {@code int spng_set_splt(spng_ctx * ctx, spng_splt * splt, uint32_t n_splt)} */
    public static native int nspng_set_splt(long ctx, long splt, int n_splt);

    /** {@code int spng_set_splt(spng_ctx * ctx, spng_splt * splt, uint32_t n_splt)} */
    public static int spng_set_splt(@NativeType("spng_ctx *") long ctx, @NativeType("spng_splt *") SpngSplt splt, @NativeType("uint32_t") int n_splt) {
        if (CHECKS) {
            check(ctx);
        }
        return nspng_set_splt(ctx, splt.address(), n_splt);
    }

    // --- [ spng_set_time ] ---

    /** {@code int spng_set_time(spng_ctx * ctx, spng_time * time)} */
    public static native int nspng_set_time(long ctx, long time);

    /** {@code int spng_set_time(spng_ctx * ctx, spng_time * time)} */
    public static int spng_set_time(@NativeType("spng_ctx *") long ctx, @NativeType("spng_time *") SpngTime time) {
        if (CHECKS) {
            check(ctx);
        }
        return nspng_set_time(ctx, time.address());
    }

    // --- [ spng_set_unknown_chunks ] ---

    /** {@code int spng_set_unknown_chunks(spng_ctx * ctx, spng_unknown_chunk * chunks, uint32_t n_chunks)} */
    public static native int nspng_set_unknown_chunks(long ctx, long chunks, int n_chunks);

    /** {@code int spng_set_unknown_chunks(spng_ctx * ctx, spng_unknown_chunk * chunks, uint32_t n_chunks)} */
    public static int spng_set_unknown_chunks(@NativeType("spng_ctx *") long ctx, @NativeType("spng_unknown_chunk *") SpngUnknownChunk chunks, @NativeType("uint32_t") int n_chunks) {
        if (CHECKS) {
            check(ctx);
        }
        return nspng_set_unknown_chunks(ctx, chunks.address(), n_chunks);
    }

    // --- [ spng_set_offs ] ---

    /** {@code int spng_set_offs(spng_ctx * ctx, spng_offs * offs)} */
    public static native int nspng_set_offs(long ctx, long offs);

    /** {@code int spng_set_offs(spng_ctx * ctx, spng_offs * offs)} */
    public static int spng_set_offs(@NativeType("spng_ctx *") long ctx, @NativeType("spng_offs *") SpngOffs offs) {
        if (CHECKS) {
            check(ctx);
        }
        return nspng_set_offs(ctx, offs.address());
    }

    // --- [ spng_set_exif ] ---

    /** {@code int spng_set_exif(spng_ctx * ctx, spng_exif * exif)} */
    public static native int nspng_set_exif(long ctx, long exif);

    /** {@code int spng_set_exif(spng_ctx * ctx, spng_exif * exif)} */
    public static int spng_set_exif(@NativeType("spng_ctx *") long ctx, @NativeType("spng_exif *") SpngExif exif) {
        if (CHECKS) {
            check(ctx);
        }
        return nspng_set_exif(ctx, exif.address());
    }

    // --- [ spng_strerror ] ---

    /** {@code char const * spng_strerror(int err)} */
    public static native long nspng_strerror(int err);

    /** {@code char const * spng_strerror(int err)} */
    @NativeType("char const *")
    public static @Nullable String spng_strerror(int err) {
        long __result = nspng_strerror(err);
        return memASCIISafe(__result);
    }

    // --- [ spng_version_string ] ---

    /** {@code char const * spng_version_string(void)} */
    public static native long nspng_version_string();

    /** {@code char const * spng_version_string(void)} */
    @NativeType("char const *")
    public static @Nullable String spng_version_string() {
        long __result = nspng_version_string();
        return memASCIISafe(__result);
    }

    /** {@code void * spng_get_png_buffer(spng_ctx * ctx, size_t * len, int * error)} */
    public static native long nspng_get_png_buffer(long ctx, long len, int[] error);

    /** {@code void * spng_get_png_buffer(spng_ctx * ctx, size_t * len, int * error)} */
    @NativeType("void *")
    public static @Nullable ByteBuffer spng_get_png_buffer(@NativeType("spng_ctx *") long ctx, @NativeType("int *") int[] error) {
        if (CHECKS) {
            check(ctx);
            check(error, 1);
        }
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        PointerBuffer len = stack.callocPointer(1);
        try {
            long __result = nspng_get_png_buffer(ctx, memAddress(len), error);
            return memByteBufferSafe(__result, (int)len.get(0));
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    /** {@code int spng_get_image_limits(spng_ctx * ctx, uint32_t * width, uint32_t * height)} */
    public static native int nspng_get_image_limits(long ctx, int[] width, int[] height);

    /** {@code int spng_get_image_limits(spng_ctx * ctx, uint32_t * width, uint32_t * height)} */
    public static int spng_get_image_limits(@NativeType("spng_ctx *") long ctx, @NativeType("uint32_t *") int[] width, @NativeType("uint32_t *") int[] height) {
        if (CHECKS) {
            check(ctx);
            check(width, 1);
            check(height, 1);
        }
        return nspng_get_image_limits(ctx, width, height);
    }

    /** {@code int spng_get_option(spng_ctx * ctx, spng_option option, int * value)} */
    public static native int nspng_get_option(long ctx, int option, int[] value);

    /** {@code int spng_get_option(spng_ctx * ctx, spng_option option, int * value)} */
    public static int spng_get_option(@NativeType("spng_ctx *") long ctx, @NativeType("spng_option") int option, @NativeType("int *") int[] value) {
        if (CHECKS) {
            check(ctx);
            check(value, 1);
        }
        return nspng_get_option(ctx, option, value);
    }

    /** {@code int spng_get_gama(spng_ctx * ctx, double * gamma)} */
    public static native int nspng_get_gama(long ctx, double[] gamma);

    /** {@code int spng_get_gama(spng_ctx * ctx, double * gamma)} */
    public static int spng_get_gama(@NativeType("spng_ctx *") long ctx, @NativeType("double *") double[] gamma) {
        if (CHECKS) {
            check(ctx);
            check(gamma, 1);
        }
        return nspng_get_gama(ctx, gamma);
    }

    /** {@code int spng_get_gama_int(spng_ctx * ctx, uint32_t * gama_int)} */
    public static native int nspng_get_gama_int(long ctx, int[] gama_int);

    /** {@code int spng_get_gama_int(spng_ctx * ctx, uint32_t * gama_int)} */
    public static int spng_get_gama_int(@NativeType("spng_ctx *") long ctx, @NativeType("uint32_t *") int[] gama_int) {
        if (CHECKS) {
            check(ctx);
            check(gama_int, 1);
        }
        return nspng_get_gama_int(ctx, gama_int);
    }

    /** {@code int spng_get_text(spng_ctx * ctx, spng_text * text, uint32_t * n_text)} */
    public static native int nspng_get_text(long ctx, long text, int[] n_text);

    /** {@code int spng_get_text(spng_ctx * ctx, spng_text * text, uint32_t * n_text)} */
    public static int spng_get_text(@NativeType("spng_ctx *") long ctx, @NativeType("spng_text *") SpngText text, @NativeType("uint32_t *") int[] n_text) {
        if (CHECKS) {
            check(ctx);
            check(n_text, 1);
        }
        return nspng_get_text(ctx, text.address(), n_text);
    }

    /** {@code int spng_get_splt(spng_ctx * ctx, spng_splt * splt, uint32_t * n_splt)} */
    public static native int nspng_get_splt(long ctx, long splt, int[] n_splt);

    /** {@code int spng_get_splt(spng_ctx * ctx, spng_splt * splt, uint32_t * n_splt)} */
    public static int spng_get_splt(@NativeType("spng_ctx *") long ctx, @NativeType("spng_splt *") SpngSplt splt, @NativeType("uint32_t *") int[] n_splt) {
        if (CHECKS) {
            check(ctx);
            check(n_splt, 1);
        }
        return nspng_get_splt(ctx, splt.address(), n_splt);
    }

    /** {@code int spng_get_unknown_chunks(spng_ctx * ctx, spng_unknown_chunk * chunks, uint32_t * n_chunks)} */
    public static native int nspng_get_unknown_chunks(long ctx, long chunks, int[] n_chunks);

    /** {@code int spng_get_unknown_chunks(spng_ctx * ctx, spng_unknown_chunk * chunks, uint32_t * n_chunks)} */
    public static int spng_get_unknown_chunks(@NativeType("spng_ctx *") long ctx, @NativeType("spng_unknown_chunk *") SpngUnknownChunk chunks, @NativeType("uint32_t *") int[] n_chunks) {
        if (CHECKS) {
            check(ctx);
            check(n_chunks, 1);
        }
        return nspng_get_unknown_chunks(ctx, chunks.address(), n_chunks);
    }

}