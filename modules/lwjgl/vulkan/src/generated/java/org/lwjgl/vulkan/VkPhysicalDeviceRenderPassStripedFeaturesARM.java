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
 * struct VkPhysicalDeviceRenderPassStripedFeaturesARM {
 *     VkStructureType sType;
 *     void * pNext;
 *     VkBool32 renderPassStriped;
 * }}</pre>
 */
public class VkPhysicalDeviceRenderPassStripedFeaturesARM extends Struct<VkPhysicalDeviceRenderPassStripedFeaturesARM> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        RENDERPASSSTRIPED;

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
        RENDERPASSSTRIPED = layout.offsetof(2);
    }

    protected VkPhysicalDeviceRenderPassStripedFeaturesARM(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkPhysicalDeviceRenderPassStripedFeaturesARM create(long address, @Nullable ByteBuffer container) {
        return new VkPhysicalDeviceRenderPassStripedFeaturesARM(address, container);
    }

    /**
     * Creates a {@code VkPhysicalDeviceRenderPassStripedFeaturesARM} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkPhysicalDeviceRenderPassStripedFeaturesARM(ByteBuffer container) {
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
    /** @return the value of the {@code renderPassStriped} field. */
    @NativeType("VkBool32")
    public boolean renderPassStriped() { return nrenderPassStriped(address()) != 0; }

    /** Sets the specified value to the {@code sType} field. */
    public VkPhysicalDeviceRenderPassStripedFeaturesARM sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link ARMRenderPassStriped#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_RENDER_PASS_STRIPED_FEATURES_ARM STRUCTURE_TYPE_PHYSICAL_DEVICE_RENDER_PASS_STRIPED_FEATURES_ARM} value to the {@code sType} field. */
    public VkPhysicalDeviceRenderPassStripedFeaturesARM sType$Default() { return sType(ARMRenderPassStriped.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_RENDER_PASS_STRIPED_FEATURES_ARM); }
    /** Sets the specified value to the {@code pNext} field. */
    public VkPhysicalDeviceRenderPassStripedFeaturesARM pNext(@NativeType("void *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@code renderPassStriped} field. */
    public VkPhysicalDeviceRenderPassStripedFeaturesARM renderPassStriped(@NativeType("VkBool32") boolean value) { nrenderPassStriped(address(), value ? 1 : 0); return this; }

    /** Initializes this struct with the specified values. */
    public VkPhysicalDeviceRenderPassStripedFeaturesARM set(
        int sType,
        long pNext,
        boolean renderPassStriped
    ) {
        sType(sType);
        pNext(pNext);
        renderPassStriped(renderPassStriped);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkPhysicalDeviceRenderPassStripedFeaturesARM set(VkPhysicalDeviceRenderPassStripedFeaturesARM src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkPhysicalDeviceRenderPassStripedFeaturesARM} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkPhysicalDeviceRenderPassStripedFeaturesARM malloc() {
        return new VkPhysicalDeviceRenderPassStripedFeaturesARM(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkPhysicalDeviceRenderPassStripedFeaturesARM} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkPhysicalDeviceRenderPassStripedFeaturesARM calloc() {
        return new VkPhysicalDeviceRenderPassStripedFeaturesARM(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkPhysicalDeviceRenderPassStripedFeaturesARM} instance allocated with {@link BufferUtils}. */
    public static VkPhysicalDeviceRenderPassStripedFeaturesARM create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkPhysicalDeviceRenderPassStripedFeaturesARM(memAddress(container), container);
    }

    /** Returns a new {@code VkPhysicalDeviceRenderPassStripedFeaturesARM} instance for the specified memory address. */
    public static VkPhysicalDeviceRenderPassStripedFeaturesARM create(long address) {
        return new VkPhysicalDeviceRenderPassStripedFeaturesARM(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable VkPhysicalDeviceRenderPassStripedFeaturesARM createSafe(long address) {
        return address == NULL ? null : new VkPhysicalDeviceRenderPassStripedFeaturesARM(address, null);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceRenderPassStripedFeaturesARM.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceRenderPassStripedFeaturesARM.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceRenderPassStripedFeaturesARM.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceRenderPassStripedFeaturesARM.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceRenderPassStripedFeaturesARM.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceRenderPassStripedFeaturesARM.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkPhysicalDeviceRenderPassStripedFeaturesARM.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceRenderPassStripedFeaturesARM.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static VkPhysicalDeviceRenderPassStripedFeaturesARM.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code VkPhysicalDeviceRenderPassStripedFeaturesARM} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDeviceRenderPassStripedFeaturesARM malloc(MemoryStack stack) {
        return new VkPhysicalDeviceRenderPassStripedFeaturesARM(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkPhysicalDeviceRenderPassStripedFeaturesARM} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDeviceRenderPassStripedFeaturesARM calloc(MemoryStack stack) {
        return new VkPhysicalDeviceRenderPassStripedFeaturesARM(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceRenderPassStripedFeaturesARM.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceRenderPassStripedFeaturesARM.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceRenderPassStripedFeaturesARM.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceRenderPassStripedFeaturesARM.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return memGetInt(struct + VkPhysicalDeviceRenderPassStripedFeaturesARM.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkPhysicalDeviceRenderPassStripedFeaturesARM.PNEXT); }
    /** Unsafe version of {@link #renderPassStriped}. */
    public static int nrenderPassStriped(long struct) { return memGetInt(struct + VkPhysicalDeviceRenderPassStripedFeaturesARM.RENDERPASSSTRIPED); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { memPutInt(struct + VkPhysicalDeviceRenderPassStripedFeaturesARM.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkPhysicalDeviceRenderPassStripedFeaturesARM.PNEXT, value); }
    /** Unsafe version of {@link #renderPassStriped(boolean) renderPassStriped}. */
    public static void nrenderPassStriped(long struct, int value) { memPutInt(struct + VkPhysicalDeviceRenderPassStripedFeaturesARM.RENDERPASSSTRIPED, value); }

    // -----------------------------------

    /** An array of {@link VkPhysicalDeviceRenderPassStripedFeaturesARM} structs. */
    public static class Buffer extends StructBuffer<VkPhysicalDeviceRenderPassStripedFeaturesARM, Buffer> implements NativeResource {

        private static final VkPhysicalDeviceRenderPassStripedFeaturesARM ELEMENT_FACTORY = VkPhysicalDeviceRenderPassStripedFeaturesARM.create(-1L);

        /**
         * Creates a new {@code VkPhysicalDeviceRenderPassStripedFeaturesARM.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkPhysicalDeviceRenderPassStripedFeaturesARM#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkPhysicalDeviceRenderPassStripedFeaturesARM getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkPhysicalDeviceRenderPassStripedFeaturesARM.nsType(address()); }
        /** @return the value of the {@code pNext} field. */
        @NativeType("void *")
        public long pNext() { return VkPhysicalDeviceRenderPassStripedFeaturesARM.npNext(address()); }
        /** @return the value of the {@code renderPassStriped} field. */
        @NativeType("VkBool32")
        public boolean renderPassStriped() { return VkPhysicalDeviceRenderPassStripedFeaturesARM.nrenderPassStriped(address()) != 0; }

        /** Sets the specified value to the {@code sType} field. */
        public VkPhysicalDeviceRenderPassStripedFeaturesARM.Buffer sType(@NativeType("VkStructureType") int value) { VkPhysicalDeviceRenderPassStripedFeaturesARM.nsType(address(), value); return this; }
        /** Sets the {@link ARMRenderPassStriped#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_RENDER_PASS_STRIPED_FEATURES_ARM STRUCTURE_TYPE_PHYSICAL_DEVICE_RENDER_PASS_STRIPED_FEATURES_ARM} value to the {@code sType} field. */
        public VkPhysicalDeviceRenderPassStripedFeaturesARM.Buffer sType$Default() { return sType(ARMRenderPassStriped.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_RENDER_PASS_STRIPED_FEATURES_ARM); }
        /** Sets the specified value to the {@code pNext} field. */
        public VkPhysicalDeviceRenderPassStripedFeaturesARM.Buffer pNext(@NativeType("void *") long value) { VkPhysicalDeviceRenderPassStripedFeaturesARM.npNext(address(), value); return this; }
        /** Sets the specified value to the {@code renderPassStriped} field. */
        public VkPhysicalDeviceRenderPassStripedFeaturesARM.Buffer renderPassStriped(@NativeType("VkBool32") boolean value) { VkPhysicalDeviceRenderPassStripedFeaturesARM.nrenderPassStriped(address(), value ? 1 : 0); return this; }

    }

}