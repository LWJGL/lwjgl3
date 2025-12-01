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
import static org.lwjgl.system.MemoryUtil.*;

public class SDLMain {

    /** Contains the function pointers loaded from {@code SDL.getLibrary()}. */
    public static final class Functions {

        private Functions() {}

        /** Function address. */
        public static final long
            SetMainReady          = apiGetFunctionAddress(SDL.getLibrary(), "SDL_SetMainReady"),
            RunApp                = apiGetFunctionAddress(SDL.getLibrary(), "SDL_RunApp"),
            EnterAppMainCallbacks = apiGetFunctionAddress(SDL.getLibrary(), "SDL_EnterAppMainCallbacks"),
            SDL_RegisterApp       = apiGetFunctionAddressOptional(SDL.getLibrary(), "SDL_SDL_RegisterApp"),
            SDL_UnregisterApp     = apiGetFunctionAddressOptional(SDL.getLibrary(), "SDL_SDL_UnregisterApp");

    }

    protected SDLMain() {
        throw new UnsupportedOperationException();
    }

    // --- [ SDL_SetMainReady ] ---

    /** {@code void SDL_SetMainReady(void)} */
    public static void SDL_SetMainReady() {
        long __functionAddress = Functions.SetMainReady;
        invokeV(__functionAddress);
    }

    // --- [ SDL_RunApp ] ---

    /** {@code int SDL_RunApp(int argc, char ** argv, SDL_main_func mainFunction, void * reserved)} */
    public static int nSDL_RunApp(int argc, long argv, long mainFunction, long reserved) {
        long __functionAddress = Functions.RunApp;
        return invokePPPI(argc, argv, mainFunction, reserved, __functionAddress);
    }

    /** {@code int SDL_RunApp(int argc, char ** argv, SDL_main_func mainFunction, void * reserved)} */
    public static int SDL_RunApp(@NativeType("char **") @Nullable PointerBuffer argv, @NativeType("SDL_main_func") SDL_main_funcI mainFunction, @NativeType("void *") long reserved) {
        return nSDL_RunApp(remainingSafe(argv), memAddressSafe(argv), mainFunction.address(), reserved);
    }

    // --- [ SDL_EnterAppMainCallbacks ] ---

    /** {@code int SDL_EnterAppMainCallbacks(int argc, char ** argv, SDL_AppInit_func appinit, SDL_AppIterate_func appiter, SDL_AppEvent_func appevent, SDL_AppQuit_func appquit)} */
    public static int nSDL_EnterAppMainCallbacks(int argc, long argv, long appinit, long appiter, long appevent, long appquit) {
        long __functionAddress = Functions.EnterAppMainCallbacks;
        return invokePPPPPI(argc, argv, appinit, appiter, appevent, appquit, __functionAddress);
    }

    /** {@code int SDL_EnterAppMainCallbacks(int argc, char ** argv, SDL_AppInit_func appinit, SDL_AppIterate_func appiter, SDL_AppEvent_func appevent, SDL_AppQuit_func appquit)} */
    public static int SDL_EnterAppMainCallbacks(@NativeType("char **") @Nullable PointerBuffer argv, @NativeType("SDL_AppInit_func") SDL_AppInit_funcI appinit, @NativeType("SDL_AppIterate_func") SDL_AppIterate_funcI appiter, @NativeType("SDL_AppEvent_func") SDL_AppEvent_funcI appevent, @NativeType("SDL_AppQuit_func") SDL_AppQuit_funcI appquit) {
        return nSDL_EnterAppMainCallbacks(remainingSafe(argv), memAddressSafe(argv), appinit.address(), appiter.address(), appevent.address(), appquit.address());
    }

    // --- [ SDL_SDL_RegisterApp ] ---

    /** {@code bool SDL_SDL_RegisterApp(char * name, Uint32 style, HINSTANCE hInst)} */
    public static boolean nSDL_SDL_RegisterApp(long name, int style, long hInst) {
        long __functionAddress = Functions.SDL_RegisterApp;
        if (CHECKS) {
            check(__functionAddress);
        }
        return invokePPZ(name, style, hInst, __functionAddress);
    }

    /** {@code bool SDL_SDL_RegisterApp(char * name, Uint32 style, HINSTANCE hInst)} */
    @NativeType("bool")
    public static boolean SDL_SDL_RegisterApp(@NativeType("char *") @Nullable ByteBuffer name, @NativeType("Uint32") int style, @NativeType("HINSTANCE") long hInst) {
        if (CHECKS) {
            checkNT1Safe(name);
        }
        return nSDL_SDL_RegisterApp(memAddressSafe(name), style, hInst);
    }

    // --- [ SDL_SDL_UnregisterApp ] ---

    /** {@code void SDL_SDL_UnregisterApp(void)} */
    public static void SDL_SDL_UnregisterApp() {
        long __functionAddress = Functions.SDL_UnregisterApp;
        if (CHECKS) {
            check(__functionAddress);
        }
        invokeV(__functionAddress);
    }

}