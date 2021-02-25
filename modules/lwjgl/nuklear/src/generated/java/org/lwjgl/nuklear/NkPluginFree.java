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
 * <h3>Type</h3>
 * 
 * <pre><code>
 * void (*) (
 *     nk_handle handle,
 *     void *old
 * )</code></pre>
 */
public abstract class NkPluginFree extends Callback implements NkPluginFreeI {

    /**
     * Creates a {@code NkPluginFree} instance from the specified function pointer.
     *
     * @return the new {@code NkPluginFree}
     */
    public static NkPluginFree create(long functionPointer) {
        NkPluginFreeI instance = Callback.get(functionPointer);
        return instance instanceof NkPluginFree
            ? (NkPluginFree)instance
            : new Container(functionPointer, instance);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code functionPointer} is {@code NULL}. */
    @Nullable
    public static NkPluginFree createSafe(long functionPointer) {
        return functionPointer == NULL ? null : create(functionPointer);
    }

    /** Creates a {@code NkPluginFree} instance that delegates to the specified {@code NkPluginFreeI} instance. */
    public static NkPluginFree create(NkPluginFreeI instance) {
        return instance instanceof NkPluginFree
            ? (NkPluginFree)instance
            : new Container(instance.address(), instance);
    }

    protected NkPluginFree() {
        super(CIF);
    }

    NkPluginFree(long functionPointer) {
        super(functionPointer);
    }

    private static final class Container extends NkPluginFree {

        private final NkPluginFreeI delegate;

        Container(long functionPointer, NkPluginFreeI delegate) {
            super(functionPointer);
            this.delegate = delegate;
        }

        @Override
        public void invoke(long handle, long old) {
            delegate.invoke(handle, old);
        }

    }

}