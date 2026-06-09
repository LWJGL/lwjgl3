/*
 * TinyEXR V3 - Pure C API
 *
 * A low-level, Vulkan-style C API for reading and writing OpenEXR files.
 * Designed for streaming, async I/O, and WASM compatibility.
 *
 * Features:
 * - Pure C11/C17 - no C++ required
 * - Opaque handles with explicit resource management
 * - Async fetch callbacks for streaming/network loading
 * - Command buffer pattern for batched operations
 * - No exceptions, no RTTI
 * - Thread-safe error reporting
 *
 * Copyright (c) 2024 TinyEXR authors
 * SPDX-License-Identifier: BSD-3-Clause
 */

#ifndef TINYEXR_C_H_
#define TINYEXR_C_H_

#include <stdint.h>
#include <stddef.h>

#ifdef __cplusplus
extern "C" {
#endif

/* ============================================================================
 * Version
 * ============================================================================ */

#define TINYEXR_C_API_VERSION_MAJOR 3
#define TINYEXR_C_API_VERSION_MINOR 0
#define TINYEXR_C_API_VERSION_PATCH 0
#define TINYEXR_C_API_VERSION \
    ((TINYEXR_C_API_VERSION_MAJOR << 22) | \
     (TINYEXR_C_API_VERSION_MINOR << 12) | \
     TINYEXR_C_API_VERSION_PATCH)

/* ============================================================================
 * Result Codes
 * ============================================================================ */

typedef enum ExrResult {
    /* Success */
    EXR_SUCCESS = 0,

    /* Positive values: operation in progress or warnings */
    EXR_INCOMPLETE = 1,           /* Partial result available */
    EXR_WOULD_BLOCK = 2,          /* Async operation pending, call resume */
    EXR_SUSPENDED = 3,            /* WASM Asyncify suspended */

    /* Negative values: errors */
    EXR_ERROR_INVALID_HANDLE = -1,
    EXR_ERROR_INVALID_ARGUMENT = -2,
    EXR_ERROR_OUT_OF_MEMORY = -3,
    EXR_ERROR_INVALID_MAGIC = -4,
    EXR_ERROR_INVALID_VERSION = -5,
    EXR_ERROR_INVALID_DATA = -6,
    EXR_ERROR_UNSUPPORTED_FORMAT = -7,
    EXR_ERROR_UNSUPPORTED_COMPRESSION = -8,
    EXR_ERROR_DECOMPRESSION_FAILED = -9,
    EXR_ERROR_COMPRESSION_FAILED = -10,
    EXR_ERROR_IO = -11,
    EXR_ERROR_BUFFER_TOO_SMALL = -12,
    EXR_ERROR_TIMEOUT = -13,
    EXR_ERROR_CANCELLED = -14,
    EXR_ERROR_NOT_READY = -15,
    EXR_ERROR_MISSING_ATTRIBUTE = -16,
    EXR_ERROR_FETCH_FAILED = -17,
    EXR_ERROR_OUT_OF_BOUNDS = -18,
    EXR_ERROR_ALREADY_INITIALIZED = -19,
    EXR_ERROR_NOT_INITIALIZED = -20,
    EXR_ERROR_INVALID_STATE = -21,
} ExrResult;

/* Check if result indicates success */
#define EXR_SUCCEEDED(result) ((result) >= 0)
#define EXR_FAILED(result) ((result) < 0)

/* ============================================================================
 * Opaque Handle Types
 * ============================================================================ */

typedef struct ExrContext_T* ExrContext;
typedef struct ExrDecoder_T* ExrDecoder;
typedef struct ExrEncoder_T* ExrEncoder;
typedef struct ExrImage_T* ExrImage;
typedef struct ExrPart_T* ExrPart;
typedef struct ExrCommandBuffer_T* ExrCommandBuffer;
typedef struct ExrFence_T* ExrFence;
typedef struct ExrMemoryPool_T* ExrMemoryPool;
typedef struct ExrSuspendState_T* ExrSuspendState;

/* Null handle constant */
#define EXR_NULL_HANDLE ((void*)0)

/* ============================================================================
 * Basic Types
 * ============================================================================ */

typedef struct ExrBox2i {
    int32_t min_x;
    int32_t min_y;
    int32_t max_x;
    int32_t max_y;
} ExrBox2i;

typedef struct ExrVec2i {
    int32_t x;
    int32_t y;
} ExrVec2i;

typedef struct ExrVec2f {
    float x;
    float y;
} ExrVec2f;

/* ============================================================================
 * Enumerations
 * ============================================================================ */

typedef enum ExrPixelType {
    EXR_PIXEL_UINT = 0,
    EXR_PIXEL_HALF = 1,
    EXR_PIXEL_FLOAT = 2,
} ExrPixelType;

typedef enum ExrCompression {
    EXR_COMPRESSION_NONE = 0,
    EXR_COMPRESSION_RLE = 1,
    EXR_COMPRESSION_ZIPS = 2,      /* ZIP single scanline */
    EXR_COMPRESSION_ZIP = 3,       /* ZIP 16 scanlines */
    EXR_COMPRESSION_PIZ = 4,       /* Wavelet + Huffman, 32 scanlines */
    EXR_COMPRESSION_PXR24 = 5,     /* 24-bit float, 16 scanlines */
    EXR_COMPRESSION_B44 = 6,       /* Lossy 4x4 blocks, 32 scanlines */
    EXR_COMPRESSION_B44A = 7,      /* B44 with alpha, 32 scanlines */
    EXR_COMPRESSION_DWAA = 8,      /* Lossy DCT, single scanline */
    EXR_COMPRESSION_DWAB = 9,      /* Lossy DCT, 256 scanlines */
} ExrCompression;

typedef enum ExrLineOrder {
    EXR_LINE_ORDER_INCREASING_Y = 0,
    EXR_LINE_ORDER_DECREASING_Y = 1,
    EXR_LINE_ORDER_RANDOM_Y = 2,
} ExrLineOrder;

typedef enum ExrTileLevelMode {
    EXR_TILE_ONE_LEVEL = 0,
    EXR_TILE_MIPMAP_LEVELS = 1,
    EXR_TILE_RIPMAP_LEVELS = 2,
} ExrTileLevelMode;

typedef enum ExrTileRoundingMode {
    EXR_TILE_ROUND_DOWN = 0,
    EXR_TILE_ROUND_UP = 1,
} ExrTileRoundingMode;

typedef enum ExrPartType {
    EXR_PART_SCANLINE = 0,
    EXR_PART_TILED = 1,
    EXR_PART_DEEP_SCANLINE = 2,
    EXR_PART_DEEP_TILED = 3,
} ExrPartType;

typedef enum ExrOutputLayout {
    EXR_LAYOUT_PLANAR = 0,         /* RRRR...GGGG...BBBB... */
    EXR_LAYOUT_INTERLEAVED = 1,    /* RGBARGBA... */
    EXR_LAYOUT_NATIVE = 2,         /* Keep EXR native layout */
} ExrOutputLayout;

/* ============================================================================
 * Allocator Interface
 * ============================================================================ */

typedef struct ExrAllocator {
    void* userdata;

    /* Allocate memory with specified alignment (alignment is power of 2) */
    void* (*alloc)(void* userdata, size_t size, size_t alignment);

    /* Reallocate memory */
    void* (*realloc)(void* userdata, void* ptr, size_t old_size,
                     size_t new_size, size_t alignment);

    /* Free memory */
    void (*free)(void* userdata, void* ptr, size_t size);
} ExrAllocator;

/* Get default allocator (uses malloc/free) */
const ExrAllocator* exr_get_default_allocator(void);

/* ============================================================================
 * Data Source (Async Fetch Callback API)
 * ============================================================================ */

/* Completion callback for async fetch operations */
typedef void (*ExrFetchComplete)(
    void* userdata,
    ExrResult result,
    size_t bytes_read
);

/* Fetch callback - called by TinyEXR when data is needed
 * For synchronous sources: copy data to dst, return EXR_SUCCESS
 * For async sources: start async read, return EXR_WOULD_BLOCK, call on_complete later
 */
typedef ExrResult (*ExrFetchCallback)(
    void* userdata,
    uint64_t offset,              /* Byte offset in file */
    uint64_t size,                /* Bytes requested */
    void* dst,                    /* Destination buffer (provided by TinyEXR) */
    ExrFetchComplete on_complete, /* Callback when data ready (NULL for sync) */
    void* complete_userdata       /* Passed to on_complete */
);

/* Cancel callback - called when pending fetch is no longer needed */
typedef void (*ExrFetchCancel)(
    void* userdata,
    uint64_t offset,
    uint64_t size
);

/* Data source flags */
typedef enum ExrDataSourceFlags {
    EXR_DATA_SOURCE_SEEKABLE = 0x0001,    /* Supports random access */
    EXR_DATA_SOURCE_ASYNC = 0x0002,       /* Fetches are async */
    EXR_DATA_SOURCE_STREAMING = 0x0004,   /* Forward-only stream */
    EXR_DATA_SOURCE_SIZE_KNOWN = 0x0008,  /* total_size is valid */
} ExrDataSourceFlags;

typedef struct ExrDataSource {
    void* userdata;
    ExrFetchCallback fetch;       /* Required */
    ExrFetchCancel cancel;        /* Optional (may be NULL) */
    uint64_t total_size;          /* Total file size (0 if unknown) */
    uint32_t flags;               /* ExrDataSourceFlags */
} ExrDataSource;

/* Create data source from memory buffer (synchronous, zero-copy) */
ExrResult exr_data_source_from_memory(
    const void* data,
    size_t size,
    ExrDataSource* out_source
);

/* ============================================================================
 * Data Sink (Async Write Callback API)
 * ============================================================================ */

typedef ExrResult (*ExrWriteCallback)(
    void* userdata,
    uint64_t offset,
    const void* data,
    uint64_t size,
    ExrFetchComplete on_complete,
    void* complete_userdata
);

typedef struct ExrDataSink {
    void* userdata;
    ExrWriteCallback write;       /* Required */
    ExrFetchCancel cancel;        /* Optional */
    uint32_t flags;
} ExrDataSink;

/* Create data sink to memory buffer (grows dynamically) */
ExrResult exr_data_sink_to_memory(
    ExrContext ctx,
    ExrDataSink* out_sink,
    void** out_data,              /* Output: pointer to data (valid after finalize) */
    size_t* out_size              /* Output: size of data */
);

/* ============================================================================
 * Error Handling
 * ============================================================================ */

/* Extended error information */
typedef struct ExrErrorInfo {
    ExrResult code;
    const char* message;          /* Human-readable (static or context-owned) */
    const char* context;          /* What was being processed */
    uint64_t byte_position;       /* Position in stream */
    int32_t line_number;          /* Source line (debug builds) */
    const char* source_file;      /* Source file (debug builds) */
} ExrErrorInfo;

/* Error callback (optional, for debugging) */
typedef void (*ExrErrorCallback)(
    void* userdata,
    const ExrErrorInfo* error
);

/* Get last error from context (thread-local) */
ExrResult exr_get_last_error(ExrContext ctx, ExrErrorInfo* out_info);

/* Get number of accumulated errors */
uint32_t exr_get_error_count(ExrContext ctx);

/* Get error at index */
ExrResult exr_get_error_at(ExrContext ctx, uint32_t index, ExrErrorInfo* out_info);

/* Clear all errors */
void exr_clear_errors(ExrContext ctx);

/* Get human-readable error string */
const char* exr_result_to_string(ExrResult result);

/* ============================================================================
 * Context Creation
 * ============================================================================ */

typedef enum ExrContextFlags {
    EXR_CONTEXT_ENABLE_VALIDATION = 0x0001,  /* Extra validation checks */
    EXR_CONTEXT_ENABLE_DEBUG_INFO = 0x0002,  /* Store debug info in errors */
    EXR_CONTEXT_SINGLE_THREADED = 0x0004,    /* No internal threading */
    EXR_CONTEXT_SIMD_DISABLED = 0x0008,      /* Disable SIMD optimizations */
} ExrContextFlags;

typedef struct ExrContextCreateInfo {
    uint32_t api_version;                    /* TINYEXR_C_API_VERSION */
    const ExrAllocator* allocator;           /* NULL for default */
    ExrErrorCallback error_callback;         /* Optional */
    void* error_userdata;
    uint32_t flags;                          /* ExrContextFlags */
    uint32_t max_threads;                    /* 0 = auto (hardware concurrency) */
} ExrContextCreateInfo;

ExrResult exr_context_create(
    const ExrContextCreateInfo* create_info,
    ExrContext* out_ctx
);

void exr_context_destroy(ExrContext ctx);

/* Reference counting for shared contexts */
void exr_context_add_ref(ExrContext ctx);
void exr_context_release(ExrContext ctx);

/* ============================================================================
 * Memory Pool
 * ============================================================================ */

typedef enum ExrMemoryPoolFlags {
    EXR_MEMORY_POOL_THREAD_LOCAL = 0x0001,   /* Thread-local pool */
    EXR_MEMORY_POOL_PERSISTENT = 0x0002,     /* Don't auto-shrink */
} ExrMemoryPoolFlags;

typedef struct ExrMemoryPoolCreateInfo {
    size_t initial_size;          /* Initial pool size in bytes */
    size_t max_size;              /* Maximum size (0 = unlimited) */
    uint32_t flags;               /* ExrMemoryPoolFlags */
} ExrMemoryPoolCreateInfo;

ExrResult exr_memory_pool_create(
    ExrContext ctx,
    const ExrMemoryPoolCreateInfo* create_info,
    ExrMemoryPool* out_pool
);

void exr_memory_pool_destroy(ExrMemoryPool pool);
void exr_memory_pool_reset(ExrMemoryPool pool);
size_t exr_memory_pool_get_used(ExrMemoryPool pool);

/* ============================================================================
 * Decoder (Reader)
 * ============================================================================ */

typedef enum ExrDecoderFlags {
    EXR_DECODER_LAZY_LOAD = 0x0001,          /* Don't prefetch offset table */
    EXR_DECODER_VALIDATE_CHUNKS = 0x0002,    /* Validate chunk boundaries */
    EXR_DECODER_ALLOW_TRUNCATED = 0x0004,    /* Accept truncated files */
} ExrDecoderFlags;

typedef struct ExrDecoderCreateInfo {
    ExrDataSource source;         /* Data source callbacks */
    ExrMemoryPool scratch_pool;   /* Optional scratch memory (may be NULL) */
    uint32_t flags;               /* ExrDecoderFlags */
} ExrDecoderCreateInfo;

ExrResult exr_decoder_create(
    ExrContext ctx,
    const ExrDecoderCreateInfo* create_info,
    ExrDecoder* out_decoder
);

void exr_decoder_destroy(ExrDecoder decoder);

/* Parse EXR header (may suspend for async fetch) */
ExrResult exr_decoder_parse_header(ExrDecoder decoder, ExrImage* out_image);

/* Wait for all pending operations */
ExrResult exr_decoder_wait_idle(ExrDecoder decoder);

/* ============================================================================
 * Async/Suspend API
 *
 * These functions support asynchronous operation for environments where
 * blocking I/O is not available (e.g., WebAssembly, JavaScript, async runtimes).
 *
 * When a decoder operation returns EXR_WOULD_BLOCK:
 * 1. Call exr_decoder_get_suspend_state() to get the suspend state
 * 2. Call exr_suspend_get_pending_fetch() to get fetch details
 * 3. Perform the async fetch externally
 * 4. Call exr_suspend_complete_fetch() with the fetched data
 * 5. Call exr_decoder_resume() to continue processing
 * 6. Repeat until the operation completes or errors
 * ============================================================================ */

/* Pending fetch information for async operations */
typedef struct ExrPendingFetch {
    uint64_t offset;          /* File offset to fetch from */
    uint64_t size;            /* Number of bytes to fetch */
    void* destination;        /* Where to write fetched data (may be NULL) */
} ExrPendingFetch;

/* Get the current suspend state from a decoder that returned EXR_WOULD_BLOCK */
ExrResult exr_decoder_get_suspend_state(ExrDecoder decoder, ExrSuspendState* out_state);

/* Get information about the pending fetch that caused suspension */
ExrResult exr_suspend_get_pending_fetch(ExrSuspendState state, ExrPendingFetch* out_fetch);

/* Complete a pending fetch operation with externally fetched data */
ExrResult exr_suspend_complete_fetch(ExrSuspendState state, const void* data, size_t size);

/* Resume a suspended decoder operation */
ExrResult exr_decoder_resume(ExrDecoder decoder);

/* ============================================================================
 * Image (Parsed Header + Offset Table)
 * ============================================================================ */

typedef enum ExrImageFlags {
    EXR_IMAGE_TILED = 0x0001,
    EXR_IMAGE_MULTIPART = 0x0002,
    EXR_IMAGE_DEEP = 0x0004,
    EXR_IMAGE_LONG_NAMES = 0x0008,
} ExrImageFlags;

typedef struct ExrImageInfo {
    int32_t width;
    int32_t height;
    ExrBox2i data_window;
    ExrBox2i display_window;
    uint32_t num_channels;
    uint32_t num_parts;
    uint32_t compression;         /* ExrCompression */
    uint32_t flags;               /* ExrImageFlags */
    uint32_t tile_size_x;         /* 0 if scanline */
    uint32_t tile_size_y;
    uint32_t num_x_levels;        /* Mipmap/Ripmap levels */
    uint32_t num_y_levels;
    float pixel_aspect_ratio;
    ExrVec2f screen_window_center;
    float screen_window_width;
} ExrImageInfo;

ExrResult exr_image_get_info(ExrImage image, ExrImageInfo* out_info);
void exr_image_destroy(ExrImage image);

/* ============================================================================
 * Channel Information
 * ============================================================================ */

typedef struct ExrChannelInfo {
    const char* name;             /* Channel name (valid for image lifetime) */
    uint32_t pixel_type;          /* ExrPixelType */
    int32_t x_sampling;
    int32_t y_sampling;
    uint8_t p_linear;             /* Perceptually linear */
    uint8_t reserved[3];
} ExrChannelInfo;

ExrResult exr_image_get_channel_count(ExrImage image, uint32_t* out_count);
ExrResult exr_image_get_channel(ExrImage image, uint32_t index,
                                 ExrChannelInfo* out_info);
ExrResult exr_image_find_channel(ExrImage image, const char* name,
                                  uint32_t* out_index);

/* ============================================================================
 * Part (Multipart Support)
 * ============================================================================ */

typedef struct ExrPartInfo {
    const char* name;             /* Part name (may be NULL) */
    const char* type_string;      /* "scanlineimage", "tiledimage", etc. */
    uint32_t part_type;           /* ExrPartType */
    int32_t width;
    int32_t height;
    uint32_t num_channels;
    uint32_t compression;
    uint32_t flags;
} ExrPartInfo;

ExrResult exr_image_get_part_count(ExrImage image, uint32_t* out_count);
ExrResult exr_image_get_part(ExrImage image, uint32_t index, ExrPart* out_part);
ExrResult exr_image_find_part_by_name(ExrImage image, const char* name,
                                       ExrPart* out_part);

/* Free a part handle (the decoder destroys all parts when destroyed) */
void exr_part_destroy(ExrPart part);

ExrResult exr_part_get_info(ExrPart part, ExrPartInfo* out_info);
ExrResult exr_part_get_channel(ExrPart part, uint32_t index,
                                ExrChannelInfo* out_info);

/* ============================================================================
 * Attribute Access
 * ============================================================================ */

typedef enum ExrAttributeType {
    EXR_ATTR_UNKNOWN = 0,
    EXR_ATTR_INT,
    EXR_ATTR_FLOAT,
    EXR_ATTR_DOUBLE,
    EXR_ATTR_STRING,
    EXR_ATTR_BOX2I,
    EXR_ATTR_BOX2F,
    EXR_ATTR_V2I,
    EXR_ATTR_V2F,
    EXR_ATTR_V3I,
    EXR_ATTR_V3F,
    EXR_ATTR_M33F,
    EXR_ATTR_M44F,
    EXR_ATTR_CHLIST,
    EXR_ATTR_COMPRESSION,
    EXR_ATTR_LINEORDER,
    EXR_ATTR_TILEDESC,
    EXR_ATTR_PREVIEW,
    EXR_ATTR_RATIONAL,
    EXR_ATTR_KEYCODE,
    EXR_ATTR_TIMECODE,
    EXR_ATTR_CHROMATICITIES,
    EXR_ATTR_ENVMAP,
    EXR_ATTR_DEEPIMAGETYPE,
    EXR_ATTR_OPAQUE,              /* Raw bytes */
} ExrAttributeType;

typedef struct ExrAttribute {
    const char* name;
    const char* type_name;        /* Type string from EXR */
    ExrAttributeType type;        /* Parsed type */
    const void* value;            /* Pointer to value data */
    uint32_t size;                /* Size in bytes */
} ExrAttribute;

ExrResult exr_part_get_attribute_count(ExrPart part, uint32_t* out_count);
ExrResult exr_part_get_attribute(ExrPart part, const char* name,
                                  ExrAttribute* out_attr);
ExrResult exr_part_get_attribute_at(ExrPart part, uint32_t index,
                                     ExrAttribute* out_attr);
int exr_part_has_attribute(ExrPart part, const char* name);

/* ============================================================================
 * Chunk/Offset Table Access
 * ============================================================================ */

typedef struct ExrChunkInfo {
    uint64_t file_offset;         /* Byte offset in file */
    uint32_t compressed_size;     /* Size of compressed data */
    uint32_t uncompressed_size;   /* Expected uncompressed size */
    int32_t y_start;              /* Starting scanline (scanline mode) */
    int32_t tile_x;               /* Tile X coordinate */
    int32_t tile_y;               /* Tile Y coordinate */
    int32_t level_x;              /* Level X (mipmap/ripmap) */
    int32_t level_y;              /* Level Y (mipmap/ripmap) */
    uint32_t chunk_type;          /* ExrPartType */
} ExrChunkInfo;

ExrResult exr_part_get_chunk_count(ExrPart part, uint32_t* out_count);
ExrResult exr_part_get_chunk_info(ExrPart part, uint32_t chunk_index,
                                   ExrChunkInfo* out_info);

/* Get chunk count for specific tile level */
ExrResult exr_part_get_tile_count(ExrPart part, int32_t level_x, int32_t level_y,
                                   uint32_t* out_x_tiles, uint32_t* out_y_tiles);

/* Get number of scanline blocks */
ExrResult exr_part_get_scanline_block_count(ExrPart part, uint32_t* out_count);

/* ============================================================================
 * Command Buffer
 * ============================================================================ */

typedef enum ExrCommandBufferFlags {
    EXR_CMD_ONE_TIME_SUBMIT = 0x0001,   /* Reset after submit */
    EXR_CMD_SIMULTANEOUS_USE = 0x0002,  /* Can be resubmitted */
} ExrCommandBufferFlags;

typedef struct ExrCommandBufferCreateInfo {
    ExrDecoder decoder;           /* For read commands */
    ExrEncoder encoder;           /* For write commands (may be NULL) */
    uint32_t max_commands;        /* 0 = dynamic sizing */
    uint32_t flags;               /* ExrCommandBufferFlags */
} ExrCommandBufferCreateInfo;

ExrResult exr_command_buffer_create(
    ExrContext ctx,
    const ExrCommandBufferCreateInfo* create_info,
    ExrCommandBuffer* out_cmd
);

void exr_command_buffer_destroy(ExrCommandBuffer cmd);
ExrResult exr_command_buffer_reset(ExrCommandBuffer cmd);
ExrResult exr_command_buffer_begin(ExrCommandBuffer cmd);
ExrResult exr_command_buffer_end(ExrCommandBuffer cmd);

/* ============================================================================
 * Buffer Descriptor
 * ============================================================================ */

typedef struct ExrBuffer {
    void* data;
    size_t size;
    size_t offset;                /* Offset for sub-buffer */
} ExrBuffer;

/* ============================================================================
 * Tile Request Commands
 * ============================================================================ */

typedef struct ExrTileRequest {
    ExrPart part;
    int32_t tile_x;
    int32_t tile_y;
    int32_t level_x;              /* Mipmap level X */
    int32_t level_y;              /* Mipmap level Y */
    ExrBuffer output;             /* User-provided output buffer */
    uint32_t channels_mask;       /* Bitmask of channels (0 = all) */
    uint32_t output_pixel_type;   /* ExrPixelType for conversion */
    uint32_t output_layout;       /* ExrOutputLayout */
} ExrTileRequest;

ExrResult exr_cmd_request_tile(ExrCommandBuffer cmd, const ExrTileRequest* request);
ExrResult exr_cmd_request_tiles(ExrCommandBuffer cmd, uint32_t count,
                                 const ExrTileRequest* requests);

/* ============================================================================
 * Scanline Request Commands
 * ============================================================================ */

typedef struct ExrScanlineRequest {
    ExrPart part;
    int32_t y_start;              /* Starting scanline (data window coords) */
    int32_t num_lines;            /* Number of scanlines (0 = full block) */
    ExrBuffer output;
    uint32_t channels_mask;
    uint32_t output_pixel_type;
    uint32_t output_layout;
} ExrScanlineRequest;

ExrResult exr_cmd_request_scanlines(ExrCommandBuffer cmd,
                                     const ExrScanlineRequest* request);
ExrResult exr_cmd_request_scanline_blocks(ExrCommandBuffer cmd, uint32_t count,
                                           const ExrScanlineRequest* requests);

/* ============================================================================
 * Deep Image Support
 * ============================================================================ */

/* Deep sample information for a scanline block */
typedef struct ExrDeepSampleInfo {
    int32_t y_start;              /* First scanline in block */
    int32_t num_lines;            /* Number of scanlines */
    int32_t width;                /* Width of scanlines */
    uint64_t total_samples;       /* Total sample count across all pixels */
    uint32_t* sample_counts;      /* [width * num_lines] sample count per pixel */
    uint64_t* sample_offsets;     /* [width * num_lines + 1] cumulative offsets */
} ExrDeepSampleInfo;

/* Request for deep scanline data */
typedef struct ExrDeepScanlineRequest {
    ExrPart part;
    int32_t y_start;              /* Starting scanline */
    int32_t num_lines;            /* Number of scanlines (0 = full block) */
    ExrDeepSampleInfo* sample_info; /* Output: filled with sample counts */
    ExrBuffer output;             /* Output: sample data (sized after sample_info) */
    uint32_t channels_mask;       /* Which channels to load */
    uint32_t output_pixel_type;   /* Output pixel format */
} ExrDeepScanlineRequest;

/* Query sample counts for a deep scanline block (does not load pixel data) */
ExrResult exr_part_get_deep_sample_counts(
    ExrDecoder decoder,
    ExrPart part,
    int32_t y_start,
    int32_t num_lines,
    ExrDeepSampleInfo* out_info
);

/* Free sample info allocated by exr_part_get_deep_sample_counts */
void exr_deep_sample_info_free(ExrContext ctx, ExrDeepSampleInfo* info);

/* Request deep scanline data (must call get_deep_sample_counts first) */
ExrResult exr_cmd_request_deep_scanlines(ExrCommandBuffer cmd,
                                          const ExrDeepScanlineRequest* request);

/* Deep sample information for a tile */
typedef struct ExrDeepTileSampleInfo {
    int32_t tile_x;               /* Tile X coordinate */
    int32_t tile_y;               /* Tile Y coordinate */
    int32_t level_x;              /* Level X (mipmap/ripmap) */
    int32_t level_y;              /* Level Y (mipmap/ripmap) */
    int32_t width;                /* Width of tile in pixels */
    int32_t height;               /* Height of tile in pixels */
    uint64_t total_samples;       /* Total sample count across all pixels */
    uint32_t* sample_counts;      /* [width * height] sample count per pixel */
    uint64_t* sample_offsets;     /* [width * height + 1] cumulative offsets */
} ExrDeepTileSampleInfo;

/* Request for deep tile data */
typedef struct ExrDeepTileRequest {
    ExrPart part;
    int32_t tile_x;               /* Tile X coordinate */
    int32_t tile_y;               /* Tile Y coordinate */
    int32_t level_x;              /* Level X (mipmap/ripmap) */
    int32_t level_y;              /* Level Y (mipmap/ripmap) */
    ExrDeepTileSampleInfo* sample_info; /* Output: filled with sample counts */
    ExrBuffer output;             /* Output: sample data (sized after sample_info) */
    uint32_t channels_mask;       /* Which channels to load */
    uint32_t output_pixel_type;   /* Output pixel format */
} ExrDeepTileRequest;

/* Query sample counts for a deep tile (does not load pixel data) */
ExrResult exr_part_get_deep_tile_sample_counts(
    ExrDecoder decoder,
    ExrPart part,
    int32_t tile_x,
    int32_t tile_y,
    int32_t level_x,
    int32_t level_y,
    ExrDeepTileSampleInfo* out_info
);

/* Free deep tile sample info */
void exr_deep_tile_sample_info_free(ExrContext ctx, ExrDeepTileSampleInfo* info);

/* Request deep tile data (must call get_deep_tile_sample_counts first) */
ExrResult exr_cmd_request_deep_tiles(ExrCommandBuffer cmd,
                                      const ExrDeepTileRequest* request);
ExrResult exr_cmd_request_deep_tile_batch(ExrCommandBuffer cmd, uint32_t count,
                                           const ExrDeepTileRequest* requests);

/* ============================================================================
 * Full Image Request (Convenience)
 * ============================================================================ */

typedef struct ExrFullImageRequest {
    ExrPart part;
    ExrBuffer output;             /* Must be large enough for full image */
    uint32_t channels_mask;
    uint32_t output_pixel_type;
    uint32_t output_layout;
    int32_t target_level;         /* Mipmap level to load */
} ExrFullImageRequest;

ExrResult exr_cmd_request_full_image(ExrCommandBuffer cmd,
                                      const ExrFullImageRequest* request);

/* ============================================================================
 * Command Submission
 * ============================================================================ */

typedef void (*ExrSubmitComplete)(void* userdata, ExrResult result);

typedef struct ExrSubmitInfo {
    uint32_t command_buffer_count;
    const ExrCommandBuffer* command_buffers;
    ExrFence signal_fence;        /* Fence to signal on completion (may be NULL) */
    ExrSubmitComplete on_complete; /* Completion callback (may be NULL) */
    void* userdata;
} ExrSubmitInfo;

ExrResult exr_submit(ExrDecoder decoder, const ExrSubmitInfo* submit_info);

/* ============================================================================
 * Fence (Synchronization)
 * ============================================================================ */

#define EXR_TIMEOUT_INFINITE UINT64_MAX
#define EXR_TIMEOUT_NONE 0

typedef enum ExrFenceFlags {
    EXR_FENCE_SIGNALED = 0x0001,  /* Create in signaled state */
} ExrFenceFlags;

typedef struct ExrFenceCreateInfo {
    uint32_t flags;               /* ExrFenceFlags */
} ExrFenceCreateInfo;

ExrResult exr_fence_create(ExrContext ctx, const ExrFenceCreateInfo* create_info,
                            ExrFence* out_fence);
void exr_fence_destroy(ExrFence fence);

/* Wait for fence to be signaled */
ExrResult exr_fence_wait(ExrFence fence, uint64_t timeout_ns);

/* Check if fence is signaled (non-blocking) */
ExrResult exr_fence_get_status(ExrFence fence);

/* Reset fence to unsignaled */
ExrResult exr_fence_reset(ExrFence fence);

/* ============================================================================
 * WASM Asyncify Support
 * ============================================================================ */

/* Check if result indicates suspension */
#define EXR_IS_SUSPENDED(result) ((result) == EXR_SUSPENDED)

/* Get suspend state (call when EXR_SUSPENDED is returned) */
ExrResult exr_get_suspend_state(ExrDecoder decoder, ExrSuspendState* out_state);

/* Resume suspended operation */
ExrResult exr_resume(ExrDecoder decoder, ExrSuspendState state);

/* Free suspend state */
void exr_suspend_state_destroy(ExrSuspendState state);

/* ============================================================================
 * Progress Reporting
 * ============================================================================ */

typedef struct ExrProgressInfo {
    int32_t percent_complete;     /* 0-100 */
    int32_t current_block;
    int32_t total_blocks;
    uint64_t bytes_processed;
    uint64_t bytes_total;
} ExrProgressInfo;

typedef void (*ExrProgressCallback)(void* userdata, const ExrProgressInfo* info);

ExrResult exr_decoder_set_progress_callback(ExrDecoder decoder,
                                             ExrProgressCallback callback,
                                             void* userdata,
                                             int32_t interval_ms);

/* ============================================================================
 * Encoder (Writer)
 * ============================================================================ */

typedef enum ExrEncoderFlags {
    EXR_ENCODER_PARALLEL = 0x0001,    /* Use parallel compression */
} ExrEncoderFlags;

typedef struct ExrEncoderCreateInfo {
    ExrDataSink sink;
    ExrMemoryPool scratch_pool;       /* Optional */
    uint32_t flags;                   /* ExrEncoderFlags */
} ExrEncoderCreateInfo;

ExrResult exr_encoder_create(
    ExrContext ctx,
    const ExrEncoderCreateInfo* create_info,
    ExrEncoder* out_encoder
);

void exr_encoder_destroy(ExrEncoder encoder);

/* ============================================================================
 * Write Image Configuration
 * ============================================================================ */

typedef enum ExrWriteImageFlags {
    EXR_WRITE_TILED = 0x0001,
    EXR_WRITE_MULTIPART = 0x0002,
    EXR_WRITE_MIPMAP = 0x0004,
    EXR_WRITE_RIPMAP = 0x0008,
    EXR_WRITE_DEEP = 0x0010,
} ExrWriteImageFlags;

typedef struct ExrWriteChannelInfo {
    const char* name;
    uint32_t pixel_type;          /* ExrPixelType */
    int32_t x_sampling;
    int32_t y_sampling;
    uint8_t p_linear;
} ExrWriteChannelInfo;

typedef struct ExrWriteImageCreateInfo {
    int32_t width;
    int32_t height;
    uint32_t num_channels;
    const ExrWriteChannelInfo* channels;
    uint32_t compression;         /* ExrCompression */
    int32_t compression_level;    /* 1-9 for ZIP */
    uint32_t flags;               /* ExrWriteImageFlags */
    int32_t tile_size_x;          /* 0 for scanline */
    int32_t tile_size_y;
    const ExrBox2i* data_window;  /* NULL for default (0,0,w-1,h-1) */
    const ExrBox2i* display_window; /* NULL for same as data_window */
    const char* part_name;        /* Part name (required for multipart) */
} ExrWriteImageCreateInfo;

typedef struct ExrWriteImage_T* ExrWriteImage;

ExrResult exr_write_image_create(ExrEncoder encoder,
                                  const ExrWriteImageCreateInfo* create_info,
                                  ExrWriteImage* out_image);
void exr_write_image_destroy(ExrWriteImage image);

/* Set custom attribute */
ExrResult exr_write_image_set_attribute(ExrWriteImage image, const char* name,
                                         const char* type, const void* value,
                                         uint32_t size);

/* Convenience attribute setters */
ExrResult exr_write_image_set_int_attribute(ExrWriteImage image, const char* name,
                                             int32_t value);
ExrResult exr_write_image_set_float_attribute(ExrWriteImage image, const char* name,
                                               float value);
ExrResult exr_write_image_set_string_attribute(ExrWriteImage image, const char* name,
                                                const char* value);

/* ============================================================================
 * Write Commands
 * ============================================================================ */

typedef struct ExrTileWrite {
    ExrWriteImage image;
    int32_t tile_x;
    int32_t tile_y;
    int32_t level_x;
    int32_t level_y;
    ExrBuffer input;
    uint32_t input_layout;        /* ExrOutputLayout */
    uint32_t input_pixel_type;    /* ExrPixelType */
} ExrTileWrite;

ExrResult exr_cmd_write_tile(ExrCommandBuffer cmd, const ExrTileWrite* write);
ExrResult exr_cmd_write_tiles(ExrCommandBuffer cmd, uint32_t count,
                               const ExrTileWrite* writes);

typedef struct ExrScanlineWrite {
    ExrWriteImage image;
    int32_t y_start;
    int32_t num_lines;
    ExrBuffer input;
    uint32_t input_layout;
    uint32_t input_pixel_type;
} ExrScanlineWrite;

ExrResult exr_cmd_write_scanlines(ExrCommandBuffer cmd,
                                   const ExrScanlineWrite* write);

/* Deep scanline writing */
typedef struct ExrDeepScanlineWrite {
    ExrWriteImage image;
    int32_t y_start;                  /* Starting scanline */
    int32_t num_lines;                /* Number of scanlines (usually 1) */
    int32_t width;                    /* Width of scanlines */
    const uint32_t* sample_counts;    /* [width * num_lines] samples per pixel */
    uint64_t total_samples;           /* Sum of all sample_counts */
    ExrBuffer input;                  /* Sample data (interleaved or planar) */
    uint32_t input_layout;            /* EXR_LAYOUT_INTERLEAVED or PLANAR */
    uint32_t input_pixel_type;        /* Pixel type of input data */
} ExrDeepScanlineWrite;

ExrResult exr_cmd_write_deep_scanlines(ExrCommandBuffer cmd,
                                        const ExrDeepScanlineWrite* write);

/* Deep tile write request */
typedef struct ExrDeepTileWrite {
    ExrWriteImage image;
    int32_t tile_x;                   /* Tile X coordinate */
    int32_t tile_y;                   /* Tile Y coordinate */
    int32_t level_x;                  /* Level X (mipmap/ripmap) */
    int32_t level_y;                  /* Level Y (mipmap/ripmap) */
    int32_t width;                    /* Width of tile in pixels */
    int32_t height;                   /* Height of tile in pixels */
    const uint32_t* sample_counts;    /* [width * height] samples per pixel */
    uint64_t total_samples;           /* Sum of all sample_counts */
    ExrBuffer input;                  /* Sample data (interleaved or planar) */
    uint32_t input_layout;            /* EXR_LAYOUT_INTERLEAVED or PLANAR */
    uint32_t input_pixel_type;        /* Pixel type of input data */
} ExrDeepTileWrite;

ExrResult exr_cmd_write_deep_tiles(ExrCommandBuffer cmd,
                                    const ExrDeepTileWrite* write);

/* Submit write commands */
ExrResult exr_submit_write(ExrEncoder encoder, const ExrSubmitInfo* submit_info);

/* Finalize encoding (write offset table, flush) */
ExrResult exr_encoder_finalize(ExrEncoder encoder);

/* ============================================================================
 * Direct Decompression (for Custom Pipelines)
 * ============================================================================ */

typedef struct ExrDecompressInfo {
    const void* src;
    size_t src_size;
    void* dst;
    size_t dst_capacity;
    size_t* out_size;             /* Actual decompressed size */
    uint32_t compression;         /* ExrCompression */
    int32_t width;                /* Pixel width */
    int32_t num_lines;            /* Number of scanlines */
    uint32_t num_channels;
    const ExrChannelInfo* channels;
    ExrMemoryPool scratch;        /* Optional scratch memory */
} ExrDecompressInfo;

ExrResult exr_decompress_chunk(ExrContext ctx, const ExrDecompressInfo* info);

typedef struct ExrCompressInfo {
    const void* src;
    size_t src_size;
    void* dst;
    size_t dst_capacity;
    size_t* out_size;             /* Actual compressed size */
    uint32_t compression;
    int32_t compression_level;
    int32_t width;
    int32_t num_lines;
    uint32_t num_channels;
    const ExrChannelInfo* channels;
    ExrMemoryPool scratch;
} ExrCompressInfo;

ExrResult exr_compress_chunk(ExrContext ctx, const ExrCompressInfo* info);

/* ============================================================================
 * Pixel Conversion Utilities
 * ============================================================================ */

/* Convert half-float to float */
void exr_convert_half_to_float(const uint16_t* src, float* dst, size_t count);

/* Convert float to half-float */
void exr_convert_float_to_half(const float* src, uint16_t* dst, size_t count);

/* Interleave planar channels to RGBA */
void exr_interleave_rgba(const float* r, const float* g, const float* b,
                          const float* a, float* rgba, size_t pixel_count);

/* Deinterleave RGBA to planar channels */
void exr_deinterleave_rgba(const float* rgba, float* r, float* g, float* b,
                            float* a, size_t pixel_count);

/* ============================================================================
 * SIMD Information
 * ============================================================================ */

typedef enum ExrSIMDCapability {
    EXR_SIMD_NONE = 0,
    EXR_SIMD_SSE2 = 0x0001,
    EXR_SIMD_SSE4_1 = 0x0002,
    EXR_SIMD_AVX = 0x0004,
    EXR_SIMD_AVX2 = 0x0008,
    EXR_SIMD_AVX512 = 0x0010,
    EXR_SIMD_NEON = 0x0020,
    EXR_SIMD_BMI1 = 0x0040,
    EXR_SIMD_BMI2 = 0x0080,
} ExrSIMDCapability;

/* Get available SIMD capabilities */
uint32_t exr_get_simd_capabilities(void);

/* Get SIMD capability string */
const char* exr_get_simd_info(void);

/* ============================================================================
 * Version Information
 * ============================================================================ */

/* Get library version */
void exr_get_version(int* major, int* minor, int* patch);

/* Get version string */
const char* exr_get_version_string(void);

#ifdef __cplusplus
}
#endif

#endif /* TINYEXR_C_H_ */
