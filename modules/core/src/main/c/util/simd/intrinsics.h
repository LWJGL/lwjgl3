/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
#pragma once

#if defined(_MSC_VER)
    /* Microsoft C/C++-compatible compiler */
    DISABLE_WARNINGS()
    #include <intrin.h>
    ENABLE_WARNINGS()
#elif defined(__GNUC__) && (defined(__x86_64__) || defined(__i386__))
    /* GCC-compatible compiler, targeting x86/x86-64 */
    #include <x86intrin.h>
#elif defined(__GNUC__) && defined(__ARM_NEON__)
    /* GCC-compatible compiler, targeting ARM with NEON */
    #include <arm_neon.h>
#elif defined(__GNUC__) && defined(__IWMMXT__)
    /* GCC-compatible compiler, targeting ARM with WMMX */
    #include <mmintrin.h>
#elif (defined(__GNUC__) || defined(__xlC__)) && (defined(__VEC__) || defined(__ALTIVEC__))
    /* XLC or GCC-compatible compiler, targeting PowerPC with VMX/VSX */
    #include <altivec.h>
#elif defined(__GNUC__) && defined(__SPE__)
    /* GCC-compatible compiler, targeting PowerPC with SPE */
    #include <spe.h>
#endif
