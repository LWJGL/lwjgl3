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
 * void * (*) (
 *     nk_handle handle,
 *     void *old,
 *     nk_size size
 * )</code></pre>
 */
public abstract class NkPluginAlloc extends Callback implements NkPluginAllocI {

    /**
     * Creates a {@code NkPluginAlloc} instance from the specified function pointer.
     *
     * @return the new {@code NkPluginAlloc}
     */
    public static NkPluginAlloc create(long functionPointer) {
        NkPluginAllocI instance = Callback.get(functionPointer);
        return instance instanceof NkPluginAlloc
            ? (NkPluginAlloc)instance
            : new Container(functionPointer, instance);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code functionPointer} is {@code NULL}. */
    @Nullable
    public static NkPluginAlloc createSafe(long functionPointer) {
        return functionPointer == NULL ? null : create(functionPointer);
    }

    /** Creates a {@code NkPluginAlloc} instance that delegates to the specified {@code NkPluginAllocI} instance. */
    public static NkPluginAlloc create(NkPluginAllocI instance) {
        return instance instanceof NkPluginAlloc
            ? (NkPluginAlloc)instance
            : new Container(instance.address(), instance);
    }

    protected NkPluginAlloc() {
        super(CIF);
    }

    NkPluginAlloc(long functionPointer) {
        super(functionPointer);
    }

    private static final class Container extends NkPluginAlloc {

        private final NkPluginAllocI delegate;

        Container(long functionPointer, NkPluginAllocI delegate) {
            super(functionPointer);
            this.delegate = delegate;
        }

        @Override
        public long invoke(long handle, long old, long size) {
            return delegate.invoke(handle, old, size);
        }

    }

}