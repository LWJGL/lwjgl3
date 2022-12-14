/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.util.freetype;

import javax.annotation.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;

/**
 * <h3>Type</h3>
 * 
 * <pre><code>
 * void (*{@link #invoke}) (
 *     void *object
 * )</code></pre>
 */
public abstract class FT_Generic_Finalizer extends Callback implements FT_Generic_FinalizerI {

    /**
     * Creates a {@code FT_Generic_Finalizer} instance from the specified function pointer.
     *
     * @return the new {@code FT_Generic_Finalizer}
     */
    public static FT_Generic_Finalizer create(long functionPointer) {
        FT_Generic_FinalizerI instance = Callback.get(functionPointer);
        return instance instanceof FT_Generic_Finalizer
            ? (FT_Generic_Finalizer)instance
            : new Container(functionPointer, instance);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code functionPointer} is {@code NULL}. */
    @Nullable
    public static FT_Generic_Finalizer createSafe(long functionPointer) {
        return functionPointer == NULL ? null : create(functionPointer);
    }

    /** Creates a {@code FT_Generic_Finalizer} instance that delegates to the specified {@code FT_Generic_FinalizerI} instance. */
    public static FT_Generic_Finalizer create(FT_Generic_FinalizerI instance) {
        return instance instanceof FT_Generic_Finalizer
            ? (FT_Generic_Finalizer)instance
            : new Container(instance.address(), instance);
    }

    protected FT_Generic_Finalizer() {
        super(CIF);
    }

    FT_Generic_Finalizer(long functionPointer) {
        super(functionPointer);
    }

    private static final class Container extends FT_Generic_Finalizer {

        private final FT_Generic_FinalizerI delegate;

        Container(long functionPointer, FT_Generic_FinalizerI delegate) {
            super(functionPointer);
            this.delegate = delegate;
        }

        @Override
        public void invoke(long object) {
            delegate.invoke(object);
        }

    }

}