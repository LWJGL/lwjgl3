/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.sdl;

import org.jspecify.annotations.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;

/** Callback function: {@link #invoke SDL_MainThreadCallback} */
public abstract class SDL_MainThreadCallback extends Callback implements SDL_MainThreadCallbackI {

    /**
     * Creates a {@code SDL_MainThreadCallback} instance from the specified function pointer.
     *
     * @return the new {@code SDL_MainThreadCallback}
     */
    public static SDL_MainThreadCallback create(long functionPointer) {
        SDL_MainThreadCallbackI instance = Callback.get(functionPointer);
        return instance instanceof SDL_MainThreadCallback
            ? (SDL_MainThreadCallback)instance
            : new Container(functionPointer, instance);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code functionPointer} is {@code NULL}. */
    public static @Nullable SDL_MainThreadCallback createSafe(long functionPointer) {
        return functionPointer == NULL ? null : create(functionPointer);
    }

    /** Creates a {@code SDL_MainThreadCallback} instance that delegates to the specified {@code SDL_MainThreadCallbackI} instance. */
    public static SDL_MainThreadCallback create(SDL_MainThreadCallbackI instance) {
        return instance instanceof SDL_MainThreadCallback
            ? (SDL_MainThreadCallback)instance
            : new Container(instance.address(), instance);
    }

    protected SDL_MainThreadCallback() {
        super(CIF);
    }

    SDL_MainThreadCallback(long functionPointer) {
        super(functionPointer);
    }

    private static final class Container extends SDL_MainThreadCallback {

        private final SDL_MainThreadCallbackI delegate;

        Container(long functionPointer, SDL_MainThreadCallbackI delegate) {
            super(functionPointer);
            this.delegate = delegate;
        }

        @Override
        public void invoke(long userdata) {
            delegate.invoke(userdata);
        }

    }

}