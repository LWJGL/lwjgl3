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
 * struct VkBindVideoSessionMemoryInfoKHR {
 *     VkStructureType sType;
 *     void const * pNext;
 *     uint32_t memoryBindIndex;
 *     VkDeviceMemory memory;
 *     VkDeviceSize memoryOffset;
 *     VkDeviceSize memorySize;
 * }}</pre>
 */
public class VkBindVideoSessionMemoryInfoKHR extends Struct<VkBindVideoSessionMemoryInfoKHR> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        MEMORYBINDINDEX,
        MEMORY,
        MEMORYOFFSET,
        MEMORYSIZE;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(4),
            __member(8),
            __member(8),
            __member(8)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        MEMORYBINDINDEX = layout.offsetof(2);
        MEMORY = layout.offsetof(3);
        MEMORYOFFSET = layout.offsetof(4);
        MEMORYSIZE = layout.offsetof(5);
    }

    protected VkBindVideoSessionMemoryInfoKHR(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkBindVideoSessionMemoryInfoKHR create(long address, @Nullable ByteBuffer container) {
        return new VkBindVideoSessionMemoryInfoKHR(address, container);
    }

    /**
     * Creates a {@code VkBindVideoSessionMemoryInfoKHR} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkBindVideoSessionMemoryInfoKHR(ByteBuffer container) {
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
    /** @return the value of the {@code memoryBindIndex} field. */
    @NativeType("uint32_t")
    public int memoryBindIndex() { return nmemoryBindIndex(address()); }
    /** @return the value of the {@code memory} field. */
    @NativeType("VkDeviceMemory")
    public long memory() { return nmemory(address()); }
    /** @return the value of the {@code memoryOffset} field. */
    @NativeType("VkDeviceSize")
    public long memoryOffset() { return nmemoryOffset(address()); }
    /** @return the value of the {@code memorySize} field. */
    @NativeType("VkDeviceSize")
    public long memorySize() { return nmemorySize(address()); }

    /** Sets the specified value to the {@code sType} field. */
    public VkBindVideoSessionMemoryInfoKHR sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link KHRVideoQueue#VK_STRUCTURE_TYPE_BIND_VIDEO_SESSION_MEMORY_INFO_KHR STRUCTURE_TYPE_BIND_VIDEO_SESSION_MEMORY_INFO_KHR} value to the {@code sType} field. */
    public VkBindVideoSessionMemoryInfoKHR sType$Default() { return sType(KHRVideoQueue.VK_STRUCTURE_TYPE_BIND_VIDEO_SESSION_MEMORY_INFO_KHR); }
    /** Sets the specified value to the {@code pNext} field. */
    public VkBindVideoSessionMemoryInfoKHR pNext(@NativeType("void const *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@code memoryBindIndex} field. */
    public VkBindVideoSessionMemoryInfoKHR memoryBindIndex(@NativeType("uint32_t") int value) { nmemoryBindIndex(address(), value); return this; }
    /** Sets the specified value to the {@code memory} field. */
    public VkBindVideoSessionMemoryInfoKHR memory(@NativeType("VkDeviceMemory") long value) { nmemory(address(), value); return this; }
    /** Sets the specified value to the {@code memoryOffset} field. */
    public VkBindVideoSessionMemoryInfoKHR memoryOffset(@NativeType("VkDeviceSize") long value) { nmemoryOffset(address(), value); return this; }
    /** Sets the specified value to the {@code memorySize} field. */
    public VkBindVideoSessionMemoryInfoKHR memorySize(@NativeType("VkDeviceSize") long value) { nmemorySize(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkBindVideoSessionMemoryInfoKHR set(
        int sType,
        long pNext,
        int memoryBindIndex,
        long memory,
        long memoryOffset,
        long memorySize
    ) {
        sType(sType);
        pNext(pNext);
        memoryBindIndex(memoryBindIndex);
        memory(memory);
        memoryOffset(memoryOffset);
        memorySize(memorySize);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkBindVideoSessionMemoryInfoKHR set(VkBindVideoSessionMemoryInfoKHR src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkBindVideoSessionMemoryInfoKHR} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkBindVideoSessionMemoryInfoKHR malloc() {
        return new VkBindVideoSessionMemoryInfoKHR(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkBindVideoSessionMemoryInfoKHR} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkBindVideoSessionMemoryInfoKHR calloc() {
        return new VkBindVideoSessionMemoryInfoKHR(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkBindVideoSessionMemoryInfoKHR} instance allocated with {@link BufferUtils}. */
    public static VkBindVideoSessionMemoryInfoKHR create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkBindVideoSessionMemoryInfoKHR(memAddress(container), container);
    }

    /** Returns a new {@code VkBindVideoSessionMemoryInfoKHR} instance for the specified memory address. */
    public static VkBindVideoSessionMemoryInfoKHR create(long address) {
        return new VkBindVideoSessionMemoryInfoKHR(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable VkBindVideoSessionMemoryInfoKHR createSafe(long address) {
        return address == NULL ? null : new VkBindVideoSessionMemoryInfoKHR(address, null);
    }

    /**
     * Returns a new {@link VkBindVideoSessionMemoryInfoKHR.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkBindVideoSessionMemoryInfoKHR.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkBindVideoSessionMemoryInfoKHR.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkBindVideoSessionMemoryInfoKHR.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkBindVideoSessionMemoryInfoKHR.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkBindVideoSessionMemoryInfoKHR.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkBindVideoSessionMemoryInfoKHR.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkBindVideoSessionMemoryInfoKHR.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static VkBindVideoSessionMemoryInfoKHR.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code VkBindVideoSessionMemoryInfoKHR} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkBindVideoSessionMemoryInfoKHR malloc(MemoryStack stack) {
        return new VkBindVideoSessionMemoryInfoKHR(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkBindVideoSessionMemoryInfoKHR} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkBindVideoSessionMemoryInfoKHR calloc(MemoryStack stack) {
        return new VkBindVideoSessionMemoryInfoKHR(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkBindVideoSessionMemoryInfoKHR.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkBindVideoSessionMemoryInfoKHR.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkBindVideoSessionMemoryInfoKHR.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkBindVideoSessionMemoryInfoKHR.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return memGetInt(struct + VkBindVideoSessionMemoryInfoKHR.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkBindVideoSessionMemoryInfoKHR.PNEXT); }
    /** Unsafe version of {@link #memoryBindIndex}. */
    public static int nmemoryBindIndex(long struct) { return memGetInt(struct + VkBindVideoSessionMemoryInfoKHR.MEMORYBINDINDEX); }
    /** Unsafe version of {@link #memory}. */
    public static long nmemory(long struct) { return memGetLong(struct + VkBindVideoSessionMemoryInfoKHR.MEMORY); }
    /** Unsafe version of {@link #memoryOffset}. */
    public static long nmemoryOffset(long struct) { return memGetLong(struct + VkBindVideoSessionMemoryInfoKHR.MEMORYOFFSET); }
    /** Unsafe version of {@link #memorySize}. */
    public static long nmemorySize(long struct) { return memGetLong(struct + VkBindVideoSessionMemoryInfoKHR.MEMORYSIZE); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { memPutInt(struct + VkBindVideoSessionMemoryInfoKHR.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkBindVideoSessionMemoryInfoKHR.PNEXT, value); }
    /** Unsafe version of {@link #memoryBindIndex(int) memoryBindIndex}. */
    public static void nmemoryBindIndex(long struct, int value) { memPutInt(struct + VkBindVideoSessionMemoryInfoKHR.MEMORYBINDINDEX, value); }
    /** Unsafe version of {@link #memory(long) memory}. */
    public static void nmemory(long struct, long value) { memPutLong(struct + VkBindVideoSessionMemoryInfoKHR.MEMORY, value); }
    /** Unsafe version of {@link #memoryOffset(long) memoryOffset}. */
    public static void nmemoryOffset(long struct, long value) { memPutLong(struct + VkBindVideoSessionMemoryInfoKHR.MEMORYOFFSET, value); }
    /** Unsafe version of {@link #memorySize(long) memorySize}. */
    public static void nmemorySize(long struct, long value) { memPutLong(struct + VkBindVideoSessionMemoryInfoKHR.MEMORYSIZE, value); }

    // -----------------------------------

    /** An array of {@link VkBindVideoSessionMemoryInfoKHR} structs. */
    public static class Buffer extends StructBuffer<VkBindVideoSessionMemoryInfoKHR, Buffer> implements NativeResource {

        private static final VkBindVideoSessionMemoryInfoKHR ELEMENT_FACTORY = VkBindVideoSessionMemoryInfoKHR.create(-1L);

        /**
         * Creates a new {@code VkBindVideoSessionMemoryInfoKHR.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkBindVideoSessionMemoryInfoKHR#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkBindVideoSessionMemoryInfoKHR getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkBindVideoSessionMemoryInfoKHR.nsType(address()); }
        /** @return the value of the {@code pNext} field. */
        @NativeType("void const *")
        public long pNext() { return VkBindVideoSessionMemoryInfoKHR.npNext(address()); }
        /** @return the value of the {@code memoryBindIndex} field. */
        @NativeType("uint32_t")
        public int memoryBindIndex() { return VkBindVideoSessionMemoryInfoKHR.nmemoryBindIndex(address()); }
        /** @return the value of the {@code memory} field. */
        @NativeType("VkDeviceMemory")
        public long memory() { return VkBindVideoSessionMemoryInfoKHR.nmemory(address()); }
        /** @return the value of the {@code memoryOffset} field. */
        @NativeType("VkDeviceSize")
        public long memoryOffset() { return VkBindVideoSessionMemoryInfoKHR.nmemoryOffset(address()); }
        /** @return the value of the {@code memorySize} field. */
        @NativeType("VkDeviceSize")
        public long memorySize() { return VkBindVideoSessionMemoryInfoKHR.nmemorySize(address()); }

        /** Sets the specified value to the {@code sType} field. */
        public VkBindVideoSessionMemoryInfoKHR.Buffer sType(@NativeType("VkStructureType") int value) { VkBindVideoSessionMemoryInfoKHR.nsType(address(), value); return this; }
        /** Sets the {@link KHRVideoQueue#VK_STRUCTURE_TYPE_BIND_VIDEO_SESSION_MEMORY_INFO_KHR STRUCTURE_TYPE_BIND_VIDEO_SESSION_MEMORY_INFO_KHR} value to the {@code sType} field. */
        public VkBindVideoSessionMemoryInfoKHR.Buffer sType$Default() { return sType(KHRVideoQueue.VK_STRUCTURE_TYPE_BIND_VIDEO_SESSION_MEMORY_INFO_KHR); }
        /** Sets the specified value to the {@code pNext} field. */
        public VkBindVideoSessionMemoryInfoKHR.Buffer pNext(@NativeType("void const *") long value) { VkBindVideoSessionMemoryInfoKHR.npNext(address(), value); return this; }
        /** Sets the specified value to the {@code memoryBindIndex} field. */
        public VkBindVideoSessionMemoryInfoKHR.Buffer memoryBindIndex(@NativeType("uint32_t") int value) { VkBindVideoSessionMemoryInfoKHR.nmemoryBindIndex(address(), value); return this; }
        /** Sets the specified value to the {@code memory} field. */
        public VkBindVideoSessionMemoryInfoKHR.Buffer memory(@NativeType("VkDeviceMemory") long value) { VkBindVideoSessionMemoryInfoKHR.nmemory(address(), value); return this; }
        /** Sets the specified value to the {@code memoryOffset} field. */
        public VkBindVideoSessionMemoryInfoKHR.Buffer memoryOffset(@NativeType("VkDeviceSize") long value) { VkBindVideoSessionMemoryInfoKHR.nmemoryOffset(address(), value); return this; }
        /** Sets the specified value to the {@code memorySize} field. */
        public VkBindVideoSessionMemoryInfoKHR.Buffer memorySize(@NativeType("VkDeviceSize") long value) { VkBindVideoSessionMemoryInfoKHR.nmemorySize(address(), value); return this; }

    }

}