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
 * struct VkPhysicalDeviceRenderPassStripedPropertiesARM {
 *     VkStructureType sType;
 *     void * pNext;
 *     {@link VkExtent2D VkExtent2D} renderPassStripeGranularity;
 *     uint32_t maxRenderPassStripes;
 * }}</pre>
 */
public class VkPhysicalDeviceRenderPassStripedPropertiesARM extends Struct<VkPhysicalDeviceRenderPassStripedPropertiesARM> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        RENDERPASSSTRIPEGRANULARITY,
        MAXRENDERPASSSTRIPES;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(VkExtent2D.SIZEOF, VkExtent2D.ALIGNOF),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        RENDERPASSSTRIPEGRANULARITY = layout.offsetof(2);
        MAXRENDERPASSSTRIPES = layout.offsetof(3);
    }

    protected VkPhysicalDeviceRenderPassStripedPropertiesARM(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkPhysicalDeviceRenderPassStripedPropertiesARM create(long address, @Nullable ByteBuffer container) {
        return new VkPhysicalDeviceRenderPassStripedPropertiesARM(address, container);
    }

    /**
     * Creates a {@code VkPhysicalDeviceRenderPassStripedPropertiesARM} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkPhysicalDeviceRenderPassStripedPropertiesARM(ByteBuffer container) {
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
    /** @return a {@link VkExtent2D} view of the {@code renderPassStripeGranularity} field. */
    public VkExtent2D renderPassStripeGranularity() { return nrenderPassStripeGranularity(address()); }
    /** @return the value of the {@code maxRenderPassStripes} field. */
    @NativeType("uint32_t")
    public int maxRenderPassStripes() { return nmaxRenderPassStripes(address()); }

    /** Sets the specified value to the {@code sType} field. */
    public VkPhysicalDeviceRenderPassStripedPropertiesARM sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link ARMRenderPassStriped#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_RENDER_PASS_STRIPED_PROPERTIES_ARM STRUCTURE_TYPE_PHYSICAL_DEVICE_RENDER_PASS_STRIPED_PROPERTIES_ARM} value to the {@code sType} field. */
    public VkPhysicalDeviceRenderPassStripedPropertiesARM sType$Default() { return sType(ARMRenderPassStriped.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_RENDER_PASS_STRIPED_PROPERTIES_ARM); }
    /** Sets the specified value to the {@code pNext} field. */
    public VkPhysicalDeviceRenderPassStripedPropertiesARM pNext(@NativeType("void *") long value) { npNext(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkPhysicalDeviceRenderPassStripedPropertiesARM set(
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
    public VkPhysicalDeviceRenderPassStripedPropertiesARM set(VkPhysicalDeviceRenderPassStripedPropertiesARM src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkPhysicalDeviceRenderPassStripedPropertiesARM} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkPhysicalDeviceRenderPassStripedPropertiesARM malloc() {
        return new VkPhysicalDeviceRenderPassStripedPropertiesARM(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkPhysicalDeviceRenderPassStripedPropertiesARM} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkPhysicalDeviceRenderPassStripedPropertiesARM calloc() {
        return new VkPhysicalDeviceRenderPassStripedPropertiesARM(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkPhysicalDeviceRenderPassStripedPropertiesARM} instance allocated with {@link BufferUtils}. */
    public static VkPhysicalDeviceRenderPassStripedPropertiesARM create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkPhysicalDeviceRenderPassStripedPropertiesARM(memAddress(container), container);
    }

    /** Returns a new {@code VkPhysicalDeviceRenderPassStripedPropertiesARM} instance for the specified memory address. */
    public static VkPhysicalDeviceRenderPassStripedPropertiesARM create(long address) {
        return new VkPhysicalDeviceRenderPassStripedPropertiesARM(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable VkPhysicalDeviceRenderPassStripedPropertiesARM createSafe(long address) {
        return address == NULL ? null : new VkPhysicalDeviceRenderPassStripedPropertiesARM(address, null);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceRenderPassStripedPropertiesARM.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceRenderPassStripedPropertiesARM.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceRenderPassStripedPropertiesARM.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceRenderPassStripedPropertiesARM.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceRenderPassStripedPropertiesARM.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceRenderPassStripedPropertiesARM.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkPhysicalDeviceRenderPassStripedPropertiesARM.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceRenderPassStripedPropertiesARM.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static VkPhysicalDeviceRenderPassStripedPropertiesARM.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code VkPhysicalDeviceRenderPassStripedPropertiesARM} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDeviceRenderPassStripedPropertiesARM malloc(MemoryStack stack) {
        return new VkPhysicalDeviceRenderPassStripedPropertiesARM(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkPhysicalDeviceRenderPassStripedPropertiesARM} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDeviceRenderPassStripedPropertiesARM calloc(MemoryStack stack) {
        return new VkPhysicalDeviceRenderPassStripedPropertiesARM(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceRenderPassStripedPropertiesARM.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceRenderPassStripedPropertiesARM.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceRenderPassStripedPropertiesARM.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceRenderPassStripedPropertiesARM.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return memGetInt(struct + VkPhysicalDeviceRenderPassStripedPropertiesARM.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkPhysicalDeviceRenderPassStripedPropertiesARM.PNEXT); }
    /** Unsafe version of {@link #renderPassStripeGranularity}. */
    public static VkExtent2D nrenderPassStripeGranularity(long struct) { return VkExtent2D.create(struct + VkPhysicalDeviceRenderPassStripedPropertiesARM.RENDERPASSSTRIPEGRANULARITY); }
    /** Unsafe version of {@link #maxRenderPassStripes}. */
    public static int nmaxRenderPassStripes(long struct) { return memGetInt(struct + VkPhysicalDeviceRenderPassStripedPropertiesARM.MAXRENDERPASSSTRIPES); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { memPutInt(struct + VkPhysicalDeviceRenderPassStripedPropertiesARM.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkPhysicalDeviceRenderPassStripedPropertiesARM.PNEXT, value); }

    // -----------------------------------

    /** An array of {@link VkPhysicalDeviceRenderPassStripedPropertiesARM} structs. */
    public static class Buffer extends StructBuffer<VkPhysicalDeviceRenderPassStripedPropertiesARM, Buffer> implements NativeResource {

        private static final VkPhysicalDeviceRenderPassStripedPropertiesARM ELEMENT_FACTORY = VkPhysicalDeviceRenderPassStripedPropertiesARM.create(-1L);

        /**
         * Creates a new {@code VkPhysicalDeviceRenderPassStripedPropertiesARM.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkPhysicalDeviceRenderPassStripedPropertiesARM#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkPhysicalDeviceRenderPassStripedPropertiesARM getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkPhysicalDeviceRenderPassStripedPropertiesARM.nsType(address()); }
        /** @return the value of the {@code pNext} field. */
        @NativeType("void *")
        public long pNext() { return VkPhysicalDeviceRenderPassStripedPropertiesARM.npNext(address()); }
        /** @return a {@link VkExtent2D} view of the {@code renderPassStripeGranularity} field. */
        public VkExtent2D renderPassStripeGranularity() { return VkPhysicalDeviceRenderPassStripedPropertiesARM.nrenderPassStripeGranularity(address()); }
        /** @return the value of the {@code maxRenderPassStripes} field. */
        @NativeType("uint32_t")
        public int maxRenderPassStripes() { return VkPhysicalDeviceRenderPassStripedPropertiesARM.nmaxRenderPassStripes(address()); }

        /** Sets the specified value to the {@code sType} field. */
        public VkPhysicalDeviceRenderPassStripedPropertiesARM.Buffer sType(@NativeType("VkStructureType") int value) { VkPhysicalDeviceRenderPassStripedPropertiesARM.nsType(address(), value); return this; }
        /** Sets the {@link ARMRenderPassStriped#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_RENDER_PASS_STRIPED_PROPERTIES_ARM STRUCTURE_TYPE_PHYSICAL_DEVICE_RENDER_PASS_STRIPED_PROPERTIES_ARM} value to the {@code sType} field. */
        public VkPhysicalDeviceRenderPassStripedPropertiesARM.Buffer sType$Default() { return sType(ARMRenderPassStriped.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_RENDER_PASS_STRIPED_PROPERTIES_ARM); }
        /** Sets the specified value to the {@code pNext} field. */
        public VkPhysicalDeviceRenderPassStripedPropertiesARM.Buffer pNext(@NativeType("void *") long value) { VkPhysicalDeviceRenderPassStripedPropertiesARM.npNext(address(), value); return this; }

    }

}