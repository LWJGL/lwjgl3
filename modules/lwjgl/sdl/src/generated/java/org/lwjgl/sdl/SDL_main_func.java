/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.sdl;

import org.jspecify.annotations.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;

/** Callback function: {@link #invoke SDL_main_func} */
public abstract class SDL_main_func extends Callback implements SDL_main_funcI {

    /**
     * Creates a {@code SDL_main_func} instance from the specified function pointer.
     *
     * @return the new {@code SDL_main_func}
     */
    public static SDL_main_func create(long functionPointer) { return create(Callback.get(functionPointer), functionPointer); }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code functionPointer} is {@code NULL}. */
    public static @Nullable SDL_main_func createSafe(long functionPointer) { return functionPointer == NULL ? null : create(functionPointer); }

    /** Creates a {@code SDL_main_func} instance that delegates to the specified {@code SDL_main_funcI} instance. */
    public static SDL_main_func create(SDL_main_funcI instance) { return create(instance, instance.address()); }

    private static SDL_main_func create(SDL_main_funcI instance, long functionPointer) {
        return instance instanceof SDL_main_func
            ? (SDL_main_func)instance
            : new SDL_main_func(functionPointer) {
                @Override public int invoke(int argc, long argv) {
                    return instance.invoke(argc, argv);
                }
            };
    }

    protected SDL_main_func() {
        super(DESCRIPTOR);
    }

    SDL_main_func(long functionPointer) {
        super(functionPointer);
    }

}