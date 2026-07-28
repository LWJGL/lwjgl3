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
    public static SPVParsedInstructionFn create(long functionPointer) { return create(Callback.get(functionPointer), functionPointer); }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code functionPointer} is {@code NULL}. */
    public static @Nullable SPVParsedInstructionFn createSafe(long functionPointer) { return functionPointer == NULL ? null : create(functionPointer); }

    /** Creates a {@code SPVParsedInstructionFn} instance that delegates to the specified {@code SPVParsedInstructionFnI} instance. */
    public static SPVParsedInstructionFn create(SPVParsedInstructionFnI instance) { return create(instance, instance.address()); }

    private static SPVParsedInstructionFn create(SPVParsedInstructionFnI instance, long functionPointer) {
        return instance instanceof SPVParsedInstructionFn
            ? (SPVParsedInstructionFn)instance
            : new SPVParsedInstructionFn(functionPointer) {
                @Override public int invoke(long user_data, long parsed_instruction) {
                    return instance.invoke(user_data, parsed_instruction);
                }
            };
    }

    protected SPVParsedInstructionFn() {
        super(DESCRIPTOR);
    }

    SPVParsedInstructionFn(long functionPointer) {
        super(functionPointer);
    }

}