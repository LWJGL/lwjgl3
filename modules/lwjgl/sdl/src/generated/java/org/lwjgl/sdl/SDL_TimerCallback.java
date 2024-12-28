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
    public static SDL_TimerCallback create(long functionPointer) {
        SDL_TimerCallbackI instance = Callback.get(functionPointer);
        return instance instanceof SDL_TimerCallback
            ? (SDL_TimerCallback)instance
            : new Container(functionPointer, instance);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code functionPointer} is {@code NULL}. */
    public static @Nullable SDL_TimerCallback createSafe(long functionPointer) {
        return functionPointer == NULL ? null : create(functionPointer);
    }

    /** Creates a {@code SDL_TimerCallback} instance that delegates to the specified {@code SDL_TimerCallbackI} instance. */
    public static SDL_TimerCallback create(SDL_TimerCallbackI instance) {
        return instance instanceof SDL_TimerCallback
            ? (SDL_TimerCallback)instance
            : new Container(instance.address(), instance);
    }

    protected SDL_TimerCallback() {
        super(CIF);
    }

    SDL_TimerCallback(long functionPointer) {
        super(functionPointer);
    }

    private static final class Container extends SDL_TimerCallback {

        private final SDL_TimerCallbackI delegate;

        Container(long functionPointer, SDL_TimerCallbackI delegate) {
            super(functionPointer);
            this.delegate = delegate;
        }

        @Override
        public int invoke(long userdata, int timerID, int interval) {
            return delegate.invoke(userdata, timerID, interval);
        }

    }

}