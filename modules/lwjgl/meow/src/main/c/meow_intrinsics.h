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
#if __x86_64__ || _M_AMD64
#define MEOW_HASH_INTEL 1
#define MEOW_64BIT 1
#define MEOW_PAGESIZE 4096
#elif __i386__  || _M_IX86
#define MEOW_HASH_INTEL 1
#define MEOW_64BIT 0
#define MEOW_PAGESIZE 4096
#elif __aarch64__ || _M_ARM64
#define MEOW_HASH_ARMV8 1
#define MEOW_64BIT 1
#define MEOW_PAGESIZE 4096
#else
#error Cannot determine architecture to use!
#endif
#endif

//
// NOTE(casey): Define basic types
//

#define meow_u8 char unsigned
#define meow_u16 short unsigned
#define meow_u32 int unsigned
#define meow_u64 long long unsigned

#if MEOW_64BIT
#define meow_umm long long unsigned
#else
#define meow_umm int unsigned
#endif

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

#define MeowU32From(A, I) (_mm_extract_epi32((A), (I)))
#if MEOW_64BIT
#define MeowU64From(A, I) (_mm_extract_epi64((A), (I)))
#else
#define MeowU64From(A, I) (((__int64)_mm_extract_epi32((A), (I * 2 + 1)) << 32) | ((__int64)_mm_extract_epi32((A), (I * 2 + 0)) & 0xFFFFFFFF))
#endif
#define MeowHashesAreEqual(A, B) (_mm_movemask_epi8(_mm_cmpeq_epi8((A), (B))) == 0xFFFF)

#define Meow128_AESDEC(Prior, Xor) _mm_aesdec_si128((Prior), (Xor))
#define Meow128_AESDEC_Mem(Prior, Xor) _mm_aesdec_si128((Prior), _mm_loadu_si128((meow_u128 *)(Xor)))
#define Meow128_AESDEC_Finalize(A) (A)
#define Meow128_Set64x2(Low64, High64) _mm_set_epi64x((High64), (Low64))
#define Meow128_Set64x2_State(Low64, High64) Meow128_Set64x2(Low64, High64)
#define Meow128_GetAESConstant(Ptr) (*(meow_u128 *)(Ptr))

#define Meow128_And_Mem(A,B) _mm_and_si128((A),_mm_loadu_si128((meow_u128 *)(B)))
#define Meow128_Shuffle_Mem(Mem,Control) _mm_shuffle_epi8(_mm_loadu_si128((meow_u128 *)(Mem)),_mm_loadu_si128((meow_u128 *)(Control)))

// TODO(casey): Not sure if this should actually be Meow128_Zero(A) ((A) = _mm_setzero_si128()), maybe
#define Meow128_Zero() _mm_setzero_si128()

#define Meow256_AESDEC(Prior, XOr) _mm256_aesdec_epi128((Prior), (XOr))
#define Meow256_AESDEC_Mem(Prior, XOr) _mm256_aesdec_epi128((Prior), *(meow_u256 *)(XOr))
#define Meow256_Zero() _mm256_setzero_si256()
#define Meow256_PartialLoad(A, B) _mm256_mask_loadu_epi8(_mm256_setzero_si256(), _cvtu32_mask32((1UL<<(B)) - 1), (A))
#define Meow128_FromLow(A) _mm256_extracti128_si256((A), 0)
#define Meow128_FromHigh(A) _mm256_extracti128_si256((A), 1)

#define Meow512_AESDEC(Prior, XOr) _mm512_aesdec_epi128((Prior), (XOr))
#define Meow512_AESDEC_Mem(Prior, XOr) _mm512_aesdec_epi128((Prior), *(meow_u512 *)(XOr))
#define Meow512_Zero() _mm512_setzero_si512()
#define Meow512_PartialLoad(A, B) _mm512_mask_loadu_epi8(_mm512_setzero_si512(), _cvtu64_mask64((1ULL<<(B)) - 1), (A))
#define Meow256_FromLow(A) _mm512_extracti64x4_epi64((A), 0)
#define Meow256_FromHigh(A) _mm512_extracti64x4_epi64((A), 1)

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

#define MeowU32From(A, I) (vgetq_lane_u32(vreinterpretq_u32_u8((A)), (I)))
#define MeowU64From(A, I) (vgetq_lane_u64(vreinterpretq_u64_u8((A)), (I)))

static int
MeowHashesAreEqualImpl(meow_u128 A, meow_u128 B)
{
    #ifdef LWJGL_WINDOWS
    uint8x16_t Powers = {.n128_u8={
        1, 2, 4, 8, 16, 32, 64, 128, 1, 2, 4, 8, 16, 32, 64, 128,
    }};
    #else
    uint8x16_t Powers = {
        1, 2, 4, 8, 16, 32, 64, 128, 1, 2, 4, 8, 16, 32, 64, 128,
    };
    #endif

    uint8x16_t Input = vceqq_u8(A, B);
    uint64x2_t Mask = vpaddlq_u32(vpaddlq_u16(vpaddlq_u8(vandq_u8(Input, Powers))));

    meow_u16 Output;
    vst1q_lane_u8((meow_u8*)&Output + 0, vreinterpretq_u8_u64(Mask), 0);
    vst1q_lane_u8((meow_u8*)&Output + 1, vreinterpretq_u8_u64(Mask), 8);
    return Output == 0xFFFF;
}

#define MeowHashesAreEqual(A, B) MeowHashesAreEqualImpl((A), (B))

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
Meow128_GetAESConstant(const meow_u8 *Ptr)
{
    meow_aes_128 R;
    R.A = vld1q_u8(Ptr);
    R.B = vdupq_n_u8(0);
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

#define Meow128_And_Mem(A,B) vandq_u8((A), vld1q_u8((meow_u8 *)B))
#define Meow128_Shuffle_Mem(Mem,Control) vqtbl1q_u8(vld1q_u8((meow_u8 *)(Mem)),vld1q_u8((meow_u8 *)(Control)))

#endif

#define MEOW_HASH_VERSION 4
#define MEOW_HASH_VERSION_NAME "0.4/himalayan"

#if MEOW_INCLUDE_C

// NOTE(casey): Unfortunately, if you want an ANSI-C version, we have to slow everyone
// else down because you can't return 128-bit values by register anymore (in case the
// CPU doesn't support that)
typedef union meow_hash
{
    meow_u128 u128;
    meow_u64 u64[2];
    meow_u32 u32[4];
} meow_hash;
#define Meow128_CopyToHash(A, B) ((B).u128 = (A))

#undef MeowU64From
#undef MeowU32From
#undef MeowHashesAreEqual
#define MeowU32From(A, I) ((A).u32[I])
#define MeowU64From(A, I) ((A).u64[I])
#define MeowHashesAreEqual(A, B) (((A).u32[0] == (B).u32[0]) && ((A).u32[1] == (B).u32[1]) && ((A).u32[2] == (B).u32[2]) && ((A).u32[3] == (B).u32[3]))

#else

typedef meow_u128 meow_hash;
#define Meow128_CopyToHash(A, B) ((B) = (A))

#endif

typedef struct meow_hash_state meow_hash_state;
typedef meow_hash meow_hash_implementation(meow_u64 Seed, meow_u64 Len, void *Source);
typedef void meow_absorb_implementation(struct meow_hash_state *State, meow_u64 Len, void *Source);

#define MEOW_HASH_INTRINSICS_H
#endif
