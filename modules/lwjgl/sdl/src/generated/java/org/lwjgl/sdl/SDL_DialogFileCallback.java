/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.sdl;

import org.jspecify.annotations.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;

/** Callback function: {@link #invoke SDL_DialogFileCallback} */
public abstract class SDL_DialogFileCallback extends Callback implements SDL_DialogFileCallbackI {

    /**
     * Creates a {@code SDL_DialogFileCallback} instance from the specified function pointer.
     *
     * @return the new {@code SDL_DialogFileCallback}
     */
    public static SDL_DialogFileCallback create(long functionPointer) { return create(Callback.get(functionPointer), functionPointer); }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code functionPointer} is {@code NULL}. */
    public static @Nullable SDL_DialogFileCallback createSafe(long functionPointer) { return functionPointer == NULL ? null : create(functionPointer); }

    /** Creates a {@code SDL_DialogFileCallback} instance that delegates to the specified {@code SDL_DialogFileCallbackI} instance. */
    public static SDL_DialogFileCallback create(SDL_DialogFileCallbackI instance) { return create(instance, instance.address()); }

    private static SDL_DialogFileCallback create(SDL_DialogFileCallbackI instance, long functionPointer) {
        return instance instanceof SDL_DialogFileCallback
            ? (SDL_DialogFileCallback)instance
            : new SDL_DialogFileCallback(functionPointer) {
                @Override public void invoke(long userdata, long filelist, int filter) {
                    instance.invoke(userdata, filelist, filter);
                }
            };
    }

    protected SDL_DialogFileCallback() {
        super(DESCRIPTOR);
    }

    SDL_DialogFileCallback(long functionPointer) {
        super(functionPointer);
    }

}