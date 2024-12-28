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
import static org.lwjgl.system.MemoryUtil.*;

public class SDLThread {

    /** Contains the function pointers loaded from {@code SDL.getLibrary()}. */
    public static final class Functions {

        private Functions() {}

        /** Function address. */
        public static final long
            GetTLS     = apiGetFunctionAddress(SDL.getLibrary(), "SDL_GetTLS"),
            SetTLS     = apiGetFunctionAddress(SDL.getLibrary(), "SDL_SetTLS"),
            CleanupTLS = apiGetFunctionAddress(SDL.getLibrary(), "SDL_CleanupTLS");

    }

    protected SDLThread() {
        throw new UnsupportedOperationException();
    }

    // --- [ SDL_GetTLS ] ---

    /** {@code void * SDL_GetTLS(SDL_TLSID * id)} */
    public static long nSDL_GetTLS(long id) {
        long __functionAddress = Functions.GetTLS;
        return invokePP(id, __functionAddress);
    }

    /** {@code void * SDL_GetTLS(SDL_TLSID * id)} */
    @NativeType("void *")
    public static long SDL_GetTLS(@NativeType("SDL_TLSID *") IntBuffer id) {
        if (CHECKS) {
            check(id, 1);
        }
        return nSDL_GetTLS(memAddress(id));
    }

    // --- [ SDL_SetTLS ] ---

    /** {@code bool SDL_SetTLS(SDL_TLSID * id, void * value, SDL_TLSDestructorCallback destructor)} */
    public static boolean nSDL_SetTLS(long id, long value, long destructor) {
        long __functionAddress = Functions.SetTLS;
        return invokePPPZ(id, value, destructor, __functionAddress);
    }

    /** {@code bool SDL_SetTLS(SDL_TLSID * id, void * value, SDL_TLSDestructorCallback destructor)} */
    @NativeType("bool")
    public static boolean SDL_SetTLS(@NativeType("SDL_TLSID *") IntBuffer id, @NativeType("void *") long value, @NativeType("SDL_TLSDestructorCallback") @Nullable SDL_TLSDestructorCallbackI destructor) {
        if (CHECKS) {
            check(id, 1);
        }
        return nSDL_SetTLS(memAddress(id), value, memAddressSafe(destructor));
    }

    // --- [ SDL_CleanupTLS ] ---

    /** {@code void SDL_CleanupTLS(void)} */
    public static void SDL_CleanupTLS() {
        long __functionAddress = Functions.CleanupTLS;
        invokeV(__functionAddress);
    }

}