/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.vulkan;

import javax.annotation.*;

import java.nio.*;

import org.lwjgl.*;
import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * Base structure for a read-only pointer chain.
 * 
 * <h5>Description</h5>
 * 
 * <p>{@link VkBaseOutStructure} can be used to facilitate iterating through a structure pointer chain that returns data back to the application.</p>
 * 
 * <h5>See Also</h5>
 * 
 * <p>{@link VkBaseOutStructure}</p>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkBaseOutStructure {
 *     VkStructureType {@link #sType};
 *     {@link VkBaseOutStructure VkBaseOutStructure} * {@link #pNext};
 * }</code></pre>
 */
public class VkBaseOutStructure extends Struct implements NativeResource {

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

    /** the structure type of the structure being iterated through. */
    @NativeType("VkStructureType")
    public int sType() { return nsType(address()); }
    /** {@code NULL} or a pointer to the next structure in a structure chain. */
    @Nullable
    @NativeType("VkBaseOutStructure *")
    public VkBaseOutStructure pNext() { return npNext(address()); }

    /** Sets the specified value to the {@link #sType} field. */
    public VkBaseOutStructure sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the address of the specified {@link VkBaseOutStructure} to the {@link #pNext} field. */
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
        return wrap(VkBaseOutStructure.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code VkBaseOutStructure} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkBaseOutStructure calloc() {
        return wrap(VkBaseOutStructure.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code VkBaseOutStructure} instance allocated with {@link BufferUtils}. */
    public static VkBaseOutStructure create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(VkBaseOutStructure.class, memAddress(container), container);
    }

    /** Returns a new {@code VkBaseOutStructure} instance for the specified memory address. */
    public static VkBaseOutStructure create(long address) {
        return wrap(VkBaseOutStructure.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkBaseOutStructure createSafe(long address) {
        return address == NULL ? null : wrap(VkBaseOutStructure.class, address);
    }

    /**
     * Returns a new {@link VkBaseOutStructure.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkBaseOutStructure.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkBaseOutStructure.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkBaseOutStructure.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkBaseOutStructure.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkBaseOutStructure.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link VkBaseOutStructure.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkBaseOutStructure.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkBaseOutStructure.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
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
        return wrap(VkBaseOutStructure.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code VkBaseOutStructure} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkBaseOutStructure calloc(MemoryStack stack) {
        return wrap(VkBaseOutStructure.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link VkBaseOutStructure.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkBaseOutStructure.Buffer malloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkBaseOutStructure.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkBaseOutStructure.Buffer calloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return UNSAFE.getInt(null, struct + VkBaseOutStructure.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    @Nullable public static VkBaseOutStructure npNext(long struct) { return VkBaseOutStructure.createSafe(memGetAddress(struct + VkBaseOutStructure.PNEXT)); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { UNSAFE.putInt(null, struct + VkBaseOutStructure.STYPE, value); }
    /** Unsafe version of {@link #pNext(VkBaseOutStructure) pNext}. */
    public static void npNext(long struct, @Nullable VkBaseOutStructure value) { memPutAddress(struct + VkBaseOutStructure.PNEXT, memAddressSafe(value)); }

    // -----------------------------------

    /** An array of {@link VkBaseOutStructure} structs. */
    public static class Buffer extends StructBuffer<VkBaseOutStructure, Buffer> implements NativeResource {

        private static final VkBaseOutStructure ELEMENT_FACTORY = VkBaseOutStructure.create(-1L);

        /**
         * Creates a new {@code VkBaseOutStructure.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkBaseOutStructure#SIZEOF}, and its mark will be undefined.
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
        protected VkBaseOutStructure getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link VkBaseOutStructure#sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkBaseOutStructure.nsType(address()); }
        /** @return a {@link VkBaseOutStructure} view of the struct pointed to by the {@link VkBaseOutStructure#pNext} field. */
        @Nullable
        @NativeType("VkBaseOutStructure *")
        public VkBaseOutStructure pNext() { return VkBaseOutStructure.npNext(address()); }

        /** Sets the specified value to the {@link VkBaseOutStructure#sType} field. */
        public VkBaseOutStructure.Buffer sType(@NativeType("VkStructureType") int value) { VkBaseOutStructure.nsType(address(), value); return this; }
        /** Sets the address of the specified {@link VkBaseOutStructure} to the {@link VkBaseOutStructure#pNext} field. */
        public VkBaseOutStructure.Buffer pNext(@Nullable @NativeType("VkBaseOutStructure *") VkBaseOutStructure value) { VkBaseOutStructure.npNext(address(), value); return this; }

    }

}