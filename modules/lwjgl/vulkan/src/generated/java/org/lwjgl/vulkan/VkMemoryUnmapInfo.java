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
 * struct VkMemoryUnmapInfo {
 *     VkStructureType sType;
 *     void const * pNext;
 *     VkMemoryUnmapFlags flags;
 *     VkDeviceMemory memory;
 * }}</pre>
 */
public class VkMemoryUnmapInfo extends Struct<VkMemoryUnmapInfo> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        FLAGS,
        MEMORY;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(4),
            __member(8)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        FLAGS = layout.offsetof(2);
        MEMORY = layout.offsetof(3);
    }

    protected VkMemoryUnmapInfo(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkMemoryUnmapInfo create(long address, @Nullable ByteBuffer container) {
        return new VkMemoryUnmapInfo(address, container);
    }

    /**
     * Creates a {@code VkMemoryUnmapInfo} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkMemoryUnmapInfo(ByteBuffer container) {
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
    /** @return the value of the {@code flags} field. */
    @NativeType("VkMemoryUnmapFlags")
    public int flags() { return nflags(address()); }
    /** @return the value of the {@code memory} field. */
    @NativeType("VkDeviceMemory")
    public long memory() { return nmemory(address()); }

    /** Sets the specified value to the {@code sType} field. */
    public VkMemoryUnmapInfo sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link VK14#VK_STRUCTURE_TYPE_MEMORY_UNMAP_INFO STRUCTURE_TYPE_MEMORY_UNMAP_INFO} value to the {@code sType} field. */
    public VkMemoryUnmapInfo sType$Default() { return sType(VK14.VK_STRUCTURE_TYPE_MEMORY_UNMAP_INFO); }
    /** Sets the specified value to the {@code pNext} field. */
    public VkMemoryUnmapInfo pNext(@NativeType("void const *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@code flags} field. */
    public VkMemoryUnmapInfo flags(@NativeType("VkMemoryUnmapFlags") int value) { nflags(address(), value); return this; }
    /** Sets the specified value to the {@code memory} field. */
    public VkMemoryUnmapInfo memory(@NativeType("VkDeviceMemory") long value) { nmemory(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkMemoryUnmapInfo set(
        int sType,
        long pNext,
        int flags,
        long memory
    ) {
        sType(sType);
        pNext(pNext);
        flags(flags);
        memory(memory);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkMemoryUnmapInfo set(VkMemoryUnmapInfo src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkMemoryUnmapInfo} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkMemoryUnmapInfo malloc() {
        return new VkMemoryUnmapInfo(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkMemoryUnmapInfo} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkMemoryUnmapInfo calloc() {
        return new VkMemoryUnmapInfo(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkMemoryUnmapInfo} instance allocated with {@link BufferUtils}. */
    public static VkMemoryUnmapInfo create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkMemoryUnmapInfo(memAddress(container), container);
    }

    /** Returns a new {@code VkMemoryUnmapInfo} instance for the specified memory address. */
    public static VkMemoryUnmapInfo create(long address) {
        return new VkMemoryUnmapInfo(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable VkMemoryUnmapInfo createSafe(long address) {
        return address == NULL ? null : new VkMemoryUnmapInfo(address, null);
    }

    /**
     * Returns a new {@link VkMemoryUnmapInfo.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkMemoryUnmapInfo.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkMemoryUnmapInfo.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkMemoryUnmapInfo.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkMemoryUnmapInfo.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkMemoryUnmapInfo.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkMemoryUnmapInfo.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkMemoryUnmapInfo.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static VkMemoryUnmapInfo.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code VkMemoryUnmapInfo} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkMemoryUnmapInfo malloc(MemoryStack stack) {
        return new VkMemoryUnmapInfo(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkMemoryUnmapInfo} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkMemoryUnmapInfo calloc(MemoryStack stack) {
        return new VkMemoryUnmapInfo(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkMemoryUnmapInfo.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkMemoryUnmapInfo.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkMemoryUnmapInfo.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkMemoryUnmapInfo.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return memGetInt(struct + VkMemoryUnmapInfo.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkMemoryUnmapInfo.PNEXT); }
    /** Unsafe version of {@link #flags}. */
    public static int nflags(long struct) { return memGetInt(struct + VkMemoryUnmapInfo.FLAGS); }
    /** Unsafe version of {@link #memory}. */
    public static long nmemory(long struct) { return memGetLong(struct + VkMemoryUnmapInfo.MEMORY); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { memPutInt(struct + VkMemoryUnmapInfo.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkMemoryUnmapInfo.PNEXT, value); }
    /** Unsafe version of {@link #flags(int) flags}. */
    public static void nflags(long struct, int value) { memPutInt(struct + VkMemoryUnmapInfo.FLAGS, value); }
    /** Unsafe version of {@link #memory(long) memory}. */
    public static void nmemory(long struct, long value) { memPutLong(struct + VkMemoryUnmapInfo.MEMORY, value); }

    // -----------------------------------

    /** An array of {@link VkMemoryUnmapInfo} structs. */
    public static class Buffer extends StructBuffer<VkMemoryUnmapInfo, Buffer> implements NativeResource {

        private static final VkMemoryUnmapInfo ELEMENT_FACTORY = VkMemoryUnmapInfo.create(-1L);

        /**
         * Creates a new {@code VkMemoryUnmapInfo.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkMemoryUnmapInfo#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkMemoryUnmapInfo getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkMemoryUnmapInfo.nsType(address()); }
        /** @return the value of the {@code pNext} field. */
        @NativeType("void const *")
        public long pNext() { return VkMemoryUnmapInfo.npNext(address()); }
        /** @return the value of the {@code flags} field. */
        @NativeType("VkMemoryUnmapFlags")
        public int flags() { return VkMemoryUnmapInfo.nflags(address()); }
        /** @return the value of the {@code memory} field. */
        @NativeType("VkDeviceMemory")
        public long memory() { return VkMemoryUnmapInfo.nmemory(address()); }

        /** Sets the specified value to the {@code sType} field. */
        public VkMemoryUnmapInfo.Buffer sType(@NativeType("VkStructureType") int value) { VkMemoryUnmapInfo.nsType(address(), value); return this; }
        /** Sets the {@link VK14#VK_STRUCTURE_TYPE_MEMORY_UNMAP_INFO STRUCTURE_TYPE_MEMORY_UNMAP_INFO} value to the {@code sType} field. */
        public VkMemoryUnmapInfo.Buffer sType$Default() { return sType(VK14.VK_STRUCTURE_TYPE_MEMORY_UNMAP_INFO); }
        /** Sets the specified value to the {@code pNext} field. */
        public VkMemoryUnmapInfo.Buffer pNext(@NativeType("void const *") long value) { VkMemoryUnmapInfo.npNext(address(), value); return this; }
        /** Sets the specified value to the {@code flags} field. */
        public VkMemoryUnmapInfo.Buffer flags(@NativeType("VkMemoryUnmapFlags") int value) { VkMemoryUnmapInfo.nflags(address(), value); return this; }
        /** Sets the specified value to the {@code memory} field. */
        public VkMemoryUnmapInfo.Buffer memory(@NativeType("VkDeviceMemory") long value) { VkMemoryUnmapInfo.nmemory(address(), value); return this; }

    }

}