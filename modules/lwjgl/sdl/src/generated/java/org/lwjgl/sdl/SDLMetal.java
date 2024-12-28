/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.sdl;

import org.lwjgl.system.*;

import static org.lwjgl.system.APIUtil.*;
import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.JNI.*;

public class SDLMetal {

    /** Contains the function pointers loaded from {@code SDL.getLibrary()}. */
    public static final class Functions {

        private Functions() {}

        /** Function address. */
        public static final long
            Metal_CreateView  = apiGetFunctionAddress(SDL.getLibrary(), "SDL_Metal_CreateView"),
            Metal_DestroyView = apiGetFunctionAddress(SDL.getLibrary(), "SDL_Metal_DestroyView"),
            Metal_GetLayer    = apiGetFunctionAddress(SDL.getLibrary(), "SDL_Metal_GetLayer");

    }

    protected SDLMetal() {
        throw new UnsupportedOperationException();
    }

    // --- [ SDL_Metal_CreateView ] ---

    /** {@code SDL_MetalView SDL_Metal_CreateView(SDL_Window * window)} */
    @NativeType("SDL_MetalView")
    public static long SDL_Metal_CreateView(@NativeType("SDL_Window *") long window) {
        long __functionAddress = Functions.Metal_CreateView;
        if (CHECKS) {
            check(window);
        }
        return invokePP(window, __functionAddress);
    }

    // --- [ SDL_Metal_DestroyView ] ---

    /** {@code void SDL_Metal_DestroyView(SDL_MetalView view)} */
    public static void SDL_Metal_DestroyView(@NativeType("SDL_MetalView") long view) {
        long __functionAddress = Functions.Metal_DestroyView;
        if (CHECKS) {
            check(view);
        }
        invokePV(view, __functionAddress);
    }

    // --- [ SDL_Metal_GetLayer ] ---

    /** {@code void * SDL_Metal_GetLayer(SDL_MetalView view)} */
    @NativeType("void *")
    public static long SDL_Metal_GetLayer(@NativeType("SDL_MetalView") long view) {
        long __functionAddress = Functions.Metal_GetLayer;
        if (CHECKS) {
            check(view);
        }
        return invokePP(view, __functionAddress);
    }

}