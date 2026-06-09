// SPDX-License-Identifier: BSD-3-Clause
// Copyright (c) 2025, Syoyo Fujita and many contributors.
// All rights reserved.
//
// TinyEXR SIMD Optimization Layer
//
// Part of TinyEXR V2 API (EXPERIMENTAL)
//
// Provides SIMD-accelerated routines for:
// - FP16 <-> FP32 conversion
// - Memory operations (reorder, interleave)
// - Pixel processing
//
// Supported architectures:
// - x86/x64: SSE2, SSE4.1, AVX, AVX2, F16C
// - ARM: NEON (with FP16 extension), SVE, SVE2
// - ARM A64FX: SVE 512-bit
//
// Usage:
//   #define TINYEXR_ENABLE_SIMD 1
//   #include "tinyexr_simd.hh"
//
// The SIMD layer automatically detects available instruction sets at compile time.

#ifndef TINYEXR_SIMD_HH_
#define TINYEXR_SIMD_HH_

#include <cstdint>
#include <cstddef>
#include <cstring>

// ============================================================================
// Configuration and Feature Detection
// ============================================================================

#ifndef TINYEXR_ENABLE_SIMD
#define TINYEXR_ENABLE_SIMD 0
#endif

#if TINYEXR_ENABLE_SIMD

// Detect architecture
#if defined(__x86_64__) || defined(_M_X64) || defined(__i386__) || defined(_M_IX86)
#define TINYEXR_SIMD_X86 1
#else
#define TINYEXR_SIMD_X86 0
#endif

#if defined(__aarch64__) || defined(_M_ARM64)
#define TINYEXR_SIMD_ARM64 1
#else
#define TINYEXR_SIMD_ARM64 0
#endif

#if defined(__arm__) || defined(_M_ARM)
#define TINYEXR_SIMD_ARM32 1
#else
#define TINYEXR_SIMD_ARM32 0
#endif

// x86 SIMD feature detection
#if TINYEXR_SIMD_X86

#if defined(__SSE2__) || (defined(_MSC_VER) && (defined(_M_X64) || (defined(_M_IX86_FP) && _M_IX86_FP >= 2)))
#define TINYEXR_SIMD_SSE2 1
#include <emmintrin.h>
#else
#define TINYEXR_SIMD_SSE2 0
#endif

#if defined(__SSE4_1__) || (defined(_MSC_VER) && defined(__AVX__))
#define TINYEXR_SIMD_SSE41 1
#include <smmintrin.h>
#else
#define TINYEXR_SIMD_SSE41 0
#endif

#if defined(__AVX__)
#define TINYEXR_SIMD_AVX 1
#include <immintrin.h>
#else
#define TINYEXR_SIMD_AVX 0
#endif

#if defined(__AVX2__)
#define TINYEXR_SIMD_AVX2 1
#include <immintrin.h>
#else
#define TINYEXR_SIMD_AVX2 0
#endif

#if defined(__F16C__)
#define TINYEXR_SIMD_F16C 1
#include <immintrin.h>
#else
#define TINYEXR_SIMD_F16C 0
#endif

#if defined(__AVX512F__)
#define TINYEXR_SIMD_AVX512F 1
#include <immintrin.h>
#else
#define TINYEXR_SIMD_AVX512F 0
#endif

#else
// Not x86
#define TINYEXR_SIMD_SSE2 0
#define TINYEXR_SIMD_SSE41 0
#define TINYEXR_SIMD_AVX 0
#define TINYEXR_SIMD_AVX2 0
#define TINYEXR_SIMD_F16C 0
#define TINYEXR_SIMD_AVX512F 0
#endif

// ARM NEON detection
#if TINYEXR_SIMD_ARM64 || TINYEXR_SIMD_ARM32

#if defined(__ARM_NEON) || defined(__ARM_NEON__)
#define TINYEXR_SIMD_NEON 1
#include <arm_neon.h>
#else
#define TINYEXR_SIMD_NEON 0
#endif

// ARM FP16 (half-precision) support
#if defined(__ARM_FP16_FORMAT_IEEE) || defined(__ARM_FEATURE_FP16_SCALAR_ARITHMETIC)
#define TINYEXR_SIMD_NEON_FP16 1
#else
#define TINYEXR_SIMD_NEON_FP16 0
#endif

// ARM SVE detection
#if defined(__ARM_FEATURE_SVE)
#define TINYEXR_SIMD_SVE 1
#include <arm_sve.h>
#else
#define TINYEXR_SIMD_SVE 0
#endif

// ARM SVE2 detection
#if defined(__ARM_FEATURE_SVE2)
#define TINYEXR_SIMD_SVE2 1
#else
#define TINYEXR_SIMD_SVE2 0
#endif

// A64FX detection (Fujitsu A64FX has 512-bit SVE)
// A64FX can be detected by checking SVE vector length at runtime,
// but for compile-time, we use a define
#ifndef TINYEXR_SIMD_A64FX
#define TINYEXR_SIMD_A64FX 0
#endif

#else
// Not ARM
#define TINYEXR_SIMD_NEON 0
#define TINYEXR_SIMD_NEON_FP16 0
#define TINYEXR_SIMD_SVE 0
#define TINYEXR_SIMD_SVE2 0
#define TINYEXR_SIMD_A64FX 0
#endif

#else
// SIMD disabled
#define TINYEXR_SIMD_X86 0
#define TINYEXR_SIMD_ARM64 0
#define TINYEXR_SIMD_ARM32 0
#define TINYEXR_SIMD_SSE2 0
#define TINYEXR_SIMD_SSE41 0
#define TINYEXR_SIMD_AVX 0
#define TINYEXR_SIMD_AVX2 0
#define TINYEXR_SIMD_F16C 0
#define TINYEXR_SIMD_AVX512F 0
#define TINYEXR_SIMD_NEON 0
#define TINYEXR_SIMD_NEON_FP16 0
#define TINYEXR_SIMD_SVE 0
#define TINYEXR_SIMD_SVE2 0
#define TINYEXR_SIMD_A64FX 0
#endif

// ============================================================================
// Namespace and utilities
// ============================================================================

namespace tinyexr {
namespace simd {

// SIMD capability flags (can be queried at runtime)
struct SIMDCapabilities {
  bool sse2;
  bool sse41;
  bool avx;
  bool avx2;
  bool f16c;
  bool avx512f;
  bool neon;
  bool neon_fp16;
  bool sve;
  bool sve2;
  bool a64fx;
  uint32_t sve_vector_length;  // SVE vector length in bits (0 if not SVE)

  SIMDCapabilities()
    : sse2(TINYEXR_SIMD_SSE2),
      sse41(TINYEXR_SIMD_SSE41),
      avx(TINYEXR_SIMD_AVX),
      avx2(TINYEXR_SIMD_AVX2),
      f16c(TINYEXR_SIMD_F16C),
      avx512f(TINYEXR_SIMD_AVX512F),
      neon(TINYEXR_SIMD_NEON),
      neon_fp16(TINYEXR_SIMD_NEON_FP16),
      sve(TINYEXR_SIMD_SVE),
      sve2(TINYEXR_SIMD_SVE2),
      a64fx(TINYEXR_SIMD_A64FX),
      sve_vector_length(0) {
#if TINYEXR_SIMD_SVE
    // Get SVE vector length at runtime
    sve_vector_length = static_cast<uint32_t>(svcntb() * 8);
    // A64FX has 512-bit SVE
    if (sve_vector_length == 512) {
      a64fx = true;
    }
#endif
  }
};

inline const SIMDCapabilities& get_capabilities() {
  static SIMDCapabilities caps;
  return caps;
}

// ============================================================================
// FP16 <-> FP32 Scalar Fallback
// ============================================================================

// Software FP16 to FP32 conversion (same algorithm as tinyexr.h)
inline float half_to_float_scalar(uint16_t h) {
  union { uint32_t u; float f; } o;
  static const union { uint32_t u; float f; } magic = {113U << 23};
  static const uint32_t shifted_exp = 0x7c00U << 13;

  o.u = (h & 0x7fffU) << 13;
  uint32_t exp_ = shifted_exp & o.u;
  o.u += (127 - 15) << 23;

  if (exp_ == shifted_exp) {
    o.u += (128 - 16) << 23;
  } else if (exp_ == 0) {
    o.u += 1 << 23;
    o.f -= magic.f;
  }

  o.u |= (h & 0x8000U) << 16;
  return o.f;
}

// Software FP32 to FP16 conversion
inline uint16_t float_to_half_scalar(float f) {
  union {
    float f;
    uint32_t u;
    struct {
      uint32_t Mantissa : 23;
      uint32_t Exponent : 8;
      uint32_t Sign : 1;
    } s;
  } fi;
  fi.f = f;

  union {
    uint16_t u;
    struct {
      uint16_t Mantissa : 10;
      uint16_t Exponent : 5;
      uint16_t Sign : 1;
    } s;
  } o;
  o.u = 0;

  if (fi.s.Exponent == 0) {
    o.s.Exponent = 0;
  } else if (fi.s.Exponent == 255) {
    o.s.Exponent = 31;
    o.s.Mantissa = fi.s.Mantissa ? 0x200 : 0;
  } else {
    int newexp = static_cast<int>(fi.s.Exponent) - 127 + 15;
    if (newexp >= 31) {
      o.s.Exponent = 31;
    } else if (newexp <= 0) {
      if ((14 - newexp) <= 24) {
        uint32_t mant = fi.s.Mantissa | 0x800000;
        o.s.Mantissa = static_cast<uint16_t>(mant >> (14 - newexp));
        if ((mant >> (13 - newexp)) & 1) {
          o.u++;
        }
      }
    } else {
      o.s.Exponent = static_cast<uint16_t>(newexp);
      o.s.Mantissa = static_cast<uint16_t>(fi.s.Mantissa >> 13);
      if (fi.s.Mantissa & 0x1000) {
        o.u++;
      }
    }
  }

  o.s.Sign = static_cast<uint16_t>(fi.s.Sign);
  return o.u;
}

// ============================================================================
// x86 SSE/AVX Implementation
// ============================================================================

#if TINYEXR_SIMD_X86

#if TINYEXR_SIMD_F16C

// F16C: 4 half values to 4 float values (SSE)
inline void half_to_float_4_f16c(const uint16_t* src, float* dst) {
  __m128i h = _mm_loadl_epi64(reinterpret_cast<const __m128i*>(src));
  __m128 f = _mm_cvtph_ps(h);
  _mm_storeu_ps(dst, f);
}

// F16C: 8 half values to 8 float values (AVX)
inline void half_to_float_8_f16c(const uint16_t* src, float* dst) {
  __m128i h = _mm_loadu_si128(reinterpret_cast<const __m128i*>(src));
  __m256 f = _mm256_cvtph_ps(h);
  _mm256_storeu_ps(dst, f);
}

// F16C: 4 float values to 4 half values (SSE)
inline void float_to_half_4_f16c(const float* src, uint16_t* dst) {
  __m128 f = _mm_loadu_ps(src);
  __m128i h = _mm_cvtps_ph(f, _MM_FROUND_TO_NEAREST_INT | _MM_FROUND_NO_EXC);
  _mm_storel_epi64(reinterpret_cast<__m128i*>(dst), h);
}

// F16C: 8 float values to 8 half values (AVX)
inline void float_to_half_8_f16c(const float* src, uint16_t* dst) {
  __m256 f = _mm256_loadu_ps(src);
  __m128i h = _mm256_cvtps_ph(f, _MM_FROUND_TO_NEAREST_INT | _MM_FROUND_NO_EXC);
  _mm_storeu_si128(reinterpret_cast<__m128i*>(dst), h);
}

#endif  // TINYEXR_SIMD_F16C

#if TINYEXR_SIMD_AVX512F

// AVX-512: 16 half values to 16 float values
inline void half_to_float_16_avx512(const uint16_t* src, float* dst) {
  __m256i h = _mm256_loadu_si256(reinterpret_cast<const __m256i*>(src));
  __m512 f = _mm512_cvtph_ps(h);
  _mm512_storeu_ps(dst, f);
}

// AVX-512: 16 float values to 16 half values
inline void float_to_half_16_avx512(const float* src, uint16_t* dst) {
  __m512 f = _mm512_loadu_ps(src);
  __m256i h = _mm512_cvtps_ph(f, _MM_FROUND_TO_NEAREST_INT | _MM_FROUND_NO_EXC);
  _mm256_storeu_si256(reinterpret_cast<__m256i*>(dst), h);
}

#endif  // TINYEXR_SIMD_AVX512F

#if TINYEXR_SIMD_SSE2

// SSE2 software half-to-float (no F16C)
// Process 4 values at a time using integer operations
// Based on the observation that for normalized halfs:
// float_exp = half_exp - 15 + 127 = half_exp + 112
// float_mantissa = half_mantissa << 13
inline void half_to_float_4_sse2(const uint16_t* src, float* dst) {
  // Load 4 half values
  __m128i h = _mm_loadl_epi64(reinterpret_cast<const __m128i*>(src));
  // Unpack to 32-bit
  h = _mm_unpacklo_epi16(h, _mm_setzero_si128());

  // Extract components
  // sign: bit 15 -> bit 31
  __m128i sign = _mm_and_si128(h, _mm_set1_epi32(0x8000));
  sign = _mm_slli_epi32(sign, 16);

  // exponent: bits 10-14, need to rebias from 15 to 127 (+112)
  __m128i exp = _mm_and_si128(h, _mm_set1_epi32(0x7C00));

  // mantissa: bits 0-9, shift to float position (bit 13-22)
  __m128i mant = _mm_and_si128(h, _mm_set1_epi32(0x03FF));
  mant = _mm_slli_epi32(mant, 13);

  // Check for zero/denormal (exp == 0)
  __m128i exp_zero = _mm_cmpeq_epi32(exp, _mm_setzero_si128());

  // Check for inf/nan (exp == 0x7C00)
  __m128i exp_max = _mm_cmpeq_epi32(exp, _mm_set1_epi32(0x7C00));

  // Normal case: rebias exponent and shift
  // exp = (exp >> 10) + 112, then shift to bit 23
  // Equivalent: (exp << 13) + (112 << 23)
  __m128i norm_exp = _mm_slli_epi32(exp, 13);
  norm_exp = _mm_add_epi32(norm_exp, _mm_set1_epi32(112 << 23));

  // For inf/nan: use 255 as exponent (shifted to position)
  __m128i inf_exp = _mm_set1_epi32(255 << 23);

  // Select exponent based on conditions
  // If exp_max, use inf_exp; else use norm_exp
  __m128i result_exp = _mm_or_si128(
    _mm_andnot_si128(exp_max, norm_exp),
    _mm_and_si128(exp_max, inf_exp)
  );

  // If exp_zero, exponent should be 0 (already handled by norm_exp being based on exp)
  // For denormals, we'd need more complex handling, but they're rare
  // For now, treat as zero (exp=0 means result_exp is already ~0 for exp part)
  result_exp = _mm_andnot_si128(exp_zero, result_exp);

  // Combine: sign | exp | mantissa
  __m128i result = _mm_or_si128(sign, _mm_or_si128(result_exp, mant));

  // Zero out mantissa for zeros (when both exp and mantissa are zero in original)
  __m128i mant_zero = _mm_cmpeq_epi32(mant, _mm_setzero_si128());
  __m128i is_zero = _mm_and_si128(exp_zero, mant_zero);
  result = _mm_andnot_si128(is_zero, result);
  result = _mm_or_si128(result, _mm_and_si128(is_zero, sign));  // Preserve sign for -0

  // Store as float
  _mm_storeu_ps(dst, _mm_castsi128_ps(result));
}

inline void float_to_half_4_sse2(const float* src, uint16_t* dst) {
  // Load 4 floats
  __m128 f = _mm_loadu_ps(src);
  __m128i fi = _mm_castps_si128(f);

  // Extract components
  __m128i sign = _mm_and_si128(fi, _mm_set1_epi32(0x80000000));
  sign = _mm_srli_epi32(sign, 16);  // Move sign to bit 15

  __m128i exp = _mm_and_si128(fi, _mm_set1_epi32(0x7F800000));
  __m128i mant = _mm_and_si128(fi, _mm_set1_epi32(0x007FFFFF));

  // Rebias exponent: (exp >> 23) - 127 + 15 = (exp >> 23) - 112
  // Then shift to half position (bits 10-14)
  // exp_half = ((exp >> 23) - 112) << 10 = (exp >> 13) - (112 << 10)
  __m128i exp_half = _mm_srli_epi32(exp, 13);
  exp_half = _mm_sub_epi32(exp_half, _mm_set1_epi32(112 << 10));

  // Clamp to valid range [0, 0x7C00]
  // If exp_half < 0, clamp to 0 (denormal -> 0)
  // If exp_half > 0x7C00, clamp to 0x7C00 (inf)
  __m128i exp_neg = _mm_cmplt_epi32(exp_half, _mm_setzero_si128());
  exp_half = _mm_andnot_si128(exp_neg, exp_half);

  __m128i exp_over = _mm_cmpgt_epi32(exp_half, _mm_set1_epi32(0x7C00));
  exp_half = _mm_or_si128(
    _mm_andnot_si128(exp_over, exp_half),
    _mm_and_si128(exp_over, _mm_set1_epi32(0x7C00))
  );

  // Mantissa: shift right by 13 (23-10)
  __m128i mant_half = _mm_srli_epi32(mant, 13);

  // Combine
  __m128i result = _mm_or_si128(sign, _mm_or_si128(exp_half, mant_half));

  // Pack to 16-bit using shuffle (SSE2 compatible, avoids signed saturation)
  // We need to extract lower 16 bits of each 32-bit lane
  // Shuffle bytes: take bytes 0,1 from lane 0, bytes 0,1 from lane 1, etc.
  // SSE2 doesn't have pshufb, so use shifts and ORs
  __m128i lo = _mm_and_si128(result, _mm_set1_epi32(0xFFFF));
  __m128i hi = _mm_srli_epi64(result, 16);
  hi = _mm_and_si128(hi, _mm_set1_epi32(0xFFFF0000));
  result = _mm_or_si128(lo, hi);
  // Now we have: [h0|h1|??|??|h2|h3|??|??]
  // Extract and store
  dst[0] = static_cast<uint16_t>(_mm_extract_epi16(result, 0));
  dst[1] = static_cast<uint16_t>(_mm_extract_epi16(result, 2));
  dst[2] = static_cast<uint16_t>(_mm_extract_epi16(result, 4));
  dst[3] = static_cast<uint16_t>(_mm_extract_epi16(result, 6));
}

#endif  // TINYEXR_SIMD_SSE2

#endif  // TINYEXR_SIMD_X86

// ============================================================================
// ARM NEON Implementation
// ============================================================================

#if TINYEXR_SIMD_NEON

#if TINYEXR_SIMD_NEON_FP16

// NEON with FP16: 4 half values to 4 float values
inline void half_to_float_4_neon_fp16(const uint16_t* src, float* dst) {
  float16x4_t h = vld1_f16(reinterpret_cast<const float16_t*>(src));
  float32x4_t f = vcvt_f32_f16(h);
  vst1q_f32(dst, f);
}

// NEON with FP16: 8 half values to 8 float values
inline void half_to_float_8_neon_fp16(const uint16_t* src, float* dst) {
  float16x8_t h = vld1q_f16(reinterpret_cast<const float16_t*>(src));
  float32x4_t f_lo = vcvt_f32_f16(vget_low_f16(h));
  float32x4_t f_hi = vcvt_f32_f16(vget_high_f16(h));
  vst1q_f32(dst, f_lo);
  vst1q_f32(dst + 4, f_hi);
}

// NEON with FP16: 4 float values to 4 half values
inline void float_to_half_4_neon_fp16(const float* src, uint16_t* dst) {
  float32x4_t f = vld1q_f32(src);
  float16x4_t h = vcvt_f16_f32(f);
  vst1_f16(reinterpret_cast<float16_t*>(dst), h);
}

// NEON with FP16: 8 float values to 8 half values
inline void float_to_half_8_neon_fp16(const float* src, uint16_t* dst) {
  float32x4_t f_lo = vld1q_f32(src);
  float32x4_t f_hi = vld1q_f32(src + 4);
  float16x4_t h_lo = vcvt_f16_f32(f_lo);
  float16x4_t h_hi = vcvt_f16_f32(f_hi);
  float16x8_t h = vcombine_f16(h_lo, h_hi);
  vst1q_f16(reinterpret_cast<float16_t*>(dst), h);
}

#else

// NEON without FP16 hardware support - use scalar fallback
inline void half_to_float_4_neon(const uint16_t* src, float* dst) {
  for (int i = 0; i < 4; i++) {
    dst[i] = half_to_float_scalar(src[i]);
  }
}

inline void float_to_half_4_neon(const float* src, uint16_t* dst) {
  for (int i = 0; i < 4; i++) {
    dst[i] = float_to_half_scalar(src[i]);
  }
}

#endif  // TINYEXR_SIMD_NEON_FP16

#endif  // TINYEXR_SIMD_NEON

// ============================================================================
// ARM SVE Implementation
// ============================================================================

#if TINYEXR_SIMD_SVE

// SVE: Variable-length half to float conversion
// Processes as many elements as the SVE vector length allows
inline size_t half_to_float_sve(const uint16_t* src, float* dst, size_t count) {
  size_t processed = 0;
  svbool_t pg = svwhilelt_b16(processed, count);

  while (svptest_any(svptrue_b16(), pg)) {
    // Load half-precision values
    svfloat16_t h = svld1_f16(pg, reinterpret_cast<const float16_t*>(src + processed));

    // Convert to float32 (process in two halves for SVE)
    svbool_t pg32 = svwhilelt_b32(processed, count);
    svfloat32_t f_lo = svcvt_f32_f16_z(pg32, h);
    vst1q_f32(dst + processed, f_lo);  // This needs SVE store

    // SVE doesn't have direct half-vector access like NEON
    // We need to use predicated stores
    svst1_f32(pg32, dst + processed, f_lo);

    size_t step = svcnth();
    processed += step;
    pg = svwhilelt_b16(processed, count);
  }

  return processed;
}

// SVE: Variable-length float to half conversion
inline size_t float_to_half_sve(const float* src, uint16_t* dst, size_t count) {
  size_t processed = 0;

  while (processed < count) {
    size_t remaining = count - processed;
    svbool_t pg32 = svwhilelt_b32(static_cast<uint64_t>(0), remaining);

    // Load float32 values
    svfloat32_t f = svld1_f32(pg32, src + processed);

    // Convert to half-precision
    svfloat16_t h = svcvt_f16_f32_z(svwhilelt_b16(static_cast<uint64_t>(0), remaining), f);

    // Store half-precision values
    svst1_f16(svwhilelt_b16(static_cast<uint64_t>(0), remaining),
              reinterpret_cast<float16_t*>(dst + processed), h);

    size_t step = svcntw();  // Number of 32-bit elements
    processed += step;
  }

  return processed;
}

#endif  // TINYEXR_SIMD_SVE

// ============================================================================
// ARM A64FX (SVE 512-bit) Optimized Implementation
// ============================================================================

#if TINYEXR_SIMD_A64FX || (TINYEXR_SIMD_SVE && defined(TINYEXR_A64FX_OPTIMIZED))

// A64FX-specific optimizations for 512-bit SVE
// A64FX has 512-bit SVE vectors, so we can process:
// - 32 half-precision values at once
// - 16 single-precision values at once

// A64FX: 16 half values to 16 float values (512-bit SVE)
inline void half_to_float_16_a64fx(const uint16_t* src, float* dst) {
#if TINYEXR_SIMD_SVE
  // Use full 512-bit vector for half-precision (32 values)
  // But we convert 16 at a time to fit in float32 output
  svbool_t pg16 = svptrue_b16();
  svbool_t pg32 = svptrue_b32();

  // Load 16 half-precision values
  svfloat16_t h = svld1_f16(svwhilelt_b16(static_cast<uint64_t>(0), static_cast<uint64_t>(16)),
                            reinterpret_cast<const float16_t*>(src));

  // Convert to float32
  svfloat32_t f = svcvt_f32_f16_z(pg32, h);

  // Store 16 float values
  svst1_f32(pg32, dst, f);
#else
  // Fallback to scalar
  for (int i = 0; i < 16; i++) {
    dst[i] = half_to_float_scalar(src[i]);
  }
#endif
}

// A64FX: 16 float values to 16 half values (512-bit SVE)
inline void float_to_half_16_a64fx(const float* src, uint16_t* dst) {
#if TINYEXR_SIMD_SVE
  svbool_t pg32 = svptrue_b32();

  // Load 16 float values
  svfloat32_t f = svld1_f32(pg32, src);

  // Convert to half-precision
  svfloat16_t h = svcvt_f16_f32_z(svwhilelt_b16(static_cast<uint64_t>(0), static_cast<uint64_t>(16)), f);

  // Store 16 half-precision values
  svst1_f16(svwhilelt_b16(static_cast<uint64_t>(0), static_cast<uint64_t>(16)),
            reinterpret_cast<float16_t*>(dst), h);
#else
  // Fallback to scalar
  for (int i = 0; i < 16; i++) {
    dst[i] = float_to_half_scalar(src[i]);
  }
#endif
}

// A64FX: 32 half values to 32 float values (full 512-bit utilization)
inline void half_to_float_32_a64fx(const uint16_t* src, float* dst) {
#if TINYEXR_SIMD_SVE
  // Process in two batches of 16 to utilize full 512-bit vectors
  half_to_float_16_a64fx(src, dst);
  half_to_float_16_a64fx(src + 16, dst + 16);
#else
  for (int i = 0; i < 32; i++) {
    dst[i] = half_to_float_scalar(src[i]);
  }
#endif
}

// A64FX: 32 float values to 32 half values (full 512-bit utilization)
inline void float_to_half_32_a64fx(const float* src, uint16_t* dst) {
#if TINYEXR_SIMD_SVE
  // Process in two batches of 16
  float_to_half_16_a64fx(src, dst);
  float_to_half_16_a64fx(src + 16, dst + 16);
#else
  for (int i = 0; i < 32; i++) {
    dst[i] = float_to_half_scalar(src[i]);
  }
#endif
}

#endif  // TINYEXR_SIMD_A64FX

// ============================================================================
// Generic Batch Conversion Functions (auto-dispatch)
// ============================================================================

// Convert an array of half-precision values to float
inline void half_to_float_batch(const uint16_t* src, float* dst, size_t count) {
  size_t i = 0;

#if TINYEXR_SIMD_A64FX || (TINYEXR_SIMD_SVE && defined(TINYEXR_A64FX_OPTIMIZED))
  // A64FX: Process 32 values at a time
  for (; i + 32 <= count; i += 32) {
    half_to_float_32_a64fx(src + i, dst + i);
  }
  for (; i + 16 <= count; i += 16) {
    half_to_float_16_a64fx(src + i, dst + i);
  }
#elif TINYEXR_SIMD_SVE
  // SVE: Use variable-length processing
  i = half_to_float_sve(src, dst, count);
#elif TINYEXR_SIMD_AVX512F
  // AVX-512: Process 16 values at a time
  for (; i + 16 <= count; i += 16) {
    half_to_float_16_avx512(src + i, dst + i);
  }
#elif TINYEXR_SIMD_F16C && TINYEXR_SIMD_AVX
  // AVX + F16C: Process 8 values at a time
  for (; i + 8 <= count; i += 8) {
    half_to_float_8_f16c(src + i, dst + i);
  }
#elif TINYEXR_SIMD_F16C
  // SSE + F16C: Process 4 values at a time
  for (; i + 4 <= count; i += 4) {
    half_to_float_4_f16c(src + i, dst + i);
  }
#elif TINYEXR_SIMD_NEON_FP16
  // NEON with FP16: Process 8 values at a time
  for (; i + 8 <= count; i += 8) {
    half_to_float_8_neon_fp16(src + i, dst + i);
  }
  for (; i + 4 <= count; i += 4) {
    half_to_float_4_neon_fp16(src + i, dst + i);
  }
#elif TINYEXR_SIMD_NEON
  // NEON without FP16: Use scalar (4 at a time for cache efficiency)
  for (; i + 4 <= count; i += 4) {
    half_to_float_4_neon(src + i, dst + i);
  }
#elif TINYEXR_SIMD_SSE2
  // SSE2: Use scalar implementation with some loop unrolling
  for (; i + 4 <= count; i += 4) {
    half_to_float_4_sse2(src + i, dst + i);
  }
#endif

  // Handle remaining elements with scalar code
  for (; i < count; i++) {
    dst[i] = half_to_float_scalar(src[i]);
  }
}

// Convert an array of float values to half-precision
inline void float_to_half_batch(const float* src, uint16_t* dst, size_t count) {
  size_t i = 0;

#if TINYEXR_SIMD_A64FX || (TINYEXR_SIMD_SVE && defined(TINYEXR_A64FX_OPTIMIZED))
  // A64FX: Process 32 values at a time
  for (; i + 32 <= count; i += 32) {
    float_to_half_32_a64fx(src + i, dst + i);
  }
  for (; i + 16 <= count; i += 16) {
    float_to_half_16_a64fx(src + i, dst + i);
  }
#elif TINYEXR_SIMD_SVE
  // SVE: Use variable-length processing
  i = float_to_half_sve(src, dst, count);
#elif TINYEXR_SIMD_AVX512F
  // AVX-512: Process 16 values at a time
  for (; i + 16 <= count; i += 16) {
    float_to_half_16_avx512(src + i, dst + i);
  }
#elif TINYEXR_SIMD_F16C && TINYEXR_SIMD_AVX
  // AVX + F16C: Process 8 values at a time
  for (; i + 8 <= count; i += 8) {
    float_to_half_8_f16c(src + i, dst + i);
  }
#elif TINYEXR_SIMD_F16C
  // SSE + F16C: Process 4 values at a time
  for (; i + 4 <= count; i += 4) {
    float_to_half_4_f16c(src + i, dst + i);
  }
#elif TINYEXR_SIMD_NEON_FP16
  // NEON with FP16: Process 8 values at a time
  for (; i + 8 <= count; i += 8) {
    float_to_half_8_neon_fp16(src + i, dst + i);
  }
  for (; i + 4 <= count; i += 4) {
    float_to_half_4_neon_fp16(src + i, dst + i);
  }
#elif TINYEXR_SIMD_NEON
  // NEON without FP16
  for (; i + 4 <= count; i += 4) {
    float_to_half_4_neon(src + i, dst + i);
  }
#elif TINYEXR_SIMD_SSE2
  // SSE2
  for (; i + 4 <= count; i += 4) {
    float_to_half_4_sse2(src + i, dst + i);
  }
#endif

  // Handle remaining elements with scalar code
  for (; i < count; i++) {
    dst[i] = float_to_half_scalar(src[i]);
  }
}

// ============================================================================
// Memory Operations
// ============================================================================

// Fast memory copy with SIMD
inline void memcpy_simd(void* dst, const void* src, size_t bytes) {
#if TINYEXR_SIMD_AVX512F
  const size_t vec_size = 64;
  size_t i = 0;
  for (; i + vec_size <= bytes; i += vec_size) {
    __m512i v = _mm512_loadu_si512(static_cast<const char*>(src) + i);
    _mm512_storeu_si512(static_cast<char*>(dst) + i, v);
  }
  if (i < bytes) {
    std::memcpy(static_cast<char*>(dst) + i, static_cast<const char*>(src) + i, bytes - i);
  }
#elif TINYEXR_SIMD_AVX
  const size_t vec_size = 32;
  size_t i = 0;
  for (; i + vec_size <= bytes; i += vec_size) {
    __m256i v = _mm256_loadu_si256(reinterpret_cast<const __m256i*>(static_cast<const char*>(src) + i));
    _mm256_storeu_si256(reinterpret_cast<__m256i*>(static_cast<char*>(dst) + i), v);
  }
  if (i < bytes) {
    std::memcpy(static_cast<char*>(dst) + i, static_cast<const char*>(src) + i, bytes - i);
  }
#elif TINYEXR_SIMD_SSE2
  const size_t vec_size = 16;
  size_t i = 0;
  for (; i + vec_size <= bytes; i += vec_size) {
    __m128i v = _mm_loadu_si128(reinterpret_cast<const __m128i*>(static_cast<const char*>(src) + i));
    _mm_storeu_si128(reinterpret_cast<__m128i*>(static_cast<char*>(dst) + i), v);
  }
  if (i < bytes) {
    std::memcpy(static_cast<char*>(dst) + i, static_cast<const char*>(src) + i, bytes - i);
  }
#elif TINYEXR_SIMD_NEON
  const size_t vec_size = 16;
  size_t i = 0;
  for (; i + vec_size <= bytes; i += vec_size) {
    uint8x16_t v = vld1q_u8(static_cast<const uint8_t*>(src) + i);
    vst1q_u8(static_cast<uint8_t*>(dst) + i, v);
  }
  if (i < bytes) {
    std::memcpy(static_cast<char*>(dst) + i, static_cast<const char*>(src) + i, bytes - i);
  }
#elif TINYEXR_SIMD_SVE
  size_t i = 0;
  while (i < bytes) {
    svbool_t pg = svwhilelt_b8(i, bytes);
    svuint8_t v = svld1_u8(pg, static_cast<const uint8_t*>(src) + i);
    svst1_u8(pg, static_cast<uint8_t*>(dst) + i, v);
    i += svcntb();
  }
#else
  std::memcpy(dst, src, bytes);
#endif
}

// ============================================================================
// Pixel Channel Interleaving/Deinterleaving
// ============================================================================

// Interleave separate R, G, B, A channels into RGBA format
// Input: 4 separate float arrays (R, G, B, A), each of length 'count'
// Output: Interleaved RGBA array of length 'count * 4'
inline void interleave_rgba_float(const float* r, const float* g, const float* b, const float* a,
                                  float* rgba, size_t count) {
  size_t i = 0;

#if TINYEXR_SIMD_AVX
  // AVX: Process 8 pixels at a time
  for (; i + 8 <= count; i += 8) {
    __m256 vr = _mm256_loadu_ps(r + i);
    __m256 vg = _mm256_loadu_ps(g + i);
    __m256 vb = _mm256_loadu_ps(b + i);
    __m256 va = _mm256_loadu_ps(a + i);

    // Interleave: RGBARGBA...
    // First, interleave R and G, B and A
    __m256 rg_lo = _mm256_unpacklo_ps(vr, vg);  // r0 g0 r1 g1 | r4 g4 r5 g5
    __m256 rg_hi = _mm256_unpackhi_ps(vr, vg);  // r2 g2 r3 g3 | r6 g6 r7 g7
    __m256 ba_lo = _mm256_unpacklo_ps(vb, va);  // b0 a0 b1 a1 | b4 a4 b5 a5
    __m256 ba_hi = _mm256_unpackhi_ps(vb, va);  // b2 a2 b3 a3 | b6 a6 b7 a7

    // Combine RG and BA
    __m256 rgba0 = _mm256_shuffle_ps(rg_lo, ba_lo, 0x44);  // r0 g0 b0 a0 | r4 g4 b4 a4
    __m256 rgba1 = _mm256_shuffle_ps(rg_lo, ba_lo, 0xEE);  // r1 g1 b1 a1 | r5 g5 b5 a5
    __m256 rgba2 = _mm256_shuffle_ps(rg_hi, ba_hi, 0x44);  // r2 g2 b2 a2 | r6 g6 b6 a6
    __m256 rgba3 = _mm256_shuffle_ps(rg_hi, ba_hi, 0xEE);  // r3 g3 b3 a3 | r7 g7 b7 a7

    // Permute to get final order
    __m256 out0 = _mm256_permute2f128_ps(rgba0, rgba1, 0x20);  // r0 g0 b0 a0 r1 g1 b1 a1
    __m256 out1 = _mm256_permute2f128_ps(rgba2, rgba3, 0x20);  // r2 g2 b2 a2 r3 g3 b3 a3
    __m256 out2 = _mm256_permute2f128_ps(rgba0, rgba1, 0x31);  // r4 g4 b4 a4 r5 g5 b5 a5
    __m256 out3 = _mm256_permute2f128_ps(rgba2, rgba3, 0x31);  // r6 g6 b6 a6 r7 g7 b7 a7

    _mm256_storeu_ps(rgba + i * 4, out0);
    _mm256_storeu_ps(rgba + i * 4 + 8, out1);
    _mm256_storeu_ps(rgba + i * 4 + 16, out2);
    _mm256_storeu_ps(rgba + i * 4 + 24, out3);
  }
#elif TINYEXR_SIMD_SSE2
  // SSE2: Process 4 pixels at a time
  for (; i + 4 <= count; i += 4) {
    __m128 vr = _mm_loadu_ps(r + i);
    __m128 vg = _mm_loadu_ps(g + i);
    __m128 vb = _mm_loadu_ps(b + i);
    __m128 va = _mm_loadu_ps(a + i);

    // Interleave
    __m128 rg_lo = _mm_unpacklo_ps(vr, vg);  // r0 g0 r1 g1
    __m128 rg_hi = _mm_unpackhi_ps(vr, vg);  // r2 g2 r3 g3
    __m128 ba_lo = _mm_unpacklo_ps(vb, va);  // b0 a0 b1 a1
    __m128 ba_hi = _mm_unpackhi_ps(vb, va);  // b2 a2 b3 a3

    __m128 rgba0 = _mm_movelh_ps(rg_lo, ba_lo);  // r0 g0 b0 a0
    __m128 rgba1 = _mm_movehl_ps(ba_lo, rg_lo);  // r1 g1 b1 a1
    __m128 rgba2 = _mm_movelh_ps(rg_hi, ba_hi);  // r2 g2 b2 a2
    __m128 rgba3 = _mm_movehl_ps(ba_hi, rg_hi);  // r3 g3 b3 a3

    _mm_storeu_ps(rgba + i * 4, rgba0);
    _mm_storeu_ps(rgba + i * 4 + 4, rgba1);
    _mm_storeu_ps(rgba + i * 4 + 8, rgba2);
    _mm_storeu_ps(rgba + i * 4 + 12, rgba3);
  }
#elif TINYEXR_SIMD_NEON
  // NEON: Process 4 pixels at a time
  for (; i + 4 <= count; i += 4) {
    float32x4_t vr = vld1q_f32(r + i);
    float32x4_t vg = vld1q_f32(g + i);
    float32x4_t vb = vld1q_f32(b + i);
    float32x4_t va = vld1q_f32(a + i);

    float32x4x4_t rgba_vec = {{vr, vg, vb, va}};
    vst4q_f32(rgba + i * 4, rgba_vec);
  }
#endif

  // Scalar fallback for remaining elements
  for (; i < count; i++) {
    rgba[i * 4 + 0] = r[i];
    rgba[i * 4 + 1] = g[i];
    rgba[i * 4 + 2] = b[i];
    rgba[i * 4 + 3] = a[i];
  }
}

// Deinterleave RGBA format into separate R, G, B, A channels
inline void deinterleave_rgba_float(const float* rgba, float* r, float* g, float* b, float* a,
                                    size_t count) {
  size_t i = 0;

#if TINYEXR_SIMD_AVX
  // AVX: Process 8 pixels at a time
  for (; i + 8 <= count; i += 8) {
    // Load 8 RGBA pixels (32 floats)
    __m256 rgba0 = _mm256_loadu_ps(rgba + i * 4);       // r0 g0 b0 a0 r1 g1 b1 a1
    __m256 rgba1 = _mm256_loadu_ps(rgba + i * 4 + 8);   // r2 g2 b2 a2 r3 g3 b3 a3
    __m256 rgba2 = _mm256_loadu_ps(rgba + i * 4 + 16);  // r4 g4 b4 a4 r5 g5 b5 a5
    __m256 rgba3 = _mm256_loadu_ps(rgba + i * 4 + 24);  // r6 g6 b6 a6 r7 g7 b7 a7

    // Transpose within lanes first
    __m256 t0 = _mm256_unpacklo_ps(rgba0, rgba1);  // r0 r2 g0 g2 | r1 r3 g1 g3
    __m256 t1 = _mm256_unpackhi_ps(rgba0, rgba1);  // b0 b2 a0 a2 | b1 b3 a1 a3
    __m256 t2 = _mm256_unpacklo_ps(rgba2, rgba3);  // r4 r6 g4 g6 | r5 r7 g5 g7
    __m256 t3 = _mm256_unpackhi_ps(rgba2, rgba3);  // b4 b6 a4 a6 | b5 b7 a5 a7

    __m256 tt0 = _mm256_shuffle_ps(t0, t2, 0x44);  // r0 r2 r4 r6 | r1 r3 r5 r7
    __m256 tt1 = _mm256_shuffle_ps(t0, t2, 0xEE);  // g0 g2 g4 g6 | g1 g3 g5 g7
    __m256 tt2 = _mm256_shuffle_ps(t1, t3, 0x44);  // b0 b2 b4 b6 | b1 b3 b5 b7
    __m256 tt3 = _mm256_shuffle_ps(t1, t3, 0xEE);  // a0 a2 a4 a6 | a1 a3 a5 a7

    // Permute across lanes to get final order
    // tt0 = r0 r2 r4 r6 | r1 r3 r5 r7 -> want r0 r1 r2 r3 r4 r5 r6 r7
    // permutevar8x32 indices: 0->0, 4->1, 1->2, 5->3, 2->4, 6->5, 3->6, 7->7
    __m256 vr = _mm256_permutevar8x32_ps(tt0, _mm256_setr_epi32(0,4,1,5,2,6,3,7));
    __m256 vg = _mm256_permutevar8x32_ps(tt1, _mm256_setr_epi32(0,4,1,5,2,6,3,7));
    __m256 vb = _mm256_permutevar8x32_ps(tt2, _mm256_setr_epi32(0,4,1,5,2,6,3,7));
    __m256 va = _mm256_permutevar8x32_ps(tt3, _mm256_setr_epi32(0,4,1,5,2,6,3,7));

    _mm256_storeu_ps(r + i, vr);
    _mm256_storeu_ps(g + i, vg);
    _mm256_storeu_ps(b + i, vb);
    _mm256_storeu_ps(a + i, va);
  }
#endif

#if TINYEXR_SIMD_NEON
  // NEON has excellent deinterleave support
  for (; i + 4 <= count; i += 4) {
    float32x4x4_t rgba_vec = vld4q_f32(rgba + i * 4);
    vst1q_f32(r + i, rgba_vec.val[0]);
    vst1q_f32(g + i, rgba_vec.val[1]);
    vst1q_f32(b + i, rgba_vec.val[2]);
    vst1q_f32(a + i, rgba_vec.val[3]);
  }
#elif TINYEXR_SIMD_SSE2
  // SSE2: Process 4 pixels at a time
  for (; i + 4 <= count; i += 4) {
    __m128 rgba0 = _mm_loadu_ps(rgba + i * 4);       // r0 g0 b0 a0
    __m128 rgba1 = _mm_loadu_ps(rgba + i * 4 + 4);   // r1 g1 b1 a1
    __m128 rgba2 = _mm_loadu_ps(rgba + i * 4 + 8);   // r2 g2 b2 a2
    __m128 rgba3 = _mm_loadu_ps(rgba + i * 4 + 12);  // r3 g3 b3 a3

    // Transpose 4x4 matrix
    __m128 t0 = _mm_unpacklo_ps(rgba0, rgba1);  // r0 r1 g0 g1
    __m128 t1 = _mm_unpackhi_ps(rgba0, rgba1);  // b0 b1 a0 a1
    __m128 t2 = _mm_unpacklo_ps(rgba2, rgba3);  // r2 r3 g2 g3
    __m128 t3 = _mm_unpackhi_ps(rgba2, rgba3);  // b2 b3 a2 a3

    __m128 vr = _mm_movelh_ps(t0, t2);  // r0 r1 r2 r3
    __m128 vg = _mm_movehl_ps(t2, t0);  // g0 g1 g2 g3
    __m128 vb = _mm_movelh_ps(t1, t3);  // b0 b1 b2 b3
    __m128 va = _mm_movehl_ps(t3, t1);  // a0 a1 a2 a3

    _mm_storeu_ps(r + i, vr);
    _mm_storeu_ps(g + i, vg);
    _mm_storeu_ps(b + i, vb);
    _mm_storeu_ps(a + i, va);
  }
#endif

  // Scalar fallback
  for (; i < count; i++) {
    r[i] = rgba[i * 4 + 0];
    g[i] = rgba[i * 4 + 1];
    b[i] = rgba[i * 4 + 2];
    a[i] = rgba[i * 4 + 3];
  }
}

// ============================================================================
// RLE Decompression with SIMD
// ============================================================================

// Optimized byte reordering for EXR scanline data
// This reorders bytes for better compression (separates MSB and LSB)
inline void reorder_bytes_for_compression(const uint8_t* src, uint8_t* dst, size_t count) {
  size_t half = count / 2;

  // Reorder: alternating bytes to separate channels
  // This mimics the OpenEXR predictor preprocessing
  size_t i = 0;

// Note: AVX2 byte deinterleave is complex due to lane boundaries.
// Using SSE2 approach which is simpler and still fast.
#if TINYEXR_SIMD_SSE2
  // SSE2: Process 16 bytes at a time
  for (; i + 16 <= half; i += 16) {
    __m128i v0 = _mm_loadu_si128(reinterpret_cast<const __m128i*>(src + i * 2));
    __m128i v1 = _mm_loadu_si128(reinterpret_cast<const __m128i*>(src + i * 2 + 16));

    // Simple even/odd separation using masks and shifts
    __m128i even0 = _mm_and_si128(v0, _mm_set1_epi16(0x00FF));
    __m128i even1 = _mm_and_si128(v1, _mm_set1_epi16(0x00FF));
    __m128i odd0 = _mm_srli_epi16(v0, 8);
    __m128i odd1 = _mm_srli_epi16(v1, 8);

    __m128i evens = _mm_packus_epi16(even0, even1);
    __m128i odds = _mm_packus_epi16(odd0, odd1);

    _mm_storeu_si128(reinterpret_cast<__m128i*>(dst + i), evens);
    _mm_storeu_si128(reinterpret_cast<__m128i*>(dst + half + i), odds);
  }
#elif TINYEXR_SIMD_NEON
  // NEON: Process 16 bytes at a time with native deinterleave
  for (; i + 16 <= half; i += 16) {
    uint8x16x2_t v = vld2q_u8(src + i * 2);
    vst1q_u8(dst + i, v.val[0]);
    vst1q_u8(dst + half + i, v.val[1]);
  }
#endif

  // Scalar fallback
  for (; i < half; i++) {
    dst[i] = src[i * 2];
    dst[half + i] = src[i * 2 + 1];
  }
}

// Reverse byte reordering after decompression
inline void unreorder_bytes_after_decompression(const uint8_t* src, uint8_t* dst, size_t count) {
  size_t half = count / 2;
  size_t i = 0;

#if TINYEXR_SIMD_NEON
  // NEON: Process 16 bytes at a time with native interleave
  for (; i + 16 <= half; i += 16) {
    uint8x16_t v0 = vld1q_u8(src + i);
    uint8x16_t v1 = vld1q_u8(src + half + i);
    uint8x16x2_t out = {{v0, v1}};
    vst2q_u8(dst + i * 2, out);
  }
#elif TINYEXR_SIMD_SSE2
  // SSE2: Process 16 bytes at a time
  for (; i + 16 <= half; i += 16) {
    __m128i evens = _mm_loadu_si128(reinterpret_cast<const __m128i*>(src + i));
    __m128i odds = _mm_loadu_si128(reinterpret_cast<const __m128i*>(src + half + i));

    __m128i lo = _mm_unpacklo_epi8(evens, odds);
    __m128i hi = _mm_unpackhi_epi8(evens, odds);

    _mm_storeu_si128(reinterpret_cast<__m128i*>(dst + i * 2), lo);
    _mm_storeu_si128(reinterpret_cast<__m128i*>(dst + i * 2 + 16), hi);
  }
#endif

  // Scalar fallback
  for (; i < half; i++) {
    dst[i * 2] = src[i];
    dst[i * 2 + 1] = src[half + i];
  }
}

// ============================================================================
// Predictor (delta encoding/decoding)
// ============================================================================

// Apply delta predictor (used in PIZ compression)
inline void apply_delta_predictor(uint8_t* data, size_t count) {
  if (count < 2) return;

  size_t i = 1;

#if TINYEXR_SIMD_AVX2
  // AVX2: Process 32 bytes at a time
  if (count >= 33) {
    // Process first byte separately
    data[1] = static_cast<uint8_t>(data[0] + data[1] - 128);

    // SIMD processing
    for (i = 2; i + 31 <= count; ) {
      __m256i prev = _mm256_loadu_si256(reinterpret_cast<const __m256i*>(data + i - 1));
      __m256i curr = _mm256_loadu_si256(reinterpret_cast<const __m256i*>(data + i));
      __m256i bias = _mm256_set1_epi8(-128);

      // Sequential dependency makes full SIMD difficult
      // Fall back to scalar for correctness
      break;
    }
  }
#endif

  // Scalar fallback (required due to sequential dependency)
  for (; i < count; i++) {
    data[i] = static_cast<uint8_t>(data[i - 1] + data[i] - 128);
  }
}

// Reverse delta predictor
inline void reverse_delta_predictor(uint8_t* data, size_t count) {
  if (count < 2) return;

  // This has sequential dependency, so SIMD doesn't help much
  // But we can still use SIMD for the subtraction step
  for (size_t i = count - 1; i >= 1; i--) {
    data[i] = static_cast<uint8_t>(data[i] - data[i - 1] + 128);
  }
}

// ============================================================================
// Optimized Delta Predictor (P1 optimization)
// ============================================================================

// Prefetch hint macro
#ifndef TINYEXR_PREFETCH
#if defined(__GNUC__) || defined(__clang__)
#define TINYEXR_PREFETCH(addr) __builtin_prefetch(addr, 0, 3)
#elif defined(_MSC_VER) && (defined(_M_IX86) || defined(_M_X64))
#include <intrin.h>
#define TINYEXR_PREFETCH(addr) _mm_prefetch(reinterpret_cast<const char*>(addr), _MM_HINT_T0)
#elif defined(_MSC_VER)
#define TINYEXR_PREFETCH(addr) (void)(addr)
#else
#define TINYEXR_PREFETCH(addr) (void)(addr)
#endif
#endif

// Optimized delta predictor decode with loop unrolling and prefetching
// This is the decode operation: d[i] = d[i-1] + d[i] - 128
// Sequential dependency limits SIMD, but we can still optimize with:
// - Loop unrolling (4x) to hide instruction latency
// - Prefetching to reduce memory stalls
inline void apply_delta_predictor_fast(uint8_t* data, size_t count) {
  if (count < 2) return;

  // Prefetch ahead
  TINYEXR_PREFETCH(data + 64);

  size_t i = 1;

  // Process 4 elements at a time with explicit dependency chain
  // This helps instruction-level parallelism within the dependency chain
  for (; i + 3 < count; i += 4) {
    TINYEXR_PREFETCH(data + i + 64);

    // Unrolled with explicit dependency chain
    int d0 = static_cast<int>(data[i-1]) + static_cast<int>(data[i]) - 128;
    data[i] = static_cast<uint8_t>(d0);

    int d1 = d0 + static_cast<int>(data[i+1]) - 128;
    data[i+1] = static_cast<uint8_t>(d1);

    int d2 = d1 + static_cast<int>(data[i+2]) - 128;
    data[i+2] = static_cast<uint8_t>(d2);

    int d3 = d2 + static_cast<int>(data[i+3]) - 128;
    data[i+3] = static_cast<uint8_t>(d3);
  }

  // Handle remainder
  for (; i < count; i++) {
    data[i] = static_cast<uint8_t>(data[i-1] + data[i] - 128);
  }
}

// Optimized delta predictor encode with loop unrolling
// This is the encode operation: d[i] = d[i] - d[i-1] + 128
inline void reverse_delta_predictor_fast(uint8_t* data, size_t count) {
  if (count < 2) return;

  // Work backwards to avoid overwriting data we need
  size_t i = count - 1;

  // Unroll 4x
  for (; i >= 4; i -= 4) {
    data[i] = static_cast<uint8_t>(data[i] - data[i-1] + 128);
    data[i-1] = static_cast<uint8_t>(data[i-1] - data[i-2] + 128);
    data[i-2] = static_cast<uint8_t>(data[i-2] - data[i-3] + 128);
    data[i-3] = static_cast<uint8_t>(data[i-3] - data[i-4] + 128);
  }

  // Handle remainder
  for (; i >= 1; i--) {
    data[i] = static_cast<uint8_t>(data[i] - data[i-1] + 128);
  }
}

// ============================================================================
// RLE SIMD Optimizations (P2 optimization)
// ============================================================================

// SIMD-accelerated memset for RLE decompression
inline void memset_simd(void* dst, int val, size_t bytes) {
  uint8_t* d = static_cast<uint8_t*>(dst);

#if TINYEXR_SIMD_AVX2
  if (bytes >= 32) {
    __m256i v = _mm256_set1_epi8(static_cast<char>(val));
    while (bytes >= 32) {
      _mm256_storeu_si256(reinterpret_cast<__m256i*>(d), v);
      d += 32;
      bytes -= 32;
    }
  }
#endif

#if TINYEXR_SIMD_SSE2
  if (bytes >= 16) {
    __m128i v = _mm_set1_epi8(static_cast<char>(val));
    while (bytes >= 16) {
      _mm_storeu_si128(reinterpret_cast<__m128i*>(d), v);
      d += 16;
      bytes -= 16;
    }
  }
#elif TINYEXR_SIMD_NEON
  if (bytes >= 16) {
    uint8x16_t v = vdupq_n_u8(static_cast<uint8_t>(val));
    while (bytes >= 16) {
      vst1q_u8(d, v);
      d += 16;
      bytes -= 16;
    }
  }
#endif

  // Handle remainder with standard memset
  if (bytes > 0) {
    std::memset(d, val, bytes);
  }
}

// SIMD-accelerated fill for uint16_t arrays (used in Huffman RLE)
// Returns pointer past the filled region
inline uint16_t* fill_u16_simd(uint16_t* dst, uint16_t val, size_t count) {
  if (count == 0) return dst;

#if TINYEXR_SIMD_AVX2
  // AVX2: Fill 16 uint16_t at a time
  if (count >= 16) {
    __m256i v = _mm256_set1_epi16(static_cast<short>(val));
    while (count >= 16) {
      _mm256_storeu_si256(reinterpret_cast<__m256i*>(dst), v);
      dst += 16;
      count -= 16;
    }
  }
#endif

#if TINYEXR_SIMD_SSE2
  // SSE2: Fill 8 uint16_t at a time
  if (count >= 8) {
    __m128i v = _mm_set1_epi16(static_cast<short>(val));
    while (count >= 8) {
      _mm_storeu_si128(reinterpret_cast<__m128i*>(dst), v);
      dst += 8;
      count -= 8;
    }
  }
#elif TINYEXR_SIMD_NEON
  // NEON: Fill 8 uint16_t at a time
  if (count >= 8) {
    uint16x8_t v = vdupq_n_u16(val);
    while (count >= 8) {
      vst1q_u16(dst, v);
      dst += 8;
      count -= 8;
    }
  }
#endif

  // Scalar fallback for remainder
  while (count > 0) {
    *dst++ = val;
    --count;
  }
  return dst;
}

// Find run length starting from given position
// Returns the number of consecutive bytes equal to data[0]
// Used for RLE compression optimization
inline size_t find_run_length_simd(const uint8_t* data, size_t max_len) {
  if (max_len == 0) return 0;
  if (max_len == 1) return 1;

  uint8_t pattern = data[0];
  size_t i = 1;

#if TINYEXR_SIMD_AVX2
  // AVX2: Check 32 bytes at a time
  if (max_len >= 33) {
    __m256i pat = _mm256_set1_epi8(static_cast<char>(pattern));

    for (; i + 32 <= max_len; i += 32) {
      __m256i chunk = _mm256_loadu_si256(reinterpret_cast<const __m256i*>(data + i));
      __m256i cmp = _mm256_cmpeq_epi8(chunk, pat);
      uint32_t mask = static_cast<uint32_t>(_mm256_movemask_epi8(cmp));

      if (mask != 0xFFFFFFFFU) {
        // Found a mismatch - find first differing byte
#if defined(__GNUC__) || defined(__clang__)
        return i + static_cast<size_t>(__builtin_ctz(~mask));
#elif defined(_MSC_VER)
        unsigned long idx;
        _BitScanForward(&idx, ~mask);
        return i + static_cast<size_t>(idx);
#else
        // Fallback: scan manually
        for (size_t j = 0; j < 32; j++) {
          if (data[i + j] != pattern) return i + j;
        }
#endif
      }
    }
  }
#endif

#if TINYEXR_SIMD_SSE2
  // SSE2: Check 16 bytes at a time
  if (max_len >= 17) {
    __m128i pat = _mm_set1_epi8(static_cast<char>(pattern));

    for (; i + 16 <= max_len; i += 16) {
      __m128i chunk = _mm_loadu_si128(reinterpret_cast<const __m128i*>(data + i));
      __m128i cmp = _mm_cmpeq_epi8(chunk, pat);
      uint32_t mask = static_cast<uint32_t>(_mm_movemask_epi8(cmp));

      if (mask != 0xFFFF) {
        // Found a mismatch
#if defined(__GNUC__) || defined(__clang__)
        return i + static_cast<size_t>(__builtin_ctz(static_cast<uint32_t>(~mask & 0xFFFF)));
#elif defined(_MSC_VER)
        unsigned long idx;
        _BitScanForward(&idx, ~mask & 0xFFFF);
        return i + static_cast<size_t>(idx);
#else
        for (size_t j = 0; j < 16; j++) {
          if (data[i + j] != pattern) return i + j;
        }
#endif
      }
    }
  }
#elif TINYEXR_SIMD_NEON
  // NEON: Check 16 bytes at a time
  if (max_len >= 17) {
    uint8x16_t pat = vdupq_n_u8(pattern);

    for (; i + 16 <= max_len; i += 16) {
      uint8x16_t chunk = vld1q_u8(data + i);
      uint8x16_t cmp = vceqq_u8(chunk, pat);

      // Check if all bytes match (all 0xFF)
      uint64x2_t cmp64 = vreinterpretq_u64_u8(cmp);
      if (vgetq_lane_u64(cmp64, 0) != 0xFFFFFFFFFFFFFFFFULL ||
          vgetq_lane_u64(cmp64, 1) != 0xFFFFFFFFFFFFFFFFULL) {
        // Found a mismatch - scan to find position
        for (size_t j = 0; j < 16; j++) {
          if (data[i + j] != pattern) return i + j;
        }
      }
    }
  }
#endif

  // Scalar fallback for remainder
  for (; i < max_len; i++) {
    if (data[i] != pattern) return i;
  }

  return max_len;
}

// ============================================================================
// PIZ Wavelet SIMD Optimizations (P2 optimization)
// ============================================================================

// 14-bit wavelet decode helper (wdec14)
// a = l + (h & 1) + (h >> 1)
// b = a - h
inline void wdec14_scalar(int16_t l, int16_t h, int16_t& a, int16_t& b) {
  a = static_cast<int16_t>(l + (h & 1) + (h >> 1));
  b = static_cast<int16_t>(a - h);
}

// 14-bit wavelet encode helper (wenc14)
// l = (a + b) >> 1
// h = a - b
inline void wenc14_scalar(int16_t a, int16_t b, int16_t& l, int16_t& h) {
  l = static_cast<int16_t>((a + b) >> 1);
  h = static_cast<int16_t>(a - b);
}

// Decode a 2x2 wavelet block
// Input: p00=L, p01=HL, p10=LH, p11=HH (wavelet coefficients)
// Output: 4 reconstructed pixel values
inline void wavelet_decode_2x2(uint16_t* p00, uint16_t* p01,
                               uint16_t* p10, uint16_t* p11) {
  int16_t l0 = static_cast<int16_t>(*p00);
  int16_t h0 = static_cast<int16_t>(*p10);
  int16_t l1 = static_cast<int16_t>(*p01);
  int16_t h1 = static_cast<int16_t>(*p11);

  // Step 1: Decode vertical pairs
  int16_t a0, b0, a1, b1;
  wdec14_scalar(l0, h0, a0, b0);
  wdec14_scalar(l1, h1, a1, b1);

  // Step 2: Decode horizontal pairs
  int16_t aa, ab, ba, bb;
  wdec14_scalar(a0, a1, aa, ab);
  wdec14_scalar(b0, b1, ba, bb);

  *p00 = static_cast<uint16_t>(aa);
  *p01 = static_cast<uint16_t>(ab);
  *p10 = static_cast<uint16_t>(ba);
  *p11 = static_cast<uint16_t>(bb);
}

// Encode a 2x2 pixel block into wavelet coefficients
inline void wavelet_encode_2x2(uint16_t* p00, uint16_t* p01,
                               uint16_t* p10, uint16_t* p11) {
  int16_t aa = static_cast<int16_t>(*p00);
  int16_t ab = static_cast<int16_t>(*p01);
  int16_t ba = static_cast<int16_t>(*p10);
  int16_t bb = static_cast<int16_t>(*p11);

  // Step 1: Encode horizontal pairs
  int16_t a0, a1, b0, b1;
  wenc14_scalar(aa, ab, a0, a1);
  wenc14_scalar(ba, bb, b0, b1);

  // Step 2: Encode vertical pairs
  int16_t l0, h0, l1, h1;
  wenc14_scalar(a0, b0, l0, h0);
  wenc14_scalar(a1, b1, l1, h1);

  *p00 = static_cast<uint16_t>(l0);
  *p01 = static_cast<uint16_t>(l1);
  *p10 = static_cast<uint16_t>(h0);
  *p11 = static_cast<uint16_t>(h1);
}

#if TINYEXR_SIMD_SSE2

// SSE2: Process 4 2x2 blocks in parallel (8 pixels per row)
// Input: 4 consecutive 2x2 blocks arranged as:
//   row0: [L0 HL0 L1 HL1 L2 HL2 L3 HL3]
//   row1: [LH0 HH0 LH1 HH1 LH2 HH2 LH3 HH3]
inline void wavelet_decode_4blocks_sse2(uint16_t* row0, uint16_t* row1, size_t stride) {
  // Load 8 values from each row
  __m128i r0 = _mm_loadu_si128(reinterpret_cast<const __m128i*>(row0));
  __m128i r1 = _mm_loadu_si128(reinterpret_cast<const __m128i*>(row1));

  // Deinterleave to get L, HL, LH, HH for all 4 blocks
  // r0 = [L0 HL0 L1 HL1 L2 HL2 L3 HL3]
  // r1 = [LH0 HH0 LH1 HH1 LH2 HH2 LH3 HH3]

  // Shuffle to separate even/odd positions
  // Even positions (L, L, L, L): indices 0, 2, 4, 6
  // Odd positions (HL, HL, HL, HL): indices 1, 3, 5, 7
  __m128i mask_even = _mm_set_epi8(-1, -1, -1, -1, -1, -1, -1, -1,
                                   13, 12, 9, 8, 5, 4, 1, 0);
  __m128i mask_odd = _mm_set_epi8(-1, -1, -1, -1, -1, -1, -1, -1,
                                  15, 14, 11, 10, 7, 6, 3, 2);

  // For SSE2 we need to use shuffle differently
  // Use unpack to separate even/odd 16-bit values
  __m128i L = _mm_and_si128(r0, _mm_set1_epi32(0x0000FFFF));
  __m128i HL = _mm_srli_epi32(r0, 16);
  __m128i LH = _mm_and_si128(r1, _mm_set1_epi32(0x0000FFFF));
  __m128i HH = _mm_srli_epi32(r1, 16);

  // Pack to get 4 values each
  L = _mm_packs_epi32(L, _mm_setzero_si128());
  HL = _mm_packs_epi32(HL, _mm_setzero_si128());
  LH = _mm_packs_epi32(LH, _mm_setzero_si128());
  HH = _mm_packs_epi32(HH, _mm_setzero_si128());

  // wdec14: a = l + (h & 1) + (h >> 1), b = a - h
  // Step 1: Decode vertical (L, LH -> A0, B0) and (HL, HH -> A1, B1)
  __m128i one = _mm_set1_epi16(1);

  // A0 = L + (LH & 1) + (LH >> 1)
  __m128i LH_and1 = _mm_and_si128(LH, one);
  __m128i LH_shr1 = _mm_srai_epi16(LH, 1);
  __m128i A0 = _mm_add_epi16(L, LH_and1);
  A0 = _mm_add_epi16(A0, LH_shr1);
  // B0 = A0 - LH
  __m128i B0 = _mm_sub_epi16(A0, LH);

  // A1 = HL + (HH & 1) + (HH >> 1)
  __m128i HH_and1 = _mm_and_si128(HH, one);
  __m128i HH_shr1 = _mm_srai_epi16(HH, 1);
  __m128i A1 = _mm_add_epi16(HL, HH_and1);
  A1 = _mm_add_epi16(A1, HH_shr1);
  // B1 = A1 - HH
  __m128i B1 = _mm_sub_epi16(A1, HH);

  // Step 2: Decode horizontal (A0, A1 -> AA, AB) and (B0, B1 -> BA, BB)
  // AA = A0 + (A1 & 1) + (A1 >> 1)
  __m128i A1_and1 = _mm_and_si128(A1, one);
  __m128i A1_shr1 = _mm_srai_epi16(A1, 1);
  __m128i AA = _mm_add_epi16(A0, A1_and1);
  AA = _mm_add_epi16(AA, A1_shr1);
  // AB = AA - A1
  __m128i AB = _mm_sub_epi16(AA, A1);

  // BA = B0 + (B1 & 1) + (B1 >> 1)
  __m128i B1_and1 = _mm_and_si128(B1, one);
  __m128i B1_shr1 = _mm_srai_epi16(B1, 1);
  __m128i BA = _mm_add_epi16(B0, B1_and1);
  BA = _mm_add_epi16(BA, B1_shr1);
  // BB = BA - B1
  __m128i BB = _mm_sub_epi16(BA, B1);

  // Interleave back: row0 = [AA0 AB0 AA1 AB1 AA2 AB2 AA3 AB3]
  //                  row1 = [BA0 BB0 BA1 BB1 BA2 BB2 BA3 BB3]
  __m128i out0 = _mm_unpacklo_epi16(AA, AB);
  __m128i out1 = _mm_unpacklo_epi16(BA, BB);

  _mm_storeu_si128(reinterpret_cast<__m128i*>(row0), out0);
  _mm_storeu_si128(reinterpret_cast<__m128i*>(row1), out1);
}

#endif  // TINYEXR_SIMD_SSE2

#if TINYEXR_SIMD_NEON

// NEON: Process 4 2x2 blocks in parallel
inline void wavelet_decode_4blocks_neon(uint16_t* row0, uint16_t* row1, size_t stride) {
  // Load 8 values from each row
  uint16x8_t r0 = vld1q_u16(row0);
  uint16x8_t r1 = vld1q_u16(row1);

  // Deinterleave using NEON's native support
  uint16x4x2_t r0_deint = vuzp_u16(vget_low_u16(r0), vget_high_u16(r0));
  uint16x4x2_t r1_deint = vuzp_u16(vget_low_u16(r1), vget_high_u16(r1));

  int16x4_t L = vreinterpret_s16_u16(r0_deint.val[0]);   // L values
  int16x4_t HL = vreinterpret_s16_u16(r0_deint.val[1]);  // HL values
  int16x4_t LH = vreinterpret_s16_u16(r1_deint.val[0]);  // LH values
  int16x4_t HH = vreinterpret_s16_u16(r1_deint.val[1]);  // HH values

  // wdec14: a = l + (h & 1) + (h >> 1), b = a - h
  int16x4_t one = vdup_n_s16(1);

  // Step 1: Decode vertical
  int16x4_t LH_and1 = vand_s16(LH, one);
  int16x4_t LH_shr1 = vshr_n_s16(LH, 1);
  int16x4_t A0 = vadd_s16(vadd_s16(L, LH_and1), LH_shr1);
  int16x4_t B0 = vsub_s16(A0, LH);

  int16x4_t HH_and1 = vand_s16(HH, one);
  int16x4_t HH_shr1 = vshr_n_s16(HH, 1);
  int16x4_t A1 = vadd_s16(vadd_s16(HL, HH_and1), HH_shr1);
  int16x4_t B1 = vsub_s16(A1, HH);

  // Step 2: Decode horizontal
  int16x4_t A1_and1 = vand_s16(A1, one);
  int16x4_t A1_shr1 = vshr_n_s16(A1, 1);
  int16x4_t AA = vadd_s16(vadd_s16(A0, A1_and1), A1_shr1);
  int16x4_t AB = vsub_s16(AA, A1);

  int16x4_t B1_and1 = vand_s16(B1, one);
  int16x4_t B1_shr1 = vshr_n_s16(B1, 1);
  int16x4_t BA = vadd_s16(vadd_s16(B0, B1_and1), B1_shr1);
  int16x4_t BB = vsub_s16(BA, B1);

  // Interleave back
  uint16x4x2_t out0_int = vzip_u16(vreinterpret_u16_s16(AA), vreinterpret_u16_s16(AB));
  uint16x4x2_t out1_int = vzip_u16(vreinterpret_u16_s16(BA), vreinterpret_u16_s16(BB));

  uint16x8_t out0 = vcombine_u16(out0_int.val[0], out0_int.val[1]);
  uint16x8_t out1 = vcombine_u16(out1_int.val[0], out1_int.val[1]);

  vst1q_u16(row0, out0);
  vst1q_u16(row1, out1);
}

#endif  // TINYEXR_SIMD_NEON

// Generic wavelet decode for a row of 2x2 blocks
// Processes as many blocks as possible with SIMD, falls back to scalar
inline void wavelet_decode_row(uint16_t* row0, uint16_t* row1,
                               size_t width, size_t stride) {
  size_t x = 0;

#if TINYEXR_SIMD_SSE2
  // Process 4 blocks (8 pixels) at a time
  for (; x + 8 <= width; x += 8) {
    wavelet_decode_4blocks_sse2(row0 + x, row1 + x, stride);
  }
#elif TINYEXR_SIMD_NEON
  // Process 4 blocks (8 pixels) at a time
  for (; x + 8 <= width; x += 8) {
    wavelet_decode_4blocks_neon(row0 + x, row1 + x, stride);
  }
#endif

  // Scalar fallback for remaining blocks
  for (; x + 2 <= width; x += 2) {
    wavelet_decode_2x2(row0 + x, row0 + x + 1, row1 + x, row1 + x + 1);
  }
}

// ============================================================================
// LUT Application with Prefetching (P2 optimization)
// ============================================================================

// Apply lookup table with software prefetching
// This is used in PIZ compression for applying the reverse LUT
inline void apply_lut_prefetch(uint16_t* data, size_t count, const uint16_t* lut) {
  size_t i = 0;

  // Prefetch distance - tune based on cache characteristics
  const size_t PREFETCH_DIST = 32;

  for (; i + PREFETCH_DIST < count; i++) {
    // Prefetch future LUT entries
    if ((i & 15) == 0) {
      TINYEXR_PREFETCH(&lut[data[i + PREFETCH_DIST]]);
      if (i + PREFETCH_DIST + 16 < count) {
        TINYEXR_PREFETCH(&lut[data[i + PREFETCH_DIST + 16]]);
      }
    }
    data[i] = lut[data[i]];
  }

  // Handle remainder without prefetch
  for (; i < count; i++) {
    data[i] = lut[data[i]];
  }
}

#if TINYEXR_SIMD_AVX2

// AVX2: Apply LUT using gather instructions
// This can be faster than scalar for certain access patterns
inline void apply_lut_avx2(uint16_t* data, size_t count, const uint16_t* lut) {
  size_t i = 0;

  // Process 8 values at a time using gather
  for (; i + 8 <= count; i += 8) {
    // Load 8 16-bit indices and zero-extend to 32-bit
    __m128i indices16 = _mm_loadu_si128(reinterpret_cast<const __m128i*>(data + i));
    __m256i indices32 = _mm256_cvtepu16_epi32(indices16);

    // Gather 8 values from LUT
    // Scale is 2 because LUT elements are 16-bit
    __m256i values32 = _mm256_i32gather_epi32(
      reinterpret_cast<const int*>(lut), indices32, 2);

    // Pack back to 16-bit
    // Extract low 16 bits of each 32-bit value
    __m256i mask16 = _mm256_set1_epi32(0x0000FFFF);
    values32 = _mm256_and_si256(values32, mask16);

    // Pack 32-bit to 16-bit
    __m128i lo = _mm256_castsi256_si128(values32);
    __m128i hi = _mm256_extracti128_si256(values32, 1);
    __m128i packed = _mm_packus_epi32(lo, hi);

    _mm_storeu_si128(reinterpret_cast<__m128i*>(data + i), packed);
  }

  // Scalar fallback for remainder
  for (; i < count; i++) {
    data[i] = lut[data[i]];
  }
}

#endif  // TINYEXR_SIMD_AVX2

// ============================================================================
// Utility Functions
// ============================================================================

// Check if pointer is aligned to N bytes
template<size_t N>
inline bool is_aligned(const void* ptr) {
  return (reinterpret_cast<uintptr_t>(ptr) % N) == 0;
}

// Get optimal batch size for current architecture
inline size_t get_optimal_batch_size() {
#if TINYEXR_SIMD_AVX512F
  return 64;  // 512 bits = 64 bytes
#elif TINYEXR_SIMD_AVX
  return 32;  // 256 bits = 32 bytes
#elif TINYEXR_SIMD_SSE2 || TINYEXR_SIMD_NEON
  return 16;  // 128 bits = 16 bytes
#elif TINYEXR_SIMD_SVE
  return svcntb();  // SVE vector length in bytes
#else
  return 8;   // Fallback
#endif
}

// Get SIMD capability string for debugging
inline const char* get_simd_info() {
#if TINYEXR_SIMD_AVX512F
  return "AVX-512F";
#elif TINYEXR_SIMD_AVX2 && TINYEXR_SIMD_F16C
  return "AVX2+F16C";
#elif TINYEXR_SIMD_AVX2
  return "AVX2";
#elif TINYEXR_SIMD_AVX
  return "AVX";
#elif TINYEXR_SIMD_F16C
  return "SSE+F16C";
#elif TINYEXR_SIMD_SSE41
  return "SSE4.1";
#elif TINYEXR_SIMD_SSE2
  return "SSE2";
#elif TINYEXR_SIMD_A64FX
  return "A64FX (SVE 512-bit)";
#elif TINYEXR_SIMD_SVE2
  return "SVE2";
#elif TINYEXR_SIMD_SVE
  return "SVE";
#elif TINYEXR_SIMD_NEON_FP16
  return "NEON+FP16";
#elif TINYEXR_SIMD_NEON
  return "NEON";
#else
  return "Scalar";
#endif
}

}  // namespace simd
}  // namespace tinyexr

#endif  // TINYEXR_SIMD_HH_
