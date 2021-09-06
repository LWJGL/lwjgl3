/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.opencl;

import javax.annotation.*;

import java.nio.*;

import org.lwjgl.*;
import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * The struct returned by {@link CL10#clGetDeviceInfo GetDeviceInfo} with {@code param_name} set to {@link AMDDeviceTopology#CL_DEVICE_TOPOLOGY_AMD DEVICE_TOPOLOGY_AMD}.
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * union cl_device_topology_amd {
 *     struct {
 *         cl_uint type;
 *         cl_uint data[5];
 *     } raw;
 *     struct {
 *         cl_uint type;
 *         char[17];
 *         cl_char bus;
 *         cl_char device;
 *         cl_char function;
 *     } pcie;
 * }</code></pre>
 */
@NativeType("union cl_device_topology_amd")
public class CLDeviceTopologyAMD extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        RAW,
            RAW_TYPE,
            RAW_DATA,
        PCIE,
            PCIE_TYPE,
            PCIE_BUS,
            PCIE_DEVICE,
            PCIE_FUNCTION;

    static {
        Layout layout = __union(
            __struct(
                __member(4),
                __array(4, 5)
            ),
            __struct(
                __member(4),
                __padding(17, true),
                __member(1),
                __member(1),
                __member(1)
            )
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        RAW = layout.offsetof(0);
            RAW_TYPE = layout.offsetof(1);
            RAW_DATA = layout.offsetof(2);
        PCIE = layout.offsetof(3);
            PCIE_TYPE = layout.offsetof(4);
            PCIE_BUS = layout.offsetof(6);
            PCIE_DEVICE = layout.offsetof(7);
            PCIE_FUNCTION = layout.offsetof(8);
    }

    /**
     * Creates a {@code CLDeviceTopologyAMD} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public CLDeviceTopologyAMD(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return the value of the {@code raw.type} field. */
    @NativeType("cl_uint")
    public int raw_type() { return nraw_type(address()); }
    /** @return a {@link IntBuffer} view of the {@code raw.data} field. */
    @NativeType("cl_uint[5]")
    public IntBuffer raw_data() { return nraw_data(address()); }
    /** @return the value at the specified index of the {@code raw.data} field. */
    @NativeType("cl_uint")
    public int raw_data(int index) { return nraw_data(address(), index); }
    /** @return the value of the {@code pcie.type} field. */
    @NativeType("cl_uint")
    public int pcie_type() { return npcie_type(address()); }
    /** @return the value of the {@code pcie.bus} field. */
    @NativeType("cl_char")
    public byte pcie_bus() { return npcie_bus(address()); }
    /** @return the value of the {@code pcie.device} field. */
    @NativeType("cl_char")
    public byte pcie_device() { return npcie_device(address()); }
    /** @return the value of the {@code pcie.function} field. */
    @NativeType("cl_char")
    public byte pcie_function() { return npcie_function(address()); }

    // -----------------------------------

    /** Returns a new {@code CLDeviceTopologyAMD} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static CLDeviceTopologyAMD malloc() {
        return wrap(CLDeviceTopologyAMD.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code CLDeviceTopologyAMD} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static CLDeviceTopologyAMD calloc() {
        return wrap(CLDeviceTopologyAMD.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code CLDeviceTopologyAMD} instance allocated with {@link BufferUtils}. */
    public static CLDeviceTopologyAMD create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(CLDeviceTopologyAMD.class, memAddress(container), container);
    }

    /** Returns a new {@code CLDeviceTopologyAMD} instance for the specified memory address. */
    public static CLDeviceTopologyAMD create(long address) {
        return wrap(CLDeviceTopologyAMD.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static CLDeviceTopologyAMD createSafe(long address) {
        return address == NULL ? null : wrap(CLDeviceTopologyAMD.class, address);
    }

    /**
     * Returns a new {@link CLDeviceTopologyAMD.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static CLDeviceTopologyAMD.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link CLDeviceTopologyAMD.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static CLDeviceTopologyAMD.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link CLDeviceTopologyAMD.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static CLDeviceTopologyAMD.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link CLDeviceTopologyAMD.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static CLDeviceTopologyAMD.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static CLDeviceTopologyAMD.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    // -----------------------------------

    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static CLDeviceTopologyAMD mallocStack() { return malloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static CLDeviceTopologyAMD callocStack() { return calloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static CLDeviceTopologyAMD mallocStack(MemoryStack stack) { return malloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static CLDeviceTopologyAMD callocStack(MemoryStack stack) { return calloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static CLDeviceTopologyAMD.Buffer mallocStack(int capacity) { return malloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static CLDeviceTopologyAMD.Buffer callocStack(int capacity) { return calloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static CLDeviceTopologyAMD.Buffer mallocStack(int capacity, MemoryStack stack) { return malloc(capacity, stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static CLDeviceTopologyAMD.Buffer callocStack(int capacity, MemoryStack stack) { return calloc(capacity, stack); }

    /**
     * Returns a new {@code CLDeviceTopologyAMD} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static CLDeviceTopologyAMD malloc(MemoryStack stack) {
        return wrap(CLDeviceTopologyAMD.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code CLDeviceTopologyAMD} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static CLDeviceTopologyAMD calloc(MemoryStack stack) {
        return wrap(CLDeviceTopologyAMD.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link CLDeviceTopologyAMD.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static CLDeviceTopologyAMD.Buffer malloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link CLDeviceTopologyAMD.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static CLDeviceTopologyAMD.Buffer calloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #raw_type}. */
    public static int nraw_type(long struct) { return UNSAFE.getInt(null, struct + CLDeviceTopologyAMD.RAW_TYPE); }
    /** Unsafe version of {@link #raw_data}. */
    public static IntBuffer nraw_data(long struct) { return memIntBuffer(struct + CLDeviceTopologyAMD.RAW_DATA, 5); }
    /** Unsafe version of {@link #raw_data(int) raw_data}. */
    public static int nraw_data(long struct, int index) {
        return UNSAFE.getInt(null, struct + CLDeviceTopologyAMD.RAW_DATA + check(index, 5) * 4);
    }
    /** Unsafe version of {@link #pcie_type}. */
    public static int npcie_type(long struct) { return UNSAFE.getInt(null, struct + CLDeviceTopologyAMD.PCIE_TYPE); }
    /** Unsafe version of {@link #pcie_bus}. */
    public static byte npcie_bus(long struct) { return UNSAFE.getByte(null, struct + CLDeviceTopologyAMD.PCIE_BUS); }
    /** Unsafe version of {@link #pcie_device}. */
    public static byte npcie_device(long struct) { return UNSAFE.getByte(null, struct + CLDeviceTopologyAMD.PCIE_DEVICE); }
    /** Unsafe version of {@link #pcie_function}. */
    public static byte npcie_function(long struct) { return UNSAFE.getByte(null, struct + CLDeviceTopologyAMD.PCIE_FUNCTION); }

    // -----------------------------------

    /** An array of {@link CLDeviceTopologyAMD} structs. */
    public static class Buffer extends StructBuffer<CLDeviceTopologyAMD, Buffer> implements NativeResource {

        private static final CLDeviceTopologyAMD ELEMENT_FACTORY = CLDeviceTopologyAMD.create(-1L);

        /**
         * Creates a new {@code CLDeviceTopologyAMD.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link CLDeviceTopologyAMD#SIZEOF}, and its mark will be undefined.
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
        protected CLDeviceTopologyAMD getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code raw.type} field. */
        @NativeType("cl_uint")
        public int raw_type() { return CLDeviceTopologyAMD.nraw_type(address()); }
        /** @return a {@link IntBuffer} view of the {@code raw.data} field. */
        @NativeType("cl_uint[5]")
        public IntBuffer raw_data() { return CLDeviceTopologyAMD.nraw_data(address()); }
        /** @return the value at the specified index of the {@code raw.data} field. */
        @NativeType("cl_uint")
        public int raw_data(int index) { return CLDeviceTopologyAMD.nraw_data(address(), index); }
        /** @return the value of the {@code pcie.type} field. */
        @NativeType("cl_uint")
        public int pcie_type() { return CLDeviceTopologyAMD.npcie_type(address()); }
        /** @return the value of the {@code pcie.bus} field. */
        @NativeType("cl_char")
        public byte pcie_bus() { return CLDeviceTopologyAMD.npcie_bus(address()); }
        /** @return the value of the {@code pcie.device} field. */
        @NativeType("cl_char")
        public byte pcie_device() { return CLDeviceTopologyAMD.npcie_device(address()); }
        /** @return the value of the {@code pcie.function} field. */
        @NativeType("cl_char")
        public byte pcie_function() { return CLDeviceTopologyAMD.npcie_function(address()); }

    }

}