/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.vulkan;

import javax.annotation.*;

import java.nio.*;

import org.lwjgl.*;
import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * Structure to set low latency mode.
 * 
 * <h5>Description</h5>
 * 
 * <p>If {@code lowLatencyMode} is set to {@link VK10#VK_FALSE FALSE}, {@code lowLatencyBoost} will still hint to the GPU to increase its power state and {@code vkLatencySleepNV} will still enforce {@code minimumIntervalUs} between {@code vkQueuePresentKHR} calls.</p>
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>{@code sType} <b>must</b> be {@link NVLowLatency2#VK_STRUCTURE_TYPE_LATENCY_SLEEP_MODE_INFO_NV STRUCTURE_TYPE_LATENCY_SLEEP_MODE_INFO_NV}</li>
 * </ul>
 * 
 * <h5>See Also</h5>
 * 
 * <p>{@link NVLowLatency2#vkSetLatencySleepModeNV SetLatencySleepModeNV}</p>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkLatencySleepModeInfoNV {
 *     VkStructureType {@link #sType};
 *     void const * {@link #pNext};
 *     VkBool32 {@link #lowLatencyMode};
 *     VkBool32 {@link #lowLatencyBoost};
 *     uint32_t {@link #minimumIntervalUs};
 * }</code></pre>
 */
public class VkLatencySleepModeInfoNV extends Struct<VkLatencySleepModeInfoNV> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        LOWLATENCYMODE,
        LOWLATENCYBOOST,
        MINIMUMINTERVALUS;

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
        LOWLATENCYMODE = layout.offsetof(2);
        LOWLATENCYBOOST = layout.offsetof(3);
        MINIMUMINTERVALUS = layout.offsetof(4);
    }

    protected VkLatencySleepModeInfoNV(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkLatencySleepModeInfoNV create(long address, @Nullable ByteBuffer container) {
        return new VkLatencySleepModeInfoNV(address, container);
    }

    /**
     * Creates a {@code VkLatencySleepModeInfoNV} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkLatencySleepModeInfoNV(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** a {@code VkStructureType} value identifying this structure. */
    @NativeType("VkStructureType")
    public int sType() { return nsType(address()); }
    /** {@code NULL} or a pointer to a structure extending this structure. */
    @NativeType("void const *")
    public long pNext() { return npNext(address()); }
    /** the toggle to enable or disable low latency mode. */
    @NativeType("VkBool32")
    public boolean lowLatencyMode() { return nlowLatencyMode(address()) != 0; }
    /** allows an application to hint to the GPU to increase performance to provide additional latency savings at a cost of increased power consumption. */
    @NativeType("VkBool32")
    public boolean lowLatencyBoost() { return nlowLatencyBoost(address()) != 0; }
    /** the microseconds between {@link KHRSwapchain#vkQueuePresentKHR QueuePresentKHR} calls for a given swapchain that {@link NVLowLatency2#vkLatencySleepNV LatencySleepNV} will enforce. */
    @NativeType("uint32_t")
    public int minimumIntervalUs() { return nminimumIntervalUs(address()); }

    /** Sets the specified value to the {@link #sType} field. */
    public VkLatencySleepModeInfoNV sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link NVLowLatency2#VK_STRUCTURE_TYPE_LATENCY_SLEEP_MODE_INFO_NV STRUCTURE_TYPE_LATENCY_SLEEP_MODE_INFO_NV} value to the {@link #sType} field. */
    public VkLatencySleepModeInfoNV sType$Default() { return sType(NVLowLatency2.VK_STRUCTURE_TYPE_LATENCY_SLEEP_MODE_INFO_NV); }
    /** Sets the specified value to the {@link #pNext} field. */
    public VkLatencySleepModeInfoNV pNext(@NativeType("void const *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@link #lowLatencyMode} field. */
    public VkLatencySleepModeInfoNV lowLatencyMode(@NativeType("VkBool32") boolean value) { nlowLatencyMode(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@link #lowLatencyBoost} field. */
    public VkLatencySleepModeInfoNV lowLatencyBoost(@NativeType("VkBool32") boolean value) { nlowLatencyBoost(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@link #minimumIntervalUs} field. */
    public VkLatencySleepModeInfoNV minimumIntervalUs(@NativeType("uint32_t") int value) { nminimumIntervalUs(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkLatencySleepModeInfoNV set(
        int sType,
        long pNext,
        boolean lowLatencyMode,
        boolean lowLatencyBoost,
        int minimumIntervalUs
    ) {
        sType(sType);
        pNext(pNext);
        lowLatencyMode(lowLatencyMode);
        lowLatencyBoost(lowLatencyBoost);
        minimumIntervalUs(minimumIntervalUs);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkLatencySleepModeInfoNV set(VkLatencySleepModeInfoNV src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkLatencySleepModeInfoNV} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkLatencySleepModeInfoNV malloc() {
        return new VkLatencySleepModeInfoNV(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkLatencySleepModeInfoNV} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkLatencySleepModeInfoNV calloc() {
        return new VkLatencySleepModeInfoNV(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkLatencySleepModeInfoNV} instance allocated with {@link BufferUtils}. */
    public static VkLatencySleepModeInfoNV create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkLatencySleepModeInfoNV(memAddress(container), container);
    }

    /** Returns a new {@code VkLatencySleepModeInfoNV} instance for the specified memory address. */
    public static VkLatencySleepModeInfoNV create(long address) {
        return new VkLatencySleepModeInfoNV(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkLatencySleepModeInfoNV createSafe(long address) {
        return address == NULL ? null : new VkLatencySleepModeInfoNV(address, null);
    }

    /**
     * Returns a new {@link VkLatencySleepModeInfoNV.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkLatencySleepModeInfoNV.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkLatencySleepModeInfoNV.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkLatencySleepModeInfoNV.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkLatencySleepModeInfoNV.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkLatencySleepModeInfoNV.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkLatencySleepModeInfoNV.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkLatencySleepModeInfoNV.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkLatencySleepModeInfoNV.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code VkLatencySleepModeInfoNV} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkLatencySleepModeInfoNV malloc(MemoryStack stack) {
        return new VkLatencySleepModeInfoNV(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkLatencySleepModeInfoNV} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkLatencySleepModeInfoNV calloc(MemoryStack stack) {
        return new VkLatencySleepModeInfoNV(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkLatencySleepModeInfoNV.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkLatencySleepModeInfoNV.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkLatencySleepModeInfoNV.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkLatencySleepModeInfoNV.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return UNSAFE.getInt(null, struct + VkLatencySleepModeInfoNV.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkLatencySleepModeInfoNV.PNEXT); }
    /** Unsafe version of {@link #lowLatencyMode}. */
    public static int nlowLatencyMode(long struct) { return UNSAFE.getInt(null, struct + VkLatencySleepModeInfoNV.LOWLATENCYMODE); }
    /** Unsafe version of {@link #lowLatencyBoost}. */
    public static int nlowLatencyBoost(long struct) { return UNSAFE.getInt(null, struct + VkLatencySleepModeInfoNV.LOWLATENCYBOOST); }
    /** Unsafe version of {@link #minimumIntervalUs}. */
    public static int nminimumIntervalUs(long struct) { return UNSAFE.getInt(null, struct + VkLatencySleepModeInfoNV.MINIMUMINTERVALUS); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { UNSAFE.putInt(null, struct + VkLatencySleepModeInfoNV.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkLatencySleepModeInfoNV.PNEXT, value); }
    /** Unsafe version of {@link #lowLatencyMode(boolean) lowLatencyMode}. */
    public static void nlowLatencyMode(long struct, int value) { UNSAFE.putInt(null, struct + VkLatencySleepModeInfoNV.LOWLATENCYMODE, value); }
    /** Unsafe version of {@link #lowLatencyBoost(boolean) lowLatencyBoost}. */
    public static void nlowLatencyBoost(long struct, int value) { UNSAFE.putInt(null, struct + VkLatencySleepModeInfoNV.LOWLATENCYBOOST, value); }
    /** Unsafe version of {@link #minimumIntervalUs(int) minimumIntervalUs}. */
    public static void nminimumIntervalUs(long struct, int value) { UNSAFE.putInt(null, struct + VkLatencySleepModeInfoNV.MINIMUMINTERVALUS, value); }

    // -----------------------------------

    /** An array of {@link VkLatencySleepModeInfoNV} structs. */
    public static class Buffer extends StructBuffer<VkLatencySleepModeInfoNV, Buffer> implements NativeResource {

        private static final VkLatencySleepModeInfoNV ELEMENT_FACTORY = VkLatencySleepModeInfoNV.create(-1L);

        /**
         * Creates a new {@code VkLatencySleepModeInfoNV.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkLatencySleepModeInfoNV#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkLatencySleepModeInfoNV getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link VkLatencySleepModeInfoNV#sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkLatencySleepModeInfoNV.nsType(address()); }
        /** @return the value of the {@link VkLatencySleepModeInfoNV#pNext} field. */
        @NativeType("void const *")
        public long pNext() { return VkLatencySleepModeInfoNV.npNext(address()); }
        /** @return the value of the {@link VkLatencySleepModeInfoNV#lowLatencyMode} field. */
        @NativeType("VkBool32")
        public boolean lowLatencyMode() { return VkLatencySleepModeInfoNV.nlowLatencyMode(address()) != 0; }
        /** @return the value of the {@link VkLatencySleepModeInfoNV#lowLatencyBoost} field. */
        @NativeType("VkBool32")
        public boolean lowLatencyBoost() { return VkLatencySleepModeInfoNV.nlowLatencyBoost(address()) != 0; }
        /** @return the value of the {@link VkLatencySleepModeInfoNV#minimumIntervalUs} field. */
        @NativeType("uint32_t")
        public int minimumIntervalUs() { return VkLatencySleepModeInfoNV.nminimumIntervalUs(address()); }

        /** Sets the specified value to the {@link VkLatencySleepModeInfoNV#sType} field. */
        public VkLatencySleepModeInfoNV.Buffer sType(@NativeType("VkStructureType") int value) { VkLatencySleepModeInfoNV.nsType(address(), value); return this; }
        /** Sets the {@link NVLowLatency2#VK_STRUCTURE_TYPE_LATENCY_SLEEP_MODE_INFO_NV STRUCTURE_TYPE_LATENCY_SLEEP_MODE_INFO_NV} value to the {@link VkLatencySleepModeInfoNV#sType} field. */
        public VkLatencySleepModeInfoNV.Buffer sType$Default() { return sType(NVLowLatency2.VK_STRUCTURE_TYPE_LATENCY_SLEEP_MODE_INFO_NV); }
        /** Sets the specified value to the {@link VkLatencySleepModeInfoNV#pNext} field. */
        public VkLatencySleepModeInfoNV.Buffer pNext(@NativeType("void const *") long value) { VkLatencySleepModeInfoNV.npNext(address(), value); return this; }
        /** Sets the specified value to the {@link VkLatencySleepModeInfoNV#lowLatencyMode} field. */
        public VkLatencySleepModeInfoNV.Buffer lowLatencyMode(@NativeType("VkBool32") boolean value) { VkLatencySleepModeInfoNV.nlowLatencyMode(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@link VkLatencySleepModeInfoNV#lowLatencyBoost} field. */
        public VkLatencySleepModeInfoNV.Buffer lowLatencyBoost(@NativeType("VkBool32") boolean value) { VkLatencySleepModeInfoNV.nlowLatencyBoost(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@link VkLatencySleepModeInfoNV#minimumIntervalUs} field. */
        public VkLatencySleepModeInfoNV.Buffer minimumIntervalUs(@NativeType("uint32_t") int value) { VkLatencySleepModeInfoNV.nminimumIntervalUs(address(), value); return this; }

    }

}