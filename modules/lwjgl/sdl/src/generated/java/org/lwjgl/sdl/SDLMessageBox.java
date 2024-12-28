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
import static org.lwjgl.system.MemoryStack.*;
import static org.lwjgl.system.MemoryUtil.*;

public class SDLMessageBox {

    /** Contains the function pointers loaded from {@code SDL.getLibrary()}. */
    public static final class Functions {

        private Functions() {}

        /** Function address. */
        public static final long
            ShowMessageBox       = apiGetFunctionAddress(SDL.getLibrary(), "SDL_ShowMessageBox"),
            ShowSimpleMessageBox = apiGetFunctionAddress(SDL.getLibrary(), "SDL_ShowSimpleMessageBox");

    }

    public static final int
        SDL_MESSAGEBOX_ERROR                 = 0x00000010,
        SDL_MESSAGEBOX_WARNING               = 0x00000020,
        SDL_MESSAGEBOX_INFORMATION           = 0x00000040,
        SDL_MESSAGEBOX_BUTTONS_LEFT_TO_RIGHT = 0x00000080,
        SDL_MESSAGEBOX_BUTTONS_RIGHT_TO_LEFT = 0x00000100;

    public static final int
        SDL_MESSAGEBOX_BUTTON_RETURNKEY_DEFAULT = 0x00000001,
        SDL_MESSAGEBOX_BUTTON_ESCAPEKEY_DEFAULT = 0x00000002;

    public static final int
        SDL_MESSAGEBOX_COLOR_BACKGROUND        = 0x0,
        SDL_MESSAGEBOX_COLOR_TEXT              = 0x1,
        SDL_MESSAGEBOX_COLOR_BUTTON_BORDER     = 0x2,
        SDL_MESSAGEBOX_COLOR_BUTTON_BACKGROUND = 0x3,
        SDL_MESSAGEBOX_COLOR_BUTTON_SELECTED   = 0x4,
        SDL_MESSAGEBOX_COLOR_COUNT             = 0x5;

    protected SDLMessageBox() {
        throw new UnsupportedOperationException();
    }

    // --- [ SDL_ShowMessageBox ] ---

    /** {@code bool SDL_ShowMessageBox(SDL_MessageBoxData const * messageboxdata, int * buttonid)} */
    public static boolean nSDL_ShowMessageBox(long messageboxdata, long buttonid) {
        long __functionAddress = Functions.ShowMessageBox;
        if (CHECKS) {
            SDL_MessageBoxData.validate(messageboxdata);
        }
        return invokePPZ(messageboxdata, buttonid, __functionAddress);
    }

    /** {@code bool SDL_ShowMessageBox(SDL_MessageBoxData const * messageboxdata, int * buttonid)} */
    @NativeType("bool")
    public static boolean SDL_ShowMessageBox(@NativeType("SDL_MessageBoxData const *") SDL_MessageBoxData messageboxdata, @NativeType("int *") @Nullable IntBuffer buttonid) {
        if (CHECKS) {
            checkSafe(buttonid, 1);
        }
        return nSDL_ShowMessageBox(messageboxdata.address(), memAddressSafe(buttonid));
    }

    // --- [ SDL_ShowSimpleMessageBox ] ---

    /** {@code bool SDL_ShowSimpleMessageBox(SDL_MessageBoxFlags flags, char const * title, char const * message, SDL_Window * window)} */
    public static boolean nSDL_ShowSimpleMessageBox(int flags, long title, long message, long window) {
        long __functionAddress = Functions.ShowSimpleMessageBox;
        return invokePPPZ(flags, title, message, window, __functionAddress);
    }

    /** {@code bool SDL_ShowSimpleMessageBox(SDL_MessageBoxFlags flags, char const * title, char const * message, SDL_Window * window)} */
    @NativeType("bool")
    public static boolean SDL_ShowSimpleMessageBox(@NativeType("SDL_MessageBoxFlags") int flags, @NativeType("char const *") ByteBuffer title, @NativeType("char const *") ByteBuffer message, @NativeType("SDL_Window *") long window) {
        if (CHECKS) {
            checkNT1(title);
            checkNT1(message);
        }
        return nSDL_ShowSimpleMessageBox(flags, memAddress(title), memAddress(message), window);
    }

    /** {@code bool SDL_ShowSimpleMessageBox(SDL_MessageBoxFlags flags, char const * title, char const * message, SDL_Window * window)} */
    @NativeType("bool")
    public static boolean SDL_ShowSimpleMessageBox(@NativeType("SDL_MessageBoxFlags") int flags, @NativeType("char const *") CharSequence title, @NativeType("char const *") CharSequence message, @NativeType("SDL_Window *") long window) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nUTF8(title, true);
            long titleEncoded = stack.getPointerAddress();
            stack.nUTF8(message, true);
            long messageEncoded = stack.getPointerAddress();
            return nSDL_ShowSimpleMessageBox(flags, titleEncoded, messageEncoded, window);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

}