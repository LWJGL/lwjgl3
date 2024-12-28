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

public class SDLHaptic {

    /** Contains the function pointers loaded from {@code SDL.getLibrary()}. */
    public static final class Functions {

        private Functions() {}

        /** Function address. */
        public static final long
            GetHaptics                 = apiGetFunctionAddress(SDL.getLibrary(), "SDL_GetHaptics"),
            GetHapticNameForID         = apiGetFunctionAddress(SDL.getLibrary(), "SDL_GetHapticNameForID"),
            OpenHaptic                 = apiGetFunctionAddress(SDL.getLibrary(), "SDL_OpenHaptic"),
            GetHapticFromID            = apiGetFunctionAddress(SDL.getLibrary(), "SDL_GetHapticFromID"),
            GetHapticID                = apiGetFunctionAddress(SDL.getLibrary(), "SDL_GetHapticID"),
            GetHapticName              = apiGetFunctionAddress(SDL.getLibrary(), "SDL_GetHapticName"),
            IsMouseHaptic              = apiGetFunctionAddress(SDL.getLibrary(), "SDL_IsMouseHaptic"),
            OpenHapticFromMouse        = apiGetFunctionAddress(SDL.getLibrary(), "SDL_OpenHapticFromMouse"),
            IsJoystickHaptic           = apiGetFunctionAddress(SDL.getLibrary(), "SDL_IsJoystickHaptic"),
            OpenHapticFromJoystick     = apiGetFunctionAddress(SDL.getLibrary(), "SDL_OpenHapticFromJoystick"),
            CloseHaptic                = apiGetFunctionAddress(SDL.getLibrary(), "SDL_CloseHaptic"),
            GetMaxHapticEffects        = apiGetFunctionAddress(SDL.getLibrary(), "SDL_GetMaxHapticEffects"),
            GetMaxHapticEffectsPlaying = apiGetFunctionAddress(SDL.getLibrary(), "SDL_GetMaxHapticEffectsPlaying"),
            GetHapticFeatures          = apiGetFunctionAddress(SDL.getLibrary(), "SDL_GetHapticFeatures"),
            GetNumHapticAxes           = apiGetFunctionAddress(SDL.getLibrary(), "SDL_GetNumHapticAxes"),
            HapticEffectSupported      = apiGetFunctionAddress(SDL.getLibrary(), "SDL_HapticEffectSupported"),
            CreateHapticEffect         = apiGetFunctionAddress(SDL.getLibrary(), "SDL_CreateHapticEffect"),
            UpdateHapticEffect         = apiGetFunctionAddress(SDL.getLibrary(), "SDL_UpdateHapticEffect"),
            RunHapticEffect            = apiGetFunctionAddress(SDL.getLibrary(), "SDL_RunHapticEffect"),
            StopHapticEffect           = apiGetFunctionAddress(SDL.getLibrary(), "SDL_StopHapticEffect"),
            DestroyHapticEffect        = apiGetFunctionAddress(SDL.getLibrary(), "SDL_DestroyHapticEffect"),
            GetHapticEffectStatus      = apiGetFunctionAddress(SDL.getLibrary(), "SDL_GetHapticEffectStatus"),
            SetHapticGain              = apiGetFunctionAddress(SDL.getLibrary(), "SDL_SetHapticGain"),
            SetHapticAutocenter        = apiGetFunctionAddress(SDL.getLibrary(), "SDL_SetHapticAutocenter"),
            PauseHaptic                = apiGetFunctionAddress(SDL.getLibrary(), "SDL_PauseHaptic"),
            ResumeHaptic               = apiGetFunctionAddress(SDL.getLibrary(), "SDL_ResumeHaptic"),
            StopHapticEffects          = apiGetFunctionAddress(SDL.getLibrary(), "SDL_StopHapticEffects"),
            HapticRumbleSupported      = apiGetFunctionAddress(SDL.getLibrary(), "SDL_HapticRumbleSupported"),
            InitHapticRumble           = apiGetFunctionAddress(SDL.getLibrary(), "SDL_InitHapticRumble"),
            PlayHapticRumble           = apiGetFunctionAddress(SDL.getLibrary(), "SDL_PlayHapticRumble"),
            StopHapticRumble           = apiGetFunctionAddress(SDL.getLibrary(), "SDL_StopHapticRumble");

    }

    public static final int
        SDL_HAPTIC_CONSTANT     = (1<<0),
        SDL_HAPTIC_SINE         = (1<<1),
        SDL_HAPTIC_SQUARE       = (1<<2),
        SDL_HAPTIC_TRIANGLE     = (1<<3),
        SDL_HAPTIC_SAWTOOTHUP   = (1<<4),
        SDL_HAPTIC_SAWTOOTHDOWN = (1<<5),
        SDL_HAPTIC_RAMP         = (1<<6),
        SDL_HAPTIC_SPRING       = (1<<7),
        SDL_HAPTIC_DAMPER       = (1<<8),
        SDL_HAPTIC_INERTIA      = (1<<9),
        SDL_HAPTIC_FRICTION     = (1<<10),
        SDL_HAPTIC_LEFTRIGHT    = (1<<11),
        SDL_HAPTIC_RESERVED1    = (1<<12),
        SDL_HAPTIC_RESERVED2    = (1<<13),
        SDL_HAPTIC_RESERVED3    = (1<<14),
        SDL_HAPTIC_CUSTOM       = (1<<15),
        SDL_HAPTIC_GAIN         = (1<<16),
        SDL_HAPTIC_AUTOCENTER   = (1<<17),
        SDL_HAPTIC_STATUS       = (1<<18),
        SDL_HAPTIC_PAUSE        = (1<<19);

    public static final int
        SDL_HAPTIC_POLAR         = 0,
        SDL_HAPTIC_CARTESIAN     = 1,
        SDL_HAPTIC_SPHERICAL     = 2,
        SDL_HAPTIC_STEERING_AXIS = 3;

    public static final int SDL_HAPTIC_INFINITY = 0xffffffff;

    protected SDLHaptic() {
        throw new UnsupportedOperationException();
    }

    // --- [ SDL_GetHaptics ] ---

    /** {@code SDL_HapticID * SDL_GetHaptics(int * count)} */
    public static long nSDL_GetHaptics(long count) {
        long __functionAddress = Functions.GetHaptics;
        return invokePP(count, __functionAddress);
    }

    /** {@code SDL_HapticID * SDL_GetHaptics(int * count)} */
    @NativeType("SDL_HapticID *")
    public static @Nullable IntBuffer SDL_GetHaptics() {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        IntBuffer count = stack.callocInt(1);
        try {
            long __result = nSDL_GetHaptics(memAddress(count));
            return memIntBufferSafe(__result, count.get(0));
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ SDL_GetHapticNameForID ] ---

    /** {@code char const * SDL_GetHapticNameForID(SDL_HapticID instance_id)} */
    public static long nSDL_GetHapticNameForID(int instance_id) {
        long __functionAddress = Functions.GetHapticNameForID;
        return invokeP(instance_id, __functionAddress);
    }

    /** {@code char const * SDL_GetHapticNameForID(SDL_HapticID instance_id)} */
    @NativeType("char const *")
    public static @Nullable String SDL_GetHapticNameForID(@NativeType("SDL_HapticID") int instance_id) {
        long __result = nSDL_GetHapticNameForID(instance_id);
        return memUTF8Safe(__result);
    }

    // --- [ SDL_OpenHaptic ] ---

    /** {@code SDL_Haptic * SDL_OpenHaptic(SDL_HapticID instance_id)} */
    @NativeType("SDL_Haptic *")
    public static long SDL_OpenHaptic(@NativeType("SDL_HapticID") int instance_id) {
        long __functionAddress = Functions.OpenHaptic;
        return invokeP(instance_id, __functionAddress);
    }

    // --- [ SDL_GetHapticFromID ] ---

    /** {@code SDL_Haptic * SDL_GetHapticFromID(SDL_HapticID instance_id)} */
    @NativeType("SDL_Haptic *")
    public static long SDL_GetHapticFromID(@NativeType("SDL_HapticID") int instance_id) {
        long __functionAddress = Functions.GetHapticFromID;
        return invokeP(instance_id, __functionAddress);
    }

    // --- [ SDL_GetHapticID ] ---

    /** {@code SDL_HapticID SDL_GetHapticID(SDL_Haptic * haptic)} */
    @NativeType("SDL_HapticID")
    public static int SDL_GetHapticID(@NativeType("SDL_Haptic *") long haptic) {
        long __functionAddress = Functions.GetHapticID;
        if (CHECKS) {
            check(haptic);
        }
        return invokePI(haptic, __functionAddress);
    }

    // --- [ SDL_GetHapticName ] ---

    /** {@code char const * SDL_GetHapticName(SDL_Haptic * haptic)} */
    public static long nSDL_GetHapticName(long haptic) {
        long __functionAddress = Functions.GetHapticName;
        if (CHECKS) {
            check(haptic);
        }
        return invokePP(haptic, __functionAddress);
    }

    /** {@code char const * SDL_GetHapticName(SDL_Haptic * haptic)} */
    @NativeType("char const *")
    public static @Nullable String SDL_GetHapticName(@NativeType("SDL_Haptic *") long haptic) {
        long __result = nSDL_GetHapticName(haptic);
        return memUTF8Safe(__result);
    }

    // --- [ SDL_IsMouseHaptic ] ---

    /** {@code bool SDL_IsMouseHaptic(void)} */
    @NativeType("bool")
    public static boolean SDL_IsMouseHaptic() {
        long __functionAddress = Functions.IsMouseHaptic;
        return invokeZ(__functionAddress);
    }

    // --- [ SDL_OpenHapticFromMouse ] ---

    /** {@code SDL_Haptic * SDL_OpenHapticFromMouse(void)} */
    @NativeType("SDL_Haptic *")
    public static long SDL_OpenHapticFromMouse() {
        long __functionAddress = Functions.OpenHapticFromMouse;
        return invokeP(__functionAddress);
    }

    // --- [ SDL_IsJoystickHaptic ] ---

    /** {@code bool SDL_IsJoystickHaptic(SDL_Joystick * joystick)} */
    @NativeType("bool")
    public static boolean SDL_IsJoystickHaptic(@NativeType("SDL_Joystick *") long joystick) {
        long __functionAddress = Functions.IsJoystickHaptic;
        if (CHECKS) {
            check(joystick);
        }
        return invokePZ(joystick, __functionAddress);
    }

    // --- [ SDL_OpenHapticFromJoystick ] ---

    /** {@code SDL_Haptic * SDL_OpenHapticFromJoystick(SDL_Joystick * joystick)} */
    @NativeType("SDL_Haptic *")
    public static long SDL_OpenHapticFromJoystick(@NativeType("SDL_Joystick *") long joystick) {
        long __functionAddress = Functions.OpenHapticFromJoystick;
        if (CHECKS) {
            check(joystick);
        }
        return invokePP(joystick, __functionAddress);
    }

    // --- [ SDL_CloseHaptic ] ---

    /** {@code void SDL_CloseHaptic(SDL_Haptic * haptic)} */
    public static void SDL_CloseHaptic(@NativeType("SDL_Haptic *") long haptic) {
        long __functionAddress = Functions.CloseHaptic;
        if (CHECKS) {
            check(haptic);
        }
        invokePV(haptic, __functionAddress);
    }

    // --- [ SDL_GetMaxHapticEffects ] ---

    /** {@code int SDL_GetMaxHapticEffects(SDL_Haptic * haptic)} */
    public static int SDL_GetMaxHapticEffects(@NativeType("SDL_Haptic *") long haptic) {
        long __functionAddress = Functions.GetMaxHapticEffects;
        if (CHECKS) {
            check(haptic);
        }
        return invokePI(haptic, __functionAddress);
    }

    // --- [ SDL_GetMaxHapticEffectsPlaying ] ---

    /** {@code int SDL_GetMaxHapticEffectsPlaying(SDL_Haptic * haptic)} */
    public static int SDL_GetMaxHapticEffectsPlaying(@NativeType("SDL_Haptic *") long haptic) {
        long __functionAddress = Functions.GetMaxHapticEffectsPlaying;
        if (CHECKS) {
            check(haptic);
        }
        return invokePI(haptic, __functionAddress);
    }

    // --- [ SDL_GetHapticFeatures ] ---

    /** {@code Uint32 SDL_GetHapticFeatures(SDL_Haptic * haptic)} */
    @NativeType("Uint32")
    public static int SDL_GetHapticFeatures(@NativeType("SDL_Haptic *") long haptic) {
        long __functionAddress = Functions.GetHapticFeatures;
        if (CHECKS) {
            check(haptic);
        }
        return invokePI(haptic, __functionAddress);
    }

    // --- [ SDL_GetNumHapticAxes ] ---

    /** {@code int SDL_GetNumHapticAxes(SDL_Haptic * haptic)} */
    public static int SDL_GetNumHapticAxes(@NativeType("SDL_Haptic *") long haptic) {
        long __functionAddress = Functions.GetNumHapticAxes;
        if (CHECKS) {
            check(haptic);
        }
        return invokePI(haptic, __functionAddress);
    }

    // --- [ SDL_HapticEffectSupported ] ---

    /** {@code bool SDL_HapticEffectSupported(SDL_Haptic * haptic, SDL_HapticEffect const * effect)} */
    public static boolean nSDL_HapticEffectSupported(long haptic, long effect) {
        long __functionAddress = Functions.HapticEffectSupported;
        if (CHECKS) {
            check(haptic);
        }
        return invokePPZ(haptic, effect, __functionAddress);
    }

    /** {@code bool SDL_HapticEffectSupported(SDL_Haptic * haptic, SDL_HapticEffect const * effect)} */
    @NativeType("bool")
    public static boolean SDL_HapticEffectSupported(@NativeType("SDL_Haptic *") long haptic, @NativeType("SDL_HapticEffect const *") SDL_HapticEffect effect) {
        return nSDL_HapticEffectSupported(haptic, effect.address());
    }

    // --- [ SDL_CreateHapticEffect ] ---

    /** {@code int SDL_CreateHapticEffect(SDL_Haptic * haptic, SDL_HapticEffect const * effect)} */
    public static int nSDL_CreateHapticEffect(long haptic, long effect) {
        long __functionAddress = Functions.CreateHapticEffect;
        if (CHECKS) {
            check(haptic);
        }
        return invokePPI(haptic, effect, __functionAddress);
    }

    /** {@code int SDL_CreateHapticEffect(SDL_Haptic * haptic, SDL_HapticEffect const * effect)} */
    public static int SDL_CreateHapticEffect(@NativeType("SDL_Haptic *") long haptic, @NativeType("SDL_HapticEffect const *") SDL_HapticEffect effect) {
        return nSDL_CreateHapticEffect(haptic, effect.address());
    }

    // --- [ SDL_UpdateHapticEffect ] ---

    /** {@code bool SDL_UpdateHapticEffect(SDL_Haptic * haptic, int effect, SDL_HapticEffect const * data)} */
    public static boolean nSDL_UpdateHapticEffect(long haptic, int effect, long data) {
        long __functionAddress = Functions.UpdateHapticEffect;
        if (CHECKS) {
            check(haptic);
        }
        return invokePPZ(haptic, effect, data, __functionAddress);
    }

    /** {@code bool SDL_UpdateHapticEffect(SDL_Haptic * haptic, int effect, SDL_HapticEffect const * data)} */
    @NativeType("bool")
    public static boolean SDL_UpdateHapticEffect(@NativeType("SDL_Haptic *") long haptic, int effect, @NativeType("SDL_HapticEffect const *") SDL_HapticEffect data) {
        return nSDL_UpdateHapticEffect(haptic, effect, data.address());
    }

    // --- [ SDL_RunHapticEffect ] ---

    /** {@code bool SDL_RunHapticEffect(SDL_Haptic * haptic, int effect, Uint32 iterations)} */
    @NativeType("bool")
    public static boolean SDL_RunHapticEffect(@NativeType("SDL_Haptic *") long haptic, int effect, @NativeType("Uint32") int iterations) {
        long __functionAddress = Functions.RunHapticEffect;
        if (CHECKS) {
            check(haptic);
        }
        return invokePZ(haptic, effect, iterations, __functionAddress);
    }

    // --- [ SDL_StopHapticEffect ] ---

    /** {@code bool SDL_StopHapticEffect(SDL_Haptic * haptic, int effect)} */
    @NativeType("bool")
    public static boolean SDL_StopHapticEffect(@NativeType("SDL_Haptic *") long haptic, int effect) {
        long __functionAddress = Functions.StopHapticEffect;
        if (CHECKS) {
            check(haptic);
        }
        return invokePZ(haptic, effect, __functionAddress);
    }

    // --- [ SDL_DestroyHapticEffect ] ---

    /** {@code void SDL_DestroyHapticEffect(SDL_Haptic * haptic, int effect)} */
    public static void SDL_DestroyHapticEffect(@NativeType("SDL_Haptic *") long haptic, int effect) {
        long __functionAddress = Functions.DestroyHapticEffect;
        if (CHECKS) {
            check(haptic);
        }
        invokePV(haptic, effect, __functionAddress);
    }

    // --- [ SDL_GetHapticEffectStatus ] ---

    /** {@code bool SDL_GetHapticEffectStatus(SDL_Haptic * haptic, int effect)} */
    @NativeType("bool")
    public static boolean SDL_GetHapticEffectStatus(@NativeType("SDL_Haptic *") long haptic, int effect) {
        long __functionAddress = Functions.GetHapticEffectStatus;
        if (CHECKS) {
            check(haptic);
        }
        return invokePZ(haptic, effect, __functionAddress);
    }

    // --- [ SDL_SetHapticGain ] ---

    /** {@code bool SDL_SetHapticGain(SDL_Haptic * haptic, int gain)} */
    @NativeType("bool")
    public static boolean SDL_SetHapticGain(@NativeType("SDL_Haptic *") long haptic, int gain) {
        long __functionAddress = Functions.SetHapticGain;
        if (CHECKS) {
            check(haptic);
        }
        return invokePZ(haptic, gain, __functionAddress);
    }

    // --- [ SDL_SetHapticAutocenter ] ---

    /** {@code bool SDL_SetHapticAutocenter(SDL_Haptic * haptic, int autocenter)} */
    @NativeType("bool")
    public static boolean SDL_SetHapticAutocenter(@NativeType("SDL_Haptic *") long haptic, int autocenter) {
        long __functionAddress = Functions.SetHapticAutocenter;
        if (CHECKS) {
            check(haptic);
        }
        return invokePZ(haptic, autocenter, __functionAddress);
    }

    // --- [ SDL_PauseHaptic ] ---

    /** {@code bool SDL_PauseHaptic(SDL_Haptic * haptic)} */
    @NativeType("bool")
    public static boolean SDL_PauseHaptic(@NativeType("SDL_Haptic *") long haptic) {
        long __functionAddress = Functions.PauseHaptic;
        if (CHECKS) {
            check(haptic);
        }
        return invokePZ(haptic, __functionAddress);
    }

    // --- [ SDL_ResumeHaptic ] ---

    /** {@code bool SDL_ResumeHaptic(SDL_Haptic * haptic)} */
    @NativeType("bool")
    public static boolean SDL_ResumeHaptic(@NativeType("SDL_Haptic *") long haptic) {
        long __functionAddress = Functions.ResumeHaptic;
        if (CHECKS) {
            check(haptic);
        }
        return invokePZ(haptic, __functionAddress);
    }

    // --- [ SDL_StopHapticEffects ] ---

    /** {@code bool SDL_StopHapticEffects(SDL_Haptic * haptic)} */
    @NativeType("bool")
    public static boolean SDL_StopHapticEffects(@NativeType("SDL_Haptic *") long haptic) {
        long __functionAddress = Functions.StopHapticEffects;
        if (CHECKS) {
            check(haptic);
        }
        return invokePZ(haptic, __functionAddress);
    }

    // --- [ SDL_HapticRumbleSupported ] ---

    /** {@code bool SDL_HapticRumbleSupported(SDL_Haptic * haptic)} */
    @NativeType("bool")
    public static boolean SDL_HapticRumbleSupported(@NativeType("SDL_Haptic *") long haptic) {
        long __functionAddress = Functions.HapticRumbleSupported;
        if (CHECKS) {
            check(haptic);
        }
        return invokePZ(haptic, __functionAddress);
    }

    // --- [ SDL_InitHapticRumble ] ---

    /** {@code bool SDL_InitHapticRumble(SDL_Haptic * haptic)} */
    @NativeType("bool")
    public static boolean SDL_InitHapticRumble(@NativeType("SDL_Haptic *") long haptic) {
        long __functionAddress = Functions.InitHapticRumble;
        if (CHECKS) {
            check(haptic);
        }
        return invokePZ(haptic, __functionAddress);
    }

    // --- [ SDL_PlayHapticRumble ] ---

    /** {@code bool SDL_PlayHapticRumble(SDL_Haptic * haptic, float strength, Uint32 length)} */
    @NativeType("bool")
    public static boolean SDL_PlayHapticRumble(@NativeType("SDL_Haptic *") long haptic, float strength, @NativeType("Uint32") int length) {
        long __functionAddress = Functions.PlayHapticRumble;
        if (CHECKS) {
            check(haptic);
        }
        return invokePZ(haptic, strength, length, __functionAddress);
    }

    // --- [ SDL_StopHapticRumble ] ---

    /** {@code bool SDL_StopHapticRumble(SDL_Haptic * haptic)} */
    @NativeType("bool")
    public static boolean SDL_StopHapticRumble(@NativeType("SDL_Haptic *") long haptic) {
        long __functionAddress = Functions.StopHapticRumble;
        if (CHECKS) {
            check(haptic);
        }
        return invokePZ(haptic, __functionAddress);
    }

}