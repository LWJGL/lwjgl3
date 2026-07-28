/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.sdl;

import org.jspecify.annotations.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;

/** Callback function: {@link #invoke SDL_EnumerateDirectoryCallback} */
public abstract class SDL_EnumerateDirectoryCallback extends Callback implements SDL_EnumerateDirectoryCallbackI {

    /**
     * Creates a {@code SDL_EnumerateDirectoryCallback} instance from the specified function pointer.
     *
     * @return the new {@code SDL_EnumerateDirectoryCallback}
     */
    public static SDL_EnumerateDirectoryCallback create(long functionPointer) { return create(Callback.get(functionPointer), functionPointer); }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code functionPointer} is {@code NULL}. */
    public static @Nullable SDL_EnumerateDirectoryCallback createSafe(long functionPointer) { return functionPointer == NULL ? null : create(functionPointer); }

    /** Creates a {@code SDL_EnumerateDirectoryCallback} instance that delegates to the specified {@code SDL_EnumerateDirectoryCallbackI} instance. */
    public static SDL_EnumerateDirectoryCallback create(SDL_EnumerateDirectoryCallbackI instance) { return create(instance, instance.address()); }

    private static SDL_EnumerateDirectoryCallback create(SDL_EnumerateDirectoryCallbackI instance, long functionPointer) {
        return instance instanceof SDL_EnumerateDirectoryCallback
            ? (SDL_EnumerateDirectoryCallback)instance
            : new SDL_EnumerateDirectoryCallback(functionPointer) {
                @Override public int invoke(long userdata, long dirname, long fname) {
                    return instance.invoke(userdata, dirname, fname);
                }
            };
    }

    protected SDL_EnumerateDirectoryCallback() {
        super(DESCRIPTOR);
    }

    SDL_EnumerateDirectoryCallback(long functionPointer) {
        super(functionPointer);
    }

}