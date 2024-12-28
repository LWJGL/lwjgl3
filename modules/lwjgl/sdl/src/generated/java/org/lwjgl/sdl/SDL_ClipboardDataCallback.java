/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.sdl;

import org.jspecify.annotations.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;

/** Callback function: {@link #invoke SDL_ClipboardDataCallback} */
public abstract class SDL_ClipboardDataCallback extends Callback implements SDL_ClipboardDataCallbackI {

    /**
     * Creates a {@code SDL_ClipboardDataCallback} instance from the specified function pointer.
     *
     * @return the new {@code SDL_ClipboardDataCallback}
     */
    public static SDL_ClipboardDataCallback create(long functionPointer) {
        SDL_ClipboardDataCallbackI instance = Callback.get(functionPointer);
        return instance instanceof SDL_ClipboardDataCallback
            ? (SDL_ClipboardDataCallback)instance
            : new Container(functionPointer, instance);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code functionPointer} is {@code NULL}. */
    public static @Nullable SDL_ClipboardDataCallback createSafe(long functionPointer) {
        return functionPointer == NULL ? null : create(functionPointer);
    }

    /** Creates a {@code SDL_ClipboardDataCallback} instance that delegates to the specified {@code SDL_ClipboardDataCallbackI} instance. */
    public static SDL_ClipboardDataCallback create(SDL_ClipboardDataCallbackI instance) {
        return instance instanceof SDL_ClipboardDataCallback
            ? (SDL_ClipboardDataCallback)instance
            : new Container(instance.address(), instance);
    }

    protected SDL_ClipboardDataCallback() {
        super(CIF);
    }

    SDL_ClipboardDataCallback(long functionPointer) {
        super(functionPointer);
    }

    private static final class Container extends SDL_ClipboardDataCallback {

        private final SDL_ClipboardDataCallbackI delegate;

        Container(long functionPointer, SDL_ClipboardDataCallbackI delegate) {
            super(functionPointer);
            this.delegate = delegate;
        }

        @Override
        public long invoke(long userdata, long mime_type, long size) {
            return delegate.invoke(userdata, mime_type, size);
        }

    }

}