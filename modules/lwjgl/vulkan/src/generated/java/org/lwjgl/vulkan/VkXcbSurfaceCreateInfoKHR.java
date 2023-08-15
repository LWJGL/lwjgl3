/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.vulkan;

import javax.annotation.*;

import java.nio.*;

import org.lwjgl.*;
import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * Structure specifying parameters of a newly created Xcb surface object.
 * 
 * <h5>Valid Usage</h5>
 * 
 * <ul>
 * <li>{@code connection} <b>must</b> point to a valid X11 {@code xcb_connection_t}</li>
 * <li>{@code window} <b>must</b> be a valid X11 {@code xcb_window_t}</li>
 * </ul>
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>{@code sType} <b>must</b> be {@link KHRXcbSurface#VK_STRUCTURE_TYPE_XCB_SURFACE_CREATE_INFO_KHR STRUCTURE_TYPE_XCB_SURFACE_CREATE_INFO_KHR}</li>
 * <li>{@code pNext} <b>must</b> be {@code NULL}</li>
 * <li>{@code flags} <b>must</b> be 0</li>
 * </ul>
 * 
 * <h5>See Also</h5>
 * 
 * <p>{@link KHRXcbSurface#vkCreateXcbSurfaceKHR CreateXcbSurfaceKHR}</p>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkXcbSurfaceCreateInfoKHR {
 *     VkStructureType {@link #sType};
 *     void const * {@link #pNext};
 *     VkXcbSurfaceCreateFlagsKHR {@link #flags};
 *     xcb_connection_t * {@link #connection};
 *     xcb_window_t {@link #window};
 * }</code></pre>
 */
public class VkXcbSurfaceCreateInfoKHR extends Struct<VkXcbSurfaceCreateInfoKHR> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        FLAGS,
        CONNECTION,
        WINDOW;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(4),
            __member(POINTER_SIZE),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        FLAGS = layout.offsetof(2);
        CONNECTION = layout.offsetof(3);
        WINDOW = layout.offsetof(4);
    }

    protected VkXcbSurfaceCreateInfoKHR(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkXcbSurfaceCreateInfoKHR create(long address, @Nullable ByteBuffer container) {
        return new VkXcbSurfaceCreateInfoKHR(address, container);
    }

    /**
     * Creates a {@code VkXcbSurfaceCreateInfoKHR} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkXcbSurfaceCreateInfoKHR(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** a {@code VkStructureType} value identifying this structure. */
    @NativeType("VkStructureType")
    public int sType() { return nsType(address()); }
    /** {@code NULL} or a pointer to a structure extending this structure. */
    @NativeType("void const *")
    public long pNext() { return npNext(address()); }
    /** reserved for future use. */
    @NativeType("VkXcbSurfaceCreateFlagsKHR")
    public int flags() { return nflags(address()); }
    /** a pointer to an {@code xcb_connection_t} to the X server. */
    @NativeType("xcb_connection_t *")
    public long connection() { return nconnection(address()); }
    /** the {@code xcb_window_t} for the X11 window to associate the surface with. */
    @NativeType("xcb_window_t")
    public int window() { return nwindow(address()); }

    /** Sets the specified value to the {@link #sType} field. */
    public VkXcbSurfaceCreateInfoKHR sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link KHRXcbSurface#VK_STRUCTURE_TYPE_XCB_SURFACE_CREATE_INFO_KHR STRUCTURE_TYPE_XCB_SURFACE_CREATE_INFO_KHR} value to the {@link #sType} field. */
    public VkXcbSurfaceCreateInfoKHR sType$Default() { return sType(KHRXcbSurface.VK_STRUCTURE_TYPE_XCB_SURFACE_CREATE_INFO_KHR); }
    /** Sets the specified value to the {@link #pNext} field. */
    public VkXcbSurfaceCreateInfoKHR pNext(@NativeType("void const *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@link #flags} field. */
    public VkXcbSurfaceCreateInfoKHR flags(@NativeType("VkXcbSurfaceCreateFlagsKHR") int value) { nflags(address(), value); return this; }
    /** Sets the specified value to the {@link #connection} field. */
    public VkXcbSurfaceCreateInfoKHR connection(@NativeType("xcb_connection_t *") long value) { nconnection(address(), value); return this; }
    /** Sets the specified value to the {@link #window} field. */
    public VkXcbSurfaceCreateInfoKHR window(@NativeType("xcb_window_t") int value) { nwindow(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkXcbSurfaceCreateInfoKHR set(
        int sType,
        long pNext,
        int flags,
        long connection,
        int window
    ) {
        sType(sType);
        pNext(pNext);
        flags(flags);
        connection(connection);
        window(window);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkXcbSurfaceCreateInfoKHR set(VkXcbSurfaceCreateInfoKHR src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkXcbSurfaceCreateInfoKHR} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkXcbSurfaceCreateInfoKHR malloc() {
        return new VkXcbSurfaceCreateInfoKHR(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkXcbSurfaceCreateInfoKHR} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkXcbSurfaceCreateInfoKHR calloc() {
        return new VkXcbSurfaceCreateInfoKHR(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkXcbSurfaceCreateInfoKHR} instance allocated with {@link BufferUtils}. */
    public static VkXcbSurfaceCreateInfoKHR create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkXcbSurfaceCreateInfoKHR(memAddress(container), container);
    }

    /** Returns a new {@code VkXcbSurfaceCreateInfoKHR} instance for the specified memory address. */
    public static VkXcbSurfaceCreateInfoKHR create(long address) {
        return new VkXcbSurfaceCreateInfoKHR(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkXcbSurfaceCreateInfoKHR createSafe(long address) {
        return address == NULL ? null : new VkXcbSurfaceCreateInfoKHR(address, null);
    }

    /**
     * Returns a new {@link VkXcbSurfaceCreateInfoKHR.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkXcbSurfaceCreateInfoKHR.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkXcbSurfaceCreateInfoKHR.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkXcbSurfaceCreateInfoKHR.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkXcbSurfaceCreateInfoKHR.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkXcbSurfaceCreateInfoKHR.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkXcbSurfaceCreateInfoKHR.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkXcbSurfaceCreateInfoKHR.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkXcbSurfaceCreateInfoKHR.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code VkXcbSurfaceCreateInfoKHR} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkXcbSurfaceCreateInfoKHR malloc(MemoryStack stack) {
        return new VkXcbSurfaceCreateInfoKHR(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkXcbSurfaceCreateInfoKHR} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkXcbSurfaceCreateInfoKHR calloc(MemoryStack stack) {
        return new VkXcbSurfaceCreateInfoKHR(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkXcbSurfaceCreateInfoKHR.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkXcbSurfaceCreateInfoKHR.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkXcbSurfaceCreateInfoKHR.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkXcbSurfaceCreateInfoKHR.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return UNSAFE.getInt(null, struct + VkXcbSurfaceCreateInfoKHR.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkXcbSurfaceCreateInfoKHR.PNEXT); }
    /** Unsafe version of {@link #flags}. */
    public static int nflags(long struct) { return UNSAFE.getInt(null, struct + VkXcbSurfaceCreateInfoKHR.FLAGS); }
    /** Unsafe version of {@link #connection}. */
    public static long nconnection(long struct) { return memGetAddress(struct + VkXcbSurfaceCreateInfoKHR.CONNECTION); }
    /** Unsafe version of {@link #window}. */
    public static int nwindow(long struct) { return UNSAFE.getInt(null, struct + VkXcbSurfaceCreateInfoKHR.WINDOW); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { UNSAFE.putInt(null, struct + VkXcbSurfaceCreateInfoKHR.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkXcbSurfaceCreateInfoKHR.PNEXT, value); }
    /** Unsafe version of {@link #flags(int) flags}. */
    public static void nflags(long struct, int value) { UNSAFE.putInt(null, struct + VkXcbSurfaceCreateInfoKHR.FLAGS, value); }
    /** Unsafe version of {@link #connection(long) connection}. */
    public static void nconnection(long struct, long value) { memPutAddress(struct + VkXcbSurfaceCreateInfoKHR.CONNECTION, value); }
    /** Unsafe version of {@link #window(int) window}. */
    public static void nwindow(long struct, int value) { UNSAFE.putInt(null, struct + VkXcbSurfaceCreateInfoKHR.WINDOW, value); }

    // -----------------------------------

    /** An array of {@link VkXcbSurfaceCreateInfoKHR} structs. */
    public static class Buffer extends StructBuffer<VkXcbSurfaceCreateInfoKHR, Buffer> implements NativeResource {

        private static final VkXcbSurfaceCreateInfoKHR ELEMENT_FACTORY = VkXcbSurfaceCreateInfoKHR.create(-1L);

        /**
         * Creates a new {@code VkXcbSurfaceCreateInfoKHR.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkXcbSurfaceCreateInfoKHR#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkXcbSurfaceCreateInfoKHR getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link VkXcbSurfaceCreateInfoKHR#sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkXcbSurfaceCreateInfoKHR.nsType(address()); }
        /** @return the value of the {@link VkXcbSurfaceCreateInfoKHR#pNext} field. */
        @NativeType("void const *")
        public long pNext() { return VkXcbSurfaceCreateInfoKHR.npNext(address()); }
        /** @return the value of the {@link VkXcbSurfaceCreateInfoKHR#flags} field. */
        @NativeType("VkXcbSurfaceCreateFlagsKHR")
        public int flags() { return VkXcbSurfaceCreateInfoKHR.nflags(address()); }
        /** @return the value of the {@link VkXcbSurfaceCreateInfoKHR#connection} field. */
        @NativeType("xcb_connection_t *")
        public long connection() { return VkXcbSurfaceCreateInfoKHR.nconnection(address()); }
        /** @return the value of the {@link VkXcbSurfaceCreateInfoKHR#window} field. */
        @NativeType("xcb_window_t")
        public int window() { return VkXcbSurfaceCreateInfoKHR.nwindow(address()); }

        /** Sets the specified value to the {@link VkXcbSurfaceCreateInfoKHR#sType} field. */
        public VkXcbSurfaceCreateInfoKHR.Buffer sType(@NativeType("VkStructureType") int value) { VkXcbSurfaceCreateInfoKHR.nsType(address(), value); return this; }
        /** Sets the {@link KHRXcbSurface#VK_STRUCTURE_TYPE_XCB_SURFACE_CREATE_INFO_KHR STRUCTURE_TYPE_XCB_SURFACE_CREATE_INFO_KHR} value to the {@link VkXcbSurfaceCreateInfoKHR#sType} field. */
        public VkXcbSurfaceCreateInfoKHR.Buffer sType$Default() { return sType(KHRXcbSurface.VK_STRUCTURE_TYPE_XCB_SURFACE_CREATE_INFO_KHR); }
        /** Sets the specified value to the {@link VkXcbSurfaceCreateInfoKHR#pNext} field. */
        public VkXcbSurfaceCreateInfoKHR.Buffer pNext(@NativeType("void const *") long value) { VkXcbSurfaceCreateInfoKHR.npNext(address(), value); return this; }
        /** Sets the specified value to the {@link VkXcbSurfaceCreateInfoKHR#flags} field. */
        public VkXcbSurfaceCreateInfoKHR.Buffer flags(@NativeType("VkXcbSurfaceCreateFlagsKHR") int value) { VkXcbSurfaceCreateInfoKHR.nflags(address(), value); return this; }
        /** Sets the specified value to the {@link VkXcbSurfaceCreateInfoKHR#connection} field. */
        public VkXcbSurfaceCreateInfoKHR.Buffer connection(@NativeType("xcb_connection_t *") long value) { VkXcbSurfaceCreateInfoKHR.nconnection(address(), value); return this; }
        /** Sets the specified value to the {@link VkXcbSurfaceCreateInfoKHR#window} field. */
        public VkXcbSurfaceCreateInfoKHR.Buffer window(@NativeType("xcb_window_t") int value) { VkXcbSurfaceCreateInfoKHR.nwindow(address(), value); return this; }

    }

}