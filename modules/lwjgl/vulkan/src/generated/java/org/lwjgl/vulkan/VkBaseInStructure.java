/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.vulkan;

import org.jspecify.annotations.*;

import java.nio.*;

import org.lwjgl.*;
import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * <pre><code>
 * struct VkBaseInStructure {
 *     VkStructureType sType;
 *     {@link VkBaseInStructure VkBaseInStructure} const * pNext;
 * }</code></pre>
 */
public class VkBaseInStructure extends Struct<VkBaseInStructure> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
    }

    protected VkBaseInStructure(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkBaseInStructure create(long address, @Nullable ByteBuffer container) {
        return new VkBaseInStructure(address, container);
    }

    /**
     * Creates a {@code VkBaseInStructure} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkBaseInStructure(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return the value of the {@code sType} field. */
    @NativeType("VkStructureType")
    public int sType() { return nsType(address()); }
    /** @return a {@link VkBaseInStructure} view of the struct pointed to by the {@code pNext} field. */
    @NativeType("VkBaseInStructure const *")
    public @Nullable VkBaseInStructure pNext() { return npNext(address()); }

    /** Sets the specified value to the {@code sType} field. */
    public VkBaseInStructure sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the address of the specified {@link VkBaseInStructure} to the {@code pNext} field. */
    public VkBaseInStructure pNext(@Nullable @NativeType("VkBaseInStructure const *") VkBaseInStructure value) { npNext(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkBaseInStructure set(
        int sType,
        @Nullable VkBaseInStructure pNext
    ) {
        sType(sType);
        pNext(pNext);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkBaseInStructure set(VkBaseInStructure src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkBaseInStructure} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkBaseInStructure malloc() {
        return new VkBaseInStructure(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkBaseInStructure} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkBaseInStructure calloc() {
        return new VkBaseInStructure(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkBaseInStructure} instance allocated with {@link BufferUtils}. */
    public static VkBaseInStructure create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkBaseInStructure(memAddress(container), container);
    }

    /** Returns a new {@code VkBaseInStructure} instance for the specified memory address. */
    public static VkBaseInStructure create(long address) {
        return new VkBaseInStructure(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable VkBaseInStructure createSafe(long address) {
        return address == NULL ? null : new VkBaseInStructure(address, null);
    }

    /**
     * Returns a new {@link VkBaseInStructure.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkBaseInStructure.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkBaseInStructure.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkBaseInStructure.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkBaseInStructure.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkBaseInStructure.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkBaseInStructure.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkBaseInStructure.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static VkBaseInStructure.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    // -----------------------------------

    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static VkBaseInStructure mallocStack() { return malloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static VkBaseInStructure callocStack() { return calloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static VkBaseInStructure mallocStack(MemoryStack stack) { return malloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static VkBaseInStructure callocStack(MemoryStack stack) { return calloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static VkBaseInStructure.Buffer mallocStack(int capacity) { return malloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static VkBaseInStructure.Buffer callocStack(int capacity) { return calloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static VkBaseInStructure.Buffer mallocStack(int capacity, MemoryStack stack) { return malloc(capacity, stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static VkBaseInStructure.Buffer callocStack(int capacity, MemoryStack stack) { return calloc(capacity, stack); }

    /**
     * Returns a new {@code VkBaseInStructure} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkBaseInStructure malloc(MemoryStack stack) {
        return new VkBaseInStructure(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkBaseInStructure} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkBaseInStructure calloc(MemoryStack stack) {
        return new VkBaseInStructure(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkBaseInStructure.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkBaseInStructure.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkBaseInStructure.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkBaseInStructure.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return memGetInt(struct + VkBaseInStructure.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static @Nullable VkBaseInStructure npNext(long struct) { return VkBaseInStructure.createSafe(memGetAddress(struct + VkBaseInStructure.PNEXT)); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { memPutInt(struct + VkBaseInStructure.STYPE, value); }
    /** Unsafe version of {@link #pNext(VkBaseInStructure) pNext}. */
    public static void npNext(long struct, @Nullable VkBaseInStructure value) { memPutAddress(struct + VkBaseInStructure.PNEXT, memAddressSafe(value)); }

    // -----------------------------------

    /** An array of {@link VkBaseInStructure} structs. */
    public static class Buffer extends StructBuffer<VkBaseInStructure, Buffer> implements NativeResource {

        private static final VkBaseInStructure ELEMENT_FACTORY = VkBaseInStructure.create(-1L);

        /**
         * Creates a new {@code VkBaseInStructure.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkBaseInStructure#SIZEOF}, and its mark will be undefined.</p>
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
        protected Buffer create(long address, @Nullable ByteBuffer container, int mark, int position, int limit, int capacity) {
            return new Buffer(address, container, mark, position, limit, capacity);
        }

        @Override
        protected VkBaseInStructure getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkBaseInStructure.nsType(address()); }
        /** @return a {@link VkBaseInStructure} view of the struct pointed to by the {@code pNext} field. */
        @NativeType("VkBaseInStructure const *")
        public @Nullable VkBaseInStructure pNext() { return VkBaseInStructure.npNext(address()); }

        /** Sets the specified value to the {@code sType} field. */
        public VkBaseInStructure.Buffer sType(@NativeType("VkStructureType") int value) { VkBaseInStructure.nsType(address(), value); return this; }
        /** Sets the address of the specified {@link VkBaseInStructure} to the {@code pNext} field. */
        public VkBaseInStructure.Buffer pNext(@Nullable @NativeType("VkBaseInStructure const *") VkBaseInStructure value) { VkBaseInStructure.npNext(address(), value); return this; }

    }

}