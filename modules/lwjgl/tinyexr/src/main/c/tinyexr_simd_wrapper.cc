// SPDX-License-Identifier: BSD-3-Clause
// Copyright (c) 2025, Syoyo Fujita and many contributors.
// All rights reserved.
//
// TinyEXR SIMD C Wrapper Implementation
//
// This file provides extern "C" wrappers around the C++ SIMD implementations
// in tinyexr_simd.hh, allowing the pure C API (tinyexr_c_impl.c) to use SIMD.
//
// Build:
//   g++ -O2 -msse2 -DTINYEXR_ENABLE_SIMD=1 -c tinyexr_simd_wrapper.cc
//   g++ -O2 -mavx2 -mf16c -DTINYEXR_ENABLE_SIMD=1 -c tinyexr_simd_wrapper.cc
//

#define TINYEXR_ENABLE_SIMD 1
#include "tinyexr_simd.hh"
#include "tinyexr_simd_c.h"

extern "C" {

// ============================================================================
// FP16 <-> FP32 Conversion
// ============================================================================

void exr_simd_half_to_float(const uint16_t* src, float* dst, size_t count) {
    tinyexr::simd::half_to_float_batch(src, dst, count);
}

void exr_simd_float_to_half(const float* src, uint16_t* dst, size_t count) {
    tinyexr::simd::float_to_half_batch(src, dst, count);
}

// ============================================================================
// RGBA Channel Interleaving
// ============================================================================

void exr_simd_interleave_rgba(const float* r, const float* g,
                               const float* b, const float* a,
                               float* rgba, size_t pixel_count) {
    tinyexr::simd::interleave_rgba_float(r, g, b, a, rgba, pixel_count);
}

void exr_simd_deinterleave_rgba(const float* rgba,
                                 float* r, float* g, float* b, float* a,
                                 size_t pixel_count) {
    tinyexr::simd::deinterleave_rgba_float(rgba, r, g, b, a, pixel_count);
}

// ============================================================================
// Compression Helpers
// ============================================================================

void exr_simd_reorder_bytes(const uint8_t* src, uint8_t* dst, size_t count) {
    tinyexr::simd::reorder_bytes_for_compression(src, dst, count);
}

void exr_simd_unreorder_bytes(const uint8_t* src, uint8_t* dst, size_t count) {
    tinyexr::simd::unreorder_bytes_after_decompression(src, dst, count);
}

void exr_simd_delta_encode(uint8_t* data, size_t count) {
    // reverse_delta_predictor_fast is the ENCODE operation: d[i] = d[i] - d[i-1] + 128
    tinyexr::simd::reverse_delta_predictor_fast(data, count);
}

void exr_simd_delta_decode(uint8_t* data, size_t count) {
    // apply_delta_predictor_fast is the DECODE operation: d[i] = d[i-1] + d[i] - 128
    tinyexr::simd::apply_delta_predictor_fast(data, count);
}

// ============================================================================
// Query Functions
// ============================================================================

const char* exr_simd_get_info(void) {
    return tinyexr::simd::get_simd_info();
}

int exr_simd_available(void) {
    return 1;  // SIMD is enabled when this file is compiled
}

}  // extern "C"
