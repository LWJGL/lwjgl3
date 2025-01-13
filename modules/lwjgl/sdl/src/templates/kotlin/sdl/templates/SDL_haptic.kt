/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package sdl.templates

import org.lwjgl.generator.*
import sdl.*

fun SDL_haptic() = SDL.apply {

    IntConstant("HAPTIC_CONSTANT".."(1<<0)")
    IntConstant("HAPTIC_SINE".."(1<<1)")
    IntConstant("HAPTIC_SQUARE".."(1<<2)")
    IntConstant("HAPTIC_TRIANGLE".."(1<<3)")
    IntConstant("HAPTIC_SAWTOOTHUP".."(1<<4)")
    IntConstant("HAPTIC_SAWTOOTHDOWN".."(1<<5)")
    IntConstant("HAPTIC_RAMP".."(1<<6)")
    IntConstant("HAPTIC_SPRING".."(1<<7)")
    IntConstant("HAPTIC_DAMPER".."(1<<8)")
    IntConstant("HAPTIC_INERTIA".."(1<<9)")
    IntConstant("HAPTIC_FRICTION".."(1<<10)")
    IntConstant("HAPTIC_LEFTRIGHT".."(1<<11)")
    IntConstant("HAPTIC_RESERVED1".."(1<<12)")
    IntConstant("HAPTIC_RESERVED2".."(1<<13)")
    IntConstant("HAPTIC_RESERVED3".."(1<<14)")
    IntConstant("HAPTIC_CUSTOM".."(1<<15)")
    IntConstant("HAPTIC_GAIN".."(1<<16)")
    IntConstant("HAPTIC_AUTOCENTER".."(1<<17)")
    IntConstant("HAPTIC_STATUS".."(1<<18)")
    IntConstant("HAPTIC_PAUSE".."(1<<19)")
    IntConstant("HAPTIC_POLAR".."0")
    IntConstant("HAPTIC_CARTESIAN".."1")
    IntConstant("HAPTIC_SPHERICAL".."2")
    IntConstant("HAPTIC_STEERING_AXIS".."3")
    IntConstant("HAPTIC_INFINITY".."0xffffffff")

    SDL_HapticID.p(
        "GetHaptics",

        AutoSizeResult..int.p("count")
    )

    charUTF8.const.p(
        "GetHapticNameForID",

        SDL_HapticID("instance_id")
    )

    SDL_Haptic.p(
        "OpenHaptic",

        SDL_HapticID("instance_id")
    )

    SDL_Haptic.p(
        "GetHapticFromID",

        SDL_HapticID("instance_id")
    )

    SDL_HapticID(
        "GetHapticID",

        SDL_Haptic.p("haptic")
    )

    charUTF8.const.p(
        "GetHapticName",

        SDL_Haptic.p("haptic")
    )

    bool(
        "IsMouseHaptic",

        void()
    )

    SDL_Haptic.p(
        "OpenHapticFromMouse",

        void()
    )

    bool(
        "IsJoystickHaptic",

        SDL_Joystick.p("joystick")
    )

    SDL_Haptic.p(
        "OpenHapticFromJoystick",

        SDL_Joystick.p("joystick")
    )

    void(
        "CloseHaptic",

        SDL_Haptic.p("haptic")
    )

    int(
        "GetMaxHapticEffects",

        SDL_Haptic.p("haptic")
    )

    int(
        "GetMaxHapticEffectsPlaying",

        SDL_Haptic.p("haptic")
    )

    Uint32(
        "GetHapticFeatures",

        SDL_Haptic.p("haptic")
    )

    int(
        "GetNumHapticAxes",

        SDL_Haptic.p("haptic")
    )

    bool(
        "HapticEffectSupported",

        SDL_Haptic.p("haptic"),
        Check(1)..SDL_HapticEffect.const.p("effect")
    )

    int(
        "CreateHapticEffect",

        SDL_Haptic.p("haptic"),
        Check(1)..SDL_HapticEffect.const.p("effect")
    )

    bool(
        "UpdateHapticEffect",

        SDL_Haptic.p("haptic"),
        int("effect"),
        Check(1)..SDL_HapticEffect.const.p("data")
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

    bool(
        "PauseHaptic",

        SDL_Haptic.p("haptic")
    )

    bool(
        "ResumeHaptic",

        SDL_Haptic.p("haptic")
    )

    bool(
        "StopHapticEffects",

        SDL_Haptic.p("haptic")
    )

    bool(
        "HapticRumbleSupported",

        SDL_Haptic.p("haptic")
    )

    bool(
        "InitHapticRumble",

        SDL_Haptic.p("haptic")
    )

    bool(
        "PlayHapticRumble",

        SDL_Haptic.p("haptic"),
        float("strength"),
        Uint32("length")
    )

    bool(
        "StopHapticRumble",

        SDL_Haptic.p("haptic")
    )

}
