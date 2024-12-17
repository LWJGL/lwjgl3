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
 * struct VkPipelineCreateFlags2CreateInfo {
 *     VkStructureType sType;
 *     void const * pNext;
 *     VkPipelineCreateFlags2 flags;
 * }}</pre>
 */
public class VkPipelineCreateFlags2CreateInfo extends Struct<VkPipelineCreateFlags2CreateInfo> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        FLAGS;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(8)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        FLAGS = layout.offsetof(2);
    }

    protected VkPipelineCreateFlags2CreateInfo(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkPipelineCreateFlags2CreateInfo create(long address, @Nullable ByteBuffer container) {
        return new VkPipelineCreateFlags2CreateInfo(address, container);
    }

    /**
     * Creates a {@code VkPipelineCreateFlags2CreateInfo} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkPipelineCreateFlags2CreateInfo(ByteBuffer container) {
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
    @NativeType("VkPipelineCreateFlags2")
    public long flags() { return nflags(address()); }

    /** Sets the specified value to the {@code sType} field. */
    public VkPipelineCreateFlags2CreateInfo sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link VK14#VK_STRUCTURE_TYPE_PIPELINE_CREATE_FLAGS_2_CREATE_INFO STRUCTURE_TYPE_PIPELINE_CREATE_FLAGS_2_CREATE_INFO} value to the {@code sType} field. */
    public VkPipelineCreateFlags2CreateInfo sType$Default() { return sType(VK14.VK_STRUCTURE_TYPE_PIPELINE_CREATE_FLAGS_2_CREATE_INFO); }
    /** Sets the specified value to the {@code pNext} field. */
    public VkPipelineCreateFlags2CreateInfo pNext(@NativeType("void const *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@code flags} field. */
    public VkPipelineCreateFlags2CreateInfo flags(@NativeType("VkPipelineCreateFlags2") long value) { nflags(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkPipelineCreateFlags2CreateInfo set(
        int sType,
        long pNext,
        long flags
    ) {
        sType(sType);
        pNext(pNext);
        flags(flags);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkPipelineCreateFlags2CreateInfo set(VkPipelineCreateFlags2CreateInfo src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkPipelineCreateFlags2CreateInfo} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkPipelineCreateFlags2CreateInfo malloc() {
        return new VkPipelineCreateFlags2CreateInfo(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkPipelineCreateFlags2CreateInfo} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkPipelineCreateFlags2CreateInfo calloc() {
        return new VkPipelineCreateFlags2CreateInfo(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkPipelineCreateFlags2CreateInfo} instance allocated with {@link BufferUtils}. */
    public static VkPipelineCreateFlags2CreateInfo create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkPipelineCreateFlags2CreateInfo(memAddress(container), container);
    }

    /** Returns a new {@code VkPipelineCreateFlags2CreateInfo} instance for the specified memory address. */
    public static VkPipelineCreateFlags2CreateInfo create(long address) {
        return new VkPipelineCreateFlags2CreateInfo(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable VkPipelineCreateFlags2CreateInfo createSafe(long address) {
        return address == NULL ? null : new VkPipelineCreateFlags2CreateInfo(address, null);
    }

    /**
     * Returns a new {@link VkPipelineCreateFlags2CreateInfo.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPipelineCreateFlags2CreateInfo.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkPipelineCreateFlags2CreateInfo.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPipelineCreateFlags2CreateInfo.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPipelineCreateFlags2CreateInfo.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkPipelineCreateFlags2CreateInfo.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkPipelineCreateFlags2CreateInfo.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkPipelineCreateFlags2CreateInfo.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static VkPipelineCreateFlags2CreateInfo.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code VkPipelineCreateFlags2CreateInfo} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPipelineCreateFlags2CreateInfo malloc(MemoryStack stack) {
        return new VkPipelineCreateFlags2CreateInfo(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkPipelineCreateFlags2CreateInfo} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPipelineCreateFlags2CreateInfo calloc(MemoryStack stack) {
        return new VkPipelineCreateFlags2CreateInfo(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkPipelineCreateFlags2CreateInfo.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPipelineCreateFlags2CreateInfo.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPipelineCreateFlags2CreateInfo.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPipelineCreateFlags2CreateInfo.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return memGetInt(struct + VkPipelineCreateFlags2CreateInfo.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkPipelineCreateFlags2CreateInfo.PNEXT); }
    /** Unsafe version of {@link #flags}. */
    public static long nflags(long struct) { return memGetLong(struct + VkPipelineCreateFlags2CreateInfo.FLAGS); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { memPutInt(struct + VkPipelineCreateFlags2CreateInfo.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkPipelineCreateFlags2CreateInfo.PNEXT, value); }
    /** Unsafe version of {@link #flags(long) flags}. */
    public static void nflags(long struct, long value) { memPutLong(struct + VkPipelineCreateFlags2CreateInfo.FLAGS, value); }

    // -----------------------------------

    /** An array of {@link VkPipelineCreateFlags2CreateInfo} structs. */
    public static class Buffer extends StructBuffer<VkPipelineCreateFlags2CreateInfo, Buffer> implements NativeResource {

        private static final VkPipelineCreateFlags2CreateInfo ELEMENT_FACTORY = VkPipelineCreateFlags2CreateInfo.create(-1L);

        /**
         * Creates a new {@code VkPipelineCreateFlags2CreateInfo.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkPipelineCreateFlags2CreateInfo#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkPipelineCreateFlags2CreateInfo getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkPipelineCreateFlags2CreateInfo.nsType(address()); }
        /** @return the value of the {@code pNext} field. */
        @NativeType("void const *")
        public long pNext() { return VkPipelineCreateFlags2CreateInfo.npNext(address()); }
        /** @return the value of the {@code flags} field. */
        @NativeType("VkPipelineCreateFlags2")
        public long flags() { return VkPipelineCreateFlags2CreateInfo.nflags(address()); }

        /** Sets the specified value to the {@code sType} field. */
        public VkPipelineCreateFlags2CreateInfo.Buffer sType(@NativeType("VkStructureType") int value) { VkPipelineCreateFlags2CreateInfo.nsType(address(), value); return this; }
        /** Sets the {@link VK14#VK_STRUCTURE_TYPE_PIPELINE_CREATE_FLAGS_2_CREATE_INFO STRUCTURE_TYPE_PIPELINE_CREATE_FLAGS_2_CREATE_INFO} value to the {@code sType} field. */
        public VkPipelineCreateFlags2CreateInfo.Buffer sType$Default() { return sType(VK14.VK_STRUCTURE_TYPE_PIPELINE_CREATE_FLAGS_2_CREATE_INFO); }
        /** Sets the specified value to the {@code pNext} field. */
        public VkPipelineCreateFlags2CreateInfo.Buffer pNext(@NativeType("void const *") long value) { VkPipelineCreateFlags2CreateInfo.npNext(address(), value); return this; }
        /** Sets the specified value to the {@code flags} field. */
        public VkPipelineCreateFlags2CreateInfo.Buffer flags(@NativeType("VkPipelineCreateFlags2") long value) { VkPipelineCreateFlags2CreateInfo.nflags(address(), value); return this; }

    }

}