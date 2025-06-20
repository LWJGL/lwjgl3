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
 * struct VkCommandPoolCreateInfo {
 *     VkStructureType sType;
 *     void const * pNext;
 *     VkCommandPoolCreateFlags flags;
 *     uint32_t queueFamilyIndex;
 * }}</pre>
 */
public class VkCommandPoolCreateInfo extends Struct<VkCommandPoolCreateInfo> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        FLAGS,
        QUEUEFAMILYINDEX;

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
        QUEUEFAMILYINDEX = layout.offsetof(3);
    }

    protected VkCommandPoolCreateInfo(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkCommandPoolCreateInfo create(long address, @Nullable ByteBuffer container) {
        return new VkCommandPoolCreateInfo(address, container);
    }

    /**
     * Creates a {@code VkCommandPoolCreateInfo} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkCommandPoolCreateInfo(ByteBuffer container) {
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
    @NativeType("VkCommandPoolCreateFlags")
    public int flags() { return nflags(address()); }
    /** @return the value of the {@code queueFamilyIndex} field. */
    @NativeType("uint32_t")
    public int queueFamilyIndex() { return nqueueFamilyIndex(address()); }

    /** Sets the specified value to the {@code sType} field. */
    public VkCommandPoolCreateInfo sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link VK10#VK_STRUCTURE_TYPE_COMMAND_POOL_CREATE_INFO STRUCTURE_TYPE_COMMAND_POOL_CREATE_INFO} value to the {@code sType} field. */
    public VkCommandPoolCreateInfo sType$Default() { return sType(VK10.VK_STRUCTURE_TYPE_COMMAND_POOL_CREATE_INFO); }
    /** Sets the specified value to the {@code pNext} field. */
    public VkCommandPoolCreateInfo pNext(@NativeType("void const *") long value) { npNext(address(), value); return this; }
    /** Prepends the specified {@link VkDataGraphProcessingEngineCreateInfoARM} value to the {@code pNext} chain. */
    public VkCommandPoolCreateInfo pNext(VkDataGraphProcessingEngineCreateInfoARM value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Sets the specified value to the {@code flags} field. */
    public VkCommandPoolCreateInfo flags(@NativeType("VkCommandPoolCreateFlags") int value) { nflags(address(), value); return this; }
    /** Sets the specified value to the {@code queueFamilyIndex} field. */
    public VkCommandPoolCreateInfo queueFamilyIndex(@NativeType("uint32_t") int value) { nqueueFamilyIndex(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkCommandPoolCreateInfo set(
        int sType,
        long pNext,
        int flags,
        int queueFamilyIndex
    ) {
        sType(sType);
        pNext(pNext);
        flags(flags);
        queueFamilyIndex(queueFamilyIndex);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkCommandPoolCreateInfo set(VkCommandPoolCreateInfo src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkCommandPoolCreateInfo} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkCommandPoolCreateInfo malloc() {
        return new VkCommandPoolCreateInfo(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkCommandPoolCreateInfo} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkCommandPoolCreateInfo calloc() {
        return new VkCommandPoolCreateInfo(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkCommandPoolCreateInfo} instance allocated with {@link BufferUtils}. */
    public static VkCommandPoolCreateInfo create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkCommandPoolCreateInfo(memAddress(container), container);
    }

    /** Returns a new {@code VkCommandPoolCreateInfo} instance for the specified memory address. */
    public static VkCommandPoolCreateInfo create(long address) {
        return new VkCommandPoolCreateInfo(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable VkCommandPoolCreateInfo createSafe(long address) {
        return address == NULL ? null : new VkCommandPoolCreateInfo(address, null);
    }

    /**
     * Returns a new {@link VkCommandPoolCreateInfo.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkCommandPoolCreateInfo.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkCommandPoolCreateInfo.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkCommandPoolCreateInfo.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkCommandPoolCreateInfo.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkCommandPoolCreateInfo.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkCommandPoolCreateInfo.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkCommandPoolCreateInfo.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static VkCommandPoolCreateInfo.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    // -----------------------------------

    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static VkCommandPoolCreateInfo mallocStack() { return malloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static VkCommandPoolCreateInfo callocStack() { return calloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static VkCommandPoolCreateInfo mallocStack(MemoryStack stack) { return malloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static VkCommandPoolCreateInfo callocStack(MemoryStack stack) { return calloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static VkCommandPoolCreateInfo.Buffer mallocStack(int capacity) { return malloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static VkCommandPoolCreateInfo.Buffer callocStack(int capacity) { return calloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static VkCommandPoolCreateInfo.Buffer mallocStack(int capacity, MemoryStack stack) { return malloc(capacity, stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static VkCommandPoolCreateInfo.Buffer callocStack(int capacity, MemoryStack stack) { return calloc(capacity, stack); }

    /**
     * Returns a new {@code VkCommandPoolCreateInfo} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkCommandPoolCreateInfo malloc(MemoryStack stack) {
        return new VkCommandPoolCreateInfo(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkCommandPoolCreateInfo} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkCommandPoolCreateInfo calloc(MemoryStack stack) {
        return new VkCommandPoolCreateInfo(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkCommandPoolCreateInfo.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkCommandPoolCreateInfo.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkCommandPoolCreateInfo.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkCommandPoolCreateInfo.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return memGetInt(struct + VkCommandPoolCreateInfo.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkCommandPoolCreateInfo.PNEXT); }
    /** Unsafe version of {@link #flags}. */
    public static int nflags(long struct) { return memGetInt(struct + VkCommandPoolCreateInfo.FLAGS); }
    /** Unsafe version of {@link #queueFamilyIndex}. */
    public static int nqueueFamilyIndex(long struct) { return memGetInt(struct + VkCommandPoolCreateInfo.QUEUEFAMILYINDEX); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { memPutInt(struct + VkCommandPoolCreateInfo.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkCommandPoolCreateInfo.PNEXT, value); }
    /** Unsafe version of {@link #flags(int) flags}. */
    public static void nflags(long struct, int value) { memPutInt(struct + VkCommandPoolCreateInfo.FLAGS, value); }
    /** Unsafe version of {@link #queueFamilyIndex(int) queueFamilyIndex}. */
    public static void nqueueFamilyIndex(long struct, int value) { memPutInt(struct + VkCommandPoolCreateInfo.QUEUEFAMILYINDEX, value); }

    // -----------------------------------

    /** An array of {@link VkCommandPoolCreateInfo} structs. */
    public static class Buffer extends StructBuffer<VkCommandPoolCreateInfo, Buffer> implements NativeResource {

        private static final VkCommandPoolCreateInfo ELEMENT_FACTORY = VkCommandPoolCreateInfo.create(-1L);

        /**
         * Creates a new {@code VkCommandPoolCreateInfo.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkCommandPoolCreateInfo#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkCommandPoolCreateInfo getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkCommandPoolCreateInfo.nsType(address()); }
        /** @return the value of the {@code pNext} field. */
        @NativeType("void const *")
        public long pNext() { return VkCommandPoolCreateInfo.npNext(address()); }
        /** @return the value of the {@code flags} field. */
        @NativeType("VkCommandPoolCreateFlags")
        public int flags() { return VkCommandPoolCreateInfo.nflags(address()); }
        /** @return the value of the {@code queueFamilyIndex} field. */
        @NativeType("uint32_t")
        public int queueFamilyIndex() { return VkCommandPoolCreateInfo.nqueueFamilyIndex(address()); }

        /** Sets the specified value to the {@code sType} field. */
        public VkCommandPoolCreateInfo.Buffer sType(@NativeType("VkStructureType") int value) { VkCommandPoolCreateInfo.nsType(address(), value); return this; }
        /** Sets the {@link VK10#VK_STRUCTURE_TYPE_COMMAND_POOL_CREATE_INFO STRUCTURE_TYPE_COMMAND_POOL_CREATE_INFO} value to the {@code sType} field. */
        public VkCommandPoolCreateInfo.Buffer sType$Default() { return sType(VK10.VK_STRUCTURE_TYPE_COMMAND_POOL_CREATE_INFO); }
        /** Sets the specified value to the {@code pNext} field. */
        public VkCommandPoolCreateInfo.Buffer pNext(@NativeType("void const *") long value) { VkCommandPoolCreateInfo.npNext(address(), value); return this; }
        /** Prepends the specified {@link VkDataGraphProcessingEngineCreateInfoARM} value to the {@code pNext} chain. */
        public VkCommandPoolCreateInfo.Buffer pNext(VkDataGraphProcessingEngineCreateInfoARM value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Sets the specified value to the {@code flags} field. */
        public VkCommandPoolCreateInfo.Buffer flags(@NativeType("VkCommandPoolCreateFlags") int value) { VkCommandPoolCreateInfo.nflags(address(), value); return this; }
        /** Sets the specified value to the {@code queueFamilyIndex} field. */
        public VkCommandPoolCreateInfo.Buffer queueFamilyIndex(@NativeType("uint32_t") int value) { VkCommandPoolCreateInfo.nqueueFamilyIndex(address(), value); return this; }

    }

}