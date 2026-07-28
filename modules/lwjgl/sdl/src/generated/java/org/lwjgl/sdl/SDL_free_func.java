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
    public static SDL_free_func create(long functionPointer) { return create(Callback.get(functionPointer), functionPointer); }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code functionPointer} is {@code NULL}. */
    public static @Nullable SDL_free_func createSafe(long functionPointer) { return functionPointer == NULL ? null : create(functionPointer); }

    /** Creates a {@code SDL_free_func} instance that delegates to the specified {@code SDL_free_funcI} instance. */
    public static SDL_free_func create(SDL_free_funcI instance) { return create(instance, instance.address()); }

    private static SDL_free_func create(SDL_free_funcI instance, long functionPointer) {
        return instance instanceof SDL_free_func
            ? (SDL_free_func)instance
            : new SDL_free_func(functionPointer) {
                @Override public void invoke(long mem) {
                    instance.invoke(mem);
                }
            };
    }

    protected SDL_free_func() {
        super(DESCRIPTOR);
    }

    SDL_free_func(long functionPointer) {
        super(functionPointer);
    }

}