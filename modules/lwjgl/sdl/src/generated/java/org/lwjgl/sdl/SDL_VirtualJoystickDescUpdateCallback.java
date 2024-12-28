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
public abstract class SDL_VirtualJoystickDescUpdateCallback extends Callback implements SDL_VirtualJoystickDescUpdateCallbackI {

    /**
     * Creates a {@code SDL_VirtualJoystickDescUpdateCallback} instance from the specified function pointer.
     *
     * @return the new {@code SDL_VirtualJoystickDescUpdateCallback}
     */
    public static SDL_VirtualJoystickDescUpdateCallback create(long functionPointer) {
        SDL_VirtualJoystickDescUpdateCallbackI instance = Callback.get(functionPointer);
        return instance instanceof SDL_VirtualJoystickDescUpdateCallback
            ? (SDL_VirtualJoystickDescUpdateCallback)instance
            : new Container(functionPointer, instance);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code functionPointer} is {@code NULL}. */
    public static @Nullable SDL_VirtualJoystickDescUpdateCallback createSafe(long functionPointer) {
        return functionPointer == NULL ? null : create(functionPointer);
    }

    /** Creates a {@code SDL_VirtualJoystickDescUpdateCallback} instance that delegates to the specified {@code SDL_VirtualJoystickDescUpdateCallbackI} instance. */
    public static SDL_VirtualJoystickDescUpdateCallback create(SDL_VirtualJoystickDescUpdateCallbackI instance) {
        return instance instanceof SDL_VirtualJoystickDescUpdateCallback
            ? (SDL_VirtualJoystickDescUpdateCallback)instance
            : new Container(instance.address(), instance);
    }

    protected SDL_VirtualJoystickDescUpdateCallback() {
        super(CIF);
    }

    SDL_VirtualJoystickDescUpdateCallback(long functionPointer) {
        super(functionPointer);
    }

    private static final class Container extends SDL_VirtualJoystickDescUpdateCallback {

        private final SDL_VirtualJoystickDescUpdateCallbackI delegate;

        Container(long functionPointer, SDL_VirtualJoystickDescUpdateCallbackI delegate) {
            super(functionPointer);
            this.delegate = delegate;
        }

        @Override
        public void invoke(long userdata) {
            delegate.invoke(userdata);
        }

    }

}