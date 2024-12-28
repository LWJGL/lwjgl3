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

public class SDLKeyboard {

    /** Contains the function pointers loaded from {@code SDL.getLibrary()}. */
    public static final class Functions {

        private Functions() {}

        /** Function address. */
        public static final long
            HasKeyboard                  = apiGetFunctionAddress(SDL.getLibrary(), "SDL_HasKeyboard"),
            GetKeyboards                 = apiGetFunctionAddress(SDL.getLibrary(), "SDL_GetKeyboards"),
            GetKeyboardNameForID         = apiGetFunctionAddress(SDL.getLibrary(), "SDL_GetKeyboardNameForID"),
            GetKeyboardFocus             = apiGetFunctionAddress(SDL.getLibrary(), "SDL_GetKeyboardFocus"),
            GetKeyboardState             = apiGetFunctionAddress(SDL.getLibrary(), "SDL_GetKeyboardState"),
            ResetKeyboard                = apiGetFunctionAddress(SDL.getLibrary(), "SDL_ResetKeyboard"),
            GetModState                  = apiGetFunctionAddress(SDL.getLibrary(), "SDL_GetModState"),
            SetModState                  = apiGetFunctionAddress(SDL.getLibrary(), "SDL_SetModState"),
            GetKeyFromScancode           = apiGetFunctionAddress(SDL.getLibrary(), "SDL_GetKeyFromScancode"),
            GetScancodeFromKey           = apiGetFunctionAddress(SDL.getLibrary(), "SDL_GetScancodeFromKey"),
            SetScancodeName              = apiGetFunctionAddress(SDL.getLibrary(), "SDL_SetScancodeName"),
            GetScancodeName              = apiGetFunctionAddress(SDL.getLibrary(), "SDL_GetScancodeName"),
            GetScancodeFromName          = apiGetFunctionAddress(SDL.getLibrary(), "SDL_GetScancodeFromName"),
            GetKeyName                   = apiGetFunctionAddress(SDL.getLibrary(), "SDL_GetKeyName"),
            GetKeyFromName               = apiGetFunctionAddress(SDL.getLibrary(), "SDL_GetKeyFromName"),
            StartTextInput               = apiGetFunctionAddress(SDL.getLibrary(), "SDL_StartTextInput"),
            StartTextInputWithProperties = apiGetFunctionAddress(SDL.getLibrary(), "SDL_StartTextInputWithProperties"),
            TextInputActive              = apiGetFunctionAddress(SDL.getLibrary(), "SDL_TextInputActive"),
            StopTextInput                = apiGetFunctionAddress(SDL.getLibrary(), "SDL_StopTextInput"),
            ClearComposition             = apiGetFunctionAddress(SDL.getLibrary(), "SDL_ClearComposition"),
            SetTextInputArea             = apiGetFunctionAddress(SDL.getLibrary(), "SDL_SetTextInputArea"),
            GetTextInputArea             = apiGetFunctionAddress(SDL.getLibrary(), "SDL_GetTextInputArea"),
            HasScreenKeyboardSupport     = apiGetFunctionAddress(SDL.getLibrary(), "SDL_HasScreenKeyboardSupport"),
            ScreenKeyboardShown          = apiGetFunctionAddress(SDL.getLibrary(), "SDL_ScreenKeyboardShown");

    }

    public static final int
        SDL_TEXTINPUT_TYPE_TEXT                    = 0,
        SDL_TEXTINPUT_TYPE_TEXT_NAME               = 1,
        SDL_TEXTINPUT_TYPE_TEXT_EMAIL              = 2,
        SDL_TEXTINPUT_TYPE_TEXT_USERNAME           = 3,
        SDL_TEXTINPUT_TYPE_TEXT_PASSWORD_HIDDEN    = 4,
        SDL_TEXTINPUT_TYPE_TEXT_PASSWORD_VISIBLE   = 5,
        SDL_TEXTINPUT_TYPE_NUMBER                  = 6,
        SDL_TEXTINPUT_TYPE_NUMBER_PASSWORD_HIDDEN  = 7,
        SDL_TEXTINPUT_TYPE_NUMBER_PASSWORD_VISIBLE = 8;

    public static final int
        SDL_CAPITALIZE_NONE      = 0,
        SDL_CAPITALIZE_SENTENCES = 1,
        SDL_CAPITALIZE_WORDS     = 2,
        SDL_CAPITALIZE_LETTERS   = 3;

    public static final String
        SDL_PROP_TEXTINPUT_TYPE_NUMBER              = "SDL.textinput.type",
        SDL_PROP_TEXTINPUT_CAPITALIZATION_NUMBER    = "SDL.textinput.capitalization",
        SDL_PROP_TEXTINPUT_AUTOCORRECT_BOOLEAN      = "SDL.textinput.autocorrect",
        SDL_PROP_TEXTINPUT_MULTILINE_BOOLEAN        = "SDL.textinput.multiline",
        SDL_PROP_TEXTINPUT_ANDROID_INPUTTYPE_NUMBER = "SDL.textinput.android.inputtype";

    protected SDLKeyboard() {
        throw new UnsupportedOperationException();
    }

    // --- [ SDL_HasKeyboard ] ---

    /** {@code bool SDL_HasKeyboard(void)} */
    @NativeType("bool")
    public static boolean SDL_HasKeyboard() {
        long __functionAddress = Functions.HasKeyboard;
        return invokeZ(__functionAddress);
    }

    // --- [ SDL_GetKeyboards ] ---

    /** {@code SDL_KeyboardID * SDL_GetKeyboards(int * count)} */
    public static long nSDL_GetKeyboards(long count) {
        long __functionAddress = Functions.GetKeyboards;
        return invokePP(count, __functionAddress);
    }

    /** {@code SDL_KeyboardID * SDL_GetKeyboards(int * count)} */
    @NativeType("SDL_KeyboardID *")
    public static @Nullable IntBuffer SDL_GetKeyboards() {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        IntBuffer count = stack.callocInt(1);
        try {
            long __result = nSDL_GetKeyboards(memAddress(count));
            return memIntBufferSafe(__result, count.get(0));
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ SDL_GetKeyboardNameForID ] ---

    /** {@code char const * SDL_GetKeyboardNameForID(SDL_KeyboardID instance_id)} */
    public static long nSDL_GetKeyboardNameForID(int instance_id) {
        long __functionAddress = Functions.GetKeyboardNameForID;
        return invokeP(instance_id, __functionAddress);
    }

    /** {@code char const * SDL_GetKeyboardNameForID(SDL_KeyboardID instance_id)} */
    @NativeType("char const *")
    public static @Nullable String SDL_GetKeyboardNameForID(@NativeType("SDL_KeyboardID") int instance_id) {
        long __result = nSDL_GetKeyboardNameForID(instance_id);
        return memUTF8Safe(__result);
    }

    // --- [ SDL_GetKeyboardFocus ] ---

    /** {@code SDL_Window * SDL_GetKeyboardFocus(void)} */
    @NativeType("SDL_Window *")
    public static long SDL_GetKeyboardFocus() {
        long __functionAddress = Functions.GetKeyboardFocus;
        return invokeP(__functionAddress);
    }

    // --- [ SDL_GetKeyboardState ] ---

    /** {@code bool const * SDL_GetKeyboardState(int * numkeys)} */
    public static long nSDL_GetKeyboardState(long numkeys) {
        long __functionAddress = Functions.GetKeyboardState;
        return invokePP(numkeys, __functionAddress);
    }

    /** {@code bool const * SDL_GetKeyboardState(int * numkeys)} */
    @NativeType("bool const *")
    public static @Nullable ByteBuffer SDL_GetKeyboardState() {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        IntBuffer numkeys = stack.callocInt(1);
        try {
            long __result = nSDL_GetKeyboardState(memAddress(numkeys));
            return memByteBufferSafe(__result, numkeys.get(0));
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ SDL_ResetKeyboard ] ---

    /** {@code void SDL_ResetKeyboard(void)} */
    public static void SDL_ResetKeyboard() {
        long __functionAddress = Functions.ResetKeyboard;
        invokeV(__functionAddress);
    }

    // --- [ SDL_GetModState ] ---

    /** {@code SDL_Keymod SDL_GetModState(void)} */
    @NativeType("SDL_Keymod")
    public static short SDL_GetModState() {
        long __functionAddress = Functions.GetModState;
        return invokeC(__functionAddress);
    }

    // --- [ SDL_SetModState ] ---

    /** {@code void SDL_SetModState(SDL_Keymod modstate)} */
    public static void SDL_SetModState(@NativeType("SDL_Keymod") short modstate) {
        long __functionAddress = Functions.SetModState;
        invokeCV(modstate, __functionAddress);
    }

    // --- [ SDL_GetKeyFromScancode ] ---

    /** {@code SDL_Keycode SDL_GetKeyFromScancode(SDL_Scancode scancode, SDL_Keymod modstate, bool key_event)} */
    @NativeType("SDL_Keycode")
    public static int SDL_GetKeyFromScancode(@NativeType("SDL_Scancode") int scancode, @NativeType("SDL_Keymod") short modstate, @NativeType("bool") boolean key_event) {
        long __functionAddress = Functions.GetKeyFromScancode;
        return invokeCI(scancode, modstate, key_event, __functionAddress);
    }

    // --- [ SDL_GetScancodeFromKey ] ---

    /** {@code SDL_Scancode SDL_GetScancodeFromKey(SDL_Keycode key, SDL_Keymod * modstate)} */
    public static int nSDL_GetScancodeFromKey(int key, long modstate) {
        long __functionAddress = Functions.GetScancodeFromKey;
        return invokePI(key, modstate, __functionAddress);
    }

    /** {@code SDL_Scancode SDL_GetScancodeFromKey(SDL_Keycode key, SDL_Keymod * modstate)} */
    @NativeType("SDL_Scancode")
    public static int SDL_GetScancodeFromKey(@NativeType("SDL_Keycode") int key, @NativeType("SDL_Keymod *") @Nullable ShortBuffer modstate) {
        if (CHECKS) {
            checkSafe(modstate, 1);
        }
        return nSDL_GetScancodeFromKey(key, memAddressSafe(modstate));
    }

    // --- [ SDL_SetScancodeName ] ---

    /** {@code bool SDL_SetScancodeName(SDL_Scancode scancode, char const * name)} */
    public static boolean nSDL_SetScancodeName(int scancode, long name) {
        long __functionAddress = Functions.SetScancodeName;
        return invokePZ(scancode, name, __functionAddress);
    }

    /** {@code bool SDL_SetScancodeName(SDL_Scancode scancode, char const * name)} */
    @NativeType("bool")
    public static boolean SDL_SetScancodeName(@NativeType("SDL_Scancode") int scancode, @NativeType("char const *") ByteBuffer name) {
        if (CHECKS) {
            checkNT1(name);
        }
        return nSDL_SetScancodeName(scancode, memAddress(name));
    }

    // --- [ SDL_GetScancodeName ] ---

    /** {@code char const * SDL_GetScancodeName(SDL_Scancode scancode)} */
    public static long nSDL_GetScancodeName(int scancode) {
        long __functionAddress = Functions.GetScancodeName;
        return invokeP(scancode, __functionAddress);
    }

    /** {@code char const * SDL_GetScancodeName(SDL_Scancode scancode)} */
    @NativeType("char const *")
    public static @Nullable String SDL_GetScancodeName(@NativeType("SDL_Scancode") int scancode) {
        long __result = nSDL_GetScancodeName(scancode);
        return memUTF8Safe(__result);
    }

    // --- [ SDL_GetScancodeFromName ] ---

    /** {@code SDL_Scancode SDL_GetScancodeFromName(char const * name)} */
    public static int nSDL_GetScancodeFromName(long name) {
        long __functionAddress = Functions.GetScancodeFromName;
        return invokePI(name, __functionAddress);
    }

    /** {@code SDL_Scancode SDL_GetScancodeFromName(char const * name)} */
    @NativeType("SDL_Scancode")
    public static int SDL_GetScancodeFromName(@NativeType("char const *") ByteBuffer name) {
        if (CHECKS) {
            checkNT1(name);
        }
        return nSDL_GetScancodeFromName(memAddress(name));
    }

    /** {@code SDL_Scancode SDL_GetScancodeFromName(char const * name)} */
    @NativeType("SDL_Scancode")
    public static int SDL_GetScancodeFromName(@NativeType("char const *") CharSequence name) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nUTF8(name, true);
            long nameEncoded = stack.getPointerAddress();
            return nSDL_GetScancodeFromName(nameEncoded);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ SDL_GetKeyName ] ---

    /** {@code char const * SDL_GetKeyName(SDL_Keycode key)} */
    public static long nSDL_GetKeyName(int key) {
        long __functionAddress = Functions.GetKeyName;
        return invokeP(key, __functionAddress);
    }

    /** {@code char const * SDL_GetKeyName(SDL_Keycode key)} */
    @NativeType("char const *")
    public static @Nullable String SDL_GetKeyName(@NativeType("SDL_Keycode") int key) {
        long __result = nSDL_GetKeyName(key);
        return memUTF8Safe(__result);
    }

    // --- [ SDL_GetKeyFromName ] ---

    /** {@code SDL_Keycode SDL_GetKeyFromName(char const * name)} */
    public static int nSDL_GetKeyFromName(long name) {
        long __functionAddress = Functions.GetKeyFromName;
        return invokePI(name, __functionAddress);
    }

    /** {@code SDL_Keycode SDL_GetKeyFromName(char const * name)} */
    @NativeType("SDL_Keycode")
    public static int SDL_GetKeyFromName(@NativeType("char const *") ByteBuffer name) {
        if (CHECKS) {
            checkNT1(name);
        }
        return nSDL_GetKeyFromName(memAddress(name));
    }

    /** {@code SDL_Keycode SDL_GetKeyFromName(char const * name)} */
    @NativeType("SDL_Keycode")
    public static int SDL_GetKeyFromName(@NativeType("char const *") CharSequence name) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nUTF8(name, true);
            long nameEncoded = stack.getPointerAddress();
            return nSDL_GetKeyFromName(nameEncoded);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ SDL_StartTextInput ] ---

    /** {@code bool SDL_StartTextInput(SDL_Window * window)} */
    @NativeType("bool")
    public static boolean SDL_StartTextInput(@NativeType("SDL_Window *") long window) {
        long __functionAddress = Functions.StartTextInput;
        if (CHECKS) {
            check(window);
        }
        return invokePZ(window, __functionAddress);
    }

    // --- [ SDL_StartTextInputWithProperties ] ---

    /** {@code bool SDL_StartTextInputWithProperties(SDL_Window * window, SDL_PropertiesID props)} */
    @NativeType("bool")
    public static boolean SDL_StartTextInputWithProperties(@NativeType("SDL_Window *") long window, @NativeType("SDL_PropertiesID") int props) {
        long __functionAddress = Functions.StartTextInputWithProperties;
        if (CHECKS) {
            check(window);
        }
        return invokePZ(window, props, __functionAddress);
    }

    // --- [ SDL_TextInputActive ] ---

    /** {@code bool SDL_TextInputActive(SDL_Window * window)} */
    @NativeType("bool")
    public static boolean SDL_TextInputActive(@NativeType("SDL_Window *") long window) {
        long __functionAddress = Functions.TextInputActive;
        if (CHECKS) {
            check(window);
        }
        return invokePZ(window, __functionAddress);
    }

    // --- [ SDL_StopTextInput ] ---

    /** {@code bool SDL_StopTextInput(SDL_Window * window)} */
    @NativeType("bool")
    public static boolean SDL_StopTextInput(@NativeType("SDL_Window *") long window) {
        long __functionAddress = Functions.StopTextInput;
        if (CHECKS) {
            check(window);
        }
        return invokePZ(window, __functionAddress);
    }

    // --- [ SDL_ClearComposition ] ---

    /** {@code bool SDL_ClearComposition(SDL_Window * window)} */
    @NativeType("bool")
    public static boolean SDL_ClearComposition(@NativeType("SDL_Window *") long window) {
        long __functionAddress = Functions.ClearComposition;
        if (CHECKS) {
            check(window);
        }
        return invokePZ(window, __functionAddress);
    }

    // --- [ SDL_SetTextInputArea ] ---

    /** {@code bool SDL_SetTextInputArea(SDL_Window * window, SDL_Rect const * rect, int cursor)} */
    public static boolean nSDL_SetTextInputArea(long window, long rect, int cursor) {
        long __functionAddress = Functions.SetTextInputArea;
        if (CHECKS) {
            check(window);
        }
        return invokePPZ(window, rect, cursor, __functionAddress);
    }

    /** {@code bool SDL_SetTextInputArea(SDL_Window * window, SDL_Rect const * rect, int cursor)} */
    @NativeType("bool")
    public static boolean SDL_SetTextInputArea(@NativeType("SDL_Window *") long window, @NativeType("SDL_Rect const *") SDL_Rect.@Nullable Buffer rect, int cursor) {
        if (CHECKS) {
            checkSafe(rect, 1);
        }
        return nSDL_SetTextInputArea(window, memAddressSafe(rect), cursor);
    }

    // --- [ SDL_GetTextInputArea ] ---

    /** {@code bool SDL_GetTextInputArea(SDL_Window * window, SDL_Rect * rect, int * cursor)} */
    public static boolean nSDL_GetTextInputArea(long window, long rect, long cursor) {
        long __functionAddress = Functions.GetTextInputArea;
        if (CHECKS) {
            check(window);
        }
        return invokePPPZ(window, rect, cursor, __functionAddress);
    }

    /** {@code bool SDL_GetTextInputArea(SDL_Window * window, SDL_Rect * rect, int * cursor)} */
    @NativeType("bool")
    public static boolean SDL_GetTextInputArea(@NativeType("SDL_Window *") long window, @NativeType("SDL_Rect *") SDL_Rect.@Nullable Buffer rect, @NativeType("int *") @Nullable IntBuffer cursor) {
        if (CHECKS) {
            checkSafe(rect, 1);
            checkSafe(cursor, 1);
        }
        return nSDL_GetTextInputArea(window, memAddressSafe(rect), memAddressSafe(cursor));
    }

    // --- [ SDL_HasScreenKeyboardSupport ] ---

    /** {@code bool SDL_HasScreenKeyboardSupport(void)} */
    @NativeType("bool")
    public static boolean SDL_HasScreenKeyboardSupport() {
        long __functionAddress = Functions.HasScreenKeyboardSupport;
        return invokeZ(__functionAddress);
    }

    // --- [ SDL_ScreenKeyboardShown ] ---

    /** {@code bool SDL_ScreenKeyboardShown(SDL_Window * window)} */
    @NativeType("bool")
    public static boolean SDL_ScreenKeyboardShown(@NativeType("SDL_Window *") long window) {
        long __functionAddress = Functions.ScreenKeyboardShown;
        if (CHECKS) {
            check(window);
        }
        return invokePZ(window, __functionAddress);
    }

}