/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.cuda;

import javax.annotation.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;

/**
 * Instances of this class may be passed to the {@link CU65#cuOccupancyMaxPotentialBlockSize OccupancyMaxPotentialBlockSize} and {@link CU65#cuOccupancyMaxPotentialBlockSizeWithFlags OccupancyMaxPotentialBlockSizeWithFlags} methods.
 * 
 * <h3>Type</h3>
 * 
 * <pre><code>
 * size_t (*) (
 *     int blockSize
 * )</code></pre>
 */
public abstract class CUoccupancyB2DSize extends Callback implements CUoccupancyB2DSizeI {

    /**
     * Creates a {@code CUoccupancyB2DSize} instance from the specified function pointer.
     *
     * @return the new {@code CUoccupancyB2DSize}
     */
    public static CUoccupancyB2DSize create(long functionPointer) {
        CUoccupancyB2DSizeI instance = Callback.get(functionPointer);
        return instance instanceof CUoccupancyB2DSize
            ? (CUoccupancyB2DSize)instance
            : new Container(functionPointer, instance);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code functionPointer} is {@code NULL}. */
    @Nullable
    public static CUoccupancyB2DSize createSafe(long functionPointer) {
        return functionPointer == NULL ? null : create(functionPointer);
    }

    /** Creates a {@code CUoccupancyB2DSize} instance that delegates to the specified {@code CUoccupancyB2DSizeI} instance. */
    public static CUoccupancyB2DSize create(CUoccupancyB2DSizeI instance) {
        return instance instanceof CUoccupancyB2DSize
            ? (CUoccupancyB2DSize)instance
            : new Container(instance.address(), instance);
    }

    protected CUoccupancyB2DSize() {
        super(CIF);
    }

    CUoccupancyB2DSize(long functionPointer) {
        super(functionPointer);
    }

    private static final class Container extends CUoccupancyB2DSize {

        private final CUoccupancyB2DSizeI delegate;

        Container(long functionPointer, CUoccupancyB2DSizeI delegate) {
            super(functionPointer);
            this.delegate = delegate;
        }

        @Override
        public long invoke(int blockSize) {
            return delegate.invoke(blockSize);
        }

    }

}