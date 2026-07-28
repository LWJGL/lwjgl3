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
public abstract class MeshoptEquals extends Callback implements MeshoptEqualsI {

    /**
     * Creates a {@code MeshoptEquals} instance from the specified function pointer.
     *
     * @return the new {@code MeshoptEquals}
     */
    public static MeshoptEquals create(long functionPointer) { return create(Callback.get(functionPointer), functionPointer); }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code functionPointer} is {@code NULL}. */
    public static @Nullable MeshoptEquals createSafe(long functionPointer) { return functionPointer == NULL ? null : create(functionPointer); }

    /** Creates a {@code MeshoptEquals} instance that delegates to the specified {@code MeshoptEqualsI} instance. */
    public static MeshoptEquals create(MeshoptEqualsI instance) { return create(instance, instance.address()); }

    private static MeshoptEquals create(MeshoptEqualsI instance, long functionPointer) {
        return instance instanceof MeshoptEquals
            ? (MeshoptEquals)instance
            : new MeshoptEquals(functionPointer) {
                @Override public int invoke(long context, int index_a, int index_b) {
                    return instance.invoke(context, index_a, index_b);
                }
            };
    }

    protected MeshoptEquals() {
        super(DESCRIPTOR);
    }

    MeshoptEquals(long functionPointer) {
        super(functionPointer);
    }

}