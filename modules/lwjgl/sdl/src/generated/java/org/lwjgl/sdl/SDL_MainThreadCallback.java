/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.sdl;

import org.jspecify.annotations.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;

/** Callback function: {@link #invoke SDL_MainThreadCallback} */
public abstract class SDL_MainThreadCallback extends Callback implements SDL_MainThreadCallbackI {

    /**
     * Creates a {@code SDL_MainThreadCallback} instance from the specified function pointer.
     *
     * @return the new {@code SDL_MainThreadCallback}
     */
    public static SDL_MainThreadCallback create(long functionPointer) { return create(Callback.get(functionPointer), functionPointer); }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code functionPointer} is {@code NULL}. */
    public static @Nullable SDL_MainThreadCallback createSafe(long functionPointer) { return functionPointer == NULL ? null : create(functionPointer); }

    /** Creates a {@code SDL_MainThreadCallback} instance that delegates to the specified {@code SDL_MainThreadCallbackI} instance. */
    public static SDL_MainThreadCallback create(SDL_MainThreadCallbackI instance) { return create(instance, instance.address()); }

    private static SDL_MainThreadCallback create(SDL_MainThreadCallbackI instance, long functionPointer) {
        return instance instanceof SDL_MainThreadCallback
            ? (SDL_MainThreadCallback)instance
            : new SDL_MainThreadCallback(functionPointer) {
                @Override public void invoke(long userdata) {
                    instance.invoke(userdata);
                }
            };
    }

    protected SDL_MainThreadCallback() {
        super(DESCRIPTOR);
    }

    SDL_MainThreadCallback(long functionPointer) {
        super(functionPointer);
    }

}