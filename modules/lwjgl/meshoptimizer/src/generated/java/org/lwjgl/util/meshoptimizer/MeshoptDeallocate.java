/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.util.meshoptimizer;

import javax.annotation.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;

/**
 * Instances of this class may be passed to the {@link MeshOptimizer#meshopt_setAllocator setAllocator} method.
 * 
 * <h3>Type</h3>
 * 
 * <pre><code>
 * void (*{@link #invoke}) (
 *     void *ptr
 * )</code></pre>
 */
public abstract class MeshoptDeallocate extends Callback implements MeshoptDeallocateI {

    /**
     * Creates a {@code MeshoptDeallocate} instance from the specified function pointer.
     *
     * @return the new {@code MeshoptDeallocate}
     */
    public static MeshoptDeallocate create(long functionPointer) {
        MeshoptDeallocateI instance = Callback.get(functionPointer);
        return instance instanceof MeshoptDeallocate
            ? (MeshoptDeallocate)instance
            : new Container(functionPointer, instance);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code functionPointer} is {@code NULL}. */
    @Nullable
    public static MeshoptDeallocate createSafe(long functionPointer) {
        return functionPointer == NULL ? null : create(functionPointer);
    }

    /** Creates a {@code MeshoptDeallocate} instance that delegates to the specified {@code MeshoptDeallocateI} instance. */
    public static MeshoptDeallocate create(MeshoptDeallocateI instance) {
        return instance instanceof MeshoptDeallocate
            ? (MeshoptDeallocate)instance
            : new Container(instance.address(), instance);
    }

    protected MeshoptDeallocate() {
        super(CIF);
    }

    MeshoptDeallocate(long functionPointer) {
        super(functionPointer);
    }

    private static final class Container extends MeshoptDeallocate {

        private final MeshoptDeallocateI delegate;

        Container(long functionPointer, MeshoptDeallocateI delegate) {
            super(functionPointer);
            this.delegate = delegate;
        }

        @Override
        public void invoke(long ptr) {
            delegate.invoke(ptr);
        }

    }

}