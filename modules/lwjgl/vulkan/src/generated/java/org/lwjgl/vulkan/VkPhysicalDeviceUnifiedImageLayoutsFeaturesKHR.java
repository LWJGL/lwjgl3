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
 * struct VkPhysicalDeviceUnifiedImageLayoutsFeaturesKHR {
 *     VkStructureType sType;
 *     void * pNext;
 *     VkBool32 unifiedImageLayouts;
 *     VkBool32 unifiedImageLayoutsVideo;
 * }}</pre>
 */
public class VkPhysicalDeviceUnifiedImageLayoutsFeaturesKHR extends Struct<VkPhysicalDeviceUnifiedImageLayoutsFeaturesKHR> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        UNIFIEDIMAGELAYOUTS,
        UNIFIEDIMAGELAYOUTSVIDEO;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(4),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        UNIFIEDIMAGELAYOUTS = layout.offsetof(2);
        UNIFIEDIMAGELAYOUTSVIDEO = layout.offsetof(3);
    }

    protected VkPhysicalDeviceUnifiedImageLayoutsFeaturesKHR(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkPhysicalDeviceUnifiedImageLayoutsFeaturesKHR create(long address, @Nullable ByteBuffer container) {
        return new VkPhysicalDeviceUnifiedImageLayoutsFeaturesKHR(address, container);
    }

    /**
     * Creates a {@code VkPhysicalDeviceUnifiedImageLayoutsFeaturesKHR} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkPhysicalDeviceUnifiedImageLayoutsFeaturesKHR(ByteBuffer container) {
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
    /** @return the value of the {@code unifiedImageLayouts} field. */
    @NativeType("VkBool32")
    public boolean unifiedImageLayouts() { return nunifiedImageLayouts(address()) != 0; }
    /** @return the value of the {@code unifiedImageLayoutsVideo} field. */
    @NativeType("VkBool32")
    public boolean unifiedImageLayoutsVideo() { return nunifiedImageLayoutsVideo(address()) != 0; }

    /** Sets the specified value to the {@code sType} field. */
    public VkPhysicalDeviceUnifiedImageLayoutsFeaturesKHR sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link KHRUnifiedImageLayouts#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_UNIFIED_IMAGE_LAYOUTS_FEATURES_KHR STRUCTURE_TYPE_PHYSICAL_DEVICE_UNIFIED_IMAGE_LAYOUTS_FEATURES_KHR} value to the {@code sType} field. */
    public VkPhysicalDeviceUnifiedImageLayoutsFeaturesKHR sType$Default() { return sType(KHRUnifiedImageLayouts.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_UNIFIED_IMAGE_LAYOUTS_FEATURES_KHR); }
    /** Sets the specified value to the {@code pNext} field. */
    public VkPhysicalDeviceUnifiedImageLayoutsFeaturesKHR pNext(@NativeType("void *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@code unifiedImageLayouts} field. */
    public VkPhysicalDeviceUnifiedImageLayoutsFeaturesKHR unifiedImageLayouts(@NativeType("VkBool32") boolean value) { nunifiedImageLayouts(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@code unifiedImageLayoutsVideo} field. */
    public VkPhysicalDeviceUnifiedImageLayoutsFeaturesKHR unifiedImageLayoutsVideo(@NativeType("VkBool32") boolean value) { nunifiedImageLayoutsVideo(address(), value ? 1 : 0); return this; }

    /** Initializes this struct with the specified values. */
    public VkPhysicalDeviceUnifiedImageLayoutsFeaturesKHR set(
        int sType,
        long pNext,
        boolean unifiedImageLayouts,
        boolean unifiedImageLayoutsVideo
    ) {
        sType(sType);
        pNext(pNext);
        unifiedImageLayouts(unifiedImageLayouts);
        unifiedImageLayoutsVideo(unifiedImageLayoutsVideo);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkPhysicalDeviceUnifiedImageLayoutsFeaturesKHR set(VkPhysicalDeviceUnifiedImageLayoutsFeaturesKHR src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkPhysicalDeviceUnifiedImageLayoutsFeaturesKHR} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkPhysicalDeviceUnifiedImageLayoutsFeaturesKHR malloc() {
        return new VkPhysicalDeviceUnifiedImageLayoutsFeaturesKHR(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkPhysicalDeviceUnifiedImageLayoutsFeaturesKHR} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkPhysicalDeviceUnifiedImageLayoutsFeaturesKHR calloc() {
        return new VkPhysicalDeviceUnifiedImageLayoutsFeaturesKHR(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkPhysicalDeviceUnifiedImageLayoutsFeaturesKHR} instance allocated with {@link BufferUtils}. */
    public static VkPhysicalDeviceUnifiedImageLayoutsFeaturesKHR create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkPhysicalDeviceUnifiedImageLayoutsFeaturesKHR(memAddress(container), container);
    }

    /** Returns a new {@code VkPhysicalDeviceUnifiedImageLayoutsFeaturesKHR} instance for the specified memory address. */
    public static VkPhysicalDeviceUnifiedImageLayoutsFeaturesKHR create(long address) {
        return new VkPhysicalDeviceUnifiedImageLayoutsFeaturesKHR(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable VkPhysicalDeviceUnifiedImageLayoutsFeaturesKHR createSafe(long address) {
        return address == NULL ? null : new VkPhysicalDeviceUnifiedImageLayoutsFeaturesKHR(address, null);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceUnifiedImageLayoutsFeaturesKHR.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceUnifiedImageLayoutsFeaturesKHR.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceUnifiedImageLayoutsFeaturesKHR.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceUnifiedImageLayoutsFeaturesKHR.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceUnifiedImageLayoutsFeaturesKHR.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceUnifiedImageLayoutsFeaturesKHR.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkPhysicalDeviceUnifiedImageLayoutsFeaturesKHR.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceUnifiedImageLayoutsFeaturesKHR.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static VkPhysicalDeviceUnifiedImageLayoutsFeaturesKHR.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code VkPhysicalDeviceUnifiedImageLayoutsFeaturesKHR} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDeviceUnifiedImageLayoutsFeaturesKHR malloc(MemoryStack stack) {
        return new VkPhysicalDeviceUnifiedImageLayoutsFeaturesKHR(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkPhysicalDeviceUnifiedImageLayoutsFeaturesKHR} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDeviceUnifiedImageLayoutsFeaturesKHR calloc(MemoryStack stack) {
        return new VkPhysicalDeviceUnifiedImageLayoutsFeaturesKHR(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceUnifiedImageLayoutsFeaturesKHR.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceUnifiedImageLayoutsFeaturesKHR.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceUnifiedImageLayoutsFeaturesKHR.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceUnifiedImageLayoutsFeaturesKHR.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return memGetInt(struct + VkPhysicalDeviceUnifiedImageLayoutsFeaturesKHR.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkPhysicalDeviceUnifiedImageLayoutsFeaturesKHR.PNEXT); }
    /** Unsafe version of {@link #unifiedImageLayouts}. */
    public static int nunifiedImageLayouts(long struct) { return memGetInt(struct + VkPhysicalDeviceUnifiedImageLayoutsFeaturesKHR.UNIFIEDIMAGELAYOUTS); }
    /** Unsafe version of {@link #unifiedImageLayoutsVideo}. */
    public static int nunifiedImageLayoutsVideo(long struct) { return memGetInt(struct + VkPhysicalDeviceUnifiedImageLayoutsFeaturesKHR.UNIFIEDIMAGELAYOUTSVIDEO); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { memPutInt(struct + VkPhysicalDeviceUnifiedImageLayoutsFeaturesKHR.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkPhysicalDeviceUnifiedImageLayoutsFeaturesKHR.PNEXT, value); }
    /** Unsafe version of {@link #unifiedImageLayouts(boolean) unifiedImageLayouts}. */
    public static void nunifiedImageLayouts(long struct, int value) { memPutInt(struct + VkPhysicalDeviceUnifiedImageLayoutsFeaturesKHR.UNIFIEDIMAGELAYOUTS, value); }
    /** Unsafe version of {@link #unifiedImageLayoutsVideo(boolean) unifiedImageLayoutsVideo}. */
    public static void nunifiedImageLayoutsVideo(long struct, int value) { memPutInt(struct + VkPhysicalDeviceUnifiedImageLayoutsFeaturesKHR.UNIFIEDIMAGELAYOUTSVIDEO, value); }

    // -----------------------------------

    /** An array of {@link VkPhysicalDeviceUnifiedImageLayoutsFeaturesKHR} structs. */
    public static class Buffer extends StructBuffer<VkPhysicalDeviceUnifiedImageLayoutsFeaturesKHR, Buffer> implements NativeResource {

        private static final VkPhysicalDeviceUnifiedImageLayoutsFeaturesKHR ELEMENT_FACTORY = VkPhysicalDeviceUnifiedImageLayoutsFeaturesKHR.create(-1L);

        /**
         * Creates a new {@code VkPhysicalDeviceUnifiedImageLayoutsFeaturesKHR.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkPhysicalDeviceUnifiedImageLayoutsFeaturesKHR#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkPhysicalDeviceUnifiedImageLayoutsFeaturesKHR getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkPhysicalDeviceUnifiedImageLayoutsFeaturesKHR.nsType(address()); }
        /** @return the value of the {@code pNext} field. */
        @NativeType("void *")
        public long pNext() { return VkPhysicalDeviceUnifiedImageLayoutsFeaturesKHR.npNext(address()); }
        /** @return the value of the {@code unifiedImageLayouts} field. */
        @NativeType("VkBool32")
        public boolean unifiedImageLayouts() { return VkPhysicalDeviceUnifiedImageLayoutsFeaturesKHR.nunifiedImageLayouts(address()) != 0; }
        /** @return the value of the {@code unifiedImageLayoutsVideo} field. */
        @NativeType("VkBool32")
        public boolean unifiedImageLayoutsVideo() { return VkPhysicalDeviceUnifiedImageLayoutsFeaturesKHR.nunifiedImageLayoutsVideo(address()) != 0; }

        /** Sets the specified value to the {@code sType} field. */
        public VkPhysicalDeviceUnifiedImageLayoutsFeaturesKHR.Buffer sType(@NativeType("VkStructureType") int value) { VkPhysicalDeviceUnifiedImageLayoutsFeaturesKHR.nsType(address(), value); return this; }
        /** Sets the {@link KHRUnifiedImageLayouts#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_UNIFIED_IMAGE_LAYOUTS_FEATURES_KHR STRUCTURE_TYPE_PHYSICAL_DEVICE_UNIFIED_IMAGE_LAYOUTS_FEATURES_KHR} value to the {@code sType} field. */
        public VkPhysicalDeviceUnifiedImageLayoutsFeaturesKHR.Buffer sType$Default() { return sType(KHRUnifiedImageLayouts.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_UNIFIED_IMAGE_LAYOUTS_FEATURES_KHR); }
        /** Sets the specified value to the {@code pNext} field. */
        public VkPhysicalDeviceUnifiedImageLayoutsFeaturesKHR.Buffer pNext(@NativeType("void *") long value) { VkPhysicalDeviceUnifiedImageLayoutsFeaturesKHR.npNext(address(), value); return this; }
        /** Sets the specified value to the {@code unifiedImageLayouts} field. */
        public VkPhysicalDeviceUnifiedImageLayoutsFeaturesKHR.Buffer unifiedImageLayouts(@NativeType("VkBool32") boolean value) { VkPhysicalDeviceUnifiedImageLayoutsFeaturesKHR.nunifiedImageLayouts(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@code unifiedImageLayoutsVideo} field. */
        public VkPhysicalDeviceUnifiedImageLayoutsFeaturesKHR.Buffer unifiedImageLayoutsVideo(@NativeType("VkBool32") boolean value) { VkPhysicalDeviceUnifiedImageLayoutsFeaturesKHR.nunifiedImageLayoutsVideo(address(), value ? 1 : 0); return this; }

    }

}