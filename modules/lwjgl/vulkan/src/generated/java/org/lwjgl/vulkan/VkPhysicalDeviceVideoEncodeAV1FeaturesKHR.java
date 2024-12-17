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
 * struct VkPhysicalDeviceVideoEncodeAV1FeaturesKHR {
 *     VkStructureType sType;
 *     void * pNext;
 *     VkBool32 videoEncodeAV1;
 * }}</pre>
 */
public class VkPhysicalDeviceVideoEncodeAV1FeaturesKHR extends Struct<VkPhysicalDeviceVideoEncodeAV1FeaturesKHR> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        VIDEOENCODEAV1;

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
        VIDEOENCODEAV1 = layout.offsetof(2);
    }

    protected VkPhysicalDeviceVideoEncodeAV1FeaturesKHR(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkPhysicalDeviceVideoEncodeAV1FeaturesKHR create(long address, @Nullable ByteBuffer container) {
        return new VkPhysicalDeviceVideoEncodeAV1FeaturesKHR(address, container);
    }

    /**
     * Creates a {@code VkPhysicalDeviceVideoEncodeAV1FeaturesKHR} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkPhysicalDeviceVideoEncodeAV1FeaturesKHR(ByteBuffer container) {
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
    /** @return the value of the {@code videoEncodeAV1} field. */
    @NativeType("VkBool32")
    public boolean videoEncodeAV1() { return nvideoEncodeAV1(address()) != 0; }

    /** Sets the specified value to the {@code sType} field. */
    public VkPhysicalDeviceVideoEncodeAV1FeaturesKHR sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link KHRVideoEncodeAV1#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_VIDEO_ENCODE_AV1_FEATURES_KHR STRUCTURE_TYPE_PHYSICAL_DEVICE_VIDEO_ENCODE_AV1_FEATURES_KHR} value to the {@code sType} field. */
    public VkPhysicalDeviceVideoEncodeAV1FeaturesKHR sType$Default() { return sType(KHRVideoEncodeAV1.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_VIDEO_ENCODE_AV1_FEATURES_KHR); }
    /** Sets the specified value to the {@code pNext} field. */
    public VkPhysicalDeviceVideoEncodeAV1FeaturesKHR pNext(@NativeType("void *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@code videoEncodeAV1} field. */
    public VkPhysicalDeviceVideoEncodeAV1FeaturesKHR videoEncodeAV1(@NativeType("VkBool32") boolean value) { nvideoEncodeAV1(address(), value ? 1 : 0); return this; }

    /** Initializes this struct with the specified values. */
    public VkPhysicalDeviceVideoEncodeAV1FeaturesKHR set(
        int sType,
        long pNext,
        boolean videoEncodeAV1
    ) {
        sType(sType);
        pNext(pNext);
        videoEncodeAV1(videoEncodeAV1);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkPhysicalDeviceVideoEncodeAV1FeaturesKHR set(VkPhysicalDeviceVideoEncodeAV1FeaturesKHR src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkPhysicalDeviceVideoEncodeAV1FeaturesKHR} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkPhysicalDeviceVideoEncodeAV1FeaturesKHR malloc() {
        return new VkPhysicalDeviceVideoEncodeAV1FeaturesKHR(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkPhysicalDeviceVideoEncodeAV1FeaturesKHR} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkPhysicalDeviceVideoEncodeAV1FeaturesKHR calloc() {
        return new VkPhysicalDeviceVideoEncodeAV1FeaturesKHR(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkPhysicalDeviceVideoEncodeAV1FeaturesKHR} instance allocated with {@link BufferUtils}. */
    public static VkPhysicalDeviceVideoEncodeAV1FeaturesKHR create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkPhysicalDeviceVideoEncodeAV1FeaturesKHR(memAddress(container), container);
    }

    /** Returns a new {@code VkPhysicalDeviceVideoEncodeAV1FeaturesKHR} instance for the specified memory address. */
    public static VkPhysicalDeviceVideoEncodeAV1FeaturesKHR create(long address) {
        return new VkPhysicalDeviceVideoEncodeAV1FeaturesKHR(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable VkPhysicalDeviceVideoEncodeAV1FeaturesKHR createSafe(long address) {
        return address == NULL ? null : new VkPhysicalDeviceVideoEncodeAV1FeaturesKHR(address, null);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceVideoEncodeAV1FeaturesKHR.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceVideoEncodeAV1FeaturesKHR.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceVideoEncodeAV1FeaturesKHR.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceVideoEncodeAV1FeaturesKHR.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceVideoEncodeAV1FeaturesKHR.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceVideoEncodeAV1FeaturesKHR.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkPhysicalDeviceVideoEncodeAV1FeaturesKHR.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceVideoEncodeAV1FeaturesKHR.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static VkPhysicalDeviceVideoEncodeAV1FeaturesKHR.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code VkPhysicalDeviceVideoEncodeAV1FeaturesKHR} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDeviceVideoEncodeAV1FeaturesKHR malloc(MemoryStack stack) {
        return new VkPhysicalDeviceVideoEncodeAV1FeaturesKHR(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkPhysicalDeviceVideoEncodeAV1FeaturesKHR} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDeviceVideoEncodeAV1FeaturesKHR calloc(MemoryStack stack) {
        return new VkPhysicalDeviceVideoEncodeAV1FeaturesKHR(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceVideoEncodeAV1FeaturesKHR.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceVideoEncodeAV1FeaturesKHR.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceVideoEncodeAV1FeaturesKHR.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceVideoEncodeAV1FeaturesKHR.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return memGetInt(struct + VkPhysicalDeviceVideoEncodeAV1FeaturesKHR.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkPhysicalDeviceVideoEncodeAV1FeaturesKHR.PNEXT); }
    /** Unsafe version of {@link #videoEncodeAV1}. */
    public static int nvideoEncodeAV1(long struct) { return memGetInt(struct + VkPhysicalDeviceVideoEncodeAV1FeaturesKHR.VIDEOENCODEAV1); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { memPutInt(struct + VkPhysicalDeviceVideoEncodeAV1FeaturesKHR.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkPhysicalDeviceVideoEncodeAV1FeaturesKHR.PNEXT, value); }
    /** Unsafe version of {@link #videoEncodeAV1(boolean) videoEncodeAV1}. */
    public static void nvideoEncodeAV1(long struct, int value) { memPutInt(struct + VkPhysicalDeviceVideoEncodeAV1FeaturesKHR.VIDEOENCODEAV1, value); }

    // -----------------------------------

    /** An array of {@link VkPhysicalDeviceVideoEncodeAV1FeaturesKHR} structs. */
    public static class Buffer extends StructBuffer<VkPhysicalDeviceVideoEncodeAV1FeaturesKHR, Buffer> implements NativeResource {

        private static final VkPhysicalDeviceVideoEncodeAV1FeaturesKHR ELEMENT_FACTORY = VkPhysicalDeviceVideoEncodeAV1FeaturesKHR.create(-1L);

        /**
         * Creates a new {@code VkPhysicalDeviceVideoEncodeAV1FeaturesKHR.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkPhysicalDeviceVideoEncodeAV1FeaturesKHR#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkPhysicalDeviceVideoEncodeAV1FeaturesKHR getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkPhysicalDeviceVideoEncodeAV1FeaturesKHR.nsType(address()); }
        /** @return the value of the {@code pNext} field. */
        @NativeType("void *")
        public long pNext() { return VkPhysicalDeviceVideoEncodeAV1FeaturesKHR.npNext(address()); }
        /** @return the value of the {@code videoEncodeAV1} field. */
        @NativeType("VkBool32")
        public boolean videoEncodeAV1() { return VkPhysicalDeviceVideoEncodeAV1FeaturesKHR.nvideoEncodeAV1(address()) != 0; }

        /** Sets the specified value to the {@code sType} field. */
        public VkPhysicalDeviceVideoEncodeAV1FeaturesKHR.Buffer sType(@NativeType("VkStructureType") int value) { VkPhysicalDeviceVideoEncodeAV1FeaturesKHR.nsType(address(), value); return this; }
        /** Sets the {@link KHRVideoEncodeAV1#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_VIDEO_ENCODE_AV1_FEATURES_KHR STRUCTURE_TYPE_PHYSICAL_DEVICE_VIDEO_ENCODE_AV1_FEATURES_KHR} value to the {@code sType} field. */
        public VkPhysicalDeviceVideoEncodeAV1FeaturesKHR.Buffer sType$Default() { return sType(KHRVideoEncodeAV1.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_VIDEO_ENCODE_AV1_FEATURES_KHR); }
        /** Sets the specified value to the {@code pNext} field. */
        public VkPhysicalDeviceVideoEncodeAV1FeaturesKHR.Buffer pNext(@NativeType("void *") long value) { VkPhysicalDeviceVideoEncodeAV1FeaturesKHR.npNext(address(), value); return this; }
        /** Sets the specified value to the {@code videoEncodeAV1} field. */
        public VkPhysicalDeviceVideoEncodeAV1FeaturesKHR.Buffer videoEncodeAV1(@NativeType("VkBool32") boolean value) { VkPhysicalDeviceVideoEncodeAV1FeaturesKHR.nvideoEncodeAV1(address(), value ? 1 : 0); return this; }

    }

}