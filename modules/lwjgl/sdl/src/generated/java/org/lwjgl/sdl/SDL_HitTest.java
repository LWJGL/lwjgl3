/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.sdl;

import org.jspecify.annotations.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;

/** Callback function: {@link #invoke SDL_HitTest} */
public abstract class SDL_HitTest extends Callback implements SDL_HitTestI {

    /**
     * Creates a {@code SDL_HitTest} instance from the specified function pointer.
     *
     * @return the new {@code SDL_HitTest}
     */
    public static SDL_HitTest create(long functionPointer) { return create(Callback.get(functionPointer), functionPointer); }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code functionPointer} is {@code NULL}. */
    public static @Nullable SDL_HitTest createSafe(long functionPointer) { return functionPointer == NULL ? null : create(functionPointer); }

    /** Creates a {@code SDL_HitTest} instance that delegates to the specified {@code SDL_HitTestI} instance. */
    public static SDL_HitTest create(SDL_HitTestI instance) { return create(instance, instance.address()); }

    private static SDL_HitTest create(SDL_HitTestI instance, long functionPointer) {
        return instance instanceof SDL_HitTest
            ? (SDL_HitTest)instance
            : new SDL_HitTest(functionPointer) {
                @Override public int invoke(long win, long area, long data) {
                    return instance.invoke(win, area, data);
                }
            };
    }

    protected SDL_HitTest() {
        super(DESCRIPTOR);
    }

    SDL_HitTest(long functionPointer) {
        super(functionPointer);
    }

}