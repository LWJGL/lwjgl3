/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.sdl;

import org.jspecify.annotations.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;

/** Callback function: {@link #invoke SDL_AudioPostmixCallback} */
public abstract class SDL_AudioPostmixCallback extends Callback implements SDL_AudioPostmixCallbackI {

    /**
     * Creates a {@code SDL_AudioPostmixCallback} instance from the specified function pointer.
     *
     * @return the new {@code SDL_AudioPostmixCallback}
     */
    public static SDL_AudioPostmixCallback create(long functionPointer) {
        SDL_AudioPostmixCallbackI instance = Callback.get(functionPointer);
        return instance instanceof SDL_AudioPostmixCallback
            ? (SDL_AudioPostmixCallback)instance
            : new Container(functionPointer, instance);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code functionPointer} is {@code NULL}. */
    public static @Nullable SDL_AudioPostmixCallback createSafe(long functionPointer) {
        return functionPointer == NULL ? null : create(functionPointer);
    }

    /** Creates a {@code SDL_AudioPostmixCallback} instance that delegates to the specified {@code SDL_AudioPostmixCallbackI} instance. */
    public static SDL_AudioPostmixCallback create(SDL_AudioPostmixCallbackI instance) {
        return instance instanceof SDL_AudioPostmixCallback
            ? (SDL_AudioPostmixCallback)instance
            : new Container(instance.address(), instance);
    }

    protected SDL_AudioPostmixCallback() {
        super(CIF);
    }

    SDL_AudioPostmixCallback(long functionPointer) {
        super(functionPointer);
    }

    private static final class Container extends SDL_AudioPostmixCallback {

        private final SDL_AudioPostmixCallbackI delegate;

        Container(long functionPointer, SDL_AudioPostmixCallbackI delegate) {
            super(functionPointer);
            this.delegate = delegate;
        }

        @Override
        public void invoke(long userdata, long spec, long buffer, int buflen) {
            delegate.invoke(userdata, spec, buffer, buflen);
        }

    }

}