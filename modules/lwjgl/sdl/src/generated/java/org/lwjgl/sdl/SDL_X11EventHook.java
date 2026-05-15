/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.sdl;

import org.jspecify.annotations.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;

/** Callback function: {@link #invoke SDL_X11EventHook} */
public abstract class SDL_X11EventHook extends Callback implements SDL_X11EventHookI {

    /**
     * Creates a {@code SDL_X11EventHook} instance from the specified function pointer.
     *
     * @return the new {@code SDL_X11EventHook}
     */
    public static SDL_X11EventHook create(long functionPointer) { return create(Callback.get(functionPointer), functionPointer); }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code functionPointer} is {@code NULL}. */
    public static @Nullable SDL_X11EventHook createSafe(long functionPointer) { return functionPointer == NULL ? null : create(functionPointer); }

    /** Creates a {@code SDL_X11EventHook} instance that delegates to the specified {@code SDL_X11EventHookI} instance. */
    public static SDL_X11EventHook create(SDL_X11EventHookI instance) { return create(instance, instance.address()); }

    private static SDL_X11EventHook create(SDL_X11EventHookI instance, long functionPointer) {
        return instance instanceof SDL_X11EventHook
            ? (SDL_X11EventHook)instance
            : new SDL_X11EventHook(functionPointer) {
                @Override public boolean invoke(long userdata, long xevent) {
                    return instance.invoke(userdata, xevent);
                }
            };
    }

    protected SDL_X11EventHook() {
        super(DESCRIPTOR);
    }

    SDL_X11EventHook(long functionPointer) {
        super(functionPointer);
    }

}