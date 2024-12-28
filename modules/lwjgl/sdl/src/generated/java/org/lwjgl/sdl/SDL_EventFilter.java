/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.sdl;

import org.jspecify.annotations.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;

/** Callback function: {@link #invoke SDL_EventFilter} */
public abstract class SDL_EventFilter extends Callback implements SDL_EventFilterI {

    /**
     * Creates a {@code SDL_EventFilter} instance from the specified function pointer.
     *
     * @return the new {@code SDL_EventFilter}
     */
    public static SDL_EventFilter create(long functionPointer) {
        SDL_EventFilterI instance = Callback.get(functionPointer);
        return instance instanceof SDL_EventFilter
            ? (SDL_EventFilter)instance
            : new Container(functionPointer, instance);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code functionPointer} is {@code NULL}. */
    public static @Nullable SDL_EventFilter createSafe(long functionPointer) {
        return functionPointer == NULL ? null : create(functionPointer);
    }

    /** Creates a {@code SDL_EventFilter} instance that delegates to the specified {@code SDL_EventFilterI} instance. */
    public static SDL_EventFilter create(SDL_EventFilterI instance) {
        return instance instanceof SDL_EventFilter
            ? (SDL_EventFilter)instance
            : new Container(instance.address(), instance);
    }

    protected SDL_EventFilter() {
        super(CIF);
    }

    SDL_EventFilter(long functionPointer) {
        super(functionPointer);
    }

    private static final class Container extends SDL_EventFilter {

        private final SDL_EventFilterI delegate;

        Container(long functionPointer, SDL_EventFilterI delegate) {
            super(functionPointer);
            this.delegate = delegate;
        }

        @Override
        public boolean invoke(long userdata, long event) {
            return delegate.invoke(userdata, event);
        }

    }

}