/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.sdl;

import org.jspecify.annotations.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;

/** Callback function: {@link #invoke SDL_AudioStreamDataCompleteCallback} */
public abstract class SDL_AudioStreamDataCompleteCallback extends Callback implements SDL_AudioStreamDataCompleteCallbackI {

    /**
     * Creates a {@code SDL_AudioStreamDataCompleteCallback} instance from the specified function pointer.
     *
     * @return the new {@code SDL_AudioStreamDataCompleteCallback}
     */
    public static SDL_AudioStreamDataCompleteCallback create(long functionPointer) {
        SDL_AudioStreamDataCompleteCallbackI instance = Callback.get(functionPointer);
        return instance instanceof SDL_AudioStreamDataCompleteCallback
            ? (SDL_AudioStreamDataCompleteCallback)instance
            : new Container(functionPointer, instance);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code functionPointer} is {@code NULL}. */
    public static @Nullable SDL_AudioStreamDataCompleteCallback createSafe(long functionPointer) {
        return functionPointer == NULL ? null : create(functionPointer);
    }

    /** Creates a {@code SDL_AudioStreamDataCompleteCallback} instance that delegates to the specified {@code SDL_AudioStreamDataCompleteCallbackI} instance. */
    public static SDL_AudioStreamDataCompleteCallback create(SDL_AudioStreamDataCompleteCallbackI instance) {
        return instance instanceof SDL_AudioStreamDataCompleteCallback
            ? (SDL_AudioStreamDataCompleteCallback)instance
            : new Container(instance.address(), instance);
    }

    protected SDL_AudioStreamDataCompleteCallback() {
        super(DESCRIPTOR);
    }

    SDL_AudioStreamDataCompleteCallback(long functionPointer) {
        super(functionPointer);
    }

    private static final class Container extends SDL_AudioStreamDataCompleteCallback {

        private final SDL_AudioStreamDataCompleteCallbackI delegate;

        Container(long functionPointer, SDL_AudioStreamDataCompleteCallbackI delegate) {
            super(functionPointer);
            this.delegate = delegate;
        }

        @Override
        public void invoke(long userdata, long buf, int buflen) {
            delegate.invoke(userdata, buf, buflen);
        }

    }

}