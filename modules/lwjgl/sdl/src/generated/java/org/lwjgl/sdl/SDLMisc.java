/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.sdl;

import java.nio.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.APIUtil.*;
import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.JNI.*;
import static org.lwjgl.system.MemoryStack.*;
import static org.lwjgl.system.MemoryUtil.*;

public class SDLMisc {

    /** Contains the function pointers loaded from {@code SDL.getLibrary()}. */
    public static final class Functions {

        private Functions() {}

        /** Function address. */
        public static final long
            OpenURL = apiGetFunctionAddress(SDL.getLibrary(), "SDL_OpenURL");

    }

    protected SDLMisc() {
        throw new UnsupportedOperationException();
    }

    // --- [ SDL_OpenURL ] ---

    /** {@code bool SDL_OpenURL(char const * url)} */
    public static boolean nSDL_OpenURL(long url) {
        long __functionAddress = Functions.OpenURL;
        return invokePZ(url, __functionAddress);
    }

    /** {@code bool SDL_OpenURL(char const * url)} */
    @NativeType("bool")
    public static boolean SDL_OpenURL(@NativeType("char const *") ByteBuffer url) {
        if (CHECKS) {
            checkNT1(url);
        }
        return nSDL_OpenURL(memAddress(url));
    }

    /** {@code bool SDL_OpenURL(char const * url)} */
    @NativeType("bool")
    public static boolean SDL_OpenURL(@NativeType("char const *") CharSequence url) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nUTF8(url, true);
            long urlEncoded = stack.getPointerAddress();
            return nSDL_OpenURL(urlEncoded);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

}