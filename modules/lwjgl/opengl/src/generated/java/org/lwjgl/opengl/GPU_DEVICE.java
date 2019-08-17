/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.opengl;

import javax.annotation.*;

import java.nio.*;

import org.lwjgl.*;
import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

import org.lwjgl.system.windows.*;

/**
 * Receives information about the display device specified by the {@code deviceIndex} parameter of the {@link WGLNVGPUAffinity#wglEnumGpuDevicesNV EnumGpuDevicesNV} function.
 * 
 * <h3>Member documentation</h3>
 * 
 * <ul>
 * <li>{@code cb} &ndash; 
 * the size of the {@code GPU_DEVICE} structure. Before calling {@link WGLNVGPUAffinity#wglEnumGpuDevicesNV EnumGpuDevicesNV}, set {@code cb} to the size, in bytes, of {@code GPU_DEVICE}.</li>
 * <li>{@code DeviceName[32]} &ndash; 
 * a string identifying the display device name. This will be the same string as stored in the {@code DeviceName} field of the {@code DISPLAY_DEVICE}
 * structure, which is filled in by {@code EnumDisplayDevices}.</li>
 * <li>{@code DeviceString[128]} &ndash; 
 * a string describing the GPU for this display device. It is the same string as stored in the {@code DeviceString} field in the {@code DISPLAY_DEVICE}
 * structure that is filled in by {@code EnumDisplayDevices} when it describes a display adapter (and not a monitor).</li>
 * <li>{@code Flags} &ndash; indicates the state of the display device</li>
 * <li>{@code rcVirtualScreen} &ndash; 
 * specifies the display device rectangle, in virtual screen coordinates. The value of {@code rcVirtualScreen} is undefined if the device is not part of
 * the desktop, i.e. {@code DISPLAY_DEVICE_ATTACHED_TO_DESKTOP} is not set in the {@code Flags} field.</li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct GPU_DEVICE {
 *     DWORD cb;
 *     CHAR DeviceName[32];
 *     CHAR DeviceString[128];
 *     DWORD Flags;
 *     {@link RECT RECT} rcVirtualScreen;
 * }</code></pre>
 */
public class GPU_DEVICE extends Struct implements NativeResource {

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

    /** Returns the value of the {@code cb} field. */
    @NativeType("DWORD")
    public int cb() { return ncb(address()); }
    /** Returns a {@link ByteBuffer} view of the {@code DeviceName} field. */
    @NativeType("CHAR[32]")
    public ByteBuffer DeviceName() { return nDeviceName(address()); }
    /** Decodes the null-terminated string stored in the {@code DeviceName} field. */
    @NativeType("CHAR[32]")
    public String DeviceNameString() { return nDeviceNameString(address()); }
    /** Returns a {@link ByteBuffer} view of the {@code DeviceString} field. */
    @NativeType("CHAR[128]")
    public ByteBuffer DeviceString() { return nDeviceString(address()); }
    /** Decodes the null-terminated string stored in the {@code DeviceString} field. */
    @NativeType("CHAR[128]")
    public String DeviceStringString() { return nDeviceStringString(address()); }
    /** Returns the value of the {@code Flags} field. */
    @NativeType("DWORD")
    public int Flags() { return nFlags(address()); }
    /** Returns a {@link RECT} view of the {@code rcVirtualScreen} field. */
    public RECT rcVirtualScreen() { return nrcVirtualScreen(address()); }

    // -----------------------------------

    /** Returns a new {@code GPU_DEVICE} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static GPU_DEVICE malloc() {
        return wrap(GPU_DEVICE.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code GPU_DEVICE} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static GPU_DEVICE calloc() {
        return wrap(GPU_DEVICE.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code GPU_DEVICE} instance allocated with {@link BufferUtils}. */
    public static GPU_DEVICE create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(GPU_DEVICE.class, memAddress(container), container);
    }

    /** Returns a new {@code GPU_DEVICE} instance for the specified memory address. */
    public static GPU_DEVICE create(long address) {
        return wrap(GPU_DEVICE.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static GPU_DEVICE createSafe(long address) {
        return address == NULL ? null : wrap(GPU_DEVICE.class, address);
    }

    /**
     * Returns a new {@link GPU_DEVICE.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static GPU_DEVICE.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link GPU_DEVICE.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static GPU_DEVICE.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link GPU_DEVICE.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static GPU_DEVICE.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link GPU_DEVICE.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static GPU_DEVICE.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static GPU_DEVICE.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    // -----------------------------------

    /** Returns a new {@code GPU_DEVICE} instance allocated on the thread-local {@link MemoryStack}. */
    public static GPU_DEVICE mallocStack() {
        return mallocStack(stackGet());
    }

    /** Returns a new {@code GPU_DEVICE} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero. */
    public static GPU_DEVICE callocStack() {
        return callocStack(stackGet());
    }

    /**
     * Returns a new {@code GPU_DEVICE} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static GPU_DEVICE mallocStack(MemoryStack stack) {
        return wrap(GPU_DEVICE.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code GPU_DEVICE} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static GPU_DEVICE callocStack(MemoryStack stack) {
        return wrap(GPU_DEVICE.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link GPU_DEVICE.Buffer} instance allocated on the thread-local {@link MemoryStack}.
     *
     * @param capacity the buffer capacity
     */
    public static GPU_DEVICE.Buffer mallocStack(int capacity) {
        return mallocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link GPU_DEVICE.Buffer} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param capacity the buffer capacity
     */
    public static GPU_DEVICE.Buffer callocStack(int capacity) {
        return callocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link GPU_DEVICE.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static GPU_DEVICE.Buffer mallocStack(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link GPU_DEVICE.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static GPU_DEVICE.Buffer callocStack(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #cb}. */
    public static int ncb(long struct) { return UNSAFE.getInt(null, struct + GPU_DEVICE.CB); }
    /** Unsafe version of {@link #DeviceName}. */
    public static ByteBuffer nDeviceName(long struct) { return memByteBuffer(struct + GPU_DEVICE.DEVICENAME, 32); }
    /** Unsafe version of {@link #DeviceNameString}. */
    public static String nDeviceNameString(long struct) { return memASCII(struct + GPU_DEVICE.DEVICENAME); }
    /** Unsafe version of {@link #DeviceString}. */
    public static ByteBuffer nDeviceString(long struct) { return memByteBuffer(struct + GPU_DEVICE.DEVICESTRING, 128); }
    /** Unsafe version of {@link #DeviceStringString}. */
    public static String nDeviceStringString(long struct) { return memASCII(struct + GPU_DEVICE.DEVICESTRING); }
    /** Unsafe version of {@link #Flags}. */
    public static int nFlags(long struct) { return UNSAFE.getInt(null, struct + GPU_DEVICE.FLAGS); }
    /** Unsafe version of {@link #rcVirtualScreen}. */
    public static RECT nrcVirtualScreen(long struct) { return RECT.create(struct + GPU_DEVICE.RCVIRTUALSCREEN); }

    // -----------------------------------

    /** An array of {@link GPU_DEVICE} structs. */
    public static class Buffer extends StructBuffer<GPU_DEVICE, Buffer> implements NativeResource {

        private static final GPU_DEVICE ELEMENT_FACTORY = GPU_DEVICE.create(-1L);

        /**
         * Creates a new {@code GPU_DEVICE.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link GPU_DEVICE#SIZEOF}, and its mark will be undefined.
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
        protected GPU_DEVICE getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** Returns the value of the {@code cb} field. */
        @NativeType("DWORD")
        public int cb() { return GPU_DEVICE.ncb(address()); }
        /** Returns a {@link ByteBuffer} view of the {@code DeviceName} field. */
        @NativeType("CHAR[32]")
        public ByteBuffer DeviceName() { return GPU_DEVICE.nDeviceName(address()); }
        /** Decodes the null-terminated string stored in the {@code DeviceName} field. */
        @NativeType("CHAR[32]")
        public String DeviceNameString() { return GPU_DEVICE.nDeviceNameString(address()); }
        /** Returns a {@link ByteBuffer} view of the {@code DeviceString} field. */
        @NativeType("CHAR[128]")
        public ByteBuffer DeviceString() { return GPU_DEVICE.nDeviceString(address()); }
        /** Decodes the null-terminated string stored in the {@code DeviceString} field. */
        @NativeType("CHAR[128]")
        public String DeviceStringString() { return GPU_DEVICE.nDeviceStringString(address()); }
        /** Returns the value of the {@code Flags} field. */
        @NativeType("DWORD")
        public int Flags() { return GPU_DEVICE.nFlags(address()); }
        /** Returns a {@link RECT} view of the {@code rcVirtualScreen} field. */
        public RECT rcVirtualScreen() { return GPU_DEVICE.nrcVirtualScreen(address()); }

    }

}