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
 * struct VkTraceRaysIndirectCommand2KHR {
 *     VkDeviceAddress raygenShaderRecordAddress;
 *     VkDeviceSize raygenShaderRecordSize;
 *     VkDeviceAddress missShaderBindingTableAddress;
 *     VkDeviceSize missShaderBindingTableSize;
 *     VkDeviceSize missShaderBindingTableStride;
 *     VkDeviceAddress hitShaderBindingTableAddress;
 *     VkDeviceSize hitShaderBindingTableSize;
 *     VkDeviceSize hitShaderBindingTableStride;
 *     VkDeviceAddress callableShaderBindingTableAddress;
 *     VkDeviceSize callableShaderBindingTableSize;
 *     VkDeviceSize callableShaderBindingTableStride;
 *     uint32_t width;
 *     uint32_t height;
 *     uint32_t depth;
 * }}</pre>
 */
public class VkTraceRaysIndirectCommand2KHR extends Struct<VkTraceRaysIndirectCommand2KHR> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        RAYGENSHADERRECORDADDRESS,
        RAYGENSHADERRECORDSIZE,
        MISSSHADERBINDINGTABLEADDRESS,
        MISSSHADERBINDINGTABLESIZE,
        MISSSHADERBINDINGTABLESTRIDE,
        HITSHADERBINDINGTABLEADDRESS,
        HITSHADERBINDINGTABLESIZE,
        HITSHADERBINDINGTABLESTRIDE,
        CALLABLESHADERBINDINGTABLEADDRESS,
        CALLABLESHADERBINDINGTABLESIZE,
        CALLABLESHADERBINDINGTABLESTRIDE,
        WIDTH,
        HEIGHT,
        DEPTH;

    static {
        Layout layout = __struct(
            __member(8),
            __member(8),
            __member(8),
            __member(8),
            __member(8),
            __member(8),
            __member(8),
            __member(8),
            __member(8),
            __member(8),
            __member(8),
            __member(4),
            __member(4),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        RAYGENSHADERRECORDADDRESS = layout.offsetof(0);
        RAYGENSHADERRECORDSIZE = layout.offsetof(1);
        MISSSHADERBINDINGTABLEADDRESS = layout.offsetof(2);
        MISSSHADERBINDINGTABLESIZE = layout.offsetof(3);
        MISSSHADERBINDINGTABLESTRIDE = layout.offsetof(4);
        HITSHADERBINDINGTABLEADDRESS = layout.offsetof(5);
        HITSHADERBINDINGTABLESIZE = layout.offsetof(6);
        HITSHADERBINDINGTABLESTRIDE = layout.offsetof(7);
        CALLABLESHADERBINDINGTABLEADDRESS = layout.offsetof(8);
        CALLABLESHADERBINDINGTABLESIZE = layout.offsetof(9);
        CALLABLESHADERBINDINGTABLESTRIDE = layout.offsetof(10);
        WIDTH = layout.offsetof(11);
        HEIGHT = layout.offsetof(12);
        DEPTH = layout.offsetof(13);
    }

    protected VkTraceRaysIndirectCommand2KHR(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkTraceRaysIndirectCommand2KHR create(long address, @Nullable ByteBuffer container) {
        return new VkTraceRaysIndirectCommand2KHR(address, container);
    }

    /**
     * Creates a {@code VkTraceRaysIndirectCommand2KHR} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkTraceRaysIndirectCommand2KHR(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return the value of the {@code raygenShaderRecordAddress} field. */
    @NativeType("VkDeviceAddress")
    public long raygenShaderRecordAddress() { return nraygenShaderRecordAddress(address()); }
    /** @return the value of the {@code raygenShaderRecordSize} field. */
    @NativeType("VkDeviceSize")
    public long raygenShaderRecordSize() { return nraygenShaderRecordSize(address()); }
    /** @return the value of the {@code missShaderBindingTableAddress} field. */
    @NativeType("VkDeviceAddress")
    public long missShaderBindingTableAddress() { return nmissShaderBindingTableAddress(address()); }
    /** @return the value of the {@code missShaderBindingTableSize} field. */
    @NativeType("VkDeviceSize")
    public long missShaderBindingTableSize() { return nmissShaderBindingTableSize(address()); }
    /** @return the value of the {@code missShaderBindingTableStride} field. */
    @NativeType("VkDeviceSize")
    public long missShaderBindingTableStride() { return nmissShaderBindingTableStride(address()); }
    /** @return the value of the {@code hitShaderBindingTableAddress} field. */
    @NativeType("VkDeviceAddress")
    public long hitShaderBindingTableAddress() { return nhitShaderBindingTableAddress(address()); }
    /** @return the value of the {@code hitShaderBindingTableSize} field. */
    @NativeType("VkDeviceSize")
    public long hitShaderBindingTableSize() { return nhitShaderBindingTableSize(address()); }
    /** @return the value of the {@code hitShaderBindingTableStride} field. */
    @NativeType("VkDeviceSize")
    public long hitShaderBindingTableStride() { return nhitShaderBindingTableStride(address()); }
    /** @return the value of the {@code callableShaderBindingTableAddress} field. */
    @NativeType("VkDeviceAddress")
    public long callableShaderBindingTableAddress() { return ncallableShaderBindingTableAddress(address()); }
    /** @return the value of the {@code callableShaderBindingTableSize} field. */
    @NativeType("VkDeviceSize")
    public long callableShaderBindingTableSize() { return ncallableShaderBindingTableSize(address()); }
    /** @return the value of the {@code callableShaderBindingTableStride} field. */
    @NativeType("VkDeviceSize")
    public long callableShaderBindingTableStride() { return ncallableShaderBindingTableStride(address()); }
    /** @return the value of the {@code width} field. */
    @NativeType("uint32_t")
    public int width() { return nwidth(address()); }
    /** @return the value of the {@code height} field. */
    @NativeType("uint32_t")
    public int height() { return nheight(address()); }
    /** @return the value of the {@code depth} field. */
    @NativeType("uint32_t")
    public int depth() { return ndepth(address()); }

    /** Sets the specified value to the {@code raygenShaderRecordAddress} field. */
    public VkTraceRaysIndirectCommand2KHR raygenShaderRecordAddress(@NativeType("VkDeviceAddress") long value) { nraygenShaderRecordAddress(address(), value); return this; }
    /** Sets the specified value to the {@code raygenShaderRecordSize} field. */
    public VkTraceRaysIndirectCommand2KHR raygenShaderRecordSize(@NativeType("VkDeviceSize") long value) { nraygenShaderRecordSize(address(), value); return this; }
    /** Sets the specified value to the {@code missShaderBindingTableAddress} field. */
    public VkTraceRaysIndirectCommand2KHR missShaderBindingTableAddress(@NativeType("VkDeviceAddress") long value) { nmissShaderBindingTableAddress(address(), value); return this; }
    /** Sets the specified value to the {@code missShaderBindingTableSize} field. */
    public VkTraceRaysIndirectCommand2KHR missShaderBindingTableSize(@NativeType("VkDeviceSize") long value) { nmissShaderBindingTableSize(address(), value); return this; }
    /** Sets the specified value to the {@code missShaderBindingTableStride} field. */
    public VkTraceRaysIndirectCommand2KHR missShaderBindingTableStride(@NativeType("VkDeviceSize") long value) { nmissShaderBindingTableStride(address(), value); return this; }
    /** Sets the specified value to the {@code hitShaderBindingTableAddress} field. */
    public VkTraceRaysIndirectCommand2KHR hitShaderBindingTableAddress(@NativeType("VkDeviceAddress") long value) { nhitShaderBindingTableAddress(address(), value); return this; }
    /** Sets the specified value to the {@code hitShaderBindingTableSize} field. */
    public VkTraceRaysIndirectCommand2KHR hitShaderBindingTableSize(@NativeType("VkDeviceSize") long value) { nhitShaderBindingTableSize(address(), value); return this; }
    /** Sets the specified value to the {@code hitShaderBindingTableStride} field. */
    public VkTraceRaysIndirectCommand2KHR hitShaderBindingTableStride(@NativeType("VkDeviceSize") long value) { nhitShaderBindingTableStride(address(), value); return this; }
    /** Sets the specified value to the {@code callableShaderBindingTableAddress} field. */
    public VkTraceRaysIndirectCommand2KHR callableShaderBindingTableAddress(@NativeType("VkDeviceAddress") long value) { ncallableShaderBindingTableAddress(address(), value); return this; }
    /** Sets the specified value to the {@code callableShaderBindingTableSize} field. */
    public VkTraceRaysIndirectCommand2KHR callableShaderBindingTableSize(@NativeType("VkDeviceSize") long value) { ncallableShaderBindingTableSize(address(), value); return this; }
    /** Sets the specified value to the {@code callableShaderBindingTableStride} field. */
    public VkTraceRaysIndirectCommand2KHR callableShaderBindingTableStride(@NativeType("VkDeviceSize") long value) { ncallableShaderBindingTableStride(address(), value); return this; }
    /** Sets the specified value to the {@code width} field. */
    public VkTraceRaysIndirectCommand2KHR width(@NativeType("uint32_t") int value) { nwidth(address(), value); return this; }
    /** Sets the specified value to the {@code height} field. */
    public VkTraceRaysIndirectCommand2KHR height(@NativeType("uint32_t") int value) { nheight(address(), value); return this; }
    /** Sets the specified value to the {@code depth} field. */
    public VkTraceRaysIndirectCommand2KHR depth(@NativeType("uint32_t") int value) { ndepth(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkTraceRaysIndirectCommand2KHR set(
        long raygenShaderRecordAddress,
        long raygenShaderRecordSize,
        long missShaderBindingTableAddress,
        long missShaderBindingTableSize,
        long missShaderBindingTableStride,
        long hitShaderBindingTableAddress,
        long hitShaderBindingTableSize,
        long hitShaderBindingTableStride,
        long callableShaderBindingTableAddress,
        long callableShaderBindingTableSize,
        long callableShaderBindingTableStride,
        int width,
        int height,
        int depth
    ) {
        raygenShaderRecordAddress(raygenShaderRecordAddress);
        raygenShaderRecordSize(raygenShaderRecordSize);
        missShaderBindingTableAddress(missShaderBindingTableAddress);
        missShaderBindingTableSize(missShaderBindingTableSize);
        missShaderBindingTableStride(missShaderBindingTableStride);
        hitShaderBindingTableAddress(hitShaderBindingTableAddress);
        hitShaderBindingTableSize(hitShaderBindingTableSize);
        hitShaderBindingTableStride(hitShaderBindingTableStride);
        callableShaderBindingTableAddress(callableShaderBindingTableAddress);
        callableShaderBindingTableSize(callableShaderBindingTableSize);
        callableShaderBindingTableStride(callableShaderBindingTableStride);
        width(width);
        height(height);
        depth(depth);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkTraceRaysIndirectCommand2KHR set(VkTraceRaysIndirectCommand2KHR src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkTraceRaysIndirectCommand2KHR} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkTraceRaysIndirectCommand2KHR malloc() {
        return new VkTraceRaysIndirectCommand2KHR(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkTraceRaysIndirectCommand2KHR} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkTraceRaysIndirectCommand2KHR calloc() {
        return new VkTraceRaysIndirectCommand2KHR(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkTraceRaysIndirectCommand2KHR} instance allocated with {@link BufferUtils}. */
    public static VkTraceRaysIndirectCommand2KHR create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkTraceRaysIndirectCommand2KHR(memAddress(container), container);
    }

    /** Returns a new {@code VkTraceRaysIndirectCommand2KHR} instance for the specified memory address. */
    public static VkTraceRaysIndirectCommand2KHR create(long address) {
        return new VkTraceRaysIndirectCommand2KHR(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable VkTraceRaysIndirectCommand2KHR createSafe(long address) {
        return address == NULL ? null : new VkTraceRaysIndirectCommand2KHR(address, null);
    }

    /**
     * Returns a new {@link VkTraceRaysIndirectCommand2KHR.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkTraceRaysIndirectCommand2KHR.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkTraceRaysIndirectCommand2KHR.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkTraceRaysIndirectCommand2KHR.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkTraceRaysIndirectCommand2KHR.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkTraceRaysIndirectCommand2KHR.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkTraceRaysIndirectCommand2KHR.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkTraceRaysIndirectCommand2KHR.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static VkTraceRaysIndirectCommand2KHR.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code VkTraceRaysIndirectCommand2KHR} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkTraceRaysIndirectCommand2KHR malloc(MemoryStack stack) {
        return new VkTraceRaysIndirectCommand2KHR(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkTraceRaysIndirectCommand2KHR} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkTraceRaysIndirectCommand2KHR calloc(MemoryStack stack) {
        return new VkTraceRaysIndirectCommand2KHR(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkTraceRaysIndirectCommand2KHR.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkTraceRaysIndirectCommand2KHR.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkTraceRaysIndirectCommand2KHR.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkTraceRaysIndirectCommand2KHR.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #raygenShaderRecordAddress}. */
    public static long nraygenShaderRecordAddress(long struct) { return memGetLong(struct + VkTraceRaysIndirectCommand2KHR.RAYGENSHADERRECORDADDRESS); }
    /** Unsafe version of {@link #raygenShaderRecordSize}. */
    public static long nraygenShaderRecordSize(long struct) { return memGetLong(struct + VkTraceRaysIndirectCommand2KHR.RAYGENSHADERRECORDSIZE); }
    /** Unsafe version of {@link #missShaderBindingTableAddress}. */
    public static long nmissShaderBindingTableAddress(long struct) { return memGetLong(struct + VkTraceRaysIndirectCommand2KHR.MISSSHADERBINDINGTABLEADDRESS); }
    /** Unsafe version of {@link #missShaderBindingTableSize}. */
    public static long nmissShaderBindingTableSize(long struct) { return memGetLong(struct + VkTraceRaysIndirectCommand2KHR.MISSSHADERBINDINGTABLESIZE); }
    /** Unsafe version of {@link #missShaderBindingTableStride}. */
    public static long nmissShaderBindingTableStride(long struct) { return memGetLong(struct + VkTraceRaysIndirectCommand2KHR.MISSSHADERBINDINGTABLESTRIDE); }
    /** Unsafe version of {@link #hitShaderBindingTableAddress}. */
    public static long nhitShaderBindingTableAddress(long struct) { return memGetLong(struct + VkTraceRaysIndirectCommand2KHR.HITSHADERBINDINGTABLEADDRESS); }
    /** Unsafe version of {@link #hitShaderBindingTableSize}. */
    public static long nhitShaderBindingTableSize(long struct) { return memGetLong(struct + VkTraceRaysIndirectCommand2KHR.HITSHADERBINDINGTABLESIZE); }
    /** Unsafe version of {@link #hitShaderBindingTableStride}. */
    public static long nhitShaderBindingTableStride(long struct) { return memGetLong(struct + VkTraceRaysIndirectCommand2KHR.HITSHADERBINDINGTABLESTRIDE); }
    /** Unsafe version of {@link #callableShaderBindingTableAddress}. */
    public static long ncallableShaderBindingTableAddress(long struct) { return memGetLong(struct + VkTraceRaysIndirectCommand2KHR.CALLABLESHADERBINDINGTABLEADDRESS); }
    /** Unsafe version of {@link #callableShaderBindingTableSize}. */
    public static long ncallableShaderBindingTableSize(long struct) { return memGetLong(struct + VkTraceRaysIndirectCommand2KHR.CALLABLESHADERBINDINGTABLESIZE); }
    /** Unsafe version of {@link #callableShaderBindingTableStride}. */
    public static long ncallableShaderBindingTableStride(long struct) { return memGetLong(struct + VkTraceRaysIndirectCommand2KHR.CALLABLESHADERBINDINGTABLESTRIDE); }
    /** Unsafe version of {@link #width}. */
    public static int nwidth(long struct) { return memGetInt(struct + VkTraceRaysIndirectCommand2KHR.WIDTH); }
    /** Unsafe version of {@link #height}. */
    public static int nheight(long struct) { return memGetInt(struct + VkTraceRaysIndirectCommand2KHR.HEIGHT); }
    /** Unsafe version of {@link #depth}. */
    public static int ndepth(long struct) { return memGetInt(struct + VkTraceRaysIndirectCommand2KHR.DEPTH); }

    /** Unsafe version of {@link #raygenShaderRecordAddress(long) raygenShaderRecordAddress}. */
    public static void nraygenShaderRecordAddress(long struct, long value) { memPutLong(struct + VkTraceRaysIndirectCommand2KHR.RAYGENSHADERRECORDADDRESS, value); }
    /** Unsafe version of {@link #raygenShaderRecordSize(long) raygenShaderRecordSize}. */
    public static void nraygenShaderRecordSize(long struct, long value) { memPutLong(struct + VkTraceRaysIndirectCommand2KHR.RAYGENSHADERRECORDSIZE, value); }
    /** Unsafe version of {@link #missShaderBindingTableAddress(long) missShaderBindingTableAddress}. */
    public static void nmissShaderBindingTableAddress(long struct, long value) { memPutLong(struct + VkTraceRaysIndirectCommand2KHR.MISSSHADERBINDINGTABLEADDRESS, value); }
    /** Unsafe version of {@link #missShaderBindingTableSize(long) missShaderBindingTableSize}. */
    public static void nmissShaderBindingTableSize(long struct, long value) { memPutLong(struct + VkTraceRaysIndirectCommand2KHR.MISSSHADERBINDINGTABLESIZE, value); }
    /** Unsafe version of {@link #missShaderBindingTableStride(long) missShaderBindingTableStride}. */
    public static void nmissShaderBindingTableStride(long struct, long value) { memPutLong(struct + VkTraceRaysIndirectCommand2KHR.MISSSHADERBINDINGTABLESTRIDE, value); }
    /** Unsafe version of {@link #hitShaderBindingTableAddress(long) hitShaderBindingTableAddress}. */
    public static void nhitShaderBindingTableAddress(long struct, long value) { memPutLong(struct + VkTraceRaysIndirectCommand2KHR.HITSHADERBINDINGTABLEADDRESS, value); }
    /** Unsafe version of {@link #hitShaderBindingTableSize(long) hitShaderBindingTableSize}. */
    public static void nhitShaderBindingTableSize(long struct, long value) { memPutLong(struct + VkTraceRaysIndirectCommand2KHR.HITSHADERBINDINGTABLESIZE, value); }
    /** Unsafe version of {@link #hitShaderBindingTableStride(long) hitShaderBindingTableStride}. */
    public static void nhitShaderBindingTableStride(long struct, long value) { memPutLong(struct + VkTraceRaysIndirectCommand2KHR.HITSHADERBINDINGTABLESTRIDE, value); }
    /** Unsafe version of {@link #callableShaderBindingTableAddress(long) callableShaderBindingTableAddress}. */
    public static void ncallableShaderBindingTableAddress(long struct, long value) { memPutLong(struct + VkTraceRaysIndirectCommand2KHR.CALLABLESHADERBINDINGTABLEADDRESS, value); }
    /** Unsafe version of {@link #callableShaderBindingTableSize(long) callableShaderBindingTableSize}. */
    public static void ncallableShaderBindingTableSize(long struct, long value) { memPutLong(struct + VkTraceRaysIndirectCommand2KHR.CALLABLESHADERBINDINGTABLESIZE, value); }
    /** Unsafe version of {@link #callableShaderBindingTableStride(long) callableShaderBindingTableStride}. */
    public static void ncallableShaderBindingTableStride(long struct, long value) { memPutLong(struct + VkTraceRaysIndirectCommand2KHR.CALLABLESHADERBINDINGTABLESTRIDE, value); }
    /** Unsafe version of {@link #width(int) width}. */
    public static void nwidth(long struct, int value) { memPutInt(struct + VkTraceRaysIndirectCommand2KHR.WIDTH, value); }
    /** Unsafe version of {@link #height(int) height}. */
    public static void nheight(long struct, int value) { memPutInt(struct + VkTraceRaysIndirectCommand2KHR.HEIGHT, value); }
    /** Unsafe version of {@link #depth(int) depth}. */
    public static void ndepth(long struct, int value) { memPutInt(struct + VkTraceRaysIndirectCommand2KHR.DEPTH, value); }

    // -----------------------------------

    /** An array of {@link VkTraceRaysIndirectCommand2KHR} structs. */
    public static class Buffer extends StructBuffer<VkTraceRaysIndirectCommand2KHR, Buffer> implements NativeResource {

        private static final VkTraceRaysIndirectCommand2KHR ELEMENT_FACTORY = VkTraceRaysIndirectCommand2KHR.create(-1L);

        /**
         * Creates a new {@code VkTraceRaysIndirectCommand2KHR.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkTraceRaysIndirectCommand2KHR#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkTraceRaysIndirectCommand2KHR getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code raygenShaderRecordAddress} field. */
        @NativeType("VkDeviceAddress")
        public long raygenShaderRecordAddress() { return VkTraceRaysIndirectCommand2KHR.nraygenShaderRecordAddress(address()); }
        /** @return the value of the {@code raygenShaderRecordSize} field. */
        @NativeType("VkDeviceSize")
        public long raygenShaderRecordSize() { return VkTraceRaysIndirectCommand2KHR.nraygenShaderRecordSize(address()); }
        /** @return the value of the {@code missShaderBindingTableAddress} field. */
        @NativeType("VkDeviceAddress")
        public long missShaderBindingTableAddress() { return VkTraceRaysIndirectCommand2KHR.nmissShaderBindingTableAddress(address()); }
        /** @return the value of the {@code missShaderBindingTableSize} field. */
        @NativeType("VkDeviceSize")
        public long missShaderBindingTableSize() { return VkTraceRaysIndirectCommand2KHR.nmissShaderBindingTableSize(address()); }
        /** @return the value of the {@code missShaderBindingTableStride} field. */
        @NativeType("VkDeviceSize")
        public long missShaderBindingTableStride() { return VkTraceRaysIndirectCommand2KHR.nmissShaderBindingTableStride(address()); }
        /** @return the value of the {@code hitShaderBindingTableAddress} field. */
        @NativeType("VkDeviceAddress")
        public long hitShaderBindingTableAddress() { return VkTraceRaysIndirectCommand2KHR.nhitShaderBindingTableAddress(address()); }
        /** @return the value of the {@code hitShaderBindingTableSize} field. */
        @NativeType("VkDeviceSize")
        public long hitShaderBindingTableSize() { return VkTraceRaysIndirectCommand2KHR.nhitShaderBindingTableSize(address()); }
        /** @return the value of the {@code hitShaderBindingTableStride} field. */
        @NativeType("VkDeviceSize")
        public long hitShaderBindingTableStride() { return VkTraceRaysIndirectCommand2KHR.nhitShaderBindingTableStride(address()); }
        /** @return the value of the {@code callableShaderBindingTableAddress} field. */
        @NativeType("VkDeviceAddress")
        public long callableShaderBindingTableAddress() { return VkTraceRaysIndirectCommand2KHR.ncallableShaderBindingTableAddress(address()); }
        /** @return the value of the {@code callableShaderBindingTableSize} field. */
        @NativeType("VkDeviceSize")
        public long callableShaderBindingTableSize() { return VkTraceRaysIndirectCommand2KHR.ncallableShaderBindingTableSize(address()); }
        /** @return the value of the {@code callableShaderBindingTableStride} field. */
        @NativeType("VkDeviceSize")
        public long callableShaderBindingTableStride() { return VkTraceRaysIndirectCommand2KHR.ncallableShaderBindingTableStride(address()); }
        /** @return the value of the {@code width} field. */
        @NativeType("uint32_t")
        public int width() { return VkTraceRaysIndirectCommand2KHR.nwidth(address()); }
        /** @return the value of the {@code height} field. */
        @NativeType("uint32_t")
        public int height() { return VkTraceRaysIndirectCommand2KHR.nheight(address()); }
        /** @return the value of the {@code depth} field. */
        @NativeType("uint32_t")
        public int depth() { return VkTraceRaysIndirectCommand2KHR.ndepth(address()); }

        /** Sets the specified value to the {@code raygenShaderRecordAddress} field. */
        public VkTraceRaysIndirectCommand2KHR.Buffer raygenShaderRecordAddress(@NativeType("VkDeviceAddress") long value) { VkTraceRaysIndirectCommand2KHR.nraygenShaderRecordAddress(address(), value); return this; }
        /** Sets the specified value to the {@code raygenShaderRecordSize} field. */
        public VkTraceRaysIndirectCommand2KHR.Buffer raygenShaderRecordSize(@NativeType("VkDeviceSize") long value) { VkTraceRaysIndirectCommand2KHR.nraygenShaderRecordSize(address(), value); return this; }
        /** Sets the specified value to the {@code missShaderBindingTableAddress} field. */
        public VkTraceRaysIndirectCommand2KHR.Buffer missShaderBindingTableAddress(@NativeType("VkDeviceAddress") long value) { VkTraceRaysIndirectCommand2KHR.nmissShaderBindingTableAddress(address(), value); return this; }
        /** Sets the specified value to the {@code missShaderBindingTableSize} field. */
        public VkTraceRaysIndirectCommand2KHR.Buffer missShaderBindingTableSize(@NativeType("VkDeviceSize") long value) { VkTraceRaysIndirectCommand2KHR.nmissShaderBindingTableSize(address(), value); return this; }
        /** Sets the specified value to the {@code missShaderBindingTableStride} field. */
        public VkTraceRaysIndirectCommand2KHR.Buffer missShaderBindingTableStride(@NativeType("VkDeviceSize") long value) { VkTraceRaysIndirectCommand2KHR.nmissShaderBindingTableStride(address(), value); return this; }
        /** Sets the specified value to the {@code hitShaderBindingTableAddress} field. */
        public VkTraceRaysIndirectCommand2KHR.Buffer hitShaderBindingTableAddress(@NativeType("VkDeviceAddress") long value) { VkTraceRaysIndirectCommand2KHR.nhitShaderBindingTableAddress(address(), value); return this; }
        /** Sets the specified value to the {@code hitShaderBindingTableSize} field. */
        public VkTraceRaysIndirectCommand2KHR.Buffer hitShaderBindingTableSize(@NativeType("VkDeviceSize") long value) { VkTraceRaysIndirectCommand2KHR.nhitShaderBindingTableSize(address(), value); return this; }
        /** Sets the specified value to the {@code hitShaderBindingTableStride} field. */
        public VkTraceRaysIndirectCommand2KHR.Buffer hitShaderBindingTableStride(@NativeType("VkDeviceSize") long value) { VkTraceRaysIndirectCommand2KHR.nhitShaderBindingTableStride(address(), value); return this; }
        /** Sets the specified value to the {@code callableShaderBindingTableAddress} field. */
        public VkTraceRaysIndirectCommand2KHR.Buffer callableShaderBindingTableAddress(@NativeType("VkDeviceAddress") long value) { VkTraceRaysIndirectCommand2KHR.ncallableShaderBindingTableAddress(address(), value); return this; }
        /** Sets the specified value to the {@code callableShaderBindingTableSize} field. */
        public VkTraceRaysIndirectCommand2KHR.Buffer callableShaderBindingTableSize(@NativeType("VkDeviceSize") long value) { VkTraceRaysIndirectCommand2KHR.ncallableShaderBindingTableSize(address(), value); return this; }
        /** Sets the specified value to the {@code callableShaderBindingTableStride} field. */
        public VkTraceRaysIndirectCommand2KHR.Buffer callableShaderBindingTableStride(@NativeType("VkDeviceSize") long value) { VkTraceRaysIndirectCommand2KHR.ncallableShaderBindingTableStride(address(), value); return this; }
        /** Sets the specified value to the {@code width} field. */
        public VkTraceRaysIndirectCommand2KHR.Buffer width(@NativeType("uint32_t") int value) { VkTraceRaysIndirectCommand2KHR.nwidth(address(), value); return this; }
        /** Sets the specified value to the {@code height} field. */
        public VkTraceRaysIndirectCommand2KHR.Buffer height(@NativeType("uint32_t") int value) { VkTraceRaysIndirectCommand2KHR.nheight(address(), value); return this; }
        /** Sets the specified value to the {@code depth} field. */
        public VkTraceRaysIndirectCommand2KHR.Buffer depth(@NativeType("uint32_t") int value) { VkTraceRaysIndirectCommand2KHR.ndepth(address(), value); return this; }

    }

}