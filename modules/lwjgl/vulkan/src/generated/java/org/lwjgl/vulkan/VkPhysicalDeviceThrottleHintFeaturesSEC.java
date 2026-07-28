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
 * struct VkPhysicalDeviceThrottleHintFeaturesSEC {
 *     VkStructureType sType;
 *     void * pNext;
 *     VkBool32 throttleHint;
 * }}</pre>
 */
public class VkPhysicalDeviceThrottleHintFeaturesSEC extends Struct<VkPhysicalDeviceThrottleHintFeaturesSEC> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        THROTTLEHINT;

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
        THROTTLEHINT = layout.offsetof(2);
    }

    protected VkPhysicalDeviceThrottleHintFeaturesSEC(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkPhysicalDeviceThrottleHintFeaturesSEC create(long address, @Nullable ByteBuffer container) {
        return new VkPhysicalDeviceThrottleHintFeaturesSEC(address, container);
    }

    /**
     * Creates a {@code VkPhysicalDeviceThrottleHintFeaturesSEC} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkPhysicalDeviceThrottleHintFeaturesSEC(ByteBuffer container) {
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
    /** @return the value of the {@code throttleHint} field. */
    @NativeType("VkBool32")
    public boolean throttleHint() { return nthrottleHint(address()) != 0; }

    /** Sets the specified value to the {@code sType} field. */
    public VkPhysicalDeviceThrottleHintFeaturesSEC sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link SECThrottleHint#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_THROTTLE_HINT_FEATURES_SEC STRUCTURE_TYPE_PHYSICAL_DEVICE_THROTTLE_HINT_FEATURES_SEC} value to the {@code sType} field. */
    public VkPhysicalDeviceThrottleHintFeaturesSEC sType$Default() { return sType(SECThrottleHint.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_THROTTLE_HINT_FEATURES_SEC); }
    /** Sets the specified value to the {@code pNext} field. */
    public VkPhysicalDeviceThrottleHintFeaturesSEC pNext(@NativeType("void *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@code throttleHint} field. */
    public VkPhysicalDeviceThrottleHintFeaturesSEC throttleHint(@NativeType("VkBool32") boolean value) { nthrottleHint(address(), value ? 1 : 0); return this; }

    /** Initializes this struct with the specified values. */
    public VkPhysicalDeviceThrottleHintFeaturesSEC set(
        int sType,
        long pNext,
        boolean throttleHint
    ) {
        sType(sType);
        pNext(pNext);
        throttleHint(throttleHint);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkPhysicalDeviceThrottleHintFeaturesSEC set(VkPhysicalDeviceThrottleHintFeaturesSEC src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkPhysicalDeviceThrottleHintFeaturesSEC} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkPhysicalDeviceThrottleHintFeaturesSEC malloc() {
        return new VkPhysicalDeviceThrottleHintFeaturesSEC(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkPhysicalDeviceThrottleHintFeaturesSEC} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkPhysicalDeviceThrottleHintFeaturesSEC calloc() {
        return new VkPhysicalDeviceThrottleHintFeaturesSEC(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkPhysicalDeviceThrottleHintFeaturesSEC} instance allocated with {@link BufferUtils}. */
    public static VkPhysicalDeviceThrottleHintFeaturesSEC create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkPhysicalDeviceThrottleHintFeaturesSEC(memAddress(container), container);
    }

    /** Returns a new {@code VkPhysicalDeviceThrottleHintFeaturesSEC} instance for the specified memory address. */
    public static VkPhysicalDeviceThrottleHintFeaturesSEC create(long address) {
        return new VkPhysicalDeviceThrottleHintFeaturesSEC(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable VkPhysicalDeviceThrottleHintFeaturesSEC createSafe(long address) {
        return address == NULL ? null : new VkPhysicalDeviceThrottleHintFeaturesSEC(address, null);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceThrottleHintFeaturesSEC.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceThrottleHintFeaturesSEC.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceThrottleHintFeaturesSEC.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceThrottleHintFeaturesSEC.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceThrottleHintFeaturesSEC.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceThrottleHintFeaturesSEC.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkPhysicalDeviceThrottleHintFeaturesSEC.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceThrottleHintFeaturesSEC.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static VkPhysicalDeviceThrottleHintFeaturesSEC.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code VkPhysicalDeviceThrottleHintFeaturesSEC} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDeviceThrottleHintFeaturesSEC malloc(MemoryStack stack) {
        return new VkPhysicalDeviceThrottleHintFeaturesSEC(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkPhysicalDeviceThrottleHintFeaturesSEC} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDeviceThrottleHintFeaturesSEC calloc(MemoryStack stack) {
        return new VkPhysicalDeviceThrottleHintFeaturesSEC(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceThrottleHintFeaturesSEC.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceThrottleHintFeaturesSEC.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceThrottleHintFeaturesSEC.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceThrottleHintFeaturesSEC.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return memGetInt(struct + VkPhysicalDeviceThrottleHintFeaturesSEC.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkPhysicalDeviceThrottleHintFeaturesSEC.PNEXT); }
    /** Unsafe version of {@link #throttleHint}. */
    public static int nthrottleHint(long struct) { return memGetInt(struct + VkPhysicalDeviceThrottleHintFeaturesSEC.THROTTLEHINT); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { memPutInt(struct + VkPhysicalDeviceThrottleHintFeaturesSEC.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkPhysicalDeviceThrottleHintFeaturesSEC.PNEXT, value); }
    /** Unsafe version of {@link #throttleHint(boolean) throttleHint}. */
    public static void nthrottleHint(long struct, int value) { memPutInt(struct + VkPhysicalDeviceThrottleHintFeaturesSEC.THROTTLEHINT, value); }

    // -----------------------------------

    /** An array of {@link VkPhysicalDeviceThrottleHintFeaturesSEC} structs. */
    public static class Buffer extends StructBuffer<VkPhysicalDeviceThrottleHintFeaturesSEC, Buffer> implements NativeResource {

        private static final VkPhysicalDeviceThrottleHintFeaturesSEC ELEMENT_FACTORY = VkPhysicalDeviceThrottleHintFeaturesSEC.create(-1L);

        /**
         * Creates a new {@code VkPhysicalDeviceThrottleHintFeaturesSEC.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkPhysicalDeviceThrottleHintFeaturesSEC#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkPhysicalDeviceThrottleHintFeaturesSEC getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkPhysicalDeviceThrottleHintFeaturesSEC.nsType(address()); }
        /** @return the value of the {@code pNext} field. */
        @NativeType("void *")
        public long pNext() { return VkPhysicalDeviceThrottleHintFeaturesSEC.npNext(address()); }
        /** @return the value of the {@code throttleHint} field. */
        @NativeType("VkBool32")
        public boolean throttleHint() { return VkPhysicalDeviceThrottleHintFeaturesSEC.nthrottleHint(address()) != 0; }

        /** Sets the specified value to the {@code sType} field. */
        public VkPhysicalDeviceThrottleHintFeaturesSEC.Buffer sType(@NativeType("VkStructureType") int value) { VkPhysicalDeviceThrottleHintFeaturesSEC.nsType(address(), value); return this; }
        /** Sets the {@link SECThrottleHint#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_THROTTLE_HINT_FEATURES_SEC STRUCTURE_TYPE_PHYSICAL_DEVICE_THROTTLE_HINT_FEATURES_SEC} value to the {@code sType} field. */
        public VkPhysicalDeviceThrottleHintFeaturesSEC.Buffer sType$Default() { return sType(SECThrottleHint.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_THROTTLE_HINT_FEATURES_SEC); }
        /** Sets the specified value to the {@code pNext} field. */
        public VkPhysicalDeviceThrottleHintFeaturesSEC.Buffer pNext(@NativeType("void *") long value) { VkPhysicalDeviceThrottleHintFeaturesSEC.npNext(address(), value); return this; }
        /** Sets the specified value to the {@code throttleHint} field. */
        public VkPhysicalDeviceThrottleHintFeaturesSEC.Buffer throttleHint(@NativeType("VkBool32") boolean value) { VkPhysicalDeviceThrottleHintFeaturesSEC.nthrottleHint(address(), value ? 1 : 0); return this; }

    }

}