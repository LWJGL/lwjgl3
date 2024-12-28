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
public abstract class SDL_VirtualJoystickDescCleanupCallback extends Callback implements SDL_VirtualJoystickDescCleanupCallbackI {

    /**
     * Creates a {@code SDL_VirtualJoystickDescCleanupCallback} instance from the specified function pointer.
     *
     * @return the new {@code SDL_VirtualJoystickDescCleanupCallback}
     */
    public static SDL_VirtualJoystickDescCleanupCallback create(long functionPointer) {
        SDL_VirtualJoystickDescCleanupCallbackI instance = Callback.get(functionPointer);
        return instance instanceof SDL_VirtualJoystickDescCleanupCallback
            ? (SDL_VirtualJoystickDescCleanupCallback)instance
            : new Container(functionPointer, instance);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code functionPointer} is {@code NULL}. */
    public static @Nullable SDL_VirtualJoystickDescCleanupCallback createSafe(long functionPointer) {
        return functionPointer == NULL ? null : create(functionPointer);
    }

    /** Creates a {@code SDL_VirtualJoystickDescCleanupCallback} instance that delegates to the specified {@code SDL_VirtualJoystickDescCleanupCallbackI} instance. */
    public static SDL_VirtualJoystickDescCleanupCallback create(SDL_VirtualJoystickDescCleanupCallbackI instance) {
        return instance instanceof SDL_VirtualJoystickDescCleanupCallback
            ? (SDL_VirtualJoystickDescCleanupCallback)instance
            : new Container(instance.address(), instance);
    }

    protected SDL_VirtualJoystickDescCleanupCallback() {
        super(CIF);
    }

    SDL_VirtualJoystickDescCleanupCallback(long functionPointer) {
        super(functionPointer);
    }

    private static final class Container extends SDL_VirtualJoystickDescCleanupCallback {

        private final SDL_VirtualJoystickDescCleanupCallbackI delegate;

        Container(long functionPointer, SDL_VirtualJoystickDescCleanupCallbackI delegate) {
            super(functionPointer);
            this.delegate = delegate;
        }

        @Override
        public void invoke(long userdata) {
            delegate.invoke(userdata);
        }

    }

}