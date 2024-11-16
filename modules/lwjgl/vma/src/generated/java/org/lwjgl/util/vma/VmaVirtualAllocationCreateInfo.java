/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.util.vma;

import org.jspecify.annotations.*;

import java.nio.*;

import org.lwjgl.*;
import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * Parameters of created virtual allocation to be passed to {@link Vma#vmaVirtualAllocate VirtualAllocate}.
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VmaVirtualAllocationCreateInfo {
 *     VkDeviceSize {@link #size};
 *     VkDeviceSize {@link #alignment};
 *     VmaVirtualAllocationCreateFlags {@link #flags};
 *     void * {@link #pUserData};
 * }</code></pre>
 */
public class VmaVirtualAllocationCreateInfo extends Struct<VmaVirtualAllocationCreateInfo> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        SIZE,
        ALIGNMENT,
        FLAGS,
        PUSERDATA;

    static {
        Layout layout = __struct(
            __member(8),
            __member(8),
            __member(4),
            __member(POINTER_SIZE)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        SIZE = layout.offsetof(0);
        ALIGNMENT = layout.offsetof(1);
        FLAGS = layout.offsetof(2);
        PUSERDATA = layout.offsetof(3);
    }

    protected VmaVirtualAllocationCreateInfo(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VmaVirtualAllocationCreateInfo create(long address, @Nullable ByteBuffer container) {
        return new VmaVirtualAllocationCreateInfo(address, container);
    }

    /**
     * Creates a {@code VmaVirtualAllocationCreateInfo} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VmaVirtualAllocationCreateInfo(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /**
     * size of the allocation.
     * 
     * <p>Cannot be zero.</p>
     */
    @NativeType("VkDeviceSize")
    public long size() { return nsize(address()); }
    /**
     * required alignment of the allocation. Optional.
     * 
     * <p>Must be power of two. Special value 0 has the same meaning as 1 - means no special alignment is required, so allocation can start at any offset.</p>
     */
    @NativeType("VkDeviceSize")
    public long alignment() { return nalignment(address()); }
    /** use combination of {@code VmaVirtualAllocationCreateFlagBits}. One or more of:<br><table><tr><td>{@link Vma#VMA_VIRTUAL_ALLOCATION_CREATE_UPPER_ADDRESS_BIT VIRTUAL_ALLOCATION_CREATE_UPPER_ADDRESS_BIT}</td></tr><tr><td>{@link Vma#VMA_VIRTUAL_ALLOCATION_CREATE_STRATEGY_MIN_MEMORY_BIT VIRTUAL_ALLOCATION_CREATE_STRATEGY_MIN_MEMORY_BIT}</td></tr><tr><td>{@link Vma#VMA_VIRTUAL_ALLOCATION_CREATE_STRATEGY_MIN_TIME_BIT VIRTUAL_ALLOCATION_CREATE_STRATEGY_MIN_TIME_BIT}</td></tr><tr><td>{@link Vma#VMA_VIRTUAL_ALLOCATION_CREATE_STRATEGY_MIN_OFFSET_BIT VIRTUAL_ALLOCATION_CREATE_STRATEGY_MIN_OFFSET_BIT}</td></tr><tr><td>{@link Vma#VMA_VIRTUAL_ALLOCATION_CREATE_STRATEGY_MASK VIRTUAL_ALLOCATION_CREATE_STRATEGY_MASK}</td></tr></table> */
    @NativeType("VmaVirtualAllocationCreateFlags")
    public int flags() { return nflags(address()); }
    /**
     * custom pointer to be associated with the allocation. Optional.
     * 
     * <p>It can be any value and can be used for user-defined purposes. It can be fetched or changed later.</p>
     */
    @NativeType("void *")
    public long pUserData() { return npUserData(address()); }

    /** Sets the specified value to the {@link #size} field. */
    public VmaVirtualAllocationCreateInfo size(@NativeType("VkDeviceSize") long value) { nsize(address(), value); return this; }
    /** Sets the specified value to the {@link #alignment} field. */
    public VmaVirtualAllocationCreateInfo alignment(@NativeType("VkDeviceSize") long value) { nalignment(address(), value); return this; }
    /** Sets the specified value to the {@link #flags} field. */
    public VmaVirtualAllocationCreateInfo flags(@NativeType("VmaVirtualAllocationCreateFlags") int value) { nflags(address(), value); return this; }
    /** Sets the specified value to the {@link #pUserData} field. */
    public VmaVirtualAllocationCreateInfo pUserData(@NativeType("void *") long value) { npUserData(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VmaVirtualAllocationCreateInfo set(
        long size,
        long alignment,
        int flags,
        long pUserData
    ) {
        size(size);
        alignment(alignment);
        flags(flags);
        pUserData(pUserData);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VmaVirtualAllocationCreateInfo set(VmaVirtualAllocationCreateInfo src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VmaVirtualAllocationCreateInfo} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VmaVirtualAllocationCreateInfo malloc() {
        return new VmaVirtualAllocationCreateInfo(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VmaVirtualAllocationCreateInfo} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VmaVirtualAllocationCreateInfo calloc() {
        return new VmaVirtualAllocationCreateInfo(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VmaVirtualAllocationCreateInfo} instance allocated with {@link BufferUtils}. */
    public static VmaVirtualAllocationCreateInfo create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VmaVirtualAllocationCreateInfo(memAddress(container), container);
    }

    /** Returns a new {@code VmaVirtualAllocationCreateInfo} instance for the specified memory address. */
    public static VmaVirtualAllocationCreateInfo create(long address) {
        return new VmaVirtualAllocationCreateInfo(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable VmaVirtualAllocationCreateInfo createSafe(long address) {
        return address == NULL ? null : new VmaVirtualAllocationCreateInfo(address, null);
    }

    /**
     * Returns a new {@link VmaVirtualAllocationCreateInfo.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VmaVirtualAllocationCreateInfo.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VmaVirtualAllocationCreateInfo.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VmaVirtualAllocationCreateInfo.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VmaVirtualAllocationCreateInfo.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VmaVirtualAllocationCreateInfo.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VmaVirtualAllocationCreateInfo.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VmaVirtualAllocationCreateInfo.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static VmaVirtualAllocationCreateInfo.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code VmaVirtualAllocationCreateInfo} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VmaVirtualAllocationCreateInfo malloc(MemoryStack stack) {
        return new VmaVirtualAllocationCreateInfo(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VmaVirtualAllocationCreateInfo} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VmaVirtualAllocationCreateInfo calloc(MemoryStack stack) {
        return new VmaVirtualAllocationCreateInfo(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VmaVirtualAllocationCreateInfo.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VmaVirtualAllocationCreateInfo.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VmaVirtualAllocationCreateInfo.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VmaVirtualAllocationCreateInfo.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #size}. */
    public static long nsize(long struct) { return memGetLong(struct + VmaVirtualAllocationCreateInfo.SIZE); }
    /** Unsafe version of {@link #alignment}. */
    public static long nalignment(long struct) { return memGetLong(struct + VmaVirtualAllocationCreateInfo.ALIGNMENT); }
    /** Unsafe version of {@link #flags}. */
    public static int nflags(long struct) { return memGetInt(struct + VmaVirtualAllocationCreateInfo.FLAGS); }
    /** Unsafe version of {@link #pUserData}. */
    public static long npUserData(long struct) { return memGetAddress(struct + VmaVirtualAllocationCreateInfo.PUSERDATA); }

    /** Unsafe version of {@link #size(long) size}. */
    public static void nsize(long struct, long value) { memPutLong(struct + VmaVirtualAllocationCreateInfo.SIZE, value); }
    /** Unsafe version of {@link #alignment(long) alignment}. */
    public static void nalignment(long struct, long value) { memPutLong(struct + VmaVirtualAllocationCreateInfo.ALIGNMENT, value); }
    /** Unsafe version of {@link #flags(int) flags}. */
    public static void nflags(long struct, int value) { memPutInt(struct + VmaVirtualAllocationCreateInfo.FLAGS, value); }
    /** Unsafe version of {@link #pUserData(long) pUserData}. */
    public static void npUserData(long struct, long value) { memPutAddress(struct + VmaVirtualAllocationCreateInfo.PUSERDATA, value); }

    // -----------------------------------

    /** An array of {@link VmaVirtualAllocationCreateInfo} structs. */
    public static class Buffer extends StructBuffer<VmaVirtualAllocationCreateInfo, Buffer> implements NativeResource {

        private static final VmaVirtualAllocationCreateInfo ELEMENT_FACTORY = VmaVirtualAllocationCreateInfo.create(-1L);

        /**
         * Creates a new {@code VmaVirtualAllocationCreateInfo.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VmaVirtualAllocationCreateInfo#SIZEOF}, and its mark will be undefined.</p>
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
        protected VmaVirtualAllocationCreateInfo getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link VmaVirtualAllocationCreateInfo#size} field. */
        @NativeType("VkDeviceSize")
        public long size() { return VmaVirtualAllocationCreateInfo.nsize(address()); }
        /** @return the value of the {@link VmaVirtualAllocationCreateInfo#alignment} field. */
        @NativeType("VkDeviceSize")
        public long alignment() { return VmaVirtualAllocationCreateInfo.nalignment(address()); }
        /** @return the value of the {@link VmaVirtualAllocationCreateInfo#flags} field. */
        @NativeType("VmaVirtualAllocationCreateFlags")
        public int flags() { return VmaVirtualAllocationCreateInfo.nflags(address()); }
        /** @return the value of the {@link VmaVirtualAllocationCreateInfo#pUserData} field. */
        @NativeType("void *")
        public long pUserData() { return VmaVirtualAllocationCreateInfo.npUserData(address()); }

        /** Sets the specified value to the {@link VmaVirtualAllocationCreateInfo#size} field. */
        public VmaVirtualAllocationCreateInfo.Buffer size(@NativeType("VkDeviceSize") long value) { VmaVirtualAllocationCreateInfo.nsize(address(), value); return this; }
        /** Sets the specified value to the {@link VmaVirtualAllocationCreateInfo#alignment} field. */
        public VmaVirtualAllocationCreateInfo.Buffer alignment(@NativeType("VkDeviceSize") long value) { VmaVirtualAllocationCreateInfo.nalignment(address(), value); return this; }
        /** Sets the specified value to the {@link VmaVirtualAllocationCreateInfo#flags} field. */
        public VmaVirtualAllocationCreateInfo.Buffer flags(@NativeType("VmaVirtualAllocationCreateFlags") int value) { VmaVirtualAllocationCreateInfo.nflags(address(), value); return this; }
        /** Sets the specified value to the {@link VmaVirtualAllocationCreateInfo#pUserData} field. */
        public VmaVirtualAllocationCreateInfo.Buffer pUserData(@NativeType("void *") long value) { VmaVirtualAllocationCreateInfo.npUserData(address(), value); return this; }

    }

}