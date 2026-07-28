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
public abstract class SDL_IOStreamInterfaceCloseCallback extends Callback implements SDL_IOStreamInterfaceCloseCallbackI {

    /**
     * Creates a {@code SDL_IOStreamInterfaceCloseCallback} instance from the specified function pointer.
     *
     * @return the new {@code SDL_IOStreamInterfaceCloseCallback}
     */
    public static SDL_IOStreamInterfaceCloseCallback create(long functionPointer) { return create(Callback.get(functionPointer), functionPointer); }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code functionPointer} is {@code NULL}. */
    public static @Nullable SDL_IOStreamInterfaceCloseCallback createSafe(long functionPointer) { return functionPointer == NULL ? null : create(functionPointer); }

    /** Creates a {@code SDL_IOStreamInterfaceCloseCallback} instance that delegates to the specified {@code SDL_IOStreamInterfaceCloseCallbackI} instance. */
    public static SDL_IOStreamInterfaceCloseCallback create(SDL_IOStreamInterfaceCloseCallbackI instance) { return create(instance, instance.address()); }

    private static SDL_IOStreamInterfaceCloseCallback create(SDL_IOStreamInterfaceCloseCallbackI instance, long functionPointer) {
        return instance instanceof SDL_IOStreamInterfaceCloseCallback
            ? (SDL_IOStreamInterfaceCloseCallback)instance
            : new SDL_IOStreamInterfaceCloseCallback(functionPointer) {
                @Override public boolean invoke(long userdata) {
                    return instance.invoke(userdata);
                }
            };
    }

    protected SDL_IOStreamInterfaceCloseCallback() {
        super(DESCRIPTOR);
    }

    SDL_IOStreamInterfaceCloseCallback(long functionPointer) {
        super(functionPointer);
    }

}