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
    public static SDL_VirtualJoystickDescUpdateCallback create(long functionPointer) { return create(Callback.get(functionPointer), functionPointer); }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code functionPointer} is {@code NULL}. */
    public static @Nullable SDL_VirtualJoystickDescUpdateCallback createSafe(long functionPointer) { return functionPointer == NULL ? null : create(functionPointer); }

    /** Creates a {@code SDL_VirtualJoystickDescUpdateCallback} instance that delegates to the specified {@code SDL_VirtualJoystickDescUpdateCallbackI} instance. */
    public static SDL_VirtualJoystickDescUpdateCallback create(SDL_VirtualJoystickDescUpdateCallbackI instance) { return create(instance, instance.address()); }

    private static SDL_VirtualJoystickDescUpdateCallback create(SDL_VirtualJoystickDescUpdateCallbackI instance, long functionPointer) {
        return instance instanceof SDL_VirtualJoystickDescUpdateCallback
            ? (SDL_VirtualJoystickDescUpdateCallback)instance
            : new SDL_VirtualJoystickDescUpdateCallback(functionPointer) {
                @Override public void invoke(long userdata) {
                    instance.invoke(userdata);
                }
            };
    }

    protected SDL_VirtualJoystickDescUpdateCallback() {
        super(DESCRIPTOR);
    }

    SDL_VirtualJoystickDescUpdateCallback(long functionPointer) {
        super(functionPointer);
    }

}