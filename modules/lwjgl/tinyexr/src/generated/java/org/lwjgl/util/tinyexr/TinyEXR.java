/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.util.tinyexr;

import org.jspecify.annotations.*;

import java.nio.*;

import org.lwjgl.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.MemoryStack.*;
import static org.lwjgl.system.MemoryUtil.*;

public class TinyEXR {

    static { LibTinyEXR.initialize(); }

    public static final int
        TINYEXR_C_API_VERSION_MAJOR = 3,
        TINYEXR_C_API_VERSION_MINOR = 0,
        TINYEXR_C_API_VERSION_PATCH = 0,
        TINYEXR_C_API_VERSION       = ((TINYEXR_C_API_VERSION_MAJOR << 22) | (TINYEXR_C_API_VERSION_MINOR << 12) | TINYEXR_C_API_VERSION_PATCH);

    public static final int
        EXR_SUCCESS                       = 0,
        EXR_INCOMPLETE                    = 1,
        EXR_WOULD_BLOCK                   = 2,
        EXR_SUSPENDED                     = 3,
        EXR_ERROR_INVALID_HANDLE          = -1,
        EXR_ERROR_INVALID_ARGUMENT        = -2,
        EXR_ERROR_OUT_OF_MEMORY           = -3,
        EXR_ERROR_INVALID_MAGIC           = -4,
        EXR_ERROR_INVALID_VERSION         = -5,
        EXR_ERROR_INVALID_DATA            = -6,
        EXR_ERROR_UNSUPPORTED_FORMAT      = -7,
        EXR_ERROR_UNSUPPORTED_COMPRESSION = -8,
        EXR_ERROR_DECOMPRESSION_FAILED    = -9,
        EXR_ERROR_COMPRESSION_FAILED      = -10,
        EXR_ERROR_IO                      = -11,
        EXR_ERROR_BUFFER_TOO_SMALL        = -12,
        EXR_ERROR_TIMEOUT                 = -13,
        EXR_ERROR_CANCELLED               = -14,
        EXR_ERROR_NOT_READY               = -15,
        EXR_ERROR_MISSING_ATTRIBUTE       = -16,
        EXR_ERROR_FETCH_FAILED            = -17,
        EXR_ERROR_OUT_OF_BOUNDS           = -18,
        EXR_ERROR_ALREADY_INITIALIZED     = -19,
        EXR_ERROR_NOT_INITIALIZED         = -20,
        EXR_ERROR_INVALID_STATE           = -21;

    public static final long EXR_NULL_HANDLE = 0L;

    public static final int
        EXR_PIXEL_UINT  = 0,
        EXR_PIXEL_HALF  = 1,
        EXR_PIXEL_FLOAT = 2;

    public static final int
        EXR_COMPRESSION_NONE  = 0,
        EXR_COMPRESSION_RLE   = 1,
        EXR_COMPRESSION_ZIPS  = 2,
        EXR_COMPRESSION_ZIP   = 3,
        EXR_COMPRESSION_PIZ   = 4,
        EXR_COMPRESSION_PXR24 = 5,
        EXR_COMPRESSION_B44   = 6,
        EXR_COMPRESSION_B44A  = 7,
        EXR_COMPRESSION_DWAA  = 8,
        EXR_COMPRESSION_DWAB  = 9;

    public static final int
        EXR_LINE_ORDER_INCREASING_Y = 0,
        EXR_LINE_ORDER_DECREASING_Y = 1,
        EXR_LINE_ORDER_RANDOM_Y     = 2;

    public static final int
        EXR_TILE_ONE_LEVEL     = 0,
        EXR_TILE_MIPMAP_LEVELS = 1,
        EXR_TILE_RIPMAP_LEVELS = 2;

    public static final int
        EXR_TILE_ROUND_DOWN = 0,
        EXR_TILE_ROUND_UP   = 1;

    public static final int
        EXR_PART_SCANLINE      = 0,
        EXR_PART_TILED         = 1,
        EXR_PART_DEEP_SCANLINE = 2,
        EXR_PART_DEEP_TILED    = 3;

    public static final int
        EXR_LAYOUT_PLANAR      = 0,
        EXR_LAYOUT_INTERLEAVED = 1,
        EXR_LAYOUT_NATIVE      = 2;

    public static final int
        EXR_DATA_SOURCE_SEEKABLE   = 0x0001,
        EXR_DATA_SOURCE_ASYNC      = 0x0002,
        EXR_DATA_SOURCE_STREAMING  = 0x0004,
        EXR_DATA_SOURCE_SIZE_KNOWN = 0x0008;

    public static final int
        EXR_CONTEXT_ENABLE_VALIDATION = 0x0001,
        EXR_CONTEXT_ENABLE_DEBUG_INFO = 0x0002,
        EXR_CONTEXT_SINGLE_THREADED   = 0x0004,
        EXR_CONTEXT_SIMD_DISABLED     = 0x0008;

    public static final int
        EXR_MEMORY_POOL_THREAD_LOCAL = 0x0001,
        EXR_MEMORY_POOL_PERSISTENT   = 0x0002;

    public static final int
        EXR_DECODER_LAZY_LOAD       = 0x0001,
        EXR_DECODER_VALIDATE_CHUNKS = 0x0002,
        EXR_DECODER_ALLOW_TRUNCATED = 0x0004;

    public static final int
        EXR_IMAGE_TILED      = 0x0001,
        EXR_IMAGE_MULTIPART  = 0x0002,
        EXR_IMAGE_DEEP       = 0x0004,
        EXR_IMAGE_LONG_NAMES = 0x0008;

    public static final int
        EXR_ATTR_UNKNOWN        = 0,
        EXR_ATTR_INT            = 1,
        EXR_ATTR_FLOAT          = 2,
        EXR_ATTR_DOUBLE         = 3,
        EXR_ATTR_STRING         = 4,
        EXR_ATTR_BOX2I          = 5,
        EXR_ATTR_BOX2F          = 6,
        EXR_ATTR_V2I            = 7,
        EXR_ATTR_V2F            = 8,
        EXR_ATTR_V3I            = 9,
        EXR_ATTR_V3F            = 10,
        EXR_ATTR_M33F           = 11,
        EXR_ATTR_M44F           = 12,
        EXR_ATTR_CHLIST         = 13,
        EXR_ATTR_COMPRESSION    = 14,
        EXR_ATTR_LINEORDER      = 15,
        EXR_ATTR_TILEDESC       = 16,
        EXR_ATTR_PREVIEW        = 17,
        EXR_ATTR_RATIONAL       = 18,
        EXR_ATTR_KEYCODE        = 19,
        EXR_ATTR_TIMECODE       = 20,
        EXR_ATTR_CHROMATICITIES = 21,
        EXR_ATTR_ENVMAP         = 22,
        EXR_ATTR_DEEPIMAGETYPE  = 23,
        EXR_ATTR_OPAQUE         = 24;

    public static final int
        EXR_CMD_ONE_TIME_SUBMIT  = 0x0001,
        EXR_CMD_SIMULTANEOUS_USE = 0x0002;

    public static final int EXR_FENCE_SIGNALED = 0x0001;

    public static final int EXR_ENCODER_PARALLEL = 0x0001;

    public static final int
        EXR_WRITE_TILED     = 0x0001,
        EXR_WRITE_MULTIPART = 0x0002,
        EXR_WRITE_MIPMAP    = 0x0004,
        EXR_WRITE_RIPMAP    = 0x0008,
        EXR_WRITE_DEEP      = 0x0010;

    public static final int
        EXR_SIMD_NONE   = 0,
        EXR_SIMD_SSE2   = 0x0001,
        EXR_SIMD_SSE4_1 = 0x0002,
        EXR_SIMD_AVX    = 0x0004,
        EXR_SIMD_AVX2   = 0x0008,
        EXR_SIMD_AVX512 = 0x0010,
        EXR_SIMD_NEON   = 0x0020,
        EXR_SIMD_BMI1   = 0x0040,
        EXR_SIMD_BMI2   = 0x0080;

    protected TinyEXR() {
        throw new UnsupportedOperationException();
    }

    // --- [ exr_get_default_allocator ] ---

    /** {@code ExrAllocator const * exr_get_default_allocator(void)} */
    public static native long nexr_get_default_allocator();

    /** {@code ExrAllocator const * exr_get_default_allocator(void)} */
    @NativeType("ExrAllocator const *")
    public static @Nullable ExrAllocator exr_get_default_allocator() {
        long __result = nexr_get_default_allocator();
        return ExrAllocator.createSafe(__result);
    }

    // --- [ exr_data_source_from_memory ] ---

    /** {@code ExrResult exr_data_source_from_memory(void const * data, size_t size, ExrDataSource * out_source)} */
    public static native int nexr_data_source_from_memory(long data, long size, long out_source);

    /** {@code ExrResult exr_data_source_from_memory(void const * data, size_t size, ExrDataSource * out_source)} */
    @NativeType("ExrResult")
    public static int exr_data_source_from_memory(@NativeType("void const *") ByteBuffer data, @NativeType("ExrDataSource *") ExrDataSource out_source) {
        return nexr_data_source_from_memory(memAddress(data), data.remaining(), out_source.address());
    }

    // --- [ exr_data_sink_to_memory ] ---

    /** {@code ExrResult exr_data_sink_to_memory(ExrContext ctx, ExrDataSink * out_sink, void ** out_data, size_t * out_size)} */
    public static native int nexr_data_sink_to_memory(long ctx, long out_sink, long out_data, long out_size);

    /** {@code ExrResult exr_data_sink_to_memory(ExrContext ctx, ExrDataSink * out_sink, void ** out_data, size_t * out_size)} */
    @NativeType("ExrResult")
    public static int exr_data_sink_to_memory(@NativeType("ExrContext") long ctx, @NativeType("ExrDataSink *") ExrDataSink out_sink, @NativeType("void **") PointerBuffer out_data, @NativeType("size_t *") PointerBuffer out_size) {
        if (CHECKS) {
            check(ctx);
            check(out_data, 1);
            check(out_size, 1);
        }
        return nexr_data_sink_to_memory(ctx, out_sink.address(), memAddress(out_data), memAddress(out_size));
    }

    // --- [ exr_get_last_error ] ---

    /** {@code ExrResult exr_get_last_error(ExrContext ctx, ExrErrorInfo * out_info)} */
    public static native int nexr_get_last_error(long ctx, long out_info);

    /** {@code ExrResult exr_get_last_error(ExrContext ctx, ExrErrorInfo * out_info)} */
    @NativeType("ExrResult")
    public static int exr_get_last_error(@NativeType("ExrContext") long ctx, @NativeType("ExrErrorInfo *") ExrErrorInfo out_info) {
        if (CHECKS) {
            check(ctx);
        }
        return nexr_get_last_error(ctx, out_info.address());
    }

    // --- [ exr_get_error_count ] ---

    /** {@code uint32_t exr_get_error_count(ExrContext ctx)} */
    public static native int nexr_get_error_count(long ctx);

    /** {@code uint32_t exr_get_error_count(ExrContext ctx)} */
    @NativeType("uint32_t")
    public static int exr_get_error_count(@NativeType("ExrContext") long ctx) {
        if (CHECKS) {
            check(ctx);
        }
        return nexr_get_error_count(ctx);
    }

    // --- [ exr_get_error_at ] ---

    /** {@code ExrResult exr_get_error_at(ExrContext ctx, uint32_t index, ExrErrorInfo * out_info)} */
    public static native int nexr_get_error_at(long ctx, int index, long out_info);

    /** {@code ExrResult exr_get_error_at(ExrContext ctx, uint32_t index, ExrErrorInfo * out_info)} */
    @NativeType("ExrResult")
    public static int exr_get_error_at(@NativeType("ExrContext") long ctx, @NativeType("uint32_t") int index, @NativeType("ExrErrorInfo *") ExrErrorInfo out_info) {
        if (CHECKS) {
            check(ctx);
        }
        return nexr_get_error_at(ctx, index, out_info.address());
    }

    // --- [ exr_clear_errors ] ---

    /** {@code void exr_clear_errors(ExrContext ctx)} */
    public static native void nexr_clear_errors(long ctx);

    /** {@code void exr_clear_errors(ExrContext ctx)} */
    public static void exr_clear_errors(@NativeType("ExrContext") long ctx) {
        if (CHECKS) {
            check(ctx);
        }
        nexr_clear_errors(ctx);
    }

    // --- [ exr_result_to_string ] ---

    /** {@code char const * exr_result_to_string(ExrResult result)} */
    public static native long nexr_result_to_string(int result);

    /** {@code char const * exr_result_to_string(ExrResult result)} */
    @NativeType("char const *")
    public static @Nullable String exr_result_to_string(@NativeType("ExrResult") int result) {
        long __result = nexr_result_to_string(result);
        return memASCIISafe(__result);
    }

    // --- [ exr_context_create ] ---

    /** {@code ExrResult exr_context_create(ExrContextCreateInfo const * create_info, ExrContext * out_ctx)} */
    public static native int nexr_context_create(long create_info, long out_ctx);

    /** {@code ExrResult exr_context_create(ExrContextCreateInfo const * create_info, ExrContext * out_ctx)} */
    @NativeType("ExrResult")
    public static int exr_context_create(@NativeType("ExrContextCreateInfo const *") ExrContextCreateInfo create_info, @NativeType("ExrContext *") PointerBuffer out_ctx) {
        if (CHECKS) {
            check(out_ctx, 1);
            ExrContextCreateInfo.validate(create_info.address());
        }
        return nexr_context_create(create_info.address(), memAddress(out_ctx));
    }

    // --- [ exr_context_destroy ] ---

    /** {@code void exr_context_destroy(ExrContext ctx)} */
    public static native void nexr_context_destroy(long ctx);

    /** {@code void exr_context_destroy(ExrContext ctx)} */
    public static void exr_context_destroy(@NativeType("ExrContext") long ctx) {
        if (CHECKS) {
            check(ctx);
        }
        nexr_context_destroy(ctx);
    }

    // --- [ exr_context_add_ref ] ---

    /** {@code void exr_context_add_ref(ExrContext ctx)} */
    public static native void nexr_context_add_ref(long ctx);

    /** {@code void exr_context_add_ref(ExrContext ctx)} */
    public static void exr_context_add_ref(@NativeType("ExrContext") long ctx) {
        if (CHECKS) {
            check(ctx);
        }
        nexr_context_add_ref(ctx);
    }

    // --- [ exr_context_release ] ---

    /** {@code void exr_context_release(ExrContext ctx)} */
    public static native void nexr_context_release(long ctx);

    /** {@code void exr_context_release(ExrContext ctx)} */
    public static void exr_context_release(@NativeType("ExrContext") long ctx) {
        if (CHECKS) {
            check(ctx);
        }
        nexr_context_release(ctx);
    }

    // --- [ exr_memory_pool_create ] ---

    /** {@code ExrResult exr_memory_pool_create(ExrContext ctx, ExrMemoryPoolCreateInfo const * create_info, ExrMemoryPool * out_pool)} */
    public static native int nexr_memory_pool_create(long ctx, long create_info, long out_pool);

    /** {@code ExrResult exr_memory_pool_create(ExrContext ctx, ExrMemoryPoolCreateInfo const * create_info, ExrMemoryPool * out_pool)} */
    @NativeType("ExrResult")
    public static int exr_memory_pool_create(@NativeType("ExrContext") long ctx, @NativeType("ExrMemoryPoolCreateInfo const *") ExrMemoryPoolCreateInfo create_info, @NativeType("ExrMemoryPool *") PointerBuffer out_pool) {
        if (CHECKS) {
            check(ctx);
            check(out_pool, 1);
        }
        return nexr_memory_pool_create(ctx, create_info.address(), memAddress(out_pool));
    }

    // --- [ exr_memory_pool_destroy ] ---

    /** {@code void exr_memory_pool_destroy(ExrMemoryPool pool)} */
    public static native void nexr_memory_pool_destroy(long pool);

    /** {@code void exr_memory_pool_destroy(ExrMemoryPool pool)} */
    public static void exr_memory_pool_destroy(@NativeType("ExrMemoryPool") long pool) {
        if (CHECKS) {
            check(pool);
        }
        nexr_memory_pool_destroy(pool);
    }

    // --- [ exr_memory_pool_reset ] ---

    /** {@code void exr_memory_pool_reset(ExrMemoryPool pool)} */
    public static native void nexr_memory_pool_reset(long pool);

    /** {@code void exr_memory_pool_reset(ExrMemoryPool pool)} */
    public static void exr_memory_pool_reset(@NativeType("ExrMemoryPool") long pool) {
        if (CHECKS) {
            check(pool);
        }
        nexr_memory_pool_reset(pool);
    }

    // --- [ exr_memory_pool_get_used ] ---

    /** {@code size_t exr_memory_pool_get_used(ExrMemoryPool pool)} */
    public static native long nexr_memory_pool_get_used(long pool);

    /** {@code size_t exr_memory_pool_get_used(ExrMemoryPool pool)} */
    @NativeType("size_t")
    public static long exr_memory_pool_get_used(@NativeType("ExrMemoryPool") long pool) {
        if (CHECKS) {
            check(pool);
        }
        return nexr_memory_pool_get_used(pool);
    }

    // --- [ exr_decoder_create ] ---

    /** {@code ExrResult exr_decoder_create(ExrContext ctx, ExrDecoderCreateInfo const * create_info, ExrDecoder * out_decoder)} */
    public static native int nexr_decoder_create(long ctx, long create_info, long out_decoder);

    /** {@code ExrResult exr_decoder_create(ExrContext ctx, ExrDecoderCreateInfo const * create_info, ExrDecoder * out_decoder)} */
    @NativeType("ExrResult")
    public static int exr_decoder_create(@NativeType("ExrContext") long ctx, @NativeType("ExrDecoderCreateInfo const *") ExrDecoderCreateInfo create_info, @NativeType("ExrDecoder *") PointerBuffer out_decoder) {
        if (CHECKS) {
            check(ctx);
            check(out_decoder, 1);
            ExrDecoderCreateInfo.validate(create_info.address());
        }
        return nexr_decoder_create(ctx, create_info.address(), memAddress(out_decoder));
    }

    // --- [ exr_decoder_destroy ] ---

    /** {@code void exr_decoder_destroy(ExrDecoder decoder)} */
    public static native void nexr_decoder_destroy(long decoder);

    /** {@code void exr_decoder_destroy(ExrDecoder decoder)} */
    public static void exr_decoder_destroy(@NativeType("ExrDecoder") long decoder) {
        if (CHECKS) {
            check(decoder);
        }
        nexr_decoder_destroy(decoder);
    }

    // --- [ exr_decoder_parse_header ] ---

    /** {@code ExrResult exr_decoder_parse_header(ExrDecoder decoder, ExrImage * out_image)} */
    public static native int nexr_decoder_parse_header(long decoder, long out_image);

    /** {@code ExrResult exr_decoder_parse_header(ExrDecoder decoder, ExrImage * out_image)} */
    @NativeType("ExrResult")
    public static int exr_decoder_parse_header(@NativeType("ExrDecoder") long decoder, @NativeType("ExrImage *") PointerBuffer out_image) {
        if (CHECKS) {
            check(decoder);
            check(out_image, 1);
        }
        return nexr_decoder_parse_header(decoder, memAddress(out_image));
    }

    // --- [ exr_decoder_wait_idle ] ---

    /** {@code ExrResult exr_decoder_wait_idle(ExrDecoder decoder)} */
    public static native int nexr_decoder_wait_idle(long decoder);

    /** {@code ExrResult exr_decoder_wait_idle(ExrDecoder decoder)} */
    @NativeType("ExrResult")
    public static int exr_decoder_wait_idle(@NativeType("ExrDecoder") long decoder) {
        if (CHECKS) {
            check(decoder);
        }
        return nexr_decoder_wait_idle(decoder);
    }

    // --- [ exr_decoder_get_suspend_state ] ---

    /** {@code ExrResult exr_decoder_get_suspend_state(ExrDecoder decoder, ExrSuspendState * out_state)} */
    public static native int nexr_decoder_get_suspend_state(long decoder, long out_state);

    /** {@code ExrResult exr_decoder_get_suspend_state(ExrDecoder decoder, ExrSuspendState * out_state)} */
    @NativeType("ExrResult")
    public static int exr_decoder_get_suspend_state(@NativeType("ExrDecoder") long decoder, @NativeType("ExrSuspendState *") PointerBuffer out_state) {
        if (CHECKS) {
            check(decoder);
            check(out_state, 1);
        }
        return nexr_decoder_get_suspend_state(decoder, memAddress(out_state));
    }

    // --- [ exr_suspend_get_pending_fetch ] ---

    /** {@code ExrResult exr_suspend_get_pending_fetch(ExrSuspendState state, ExrPendingFetch * out_fetch)} */
    public static native int nexr_suspend_get_pending_fetch(long state, long out_fetch);

    /** {@code ExrResult exr_suspend_get_pending_fetch(ExrSuspendState state, ExrPendingFetch * out_fetch)} */
    @NativeType("ExrResult")
    public static int exr_suspend_get_pending_fetch(@NativeType("ExrSuspendState") long state, @NativeType("ExrPendingFetch *") ExrPendingFetch out_fetch) {
        if (CHECKS) {
            check(state);
        }
        return nexr_suspend_get_pending_fetch(state, out_fetch.address());
    }

    // --- [ exr_suspend_complete_fetch ] ---

    /** {@code ExrResult exr_suspend_complete_fetch(ExrSuspendState state, void const * data, size_t size)} */
    public static native int nexr_suspend_complete_fetch(long state, long data, long size);

    /** {@code ExrResult exr_suspend_complete_fetch(ExrSuspendState state, void const * data, size_t size)} */
    @NativeType("ExrResult")
    public static int exr_suspend_complete_fetch(@NativeType("ExrSuspendState") long state, @NativeType("void const *") ByteBuffer data) {
        if (CHECKS) {
            check(state);
        }
        return nexr_suspend_complete_fetch(state, memAddress(data), data.remaining());
    }

    // --- [ exr_decoder_resume ] ---

    /** {@code ExrResult exr_decoder_resume(ExrDecoder decoder)} */
    public static native int nexr_decoder_resume(long decoder);

    /** {@code ExrResult exr_decoder_resume(ExrDecoder decoder)} */
    @NativeType("ExrResult")
    public static int exr_decoder_resume(@NativeType("ExrDecoder") long decoder) {
        if (CHECKS) {
            check(decoder);
        }
        return nexr_decoder_resume(decoder);
    }

    // --- [ exr_image_get_info ] ---

    /** {@code ExrResult exr_image_get_info(ExrImage image, ExrImageInfo * out_info)} */
    public static native int nexr_image_get_info(long image, long out_info);

    /** {@code ExrResult exr_image_get_info(ExrImage image, ExrImageInfo * out_info)} */
    @NativeType("ExrResult")
    public static int exr_image_get_info(@NativeType("ExrImage") long image, @NativeType("ExrImageInfo *") ExrImageInfo out_info) {
        if (CHECKS) {
            check(image);
        }
        return nexr_image_get_info(image, out_info.address());
    }

    // --- [ exr_image_destroy ] ---

    /** {@code void exr_image_destroy(ExrImage image)} */
    public static native void nexr_image_destroy(long image);

    /** {@code void exr_image_destroy(ExrImage image)} */
    public static void exr_image_destroy(@NativeType("ExrImage") long image) {
        if (CHECKS) {
            check(image);
        }
        nexr_image_destroy(image);
    }

    // --- [ exr_image_get_channel_count ] ---

    /** {@code ExrResult exr_image_get_channel_count(ExrImage image, uint32_t * out_count)} */
    public static native int nexr_image_get_channel_count(long image, long out_count);

    /** {@code ExrResult exr_image_get_channel_count(ExrImage image, uint32_t * out_count)} */
    @NativeType("ExrResult")
    public static int exr_image_get_channel_count(@NativeType("ExrImage") long image, @NativeType("uint32_t *") IntBuffer out_count) {
        if (CHECKS) {
            check(image);
            check(out_count, 1);
        }
        return nexr_image_get_channel_count(image, memAddress(out_count));
    }

    // --- [ exr_image_get_channel ] ---

    /** {@code ExrResult exr_image_get_channel(ExrImage image, uint32_t index, ExrChannelInfo * out_info)} */
    public static native int nexr_image_get_channel(long image, int index, long out_info);

    /** {@code ExrResult exr_image_get_channel(ExrImage image, uint32_t index, ExrChannelInfo * out_info)} */
    @NativeType("ExrResult")
    public static int exr_image_get_channel(@NativeType("ExrImage") long image, @NativeType("uint32_t") int index, @NativeType("ExrChannelInfo *") ExrChannelInfo out_info) {
        if (CHECKS) {
            check(image);
        }
        return nexr_image_get_channel(image, index, out_info.address());
    }

    // --- [ exr_image_find_channel ] ---

    /** {@code ExrResult exr_image_find_channel(ExrImage image, char const * name, uint32_t * out_index)} */
    public static native int nexr_image_find_channel(long image, long name, long out_index);

    /** {@code ExrResult exr_image_find_channel(ExrImage image, char const * name, uint32_t * out_index)} */
    @NativeType("ExrResult")
    public static int exr_image_find_channel(@NativeType("ExrImage") long image, @NativeType("char const *") ByteBuffer name, @NativeType("uint32_t *") IntBuffer out_index) {
        if (CHECKS) {
            check(image);
            checkNT1(name);
            check(out_index, 1);
        }
        return nexr_image_find_channel(image, memAddress(name), memAddress(out_index));
    }

    /** {@code ExrResult exr_image_find_channel(ExrImage image, char const * name, uint32_t * out_index)} */
    @NativeType("ExrResult")
    public static int exr_image_find_channel(@NativeType("ExrImage") long image, @NativeType("char const *") CharSequence name, @NativeType("uint32_t *") IntBuffer out_index) {
        if (CHECKS) {
            check(image);
            check(out_index, 1);
        }
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nASCII(name, true);
            long nameEncoded = stack.getPointerAddress();
            return nexr_image_find_channel(image, nameEncoded, memAddress(out_index));
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ exr_image_get_part_count ] ---

    /** {@code ExrResult exr_image_get_part_count(ExrImage image, uint32_t * out_count)} */
    public static native int nexr_image_get_part_count(long image, long out_count);

    /** {@code ExrResult exr_image_get_part_count(ExrImage image, uint32_t * out_count)} */
    @NativeType("ExrResult")
    public static int exr_image_get_part_count(@NativeType("ExrImage") long image, @NativeType("uint32_t *") IntBuffer out_count) {
        if (CHECKS) {
            check(image);
            check(out_count, 1);
        }
        return nexr_image_get_part_count(image, memAddress(out_count));
    }

    // --- [ exr_image_get_part ] ---

    /** {@code ExrResult exr_image_get_part(ExrImage image, uint32_t index, ExrPart * out_part)} */
    public static native int nexr_image_get_part(long image, int index, long out_part);

    /** {@code ExrResult exr_image_get_part(ExrImage image, uint32_t index, ExrPart * out_part)} */
    @NativeType("ExrResult")
    public static int exr_image_get_part(@NativeType("ExrImage") long image, @NativeType("uint32_t") int index, @NativeType("ExrPart *") PointerBuffer out_part) {
        if (CHECKS) {
            check(image);
            check(out_part, 1);
        }
        return nexr_image_get_part(image, index, memAddress(out_part));
    }

    // --- [ exr_image_find_part_by_name ] ---

    /** {@code ExrResult exr_image_find_part_by_name(ExrImage image, char const * name, ExrPart * out_part)} */
    public static native int nexr_image_find_part_by_name(long image, long name, long out_part);

    /** {@code ExrResult exr_image_find_part_by_name(ExrImage image, char const * name, ExrPart * out_part)} */
    @NativeType("ExrResult")
    public static int exr_image_find_part_by_name(@NativeType("ExrImage") long image, @NativeType("char const *") ByteBuffer name, @NativeType("ExrPart *") PointerBuffer out_part) {
        if (CHECKS) {
            check(image);
            checkNT1(name);
            check(out_part, 1);
        }
        return nexr_image_find_part_by_name(image, memAddress(name), memAddress(out_part));
    }

    /** {@code ExrResult exr_image_find_part_by_name(ExrImage image, char const * name, ExrPart * out_part)} */
    @NativeType("ExrResult")
    public static int exr_image_find_part_by_name(@NativeType("ExrImage") long image, @NativeType("char const *") CharSequence name, @NativeType("ExrPart *") PointerBuffer out_part) {
        if (CHECKS) {
            check(image);
            check(out_part, 1);
        }
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nASCII(name, true);
            long nameEncoded = stack.getPointerAddress();
            return nexr_image_find_part_by_name(image, nameEncoded, memAddress(out_part));
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ exr_part_destroy ] ---

    /** {@code void exr_part_destroy(ExrPart part)} */
    public static native void nexr_part_destroy(long part);

    /** {@code void exr_part_destroy(ExrPart part)} */
    public static void exr_part_destroy(@NativeType("ExrPart") long part) {
        if (CHECKS) {
            check(part);
        }
        nexr_part_destroy(part);
    }

    // --- [ exr_part_get_info ] ---

    /** {@code ExrResult exr_part_get_info(ExrPart part, ExrPartInfo * out_info)} */
    public static native int nexr_part_get_info(long part, long out_info);

    /** {@code ExrResult exr_part_get_info(ExrPart part, ExrPartInfo * out_info)} */
    @NativeType("ExrResult")
    public static int exr_part_get_info(@NativeType("ExrPart") long part, @NativeType("ExrPartInfo *") ExrPartInfo out_info) {
        if (CHECKS) {
            check(part);
        }
        return nexr_part_get_info(part, out_info.address());
    }

    // --- [ exr_part_get_channel ] ---

    /** {@code ExrResult exr_part_get_channel(ExrPart part, uint32_t index, ExrChannelInfo * out_info)} */
    public static native int nexr_part_get_channel(long part, int index, long out_info);

    /** {@code ExrResult exr_part_get_channel(ExrPart part, uint32_t index, ExrChannelInfo * out_info)} */
    @NativeType("ExrResult")
    public static int exr_part_get_channel(@NativeType("ExrPart") long part, @NativeType("uint32_t") int index, @NativeType("ExrChannelInfo *") ExrChannelInfo out_info) {
        if (CHECKS) {
            check(part);
        }
        return nexr_part_get_channel(part, index, out_info.address());
    }

    // --- [ exr_part_get_attribute_count ] ---

    /** {@code ExrResult exr_part_get_attribute_count(ExrPart part, uint32_t * out_count)} */
    public static native int nexr_part_get_attribute_count(long part, long out_count);

    /** {@code ExrResult exr_part_get_attribute_count(ExrPart part, uint32_t * out_count)} */
    @NativeType("ExrResult")
    public static int exr_part_get_attribute_count(@NativeType("ExrPart") long part, @NativeType("uint32_t *") IntBuffer out_count) {
        if (CHECKS) {
            check(part);
            check(out_count, 1);
        }
        return nexr_part_get_attribute_count(part, memAddress(out_count));
    }

    // --- [ exr_part_get_attribute ] ---

    /** {@code ExrResult exr_part_get_attribute(ExrPart part, char const * name, ExrAttribute * out_attr)} */
    public static native int nexr_part_get_attribute(long part, long name, long out_attr);

    /** {@code ExrResult exr_part_get_attribute(ExrPart part, char const * name, ExrAttribute * out_attr)} */
    @NativeType("ExrResult")
    public static int exr_part_get_attribute(@NativeType("ExrPart") long part, @NativeType("char const *") ByteBuffer name, @NativeType("ExrAttribute *") ExrAttribute out_attr) {
        if (CHECKS) {
            check(part);
            checkNT1(name);
        }
        return nexr_part_get_attribute(part, memAddress(name), out_attr.address());
    }

    /** {@code ExrResult exr_part_get_attribute(ExrPart part, char const * name, ExrAttribute * out_attr)} */
    @NativeType("ExrResult")
    public static int exr_part_get_attribute(@NativeType("ExrPart") long part, @NativeType("char const *") CharSequence name, @NativeType("ExrAttribute *") ExrAttribute out_attr) {
        if (CHECKS) {
            check(part);
        }
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nASCII(name, true);
            long nameEncoded = stack.getPointerAddress();
            return nexr_part_get_attribute(part, nameEncoded, out_attr.address());
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ exr_part_get_attribute_at ] ---

    /** {@code ExrResult exr_part_get_attribute_at(ExrPart part, uint32_t index, ExrAttribute * out_attr)} */
    public static native int nexr_part_get_attribute_at(long part, int index, long out_attr);

    /** {@code ExrResult exr_part_get_attribute_at(ExrPart part, uint32_t index, ExrAttribute * out_attr)} */
    @NativeType("ExrResult")
    public static int exr_part_get_attribute_at(@NativeType("ExrPart") long part, @NativeType("uint32_t") int index, @NativeType("ExrAttribute *") ExrAttribute out_attr) {
        if (CHECKS) {
            check(part);
        }
        return nexr_part_get_attribute_at(part, index, out_attr.address());
    }

    // --- [ exr_part_has_attribute ] ---

    /** {@code int exr_part_has_attribute(ExrPart part, char const * name)} */
    public static native int nexr_part_has_attribute(long part, long name);

    /** {@code int exr_part_has_attribute(ExrPart part, char const * name)} */
    public static int exr_part_has_attribute(@NativeType("ExrPart") long part, @NativeType("char const *") ByteBuffer name) {
        if (CHECKS) {
            check(part);
            checkNT1(name);
        }
        return nexr_part_has_attribute(part, memAddress(name));
    }

    /** {@code int exr_part_has_attribute(ExrPart part, char const * name)} */
    public static int exr_part_has_attribute(@NativeType("ExrPart") long part, @NativeType("char const *") CharSequence name) {
        if (CHECKS) {
            check(part);
        }
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nASCII(name, true);
            long nameEncoded = stack.getPointerAddress();
            return nexr_part_has_attribute(part, nameEncoded);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ exr_part_get_chunk_count ] ---

    /** {@code ExrResult exr_part_get_chunk_count(ExrPart part, uint32_t * out_count)} */
    public static native int nexr_part_get_chunk_count(long part, long out_count);

    /** {@code ExrResult exr_part_get_chunk_count(ExrPart part, uint32_t * out_count)} */
    @NativeType("ExrResult")
    public static int exr_part_get_chunk_count(@NativeType("ExrPart") long part, @NativeType("uint32_t *") IntBuffer out_count) {
        if (CHECKS) {
            check(part);
            check(out_count, 1);
        }
        return nexr_part_get_chunk_count(part, memAddress(out_count));
    }

    // --- [ exr_command_buffer_create ] ---

    /** {@code ExrResult exr_command_buffer_create(ExrContext ctx, ExrCommandBufferCreateInfo const * create_info, ExrCommandBuffer * out_cmd)} */
    public static native int nexr_command_buffer_create(long ctx, long create_info, long out_cmd);

    /** {@code ExrResult exr_command_buffer_create(ExrContext ctx, ExrCommandBufferCreateInfo const * create_info, ExrCommandBuffer * out_cmd)} */
    @NativeType("ExrResult")
    public static int exr_command_buffer_create(@NativeType("ExrContext") long ctx, @NativeType("ExrCommandBufferCreateInfo const *") ExrCommandBufferCreateInfo create_info, @NativeType("ExrCommandBuffer *") PointerBuffer out_cmd) {
        if (CHECKS) {
            check(ctx);
            check(out_cmd, 1);
            ExrCommandBufferCreateInfo.validate(create_info.address());
        }
        return nexr_command_buffer_create(ctx, create_info.address(), memAddress(out_cmd));
    }

    // --- [ exr_command_buffer_destroy ] ---

    /** {@code void exr_command_buffer_destroy(ExrCommandBuffer cmd)} */
    public static native void nexr_command_buffer_destroy(long cmd);

    /** {@code void exr_command_buffer_destroy(ExrCommandBuffer cmd)} */
    public static void exr_command_buffer_destroy(@NativeType("ExrCommandBuffer") long cmd) {
        if (CHECKS) {
            check(cmd);
        }
        nexr_command_buffer_destroy(cmd);
    }

    // --- [ exr_command_buffer_reset ] ---

    /** {@code ExrResult exr_command_buffer_reset(ExrCommandBuffer cmd)} */
    public static native int nexr_command_buffer_reset(long cmd);

    /** {@code ExrResult exr_command_buffer_reset(ExrCommandBuffer cmd)} */
    @NativeType("ExrResult")
    public static int exr_command_buffer_reset(@NativeType("ExrCommandBuffer") long cmd) {
        if (CHECKS) {
            check(cmd);
        }
        return nexr_command_buffer_reset(cmd);
    }

    // --- [ exr_command_buffer_begin ] ---

    /** {@code ExrResult exr_command_buffer_begin(ExrCommandBuffer cmd)} */
    public static native int nexr_command_buffer_begin(long cmd);

    /** {@code ExrResult exr_command_buffer_begin(ExrCommandBuffer cmd)} */
    @NativeType("ExrResult")
    public static int exr_command_buffer_begin(@NativeType("ExrCommandBuffer") long cmd) {
        if (CHECKS) {
            check(cmd);
        }
        return nexr_command_buffer_begin(cmd);
    }

    // --- [ exr_command_buffer_end ] ---

    /** {@code ExrResult exr_command_buffer_end(ExrCommandBuffer cmd)} */
    public static native int nexr_command_buffer_end(long cmd);

    /** {@code ExrResult exr_command_buffer_end(ExrCommandBuffer cmd)} */
    @NativeType("ExrResult")
    public static int exr_command_buffer_end(@NativeType("ExrCommandBuffer") long cmd) {
        if (CHECKS) {
            check(cmd);
        }
        return nexr_command_buffer_end(cmd);
    }

    // --- [ exr_cmd_request_tile ] ---

    /** {@code ExrResult exr_cmd_request_tile(ExrCommandBuffer cmd, ExrTileRequest const * request)} */
    public static native int nexr_cmd_request_tile(long cmd, long request);

    /** {@code ExrResult exr_cmd_request_tile(ExrCommandBuffer cmd, ExrTileRequest const * request)} */
    @NativeType("ExrResult")
    public static int exr_cmd_request_tile(@NativeType("ExrCommandBuffer") long cmd, @NativeType("ExrTileRequest const *") ExrTileRequest request) {
        if (CHECKS) {
            check(cmd);
            ExrTileRequest.validate(request.address());
        }
        return nexr_cmd_request_tile(cmd, request.address());
    }

    // --- [ exr_cmd_request_tiles ] ---

    /** {@code ExrResult exr_cmd_request_tiles(ExrCommandBuffer cmd, uint32_t count, ExrTileRequest const * requests)} */
    public static native int nexr_cmd_request_tiles(long cmd, int count, long requests);

    /** {@code ExrResult exr_cmd_request_tiles(ExrCommandBuffer cmd, uint32_t count, ExrTileRequest const * requests)} */
    @NativeType("ExrResult")
    public static int exr_cmd_request_tiles(@NativeType("ExrCommandBuffer") long cmd, @NativeType("uint32_t") int count, @NativeType("ExrTileRequest const *") ExrTileRequest requests) {
        if (CHECKS) {
            check(cmd);
            ExrTileRequest.validate(requests.address());
        }
        return nexr_cmd_request_tiles(cmd, count, requests.address());
    }

    // --- [ exr_cmd_request_scanlines ] ---

    /** {@code ExrResult exr_cmd_request_scanlines(ExrCommandBuffer cmd, ExrScanlineRequest const * request)} */
    public static native int nexr_cmd_request_scanlines(long cmd, long request);

    /** {@code ExrResult exr_cmd_request_scanlines(ExrCommandBuffer cmd, ExrScanlineRequest const * request)} */
    @NativeType("ExrResult")
    public static int exr_cmd_request_scanlines(@NativeType("ExrCommandBuffer") long cmd, @NativeType("ExrScanlineRequest const *") ExrScanlineRequest request) {
        if (CHECKS) {
            check(cmd);
            ExrScanlineRequest.validate(request.address());
        }
        return nexr_cmd_request_scanlines(cmd, request.address());
    }

    // --- [ exr_cmd_request_scanline_blocks ] ---

    /** {@code ExrResult exr_cmd_request_scanline_blocks(ExrCommandBuffer cmd, uint32_t count, ExrScanlineRequest const * requests)} */
    public static native int nexr_cmd_request_scanline_blocks(long cmd, int count, long requests);

    /** {@code ExrResult exr_cmd_request_scanline_blocks(ExrCommandBuffer cmd, uint32_t count, ExrScanlineRequest const * requests)} */
    @NativeType("ExrResult")
    public static int exr_cmd_request_scanline_blocks(@NativeType("ExrCommandBuffer") long cmd, @NativeType("ExrScanlineRequest const *") ExrScanlineRequest.Buffer requests) {
        if (CHECKS) {
            check(cmd);
            Struct.validate(requests.address(), requests.remaining(), ExrScanlineRequest.SIZEOF, ExrScanlineRequest::validate);
        }
        return nexr_cmd_request_scanline_blocks(cmd, requests.remaining(), requests.address());
    }

    // --- [ exr_part_get_deep_sample_counts ] ---

    /** {@code ExrResult exr_part_get_deep_sample_counts(ExrDecoder decoder, ExrPart part, int32_t y_start, int32_t num_lines, ExrDeepSampleInfo * out_info)} */
    public static native int nexr_part_get_deep_sample_counts(long decoder, long part, int y_start, int num_lines, long out_info);

    /** {@code ExrResult exr_part_get_deep_sample_counts(ExrDecoder decoder, ExrPart part, int32_t y_start, int32_t num_lines, ExrDeepSampleInfo * out_info)} */
    @NativeType("ExrResult")
    public static int exr_part_get_deep_sample_counts(@NativeType("ExrDecoder") long decoder, @NativeType("ExrPart") long part, @NativeType("int32_t") int y_start, @NativeType("int32_t") int num_lines, @NativeType("ExrDeepSampleInfo *") ExrDeepSampleInfo out_info) {
        if (CHECKS) {
            check(decoder);
            check(part);
        }
        return nexr_part_get_deep_sample_counts(decoder, part, y_start, num_lines, out_info.address());
    }

    // --- [ exr_deep_sample_info_free ] ---

    /** {@code void exr_deep_sample_info_free(ExrContext ctx, ExrDeepSampleInfo * info)} */
    public static native void nexr_deep_sample_info_free(long ctx, long info);

    /** {@code void exr_deep_sample_info_free(ExrContext ctx, ExrDeepSampleInfo * info)} */
    public static void exr_deep_sample_info_free(@NativeType("ExrContext") long ctx, @NativeType("ExrDeepSampleInfo *") ExrDeepSampleInfo info) {
        if (CHECKS) {
            check(ctx);
        }
        nexr_deep_sample_info_free(ctx, info.address());
    }

    // --- [ exr_cmd_request_deep_scanlines ] ---

    /** {@code ExrResult exr_cmd_request_deep_scanlines(ExrCommandBuffer cmd, ExrDeepScanlineRequest const * request)} */
    public static native int nexr_cmd_request_deep_scanlines(long cmd, long request);

    /** {@code ExrResult exr_cmd_request_deep_scanlines(ExrCommandBuffer cmd, ExrDeepScanlineRequest const * request)} */
    @NativeType("ExrResult")
    public static int exr_cmd_request_deep_scanlines(@NativeType("ExrCommandBuffer") long cmd, @NativeType("ExrDeepScanlineRequest const *") ExrDeepScanlineRequest request) {
        if (CHECKS) {
            check(cmd);
            ExrDeepScanlineRequest.validate(request.address());
        }
        return nexr_cmd_request_deep_scanlines(cmd, request.address());
    }

    // --- [ exr_part_get_deep_tile_sample_counts ] ---

    /** {@code ExrResult exr_part_get_deep_tile_sample_counts(ExrDecoder decoder, ExrPart part, int32_t tile_x, int32_t tile_y, int32_t level_x, int32_t level_y, ExrDeepTileSampleInfo * out_info)} */
    public static native int nexr_part_get_deep_tile_sample_counts(long decoder, long part, int tile_x, int tile_y, int level_x, int level_y, long out_info);

    /** {@code ExrResult exr_part_get_deep_tile_sample_counts(ExrDecoder decoder, ExrPart part, int32_t tile_x, int32_t tile_y, int32_t level_x, int32_t level_y, ExrDeepTileSampleInfo * out_info)} */
    @NativeType("ExrResult")
    public static int exr_part_get_deep_tile_sample_counts(@NativeType("ExrDecoder") long decoder, @NativeType("ExrPart") long part, @NativeType("int32_t") int tile_x, @NativeType("int32_t") int tile_y, @NativeType("int32_t") int level_x, @NativeType("int32_t") int level_y, @NativeType("ExrDeepTileSampleInfo *") ExrDeepTileSampleInfo out_info) {
        if (CHECKS) {
            check(decoder);
            check(part);
        }
        return nexr_part_get_deep_tile_sample_counts(decoder, part, tile_x, tile_y, level_x, level_y, out_info.address());
    }

    // --- [ exr_deep_tile_sample_info_free ] ---

    /** {@code void exr_deep_tile_sample_info_free(ExrContext ctx, ExrDeepTileSampleInfo * info)} */
    public static native void nexr_deep_tile_sample_info_free(long ctx, long info);

    /** {@code void exr_deep_tile_sample_info_free(ExrContext ctx, ExrDeepTileSampleInfo * info)} */
    public static void exr_deep_tile_sample_info_free(@NativeType("ExrContext") long ctx, @NativeType("ExrDeepTileSampleInfo *") ExrDeepTileSampleInfo info) {
        if (CHECKS) {
            check(ctx);
        }
        nexr_deep_tile_sample_info_free(ctx, info.address());
    }

    // --- [ exr_cmd_request_deep_tiles ] ---

    /** {@code ExrResult exr_cmd_request_deep_tiles(ExrCommandBuffer cmd, ExrDeepTileRequest const * request)} */
    public static native int nexr_cmd_request_deep_tiles(long cmd, long request);

    /** {@code ExrResult exr_cmd_request_deep_tiles(ExrCommandBuffer cmd, ExrDeepTileRequest const * request)} */
    @NativeType("ExrResult")
    public static int exr_cmd_request_deep_tiles(@NativeType("ExrCommandBuffer") long cmd, @NativeType("ExrDeepTileRequest const *") ExrDeepTileRequest request) {
        if (CHECKS) {
            check(cmd);
            ExrDeepTileRequest.validate(request.address());
        }
        return nexr_cmd_request_deep_tiles(cmd, request.address());
    }

    // --- [ exr_cmd_request_deep_tile_batch ] ---

    /** {@code ExrResult exr_cmd_request_deep_tile_batch(ExrCommandBuffer cmd, uint32_t count, ExrDeepTileRequest const * requests)} */
    public static native int nexr_cmd_request_deep_tile_batch(long cmd, int count, long requests);

    /** {@code ExrResult exr_cmd_request_deep_tile_batch(ExrCommandBuffer cmd, uint32_t count, ExrDeepTileRequest const * requests)} */
    @NativeType("ExrResult")
    public static int exr_cmd_request_deep_tile_batch(@NativeType("ExrCommandBuffer") long cmd, @NativeType("ExrDeepTileRequest const *") ExrDeepTileRequest.Buffer requests) {
        if (CHECKS) {
            check(cmd);
            Struct.validate(requests.address(), requests.remaining(), ExrDeepTileRequest.SIZEOF, ExrDeepTileRequest::validate);
        }
        return nexr_cmd_request_deep_tile_batch(cmd, requests.remaining(), requests.address());
    }

    // --- [ exr_cmd_request_full_image ] ---

    /** {@code ExrResult exr_cmd_request_full_image(ExrCommandBuffer cmd, ExrFullImageRequest const * request)} */
    public static native int nexr_cmd_request_full_image(long cmd, long request);

    /** {@code ExrResult exr_cmd_request_full_image(ExrCommandBuffer cmd, ExrFullImageRequest const * request)} */
    @NativeType("ExrResult")
    public static int exr_cmd_request_full_image(@NativeType("ExrCommandBuffer") long cmd, @NativeType("ExrFullImageRequest const *") ExrFullImageRequest request) {
        if (CHECKS) {
            check(cmd);
            ExrFullImageRequest.validate(request.address());
        }
        return nexr_cmd_request_full_image(cmd, request.address());
    }

    // --- [ exr_submit ] ---

    /** {@code ExrResult exr_submit(ExrDecoder decoder, ExrSubmitInfo const * submit_info)} */
    public static native int nexr_submit(long decoder, long submit_info);

    /** {@code ExrResult exr_submit(ExrDecoder decoder, ExrSubmitInfo const * submit_info)} */
    @NativeType("ExrResult")
    public static int exr_submit(@NativeType("ExrDecoder") long decoder, @NativeType("ExrSubmitInfo const *") ExrSubmitInfo submit_info) {
        if (CHECKS) {
            check(decoder);
            ExrSubmitInfo.validate(submit_info.address());
        }
        return nexr_submit(decoder, submit_info.address());
    }

    // --- [ exr_fence_create ] ---

    /** {@code ExrResult exr_fence_create(ExrContext ctx, ExrFenceCreateInfo const * create_info, ExrFence * out_fence)} */
    public static native int nexr_fence_create(long ctx, long create_info, long out_fence);

    /** {@code ExrResult exr_fence_create(ExrContext ctx, ExrFenceCreateInfo const * create_info, ExrFence * out_fence)} */
    @NativeType("ExrResult")
    public static int exr_fence_create(@NativeType("ExrContext") long ctx, @NativeType("ExrFenceCreateInfo const *") ExrFenceCreateInfo create_info, @NativeType("ExrFence *") PointerBuffer out_fence) {
        if (CHECKS) {
            check(ctx);
            check(out_fence, 1);
        }
        return nexr_fence_create(ctx, create_info.address(), memAddress(out_fence));
    }

    // --- [ exr_fence_destroy ] ---

    /** {@code void exr_fence_destroy(ExrFence fence)} */
    public static native void nexr_fence_destroy(long fence);

    /** {@code void exr_fence_destroy(ExrFence fence)} */
    public static void exr_fence_destroy(@NativeType("ExrFence") long fence) {
        if (CHECKS) {
            check(fence);
        }
        nexr_fence_destroy(fence);
    }

    // --- [ exr_fence_wait ] ---

    /** {@code ExrResult exr_fence_wait(ExrFence fence, uint64_t timeout_ns)} */
    public static native int nexr_fence_wait(long fence, long timeout_ns);

    /** {@code ExrResult exr_fence_wait(ExrFence fence, uint64_t timeout_ns)} */
    @NativeType("ExrResult")
    public static int exr_fence_wait(@NativeType("ExrFence") long fence, @NativeType("uint64_t") long timeout_ns) {
        if (CHECKS) {
            check(fence);
        }
        return nexr_fence_wait(fence, timeout_ns);
    }

    // --- [ exr_fence_get_status ] ---

    /** {@code ExrResult exr_fence_get_status(ExrFence fence)} */
    public static native int nexr_fence_get_status(long fence);

    /** {@code ExrResult exr_fence_get_status(ExrFence fence)} */
    @NativeType("ExrResult")
    public static int exr_fence_get_status(@NativeType("ExrFence") long fence) {
        if (CHECKS) {
            check(fence);
        }
        return nexr_fence_get_status(fence);
    }

    // --- [ exr_fence_reset ] ---

    /** {@code ExrResult exr_fence_reset(ExrFence fence)} */
    public static native int nexr_fence_reset(long fence);

    /** {@code ExrResult exr_fence_reset(ExrFence fence)} */
    @NativeType("ExrResult")
    public static int exr_fence_reset(@NativeType("ExrFence") long fence) {
        if (CHECKS) {
            check(fence);
        }
        return nexr_fence_reset(fence);
    }

    // --- [ exr_get_suspend_state ] ---

    /** {@code ExrResult exr_get_suspend_state(ExrDecoder decoder, ExrSuspendState * out_state)} */
    public static native int nexr_get_suspend_state(long decoder, long out_state);

    /** {@code ExrResult exr_get_suspend_state(ExrDecoder decoder, ExrSuspendState * out_state)} */
    @NativeType("ExrResult")
    public static int exr_get_suspend_state(@NativeType("ExrDecoder") long decoder, @NativeType("ExrSuspendState *") PointerBuffer out_state) {
        if (CHECKS) {
            check(decoder);
            check(out_state, 1);
        }
        return nexr_get_suspend_state(decoder, memAddress(out_state));
    }

    // --- [ exr_resume ] ---

    /** {@code ExrResult exr_resume(ExrDecoder decoder, ExrSuspendState state)} */
    public static native int nexr_resume(long decoder, long state);

    /** {@code ExrResult exr_resume(ExrDecoder decoder, ExrSuspendState state)} */
    @NativeType("ExrResult")
    public static int exr_resume(@NativeType("ExrDecoder") long decoder, @NativeType("ExrSuspendState") long state) {
        if (CHECKS) {
            check(decoder);
            check(state);
        }
        return nexr_resume(decoder, state);
    }

    // --- [ exr_suspend_state_destroy ] ---

    /** {@code void exr_suspend_state_destroy(ExrSuspendState state)} */
    public static native void nexr_suspend_state_destroy(long state);

    /** {@code void exr_suspend_state_destroy(ExrSuspendState state)} */
    public static void exr_suspend_state_destroy(@NativeType("ExrSuspendState") long state) {
        if (CHECKS) {
            check(state);
        }
        nexr_suspend_state_destroy(state);
    }

    // --- [ exr_decoder_set_progress_callback ] ---

    /** {@code ExrResult exr_decoder_set_progress_callback(ExrDecoder decoder, ExrProgressCallback callback, void * userdata, int32_t interval_ms)} */
    public static native int nexr_decoder_set_progress_callback(long decoder, long callback, long userdata, int interval_ms);

    /** {@code ExrResult exr_decoder_set_progress_callback(ExrDecoder decoder, ExrProgressCallback callback, void * userdata, int32_t interval_ms)} */
    @NativeType("ExrResult")
    public static int exr_decoder_set_progress_callback(@NativeType("ExrDecoder") long decoder, @NativeType("ExrProgressCallback") ExrProgressCallbackI callback, @NativeType("void *") long userdata, @NativeType("int32_t") int interval_ms) {
        if (CHECKS) {
            check(decoder);
        }
        return nexr_decoder_set_progress_callback(decoder, callback.address(), userdata, interval_ms);
    }

    // --- [ exr_encoder_create ] ---

    /** {@code ExrResult exr_encoder_create(ExrContext ctx, ExrEncoderCreateInfo const * create_info, ExrEncoder * out_encoder)} */
    public static native int nexr_encoder_create(long ctx, long create_info, long out_encoder);

    /** {@code ExrResult exr_encoder_create(ExrContext ctx, ExrEncoderCreateInfo const * create_info, ExrEncoder * out_encoder)} */
    @NativeType("ExrResult")
    public static int exr_encoder_create(@NativeType("ExrContext") long ctx, @NativeType("ExrEncoderCreateInfo const *") ExrEncoderCreateInfo create_info, @NativeType("ExrEncoder *") PointerBuffer out_encoder) {
        if (CHECKS) {
            check(ctx);
            check(out_encoder, 1);
            ExrEncoderCreateInfo.validate(create_info.address());
        }
        return nexr_encoder_create(ctx, create_info.address(), memAddress(out_encoder));
    }

    // --- [ exr_encoder_destroy ] ---

    /** {@code void exr_encoder_destroy(ExrEncoder encoder)} */
    public static native void nexr_encoder_destroy(long encoder);

    /** {@code void exr_encoder_destroy(ExrEncoder encoder)} */
    public static void exr_encoder_destroy(@NativeType("ExrEncoder") long encoder) {
        if (CHECKS) {
            check(encoder);
        }
        nexr_encoder_destroy(encoder);
    }

    // --- [ exr_write_image_create ] ---

    /** {@code ExrResult exr_write_image_create(ExrEncoder encoder, ExrWriteImageCreateInfo const * create_info, ExrWriteImage * out_image)} */
    public static native int nexr_write_image_create(long encoder, long create_info, long out_image);

    /** {@code ExrResult exr_write_image_create(ExrEncoder encoder, ExrWriteImageCreateInfo const * create_info, ExrWriteImage * out_image)} */
    @NativeType("ExrResult")
    public static int exr_write_image_create(@NativeType("ExrEncoder") long encoder, @NativeType("ExrWriteImageCreateInfo const *") ExrWriteImageCreateInfo create_info, @NativeType("ExrWriteImage *") PointerBuffer out_image) {
        if (CHECKS) {
            check(encoder);
            check(out_image, 1);
            ExrWriteImageCreateInfo.validate(create_info.address());
        }
        return nexr_write_image_create(encoder, create_info.address(), memAddress(out_image));
    }

    // --- [ exr_write_image_destroy ] ---

    /** {@code void exr_write_image_destroy(ExrWriteImage image)} */
    public static native void nexr_write_image_destroy(long image);

    /** {@code void exr_write_image_destroy(ExrWriteImage image)} */
    public static void exr_write_image_destroy(@NativeType("ExrWriteImage") long image) {
        if (CHECKS) {
            check(image);
        }
        nexr_write_image_destroy(image);
    }

    // --- [ exr_write_image_set_attribute ] ---

    /** {@code ExrResult exr_write_image_set_attribute(ExrWriteImage image, char const * name, char const * type, void const * value, uint32_t size)} */
    public static native int nexr_write_image_set_attribute(long image, long name, long type, long value, int size);

    /** {@code ExrResult exr_write_image_set_attribute(ExrWriteImage image, char const * name, char const * type, void const * value, uint32_t size)} */
    @NativeType("ExrResult")
    public static int exr_write_image_set_attribute(@NativeType("ExrWriteImage") long image, @NativeType("char const *") ByteBuffer name, @NativeType("char const *") ByteBuffer type, @NativeType("void const *") ByteBuffer value) {
        if (CHECKS) {
            check(image);
            checkNT1(name);
            checkNT1(type);
        }
        return nexr_write_image_set_attribute(image, memAddress(name), memAddress(type), memAddress(value), value.remaining());
    }

    /** {@code ExrResult exr_write_image_set_attribute(ExrWriteImage image, char const * name, char const * type, void const * value, uint32_t size)} */
    @NativeType("ExrResult")
    public static int exr_write_image_set_attribute(@NativeType("ExrWriteImage") long image, @NativeType("char const *") CharSequence name, @NativeType("char const *") CharSequence type, @NativeType("void const *") ByteBuffer value) {
        if (CHECKS) {
            check(image);
        }
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nASCII(name, true);
            long nameEncoded = stack.getPointerAddress();
            stack.nASCII(type, true);
            long typeEncoded = stack.getPointerAddress();
            return nexr_write_image_set_attribute(image, nameEncoded, typeEncoded, memAddress(value), value.remaining());
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ exr_write_image_set_int_attribute ] ---

    /** {@code ExrResult exr_write_image_set_int_attribute(ExrWriteImage image, char const * name, int32_t value)} */
    public static native int nexr_write_image_set_int_attribute(long image, long name, int value);

    /** {@code ExrResult exr_write_image_set_int_attribute(ExrWriteImage image, char const * name, int32_t value)} */
    @NativeType("ExrResult")
    public static int exr_write_image_set_int_attribute(@NativeType("ExrWriteImage") long image, @NativeType("char const *") ByteBuffer name, @NativeType("int32_t") int value) {
        if (CHECKS) {
            check(image);
            checkNT1(name);
        }
        return nexr_write_image_set_int_attribute(image, memAddress(name), value);
    }

    /** {@code ExrResult exr_write_image_set_int_attribute(ExrWriteImage image, char const * name, int32_t value)} */
    @NativeType("ExrResult")
    public static int exr_write_image_set_int_attribute(@NativeType("ExrWriteImage") long image, @NativeType("char const *") CharSequence name, @NativeType("int32_t") int value) {
        if (CHECKS) {
            check(image);
        }
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nASCII(name, true);
            long nameEncoded = stack.getPointerAddress();
            return nexr_write_image_set_int_attribute(image, nameEncoded, value);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ exr_write_image_set_float_attribute ] ---

    /** {@code ExrResult exr_write_image_set_float_attribute(ExrWriteImage image, char const * name, float value)} */
    public static native int nexr_write_image_set_float_attribute(long image, long name, float value);

    /** {@code ExrResult exr_write_image_set_float_attribute(ExrWriteImage image, char const * name, float value)} */
    @NativeType("ExrResult")
    public static int exr_write_image_set_float_attribute(@NativeType("ExrWriteImage") long image, @NativeType("char const *") ByteBuffer name, float value) {
        if (CHECKS) {
            check(image);
            checkNT1(name);
        }
        return nexr_write_image_set_float_attribute(image, memAddress(name), value);
    }

    /** {@code ExrResult exr_write_image_set_float_attribute(ExrWriteImage image, char const * name, float value)} */
    @NativeType("ExrResult")
    public static int exr_write_image_set_float_attribute(@NativeType("ExrWriteImage") long image, @NativeType("char const *") CharSequence name, float value) {
        if (CHECKS) {
            check(image);
        }
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nASCII(name, true);
            long nameEncoded = stack.getPointerAddress();
            return nexr_write_image_set_float_attribute(image, nameEncoded, value);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ exr_write_image_set_string_attribute ] ---

    /** {@code ExrResult exr_write_image_set_string_attribute(ExrWriteImage image, char const * name, char const * value)} */
    public static native int nexr_write_image_set_string_attribute(long image, long name, long value);

    /** {@code ExrResult exr_write_image_set_string_attribute(ExrWriteImage image, char const * name, char const * value)} */
    @NativeType("ExrResult")
    public static int exr_write_image_set_string_attribute(@NativeType("ExrWriteImage") long image, @NativeType("char const *") ByteBuffer name, @NativeType("char const *") ByteBuffer value) {
        if (CHECKS) {
            check(image);
            checkNT1(name);
            checkNT1(value);
        }
        return nexr_write_image_set_string_attribute(image, memAddress(name), memAddress(value));
    }

    /** {@code ExrResult exr_write_image_set_string_attribute(ExrWriteImage image, char const * name, char const * value)} */
    @NativeType("ExrResult")
    public static int exr_write_image_set_string_attribute(@NativeType("ExrWriteImage") long image, @NativeType("char const *") CharSequence name, @NativeType("char const *") CharSequence value) {
        if (CHECKS) {
            check(image);
        }
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nASCII(name, true);
            long nameEncoded = stack.getPointerAddress();
            stack.nASCII(value, true);
            long valueEncoded = stack.getPointerAddress();
            return nexr_write_image_set_string_attribute(image, nameEncoded, valueEncoded);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ exr_cmd_write_tile ] ---

    /** {@code ExrResult exr_cmd_write_tile(ExrCommandBuffer cmd, ExrTileWrite const * write)} */
    public static native int nexr_cmd_write_tile(long cmd, long write);

    /** {@code ExrResult exr_cmd_write_tile(ExrCommandBuffer cmd, ExrTileWrite const * write)} */
    @NativeType("ExrResult")
    public static int exr_cmd_write_tile(@NativeType("ExrCommandBuffer") long cmd, @NativeType("ExrTileWrite const *") ExrTileWrite write) {
        if (CHECKS) {
            check(cmd);
            ExrTileWrite.validate(write.address());
        }
        return nexr_cmd_write_tile(cmd, write.address());
    }

    // --- [ exr_cmd_write_tiles ] ---

    /** {@code ExrResult exr_cmd_write_tiles(ExrCommandBuffer cmd, uint32_t count, ExrTileWrite const * writes)} */
    public static native int nexr_cmd_write_tiles(long cmd, int count, long writes);

    /** {@code ExrResult exr_cmd_write_tiles(ExrCommandBuffer cmd, uint32_t count, ExrTileWrite const * writes)} */
    @NativeType("ExrResult")
    public static int exr_cmd_write_tiles(@NativeType("ExrCommandBuffer") long cmd, @NativeType("ExrTileWrite const *") ExrTileWrite.Buffer writes) {
        if (CHECKS) {
            check(cmd);
            Struct.validate(writes.address(), writes.remaining(), ExrTileWrite.SIZEOF, ExrTileWrite::validate);
        }
        return nexr_cmd_write_tiles(cmd, writes.remaining(), writes.address());
    }

    // --- [ exr_cmd_write_scanlines ] ---

    /** {@code ExrResult exr_cmd_write_scanlines(ExrCommandBuffer cmd, ExrScanlineWrite const * write)} */
    public static native int nexr_cmd_write_scanlines(long cmd, long write);

    /** {@code ExrResult exr_cmd_write_scanlines(ExrCommandBuffer cmd, ExrScanlineWrite const * write)} */
    @NativeType("ExrResult")
    public static int exr_cmd_write_scanlines(@NativeType("ExrCommandBuffer") long cmd, @NativeType("ExrScanlineWrite const *") ExrScanlineWrite write) {
        if (CHECKS) {
            check(cmd);
            ExrScanlineWrite.validate(write.address());
        }
        return nexr_cmd_write_scanlines(cmd, write.address());
    }

    // --- [ exr_cmd_write_deep_scanlines ] ---

    /** {@code ExrResult exr_cmd_write_deep_scanlines(ExrCommandBuffer cmd, ExrDeepScanlineWrite const * write)} */
    public static native int nexr_cmd_write_deep_scanlines(long cmd, long write);

    /** {@code ExrResult exr_cmd_write_deep_scanlines(ExrCommandBuffer cmd, ExrDeepScanlineWrite const * write)} */
    @NativeType("ExrResult")
    public static int exr_cmd_write_deep_scanlines(@NativeType("ExrCommandBuffer") long cmd, @NativeType("ExrDeepScanlineWrite const *") ExrDeepScanlineWrite write) {
        if (CHECKS) {
            check(cmd);
            ExrDeepScanlineWrite.validate(write.address());
        }
        return nexr_cmd_write_deep_scanlines(cmd, write.address());
    }

    // --- [ exr_cmd_write_deep_tiles ] ---

    /** {@code ExrResult exr_cmd_write_deep_tiles(ExrCommandBuffer cmd, ExrDeepTileWrite const * write)} */
    public static native int nexr_cmd_write_deep_tiles(long cmd, long write);

    /** {@code ExrResult exr_cmd_write_deep_tiles(ExrCommandBuffer cmd, ExrDeepTileWrite const * write)} */
    @NativeType("ExrResult")
    public static int exr_cmd_write_deep_tiles(@NativeType("ExrCommandBuffer") long cmd, @NativeType("ExrDeepTileWrite const *") ExrDeepTileWrite write) {
        if (CHECKS) {
            check(cmd);
            ExrDeepTileWrite.validate(write.address());
        }
        return nexr_cmd_write_deep_tiles(cmd, write.address());
    }

    // --- [ exr_submit_write ] ---

    /** {@code ExrResult exr_submit_write(ExrEncoder encoder, ExrSubmitInfo const * submit_info)} */
    public static native int nexr_submit_write(long encoder, long submit_info);

    /** {@code ExrResult exr_submit_write(ExrEncoder encoder, ExrSubmitInfo const * submit_info)} */
    @NativeType("ExrResult")
    public static int exr_submit_write(@NativeType("ExrEncoder") long encoder, @NativeType("ExrSubmitInfo const *") ExrSubmitInfo submit_info) {
        if (CHECKS) {
            check(encoder);
            ExrSubmitInfo.validate(submit_info.address());
        }
        return nexr_submit_write(encoder, submit_info.address());
    }

    // --- [ exr_encoder_finalize ] ---

    /** {@code ExrResult exr_encoder_finalize(ExrEncoder encoder)} */
    public static native int nexr_encoder_finalize(long encoder);

    /** {@code ExrResult exr_encoder_finalize(ExrEncoder encoder)} */
    @NativeType("ExrResult")
    public static int exr_encoder_finalize(@NativeType("ExrEncoder") long encoder) {
        if (CHECKS) {
            check(encoder);
        }
        return nexr_encoder_finalize(encoder);
    }

    // --- [ exr_decompress_chunk ] ---

    /** {@code ExrResult exr_decompress_chunk(ExrContext ctx, ExrDecompressInfo const * info)} */
    public static native int nexr_decompress_chunk(long ctx, long info);

    /** {@code ExrResult exr_decompress_chunk(ExrContext ctx, ExrDecompressInfo const * info)} */
    @NativeType("ExrResult")
    public static int exr_decompress_chunk(@NativeType("ExrContext") long ctx, @NativeType("ExrDecompressInfo const *") ExrDecompressInfo info) {
        if (CHECKS) {
            check(ctx);
            ExrDecompressInfo.validate(info.address());
        }
        return nexr_decompress_chunk(ctx, info.address());
    }

    // --- [ exr_compress_chunk ] ---

    /** {@code ExrResult exr_compress_chunk(ExrContext ctx, ExrCompressInfo const * info)} */
    public static native int nexr_compress_chunk(long ctx, long info);

    /** {@code ExrResult exr_compress_chunk(ExrContext ctx, ExrCompressInfo const * info)} */
    @NativeType("ExrResult")
    public static int exr_compress_chunk(@NativeType("ExrContext") long ctx, @NativeType("ExrCompressInfo const *") ExrCompressInfo info) {
        if (CHECKS) {
            check(ctx);
            ExrCompressInfo.validate(info.address());
        }
        return nexr_compress_chunk(ctx, info.address());
    }

    // --- [ exr_convert_half_to_float ] ---

    /** {@code void exr_convert_half_to_float(uint16_t const * src, float * dst, size_t count)} */
    public static native void nexr_convert_half_to_float(long src, long dst, long count);

    /** {@code void exr_convert_half_to_float(uint16_t const * src, float * dst, size_t count)} */
    public static void exr_convert_half_to_float(@NativeType("uint16_t const *") ShortBuffer src, @NativeType("float *") FloatBuffer dst) {
        if (CHECKS) {
            check(dst, src.remaining());
        }
        nexr_convert_half_to_float(memAddress(src), memAddress(dst), src.remaining());
    }

    // --- [ exr_convert_float_to_half ] ---

    /** {@code void exr_convert_float_to_half(float const * src, uint16_t * dst, size_t count)} */
    public static native void nexr_convert_float_to_half(long src, long dst, long count);

    /** {@code void exr_convert_float_to_half(float const * src, uint16_t * dst, size_t count)} */
    public static void exr_convert_float_to_half(@NativeType("float const *") FloatBuffer src, @NativeType("uint16_t *") ShortBuffer dst) {
        if (CHECKS) {
            check(dst, src.remaining());
        }
        nexr_convert_float_to_half(memAddress(src), memAddress(dst), src.remaining());
    }

    // --- [ exr_interleave_rgba ] ---

    /** {@code void exr_interleave_rgba(float const * r, float const * g, float const * b, float const * a, float * rgba, size_t pixel_count)} */
    public static native void nexr_interleave_rgba(long r, long g, long b, long a, long rgba, long pixel_count);

    /** {@code void exr_interleave_rgba(float const * r, float const * g, float const * b, float const * a, float * rgba, size_t pixel_count)} */
    public static void exr_interleave_rgba(@NativeType("float const *") FloatBuffer r, @NativeType("float const *") FloatBuffer g, @NativeType("float const *") FloatBuffer b, @NativeType("float const *") FloatBuffer a, @NativeType("float *") FloatBuffer rgba) {
        int pixel_count = rgba.remaining() >> 2;
        if (CHECKS) {
            check(r, pixel_count);
            check(g, pixel_count);
            check(b, pixel_count);
            check(a, pixel_count);
        }
        nexr_interleave_rgba(memAddress(r), memAddress(g), memAddress(b), memAddress(a), memAddress(rgba), pixel_count);
    }

    // --- [ exr_deinterleave_rgba ] ---

    /** {@code void exr_deinterleave_rgba(float const * rgba, float * r, float * g, float * b, float * a, size_t pixel_count)} */
    public static native void nexr_deinterleave_rgba(long rgba, long r, long g, long b, long a, long pixel_count);

    /** {@code void exr_deinterleave_rgba(float const * rgba, float * r, float * g, float * b, float * a, size_t pixel_count)} */
    public static void exr_deinterleave_rgba(@NativeType("float const *") FloatBuffer rgba, @NativeType("float *") FloatBuffer r, @NativeType("float *") FloatBuffer g, @NativeType("float *") FloatBuffer b, @NativeType("float *") FloatBuffer a) {
        int pixel_count = rgba.remaining() >> 2;
        if (CHECKS) {
            check(r, pixel_count);
            check(g, pixel_count);
            check(b, pixel_count);
            check(a, pixel_count);
        }
        nexr_deinterleave_rgba(memAddress(rgba), memAddress(r), memAddress(g), memAddress(b), memAddress(a), pixel_count);
    }

    // --- [ exr_get_simd_capabilities ] ---

    /** {@code uint32_t exr_get_simd_capabilities(void)} */
    @NativeType("uint32_t")
    public static native int exr_get_simd_capabilities();

    // --- [ exr_get_simd_info ] ---

    /** {@code char * exr_get_simd_info(void)} */
    public static native long nexr_get_simd_info();

    /** {@code char * exr_get_simd_info(void)} */
    @NativeType("char *")
    public static @Nullable String exr_get_simd_info() {
        long __result = nexr_get_simd_info();
        return memASCIISafe(__result);
    }

    // --- [ exr_get_version ] ---

    /** {@code void exr_get_version(int * major, int * minor, int * patch)} */
    public static native void nexr_get_version(long major, long minor, long patch);

    /** {@code void exr_get_version(int * major, int * minor, int * patch)} */
    public static void exr_get_version(@NativeType("int *") IntBuffer major, @NativeType("int *") IntBuffer minor, @NativeType("int *") IntBuffer patch) {
        if (CHECKS) {
            check(major, 1);
            check(minor, 1);
            check(patch, 1);
        }
        nexr_get_version(memAddress(major), memAddress(minor), memAddress(patch));
    }

    // --- [ exr_get_version_string ] ---

    /** {@code char const * exr_get_version_string(void)} */
    public static native long nexr_get_version_string();

    /** {@code char const * exr_get_version_string(void)} */
    @NativeType("char const *")
    public static @Nullable String exr_get_version_string() {
        long __result = nexr_get_version_string();
        return memASCIISafe(__result);
    }

    public static boolean EXR_SUCCEEDED(int result) {
        return 0 <= result;
    }

    public static boolean EXR_FAILED(int result) {
        return result < 0;
    }

}