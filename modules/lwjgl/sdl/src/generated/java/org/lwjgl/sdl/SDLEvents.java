/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.sdl;

import org.jspecify.annotations.*;

import org.lwjgl.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.APIUtil.*;
import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.JNI.*;
import static org.lwjgl.system.MemoryUtil.*;

public class SDLEvents {

    /** Contains the function pointers loaded from {@code SDL.getLibrary()}. */
    public static final class Functions {

        private Functions() {}

        /** Function address. */
        public static final long
            PumpEvents         = apiGetFunctionAddress(SDL.getLibrary(), "SDL_PumpEvents"),
            PeepEvents         = apiGetFunctionAddress(SDL.getLibrary(), "SDL_PeepEvents"),
            HasEvent           = apiGetFunctionAddress(SDL.getLibrary(), "SDL_HasEvent"),
            HasEvents          = apiGetFunctionAddress(SDL.getLibrary(), "SDL_HasEvents"),
            FlushEvent         = apiGetFunctionAddress(SDL.getLibrary(), "SDL_FlushEvent"),
            FlushEvents        = apiGetFunctionAddress(SDL.getLibrary(), "SDL_FlushEvents"),
            PollEvent          = apiGetFunctionAddress(SDL.getLibrary(), "SDL_PollEvent"),
            WaitEvent          = apiGetFunctionAddress(SDL.getLibrary(), "SDL_WaitEvent"),
            WaitEventTimeout   = apiGetFunctionAddress(SDL.getLibrary(), "SDL_WaitEventTimeout"),
            PushEvent          = apiGetFunctionAddress(SDL.getLibrary(), "SDL_PushEvent"),
            SetEventFilter     = apiGetFunctionAddress(SDL.getLibrary(), "SDL_SetEventFilter"),
            GetEventFilter     = apiGetFunctionAddress(SDL.getLibrary(), "SDL_GetEventFilter"),
            AddEventWatch      = apiGetFunctionAddress(SDL.getLibrary(), "SDL_AddEventWatch"),
            RemoveEventWatch   = apiGetFunctionAddress(SDL.getLibrary(), "SDL_RemoveEventWatch"),
            FilterEvents       = apiGetFunctionAddress(SDL.getLibrary(), "SDL_FilterEvents"),
            SetEventEnabled    = apiGetFunctionAddress(SDL.getLibrary(), "SDL_SetEventEnabled"),
            EventEnabled       = apiGetFunctionAddress(SDL.getLibrary(), "SDL_EventEnabled"),
            RegisterEvents     = apiGetFunctionAddress(SDL.getLibrary(), "SDL_RegisterEvents"),
            GetWindowFromEvent = apiGetFunctionAddress(SDL.getLibrary(), "SDL_GetWindowFromEvent");

    }

    public static final int
        SDL_EVENT_FIRST                         = 0,
        SDL_EVENT_QUIT                          = 0x100,
        SDL_EVENT_TERMINATING                   = 0x101,
        SDL_EVENT_LOW_MEMORY                    = 0x102,
        SDL_EVENT_WILL_ENTER_BACKGROUND         = 0x103,
        SDL_EVENT_DID_ENTER_BACKGROUND          = 0x104,
        SDL_EVENT_WILL_ENTER_FOREGROUND         = 0x105,
        SDL_EVENT_DID_ENTER_FOREGROUND          = 0x106,
        SDL_EVENT_LOCALE_CHANGED                = 0x107,
        SDL_EVENT_SYSTEM_THEME_CHANGED          = 0x108,
        SDL_EVENT_DISPLAY_ORIENTATION           = 0x151,
        SDL_EVENT_DISPLAY_ADDED                 = 0x152,
        SDL_EVENT_DISPLAY_REMOVED               = 0x153,
        SDL_EVENT_DISPLAY_MOVED                 = 0x154,
        SDL_EVENT_DISPLAY_DESKTOP_MODE_CHANGED  = 0x155,
        SDL_EVENT_DISPLAY_CURRENT_MODE_CHANGED  = 0x156,
        SDL_EVENT_DISPLAY_CONTENT_SCALE_CHANGED = 0x157,
        SDL_EVENT_DISPLAY_FIRST                 = SDL_EVENT_DISPLAY_ORIENTATION,
        SDL_EVENT_DISPLAY_LAST                  = SDL_EVENT_DISPLAY_CONTENT_SCALE_CHANGED,
        SDL_EVENT_WINDOW_SHOWN                  = 0x202,
        SDL_EVENT_WINDOW_HIDDEN                 = 0x203,
        SDL_EVENT_WINDOW_EXPOSED                = 0x204,
        SDL_EVENT_WINDOW_MOVED                  = 0x205,
        SDL_EVENT_WINDOW_RESIZED                = 0x206,
        SDL_EVENT_WINDOW_PIXEL_SIZE_CHANGED     = 0x207,
        SDL_EVENT_WINDOW_METAL_VIEW_RESIZED     = 0x208,
        SDL_EVENT_WINDOW_MINIMIZED              = 0x209,
        SDL_EVENT_WINDOW_MAXIMIZED              = 0x20A,
        SDL_EVENT_WINDOW_RESTORED               = 0x20B,
        SDL_EVENT_WINDOW_MOUSE_ENTER            = 0x20C,
        SDL_EVENT_WINDOW_MOUSE_LEAVE            = 0x20D,
        SDL_EVENT_WINDOW_FOCUS_GAINED           = 0x20E,
        SDL_EVENT_WINDOW_FOCUS_LOST             = 0x20F,
        SDL_EVENT_WINDOW_CLOSE_REQUESTED        = 0x210,
        SDL_EVENT_WINDOW_HIT_TEST               = 0x211,
        SDL_EVENT_WINDOW_ICCPROF_CHANGED        = 0x212,
        SDL_EVENT_WINDOW_DISPLAY_CHANGED        = 0x213,
        SDL_EVENT_WINDOW_DISPLAY_SCALE_CHANGED  = 0x214,
        SDL_EVENT_WINDOW_SAFE_AREA_CHANGED      = 0x215,
        SDL_EVENT_WINDOW_OCCLUDED               = 0x216,
        SDL_EVENT_WINDOW_ENTER_FULLSCREEN       = 0x217,
        SDL_EVENT_WINDOW_LEAVE_FULLSCREEN       = 0x218,
        SDL_EVENT_WINDOW_DESTROYED              = 0x219,
        SDL_EVENT_WINDOW_HDR_STATE_CHANGED      = 0x21A,
        SDL_EVENT_WINDOW_FIRST                  = SDL_EVENT_WINDOW_SHOWN,
        SDL_EVENT_WINDOW_LAST                   = SDL_EVENT_WINDOW_HDR_STATE_CHANGED,
        SDL_EVENT_KEY_DOWN                      = 0x300,
        SDL_EVENT_KEY_UP                        = 0x301,
        SDL_EVENT_TEXT_EDITING                  = 0x302,
        SDL_EVENT_TEXT_INPUT                    = 0x303,
        SDL_EVENT_KEYMAP_CHANGED                = 0x304,
        SDL_EVENT_KEYBOARD_ADDED                = 0x305,
        SDL_EVENT_KEYBOARD_REMOVED              = 0x306,
        SDL_EVENT_TEXT_EDITING_CANDIDATES       = 0x307,
        SDL_EVENT_MOUSE_MOTION                  = 0x400,
        SDL_EVENT_MOUSE_BUTTON_DOWN             = 0x401,
        SDL_EVENT_MOUSE_BUTTON_UP               = 0x402,
        SDL_EVENT_MOUSE_WHEEL                   = 0x403,
        SDL_EVENT_MOUSE_ADDED                   = 0x404,
        SDL_EVENT_MOUSE_REMOVED                 = 0x405,
        SDL_EVENT_JOYSTICK_AXIS_MOTION          = 0x600,
        SDL_EVENT_JOYSTICK_BALL_MOTION          = 0x601,
        SDL_EVENT_JOYSTICK_HAT_MOTION           = 0x602,
        SDL_EVENT_JOYSTICK_BUTTON_DOWN          = 0x603,
        SDL_EVENT_JOYSTICK_BUTTON_UP            = 0x604,
        SDL_EVENT_JOYSTICK_ADDED                = 0x605,
        SDL_EVENT_JOYSTICK_REMOVED              = 0x606,
        SDL_EVENT_JOYSTICK_BATTERY_UPDATED      = 0x607,
        SDL_EVENT_JOYSTICK_UPDATE_COMPLETE      = 0x608,
        SDL_EVENT_GAMEPAD_AXIS_MOTION           = 0x650,
        SDL_EVENT_GAMEPAD_BUTTON_DOWN           = 0x651,
        SDL_EVENT_GAMEPAD_BUTTON_UP             = 0x652,
        SDL_EVENT_GAMEPAD_ADDED                 = 0x653,
        SDL_EVENT_GAMEPAD_REMOVED               = 0x654,
        SDL_EVENT_GAMEPAD_REMAPPED              = 0x655,
        SDL_EVENT_GAMEPAD_TOUCHPAD_DOWN         = 0x656,
        SDL_EVENT_GAMEPAD_TOUCHPAD_MOTION       = 0x657,
        SDL_EVENT_GAMEPAD_TOUCHPAD_UP           = 0x658,
        SDL_EVENT_GAMEPAD_SENSOR_UPDATE         = 0x659,
        SDL_EVENT_GAMEPAD_UPDATE_COMPLETE       = 0x65A,
        SDL_EVENT_GAMEPAD_STEAM_HANDLE_UPDATED  = 0x65B,
        SDL_EVENT_FINGER_DOWN                   = 0x700,
        SDL_EVENT_FINGER_UP                     = 0x701,
        SDL_EVENT_FINGER_MOTION                 = 0x702,
        SDL_EVENT_FINGER_CANCELED               = 0x703,
        SDL_EVENT_CLIPBOARD_UPDATE              = 0x900,
        SDL_EVENT_DROP_FILE                     = 0x1000,
        SDL_EVENT_DROP_TEXT                     = 0x1001,
        SDL_EVENT_DROP_BEGIN                    = 0x1002,
        SDL_EVENT_DROP_COMPLETE                 = 0x1003,
        SDL_EVENT_DROP_POSITION                 = 0x1004,
        SDL_EVENT_AUDIO_DEVICE_ADDED            = 0x1100,
        SDL_EVENT_AUDIO_DEVICE_REMOVED          = 0x1101,
        SDL_EVENT_AUDIO_DEVICE_FORMAT_CHANGED   = 0x1102,
        SDL_EVENT_SENSOR_UPDATE                 = 0x1200,
        SDL_EVENT_PEN_PROXIMITY_IN              = 0x1300,
        SDL_EVENT_PEN_PROXIMITY_OUT             = 0x1301,
        SDL_EVENT_PEN_DOWN                      = 0x1302,
        SDL_EVENT_PEN_UP                        = 0x1303,
        SDL_EVENT_PEN_BUTTON_DOWN               = 0x1304,
        SDL_EVENT_PEN_BUTTON_UP                 = 0x1305,
        SDL_EVENT_PEN_MOTION                    = 0x1306,
        SDL_EVENT_PEN_AXIS                      = 0x1307,
        SDL_EVENT_CAMERA_DEVICE_ADDED           = 0x1400,
        SDL_EVENT_CAMERA_DEVICE_REMOVED         = 0x1401,
        SDL_EVENT_CAMERA_DEVICE_APPROVED        = 0x1402,
        SDL_EVENT_CAMERA_DEVICE_DENIED          = 0x1403,
        SDL_EVENT_RENDER_TARGETS_RESET          = 0x2000,
        SDL_EVENT_RENDER_DEVICE_RESET           = 0x2001,
        SDL_EVENT_RENDER_DEVICE_LOST            = 0x2002,
        SDL_EVENT_PRIVATE0                      = 0x4000,
        SDL_EVENT_PRIVATE1                      = 0x4001,
        SDL_EVENT_PRIVATE2                      = 0x4002,
        SDL_EVENT_PRIVATE3                      = 0x4003,
        SDL_EVENT_POLL_SENTINEL                 = 0x7F00,
        SDL_EVENT_USER                          = 0x8000,
        SDL_EVENT_LAST                          = 0xFFFF,
        SDL_EVENT_ENUM_PADDING                  = 0x7FFFFFFF;

    public static final int
        SDL_ADDEVENT  = 0,
        SDL_PEEKEVENT = 1,
        SDL_GETEVENT  = 2;

    protected SDLEvents() {
        throw new UnsupportedOperationException();
    }

    // --- [ SDL_PumpEvents ] ---

    /** {@code void SDL_PumpEvents(void)} */
    public static void SDL_PumpEvents() {
        long __functionAddress = Functions.PumpEvents;
        invokeV(__functionAddress);
    }

    // --- [ SDL_PeepEvents ] ---

    /** {@code int SDL_PeepEvents(SDL_Event * events, int numevents, SDL_EventAction action, Uint32 minType, Uint32 maxType)} */
    public static int nSDL_PeepEvents(long events, int numevents, int action, int minType, int maxType) {
        long __functionAddress = Functions.PeepEvents;
        return invokePI(events, numevents, action, minType, maxType, __functionAddress);
    }

    /** {@code int SDL_PeepEvents(SDL_Event * events, int numevents, SDL_EventAction action, Uint32 minType, Uint32 maxType)} */
    public static int SDL_PeepEvents(@NativeType("SDL_Event *") SDL_Event.@Nullable Buffer events, @NativeType("SDL_EventAction") int action, @NativeType("Uint32") int minType, @NativeType("Uint32") int maxType) {
        return nSDL_PeepEvents(memAddressSafe(events), remainingSafe(events), action, minType, maxType);
    }

    // --- [ SDL_HasEvent ] ---

    /** {@code bool SDL_HasEvent(Uint32 type)} */
    @NativeType("bool")
    public static boolean SDL_HasEvent(@NativeType("Uint32") int type) {
        long __functionAddress = Functions.HasEvent;
        return invokeZ(type, __functionAddress);
    }

    // --- [ SDL_HasEvents ] ---

    /** {@code bool SDL_HasEvents(Uint32 minType, Uint32 maxType)} */
    @NativeType("bool")
    public static boolean SDL_HasEvents(@NativeType("Uint32") int minType, @NativeType("Uint32") int maxType) {
        long __functionAddress = Functions.HasEvents;
        return invokeZ(minType, maxType, __functionAddress);
    }

    // --- [ SDL_FlushEvent ] ---

    /** {@code void SDL_FlushEvent(Uint32 type)} */
    public static void SDL_FlushEvent(@NativeType("Uint32") int type) {
        long __functionAddress = Functions.FlushEvent;
        invokeV(type, __functionAddress);
    }

    // --- [ SDL_FlushEvents ] ---

    /** {@code void SDL_FlushEvents(Uint32 minType, Uint32 maxType)} */
    public static void SDL_FlushEvents(@NativeType("Uint32") int minType, @NativeType("Uint32") int maxType) {
        long __functionAddress = Functions.FlushEvents;
        invokeV(minType, maxType, __functionAddress);
    }

    // --- [ SDL_PollEvent ] ---

    /** {@code bool SDL_PollEvent(SDL_Event * event)} */
    public static boolean nSDL_PollEvent(long event) {
        long __functionAddress = Functions.PollEvent;
        return invokePZ(event, __functionAddress);
    }

    /** {@code bool SDL_PollEvent(SDL_Event * event)} */
    @NativeType("bool")
    public static boolean SDL_PollEvent(@NativeType("SDL_Event *") @Nullable SDL_Event event) {
        return nSDL_PollEvent(memAddressSafe(event));
    }

    // --- [ SDL_WaitEvent ] ---

    /** {@code bool SDL_WaitEvent(SDL_Event * event)} */
    public static boolean nSDL_WaitEvent(long event) {
        long __functionAddress = Functions.WaitEvent;
        return invokePZ(event, __functionAddress);
    }

    /** {@code bool SDL_WaitEvent(SDL_Event * event)} */
    @NativeType("bool")
    public static boolean SDL_WaitEvent(@NativeType("SDL_Event *") @Nullable SDL_Event event) {
        return nSDL_WaitEvent(memAddressSafe(event));
    }

    // --- [ SDL_WaitEventTimeout ] ---

    /** {@code bool SDL_WaitEventTimeout(SDL_Event * event, Sint32 timeoutMS)} */
    public static boolean nSDL_WaitEventTimeout(long event, int timeoutMS) {
        long __functionAddress = Functions.WaitEventTimeout;
        return invokePZ(event, timeoutMS, __functionAddress);
    }

    /** {@code bool SDL_WaitEventTimeout(SDL_Event * event, Sint32 timeoutMS)} */
    @NativeType("bool")
    public static boolean SDL_WaitEventTimeout(@NativeType("SDL_Event *") @Nullable SDL_Event event, @NativeType("Sint32") int timeoutMS) {
        return nSDL_WaitEventTimeout(memAddressSafe(event), timeoutMS);
    }

    // --- [ SDL_PushEvent ] ---

    /** {@code bool SDL_PushEvent(SDL_Event * event)} */
    public static boolean nSDL_PushEvent(long event) {
        long __functionAddress = Functions.PushEvent;
        return invokePZ(event, __functionAddress);
    }

    /** {@code bool SDL_PushEvent(SDL_Event * event)} */
    @NativeType("bool")
    public static boolean SDL_PushEvent(@NativeType("SDL_Event *") SDL_Event event) {
        return nSDL_PushEvent(event.address());
    }

    // --- [ SDL_SetEventFilter ] ---

    /** {@code void SDL_SetEventFilter(SDL_EventFilter filter, void * userdata)} */
    public static void nSDL_SetEventFilter(long filter, long userdata) {
        long __functionAddress = Functions.SetEventFilter;
        invokePPV(filter, userdata, __functionAddress);
    }

    /** {@code void SDL_SetEventFilter(SDL_EventFilter filter, void * userdata)} */
    public static void SDL_SetEventFilter(@NativeType("SDL_EventFilter") @Nullable SDL_EventFilterI filter, @NativeType("void *") long userdata) {
        nSDL_SetEventFilter(memAddressSafe(filter), userdata);
    }

    // --- [ SDL_GetEventFilter ] ---

    /** {@code bool SDL_GetEventFilter(SDL_EventFilter * filter, void ** userdata)} */
    public static boolean nSDL_GetEventFilter(long filter, long userdata) {
        long __functionAddress = Functions.GetEventFilter;
        return invokePPZ(filter, userdata, __functionAddress);
    }

    /** {@code bool SDL_GetEventFilter(SDL_EventFilter * filter, void ** userdata)} */
    @NativeType("bool")
    public static boolean SDL_GetEventFilter(@NativeType("SDL_EventFilter *") @Nullable PointerBuffer filter, @NativeType("void **") @Nullable PointerBuffer userdata) {
        if (CHECKS) {
            checkSafe(filter, 1);
            checkSafe(userdata, 1);
        }
        return nSDL_GetEventFilter(memAddressSafe(filter), memAddressSafe(userdata));
    }

    // --- [ SDL_AddEventWatch ] ---

    /** {@code bool SDL_AddEventWatch(SDL_EventFilter filter, void * userdata)} */
    public static boolean nSDL_AddEventWatch(long filter, long userdata) {
        long __functionAddress = Functions.AddEventWatch;
        return invokePPZ(filter, userdata, __functionAddress);
    }

    /** {@code bool SDL_AddEventWatch(SDL_EventFilter filter, void * userdata)} */
    @NativeType("bool")
    public static boolean SDL_AddEventWatch(@NativeType("SDL_EventFilter") SDL_EventFilterI filter, @NativeType("void *") long userdata) {
        return nSDL_AddEventWatch(filter.address(), userdata);
    }

    // --- [ SDL_RemoveEventWatch ] ---

    /** {@code void SDL_RemoveEventWatch(SDL_EventFilter filter, void * userdata)} */
    public static void nSDL_RemoveEventWatch(long filter, long userdata) {
        long __functionAddress = Functions.RemoveEventWatch;
        invokePPV(filter, userdata, __functionAddress);
    }

    /** {@code void SDL_RemoveEventWatch(SDL_EventFilter filter, void * userdata)} */
    public static void SDL_RemoveEventWatch(@NativeType("SDL_EventFilter") SDL_EventFilterI filter, @NativeType("void *") long userdata) {
        nSDL_RemoveEventWatch(filter.address(), userdata);
    }

    // --- [ SDL_FilterEvents ] ---

    /** {@code void SDL_FilterEvents(SDL_EventFilter filter, void * userdata)} */
    public static void nSDL_FilterEvents(long filter, long userdata) {
        long __functionAddress = Functions.FilterEvents;
        invokePPV(filter, userdata, __functionAddress);
    }

    /** {@code void SDL_FilterEvents(SDL_EventFilter filter, void * userdata)} */
    public static void SDL_FilterEvents(@NativeType("SDL_EventFilter") SDL_EventFilterI filter, @NativeType("void *") long userdata) {
        nSDL_FilterEvents(filter.address(), userdata);
    }

    // --- [ SDL_SetEventEnabled ] ---

    /** {@code void SDL_SetEventEnabled(Uint32 type, bool enabled)} */
    public static void SDL_SetEventEnabled(@NativeType("Uint32") int type, @NativeType("bool") boolean enabled) {
        long __functionAddress = Functions.SetEventEnabled;
        invokeV(type, enabled, __functionAddress);
    }

    // --- [ SDL_EventEnabled ] ---

    /** {@code bool SDL_EventEnabled(Uint32 type)} */
    @NativeType("bool")
    public static boolean SDL_EventEnabled(@NativeType("Uint32") int type) {
        long __functionAddress = Functions.EventEnabled;
        return invokeZ(type, __functionAddress);
    }

    // --- [ SDL_RegisterEvents ] ---

    /** {@code Uint32 SDL_RegisterEvents(int numevents)} */
    @NativeType("Uint32")
    public static int SDL_RegisterEvents(int numevents) {
        long __functionAddress = Functions.RegisterEvents;
        return invokeI(numevents, __functionAddress);
    }

    // --- [ SDL_GetWindowFromEvent ] ---

    /** {@code SDL_Window * SDL_GetWindowFromEvent(SDL_Event const * event)} */
    public static long nSDL_GetWindowFromEvent(long event) {
        long __functionAddress = Functions.GetWindowFromEvent;
        return invokePP(event, __functionAddress);
    }

    /** {@code SDL_Window * SDL_GetWindowFromEvent(SDL_Event const * event)} */
    @NativeType("SDL_Window *")
    public static long SDL_GetWindowFromEvent(@NativeType("SDL_Event const *") SDL_Event event) {
        return nSDL_GetWindowFromEvent(event.address());
    }

}