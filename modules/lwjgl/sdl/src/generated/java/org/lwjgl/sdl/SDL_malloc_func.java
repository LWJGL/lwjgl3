/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.sdl;

import org.jspecify.annotations.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;

/** Callback function: {@link #invoke SDL_malloc_func} */
public abstract class SDL_malloc_func extends Callback implements SDL_malloc_funcI {

    /**
     * Creates a {@code SDL_malloc_func} instance from the specified function pointer.
     *
     * @return the new {@code SDL_malloc_func}
     */
    public static SDL_malloc_func create(long functionPointer) {
        SDL_malloc_funcI instance = Callback.get(functionPointer);
        return instance instanceof SDL_malloc_func
            ? (SDL_malloc_func)instance
            : new Container(functionPointer, instance);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code functionPointer} is {@code NULL}. */
    public static @Nullable SDL_malloc_func createSafe(long functionPointer) {
        return functionPointer == NULL ? null : create(functionPointer);
    }

    /** Creates a {@code SDL_malloc_func} instance that delegates to the specified {@code SDL_malloc_funcI} instance. */
    public static SDL_malloc_func create(SDL_malloc_funcI instance) {
        return instance instanceof SDL_malloc_func
            ? (SDL_malloc_func)instance
            : new Container(instance.address(), instance);
    }

    protected SDL_malloc_func() {
        super(CIF);
    }

    SDL_malloc_func(long functionPointer) {
        super(functionPointer);
    }

    private static final class Container extends SDL_malloc_func {

        private final SDL_malloc_funcI delegate;

        Container(long functionPointer, SDL_malloc_funcI delegate) {
            super(functionPointer);
            this.delegate = delegate;
        }

        @Override
        public long invoke(long size) {
            return delegate.invoke(size);
        }

    }

}