/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.sdl;

import org.lwjgl.system.*;

import static org.lwjgl.system.APIUtil.*;
import static org.lwjgl.system.JNI.*;

public class SDLPen {

    /** Contains the function pointers loaded from {@code SDL.getLibrary()}. */
    public static final class Functions {

        private Functions() {}

        /** Function address. */
        public static final long
            GetPenDeviceType = apiGetFunctionAddress(SDL.getLibrary(), "SDL_GetPenDeviceType");

    }

    public static final int SDL_PEN_MOUSEID = -2;

    public static final long SDL_PEN_TOUCHID = -2L;

    public static final int
        SDL_PEN_INPUT_DOWN         = (1 << 0),
        SDL_PEN_INPUT_BUTTON_1     = (1 << 1),
        SDL_PEN_INPUT_BUTTON_2     = (1 << 2),
        SDL_PEN_INPUT_BUTTON_3     = (1 << 3),
        SDL_PEN_INPUT_BUTTON_4     = (1 << 4),
        SDL_PEN_INPUT_BUTTON_5     = (1 << 5),
        SDL_PEN_INPUT_ERASER_TIP   = (1 << 30),
        SDL_PEN_INPUT_IN_PROXIMITY = (1 << 31);

    public static final int
        SDL_PEN_AXIS_PRESSURE            = 0,
        SDL_PEN_AXIS_XTILT               = 1,
        SDL_PEN_AXIS_YTILT               = 2,
        SDL_PEN_AXIS_DISTANCE            = 3,
        SDL_PEN_AXIS_ROTATION            = 4,
        SDL_PEN_AXIS_SLIDER              = 5,
        SDL_PEN_AXIS_TANGENTIAL_PRESSURE = 6,
        SDL_PEN_AXIS_COUNT               = 7;

    public static final int
        SDL_PEN_DEVICE_TYPE_INVALID  = -1,
        SDL_PEN_DEVICE_TYPE_UNKNOWN  = 0,
        SDL_PEN_DEVICE_TYPE_DIRECT   = 1,
        SDL_PEN_DEVICE_TYPE_INDIRECT = 2;

    protected SDLPen() {
        throw new UnsupportedOperationException();
    }

    // --- [ SDL_GetPenDeviceType ] ---

    /** {@code SDL_PenDeviceType SDL_GetPenDeviceType(SDL_PenID instance_id)} */
    @NativeType("SDL_PenDeviceType")
    public static int SDL_GetPenDeviceType(@NativeType("SDL_PenID") int instance_id) {
        long __functionAddress = Functions.GetPenDeviceType;
        return invokeI(instance_id, __functionAddress);
    }

}