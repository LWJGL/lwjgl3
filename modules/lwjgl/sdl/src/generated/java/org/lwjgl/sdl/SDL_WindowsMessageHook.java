/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.sdl;

import org.jspecify.annotations.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;

/** Callback function: {@link #invoke SDL_WindowsMessageHook} */
public abstract class SDL_WindowsMessageHook extends Callback implements SDL_WindowsMessageHookI {

    /**
     * Creates a {@code SDL_WindowsMessageHook} instance from the specified function pointer.
     *
     * @return the new {@code SDL_WindowsMessageHook}
     */
    public static SDL_WindowsMessageHook create(long functionPointer) { return create(Callback.get(functionPointer), functionPointer); }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code functionPointer} is {@code NULL}. */
    public static @Nullable SDL_WindowsMessageHook createSafe(long functionPointer) { return functionPointer == NULL ? null : create(functionPointer); }

    /** Creates a {@code SDL_WindowsMessageHook} instance that delegates to the specified {@code SDL_WindowsMessageHookI} instance. */
    public static SDL_WindowsMessageHook create(SDL_WindowsMessageHookI instance) { return create(instance, instance.address()); }

    private static SDL_WindowsMessageHook create(SDL_WindowsMessageHookI instance, long functionPointer) {
        return instance instanceof SDL_WindowsMessageHook
            ? (SDL_WindowsMessageHook)instance
            : new SDL_WindowsMessageHook(functionPointer) {
                @Override public boolean invoke(long userdata, long msg) {
                    return instance.invoke(userdata, msg);
                }
            };
    }

    protected SDL_WindowsMessageHook() {
        super(DESCRIPTOR);
    }

    SDL_WindowsMessageHook(long functionPointer) {
        super(functionPointer);
    }

}