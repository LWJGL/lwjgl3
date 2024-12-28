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
public abstract class SDL_VirtualJoystickDescSetLEDCallback extends Callback implements SDL_VirtualJoystickDescSetLEDCallbackI {

    /**
     * Creates a {@code SDL_VirtualJoystickDescSetLEDCallback} instance from the specified function pointer.
     *
     * @return the new {@code SDL_VirtualJoystickDescSetLEDCallback}
     */
    public static SDL_VirtualJoystickDescSetLEDCallback create(long functionPointer) {
        SDL_VirtualJoystickDescSetLEDCallbackI instance = Callback.get(functionPointer);
        return instance instanceof SDL_VirtualJoystickDescSetLEDCallback
            ? (SDL_VirtualJoystickDescSetLEDCallback)instance
            : new Container(functionPointer, instance);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code functionPointer} is {@code NULL}. */
    public static @Nullable SDL_VirtualJoystickDescSetLEDCallback createSafe(long functionPointer) {
        return functionPointer == NULL ? null : create(functionPointer);
    }

    /** Creates a {@code SDL_VirtualJoystickDescSetLEDCallback} instance that delegates to the specified {@code SDL_VirtualJoystickDescSetLEDCallbackI} instance. */
    public static SDL_VirtualJoystickDescSetLEDCallback create(SDL_VirtualJoystickDescSetLEDCallbackI instance) {
        return instance instanceof SDL_VirtualJoystickDescSetLEDCallback
            ? (SDL_VirtualJoystickDescSetLEDCallback)instance
            : new Container(instance.address(), instance);
    }

    protected SDL_VirtualJoystickDescSetLEDCallback() {
        super(CIF);
    }

    SDL_VirtualJoystickDescSetLEDCallback(long functionPointer) {
        super(functionPointer);
    }

    private static final class Container extends SDL_VirtualJoystickDescSetLEDCallback {

        private final SDL_VirtualJoystickDescSetLEDCallbackI delegate;

        Container(long functionPointer, SDL_VirtualJoystickDescSetLEDCallbackI delegate) {
            super(functionPointer);
            this.delegate = delegate;
        }

        @Override
        public boolean invoke(long userdata, byte red, byte green, byte blue) {
            return delegate.invoke(userdata, red, green, blue);
        }

    }

}