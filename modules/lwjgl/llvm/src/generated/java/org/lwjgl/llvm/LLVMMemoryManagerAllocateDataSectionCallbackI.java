/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.llvm;

import org.lwjgl.system.*;

import static org.lwjgl.system.dyncall.DynCallback.*;

/**
 * Instances of this interface may be passed to the {@link LLVMExecutionEngine#LLVMCreateSimpleMCJITMemoryManager CreateSimpleMCJITMemoryManager} method.
 * 
 * <h3>Type</h3>
 * 
 * <pre><code>
 * uint8_t * (*) (
 *     void *Opaque,
 *     uintptr_t Size,
 *     unsigned int Alignment,
 *     unsigned int SectionID,
 *     char const *SectionName,
 *     LLVMBool IsReadOnly
 * )</code></pre>
 */
@FunctionalInterface
@NativeType("uint8_t * (*) (void *, uintptr_t, unsigned int, unsigned int, char const *, LLVMBool)")
public interface LLVMMemoryManagerAllocateDataSectionCallbackI extends CallbackI.P {

    String SIGNATURE = "(ppiipi)p";

    @Override
    default String getSignature() { return SIGNATURE; }

    @Override
    default long callback(long args) {
        return invoke(
            dcbArgPointer(args),
            dcbArgPointer(args),
            dcbArgInt(args),
            dcbArgInt(args),
            dcbArgPointer(args),
            dcbArgInt(args) != 0
        );
    }

    @NativeType("uint8_t *") long invoke(@NativeType("void *") long Opaque, @NativeType("uintptr_t") long Size, @NativeType("unsigned int") int Alignment, @NativeType("unsigned int") int SectionID, @NativeType("char const *") long SectionName, @NativeType("LLVMBool") boolean IsReadOnly);

}