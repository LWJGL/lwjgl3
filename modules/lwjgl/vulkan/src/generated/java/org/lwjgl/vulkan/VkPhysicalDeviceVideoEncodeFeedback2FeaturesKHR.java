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
 * struct VkPhysicalDeviceVideoEncodeFeedback2FeaturesKHR {
 *     VkStructureType sType;
 *     void * pNext;
 *     VkBool32 videoEncodeFeedback2;
 * }}</pre>
 */
public class VkPhysicalDeviceVideoEncodeFeedback2FeaturesKHR extends Struct<VkPhysicalDeviceVideoEncodeFeedback2FeaturesKHR> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        VIDEOENCODEFEEDBACK2;

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
        VIDEOENCODEFEEDBACK2 = layout.offsetof(2);
    }

    protected VkPhysicalDeviceVideoEncodeFeedback2FeaturesKHR(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkPhysicalDeviceVideoEncodeFeedback2FeaturesKHR create(long address, @Nullable ByteBuffer container) {
        return new VkPhysicalDeviceVideoEncodeFeedback2FeaturesKHR(address, container);
    }

    /**
     * Creates a {@code VkPhysicalDeviceVideoEncodeFeedback2FeaturesKHR} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkPhysicalDeviceVideoEncodeFeedback2FeaturesKHR(ByteBuffer container) {
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
    /** @return the value of the {@code videoEncodeFeedback2} field. */
    @NativeType("VkBool32")
    public boolean videoEncodeFeedback2() { return nvideoEncodeFeedback2(address()) != 0; }

    /** Sets the specified value to the {@code sType} field. */
    public VkPhysicalDeviceVideoEncodeFeedback2FeaturesKHR sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link KHRVideoEncodeFeedback2#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_VIDEO_ENCODE_FEEDBACK_2_FEATURES_KHR STRUCTURE_TYPE_PHYSICAL_DEVICE_VIDEO_ENCODE_FEEDBACK_2_FEATURES_KHR} value to the {@code sType} field. */
    public VkPhysicalDeviceVideoEncodeFeedback2FeaturesKHR sType$Default() { return sType(KHRVideoEncodeFeedback2.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_VIDEO_ENCODE_FEEDBACK_2_FEATURES_KHR); }
    /** Sets the specified value to the {@code pNext} field. */
    public VkPhysicalDeviceVideoEncodeFeedback2FeaturesKHR pNext(@NativeType("void *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@code videoEncodeFeedback2} field. */
    public VkPhysicalDeviceVideoEncodeFeedback2FeaturesKHR videoEncodeFeedback2(@NativeType("VkBool32") boolean value) { nvideoEncodeFeedback2(address(), value ? 1 : 0); return this; }

    /** Initializes this struct with the specified values. */
    public VkPhysicalDeviceVideoEncodeFeedback2FeaturesKHR set(
        int sType,
        long pNext,
        boolean videoEncodeFeedback2
    ) {
        sType(sType);
        pNext(pNext);
        videoEncodeFeedback2(videoEncodeFeedback2);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkPhysicalDeviceVideoEncodeFeedback2FeaturesKHR set(VkPhysicalDeviceVideoEncodeFeedback2FeaturesKHR src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkPhysicalDeviceVideoEncodeFeedback2FeaturesKHR} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkPhysicalDeviceVideoEncodeFeedback2FeaturesKHR malloc() {
        return new VkPhysicalDeviceVideoEncodeFeedback2FeaturesKHR(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkPhysicalDeviceVideoEncodeFeedback2FeaturesKHR} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkPhysicalDeviceVideoEncodeFeedback2FeaturesKHR calloc() {
        return new VkPhysicalDeviceVideoEncodeFeedback2FeaturesKHR(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkPhysicalDeviceVideoEncodeFeedback2FeaturesKHR} instance allocated with {@link BufferUtils}. */
    public static VkPhysicalDeviceVideoEncodeFeedback2FeaturesKHR create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkPhysicalDeviceVideoEncodeFeedback2FeaturesKHR(memAddress(container), container);
    }

    /** Returns a new {@code VkPhysicalDeviceVideoEncodeFeedback2FeaturesKHR} instance for the specified memory address. */
    public static VkPhysicalDeviceVideoEncodeFeedback2FeaturesKHR create(long address) {
        return new VkPhysicalDeviceVideoEncodeFeedback2FeaturesKHR(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable VkPhysicalDeviceVideoEncodeFeedback2FeaturesKHR createSafe(long address) {
        return address == NULL ? null : new VkPhysicalDeviceVideoEncodeFeedback2FeaturesKHR(address, null);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceVideoEncodeFeedback2FeaturesKHR.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceVideoEncodeFeedback2FeaturesKHR.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceVideoEncodeFeedback2FeaturesKHR.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceVideoEncodeFeedback2FeaturesKHR.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceVideoEncodeFeedback2FeaturesKHR.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceVideoEncodeFeedback2FeaturesKHR.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkPhysicalDeviceVideoEncodeFeedback2FeaturesKHR.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceVideoEncodeFeedback2FeaturesKHR.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static VkPhysicalDeviceVideoEncodeFeedback2FeaturesKHR.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code VkPhysicalDeviceVideoEncodeFeedback2FeaturesKHR} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDeviceVideoEncodeFeedback2FeaturesKHR malloc(MemoryStack stack) {
        return new VkPhysicalDeviceVideoEncodeFeedback2FeaturesKHR(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkPhysicalDeviceVideoEncodeFeedback2FeaturesKHR} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDeviceVideoEncodeFeedback2FeaturesKHR calloc(MemoryStack stack) {
        return new VkPhysicalDeviceVideoEncodeFeedback2FeaturesKHR(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceVideoEncodeFeedback2FeaturesKHR.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceVideoEncodeFeedback2FeaturesKHR.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceVideoEncodeFeedback2FeaturesKHR.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceVideoEncodeFeedback2FeaturesKHR.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return memGetInt(struct + VkPhysicalDeviceVideoEncodeFeedback2FeaturesKHR.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkPhysicalDeviceVideoEncodeFeedback2FeaturesKHR.PNEXT); }
    /** Unsafe version of {@link #videoEncodeFeedback2}. */
    public static int nvideoEncodeFeedback2(long struct) { return memGetInt(struct + VkPhysicalDeviceVideoEncodeFeedback2FeaturesKHR.VIDEOENCODEFEEDBACK2); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { memPutInt(struct + VkPhysicalDeviceVideoEncodeFeedback2FeaturesKHR.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkPhysicalDeviceVideoEncodeFeedback2FeaturesKHR.PNEXT, value); }
    /** Unsafe version of {@link #videoEncodeFeedback2(boolean) videoEncodeFeedback2}. */
    public static void nvideoEncodeFeedback2(long struct, int value) { memPutInt(struct + VkPhysicalDeviceVideoEncodeFeedback2FeaturesKHR.VIDEOENCODEFEEDBACK2, value); }

    // -----------------------------------

    /** An array of {@link VkPhysicalDeviceVideoEncodeFeedback2FeaturesKHR} structs. */
    public static class Buffer extends StructBuffer<VkPhysicalDeviceVideoEncodeFeedback2FeaturesKHR, Buffer> implements NativeResource {

        private static final VkPhysicalDeviceVideoEncodeFeedback2FeaturesKHR ELEMENT_FACTORY = VkPhysicalDeviceVideoEncodeFeedback2FeaturesKHR.create(-1L);

        /**
         * Creates a new {@code VkPhysicalDeviceVideoEncodeFeedback2FeaturesKHR.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkPhysicalDeviceVideoEncodeFeedback2FeaturesKHR#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkPhysicalDeviceVideoEncodeFeedback2FeaturesKHR getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkPhysicalDeviceVideoEncodeFeedback2FeaturesKHR.nsType(address()); }
        /** @return the value of the {@code pNext} field. */
        @NativeType("void *")
        public long pNext() { return VkPhysicalDeviceVideoEncodeFeedback2FeaturesKHR.npNext(address()); }
        /** @return the value of the {@code videoEncodeFeedback2} field. */
        @NativeType("VkBool32")
        public boolean videoEncodeFeedback2() { return VkPhysicalDeviceVideoEncodeFeedback2FeaturesKHR.nvideoEncodeFeedback2(address()) != 0; }

        /** Sets the specified value to the {@code sType} field. */
        public VkPhysicalDeviceVideoEncodeFeedback2FeaturesKHR.Buffer sType(@NativeType("VkStructureType") int value) { VkPhysicalDeviceVideoEncodeFeedback2FeaturesKHR.nsType(address(), value); return this; }
        /** Sets the {@link KHRVideoEncodeFeedback2#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_VIDEO_ENCODE_FEEDBACK_2_FEATURES_KHR STRUCTURE_TYPE_PHYSICAL_DEVICE_VIDEO_ENCODE_FEEDBACK_2_FEATURES_KHR} value to the {@code sType} field. */
        public VkPhysicalDeviceVideoEncodeFeedback2FeaturesKHR.Buffer sType$Default() { return sType(KHRVideoEncodeFeedback2.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_VIDEO_ENCODE_FEEDBACK_2_FEATURES_KHR); }
        /** Sets the specified value to the {@code pNext} field. */
        public VkPhysicalDeviceVideoEncodeFeedback2FeaturesKHR.Buffer pNext(@NativeType("void *") long value) { VkPhysicalDeviceVideoEncodeFeedback2FeaturesKHR.npNext(address(), value); return this; }
        /** Sets the specified value to the {@code videoEncodeFeedback2} field. */
        public VkPhysicalDeviceVideoEncodeFeedback2FeaturesKHR.Buffer videoEncodeFeedback2(@NativeType("VkBool32") boolean value) { VkPhysicalDeviceVideoEncodeFeedback2FeaturesKHR.nvideoEncodeFeedback2(address(), value ? 1 : 0); return this; }

    }

}