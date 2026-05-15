/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.sdl;

import org.jspecify.annotations.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;

/** Callback function: {@link #invoke SDL_AppEvent_func} */
public abstract class SDL_AppEvent_func extends Callback implements SDL_AppEvent_funcI {

    /**
     * Creates a {@code SDL_AppEvent_func} instance from the specified function pointer.
     *
     * @return the new {@code SDL_AppEvent_func}
     */
    public static SDL_AppEvent_func create(long functionPointer) { return create(Callback.get(functionPointer), functionPointer); }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code functionPointer} is {@code NULL}. */
    public static @Nullable SDL_AppEvent_func createSafe(long functionPointer) { return functionPointer == NULL ? null : create(functionPointer); }

    /** Creates a {@code SDL_AppEvent_func} instance that delegates to the specified {@code SDL_AppEvent_funcI} instance. */
    public static SDL_AppEvent_func create(SDL_AppEvent_funcI instance) { return create(instance, instance.address()); }

    private static SDL_AppEvent_func create(SDL_AppEvent_funcI instance, long functionPointer) {
        return instance instanceof SDL_AppEvent_func
            ? (SDL_AppEvent_func)instance
            : new SDL_AppEvent_func(functionPointer) {
                @Override public int invoke(long appstate, long event) {
                    return instance.invoke(appstate, event);
                }
            };
    }

    protected SDL_AppEvent_func() {
        super(DESCRIPTOR);
    }

    SDL_AppEvent_func(long functionPointer) {
        super(functionPointer);
    }

}