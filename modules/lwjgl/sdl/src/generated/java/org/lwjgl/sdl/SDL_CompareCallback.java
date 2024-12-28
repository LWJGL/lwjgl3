/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.sdl;

import org.jspecify.annotations.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;

/** Callback function: {@link #invoke SDL_CompareCallback} */
public abstract class SDL_CompareCallback extends Callback implements SDL_CompareCallbackI {

    /**
     * Creates a {@code SDL_CompareCallback} instance from the specified function pointer.
     *
     * @return the new {@code SDL_CompareCallback}
     */
    public static SDL_CompareCallback create(long functionPointer) {
        SDL_CompareCallbackI instance = Callback.get(functionPointer);
        return instance instanceof SDL_CompareCallback
            ? (SDL_CompareCallback)instance
            : new Container(functionPointer, instance);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code functionPointer} is {@code NULL}. */
    public static @Nullable SDL_CompareCallback createSafe(long functionPointer) {
        return functionPointer == NULL ? null : create(functionPointer);
    }

    /** Creates a {@code SDL_CompareCallback} instance that delegates to the specified {@code SDL_CompareCallbackI} instance. */
    public static SDL_CompareCallback create(SDL_CompareCallbackI instance) {
        return instance instanceof SDL_CompareCallback
            ? (SDL_CompareCallback)instance
            : new Container(instance.address(), instance);
    }

    protected SDL_CompareCallback() {
        super(CIF);
    }

    SDL_CompareCallback(long functionPointer) {
        super(functionPointer);
    }

    private static final class Container extends SDL_CompareCallback {

        private final SDL_CompareCallbackI delegate;

        Container(long functionPointer, SDL_CompareCallbackI delegate) {
            super(functionPointer);
            this.delegate = delegate;
        }

        @Override
        public int invoke(long a, long b) {
            return delegate.invoke(a, b);
        }

    }

}