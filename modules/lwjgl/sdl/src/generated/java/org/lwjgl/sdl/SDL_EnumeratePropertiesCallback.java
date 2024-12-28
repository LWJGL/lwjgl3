/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.sdl;

import org.jspecify.annotations.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;

/** Callback function: {@link #invoke SDL_EnumeratePropertiesCallback} */
public abstract class SDL_EnumeratePropertiesCallback extends Callback implements SDL_EnumeratePropertiesCallbackI {

    /**
     * Creates a {@code SDL_EnumeratePropertiesCallback} instance from the specified function pointer.
     *
     * @return the new {@code SDL_EnumeratePropertiesCallback}
     */
    public static SDL_EnumeratePropertiesCallback create(long functionPointer) {
        SDL_EnumeratePropertiesCallbackI instance = Callback.get(functionPointer);
        return instance instanceof SDL_EnumeratePropertiesCallback
            ? (SDL_EnumeratePropertiesCallback)instance
            : new Container(functionPointer, instance);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code functionPointer} is {@code NULL}. */
    public static @Nullable SDL_EnumeratePropertiesCallback createSafe(long functionPointer) {
        return functionPointer == NULL ? null : create(functionPointer);
    }

    /** Creates a {@code SDL_EnumeratePropertiesCallback} instance that delegates to the specified {@code SDL_EnumeratePropertiesCallbackI} instance. */
    public static SDL_EnumeratePropertiesCallback create(SDL_EnumeratePropertiesCallbackI instance) {
        return instance instanceof SDL_EnumeratePropertiesCallback
            ? (SDL_EnumeratePropertiesCallback)instance
            : new Container(instance.address(), instance);
    }

    protected SDL_EnumeratePropertiesCallback() {
        super(CIF);
    }

    SDL_EnumeratePropertiesCallback(long functionPointer) {
        super(functionPointer);
    }

    private static final class Container extends SDL_EnumeratePropertiesCallback {

        private final SDL_EnumeratePropertiesCallbackI delegate;

        Container(long functionPointer, SDL_EnumeratePropertiesCallbackI delegate) {
            super(functionPointer);
            this.delegate = delegate;
        }

        @Override
        public void invoke(long userdata, int props, long name) {
            delegate.invoke(userdata, props, name);
        }

    }

}