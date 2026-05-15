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
    public static SDL_EnumeratePropertiesCallback create(long functionPointer) { return create(Callback.get(functionPointer), functionPointer); }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code functionPointer} is {@code NULL}. */
    public static @Nullable SDL_EnumeratePropertiesCallback createSafe(long functionPointer) { return functionPointer == NULL ? null : create(functionPointer); }

    /** Creates a {@code SDL_EnumeratePropertiesCallback} instance that delegates to the specified {@code SDL_EnumeratePropertiesCallbackI} instance. */
    public static SDL_EnumeratePropertiesCallback create(SDL_EnumeratePropertiesCallbackI instance) { return create(instance, instance.address()); }

    private static SDL_EnumeratePropertiesCallback create(SDL_EnumeratePropertiesCallbackI instance, long functionPointer) {
        return instance instanceof SDL_EnumeratePropertiesCallback
            ? (SDL_EnumeratePropertiesCallback)instance
            : new SDL_EnumeratePropertiesCallback(functionPointer) {
                @Override public void invoke(long userdata, int props, long name) {
                    instance.invoke(userdata, props, name);
                }
            };
    }

    protected SDL_EnumeratePropertiesCallback() {
        super(DESCRIPTOR);
    }

    SDL_EnumeratePropertiesCallback(long functionPointer) {
        super(functionPointer);
    }

}