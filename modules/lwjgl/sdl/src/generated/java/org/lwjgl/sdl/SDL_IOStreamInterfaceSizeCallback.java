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
    public static SDL_IOStreamInterfaceSizeCallback create(long functionPointer) { return create(Callback.get(functionPointer), functionPointer); }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code functionPointer} is {@code NULL}. */
    public static @Nullable SDL_IOStreamInterfaceSizeCallback createSafe(long functionPointer) { return functionPointer == NULL ? null : create(functionPointer); }

    /** Creates a {@code SDL_IOStreamInterfaceSizeCallback} instance that delegates to the specified {@code SDL_IOStreamInterfaceSizeCallbackI} instance. */
    public static SDL_IOStreamInterfaceSizeCallback create(SDL_IOStreamInterfaceSizeCallbackI instance) { return create(instance, instance.address()); }

    private static SDL_IOStreamInterfaceSizeCallback create(SDL_IOStreamInterfaceSizeCallbackI instance, long functionPointer) {
        return instance instanceof SDL_IOStreamInterfaceSizeCallback
            ? (SDL_IOStreamInterfaceSizeCallback)instance
            : new SDL_IOStreamInterfaceSizeCallback(functionPointer) {
                @Override public long invoke(long userdata) {
                    return instance.invoke(userdata);
                }
            };
    }

    protected SDL_IOStreamInterfaceSizeCallback() {
        super(DESCRIPTOR);
    }

    SDL_IOStreamInterfaceSizeCallback(long functionPointer) {
        super(functionPointer);
    }

}