/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.sdl;

import org.jspecify.annotations.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;

/** Callback function: {@link #invoke SDL_TimerCallback} */
public abstract class SDL_TimerCallback extends Callback implements SDL_TimerCallbackI {

    /**
     * Creates a {@code SDL_TimerCallback} instance from the specified function pointer.
     *
     * @return the new {@code SDL_TimerCallback}
     */
    public static SDL_TimerCallback create(long functionPointer) { return create(Callback.get(functionPointer), functionPointer); }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code functionPointer} is {@code NULL}. */
    public static @Nullable SDL_TimerCallback createSafe(long functionPointer) { return functionPointer == NULL ? null : create(functionPointer); }

    /** Creates a {@code SDL_TimerCallback} instance that delegates to the specified {@code SDL_TimerCallbackI} instance. */
    public static SDL_TimerCallback create(SDL_TimerCallbackI instance) { return create(instance, instance.address()); }

    private static SDL_TimerCallback create(SDL_TimerCallbackI instance, long functionPointer) {
        return instance instanceof SDL_TimerCallback
            ? (SDL_TimerCallback)instance
            : new SDL_TimerCallback(functionPointer) {
                @Override public int invoke(long userdata, int timerID, int interval) {
                    return instance.invoke(userdata, timerID, interval);
                }
            };
    }

    protected SDL_TimerCallback() {
        super(DESCRIPTOR);
    }

    SDL_TimerCallback(long functionPointer) {
        super(functionPointer);
    }

}