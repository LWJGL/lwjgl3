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
 * struct VkPhysicalDeviceGpaFeaturesAMD {
 *     VkStructureType sType;
 *     void * pNext;
 *     VkBool32 perfCounters;
 *     VkBool32 streamingPerfCounters;
 *     VkBool32 sqThreadTracing;
 *     VkBool32 clockModes;
 * }}</pre>
 */
public class VkPhysicalDeviceGpaFeaturesAMD extends Struct<VkPhysicalDeviceGpaFeaturesAMD> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        PERFCOUNTERS,
        STREAMINGPERFCOUNTERS,
        SQTHREADTRACING,
        CLOCKMODES;

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
        PERFCOUNTERS = layout.offsetof(2);
        STREAMINGPERFCOUNTERS = layout.offsetof(3);
        SQTHREADTRACING = layout.offsetof(4);
        CLOCKMODES = layout.offsetof(5);
    }

    protected VkPhysicalDeviceGpaFeaturesAMD(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkPhysicalDeviceGpaFeaturesAMD create(long address, @Nullable ByteBuffer container) {
        return new VkPhysicalDeviceGpaFeaturesAMD(address, container);
    }

    /**
     * Creates a {@code VkPhysicalDeviceGpaFeaturesAMD} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkPhysicalDeviceGpaFeaturesAMD(ByteBuffer container) {
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
    /** @return the value of the {@code perfCounters} field. */
    @NativeType("VkBool32")
    public boolean perfCounters() { return nperfCounters(address()) != 0; }
    /** @return the value of the {@code streamingPerfCounters} field. */
    @NativeType("VkBool32")
    public boolean streamingPerfCounters() { return nstreamingPerfCounters(address()) != 0; }
    /** @return the value of the {@code sqThreadTracing} field. */
    @NativeType("VkBool32")
    public boolean sqThreadTracing() { return nsqThreadTracing(address()) != 0; }
    /** @return the value of the {@code clockModes} field. */
    @NativeType("VkBool32")
    public boolean clockModes() { return nclockModes(address()) != 0; }

    /** Sets the specified value to the {@code sType} field. */
    public VkPhysicalDeviceGpaFeaturesAMD sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link AMDGpaInterface#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_GPA_FEATURES_AMD STRUCTURE_TYPE_PHYSICAL_DEVICE_GPA_FEATURES_AMD} value to the {@code sType} field. */
    public VkPhysicalDeviceGpaFeaturesAMD sType$Default() { return sType(AMDGpaInterface.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_GPA_FEATURES_AMD); }
    /** Sets the specified value to the {@code pNext} field. */
    public VkPhysicalDeviceGpaFeaturesAMD pNext(@NativeType("void *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@code perfCounters} field. */
    public VkPhysicalDeviceGpaFeaturesAMD perfCounters(@NativeType("VkBool32") boolean value) { nperfCounters(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@code streamingPerfCounters} field. */
    public VkPhysicalDeviceGpaFeaturesAMD streamingPerfCounters(@NativeType("VkBool32") boolean value) { nstreamingPerfCounters(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@code sqThreadTracing} field. */
    public VkPhysicalDeviceGpaFeaturesAMD sqThreadTracing(@NativeType("VkBool32") boolean value) { nsqThreadTracing(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@code clockModes} field. */
    public VkPhysicalDeviceGpaFeaturesAMD clockModes(@NativeType("VkBool32") boolean value) { nclockModes(address(), value ? 1 : 0); return this; }

    /** Initializes this struct with the specified values. */
    public VkPhysicalDeviceGpaFeaturesAMD set(
        int sType,
        long pNext,
        boolean perfCounters,
        boolean streamingPerfCounters,
        boolean sqThreadTracing,
        boolean clockModes
    ) {
        sType(sType);
        pNext(pNext);
        perfCounters(perfCounters);
        streamingPerfCounters(streamingPerfCounters);
        sqThreadTracing(sqThreadTracing);
        clockModes(clockModes);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkPhysicalDeviceGpaFeaturesAMD set(VkPhysicalDeviceGpaFeaturesAMD src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkPhysicalDeviceGpaFeaturesAMD} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkPhysicalDeviceGpaFeaturesAMD malloc() {
        return new VkPhysicalDeviceGpaFeaturesAMD(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkPhysicalDeviceGpaFeaturesAMD} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkPhysicalDeviceGpaFeaturesAMD calloc() {
        return new VkPhysicalDeviceGpaFeaturesAMD(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkPhysicalDeviceGpaFeaturesAMD} instance allocated with {@link BufferUtils}. */
    public static VkPhysicalDeviceGpaFeaturesAMD create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkPhysicalDeviceGpaFeaturesAMD(memAddress(container), container);
    }

    /** Returns a new {@code VkPhysicalDeviceGpaFeaturesAMD} instance for the specified memory address. */
    public static VkPhysicalDeviceGpaFeaturesAMD create(long address) {
        return new VkPhysicalDeviceGpaFeaturesAMD(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable VkPhysicalDeviceGpaFeaturesAMD createSafe(long address) {
        return address == NULL ? null : new VkPhysicalDeviceGpaFeaturesAMD(address, null);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceGpaFeaturesAMD.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceGpaFeaturesAMD.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceGpaFeaturesAMD.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceGpaFeaturesAMD.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceGpaFeaturesAMD.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceGpaFeaturesAMD.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkPhysicalDeviceGpaFeaturesAMD.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceGpaFeaturesAMD.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static VkPhysicalDeviceGpaFeaturesAMD.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code VkPhysicalDeviceGpaFeaturesAMD} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDeviceGpaFeaturesAMD malloc(MemoryStack stack) {
        return new VkPhysicalDeviceGpaFeaturesAMD(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkPhysicalDeviceGpaFeaturesAMD} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDeviceGpaFeaturesAMD calloc(MemoryStack stack) {
        return new VkPhysicalDeviceGpaFeaturesAMD(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceGpaFeaturesAMD.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceGpaFeaturesAMD.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceGpaFeaturesAMD.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceGpaFeaturesAMD.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return memGetInt(struct + VkPhysicalDeviceGpaFeaturesAMD.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkPhysicalDeviceGpaFeaturesAMD.PNEXT); }
    /** Unsafe version of {@link #perfCounters}. */
    public static int nperfCounters(long struct) { return memGetInt(struct + VkPhysicalDeviceGpaFeaturesAMD.PERFCOUNTERS); }
    /** Unsafe version of {@link #streamingPerfCounters}. */
    public static int nstreamingPerfCounters(long struct) { return memGetInt(struct + VkPhysicalDeviceGpaFeaturesAMD.STREAMINGPERFCOUNTERS); }
    /** Unsafe version of {@link #sqThreadTracing}. */
    public static int nsqThreadTracing(long struct) { return memGetInt(struct + VkPhysicalDeviceGpaFeaturesAMD.SQTHREADTRACING); }
    /** Unsafe version of {@link #clockModes}. */
    public static int nclockModes(long struct) { return memGetInt(struct + VkPhysicalDeviceGpaFeaturesAMD.CLOCKMODES); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { memPutInt(struct + VkPhysicalDeviceGpaFeaturesAMD.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkPhysicalDeviceGpaFeaturesAMD.PNEXT, value); }
    /** Unsafe version of {@link #perfCounters(boolean) perfCounters}. */
    public static void nperfCounters(long struct, int value) { memPutInt(struct + VkPhysicalDeviceGpaFeaturesAMD.PERFCOUNTERS, value); }
    /** Unsafe version of {@link #streamingPerfCounters(boolean) streamingPerfCounters}. */
    public static void nstreamingPerfCounters(long struct, int value) { memPutInt(struct + VkPhysicalDeviceGpaFeaturesAMD.STREAMINGPERFCOUNTERS, value); }
    /** Unsafe version of {@link #sqThreadTracing(boolean) sqThreadTracing}. */
    public static void nsqThreadTracing(long struct, int value) { memPutInt(struct + VkPhysicalDeviceGpaFeaturesAMD.SQTHREADTRACING, value); }
    /** Unsafe version of {@link #clockModes(boolean) clockModes}. */
    public static void nclockModes(long struct, int value) { memPutInt(struct + VkPhysicalDeviceGpaFeaturesAMD.CLOCKMODES, value); }

    // -----------------------------------

    /** An array of {@link VkPhysicalDeviceGpaFeaturesAMD} structs. */
    public static class Buffer extends StructBuffer<VkPhysicalDeviceGpaFeaturesAMD, Buffer> implements NativeResource {

        private static final VkPhysicalDeviceGpaFeaturesAMD ELEMENT_FACTORY = VkPhysicalDeviceGpaFeaturesAMD.create(-1L);

        /**
         * Creates a new {@code VkPhysicalDeviceGpaFeaturesAMD.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkPhysicalDeviceGpaFeaturesAMD#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkPhysicalDeviceGpaFeaturesAMD getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkPhysicalDeviceGpaFeaturesAMD.nsType(address()); }
        /** @return the value of the {@code pNext} field. */
        @NativeType("void *")
        public long pNext() { return VkPhysicalDeviceGpaFeaturesAMD.npNext(address()); }
        /** @return the value of the {@code perfCounters} field. */
        @NativeType("VkBool32")
        public boolean perfCounters() { return VkPhysicalDeviceGpaFeaturesAMD.nperfCounters(address()) != 0; }
        /** @return the value of the {@code streamingPerfCounters} field. */
        @NativeType("VkBool32")
        public boolean streamingPerfCounters() { return VkPhysicalDeviceGpaFeaturesAMD.nstreamingPerfCounters(address()) != 0; }
        /** @return the value of the {@code sqThreadTracing} field. */
        @NativeType("VkBool32")
        public boolean sqThreadTracing() { return VkPhysicalDeviceGpaFeaturesAMD.nsqThreadTracing(address()) != 0; }
        /** @return the value of the {@code clockModes} field. */
        @NativeType("VkBool32")
        public boolean clockModes() { return VkPhysicalDeviceGpaFeaturesAMD.nclockModes(address()) != 0; }

        /** Sets the specified value to the {@code sType} field. */
        public VkPhysicalDeviceGpaFeaturesAMD.Buffer sType(@NativeType("VkStructureType") int value) { VkPhysicalDeviceGpaFeaturesAMD.nsType(address(), value); return this; }
        /** Sets the {@link AMDGpaInterface#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_GPA_FEATURES_AMD STRUCTURE_TYPE_PHYSICAL_DEVICE_GPA_FEATURES_AMD} value to the {@code sType} field. */
        public VkPhysicalDeviceGpaFeaturesAMD.Buffer sType$Default() { return sType(AMDGpaInterface.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_GPA_FEATURES_AMD); }
        /** Sets the specified value to the {@code pNext} field. */
        public VkPhysicalDeviceGpaFeaturesAMD.Buffer pNext(@NativeType("void *") long value) { VkPhysicalDeviceGpaFeaturesAMD.npNext(address(), value); return this; }
        /** Sets the specified value to the {@code perfCounters} field. */
        public VkPhysicalDeviceGpaFeaturesAMD.Buffer perfCounters(@NativeType("VkBool32") boolean value) { VkPhysicalDeviceGpaFeaturesAMD.nperfCounters(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@code streamingPerfCounters} field. */
        public VkPhysicalDeviceGpaFeaturesAMD.Buffer streamingPerfCounters(@NativeType("VkBool32") boolean value) { VkPhysicalDeviceGpaFeaturesAMD.nstreamingPerfCounters(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@code sqThreadTracing} field. */
        public VkPhysicalDeviceGpaFeaturesAMD.Buffer sqThreadTracing(@NativeType("VkBool32") boolean value) { VkPhysicalDeviceGpaFeaturesAMD.nsqThreadTracing(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@code clockModes} field. */
        public VkPhysicalDeviceGpaFeaturesAMD.Buffer clockModes(@NativeType("VkBool32") boolean value) { VkPhysicalDeviceGpaFeaturesAMD.nclockModes(address(), value ? 1 : 0); return this; }

    }

}