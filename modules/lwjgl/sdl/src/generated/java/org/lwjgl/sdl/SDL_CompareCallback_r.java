/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.sdl;

import org.jspecify.annotations.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;

/** Callback function: {@link #invoke SDL_CompareCallback_r} */
public abstract class SDL_CompareCallback_r extends Callback implements SDL_CompareCallback_rI {

    /**
     * Creates a {@code SDL_CompareCallback_r} instance from the specified function pointer.
     *
     * @return the new {@code SDL_CompareCallback_r}
     */
    public static SDL_CompareCallback_r create(long functionPointer) {
        SDL_CompareCallback_rI instance = Callback.get(functionPointer);
        return instance instanceof SDL_CompareCallback_r
            ? (SDL_CompareCallback_r)instance
            : new Container(functionPointer, instance);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code functionPointer} is {@code NULL}. */
    public static @Nullable SDL_CompareCallback_r createSafe(long functionPointer) {
        return functionPointer == NULL ? null : create(functionPointer);
    }

    /** Creates a {@code SDL_CompareCallback_r} instance that delegates to the specified {@code SDL_CompareCallback_rI} instance. */
    public static SDL_CompareCallback_r create(SDL_CompareCallback_rI instance) {
        return instance instanceof SDL_CompareCallback_r
            ? (SDL_CompareCallback_r)instance
            : new Container(instance.address(), instance);
    }

    protected SDL_CompareCallback_r() {
        super(CIF);
    }

    SDL_CompareCallback_r(long functionPointer) {
        super(functionPointer);
    }

    private static final class Container extends SDL_CompareCallback_r {

        private final SDL_CompareCallback_rI delegate;

        Container(long functionPointer, SDL_CompareCallback_rI delegate) {
            super(functionPointer);
            this.delegate = delegate;
        }

        @Override
        public int invoke(long userdata, long a, long b) {
            return delegate.invoke(userdata, a, b);
        }

    }

}