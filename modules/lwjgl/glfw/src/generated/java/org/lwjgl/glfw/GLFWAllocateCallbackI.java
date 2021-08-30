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
 * The function pointer type for memory allocation callbacks.
 * 
 * <p>This is the function pointer type for memory allocation callbacks. A memory allocation callback function has the following signature:</p>
 * 
 * <pre><code>
 * void* function_name(size_t size, void* user)</code></pre>
 * 
 * <p>This function must return either a memory block at least {@code size} bytes long, or {@code NULL} if allocation failed. Note that not all parts of GLFW
 * handle allocation failures gracefully yet.</p>
 * 
 * <p>This function may be called during {@link GLFW#glfwInit Init} but before the library is flagged as initialized, as well as during {@link GLFW#glfwTerminate Terminate} after the library is no
 * longer flagged as initialized.</p>
 * 
 * <p>Any memory allocated by this function will be deallocated during library termination or earlier.</p>
 * 
 * <p>The size will always be greater than zero. Allocations of size zero are filtered out before reaching the custom allocator.</p>
 * 
 * <div style="margin-left: 26px; border-left: 1px solid gray; padding-left: 14px;"><h5>Note</h5>
 * 
 * <ul>
 * <li>The returned memory block must be valid at least until it is deallocated.</li>
 * <li>This function should not call any GLFW function.</li>
 * <li>This function may be called from any thread that calls GLFW functions.</li>
 * </ul></div>
 * 
 * <h3>Type</h3>
 * 
 * <pre><code>
 * void * (*{@link #invoke}) (
 *     size_t size,
 *     void *user
 * )</code></pre>
 *
 * @since version 3.4
 */
@FunctionalInterface
@NativeType("GLFWallocatefun")
public interface GLFWAllocateCallbackI extends CallbackI {

    FFICIF CIF = apiCreateCIF(
        FFI_DEFAULT_ABI,
        ffi_type_pointer,
        ffi_type_pointer, ffi_type_pointer
    );

    @Override
    default FFICIF getCallInterface() { return CIF; }

    @Override
    default void callback(long ret, long args) {
        long __result = invoke(
            memGetAddress(memGetAddress(args)),
            memGetAddress(memGetAddress(args + POINTER_SIZE))
        );
        apiClosureRetP(ret, __result);
    }

    /**
     * Will be called for memory allocation requests.
     *
     * @param size the minimum size, in bytes, of the memory block
     * @param user the user-defined pointer from the allocator
     *
     * @return the address of the newly allocated memory block, or {@code NULL} if an error occurred
     */
    @NativeType("void *") long invoke(@NativeType("size_t") long size, @NativeType("void *") long user);

}