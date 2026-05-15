/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.sdl;

import org.jspecify.annotations.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;

/** Callback function: {@link #invoke SDL_TrayCallback} */
public abstract class SDL_TrayCallback extends Callback implements SDL_TrayCallbackI {

    /**
     * Creates a {@code SDL_TrayCallback} instance from the specified function pointer.
     *
     * @return the new {@code SDL_TrayCallback}
     */
    public static SDL_TrayCallback create(long functionPointer) { return create(Callback.get(functionPointer), functionPointer); }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code functionPointer} is {@code NULL}. */
    public static @Nullable SDL_TrayCallback createSafe(long functionPointer) { return functionPointer == NULL ? null : create(functionPointer); }

    /** Creates a {@code SDL_TrayCallback} instance that delegates to the specified {@code SDL_TrayCallbackI} instance. */
    public static SDL_TrayCallback create(SDL_TrayCallbackI instance) { return create(instance, instance.address()); }

    private static SDL_TrayCallback create(SDL_TrayCallbackI instance, long functionPointer) {
        return instance instanceof SDL_TrayCallback
            ? (SDL_TrayCallback)instance
            : new SDL_TrayCallback(functionPointer) {
                @Override public void invoke(long userdata, long entry) {
                    instance.invoke(userdata, entry);
                }
            };
    }

    protected SDL_TrayCallback() {
        super(DESCRIPTOR);
    }

    SDL_TrayCallback(long functionPointer) {
        super(functionPointer);
    }

}