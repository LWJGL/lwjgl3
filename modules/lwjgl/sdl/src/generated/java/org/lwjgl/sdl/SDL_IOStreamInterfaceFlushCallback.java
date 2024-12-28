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
public abstract class SDL_IOStreamInterfaceFlushCallback extends Callback implements SDL_IOStreamInterfaceFlushCallbackI {

    /**
     * Creates a {@code SDL_IOStreamInterfaceFlushCallback} instance from the specified function pointer.
     *
     * @return the new {@code SDL_IOStreamInterfaceFlushCallback}
     */
    public static SDL_IOStreamInterfaceFlushCallback create(long functionPointer) {
        SDL_IOStreamInterfaceFlushCallbackI instance = Callback.get(functionPointer);
        return instance instanceof SDL_IOStreamInterfaceFlushCallback
            ? (SDL_IOStreamInterfaceFlushCallback)instance
            : new Container(functionPointer, instance);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code functionPointer} is {@code NULL}. */
    public static @Nullable SDL_IOStreamInterfaceFlushCallback createSafe(long functionPointer) {
        return functionPointer == NULL ? null : create(functionPointer);
    }

    /** Creates a {@code SDL_IOStreamInterfaceFlushCallback} instance that delegates to the specified {@code SDL_IOStreamInterfaceFlushCallbackI} instance. */
    public static SDL_IOStreamInterfaceFlushCallback create(SDL_IOStreamInterfaceFlushCallbackI instance) {
        return instance instanceof SDL_IOStreamInterfaceFlushCallback
            ? (SDL_IOStreamInterfaceFlushCallback)instance
            : new Container(instance.address(), instance);
    }

    protected SDL_IOStreamInterfaceFlushCallback() {
        super(CIF);
    }

    SDL_IOStreamInterfaceFlushCallback(long functionPointer) {
        super(functionPointer);
    }

    private static final class Container extends SDL_IOStreamInterfaceFlushCallback {

        private final SDL_IOStreamInterfaceFlushCallbackI delegate;

        Container(long functionPointer, SDL_IOStreamInterfaceFlushCallbackI delegate) {
            super(functionPointer);
            this.delegate = delegate;
        }

        @Override
        public boolean invoke(long userdata, long status) {
            return delegate.invoke(userdata, status);
        }

    }

}