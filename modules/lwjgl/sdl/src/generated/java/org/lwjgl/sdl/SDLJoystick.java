/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.sdl;

import org.jspecify.annotations.*;

import java.nio.*;

import org.lwjgl.system.*;
import org.lwjgl.system.libffi.*;

import static org.lwjgl.system.APIUtil.*;
import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.JNI.*;
import static org.lwjgl.system.libffi.LibFFI.*;
import static org.lwjgl.system.MemoryStack.*;
import static org.lwjgl.system.MemoryUtil.*;

public class SDLJoystick {

    /** Contains the function pointers loaded from {@code SDL.getLibrary()}. */
    public static final class Functions {

        private Functions() {}

        /** Function address. */
        public static final long
            LockJoysticks                  = apiGetFunctionAddress(SDL.getLibrary(), "SDL_LockJoysticks"),
            UnlockJoysticks                = apiGetFunctionAddress(SDL.getLibrary(), "SDL_UnlockJoysticks"),
            HasJoystick                    = apiGetFunctionAddress(SDL.getLibrary(), "SDL_HasJoystick"),
            GetJoysticks                   = apiGetFunctionAddress(SDL.getLibrary(), "SDL_GetJoysticks"),
            GetJoystickNameForID           = apiGetFunctionAddress(SDL.getLibrary(), "SDL_GetJoystickNameForID"),
            GetJoystickPathForID           = apiGetFunctionAddress(SDL.getLibrary(), "SDL_GetJoystickPathForID"),
            GetJoystickPlayerIndexForID    = apiGetFunctionAddress(SDL.getLibrary(), "SDL_GetJoystickPlayerIndexForID"),
            GetJoystickGUIDForID           = apiGetFunctionAddress(SDL.getLibrary(), "SDL_GetJoystickGUIDForID"),
            GetJoystickVendorForID         = apiGetFunctionAddress(SDL.getLibrary(), "SDL_GetJoystickVendorForID"),
            GetJoystickProductForID        = apiGetFunctionAddress(SDL.getLibrary(), "SDL_GetJoystickProductForID"),
            GetJoystickProductVersionForID = apiGetFunctionAddress(SDL.getLibrary(), "SDL_GetJoystickProductVersionForID"),
            GetJoystickTypeForID           = apiGetFunctionAddress(SDL.getLibrary(), "SDL_GetJoystickTypeForID"),
            OpenJoystick                   = apiGetFunctionAddress(SDL.getLibrary(), "SDL_OpenJoystick"),
            GetJoystickFromID              = apiGetFunctionAddress(SDL.getLibrary(), "SDL_GetJoystickFromID"),
            GetJoystickFromPlayerIndex     = apiGetFunctionAddress(SDL.getLibrary(), "SDL_GetJoystickFromPlayerIndex"),
            AttachVirtualJoystick          = apiGetFunctionAddress(SDL.getLibrary(), "SDL_AttachVirtualJoystick"),
            DetachVirtualJoystick          = apiGetFunctionAddress(SDL.getLibrary(), "SDL_DetachVirtualJoystick"),
            IsJoystickVirtual              = apiGetFunctionAddress(SDL.getLibrary(), "SDL_IsJoystickVirtual"),
            SetJoystickVirtualAxis         = apiGetFunctionAddress(SDL.getLibrary(), "SDL_SetJoystickVirtualAxis"),
            SetJoystickVirtualBall         = apiGetFunctionAddress(SDL.getLibrary(), "SDL_SetJoystickVirtualBall"),
            SetJoystickVirtualButton       = apiGetFunctionAddress(SDL.getLibrary(), "SDL_SetJoystickVirtualButton"),
            SetJoystickVirtualHat          = apiGetFunctionAddress(SDL.getLibrary(), "SDL_SetJoystickVirtualHat"),
            SetJoystickVirtualTouchpad     = apiGetFunctionAddress(SDL.getLibrary(), "SDL_SetJoystickVirtualTouchpad"),
            SendJoystickVirtualSensorData  = apiGetFunctionAddress(SDL.getLibrary(), "SDL_SendJoystickVirtualSensorData"),
            GetJoystickProperties          = apiGetFunctionAddress(SDL.getLibrary(), "SDL_GetJoystickProperties"),
            GetJoystickName                = apiGetFunctionAddress(SDL.getLibrary(), "SDL_GetJoystickName"),
            GetJoystickPath                = apiGetFunctionAddress(SDL.getLibrary(), "SDL_GetJoystickPath"),
            GetJoystickPlayerIndex         = apiGetFunctionAddress(SDL.getLibrary(), "SDL_GetJoystickPlayerIndex"),
            SetJoystickPlayerIndex         = apiGetFunctionAddress(SDL.getLibrary(), "SDL_SetJoystickPlayerIndex"),
            GetJoystickGUID                = apiGetFunctionAddress(SDL.getLibrary(), "SDL_GetJoystickGUID"),
            GetJoystickVendor              = apiGetFunctionAddress(SDL.getLibrary(), "SDL_GetJoystickVendor"),
            GetJoystickProduct             = apiGetFunctionAddress(SDL.getLibrary(), "SDL_GetJoystickProduct"),
            GetJoystickProductVersion      = apiGetFunctionAddress(SDL.getLibrary(), "SDL_GetJoystickProductVersion"),
            GetJoystickFirmwareVersion     = apiGetFunctionAddress(SDL.getLibrary(), "SDL_GetJoystickFirmwareVersion"),
            GetJoystickSerial              = apiGetFunctionAddress(SDL.getLibrary(), "SDL_GetJoystickSerial"),
            GetJoystickType                = apiGetFunctionAddress(SDL.getLibrary(), "SDL_GetJoystickType"),
            GetJoystickGUIDInfo            = apiGetFunctionAddress(SDL.getLibrary(), "SDL_GetJoystickGUIDInfo"),
            JoystickConnected              = apiGetFunctionAddress(SDL.getLibrary(), "SDL_JoystickConnected"),
            GetJoystickID                  = apiGetFunctionAddress(SDL.getLibrary(), "SDL_GetJoystickID"),
            GetNumJoystickAxes             = apiGetFunctionAddress(SDL.getLibrary(), "SDL_GetNumJoystickAxes"),
            GetNumJoystickBalls            = apiGetFunctionAddress(SDL.getLibrary(), "SDL_GetNumJoystickBalls"),
            GetNumJoystickHats             = apiGetFunctionAddress(SDL.getLibrary(), "SDL_GetNumJoystickHats"),
            GetNumJoystickButtons          = apiGetFunctionAddress(SDL.getLibrary(), "SDL_GetNumJoystickButtons"),
            SetJoystickEventsEnabled       = apiGetFunctionAddress(SDL.getLibrary(), "SDL_SetJoystickEventsEnabled"),
            JoystickEventsEnabled          = apiGetFunctionAddress(SDL.getLibrary(), "SDL_JoystickEventsEnabled"),
            UpdateJoysticks                = apiGetFunctionAddress(SDL.getLibrary(), "SDL_UpdateJoysticks"),
            GetJoystickAxis                = apiGetFunctionAddress(SDL.getLibrary(), "SDL_GetJoystickAxis"),
            GetJoystickAxisInitialState    = apiGetFunctionAddress(SDL.getLibrary(), "SDL_GetJoystickAxisInitialState"),
            GetJoystickBall                = apiGetFunctionAddress(SDL.getLibrary(), "SDL_GetJoystickBall"),
            GetJoystickHat                 = apiGetFunctionAddress(SDL.getLibrary(), "SDL_GetJoystickHat"),
            GetJoystickButton              = apiGetFunctionAddress(SDL.getLibrary(), "SDL_GetJoystickButton"),
            RumbleJoystick                 = apiGetFunctionAddress(SDL.getLibrary(), "SDL_RumbleJoystick"),
            RumbleJoystickTriggers         = apiGetFunctionAddress(SDL.getLibrary(), "SDL_RumbleJoystickTriggers"),
            SetJoystickLED                 = apiGetFunctionAddress(SDL.getLibrary(), "SDL_SetJoystickLED"),
            SendJoystickEffect             = apiGetFunctionAddress(SDL.getLibrary(), "SDL_SendJoystickEffect"),
            CloseJoystick                  = apiGetFunctionAddress(SDL.getLibrary(), "SDL_CloseJoystick"),
            GetJoystickConnectionState     = apiGetFunctionAddress(SDL.getLibrary(), "SDL_GetJoystickConnectionState"),
            GetJoystickPowerInfo           = apiGetFunctionAddress(SDL.getLibrary(), "SDL_GetJoystickPowerInfo");

    }

    public static final int
        SDL_JOYSTICK_TYPE_UNKNOWN      = 0,
        SDL_JOYSTICK_TYPE_GAMEPAD      = 1,
        SDL_JOYSTICK_TYPE_WHEEL        = 2,
        SDL_JOYSTICK_TYPE_ARCADE_STICK = 3,
        SDL_JOYSTICK_TYPE_FLIGHT_STICK = 4,
        SDL_JOYSTICK_TYPE_DANCE_PAD    = 5,
        SDL_JOYSTICK_TYPE_GUITAR       = 6,
        SDL_JOYSTICK_TYPE_DRUM_KIT     = 7,
        SDL_JOYSTICK_TYPE_ARCADE_PAD   = 8,
        SDL_JOYSTICK_TYPE_THROTTLE     = 9,
        SDL_JOYSTICK_TYPE_COUNT        = 10;

    public static final int
        SDL_JOYSTICK_CONNECTION_INVALID  = -1,
        SDL_JOYSTICK_CONNECTION_UNKNOWN  = 0,
        SDL_JOYSTICK_CONNECTION_WIRED    = 1,
        SDL_JOYSTICK_CONNECTION_WIRELESS = 2;

    public static final int
        SDL_JOYSTICK_AXIS_MAX = 32767,
        SDL_JOYSTICK_AXIS_MIN = -32768;

    public static final String
        SDL_PROP_JOYSTICK_CAP_MONO_LED_BOOLEAN       = "SDL.joystick.cap.mono_led",
        SDL_PROP_JOYSTICK_CAP_RGB_LED_BOOLEAN        = "SDL.joystick.cap.rgb_led",
        SDL_PROP_JOYSTICK_CAP_PLAYER_LED_BOOLEAN     = "SDL.joystick.cap.player_led",
        SDL_PROP_JOYSTICK_CAP_RUMBLE_BOOLEAN         = "SDL.joystick.cap.rumble",
        SDL_PROP_JOYSTICK_CAP_TRIGGER_RUMBLE_BOOLEAN = "SDL.joystick.cap.trigger_rumble";

    public static final int
        SDL_HAT_CENTERED  = 0x00,
        SDL_HAT_UP        = 0x01,
        SDL_HAT_RIGHT     = 0x02,
        SDL_HAT_DOWN      = 0x04,
        SDL_HAT_LEFT      = 0x08,
        SDL_HAT_RIGHTUP   = (SDL_HAT_RIGHT|SDL_HAT_UP),
        SDL_HAT_RIGHTDOWN = (SDL_HAT_RIGHT|SDL_HAT_DOWN),
        SDL_HAT_LEFTUP    = (SDL_HAT_LEFT|SDL_HAT_UP),
        SDL_HAT_LEFTDOWN  = (SDL_HAT_LEFT|SDL_HAT_DOWN);

    protected SDLJoystick() {
        throw new UnsupportedOperationException();
    }

    // --- [ SDL_LockJoysticks ] ---

    /** {@code void SDL_LockJoysticks(void)} */
    public static void SDL_LockJoysticks() {
        long __functionAddress = Functions.LockJoysticks;
        invokeV(__functionAddress);
    }

    // --- [ SDL_UnlockJoysticks ] ---

    /** {@code void SDL_UnlockJoysticks(void)} */
    public static void SDL_UnlockJoysticks() {
        long __functionAddress = Functions.UnlockJoysticks;
        invokeV(__functionAddress);
    }

    // --- [ SDL_HasJoystick ] ---

    /** {@code bool SDL_HasJoystick(void)} */
    @NativeType("bool")
    public static boolean SDL_HasJoystick() {
        long __functionAddress = Functions.HasJoystick;
        return invokeZ(__functionAddress);
    }

    // --- [ SDL_GetJoysticks ] ---

    /** {@code SDL_JoystickID * SDL_GetJoysticks(int * count)} */
    public static long nSDL_GetJoysticks(long count) {
        long __functionAddress = Functions.GetJoysticks;
        return invokePP(count, __functionAddress);
    }

    /** {@code SDL_JoystickID * SDL_GetJoysticks(int * count)} */
    @NativeType("SDL_JoystickID *")
    public static @Nullable IntBuffer SDL_GetJoysticks() {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        IntBuffer count = stack.callocInt(1);
        try {
            long __result = nSDL_GetJoysticks(memAddress(count));
            return memIntBufferSafe(__result, count.get(0));
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ SDL_GetJoystickNameForID ] ---

    /** {@code char const * SDL_GetJoystickNameForID(SDL_JoystickID instance_id)} */
    public static long nSDL_GetJoystickNameForID(int instance_id) {
        long __functionAddress = Functions.GetJoystickNameForID;
        return invokeP(instance_id, __functionAddress);
    }

    /** {@code char const * SDL_GetJoystickNameForID(SDL_JoystickID instance_id)} */
    @NativeType("char const *")
    public static @Nullable String SDL_GetJoystickNameForID(@NativeType("SDL_JoystickID") int instance_id) {
        long __result = nSDL_GetJoystickNameForID(instance_id);
        return memUTF8Safe(__result);
    }

    // --- [ SDL_GetJoystickPathForID ] ---

    /** {@code char const * SDL_GetJoystickPathForID(SDL_JoystickID instance_id)} */
    public static long nSDL_GetJoystickPathForID(int instance_id) {
        long __functionAddress = Functions.GetJoystickPathForID;
        return invokeP(instance_id, __functionAddress);
    }

    /** {@code char const * SDL_GetJoystickPathForID(SDL_JoystickID instance_id)} */
    @NativeType("char const *")
    public static @Nullable String SDL_GetJoystickPathForID(@NativeType("SDL_JoystickID") int instance_id) {
        long __result = nSDL_GetJoystickPathForID(instance_id);
        return memUTF8Safe(__result);
    }

    // --- [ SDL_GetJoystickPlayerIndexForID ] ---

    /** {@code int SDL_GetJoystickPlayerIndexForID(SDL_JoystickID instance_id)} */
    public static int SDL_GetJoystickPlayerIndexForID(@NativeType("SDL_JoystickID") int instance_id) {
        long __functionAddress = Functions.GetJoystickPlayerIndexForID;
        return invokeI(instance_id, __functionAddress);
    }

    // --- [ SDL_GetJoystickGUIDForID ] ---

    private static final FFICIF SDL_GetJoystickGUIDForIDCIF = apiCreateCIF(
        FFI_DEFAULT_ABI, apiCreateStruct(apiCreateArray(ffi_type_uint8, 16)),
        ffi_type_uint32
    );

    /** {@code SDL_GUID SDL_GetJoystickGUIDForID(SDL_JoystickID instance_id)} */
    public static void nSDL_GetJoystickGUIDForID(int instance_id, long __result) {
        long __functionAddress = Functions.GetJoystickGUIDForID;
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            long arguments = stack.nmalloc(POINTER_SIZE, POINTER_SIZE * 1);
            memPutAddress(arguments, stack.nint(instance_id));

            nffi_call(SDL_GetJoystickGUIDForIDCIF.address(), __functionAddress, __result, arguments);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    /** {@code SDL_GUID SDL_GetJoystickGUIDForID(SDL_JoystickID instance_id)} */
    public static SDL_GUID SDL_GetJoystickGUIDForID(@NativeType("SDL_JoystickID") int instance_id, SDL_GUID __result) {
        nSDL_GetJoystickGUIDForID(instance_id, __result.address());
        return __result;
    }

    // --- [ SDL_GetJoystickVendorForID ] ---

    /** {@code Uint16 SDL_GetJoystickVendorForID(SDL_JoystickID instance_id)} */
    @NativeType("Uint16")
    public static short SDL_GetJoystickVendorForID(@NativeType("SDL_JoystickID") int instance_id) {
        long __functionAddress = Functions.GetJoystickVendorForID;
        return invokeC(instance_id, __functionAddress);
    }

    // --- [ SDL_GetJoystickProductForID ] ---

    /** {@code Uint16 SDL_GetJoystickProductForID(SDL_JoystickID instance_id)} */
    @NativeType("Uint16")
    public static short SDL_GetJoystickProductForID(@NativeType("SDL_JoystickID") int instance_id) {
        long __functionAddress = Functions.GetJoystickProductForID;
        return invokeC(instance_id, __functionAddress);
    }

    // --- [ SDL_GetJoystickProductVersionForID ] ---

    /** {@code Uint16 SDL_GetJoystickProductVersionForID(SDL_JoystickID instance_id)} */
    @NativeType("Uint16")
    public static short SDL_GetJoystickProductVersionForID(@NativeType("SDL_JoystickID") int instance_id) {
        long __functionAddress = Functions.GetJoystickProductVersionForID;
        return invokeC(instance_id, __functionAddress);
    }

    // --- [ SDL_GetJoystickTypeForID ] ---

    /** {@code SDL_JoystickType SDL_GetJoystickTypeForID(SDL_JoystickID instance_id)} */
    @NativeType("SDL_JoystickType")
    public static int SDL_GetJoystickTypeForID(@NativeType("SDL_JoystickID") int instance_id) {
        long __functionAddress = Functions.GetJoystickTypeForID;
        return invokeI(instance_id, __functionAddress);
    }

    // --- [ SDL_OpenJoystick ] ---

    /** {@code SDL_Joystick * SDL_OpenJoystick(SDL_JoystickID instance_id)} */
    @NativeType("SDL_Joystick *")
    public static long SDL_OpenJoystick(@NativeType("SDL_JoystickID") int instance_id) {
        long __functionAddress = Functions.OpenJoystick;
        return invokeP(instance_id, __functionAddress);
    }

    // --- [ SDL_GetJoystickFromID ] ---

    /** {@code SDL_Joystick * SDL_GetJoystickFromID(SDL_JoystickID instance_id)} */
    @NativeType("SDL_Joystick *")
    public static long SDL_GetJoystickFromID(@NativeType("SDL_JoystickID") int instance_id) {
        long __functionAddress = Functions.GetJoystickFromID;
        return invokeP(instance_id, __functionAddress);
    }

    // --- [ SDL_GetJoystickFromPlayerIndex ] ---

    /** {@code SDL_Joystick * SDL_GetJoystickFromPlayerIndex(int player_index)} */
    @NativeType("SDL_Joystick *")
    public static long SDL_GetJoystickFromPlayerIndex(int player_index) {
        long __functionAddress = Functions.GetJoystickFromPlayerIndex;
        return invokeP(player_index, __functionAddress);
    }

    // --- [ SDL_AttachVirtualJoystick ] ---

    /** {@code SDL_JoystickID SDL_AttachVirtualJoystick(SDL_VirtualJoystickDesc const * desc)} */
    public static int nSDL_AttachVirtualJoystick(long desc) {
        long __functionAddress = Functions.AttachVirtualJoystick;
        if (CHECKS) {
            SDL_VirtualJoystickDesc.validate(desc);
        }
        return invokePI(desc, __functionAddress);
    }

    /** {@code SDL_JoystickID SDL_AttachVirtualJoystick(SDL_VirtualJoystickDesc const * desc)} */
    @NativeType("SDL_JoystickID")
    public static int SDL_AttachVirtualJoystick(@NativeType("SDL_VirtualJoystickDesc const *") SDL_VirtualJoystickDesc desc) {
        return nSDL_AttachVirtualJoystick(desc.address());
    }

    // --- [ SDL_DetachVirtualJoystick ] ---

    /** {@code bool SDL_DetachVirtualJoystick(SDL_JoystickID instance_id)} */
    @NativeType("bool")
    public static boolean SDL_DetachVirtualJoystick(@NativeType("SDL_JoystickID") int instance_id) {
        long __functionAddress = Functions.DetachVirtualJoystick;
        return invokeZ(instance_id, __functionAddress);
    }

    // --- [ SDL_IsJoystickVirtual ] ---

    /** {@code bool SDL_IsJoystickVirtual(SDL_JoystickID instance_id)} */
    @NativeType("bool")
    public static boolean SDL_IsJoystickVirtual(@NativeType("SDL_JoystickID") int instance_id) {
        long __functionAddress = Functions.IsJoystickVirtual;
        return invokeZ(instance_id, __functionAddress);
    }

    // --- [ SDL_SetJoystickVirtualAxis ] ---

    /** {@code bool SDL_SetJoystickVirtualAxis(SDL_Joystick * joystick, int axis, Sint16 value)} */
    @NativeType("bool")
    public static boolean SDL_SetJoystickVirtualAxis(@NativeType("SDL_Joystick *") long joystick, int axis, @NativeType("Sint16") short value) {
        long __functionAddress = Functions.SetJoystickVirtualAxis;
        if (CHECKS) {
            check(joystick);
        }
        return invokePSZ(joystick, axis, value, __functionAddress);
    }

    // --- [ SDL_SetJoystickVirtualBall ] ---

    /** {@code bool SDL_SetJoystickVirtualBall(SDL_Joystick * joystick, int ball, Sint16 xrel, Sint16 yrel)} */
    @NativeType("bool")
    public static boolean SDL_SetJoystickVirtualBall(@NativeType("SDL_Joystick *") long joystick, int ball, @NativeType("Sint16") short xrel, @NativeType("Sint16") short yrel) {
        long __functionAddress = Functions.SetJoystickVirtualBall;
        if (CHECKS) {
            check(joystick);
        }
        return invokePSSZ(joystick, ball, xrel, yrel, __functionAddress);
    }

    // --- [ SDL_SetJoystickVirtualButton ] ---

    /** {@code bool SDL_SetJoystickVirtualButton(SDL_Joystick * joystick, int button, bool down)} */
    @NativeType("bool")
    public static boolean SDL_SetJoystickVirtualButton(@NativeType("SDL_Joystick *") long joystick, int button, @NativeType("bool") boolean down) {
        long __functionAddress = Functions.SetJoystickVirtualButton;
        if (CHECKS) {
            check(joystick);
        }
        return invokePZ(joystick, button, down, __functionAddress);
    }

    // --- [ SDL_SetJoystickVirtualHat ] ---

    /** {@code bool SDL_SetJoystickVirtualHat(SDL_Joystick * joystick, int hat, Uint8 value)} */
    @NativeType("bool")
    public static boolean SDL_SetJoystickVirtualHat(@NativeType("SDL_Joystick *") long joystick, int hat, @NativeType("Uint8") byte value) {
        long __functionAddress = Functions.SetJoystickVirtualHat;
        if (CHECKS) {
            check(joystick);
        }
        return invokePUZ(joystick, hat, value, __functionAddress);
    }

    // --- [ SDL_SetJoystickVirtualTouchpad ] ---

    /** {@code bool SDL_SetJoystickVirtualTouchpad(SDL_Joystick * joystick, int touchpad, int finger, bool down, float x, float y, float pressure)} */
    @NativeType("bool")
    public static boolean SDL_SetJoystickVirtualTouchpad(@NativeType("SDL_Joystick *") long joystick, int touchpad, int finger, @NativeType("bool") boolean down, float x, float y, float pressure) {
        long __functionAddress = Functions.SetJoystickVirtualTouchpad;
        if (CHECKS) {
            check(joystick);
        }
        return invokePZ(joystick, touchpad, finger, down, x, y, pressure, __functionAddress);
    }

    // --- [ SDL_SendJoystickVirtualSensorData ] ---

    /** {@code bool SDL_SendJoystickVirtualSensorData(SDL_Joystick * joystick, SDL_SensorType type, Uint64 sensor_timestamp, float const * data, int num_values)} */
    public static boolean nSDL_SendJoystickVirtualSensorData(long joystick, int type, long sensor_timestamp, long data, int num_values) {
        long __functionAddress = Functions.SendJoystickVirtualSensorData;
        if (CHECKS) {
            check(joystick);
        }
        return invokePJPZ(joystick, type, sensor_timestamp, data, num_values, __functionAddress);
    }

    /** {@code bool SDL_SendJoystickVirtualSensorData(SDL_Joystick * joystick, SDL_SensorType type, Uint64 sensor_timestamp, float const * data, int num_values)} */
    @NativeType("bool")
    public static boolean SDL_SendJoystickVirtualSensorData(@NativeType("SDL_Joystick *") long joystick, @NativeType("SDL_SensorType") int type, @NativeType("Uint64") long sensor_timestamp, @NativeType("float const *") FloatBuffer data) {
        return nSDL_SendJoystickVirtualSensorData(joystick, type, sensor_timestamp, memAddress(data), data.remaining());
    }

    // --- [ SDL_GetJoystickProperties ] ---

    /** {@code SDL_PropertiesID SDL_GetJoystickProperties(SDL_Joystick * joystick)} */
    @NativeType("SDL_PropertiesID")
    public static int SDL_GetJoystickProperties(@NativeType("SDL_Joystick *") long joystick) {
        long __functionAddress = Functions.GetJoystickProperties;
        if (CHECKS) {
            check(joystick);
        }
        return invokePI(joystick, __functionAddress);
    }

    // --- [ SDL_GetJoystickName ] ---

    /** {@code char const * SDL_GetJoystickName(SDL_Joystick * joystick)} */
    public static long nSDL_GetJoystickName(long joystick) {
        long __functionAddress = Functions.GetJoystickName;
        if (CHECKS) {
            check(joystick);
        }
        return invokePP(joystick, __functionAddress);
    }

    /** {@code char const * SDL_GetJoystickName(SDL_Joystick * joystick)} */
    @NativeType("char const *")
    public static @Nullable String SDL_GetJoystickName(@NativeType("SDL_Joystick *") long joystick) {
        long __result = nSDL_GetJoystickName(joystick);
        return memUTF8Safe(__result);
    }

    // --- [ SDL_GetJoystickPath ] ---

    /** {@code char const * SDL_GetJoystickPath(SDL_Joystick * joystick)} */
    public static long nSDL_GetJoystickPath(long joystick) {
        long __functionAddress = Functions.GetJoystickPath;
        if (CHECKS) {
            check(joystick);
        }
        return invokePP(joystick, __functionAddress);
    }

    /** {@code char const * SDL_GetJoystickPath(SDL_Joystick * joystick)} */
    @NativeType("char const *")
    public static @Nullable String SDL_GetJoystickPath(@NativeType("SDL_Joystick *") long joystick) {
        long __result = nSDL_GetJoystickPath(joystick);
        return memUTF8Safe(__result);
    }

    // --- [ SDL_GetJoystickPlayerIndex ] ---

    /** {@code int SDL_GetJoystickPlayerIndex(SDL_Joystick * joystick)} */
    public static int SDL_GetJoystickPlayerIndex(@NativeType("SDL_Joystick *") long joystick) {
        long __functionAddress = Functions.GetJoystickPlayerIndex;
        if (CHECKS) {
            check(joystick);
        }
        return invokePI(joystick, __functionAddress);
    }

    // --- [ SDL_SetJoystickPlayerIndex ] ---

    /** {@code bool SDL_SetJoystickPlayerIndex(SDL_Joystick * joystick, int player_index)} */
    @NativeType("bool")
    public static boolean SDL_SetJoystickPlayerIndex(@NativeType("SDL_Joystick *") long joystick, int player_index) {
        long __functionAddress = Functions.SetJoystickPlayerIndex;
        if (CHECKS) {
            check(joystick);
        }
        return invokePZ(joystick, player_index, __functionAddress);
    }

    // --- [ SDL_GetJoystickGUID ] ---

    private static final FFICIF SDL_GetJoystickGUIDCIF = apiCreateCIF(
        FFI_DEFAULT_ABI, apiCreateStruct(apiCreateArray(ffi_type_uint8, 16)),
        ffi_type_pointer
    );

    /** {@code SDL_GUID SDL_GetJoystickGUID(SDL_Joystick * joystick)} */
    public static void nSDL_GetJoystickGUID(long joystick, long __result) {
        long __functionAddress = Functions.GetJoystickGUID;
        if (CHECKS) {
            check(joystick);
        }
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            long arguments = stack.nmalloc(POINTER_SIZE, POINTER_SIZE * 1);
            memPutAddress(arguments, stack.npointer(joystick));

            nffi_call(SDL_GetJoystickGUIDCIF.address(), __functionAddress, __result, arguments);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    /** {@code SDL_GUID SDL_GetJoystickGUID(SDL_Joystick * joystick)} */
    public static SDL_GUID SDL_GetJoystickGUID(@NativeType("SDL_Joystick *") long joystick, SDL_GUID __result) {
        nSDL_GetJoystickGUID(joystick, __result.address());
        return __result;
    }

    // --- [ SDL_GetJoystickVendor ] ---

    /** {@code Uint16 SDL_GetJoystickVendor(SDL_Joystick * joystick)} */
    @NativeType("Uint16")
    public static short SDL_GetJoystickVendor(@NativeType("SDL_Joystick *") long joystick) {
        long __functionAddress = Functions.GetJoystickVendor;
        if (CHECKS) {
            check(joystick);
        }
        return invokePC(joystick, __functionAddress);
    }

    // --- [ SDL_GetJoystickProduct ] ---

    /** {@code Uint16 SDL_GetJoystickProduct(SDL_Joystick * joystick)} */
    @NativeType("Uint16")
    public static short SDL_GetJoystickProduct(@NativeType("SDL_Joystick *") long joystick) {
        long __functionAddress = Functions.GetJoystickProduct;
        if (CHECKS) {
            check(joystick);
        }
        return invokePC(joystick, __functionAddress);
    }

    // --- [ SDL_GetJoystickProductVersion ] ---

    /** {@code Uint16 SDL_GetJoystickProductVersion(SDL_Joystick * joystick)} */
    @NativeType("Uint16")
    public static short SDL_GetJoystickProductVersion(@NativeType("SDL_Joystick *") long joystick) {
        long __functionAddress = Functions.GetJoystickProductVersion;
        if (CHECKS) {
            check(joystick);
        }
        return invokePC(joystick, __functionAddress);
    }

    // --- [ SDL_GetJoystickFirmwareVersion ] ---

    /** {@code Uint16 SDL_GetJoystickFirmwareVersion(SDL_Joystick * joystick)} */
    @NativeType("Uint16")
    public static short SDL_GetJoystickFirmwareVersion(@NativeType("SDL_Joystick *") long joystick) {
        long __functionAddress = Functions.GetJoystickFirmwareVersion;
        if (CHECKS) {
            check(joystick);
        }
        return invokePC(joystick, __functionAddress);
    }

    // --- [ SDL_GetJoystickSerial ] ---

    /** {@code char const * SDL_GetJoystickSerial(SDL_Joystick * joystick)} */
    public static long nSDL_GetJoystickSerial(long joystick) {
        long __functionAddress = Functions.GetJoystickSerial;
        if (CHECKS) {
            check(joystick);
        }
        return invokePP(joystick, __functionAddress);
    }

    /** {@code char const * SDL_GetJoystickSerial(SDL_Joystick * joystick)} */
    @NativeType("char const *")
    public static @Nullable String SDL_GetJoystickSerial(@NativeType("SDL_Joystick *") long joystick) {
        long __result = nSDL_GetJoystickSerial(joystick);
        return memUTF8Safe(__result);
    }

    // --- [ SDL_GetJoystickType ] ---

    /** {@code SDL_JoystickType SDL_GetJoystickType(SDL_Joystick * joystick)} */
    @NativeType("SDL_JoystickType")
    public static int SDL_GetJoystickType(@NativeType("SDL_Joystick *") long joystick) {
        long __functionAddress = Functions.GetJoystickType;
        if (CHECKS) {
            check(joystick);
        }
        return invokePI(joystick, __functionAddress);
    }

    // --- [ SDL_GetJoystickGUIDInfo ] ---

    private static final FFICIF SDL_GetJoystickGUIDInfoCIF = apiCreateCIF(
        FFI_DEFAULT_ABI, ffi_type_void,
        apiCreateStruct(apiCreateArray(ffi_type_uint8, 16)), ffi_type_pointer, ffi_type_pointer, ffi_type_pointer, ffi_type_pointer
    );

    /** {@code void SDL_GetJoystickGUIDInfo(SDL_GUID guid, Uint16 * vendor, Uint16 * product, Uint16 * version, Uint16 * crc16)} */
    public static void nSDL_GetJoystickGUIDInfo(long guid, long vendor, long product, long version, long crc16) {
        long __functionAddress = Functions.GetJoystickGUIDInfo;
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            long arguments = stack.nmalloc(POINTER_SIZE, POINTER_SIZE * 5);
            memPutAddress(arguments, guid);
            memPutAddress(arguments + POINTER_SIZE, stack.npointer(vendor));
            memPutAddress(arguments + 2 * POINTER_SIZE, stack.npointer(product));
            memPutAddress(arguments + 3 * POINTER_SIZE, stack.npointer(version));
            memPutAddress(arguments + 4 * POINTER_SIZE, stack.npointer(crc16));

            nffi_call(SDL_GetJoystickGUIDInfoCIF.address(), __functionAddress, NULL, arguments);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    /** {@code void SDL_GetJoystickGUIDInfo(SDL_GUID guid, Uint16 * vendor, Uint16 * product, Uint16 * version, Uint16 * crc16)} */
    public static void SDL_GetJoystickGUIDInfo(SDL_GUID guid, @NativeType("Uint16 *") @Nullable ShortBuffer vendor, @NativeType("Uint16 *") @Nullable ShortBuffer product, @NativeType("Uint16 *") @Nullable ShortBuffer version, @NativeType("Uint16 *") @Nullable ShortBuffer crc16) {
        if (CHECKS) {
            checkSafe(vendor, 1);
            checkSafe(product, 1);
            checkSafe(version, 1);
            checkSafe(crc16, 1);
        }
        nSDL_GetJoystickGUIDInfo(guid.address(), memAddressSafe(vendor), memAddressSafe(product), memAddressSafe(version), memAddressSafe(crc16));
    }

    // --- [ SDL_JoystickConnected ] ---

    /** {@code bool SDL_JoystickConnected(SDL_Joystick * joystick)} */
    @NativeType("bool")
    public static boolean SDL_JoystickConnected(@NativeType("SDL_Joystick *") long joystick) {
        long __functionAddress = Functions.JoystickConnected;
        if (CHECKS) {
            check(joystick);
        }
        return invokePZ(joystick, __functionAddress);
    }

    // --- [ SDL_GetJoystickID ] ---

    /** {@code SDL_JoystickID SDL_GetJoystickID(SDL_Joystick * joystick)} */
    @NativeType("SDL_JoystickID")
    public static int SDL_GetJoystickID(@NativeType("SDL_Joystick *") long joystick) {
        long __functionAddress = Functions.GetJoystickID;
        if (CHECKS) {
            check(joystick);
        }
        return invokePI(joystick, __functionAddress);
    }

    // --- [ SDL_GetNumJoystickAxes ] ---

    /** {@code int SDL_GetNumJoystickAxes(SDL_Joystick * joystick)} */
    public static int SDL_GetNumJoystickAxes(@NativeType("SDL_Joystick *") long joystick) {
        long __functionAddress = Functions.GetNumJoystickAxes;
        if (CHECKS) {
            check(joystick);
        }
        return invokePI(joystick, __functionAddress);
    }

    // --- [ SDL_GetNumJoystickBalls ] ---

    /** {@code int SDL_GetNumJoystickBalls(SDL_Joystick * joystick)} */
    public static int SDL_GetNumJoystickBalls(@NativeType("SDL_Joystick *") long joystick) {
        long __functionAddress = Functions.GetNumJoystickBalls;
        if (CHECKS) {
            check(joystick);
        }
        return invokePI(joystick, __functionAddress);
    }

    // --- [ SDL_GetNumJoystickHats ] ---

    /** {@code int SDL_GetNumJoystickHats(SDL_Joystick * joystick)} */
    public static int SDL_GetNumJoystickHats(@NativeType("SDL_Joystick *") long joystick) {
        long __functionAddress = Functions.GetNumJoystickHats;
        if (CHECKS) {
            check(joystick);
        }
        return invokePI(joystick, __functionAddress);
    }

    // --- [ SDL_GetNumJoystickButtons ] ---

    /** {@code int SDL_GetNumJoystickButtons(SDL_Joystick * joystick)} */
    public static int SDL_GetNumJoystickButtons(@NativeType("SDL_Joystick *") long joystick) {
        long __functionAddress = Functions.GetNumJoystickButtons;
        if (CHECKS) {
            check(joystick);
        }
        return invokePI(joystick, __functionAddress);
    }

    // --- [ SDL_SetJoystickEventsEnabled ] ---

    /** {@code void SDL_SetJoystickEventsEnabled(bool enabled)} */
    public static void SDL_SetJoystickEventsEnabled(@NativeType("bool") boolean enabled) {
        long __functionAddress = Functions.SetJoystickEventsEnabled;
        invokeV(enabled, __functionAddress);
    }

    // --- [ SDL_JoystickEventsEnabled ] ---

    /** {@code bool SDL_JoystickEventsEnabled(void)} */
    @NativeType("bool")
    public static boolean SDL_JoystickEventsEnabled() {
        long __functionAddress = Functions.JoystickEventsEnabled;
        return invokeZ(__functionAddress);
    }

    // --- [ SDL_UpdateJoysticks ] ---

    /** {@code void SDL_UpdateJoysticks(void)} */
    public static void SDL_UpdateJoysticks() {
        long __functionAddress = Functions.UpdateJoysticks;
        invokeV(__functionAddress);
    }

    // --- [ SDL_GetJoystickAxis ] ---

    /** {@code Sint16 SDL_GetJoystickAxis(SDL_Joystick * joystick, int axis)} */
    @NativeType("Sint16")
    public static short SDL_GetJoystickAxis(@NativeType("SDL_Joystick *") long joystick, int axis) {
        long __functionAddress = Functions.GetJoystickAxis;
        if (CHECKS) {
            check(joystick);
        }
        return invokePS(joystick, axis, __functionAddress);
    }

    // --- [ SDL_GetJoystickAxisInitialState ] ---

    /** {@code bool SDL_GetJoystickAxisInitialState(SDL_Joystick * joystick, int axis, Sint16 * state)} */
    public static boolean nSDL_GetJoystickAxisInitialState(long joystick, int axis, long state) {
        long __functionAddress = Functions.GetJoystickAxisInitialState;
        if (CHECKS) {
            check(joystick);
        }
        return invokePPZ(joystick, axis, state, __functionAddress);
    }

    /** {@code bool SDL_GetJoystickAxisInitialState(SDL_Joystick * joystick, int axis, Sint16 * state)} */
    @NativeType("bool")
    public static boolean SDL_GetJoystickAxisInitialState(@NativeType("SDL_Joystick *") long joystick, int axis, @NativeType("Sint16 *") @Nullable ShortBuffer state) {
        if (CHECKS) {
            checkSafe(state, 1);
        }
        return nSDL_GetJoystickAxisInitialState(joystick, axis, memAddressSafe(state));
    }

    // --- [ SDL_GetJoystickBall ] ---

    /** {@code bool SDL_GetJoystickBall(SDL_Joystick * joystick, int ball, int * dx, int * dy)} */
    public static boolean nSDL_GetJoystickBall(long joystick, int ball, long dx, long dy) {
        long __functionAddress = Functions.GetJoystickBall;
        if (CHECKS) {
            check(joystick);
        }
        return invokePPPZ(joystick, ball, dx, dy, __functionAddress);
    }

    /** {@code bool SDL_GetJoystickBall(SDL_Joystick * joystick, int ball, int * dx, int * dy)} */
    @NativeType("bool")
    public static boolean SDL_GetJoystickBall(@NativeType("SDL_Joystick *") long joystick, int ball, @NativeType("int *") @Nullable IntBuffer dx, @NativeType("int *") @Nullable IntBuffer dy) {
        if (CHECKS) {
            checkSafe(dx, 1);
            checkSafe(dy, 1);
        }
        return nSDL_GetJoystickBall(joystick, ball, memAddressSafe(dx), memAddressSafe(dy));
    }

    // --- [ SDL_GetJoystickHat ] ---

    /** {@code Uint8 SDL_GetJoystickHat(SDL_Joystick * joystick, int hat)} */
    @NativeType("Uint8")
    public static byte SDL_GetJoystickHat(@NativeType("SDL_Joystick *") long joystick, int hat) {
        long __functionAddress = Functions.GetJoystickHat;
        if (CHECKS) {
            check(joystick);
        }
        return invokePU(joystick, hat, __functionAddress);
    }

    // --- [ SDL_GetJoystickButton ] ---

    /** {@code bool SDL_GetJoystickButton(SDL_Joystick * joystick, int button)} */
    @NativeType("bool")
    public static boolean SDL_GetJoystickButton(@NativeType("SDL_Joystick *") long joystick, int button) {
        long __functionAddress = Functions.GetJoystickButton;
        if (CHECKS) {
            check(joystick);
        }
        return invokePZ(joystick, button, __functionAddress);
    }

    // --- [ SDL_RumbleJoystick ] ---

    /** {@code bool SDL_RumbleJoystick(SDL_Joystick * joystick, Uint16 low_frequency_rumble, Uint16 high_frequency_rumble, Uint32 duration_ms)} */
    @NativeType("bool")
    public static boolean SDL_RumbleJoystick(@NativeType("SDL_Joystick *") long joystick, @NativeType("Uint16") short low_frequency_rumble, @NativeType("Uint16") short high_frequency_rumble, @NativeType("Uint32") int duration_ms) {
        long __functionAddress = Functions.RumbleJoystick;
        if (CHECKS) {
            check(joystick);
        }
        return invokePCCZ(joystick, low_frequency_rumble, high_frequency_rumble, duration_ms, __functionAddress);
    }

    // --- [ SDL_RumbleJoystickTriggers ] ---

    /** {@code bool SDL_RumbleJoystickTriggers(SDL_Joystick * joystick, Uint16 left_rumble, Uint16 right_rumble, Uint32 duration_ms)} */
    @NativeType("bool")
    public static boolean SDL_RumbleJoystickTriggers(@NativeType("SDL_Joystick *") long joystick, @NativeType("Uint16") short left_rumble, @NativeType("Uint16") short right_rumble, @NativeType("Uint32") int duration_ms) {
        long __functionAddress = Functions.RumbleJoystickTriggers;
        if (CHECKS) {
            check(joystick);
        }
        return invokePCCZ(joystick, left_rumble, right_rumble, duration_ms, __functionAddress);
    }

    // --- [ SDL_SetJoystickLED ] ---

    /** {@code bool SDL_SetJoystickLED(SDL_Joystick * joystick, Uint8 red, Uint8 green, Uint8 blue)} */
    @NativeType("bool")
    public static boolean SDL_SetJoystickLED(@NativeType("SDL_Joystick *") long joystick, @NativeType("Uint8") byte red, @NativeType("Uint8") byte green, @NativeType("Uint8") byte blue) {
        long __functionAddress = Functions.SetJoystickLED;
        if (CHECKS) {
            check(joystick);
        }
        return invokePUUUZ(joystick, red, green, blue, __functionAddress);
    }

    // --- [ SDL_SendJoystickEffect ] ---

    /** {@code bool SDL_SendJoystickEffect(SDL_Joystick * joystick, void const * data, int size)} */
    public static boolean nSDL_SendJoystickEffect(long joystick, long data, int size) {
        long __functionAddress = Functions.SendJoystickEffect;
        if (CHECKS) {
            check(joystick);
        }
        return invokePPZ(joystick, data, size, __functionAddress);
    }

    /** {@code bool SDL_SendJoystickEffect(SDL_Joystick * joystick, void const * data, int size)} */
    @NativeType("bool")
    public static boolean SDL_SendJoystickEffect(@NativeType("SDL_Joystick *") long joystick, @NativeType("void const *") ByteBuffer data) {
        return nSDL_SendJoystickEffect(joystick, memAddress(data), data.remaining());
    }

    // --- [ SDL_CloseJoystick ] ---

    /** {@code void SDL_CloseJoystick(SDL_Joystick * joystick)} */
    public static void SDL_CloseJoystick(@NativeType("SDL_Joystick *") long joystick) {
        long __functionAddress = Functions.CloseJoystick;
        if (CHECKS) {
            check(joystick);
        }
        invokePV(joystick, __functionAddress);
    }

    // --- [ SDL_GetJoystickConnectionState ] ---

    /** {@code SDL_JoystickConnectionState SDL_GetJoystickConnectionState(SDL_Joystick * joystick)} */
    @NativeType("SDL_JoystickConnectionState")
    public static int SDL_GetJoystickConnectionState(@NativeType("SDL_Joystick *") long joystick) {
        long __functionAddress = Functions.GetJoystickConnectionState;
        if (CHECKS) {
            check(joystick);
        }
        return invokePI(joystick, __functionAddress);
    }

    // --- [ SDL_GetJoystickPowerInfo ] ---

    /** {@code SDL_PowerState SDL_GetJoystickPowerInfo(SDL_Joystick * joystick, int * percent)} */
    public static int nSDL_GetJoystickPowerInfo(long joystick, long percent) {
        long __functionAddress = Functions.GetJoystickPowerInfo;
        if (CHECKS) {
            check(joystick);
        }
        return invokePPI(joystick, percent, __functionAddress);
    }

    /** {@code SDL_PowerState SDL_GetJoystickPowerInfo(SDL_Joystick * joystick, int * percent)} */
    @NativeType("SDL_PowerState")
    public static int SDL_GetJoystickPowerInfo(@NativeType("SDL_Joystick *") long joystick, @NativeType("int *") @Nullable IntBuffer percent) {
        if (CHECKS) {
            checkSafe(percent, 1);
        }
        return nSDL_GetJoystickPowerInfo(joystick, memAddressSafe(percent));
    }

    /** {@code void SDL_INIT_INTERFACE(SDL_VirtualJoystickDesc * iface)} */
    public static void SDL_INIT_INTERFACE(SDL_VirtualJoystickDesc iface) {
        iface.clear();
        iface.version(SDL_VirtualJoystickDesc.SIZEOF);
    }

}