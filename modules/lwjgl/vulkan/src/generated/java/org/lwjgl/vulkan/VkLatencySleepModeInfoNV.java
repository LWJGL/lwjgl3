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
 * struct VkLatencySleepModeInfoNV {
 *     VkStructureType sType;
 *     void const * pNext;
 *     VkBool32 lowLatencyMode;
 *     VkBool32 lowLatencyBoost;
 *     uint32_t minimumIntervalUs;
 * }}</pre>
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

    /** @return the value of the {@code sType} field. */
    @NativeType("VkStructureType")
    public int sType() { return nsType(address()); }
    /** @return the value of the {@code pNext} field. */
    @NativeType("void const *")
    public long pNext() { return npNext(address()); }
    /** @return the value of the {@code lowLatencyMode} field. */
    @NativeType("VkBool32")
    public boolean lowLatencyMode() { return nlowLatencyMode(address()) != 0; }
    /** @return the value of the {@code lowLatencyBoost} field. */
    @NativeType("VkBool32")
    public boolean lowLatencyBoost() { return nlowLatencyBoost(address()) != 0; }
    /** @return the value of the {@code minimumIntervalUs} field. */
    @NativeType("uint32_t")
    public int minimumIntervalUs() { return nminimumIntervalUs(address()); }

    /** Sets the specified value to the {@code sType} field. */
    public VkLatencySleepModeInfoNV sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link NVLowLatency2#VK_STRUCTURE_TYPE_LATENCY_SLEEP_MODE_INFO_NV STRUCTURE_TYPE_LATENCY_SLEEP_MODE_INFO_NV} value to the {@code sType} field. */
    public VkLatencySleepModeInfoNV sType$Default() { return sType(NVLowLatency2.VK_STRUCTURE_TYPE_LATENCY_SLEEP_MODE_INFO_NV); }
    /** Sets the specified value to the {@code pNext} field. */
    public VkLatencySleepModeInfoNV pNext(@NativeType("void const *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@code lowLatencyMode} field. */
    public VkLatencySleepModeInfoNV lowLatencyMode(@NativeType("VkBool32") boolean value) { nlowLatencyMode(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@code lowLatencyBoost} field. */
    public VkLatencySleepModeInfoNV lowLatencyBoost(@NativeType("VkBool32") boolean value) { nlowLatencyBoost(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@code minimumIntervalUs} field. */
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
    public static @Nullable VkLatencySleepModeInfoNV createSafe(long address) {
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
    public static VkLatencySleepModeInfoNV.@Nullable Buffer createSafe(long address, int capacity) {
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
    public static int nsType(long struct) { return memGetInt(struct + VkLatencySleepModeInfoNV.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkLatencySleepModeInfoNV.PNEXT); }
    /** Unsafe version of {@link #lowLatencyMode}. */
    public static int nlowLatencyMode(long struct) { return memGetInt(struct + VkLatencySleepModeInfoNV.LOWLATENCYMODE); }
    /** Unsafe version of {@link #lowLatencyBoost}. */
    public static int nlowLatencyBoost(long struct) { return memGetInt(struct + VkLatencySleepModeInfoNV.LOWLATENCYBOOST); }
    /** Unsafe version of {@link #minimumIntervalUs}. */
    public static int nminimumIntervalUs(long struct) { return memGetInt(struct + VkLatencySleepModeInfoNV.MINIMUMINTERVALUS); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { memPutInt(struct + VkLatencySleepModeInfoNV.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkLatencySleepModeInfoNV.PNEXT, value); }
    /** Unsafe version of {@link #lowLatencyMode(boolean) lowLatencyMode}. */
    public static void nlowLatencyMode(long struct, int value) { memPutInt(struct + VkLatencySleepModeInfoNV.LOWLATENCYMODE, value); }
    /** Unsafe version of {@link #lowLatencyBoost(boolean) lowLatencyBoost}. */
    public static void nlowLatencyBoost(long struct, int value) { memPutInt(struct + VkLatencySleepModeInfoNV.LOWLATENCYBOOST, value); }
    /** Unsafe version of {@link #minimumIntervalUs(int) minimumIntervalUs}. */
    public static void nminimumIntervalUs(long struct, int value) { memPutInt(struct + VkLatencySleepModeInfoNV.MINIMUMINTERVALUS, value); }

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
        protected Buffer create(long address, @Nullable ByteBuffer container, int mark, int position, int limit, int capacity) {
            return new Buffer(address, container, mark, position, limit, capacity);
        }

        @Override
        protected VkLatencySleepModeInfoNV getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkLatencySleepModeInfoNV.nsType(address()); }
        /** @return the value of the {@code pNext} field. */
        @NativeType("void const *")
        public long pNext() { return VkLatencySleepModeInfoNV.npNext(address()); }
        /** @return the value of the {@code lowLatencyMode} field. */
        @NativeType("VkBool32")
        public boolean lowLatencyMode() { return VkLatencySleepModeInfoNV.nlowLatencyMode(address()) != 0; }
        /** @return the value of the {@code lowLatencyBoost} field. */
        @NativeType("VkBool32")
        public boolean lowLatencyBoost() { return VkLatencySleepModeInfoNV.nlowLatencyBoost(address()) != 0; }
        /** @return the value of the {@code minimumIntervalUs} field. */
        @NativeType("uint32_t")
        public int minimumIntervalUs() { return VkLatencySleepModeInfoNV.nminimumIntervalUs(address()); }

        /** Sets the specified value to the {@code sType} field. */
        public VkLatencySleepModeInfoNV.Buffer sType(@NativeType("VkStructureType") int value) { VkLatencySleepModeInfoNV.nsType(address(), value); return this; }
        /** Sets the {@link NVLowLatency2#VK_STRUCTURE_TYPE_LATENCY_SLEEP_MODE_INFO_NV STRUCTURE_TYPE_LATENCY_SLEEP_MODE_INFO_NV} value to the {@code sType} field. */
        public VkLatencySleepModeInfoNV.Buffer sType$Default() { return sType(NVLowLatency2.VK_STRUCTURE_TYPE_LATENCY_SLEEP_MODE_INFO_NV); }
        /** Sets the specified value to the {@code pNext} field. */
        public VkLatencySleepModeInfoNV.Buffer pNext(@NativeType("void const *") long value) { VkLatencySleepModeInfoNV.npNext(address(), value); return this; }
        /** Sets the specified value to the {@code lowLatencyMode} field. */
        public VkLatencySleepModeInfoNV.Buffer lowLatencyMode(@NativeType("VkBool32") boolean value) { VkLatencySleepModeInfoNV.nlowLatencyMode(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@code lowLatencyBoost} field. */
        public VkLatencySleepModeInfoNV.Buffer lowLatencyBoost(@NativeType("VkBool32") boolean value) { VkLatencySleepModeInfoNV.nlowLatencyBoost(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@code minimumIntervalUs} field. */
        public VkLatencySleepModeInfoNV.Buffer minimumIntervalUs(@NativeType("uint32_t") int value) { VkLatencySleepModeInfoNV.nminimumIntervalUs(address(), value); return this; }

    }

}