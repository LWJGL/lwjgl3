/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.sdl;

import org.lwjgl.system.*;

public final class SDLPen {

    public static final int SDL_PEN_MOUSEID = -2;

    public static final long SDL_PEN_TOUCHID = -2L;

    public static final int
        SDL_PEN_INPUT_DOWN       = (1 << 0),
        SDL_PEN_INPUT_BUTTON_1   = (1 << 1),
        SDL_PEN_INPUT_BUTTON_2   = (1 << 2),
        SDL_PEN_INPUT_BUTTON_3   = (1 << 3),
        SDL_PEN_INPUT_BUTTON_4   = (1 << 4),
        SDL_PEN_INPUT_BUTTON_5   = (1 << 5),
        SDL_PEN_INPUT_ERASER_TIP = (1 << 30);

    public static final int
        SDL_PEN_AXIS_PRESSURE            = 0,
        SDL_PEN_AXIS_XTILT               = 1,
        SDL_PEN_AXIS_YTILT               = 2,
        SDL_PEN_AXIS_DISTANCE            = 3,
        SDL_PEN_AXIS_ROTATION            = 4,
        SDL_PEN_AXIS_SLIDER              = 5,
        SDL_PEN_AXIS_TANGENTIAL_PRESSURE = 6,
        SDL_PEN_AXIS_COUNT               = 7;

    private SDLPen() {
        throw new UnsupportedOperationException();
    }

}