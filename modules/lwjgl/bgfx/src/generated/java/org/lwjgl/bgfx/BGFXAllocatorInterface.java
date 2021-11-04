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
 * Custom allocator. When custom allocator is not specified, library uses default CRT allocator. The library assumes custom allocator is thread safe.
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct bgfx_allocator_interface_t {
 *     {@link BGFXAllocatorVtbl bgfx_allocator_vtbl_t} const * {@link #vtbl};
 * }</code></pre>
 */
@NativeType("struct bgfx_allocator_interface_t")
public class BGFXAllocatorInterface extends Struct implements NativeResource {

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
     * Creates a {@code BGFXAllocatorInterface} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public BGFXAllocatorInterface(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** the allocator virtual table */
    @NativeType("bgfx_allocator_vtbl_t const *")
    public BGFXAllocatorVtbl vtbl() { return nvtbl(address()); }

    /** Sets the address of the specified {@link BGFXAllocatorVtbl} to the {@link #vtbl} field. */
    public BGFXAllocatorInterface vtbl(@NativeType("bgfx_allocator_vtbl_t const *") BGFXAllocatorVtbl value) { nvtbl(address(), value); return this; }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public BGFXAllocatorInterface set(BGFXAllocatorInterface src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code BGFXAllocatorInterface} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static BGFXAllocatorInterface malloc() {
        return wrap(BGFXAllocatorInterface.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code BGFXAllocatorInterface} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static BGFXAllocatorInterface calloc() {
        return wrap(BGFXAllocatorInterface.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code BGFXAllocatorInterface} instance allocated with {@link BufferUtils}. */
    public static BGFXAllocatorInterface create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(BGFXAllocatorInterface.class, memAddress(container), container);
    }

    /** Returns a new {@code BGFXAllocatorInterface} instance for the specified memory address. */
    public static BGFXAllocatorInterface create(long address) {
        return wrap(BGFXAllocatorInterface.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static BGFXAllocatorInterface createSafe(long address) {
        return address == NULL ? null : wrap(BGFXAllocatorInterface.class, address);
    }

    // -----------------------------------

    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static BGFXAllocatorInterface mallocStack() { return malloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static BGFXAllocatorInterface callocStack() { return calloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static BGFXAllocatorInterface mallocStack(MemoryStack stack) { return malloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static BGFXAllocatorInterface callocStack(MemoryStack stack) { return calloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */

    /**
     * Returns a new {@code BGFXAllocatorInterface} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static BGFXAllocatorInterface malloc(MemoryStack stack) {
        return wrap(BGFXAllocatorInterface.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code BGFXAllocatorInterface} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static BGFXAllocatorInterface calloc(MemoryStack stack) {
        return wrap(BGFXAllocatorInterface.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    // -----------------------------------

    /** Unsafe version of {@link #vtbl}. */
    public static BGFXAllocatorVtbl nvtbl(long struct) { return BGFXAllocatorVtbl.create(memGetAddress(struct + BGFXAllocatorInterface.VTBL)); }

    /** Unsafe version of {@link #vtbl(BGFXAllocatorVtbl) vtbl}. */
    public static void nvtbl(long struct, BGFXAllocatorVtbl value) { memPutAddress(struct + BGFXAllocatorInterface.VTBL, value.address()); }

    /**
     * Validates pointer members that should not be {@code NULL}.
     *
     * @param struct the struct to validate
     */
    public static void validate(long struct) {
        long vtbl = memGetAddress(struct + BGFXAllocatorInterface.VTBL);
        check(vtbl);
        BGFXAllocatorVtbl.validate(vtbl);
    }

}