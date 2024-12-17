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
 * struct VkPhysicalDeviceVideoEncodeQuantizationMapFeaturesKHR {
 *     VkStructureType sType;
 *     void * pNext;
 *     VkBool32 videoEncodeQuantizationMap;
 * }}</pre>
 */
public class VkPhysicalDeviceVideoEncodeQuantizationMapFeaturesKHR extends Struct<VkPhysicalDeviceVideoEncodeQuantizationMapFeaturesKHR> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        VIDEOENCODEQUANTIZATIONMAP;

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
        VIDEOENCODEQUANTIZATIONMAP = layout.offsetof(2);
    }

    protected VkPhysicalDeviceVideoEncodeQuantizationMapFeaturesKHR(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkPhysicalDeviceVideoEncodeQuantizationMapFeaturesKHR create(long address, @Nullable ByteBuffer container) {
        return new VkPhysicalDeviceVideoEncodeQuantizationMapFeaturesKHR(address, container);
    }

    /**
     * Creates a {@code VkPhysicalDeviceVideoEncodeQuantizationMapFeaturesKHR} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkPhysicalDeviceVideoEncodeQuantizationMapFeaturesKHR(ByteBuffer container) {
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
    /** @return the value of the {@code videoEncodeQuantizationMap} field. */
    @NativeType("VkBool32")
    public boolean videoEncodeQuantizationMap() { return nvideoEncodeQuantizationMap(address()) != 0; }

    /** Sets the specified value to the {@code sType} field. */
    public VkPhysicalDeviceVideoEncodeQuantizationMapFeaturesKHR sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link KHRVideoEncodeQuantizationMap#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_VIDEO_ENCODE_QUANTIZATION_MAP_FEATURES_KHR STRUCTURE_TYPE_PHYSICAL_DEVICE_VIDEO_ENCODE_QUANTIZATION_MAP_FEATURES_KHR} value to the {@code sType} field. */
    public VkPhysicalDeviceVideoEncodeQuantizationMapFeaturesKHR sType$Default() { return sType(KHRVideoEncodeQuantizationMap.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_VIDEO_ENCODE_QUANTIZATION_MAP_FEATURES_KHR); }
    /** Sets the specified value to the {@code pNext} field. */
    public VkPhysicalDeviceVideoEncodeQuantizationMapFeaturesKHR pNext(@NativeType("void *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@code videoEncodeQuantizationMap} field. */
    public VkPhysicalDeviceVideoEncodeQuantizationMapFeaturesKHR videoEncodeQuantizationMap(@NativeType("VkBool32") boolean value) { nvideoEncodeQuantizationMap(address(), value ? 1 : 0); return this; }

    /** Initializes this struct with the specified values. */
    public VkPhysicalDeviceVideoEncodeQuantizationMapFeaturesKHR set(
        int sType,
        long pNext,
        boolean videoEncodeQuantizationMap
    ) {
        sType(sType);
        pNext(pNext);
        videoEncodeQuantizationMap(videoEncodeQuantizationMap);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkPhysicalDeviceVideoEncodeQuantizationMapFeaturesKHR set(VkPhysicalDeviceVideoEncodeQuantizationMapFeaturesKHR src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkPhysicalDeviceVideoEncodeQuantizationMapFeaturesKHR} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkPhysicalDeviceVideoEncodeQuantizationMapFeaturesKHR malloc() {
        return new VkPhysicalDeviceVideoEncodeQuantizationMapFeaturesKHR(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkPhysicalDeviceVideoEncodeQuantizationMapFeaturesKHR} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkPhysicalDeviceVideoEncodeQuantizationMapFeaturesKHR calloc() {
        return new VkPhysicalDeviceVideoEncodeQuantizationMapFeaturesKHR(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkPhysicalDeviceVideoEncodeQuantizationMapFeaturesKHR} instance allocated with {@link BufferUtils}. */
    public static VkPhysicalDeviceVideoEncodeQuantizationMapFeaturesKHR create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkPhysicalDeviceVideoEncodeQuantizationMapFeaturesKHR(memAddress(container), container);
    }

    /** Returns a new {@code VkPhysicalDeviceVideoEncodeQuantizationMapFeaturesKHR} instance for the specified memory address. */
    public static VkPhysicalDeviceVideoEncodeQuantizationMapFeaturesKHR create(long address) {
        return new VkPhysicalDeviceVideoEncodeQuantizationMapFeaturesKHR(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable VkPhysicalDeviceVideoEncodeQuantizationMapFeaturesKHR createSafe(long address) {
        return address == NULL ? null : new VkPhysicalDeviceVideoEncodeQuantizationMapFeaturesKHR(address, null);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceVideoEncodeQuantizationMapFeaturesKHR.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceVideoEncodeQuantizationMapFeaturesKHR.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceVideoEncodeQuantizationMapFeaturesKHR.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceVideoEncodeQuantizationMapFeaturesKHR.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceVideoEncodeQuantizationMapFeaturesKHR.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceVideoEncodeQuantizationMapFeaturesKHR.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkPhysicalDeviceVideoEncodeQuantizationMapFeaturesKHR.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceVideoEncodeQuantizationMapFeaturesKHR.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static VkPhysicalDeviceVideoEncodeQuantizationMapFeaturesKHR.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code VkPhysicalDeviceVideoEncodeQuantizationMapFeaturesKHR} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDeviceVideoEncodeQuantizationMapFeaturesKHR malloc(MemoryStack stack) {
        return new VkPhysicalDeviceVideoEncodeQuantizationMapFeaturesKHR(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkPhysicalDeviceVideoEncodeQuantizationMapFeaturesKHR} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDeviceVideoEncodeQuantizationMapFeaturesKHR calloc(MemoryStack stack) {
        return new VkPhysicalDeviceVideoEncodeQuantizationMapFeaturesKHR(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceVideoEncodeQuantizationMapFeaturesKHR.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceVideoEncodeQuantizationMapFeaturesKHR.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceVideoEncodeQuantizationMapFeaturesKHR.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceVideoEncodeQuantizationMapFeaturesKHR.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return memGetInt(struct + VkPhysicalDeviceVideoEncodeQuantizationMapFeaturesKHR.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkPhysicalDeviceVideoEncodeQuantizationMapFeaturesKHR.PNEXT); }
    /** Unsafe version of {@link #videoEncodeQuantizationMap}. */
    public static int nvideoEncodeQuantizationMap(long struct) { return memGetInt(struct + VkPhysicalDeviceVideoEncodeQuantizationMapFeaturesKHR.VIDEOENCODEQUANTIZATIONMAP); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { memPutInt(struct + VkPhysicalDeviceVideoEncodeQuantizationMapFeaturesKHR.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkPhysicalDeviceVideoEncodeQuantizationMapFeaturesKHR.PNEXT, value); }
    /** Unsafe version of {@link #videoEncodeQuantizationMap(boolean) videoEncodeQuantizationMap}. */
    public static void nvideoEncodeQuantizationMap(long struct, int value) { memPutInt(struct + VkPhysicalDeviceVideoEncodeQuantizationMapFeaturesKHR.VIDEOENCODEQUANTIZATIONMAP, value); }

    // -----------------------------------

    /** An array of {@link VkPhysicalDeviceVideoEncodeQuantizationMapFeaturesKHR} structs. */
    public static class Buffer extends StructBuffer<VkPhysicalDeviceVideoEncodeQuantizationMapFeaturesKHR, Buffer> implements NativeResource {

        private static final VkPhysicalDeviceVideoEncodeQuantizationMapFeaturesKHR ELEMENT_FACTORY = VkPhysicalDeviceVideoEncodeQuantizationMapFeaturesKHR.create(-1L);

        /**
         * Creates a new {@code VkPhysicalDeviceVideoEncodeQuantizationMapFeaturesKHR.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkPhysicalDeviceVideoEncodeQuantizationMapFeaturesKHR#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkPhysicalDeviceVideoEncodeQuantizationMapFeaturesKHR getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkPhysicalDeviceVideoEncodeQuantizationMapFeaturesKHR.nsType(address()); }
        /** @return the value of the {@code pNext} field. */
        @NativeType("void *")
        public long pNext() { return VkPhysicalDeviceVideoEncodeQuantizationMapFeaturesKHR.npNext(address()); }
        /** @return the value of the {@code videoEncodeQuantizationMap} field. */
        @NativeType("VkBool32")
        public boolean videoEncodeQuantizationMap() { return VkPhysicalDeviceVideoEncodeQuantizationMapFeaturesKHR.nvideoEncodeQuantizationMap(address()) != 0; }

        /** Sets the specified value to the {@code sType} field. */
        public VkPhysicalDeviceVideoEncodeQuantizationMapFeaturesKHR.Buffer sType(@NativeType("VkStructureType") int value) { VkPhysicalDeviceVideoEncodeQuantizationMapFeaturesKHR.nsType(address(), value); return this; }
        /** Sets the {@link KHRVideoEncodeQuantizationMap#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_VIDEO_ENCODE_QUANTIZATION_MAP_FEATURES_KHR STRUCTURE_TYPE_PHYSICAL_DEVICE_VIDEO_ENCODE_QUANTIZATION_MAP_FEATURES_KHR} value to the {@code sType} field. */
        public VkPhysicalDeviceVideoEncodeQuantizationMapFeaturesKHR.Buffer sType$Default() { return sType(KHRVideoEncodeQuantizationMap.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_VIDEO_ENCODE_QUANTIZATION_MAP_FEATURES_KHR); }
        /** Sets the specified value to the {@code pNext} field. */
        public VkPhysicalDeviceVideoEncodeQuantizationMapFeaturesKHR.Buffer pNext(@NativeType("void *") long value) { VkPhysicalDeviceVideoEncodeQuantizationMapFeaturesKHR.npNext(address(), value); return this; }
        /** Sets the specified value to the {@code videoEncodeQuantizationMap} field. */
        public VkPhysicalDeviceVideoEncodeQuantizationMapFeaturesKHR.Buffer videoEncodeQuantizationMap(@NativeType("VkBool32") boolean value) { VkPhysicalDeviceVideoEncodeQuantizationMapFeaturesKHR.nvideoEncodeQuantizationMap(address(), value ? 1 : 0); return this; }

    }

}