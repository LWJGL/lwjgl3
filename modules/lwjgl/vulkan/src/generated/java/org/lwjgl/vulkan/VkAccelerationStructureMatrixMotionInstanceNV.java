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
 * struct VkAccelerationStructureMatrixMotionInstanceNV {
 *     {@link VkTransformMatrixKHR VkTransformMatrixKHR} transformT0;
 *     {@link VkTransformMatrixKHR VkTransformMatrixKHR} transformT1;
 *     uint32_t instanceCustomIndex : 24;
 *     uint32_t mask : 8;
 *     uint32_t instanceShaderBindingTableRecordOffset : 24;
 *     VkGeometryInstanceFlagsKHR flags : 8;
 *     uint64_t accelerationStructureReference;
 * }}</pre>
 */
public class VkAccelerationStructureMatrixMotionInstanceNV extends Struct<VkAccelerationStructureMatrixMotionInstanceNV> implements NativeResource {

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
            __member(VkTransformMatrixKHR.SIZEOF, VkTransformMatrixKHR.ALIGNOF),
            __member(VkTransformMatrixKHR.SIZEOF, VkTransformMatrixKHR.ALIGNOF),
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

    protected VkAccelerationStructureMatrixMotionInstanceNV(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkAccelerationStructureMatrixMotionInstanceNV create(long address, @Nullable ByteBuffer container) {
        return new VkAccelerationStructureMatrixMotionInstanceNV(address, container);
    }

    /**
     * Creates a {@code VkAccelerationStructureMatrixMotionInstanceNV} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkAccelerationStructureMatrixMotionInstanceNV(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return a {@link VkTransformMatrixKHR} view of the {@code transformT0} field. */
    public VkTransformMatrixKHR transformT0() { return ntransformT0(address()); }
    /** @return a {@link VkTransformMatrixKHR} view of the {@code transformT1} field. */
    public VkTransformMatrixKHR transformT1() { return ntransformT1(address()); }
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

    /** Copies the specified {@link VkTransformMatrixKHR} to the {@code transformT0} field. */
    public VkAccelerationStructureMatrixMotionInstanceNV transformT0(VkTransformMatrixKHR value) { ntransformT0(address(), value); return this; }
    /** Passes the {@code transformT0} field to the specified {@link java.util.function.Consumer Consumer}. */
    public VkAccelerationStructureMatrixMotionInstanceNV transformT0(java.util.function.Consumer<VkTransformMatrixKHR> consumer) { consumer.accept(transformT0()); return this; }
    /** Copies the specified {@link VkTransformMatrixKHR} to the {@code transformT1} field. */
    public VkAccelerationStructureMatrixMotionInstanceNV transformT1(VkTransformMatrixKHR value) { ntransformT1(address(), value); return this; }
    /** Passes the {@code transformT1} field to the specified {@link java.util.function.Consumer Consumer}. */
    public VkAccelerationStructureMatrixMotionInstanceNV transformT1(java.util.function.Consumer<VkTransformMatrixKHR> consumer) { consumer.accept(transformT1()); return this; }
    /** Sets the specified value to the {@code instanceCustomIndex} field. */
    public VkAccelerationStructureMatrixMotionInstanceNV instanceCustomIndex(@NativeType("uint32_t") int value) { ninstanceCustomIndex(address(), value); return this; }
    /** Sets the specified value to the {@code mask} field. */
    public VkAccelerationStructureMatrixMotionInstanceNV mask(@NativeType("uint32_t") int value) { nmask(address(), value); return this; }
    /** Sets the specified value to the {@code instanceShaderBindingTableRecordOffset} field. */
    public VkAccelerationStructureMatrixMotionInstanceNV instanceShaderBindingTableRecordOffset(@NativeType("uint32_t") int value) { ninstanceShaderBindingTableRecordOffset(address(), value); return this; }
    /** Sets the specified value to the {@code flags} field. */
    public VkAccelerationStructureMatrixMotionInstanceNV flags(@NativeType("VkGeometryInstanceFlagsKHR") int value) { nflags(address(), value); return this; }
    /** Sets the specified value to the {@code accelerationStructureReference} field. */
    public VkAccelerationStructureMatrixMotionInstanceNV accelerationStructureReference(@NativeType("uint64_t") long value) { naccelerationStructureReference(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkAccelerationStructureMatrixMotionInstanceNV set(
        VkTransformMatrixKHR transformT0,
        VkTransformMatrixKHR transformT1,
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
    public VkAccelerationStructureMatrixMotionInstanceNV set(VkAccelerationStructureMatrixMotionInstanceNV src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkAccelerationStructureMatrixMotionInstanceNV} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkAccelerationStructureMatrixMotionInstanceNV malloc() {
        return new VkAccelerationStructureMatrixMotionInstanceNV(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkAccelerationStructureMatrixMotionInstanceNV} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkAccelerationStructureMatrixMotionInstanceNV calloc() {
        return new VkAccelerationStructureMatrixMotionInstanceNV(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkAccelerationStructureMatrixMotionInstanceNV} instance allocated with {@link BufferUtils}. */
    public static VkAccelerationStructureMatrixMotionInstanceNV create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkAccelerationStructureMatrixMotionInstanceNV(memAddress(container), container);
    }

    /** Returns a new {@code VkAccelerationStructureMatrixMotionInstanceNV} instance for the specified memory address. */
    public static VkAccelerationStructureMatrixMotionInstanceNV create(long address) {
        return new VkAccelerationStructureMatrixMotionInstanceNV(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable VkAccelerationStructureMatrixMotionInstanceNV createSafe(long address) {
        return address == NULL ? null : new VkAccelerationStructureMatrixMotionInstanceNV(address, null);
    }

    /**
     * Returns a new {@link VkAccelerationStructureMatrixMotionInstanceNV.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkAccelerationStructureMatrixMotionInstanceNV.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkAccelerationStructureMatrixMotionInstanceNV.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkAccelerationStructureMatrixMotionInstanceNV.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkAccelerationStructureMatrixMotionInstanceNV.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkAccelerationStructureMatrixMotionInstanceNV.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkAccelerationStructureMatrixMotionInstanceNV.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkAccelerationStructureMatrixMotionInstanceNV.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static VkAccelerationStructureMatrixMotionInstanceNV.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code VkAccelerationStructureMatrixMotionInstanceNV} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkAccelerationStructureMatrixMotionInstanceNV malloc(MemoryStack stack) {
        return new VkAccelerationStructureMatrixMotionInstanceNV(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkAccelerationStructureMatrixMotionInstanceNV} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkAccelerationStructureMatrixMotionInstanceNV calloc(MemoryStack stack) {
        return new VkAccelerationStructureMatrixMotionInstanceNV(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkAccelerationStructureMatrixMotionInstanceNV.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkAccelerationStructureMatrixMotionInstanceNV.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkAccelerationStructureMatrixMotionInstanceNV.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkAccelerationStructureMatrixMotionInstanceNV.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #transformT0}. */
    public static VkTransformMatrixKHR ntransformT0(long struct) { return VkTransformMatrixKHR.create(struct + VkAccelerationStructureMatrixMotionInstanceNV.TRANSFORMT0); }
    /** Unsafe version of {@link #transformT1}. */
    public static VkTransformMatrixKHR ntransformT1(long struct) { return VkTransformMatrixKHR.create(struct + VkAccelerationStructureMatrixMotionInstanceNV.TRANSFORMT1); }
    public static int nbitfield0(long struct) { return memGetInt(struct + VkAccelerationStructureMatrixMotionInstanceNV.BITFIELD0); }
    /** Unsafe version of {@link #instanceCustomIndex}. */
    public static int ninstanceCustomIndex(long struct) { return nbitfield0(struct) & 0x00_FF_FF_FF; }
    /** Unsafe version of {@link #mask}. */
    public static int nmask(long struct) { return nbitfield0(struct) >>> 24; }
    public static int nbitfield1(long struct) { return memGetInt(struct + VkAccelerationStructureMatrixMotionInstanceNV.BITFIELD1); }
    /** Unsafe version of {@link #instanceShaderBindingTableRecordOffset}. */
    public static int ninstanceShaderBindingTableRecordOffset(long struct) { return nbitfield1(struct) & 0x00_FF_FF_FF; }
    /** Unsafe version of {@link #flags}. */
    public static int nflags(long struct) { return nbitfield1(struct) >>> 24; }
    /** Unsafe version of {@link #accelerationStructureReference}. */
    public static long naccelerationStructureReference(long struct) { return memGetLong(struct + VkAccelerationStructureMatrixMotionInstanceNV.ACCELERATIONSTRUCTUREREFERENCE); }

    /** Unsafe version of {@link #transformT0(VkTransformMatrixKHR) transformT0}. */
    public static void ntransformT0(long struct, VkTransformMatrixKHR value) { memCopy(value.address(), struct + VkAccelerationStructureMatrixMotionInstanceNV.TRANSFORMT0, VkTransformMatrixKHR.SIZEOF); }
    /** Unsafe version of {@link #transformT1(VkTransformMatrixKHR) transformT1}. */
    public static void ntransformT1(long struct, VkTransformMatrixKHR value) { memCopy(value.address(), struct + VkAccelerationStructureMatrixMotionInstanceNV.TRANSFORMT1, VkTransformMatrixKHR.SIZEOF); }
    public static void nbitfield0(long struct, int value) { memPutInt(struct + VkAccelerationStructureMatrixMotionInstanceNV.BITFIELD0, value); }
    /** Unsafe version of {@link #instanceCustomIndex(int) instanceCustomIndex}. */
    public static void ninstanceCustomIndex(long struct, int value) { nbitfield0(struct, (nbitfield0(struct) & 0xFF_00_00_00) | (value & 0x00_FF_FF_FF)); }
    /** Unsafe version of {@link #mask(int) mask}. */
    public static void nmask(long struct, int value) { nbitfield0(struct, (value << 24) | (nbitfield0(struct) & 0x00_FF_FF_FF)); }
    public static void nbitfield1(long struct, int value) { memPutInt(struct + VkAccelerationStructureMatrixMotionInstanceNV.BITFIELD1, value); }
    /** Unsafe version of {@link #instanceShaderBindingTableRecordOffset(int) instanceShaderBindingTableRecordOffset}. */
    public static void ninstanceShaderBindingTableRecordOffset(long struct, int value) { nbitfield1(struct, (nbitfield1(struct) & 0xFF_00_00_00) | (value & 0x00_FF_FF_FF)); }
    /** Unsafe version of {@link #flags(int) flags}. */
    public static void nflags(long struct, int value) { nbitfield1(struct, (value << 24) | (nbitfield1(struct) & 0x00_FF_FF_FF)); }
    /** Unsafe version of {@link #accelerationStructureReference(long) accelerationStructureReference}. */
    public static void naccelerationStructureReference(long struct, long value) { memPutLong(struct + VkAccelerationStructureMatrixMotionInstanceNV.ACCELERATIONSTRUCTUREREFERENCE, value); }

    // -----------------------------------

    /** An array of {@link VkAccelerationStructureMatrixMotionInstanceNV} structs. */
    public static class Buffer extends StructBuffer<VkAccelerationStructureMatrixMotionInstanceNV, Buffer> implements NativeResource {

        private static final VkAccelerationStructureMatrixMotionInstanceNV ELEMENT_FACTORY = VkAccelerationStructureMatrixMotionInstanceNV.create(-1L);

        /**
         * Creates a new {@code VkAccelerationStructureMatrixMotionInstanceNV.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkAccelerationStructureMatrixMotionInstanceNV#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkAccelerationStructureMatrixMotionInstanceNV getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return a {@link VkTransformMatrixKHR} view of the {@code transformT0} field. */
        public VkTransformMatrixKHR transformT0() { return VkAccelerationStructureMatrixMotionInstanceNV.ntransformT0(address()); }
        /** @return a {@link VkTransformMatrixKHR} view of the {@code transformT1} field. */
        public VkTransformMatrixKHR transformT1() { return VkAccelerationStructureMatrixMotionInstanceNV.ntransformT1(address()); }
        /** @return the value of the {@code instanceCustomIndex} field. */
        @NativeType("uint32_t")
        public int instanceCustomIndex() { return VkAccelerationStructureMatrixMotionInstanceNV.ninstanceCustomIndex(address()); }
        /** @return the value of the {@code mask} field. */
        @NativeType("uint32_t")
        public int mask() { return VkAccelerationStructureMatrixMotionInstanceNV.nmask(address()); }
        /** @return the value of the {@code instanceShaderBindingTableRecordOffset} field. */
        @NativeType("uint32_t")
        public int instanceShaderBindingTableRecordOffset() { return VkAccelerationStructureMatrixMotionInstanceNV.ninstanceShaderBindingTableRecordOffset(address()); }
        /** @return the value of the {@code flags} field. */
        @NativeType("VkGeometryInstanceFlagsKHR")
        public int flags() { return VkAccelerationStructureMatrixMotionInstanceNV.nflags(address()); }
        /** @return the value of the {@code accelerationStructureReference} field. */
        @NativeType("uint64_t")
        public long accelerationStructureReference() { return VkAccelerationStructureMatrixMotionInstanceNV.naccelerationStructureReference(address()); }

        /** Copies the specified {@link VkTransformMatrixKHR} to the {@code transformT0} field. */
        public VkAccelerationStructureMatrixMotionInstanceNV.Buffer transformT0(VkTransformMatrixKHR value) { VkAccelerationStructureMatrixMotionInstanceNV.ntransformT0(address(), value); return this; }
        /** Passes the {@code transformT0} field to the specified {@link java.util.function.Consumer Consumer}. */
        public VkAccelerationStructureMatrixMotionInstanceNV.Buffer transformT0(java.util.function.Consumer<VkTransformMatrixKHR> consumer) { consumer.accept(transformT0()); return this; }
        /** Copies the specified {@link VkTransformMatrixKHR} to the {@code transformT1} field. */
        public VkAccelerationStructureMatrixMotionInstanceNV.Buffer transformT1(VkTransformMatrixKHR value) { VkAccelerationStructureMatrixMotionInstanceNV.ntransformT1(address(), value); return this; }
        /** Passes the {@code transformT1} field to the specified {@link java.util.function.Consumer Consumer}. */
        public VkAccelerationStructureMatrixMotionInstanceNV.Buffer transformT1(java.util.function.Consumer<VkTransformMatrixKHR> consumer) { consumer.accept(transformT1()); return this; }
        /** Sets the specified value to the {@code instanceCustomIndex} field. */
        public VkAccelerationStructureMatrixMotionInstanceNV.Buffer instanceCustomIndex(@NativeType("uint32_t") int value) { VkAccelerationStructureMatrixMotionInstanceNV.ninstanceCustomIndex(address(), value); return this; }
        /** Sets the specified value to the {@code mask} field. */
        public VkAccelerationStructureMatrixMotionInstanceNV.Buffer mask(@NativeType("uint32_t") int value) { VkAccelerationStructureMatrixMotionInstanceNV.nmask(address(), value); return this; }
        /** Sets the specified value to the {@code instanceShaderBindingTableRecordOffset} field. */
        public VkAccelerationStructureMatrixMotionInstanceNV.Buffer instanceShaderBindingTableRecordOffset(@NativeType("uint32_t") int value) { VkAccelerationStructureMatrixMotionInstanceNV.ninstanceShaderBindingTableRecordOffset(address(), value); return this; }
        /** Sets the specified value to the {@code flags} field. */
        public VkAccelerationStructureMatrixMotionInstanceNV.Buffer flags(@NativeType("VkGeometryInstanceFlagsKHR") int value) { VkAccelerationStructureMatrixMotionInstanceNV.nflags(address(), value); return this; }
        /** Sets the specified value to the {@code accelerationStructureReference} field. */
        public VkAccelerationStructureMatrixMotionInstanceNV.Buffer accelerationStructureReference(@NativeType("uint64_t") long value) { VkAccelerationStructureMatrixMotionInstanceNV.naccelerationStructureReference(address(), value); return this; }

    }

}