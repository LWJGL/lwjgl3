/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.sdl;

import org.jspecify.annotations.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;

/** Callback function: {@link #invoke SDL_NSTimerCallback} */
public abstract class SDL_NSTimerCallback extends Callback implements SDL_NSTimerCallbackI {

    /**
     * Creates a {@code SDL_NSTimerCallback} instance from the specified function pointer.
     *
     * @return the new {@code SDL_NSTimerCallback}
     */
    public static SDL_NSTimerCallback create(long functionPointer) { return create(Callback.get(functionPointer), functionPointer); }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code functionPointer} is {@code NULL}. */
    public static @Nullable SDL_NSTimerCallback createSafe(long functionPointer) { return functionPointer == NULL ? null : create(functionPointer); }

    /** Creates a {@code SDL_NSTimerCallback} instance that delegates to the specified {@code SDL_NSTimerCallbackI} instance. */
    public static SDL_NSTimerCallback create(SDL_NSTimerCallbackI instance) { return create(instance, instance.address()); }

    private static SDL_NSTimerCallback create(SDL_NSTimerCallbackI instance, long functionPointer) {
        return instance instanceof SDL_NSTimerCallback
            ? (SDL_NSTimerCallback)instance
            : new SDL_NSTimerCallback(functionPointer) {
                @Override public long invoke(long userdata, int timerID, long interval) {
                    return instance.invoke(userdata, timerID, interval);
                }
            };
    }

    protected SDL_NSTimerCallback() {
        super(DESCRIPTOR);
    }

    SDL_NSTimerCallback(long functionPointer) {
        super(functionPointer);
    }

}