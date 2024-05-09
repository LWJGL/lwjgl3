/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.glfw;

import javax.annotation.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;

/**
 * The function pointer type for memory reallocation callbacks.
 * 
 * <p>This is the function pointer type for memory reallocation callbacks. A memory reallocation callback function has the following signature:</p>
 * 
 * <pre><code>
 * void* function_name(void* block, size_t size, void* user)            </code></pre>
 * 
 * <p>This function must return a memory block at least {@code size} bytes long, or {@code NULL} if allocation failed. Note that not all parts of GLFW handle
 * allocation failures gracefully yet.</p>
 * 
 * <p>This function must support being called during {@link GLFW#glfwInit Init} but before the library is flagged as initialized, as well as during {@link GLFW#glfwTerminate Terminate} after the
 * library is no longer flagged as initialized.</p>
 * 
 * <p>Any memory allocated via this function will be deallocated via the same allocator during library termination or earlier.</p>
 * 
 * <p>Any memory allocated via this function must be suitably aligned for any object type. If you are using C99 or earlier, this alignment is
 * platform-dependent but will be the same as what {@code malloc} provides. If you are using C11 or later, this is the value of
 * {@code alignof(max_align_t)}.</p>
 * 
 * <p>The block address will never be {@code NULL} and the size will always be greater than zero. Reallocations of a block to size zero are converted into
 * deallocations before reaching the custom allocator. Reallocations of {@code NULL} to a non-zero size are converted into regular allocations before
 * reaching the custom allocator.</p>
 * 
 * <p>If this function returns {@code NULL}, GLFW will emit {@link GLFW#GLFW_OUT_OF_MEMORY OUT_OF_MEMORY}.</p>
 * 
 * <div style="margin-left: 26px; border-left: 1px solid gray; padding-left: 14px;"><h5>Note</h5>
 * 
 * <ul>
 * <li>The returned memory block must be valid at least until it is deallocated.</li>
 * <li>This function should not call any GLFW function.</li>
 * <li>This function must support being called from any thread that calls GLFW functions.</li>
 * </ul></div>
 * 
 * <h3>Type</h3>
 * 
 * <pre><code>
 * void * (*{@link #invoke}) (
 *     void *block,
 *     size_t size,
 *     void *user
 * )</code></pre>
 *
 * @since version 3.4
 */
public abstract class GLFWReallocateCallback extends Callback implements GLFWReallocateCallbackI {

    /**
     * Creates a {@code GLFWReallocateCallback} instance from the specified function pointer.
     *
     * @return the new {@code GLFWReallocateCallback}
     */
    public static GLFWReallocateCallback create(long functionPointer) {
        GLFWReallocateCallbackI instance = Callback.get(functionPointer);
        return instance instanceof GLFWReallocateCallback
            ? (GLFWReallocateCallback)instance
            : new Container(functionPointer, instance);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code functionPointer} is {@code NULL}. */
    @Nullable
    public static GLFWReallocateCallback createSafe(long functionPointer) {
        return functionPointer == NULL ? null : create(functionPointer);
    }

    /** Creates a {@code GLFWReallocateCallback} instance that delegates to the specified {@code GLFWReallocateCallbackI} instance. */
    public static GLFWReallocateCallback create(GLFWReallocateCallbackI instance) {
        return instance instanceof GLFWReallocateCallback
            ? (GLFWReallocateCallback)instance
            : new Container(instance.address(), instance);
    }

    protected GLFWReallocateCallback() {
        super(CIF);
    }

    GLFWReallocateCallback(long functionPointer) {
        super(functionPointer);
    }

    private static final class Container extends GLFWReallocateCallback {

        private final GLFWReallocateCallbackI delegate;

        Container(long functionPointer, GLFWReallocateCallbackI delegate) {
            super(functionPointer);
            this.delegate = delegate;
        }

        @Override
        public long invoke(long block, long size, long user) {
            return delegate.invoke(block, size, user);
        }

    }

}