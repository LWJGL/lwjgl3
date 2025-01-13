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
public abstract class SDL_VirtualJoystickDescSetPlayerIndexCallback extends Callback implements SDL_VirtualJoystickDescSetPlayerIndexCallbackI {

    /**
     * Creates a {@code SDL_VirtualJoystickDescSetPlayerIndexCallback} instance from the specified function pointer.
     *
     * @return the new {@code SDL_VirtualJoystickDescSetPlayerIndexCallback}
     */
    public static SDL_VirtualJoystickDescSetPlayerIndexCallback create(long functionPointer) {
        SDL_VirtualJoystickDescSetPlayerIndexCallbackI instance = Callback.get(functionPointer);
        return instance instanceof SDL_VirtualJoystickDescSetPlayerIndexCallback
            ? (SDL_VirtualJoystickDescSetPlayerIndexCallback)instance
            : new Container(functionPointer, instance);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code functionPointer} is {@code NULL}. */
    public static @Nullable SDL_VirtualJoystickDescSetPlayerIndexCallback createSafe(long functionPointer) {
        return functionPointer == NULL ? null : create(functionPointer);
    }

    /** Creates a {@code SDL_VirtualJoystickDescSetPlayerIndexCallback} instance that delegates to the specified {@code SDL_VirtualJoystickDescSetPlayerIndexCallbackI} instance. */
    public static SDL_VirtualJoystickDescSetPlayerIndexCallback create(SDL_VirtualJoystickDescSetPlayerIndexCallbackI instance) {
        return instance instanceof SDL_VirtualJoystickDescSetPlayerIndexCallback
            ? (SDL_VirtualJoystickDescSetPlayerIndexCallback)instance
            : new Container(instance.address(), instance);
    }

    protected SDL_VirtualJoystickDescSetPlayerIndexCallback() {
        super(CIF);
    }

    SDL_VirtualJoystickDescSetPlayerIndexCallback(long functionPointer) {
        super(functionPointer);
    }

    private static final class Container extends SDL_VirtualJoystickDescSetPlayerIndexCallback {

        private final SDL_VirtualJoystickDescSetPlayerIndexCallbackI delegate;

        Container(long functionPointer, SDL_VirtualJoystickDescSetPlayerIndexCallbackI delegate) {
            super(functionPointer);
            this.delegate = delegate;
        }

        @Override
        public void invoke(long userdata, int player_index) {
            delegate.invoke(userdata, player_index);
        }

    }

}