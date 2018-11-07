/* ========================================================================

   Meow - A Fast Non-cryptographic Hash for Large Data Sizes
   (C) Copyright 2018 by Molly Rocket, Inc. (https://mollyrocket.com)
   
   See https://mollyrocket.com/meowhash for details.
   
   ========================================================================
   
   zlib License
   
   (C) Copyright 2018 Molly Rocket, Inc.
   
   This software is provided 'as-is', without any express or implied
   warranty.  In no event will the authors be held liable for any damages
   arising from the use of this software.
   
   Permission is granted to anyone to use this software for any purpose,
   including commercial applications, and to alter it and redistribute it
   freely, subject to the following restrictions:
   
   1. The origin of this software must not be misrepresented; you must not
      claim that you wrote the original software. If you use this software
      in a product, an acknowledgment in the product documentation would be
      appreciated but is not required.
   2. Altered source versions must be plainly marked as such, and must not be
      misrepresented as being the original software.
   3. This notice may not be removed or altered from any source distribution.
   
   ========================================================================
   
   FAQ
   
   Q: What is it?
   
   A: Meow is a 128-bit non-cryptographic hash that operates at high speeds
      on x64 and ARM processors that provide AES instructions.  It is
      designed to be truncatable to 64 and 32-bit hash values and still
      retain good collision resistance.
      
   Q: What is it GOOD for?
   
   A: Quickly hashing large amounts of data for comparison purposes such as
      block deduplication or change detection.
      
   Q: What is it BAD for?
   
   A: Anything security-related.  It should be assumed that it provides
      no protection from adversaries whatsoever.
      
   Q: Why is it called the "Meow hash"?
   
   A: It is named after a character in Meow the Infinite
      (https://meowtheinfinite.com)
      
   Q: Who wrote it?
   
   A: CASEY MURATORI (https://caseymuratori.com) wrote the original
      implementation for use in processing large-footprint assets for
      the game 1935 (https://molly1935.com).
      
      After the initial version, the hash was refined via collaboration
      with several great programmers who contributed suggestions and
      modifications:
      
      WON CHUN (https://twitter.com/won3d) provided the much-improved
      end-of-buffer handling, which significantly improved Meow's
      performance on small unaligned hashes.
      
      MARTINS MOZEIKO (https://matrins.ninja) ported Meow to ARM
      and added the proper preprocessor dressing for clean compilation
      on a variety of compiler configurations.
      
      FABIAN GIESEN (https://fgiesen.wordpress.com) provided support
      for getting the benchmarking working properly across a number
      of platforms.
      
      ARAS PRANCKEVICIUS (https://aras-p.info) provided the allocation
      shim for compilation on Mac OS X.
      
   ========================================================================
   
   USAGE
   
   For a complete working example, see meow_example.cpp.
   
   In order to use the Meow hash, you must have x64 intrinsics defined.
   This requires including platform- and compiler-specific header files.
   If you know how to do this yourself, you are welcome to define the
   types that Meow needs.  However, if you just want Meow to define its
   own stuff using its best guesses, you can include meow_intrinsics.h:
   
       #include "meow_intrinsics.h"
       
   Once you have intrinsics defined, either by meow_intrinsics.h or
   by definining all the necessary types and intrinsics yourself,
   you can include meow_hash.h and call a MeowHash implementation:
   
       #include "meow_hash.h"
       
       // Always available
       meow_u128 MeowHash1(u64 Seed, u64 Len, void *Source);
       
       // Available only when compiling with AVX-512 extensions
       meow_u128 MeowHash2(u64 Seed, u64 Len, void *Source);
       meow_u128 MeowHash4(u64 Seed, u64 Len, void *Source);
       
   MeowHash1 is 128-bit wide AES-NI.  MeowHash2 is 256-bit wide VAES.
   MeowHash4 is 512-bit wide VAES.  As of the initial publication of
   Meow hash, no consumer CPUs exist which support VAES, so the latter
   two are for future use and internal x64 vendor testing.
   
   Calling MeowHash* with a seed, length, and source pointer computes the
   hash and returns a 128-bit value which contains the full 128-bit hash.
   You can use this value directly using your compiler's intrinsics, or
   you can use some helper functions Meow defines:
   
       // NOTE(casey): Check if two Meow hashes are the same
       // (returns zero if they aren't, non-zero if they are)
       int MeowHashesAreEqual(meow_u128 A, meow_u128 B)
       
       // NOTE(casey): Truncate a Meow hash to 64 bits
       meow_u64 MeowU64From(meow_u128 Hash);
       
       // NOTE(casey): Truncate a Meow hash to 32 bits
       meow_u32 MeowU32From(meow_u128 Hash);
       
   Since no currently available CPUs can run MeowHash2 or MeowHash4,
   it is not recommended that you include them in your code, because
   they literally _cannot_ be tested.  Once CPUs are available that
   can run them, you can include them and use a probing function
   to see if they can be used at startup, as shown in meow_example.cpp.
   
   **** VERY IMPORTANT X64 COMPILATION NOTES ****
   
   On x64, Meow uses the AESDEC instruction, which comes in two flavors:
   SSE (aesdec) and AVX (vaesdec).  If you are compiling _with_ AVX support,
   your compiler will probably emit the AVX variant, which means your code
   WILL NOT RUN on computers that do not have AVX.  If you need to deploy
   this hash on computers that do not have AVX, you must take care to
   TURN OFF support for AVX in your compiler for the file that includes
   the Meow hash!
   
   **** IF YOU DON'T KNOW WHAT AES-NI, VAES, VEX, ETC. ARE... ****
   
   ... then you probably shouldn't be using Meow hash for another few
   years.  Right now, there are only certain CPUs that support AES
   instructions, both on x64 and ARM.  If you don't know what you're
   doing, you may accidentally ship code that doesn't run on some of
   the CPUs on your target platforms.
   
   Meow hash is designed more for use on the production side, and
   less on the distributed-to-clients side, so an abundance of
   caution is advised for people who don't really know about CPU
   architeectures but were tempted to deploy Meow hash to end users
   without fully understanding the consequences.
   
   ======================================================================== */

//
// NOTE(casey): This version is EXPERIMENTAL.  The Meow hash is still
// undergoing testing and finalization.
//
// **** EXPECT HASHES/APIs TO CHANGE UNTIL THE VERSION NUMBER HITS 1.0. ****
//
// You have been warned.
//

#define MEOW_HASH_VERSION 3
#define MEOW_HASH_VERSION_NAME "0.3/snowshoe"
#define MEOW_HASH_BLOCK_SIZE_SHIFT 8

//
// NOTE(casey): Smaller hash extraction
//

static meow_u64
MeowU64From(meow_u128 Hash)
{
    // TODO(casey): It is probably worth it to use the cvt intrinsics here
    // TODO(mmozeiko): use vgetq_lane_u64 on ARMv8
    meow_u64 Result = *(meow_u64 *)&Hash;
    return(Result);
}

static meow_u32
MeowU32From(meow_u128 Hash)
{
    // TODO(casey): It is probably worth it to use the cvt intrinsics here
    // TODO(mmozeiko): use vgetq_lane_u32 on ARMv8
    meow_u32 Result = *(meow_u32 *)&Hash;
    return(Result);
}

//
// NOTE(casey): "Fast" comparison (using SSE or NEON)
//

static int
MeowHashesAreEqual(meow_u128 A, meow_u128 B)
{
    int Result = Meow128_AreEqual(A, B);
    return(Result);
}

//
// NOTE(casey): 128-wide AES-NI Meow (maximum of 16 bytes/clock single threaded)
//

static meow_u128
MeowHash1(meow_u64 Seed, meow_u64 TotalLengthInBytes, void *SourceInit)
{
    //
    // NOTE(casey): Initialize all 16 streams to 0
    //
    
    meow_aes_128 S0 = Meow128_ZeroState();
    meow_aes_128 S1 = Meow128_ZeroState();
    meow_aes_128 S2 = Meow128_ZeroState();
    meow_aes_128 S3 = Meow128_ZeroState();
    meow_aes_128 S4 = Meow128_ZeroState();
    meow_aes_128 S5 = Meow128_ZeroState();
    meow_aes_128 S6 = Meow128_ZeroState();
    meow_aes_128 S7 = Meow128_ZeroState();
    meow_aes_128 S8 = Meow128_ZeroState();
    meow_aes_128 S9 = Meow128_ZeroState();
    meow_aes_128 SA = Meow128_ZeroState();
    meow_aes_128 SB = Meow128_ZeroState();
    meow_aes_128 SC = Meow128_ZeroState();
    meow_aes_128 SD = Meow128_ZeroState();
    meow_aes_128 SE = Meow128_ZeroState();
    meow_aes_128 SF = Meow128_ZeroState();
    
    //
    // NOTE(casey): Handle as many full 256-byte blocks as possible (16 cycles per block)
    //
    
    meow_u8 *Source = (meow_u8 *)SourceInit;
    meow_u64 Len = TotalLengthInBytes;
    meow_u64 BlockCount = (Len >> MEOW_HASH_BLOCK_SIZE_SHIFT);
    Len -= (BlockCount << MEOW_HASH_BLOCK_SIZE_SHIFT);
    while(BlockCount--)
    {
        S0 = Meow128_AESDEC_Mem(S0, Source);
        S1 = Meow128_AESDEC_Mem(S1, Source + 16);
        S2 = Meow128_AESDEC_Mem(S2, Source + 32);
        S3 = Meow128_AESDEC_Mem(S3, Source + 48);
        S4 = Meow128_AESDEC_Mem(S4, Source + 64);
        S5 = Meow128_AESDEC_Mem(S5, Source + 80);
        S6 = Meow128_AESDEC_Mem(S6, Source + 96);
        S7 = Meow128_AESDEC_Mem(S7, Source + 112);
        S8 = Meow128_AESDEC_Mem(S8, Source + 128);
        S9 = Meow128_AESDEC_Mem(S9, Source + 144);
        SA = Meow128_AESDEC_Mem(SA, Source + 160);
        SB = Meow128_AESDEC_Mem(SB, Source + 176);
        SC = Meow128_AESDEC_Mem(SC, Source + 192);
        SD = Meow128_AESDEC_Mem(SD, Source + 208);
        SE = Meow128_AESDEC_Mem(SE, Source + 224);
        SF = Meow128_AESDEC_Mem(SF, Source + 240);
        
        Source += (1 << MEOW_HASH_BLOCK_SIZE_SHIFT);
    }
    
    //
    // NOTE(casey): Handle as many full 128-bit lanes as possible (15 cycles at length 15)
    //
    
    switch(Len >> 4)
    {
        case 15: SE = Meow128_AESDEC_Mem(SE, Source + 224);
        case 14: SD = Meow128_AESDEC_Mem(SD, Source + 208);
        case 13: SC = Meow128_AESDEC_Mem(SC, Source + 192);
        case 12: SB = Meow128_AESDEC_Mem(SB, Source + 176);
        case 11: SA = Meow128_AESDEC_Mem(SA, Source + 160);
        case 10: S9 = Meow128_AESDEC_Mem(S9, Source + 144);
        case  9: S8 = Meow128_AESDEC_Mem(S8, Source + 128);
        case  8: S7 = Meow128_AESDEC_Mem(S7, Source + 112);
        case  7: S6 = Meow128_AESDEC_Mem(S6, Source + 96);
        case  6: S5 = Meow128_AESDEC_Mem(S5, Source + 80);
        case  5: S4 = Meow128_AESDEC_Mem(S4, Source + 64);
        case  4: S3 = Meow128_AESDEC_Mem(S3, Source + 48);
        case  3: S2 = Meow128_AESDEC_Mem(S2, Source + 32);
        case  2: S1 = Meow128_AESDEC_Mem(S1, Source + 16);
        case  1: S0 = Meow128_AESDEC_Mem(S0, Source);
        default:;
    }
    Source += (Len & 0xF0);
    
    //
    // NOTE(casey): Start as much of the mixdown as we can before handling the overhang
    //
    
    // TODO(casey): There needs to be a solid idea behind the mixing vector here.
    // Before Meow v1, we need some definitive analysis of what it should be.
    meow_u128 Mixer = Meow128_Set64x2(Seed - TotalLengthInBytes, Seed + TotalLengthInBytes + 1);

    S0 = Meow128_AESDEC(S0, Meow128_AESDEC_Finalize(S8));
    S1 = Meow128_AESDEC(S1, Meow128_AESDEC_Finalize(S9));
    S2 = Meow128_AESDEC(S2, Meow128_AESDEC_Finalize(SA));
    S3 = Meow128_AESDEC(S3, Meow128_AESDEC_Finalize(SB));
    S4 = Meow128_AESDEC(S4, Meow128_AESDEC_Finalize(SC));
    S5 = Meow128_AESDEC(S5, Meow128_AESDEC_Finalize(SD));
    S6 = Meow128_AESDEC(S6, Meow128_AESDEC_Finalize(SE));
    
    S0 = Meow128_AESDEC(S0, Mixer);
    S1 = Meow128_AESDEC(S1, Mixer);
    S2 = Meow128_AESDEC(S2, Mixer);
    S3 = Meow128_AESDEC(S3, Mixer);
    S4 = Meow128_AESDEC(S4, Mixer);
    S5 = Meow128_AESDEC(S5, Mixer);
    S6 = Meow128_AESDEC(S6, Mixer);
    
    //
    // NOTE(casey): Deal with individual bytes
    //

    if(Len & 0xF)
    {
        // NOTE(casey): Scalar partial load construction appears courtesy of Won "Hash Daddy" Chun.
        // It allows the partial bytes to be handled by the scalar pipe "in the shadow" of the
        // vector pipe.
        meow_u64 Has8 = (Len & 8);
        meow_u64 Has4 = (Len & 4);
        meow_u64 Lo = 0;
        meow_u64 Hi = 0;
        
        if(Has8)
        {
            Lo = *(meow_u64 *)Source;
        }
        
        if(Has4)
        {
            Hi = *(meow_u32 *)(Source + Has8);
        }
        
        switch (Len & 3)
        {
            case 3: Hi |= (meow_u64)(*(Source + Has8 + Has4 + 2)) << 48;
            case 2: Hi |= (meow_u64)(*(Source + Has8 + Has4 + 1)) << 40;
            case 1: Hi |= (meow_u64)(*(Source + Has8 + Has4))     << 32;
            case 0:;
        }
        meow_aes_128 PartialState = Meow128_Set64x2_State(Hi, Lo);
        SF = Meow128_AESDEC(PartialState, Meow128_AESDEC_Finalize(SF));
    }
    
    //
    // NOTE(casey): Finish the part of the mixdown that is dependent on SF
    // and then do the tree reduction (starting the tree reduction early
    // doesn't seem to save anything)
    //
    
    S7 = Meow128_AESDEC(S7, Meow128_AESDEC_Finalize(SF));
    S7 = Meow128_AESDEC(S7, Mixer);
    
    S0 = Meow128_AESDEC(S0, Meow128_AESDEC_Finalize(S4));
    S1 = Meow128_AESDEC(S1, Meow128_AESDEC_Finalize(S5));
    S2 = Meow128_AESDEC(S2, Meow128_AESDEC_Finalize(S6));
    S3 = Meow128_AESDEC(S3, Meow128_AESDEC_Finalize(S7));
    
    S0 = Meow128_AESDEC(S0, Mixer);
    S1 = Meow128_AESDEC(S1, Mixer);
    S2 = Meow128_AESDEC(S2, Mixer);
    S3 = Meow128_AESDEC(S3, Mixer);
    
    S0 = Meow128_AESDEC(S0, Meow128_AESDEC_Finalize(S2));
    S1 = Meow128_AESDEC(S1, Meow128_AESDEC_Finalize(S3));
    
    S0 = Meow128_AESDEC(S0, Meow128_AESDEC_Finalize(S1));
    S0 = Meow128_AESDEC(S0, Mixer);
    
    meow_u128 Result = Meow128_AESDEC_Finalize(S0);
    return(Result);
}

#if MEOW_HASH_AVX512

//
// NOTE(casey): 256-wide VAES Meow (maximum of 32 bytes/clock single threaded)
//

static meow_u128
MeowHash2(meow_u64 Seed, meow_u64 TotalLengthInBytes, void *Source)
{
    meow_u256 S01 = Meow256_Zero();
    meow_u256 S23 = Meow256_Zero();
    meow_u256 S45 = Meow256_Zero();
    meow_u256 S67 = Meow256_Zero();
    meow_u256 S89 = Meow256_Zero();
    meow_u256 SAB = Meow256_Zero();
    meow_u256 SCD = Meow256_Zero();
    meow_u256 SEF = Meow256_Zero();
    
    //
    // NOTE(casey): Handle as many full 256-byte blocks as possible (4 cycles per block)
    //
    
    meow_u8 *Source = (meow_u8 *)SourceInit;
    meow_u64 Len = TotalLengthInBytes;
    meow_u64 BlockCount = (Len >> MEOW_HASH_BLOCK_SIZE_SHIFT);
    Len -= (BlockCount << MEOW_HASH_BLOCK_SIZE_SHIFT);
    while(BlockCount--)
    {
        S01 = Meow256_AESDEC_Mem(Source, S01);
        S23 = Meow256_AESDEC_Mem(Source + 32, S23);
        
        S45 = Meow256_AESDEC_Mem(Source + 64, S45);
        S67 = Meow256_AESDEC_Mem(Source + 96, S67);
        
        S89 = Meow256_AESDEC_Mem(Source + 128, S89);
        SAB = Meow256_AESDEC_Mem(Source + 160, SAB);
        
        SCD = Meow256_AESDEC_Mem(Source + 192, SCD);
        SEF = Meow256_AESDEC_Mem(Source + 224, SEF);
        
        Source += (1 << MEOW_HASH_BLOCK_SIZE_SHIFT);
    }
    
    //
    // NOTE(casey): Handle as many full 32-byte blocks as possible
    //
    
    switch(Len >> 5)
    {
        case 7:
        SCD = Meow256_AESDEC_Mem(Source + 192, SCD);
        case 6:
        SAB = Meow256_AESDEC_Mem(Source + 160, SAB);
        case 5:
        S89 = Meow256_AESDEC_Mem(Source + 128, S89);
        case 4:
        S67 = Meow256_AESDEC_Mem(Source + 96, S67);
        case 3:
        S45 = Meow256_AESDEC_Mem(Source + 64, S45);
        case 2:
        S23 = Meow256_AESDEC_Mem(Source + 32, S23);
        case 1:
        S01 = Meow256_AESDEC_Mem(Source, S01);
        default:
    }
        
    meow_u256 Partial = Meow256_PartialLoad(Source + (Len & 0xE0), Len & 0x1F);
    // TODO(casey): To make the hashes equivalent, we would need to shuffle up the
    // highest 128 here to be inline with the high 128 of the 256 Partial, because
    // that's how the 128-bit works...
    SEF = Meow256_AESDEC_Mem(Partial, SEF);
    
    S01 = Meow256_AESDEC(S01, S89);
    S23 = Meow256_AESDEC(S23, SAB);
    S45 = Meow256_AESDEC(S45, SCD);
    S67 = Meow256_AESDEC(S67, SEF);
    
    S01 = Meow256_AESDEC(S01, Mixer4);
    S23 = Meow256_AESDEC(S23, Mixer4);
    S45 = Meow256_AESDEC(S45, Mixer4);
    S67 = Meow256_AESDEC(S67, Mixer4);
    
    S01 = Meow256_AESDEC(S01, S45);
    S23 = Meow256_AESDEC(S23, S67);
    
    S01 = Meow256_AESDEC(S01, S23);
    
    meow_u128 S0 = Meow128FromLow(S01);
    meow_u128 S1 = Meow128FromHIgh(S01);
    
    S0 = Meow128_AESDEC(S0, S1);
    S0 = Meow128_AESDEC(S0, Mixer1);

    return(S0);
    return(Result);
}

//
// NOTE(casey): 512-wide VAES Meow (maximum of 64 bytes/clock single threaded)
//

static meow_u128
MeowHash4(meow_u64 Seed, meow_u64 TotalLengthInBytes, void *SourceInit)
{
    //
    // NOTE(casey): Initialize all 16 streams to 0
    //
    
    meow_u512 S0123 = Meow512_Zero();
    meow_u512 S4567 = Meow512_Zero();
    meow_u512 S89AB = Meow512_Zero();
    meow_u512 SCDEF = Meow512_Zero();
    
    //
    // NOTE(casey): Handle as many full 256-byte blocks as possible (4 cycles per block)
    //
    
    meow_u8 *Source = (meow_u8 *)SourceInit;
    meow_u64 Len = TotalLengthInBytes;
    meow_u64 BlockCount = (Len >> MEOW_HASH_BLOCK_SIZE_SHIFT);
    Len -= (BlockCount << MEOW_HASH_BLOCK_SIZE_SHIFT);
    while(BlockCount--)
    {
        S0123 = Meow512_AESDEC_Mem(Source, S0123);
        S4567 = Meow512_AESDEC_Mem(Source + 64, S4567);
        S89AB = Meow512_AESDEC_Mem(Source + 128, S89AB);
        SCDEF = Meow512_AESDEC_Mem(Source + 192, SCDEF);
        
        Source += (1 << MEOW_HASH_BLOCK_SIZE_SHIFT);
    }
    
    //
    // NOTE(casey): Handle as many full 64-byte blocks as possible
    //
    
    switch(Len >> 6)
    {
        case 3:
        S89AB = Meow512_AESDEC_Mem(Source + 128, S89AB);
        case 2:
        S4567 = Meow512_AESDEC_Mem(Source + 64, S4567);
        case 1:
        S0123 = Meow512_AESDEC_Mem(Source, S0123);
        default:
    }
    
    meow_u512 Partial = Meow512_PartialLoad(Source + (Len & 0xC0), Len & 0x3F);
    // TODO(casey): To make the hashes equivalent, we would need to shuffle up the
    // highest 128 here to be inline with the high 128 of the 512 Partial, because
    // that's how the 128-bit works...
    
    SCDEF = Meow512_AESDEC(Partial, SCDEF);
    S0123 = Meow512_AESDEC(S0123, S89AB);
    S4567 = Meow512_AESDEC(S4567, SCDEF);
    
    S0123 = Meow512_AESDEC(S0123, Mixer4);
    S4567 = Meow512_AESDEC(S4567, Mixer4);
    
    S0123 = Meow512_AESDEC(S0123, S4567);
    
    meow_u256 S01 = Meow256FromLow(S0123);
    meow_u256 S23 = Meow256FromHigh(S0123);
    S01 = Meow256_AESDEC(S01, S23);
    
    meow_u128 S0 = Meow128FromLow(S01);
    meow_u128 S1 = Meow128FromHIgh(S01);
    
    S0 = Meow128_AESDEC(S0, S1);
    S0 = Meow128_AESDEC(S0, Mixer1);

    return(S0);
}

#endif

//
// NOTE(casey): Streaming construction (optional)
//

typedef struct meow_hash_state
{
    union
    {
        struct
        {
            meow_aes_128 S0;
            meow_aes_128 S1;
            meow_aes_128 S2;
            meow_aes_128 S3;
            meow_aes_128 S4;
            meow_aes_128 S5;
            meow_aes_128 S6;
            meow_aes_128 S7;
            meow_aes_128 S8;
            meow_aes_128 S9;
            meow_aes_128 SA;
            meow_aes_128 SB;
            meow_aes_128 SC;
            meow_aes_128 SD;
            meow_aes_128 SE;
            meow_aes_128 SF;
        };
        
#if MEOW_HASH_AVX512
        struct
        {
            meow_aes_256 S01;
            meow_aes_256 S23;
            meow_aes_256 S45;
            meow_aes_256 S67;
            meow_aes_256 S89;
            meow_aes_256 SAB;
            meow_aes_256 SCD;
            meow_aes_256 SEF;
        };
        
        struct
        {
            meow_aes_512 S0123;
            meow_aes_512 S4567;
            meow_aes_512 S89AB;
            meow_aes_512 SCDEF;
        };
#endif
    };
    
    meow_u64 TotalLengthInBytes;
    
    meow_u8 Buffer[1 << MEOW_HASH_BLOCK_SIZE_SHIFT];
    int unsigned BufferLen;
} meow_hash_state;

static void
MeowHashBegin(meow_hash_state *State)
{
    //
    // NOTE(casey): Initialize all 16 streams to 0
    //
    
    State->S0 = Meow128_ZeroState();
    State->S1 = Meow128_ZeroState();
    State->S2 = Meow128_ZeroState();
    State->S3 = Meow128_ZeroState();
    State->S4 = Meow128_ZeroState();
    State->S5 = Meow128_ZeroState();
    State->S6 = Meow128_ZeroState();
    State->S7 = Meow128_ZeroState();
    State->S8 = Meow128_ZeroState();
    State->S9 = Meow128_ZeroState();
    State->SA = Meow128_ZeroState();
    State->SB = Meow128_ZeroState();
    State->SC = Meow128_ZeroState();
    State->SD = Meow128_ZeroState();
    State->SE = Meow128_ZeroState();
    State->SF = Meow128_ZeroState();
    
    State->TotalLengthInBytes = 0;
    State->BufferLen = 0;
}

static void
MeowHashAbsorbBlocks1(meow_hash_state *State, meow_u64 BlockCount, meow_u8 *Source)
{
    meow_aes_128 S0 = State->S0;
    meow_aes_128 S1 = State->S1;
    meow_aes_128 S2 = State->S2;
    meow_aes_128 S3 = State->S3;
    meow_aes_128 S4 = State->S4;
    meow_aes_128 S5 = State->S5;
    meow_aes_128 S6 = State->S6;
    meow_aes_128 S7 = State->S7;
    meow_aes_128 S8 = State->S8;
    meow_aes_128 S9 = State->S9;
    meow_aes_128 SA = State->SA;
    meow_aes_128 SB = State->SB;
    meow_aes_128 SC = State->SC;
    meow_aes_128 SD = State->SD;
    meow_aes_128 SE = State->SE;
    meow_aes_128 SF = State->SF;

    while(BlockCount--)
    {
        S0 = Meow128_AESDEC_Mem(S0, Source);
        S1 = Meow128_AESDEC_Mem(S1, Source + 16);
        S2 = Meow128_AESDEC_Mem(S2, Source + 32);
        S3 = Meow128_AESDEC_Mem(S3, Source + 48);
        S4 = Meow128_AESDEC_Mem(S4, Source + 64);
        S5 = Meow128_AESDEC_Mem(S5, Source + 80);
        S6 = Meow128_AESDEC_Mem(S6, Source + 96);
        S7 = Meow128_AESDEC_Mem(S7, Source + 112);
        S8 = Meow128_AESDEC_Mem(S8, Source + 128);
        S9 = Meow128_AESDEC_Mem(S9, Source + 144);
        SA = Meow128_AESDEC_Mem(SA, Source + 160);
        SB = Meow128_AESDEC_Mem(SB, Source + 176);
        SC = Meow128_AESDEC_Mem(SC, Source + 192);
        SD = Meow128_AESDEC_Mem(SD, Source + 208);
        SE = Meow128_AESDEC_Mem(SE, Source + 224);
        SF = Meow128_AESDEC_Mem(SF, Source + 240);
        
        Source += (1 << MEOW_HASH_BLOCK_SIZE_SHIFT);
    }
    
    State->S0 = S0;
    State->S1 = S1;
    State->S2 = S2;
    State->S3 = S3;
    State->S4 = S4;
    State->S5 = S5;
    State->S6 = S6;
    State->S7 = S7;
    State->S8 = S8;
    State->S9 = S9;
    State->SA = SA;
    State->SB = SB;
    State->SC = SC;
    State->SD = SD;
    State->SE = SE;
    State->SF = SF;
}

static void
MeowHashAbsorb1(meow_hash_state *State, meow_u64 Len, void *SourceInit)
{
    State->TotalLengthInBytes += Len;
    meow_u8 *Source = (meow_u8 *)SourceInit;
    
    // NOTE(casey): Handle any buffered residual
    if(State->BufferLen)
    {
        int unsigned Fill = (sizeof(State->Buffer) - State->BufferLen);
        if(Fill > Len)
        {
            Fill = (int unsigned)Len;
        }
    
        Len -= Fill;
        while(Fill--)
        {
            State->Buffer[State->BufferLen++] = *Source++;
        }
        
        if(State->BufferLen == sizeof(State->Buffer))
        {
            MeowHashAbsorbBlocks1(State, 1, State->Buffer);
            State->BufferLen = 0;
        }
    }
    
    // NOTE(casey): Handle any full blocks
    meow_u64 BlockCount = (Len >> MEOW_HASH_BLOCK_SIZE_SHIFT);
    meow_u64 Advance = (BlockCount << MEOW_HASH_BLOCK_SIZE_SHIFT);
    MeowHashAbsorbBlocks1(State, BlockCount, Source);
    
    Len -= Advance;
    Source += Advance;
    
    // NOTE(casey): Store residual
    while(Len--)
    {
        State->Buffer[State->BufferLen++] = *Source++;
    }
}

static meow_u128
MeowHashEnd(meow_hash_state *State, meow_u64 Seed)
{
    meow_aes_128 S0 = State->S0;
    meow_aes_128 S1 = State->S1;
    meow_aes_128 S2 = State->S2;
    meow_aes_128 S3 = State->S3;
    meow_aes_128 S4 = State->S4;
    meow_aes_128 S5 = State->S5;
    meow_aes_128 S6 = State->S6;
    meow_aes_128 S7 = State->S7;
    meow_aes_128 S8 = State->S8;
    meow_aes_128 S9 = State->S9;
    meow_aes_128 SA = State->SA;
    meow_aes_128 SB = State->SB;
    meow_aes_128 SC = State->SC;
    meow_aes_128 SD = State->SD;
    meow_aes_128 SE = State->SE;
    meow_aes_128 SF = State->SF;

    meow_u8 *Source = State->Buffer;
    int unsigned Len = State->BufferLen;
    
    switch(Len >> 4)
    {
        case 15: SE = Meow128_AESDEC_Mem(SE, Source + 224);
        case 14: SD = Meow128_AESDEC_Mem(SD, Source + 208);
        case 13: SC = Meow128_AESDEC_Mem(SC, Source + 192);
        case 12: SB = Meow128_AESDEC_Mem(SB, Source + 176);
        case 11: SA = Meow128_AESDEC_Mem(SA, Source + 160);
        case 10: S9 = Meow128_AESDEC_Mem(S9, Source + 144);
        case  9: S8 = Meow128_AESDEC_Mem(S8, Source + 128);
        case  8: S7 = Meow128_AESDEC_Mem(S7, Source + 112);
        case  7: S6 = Meow128_AESDEC_Mem(S6, Source + 96);
        case  6: S5 = Meow128_AESDEC_Mem(S5, Source + 80);
        case  5: S4 = Meow128_AESDEC_Mem(S4, Source + 64);
        case  4: S3 = Meow128_AESDEC_Mem(S3, Source + 48);
        case  3: S2 = Meow128_AESDEC_Mem(S2, Source + 32);
        case  2: S1 = Meow128_AESDEC_Mem(S1, Source + 16);
        case  1: S0 = Meow128_AESDEC_Mem(S0, Source);
        default:;
    }
    Source += (Len & 0xF0);

    //
    // NOTE(casey): Deal with individual bytes
    //

    if(Len & 0xF)
    {
        // NOTE(casey): Scalar partial load construction appears courtesy of Won "Hash Daddy" Chun.
        // It allows the partial bytes to be handled by the scalar pipe "in the shadow" of the
        // vector pipe.
        meow_u64 Has8 = (Len & 8);
        meow_u64 Has4 = (Len & 4);
        meow_u64 Lo = 0;
        meow_u64 Hi = 0;
        
        if(Has8)
        {
            Lo = *(meow_u64 *)Source;
        }
        
        if(Has4)
        {
            Hi = *(meow_u32 *)(Source + Has8);
        }
        
        switch (Len & 3)
        {
            case 3: Hi |= (meow_u64)(*(Source + Has8 + Has4 + 2)) << 48;
            case 2: Hi |= (meow_u64)(*(Source + Has8 + Has4 + 1)) << 40;
            case 1: Hi |= (meow_u64)(*(Source + Has8 + Has4))     << 32;
            case 0:;
        }
        meow_aes_128 PartialState = Meow128_Set64x2_State(Hi, Lo);
        SF = Meow128_AESDEC(PartialState, Meow128_AESDEC_Finalize(SF));
    }
    
    meow_u128 Mixer = Meow128_Set64x2(Seed - State->TotalLengthInBytes,
                                      Seed + State->TotalLengthInBytes + 1);
    
    S0 = Meow128_AESDEC(S0, Meow128_AESDEC_Finalize(S8));
    S1 = Meow128_AESDEC(S1, Meow128_AESDEC_Finalize(S9));
    S2 = Meow128_AESDEC(S2, Meow128_AESDEC_Finalize(SA));
    S3 = Meow128_AESDEC(S3, Meow128_AESDEC_Finalize(SB));
    S4 = Meow128_AESDEC(S4, Meow128_AESDEC_Finalize(SC));
    S5 = Meow128_AESDEC(S5, Meow128_AESDEC_Finalize(SD));
    S6 = Meow128_AESDEC(S6, Meow128_AESDEC_Finalize(SE));
    S7 = Meow128_AESDEC(S7, Meow128_AESDEC_Finalize(SF));
    
    S0 = Meow128_AESDEC(S0, Mixer);
    S1 = Meow128_AESDEC(S1, Mixer);
    S2 = Meow128_AESDEC(S2, Mixer);
    S3 = Meow128_AESDEC(S3, Mixer);
    S4 = Meow128_AESDEC(S4, Mixer);
    S5 = Meow128_AESDEC(S5, Mixer);
    S6 = Meow128_AESDEC(S6, Mixer);
    S7 = Meow128_AESDEC(S7, Mixer);
    
    S0 = Meow128_AESDEC(S0, Meow128_AESDEC_Finalize(S4));
    S1 = Meow128_AESDEC(S1, Meow128_AESDEC_Finalize(S5));
    S2 = Meow128_AESDEC(S2, Meow128_AESDEC_Finalize(S6));
    S3 = Meow128_AESDEC(S3, Meow128_AESDEC_Finalize(S7));
    
    S0 = Meow128_AESDEC(S0, Mixer);
    S1 = Meow128_AESDEC(S1, Mixer);
    S2 = Meow128_AESDEC(S2, Mixer);
    S3 = Meow128_AESDEC(S3, Mixer);
    
    S0 = Meow128_AESDEC(S0, Meow128_AESDEC_Finalize(S2));
    S1 = Meow128_AESDEC(S1, Meow128_AESDEC_Finalize(S3));
    
    S0 = Meow128_AESDEC(S0, Meow128_AESDEC_Finalize(S1));
    S0 = Meow128_AESDEC(S0, Mixer);
    
    meow_u128 Result = Meow128_AESDEC_Finalize(S0);
    return(Result);
}
