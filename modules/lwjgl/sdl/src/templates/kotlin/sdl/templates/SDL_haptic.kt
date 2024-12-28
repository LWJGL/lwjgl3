/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package sdl.templates

import org.lwjgl.generator.*
import sdl.*

val SDL_haptic = "SDLHaptic".nativeClassSDL("SDL_haptic") {
    IntConstant(
        "HAPTIC_CONSTANT".."(1<<0)",
        "HAPTIC_SINE".."(1<<1)",
        "HAPTIC_SQUARE".."(1<<2)",
        "HAPTIC_TRIANGLE".."(1<<3)",
        "HAPTIC_SAWTOOTHUP".."(1<<4)",
        "HAPTIC_SAWTOOTHDOWN".."(1<<5)",
        "HAPTIC_RAMP".."(1<<6)",
        "HAPTIC_SPRING".."(1<<7)",
        "HAPTIC_DAMPER".."(1<<8)",
        "HAPTIC_INERTIA".."(1<<9)",
        "HAPTIC_FRICTION".."(1<<10)",
        "HAPTIC_LEFTRIGHT".."(1<<11)",
        "HAPTIC_RESERVED1".."(1<<12)",
        "HAPTIC_RESERVED2".."(1<<13)",
        "HAPTIC_RESERVED3".."(1<<14)",
        "HAPTIC_CUSTOM".."(1<<15)",
        "HAPTIC_GAIN".."(1<<16)",
        "HAPTIC_AUTOCENTER".."(1<<17)",
        "HAPTIC_STATUS".."(1<<18)",
        "HAPTIC_PAUSE".."(1<<19)"
    )

    IntConstant(
        "HAPTIC_POLAR".."0",
        "HAPTIC_CARTESIAN".."1",
        "HAPTIC_SPHERICAL".."2",
        "HAPTIC_STEERING_AXIS".."3",
    )

    IntConstant("HAPTIC_INFINITY".."0xffffffff")

    SDL_HapticID.p("GetHaptics", AutoSizeResult..int.p("count"))

    charUTF8.const.p("GetHapticNameForID", SDL_HapticID("instance_id"))

    SDL_Haptic.p("OpenHaptic", SDL_HapticID("instance_id"))

    SDL_Haptic.p("GetHapticFromID", SDL_HapticID("instance_id"))
    SDL_HapticID("GetHapticID", SDL_Haptic.p("haptic"))
    charUTF8.const.p("GetHapticName", SDL_Haptic.p("haptic"))

    bool("IsMouseHaptic", void())
    SDL_Haptic.p("OpenHapticFromMouse", void())

    bool("IsJoystickHaptic", SDL_Joystick.p("joystick"))
    SDL_Haptic.p("OpenHapticFromJoystick", SDL_Joystick.p("joystick"))

    void("CloseHaptic", SDL_Haptic.p("haptic"))

    int("GetMaxHapticEffects", SDL_Haptic.p("haptic"))
    int("GetMaxHapticEffectsPlaying", SDL_Haptic.p("haptic"))

    Uint32("GetHapticFeatures", SDL_Haptic.p("haptic"))

    int("GetNumHapticAxes", SDL_Haptic.p("haptic"))

    bool(
        "HapticEffectSupported",

        SDL_Haptic.p("haptic"),
        SDL_HapticEffect.const.p("effect")
    )

    int(
        "CreateHapticEffect",

        SDL_Haptic.p("haptic"),
        SDL_HapticEffect.const.p("effect")
    )

    bool(
        "UpdateHapticEffect",

        SDL_Haptic.p("haptic"),
        int("effect"),
        SDL_HapticEffect.const.p("data")
    )

    bool(
        "RunHapticEffect",

        SDL_Haptic.p("haptic"),
        int("effect"),
        Uint32("iterations")
    )

    bool(
        "StopHapticEffect",

        SDL_Haptic.p("haptic"),
        int("effect")
    )

    void(
        "DestroyHapticEffect",

        SDL_Haptic.p("haptic"),
        int("effect")
    )

    bool(
        "GetHapticEffectStatus",

        SDL_Haptic.p("haptic"),
        int("effect")
    )

    bool(
        "SetHapticGain",

        SDL_Haptic.p("haptic"),
        int("gain")
    )

    bool(
        "SetHapticAutocenter",

        SDL_Haptic.p("haptic"),
        int("autocenter")
    )

    bool("PauseHaptic", SDL_Haptic.p("haptic"))
    bool("ResumeHaptic", SDL_Haptic.p("haptic"))
    bool("StopHapticEffects", SDL_Haptic.p("haptic"))

    bool("HapticRumbleSupported", SDL_Haptic.p("haptic"))
    bool("InitHapticRumble", SDL_Haptic.p("haptic"))
    bool(
        "PlayHapticRumble",

        SDL_Haptic.p("haptic"),
        float("strength"),
        Uint32("length")
    )
    bool("StopHapticRumble", SDL_Haptic.p("haptic"))
}