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
 * struct VkDeviceMemoryReportCallbackDataEXT {
 *     VkStructureType sType;
 *     void * pNext;
 *     VkDeviceMemoryReportFlagsEXT flags;
 *     VkDeviceMemoryReportEventTypeEXT type;
 *     uint64_t memoryObjectId;
 *     VkDeviceSize size;
 *     VkObjectType objectType;
 *     uint64_t objectHandle;
 *     uint32_t heapIndex;
 * }}</pre>
 */
public class VkDeviceMemoryReportCallbackDataEXT extends Struct<VkDeviceMemoryReportCallbackDataEXT> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        FLAGS,
        TYPE,
        MEMORYOBJECTID,
        SIZE,
        OBJECTTYPE,
        OBJECTHANDLE,
        HEAPINDEX;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(4),
            __member(4),
            __member(8),
            __member(8),
            __member(4),
            __member(8),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        FLAGS = layout.offsetof(2);
        TYPE = layout.offsetof(3);
        MEMORYOBJECTID = layout.offsetof(4);
        SIZE = layout.offsetof(5);
        OBJECTTYPE = layout.offsetof(6);
        OBJECTHANDLE = layout.offsetof(7);
        HEAPINDEX = layout.offsetof(8);
    }

    protected VkDeviceMemoryReportCallbackDataEXT(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkDeviceMemoryReportCallbackDataEXT create(long address, @Nullable ByteBuffer container) {
        return new VkDeviceMemoryReportCallbackDataEXT(address, container);
    }

    /**
     * Creates a {@code VkDeviceMemoryReportCallbackDataEXT} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkDeviceMemoryReportCallbackDataEXT(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return the value of the {@code sType} field. */
    @NativeType("VkStructureType")
    public int sType() { return nsType(address()); }
    /** @return the value of the {@code pNext} field. */
    @NativeType("void *")
    public long pNext() { return npNext(address()); }
    /** @return the value of the {@code flags} field. */
    @NativeType("VkDeviceMemoryReportFlagsEXT")
    public int flags() { return nflags(address()); }
    /** @return the value of the {@code type} field. */
    @NativeType("VkDeviceMemoryReportEventTypeEXT")
    public int type() { return ntype(address()); }
    /** @return the value of the {@code memoryObjectId} field. */
    @NativeType("uint64_t")
    public long memoryObjectId() { return nmemoryObjectId(address()); }
    /** @return the value of the {@code size} field. */
    @NativeType("VkDeviceSize")
    public long size() { return nsize(address()); }
    /** @return the value of the {@code objectType} field. */
    @NativeType("VkObjectType")
    public int objectType() { return nobjectType(address()); }
    /** @return the value of the {@code objectHandle} field. */
    @NativeType("uint64_t")
    public long objectHandle() { return nobjectHandle(address()); }
    /** @return the value of the {@code heapIndex} field. */
    @NativeType("uint32_t")
    public int heapIndex() { return nheapIndex(address()); }

    /** Sets the specified value to the {@code sType} field. */
    public VkDeviceMemoryReportCallbackDataEXT sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link EXTDeviceMemoryReport#VK_STRUCTURE_TYPE_DEVICE_MEMORY_REPORT_CALLBACK_DATA_EXT STRUCTURE_TYPE_DEVICE_MEMORY_REPORT_CALLBACK_DATA_EXT} value to the {@code sType} field. */
    public VkDeviceMemoryReportCallbackDataEXT sType$Default() { return sType(EXTDeviceMemoryReport.VK_STRUCTURE_TYPE_DEVICE_MEMORY_REPORT_CALLBACK_DATA_EXT); }
    /** Sets the specified value to the {@code pNext} field. */
    public VkDeviceMemoryReportCallbackDataEXT pNext(@NativeType("void *") long value) { npNext(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkDeviceMemoryReportCallbackDataEXT set(
        int sType,
        long pNext
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
    public VkDeviceMemoryReportCallbackDataEXT set(VkDeviceMemoryReportCallbackDataEXT src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkDeviceMemoryReportCallbackDataEXT} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkDeviceMemoryReportCallbackDataEXT malloc() {
        return new VkDeviceMemoryReportCallbackDataEXT(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkDeviceMemoryReportCallbackDataEXT} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkDeviceMemoryReportCallbackDataEXT calloc() {
        return new VkDeviceMemoryReportCallbackDataEXT(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkDeviceMemoryReportCallbackDataEXT} instance allocated with {@link BufferUtils}. */
    public static VkDeviceMemoryReportCallbackDataEXT create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkDeviceMemoryReportCallbackDataEXT(memAddress(container), container);
    }

    /** Returns a new {@code VkDeviceMemoryReportCallbackDataEXT} instance for the specified memory address. */
    public static VkDeviceMemoryReportCallbackDataEXT create(long address) {
        return new VkDeviceMemoryReportCallbackDataEXT(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable VkDeviceMemoryReportCallbackDataEXT createSafe(long address) {
        return address == NULL ? null : new VkDeviceMemoryReportCallbackDataEXT(address, null);
    }

    /**
     * Returns a new {@link VkDeviceMemoryReportCallbackDataEXT.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkDeviceMemoryReportCallbackDataEXT.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkDeviceMemoryReportCallbackDataEXT.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkDeviceMemoryReportCallbackDataEXT.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkDeviceMemoryReportCallbackDataEXT.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkDeviceMemoryReportCallbackDataEXT.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkDeviceMemoryReportCallbackDataEXT.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkDeviceMemoryReportCallbackDataEXT.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static VkDeviceMemoryReportCallbackDataEXT.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code VkDeviceMemoryReportCallbackDataEXT} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkDeviceMemoryReportCallbackDataEXT malloc(MemoryStack stack) {
        return new VkDeviceMemoryReportCallbackDataEXT(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkDeviceMemoryReportCallbackDataEXT} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkDeviceMemoryReportCallbackDataEXT calloc(MemoryStack stack) {
        return new VkDeviceMemoryReportCallbackDataEXT(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkDeviceMemoryReportCallbackDataEXT.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkDeviceMemoryReportCallbackDataEXT.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkDeviceMemoryReportCallbackDataEXT.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkDeviceMemoryReportCallbackDataEXT.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return memGetInt(struct + VkDeviceMemoryReportCallbackDataEXT.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkDeviceMemoryReportCallbackDataEXT.PNEXT); }
    /** Unsafe version of {@link #flags}. */
    public static int nflags(long struct) { return memGetInt(struct + VkDeviceMemoryReportCallbackDataEXT.FLAGS); }
    /** Unsafe version of {@link #type}. */
    public static int ntype(long struct) { return memGetInt(struct + VkDeviceMemoryReportCallbackDataEXT.TYPE); }
    /** Unsafe version of {@link #memoryObjectId}. */
    public static long nmemoryObjectId(long struct) { return memGetLong(struct + VkDeviceMemoryReportCallbackDataEXT.MEMORYOBJECTID); }
    /** Unsafe version of {@link #size}. */
    public static long nsize(long struct) { return memGetLong(struct + VkDeviceMemoryReportCallbackDataEXT.SIZE); }
    /** Unsafe version of {@link #objectType}. */
    public static int nobjectType(long struct) { return memGetInt(struct + VkDeviceMemoryReportCallbackDataEXT.OBJECTTYPE); }
    /** Unsafe version of {@link #objectHandle}. */
    public static long nobjectHandle(long struct) { return memGetLong(struct + VkDeviceMemoryReportCallbackDataEXT.OBJECTHANDLE); }
    /** Unsafe version of {@link #heapIndex}. */
    public static int nheapIndex(long struct) { return memGetInt(struct + VkDeviceMemoryReportCallbackDataEXT.HEAPINDEX); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { memPutInt(struct + VkDeviceMemoryReportCallbackDataEXT.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkDeviceMemoryReportCallbackDataEXT.PNEXT, value); }

    // -----------------------------------

    /** An array of {@link VkDeviceMemoryReportCallbackDataEXT} structs. */
    public static class Buffer extends StructBuffer<VkDeviceMemoryReportCallbackDataEXT, Buffer> implements NativeResource {

        private static final VkDeviceMemoryReportCallbackDataEXT ELEMENT_FACTORY = VkDeviceMemoryReportCallbackDataEXT.create(-1L);

        /**
         * Creates a new {@code VkDeviceMemoryReportCallbackDataEXT.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkDeviceMemoryReportCallbackDataEXT#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkDeviceMemoryReportCallbackDataEXT getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkDeviceMemoryReportCallbackDataEXT.nsType(address()); }
        /** @return the value of the {@code pNext} field. */
        @NativeType("void *")
        public long pNext() { return VkDeviceMemoryReportCallbackDataEXT.npNext(address()); }
        /** @return the value of the {@code flags} field. */
        @NativeType("VkDeviceMemoryReportFlagsEXT")
        public int flags() { return VkDeviceMemoryReportCallbackDataEXT.nflags(address()); }
        /** @return the value of the {@code type} field. */
        @NativeType("VkDeviceMemoryReportEventTypeEXT")
        public int type() { return VkDeviceMemoryReportCallbackDataEXT.ntype(address()); }
        /** @return the value of the {@code memoryObjectId} field. */
        @NativeType("uint64_t")
        public long memoryObjectId() { return VkDeviceMemoryReportCallbackDataEXT.nmemoryObjectId(address()); }
        /** @return the value of the {@code size} field. */
        @NativeType("VkDeviceSize")
        public long size() { return VkDeviceMemoryReportCallbackDataEXT.nsize(address()); }
        /** @return the value of the {@code objectType} field. */
        @NativeType("VkObjectType")
        public int objectType() { return VkDeviceMemoryReportCallbackDataEXT.nobjectType(address()); }
        /** @return the value of the {@code objectHandle} field. */
        @NativeType("uint64_t")
        public long objectHandle() { return VkDeviceMemoryReportCallbackDataEXT.nobjectHandle(address()); }
        /** @return the value of the {@code heapIndex} field. */
        @NativeType("uint32_t")
        public int heapIndex() { return VkDeviceMemoryReportCallbackDataEXT.nheapIndex(address()); }

        /** Sets the specified value to the {@code sType} field. */
        public VkDeviceMemoryReportCallbackDataEXT.Buffer sType(@NativeType("VkStructureType") int value) { VkDeviceMemoryReportCallbackDataEXT.nsType(address(), value); return this; }
        /** Sets the {@link EXTDeviceMemoryReport#VK_STRUCTURE_TYPE_DEVICE_MEMORY_REPORT_CALLBACK_DATA_EXT STRUCTURE_TYPE_DEVICE_MEMORY_REPORT_CALLBACK_DATA_EXT} value to the {@code sType} field. */
        public VkDeviceMemoryReportCallbackDataEXT.Buffer sType$Default() { return sType(EXTDeviceMemoryReport.VK_STRUCTURE_TYPE_DEVICE_MEMORY_REPORT_CALLBACK_DATA_EXT); }
        /** Sets the specified value to the {@code pNext} field. */
        public VkDeviceMemoryReportCallbackDataEXT.Buffer pNext(@NativeType("void *") long value) { VkDeviceMemoryReportCallbackDataEXT.npNext(address(), value); return this; }

    }

}