// libdivide.h
// Copyright 2010 - 2018 ridiculous_fish
//
// libdivide is dual-licensed under the Boost or zlib licenses.
// You may use libdivide under the terms of either of these.
// See LICENSE.txt for more details.

#ifndef LIBDIVIDE_H
#define LIBDIVIDE_H

#if defined(_MSC_VER)
// disable warning C4146: unary minus operator applied to
// unsigned type, result still unsigned
#pragma warning(disable: 4146)
#define LIBDIVIDE_VC
#endif

#ifdef __cplusplus
#include <cstdlib>
#include <cstdio>
#else
#include <stdlib.h>
#include <stdio.h>
#endif

#include <stdint.h>

#if defined(LIBDIVIDE_USE_SSE2)
#include <emmintrin.h>
#endif

#if defined(LIBDIVIDE_VC)
#include <intrin.h>
#endif

#ifndef __has_builtin
#define __has_builtin(x) 0 // Compatibility with non-clang compilers.
#endif

#if defined(__SIZEOF_INT128__)
#define HAS_INT128_T
#endif

#if defined(__x86_64__) || defined(_WIN64) || defined(_M_X64)
#define LIBDIVIDE_IS_X86_64
#endif

#if defined(__i386__)
#define LIBDIVIDE_IS_i386
#endif

#if defined(__GNUC__) || defined(__clang__)
#define LIBDIVIDE_GCC_STYLE_ASM
#endif

#if defined(__cplusplus) || defined(LIBDIVIDE_VC)
#define LIBDIVIDE_FUNCTION __FUNCTION__
#else
#define LIBDIVIDE_FUNCTION __func__
#endif

#define LIBDIVIDE_ERROR(msg) \
    do { \
        fprintf(stderr, "libdivide.h:%d: %s(): Error: %s\n", \
            __LINE__, LIBDIVIDE_FUNCTION, msg); \
        exit(-1); \
    } while (0)

#if defined(LIBDIVIDE_ASSERTIONS_ON)
#define LIBDIVIDE_ASSERT(x) \
    do { \
        if (!(x)) { \
            fprintf(stderr, "libdivide.h:%d: %s(): Assertion failed: %s\n", \
                __LINE__, LIBDIVIDE_FUNCTION, #x); \
            exit(-1); \
        } \
    } while (0)
#else
#define LIBDIVIDE_ASSERT(x)
#endif

// libdivide may use the pmuldq (vector signed 32x32->64 mult instruction)
// which is in SSE 4.1. However, signed multiplication can be emulated
// efficiently with unsigned multiplication, and SSE 4.1 is currently rare, so
// it is OK to not turn this on.
#ifdef LIBDIVIDE_USE_SSE4_1
#include <smmintrin.h>
#endif

#ifdef __cplusplus
// We place libdivide within the libdivide namespace, and that goes in an
// anonymous namespace so that the functions are only visible to files that
// #include this header and don't get external linkage. At least that's the
// theory.
namespace {
namespace libdivide {
#endif

// Explanation of "more" field: bit 6 is whether to use shift path. If we are
// using the shift path, bit 7 is whether the divisor is negative in the signed
// case; in the unsigned case it is 0. Bits 0-4 is shift value (for shift
// path or mult path).  In 32 bit case, bit 5 is always 0. We use bit 7 as the
// "negative divisor indicator" so that we can use sign extension to
// efficiently go to a full-width -1.
//
// u32: [0-4] shift value
//      [5] ignored
//      [6] add indicator
//      [7] shift path
//
// s32: [0-4] shift value
//      [5] shift path
//      [6] add indicator
//      [7] indicates negative divisor
//
// u64: [0-5] shift value
//      [6] add indicator
//      [7] shift path
//
// s64: [0-5] shift value
//      [6] add indicator
//      [7] indicates negative divisor
//      magic number of 0 indicates shift path (we ran out of bits!)
//
// In s32 and s64 branchfree modes, the magic number is negated according to
// whether the divisor is negated. In branchfree strategy, it is not negated.

enum {
    LIBDIVIDE_32_SHIFT_MASK = 0x1F,
    LIBDIVIDE_64_SHIFT_MASK = 0x3F,
    LIBDIVIDE_ADD_MARKER = 0x40,
    LIBDIVIDE_U32_SHIFT_PATH = 0x80,
    LIBDIVIDE_U64_SHIFT_PATH = 0x80,
    LIBDIVIDE_S32_SHIFT_PATH = 0x20,
    LIBDIVIDE_NEGATIVE_DIVISOR = 0x80
};

// pack divider structs to prevent compilers from padding.
// This reduces memory usage by up to 43% when using a large
// array of libdivide dividers and improves performance
// by up to 10% because of reduced memory bandwidth.

// LWJGL: Disabled. For big divider arrays, magic & more can be
//        stored in separate arrays and reconstructed as needed.
//#pragma pack(push, 1)

struct libdivide_u32_t {
    uint32_t magic;
    uint8_t more;
};

struct libdivide_s32_t {
    int32_t magic;
    uint8_t more;
};

struct libdivide_u64_t {
    uint64_t magic;
    uint8_t more;
};

struct libdivide_s64_t {
    int64_t magic;
    uint8_t more;
};

struct libdivide_u32_branchfree_t {
    uint32_t magic;
    uint8_t more;
};

struct libdivide_s32_branchfree_t {
    int32_t magic;
    uint8_t more;
};

struct libdivide_u64_branchfree_t {
    uint64_t magic;
    uint8_t more;
};

struct libdivide_s64_branchfree_t {
    int64_t magic;
    uint8_t more;
};

//#pragma pack(pop)

#ifndef LIBDIVIDE_API
    #ifdef __cplusplus
        // In C++, we don't want our public functions to be static, because
        // they are arguments to templates and static functions can't do that.
        // They get internal linkage through virtue of the anonymous namespace.
        // In C, they should be static.
        #define LIBDIVIDE_API
    #else
        #define LIBDIVIDE_API static inline
    #endif
#endif

LIBDIVIDE_API struct libdivide_s32_t libdivide_s32_gen(int32_t y);
LIBDIVIDE_API struct libdivide_u32_t libdivide_u32_gen(uint32_t y);
LIBDIVIDE_API struct libdivide_s64_t libdivide_s64_gen(int64_t y);
LIBDIVIDE_API struct libdivide_u64_t libdivide_u64_gen(uint64_t y);

LIBDIVIDE_API struct libdivide_s32_branchfree_t libdivide_s32_branchfree_gen(int32_t y);
LIBDIVIDE_API struct libdivide_u32_branchfree_t libdivide_u32_branchfree_gen(uint32_t y);
LIBDIVIDE_API struct libdivide_s64_branchfree_t libdivide_s64_branchfree_gen(int64_t y);
LIBDIVIDE_API struct libdivide_u64_branchfree_t libdivide_u64_branchfree_gen(uint64_t y);

LIBDIVIDE_API int32_t  libdivide_s32_do(int32_t numer, const struct libdivide_s32_t *denom);
LIBDIVIDE_API uint32_t libdivide_u32_do(uint32_t numer, const struct libdivide_u32_t *denom);
LIBDIVIDE_API int64_t  libdivide_s64_do(int64_t numer, const struct libdivide_s64_t *denom);
LIBDIVIDE_API uint64_t libdivide_u64_do(uint64_t y, const struct libdivide_u64_t *denom);

LIBDIVIDE_API int32_t  libdivide_s32_branchfree_do(int32_t numer, const struct libdivide_s32_branchfree_t *denom);
LIBDIVIDE_API uint32_t libdivide_u32_branchfree_do(uint32_t numer, const struct libdivide_u32_branchfree_t *denom);
LIBDIVIDE_API int64_t  libdivide_s64_branchfree_do(int64_t numer, const struct libdivide_s64_branchfree_t *denom);
LIBDIVIDE_API uint64_t libdivide_u64_branchfree_do(uint64_t y, const struct libdivide_u64_branchfree_t *denom);

LIBDIVIDE_API int32_t  libdivide_s32_recover(const struct libdivide_s32_t *denom);
LIBDIVIDE_API uint32_t libdivide_u32_recover(const struct libdivide_u32_t *denom);
LIBDIVIDE_API int64_t  libdivide_s64_recover(const struct libdivide_s64_t *denom);
LIBDIVIDE_API uint64_t libdivide_u64_recover(const struct libdivide_u64_t *denom);

LIBDIVIDE_API int32_t  libdivide_s32_branchfree_recover(const struct libdivide_s32_branchfree_t *denom);
LIBDIVIDE_API uint32_t libdivide_u32_branchfree_recover(const struct libdivide_u32_branchfree_t *denom);
LIBDIVIDE_API int64_t  libdivide_s64_branchfree_recover(const struct libdivide_s64_branchfree_t *denom);
LIBDIVIDE_API uint64_t libdivide_u64_branchfree_recover(const struct libdivide_u64_branchfree_t *denom);

LIBDIVIDE_API int libdivide_u32_get_algorithm(const struct libdivide_u32_t *denom);
LIBDIVIDE_API uint32_t libdivide_u32_do_alg0(uint32_t numer, const struct libdivide_u32_t *denom);
LIBDIVIDE_API uint32_t libdivide_u32_do_alg1(uint32_t numer, const struct libdivide_u32_t *denom);
LIBDIVIDE_API uint32_t libdivide_u32_do_alg2(uint32_t numer, const struct libdivide_u32_t *denom);

LIBDIVIDE_API int libdivide_u64_get_algorithm(const struct libdivide_u64_t *denom);
LIBDIVIDE_API uint64_t libdivide_u64_do_alg0(uint64_t numer, const struct libdivide_u64_t *denom);
LIBDIVIDE_API uint64_t libdivide_u64_do_alg1(uint64_t numer, const struct libdivide_u64_t *denom);
LIBDIVIDE_API uint64_t libdivide_u64_do_alg2(uint64_t numer, const struct libdivide_u64_t *denom);

LIBDIVIDE_API int libdivide_s32_get_algorithm(const struct libdivide_s32_t *denom);
LIBDIVIDE_API int32_t libdivide_s32_do_alg0(int32_t numer, const struct libdivide_s32_t *denom);
LIBDIVIDE_API int32_t libdivide_s32_do_alg1(int32_t numer, const struct libdivide_s32_t *denom);
LIBDIVIDE_API int32_t libdivide_s32_do_alg2(int32_t numer, const struct libdivide_s32_t *denom);
LIBDIVIDE_API int32_t libdivide_s32_do_alg3(int32_t numer, const struct libdivide_s32_t *denom);
LIBDIVIDE_API int32_t libdivide_s32_do_alg4(int32_t numer, const struct libdivide_s32_t *denom);

LIBDIVIDE_API int libdivide_s64_get_algorithm(const struct libdivide_s64_t *denom);
LIBDIVIDE_API int64_t libdivide_s64_do_alg0(int64_t numer, const struct libdivide_s64_t *denom);
LIBDIVIDE_API int64_t libdivide_s64_do_alg1(int64_t numer, const struct libdivide_s64_t *denom);
LIBDIVIDE_API int64_t libdivide_s64_do_alg2(int64_t numer, const struct libdivide_s64_t *denom);
LIBDIVIDE_API int64_t libdivide_s64_do_alg3(int64_t numer, const struct libdivide_s64_t *denom);
LIBDIVIDE_API int64_t libdivide_s64_do_alg4(int64_t numer, const struct libdivide_s64_t *denom);

#if defined(LIBDIVIDE_USE_SSE2)

LIBDIVIDE_API __m128i libdivide_u32_do_vector(__m128i numers, const struct libdivide_u32_t *denom);
LIBDIVIDE_API __m128i libdivide_s32_do_vector(__m128i numers, const struct libdivide_s32_t *denom);
LIBDIVIDE_API __m128i libdivide_u64_do_vector(__m128i numers, const struct libdivide_u64_t *denom);
LIBDIVIDE_API __m128i libdivide_s64_do_vector(__m128i numers, const struct libdivide_s64_t *denom);

LIBDIVIDE_API __m128i libdivide_u32_do_vector_alg0(__m128i numers, const struct libdivide_u32_t *denom);
LIBDIVIDE_API __m128i libdivide_u32_do_vector_alg1(__m128i numers, const struct libdivide_u32_t *denom);
LIBDIVIDE_API __m128i libdivide_u32_do_vector_alg2(__m128i numers, const struct libdivide_u32_t *denom);

LIBDIVIDE_API __m128i libdivide_s32_do_vector_alg0(__m128i numers, const struct libdivide_s32_t *denom);
LIBDIVIDE_API __m128i libdivide_s32_do_vector_alg1(__m128i numers, const struct libdivide_s32_t *denom);
LIBDIVIDE_API __m128i libdivide_s32_do_vector_alg2(__m128i numers, const struct libdivide_s32_t *denom);
LIBDIVIDE_API __m128i libdivide_s32_do_vector_alg3(__m128i numers, const struct libdivide_s32_t *denom);
LIBDIVIDE_API __m128i libdivide_s32_do_vector_alg4(__m128i numers, const struct libdivide_s32_t *denom);

LIBDIVIDE_API __m128i libdivide_u64_do_vector_alg0(__m128i numers, const struct libdivide_u64_t *denom);
LIBDIVIDE_API __m128i libdivide_u64_do_vector_alg1(__m128i numers, const struct libdivide_u64_t *denom);
LIBDIVIDE_API __m128i libdivide_u64_do_vector_alg2(__m128i numers, const struct libdivide_u64_t *denom);

LIBDIVIDE_API __m128i libdivide_s64_do_vector_alg0(__m128i numers, const struct libdivide_s64_t *denom);
LIBDIVIDE_API __m128i libdivide_s64_do_vector_alg1(__m128i numers, const struct libdivide_s64_t *denom);
LIBDIVIDE_API __m128i libdivide_s64_do_vector_alg2(__m128i numers, const struct libdivide_s64_t *denom);
LIBDIVIDE_API __m128i libdivide_s64_do_vector_alg3(__m128i numers, const struct libdivide_s64_t *denom);
LIBDIVIDE_API __m128i libdivide_s64_do_vector_alg4(__m128i numers, const struct libdivide_s64_t *denom);

LIBDIVIDE_API __m128i libdivide_u32_branchfree_do_vector(__m128i numers, const struct libdivide_u32_branchfree_t *denom);
LIBDIVIDE_API __m128i libdivide_s32_branchfree_do_vector(__m128i numers, const struct libdivide_s32_branchfree_t *denom);
LIBDIVIDE_API __m128i libdivide_u64_branchfree_do_vector(__m128i numers, const struct libdivide_u64_branchfree_t *denom);
LIBDIVIDE_API __m128i libdivide_s64_branchfree_do_vector(__m128i numers, const struct libdivide_s64_branchfree_t *denom);

#endif

//////// Internal Utility Functions

static inline uint32_t libdivide__mullhi_u32(uint32_t x, uint32_t y) {
    uint64_t xl = x, yl = y;
    uint64_t rl = xl * yl;
    return (uint32_t)(rl >> 32);
}

static uint64_t libdivide__mullhi_u64(uint64_t x, uint64_t y) {
#if defined(LIBDIVIDE_VC) && defined(LIBDIVIDE_IS_X86_64)
    return __umulh(x, y);
#elif defined(HAS_INT128_T)
    __uint128_t xl = x, yl = y;
    __uint128_t rl = xl * yl;
    return (uint64_t)(rl >> 64);
#else
    // full 128 bits are x0 * y0 + (x0 * y1 << 32) + (x1 * y0 << 32) + (x1 * y1 << 64)
    uint32_t mask = 0xFFFFFFFF;
    uint32_t x0 = (uint32_t)(x & mask);
    uint32_t x1 = (uint32_t)(x >> 32);
    uint32_t y0 = (uint32_t)(y & mask);
    uint32_t y1 = (uint32_t)(y >> 32);
    uint32_t x0y0_hi = libdivide__mullhi_u32(x0, y0);
    uint64_t x0y1 = x0 * (uint64_t)y1;
    uint64_t x1y0 = x1 * (uint64_t)y0;
    uint64_t x1y1 = x1 * (uint64_t)y1;
    uint64_t temp = x1y0 + x0y0_hi;
    uint64_t temp_lo = temp & mask;
    uint64_t temp_hi = temp >> 32;

    return x1y1 + temp_hi + ((temp_lo + x0y1) >> 32);
#endif
}

static inline int64_t libdivide__mullhi_s64(int64_t x, int64_t y) {
#if defined(LIBDIVIDE_VC) && defined(LIBDIVIDE_IS_X86_64)
    return __mulh(x, y);
#elif defined(HAS_INT128_T)
    __int128_t xl = x, yl = y;
    __int128_t rl = xl * yl;
    return (int64_t)(rl >> 64);
#else
    // full 128 bits are x0 * y0 + (x0 * y1 << 32) + (x1 * y0 << 32) + (x1 * y1 << 64)
    uint32_t mask = 0xFFFFFFFF;
    uint32_t x0 = (uint32_t)(x & mask);
    uint32_t y0 = (uint32_t)(y & mask);
    int32_t x1 = (int32_t)(x >> 32);
    int32_t y1 = (int32_t)(y >> 32);
    uint32_t x0y0_hi = libdivide__mullhi_u32(x0, y0);
    int64_t t = x1 * (int64_t)y0 + x0y0_hi;
    int64_t w1 = x0 * (int64_t)y1 + (t & mask);

    return x1 * (int64_t)y1 + (t >> 32) + (w1 >> 32);
#endif
}

#if defined(LIBDIVIDE_USE_SSE2)

static inline __m128i libdivide__u64_to_m128(uint64_t x) {
#if defined(LIBDIVIDE_VC) && !defined(_WIN64)
    // 64 bit windows doesn't seem to have an implementation of any of these
    // load intrinsics, and 32 bit Visual C++ crashes
    _declspec(align(16)) uint64_t temp[2] = {x, x};
    return _mm_load_si128((const __m128i*)temp);
#else
    // everyone else gets it right
    return _mm_set1_epi64x(x);
#endif
}

static inline __m128i libdivide_get_FFFFFFFF00000000(void) {
    // returns the same as _mm_set1_epi64(0xFFFFFFFF00000000ULL)
    // without touching memory.
    // optimizes to pcmpeqd on OS X
    __m128i result = _mm_set1_epi8(-1);
    return _mm_slli_epi64(result, 32);
}

static inline __m128i libdivide_get_00000000FFFFFFFF(void) {
    // returns the same as _mm_set1_epi64(0x00000000FFFFFFFFULL)
    // without touching memory.
    // optimizes to pcmpeqd on OS X
    __m128i result = _mm_set1_epi8(-1);
    result = _mm_srli_epi64(result, 32);
    return result;
}

static inline __m128i libdivide_s64_signbits(__m128i v) {
    // we want to compute v >> 63, that is, _mm_srai_epi64(v, 63). But there
    // is no 64 bit shift right arithmetic instruction in SSE2. So we have to
    // fake it by first duplicating the high 32 bit values, and then using a 32
    // bit shift. Another option would be to use _mm_srli_epi64(v, 63) and
    // then subtract that from 0, but that approach appears to be substantially
    // slower for unknown reasons
    __m128i hiBitsDuped = _mm_shuffle_epi32(v, _MM_SHUFFLE(3, 3, 1, 1));
    __m128i signBits = _mm_srai_epi32(hiBitsDuped, 31);
    return signBits;
}

// Returns an __m128i whose low 32 bits are equal to amt and has zero elsewhere.
static inline __m128i libdivide_u32_to_m128i(uint32_t amt) {
    return _mm_set_epi32(0, 0, 0, amt);
}

static inline __m128i libdivide_s64_shift_right_vector(__m128i v, int amt) {
    // implementation of _mm_sra_epi64. Here we have two 64 bit values which
    // are shifted right to logically become (64 - amt) values, and are then
    // sign extended from a (64 - amt) bit number.
    const int b = 64 - amt;
    __m128i m = libdivide__u64_to_m128(1ULL << (b - 1));
    __m128i x = _mm_srl_epi64(v, libdivide_u32_to_m128i(amt));
    __m128i result = _mm_sub_epi64(_mm_xor_si128(x, m), m); // result = x^m - m
    return result;
}

// Here, b is assumed to contain one 32 bit value repeated four times.
// If it did not, the function would not work.
static inline __m128i libdivide__mullhi_u32_flat_vector(__m128i a, __m128i b) {
    __m128i hi_product_0Z2Z = _mm_srli_epi64(_mm_mul_epu32(a, b), 32);
    __m128i a1X3X = _mm_srli_epi64(a, 32);
    __m128i mask = libdivide_get_FFFFFFFF00000000();
    __m128i hi_product_Z1Z3 = _mm_and_si128(_mm_mul_epu32(a1X3X, b), mask);
    return _mm_or_si128(hi_product_0Z2Z, hi_product_Z1Z3); // = hi_product_0123
}

// Here, y is assumed to contain one 64 bit value repeated twice.
static inline __m128i libdivide_mullhi_u64_flat_vector(__m128i x, __m128i y) {
    // full 128 bits are x0 * y0 + (x0 * y1 << 32) + (x1 * y0 << 32) + (x1 * y1 << 64)
    __m128i mask = libdivide_get_00000000FFFFFFFF();
    // x0 is low half of 2 64 bit values, x1 is high half in low slots
    __m128i x0 = _mm_and_si128(x, mask);
    __m128i x1 = _mm_srli_epi64(x, 32);
    __m128i y0 = _mm_and_si128(y, mask);
    __m128i y1 = _mm_srli_epi64(y, 32);
    // x0 happens to have the low half of the two 64 bit values in 32 bit slots
    // 0 and 2, so _mm_mul_epu32 computes their full product, and then we shift
    // right by 32 to get just the high values
    __m128i x0y0_hi = _mm_srli_epi64(_mm_mul_epu32(x0, y0), 32);
    __m128i x0y1 = _mm_mul_epu32(x0, y1);
    __m128i x1y0 = _mm_mul_epu32(x1, y0);
    __m128i x1y1 = _mm_mul_epu32(x1, y1);
    __m128i temp = _mm_add_epi64(x1y0, x0y0_hi);
    __m128i temp_lo = _mm_and_si128(temp, mask);
    __m128i temp_hi = _mm_srli_epi64(temp, 32);
    temp_lo = _mm_srli_epi64(_mm_add_epi64(temp_lo, x0y1), 32);
    temp_hi = _mm_add_epi64(x1y1, temp_hi);

    return _mm_add_epi64(temp_lo, temp_hi);
}

// y is one 64 bit value repeated twice
static inline __m128i libdivide_mullhi_s64_flat_vector(__m128i x, __m128i y) {
    __m128i p = libdivide_mullhi_u64_flat_vector(x, y);
    __m128i t1 = _mm_and_si128(libdivide_s64_signbits(x), y);
    p = _mm_sub_epi64(p, t1);
    __m128i t2 = _mm_and_si128(libdivide_s64_signbits(y), x);
    p = _mm_sub_epi64(p, t2);
    return p;
}

#ifdef LIBDIVIDE_USE_SSE4_1

// b is one 32 bit value repeated four times.
static inline __m128i libdivide_mullhi_s32_flat_vector(__m128i a, __m128i b) {
    __m128i hi_product_0Z2Z = _mm_srli_epi64(_mm_mul_epi32(a, b), 32);
    __m128i a1X3X = _mm_srli_epi64(a, 32);
    __m128i mask = libdivide_get_FFFFFFFF00000000();
    __m128i hi_product_Z1Z3 = _mm_and_si128(_mm_mul_epi32(a1X3X, b), mask);
    return _mm_or_si128(hi_product_0Z2Z, hi_product_Z1Z3); // = hi_product_0123
}

#else

// SSE2 does not have a signed multiplication instruction, but we can convert
// unsigned to signed pretty efficiently. Again, b is just a 32 bit value
// repeated four times.
static inline __m128i libdivide_mullhi_s32_flat_vector(__m128i a, __m128i b) {
    __m128i p = libdivide__mullhi_u32_flat_vector(a, b);
    __m128i t1 = _mm_and_si128(_mm_srai_epi32(a, 31), b); // t1 = (a >> 31) & y, arithmetic shift
    __m128i t2 = _mm_and_si128(_mm_srai_epi32(b, 31), a);
    p = _mm_sub_epi32(p, t1);
    p = _mm_sub_epi32(p, t2);
    return p;
}

#endif // LIBDIVIDE_USE_SSE4_1

#endif // LIBDIVIDE_USE_SSE2

static inline int32_t libdivide__count_leading_zeros32(uint32_t val) {
#if defined(__GNUC__) || __has_builtin(__builtin_clz)
    // Fast way to count leading zeros
    return __builtin_clz(val);
#elif defined(LIBDIVIDE_VC)
    unsigned long result;
    if (_BitScanReverse(&result, val)) {
        return 31 - result;
    }
    return 0;
#else
  int32_t result = 0;
  uint32_t hi = 1U << 31;

  while (~val & hi) {
      hi >>= 1;
      result++;
  }
  return result;
#endif
}

static inline int32_t libdivide__count_leading_zeros64(uint64_t val) {
#if defined(__GNUC__) || __has_builtin(__builtin_clzll)
    // Fast way to count leading zeros
    return __builtin_clzll(val);
#elif defined(LIBDIVIDE_VC) && defined(_WIN64)
    unsigned long result;
    if (_BitScanReverse64(&result, val)) {
        return 63 - result;
    }
    return 0;
#else
    uint32_t hi = val >> 32;
    uint32_t lo = val & 0xFFFFFFFF;
    if (hi != 0) return libdivide__count_leading_zeros32(hi);
    return 32 + libdivide__count_leading_zeros32(lo);
#endif
}

#if (defined(LIBDIVIDE_IS_i386) || defined(LIBDIVIDE_IS_X86_64)) && \
     defined(LIBDIVIDE_GCC_STYLE_ASM)

// libdivide_64_div_32_to_32: divides a 64 bit uint {u1, u0} by a 32 bit
// uint {v}. The result must fit in 32 bits.
// Returns the quotient directly and the remainder in *r
static uint32_t libdivide_64_div_32_to_32(uint32_t u1, uint32_t u0, uint32_t v, uint32_t *r) {
    uint32_t result;
    __asm__("divl %[v]"
            : "=a"(result), "=d"(*r)
            : [v] "r"(v), "a"(u0), "d"(u1)
            );
    return result;
}

#else

static uint32_t libdivide_64_div_32_to_32(uint32_t u1, uint32_t u0, uint32_t v, uint32_t *r) {
    uint64_t n = (((uint64_t)u1) << 32) | u0;
    uint32_t result = (uint32_t)(n / v);
    *r = (uint32_t)(n - result * (uint64_t)v);
    return result;
}

#endif

#if defined(LIBDIVIDE_IS_X86_64) && \
    defined(LIBDIVIDE_GCC_STYLE_ASM)

static uint64_t libdivide_128_div_64_to_64(uint64_t u1, uint64_t u0, uint64_t v, uint64_t *r) {
    // u0 -> rax
    // u1 -> rdx
    // divq
    uint64_t result;
    __asm__("divq %[v]"
            : "=a"(result), "=d"(*r)
            : [v] "r"(v), "a"(u0), "d"(u1)
            );
    return result;
}

#else

// Code taken from Hacker's Delight:
// http://www.hackersdelight.org/HDcode/divlu.c.
// License permits inclusion here per:
// http://www.hackersdelight.org/permissions.htm

static uint64_t libdivide_128_div_64_to_64(uint64_t u1, uint64_t u0, uint64_t v, uint64_t *r) {
    const uint64_t b = (1ULL << 32); // Number base (16 bits)
    uint64_t un1, un0; // Norm. dividend LSD's
    uint64_t vn1, vn0; // Norm. divisor digits
    uint64_t q1, q0; // Quotient digits
    uint64_t un64, un21, un10; // Dividend digit pairs
    uint64_t rhat; // A remainder
    int32_t s; // Shift amount for norm

    // If overflow, set rem. to an impossible value,
    // and return the largest possible quotient
    if (u1 >= v) {
        if (r != NULL)
            *r = (uint64_t) -1;
        return (uint64_t) -1;
    }

    // count leading zeros
    s = libdivide__count_leading_zeros64(v);
    if (s > 0) {
        // Normalize divisor
        v = v << s;
        un64 = (u1 << s) | ((u0 >> (64 - s)) & (-s >> 31));
        un10 = u0 << s; // Shift dividend left
    } else {
        // Avoid undefined behavior
        un64 = u1 | u0;
        un10 = u0;
    }

    // Break divisor up into two 32-bit digits
    vn1 = v >> 32;
    vn0 = v & 0xFFFFFFFF;

    // Break right half of dividend into two digits
    un1 = un10 >> 32;
    un0 = un10 & 0xFFFFFFFF;

    // Compute the first quotient digit, q1
    q1 = un64 / vn1;
    rhat = un64 - q1 * vn1;

    while (q1 >= b || q1 * vn0 > b * rhat + un1) {
        q1 = q1 - 1;
        rhat = rhat + vn1;
        if (rhat >= b)
            break;
    }

     // Multiply and subtract
    un21 = un64 * b + un1 - q1 * v;

    // Compute the second quotient digit
    q0 = un21 / vn1;
    rhat = un21 - q0 * vn1;

    while (q0 >= b || q0 * vn0 > b * rhat + un0) {
        q0 = q0 - 1;
        rhat = rhat + vn1;
        if (rhat >= b)
            break;
    }

    // If remainder is wanted, return it
    if (r != NULL)
        *r = (un21 * b + un0 - q0 * v) >> s;

    return q1 * b + q0;
}

#endif

// Bitshift a u128 in place, left (signed_shift > 0) or right (signed_shift < 0)
static inline void libdivide_u128_shift(uint64_t *u1, uint64_t *u0, int32_t signed_shift)
{
    if (signed_shift > 0) {
        uint32_t shift = signed_shift;
        *u1 <<= shift;
        *u1 |= *u0 >> (64 - shift);
        *u0 <<= shift;
    } else {
        uint32_t shift = -signed_shift;
        *u0 >>= shift;
        *u0 |= *u1 << (64 - shift);
        *u1 >>= shift;
    }
}

// Computes a 128 / 128 -> 64 bit division, with a 128 bit remainder.
static uint64_t libdivide_128_div_128_to_64(uint64_t u_hi, uint64_t u_lo, uint64_t v_hi, uint64_t v_lo, uint64_t *r_hi, uint64_t *r_lo) {
#if defined(HAS_INT128_T)
    __uint128_t ufull = u_hi;
    __uint128_t vfull = v_hi;
    ufull = (ufull << 64) | u_lo;
    vfull = (vfull << 64) | v_lo;
    uint64_t res = (uint64_t)(ufull / vfull);
    __uint128_t remainder = ufull - (vfull * res);
    *r_lo = (uint64_t)remainder;
    *r_hi = (uint64_t)(remainder >> 64);
    return res;
#else
    // Adapted from "Unsigned Doubleword Division" in Hacker's Delight
    // We want to compute u / v
    typedef struct { uint64_t hi; uint64_t lo; } u128_t;
    u128_t u = {u_hi, u_lo};
    u128_t v = {v_hi, v_lo};

    if (v.hi == 0) {
        // divisor v is a 64 bit value, so we just need one 128/64 division
        // Note that we are simpler than Hacker's Delight here, because we know
        // the quotient fits in 64 bits whereas Hacker's Delight demands a full
        // 128 bit quotient
        *r_hi = 0;
        return libdivide_128_div_64_to_64(u.hi, u.lo, v.lo, r_lo);
    }
    // Here v >= 2**64
    // We know that v.hi != 0, so count leading zeros is OK
    // We have 0 <= n <= 63
    uint32_t n = libdivide__count_leading_zeros64(v.hi);

    // Normalize the divisor so its MSB is 1
    u128_t v1t = v;
    libdivide_u128_shift(&v1t.hi, &v1t.lo, n);
    uint64_t v1 = v1t.hi; // i.e. v1 = v1t >> 64

    // To ensure no overflow
    u128_t u1 = u;
    libdivide_u128_shift(&u1.hi, &u1.lo, -1);

    // Get quotient from divide unsigned insn.
    uint64_t rem_ignored;
    uint64_t q1 = libdivide_128_div_64_to_64(u1.hi, u1.lo, v1, &rem_ignored);

    // Undo normalization and division of u by 2.
    u128_t q0 = {0, q1};
    libdivide_u128_shift(&q0.hi, &q0.lo, n);
    libdivide_u128_shift(&q0.hi, &q0.lo, -63);

    // Make q0 correct or too small by 1
    // Equivalent to `if (q0 != 0) q0 = q0 - 1;`
    if (q0.hi != 0 || q0.lo != 0) {
        q0.hi -= (q0.lo == 0); // borrow
        q0.lo -= 1;
    }

    // Now q0 is correct.
    // Compute q0 * v as q0v
    // = (q0.hi << 64 + q0.lo) * (v.hi << 64 + v.lo)
    // = (q0.hi * v.hi << 128) + (q0.hi * v.lo << 64) +
    //   (q0.lo * v.hi <<  64) + q0.lo * v.lo)
    // Each term is 128 bit
    // High half of full product (upper 128 bits!) are dropped
    u128_t q0v = {0, 0};
    q0v.hi = q0.hi*v.lo + q0.lo*v.hi + libdivide__mullhi_u64(q0.lo, v.lo);
    q0v.lo = q0.lo*v.lo;

    // Compute u - q0v as u_q0v
    // This is the remainder
    u128_t u_q0v = u;
    u_q0v.hi -= q0v.hi + (u.lo < q0v.lo); // second term is borrow
    u_q0v.lo -= q0v.lo;

    // Check if u_q0v >= v
    // This checks if our remainder is larger than the divisor
    if ((u_q0v.hi > v.hi) ||
        (u_q0v.hi == v.hi && u_q0v.lo >= v.lo)) {
        // Increment q0
        q0.lo += 1;
        q0.hi += (q0.lo == 0); // carry

        // Subtract v from remainder
        u_q0v.hi -= v.hi + (u_q0v.lo < v.lo);
        u_q0v.lo -= v.lo;
    }

    *r_hi = u_q0v.hi;
    *r_lo = u_q0v.lo;

    LIBDIVIDE_ASSERT(q0.hi == 0);
    return q0.lo;
#endif
}

////////// UINT32

static inline struct libdivide_u32_t libdivide_internal_u32_gen(uint32_t d, int branchfree) {
    if (d == 0) {
        LIBDIVIDE_ERROR("divider must be != 0");
    }

    struct libdivide_u32_t result;
    uint32_t floor_log_2_d = 31 - libdivide__count_leading_zeros32(d);
    if ((d & (d - 1)) == 0) {
        // Power of 2
        if (! branchfree) {
            result.magic = 0;
            result.more = floor_log_2_d | LIBDIVIDE_U32_SHIFT_PATH;
        } else {
            // We want a magic number of 2**32 and a shift of floor_log_2_d
            // but one of the shifts is taken up by LIBDIVIDE_ADD_MARKER,
            // so we subtract 1 from the shift
            result.magic = 0;
            result.more = (floor_log_2_d-1) | LIBDIVIDE_ADD_MARKER;
        }
    } else {
        uint8_t more;
        uint32_t rem, proposed_m;
        proposed_m = libdivide_64_div_32_to_32(1U << floor_log_2_d, 0, d, &rem);

        LIBDIVIDE_ASSERT(rem > 0 && rem < d);
        const uint32_t e = d - rem;

        // This power works if e < 2**floor_log_2_d.
        if (!branchfree && (e < (1U << floor_log_2_d))) {
            // This power works
            more = floor_log_2_d;
        } else {
            // We have to use the general 33-bit algorithm.  We need to compute
            // (2**power) / d. However, we already have (2**(power-1))/d and
            // its remainder.  By doubling both, and then correcting the
            // remainder, we can compute the larger division.
            // don't care about overflow here - in fact, we expect it
            proposed_m += proposed_m;
            const uint32_t twice_rem = rem + rem;
            if (twice_rem >= d || twice_rem < rem) proposed_m += 1;
            more = floor_log_2_d | LIBDIVIDE_ADD_MARKER;
        }
        result.magic = 1 + proposed_m;
        result.more = more;
        // result.more's shift should in general be ceil_log_2_d. But if we
        // used the smaller power, we subtract one from the shift because we're
        // using the smaller power. If we're using the larger power, we
        // subtract one from the shift because it's taken care of by the add
        // indicator. So floor_log_2_d happens to be correct in both cases.
    }
    return result;
}

struct libdivide_u32_t libdivide_u32_gen(uint32_t d) {
    return libdivide_internal_u32_gen(d, 0);
}

struct libdivide_u32_branchfree_t libdivide_u32_branchfree_gen(uint32_t d) {
    if (d == 1) {
        LIBDIVIDE_ERROR("branchfree divider must be != 1");
    }
    struct libdivide_u32_t tmp = libdivide_internal_u32_gen(d, 1);
    struct libdivide_u32_branchfree_t ret = {tmp.magic, (uint8_t)(tmp.more & LIBDIVIDE_32_SHIFT_MASK)};
    return ret;
}

uint32_t libdivide_u32_do(uint32_t numer, const struct libdivide_u32_t *denom) {
    uint8_t more = denom->more;
    if (more & LIBDIVIDE_U32_SHIFT_PATH) {
        return numer >> (more & LIBDIVIDE_32_SHIFT_MASK);
    }
    else {
        uint32_t q = libdivide__mullhi_u32(denom->magic, numer);
        if (more & LIBDIVIDE_ADD_MARKER) {
            uint32_t t = ((numer - q) >> 1) + q;
            return t >> (more & LIBDIVIDE_32_SHIFT_MASK);
        }
        else {
            // all upper bits are 0 - don't need to mask them off
            return q >> more;
        }
    }
}

uint32_t libdivide_u32_recover(const struct libdivide_u32_t *denom) {
    uint8_t more = denom->more;
    uint8_t shift = more & LIBDIVIDE_32_SHIFT_MASK;
    if (more & LIBDIVIDE_U32_SHIFT_PATH) {
        return 1U << shift;
    } else if (!(more & LIBDIVIDE_ADD_MARKER)) {
        // We compute q = n/d = n*m / 2^(32 + shift)
        // Therefore we have d = 2^(32 + shift) / m
        // We need to ceil it.
        // We know d is not a power of 2, so m is not a power of 2,
        // so we can just add 1 to the floor
        uint32_t hi_dividend = 1U << shift;
        uint32_t rem_ignored;
        return 1 + libdivide_64_div_32_to_32(hi_dividend, 0, denom->magic, &rem_ignored);
    } else {
        // Here we wish to compute d = 2^(32+shift+1)/(m+2^32).
        // Notice (m + 2^32) is a 33 bit number. Use 64 bit division for now
        // Also note that shift may be as high as 31, so shift + 1 will
        // overflow. So we have to compute it as 2^(32+shift)/(m+2^32), and
        // then double the quotient and remainder.
        uint64_t half_n = 1ULL << (32 + shift);
        uint64_t d = (1ULL << 32) | denom->magic;
        // Note that the quotient is guaranteed <= 32 bits, but the remainder
        // may need 33!
        uint32_t half_q = (uint32_t)(half_n / d);
        uint64_t rem = half_n % d;
        // We computed 2^(32+shift)/(m+2^32)
        // Need to double it, and then add 1 to the quotient if doubling th
        // remainder would increase the quotient.
        // Note that rem<<1 cannot overflow, since rem < d and d is 33 bits
        uint32_t full_q = half_q + half_q + ((rem<<1) >= d);

        // We rounded down in gen unless we're a power of 2 (i.e. in branchfree case)
        // We can detect that by looking at m. If m zero, we're a power of 2
        return full_q + (denom->magic != 0);
    }
}

uint32_t libdivide_u32_branchfree_recover(const struct libdivide_u32_branchfree_t *denom) {
    struct libdivide_u32_t denom_u32 = {denom->magic, (uint8_t)(denom->more | LIBDIVIDE_ADD_MARKER)};
    return libdivide_u32_recover(&denom_u32);
}

int libdivide_u32_get_algorithm(const struct libdivide_u32_t *denom) {
    uint8_t more = denom->more;
    if (more & LIBDIVIDE_U32_SHIFT_PATH) return 0;
    else if (!(more & LIBDIVIDE_ADD_MARKER)) return 1;
    else return 2;
}

uint32_t libdivide_u32_do_alg0(uint32_t numer, const struct libdivide_u32_t *denom) {
    return numer >> (denom->more & LIBDIVIDE_32_SHIFT_MASK);
}

uint32_t libdivide_u32_do_alg1(uint32_t numer, const struct libdivide_u32_t *denom) {
    uint32_t q = libdivide__mullhi_u32(denom->magic, numer);
    return q >> denom->more;
}

uint32_t libdivide_u32_do_alg2(uint32_t numer, const struct libdivide_u32_t *denom) {
    // denom->add != 0
    uint32_t q = libdivide__mullhi_u32(denom->magic, numer);
    uint32_t t = ((numer - q) >> 1) + q;
    // Note that this mask is typically free. Only the low bits are meaningful
    // to a shift, so compilers can optimize out this AND.
    return t >> (denom->more & LIBDIVIDE_32_SHIFT_MASK);
}

// same as algo 2
uint32_t libdivide_u32_branchfree_do(uint32_t numer, const struct libdivide_u32_branchfree_t *denom) {
    uint32_t q = libdivide__mullhi_u32(denom->magic, numer);
    uint32_t t = ((numer - q) >> 1) + q;
    return t >> denom->more;
}

#if defined(LIBDIVIDE_USE_SSE2)

__m128i libdivide_u32_do_vector(__m128i numers, const struct libdivide_u32_t *denom) {
    uint8_t more = denom->more;
    if (more & LIBDIVIDE_U32_SHIFT_PATH) {
        return _mm_srl_epi32(numers, libdivide_u32_to_m128i(more & LIBDIVIDE_32_SHIFT_MASK));
    }
    else {
        __m128i q = libdivide__mullhi_u32_flat_vector(numers, _mm_set1_epi32(denom->magic));
        if (more & LIBDIVIDE_ADD_MARKER) {
            // uint32_t t = ((numer - q) >> 1) + q;
            // return t >> denom->shift;
            __m128i t = _mm_add_epi32(_mm_srli_epi32(_mm_sub_epi32(numers, q), 1), q);
            return _mm_srl_epi32(t, libdivide_u32_to_m128i(more & LIBDIVIDE_32_SHIFT_MASK));

        }
        else {
            // q >> denom->shift
            return _mm_srl_epi32(q, libdivide_u32_to_m128i(more));
        }
    }
}

__m128i libdivide_u32_do_vector_alg0(__m128i numers, const struct libdivide_u32_t *denom) {
    return _mm_srl_epi32(numers, libdivide_u32_to_m128i(denom->more & LIBDIVIDE_32_SHIFT_MASK));
}

__m128i libdivide_u32_do_vector_alg1(__m128i numers, const struct libdivide_u32_t *denom) {
    __m128i q = libdivide__mullhi_u32_flat_vector(numers, _mm_set1_epi32(denom->magic));
    return _mm_srl_epi32(q, libdivide_u32_to_m128i(denom->more));
}

__m128i libdivide_u32_do_vector_alg2(__m128i numers, const struct libdivide_u32_t *denom) {
    __m128i q = libdivide__mullhi_u32_flat_vector(numers, _mm_set1_epi32(denom->magic));
    __m128i t = _mm_add_epi32(_mm_srli_epi32(_mm_sub_epi32(numers, q), 1), q);
    return _mm_srl_epi32(t, libdivide_u32_to_m128i(denom->more & LIBDIVIDE_32_SHIFT_MASK));
}

// same as algo 2
LIBDIVIDE_API __m128i libdivide_u32_branchfree_do_vector(__m128i numers, const struct libdivide_u32_branchfree_t *denom) {
    __m128i q = libdivide__mullhi_u32_flat_vector(numers, _mm_set1_epi32(denom->magic));
    __m128i t = _mm_add_epi32(_mm_srli_epi32(_mm_sub_epi32(numers, q), 1), q);
    return _mm_srl_epi32(t, libdivide_u32_to_m128i(denom->more));
}

#endif

/////////// UINT64

static inline struct libdivide_u64_t libdivide_internal_u64_gen(uint64_t d, int branchfree) {
    if (d == 0) {
        LIBDIVIDE_ERROR("divider must be != 0");
    }

    struct libdivide_u64_t result;
    uint32_t floor_log_2_d = 63 - libdivide__count_leading_zeros64(d);
    if ((d & (d - 1)) == 0) {
        // Power of 2
        if (! branchfree) {
            result.magic = 0;
            result.more = floor_log_2_d | LIBDIVIDE_U64_SHIFT_PATH;
        } else {
            // We want a magic number of 2**64 and a shift of floor_log_2_d
            // but one of the shifts is taken up by LIBDIVIDE_ADD_MARKER,
            // so we subtract 1 from the shift
            result.magic = 0;
            result.more = (floor_log_2_d-1) | LIBDIVIDE_ADD_MARKER;
        }
    } else {
        uint64_t proposed_m, rem;
        uint8_t more;
        // (1 << (64 + floor_log_2_d)) / d
        proposed_m = libdivide_128_div_64_to_64(1ULL << floor_log_2_d, 0, d, &rem);

        LIBDIVIDE_ASSERT(rem > 0 && rem < d);
        const uint64_t e = d - rem;

        // This power works if e < 2**floor_log_2_d.
        if (!branchfree && e < (1ULL << floor_log_2_d)) {
            // This power works
            more = floor_log_2_d;
        } else {
            // We have to use the general 65-bit algorithm.  We need to compute
            // (2**power) / d. However, we already have (2**(power-1))/d and
            // its remainder. By doubling both, and then correcting the
            // remainder, we can compute the larger division.
            // don't care about overflow here - in fact, we expect it
            proposed_m += proposed_m;
            const uint64_t twice_rem = rem + rem;
            if (twice_rem >= d || twice_rem < rem) proposed_m += 1;
                more = floor_log_2_d | LIBDIVIDE_ADD_MARKER;
        }
        result.magic = 1 + proposed_m;
        result.more = more;
        // result.more's shift should in general be ceil_log_2_d. But if we
        // used the smaller power, we subtract one from the shift because we're
        // using the smaller power. If we're using the larger power, we
        // subtract one from the shift because it's taken care of by the add
        // indicator. So floor_log_2_d happens to be correct in both cases,
        // which is why we do it outside of the if statement.
    }
    return result;
}

struct libdivide_u64_t libdivide_u64_gen(uint64_t d) {
    return libdivide_internal_u64_gen(d, 0);
}

struct libdivide_u64_branchfree_t libdivide_u64_branchfree_gen(uint64_t d) {
    if (d == 1) {
        LIBDIVIDE_ERROR("branchfree divider must be != 1");
    }
    struct libdivide_u64_t tmp = libdivide_internal_u64_gen(d, 1);
    struct libdivide_u64_branchfree_t ret = {tmp.magic, (uint8_t)(tmp.more & LIBDIVIDE_64_SHIFT_MASK)};
    return ret;
}

uint64_t libdivide_u64_do(uint64_t numer, const struct libdivide_u64_t *denom) {
    uint8_t more = denom->more;
    if (more & LIBDIVIDE_U64_SHIFT_PATH) {
        return numer >> (more & LIBDIVIDE_64_SHIFT_MASK);
    }
    else {
        uint64_t q = libdivide__mullhi_u64(denom->magic, numer);
        if (more & LIBDIVIDE_ADD_MARKER) {
            uint64_t t = ((numer - q) >> 1) + q;
            return t >> (more & LIBDIVIDE_64_SHIFT_MASK);
        }
        else {
             // all upper bits are 0 - don't need to mask them off
            return q >> more;
        }
    }
}

uint64_t libdivide_u64_recover(const struct libdivide_u64_t *denom) {
    uint8_t more = denom->more;
    uint8_t shift = more & LIBDIVIDE_64_SHIFT_MASK;
    if (more & LIBDIVIDE_U64_SHIFT_PATH) {
        return 1ULL << shift;
    } else if (!(more & LIBDIVIDE_ADD_MARKER)) {
        // We compute q = n/d = n*m / 2^(64 + shift)
        // Therefore we have d = 2^(64 + shift) / m
        // We need to ceil it.
        // We know d is not a power of 2, so m is not a power of 2,
        // so we can just add 1 to the floor
        uint64_t hi_dividend = 1ULL << shift;
        uint64_t rem_ignored;
        return 1 + libdivide_128_div_64_to_64(hi_dividend, 0, denom->magic, &rem_ignored);
    } else {
        // Here we wish to compute d = 2^(64+shift+1)/(m+2^64).
        // Notice (m + 2^64) is a 65 bit number. This gets hairy. See
        // libdivide_u32_recover for more on what we do here.
        // TODO: do something better than 128 bit math

        // Hack: if d is not a power of 2, this is a 128/128->64 divide
        // If d is a power of 2, this may be a bigger divide
        // However we can optimize that easily
        if (denom->magic == 0) {
            // 2^(64 + shift + 1) / (2^64) == 2^(shift + 1)
            return 1ULL << (shift + 1);
        }

        // Full n is a (potentially) 129 bit value
        // half_n is a 128 bit value
        // Compute the hi half of half_n. Low half is 0.
        uint64_t half_n_hi = 1ULL << shift, half_n_lo = 0;
        // d is a 65 bit value. The high bit is always set to 1.
        const uint64_t d_hi = 1, d_lo = denom->magic;
        // Note that the quotient is guaranteed <= 64 bits,
        // but the remainder may need 65!
        uint64_t r_hi, r_lo;
        uint64_t half_q = libdivide_128_div_128_to_64(half_n_hi, half_n_lo, d_hi, d_lo, &r_hi, &r_lo);
        // We computed 2^(64+shift)/(m+2^64)
        // Double the remainder ('dr') and check if that is larger than d
        // Note that d is a 65 bit value, so r1 is small and so r1 + r1 cannot
        // overflow
        uint64_t dr_lo = r_lo + r_lo;
        uint64_t dr_hi = r_hi + r_hi + (dr_lo < r_lo); // last term is carry
        int dr_exceeds_d = (dr_hi > d_hi) || (dr_hi == d_hi && dr_lo >= d_lo);
        uint64_t full_q = half_q + half_q + (dr_exceeds_d ? 1 : 0);
        return full_q + 1;
    }
}

uint64_t libdivide_u64_branchfree_recover(const struct libdivide_u64_branchfree_t *denom) {
    struct libdivide_u64_t denom_u64 = {denom->magic, (uint8_t)(denom->more | LIBDIVIDE_ADD_MARKER)};
    return libdivide_u64_recover(&denom_u64);
}

int libdivide_u64_get_algorithm(const struct libdivide_u64_t *denom) {
    uint8_t more = denom->more;
    if (more & LIBDIVIDE_U64_SHIFT_PATH) return 0;
    else if (!(more & LIBDIVIDE_ADD_MARKER)) return 1;
    else return 2;
}

uint64_t libdivide_u64_do_alg0(uint64_t numer, const struct libdivide_u64_t *denom) {
    return numer >> (denom->more & LIBDIVIDE_64_SHIFT_MASK);
}

uint64_t libdivide_u64_do_alg1(uint64_t numer, const struct libdivide_u64_t *denom) {
    uint64_t q = libdivide__mullhi_u64(denom->magic, numer);
    return q >> denom->more;
}

uint64_t libdivide_u64_do_alg2(uint64_t numer, const struct libdivide_u64_t *denom) {
    uint64_t q = libdivide__mullhi_u64(denom->magic, numer);
    uint64_t t = ((numer - q) >> 1) + q;
    return t >> (denom->more & LIBDIVIDE_64_SHIFT_MASK);
}

// same as alg 2
uint64_t libdivide_u64_branchfree_do(uint64_t numer, const struct libdivide_u64_branchfree_t *denom) {
    uint64_t q = libdivide__mullhi_u64(denom->magic, numer);
    uint64_t t = ((numer - q) >> 1) + q;
    return t >> denom->more;
}

#if defined(LIBDIVIDE_USE_SSE2)

__m128i libdivide_u64_do_vector(__m128i numers, const struct libdivide_u64_t *denom) {
    uint8_t more = denom->more;
    if (more & LIBDIVIDE_U64_SHIFT_PATH) {
        return _mm_srl_epi64(numers, libdivide_u32_to_m128i(more & LIBDIVIDE_64_SHIFT_MASK));
    }
    else {
        __m128i q = libdivide_mullhi_u64_flat_vector(numers, libdivide__u64_to_m128(denom->magic));
        if (more & LIBDIVIDE_ADD_MARKER) {
            // uint32_t t = ((numer - q) >> 1) + q;
            // return t >> denom->shift;
            __m128i t = _mm_add_epi64(_mm_srli_epi64(_mm_sub_epi64(numers, q), 1), q);
            return _mm_srl_epi64(t, libdivide_u32_to_m128i(more & LIBDIVIDE_64_SHIFT_MASK));
        }
        else {
            // q >> denom->shift
            return _mm_srl_epi64(q, libdivide_u32_to_m128i(more));
        }
    }
}

__m128i libdivide_u64_do_vector_alg0(__m128i numers, const struct libdivide_u64_t *denom) {
    return _mm_srl_epi64(numers, libdivide_u32_to_m128i(denom->more & LIBDIVIDE_64_SHIFT_MASK));
}

__m128i libdivide_u64_do_vector_alg1(__m128i numers, const struct libdivide_u64_t *denom) {
    __m128i q = libdivide_mullhi_u64_flat_vector(numers, libdivide__u64_to_m128(denom->magic));
    return _mm_srl_epi64(q, libdivide_u32_to_m128i(denom->more));
}

__m128i libdivide_u64_do_vector_alg2(__m128i numers, const struct libdivide_u64_t *denom) {
    __m128i q = libdivide_mullhi_u64_flat_vector(numers, libdivide__u64_to_m128(denom->magic));
    __m128i t = _mm_add_epi64(_mm_srli_epi64(_mm_sub_epi64(numers, q), 1), q);
    return _mm_srl_epi64(t, libdivide_u32_to_m128i(denom->more & LIBDIVIDE_64_SHIFT_MASK));
}

__m128i libdivide_u64_branchfree_do_vector(__m128i numers, const struct libdivide_u64_branchfree_t *denom) {
    __m128i q = libdivide_mullhi_u64_flat_vector(numers, libdivide__u64_to_m128(denom->magic));
    __m128i t = _mm_add_epi64(_mm_srli_epi64(_mm_sub_epi64(numers, q), 1), q);
    return _mm_srl_epi64(t, libdivide_u32_to_m128i(denom->more));
}

#endif

/////////// SINT32

static inline int32_t libdivide__mullhi_s32(int32_t x, int32_t y) {
    int64_t xl = x, yl = y;
    int64_t rl = xl * yl;
    // needs to be arithmetic shift
    return (int32_t)(rl >> 32);
}

static inline struct libdivide_s32_t libdivide_internal_s32_gen(int32_t d, int branchfree) {
    if (d == 0) {
        LIBDIVIDE_ERROR("divider must be != 0");
    }

    struct libdivide_s32_t result;

    // If d is a power of 2, or negative a power of 2, we have to use a shift.
    // This is especially important because the magic algorithm fails for -1.
    // To check if d is a power of 2 or its inverse, it suffices to check
    // whether its absolute value has exactly one bit set. This works even for
    // INT_MIN, because abs(INT_MIN) == INT_MIN, and INT_MIN has one bit set
    // and is a power of 2.
    uint32_t ud = (uint32_t)d;
    uint32_t absD = (d < 0) ? -ud : ud;
    uint32_t floor_log_2_d = 31 - libdivide__count_leading_zeros32(absD);
    // check if exactly one bit is set,
    // don't care if absD is 0 since that's divide by zero
    if ((absD & (absD - 1)) == 0) {
        // Branchfree and normal paths are exactly the same
        result.magic = 0;
        result.more = floor_log_2_d | (d < 0 ? LIBDIVIDE_NEGATIVE_DIVISOR : 0) | LIBDIVIDE_S32_SHIFT_PATH;
    } else {
        LIBDIVIDE_ASSERT(floor_log_2_d >= 1);

        uint8_t more;
        // the dividend here is 2**(floor_log_2_d + 31), so the low 32 bit word
        // is 0 and the high word is floor_log_2_d - 1
        uint32_t rem, proposed_m;
        proposed_m = libdivide_64_div_32_to_32(1U << (floor_log_2_d - 1), 0, absD, &rem);
        const uint32_t e = absD - rem;

        // We are going to start with a power of floor_log_2_d - 1.
        // This works if works if e < 2**floor_log_2_d.
        if (!branchfree && e < (1U << floor_log_2_d)) {
            // This power works
            more = floor_log_2_d - 1;
        } else {
            // We need to go one higher. This should not make proposed_m
            // overflow, but it will make it negative when interpreted as an
            // int32_t.
            proposed_m += proposed_m;
            const uint32_t twice_rem = rem + rem;
            if (twice_rem >= absD || twice_rem < rem) proposed_m += 1;
            more = floor_log_2_d | LIBDIVIDE_ADD_MARKER;
        }

        proposed_m += 1;
        int32_t magic = (int32_t)proposed_m;

        // Mark if we are negative. Note we only negate the magic number in the
        // branchfull case.
        if (d < 0) {
            more |= LIBDIVIDE_NEGATIVE_DIVISOR;
            if (!branchfree) {
                magic = -magic;
            }
        }

        result.more = more;
        result.magic = magic;
    }
    return result;
}

LIBDIVIDE_API struct libdivide_s32_t libdivide_s32_gen(int32_t d) {
    return libdivide_internal_s32_gen(d, 0);
}

LIBDIVIDE_API struct libdivide_s32_branchfree_t libdivide_s32_branchfree_gen(int32_t d) {
    if (d == 1) {
        LIBDIVIDE_ERROR("branchfree divider must be != 1");
    }
    if (d == -1) {
        LIBDIVIDE_ERROR("branchfree divider must be != -1");
    }
    struct libdivide_s32_t tmp = libdivide_internal_s32_gen(d, 1);
    struct libdivide_s32_branchfree_t result = {tmp.magic, tmp.more};
    return result;
}

int32_t libdivide_s32_do(int32_t numer, const struct libdivide_s32_t *denom) {
    uint8_t more = denom->more;
    if (more & LIBDIVIDE_S32_SHIFT_PATH) {
        uint32_t sign = (int8_t)more >> 7;
        uint8_t shifter = more & LIBDIVIDE_32_SHIFT_MASK;
        uint32_t uq = (uint32_t)(numer + ((numer >> 31) & ((1U << shifter) - 1)));
        int32_t q = (int32_t)uq;
        q = q >> shifter;
        q = (q ^ sign) - sign;
        return q;
    } else {
        uint32_t uq = (uint32_t)libdivide__mullhi_s32(denom->magic, numer);
        if (more & LIBDIVIDE_ADD_MARKER) {
            // must be arithmetic shift and then sign extend
            int32_t sign = (int8_t)more >> 7;
            // q += (more < 0 ? -numer : numer), casts to avoid UB
            uq += ((uint32_t)numer ^ sign) - sign;
        }
        int32_t q = (int32_t)uq;
        q >>= more & LIBDIVIDE_32_SHIFT_MASK;
        q += (q < 0);
        return q;
    }
}

int32_t libdivide_s32_branchfree_do(int32_t numer, const struct libdivide_s32_branchfree_t *denom) {
    uint8_t more = denom->more;
    uint8_t shift = more & LIBDIVIDE_32_SHIFT_MASK;
    // must be arithmetic shift and then sign extend
    int32_t sign = (int8_t)more >> 7;
    int32_t magic = denom->magic;
    int32_t q = libdivide__mullhi_s32(magic, numer);
    q += numer;

    // If q is non-negative, we have nothing to do
    // If q is negative, we want to add either (2**shift)-1 if d is a power of
    // 2, or (2**shift) if it is not a power of 2
    uint32_t is_power_of_2 = !!(more & LIBDIVIDE_S32_SHIFT_PATH);
    uint32_t q_sign = (uint32_t)(q >> 31);
    q += q_sign & ((1 << shift) - is_power_of_2);

    // Now arithmetic right shift
    q >>= shift;

    // Negate if needed
    q = (q ^ sign) - sign;

    return q;
}

int32_t libdivide_s32_recover(const struct libdivide_s32_t *denom) {
    uint8_t more = denom->more;
    uint8_t shift = more & LIBDIVIDE_32_SHIFT_MASK;
    if (more & LIBDIVIDE_S32_SHIFT_PATH) {
        uint32_t absD = 1U << shift;
        if (more & LIBDIVIDE_NEGATIVE_DIVISOR) {
            absD = -absD;
        }
        return (int32_t)absD;
    } else {
        // Unsigned math is much easier
        // We negate the magic number only in the branchfull case, and we don't
        // know which case we're in. However we have enough information to
        // determine the correct sign of the magic number. The divisor was
        // negative if LIBDIVIDE_NEGATIVE_DIVISOR is set. If ADD_MARKER is set,
        // the magic number's sign is opposite that of the divisor.
        // We want to compute the positive magic number.
        int negative_divisor = (more & LIBDIVIDE_NEGATIVE_DIVISOR);
        int magic_was_negated = (more & LIBDIVIDE_ADD_MARKER)
            ? denom->magic > 0 : denom->magic < 0;

        // Handle the power of 2 case (including branchfree)
        if (denom->magic == 0) {
            int32_t result = 1 << shift;
            return negative_divisor ? -result : result;
        }

        uint32_t d = (uint32_t)(magic_was_negated ? -denom->magic : denom->magic);
        uint64_t n = 1ULL << (32 + shift); // this shift cannot exceed 30
        uint32_t q = (uint32_t)(n / d);
        int32_t result = (int32_t)q;
        result += 1;
        return negative_divisor ? -result : result;
    }
}

int32_t libdivide_s32_branchfree_recover(const struct libdivide_s32_branchfree_t *denom) {
    return libdivide_s32_recover((const struct libdivide_s32_t *)denom);
}

int libdivide_s32_get_algorithm(const struct libdivide_s32_t *denom) {
    uint8_t more = denom->more;
    int positiveDivisor = !(more & LIBDIVIDE_NEGATIVE_DIVISOR);
    if (more & LIBDIVIDE_S32_SHIFT_PATH) return (positiveDivisor ? 0 : 1);
    else if (more & LIBDIVIDE_ADD_MARKER) return (positiveDivisor ? 2 : 3);
    else return 4;
}

int32_t libdivide_s32_do_alg0(int32_t numer, const struct libdivide_s32_t *denom) {
    uint8_t shifter = denom->more & LIBDIVIDE_32_SHIFT_MASK;
    int32_t q = numer + ((numer >> 31) & ((1U << shifter) - 1));
    return q >> shifter;
}

int32_t libdivide_s32_do_alg1(int32_t numer, const struct libdivide_s32_t *denom) {
    uint8_t shifter = denom->more & LIBDIVIDE_32_SHIFT_MASK;
    int32_t q = numer + ((numer >> 31) & ((1U << shifter) - 1));
    return - (q >> shifter);
}

int32_t libdivide_s32_do_alg2(int32_t numer, const struct libdivide_s32_t *denom) {
    int32_t q = libdivide__mullhi_s32(denom->magic, numer);
    q += numer;
    q >>= denom->more & LIBDIVIDE_32_SHIFT_MASK;
    q += (q < 0);
    return q;
}

int32_t libdivide_s32_do_alg3(int32_t numer, const struct libdivide_s32_t *denom) {
    int32_t q = libdivide__mullhi_s32(denom->magic, numer);
    q -= numer;
    q >>= denom->more & LIBDIVIDE_32_SHIFT_MASK;
    q += (q < 0);
    return q;
}

int32_t libdivide_s32_do_alg4(int32_t numer, const struct libdivide_s32_t *denom) {
    int32_t q = libdivide__mullhi_s32(denom->magic, numer);
    q >>= denom->more & LIBDIVIDE_32_SHIFT_MASK;
    q += (q < 0);
    return q;
}

#if defined(LIBDIVIDE_USE_SSE2)

__m128i libdivide_s32_do_vector(__m128i numers, const struct libdivide_s32_t *denom) {
    uint8_t more = denom->more;
    if (more & LIBDIVIDE_S32_SHIFT_PATH) {
        uint32_t shifter = more & LIBDIVIDE_32_SHIFT_MASK;
        __m128i roundToZeroTweak = _mm_set1_epi32((1U << shifter) - 1); // could use _mm_srli_epi32 with an all -1 register
        __m128i q = _mm_add_epi32(numers, _mm_and_si128(_mm_srai_epi32(numers, 31), roundToZeroTweak)); //q = numer + ((numer >> 31) & roundToZeroTweak);
        q = _mm_sra_epi32(q, libdivide_u32_to_m128i(shifter)); // q = q >> shifter
        __m128i shiftMask = _mm_set1_epi32((int32_t)((int8_t)more >> 7)); // set all bits of shift mask = to the sign bit of more
        q = _mm_sub_epi32(_mm_xor_si128(q, shiftMask), shiftMask); // q = (q ^ shiftMask) - shiftMask;
        return q;
    }
    else {
        __m128i q = libdivide_mullhi_s32_flat_vector(numers, _mm_set1_epi32(denom->magic));
        if (more & LIBDIVIDE_ADD_MARKER) {
            __m128i sign = _mm_set1_epi32((int32_t)(int8_t)more >> 7); // must be arithmetic shift
            q = _mm_add_epi32(q, _mm_sub_epi32(_mm_xor_si128(numers, sign), sign)); // q += ((numer ^ sign) - sign);
        }
        q = _mm_sra_epi32(q, libdivide_u32_to_m128i(more & LIBDIVIDE_32_SHIFT_MASK)); // q >>= shift
        q = _mm_add_epi32(q, _mm_srli_epi32(q, 31)); // q += (q < 0)
        return q;
    }
}

__m128i libdivide_s32_do_vector_alg0(__m128i numers, const struct libdivide_s32_t *denom) {
    uint8_t shifter = denom->more & LIBDIVIDE_32_SHIFT_MASK;
    __m128i roundToZeroTweak = _mm_set1_epi32((1U << shifter) - 1);
    __m128i q = _mm_add_epi32(numers, _mm_and_si128(_mm_srai_epi32(numers, 31), roundToZeroTweak));
    return _mm_sra_epi32(q, libdivide_u32_to_m128i(shifter));
}

__m128i libdivide_s32_do_vector_alg1(__m128i numers, const struct libdivide_s32_t *denom) {
    uint8_t shifter = denom->more & LIBDIVIDE_32_SHIFT_MASK;
    __m128i roundToZeroTweak = _mm_set1_epi32((1U << shifter) - 1);
    __m128i q = _mm_add_epi32(numers, _mm_and_si128(_mm_srai_epi32(numers, 31), roundToZeroTweak));
    return _mm_sub_epi32(_mm_setzero_si128(), _mm_sra_epi32(q, libdivide_u32_to_m128i(shifter)));
}

__m128i libdivide_s32_do_vector_alg2(__m128i numers, const struct libdivide_s32_t *denom) {
    __m128i q = libdivide_mullhi_s32_flat_vector(numers, _mm_set1_epi32(denom->magic));
    q = _mm_add_epi32(q, numers);
    q = _mm_sra_epi32(q, libdivide_u32_to_m128i(denom->more & LIBDIVIDE_32_SHIFT_MASK));
    q = _mm_add_epi32(q, _mm_srli_epi32(q, 31));
    return q;
}

__m128i libdivide_s32_do_vector_alg3(__m128i numers, const struct libdivide_s32_t *denom) {
    __m128i q = libdivide_mullhi_s32_flat_vector(numers, _mm_set1_epi32(denom->magic));
    q = _mm_sub_epi32(q, numers);
    q = _mm_sra_epi32(q, libdivide_u32_to_m128i(denom->more & LIBDIVIDE_32_SHIFT_MASK));
    q = _mm_add_epi32(q, _mm_srli_epi32(q, 31));
    return q;
}

__m128i libdivide_s32_do_vector_alg4(__m128i numers, const struct libdivide_s32_t *denom) {
    uint8_t more = denom->more;
    __m128i q = libdivide_mullhi_s32_flat_vector(numers, _mm_set1_epi32(denom->magic));
    q = _mm_sra_epi32(q, libdivide_u32_to_m128i(more & LIBDIVIDE_32_SHIFT_MASK)); //q >>= shift
    q = _mm_add_epi32(q, _mm_srli_epi32(q, 31)); // q += (q < 0)
    return q;
}

__m128i libdivide_s32_branchfree_do_vector(__m128i numers, const struct libdivide_s32_branchfree_t *denom) {
    int32_t magic = denom->magic;
    uint8_t more = denom->more;
    uint8_t shift = more & LIBDIVIDE_32_SHIFT_MASK;
     // must be arithmetic shift
    __m128i sign = _mm_set1_epi32((int32_t)(int8_t)more >> 7);

     // libdivide__mullhi_s32(numers, magic);
    __m128i q = libdivide_mullhi_s32_flat_vector(numers, _mm_set1_epi32(magic));
    q = _mm_add_epi32(q, numers); // q += numers

    // If q is non-negative, we have nothing to do
    // If q is negative, we want to add either (2**shift)-1 if d is a power of
    // 2, or (2**shift) if it is not a power of 2
    uint32_t is_power_of_2 = (magic == 0);
    __m128i q_sign = _mm_srai_epi32(q, 31); // q_sign = q >> 31
    __m128i mask = _mm_set1_epi32((1 << shift) - is_power_of_2);
    q = _mm_add_epi32(q, _mm_and_si128(q_sign, mask)); // q = q + (q_sign & mask)
    q = _mm_srai_epi32(q, shift); //q >>= shift
    q = _mm_sub_epi32(_mm_xor_si128(q, sign), sign); // q = (q ^ sign) - sign
    return q;
}

#endif

///////////// SINT64

static inline struct libdivide_s64_t libdivide_internal_s64_gen(int64_t d, int branchfree) {
    if (d == 0) {
        LIBDIVIDE_ERROR("divider must be != 0");
    }

    struct libdivide_s64_t result;

    // If d is a power of 2, or negative a power of 2, we have to use a shift.
    // This is especially important because the magic algorithm fails for -1.
    // To check if d is a power of 2 or its inverse, it suffices to check
    // whether its absolute value has exactly one bit set.  This works even for
    // INT_MIN, because abs(INT_MIN) == INT_MIN, and INT_MIN has one bit set
    // and is a power of 2.
    uint64_t ud = (uint64_t)d;
    uint64_t absD = (d < 0) ? -ud : ud;
    uint32_t floor_log_2_d = 63 - libdivide__count_leading_zeros64(absD);
    // check if exactly one bit is set,
    // don't care if absD is 0 since that's divide by zero
    if ((absD & (absD - 1)) == 0) {
        // Branchfree and non-branchfree cases are the same
        result.magic = 0;
        result.more = floor_log_2_d | (d < 0 ? LIBDIVIDE_NEGATIVE_DIVISOR : 0);
    } else {
        // the dividend here is 2**(floor_log_2_d + 63), so the low 64 bit word
        // is 0 and the high word is floor_log_2_d - 1
        uint8_t more;
        uint64_t rem, proposed_m;
        proposed_m = libdivide_128_div_64_to_64(1ULL << (floor_log_2_d - 1), 0, absD, &rem);
        const uint64_t e = absD - rem;

        // We are going to start with a power of floor_log_2_d - 1.
        // This works if works if e < 2**floor_log_2_d.
        if (!branchfree && e < (1ULL << floor_log_2_d)) {
            // This power works
            more = floor_log_2_d - 1;
        } else {
            // We need to go one higher. This should not make proposed_m
            // overflow, but it will make it negative when interpreted as an
            // int32_t.
            proposed_m += proposed_m;
            const uint64_t twice_rem = rem + rem;
            if (twice_rem >= absD || twice_rem < rem) proposed_m += 1;
            // note that we only set the LIBDIVIDE_NEGATIVE_DIVISOR bit if we
            // also set ADD_MARKER this is an annoying optimization that
            // enables algorithm #4 to avoid the mask. However we always set it
            // in the branchfree case
            more = floor_log_2_d | LIBDIVIDE_ADD_MARKER;
        }
        proposed_m += 1;
        int64_t magic = (int64_t)proposed_m;

        // Mark if we are negative
        if (d < 0) {
            more |= LIBDIVIDE_NEGATIVE_DIVISOR;
            if (!branchfree) {
                magic = -magic;
            }
        }

        result.more = more;
        result.magic = magic;
    }
    return result;
}

struct libdivide_s64_t libdivide_s64_gen(int64_t d) {
    return libdivide_internal_s64_gen(d, 0);
}

struct libdivide_s64_branchfree_t libdivide_s64_branchfree_gen(int64_t d) {
    if (d == 1) {
        LIBDIVIDE_ERROR("branchfree divider must be != 1");
    }
    if (d == -1) {
        LIBDIVIDE_ERROR("branchfree divider must be != -1");
    }
    struct libdivide_s64_t tmp = libdivide_internal_s64_gen(d, 1);
    struct libdivide_s64_branchfree_t ret = {tmp.magic, tmp.more};
    return ret;
}

int64_t libdivide_s64_do(int64_t numer, const struct libdivide_s64_t *denom) {
    uint8_t more = denom->more;
    int64_t magic = denom->magic;
    if (magic == 0) { //shift path
        uint32_t shifter = more & LIBDIVIDE_64_SHIFT_MASK;
        uint64_t uq = (uint64_t)numer + ((numer >> 63) & ((1ULL << shifter) - 1));
        int64_t q = (int64_t)uq;
        q = q >> shifter;
        // must be arithmetic shift and then sign-extend
        int64_t shiftMask = (int8_t)more >> 7;
        q = (q ^ shiftMask) - shiftMask;
        return q;
    } else {
        uint64_t uq = (uint64_t)libdivide__mullhi_s64(magic, numer);
        if (more & LIBDIVIDE_ADD_MARKER) {
            // must be arithmetic shift and then sign extend
            int64_t sign = (int8_t)more >> 7;
            uq += ((uint64_t)numer ^ sign) - sign;
        }
        int64_t q = (int64_t)uq;
        q >>= more & LIBDIVIDE_64_SHIFT_MASK;
        q += (q < 0);
        return q;
    }
}

int64_t libdivide_s64_branchfree_do(int64_t numer, const struct libdivide_s64_branchfree_t *denom) {
    uint8_t more = denom->more;
    uint32_t shift = more & LIBDIVIDE_64_SHIFT_MASK;
    // must be arithmetic shift and then sign extend
    int64_t sign = (int8_t)more >> 7;
    int64_t magic = denom->magic;
    int64_t q = libdivide__mullhi_s64(magic, numer);
    q += numer;

    // If q is non-negative, we have nothing to do.
    // If q is negative, we want to add either (2**shift)-1 if d is a power of
    // 2, or (2**shift) if it is not a power of 2.
    uint32_t is_power_of_2 = (magic == 0);
    uint64_t q_sign = (uint64_t)(q >> 63);
    q += q_sign & ((1ULL << shift) - is_power_of_2);

    // Arithmetic right shift
    q >>= shift;

    // Negate if needed
    q = (q ^ sign) - sign;
    return q;
}

int64_t libdivide_s64_recover(const struct libdivide_s64_t *denom) {
    uint8_t more = denom->more;
    uint8_t shift = more & LIBDIVIDE_64_SHIFT_MASK;
    if (denom->magic == 0) { // shift path
        uint64_t absD = 1ULL << shift;
        if (more & LIBDIVIDE_NEGATIVE_DIVISOR) {
            absD = -absD;
        }
        return (int64_t)absD;
    } else {
        // Unsigned math is much easier
        int negative_divisor = (more & LIBDIVIDE_NEGATIVE_DIVISOR);
        int magic_was_negated = (more & LIBDIVIDE_ADD_MARKER)
            ? denom->magic > 0 : denom->magic < 0;

        uint64_t d = (uint64_t)(magic_was_negated ? -denom->magic : denom->magic);
        uint64_t n_hi = 1ULL << shift, n_lo = 0;
        uint64_t rem_ignored;
        uint64_t q = libdivide_128_div_64_to_64(n_hi, n_lo, d, &rem_ignored);
        int64_t result = (int64_t)(q + 1);
        if (negative_divisor) {
            result = -result;
        }
        return result;
    }
}

int64_t libdivide_s64_branchfree_recover(const struct libdivide_s64_branchfree_t *denom) {
    return libdivide_s64_recover((const struct libdivide_s64_t *)denom);
}

int libdivide_s64_get_algorithm(const struct libdivide_s64_t *denom) {
    uint8_t more = denom->more;
    int positiveDivisor = !(more & LIBDIVIDE_NEGATIVE_DIVISOR);
    if (denom->magic == 0) return (positiveDivisor ? 0 : 1); // shift path
    else if (more & LIBDIVIDE_ADD_MARKER) return (positiveDivisor ? 2 : 3);
    else return 4;
}

int64_t libdivide_s64_do_alg0(int64_t numer, const struct libdivide_s64_t *denom) {
    uint32_t shifter = denom->more & LIBDIVIDE_64_SHIFT_MASK;
    int64_t q = numer + ((numer >> 63) & ((1ULL << shifter) - 1));
    return q >> shifter;
}

int64_t libdivide_s64_do_alg1(int64_t numer, const struct libdivide_s64_t *denom) {
    // denom->shifter != -1 && demo->shiftMask != 0
    uint32_t shifter = denom->more & LIBDIVIDE_64_SHIFT_MASK;
    int64_t q = numer + ((numer >> 63) & ((1ULL << shifter) - 1));
    return - (q >> shifter);
}

int64_t libdivide_s64_do_alg2(int64_t numer, const struct libdivide_s64_t *denom) {
    int64_t q = libdivide__mullhi_s64(denom->magic, numer);
    q += numer;
    q >>= denom->more & LIBDIVIDE_64_SHIFT_MASK;
    q += (q < 0);
    return q;
}

int64_t libdivide_s64_do_alg3(int64_t numer, const struct libdivide_s64_t *denom) {
    int64_t q = libdivide__mullhi_s64(denom->magic, numer);
    q -= numer;
    q >>= denom->more & LIBDIVIDE_64_SHIFT_MASK;
    q += (q < 0);
    return q;
}

int64_t libdivide_s64_do_alg4(int64_t numer, const struct libdivide_s64_t *denom) {
    int64_t q = libdivide__mullhi_s64(denom->magic, numer);
    q >>= denom->more & LIBDIVIDE_64_SHIFT_MASK;
    q += (q < 0);
    return q;
}

#if defined(LIBDIVIDE_USE_SSE2)

__m128i libdivide_s64_do_vector(__m128i numers, const struct libdivide_s64_t *denom) {
    uint8_t more = denom->more;
    int64_t magic = denom->magic;
    if (magic == 0) { // shift path
        uint32_t shifter = more & LIBDIVIDE_64_SHIFT_MASK;
        __m128i roundToZeroTweak = libdivide__u64_to_m128((1ULL << shifter) - 1);
        __m128i q = _mm_add_epi64(numers, _mm_and_si128(libdivide_s64_signbits(numers), roundToZeroTweak)); // q = numer + ((numer >> 63) & roundToZeroTweak);
        q = libdivide_s64_shift_right_vector(q, shifter); // q = q >> shifter
        __m128i shiftMask = _mm_set1_epi32((int32_t)((int8_t)more >> 7));
        q = _mm_sub_epi64(_mm_xor_si128(q, shiftMask), shiftMask); // q = (q ^ shiftMask) - shiftMask;
        return q;
    }
    else {
        __m128i q = libdivide_mullhi_s64_flat_vector(numers, libdivide__u64_to_m128(magic));
        if (more & LIBDIVIDE_ADD_MARKER) {
            __m128i sign = _mm_set1_epi32((int32_t)((int8_t)more >> 7)); // must be arithmetic shift
            q = _mm_add_epi64(q, _mm_sub_epi64(_mm_xor_si128(numers, sign), sign)); // q += ((numer ^ sign) - sign);
        }
        // q >>= denom->mult_path.shift
        q = libdivide_s64_shift_right_vector(q, more & LIBDIVIDE_64_SHIFT_MASK);
        q = _mm_add_epi64(q, _mm_srli_epi64(q, 63)); // q += (q < 0)
        return q;
    }
}

__m128i libdivide_s64_do_vector_alg0(__m128i numers, const struct libdivide_s64_t *denom) {
    uint32_t shifter = denom->more & LIBDIVIDE_64_SHIFT_MASK;
    __m128i roundToZeroTweak = libdivide__u64_to_m128((1ULL << shifter) - 1);
    __m128i q = _mm_add_epi64(numers, _mm_and_si128(libdivide_s64_signbits(numers), roundToZeroTweak));
    q = libdivide_s64_shift_right_vector(q, shifter);
    return q;
}

__m128i libdivide_s64_do_vector_alg1(__m128i numers, const struct libdivide_s64_t *denom) {
    uint32_t shifter = denom->more & LIBDIVIDE_64_SHIFT_MASK;
    __m128i roundToZeroTweak = libdivide__u64_to_m128((1ULL << shifter) - 1);
    __m128i q = _mm_add_epi64(numers, _mm_and_si128(libdivide_s64_signbits(numers), roundToZeroTweak));
    q = libdivide_s64_shift_right_vector(q, shifter);
    return _mm_sub_epi64(_mm_setzero_si128(), q);
}

__m128i libdivide_s64_do_vector_alg2(__m128i numers, const struct libdivide_s64_t *denom) {
    __m128i q = libdivide_mullhi_s64_flat_vector(numers, libdivide__u64_to_m128(denom->magic));
    q = _mm_add_epi64(q, numers);
    q = libdivide_s64_shift_right_vector(q, denom->more & LIBDIVIDE_64_SHIFT_MASK);
    q = _mm_add_epi64(q, _mm_srli_epi64(q, 63)); // q += (q < 0)
    return q;
}

__m128i libdivide_s64_do_vector_alg3(__m128i numers, const struct libdivide_s64_t *denom) {
    __m128i q = libdivide_mullhi_s64_flat_vector(numers, libdivide__u64_to_m128(denom->magic));
    q = _mm_sub_epi64(q, numers);
    q = libdivide_s64_shift_right_vector(q, denom->more & LIBDIVIDE_64_SHIFT_MASK);
    q = _mm_add_epi64(q, _mm_srli_epi64(q, 63)); // q += (q < 0)
    return q;
}

__m128i libdivide_s64_do_vector_alg4(__m128i numers, const struct libdivide_s64_t *denom) {
    __m128i q = libdivide_mullhi_s64_flat_vector(numers, libdivide__u64_to_m128(denom->magic));
    q = libdivide_s64_shift_right_vector(q, denom->more & LIBDIVIDE_64_SHIFT_MASK);
    q = _mm_add_epi64(q, _mm_srli_epi64(q, 63));
    return q;
}

__m128i libdivide_s64_branchfree_do_vector(__m128i numers, const struct libdivide_s64_branchfree_t *denom) {
    int64_t magic = denom->magic;
    uint8_t more = denom->more;
    uint8_t shift = more & LIBDIVIDE_64_SHIFT_MASK;
    // must be arithmetic shift
    __m128i sign = _mm_set1_epi32((int32_t)(int8_t)more >> 7);

     // libdivide__mullhi_s64(numers, magic);
    __m128i q = libdivide_mullhi_s64_flat_vector(numers, libdivide__u64_to_m128(magic));
    q = _mm_add_epi64(q, numers); // q += numers

    // If q is non-negative, we have nothing to do.
    // If q is negative, we want to add either (2**shift)-1 if d is a power of
    // 2, or (2**shift) if it is not a power of 2.
    uint32_t is_power_of_2 = (magic == 0);
    __m128i q_sign = libdivide_s64_signbits(q); // q_sign = q >> 63
    __m128i mask = libdivide__u64_to_m128((1ULL << shift) - is_power_of_2);
    q = _mm_add_epi64(q, _mm_and_si128(q_sign, mask)); // q = q + (q_sign & mask)
    q = libdivide_s64_shift_right_vector(q, shift); // q >>= shift
    q = _mm_sub_epi64(_mm_xor_si128(q, sign), sign); // q = (q ^ sign) - sign
    return q;
}

#endif

/////////// C++ stuff

#ifdef __cplusplus

// Our divider struct is templated on both a type (like uint64_t) and an
// algorithm index. BRANCHFULL is the default algorithm, BRANCHFREE is the
// branchfree variant, and the indexed variants are for unswitching.
enum {
    BRANCHFULL = -1,
    BRANCHFREE = -2,
    ALGORITHM0 = 0,
    ALGORITHM1 = 1,
    ALGORITHM2 = 2,
    ALGORITHM3 = 3,
    ALGORITHM4 = 4
};

namespace libdivide_internal {

#if defined(LIBDIVIDE_USE_SSE2)
#define MAYBE_VECTOR(X) X
#define MAYBE_VECTOR_PARAM(X) __m128i vector_func(__m128i, const X *)
#else
#define MAYBE_VECTOR(X) 0
#define MAYBE_VECTOR_PARAM(X) int unused
#endif

// The following convenience macros are used to build a type of the base
// divider class and give it as template arguments the C functions
// related to the macro name and the macro type paramaters.

#define BRANCHFULL_DIVIDER(INT, TYPE) \
    typedef base<INT, \
                 libdivide_##TYPE##_t, \
                 libdivide_##TYPE##_gen, \
                 libdivide_##TYPE##_do, \
                 MAYBE_VECTOR(libdivide_##TYPE##_do_vector)>

#define BRANCHFREE_DIVIDER(INT, TYPE) \
    typedef base<INT, \
                 libdivide_##TYPE##_branchfree_t, \
                 libdivide_##TYPE##_branchfree_gen, \
                 libdivide_##TYPE##_branchfree_do, \
                 MAYBE_VECTOR(libdivide_##TYPE##_branchfree_do_vector)>

#define ALGORITHM_DIVIDER(INT, TYPE, ALGO) \
    typedef base<INT, \
                 libdivide_##TYPE##_t, \
                 libdivide_##TYPE##_gen, \
                 libdivide_##TYPE##_do_##ALGO, \
                 MAYBE_VECTOR(libdivide_##TYPE##_do_vector_##ALGO)>

#define CRASH_DIVIDER(INT, TYPE) \
    typedef base<INT, \
                 libdivide_##TYPE##_t, \
                 libdivide_##TYPE##_gen, \
                 libdivide_##TYPE##_crash, \
                 MAYBE_VECTOR(libdivide_##TYPE##_crash_vector)>

    // Base divider, provides storage for the actual divider.
    // @IntType: e.g. uint32_t
    // @DenomType: e.g. libdivide_u32_t
    // @gen_func(): e.g. libdivide_u32_gen
    // @do_func(): e.g. libdivide_u32_do
    // @MAYBE_VECTOR_PARAM: e.g. libdivide_u32_do_vector
    template<typename IntType,
             typename DenomType,
             DenomType gen_func(IntType),
             IntType do_func(IntType, const DenomType *),
             MAYBE_VECTOR_PARAM(DenomType)>
    struct base {
        // Storage for the actual divider
        DenomType denom;

        // Constructor that takes a divisor value, and applies the gen function
        base(IntType d) : denom(gen_func(d)) { }

        // Default constructor to allow uninitialized uses in e.g. arrays
        base() {}

        // Needed for unswitch
        base(const DenomType& d) : denom(d) { }

        IntType perform_divide(IntType val) const {
            return do_func(val, &denom);
        }

#if defined(LIBDIVIDE_USE_SSE2)
        __m128i perform_divide_vector(__m128i val) const {
            return vector_func(val, &denom);
        }
#endif
    };

    // Functions that will never be called but are required to be able
    // to use unswitch in C++ template code. Unsigned has fewer algorithms
    // than signed i.e. alg3 and alg4 are not defined for unsigned. In
    // order to make templates compile we need to define unsigned alg3 and
    // alg4 as crash functions.
    uint32_t libdivide_u32_crash(uint32_t, const libdivide_u32_t *) { exit(-1); }
    uint64_t libdivide_u64_crash(uint64_t, const libdivide_u64_t *) { exit(-1); }

#if defined(LIBDIVIDE_USE_SSE2)
    __m128i libdivide_u32_crash_vector(__m128i, const libdivide_u32_t *) { exit(-1); }
    __m128i libdivide_u64_crash_vector(__m128i, const libdivide_u64_t *) { exit(-1); }
#endif

    template<typename T, int ALGO> struct dispatcher { };

    // Templated dispatch using partial specialization
    template<> struct dispatcher<int32_t, BRANCHFULL> { BRANCHFULL_DIVIDER(int32_t, s32) divider; };
    template<> struct dispatcher<int32_t, BRANCHFREE> { BRANCHFREE_DIVIDER(int32_t, s32) divider; };
    template<> struct dispatcher<int32_t, ALGORITHM0> { ALGORITHM_DIVIDER(int32_t, s32, alg0) divider; };
    template<> struct dispatcher<int32_t, ALGORITHM1> { ALGORITHM_DIVIDER(int32_t, s32, alg1) divider; };
    template<> struct dispatcher<int32_t, ALGORITHM2> { ALGORITHM_DIVIDER(int32_t, s32, alg2) divider; };
    template<> struct dispatcher<int32_t, ALGORITHM3> { ALGORITHM_DIVIDER(int32_t, s32, alg3) divider; };
    template<> struct dispatcher<int32_t, ALGORITHM4> { ALGORITHM_DIVIDER(int32_t, s32, alg4) divider; };

    template<> struct dispatcher<uint32_t, BRANCHFULL> { BRANCHFULL_DIVIDER(uint32_t, u32) divider; };
    template<> struct dispatcher<uint32_t, BRANCHFREE> { BRANCHFREE_DIVIDER(uint32_t, u32) divider; };
    template<> struct dispatcher<uint32_t, ALGORITHM0> { ALGORITHM_DIVIDER(uint32_t, u32, alg0) divider; };
    template<> struct dispatcher<uint32_t, ALGORITHM1> { ALGORITHM_DIVIDER(uint32_t, u32, alg1) divider; };
    template<> struct dispatcher<uint32_t, ALGORITHM2> { ALGORITHM_DIVIDER(uint32_t, u32, alg2) divider; };
    template<> struct dispatcher<uint32_t, ALGORITHM3> { CRASH_DIVIDER(uint32_t, u32) divider; };
    template<> struct dispatcher<uint32_t, ALGORITHM4> { CRASH_DIVIDER(uint32_t, u32) divider; };

    template<> struct dispatcher<int64_t, BRANCHFULL> { BRANCHFULL_DIVIDER(int64_t, s64) divider; };
    template<> struct dispatcher<int64_t, BRANCHFREE> { BRANCHFREE_DIVIDER(int64_t, s64) divider; };
    template<> struct dispatcher<int64_t, ALGORITHM0> { ALGORITHM_DIVIDER (int64_t, s64, alg0) divider; };
    template<> struct dispatcher<int64_t, ALGORITHM1> { ALGORITHM_DIVIDER (int64_t, s64, alg1) divider; };
    template<> struct dispatcher<int64_t, ALGORITHM2> { ALGORITHM_DIVIDER (int64_t, s64, alg2) divider; };
    template<> struct dispatcher<int64_t, ALGORITHM3> { ALGORITHM_DIVIDER (int64_t, s64, alg3) divider; };
    template<> struct dispatcher<int64_t, ALGORITHM4> { ALGORITHM_DIVIDER (int64_t, s64, alg4) divider; };

    template<> struct dispatcher<uint64_t, BRANCHFULL> { BRANCHFULL_DIVIDER(uint64_t, u64) divider; };
    template<> struct dispatcher<uint64_t, BRANCHFREE> { BRANCHFREE_DIVIDER(uint64_t, u64) divider; };
    template<> struct dispatcher<uint64_t, ALGORITHM0> { ALGORITHM_DIVIDER(uint64_t, u64, alg0) divider; };
    template<> struct dispatcher<uint64_t, ALGORITHM1> { ALGORITHM_DIVIDER(uint64_t, u64, alg1) divider; };
    template<> struct dispatcher<uint64_t, ALGORITHM2> { ALGORITHM_DIVIDER(uint64_t, u64, alg2) divider; };
    template<> struct dispatcher<uint64_t, ALGORITHM3> { CRASH_DIVIDER(uint64_t, u64) divider; };
    template<> struct dispatcher<uint64_t, ALGORITHM4> { CRASH_DIVIDER(uint64_t, u64) divider; };

    // Overloads that don't depend on the algorithm
    inline int32_t  recover(const libdivide_s32_t *s) { return libdivide_s32_recover(s); }
    inline uint32_t recover(const libdivide_u32_t *s) { return libdivide_u32_recover(s); }
    inline int64_t  recover(const libdivide_s64_t *s) { return libdivide_s64_recover(s); }
    inline uint64_t recover(const libdivide_u64_t *s) { return libdivide_u64_recover(s); }

    inline int32_t  recover(const libdivide_s32_branchfree_t *s) { return libdivide_s32_branchfree_recover(s); }
    inline uint32_t recover(const libdivide_u32_branchfree_t *s) { return libdivide_u32_branchfree_recover(s); }
    inline int64_t  recover(const libdivide_s64_branchfree_t *s) { return libdivide_s64_branchfree_recover(s); }
    inline uint64_t recover(const libdivide_u64_branchfree_t *s) { return libdivide_u64_branchfree_recover(s); }

    inline int get_algorithm(const libdivide_s32_t *s) { return libdivide_s32_get_algorithm(s); }
    inline int get_algorithm(const libdivide_u32_t *s) { return libdivide_u32_get_algorithm(s); }
    inline int get_algorithm(const libdivide_s64_t *s) { return libdivide_s64_get_algorithm(s); }
    inline int get_algorithm(const libdivide_u64_t *s) { return libdivide_u64_get_algorithm(s); }

    // Fallback for branchfree variants, which do not support unswitching
    template<typename T> int get_algorithm(const T *) { return -1; }
}

// This is the main divider class for use by the user (C++ API).
// The divider itself is stored in the div variable who's
// type is chosen by the dispatcher based on the template paramaters.
template<typename T, int ALGO = BRANCHFULL>
class divider
{
private:
    // Here's the actual divider
    typedef typename libdivide_internal::dispatcher<T, ALGO>::divider div_t;
    div_t div;

    // unswitch() friend declaration
    template<int NEW_ALGO, typename S>
    friend divider<S, NEW_ALGO> unswitch(const divider<S, BRANCHFULL> & d);

    // Constructor used by the unswitch friend
    divider(const div_t& denom) : div(denom) { }

public:
    // Ordinary constructor that takes the divisor as a parameter
    divider(T n) : div(n) { }

    // Default constructor. We leave this deliberately undefined so that
    // creating an array of divider and then initializing them
    // doesn't slow us down.
    divider() { }

    // Divides the parameter by the divisor, returning the quotient
    T perform_divide(T val) const {
        return div.perform_divide(val);
    }

    // Recovers the divisor that was used to initialize the divider
    T recover_divisor() const {
        return libdivide_internal::recover(&div.denom);
    }

#if defined(LIBDIVIDE_USE_SSE2)
    // Treats the vector as either two or four packed values (depending on the
    // size), and divides each of them by the divisor,
    // returning the packed quotients.
    __m128i perform_divide_vector(__m128i val) const {
        return div.perform_divide_vector(val);
    }
#endif

    // Returns the index of algorithm, for use in the unswitch function. Does
    // not apply to branchfree variant.
    // Returns the algorithm for unswitching.
    int get_algorithm() const {
        return libdivide_internal::get_algorithm(&div.denom);
    }

    bool operator==(const divider<T, ALGO>& him) const {
        return div.denom.magic == him.div.denom.magic &&
               div.denom.more == him.div.denom.more;
    }

    bool operator!=(const divider<T, ALGO>& him) const {
        return !(*this == him);
    }
};

#if __cplusplus >= 201103L || \
    (defined(_MSC_VER) && _MSC_VER >= 1800)

// libdivdie::branchfree_divider<T>
template <typename T>
using branchfree_divider = divider<T, BRANCHFREE>;

#endif

// Returns a divider specialized for the given algorithm
template<int NEW_ALGO, typename T>
divider<T, NEW_ALGO> unswitch(const divider<T, BRANCHFULL>& d) {
    return divider<T, NEW_ALGO>(d.div.denom);
}

// Overload of the / operator for scalar division
template<typename int_type, int ALGO>
int_type operator/(int_type numer, const divider<int_type, ALGO>& denom) {
    return denom.perform_divide(numer);
}

// Overload of the /= operator for scalar division
template<typename int_type, int ALGO>
int_type operator/=(int_type& numer, const divider<int_type, ALGO>& denom) {
    numer = denom.perform_divide(numer);
    return numer;
}

#if defined(LIBDIVIDE_USE_SSE2)

// Overload of the / operator for vector division
template<typename int_type, int ALGO>
__m128i operator/(__m128i numer, const divider<int_type, ALGO>& denom) {
    return denom.perform_divide_vector(numer);
}

// Overload of the /= operator for vector division
template<typename int_type, int ALGO>
__m128i operator/=(__m128i& numer, const divider<int_type, ALGO>& denom) {
    numer = denom.perform_divide_vector(numer);
    return numer;
}

#endif

} // namespace libdivide
} // anonymous namespace

#endif // __cplusplus

#endif // LIBDIVIDE_H