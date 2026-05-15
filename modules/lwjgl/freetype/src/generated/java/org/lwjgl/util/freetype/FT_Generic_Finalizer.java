/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.util.freetype;

import org.jspecify.annotations.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;

/** Callback function: {@link #invoke FT_Generic_Finalizer} */
public abstract class FT_Generic_Finalizer extends Callback implements FT_Generic_FinalizerI {

    /**
     * Creates a {@code FT_Generic_Finalizer} instance from the specified function pointer.
     *
     * @return the new {@code FT_Generic_Finalizer}
     */
    public static FT_Generic_Finalizer create(long functionPointer) { return create(Callback.get(functionPointer), functionPointer); }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code functionPointer} is {@code NULL}. */
    public static @Nullable FT_Generic_Finalizer createSafe(long functionPointer) { return functionPointer == NULL ? null : create(functionPointer); }

    /** Creates a {@code FT_Generic_Finalizer} instance that delegates to the specified {@code FT_Generic_FinalizerI} instance. */
    public static FT_Generic_Finalizer create(FT_Generic_FinalizerI instance) { return create(instance, instance.address()); }

    private static FT_Generic_Finalizer create(FT_Generic_FinalizerI instance, long functionPointer) {
        return instance instanceof FT_Generic_Finalizer
            ? (FT_Generic_Finalizer)instance
            : new FT_Generic_Finalizer(functionPointer) {
                @Override public void invoke(long object) {
                    instance.invoke(object);
                }
            };
    }

    protected FT_Generic_Finalizer() {
        super(DESCRIPTOR);
    }

    FT_Generic_Finalizer(long functionPointer) {
        super(functionPointer);
    }

}