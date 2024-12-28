/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.sdl;

import org.jspecify.annotations.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;

/** Callback function: {@link #invoke SDL_AudioStreamCallback} */
public abstract class SDL_AudioStreamCallback extends Callback implements SDL_AudioStreamCallbackI {

    /**
     * Creates a {@code SDL_AudioStreamCallback} instance from the specified function pointer.
     *
     * @return the new {@code SDL_AudioStreamCallback}
     */
    public static SDL_AudioStreamCallback create(long functionPointer) {
        SDL_AudioStreamCallbackI instance = Callback.get(functionPointer);
        return instance instanceof SDL_AudioStreamCallback
            ? (SDL_AudioStreamCallback)instance
            : new Container(functionPointer, instance);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code functionPointer} is {@code NULL}. */
    public static @Nullable SDL_AudioStreamCallback createSafe(long functionPointer) {
        return functionPointer == NULL ? null : create(functionPointer);
    }

    /** Creates a {@code SDL_AudioStreamCallback} instance that delegates to the specified {@code SDL_AudioStreamCallbackI} instance. */
    public static SDL_AudioStreamCallback create(SDL_AudioStreamCallbackI instance) {
        return instance instanceof SDL_AudioStreamCallback
            ? (SDL_AudioStreamCallback)instance
            : new Container(instance.address(), instance);
    }

    protected SDL_AudioStreamCallback() {
        super(CIF);
    }

    SDL_AudioStreamCallback(long functionPointer) {
        super(functionPointer);
    }

    private static final class Container extends SDL_AudioStreamCallback {

        private final SDL_AudioStreamCallbackI delegate;

        Container(long functionPointer, SDL_AudioStreamCallbackI delegate) {
            super(functionPointer);
            this.delegate = delegate;
        }

        @Override
        public void invoke(long userdata, long stream, int additional_amount, int total_amount) {
            delegate.invoke(userdata, stream, additional_amount, total_amount);
        }

    }

}