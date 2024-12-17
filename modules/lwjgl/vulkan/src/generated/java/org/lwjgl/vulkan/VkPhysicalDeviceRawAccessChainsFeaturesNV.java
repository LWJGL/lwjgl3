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
 * struct VkPhysicalDeviceRawAccessChainsFeaturesNV {
 *     VkStructureType sType;
 *     void * pNext;
 *     VkBool32 shaderRawAccessChains;
 * }}</pre>
 */
public class VkPhysicalDeviceRawAccessChainsFeaturesNV extends Struct<VkPhysicalDeviceRawAccessChainsFeaturesNV> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        SHADERRAWACCESSCHAINS;

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
        SHADERRAWACCESSCHAINS = layout.offsetof(2);
    }

    protected VkPhysicalDeviceRawAccessChainsFeaturesNV(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkPhysicalDeviceRawAccessChainsFeaturesNV create(long address, @Nullable ByteBuffer container) {
        return new VkPhysicalDeviceRawAccessChainsFeaturesNV(address, container);
    }

    /**
     * Creates a {@code VkPhysicalDeviceRawAccessChainsFeaturesNV} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkPhysicalDeviceRawAccessChainsFeaturesNV(ByteBuffer container) {
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
    /** @return the value of the {@code shaderRawAccessChains} field. */
    @NativeType("VkBool32")
    public boolean shaderRawAccessChains() { return nshaderRawAccessChains(address()) != 0; }

    /** Sets the specified value to the {@code sType} field. */
    public VkPhysicalDeviceRawAccessChainsFeaturesNV sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link NVRawAccessChains#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_RAW_ACCESS_CHAINS_FEATURES_NV STRUCTURE_TYPE_PHYSICAL_DEVICE_RAW_ACCESS_CHAINS_FEATURES_NV} value to the {@code sType} field. */
    public VkPhysicalDeviceRawAccessChainsFeaturesNV sType$Default() { return sType(NVRawAccessChains.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_RAW_ACCESS_CHAINS_FEATURES_NV); }
    /** Sets the specified value to the {@code pNext} field. */
    public VkPhysicalDeviceRawAccessChainsFeaturesNV pNext(@NativeType("void *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@code shaderRawAccessChains} field. */
    public VkPhysicalDeviceRawAccessChainsFeaturesNV shaderRawAccessChains(@NativeType("VkBool32") boolean value) { nshaderRawAccessChains(address(), value ? 1 : 0); return this; }

    /** Initializes this struct with the specified values. */
    public VkPhysicalDeviceRawAccessChainsFeaturesNV set(
        int sType,
        long pNext,
        boolean shaderRawAccessChains
    ) {
        sType(sType);
        pNext(pNext);
        shaderRawAccessChains(shaderRawAccessChains);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkPhysicalDeviceRawAccessChainsFeaturesNV set(VkPhysicalDeviceRawAccessChainsFeaturesNV src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkPhysicalDeviceRawAccessChainsFeaturesNV} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkPhysicalDeviceRawAccessChainsFeaturesNV malloc() {
        return new VkPhysicalDeviceRawAccessChainsFeaturesNV(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkPhysicalDeviceRawAccessChainsFeaturesNV} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkPhysicalDeviceRawAccessChainsFeaturesNV calloc() {
        return new VkPhysicalDeviceRawAccessChainsFeaturesNV(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkPhysicalDeviceRawAccessChainsFeaturesNV} instance allocated with {@link BufferUtils}. */
    public static VkPhysicalDeviceRawAccessChainsFeaturesNV create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkPhysicalDeviceRawAccessChainsFeaturesNV(memAddress(container), container);
    }

    /** Returns a new {@code VkPhysicalDeviceRawAccessChainsFeaturesNV} instance for the specified memory address. */
    public static VkPhysicalDeviceRawAccessChainsFeaturesNV create(long address) {
        return new VkPhysicalDeviceRawAccessChainsFeaturesNV(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable VkPhysicalDeviceRawAccessChainsFeaturesNV createSafe(long address) {
        return address == NULL ? null : new VkPhysicalDeviceRawAccessChainsFeaturesNV(address, null);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceRawAccessChainsFeaturesNV.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceRawAccessChainsFeaturesNV.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceRawAccessChainsFeaturesNV.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceRawAccessChainsFeaturesNV.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceRawAccessChainsFeaturesNV.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceRawAccessChainsFeaturesNV.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkPhysicalDeviceRawAccessChainsFeaturesNV.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceRawAccessChainsFeaturesNV.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static VkPhysicalDeviceRawAccessChainsFeaturesNV.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code VkPhysicalDeviceRawAccessChainsFeaturesNV} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDeviceRawAccessChainsFeaturesNV malloc(MemoryStack stack) {
        return new VkPhysicalDeviceRawAccessChainsFeaturesNV(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkPhysicalDeviceRawAccessChainsFeaturesNV} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDeviceRawAccessChainsFeaturesNV calloc(MemoryStack stack) {
        return new VkPhysicalDeviceRawAccessChainsFeaturesNV(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceRawAccessChainsFeaturesNV.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceRawAccessChainsFeaturesNV.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceRawAccessChainsFeaturesNV.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceRawAccessChainsFeaturesNV.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return memGetInt(struct + VkPhysicalDeviceRawAccessChainsFeaturesNV.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkPhysicalDeviceRawAccessChainsFeaturesNV.PNEXT); }
    /** Unsafe version of {@link #shaderRawAccessChains}. */
    public static int nshaderRawAccessChains(long struct) { return memGetInt(struct + VkPhysicalDeviceRawAccessChainsFeaturesNV.SHADERRAWACCESSCHAINS); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { memPutInt(struct + VkPhysicalDeviceRawAccessChainsFeaturesNV.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkPhysicalDeviceRawAccessChainsFeaturesNV.PNEXT, value); }
    /** Unsafe version of {@link #shaderRawAccessChains(boolean) shaderRawAccessChains}. */
    public static void nshaderRawAccessChains(long struct, int value) { memPutInt(struct + VkPhysicalDeviceRawAccessChainsFeaturesNV.SHADERRAWACCESSCHAINS, value); }

    // -----------------------------------

    /** An array of {@link VkPhysicalDeviceRawAccessChainsFeaturesNV} structs. */
    public static class Buffer extends StructBuffer<VkPhysicalDeviceRawAccessChainsFeaturesNV, Buffer> implements NativeResource {

        private static final VkPhysicalDeviceRawAccessChainsFeaturesNV ELEMENT_FACTORY = VkPhysicalDeviceRawAccessChainsFeaturesNV.create(-1L);

        /**
         * Creates a new {@code VkPhysicalDeviceRawAccessChainsFeaturesNV.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkPhysicalDeviceRawAccessChainsFeaturesNV#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkPhysicalDeviceRawAccessChainsFeaturesNV getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkPhysicalDeviceRawAccessChainsFeaturesNV.nsType(address()); }
        /** @return the value of the {@code pNext} field. */
        @NativeType("void *")
        public long pNext() { return VkPhysicalDeviceRawAccessChainsFeaturesNV.npNext(address()); }
        /** @return the value of the {@code shaderRawAccessChains} field. */
        @NativeType("VkBool32")
        public boolean shaderRawAccessChains() { return VkPhysicalDeviceRawAccessChainsFeaturesNV.nshaderRawAccessChains(address()) != 0; }

        /** Sets the specified value to the {@code sType} field. */
        public VkPhysicalDeviceRawAccessChainsFeaturesNV.Buffer sType(@NativeType("VkStructureType") int value) { VkPhysicalDeviceRawAccessChainsFeaturesNV.nsType(address(), value); return this; }
        /** Sets the {@link NVRawAccessChains#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_RAW_ACCESS_CHAINS_FEATURES_NV STRUCTURE_TYPE_PHYSICAL_DEVICE_RAW_ACCESS_CHAINS_FEATURES_NV} value to the {@code sType} field. */
        public VkPhysicalDeviceRawAccessChainsFeaturesNV.Buffer sType$Default() { return sType(NVRawAccessChains.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_RAW_ACCESS_CHAINS_FEATURES_NV); }
        /** Sets the specified value to the {@code pNext} field. */
        public VkPhysicalDeviceRawAccessChainsFeaturesNV.Buffer pNext(@NativeType("void *") long value) { VkPhysicalDeviceRawAccessChainsFeaturesNV.npNext(address(), value); return this; }
        /** Sets the specified value to the {@code shaderRawAccessChains} field. */
        public VkPhysicalDeviceRawAccessChainsFeaturesNV.Buffer shaderRawAccessChains(@NativeType("VkBool32") boolean value) { VkPhysicalDeviceRawAccessChainsFeaturesNV.nshaderRawAccessChains(address(), value ? 1 : 0); return this; }

    }

}