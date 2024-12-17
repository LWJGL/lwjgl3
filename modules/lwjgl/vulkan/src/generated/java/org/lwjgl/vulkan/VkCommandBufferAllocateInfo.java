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
 * <pre>{@code
 * struct VkCommandBufferAllocateInfo {
 *     VkStructureType sType;
 *     void const * pNext;
 *     VkCommandPool commandPool;
 *     VkCommandBufferLevel level;
 *     uint32_t commandBufferCount;
 * }}</pre>
 */
public class VkCommandBufferAllocateInfo extends Struct<VkCommandBufferAllocateInfo> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        COMMANDPOOL,
        LEVEL,
        COMMANDBUFFERCOUNT;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(8),
            __member(4),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        COMMANDPOOL = layout.offsetof(2);
        LEVEL = layout.offsetof(3);
        COMMANDBUFFERCOUNT = layout.offsetof(4);
    }

    protected VkCommandBufferAllocateInfo(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkCommandBufferAllocateInfo create(long address, @Nullable ByteBuffer container) {
        return new VkCommandBufferAllocateInfo(address, container);
    }

    /**
     * Creates a {@code VkCommandBufferAllocateInfo} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkCommandBufferAllocateInfo(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return the value of the {@code sType} field. */
    @NativeType("VkStructureType")
    public int sType() { return nsType(address()); }
    /** @return the value of the {@code pNext} field. */
    @NativeType("void const *")
    public long pNext() { return npNext(address()); }
    /** @return the value of the {@code commandPool} field. */
    @NativeType("VkCommandPool")
    public long commandPool() { return ncommandPool(address()); }
    /** @return the value of the {@code level} field. */
    @NativeType("VkCommandBufferLevel")
    public int level() { return nlevel(address()); }
    /** @return the value of the {@code commandBufferCount} field. */
    @NativeType("uint32_t")
    public int commandBufferCount() { return ncommandBufferCount(address()); }

    /** Sets the specified value to the {@code sType} field. */
    public VkCommandBufferAllocateInfo sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link VK10#VK_STRUCTURE_TYPE_COMMAND_BUFFER_ALLOCATE_INFO STRUCTURE_TYPE_COMMAND_BUFFER_ALLOCATE_INFO} value to the {@code sType} field. */
    public VkCommandBufferAllocateInfo sType$Default() { return sType(VK10.VK_STRUCTURE_TYPE_COMMAND_BUFFER_ALLOCATE_INFO); }
    /** Sets the specified value to the {@code pNext} field. */
    public VkCommandBufferAllocateInfo pNext(@NativeType("void const *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@code commandPool} field. */
    public VkCommandBufferAllocateInfo commandPool(@NativeType("VkCommandPool") long value) { ncommandPool(address(), value); return this; }
    /** Sets the specified value to the {@code level} field. */
    public VkCommandBufferAllocateInfo level(@NativeType("VkCommandBufferLevel") int value) { nlevel(address(), value); return this; }
    /** Sets the specified value to the {@code commandBufferCount} field. */
    public VkCommandBufferAllocateInfo commandBufferCount(@NativeType("uint32_t") int value) { ncommandBufferCount(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkCommandBufferAllocateInfo set(
        int sType,
        long pNext,
        long commandPool,
        int level,
        int commandBufferCount
    ) {
        sType(sType);
        pNext(pNext);
        commandPool(commandPool);
        level(level);
        commandBufferCount(commandBufferCount);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkCommandBufferAllocateInfo set(VkCommandBufferAllocateInfo src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkCommandBufferAllocateInfo} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkCommandBufferAllocateInfo malloc() {
        return new VkCommandBufferAllocateInfo(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkCommandBufferAllocateInfo} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkCommandBufferAllocateInfo calloc() {
        return new VkCommandBufferAllocateInfo(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkCommandBufferAllocateInfo} instance allocated with {@link BufferUtils}. */
    public static VkCommandBufferAllocateInfo create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkCommandBufferAllocateInfo(memAddress(container), container);
    }

    /** Returns a new {@code VkCommandBufferAllocateInfo} instance for the specified memory address. */
    public static VkCommandBufferAllocateInfo create(long address) {
        return new VkCommandBufferAllocateInfo(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable VkCommandBufferAllocateInfo createSafe(long address) {
        return address == NULL ? null : new VkCommandBufferAllocateInfo(address, null);
    }

    /**
     * Returns a new {@link VkCommandBufferAllocateInfo.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkCommandBufferAllocateInfo.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkCommandBufferAllocateInfo.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkCommandBufferAllocateInfo.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkCommandBufferAllocateInfo.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkCommandBufferAllocateInfo.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkCommandBufferAllocateInfo.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkCommandBufferAllocateInfo.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static VkCommandBufferAllocateInfo.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    // -----------------------------------

    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static VkCommandBufferAllocateInfo mallocStack() { return malloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static VkCommandBufferAllocateInfo callocStack() { return calloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static VkCommandBufferAllocateInfo mallocStack(MemoryStack stack) { return malloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static VkCommandBufferAllocateInfo callocStack(MemoryStack stack) { return calloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static VkCommandBufferAllocateInfo.Buffer mallocStack(int capacity) { return malloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static VkCommandBufferAllocateInfo.Buffer callocStack(int capacity) { return calloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static VkCommandBufferAllocateInfo.Buffer mallocStack(int capacity, MemoryStack stack) { return malloc(capacity, stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static VkCommandBufferAllocateInfo.Buffer callocStack(int capacity, MemoryStack stack) { return calloc(capacity, stack); }

    /**
     * Returns a new {@code VkCommandBufferAllocateInfo} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkCommandBufferAllocateInfo malloc(MemoryStack stack) {
        return new VkCommandBufferAllocateInfo(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkCommandBufferAllocateInfo} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkCommandBufferAllocateInfo calloc(MemoryStack stack) {
        return new VkCommandBufferAllocateInfo(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkCommandBufferAllocateInfo.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkCommandBufferAllocateInfo.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkCommandBufferAllocateInfo.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkCommandBufferAllocateInfo.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return memGetInt(struct + VkCommandBufferAllocateInfo.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkCommandBufferAllocateInfo.PNEXT); }
    /** Unsafe version of {@link #commandPool}. */
    public static long ncommandPool(long struct) { return memGetLong(struct + VkCommandBufferAllocateInfo.COMMANDPOOL); }
    /** Unsafe version of {@link #level}. */
    public static int nlevel(long struct) { return memGetInt(struct + VkCommandBufferAllocateInfo.LEVEL); }
    /** Unsafe version of {@link #commandBufferCount}. */
    public static int ncommandBufferCount(long struct) { return memGetInt(struct + VkCommandBufferAllocateInfo.COMMANDBUFFERCOUNT); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { memPutInt(struct + VkCommandBufferAllocateInfo.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkCommandBufferAllocateInfo.PNEXT, value); }
    /** Unsafe version of {@link #commandPool(long) commandPool}. */
    public static void ncommandPool(long struct, long value) { memPutLong(struct + VkCommandBufferAllocateInfo.COMMANDPOOL, value); }
    /** Unsafe version of {@link #level(int) level}. */
    public static void nlevel(long struct, int value) { memPutInt(struct + VkCommandBufferAllocateInfo.LEVEL, value); }
    /** Unsafe version of {@link #commandBufferCount(int) commandBufferCount}. */
    public static void ncommandBufferCount(long struct, int value) { memPutInt(struct + VkCommandBufferAllocateInfo.COMMANDBUFFERCOUNT, value); }

    // -----------------------------------

    /** An array of {@link VkCommandBufferAllocateInfo} structs. */
    public static class Buffer extends StructBuffer<VkCommandBufferAllocateInfo, Buffer> implements NativeResource {

        private static final VkCommandBufferAllocateInfo ELEMENT_FACTORY = VkCommandBufferAllocateInfo.create(-1L);

        /**
         * Creates a new {@code VkCommandBufferAllocateInfo.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkCommandBufferAllocateInfo#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkCommandBufferAllocateInfo getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkCommandBufferAllocateInfo.nsType(address()); }
        /** @return the value of the {@code pNext} field. */
        @NativeType("void const *")
        public long pNext() { return VkCommandBufferAllocateInfo.npNext(address()); }
        /** @return the value of the {@code commandPool} field. */
        @NativeType("VkCommandPool")
        public long commandPool() { return VkCommandBufferAllocateInfo.ncommandPool(address()); }
        /** @return the value of the {@code level} field. */
        @NativeType("VkCommandBufferLevel")
        public int level() { return VkCommandBufferAllocateInfo.nlevel(address()); }
        /** @return the value of the {@code commandBufferCount} field. */
        @NativeType("uint32_t")
        public int commandBufferCount() { return VkCommandBufferAllocateInfo.ncommandBufferCount(address()); }

        /** Sets the specified value to the {@code sType} field. */
        public VkCommandBufferAllocateInfo.Buffer sType(@NativeType("VkStructureType") int value) { VkCommandBufferAllocateInfo.nsType(address(), value); return this; }
        /** Sets the {@link VK10#VK_STRUCTURE_TYPE_COMMAND_BUFFER_ALLOCATE_INFO STRUCTURE_TYPE_COMMAND_BUFFER_ALLOCATE_INFO} value to the {@code sType} field. */
        public VkCommandBufferAllocateInfo.Buffer sType$Default() { return sType(VK10.VK_STRUCTURE_TYPE_COMMAND_BUFFER_ALLOCATE_INFO); }
        /** Sets the specified value to the {@code pNext} field. */
        public VkCommandBufferAllocateInfo.Buffer pNext(@NativeType("void const *") long value) { VkCommandBufferAllocateInfo.npNext(address(), value); return this; }
        /** Sets the specified value to the {@code commandPool} field. */
        public VkCommandBufferAllocateInfo.Buffer commandPool(@NativeType("VkCommandPool") long value) { VkCommandBufferAllocateInfo.ncommandPool(address(), value); return this; }
        /** Sets the specified value to the {@code level} field. */
        public VkCommandBufferAllocateInfo.Buffer level(@NativeType("VkCommandBufferLevel") int value) { VkCommandBufferAllocateInfo.nlevel(address(), value); return this; }
        /** Sets the specified value to the {@code commandBufferCount} field. */
        public VkCommandBufferAllocateInfo.Buffer commandBufferCount(@NativeType("uint32_t") int value) { VkCommandBufferAllocateInfo.ncommandBufferCount(address(), value); return this; }

    }

}