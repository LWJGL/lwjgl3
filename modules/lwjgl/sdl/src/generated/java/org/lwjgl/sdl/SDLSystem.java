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

public class SDLSystem {

    /** Contains the function pointers loaded from {@code SDL.getLibrary()}. */
    public static final class Functions {

        private Functions() {}

        /** Function address. */
        public static final long
            SetWindowsMessageHook           = apiGetFunctionAddressOptional(SDL.getLibrary(), "SDL_SetWindowsMessageHook"),
            GetDirect3D9AdapterIndex        = apiGetFunctionAddressOptional(SDL.getLibrary(), "SDL_GetDirect3D9AdapterIndex"),
            GetDXGIOutputInfo               = apiGetFunctionAddressOptional(SDL.getLibrary(), "SDL_GetDXGIOutputInfo"),
            SetX11EventHook                 = apiGetFunctionAddressOptional(SDL.getLibrary(), "SDL_SetX11EventHook"),
            SetLinuxThreadPriority          = apiGetFunctionAddressOptional(SDL.getLibrary(), "SDL_SetLinuxThreadPriority"),
            SetLinuxThreadPriorityAndPolicy = apiGetFunctionAddressOptional(SDL.getLibrary(), "SDL_SetLinuxThreadPriorityAndPolicy"),
            IsTablet                        = apiGetFunctionAddress(SDL.getLibrary(), "SDL_IsTablet"),
            IsTV                            = apiGetFunctionAddress(SDL.getLibrary(), "SDL_IsTV"),
            GetSandbox                      = apiGetFunctionAddress(SDL.getLibrary(), "SDL_GetSandbox");

    }

    public static final int
        SDL_SANDBOX_NONE              = 0,
        SDL_SANDBOX_UNKNOWN_CONTAINER = 1,
        SDL_SANDBOX_FLATPAK           = 2,
        SDL_SANDBOX_SNAP              = 3,
        SDL_SANDBOX_MACOS             = 4;

    protected SDLSystem() {
        throw new UnsupportedOperationException();
    }

    // --- [ SDL_SetWindowsMessageHook ] ---

    /** {@code void SDL_SetWindowsMessageHook(SDL_WindowsMessageHook callback, void * userdata)} */
    public static void nSDL_SetWindowsMessageHook(long callback, long userdata) {
        long __functionAddress = Functions.SetWindowsMessageHook;
        if (CHECKS) {
            check(__functionAddress);
        }
        invokePPV(callback, userdata, __functionAddress);
    }

    /** {@code void SDL_SetWindowsMessageHook(SDL_WindowsMessageHook callback, void * userdata)} */
    public static void SDL_SetWindowsMessageHook(@NativeType("SDL_WindowsMessageHook") @Nullable SDL_WindowsMessageHookI callback, @NativeType("void *") long userdata) {
        nSDL_SetWindowsMessageHook(memAddressSafe(callback), userdata);
    }

    // --- [ SDL_GetDirect3D9AdapterIndex ] ---

    /** {@code int SDL_GetDirect3D9AdapterIndex(SDL_DisplayID displayID)} */
    public static int SDL_GetDirect3D9AdapterIndex(@NativeType("SDL_DisplayID") int displayID) {
        long __functionAddress = Functions.GetDirect3D9AdapterIndex;
        if (CHECKS) {
            check(__functionAddress);
        }
        return invokeI(displayID, __functionAddress);
    }

    // --- [ SDL_GetDXGIOutputInfo ] ---

    /** {@code bool SDL_GetDXGIOutputInfo(SDL_DisplayID displayID, int * adapterIndex, int * outputIndex)} */
    public static boolean nSDL_GetDXGIOutputInfo(int displayID, long adapterIndex, long outputIndex) {
        long __functionAddress = Functions.GetDXGIOutputInfo;
        if (CHECKS) {
            check(__functionAddress);
        }
        return invokePPZ(displayID, adapterIndex, outputIndex, __functionAddress);
    }

    /** {@code bool SDL_GetDXGIOutputInfo(SDL_DisplayID displayID, int * adapterIndex, int * outputIndex)} */
    @NativeType("bool")
    public static boolean SDL_GetDXGIOutputInfo(@NativeType("SDL_DisplayID") int displayID, @NativeType("int *") IntBuffer adapterIndex, @NativeType("int *") IntBuffer outputIndex) {
        if (CHECKS) {
            check(adapterIndex, 1);
            check(outputIndex, 1);
        }
        return nSDL_GetDXGIOutputInfo(displayID, memAddress(adapterIndex), memAddress(outputIndex));
    }

    // --- [ SDL_SetX11EventHook ] ---

    /** {@code void SDL_SetX11EventHook(SDL_X11EventHook callback, void * userdata)} */
    public static void nSDL_SetX11EventHook(long callback, long userdata) {
        long __functionAddress = Functions.SetX11EventHook;
        if (CHECKS) {
            check(__functionAddress);
        }
        invokePPV(callback, userdata, __functionAddress);
    }

    /** {@code void SDL_SetX11EventHook(SDL_X11EventHook callback, void * userdata)} */
    public static void SDL_SetX11EventHook(@NativeType("SDL_X11EventHook") @Nullable SDL_X11EventHookI callback, @NativeType("void *") long userdata) {
        nSDL_SetX11EventHook(memAddressSafe(callback), userdata);
    }

    // --- [ SDL_SetLinuxThreadPriority ] ---

    /** {@code bool SDL_SetLinuxThreadPriority(Sint64 threadID, int priority)} */
    @NativeType("bool")
    public static boolean SDL_SetLinuxThreadPriority(@NativeType("Sint64") long threadID, int priority) {
        long __functionAddress = Functions.SetLinuxThreadPriority;
        if (CHECKS) {
            check(__functionAddress);
        }
        return invokeJZ(threadID, priority, __functionAddress);
    }

    // --- [ SDL_SetLinuxThreadPriorityAndPolicy ] ---

    /** {@code bool SDL_SetLinuxThreadPriorityAndPolicy(Sint64 threadID, int sdlPriority, int schedPolicy)} */
    @NativeType("bool")
    public static boolean SDL_SetLinuxThreadPriorityAndPolicy(@NativeType("Sint64") long threadID, int sdlPriority, int schedPolicy) {
        long __functionAddress = Functions.SetLinuxThreadPriorityAndPolicy;
        if (CHECKS) {
            check(__functionAddress);
        }
        return invokeJZ(threadID, sdlPriority, schedPolicy, __functionAddress);
    }

    // --- [ SDL_IsTablet ] ---

    /** {@code bool SDL_IsTablet(void)} */
    @NativeType("bool")
    public static boolean SDL_IsTablet() {
        long __functionAddress = Functions.IsTablet;
        return invokeZ(__functionAddress);
    }

    // --- [ SDL_IsTV ] ---

    /** {@code bool SDL_IsTV(void)} */
    @NativeType("bool")
    public static boolean SDL_IsTV() {
        long __functionAddress = Functions.IsTV;
        return invokeZ(__functionAddress);
    }

    // --- [ SDL_GetSandbox ] ---

    /** {@code SDL_Sandbox SDL_GetSandbox(void)} */
    @NativeType("SDL_Sandbox")
    public static int SDL_GetSandbox() {
        long __functionAddress = Functions.GetSandbox;
        return invokeI(__functionAddress);
    }

}