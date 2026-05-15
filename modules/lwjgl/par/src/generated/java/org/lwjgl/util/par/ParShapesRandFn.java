/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.util.par;

import org.jspecify.annotations.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;

/** Callback function: {@link #invoke par_shapes_rand_fn} */
public abstract class ParShapesRandFn extends Callback implements ParShapesRandFnI {

    /**
     * Creates a {@code ParShapesRandFn} instance from the specified function pointer.
     *
     * @return the new {@code ParShapesRandFn}
     */
    public static ParShapesRandFn create(long functionPointer) { return create(Callback.get(functionPointer), functionPointer); }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code functionPointer} is {@code NULL}. */
    public static @Nullable ParShapesRandFn createSafe(long functionPointer) { return functionPointer == NULL ? null : create(functionPointer); }

    /** Creates a {@code ParShapesRandFn} instance that delegates to the specified {@code ParShapesRandFnI} instance. */
    public static ParShapesRandFn create(ParShapesRandFnI instance) { return create(instance, instance.address()); }

    private static ParShapesRandFn create(ParShapesRandFnI instance, long functionPointer) {
        return instance instanceof ParShapesRandFn
            ? (ParShapesRandFn)instance
            : new ParShapesRandFn(functionPointer) {
                @Override public float invoke(long context) {
                    return instance.invoke(context);
                }
            };
    }

    protected ParShapesRandFn() {
        super(DESCRIPTOR);
    }

    ParShapesRandFn(long functionPointer) {
        super(functionPointer);
    }

}