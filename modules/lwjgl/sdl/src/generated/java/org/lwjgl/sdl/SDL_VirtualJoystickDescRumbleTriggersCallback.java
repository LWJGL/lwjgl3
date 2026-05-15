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
    public static SDL_VirtualJoystickDescRumbleTriggersCallback create(long functionPointer) { return create(Callback.get(functionPointer), functionPointer); }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code functionPointer} is {@code NULL}. */
    public static @Nullable SDL_VirtualJoystickDescRumbleTriggersCallback createSafe(long functionPointer) { return functionPointer == NULL ? null : create(functionPointer); }

    /** Creates a {@code SDL_VirtualJoystickDescRumbleTriggersCallback} instance that delegates to the specified {@code SDL_VirtualJoystickDescRumbleTriggersCallbackI} instance. */
    public static SDL_VirtualJoystickDescRumbleTriggersCallback create(SDL_VirtualJoystickDescRumbleTriggersCallbackI instance) { return create(instance, instance.address()); }

    private static SDL_VirtualJoystickDescRumbleTriggersCallback create(SDL_VirtualJoystickDescRumbleTriggersCallbackI instance, long functionPointer) {
        return instance instanceof SDL_VirtualJoystickDescRumbleTriggersCallback
            ? (SDL_VirtualJoystickDescRumbleTriggersCallback)instance
            : new SDL_VirtualJoystickDescRumbleTriggersCallback(functionPointer) {
                @Override public boolean invoke(long userdata, short left_rumble, short right_rumble) {
                    return instance.invoke(userdata, left_rumble, right_rumble);
                }
            };
    }

    protected SDL_VirtualJoystickDescRumbleTriggersCallback() {
        super(DESCRIPTOR);
    }

    SDL_VirtualJoystickDescRumbleTriggersCallback(long functionPointer) {
        super(functionPointer);
    }

}