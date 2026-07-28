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
public abstract class CXFieldVisitor extends Callback implements CXFieldVisitorI {

    /**
     * Creates a {@code CXFieldVisitor} instance from the specified function pointer.
     *
     * @return the new {@code CXFieldVisitor}
     */
    public static CXFieldVisitor create(long functionPointer) { return create(Callback.get(functionPointer), functionPointer); }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code functionPointer} is {@code NULL}. */
    public static @Nullable CXFieldVisitor createSafe(long functionPointer) { return functionPointer == NULL ? null : create(functionPointer); }

    /** Creates a {@code CXFieldVisitor} instance that delegates to the specified {@code CXFieldVisitorI} instance. */
    public static CXFieldVisitor create(CXFieldVisitorI instance) { return create(instance, instance.address()); }

    private static CXFieldVisitor create(CXFieldVisitorI instance, long functionPointer) {
        return instance instanceof CXFieldVisitor
            ? (CXFieldVisitor)instance
            : new CXFieldVisitor(functionPointer) {
                @Override public int invoke(CXCursor C, long client_data) {
                    return instance.invoke(C, client_data);
                }
            };
    }

    protected CXFieldVisitor() {
        super(DESCRIPTOR);
    }

    CXFieldVisitor(long functionPointer) {
        super(functionPointer);
    }

}