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
 * struct VkPhysicalDevicePushConstantBankFeaturesNV {
 *     VkStructureType sType;
 *     void * pNext;
 *     VkBool32 pushConstantBank;
 * }}</pre>
 */
public class VkPhysicalDevicePushConstantBankFeaturesNV extends Struct<VkPhysicalDevicePushConstantBankFeaturesNV> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        PUSHCONSTANTBANK;

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
        PUSHCONSTANTBANK = layout.offsetof(2);
    }

    protected VkPhysicalDevicePushConstantBankFeaturesNV(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkPhysicalDevicePushConstantBankFeaturesNV create(long address, @Nullable ByteBuffer container) {
        return new VkPhysicalDevicePushConstantBankFeaturesNV(address, container);
    }

    /**
     * Creates a {@code VkPhysicalDevicePushConstantBankFeaturesNV} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkPhysicalDevicePushConstantBankFeaturesNV(ByteBuffer container) {
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
    /** @return the value of the {@code pushConstantBank} field. */
    @NativeType("VkBool32")
    public boolean pushConstantBank() { return npushConstantBank(address()) != 0; }

    /** Sets the specified value to the {@code sType} field. */
    public VkPhysicalDevicePushConstantBankFeaturesNV sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link NVPushConstantBank#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_PUSH_CONSTANT_BANK_FEATURES_NV STRUCTURE_TYPE_PHYSICAL_DEVICE_PUSH_CONSTANT_BANK_FEATURES_NV} value to the {@code sType} field. */
    public VkPhysicalDevicePushConstantBankFeaturesNV sType$Default() { return sType(NVPushConstantBank.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_PUSH_CONSTANT_BANK_FEATURES_NV); }
    /** Sets the specified value to the {@code pNext} field. */
    public VkPhysicalDevicePushConstantBankFeaturesNV pNext(@NativeType("void *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@code pushConstantBank} field. */
    public VkPhysicalDevicePushConstantBankFeaturesNV pushConstantBank(@NativeType("VkBool32") boolean value) { npushConstantBank(address(), value ? 1 : 0); return this; }

    /** Initializes this struct with the specified values. */
    public VkPhysicalDevicePushConstantBankFeaturesNV set(
        int sType,
        long pNext,
        boolean pushConstantBank
    ) {
        sType(sType);
        pNext(pNext);
        pushConstantBank(pushConstantBank);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkPhysicalDevicePushConstantBankFeaturesNV set(VkPhysicalDevicePushConstantBankFeaturesNV src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkPhysicalDevicePushConstantBankFeaturesNV} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkPhysicalDevicePushConstantBankFeaturesNV malloc() {
        return new VkPhysicalDevicePushConstantBankFeaturesNV(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkPhysicalDevicePushConstantBankFeaturesNV} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkPhysicalDevicePushConstantBankFeaturesNV calloc() {
        return new VkPhysicalDevicePushConstantBankFeaturesNV(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkPhysicalDevicePushConstantBankFeaturesNV} instance allocated with {@link BufferUtils}. */
    public static VkPhysicalDevicePushConstantBankFeaturesNV create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkPhysicalDevicePushConstantBankFeaturesNV(memAddress(container), container);
    }

    /** Returns a new {@code VkPhysicalDevicePushConstantBankFeaturesNV} instance for the specified memory address. */
    public static VkPhysicalDevicePushConstantBankFeaturesNV create(long address) {
        return new VkPhysicalDevicePushConstantBankFeaturesNV(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable VkPhysicalDevicePushConstantBankFeaturesNV createSafe(long address) {
        return address == NULL ? null : new VkPhysicalDevicePushConstantBankFeaturesNV(address, null);
    }

    /**
     * Returns a new {@link VkPhysicalDevicePushConstantBankFeaturesNV.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDevicePushConstantBankFeaturesNV.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDevicePushConstantBankFeaturesNV.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDevicePushConstantBankFeaturesNV.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDevicePushConstantBankFeaturesNV.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDevicePushConstantBankFeaturesNV.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkPhysicalDevicePushConstantBankFeaturesNV.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDevicePushConstantBankFeaturesNV.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static VkPhysicalDevicePushConstantBankFeaturesNV.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code VkPhysicalDevicePushConstantBankFeaturesNV} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDevicePushConstantBankFeaturesNV malloc(MemoryStack stack) {
        return new VkPhysicalDevicePushConstantBankFeaturesNV(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkPhysicalDevicePushConstantBankFeaturesNV} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDevicePushConstantBankFeaturesNV calloc(MemoryStack stack) {
        return new VkPhysicalDevicePushConstantBankFeaturesNV(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkPhysicalDevicePushConstantBankFeaturesNV.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDevicePushConstantBankFeaturesNV.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDevicePushConstantBankFeaturesNV.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDevicePushConstantBankFeaturesNV.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return memGetInt(struct + VkPhysicalDevicePushConstantBankFeaturesNV.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkPhysicalDevicePushConstantBankFeaturesNV.PNEXT); }
    /** Unsafe version of {@link #pushConstantBank}. */
    public static int npushConstantBank(long struct) { return memGetInt(struct + VkPhysicalDevicePushConstantBankFeaturesNV.PUSHCONSTANTBANK); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { memPutInt(struct + VkPhysicalDevicePushConstantBankFeaturesNV.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkPhysicalDevicePushConstantBankFeaturesNV.PNEXT, value); }
    /** Unsafe version of {@link #pushConstantBank(boolean) pushConstantBank}. */
    public static void npushConstantBank(long struct, int value) { memPutInt(struct + VkPhysicalDevicePushConstantBankFeaturesNV.PUSHCONSTANTBANK, value); }

    // -----------------------------------

    /** An array of {@link VkPhysicalDevicePushConstantBankFeaturesNV} structs. */
    public static class Buffer extends StructBuffer<VkPhysicalDevicePushConstantBankFeaturesNV, Buffer> implements NativeResource {

        private static final VkPhysicalDevicePushConstantBankFeaturesNV ELEMENT_FACTORY = VkPhysicalDevicePushConstantBankFeaturesNV.create(-1L);

        /**
         * Creates a new {@code VkPhysicalDevicePushConstantBankFeaturesNV.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkPhysicalDevicePushConstantBankFeaturesNV#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkPhysicalDevicePushConstantBankFeaturesNV getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkPhysicalDevicePushConstantBankFeaturesNV.nsType(address()); }
        /** @return the value of the {@code pNext} field. */
        @NativeType("void *")
        public long pNext() { return VkPhysicalDevicePushConstantBankFeaturesNV.npNext(address()); }
        /** @return the value of the {@code pushConstantBank} field. */
        @NativeType("VkBool32")
        public boolean pushConstantBank() { return VkPhysicalDevicePushConstantBankFeaturesNV.npushConstantBank(address()) != 0; }

        /** Sets the specified value to the {@code sType} field. */
        public VkPhysicalDevicePushConstantBankFeaturesNV.Buffer sType(@NativeType("VkStructureType") int value) { VkPhysicalDevicePushConstantBankFeaturesNV.nsType(address(), value); return this; }
        /** Sets the {@link NVPushConstantBank#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_PUSH_CONSTANT_BANK_FEATURES_NV STRUCTURE_TYPE_PHYSICAL_DEVICE_PUSH_CONSTANT_BANK_FEATURES_NV} value to the {@code sType} field. */
        public VkPhysicalDevicePushConstantBankFeaturesNV.Buffer sType$Default() { return sType(NVPushConstantBank.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_PUSH_CONSTANT_BANK_FEATURES_NV); }
        /** Sets the specified value to the {@code pNext} field. */
        public VkPhysicalDevicePushConstantBankFeaturesNV.Buffer pNext(@NativeType("void *") long value) { VkPhysicalDevicePushConstantBankFeaturesNV.npNext(address(), value); return this; }
        /** Sets the specified value to the {@code pushConstantBank} field. */
        public VkPhysicalDevicePushConstantBankFeaturesNV.Buffer pushConstantBank(@NativeType("VkBool32") boolean value) { VkPhysicalDevicePushConstantBankFeaturesNV.npushConstantBank(address(), value ? 1 : 0); return this; }

    }

}