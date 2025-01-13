/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.sdl;

import org.jspecify.annotations.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;

/** Callback function: {@link #invoke SDL_RequestAndroidPermissionCallback} */
public abstract class SDL_RequestAndroidPermissionCallback extends Callback implements SDL_RequestAndroidPermissionCallbackI {

    /**
     * Creates a {@code SDL_RequestAndroidPermissionCallback} instance from the specified function pointer.
     *
     * @return the new {@code SDL_RequestAndroidPermissionCallback}
     */
    public static SDL_RequestAndroidPermissionCallback create(long functionPointer) {
        SDL_RequestAndroidPermissionCallbackI instance = Callback.get(functionPointer);
        return instance instanceof SDL_RequestAndroidPermissionCallback
            ? (SDL_RequestAndroidPermissionCallback)instance
            : new Container(functionPointer, instance);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code functionPointer} is {@code NULL}. */
    public static @Nullable SDL_RequestAndroidPermissionCallback createSafe(long functionPointer) {
        return functionPointer == NULL ? null : create(functionPointer);
    }

    /** Creates a {@code SDL_RequestAndroidPermissionCallback} instance that delegates to the specified {@code SDL_RequestAndroidPermissionCallbackI} instance. */
    public static SDL_RequestAndroidPermissionCallback create(SDL_RequestAndroidPermissionCallbackI instance) {
        return instance instanceof SDL_RequestAndroidPermissionCallback
            ? (SDL_RequestAndroidPermissionCallback)instance
            : new Container(instance.address(), instance);
    }

    protected SDL_RequestAndroidPermissionCallback() {
        super(CIF);
    }

    SDL_RequestAndroidPermissionCallback(long functionPointer) {
        super(functionPointer);
    }

    private static final class Container extends SDL_RequestAndroidPermissionCallback {

        private final SDL_RequestAndroidPermissionCallbackI delegate;

        Container(long functionPointer, SDL_RequestAndroidPermissionCallbackI delegate) {
            super(functionPointer);
            this.delegate = delegate;
        }

        @Override
        public void invoke(long userdata, long permission, boolean granted) {
            delegate.invoke(userdata, permission, granted);
        }

    }

}