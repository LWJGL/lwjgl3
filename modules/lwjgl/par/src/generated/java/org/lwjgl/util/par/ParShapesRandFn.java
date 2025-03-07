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
    public static ParShapesRandFn create(long functionPointer) {
        ParShapesRandFnI instance = Callback.get(functionPointer);
        return instance instanceof ParShapesRandFn
            ? (ParShapesRandFn)instance
            : new Container(functionPointer, instance);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code functionPointer} is {@code NULL}. */
    public static @Nullable ParShapesRandFn createSafe(long functionPointer) {
        return functionPointer == NULL ? null : create(functionPointer);
    }

    /** Creates a {@code ParShapesRandFn} instance that delegates to the specified {@code ParShapesRandFnI} instance. */
    public static ParShapesRandFn create(ParShapesRandFnI instance) {
        return instance instanceof ParShapesRandFn
            ? (ParShapesRandFn)instance
            : new Container(instance.address(), instance);
    }

    protected ParShapesRandFn() {
        super(CIF);
    }

    ParShapesRandFn(long functionPointer) {
        super(functionPointer);
    }

    private static final class Container extends ParShapesRandFn {

        private final ParShapesRandFnI delegate;

        Container(long functionPointer, ParShapesRandFnI delegate) {
            super(functionPointer);
            this.delegate = delegate;
        }

        @Override
        public float invoke(long context) {
            return delegate.invoke(context);
        }

    }

}