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
public abstract class SDL_IOStreamInterfaceReadCallback extends Callback implements SDL_IOStreamInterfaceReadCallbackI {

    /**
     * Creates a {@code SDL_IOStreamInterfaceReadCallback} instance from the specified function pointer.
     *
     * @return the new {@code SDL_IOStreamInterfaceReadCallback}
     */
    public static SDL_IOStreamInterfaceReadCallback create(long functionPointer) {
        SDL_IOStreamInterfaceReadCallbackI instance = Callback.get(functionPointer);
        return instance instanceof SDL_IOStreamInterfaceReadCallback
            ? (SDL_IOStreamInterfaceReadCallback)instance
            : new Container(functionPointer, instance);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code functionPointer} is {@code NULL}. */
    public static @Nullable SDL_IOStreamInterfaceReadCallback createSafe(long functionPointer) {
        return functionPointer == NULL ? null : create(functionPointer);
    }

    /** Creates a {@code SDL_IOStreamInterfaceReadCallback} instance that delegates to the specified {@code SDL_IOStreamInterfaceReadCallbackI} instance. */
    public static SDL_IOStreamInterfaceReadCallback create(SDL_IOStreamInterfaceReadCallbackI instance) {
        return instance instanceof SDL_IOStreamInterfaceReadCallback
            ? (SDL_IOStreamInterfaceReadCallback)instance
            : new Container(instance.address(), instance);
    }

    protected SDL_IOStreamInterfaceReadCallback() {
        super(CIF);
    }

    SDL_IOStreamInterfaceReadCallback(long functionPointer) {
        super(functionPointer);
    }

    private static final class Container extends SDL_IOStreamInterfaceReadCallback {

        private final SDL_IOStreamInterfaceReadCallbackI delegate;

        Container(long functionPointer, SDL_IOStreamInterfaceReadCallbackI delegate) {
            super(functionPointer);
            this.delegate = delegate;
        }

        @Override
        public long invoke(long userdata, long ptr, long size, long status) {
            return delegate.invoke(userdata, ptr, size, status);
        }

    }

}