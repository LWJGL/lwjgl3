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
public abstract class GLFWAllocateCallback extends Callback implements GLFWAllocateCallbackI {

    /**
     * Creates a {@code GLFWAllocateCallback} instance from the specified function pointer.
     *
     * @return the new {@code GLFWAllocateCallback}
     */
    public static GLFWAllocateCallback create(long functionPointer) {
        GLFWAllocateCallbackI instance = Callback.get(functionPointer);
        return instance instanceof GLFWAllocateCallback
            ? (GLFWAllocateCallback)instance
            : new Container(functionPointer, instance);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code functionPointer} is {@code NULL}. */
    @Nullable
    public static GLFWAllocateCallback createSafe(long functionPointer) {
        return functionPointer == NULL ? null : create(functionPointer);
    }

    /** Creates a {@code GLFWAllocateCallback} instance that delegates to the specified {@code GLFWAllocateCallbackI} instance. */
    public static GLFWAllocateCallback create(GLFWAllocateCallbackI instance) {
        return instance instanceof GLFWAllocateCallback
            ? (GLFWAllocateCallback)instance
            : new Container(instance.address(), instance);
    }

    protected GLFWAllocateCallback() {
        super(CIF);
    }

    GLFWAllocateCallback(long functionPointer) {
        super(functionPointer);
    }

    private static final class Container extends GLFWAllocateCallback {

        private final GLFWAllocateCallbackI delegate;

        Container(long functionPointer, GLFWAllocateCallbackI delegate) {
            super(functionPointer);
            this.delegate = delegate;
        }

        @Override
        public long invoke(long size, long user) {
            return delegate.invoke(size, user);
        }

    }

}