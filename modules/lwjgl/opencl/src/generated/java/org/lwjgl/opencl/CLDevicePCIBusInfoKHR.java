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

import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct cl_device_pci_bus_info_khr {
 *     cl_uint pci_domain;
 *     cl_uint pci_bus;
 *     cl_uint pci_device;
 *     cl_uint pci_function;
 * }</code></pre>
 */
@NativeType("struct cl_device_pci_bus_info_khr")
public class CLDevicePCIBusInfoKHR extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        PCI_DOMAIN,
        PCI_BUS,
        PCI_DEVICE,
        PCI_FUNCTION;

    static {
        Layout layout = __struct(
            __member(4),
            __member(4),
            __member(4),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        PCI_DOMAIN = layout.offsetof(0);
        PCI_BUS = layout.offsetof(1);
        PCI_DEVICE = layout.offsetof(2);
        PCI_FUNCTION = layout.offsetof(3);
    }

    /**
     * Creates a {@code CLDevicePCIBusInfoKHR} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public CLDevicePCIBusInfoKHR(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return the value of the {@code pci_domain} field. */
    @NativeType("cl_uint")
    public int pci_domain() { return npci_domain(address()); }
    /** @return the value of the {@code pci_bus} field. */
    @NativeType("cl_uint")
    public int pci_bus() { return npci_bus(address()); }
    /** @return the value of the {@code pci_device} field. */
    @NativeType("cl_uint")
    public int pci_device() { return npci_device(address()); }
    /** @return the value of the {@code pci_function} field. */
    @NativeType("cl_uint")
    public int pci_function() { return npci_function(address()); }

    // -----------------------------------

    /** Returns a new {@code CLDevicePCIBusInfoKHR} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static CLDevicePCIBusInfoKHR malloc() {
        return wrap(CLDevicePCIBusInfoKHR.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code CLDevicePCIBusInfoKHR} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static CLDevicePCIBusInfoKHR calloc() {
        return wrap(CLDevicePCIBusInfoKHR.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code CLDevicePCIBusInfoKHR} instance allocated with {@link BufferUtils}. */
    public static CLDevicePCIBusInfoKHR create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(CLDevicePCIBusInfoKHR.class, memAddress(container), container);
    }

    /** Returns a new {@code CLDevicePCIBusInfoKHR} instance for the specified memory address. */
    public static CLDevicePCIBusInfoKHR create(long address) {
        return wrap(CLDevicePCIBusInfoKHR.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static CLDevicePCIBusInfoKHR createSafe(long address) {
        return address == NULL ? null : wrap(CLDevicePCIBusInfoKHR.class, address);
    }

    /**
     * Returns a new {@link CLDevicePCIBusInfoKHR.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static CLDevicePCIBusInfoKHR.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link CLDevicePCIBusInfoKHR.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static CLDevicePCIBusInfoKHR.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link CLDevicePCIBusInfoKHR.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static CLDevicePCIBusInfoKHR.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link CLDevicePCIBusInfoKHR.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static CLDevicePCIBusInfoKHR.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static CLDevicePCIBusInfoKHR.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    /**
     * Returns a new {@code CLDevicePCIBusInfoKHR} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static CLDevicePCIBusInfoKHR malloc(MemoryStack stack) {
        return wrap(CLDevicePCIBusInfoKHR.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code CLDevicePCIBusInfoKHR} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static CLDevicePCIBusInfoKHR calloc(MemoryStack stack) {
        return wrap(CLDevicePCIBusInfoKHR.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link CLDevicePCIBusInfoKHR.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static CLDevicePCIBusInfoKHR.Buffer malloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link CLDevicePCIBusInfoKHR.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static CLDevicePCIBusInfoKHR.Buffer calloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #pci_domain}. */
    public static int npci_domain(long struct) { return UNSAFE.getInt(null, struct + CLDevicePCIBusInfoKHR.PCI_DOMAIN); }
    /** Unsafe version of {@link #pci_bus}. */
    public static int npci_bus(long struct) { return UNSAFE.getInt(null, struct + CLDevicePCIBusInfoKHR.PCI_BUS); }
    /** Unsafe version of {@link #pci_device}. */
    public static int npci_device(long struct) { return UNSAFE.getInt(null, struct + CLDevicePCIBusInfoKHR.PCI_DEVICE); }
    /** Unsafe version of {@link #pci_function}. */
    public static int npci_function(long struct) { return UNSAFE.getInt(null, struct + CLDevicePCIBusInfoKHR.PCI_FUNCTION); }

    // -----------------------------------

    /** An array of {@link CLDevicePCIBusInfoKHR} structs. */
    public static class Buffer extends StructBuffer<CLDevicePCIBusInfoKHR, Buffer> implements NativeResource {

        private static final CLDevicePCIBusInfoKHR ELEMENT_FACTORY = CLDevicePCIBusInfoKHR.create(-1L);

        /**
         * Creates a new {@code CLDevicePCIBusInfoKHR.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link CLDevicePCIBusInfoKHR#SIZEOF}, and its mark will be undefined.
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
        protected CLDevicePCIBusInfoKHR getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code pci_domain} field. */
        @NativeType("cl_uint")
        public int pci_domain() { return CLDevicePCIBusInfoKHR.npci_domain(address()); }
        /** @return the value of the {@code pci_bus} field. */
        @NativeType("cl_uint")
        public int pci_bus() { return CLDevicePCIBusInfoKHR.npci_bus(address()); }
        /** @return the value of the {@code pci_device} field. */
        @NativeType("cl_uint")
        public int pci_device() { return CLDevicePCIBusInfoKHR.npci_device(address()); }
        /** @return the value of the {@code pci_function} field. */
        @NativeType("cl_uint")
        public int pci_function() { return CLDevicePCIBusInfoKHR.npci_function(address()); }

    }

}