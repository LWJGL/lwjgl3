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
 * struct VkGpaDeviceGetClockInfoAMD {
 *     VkStructureType sType;
 *     void * pNext;
 *     float memoryClockRatioToPeak;
 *     float engineClockRatioToPeak;
 *     uint32_t memoryClockFrequency;
 *     uint32_t engineClockFrequency;
 * }}</pre>
 */
public class VkGpaDeviceGetClockInfoAMD extends Struct<VkGpaDeviceGetClockInfoAMD> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        MEMORYCLOCKRATIOTOPEAK,
        ENGINECLOCKRATIOTOPEAK,
        MEMORYCLOCKFREQUENCY,
        ENGINECLOCKFREQUENCY;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(4),
            __member(4),
            __member(4),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        MEMORYCLOCKRATIOTOPEAK = layout.offsetof(2);
        ENGINECLOCKRATIOTOPEAK = layout.offsetof(3);
        MEMORYCLOCKFREQUENCY = layout.offsetof(4);
        ENGINECLOCKFREQUENCY = layout.offsetof(5);
    }

    protected VkGpaDeviceGetClockInfoAMD(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkGpaDeviceGetClockInfoAMD create(long address, @Nullable ByteBuffer container) {
        return new VkGpaDeviceGetClockInfoAMD(address, container);
    }

    /**
     * Creates a {@code VkGpaDeviceGetClockInfoAMD} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkGpaDeviceGetClockInfoAMD(ByteBuffer container) {
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
    /** @return the value of the {@code memoryClockRatioToPeak} field. */
    public float memoryClockRatioToPeak() { return nmemoryClockRatioToPeak(address()); }
    /** @return the value of the {@code engineClockRatioToPeak} field. */
    public float engineClockRatioToPeak() { return nengineClockRatioToPeak(address()); }
    /** @return the value of the {@code memoryClockFrequency} field. */
    @NativeType("uint32_t")
    public int memoryClockFrequency() { return nmemoryClockFrequency(address()); }
    /** @return the value of the {@code engineClockFrequency} field. */
    @NativeType("uint32_t")
    public int engineClockFrequency() { return nengineClockFrequency(address()); }

    /** Sets the specified value to the {@code sType} field. */
    public VkGpaDeviceGetClockInfoAMD sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link AMDGpaInterface#VK_STRUCTURE_TYPE_GPA_DEVICE_GET_CLOCK_INFO_AMD STRUCTURE_TYPE_GPA_DEVICE_GET_CLOCK_INFO_AMD} value to the {@code sType} field. */
    public VkGpaDeviceGetClockInfoAMD sType$Default() { return sType(AMDGpaInterface.VK_STRUCTURE_TYPE_GPA_DEVICE_GET_CLOCK_INFO_AMD); }
    /** Sets the specified value to the {@code pNext} field. */
    public VkGpaDeviceGetClockInfoAMD pNext(@NativeType("void *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@code memoryClockRatioToPeak} field. */
    public VkGpaDeviceGetClockInfoAMD memoryClockRatioToPeak(float value) { nmemoryClockRatioToPeak(address(), value); return this; }
    /** Sets the specified value to the {@code engineClockRatioToPeak} field. */
    public VkGpaDeviceGetClockInfoAMD engineClockRatioToPeak(float value) { nengineClockRatioToPeak(address(), value); return this; }
    /** Sets the specified value to the {@code memoryClockFrequency} field. */
    public VkGpaDeviceGetClockInfoAMD memoryClockFrequency(@NativeType("uint32_t") int value) { nmemoryClockFrequency(address(), value); return this; }
    /** Sets the specified value to the {@code engineClockFrequency} field. */
    public VkGpaDeviceGetClockInfoAMD engineClockFrequency(@NativeType("uint32_t") int value) { nengineClockFrequency(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkGpaDeviceGetClockInfoAMD set(
        int sType,
        long pNext,
        float memoryClockRatioToPeak,
        float engineClockRatioToPeak,
        int memoryClockFrequency,
        int engineClockFrequency
    ) {
        sType(sType);
        pNext(pNext);
        memoryClockRatioToPeak(memoryClockRatioToPeak);
        engineClockRatioToPeak(engineClockRatioToPeak);
        memoryClockFrequency(memoryClockFrequency);
        engineClockFrequency(engineClockFrequency);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkGpaDeviceGetClockInfoAMD set(VkGpaDeviceGetClockInfoAMD src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkGpaDeviceGetClockInfoAMD} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkGpaDeviceGetClockInfoAMD malloc() {
        return new VkGpaDeviceGetClockInfoAMD(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkGpaDeviceGetClockInfoAMD} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkGpaDeviceGetClockInfoAMD calloc() {
        return new VkGpaDeviceGetClockInfoAMD(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkGpaDeviceGetClockInfoAMD} instance allocated with {@link BufferUtils}. */
    public static VkGpaDeviceGetClockInfoAMD create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkGpaDeviceGetClockInfoAMD(memAddress(container), container);
    }

    /** Returns a new {@code VkGpaDeviceGetClockInfoAMD} instance for the specified memory address. */
    public static VkGpaDeviceGetClockInfoAMD create(long address) {
        return new VkGpaDeviceGetClockInfoAMD(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable VkGpaDeviceGetClockInfoAMD createSafe(long address) {
        return address == NULL ? null : new VkGpaDeviceGetClockInfoAMD(address, null);
    }

    /**
     * Returns a new {@link VkGpaDeviceGetClockInfoAMD.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkGpaDeviceGetClockInfoAMD.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkGpaDeviceGetClockInfoAMD.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkGpaDeviceGetClockInfoAMD.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkGpaDeviceGetClockInfoAMD.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkGpaDeviceGetClockInfoAMD.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkGpaDeviceGetClockInfoAMD.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkGpaDeviceGetClockInfoAMD.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static VkGpaDeviceGetClockInfoAMD.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code VkGpaDeviceGetClockInfoAMD} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkGpaDeviceGetClockInfoAMD malloc(MemoryStack stack) {
        return new VkGpaDeviceGetClockInfoAMD(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkGpaDeviceGetClockInfoAMD} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkGpaDeviceGetClockInfoAMD calloc(MemoryStack stack) {
        return new VkGpaDeviceGetClockInfoAMD(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkGpaDeviceGetClockInfoAMD.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkGpaDeviceGetClockInfoAMD.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkGpaDeviceGetClockInfoAMD.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkGpaDeviceGetClockInfoAMD.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return memGetInt(struct + VkGpaDeviceGetClockInfoAMD.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkGpaDeviceGetClockInfoAMD.PNEXT); }
    /** Unsafe version of {@link #memoryClockRatioToPeak}. */
    public static float nmemoryClockRatioToPeak(long struct) { return memGetFloat(struct + VkGpaDeviceGetClockInfoAMD.MEMORYCLOCKRATIOTOPEAK); }
    /** Unsafe version of {@link #engineClockRatioToPeak}. */
    public static float nengineClockRatioToPeak(long struct) { return memGetFloat(struct + VkGpaDeviceGetClockInfoAMD.ENGINECLOCKRATIOTOPEAK); }
    /** Unsafe version of {@link #memoryClockFrequency}. */
    public static int nmemoryClockFrequency(long struct) { return memGetInt(struct + VkGpaDeviceGetClockInfoAMD.MEMORYCLOCKFREQUENCY); }
    /** Unsafe version of {@link #engineClockFrequency}. */
    public static int nengineClockFrequency(long struct) { return memGetInt(struct + VkGpaDeviceGetClockInfoAMD.ENGINECLOCKFREQUENCY); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { memPutInt(struct + VkGpaDeviceGetClockInfoAMD.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkGpaDeviceGetClockInfoAMD.PNEXT, value); }
    /** Unsafe version of {@link #memoryClockRatioToPeak(float) memoryClockRatioToPeak}. */
    public static void nmemoryClockRatioToPeak(long struct, float value) { memPutFloat(struct + VkGpaDeviceGetClockInfoAMD.MEMORYCLOCKRATIOTOPEAK, value); }
    /** Unsafe version of {@link #engineClockRatioToPeak(float) engineClockRatioToPeak}. */
    public static void nengineClockRatioToPeak(long struct, float value) { memPutFloat(struct + VkGpaDeviceGetClockInfoAMD.ENGINECLOCKRATIOTOPEAK, value); }
    /** Unsafe version of {@link #memoryClockFrequency(int) memoryClockFrequency}. */
    public static void nmemoryClockFrequency(long struct, int value) { memPutInt(struct + VkGpaDeviceGetClockInfoAMD.MEMORYCLOCKFREQUENCY, value); }
    /** Unsafe version of {@link #engineClockFrequency(int) engineClockFrequency}. */
    public static void nengineClockFrequency(long struct, int value) { memPutInt(struct + VkGpaDeviceGetClockInfoAMD.ENGINECLOCKFREQUENCY, value); }

    // -----------------------------------

    /** An array of {@link VkGpaDeviceGetClockInfoAMD} structs. */
    public static class Buffer extends StructBuffer<VkGpaDeviceGetClockInfoAMD, Buffer> implements NativeResource {

        private static final VkGpaDeviceGetClockInfoAMD ELEMENT_FACTORY = VkGpaDeviceGetClockInfoAMD.create(-1L);

        /**
         * Creates a new {@code VkGpaDeviceGetClockInfoAMD.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkGpaDeviceGetClockInfoAMD#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkGpaDeviceGetClockInfoAMD getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkGpaDeviceGetClockInfoAMD.nsType(address()); }
        /** @return the value of the {@code pNext} field. */
        @NativeType("void *")
        public long pNext() { return VkGpaDeviceGetClockInfoAMD.npNext(address()); }
        /** @return the value of the {@code memoryClockRatioToPeak} field. */
        public float memoryClockRatioToPeak() { return VkGpaDeviceGetClockInfoAMD.nmemoryClockRatioToPeak(address()); }
        /** @return the value of the {@code engineClockRatioToPeak} field. */
        public float engineClockRatioToPeak() { return VkGpaDeviceGetClockInfoAMD.nengineClockRatioToPeak(address()); }
        /** @return the value of the {@code memoryClockFrequency} field. */
        @NativeType("uint32_t")
        public int memoryClockFrequency() { return VkGpaDeviceGetClockInfoAMD.nmemoryClockFrequency(address()); }
        /** @return the value of the {@code engineClockFrequency} field. */
        @NativeType("uint32_t")
        public int engineClockFrequency() { return VkGpaDeviceGetClockInfoAMD.nengineClockFrequency(address()); }

        /** Sets the specified value to the {@code sType} field. */
        public VkGpaDeviceGetClockInfoAMD.Buffer sType(@NativeType("VkStructureType") int value) { VkGpaDeviceGetClockInfoAMD.nsType(address(), value); return this; }
        /** Sets the {@link AMDGpaInterface#VK_STRUCTURE_TYPE_GPA_DEVICE_GET_CLOCK_INFO_AMD STRUCTURE_TYPE_GPA_DEVICE_GET_CLOCK_INFO_AMD} value to the {@code sType} field. */
        public VkGpaDeviceGetClockInfoAMD.Buffer sType$Default() { return sType(AMDGpaInterface.VK_STRUCTURE_TYPE_GPA_DEVICE_GET_CLOCK_INFO_AMD); }
        /** Sets the specified value to the {@code pNext} field. */
        public VkGpaDeviceGetClockInfoAMD.Buffer pNext(@NativeType("void *") long value) { VkGpaDeviceGetClockInfoAMD.npNext(address(), value); return this; }
        /** Sets the specified value to the {@code memoryClockRatioToPeak} field. */
        public VkGpaDeviceGetClockInfoAMD.Buffer memoryClockRatioToPeak(float value) { VkGpaDeviceGetClockInfoAMD.nmemoryClockRatioToPeak(address(), value); return this; }
        /** Sets the specified value to the {@code engineClockRatioToPeak} field. */
        public VkGpaDeviceGetClockInfoAMD.Buffer engineClockRatioToPeak(float value) { VkGpaDeviceGetClockInfoAMD.nengineClockRatioToPeak(address(), value); return this; }
        /** Sets the specified value to the {@code memoryClockFrequency} field. */
        public VkGpaDeviceGetClockInfoAMD.Buffer memoryClockFrequency(@NativeType("uint32_t") int value) { VkGpaDeviceGetClockInfoAMD.nmemoryClockFrequency(address(), value); return this; }
        /** Sets the specified value to the {@code engineClockFrequency} field. */
        public VkGpaDeviceGetClockInfoAMD.Buffer engineClockFrequency(@NativeType("uint32_t") int value) { VkGpaDeviceGetClockInfoAMD.nengineClockFrequency(address(), value); return this; }

    }

}