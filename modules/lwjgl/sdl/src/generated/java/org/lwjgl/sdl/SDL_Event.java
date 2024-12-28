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

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * <pre>{@code
 * union SDL_Event {
 *     Uint32 type;
 *     {@link SDL_CommonEvent SDL_CommonEvent} common;
 *     {@link SDL_DisplayEvent SDL_DisplayEvent} display;
 *     {@link SDL_WindowEvent SDL_WindowEvent} window;
 *     {@link SDL_KeyboardDeviceEvent SDL_KeyboardDeviceEvent} kdevice;
 *     {@link SDL_KeyboardEvent SDL_KeyboardEvent} key;
 *     {@link SDL_TextEditingEvent SDL_TextEditingEvent} edit;
 *     {@link SDL_TextEditingCandidatesEvent SDL_TextEditingCandidatesEvent} edit_candidates;
 *     {@link SDL_TextInputEvent SDL_TextInputEvent} text;
 *     {@link SDL_MouseDeviceEvent SDL_MouseDeviceEvent} mdevice;
 *     {@link SDL_MouseMotionEvent SDL_MouseMotionEvent} motion;
 *     {@link SDL_MouseButtonEvent SDL_MouseButtonEvent} button;
 *     {@link SDL_MouseWheelEvent SDL_MouseWheelEvent} wheel;
 *     {@link SDL_JoyDeviceEvent SDL_JoyDeviceEvent} jdevice;
 *     {@link SDL_JoyAxisEvent SDL_JoyAxisEvent} jaxis;
 *     {@link SDL_JoyBallEvent SDL_JoyBallEvent} jball;
 *     {@link SDL_JoyHatEvent SDL_JoyHatEvent} jhat;
 *     {@link SDL_JoyButtonEvent SDL_JoyButtonEvent} jbutton;
 *     {@link SDL_JoyBatteryEvent SDL_JoyBatteryEvent} jbattery;
 *     {@link SDL_GamepadDeviceEvent SDL_GamepadDeviceEvent} gdevice;
 *     {@link SDL_GamepadAxisEvent SDL_GamepadAxisEvent} gaxis;
 *     {@link SDL_GamepadButtonEvent SDL_GamepadButtonEvent} gbutton;
 *     {@link SDL_GamepadTouchpadEvent SDL_GamepadTouchpadEvent} gtouchpad;
 *     {@link SDL_GamepadSensorEvent SDL_GamepadSensorEvent} gsensor;
 *     {@link SDL_AudioDeviceEvent SDL_AudioDeviceEvent} adevice;
 *     {@link SDL_CameraDeviceEvent SDL_CameraDeviceEvent} cdevice;
 *     {@link SDL_SensorEvent SDL_SensorEvent} sensor;
 *     {@link SDL_QuitEvent SDL_QuitEvent} quit;
 *     {@link SDL_UserEvent SDL_UserEvent} user;
 *     {@link SDL_TouchFingerEvent SDL_TouchFingerEvent} tfinger;
 *     {@link SDL_PenProximityEvent SDL_PenProximityEvent} pproximity;
 *     {@link SDL_PenTouchEvent SDL_PenTouchEvent} ptouch;
 *     {@link SDL_PenMotionEvent SDL_PenMotionEvent} pmotion;
 *     {@link SDL_PenButtonEvent SDL_PenButtonEvent} pbutton;
 *     {@link SDL_PenAxisEvent SDL_PenAxisEvent} paxis;
 *     {@link SDL_RenderEvent SDL_RenderEvent} render;
 *     {@link SDL_DropEvent SDL_DropEvent} drop;
 *     {@link SDL_ClipboardEvent SDL_ClipboardEvent} clipboard;
 *     Uint8 padding[128];
 * }}</pre>
 */
public class SDL_Event extends Struct<SDL_Event> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        TYPE,
        COMMON,
        DISPLAY,
        WINDOW,
        KDEVICE,
        KEY,
        EDIT,
        EDIT_CANDIDATES,
        TEXT,
        MDEVICE,
        MOTION,
        BUTTON,
        WHEEL,
        JDEVICE,
        JAXIS,
        JBALL,
        JHAT,
        JBUTTON,
        JBATTERY,
        GDEVICE,
        GAXIS,
        GBUTTON,
        GTOUCHPAD,
        GSENSOR,
        ADEVICE,
        CDEVICE,
        SENSOR,
        QUIT,
        USER,
        TFINGER,
        PPROXIMITY,
        PTOUCH,
        PMOTION,
        PBUTTON,
        PAXIS,
        RENDER,
        DROP,
        CLIPBOARD,
        PADDING;

    static {
        Layout layout = __union(
            __member(4),
            __member(SDL_CommonEvent.SIZEOF, SDL_CommonEvent.ALIGNOF),
            __member(SDL_DisplayEvent.SIZEOF, SDL_DisplayEvent.ALIGNOF),
            __member(SDL_WindowEvent.SIZEOF, SDL_WindowEvent.ALIGNOF),
            __member(SDL_KeyboardDeviceEvent.SIZEOF, SDL_KeyboardDeviceEvent.ALIGNOF),
            __member(SDL_KeyboardEvent.SIZEOF, SDL_KeyboardEvent.ALIGNOF),
            __member(SDL_TextEditingEvent.SIZEOF, SDL_TextEditingEvent.ALIGNOF),
            __member(SDL_TextEditingCandidatesEvent.SIZEOF, SDL_TextEditingCandidatesEvent.ALIGNOF),
            __member(SDL_TextInputEvent.SIZEOF, SDL_TextInputEvent.ALIGNOF),
            __member(SDL_MouseDeviceEvent.SIZEOF, SDL_MouseDeviceEvent.ALIGNOF),
            __member(SDL_MouseMotionEvent.SIZEOF, SDL_MouseMotionEvent.ALIGNOF),
            __member(SDL_MouseButtonEvent.SIZEOF, SDL_MouseButtonEvent.ALIGNOF),
            __member(SDL_MouseWheelEvent.SIZEOF, SDL_MouseWheelEvent.ALIGNOF),
            __member(SDL_JoyDeviceEvent.SIZEOF, SDL_JoyDeviceEvent.ALIGNOF),
            __member(SDL_JoyAxisEvent.SIZEOF, SDL_JoyAxisEvent.ALIGNOF),
            __member(SDL_JoyBallEvent.SIZEOF, SDL_JoyBallEvent.ALIGNOF),
            __member(SDL_JoyHatEvent.SIZEOF, SDL_JoyHatEvent.ALIGNOF),
            __member(SDL_JoyButtonEvent.SIZEOF, SDL_JoyButtonEvent.ALIGNOF),
            __member(SDL_JoyBatteryEvent.SIZEOF, SDL_JoyBatteryEvent.ALIGNOF),
            __member(SDL_GamepadDeviceEvent.SIZEOF, SDL_GamepadDeviceEvent.ALIGNOF),
            __member(SDL_GamepadAxisEvent.SIZEOF, SDL_GamepadAxisEvent.ALIGNOF),
            __member(SDL_GamepadButtonEvent.SIZEOF, SDL_GamepadButtonEvent.ALIGNOF),
            __member(SDL_GamepadTouchpadEvent.SIZEOF, SDL_GamepadTouchpadEvent.ALIGNOF),
            __member(SDL_GamepadSensorEvent.SIZEOF, SDL_GamepadSensorEvent.ALIGNOF),
            __member(SDL_AudioDeviceEvent.SIZEOF, SDL_AudioDeviceEvent.ALIGNOF),
            __member(SDL_CameraDeviceEvent.SIZEOF, SDL_CameraDeviceEvent.ALIGNOF),
            __member(SDL_SensorEvent.SIZEOF, SDL_SensorEvent.ALIGNOF),
            __member(SDL_QuitEvent.SIZEOF, SDL_QuitEvent.ALIGNOF),
            __member(SDL_UserEvent.SIZEOF, SDL_UserEvent.ALIGNOF),
            __member(SDL_TouchFingerEvent.SIZEOF, SDL_TouchFingerEvent.ALIGNOF),
            __member(SDL_PenProximityEvent.SIZEOF, SDL_PenProximityEvent.ALIGNOF),
            __member(SDL_PenTouchEvent.SIZEOF, SDL_PenTouchEvent.ALIGNOF),
            __member(SDL_PenMotionEvent.SIZEOF, SDL_PenMotionEvent.ALIGNOF),
            __member(SDL_PenButtonEvent.SIZEOF, SDL_PenButtonEvent.ALIGNOF),
            __member(SDL_PenAxisEvent.SIZEOF, SDL_PenAxisEvent.ALIGNOF),
            __member(SDL_RenderEvent.SIZEOF, SDL_RenderEvent.ALIGNOF),
            __member(SDL_DropEvent.SIZEOF, SDL_DropEvent.ALIGNOF),
            __member(SDL_ClipboardEvent.SIZEOF, SDL_ClipboardEvent.ALIGNOF),
            __array(1, 128)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        TYPE = layout.offsetof(0);
        COMMON = layout.offsetof(1);
        DISPLAY = layout.offsetof(2);
        WINDOW = layout.offsetof(3);
        KDEVICE = layout.offsetof(4);
        KEY = layout.offsetof(5);
        EDIT = layout.offsetof(6);
        EDIT_CANDIDATES = layout.offsetof(7);
        TEXT = layout.offsetof(8);
        MDEVICE = layout.offsetof(9);
        MOTION = layout.offsetof(10);
        BUTTON = layout.offsetof(11);
        WHEEL = layout.offsetof(12);
        JDEVICE = layout.offsetof(13);
        JAXIS = layout.offsetof(14);
        JBALL = layout.offsetof(15);
        JHAT = layout.offsetof(16);
        JBUTTON = layout.offsetof(17);
        JBATTERY = layout.offsetof(18);
        GDEVICE = layout.offsetof(19);
        GAXIS = layout.offsetof(20);
        GBUTTON = layout.offsetof(21);
        GTOUCHPAD = layout.offsetof(22);
        GSENSOR = layout.offsetof(23);
        ADEVICE = layout.offsetof(24);
        CDEVICE = layout.offsetof(25);
        SENSOR = layout.offsetof(26);
        QUIT = layout.offsetof(27);
        USER = layout.offsetof(28);
        TFINGER = layout.offsetof(29);
        PPROXIMITY = layout.offsetof(30);
        PTOUCH = layout.offsetof(31);
        PMOTION = layout.offsetof(32);
        PBUTTON = layout.offsetof(33);
        PAXIS = layout.offsetof(34);
        RENDER = layout.offsetof(35);
        DROP = layout.offsetof(36);
        CLIPBOARD = layout.offsetof(37);
        PADDING = layout.offsetof(38);
    }

    protected SDL_Event(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected SDL_Event create(long address, @Nullable ByteBuffer container) {
        return new SDL_Event(address, container);
    }

    /**
     * Creates a {@code SDL_Event} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public SDL_Event(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return the value of the {@code type} field. */
    @NativeType("Uint32")
    public int type() { return ntype(address()); }
    /** @return a {@link SDL_CommonEvent} view of the {@code common} field. */
    public SDL_CommonEvent common() { return ncommon(address()); }
    /** @return a {@link SDL_DisplayEvent} view of the {@code display} field. */
    public SDL_DisplayEvent display() { return ndisplay(address()); }
    /** @return a {@link SDL_WindowEvent} view of the {@code window} field. */
    public SDL_WindowEvent window() { return nwindow(address()); }
    /** @return a {@link SDL_KeyboardDeviceEvent} view of the {@code kdevice} field. */
    public SDL_KeyboardDeviceEvent kdevice() { return nkdevice(address()); }
    /** @return a {@link SDL_KeyboardEvent} view of the {@code key} field. */
    public SDL_KeyboardEvent key() { return nkey(address()); }
    /** @return a {@link SDL_TextEditingEvent} view of the {@code edit} field. */
    public SDL_TextEditingEvent edit() { return nedit(address()); }
    /** @return a {@link SDL_TextEditingCandidatesEvent} view of the {@code edit_candidates} field. */
    public SDL_TextEditingCandidatesEvent edit_candidates() { return nedit_candidates(address()); }
    /** @return a {@link SDL_TextInputEvent} view of the {@code text} field. */
    public SDL_TextInputEvent text() { return ntext(address()); }
    /** @return a {@link SDL_MouseDeviceEvent} view of the {@code mdevice} field. */
    public SDL_MouseDeviceEvent mdevice() { return nmdevice(address()); }
    /** @return a {@link SDL_MouseMotionEvent} view of the {@code motion} field. */
    public SDL_MouseMotionEvent motion() { return nmotion(address()); }
    /** @return a {@link SDL_MouseButtonEvent} view of the {@code button} field. */
    public SDL_MouseButtonEvent button() { return nbutton(address()); }
    /** @return a {@link SDL_MouseWheelEvent} view of the {@code wheel} field. */
    public SDL_MouseWheelEvent wheel() { return nwheel(address()); }
    /** @return a {@link SDL_JoyDeviceEvent} view of the {@code jdevice} field. */
    public SDL_JoyDeviceEvent jdevice() { return njdevice(address()); }
    /** @return a {@link SDL_JoyAxisEvent} view of the {@code jaxis} field. */
    public SDL_JoyAxisEvent jaxis() { return njaxis(address()); }
    /** @return a {@link SDL_JoyBallEvent} view of the {@code jball} field. */
    public SDL_JoyBallEvent jball() { return njball(address()); }
    /** @return a {@link SDL_JoyHatEvent} view of the {@code jhat} field. */
    public SDL_JoyHatEvent jhat() { return njhat(address()); }
    /** @return a {@link SDL_JoyButtonEvent} view of the {@code jbutton} field. */
    public SDL_JoyButtonEvent jbutton() { return njbutton(address()); }
    /** @return a {@link SDL_JoyBatteryEvent} view of the {@code jbattery} field. */
    public SDL_JoyBatteryEvent jbattery() { return njbattery(address()); }
    /** @return a {@link SDL_GamepadDeviceEvent} view of the {@code gdevice} field. */
    public SDL_GamepadDeviceEvent gdevice() { return ngdevice(address()); }
    /** @return a {@link SDL_GamepadAxisEvent} view of the {@code gaxis} field. */
    public SDL_GamepadAxisEvent gaxis() { return ngaxis(address()); }
    /** @return a {@link SDL_GamepadButtonEvent} view of the {@code gbutton} field. */
    public SDL_GamepadButtonEvent gbutton() { return ngbutton(address()); }
    /** @return a {@link SDL_GamepadTouchpadEvent} view of the {@code gtouchpad} field. */
    public SDL_GamepadTouchpadEvent gtouchpad() { return ngtouchpad(address()); }
    /** @return a {@link SDL_GamepadSensorEvent} view of the {@code gsensor} field. */
    public SDL_GamepadSensorEvent gsensor() { return ngsensor(address()); }
    /** @return a {@link SDL_AudioDeviceEvent} view of the {@code adevice} field. */
    public SDL_AudioDeviceEvent adevice() { return nadevice(address()); }
    /** @return a {@link SDL_CameraDeviceEvent} view of the {@code cdevice} field. */
    public SDL_CameraDeviceEvent cdevice() { return ncdevice(address()); }
    /** @return a {@link SDL_SensorEvent} view of the {@code sensor} field. */
    public SDL_SensorEvent sensor() { return nsensor(address()); }
    /** @return a {@link SDL_QuitEvent} view of the {@code quit} field. */
    public SDL_QuitEvent quit() { return nquit(address()); }
    /** @return a {@link SDL_UserEvent} view of the {@code user} field. */
    public SDL_UserEvent user() { return nuser(address()); }
    /** @return a {@link SDL_TouchFingerEvent} view of the {@code tfinger} field. */
    public SDL_TouchFingerEvent tfinger() { return ntfinger(address()); }
    /** @return a {@link SDL_PenProximityEvent} view of the {@code pproximity} field. */
    public SDL_PenProximityEvent pproximity() { return npproximity(address()); }
    /** @return a {@link SDL_PenTouchEvent} view of the {@code ptouch} field. */
    public SDL_PenTouchEvent ptouch() { return nptouch(address()); }
    /** @return a {@link SDL_PenMotionEvent} view of the {@code pmotion} field. */
    public SDL_PenMotionEvent pmotion() { return npmotion(address()); }
    /** @return a {@link SDL_PenButtonEvent} view of the {@code pbutton} field. */
    public SDL_PenButtonEvent pbutton() { return npbutton(address()); }
    /** @return a {@link SDL_PenAxisEvent} view of the {@code paxis} field. */
    public SDL_PenAxisEvent paxis() { return npaxis(address()); }
    /** @return a {@link SDL_RenderEvent} view of the {@code render} field. */
    public SDL_RenderEvent render() { return nrender(address()); }
    /** @return a {@link SDL_DropEvent} view of the {@code drop} field. */
    public SDL_DropEvent drop() { return ndrop(address()); }
    /** @return a {@link SDL_ClipboardEvent} view of the {@code clipboard} field. */
    public SDL_ClipboardEvent clipboard() { return nclipboard(address()); }

    /** Sets the specified value to the {@code type} field. */
    public SDL_Event type(@NativeType("Uint32") int value) { ntype(address(), value); return this; }
    /** Copies the specified {@link SDL_CommonEvent} to the {@code common} field. */
    public SDL_Event common(SDL_CommonEvent value) { ncommon(address(), value); return this; }
    /** Passes the {@code common} field to the specified {@link java.util.function.Consumer Consumer}. */
    public SDL_Event common(java.util.function.Consumer<SDL_CommonEvent> consumer) { consumer.accept(common()); return this; }
    /** Copies the specified {@link SDL_DisplayEvent} to the {@code display} field. */
    public SDL_Event display(SDL_DisplayEvent value) { ndisplay(address(), value); return this; }
    /** Passes the {@code display} field to the specified {@link java.util.function.Consumer Consumer}. */
    public SDL_Event display(java.util.function.Consumer<SDL_DisplayEvent> consumer) { consumer.accept(display()); return this; }
    /** Copies the specified {@link SDL_WindowEvent} to the {@code window} field. */
    public SDL_Event window(SDL_WindowEvent value) { nwindow(address(), value); return this; }
    /** Passes the {@code window} field to the specified {@link java.util.function.Consumer Consumer}. */
    public SDL_Event window(java.util.function.Consumer<SDL_WindowEvent> consumer) { consumer.accept(window()); return this; }
    /** Copies the specified {@link SDL_KeyboardDeviceEvent} to the {@code kdevice} field. */
    public SDL_Event kdevice(SDL_KeyboardDeviceEvent value) { nkdevice(address(), value); return this; }
    /** Passes the {@code kdevice} field to the specified {@link java.util.function.Consumer Consumer}. */
    public SDL_Event kdevice(java.util.function.Consumer<SDL_KeyboardDeviceEvent> consumer) { consumer.accept(kdevice()); return this; }
    /** Copies the specified {@link SDL_KeyboardEvent} to the {@code key} field. */
    public SDL_Event key(SDL_KeyboardEvent value) { nkey(address(), value); return this; }
    /** Passes the {@code key} field to the specified {@link java.util.function.Consumer Consumer}. */
    public SDL_Event key(java.util.function.Consumer<SDL_KeyboardEvent> consumer) { consumer.accept(key()); return this; }
    /** Copies the specified {@link SDL_TextEditingEvent} to the {@code edit} field. */
    public SDL_Event edit(SDL_TextEditingEvent value) { nedit(address(), value); return this; }
    /** Passes the {@code edit} field to the specified {@link java.util.function.Consumer Consumer}. */
    public SDL_Event edit(java.util.function.Consumer<SDL_TextEditingEvent> consumer) { consumer.accept(edit()); return this; }
    /** Copies the specified {@link SDL_TextEditingCandidatesEvent} to the {@code edit_candidates} field. */
    public SDL_Event edit_candidates(SDL_TextEditingCandidatesEvent value) { nedit_candidates(address(), value); return this; }
    /** Passes the {@code edit_candidates} field to the specified {@link java.util.function.Consumer Consumer}. */
    public SDL_Event edit_candidates(java.util.function.Consumer<SDL_TextEditingCandidatesEvent> consumer) { consumer.accept(edit_candidates()); return this; }
    /** Copies the specified {@link SDL_TextInputEvent} to the {@code text} field. */
    public SDL_Event text(SDL_TextInputEvent value) { ntext(address(), value); return this; }
    /** Passes the {@code text} field to the specified {@link java.util.function.Consumer Consumer}. */
    public SDL_Event text(java.util.function.Consumer<SDL_TextInputEvent> consumer) { consumer.accept(text()); return this; }
    /** Copies the specified {@link SDL_MouseDeviceEvent} to the {@code mdevice} field. */
    public SDL_Event mdevice(SDL_MouseDeviceEvent value) { nmdevice(address(), value); return this; }
    /** Passes the {@code mdevice} field to the specified {@link java.util.function.Consumer Consumer}. */
    public SDL_Event mdevice(java.util.function.Consumer<SDL_MouseDeviceEvent> consumer) { consumer.accept(mdevice()); return this; }
    /** Copies the specified {@link SDL_MouseMotionEvent} to the {@code motion} field. */
    public SDL_Event motion(SDL_MouseMotionEvent value) { nmotion(address(), value); return this; }
    /** Passes the {@code motion} field to the specified {@link java.util.function.Consumer Consumer}. */
    public SDL_Event motion(java.util.function.Consumer<SDL_MouseMotionEvent> consumer) { consumer.accept(motion()); return this; }
    /** Copies the specified {@link SDL_MouseButtonEvent} to the {@code button} field. */
    public SDL_Event button(SDL_MouseButtonEvent value) { nbutton(address(), value); return this; }
    /** Passes the {@code button} field to the specified {@link java.util.function.Consumer Consumer}. */
    public SDL_Event button(java.util.function.Consumer<SDL_MouseButtonEvent> consumer) { consumer.accept(button()); return this; }
    /** Copies the specified {@link SDL_MouseWheelEvent} to the {@code wheel} field. */
    public SDL_Event wheel(SDL_MouseWheelEvent value) { nwheel(address(), value); return this; }
    /** Passes the {@code wheel} field to the specified {@link java.util.function.Consumer Consumer}. */
    public SDL_Event wheel(java.util.function.Consumer<SDL_MouseWheelEvent> consumer) { consumer.accept(wheel()); return this; }
    /** Copies the specified {@link SDL_JoyDeviceEvent} to the {@code jdevice} field. */
    public SDL_Event jdevice(SDL_JoyDeviceEvent value) { njdevice(address(), value); return this; }
    /** Passes the {@code jdevice} field to the specified {@link java.util.function.Consumer Consumer}. */
    public SDL_Event jdevice(java.util.function.Consumer<SDL_JoyDeviceEvent> consumer) { consumer.accept(jdevice()); return this; }
    /** Copies the specified {@link SDL_JoyAxisEvent} to the {@code jaxis} field. */
    public SDL_Event jaxis(SDL_JoyAxisEvent value) { njaxis(address(), value); return this; }
    /** Passes the {@code jaxis} field to the specified {@link java.util.function.Consumer Consumer}. */
    public SDL_Event jaxis(java.util.function.Consumer<SDL_JoyAxisEvent> consumer) { consumer.accept(jaxis()); return this; }
    /** Copies the specified {@link SDL_JoyBallEvent} to the {@code jball} field. */
    public SDL_Event jball(SDL_JoyBallEvent value) { njball(address(), value); return this; }
    /** Passes the {@code jball} field to the specified {@link java.util.function.Consumer Consumer}. */
    public SDL_Event jball(java.util.function.Consumer<SDL_JoyBallEvent> consumer) { consumer.accept(jball()); return this; }
    /** Copies the specified {@link SDL_JoyHatEvent} to the {@code jhat} field. */
    public SDL_Event jhat(SDL_JoyHatEvent value) { njhat(address(), value); return this; }
    /** Passes the {@code jhat} field to the specified {@link java.util.function.Consumer Consumer}. */
    public SDL_Event jhat(java.util.function.Consumer<SDL_JoyHatEvent> consumer) { consumer.accept(jhat()); return this; }
    /** Copies the specified {@link SDL_JoyButtonEvent} to the {@code jbutton} field. */
    public SDL_Event jbutton(SDL_JoyButtonEvent value) { njbutton(address(), value); return this; }
    /** Passes the {@code jbutton} field to the specified {@link java.util.function.Consumer Consumer}. */
    public SDL_Event jbutton(java.util.function.Consumer<SDL_JoyButtonEvent> consumer) { consumer.accept(jbutton()); return this; }
    /** Copies the specified {@link SDL_JoyBatteryEvent} to the {@code jbattery} field. */
    public SDL_Event jbattery(SDL_JoyBatteryEvent value) { njbattery(address(), value); return this; }
    /** Passes the {@code jbattery} field to the specified {@link java.util.function.Consumer Consumer}. */
    public SDL_Event jbattery(java.util.function.Consumer<SDL_JoyBatteryEvent> consumer) { consumer.accept(jbattery()); return this; }
    /** Copies the specified {@link SDL_GamepadDeviceEvent} to the {@code gdevice} field. */
    public SDL_Event gdevice(SDL_GamepadDeviceEvent value) { ngdevice(address(), value); return this; }
    /** Passes the {@code gdevice} field to the specified {@link java.util.function.Consumer Consumer}. */
    public SDL_Event gdevice(java.util.function.Consumer<SDL_GamepadDeviceEvent> consumer) { consumer.accept(gdevice()); return this; }
    /** Copies the specified {@link SDL_GamepadAxisEvent} to the {@code gaxis} field. */
    public SDL_Event gaxis(SDL_GamepadAxisEvent value) { ngaxis(address(), value); return this; }
    /** Passes the {@code gaxis} field to the specified {@link java.util.function.Consumer Consumer}. */
    public SDL_Event gaxis(java.util.function.Consumer<SDL_GamepadAxisEvent> consumer) { consumer.accept(gaxis()); return this; }
    /** Copies the specified {@link SDL_GamepadButtonEvent} to the {@code gbutton} field. */
    public SDL_Event gbutton(SDL_GamepadButtonEvent value) { ngbutton(address(), value); return this; }
    /** Passes the {@code gbutton} field to the specified {@link java.util.function.Consumer Consumer}. */
    public SDL_Event gbutton(java.util.function.Consumer<SDL_GamepadButtonEvent> consumer) { consumer.accept(gbutton()); return this; }
    /** Copies the specified {@link SDL_GamepadTouchpadEvent} to the {@code gtouchpad} field. */
    public SDL_Event gtouchpad(SDL_GamepadTouchpadEvent value) { ngtouchpad(address(), value); return this; }
    /** Passes the {@code gtouchpad} field to the specified {@link java.util.function.Consumer Consumer}. */
    public SDL_Event gtouchpad(java.util.function.Consumer<SDL_GamepadTouchpadEvent> consumer) { consumer.accept(gtouchpad()); return this; }
    /** Copies the specified {@link SDL_GamepadSensorEvent} to the {@code gsensor} field. */
    public SDL_Event gsensor(SDL_GamepadSensorEvent value) { ngsensor(address(), value); return this; }
    /** Passes the {@code gsensor} field to the specified {@link java.util.function.Consumer Consumer}. */
    public SDL_Event gsensor(java.util.function.Consumer<SDL_GamepadSensorEvent> consumer) { consumer.accept(gsensor()); return this; }
    /** Copies the specified {@link SDL_AudioDeviceEvent} to the {@code adevice} field. */
    public SDL_Event adevice(SDL_AudioDeviceEvent value) { nadevice(address(), value); return this; }
    /** Passes the {@code adevice} field to the specified {@link java.util.function.Consumer Consumer}. */
    public SDL_Event adevice(java.util.function.Consumer<SDL_AudioDeviceEvent> consumer) { consumer.accept(adevice()); return this; }
    /** Copies the specified {@link SDL_CameraDeviceEvent} to the {@code cdevice} field. */
    public SDL_Event cdevice(SDL_CameraDeviceEvent value) { ncdevice(address(), value); return this; }
    /** Passes the {@code cdevice} field to the specified {@link java.util.function.Consumer Consumer}. */
    public SDL_Event cdevice(java.util.function.Consumer<SDL_CameraDeviceEvent> consumer) { consumer.accept(cdevice()); return this; }
    /** Copies the specified {@link SDL_SensorEvent} to the {@code sensor} field. */
    public SDL_Event sensor(SDL_SensorEvent value) { nsensor(address(), value); return this; }
    /** Passes the {@code sensor} field to the specified {@link java.util.function.Consumer Consumer}. */
    public SDL_Event sensor(java.util.function.Consumer<SDL_SensorEvent> consumer) { consumer.accept(sensor()); return this; }
    /** Copies the specified {@link SDL_QuitEvent} to the {@code quit} field. */
    public SDL_Event quit(SDL_QuitEvent value) { nquit(address(), value); return this; }
    /** Passes the {@code quit} field to the specified {@link java.util.function.Consumer Consumer}. */
    public SDL_Event quit(java.util.function.Consumer<SDL_QuitEvent> consumer) { consumer.accept(quit()); return this; }
    /** Copies the specified {@link SDL_UserEvent} to the {@code user} field. */
    public SDL_Event user(SDL_UserEvent value) { nuser(address(), value); return this; }
    /** Passes the {@code user} field to the specified {@link java.util.function.Consumer Consumer}. */
    public SDL_Event user(java.util.function.Consumer<SDL_UserEvent> consumer) { consumer.accept(user()); return this; }
    /** Copies the specified {@link SDL_TouchFingerEvent} to the {@code tfinger} field. */
    public SDL_Event tfinger(SDL_TouchFingerEvent value) { ntfinger(address(), value); return this; }
    /** Passes the {@code tfinger} field to the specified {@link java.util.function.Consumer Consumer}. */
    public SDL_Event tfinger(java.util.function.Consumer<SDL_TouchFingerEvent> consumer) { consumer.accept(tfinger()); return this; }
    /** Copies the specified {@link SDL_PenProximityEvent} to the {@code pproximity} field. */
    public SDL_Event pproximity(SDL_PenProximityEvent value) { npproximity(address(), value); return this; }
    /** Passes the {@code pproximity} field to the specified {@link java.util.function.Consumer Consumer}. */
    public SDL_Event pproximity(java.util.function.Consumer<SDL_PenProximityEvent> consumer) { consumer.accept(pproximity()); return this; }
    /** Copies the specified {@link SDL_PenTouchEvent} to the {@code ptouch} field. */
    public SDL_Event ptouch(SDL_PenTouchEvent value) { nptouch(address(), value); return this; }
    /** Passes the {@code ptouch} field to the specified {@link java.util.function.Consumer Consumer}. */
    public SDL_Event ptouch(java.util.function.Consumer<SDL_PenTouchEvent> consumer) { consumer.accept(ptouch()); return this; }
    /** Copies the specified {@link SDL_PenMotionEvent} to the {@code pmotion} field. */
    public SDL_Event pmotion(SDL_PenMotionEvent value) { npmotion(address(), value); return this; }
    /** Passes the {@code pmotion} field to the specified {@link java.util.function.Consumer Consumer}. */
    public SDL_Event pmotion(java.util.function.Consumer<SDL_PenMotionEvent> consumer) { consumer.accept(pmotion()); return this; }
    /** Copies the specified {@link SDL_PenButtonEvent} to the {@code pbutton} field. */
    public SDL_Event pbutton(SDL_PenButtonEvent value) { npbutton(address(), value); return this; }
    /** Passes the {@code pbutton} field to the specified {@link java.util.function.Consumer Consumer}. */
    public SDL_Event pbutton(java.util.function.Consumer<SDL_PenButtonEvent> consumer) { consumer.accept(pbutton()); return this; }
    /** Copies the specified {@link SDL_PenAxisEvent} to the {@code paxis} field. */
    public SDL_Event paxis(SDL_PenAxisEvent value) { npaxis(address(), value); return this; }
    /** Passes the {@code paxis} field to the specified {@link java.util.function.Consumer Consumer}. */
    public SDL_Event paxis(java.util.function.Consumer<SDL_PenAxisEvent> consumer) { consumer.accept(paxis()); return this; }
    /** Copies the specified {@link SDL_RenderEvent} to the {@code render} field. */
    public SDL_Event render(SDL_RenderEvent value) { nrender(address(), value); return this; }
    /** Passes the {@code render} field to the specified {@link java.util.function.Consumer Consumer}. */
    public SDL_Event render(java.util.function.Consumer<SDL_RenderEvent> consumer) { consumer.accept(render()); return this; }
    /** Copies the specified {@link SDL_DropEvent} to the {@code drop} field. */
    public SDL_Event drop(SDL_DropEvent value) { ndrop(address(), value); return this; }
    /** Passes the {@code drop} field to the specified {@link java.util.function.Consumer Consumer}. */
    public SDL_Event drop(java.util.function.Consumer<SDL_DropEvent> consumer) { consumer.accept(drop()); return this; }
    /** Copies the specified {@link SDL_ClipboardEvent} to the {@code clipboard} field. */
    public SDL_Event clipboard(SDL_ClipboardEvent value) { nclipboard(address(), value); return this; }
    /** Passes the {@code clipboard} field to the specified {@link java.util.function.Consumer Consumer}. */
    public SDL_Event clipboard(java.util.function.Consumer<SDL_ClipboardEvent> consumer) { consumer.accept(clipboard()); return this; }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public SDL_Event set(SDL_Event src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code SDL_Event} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static SDL_Event malloc() {
        return new SDL_Event(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code SDL_Event} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static SDL_Event calloc() {
        return new SDL_Event(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code SDL_Event} instance allocated with {@link BufferUtils}. */
    public static SDL_Event create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new SDL_Event(memAddress(container), container);
    }

    /** Returns a new {@code SDL_Event} instance for the specified memory address. */
    public static SDL_Event create(long address) {
        return new SDL_Event(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable SDL_Event createSafe(long address) {
        return address == NULL ? null : new SDL_Event(address, null);
    }

    /**
     * Returns a new {@link SDL_Event.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static SDL_Event.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link SDL_Event.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static SDL_Event.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link SDL_Event.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static SDL_Event.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link SDL_Event.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static SDL_Event.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static SDL_Event.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code SDL_Event} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static SDL_Event malloc(MemoryStack stack) {
        return new SDL_Event(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code SDL_Event} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static SDL_Event calloc(MemoryStack stack) {
        return new SDL_Event(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link SDL_Event.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static SDL_Event.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link SDL_Event.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static SDL_Event.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #type}. */
    public static int ntype(long struct) { return memGetInt(struct + SDL_Event.TYPE); }
    /** Unsafe version of {@link #common}. */
    public static SDL_CommonEvent ncommon(long struct) { return SDL_CommonEvent.create(struct + SDL_Event.COMMON); }
    /** Unsafe version of {@link #display}. */
    public static SDL_DisplayEvent ndisplay(long struct) { return SDL_DisplayEvent.create(struct + SDL_Event.DISPLAY); }
    /** Unsafe version of {@link #window}. */
    public static SDL_WindowEvent nwindow(long struct) { return SDL_WindowEvent.create(struct + SDL_Event.WINDOW); }
    /** Unsafe version of {@link #kdevice}. */
    public static SDL_KeyboardDeviceEvent nkdevice(long struct) { return SDL_KeyboardDeviceEvent.create(struct + SDL_Event.KDEVICE); }
    /** Unsafe version of {@link #key}. */
    public static SDL_KeyboardEvent nkey(long struct) { return SDL_KeyboardEvent.create(struct + SDL_Event.KEY); }
    /** Unsafe version of {@link #edit}. */
    public static SDL_TextEditingEvent nedit(long struct) { return SDL_TextEditingEvent.create(struct + SDL_Event.EDIT); }
    /** Unsafe version of {@link #edit_candidates}. */
    public static SDL_TextEditingCandidatesEvent nedit_candidates(long struct) { return SDL_TextEditingCandidatesEvent.create(struct + SDL_Event.EDIT_CANDIDATES); }
    /** Unsafe version of {@link #text}. */
    public static SDL_TextInputEvent ntext(long struct) { return SDL_TextInputEvent.create(struct + SDL_Event.TEXT); }
    /** Unsafe version of {@link #mdevice}. */
    public static SDL_MouseDeviceEvent nmdevice(long struct) { return SDL_MouseDeviceEvent.create(struct + SDL_Event.MDEVICE); }
    /** Unsafe version of {@link #motion}. */
    public static SDL_MouseMotionEvent nmotion(long struct) { return SDL_MouseMotionEvent.create(struct + SDL_Event.MOTION); }
    /** Unsafe version of {@link #button}. */
    public static SDL_MouseButtonEvent nbutton(long struct) { return SDL_MouseButtonEvent.create(struct + SDL_Event.BUTTON); }
    /** Unsafe version of {@link #wheel}. */
    public static SDL_MouseWheelEvent nwheel(long struct) { return SDL_MouseWheelEvent.create(struct + SDL_Event.WHEEL); }
    /** Unsafe version of {@link #jdevice}. */
    public static SDL_JoyDeviceEvent njdevice(long struct) { return SDL_JoyDeviceEvent.create(struct + SDL_Event.JDEVICE); }
    /** Unsafe version of {@link #jaxis}. */
    public static SDL_JoyAxisEvent njaxis(long struct) { return SDL_JoyAxisEvent.create(struct + SDL_Event.JAXIS); }
    /** Unsafe version of {@link #jball}. */
    public static SDL_JoyBallEvent njball(long struct) { return SDL_JoyBallEvent.create(struct + SDL_Event.JBALL); }
    /** Unsafe version of {@link #jhat}. */
    public static SDL_JoyHatEvent njhat(long struct) { return SDL_JoyHatEvent.create(struct + SDL_Event.JHAT); }
    /** Unsafe version of {@link #jbutton}. */
    public static SDL_JoyButtonEvent njbutton(long struct) { return SDL_JoyButtonEvent.create(struct + SDL_Event.JBUTTON); }
    /** Unsafe version of {@link #jbattery}. */
    public static SDL_JoyBatteryEvent njbattery(long struct) { return SDL_JoyBatteryEvent.create(struct + SDL_Event.JBATTERY); }
    /** Unsafe version of {@link #gdevice}. */
    public static SDL_GamepadDeviceEvent ngdevice(long struct) { return SDL_GamepadDeviceEvent.create(struct + SDL_Event.GDEVICE); }
    /** Unsafe version of {@link #gaxis}. */
    public static SDL_GamepadAxisEvent ngaxis(long struct) { return SDL_GamepadAxisEvent.create(struct + SDL_Event.GAXIS); }
    /** Unsafe version of {@link #gbutton}. */
    public static SDL_GamepadButtonEvent ngbutton(long struct) { return SDL_GamepadButtonEvent.create(struct + SDL_Event.GBUTTON); }
    /** Unsafe version of {@link #gtouchpad}. */
    public static SDL_GamepadTouchpadEvent ngtouchpad(long struct) { return SDL_GamepadTouchpadEvent.create(struct + SDL_Event.GTOUCHPAD); }
    /** Unsafe version of {@link #gsensor}. */
    public static SDL_GamepadSensorEvent ngsensor(long struct) { return SDL_GamepadSensorEvent.create(struct + SDL_Event.GSENSOR); }
    /** Unsafe version of {@link #adevice}. */
    public static SDL_AudioDeviceEvent nadevice(long struct) { return SDL_AudioDeviceEvent.create(struct + SDL_Event.ADEVICE); }
    /** Unsafe version of {@link #cdevice}. */
    public static SDL_CameraDeviceEvent ncdevice(long struct) { return SDL_CameraDeviceEvent.create(struct + SDL_Event.CDEVICE); }
    /** Unsafe version of {@link #sensor}. */
    public static SDL_SensorEvent nsensor(long struct) { return SDL_SensorEvent.create(struct + SDL_Event.SENSOR); }
    /** Unsafe version of {@link #quit}. */
    public static SDL_QuitEvent nquit(long struct) { return SDL_QuitEvent.create(struct + SDL_Event.QUIT); }
    /** Unsafe version of {@link #user}. */
    public static SDL_UserEvent nuser(long struct) { return SDL_UserEvent.create(struct + SDL_Event.USER); }
    /** Unsafe version of {@link #tfinger}. */
    public static SDL_TouchFingerEvent ntfinger(long struct) { return SDL_TouchFingerEvent.create(struct + SDL_Event.TFINGER); }
    /** Unsafe version of {@link #pproximity}. */
    public static SDL_PenProximityEvent npproximity(long struct) { return SDL_PenProximityEvent.create(struct + SDL_Event.PPROXIMITY); }
    /** Unsafe version of {@link #ptouch}. */
    public static SDL_PenTouchEvent nptouch(long struct) { return SDL_PenTouchEvent.create(struct + SDL_Event.PTOUCH); }
    /** Unsafe version of {@link #pmotion}. */
    public static SDL_PenMotionEvent npmotion(long struct) { return SDL_PenMotionEvent.create(struct + SDL_Event.PMOTION); }
    /** Unsafe version of {@link #pbutton}. */
    public static SDL_PenButtonEvent npbutton(long struct) { return SDL_PenButtonEvent.create(struct + SDL_Event.PBUTTON); }
    /** Unsafe version of {@link #paxis}. */
    public static SDL_PenAxisEvent npaxis(long struct) { return SDL_PenAxisEvent.create(struct + SDL_Event.PAXIS); }
    /** Unsafe version of {@link #render}. */
    public static SDL_RenderEvent nrender(long struct) { return SDL_RenderEvent.create(struct + SDL_Event.RENDER); }
    /** Unsafe version of {@link #drop}. */
    public static SDL_DropEvent ndrop(long struct) { return SDL_DropEvent.create(struct + SDL_Event.DROP); }
    /** Unsafe version of {@link #clipboard}. */
    public static SDL_ClipboardEvent nclipboard(long struct) { return SDL_ClipboardEvent.create(struct + SDL_Event.CLIPBOARD); }
    public static ByteBuffer npadding(long struct) { return memByteBuffer(struct + SDL_Event.PADDING, 128); }
    public static byte npadding(long struct, int index) {
        return memGetByte(struct + SDL_Event.PADDING + check(index, 128) * 1);
    }

    /** Unsafe version of {@link #type(int) type}. */
    public static void ntype(long struct, int value) { memPutInt(struct + SDL_Event.TYPE, value); }
    /** Unsafe version of {@link #common(SDL_CommonEvent) common}. */
    public static void ncommon(long struct, SDL_CommonEvent value) { memCopy(value.address(), struct + SDL_Event.COMMON, SDL_CommonEvent.SIZEOF); }
    /** Unsafe version of {@link #display(SDL_DisplayEvent) display}. */
    public static void ndisplay(long struct, SDL_DisplayEvent value) { memCopy(value.address(), struct + SDL_Event.DISPLAY, SDL_DisplayEvent.SIZEOF); }
    /** Unsafe version of {@link #window(SDL_WindowEvent) window}. */
    public static void nwindow(long struct, SDL_WindowEvent value) { memCopy(value.address(), struct + SDL_Event.WINDOW, SDL_WindowEvent.SIZEOF); }
    /** Unsafe version of {@link #kdevice(SDL_KeyboardDeviceEvent) kdevice}. */
    public static void nkdevice(long struct, SDL_KeyboardDeviceEvent value) { memCopy(value.address(), struct + SDL_Event.KDEVICE, SDL_KeyboardDeviceEvent.SIZEOF); }
    /** Unsafe version of {@link #key(SDL_KeyboardEvent) key}. */
    public static void nkey(long struct, SDL_KeyboardEvent value) { memCopy(value.address(), struct + SDL_Event.KEY, SDL_KeyboardEvent.SIZEOF); }
    /** Unsafe version of {@link #edit(SDL_TextEditingEvent) edit}. */
    public static void nedit(long struct, SDL_TextEditingEvent value) { memCopy(value.address(), struct + SDL_Event.EDIT, SDL_TextEditingEvent.SIZEOF); }
    /** Unsafe version of {@link #edit_candidates(SDL_TextEditingCandidatesEvent) edit_candidates}. */
    public static void nedit_candidates(long struct, SDL_TextEditingCandidatesEvent value) { memCopy(value.address(), struct + SDL_Event.EDIT_CANDIDATES, SDL_TextEditingCandidatesEvent.SIZEOF); }
    /** Unsafe version of {@link #text(SDL_TextInputEvent) text}. */
    public static void ntext(long struct, SDL_TextInputEvent value) { memCopy(value.address(), struct + SDL_Event.TEXT, SDL_TextInputEvent.SIZEOF); }
    /** Unsafe version of {@link #mdevice(SDL_MouseDeviceEvent) mdevice}. */
    public static void nmdevice(long struct, SDL_MouseDeviceEvent value) { memCopy(value.address(), struct + SDL_Event.MDEVICE, SDL_MouseDeviceEvent.SIZEOF); }
    /** Unsafe version of {@link #motion(SDL_MouseMotionEvent) motion}. */
    public static void nmotion(long struct, SDL_MouseMotionEvent value) { memCopy(value.address(), struct + SDL_Event.MOTION, SDL_MouseMotionEvent.SIZEOF); }
    /** Unsafe version of {@link #button(SDL_MouseButtonEvent) button}. */
    public static void nbutton(long struct, SDL_MouseButtonEvent value) { memCopy(value.address(), struct + SDL_Event.BUTTON, SDL_MouseButtonEvent.SIZEOF); }
    /** Unsafe version of {@link #wheel(SDL_MouseWheelEvent) wheel}. */
    public static void nwheel(long struct, SDL_MouseWheelEvent value) { memCopy(value.address(), struct + SDL_Event.WHEEL, SDL_MouseWheelEvent.SIZEOF); }
    /** Unsafe version of {@link #jdevice(SDL_JoyDeviceEvent) jdevice}. */
    public static void njdevice(long struct, SDL_JoyDeviceEvent value) { memCopy(value.address(), struct + SDL_Event.JDEVICE, SDL_JoyDeviceEvent.SIZEOF); }
    /** Unsafe version of {@link #jaxis(SDL_JoyAxisEvent) jaxis}. */
    public static void njaxis(long struct, SDL_JoyAxisEvent value) { memCopy(value.address(), struct + SDL_Event.JAXIS, SDL_JoyAxisEvent.SIZEOF); }
    /** Unsafe version of {@link #jball(SDL_JoyBallEvent) jball}. */
    public static void njball(long struct, SDL_JoyBallEvent value) { memCopy(value.address(), struct + SDL_Event.JBALL, SDL_JoyBallEvent.SIZEOF); }
    /** Unsafe version of {@link #jhat(SDL_JoyHatEvent) jhat}. */
    public static void njhat(long struct, SDL_JoyHatEvent value) { memCopy(value.address(), struct + SDL_Event.JHAT, SDL_JoyHatEvent.SIZEOF); }
    /** Unsafe version of {@link #jbutton(SDL_JoyButtonEvent) jbutton}. */
    public static void njbutton(long struct, SDL_JoyButtonEvent value) { memCopy(value.address(), struct + SDL_Event.JBUTTON, SDL_JoyButtonEvent.SIZEOF); }
    /** Unsafe version of {@link #jbattery(SDL_JoyBatteryEvent) jbattery}. */
    public static void njbattery(long struct, SDL_JoyBatteryEvent value) { memCopy(value.address(), struct + SDL_Event.JBATTERY, SDL_JoyBatteryEvent.SIZEOF); }
    /** Unsafe version of {@link #gdevice(SDL_GamepadDeviceEvent) gdevice}. */
    public static void ngdevice(long struct, SDL_GamepadDeviceEvent value) { memCopy(value.address(), struct + SDL_Event.GDEVICE, SDL_GamepadDeviceEvent.SIZEOF); }
    /** Unsafe version of {@link #gaxis(SDL_GamepadAxisEvent) gaxis}. */
    public static void ngaxis(long struct, SDL_GamepadAxisEvent value) { memCopy(value.address(), struct + SDL_Event.GAXIS, SDL_GamepadAxisEvent.SIZEOF); }
    /** Unsafe version of {@link #gbutton(SDL_GamepadButtonEvent) gbutton}. */
    public static void ngbutton(long struct, SDL_GamepadButtonEvent value) { memCopy(value.address(), struct + SDL_Event.GBUTTON, SDL_GamepadButtonEvent.SIZEOF); }
    /** Unsafe version of {@link #gtouchpad(SDL_GamepadTouchpadEvent) gtouchpad}. */
    public static void ngtouchpad(long struct, SDL_GamepadTouchpadEvent value) { memCopy(value.address(), struct + SDL_Event.GTOUCHPAD, SDL_GamepadTouchpadEvent.SIZEOF); }
    /** Unsafe version of {@link #gsensor(SDL_GamepadSensorEvent) gsensor}. */
    public static void ngsensor(long struct, SDL_GamepadSensorEvent value) { memCopy(value.address(), struct + SDL_Event.GSENSOR, SDL_GamepadSensorEvent.SIZEOF); }
    /** Unsafe version of {@link #adevice(SDL_AudioDeviceEvent) adevice}. */
    public static void nadevice(long struct, SDL_AudioDeviceEvent value) { memCopy(value.address(), struct + SDL_Event.ADEVICE, SDL_AudioDeviceEvent.SIZEOF); }
    /** Unsafe version of {@link #cdevice(SDL_CameraDeviceEvent) cdevice}. */
    public static void ncdevice(long struct, SDL_CameraDeviceEvent value) { memCopy(value.address(), struct + SDL_Event.CDEVICE, SDL_CameraDeviceEvent.SIZEOF); }
    /** Unsafe version of {@link #sensor(SDL_SensorEvent) sensor}. */
    public static void nsensor(long struct, SDL_SensorEvent value) { memCopy(value.address(), struct + SDL_Event.SENSOR, SDL_SensorEvent.SIZEOF); }
    /** Unsafe version of {@link #quit(SDL_QuitEvent) quit}. */
    public static void nquit(long struct, SDL_QuitEvent value) { memCopy(value.address(), struct + SDL_Event.QUIT, SDL_QuitEvent.SIZEOF); }
    /** Unsafe version of {@link #user(SDL_UserEvent) user}. */
    public static void nuser(long struct, SDL_UserEvent value) { memCopy(value.address(), struct + SDL_Event.USER, SDL_UserEvent.SIZEOF); }
    /** Unsafe version of {@link #tfinger(SDL_TouchFingerEvent) tfinger}. */
    public static void ntfinger(long struct, SDL_TouchFingerEvent value) { memCopy(value.address(), struct + SDL_Event.TFINGER, SDL_TouchFingerEvent.SIZEOF); }
    /** Unsafe version of {@link #pproximity(SDL_PenProximityEvent) pproximity}. */
    public static void npproximity(long struct, SDL_PenProximityEvent value) { memCopy(value.address(), struct + SDL_Event.PPROXIMITY, SDL_PenProximityEvent.SIZEOF); }
    /** Unsafe version of {@link #ptouch(SDL_PenTouchEvent) ptouch}. */
    public static void nptouch(long struct, SDL_PenTouchEvent value) { memCopy(value.address(), struct + SDL_Event.PTOUCH, SDL_PenTouchEvent.SIZEOF); }
    /** Unsafe version of {@link #pmotion(SDL_PenMotionEvent) pmotion}. */
    public static void npmotion(long struct, SDL_PenMotionEvent value) { memCopy(value.address(), struct + SDL_Event.PMOTION, SDL_PenMotionEvent.SIZEOF); }
    /** Unsafe version of {@link #pbutton(SDL_PenButtonEvent) pbutton}. */
    public static void npbutton(long struct, SDL_PenButtonEvent value) { memCopy(value.address(), struct + SDL_Event.PBUTTON, SDL_PenButtonEvent.SIZEOF); }
    /** Unsafe version of {@link #paxis(SDL_PenAxisEvent) paxis}. */
    public static void npaxis(long struct, SDL_PenAxisEvent value) { memCopy(value.address(), struct + SDL_Event.PAXIS, SDL_PenAxisEvent.SIZEOF); }
    /** Unsafe version of {@link #render(SDL_RenderEvent) render}. */
    public static void nrender(long struct, SDL_RenderEvent value) { memCopy(value.address(), struct + SDL_Event.RENDER, SDL_RenderEvent.SIZEOF); }
    /** Unsafe version of {@link #drop(SDL_DropEvent) drop}. */
    public static void ndrop(long struct, SDL_DropEvent value) { memCopy(value.address(), struct + SDL_Event.DROP, SDL_DropEvent.SIZEOF); }
    /** Unsafe version of {@link #clipboard(SDL_ClipboardEvent) clipboard}. */
    public static void nclipboard(long struct, SDL_ClipboardEvent value) { memCopy(value.address(), struct + SDL_Event.CLIPBOARD, SDL_ClipboardEvent.SIZEOF); }
    public static void npadding(long struct, ByteBuffer value) {
        if (CHECKS) { checkGT(value, 128); }
        memCopy(memAddress(value), struct + SDL_Event.PADDING, value.remaining() * 1);
    }
    public static void npadding(long struct, int index, byte value) {
        memPutByte(struct + SDL_Event.PADDING + check(index, 128) * 1, value);
    }

    // -----------------------------------

    /** An array of {@link SDL_Event} structs. */
    public static class Buffer extends StructBuffer<SDL_Event, Buffer> implements NativeResource {

        private static final SDL_Event ELEMENT_FACTORY = SDL_Event.create(-1L);

        /**
         * Creates a new {@code SDL_Event.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link SDL_Event#SIZEOF}, and its mark will be undefined.</p>
         *
         * <p>The created buffer instance holds a strong reference to the container object.</p>
         */
        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / SIZEOF);
        }

        public Buffer(long address, int cap) {
            super(address, null, -1, 0, cap, cap);
        }

        Buffer(long address, @Nullable ByteBuffer container, int mark, int pos, int lim, int cap) {
            super(address, container, mark, pos, lim, cap);
        }

        @Override
        protected Buffer self() {
            return this;
        }

        @Override
        protected Buffer create(long address, @Nullable ByteBuffer container, int mark, int position, int limit, int capacity) {
            return new Buffer(address, container, mark, position, limit, capacity);
        }

        @Override
        protected SDL_Event getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code type} field. */
        @NativeType("Uint32")
        public int type() { return SDL_Event.ntype(address()); }
        /** @return a {@link SDL_CommonEvent} view of the {@code common} field. */
        public SDL_CommonEvent common() { return SDL_Event.ncommon(address()); }
        /** @return a {@link SDL_DisplayEvent} view of the {@code display} field. */
        public SDL_DisplayEvent display() { return SDL_Event.ndisplay(address()); }
        /** @return a {@link SDL_WindowEvent} view of the {@code window} field. */
        public SDL_WindowEvent window() { return SDL_Event.nwindow(address()); }
        /** @return a {@link SDL_KeyboardDeviceEvent} view of the {@code kdevice} field. */
        public SDL_KeyboardDeviceEvent kdevice() { return SDL_Event.nkdevice(address()); }
        /** @return a {@link SDL_KeyboardEvent} view of the {@code key} field. */
        public SDL_KeyboardEvent key() { return SDL_Event.nkey(address()); }
        /** @return a {@link SDL_TextEditingEvent} view of the {@code edit} field. */
        public SDL_TextEditingEvent edit() { return SDL_Event.nedit(address()); }
        /** @return a {@link SDL_TextEditingCandidatesEvent} view of the {@code edit_candidates} field. */
        public SDL_TextEditingCandidatesEvent edit_candidates() { return SDL_Event.nedit_candidates(address()); }
        /** @return a {@link SDL_TextInputEvent} view of the {@code text} field. */
        public SDL_TextInputEvent text() { return SDL_Event.ntext(address()); }
        /** @return a {@link SDL_MouseDeviceEvent} view of the {@code mdevice} field. */
        public SDL_MouseDeviceEvent mdevice() { return SDL_Event.nmdevice(address()); }
        /** @return a {@link SDL_MouseMotionEvent} view of the {@code motion} field. */
        public SDL_MouseMotionEvent motion() { return SDL_Event.nmotion(address()); }
        /** @return a {@link SDL_MouseButtonEvent} view of the {@code button} field. */
        public SDL_MouseButtonEvent button() { return SDL_Event.nbutton(address()); }
        /** @return a {@link SDL_MouseWheelEvent} view of the {@code wheel} field. */
        public SDL_MouseWheelEvent wheel() { return SDL_Event.nwheel(address()); }
        /** @return a {@link SDL_JoyDeviceEvent} view of the {@code jdevice} field. */
        public SDL_JoyDeviceEvent jdevice() { return SDL_Event.njdevice(address()); }
        /** @return a {@link SDL_JoyAxisEvent} view of the {@code jaxis} field. */
        public SDL_JoyAxisEvent jaxis() { return SDL_Event.njaxis(address()); }
        /** @return a {@link SDL_JoyBallEvent} view of the {@code jball} field. */
        public SDL_JoyBallEvent jball() { return SDL_Event.njball(address()); }
        /** @return a {@link SDL_JoyHatEvent} view of the {@code jhat} field. */
        public SDL_JoyHatEvent jhat() { return SDL_Event.njhat(address()); }
        /** @return a {@link SDL_JoyButtonEvent} view of the {@code jbutton} field. */
        public SDL_JoyButtonEvent jbutton() { return SDL_Event.njbutton(address()); }
        /** @return a {@link SDL_JoyBatteryEvent} view of the {@code jbattery} field. */
        public SDL_JoyBatteryEvent jbattery() { return SDL_Event.njbattery(address()); }
        /** @return a {@link SDL_GamepadDeviceEvent} view of the {@code gdevice} field. */
        public SDL_GamepadDeviceEvent gdevice() { return SDL_Event.ngdevice(address()); }
        /** @return a {@link SDL_GamepadAxisEvent} view of the {@code gaxis} field. */
        public SDL_GamepadAxisEvent gaxis() { return SDL_Event.ngaxis(address()); }
        /** @return a {@link SDL_GamepadButtonEvent} view of the {@code gbutton} field. */
        public SDL_GamepadButtonEvent gbutton() { return SDL_Event.ngbutton(address()); }
        /** @return a {@link SDL_GamepadTouchpadEvent} view of the {@code gtouchpad} field. */
        public SDL_GamepadTouchpadEvent gtouchpad() { return SDL_Event.ngtouchpad(address()); }
        /** @return a {@link SDL_GamepadSensorEvent} view of the {@code gsensor} field. */
        public SDL_GamepadSensorEvent gsensor() { return SDL_Event.ngsensor(address()); }
        /** @return a {@link SDL_AudioDeviceEvent} view of the {@code adevice} field. */
        public SDL_AudioDeviceEvent adevice() { return SDL_Event.nadevice(address()); }
        /** @return a {@link SDL_CameraDeviceEvent} view of the {@code cdevice} field. */
        public SDL_CameraDeviceEvent cdevice() { return SDL_Event.ncdevice(address()); }
        /** @return a {@link SDL_SensorEvent} view of the {@code sensor} field. */
        public SDL_SensorEvent sensor() { return SDL_Event.nsensor(address()); }
        /** @return a {@link SDL_QuitEvent} view of the {@code quit} field. */
        public SDL_QuitEvent quit() { return SDL_Event.nquit(address()); }
        /** @return a {@link SDL_UserEvent} view of the {@code user} field. */
        public SDL_UserEvent user() { return SDL_Event.nuser(address()); }
        /** @return a {@link SDL_TouchFingerEvent} view of the {@code tfinger} field. */
        public SDL_TouchFingerEvent tfinger() { return SDL_Event.ntfinger(address()); }
        /** @return a {@link SDL_PenProximityEvent} view of the {@code pproximity} field. */
        public SDL_PenProximityEvent pproximity() { return SDL_Event.npproximity(address()); }
        /** @return a {@link SDL_PenTouchEvent} view of the {@code ptouch} field. */
        public SDL_PenTouchEvent ptouch() { return SDL_Event.nptouch(address()); }
        /** @return a {@link SDL_PenMotionEvent} view of the {@code pmotion} field. */
        public SDL_PenMotionEvent pmotion() { return SDL_Event.npmotion(address()); }
        /** @return a {@link SDL_PenButtonEvent} view of the {@code pbutton} field. */
        public SDL_PenButtonEvent pbutton() { return SDL_Event.npbutton(address()); }
        /** @return a {@link SDL_PenAxisEvent} view of the {@code paxis} field. */
        public SDL_PenAxisEvent paxis() { return SDL_Event.npaxis(address()); }
        /** @return a {@link SDL_RenderEvent} view of the {@code render} field. */
        public SDL_RenderEvent render() { return SDL_Event.nrender(address()); }
        /** @return a {@link SDL_DropEvent} view of the {@code drop} field. */
        public SDL_DropEvent drop() { return SDL_Event.ndrop(address()); }
        /** @return a {@link SDL_ClipboardEvent} view of the {@code clipboard} field. */
        public SDL_ClipboardEvent clipboard() { return SDL_Event.nclipboard(address()); }

        /** Sets the specified value to the {@code type} field. */
        public SDL_Event.Buffer type(@NativeType("Uint32") int value) { SDL_Event.ntype(address(), value); return this; }
        /** Copies the specified {@link SDL_CommonEvent} to the {@code common} field. */
        public SDL_Event.Buffer common(SDL_CommonEvent value) { SDL_Event.ncommon(address(), value); return this; }
        /** Passes the {@code common} field to the specified {@link java.util.function.Consumer Consumer}. */
        public SDL_Event.Buffer common(java.util.function.Consumer<SDL_CommonEvent> consumer) { consumer.accept(common()); return this; }
        /** Copies the specified {@link SDL_DisplayEvent} to the {@code display} field. */
        public SDL_Event.Buffer display(SDL_DisplayEvent value) { SDL_Event.ndisplay(address(), value); return this; }
        /** Passes the {@code display} field to the specified {@link java.util.function.Consumer Consumer}. */
        public SDL_Event.Buffer display(java.util.function.Consumer<SDL_DisplayEvent> consumer) { consumer.accept(display()); return this; }
        /** Copies the specified {@link SDL_WindowEvent} to the {@code window} field. */
        public SDL_Event.Buffer window(SDL_WindowEvent value) { SDL_Event.nwindow(address(), value); return this; }
        /** Passes the {@code window} field to the specified {@link java.util.function.Consumer Consumer}. */
        public SDL_Event.Buffer window(java.util.function.Consumer<SDL_WindowEvent> consumer) { consumer.accept(window()); return this; }
        /** Copies the specified {@link SDL_KeyboardDeviceEvent} to the {@code kdevice} field. */
        public SDL_Event.Buffer kdevice(SDL_KeyboardDeviceEvent value) { SDL_Event.nkdevice(address(), value); return this; }
        /** Passes the {@code kdevice} field to the specified {@link java.util.function.Consumer Consumer}. */
        public SDL_Event.Buffer kdevice(java.util.function.Consumer<SDL_KeyboardDeviceEvent> consumer) { consumer.accept(kdevice()); return this; }
        /** Copies the specified {@link SDL_KeyboardEvent} to the {@code key} field. */
        public SDL_Event.Buffer key(SDL_KeyboardEvent value) { SDL_Event.nkey(address(), value); return this; }
        /** Passes the {@code key} field to the specified {@link java.util.function.Consumer Consumer}. */
        public SDL_Event.Buffer key(java.util.function.Consumer<SDL_KeyboardEvent> consumer) { consumer.accept(key()); return this; }
        /** Copies the specified {@link SDL_TextEditingEvent} to the {@code edit} field. */
        public SDL_Event.Buffer edit(SDL_TextEditingEvent value) { SDL_Event.nedit(address(), value); return this; }
        /** Passes the {@code edit} field to the specified {@link java.util.function.Consumer Consumer}. */
        public SDL_Event.Buffer edit(java.util.function.Consumer<SDL_TextEditingEvent> consumer) { consumer.accept(edit()); return this; }
        /** Copies the specified {@link SDL_TextEditingCandidatesEvent} to the {@code edit_candidates} field. */
        public SDL_Event.Buffer edit_candidates(SDL_TextEditingCandidatesEvent value) { SDL_Event.nedit_candidates(address(), value); return this; }
        /** Passes the {@code edit_candidates} field to the specified {@link java.util.function.Consumer Consumer}. */
        public SDL_Event.Buffer edit_candidates(java.util.function.Consumer<SDL_TextEditingCandidatesEvent> consumer) { consumer.accept(edit_candidates()); return this; }
        /** Copies the specified {@link SDL_TextInputEvent} to the {@code text} field. */
        public SDL_Event.Buffer text(SDL_TextInputEvent value) { SDL_Event.ntext(address(), value); return this; }
        /** Passes the {@code text} field to the specified {@link java.util.function.Consumer Consumer}. */
        public SDL_Event.Buffer text(java.util.function.Consumer<SDL_TextInputEvent> consumer) { consumer.accept(text()); return this; }
        /** Copies the specified {@link SDL_MouseDeviceEvent} to the {@code mdevice} field. */
        public SDL_Event.Buffer mdevice(SDL_MouseDeviceEvent value) { SDL_Event.nmdevice(address(), value); return this; }
        /** Passes the {@code mdevice} field to the specified {@link java.util.function.Consumer Consumer}. */
        public SDL_Event.Buffer mdevice(java.util.function.Consumer<SDL_MouseDeviceEvent> consumer) { consumer.accept(mdevice()); return this; }
        /** Copies the specified {@link SDL_MouseMotionEvent} to the {@code motion} field. */
        public SDL_Event.Buffer motion(SDL_MouseMotionEvent value) { SDL_Event.nmotion(address(), value); return this; }
        /** Passes the {@code motion} field to the specified {@link java.util.function.Consumer Consumer}. */
        public SDL_Event.Buffer motion(java.util.function.Consumer<SDL_MouseMotionEvent> consumer) { consumer.accept(motion()); return this; }
        /** Copies the specified {@link SDL_MouseButtonEvent} to the {@code button} field. */
        public SDL_Event.Buffer button(SDL_MouseButtonEvent value) { SDL_Event.nbutton(address(), value); return this; }
        /** Passes the {@code button} field to the specified {@link java.util.function.Consumer Consumer}. */
        public SDL_Event.Buffer button(java.util.function.Consumer<SDL_MouseButtonEvent> consumer) { consumer.accept(button()); return this; }
        /** Copies the specified {@link SDL_MouseWheelEvent} to the {@code wheel} field. */
        public SDL_Event.Buffer wheel(SDL_MouseWheelEvent value) { SDL_Event.nwheel(address(), value); return this; }
        /** Passes the {@code wheel} field to the specified {@link java.util.function.Consumer Consumer}. */
        public SDL_Event.Buffer wheel(java.util.function.Consumer<SDL_MouseWheelEvent> consumer) { consumer.accept(wheel()); return this; }
        /** Copies the specified {@link SDL_JoyDeviceEvent} to the {@code jdevice} field. */
        public SDL_Event.Buffer jdevice(SDL_JoyDeviceEvent value) { SDL_Event.njdevice(address(), value); return this; }
        /** Passes the {@code jdevice} field to the specified {@link java.util.function.Consumer Consumer}. */
        public SDL_Event.Buffer jdevice(java.util.function.Consumer<SDL_JoyDeviceEvent> consumer) { consumer.accept(jdevice()); return this; }
        /** Copies the specified {@link SDL_JoyAxisEvent} to the {@code jaxis} field. */
        public SDL_Event.Buffer jaxis(SDL_JoyAxisEvent value) { SDL_Event.njaxis(address(), value); return this; }
        /** Passes the {@code jaxis} field to the specified {@link java.util.function.Consumer Consumer}. */
        public SDL_Event.Buffer jaxis(java.util.function.Consumer<SDL_JoyAxisEvent> consumer) { consumer.accept(jaxis()); return this; }
        /** Copies the specified {@link SDL_JoyBallEvent} to the {@code jball} field. */
        public SDL_Event.Buffer jball(SDL_JoyBallEvent value) { SDL_Event.njball(address(), value); return this; }
        /** Passes the {@code jball} field to the specified {@link java.util.function.Consumer Consumer}. */
        public SDL_Event.Buffer jball(java.util.function.Consumer<SDL_JoyBallEvent> consumer) { consumer.accept(jball()); return this; }
        /** Copies the specified {@link SDL_JoyHatEvent} to the {@code jhat} field. */
        public SDL_Event.Buffer jhat(SDL_JoyHatEvent value) { SDL_Event.njhat(address(), value); return this; }
        /** Passes the {@code jhat} field to the specified {@link java.util.function.Consumer Consumer}. */
        public SDL_Event.Buffer jhat(java.util.function.Consumer<SDL_JoyHatEvent> consumer) { consumer.accept(jhat()); return this; }
        /** Copies the specified {@link SDL_JoyButtonEvent} to the {@code jbutton} field. */
        public SDL_Event.Buffer jbutton(SDL_JoyButtonEvent value) { SDL_Event.njbutton(address(), value); return this; }
        /** Passes the {@code jbutton} field to the specified {@link java.util.function.Consumer Consumer}. */
        public SDL_Event.Buffer jbutton(java.util.function.Consumer<SDL_JoyButtonEvent> consumer) { consumer.accept(jbutton()); return this; }
        /** Copies the specified {@link SDL_JoyBatteryEvent} to the {@code jbattery} field. */
        public SDL_Event.Buffer jbattery(SDL_JoyBatteryEvent value) { SDL_Event.njbattery(address(), value); return this; }
        /** Passes the {@code jbattery} field to the specified {@link java.util.function.Consumer Consumer}. */
        public SDL_Event.Buffer jbattery(java.util.function.Consumer<SDL_JoyBatteryEvent> consumer) { consumer.accept(jbattery()); return this; }
        /** Copies the specified {@link SDL_GamepadDeviceEvent} to the {@code gdevice} field. */
        public SDL_Event.Buffer gdevice(SDL_GamepadDeviceEvent value) { SDL_Event.ngdevice(address(), value); return this; }
        /** Passes the {@code gdevice} field to the specified {@link java.util.function.Consumer Consumer}. */
        public SDL_Event.Buffer gdevice(java.util.function.Consumer<SDL_GamepadDeviceEvent> consumer) { consumer.accept(gdevice()); return this; }
        /** Copies the specified {@link SDL_GamepadAxisEvent} to the {@code gaxis} field. */
        public SDL_Event.Buffer gaxis(SDL_GamepadAxisEvent value) { SDL_Event.ngaxis(address(), value); return this; }
        /** Passes the {@code gaxis} field to the specified {@link java.util.function.Consumer Consumer}. */
        public SDL_Event.Buffer gaxis(java.util.function.Consumer<SDL_GamepadAxisEvent> consumer) { consumer.accept(gaxis()); return this; }
        /** Copies the specified {@link SDL_GamepadButtonEvent} to the {@code gbutton} field. */
        public SDL_Event.Buffer gbutton(SDL_GamepadButtonEvent value) { SDL_Event.ngbutton(address(), value); return this; }
        /** Passes the {@code gbutton} field to the specified {@link java.util.function.Consumer Consumer}. */
        public SDL_Event.Buffer gbutton(java.util.function.Consumer<SDL_GamepadButtonEvent> consumer) { consumer.accept(gbutton()); return this; }
        /** Copies the specified {@link SDL_GamepadTouchpadEvent} to the {@code gtouchpad} field. */
        public SDL_Event.Buffer gtouchpad(SDL_GamepadTouchpadEvent value) { SDL_Event.ngtouchpad(address(), value); return this; }
        /** Passes the {@code gtouchpad} field to the specified {@link java.util.function.Consumer Consumer}. */
        public SDL_Event.Buffer gtouchpad(java.util.function.Consumer<SDL_GamepadTouchpadEvent> consumer) { consumer.accept(gtouchpad()); return this; }
        /** Copies the specified {@link SDL_GamepadSensorEvent} to the {@code gsensor} field. */
        public SDL_Event.Buffer gsensor(SDL_GamepadSensorEvent value) { SDL_Event.ngsensor(address(), value); return this; }
        /** Passes the {@code gsensor} field to the specified {@link java.util.function.Consumer Consumer}. */
        public SDL_Event.Buffer gsensor(java.util.function.Consumer<SDL_GamepadSensorEvent> consumer) { consumer.accept(gsensor()); return this; }
        /** Copies the specified {@link SDL_AudioDeviceEvent} to the {@code adevice} field. */
        public SDL_Event.Buffer adevice(SDL_AudioDeviceEvent value) { SDL_Event.nadevice(address(), value); return this; }
        /** Passes the {@code adevice} field to the specified {@link java.util.function.Consumer Consumer}. */
        public SDL_Event.Buffer adevice(java.util.function.Consumer<SDL_AudioDeviceEvent> consumer) { consumer.accept(adevice()); return this; }
        /** Copies the specified {@link SDL_CameraDeviceEvent} to the {@code cdevice} field. */
        public SDL_Event.Buffer cdevice(SDL_CameraDeviceEvent value) { SDL_Event.ncdevice(address(), value); return this; }
        /** Passes the {@code cdevice} field to the specified {@link java.util.function.Consumer Consumer}. */
        public SDL_Event.Buffer cdevice(java.util.function.Consumer<SDL_CameraDeviceEvent> consumer) { consumer.accept(cdevice()); return this; }
        /** Copies the specified {@link SDL_SensorEvent} to the {@code sensor} field. */
        public SDL_Event.Buffer sensor(SDL_SensorEvent value) { SDL_Event.nsensor(address(), value); return this; }
        /** Passes the {@code sensor} field to the specified {@link java.util.function.Consumer Consumer}. */
        public SDL_Event.Buffer sensor(java.util.function.Consumer<SDL_SensorEvent> consumer) { consumer.accept(sensor()); return this; }
        /** Copies the specified {@link SDL_QuitEvent} to the {@code quit} field. */
        public SDL_Event.Buffer quit(SDL_QuitEvent value) { SDL_Event.nquit(address(), value); return this; }
        /** Passes the {@code quit} field to the specified {@link java.util.function.Consumer Consumer}. */
        public SDL_Event.Buffer quit(java.util.function.Consumer<SDL_QuitEvent> consumer) { consumer.accept(quit()); return this; }
        /** Copies the specified {@link SDL_UserEvent} to the {@code user} field. */
        public SDL_Event.Buffer user(SDL_UserEvent value) { SDL_Event.nuser(address(), value); return this; }
        /** Passes the {@code user} field to the specified {@link java.util.function.Consumer Consumer}. */
        public SDL_Event.Buffer user(java.util.function.Consumer<SDL_UserEvent> consumer) { consumer.accept(user()); return this; }
        /** Copies the specified {@link SDL_TouchFingerEvent} to the {@code tfinger} field. */
        public SDL_Event.Buffer tfinger(SDL_TouchFingerEvent value) { SDL_Event.ntfinger(address(), value); return this; }
        /** Passes the {@code tfinger} field to the specified {@link java.util.function.Consumer Consumer}. */
        public SDL_Event.Buffer tfinger(java.util.function.Consumer<SDL_TouchFingerEvent> consumer) { consumer.accept(tfinger()); return this; }
        /** Copies the specified {@link SDL_PenProximityEvent} to the {@code pproximity} field. */
        public SDL_Event.Buffer pproximity(SDL_PenProximityEvent value) { SDL_Event.npproximity(address(), value); return this; }
        /** Passes the {@code pproximity} field to the specified {@link java.util.function.Consumer Consumer}. */
        public SDL_Event.Buffer pproximity(java.util.function.Consumer<SDL_PenProximityEvent> consumer) { consumer.accept(pproximity()); return this; }
        /** Copies the specified {@link SDL_PenTouchEvent} to the {@code ptouch} field. */
        public SDL_Event.Buffer ptouch(SDL_PenTouchEvent value) { SDL_Event.nptouch(address(), value); return this; }
        /** Passes the {@code ptouch} field to the specified {@link java.util.function.Consumer Consumer}. */
        public SDL_Event.Buffer ptouch(java.util.function.Consumer<SDL_PenTouchEvent> consumer) { consumer.accept(ptouch()); return this; }
        /** Copies the specified {@link SDL_PenMotionEvent} to the {@code pmotion} field. */
        public SDL_Event.Buffer pmotion(SDL_PenMotionEvent value) { SDL_Event.npmotion(address(), value); return this; }
        /** Passes the {@code pmotion} field to the specified {@link java.util.function.Consumer Consumer}. */
        public SDL_Event.Buffer pmotion(java.util.function.Consumer<SDL_PenMotionEvent> consumer) { consumer.accept(pmotion()); return this; }
        /** Copies the specified {@link SDL_PenButtonEvent} to the {@code pbutton} field. */
        public SDL_Event.Buffer pbutton(SDL_PenButtonEvent value) { SDL_Event.npbutton(address(), value); return this; }
        /** Passes the {@code pbutton} field to the specified {@link java.util.function.Consumer Consumer}. */
        public SDL_Event.Buffer pbutton(java.util.function.Consumer<SDL_PenButtonEvent> consumer) { consumer.accept(pbutton()); return this; }
        /** Copies the specified {@link SDL_PenAxisEvent} to the {@code paxis} field. */
        public SDL_Event.Buffer paxis(SDL_PenAxisEvent value) { SDL_Event.npaxis(address(), value); return this; }
        /** Passes the {@code paxis} field to the specified {@link java.util.function.Consumer Consumer}. */
        public SDL_Event.Buffer paxis(java.util.function.Consumer<SDL_PenAxisEvent> consumer) { consumer.accept(paxis()); return this; }
        /** Copies the specified {@link SDL_RenderEvent} to the {@code render} field. */
        public SDL_Event.Buffer render(SDL_RenderEvent value) { SDL_Event.nrender(address(), value); return this; }
        /** Passes the {@code render} field to the specified {@link java.util.function.Consumer Consumer}. */
        public SDL_Event.Buffer render(java.util.function.Consumer<SDL_RenderEvent> consumer) { consumer.accept(render()); return this; }
        /** Copies the specified {@link SDL_DropEvent} to the {@code drop} field. */
        public SDL_Event.Buffer drop(SDL_DropEvent value) { SDL_Event.ndrop(address(), value); return this; }
        /** Passes the {@code drop} field to the specified {@link java.util.function.Consumer Consumer}. */
        public SDL_Event.Buffer drop(java.util.function.Consumer<SDL_DropEvent> consumer) { consumer.accept(drop()); return this; }
        /** Copies the specified {@link SDL_ClipboardEvent} to the {@code clipboard} field. */
        public SDL_Event.Buffer clipboard(SDL_ClipboardEvent value) { SDL_Event.nclipboard(address(), value); return this; }
        /** Passes the {@code clipboard} field to the specified {@link java.util.function.Consumer Consumer}. */
        public SDL_Event.Buffer clipboard(java.util.function.Consumer<SDL_ClipboardEvent> consumer) { consumer.accept(clipboard()); return this; }

    }

}