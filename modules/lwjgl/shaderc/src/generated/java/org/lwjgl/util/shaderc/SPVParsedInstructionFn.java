/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.util.shaderc;

import org.jspecify.annotations.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;

/** Callback function: {@link #invoke spv_parsed_instruction_fn_t} */
public abstract class SPVParsedInstructionFn extends Callback implements SPVParsedInstructionFnI {

    /**
     * Creates a {@code SPVParsedInstructionFn} instance from the specified function pointer.
     *
     * @return the new {@code SPVParsedInstructionFn}
     */
    public static SPVParsedInstructionFn create(long functionPointer) {
        SPVParsedInstructionFnI instance = Callback.get(functionPointer);
        return instance instanceof SPVParsedInstructionFn
            ? (SPVParsedInstructionFn)instance
            : new Container(functionPointer, instance);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code functionPointer} is {@code NULL}. */
    public static @Nullable SPVParsedInstructionFn createSafe(long functionPointer) {
        return functionPointer == NULL ? null : create(functionPointer);
    }

    /** Creates a {@code SPVParsedInstructionFn} instance that delegates to the specified {@code SPVParsedInstructionFnI} instance. */
    public static SPVParsedInstructionFn create(SPVParsedInstructionFnI instance) {
        return instance instanceof SPVParsedInstructionFn
            ? (SPVParsedInstructionFn)instance
            : new Container(instance.address(), instance);
    }

    protected SPVParsedInstructionFn() {
        super(CIF);
    }

    SPVParsedInstructionFn(long functionPointer) {
        super(functionPointer);
    }

    private static final class Container extends SPVParsedInstructionFn {

        private final SPVParsedInstructionFnI delegate;

        Container(long functionPointer, SPVParsedInstructionFnI delegate) {
            super(functionPointer);
            this.delegate = delegate;
        }

        @Override
        public int invoke(long user_data, long parsed_instruction) {
            return delegate.invoke(user_data, parsed_instruction);
        }

    }

}