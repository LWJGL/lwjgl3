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
public abstract class GLFWDeallocateCallback extends Callback implements GLFWDeallocateCallbackI {

    /**
     * Creates a {@code GLFWDeallocateCallback} instance from the specified function pointer.
     *
     * @return the new {@code GLFWDeallocateCallback}
     */
    public static GLFWDeallocateCallback create(long functionPointer) {
        GLFWDeallocateCallbackI instance = Callback.get(functionPointer);
        return instance instanceof GLFWDeallocateCallback
            ? (GLFWDeallocateCallback)instance
            : new Container(functionPointer, instance);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code functionPointer} is {@code NULL}. */
    @Nullable
    public static GLFWDeallocateCallback createSafe(long functionPointer) {
        return functionPointer == NULL ? null : create(functionPointer);
    }

    /** Creates a {@code GLFWDeallocateCallback} instance that delegates to the specified {@code GLFWDeallocateCallbackI} instance. */
    public static GLFWDeallocateCallback create(GLFWDeallocateCallbackI instance) {
        return instance instanceof GLFWDeallocateCallback
            ? (GLFWDeallocateCallback)instance
            : new Container(instance.address(), instance);
    }

    protected GLFWDeallocateCallback() {
        super(CIF);
    }

    GLFWDeallocateCallback(long functionPointer) {
        super(functionPointer);
    }

    private static final class Container extends GLFWDeallocateCallback {

        private final GLFWDeallocateCallbackI delegate;

        Container(long functionPointer, GLFWDeallocateCallbackI delegate) {
            super(functionPointer);
            this.delegate = delegate;
        }

        @Override
        public void invoke(long block, long user) {
            delegate.invoke(block, user);
        }

    }

}