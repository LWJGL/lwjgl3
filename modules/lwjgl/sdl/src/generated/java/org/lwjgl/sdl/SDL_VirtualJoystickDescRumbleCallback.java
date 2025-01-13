/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.sdl;

import org.jspecify.annotations.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;

/** Callback function: {@link #invoke (* anonymous)} */
public abstract class SDL_VirtualJoystickDescRumbleCallback extends Callback implements SDL_VirtualJoystickDescRumbleCallbackI {

    /**
     * Creates a {@code SDL_VirtualJoystickDescRumbleCallback} instance from the specified function pointer.
     *
     * @return the new {@code SDL_VirtualJoystickDescRumbleCallback}
     */
    public static SDL_VirtualJoystickDescRumbleCallback create(long functionPointer) {
        SDL_VirtualJoystickDescRumbleCallbackI instance = Callback.get(functionPointer);
        return instance instanceof SDL_VirtualJoystickDescRumbleCallback
            ? (SDL_VirtualJoystickDescRumbleCallback)instance
            : new Container(functionPointer, instance);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code functionPointer} is {@code NULL}. */
    public static @Nullable SDL_VirtualJoystickDescRumbleCallback createSafe(long functionPointer) {
        return functionPointer == NULL ? null : create(functionPointer);
    }

    /** Creates a {@code SDL_VirtualJoystickDescRumbleCallback} instance that delegates to the specified {@code SDL_VirtualJoystickDescRumbleCallbackI} instance. */
    public static SDL_VirtualJoystickDescRumbleCallback create(SDL_VirtualJoystickDescRumbleCallbackI instance) {
        return instance instanceof SDL_VirtualJoystickDescRumbleCallback
            ? (SDL_VirtualJoystickDescRumbleCallback)instance
            : new Container(instance.address(), instance);
    }

    protected SDL_VirtualJoystickDescRumbleCallback() {
        super(CIF);
    }

    SDL_VirtualJoystickDescRumbleCallback(long functionPointer) {
        super(functionPointer);
    }

    private static final class Container extends SDL_VirtualJoystickDescRumbleCallback {

        private final SDL_VirtualJoystickDescRumbleCallbackI delegate;

        Container(long functionPointer, SDL_VirtualJoystickDescRumbleCallbackI delegate) {
            super(functionPointer);
            this.delegate = delegate;
        }

        @Override
        public boolean invoke(long userdata, short low_frequency_rumble, short high_frequency_rumble) {
            return delegate.invoke(userdata, low_frequency_rumble, high_frequency_rumble);
        }

    }

}