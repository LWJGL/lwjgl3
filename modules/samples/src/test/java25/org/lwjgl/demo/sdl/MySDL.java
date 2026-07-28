/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package org.lwjgl.demo.sdl;

import org.jspecify.annotations.*;
import org.lwjgl.system.ffm.*;
import org.lwjgl.system.ffm.mapping.*;

import static org.lwjgl.demo.sdl.MySDL.SDL_CommonEvent.*;
import static org.lwjgl.demo.sdl.MySDL.SDL_DisplayEvent.*;
import static org.lwjgl.system.ffm.FFM.*;

@NullMarked
public interface MySDL {

    Mapping.Short Sint16 = int16_t.typedef("Sint16");
    Mapping.Int   Sint32 = int32_t.typedef("Sint32");
    Mapping.Long  Sint64 = int64_t.typedef("Sint64");
    Mapping.Byte  Sint8  = int8_t.typedef("Sint8");
    Mapping.Short Uint16 = uint16_t.typedef("Uint16");
    Mapping.Int   Uint32 = uint32_t.typedef("Uint32");
    Mapping.Long  Uint64 = uint64_t.typedef("Uint64");
    Mapping.Byte  Uint8  = uint8_t.typedef("Uint8");

    Mapping.Int SDL_EventType = int32_t.typedef("SDL_EventType");
    Mapping.Int SDL_DisplayID = uint32_t.typedef("SDL_DisplayID");

    interface SDL_CommonEvent {
        StructBinder<SDL_CommonEvent> SDL_CommonEvent = ffmStruct(SDL_CommonEvent.class)
            .m("type", Uint32)
            .m("reserved", Uint32)
            .m("timestamp", Uint64)
            .build();

        int type();
        long timestamp();

        SDL_CommonEvent type(int type);
        SDL_CommonEvent timestamp(long timestamp);
    }

    interface SDL_DisplayEvent {
        StructBinder<SDL_DisplayEvent> SDL_DisplayEvent = ffmStruct(SDL_DisplayEvent.class)
            .m("type", SDL_EventType)
            .m("reserved", Uint32)
            .m("timestamp", Uint64)
            .m("displayID", SDL_DisplayID)
            .m("data1", Sint32)
            .m("data2", Sint32)
            .build();

        int type();
        long timestamp();
        int displayID();
        int data1();
        int data2();

        SDL_DisplayEvent type(int type);
        SDL_DisplayEvent timestamp(long timestamp);
        SDL_DisplayEvent displayID(int displayID);
        SDL_DisplayEvent data1(int data1);
        SDL_DisplayEvent data2(int data2);
    }

    // more struct types here

    interface SDL_Event {
        UnionBinder<SDL_Event> SDL_Event = ffmUnion(SDL_Event.class)
            .m("type", Uint32)
            .m("common", SDL_CommonEvent)
            .m("display", SDL_DisplayEvent)
//            .m("kdevice", SDL_KeyboardDeviceEvent.$)
//            .m("key", SDL_KeyboardEvent.$)
//            .m("edit", SDL_TextEditingEvent.$)
//            .m("edit_candidates", SDL_TextEditingCandidatesEvent.$)
//            .m("text", SDL_TextInputEvent.$)
//            .m("mdevice", SDL_MouseDeviceEvent.$)
//            .m("motion", SDL_MouseMotionEvent.$)
//            .m("button", SDL_MouseButtonEvent.$)
//            .m("wheel", SDL_MouseWheelEvent.$)
//            .m("jdevice", SDL_JoyDeviceEvent.$)
//            .m("jaxis", SDL_JoyAxisEvent.$)
//            .m("jball", SDL_JoyBallEvent.$)
//            .m("jhat", SDL_JoyHatEvent.$)
//            .m("jbutton", SDL_JoyButtonEvent.$)
//            .m("jbattery", SDL_JoyBatteryEvent.$)
//            .m("gdevice", SDL_GamepadDeviceEvent.$)
//            .m("gaxis", SDL_GamepadAxisEvent.$)
//            .m("gbutton", SDL_GamepadButtonEvent.$)
//            .m("gtouchpad", SDL_GamepadTouchpadEvent.$)
//            .m("gsensor", SDL_GamepadSensorEvent.$)
//            .m("adevice", SDL_AudioDeviceEvent.$)
//            .m("cdevice", SDL_CameraDeviceEvent.$)
//            .m("sensor", SDL_SensorEvent.$)
//            .m("quit", SDL_QuitEvent.$)
//            .m("user", SDL_UserEvent.$)
//            .m("tfinger", SDL_TouchFingerEvent.$)
//            .m("pproximity", SDL_PenProximityEvent.$)
//            .m("ptouch", SDL_PenTouchEvent.$)
//            .m("pmotion", SDL_PenMotionEvent.$)
//            .m("pbutton", SDL_PenButtonEvent.$)
//            .m("paxis", SDL_PenAxisEvent.$)
//            .m("render", SDL_RenderEvent.$)
//            .m("drop", SDL_DropEvent.$)
//            .m("clipboard", SDL_ClipboardEvent.$)
            .m("padding", Uint8.array(128))
            .build();

        int type();
        SDL_CommonEvent common();
        SDL_DisplayEvent display();
//        SDL_KeyboardDeviceEvent kdevice();
//        SDL_KeyboardEvent key();
//        SDL_TextEditingEvent edit();
//        SDL_TextEditingCandidatesEvent edit_candidates();
//        SDL_TextInputEvent text();
//        SDL_MouseDeviceEvent mdevice();
//        SDL_MouseMotionEvent motion();
//        SDL_MouseButtonEvent button();
//        SDL_MouseWheelEvent wheel();
//        SDL_JoyDeviceEvent jdevice();
//        SDL_JoyAxisEvent jaxis();
//        SDL_JoyBallEvent jball();
//        SDL_JoyHatEvent jhat();
//        SDL_JoyButtonEvent jbutton();
//        SDL_JoyBatteryEvent jbattery();
//        SDL_GamepadDeviceEvent gdevice();
//        SDL_GamepadAxisEvent gaxis();
//        SDL_GamepadButtonEvent gbutton();
//        SDL_GamepadTouchpadEvent gtouchpad();
//        SDL_GamepadSensorEvent gsensor();
//        SDL_AudioDeviceEvent adevice();
//        SDL_CameraDeviceEvent cdevice();
//        SDL_SensorEvent sensor();
//        SDL_QuitEvent quit();
//        SDL_UserEvent user();
//        SDL_TouchFingerEvent tfinger();
//        SDL_PenProximityEvent pproximity();
//        SDL_PenTouchEvent ptouch();
//        SDL_PenMotionEvent pmotion();
//        SDL_PenButtonEvent pbutton();
//        SDL_PenAxisEvent paxis();
//        SDL_RenderEvent render();
//        SDL_DropEvent drop();
//        SDL_ClipboardEvent clipboard();

        SDL_Event type(int type);
        SDL_Event common(SDL_CommonEvent common);
        SDL_Event display(SDL_DisplayEvent display);
//        SDL_Event kdevice(SDL_KeyboardDeviceEvent kdevice);
//        SDL_Event key(SDL_KeyboardEvent key);
//        SDL_Event edit(SDL_TextEditingEvent edit);
//        SDL_Event edit_candidates(SDL_TextEditingCandidatesEvent edit_candidates);
//        SDL_Event text(SDL_TextInputEvent text);
//        SDL_Event mdevice(SDL_MouseDeviceEvent mdevice);
//        SDL_Event motion(SDL_MouseMotionEvent motion);
//        SDL_Event button(SDL_MouseButtonEvent button);
//        SDL_Event wheel(SDL_MouseWheelEvent wheel);
//        SDL_Event jdevice(SDL_JoyDeviceEvent jdevice);
//        SDL_Event jaxis(SDL_JoyAxisEvent jaxis);
//        SDL_Event jball(SDL_JoyBallEvent jball);
//        SDL_Event jhat(SDL_JoyHatEvent jhat);
//        SDL_Event jbutton(SDL_JoyButtonEvent jbutton);
//        SDL_Event jbattery(SDL_JoyBatteryEvent jbattery);
//        SDL_Event gdevice(SDL_GamepadDeviceEvent gdevice);
//        SDL_Event gaxis(SDL_GamepadAxisEvent gaxis);
//        SDL_Event gbutton(SDL_GamepadButtonEvent gbutton);
//        SDL_Event gtouchpad(SDL_GamepadTouchpadEvent gtouchpad);
//        SDL_Event gsensor(SDL_GamepadSensorEvent gsensor);
//        SDL_Event adevice(SDL_AudioDeviceEvent adevice);
//        SDL_Event cdevice(SDL_CameraDeviceEvent cdevice);
//        SDL_Event sensor(SDL_SensorEvent sensor);
//        SDL_Event quit(SDL_QuitEvent quit);
//        SDL_Event user(SDL_UserEvent user);
//        SDL_Event tfinger(SDL_TouchFingerEvent tfinger);
//        SDL_Event pproximity(SDL_PenProximityEvent pproximity);
//        SDL_Event ptouch(SDL_PenTouchEvent ptouch);
//        SDL_Event pmotion(SDL_PenMotionEvent pmotion);
//        SDL_Event pbutton(SDL_PenButtonEvent pbutton);
//        SDL_Event paxis(SDL_PenAxisEvent paxis);
//        SDL_Event render(SDL_RenderEvent render);
//        SDL_Event drop(SDL_DropEvent drop);
//        SDL_Event clipboard(SDL_ClipboardEvent clipboard);
    }

}
