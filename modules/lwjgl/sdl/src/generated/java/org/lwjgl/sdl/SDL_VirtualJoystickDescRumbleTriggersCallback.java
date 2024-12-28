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
public abstract class SDL_VirtualJoystickDescRumbleTriggersCallback extends Callback implements SDL_VirtualJoystickDescRumbleTriggersCallbackI {

    /**
     * Creates a {@code SDL_VirtualJoystickDescRumbleTriggersCallback} instance from the specified function pointer.
     *
     * @return the new {@code SDL_VirtualJoystickDescRumbleTriggersCallback}
     */
    public static SDL_VirtualJoystickDescRumbleTriggersCallback create(long functionPointer) {
        SDL_VirtualJoystickDescRumbleTriggersCallbackI instance = Callback.get(functionPointer);
        return instance instanceof SDL_VirtualJoystickDescRumbleTriggersCallback
            ? (SDL_VirtualJoystickDescRumbleTriggersCallback)instance
            : new Container(functionPointer, instance);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code functionPointer} is {@code NULL}. */
    public static @Nullable SDL_VirtualJoystickDescRumbleTriggersCallback createSafe(long functionPointer) {
        return functionPointer == NULL ? null : create(functionPointer);
    }

    /** Creates a {@code SDL_VirtualJoystickDescRumbleTriggersCallback} instance that delegates to the specified {@code SDL_VirtualJoystickDescRumbleTriggersCallbackI} instance. */
    public static SDL_VirtualJoystickDescRumbleTriggersCallback create(SDL_VirtualJoystickDescRumbleTriggersCallbackI instance) {
        return instance instanceof SDL_VirtualJoystickDescRumbleTriggersCallback
            ? (SDL_VirtualJoystickDescRumbleTriggersCallback)instance
            : new Container(instance.address(), instance);
    }

    protected SDL_VirtualJoystickDescRumbleTriggersCallback() {
        super(CIF);
    }

    SDL_VirtualJoystickDescRumbleTriggersCallback(long functionPointer) {
        super(functionPointer);
    }

    private static final class Container extends SDL_VirtualJoystickDescRumbleTriggersCallback {

        private final SDL_VirtualJoystickDescRumbleTriggersCallbackI delegate;

        Container(long functionPointer, SDL_VirtualJoystickDescRumbleTriggersCallbackI delegate) {
            super(functionPointer);
            this.delegate = delegate;
        }

        @Override
        public boolean invoke(long userdata, short left_rumble, short right_rumble) {
            return delegate.invoke(userdata, left_rumble, right_rumble);
        }

    }

}