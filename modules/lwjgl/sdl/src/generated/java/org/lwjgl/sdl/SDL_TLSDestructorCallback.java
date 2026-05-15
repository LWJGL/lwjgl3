/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.sdl;

import org.jspecify.annotations.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;

/** Callback function: {@link #invoke SDL_TLSDestructorCallback} */
public abstract class SDL_TLSDestructorCallback extends Callback implements SDL_TLSDestructorCallbackI {

    /**
     * Creates a {@code SDL_TLSDestructorCallback} instance from the specified function pointer.
     *
     * @return the new {@code SDL_TLSDestructorCallback}
     */
    public static SDL_TLSDestructorCallback create(long functionPointer) { return create(Callback.get(functionPointer), functionPointer); }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code functionPointer} is {@code NULL}. */
    public static @Nullable SDL_TLSDestructorCallback createSafe(long functionPointer) { return functionPointer == NULL ? null : create(functionPointer); }

    /** Creates a {@code SDL_TLSDestructorCallback} instance that delegates to the specified {@code SDL_TLSDestructorCallbackI} instance. */
    public static SDL_TLSDestructorCallback create(SDL_TLSDestructorCallbackI instance) { return create(instance, instance.address()); }

    private static SDL_TLSDestructorCallback create(SDL_TLSDestructorCallbackI instance, long functionPointer) {
        return instance instanceof SDL_TLSDestructorCallback
            ? (SDL_TLSDestructorCallback)instance
            : new SDL_TLSDestructorCallback(functionPointer) {
                @Override public void invoke(long value) {
                    instance.invoke(value);
                }
            };
    }

    protected SDL_TLSDestructorCallback() {
        super(DESCRIPTOR);
    }

    SDL_TLSDestructorCallback(long functionPointer) {
        super(functionPointer);
    }

}