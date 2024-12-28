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

public class SDLLoadSO {

    /** Contains the function pointers loaded from {@code SDL.getLibrary()}. */
    public static final class Functions {

        private Functions() {}

        /** Function address. */
        public static final long
            LoadObject   = apiGetFunctionAddress(SDL.getLibrary(), "SDL_LoadObject"),
            LoadFunction = apiGetFunctionAddress(SDL.getLibrary(), "SDL_LoadFunction"),
            UnloadObject = apiGetFunctionAddress(SDL.getLibrary(), "SDL_UnloadObject");

    }

    protected SDLLoadSO() {
        throw new UnsupportedOperationException();
    }

    // --- [ SDL_LoadObject ] ---

    /** {@code SDL_SharedObject * SDL_LoadObject(char const * sofile)} */
    public static long nSDL_LoadObject(long sofile) {
        long __functionAddress = Functions.LoadObject;
        return invokePP(sofile, __functionAddress);
    }

    /** {@code SDL_SharedObject * SDL_LoadObject(char const * sofile)} */
    @NativeType("SDL_SharedObject *")
    public static long SDL_LoadObject(@NativeType("char const *") ByteBuffer sofile) {
        if (CHECKS) {
            checkNT1(sofile);
        }
        return nSDL_LoadObject(memAddress(sofile));
    }

    /** {@code SDL_SharedObject * SDL_LoadObject(char const * sofile)} */
    @NativeType("SDL_SharedObject *")
    public static long SDL_LoadObject(@NativeType("char const *") CharSequence sofile) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nUTF8(sofile, true);
            long sofileEncoded = stack.getPointerAddress();
            return nSDL_LoadObject(sofileEncoded);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ SDL_LoadFunction ] ---

    /** {@code SDL_FunctionPointer SDL_LoadFunction(SDL_SharedObject * handle, char * name)} */
    public static long nSDL_LoadFunction(long handle, long name) {
        long __functionAddress = Functions.LoadFunction;
        if (CHECKS) {
            check(handle);
        }
        return invokePPP(handle, name, __functionAddress);
    }

    /** {@code SDL_FunctionPointer SDL_LoadFunction(SDL_SharedObject * handle, char * name)} */
    @NativeType("SDL_FunctionPointer")
    public static long SDL_LoadFunction(@NativeType("SDL_SharedObject *") long handle, @NativeType("char *") ByteBuffer name) {
        if (CHECKS) {
            checkNT1(name);
        }
        return nSDL_LoadFunction(handle, memAddress(name));
    }

    // --- [ SDL_UnloadObject ] ---

    /** {@code void SDL_UnloadObject(SDL_SharedObject * handle)} */
    public static void SDL_UnloadObject(@NativeType("SDL_SharedObject *") long handle) {
        long __functionAddress = Functions.UnloadObject;
        if (CHECKS) {
            check(handle);
        }
        invokePV(handle, __functionAddress);
    }

}