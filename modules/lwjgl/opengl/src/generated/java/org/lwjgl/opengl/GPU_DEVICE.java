/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.opengl;

import org.jspecify.annotations.*;

import java.nio.*;

import org.lwjgl.*;
import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

import org.lwjgl.system.windows.*;

/**
 * <pre>{@code
 * struct GPU_DEVICE {
 *     DWORD cb;
 *     CHAR DeviceName[32];
 *     CHAR DeviceString[128];
 *     DWORD Flags;
 *     {@link RECT RECT} rcVirtualScreen;
 * }}</pre>
 */
public class GPU_DEVICE extends Struct<GPU_DEVICE> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        CB,
        DEVICENAME,
        DEVICESTRING,
        FLAGS,
        RCVIRTUALSCREEN;

    static {
        Layout layout = __struct(
            __member(4),
            __array(1, 32),
            __array(1, 128),
            __member(4),
            __member(RECT.SIZEOF, RECT.ALIGNOF)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        CB = layout.offsetof(0);
        DEVICENAME = layout.offsetof(1);
        DEVICESTRING = layout.offsetof(2);
        FLAGS = layout.offsetof(3);
        RCVIRTUALSCREEN = layout.offsetof(4);
    }

    protected GPU_DEVICE(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected GPU_DEVICE create(long address, @Nullable ByteBuffer container) {
        return new GPU_DEVICE(address, container);
    }

    /**
     * Creates a {@code GPU_DEVICE} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public GPU_DEVICE(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return the value of the {@code cb} field. */
    @NativeType("DWORD")
    public int cb() { return ncb(address()); }
    /** @return a {@link ByteBuffer} view of the {@code DeviceName} field. */
    @NativeType("CHAR[32]")
    public ByteBuffer DeviceName() { return nDeviceName(address()); }
    /** @return the null-terminated string stored in the {@code DeviceName} field. */
    @NativeType("CHAR[32]")
    public String DeviceNameString() { return nDeviceNameString(address()); }
    /** @return a {@link ByteBuffer} view of the {@code DeviceString} field. */
    @NativeType("CHAR[128]")
    public ByteBuffer DeviceString() { return nDeviceString(address()); }
    /** @return the null-terminated string stored in the {@code DeviceString} field. */
    @NativeType("CHAR[128]")
    public String DeviceStringString() { return nDeviceStringString(address()); }
    /** @return the value of the {@code Flags} field. */
    @NativeType("DWORD")
    public int Flags() { return nFlags(address()); }
    /** @return a {@link RECT} view of the {@code rcVirtualScreen} field. */
    public RECT rcVirtualScreen() { return nrcVirtualScreen(address()); }

    // -----------------------------------

    /** Returns a new {@code GPU_DEVICE} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static GPU_DEVICE malloc() {
        return new GPU_DEVICE(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code GPU_DEVICE} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static GPU_DEVICE calloc() {
        return new GPU_DEVICE(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code GPU_DEVICE} instance allocated with {@link BufferUtils}. */
    public static GPU_DEVICE create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new GPU_DEVICE(memAddress(container), container);
    }

    /** Returns a new {@code GPU_DEVICE} instance for the specified memory address. */
    public static GPU_DEVICE create(long address) {
        return new GPU_DEVICE(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable GPU_DEVICE createSafe(long address) {
        return address == NULL ? null : new GPU_DEVICE(address, null);
    }

    /**
     * Returns a new {@link GPU_DEVICE.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static GPU_DEVICE.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link GPU_DEVICE.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static GPU_DEVICE.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link GPU_DEVICE.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static GPU_DEVICE.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link GPU_DEVICE.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static GPU_DEVICE.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static GPU_DEVICE.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    // -----------------------------------

    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static GPU_DEVICE mallocStack() { return malloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static GPU_DEVICE callocStack() { return calloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static GPU_DEVICE mallocStack(MemoryStack stack) { return malloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static GPU_DEVICE callocStack(MemoryStack stack) { return calloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static GPU_DEVICE.Buffer mallocStack(int capacity) { return malloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static GPU_DEVICE.Buffer callocStack(int capacity) { return calloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static GPU_DEVICE.Buffer mallocStack(int capacity, MemoryStack stack) { return malloc(capacity, stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static GPU_DEVICE.Buffer callocStack(int capacity, MemoryStack stack) { return calloc(capacity, stack); }

    /**
     * Returns a new {@code GPU_DEVICE} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static GPU_DEVICE malloc(MemoryStack stack) {
        return new GPU_DEVICE(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code GPU_DEVICE} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static GPU_DEVICE calloc(MemoryStack stack) {
        return new GPU_DEVICE(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link GPU_DEVICE.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static GPU_DEVICE.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link GPU_DEVICE.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static GPU_DEVICE.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #cb}. */
    public static int ncb(long struct) { return memGetInt(struct + GPU_DEVICE.CB); }
    /** Unsafe version of {@link #DeviceName}. */
    public static ByteBuffer nDeviceName(long struct) { return memByteBuffer(struct + GPU_DEVICE.DEVICENAME, 32); }
    /** Unsafe version of {@link #DeviceNameString}. */
    public static String nDeviceNameString(long struct) { return memASCII(struct + GPU_DEVICE.DEVICENAME); }
    /** Unsafe version of {@link #DeviceString}. */
    public static ByteBuffer nDeviceString(long struct) { return memByteBuffer(struct + GPU_DEVICE.DEVICESTRING, 128); }
    /** Unsafe version of {@link #DeviceStringString}. */
    public static String nDeviceStringString(long struct) { return memASCII(struct + GPU_DEVICE.DEVICESTRING); }
    /** Unsafe version of {@link #Flags}. */
    public static int nFlags(long struct) { return memGetInt(struct + GPU_DEVICE.FLAGS); }
    /** Unsafe version of {@link #rcVirtualScreen}. */
    public static RECT nrcVirtualScreen(long struct) { return RECT.create(struct + GPU_DEVICE.RCVIRTUALSCREEN); }

    // -----------------------------------

    /** An array of {@link GPU_DEVICE} structs. */
    public static class Buffer extends StructBuffer<GPU_DEVICE, Buffer> implements NativeResource {

        private static final GPU_DEVICE ELEMENT_FACTORY = GPU_DEVICE.create(-1L);

        /**
         * Creates a new {@code GPU_DEVICE.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link GPU_DEVICE#SIZEOF}, and its mark will be undefined.</p>
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
        protected GPU_DEVICE getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code cb} field. */
        @NativeType("DWORD")
        public int cb() { return GPU_DEVICE.ncb(address()); }
        /** @return a {@link ByteBuffer} view of the {@code DeviceName} field. */
        @NativeType("CHAR[32]")
        public ByteBuffer DeviceName() { return GPU_DEVICE.nDeviceName(address()); }
        /** @return the null-terminated string stored in the {@code DeviceName} field. */
        @NativeType("CHAR[32]")
        public String DeviceNameString() { return GPU_DEVICE.nDeviceNameString(address()); }
        /** @return a {@link ByteBuffer} view of the {@code DeviceString} field. */
        @NativeType("CHAR[128]")
        public ByteBuffer DeviceString() { return GPU_DEVICE.nDeviceString(address()); }
        /** @return the null-terminated string stored in the {@code DeviceString} field. */
        @NativeType("CHAR[128]")
        public String DeviceStringString() { return GPU_DEVICE.nDeviceStringString(address()); }
        /** @return the value of the {@code Flags} field. */
        @NativeType("DWORD")
        public int Flags() { return GPU_DEVICE.nFlags(address()); }
        /** @return a {@link RECT} view of the {@code rcVirtualScreen} field. */
        public RECT rcVirtualScreen() { return GPU_DEVICE.nrcVirtualScreen(address()); }

    }

}