/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.sdl;

import org.jspecify.annotations.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;

/** Callback function: {@link #invoke SDL_AudioPostmixCallback} */
public abstract class SDL_AudioPostmixCallback extends Callback implements SDL_AudioPostmixCallbackI {

    /**
     * Creates a {@code SDL_AudioPostmixCallback} instance from the specified function pointer.
     *
     * @return the new {@code SDL_AudioPostmixCallback}
     */
    public static SDL_AudioPostmixCallback create(long functionPointer) { return create(Callback.get(functionPointer), functionPointer); }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code functionPointer} is {@code NULL}. */
    public static @Nullable SDL_AudioPostmixCallback createSafe(long functionPointer) { return functionPointer == NULL ? null : create(functionPointer); }

    /** Creates a {@code SDL_AudioPostmixCallback} instance that delegates to the specified {@code SDL_AudioPostmixCallbackI} instance. */
    public static SDL_AudioPostmixCallback create(SDL_AudioPostmixCallbackI instance) { return create(instance, instance.address()); }

    private static SDL_AudioPostmixCallback create(SDL_AudioPostmixCallbackI instance, long functionPointer) {
        return instance instanceof SDL_AudioPostmixCallback
            ? (SDL_AudioPostmixCallback)instance
            : new SDL_AudioPostmixCallback(functionPointer) {
                @Override public void invoke(long userdata, long spec, long buffer, int buflen) {
                    instance.invoke(userdata, spec, buffer, buflen);
                }
            };
    }

    protected SDL_AudioPostmixCallback() {
        super(DESCRIPTOR);
    }

    SDL_AudioPostmixCallback(long functionPointer) {
        super(functionPointer);
    }

}