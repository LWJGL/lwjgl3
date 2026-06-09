// SPDX-License-Identifier: BSD-3-Clause
// Copyright (c) 2025, Syoyo Fujita and many contributors.
// All rights reserved.
//
// TinyEXR SIMD C Interface
//
// Pure C header declaring SIMD-accelerated functions for V3 API.
// Implementation is in tinyexr_simd_wrapper.cc (C++ file).
//
// Supported architectures:
// - x86/x64: SSE2 (baseline), AVX2, F16C
// - ARM: NEON, SVE
// - WASM: SIMD128 (via Emscripten SSE2 translation)
//
// Usage:
//   Define TINYEXR_V3_USE_SIMD=1 and link with tinyexr_simd_wrapper.o
//

#ifndef TINYEXR_SIMD_C_H_
#define TINYEXR_SIMD_C_H_

#include <stdint.h>
#include <stddef.h>

#ifdef __cplusplus
extern "C" {
#endif

// ============================================================================
// FP16 <-> FP32 Conversion
// ============================================================================

// Convert half-precision floats to single-precision
// Uses F16C hardware when available, falls back to SSE2/NEON software
void exr_simd_half_to_float(const uint16_t* src, float* dst, size_t count);

// Convert single-precision floats to half-precision
// Uses F16C hardware when available, falls back to SSE2/NEON software
void exr_simd_float_to_half(const float* src, uint16_t* dst, size_t count);

// ============================================================================
// RGBA Channel Interleaving
// ============================================================================

// Interleave separate R, G, B, A channels into RGBARGBA... format
// Any channel pointer may be NULL (uses 0.0 for R/G/B, 1.0 for A)
void exr_simd_interleave_rgba(const float* r, const float* g,
                               const float* b, const float* a,
                               float* rgba, size_t pixel_count);

// Deinterleave RGBARGBA... into separate R, G, B, A channels
// Any output pointer may be NULL (channel is skipped)
void exr_simd_deinterleave_rgba(const float* rgba,
                                 float* r, float* g, float* b, float* a,
                                 size_t pixel_count);

// ============================================================================
// Compression Helpers
// ============================================================================

// Reorder bytes for ZIP/RLE compression (split odd/even bytes)
// dst must have at least 'count' bytes capacity
void exr_simd_reorder_bytes(const uint8_t* src, uint8_t* dst, size_t count);

// Reverse byte reordering after decompression
void exr_simd_unreorder_bytes(const uint8_t* src, uint8_t* dst, size_t count);

// Apply delta predictor encoding (backward pass)
void exr_simd_delta_encode(uint8_t* data, size_t count);

// Apply delta predictor decoding (forward pass)
void exr_simd_delta_decode(uint8_t* data, size_t count);

// ============================================================================
// Query Functions
// ============================================================================

// Get string describing active SIMD backend
// Returns e.g. "AVX2+F16C", "SSE2", "NEON", "Scalar"
const char* exr_simd_get_info(void);

// Check if SIMD is available (non-zero if enabled)
int exr_simd_available(void);

#ifdef __cplusplus
}
#endif

#endif // TINYEXR_SIMD_C_H_
