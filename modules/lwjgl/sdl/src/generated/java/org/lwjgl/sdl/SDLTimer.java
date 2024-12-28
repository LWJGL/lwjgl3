/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.sdl;

import org.lwjgl.system.*;

import static org.lwjgl.system.APIUtil.*;
import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.JNI.*;

public class SDLTimer {

    /** Contains the function pointers loaded from {@code SDL.getLibrary()}. */
    public static final class Functions {

        private Functions() {}

        /** Function address. */
        public static final long
            GetTicks                = apiGetFunctionAddress(SDL.getLibrary(), "SDL_GetTicks"),
            GetTicksNS              = apiGetFunctionAddress(SDL.getLibrary(), "SDL_GetTicksNS"),
            GetPerformanceCounter   = apiGetFunctionAddress(SDL.getLibrary(), "SDL_GetPerformanceCounter"),
            GetPerformanceFrequency = apiGetFunctionAddress(SDL.getLibrary(), "SDL_GetPerformanceFrequency"),
            Delay                   = apiGetFunctionAddress(SDL.getLibrary(), "SDL_Delay"),
            DelayNS                 = apiGetFunctionAddress(SDL.getLibrary(), "SDL_DelayNS"),
            DelayPrecise            = apiGetFunctionAddress(SDL.getLibrary(), "SDL_DelayPrecise"),
            AddTimer                = apiGetFunctionAddress(SDL.getLibrary(), "SDL_AddTimer"),
            AddTimerNS              = apiGetFunctionAddress(SDL.getLibrary(), "SDL_AddTimerNS"),
            RemoveTimer             = apiGetFunctionAddress(SDL.getLibrary(), "SDL_RemoveTimer");

    }

    public static final int
        SDL_MS_PER_SECOND = 1000,
        SDL_US_PER_SECOND = 1000000;

    public static final long SDL_NS_PER_SECOND = 1000000000L;

    public static final int
        SDL_NS_PER_MS = 1000000,
        SDL_NS_PER_US = 1000;

    protected SDLTimer() {
        throw new UnsupportedOperationException();
    }

    // --- [ SDL_GetTicks ] ---

    /** {@code Uint64 SDL_GetTicks(void)} */
    @NativeType("Uint64")
    public static long SDL_GetTicks() {
        long __functionAddress = Functions.GetTicks;
        return invokeJ(__functionAddress);
    }

    // --- [ SDL_GetTicksNS ] ---

    /** {@code Uint64 SDL_GetTicksNS(void)} */
    @NativeType("Uint64")
    public static long SDL_GetTicksNS() {
        long __functionAddress = Functions.GetTicksNS;
        return invokeJ(__functionAddress);
    }

    // --- [ SDL_GetPerformanceCounter ] ---

    /** {@code Uint64 SDL_GetPerformanceCounter(void)} */
    @NativeType("Uint64")
    public static long SDL_GetPerformanceCounter() {
        long __functionAddress = Functions.GetPerformanceCounter;
        return invokeJ(__functionAddress);
    }

    // --- [ SDL_GetPerformanceFrequency ] ---

    /** {@code Uint64 SDL_GetPerformanceFrequency(void)} */
    @NativeType("Uint64")
    public static long SDL_GetPerformanceFrequency() {
        long __functionAddress = Functions.GetPerformanceFrequency;
        return invokeJ(__functionAddress);
    }

    // --- [ SDL_Delay ] ---

    /** {@code void SDL_Delay(Uint32 ms)} */
    public static void SDL_Delay(@NativeType("Uint32") int ms) {
        long __functionAddress = Functions.Delay;
        invokeV(ms, __functionAddress);
    }

    // --- [ SDL_DelayNS ] ---

    /** {@code void SDL_DelayNS(Uint64 ns)} */
    public static void SDL_DelayNS(@NativeType("Uint64") long ns) {
        long __functionAddress = Functions.DelayNS;
        invokeJV(ns, __functionAddress);
    }

    // --- [ SDL_DelayPrecise ] ---

    /** {@code void SDL_DelayPrecise(Uint64 ns)} */
    public static void SDL_DelayPrecise(@NativeType("Uint64") long ns) {
        long __functionAddress = Functions.DelayPrecise;
        invokeJV(ns, __functionAddress);
    }

    // --- [ SDL_AddTimer ] ---

    /** {@code SDL_TimerID SDL_AddTimer(Uint32 interval, SDL_TimerCallback callback, void * userdata)} */
    public static int nSDL_AddTimer(int interval, long callback, long userdata) {
        long __functionAddress = Functions.AddTimer;
        return invokePPI(interval, callback, userdata, __functionAddress);
    }

    /** {@code SDL_TimerID SDL_AddTimer(Uint32 interval, SDL_TimerCallback callback, void * userdata)} */
    @NativeType("SDL_TimerID")
    public static int SDL_AddTimer(@NativeType("Uint32") int interval, @NativeType("SDL_TimerCallback") SDL_TimerCallbackI callback, @NativeType("void *") long userdata) {
        return nSDL_AddTimer(interval, callback.address(), userdata);
    }

    // --- [ SDL_AddTimerNS ] ---

    /** {@code SDL_TimerID SDL_AddTimerNS(Uint64 interval, SDL_NSTimerCallback callback, void * userdata)} */
    public static int nSDL_AddTimerNS(long interval, long callback, long userdata) {
        long __functionAddress = Functions.AddTimerNS;
        return invokeJPPI(interval, callback, userdata, __functionAddress);
    }

    /** {@code SDL_TimerID SDL_AddTimerNS(Uint64 interval, SDL_NSTimerCallback callback, void * userdata)} */
    @NativeType("SDL_TimerID")
    public static int SDL_AddTimerNS(@NativeType("Uint64") long interval, @NativeType("SDL_NSTimerCallback") SDL_NSTimerCallbackI callback, @NativeType("void *") long userdata) {
        return nSDL_AddTimerNS(interval, callback.address(), userdata);
    }

    // --- [ SDL_RemoveTimer ] ---

    /** {@code bool SDL_RemoveTimer(SDL_TimerID id)} */
    @NativeType("bool")
    public static boolean SDL_RemoveTimer(@NativeType("SDL_TimerID") int id) {
        long __functionAddress = Functions.RemoveTimer;
        return invokeZ(id, __functionAddress);
    }

    // --- [ SDL_SECONDS_TO_NS ] ---

    /** {@code Uint64 SDL_SECONDS_TO_NS(Uint64 S)} */
    @NativeType("Uint64")
    public static long SDL_SECONDS_TO_NS(@NativeType("Uint64") long S) {
        return S * SDL_NS_PER_SECOND;
    }

    // --- [ SDL_NS_TO_SECONDS ] ---

    /** {@code Uint64 SDL_NS_TO_SECONDS(Uint64 NS)} */
    @NativeType("Uint64")
    public static long SDL_NS_TO_SECONDS(@NativeType("Uint64") long NS) {
        return NS / SDL_NS_PER_SECOND;
    }

    // --- [ SDL_MS_TO_NS ] ---

    /** {@code Uint64 SDL_MS_TO_NS(Uint64 MS)} */
    @NativeType("Uint64")
    public static long SDL_MS_TO_NS(@NativeType("Uint64") long MS) {
        return MS * SDL_NS_PER_MS;
    }

    // --- [ SDL_NS_TO_MS ] ---

    /** {@code Uint64 SDL_NS_TO_MS(Uint64 NS)} */
    @NativeType("Uint64")
    public static long SDL_NS_TO_MS(@NativeType("Uint64") long NS) {
        return NS / SDL_NS_PER_MS;
    }

    // --- [ SDL_US_TO_NS ] ---

    /** {@code Uint64 SDL_US_TO_NS(Uint64 US)} */
    @NativeType("Uint64")
    public static long SDL_US_TO_NS(@NativeType("Uint64") long US) {
        return US * SDL_NS_PER_US;
    }

    // --- [ SDL_NS_TO_US ] ---

    /** {@code Uint64 SDL_NS_TO_US(Uint64 NS)} */
    @NativeType("Uint64")
    public static long SDL_NS_TO_US(@NativeType("Uint64") long NS) {
        return NS / SDL_NS_PER_US;
    }

}