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
 * struct VkPhysicalDevicePresentId2FeaturesKHR {
 *     VkStructureType sType;
 *     void * pNext;
 *     VkBool32 presentId2;
 * }}</pre>
 */
public class VkPhysicalDevicePresentId2FeaturesKHR extends Struct<VkPhysicalDevicePresentId2FeaturesKHR> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        PRESENTID2;

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
        PRESENTID2 = layout.offsetof(2);
    }

    protected VkPhysicalDevicePresentId2FeaturesKHR(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkPhysicalDevicePresentId2FeaturesKHR create(long address, @Nullable ByteBuffer container) {
        return new VkPhysicalDevicePresentId2FeaturesKHR(address, container);
    }

    /**
     * Creates a {@code VkPhysicalDevicePresentId2FeaturesKHR} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkPhysicalDevicePresentId2FeaturesKHR(ByteBuffer container) {
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
    /** @return the value of the {@code presentId2} field. */
    @NativeType("VkBool32")
    public boolean presentId2() { return npresentId2(address()) != 0; }

    /** Sets the specified value to the {@code sType} field. */
    public VkPhysicalDevicePresentId2FeaturesKHR sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link KHRPresentId2#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_PRESENT_ID_2_FEATURES_KHR STRUCTURE_TYPE_PHYSICAL_DEVICE_PRESENT_ID_2_FEATURES_KHR} value to the {@code sType} field. */
    public VkPhysicalDevicePresentId2FeaturesKHR sType$Default() { return sType(KHRPresentId2.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_PRESENT_ID_2_FEATURES_KHR); }
    /** Sets the specified value to the {@code pNext} field. */
    public VkPhysicalDevicePresentId2FeaturesKHR pNext(@NativeType("void *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@code presentId2} field. */
    public VkPhysicalDevicePresentId2FeaturesKHR presentId2(@NativeType("VkBool32") boolean value) { npresentId2(address(), value ? 1 : 0); return this; }

    /** Initializes this struct with the specified values. */
    public VkPhysicalDevicePresentId2FeaturesKHR set(
        int sType,
        long pNext,
        boolean presentId2
    ) {
        sType(sType);
        pNext(pNext);
        presentId2(presentId2);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkPhysicalDevicePresentId2FeaturesKHR set(VkPhysicalDevicePresentId2FeaturesKHR src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkPhysicalDevicePresentId2FeaturesKHR} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkPhysicalDevicePresentId2FeaturesKHR malloc() {
        return new VkPhysicalDevicePresentId2FeaturesKHR(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkPhysicalDevicePresentId2FeaturesKHR} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkPhysicalDevicePresentId2FeaturesKHR calloc() {
        return new VkPhysicalDevicePresentId2FeaturesKHR(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkPhysicalDevicePresentId2FeaturesKHR} instance allocated with {@link BufferUtils}. */
    public static VkPhysicalDevicePresentId2FeaturesKHR create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkPhysicalDevicePresentId2FeaturesKHR(memAddress(container), container);
    }

    /** Returns a new {@code VkPhysicalDevicePresentId2FeaturesKHR} instance for the specified memory address. */
    public static VkPhysicalDevicePresentId2FeaturesKHR create(long address) {
        return new VkPhysicalDevicePresentId2FeaturesKHR(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable VkPhysicalDevicePresentId2FeaturesKHR createSafe(long address) {
        return address == NULL ? null : new VkPhysicalDevicePresentId2FeaturesKHR(address, null);
    }

    /**
     * Returns a new {@link VkPhysicalDevicePresentId2FeaturesKHR.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDevicePresentId2FeaturesKHR.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDevicePresentId2FeaturesKHR.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDevicePresentId2FeaturesKHR.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDevicePresentId2FeaturesKHR.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDevicePresentId2FeaturesKHR.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkPhysicalDevicePresentId2FeaturesKHR.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDevicePresentId2FeaturesKHR.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static VkPhysicalDevicePresentId2FeaturesKHR.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code VkPhysicalDevicePresentId2FeaturesKHR} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDevicePresentId2FeaturesKHR malloc(MemoryStack stack) {
        return new VkPhysicalDevicePresentId2FeaturesKHR(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkPhysicalDevicePresentId2FeaturesKHR} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDevicePresentId2FeaturesKHR calloc(MemoryStack stack) {
        return new VkPhysicalDevicePresentId2FeaturesKHR(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkPhysicalDevicePresentId2FeaturesKHR.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDevicePresentId2FeaturesKHR.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDevicePresentId2FeaturesKHR.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDevicePresentId2FeaturesKHR.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return memGetInt(struct + VkPhysicalDevicePresentId2FeaturesKHR.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkPhysicalDevicePresentId2FeaturesKHR.PNEXT); }
    /** Unsafe version of {@link #presentId2}. */
    public static int npresentId2(long struct) { return memGetInt(struct + VkPhysicalDevicePresentId2FeaturesKHR.PRESENTID2); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { memPutInt(struct + VkPhysicalDevicePresentId2FeaturesKHR.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkPhysicalDevicePresentId2FeaturesKHR.PNEXT, value); }
    /** Unsafe version of {@link #presentId2(boolean) presentId2}. */
    public static void npresentId2(long struct, int value) { memPutInt(struct + VkPhysicalDevicePresentId2FeaturesKHR.PRESENTID2, value); }

    // -----------------------------------

    /** An array of {@link VkPhysicalDevicePresentId2FeaturesKHR} structs. */
    public static class Buffer extends StructBuffer<VkPhysicalDevicePresentId2FeaturesKHR, Buffer> implements NativeResource {

        private static final VkPhysicalDevicePresentId2FeaturesKHR ELEMENT_FACTORY = VkPhysicalDevicePresentId2FeaturesKHR.create(-1L);

        /**
         * Creates a new {@code VkPhysicalDevicePresentId2FeaturesKHR.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkPhysicalDevicePresentId2FeaturesKHR#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkPhysicalDevicePresentId2FeaturesKHR getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkPhysicalDevicePresentId2FeaturesKHR.nsType(address()); }
        /** @return the value of the {@code pNext} field. */
        @NativeType("void *")
        public long pNext() { return VkPhysicalDevicePresentId2FeaturesKHR.npNext(address()); }
        /** @return the value of the {@code presentId2} field. */
        @NativeType("VkBool32")
        public boolean presentId2() { return VkPhysicalDevicePresentId2FeaturesKHR.npresentId2(address()) != 0; }

        /** Sets the specified value to the {@code sType} field. */
        public VkPhysicalDevicePresentId2FeaturesKHR.Buffer sType(@NativeType("VkStructureType") int value) { VkPhysicalDevicePresentId2FeaturesKHR.nsType(address(), value); return this; }
        /** Sets the {@link KHRPresentId2#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_PRESENT_ID_2_FEATURES_KHR STRUCTURE_TYPE_PHYSICAL_DEVICE_PRESENT_ID_2_FEATURES_KHR} value to the {@code sType} field. */
        public VkPhysicalDevicePresentId2FeaturesKHR.Buffer sType$Default() { return sType(KHRPresentId2.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_PRESENT_ID_2_FEATURES_KHR); }
        /** Sets the specified value to the {@code pNext} field. */
        public VkPhysicalDevicePresentId2FeaturesKHR.Buffer pNext(@NativeType("void *") long value) { VkPhysicalDevicePresentId2FeaturesKHR.npNext(address(), value); return this; }
        /** Sets the specified value to the {@code presentId2} field. */
        public VkPhysicalDevicePresentId2FeaturesKHR.Buffer presentId2(@NativeType("VkBool32") boolean value) { VkPhysicalDevicePresentId2FeaturesKHR.npresentId2(address(), value ? 1 : 0); return this; }

    }

}