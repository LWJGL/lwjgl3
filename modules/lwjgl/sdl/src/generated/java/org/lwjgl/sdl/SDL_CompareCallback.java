/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.sdl;

import org.jspecify.annotations.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;

/** Callback function: {@link #invoke SDL_CompareCallback} */
public abstract class SDL_CompareCallback extends Callback implements SDL_CompareCallbackI {

    /**
     * Creates a {@code SDL_CompareCallback} instance from the specified function pointer.
     *
     * @return the new {@code SDL_CompareCallback}
     */
    public static SDL_CompareCallback create(long functionPointer) { return create(Callback.get(functionPointer), functionPointer); }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code functionPointer} is {@code NULL}. */
    public static @Nullable SDL_CompareCallback createSafe(long functionPointer) { return functionPointer == NULL ? null : create(functionPointer); }

    /** Creates a {@code SDL_CompareCallback} instance that delegates to the specified {@code SDL_CompareCallbackI} instance. */
    public static SDL_CompareCallback create(SDL_CompareCallbackI instance) { return create(instance, instance.address()); }

    private static SDL_CompareCallback create(SDL_CompareCallbackI instance, long functionPointer) {
        return instance instanceof SDL_CompareCallback
            ? (SDL_CompareCallback)instance
            : new SDL_CompareCallback(functionPointer) {
                @Override public int invoke(long a, long b) {
                    return instance.invoke(a, b);
                }
            };
    }

    protected SDL_CompareCallback() {
        super(DESCRIPTOR);
    }

    SDL_CompareCallback(long functionPointer) {
        super(functionPointer);
    }

}