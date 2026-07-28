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
    public static SDL_calloc_func create(long functionPointer) { return create(Callback.get(functionPointer), functionPointer); }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code functionPointer} is {@code NULL}. */
    public static @Nullable SDL_calloc_func createSafe(long functionPointer) { return functionPointer == NULL ? null : create(functionPointer); }

    /** Creates a {@code SDL_calloc_func} instance that delegates to the specified {@code SDL_calloc_funcI} instance. */
    public static SDL_calloc_func create(SDL_calloc_funcI instance) { return create(instance, instance.address()); }

    private static SDL_calloc_func create(SDL_calloc_funcI instance, long functionPointer) {
        return instance instanceof SDL_calloc_func
            ? (SDL_calloc_func)instance
            : new SDL_calloc_func(functionPointer) {
                @Override public long invoke(long nmemb, long size) {
                    return instance.invoke(nmemb, size);
                }
            };
    }

    protected SDL_calloc_func() {
        super(DESCRIPTOR);
    }

    SDL_calloc_func(long functionPointer) {
        super(functionPointer);
    }

}