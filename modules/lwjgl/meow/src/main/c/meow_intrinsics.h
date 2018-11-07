/* ========================================================================

   meow_intrinsics.h
   (C) Copyright 2018 by Molly Rocket, Inc. (https://mollyrocket.com)
   
   See https://mollyrocket.com/meowhash for details.
   
   This is the default way to define all of the types and operations that
   meow_hash.h needs.  However, if you've got your _own_ equivalent type
   definitions and intrinsics, you can _omit_ this header file and just
   #define/typedef all the Meow ops to map to your own ops, keeping things
   nice and uniform in your codebase.
   
   ======================================================================== */

#if !defined(MEOW_HASH_INTRINSICS_H)

//
// NOTE(casey): Try to guess the source file for compiler intrinsics
//
#if _MSC_VER

#if _M_AMD64 || _M_IX86
#include <intrin.h>
#elif _M_ARM64
#include <arm64_neon.h>
#endif

#else

#if __x86_64__ || __i386__
#include <x86intrin.h>
#elif __aarch64__
#include <arm_neon.h>
#endif

#endif

//
// NOTE(casey): Set #define's to their defaults
//

#if !defined(MEOW_HASH_INTEL) || !defined(MEOW_HASH_ARMV8)
#if __x86_64__ || __i386__ || _M_AMD64 || _M_IX86
#define MEOW_HASH_INTEL 1
#elif __aarch64__ || _M_ARM64
#define MEOW_HASH_ARMV8 1
#else
#error Cannot determine architecture to use!
#endif
#endif

#if !defined(MEOW_HASH_AVX512)
#define MEOW_HASH_AVX512 0
#endif

//
// NOTE(casey): Define basic types
//

#define meow_u8 char unsigned
#define meow_u16 short unsigned
#define meow_u32 int unsigned
#define meow_u64 long long unsigned

//
// NOTE(casey): Operations for x64 processors
//

#if MEOW_HASH_INTEL

#define meow_u128 __m128i
#define meow_aes_128 __m128i
#define meow_u256 __m256i
#define meow_aes_256 __m256i
#define meow_u512 __m512i
#define meow_aes_512 __m512i

#define Meow128_AreEqual(A, B) (_mm_movemask_epi8(_mm_cmpeq_epi8((A), (B))) == 0xFFFF)
#define Meow128_AESDEC(Prior, Xor) _mm_aesdec_si128((Prior), (Xor))
#define Meow128_AESDEC_Mem(Prior, Xor) _mm_aesdec_si128((Prior), _mm_loadu_si128((meow_u128 *)(Xor)))
#define Meow128_AESDEC_Finalize(A) (A)
#define Meow128_Set64x2(Low64, High64) _mm_set_epi64x((High64), (Low64))
#define Meow128_Set64x2_State(Low64, High64) Meow128_Set64x2(Low64, High64)

// TODO(casey): Not sure if this should actually be Meow128_Zero(A) ((A) = _mm_setzero_si128()), maybe
#define Meow128_Zero() _mm_setzero_si128()
#define Meow128_ZeroState() Meow128_Zero()

#define Meow256_AESDEC(Prior, XOr) _mm256_aesdec_epi128((Prior), (XOr))
#define Meow256_AESDEC_Mem(Prior, XOr) _mm256_aesdec_epi128((Prior), *(meow_u256 *)(XOr))
#define Meow256_Store(Value, Ptr) _mm256_store_si256((meow_u256 *)(Ptr), (Value));
#define Meow256_Zero() _mm256_setzero_si256()

#define Meow512_AESDEC(Prior, XOr) _mm512_aesdec_epi128((Prior), (XOr))
#define Meow512_AESDEC_Mem(Prior, XOr) _mm512_aesdec_epi128((Prior), *(meow_u256 *)(XOr))
#define Meow512_Store(Value, Ptr) _mm256_store_si256((meow_u512 *)(Ptr), (Value));
#define Meow512_Zero() _mm512_setzero_si512()

//
// NOTE(casey): Operations for ARM processors
//

#elif MEOW_HASH_ARMV8

#define meow_u128 uint8x16_t

// NOTE(mmozeiko): AES opcodes on ARMv8 work a bit differently than on Intel
// On Intel the "x = AESDEC(x, m)" does following:
//   x = InvMixColumns(SubBytes(ShiftRows(x))) ^ m
// But on ARMv8 the "x = AESDEC(x, m)" does following:
//   x = SubBytes(ShiftRows(x ^ m))
// Thus on ARMv8 it requires extra InvMixColumns call and delay on Xor operation.
// On iteration N it needs to use m[N-1] as input, and remeber m[N] for next iteration.
// This structure will store memory operand in member B which will be used in
// next AESDEC opcode. Remember to do one more XOR(A,B) when finishing AES
// operations in a loop.
typedef struct {
    meow_u128 A;
    meow_u128 B;
} meow_aes_128;

static int
Meow128_AreEqual(meow_u128 A, meow_u128 B)
{
    uint8x16_t Powers = {
        1, 2, 4, 8, 16, 32, 64, 128, 1, 2, 4, 8, 16, 32, 64, 128,
    };

    uint8x16_t Input = vceqq_u8(A, B);
    uint64x2_t Mask = vpaddlq_u32(vpaddlq_u16(vpaddlq_u8(vandq_u8(Input, Powers))));

    meow_u16 Output;
    vst1q_lane_u8((meow_u8*)&Output + 0, vreinterpretq_u8_u64(Mask), 0);
    vst1q_lane_u8((meow_u8*)&Output + 1, vreinterpretq_u8_u64(Mask), 8);
    return Output == 0xFFFF;
}

static meow_aes_128
Meow128_AESDEC(meow_aes_128 Prior, meow_u128 Xor)
{
    meow_aes_128 R;
    R.A = vaesimcq_u8(vaesdq_u8(Prior.A, Prior.B));
    R.B = Xor;
    return(R);
}

static meow_aes_128
Meow128_AESDEC_Mem(meow_aes_128 Prior, void *Xor)
{
    meow_aes_128 R;
    R.A = vaesimcq_u8(vaesdq_u8(Prior.A, Prior.B));
    R.B = vld1q_u8((meow_u8*)Xor);
    return(R);
}

static meow_u128
Meow128_AESDEC_Finalize(meow_aes_128 Value)
{
    meow_u128 R = veorq_u8(Value.A, Value.B);
    return(R);
}

static meow_u128
Meow128_Zero()
{
    meow_u128 R = vdupq_n_u8(0);
    return(R);
}

static meow_aes_128
Meow128_ZeroState()
{
    meow_aes_128 R;
    R.A = R.B = vdupq_n_u8(0);
    return(R);
}

static meow_u128
Meow128_Set64x2(meow_u64 Low64, meow_u64 High64)
{
   meow_u128 R = vreinterpretq_u8_u64(vcombine_u64(vcreate_u64(Low64), vcreate_u64(High64)));
   return(R);
}

static meow_aes_128
Meow128_Set64x2_State(meow_u64 Low64, meow_u64 High64)
{
   meow_aes_128 R;
   R.A = Meow128_Set64x2(Low64, High64);
   R.B = Meow128_Zero();
   return(R);
}

#endif

#if MEOW_HASH_IACA
// NOTE(casey): Define this if you'd like to analyze Meow hash with IACA
#include <iacaMarks.h>
#define MEOW_ANALYSIS_START IACA_VC64_START
#define MEOW_ANALYSIS_END IACA_VC64_END
#else
#define MEOW_ANALYSIS_START
#define MEOW_ANALYSIS_END
#endif

struct meow_hash_state;
typedef meow_u128 meow_hash_implementation(meow_u64 Seed, meow_u64 Len, void *Source);
typedef void meow_absorb_implementation(struct meow_hash_state *State, meow_u64 Len, void *Source);

#define MEOW_HASH_INTRINSICS_H
#endif
