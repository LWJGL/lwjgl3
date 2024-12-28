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

public class SDLPower {

    /** Contains the function pointers loaded from {@code SDL.getLibrary()}. */
    public static final class Functions {

        private Functions() {}

        /** Function address. */
        public static final long
            GetPowerInfo = apiGetFunctionAddress(SDL.getLibrary(), "SDL_GetPowerInfo");

    }

    public static final int
        SDL_POWERSTATE_ERROR      = -1,
        SDL_POWERSTATE_UNKNOWN    = 0,
        SDL_POWERSTATE_ON_BATTERY = 1,
        SDL_POWERSTATE_NO_BATTERY = 2,
        SDL_POWERSTATE_CHARGING   = 3,
        SDL_POWERSTATE_CHARGED    = 4;

    protected SDLPower() {
        throw new UnsupportedOperationException();
    }

    // --- [ SDL_GetPowerInfo ] ---

    /** {@code SDL_PowerState SDL_GetPowerInfo(int * seconds, int * percent)} */
    public static int nSDL_GetPowerInfo(long seconds, long percent) {
        long __functionAddress = Functions.GetPowerInfo;
        return invokePPI(seconds, percent, __functionAddress);
    }

    /** {@code SDL_PowerState SDL_GetPowerInfo(int * seconds, int * percent)} */
    @NativeType("SDL_PowerState")
    public static int SDL_GetPowerInfo(@NativeType("int *") @Nullable IntBuffer seconds, @NativeType("int *") @Nullable IntBuffer percent) {
        if (CHECKS) {
            checkSafe(seconds, 1);
            checkSafe(percent, 1);
        }
        return nSDL_GetPowerInfo(memAddressSafe(seconds), memAddressSafe(percent));
    }

}