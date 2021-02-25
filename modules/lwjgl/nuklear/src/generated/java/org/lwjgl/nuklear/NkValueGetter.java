/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.nuklear;

import javax.annotation.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;

/**
 * Instances of this class may be passed to the {@link Nuklear#nk_plot_function plot_function} function.
 * 
 * <h3>Type</h3>
 * 
 * <pre><code>
 * float (*) (
 *     void *userdata,
 *     int index
 * )</code></pre>
 */
public abstract class NkValueGetter extends Callback implements NkValueGetterI {

    /**
     * Creates a {@code NkValueGetter} instance from the specified function pointer.
     *
     * @return the new {@code NkValueGetter}
     */
    public static NkValueGetter create(long functionPointer) {
        NkValueGetterI instance = Callback.get(functionPointer);
        return instance instanceof NkValueGetter
            ? (NkValueGetter)instance
            : new Container(functionPointer, instance);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code functionPointer} is {@code NULL}. */
    @Nullable
    public static NkValueGetter createSafe(long functionPointer) {
        return functionPointer == NULL ? null : create(functionPointer);
    }

    /** Creates a {@code NkValueGetter} instance that delegates to the specified {@code NkValueGetterI} instance. */
    public static NkValueGetter create(NkValueGetterI instance) {
        return instance instanceof NkValueGetter
            ? (NkValueGetter)instance
            : new Container(instance.address(), instance);
    }

    protected NkValueGetter() {
        super(CIF);
    }

    NkValueGetter(long functionPointer) {
        super(functionPointer);
    }

    private static final class Container extends NkValueGetter {

        private final NkValueGetterI delegate;

        Container(long functionPointer, NkValueGetterI delegate) {
            super(functionPointer);
            this.delegate = delegate;
        }

        @Override
        public float invoke(long userdata, int index) {
            return delegate.invoke(userdata, index);
        }

    }

}