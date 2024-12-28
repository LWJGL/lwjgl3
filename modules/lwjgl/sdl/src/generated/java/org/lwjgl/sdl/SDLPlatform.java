/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.sdl;

import org.jspecify.annotations.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.APIUtil.*;
import static org.lwjgl.system.JNI.*;
import static org.lwjgl.system.MemoryUtil.*;

public class SDLPlatform {

    /** Contains the function pointers loaded from {@code SDL.getLibrary()}. */
    public static final class Functions {

        private Functions() {}

        /** Function address. */
        public static final long
            GetPlatform = apiGetFunctionAddress(SDL.getLibrary(), "SDL_GetPlatform");

    }

    protected SDLPlatform() {
        throw new UnsupportedOperationException();
    }

    // --- [ SDL_GetPlatform ] ---

    /** {@code char const * SDL_GetPlatform(void)} */
    public static long nSDL_GetPlatform() {
        long __functionAddress = Functions.GetPlatform;
        return invokeP(__functionAddress);
    }

    /** {@code char const * SDL_GetPlatform(void)} */
    @NativeType("char const *")
    public static @Nullable String SDL_GetPlatform() {
        long __result = nSDL_GetPlatform();
        return memASCIISafe(__result);
    }

}