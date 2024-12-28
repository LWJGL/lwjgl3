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
public abstract class SDL_VirtualJoystickDescSetSensorsEnabledCallback extends Callback implements SDL_VirtualJoystickDescSetSensorsEnabledCallbackI {

    /**
     * Creates a {@code SDL_VirtualJoystickDescSetSensorsEnabledCallback} instance from the specified function pointer.
     *
     * @return the new {@code SDL_VirtualJoystickDescSetSensorsEnabledCallback}
     */
    public static SDL_VirtualJoystickDescSetSensorsEnabledCallback create(long functionPointer) {
        SDL_VirtualJoystickDescSetSensorsEnabledCallbackI instance = Callback.get(functionPointer);
        return instance instanceof SDL_VirtualJoystickDescSetSensorsEnabledCallback
            ? (SDL_VirtualJoystickDescSetSensorsEnabledCallback)instance
            : new Container(functionPointer, instance);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code functionPointer} is {@code NULL}. */
    public static @Nullable SDL_VirtualJoystickDescSetSensorsEnabledCallback createSafe(long functionPointer) {
        return functionPointer == NULL ? null : create(functionPointer);
    }

    /** Creates a {@code SDL_VirtualJoystickDescSetSensorsEnabledCallback} instance that delegates to the specified {@code SDL_VirtualJoystickDescSetSensorsEnabledCallbackI} instance. */
    public static SDL_VirtualJoystickDescSetSensorsEnabledCallback create(SDL_VirtualJoystickDescSetSensorsEnabledCallbackI instance) {
        return instance instanceof SDL_VirtualJoystickDescSetSensorsEnabledCallback
            ? (SDL_VirtualJoystickDescSetSensorsEnabledCallback)instance
            : new Container(instance.address(), instance);
    }

    protected SDL_VirtualJoystickDescSetSensorsEnabledCallback() {
        super(CIF);
    }

    SDL_VirtualJoystickDescSetSensorsEnabledCallback(long functionPointer) {
        super(functionPointer);
    }

    private static final class Container extends SDL_VirtualJoystickDescSetSensorsEnabledCallback {

        private final SDL_VirtualJoystickDescSetSensorsEnabledCallbackI delegate;

        Container(long functionPointer, SDL_VirtualJoystickDescSetSensorsEnabledCallbackI delegate) {
            super(functionPointer);
            this.delegate = delegate;
        }

        @Override
        public boolean invoke(long userdata, boolean enabled) {
            return delegate.invoke(userdata, enabled);
        }

    }

}