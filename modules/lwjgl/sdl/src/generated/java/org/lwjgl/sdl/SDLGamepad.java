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
import org.lwjgl.system.libffi.*;

import static org.lwjgl.system.APIUtil.*;
import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.JNI.*;
import static org.lwjgl.system.libffi.LibFFI.*;
import static org.lwjgl.system.MemoryStack.*;
import static org.lwjgl.system.MemoryUtil.*;

import static org.lwjgl.sdl.SDLStdinc.*;

public class SDLGamepad {

    /** Contains the function pointers loaded from {@code SDL.getLibrary()}. */
    public static final class Functions {

        private Functions() {}

        /** Function address. */
        public static final long
            AddGamepadMapping                     = apiGetFunctionAddress(SDL.getLibrary(), "SDL_AddGamepadMapping"),
            AddGamepadMappingsFromIO              = apiGetFunctionAddress(SDL.getLibrary(), "SDL_AddGamepadMappingsFromIO"),
            AddGamepadMappingsFromFile            = apiGetFunctionAddress(SDL.getLibrary(), "SDL_AddGamepadMappingsFromFile"),
            ReloadGamepadMappings                 = apiGetFunctionAddress(SDL.getLibrary(), "SDL_ReloadGamepadMappings"),
            GetGamepadMappings                    = apiGetFunctionAddress(SDL.getLibrary(), "SDL_GetGamepadMappings"),
            GetGamepadMappingForGUID              = apiGetFunctionAddress(SDL.getLibrary(), "SDL_GetGamepadMappingForGUID"),
            GetGamepadMapping                     = apiGetFunctionAddress(SDL.getLibrary(), "SDL_GetGamepadMapping"),
            SetGamepadMapping                     = apiGetFunctionAddress(SDL.getLibrary(), "SDL_SetGamepadMapping"),
            HasGamepad                            = apiGetFunctionAddress(SDL.getLibrary(), "SDL_HasGamepad"),
            GetGamepads                           = apiGetFunctionAddress(SDL.getLibrary(), "SDL_GetGamepads"),
            IsGamepad                             = apiGetFunctionAddress(SDL.getLibrary(), "SDL_IsGamepad"),
            GetGamepadNameForID                   = apiGetFunctionAddress(SDL.getLibrary(), "SDL_GetGamepadNameForID"),
            GetGamepadPathForID                   = apiGetFunctionAddress(SDL.getLibrary(), "SDL_GetGamepadPathForID"),
            GetGamepadPlayerIndexForID            = apiGetFunctionAddress(SDL.getLibrary(), "SDL_GetGamepadPlayerIndexForID"),
            GetGamepadGUIDForID                   = apiGetFunctionAddress(SDL.getLibrary(), "SDL_GetGamepadGUIDForID"),
            GetGamepadVendorForID                 = apiGetFunctionAddress(SDL.getLibrary(), "SDL_GetGamepadVendorForID"),
            GetGamepadProductForID                = apiGetFunctionAddress(SDL.getLibrary(), "SDL_GetGamepadProductForID"),
            GetGamepadProductVersionForID         = apiGetFunctionAddress(SDL.getLibrary(), "SDL_GetGamepadProductVersionForID"),
            GetGamepadTypeForID                   = apiGetFunctionAddress(SDL.getLibrary(), "SDL_GetGamepadTypeForID"),
            GetRealGamepadTypeForID               = apiGetFunctionAddress(SDL.getLibrary(), "SDL_GetRealGamepadTypeForID"),
            GetGamepadMappingForID                = apiGetFunctionAddress(SDL.getLibrary(), "SDL_GetGamepadMappingForID"),
            OpenGamepad                           = apiGetFunctionAddress(SDL.getLibrary(), "SDL_OpenGamepad"),
            GetGamepadFromID                      = apiGetFunctionAddress(SDL.getLibrary(), "SDL_GetGamepadFromID"),
            GetGamepadFromPlayerIndex             = apiGetFunctionAddress(SDL.getLibrary(), "SDL_GetGamepadFromPlayerIndex"),
            GetGamepadProperties                  = apiGetFunctionAddress(SDL.getLibrary(), "SDL_GetGamepadProperties"),
            GetGamepadID                          = apiGetFunctionAddress(SDL.getLibrary(), "SDL_GetGamepadID"),
            GetGamepadName                        = apiGetFunctionAddress(SDL.getLibrary(), "SDL_GetGamepadName"),
            GetGamepadPath                        = apiGetFunctionAddress(SDL.getLibrary(), "SDL_GetGamepadPath"),
            GetGamepadType                        = apiGetFunctionAddress(SDL.getLibrary(), "SDL_GetGamepadType"),
            GetRealGamepadType                    = apiGetFunctionAddress(SDL.getLibrary(), "SDL_GetRealGamepadType"),
            GetGamepadPlayerIndex                 = apiGetFunctionAddress(SDL.getLibrary(), "SDL_GetGamepadPlayerIndex"),
            SetGamepadPlayerIndex                 = apiGetFunctionAddress(SDL.getLibrary(), "SDL_SetGamepadPlayerIndex"),
            GetGamepadVendor                      = apiGetFunctionAddress(SDL.getLibrary(), "SDL_GetGamepadVendor"),
            GetGamepadProduct                     = apiGetFunctionAddress(SDL.getLibrary(), "SDL_GetGamepadProduct"),
            GetGamepadProductVersion              = apiGetFunctionAddress(SDL.getLibrary(), "SDL_GetGamepadProductVersion"),
            GetGamepadFirmwareVersion             = apiGetFunctionAddress(SDL.getLibrary(), "SDL_GetGamepadFirmwareVersion"),
            GetGamepadSerial                      = apiGetFunctionAddress(SDL.getLibrary(), "SDL_GetGamepadSerial"),
            GetGamepadSteamHandle                 = apiGetFunctionAddress(SDL.getLibrary(), "SDL_GetGamepadSteamHandle"),
            GetGamepadConnectionState             = apiGetFunctionAddress(SDL.getLibrary(), "SDL_GetGamepadConnectionState"),
            GetGamepadPowerInfo                   = apiGetFunctionAddress(SDL.getLibrary(), "SDL_GetGamepadPowerInfo"),
            GamepadConnected                      = apiGetFunctionAddress(SDL.getLibrary(), "SDL_GamepadConnected"),
            GetGamepadJoystick                    = apiGetFunctionAddress(SDL.getLibrary(), "SDL_GetGamepadJoystick"),
            SetGamepadEventsEnabled               = apiGetFunctionAddress(SDL.getLibrary(), "SDL_SetGamepadEventsEnabled"),
            GamepadEventsEnabled                  = apiGetFunctionAddress(SDL.getLibrary(), "SDL_GamepadEventsEnabled"),
            GetGamepadBindings                    = apiGetFunctionAddress(SDL.getLibrary(), "SDL_GetGamepadBindings"),
            UpdateGamepads                        = apiGetFunctionAddress(SDL.getLibrary(), "SDL_UpdateGamepads"),
            GetGamepadTypeFromString              = apiGetFunctionAddress(SDL.getLibrary(), "SDL_GetGamepadTypeFromString"),
            GetGamepadStringForType               = apiGetFunctionAddress(SDL.getLibrary(), "SDL_GetGamepadStringForType"),
            GetGamepadAxisFromString              = apiGetFunctionAddress(SDL.getLibrary(), "SDL_GetGamepadAxisFromString"),
            GetGamepadStringForAxis               = apiGetFunctionAddress(SDL.getLibrary(), "SDL_GetGamepadStringForAxis"),
            GamepadHasAxis                        = apiGetFunctionAddress(SDL.getLibrary(), "SDL_GamepadHasAxis"),
            GetGamepadAxis                        = apiGetFunctionAddress(SDL.getLibrary(), "SDL_GetGamepadAxis"),
            GetGamepadButtonFromString            = apiGetFunctionAddress(SDL.getLibrary(), "SDL_GetGamepadButtonFromString"),
            GetGamepadStringForButton             = apiGetFunctionAddress(SDL.getLibrary(), "SDL_GetGamepadStringForButton"),
            GamepadHasButton                      = apiGetFunctionAddress(SDL.getLibrary(), "SDL_GamepadHasButton"),
            GetGamepadButton                      = apiGetFunctionAddress(SDL.getLibrary(), "SDL_GetGamepadButton"),
            GetGamepadButtonLabelForType          = apiGetFunctionAddress(SDL.getLibrary(), "SDL_GetGamepadButtonLabelForType"),
            GetGamepadButtonLabel                 = apiGetFunctionAddress(SDL.getLibrary(), "SDL_GetGamepadButtonLabel"),
            GetNumGamepadTouchpads                = apiGetFunctionAddress(SDL.getLibrary(), "SDL_GetNumGamepadTouchpads"),
            GetNumGamepadTouchpadFingers          = apiGetFunctionAddress(SDL.getLibrary(), "SDL_GetNumGamepadTouchpadFingers"),
            GetGamepadTouchpadFinger              = apiGetFunctionAddress(SDL.getLibrary(), "SDL_GetGamepadTouchpadFinger"),
            GamepadHasSensor                      = apiGetFunctionAddress(SDL.getLibrary(), "SDL_GamepadHasSensor"),
            SetGamepadSensorEnabled               = apiGetFunctionAddress(SDL.getLibrary(), "SDL_SetGamepadSensorEnabled"),
            GamepadSensorEnabled                  = apiGetFunctionAddress(SDL.getLibrary(), "SDL_GamepadSensorEnabled"),
            GetGamepadSensorDataRate              = apiGetFunctionAddress(SDL.getLibrary(), "SDL_GetGamepadSensorDataRate"),
            GetGamepadSensorData                  = apiGetFunctionAddress(SDL.getLibrary(), "SDL_GetGamepadSensorData"),
            RumbleGamepad                         = apiGetFunctionAddress(SDL.getLibrary(), "SDL_RumbleGamepad"),
            RumbleGamepadTriggers                 = apiGetFunctionAddress(SDL.getLibrary(), "SDL_RumbleGamepadTriggers"),
            SetGamepadLED                         = apiGetFunctionAddress(SDL.getLibrary(), "SDL_SetGamepadLED"),
            SendGamepadEffect                     = apiGetFunctionAddress(SDL.getLibrary(), "SDL_SendGamepadEffect"),
            CloseGamepad                          = apiGetFunctionAddress(SDL.getLibrary(), "SDL_CloseGamepad"),
            GetGamepadAppleSFSymbolsNameForButton = apiGetFunctionAddress(SDL.getLibrary(), "SDL_GetGamepadAppleSFSymbolsNameForButton"),
            GetGamepadAppleSFSymbolsNameForAxis   = apiGetFunctionAddress(SDL.getLibrary(), "SDL_GetGamepadAppleSFSymbolsNameForAxis");

    }

    public static final String
        SDL_PROP_GAMEPAD_CAP_MONO_LED_BOOLEAN       = SDLJoystick.SDL_PROP_JOYSTICK_CAP_MONO_LED_BOOLEAN,
        SDL_PROP_GAMEPAD_CAP_RGB_LED_BOOLEAN        = SDLJoystick.SDL_PROP_JOYSTICK_CAP_RGB_LED_BOOLEAN,
        SDL_PROP_GAMEPAD_CAP_PLAYER_LED_BOOLEAN     = SDLJoystick.SDL_PROP_JOYSTICK_CAP_PLAYER_LED_BOOLEAN,
        SDL_PROP_GAMEPAD_CAP_RUMBLE_BOOLEAN         = SDLJoystick.SDL_PROP_JOYSTICK_CAP_RUMBLE_BOOLEAN,
        SDL_PROP_GAMEPAD_CAP_TRIGGER_RUMBLE_BOOLEAN = SDLJoystick.SDL_PROP_JOYSTICK_CAP_TRIGGER_RUMBLE_BOOLEAN;

    public static final int
        SDL_GAMEPAD_TYPE_UNKNOWN                      = 0,
        SDL_GAMEPAD_TYPE_STANDARD                     = 1,
        SDL_GAMEPAD_TYPE_XBOX360                      = 2,
        SDL_GAMEPAD_TYPE_XBOXONE                      = 3,
        SDL_GAMEPAD_TYPE_PS3                          = 4,
        SDL_GAMEPAD_TYPE_PS4                          = 5,
        SDL_GAMEPAD_TYPE_PS5                          = 6,
        SDL_GAMEPAD_TYPE_NINTENDO_SWITCH_PRO          = 7,
        SDL_GAMEPAD_TYPE_NINTENDO_SWITCH_JOYCON_LEFT  = 8,
        SDL_GAMEPAD_TYPE_NINTENDO_SWITCH_JOYCON_RIGHT = 9,
        SDL_GAMEPAD_TYPE_NINTENDO_SWITCH_JOYCON_PAIR  = 10,
        SDL_GAMEPAD_TYPE_COUNT                        = 11;

    public static final int
        SDL_GAMEPAD_BUTTON_INVALID        = -1,
        SDL_GAMEPAD_BUTTON_SOUTH          = 0,
        SDL_GAMEPAD_BUTTON_EAST           = 1,
        SDL_GAMEPAD_BUTTON_WEST           = 2,
        SDL_GAMEPAD_BUTTON_NORTH          = 3,
        SDL_GAMEPAD_BUTTON_BACK           = 4,
        SDL_GAMEPAD_BUTTON_GUIDE          = 5,
        SDL_GAMEPAD_BUTTON_START          = 6,
        SDL_GAMEPAD_BUTTON_LEFT_STICK     = 7,
        SDL_GAMEPAD_BUTTON_RIGHT_STICK    = 8,
        SDL_GAMEPAD_BUTTON_LEFT_SHOULDER  = 9,
        SDL_GAMEPAD_BUTTON_RIGHT_SHOULDER = 10,
        SDL_GAMEPAD_BUTTON_DPAD_UP        = 11,
        SDL_GAMEPAD_BUTTON_DPAD_DOWN      = 12,
        SDL_GAMEPAD_BUTTON_DPAD_LEFT      = 13,
        SDL_GAMEPAD_BUTTON_DPAD_RIGHT     = 14,
        SDL_GAMEPAD_BUTTON_MISC1          = 15,
        SDL_GAMEPAD_BUTTON_RIGHT_PADDLE1  = 16,
        SDL_GAMEPAD_BUTTON_LEFT_PADDLE1   = 17,
        SDL_GAMEPAD_BUTTON_RIGHT_PADDLE2  = 18,
        SDL_GAMEPAD_BUTTON_LEFT_PADDLE2   = 19,
        SDL_GAMEPAD_BUTTON_TOUCHPAD       = 20,
        SDL_GAMEPAD_BUTTON_MISC2          = 21,
        SDL_GAMEPAD_BUTTON_MISC3          = 22,
        SDL_GAMEPAD_BUTTON_MISC4          = 23,
        SDL_GAMEPAD_BUTTON_MISC5          = 24,
        SDL_GAMEPAD_BUTTON_MISC6          = 25,
        SDL_GAMEPAD_BUTTON_COUNT          = 26;

    public static final int
        SDL_GAMEPAD_BUTTON_LABEL_UNKNOWN  = 0,
        SDL_GAMEPAD_BUTTON_LABEL_A        = 1,
        SDL_GAMEPAD_BUTTON_LABEL_B        = 2,
        SDL_GAMEPAD_BUTTON_LABEL_X        = 3,
        SDL_GAMEPAD_BUTTON_LABEL_Y        = 4,
        SDL_GAMEPAD_BUTTON_LABEL_CROSS    = 5,
        SDL_GAMEPAD_BUTTON_LABEL_CIRCLE   = 6,
        SDL_GAMEPAD_BUTTON_LABEL_SQUARE   = 7,
        SDL_GAMEPAD_BUTTON_LABEL_TRIANGLE = 8;

    public static final int
        SDL_GAMEPAD_AXIS_INVALID       = -1,
        SDL_GAMEPAD_AXIS_LEFTX         = 0,
        SDL_GAMEPAD_AXIS_LEFTY         = 1,
        SDL_GAMEPAD_AXIS_RIGHTX        = 2,
        SDL_GAMEPAD_AXIS_RIGHTY        = 3,
        SDL_GAMEPAD_AXIS_LEFT_TRIGGER  = 4,
        SDL_GAMEPAD_AXIS_RIGHT_TRIGGER = 5,
        SDL_GAMEPAD_AXIS_COUNT         = 6;

    public static final int
        SDL_GAMEPAD_BINDTYPE_NONE   = 0,
        SDL_GAMEPAD_BINDTYPE_BUTTON = 1,
        SDL_GAMEPAD_BINDTYPE_AXIS   = 2,
        SDL_GAMEPAD_BINDTYPE_HAT    = 3;

    protected SDLGamepad() {
        throw new UnsupportedOperationException();
    }

    // --- [ SDL_AddGamepadMapping ] ---

    /** {@code int SDL_AddGamepadMapping(char const * mapping)} */
    public static int nSDL_AddGamepadMapping(long mapping) {
        long __functionAddress = Functions.AddGamepadMapping;
        return invokePI(mapping, __functionAddress);
    }

    /** {@code int SDL_AddGamepadMapping(char const * mapping)} */
    public static int SDL_AddGamepadMapping(@NativeType("char const *") ByteBuffer mapping) {
        if (CHECKS) {
            checkNT1(mapping);
        }
        return nSDL_AddGamepadMapping(memAddress(mapping));
    }

    /** {@code int SDL_AddGamepadMapping(char const * mapping)} */
    public static int SDL_AddGamepadMapping(@NativeType("char const *") CharSequence mapping) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nUTF8(mapping, true);
            long mappingEncoded = stack.getPointerAddress();
            return nSDL_AddGamepadMapping(mappingEncoded);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ SDL_AddGamepadMappingsFromIO ] ---

    /** {@code int SDL_AddGamepadMappingsFromIO(SDL_IOStream * src, bool closeio)} */
    public static int SDL_AddGamepadMappingsFromIO(@NativeType("SDL_IOStream *") long src, @NativeType("bool") boolean closeio) {
        long __functionAddress = Functions.AddGamepadMappingsFromIO;
        if (CHECKS) {
            check(src);
        }
        return invokePI(src, closeio, __functionAddress);
    }

    // --- [ SDL_AddGamepadMappingsFromFile ] ---

    /** {@code int SDL_AddGamepadMappingsFromFile(char const * file)} */
    public static int nSDL_AddGamepadMappingsFromFile(long file) {
        long __functionAddress = Functions.AddGamepadMappingsFromFile;
        return invokePI(file, __functionAddress);
    }

    /** {@code int SDL_AddGamepadMappingsFromFile(char const * file)} */
    public static int SDL_AddGamepadMappingsFromFile(@NativeType("char const *") ByteBuffer file) {
        if (CHECKS) {
            checkNT1(file);
        }
        return nSDL_AddGamepadMappingsFromFile(memAddress(file));
    }

    /** {@code int SDL_AddGamepadMappingsFromFile(char const * file)} */
    public static int SDL_AddGamepadMappingsFromFile(@NativeType("char const *") CharSequence file) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nUTF8(file, true);
            long fileEncoded = stack.getPointerAddress();
            return nSDL_AddGamepadMappingsFromFile(fileEncoded);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ SDL_ReloadGamepadMappings ] ---

    /** {@code bool SDL_ReloadGamepadMappings(void)} */
    @NativeType("bool")
    public static boolean SDL_ReloadGamepadMappings() {
        long __functionAddress = Functions.ReloadGamepadMappings;
        return invokeZ(__functionAddress);
    }

    // --- [ SDL_GetGamepadMappings ] ---

    /** {@code char ** SDL_GetGamepadMappings(int * count)} */
    public static long nSDL_GetGamepadMappings(long count) {
        long __functionAddress = Functions.GetGamepadMappings;
        return invokePP(count, __functionAddress);
    }

    /** {@code char ** SDL_GetGamepadMappings(int * count)} */
    @NativeType("char **")
    public static @Nullable PointerBuffer SDL_GetGamepadMappings() {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        IntBuffer count = stack.callocInt(1);
        try {
            long __result = nSDL_GetGamepadMappings(memAddress(count));
            return memPointerBufferSafe(__result, count.get(0));
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ SDL_GetGamepadMappingForGUID ] ---

    private static final FFICIF SDL_GetGamepadMappingForGUIDCIF = apiCreateCIF(
        FFI_DEFAULT_ABI, ffi_type_pointer,
        apiCreateStruct(apiCreateArray(ffi_type_uint8, 16))
    );

    /** {@code char * SDL_GetGamepadMappingForGUID(SDL_GUID guid)} */
    public static long nSDL_GetGamepadMappingForGUID(long guid) {
        long __functionAddress = Functions.GetGamepadMappingForGUID;
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            long __result = stack.npointer(0);
            long arguments = stack.nmalloc(POINTER_SIZE, POINTER_SIZE * 1);
            memPutAddress(arguments, guid);

            nffi_call(SDL_GetGamepadMappingForGUIDCIF.address(), __functionAddress, __result, arguments);

            return memGetAddress(__result);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    /** {@code char * SDL_GetGamepadMappingForGUID(SDL_GUID guid)} */
    @NativeType("char *")
    public static @Nullable String SDL_GetGamepadMappingForGUID(SDL_GUID guid) {
        long __result = NULL;
        try {
            __result = nSDL_GetGamepadMappingForGUID(guid.address());
            return memUTF8Safe(__result);
        } finally {
            nSDL_free(__result);
        }
    }

    // --- [ SDL_GetGamepadMapping ] ---

    /** {@code char * SDL_GetGamepadMapping(SDL_Gamepad * gamepad)} */
    public static long nSDL_GetGamepadMapping(long gamepad) {
        long __functionAddress = Functions.GetGamepadMapping;
        if (CHECKS) {
            check(gamepad);
        }
        return invokePP(gamepad, __functionAddress);
    }

    /** {@code char * SDL_GetGamepadMapping(SDL_Gamepad * gamepad)} */
    @NativeType("char *")
    public static @Nullable String SDL_GetGamepadMapping(@NativeType("SDL_Gamepad *") long gamepad) {
        long __result = NULL;
        try {
            __result = nSDL_GetGamepadMapping(gamepad);
            return memUTF8Safe(__result);
        } finally {
            nSDL_free(__result);
        }
    }

    // --- [ SDL_SetGamepadMapping ] ---

    /** {@code bool SDL_SetGamepadMapping(SDL_JoystickID instance_id, char const * mapping)} */
    public static boolean nSDL_SetGamepadMapping(int instance_id, long mapping) {
        long __functionAddress = Functions.SetGamepadMapping;
        return invokePZ(instance_id, mapping, __functionAddress);
    }

    /** {@code bool SDL_SetGamepadMapping(SDL_JoystickID instance_id, char const * mapping)} */
    @NativeType("bool")
    public static boolean SDL_SetGamepadMapping(@NativeType("SDL_JoystickID") int instance_id, @NativeType("char const *") ByteBuffer mapping) {
        if (CHECKS) {
            checkNT1(mapping);
        }
        return nSDL_SetGamepadMapping(instance_id, memAddress(mapping));
    }

    /** {@code bool SDL_SetGamepadMapping(SDL_JoystickID instance_id, char const * mapping)} */
    @NativeType("bool")
    public static boolean SDL_SetGamepadMapping(@NativeType("SDL_JoystickID") int instance_id, @NativeType("char const *") CharSequence mapping) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nUTF8(mapping, true);
            long mappingEncoded = stack.getPointerAddress();
            return nSDL_SetGamepadMapping(instance_id, mappingEncoded);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ SDL_HasGamepad ] ---

    /** {@code bool SDL_HasGamepad(void)} */
    @NativeType("bool")
    public static boolean SDL_HasGamepad() {
        long __functionAddress = Functions.HasGamepad;
        return invokeZ(__functionAddress);
    }

    // --- [ SDL_GetGamepads ] ---

    /** {@code SDL_JoystickID * SDL_GetGamepads(int * count)} */
    public static long nSDL_GetGamepads(long count) {
        long __functionAddress = Functions.GetGamepads;
        return invokePP(count, __functionAddress);
    }

    /** {@code SDL_JoystickID * SDL_GetGamepads(int * count)} */
    @NativeType("SDL_JoystickID *")
    public static @Nullable IntBuffer SDL_GetGamepads() {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        IntBuffer count = stack.callocInt(1);
        try {
            long __result = nSDL_GetGamepads(memAddress(count));
            return memIntBufferSafe(__result, count.get(0));
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ SDL_IsGamepad ] ---

    /** {@code bool SDL_IsGamepad(SDL_JoystickID instance_id)} */
    @NativeType("bool")
    public static boolean SDL_IsGamepad(@NativeType("SDL_JoystickID") int instance_id) {
        long __functionAddress = Functions.IsGamepad;
        return invokeZ(instance_id, __functionAddress);
    }

    // --- [ SDL_GetGamepadNameForID ] ---

    /** {@code char const * SDL_GetGamepadNameForID(SDL_JoystickID instance_id)} */
    public static long nSDL_GetGamepadNameForID(int instance_id) {
        long __functionAddress = Functions.GetGamepadNameForID;
        return invokeP(instance_id, __functionAddress);
    }

    /** {@code char const * SDL_GetGamepadNameForID(SDL_JoystickID instance_id)} */
    @NativeType("char const *")
    public static @Nullable String SDL_GetGamepadNameForID(@NativeType("SDL_JoystickID") int instance_id) {
        long __result = nSDL_GetGamepadNameForID(instance_id);
        return memUTF8Safe(__result);
    }

    // --- [ SDL_GetGamepadPathForID ] ---

    /** {@code char const * SDL_GetGamepadPathForID(SDL_JoystickID instance_id)} */
    public static long nSDL_GetGamepadPathForID(int instance_id) {
        long __functionAddress = Functions.GetGamepadPathForID;
        return invokeP(instance_id, __functionAddress);
    }

    /** {@code char const * SDL_GetGamepadPathForID(SDL_JoystickID instance_id)} */
    @NativeType("char const *")
    public static @Nullable String SDL_GetGamepadPathForID(@NativeType("SDL_JoystickID") int instance_id) {
        long __result = nSDL_GetGamepadPathForID(instance_id);
        return memUTF8Safe(__result);
    }

    // --- [ SDL_GetGamepadPlayerIndexForID ] ---

    /** {@code int SDL_GetGamepadPlayerIndexForID(SDL_JoystickID instance_id)} */
    public static int SDL_GetGamepadPlayerIndexForID(@NativeType("SDL_JoystickID") int instance_id) {
        long __functionAddress = Functions.GetGamepadPlayerIndexForID;
        return invokeI(instance_id, __functionAddress);
    }

    // --- [ SDL_GetGamepadGUIDForID ] ---

    private static final FFICIF SDL_GetGamepadGUIDForIDCIF = apiCreateCIF(
        FFI_DEFAULT_ABI, apiCreateStruct(apiCreateArray(ffi_type_uint8, 16)),
        ffi_type_uint32
    );

    /** {@code SDL_GUID SDL_GetGamepadGUIDForID(SDL_JoystickID instance_id)} */
    public static void nSDL_GetGamepadGUIDForID(int instance_id, long __result) {
        long __functionAddress = Functions.GetGamepadGUIDForID;
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            long arguments = stack.nmalloc(POINTER_SIZE, POINTER_SIZE * 1);
            memPutAddress(arguments, stack.nint(instance_id));

            nffi_call(SDL_GetGamepadGUIDForIDCIF.address(), __functionAddress, __result, arguments);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    /** {@code SDL_GUID SDL_GetGamepadGUIDForID(SDL_JoystickID instance_id)} */
    public static SDL_GUID SDL_GetGamepadGUIDForID(@NativeType("SDL_JoystickID") int instance_id, SDL_GUID __result) {
        nSDL_GetGamepadGUIDForID(instance_id, __result.address());
        return __result;
    }

    // --- [ SDL_GetGamepadVendorForID ] ---

    /** {@code Uint16 SDL_GetGamepadVendorForID(SDL_JoystickID instance_id)} */
    @NativeType("Uint16")
    public static short SDL_GetGamepadVendorForID(@NativeType("SDL_JoystickID") int instance_id) {
        long __functionAddress = Functions.GetGamepadVendorForID;
        return invokeC(instance_id, __functionAddress);
    }

    // --- [ SDL_GetGamepadProductForID ] ---

    /** {@code Uint16 SDL_GetGamepadProductForID(SDL_JoystickID instance_id)} */
    @NativeType("Uint16")
    public static short SDL_GetGamepadProductForID(@NativeType("SDL_JoystickID") int instance_id) {
        long __functionAddress = Functions.GetGamepadProductForID;
        return invokeC(instance_id, __functionAddress);
    }

    // --- [ SDL_GetGamepadProductVersionForID ] ---

    /** {@code Uint16 SDL_GetGamepadProductVersionForID(SDL_JoystickID instance_id)} */
    @NativeType("Uint16")
    public static short SDL_GetGamepadProductVersionForID(@NativeType("SDL_JoystickID") int instance_id) {
        long __functionAddress = Functions.GetGamepadProductVersionForID;
        return invokeC(instance_id, __functionAddress);
    }

    // --- [ SDL_GetGamepadTypeForID ] ---

    /** {@code SDL_GamepadType SDL_GetGamepadTypeForID(SDL_JoystickID instance_id)} */
    @NativeType("SDL_GamepadType")
    public static int SDL_GetGamepadTypeForID(@NativeType("SDL_JoystickID") int instance_id) {
        long __functionAddress = Functions.GetGamepadTypeForID;
        return invokeI(instance_id, __functionAddress);
    }

    // --- [ SDL_GetRealGamepadTypeForID ] ---

    /** {@code SDL_GamepadType SDL_GetRealGamepadTypeForID(SDL_JoystickID instance_id)} */
    @NativeType("SDL_GamepadType")
    public static int SDL_GetRealGamepadTypeForID(@NativeType("SDL_JoystickID") int instance_id) {
        long __functionAddress = Functions.GetRealGamepadTypeForID;
        return invokeI(instance_id, __functionAddress);
    }

    // --- [ SDL_GetGamepadMappingForID ] ---

    /** {@code char * SDL_GetGamepadMappingForID(SDL_JoystickID instance_id)} */
    public static long nSDL_GetGamepadMappingForID(int instance_id) {
        long __functionAddress = Functions.GetGamepadMappingForID;
        return invokeP(instance_id, __functionAddress);
    }

    /** {@code char * SDL_GetGamepadMappingForID(SDL_JoystickID instance_id)} */
    @NativeType("char *")
    public static @Nullable String SDL_GetGamepadMappingForID(@NativeType("SDL_JoystickID") int instance_id) {
        long __result = NULL;
        try {
            __result = nSDL_GetGamepadMappingForID(instance_id);
            return memUTF8Safe(__result);
        } finally {
            nSDL_free(__result);
        }
    }

    // --- [ SDL_OpenGamepad ] ---

    /** {@code SDL_Gamepad * SDL_OpenGamepad(SDL_JoystickID instance_id)} */
    @NativeType("SDL_Gamepad *")
    public static long SDL_OpenGamepad(@NativeType("SDL_JoystickID") int instance_id) {
        long __functionAddress = Functions.OpenGamepad;
        return invokeP(instance_id, __functionAddress);
    }

    // --- [ SDL_GetGamepadFromID ] ---

    /** {@code SDL_Gamepad * SDL_GetGamepadFromID(SDL_JoystickID instance_id)} */
    @NativeType("SDL_Gamepad *")
    public static long SDL_GetGamepadFromID(@NativeType("SDL_JoystickID") int instance_id) {
        long __functionAddress = Functions.GetGamepadFromID;
        return invokeP(instance_id, __functionAddress);
    }

    // --- [ SDL_GetGamepadFromPlayerIndex ] ---

    /** {@code SDL_Gamepad * SDL_GetGamepadFromPlayerIndex(int player_index)} */
    @NativeType("SDL_Gamepad *")
    public static long SDL_GetGamepadFromPlayerIndex(int player_index) {
        long __functionAddress = Functions.GetGamepadFromPlayerIndex;
        return invokeP(player_index, __functionAddress);
    }

    // --- [ SDL_GetGamepadProperties ] ---

    /** {@code SDL_PropertiesID SDL_GetGamepadProperties(SDL_Gamepad * gamepad)} */
    @NativeType("SDL_PropertiesID")
    public static int SDL_GetGamepadProperties(@NativeType("SDL_Gamepad *") long gamepad) {
        long __functionAddress = Functions.GetGamepadProperties;
        if (CHECKS) {
            check(gamepad);
        }
        return invokePI(gamepad, __functionAddress);
    }

    // --- [ SDL_GetGamepadID ] ---

    /** {@code SDL_JoystickID SDL_GetGamepadID(SDL_Gamepad * gamepad)} */
    @NativeType("SDL_JoystickID")
    public static int SDL_GetGamepadID(@NativeType("SDL_Gamepad *") long gamepad) {
        long __functionAddress = Functions.GetGamepadID;
        if (CHECKS) {
            check(gamepad);
        }
        return invokePI(gamepad, __functionAddress);
    }

    // --- [ SDL_GetGamepadName ] ---

    /** {@code char const * SDL_GetGamepadName(SDL_Gamepad * gamepad)} */
    public static long nSDL_GetGamepadName(long gamepad) {
        long __functionAddress = Functions.GetGamepadName;
        if (CHECKS) {
            check(gamepad);
        }
        return invokePP(gamepad, __functionAddress);
    }

    /** {@code char const * SDL_GetGamepadName(SDL_Gamepad * gamepad)} */
    @NativeType("char const *")
    public static @Nullable String SDL_GetGamepadName(@NativeType("SDL_Gamepad *") long gamepad) {
        long __result = nSDL_GetGamepadName(gamepad);
        return memUTF8Safe(__result);
    }

    // --- [ SDL_GetGamepadPath ] ---

    /** {@code char const * SDL_GetGamepadPath(SDL_Gamepad * gamepad)} */
    public static long nSDL_GetGamepadPath(long gamepad) {
        long __functionAddress = Functions.GetGamepadPath;
        if (CHECKS) {
            check(gamepad);
        }
        return invokePP(gamepad, __functionAddress);
    }

    /** {@code char const * SDL_GetGamepadPath(SDL_Gamepad * gamepad)} */
    @NativeType("char const *")
    public static @Nullable String SDL_GetGamepadPath(@NativeType("SDL_Gamepad *") long gamepad) {
        long __result = nSDL_GetGamepadPath(gamepad);
        return memUTF8Safe(__result);
    }

    // --- [ SDL_GetGamepadType ] ---

    /** {@code SDL_GamepadType SDL_GetGamepadType(SDL_Gamepad * gamepad)} */
    @NativeType("SDL_GamepadType")
    public static int SDL_GetGamepadType(@NativeType("SDL_Gamepad *") long gamepad) {
        long __functionAddress = Functions.GetGamepadType;
        if (CHECKS) {
            check(gamepad);
        }
        return invokePI(gamepad, __functionAddress);
    }

    // --- [ SDL_GetRealGamepadType ] ---

    /** {@code SDL_GamepadType SDL_GetRealGamepadType(SDL_Gamepad * gamepad)} */
    @NativeType("SDL_GamepadType")
    public static int SDL_GetRealGamepadType(@NativeType("SDL_Gamepad *") long gamepad) {
        long __functionAddress = Functions.GetRealGamepadType;
        if (CHECKS) {
            check(gamepad);
        }
        return invokePI(gamepad, __functionAddress);
    }

    // --- [ SDL_GetGamepadPlayerIndex ] ---

    /** {@code int SDL_GetGamepadPlayerIndex(SDL_Gamepad * gamepad)} */
    public static int SDL_GetGamepadPlayerIndex(@NativeType("SDL_Gamepad *") long gamepad) {
        long __functionAddress = Functions.GetGamepadPlayerIndex;
        if (CHECKS) {
            check(gamepad);
        }
        return invokePI(gamepad, __functionAddress);
    }

    // --- [ SDL_SetGamepadPlayerIndex ] ---

    /** {@code bool SDL_SetGamepadPlayerIndex(SDL_Gamepad * gamepad, int player_index)} */
    @NativeType("bool")
    public static boolean SDL_SetGamepadPlayerIndex(@NativeType("SDL_Gamepad *") long gamepad, int player_index) {
        long __functionAddress = Functions.SetGamepadPlayerIndex;
        if (CHECKS) {
            check(gamepad);
        }
        return invokePZ(gamepad, player_index, __functionAddress);
    }

    // --- [ SDL_GetGamepadVendor ] ---

    /** {@code Uint16 SDL_GetGamepadVendor(SDL_Gamepad * gamepad)} */
    @NativeType("Uint16")
    public static short SDL_GetGamepadVendor(@NativeType("SDL_Gamepad *") long gamepad) {
        long __functionAddress = Functions.GetGamepadVendor;
        if (CHECKS) {
            check(gamepad);
        }
        return invokePC(gamepad, __functionAddress);
    }

    // --- [ SDL_GetGamepadProduct ] ---

    /** {@code Uint16 SDL_GetGamepadProduct(SDL_Gamepad * gamepad)} */
    @NativeType("Uint16")
    public static short SDL_GetGamepadProduct(@NativeType("SDL_Gamepad *") long gamepad) {
        long __functionAddress = Functions.GetGamepadProduct;
        if (CHECKS) {
            check(gamepad);
        }
        return invokePC(gamepad, __functionAddress);
    }

    // --- [ SDL_GetGamepadProductVersion ] ---

    /** {@code Uint16 SDL_GetGamepadProductVersion(SDL_Gamepad * gamepad)} */
    @NativeType("Uint16")
    public static short SDL_GetGamepadProductVersion(@NativeType("SDL_Gamepad *") long gamepad) {
        long __functionAddress = Functions.GetGamepadProductVersion;
        if (CHECKS) {
            check(gamepad);
        }
        return invokePC(gamepad, __functionAddress);
    }

    // --- [ SDL_GetGamepadFirmwareVersion ] ---

    /** {@code Uint16 SDL_GetGamepadFirmwareVersion(SDL_Gamepad * gamepad)} */
    @NativeType("Uint16")
    public static short SDL_GetGamepadFirmwareVersion(@NativeType("SDL_Gamepad *") long gamepad) {
        long __functionAddress = Functions.GetGamepadFirmwareVersion;
        if (CHECKS) {
            check(gamepad);
        }
        return invokePC(gamepad, __functionAddress);
    }

    // --- [ SDL_GetGamepadSerial ] ---

    /** {@code char const * SDL_GetGamepadSerial(SDL_Gamepad * gamepad)} */
    public static long nSDL_GetGamepadSerial(long gamepad) {
        long __functionAddress = Functions.GetGamepadSerial;
        if (CHECKS) {
            check(gamepad);
        }
        return invokePP(gamepad, __functionAddress);
    }

    /** {@code char const * SDL_GetGamepadSerial(SDL_Gamepad * gamepad)} */
    @NativeType("char const *")
    public static @Nullable String SDL_GetGamepadSerial(@NativeType("SDL_Gamepad *") long gamepad) {
        long __result = nSDL_GetGamepadSerial(gamepad);
        return memUTF8Safe(__result);
    }

    // --- [ SDL_GetGamepadSteamHandle ] ---

    /** {@code Uint64 SDL_GetGamepadSteamHandle(SDL_Gamepad * gamepad)} */
    @NativeType("Uint64")
    public static long SDL_GetGamepadSteamHandle(@NativeType("SDL_Gamepad *") long gamepad) {
        long __functionAddress = Functions.GetGamepadSteamHandle;
        if (CHECKS) {
            check(gamepad);
        }
        return invokePJ(gamepad, __functionAddress);
    }

    // --- [ SDL_GetGamepadConnectionState ] ---

    /** {@code SDL_JoystickConnectionState SDL_GetGamepadConnectionState(SDL_Gamepad * gamepad)} */
    @NativeType("SDL_JoystickConnectionState")
    public static int SDL_GetGamepadConnectionState(@NativeType("SDL_Gamepad *") long gamepad) {
        long __functionAddress = Functions.GetGamepadConnectionState;
        if (CHECKS) {
            check(gamepad);
        }
        return invokePI(gamepad, __functionAddress);
    }

    // --- [ SDL_GetGamepadPowerInfo ] ---

    /** {@code SDL_PowerState SDL_GetGamepadPowerInfo(SDL_Gamepad * gamepad, int * percent)} */
    public static int nSDL_GetGamepadPowerInfo(long gamepad, long percent) {
        long __functionAddress = Functions.GetGamepadPowerInfo;
        if (CHECKS) {
            check(gamepad);
        }
        return invokePPI(gamepad, percent, __functionAddress);
    }

    /** {@code SDL_PowerState SDL_GetGamepadPowerInfo(SDL_Gamepad * gamepad, int * percent)} */
    @NativeType("SDL_PowerState")
    public static int SDL_GetGamepadPowerInfo(@NativeType("SDL_Gamepad *") long gamepad, @NativeType("int *") @Nullable IntBuffer percent) {
        if (CHECKS) {
            checkSafe(percent, 1);
        }
        return nSDL_GetGamepadPowerInfo(gamepad, memAddressSafe(percent));
    }

    // --- [ SDL_GamepadConnected ] ---

    /** {@code bool SDL_GamepadConnected(SDL_Gamepad * gamepad)} */
    @NativeType("bool")
    public static boolean SDL_GamepadConnected(@NativeType("SDL_Gamepad *") long gamepad) {
        long __functionAddress = Functions.GamepadConnected;
        if (CHECKS) {
            check(gamepad);
        }
        return invokePZ(gamepad, __functionAddress);
    }

    // --- [ SDL_GetGamepadJoystick ] ---

    /** {@code SDL_Joystick * SDL_GetGamepadJoystick(SDL_Gamepad * gamepad)} */
    @NativeType("SDL_Joystick *")
    public static long SDL_GetGamepadJoystick(@NativeType("SDL_Gamepad *") long gamepad) {
        long __functionAddress = Functions.GetGamepadJoystick;
        if (CHECKS) {
            check(gamepad);
        }
        return invokePP(gamepad, __functionAddress);
    }

    // --- [ SDL_SetGamepadEventsEnabled ] ---

    /** {@code void SDL_SetGamepadEventsEnabled(bool enabled)} */
    public static void SDL_SetGamepadEventsEnabled(@NativeType("bool") boolean enabled) {
        long __functionAddress = Functions.SetGamepadEventsEnabled;
        invokeV(enabled, __functionAddress);
    }

    // --- [ SDL_GamepadEventsEnabled ] ---

    /** {@code bool SDL_GamepadEventsEnabled(void)} */
    @NativeType("bool")
    public static boolean SDL_GamepadEventsEnabled() {
        long __functionAddress = Functions.GamepadEventsEnabled;
        return invokeZ(__functionAddress);
    }

    // --- [ SDL_GetGamepadBindings ] ---

    /** {@code SDL_GamepadBinding ** SDL_GetGamepadBindings(SDL_Gamepad * gamepad, int * count)} */
    public static long nSDL_GetGamepadBindings(long gamepad, long count) {
        long __functionAddress = Functions.GetGamepadBindings;
        if (CHECKS) {
            check(gamepad);
        }
        return invokePPP(gamepad, count, __functionAddress);
    }

    /** {@code SDL_GamepadBinding ** SDL_GetGamepadBindings(SDL_Gamepad * gamepad, int * count)} */
    @NativeType("SDL_GamepadBinding **")
    public static @Nullable PointerBuffer SDL_GetGamepadBindings(@NativeType("SDL_Gamepad *") long gamepad) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        IntBuffer count = stack.callocInt(1);
        try {
            long __result = nSDL_GetGamepadBindings(gamepad, memAddress(count));
            return memPointerBufferSafe(__result, count.get(0));
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ SDL_UpdateGamepads ] ---

    /** {@code void SDL_UpdateGamepads(void)} */
    public static void SDL_UpdateGamepads() {
        long __functionAddress = Functions.UpdateGamepads;
        invokeV(__functionAddress);
    }

    // --- [ SDL_GetGamepadTypeFromString ] ---

    /** {@code SDL_GamepadType SDL_GetGamepadTypeFromString(char const * str)} */
    public static int nSDL_GetGamepadTypeFromString(long str) {
        long __functionAddress = Functions.GetGamepadTypeFromString;
        return invokePI(str, __functionAddress);
    }

    /** {@code SDL_GamepadType SDL_GetGamepadTypeFromString(char const * str)} */
    @NativeType("SDL_GamepadType")
    public static int SDL_GetGamepadTypeFromString(@NativeType("char const *") ByteBuffer str) {
        if (CHECKS) {
            checkNT1(str);
        }
        return nSDL_GetGamepadTypeFromString(memAddress(str));
    }

    /** {@code SDL_GamepadType SDL_GetGamepadTypeFromString(char const * str)} */
    @NativeType("SDL_GamepadType")
    public static int SDL_GetGamepadTypeFromString(@NativeType("char const *") CharSequence str) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nUTF8(str, true);
            long strEncoded = stack.getPointerAddress();
            return nSDL_GetGamepadTypeFromString(strEncoded);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ SDL_GetGamepadStringForType ] ---

    /** {@code char const * SDL_GetGamepadStringForType(SDL_GamepadType type)} */
    public static long nSDL_GetGamepadStringForType(int type) {
        long __functionAddress = Functions.GetGamepadStringForType;
        return invokeP(type, __functionAddress);
    }

    /** {@code char const * SDL_GetGamepadStringForType(SDL_GamepadType type)} */
    @NativeType("char const *")
    public static @Nullable String SDL_GetGamepadStringForType(@NativeType("SDL_GamepadType") int type) {
        long __result = nSDL_GetGamepadStringForType(type);
        return memUTF8Safe(__result);
    }

    // --- [ SDL_GetGamepadAxisFromString ] ---

    /** {@code SDL_GamepadAxis SDL_GetGamepadAxisFromString(char const * str)} */
    public static int nSDL_GetGamepadAxisFromString(long str) {
        long __functionAddress = Functions.GetGamepadAxisFromString;
        return invokePI(str, __functionAddress);
    }

    /** {@code SDL_GamepadAxis SDL_GetGamepadAxisFromString(char const * str)} */
    @NativeType("SDL_GamepadAxis")
    public static int SDL_GetGamepadAxisFromString(@NativeType("char const *") ByteBuffer str) {
        if (CHECKS) {
            checkNT1(str);
        }
        return nSDL_GetGamepadAxisFromString(memAddress(str));
    }

    /** {@code SDL_GamepadAxis SDL_GetGamepadAxisFromString(char const * str)} */
    @NativeType("SDL_GamepadAxis")
    public static int SDL_GetGamepadAxisFromString(@NativeType("char const *") CharSequence str) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nUTF8(str, true);
            long strEncoded = stack.getPointerAddress();
            return nSDL_GetGamepadAxisFromString(strEncoded);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ SDL_GetGamepadStringForAxis ] ---

    /** {@code char const * SDL_GetGamepadStringForAxis(SDL_GamepadAxis axis)} */
    public static long nSDL_GetGamepadStringForAxis(int axis) {
        long __functionAddress = Functions.GetGamepadStringForAxis;
        return invokeP(axis, __functionAddress);
    }

    /** {@code char const * SDL_GetGamepadStringForAxis(SDL_GamepadAxis axis)} */
    @NativeType("char const *")
    public static @Nullable String SDL_GetGamepadStringForAxis(@NativeType("SDL_GamepadAxis") int axis) {
        long __result = nSDL_GetGamepadStringForAxis(axis);
        return memUTF8Safe(__result);
    }

    // --- [ SDL_GamepadHasAxis ] ---

    /** {@code bool SDL_GamepadHasAxis(SDL_Gamepad * gamepad, SDL_GamepadAxis axis)} */
    @NativeType("bool")
    public static boolean SDL_GamepadHasAxis(@NativeType("SDL_Gamepad *") long gamepad, @NativeType("SDL_GamepadAxis") int axis) {
        long __functionAddress = Functions.GamepadHasAxis;
        if (CHECKS) {
            check(gamepad);
        }
        return invokePZ(gamepad, axis, __functionAddress);
    }

    // --- [ SDL_GetGamepadAxis ] ---

    /** {@code Sint16 SDL_GetGamepadAxis(SDL_Gamepad * gamepad, SDL_GamepadAxis axis)} */
    @NativeType("Sint16")
    public static short SDL_GetGamepadAxis(@NativeType("SDL_Gamepad *") long gamepad, @NativeType("SDL_GamepadAxis") int axis) {
        long __functionAddress = Functions.GetGamepadAxis;
        if (CHECKS) {
            check(gamepad);
        }
        return invokePS(gamepad, axis, __functionAddress);
    }

    // --- [ SDL_GetGamepadButtonFromString ] ---

    /** {@code SDL_GamepadButton SDL_GetGamepadButtonFromString(char const * str)} */
    public static int nSDL_GetGamepadButtonFromString(long str) {
        long __functionAddress = Functions.GetGamepadButtonFromString;
        return invokePI(str, __functionAddress);
    }

    /** {@code SDL_GamepadButton SDL_GetGamepadButtonFromString(char const * str)} */
    @NativeType("SDL_GamepadButton")
    public static int SDL_GetGamepadButtonFromString(@NativeType("char const *") ByteBuffer str) {
        if (CHECKS) {
            checkNT1(str);
        }
        return nSDL_GetGamepadButtonFromString(memAddress(str));
    }

    /** {@code SDL_GamepadButton SDL_GetGamepadButtonFromString(char const * str)} */
    @NativeType("SDL_GamepadButton")
    public static int SDL_GetGamepadButtonFromString(@NativeType("char const *") CharSequence str) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nUTF8(str, true);
            long strEncoded = stack.getPointerAddress();
            return nSDL_GetGamepadButtonFromString(strEncoded);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ SDL_GetGamepadStringForButton ] ---

    /** {@code char const * SDL_GetGamepadStringForButton(SDL_GamepadButton button)} */
    public static long nSDL_GetGamepadStringForButton(int button) {
        long __functionAddress = Functions.GetGamepadStringForButton;
        return invokeP(button, __functionAddress);
    }

    /** {@code char const * SDL_GetGamepadStringForButton(SDL_GamepadButton button)} */
    @NativeType("char const *")
    public static @Nullable String SDL_GetGamepadStringForButton(@NativeType("SDL_GamepadButton") int button) {
        long __result = nSDL_GetGamepadStringForButton(button);
        return memUTF8Safe(__result);
    }

    // --- [ SDL_GamepadHasButton ] ---

    /** {@code bool SDL_GamepadHasButton(SDL_Gamepad * gamepad, SDL_GamepadButton button)} */
    @NativeType("bool")
    public static boolean SDL_GamepadHasButton(@NativeType("SDL_Gamepad *") long gamepad, @NativeType("SDL_GamepadButton") int button) {
        long __functionAddress = Functions.GamepadHasButton;
        if (CHECKS) {
            check(gamepad);
        }
        return invokePZ(gamepad, button, __functionAddress);
    }

    // --- [ SDL_GetGamepadButton ] ---

    /** {@code bool SDL_GetGamepadButton(SDL_Gamepad * gamepad, SDL_GamepadButton button)} */
    @NativeType("bool")
    public static boolean SDL_GetGamepadButton(@NativeType("SDL_Gamepad *") long gamepad, @NativeType("SDL_GamepadButton") int button) {
        long __functionAddress = Functions.GetGamepadButton;
        if (CHECKS) {
            check(gamepad);
        }
        return invokePZ(gamepad, button, __functionAddress);
    }

    // --- [ SDL_GetGamepadButtonLabelForType ] ---

    /** {@code SDL_GamepadButtonLabel SDL_GetGamepadButtonLabelForType(SDL_GamepadType type, SDL_GamepadButton button)} */
    @NativeType("SDL_GamepadButtonLabel")
    public static int SDL_GetGamepadButtonLabelForType(@NativeType("SDL_GamepadType") int type, @NativeType("SDL_GamepadButton") int button) {
        long __functionAddress = Functions.GetGamepadButtonLabelForType;
        return invokeI(type, button, __functionAddress);
    }

    // --- [ SDL_GetGamepadButtonLabel ] ---

    /** {@code SDL_GamepadButtonLabel SDL_GetGamepadButtonLabel(SDL_Gamepad * gamepad, SDL_GamepadButton button)} */
    @NativeType("SDL_GamepadButtonLabel")
    public static int SDL_GetGamepadButtonLabel(@NativeType("SDL_Gamepad *") long gamepad, @NativeType("SDL_GamepadButton") int button) {
        long __functionAddress = Functions.GetGamepadButtonLabel;
        if (CHECKS) {
            check(gamepad);
        }
        return invokePI(gamepad, button, __functionAddress);
    }

    // --- [ SDL_GetNumGamepadTouchpads ] ---

    /** {@code int SDL_GetNumGamepadTouchpads(SDL_Gamepad * gamepad)} */
    public static int SDL_GetNumGamepadTouchpads(@NativeType("SDL_Gamepad *") long gamepad) {
        long __functionAddress = Functions.GetNumGamepadTouchpads;
        if (CHECKS) {
            check(gamepad);
        }
        return invokePI(gamepad, __functionAddress);
    }

    // --- [ SDL_GetNumGamepadTouchpadFingers ] ---

    /** {@code int SDL_GetNumGamepadTouchpadFingers(SDL_Gamepad * gamepad, int touchpad)} */
    public static int SDL_GetNumGamepadTouchpadFingers(@NativeType("SDL_Gamepad *") long gamepad, int touchpad) {
        long __functionAddress = Functions.GetNumGamepadTouchpadFingers;
        if (CHECKS) {
            check(gamepad);
        }
        return invokePI(gamepad, touchpad, __functionAddress);
    }

    // --- [ SDL_GetGamepadTouchpadFinger ] ---

    /** {@code bool SDL_GetGamepadTouchpadFinger(SDL_Gamepad * gamepad, int touchpad, int finger, bool * down, float * x, float * y, float * pressure)} */
    public static boolean nSDL_GetGamepadTouchpadFinger(long gamepad, int touchpad, int finger, long down, long x, long y, long pressure) {
        long __functionAddress = Functions.GetGamepadTouchpadFinger;
        if (CHECKS) {
            check(gamepad);
        }
        return invokePPPPPZ(gamepad, touchpad, finger, down, x, y, pressure, __functionAddress);
    }

    /** {@code bool SDL_GetGamepadTouchpadFinger(SDL_Gamepad * gamepad, int touchpad, int finger, bool * down, float * x, float * y, float * pressure)} */
    @NativeType("bool")
    public static boolean SDL_GetGamepadTouchpadFinger(@NativeType("SDL_Gamepad *") long gamepad, int touchpad, int finger, @NativeType("bool *") @Nullable ByteBuffer down, @NativeType("float *") @Nullable FloatBuffer x, @NativeType("float *") @Nullable FloatBuffer y, @NativeType("float *") @Nullable FloatBuffer pressure) {
        if (CHECKS) {
            checkSafe(down, 1);
            checkSafe(x, 1);
            checkSafe(y, 1);
            checkSafe(pressure, 1);
        }
        return nSDL_GetGamepadTouchpadFinger(gamepad, touchpad, finger, memAddressSafe(down), memAddressSafe(x), memAddressSafe(y), memAddressSafe(pressure));
    }

    // --- [ SDL_GamepadHasSensor ] ---

    /** {@code bool SDL_GamepadHasSensor(SDL_Gamepad * gamepad, SDL_SensorType type)} */
    @NativeType("bool")
    public static boolean SDL_GamepadHasSensor(@NativeType("SDL_Gamepad *") long gamepad, @NativeType("SDL_SensorType") int type) {
        long __functionAddress = Functions.GamepadHasSensor;
        if (CHECKS) {
            check(gamepad);
        }
        return invokePZ(gamepad, type, __functionAddress);
    }

    // --- [ SDL_SetGamepadSensorEnabled ] ---

    /** {@code bool SDL_SetGamepadSensorEnabled(SDL_Gamepad * gamepad, SDL_SensorType type, bool enabled)} */
    @NativeType("bool")
    public static boolean SDL_SetGamepadSensorEnabled(@NativeType("SDL_Gamepad *") long gamepad, @NativeType("SDL_SensorType") int type, @NativeType("bool") boolean enabled) {
        long __functionAddress = Functions.SetGamepadSensorEnabled;
        if (CHECKS) {
            check(gamepad);
        }
        return invokePZ(gamepad, type, enabled, __functionAddress);
    }

    // --- [ SDL_GamepadSensorEnabled ] ---

    /** {@code bool SDL_GamepadSensorEnabled(SDL_Gamepad * gamepad, SDL_SensorType type)} */
    @NativeType("bool")
    public static boolean SDL_GamepadSensorEnabled(@NativeType("SDL_Gamepad *") long gamepad, @NativeType("SDL_SensorType") int type) {
        long __functionAddress = Functions.GamepadSensorEnabled;
        if (CHECKS) {
            check(gamepad);
        }
        return invokePZ(gamepad, type, __functionAddress);
    }

    // --- [ SDL_GetGamepadSensorDataRate ] ---

    /** {@code float SDL_GetGamepadSensorDataRate(SDL_Gamepad * gamepad, SDL_SensorType type)} */
    public static float SDL_GetGamepadSensorDataRate(@NativeType("SDL_Gamepad *") long gamepad, @NativeType("SDL_SensorType") int type) {
        long __functionAddress = Functions.GetGamepadSensorDataRate;
        if (CHECKS) {
            check(gamepad);
        }
        return invokePF(gamepad, type, __functionAddress);
    }

    // --- [ SDL_GetGamepadSensorData ] ---

    /** {@code bool SDL_GetGamepadSensorData(SDL_Gamepad * gamepad, SDL_SensorType type, float * data, int num_values)} */
    public static boolean nSDL_GetGamepadSensorData(long gamepad, int type, long data, int num_values) {
        long __functionAddress = Functions.GetGamepadSensorData;
        if (CHECKS) {
            check(gamepad);
        }
        return invokePPZ(gamepad, type, data, num_values, __functionAddress);
    }

    /** {@code bool SDL_GetGamepadSensorData(SDL_Gamepad * gamepad, SDL_SensorType type, float * data, int num_values)} */
    @NativeType("bool")
    public static boolean SDL_GetGamepadSensorData(@NativeType("SDL_Gamepad *") long gamepad, @NativeType("SDL_SensorType") int type, @NativeType("float *") FloatBuffer data) {
        return nSDL_GetGamepadSensorData(gamepad, type, memAddress(data), data.remaining());
    }

    // --- [ SDL_RumbleGamepad ] ---

    /** {@code bool SDL_RumbleGamepad(SDL_Gamepad * gamepad, Uint16 low_frequency_rumble, Uint16 high_frequency_rumble, Uint32 duration_ms)} */
    @NativeType("bool")
    public static boolean SDL_RumbleGamepad(@NativeType("SDL_Gamepad *") long gamepad, @NativeType("Uint16") short low_frequency_rumble, @NativeType("Uint16") short high_frequency_rumble, @NativeType("Uint32") int duration_ms) {
        long __functionAddress = Functions.RumbleGamepad;
        if (CHECKS) {
            check(gamepad);
        }
        return invokePCCZ(gamepad, low_frequency_rumble, high_frequency_rumble, duration_ms, __functionAddress);
    }

    // --- [ SDL_RumbleGamepadTriggers ] ---

    /** {@code bool SDL_RumbleGamepadTriggers(SDL_Gamepad * gamepad, Uint16 left_rumble, Uint16 right_rumble, Uint32 duration_ms)} */
    @NativeType("bool")
    public static boolean SDL_RumbleGamepadTriggers(@NativeType("SDL_Gamepad *") long gamepad, @NativeType("Uint16") short left_rumble, @NativeType("Uint16") short right_rumble, @NativeType("Uint32") int duration_ms) {
        long __functionAddress = Functions.RumbleGamepadTriggers;
        if (CHECKS) {
            check(gamepad);
        }
        return invokePCCZ(gamepad, left_rumble, right_rumble, duration_ms, __functionAddress);
    }

    // --- [ SDL_SetGamepadLED ] ---

    /** {@code bool SDL_SetGamepadLED(SDL_Gamepad * gamepad, Uint8 red, Uint8 green, Uint8 blue)} */
    @NativeType("bool")
    public static boolean SDL_SetGamepadLED(@NativeType("SDL_Gamepad *") long gamepad, @NativeType("Uint8") byte red, @NativeType("Uint8") byte green, @NativeType("Uint8") byte blue) {
        long __functionAddress = Functions.SetGamepadLED;
        if (CHECKS) {
            check(gamepad);
        }
        return invokePUUUZ(gamepad, red, green, blue, __functionAddress);
    }

    // --- [ SDL_SendGamepadEffect ] ---

    /** {@code bool SDL_SendGamepadEffect(SDL_Gamepad * gamepad, void const * data, int size)} */
    public static boolean nSDL_SendGamepadEffect(long gamepad, long data, int size) {
        long __functionAddress = Functions.SendGamepadEffect;
        if (CHECKS) {
            check(gamepad);
        }
        return invokePPZ(gamepad, data, size, __functionAddress);
    }

    /** {@code bool SDL_SendGamepadEffect(SDL_Gamepad * gamepad, void const * data, int size)} */
    @NativeType("bool")
    public static boolean SDL_SendGamepadEffect(@NativeType("SDL_Gamepad *") long gamepad, @NativeType("void const *") ByteBuffer data) {
        return nSDL_SendGamepadEffect(gamepad, memAddress(data), data.remaining());
    }

    // --- [ SDL_CloseGamepad ] ---

    /** {@code void SDL_CloseGamepad(SDL_Gamepad * gamepad)} */
    public static void SDL_CloseGamepad(@NativeType("SDL_Gamepad *") long gamepad) {
        long __functionAddress = Functions.CloseGamepad;
        if (CHECKS) {
            check(gamepad);
        }
        invokePV(gamepad, __functionAddress);
    }

    // --- [ SDL_GetGamepadAppleSFSymbolsNameForButton ] ---

    /** {@code char const * SDL_GetGamepadAppleSFSymbolsNameForButton(SDL_Gamepad * gamepad, SDL_GamepadButton button)} */
    public static long nSDL_GetGamepadAppleSFSymbolsNameForButton(long gamepad, int button) {
        long __functionAddress = Functions.GetGamepadAppleSFSymbolsNameForButton;
        if (CHECKS) {
            check(gamepad);
        }
        return invokePP(gamepad, button, __functionAddress);
    }

    /** {@code char const * SDL_GetGamepadAppleSFSymbolsNameForButton(SDL_Gamepad * gamepad, SDL_GamepadButton button)} */
    @NativeType("char const *")
    public static @Nullable String SDL_GetGamepadAppleSFSymbolsNameForButton(@NativeType("SDL_Gamepad *") long gamepad, @NativeType("SDL_GamepadButton") int button) {
        long __result = nSDL_GetGamepadAppleSFSymbolsNameForButton(gamepad, button);
        return memUTF8Safe(__result);
    }

    // --- [ SDL_GetGamepadAppleSFSymbolsNameForAxis ] ---

    /** {@code char const * SDL_GetGamepadAppleSFSymbolsNameForAxis(SDL_Gamepad * gamepad, SDL_GamepadAxis axis)} */
    public static long nSDL_GetGamepadAppleSFSymbolsNameForAxis(long gamepad, int axis) {
        long __functionAddress = Functions.GetGamepadAppleSFSymbolsNameForAxis;
        if (CHECKS) {
            check(gamepad);
        }
        return invokePP(gamepad, axis, __functionAddress);
    }

    /** {@code char const * SDL_GetGamepadAppleSFSymbolsNameForAxis(SDL_Gamepad * gamepad, SDL_GamepadAxis axis)} */
    @NativeType("char const *")
    public static @Nullable String SDL_GetGamepadAppleSFSymbolsNameForAxis(@NativeType("SDL_Gamepad *") long gamepad, @NativeType("SDL_GamepadAxis") int axis) {
        long __result = nSDL_GetGamepadAppleSFSymbolsNameForAxis(gamepad, axis);
        return memUTF8Safe(__result);
    }

}