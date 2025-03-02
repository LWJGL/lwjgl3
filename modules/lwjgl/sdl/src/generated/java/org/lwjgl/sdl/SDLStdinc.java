/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.sdl;

import org.jspecify.annotations.*;

import java.nio.*;

import org.lwjgl.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.APIUtil.*;
import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.JNI.*;
import static org.lwjgl.system.MemoryStack.*;
import static org.lwjgl.system.MemoryUtil.*;

public class SDLStdinc {

    /** Contains the function pointers loaded from {@code SDL.getLibrary()}. */
    public static final class Functions {

        private Functions() {}

        /** Function address. */
        public static final long
            malloc                     = apiGetFunctionAddress(SDL.getLibrary(), "SDL_malloc"),
            calloc                     = apiGetFunctionAddress(SDL.getLibrary(), "SDL_calloc"),
            realloc                    = apiGetFunctionAddress(SDL.getLibrary(), "SDL_realloc"),
            free                       = apiGetFunctionAddress(SDL.getLibrary(), "SDL_free"),
            GetOriginalMemoryFunctions = apiGetFunctionAddress(SDL.getLibrary(), "SDL_GetOriginalMemoryFunctions"),
            GetMemoryFunctions         = apiGetFunctionAddress(SDL.getLibrary(), "SDL_GetMemoryFunctions"),
            SetMemoryFunctions         = apiGetFunctionAddress(SDL.getLibrary(), "SDL_SetMemoryFunctions"),
            aligned_alloc              = apiGetFunctionAddress(SDL.getLibrary(), "SDL_aligned_alloc"),
            aligned_free               = apiGetFunctionAddress(SDL.getLibrary(), "SDL_aligned_free"),
            GetNumAllocations          = apiGetFunctionAddress(SDL.getLibrary(), "SDL_GetNumAllocations"),
            GetEnvironment             = apiGetFunctionAddress(SDL.getLibrary(), "SDL_GetEnvironment"),
            CreateEnvironment          = apiGetFunctionAddress(SDL.getLibrary(), "SDL_CreateEnvironment"),
            GetEnvironmentVariable     = apiGetFunctionAddress(SDL.getLibrary(), "SDL_GetEnvironmentVariable"),
            GetEnvironmentVariables    = apiGetFunctionAddress(SDL.getLibrary(), "SDL_GetEnvironmentVariables"),
            SetEnvironmentVariable     = apiGetFunctionAddress(SDL.getLibrary(), "SDL_SetEnvironmentVariable"),
            UnsetEnvironmentVariable   = apiGetFunctionAddress(SDL.getLibrary(), "SDL_UnsetEnvironmentVariable"),
            DestroyEnvironment         = apiGetFunctionAddress(SDL.getLibrary(), "SDL_DestroyEnvironment"),
            getenv                     = apiGetFunctionAddress(SDL.getLibrary(), "SDL_getenv"),
            getenv_unsafe              = apiGetFunctionAddress(SDL.getLibrary(), "SDL_getenv_unsafe"),
            setenv_unsafe              = apiGetFunctionAddress(SDL.getLibrary(), "SDL_setenv_unsafe"),
            unsetenv_unsafe            = apiGetFunctionAddress(SDL.getLibrary(), "SDL_unsetenv_unsafe"),
            qsort                      = apiGetFunctionAddress(SDL.getLibrary(), "SDL_qsort"),
            bsearch                    = apiGetFunctionAddress(SDL.getLibrary(), "SDL_bsearch"),
            qsort_r                    = apiGetFunctionAddress(SDL.getLibrary(), "SDL_qsort_r"),
            bsearch_r                  = apiGetFunctionAddress(SDL.getLibrary(), "SDL_bsearch_r"),
            crc16                      = apiGetFunctionAddress(SDL.getLibrary(), "SDL_crc16"),
            crc32                      = apiGetFunctionAddress(SDL.getLibrary(), "SDL_crc32"),
            murmur3_32                 = apiGetFunctionAddress(SDL.getLibrary(), "SDL_murmur3_32"),
            memset4                    = apiGetFunctionAddress(SDL.getLibrary(), "SDL_memset4"),
            memcmp                     = apiGetFunctionAddress(SDL.getLibrary(), "SDL_memcmp"),
            srand                      = apiGetFunctionAddress(SDL.getLibrary(), "SDL_srand"),
            rand                       = apiGetFunctionAddress(SDL.getLibrary(), "SDL_rand"),
            randf                      = apiGetFunctionAddress(SDL.getLibrary(), "SDL_randf"),
            rand_bits                  = apiGetFunctionAddress(SDL.getLibrary(), "SDL_rand_bits"),
            rand_r                     = apiGetFunctionAddress(SDL.getLibrary(), "SDL_rand_r"),
            randf_r                    = apiGetFunctionAddress(SDL.getLibrary(), "SDL_randf_r"),
            rand_bits_r                = apiGetFunctionAddress(SDL.getLibrary(), "SDL_rand_bits_r");

    }

    public static final float SDL_FLT_EPSILON = 1.1920928955078125e-07F;

    public static final int SDL_INVALID_UNICODE_CODEPOINT = 0xFFFD;

    protected SDLStdinc() {
        throw new UnsupportedOperationException();
    }

    // --- [ SDL_malloc ] ---

    /** {@code void * SDL_malloc(size_t size)} */
    public static long nSDL_malloc(long size) {
        long __functionAddress = Functions.malloc;
        return invokePP(size, __functionAddress);
    }

    /** {@code void * SDL_malloc(size_t size)} */
    @NativeType("void *")
    public static @Nullable ByteBuffer SDL_malloc(@NativeType("size_t") long size) {
        long __result = nSDL_malloc(size);
        return memByteBufferSafe(__result, (int)size);
    }

    // --- [ SDL_calloc ] ---

    /** {@code void * SDL_calloc(size_t nmemb, size_t size)} */
    public static long nSDL_calloc(long nmemb, long size) {
        long __functionAddress = Functions.calloc;
        return invokePPP(nmemb, size, __functionAddress);
    }

    /** {@code void * SDL_calloc(size_t nmemb, size_t size)} */
    @NativeType("void *")
    public static @Nullable ByteBuffer SDL_calloc(@NativeType("size_t") long nmemb, @NativeType("size_t") long size) {
        long __result = nSDL_calloc(nmemb, size);
        return memByteBufferSafe(__result, (int)nmemb * (int)size);
    }

    // --- [ SDL_realloc ] ---

    /** {@code void * SDL_realloc(void * mem, size_t size)} */
    public static long nSDL_realloc(long mem, long size) {
        long __functionAddress = Functions.realloc;
        return invokePPP(mem, size, __functionAddress);
    }

    /** {@code void * SDL_realloc(void * mem, size_t size)} */
    @NativeType("void *")
    public static @Nullable ByteBuffer SDL_realloc(@NativeType("void *") @Nullable ByteBuffer mem, @NativeType("size_t") long size) {
        long __result = nSDL_realloc(memAddressSafe(mem), size);
        return memByteBufferSafe(__result, (int)size);
    }

    // --- [ SDL_free ] ---

    /** {@code void SDL_free(void * mem)} */
    public static void nSDL_free(long mem) {
        long __functionAddress = Functions.free;
        invokePV(mem, __functionAddress);
    }

    /** {@code void SDL_free(void * mem)} */
    public static void SDL_free(@NativeType("void *") @Nullable ByteBuffer mem) {
        nSDL_free(memAddressSafe(mem));
    }

    /** {@code void SDL_free(void * mem)} */
    public static void SDL_free(@NativeType("void *") @Nullable IntBuffer mem) {
        nSDL_free(memAddressSafe(mem));
    }

    /** {@code void SDL_free(void * mem)} */
    public static void SDL_free(@NativeType("void *") @Nullable LongBuffer mem) {
        nSDL_free(memAddressSafe(mem));
    }

    /** {@code void SDL_free(void * mem)} */
    public static void SDL_free(@NativeType("void *") @Nullable PointerBuffer mem) {
        nSDL_free(memAddressSafe(mem));
    }

    // --- [ SDL_GetOriginalMemoryFunctions ] ---

    /** {@code void SDL_GetOriginalMemoryFunctions(SDL_malloc_func * malloc_func, SDL_calloc_func * calloc_func, SDL_realloc_func * realloc_func, SDL_free_func * free_func)} */
    public static void nSDL_GetOriginalMemoryFunctions(long malloc_func, long calloc_func, long realloc_func, long free_func) {
        long __functionAddress = Functions.GetOriginalMemoryFunctions;
        invokePPPPV(malloc_func, calloc_func, realloc_func, free_func, __functionAddress);
    }

    /** {@code void SDL_GetOriginalMemoryFunctions(SDL_malloc_func * malloc_func, SDL_calloc_func * calloc_func, SDL_realloc_func * realloc_func, SDL_free_func * free_func)} */
    public static void SDL_GetOriginalMemoryFunctions(@NativeType("SDL_malloc_func *") @Nullable PointerBuffer malloc_func, @NativeType("SDL_calloc_func *") @Nullable PointerBuffer calloc_func, @NativeType("SDL_realloc_func *") @Nullable PointerBuffer realloc_func, @NativeType("SDL_free_func *") @Nullable PointerBuffer free_func) {
        if (CHECKS) {
            checkSafe(malloc_func, 1);
            checkSafe(calloc_func, 1);
            checkSafe(realloc_func, 1);
            checkSafe(free_func, 1);
        }
        nSDL_GetOriginalMemoryFunctions(memAddressSafe(malloc_func), memAddressSafe(calloc_func), memAddressSafe(realloc_func), memAddressSafe(free_func));
    }

    // --- [ SDL_GetMemoryFunctions ] ---

    /** {@code void SDL_GetMemoryFunctions(SDL_malloc_func * malloc_func, SDL_calloc_func * calloc_func, SDL_realloc_func * realloc_func, SDL_free_func * free_func)} */
    public static void nSDL_GetMemoryFunctions(long malloc_func, long calloc_func, long realloc_func, long free_func) {
        long __functionAddress = Functions.GetMemoryFunctions;
        invokePPPPV(malloc_func, calloc_func, realloc_func, free_func, __functionAddress);
    }

    /** {@code void SDL_GetMemoryFunctions(SDL_malloc_func * malloc_func, SDL_calloc_func * calloc_func, SDL_realloc_func * realloc_func, SDL_free_func * free_func)} */
    public static void SDL_GetMemoryFunctions(@NativeType("SDL_malloc_func *") @Nullable PointerBuffer malloc_func, @NativeType("SDL_calloc_func *") @Nullable PointerBuffer calloc_func, @NativeType("SDL_realloc_func *") @Nullable PointerBuffer realloc_func, @NativeType("SDL_free_func *") @Nullable PointerBuffer free_func) {
        if (CHECKS) {
            checkSafe(malloc_func, 1);
            checkSafe(calloc_func, 1);
            checkSafe(realloc_func, 1);
            checkSafe(free_func, 1);
        }
        nSDL_GetMemoryFunctions(memAddressSafe(malloc_func), memAddressSafe(calloc_func), memAddressSafe(realloc_func), memAddressSafe(free_func));
    }

    // --- [ SDL_SetMemoryFunctions ] ---

    /** {@code bool SDL_SetMemoryFunctions(SDL_malloc_func malloc_func, SDL_calloc_func calloc_func, SDL_realloc_func realloc_func, SDL_free_func free_func)} */
    public static boolean nSDL_SetMemoryFunctions(long malloc_func, long calloc_func, long realloc_func, long free_func) {
        long __functionAddress = Functions.SetMemoryFunctions;
        return invokePPPPZ(malloc_func, calloc_func, realloc_func, free_func, __functionAddress);
    }

    /** {@code bool SDL_SetMemoryFunctions(SDL_malloc_func malloc_func, SDL_calloc_func calloc_func, SDL_realloc_func realloc_func, SDL_free_func free_func)} */
    @NativeType("bool")
    public static boolean SDL_SetMemoryFunctions(@NativeType("SDL_malloc_func") SDL_malloc_funcI malloc_func, @NativeType("SDL_calloc_func") SDL_calloc_funcI calloc_func, @NativeType("SDL_realloc_func") SDL_realloc_funcI realloc_func, @NativeType("SDL_free_func") SDL_free_funcI free_func) {
        return nSDL_SetMemoryFunctions(malloc_func.address(), calloc_func.address(), realloc_func.address(), free_func.address());
    }

    // --- [ SDL_aligned_alloc ] ---

    /** {@code void * SDL_aligned_alloc(size_t alignment, size_t size)} */
    public static long nSDL_aligned_alloc(long alignment, long size) {
        long __functionAddress = Functions.aligned_alloc;
        return invokePPP(alignment, size, __functionAddress);
    }

    /** {@code void * SDL_aligned_alloc(size_t alignment, size_t size)} */
    @NativeType("void *")
    public static @Nullable ByteBuffer SDL_aligned_alloc(@NativeType("size_t") long alignment, @NativeType("size_t") long size) {
        long __result = nSDL_aligned_alloc(alignment, size);
        return memByteBufferSafe(__result, (int)size);
    }

    // --- [ SDL_aligned_free ] ---

    /** {@code void SDL_aligned_free(void * mem)} */
    public static void nSDL_aligned_free(long mem) {
        long __functionAddress = Functions.aligned_free;
        invokePV(mem, __functionAddress);
    }

    /** {@code void SDL_aligned_free(void * mem)} */
    public static void SDL_aligned_free(@NativeType("void *") @Nullable ByteBuffer mem) {
        nSDL_aligned_free(memAddressSafe(mem));
    }

    // --- [ SDL_GetNumAllocations ] ---

    /** {@code int SDL_GetNumAllocations(void)} */
    public static int SDL_GetNumAllocations() {
        long __functionAddress = Functions.GetNumAllocations;
        return invokeI(__functionAddress);
    }

    // --- [ SDL_GetEnvironment ] ---

    /** {@code SDL_Environment * SDL_GetEnvironment(void)} */
    @NativeType("SDL_Environment *")
    public static long SDL_GetEnvironment() {
        long __functionAddress = Functions.GetEnvironment;
        return invokeP(__functionAddress);
    }

    // --- [ SDL_CreateEnvironment ] ---

    /** {@code SDL_Environment * SDL_CreateEnvironment(bool populated)} */
    @NativeType("SDL_Environment *")
    public static long SDL_CreateEnvironment(@NativeType("bool") boolean populated) {
        long __functionAddress = Functions.CreateEnvironment;
        return invokeP(populated, __functionAddress);
    }

    // --- [ SDL_GetEnvironmentVariable ] ---

    /** {@code char const * SDL_GetEnvironmentVariable(SDL_Environment * env, char const * name)} */
    public static long nSDL_GetEnvironmentVariable(long env, long name) {
        long __functionAddress = Functions.GetEnvironmentVariable;
        if (CHECKS) {
            check(env);
        }
        return invokePPP(env, name, __functionAddress);
    }

    /** {@code char const * SDL_GetEnvironmentVariable(SDL_Environment * env, char const * name)} */
    @NativeType("char const *")
    public static @Nullable String SDL_GetEnvironmentVariable(@NativeType("SDL_Environment *") long env, @NativeType("char const *") ByteBuffer name) {
        if (CHECKS) {
            checkNT1(name);
        }
        long __result = nSDL_GetEnvironmentVariable(env, memAddress(name));
        return memUTF8Safe(__result);
    }

    /** {@code char const * SDL_GetEnvironmentVariable(SDL_Environment * env, char const * name)} */
    @NativeType("char const *")
    public static @Nullable String SDL_GetEnvironmentVariable(@NativeType("SDL_Environment *") long env, @NativeType("char const *") CharSequence name) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nUTF8(name, true);
            long nameEncoded = stack.getPointerAddress();
            long __result = nSDL_GetEnvironmentVariable(env, nameEncoded);
            return memUTF8Safe(__result);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ SDL_GetEnvironmentVariables ] ---

    /** {@code void * SDL_GetEnvironmentVariables(SDL_Environment * env)} */
    @NativeType("void *")
    public static long SDL_GetEnvironmentVariables(@NativeType("SDL_Environment *") long env) {
        long __functionAddress = Functions.GetEnvironmentVariables;
        if (CHECKS) {
            check(env);
        }
        return invokePP(env, __functionAddress);
    }

    // --- [ SDL_SetEnvironmentVariable ] ---

    /** {@code bool SDL_SetEnvironmentVariable(SDL_Environment * env, char const * name, char const * value, bool overwrite)} */
    public static boolean nSDL_SetEnvironmentVariable(long env, long name, long value, boolean overwrite) {
        long __functionAddress = Functions.SetEnvironmentVariable;
        if (CHECKS) {
            check(env);
        }
        return invokePPPZ(env, name, value, overwrite, __functionAddress);
    }

    /** {@code bool SDL_SetEnvironmentVariable(SDL_Environment * env, char const * name, char const * value, bool overwrite)} */
    @NativeType("bool")
    public static boolean SDL_SetEnvironmentVariable(@NativeType("SDL_Environment *") long env, @NativeType("char const *") ByteBuffer name, @NativeType("char const *") ByteBuffer value, @NativeType("bool") boolean overwrite) {
        if (CHECKS) {
            checkNT1(name);
            checkNT1(value);
        }
        return nSDL_SetEnvironmentVariable(env, memAddress(name), memAddress(value), overwrite);
    }

    /** {@code bool SDL_SetEnvironmentVariable(SDL_Environment * env, char const * name, char const * value, bool overwrite)} */
    @NativeType("bool")
    public static boolean SDL_SetEnvironmentVariable(@NativeType("SDL_Environment *") long env, @NativeType("char const *") CharSequence name, @NativeType("char const *") CharSequence value, @NativeType("bool") boolean overwrite) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nUTF8(name, true);
            long nameEncoded = stack.getPointerAddress();
            stack.nUTF8(value, true);
            long valueEncoded = stack.getPointerAddress();
            return nSDL_SetEnvironmentVariable(env, nameEncoded, valueEncoded, overwrite);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ SDL_UnsetEnvironmentVariable ] ---

    /** {@code bool SDL_UnsetEnvironmentVariable(SDL_Environment * env, char const * name)} */
    public static boolean nSDL_UnsetEnvironmentVariable(long env, long name) {
        long __functionAddress = Functions.UnsetEnvironmentVariable;
        if (CHECKS) {
            check(env);
        }
        return invokePPZ(env, name, __functionAddress);
    }

    /** {@code bool SDL_UnsetEnvironmentVariable(SDL_Environment * env, char const * name)} */
    @NativeType("bool")
    public static boolean SDL_UnsetEnvironmentVariable(@NativeType("SDL_Environment *") long env, @NativeType("char const *") ByteBuffer name) {
        if (CHECKS) {
            checkNT1(name);
        }
        return nSDL_UnsetEnvironmentVariable(env, memAddress(name));
    }

    /** {@code bool SDL_UnsetEnvironmentVariable(SDL_Environment * env, char const * name)} */
    @NativeType("bool")
    public static boolean SDL_UnsetEnvironmentVariable(@NativeType("SDL_Environment *") long env, @NativeType("char const *") CharSequence name) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nUTF8(name, true);
            long nameEncoded = stack.getPointerAddress();
            return nSDL_UnsetEnvironmentVariable(env, nameEncoded);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ SDL_DestroyEnvironment ] ---

    /** {@code void SDL_DestroyEnvironment(SDL_Environment * env)} */
    public static void SDL_DestroyEnvironment(@NativeType("SDL_Environment *") long env) {
        long __functionAddress = Functions.DestroyEnvironment;
        if (CHECKS) {
            check(env);
        }
        invokePV(env, __functionAddress);
    }

    // --- [ SDL_getenv ] ---

    /** {@code char const * SDL_getenv(char const * name)} */
    public static long nSDL_getenv(long name) {
        long __functionAddress = Functions.getenv;
        return invokePP(name, __functionAddress);
    }

    /** {@code char const * SDL_getenv(char const * name)} */
    @NativeType("char const *")
    public static @Nullable String SDL_getenv(@NativeType("char const *") ByteBuffer name) {
        if (CHECKS) {
            checkNT1(name);
        }
        long __result = nSDL_getenv(memAddress(name));
        return memUTF8Safe(__result);
    }

    /** {@code char const * SDL_getenv(char const * name)} */
    @NativeType("char const *")
    public static @Nullable String SDL_getenv(@NativeType("char const *") CharSequence name) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nUTF8(name, true);
            long nameEncoded = stack.getPointerAddress();
            long __result = nSDL_getenv(nameEncoded);
            return memUTF8Safe(__result);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ SDL_getenv_unsafe ] ---

    /** {@code char const * SDL_getenv_unsafe(char const * name)} */
    public static long nSDL_getenv_unsafe(long name) {
        long __functionAddress = Functions.getenv_unsafe;
        return invokePP(name, __functionAddress);
    }

    /** {@code char const * SDL_getenv_unsafe(char const * name)} */
    @NativeType("char const *")
    public static @Nullable String SDL_getenv_unsafe(@NativeType("char const *") ByteBuffer name) {
        if (CHECKS) {
            checkNT1(name);
        }
        long __result = nSDL_getenv_unsafe(memAddress(name));
        return memUTF8Safe(__result);
    }

    /** {@code char const * SDL_getenv_unsafe(char const * name)} */
    @NativeType("char const *")
    public static @Nullable String SDL_getenv_unsafe(@NativeType("char const *") CharSequence name) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nUTF8(name, true);
            long nameEncoded = stack.getPointerAddress();
            long __result = nSDL_getenv_unsafe(nameEncoded);
            return memUTF8Safe(__result);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ SDL_setenv_unsafe ] ---

    /** {@code int SDL_setenv_unsafe(char const * name, char const * value, int overwrite)} */
    public static int nSDL_setenv_unsafe(long name, long value, int overwrite) {
        long __functionAddress = Functions.setenv_unsafe;
        return invokePPI(name, value, overwrite, __functionAddress);
    }

    /** {@code int SDL_setenv_unsafe(char const * name, char const * value, int overwrite)} */
    public static int SDL_setenv_unsafe(@NativeType("char const *") ByteBuffer name, @NativeType("char const *") ByteBuffer value, int overwrite) {
        if (CHECKS) {
            checkNT1(name);
            checkNT1(value);
        }
        return nSDL_setenv_unsafe(memAddress(name), memAddress(value), overwrite);
    }

    /** {@code int SDL_setenv_unsafe(char const * name, char const * value, int overwrite)} */
    public static int SDL_setenv_unsafe(@NativeType("char const *") CharSequence name, @NativeType("char const *") CharSequence value, int overwrite) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nUTF8(name, true);
            long nameEncoded = stack.getPointerAddress();
            stack.nUTF8(value, true);
            long valueEncoded = stack.getPointerAddress();
            return nSDL_setenv_unsafe(nameEncoded, valueEncoded, overwrite);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ SDL_unsetenv_unsafe ] ---

    /** {@code int SDL_unsetenv_unsafe(char const * name)} */
    public static int nSDL_unsetenv_unsafe(long name) {
        long __functionAddress = Functions.unsetenv_unsafe;
        return invokePI(name, __functionAddress);
    }

    /** {@code int SDL_unsetenv_unsafe(char const * name)} */
    public static int SDL_unsetenv_unsafe(@NativeType("char const *") ByteBuffer name) {
        if (CHECKS) {
            checkNT1(name);
        }
        return nSDL_unsetenv_unsafe(memAddress(name));
    }

    /** {@code int SDL_unsetenv_unsafe(char const * name)} */
    public static int SDL_unsetenv_unsafe(@NativeType("char const *") CharSequence name) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nUTF8(name, true);
            long nameEncoded = stack.getPointerAddress();
            return nSDL_unsetenv_unsafe(nameEncoded);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ SDL_qsort ] ---

    /** {@code void SDL_qsort(void * base, size_t nmemb, size_t size, SDL_CompareCallback compare)} */
    public static void nSDL_qsort(long base, long nmemb, long size, long compare) {
        long __functionAddress = Functions.qsort;
        invokePPPPV(base, nmemb, size, compare, __functionAddress);
    }

    /** {@code void SDL_qsort(void * base, size_t nmemb, size_t size, SDL_CompareCallback compare)} */
    public static void SDL_qsort(@NativeType("void *") ByteBuffer base, @NativeType("size_t") long nmemb, @NativeType("size_t") long size, @NativeType("SDL_CompareCallback") SDL_CompareCallbackI compare) {
        if (CHECKS) {
            check(base, nmemb * size);
        }
        nSDL_qsort(memAddress(base), nmemb, size, compare.address());
    }

    // --- [ SDL_bsearch ] ---

    /** {@code void * SDL_bsearch(void const * key, void const * base, size_t nmemb, size_t size, SDL_CompareCallback compare)} */
    public static long nSDL_bsearch(long key, long base, long nmemb, long size, long compare) {
        long __functionAddress = Functions.bsearch;
        return invokePPPPPP(key, base, nmemb, size, compare, __functionAddress);
    }

    /** {@code void * SDL_bsearch(void const * key, void const * base, size_t nmemb, size_t size, SDL_CompareCallback compare)} */
    @NativeType("void *")
    public static @Nullable ByteBuffer SDL_bsearch(@NativeType("void const *") ByteBuffer key, @NativeType("void const *") ByteBuffer base, @NativeType("size_t") long nmemb, @NativeType("size_t") long size, @NativeType("SDL_CompareCallback") SDL_CompareCallbackI compare) {
        if (CHECKS) {
            check(key, size);
            check(base, nmemb * size);
        }
        long __result = nSDL_bsearch(memAddress(key), memAddress(base), nmemb, size, compare.address());
        return memByteBufferSafe(__result, (int)size);
    }

    // --- [ SDL_qsort_r ] ---

    /** {@code void SDL_qsort_r(void * base, size_t nmemb, size_t size, SDL_CompareCallback_r compare, void * userdata)} */
    public static void nSDL_qsort_r(long base, long nmemb, long size, long compare, long userdata) {
        long __functionAddress = Functions.qsort_r;
        invokePPPPPV(base, nmemb, size, compare, userdata, __functionAddress);
    }

    /** {@code void SDL_qsort_r(void * base, size_t nmemb, size_t size, SDL_CompareCallback_r compare, void * userdata)} */
    public static void SDL_qsort_r(@NativeType("void *") ByteBuffer base, @NativeType("size_t") long nmemb, @NativeType("size_t") long size, @NativeType("SDL_CompareCallback_r") SDL_CompareCallback_rI compare, @NativeType("void *") long userdata) {
        if (CHECKS) {
            check(base, nmemb * size);
        }
        nSDL_qsort_r(memAddress(base), nmemb, size, compare.address(), userdata);
    }

    // --- [ SDL_bsearch_r ] ---

    /** {@code void * SDL_bsearch_r(void const * key, void const * base, size_t nmemb, size_t size, SDL_CompareCallback_r compare, void * userdata)} */
    public static long nSDL_bsearch_r(long key, long base, long nmemb, long size, long compare, long userdata) {
        long __functionAddress = Functions.bsearch_r;
        return invokePPPPPPP(key, base, nmemb, size, compare, userdata, __functionAddress);
    }

    /** {@code void * SDL_bsearch_r(void const * key, void const * base, size_t nmemb, size_t size, SDL_CompareCallback_r compare, void * userdata)} */
    @NativeType("void *")
    public static @Nullable ByteBuffer SDL_bsearch_r(@NativeType("void const *") ByteBuffer key, @NativeType("void const *") ByteBuffer base, @NativeType("size_t") long nmemb, @NativeType("size_t") long size, @NativeType("SDL_CompareCallback_r") SDL_CompareCallback_rI compare, @NativeType("void *") long userdata) {
        if (CHECKS) {
            check(key, size);
            check(base, nmemb * size);
        }
        long __result = nSDL_bsearch_r(memAddress(key), memAddress(base), nmemb, size, compare.address(), userdata);
        return memByteBufferSafe(__result, (int)size);
    }

    // --- [ SDL_crc16 ] ---

    /** {@code Uint16 SDL_crc16(Uint16 crc, void const * data, size_t len)} */
    public static short nSDL_crc16(short crc, long data, long len) {
        long __functionAddress = Functions.crc16;
        return invokeCPPC(crc, data, len, __functionAddress);
    }

    /** {@code Uint16 SDL_crc16(Uint16 crc, void const * data, size_t len)} */
    @NativeType("Uint16")
    public static short SDL_crc16(@NativeType("Uint16") short crc, @NativeType("void const *") ByteBuffer data) {
        return nSDL_crc16(crc, memAddress(data), data.remaining());
    }

    // --- [ SDL_crc32 ] ---

    /** {@code Uint32 SDL_crc32(Uint32 crc, void const * data, size_t len)} */
    public static int nSDL_crc32(int crc, long data, long len) {
        long __functionAddress = Functions.crc32;
        return invokePPI(crc, data, len, __functionAddress);
    }

    /** {@code Uint32 SDL_crc32(Uint32 crc, void const * data, size_t len)} */
    @NativeType("Uint32")
    public static int SDL_crc32(@NativeType("Uint32") int crc, @NativeType("void const *") ByteBuffer data) {
        return nSDL_crc32(crc, memAddress(data), data.remaining());
    }

    // --- [ SDL_murmur3_32 ] ---

    /** {@code Uint32 SDL_murmur3_32(void const * data, size_t len, Uint32 seed)} */
    public static int nSDL_murmur3_32(long data, long len, int seed) {
        long __functionAddress = Functions.murmur3_32;
        return invokePPI(data, len, seed, __functionAddress);
    }

    /** {@code Uint32 SDL_murmur3_32(void const * data, size_t len, Uint32 seed)} */
    @NativeType("Uint32")
    public static int SDL_murmur3_32(@NativeType("void const *") ByteBuffer data, @NativeType("Uint32") int seed) {
        return nSDL_murmur3_32(memAddress(data), data.remaining(), seed);
    }

    // --- [ SDL_memset4 ] ---

    /** {@code void * SDL_memset4(void * dst, Uint32 val, size_t dwords)} */
    public static long nSDL_memset4(long dst, int val, long dwords) {
        long __functionAddress = Functions.memset4;
        return invokePPP(dst, val, dwords, __functionAddress);
    }

    /** {@code void * SDL_memset4(void * dst, Uint32 val, size_t dwords)} */
    @NativeType("void *")
    public static long SDL_memset4(@NativeType("void *") ByteBuffer dst, @NativeType("Uint32") int val) {
        return nSDL_memset4(memAddress(dst), val, Integer.toUnsignedLong(dst.remaining()) >> 2);
    }

    /** {@code void * SDL_memset4(void * dst, Uint32 val, size_t dwords)} */
    @NativeType("void *")
    public static long SDL_memset4(@NativeType("void *") IntBuffer dst, @NativeType("Uint32") int val) {
        return nSDL_memset4(memAddress(dst), val, Integer.toUnsignedLong(dst.remaining()));
    }

    // --- [ SDL_memcmp ] ---

    /** {@code int SDL_memcmp(void const * s1, void const * s2, size_t len)} */
    public static int nSDL_memcmp(long s1, long s2, long len) {
        long __functionAddress = Functions.memcmp;
        return invokePPPI(s1, s2, len, __functionAddress);
    }

    /** {@code int SDL_memcmp(void const * s1, void const * s2, size_t len)} */
    public static int SDL_memcmp(@NativeType("void const *") ByteBuffer s1, @NativeType("void const *") ByteBuffer s2) {
        if (CHECKS) {
            check(s2, s1.remaining());
        }
        return nSDL_memcmp(memAddress(s1), memAddress(s2), s1.remaining());
    }

    // --- [ SDL_srand ] ---

    /** {@code void SDL_srand(Uint64 seed)} */
    public static void SDL_srand(@NativeType("Uint64") long seed) {
        long __functionAddress = Functions.srand;
        invokeJV(seed, __functionAddress);
    }

    // --- [ SDL_rand ] ---

    /** {@code Sint32 SDL_rand(Sint32 n)} */
    @NativeType("Sint32")
    public static int SDL_rand(@NativeType("Sint32") int n) {
        long __functionAddress = Functions.rand;
        return invokeI(n, __functionAddress);
    }

    // --- [ SDL_randf ] ---

    /** {@code float SDL_randf(void)} */
    public static float SDL_randf() {
        long __functionAddress = Functions.randf;
        return invokeF(__functionAddress);
    }

    // --- [ SDL_rand_bits ] ---

    /** {@code Uint32 SDL_rand_bits(void)} */
    @NativeType("Uint32")
    public static int SDL_rand_bits() {
        long __functionAddress = Functions.rand_bits;
        return invokeI(__functionAddress);
    }

    // --- [ SDL_rand_r ] ---

    /** {@code Sint32 SDL_rand_r(Uint64 * state, Sint32 n)} */
    public static int nSDL_rand_r(long state, int n) {
        long __functionAddress = Functions.rand_r;
        return invokePI(state, n, __functionAddress);
    }

    /** {@code Sint32 SDL_rand_r(Uint64 * state, Sint32 n)} */
    @NativeType("Sint32")
    public static int SDL_rand_r(@NativeType("Uint64 *") LongBuffer state, @NativeType("Sint32") int n) {
        if (CHECKS) {
            check(state, 1);
        }
        return nSDL_rand_r(memAddress(state), n);
    }

    // --- [ SDL_randf_r ] ---

    /** {@code float SDL_randf_r(Uint64 * state)} */
    public static float nSDL_randf_r(long state) {
        long __functionAddress = Functions.randf_r;
        return invokePF(state, __functionAddress);
    }

    /** {@code float SDL_randf_r(Uint64 * state)} */
    public static float SDL_randf_r(@NativeType("Uint64 *") LongBuffer state) {
        if (CHECKS) {
            check(state, 1);
        }
        return nSDL_randf_r(memAddress(state));
    }

    // --- [ SDL_rand_bits_r ] ---

    /** {@code Uint32 SDL_rand_bits_r(Uint64 * state)} */
    public static int nSDL_rand_bits_r(long state) {
        long __functionAddress = Functions.rand_bits_r;
        return invokePI(state, __functionAddress);
    }

    /** {@code Uint32 SDL_rand_bits_r(Uint64 * state)} */
    @NativeType("Uint32")
    public static int SDL_rand_bits_r(@NativeType("Uint64 *") LongBuffer state) {
        if (CHECKS) {
            check(state, 1);
        }
        return nSDL_rand_bits_r(memAddress(state));
    }

    // --- [ SDL_FOURCC ] ---

    /** {@code uint32_t SDL_FOURCC(uint8_t A, uint8_t B, uint8_t C, uint8_t D)} */
    @NativeType("uint32_t")
    public static int SDL_FOURCC(@NativeType("uint8_t") byte A, @NativeType("uint8_t") byte B, @NativeType("uint8_t") byte C, @NativeType("uint8_t") byte D) {
        return ((A & 0xFF) << 0) | ((B & 0xFF) << 8) | ((C & 0xFF) << 16) | ((D & 0xFF) << 24);
    }

}