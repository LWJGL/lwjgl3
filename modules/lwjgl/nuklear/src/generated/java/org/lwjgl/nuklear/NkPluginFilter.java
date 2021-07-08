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
 * Instances of this class may be set to the {@link NkTextEdit} struct.
 * 
 * <h3>Type</h3>
 * 
 * <pre><code>
 * nk_bool (*{@link #invoke}) (
 *     struct nk_text_edit const *edit,
 *     nk_rune unicode
 * )</code></pre>
 */
public abstract class NkPluginFilter extends Callback implements NkPluginFilterI {

    /**
     * Creates a {@code NkPluginFilter} instance from the specified function pointer.
     *
     * @return the new {@code NkPluginFilter}
     */
    public static NkPluginFilter create(long functionPointer) {
        NkPluginFilterI instance = Callback.get(functionPointer);
        return instance instanceof NkPluginFilter
            ? (NkPluginFilter)instance
            : new Container(functionPointer, instance);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code functionPointer} is {@code NULL}. */
    @Nullable
    public static NkPluginFilter createSafe(long functionPointer) {
        return functionPointer == NULL ? null : create(functionPointer);
    }

    /** Creates a {@code NkPluginFilter} instance that delegates to the specified {@code NkPluginFilterI} instance. */
    public static NkPluginFilter create(NkPluginFilterI instance) {
        return instance instanceof NkPluginFilter
            ? (NkPluginFilter)instance
            : new Container(instance.address(), instance);
    }

    protected NkPluginFilter() {
        super(CIF);
    }

    NkPluginFilter(long functionPointer) {
        super(functionPointer);
    }

    private static final class Container extends NkPluginFilter {

        private final NkPluginFilterI delegate;

        Container(long functionPointer, NkPluginFilterI delegate) {
            super(functionPointer);
            this.delegate = delegate;
        }

        @Override
        public boolean invoke(long edit, int unicode) {
            return delegate.invoke(edit, unicode);
        }

    }

}