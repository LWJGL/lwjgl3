/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.sdl;

import org.jspecify.annotations.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;

/** Callback function: {@link #invoke SDL_AudioStreamDataCompleteCallback} */
public abstract class SDL_AudioStreamDataCompleteCallback extends Callback implements SDL_AudioStreamDataCompleteCallbackI {

    /**
     * Creates a {@code SDL_AudioStreamDataCompleteCallback} instance from the specified function pointer.
     *
     * @return the new {@code SDL_AudioStreamDataCompleteCallback}
     */
    public static SDL_AudioStreamDataCompleteCallback create(long functionPointer) { return create(Callback.get(functionPointer), functionPointer); }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code functionPointer} is {@code NULL}. */
    public static @Nullable SDL_AudioStreamDataCompleteCallback createSafe(long functionPointer) { return functionPointer == NULL ? null : create(functionPointer); }

    /** Creates a {@code SDL_AudioStreamDataCompleteCallback} instance that delegates to the specified {@code SDL_AudioStreamDataCompleteCallbackI} instance. */
    public static SDL_AudioStreamDataCompleteCallback create(SDL_AudioStreamDataCompleteCallbackI instance) { return create(instance, instance.address()); }

    private static SDL_AudioStreamDataCompleteCallback create(SDL_AudioStreamDataCompleteCallbackI instance, long functionPointer) {
        return instance instanceof SDL_AudioStreamDataCompleteCallback
            ? (SDL_AudioStreamDataCompleteCallback)instance
            : new SDL_AudioStreamDataCompleteCallback(functionPointer) {
                @Override public void invoke(long userdata, long buf, int buflen) {
                    instance.invoke(userdata, buf, buflen);
                }
            };
    }

    protected SDL_AudioStreamDataCompleteCallback() {
        super(DESCRIPTOR);
    }

    SDL_AudioStreamDataCompleteCallback(long functionPointer) {
        super(functionPointer);
    }

}