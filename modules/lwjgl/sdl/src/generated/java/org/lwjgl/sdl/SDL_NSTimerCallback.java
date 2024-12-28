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
    public static SDL_NSTimerCallback create(long functionPointer) {
        SDL_NSTimerCallbackI instance = Callback.get(functionPointer);
        return instance instanceof SDL_NSTimerCallback
            ? (SDL_NSTimerCallback)instance
            : new Container(functionPointer, instance);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code functionPointer} is {@code NULL}. */
    public static @Nullable SDL_NSTimerCallback createSafe(long functionPointer) {
        return functionPointer == NULL ? null : create(functionPointer);
    }

    /** Creates a {@code SDL_NSTimerCallback} instance that delegates to the specified {@code SDL_NSTimerCallbackI} instance. */
    public static SDL_NSTimerCallback create(SDL_NSTimerCallbackI instance) {
        return instance instanceof SDL_NSTimerCallback
            ? (SDL_NSTimerCallback)instance
            : new Container(instance.address(), instance);
    }

    protected SDL_NSTimerCallback() {
        super(CIF);
    }

    SDL_NSTimerCallback(long functionPointer) {
        super(functionPointer);
    }

    private static final class Container extends SDL_NSTimerCallback {

        private final SDL_NSTimerCallbackI delegate;

        Container(long functionPointer, SDL_NSTimerCallbackI delegate) {
            super(functionPointer);
            this.delegate = delegate;
        }

        @Override
        public long invoke(long userdata, int timerID, long interval) {
            return delegate.invoke(userdata, timerID, interval);
        }

    }

}