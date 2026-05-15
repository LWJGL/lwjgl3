/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.sdl;

import org.jspecify.annotations.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;

/** Callback function: {@link #invoke SDL_EGLAttribArrayCallback} */
public abstract class SDL_EGLAttribArrayCallback extends Callback implements SDL_EGLAttribArrayCallbackI {

    /**
     * Creates a {@code SDL_EGLAttribArrayCallback} instance from the specified function pointer.
     *
     * @return the new {@code SDL_EGLAttribArrayCallback}
     */
    public static SDL_EGLAttribArrayCallback create(long functionPointer) { return create(Callback.get(functionPointer), functionPointer); }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code functionPointer} is {@code NULL}. */
    public static @Nullable SDL_EGLAttribArrayCallback createSafe(long functionPointer) { return functionPointer == NULL ? null : create(functionPointer); }

    /** Creates a {@code SDL_EGLAttribArrayCallback} instance that delegates to the specified {@code SDL_EGLAttribArrayCallbackI} instance. */
    public static SDL_EGLAttribArrayCallback create(SDL_EGLAttribArrayCallbackI instance) { return create(instance, instance.address()); }

    private static SDL_EGLAttribArrayCallback create(SDL_EGLAttribArrayCallbackI instance, long functionPointer) {
        return instance instanceof SDL_EGLAttribArrayCallback
            ? (SDL_EGLAttribArrayCallback)instance
            : new SDL_EGLAttribArrayCallback(functionPointer) {
                @Override public long invoke(long userdata) {
                    return instance.invoke(userdata);
                }
            };
    }

    protected SDL_EGLAttribArrayCallback() {
        super(DESCRIPTOR);
    }

    SDL_EGLAttribArrayCallback(long functionPointer) {
        super(functionPointer);
    }

}