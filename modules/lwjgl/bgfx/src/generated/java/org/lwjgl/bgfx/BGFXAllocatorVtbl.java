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
 * Allocator virtual table
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct bgfx_allocator_vtbl_t {
 *     void * (*{@link BGFXReallocCallbackI realloc}) (bgfx_allocator_interface_t *_this, void *_ptr, size_t _size, size_t _align, char *_file, uint32_t _line);
 * }</code></pre>
 */
@NativeType("struct bgfx_allocator_vtbl_t")
public class BGFXAllocatorVtbl extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        REALLOC;

    static {
        Layout layout = __struct(
            __member(POINTER_SIZE)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        REALLOC = layout.offsetof(0);
    }

    /**
     * Creates a {@code BGFXAllocatorVtbl} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public BGFXAllocatorVtbl(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** the reallocation callback */
    @NativeType("void * (*) (bgfx_allocator_interface_t *, void *, size_t, size_t, char *, uint32_t)")
    public BGFXReallocCallback realloc() { return nrealloc(address()); }

    /** Sets the specified value to the {@link #realloc} field. */
    public BGFXAllocatorVtbl realloc(@NativeType("void * (*) (bgfx_allocator_interface_t *, void *, size_t, size_t, char *, uint32_t)") BGFXReallocCallbackI value) { nrealloc(address(), value); return this; }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public BGFXAllocatorVtbl set(BGFXAllocatorVtbl src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code BGFXAllocatorVtbl} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static BGFXAllocatorVtbl malloc() {
        return wrap(BGFXAllocatorVtbl.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code BGFXAllocatorVtbl} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static BGFXAllocatorVtbl calloc() {
        return wrap(BGFXAllocatorVtbl.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code BGFXAllocatorVtbl} instance allocated with {@link BufferUtils}. */
    public static BGFXAllocatorVtbl create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(BGFXAllocatorVtbl.class, memAddress(container), container);
    }

    /** Returns a new {@code BGFXAllocatorVtbl} instance for the specified memory address. */
    public static BGFXAllocatorVtbl create(long address) {
        return wrap(BGFXAllocatorVtbl.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static BGFXAllocatorVtbl createSafe(long address) {
        return address == NULL ? null : wrap(BGFXAllocatorVtbl.class, address);
    }

    /**
     * Returns a new {@link BGFXAllocatorVtbl.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static BGFXAllocatorVtbl.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link BGFXAllocatorVtbl.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static BGFXAllocatorVtbl.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link BGFXAllocatorVtbl.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static BGFXAllocatorVtbl.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link BGFXAllocatorVtbl.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static BGFXAllocatorVtbl.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static BGFXAllocatorVtbl.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    // -----------------------------------

    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static BGFXAllocatorVtbl mallocStack() { return malloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static BGFXAllocatorVtbl callocStack() { return calloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static BGFXAllocatorVtbl mallocStack(MemoryStack stack) { return malloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static BGFXAllocatorVtbl callocStack(MemoryStack stack) { return calloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static BGFXAllocatorVtbl.Buffer mallocStack(int capacity) { return malloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static BGFXAllocatorVtbl.Buffer callocStack(int capacity) { return calloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static BGFXAllocatorVtbl.Buffer mallocStack(int capacity, MemoryStack stack) { return malloc(capacity, stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static BGFXAllocatorVtbl.Buffer callocStack(int capacity, MemoryStack stack) { return calloc(capacity, stack); }

    /**
     * Returns a new {@code BGFXAllocatorVtbl} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static BGFXAllocatorVtbl malloc(MemoryStack stack) {
        return wrap(BGFXAllocatorVtbl.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code BGFXAllocatorVtbl} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static BGFXAllocatorVtbl calloc(MemoryStack stack) {
        return wrap(BGFXAllocatorVtbl.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link BGFXAllocatorVtbl.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static BGFXAllocatorVtbl.Buffer malloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link BGFXAllocatorVtbl.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static BGFXAllocatorVtbl.Buffer calloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #realloc}. */
    public static BGFXReallocCallback nrealloc(long struct) { return BGFXReallocCallback.create(memGetAddress(struct + BGFXAllocatorVtbl.REALLOC)); }

    /** Unsafe version of {@link #realloc(BGFXReallocCallbackI) realloc}. */
    public static void nrealloc(long struct, BGFXReallocCallbackI value) { memPutAddress(struct + BGFXAllocatorVtbl.REALLOC, value.address()); }

    /**
     * Validates pointer members that should not be {@code NULL}.
     *
     * @param struct the struct to validate
     */
    public static void validate(long struct) {
        check(memGetAddress(struct + BGFXAllocatorVtbl.REALLOC));
    }

    // -----------------------------------

    /** An array of {@link BGFXAllocatorVtbl} structs. */
    public static class Buffer extends StructBuffer<BGFXAllocatorVtbl, Buffer> implements NativeResource {

        private static final BGFXAllocatorVtbl ELEMENT_FACTORY = BGFXAllocatorVtbl.create(-1L);

        /**
         * Creates a new {@code BGFXAllocatorVtbl.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link BGFXAllocatorVtbl#SIZEOF}, and its mark will be undefined.
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
        protected BGFXAllocatorVtbl getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link BGFXAllocatorVtbl#realloc} field. */
        @NativeType("void * (*) (bgfx_allocator_interface_t *, void *, size_t, size_t, char *, uint32_t)")
        public BGFXReallocCallback realloc() { return BGFXAllocatorVtbl.nrealloc(address()); }

        /** Sets the specified value to the {@link BGFXAllocatorVtbl#realloc} field. */
        public BGFXAllocatorVtbl.Buffer realloc(@NativeType("void * (*) (bgfx_allocator_interface_t *, void *, size_t, size_t, char *, uint32_t)") BGFXReallocCallbackI value) { BGFXAllocatorVtbl.nrealloc(address(), value); return this; }

    }

}