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
 * struct VkPhysicalDeviceFormatPackFeaturesARM {
 *     VkStructureType sType;
 *     void * pNext;
 *     VkBool32 formatPack;
 * }}</pre>
 */
public class VkPhysicalDeviceFormatPackFeaturesARM extends Struct<VkPhysicalDeviceFormatPackFeaturesARM> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        FORMATPACK;

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
        FORMATPACK = layout.offsetof(2);
    }

    protected VkPhysicalDeviceFormatPackFeaturesARM(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkPhysicalDeviceFormatPackFeaturesARM create(long address, @Nullable ByteBuffer container) {
        return new VkPhysicalDeviceFormatPackFeaturesARM(address, container);
    }

    /**
     * Creates a {@code VkPhysicalDeviceFormatPackFeaturesARM} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkPhysicalDeviceFormatPackFeaturesARM(ByteBuffer container) {
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
    /** @return the value of the {@code formatPack} field. */
    @NativeType("VkBool32")
    public boolean formatPack() { return nformatPack(address()) != 0; }

    /** Sets the specified value to the {@code sType} field. */
    public VkPhysicalDeviceFormatPackFeaturesARM sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link ARMFormatPack#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_FORMAT_PACK_FEATURES_ARM STRUCTURE_TYPE_PHYSICAL_DEVICE_FORMAT_PACK_FEATURES_ARM} value to the {@code sType} field. */
    public VkPhysicalDeviceFormatPackFeaturesARM sType$Default() { return sType(ARMFormatPack.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_FORMAT_PACK_FEATURES_ARM); }
    /** Sets the specified value to the {@code pNext} field. */
    public VkPhysicalDeviceFormatPackFeaturesARM pNext(@NativeType("void *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@code formatPack} field. */
    public VkPhysicalDeviceFormatPackFeaturesARM formatPack(@NativeType("VkBool32") boolean value) { nformatPack(address(), value ? 1 : 0); return this; }

    /** Initializes this struct with the specified values. */
    public VkPhysicalDeviceFormatPackFeaturesARM set(
        int sType,
        long pNext,
        boolean formatPack
    ) {
        sType(sType);
        pNext(pNext);
        formatPack(formatPack);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkPhysicalDeviceFormatPackFeaturesARM set(VkPhysicalDeviceFormatPackFeaturesARM src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkPhysicalDeviceFormatPackFeaturesARM} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkPhysicalDeviceFormatPackFeaturesARM malloc() {
        return new VkPhysicalDeviceFormatPackFeaturesARM(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkPhysicalDeviceFormatPackFeaturesARM} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkPhysicalDeviceFormatPackFeaturesARM calloc() {
        return new VkPhysicalDeviceFormatPackFeaturesARM(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkPhysicalDeviceFormatPackFeaturesARM} instance allocated with {@link BufferUtils}. */
    public static VkPhysicalDeviceFormatPackFeaturesARM create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkPhysicalDeviceFormatPackFeaturesARM(memAddress(container), container);
    }

    /** Returns a new {@code VkPhysicalDeviceFormatPackFeaturesARM} instance for the specified memory address. */
    public static VkPhysicalDeviceFormatPackFeaturesARM create(long address) {
        return new VkPhysicalDeviceFormatPackFeaturesARM(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable VkPhysicalDeviceFormatPackFeaturesARM createSafe(long address) {
        return address == NULL ? null : new VkPhysicalDeviceFormatPackFeaturesARM(address, null);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceFormatPackFeaturesARM.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceFormatPackFeaturesARM.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceFormatPackFeaturesARM.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceFormatPackFeaturesARM.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceFormatPackFeaturesARM.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceFormatPackFeaturesARM.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkPhysicalDeviceFormatPackFeaturesARM.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceFormatPackFeaturesARM.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static VkPhysicalDeviceFormatPackFeaturesARM.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code VkPhysicalDeviceFormatPackFeaturesARM} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDeviceFormatPackFeaturesARM malloc(MemoryStack stack) {
        return new VkPhysicalDeviceFormatPackFeaturesARM(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkPhysicalDeviceFormatPackFeaturesARM} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDeviceFormatPackFeaturesARM calloc(MemoryStack stack) {
        return new VkPhysicalDeviceFormatPackFeaturesARM(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceFormatPackFeaturesARM.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceFormatPackFeaturesARM.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceFormatPackFeaturesARM.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceFormatPackFeaturesARM.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return memGetInt(struct + VkPhysicalDeviceFormatPackFeaturesARM.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkPhysicalDeviceFormatPackFeaturesARM.PNEXT); }
    /** Unsafe version of {@link #formatPack}. */
    public static int nformatPack(long struct) { return memGetInt(struct + VkPhysicalDeviceFormatPackFeaturesARM.FORMATPACK); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { memPutInt(struct + VkPhysicalDeviceFormatPackFeaturesARM.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkPhysicalDeviceFormatPackFeaturesARM.PNEXT, value); }
    /** Unsafe version of {@link #formatPack(boolean) formatPack}. */
    public static void nformatPack(long struct, int value) { memPutInt(struct + VkPhysicalDeviceFormatPackFeaturesARM.FORMATPACK, value); }

    // -----------------------------------

    /** An array of {@link VkPhysicalDeviceFormatPackFeaturesARM} structs. */
    public static class Buffer extends StructBuffer<VkPhysicalDeviceFormatPackFeaturesARM, Buffer> implements NativeResource {

        private static final VkPhysicalDeviceFormatPackFeaturesARM ELEMENT_FACTORY = VkPhysicalDeviceFormatPackFeaturesARM.create(-1L);

        /**
         * Creates a new {@code VkPhysicalDeviceFormatPackFeaturesARM.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkPhysicalDeviceFormatPackFeaturesARM#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkPhysicalDeviceFormatPackFeaturesARM getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkPhysicalDeviceFormatPackFeaturesARM.nsType(address()); }
        /** @return the value of the {@code pNext} field. */
        @NativeType("void *")
        public long pNext() { return VkPhysicalDeviceFormatPackFeaturesARM.npNext(address()); }
        /** @return the value of the {@code formatPack} field. */
        @NativeType("VkBool32")
        public boolean formatPack() { return VkPhysicalDeviceFormatPackFeaturesARM.nformatPack(address()) != 0; }

        /** Sets the specified value to the {@code sType} field. */
        public VkPhysicalDeviceFormatPackFeaturesARM.Buffer sType(@NativeType("VkStructureType") int value) { VkPhysicalDeviceFormatPackFeaturesARM.nsType(address(), value); return this; }
        /** Sets the {@link ARMFormatPack#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_FORMAT_PACK_FEATURES_ARM STRUCTURE_TYPE_PHYSICAL_DEVICE_FORMAT_PACK_FEATURES_ARM} value to the {@code sType} field. */
        public VkPhysicalDeviceFormatPackFeaturesARM.Buffer sType$Default() { return sType(ARMFormatPack.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_FORMAT_PACK_FEATURES_ARM); }
        /** Sets the specified value to the {@code pNext} field. */
        public VkPhysicalDeviceFormatPackFeaturesARM.Buffer pNext(@NativeType("void *") long value) { VkPhysicalDeviceFormatPackFeaturesARM.npNext(address(), value); return this; }
        /** Sets the specified value to the {@code formatPack} field. */
        public VkPhysicalDeviceFormatPackFeaturesARM.Buffer formatPack(@NativeType("VkBool32") boolean value) { VkPhysicalDeviceFormatPackFeaturesARM.nformatPack(address(), value ? 1 : 0); return this; }

    }

}