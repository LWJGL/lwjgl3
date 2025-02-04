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
 * struct VkBuildPartitionedAccelerationStructureIndirectCommandNV {
 *     VkPartitionedAccelerationStructureOpTypeNV opType;
 *     uint32_t argCount;
 *     {@link VkStridedDeviceAddressNV VkStridedDeviceAddressNV} argData;
 * }}</pre>
 */
public class VkBuildPartitionedAccelerationStructureIndirectCommandNV extends Struct<VkBuildPartitionedAccelerationStructureIndirectCommandNV> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        OPTYPE,
        ARGCOUNT,
        ARGDATA;

    static {
        Layout layout = __struct(
            __member(4),
            __member(4),
            __member(VkStridedDeviceAddressNV.SIZEOF, VkStridedDeviceAddressNV.ALIGNOF)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        OPTYPE = layout.offsetof(0);
        ARGCOUNT = layout.offsetof(1);
        ARGDATA = layout.offsetof(2);
    }

    protected VkBuildPartitionedAccelerationStructureIndirectCommandNV(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkBuildPartitionedAccelerationStructureIndirectCommandNV create(long address, @Nullable ByteBuffer container) {
        return new VkBuildPartitionedAccelerationStructureIndirectCommandNV(address, container);
    }

    /**
     * Creates a {@code VkBuildPartitionedAccelerationStructureIndirectCommandNV} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkBuildPartitionedAccelerationStructureIndirectCommandNV(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return the value of the {@code opType} field. */
    @NativeType("VkPartitionedAccelerationStructureOpTypeNV")
    public int opType() { return nopType(address()); }
    /** @return the value of the {@code argCount} field. */
    @NativeType("uint32_t")
    public int argCount() { return nargCount(address()); }
    /** @return a {@link VkStridedDeviceAddressNV} view of the {@code argData} field. */
    public VkStridedDeviceAddressNV argData() { return nargData(address()); }

    /** Sets the specified value to the {@code opType} field. */
    public VkBuildPartitionedAccelerationStructureIndirectCommandNV opType(@NativeType("VkPartitionedAccelerationStructureOpTypeNV") int value) { nopType(address(), value); return this; }
    /** Sets the specified value to the {@code argCount} field. */
    public VkBuildPartitionedAccelerationStructureIndirectCommandNV argCount(@NativeType("uint32_t") int value) { nargCount(address(), value); return this; }
    /** Copies the specified {@link VkStridedDeviceAddressNV} to the {@code argData} field. */
    public VkBuildPartitionedAccelerationStructureIndirectCommandNV argData(VkStridedDeviceAddressNV value) { nargData(address(), value); return this; }
    /** Passes the {@code argData} field to the specified {@link java.util.function.Consumer Consumer}. */
    public VkBuildPartitionedAccelerationStructureIndirectCommandNV argData(java.util.function.Consumer<VkStridedDeviceAddressNV> consumer) { consumer.accept(argData()); return this; }

    /** Initializes this struct with the specified values. */
    public VkBuildPartitionedAccelerationStructureIndirectCommandNV set(
        int opType,
        int argCount,
        VkStridedDeviceAddressNV argData
    ) {
        opType(opType);
        argCount(argCount);
        argData(argData);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkBuildPartitionedAccelerationStructureIndirectCommandNV set(VkBuildPartitionedAccelerationStructureIndirectCommandNV src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkBuildPartitionedAccelerationStructureIndirectCommandNV} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkBuildPartitionedAccelerationStructureIndirectCommandNV malloc() {
        return new VkBuildPartitionedAccelerationStructureIndirectCommandNV(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkBuildPartitionedAccelerationStructureIndirectCommandNV} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkBuildPartitionedAccelerationStructureIndirectCommandNV calloc() {
        return new VkBuildPartitionedAccelerationStructureIndirectCommandNV(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkBuildPartitionedAccelerationStructureIndirectCommandNV} instance allocated with {@link BufferUtils}. */
    public static VkBuildPartitionedAccelerationStructureIndirectCommandNV create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkBuildPartitionedAccelerationStructureIndirectCommandNV(memAddress(container), container);
    }

    /** Returns a new {@code VkBuildPartitionedAccelerationStructureIndirectCommandNV} instance for the specified memory address. */
    public static VkBuildPartitionedAccelerationStructureIndirectCommandNV create(long address) {
        return new VkBuildPartitionedAccelerationStructureIndirectCommandNV(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable VkBuildPartitionedAccelerationStructureIndirectCommandNV createSafe(long address) {
        return address == NULL ? null : new VkBuildPartitionedAccelerationStructureIndirectCommandNV(address, null);
    }

    /**
     * Returns a new {@link VkBuildPartitionedAccelerationStructureIndirectCommandNV.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkBuildPartitionedAccelerationStructureIndirectCommandNV.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkBuildPartitionedAccelerationStructureIndirectCommandNV.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkBuildPartitionedAccelerationStructureIndirectCommandNV.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkBuildPartitionedAccelerationStructureIndirectCommandNV.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkBuildPartitionedAccelerationStructureIndirectCommandNV.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkBuildPartitionedAccelerationStructureIndirectCommandNV.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkBuildPartitionedAccelerationStructureIndirectCommandNV.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static VkBuildPartitionedAccelerationStructureIndirectCommandNV.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code VkBuildPartitionedAccelerationStructureIndirectCommandNV} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkBuildPartitionedAccelerationStructureIndirectCommandNV malloc(MemoryStack stack) {
        return new VkBuildPartitionedAccelerationStructureIndirectCommandNV(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkBuildPartitionedAccelerationStructureIndirectCommandNV} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkBuildPartitionedAccelerationStructureIndirectCommandNV calloc(MemoryStack stack) {
        return new VkBuildPartitionedAccelerationStructureIndirectCommandNV(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkBuildPartitionedAccelerationStructureIndirectCommandNV.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkBuildPartitionedAccelerationStructureIndirectCommandNV.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkBuildPartitionedAccelerationStructureIndirectCommandNV.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkBuildPartitionedAccelerationStructureIndirectCommandNV.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #opType}. */
    public static int nopType(long struct) { return memGetInt(struct + VkBuildPartitionedAccelerationStructureIndirectCommandNV.OPTYPE); }
    /** Unsafe version of {@link #argCount}. */
    public static int nargCount(long struct) { return memGetInt(struct + VkBuildPartitionedAccelerationStructureIndirectCommandNV.ARGCOUNT); }
    /** Unsafe version of {@link #argData}. */
    public static VkStridedDeviceAddressNV nargData(long struct) { return VkStridedDeviceAddressNV.create(struct + VkBuildPartitionedAccelerationStructureIndirectCommandNV.ARGDATA); }

    /** Unsafe version of {@link #opType(int) opType}. */
    public static void nopType(long struct, int value) { memPutInt(struct + VkBuildPartitionedAccelerationStructureIndirectCommandNV.OPTYPE, value); }
    /** Unsafe version of {@link #argCount(int) argCount}. */
    public static void nargCount(long struct, int value) { memPutInt(struct + VkBuildPartitionedAccelerationStructureIndirectCommandNV.ARGCOUNT, value); }
    /** Unsafe version of {@link #argData(VkStridedDeviceAddressNV) argData}. */
    public static void nargData(long struct, VkStridedDeviceAddressNV value) { memCopy(value.address(), struct + VkBuildPartitionedAccelerationStructureIndirectCommandNV.ARGDATA, VkStridedDeviceAddressNV.SIZEOF); }

    // -----------------------------------

    /** An array of {@link VkBuildPartitionedAccelerationStructureIndirectCommandNV} structs. */
    public static class Buffer extends StructBuffer<VkBuildPartitionedAccelerationStructureIndirectCommandNV, Buffer> implements NativeResource {

        private static final VkBuildPartitionedAccelerationStructureIndirectCommandNV ELEMENT_FACTORY = VkBuildPartitionedAccelerationStructureIndirectCommandNV.create(-1L);

        /**
         * Creates a new {@code VkBuildPartitionedAccelerationStructureIndirectCommandNV.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkBuildPartitionedAccelerationStructureIndirectCommandNV#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkBuildPartitionedAccelerationStructureIndirectCommandNV getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code opType} field. */
        @NativeType("VkPartitionedAccelerationStructureOpTypeNV")
        public int opType() { return VkBuildPartitionedAccelerationStructureIndirectCommandNV.nopType(address()); }
        /** @return the value of the {@code argCount} field. */
        @NativeType("uint32_t")
        public int argCount() { return VkBuildPartitionedAccelerationStructureIndirectCommandNV.nargCount(address()); }
        /** @return a {@link VkStridedDeviceAddressNV} view of the {@code argData} field. */
        public VkStridedDeviceAddressNV argData() { return VkBuildPartitionedAccelerationStructureIndirectCommandNV.nargData(address()); }

        /** Sets the specified value to the {@code opType} field. */
        public VkBuildPartitionedAccelerationStructureIndirectCommandNV.Buffer opType(@NativeType("VkPartitionedAccelerationStructureOpTypeNV") int value) { VkBuildPartitionedAccelerationStructureIndirectCommandNV.nopType(address(), value); return this; }
        /** Sets the specified value to the {@code argCount} field. */
        public VkBuildPartitionedAccelerationStructureIndirectCommandNV.Buffer argCount(@NativeType("uint32_t") int value) { VkBuildPartitionedAccelerationStructureIndirectCommandNV.nargCount(address(), value); return this; }
        /** Copies the specified {@link VkStridedDeviceAddressNV} to the {@code argData} field. */
        public VkBuildPartitionedAccelerationStructureIndirectCommandNV.Buffer argData(VkStridedDeviceAddressNV value) { VkBuildPartitionedAccelerationStructureIndirectCommandNV.nargData(address(), value); return this; }
        /** Passes the {@code argData} field to the specified {@link java.util.function.Consumer Consumer}. */
        public VkBuildPartitionedAccelerationStructureIndirectCommandNV.Buffer argData(java.util.function.Consumer<VkStridedDeviceAddressNV> consumer) { consumer.accept(argData()); return this; }

    }

}