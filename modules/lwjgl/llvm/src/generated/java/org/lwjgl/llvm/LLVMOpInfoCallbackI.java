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
 * int (*) (
 *     void *DisInfo,
 *     uint64_t PC,
 *     uint64_t Offset,
 *     uint64_t Size,
 *     int TagType,
 *     void *TagBuf
 * )</code></pre>
 */
@FunctionalInterface
@NativeType("int (*) (void *, uint64_t, uint64_t, uint64_t, int, void *)")
public interface LLVMOpInfoCallbackI extends CallbackI.I {

    String SIGNATURE = "(plllip)i";

    @Override
    default String getSignature() { return SIGNATURE; }

    @Override
    default int callback(long args) {
        return invoke(
            dcbArgPointer(args),
            dcbArgLongLong(args),
            dcbArgLongLong(args),
            dcbArgLongLong(args),
            dcbArgInt(args),
            dcbArgPointer(args)
        );
    }

    /**
     * The type for the operand information call back function.
     * 
     * <p>This is called to get the symbolic information for an operand of an instruction. Typically this is from the relocation information, symbol table, etc.
     * That block of information is saved when the disassembler context is created and passed to the call back in the {@code DisInfo} parameter. The
     * instruction containing operand is at the {@code PC} parameter. For some instruction sets, there can be more than one operand with symbolic information.
     * To determine the symbolic operand information for each operand, the bytes for the specific operand in the instruction are specified by the
     * {@code Offset} parameter and its byte width is the size parameter. For instructions sets with fixed widths and one symbolic operand per instruction,
     * the {@code Offset} parameter will be zero and {@code Size} parameter will be the instruction width. The information is returned in {@code TagBuf} and
     * is {@code Triple} specific with its specific information defined by the value of {@code TagType} for that {@code Triple}. If symbolic information is
     * returned the function returns 1, otherwise it returns 0.</p>
     */
    int invoke(@NativeType("void *") long DisInfo, @NativeType("uint64_t") long PC, @NativeType("uint64_t") long Offset, @NativeType("uint64_t") long Size, int TagType, @NativeType("void *") long TagBuf);

}