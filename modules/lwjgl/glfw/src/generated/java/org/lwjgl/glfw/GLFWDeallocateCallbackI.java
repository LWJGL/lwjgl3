/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.glfw;

import org.lwjgl.system.*;
import org.lwjgl.system.libffi.*;

import static org.lwjgl.system.APIUtil.*;
import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.libffi.LibFFI.*;

/**
 * The function pointer type for memory deallocation callbacks.
 * 
 * <p>This is the function pointer type for memory deallocation callbacks. A memory deallocation callback function has the following signature:</p>
 * 
 * <pre><code>
 * void function_name(void* block, void* user)</code></pre>
 * 
 * <p>This function may deallocate the specified memory block. This memory block will have been allocated with the same allocator.</p>
 * 
 * <p>This function may be called during {@link GLFW#glfwInit Init} but before the library is flagged as initialized, as well as during {@link GLFW#glfwTerminate Terminate} after the library is no
 * longer flagged as initialized.</p>
 * 
 * <p>The block address will never be {@code NULL}. Deallocations of {@code NULL} are filtered out before reaching the custom allocator.</p>
 * 
 * <div style="margin-left: 26px; border-left: 1px solid gray; padding-left: 14px;"><h5>Note</h5>
 * 
 * <ul>
 * <li>The specified memory block will not be accessed by GLFW after this function is called.</li>
 * <li>This function should not call any GLFW function.</li>
 * <li>This function may be called from any thread that calls GLFW functions.</li>
 * </ul></div>
 * 
 * <h3>Type</h3>
 * 
 * <pre><code>
 * void (*{@link #invoke}) (
 *     void *block,
 *     void *user
 * )</code></pre>
 *
 * @since version 3.4
 */
@FunctionalInterface
@NativeType("GLFWdeallocatefun")
public interface GLFWDeallocateCallbackI extends CallbackI {

    FFICIF CIF = apiCreateCIF(
        FFI_DEFAULT_ABI,
        ffi_type_void,
        ffi_type_pointer, ffi_type_pointer
    );

    @Override
    default FFICIF getCallInterface() { return CIF; }

    @Override
    default void callback(long ret, long args) {
        invoke(
            memGetAddress(memGetAddress(args)),
            memGetAddress(memGetAddress(args + POINTER_SIZE))
        );
    }

    /**
     * Will be called for memory deallocation requests.
     *
     * @param block the address of the memory block to deallocate
     * @param user  the user-defined pointer from the allocator
     */
    void invoke(@NativeType("void *") long block, @NativeType("void *") long user);

}