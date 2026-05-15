/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.sdl;

import org.jspecify.annotations.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;

/** Callback function: {@link #invoke SDL_EGLIntArrayCallback} */
public abstract class SDL_EGLIntArrayCallback extends Callback implements SDL_EGLIntArrayCallbackI {

    /**
     * Creates a {@code SDL_EGLIntArrayCallback} instance from the specified function pointer.
     *
     * @return the new {@code SDL_EGLIntArrayCallback}
     */
    public static SDL_EGLIntArrayCallback create(long functionPointer) { return create(Callback.get(functionPointer), functionPointer); }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code functionPointer} is {@code NULL}. */
    public static @Nullable SDL_EGLIntArrayCallback createSafe(long functionPointer) { return functionPointer == NULL ? null : create(functionPointer); }

    /** Creates a {@code SDL_EGLIntArrayCallback} instance that delegates to the specified {@code SDL_EGLIntArrayCallbackI} instance. */
    public static SDL_EGLIntArrayCallback create(SDL_EGLIntArrayCallbackI instance) { return create(instance, instance.address()); }

    private static SDL_EGLIntArrayCallback create(SDL_EGLIntArrayCallbackI instance, long functionPointer) {
        return instance instanceof SDL_EGLIntArrayCallback
            ? (SDL_EGLIntArrayCallback)instance
            : new SDL_EGLIntArrayCallback(functionPointer) {
                @Override public long invoke(long userdata, long display, long config) {
                    return instance.invoke(userdata, display, config);
                }
            };
    }

    protected SDL_EGLIntArrayCallback() {
        super(DESCRIPTOR);
    }

    SDL_EGLIntArrayCallback(long functionPointer) {
        super(functionPointer);
    }

}