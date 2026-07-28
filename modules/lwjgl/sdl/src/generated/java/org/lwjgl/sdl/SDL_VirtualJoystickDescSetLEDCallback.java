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
    public static SDL_VirtualJoystickDescSetLEDCallback create(long functionPointer) { return create(Callback.get(functionPointer), functionPointer); }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code functionPointer} is {@code NULL}. */
    public static @Nullable SDL_VirtualJoystickDescSetLEDCallback createSafe(long functionPointer) { return functionPointer == NULL ? null : create(functionPointer); }

    /** Creates a {@code SDL_VirtualJoystickDescSetLEDCallback} instance that delegates to the specified {@code SDL_VirtualJoystickDescSetLEDCallbackI} instance. */
    public static SDL_VirtualJoystickDescSetLEDCallback create(SDL_VirtualJoystickDescSetLEDCallbackI instance) { return create(instance, instance.address()); }

    private static SDL_VirtualJoystickDescSetLEDCallback create(SDL_VirtualJoystickDescSetLEDCallbackI instance, long functionPointer) {
        return instance instanceof SDL_VirtualJoystickDescSetLEDCallback
            ? (SDL_VirtualJoystickDescSetLEDCallback)instance
            : new SDL_VirtualJoystickDescSetLEDCallback(functionPointer) {
                @Override public boolean invoke(long userdata, byte red, byte green, byte blue) {
                    return instance.invoke(userdata, red, green, blue);
                }
            };
    }

    protected SDL_VirtualJoystickDescSetLEDCallback() {
        super(DESCRIPTOR);
    }

    SDL_VirtualJoystickDescSetLEDCallback(long functionPointer) {
        super(functionPointer);
    }

}