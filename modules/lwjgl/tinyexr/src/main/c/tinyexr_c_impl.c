/* Feature test macros for POSIX functions (must be before any includes) */
#if !defined(_WIN32)
#define _POSIX_C_SOURCE 200112L
#endif

/*
 * TinyEXR V3 - Pure C API Implementation
 *
 * Copyright (c) 2024 TinyEXR authors
 * SPDX-License-Identifier: BSD-3-Clause
 */

#include "tinyexr_c.h"

#include <stdlib.h>
#include <string.h>
#include <stdarg.h>
#include <stdio.h>
#include <stdbool.h>

/* alloca for stack allocation */
#if defined(_WIN32)
#include <malloc.h>
#elif defined(__EMSCRIPTEN__)
#include <alloca.h>
#elif defined(__GNUC__) || defined(__clang__)
#define alloca(size) __builtin_alloca(size)
#else
#include <alloca.h>
#endif

/* C11 atomics for C, std::atomic for C++ */
#ifdef __cplusplus
#include <atomic>
#define ATOMIC_INT std::atomic<int>
#define ATOMIC_INIT(var, val) var = (val)
#define ATOMIC_LOAD(var) var.load()
#define ATOMIC_STORE(var, val) var.store(val)
#define ATOMIC_FETCH_ADD(var, val) var.fetch_add(val)
#define ATOMIC_FETCH_SUB(var, val) var.fetch_sub(val)
#elif defined(_MSC_VER)
/* MSVC C mode doesn't support C11 atomics, use Windows Interlocked functions */
#define ATOMIC_INT volatile long
#define ATOMIC_INIT(var, val) (var) = (val)
#define ATOMIC_LOAD(var) InterlockedCompareExchange(&(var), 0, 0)
#define ATOMIC_STORE(var, val) InterlockedExchange(&(var), (val))
#define ATOMIC_FETCH_ADD(var, val) InterlockedExchangeAdd(&(var), (val))
#define ATOMIC_FETCH_SUB(var, val) InterlockedExchangeAdd(&(var), -(val))
#else
#include <stdatomic.h>
#define ATOMIC_INT atomic_int
#define ATOMIC_INIT(var, val) atomic_init(&(var), (val))
#define ATOMIC_LOAD(var) atomic_load(&(var))
#define ATOMIC_STORE(var, val) atomic_store(&(var), (val))
#define ATOMIC_FETCH_ADD(var, val) atomic_fetch_add(&(var), (val))
#define ATOMIC_FETCH_SUB(var, val) atomic_fetch_sub(&(var), (val))
#endif

/* Platform-specific includes */
#if defined(_WIN32)
#include <windows.h>
#else
#include <pthread.h>
#include <time.h>
#include <errno.h>
#endif

/* CPUID for x86 */
#if (defined(__x86_64__) || defined(_M_X64) || defined(__i386__) || defined(_M_IX86)) && \
    (defined(__GNUC__) || defined(__clang__))
#include <cpuid.h>
#endif

/* SIMD acceleration (optional) */
#ifdef TINYEXR_V3_USE_SIMD
#include "tinyexr_simd_c.h"
#endif

/* Thread-local storage */
#if defined(_MSC_VER)
#define EXR_THREAD_LOCAL __declspec(thread)
#elif defined(__GNUC__) || defined(__clang__)
#define EXR_THREAD_LOCAL __thread
#else
#define EXR_THREAD_LOCAL _Thread_local
#endif

/* Alignment macros */
#define EXR_ALIGN(x, a) (((x) + (a) - 1) & ~((a) - 1))
#define EXR_DEFAULT_ALIGNMENT 16

/* Maximum errors to store per context */
#define EXR_MAX_ERRORS 16

/* Maximum error message length */
#define EXR_MAX_ERROR_MESSAGE 256

/* ============================================================================
 * Version Information
 * ============================================================================ */

static const char* g_version_string = "TinyEXR 3.0.0";

void exr_get_version(int* major, int* minor, int* patch) {
    if (major) *major = TINYEXR_C_API_VERSION_MAJOR;
    if (minor) *minor = TINYEXR_C_API_VERSION_MINOR;
    if (patch) *patch = TINYEXR_C_API_VERSION_PATCH;
}

const char* exr_get_version_string(void) {
    return g_version_string;
}

/* ============================================================================
 * Result to String
 * ============================================================================ */

static const char* g_result_strings[] = {
    "Success",                          /* EXR_SUCCESS = 0 */
    "Incomplete",                       /* EXR_INCOMPLETE = 1 */
    "Would block",                      /* EXR_WOULD_BLOCK = 2 */
    "Suspended",                        /* EXR_SUSPENDED = 3 */
};

static const char* g_error_strings[] = {
    "Invalid handle",                   /* EXR_ERROR_INVALID_HANDLE = -1 */
    "Invalid argument",                 /* EXR_ERROR_INVALID_ARGUMENT = -2 */
    "Out of memory",                    /* EXR_ERROR_OUT_OF_MEMORY = -3 */
    "Invalid magic number",             /* EXR_ERROR_INVALID_MAGIC = -4 */
    "Invalid version",                  /* EXR_ERROR_INVALID_VERSION = -5 */
    "Invalid data",                     /* EXR_ERROR_INVALID_DATA = -6 */
    "Unsupported format",               /* EXR_ERROR_UNSUPPORTED_FORMAT = -7 */
    "Unsupported compression",          /* EXR_ERROR_UNSUPPORTED_COMPRESSION = -8 */
    "Decompression failed",             /* EXR_ERROR_DECOMPRESSION_FAILED = -9 */
    "Compression failed",               /* EXR_ERROR_COMPRESSION_FAILED = -10 */
    "I/O error",                        /* EXR_ERROR_IO = -11 */
    "Buffer too small",                 /* EXR_ERROR_BUFFER_TOO_SMALL = -12 */
    "Timeout",                          /* EXR_ERROR_TIMEOUT = -13 */
    "Cancelled",                        /* EXR_ERROR_CANCELLED = -14 */
    "Not ready",                        /* EXR_ERROR_NOT_READY = -15 */
    "Missing attribute",                /* EXR_ERROR_MISSING_ATTRIBUTE = -16 */
    "Fetch failed",                     /* EXR_ERROR_FETCH_FAILED = -17 */
    "Out of bounds",                    /* EXR_ERROR_OUT_OF_BOUNDS = -18 */
    "Already initialized",              /* EXR_ERROR_ALREADY_INITIALIZED = -19 */
    "Not initialized",                  /* EXR_ERROR_NOT_INITIALIZED = -20 */
    "Invalid state",                    /* EXR_ERROR_INVALID_STATE = -21 */
};

const char* exr_result_to_string(ExrResult result) {
    if (result >= 0 && result < (int)(sizeof(g_result_strings) / sizeof(g_result_strings[0]))) {
        return g_result_strings[result];
    }
    if (result < 0) {
        int index = -result - 1;
        if (index < (int)(sizeof(g_error_strings) / sizeof(g_error_strings[0]))) {
            return g_error_strings[index];
        }
    }
    return "Unknown error";
}

/* ============================================================================
 * Default Allocator
 * ============================================================================ */

/* Forward declaration */
static void default_free(void* userdata, void* ptr, size_t size);

#include <lwjgl_malloc.h>

static void* default_alloc(void* userdata, size_t size, size_t alignment) {
    (void)userdata;
    (void)alignment;
#if 1
    return org_lwjgl_aligned_alloc(alignment, size);
#elif defined(_MSC_VER)
    return _aligned_malloc(size, alignment < 16 ? 16 : alignment);
#elif defined(__APPLE__) || defined(__ANDROID__)
    void* ptr = NULL;
    if (posix_memalign(&ptr, alignment < 16 ? 16 : alignment, size) != 0) {
        return NULL;
    }
    return ptr;
#else
    /* aligned_alloc requires size to be a multiple of alignment */
    size_t real_alignment = alignment < sizeof(void*) ? sizeof(void*) : alignment;
    size_t aligned_size = EXR_ALIGN(size, real_alignment);
    if (aligned_size < real_alignment) aligned_size = real_alignment;
    return aligned_alloc(real_alignment, aligned_size);
#endif
}

static void* default_realloc(void* userdata, void* ptr, size_t old_size,
                              size_t new_size, size_t alignment) {
    (void)userdata;
    (void)old_size;
    (void)alignment;
    /* Note: aligned realloc is tricky, so we allocate new and copy */
    void* new_ptr = default_alloc(userdata, new_size, alignment);
    if (new_ptr && ptr) {
        memcpy(new_ptr, ptr, old_size < new_size ? old_size : new_size);
        default_free(userdata, ptr, old_size);
    }
    return new_ptr;
}

static void default_free(void* userdata, void* ptr, size_t size) {
    (void)userdata;
    (void)size;
#if 1
    org_lwjgl_aligned_free(ptr);
#elif defined(_MSC_VER)
    _aligned_free(ptr);
#else
    free(ptr);
#endif
}

static const ExrAllocator g_default_allocator = {
    NULL,
    default_alloc,
    default_realloc,
    default_free
};

const ExrAllocator* exr_get_default_allocator(void) {
    return &g_default_allocator;
}

/* ============================================================================
 * Error Entry
 * ============================================================================ */

typedef struct ExrErrorEntry {
    ExrResult code;
    char message[EXR_MAX_ERROR_MESSAGE];
    char context[64];
    uint64_t byte_position;
    int32_t line_number;
    const char* source_file;  /* Static string, not owned */
} ExrErrorEntry;

/* ============================================================================
 * Context Internal Structure
 * ============================================================================ */

struct ExrContext_T {
    /* Reference count */
    ATOMIC_INT ref_count;

    /* Allocator */
    ExrAllocator allocator;

    /* Error handling */
    ExrErrorCallback error_callback;
    void* error_userdata;
    ExrErrorEntry errors[EXR_MAX_ERRORS];
    uint32_t error_count;
    uint32_t error_index;  /* Ring buffer index */

    /* Flags */
    uint32_t flags;
    uint32_t max_threads;

    /* Magic for validation */
    uint32_t magic;
};

#define EXR_CONTEXT_MAGIC 0x45585243  /* 'EXRC' */

/* ============================================================================
 * Context Validation
 * ============================================================================ */

static int exr_context_is_valid(ExrContext ctx) {
    return ctx != NULL && ctx->magic == EXR_CONTEXT_MAGIC;
}

/* ============================================================================
 * Context Error Management
 * ============================================================================ */

static void exr_context_add_error(ExrContext ctx, ExrResult code,
                                   const char* message, const char* context_str,
                                   uint64_t byte_pos) {
    if (!exr_context_is_valid(ctx)) return;

    uint32_t index = ctx->error_index % EXR_MAX_ERRORS;
    ExrErrorEntry* entry = &ctx->errors[index];

    entry->code = code;
    if (message) {
        strncpy(entry->message, message, EXR_MAX_ERROR_MESSAGE - 1);
        entry->message[EXR_MAX_ERROR_MESSAGE - 1] = '\0';
    } else {
        entry->message[0] = '\0';
    }
    if (context_str) {
        strncpy(entry->context, context_str, sizeof(entry->context) - 1);
        entry->context[sizeof(entry->context) - 1] = '\0';
    } else {
        entry->context[0] = '\0';
    }
    entry->byte_position = byte_pos;
    entry->line_number = 0;
    entry->source_file = NULL;

    ctx->error_index++;
    if (ctx->error_count < EXR_MAX_ERRORS) {
        ctx->error_count++;
    }

    /* Call error callback if set */
    if (ctx->error_callback) {
        ExrErrorInfo info = {
            .code = code,
            .message = entry->message,
            .context = entry->context,
            .byte_position = byte_pos,
            .line_number = 0,
            .source_file = NULL
        };
        ctx->error_callback(ctx->error_userdata, &info);
    }
}

static void exr_context_add_error_fmt(ExrContext ctx, ExrResult code,
                                       const char* context_str, uint64_t byte_pos,
                                       const char* fmt, ...) {
    char message[EXR_MAX_ERROR_MESSAGE];
    va_list args;
    va_start(args, fmt);
    vsnprintf(message, sizeof(message), fmt, args);
    va_end(args);
    exr_context_add_error(ctx, code, message, context_str, byte_pos);
}

/* ============================================================================
 * Context Creation/Destruction
 * ============================================================================ */

ExrResult exr_context_create(const ExrContextCreateInfo* create_info,
                              ExrContext* out_ctx) {
    if (!out_ctx) {
        return EXR_ERROR_INVALID_ARGUMENT;
    }
    *out_ctx = NULL;

    if (!create_info) {
        return EXR_ERROR_INVALID_ARGUMENT;
    }

    /* Check API version compatibility */
    uint32_t major = (create_info->api_version >> 22) & 0x3FF;
    if (major != TINYEXR_C_API_VERSION_MAJOR) {
        return EXR_ERROR_INVALID_VERSION;
    }

    /* Use provided allocator or default */
    const ExrAllocator* alloc = create_info->allocator;
    if (!alloc) {
        alloc = &g_default_allocator;
    }

    /* Allocate context */
    ExrContext ctx = (ExrContext)alloc->alloc(
        alloc->userdata,
        sizeof(struct ExrContext_T),
        EXR_DEFAULT_ALIGNMENT
    );
    if (!ctx) {
        return EXR_ERROR_OUT_OF_MEMORY;
    }

    /* Initialize */
    memset(ctx, 0, sizeof(struct ExrContext_T));
    ctx->magic = EXR_CONTEXT_MAGIC;
    ATOMIC_INIT(ctx->ref_count, 1);
    ctx->allocator = *alloc;
    ctx->error_callback = create_info->error_callback;
    ctx->error_userdata = create_info->error_userdata;
    ctx->flags = create_info->flags;
    ctx->max_threads = create_info->max_threads;

    *out_ctx = ctx;
    return EXR_SUCCESS;
}

void exr_context_destroy(ExrContext ctx) {
    if (!exr_context_is_valid(ctx)) return;

    /* Check reference count */
    int refs = ATOMIC_LOAD(ctx->ref_count);
    if (refs > 1) {
        ATOMIC_FETCH_SUB(ctx->ref_count, 1);
        return;
    }

    /* Invalidate magic before freeing */
    ctx->magic = 0;

    /* Free context */
    ctx->allocator.free(ctx->allocator.userdata, ctx, sizeof(struct ExrContext_T));
}

void exr_context_add_ref(ExrContext ctx) {
    if (exr_context_is_valid(ctx)) {
        ATOMIC_FETCH_ADD(ctx->ref_count, 1);
    }
}

void exr_context_release(ExrContext ctx) {
    if (exr_context_is_valid(ctx)) {
        if (ATOMIC_FETCH_SUB(ctx->ref_count, 1) == 1) {
            exr_context_destroy(ctx);
        }
    }
}

/* ============================================================================
 * Error Retrieval
 * ============================================================================ */

ExrResult exr_get_last_error(ExrContext ctx, ExrErrorInfo* out_info) {
    if (!exr_context_is_valid(ctx)) {
        return EXR_ERROR_INVALID_HANDLE;
    }
    if (!out_info) {
        return EXR_ERROR_INVALID_ARGUMENT;
    }
    if (ctx->error_count == 0) {
        memset(out_info, 0, sizeof(ExrErrorInfo));
        return EXR_SUCCESS;
    }

    uint32_t index = (ctx->error_index - 1) % EXR_MAX_ERRORS;
    ExrErrorEntry* entry = &ctx->errors[index];

    out_info->code = entry->code;
    out_info->message = entry->message;
    out_info->context = entry->context;
    out_info->byte_position = entry->byte_position;
    out_info->line_number = entry->line_number;
    out_info->source_file = entry->source_file;

    return EXR_SUCCESS;
}

uint32_t exr_get_error_count(ExrContext ctx) {
    if (!exr_context_is_valid(ctx)) {
        return 0;
    }
    return ctx->error_count;
}

ExrResult exr_get_error_at(ExrContext ctx, uint32_t index, ExrErrorInfo* out_info) {
    if (!exr_context_is_valid(ctx)) {
        return EXR_ERROR_INVALID_HANDLE;
    }
    if (!out_info) {
        return EXR_ERROR_INVALID_ARGUMENT;
    }
    if (index >= ctx->error_count) {
        return EXR_ERROR_OUT_OF_BOUNDS;
    }

    /* Calculate actual index in ring buffer */
    uint32_t actual_index;
    if (ctx->error_count < EXR_MAX_ERRORS) {
        actual_index = index;
    } else {
        actual_index = (ctx->error_index + index) % EXR_MAX_ERRORS;
    }

    ExrErrorEntry* entry = &ctx->errors[actual_index];
    out_info->code = entry->code;
    out_info->message = entry->message;
    out_info->context = entry->context;
    out_info->byte_position = entry->byte_position;
    out_info->line_number = entry->line_number;
    out_info->source_file = entry->source_file;

    return EXR_SUCCESS;
}

void exr_clear_errors(ExrContext ctx) {
    if (!exr_context_is_valid(ctx)) return;
    ctx->error_count = 0;
    ctx->error_index = 0;
}

/* ============================================================================
 * Memory Pool Internal Structure
 * ============================================================================ */

struct ExrMemoryPool_T {
    ExrContext ctx;
    uint8_t* data;
    size_t size;
    size_t used;
    size_t max_size;
    uint32_t flags;
    uint32_t magic;
};

#define EXR_MEMORY_POOL_MAGIC 0x4D504F4C  /* 'MPOL' */

static int exr_memory_pool_is_valid(ExrMemoryPool pool) {
    return pool != NULL && pool->magic == EXR_MEMORY_POOL_MAGIC;
}

ExrResult exr_memory_pool_create(ExrContext ctx,
                                  const ExrMemoryPoolCreateInfo* create_info,
                                  ExrMemoryPool* out_pool) {
    if (!exr_context_is_valid(ctx)) {
        return EXR_ERROR_INVALID_HANDLE;
    }
    if (!create_info || !out_pool) {
        return EXR_ERROR_INVALID_ARGUMENT;
    }

    *out_pool = NULL;

    /* Allocate pool structure */
    ExrMemoryPool pool = (ExrMemoryPool)ctx->allocator.alloc(
        ctx->allocator.userdata,
        sizeof(struct ExrMemoryPool_T),
        EXR_DEFAULT_ALIGNMENT
    );
    if (!pool) {
        exr_context_add_error(ctx, EXR_ERROR_OUT_OF_MEMORY,
                              "Failed to allocate memory pool", NULL, 0);
        return EXR_ERROR_OUT_OF_MEMORY;
    }

    memset(pool, 0, sizeof(struct ExrMemoryPool_T));
    pool->ctx = ctx;
    pool->max_size = create_info->max_size;
    pool->flags = create_info->flags;
    pool->magic = EXR_MEMORY_POOL_MAGIC;

    /* Allocate initial buffer if requested */
    if (create_info->initial_size > 0) {
        pool->data = (uint8_t*)ctx->allocator.alloc(
            ctx->allocator.userdata,
            create_info->initial_size,
            EXR_DEFAULT_ALIGNMENT
        );
        if (!pool->data) {
            ctx->allocator.free(ctx->allocator.userdata, pool,
                               sizeof(struct ExrMemoryPool_T));
            exr_context_add_error(ctx, EXR_ERROR_OUT_OF_MEMORY,
                                  "Failed to allocate pool buffer", NULL, 0);
            return EXR_ERROR_OUT_OF_MEMORY;
        }
        pool->size = create_info->initial_size;
    }

    exr_context_add_ref(ctx);
    *out_pool = pool;
    return EXR_SUCCESS;
}

void exr_memory_pool_destroy(ExrMemoryPool pool) {
    if (!exr_memory_pool_is_valid(pool)) return;

    ExrContext ctx = pool->ctx;
    pool->magic = 0;

    if (pool->data) {
        ctx->allocator.free(ctx->allocator.userdata, pool->data, pool->size);
    }
    ctx->allocator.free(ctx->allocator.userdata, pool,
                        sizeof(struct ExrMemoryPool_T));
    exr_context_release(ctx);
}

void exr_memory_pool_reset(ExrMemoryPool pool) {
    if (!exr_memory_pool_is_valid(pool)) return;
    pool->used = 0;
}

size_t exr_memory_pool_get_used(ExrMemoryPool pool) {
    if (!exr_memory_pool_is_valid(pool)) return 0;
    return pool->used;
}

/* ============================================================================
 * Data Source from Memory
 * ============================================================================ */

typedef struct ExrMemorySourceData {
    const uint8_t* data;
    size_t size;
} ExrMemorySourceData;

static ExrResult memory_source_fetch(void* userdata, uint64_t offset, uint64_t size,
                                      void* dst, ExrFetchComplete on_complete,
                                      void* complete_userdata) {
    ExrMemorySourceData* src = (ExrMemorySourceData*)userdata;
    (void)on_complete;
    (void)complete_userdata;

    if (offset >= src->size) {
        return EXR_ERROR_OUT_OF_BOUNDS;
    }

    size_t available = src->size - (size_t)offset;
    size_t to_read = (size_t)size;
    if (to_read > available) {
        to_read = available;
    }

    memcpy(dst, src->data + offset, to_read);

    /* Synchronous completion - no callback needed */
    return EXR_SUCCESS;
}

/* Note: This allocates a small structure on the heap. The caller must
 * ensure it lives as long as the data source is in use. For simplicity,
 * we use a static buffer for single-threaded use. For proper thread-safe
 * usage, the caller should manage the ExrMemorySourceData lifetime. */
static EXR_THREAD_LOCAL ExrMemorySourceData g_memory_source_data;

ExrResult exr_data_source_from_memory(const void* data, size_t size,
                                       ExrDataSource* out_source) {
    if (!data || size == 0 || !out_source) {
        return EXR_ERROR_INVALID_ARGUMENT;
    }

    g_memory_source_data.data = (const uint8_t*)data;
    g_memory_source_data.size = size;

    out_source->userdata = &g_memory_source_data;
    out_source->fetch = memory_source_fetch;
    out_source->cancel = NULL;
    out_source->total_size = size;
    out_source->flags = EXR_DATA_SOURCE_SEEKABLE | EXR_DATA_SOURCE_SIZE_KNOWN;

    return EXR_SUCCESS;
}

/* ============================================================================
 * Decoder Internal Structure
 * ============================================================================ */

typedef enum ExrDecoderState {
    EXR_DECODER_STATE_CREATED = 0,
    EXR_DECODER_STATE_PARSING_HEADER,
    EXR_DECODER_STATE_HEADER_PARSED,
    EXR_DECODER_STATE_LOADING,
    EXR_DECODER_STATE_ERROR,
} ExrDecoderState;

/* Parsing phases for async state machine (forward declaration) */
typedef enum ExrParsePhase {
    EXR_PHASE_IDLE = 0,
    EXR_PHASE_VERSION,             /* Reading magic + version bytes */
    EXR_PHASE_ATTRIBUTE_NAME,      /* Reading attribute name */
    EXR_PHASE_ATTRIBUTE_DATA,      /* Reading attribute value */
    EXR_PHASE_END_OF_HEADER,       /* Checking for header terminator */
    EXR_PHASE_OFFSET_TABLE,        /* Reading chunk offset table */
    EXR_PHASE_CHUNK_HEADER,        /* Reading chunk header (y + size) */
    EXR_PHASE_CHUNK_DATA,          /* Reading compressed chunk data */
} ExrParsePhase;

/* Forward declaration for suspend state */
struct ExrSuspendState_T;
typedef struct ExrSuspendState_T* ExrSuspendState_Internal;

struct ExrDecoder_T {
    ExrContext ctx;
    ExrDataSource source;
    ExrMemoryPool scratch_pool;
    uint32_t flags;
    ExrDecoderState state;

    /* Parsing state */
    uint64_t current_offset;
    uint8_t* read_buffer;
    size_t read_buffer_size;

    /* Async state for suspend/resume */
    ExrSuspendState suspend_state;
    ExrParsePhase current_phase;
    uint32_t current_part_index;
    uint32_t current_chunk_index;

    /* Parsed image */
    ExrImage image;

    /* Progress */
    ExrProgressCallback progress_callback;
    void* progress_userdata;
    int32_t progress_interval_ms;

    uint32_t magic;
};

#define EXR_DECODER_MAGIC 0x44454352  /* 'DECR' */

/* ============================================================================
 * Async/WASM Suspend State Structure
 * ============================================================================ */

/* Suspend state for async operations */
struct ExrSuspendState_T {
    uint32_t magic;

    /* Current parsing phase */
    ExrParsePhase phase;

    /* File position */
    uint64_t offset;

    /* Pending fetch info */
    uint64_t fetch_offset;
    uint64_t fetch_size;
    void* fetch_dst;

    /* Parsing context */
    uint32_t current_part;         /* Which part we're parsing */
    uint32_t current_chunk;        /* Which chunk we're reading */
    int32_t current_y;             /* Current Y coordinate for chunk */

    /* Partial data storage */
    uint8_t temp_buffer[512];      /* For attribute parsing */
    size_t temp_size;

    /* Async completion tracking */
    ExrResult async_result;
    size_t async_bytes_read;
    int async_complete;

    /* Reference to decoder */
    ExrDecoder decoder;
};

#define EXR_SUSPEND_MAGIC 0x53555350  /* 'SUSP' */

static int exr_suspend_is_valid(ExrSuspendState state) {
    return state != NULL && state->magic == EXR_SUSPEND_MAGIC;
}

static int exr_decoder_is_valid(ExrDecoder decoder) {
    return decoder != NULL && decoder->magic == EXR_DECODER_MAGIC;
}

/* ============================================================================
 * Decoder Creation/Destruction
 * ============================================================================ */

ExrResult exr_decoder_create(ExrContext ctx,
                              const ExrDecoderCreateInfo* create_info,
                              ExrDecoder* out_decoder) {
    if (!exr_context_is_valid(ctx)) {
        return EXR_ERROR_INVALID_HANDLE;
    }
    if (!create_info || !out_decoder) {
        return EXR_ERROR_INVALID_ARGUMENT;
    }
    if (!create_info->source.fetch) {
        exr_context_add_error(ctx, EXR_ERROR_INVALID_ARGUMENT,
                              "Data source fetch callback is required", NULL, 0);
        return EXR_ERROR_INVALID_ARGUMENT;
    }

    *out_decoder = NULL;

    /* Allocate decoder */
    ExrDecoder decoder = (ExrDecoder)ctx->allocator.alloc(
        ctx->allocator.userdata,
        sizeof(struct ExrDecoder_T),
        EXR_DEFAULT_ALIGNMENT
    );
    if (!decoder) {
        exr_context_add_error(ctx, EXR_ERROR_OUT_OF_MEMORY,
                              "Failed to allocate decoder", NULL, 0);
        return EXR_ERROR_OUT_OF_MEMORY;
    }

    memset(decoder, 0, sizeof(struct ExrDecoder_T));
    decoder->ctx = ctx;
    decoder->source = create_info->source;
    decoder->scratch_pool = create_info->scratch_pool;
    decoder->flags = create_info->flags;
    decoder->state = EXR_DECODER_STATE_CREATED;
    decoder->magic = EXR_DECODER_MAGIC;

    exr_context_add_ref(ctx);
    *out_decoder = decoder;
    return EXR_SUCCESS;
}

void exr_decoder_destroy(ExrDecoder decoder) {
    if (!exr_decoder_is_valid(decoder)) return;

    ExrContext ctx = decoder->ctx;
    decoder->magic = 0;

    /* Free suspend state if present */
    if (decoder->suspend_state) {
        decoder->suspend_state->magic = 0;  /* Invalidate first */
        ctx->allocator.free(ctx->allocator.userdata, decoder->suspend_state,
                            sizeof(struct ExrSuspendState_T));
        decoder->suspend_state = NULL;
    }

    /* Free read buffer */
    if (decoder->read_buffer) {
        ctx->allocator.free(ctx->allocator.userdata,
                            decoder->read_buffer, decoder->read_buffer_size);
    }

    /* Destroy image if owned */
    if (decoder->image) {
        exr_image_destroy(decoder->image);
    }

    ctx->allocator.free(ctx->allocator.userdata, decoder,
                        sizeof(struct ExrDecoder_T));
    exr_context_release(ctx);
}

ExrResult exr_decoder_set_progress_callback(ExrDecoder decoder,
                                             ExrProgressCallback callback,
                                             void* userdata,
                                             int32_t interval_ms) {
    if (!exr_decoder_is_valid(decoder)) {
        return EXR_ERROR_INVALID_HANDLE;
    }

    decoder->progress_callback = callback;
    decoder->progress_userdata = userdata;
    decoder->progress_interval_ms = interval_ms;
    return EXR_SUCCESS;
}

/* ============================================================================
 * Image Internal Structure
 * ============================================================================ */

typedef struct ExrChannelData {
    char name[64];
    uint32_t pixel_type;
    int32_t x_sampling;
    int32_t y_sampling;
    uint8_t p_linear;
} ExrChannelData;

typedef struct ExrAttributeData {
    char name[256];
    char type_name[64];
    uint8_t* value;
    uint32_t size;
    ExrAttributeType type;
} ExrAttributeData;

typedef struct ExrPartData {
    char* name;
    char* type_string;
    uint32_t part_type;
    int32_t width;
    int32_t height;
    uint32_t num_channels;
    ExrChannelData* channels;
    uint32_t compression;
    uint32_t flags;

    /* Offset table */
    uint64_t* offsets;
    uint32_t num_chunks;

    /* Tile info */
    uint32_t tile_size_x;
    uint32_t tile_size_y;
    uint32_t tile_level_mode;
    uint32_t tile_rounding_mode;
    uint32_t num_x_levels;
    uint32_t num_y_levels;

    /* Attributes */
    ExrAttributeData* attributes;
    uint32_t num_attributes;
} ExrPartData;

struct ExrImage_T {
    ExrDecoder decoder;  /* Back reference */
    ExrContext ctx;

    /* Version info */
    int32_t version;
    uint32_t flags;  /* ExrImageFlags */

    /* Global info */
    ExrBox2i data_window;
    ExrBox2i display_window;
    float pixel_aspect_ratio;
    ExrVec2f screen_window_center;
    float screen_window_width;

    /* Parts */
    ExrPartData* parts;
    uint32_t num_parts;

    uint32_t magic;
};

#define EXR_IMAGE_MAGIC 0x494D4147  /* 'IMAG' */

static int exr_image_is_valid(ExrImage image) {
    return image != NULL && image->magic == EXR_IMAGE_MAGIC;
}

void exr_image_destroy(ExrImage image) {
    if (!exr_image_is_valid(image)) return;

    ExrContext ctx = image->ctx;
    image->magic = 0;

    /* Free parts */
    for (uint32_t i = 0; i < image->num_parts; i++) {
        ExrPartData* part = &image->parts[i];
        if (part->name) {
            ctx->allocator.free(ctx->allocator.userdata, part->name,
                               strlen(part->name) + 1);
        }
        if (part->type_string) {
            ctx->allocator.free(ctx->allocator.userdata, part->type_string,
                               strlen(part->type_string) + 1);
        }
        if (part->channels) {
            ctx->allocator.free(ctx->allocator.userdata, part->channels,
                               part->num_channels * sizeof(ExrChannelData));
        }
        if (part->offsets) {
            ctx->allocator.free(ctx->allocator.userdata, part->offsets,
                               part->num_chunks * sizeof(uint64_t));
        }
        if (part->attributes) {
            for (uint32_t j = 0; j < part->num_attributes; j++) {
                if (part->attributes[j].value) {
                    ctx->allocator.free(ctx->allocator.userdata,
                                       part->attributes[j].value,
                                       part->attributes[j].size);
                }
            }
            ctx->allocator.free(ctx->allocator.userdata, part->attributes,
                               part->num_attributes * sizeof(ExrAttributeData));
        }
    }

    if (image->parts) {
        ctx->allocator.free(ctx->allocator.userdata, image->parts,
                           image->num_parts * sizeof(ExrPartData));
    }

    ctx->allocator.free(ctx->allocator.userdata, image, sizeof(struct ExrImage_T));
    exr_context_release(ctx);
}

ExrResult exr_image_get_info(ExrImage image, ExrImageInfo* out_info) {
    if (!exr_image_is_valid(image)) {
        return EXR_ERROR_INVALID_HANDLE;
    }
    if (!out_info) {
        return EXR_ERROR_INVALID_ARGUMENT;
    }

    memset(out_info, 0, sizeof(ExrImageInfo));

    out_info->width = image->data_window.max_x - image->data_window.min_x + 1;
    out_info->height = image->data_window.max_y - image->data_window.min_y + 1;
    out_info->data_window = image->data_window;
    out_info->display_window = image->display_window;
    out_info->num_parts = image->num_parts;
    out_info->flags = image->flags;
    out_info->pixel_aspect_ratio = image->pixel_aspect_ratio;
    out_info->screen_window_center = image->screen_window_center;
    out_info->screen_window_width = image->screen_window_width;

    /* Get info from first part */
    if (image->num_parts > 0) {
        ExrPartData* part = &image->parts[0];
        out_info->num_channels = part->num_channels;
        out_info->compression = part->compression;
        out_info->tile_size_x = part->tile_size_x;
        out_info->tile_size_y = part->tile_size_y;
        out_info->num_x_levels = part->num_x_levels;
        out_info->num_y_levels = part->num_y_levels;
    }

    return EXR_SUCCESS;
}

ExrResult exr_image_get_channel_count(ExrImage image, uint32_t* out_count) {
    if (!exr_image_is_valid(image)) {
        return EXR_ERROR_INVALID_HANDLE;
    }
    if (!out_count) {
        return EXR_ERROR_INVALID_ARGUMENT;
    }
    if (image->num_parts == 0) {
        *out_count = 0;
        return EXR_SUCCESS;
    }
    *out_count = image->parts[0].num_channels;
    return EXR_SUCCESS;
}

ExrResult exr_image_get_channel(ExrImage image, uint32_t index,
                                 ExrChannelInfo* out_info) {
    if (!exr_image_is_valid(image)) {
        return EXR_ERROR_INVALID_HANDLE;
    }
    if (!out_info) {
        return EXR_ERROR_INVALID_ARGUMENT;
    }
    if (image->num_parts == 0) {
        return EXR_ERROR_OUT_OF_BOUNDS;
    }

    ExrPartData* part = &image->parts[0];
    if (index >= part->num_channels) {
        return EXR_ERROR_OUT_OF_BOUNDS;
    }

    ExrChannelData* ch = &part->channels[index];
    out_info->name = ch->name;
    out_info->pixel_type = ch->pixel_type;
    out_info->x_sampling = ch->x_sampling;
    out_info->y_sampling = ch->y_sampling;
    out_info->p_linear = ch->p_linear;

    return EXR_SUCCESS;
}

ExrResult exr_image_find_channel(ExrImage image, const char* name,
                                  uint32_t* out_index) {
    if (!exr_image_is_valid(image)) {
        return EXR_ERROR_INVALID_HANDLE;
    }
    if (!name || !out_index) {
        return EXR_ERROR_INVALID_ARGUMENT;
    }
    if (image->num_parts == 0) {
        return EXR_ERROR_MISSING_ATTRIBUTE;
    }

    ExrPartData* part = &image->parts[0];
    for (uint32_t i = 0; i < part->num_channels; i++) {
        if (strcmp(part->channels[i].name, name) == 0) {
            *out_index = i;
            return EXR_SUCCESS;
        }
    }

    return EXR_ERROR_MISSING_ATTRIBUTE;
}

ExrResult exr_image_get_part_count(ExrImage image, uint32_t* out_count) {
    if (!exr_image_is_valid(image)) {
        return EXR_ERROR_INVALID_HANDLE;
    }
    if (!out_count) {
        return EXR_ERROR_INVALID_ARGUMENT;
    }
    *out_count = image->num_parts;
    return EXR_SUCCESS;
}

/* ============================================================================
 * Part Internal Structure (ExrPart is a pointer into ExrImage)
 * ============================================================================ */

/* ExrPart is actually just an index + image reference */
struct ExrPart_T {
    ExrImage image;
    uint32_t part_index;
    uint32_t magic;
};

#define EXR_PART_MAGIC 0x50415254  /* 'PART' */

/* For now, we use a simple approach where ExrPart is allocated separately.
 * In a more optimized implementation, we could embed part handles in the image. */

ExrResult exr_image_get_part(ExrImage image, uint32_t index, ExrPart* out_part) {
    if (!exr_image_is_valid(image)) {
        return EXR_ERROR_INVALID_HANDLE;
    }
    if (!out_part) {
        return EXR_ERROR_INVALID_ARGUMENT;
    }
    if (index >= image->num_parts) {
        return EXR_ERROR_OUT_OF_BOUNDS;
    }

    /* Allocate part handle */
    ExrPart part = (ExrPart)image->ctx->allocator.alloc(
        image->ctx->allocator.userdata,
        sizeof(struct ExrPart_T),
        EXR_DEFAULT_ALIGNMENT
    );
    if (!part) {
        return EXR_ERROR_OUT_OF_MEMORY;
    }

    part->image = image;
    part->part_index = index;
    part->magic = EXR_PART_MAGIC;

    *out_part = part;
    return EXR_SUCCESS;
}

static int exr_part_is_valid(ExrPart part) {
    return part != NULL && part->magic == EXR_PART_MAGIC &&
           exr_image_is_valid(part->image);
}

void exr_part_destroy(ExrPart part) {
    if (!exr_part_is_valid(part)) return;
    ExrContext ctx = part->image->ctx;
    part->magic = 0;
    ctx->allocator.free(ctx->allocator.userdata, part, sizeof(struct ExrPart_T));
}

static ExrPartData* exr_part_get_data(ExrPart part) {
    if (!exr_part_is_valid(part)) return NULL;
    return &part->image->parts[part->part_index];
}

ExrResult exr_part_get_info(ExrPart part, ExrPartInfo* out_info) {
    ExrPartData* data = exr_part_get_data(part);
    if (!data) {
        return EXR_ERROR_INVALID_HANDLE;
    }
    if (!out_info) {
        return EXR_ERROR_INVALID_ARGUMENT;
    }

    out_info->name = data->name;
    out_info->type_string = data->type_string;
    out_info->part_type = data->part_type;
    out_info->width = data->width;
    out_info->height = data->height;
    out_info->num_channels = data->num_channels;
    out_info->compression = data->compression;
    out_info->flags = data->flags;

    return EXR_SUCCESS;
}

ExrResult exr_part_get_channel(ExrPart part, uint32_t index,
                                ExrChannelInfo* out_info) {
    ExrPartData* data = exr_part_get_data(part);
    if (!data) {
        return EXR_ERROR_INVALID_HANDLE;
    }
    if (!out_info) {
        return EXR_ERROR_INVALID_ARGUMENT;
    }
    if (index >= data->num_channels) {
        return EXR_ERROR_OUT_OF_BOUNDS;
    }

    ExrChannelData* ch = &data->channels[index];
    out_info->name = ch->name;
    out_info->pixel_type = ch->pixel_type;
    out_info->x_sampling = ch->x_sampling;
    out_info->y_sampling = ch->y_sampling;
    out_info->p_linear = ch->p_linear;

    return EXR_SUCCESS;
}

ExrResult exr_part_get_chunk_count(ExrPart part, uint32_t* out_count) {
    ExrPartData* data = exr_part_get_data(part);
    if (!data) {
        return EXR_ERROR_INVALID_HANDLE;
    }
    if (!out_count) {
        return EXR_ERROR_INVALID_ARGUMENT;
    }
    *out_count = data->num_chunks;
    return EXR_SUCCESS;
}

/* ============================================================================
 * Fence Internal Structure
 * ============================================================================ */

struct ExrFence_T {
    ExrContext ctx;
    ATOMIC_INT signaled;
    uint32_t magic;

#if defined(_WIN32)
    void* event;  /* HANDLE */
#else
    pthread_mutex_t mutex;
    pthread_cond_t cond;
#endif
};

#define EXR_FENCE_MAGIC 0x46454E43  /* 'FENC' */

ExrResult exr_fence_create(ExrContext ctx, const ExrFenceCreateInfo* create_info,
                            ExrFence* out_fence) {
    if (!exr_context_is_valid(ctx)) {
        return EXR_ERROR_INVALID_HANDLE;
    }
    if (!out_fence) {
        return EXR_ERROR_INVALID_ARGUMENT;
    }

    *out_fence = NULL;

    ExrFence fence = (ExrFence)ctx->allocator.alloc(
        ctx->allocator.userdata,
        sizeof(struct ExrFence_T),
        EXR_DEFAULT_ALIGNMENT
    );
    if (!fence) {
        return EXR_ERROR_OUT_OF_MEMORY;
    }

    memset(fence, 0, sizeof(struct ExrFence_T));
    fence->ctx = ctx;
    fence->magic = EXR_FENCE_MAGIC;

    int initial_state = (create_info && (create_info->flags & EXR_FENCE_SIGNALED)) ? 1 : 0;
    ATOMIC_INIT(fence->signaled, initial_state);

#if defined(_WIN32)
    fence->event = CreateEventA(NULL, TRUE, initial_state, NULL);
    if (!fence->event) {
        ctx->allocator.free(ctx->allocator.userdata, fence, sizeof(struct ExrFence_T));
        return EXR_ERROR_OUT_OF_MEMORY;
    }
#else
    pthread_mutex_init(&fence->mutex, NULL);
    pthread_cond_init(&fence->cond, NULL);
#endif

    exr_context_add_ref(ctx);
    *out_fence = fence;
    return EXR_SUCCESS;
}

void exr_fence_destroy(ExrFence fence) {
    if (!fence || fence->magic != EXR_FENCE_MAGIC) return;

    ExrContext ctx = fence->ctx;
    fence->magic = 0;

#if defined(_WIN32)
    if (fence->event) {
        CloseHandle(fence->event);
    }
#else
    pthread_cond_destroy(&fence->cond);
    pthread_mutex_destroy(&fence->mutex);
#endif

    ctx->allocator.free(ctx->allocator.userdata, fence, sizeof(struct ExrFence_T));
    exr_context_release(ctx);
}

ExrResult exr_fence_wait(ExrFence fence, uint64_t timeout_ns) {
    if (!fence || fence->magic != EXR_FENCE_MAGIC) {
        return EXR_ERROR_INVALID_HANDLE;
    }

    /* Fast path: already signaled */
    if (ATOMIC_LOAD(fence->signaled)) {
        return EXR_SUCCESS;
    }

    if (timeout_ns == EXR_TIMEOUT_NONE) {
        return ATOMIC_LOAD(fence->signaled) ? EXR_SUCCESS : EXR_ERROR_NOT_READY;
    }

#if defined(_WIN32)
    DWORD timeout_ms = (timeout_ns == EXR_TIMEOUT_INFINITE) ? INFINITE :
                       (DWORD)(timeout_ns / 1000000);
    DWORD result = WaitForSingleObject(fence->event, timeout_ms);
    if (result == WAIT_OBJECT_0) {
        return EXR_SUCCESS;
    } else if (result == WAIT_TIMEOUT) {
        return EXR_ERROR_TIMEOUT;
    }
    return EXR_ERROR_IO;
#else
    pthread_mutex_lock(&fence->mutex);

    if (timeout_ns == EXR_TIMEOUT_INFINITE) {
        while (!ATOMIC_LOAD(fence->signaled)) {
            pthread_cond_wait(&fence->cond, &fence->mutex);
        }
    } else {
        struct timespec ts;
        clock_gettime(CLOCK_REALTIME, &ts);
        ts.tv_sec += timeout_ns / 1000000000ULL;
        ts.tv_nsec += timeout_ns % 1000000000ULL;
        if (ts.tv_nsec >= 1000000000L) {
            ts.tv_sec++;
            ts.tv_nsec -= 1000000000L;
        }

        int rc = 0;
        while (!ATOMIC_LOAD(fence->signaled) && rc == 0) {
            rc = pthread_cond_timedwait(&fence->cond, &fence->mutex, &ts);
        }
        if (rc == ETIMEDOUT) {
            pthread_mutex_unlock(&fence->mutex);
            return EXR_ERROR_TIMEOUT;
        }
    }

    pthread_mutex_unlock(&fence->mutex);
    return EXR_SUCCESS;
#endif
}

ExrResult exr_fence_get_status(ExrFence fence) {
    if (!fence || fence->magic != EXR_FENCE_MAGIC) {
        return EXR_ERROR_INVALID_HANDLE;
    }
    return ATOMIC_LOAD(fence->signaled) ? EXR_SUCCESS : EXR_ERROR_NOT_READY;
}

ExrResult exr_fence_reset(ExrFence fence) {
    if (!fence || fence->magic != EXR_FENCE_MAGIC) {
        return EXR_ERROR_INVALID_HANDLE;
    }

    ATOMIC_STORE(fence->signaled, 0);

#if defined(_WIN32)
    ResetEvent(fence->event);
#endif

    return EXR_SUCCESS;
}

/* Signal fence (internal function) */
static void exr_fence_signal(ExrFence fence) {
    if (!fence || fence->magic != EXR_FENCE_MAGIC) return;

    ATOMIC_STORE(fence->signaled, 1);

#if defined(_WIN32)
    SetEvent(fence->event);
#else
    pthread_mutex_lock(&fence->mutex);
    pthread_cond_broadcast(&fence->cond);
    pthread_mutex_unlock(&fence->mutex);
#endif
}

/* ============================================================================
 * Command Buffer Implementation
 * ============================================================================ */

/* Command types */
typedef enum ExrCommandType {
    EXR_CMD_TYPE_NONE = 0,
    EXR_CMD_TYPE_READ_TILE,
    EXR_CMD_TYPE_READ_SCANLINES,
    EXR_CMD_TYPE_READ_FULL_IMAGE,
    EXR_CMD_TYPE_READ_DEEP_SCANLINES,
    EXR_CMD_TYPE_READ_DEEP_TILES,
    EXR_CMD_TYPE_WRITE_TILE,
    EXR_CMD_TYPE_WRITE_SCANLINES,
    EXR_CMD_TYPE_WRITE_DEEP_SCANLINES,
    EXR_CMD_TYPE_WRITE_DEEP_TILES,
} ExrCommandType;

/* Base command structure */
typedef struct ExrCommand {
    ExrCommandType type;
    uint32_t part_index;
} ExrCommand;

/* Tile read command */
typedef struct ExrTileReadCmd {
    ExrCommand base;
    int32_t tile_x;
    int32_t tile_y;
    int32_t level_x;
    int32_t level_y;
    void* output;
    size_t output_size;
    uint32_t channels_mask;
    uint32_t output_pixel_type;
    uint32_t output_layout;
} ExrTileReadCmd;

/* Scanline read command */
typedef struct ExrScanlineReadCmd {
    ExrCommand base;
    int32_t y_start;
    int32_t num_lines;
    void* output;
    size_t output_size;
    uint32_t channels_mask;
    uint32_t output_pixel_type;
    uint32_t output_layout;
} ExrScanlineReadCmd;

/* Full image read command */
typedef struct ExrFullImageReadCmd {
    ExrCommand base;
    void* output;
    size_t output_size;
    uint32_t channels_mask;
    uint32_t output_pixel_type;
    uint32_t output_layout;
    int32_t target_level;
} ExrFullImageReadCmd;

/* Scanline write command */
typedef struct ExrScanlineWriteCmd {
    ExrCommand base;
    ExrWriteImage image;
    int32_t y_start;
    int32_t num_lines;
    const void* input;
    size_t input_size;
    uint32_t input_layout;
    uint32_t input_pixel_type;
} ExrScanlineWriteCmd;

/* Deep scanline write command */
typedef struct ExrDeepScanlineWriteCmd {
    ExrCommand base;
    ExrWriteImage image;
    int32_t y_start;
    int32_t num_lines;
    int32_t width;
    const uint32_t* sample_counts;
    uint64_t total_samples;
    const void* input;
    size_t input_size;
    uint32_t input_layout;
    uint32_t input_pixel_type;
} ExrDeepScanlineWriteCmd;

/* Tile write command */
typedef struct ExrTileWriteCmd {
    ExrCommand base;
    ExrWriteImage image;
    int32_t tile_x;
    int32_t tile_y;
    int32_t level_x;
    int32_t level_y;
    const void* input;
    size_t input_size;
    uint32_t input_layout;
    uint32_t input_pixel_type;
} ExrTileWriteCmd;

/* Deep scanline read command */
typedef struct ExrDeepScanlineReadCmd {
    ExrCommand base;
    int32_t y_start;
    int32_t num_lines;
    ExrDeepSampleInfo* sample_info;
    void* output;
    size_t output_size;
    uint32_t channels_mask;
    uint32_t output_pixel_type;
} ExrDeepScanlineReadCmd;

/* Deep tile read command */
typedef struct ExrDeepTileReadCmd {
    ExrCommand base;
    int32_t tile_x;
    int32_t tile_y;
    int32_t level_x;
    int32_t level_y;
    ExrDeepTileSampleInfo* sample_info;
    void* output;
    size_t output_size;
    uint32_t channels_mask;
    uint32_t output_pixel_type;
} ExrDeepTileReadCmd;

/* Deep tile write command */
typedef struct ExrDeepTileWriteCmd {
    ExrCommand base;
    ExrWriteImage image;
    int32_t tile_x;
    int32_t tile_y;
    int32_t level_x;
    int32_t level_y;
    int32_t width;
    int32_t height;
    const uint32_t* sample_counts;
    uint64_t total_samples;
    const void* input;
    size_t input_size;
    uint32_t input_layout;
    uint32_t input_pixel_type;
} ExrDeepTileWriteCmd;

/* Union for all command types */
typedef union ExrCommandUnion {
    ExrCommand base;
    ExrTileReadCmd tile_read;
    ExrScanlineReadCmd scanline_read;
    ExrFullImageReadCmd full_image_read;
    ExrDeepScanlineReadCmd deep_scanline_read;
    ExrDeepTileReadCmd deep_tile_read;
    ExrScanlineWriteCmd scanline_write;
    ExrTileWriteCmd tile_write;
    ExrDeepScanlineWriteCmd deep_scanline_write;
    ExrDeepTileWriteCmd deep_tile_write;
} ExrCommandUnion;

#define EXR_INITIAL_CMD_CAPACITY 16

struct ExrCommandBuffer_T {
    ExrContext ctx;
    ExrDecoder decoder;
    ExrEncoder encoder;
    uint32_t flags;

    /* Command storage */
    ExrCommandUnion* commands;
    uint32_t command_count;
    uint32_t command_capacity;

    int recording;
    uint32_t magic;
};

#define EXR_COMMAND_BUFFER_MAGIC 0x434D4442  /* 'CMDB' */

static int exr_command_buffer_is_valid(ExrCommandBuffer cmd) {
    return cmd != NULL && cmd->magic == EXR_COMMAND_BUFFER_MAGIC;
}

/* Ensure command buffer has capacity for one more command */
static ExrResult ensure_command_capacity(ExrCommandBuffer cmd) {
    if (cmd->command_count < cmd->command_capacity) {
        return EXR_SUCCESS;
    }

    ExrContext ctx = cmd->ctx;
    uint32_t new_capacity = cmd->command_capacity == 0 ?
        EXR_INITIAL_CMD_CAPACITY : cmd->command_capacity * 2;

    ExrCommandUnion* new_commands = (ExrCommandUnion*)ctx->allocator.alloc(
        ctx->allocator.userdata,
        new_capacity * sizeof(ExrCommandUnion),
        EXR_DEFAULT_ALIGNMENT
    );
    if (!new_commands) {
        return EXR_ERROR_OUT_OF_MEMORY;
    }

    if (cmd->commands) {
        memcpy(new_commands, cmd->commands,
               cmd->command_count * sizeof(ExrCommandUnion));
        ctx->allocator.free(ctx->allocator.userdata, cmd->commands,
                            cmd->command_capacity * sizeof(ExrCommandUnion));
    }

    cmd->commands = new_commands;
    cmd->command_capacity = new_capacity;
    return EXR_SUCCESS;
}

ExrResult exr_command_buffer_create(ExrContext ctx,
                                     const ExrCommandBufferCreateInfo* create_info,
                                     ExrCommandBuffer* out_cmd) {
    if (!exr_context_is_valid(ctx)) {
        return EXR_ERROR_INVALID_HANDLE;
    }
    if (!create_info || !out_cmd) {
        return EXR_ERROR_INVALID_ARGUMENT;
    }

    *out_cmd = NULL;

    ExrCommandBuffer cmd = (ExrCommandBuffer)ctx->allocator.alloc(
        ctx->allocator.userdata,
        sizeof(struct ExrCommandBuffer_T),
        EXR_DEFAULT_ALIGNMENT
    );
    if (!cmd) {
        return EXR_ERROR_OUT_OF_MEMORY;
    }

    memset(cmd, 0, sizeof(struct ExrCommandBuffer_T));
    cmd->ctx = ctx;
    cmd->decoder = create_info->decoder;
    cmd->encoder = create_info->encoder;
    cmd->flags = create_info->flags;
    cmd->magic = EXR_COMMAND_BUFFER_MAGIC;

    /* Pre-allocate command storage if specified */
    if (create_info->max_commands > 0) {
        cmd->commands = (ExrCommandUnion*)ctx->allocator.alloc(
            ctx->allocator.userdata,
            create_info->max_commands * sizeof(ExrCommandUnion),
            EXR_DEFAULT_ALIGNMENT
        );
        if (!cmd->commands) {
            ctx->allocator.free(ctx->allocator.userdata, cmd,
                               sizeof(struct ExrCommandBuffer_T));
            return EXR_ERROR_OUT_OF_MEMORY;
        }
        cmd->command_capacity = create_info->max_commands;
    }

    exr_context_add_ref(ctx);
    *out_cmd = cmd;
    return EXR_SUCCESS;
}

void exr_command_buffer_destroy(ExrCommandBuffer cmd) {
    if (!exr_command_buffer_is_valid(cmd)) return;

    ExrContext ctx = cmd->ctx;
    cmd->magic = 0;

    /* Free commands if any */
    if (cmd->commands) {
        ctx->allocator.free(ctx->allocator.userdata, cmd->commands,
                            cmd->command_capacity * sizeof(ExrCommandUnion));
    }

    ctx->allocator.free(ctx->allocator.userdata, cmd, sizeof(struct ExrCommandBuffer_T));
    exr_context_release(ctx);
}

ExrResult exr_command_buffer_reset(ExrCommandBuffer cmd) {
    if (!exr_command_buffer_is_valid(cmd)) {
        return EXR_ERROR_INVALID_HANDLE;
    }
    cmd->command_count = 0;
    cmd->recording = 0;
    return EXR_SUCCESS;
}

ExrResult exr_command_buffer_begin(ExrCommandBuffer cmd) {
    if (!exr_command_buffer_is_valid(cmd)) {
        return EXR_ERROR_INVALID_HANDLE;
    }
    if (cmd->recording) {
        return EXR_ERROR_INVALID_STATE;
    }
    cmd->recording = 1;
    cmd->command_count = 0;
    return EXR_SUCCESS;
}

ExrResult exr_command_buffer_end(ExrCommandBuffer cmd) {
    if (!exr_command_buffer_is_valid(cmd)) {
        return EXR_ERROR_INVALID_HANDLE;
    }
    if (!cmd->recording) {
        return EXR_ERROR_INVALID_STATE;
    }
    cmd->recording = 0;
    return EXR_SUCCESS;
}

/* ============================================================================
 * Command Recording Functions
 * ============================================================================ */

ExrResult exr_cmd_request_tile(ExrCommandBuffer cmd, const ExrTileRequest* request) {
    if (!exr_command_buffer_is_valid(cmd)) {
        return EXR_ERROR_INVALID_HANDLE;
    }
    if (!cmd->recording) {
        return EXR_ERROR_INVALID_STATE;
    }
    if (!request || !request->part || !request->output.data) {
        return EXR_ERROR_INVALID_ARGUMENT;
    }

    ExrResult result = ensure_command_capacity(cmd);
    if (EXR_FAILED(result)) return result;

    ExrTileReadCmd* tile_cmd = &cmd->commands[cmd->command_count].tile_read;
    tile_cmd->base.type = EXR_CMD_TYPE_READ_TILE;
    tile_cmd->base.part_index = request->part->part_index;
    tile_cmd->tile_x = request->tile_x;
    tile_cmd->tile_y = request->tile_y;
    tile_cmd->level_x = request->level_x;
    tile_cmd->level_y = request->level_y;
    tile_cmd->output = request->output.data;
    tile_cmd->output_size = request->output.size;
    tile_cmd->channels_mask = request->channels_mask;
    tile_cmd->output_pixel_type = request->output_pixel_type;
    tile_cmd->output_layout = request->output_layout;

    cmd->command_count++;
    return EXR_SUCCESS;
}

ExrResult exr_cmd_request_tiles(ExrCommandBuffer cmd, uint32_t count,
                                 const ExrTileRequest* requests) {
    if (!exr_command_buffer_is_valid(cmd)) {
        return EXR_ERROR_INVALID_HANDLE;
    }
    if (!requests || count == 0) {
        return EXR_ERROR_INVALID_ARGUMENT;
    }

    for (uint32_t i = 0; i < count; i++) {
        ExrResult result = exr_cmd_request_tile(cmd, &requests[i]);
        if (EXR_FAILED(result)) return result;
    }
    return EXR_SUCCESS;
}

ExrResult exr_cmd_request_scanlines(ExrCommandBuffer cmd,
                                     const ExrScanlineRequest* request) {
    if (!exr_command_buffer_is_valid(cmd)) {
        return EXR_ERROR_INVALID_HANDLE;
    }
    if (!cmd->recording) {
        return EXR_ERROR_INVALID_STATE;
    }
    if (!request || !request->part || !request->output.data) {
        return EXR_ERROR_INVALID_ARGUMENT;
    }

    ExrResult result = ensure_command_capacity(cmd);
    if (EXR_FAILED(result)) return result;

    ExrScanlineReadCmd* scan_cmd = &cmd->commands[cmd->command_count].scanline_read;
    scan_cmd->base.type = EXR_CMD_TYPE_READ_SCANLINES;
    scan_cmd->base.part_index = request->part->part_index;
    scan_cmd->y_start = request->y_start;
    scan_cmd->num_lines = request->num_lines;
    scan_cmd->output = request->output.data;
    scan_cmd->output_size = request->output.size;
    scan_cmd->channels_mask = request->channels_mask;
    scan_cmd->output_pixel_type = request->output_pixel_type;
    scan_cmd->output_layout = request->output_layout;

    cmd->command_count++;
    return EXR_SUCCESS;
}

ExrResult exr_cmd_request_scanline_blocks(ExrCommandBuffer cmd, uint32_t count,
                                           const ExrScanlineRequest* requests) {
    if (!exr_command_buffer_is_valid(cmd)) {
        return EXR_ERROR_INVALID_HANDLE;
    }
    if (!requests || count == 0) {
        return EXR_ERROR_INVALID_ARGUMENT;
    }

    for (uint32_t i = 0; i < count; i++) {
        ExrResult result = exr_cmd_request_scanlines(cmd, &requests[i]);
        if (EXR_FAILED(result)) return result;
    }
    return EXR_SUCCESS;
}

ExrResult exr_cmd_request_full_image(ExrCommandBuffer cmd,
                                      const ExrFullImageRequest* request) {
    if (!exr_command_buffer_is_valid(cmd)) {
        return EXR_ERROR_INVALID_HANDLE;
    }
    if (!cmd->recording) {
        return EXR_ERROR_INVALID_STATE;
    }
    if (!request || !request->part || !request->output.data) {
        return EXR_ERROR_INVALID_ARGUMENT;
    }

    ExrResult result = ensure_command_capacity(cmd);
    if (EXR_FAILED(result)) return result;

    ExrFullImageReadCmd* full_cmd = &cmd->commands[cmd->command_count].full_image_read;
    full_cmd->base.type = EXR_CMD_TYPE_READ_FULL_IMAGE;
    full_cmd->base.part_index = request->part->part_index;
    full_cmd->output = request->output.data;
    full_cmd->output_size = request->output.size;
    full_cmd->channels_mask = request->channels_mask;
    full_cmd->output_pixel_type = request->output_pixel_type;
    full_cmd->output_layout = request->output_layout;
    full_cmd->target_level = request->target_level;

    cmd->command_count++;
    return EXR_SUCCESS;
}

/* ============================================================================
 * Compression/Decompression Support
 * ============================================================================ */

/* Use V2 deflate, PIZ, PXR24, B44 implementation by default */
#ifdef __cplusplus
#ifndef TINYEXR_V3_USE_MINIZ
#include "tinyexr_huffman.hh"
#include "tinyexr_piz.hh"
#include "tinyexr_v2_impl.hh"
#define TINYEXR_V3_HAS_DEFLATE 1
#define TINYEXR_V3_HAS_PIZ 1
#define TINYEXR_V3_HAS_PXR24 1
#define TINYEXR_V3_HAS_B44 1

/* Include tinyexr.h for EXRChannelInfo type if any V1 wrappers are enabled */
#if defined(TINYEXR_V3_ENABLE_PIZ) || defined(TINYEXR_V3_ENABLE_PXR24) || defined(TINYEXR_V3_ENABLE_B44)
#include "tinyexr.h"
#endif

/* V1 PXR24 support - requires external wrapper function */
#ifdef TINYEXR_V3_ENABLE_PXR24
extern "C" bool tinyexr_v3_decompress_pxr24(
    unsigned char* outPtr, size_t outBufSize,
    const unsigned char* inPtr, size_t inLen,
    int data_width, int num_lines,
    size_t num_channels, const EXRChannelInfo* channels);
#define TINYEXR_V3_USE_V1_PXR24 1
#endif

/* V1 B44 support - requires external wrapper function */
#ifdef TINYEXR_V3_ENABLE_B44
extern "C" bool tinyexr_v3_decompress_b44(
    unsigned char* outPtr, size_t outBufSize,
    const unsigned char* inPtr, size_t inLen,
    int data_width, int num_lines,
    size_t num_channels, const EXRChannelInfo* channels, bool is_b44a);
#define TINYEXR_V3_USE_V1_B44 1
#endif

#endif
#endif

/* Fall back to miniz if V2 deflate not available */
#if !defined(TINYEXR_V3_HAS_DEFLATE) && !defined(TINYEXR_V3_NO_MINIZ)
#define MINIZ_NO_STDIO
#define MINIZ_NO_TIME
#define MINIZ_NO_ARCHIVE_APIS
#define MINIZ_NO_ARCHIVE_WRITING_APIS
#include <miniz.h>
#define TINYEXR_V3_USE_MINIZ 1
#endif

/* Forward declarations of helper functions defined in Header Parsing section */
static int32_t read_le_i32(const uint8_t* p);
static uint32_t read_le_u32(const uint8_t* p);
static uint64_t read_le_u64(const uint8_t* p);
static ExrResult sync_fetch(ExrDecoder decoder, uint64_t offset, uint64_t size, void* dst);

/* ZIP decompression with EXR-specific post-processing */
static ExrResult decompress_zip(const uint8_t* src, size_t src_size,
                                 uint8_t* dst, size_t dst_size,
                                 size_t* out_size, ExrContext ctx) {
    /* If sizes match, data is not compressed (Issue 40) */
    if (src_size == dst_size) {
        memcpy(dst, src, src_size);
        *out_size = src_size;
        return EXR_SUCCESS;
    }

    /* Allocate temp buffer for decompression */
    uint8_t* tmpBuf = (uint8_t*)ctx->allocator.alloc(
        ctx->allocator.userdata, dst_size, EXR_DEFAULT_ALIGNMENT);
    if (!tmpBuf) {
        return EXR_ERROR_OUT_OF_MEMORY;
    }

#if defined(TINYEXR_V3_HAS_DEFLATE)
    /* Use V2 deflate implementation */
    size_t uncomp_size = dst_size;
    bool ok = tinyexr::huffman::inflate_zlib(src, src_size, tmpBuf, &uncomp_size);
    if (!ok) {
        ctx->allocator.free(ctx->allocator.userdata, tmpBuf, dst_size);
        return EXR_ERROR_DECOMPRESSION_FAILED;
    }
#elif defined(TINYEXR_V3_USE_MINIZ)
    /* Fall back to miniz */
    mz_ulong uncomp_size = (mz_ulong)dst_size;
    int ret = mz_uncompress(tmpBuf, &uncomp_size, src, (mz_ulong)src_size);
    if (ret != MZ_OK) {
        ctx->allocator.free(ctx->allocator.userdata, tmpBuf, dst_size);
        return EXR_ERROR_DECOMPRESSION_FAILED;
    }
#else
    ctx->allocator.free(ctx->allocator.userdata, tmpBuf, dst_size);
    (void)src; (void)src_size; (void)dst; (void)dst_size; (void)out_size;
    return EXR_ERROR_UNSUPPORTED_FORMAT;
#endif

    /* Apply EXR predictor (delta decoding) */
    {
        uint8_t* t = tmpBuf + 1;
        uint8_t* stop = tmpBuf + uncomp_size;
        while (t < stop) {
            int d = (int)t[-1] + (int)t[0] - 128;
            t[0] = (uint8_t)d;
            ++t;
        }
    }

    /* Reorder pixel data (interleave two halves) */
    {
        const uint8_t* t1 = tmpBuf;
        const uint8_t* t2 = tmpBuf + (uncomp_size + 1) / 2;
        uint8_t* s = dst;
        uint8_t* stop = dst + uncomp_size;

        while (s < stop) {
            if (s < stop) *s++ = *t1++;
            if (s < stop) *s++ = *t2++;
        }
    }

    ctx->allocator.free(ctx->allocator.userdata, tmpBuf, dst_size);
    *out_size = uncomp_size;
    return EXR_SUCCESS;
}

/* ============================================================================
 * Command Execution (Decompression)
 * ============================================================================ */

/* Get lines per block for a compression type */
static int get_lines_per_block(uint8_t compression) {
    switch (compression) {
        case EXR_COMPRESSION_NONE:
        case EXR_COMPRESSION_RLE:
        case EXR_COMPRESSION_ZIPS:
            return 1;
        case EXR_COMPRESSION_ZIP:
        case EXR_COMPRESSION_PXR24:
            return 16;
        case EXR_COMPRESSION_PIZ:
        case EXR_COMPRESSION_B44:
        case EXR_COMPRESSION_B44A:
        case EXR_COMPRESSION_DWAA:
            return 32;
        case EXR_COMPRESSION_DWAB:
            return 256;
        default:
            return 1;
    }
}

/* Calculate bytes per pixel for a channel */
static int get_bytes_per_pixel(uint32_t pixel_type) {
    switch (pixel_type) {
        case EXR_PIXEL_UINT:   return 4;
        case EXR_PIXEL_HALF:   return 2;
        case EXR_PIXEL_FLOAT:  return 4;
        default:               return 2;
    }
}

/* ============================================================================
 * PIZ Decompression
 * ============================================================================ */

#define PIZ_BITMAP_SIZE 8192
#define PIZ_USHORT_RANGE 65536
#define PIZ_HUF_ENCBITS 16
#define PIZ_HUF_ENCSIZE ((1 << PIZ_HUF_ENCBITS) + 1)

/* PIZ channel data structure */
typedef struct {
    uint16_t* start;
    uint16_t* end;
    int nx;
    int ny;
    int size;  /* 1 for HALF, 2 for FLOAT/UINT */
} PizChannelData;

/* Build reverse LUT from bitmap */
static uint16_t piz_reverse_lut_from_bitmap(const uint8_t* bitmap, uint16_t* lut) {
    int k = 0;  /* Use int to avoid overflow when comparing with 65536 */
    for (int i = 0; i < PIZ_USHORT_RANGE; i++) {
        if (i == 0 || (bitmap[i >> 3] & (1 << (i & 7)))) {
            lut[k++] = (uint16_t)i;
        }
    }
    uint16_t n = (uint16_t)(k - 1);
    while (k < PIZ_USHORT_RANGE) {
        lut[k++] = 0;
    }
    return n;
}

/* Apply LUT to data */
static void piz_apply_lut(const uint16_t* lut, uint16_t* data, int n) {
    for (int i = 0; i < n; i++) {
        data[i] = lut[data[i]];
    }
}

/* Wavelet decode (16-bit lifting scheme) */
static void piz_wav2_decode(uint16_t* in, int nx, int ox, int ny, int oy, uint16_t mx) {
    int w14 = (mx < (1 << 14)) ? (mx + 1) : (1 << 14);
    int n = (nx > ny) ? ny : nx;
    int p = 1;
    int p2;

    while (p <= n) p <<= 1;
    p >>= 1;
    p2 = p;
    p >>= 1;

    for (; p >= 1; p2 = p, p >>= 1) {
        uint16_t* py = in;
        uint16_t* ey = in + oy * (ny - p2);
        int oy1 = oy * p;
        int oy2 = oy * p2;
        int ox1 = ox * p;
        int ox2 = ox * p2;

        for (; py <= ey; py += oy2) {
            uint16_t* px = py;
            uint16_t* ex = py + ox * (nx - p2);

            for (; px <= ex; px += ox2) {
                uint16_t* p00 = px;
                uint16_t* p10 = px + ox1;
                uint16_t* p01 = px + oy1;
                uint16_t* p11 = px + ox1 + oy1;

                uint16_t s00 = *p00;
                uint16_t s10 = *p10;
                uint16_t s01 = *p01;
                uint16_t s11 = *p11;

                /* Wdec14 for s00, s10 */
                int d = s10;
                int m = s00;
                if (d > (w14 - 1) || d < -(w14 - 1)) {
                    m = ((d >= 0) ? (d - (w14 - 1)) : (d + (w14 - 1)));
                    d -= m;
                }
                s10 = (uint16_t)(s00 + d);
                s00 = (uint16_t)(s00 - d);

                /* Wdec14 for s01, s11 */
                d = s11;
                m = s01;
                if (d > (w14 - 1) || d < -(w14 - 1)) {
                    m = ((d >= 0) ? (d - (w14 - 1)) : (d + (w14 - 1)));
                    d -= m;
                }
                s11 = (uint16_t)(s01 + d);
                s01 = (uint16_t)(s01 - d);

                /* Wdec14 for s00, s01 */
                d = s01;
                m = s00;
                if (d > (w14 - 1) || d < -(w14 - 1)) {
                    m = ((d >= 0) ? (d - (w14 - 1)) : (d + (w14 - 1)));
                    d -= m;
                }
                *p01 = (uint16_t)(s00 + d);
                *p00 = (uint16_t)(s00 - d);

                /* Wdec14 for s10, s11 */
                d = s11;
                m = s10;
                if (d > (w14 - 1) || d < -(w14 - 1)) {
                    m = ((d >= 0) ? (d - (w14 - 1)) : (d + (w14 - 1)));
                    d -= m;
                }
                *p11 = (uint16_t)(s10 + d);
                *p10 = (uint16_t)(s10 - d);
            }

            /* Handle remaining column if width is odd */
            if ((nx & p) != 0) {
                uint16_t* p00 = px;
                uint16_t* p01 = px + oy1;

                uint16_t s00 = *p00;
                uint16_t s01 = *p01;

                int d = s01;
                if (d > (w14 - 1) || d < -(w14 - 1)) {
                    d = ((d >= 0) ? (d - (w14 - 1)) : (d + (w14 - 1)));
                }
                *p01 = (uint16_t)(s00 + d);
                *p00 = (uint16_t)(s00 - d);
            }
        }

        /* Handle remaining row if height is odd */
        if ((ny & p) != 0) {
            uint16_t* px = py;
            uint16_t* ex = py + ox * (nx - p2);

            for (; px <= ex; px += ox2) {
                uint16_t* p00 = px;
                uint16_t* p10 = px + ox1;

                uint16_t s00 = *p00;
                uint16_t s10 = *p10;

                int d = s10;
                if (d > (w14 - 1) || d < -(w14 - 1)) {
                    d = ((d >= 0) ? (d - (w14 - 1)) : (d + (w14 - 1)));
                }
                *p10 = (uint16_t)(s00 + d);
                *p00 = (uint16_t)(s00 - d);
            }
        }
    }
}

/* Huffman table entry */
typedef struct {
    uint64_t code;
    int len;
} HufCode;

/* Huffman decoder table for fast path */
#define HUF_DECBITS 10
#define HUF_DECSIZE (1 << HUF_DECBITS)
#define HUF_DECMASK (HUF_DECSIZE - 1)

/* Decode Huffman symbol using table lookup */
static int piz_huf_decode_symbol(const uint64_t* hdec, const uint16_t* hdec_short,
                                  const uint8_t* data, size_t data_len,
                                  size_t* bit_pos, uint64_t* buffer, int* bits_in_buffer) {
    /* Refill buffer if needed */
    while (*bits_in_buffer < 32 && (*bit_pos / 8) < data_len) {
        size_t byte_pos = *bit_pos / 8;
        int bit_offset = *bit_pos % 8;
        *buffer |= ((uint64_t)data[byte_pos] >> bit_offset) << *bits_in_buffer;
        int bits_taken = 8 - bit_offset;
        *bits_in_buffer += bits_taken;
        *bit_pos += bits_taken;
    }

    /* Fast path: table lookup for short codes */
    int idx = *buffer & HUF_DECMASK;
    int len = hdec_short[idx] & 0x3F;
    if (len > 0 && len <= HUF_DECBITS) {
        int sym = hdec_short[idx] >> 6;
        *buffer >>= len;
        *bits_in_buffer -= len;
        return sym;
    }

    /* Slow path: linear search through longer codes */
    /* This is a simplified fallback - real implementation would use canonical codes */
    return -1;  /* Error: symbol not found */
}

/* Simplified Huffman decompression (V1-compatible format) */
static bool piz_huf_uncompress(const uint8_t* in, size_t in_len,
                                uint16_t* out, size_t out_len) {
    if (in_len < 20) return false;

    /* Read header */
    uint32_t im_val, iM_val, nBits_val;
    memcpy(&im_val, in, 4);
    memcpy(&iM_val, in + 4, 4);
    memcpy(&nBits_val, in + 12, 4);  /* nBits at offset 12 */

    if (im_val >= PIZ_HUF_ENCSIZE || iM_val >= PIZ_HUF_ENCSIZE || im_val > iM_val) {
        return false;
    }

    const uint8_t* ptr = in + 20;  /* Skip header */
    size_t remaining = in_len - 20;

    /* Read Huffman table: for each symbol from im to iM, read code length and code */
    uint64_t codes[PIZ_HUF_ENCSIZE] = {0};
    uint8_t lengths[PIZ_HUF_ENCSIZE] = {0};

    for (uint32_t i = im_val; i <= iM_val; /* incremented in loop */) {
        if (remaining < 1) return false;

        uint8_t l = *ptr++;
        remaining--;

        if (l >= 59) {
            /* Run of zero-length codes */
            uint32_t n = l - 59 + 2;
            i += n;
        } else if (l >= 0x3F) {
            /* Long code: 6 bits length + code */
            if (remaining < 4) return false;
            uint32_t packed;
            memcpy(&packed, ptr, 4);
            ptr += 4;
            remaining -= 4;
            lengths[i] = (uint8_t)(packed & 0x3F);
            codes[i] = packed >> 6;
            i++;
        } else {
            lengths[i] = l;
            /* Code follows based on length */
            if (l > 0) {
                int code_bytes = (l + 7) / 8;
                if ((size_t)code_bytes > remaining) return false;
                uint64_t code = 0;
                for (int b = 0; b < code_bytes; b++) {
                    code |= ((uint64_t)ptr[b]) << (b * 8);
                }
                ptr += code_bytes;
                remaining -= code_bytes;
                codes[i] = code;
            }
            i++;
        }
    }

    /* Build decoding table for fast lookup */
    uint16_t dec_table[HUF_DECSIZE] = {0};
    for (uint32_t sym = im_val; sym <= iM_val; sym++) {
        int len = lengths[sym];
        if (len > 0 && len <= HUF_DECBITS) {
            uint64_t code = codes[sym];
            int fill_count = 1 << (HUF_DECBITS - len);
            for (int f = 0; f < fill_count; f++) {
                int idx = (int)(code | (f << len));
                if (idx < HUF_DECSIZE) {
                    dec_table[idx] = (uint16_t)((sym << 6) | len);
                }
            }
        }
    }

    /* Decode symbols */
    uint64_t buffer = 0;
    int bits_in_buffer = 0;
    size_t bit_pos = 0;
    const uint8_t* bit_data = ptr;
    size_t bit_data_len = remaining;

    /* Initialize buffer */
    while (bits_in_buffer < 64 && bit_pos < bit_data_len * 8) {
        size_t byte_idx = bit_pos / 8;
        if (byte_idx < bit_data_len) {
            buffer |= ((uint64_t)bit_data[byte_idx]) << bits_in_buffer;
            bits_in_buffer += 8;
            bit_pos += 8;
        }
    }

    for (size_t i = 0; i < out_len; i++) {
        /* Refill buffer */
        while (bits_in_buffer < 32) {
            size_t byte_idx = bit_pos / 8;
            if (byte_idx >= bit_data_len) break;
            buffer |= ((uint64_t)bit_data[byte_idx]) << bits_in_buffer;
            bits_in_buffer += 8;
            bit_pos += 8;
        }

        /* Fast decode using table */
        int idx = buffer & HUF_DECMASK;
        uint16_t entry = dec_table[idx];
        int len = entry & 0x3F;
        if (len > 0 && len <= HUF_DECBITS) {
            out[i] = (uint16_t)(entry >> 6);
            buffer >>= len;
            bits_in_buffer -= len;
        } else {
            /* Slow path: search for longer codes */
            bool found = false;
            for (int test_len = HUF_DECBITS + 1; test_len <= 58 && !found; test_len++) {
                uint64_t mask = (1ULL << test_len) - 1;
                uint64_t test_code = buffer & mask;
                for (uint32_t sym = im_val; sym <= iM_val; sym++) {
                    if (lengths[sym] == test_len && codes[sym] == test_code) {
                        out[i] = (uint16_t)sym;
                        buffer >>= test_len;
                        bits_in_buffer -= test_len;
                        found = true;
                        break;
                    }
                }
            }
            if (!found) {
                return false;  /* Decode error */
            }
        }
    }

    return true;
}

/* PIZ decompression */
static ExrResult decompress_piz(const uint8_t* src, size_t src_size,
                                 uint8_t* dst, size_t dst_size,
                                 size_t* out_size,
                                 int num_channels, ExrChannelData* channels,
                                 int data_width, int num_lines,
                                 ExrContext ctx) {
    /* Handle uncompressed case */
    if (src_size == dst_size) {
        memcpy(dst, src, src_size);
        *out_size = src_size;
        return EXR_SUCCESS;
    }

#if defined(TINYEXR_V3_HAS_PIZ)
    /* Use V2 PIZ implementation - convert channel info
     * Note: v2::Channel uses std::string, so we must use new/delete */
    tinyexr::v2::Channel* v2_channels = new (std::nothrow) tinyexr::v2::Channel[num_channels];
    if (!v2_channels) {
        return EXR_ERROR_OUT_OF_MEMORY;
    }

    for (int i = 0; i < num_channels; i++) {
        v2_channels[i].name = channels[i].name;  /* name is char[64], always valid */
        v2_channels[i].pixel_type = (int)channels[i].pixel_type;
        v2_channels[i].x_sampling = channels[i].x_sampling;
        v2_channels[i].y_sampling = channels[i].y_sampling;
        v2_channels[i].p_linear = channels[i].p_linear;
    }

    auto result = tinyexr::piz::DecompressPizV2(
        dst, dst_size, src, src_size,
        num_channels, v2_channels, data_width, num_lines);

    delete[] v2_channels;

    if (!result.success) {
        return EXR_ERROR_DECOMPRESSION_FAILED;
    }

    *out_size = dst_size;
    return EXR_SUCCESS;
#else
    /* No PIZ implementation available */
    (void)src; (void)src_size; (void)dst; (void)dst_size;
    (void)out_size; (void)num_channels; (void)channels;
    (void)data_width; (void)num_lines; (void)ctx;
    return EXR_ERROR_UNSUPPORTED_FORMAT;
#endif
}

/* RLE decompression (OpenEXR format)
   Format (signed byte interpretation):
   - Negative value (-n): followed by n literal bytes (copy them)
   - Non-negative value (n): next byte repeated n+1 times
   After RLE decode, applies predictor and reorder like ZIP compression */
static ExrResult decompress_rle(const uint8_t* src, size_t src_size,
                                 uint8_t* dst, size_t dst_size,
                                 size_t* out_size) {
    /* Handle uncompressed data (size matches expected) */
    if (src_size == dst_size) {
        memcpy(dst, src, src_size);
        *out_size = src_size;
        return EXR_SUCCESS;
    }

    /* Allocate temp buffer for RLE-decoded data (before predictor/reorder) */
    uint8_t* tmpBuf = (uint8_t*)malloc(dst_size);
    if (!tmpBuf) {
        return EXR_ERROR_OUT_OF_MEMORY;
    }

    /* RLE decode into temp buffer */
    const signed char* in = (const signed char*)src;
    const signed char* in_end = in + src_size;
    uint8_t* out = tmpBuf;
    uint8_t* out_end = tmpBuf + dst_size;

    while (in < in_end && out < out_end) {
        signed char count = *in++;

        if (count < 0) {
            /* Literal run: -count bytes follow */
            size_t len = (size_t)(-count);
            if (in + len > in_end || out + len > out_end) {
                free(tmpBuf);
                return EXR_ERROR_INVALID_DATA;
            }
            memcpy(out, in, len);
            out += len;
            in += len;
        } else {
            /* RLE run: repeat next byte (count + 1) times */
            size_t len = (size_t)count + 1;
            if (in >= in_end || out + len > out_end) {
                free(tmpBuf);
                return EXR_ERROR_INVALID_DATA;
            }
            uint8_t val = (uint8_t)*in++;
            memset(out, val, len);
            out += len;
        }
    }

    size_t uncomp_size = (size_t)(out - tmpBuf);

    /* Apply EXR predictor (delta decoding) */
    {
        uint8_t* t = tmpBuf + 1;
        uint8_t* stop = tmpBuf + uncomp_size;
        while (t < stop) {
            int d = (int)t[-1] + (int)t[0] - 128;
            t[0] = (uint8_t)d;
            ++t;
        }
    }

    /* Reorder pixel data (interleave two halves) */
    {
        const uint8_t* t1 = tmpBuf;
        const uint8_t* t2 = tmpBuf + (uncomp_size + 1) / 2;
        uint8_t* s = dst;
        uint8_t* stop = dst + uncomp_size;

        while (s < stop) {
            if (s < stop) *s++ = *t1++;
            if (s < stop) *s++ = *t2++;
        }
    }

    free(tmpBuf);
    *out_size = uncomp_size;
    return EXR_SUCCESS;
}

/* Reconstruct interleaved channels to planar format */
static void deinterleave_channels(const uint8_t* src, uint8_t* dst,
                                   int width, int height, int num_channels,
                                   int bytes_per_channel) {
    size_t pixel_stride = num_channels * bytes_per_channel;
    size_t channel_size = (size_t)width * height * bytes_per_channel;

    for (int c = 0; c < num_channels; c++) {
        uint8_t* channel_dst = dst + c * channel_size;
        for (int y = 0; y < height; y++) {
            for (int x = 0; x < width; x++) {
                const uint8_t* pixel_src = src + (y * width + x) * pixel_stride;
                memcpy(channel_dst + (y * width + x) * bytes_per_channel,
                       pixel_src + c * bytes_per_channel,
                       bytes_per_channel);
            }
        }
    }
}

/* Read and decompress a single chunk */
static ExrResult read_chunk(ExrDecoder decoder, ExrPartData* part, uint32_t chunk_index,
                            uint8_t** out_data, size_t* out_size,
                            int* out_y_start, int* out_num_lines) {
    ExrContext ctx = decoder->ctx;
    ExrResult result;

    if (chunk_index >= part->num_chunks) {
        return EXR_ERROR_INVALID_ARGUMENT;
    }

    uint64_t offset = part->offsets[chunk_index];

    /* Read chunk header (y coordinate + data size) */
    uint8_t header[8];
    result = sync_fetch(decoder, offset, 8, header);
    if (EXR_FAILED(result)) return result;

    int32_t y_coord = read_le_i32(header);
    uint32_t data_size = read_le_u32(header + 4);

    /* Validate data size */
    if (data_size > 128 * 1024 * 1024) {  /* 128MB max */
        exr_context_add_error(ctx, EXR_ERROR_INVALID_DATA,
                              "Chunk data size too large", "chunk", offset);
        return EXR_ERROR_INVALID_DATA;
    }

    /* Calculate expected uncompressed size */
    int lines_per_block = get_lines_per_block(part->compression);
    int y_start = y_coord;
    int y_end = y_coord + lines_per_block;
    if (y_end > part->height) {
        y_end = part->height;
    }
    int num_lines = y_end - y_start;

    size_t bytes_per_line = 0;
    for (uint32_t c = 0; c < part->num_channels; c++) {
        bytes_per_line += (size_t)part->width * get_bytes_per_pixel(part->channels[c].pixel_type);
    }
    size_t expected_size = bytes_per_line * num_lines;

    /* Allocate compressed data buffer */
    uint8_t* compressed = (uint8_t*)ctx->allocator.alloc(
        ctx->allocator.userdata, data_size, EXR_DEFAULT_ALIGNMENT);
    if (!compressed) {
        return EXR_ERROR_OUT_OF_MEMORY;
    }

    /* Read compressed data */
    result = sync_fetch(decoder, offset + 8, data_size, compressed);
    if (EXR_FAILED(result)) {
        ctx->allocator.free(ctx->allocator.userdata, compressed, data_size);
        return result;
    }

    /* Allocate decompressed buffer */
    uint8_t* decompressed = (uint8_t*)ctx->allocator.alloc(
        ctx->allocator.userdata, expected_size, EXR_DEFAULT_ALIGNMENT);
    if (!decompressed) {
        ctx->allocator.free(ctx->allocator.userdata, compressed, data_size);
        return EXR_ERROR_OUT_OF_MEMORY;
    }

    /* Decompress based on compression type */
    size_t decompressed_size = 0;
    switch (part->compression) {
        case EXR_COMPRESSION_NONE:
            if (data_size != expected_size) {
                ctx->allocator.free(ctx->allocator.userdata, compressed, data_size);
                ctx->allocator.free(ctx->allocator.userdata, decompressed, expected_size);
                return EXR_ERROR_INVALID_DATA;
            }
            memcpy(decompressed, compressed, data_size);
            decompressed_size = data_size;
            break;

        case EXR_COMPRESSION_RLE:
            result = decompress_rle(compressed, data_size, decompressed,
                                     expected_size, &decompressed_size);
            if (EXR_FAILED(result)) {
                ctx->allocator.free(ctx->allocator.userdata, compressed, data_size);
                ctx->allocator.free(ctx->allocator.userdata, decompressed, expected_size);
                return result;
            }
            break;

        case EXR_COMPRESSION_ZIP:
        case EXR_COMPRESSION_ZIPS:
            result = decompress_zip(compressed, data_size, decompressed,
                                     expected_size, &decompressed_size, ctx);
            if (EXR_FAILED(result)) {
                exr_context_add_error(ctx, result,
                                      "ZIP decompression failed", "chunk", offset);
                ctx->allocator.free(ctx->allocator.userdata, compressed, data_size);
                ctx->allocator.free(ctx->allocator.userdata, decompressed, expected_size);
                return result;
            }
            break;

        case EXR_COMPRESSION_PIZ: {
#if defined(TINYEXR_V3_USE_V1_PIZ)
            /* Use V1's DecompressPiz - construct EXRChannelInfo array */
            EXRChannelInfo* v1_channels = (EXRChannelInfo*)ctx->allocator.alloc(
                ctx->allocator.userdata, part->num_channels * sizeof(EXRChannelInfo),
                EXR_DEFAULT_ALIGNMENT);
            if (!v1_channels) {
                ctx->allocator.free(ctx->allocator.userdata, compressed, data_size);
                ctx->allocator.free(ctx->allocator.userdata, decompressed, expected_size);
                return EXR_ERROR_OUT_OF_MEMORY;
            }

            for (uint32_t c = 0; c < part->num_channels; c++) {
                memset(&v1_channels[c], 0, sizeof(EXRChannelInfo));
                v1_channels[c].pixel_type = part->channels[c].pixel_type;
                v1_channels[c].x_sampling = part->channels[c].x_sampling;
                v1_channels[c].y_sampling = part->channels[c].y_sampling;
            }

            bool piz_ok = tinyexr_v3_decompress_piz(
                decompressed, compressed, expected_size, data_size,
                static_cast<int>(part->num_channels), v1_channels,
                part->width, num_lines);

            ctx->allocator.free(ctx->allocator.userdata, v1_channels,
                               part->num_channels * sizeof(EXRChannelInfo));

            if (!piz_ok) {
                exr_context_add_error(ctx, EXR_ERROR_DECOMPRESSION_FAILED,
                                      "PIZ decompression failed", "chunk", offset);
                ctx->allocator.free(ctx->allocator.userdata, compressed, data_size);
                ctx->allocator.free(ctx->allocator.userdata, decompressed, expected_size);
                return EXR_ERROR_DECOMPRESSION_FAILED;
            }
            decompressed_size = expected_size;
#else
            /* Set up channel data for PIZ decompression */
            ExrChannelData* piz_channels = (ExrChannelData*)ctx->allocator.alloc(
                ctx->allocator.userdata, part->num_channels * sizeof(ExrChannelData),
                EXR_DEFAULT_ALIGNMENT);
            if (!piz_channels) {
                ctx->allocator.free(ctx->allocator.userdata, compressed, data_size);
                ctx->allocator.free(ctx->allocator.userdata, decompressed, expected_size);
                return EXR_ERROR_OUT_OF_MEMORY;
            }

            for (uint32_t c = 0; c < part->num_channels; c++) {
                piz_channels[c].pixel_type = part->channels[c].pixel_type;
                piz_channels[c].x_sampling = part->channels[c].x_sampling;
                piz_channels[c].y_sampling = part->channels[c].y_sampling;
            }

            result = decompress_piz(compressed, data_size, decompressed,
                                     expected_size, &decompressed_size,
                                     part->num_channels, piz_channels,
                                     part->width, num_lines, ctx);

            ctx->allocator.free(ctx->allocator.userdata, piz_channels,
                               part->num_channels * sizeof(ExrChannelData));

            if (EXR_FAILED(result)) {
                exr_context_add_error(ctx, result,
                                      "PIZ decompression failed", "chunk", offset);
                ctx->allocator.free(ctx->allocator.userdata, compressed, data_size);
                ctx->allocator.free(ctx->allocator.userdata, decompressed, expected_size);
                return result;
            }
#endif
            break;
        }

        case EXR_COMPRESSION_PXR24: {
#if defined(TINYEXR_V3_HAS_PXR24)
            /* Use V2 PXR24 implementation - convert channel info
             * Note: v2::Channel uses std::string, so we must use new/delete */
            tinyexr::v2::Channel* v2_channels = new (std::nothrow) tinyexr::v2::Channel[part->num_channels];
            if (!v2_channels) {
                ctx->allocator.free(ctx->allocator.userdata, compressed, data_size);
                ctx->allocator.free(ctx->allocator.userdata, decompressed, expected_size);
                return EXR_ERROR_OUT_OF_MEMORY;
            }

            for (uint32_t c = 0; c < part->num_channels; c++) {
                v2_channels[c].name = part->channels[c].name;  /* name is char[64], always valid */
                v2_channels[c].pixel_type = (int)part->channels[c].pixel_type;
                v2_channels[c].x_sampling = part->channels[c].x_sampling;
                v2_channels[c].y_sampling = part->channels[c].y_sampling;
                v2_channels[c].p_linear = part->channels[c].p_linear;
            }

            /* Calculate expected PXR24 intermediate size */
            size_t pxr24_size = 0;
            for (uint32_t c = 0; c < part->num_channels; c++) {
                int ch_width = part->width / v2_channels[c].x_sampling;
                int ch_height = num_lines / v2_channels[c].y_sampling;
                int ch_pixels = ch_width * ch_height;
                switch (v2_channels[c].pixel_type) {
                    case 0: pxr24_size += (size_t)ch_pixels * 4; break; /* UINT */
                    case 1: pxr24_size += (size_t)ch_pixels * 2; break; /* HALF */
                    case 2: pxr24_size += (size_t)ch_pixels * 3; break; /* FLOAT */
                }
            }

            /* Decompress zlib using V2 deflate */
            uint8_t* pxr24_buf = (uint8_t*)ctx->allocator.alloc(
                ctx->allocator.userdata, pxr24_size, EXR_DEFAULT_ALIGNMENT);
            if (!pxr24_buf) {
                delete[] v2_channels;
                ctx->allocator.free(ctx->allocator.userdata, compressed, data_size);
                ctx->allocator.free(ctx->allocator.userdata, decompressed, expected_size);
                return EXR_ERROR_OUT_OF_MEMORY;
            }

            bool pxr24_ok = false;
            if (pxr24_size == data_size) {
                /* Uncompressed */
                memcpy(pxr24_buf, compressed, data_size);
                pxr24_ok = true;
            } else {
                /* Decompress with V2 deflate */
                size_t uncomp_size = pxr24_size;
                pxr24_ok = tinyexr::huffman::inflate_zlib(compressed, data_size, pxr24_buf, &uncomp_size);
                if (pxr24_ok && uncomp_size != pxr24_size) {
                    pxr24_ok = false;
                }
            }

            if (pxr24_ok) {
                /* Convert PXR24 to standard EXR format (per-scanline interleaved)
                 * PXR24 uses:
                 * 1. Byte plane separation: bytes stored by plane (high bytes, then low bytes)
                 * 2. Delta encoding: each pixel is difference from previous
                 */
                const uint8_t* in_ptr = pxr24_buf;
                uint8_t* out_ptr = decompressed;

                for (int line = 0; line < num_lines; line++) {
                    for (uint32_t c = 0; c < part->num_channels; c++) {
                        int w = part->width / v2_channels[c].x_sampling;
                        if ((line % v2_channels[c].y_sampling) != 0) continue;

                        switch (v2_channels[c].pixel_type) {
                            case 0: { /* UINT - 4 byte planes with delta encoding */
                                const uint8_t* ptr0 = in_ptr;
                                const uint8_t* ptr1 = in_ptr + w;
                                const uint8_t* ptr2 = in_ptr + w * 2;
                                const uint8_t* ptr3 = in_ptr + w * 3;
                                in_ptr += w * 4;

                                uint32_t pixel = 0;
                                for (int x = 0; x < w; x++) {
                                    uint32_t diff = ((uint32_t)ptr0[x] << 24) |
                                                    ((uint32_t)ptr1[x] << 16) |
                                                    ((uint32_t)ptr2[x] << 8) |
                                                    ((uint32_t)ptr3[x]);
                                    pixel += diff;
                                    memcpy(out_ptr, &pixel, 4);
                                    out_ptr += 4;
                                }
                                break;
                            }
                            case 1: { /* HALF - 2 byte planes with delta encoding */
                                const uint8_t* ptr0 = in_ptr;
                                const uint8_t* ptr1 = in_ptr + w;
                                in_ptr += w * 2;

                                uint32_t pixel = 0;
                                for (int x = 0; x < w; x++) {
                                    uint32_t diff = ((uint32_t)ptr0[x] << 8) |
                                                    ((uint32_t)ptr1[x]);
                                    pixel += diff;
                                    uint16_t h = (uint16_t)pixel;
                                    memcpy(out_ptr, &h, 2);
                                    out_ptr += 2;
                                }
                                break;
                            }
                            case 2: { /* FLOAT - 3 byte planes with delta encoding */
                                const uint8_t* ptr0 = in_ptr;
                                const uint8_t* ptr1 = in_ptr + w;
                                const uint8_t* ptr2 = in_ptr + w * 2;
                                in_ptr += w * 3;

                                uint32_t pixel = 0;
                                for (int x = 0; x < w; x++) {
                                    uint32_t diff = ((uint32_t)ptr0[x] << 24) |
                                                    ((uint32_t)ptr1[x] << 16) |
                                                    ((uint32_t)ptr2[x] << 8);
                                    pixel += diff;
                                    memcpy(out_ptr, &pixel, 4);
                                    out_ptr += 4;
                                }
                                break;
                            }
                        }
                    }
                }
            }

            ctx->allocator.free(ctx->allocator.userdata, pxr24_buf, pxr24_size);
            delete[] v2_channels;

            if (!pxr24_ok) {
                exr_context_add_error(ctx, EXR_ERROR_DECOMPRESSION_FAILED,
                                      "PXR24 decompression failed", "chunk", offset);
                ctx->allocator.free(ctx->allocator.userdata, compressed, data_size);
                ctx->allocator.free(ctx->allocator.userdata, decompressed, expected_size);
                return EXR_ERROR_DECOMPRESSION_FAILED;
            }
            decompressed_size = expected_size;
#else
            exr_context_add_error(ctx, EXR_ERROR_UNSUPPORTED_FORMAT,
                                  "PXR24 compression not supported",
                                  "chunk", offset);
            ctx->allocator.free(ctx->allocator.userdata, compressed, data_size);
            ctx->allocator.free(ctx->allocator.userdata, decompressed, expected_size);
            return EXR_ERROR_UNSUPPORTED_FORMAT;
#endif
            break;
        }

        case EXR_COMPRESSION_B44:
        case EXR_COMPRESSION_B44A: {
#if defined(TINYEXR_V3_HAS_B44)
            /* Use V2 B44 implementation - convert channel info
             * Note: v2::Channel uses std::string, so we must use new/delete */
            tinyexr::v2::Channel* v2_channels = new (std::nothrow) tinyexr::v2::Channel[part->num_channels];
            if (!v2_channels) {
                ctx->allocator.free(ctx->allocator.userdata, compressed, data_size);
                ctx->allocator.free(ctx->allocator.userdata, decompressed, expected_size);
                return EXR_ERROR_OUT_OF_MEMORY;
            }

            for (uint32_t c = 0; c < part->num_channels; c++) {
                v2_channels[c].name = part->channels[c].name;  /* name is char[64], always valid */
                v2_channels[c].pixel_type = (int)part->channels[c].pixel_type;
                v2_channels[c].x_sampling = part->channels[c].x_sampling;
                v2_channels[c].y_sampling = part->channels[c].y_sampling;
                v2_channels[c].p_linear = part->channels[c].p_linear;
            }

            bool is_b44a = (part->compression == EXR_COMPRESSION_B44A);
            tinyexr::v2::ScratchPool pool;

            /* DecompressB44V2 outputs per-scanline interleaved layout directly */
            bool b44_ok = tinyexr::v2::DecompressB44V2(
                decompressed, expected_size,
                compressed, data_size,
                part->width, num_lines,
                part->num_channels, v2_channels, is_b44a, pool);

            delete[] v2_channels;

            if (!b44_ok) {
                exr_context_add_error(ctx, EXR_ERROR_DECOMPRESSION_FAILED,
                                      "B44 decompression failed", "chunk", offset);
                ctx->allocator.free(ctx->allocator.userdata, compressed, data_size);
                ctx->allocator.free(ctx->allocator.userdata, decompressed, expected_size);
                return EXR_ERROR_DECOMPRESSION_FAILED;
            }
            decompressed_size = expected_size;
#else
            exr_context_add_error(ctx, EXR_ERROR_UNSUPPORTED_FORMAT,
                                  "B44 compression not supported",
                                  "chunk", offset);
            ctx->allocator.free(ctx->allocator.userdata, compressed, data_size);
            ctx->allocator.free(ctx->allocator.userdata, decompressed, expected_size);
            return EXR_ERROR_UNSUPPORTED_FORMAT;
#endif
            break;
        }

        default:
            ctx->allocator.free(ctx->allocator.userdata, compressed, data_size);
            ctx->allocator.free(ctx->allocator.userdata, decompressed, expected_size);
            return EXR_ERROR_UNSUPPORTED_FORMAT;
    }

    ctx->allocator.free(ctx->allocator.userdata, compressed, data_size);

    *out_data = decompressed;
    *out_size = decompressed_size;
    *out_y_start = y_start;
    *out_num_lines = num_lines;

    return EXR_SUCCESS;
}

/* ============================================================================
 * Tiled Image Reading Helpers
 * ============================================================================ */

/* Calculate the number of tiles at a given mipmap level */
static void calc_level_size(ExrPartData* part, int level_x, int level_y,
                            int* out_width, int* out_height,
                            int* out_num_x_tiles, int* out_num_y_tiles) {
    int level_width = part->width;
    int level_height = part->height;

    /* Calculate level dimensions based on level mode and rounding mode */
    if (part->tile_level_mode == EXR_TILE_MIPMAP_LEVELS) {
        int level = level_x;  /* For mipmap, level_x == level_y */
        for (int i = 0; i < level; i++) {
            if (part->tile_rounding_mode == EXR_TILE_ROUND_UP) {
                level_width = (level_width + 1) / 2;
                level_height = (level_height + 1) / 2;
            } else {
                level_width = level_width / 2;
                level_height = level_height / 2;
            }
            if (level_width < 1) level_width = 1;
            if (level_height < 1) level_height = 1;
        }
    } else if (part->tile_level_mode == EXR_TILE_RIPMAP_LEVELS) {
        /* Ripmap has independent X and Y levels */
        for (int i = 0; i < level_x; i++) {
            if (part->tile_rounding_mode == EXR_TILE_ROUND_UP) {
                level_width = (level_width + 1) / 2;
            } else {
                level_width = level_width / 2;
            }
            if (level_width < 1) level_width = 1;
        }
        for (int i = 0; i < level_y; i++) {
            if (part->tile_rounding_mode == EXR_TILE_ROUND_UP) {
                level_height = (level_height + 1) / 2;
            } else {
                level_height = level_height / 2;
            }
            if (level_height < 1) level_height = 1;
        }
    }

    *out_width = level_width;
    *out_height = level_height;
    *out_num_x_tiles = (level_width + (int)part->tile_size_x - 1) / (int)part->tile_size_x;
    *out_num_y_tiles = (level_height + (int)part->tile_size_y - 1) / (int)part->tile_size_y;
}

/* Calculate the tile index in the offset table for a given tile coordinate */
static uint32_t calc_tile_index(ExrPartData* part, int tile_x, int tile_y,
                                 int level_x, int level_y) {
    uint32_t index = 0;

    if (part->tile_level_mode == EXR_TILE_ONE_LEVEL) {
        /* Single level: linear index */
        int num_x_tiles = (part->width + (int)part->tile_size_x - 1) / (int)part->tile_size_x;
        index = (uint32_t)(tile_y * num_x_tiles + tile_x);
    }
    else if (part->tile_level_mode == EXR_TILE_MIPMAP_LEVELS) {
        /* Mipmap: sum of tiles in all previous levels + linear index in current level */
        int level = level_x;

        /* Count tiles in all previous levels */
        for (int l = 0; l < level; l++) {
            int lw, lh, nx, ny;
            calc_level_size(part, l, l, &lw, &lh, &nx, &ny);
            index += (uint32_t)(nx * ny);
        }

        /* Add index within current level */
        int lw, lh, nx, ny;
        calc_level_size(part, level, level, &lw, &lh, &nx, &ny);
        index += (uint32_t)(tile_y * nx + tile_x);
    }
    else if (part->tile_level_mode == EXR_TILE_RIPMAP_LEVELS) {
        /* Ripmap: iterate through all level combinations
         * Levels are ordered: (0,0), (1,0), (2,0), ..., (0,1), (1,1), ...
         * Use pre-calculated num_x_levels and num_y_levels from part */

        /* Count tiles in all previous (level_y, level_x) combinations */
        for (uint32_t ly = 0; ly < (uint32_t)level_y; ly++) {
            for (uint32_t lx = 0; lx < part->num_x_levels; lx++) {
                int lw, lh, nx, ny;
                calc_level_size(part, lx, ly, &lw, &lh, &nx, &ny);
                index += (uint32_t)(nx * ny);
            }
        }
        for (int lx = 0; lx < level_x; lx++) {
            int lw, lh, nx, ny;
            calc_level_size(part, lx, level_y, &lw, &lh, &nx, &ny);
            index += (uint32_t)(nx * ny);
        }

        /* Add index within current level */
        int lw, lh, nx, ny;
        calc_level_size(part, level_x, level_y, &lw, &lh, &nx, &ny);
        index += (uint32_t)(tile_y * nx + tile_x);
    }

    return index;
}

/* Read and decompress a single tile */
static ExrResult read_tile(ExrDecoder decoder, ExrPartData* part,
                           int tile_x, int tile_y, int level_x, int level_y,
                           uint8_t** out_data, size_t* out_size,
                           int* out_width, int* out_height) {
    ExrContext ctx = decoder->ctx;
    ExrResult result;

    uint32_t tile_index = calc_tile_index(part, tile_x, tile_y, level_x, level_y);
    if (tile_index >= part->num_chunks) {
        return EXR_ERROR_INVALID_ARGUMENT;
    }

    uint64_t offset = part->offsets[tile_index];

    /* Read tile header:
     * - tile_x (4 bytes)
     * - tile_y (4 bytes)
     * - level_x (4 bytes)
     * - level_y (4 bytes)
     * - data_size (4 bytes)
     * Total: 20 bytes
     */
    uint8_t header[20];
    result = sync_fetch(decoder, offset, 20, header);
    if (EXR_FAILED(result)) return result;

    /* Read and validate tile coordinates from header */
    int32_t hdr_tile_x = read_le_i32(header);
    int32_t hdr_tile_y = read_le_i32(header + 4);
    int32_t hdr_level_x = read_le_i32(header + 8);
    int32_t hdr_level_y = read_le_i32(header + 12);
    uint32_t data_size = read_le_u32(header + 16);

    /* Validate header matches request */
    if (hdr_tile_x != tile_x || hdr_tile_y != tile_y ||
        hdr_level_x != level_x || hdr_level_y != level_y) {
        exr_context_add_error(ctx, EXR_ERROR_INVALID_DATA,
                              "Tile header mismatch", "tile", offset);
        return EXR_ERROR_INVALID_DATA;
    }

    /* Validate data size */
    if (data_size > 128 * 1024 * 1024) {
        exr_context_add_error(ctx, EXR_ERROR_INVALID_DATA,
                              "Tile data size too large", "tile", offset);
        return EXR_ERROR_INVALID_DATA;
    }

    /* Calculate tile dimensions and expected size */
    int level_width, level_height, num_x_tiles, num_y_tiles;
    calc_level_size(part, level_x, level_y, &level_width, &level_height,
                    &num_x_tiles, &num_y_tiles);

    int tile_start_x = tile_x * (int)part->tile_size_x;
    int tile_start_y = tile_y * (int)part->tile_size_y;
    int tile_end_x = tile_start_x + (int)part->tile_size_x;
    int tile_end_y = tile_start_y + (int)part->tile_size_y;

    if (tile_end_x > level_width) tile_end_x = level_width;
    if (tile_end_y > level_height) tile_end_y = level_height;

    int tile_width = tile_end_x - tile_start_x;
    int tile_height = tile_end_y - tile_start_y;

    size_t bytes_per_line = 0;
    for (uint32_t c = 0; c < part->num_channels; c++) {
        bytes_per_line += (size_t)tile_width * get_bytes_per_pixel(part->channels[c].pixel_type);
    }
    size_t expected_size = bytes_per_line * tile_height;

    /* Allocate compressed data buffer */
    uint8_t* compressed = (uint8_t*)ctx->allocator.alloc(
        ctx->allocator.userdata, data_size, EXR_DEFAULT_ALIGNMENT);
    if (!compressed) {
        return EXR_ERROR_OUT_OF_MEMORY;
    }

    /* Read compressed data */
    result = sync_fetch(decoder, offset + 20, data_size, compressed);
    if (EXR_FAILED(result)) {
        ctx->allocator.free(ctx->allocator.userdata, compressed, data_size);
        return result;
    }

    /* Allocate decompressed buffer */
    uint8_t* decompressed = (uint8_t*)ctx->allocator.alloc(
        ctx->allocator.userdata, expected_size, EXR_DEFAULT_ALIGNMENT);
    if (!decompressed) {
        ctx->allocator.free(ctx->allocator.userdata, compressed, data_size);
        return EXR_ERROR_OUT_OF_MEMORY;
    }

    /* Decompress based on compression type */
    size_t decompressed_size = 0;
    switch (part->compression) {
        case EXR_COMPRESSION_NONE:
            if (data_size != expected_size) {
                ctx->allocator.free(ctx->allocator.userdata, compressed, data_size);
                ctx->allocator.free(ctx->allocator.userdata, decompressed, expected_size);
                return EXR_ERROR_INVALID_DATA;
            }
            memcpy(decompressed, compressed, data_size);
            decompressed_size = data_size;
            break;

        case EXR_COMPRESSION_RLE:
            result = decompress_rle(compressed, data_size, decompressed,
                                     expected_size, &decompressed_size);
            if (EXR_FAILED(result)) {
                ctx->allocator.free(ctx->allocator.userdata, compressed, data_size);
                ctx->allocator.free(ctx->allocator.userdata, decompressed, expected_size);
                return result;
            }
            break;

        case EXR_COMPRESSION_ZIP:
        case EXR_COMPRESSION_ZIPS:
            result = decompress_zip(compressed, data_size, decompressed,
                                     expected_size, &decompressed_size, ctx);
            if (EXR_FAILED(result)) {
                ctx->allocator.free(ctx->allocator.userdata, compressed, data_size);
                ctx->allocator.free(ctx->allocator.userdata, decompressed, expected_size);
                return result;
            }
            break;

        case EXR_COMPRESSION_PIZ: {
            ExrChannelData* piz_channels = (ExrChannelData*)ctx->allocator.alloc(
                ctx->allocator.userdata, part->num_channels * sizeof(ExrChannelData),
                EXR_DEFAULT_ALIGNMENT);
            if (!piz_channels) {
                ctx->allocator.free(ctx->allocator.userdata, compressed, data_size);
                ctx->allocator.free(ctx->allocator.userdata, decompressed, expected_size);
                return EXR_ERROR_OUT_OF_MEMORY;
            }

            for (uint32_t c = 0; c < part->num_channels; c++) {
                piz_channels[c].pixel_type = part->channels[c].pixel_type;
                piz_channels[c].x_sampling = part->channels[c].x_sampling;
                piz_channels[c].y_sampling = part->channels[c].y_sampling;
            }

            result = decompress_piz(compressed, data_size, decompressed,
                                     expected_size, &decompressed_size,
                                     part->num_channels, piz_channels,
                                     tile_width, tile_height, ctx);

            ctx->allocator.free(ctx->allocator.userdata, piz_channels,
                               part->num_channels * sizeof(ExrChannelData));

            if (EXR_FAILED(result)) {
                ctx->allocator.free(ctx->allocator.userdata, compressed, data_size);
                ctx->allocator.free(ctx->allocator.userdata, decompressed, expected_size);
                return result;
            }
            break;
        }

        case EXR_COMPRESSION_PXR24: {
#if defined(TINYEXR_V3_HAS_PXR24)
            /* Use V2 PXR24 implementation for tiles */
            tinyexr::v2::Channel* v2_channels = new (std::nothrow) tinyexr::v2::Channel[part->num_channels];
            if (!v2_channels) {
                ctx->allocator.free(ctx->allocator.userdata, compressed, data_size);
                ctx->allocator.free(ctx->allocator.userdata, decompressed, expected_size);
                return EXR_ERROR_OUT_OF_MEMORY;
            }

            for (uint32_t c = 0; c < part->num_channels; c++) {
                v2_channels[c].name = part->channels[c].name;
                v2_channels[c].pixel_type = (int)part->channels[c].pixel_type;
                v2_channels[c].x_sampling = part->channels[c].x_sampling;
                v2_channels[c].y_sampling = part->channels[c].y_sampling;
                v2_channels[c].p_linear = part->channels[c].p_linear;
            }

            /* Calculate expected PXR24 intermediate size for tile */
            size_t pxr24_size = 0;
            for (uint32_t c = 0; c < part->num_channels; c++) {
                int ch_width = tile_width / v2_channels[c].x_sampling;
                int ch_height = tile_height / v2_channels[c].y_sampling;
                int ch_pixels = ch_width * ch_height;
                switch (v2_channels[c].pixel_type) {
                    case 0: pxr24_size += (size_t)ch_pixels * 4; break; /* UINT */
                    case 1: pxr24_size += (size_t)ch_pixels * 2; break; /* HALF */
                    case 2: pxr24_size += (size_t)ch_pixels * 3; break; /* FLOAT */
                }
            }

            /* Decompress zlib */
            uint8_t* pxr24_buf = (uint8_t*)ctx->allocator.alloc(
                ctx->allocator.userdata, pxr24_size, EXR_DEFAULT_ALIGNMENT);
            if (!pxr24_buf) {
                delete[] v2_channels;
                ctx->allocator.free(ctx->allocator.userdata, compressed, data_size);
                ctx->allocator.free(ctx->allocator.userdata, decompressed, expected_size);
                return EXR_ERROR_OUT_OF_MEMORY;
            }

            bool pxr24_ok = false;
            if (pxr24_size == data_size) {
                memcpy(pxr24_buf, compressed, data_size);
                pxr24_ok = true;
            } else {
                size_t uncomp_size = pxr24_size;
                pxr24_ok = tinyexr::huffman::inflate_zlib(compressed, data_size, pxr24_buf, &uncomp_size);
                if (pxr24_ok && uncomp_size != pxr24_size) {
                    pxr24_ok = false;
                }
            }

            if (pxr24_ok) {
                /* Convert PXR24 to standard EXR format for tile */
                const uint8_t* in_ptr = pxr24_buf;
                uint8_t* out_ptr = decompressed;

                for (int line = 0; line < tile_height; line++) {
                    for (uint32_t c = 0; c < part->num_channels; c++) {
                        int w = tile_width / v2_channels[c].x_sampling;
                        if ((line % v2_channels[c].y_sampling) != 0) continue;

                        switch (v2_channels[c].pixel_type) {
                            case 0: { /* UINT */
                                const uint8_t* ptr0 = in_ptr;
                                const uint8_t* ptr1 = in_ptr + w;
                                const uint8_t* ptr2 = in_ptr + w * 2;
                                const uint8_t* ptr3 = in_ptr + w * 3;
                                in_ptr += w * 4;

                                uint32_t pixel = 0;
                                for (int x = 0; x < w; x++) {
                                    uint32_t diff = ((uint32_t)ptr0[x] << 24) |
                                                    ((uint32_t)ptr1[x] << 16) |
                                                    ((uint32_t)ptr2[x] << 8) |
                                                    ((uint32_t)ptr3[x]);
                                    pixel += diff;
                                    memcpy(out_ptr, &pixel, 4);
                                    out_ptr += 4;
                                }
                                break;
                            }
                            case 1: { /* HALF */
                                const uint8_t* ptr0 = in_ptr;
                                const uint8_t* ptr1 = in_ptr + w;
                                in_ptr += w * 2;

                                uint32_t pixel = 0;
                                for (int x = 0; x < w; x++) {
                                    uint32_t diff = ((uint32_t)ptr0[x] << 8) |
                                                    ((uint32_t)ptr1[x]);
                                    pixel += diff;
                                    uint16_t h = (uint16_t)pixel;
                                    memcpy(out_ptr, &h, 2);
                                    out_ptr += 2;
                                }
                                break;
                            }
                            case 2: { /* FLOAT */
                                const uint8_t* ptr0 = in_ptr;
                                const uint8_t* ptr1 = in_ptr + w;
                                const uint8_t* ptr2 = in_ptr + w * 2;
                                in_ptr += w * 3;

                                uint32_t pixel = 0;
                                for (int x = 0; x < w; x++) {
                                    uint32_t diff = ((uint32_t)ptr0[x] << 24) |
                                                    ((uint32_t)ptr1[x] << 16) |
                                                    ((uint32_t)ptr2[x] << 8);
                                    pixel += diff;
                                    memcpy(out_ptr, &pixel, 4);
                                    out_ptr += 4;
                                }
                                break;
                            }
                        }
                    }
                }
            }

            ctx->allocator.free(ctx->allocator.userdata, pxr24_buf, pxr24_size);
            delete[] v2_channels;

            if (!pxr24_ok) {
                ctx->allocator.free(ctx->allocator.userdata, compressed, data_size);
                ctx->allocator.free(ctx->allocator.userdata, decompressed, expected_size);
                return EXR_ERROR_DECOMPRESSION_FAILED;
            }
            decompressed_size = expected_size;
#else
            ctx->allocator.free(ctx->allocator.userdata, compressed, data_size);
            ctx->allocator.free(ctx->allocator.userdata, decompressed, expected_size);
            return EXR_ERROR_UNSUPPORTED_FORMAT;
#endif
            break;
        }

        case EXR_COMPRESSION_B44:
        case EXR_COMPRESSION_B44A: {
#if defined(TINYEXR_V3_HAS_B44)
            /* Use V2 B44 implementation for tiles */
            tinyexr::v2::Channel* v2_channels = new (std::nothrow) tinyexr::v2::Channel[part->num_channels];
            if (!v2_channels) {
                ctx->allocator.free(ctx->allocator.userdata, compressed, data_size);
                ctx->allocator.free(ctx->allocator.userdata, decompressed, expected_size);
                return EXR_ERROR_OUT_OF_MEMORY;
            }

            for (uint32_t c = 0; c < part->num_channels; c++) {
                v2_channels[c].name = part->channels[c].name;
                v2_channels[c].pixel_type = (int)part->channels[c].pixel_type;
                v2_channels[c].x_sampling = part->channels[c].x_sampling;
                v2_channels[c].y_sampling = part->channels[c].y_sampling;
                v2_channels[c].p_linear = part->channels[c].p_linear;
            }

            bool is_b44a = (part->compression == EXR_COMPRESSION_B44A);
            tinyexr::v2::ScratchPool pool;

            bool b44_ok = tinyexr::v2::DecompressB44V2(
                decompressed, expected_size,
                compressed, data_size,
                tile_width, tile_height,
                part->num_channels, v2_channels, is_b44a, pool);

            delete[] v2_channels;

            if (!b44_ok) {
                ctx->allocator.free(ctx->allocator.userdata, compressed, data_size);
                ctx->allocator.free(ctx->allocator.userdata, decompressed, expected_size);
                return EXR_ERROR_DECOMPRESSION_FAILED;
            }
            decompressed_size = expected_size;
#else
            ctx->allocator.free(ctx->allocator.userdata, compressed, data_size);
            ctx->allocator.free(ctx->allocator.userdata, decompressed, expected_size);
            return EXR_ERROR_UNSUPPORTED_FORMAT;
#endif
            break;
        }

        default:
            /* DWAA/DWAB and other compression types not supported */
            ctx->allocator.free(ctx->allocator.userdata, compressed, data_size);
            ctx->allocator.free(ctx->allocator.userdata, decompressed, expected_size);
            return EXR_ERROR_UNSUPPORTED_FORMAT;
    }

    ctx->allocator.free(ctx->allocator.userdata, compressed, data_size);

    *out_data = decompressed;
    *out_size = decompressed_size;
    *out_width = tile_width;
    *out_height = tile_height;

    return EXR_SUCCESS;
}

/* ============================================================================
 * Pixel Type Conversion Helpers
 * ============================================================================ */

/* Forward declarations for half conversion tables and init function */
static uint32_t g_mantissa_table[2048];
static uint32_t g_exponent_table[64];
static uint16_t g_offset_table[64];
static uint16_t g_base_table[512];
static uint8_t g_shift_table[512];
static int g_tables_initialized;
static void init_half_tables(void);

/* Convert a single half to float */
static inline float half_to_float_single(uint16_t h) {
    init_half_tables();
    uint32_t f = g_mantissa_table[g_offset_table[h >> 10] + (h & 0x3FF)] +
                 g_exponent_table[h >> 10];
    float result;
    memcpy(&result, &f, sizeof(float));
    return result;
}

/* Convert a single float to half */
static inline uint16_t float_to_half_single(float val) {
    init_half_tables();
    uint32_t f;
    memcpy(&f, &val, sizeof(float));
    uint32_t sign = (f >> 16) & 0x8000;
    uint32_t exp = (f >> 23) & 0xFF;
    uint32_t sign_idx = (f >> 23) & 0x100;
    uint16_t h = (uint16_t)(g_base_table[exp | sign_idx] +
                            ((f & 0x007FFFFF) >> g_shift_table[exp | sign_idx]));
    return h | (uint16_t)sign;
}

/* Convert pixels from source type to destination type
 * Handles HALF (1), FLOAT (2), UINT (0)
 * src and dst can be the same buffer if in-place conversion is safe
 */
static void convert_pixels(const void* src, uint32_t src_type,
                           void* dst, uint32_t dst_type,
                           size_t pixel_count) {
    if (src_type == dst_type) {
        /* No conversion needed */
        if (src != dst) {
            size_t bytes = pixel_count * get_bytes_per_pixel(src_type);
            memcpy(dst, src, bytes);
        }
        return;
    }

    const uint8_t* src_ptr = (const uint8_t*)src;
    uint8_t* dst_ptr = (uint8_t*)dst;

    for (size_t i = 0; i < pixel_count; i++) {
        float val;

        /* Read source value and convert to float */
        switch (src_type) {
            case EXR_PIXEL_HALF: {
                uint16_t h;
                memcpy(&h, src_ptr, sizeof(uint16_t));
                val = half_to_float_single(h);
                src_ptr += 2;
                break;
            }
            case EXR_PIXEL_FLOAT: {
                memcpy(&val, src_ptr, sizeof(float));
                src_ptr += 4;
                break;
            }
            case EXR_PIXEL_UINT: {
                uint32_t u;
                memcpy(&u, src_ptr, sizeof(uint32_t));
                /* UINT values are typically used for sample counts or IDs */
                val = (float)u;
                src_ptr += 4;
                break;
            }
            default:
                val = 0.0f;
                src_ptr += 4;
                break;
        }

        /* Write destination value */
        switch (dst_type) {
            case EXR_PIXEL_HALF: {
                uint16_t h = float_to_half_single(val);
                memcpy(dst_ptr, &h, sizeof(uint16_t));
                dst_ptr += 2;
                break;
            }
            case EXR_PIXEL_FLOAT: {
                memcpy(dst_ptr, &val, sizeof(float));
                dst_ptr += 4;
                break;
            }
            case EXR_PIXEL_UINT: {
                uint32_t u = (val < 0.0f) ? 0 :
                             (val > 4294967295.0f) ? 0xFFFFFFFF : (uint32_t)val;
                memcpy(dst_ptr, &u, sizeof(uint32_t));
                dst_ptr += 4;
                break;
            }
            default:
                dst_ptr += 4;
                break;
        }
    }
}

/* Convert and copy scanline data with pixel type conversion
 * Handles per-channel conversion when channels have different types
 */
static void convert_scanline_data(const uint8_t* src, uint8_t* dst,
                                   int width, int num_lines,
                                   uint32_t num_channels,
                                   const ExrChannelData* channels,
                                   uint32_t output_type,
                                   uint32_t layout) {
    size_t src_bytes_per_line = 0;
    for (uint32_t c = 0; c < num_channels; c++) {
        src_bytes_per_line += (size_t)width * get_bytes_per_pixel(channels[c].pixel_type);
    }

    size_t dst_bytes_per_pixel = get_bytes_per_pixel(output_type);

    for (int y = 0; y < num_lines; y++) {
        const uint8_t* src_line = src + y * src_bytes_per_line;
        uint8_t* dst_line = dst + y * (size_t)width * num_channels * dst_bytes_per_pixel;

        if (layout == EXR_LAYOUT_INTERLEAVED) {
            /* Convert to interleaved: RGBARGBA... */
            size_t src_ch_offset = 0;
            for (uint32_t c = 0; c < num_channels; c++) {
                const uint8_t* src_ch = src_line + src_ch_offset;
                size_t src_bytes = get_bytes_per_pixel(channels[c].pixel_type);

                for (int x = 0; x < width; x++) {
                    /* Read source pixel */
                    float val;
                    switch (channels[c].pixel_type) {
                        case EXR_PIXEL_HALF: {
                            uint16_t h;
                            memcpy(&h, src_ch + x * src_bytes, sizeof(uint16_t));
                            val = half_to_float_single(h);
                            break;
                        }
                        case EXR_PIXEL_FLOAT:
                            memcpy(&val, src_ch + x * src_bytes, sizeof(float));
                            break;
                        case EXR_PIXEL_UINT: {
                            uint32_t u;
                            memcpy(&u, src_ch + x * src_bytes, sizeof(uint32_t));
                            val = (float)u;
                            break;
                        }
                        default:
                            val = 0.0f;
                            break;
                    }

                    /* Write destination pixel (interleaved) */
                    uint8_t* dst_pixel = dst_line + (x * num_channels + c) * dst_bytes_per_pixel;
                    switch (output_type) {
                        case EXR_PIXEL_HALF: {
                            uint16_t h = float_to_half_single(val);
                            memcpy(dst_pixel, &h, sizeof(uint16_t));
                            break;
                        }
                        case EXR_PIXEL_FLOAT:
                            memcpy(dst_pixel, &val, sizeof(float));
                            break;
                        case EXR_PIXEL_UINT: {
                            uint32_t u = (val < 0.0f) ? 0 :
                                         (val > 4294967295.0f) ? 0xFFFFFFFF : (uint32_t)val;
                            memcpy(dst_pixel, &u, sizeof(uint32_t));
                            break;
                        }
                        default:
                            break;
                    }
                }

                src_ch_offset += (size_t)width * src_bytes;
            }
        } else {
            /* Planar or native layout: convert each channel sequentially */
            size_t src_ch_offset = 0;
            size_t dst_ch_offset = 0;

            for (uint32_t c = 0; c < num_channels; c++) {
                const uint8_t* src_ch = src_line + src_ch_offset;
                uint8_t* dst_ch = dst_line + dst_ch_offset;
                size_t src_bytes = get_bytes_per_pixel(channels[c].pixel_type);

                convert_pixels(src_ch, channels[c].pixel_type,
                               dst_ch, output_type, width);

                src_ch_offset += (size_t)width * src_bytes;
                dst_ch_offset += (size_t)width * dst_bytes_per_pixel;
            }
        }
    }
}

/* Execute a scanline read command */
static ExrResult execute_scanline_read(ExrDecoder decoder, ExrScanlineReadCmd* cmd) {
    ExrContext ctx = decoder->ctx;
    ExrImage image = decoder->image;

    if (!image || cmd->base.part_index >= image->num_parts) {
        return EXR_ERROR_INVALID_ARGUMENT;
    }

    ExrPartData* part = &image->parts[cmd->base.part_index];
    int lines_per_block = get_lines_per_block(part->compression);

    /* Calculate which chunks we need to read */
    int start_chunk = cmd->y_start / lines_per_block;
    int end_y = cmd->y_start + cmd->num_lines;
    int end_chunk = (end_y + lines_per_block - 1) / lines_per_block;

    /* Calculate output stride */
    size_t bytes_per_pixel_out = get_bytes_per_pixel(cmd->output_pixel_type);
    size_t output_stride = (size_t)part->width * part->num_channels * bytes_per_pixel_out;

    uint8_t* output = (uint8_t*)cmd->output;
    int lines_written = 0;

    /* Read each chunk */
    for (int chunk = start_chunk; chunk < end_chunk && chunk < (int)part->num_chunks; chunk++) {
        uint8_t* chunk_data = NULL;
        size_t chunk_size;
        int chunk_y_start, chunk_num_lines;

        ExrResult result = read_chunk(decoder, part, (uint32_t)chunk,
                                       &chunk_data, &chunk_size,
                                       &chunk_y_start, &chunk_num_lines);
        if (EXR_FAILED(result)) {
            return result;
        }

        /* Calculate overlap with requested region */
        int copy_start = (chunk_y_start > cmd->y_start) ? chunk_y_start : cmd->y_start;
        int copy_end = (chunk_y_start + chunk_num_lines < end_y) ?
                       (chunk_y_start + chunk_num_lines) : end_y;
        int copy_lines = copy_end - copy_start;

        if (copy_lines > 0) {
            /* Calculate source offset within chunk */
            int src_y_offset = copy_start - chunk_y_start;
            size_t bytes_per_line = 0;
            for (uint32_t c = 0; c < part->num_channels; c++) {
                bytes_per_line += (size_t)part->width *
                                  get_bytes_per_pixel(part->channels[c].pixel_type);
            }
            size_t src_offset = src_y_offset * bytes_per_line;

            /* Convert and copy data with pixel type conversion */
            size_t dst_bytes_per_pixel = get_bytes_per_pixel(cmd->output_pixel_type);
            size_t dst_line_size = (size_t)part->width * part->num_channels * dst_bytes_per_pixel;
            size_t required_size = (lines_written + copy_lines) * dst_line_size;

            if (required_size <= cmd->output_size) {
                convert_scanline_data(
                    chunk_data + src_offset,
                    output + lines_written * dst_line_size,
                    part->width, copy_lines,
                    part->num_channels, part->channels,
                    cmd->output_pixel_type,
                    cmd->output_layout);
            }

            lines_written += copy_lines;
        }

        ctx->allocator.free(ctx->allocator.userdata, chunk_data, chunk_size);
    }

    return EXR_SUCCESS;
}

/* Execute a tile read command */
static ExrResult execute_tile_read(ExrDecoder decoder, ExrTileReadCmd* cmd) {
    ExrContext ctx = decoder->ctx;
    ExrImage image = decoder->image;

    if (!image || cmd->base.part_index >= image->num_parts) {
        return EXR_ERROR_INVALID_ARGUMENT;
    }

    ExrPartData* part = &image->parts[cmd->base.part_index];

    if (part->part_type != EXR_PART_TILED) {
        exr_context_add_error(ctx, EXR_ERROR_INVALID_ARGUMENT,
                              "Not a tiled image", NULL, 0);
        return EXR_ERROR_INVALID_ARGUMENT;
    }

    /* Read the tile */
    uint8_t* tile_data = NULL;
    size_t tile_size;
    int tile_width, tile_height;

    ExrResult result = read_tile(decoder, part, cmd->tile_x, cmd->tile_y,
                                  cmd->level_x, cmd->level_y,
                                  &tile_data, &tile_size, &tile_width, &tile_height);
    if (EXR_FAILED(result)) {
        return result;
    }

    /* Calculate output size */
    size_t bytes_per_pixel_out = get_bytes_per_pixel(cmd->output_pixel_type);
    size_t output_size = (size_t)tile_width * tile_height * part->num_channels * bytes_per_pixel_out;

    if (output_size > cmd->output_size) {
        ctx->allocator.free(ctx->allocator.userdata, tile_data, tile_size);
        return EXR_ERROR_BUFFER_TOO_SMALL;
    }

    /* Convert and copy to output */
    convert_scanline_data(tile_data, (uint8_t*)cmd->output,
                          tile_width, tile_height,
                          part->num_channels, part->channels,
                          cmd->output_pixel_type, cmd->output_layout);

    ctx->allocator.free(ctx->allocator.userdata, tile_data, tile_size);

    return EXR_SUCCESS;
}

/* Execute a full image read command */
static ExrResult execute_full_image_read(ExrDecoder decoder, ExrFullImageReadCmd* cmd) {
    ExrContext ctx = decoder->ctx;
    ExrImage image = decoder->image;

    if (!image || cmd->base.part_index >= image->num_parts) {
        return EXR_ERROR_INVALID_ARGUMENT;
    }

    ExrPartData* part = &image->parts[cmd->base.part_index];

    /* For scanline images, read all chunks sequentially */
    if (part->part_type == EXR_PART_SCANLINE) {
        ExrScanlineReadCmd scan_cmd;
        scan_cmd.base.type = EXR_CMD_TYPE_READ_SCANLINES;
        scan_cmd.base.part_index = cmd->base.part_index;
        scan_cmd.y_start = 0;
        scan_cmd.num_lines = part->height;
        scan_cmd.output = cmd->output;
        scan_cmd.output_size = cmd->output_size;
        scan_cmd.channels_mask = cmd->channels_mask;
        scan_cmd.output_pixel_type = cmd->output_pixel_type;
        scan_cmd.output_layout = cmd->output_layout;

        return execute_scanline_read(decoder, &scan_cmd);
    }

    /* For tiled images - read all tiles at level 0 */
    if (part->part_type == EXR_PART_TILED) {
        int level_width, level_height, num_x_tiles, num_y_tiles;
        calc_level_size(part, 0, 0, &level_width, &level_height, &num_x_tiles, &num_y_tiles);

        size_t bytes_per_pixel_out = get_bytes_per_pixel(cmd->output_pixel_type);
        size_t tile_bytes_per_line = (size_t)part->tile_size_x * part->num_channels * bytes_per_pixel_out;

        /* Read each tile and copy to the correct position in output */
        for (int ty = 0; ty < num_y_tiles; ty++) {
            for (int tx = 0; tx < num_x_tiles; tx++) {
                uint8_t* tile_data = NULL;
                size_t tile_size;
                int tile_width, tile_height;

                ExrResult result = read_tile(decoder, part, tx, ty, 0, 0,
                                              &tile_data, &tile_size, &tile_width, &tile_height);
                if (EXR_FAILED(result)) {
                    return result;
                }

                /* Calculate pixel position of this tile */
                int tile_px_x = tx * (int)part->tile_size_x;
                int tile_px_y = ty * (int)part->tile_size_y;

                /* Allocate temp buffer for converted tile */
                size_t conv_size = (size_t)tile_width * tile_height * part->num_channels * bytes_per_pixel_out;
                uint8_t* converted = (uint8_t*)ctx->allocator.alloc(
                    ctx->allocator.userdata, conv_size, EXR_DEFAULT_ALIGNMENT);
                if (!converted) {
                    ctx->allocator.free(ctx->allocator.userdata, tile_data, tile_size);
                    return EXR_ERROR_OUT_OF_MEMORY;
                }

                /* Convert tile data */
                convert_scanline_data(tile_data, converted,
                                      tile_width, tile_height,
                                      part->num_channels, part->channels,
                                      cmd->output_pixel_type, cmd->output_layout);

                ctx->allocator.free(ctx->allocator.userdata, tile_data, tile_size);

                /* Copy converted tile to the correct position in output */
                size_t output_stride = (size_t)level_width * part->num_channels * bytes_per_pixel_out;
                size_t tile_stride = (size_t)tile_width * part->num_channels * bytes_per_pixel_out;

                for (int y = 0; y < tile_height; y++) {
                    uint8_t* dst = (uint8_t*)cmd->output + (tile_px_y + y) * output_stride +
                                   tile_px_x * part->num_channels * bytes_per_pixel_out;
                    const uint8_t* src = converted + y * tile_stride;
                    memcpy(dst, src, tile_stride);
                }

                ctx->allocator.free(ctx->allocator.userdata, converted, conv_size);
            }
        }

        return EXR_SUCCESS;
    }

    return EXR_ERROR_UNSUPPORTED_FORMAT;
}

/* Execute a deep scanline read command */
static ExrResult execute_deep_scanline_read(ExrDecoder decoder, ExrDeepScanlineReadCmd* cmd) {
    ExrContext ctx = decoder->ctx;
    ExrImage image = decoder->image;

    if (!image || cmd->base.part_index >= image->num_parts) {
        return EXR_ERROR_INVALID_ARGUMENT;
    }

    ExrPartData* part = &image->parts[cmd->base.part_index];

    /* Verify this is a deep image */
    if (part->part_type != EXR_PART_DEEP_SCANLINE &&
        part->part_type != EXR_PART_DEEP_TILED) {
        exr_context_add_error(ctx, EXR_ERROR_INVALID_DATA,
                              "Not a deep image", NULL, 0);
        return EXR_ERROR_INVALID_DATA;
    }

    ExrDeepSampleInfo* sample_info = cmd->sample_info;
    if (!sample_info || !sample_info->sample_counts) {
        return EXR_ERROR_INVALID_ARGUMENT;
    }

    /* Calculate which chunk contains this scanline */
    int lines_per_block = get_lines_per_block(part->compression);
    int block_index = (cmd->y_start - image->data_window.min_y) / lines_per_block;
    if (block_index < 0 || block_index >= (int)part->num_chunks) {
        return EXR_ERROR_OUT_OF_BOUNDS;
    }

    uint64_t offset = part->offsets[block_index];

    /* Read deep chunk header:
     * - int32: y coordinate
     * - int64: packed size of pixel offset table
     * - int64: packed size of sample data
     * - int64: unpacked size of sample data
     */
    uint8_t header[28];
    ExrResult result = sync_fetch(decoder, offset, 28, header);
    if (EXR_FAILED(result)) {
        return result;
    }

    int64_t packed_offset_table_size;
    int64_t packed_sample_data_size;
    int64_t unpacked_sample_data_size;

    memcpy(&packed_offset_table_size, header + 4, 8);
    memcpy(&packed_sample_data_size, header + 12, 8);
    memcpy(&unpacked_sample_data_size, header + 20, 8);

    /* If no samples, nothing to load */
    if (unpacked_sample_data_size == 0 || sample_info->total_samples == 0) {
        return EXR_SUCCESS;
    }

    /* Read compressed sample data */
    size_t sample_data_offset = 28 + (size_t)packed_offset_table_size;
    uint8_t* compressed_data = (uint8_t*)ctx->allocator.alloc(
        ctx->allocator.userdata, (size_t)packed_sample_data_size, EXR_DEFAULT_ALIGNMENT);
    if (!compressed_data) {
        return EXR_ERROR_OUT_OF_MEMORY;
    }

    result = sync_fetch(decoder, offset + sample_data_offset,
                        (size_t)packed_sample_data_size, compressed_data);
    if (EXR_FAILED(result)) {
        ctx->allocator.free(ctx->allocator.userdata, compressed_data, (size_t)packed_sample_data_size);
        return result;
    }

    /* Allocate temp buffer for decompression */
    size_t data_size = (size_t)unpacked_sample_data_size;
    uint8_t* temp_buf = (uint8_t*)ctx->allocator.alloc(
        ctx->allocator.userdata, data_size, EXR_DEFAULT_ALIGNMENT);
    if (!temp_buf) {
        ctx->allocator.free(ctx->allocator.userdata, compressed_data, (size_t)packed_sample_data_size);
        return EXR_ERROR_OUT_OF_MEMORY;
    }

    /* Allocate final sample data buffer */
    uint8_t* sample_data = (uint8_t*)ctx->allocator.alloc(
        ctx->allocator.userdata, data_size, EXR_DEFAULT_ALIGNMENT);
    if (!sample_data) {
        ctx->allocator.free(ctx->allocator.userdata, temp_buf, data_size);
        ctx->allocator.free(ctx->allocator.userdata, compressed_data, (size_t)packed_sample_data_size);
        return EXR_ERROR_OUT_OF_MEMORY;
    }

    /* Decompress sample data (ZIP compressed with predictor+reorder) */
    bool decomp_ok = false;
#if defined(TINYEXR_V3_HAS_DEFLATE)
    size_t uncomp_size = data_size;
    decomp_ok = tinyexr::huffman::inflate_zlib(compressed_data,
        (size_t)packed_sample_data_size, temp_buf, &uncomp_size);
    if (decomp_ok && uncomp_size != data_size) {
        decomp_ok = false;
    }
#elif defined(TINYEXR_V3_USE_MINIZ)
    mz_ulong dst_len = (mz_ulong)data_size;
    int zret = mz_uncompress(temp_buf, &dst_len,
                              compressed_data, (mz_ulong)packed_sample_data_size);
    decomp_ok = (zret == MZ_OK && dst_len == (mz_ulong)data_size);
#endif
    ctx->allocator.free(ctx->allocator.userdata, compressed_data, (size_t)packed_sample_data_size);

    if (decomp_ok) {
        /* Apply predictor: t[i] = t[i-1] + t[i] - 128 */
        uint8_t* t = temp_buf + 1;
        uint8_t* stop = temp_buf + data_size;
        while (t < stop) {
            int d = (int)t[-1] + (int)t[0] - 128;
            t[0] = (uint8_t)d;
            ++t;
        }

        /* Reorder bytes: interleave first half and second half */
        const uint8_t* t1 = temp_buf;
        const uint8_t* t2 = temp_buf + (data_size + 1) / 2;
        uint8_t* dst = sample_data;
        uint8_t* dst_stop = dst + data_size;

        while (dst < dst_stop) {
            if (dst < dst_stop) *dst++ = *t1++;
            if (dst < dst_stop) *dst++ = *t2++;
        }
    }

    ctx->allocator.free(ctx->allocator.userdata, temp_buf, data_size);

    if (!decomp_ok) {
        ctx->allocator.free(ctx->allocator.userdata, sample_data, data_size);
        return EXR_ERROR_DECOMPRESSION_FAILED;
    }

    /* Calculate sample size (bytes per sample across all channels) */
    int sample_size = 0;
    for (uint32_t c = 0; c < part->num_channels; c++) {
        sample_size += (int)get_bytes_per_pixel(part->channels[c].pixel_type);
    }
    if (sample_size <= 0) {
        ctx->allocator.free(ctx->allocator.userdata, sample_data, (size_t)unpacked_sample_data_size);
        return EXR_ERROR_INVALID_DATA;
    }

    uint64_t total_samples = sample_info->total_samples;

    /* Data in EXR is stored channel-planar: all samples for ch0, then ch1, etc.
     * The output buffer should be sized to hold all sample data in requested format. */

    /* Calculate output size requirements */
    size_t bytes_per_output_sample = get_bytes_per_pixel(cmd->output_pixel_type);
    size_t required_output = total_samples * part->num_channels * bytes_per_output_sample;

    if (cmd->output_size < required_output) {
        ctx->allocator.free(ctx->allocator.userdata, sample_data, (size_t)unpacked_sample_data_size);
        exr_context_add_error(ctx, EXR_ERROR_BUFFER_TOO_SMALL,
                              "Output buffer too small for deep sample data", NULL, 0);
        return EXR_ERROR_BUFFER_TOO_SMALL;
    }

    /* Convert from channel-planar to interleaved output format */
    uint8_t* output = (uint8_t*)cmd->output;
    size_t channel_data_offset = 0;

    for (uint32_t c = 0; c < part->num_channels; c++) {
        uint32_t src_pixel_type = part->channels[c].pixel_type;
        size_t src_bytes = get_bytes_per_pixel(src_pixel_type);
        const uint8_t* src = sample_data + channel_data_offset;

        /* Copy each sample for this channel */
        for (uint64_t s = 0; s < total_samples; s++) {
            /* Output offset: sample * num_channels + channel_index */
            size_t dst_offset = (s * part->num_channels + c) * bytes_per_output_sample;
            uint8_t* dst = output + dst_offset;

            /* Convert pixel type */
            float val = 0.0f;
            if (src_pixel_type == EXR_PIXEL_UINT) {
                uint32_t ui;
                memcpy(&ui, src + s * src_bytes, 4);
                val = (float)ui;
            } else if (src_pixel_type == EXR_PIXEL_HALF) {
                uint16_t h;
                memcpy(&h, src + s * src_bytes, 2);
                val = half_to_float_single(h);
            } else if (src_pixel_type == EXR_PIXEL_FLOAT) {
                memcpy(&val, src + s * src_bytes, 4);
            }

            /* Write to output in requested format */
            if (cmd->output_pixel_type == EXR_PIXEL_FLOAT) {
                memcpy(dst, &val, 4);
            } else if (cmd->output_pixel_type == EXR_PIXEL_HALF) {
                uint16_t h = float_to_half_single(val);
                memcpy(dst, &h, 2);
            } else if (cmd->output_pixel_type == EXR_PIXEL_UINT) {
                uint32_t ui = (uint32_t)val;
                memcpy(dst, &ui, 4);
            }
        }

        channel_data_offset += total_samples * src_bytes;
    }

    ctx->allocator.free(ctx->allocator.userdata, sample_data, data_size);
    return EXR_SUCCESS;
}

/* Execute a deep tile read command */
static ExrResult execute_deep_tile_read(ExrDecoder decoder, ExrDeepTileReadCmd* cmd) {
    ExrContext ctx = decoder->ctx;
    ExrImage image = decoder->image;

    if (!image || cmd->base.part_index >= image->num_parts) {
        return EXR_ERROR_INVALID_ARGUMENT;
    }

    ExrPartData* part = &image->parts[cmd->base.part_index];

    /* Verify this is a deep tiled image */
    if (part->part_type != EXR_PART_DEEP_TILED) {
        exr_context_add_error(ctx, EXR_ERROR_INVALID_DATA,
                              "Not a deep tiled image", NULL, 0);
        return EXR_ERROR_INVALID_DATA;
    }

    ExrDeepTileSampleInfo* sample_info = cmd->sample_info;
    if (!sample_info || !sample_info->sample_counts) {
        return EXR_ERROR_INVALID_ARGUMENT;
    }

    /* Calculate tile index */
    uint32_t tile_index = calc_tile_index(part, cmd->tile_x, cmd->tile_y,
                                           cmd->level_x, cmd->level_y);
    if (tile_index >= part->num_chunks) {
        return EXR_ERROR_OUT_OF_BOUNDS;
    }

    uint64_t offset = part->offsets[tile_index];

    /* Read deep tile header:
     * - tile_x (4 bytes)
     * - tile_y (4 bytes)
     * - level_x (4 bytes)
     * - level_y (4 bytes)
     * - packed_offset_table_size (8 bytes)
     * - packed_sample_data_size (8 bytes)
     * - unpacked_sample_data_size (8 bytes)
     * Total: 40 bytes
     */
    uint8_t header[40];
    ExrResult result = sync_fetch(decoder, offset, 40, header);
    if (EXR_FAILED(result)) {
        return result;
    }

    int32_t hdr_tile_x = read_le_i32(header);
    int32_t hdr_tile_y = read_le_i32(header + 4);
    int32_t hdr_level_x = read_le_i32(header + 8);
    int32_t hdr_level_y = read_le_i32(header + 12);
    int64_t packed_offset_table_size;
    int64_t packed_sample_data_size;
    int64_t unpacked_sample_data_size;

    memcpy(&packed_offset_table_size, header + 16, 8);
    memcpy(&packed_sample_data_size, header + 24, 8);
    memcpy(&unpacked_sample_data_size, header + 32, 8);

    /* Validate header matches request */
    if (hdr_tile_x != cmd->tile_x || hdr_tile_y != cmd->tile_y ||
        hdr_level_x != cmd->level_x || hdr_level_y != cmd->level_y) {
        exr_context_add_error(ctx, EXR_ERROR_INVALID_DATA,
                              "Deep tile header mismatch", "tile", offset);
        return EXR_ERROR_INVALID_DATA;
    }

    /* If no samples, nothing to load */
    if (unpacked_sample_data_size == 0 || sample_info->total_samples == 0) {
        return EXR_SUCCESS;
    }

    /* Read compressed sample data */
    size_t sample_data_offset = 40 + (size_t)packed_offset_table_size;
    uint8_t* compressed_data = (uint8_t*)ctx->allocator.alloc(
        ctx->allocator.userdata, (size_t)packed_sample_data_size, EXR_DEFAULT_ALIGNMENT);
    if (!compressed_data) {
        return EXR_ERROR_OUT_OF_MEMORY;
    }

    result = sync_fetch(decoder, offset + sample_data_offset,
                        (size_t)packed_sample_data_size, compressed_data);
    if (EXR_FAILED(result)) {
        ctx->allocator.free(ctx->allocator.userdata, compressed_data, (size_t)packed_sample_data_size);
        return result;
    }

    /* Allocate temp buffer for decompression */
    size_t data_size = (size_t)unpacked_sample_data_size;
    uint8_t* temp_buf = (uint8_t*)ctx->allocator.alloc(
        ctx->allocator.userdata, data_size, EXR_DEFAULT_ALIGNMENT);
    if (!temp_buf) {
        ctx->allocator.free(ctx->allocator.userdata, compressed_data, (size_t)packed_sample_data_size);
        return EXR_ERROR_OUT_OF_MEMORY;
    }

    /* Allocate final sample data buffer */
    uint8_t* sample_data = (uint8_t*)ctx->allocator.alloc(
        ctx->allocator.userdata, data_size, EXR_DEFAULT_ALIGNMENT);
    if (!sample_data) {
        ctx->allocator.free(ctx->allocator.userdata, temp_buf, data_size);
        ctx->allocator.free(ctx->allocator.userdata, compressed_data, (size_t)packed_sample_data_size);
        return EXR_ERROR_OUT_OF_MEMORY;
    }

    /* Decompress sample data (ZIP compressed with predictor+reorder) */
    bool decomp_ok = false;
#if defined(TINYEXR_V3_HAS_DEFLATE)
    size_t uncomp_size = data_size;
    decomp_ok = tinyexr::huffman::inflate_zlib(compressed_data,
        (size_t)packed_sample_data_size, temp_buf, &uncomp_size);
    if (decomp_ok && uncomp_size != data_size) {
        decomp_ok = false;
    }
#elif defined(TINYEXR_V3_USE_MINIZ)
    mz_ulong dst_len = (mz_ulong)data_size;
    int zret = mz_uncompress(temp_buf, &dst_len,
                              compressed_data, (mz_ulong)packed_sample_data_size);
    decomp_ok = (zret == MZ_OK && dst_len == (mz_ulong)data_size);
#endif
    ctx->allocator.free(ctx->allocator.userdata, compressed_data, (size_t)packed_sample_data_size);

    if (decomp_ok) {
        /* Apply predictor: t[i] = t[i-1] + t[i] - 128 */
        uint8_t* t = temp_buf + 1;
        uint8_t* stop = temp_buf + data_size;
        while (t < stop) {
            int d = (int)t[-1] + (int)t[0] - 128;
            t[0] = (uint8_t)d;
            ++t;
        }

        /* Reorder bytes: interleave first half and second half */
        const uint8_t* t1 = temp_buf;
        const uint8_t* t2 = temp_buf + (data_size + 1) / 2;
        uint8_t* dst = sample_data;
        uint8_t* dst_stop = dst + data_size;

        while (dst < dst_stop) {
            if (dst < dst_stop) *dst++ = *t1++;
            if (dst < dst_stop) *dst++ = *t2++;
        }
    }

    ctx->allocator.free(ctx->allocator.userdata, temp_buf, data_size);

    if (!decomp_ok) {
        ctx->allocator.free(ctx->allocator.userdata, sample_data, data_size);
        return EXR_ERROR_DECOMPRESSION_FAILED;
    }

    /* Calculate sample size (bytes per sample across all channels) */
    int sample_size = 0;
    for (uint32_t c = 0; c < part->num_channels; c++) {
        sample_size += (int)get_bytes_per_pixel(part->channels[c].pixel_type);
    }
    if (sample_size <= 0) {
        ctx->allocator.free(ctx->allocator.userdata, sample_data, (size_t)unpacked_sample_data_size);
        return EXR_ERROR_INVALID_DATA;
    }

    uint64_t total_samples = sample_info->total_samples;

    /* Calculate output size requirements */
    size_t bytes_per_output_sample = get_bytes_per_pixel(cmd->output_pixel_type);
    size_t required_output = total_samples * part->num_channels * bytes_per_output_sample;

    if (cmd->output_size < required_output) {
        ctx->allocator.free(ctx->allocator.userdata, sample_data, (size_t)unpacked_sample_data_size);
        exr_context_add_error(ctx, EXR_ERROR_BUFFER_TOO_SMALL,
                              "Output buffer too small for deep tile sample data", NULL, 0);
        return EXR_ERROR_BUFFER_TOO_SMALL;
    }

    /* Convert from channel-planar to interleaved output format */
    uint8_t* output = (uint8_t*)cmd->output;
    size_t channel_data_offset = 0;

    for (uint32_t c = 0; c < part->num_channels; c++) {
        uint32_t src_pixel_type = part->channels[c].pixel_type;
        size_t src_bytes = get_bytes_per_pixel(src_pixel_type);
        const uint8_t* src = sample_data + channel_data_offset;

        /* Copy each sample for this channel */
        for (uint64_t s = 0; s < total_samples; s++) {
            /* Output offset: sample * num_channels + channel_index */
            size_t dst_offset = (s * part->num_channels + c) * bytes_per_output_sample;
            uint8_t* dst_ptr = output + dst_offset;

            /* Convert pixel type */
            float val = 0.0f;
            if (src_pixel_type == EXR_PIXEL_UINT) {
                uint32_t ui;
                memcpy(&ui, src + s * src_bytes, 4);
                val = (float)ui;
            } else if (src_pixel_type == EXR_PIXEL_HALF) {
                uint16_t h;
                memcpy(&h, src + s * src_bytes, 2);
                val = half_to_float_single(h);
            } else if (src_pixel_type == EXR_PIXEL_FLOAT) {
                memcpy(&val, src + s * src_bytes, 4);
            }

            /* Write to output in requested format */
            if (cmd->output_pixel_type == EXR_PIXEL_FLOAT) {
                memcpy(dst_ptr, &val, 4);
            } else if (cmd->output_pixel_type == EXR_PIXEL_HALF) {
                uint16_t h = float_to_half_single(val);
                memcpy(dst_ptr, &h, 2);
            } else if (cmd->output_pixel_type == EXR_PIXEL_UINT) {
                uint32_t ui = (uint32_t)val;
                memcpy(dst_ptr, &ui, 4);
            }
        }

        channel_data_offset += total_samples * src_bytes;
    }

    ctx->allocator.free(ctx->allocator.userdata, sample_data, data_size);
    return EXR_SUCCESS;
}

/* Execute all commands in a command buffer */
static ExrResult execute_commands(ExrDecoder decoder, ExrCommandBuffer cmd) {
    ExrResult result = EXR_SUCCESS;

    for (uint32_t i = 0; i < cmd->command_count; i++) {
        ExrCommandUnion* command = &cmd->commands[i];

        switch (command->base.type) {
            case EXR_CMD_TYPE_READ_TILE:
                result = execute_tile_read(decoder, &command->tile_read);
                break;

            case EXR_CMD_TYPE_READ_SCANLINES:
                result = execute_scanline_read(decoder, &command->scanline_read);
                break;

            case EXR_CMD_TYPE_READ_FULL_IMAGE:
                result = execute_full_image_read(decoder, &command->full_image_read);
                break;

            case EXR_CMD_TYPE_READ_DEEP_SCANLINES:
                result = execute_deep_scanline_read(decoder, &command->deep_scanline_read);
                break;

            case EXR_CMD_TYPE_READ_DEEP_TILES:
                result = execute_deep_tile_read(decoder, &command->deep_tile_read);
                break;

            default:
                result = EXR_ERROR_INVALID_ARGUMENT;
                break;
        }

        if (EXR_FAILED(result)) {
            return result;
        }
    }

    return EXR_SUCCESS;
}

/* ============================================================================
 * Submit Function
 * ============================================================================ */

ExrResult exr_submit(ExrDecoder decoder, const ExrSubmitInfo* submit_info) {
    if (!exr_decoder_is_valid(decoder)) {
        return EXR_ERROR_INVALID_HANDLE;
    }
    if (!submit_info) {
        return EXR_ERROR_INVALID_ARGUMENT;
    }
    if (decoder->state != EXR_DECODER_STATE_HEADER_PARSED) {
        return EXR_ERROR_INVALID_STATE;
    }

    ExrResult result = EXR_SUCCESS;

    /* Execute all command buffers */
    for (uint32_t i = 0; i < submit_info->command_buffer_count; i++) {
        ExrCommandBuffer cmd = submit_info->command_buffers[i];
        if (!exr_command_buffer_is_valid(cmd)) {
            return EXR_ERROR_INVALID_HANDLE;
        }
        if (cmd->recording) {
            return EXR_ERROR_INVALID_STATE;  /* Can't submit recording buffer */
        }

        result = execute_commands(decoder, cmd);
        if (EXR_FAILED(result)) {
            break;
        }
    }

    /* Signal fence if provided */
    if (submit_info->signal_fence) {
        if (EXR_FAILED(result)) {
            /* Don't signal on failure */
        } else {
            exr_fence_signal(submit_info->signal_fence);
        }
    }

    return result;
}

/* ============================================================================
 * SIMD Information
 * ============================================================================ */

uint32_t exr_get_simd_capabilities(void) {
    uint32_t caps = EXR_SIMD_NONE;

#if defined(__x86_64__) || defined(_M_X64) || defined(__i386__) || defined(_M_IX86)
    /* x86/x64 CPU feature detection */
#if defined(_MSC_VER)
    int cpuInfo[4];
    __cpuid(cpuInfo, 1);
    if (cpuInfo[3] & (1 << 26)) caps |= EXR_SIMD_SSE2;
    if (cpuInfo[2] & (1 << 19)) caps |= EXR_SIMD_SSE4_1;
    if (cpuInfo[2] & (1 << 28)) caps |= EXR_SIMD_AVX;

    __cpuidex(cpuInfo, 7, 0);
    if (cpuInfo[1] & (1 << 5)) caps |= EXR_SIMD_AVX2;
    if (cpuInfo[1] & (1 << 3)) caps |= EXR_SIMD_BMI1;
    if (cpuInfo[1] & (1 << 8)) caps |= EXR_SIMD_BMI2;
    if (cpuInfo[1] & (1 << 16)) caps |= EXR_SIMD_AVX512;
#elif defined(__GNUC__) || defined(__clang__)
    uint32_t eax, ebx, ecx, edx;
    if (__get_cpuid(1, &eax, &ebx, &ecx, &edx)) {
        if (edx & (1 << 26)) caps |= EXR_SIMD_SSE2;
        if (ecx & (1 << 19)) caps |= EXR_SIMD_SSE4_1;
        if (ecx & (1 << 28)) caps |= EXR_SIMD_AVX;
    }
    if (__get_cpuid_count(7, 0, &eax, &ebx, &ecx, &edx)) {
        if (ebx & (1 << 5)) caps |= EXR_SIMD_AVX2;
        if (ebx & (1 << 3)) caps |= EXR_SIMD_BMI1;
        if (ebx & (1 << 8)) caps |= EXR_SIMD_BMI2;
        if (ebx & (1 << 16)) caps |= EXR_SIMD_AVX512;
    }
#endif
#elif defined(__aarch64__) || defined(_M_ARM64) || defined(__arm__) || defined(_M_ARM)
    /* ARM always has NEON on 64-bit and usually on 32-bit */
    caps |= EXR_SIMD_NEON;
#endif

    return caps;
}

const char* exr_get_simd_info(void) {
    static char info[128];
    static int initialized = 0;

    if (!initialized) {
        uint32_t caps = exr_get_simd_capabilities();
        char* p = info;
        int first = 1;

        if (caps == EXR_SIMD_NONE) {
            strcpy(info, "Scalar");
        } else {
            info[0] = '\0';
            if (caps & EXR_SIMD_AVX512) { p += sprintf(p, "%sAVX512", first ? "" : "+"); first = 0; }
            else if (caps & EXR_SIMD_AVX2) { p += sprintf(p, "%sAVX2", first ? "" : "+"); first = 0; }
            else if (caps & EXR_SIMD_AVX) { p += sprintf(p, "%sAVX", first ? "" : "+"); first = 0; }
            else if (caps & EXR_SIMD_SSE4_1) { p += sprintf(p, "%sSSE4.1", first ? "" : "+"); first = 0; }
            else if (caps & EXR_SIMD_SSE2) { p += sprintf(p, "%sSSE2", first ? "" : "+"); first = 0; }
            if (caps & EXR_SIMD_NEON) { p += sprintf(p, "%sNEON", first ? "" : "+"); first = 0; }
            if (caps & EXR_SIMD_BMI2) { p += sprintf(p, "%sBMI2", first ? "" : "+"); first = 0; }
            else if (caps & EXR_SIMD_BMI1) { p += sprintf(p, "%sBMI1", first ? "" : "+"); first = 0; }
            (void)p;  /* Suppress unused warning */
        }
        initialized = 1;
    }

    return info;
}

/* ============================================================================
 * Pixel Conversion Utilities - Half Table Initialization
 * ============================================================================ */

/* Implementation of init_half_tables (tables are declared earlier in file) */
static void init_half_tables(void) {
    if (g_tables_initialized) return;

    /* Initialize mantissa table */
    g_mantissa_table[0] = 0;
    for (int i = 1; i < 1024; i++) {
        uint32_t m = i << 13;
        uint32_t e = 0;
        while ((m & 0x00800000) == 0) {
            e -= 0x00800000;
            m <<= 1;
        }
        m &= ~0x00800000;
        e += 0x38800000;
        g_mantissa_table[i] = m | e;
    }
    for (int i = 1024; i < 2048; i++) {
        g_mantissa_table[i] = 0x38000000 + ((i - 1024) << 13);
    }

    /* Initialize exponent table */
    g_exponent_table[0] = 0;
    for (int i = 1; i < 31; i++) {
        g_exponent_table[i] = (uint32_t)(i) << 23;
    }
    g_exponent_table[31] = 0x47800000;
    g_exponent_table[32] = 0x80000000;
    for (int i = 33; i < 63; i++) {
        g_exponent_table[i] = 0x80000000 | ((uint32_t)(i - 32) << 23);
    }
    g_exponent_table[63] = 0xC7800000;

    /* Initialize offset table */
    for (int i = 0; i < 64; i++) {
        g_offset_table[i] = 1024;
    }
    g_offset_table[0] = 0;
    g_offset_table[32] = 0;

    /* Initialize base/shift tables for float to half */
    for (int i = 0; i < 256; i++) {
        int e = i - 127;
        if (e < -24) {
            g_base_table[i] = 0x0000;
            g_base_table[i | 0x100] = 0x8000;
            g_shift_table[i] = 24;
            g_shift_table[i | 0x100] = 24;
        } else if (e < -14) {
            g_base_table[i] = (0x0400 >> (-e - 14));
            g_base_table[i | 0x100] = (0x0400 >> (-e - 14)) | 0x8000;
            g_shift_table[i] = -e - 1;
            g_shift_table[i | 0x100] = -e - 1;
        } else if (e <= 15) {
            g_base_table[i] = (uint16_t)((e + 15) << 10);
            g_base_table[i | 0x100] = (uint16_t)(((e + 15) << 10) | 0x8000);
            g_shift_table[i] = 13;
            g_shift_table[i | 0x100] = 13;
        } else if (e < 128) {
            g_base_table[i] = 0x7C00;
            g_base_table[i | 0x100] = 0xFC00;
            g_shift_table[i] = 24;
            g_shift_table[i | 0x100] = 24;
        } else {
            g_base_table[i] = 0x7C00;
            g_base_table[i | 0x100] = 0xFC00;
            g_shift_table[i] = 13;
            g_shift_table[i | 0x100] = 13;
        }
    }

    g_tables_initialized = 1;
}

void exr_convert_half_to_float(const uint16_t* src, float* dst, size_t count) {
#ifdef TINYEXR_V3_USE_SIMD
    exr_simd_half_to_float(src, dst, count);
#else
    init_half_tables();

    for (size_t i = 0; i < count; i++) {
        uint16_t h = src[i];
        uint32_t f = g_mantissa_table[g_offset_table[h >> 10] + (h & 0x3FF)] +
                     g_exponent_table[h >> 10];
        memcpy(&dst[i], &f, sizeof(float));
    }
#endif
}

void exr_convert_float_to_half(const float* src, uint16_t* dst, size_t count) {
#ifdef TINYEXR_V3_USE_SIMD
    exr_simd_float_to_half(src, dst, count);
#else
    init_half_tables();

    for (size_t i = 0; i < count; i++) {
        uint32_t f;
        memcpy(&f, &src[i], sizeof(float));
        uint32_t sign = (f >> 16) & 0x8000;  /* Sign bit to half position */
        uint32_t exp = (f >> 23) & 0xFF;     /* 8-bit exponent */
        uint32_t sign_idx = (f >> 23) & 0x100; /* Sign bit for table index */
        dst[i] = (uint16_t)(g_base_table[exp | sign_idx] +
                            ((f & 0x007FFFFF) >> g_shift_table[exp | sign_idx]));
        dst[i] |= (uint16_t)sign;
    }
#endif
}

void exr_interleave_rgba(const float* r, const float* g, const float* b,
                          const float* a, float* rgba, size_t pixel_count) {
#ifdef TINYEXR_V3_USE_SIMD
    exr_simd_interleave_rgba(r, g, b, a, rgba, pixel_count);
#else
    for (size_t i = 0; i < pixel_count; i++) {
        rgba[i * 4 + 0] = r ? r[i] : 0.0f;
        rgba[i * 4 + 1] = g ? g[i] : 0.0f;
        rgba[i * 4 + 2] = b ? b[i] : 0.0f;
        rgba[i * 4 + 3] = a ? a[i] : 1.0f;
    }
#endif
}

void exr_deinterleave_rgba(const float* rgba, float* r, float* g, float* b,
                            float* a, size_t pixel_count) {
#ifdef TINYEXR_V3_USE_SIMD
    exr_simd_deinterleave_rgba(rgba, r, g, b, a, pixel_count);
#else
    for (size_t i = 0; i < pixel_count; i++) {
        if (r) r[i] = rgba[i * 4 + 0];
        if (g) g[i] = rgba[i * 4 + 1];
        if (b) b[i] = rgba[i * 4 + 2];
        if (a) a[i] = rgba[i * 4 + 3];
    }
#endif
}

/* ============================================================================
 * Header Parsing Constants
 * ============================================================================ */

/* EXR magic number: 0x76, 0x2f, 0x31, 0x01 */
static const uint8_t EXR_MAGIC[4] = { 0x76, 0x2f, 0x31, 0x01 };
static const size_t EXR_VERSION_SIZE = 8;
static const size_t EXR_MAX_ATTRIBUTE_NAME = 256;
static const size_t EXR_MAX_ATTRIBUTES = 128;

/* Parsing sub-states */
typedef enum ExrParseSubState {
    PARSE_STATE_VERSION = 0,
    PARSE_STATE_HEADER_ATTRS,
    PARSE_STATE_OFFSET_TABLE,
    PARSE_STATE_DONE,
} ExrParseSubState;

/* ============================================================================
 * Helper Functions for Parsing
 * ============================================================================ */

/* Read little-endian int32 */
static int32_t read_le_i32(const uint8_t* p) {
    return (int32_t)((uint32_t)p[0] | ((uint32_t)p[1] << 8) |
                     ((uint32_t)p[2] << 16) | ((uint32_t)p[3] << 24));
}

/* Read little-endian uint32 */
static uint32_t read_le_u32(const uint8_t* p) {
    return (uint32_t)p[0] | ((uint32_t)p[1] << 8) |
           ((uint32_t)p[2] << 16) | ((uint32_t)p[3] << 24);
}

/* Read little-endian uint64 */
static uint64_t read_le_u64(const uint8_t* p) {
    return (uint64_t)p[0] | ((uint64_t)p[1] << 8) |
           ((uint64_t)p[2] << 16) | ((uint64_t)p[3] << 24) |
           ((uint64_t)p[4] << 32) | ((uint64_t)p[5] << 40) |
           ((uint64_t)p[6] << 48) | ((uint64_t)p[7] << 56);
}

/* Read little-endian float */
static float read_le_f32(const uint8_t* p) {
    uint32_t u = read_le_u32(p);
    float f;
    memcpy(&f, &u, sizeof(float));
    return f;
}

/* Read null-terminated string (up to max_len chars, returns length including null) */
static size_t read_string(const uint8_t* data, size_t size, char* out, size_t max_len) {
    size_t i;
    for (i = 0; i < size && i < max_len - 1; i++) {
        out[i] = (char)data[i];
        if (data[i] == 0) {
            return i + 1;  /* Include null terminator in count */
        }
    }
    out[max_len - 1] = '\0';
    return 0;  /* Not found or truncated */
}

/* Synchronous fetch helper - fetches data synchronously from the data source */
static ExrResult sync_fetch(ExrDecoder decoder, uint64_t offset, uint64_t size, void* dst) {
    ExrDataSource* src = &decoder->source;
    return src->fetch(src->userdata, offset, size, dst, NULL, NULL);
}

/* Callback for async fetch completion */
static void parsing_fetch_complete(void* userdata, ExrResult result, size_t bytes_read) {
    ExrSuspendState state = (ExrSuspendState)userdata;
    if (!exr_suspend_is_valid(state)) return;

    state->async_result = result;
    state->async_bytes_read = bytes_read;
    state->async_complete = 1;
}

/* Unified fetch that handles both sync and async sources
 * For async sources, returns EXR_WOULD_BLOCK and saves state for resume
 * phase: the current parsing phase (for resume)
 *
 * NOTE: Header parsing uses small local buffers which can't survive across
 * async suspensions. For header parsing phases, we fall back to sync even
 * for async sources. Only chunk data phases (CHUNK_HEADER, CHUNK_DATA) use
 * true async with persistent buffers.
 */
static ExrResult unified_fetch(ExrDecoder decoder, uint64_t offset, uint64_t size,
                                void* dst, ExrParsePhase phase) {
    ExrDataSource* src = &decoder->source;

    /* For synchronous sources, fetch directly */
    if (!(src->flags & EXR_DATA_SOURCE_ASYNC)) {
        return src->fetch(src->userdata, offset, size, dst, NULL, NULL);
    }

    /* Only CHUNK_DATA phase uses persistent allocated buffers that can survive
     * async suspension. All other phases (including CHUNK_HEADER which uses a
     * local 8-byte buffer) must use synchronous fetch.
     */
    if (phase != EXR_PHASE_CHUNK_DATA) {
        return src->fetch(src->userdata, offset, size, dst, NULL, NULL);
    }

    /* Async source - allocate or reuse suspend state */
    ExrSuspendState state = decoder->suspend_state;
    if (!state) {
        ExrContext ctx = decoder->ctx;
        state = (ExrSuspendState)ctx->allocator.alloc(
            ctx->allocator.userdata, sizeof(struct ExrSuspendState_T), EXR_DEFAULT_ALIGNMENT);
        if (!state) {
            return EXR_ERROR_OUT_OF_MEMORY;
        }
        memset(state, 0, sizeof(struct ExrSuspendState_T));
        state->magic = EXR_SUSPEND_MAGIC;
        state->decoder = decoder;
        decoder->suspend_state = state;
    }

    /* Check if we're resuming from a previous async fetch */
    if (state->async_complete) {
        /* Previous async completed - check result */
        ExrResult result = state->async_result;
        state->async_complete = 0;  /* Reset for next fetch */
        return result;
    }

    /* Save state for resume */
    state->fetch_offset = offset;
    state->fetch_size = size;
    state->fetch_dst = dst;
    state->phase = phase;
    state->offset = decoder->current_offset;
    state->current_part = decoder->current_part_index;
    state->current_chunk = decoder->current_chunk_index;

    /* Initiate async fetch */
    ExrResult result = src->fetch(src->userdata, offset, size, dst,
                                   parsing_fetch_complete, state);

    if (result == EXR_WOULD_BLOCK) {
        /* Store the phase for resume */
        decoder->current_phase = phase;
        return EXR_WOULD_BLOCK;
    }

    /* Synchronous completion (some async sources complete immediately) */
    return result;
}

/* Ensure read buffer has at least 'size' bytes capacity */
static ExrResult ensure_read_buffer(ExrDecoder decoder, size_t size) {
    if (decoder->read_buffer_size >= size) {
        return EXR_SUCCESS;
    }

    ExrContext ctx = decoder->ctx;

    /* Free old buffer */
    if (decoder->read_buffer) {
        ctx->allocator.free(ctx->allocator.userdata,
                            decoder->read_buffer, decoder->read_buffer_size);
    }

    /* Allocate new buffer */
    decoder->read_buffer = (uint8_t*)ctx->allocator.alloc(
        ctx->allocator.userdata, size, EXR_DEFAULT_ALIGNMENT);
    if (!decoder->read_buffer) {
        decoder->read_buffer_size = 0;
        return EXR_ERROR_OUT_OF_MEMORY;
    }
    decoder->read_buffer_size = size;
    return EXR_SUCCESS;
}

/* ============================================================================
 * Version Parsing
 * ============================================================================ */

static ExrResult parse_exr_version(ExrDecoder decoder, ExrImage image) {
    ExrResult result;
    uint8_t version_buf[8];

    /* SUSPEND POINT 1: Read version header (8 bytes) */
    result = unified_fetch(decoder, 0, EXR_VERSION_SIZE, version_buf, EXR_PHASE_VERSION);
    if (result == EXR_WOULD_BLOCK) {
        return EXR_WOULD_BLOCK;  /* Async in progress */
    }
    if (EXR_FAILED(result)) {
        exr_context_add_error(decoder->ctx, result,
                              "Failed to read EXR version header", "version", 0);
        return result;
    }

    /* Verify magic number */
    if (version_buf[0] != EXR_MAGIC[0] || version_buf[1] != EXR_MAGIC[1] ||
        version_buf[2] != EXR_MAGIC[2] || version_buf[3] != EXR_MAGIC[3]) {
        exr_context_add_error(decoder->ctx, EXR_ERROR_INVALID_MAGIC,
                              "Invalid EXR magic number", "version", 0);
        return EXR_ERROR_INVALID_MAGIC;
    }

    /* Parse version byte (should be 2) */
    if (version_buf[4] != 2) {
        exr_context_add_error_fmt(decoder->ctx, EXR_ERROR_INVALID_VERSION,
                                  "version", 4, "Invalid EXR version: %d (expected 2)",
                                  version_buf[4]);
        return EXR_ERROR_INVALID_VERSION;
    }
    image->version = 2;

    /* Parse flags byte */
    uint8_t flags = version_buf[5];
    if (flags & 0x02) image->flags |= EXR_IMAGE_TILED;
    if (flags & 0x04) image->flags |= EXR_IMAGE_LONG_NAMES;
    if (flags & 0x08) image->flags |= EXR_IMAGE_DEEP;
    if (flags & 0x10) image->flags |= EXR_IMAGE_MULTIPART;

    decoder->current_offset = EXR_VERSION_SIZE;
    return EXR_SUCCESS;
}

/* ============================================================================
 * Attribute Parsing
 * ============================================================================ */

/* Map attribute type string to enum */
static ExrAttributeType parse_attribute_type(const char* type_name) {
    if (strcmp(type_name, "int") == 0) return EXR_ATTR_INT;
    if (strcmp(type_name, "float") == 0) return EXR_ATTR_FLOAT;
    if (strcmp(type_name, "double") == 0) return EXR_ATTR_DOUBLE;
    if (strcmp(type_name, "string") == 0) return EXR_ATTR_STRING;
    if (strcmp(type_name, "box2i") == 0) return EXR_ATTR_BOX2I;
    if (strcmp(type_name, "box2f") == 0) return EXR_ATTR_BOX2F;
    if (strcmp(type_name, "v2i") == 0) return EXR_ATTR_V2I;
    if (strcmp(type_name, "v2f") == 0) return EXR_ATTR_V2F;
    if (strcmp(type_name, "v3i") == 0) return EXR_ATTR_V3I;
    if (strcmp(type_name, "v3f") == 0) return EXR_ATTR_V3F;
    if (strcmp(type_name, "m33f") == 0) return EXR_ATTR_M33F;
    if (strcmp(type_name, "m44f") == 0) return EXR_ATTR_M44F;
    if (strcmp(type_name, "chlist") == 0) return EXR_ATTR_CHLIST;
    if (strcmp(type_name, "compression") == 0) return EXR_ATTR_COMPRESSION;
    if (strcmp(type_name, "lineOrder") == 0) return EXR_ATTR_LINEORDER;
    if (strcmp(type_name, "tiledesc") == 0) return EXR_ATTR_TILEDESC;
    if (strcmp(type_name, "preview") == 0) return EXR_ATTR_PREVIEW;
    if (strcmp(type_name, "rational") == 0) return EXR_ATTR_RATIONAL;
    if (strcmp(type_name, "keycode") == 0) return EXR_ATTR_KEYCODE;
    if (strcmp(type_name, "timecode") == 0) return EXR_ATTR_TIMECODE;
    if (strcmp(type_name, "chromaticities") == 0) return EXR_ATTR_CHROMATICITIES;
    if (strcmp(type_name, "envmap") == 0) return EXR_ATTR_ENVMAP;
    if (strcmp(type_name, "deepImageState") == 0) return EXR_ATTR_DEEPIMAGETYPE;
    return EXR_ATTR_OPAQUE;
}

/* Parse channel list attribute */
static ExrResult parse_channel_list(ExrPartData* part, const uint8_t* data, uint32_t size,
                                    ExrContext ctx) {
    /* Channel format:
     *   name: null-terminated string (1-255 bytes)
     *   pixel_type: int32 (0=UINT, 1=HALF, 2=FLOAT)
     *   pLinear: uint8
     *   reserved: 3 bytes (zeros)
     *   xSampling: int32
     *   ySampling: int32
     *   Repeat until empty name (single null byte)
     */

    /* First pass: count channels */
    uint32_t num_channels = 0;
    const uint8_t* p = data;
    const uint8_t* end = data + size;

    while (p < end && *p != 0) {
        /* Skip name */
        while (p < end && *p != 0) p++;
        if (p >= end) break;
        p++;  /* Skip null terminator */

        /* Skip channel data (16 bytes: pixel_type + pLinear + reserved + xSampling + ySampling) */
        if (p + 16 > end) break;
        p += 16;
        num_channels++;
    }

    if (num_channels == 0) {
        exr_context_add_error(ctx, EXR_ERROR_INVALID_DATA,
                              "No channels found in channel list", "channels", 0);
        return EXR_ERROR_INVALID_DATA;
    }

    /* Allocate channel array */
    part->channels = (ExrChannelData*)ctx->allocator.alloc(
        ctx->allocator.userdata, num_channels * sizeof(ExrChannelData), EXR_DEFAULT_ALIGNMENT);
    if (!part->channels) {
        return EXR_ERROR_OUT_OF_MEMORY;
    }
    memset(part->channels, 0, num_channels * sizeof(ExrChannelData));
    part->num_channels = num_channels;

    /* Second pass: parse channels */
    p = data;
    for (uint32_t i = 0; i < num_channels && p < end && *p != 0; i++) {
        ExrChannelData* ch = &part->channels[i];

        /* Parse name */
        size_t name_len = 0;
        while (p + name_len < end && p[name_len] != 0 && name_len < sizeof(ch->name) - 1) {
            ch->name[name_len] = (char)p[name_len];
            name_len++;
        }
        ch->name[name_len] = '\0';
        p += name_len + 1;  /* Skip name + null */

        if (p + 16 > end) break;

        /* Parse pixel type */
        int32_t pixel_type = read_le_i32(p);
        if (pixel_type < 0 || pixel_type > 2) {
            exr_context_add_error_fmt(ctx, EXR_ERROR_INVALID_DATA, "channels", 0,
                                      "Invalid pixel type %d for channel %s",
                                      pixel_type, ch->name);
            return EXR_ERROR_INVALID_DATA;
        }
        ch->pixel_type = (uint32_t)pixel_type;
        p += 4;

        /* Parse pLinear */
        ch->p_linear = *p;
        p += 4;  /* pLinear + 3 reserved bytes */

        /* Parse sampling */
        ch->x_sampling = read_le_i32(p);
        p += 4;
        ch->y_sampling = read_le_i32(p);
        p += 4;
    }

    return EXR_SUCCESS;
}

/* Parse a single attribute */
static ExrResult parse_attribute(ExrDecoder decoder, ExrPartData* part,
                                 uint64_t* offset, int* end_of_header) {
    ExrResult result;
    ExrContext ctx = decoder->ctx;
    uint8_t buf[512];

    *end_of_header = 0;

    /* SUSPEND POINT: Read attribute name */
    /* Read first byte to check for end of header */
    result = unified_fetch(decoder, *offset, 1, buf, EXR_PHASE_ATTRIBUTE_NAME);
    if (result == EXR_WOULD_BLOCK) return EXR_WOULD_BLOCK;
    if (EXR_FAILED(result)) return result;

    if (buf[0] == 0) {
        *end_of_header = 1;
        (*offset)++;
        return EXR_SUCCESS;
    }

    /* Read enough for name + type + size (max ~512 bytes for names) */
    result = unified_fetch(decoder, *offset, sizeof(buf), buf, EXR_PHASE_ATTRIBUTE_NAME);
    if (result == EXR_WOULD_BLOCK) return EXR_WOULD_BLOCK;
    if (EXR_FAILED(result)) return result;

    /* Parse attribute name */
    char attr_name[256];
    size_t name_len = read_string(buf, sizeof(buf), attr_name, sizeof(attr_name));
    if (name_len == 0) {
        exr_context_add_error(ctx, EXR_ERROR_INVALID_DATA,
                              "Attribute name too long or missing null terminator",
                              "header", *offset);
        return EXR_ERROR_INVALID_DATA;
    }

    /* Parse attribute type */
    char attr_type[64];
    size_t type_len = read_string(buf + name_len, sizeof(buf) - name_len, attr_type, sizeof(attr_type));
    if (type_len == 0) {
        exr_context_add_error(ctx, EXR_ERROR_INVALID_DATA,
                              "Attribute type too long or missing null terminator",
                              "header", *offset);
        return EXR_ERROR_INVALID_DATA;
    }

    /* Parse attribute size */
    size_t header_size = name_len + type_len;
    if (header_size + 4 > sizeof(buf)) {
        exr_context_add_error(ctx, EXR_ERROR_INVALID_DATA,
                              "Attribute header too large", "header", *offset);
        return EXR_ERROR_INVALID_DATA;
    }

    uint32_t attr_size = read_le_u32(buf + header_size);
    header_size += 4;

    /* Validate size */
    if (attr_size > 16 * 1024 * 1024) {  /* 16MB max for single attribute */
        exr_context_add_error_fmt(ctx, EXR_ERROR_INVALID_DATA, "header", *offset,
                                  "Attribute %s size too large: %u", attr_name, attr_size);
        return EXR_ERROR_INVALID_DATA;
    }

    /* Read attribute value */
    uint8_t* attr_data = buf + header_size;
    if (header_size + attr_size > sizeof(buf)) {
        /* Need to allocate larger buffer */
        result = ensure_read_buffer(decoder, attr_size);
        if (EXR_FAILED(result)) return result;

        result = unified_fetch(decoder, *offset + header_size, attr_size,
                                decoder->read_buffer, EXR_PHASE_ATTRIBUTE_DATA);
        if (result == EXR_WOULD_BLOCK) return EXR_WOULD_BLOCK;
        if (EXR_FAILED(result)) return result;
        attr_data = decoder->read_buffer;
    }

    /* Process known attributes */
    ExrImage image = part->channels ? NULL : decoder->image;  /* Use image for first part */
    (void)image;

    if (strcmp(attr_name, "channels") == 0) {
        result = parse_channel_list(part, attr_data, attr_size, ctx);
        if (EXR_FAILED(result)) return result;
    }
    else if (strcmp(attr_name, "compression") == 0 && attr_size >= 1) {
        part->compression = attr_data[0];
    }
    else if (strcmp(attr_name, "dataWindow") == 0 && attr_size >= 16) {
        if (decoder->image) {
            decoder->image->data_window.min_x = read_le_i32(attr_data);
            decoder->image->data_window.min_y = read_le_i32(attr_data + 4);
            decoder->image->data_window.max_x = read_le_i32(attr_data + 8);
            decoder->image->data_window.max_y = read_le_i32(attr_data + 12);
        }
        part->width = read_le_i32(attr_data + 8) - read_le_i32(attr_data) + 1;
        part->height = read_le_i32(attr_data + 12) - read_le_i32(attr_data + 4) + 1;
    }
    else if (strcmp(attr_name, "displayWindow") == 0 && attr_size >= 16) {
        if (decoder->image) {
            decoder->image->display_window.min_x = read_le_i32(attr_data);
            decoder->image->display_window.min_y = read_le_i32(attr_data + 4);
            decoder->image->display_window.max_x = read_le_i32(attr_data + 8);
            decoder->image->display_window.max_y = read_le_i32(attr_data + 12);
        }
    }
    else if (strcmp(attr_name, "lineOrder") == 0 && attr_size >= 1) {
        /* Line order: 0=increasing Y, 1=decreasing Y, 2=random */
        /* Stored in flags for now */
    }
    else if (strcmp(attr_name, "pixelAspectRatio") == 0 && attr_size >= 4) {
        if (decoder->image) {
            decoder->image->pixel_aspect_ratio = read_le_f32(attr_data);
        }
    }
    else if (strcmp(attr_name, "screenWindowCenter") == 0 && attr_size >= 8) {
        if (decoder->image) {
            decoder->image->screen_window_center.x = read_le_f32(attr_data);
            decoder->image->screen_window_center.y = read_le_f32(attr_data + 4);
        }
    }
    else if (strcmp(attr_name, "screenWindowWidth") == 0 && attr_size >= 4) {
        if (decoder->image) {
            decoder->image->screen_window_width = read_le_f32(attr_data);
        }
    }
    else if (strcmp(attr_name, "tiles") == 0 && attr_size >= 9) {
        part->tile_size_x = read_le_u32(attr_data);
        part->tile_size_y = read_le_u32(attr_data + 4);
        uint8_t tile_mode = attr_data[8];
        part->tile_level_mode = tile_mode & 0x3;
        part->tile_rounding_mode = (tile_mode >> 4) & 0x1;
        part->flags |= EXR_IMAGE_TILED;
    }
    else if (strcmp(attr_name, "chunkCount") == 0 && attr_size >= 4) {
        part->num_chunks = read_le_u32(attr_data);
    }
    else if (strcmp(attr_name, "name") == 0 && attr_size > 0) {
        /* Part name */
        size_t len = attr_size;
        if (attr_data[len - 1] == 0) len--;  /* Exclude null if present */
        part->name = (char*)ctx->allocator.alloc(ctx->allocator.userdata, len + 1, 1);
        if (part->name) {
            memcpy(part->name, attr_data, len);
            part->name[len] = '\0';
        }
    }
    else if (strcmp(attr_name, "type") == 0 && attr_size > 0) {
        /* Part type */
        size_t len = attr_size;
        if (attr_data[len - 1] == 0) len--;
        part->type_string = (char*)ctx->allocator.alloc(ctx->allocator.userdata, len + 1, 1);
        if (part->type_string) {
            memcpy(part->type_string, attr_data, len);
            part->type_string[len] = '\0';
            /* Parse part type */
            if (strcmp(part->type_string, "scanlineimage") == 0) {
                part->part_type = EXR_PART_SCANLINE;
            } else if (strcmp(part->type_string, "tiledimage") == 0) {
                part->part_type = EXR_PART_TILED;
            } else if (strcmp(part->type_string, "deepscanline") == 0) {
                part->part_type = EXR_PART_DEEP_SCANLINE;
            } else if (strcmp(part->type_string, "deeptile") == 0) {
                part->part_type = EXR_PART_DEEP_TILED;
            }
        }
    }
    else {
        /* Store as custom attribute */
        if (part->num_attributes < EXR_MAX_ATTRIBUTES) {
            /* Allocate or reallocate attribute array */
            size_t new_count = part->num_attributes + 1;
            ExrAttributeData* new_attrs = (ExrAttributeData*)ctx->allocator.alloc(
                ctx->allocator.userdata, new_count * sizeof(ExrAttributeData), EXR_DEFAULT_ALIGNMENT);
            if (new_attrs) {
                if (part->attributes) {
                    memcpy(new_attrs, part->attributes,
                           part->num_attributes * sizeof(ExrAttributeData));
                    ctx->allocator.free(ctx->allocator.userdata, part->attributes,
                                        part->num_attributes * sizeof(ExrAttributeData));
                }
                part->attributes = new_attrs;

                ExrAttributeData* attr = &part->attributes[part->num_attributes];
                memset(attr, 0, sizeof(ExrAttributeData));
                strncpy(attr->name, attr_name, sizeof(attr->name) - 1);
                strncpy(attr->type_name, attr_type, sizeof(attr->type_name) - 1);
                attr->type = parse_attribute_type(attr_type);
                attr->size = attr_size;
                if (attr_size > 0) {
                    attr->value = (uint8_t*)ctx->allocator.alloc(
                        ctx->allocator.userdata, attr_size, 1);
                    if (attr->value) {
                        memcpy(attr->value, attr_data, attr_size);
                    }
                }
                part->num_attributes++;
            }
        }
    }

    *offset += header_size + attr_size;
    return EXR_SUCCESS;
}

/* ============================================================================
 * Offset Table Parsing
 * ============================================================================ */

/* Calculate number of chunks for scanline images */
static uint32_t calc_scanline_chunks(ExrPartData* part) {
    int height = part->height;
    int lines_per_block;

    switch (part->compression) {
        case EXR_COMPRESSION_NONE:
        case EXR_COMPRESSION_RLE:
        case EXR_COMPRESSION_ZIPS:
            lines_per_block = 1;
            break;
        case EXR_COMPRESSION_ZIP:
        case EXR_COMPRESSION_PXR24:
            lines_per_block = 16;
            break;
        case EXR_COMPRESSION_PIZ:
        case EXR_COMPRESSION_B44:
        case EXR_COMPRESSION_B44A:
            lines_per_block = 32;
            break;
        case EXR_COMPRESSION_DWAA:
            lines_per_block = 32;
            break;
        case EXR_COMPRESSION_DWAB:
            lines_per_block = 256;
            break;
        default:
            lines_per_block = 1;
            break;
    }

    return (height + lines_per_block - 1) / lines_per_block;
}

/* Calculate number of chunks for tiled images */
/* Helper to calculate level dimension with rounding mode */
static int calc_level_dim(int size, int level, int round_up) {
    int result = size;
    for (int i = 0; i < level; i++) {
        if (round_up) {
            result = (result + 1) / 2;
        } else {
            result = result / 2;
        }
        if (result < 1) result = 1;
    }
    return result;
}

static uint32_t calc_tiled_chunks(ExrPartData* part) {
    if (part->tile_size_x == 0 || part->tile_size_y == 0) {
        return 0;
    }

    uint32_t num_x_tiles = (part->width + part->tile_size_x - 1) / part->tile_size_x;
    uint32_t num_y_tiles = (part->height + part->tile_size_y - 1) / part->tile_size_y;

    part->num_x_levels = 1;
    part->num_y_levels = 1;

    if (part->tile_level_mode == EXR_TILE_ONE_LEVEL) {
        return num_x_tiles * num_y_tiles;
    }

    int round_up = (part->tile_rounding_mode == EXR_TILE_ROUND_UP);

    if (part->tile_level_mode == EXR_TILE_MIPMAP_LEVELS) {
        /* Mipmap: X and Y levels are the same */
        uint32_t total = 0;
        int w = part->width;
        int h = part->height;
        while (w >= 1 && h >= 1) {
            uint32_t nx = (w + (int)part->tile_size_x - 1) / (int)part->tile_size_x;
            uint32_t ny = (h + (int)part->tile_size_y - 1) / (int)part->tile_size_y;
            total += nx * ny;
            part->num_x_levels++;
            if (round_up) {
                w = (w + 1) / 2;
                h = (h + 1) / 2;
            } else {
                w = w / 2;
                h = h / 2;
            }
            if (w < 1) w = 1;
            if (h < 1) h = 1;
            if (w <= 1 && h <= 1) break;
        }
        part->num_y_levels = part->num_x_levels;
        return total;
    }

    if (part->tile_level_mode == EXR_TILE_RIPMAP_LEVELS) {
        /* Ripmap: independent X and Y level counts
         * Total tiles = sum over all (lx, ly) of tiles at that level */

        /* Calculate number of X levels */
        int w = part->width;
        while (w > 1) {
            part->num_x_levels++;
            if (round_up) {
                w = (w + 1) / 2;
            } else {
                w = w / 2;
            }
            if (w < 1) w = 1;
        }

        /* Calculate number of Y levels */
        int h = part->height;
        while (h > 1) {
            part->num_y_levels++;
            if (round_up) {
                h = (h + 1) / 2;
            } else {
                h = h / 2;
            }
            if (h < 1) h = 1;
        }

        /* Count total tiles across all level combinations */
        uint32_t total = 0;
        for (uint32_t ly = 0; ly < part->num_y_levels; ly++) {
            for (uint32_t lx = 0; lx < part->num_x_levels; lx++) {
                int level_w = calc_level_dim(part->width, lx, round_up);
                int level_h = calc_level_dim(part->height, ly, round_up);
                uint32_t nx = (level_w + (int)part->tile_size_x - 1) / (int)part->tile_size_x;
                uint32_t ny = (level_h + (int)part->tile_size_y - 1) / (int)part->tile_size_y;
                total += nx * ny;
            }
        }
        return total;
    }

    return num_x_tiles * num_y_tiles;  /* Fallback */
}

static ExrResult parse_offset_table(ExrDecoder decoder, ExrPartData* part, uint64_t* offset) {
    ExrResult result;
    ExrContext ctx = decoder->ctx;

    /* Calculate expected number of chunks */
    uint32_t expected_chunks;
    if (part->flags & EXR_IMAGE_TILED) {
        expected_chunks = calc_tiled_chunks(part);
    } else {
        expected_chunks = calc_scanline_chunks(part);
    }

    /* If chunkCount attribute was provided, use it */
    if (part->num_chunks == 0) {
        part->num_chunks = expected_chunks;
    }

    if (part->num_chunks == 0) {
        exr_context_add_error(ctx, EXR_ERROR_INVALID_DATA,
                              "Cannot determine chunk count", "offsets", *offset);
        return EXR_ERROR_INVALID_DATA;
    }

    /* SUSPEND POINT: Read offset table */
    size_t table_size = part->num_chunks * sizeof(uint64_t);
    part->offsets = (uint64_t*)ctx->allocator.alloc(
        ctx->allocator.userdata, table_size, EXR_DEFAULT_ALIGNMENT);
    if (!part->offsets) {
        return EXR_ERROR_OUT_OF_MEMORY;
    }

    result = unified_fetch(decoder, *offset, table_size, part->offsets, EXR_PHASE_OFFSET_TABLE);
    if (result == EXR_WOULD_BLOCK) return EXR_WOULD_BLOCK;
    if (EXR_FAILED(result)) {
        exr_context_add_error(ctx, result,
                              "Failed to read offset table", "offsets", *offset);
        return result;
    }

    /* Convert from little-endian */
    for (uint32_t i = 0; i < part->num_chunks; i++) {
        uint8_t* p = (uint8_t*)&part->offsets[i];
        part->offsets[i] = read_le_u64(p);
    }

    *offset += table_size;
    return EXR_SUCCESS;
}

/* ============================================================================
 * Main Header Parsing Function
 * ============================================================================ */

ExrResult exr_decoder_parse_header(ExrDecoder decoder, ExrImage* out_image) {
    if (!exr_decoder_is_valid(decoder)) {
        return EXR_ERROR_INVALID_HANDLE;
    }
    if (!out_image) {
        return EXR_ERROR_INVALID_ARGUMENT;
    }

    ExrContext ctx = decoder->ctx;
    ExrResult result;
    ExrImage image;

    /* Check if we're resuming from a suspended parse or starting fresh */
    if (decoder->state == EXR_DECODER_STATE_PARSING_HEADER) {
        /* Resuming - reuse existing image */
        image = decoder->image;
        if (!image) {
            return EXR_ERROR_INVALID_STATE;
        }
        /* Skip to the phase we were in */
        goto resume_parsing;
    } else if (decoder->state != EXR_DECODER_STATE_CREATED) {
        exr_context_add_error(decoder->ctx, EXR_ERROR_INVALID_STATE,
                              "Header already parsed or decoder in error state", NULL, 0);
        return EXR_ERROR_INVALID_STATE;
    }

    decoder->state = EXR_DECODER_STATE_PARSING_HEADER;

    /* Allocate image structure */
    image = (ExrImage)ctx->allocator.alloc(
        ctx->allocator.userdata, sizeof(struct ExrImage_T), EXR_DEFAULT_ALIGNMENT);
    if (!image) {
        decoder->state = EXR_DECODER_STATE_ERROR;
        return EXR_ERROR_OUT_OF_MEMORY;
    }
    memset(image, 0, sizeof(struct ExrImage_T));
    image->decoder = decoder;
    image->ctx = ctx;
    image->magic = EXR_IMAGE_MAGIC;
    image->pixel_aspect_ratio = 1.0f;
    image->screen_window_width = 1.0f;
    decoder->image = image;
    exr_context_add_ref(ctx);

resume_parsing:
    /* Parse version header */
    result = parse_exr_version(decoder, image);
    if (result == EXR_WOULD_BLOCK) {
        return EXR_WOULD_BLOCK;  /* Async in progress, don't clean up */
    }
    if (EXR_FAILED(result)) {
        exr_image_destroy(image);
        decoder->image = NULL;
        decoder->state = EXR_DECODER_STATE_ERROR;
        return result;
    }

    /* Allocate parts array (at least 1 for single-part files) */
    uint32_t max_parts = (image->flags & EXR_IMAGE_MULTIPART) ? 32 : 1;
    image->parts = (ExrPartData*)ctx->allocator.alloc(
        ctx->allocator.userdata, max_parts * sizeof(ExrPartData), EXR_DEFAULT_ALIGNMENT);
    if (!image->parts) {
        exr_image_destroy(image);
        decoder->image = NULL;
        decoder->state = EXR_DECODER_STATE_ERROR;
        return EXR_ERROR_OUT_OF_MEMORY;
    }
    memset(image->parts, 0, max_parts * sizeof(ExrPartData));

    uint64_t offset = decoder->current_offset;

    /* Parse headers (multiple for multipart files) */
    do {
        if (image->num_parts >= max_parts) {
            exr_context_add_error(ctx, EXR_ERROR_INVALID_DATA,
                                  "Too many parts in multipart file", "header", offset);
            exr_image_destroy(image);
            decoder->image = NULL;
            decoder->state = EXR_DECODER_STATE_ERROR;
            return EXR_ERROR_INVALID_DATA;
        }

        ExrPartData* part = &image->parts[image->num_parts];
        part->part_type = (image->flags & EXR_IMAGE_TILED) ? EXR_PART_TILED : EXR_PART_SCANLINE;

        /* Parse all attributes for this part */
        int end_of_header = 0;
        while (!end_of_header) {
            result = parse_attribute(decoder, part, &offset, &end_of_header);
            if (result == EXR_WOULD_BLOCK) {
                /* Save state for resume */
                decoder->current_offset = offset;
                decoder->current_part_index = image->num_parts;
                return EXR_WOULD_BLOCK;
            }
            if (EXR_FAILED(result)) {
                exr_image_destroy(image);
                decoder->image = NULL;
                decoder->state = EXR_DECODER_STATE_ERROR;
                return result;
            }
        }

        /* Update part type from tiles attribute */
        if (part->flags & EXR_IMAGE_TILED) {
            if (image->flags & EXR_IMAGE_DEEP) {
                part->part_type = EXR_PART_DEEP_TILED;
            } else {
                part->part_type = EXR_PART_TILED;
            }
        } else if (image->flags & EXR_IMAGE_DEEP) {
            part->part_type = EXR_PART_DEEP_SCANLINE;
        }

        image->num_parts++;

        /* For multipart files, check for empty header marking end */
        if (image->flags & EXR_IMAGE_MULTIPART) {
            uint8_t next_byte;
            result = unified_fetch(decoder, offset, 1, &next_byte, EXR_PHASE_END_OF_HEADER);
            if (result == EXR_WOULD_BLOCK) {
                /* Save state and return - resume will call parse_header again */
                decoder->current_offset = offset;
                decoder->current_part_index = image->num_parts;
                return EXR_WOULD_BLOCK;
            }
            if (EXR_FAILED(result)) {
                break;
            }
            if (next_byte == 0) {
                offset++;  /* Skip null terminator */
                break;
            }
        }
    } while (image->flags & EXR_IMAGE_MULTIPART);

    /* Parse offset tables for each part */
    for (uint32_t i = 0; i < image->num_parts; i++) {
        result = parse_offset_table(decoder, &image->parts[i], &offset);
        if (result == EXR_WOULD_BLOCK) {
            /* Save state for resume */
            decoder->current_offset = offset;
            decoder->current_part_index = i;
            return EXR_WOULD_BLOCK;
        }
        if (EXR_FAILED(result)) {
            exr_image_destroy(image);
            decoder->image = NULL;
            decoder->state = EXR_DECODER_STATE_ERROR;
            return result;
        }
    }

    decoder->current_offset = offset;
    decoder->state = EXR_DECODER_STATE_HEADER_PARSED;
    *out_image = image;

    return EXR_SUCCESS;
}

ExrResult exr_decoder_wait_idle(ExrDecoder decoder) {
    if (!exr_decoder_is_valid(decoder)) {
        return EXR_ERROR_INVALID_HANDLE;
    }
    /* For now, nothing to wait for in stub implementation */
    return EXR_SUCCESS;
}

/* ============================================================================
 * Async/Suspend API Implementation
 * ============================================================================ */

ExrResult exr_decoder_get_suspend_state(ExrDecoder decoder, ExrSuspendState* out_state) {
    if (!exr_decoder_is_valid(decoder)) {
        return EXR_ERROR_INVALID_HANDLE;
    }
    if (!out_state) {
        return EXR_ERROR_INVALID_ARGUMENT;
    }

    if (!decoder->suspend_state) {
        /* Create suspend state if it doesn't exist */
        ExrContext ctx = decoder->ctx;
        ExrSuspendState state = (ExrSuspendState)ctx->allocator.alloc(
            ctx->allocator.userdata, sizeof(struct ExrSuspendState_T), EXR_DEFAULT_ALIGNMENT);
        if (!state) {
            return EXR_ERROR_OUT_OF_MEMORY;
        }
        memset(state, 0, sizeof(struct ExrSuspendState_T));
        state->magic = EXR_SUSPEND_MAGIC;
        state->decoder = decoder;
        decoder->suspend_state = state;
    }

    *out_state = decoder->suspend_state;
    return EXR_SUCCESS;
}

ExrResult exr_suspend_get_pending_fetch(ExrSuspendState state, ExrPendingFetch* out_fetch) {
    if (!exr_suspend_is_valid(state)) {
        return EXR_ERROR_INVALID_HANDLE;
    }
    if (!out_fetch) {
        return EXR_ERROR_INVALID_ARGUMENT;
    }

    out_fetch->offset = state->fetch_offset;
    out_fetch->size = state->fetch_size;
    out_fetch->destination = state->fetch_dst;

    return EXR_SUCCESS;
}

ExrResult exr_suspend_complete_fetch(ExrSuspendState state, const void* data, size_t size) {
    if (!exr_suspend_is_valid(state)) {
        return EXR_ERROR_INVALID_HANDLE;
    }

    /* Copy data to destination if provided */
    if (data && state->fetch_dst && size > 0) {
        size_t copy_size = (size < state->fetch_size) ? size : (size_t)state->fetch_size;
        memcpy(state->fetch_dst, data, copy_size);
    }

    state->async_bytes_read = size;
    state->async_result = EXR_SUCCESS;
    state->async_complete = 1;

    return EXR_SUCCESS;
}

ExrResult exr_decoder_resume(ExrDecoder decoder) {
    if (!exr_decoder_is_valid(decoder)) {
        return EXR_ERROR_INVALID_HANDLE;
    }

    ExrSuspendState state = decoder->suspend_state;
    if (!state || !state->async_complete) {
        return EXR_ERROR_NOT_READY;
    }

    /* Reset async completion flag */
    state->async_complete = 0;

    /* Resume depends on current phase - for now, header parsing continues with
     * exr_decoder_parse_header, chunk loading continues with exr_submit */
    return EXR_SUCCESS;
}

/* ============================================================================
 * Deep Image Support
 * ============================================================================ */

ExrResult exr_part_get_deep_sample_counts(
    ExrDecoder decoder,
    ExrPart part,
    int32_t y_start,
    int32_t num_lines,
    ExrDeepSampleInfo* out_info
) {
    if (!exr_decoder_is_valid(decoder)) {
        return EXR_ERROR_INVALID_HANDLE;
    }

    ExrPartData* part_data = exr_part_get_data(part);
    if (!part_data) {
        return EXR_ERROR_INVALID_HANDLE;
    }
    if (!out_info) {
        return EXR_ERROR_INVALID_ARGUMENT;
    }

    /* Check if this is a deep image */
    if (part_data->part_type != EXR_PART_DEEP_SCANLINE &&
        part_data->part_type != EXR_PART_DEEP_TILED) {
        return EXR_ERROR_INVALID_DATA;  /* Not a deep image */
    }

    ExrContext ctx = decoder->ctx;
    ExrImage image = decoder->image;
    if (!image) {
        return EXR_ERROR_INVALID_STATE;
    }

    /* Calculate which chunk contains this scanline */
    int lines_per_block = get_lines_per_block((uint8_t)part_data->compression);
    if (num_lines <= 0) num_lines = lines_per_block;

    int block_index = (y_start - image->data_window.min_y) / lines_per_block;
    if (block_index < 0 || block_index >= (int)part_data->num_chunks) {
        return EXR_ERROR_OUT_OF_BOUNDS;
    }

    uint64_t offset = part_data->offsets[block_index];

    /* Read deep chunk header:
     * - int32: y coordinate
     * - int64: packed size of pixel offset table
     * - int64: packed size of sample data
     * - int64: unpacked size of sample data
     * Total: 28 bytes
     */
    uint8_t header[28];
    ExrResult result = sync_fetch(decoder, offset, 28, header);
    if (EXR_FAILED(result)) {
        return result;
    }

    int32_t line_no;
    int64_t packed_offset_table_size;
    int64_t packed_sample_data_size;
    int64_t unpacked_sample_data_size;

    memcpy(&line_no, header, 4);
    memcpy(&packed_offset_table_size, header + 4, 8);
    memcpy(&packed_sample_data_size, header + 12, 8);
    memcpy(&unpacked_sample_data_size, header + 20, 8);

    /* Read and decompress the pixel offset table */
    int width = part_data->width;
    size_t offset_table_size = (size_t)width * sizeof(int32_t);

    uint8_t* compressed_offsets = (uint8_t*)ctx->allocator.alloc(
        ctx->allocator.userdata, (size_t)packed_offset_table_size, EXR_DEFAULT_ALIGNMENT);
    if (!compressed_offsets) {
        return EXR_ERROR_OUT_OF_MEMORY;
    }

    result = sync_fetch(decoder, offset + 28, (size_t)packed_offset_table_size, compressed_offsets);
    if (EXR_FAILED(result)) {
        ctx->allocator.free(ctx->allocator.userdata, compressed_offsets, (size_t)packed_offset_table_size);
        return result;
    }

    int32_t* pixel_offsets = (int32_t*)ctx->allocator.alloc(
        ctx->allocator.userdata, offset_table_size, EXR_DEFAULT_ALIGNMENT);
    if (!pixel_offsets) {
        ctx->allocator.free(ctx->allocator.userdata, compressed_offsets, (size_t)packed_offset_table_size);
        return EXR_ERROR_OUT_OF_MEMORY;
    }

    /* Decompress offset table (ZIP compressed with predictor+reorder) */
    /* We need a temp buffer for decompression, then apply predictor+reorder */
    uint8_t* temp_buf = (uint8_t*)ctx->allocator.alloc(
        ctx->allocator.userdata, offset_table_size, EXR_DEFAULT_ALIGNMENT);
    if (!temp_buf) {
        ctx->allocator.free(ctx->allocator.userdata, compressed_offsets, (size_t)packed_offset_table_size);
        ctx->allocator.free(ctx->allocator.userdata, pixel_offsets, offset_table_size);
        return EXR_ERROR_OUT_OF_MEMORY;
    }

    bool decomp_ok = false;
#if defined(TINYEXR_V3_HAS_DEFLATE)
    size_t uncomp_size = offset_table_size;
    decomp_ok = tinyexr::huffman::inflate_zlib(compressed_offsets,
        (size_t)packed_offset_table_size, temp_buf, &uncomp_size);
    if (decomp_ok && uncomp_size != offset_table_size) {
        decomp_ok = false;
    }
#elif defined(TINYEXR_V3_USE_MINIZ)
    mz_ulong dst_len = (mz_ulong)offset_table_size;
    int zret = mz_uncompress(temp_buf, &dst_len,
                              compressed_offsets, (mz_ulong)packed_offset_table_size);
    decomp_ok = (zret == MZ_OK && dst_len == offset_table_size);
#endif
    ctx->allocator.free(ctx->allocator.userdata, compressed_offsets, (size_t)packed_offset_table_size);

    if (decomp_ok) {
        /* Apply predictor: t[i] = t[i-1] + t[i] - 128 */
        uint8_t* t = temp_buf + 1;
        uint8_t* stop = temp_buf + offset_table_size;
        while (t < stop) {
            int d = (int)t[-1] + (int)t[0] - 128;
            t[0] = (uint8_t)d;
            ++t;
        }

        /* Reorder bytes: interleave first half and second half */
        const uint8_t* t1 = temp_buf;
        const uint8_t* t2 = temp_buf + (offset_table_size + 1) / 2;
        uint8_t* dst = (uint8_t*)pixel_offsets;
        uint8_t* dst_stop = dst + offset_table_size;

        while (dst < dst_stop) {
            if (dst < dst_stop) *dst++ = *t1++;
            if (dst < dst_stop) *dst++ = *t2++;
        }
    }

    ctx->allocator.free(ctx->allocator.userdata, temp_buf, offset_table_size);

    if (!decomp_ok) {
        ctx->allocator.free(ctx->allocator.userdata, pixel_offsets, offset_table_size);
        return EXR_ERROR_DECOMPRESSION_FAILED;
    }

    /* Fill output info */
    out_info->y_start = line_no;
    out_info->num_lines = num_lines > lines_per_block ? lines_per_block : num_lines;
    out_info->width = width;

    /* Allocate sample_counts and sample_offsets */
    size_t num_pixels = (size_t)width * (size_t)out_info->num_lines;
    out_info->sample_counts = (uint32_t*)ctx->allocator.alloc(
        ctx->allocator.userdata, num_pixels * sizeof(uint32_t), EXR_DEFAULT_ALIGNMENT);
    out_info->sample_offsets = (uint64_t*)ctx->allocator.alloc(
        ctx->allocator.userdata, (num_pixels + 1) * sizeof(uint64_t), EXR_DEFAULT_ALIGNMENT);

    if (!out_info->sample_counts || !out_info->sample_offsets) {
        if (out_info->sample_counts) {
            ctx->allocator.free(ctx->allocator.userdata, out_info->sample_counts, num_pixels * sizeof(uint32_t));
        }
        if (out_info->sample_offsets) {
            ctx->allocator.free(ctx->allocator.userdata, out_info->sample_offsets, (num_pixels + 1) * sizeof(uint64_t));
        }
        ctx->allocator.free(ctx->allocator.userdata, pixel_offsets, offset_table_size);
        return EXR_ERROR_OUT_OF_MEMORY;
    }

    /* Convert pixel offsets to sample counts and cumulative offsets */
    uint64_t total_samples = 0;
    out_info->sample_offsets[0] = 0;
    for (size_t i = 0; i < num_pixels; i++) {
        int32_t offset_val = pixel_offsets[i < (size_t)width ? i : width - 1];
        int32_t prev_offset = (i > 0 && i < (size_t)width) ? pixel_offsets[i - 1] : 0;
        uint32_t count = (i < (size_t)width) ? (uint32_t)(offset_val - prev_offset) : 0;
        out_info->sample_counts[i] = count;
        total_samples += count;
        out_info->sample_offsets[i + 1] = total_samples;
    }
    out_info->total_samples = total_samples;

    ctx->allocator.free(ctx->allocator.userdata, pixel_offsets, offset_table_size);

    return EXR_SUCCESS;
}

void exr_deep_sample_info_free(ExrContext ctx, ExrDeepSampleInfo* info) {
    if (!exr_context_is_valid(ctx) || !info) return;

    size_t num_pixels = (size_t)info->width * (size_t)info->num_lines;
    if (info->sample_counts) {
        ctx->allocator.free(ctx->allocator.userdata, info->sample_counts, num_pixels * sizeof(uint32_t));
        info->sample_counts = NULL;
    }
    if (info->sample_offsets) {
        ctx->allocator.free(ctx->allocator.userdata, info->sample_offsets, (num_pixels + 1) * sizeof(uint64_t));
        info->sample_offsets = NULL;
    }
}

ExrResult exr_part_get_deep_tile_sample_counts(
    ExrDecoder decoder,
    ExrPart part,
    int32_t tile_x,
    int32_t tile_y,
    int32_t level_x,
    int32_t level_y,
    ExrDeepTileSampleInfo* out_info
) {
    if (!exr_decoder_is_valid(decoder)) {
        return EXR_ERROR_INVALID_HANDLE;
    }

    ExrPartData* part_data = exr_part_get_data(part);
    if (!part_data) {
        return EXR_ERROR_INVALID_HANDLE;
    }
    if (!out_info) {
        return EXR_ERROR_INVALID_ARGUMENT;
    }

    /* Check if this is a deep tiled image */
    if (part_data->part_type != EXR_PART_DEEP_TILED) {
        return EXR_ERROR_INVALID_DATA;  /* Not a deep tiled image */
    }

    ExrContext ctx = decoder->ctx;
    ExrImage image = decoder->image;
    if (!image) {
        return EXR_ERROR_INVALID_STATE;
    }

    /* Calculate tile index */
    uint32_t tile_index = calc_tile_index(part_data, tile_x, tile_y, level_x, level_y);
    if (tile_index >= part_data->num_chunks) {
        return EXR_ERROR_OUT_OF_BOUNDS;
    }

    uint64_t offset = part_data->offsets[tile_index];

    /* Read deep tile header:
     * - tile_x (4 bytes)
     * - tile_y (4 bytes)
     * - level_x (4 bytes)
     * - level_y (4 bytes)
     * - packed_offset_table_size (8 bytes)
     * - packed_sample_data_size (8 bytes)
     * - unpacked_sample_data_size (8 bytes)
     * Total: 40 bytes
     */
    uint8_t header[40];
    ExrResult result = sync_fetch(decoder, offset, 40, header);
    if (EXR_FAILED(result)) {
        return result;
    }

    int32_t hdr_tile_x = read_le_i32(header);
    int32_t hdr_tile_y = read_le_i32(header + 4);
    int32_t hdr_level_x = read_le_i32(header + 8);
    int32_t hdr_level_y = read_le_i32(header + 12);
    int64_t packed_offset_table_size;

    memcpy(&packed_offset_table_size, header + 16, 8);

    /* Validate header matches request */
    if (hdr_tile_x != tile_x || hdr_tile_y != tile_y ||
        hdr_level_x != level_x || hdr_level_y != level_y) {
        exr_context_add_error(ctx, EXR_ERROR_INVALID_DATA,
                              "Deep tile header mismatch", "tile", offset);
        return EXR_ERROR_INVALID_DATA;
    }

    /* Calculate tile dimensions */
    int level_width, level_height, num_x_tiles, num_y_tiles;
    calc_level_size(part_data, level_x, level_y, &level_width, &level_height,
                    &num_x_tiles, &num_y_tiles);

    int tile_start_x = tile_x * (int)part_data->tile_size_x;
    int tile_start_y = tile_y * (int)part_data->tile_size_y;
    int tile_end_x = tile_start_x + (int)part_data->tile_size_x;
    int tile_end_y = tile_start_y + (int)part_data->tile_size_y;

    if (tile_end_x > level_width) tile_end_x = level_width;
    if (tile_end_y > level_height) tile_end_y = level_height;

    int tile_width = tile_end_x - tile_start_x;
    int tile_height = tile_end_y - tile_start_y;

    /* Read and decompress the pixel offset table */
    size_t offset_table_size = (size_t)tile_width * (size_t)tile_height * sizeof(int32_t);

    uint8_t* compressed_offsets = (uint8_t*)ctx->allocator.alloc(
        ctx->allocator.userdata, (size_t)packed_offset_table_size, EXR_DEFAULT_ALIGNMENT);
    if (!compressed_offsets) {
        return EXR_ERROR_OUT_OF_MEMORY;
    }

    result = sync_fetch(decoder, offset + 40, (size_t)packed_offset_table_size, compressed_offsets);
    if (EXR_FAILED(result)) {
        ctx->allocator.free(ctx->allocator.userdata, compressed_offsets, (size_t)packed_offset_table_size);
        return result;
    }

    int32_t* pixel_offsets = (int32_t*)ctx->allocator.alloc(
        ctx->allocator.userdata, offset_table_size, EXR_DEFAULT_ALIGNMENT);
    if (!pixel_offsets) {
        ctx->allocator.free(ctx->allocator.userdata, compressed_offsets, (size_t)packed_offset_table_size);
        return EXR_ERROR_OUT_OF_MEMORY;
    }

    /* Decompress offset table (ZIP compressed with predictor+reorder) */
    uint8_t* temp_buf = (uint8_t*)ctx->allocator.alloc(
        ctx->allocator.userdata, offset_table_size, EXR_DEFAULT_ALIGNMENT);
    if (!temp_buf) {
        ctx->allocator.free(ctx->allocator.userdata, compressed_offsets, (size_t)packed_offset_table_size);
        ctx->allocator.free(ctx->allocator.userdata, pixel_offsets, offset_table_size);
        return EXR_ERROR_OUT_OF_MEMORY;
    }

    bool decomp_ok = false;
#if defined(TINYEXR_V3_HAS_DEFLATE)
    size_t uncomp_size = offset_table_size;
    decomp_ok = tinyexr::huffman::inflate_zlib(compressed_offsets,
        (size_t)packed_offset_table_size, temp_buf, &uncomp_size);
    if (decomp_ok && uncomp_size != offset_table_size) {
        decomp_ok = false;
    }
#elif defined(TINYEXR_V3_USE_MINIZ)
    mz_ulong dst_len = (mz_ulong)offset_table_size;
    int zret = mz_uncompress(temp_buf, &dst_len,
                              compressed_offsets, (mz_ulong)packed_offset_table_size);
    decomp_ok = (zret == MZ_OK && dst_len == offset_table_size);
#endif
    ctx->allocator.free(ctx->allocator.userdata, compressed_offsets, (size_t)packed_offset_table_size);

    if (decomp_ok) {
        /* Apply predictor: t[i] = t[i-1] + t[i] - 128 */
        uint8_t* t = temp_buf + 1;
        uint8_t* stop = temp_buf + offset_table_size;
        while (t < stop) {
            int d = (int)t[-1] + (int)t[0] - 128;
            t[0] = (uint8_t)d;
            ++t;
        }

        /* Reorder bytes: interleave first half and second half */
        const uint8_t* t1 = temp_buf;
        const uint8_t* t2 = temp_buf + (offset_table_size + 1) / 2;
        uint8_t* dst = (uint8_t*)pixel_offsets;
        uint8_t* dst_stop = dst + offset_table_size;

        while (dst < dst_stop) {
            if (dst < dst_stop) *dst++ = *t1++;
            if (dst < dst_stop) *dst++ = *t2++;
        }
    }

    ctx->allocator.free(ctx->allocator.userdata, temp_buf, offset_table_size);

    if (!decomp_ok) {
        ctx->allocator.free(ctx->allocator.userdata, pixel_offsets, offset_table_size);
        return EXR_ERROR_DECOMPRESSION_FAILED;
    }

    /* Fill output info */
    out_info->tile_x = tile_x;
    out_info->tile_y = tile_y;
    out_info->level_x = level_x;
    out_info->level_y = level_y;
    out_info->width = tile_width;
    out_info->height = tile_height;

    /* Allocate sample_counts and sample_offsets */
    size_t num_pixels = (size_t)tile_width * (size_t)tile_height;
    out_info->sample_counts = (uint32_t*)ctx->allocator.alloc(
        ctx->allocator.userdata, num_pixels * sizeof(uint32_t), EXR_DEFAULT_ALIGNMENT);
    out_info->sample_offsets = (uint64_t*)ctx->allocator.alloc(
        ctx->allocator.userdata, (num_pixels + 1) * sizeof(uint64_t), EXR_DEFAULT_ALIGNMENT);

    if (!out_info->sample_counts || !out_info->sample_offsets) {
        if (out_info->sample_counts) {
            ctx->allocator.free(ctx->allocator.userdata, out_info->sample_counts, num_pixels * sizeof(uint32_t));
        }
        if (out_info->sample_offsets) {
            ctx->allocator.free(ctx->allocator.userdata, out_info->sample_offsets, (num_pixels + 1) * sizeof(uint64_t));
        }
        ctx->allocator.free(ctx->allocator.userdata, pixel_offsets, offset_table_size);
        return EXR_ERROR_OUT_OF_MEMORY;
    }

    /* Convert pixel offsets to sample counts and cumulative offsets */
    uint64_t total_samples = 0;
    out_info->sample_offsets[0] = 0;
    for (size_t i = 0; i < num_pixels; i++) {
        int32_t offset_val = pixel_offsets[i];
        int32_t prev_offset = (i > 0) ? pixel_offsets[i - 1] : 0;
        uint32_t count = (uint32_t)(offset_val - prev_offset);
        out_info->sample_counts[i] = count;
        total_samples += count;
        out_info->sample_offsets[i + 1] = total_samples;
    }
    out_info->total_samples = total_samples;

    ctx->allocator.free(ctx->allocator.userdata, pixel_offsets, offset_table_size);

    return EXR_SUCCESS;
}

void exr_deep_tile_sample_info_free(ExrContext ctx, ExrDeepTileSampleInfo* info) {
    if (!exr_context_is_valid(ctx) || !info) return;

    size_t num_pixels = (size_t)info->width * (size_t)info->height;
    if (info->sample_counts) {
        ctx->allocator.free(ctx->allocator.userdata, info->sample_counts, num_pixels * sizeof(uint32_t));
        info->sample_counts = NULL;
    }
    if (info->sample_offsets) {
        ctx->allocator.free(ctx->allocator.userdata, info->sample_offsets, (num_pixels + 1) * sizeof(uint64_t));
        info->sample_offsets = NULL;
    }
}

ExrResult exr_cmd_request_deep_scanlines(ExrCommandBuffer cmd,
                                          const ExrDeepScanlineRequest* request) {
    if (!exr_command_buffer_is_valid(cmd)) {
        return EXR_ERROR_INVALID_HANDLE;
    }
    if (!cmd->recording) {
        return EXR_ERROR_INVALID_STATE;
    }
    if (!request || !request->part || !request->sample_info || !request->output.data) {
        return EXR_ERROR_INVALID_ARGUMENT;
    }

    ExrResult result = ensure_command_capacity(cmd);
    if (EXR_FAILED(result)) return result;

    ExrDeepScanlineReadCmd* deep_cmd = &cmd->commands[cmd->command_count].deep_scanline_read;
    deep_cmd->base.type = EXR_CMD_TYPE_READ_DEEP_SCANLINES;
    deep_cmd->base.part_index = request->part->part_index;
    deep_cmd->y_start = request->y_start;
    deep_cmd->num_lines = request->num_lines;
    deep_cmd->sample_info = request->sample_info;
    deep_cmd->output = request->output.data;
    deep_cmd->output_size = request->output.size;
    deep_cmd->channels_mask = request->channels_mask;
    deep_cmd->output_pixel_type = request->output_pixel_type;

    cmd->command_count++;
    return EXR_SUCCESS;
}

ExrResult exr_cmd_request_deep_tiles(ExrCommandBuffer cmd,
                                      const ExrDeepTileRequest* request) {
    if (!exr_command_buffer_is_valid(cmd)) {
        return EXR_ERROR_INVALID_HANDLE;
    }
    if (!cmd->recording) {
        return EXR_ERROR_INVALID_STATE;
    }
    if (!request || !request->part || !request->sample_info || !request->output.data) {
        return EXR_ERROR_INVALID_ARGUMENT;
    }

    ExrResult result = ensure_command_capacity(cmd);
    if (EXR_FAILED(result)) return result;

    ExrDeepTileReadCmd* deep_cmd = &cmd->commands[cmd->command_count].deep_tile_read;
    deep_cmd->base.type = EXR_CMD_TYPE_READ_DEEP_TILES;
    deep_cmd->base.part_index = request->part->part_index;
    deep_cmd->tile_x = request->tile_x;
    deep_cmd->tile_y = request->tile_y;
    deep_cmd->level_x = request->level_x;
    deep_cmd->level_y = request->level_y;
    deep_cmd->sample_info = request->sample_info;
    deep_cmd->output = request->output.data;
    deep_cmd->output_size = request->output.size;
    deep_cmd->channels_mask = request->channels_mask;
    deep_cmd->output_pixel_type = request->output_pixel_type;

    cmd->command_count++;
    return EXR_SUCCESS;
}

ExrResult exr_cmd_request_deep_tile_batch(ExrCommandBuffer cmd, uint32_t count,
                                           const ExrDeepTileRequest* requests) {
    if (!exr_command_buffer_is_valid(cmd)) {
        return EXR_ERROR_INVALID_HANDLE;
    }
    if (!cmd->recording) {
        return EXR_ERROR_INVALID_STATE;
    }
    if (count == 0) {
        return EXR_SUCCESS;
    }
    if (!requests) {
        return EXR_ERROR_INVALID_ARGUMENT;
    }

    for (uint32_t i = 0; i < count; i++) {
        ExrResult result = exr_cmd_request_deep_tiles(cmd, &requests[i]);
        if (EXR_FAILED(result)) return result;
    }

    return EXR_SUCCESS;
}

/* ============================================================================
 * Multipart and Attribute API (Fully Implemented)
 * ============================================================================ */

ExrResult exr_image_find_part_by_name(ExrImage image, const char* name,
                                       ExrPart* out_part) {
    if (!exr_image_is_valid(image)) {
        return EXR_ERROR_INVALID_HANDLE;
    }
    if (!name || !out_part) {
        return EXR_ERROR_INVALID_ARGUMENT;
    }

    for (uint32_t i = 0; i < image->num_parts; i++) {
        if (image->parts[i].name && strcmp(image->parts[i].name, name) == 0) {
            return exr_image_get_part(image, i, out_part);
        }
    }

    return EXR_ERROR_MISSING_ATTRIBUTE;
}

ExrResult exr_part_get_attribute_count(ExrPart part, uint32_t* out_count) {
    ExrPartData* data = exr_part_get_data(part);
    if (!data) {
        return EXR_ERROR_INVALID_HANDLE;
    }
    if (!out_count) {
        return EXR_ERROR_INVALID_ARGUMENT;
    }
    *out_count = data->num_attributes;
    return EXR_SUCCESS;
}

ExrResult exr_part_get_attribute(ExrPart part, const char* name,
                                  ExrAttribute* out_attr) {
    ExrPartData* data = exr_part_get_data(part);
    if (!data) {
        return EXR_ERROR_INVALID_HANDLE;
    }
    if (!name || !out_attr) {
        return EXR_ERROR_INVALID_ARGUMENT;
    }

    for (uint32_t i = 0; i < data->num_attributes; i++) {
        if (strcmp(data->attributes[i].name, name) == 0) {
            out_attr->name = data->attributes[i].name;
            out_attr->type_name = data->attributes[i].type_name;
            out_attr->type = data->attributes[i].type;
            out_attr->value = data->attributes[i].value;
            out_attr->size = data->attributes[i].size;
            return EXR_SUCCESS;
        }
    }

    return EXR_ERROR_MISSING_ATTRIBUTE;
}

ExrResult exr_part_get_attribute_at(ExrPart part, uint32_t index,
                                     ExrAttribute* out_attr) {
    ExrPartData* data = exr_part_get_data(part);
    if (!data) {
        return EXR_ERROR_INVALID_HANDLE;
    }
    if (!out_attr) {
        return EXR_ERROR_INVALID_ARGUMENT;
    }
    if (index >= data->num_attributes) {
        return EXR_ERROR_OUT_OF_BOUNDS;
    }

    out_attr->name = data->attributes[index].name;
    out_attr->type_name = data->attributes[index].type_name;
    out_attr->type = data->attributes[index].type;
    out_attr->value = data->attributes[index].value;
    out_attr->size = data->attributes[index].size;
    return EXR_SUCCESS;
}

int exr_part_has_attribute(ExrPart part, const char* name) {
    ExrPartData* data = exr_part_get_data(part);
    if (!data || !name) {
        return 0;
    }

    for (uint32_t i = 0; i < data->num_attributes; i++) {
        if (strcmp(data->attributes[i].name, name) == 0) {
            return 1;
        }
    }
    return 0;
}

/* Command buffer request and submit functions are implemented above */

/* ============================================================================
 * Encoder API
 * Basic implementation supporting scanline images with ZIP compression.
 * ============================================================================ */

#define EXR_ENCODER_MAGIC 0x45585245  /* "EXRE" */
#define EXR_WRITE_IMAGE_MAGIC 0x45585257  /* "EXRW" */

/* Memory sink state */
typedef struct MemorySinkState {
    uint8_t* data;
    size_t size;
    size_t capacity;
    void** out_data_ptr;
    size_t* out_size_ptr;
    ExrContext ctx;
} MemorySinkState;

/* Write channel info (internal) */
typedef struct WriteChannelData {
    char name[64];
    uint32_t pixel_type;
    int32_t x_sampling;
    int32_t y_sampling;
    uint8_t p_linear;
} WriteChannelData;

/* Custom attribute storage (internal) */
typedef struct WriteCustomAttribute {
    char name[256];
    char type[64];
    uint8_t* data;
    uint32_t size;
} WriteCustomAttribute;

#define MAX_CUSTOM_ATTRIBUTES 64

#define MAX_MULTIPART_PARTS 254

struct ExrEncoder_T {
    uint32_t magic;
    ExrContext ctx;
    ExrDataSink sink;
    uint32_t flags;
    uint64_t write_offset;
    /* Multipart support */
    struct ExrWriteImage_T* parts[MAX_MULTIPART_PARTS];
    uint32_t num_parts;
    int is_multipart;
    int headers_written;
};

struct ExrWriteImage_T {
    uint32_t magic;
    ExrEncoder encoder;
    int32_t width;
    int32_t height;
    uint32_t num_channels;
    WriteChannelData* channels;
    uint32_t compression;
    int32_t compression_level;
    uint32_t flags;
    int32_t tile_size_x;
    int32_t tile_size_y;
    ExrBox2i data_window;
    ExrBox2i display_window;
    uint64_t header_end_offset;
    uint64_t* scanline_offsets;
    uint32_t num_scanline_blocks;
    /* Custom attributes */
    WriteCustomAttribute custom_attrs[MAX_CUSTOM_ATTRIBUTES];
    uint32_t num_custom_attrs;
    /* Multipart support */
    char part_name[256];
    uint32_t part_index;
    uint64_t offset_table_pos;   /* Position where offset table starts */
};

static int exr_encoder_is_valid(ExrEncoder encoder) {
    return encoder && encoder->magic == EXR_ENCODER_MAGIC;
}

static int exr_write_image_is_valid(ExrWriteImage image) {
    return image && image->magic == EXR_WRITE_IMAGE_MAGIC;
}

/* Memory sink callbacks */
static ExrResult memory_sink_write(void* userdata, uint64_t offset,
                                    const void* data, uint64_t size,
                                    ExrFetchComplete on_complete,
                                    void* complete_userdata) {
    MemorySinkState* state = (MemorySinkState*)userdata;

    /* Ensure capacity */
    size_t required = (size_t)(offset + size);
    if (required > state->capacity) {
        size_t new_cap = state->capacity * 2;
        if (new_cap < required) new_cap = required;
        if (new_cap < 4096) new_cap = 4096;

        uint8_t* new_data = (uint8_t*)state->ctx->allocator.alloc(
            state->ctx->allocator.userdata, new_cap, EXR_DEFAULT_ALIGNMENT);
        if (!new_data) {
            if (on_complete) on_complete(complete_userdata, EXR_ERROR_OUT_OF_MEMORY, 0);
            return EXR_ERROR_OUT_OF_MEMORY;
        }
        if (state->data && state->size > 0) {
            memcpy(new_data, state->data, state->size);
        }
        if (state->data) {
            state->ctx->allocator.free(state->ctx->allocator.userdata,
                                        state->data, state->capacity);
        }
        state->data = new_data;
        state->capacity = new_cap;
    }

    /* Write data */
    memcpy(state->data + offset, data, (size_t)size);
    if ((size_t)(offset + size) > state->size) {
        state->size = (size_t)(offset + size);
    }

    /* Update output pointers */
    *state->out_data_ptr = state->data;
    *state->out_size_ptr = state->size;

    if (on_complete) on_complete(complete_userdata, EXR_SUCCESS, (size_t)size);
    return EXR_SUCCESS;
}

ExrResult exr_data_sink_to_memory(ExrContext ctx, ExrDataSink* out_sink,
                                   void** out_data, size_t* out_size) {
    if (!exr_context_is_valid(ctx) || !out_sink || !out_data || !out_size) {
        return EXR_ERROR_INVALID_ARGUMENT;
    }

    MemorySinkState* state = (MemorySinkState*)ctx->allocator.alloc(
        ctx->allocator.userdata, sizeof(MemorySinkState), EXR_DEFAULT_ALIGNMENT);
    if (!state) {
        return EXR_ERROR_OUT_OF_MEMORY;
    }

    memset(state, 0, sizeof(MemorySinkState));
    state->ctx = ctx;
    state->out_data_ptr = out_data;
    state->out_size_ptr = out_size;
    *out_data = NULL;
    *out_size = 0;

    out_sink->userdata = state;
    out_sink->write = memory_sink_write;
    out_sink->cancel = NULL;
    out_sink->flags = 0;

    return EXR_SUCCESS;
}

ExrResult exr_encoder_create(ExrContext ctx,
                              const ExrEncoderCreateInfo* create_info,
                              ExrEncoder* out_encoder) {
    if (!exr_context_is_valid(ctx)) {
        return EXR_ERROR_INVALID_HANDLE;
    }
    if (!create_info || !out_encoder) {
        return EXR_ERROR_INVALID_ARGUMENT;
    }
    if (!create_info->sink.write) {
        return EXR_ERROR_INVALID_ARGUMENT;
    }

    ExrEncoder encoder = (ExrEncoder)ctx->allocator.alloc(
        ctx->allocator.userdata, sizeof(struct ExrEncoder_T), EXR_DEFAULT_ALIGNMENT);
    if (!encoder) {
        return EXR_ERROR_OUT_OF_MEMORY;
    }

    memset(encoder, 0, sizeof(struct ExrEncoder_T));
    encoder->magic = EXR_ENCODER_MAGIC;
    encoder->ctx = ctx;
    encoder->sink = create_info->sink;
    encoder->flags = create_info->flags;
    encoder->write_offset = 0;

    *out_encoder = encoder;
    return EXR_SUCCESS;
}

void exr_encoder_destroy(ExrEncoder encoder) {
    if (!exr_encoder_is_valid(encoder)) return;

    ExrContext ctx = encoder->ctx;
    encoder->magic = 0;
    ctx->allocator.free(ctx->allocator.userdata, encoder, sizeof(struct ExrEncoder_T));
}

ExrResult exr_encoder_finalize(ExrEncoder encoder) {
    if (!exr_encoder_is_valid(encoder)) {
        return EXR_ERROR_INVALID_HANDLE;
    }
    /* For now, nothing special to finalize - all writes are immediate */
    return EXR_SUCCESS;
}

ExrResult exr_write_image_create(ExrEncoder encoder,
                                  const ExrWriteImageCreateInfo* create_info,
                                  ExrWriteImage* out_image) {
    if (!exr_encoder_is_valid(encoder)) {
        return EXR_ERROR_INVALID_HANDLE;
    }
    if (!create_info || !out_image) {
        return EXR_ERROR_INVALID_ARGUMENT;
    }
    if (create_info->width <= 0 || create_info->height <= 0) {
        return EXR_ERROR_INVALID_ARGUMENT;
    }
    if (create_info->num_channels == 0 || !create_info->channels) {
        return EXR_ERROR_INVALID_ARGUMENT;
    }

    ExrContext ctx = encoder->ctx;

    ExrWriteImage image = (ExrWriteImage)ctx->allocator.alloc(
        ctx->allocator.userdata, sizeof(struct ExrWriteImage_T), EXR_DEFAULT_ALIGNMENT);
    if (!image) {
        return EXR_ERROR_OUT_OF_MEMORY;
    }

    memset(image, 0, sizeof(struct ExrWriteImage_T));
    image->magic = EXR_WRITE_IMAGE_MAGIC;
    image->encoder = encoder;
    image->width = create_info->width;
    image->height = create_info->height;
    image->num_channels = create_info->num_channels;
    image->compression = create_info->compression;
    image->compression_level = create_info->compression_level > 0 ? create_info->compression_level : 6;
    image->flags = create_info->flags;
    image->tile_size_x = create_info->tile_size_x;
    image->tile_size_y = create_info->tile_size_y;

    /* Set windows */
    if (create_info->data_window) {
        image->data_window = *create_info->data_window;
    } else {
        image->data_window.min_x = 0;
        image->data_window.min_y = 0;
        image->data_window.max_x = create_info->width - 1;
        image->data_window.max_y = create_info->height - 1;
    }
    if (create_info->display_window) {
        image->display_window = *create_info->display_window;
    } else {
        image->display_window = image->data_window;
    }

    /* Allocate and copy channel info */
    image->channels = (WriteChannelData*)ctx->allocator.alloc(
        ctx->allocator.userdata, create_info->num_channels * sizeof(WriteChannelData),
        EXR_DEFAULT_ALIGNMENT);
    if (!image->channels) {
        ctx->allocator.free(ctx->allocator.userdata, image, sizeof(struct ExrWriteImage_T));
        return EXR_ERROR_OUT_OF_MEMORY;
    }

    for (uint32_t i = 0; i < create_info->num_channels; i++) {
        const ExrWriteChannelInfo* src = &create_info->channels[i];
        WriteChannelData* dst = &image->channels[i];
        if (src->name) {
            strncpy(dst->name, src->name, 63);
            dst->name[63] = '\0';
        } else {
            dst->name[0] = '\0';
        }
        dst->pixel_type = src->pixel_type;
        dst->x_sampling = src->x_sampling > 0 ? src->x_sampling : 1;
        dst->y_sampling = src->y_sampling > 0 ? src->y_sampling : 1;
        dst->p_linear = src->p_linear;
    }

    /* Store part name for multipart */
    if (create_info->part_name) {
        strncpy(image->part_name, create_info->part_name, 255);
        image->part_name[255] = '\0';
    } else {
        image->part_name[0] = '\0';
    }

    /* Register with encoder for multipart */
    if (create_info->flags & EXR_WRITE_MULTIPART) {
        if (encoder->num_parts >= MAX_MULTIPART_PARTS) {
            ctx->allocator.free(ctx->allocator.userdata, image->channels,
                                create_info->num_channels * sizeof(WriteChannelData));
            ctx->allocator.free(ctx->allocator.userdata, image, sizeof(struct ExrWriteImage_T));
            return EXR_ERROR_OUT_OF_MEMORY;  /* Too many parts */
        }
        if (!create_info->part_name || create_info->part_name[0] == '\0') {
            /* Generate default part name */
            snprintf(image->part_name, 255, "part%u", encoder->num_parts);
        }
        image->part_index = encoder->num_parts;
        encoder->parts[encoder->num_parts++] = image;
        encoder->is_multipart = 1;
    }

    *out_image = image;
    return EXR_SUCCESS;
}

void exr_write_image_destroy(ExrWriteImage image) {
    if (!exr_write_image_is_valid(image)) return;

    ExrContext ctx = image->encoder->ctx;

    if (image->channels) {
        ctx->allocator.free(ctx->allocator.userdata, image->channels,
                            image->num_channels * sizeof(WriteChannelData));
    }
    if (image->scanline_offsets) {
        ctx->allocator.free(ctx->allocator.userdata, image->scanline_offsets,
                            image->num_scanline_blocks * sizeof(uint64_t));
    }

    /* Free custom attribute data */
    for (uint32_t i = 0; i < image->num_custom_attrs; i++) {
        if (image->custom_attrs[i].data) {
            ctx->allocator.free(ctx->allocator.userdata,
                                image->custom_attrs[i].data,
                                image->custom_attrs[i].size);
        }
    }

    image->magic = 0;
    ctx->allocator.free(ctx->allocator.userdata, image, sizeof(struct ExrWriteImage_T));
}

ExrResult exr_write_image_set_attribute(ExrWriteImage image, const char* name,
                                         const char* type, const void* value,
                                         uint32_t size) {
    if (!exr_write_image_is_valid(image)) {
        return EXR_ERROR_INVALID_HANDLE;
    }
    if (!name || !type || !value || size == 0) {
        return EXR_ERROR_INVALID_ARGUMENT;
    }
    if (strlen(name) >= 256 || strlen(type) >= 64) {
        return EXR_ERROR_INVALID_ARGUMENT;
    }
    if (image->num_custom_attrs >= MAX_CUSTOM_ATTRIBUTES) {
        return EXR_ERROR_OUT_OF_MEMORY;  /* Too many custom attributes */
    }

    /* Check if attribute already exists (update it) */
    for (uint32_t i = 0; i < image->num_custom_attrs; i++) {
        if (strcmp(image->custom_attrs[i].name, name) == 0) {
            /* Free old data and update */
            ExrContext ctx = image->encoder->ctx;
            if (image->custom_attrs[i].data) {
                ctx->allocator.free(ctx->allocator.userdata,
                                    image->custom_attrs[i].data,
                                    image->custom_attrs[i].size);
            }
            image->custom_attrs[i].data = (uint8_t*)ctx->allocator.alloc(
                ctx->allocator.userdata, size, EXR_DEFAULT_ALIGNMENT);
            if (!image->custom_attrs[i].data) {
                return EXR_ERROR_OUT_OF_MEMORY;
            }
            memcpy(image->custom_attrs[i].data, value, size);
            strncpy(image->custom_attrs[i].type, type, 63);
            image->custom_attrs[i].type[63] = '\0';
            image->custom_attrs[i].size = size;
            return EXR_SUCCESS;
        }
    }

    /* Add new attribute */
    ExrContext ctx = image->encoder->ctx;
    WriteCustomAttribute* attr = &image->custom_attrs[image->num_custom_attrs];

    strncpy(attr->name, name, 255);
    attr->name[255] = '\0';
    strncpy(attr->type, type, 63);
    attr->type[63] = '\0';

    attr->data = (uint8_t*)ctx->allocator.alloc(
        ctx->allocator.userdata, size, EXR_DEFAULT_ALIGNMENT);
    if (!attr->data) {
        return EXR_ERROR_OUT_OF_MEMORY;
    }
    memcpy(attr->data, value, size);
    attr->size = size;

    image->num_custom_attrs++;
    return EXR_SUCCESS;
}

ExrResult exr_write_image_set_int_attribute(ExrWriteImage image, const char* name,
                                             int32_t value) {
    return exr_write_image_set_attribute(image, name, "int", &value, sizeof(value));
}

ExrResult exr_write_image_set_float_attribute(ExrWriteImage image, const char* name,
                                               float value) {
    return exr_write_image_set_attribute(image, name, "float", &value, sizeof(value));
}

ExrResult exr_write_image_set_string_attribute(ExrWriteImage image, const char* name,
                                                const char* value) {
    if (!value) return EXR_ERROR_INVALID_ARGUMENT;
    return exr_write_image_set_attribute(image, name, "string", value,
                                          (uint32_t)(strlen(value) + 1));
}

/* Write commands - add write requests to command buffer */
ExrResult exr_cmd_write_tile(ExrCommandBuffer cmd, const ExrTileWrite* write) {
    if (!exr_command_buffer_is_valid(cmd)) {
        return EXR_ERROR_INVALID_HANDLE;
    }
    if (!write || !write->image || !write->input.data) {
        return EXR_ERROR_INVALID_ARGUMENT;
    }
    if (!exr_write_image_is_valid(write->image)) {
        return EXR_ERROR_INVALID_HANDLE;
    }
    if (!(write->image->flags & EXR_WRITE_TILED)) {
        return EXR_ERROR_INVALID_ARGUMENT;  /* Not a tiled image */
    }

    ExrResult result = ensure_command_capacity(cmd);
    if (EXR_FAILED(result)) return result;

    ExrTileWriteCmd* tile_cmd = &cmd->commands[cmd->command_count].tile_write;
    tile_cmd->base.type = EXR_CMD_TYPE_WRITE_TILE;
    tile_cmd->base.part_index = 0;
    tile_cmd->image = write->image;
    tile_cmd->tile_x = write->tile_x;
    tile_cmd->tile_y = write->tile_y;
    tile_cmd->level_x = write->level_x;
    tile_cmd->level_y = write->level_y;
    tile_cmd->input = write->input.data;
    tile_cmd->input_size = write->input.size;
    tile_cmd->input_layout = write->input_layout;
    tile_cmd->input_pixel_type = write->input_pixel_type;

    cmd->command_count++;
    return EXR_SUCCESS;
}

ExrResult exr_cmd_write_tiles(ExrCommandBuffer cmd, uint32_t count,
                               const ExrTileWrite* writes) {
    if (!exr_command_buffer_is_valid(cmd)) {
        return EXR_ERROR_INVALID_HANDLE;
    }
    if (!writes || count == 0) {
        return EXR_ERROR_INVALID_ARGUMENT;
    }

    for (uint32_t i = 0; i < count; i++) {
        ExrResult result = exr_cmd_write_tile(cmd, &writes[i]);
        if (EXR_FAILED(result)) return result;
    }
    return EXR_SUCCESS;
}

ExrResult exr_cmd_write_scanlines(ExrCommandBuffer cmd,
                                   const ExrScanlineWrite* write) {
    if (!exr_command_buffer_is_valid(cmd)) {
        return EXR_ERROR_INVALID_HANDLE;
    }
    if (!write || !write->image || !write->input.data) {
        return EXR_ERROR_INVALID_ARGUMENT;
    }
    if (!exr_write_image_is_valid(write->image)) {
        return EXR_ERROR_INVALID_HANDLE;
    }
    if (write->image->flags & EXR_WRITE_TILED) {
        return EXR_ERROR_INVALID_ARGUMENT;  /* Use write_tile for tiled images */
    }

    ExrResult result = ensure_command_capacity(cmd);
    if (EXR_FAILED(result)) return result;

    ExrScanlineWriteCmd* scan_cmd = &cmd->commands[cmd->command_count].scanline_write;
    scan_cmd->base.type = EXR_CMD_TYPE_WRITE_SCANLINES;
    scan_cmd->base.part_index = 0;
    scan_cmd->image = write->image;
    scan_cmd->y_start = write->y_start;
    scan_cmd->num_lines = write->num_lines;
    scan_cmd->input = write->input.data;
    scan_cmd->input_size = write->input.size;
    scan_cmd->input_layout = write->input_layout;
    scan_cmd->input_pixel_type = write->input_pixel_type;

    cmd->command_count++;
    return EXR_SUCCESS;
}

ExrResult exr_cmd_write_deep_scanlines(ExrCommandBuffer cmd,
                                        const ExrDeepScanlineWrite* write) {
    if (!exr_command_buffer_is_valid(cmd)) {
        return EXR_ERROR_INVALID_HANDLE;
    }
    if (!write || !write->image || !write->input.data || !write->sample_counts) {
        return EXR_ERROR_INVALID_ARGUMENT;
    }
    if (!exr_write_image_is_valid(write->image)) {
        return EXR_ERROR_INVALID_HANDLE;
    }
    if (!(write->image->flags & EXR_WRITE_DEEP)) {
        return EXR_ERROR_INVALID_ARGUMENT;  /* Image must have DEEP flag */
    }
    if (write->width <= 0 || write->num_lines <= 0) {
        return EXR_ERROR_INVALID_ARGUMENT;
    }

    ExrResult result = ensure_command_capacity(cmd);
    if (EXR_FAILED(result)) return result;

    ExrDeepScanlineWriteCmd* deep_cmd = &cmd->commands[cmd->command_count].deep_scanline_write;
    deep_cmd->base.type = EXR_CMD_TYPE_WRITE_DEEP_SCANLINES;
    deep_cmd->base.part_index = 0;
    deep_cmd->image = write->image;
    deep_cmd->y_start = write->y_start;
    deep_cmd->num_lines = write->num_lines;
    deep_cmd->width = write->width;
    deep_cmd->sample_counts = write->sample_counts;
    deep_cmd->total_samples = write->total_samples;
    deep_cmd->input = write->input.data;
    deep_cmd->input_size = write->input.size;
    deep_cmd->input_layout = write->input_layout;
    deep_cmd->input_pixel_type = write->input_pixel_type;

    cmd->command_count++;
    return EXR_SUCCESS;
}

ExrResult exr_cmd_write_deep_tiles(ExrCommandBuffer cmd,
                                    const ExrDeepTileWrite* write) {
    if (!exr_command_buffer_is_valid(cmd)) {
        return EXR_ERROR_INVALID_HANDLE;
    }
    if (!write || !write->image || !write->input.data || !write->sample_counts) {
        return EXR_ERROR_INVALID_ARGUMENT;
    }
    if (!exr_write_image_is_valid(write->image)) {
        return EXR_ERROR_INVALID_HANDLE;
    }
    if (!(write->image->flags & EXR_WRITE_DEEP)) {
        return EXR_ERROR_INVALID_ARGUMENT;  /* Image must have DEEP flag */
    }
    if (!(write->image->flags & EXR_WRITE_TILED)) {
        return EXR_ERROR_INVALID_ARGUMENT;  /* Image must have TILED flag */
    }
    if (write->width <= 0 || write->height <= 0) {
        return EXR_ERROR_INVALID_ARGUMENT;
    }

    ExrResult result = ensure_command_capacity(cmd);
    if (EXR_FAILED(result)) return result;

    ExrDeepTileWriteCmd* deep_cmd = &cmd->commands[cmd->command_count].deep_tile_write;
    deep_cmd->base.type = EXR_CMD_TYPE_WRITE_DEEP_TILES;
    deep_cmd->base.part_index = 0;
    deep_cmd->image = write->image;
    deep_cmd->tile_x = write->tile_x;
    deep_cmd->tile_y = write->tile_y;
    deep_cmd->level_x = write->level_x;
    deep_cmd->level_y = write->level_y;
    deep_cmd->width = write->width;
    deep_cmd->height = write->height;
    deep_cmd->sample_counts = write->sample_counts;
    deep_cmd->total_samples = write->total_samples;
    deep_cmd->input = write->input.data;
    deep_cmd->input_size = write->input.size;
    deep_cmd->input_layout = write->input_layout;
    deep_cmd->input_pixel_type = write->input_pixel_type;

    cmd->command_count++;
    return EXR_SUCCESS;
}

/* Helper: write bytes to the encoder's data sink */
static ExrResult encoder_write(ExrEncoder encoder, uint64_t offset,
                                const void* data, uint64_t size) {
    if (!encoder->sink.write) {
        return EXR_ERROR_INVALID_STATE;
    }
    return encoder->sink.write(encoder->sink.userdata, offset, data, size, NULL, NULL);
}

/* Helper: get lines per block for a compression type */
static int get_write_lines_per_block(uint32_t compression) {
    switch (compression) {
        case EXR_COMPRESSION_NONE:
        case EXR_COMPRESSION_RLE:
        case EXR_COMPRESSION_ZIPS:
            return 1;
        case EXR_COMPRESSION_ZIP:
        case EXR_COMPRESSION_PXR24:
            return 16;
        case EXR_COMPRESSION_PIZ:
        case EXR_COMPRESSION_B44:
        case EXR_COMPRESSION_B44A:
            return 32;
        default:
            return 16;
    }
}

/* Helper: write EXR header attribute */
static ExrResult write_attribute(ExrEncoder encoder, uint64_t* offset,
                                  const char* name, const char* type,
                                  const void* data, uint32_t size) {
    ExrResult result;
    size_t name_len = strlen(name) + 1;
    size_t type_len = strlen(type) + 1;

    /* Write name */
    result = encoder_write(encoder, *offset, name, name_len);
    if (EXR_FAILED(result)) return result;
    *offset += name_len;

    /* Write type */
    result = encoder_write(encoder, *offset, type, type_len);
    if (EXR_FAILED(result)) return result;
    *offset += type_len;

    /* Write size */
    result = encoder_write(encoder, *offset, &size, 4);
    if (EXR_FAILED(result)) return result;
    *offset += 4;

    /* Write data */
    result = encoder_write(encoder, *offset, data, size);
    if (EXR_FAILED(result)) return result;
    *offset += size;

    return EXR_SUCCESS;
}

/* Helper: convert pixels from input layout to EXR channel-planar layout */
static void convert_to_exr_layout(const void* input, void* output,
                                   int width, int height, int num_channels,
                                   WriteChannelData* channels,
                                   uint32_t input_pixel_type, uint32_t input_layout) {
    /* Get input bytes per component */
    size_t input_bytes = 4;
    if (input_pixel_type == EXR_PIXEL_HALF) input_bytes = 2;
    else if (input_pixel_type == EXR_PIXEL_UINT) input_bytes = 4;

    /* Calculate output bytes per channel (based on channel pixel types) */
    size_t* out_bytes = (size_t*)alloca(num_channels * sizeof(size_t));
    for (int c = 0; c < num_channels; c++) {
        switch (channels[c].pixel_type) {
            case EXR_PIXEL_HALF: out_bytes[c] = 2; break;
            case EXR_PIXEL_FLOAT: out_bytes[c] = 4; break;
            case EXR_PIXEL_UINT: out_bytes[c] = 4; break;
            default: out_bytes[c] = 4; break;
        }
    }

    const uint8_t* src = (const uint8_t*)input;
    uint8_t* dst = (uint8_t*)output;

    /* EXR stores channels in alphabetical order within each scanline */
    /* Each scanline has channels stored sequentially: AAAA...BBBB...GGGG...RRRR... */
    for (int y = 0; y < height; y++) {
        for (int c = 0; c < num_channels; c++) {
            for (int x = 0; x < width; x++) {
                size_t src_offset;
                if (input_layout == EXR_LAYOUT_INTERLEAVED) {
                    src_offset = ((size_t)y * width + x) * num_channels * input_bytes + c * input_bytes;
                } else {
                    /* Planar input */
                    src_offset = (size_t)c * width * height * input_bytes + ((size_t)y * width + x) * input_bytes;
                }

                /* Convert pixel type if needed */
                if (input_pixel_type == channels[c].pixel_type) {
                    memcpy(dst, src + src_offset, out_bytes[c]);
                } else {
                    /* Type conversion */
                    float val = 0.0f;
                    if (input_pixel_type == EXR_PIXEL_FLOAT) {
                        memcpy(&val, src + src_offset, 4);
                    } else if (input_pixel_type == EXR_PIXEL_HALF) {
                        uint16_t h;
                        memcpy(&h, src + src_offset, 2);
                        val = half_to_float_single(h);
                    } else if (input_pixel_type == EXR_PIXEL_UINT) {
                        uint32_t u;
                        memcpy(&u, src + src_offset, 4);
                        val = (float)u;
                    }

                    if (channels[c].pixel_type == EXR_PIXEL_FLOAT) {
                        memcpy(dst, &val, 4);
                    } else if (channels[c].pixel_type == EXR_PIXEL_HALF) {
                        uint16_t h = float_to_half_single(val);
                        memcpy(dst, &h, 2);
                    } else if (channels[c].pixel_type == EXR_PIXEL_UINT) {
                        uint32_t u = (uint32_t)val;
                        memcpy(dst, &u, 4);
                    }
                }
                dst += out_bytes[c];
            }
        }
    }
}

/* Helper: RLE encode data (OpenEXR style)
   Format (signed char interpretation):
   - Negative value (-n): followed by n literal bytes
   - Non-negative value (n): next byte repeated n+1 times
   Same format as rleCompress in OpenEXR/tinyexr.h */
static size_t rle_encode(const uint8_t* src, size_t src_size, uint8_t* dst, size_t dst_capacity) {
    if (src_size == 0) return 0;

    #define MAX_RUN_LENGTH 127

    const uint8_t* in = src;
    const uint8_t* in_end = src + src_size;
    signed char* out = (signed char*)dst;
    const signed char* out_end = (signed char*)dst + dst_capacity;

    while (in < in_end) {
        /* Check for run of identical bytes (need at least 3 to be worth it) */
        const uint8_t* run_end = in + 1;
        while (run_end < in_end && *run_end == *in &&
               run_end - in < MAX_RUN_LENGTH) {
            ++run_end;
        }

        if (run_end - in >= 3) {
            /* Encode run: count-1 (non-negative), then the byte */
            if (out + 2 > out_end) return 0;
            *out++ = (signed char)((run_end - in) - 1);
            *out++ = (signed char)*in;
            in = run_end;
        } else {
            /* Encode literal run (non-repeating bytes) */
            const uint8_t* run_start = in;

            while (run_end < in_end &&
                   ((run_end + 1 >= in_end || *run_end != *(run_end + 1)) ||
                    (run_end + 2 >= in_end || *(run_end + 1) != *(run_end + 2))) &&
                   run_end - run_start < MAX_RUN_LENGTH) {
                ++run_end;
            }

            /* Write literal: negative count, then literal bytes */
            if (out + 1 + (run_end - run_start) > out_end) return 0;
            *out++ = (signed char)(run_start - run_end);  /* Negative count */

            while (run_start < run_end) {
                *out++ = (signed char)*run_start++;
            }

            in = run_end;
        }

        if (run_end < in_end) ++run_end;
    }

    return (size_t)((uint8_t*)out - dst);
    #undef MAX_RUN_LENGTH
}

/* Helper: reorder bytes for RLE/ZIP compression
   Split bytes into two halves: first half gets even-indexed bytes, second half gets odd-indexed bytes */
static void reorder_bytes_for_compression(const uint8_t* src, uint8_t* dst, size_t size) {
#ifdef TINYEXR_V3_USE_SIMD
    exr_simd_reorder_bytes(src, dst, size);
#else
    size_t half = (size + 1) / 2;
    uint8_t* t1 = dst;
    uint8_t* t2 = dst + half;
    const uint8_t* s = src;
    const uint8_t* stop = src + size;
    while (s < stop) {
        if (s < stop) *t1++ = *s++;
        if (s < stop) *t2++ = *s++;
    }
#endif
}

/* Helper: apply delta predictor for RLE/ZIP compression
   Each byte becomes (current - previous + 128) mod 256 */
static void apply_delta_predictor_encode(uint8_t* data, size_t size) {
#ifdef TINYEXR_V3_USE_SIMD
    exr_simd_delta_encode(data, size);
#else
    if (size < 2) return;
    uint8_t* end = data + size - 1;
    while (end > data) {
        int d = (int)end[0] - (int)end[-1] + 128;
        end[0] = (uint8_t)d;
        --end;
    }
#endif
}

/* Helper: compress scanline data */
static ExrResult compress_scanline_data(ExrContext ctx, const void* input, size_t input_size,
                                         void** output, size_t* output_size,
                                         uint32_t compression) {
    if (compression == EXR_COMPRESSION_NONE) {
        /* No compression - just copy */
        void* copy = ctx->allocator.alloc(ctx->allocator.userdata, input_size, EXR_DEFAULT_ALIGNMENT);
        if (!copy) return EXR_ERROR_OUT_OF_MEMORY;
        memcpy(copy, input, input_size);
        *output = copy;
        *output_size = input_size;
        return EXR_SUCCESS;
    }

    if (compression == EXR_COMPRESSION_RLE) {
        /* RLE compression: 1) reorder bytes, 2) apply predictor, 3) RLE encode */

        /* Allocate temp buffer for reordered + predicted data */
        uint8_t* temp_buf = (uint8_t*)ctx->allocator.alloc(ctx->allocator.userdata, input_size, EXR_DEFAULT_ALIGNMENT);
        if (!temp_buf) return EXR_ERROR_OUT_OF_MEMORY;

        /* Step 1: Reorder bytes (split odd/even) */
        reorder_bytes_for_compression((const uint8_t*)input, temp_buf, input_size);

        /* Step 2: Apply delta predictor */
        apply_delta_predictor_encode(temp_buf, input_size);

        /* Step 3: RLE encode */
        size_t max_compressed = input_size + (input_size / 127) + 2;
        uint8_t* compressed = (uint8_t*)ctx->allocator.alloc(ctx->allocator.userdata, max_compressed, EXR_DEFAULT_ALIGNMENT);
        if (!compressed) {
            ctx->allocator.free(ctx->allocator.userdata, temp_buf, input_size);
            return EXR_ERROR_OUT_OF_MEMORY;
        }

        size_t compressed_size = rle_encode(temp_buf, input_size, compressed, max_compressed);
        ctx->allocator.free(ctx->allocator.userdata, temp_buf, input_size);

        if (compressed_size == 0 || compressed_size >= input_size) {
            /* Compression didn't help, store uncompressed */
            ctx->allocator.free(ctx->allocator.userdata, compressed, max_compressed);
            void* copy = ctx->allocator.alloc(ctx->allocator.userdata, input_size, EXR_DEFAULT_ALIGNMENT);
            if (!copy) return EXR_ERROR_OUT_OF_MEMORY;
            memcpy(copy, input, input_size);
            *output = copy;
            *output_size = input_size;
            return EXR_SUCCESS;
        }

        *output = compressed;
        *output_size = compressed_size;
        return EXR_SUCCESS;
    }

#if defined(TINYEXR_V3_USE_MINIZ)
    if (compression == EXR_COMPRESSION_ZIP || compression == EXR_COMPRESSION_ZIPS) {
        /* ZIP compression using miniz */
        mz_ulong compressed_bound = mz_compressBound((mz_ulong)input_size);
        void* compressed = ctx->allocator.alloc(ctx->allocator.userdata, compressed_bound, EXR_DEFAULT_ALIGNMENT);
        if (!compressed) return EXR_ERROR_OUT_OF_MEMORY;

        mz_ulong compressed_size = compressed_bound;
        int mz_result = mz_compress((unsigned char*)compressed, &compressed_size,
                                     (const unsigned char*)input, (mz_ulong)input_size);
        if (mz_result != MZ_OK) {
            ctx->allocator.free(ctx->allocator.userdata, compressed, compressed_bound);
            return EXR_ERROR_COMPRESSION_FAILED;
        }

        *output = compressed;
        *output_size = (size_t)compressed_size;
        return EXR_SUCCESS;
    }
#endif

    /* For other compression types, fall back to no compression */
    void* copy = ctx->allocator.alloc(ctx->allocator.userdata, input_size, EXR_DEFAULT_ALIGNMENT);
    if (!copy) return EXR_ERROR_OUT_OF_MEMORY;
    memcpy(copy, input, input_size);
    *output = copy;
    *output_size = input_size;
    return EXR_SUCCESS;
}

ExrResult exr_submit_write(ExrEncoder encoder, const ExrSubmitInfo* submit_info) {
    if (!exr_encoder_is_valid(encoder)) {
        return EXR_ERROR_INVALID_HANDLE;
    }
    if (!submit_info || !submit_info->command_buffers || submit_info->command_buffer_count == 0) {
        return EXR_ERROR_INVALID_ARGUMENT;
    }

    ExrContext ctx = encoder->ctx;
    ExrResult result;
    uint64_t offset = 0;

    /* Collect all write commands from all command buffers */
    ExrWriteImage write_image = NULL;
    uint32_t total_write_commands = 0;
    int is_tiled = 0;
    int is_deep = 0;

    for (uint32_t i = 0; i < submit_info->command_buffer_count; i++) {
        ExrCommandBuffer cmd = submit_info->command_buffers[i];
        if (!exr_command_buffer_is_valid(cmd)) continue;

        for (uint32_t j = 0; j < cmd->command_count; j++) {
            if (cmd->commands[j].base.type == EXR_CMD_TYPE_WRITE_SCANLINES) {
                if (!write_image) {
                    write_image = cmd->commands[j].scanline_write.image;
                }
                total_write_commands++;
            } else if (cmd->commands[j].base.type == EXR_CMD_TYPE_WRITE_TILE) {
                if (!write_image) {
                    write_image = cmd->commands[j].tile_write.image;
                    is_tiled = 1;
                }
                total_write_commands++;
            } else if (cmd->commands[j].base.type == EXR_CMD_TYPE_WRITE_DEEP_SCANLINES) {
                if (!write_image) {
                    write_image = cmd->commands[j].deep_scanline_write.image;
                    is_deep = 1;
                }
                total_write_commands++;
            } else if (cmd->commands[j].base.type == EXR_CMD_TYPE_WRITE_DEEP_TILES) {
                if (!write_image) {
                    write_image = cmd->commands[j].deep_tile_write.image;
                    is_deep = 1;
                    is_tiled = 1;
                }
                total_write_commands++;
            }
        }
    }

    if (!write_image || total_write_commands == 0) {
        return EXR_ERROR_INVALID_ARGUMENT;  /* No write commands */
    }

    /* Check consistency */
    if (is_tiled && !(write_image->flags & EXR_WRITE_TILED)) {
        return EXR_ERROR_INVALID_ARGUMENT;  /* Tile commands for non-tiled image */
    }
    if (is_deep && !(write_image->flags & EXR_WRITE_DEEP)) {
        return EXR_ERROR_INVALID_ARGUMENT;  /* Deep commands for non-deep image */
    }

    /* ===== Write EXR Header ===== */

    int is_multipart = encoder->is_multipart;

    /* Magic number */
    uint32_t magic = 0x01312f76;
    result = encoder_write(encoder, offset, &magic, 4);
    if (EXR_FAILED(result)) return result;
    offset += 4;

    /* Version: version 2, with flags */
    uint32_t version = 2;
    if (write_image->flags & EXR_WRITE_TILED) {
        version |= 0x200;  /* Tiled flag (bit 9) */
    }
    if (is_deep) {
        version |= 0x800;  /* Non-image flag (bit 11) - required for deep */
    }
    if (is_multipart) {
        version |= 0x1000;  /* Multipart flag (bit 12) */
    }
    result = encoder_write(encoder, offset, &version, 4);
    if (EXR_FAILED(result)) return result;
    offset += 4;

    /* For multipart or deep images: write "name" and "type" attributes */
    /* Deep images require the type attribute even in non-multipart files */
    if (is_multipart || is_deep) {
        /* Part name (required for multipart, optional for deep-only) */
        if (is_multipart) {
            size_t name_len = strlen(write_image->part_name) + 1;
            result = write_attribute(encoder, &offset, "name", "string",
                                      write_image->part_name, (uint32_t)name_len);
            if (EXR_FAILED(result)) return result;
        }

        /* Part type (required for deep and multipart) */
        const char* type_str;
        if (write_image->flags & EXR_WRITE_DEEP) {
            type_str = (write_image->flags & EXR_WRITE_TILED) ? "deeptile" : "deepscanline";
        } else {
            type_str = (write_image->flags & EXR_WRITE_TILED) ? "tiledimage" : "scanlineimage";
        }
        result = write_attribute(encoder, &offset, "type", "string",
                                  type_str, (uint32_t)(strlen(type_str) + 1));
        if (EXR_FAILED(result)) return result;
    }

    /* Channels attribute */
    size_t chlist_size = 0;
    for (uint32_t c = 0; c < write_image->num_channels; c++) {
        chlist_size += strlen(write_image->channels[c].name) + 1;  /* name + null */
        chlist_size += 4 + 4 + 4 + 4 + 4;  /* pixel_type, pLinear(3 reserved), xSampling, ySampling */
    }
    chlist_size += 1;  /* Final null byte */

    uint8_t* chlist_data = (uint8_t*)ctx->allocator.alloc(ctx->allocator.userdata, chlist_size, EXR_DEFAULT_ALIGNMENT);
    if (!chlist_data) return EXR_ERROR_OUT_OF_MEMORY;

    uint8_t* chlist_ptr = chlist_data;
    for (uint32_t c = 0; c < write_image->num_channels; c++) {
        size_t name_len = strlen(write_image->channels[c].name) + 1;
        memcpy(chlist_ptr, write_image->channels[c].name, name_len);
        chlist_ptr += name_len;

        uint32_t pixel_type = write_image->channels[c].pixel_type;
        memcpy(chlist_ptr, &pixel_type, 4);
        chlist_ptr += 4;

        uint32_t plinear = write_image->channels[c].p_linear;
        memcpy(chlist_ptr, &plinear, 4);  /* pLinear + 3 reserved bytes */
        chlist_ptr += 4;

        int32_t xsamp = write_image->channels[c].x_sampling;
        int32_t ysamp = write_image->channels[c].y_sampling;
        memcpy(chlist_ptr, &xsamp, 4);
        chlist_ptr += 4;
        memcpy(chlist_ptr, &ysamp, 4);
        chlist_ptr += 4;
    }
    *chlist_ptr = 0;  /* Null terminator */

    result = write_attribute(encoder, &offset, "channels", "chlist", chlist_data, (uint32_t)chlist_size);
    ctx->allocator.free(ctx->allocator.userdata, chlist_data, chlist_size);
    if (EXR_FAILED(result)) return result;

    /* Compression attribute */
    uint8_t comp_byte = (uint8_t)write_image->compression;
    result = write_attribute(encoder, &offset, "compression", "compression", &comp_byte, 1);
    if (EXR_FAILED(result)) return result;

    /* Data window */
    result = write_attribute(encoder, &offset, "dataWindow", "box2i",
                              &write_image->data_window, sizeof(ExrBox2i));
    if (EXR_FAILED(result)) return result;

    /* Display window */
    result = write_attribute(encoder, &offset, "displayWindow", "box2i",
                              &write_image->display_window, sizeof(ExrBox2i));
    if (EXR_FAILED(result)) return result;

    /* Line order (increasing Y) */
    uint8_t line_order = 0;
    result = write_attribute(encoder, &offset, "lineOrder", "lineOrder", &line_order, 1);
    if (EXR_FAILED(result)) return result;

    /* Pixel aspect ratio */
    float pixel_aspect = 1.0f;
    result = write_attribute(encoder, &offset, "pixelAspectRatio", "float", &pixel_aspect, 4);
    if (EXR_FAILED(result)) return result;

    /* Screen window center */
    float screen_center[2] = {0.0f, 0.0f};
    result = write_attribute(encoder, &offset, "screenWindowCenter", "v2f", screen_center, 8);
    if (EXR_FAILED(result)) return result;

    /* Screen window width */
    float screen_width = 1.0f;
    result = write_attribute(encoder, &offset, "screenWindowWidth", "float", &screen_width, 4);
    if (EXR_FAILED(result)) return result;

    /* Tiles attribute (for tiled images only) */
    if (write_image->flags & EXR_WRITE_TILED) {
        /* tiledesc: xSize(4) + ySize(4) + mode(1) = 9 bytes */
        uint8_t tiledesc[9];
        uint32_t tile_x = (uint32_t)write_image->tile_size_x;
        uint32_t tile_y = (uint32_t)write_image->tile_size_y;
        uint8_t mode = 0;  /* ONE_LEVEL, ROUND_DOWN */
        if (write_image->flags & EXR_WRITE_MIPMAP) {
            mode = 1;  /* MIPMAP_LEVELS */
        } else if (write_image->flags & EXR_WRITE_RIPMAP) {
            mode = 2;  /* RIPMAP_LEVELS */
        }
        memcpy(tiledesc, &tile_x, 4);
        memcpy(tiledesc + 4, &tile_y, 4);
        tiledesc[8] = mode;
        result = write_attribute(encoder, &offset, "tiles", "tiledesc", tiledesc, 9);
        if (EXR_FAILED(result)) return result;
    }

    /* Write custom attributes */
    for (uint32_t a = 0; a < write_image->num_custom_attrs; a++) {
        WriteCustomAttribute* attr = &write_image->custom_attrs[a];
        result = write_attribute(encoder, &offset, attr->name, attr->type,
                                  attr->data, attr->size);
        if (EXR_FAILED(result)) return result;
    }

    /* Header end marker */
    uint8_t header_end = 0;
    result = encoder_write(encoder, offset, &header_end, 1);
    if (EXR_FAILED(result)) return result;
    offset += 1;

    /* ===== Handle tiled vs scanline images ===== */
    int num_blocks;
    uint64_t offset_table_pos;
    uint64_t* tile_offsets = NULL;
    int num_x_tiles = 0, num_y_tiles = 0;

    if (write_image->flags & EXR_WRITE_TILED) {
        /* Calculate number of tiles */
        num_x_tiles = (write_image->width + write_image->tile_size_x - 1) / write_image->tile_size_x;
        num_y_tiles = (write_image->height + write_image->tile_size_y - 1) / write_image->tile_size_y;
        num_blocks = num_x_tiles * num_y_tiles;

        /* Reserve space for tile offset table */
        offset_table_pos = offset;
        tile_offsets = (uint64_t*)ctx->allocator.alloc(
            ctx->allocator.userdata, num_blocks * sizeof(uint64_t), EXR_DEFAULT_ALIGNMENT);
        if (!tile_offsets) return EXR_ERROR_OUT_OF_MEMORY;

        /* Write placeholder offset table */
        for (int t = 0; t < num_blocks; t++) {
            uint64_t placeholder = 0;
            result = encoder_write(encoder, offset, &placeholder, 8);
            if (EXR_FAILED(result)) {
                ctx->allocator.free(ctx->allocator.userdata, tile_offsets, num_blocks * sizeof(uint64_t));
                return result;
            }
            offset += 8;
        }
    } else {
        /* Scanline or deep: calculate block count */
        int lines_per_block;
        if (is_deep) {
            lines_per_block = 1;  /* Deep images always have 1 scanline per block */
        } else {
            lines_per_block = get_write_lines_per_block(write_image->compression);
        }
        num_blocks = (write_image->height + lines_per_block - 1) / lines_per_block;
        write_image->num_scanline_blocks = (uint32_t)num_blocks;

        /* Reserve space for offset table */
        offset_table_pos = offset;
        write_image->scanline_offsets = (uint64_t*)ctx->allocator.alloc(
            ctx->allocator.userdata, num_blocks * sizeof(uint64_t), EXR_DEFAULT_ALIGNMENT);
        if (!write_image->scanline_offsets) return EXR_ERROR_OUT_OF_MEMORY;

        /* Write placeholder offset table */
        for (int b = 0; b < num_blocks; b++) {
            uint64_t placeholder = 0;
            result = encoder_write(encoder, offset, &placeholder, 8);
            if (EXR_FAILED(result)) return result;
            offset += 8;
        }
    }

    /* Calculate bytes per pixel for each channel */
    size_t bytes_per_channel_pixel[64];
    size_t total_bytes_per_pixel = 0;
    for (uint32_t c = 0; c < write_image->num_channels; c++) {
        switch (write_image->channels[c].pixel_type) {
            case EXR_PIXEL_HALF: bytes_per_channel_pixel[c] = 2; break;
            case EXR_PIXEL_FLOAT: bytes_per_channel_pixel[c] = 4; break;
            case EXR_PIXEL_UINT: bytes_per_channel_pixel[c] = 4; break;
            default: bytes_per_channel_pixel[c] = 4; break;
        }
        total_bytes_per_pixel += bytes_per_channel_pixel[c];
    }

    if ((write_image->flags & EXR_WRITE_TILED) && !is_deep) {
        /* ===== Write regular tiles ===== */
        for (int ty = 0; ty < num_y_tiles; ty++) {
            for (int tx = 0; tx < num_x_tiles; tx++) {
                int tile_idx = ty * num_x_tiles + tx;
                tile_offsets[tile_idx] = offset;

                /* Calculate tile dimensions */
                int tile_px_x = tx * write_image->tile_size_x;
                int tile_px_y = ty * write_image->tile_size_y;
                int tile_width = write_image->tile_size_x;
                int tile_height = write_image->tile_size_y;

                /* Clamp to image bounds */
                if (tile_px_x + tile_width > write_image->width) {
                    tile_width = write_image->width - tile_px_x;
                }
                if (tile_px_y + tile_height > write_image->height) {
                    tile_height = write_image->height - tile_px_y;
                }

                /* Find write command for this tile */
                const void* input_data = NULL;
                uint32_t input_layout = EXR_LAYOUT_INTERLEAVED;
                uint32_t input_pixel_type = EXR_PIXEL_FLOAT;

                for (uint32_t i = 0; i < submit_info->command_buffer_count && !input_data; i++) {
                    ExrCommandBuffer cmd = submit_info->command_buffers[i];
                    if (!exr_command_buffer_is_valid(cmd)) continue;

                    for (uint32_t j = 0; j < cmd->command_count; j++) {
                        if (cmd->commands[j].base.type == EXR_CMD_TYPE_WRITE_TILE) {
                            ExrTileWriteCmd* write_cmd = &cmd->commands[j].tile_write;
                            if (write_cmd->tile_x == tx && write_cmd->tile_y == ty &&
                                write_cmd->level_x == 0 && write_cmd->level_y == 0) {
                                input_data = write_cmd->input;
                                input_layout = write_cmd->input_layout;
                                input_pixel_type = write_cmd->input_pixel_type;
                                break;
                            }
                        }
                    }
                }

                if (!input_data) {
                    ctx->allocator.free(ctx->allocator.userdata, tile_offsets, num_blocks * sizeof(uint64_t));
                    return EXR_ERROR_INVALID_STATE;  /* Missing data for tile */
                }

                /* Convert to EXR channel-planar layout */
                size_t tile_data_size = (size_t)tile_width * tile_height * total_bytes_per_pixel;
                uint8_t* converted = (uint8_t*)ctx->allocator.alloc(ctx->allocator.userdata, tile_data_size, EXR_DEFAULT_ALIGNMENT);
                if (!converted) {
                    ctx->allocator.free(ctx->allocator.userdata, tile_offsets, num_blocks * sizeof(uint64_t));
                    return EXR_ERROR_OUT_OF_MEMORY;
                }

                convert_to_exr_layout(input_data, converted, tile_width, tile_height,
                                      write_image->num_channels, write_image->channels,
                                      input_pixel_type, input_layout);

                /* Compress */
                void* compressed = NULL;
                size_t compressed_size = 0;
                result = compress_scanline_data(ctx, converted, tile_data_size, &compressed, &compressed_size,
                                                write_image->compression);
                ctx->allocator.free(ctx->allocator.userdata, converted, tile_data_size);
                if (EXR_FAILED(result)) {
                    ctx->allocator.free(ctx->allocator.userdata, tile_offsets, num_blocks * sizeof(uint64_t));
                    return result;
                }

                /* Write tile header: tile_x(4) + tile_y(4) + level_x(4) + level_y(4) + size(4) = 20 bytes */
                int32_t tile_coords[4] = {tx, ty, 0, 0};  /* level_x = level_y = 0 for single level */
                result = encoder_write(encoder, offset, tile_coords, 16);
                if (EXR_FAILED(result)) {
                    ctx->allocator.free(ctx->allocator.userdata, compressed, compressed_size);
                    ctx->allocator.free(ctx->allocator.userdata, tile_offsets, num_blocks * sizeof(uint64_t));
                    return result;
                }
                offset += 16;

                uint32_t tile_size = (uint32_t)compressed_size;
                result = encoder_write(encoder, offset, &tile_size, 4);
                if (EXR_FAILED(result)) {
                    ctx->allocator.free(ctx->allocator.userdata, compressed, compressed_size);
                    ctx->allocator.free(ctx->allocator.userdata, tile_offsets, num_blocks * sizeof(uint64_t));
                    return result;
                }
                offset += 4;

                /* Write compressed data */
                result = encoder_write(encoder, offset, compressed, compressed_size);
                ctx->allocator.free(ctx->allocator.userdata, compressed, compressed_size);
                if (EXR_FAILED(result)) {
                    ctx->allocator.free(ctx->allocator.userdata, tile_offsets, num_blocks * sizeof(uint64_t));
                    return result;
                }
                offset += compressed_size;
            }
        }

        /* Update tile offset table */
        for (int t = 0; t < num_blocks; t++) {
            result = encoder_write(encoder, offset_table_pos + t * 8, &tile_offsets[t], 8);
            if (EXR_FAILED(result)) {
                ctx->allocator.free(ctx->allocator.userdata, tile_offsets, num_blocks * sizeof(uint64_t));
                return result;
            }
        }
        ctx->allocator.free(ctx->allocator.userdata, tile_offsets, num_blocks * sizeof(uint64_t));

    } else if ((write_image->flags & EXR_WRITE_TILED) && is_deep) {
        /* ===== Write deep tiles ===== */
        for (int ty = 0; ty < num_y_tiles; ty++) {
            for (int tx = 0; tx < num_x_tiles; tx++) {
                int tile_idx = ty * num_x_tiles + tx;
                tile_offsets[tile_idx] = offset;

                /* Calculate tile dimensions */
                int tile_px_x = tx * write_image->tile_size_x;
                int tile_px_y = ty * write_image->tile_size_y;
                int tile_width = write_image->tile_size_x;
                int tile_height = write_image->tile_size_y;

                /* Clamp to image bounds */
                if (tile_px_x + tile_width > write_image->width) {
                    tile_width = write_image->width - tile_px_x;
                }
                if (tile_px_y + tile_height > write_image->height) {
                    tile_height = write_image->height - tile_px_y;
                }

                /* Find deep tile write command for this tile */
                const ExrDeepTileWriteCmd* deep_cmd = NULL;
                for (uint32_t i = 0; i < submit_info->command_buffer_count && !deep_cmd; i++) {
                    ExrCommandBuffer cmd = submit_info->command_buffers[i];
                    if (!exr_command_buffer_is_valid(cmd)) continue;

                    for (uint32_t j = 0; j < cmd->command_count; j++) {
                        if (cmd->commands[j].base.type == EXR_CMD_TYPE_WRITE_DEEP_TILES) {
                            ExrDeepTileWriteCmd* dc = &cmd->commands[j].deep_tile_write;
                            if (dc->tile_x == tx && dc->tile_y == ty &&
                                dc->level_x == 0 && dc->level_y == 0) {
                                deep_cmd = dc;
                                break;
                            }
                        }
                    }
                }

                if (!deep_cmd) {
                    ctx->allocator.free(ctx->allocator.userdata, tile_offsets, num_blocks * sizeof(uint64_t));
                    return EXR_ERROR_INVALID_STATE;  /* Missing deep data for tile */
                }

                /* Calculate total samples for this tile */
                int num_tile_pixels = tile_width * tile_height;
                uint64_t tile_samples = 0;
                for (int p = 0; p < num_tile_pixels; p++) {
                    tile_samples += deep_cmd->sample_counts[p];
                }

                /* Build cumulative offset table (int32 per pixel) */
                size_t offset_table_size = (size_t)num_tile_pixels * sizeof(int32_t);
                int32_t* pixel_offsets = (int32_t*)ctx->allocator.alloc(
                    ctx->allocator.userdata, offset_table_size, EXR_DEFAULT_ALIGNMENT);
                if (!pixel_offsets) {
                    ctx->allocator.free(ctx->allocator.userdata, tile_offsets, num_blocks * sizeof(uint64_t));
                    return EXR_ERROR_OUT_OF_MEMORY;
                }

                int32_t cumulative = 0;
                for (int p = 0; p < num_tile_pixels; p++) {
                    cumulative += (int32_t)deep_cmd->sample_counts[p];
                    pixel_offsets[p] = cumulative;
                }

                /* Calculate sample data size */
                size_t sample_data_size = (size_t)tile_samples * total_bytes_per_pixel;

                /* Compress offset table with predictor + reorder + ZIP */
                uint8_t* offset_temp = (uint8_t*)ctx->allocator.alloc(
                    ctx->allocator.userdata, offset_table_size, EXR_DEFAULT_ALIGNMENT);
                if (!offset_temp) {
                    ctx->allocator.free(ctx->allocator.userdata, pixel_offsets, offset_table_size);
                    ctx->allocator.free(ctx->allocator.userdata, tile_offsets, num_blocks * sizeof(uint64_t));
                    return EXR_ERROR_OUT_OF_MEMORY;
                }

                /* Reorder bytes (interleave first and second halves) */
                const uint8_t* src_bytes = (const uint8_t*)pixel_offsets;
                size_t half = (offset_table_size + 1) / 2;
                for (size_t i = 0; i < offset_table_size; i++) {
                    if (i & 1) {
                        offset_temp[i] = src_bytes[half + i/2];
                    } else {
                        offset_temp[i] = src_bytes[i/2];
                    }
                }

                /* Apply predictor: t[i] = t[i] - t[i-1] + 128 */
                for (size_t i = offset_table_size - 1; i > 0; i--) {
                    offset_temp[i] = (uint8_t)((int)offset_temp[i] - (int)offset_temp[i-1] + 128);
                }

                /* Compress with ZIP */
                size_t offset_compressed_size = 0;
                uint8_t* offset_compressed = NULL;
#if defined(TINYEXR_V3_USE_MINIZ)
                mz_ulong comp_bound = mz_compressBound((mz_ulong)offset_table_size);
                offset_compressed = (uint8_t*)ctx->allocator.alloc(
                    ctx->allocator.userdata, (size_t)comp_bound, EXR_DEFAULT_ALIGNMENT);
                if (!offset_compressed) {
                    ctx->allocator.free(ctx->allocator.userdata, offset_temp, offset_table_size);
                    ctx->allocator.free(ctx->allocator.userdata, pixel_offsets, offset_table_size);
                    ctx->allocator.free(ctx->allocator.userdata, tile_offsets, num_blocks * sizeof(uint64_t));
                    return EXR_ERROR_OUT_OF_MEMORY;
                }

                mz_ulong offset_comp_len = comp_bound;
                int zret = mz_compress((unsigned char*)offset_compressed, &offset_comp_len,
                                       (const unsigned char*)offset_temp, (mz_ulong)offset_table_size);
                ctx->allocator.free(ctx->allocator.userdata, offset_temp, offset_table_size);
                ctx->allocator.free(ctx->allocator.userdata, pixel_offsets, offset_table_size);

                if (zret != MZ_OK) {
                    ctx->allocator.free(ctx->allocator.userdata, offset_compressed, (size_t)comp_bound);
                    ctx->allocator.free(ctx->allocator.userdata, tile_offsets, num_blocks * sizeof(uint64_t));
                    return EXR_ERROR_COMPRESSION_FAILED;
                }
                offset_compressed_size = (size_t)offset_comp_len;
#else
                /* If no miniz, write uncompressed */
                offset_compressed = offset_temp;
                offset_compressed_size = offset_table_size;
                ctx->allocator.free(ctx->allocator.userdata, pixel_offsets, offset_table_size);
#endif

                /* Convert sample data to EXR layout and compress */
                uint8_t* sample_compressed = NULL;
                size_t sample_compressed_size = 0;

                if (tile_samples > 0) {
                    uint8_t* sample_data = (uint8_t*)ctx->allocator.alloc(
                        ctx->allocator.userdata, sample_data_size, EXR_DEFAULT_ALIGNMENT);
                    if (!sample_data) {
                        ctx->allocator.free(ctx->allocator.userdata, offset_compressed, offset_compressed_size);
                        ctx->allocator.free(ctx->allocator.userdata, tile_offsets, num_blocks * sizeof(uint64_t));
                        return EXR_ERROR_OUT_OF_MEMORY;
                    }

                    /* Convert interleaved input to EXR channel-planar format */
                    const uint8_t* input = (const uint8_t*)deep_cmd->input;
                    size_t bytes_per_input_sample = 0;
                    for (uint32_t c = 0; c < write_image->num_channels; c++) {
                        bytes_per_input_sample += bytes_per_channel_pixel[c];
                    }

                    /* Deep data is stored channel-planar: all samples for ch0, then ch1, etc. */
                    size_t dst_offset = 0;
                    for (uint32_t c = 0; c < write_image->num_channels; c++) {
                        size_t src_channel_offset = 0;
                        for (uint32_t cc = 0; cc < c; cc++) {
                            src_channel_offset += bytes_per_channel_pixel[cc];
                        }
                        for (uint64_t s = 0; s < tile_samples; s++) {
                            memcpy(sample_data + dst_offset,
                                   input + s * bytes_per_input_sample + src_channel_offset,
                                   bytes_per_channel_pixel[c]);
                            dst_offset += bytes_per_channel_pixel[c];
                        }
                    }

                    /* Reorder and apply predictor */
                    uint8_t* sample_temp = (uint8_t*)ctx->allocator.alloc(
                        ctx->allocator.userdata, sample_data_size, EXR_DEFAULT_ALIGNMENT);
                    if (!sample_temp) {
                        ctx->allocator.free(ctx->allocator.userdata, sample_data, sample_data_size);
                        ctx->allocator.free(ctx->allocator.userdata, offset_compressed, offset_compressed_size);
                        ctx->allocator.free(ctx->allocator.userdata, tile_offsets, num_blocks * sizeof(uint64_t));
                        return EXR_ERROR_OUT_OF_MEMORY;
                    }

                    size_t sample_half = (sample_data_size + 1) / 2;
                    for (size_t i = 0; i < sample_data_size; i++) {
                        if (i & 1) {
                            sample_temp[i] = sample_data[sample_half + i/2];
                        } else {
                            sample_temp[i] = sample_data[i/2];
                        }
                    }
                    for (size_t i = sample_data_size - 1; i > 0; i--) {
                        sample_temp[i] = (uint8_t)((int)sample_temp[i] - (int)sample_temp[i-1] + 128);
                    }
                    ctx->allocator.free(ctx->allocator.userdata, sample_data, sample_data_size);

#if defined(TINYEXR_V3_USE_MINIZ)
                    mz_ulong sample_comp_bound = mz_compressBound((mz_ulong)sample_data_size);
                    sample_compressed = (uint8_t*)ctx->allocator.alloc(
                        ctx->allocator.userdata, (size_t)sample_comp_bound, EXR_DEFAULT_ALIGNMENT);
                    if (!sample_compressed) {
                        ctx->allocator.free(ctx->allocator.userdata, sample_temp, sample_data_size);
                        ctx->allocator.free(ctx->allocator.userdata, offset_compressed, offset_compressed_size);
                        ctx->allocator.free(ctx->allocator.userdata, tile_offsets, num_blocks * sizeof(uint64_t));
                        return EXR_ERROR_OUT_OF_MEMORY;
                    }

                    mz_ulong sample_comp_len = sample_comp_bound;
                    zret = mz_compress((unsigned char*)sample_compressed, &sample_comp_len,
                                       (const unsigned char*)sample_temp, (mz_ulong)sample_data_size);
                    ctx->allocator.free(ctx->allocator.userdata, sample_temp, sample_data_size);

                    if (zret != MZ_OK) {
                        ctx->allocator.free(ctx->allocator.userdata, sample_compressed, (size_t)sample_comp_bound);
                        ctx->allocator.free(ctx->allocator.userdata, offset_compressed, offset_compressed_size);
                        ctx->allocator.free(ctx->allocator.userdata, tile_offsets, num_blocks * sizeof(uint64_t));
                        return EXR_ERROR_COMPRESSION_FAILED;
                    }
                    sample_compressed_size = (size_t)sample_comp_len;
#else
                    sample_compressed = sample_temp;
                    sample_compressed_size = sample_data_size;
#endif
                }

                /* Write deep tile header:
                 * - tile_x (4 bytes)
                 * - tile_y (4 bytes)
                 * - level_x (4 bytes)
                 * - level_y (4 bytes)
                 * - packed_offset_table_size (8 bytes)
                 * - packed_sample_data_size (8 bytes)
                 * - unpacked_sample_data_size (8 bytes)
                 * Total: 40 bytes
                 */
                int32_t tile_coords[4] = {tx, ty, 0, 0};
                result = encoder_write(encoder, offset, tile_coords, 16);
                if (EXR_FAILED(result)) {
                    if (sample_compressed) ctx->allocator.free(ctx->allocator.userdata, sample_compressed, sample_compressed_size);
                    ctx->allocator.free(ctx->allocator.userdata, offset_compressed, offset_compressed_size);
                    ctx->allocator.free(ctx->allocator.userdata, tile_offsets, num_blocks * sizeof(uint64_t));
                    return result;
                }
                offset += 16;

                int64_t packed_offset_size = (int64_t)offset_compressed_size;
                int64_t packed_sample_size = (int64_t)sample_compressed_size;
                int64_t unpacked_sample_size = (int64_t)sample_data_size;

                result = encoder_write(encoder, offset, &packed_offset_size, 8);
                if (EXR_FAILED(result)) {
                    if (sample_compressed) ctx->allocator.free(ctx->allocator.userdata, sample_compressed, sample_compressed_size);
                    ctx->allocator.free(ctx->allocator.userdata, offset_compressed, offset_compressed_size);
                    ctx->allocator.free(ctx->allocator.userdata, tile_offsets, num_blocks * sizeof(uint64_t));
                    return result;
                }
                offset += 8;

                result = encoder_write(encoder, offset, &packed_sample_size, 8);
                if (EXR_FAILED(result)) {
                    if (sample_compressed) ctx->allocator.free(ctx->allocator.userdata, sample_compressed, sample_compressed_size);
                    ctx->allocator.free(ctx->allocator.userdata, offset_compressed, offset_compressed_size);
                    ctx->allocator.free(ctx->allocator.userdata, tile_offsets, num_blocks * sizeof(uint64_t));
                    return result;
                }
                offset += 8;

                result = encoder_write(encoder, offset, &unpacked_sample_size, 8);
                if (EXR_FAILED(result)) {
                    if (sample_compressed) ctx->allocator.free(ctx->allocator.userdata, sample_compressed, sample_compressed_size);
                    ctx->allocator.free(ctx->allocator.userdata, offset_compressed, offset_compressed_size);
                    ctx->allocator.free(ctx->allocator.userdata, tile_offsets, num_blocks * sizeof(uint64_t));
                    return result;
                }
                offset += 8;

                /* Write compressed offset table */
                result = encoder_write(encoder, offset, offset_compressed, offset_compressed_size);
                ctx->allocator.free(ctx->allocator.userdata, offset_compressed, offset_compressed_size);
                if (EXR_FAILED(result)) {
                    if (sample_compressed) ctx->allocator.free(ctx->allocator.userdata, sample_compressed, sample_compressed_size);
                    ctx->allocator.free(ctx->allocator.userdata, tile_offsets, num_blocks * sizeof(uint64_t));
                    return result;
                }
                offset += offset_compressed_size;

                /* Write compressed sample data */
                if (sample_compressed && sample_compressed_size > 0) {
                    result = encoder_write(encoder, offset, sample_compressed, sample_compressed_size);
                    ctx->allocator.free(ctx->allocator.userdata, sample_compressed, sample_compressed_size);
                    if (EXR_FAILED(result)) {
                        ctx->allocator.free(ctx->allocator.userdata, tile_offsets, num_blocks * sizeof(uint64_t));
                        return result;
                    }
                    offset += sample_compressed_size;
                }
            }
        }

        /* Update tile offset table */
        for (int t = 0; t < num_blocks; t++) {
            result = encoder_write(encoder, offset_table_pos + t * 8, &tile_offsets[t], 8);
            if (EXR_FAILED(result)) {
                ctx->allocator.free(ctx->allocator.userdata, tile_offsets, num_blocks * sizeof(uint64_t));
                return result;
            }
        }
        ctx->allocator.free(ctx->allocator.userdata, tile_offsets, num_blocks * sizeof(uint64_t));

    } else if (is_deep) {
        /* ===== Write deep scanline blocks ===== */
        /* Deep images always have one scanline per block */

        for (int block = 0; block < num_blocks; block++) {
            write_image->scanline_offsets[block] = offset;

            int y_coord = write_image->data_window.min_y + block;

            /* Find deep write command for this scanline */
            const ExrDeepScanlineWriteCmd* deep_cmd = NULL;
            for (uint32_t i = 0; i < submit_info->command_buffer_count && !deep_cmd; i++) {
                ExrCommandBuffer cmd = submit_info->command_buffers[i];
                if (!exr_command_buffer_is_valid(cmd)) continue;

                for (uint32_t j = 0; j < cmd->command_count; j++) {
                    if (cmd->commands[j].base.type == EXR_CMD_TYPE_WRITE_DEEP_SCANLINES) {
                        ExrDeepScanlineWriteCmd* dc = &cmd->commands[j].deep_scanline_write;
                        if (dc->y_start <= y_coord && dc->y_start + dc->num_lines > y_coord) {
                            deep_cmd = dc;
                            break;
                        }
                    }
                }
            }

            if (!deep_cmd) {
                return EXR_ERROR_INVALID_STATE;  /* Missing deep data for block */
            }

            /* Calculate sample counts for this scanline */
            int line_in_cmd = y_coord - deep_cmd->y_start;
            const uint32_t* scanline_counts = deep_cmd->sample_counts + line_in_cmd * deep_cmd->width;
            uint64_t scanline_samples = 0;
            for (int x = 0; x < deep_cmd->width; x++) {
                scanline_samples += scanline_counts[x];
            }

            /* Build cumulative offset table (int32 per pixel) */
            size_t offset_table_size = (size_t)deep_cmd->width * sizeof(int32_t);
            int32_t* pixel_offsets = (int32_t*)ctx->allocator.alloc(
                ctx->allocator.userdata, offset_table_size, EXR_DEFAULT_ALIGNMENT);
            if (!pixel_offsets) return EXR_ERROR_OUT_OF_MEMORY;

            int32_t cumulative = 0;
            for (int x = 0; x < deep_cmd->width; x++) {
                cumulative += (int32_t)scanline_counts[x];
                pixel_offsets[x] = cumulative;
            }

            /* Calculate sample data size */
            size_t sample_data_size = (size_t)scanline_samples * total_bytes_per_pixel;

            /* Compress offset table with predictor + reorder + ZIP */
            uint8_t* offset_temp = (uint8_t*)ctx->allocator.alloc(
                ctx->allocator.userdata, offset_table_size, EXR_DEFAULT_ALIGNMENT);
            if (!offset_temp) {
                ctx->allocator.free(ctx->allocator.userdata, pixel_offsets, offset_table_size);
                return EXR_ERROR_OUT_OF_MEMORY;
            }

            /* Reorder bytes (interleave first and second halves) */
            const uint8_t* src_bytes = (const uint8_t*)pixel_offsets;
            size_t half = (offset_table_size + 1) / 2;
            for (size_t i = 0; i < offset_table_size; i++) {
                if (i & 1) {
                    offset_temp[i] = src_bytes[half + i/2];
                } else {
                    offset_temp[i] = src_bytes[i/2];
                }
            }

            /* Apply predictor: t[i] = t[i] - t[i-1] + 128 */
            for (size_t i = offset_table_size - 1; i > 0; i--) {
                offset_temp[i] = (uint8_t)((int)offset_temp[i] - (int)offset_temp[i-1] + 128);
            }

            /* Compress with ZIP */
#if defined(TINYEXR_V3_USE_MINIZ)
            mz_ulong comp_bound = mz_compressBound((mz_ulong)offset_table_size);
            uint8_t* offset_compressed = (uint8_t*)ctx->allocator.alloc(
                ctx->allocator.userdata, (size_t)comp_bound, EXR_DEFAULT_ALIGNMENT);
            if (!offset_compressed) {
                ctx->allocator.free(ctx->allocator.userdata, offset_temp, offset_table_size);
                ctx->allocator.free(ctx->allocator.userdata, pixel_offsets, offset_table_size);
                return EXR_ERROR_OUT_OF_MEMORY;
            }

            mz_ulong offset_compressed_size = comp_bound;
            int zret = mz_compress((unsigned char*)offset_compressed, &offset_compressed_size,
                                   (const unsigned char*)offset_temp, (mz_ulong)offset_table_size);
            ctx->allocator.free(ctx->allocator.userdata, offset_temp, offset_table_size);
            ctx->allocator.free(ctx->allocator.userdata, pixel_offsets, offset_table_size);

            if (zret != MZ_OK) {
                ctx->allocator.free(ctx->allocator.userdata, offset_compressed, (size_t)comp_bound);
                return EXR_ERROR_COMPRESSION_FAILED;
            }
#else
            /* If no miniz, write uncompressed */
            uint8_t* offset_compressed = offset_temp;
            size_t offset_compressed_size = offset_table_size;
            size_t comp_bound = offset_table_size;
            ctx->allocator.free(ctx->allocator.userdata, pixel_offsets, offset_table_size);
#endif

            /* Convert sample data to EXR layout and compress */
            uint8_t* sample_data = NULL;
            size_t sample_compressed_size = 0;

            if (scanline_samples > 0) {
                sample_data = (uint8_t*)ctx->allocator.alloc(
                    ctx->allocator.userdata, sample_data_size, EXR_DEFAULT_ALIGNMENT);
                if (!sample_data) {
                    ctx->allocator.free(ctx->allocator.userdata, offset_compressed, (size_t)comp_bound);
                    return EXR_ERROR_OUT_OF_MEMORY;
                }

                /* Copy sample data (assumes it's already in channel-planar format) */
                /* TODO: Add format conversion if needed */
                size_t sample_offset = 0;
                for (int prev_line = 0; prev_line < line_in_cmd; prev_line++) {
                    for (int x = 0; x < deep_cmd->width; x++) {
                        sample_offset += deep_cmd->sample_counts[prev_line * deep_cmd->width + x];
                    }
                }
                sample_offset *= total_bytes_per_pixel;
                memcpy(sample_data, (const uint8_t*)deep_cmd->input + sample_offset, sample_data_size);

                /* Compress sample data with ZIP (with predictor + reorder) */
                void* sample_compressed = NULL;
                result = compress_scanline_data(ctx, sample_data, sample_data_size,
                                               &sample_compressed, &sample_compressed_size,
                                               write_image->compression);
                ctx->allocator.free(ctx->allocator.userdata, sample_data, sample_data_size);
                if (EXR_FAILED(result)) {
                    ctx->allocator.free(ctx->allocator.userdata, offset_compressed, (size_t)comp_bound);
                    return result;
                }
                sample_data = (uint8_t*)sample_compressed;
            }

            /* Write deep chunk header */
            /* Declare variables upfront to avoid goto crossing initialization */
            uint64_t packed_offset_size = (uint64_t)offset_compressed_size;
            uint64_t packed_sample_size = (uint64_t)sample_compressed_size;
            uint64_t unpacked_sample_size = (uint64_t)sample_data_size;

            /* y coordinate (4 bytes) */
            result = encoder_write(encoder, offset, &y_coord, 4);
            if (EXR_FAILED(result)) goto deep_cleanup;
            offset += 4;

            /* packed offset table size (8 bytes) */
            result = encoder_write(encoder, offset, &packed_offset_size, 8);
            if (EXR_FAILED(result)) goto deep_cleanup;
            offset += 8;

            /* packed sample data size (8 bytes) */
            result = encoder_write(encoder, offset, &packed_sample_size, 8);
            if (EXR_FAILED(result)) goto deep_cleanup;
            offset += 8;

            /* unpacked sample data size (8 bytes) */
            result = encoder_write(encoder, offset, &unpacked_sample_size, 8);
            if (EXR_FAILED(result)) goto deep_cleanup;
            offset += 8;

            /* compressed offset table */
            result = encoder_write(encoder, offset, offset_compressed, offset_compressed_size);
            if (EXR_FAILED(result)) goto deep_cleanup;
            offset += offset_compressed_size;

            /* compressed sample data */
            if (sample_compressed_size > 0) {
                result = encoder_write(encoder, offset, sample_data, sample_compressed_size);
                if (EXR_FAILED(result)) goto deep_cleanup;
                offset += sample_compressed_size;
            }

            ctx->allocator.free(ctx->allocator.userdata, offset_compressed, (size_t)comp_bound);
            if (sample_data) {
                ctx->allocator.free(ctx->allocator.userdata, sample_data, sample_compressed_size);
            }
            continue;

        deep_cleanup:
            ctx->allocator.free(ctx->allocator.userdata, offset_compressed, (size_t)comp_bound);
            if (sample_data) {
                ctx->allocator.free(ctx->allocator.userdata, sample_data, sample_compressed_size);
            }
            return result;
        }

        /* Update scanline offset table */
        for (int b = 0; b < num_blocks; b++) {
            result = encoder_write(encoder, offset_table_pos + b * 8,
                                    &write_image->scanline_offsets[b], 8);
            if (EXR_FAILED(result)) return result;
        }

    } else {
        /* ===== Write scanline blocks ===== */
        int lines_per_block = get_write_lines_per_block(write_image->compression);

        for (int block = 0; block < num_blocks; block++) {
            write_image->scanline_offsets[block] = offset;

            int y_start = write_image->data_window.min_y + block * lines_per_block;
            int y_end = y_start + lines_per_block;
            if (y_end > write_image->data_window.max_y + 1) {
                y_end = write_image->data_window.max_y + 1;
            }
            int block_lines = y_end - y_start;

            /* Find write command covering this block */
            const void* input_data = NULL;
            uint32_t input_layout = EXR_LAYOUT_INTERLEAVED;
            uint32_t input_pixel_type = EXR_PIXEL_FLOAT;

            for (uint32_t i = 0; i < submit_info->command_buffer_count && !input_data; i++) {
                ExrCommandBuffer cmd = submit_info->command_buffers[i];
                if (!exr_command_buffer_is_valid(cmd)) continue;

                for (uint32_t j = 0; j < cmd->command_count; j++) {
                    if (cmd->commands[j].base.type == EXR_CMD_TYPE_WRITE_SCANLINES) {
                        ExrScanlineWriteCmd* write_cmd = &cmd->commands[j].scanline_write;
                        if (write_cmd->y_start <= y_start &&
                            write_cmd->y_start + write_cmd->num_lines >= y_end) {
                            /* Calculate offset into input data */
                            size_t bytes_per_input_pixel = (write_cmd->input_pixel_type == EXR_PIXEL_HALF) ? 2 : 4;
                            size_t input_line_offset = (size_t)(y_start - write_cmd->y_start) *
                                write_image->width * write_image->num_channels * bytes_per_input_pixel;
                            input_data = (const uint8_t*)write_cmd->input + input_line_offset;
                            input_layout = write_cmd->input_layout;
                            input_pixel_type = write_cmd->input_pixel_type;
                            break;
                        }
                    }
                }
            }

            if (!input_data) {
                return EXR_ERROR_INVALID_STATE;  /* Missing data for block */
            }

            /* Convert to EXR channel-planar layout */
            size_t block_size = (size_t)write_image->width * block_lines * total_bytes_per_pixel;
            uint8_t* converted = (uint8_t*)ctx->allocator.alloc(ctx->allocator.userdata, block_size, EXR_DEFAULT_ALIGNMENT);
            if (!converted) return EXR_ERROR_OUT_OF_MEMORY;

            convert_to_exr_layout(input_data, converted, write_image->width, block_lines,
                                  write_image->num_channels, write_image->channels,
                                  input_pixel_type, input_layout);

            /* Compress */
            void* compressed = NULL;
            size_t compressed_size = 0;
            result = compress_scanline_data(ctx, converted, block_size, &compressed, &compressed_size,
                                            write_image->compression);
            ctx->allocator.free(ctx->allocator.userdata, converted, block_size);
            if (EXR_FAILED(result)) return result;

            /* Write block header: y coordinate (4 bytes) + compressed size (4 bytes) */
            int32_t y_coord = y_start;
            result = encoder_write(encoder, offset, &y_coord, 4);
            if (EXR_FAILED(result)) {
                ctx->allocator.free(ctx->allocator.userdata, compressed, compressed_size);
                return result;
            }
            offset += 4;

            uint32_t block_data_size = (uint32_t)compressed_size;
            result = encoder_write(encoder, offset, &block_data_size, 4);
            if (EXR_FAILED(result)) {
                ctx->allocator.free(ctx->allocator.userdata, compressed, compressed_size);
                return result;
            }
            offset += 4;

            /* Write compressed data */
            result = encoder_write(encoder, offset, compressed, compressed_size);
            ctx->allocator.free(ctx->allocator.userdata, compressed, compressed_size);
            if (EXR_FAILED(result)) return result;
            offset += compressed_size;
        }

        /* Update scanline offset table */
        for (int b = 0; b < num_blocks; b++) {
            result = encoder_write(encoder, offset_table_pos + b * 8,
                                    &write_image->scanline_offsets[b], 8);
            if (EXR_FAILED(result)) return result;
        }
    }

    encoder->write_offset = offset;

    /* Call completion callback if provided */
    if (submit_info->on_complete) {
        submit_info->on_complete(submit_info->userdata, EXR_SUCCESS);
    }

    return EXR_SUCCESS;
}

/* ============================================================================
 * Async Suspend/Resume Implementation
 * ============================================================================ */

/* Callback for async fetch completion - called by the data source when data is ready */
static void async_fetch_complete(void* userdata, ExrResult result, size_t bytes_read) {
    ExrSuspendState state = (ExrSuspendState)userdata;
    if (!exr_suspend_is_valid(state)) return;

    state->async_result = result;
    state->async_bytes_read = bytes_read;
    state->async_complete = 1;
}

/* Async-aware fetch that returns EXR_WOULD_BLOCK for async sources */
static ExrResult async_fetch(ExrDecoder decoder, uint64_t offset, uint64_t size,
                              void* dst, ExrSuspendState* out_state) {
    ExrDataSource* src = &decoder->source;

    /* Check if this is an async data source */
    if (!(src->flags & EXR_DATA_SOURCE_ASYNC)) {
        /* Synchronous source - fetch directly */
        return src->fetch(src->userdata, offset, size, dst, NULL, NULL);
    }

    /* Async source - need to allocate suspend state if not already present */
    ExrSuspendState state = decoder->suspend_state;
    if (!state) {
        ExrContext ctx = decoder->ctx;
        state = (ExrSuspendState)ctx->allocator.alloc(
            ctx->allocator.userdata, sizeof(struct ExrSuspendState_T), EXR_DEFAULT_ALIGNMENT);
        if (!state) {
            return EXR_ERROR_OUT_OF_MEMORY;
        }
        memset(state, 0, sizeof(struct ExrSuspendState_T));
        state->magic = EXR_SUSPEND_MAGIC;
        state->decoder = decoder;
        decoder->suspend_state = state;
    }

    /* Save pending fetch info */
    state->fetch_offset = offset;
    state->fetch_size = size;
    state->fetch_dst = dst;
    state->phase = decoder->current_phase;
    state->offset = decoder->current_offset;
    state->current_part = decoder->current_part_index;
    state->current_chunk = decoder->current_chunk_index;
    state->async_complete = 0;

    /* Initiate async fetch */
    ExrResult result = src->fetch(src->userdata, offset, size, dst,
                                   async_fetch_complete, state);

    if (result == EXR_WOULD_BLOCK) {
        /* Async operation started, caller should wait and call exr_resume */
        if (out_state) *out_state = state;
        return EXR_WOULD_BLOCK;
    }

    /* Synchronous completion (even from async source) */
    return result;
}

ExrResult exr_get_suspend_state(ExrDecoder decoder, ExrSuspendState* out_state) {
    if (!exr_decoder_is_valid(decoder)) {
        return EXR_ERROR_INVALID_HANDLE;
    }
    if (!out_state) {
        return EXR_ERROR_INVALID_ARGUMENT;
    }

    ExrSuspendState state = decoder->suspend_state;
    if (!state || !exr_suspend_is_valid(state)) {
        return EXR_ERROR_NOT_READY;
    }

    /* Return the current suspend state */
    *out_state = state;
    return EXR_SUCCESS;
}

ExrResult exr_resume(ExrDecoder decoder, ExrSuspendState state) {
    if (!exr_decoder_is_valid(decoder)) {
        return EXR_ERROR_INVALID_HANDLE;
    }
    if (!exr_suspend_is_valid(state)) {
        return EXR_ERROR_INVALID_ARGUMENT;
    }
    if (state->decoder != decoder) {
        return EXR_ERROR_INVALID_ARGUMENT;
    }

    /* Check if async operation completed */
    if (!state->async_complete) {
        return EXR_WOULD_BLOCK;  /* Still waiting */
    }

    /* Check for async fetch error */
    if (EXR_FAILED(state->async_result)) {
        return state->async_result;
    }

    /* Restore decoder state and continue parsing */
    decoder->current_offset = state->offset;
    decoder->current_phase = state->phase;
    decoder->current_part_index = state->current_part;
    decoder->current_chunk_index = state->current_chunk;

    /* Don't clear suspend_state here - unified_fetch will consume the result
     * and reuse the state for subsequent fetches. The state is kept around
     * to provide async_complete flag to unified_fetch.
     */

    return EXR_SUCCESS;
}

void exr_suspend_state_destroy(ExrSuspendState state) {
    if (!exr_suspend_is_valid(state)) return;

    ExrDecoder decoder = state->decoder;
    if (decoder && decoder->suspend_state == state) {
        decoder->suspend_state = NULL;
    }

    state->magic = 0;

    /* Free the state - need context for allocator */
    if (decoder && exr_decoder_is_valid(decoder)) {
        ExrContext ctx = decoder->ctx;
        ctx->allocator.free(ctx->allocator.userdata, state,
                            sizeof(struct ExrSuspendState_T));
    }
    /* If decoder is invalid, we leak - but that's a programming error */
}

/* ============================================================================
 * Low-level Compression API
 * These are for manual chunk compression/decompression, separate from the
 * automatic decompression done by the decoder.
 * ============================================================================ */

ExrResult exr_decompress_chunk(ExrContext ctx, const ExrDecompressInfo* info) {
    if (!exr_context_is_valid(ctx)) {
        return EXR_ERROR_INVALID_HANDLE;
    }
    if (!info || !info->src || !info->dst || !info->out_size) {
        return EXR_ERROR_INVALID_ARGUMENT;
    }
    if (info->dst_capacity == 0) {
        return EXR_ERROR_BUFFER_TOO_SMALL;
    }

    ExrResult result = EXR_SUCCESS;
    size_t out_size = 0;

    switch (info->compression) {
        case EXR_COMPRESSION_NONE:
            /* No compression - just copy */
            if (info->dst_capacity < info->src_size) {
                return EXR_ERROR_BUFFER_TOO_SMALL;
            }
            memcpy(info->dst, info->src, info->src_size);
            out_size = info->src_size;
            break;

        case EXR_COMPRESSION_RLE:
            result = decompress_rle((const uint8_t*)info->src, info->src_size,
                                     (uint8_t*)info->dst, info->dst_capacity,
                                     &out_size);
            break;

        case EXR_COMPRESSION_ZIPS:
        case EXR_COMPRESSION_ZIP:
            result = decompress_zip((const uint8_t*)info->src, info->src_size,
                                     (uint8_t*)info->dst, info->dst_capacity,
                                     &out_size, ctx);
            break;

#if defined(TINYEXR_V3_HAS_PIZ)
        case EXR_COMPRESSION_PIZ:
            if (!info->channels || info->num_channels == 0) {
                return EXR_ERROR_INVALID_ARGUMENT;
            }
            /* Build temporary channel data from info */
            {
                ExrChannelData* temp_channels = (ExrChannelData*)ctx->allocator.alloc(
                    ctx->allocator.userdata,
                    info->num_channels * sizeof(ExrChannelData),
                    EXR_DEFAULT_ALIGNMENT);
                if (!temp_channels) {
                    return EXR_ERROR_OUT_OF_MEMORY;
                }
                for (uint32_t c = 0; c < info->num_channels; c++) {
                    strncpy(temp_channels[c].name, info->channels[c].name, 63);
                    temp_channels[c].name[63] = '\0';
                    temp_channels[c].pixel_type = info->channels[c].pixel_type;
                    temp_channels[c].x_sampling = info->channels[c].x_sampling;
                    temp_channels[c].y_sampling = info->channels[c].y_sampling;
                    temp_channels[c].p_linear = 0;
                }
                result = decompress_piz((const uint8_t*)info->src, info->src_size,
                                         (uint8_t*)info->dst, info->dst_capacity,
                                         &out_size,
                                         (int)info->num_channels, temp_channels,
                                         info->width, info->num_lines, ctx);
                ctx->allocator.free(ctx->allocator.userdata, temp_channels,
                                    info->num_channels * sizeof(ExrChannelData));
            }
            break;
#endif

        /* PXR24 and B44 decompression not exposed through direct chunk API */
        /* Use full decoder API for these compression formats */
        case EXR_COMPRESSION_PXR24:
        case EXR_COMPRESSION_B44:
        case EXR_COMPRESSION_B44A:

        default:
            return EXR_ERROR_UNSUPPORTED_FORMAT;
    }

    if (EXR_SUCCEEDED(result)) {
        *info->out_size = out_size;
    }
    return result;
}

ExrResult exr_compress_chunk(ExrContext ctx, const ExrCompressInfo* info) {
    if (!exr_context_is_valid(ctx)) {
        return EXR_ERROR_INVALID_HANDLE;
    }
    if (!info || !info->src || !info->dst || !info->out_size) {
        return EXR_ERROR_INVALID_ARGUMENT;
    }
    if (info->dst_capacity == 0) {
        return EXR_ERROR_BUFFER_TOO_SMALL;
    }

    size_t out_size = 0;

    switch (info->compression) {
        case EXR_COMPRESSION_NONE:
            /* No compression - just copy */
            if (info->dst_capacity < info->src_size) {
                return EXR_ERROR_BUFFER_TOO_SMALL;
            }
            memcpy(info->dst, info->src, info->src_size);
            out_size = info->src_size;
            break;

        case EXR_COMPRESSION_RLE: {
            /* RLE compression with predictor and reorder */
            size_t temp_size = info->src_size;
            uint8_t* temp = (uint8_t*)ctx->allocator.alloc(
                ctx->allocator.userdata, temp_size, EXR_DEFAULT_ALIGNMENT);
            if (!temp) {
                return EXR_ERROR_OUT_OF_MEMORY;
            }

            /* Reorder bytes: interleave odd and even positions */
            reorder_bytes_for_compression((const uint8_t*)info->src, temp, info->src_size);

            /* Apply delta predictor */
            apply_delta_predictor_encode(temp, temp_size);

            /* RLE encode */
            out_size = rle_encode(temp, temp_size, (uint8_t*)info->dst, info->dst_capacity);
            ctx->allocator.free(ctx->allocator.userdata, temp, temp_size);

            if (out_size == 0 || out_size >= info->src_size) {
                /* RLE didn't compress, use uncompressed */
                memcpy(info->dst, info->src, info->src_size);
                out_size = info->src_size;
            }
            break;
        }

        case EXR_COMPRESSION_ZIPS:
        case EXR_COMPRESSION_ZIP: {
            /* ZIP compression with predictor and reorder */
            size_t temp_size = info->src_size;
            uint8_t* temp = (uint8_t*)ctx->allocator.alloc(
                ctx->allocator.userdata, temp_size, EXR_DEFAULT_ALIGNMENT);
            if (!temp) {
                return EXR_ERROR_OUT_OF_MEMORY;
            }

            /* Reorder bytes */
            reorder_bytes_for_compression((const uint8_t*)info->src, temp, info->src_size);

            /* Apply delta predictor */
            apply_delta_predictor_encode(temp, temp_size);

            /* ZIP compress */
#if defined(TINYEXR_V3_USE_MINIZ)
            mz_ulong dst_len = (mz_ulong)info->dst_capacity;
            int level = (info->compression_level > 0) ? info->compression_level : MZ_DEFAULT_LEVEL;
            int zret = mz_compress2((unsigned char*)info->dst, &dst_len,
                                     temp, (mz_ulong)temp_size, level);
            if (zret == MZ_OK) {
                out_size = dst_len;
            } else {
                ctx->allocator.free(ctx->allocator.userdata, temp, temp_size);
                return EXR_ERROR_COMPRESSION_FAILED;
            }
#else
            ctx->allocator.free(ctx->allocator.userdata, temp, temp_size);
            return EXR_ERROR_UNSUPPORTED_FORMAT;
#endif
            ctx->allocator.free(ctx->allocator.userdata, temp, temp_size);
            break;
        }

#if defined(TINYEXR_V3_HAS_PIZ)
        case EXR_COMPRESSION_PIZ:
            /* PIZ compression - complex, not exposed directly for now */
            return EXR_ERROR_UNSUPPORTED_FORMAT;
#endif

#if defined(TINYEXR_V3_HAS_PXR24)
        case EXR_COMPRESSION_PXR24:
            /* PXR24 compression - complex, not exposed directly for now */
            return EXR_ERROR_UNSUPPORTED_FORMAT;
#endif

#if defined(TINYEXR_V3_HAS_B44)
        case EXR_COMPRESSION_B44:
        case EXR_COMPRESSION_B44A:
            /* B44 compression - complex, not exposed directly for now */
            return EXR_ERROR_UNSUPPORTED_FORMAT;
#endif

        default:
            return EXR_ERROR_UNSUPPORTED_FORMAT;
    }

    *info->out_size = out_size;
    return EXR_SUCCESS;
}
