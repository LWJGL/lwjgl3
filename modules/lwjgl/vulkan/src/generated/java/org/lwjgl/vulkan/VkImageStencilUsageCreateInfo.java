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
 * struct VkImageStencilUsageCreateInfo {
 *     VkStructureType sType;
 *     void const * pNext;
 *     VkImageUsageFlags stencilUsage;
 * }}</pre>
 */
public class VkImageStencilUsageCreateInfo extends Struct<VkImageStencilUsageCreateInfo> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        STENCILUSAGE;

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
        STENCILUSAGE = layout.offsetof(2);
    }

    protected VkImageStencilUsageCreateInfo(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkImageStencilUsageCreateInfo create(long address, @Nullable ByteBuffer container) {
        return new VkImageStencilUsageCreateInfo(address, container);
    }

    /**
     * Creates a {@code VkImageStencilUsageCreateInfo} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkImageStencilUsageCreateInfo(ByteBuffer container) {
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
    /** @return the value of the {@code stencilUsage} field. */
    @NativeType("VkImageUsageFlags")
    public int stencilUsage() { return nstencilUsage(address()); }

    /** Sets the specified value to the {@code sType} field. */
    public VkImageStencilUsageCreateInfo sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link VK12#VK_STRUCTURE_TYPE_IMAGE_STENCIL_USAGE_CREATE_INFO STRUCTURE_TYPE_IMAGE_STENCIL_USAGE_CREATE_INFO} value to the {@code sType} field. */
    public VkImageStencilUsageCreateInfo sType$Default() { return sType(VK12.VK_STRUCTURE_TYPE_IMAGE_STENCIL_USAGE_CREATE_INFO); }
    /** Sets the specified value to the {@code pNext} field. */
    public VkImageStencilUsageCreateInfo pNext(@NativeType("void const *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@code stencilUsage} field. */
    public VkImageStencilUsageCreateInfo stencilUsage(@NativeType("VkImageUsageFlags") int value) { nstencilUsage(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkImageStencilUsageCreateInfo set(
        int sType,
        long pNext,
        int stencilUsage
    ) {
        sType(sType);
        pNext(pNext);
        stencilUsage(stencilUsage);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkImageStencilUsageCreateInfo set(VkImageStencilUsageCreateInfo src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkImageStencilUsageCreateInfo} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkImageStencilUsageCreateInfo malloc() {
        return new VkImageStencilUsageCreateInfo(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkImageStencilUsageCreateInfo} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkImageStencilUsageCreateInfo calloc() {
        return new VkImageStencilUsageCreateInfo(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkImageStencilUsageCreateInfo} instance allocated with {@link BufferUtils}. */
    public static VkImageStencilUsageCreateInfo create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkImageStencilUsageCreateInfo(memAddress(container), container);
    }

    /** Returns a new {@code VkImageStencilUsageCreateInfo} instance for the specified memory address. */
    public static VkImageStencilUsageCreateInfo create(long address) {
        return new VkImageStencilUsageCreateInfo(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable VkImageStencilUsageCreateInfo createSafe(long address) {
        return address == NULL ? null : new VkImageStencilUsageCreateInfo(address, null);
    }

    /**
     * Returns a new {@link VkImageStencilUsageCreateInfo.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkImageStencilUsageCreateInfo.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkImageStencilUsageCreateInfo.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkImageStencilUsageCreateInfo.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkImageStencilUsageCreateInfo.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkImageStencilUsageCreateInfo.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkImageStencilUsageCreateInfo.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkImageStencilUsageCreateInfo.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static VkImageStencilUsageCreateInfo.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code VkImageStencilUsageCreateInfo} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkImageStencilUsageCreateInfo malloc(MemoryStack stack) {
        return new VkImageStencilUsageCreateInfo(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkImageStencilUsageCreateInfo} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkImageStencilUsageCreateInfo calloc(MemoryStack stack) {
        return new VkImageStencilUsageCreateInfo(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkImageStencilUsageCreateInfo.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkImageStencilUsageCreateInfo.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkImageStencilUsageCreateInfo.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkImageStencilUsageCreateInfo.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return memGetInt(struct + VkImageStencilUsageCreateInfo.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkImageStencilUsageCreateInfo.PNEXT); }
    /** Unsafe version of {@link #stencilUsage}. */
    public static int nstencilUsage(long struct) { return memGetInt(struct + VkImageStencilUsageCreateInfo.STENCILUSAGE); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { memPutInt(struct + VkImageStencilUsageCreateInfo.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkImageStencilUsageCreateInfo.PNEXT, value); }
    /** Unsafe version of {@link #stencilUsage(int) stencilUsage}. */
    public static void nstencilUsage(long struct, int value) { memPutInt(struct + VkImageStencilUsageCreateInfo.STENCILUSAGE, value); }

    // -----------------------------------

    /** An array of {@link VkImageStencilUsageCreateInfo} structs. */
    public static class Buffer extends StructBuffer<VkImageStencilUsageCreateInfo, Buffer> implements NativeResource {

        private static final VkImageStencilUsageCreateInfo ELEMENT_FACTORY = VkImageStencilUsageCreateInfo.create(-1L);

        /**
         * Creates a new {@code VkImageStencilUsageCreateInfo.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkImageStencilUsageCreateInfo#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkImageStencilUsageCreateInfo getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkImageStencilUsageCreateInfo.nsType(address()); }
        /** @return the value of the {@code pNext} field. */
        @NativeType("void const *")
        public long pNext() { return VkImageStencilUsageCreateInfo.npNext(address()); }
        /** @return the value of the {@code stencilUsage} field. */
        @NativeType("VkImageUsageFlags")
        public int stencilUsage() { return VkImageStencilUsageCreateInfo.nstencilUsage(address()); }

        /** Sets the specified value to the {@code sType} field. */
        public VkImageStencilUsageCreateInfo.Buffer sType(@NativeType("VkStructureType") int value) { VkImageStencilUsageCreateInfo.nsType(address(), value); return this; }
        /** Sets the {@link VK12#VK_STRUCTURE_TYPE_IMAGE_STENCIL_USAGE_CREATE_INFO STRUCTURE_TYPE_IMAGE_STENCIL_USAGE_CREATE_INFO} value to the {@code sType} field. */
        public VkImageStencilUsageCreateInfo.Buffer sType$Default() { return sType(VK12.VK_STRUCTURE_TYPE_IMAGE_STENCIL_USAGE_CREATE_INFO); }
        /** Sets the specified value to the {@code pNext} field. */
        public VkImageStencilUsageCreateInfo.Buffer pNext(@NativeType("void const *") long value) { VkImageStencilUsageCreateInfo.npNext(address(), value); return this; }
        /** Sets the specified value to the {@code stencilUsage} field. */
        public VkImageStencilUsageCreateInfo.Buffer stencilUsage(@NativeType("VkImageUsageFlags") int value) { VkImageStencilUsageCreateInfo.nstencilUsage(address(), value); return this; }

    }

}