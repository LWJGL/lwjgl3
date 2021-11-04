/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.bgfx;

import javax.annotation.*;

import java.nio.*;

import org.lwjgl.*;
import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * Callback interface to implement application specific behavior.
 * 
 * <p>Cached items are currently used for OpenGL and Direct3D 12 binary shaders.</p>
 * 
 * <p>{@code fatal} and {@code trace_vargs} callbacks can be called from any thread. Other callbacks are called from the render thread.</p>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct bgfx_callback_interface_t {
 *     {@link BGFXCallbackVtbl bgfx_callback_vtbl_t} const * {@link #vtbl};
 * }</code></pre>
 */
@NativeType("struct bgfx_callback_interface_t")
public class BGFXCallbackInterface extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        VTBL;

    static {
        Layout layout = __struct(
            __member(POINTER_SIZE)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        VTBL = layout.offsetof(0);
    }

    /**
     * Creates a {@code BGFXCallbackInterface} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public BGFXCallbackInterface(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** the callback virtual table */
    @NativeType("bgfx_callback_vtbl_t const *")
    public BGFXCallbackVtbl vtbl() { return nvtbl(address()); }

    /** Sets the address of the specified {@link BGFXCallbackVtbl} to the {@link #vtbl} field. */
    public BGFXCallbackInterface vtbl(@NativeType("bgfx_callback_vtbl_t const *") BGFXCallbackVtbl value) { nvtbl(address(), value); return this; }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public BGFXCallbackInterface set(BGFXCallbackInterface src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code BGFXCallbackInterface} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static BGFXCallbackInterface malloc() {
        return wrap(BGFXCallbackInterface.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code BGFXCallbackInterface} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static BGFXCallbackInterface calloc() {
        return wrap(BGFXCallbackInterface.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code BGFXCallbackInterface} instance allocated with {@link BufferUtils}. */
    public static BGFXCallbackInterface create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(BGFXCallbackInterface.class, memAddress(container), container);
    }

    /** Returns a new {@code BGFXCallbackInterface} instance for the specified memory address. */
    public static BGFXCallbackInterface create(long address) {
        return wrap(BGFXCallbackInterface.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static BGFXCallbackInterface createSafe(long address) {
        return address == NULL ? null : wrap(BGFXCallbackInterface.class, address);
    }

    // -----------------------------------

    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static BGFXCallbackInterface mallocStack() { return malloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static BGFXCallbackInterface callocStack() { return calloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static BGFXCallbackInterface mallocStack(MemoryStack stack) { return malloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static BGFXCallbackInterface callocStack(MemoryStack stack) { return calloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */

    /**
     * Returns a new {@code BGFXCallbackInterface} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static BGFXCallbackInterface malloc(MemoryStack stack) {
        return wrap(BGFXCallbackInterface.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code BGFXCallbackInterface} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static BGFXCallbackInterface calloc(MemoryStack stack) {
        return wrap(BGFXCallbackInterface.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    // -----------------------------------

    /** Unsafe version of {@link #vtbl}. */
    public static BGFXCallbackVtbl nvtbl(long struct) { return BGFXCallbackVtbl.create(memGetAddress(struct + BGFXCallbackInterface.VTBL)); }

    /** Unsafe version of {@link #vtbl(BGFXCallbackVtbl) vtbl}. */
    public static void nvtbl(long struct, BGFXCallbackVtbl value) { memPutAddress(struct + BGFXCallbackInterface.VTBL, value.address()); }

    /**
     * Validates pointer members that should not be {@code NULL}.
     *
     * @param struct the struct to validate
     */
    public static void validate(long struct) {
        long vtbl = memGetAddress(struct + BGFXCallbackInterface.VTBL);
        check(vtbl);
        BGFXCallbackVtbl.validate(vtbl);
    }

}