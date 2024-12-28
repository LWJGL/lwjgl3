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

public class SDLMouse {

    /** Contains the function pointers loaded from {@code SDL.getLibrary()}. */
    public static final class Functions {

        private Functions() {}

        /** Function address. */
        public static final long
            HasMouse                   = apiGetFunctionAddress(SDL.getLibrary(), "SDL_HasMouse"),
            GetMice                    = apiGetFunctionAddress(SDL.getLibrary(), "SDL_GetMice"),
            GetMouseNameForID          = apiGetFunctionAddress(SDL.getLibrary(), "SDL_GetMouseNameForID"),
            GetMouseFocus              = apiGetFunctionAddress(SDL.getLibrary(), "SDL_GetMouseFocus"),
            GetMouseState              = apiGetFunctionAddress(SDL.getLibrary(), "SDL_GetMouseState"),
            GetGlobalMouseState        = apiGetFunctionAddress(SDL.getLibrary(), "SDL_GetGlobalMouseState"),
            GetRelativeMouseState      = apiGetFunctionAddress(SDL.getLibrary(), "SDL_GetRelativeMouseState"),
            WarpMouseInWindow          = apiGetFunctionAddress(SDL.getLibrary(), "SDL_WarpMouseInWindow"),
            WarpMouseGlobal            = apiGetFunctionAddress(SDL.getLibrary(), "SDL_WarpMouseGlobal"),
            SetWindowRelativeMouseMode = apiGetFunctionAddress(SDL.getLibrary(), "SDL_SetWindowRelativeMouseMode"),
            GetWindowRelativeMouseMode = apiGetFunctionAddress(SDL.getLibrary(), "SDL_GetWindowRelativeMouseMode"),
            CaptureMouse               = apiGetFunctionAddress(SDL.getLibrary(), "SDL_CaptureMouse"),
            CreateCursor               = apiGetFunctionAddress(SDL.getLibrary(), "SDL_CreateCursor"),
            CreateColorCursor          = apiGetFunctionAddress(SDL.getLibrary(), "SDL_CreateColorCursor"),
            CreateSystemCursor         = apiGetFunctionAddress(SDL.getLibrary(), "SDL_CreateSystemCursor"),
            SetCursor                  = apiGetFunctionAddress(SDL.getLibrary(), "SDL_SetCursor"),
            GetCursor                  = apiGetFunctionAddress(SDL.getLibrary(), "SDL_GetCursor"),
            GetDefaultCursor           = apiGetFunctionAddress(SDL.getLibrary(), "SDL_GetDefaultCursor"),
            DestroyCursor              = apiGetFunctionAddress(SDL.getLibrary(), "SDL_DestroyCursor"),
            ShowCursor                 = apiGetFunctionAddress(SDL.getLibrary(), "SDL_ShowCursor"),
            HideCursor                 = apiGetFunctionAddress(SDL.getLibrary(), "SDL_HideCursor"),
            CursorVisible              = apiGetFunctionAddress(SDL.getLibrary(), "SDL_CursorVisible");

    }

    public static final int
        SDL_SYSTEM_CURSOR_DEFAULT     = 0,
        SDL_SYSTEM_CURSOR_TEXT        = 1,
        SDL_SYSTEM_CURSOR_WAIT        = 2,
        SDL_SYSTEM_CURSOR_CROSSHAIR   = 3,
        SDL_SYSTEM_CURSOR_PROGRESS    = 4,
        SDL_SYSTEM_CURSOR_NWSE_RESIZE = 5,
        SDL_SYSTEM_CURSOR_NESW_RESIZE = 6,
        SDL_SYSTEM_CURSOR_EW_RESIZE   = 7,
        SDL_SYSTEM_CURSOR_NS_RESIZE   = 8,
        SDL_SYSTEM_CURSOR_MOVE        = 9,
        SDL_SYSTEM_CURSOR_NOT_ALLOWED = 10,
        SDL_SYSTEM_CURSOR_POINTER     = 11,
        SDL_SYSTEM_CURSOR_NW_RESIZE   = 12,
        SDL_SYSTEM_CURSOR_N_RESIZE    = 13,
        SDL_SYSTEM_CURSOR_NE_RESIZE   = 14,
        SDL_SYSTEM_CURSOR_E_RESIZE    = 15,
        SDL_SYSTEM_CURSOR_SE_RESIZE   = 16,
        SDL_SYSTEM_CURSOR_S_RESIZE    = 17,
        SDL_SYSTEM_CURSOR_SW_RESIZE   = 18,
        SDL_SYSTEM_CURSOR_W_RESIZE    = 19,
        SDL_SYSTEM_CURSOR_COUNT       = 20;

    public static final int
        SDL_MOUSEWHEEL_NORMAL  = 0,
        SDL_MOUSEWHEEL_FLIPPED = 1;

    public static final int
        SDL_BUTTON_LEFT   = 1,
        SDL_BUTTON_MIDDLE = 2,
        SDL_BUTTON_RIGHT  = 3,
        SDL_BUTTON_X1     = 4,
        SDL_BUTTON_X2     = 5;

    public static final int
        SDL_BUTTON_LMASK  = SDL_BUTTON_MASK(SDL_BUTTON_LEFT),
        SDL_BUTTON_MMASK  = SDL_BUTTON_MASK(SDL_BUTTON_MIDDLE),
        SDL_BUTTON_RMASK  = SDL_BUTTON_MASK(SDL_BUTTON_RIGHT),
        SDL_BUTTON_X1MASK = SDL_BUTTON_MASK(SDL_BUTTON_X1),
        SDL_BUTTON_X2MASK = SDL_BUTTON_MASK(SDL_BUTTON_X2);

    protected SDLMouse() {
        throw new UnsupportedOperationException();
    }

    // --- [ SDL_HasMouse ] ---

    /** {@code bool SDL_HasMouse(void)} */
    @NativeType("bool")
    public static boolean SDL_HasMouse() {
        long __functionAddress = Functions.HasMouse;
        return invokeZ(__functionAddress);
    }

    // --- [ SDL_GetMice ] ---

    /** {@code SDL_MouseID * SDL_GetMice(int * count)} */
    public static long nSDL_GetMice(long count) {
        long __functionAddress = Functions.GetMice;
        return invokePP(count, __functionAddress);
    }

    /** {@code SDL_MouseID * SDL_GetMice(int * count)} */
    @NativeType("SDL_MouseID *")
    public static @Nullable IntBuffer SDL_GetMice() {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        IntBuffer count = stack.callocInt(1);
        try {
            long __result = nSDL_GetMice(memAddress(count));
            return memIntBufferSafe(__result, count.get(0));
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ SDL_GetMouseNameForID ] ---

    /** {@code char const * SDL_GetMouseNameForID(SDL_MouseID instance_id)} */
    public static long nSDL_GetMouseNameForID(int instance_id) {
        long __functionAddress = Functions.GetMouseNameForID;
        return invokeP(instance_id, __functionAddress);
    }

    /** {@code char const * SDL_GetMouseNameForID(SDL_MouseID instance_id)} */
    @NativeType("char const *")
    public static @Nullable String SDL_GetMouseNameForID(@NativeType("SDL_MouseID") int instance_id) {
        long __result = nSDL_GetMouseNameForID(instance_id);
        return memUTF8Safe(__result);
    }

    // --- [ SDL_GetMouseFocus ] ---

    /** {@code SDL_Window * SDL_GetMouseFocus(void)} */
    @NativeType("SDL_Window *")
    public static long SDL_GetMouseFocus() {
        long __functionAddress = Functions.GetMouseFocus;
        return invokeP(__functionAddress);
    }

    // --- [ SDL_GetMouseState ] ---

    /** {@code SDL_MouseButtonFlags SDL_GetMouseState(float * x, float * y)} */
    public static int nSDL_GetMouseState(long x, long y) {
        long __functionAddress = Functions.GetMouseState;
        return invokePPI(x, y, __functionAddress);
    }

    /** {@code SDL_MouseButtonFlags SDL_GetMouseState(float * x, float * y)} */
    @NativeType("SDL_MouseButtonFlags")
    public static int SDL_GetMouseState(@NativeType("float *") @Nullable FloatBuffer x, @NativeType("float *") @Nullable FloatBuffer y) {
        if (CHECKS) {
            checkSafe(x, 1);
            checkSafe(y, 1);
        }
        return nSDL_GetMouseState(memAddressSafe(x), memAddressSafe(y));
    }

    // --- [ SDL_GetGlobalMouseState ] ---

    /** {@code SDL_MouseButtonFlags SDL_GetGlobalMouseState(float * x, float * y)} */
    public static int nSDL_GetGlobalMouseState(long x, long y) {
        long __functionAddress = Functions.GetGlobalMouseState;
        return invokePPI(x, y, __functionAddress);
    }

    /** {@code SDL_MouseButtonFlags SDL_GetGlobalMouseState(float * x, float * y)} */
    @NativeType("SDL_MouseButtonFlags")
    public static int SDL_GetGlobalMouseState(@NativeType("float *") @Nullable FloatBuffer x, @NativeType("float *") @Nullable FloatBuffer y) {
        if (CHECKS) {
            checkSafe(x, 1);
            checkSafe(y, 1);
        }
        return nSDL_GetGlobalMouseState(memAddressSafe(x), memAddressSafe(y));
    }

    // --- [ SDL_GetRelativeMouseState ] ---

    /** {@code SDL_MouseButtonFlags SDL_GetRelativeMouseState(float * x, float * y)} */
    public static int nSDL_GetRelativeMouseState(long x, long y) {
        long __functionAddress = Functions.GetRelativeMouseState;
        return invokePPI(x, y, __functionAddress);
    }

    /** {@code SDL_MouseButtonFlags SDL_GetRelativeMouseState(float * x, float * y)} */
    @NativeType("SDL_MouseButtonFlags")
    public static int SDL_GetRelativeMouseState(@NativeType("float *") @Nullable FloatBuffer x, @NativeType("float *") @Nullable FloatBuffer y) {
        if (CHECKS) {
            checkSafe(x, 1);
            checkSafe(y, 1);
        }
        return nSDL_GetRelativeMouseState(memAddressSafe(x), memAddressSafe(y));
    }

    // --- [ SDL_WarpMouseInWindow ] ---

    /** {@code void SDL_WarpMouseInWindow(SDL_Window * window, float x, float y)} */
    public static void SDL_WarpMouseInWindow(@NativeType("SDL_Window *") long window, float x, float y) {
        long __functionAddress = Functions.WarpMouseInWindow;
        invokePV(window, x, y, __functionAddress);
    }

    // --- [ SDL_WarpMouseGlobal ] ---

    /** {@code bool SDL_WarpMouseGlobal(float x, float y)} */
    @NativeType("bool")
    public static boolean SDL_WarpMouseGlobal(float x, float y) {
        long __functionAddress = Functions.WarpMouseGlobal;
        return invokeZ(x, y, __functionAddress);
    }

    // --- [ SDL_SetWindowRelativeMouseMode ] ---

    /** {@code bool SDL_SetWindowRelativeMouseMode(SDL_Window * window, bool enabled)} */
    @NativeType("bool")
    public static boolean SDL_SetWindowRelativeMouseMode(@NativeType("SDL_Window *") long window, @NativeType("bool") boolean enabled) {
        long __functionAddress = Functions.SetWindowRelativeMouseMode;
        if (CHECKS) {
            check(window);
        }
        return invokePZ(window, enabled, __functionAddress);
    }

    // --- [ SDL_GetWindowRelativeMouseMode ] ---

    /** {@code bool SDL_GetWindowRelativeMouseMode(SDL_Window * window)} */
    @NativeType("bool")
    public static boolean SDL_GetWindowRelativeMouseMode(@NativeType("SDL_Window *") long window) {
        long __functionAddress = Functions.GetWindowRelativeMouseMode;
        if (CHECKS) {
            check(window);
        }
        return invokePZ(window, __functionAddress);
    }

    // --- [ SDL_CaptureMouse ] ---

    /** {@code bool SDL_CaptureMouse(bool enabled)} */
    @NativeType("bool")
    public static boolean SDL_CaptureMouse(@NativeType("bool") boolean enabled) {
        long __functionAddress = Functions.CaptureMouse;
        return invokeZ(enabled, __functionAddress);
    }

    // --- [ SDL_CreateCursor ] ---

    /** {@code SDL_Cursor * SDL_CreateCursor(Uint8 const * data, Uint8 const * mask, int w, int h, int hot_x, int hot_y)} */
    public static long nSDL_CreateCursor(long data, long mask, int w, int h, int hot_x, int hot_y) {
        long __functionAddress = Functions.CreateCursor;
        return invokePPP(data, mask, w, h, hot_x, hot_y, __functionAddress);
    }

    /** {@code SDL_Cursor * SDL_CreateCursor(Uint8 const * data, Uint8 const * mask, int w, int h, int hot_x, int hot_y)} */
    @NativeType("SDL_Cursor *")
    public static long SDL_CreateCursor(@NativeType("Uint8 const *") ByteBuffer data, @NativeType("Uint8 const *") ByteBuffer mask, int w, int h, int hot_x, int hot_y) {
        if (CHECKS) {
            check(data, (w * h) >> 3);
            check(mask, (w * h) >> 3);
        }
        return nSDL_CreateCursor(memAddress(data), memAddress(mask), w, h, hot_x, hot_y);
    }

    // --- [ SDL_CreateColorCursor ] ---

    /** {@code SDL_Cursor * SDL_CreateColorCursor(SDL_Surface * surface, int hot_x, int hot_y)} */
    public static long nSDL_CreateColorCursor(long surface, int hot_x, int hot_y) {
        long __functionAddress = Functions.CreateColorCursor;
        return invokePP(surface, hot_x, hot_y, __functionAddress);
    }

    /** {@code SDL_Cursor * SDL_CreateColorCursor(SDL_Surface * surface, int hot_x, int hot_y)} */
    @NativeType("SDL_Cursor *")
    public static long SDL_CreateColorCursor(@NativeType("SDL_Surface *") SDL_Surface surface, int hot_x, int hot_y) {
        return nSDL_CreateColorCursor(surface.address(), hot_x, hot_y);
    }

    // --- [ SDL_CreateSystemCursor ] ---

    /** {@code SDL_Cursor * SDL_CreateSystemCursor(SDL_SystemCursor id)} */
    @NativeType("SDL_Cursor *")
    public static long SDL_CreateSystemCursor(@NativeType("SDL_SystemCursor") int id) {
        long __functionAddress = Functions.CreateSystemCursor;
        return invokeP(id, __functionAddress);
    }

    // --- [ SDL_SetCursor ] ---

    /** {@code bool SDL_SetCursor(SDL_Cursor * cursor)} */
    @NativeType("bool")
    public static boolean SDL_SetCursor(@NativeType("SDL_Cursor *") long cursor) {
        long __functionAddress = Functions.SetCursor;
        if (CHECKS) {
            check(cursor);
        }
        return invokePZ(cursor, __functionAddress);
    }

    // --- [ SDL_GetCursor ] ---

    /** {@code SDL_Cursor * SDL_GetCursor(void)} */
    @NativeType("SDL_Cursor *")
    public static long SDL_GetCursor() {
        long __functionAddress = Functions.GetCursor;
        return invokeP(__functionAddress);
    }

    // --- [ SDL_GetDefaultCursor ] ---

    /** {@code SDL_Cursor * SDL_GetDefaultCursor(void)} */
    @NativeType("SDL_Cursor *")
    public static long SDL_GetDefaultCursor() {
        long __functionAddress = Functions.GetDefaultCursor;
        return invokeP(__functionAddress);
    }

    // --- [ SDL_DestroyCursor ] ---

    /** {@code void SDL_DestroyCursor(SDL_Cursor * cursor)} */
    public static void SDL_DestroyCursor(@NativeType("SDL_Cursor *") long cursor) {
        long __functionAddress = Functions.DestroyCursor;
        if (CHECKS) {
            check(cursor);
        }
        invokePV(cursor, __functionAddress);
    }

    // --- [ SDL_ShowCursor ] ---

    /** {@code bool SDL_ShowCursor(void)} */
    @NativeType("bool")
    public static boolean SDL_ShowCursor() {
        long __functionAddress = Functions.ShowCursor;
        return invokeZ(__functionAddress);
    }

    // --- [ SDL_HideCursor ] ---

    /** {@code bool SDL_HideCursor(void)} */
    @NativeType("bool")
    public static boolean SDL_HideCursor() {
        long __functionAddress = Functions.HideCursor;
        return invokeZ(__functionAddress);
    }

    // --- [ SDL_CursorVisible ] ---

    /** {@code bool SDL_CursorVisible(void)} */
    @NativeType("bool")
    public static boolean SDL_CursorVisible() {
        long __functionAddress = Functions.CursorVisible;
        return invokeZ(__functionAddress);
    }

    // --- [ SDL_BUTTON_MASK ] ---

    /** {@code uint32_t SDL_BUTTON_MASK(uint32_t X)} */
    @NativeType("uint32_t")
    private static int SDL_BUTTON_MASK(@NativeType("uint32_t") int X) {
        return 1 << (X - 1);
    }

}