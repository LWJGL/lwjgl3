/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.sdl;

import org.jspecify.annotations.*;

import java.nio.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.APIUtil.*;
import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.JNI.*;
import static org.lwjgl.system.MemoryStack.*;
import static org.lwjgl.system.MemoryUtil.*;

public class SDLError {

    /** Contains the function pointers loaded from {@code SDL.getLibrary()}. */
    public static final class Functions {

        private Functions() {}

        /** Function address. */
        public static final long
            SetError    = apiGetFunctionAddress(SDL.getLibrary(), "SDL_SetError"),
            SetErrorV   = apiGetFunctionAddress(SDL.getLibrary(), "SDL_SetErrorV"),
            OutOfMemory = apiGetFunctionAddress(SDL.getLibrary(), "SDL_OutOfMemory"),
            GetError    = apiGetFunctionAddress(SDL.getLibrary(), "SDL_GetError"),
            ClearError  = apiGetFunctionAddress(SDL.getLibrary(), "SDL_ClearError");

    }

    protected SDLError() {
        throw new UnsupportedOperationException();
    }

    // --- [ SDL_SetError ] ---

    /** {@code bool SDL_SetError(char const * fmt)} */
    public static boolean nSDL_SetError(long fmt) {
        long __functionAddress = Functions.SetError;
        return invokePZ(fmt, __functionAddress);
    }

    /** {@code bool SDL_SetError(char const * fmt)} */
    @NativeType("bool")
    public static boolean SDL_SetError(@NativeType("char const *") ByteBuffer fmt) {
        if (CHECKS) {
            checkNT1(fmt);
        }
        return nSDL_SetError(memAddress(fmt));
    }

    /** {@code bool SDL_SetError(char const * fmt)} */
    @NativeType("bool")
    public static boolean SDL_SetError(@NativeType("char const *") CharSequence fmt) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nUTF8(fmt, true);
            long fmtEncoded = stack.getPointerAddress();
            return nSDL_SetError(fmtEncoded);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ SDL_SetErrorV ] ---

    /** {@code bool SDL_SetErrorV(char const * fmt, va_list ap)} */
    public static boolean nSDL_SetErrorV(long fmt, long ap) {
        long __functionAddress = Functions.SetErrorV;
        if (CHECKS) {
            check(ap);
        }
        return invokePPZ(fmt, ap, __functionAddress);
    }

    /** {@code bool SDL_SetErrorV(char const * fmt, va_list ap)} */
    @NativeType("bool")
    public static boolean SDL_SetErrorV(@NativeType("char const *") ByteBuffer fmt, @NativeType("va_list") long ap) {
        if (CHECKS) {
            checkNT1(fmt);
        }
        return nSDL_SetErrorV(memAddress(fmt), ap);
    }

    /** {@code bool SDL_SetErrorV(char const * fmt, va_list ap)} */
    @NativeType("bool")
    public static boolean SDL_SetErrorV(@NativeType("char const *") CharSequence fmt, @NativeType("va_list") long ap) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nUTF8(fmt, true);
            long fmtEncoded = stack.getPointerAddress();
            return nSDL_SetErrorV(fmtEncoded, ap);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ SDL_OutOfMemory ] ---

    /** {@code bool SDL_OutOfMemory(void)} */
    @NativeType("bool")
    public static boolean SDL_OutOfMemory() {
        long __functionAddress = Functions.OutOfMemory;
        return invokeZ(__functionAddress);
    }

    // --- [ SDL_GetError ] ---

    /** {@code char const * SDL_GetError(void)} */
    public static long nSDL_GetError() {
        long __functionAddress = Functions.GetError;
        return invokeP(__functionAddress);
    }

    /** {@code char const * SDL_GetError(void)} */
    @NativeType("char const *")
    public static @Nullable String SDL_GetError() {
        long __result = nSDL_GetError();
        return memUTF8Safe(__result);
    }

    // --- [ SDL_ClearError ] ---

    /** {@code bool SDL_ClearError(void)} */
    @NativeType("bool")
    public static boolean SDL_ClearError() {
        long __functionAddress = Functions.ClearError;
        return invokeZ(__functionAddress);
    }

}