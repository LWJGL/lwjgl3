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

public class SDLLocale {

    /** Contains the function pointers loaded from {@code SDL.getLibrary()}. */
    public static final class Functions {

        private Functions() {}

        /** Function address. */
        public static final long
            GetPreferredLocales = apiGetFunctionAddress(SDL.getLibrary(), "SDL_GetPreferredLocales");

    }

    protected SDLLocale() {
        throw new UnsupportedOperationException();
    }

    // --- [ SDL_GetPreferredLocales ] ---

    /** {@code SDL_Locale ** SDL_GetPreferredLocales(int * count)} */
    public static long nSDL_GetPreferredLocales(long count) {
        long __functionAddress = Functions.GetPreferredLocales;
        return invokePP(count, __functionAddress);
    }

    /** {@code SDL_Locale ** SDL_GetPreferredLocales(int * count)} */
    @NativeType("SDL_Locale **")
    public static @Nullable PointerBuffer SDL_GetPreferredLocales() {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        IntBuffer count = stack.callocInt(1);
        try {
            long __result = nSDL_GetPreferredLocales(memAddress(count));
            return memPointerBufferSafe(__result, count.get(0));
        } finally {
            stack.setPointer(stackPointer);
        }
    }

}