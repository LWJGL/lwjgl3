/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.llvm;

import org.lwjgl.system.*;

import static org.lwjgl.system.dyncall.DynCallback.*;

/**
 * Instances of this interface may be passed to the {@link LLVMDisassembler#LLVMCreateDisasm CreateDisasm}, {@link LLVMDisassembler#LLVMCreateDisasmCPU CreateDisasmCPU} and {@link LLVMDisassembler#LLVMCreateDisasmCPUFeatures CreateDisasmCPUFeatures} methods.
 * 
 * <h3>Type</h3>
 * 
 * <pre><code>
 * char const * (*) (
 *     void *DisInfo,
 *     uint64_t ReferenceValue,
 *     uint64_t *ReferenceType,
 *     uint64_t ReferencePC,
 *     char const **ReferenceName
 * )</code></pre>
 */
@FunctionalInterface
@NativeType("char const * (*) (void *, uint64_t, uint64_t *, uint64_t, char const **)")
public interface LLVMSymbolLookupCallbackI extends CallbackI.P {

    String SIGNATURE = "(plplp)p";

    @Override
    default String getSignature() { return SIGNATURE; }

    @Override
    default long callback(long args) {
        return invoke(
            dcbArgPointer(args),
            dcbArgLongLong(args),
            dcbArgPointer(args),
            dcbArgLongLong(args),
            dcbArgPointer(args)
        );
    }

    /**
     * The type for the symbol lookup function.
     * 
     * <p>This may be called by the disassembler for things like adding a comment for a PC plus a constant offset load instruction to use a symbol name instead
     * of a load address value. It is passed the block information is saved when the disassembler context is created and the {@code ReferenceValue} to look up
     * as a symbol. If no symbol is found for the {@code ReferenceValue} {@code NULL} is returned. The {@code ReferenceType} of the instruction is passed indirectly
     * as is the {@code PC} of the instruction in {@code ReferencePC}. If the output reference can be determined its type is returned indirectly in
     * {@code ReferenceType} along with {@code ReferenceName} if any, or that is set to {@code NULL}.</p>
     */
    @NativeType("char const *") long invoke(@NativeType("void *") long DisInfo, @NativeType("uint64_t") long ReferenceValue, @NativeType("uint64_t *") long ReferenceType, @NativeType("uint64_t") long ReferencePC, @NativeType("char const **") long ReferenceName);

}