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
public abstract class CXCursorVisitor extends Callback implements CXCursorVisitorI {

    /**
     * Creates a {@code CXCursorVisitor} instance from the specified function pointer.
     *
     * @return the new {@code CXCursorVisitor}
     */
    public static CXCursorVisitor create(long functionPointer) { return create(Callback.get(functionPointer), functionPointer); }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code functionPointer} is {@code NULL}. */
    public static @Nullable CXCursorVisitor createSafe(long functionPointer) { return functionPointer == NULL ? null : create(functionPointer); }

    /** Creates a {@code CXCursorVisitor} instance that delegates to the specified {@code CXCursorVisitorI} instance. */
    public static CXCursorVisitor create(CXCursorVisitorI instance) { return create(instance, instance.address()); }

    private static CXCursorVisitor create(CXCursorVisitorI instance, long functionPointer) {
        return instance instanceof CXCursorVisitor
            ? (CXCursorVisitor)instance
            : new CXCursorVisitor(functionPointer) {
                @Override public int invoke(CXCursor cursor, CXCursor parent, long client_data) {
                    return instance.invoke(cursor, parent, client_data);
                }
            };
    }

    protected CXCursorVisitor() {
        super(DESCRIPTOR);
    }

    CXCursorVisitor(long functionPointer) {
        super(functionPointer);
    }

}