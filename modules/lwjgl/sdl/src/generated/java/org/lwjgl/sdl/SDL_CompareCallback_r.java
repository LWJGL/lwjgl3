/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.sdl;

import org.jspecify.annotations.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;

/** Callback function: {@link #invoke SDL_CompareCallback_r} */
public abstract class SDL_CompareCallback_r extends Callback implements SDL_CompareCallback_rI {

    /**
     * Creates a {@code SDL_CompareCallback_r} instance from the specified function pointer.
     *
     * @return the new {@code SDL_CompareCallback_r}
     */
    public static SDL_CompareCallback_r create(long functionPointer) { return create(Callback.get(functionPointer), functionPointer); }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code functionPointer} is {@code NULL}. */
    public static @Nullable SDL_CompareCallback_r createSafe(long functionPointer) { return functionPointer == NULL ? null : create(functionPointer); }

    /** Creates a {@code SDL_CompareCallback_r} instance that delegates to the specified {@code SDL_CompareCallback_rI} instance. */
    public static SDL_CompareCallback_r create(SDL_CompareCallback_rI instance) { return create(instance, instance.address()); }

    private static SDL_CompareCallback_r create(SDL_CompareCallback_rI instance, long functionPointer) {
        return instance instanceof SDL_CompareCallback_r
            ? (SDL_CompareCallback_r)instance
            : new SDL_CompareCallback_r(functionPointer) {
                @Override public int invoke(long userdata, long a, long b) {
                    return instance.invoke(userdata, a, b);
                }
            };
    }

    protected SDL_CompareCallback_r() {
        super(DESCRIPTOR);
    }

    SDL_CompareCallback_r(long functionPointer) {
        super(functionPointer);
    }

}