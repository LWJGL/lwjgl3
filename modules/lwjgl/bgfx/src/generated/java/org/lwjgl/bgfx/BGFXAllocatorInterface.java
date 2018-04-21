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
 * <h3>Member documentation</h3>
 * 
 * <ul>
 * <li>{@code vtbl} &ndash; the allocator virtual table</li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <code><pre>
 * struct bgfx_allocator_interface_t {
 *     {@link BGFXAllocatorVtbl bgfx_allocator_vtbl_t const} * vtbl;
 * }</pre></code>
 */
@NativeType("struct bgfx_allocator_interface_t")
public class BGFXAllocatorInterface extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

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

    BGFXAllocatorInterface(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    /**
     * Creates a {@link BGFXAllocatorInterface} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public BGFXAllocatorInterface(ByteBuffer container) {
        this(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** Returns a {@link BGFXAllocatorVtbl} view of the struct pointed to by the {@code vtbl} field. */
    @NativeType("bgfx_allocator_vtbl_t const *")
    public BGFXAllocatorVtbl vtbl() { return nvtbl(address()); }

    /** Sets the address of the specified {@link BGFXAllocatorVtbl} to the {@code vtbl} field. */
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

    /** Returns a new {@link BGFXAllocatorInterface} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static BGFXAllocatorInterface malloc() {
        return create(nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@link BGFXAllocatorInterface} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static BGFXAllocatorInterface calloc() {
        return create(nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@link BGFXAllocatorInterface} instance allocated with {@link BufferUtils}. */
    public static BGFXAllocatorInterface create() {
        return new BGFXAllocatorInterface(BufferUtils.createByteBuffer(SIZEOF));
    }

    /** Returns a new {@link BGFXAllocatorInterface} instance for the specified memory address. */
    public static BGFXAllocatorInterface create(long address) {
        return new BGFXAllocatorInterface(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static BGFXAllocatorInterface createSafe(long address) {
        return address == NULL ? null : create(address);
    }

    /**
     * Returns a new {@link BGFXAllocatorInterface.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static BGFXAllocatorInterface.Buffer malloc(int capacity) {
        return create(__malloc(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link BGFXAllocatorInterface.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static BGFXAllocatorInterface.Buffer calloc(int capacity) {
        return create(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link BGFXAllocatorInterface.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static BGFXAllocatorInterface.Buffer create(int capacity) {
        return new Buffer(__create(capacity, SIZEOF));
    }

    /**
     * Create a {@link BGFXAllocatorInterface.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static BGFXAllocatorInterface.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static BGFXAllocatorInterface.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : create(address, capacity);
    }

    // -----------------------------------

    /** Returns a new {@link BGFXAllocatorInterface} instance allocated on the thread-local {@link MemoryStack}. */
    public static BGFXAllocatorInterface mallocStack() {
        return mallocStack(stackGet());
    }

    /** Returns a new {@link BGFXAllocatorInterface} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero. */
    public static BGFXAllocatorInterface callocStack() {
        return callocStack(stackGet());
    }

    /**
     * Returns a new {@link BGFXAllocatorInterface} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static BGFXAllocatorInterface mallocStack(MemoryStack stack) {
        return create(stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@link BGFXAllocatorInterface} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static BGFXAllocatorInterface callocStack(MemoryStack stack) {
        return create(stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link BGFXAllocatorInterface.Buffer} instance allocated on the thread-local {@link MemoryStack}.
     *
     * @param capacity the buffer capacity
     */
    public static BGFXAllocatorInterface.Buffer mallocStack(int capacity) {
        return mallocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link BGFXAllocatorInterface.Buffer} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param capacity the buffer capacity
     */
    public static BGFXAllocatorInterface.Buffer callocStack(int capacity) {
        return callocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link BGFXAllocatorInterface.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static BGFXAllocatorInterface.Buffer mallocStack(int capacity, MemoryStack stack) {
        return create(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link BGFXAllocatorInterface.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static BGFXAllocatorInterface.Buffer callocStack(int capacity, MemoryStack stack) {
        return create(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
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

    /**
     * Calls {@link #validate(long)} for each struct contained in the specified struct array.
     *
     * @param array the struct array to validate
     * @param count the number of structs in {@code array}
     */
    public static void validate(long array, int count) {
        for (int i = 0; i < count; i++) {
            validate(array + i * SIZEOF);
        }
    }

    // -----------------------------------

    /** An array of {@link BGFXAllocatorInterface} structs. */
    public static class Buffer extends StructBuffer<BGFXAllocatorInterface, Buffer> implements NativeResource {

        /**
         * Creates a new {@link BGFXAllocatorInterface.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link BGFXAllocatorInterface#SIZEOF}, and its mark will be undefined.
         *
         * <p>The created buffer instance holds a strong reference to the container object.</p>
         */
        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / SIZEOF);
        }

        public Buffer(long address, int cap) {
            super(address, null, -1, 0, cap, cap);
        }

        Buffer(long address, @Nullable ByteBuffer container, int mark, int pos, int lim, int cap) {
            super(address, container, mark, pos, lim, cap);
        }

        @Override
        protected Buffer self() {
            return this;
        }

        @Override
        protected Buffer newBufferInstance(long address, @Nullable ByteBuffer container, int mark, int pos, int lim, int cap) {
            return new Buffer(address, container, mark, pos, lim, cap);
        }

        @Override
        protected BGFXAllocatorInterface newInstance(long address) {
            return new BGFXAllocatorInterface(address, container);
        }

        @Override
        public int sizeof() {
            return SIZEOF;
        }

        /** Returns a {@link BGFXAllocatorVtbl} view of the struct pointed to by the {@code vtbl} field. */
        @NativeType("bgfx_allocator_vtbl_t const *")
        public BGFXAllocatorVtbl vtbl() { return BGFXAllocatorInterface.nvtbl(address()); }

        /** Sets the address of the specified {@link BGFXAllocatorVtbl} to the {@code vtbl} field. */
        public BGFXAllocatorInterface.Buffer vtbl(@NativeType("bgfx_allocator_vtbl_t const *") BGFXAllocatorVtbl value) { BGFXAllocatorInterface.nvtbl(address(), value); return this; }

    }

}