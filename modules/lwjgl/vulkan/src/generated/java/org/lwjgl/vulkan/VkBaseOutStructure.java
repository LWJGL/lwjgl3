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
 * struct VkBaseOutStructure {
 *     VkStructureType sType;
 *     {@link VkBaseOutStructure VkBaseOutStructure} * pNext;
 * }</code></pre>
 */
public class VkBaseOutStructure extends Struct<VkBaseOutStructure> implements NativeResource {

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

    protected VkBaseOutStructure(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkBaseOutStructure create(long address, @Nullable ByteBuffer container) {
        return new VkBaseOutStructure(address, container);
    }

    /**
     * Creates a {@code VkBaseOutStructure} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkBaseOutStructure(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return the value of the {@code sType} field. */
    @NativeType("VkStructureType")
    public int sType() { return nsType(address()); }
    /** @return a {@link VkBaseOutStructure} view of the struct pointed to by the {@code pNext} field. */
    @NativeType("VkBaseOutStructure *")
    public @Nullable VkBaseOutStructure pNext() { return npNext(address()); }

    /** Sets the specified value to the {@code sType} field. */
    public VkBaseOutStructure sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the address of the specified {@link VkBaseOutStructure} to the {@code pNext} field. */
    public VkBaseOutStructure pNext(@Nullable @NativeType("VkBaseOutStructure *") VkBaseOutStructure value) { npNext(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkBaseOutStructure set(
        int sType,
        @Nullable VkBaseOutStructure pNext
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
    public VkBaseOutStructure set(VkBaseOutStructure src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkBaseOutStructure} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkBaseOutStructure malloc() {
        return new VkBaseOutStructure(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkBaseOutStructure} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkBaseOutStructure calloc() {
        return new VkBaseOutStructure(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkBaseOutStructure} instance allocated with {@link BufferUtils}. */
    public static VkBaseOutStructure create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkBaseOutStructure(memAddress(container), container);
    }

    /** Returns a new {@code VkBaseOutStructure} instance for the specified memory address. */
    public static VkBaseOutStructure create(long address) {
        return new VkBaseOutStructure(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable VkBaseOutStructure createSafe(long address) {
        return address == NULL ? null : new VkBaseOutStructure(address, null);
    }

    /**
     * Returns a new {@link VkBaseOutStructure.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkBaseOutStructure.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkBaseOutStructure.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkBaseOutStructure.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkBaseOutStructure.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkBaseOutStructure.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkBaseOutStructure.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkBaseOutStructure.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static VkBaseOutStructure.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    // -----------------------------------

    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static VkBaseOutStructure mallocStack() { return malloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static VkBaseOutStructure callocStack() { return calloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static VkBaseOutStructure mallocStack(MemoryStack stack) { return malloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static VkBaseOutStructure callocStack(MemoryStack stack) { return calloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static VkBaseOutStructure.Buffer mallocStack(int capacity) { return malloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static VkBaseOutStructure.Buffer callocStack(int capacity) { return calloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static VkBaseOutStructure.Buffer mallocStack(int capacity, MemoryStack stack) { return malloc(capacity, stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static VkBaseOutStructure.Buffer callocStack(int capacity, MemoryStack stack) { return calloc(capacity, stack); }

    /**
     * Returns a new {@code VkBaseOutStructure} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkBaseOutStructure malloc(MemoryStack stack) {
        return new VkBaseOutStructure(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkBaseOutStructure} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkBaseOutStructure calloc(MemoryStack stack) {
        return new VkBaseOutStructure(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkBaseOutStructure.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkBaseOutStructure.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkBaseOutStructure.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkBaseOutStructure.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return memGetInt(struct + VkBaseOutStructure.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static @Nullable VkBaseOutStructure npNext(long struct) { return VkBaseOutStructure.createSafe(memGetAddress(struct + VkBaseOutStructure.PNEXT)); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { memPutInt(struct + VkBaseOutStructure.STYPE, value); }
    /** Unsafe version of {@link #pNext(VkBaseOutStructure) pNext}. */
    public static void npNext(long struct, @Nullable VkBaseOutStructure value) { memPutAddress(struct + VkBaseOutStructure.PNEXT, memAddressSafe(value)); }

    // -----------------------------------

    /** An array of {@link VkBaseOutStructure} structs. */
    public static class Buffer extends StructBuffer<VkBaseOutStructure, Buffer> implements NativeResource {

        private static final VkBaseOutStructure ELEMENT_FACTORY = VkBaseOutStructure.create(-1L);

        /**
         * Creates a new {@code VkBaseOutStructure.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkBaseOutStructure#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkBaseOutStructure getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkBaseOutStructure.nsType(address()); }
        /** @return a {@link VkBaseOutStructure} view of the struct pointed to by the {@code pNext} field. */
        @NativeType("VkBaseOutStructure *")
        public @Nullable VkBaseOutStructure pNext() { return VkBaseOutStructure.npNext(address()); }

        /** Sets the specified value to the {@code sType} field. */
        public VkBaseOutStructure.Buffer sType(@NativeType("VkStructureType") int value) { VkBaseOutStructure.nsType(address(), value); return this; }
        /** Sets the address of the specified {@link VkBaseOutStructure} to the {@code pNext} field. */
        public VkBaseOutStructure.Buffer pNext(@Nullable @NativeType("VkBaseOutStructure *") VkBaseOutStructure value) { VkBaseOutStructure.npNext(address(), value); return this; }

    }

}