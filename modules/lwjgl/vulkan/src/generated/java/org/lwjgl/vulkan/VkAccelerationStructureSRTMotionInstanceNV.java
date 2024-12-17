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
 * struct VkAccelerationStructureSRTMotionInstanceNV {
 *     {@link VkSRTDataNV VkSRTDataNV} transformT0;
 *     {@link VkSRTDataNV VkSRTDataNV} transformT1;
 *     uint32_t instanceCustomIndex : 24;
 *     uint32_t mask : 8;
 *     uint32_t instanceShaderBindingTableRecordOffset : 24;
 *     VkGeometryInstanceFlagsKHR flags : 8;
 *     uint64_t accelerationStructureReference;
 * }}</pre>
 */
public class VkAccelerationStructureSRTMotionInstanceNV extends Struct<VkAccelerationStructureSRTMotionInstanceNV> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        TRANSFORMT0,
        TRANSFORMT1,
        BITFIELD0,
        BITFIELD1,
        ACCELERATIONSTRUCTUREREFERENCE;

    static {
        Layout layout = __struct(
            __member(VkSRTDataNV.SIZEOF, VkSRTDataNV.ALIGNOF),
            __member(VkSRTDataNV.SIZEOF, VkSRTDataNV.ALIGNOF),
            __member(4),
            __member(4),
            __member(8)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        TRANSFORMT0 = layout.offsetof(0);
        TRANSFORMT1 = layout.offsetof(1);
        BITFIELD0 = layout.offsetof(2);
        BITFIELD1 = layout.offsetof(3);
        ACCELERATIONSTRUCTUREREFERENCE = layout.offsetof(4);
    }

    protected VkAccelerationStructureSRTMotionInstanceNV(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkAccelerationStructureSRTMotionInstanceNV create(long address, @Nullable ByteBuffer container) {
        return new VkAccelerationStructureSRTMotionInstanceNV(address, container);
    }

    /**
     * Creates a {@code VkAccelerationStructureSRTMotionInstanceNV} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkAccelerationStructureSRTMotionInstanceNV(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return a {@link VkSRTDataNV} view of the {@code transformT0} field. */
    public VkSRTDataNV transformT0() { return ntransformT0(address()); }
    /** @return a {@link VkSRTDataNV} view of the {@code transformT1} field. */
    public VkSRTDataNV transformT1() { return ntransformT1(address()); }
    /** @return the value of the {@code instanceCustomIndex} field. */
    @NativeType("uint32_t")
    public int instanceCustomIndex() { return ninstanceCustomIndex(address()); }
    /** @return the value of the {@code mask} field. */
    @NativeType("uint32_t")
    public int mask() { return nmask(address()); }
    /** @return the value of the {@code instanceShaderBindingTableRecordOffset} field. */
    @NativeType("uint32_t")
    public int instanceShaderBindingTableRecordOffset() { return ninstanceShaderBindingTableRecordOffset(address()); }
    /** @return the value of the {@code flags} field. */
    @NativeType("VkGeometryInstanceFlagsKHR")
    public int flags() { return nflags(address()); }
    /** @return the value of the {@code accelerationStructureReference} field. */
    @NativeType("uint64_t")
    public long accelerationStructureReference() { return naccelerationStructureReference(address()); }

    /** Copies the specified {@link VkSRTDataNV} to the {@code transformT0} field. */
    public VkAccelerationStructureSRTMotionInstanceNV transformT0(VkSRTDataNV value) { ntransformT0(address(), value); return this; }
    /** Passes the {@code transformT0} field to the specified {@link java.util.function.Consumer Consumer}. */
    public VkAccelerationStructureSRTMotionInstanceNV transformT0(java.util.function.Consumer<VkSRTDataNV> consumer) { consumer.accept(transformT0()); return this; }
    /** Copies the specified {@link VkSRTDataNV} to the {@code transformT1} field. */
    public VkAccelerationStructureSRTMotionInstanceNV transformT1(VkSRTDataNV value) { ntransformT1(address(), value); return this; }
    /** Passes the {@code transformT1} field to the specified {@link java.util.function.Consumer Consumer}. */
    public VkAccelerationStructureSRTMotionInstanceNV transformT1(java.util.function.Consumer<VkSRTDataNV> consumer) { consumer.accept(transformT1()); return this; }
    /** Sets the specified value to the {@code instanceCustomIndex} field. */
    public VkAccelerationStructureSRTMotionInstanceNV instanceCustomIndex(@NativeType("uint32_t") int value) { ninstanceCustomIndex(address(), value); return this; }
    /** Sets the specified value to the {@code mask} field. */
    public VkAccelerationStructureSRTMotionInstanceNV mask(@NativeType("uint32_t") int value) { nmask(address(), value); return this; }
    /** Sets the specified value to the {@code instanceShaderBindingTableRecordOffset} field. */
    public VkAccelerationStructureSRTMotionInstanceNV instanceShaderBindingTableRecordOffset(@NativeType("uint32_t") int value) { ninstanceShaderBindingTableRecordOffset(address(), value); return this; }
    /** Sets the specified value to the {@code flags} field. */
    public VkAccelerationStructureSRTMotionInstanceNV flags(@NativeType("VkGeometryInstanceFlagsKHR") int value) { nflags(address(), value); return this; }
    /** Sets the specified value to the {@code accelerationStructureReference} field. */
    public VkAccelerationStructureSRTMotionInstanceNV accelerationStructureReference(@NativeType("uint64_t") long value) { naccelerationStructureReference(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkAccelerationStructureSRTMotionInstanceNV set(
        VkSRTDataNV transformT0,
        VkSRTDataNV transformT1,
        int instanceCustomIndex,
        int mask,
        int instanceShaderBindingTableRecordOffset,
        int flags,
        long accelerationStructureReference
    ) {
        transformT0(transformT0);
        transformT1(transformT1);
        instanceCustomIndex(instanceCustomIndex);
        mask(mask);
        instanceShaderBindingTableRecordOffset(instanceShaderBindingTableRecordOffset);
        flags(flags);
        accelerationStructureReference(accelerationStructureReference);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkAccelerationStructureSRTMotionInstanceNV set(VkAccelerationStructureSRTMotionInstanceNV src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkAccelerationStructureSRTMotionInstanceNV} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkAccelerationStructureSRTMotionInstanceNV malloc() {
        return new VkAccelerationStructureSRTMotionInstanceNV(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkAccelerationStructureSRTMotionInstanceNV} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkAccelerationStructureSRTMotionInstanceNV calloc() {
        return new VkAccelerationStructureSRTMotionInstanceNV(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkAccelerationStructureSRTMotionInstanceNV} instance allocated with {@link BufferUtils}. */
    public static VkAccelerationStructureSRTMotionInstanceNV create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkAccelerationStructureSRTMotionInstanceNV(memAddress(container), container);
    }

    /** Returns a new {@code VkAccelerationStructureSRTMotionInstanceNV} instance for the specified memory address. */
    public static VkAccelerationStructureSRTMotionInstanceNV create(long address) {
        return new VkAccelerationStructureSRTMotionInstanceNV(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable VkAccelerationStructureSRTMotionInstanceNV createSafe(long address) {
        return address == NULL ? null : new VkAccelerationStructureSRTMotionInstanceNV(address, null);
    }

    /**
     * Returns a new {@link VkAccelerationStructureSRTMotionInstanceNV.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkAccelerationStructureSRTMotionInstanceNV.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkAccelerationStructureSRTMotionInstanceNV.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkAccelerationStructureSRTMotionInstanceNV.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkAccelerationStructureSRTMotionInstanceNV.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkAccelerationStructureSRTMotionInstanceNV.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkAccelerationStructureSRTMotionInstanceNV.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkAccelerationStructureSRTMotionInstanceNV.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static VkAccelerationStructureSRTMotionInstanceNV.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code VkAccelerationStructureSRTMotionInstanceNV} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkAccelerationStructureSRTMotionInstanceNV malloc(MemoryStack stack) {
        return new VkAccelerationStructureSRTMotionInstanceNV(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkAccelerationStructureSRTMotionInstanceNV} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkAccelerationStructureSRTMotionInstanceNV calloc(MemoryStack stack) {
        return new VkAccelerationStructureSRTMotionInstanceNV(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkAccelerationStructureSRTMotionInstanceNV.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkAccelerationStructureSRTMotionInstanceNV.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkAccelerationStructureSRTMotionInstanceNV.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkAccelerationStructureSRTMotionInstanceNV.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #transformT0}. */
    public static VkSRTDataNV ntransformT0(long struct) { return VkSRTDataNV.create(struct + VkAccelerationStructureSRTMotionInstanceNV.TRANSFORMT0); }
    /** Unsafe version of {@link #transformT1}. */
    public static VkSRTDataNV ntransformT1(long struct) { return VkSRTDataNV.create(struct + VkAccelerationStructureSRTMotionInstanceNV.TRANSFORMT1); }
    public static int nbitfield0(long struct) { return memGetInt(struct + VkAccelerationStructureSRTMotionInstanceNV.BITFIELD0); }
    /** Unsafe version of {@link #instanceCustomIndex}. */
    public static int ninstanceCustomIndex(long struct) { return nbitfield0(struct) & 0x00_FF_FF_FF; }
    /** Unsafe version of {@link #mask}. */
    public static int nmask(long struct) { return nbitfield0(struct) >>> 24; }
    public static int nbitfield1(long struct) { return memGetInt(struct + VkAccelerationStructureSRTMotionInstanceNV.BITFIELD1); }
    /** Unsafe version of {@link #instanceShaderBindingTableRecordOffset}. */
    public static int ninstanceShaderBindingTableRecordOffset(long struct) { return nbitfield1(struct) & 0x00_FF_FF_FF; }
    /** Unsafe version of {@link #flags}. */
    public static int nflags(long struct) { return nbitfield1(struct) >>> 24; }
    /** Unsafe version of {@link #accelerationStructureReference}. */
    public static long naccelerationStructureReference(long struct) { return memGetLong(struct + VkAccelerationStructureSRTMotionInstanceNV.ACCELERATIONSTRUCTUREREFERENCE); }

    /** Unsafe version of {@link #transformT0(VkSRTDataNV) transformT0}. */
    public static void ntransformT0(long struct, VkSRTDataNV value) { memCopy(value.address(), struct + VkAccelerationStructureSRTMotionInstanceNV.TRANSFORMT0, VkSRTDataNV.SIZEOF); }
    /** Unsafe version of {@link #transformT1(VkSRTDataNV) transformT1}. */
    public static void ntransformT1(long struct, VkSRTDataNV value) { memCopy(value.address(), struct + VkAccelerationStructureSRTMotionInstanceNV.TRANSFORMT1, VkSRTDataNV.SIZEOF); }
    public static void nbitfield0(long struct, int value) { memPutInt(struct + VkAccelerationStructureSRTMotionInstanceNV.BITFIELD0, value); }
    /** Unsafe version of {@link #instanceCustomIndex(int) instanceCustomIndex}. */
    public static void ninstanceCustomIndex(long struct, int value) { nbitfield0(struct, (nbitfield0(struct) & 0xFF_00_00_00) | (value & 0x00_FF_FF_FF)); }
    /** Unsafe version of {@link #mask(int) mask}. */
    public static void nmask(long struct, int value) { nbitfield0(struct, (value << 24) | (nbitfield0(struct) & 0x00_FF_FF_FF)); }
    public static void nbitfield1(long struct, int value) { memPutInt(struct + VkAccelerationStructureSRTMotionInstanceNV.BITFIELD1, value); }
    /** Unsafe version of {@link #instanceShaderBindingTableRecordOffset(int) instanceShaderBindingTableRecordOffset}. */
    public static void ninstanceShaderBindingTableRecordOffset(long struct, int value) { nbitfield1(struct, (nbitfield1(struct) & 0xFF_00_00_00) | (value & 0x00_FF_FF_FF)); }
    /** Unsafe version of {@link #flags(int) flags}. */
    public static void nflags(long struct, int value) { nbitfield1(struct, (value << 24) | (nbitfield1(struct) & 0x00_FF_FF_FF)); }
    /** Unsafe version of {@link #accelerationStructureReference(long) accelerationStructureReference}. */
    public static void naccelerationStructureReference(long struct, long value) { memPutLong(struct + VkAccelerationStructureSRTMotionInstanceNV.ACCELERATIONSTRUCTUREREFERENCE, value); }

    // -----------------------------------

    /** An array of {@link VkAccelerationStructureSRTMotionInstanceNV} structs. */
    public static class Buffer extends StructBuffer<VkAccelerationStructureSRTMotionInstanceNV, Buffer> implements NativeResource {

        private static final VkAccelerationStructureSRTMotionInstanceNV ELEMENT_FACTORY = VkAccelerationStructureSRTMotionInstanceNV.create(-1L);

        /**
         * Creates a new {@code VkAccelerationStructureSRTMotionInstanceNV.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkAccelerationStructureSRTMotionInstanceNV#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkAccelerationStructureSRTMotionInstanceNV getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return a {@link VkSRTDataNV} view of the {@code transformT0} field. */
        public VkSRTDataNV transformT0() { return VkAccelerationStructureSRTMotionInstanceNV.ntransformT0(address()); }
        /** @return a {@link VkSRTDataNV} view of the {@code transformT1} field. */
        public VkSRTDataNV transformT1() { return VkAccelerationStructureSRTMotionInstanceNV.ntransformT1(address()); }
        /** @return the value of the {@code instanceCustomIndex} field. */
        @NativeType("uint32_t")
        public int instanceCustomIndex() { return VkAccelerationStructureSRTMotionInstanceNV.ninstanceCustomIndex(address()); }
        /** @return the value of the {@code mask} field. */
        @NativeType("uint32_t")
        public int mask() { return VkAccelerationStructureSRTMotionInstanceNV.nmask(address()); }
        /** @return the value of the {@code instanceShaderBindingTableRecordOffset} field. */
        @NativeType("uint32_t")
        public int instanceShaderBindingTableRecordOffset() { return VkAccelerationStructureSRTMotionInstanceNV.ninstanceShaderBindingTableRecordOffset(address()); }
        /** @return the value of the {@code flags} field. */
        @NativeType("VkGeometryInstanceFlagsKHR")
        public int flags() { return VkAccelerationStructureSRTMotionInstanceNV.nflags(address()); }
        /** @return the value of the {@code accelerationStructureReference} field. */
        @NativeType("uint64_t")
        public long accelerationStructureReference() { return VkAccelerationStructureSRTMotionInstanceNV.naccelerationStructureReference(address()); }

        /** Copies the specified {@link VkSRTDataNV} to the {@code transformT0} field. */
        public VkAccelerationStructureSRTMotionInstanceNV.Buffer transformT0(VkSRTDataNV value) { VkAccelerationStructureSRTMotionInstanceNV.ntransformT0(address(), value); return this; }
        /** Passes the {@code transformT0} field to the specified {@link java.util.function.Consumer Consumer}. */
        public VkAccelerationStructureSRTMotionInstanceNV.Buffer transformT0(java.util.function.Consumer<VkSRTDataNV> consumer) { consumer.accept(transformT0()); return this; }
        /** Copies the specified {@link VkSRTDataNV} to the {@code transformT1} field. */
        public VkAccelerationStructureSRTMotionInstanceNV.Buffer transformT1(VkSRTDataNV value) { VkAccelerationStructureSRTMotionInstanceNV.ntransformT1(address(), value); return this; }
        /** Passes the {@code transformT1} field to the specified {@link java.util.function.Consumer Consumer}. */
        public VkAccelerationStructureSRTMotionInstanceNV.Buffer transformT1(java.util.function.Consumer<VkSRTDataNV> consumer) { consumer.accept(transformT1()); return this; }
        /** Sets the specified value to the {@code instanceCustomIndex} field. */
        public VkAccelerationStructureSRTMotionInstanceNV.Buffer instanceCustomIndex(@NativeType("uint32_t") int value) { VkAccelerationStructureSRTMotionInstanceNV.ninstanceCustomIndex(address(), value); return this; }
        /** Sets the specified value to the {@code mask} field. */
        public VkAccelerationStructureSRTMotionInstanceNV.Buffer mask(@NativeType("uint32_t") int value) { VkAccelerationStructureSRTMotionInstanceNV.nmask(address(), value); return this; }
        /** Sets the specified value to the {@code instanceShaderBindingTableRecordOffset} field. */
        public VkAccelerationStructureSRTMotionInstanceNV.Buffer instanceShaderBindingTableRecordOffset(@NativeType("uint32_t") int value) { VkAccelerationStructureSRTMotionInstanceNV.ninstanceShaderBindingTableRecordOffset(address(), value); return this; }
        /** Sets the specified value to the {@code flags} field. */
        public VkAccelerationStructureSRTMotionInstanceNV.Buffer flags(@NativeType("VkGeometryInstanceFlagsKHR") int value) { VkAccelerationStructureSRTMotionInstanceNV.nflags(address(), value); return this; }
        /** Sets the specified value to the {@code accelerationStructureReference} field. */
        public VkAccelerationStructureSRTMotionInstanceNV.Buffer accelerationStructureReference(@NativeType("uint64_t") long value) { VkAccelerationStructureSRTMotionInstanceNV.naccelerationStructureReference(address(), value); return this; }

    }

}