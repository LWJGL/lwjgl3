/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.sdl;

import org.jspecify.annotations.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;

/** Callback function: {@link #invoke SDL_calloc_func} */
public abstract class SDL_calloc_func extends Callback implements SDL_calloc_funcI {

    /**
     * Creates a {@code SDL_calloc_func} instance from the specified function pointer.
     *
     * @return the new {@code SDL_calloc_func}
     */
    public static SDL_calloc_func create(long functionPointer) {
        SDL_calloc_funcI instance = Callback.get(functionPointer);
        return instance instanceof SDL_calloc_func
            ? (SDL_calloc_func)instance
            : new Container(functionPointer, instance);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code functionPointer} is {@code NULL}. */
    public static @Nullable SDL_calloc_func createSafe(long functionPointer) {
        return functionPointer == NULL ? null : create(functionPointer);
    }

    /** Creates a {@code SDL_calloc_func} instance that delegates to the specified {@code SDL_calloc_funcI} instance. */
    public static SDL_calloc_func create(SDL_calloc_funcI instance) {
        return instance instanceof SDL_calloc_func
            ? (SDL_calloc_func)instance
            : new Container(instance.address(), instance);
    }

    protected SDL_calloc_func() {
        super(CIF);
    }

    SDL_calloc_func(long functionPointer) {
        super(functionPointer);
    }

    private static final class Container extends SDL_calloc_func {

        private final SDL_calloc_funcI delegate;

        Container(long functionPointer, SDL_calloc_funcI delegate) {
            super(functionPointer);
            this.delegate = delegate;
        }

        @Override
        public long invoke(long nmemb, long size) {
            return delegate.invoke(nmemb, size);
        }

    }

}