/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.util.vma;

import org.lwjgl.system.*;
import org.lwjgl.system.libffi.*;

import static org.lwjgl.system.APIUtil.*;
import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.libffi.LibFFI.*;

/**
 * Instances of this interface may be set to the {@link VmaDefragmentationInfo} struct.
 * 
 * <h3>Type</h3>
 * 
 * <pre><code>
 * VkBool32 (*{@link #invoke}) (
 *     void *pUserData
 * )</code></pre>
 */
@FunctionalInterface
@NativeType("PFN_vmaCheckDefragmentationBreakFunction")
public interface VmaCheckDefragmentationBreakFunctionI extends CallbackI {

    FFICIF CIF = apiCreateCIF(
        FFI_DEFAULT_ABI,
        ffi_type_uint32,
        ffi_type_pointer
    );

    @Override
    default FFICIF getCallInterface() { return CIF; }

    @Override
    default void callback(long ret, long args) {
        int __result = invoke(
            memGetAddress(memGetAddress(args))
        );
        apiClosureRet(ret, __result);
    }

    /**
     * Callback function called during {@link Vma#vmaBeginDefragmentation BeginDefragmentation} to check custom criterion about ending current defragmentation pass.
     * 
     * <p>Should return true if the defragmentation needs to stop current pass.</p>
     */
    @NativeType("VkBool32") int invoke(@NativeType("void *") long pUserData);

}