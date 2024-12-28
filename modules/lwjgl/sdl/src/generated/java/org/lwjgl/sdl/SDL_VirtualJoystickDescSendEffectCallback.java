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
public abstract class SDL_VirtualJoystickDescSendEffectCallback extends Callback implements SDL_VirtualJoystickDescSendEffectCallbackI {

    /**
     * Creates a {@code SDL_VirtualJoystickDescSendEffectCallback} instance from the specified function pointer.
     *
     * @return the new {@code SDL_VirtualJoystickDescSendEffectCallback}
     */
    public static SDL_VirtualJoystickDescSendEffectCallback create(long functionPointer) {
        SDL_VirtualJoystickDescSendEffectCallbackI instance = Callback.get(functionPointer);
        return instance instanceof SDL_VirtualJoystickDescSendEffectCallback
            ? (SDL_VirtualJoystickDescSendEffectCallback)instance
            : new Container(functionPointer, instance);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code functionPointer} is {@code NULL}. */
    public static @Nullable SDL_VirtualJoystickDescSendEffectCallback createSafe(long functionPointer) {
        return functionPointer == NULL ? null : create(functionPointer);
    }

    /** Creates a {@code SDL_VirtualJoystickDescSendEffectCallback} instance that delegates to the specified {@code SDL_VirtualJoystickDescSendEffectCallbackI} instance. */
    public static SDL_VirtualJoystickDescSendEffectCallback create(SDL_VirtualJoystickDescSendEffectCallbackI instance) {
        return instance instanceof SDL_VirtualJoystickDescSendEffectCallback
            ? (SDL_VirtualJoystickDescSendEffectCallback)instance
            : new Container(instance.address(), instance);
    }

    protected SDL_VirtualJoystickDescSendEffectCallback() {
        super(CIF);
    }

    SDL_VirtualJoystickDescSendEffectCallback(long functionPointer) {
        super(functionPointer);
    }

    private static final class Container extends SDL_VirtualJoystickDescSendEffectCallback {

        private final SDL_VirtualJoystickDescSendEffectCallbackI delegate;

        Container(long functionPointer, SDL_VirtualJoystickDescSendEffectCallbackI delegate) {
            super(functionPointer);
            this.delegate = delegate;
        }

        @Override
        public boolean invoke(long userdata, long data, int size) {
            return delegate.invoke(userdata, data, size);
        }

    }

}