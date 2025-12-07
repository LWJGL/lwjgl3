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
 * struct VkPhysicalDevicePresentTimingFeaturesEXT {
 *     VkStructureType sType;
 *     void * pNext;
 *     VkBool32 presentTiming;
 *     VkBool32 presentAtAbsoluteTime;
 *     VkBool32 presentAtRelativeTime;
 * }}</pre>
 */
public class VkPhysicalDevicePresentTimingFeaturesEXT extends Struct<VkPhysicalDevicePresentTimingFeaturesEXT> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        PRESENTTIMING,
        PRESENTATABSOLUTETIME,
        PRESENTATRELATIVETIME;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(4),
            __member(4),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        PRESENTTIMING = layout.offsetof(2);
        PRESENTATABSOLUTETIME = layout.offsetof(3);
        PRESENTATRELATIVETIME = layout.offsetof(4);
    }

    protected VkPhysicalDevicePresentTimingFeaturesEXT(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkPhysicalDevicePresentTimingFeaturesEXT create(long address, @Nullable ByteBuffer container) {
        return new VkPhysicalDevicePresentTimingFeaturesEXT(address, container);
    }

    /**
     * Creates a {@code VkPhysicalDevicePresentTimingFeaturesEXT} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkPhysicalDevicePresentTimingFeaturesEXT(ByteBuffer container) {
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
    /** @return the value of the {@code presentTiming} field. */
    @NativeType("VkBool32")
    public boolean presentTiming() { return npresentTiming(address()) != 0; }
    /** @return the value of the {@code presentAtAbsoluteTime} field. */
    @NativeType("VkBool32")
    public boolean presentAtAbsoluteTime() { return npresentAtAbsoluteTime(address()) != 0; }
    /** @return the value of the {@code presentAtRelativeTime} field. */
    @NativeType("VkBool32")
    public boolean presentAtRelativeTime() { return npresentAtRelativeTime(address()) != 0; }

    /** Sets the specified value to the {@code sType} field. */
    public VkPhysicalDevicePresentTimingFeaturesEXT sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link EXTPresentTiming#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_PRESENT_TIMING_FEATURES_EXT STRUCTURE_TYPE_PHYSICAL_DEVICE_PRESENT_TIMING_FEATURES_EXT} value to the {@code sType} field. */
    public VkPhysicalDevicePresentTimingFeaturesEXT sType$Default() { return sType(EXTPresentTiming.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_PRESENT_TIMING_FEATURES_EXT); }
    /** Sets the specified value to the {@code pNext} field. */
    public VkPhysicalDevicePresentTimingFeaturesEXT pNext(@NativeType("void *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@code presentTiming} field. */
    public VkPhysicalDevicePresentTimingFeaturesEXT presentTiming(@NativeType("VkBool32") boolean value) { npresentTiming(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@code presentAtAbsoluteTime} field. */
    public VkPhysicalDevicePresentTimingFeaturesEXT presentAtAbsoluteTime(@NativeType("VkBool32") boolean value) { npresentAtAbsoluteTime(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@code presentAtRelativeTime} field. */
    public VkPhysicalDevicePresentTimingFeaturesEXT presentAtRelativeTime(@NativeType("VkBool32") boolean value) { npresentAtRelativeTime(address(), value ? 1 : 0); return this; }

    /** Initializes this struct with the specified values. */
    public VkPhysicalDevicePresentTimingFeaturesEXT set(
        int sType,
        long pNext,
        boolean presentTiming,
        boolean presentAtAbsoluteTime,
        boolean presentAtRelativeTime
    ) {
        sType(sType);
        pNext(pNext);
        presentTiming(presentTiming);
        presentAtAbsoluteTime(presentAtAbsoluteTime);
        presentAtRelativeTime(presentAtRelativeTime);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkPhysicalDevicePresentTimingFeaturesEXT set(VkPhysicalDevicePresentTimingFeaturesEXT src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkPhysicalDevicePresentTimingFeaturesEXT} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkPhysicalDevicePresentTimingFeaturesEXT malloc() {
        return new VkPhysicalDevicePresentTimingFeaturesEXT(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkPhysicalDevicePresentTimingFeaturesEXT} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkPhysicalDevicePresentTimingFeaturesEXT calloc() {
        return new VkPhysicalDevicePresentTimingFeaturesEXT(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkPhysicalDevicePresentTimingFeaturesEXT} instance allocated with {@link BufferUtils}. */
    public static VkPhysicalDevicePresentTimingFeaturesEXT create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkPhysicalDevicePresentTimingFeaturesEXT(memAddress(container), container);
    }

    /** Returns a new {@code VkPhysicalDevicePresentTimingFeaturesEXT} instance for the specified memory address. */
    public static VkPhysicalDevicePresentTimingFeaturesEXT create(long address) {
        return new VkPhysicalDevicePresentTimingFeaturesEXT(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable VkPhysicalDevicePresentTimingFeaturesEXT createSafe(long address) {
        return address == NULL ? null : new VkPhysicalDevicePresentTimingFeaturesEXT(address, null);
    }

    /**
     * Returns a new {@link VkPhysicalDevicePresentTimingFeaturesEXT.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDevicePresentTimingFeaturesEXT.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDevicePresentTimingFeaturesEXT.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDevicePresentTimingFeaturesEXT.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDevicePresentTimingFeaturesEXT.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDevicePresentTimingFeaturesEXT.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkPhysicalDevicePresentTimingFeaturesEXT.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDevicePresentTimingFeaturesEXT.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static VkPhysicalDevicePresentTimingFeaturesEXT.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code VkPhysicalDevicePresentTimingFeaturesEXT} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDevicePresentTimingFeaturesEXT malloc(MemoryStack stack) {
        return new VkPhysicalDevicePresentTimingFeaturesEXT(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkPhysicalDevicePresentTimingFeaturesEXT} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDevicePresentTimingFeaturesEXT calloc(MemoryStack stack) {
        return new VkPhysicalDevicePresentTimingFeaturesEXT(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkPhysicalDevicePresentTimingFeaturesEXT.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDevicePresentTimingFeaturesEXT.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDevicePresentTimingFeaturesEXT.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDevicePresentTimingFeaturesEXT.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return memGetInt(struct + VkPhysicalDevicePresentTimingFeaturesEXT.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkPhysicalDevicePresentTimingFeaturesEXT.PNEXT); }
    /** Unsafe version of {@link #presentTiming}. */
    public static int npresentTiming(long struct) { return memGetInt(struct + VkPhysicalDevicePresentTimingFeaturesEXT.PRESENTTIMING); }
    /** Unsafe version of {@link #presentAtAbsoluteTime}. */
    public static int npresentAtAbsoluteTime(long struct) { return memGetInt(struct + VkPhysicalDevicePresentTimingFeaturesEXT.PRESENTATABSOLUTETIME); }
    /** Unsafe version of {@link #presentAtRelativeTime}. */
    public static int npresentAtRelativeTime(long struct) { return memGetInt(struct + VkPhysicalDevicePresentTimingFeaturesEXT.PRESENTATRELATIVETIME); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { memPutInt(struct + VkPhysicalDevicePresentTimingFeaturesEXT.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkPhysicalDevicePresentTimingFeaturesEXT.PNEXT, value); }
    /** Unsafe version of {@link #presentTiming(boolean) presentTiming}. */
    public static void npresentTiming(long struct, int value) { memPutInt(struct + VkPhysicalDevicePresentTimingFeaturesEXT.PRESENTTIMING, value); }
    /** Unsafe version of {@link #presentAtAbsoluteTime(boolean) presentAtAbsoluteTime}. */
    public static void npresentAtAbsoluteTime(long struct, int value) { memPutInt(struct + VkPhysicalDevicePresentTimingFeaturesEXT.PRESENTATABSOLUTETIME, value); }
    /** Unsafe version of {@link #presentAtRelativeTime(boolean) presentAtRelativeTime}. */
    public static void npresentAtRelativeTime(long struct, int value) { memPutInt(struct + VkPhysicalDevicePresentTimingFeaturesEXT.PRESENTATRELATIVETIME, value); }

    // -----------------------------------

    /** An array of {@link VkPhysicalDevicePresentTimingFeaturesEXT} structs. */
    public static class Buffer extends StructBuffer<VkPhysicalDevicePresentTimingFeaturesEXT, Buffer> implements NativeResource {

        private static final VkPhysicalDevicePresentTimingFeaturesEXT ELEMENT_FACTORY = VkPhysicalDevicePresentTimingFeaturesEXT.create(-1L);

        /**
         * Creates a new {@code VkPhysicalDevicePresentTimingFeaturesEXT.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkPhysicalDevicePresentTimingFeaturesEXT#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkPhysicalDevicePresentTimingFeaturesEXT getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkPhysicalDevicePresentTimingFeaturesEXT.nsType(address()); }
        /** @return the value of the {@code pNext} field. */
        @NativeType("void *")
        public long pNext() { return VkPhysicalDevicePresentTimingFeaturesEXT.npNext(address()); }
        /** @return the value of the {@code presentTiming} field. */
        @NativeType("VkBool32")
        public boolean presentTiming() { return VkPhysicalDevicePresentTimingFeaturesEXT.npresentTiming(address()) != 0; }
        /** @return the value of the {@code presentAtAbsoluteTime} field. */
        @NativeType("VkBool32")
        public boolean presentAtAbsoluteTime() { return VkPhysicalDevicePresentTimingFeaturesEXT.npresentAtAbsoluteTime(address()) != 0; }
        /** @return the value of the {@code presentAtRelativeTime} field. */
        @NativeType("VkBool32")
        public boolean presentAtRelativeTime() { return VkPhysicalDevicePresentTimingFeaturesEXT.npresentAtRelativeTime(address()) != 0; }

        /** Sets the specified value to the {@code sType} field. */
        public VkPhysicalDevicePresentTimingFeaturesEXT.Buffer sType(@NativeType("VkStructureType") int value) { VkPhysicalDevicePresentTimingFeaturesEXT.nsType(address(), value); return this; }
        /** Sets the {@link EXTPresentTiming#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_PRESENT_TIMING_FEATURES_EXT STRUCTURE_TYPE_PHYSICAL_DEVICE_PRESENT_TIMING_FEATURES_EXT} value to the {@code sType} field. */
        public VkPhysicalDevicePresentTimingFeaturesEXT.Buffer sType$Default() { return sType(EXTPresentTiming.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_PRESENT_TIMING_FEATURES_EXT); }
        /** Sets the specified value to the {@code pNext} field. */
        public VkPhysicalDevicePresentTimingFeaturesEXT.Buffer pNext(@NativeType("void *") long value) { VkPhysicalDevicePresentTimingFeaturesEXT.npNext(address(), value); return this; }
        /** Sets the specified value to the {@code presentTiming} field. */
        public VkPhysicalDevicePresentTimingFeaturesEXT.Buffer presentTiming(@NativeType("VkBool32") boolean value) { VkPhysicalDevicePresentTimingFeaturesEXT.npresentTiming(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@code presentAtAbsoluteTime} field. */
        public VkPhysicalDevicePresentTimingFeaturesEXT.Buffer presentAtAbsoluteTime(@NativeType("VkBool32") boolean value) { VkPhysicalDevicePresentTimingFeaturesEXT.npresentAtAbsoluteTime(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@code presentAtRelativeTime} field. */
        public VkPhysicalDevicePresentTimingFeaturesEXT.Buffer presentAtRelativeTime(@NativeType("VkBool32") boolean value) { VkPhysicalDevicePresentTimingFeaturesEXT.npresentAtRelativeTime(address(), value ? 1 : 0); return this; }

    }

}