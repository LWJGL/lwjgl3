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
 * struct VkPhysicalDeviceVideoEncodeIntraRefreshFeaturesKHR {
 *     VkStructureType sType;
 *     void * pNext;
 *     VkBool32 videoEncodeIntraRefresh;
 * }}</pre>
 */
public class VkPhysicalDeviceVideoEncodeIntraRefreshFeaturesKHR extends Struct<VkPhysicalDeviceVideoEncodeIntraRefreshFeaturesKHR> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        VIDEOENCODEINTRAREFRESH;

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
        VIDEOENCODEINTRAREFRESH = layout.offsetof(2);
    }

    protected VkPhysicalDeviceVideoEncodeIntraRefreshFeaturesKHR(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkPhysicalDeviceVideoEncodeIntraRefreshFeaturesKHR create(long address, @Nullable ByteBuffer container) {
        return new VkPhysicalDeviceVideoEncodeIntraRefreshFeaturesKHR(address, container);
    }

    /**
     * Creates a {@code VkPhysicalDeviceVideoEncodeIntraRefreshFeaturesKHR} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkPhysicalDeviceVideoEncodeIntraRefreshFeaturesKHR(ByteBuffer container) {
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
    /** @return the value of the {@code videoEncodeIntraRefresh} field. */
    @NativeType("VkBool32")
    public boolean videoEncodeIntraRefresh() { return nvideoEncodeIntraRefresh(address()) != 0; }

    /** Sets the specified value to the {@code sType} field. */
    public VkPhysicalDeviceVideoEncodeIntraRefreshFeaturesKHR sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link KHRVideoEncodeIntraRefresh#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_VIDEO_ENCODE_INTRA_REFRESH_FEATURES_KHR STRUCTURE_TYPE_PHYSICAL_DEVICE_VIDEO_ENCODE_INTRA_REFRESH_FEATURES_KHR} value to the {@code sType} field. */
    public VkPhysicalDeviceVideoEncodeIntraRefreshFeaturesKHR sType$Default() { return sType(KHRVideoEncodeIntraRefresh.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_VIDEO_ENCODE_INTRA_REFRESH_FEATURES_KHR); }
    /** Sets the specified value to the {@code pNext} field. */
    public VkPhysicalDeviceVideoEncodeIntraRefreshFeaturesKHR pNext(@NativeType("void *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@code videoEncodeIntraRefresh} field. */
    public VkPhysicalDeviceVideoEncodeIntraRefreshFeaturesKHR videoEncodeIntraRefresh(@NativeType("VkBool32") boolean value) { nvideoEncodeIntraRefresh(address(), value ? 1 : 0); return this; }

    /** Initializes this struct with the specified values. */
    public VkPhysicalDeviceVideoEncodeIntraRefreshFeaturesKHR set(
        int sType,
        long pNext,
        boolean videoEncodeIntraRefresh
    ) {
        sType(sType);
        pNext(pNext);
        videoEncodeIntraRefresh(videoEncodeIntraRefresh);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkPhysicalDeviceVideoEncodeIntraRefreshFeaturesKHR set(VkPhysicalDeviceVideoEncodeIntraRefreshFeaturesKHR src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkPhysicalDeviceVideoEncodeIntraRefreshFeaturesKHR} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkPhysicalDeviceVideoEncodeIntraRefreshFeaturesKHR malloc() {
        return new VkPhysicalDeviceVideoEncodeIntraRefreshFeaturesKHR(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkPhysicalDeviceVideoEncodeIntraRefreshFeaturesKHR} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkPhysicalDeviceVideoEncodeIntraRefreshFeaturesKHR calloc() {
        return new VkPhysicalDeviceVideoEncodeIntraRefreshFeaturesKHR(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkPhysicalDeviceVideoEncodeIntraRefreshFeaturesKHR} instance allocated with {@link BufferUtils}. */
    public static VkPhysicalDeviceVideoEncodeIntraRefreshFeaturesKHR create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkPhysicalDeviceVideoEncodeIntraRefreshFeaturesKHR(memAddress(container), container);
    }

    /** Returns a new {@code VkPhysicalDeviceVideoEncodeIntraRefreshFeaturesKHR} instance for the specified memory address. */
    public static VkPhysicalDeviceVideoEncodeIntraRefreshFeaturesKHR create(long address) {
        return new VkPhysicalDeviceVideoEncodeIntraRefreshFeaturesKHR(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable VkPhysicalDeviceVideoEncodeIntraRefreshFeaturesKHR createSafe(long address) {
        return address == NULL ? null : new VkPhysicalDeviceVideoEncodeIntraRefreshFeaturesKHR(address, null);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceVideoEncodeIntraRefreshFeaturesKHR.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceVideoEncodeIntraRefreshFeaturesKHR.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceVideoEncodeIntraRefreshFeaturesKHR.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceVideoEncodeIntraRefreshFeaturesKHR.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceVideoEncodeIntraRefreshFeaturesKHR.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceVideoEncodeIntraRefreshFeaturesKHR.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkPhysicalDeviceVideoEncodeIntraRefreshFeaturesKHR.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceVideoEncodeIntraRefreshFeaturesKHR.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static VkPhysicalDeviceVideoEncodeIntraRefreshFeaturesKHR.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code VkPhysicalDeviceVideoEncodeIntraRefreshFeaturesKHR} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDeviceVideoEncodeIntraRefreshFeaturesKHR malloc(MemoryStack stack) {
        return new VkPhysicalDeviceVideoEncodeIntraRefreshFeaturesKHR(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkPhysicalDeviceVideoEncodeIntraRefreshFeaturesKHR} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDeviceVideoEncodeIntraRefreshFeaturesKHR calloc(MemoryStack stack) {
        return new VkPhysicalDeviceVideoEncodeIntraRefreshFeaturesKHR(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceVideoEncodeIntraRefreshFeaturesKHR.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceVideoEncodeIntraRefreshFeaturesKHR.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceVideoEncodeIntraRefreshFeaturesKHR.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceVideoEncodeIntraRefreshFeaturesKHR.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return memGetInt(struct + VkPhysicalDeviceVideoEncodeIntraRefreshFeaturesKHR.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkPhysicalDeviceVideoEncodeIntraRefreshFeaturesKHR.PNEXT); }
    /** Unsafe version of {@link #videoEncodeIntraRefresh}. */
    public static int nvideoEncodeIntraRefresh(long struct) { return memGetInt(struct + VkPhysicalDeviceVideoEncodeIntraRefreshFeaturesKHR.VIDEOENCODEINTRAREFRESH); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { memPutInt(struct + VkPhysicalDeviceVideoEncodeIntraRefreshFeaturesKHR.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkPhysicalDeviceVideoEncodeIntraRefreshFeaturesKHR.PNEXT, value); }
    /** Unsafe version of {@link #videoEncodeIntraRefresh(boolean) videoEncodeIntraRefresh}. */
    public static void nvideoEncodeIntraRefresh(long struct, int value) { memPutInt(struct + VkPhysicalDeviceVideoEncodeIntraRefreshFeaturesKHR.VIDEOENCODEINTRAREFRESH, value); }

    // -----------------------------------

    /** An array of {@link VkPhysicalDeviceVideoEncodeIntraRefreshFeaturesKHR} structs. */
    public static class Buffer extends StructBuffer<VkPhysicalDeviceVideoEncodeIntraRefreshFeaturesKHR, Buffer> implements NativeResource {

        private static final VkPhysicalDeviceVideoEncodeIntraRefreshFeaturesKHR ELEMENT_FACTORY = VkPhysicalDeviceVideoEncodeIntraRefreshFeaturesKHR.create(-1L);

        /**
         * Creates a new {@code VkPhysicalDeviceVideoEncodeIntraRefreshFeaturesKHR.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkPhysicalDeviceVideoEncodeIntraRefreshFeaturesKHR#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkPhysicalDeviceVideoEncodeIntraRefreshFeaturesKHR getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkPhysicalDeviceVideoEncodeIntraRefreshFeaturesKHR.nsType(address()); }
        /** @return the value of the {@code pNext} field. */
        @NativeType("void *")
        public long pNext() { return VkPhysicalDeviceVideoEncodeIntraRefreshFeaturesKHR.npNext(address()); }
        /** @return the value of the {@code videoEncodeIntraRefresh} field. */
        @NativeType("VkBool32")
        public boolean videoEncodeIntraRefresh() { return VkPhysicalDeviceVideoEncodeIntraRefreshFeaturesKHR.nvideoEncodeIntraRefresh(address()) != 0; }

        /** Sets the specified value to the {@code sType} field. */
        public VkPhysicalDeviceVideoEncodeIntraRefreshFeaturesKHR.Buffer sType(@NativeType("VkStructureType") int value) { VkPhysicalDeviceVideoEncodeIntraRefreshFeaturesKHR.nsType(address(), value); return this; }
        /** Sets the {@link KHRVideoEncodeIntraRefresh#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_VIDEO_ENCODE_INTRA_REFRESH_FEATURES_KHR STRUCTURE_TYPE_PHYSICAL_DEVICE_VIDEO_ENCODE_INTRA_REFRESH_FEATURES_KHR} value to the {@code sType} field. */
        public VkPhysicalDeviceVideoEncodeIntraRefreshFeaturesKHR.Buffer sType$Default() { return sType(KHRVideoEncodeIntraRefresh.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_VIDEO_ENCODE_INTRA_REFRESH_FEATURES_KHR); }
        /** Sets the specified value to the {@code pNext} field. */
        public VkPhysicalDeviceVideoEncodeIntraRefreshFeaturesKHR.Buffer pNext(@NativeType("void *") long value) { VkPhysicalDeviceVideoEncodeIntraRefreshFeaturesKHR.npNext(address(), value); return this; }
        /** Sets the specified value to the {@code videoEncodeIntraRefresh} field. */
        public VkPhysicalDeviceVideoEncodeIntraRefreshFeaturesKHR.Buffer videoEncodeIntraRefresh(@NativeType("VkBool32") boolean value) { VkPhysicalDeviceVideoEncodeIntraRefreshFeaturesKHR.nvideoEncodeIntraRefresh(address(), value ? 1 : 0); return this; }

    }

}