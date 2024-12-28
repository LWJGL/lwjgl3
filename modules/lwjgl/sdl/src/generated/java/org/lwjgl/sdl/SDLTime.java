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
import static org.lwjgl.system.MemoryUtil.*;

public class SDLTime {

    /** Contains the function pointers loaded from {@code SDL.getLibrary()}. */
    public static final class Functions {

        private Functions() {}

        /** Function address. */
        public static final long
            GetDateTimeLocalePreferences = apiGetFunctionAddress(SDL.getLibrary(), "SDL_GetDateTimeLocalePreferences"),
            GetCurrentTime               = apiGetFunctionAddress(SDL.getLibrary(), "SDL_GetCurrentTime"),
            TimeToDateTime               = apiGetFunctionAddress(SDL.getLibrary(), "SDL_TimeToDateTime"),
            DateTimeToTime               = apiGetFunctionAddress(SDL.getLibrary(), "SDL_DateTimeToTime"),
            TimeToWindows                = apiGetFunctionAddress(SDL.getLibrary(), "SDL_TimeToWindows"),
            TimeFromWindows              = apiGetFunctionAddress(SDL.getLibrary(), "SDL_TimeFromWindows"),
            GetDaysInMonth               = apiGetFunctionAddress(SDL.getLibrary(), "SDL_GetDaysInMonth"),
            GetDayOfYear                 = apiGetFunctionAddress(SDL.getLibrary(), "SDL_GetDayOfYear"),
            GetDayOfWeek                 = apiGetFunctionAddress(SDL.getLibrary(), "SDL_GetDayOfWeek");

    }

    public static final int
        SDL_DATE_FORMAT_YYYYMMDD = 0,
        SDL_DATE_FORMAT_DDMMYYYY = 1,
        SDL_DATE_FORMAT_MMDDYYYY = 2;

    public static final int
        SDL_TIME_FORMAT_24HR = 0,
        SDL_TIME_FORMAT_12HR = 1;

    protected SDLTime() {
        throw new UnsupportedOperationException();
    }

    // --- [ SDL_GetDateTimeLocalePreferences ] ---

    /** {@code bool SDL_GetDateTimeLocalePreferences(SDL_DateFormat * dateFormat, SDL_TimeFormat * timeFormat)} */
    public static boolean nSDL_GetDateTimeLocalePreferences(long dateFormat, long timeFormat) {
        long __functionAddress = Functions.GetDateTimeLocalePreferences;
        return invokePPZ(dateFormat, timeFormat, __functionAddress);
    }

    /** {@code bool SDL_GetDateTimeLocalePreferences(SDL_DateFormat * dateFormat, SDL_TimeFormat * timeFormat)} */
    @NativeType("bool")
    public static boolean SDL_GetDateTimeLocalePreferences(@NativeType("SDL_DateFormat *") @Nullable IntBuffer dateFormat, @NativeType("SDL_TimeFormat *") @Nullable IntBuffer timeFormat) {
        if (CHECKS) {
            checkSafe(dateFormat, 1);
            checkSafe(timeFormat, 1);
        }
        return nSDL_GetDateTimeLocalePreferences(memAddressSafe(dateFormat), memAddressSafe(timeFormat));
    }

    // --- [ SDL_GetCurrentTime ] ---

    /** {@code bool SDL_GetCurrentTime(SDL_Time * ticks)} */
    public static boolean nSDL_GetCurrentTime(long ticks) {
        long __functionAddress = Functions.GetCurrentTime;
        return invokePZ(ticks, __functionAddress);
    }

    /** {@code bool SDL_GetCurrentTime(SDL_Time * ticks)} */
    @NativeType("bool")
    public static boolean SDL_GetCurrentTime(@NativeType("SDL_Time *") LongBuffer ticks) {
        if (CHECKS) {
            check(ticks, 1);
        }
        return nSDL_GetCurrentTime(memAddress(ticks));
    }

    // --- [ SDL_TimeToDateTime ] ---

    /** {@code bool SDL_TimeToDateTime(SDL_Time ticks, SDL_DateTime * dt, bool localTime)} */
    public static boolean nSDL_TimeToDateTime(long ticks, long dt, boolean localTime) {
        long __functionAddress = Functions.TimeToDateTime;
        return invokeJPZ(ticks, dt, localTime, __functionAddress);
    }

    /** {@code bool SDL_TimeToDateTime(SDL_Time ticks, SDL_DateTime * dt, bool localTime)} */
    @NativeType("bool")
    public static boolean SDL_TimeToDateTime(@NativeType("SDL_Time") long ticks, @NativeType("SDL_DateTime *") SDL_DateTime dt, @NativeType("bool") boolean localTime) {
        return nSDL_TimeToDateTime(ticks, dt.address(), localTime);
    }

    // --- [ SDL_DateTimeToTime ] ---

    /** {@code bool SDL_DateTimeToTime(SDL_DateTime const * dt, SDL_Time * ticks)} */
    public static boolean nSDL_DateTimeToTime(long dt, long ticks) {
        long __functionAddress = Functions.DateTimeToTime;
        return invokePPZ(dt, ticks, __functionAddress);
    }

    /** {@code bool SDL_DateTimeToTime(SDL_DateTime const * dt, SDL_Time * ticks)} */
    @NativeType("bool")
    public static boolean SDL_DateTimeToTime(@NativeType("SDL_DateTime const *") SDL_DateTime dt, @NativeType("SDL_Time *") LongBuffer ticks) {
        if (CHECKS) {
            check(ticks, 1);
        }
        return nSDL_DateTimeToTime(dt.address(), memAddress(ticks));
    }

    // --- [ SDL_TimeToWindows ] ---

    /** {@code void SDL_TimeToWindows(SDL_Time ticks, Uint32 * dwLowDateTime, Uint32 * dwHighDateTime)} */
    public static void nSDL_TimeToWindows(long ticks, long dwLowDateTime, long dwHighDateTime) {
        long __functionAddress = Functions.TimeToWindows;
        invokeJPPV(ticks, dwLowDateTime, dwHighDateTime, __functionAddress);
    }

    /** {@code void SDL_TimeToWindows(SDL_Time ticks, Uint32 * dwLowDateTime, Uint32 * dwHighDateTime)} */
    public static void SDL_TimeToWindows(@NativeType("SDL_Time") long ticks, @NativeType("Uint32 *") @Nullable IntBuffer dwLowDateTime, @NativeType("Uint32 *") @Nullable IntBuffer dwHighDateTime) {
        if (CHECKS) {
            checkSafe(dwLowDateTime, 1);
            checkSafe(dwHighDateTime, 1);
        }
        nSDL_TimeToWindows(ticks, memAddressSafe(dwLowDateTime), memAddressSafe(dwHighDateTime));
    }

    // --- [ SDL_TimeFromWindows ] ---

    /** {@code SDL_Time SDL_TimeFromWindows(Uint32 dwLowDateTime, Uint32 dwHighDateTime)} */
    @NativeType("SDL_Time")
    public static long SDL_TimeFromWindows(@NativeType("Uint32") int dwLowDateTime, @NativeType("Uint32") int dwHighDateTime) {
        long __functionAddress = Functions.TimeFromWindows;
        return invokeJ(dwLowDateTime, dwHighDateTime, __functionAddress);
    }

    // --- [ SDL_GetDaysInMonth ] ---

    /** {@code int SDL_GetDaysInMonth(int year, int month)} */
    public static int SDL_GetDaysInMonth(int year, int month) {
        long __functionAddress = Functions.GetDaysInMonth;
        return invokeI(year, month, __functionAddress);
    }

    // --- [ SDL_GetDayOfYear ] ---

    /** {@code int SDL_GetDayOfYear(int year, int month, int day)} */
    public static int SDL_GetDayOfYear(int year, int month, int day) {
        long __functionAddress = Functions.GetDayOfYear;
        return invokeI(year, month, day, __functionAddress);
    }

    // --- [ SDL_GetDayOfWeek ] ---

    /** {@code int SDL_GetDayOfWeek(int year, int month, int day)} */
    public static int SDL_GetDayOfWeek(int year, int month, int day) {
        long __functionAddress = Functions.GetDayOfWeek;
        return invokeI(year, month, day, __functionAddress);
    }

}