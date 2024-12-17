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
 * struct VkMemoryAllocateFlagsInfo {
 *     VkStructureType sType;
 *     void const * pNext;
 *     VkMemoryAllocateFlags flags;
 *     uint32_t deviceMask;
 * }}</pre>
 */
public class VkMemoryAllocateFlagsInfo extends Struct<VkMemoryAllocateFlagsInfo> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        FLAGS,
        DEVICEMASK;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(4),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        FLAGS = layout.offsetof(2);
        DEVICEMASK = layout.offsetof(3);
    }

    protected VkMemoryAllocateFlagsInfo(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkMemoryAllocateFlagsInfo create(long address, @Nullable ByteBuffer container) {
        return new VkMemoryAllocateFlagsInfo(address, container);
    }

    /**
     * Creates a {@code VkMemoryAllocateFlagsInfo} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkMemoryAllocateFlagsInfo(ByteBuffer container) {
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
    @NativeType("VkMemoryAllocateFlags")
    public int flags() { return nflags(address()); }
    /** @return the value of the {@code deviceMask} field. */
    @NativeType("uint32_t")
    public int deviceMask() { return ndeviceMask(address()); }

    /** Sets the specified value to the {@code sType} field. */
    public VkMemoryAllocateFlagsInfo sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link VK11#VK_STRUCTURE_TYPE_MEMORY_ALLOCATE_FLAGS_INFO STRUCTURE_TYPE_MEMORY_ALLOCATE_FLAGS_INFO} value to the {@code sType} field. */
    public VkMemoryAllocateFlagsInfo sType$Default() { return sType(VK11.VK_STRUCTURE_TYPE_MEMORY_ALLOCATE_FLAGS_INFO); }
    /** Sets the specified value to the {@code pNext} field. */
    public VkMemoryAllocateFlagsInfo pNext(@NativeType("void const *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@code flags} field. */
    public VkMemoryAllocateFlagsInfo flags(@NativeType("VkMemoryAllocateFlags") int value) { nflags(address(), value); return this; }
    /** Sets the specified value to the {@code deviceMask} field. */
    public VkMemoryAllocateFlagsInfo deviceMask(@NativeType("uint32_t") int value) { ndeviceMask(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkMemoryAllocateFlagsInfo set(
        int sType,
        long pNext,
        int flags,
        int deviceMask
    ) {
        sType(sType);
        pNext(pNext);
        flags(flags);
        deviceMask(deviceMask);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkMemoryAllocateFlagsInfo set(VkMemoryAllocateFlagsInfo src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkMemoryAllocateFlagsInfo} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkMemoryAllocateFlagsInfo malloc() {
        return new VkMemoryAllocateFlagsInfo(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkMemoryAllocateFlagsInfo} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkMemoryAllocateFlagsInfo calloc() {
        return new VkMemoryAllocateFlagsInfo(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkMemoryAllocateFlagsInfo} instance allocated with {@link BufferUtils}. */
    public static VkMemoryAllocateFlagsInfo create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkMemoryAllocateFlagsInfo(memAddress(container), container);
    }

    /** Returns a new {@code VkMemoryAllocateFlagsInfo} instance for the specified memory address. */
    public static VkMemoryAllocateFlagsInfo create(long address) {
        return new VkMemoryAllocateFlagsInfo(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable VkMemoryAllocateFlagsInfo createSafe(long address) {
        return address == NULL ? null : new VkMemoryAllocateFlagsInfo(address, null);
    }

    /**
     * Returns a new {@link VkMemoryAllocateFlagsInfo.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkMemoryAllocateFlagsInfo.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkMemoryAllocateFlagsInfo.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkMemoryAllocateFlagsInfo.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkMemoryAllocateFlagsInfo.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkMemoryAllocateFlagsInfo.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkMemoryAllocateFlagsInfo.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkMemoryAllocateFlagsInfo.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static VkMemoryAllocateFlagsInfo.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    // -----------------------------------

    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static VkMemoryAllocateFlagsInfo mallocStack() { return malloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static VkMemoryAllocateFlagsInfo callocStack() { return calloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static VkMemoryAllocateFlagsInfo mallocStack(MemoryStack stack) { return malloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static VkMemoryAllocateFlagsInfo callocStack(MemoryStack stack) { return calloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static VkMemoryAllocateFlagsInfo.Buffer mallocStack(int capacity) { return malloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static VkMemoryAllocateFlagsInfo.Buffer callocStack(int capacity) { return calloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static VkMemoryAllocateFlagsInfo.Buffer mallocStack(int capacity, MemoryStack stack) { return malloc(capacity, stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static VkMemoryAllocateFlagsInfo.Buffer callocStack(int capacity, MemoryStack stack) { return calloc(capacity, stack); }

    /**
     * Returns a new {@code VkMemoryAllocateFlagsInfo} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkMemoryAllocateFlagsInfo malloc(MemoryStack stack) {
        return new VkMemoryAllocateFlagsInfo(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkMemoryAllocateFlagsInfo} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkMemoryAllocateFlagsInfo calloc(MemoryStack stack) {
        return new VkMemoryAllocateFlagsInfo(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkMemoryAllocateFlagsInfo.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkMemoryAllocateFlagsInfo.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkMemoryAllocateFlagsInfo.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkMemoryAllocateFlagsInfo.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return memGetInt(struct + VkMemoryAllocateFlagsInfo.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkMemoryAllocateFlagsInfo.PNEXT); }
    /** Unsafe version of {@link #flags}. */
    public static int nflags(long struct) { return memGetInt(struct + VkMemoryAllocateFlagsInfo.FLAGS); }
    /** Unsafe version of {@link #deviceMask}. */
    public static int ndeviceMask(long struct) { return memGetInt(struct + VkMemoryAllocateFlagsInfo.DEVICEMASK); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { memPutInt(struct + VkMemoryAllocateFlagsInfo.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkMemoryAllocateFlagsInfo.PNEXT, value); }
    /** Unsafe version of {@link #flags(int) flags}. */
    public static void nflags(long struct, int value) { memPutInt(struct + VkMemoryAllocateFlagsInfo.FLAGS, value); }
    /** Unsafe version of {@link #deviceMask(int) deviceMask}. */
    public static void ndeviceMask(long struct, int value) { memPutInt(struct + VkMemoryAllocateFlagsInfo.DEVICEMASK, value); }

    // -----------------------------------

    /** An array of {@link VkMemoryAllocateFlagsInfo} structs. */
    public static class Buffer extends StructBuffer<VkMemoryAllocateFlagsInfo, Buffer> implements NativeResource {

        private static final VkMemoryAllocateFlagsInfo ELEMENT_FACTORY = VkMemoryAllocateFlagsInfo.create(-1L);

        /**
         * Creates a new {@code VkMemoryAllocateFlagsInfo.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkMemoryAllocateFlagsInfo#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkMemoryAllocateFlagsInfo getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkMemoryAllocateFlagsInfo.nsType(address()); }
        /** @return the value of the {@code pNext} field. */
        @NativeType("void const *")
        public long pNext() { return VkMemoryAllocateFlagsInfo.npNext(address()); }
        /** @return the value of the {@code flags} field. */
        @NativeType("VkMemoryAllocateFlags")
        public int flags() { return VkMemoryAllocateFlagsInfo.nflags(address()); }
        /** @return the value of the {@code deviceMask} field. */
        @NativeType("uint32_t")
        public int deviceMask() { return VkMemoryAllocateFlagsInfo.ndeviceMask(address()); }

        /** Sets the specified value to the {@code sType} field. */
        public VkMemoryAllocateFlagsInfo.Buffer sType(@NativeType("VkStructureType") int value) { VkMemoryAllocateFlagsInfo.nsType(address(), value); return this; }
        /** Sets the {@link VK11#VK_STRUCTURE_TYPE_MEMORY_ALLOCATE_FLAGS_INFO STRUCTURE_TYPE_MEMORY_ALLOCATE_FLAGS_INFO} value to the {@code sType} field. */
        public VkMemoryAllocateFlagsInfo.Buffer sType$Default() { return sType(VK11.VK_STRUCTURE_TYPE_MEMORY_ALLOCATE_FLAGS_INFO); }
        /** Sets the specified value to the {@code pNext} field. */
        public VkMemoryAllocateFlagsInfo.Buffer pNext(@NativeType("void const *") long value) { VkMemoryAllocateFlagsInfo.npNext(address(), value); return this; }
        /** Sets the specified value to the {@code flags} field. */
        public VkMemoryAllocateFlagsInfo.Buffer flags(@NativeType("VkMemoryAllocateFlags") int value) { VkMemoryAllocateFlagsInfo.nflags(address(), value); return this; }
        /** Sets the specified value to the {@code deviceMask} field. */
        public VkMemoryAllocateFlagsInfo.Buffer deviceMask(@NativeType("uint32_t") int value) { VkMemoryAllocateFlagsInfo.ndeviceMask(address(), value); return this; }

    }

}