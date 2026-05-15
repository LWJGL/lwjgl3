/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.util.meshoptimizer;

import org.jspecify.annotations.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;

/** Callback function: {@link #invoke (* anonymous)} */
public abstract class MeshoptDeallocate extends Callback implements MeshoptDeallocateI {

    /**
     * Creates a {@code MeshoptDeallocate} instance from the specified function pointer.
     *
     * @return the new {@code MeshoptDeallocate}
     */
    public static MeshoptDeallocate create(long functionPointer) { return create(Callback.get(functionPointer), functionPointer); }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code functionPointer} is {@code NULL}. */
    public static @Nullable MeshoptDeallocate createSafe(long functionPointer) { return functionPointer == NULL ? null : create(functionPointer); }

    /** Creates a {@code MeshoptDeallocate} instance that delegates to the specified {@code MeshoptDeallocateI} instance. */
    public static MeshoptDeallocate create(MeshoptDeallocateI instance) { return create(instance, instance.address()); }

    private static MeshoptDeallocate create(MeshoptDeallocateI instance, long functionPointer) {
        return instance instanceof MeshoptDeallocate
            ? (MeshoptDeallocate)instance
            : new MeshoptDeallocate(functionPointer) {
                @Override public void invoke(long ptr) {
                    instance.invoke(ptr);
                }
            };
    }

    protected MeshoptDeallocate() {
        super(DESCRIPTOR);
    }

    MeshoptDeallocate(long functionPointer) {
        super(functionPointer);
    }

}