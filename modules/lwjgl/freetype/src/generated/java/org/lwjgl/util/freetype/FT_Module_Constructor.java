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
 * FT_Error (*{@link #invoke}) (
 *     FT_Module module
 * )</code></pre>
 */
public abstract class FT_Module_Constructor extends Callback implements FT_Module_ConstructorI {

    /**
     * Creates a {@code FT_Module_Constructor} instance from the specified function pointer.
     *
     * @return the new {@code FT_Module_Constructor}
     */
    public static FT_Module_Constructor create(long functionPointer) {
        FT_Module_ConstructorI instance = Callback.get(functionPointer);
        return instance instanceof FT_Module_Constructor
            ? (FT_Module_Constructor)instance
            : new Container(functionPointer, instance);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code functionPointer} is {@code NULL}. */
    @Nullable
    public static FT_Module_Constructor createSafe(long functionPointer) {
        return functionPointer == NULL ? null : create(functionPointer);
    }

    /** Creates a {@code FT_Module_Constructor} instance that delegates to the specified {@code FT_Module_ConstructorI} instance. */
    public static FT_Module_Constructor create(FT_Module_ConstructorI instance) {
        return instance instanceof FT_Module_Constructor
            ? (FT_Module_Constructor)instance
            : new Container(instance.address(), instance);
    }

    protected FT_Module_Constructor() {
        super(CIF);
    }

    FT_Module_Constructor(long functionPointer) {
        super(functionPointer);
    }

    private static final class Container extends FT_Module_Constructor {

        private final FT_Module_ConstructorI delegate;

        Container(long functionPointer, FT_Module_ConstructorI delegate) {
            super(functionPointer);
            this.delegate = delegate;
        }

        @Override
        public int invoke(long module) {
            return delegate.invoke(module);
        }

    }

}