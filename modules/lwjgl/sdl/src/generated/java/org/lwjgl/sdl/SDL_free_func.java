/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.sdl;

import org.jspecify.annotations.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;

/** Callback function: {@link #invoke SDL_free_func} */
public abstract class SDL_free_func extends Callback implements SDL_free_funcI {

    /**
     * Creates a {@code SDL_free_func} instance from the specified function pointer.
     *
     * @return the new {@code SDL_free_func}
     */
    public static SDL_free_func create(long functionPointer) {
        SDL_free_funcI instance = Callback.get(functionPointer);
        return instance instanceof SDL_free_func
            ? (SDL_free_func)instance
            : new Container(functionPointer, instance);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code functionPointer} is {@code NULL}. */
    public static @Nullable SDL_free_func createSafe(long functionPointer) {
        return functionPointer == NULL ? null : create(functionPointer);
    }

    /** Creates a {@code SDL_free_func} instance that delegates to the specified {@code SDL_free_funcI} instance. */
    public static SDL_free_func create(SDL_free_funcI instance) {
        return instance instanceof SDL_free_func
            ? (SDL_free_func)instance
            : new Container(instance.address(), instance);
    }

    protected SDL_free_func() {
        super(CIF);
    }

    SDL_free_func(long functionPointer) {
        super(functionPointer);
    }

    private static final class Container extends SDL_free_func {

        private final SDL_free_funcI delegate;

        Container(long functionPointer, SDL_free_funcI delegate) {
            super(functionPointer);
            this.delegate = delegate;
        }

        @Override
        public void invoke(long mem) {
            delegate.invoke(mem);
        }

    }

}