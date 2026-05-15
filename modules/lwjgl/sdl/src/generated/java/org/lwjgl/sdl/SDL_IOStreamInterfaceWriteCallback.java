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
    public static SDL_IOStreamInterfaceWriteCallback create(long functionPointer) { return create(Callback.get(functionPointer), functionPointer); }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code functionPointer} is {@code NULL}. */
    public static @Nullable SDL_IOStreamInterfaceWriteCallback createSafe(long functionPointer) { return functionPointer == NULL ? null : create(functionPointer); }

    /** Creates a {@code SDL_IOStreamInterfaceWriteCallback} instance that delegates to the specified {@code SDL_IOStreamInterfaceWriteCallbackI} instance. */
    public static SDL_IOStreamInterfaceWriteCallback create(SDL_IOStreamInterfaceWriteCallbackI instance) { return create(instance, instance.address()); }

    private static SDL_IOStreamInterfaceWriteCallback create(SDL_IOStreamInterfaceWriteCallbackI instance, long functionPointer) {
        return instance instanceof SDL_IOStreamInterfaceWriteCallback
            ? (SDL_IOStreamInterfaceWriteCallback)instance
            : new SDL_IOStreamInterfaceWriteCallback(functionPointer) {
                @Override public long invoke(long userdata, long ptr, long size, long status) {
                    return instance.invoke(userdata, ptr, size, status);
                }
            };
    }

    protected SDL_IOStreamInterfaceWriteCallback() {
        super(DESCRIPTOR);
    }

    SDL_IOStreamInterfaceWriteCallback(long functionPointer) {
        super(functionPointer);
    }

}