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
 * struct VkSamplerReductionModeCreateInfo {
 *     VkStructureType sType;
 *     void const * pNext;
 *     VkSamplerReductionMode reductionMode;
 * }}</pre>
 */
public class VkSamplerReductionModeCreateInfo extends Struct<VkSamplerReductionModeCreateInfo> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        REDUCTIONMODE;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        REDUCTIONMODE = layout.offsetof(2);
    }

    protected VkSamplerReductionModeCreateInfo(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkSamplerReductionModeCreateInfo create(long address, @Nullable ByteBuffer container) {
        return new VkSamplerReductionModeCreateInfo(address, container);
    }

    /**
     * Creates a {@code VkSamplerReductionModeCreateInfo} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkSamplerReductionModeCreateInfo(ByteBuffer container) {
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
    /** @return the value of the {@code reductionMode} field. */
    @NativeType("VkSamplerReductionMode")
    public int reductionMode() { return nreductionMode(address()); }

    /** Sets the specified value to the {@code sType} field. */
    public VkSamplerReductionModeCreateInfo sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link VK12#VK_STRUCTURE_TYPE_SAMPLER_REDUCTION_MODE_CREATE_INFO STRUCTURE_TYPE_SAMPLER_REDUCTION_MODE_CREATE_INFO} value to the {@code sType} field. */
    public VkSamplerReductionModeCreateInfo sType$Default() { return sType(VK12.VK_STRUCTURE_TYPE_SAMPLER_REDUCTION_MODE_CREATE_INFO); }
    /** Sets the specified value to the {@code pNext} field. */
    public VkSamplerReductionModeCreateInfo pNext(@NativeType("void const *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@code reductionMode} field. */
    public VkSamplerReductionModeCreateInfo reductionMode(@NativeType("VkSamplerReductionMode") int value) { nreductionMode(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkSamplerReductionModeCreateInfo set(
        int sType,
        long pNext,
        int reductionMode
    ) {
        sType(sType);
        pNext(pNext);
        reductionMode(reductionMode);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkSamplerReductionModeCreateInfo set(VkSamplerReductionModeCreateInfo src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkSamplerReductionModeCreateInfo} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkSamplerReductionModeCreateInfo malloc() {
        return new VkSamplerReductionModeCreateInfo(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkSamplerReductionModeCreateInfo} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkSamplerReductionModeCreateInfo calloc() {
        return new VkSamplerReductionModeCreateInfo(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkSamplerReductionModeCreateInfo} instance allocated with {@link BufferUtils}. */
    public static VkSamplerReductionModeCreateInfo create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkSamplerReductionModeCreateInfo(memAddress(container), container);
    }

    /** Returns a new {@code VkSamplerReductionModeCreateInfo} instance for the specified memory address. */
    public static VkSamplerReductionModeCreateInfo create(long address) {
        return new VkSamplerReductionModeCreateInfo(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable VkSamplerReductionModeCreateInfo createSafe(long address) {
        return address == NULL ? null : new VkSamplerReductionModeCreateInfo(address, null);
    }

    /**
     * Returns a new {@link VkSamplerReductionModeCreateInfo.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkSamplerReductionModeCreateInfo.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkSamplerReductionModeCreateInfo.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkSamplerReductionModeCreateInfo.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkSamplerReductionModeCreateInfo.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkSamplerReductionModeCreateInfo.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkSamplerReductionModeCreateInfo.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkSamplerReductionModeCreateInfo.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static VkSamplerReductionModeCreateInfo.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code VkSamplerReductionModeCreateInfo} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkSamplerReductionModeCreateInfo malloc(MemoryStack stack) {
        return new VkSamplerReductionModeCreateInfo(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkSamplerReductionModeCreateInfo} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkSamplerReductionModeCreateInfo calloc(MemoryStack stack) {
        return new VkSamplerReductionModeCreateInfo(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkSamplerReductionModeCreateInfo.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkSamplerReductionModeCreateInfo.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkSamplerReductionModeCreateInfo.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkSamplerReductionModeCreateInfo.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return memGetInt(struct + VkSamplerReductionModeCreateInfo.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkSamplerReductionModeCreateInfo.PNEXT); }
    /** Unsafe version of {@link #reductionMode}. */
    public static int nreductionMode(long struct) { return memGetInt(struct + VkSamplerReductionModeCreateInfo.REDUCTIONMODE); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { memPutInt(struct + VkSamplerReductionModeCreateInfo.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkSamplerReductionModeCreateInfo.PNEXT, value); }
    /** Unsafe version of {@link #reductionMode(int) reductionMode}. */
    public static void nreductionMode(long struct, int value) { memPutInt(struct + VkSamplerReductionModeCreateInfo.REDUCTIONMODE, value); }

    // -----------------------------------

    /** An array of {@link VkSamplerReductionModeCreateInfo} structs. */
    public static class Buffer extends StructBuffer<VkSamplerReductionModeCreateInfo, Buffer> implements NativeResource {

        private static final VkSamplerReductionModeCreateInfo ELEMENT_FACTORY = VkSamplerReductionModeCreateInfo.create(-1L);

        /**
         * Creates a new {@code VkSamplerReductionModeCreateInfo.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkSamplerReductionModeCreateInfo#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkSamplerReductionModeCreateInfo getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkSamplerReductionModeCreateInfo.nsType(address()); }
        /** @return the value of the {@code pNext} field. */
        @NativeType("void const *")
        public long pNext() { return VkSamplerReductionModeCreateInfo.npNext(address()); }
        /** @return the value of the {@code reductionMode} field. */
        @NativeType("VkSamplerReductionMode")
        public int reductionMode() { return VkSamplerReductionModeCreateInfo.nreductionMode(address()); }

        /** Sets the specified value to the {@code sType} field. */
        public VkSamplerReductionModeCreateInfo.Buffer sType(@NativeType("VkStructureType") int value) { VkSamplerReductionModeCreateInfo.nsType(address(), value); return this; }
        /** Sets the {@link VK12#VK_STRUCTURE_TYPE_SAMPLER_REDUCTION_MODE_CREATE_INFO STRUCTURE_TYPE_SAMPLER_REDUCTION_MODE_CREATE_INFO} value to the {@code sType} field. */
        public VkSamplerReductionModeCreateInfo.Buffer sType$Default() { return sType(VK12.VK_STRUCTURE_TYPE_SAMPLER_REDUCTION_MODE_CREATE_INFO); }
        /** Sets the specified value to the {@code pNext} field. */
        public VkSamplerReductionModeCreateInfo.Buffer pNext(@NativeType("void const *") long value) { VkSamplerReductionModeCreateInfo.npNext(address(), value); return this; }
        /** Sets the specified value to the {@code reductionMode} field. */
        public VkSamplerReductionModeCreateInfo.Buffer reductionMode(@NativeType("VkSamplerReductionMode") int value) { VkSamplerReductionModeCreateInfo.nreductionMode(address(), value); return this; }

    }

}