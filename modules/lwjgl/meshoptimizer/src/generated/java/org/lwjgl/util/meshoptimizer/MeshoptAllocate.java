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
public abstract class MeshoptAllocate extends Callback implements MeshoptAllocateI {

    /**
     * Creates a {@code MeshoptAllocate} instance from the specified function pointer.
     *
     * @return the new {@code MeshoptAllocate}
     */
    public static MeshoptAllocate create(long functionPointer) { return create(Callback.get(functionPointer), functionPointer); }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code functionPointer} is {@code NULL}. */
    public static @Nullable MeshoptAllocate createSafe(long functionPointer) { return functionPointer == NULL ? null : create(functionPointer); }

    /** Creates a {@code MeshoptAllocate} instance that delegates to the specified {@code MeshoptAllocateI} instance. */
    public static MeshoptAllocate create(MeshoptAllocateI instance) { return create(instance, instance.address()); }

    private static MeshoptAllocate create(MeshoptAllocateI instance, long functionPointer) {
        return instance instanceof MeshoptAllocate
            ? (MeshoptAllocate)instance
            : new MeshoptAllocate(functionPointer) {
                @Override public long invoke(long size) {
                    return instance.invoke(size);
                }
            };
    }

    protected MeshoptAllocate() {
        super(DESCRIPTOR);
    }

    MeshoptAllocate(long functionPointer) {
        super(functionPointer);
    }

}