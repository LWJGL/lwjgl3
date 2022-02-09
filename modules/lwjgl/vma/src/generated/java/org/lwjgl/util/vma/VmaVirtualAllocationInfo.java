/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.util.vma;

import javax.annotation.*;

import java.nio.*;

import org.lwjgl.*;
import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * Parameters of an existing virtual allocation, returned by {@link Vma#vmaGetVirtualAllocationInfo GetVirtualAllocationInfo}.
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VmaVirtualAllocationInfo {
 *     VkDeviceSize {@link #offset};
 *     VkDeviceSize {@link #size};
 *     void * {@link #pUserData};
 * }</code></pre>
 */
public class VmaVirtualAllocationInfo extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        OFFSET,
        SIZE,
        PUSERDATA;

    static {
        Layout layout = __struct(
            __member(8),
            __member(8),
            __member(POINTER_SIZE)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        OFFSET = layout.offsetof(0);
        SIZE = layout.offsetof(1);
        PUSERDATA = layout.offsetof(2);
    }

    /**
     * Creates a {@code VmaVirtualAllocationInfo} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VmaVirtualAllocationInfo(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /**
     * offset of the allocation.
     * 
     * <p>Offset at which the allocation was made.</p>
     */
    @NativeType("VkDeviceSize")
    public long offset() { return noffset(address()); }
    /**
     * size of the allocation.
     * 
     * <p>Same value as passed in {@link VmaVirtualAllocationCreateInfo}{@code ::size}.</p>
     */
    @NativeType("VkDeviceSize")
    public long size() { return nsize(address()); }
    /**
     * custom pointer associated with the allocation.
     * 
     * <p>Same value as passed in {@link VmaVirtualAllocationCreateInfo}{@code ::pUserData} or to {@link Vma#vmaSetVirtualAllocationUserData SetVirtualAllocationUserData}.</p>
     */
    @NativeType("void *")
    public long pUserData() { return npUserData(address()); }

    // -----------------------------------

    /** Returns a new {@code VmaVirtualAllocationInfo} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VmaVirtualAllocationInfo malloc() {
        return wrap(VmaVirtualAllocationInfo.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code VmaVirtualAllocationInfo} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VmaVirtualAllocationInfo calloc() {
        return wrap(VmaVirtualAllocationInfo.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code VmaVirtualAllocationInfo} instance allocated with {@link BufferUtils}. */
    public static VmaVirtualAllocationInfo create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(VmaVirtualAllocationInfo.class, memAddress(container), container);
    }

    /** Returns a new {@code VmaVirtualAllocationInfo} instance for the specified memory address. */
    public static VmaVirtualAllocationInfo create(long address) {
        return wrap(VmaVirtualAllocationInfo.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VmaVirtualAllocationInfo createSafe(long address) {
        return address == NULL ? null : wrap(VmaVirtualAllocationInfo.class, address);
    }

    /**
     * Returns a new {@link VmaVirtualAllocationInfo.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VmaVirtualAllocationInfo.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VmaVirtualAllocationInfo.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VmaVirtualAllocationInfo.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VmaVirtualAllocationInfo.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VmaVirtualAllocationInfo.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link VmaVirtualAllocationInfo.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VmaVirtualAllocationInfo.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VmaVirtualAllocationInfo.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    /**
     * Returns a new {@code VmaVirtualAllocationInfo} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VmaVirtualAllocationInfo malloc(MemoryStack stack) {
        return wrap(VmaVirtualAllocationInfo.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code VmaVirtualAllocationInfo} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VmaVirtualAllocationInfo calloc(MemoryStack stack) {
        return wrap(VmaVirtualAllocationInfo.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link VmaVirtualAllocationInfo.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VmaVirtualAllocationInfo.Buffer malloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VmaVirtualAllocationInfo.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VmaVirtualAllocationInfo.Buffer calloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #offset}. */
    public static long noffset(long struct) { return UNSAFE.getLong(null, struct + VmaVirtualAllocationInfo.OFFSET); }
    /** Unsafe version of {@link #size}. */
    public static long nsize(long struct) { return UNSAFE.getLong(null, struct + VmaVirtualAllocationInfo.SIZE); }
    /** Unsafe version of {@link #pUserData}. */
    public static long npUserData(long struct) { return memGetAddress(struct + VmaVirtualAllocationInfo.PUSERDATA); }

    // -----------------------------------

    /** An array of {@link VmaVirtualAllocationInfo} structs. */
    public static class Buffer extends StructBuffer<VmaVirtualAllocationInfo, Buffer> implements NativeResource {

        private static final VmaVirtualAllocationInfo ELEMENT_FACTORY = VmaVirtualAllocationInfo.create(-1L);

        /**
         * Creates a new {@code VmaVirtualAllocationInfo.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VmaVirtualAllocationInfo#SIZEOF}, and its mark will be undefined.
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
        protected VmaVirtualAllocationInfo getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link VmaVirtualAllocationInfo#offset} field. */
        @NativeType("VkDeviceSize")
        public long offset() { return VmaVirtualAllocationInfo.noffset(address()); }
        /** @return the value of the {@link VmaVirtualAllocationInfo#size} field. */
        @NativeType("VkDeviceSize")
        public long size() { return VmaVirtualAllocationInfo.nsize(address()); }
        /** @return the value of the {@link VmaVirtualAllocationInfo#pUserData} field. */
        @NativeType("void *")
        public long pUserData() { return VmaVirtualAllocationInfo.npUserData(address()); }

    }

}