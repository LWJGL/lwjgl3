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
 * struct VkPhysicalDevicePrivateDataFeatures {
 *     VkStructureType sType;
 *     void * pNext;
 *     VkBool32 privateData;
 * }}</pre>
 */
public class VkPhysicalDevicePrivateDataFeatures extends Struct<VkPhysicalDevicePrivateDataFeatures> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        PRIVATEDATA;

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
        PRIVATEDATA = layout.offsetof(2);
    }

    protected VkPhysicalDevicePrivateDataFeatures(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkPhysicalDevicePrivateDataFeatures create(long address, @Nullable ByteBuffer container) {
        return new VkPhysicalDevicePrivateDataFeatures(address, container);
    }

    /**
     * Creates a {@code VkPhysicalDevicePrivateDataFeatures} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkPhysicalDevicePrivateDataFeatures(ByteBuffer container) {
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
    /** @return the value of the {@code privateData} field. */
    @NativeType("VkBool32")
    public boolean privateData() { return nprivateData(address()) != 0; }

    /** Sets the specified value to the {@code sType} field. */
    public VkPhysicalDevicePrivateDataFeatures sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link VK13#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_PRIVATE_DATA_FEATURES STRUCTURE_TYPE_PHYSICAL_DEVICE_PRIVATE_DATA_FEATURES} value to the {@code sType} field. */
    public VkPhysicalDevicePrivateDataFeatures sType$Default() { return sType(VK13.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_PRIVATE_DATA_FEATURES); }
    /** Sets the specified value to the {@code pNext} field. */
    public VkPhysicalDevicePrivateDataFeatures pNext(@NativeType("void *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@code privateData} field. */
    public VkPhysicalDevicePrivateDataFeatures privateData(@NativeType("VkBool32") boolean value) { nprivateData(address(), value ? 1 : 0); return this; }

    /** Initializes this struct with the specified values. */
    public VkPhysicalDevicePrivateDataFeatures set(
        int sType,
        long pNext,
        boolean privateData
    ) {
        sType(sType);
        pNext(pNext);
        privateData(privateData);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkPhysicalDevicePrivateDataFeatures set(VkPhysicalDevicePrivateDataFeatures src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkPhysicalDevicePrivateDataFeatures} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkPhysicalDevicePrivateDataFeatures malloc() {
        return new VkPhysicalDevicePrivateDataFeatures(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkPhysicalDevicePrivateDataFeatures} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkPhysicalDevicePrivateDataFeatures calloc() {
        return new VkPhysicalDevicePrivateDataFeatures(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkPhysicalDevicePrivateDataFeatures} instance allocated with {@link BufferUtils}. */
    public static VkPhysicalDevicePrivateDataFeatures create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkPhysicalDevicePrivateDataFeatures(memAddress(container), container);
    }

    /** Returns a new {@code VkPhysicalDevicePrivateDataFeatures} instance for the specified memory address. */
    public static VkPhysicalDevicePrivateDataFeatures create(long address) {
        return new VkPhysicalDevicePrivateDataFeatures(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable VkPhysicalDevicePrivateDataFeatures createSafe(long address) {
        return address == NULL ? null : new VkPhysicalDevicePrivateDataFeatures(address, null);
    }

    /**
     * Returns a new {@link VkPhysicalDevicePrivateDataFeatures.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDevicePrivateDataFeatures.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDevicePrivateDataFeatures.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDevicePrivateDataFeatures.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDevicePrivateDataFeatures.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDevicePrivateDataFeatures.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkPhysicalDevicePrivateDataFeatures.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDevicePrivateDataFeatures.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static VkPhysicalDevicePrivateDataFeatures.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code VkPhysicalDevicePrivateDataFeatures} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDevicePrivateDataFeatures malloc(MemoryStack stack) {
        return new VkPhysicalDevicePrivateDataFeatures(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkPhysicalDevicePrivateDataFeatures} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDevicePrivateDataFeatures calloc(MemoryStack stack) {
        return new VkPhysicalDevicePrivateDataFeatures(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkPhysicalDevicePrivateDataFeatures.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDevicePrivateDataFeatures.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDevicePrivateDataFeatures.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDevicePrivateDataFeatures.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return memGetInt(struct + VkPhysicalDevicePrivateDataFeatures.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkPhysicalDevicePrivateDataFeatures.PNEXT); }
    /** Unsafe version of {@link #privateData}. */
    public static int nprivateData(long struct) { return memGetInt(struct + VkPhysicalDevicePrivateDataFeatures.PRIVATEDATA); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { memPutInt(struct + VkPhysicalDevicePrivateDataFeatures.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkPhysicalDevicePrivateDataFeatures.PNEXT, value); }
    /** Unsafe version of {@link #privateData(boolean) privateData}. */
    public static void nprivateData(long struct, int value) { memPutInt(struct + VkPhysicalDevicePrivateDataFeatures.PRIVATEDATA, value); }

    // -----------------------------------

    /** An array of {@link VkPhysicalDevicePrivateDataFeatures} structs. */
    public static class Buffer extends StructBuffer<VkPhysicalDevicePrivateDataFeatures, Buffer> implements NativeResource {

        private static final VkPhysicalDevicePrivateDataFeatures ELEMENT_FACTORY = VkPhysicalDevicePrivateDataFeatures.create(-1L);

        /**
         * Creates a new {@code VkPhysicalDevicePrivateDataFeatures.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkPhysicalDevicePrivateDataFeatures#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkPhysicalDevicePrivateDataFeatures getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkPhysicalDevicePrivateDataFeatures.nsType(address()); }
        /** @return the value of the {@code pNext} field. */
        @NativeType("void *")
        public long pNext() { return VkPhysicalDevicePrivateDataFeatures.npNext(address()); }
        /** @return the value of the {@code privateData} field. */
        @NativeType("VkBool32")
        public boolean privateData() { return VkPhysicalDevicePrivateDataFeatures.nprivateData(address()) != 0; }

        /** Sets the specified value to the {@code sType} field. */
        public VkPhysicalDevicePrivateDataFeatures.Buffer sType(@NativeType("VkStructureType") int value) { VkPhysicalDevicePrivateDataFeatures.nsType(address(), value); return this; }
        /** Sets the {@link VK13#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_PRIVATE_DATA_FEATURES STRUCTURE_TYPE_PHYSICAL_DEVICE_PRIVATE_DATA_FEATURES} value to the {@code sType} field. */
        public VkPhysicalDevicePrivateDataFeatures.Buffer sType$Default() { return sType(VK13.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_PRIVATE_DATA_FEATURES); }
        /** Sets the specified value to the {@code pNext} field. */
        public VkPhysicalDevicePrivateDataFeatures.Buffer pNext(@NativeType("void *") long value) { VkPhysicalDevicePrivateDataFeatures.npNext(address(), value); return this; }
        /** Sets the specified value to the {@code privateData} field. */
        public VkPhysicalDevicePrivateDataFeatures.Buffer privateData(@NativeType("VkBool32") boolean value) { VkPhysicalDevicePrivateDataFeatures.nprivateData(address(), value ? 1 : 0); return this; }

    }

}