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

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

import static org.lwjgl.vulkan.ARMDataGraph.*;

/**
 * <pre>{@code
 * struct VkPhysicalDeviceDataGraphOperationSupportARM {
 *     VkPhysicalDeviceDataGraphOperationTypeARM operationType;
 *     char name[VK_MAX_PHYSICAL_DEVICE_DATA_GRAPH_OPERATION_SET_NAME_SIZE_ARM];
 *     uint32_t version;
 * }}</pre>
 */
public class VkPhysicalDeviceDataGraphOperationSupportARM extends Struct<VkPhysicalDeviceDataGraphOperationSupportARM> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        OPERATIONTYPE,
        NAME,
        VERSION;

    static {
        Layout layout = __struct(
            __member(4),
            __array(1, VK_MAX_PHYSICAL_DEVICE_DATA_GRAPH_OPERATION_SET_NAME_SIZE_ARM),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        OPERATIONTYPE = layout.offsetof(0);
        NAME = layout.offsetof(1);
        VERSION = layout.offsetof(2);
    }

    protected VkPhysicalDeviceDataGraphOperationSupportARM(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkPhysicalDeviceDataGraphOperationSupportARM create(long address, @Nullable ByteBuffer container) {
        return new VkPhysicalDeviceDataGraphOperationSupportARM(address, container);
    }

    /**
     * Creates a {@code VkPhysicalDeviceDataGraphOperationSupportARM} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkPhysicalDeviceDataGraphOperationSupportARM(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return the value of the {@code operationType} field. */
    @NativeType("VkPhysicalDeviceDataGraphOperationTypeARM")
    public int operationType() { return noperationType(address()); }
    /** @return a {@link ByteBuffer} view of the {@code name} field. */
    @NativeType("char[VK_MAX_PHYSICAL_DEVICE_DATA_GRAPH_OPERATION_SET_NAME_SIZE_ARM]")
    public ByteBuffer name() { return nname(address()); }
    /** @return the null-terminated string stored in the {@code name} field. */
    @NativeType("char[VK_MAX_PHYSICAL_DEVICE_DATA_GRAPH_OPERATION_SET_NAME_SIZE_ARM]")
    public String nameString() { return nnameString(address()); }
    /** @return the value of the {@code version} field. */
    @NativeType("uint32_t")
    public int version() { return nversion(address()); }

    /** Sets the specified value to the {@code operationType} field. */
    public VkPhysicalDeviceDataGraphOperationSupportARM operationType(@NativeType("VkPhysicalDeviceDataGraphOperationTypeARM") int value) { noperationType(address(), value); return this; }
    /** Copies the specified encoded string to the {@code name} field. */
    public VkPhysicalDeviceDataGraphOperationSupportARM name(@NativeType("char[VK_MAX_PHYSICAL_DEVICE_DATA_GRAPH_OPERATION_SET_NAME_SIZE_ARM]") ByteBuffer value) { nname(address(), value); return this; }
    /** Sets the specified value to the {@code version} field. */
    public VkPhysicalDeviceDataGraphOperationSupportARM version(@NativeType("uint32_t") int value) { nversion(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkPhysicalDeviceDataGraphOperationSupportARM set(
        int operationType,
        ByteBuffer name,
        int version
    ) {
        operationType(operationType);
        name(name);
        version(version);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkPhysicalDeviceDataGraphOperationSupportARM set(VkPhysicalDeviceDataGraphOperationSupportARM src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkPhysicalDeviceDataGraphOperationSupportARM} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkPhysicalDeviceDataGraphOperationSupportARM malloc() {
        return new VkPhysicalDeviceDataGraphOperationSupportARM(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkPhysicalDeviceDataGraphOperationSupportARM} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkPhysicalDeviceDataGraphOperationSupportARM calloc() {
        return new VkPhysicalDeviceDataGraphOperationSupportARM(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkPhysicalDeviceDataGraphOperationSupportARM} instance allocated with {@link BufferUtils}. */
    public static VkPhysicalDeviceDataGraphOperationSupportARM create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkPhysicalDeviceDataGraphOperationSupportARM(memAddress(container), container);
    }

    /** Returns a new {@code VkPhysicalDeviceDataGraphOperationSupportARM} instance for the specified memory address. */
    public static VkPhysicalDeviceDataGraphOperationSupportARM create(long address) {
        return new VkPhysicalDeviceDataGraphOperationSupportARM(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable VkPhysicalDeviceDataGraphOperationSupportARM createSafe(long address) {
        return address == NULL ? null : new VkPhysicalDeviceDataGraphOperationSupportARM(address, null);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceDataGraphOperationSupportARM.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceDataGraphOperationSupportARM.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceDataGraphOperationSupportARM.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceDataGraphOperationSupportARM.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceDataGraphOperationSupportARM.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceDataGraphOperationSupportARM.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkPhysicalDeviceDataGraphOperationSupportARM.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceDataGraphOperationSupportARM.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static VkPhysicalDeviceDataGraphOperationSupportARM.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code VkPhysicalDeviceDataGraphOperationSupportARM} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDeviceDataGraphOperationSupportARM malloc(MemoryStack stack) {
        return new VkPhysicalDeviceDataGraphOperationSupportARM(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkPhysicalDeviceDataGraphOperationSupportARM} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDeviceDataGraphOperationSupportARM calloc(MemoryStack stack) {
        return new VkPhysicalDeviceDataGraphOperationSupportARM(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceDataGraphOperationSupportARM.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceDataGraphOperationSupportARM.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceDataGraphOperationSupportARM.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceDataGraphOperationSupportARM.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #operationType}. */
    public static int noperationType(long struct) { return memGetInt(struct + VkPhysicalDeviceDataGraphOperationSupportARM.OPERATIONTYPE); }
    /** Unsafe version of {@link #name}. */
    public static ByteBuffer nname(long struct) { return memByteBuffer(struct + VkPhysicalDeviceDataGraphOperationSupportARM.NAME, VK_MAX_PHYSICAL_DEVICE_DATA_GRAPH_OPERATION_SET_NAME_SIZE_ARM); }
    /** Unsafe version of {@link #nameString}. */
    public static String nnameString(long struct) { return memUTF8(struct + VkPhysicalDeviceDataGraphOperationSupportARM.NAME); }
    /** Unsafe version of {@link #version}. */
    public static int nversion(long struct) { return memGetInt(struct + VkPhysicalDeviceDataGraphOperationSupportARM.VERSION); }

    /** Unsafe version of {@link #operationType(int) operationType}. */
    public static void noperationType(long struct, int value) { memPutInt(struct + VkPhysicalDeviceDataGraphOperationSupportARM.OPERATIONTYPE, value); }
    /** Unsafe version of {@link #name(ByteBuffer) name}. */
    public static void nname(long struct, ByteBuffer value) {
        if (CHECKS) {
            checkNT1(value);
            checkGT(value, VK_MAX_PHYSICAL_DEVICE_DATA_GRAPH_OPERATION_SET_NAME_SIZE_ARM);
        }
        memCopy(memAddress(value), struct + VkPhysicalDeviceDataGraphOperationSupportARM.NAME, value.remaining());
    }
    /** Unsafe version of {@link #version(int) version}. */
    public static void nversion(long struct, int value) { memPutInt(struct + VkPhysicalDeviceDataGraphOperationSupportARM.VERSION, value); }

    // -----------------------------------

    /** An array of {@link VkPhysicalDeviceDataGraphOperationSupportARM} structs. */
    public static class Buffer extends StructBuffer<VkPhysicalDeviceDataGraphOperationSupportARM, Buffer> implements NativeResource {

        private static final VkPhysicalDeviceDataGraphOperationSupportARM ELEMENT_FACTORY = VkPhysicalDeviceDataGraphOperationSupportARM.create(-1L);

        /**
         * Creates a new {@code VkPhysicalDeviceDataGraphOperationSupportARM.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkPhysicalDeviceDataGraphOperationSupportARM#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkPhysicalDeviceDataGraphOperationSupportARM getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code operationType} field. */
        @NativeType("VkPhysicalDeviceDataGraphOperationTypeARM")
        public int operationType() { return VkPhysicalDeviceDataGraphOperationSupportARM.noperationType(address()); }
        /** @return a {@link ByteBuffer} view of the {@code name} field. */
        @NativeType("char[VK_MAX_PHYSICAL_DEVICE_DATA_GRAPH_OPERATION_SET_NAME_SIZE_ARM]")
        public ByteBuffer name() { return VkPhysicalDeviceDataGraphOperationSupportARM.nname(address()); }
        /** @return the null-terminated string stored in the {@code name} field. */
        @NativeType("char[VK_MAX_PHYSICAL_DEVICE_DATA_GRAPH_OPERATION_SET_NAME_SIZE_ARM]")
        public String nameString() { return VkPhysicalDeviceDataGraphOperationSupportARM.nnameString(address()); }
        /** @return the value of the {@code version} field. */
        @NativeType("uint32_t")
        public int version() { return VkPhysicalDeviceDataGraphOperationSupportARM.nversion(address()); }

        /** Sets the specified value to the {@code operationType} field. */
        public VkPhysicalDeviceDataGraphOperationSupportARM.Buffer operationType(@NativeType("VkPhysicalDeviceDataGraphOperationTypeARM") int value) { VkPhysicalDeviceDataGraphOperationSupportARM.noperationType(address(), value); return this; }
        /** Copies the specified encoded string to the {@code name} field. */
        public VkPhysicalDeviceDataGraphOperationSupportARM.Buffer name(@NativeType("char[VK_MAX_PHYSICAL_DEVICE_DATA_GRAPH_OPERATION_SET_NAME_SIZE_ARM]") ByteBuffer value) { VkPhysicalDeviceDataGraphOperationSupportARM.nname(address(), value); return this; }
        /** Sets the specified value to the {@code version} field. */
        public VkPhysicalDeviceDataGraphOperationSupportARM.Buffer version(@NativeType("uint32_t") int value) { VkPhysicalDeviceDataGraphOperationSupportARM.nversion(address(), value); return this; }

    }

}