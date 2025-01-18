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

public class SDLTouch {

    /** Contains the function pointers loaded from {@code SDL.getLibrary()}. */
    public static final class Functions {

        private Functions() {}

        /** Function address. */
        public static final long
            GetTouchDevices    = apiGetFunctionAddress(SDL.getLibrary(), "SDL_GetTouchDevices"),
            GetTouchDeviceName = apiGetFunctionAddress(SDL.getLibrary(), "SDL_GetTouchDeviceName"),
            GetTouchDeviceType = apiGetFunctionAddress(SDL.getLibrary(), "SDL_GetTouchDeviceType"),
            GetTouchFingers    = apiGetFunctionAddress(SDL.getLibrary(), "SDL_GetTouchFingers");

    }

    public static final int
        SDL_TOUCH_DEVICE_INVALID           = -1,
        SDL_TOUCH_DEVICE_DIRECT            = 0,
        SDL_TOUCH_DEVICE_INDIRECT_ABSOLUTE = 1,
        SDL_TOUCH_DEVICE_INDIRECT_RELATIVE = 2;

    public static final int SDL_TOUCH_MOUSEID = -1;

    public static final long SDL_MOUSE_TOUCHID = -1L;

    protected SDLTouch() {
        throw new UnsupportedOperationException();
    }

    // --- [ SDL_GetTouchDevices ] ---

    /** {@code SDL_TouchID * SDL_GetTouchDevices(int * count)} */
    public static long nSDL_GetTouchDevices(long count) {
        long __functionAddress = Functions.GetTouchDevices;
        return invokePP(count, __functionAddress);
    }

    /** {@code SDL_TouchID * SDL_GetTouchDevices(int * count)} */
    @NativeType("SDL_TouchID *")
    public static @Nullable LongBuffer SDL_GetTouchDevices() {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        IntBuffer count = stack.callocInt(1);
        try {
            long __result = nSDL_GetTouchDevices(memAddress(count));
            return memLongBufferSafe(__result, count.get(0));
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ SDL_GetTouchDeviceName ] ---

    /** {@code char const * SDL_GetTouchDeviceName(SDL_TouchID touchID)} */
    public static long nSDL_GetTouchDeviceName(long touchID) {
        long __functionAddress = Functions.GetTouchDeviceName;
        return invokeJP(touchID, __functionAddress);
    }

    /** {@code char const * SDL_GetTouchDeviceName(SDL_TouchID touchID)} */
    @NativeType("char const *")
    public static @Nullable String SDL_GetTouchDeviceName(@NativeType("SDL_TouchID") long touchID) {
        long __result = nSDL_GetTouchDeviceName(touchID);
        return memUTF8Safe(__result);
    }

    // --- [ SDL_GetTouchDeviceType ] ---

    /** {@code SDL_TouchDeviceType SDL_GetTouchDeviceType(SDL_TouchID touchID)} */
    @NativeType("SDL_TouchDeviceType")
    public static int SDL_GetTouchDeviceType(@NativeType("SDL_TouchID") long touchID) {
        long __functionAddress = Functions.GetTouchDeviceType;
        return invokeJI(touchID, __functionAddress);
    }

    // --- [ SDL_GetTouchFingers ] ---

    /** {@code SDL_Finger ** SDL_GetTouchFingers(SDL_TouchID touchID, int * count)} */
    public static long nSDL_GetTouchFingers(long touchID, long count) {
        long __functionAddress = Functions.GetTouchFingers;
        return invokeJPP(touchID, count, __functionAddress);
    }

    /** {@code SDL_Finger ** SDL_GetTouchFingers(SDL_TouchID touchID, int * count)} */
    @NativeType("SDL_Finger **")
    public static @Nullable PointerBuffer SDL_GetTouchFingers(@NativeType("SDL_TouchID") long touchID) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        IntBuffer count = stack.callocInt(1);
        try {
            long __result = nSDL_GetTouchFingers(touchID, memAddress(count));
            return memPointerBufferSafe(__result, count.get(0));
        } finally {
            stack.setPointer(stackPointer);
        }
    }

}