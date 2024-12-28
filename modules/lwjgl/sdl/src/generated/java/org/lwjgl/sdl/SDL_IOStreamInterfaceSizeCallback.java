/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.sdl;

import org.jspecify.annotations.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;

/** Callback function: {@link #invoke (* anonymous)} */
public abstract class SDL_IOStreamInterfaceSizeCallback extends Callback implements SDL_IOStreamInterfaceSizeCallbackI {

    /**
     * Creates a {@code SDL_IOStreamInterfaceSizeCallback} instance from the specified function pointer.
     *
     * @return the new {@code SDL_IOStreamInterfaceSizeCallback}
     */
    public static SDL_IOStreamInterfaceSizeCallback create(long functionPointer) {
        SDL_IOStreamInterfaceSizeCallbackI instance = Callback.get(functionPointer);
        return instance instanceof SDL_IOStreamInterfaceSizeCallback
            ? (SDL_IOStreamInterfaceSizeCallback)instance
            : new Container(functionPointer, instance);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code functionPointer} is {@code NULL}. */
    public static @Nullable SDL_IOStreamInterfaceSizeCallback createSafe(long functionPointer) {
        return functionPointer == NULL ? null : create(functionPointer);
    }

    /** Creates a {@code SDL_IOStreamInterfaceSizeCallback} instance that delegates to the specified {@code SDL_IOStreamInterfaceSizeCallbackI} instance. */
    public static SDL_IOStreamInterfaceSizeCallback create(SDL_IOStreamInterfaceSizeCallbackI instance) {
        return instance instanceof SDL_IOStreamInterfaceSizeCallback
            ? (SDL_IOStreamInterfaceSizeCallback)instance
            : new Container(instance.address(), instance);
    }

    protected SDL_IOStreamInterfaceSizeCallback() {
        super(CIF);
    }

    SDL_IOStreamInterfaceSizeCallback(long functionPointer) {
        super(functionPointer);
    }

    private static final class Container extends SDL_IOStreamInterfaceSizeCallback {

        private final SDL_IOStreamInterfaceSizeCallbackI delegate;

        Container(long functionPointer, SDL_IOStreamInterfaceSizeCallbackI delegate) {
            super(functionPointer);
            this.delegate = delegate;
        }

        @Override
        public long invoke(long userdata) {
            return delegate.invoke(userdata);
        }

    }

}