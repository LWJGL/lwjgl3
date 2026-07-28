/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.sdl;

import org.jspecify.annotations.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;

/** Callback function: {@link #invoke SDL_AppInit_func} */
public abstract class SDL_AppInit_func extends Callback implements SDL_AppInit_funcI {

    /**
     * Creates a {@code SDL_AppInit_func} instance from the specified function pointer.
     *
     * @return the new {@code SDL_AppInit_func}
     */
    public static SDL_AppInit_func create(long functionPointer) { return create(Callback.get(functionPointer), functionPointer); }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code functionPointer} is {@code NULL}. */
    public static @Nullable SDL_AppInit_func createSafe(long functionPointer) { return functionPointer == NULL ? null : create(functionPointer); }

    /** Creates a {@code SDL_AppInit_func} instance that delegates to the specified {@code SDL_AppInit_funcI} instance. */
    public static SDL_AppInit_func create(SDL_AppInit_funcI instance) { return create(instance, instance.address()); }

    private static SDL_AppInit_func create(SDL_AppInit_funcI instance, long functionPointer) {
        return instance instanceof SDL_AppInit_func
            ? (SDL_AppInit_func)instance
            : new SDL_AppInit_func(functionPointer) {
                @Override public int invoke(long appstate, int argc, long argv) {
                    return instance.invoke(appstate, argc, argv);
                }
            };
    }

    protected SDL_AppInit_func() {
        super(DESCRIPTOR);
    }

    SDL_AppInit_func(long functionPointer) {
        super(functionPointer);
    }

}