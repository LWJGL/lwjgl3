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
 * struct VkBufferViewCreateInfo {
 *     VkStructureType sType;
 *     void const * pNext;
 *     VkBufferViewCreateFlags flags;
 *     VkBuffer buffer;
 *     VkFormat format;
 *     VkDeviceSize offset;
 *     VkDeviceSize range;
 * }}</pre>
 */
public class VkBufferViewCreateInfo extends Struct<VkBufferViewCreateInfo> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        FLAGS,
        BUFFER,
        FORMAT,
        OFFSET,
        RANGE;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(4),
            __member(8),
            __member(4),
            __member(8),
            __member(8)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        FLAGS = layout.offsetof(2);
        BUFFER = layout.offsetof(3);
        FORMAT = layout.offsetof(4);
        OFFSET = layout.offsetof(5);
        RANGE = layout.offsetof(6);
    }

    protected VkBufferViewCreateInfo(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkBufferViewCreateInfo create(long address, @Nullable ByteBuffer container) {
        return new VkBufferViewCreateInfo(address, container);
    }

    /**
     * Creates a {@code VkBufferViewCreateInfo} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkBufferViewCreateInfo(ByteBuffer container) {
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
    @NativeType("VkBufferViewCreateFlags")
    public int flags() { return nflags(address()); }
    /** @return the value of the {@code buffer} field. */
    @NativeType("VkBuffer")
    public long buffer() { return nbuffer(address()); }
    /** @return the value of the {@code format} field. */
    @NativeType("VkFormat")
    public int format() { return nformat(address()); }
    /** @return the value of the {@code offset} field. */
    @NativeType("VkDeviceSize")
    public long offset() { return noffset(address()); }
    /** @return the value of the {@code range} field. */
    @NativeType("VkDeviceSize")
    public long range() { return nrange(address()); }

    /** Sets the specified value to the {@code sType} field. */
    public VkBufferViewCreateInfo sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link VK10#VK_STRUCTURE_TYPE_BUFFER_VIEW_CREATE_INFO STRUCTURE_TYPE_BUFFER_VIEW_CREATE_INFO} value to the {@code sType} field. */
    public VkBufferViewCreateInfo sType$Default() { return sType(VK10.VK_STRUCTURE_TYPE_BUFFER_VIEW_CREATE_INFO); }
    /** Sets the specified value to the {@code pNext} field. */
    public VkBufferViewCreateInfo pNext(@NativeType("void const *") long value) { npNext(address(), value); return this; }
    /** Prepends the specified {@link VkBufferUsageFlags2CreateInfo} value to the {@code pNext} chain. */
    public VkBufferViewCreateInfo pNext(VkBufferUsageFlags2CreateInfo value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkBufferUsageFlags2CreateInfoKHR} value to the {@code pNext} chain. */
    public VkBufferViewCreateInfo pNext(VkBufferUsageFlags2CreateInfoKHR value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkExportMetalObjectCreateInfoEXT} value to the {@code pNext} chain. */
    public VkBufferViewCreateInfo pNext(VkExportMetalObjectCreateInfoEXT value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Sets the specified value to the {@code flags} field. */
    public VkBufferViewCreateInfo flags(@NativeType("VkBufferViewCreateFlags") int value) { nflags(address(), value); return this; }
    /** Sets the specified value to the {@code buffer} field. */
    public VkBufferViewCreateInfo buffer(@NativeType("VkBuffer") long value) { nbuffer(address(), value); return this; }
    /** Sets the specified value to the {@code format} field. */
    public VkBufferViewCreateInfo format(@NativeType("VkFormat") int value) { nformat(address(), value); return this; }
    /** Sets the specified value to the {@code offset} field. */
    public VkBufferViewCreateInfo offset(@NativeType("VkDeviceSize") long value) { noffset(address(), value); return this; }
    /** Sets the specified value to the {@code range} field. */
    public VkBufferViewCreateInfo range(@NativeType("VkDeviceSize") long value) { nrange(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkBufferViewCreateInfo set(
        int sType,
        long pNext,
        int flags,
        long buffer,
        int format,
        long offset,
        long range
    ) {
        sType(sType);
        pNext(pNext);
        flags(flags);
        buffer(buffer);
        format(format);
        offset(offset);
        range(range);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkBufferViewCreateInfo set(VkBufferViewCreateInfo src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkBufferViewCreateInfo} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkBufferViewCreateInfo malloc() {
        return new VkBufferViewCreateInfo(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkBufferViewCreateInfo} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkBufferViewCreateInfo calloc() {
        return new VkBufferViewCreateInfo(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkBufferViewCreateInfo} instance allocated with {@link BufferUtils}. */
    public static VkBufferViewCreateInfo create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkBufferViewCreateInfo(memAddress(container), container);
    }

    /** Returns a new {@code VkBufferViewCreateInfo} instance for the specified memory address. */
    public static VkBufferViewCreateInfo create(long address) {
        return new VkBufferViewCreateInfo(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable VkBufferViewCreateInfo createSafe(long address) {
        return address == NULL ? null : new VkBufferViewCreateInfo(address, null);
    }

    /**
     * Returns a new {@link VkBufferViewCreateInfo.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkBufferViewCreateInfo.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkBufferViewCreateInfo.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkBufferViewCreateInfo.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkBufferViewCreateInfo.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkBufferViewCreateInfo.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkBufferViewCreateInfo.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkBufferViewCreateInfo.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static VkBufferViewCreateInfo.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    // -----------------------------------

    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static VkBufferViewCreateInfo mallocStack() { return malloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static VkBufferViewCreateInfo callocStack() { return calloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static VkBufferViewCreateInfo mallocStack(MemoryStack stack) { return malloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static VkBufferViewCreateInfo callocStack(MemoryStack stack) { return calloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static VkBufferViewCreateInfo.Buffer mallocStack(int capacity) { return malloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static VkBufferViewCreateInfo.Buffer callocStack(int capacity) { return calloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static VkBufferViewCreateInfo.Buffer mallocStack(int capacity, MemoryStack stack) { return malloc(capacity, stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static VkBufferViewCreateInfo.Buffer callocStack(int capacity, MemoryStack stack) { return calloc(capacity, stack); }

    /**
     * Returns a new {@code VkBufferViewCreateInfo} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkBufferViewCreateInfo malloc(MemoryStack stack) {
        return new VkBufferViewCreateInfo(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkBufferViewCreateInfo} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkBufferViewCreateInfo calloc(MemoryStack stack) {
        return new VkBufferViewCreateInfo(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkBufferViewCreateInfo.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkBufferViewCreateInfo.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkBufferViewCreateInfo.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkBufferViewCreateInfo.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return memGetInt(struct + VkBufferViewCreateInfo.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkBufferViewCreateInfo.PNEXT); }
    /** Unsafe version of {@link #flags}. */
    public static int nflags(long struct) { return memGetInt(struct + VkBufferViewCreateInfo.FLAGS); }
    /** Unsafe version of {@link #buffer}. */
    public static long nbuffer(long struct) { return memGetLong(struct + VkBufferViewCreateInfo.BUFFER); }
    /** Unsafe version of {@link #format}. */
    public static int nformat(long struct) { return memGetInt(struct + VkBufferViewCreateInfo.FORMAT); }
    /** Unsafe version of {@link #offset}. */
    public static long noffset(long struct) { return memGetLong(struct + VkBufferViewCreateInfo.OFFSET); }
    /** Unsafe version of {@link #range}. */
    public static long nrange(long struct) { return memGetLong(struct + VkBufferViewCreateInfo.RANGE); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { memPutInt(struct + VkBufferViewCreateInfo.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkBufferViewCreateInfo.PNEXT, value); }
    /** Unsafe version of {@link #flags(int) flags}. */
    public static void nflags(long struct, int value) { memPutInt(struct + VkBufferViewCreateInfo.FLAGS, value); }
    /** Unsafe version of {@link #buffer(long) buffer}. */
    public static void nbuffer(long struct, long value) { memPutLong(struct + VkBufferViewCreateInfo.BUFFER, value); }
    /** Unsafe version of {@link #format(int) format}. */
    public static void nformat(long struct, int value) { memPutInt(struct + VkBufferViewCreateInfo.FORMAT, value); }
    /** Unsafe version of {@link #offset(long) offset}. */
    public static void noffset(long struct, long value) { memPutLong(struct + VkBufferViewCreateInfo.OFFSET, value); }
    /** Unsafe version of {@link #range(long) range}. */
    public static void nrange(long struct, long value) { memPutLong(struct + VkBufferViewCreateInfo.RANGE, value); }

    // -----------------------------------

    /** An array of {@link VkBufferViewCreateInfo} structs. */
    public static class Buffer extends StructBuffer<VkBufferViewCreateInfo, Buffer> implements NativeResource {

        private static final VkBufferViewCreateInfo ELEMENT_FACTORY = VkBufferViewCreateInfo.create(-1L);

        /**
         * Creates a new {@code VkBufferViewCreateInfo.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkBufferViewCreateInfo#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkBufferViewCreateInfo getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkBufferViewCreateInfo.nsType(address()); }
        /** @return the value of the {@code pNext} field. */
        @NativeType("void const *")
        public long pNext() { return VkBufferViewCreateInfo.npNext(address()); }
        /** @return the value of the {@code flags} field. */
        @NativeType("VkBufferViewCreateFlags")
        public int flags() { return VkBufferViewCreateInfo.nflags(address()); }
        /** @return the value of the {@code buffer} field. */
        @NativeType("VkBuffer")
        public long buffer() { return VkBufferViewCreateInfo.nbuffer(address()); }
        /** @return the value of the {@code format} field. */
        @NativeType("VkFormat")
        public int format() { return VkBufferViewCreateInfo.nformat(address()); }
        /** @return the value of the {@code offset} field. */
        @NativeType("VkDeviceSize")
        public long offset() { return VkBufferViewCreateInfo.noffset(address()); }
        /** @return the value of the {@code range} field. */
        @NativeType("VkDeviceSize")
        public long range() { return VkBufferViewCreateInfo.nrange(address()); }

        /** Sets the specified value to the {@code sType} field. */
        public VkBufferViewCreateInfo.Buffer sType(@NativeType("VkStructureType") int value) { VkBufferViewCreateInfo.nsType(address(), value); return this; }
        /** Sets the {@link VK10#VK_STRUCTURE_TYPE_BUFFER_VIEW_CREATE_INFO STRUCTURE_TYPE_BUFFER_VIEW_CREATE_INFO} value to the {@code sType} field. */
        public VkBufferViewCreateInfo.Buffer sType$Default() { return sType(VK10.VK_STRUCTURE_TYPE_BUFFER_VIEW_CREATE_INFO); }
        /** Sets the specified value to the {@code pNext} field. */
        public VkBufferViewCreateInfo.Buffer pNext(@NativeType("void const *") long value) { VkBufferViewCreateInfo.npNext(address(), value); return this; }
        /** Prepends the specified {@link VkBufferUsageFlags2CreateInfo} value to the {@code pNext} chain. */
        public VkBufferViewCreateInfo.Buffer pNext(VkBufferUsageFlags2CreateInfo value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkBufferUsageFlags2CreateInfoKHR} value to the {@code pNext} chain. */
        public VkBufferViewCreateInfo.Buffer pNext(VkBufferUsageFlags2CreateInfoKHR value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkExportMetalObjectCreateInfoEXT} value to the {@code pNext} chain. */
        public VkBufferViewCreateInfo.Buffer pNext(VkExportMetalObjectCreateInfoEXT value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Sets the specified value to the {@code flags} field. */
        public VkBufferViewCreateInfo.Buffer flags(@NativeType("VkBufferViewCreateFlags") int value) { VkBufferViewCreateInfo.nflags(address(), value); return this; }
        /** Sets the specified value to the {@code buffer} field. */
        public VkBufferViewCreateInfo.Buffer buffer(@NativeType("VkBuffer") long value) { VkBufferViewCreateInfo.nbuffer(address(), value); return this; }
        /** Sets the specified value to the {@code format} field. */
        public VkBufferViewCreateInfo.Buffer format(@NativeType("VkFormat") int value) { VkBufferViewCreateInfo.nformat(address(), value); return this; }
        /** Sets the specified value to the {@code offset} field. */
        public VkBufferViewCreateInfo.Buffer offset(@NativeType("VkDeviceSize") long value) { VkBufferViewCreateInfo.noffset(address(), value); return this; }
        /** Sets the specified value to the {@code range} field. */
        public VkBufferViewCreateInfo.Buffer range(@NativeType("VkDeviceSize") long value) { VkBufferViewCreateInfo.nrange(address(), value); return this; }

    }

}