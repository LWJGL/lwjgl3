/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.sdl;

import org.jspecify.annotations.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;

/** Callback function: {@link #invoke SDL_ClipboardCleanupCallback} */
public abstract class SDL_ClipboardCleanupCallback extends Callback implements SDL_ClipboardCleanupCallbackI {

    /**
     * Creates a {@code SDL_ClipboardCleanupCallback} instance from the specified function pointer.
     *
     * @return the new {@code SDL_ClipboardCleanupCallback}
     */
    public static SDL_ClipboardCleanupCallback create(long functionPointer) {
        SDL_ClipboardCleanupCallbackI instance = Callback.get(functionPointer);
        return instance instanceof SDL_ClipboardCleanupCallback
            ? (SDL_ClipboardCleanupCallback)instance
            : new Container(functionPointer, instance);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code functionPointer} is {@code NULL}. */
    public static @Nullable SDL_ClipboardCleanupCallback createSafe(long functionPointer) {
        return functionPointer == NULL ? null : create(functionPointer);
    }

    /** Creates a {@code SDL_ClipboardCleanupCallback} instance that delegates to the specified {@code SDL_ClipboardCleanupCallbackI} instance. */
    public static SDL_ClipboardCleanupCallback create(SDL_ClipboardCleanupCallbackI instance) {
        return instance instanceof SDL_ClipboardCleanupCallback
            ? (SDL_ClipboardCleanupCallback)instance
            : new Container(instance.address(), instance);
    }

    protected SDL_ClipboardCleanupCallback() {
        super(CIF);
    }

    SDL_ClipboardCleanupCallback(long functionPointer) {
        super(functionPointer);
    }

    private static final class Container extends SDL_ClipboardCleanupCallback {

        private final SDL_ClipboardCleanupCallbackI delegate;

        Container(long functionPointer, SDL_ClipboardCleanupCallbackI delegate) {
            super(functionPointer);
            this.delegate = delegate;
        }

        @Override
        public void invoke(long userdata) {
            delegate.invoke(userdata);
        }

    }

}