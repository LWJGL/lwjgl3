/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.sdl;

import org.jspecify.annotations.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;

/** Callback function: {@link #invoke SDL_CleanupPropertyCallback} */
public abstract class SDL_CleanupPropertyCallback extends Callback implements SDL_CleanupPropertyCallbackI {

    /**
     * Creates a {@code SDL_CleanupPropertyCallback} instance from the specified function pointer.
     *
     * @return the new {@code SDL_CleanupPropertyCallback}
     */
    public static SDL_CleanupPropertyCallback create(long functionPointer) { return create(Callback.get(functionPointer), functionPointer); }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code functionPointer} is {@code NULL}. */
    public static @Nullable SDL_CleanupPropertyCallback createSafe(long functionPointer) { return functionPointer == NULL ? null : create(functionPointer); }

    /** Creates a {@code SDL_CleanupPropertyCallback} instance that delegates to the specified {@code SDL_CleanupPropertyCallbackI} instance. */
    public static SDL_CleanupPropertyCallback create(SDL_CleanupPropertyCallbackI instance) { return create(instance, instance.address()); }

    private static SDL_CleanupPropertyCallback create(SDL_CleanupPropertyCallbackI instance, long functionPointer) {
        return instance instanceof SDL_CleanupPropertyCallback
            ? (SDL_CleanupPropertyCallback)instance
            : new SDL_CleanupPropertyCallback(functionPointer) {
                @Override public void invoke(long userdata, long value) {
                    instance.invoke(userdata, value);
                }
            };
    }

    protected SDL_CleanupPropertyCallback() {
        super(DESCRIPTOR);
    }

    SDL_CleanupPropertyCallback(long functionPointer) {
        super(functionPointer);
    }

}