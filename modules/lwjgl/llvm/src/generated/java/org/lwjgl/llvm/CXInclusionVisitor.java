/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.llvm;

import org.jspecify.annotations.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;

/** Callback function: {@link #invoke (* anonymous)} */
public abstract class CXInclusionVisitor extends Callback implements CXInclusionVisitorI {

    /**
     * Creates a {@code CXInclusionVisitor} instance from the specified function pointer.
     *
     * @return the new {@code CXInclusionVisitor}
     */
    public static CXInclusionVisitor create(long functionPointer) { return create(Callback.get(functionPointer), functionPointer); }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code functionPointer} is {@code NULL}. */
    public static @Nullable CXInclusionVisitor createSafe(long functionPointer) { return functionPointer == NULL ? null : create(functionPointer); }

    /** Creates a {@code CXInclusionVisitor} instance that delegates to the specified {@code CXInclusionVisitorI} instance. */
    public static CXInclusionVisitor create(CXInclusionVisitorI instance) { return create(instance, instance.address()); }

    private static CXInclusionVisitor create(CXInclusionVisitorI instance, long functionPointer) {
        return instance instanceof CXInclusionVisitor
            ? (CXInclusionVisitor)instance
            : new CXInclusionVisitor(functionPointer) {
                @Override public void invoke(long included_file, long inclusion_stack, int include_len, long client_data) {
                    instance.invoke(included_file, inclusion_stack, include_len, client_data);
                }
            };
    }

    protected CXInclusionVisitor() {
        super(DESCRIPTOR);
    }

    CXInclusionVisitor(long functionPointer) {
        super(functionPointer);
    }

}