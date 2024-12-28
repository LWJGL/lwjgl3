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
public abstract class SDL_IOStreamInterfaceWriteCallback extends Callback implements SDL_IOStreamInterfaceWriteCallbackI {

    /**
     * Creates a {@code SDL_IOStreamInterfaceWriteCallback} instance from the specified function pointer.
     *
     * @return the new {@code SDL_IOStreamInterfaceWriteCallback}
     */
    public static SDL_IOStreamInterfaceWriteCallback create(long functionPointer) {
        SDL_IOStreamInterfaceWriteCallbackI instance = Callback.get(functionPointer);
        return instance instanceof SDL_IOStreamInterfaceWriteCallback
            ? (SDL_IOStreamInterfaceWriteCallback)instance
            : new Container(functionPointer, instance);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code functionPointer} is {@code NULL}. */
    public static @Nullable SDL_IOStreamInterfaceWriteCallback createSafe(long functionPointer) {
        return functionPointer == NULL ? null : create(functionPointer);
    }

    /** Creates a {@code SDL_IOStreamInterfaceWriteCallback} instance that delegates to the specified {@code SDL_IOStreamInterfaceWriteCallbackI} instance. */
    public static SDL_IOStreamInterfaceWriteCallback create(SDL_IOStreamInterfaceWriteCallbackI instance) {
        return instance instanceof SDL_IOStreamInterfaceWriteCallback
            ? (SDL_IOStreamInterfaceWriteCallback)instance
            : new Container(instance.address(), instance);
    }

    protected SDL_IOStreamInterfaceWriteCallback() {
        super(CIF);
    }

    SDL_IOStreamInterfaceWriteCallback(long functionPointer) {
        super(functionPointer);
    }

    private static final class Container extends SDL_IOStreamInterfaceWriteCallback {

        private final SDL_IOStreamInterfaceWriteCallbackI delegate;

        Container(long functionPointer, SDL_IOStreamInterfaceWriteCallbackI delegate) {
            super(functionPointer);
            this.delegate = delegate;
        }

        @Override
        public long invoke(long userdata, long ptr, long size, long status) {
            return delegate.invoke(userdata, ptr, size, status);
        }

    }

}