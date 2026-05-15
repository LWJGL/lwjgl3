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
public abstract class SDL_IOStreamInterfaceReadCallback extends Callback implements SDL_IOStreamInterfaceReadCallbackI {

    /**
     * Creates a {@code SDL_IOStreamInterfaceReadCallback} instance from the specified function pointer.
     *
     * @return the new {@code SDL_IOStreamInterfaceReadCallback}
     */
    public static SDL_IOStreamInterfaceReadCallback create(long functionPointer) { return create(Callback.get(functionPointer), functionPointer); }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code functionPointer} is {@code NULL}. */
    public static @Nullable SDL_IOStreamInterfaceReadCallback createSafe(long functionPointer) { return functionPointer == NULL ? null : create(functionPointer); }

    /** Creates a {@code SDL_IOStreamInterfaceReadCallback} instance that delegates to the specified {@code SDL_IOStreamInterfaceReadCallbackI} instance. */
    public static SDL_IOStreamInterfaceReadCallback create(SDL_IOStreamInterfaceReadCallbackI instance) { return create(instance, instance.address()); }

    private static SDL_IOStreamInterfaceReadCallback create(SDL_IOStreamInterfaceReadCallbackI instance, long functionPointer) {
        return instance instanceof SDL_IOStreamInterfaceReadCallback
            ? (SDL_IOStreamInterfaceReadCallback)instance
            : new SDL_IOStreamInterfaceReadCallback(functionPointer) {
                @Override public long invoke(long userdata, long ptr, long size, long status) {
                    return instance.invoke(userdata, ptr, size, status);
                }
            };
    }

    protected SDL_IOStreamInterfaceReadCallback() {
        super(DESCRIPTOR);
    }

    SDL_IOStreamInterfaceReadCallback(long functionPointer) {
        super(functionPointer);
    }

}