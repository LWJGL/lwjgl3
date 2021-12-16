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

import org.lwjgl.system.linux.*;

/**
 * Structure specifying parameters of a newly created Xlib surface object.
 * 
 * <h5>Valid Usage</h5>
 * 
 * <ul>
 * <li>{@code dpy} <b>must</b> point to a valid Xlib {@code Display}</li>
 * <li>{@code window} <b>must</b> be a valid Xlib {@code Window}</li>
 * </ul>
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>{@code sType} <b>must</b> be {@link KHRXlibSurface#VK_STRUCTURE_TYPE_XLIB_SURFACE_CREATE_INFO_KHR STRUCTURE_TYPE_XLIB_SURFACE_CREATE_INFO_KHR}</li>
 * <li>{@code pNext} <b>must</b> be {@code NULL}</li>
 * <li>{@code flags} <b>must</b> be 0</li>
 * </ul>
 * 
 * <h5>See Also</h5>
 * 
 * <p>{@link KHRXlibSurface#vkCreateXlibSurfaceKHR CreateXlibSurfaceKHR}</p>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkXlibSurfaceCreateInfoKHR {
 *     VkStructureType {@link #sType};
 *     void const * {@link #pNext};
 *     VkXlibSurfaceCreateFlagsKHR {@link #flags};
 *     Display * {@link #dpy};
 *     Window {@link #window};
 * }</code></pre>
 */
public class VkXlibSurfaceCreateInfoKHR extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        FLAGS,
        DPY,
        WINDOW;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(4),
            __member(POINTER_SIZE),
            __member(CLONG_SIZE)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        FLAGS = layout.offsetof(2);
        DPY = layout.offsetof(3);
        WINDOW = layout.offsetof(4);
    }

    /**
     * Creates a {@code VkXlibSurfaceCreateInfoKHR} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkXlibSurfaceCreateInfoKHR(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** the type of this structure. */
    @NativeType("VkStructureType")
    public int sType() { return nsType(address()); }
    /** {@code NULL} or a pointer to a structure extending this structure. */
    @NativeType("void const *")
    public long pNext() { return npNext(address()); }
    /** reserved for future use. */
    @NativeType("VkXlibSurfaceCreateFlagsKHR")
    public int flags() { return nflags(address()); }
    /** a pointer to an Xlib {@code Display} connection to the X server. */
    @NativeType("Display *")
    public long dpy() { return ndpy(address()); }
    /** an Xlib {@code Window} to associate the surface with. */
    @NativeType("Window")
    public long window() { return nwindow(address()); }

    /** Sets the specified value to the {@link #sType} field. */
    public VkXlibSurfaceCreateInfoKHR sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link KHRXlibSurface#VK_STRUCTURE_TYPE_XLIB_SURFACE_CREATE_INFO_KHR STRUCTURE_TYPE_XLIB_SURFACE_CREATE_INFO_KHR} value to the {@link #sType} field. */
    public VkXlibSurfaceCreateInfoKHR sType$Default() { return sType(KHRXlibSurface.VK_STRUCTURE_TYPE_XLIB_SURFACE_CREATE_INFO_KHR); }
    /** Sets the specified value to the {@link #pNext} field. */
    public VkXlibSurfaceCreateInfoKHR pNext(@NativeType("void const *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@link #flags} field. */
    public VkXlibSurfaceCreateInfoKHR flags(@NativeType("VkXlibSurfaceCreateFlagsKHR") int value) { nflags(address(), value); return this; }
    /** Sets the specified value to the {@link #dpy} field. */
    public VkXlibSurfaceCreateInfoKHR dpy(@NativeType("Display *") long value) { ndpy(address(), value); return this; }
    /** Sets the specified value to the {@link #window} field. */
    public VkXlibSurfaceCreateInfoKHR window(@NativeType("Window") long value) { nwindow(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkXlibSurfaceCreateInfoKHR set(
        int sType,
        long pNext,
        int flags,
        long dpy,
        long window
    ) {
        sType(sType);
        pNext(pNext);
        flags(flags);
        dpy(dpy);
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
    public VkXlibSurfaceCreateInfoKHR set(VkXlibSurfaceCreateInfoKHR src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkXlibSurfaceCreateInfoKHR} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkXlibSurfaceCreateInfoKHR malloc() {
        return wrap(VkXlibSurfaceCreateInfoKHR.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code VkXlibSurfaceCreateInfoKHR} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkXlibSurfaceCreateInfoKHR calloc() {
        return wrap(VkXlibSurfaceCreateInfoKHR.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code VkXlibSurfaceCreateInfoKHR} instance allocated with {@link BufferUtils}. */
    public static VkXlibSurfaceCreateInfoKHR create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(VkXlibSurfaceCreateInfoKHR.class, memAddress(container), container);
    }

    /** Returns a new {@code VkXlibSurfaceCreateInfoKHR} instance for the specified memory address. */
    public static VkXlibSurfaceCreateInfoKHR create(long address) {
        return wrap(VkXlibSurfaceCreateInfoKHR.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkXlibSurfaceCreateInfoKHR createSafe(long address) {
        return address == NULL ? null : wrap(VkXlibSurfaceCreateInfoKHR.class, address);
    }

    /**
     * Returns a new {@link VkXlibSurfaceCreateInfoKHR.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkXlibSurfaceCreateInfoKHR.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkXlibSurfaceCreateInfoKHR.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkXlibSurfaceCreateInfoKHR.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkXlibSurfaceCreateInfoKHR.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkXlibSurfaceCreateInfoKHR.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link VkXlibSurfaceCreateInfoKHR.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkXlibSurfaceCreateInfoKHR.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkXlibSurfaceCreateInfoKHR.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    // -----------------------------------

    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static VkXlibSurfaceCreateInfoKHR mallocStack() { return malloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static VkXlibSurfaceCreateInfoKHR callocStack() { return calloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static VkXlibSurfaceCreateInfoKHR mallocStack(MemoryStack stack) { return malloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static VkXlibSurfaceCreateInfoKHR callocStack(MemoryStack stack) { return calloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static VkXlibSurfaceCreateInfoKHR.Buffer mallocStack(int capacity) { return malloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static VkXlibSurfaceCreateInfoKHR.Buffer callocStack(int capacity) { return calloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static VkXlibSurfaceCreateInfoKHR.Buffer mallocStack(int capacity, MemoryStack stack) { return malloc(capacity, stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static VkXlibSurfaceCreateInfoKHR.Buffer callocStack(int capacity, MemoryStack stack) { return calloc(capacity, stack); }

    /**
     * Returns a new {@code VkXlibSurfaceCreateInfoKHR} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkXlibSurfaceCreateInfoKHR malloc(MemoryStack stack) {
        return wrap(VkXlibSurfaceCreateInfoKHR.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code VkXlibSurfaceCreateInfoKHR} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkXlibSurfaceCreateInfoKHR calloc(MemoryStack stack) {
        return wrap(VkXlibSurfaceCreateInfoKHR.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link VkXlibSurfaceCreateInfoKHR.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkXlibSurfaceCreateInfoKHR.Buffer malloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkXlibSurfaceCreateInfoKHR.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkXlibSurfaceCreateInfoKHR.Buffer calloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return UNSAFE.getInt(null, struct + VkXlibSurfaceCreateInfoKHR.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkXlibSurfaceCreateInfoKHR.PNEXT); }
    /** Unsafe version of {@link #flags}. */
    public static int nflags(long struct) { return UNSAFE.getInt(null, struct + VkXlibSurfaceCreateInfoKHR.FLAGS); }
    /** Unsafe version of {@link #dpy}. */
    public static long ndpy(long struct) { return memGetAddress(struct + VkXlibSurfaceCreateInfoKHR.DPY); }
    /** Unsafe version of {@link #window}. */
    public static long nwindow(long struct) { return memGetCLong(struct + VkXlibSurfaceCreateInfoKHR.WINDOW); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { UNSAFE.putInt(null, struct + VkXlibSurfaceCreateInfoKHR.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkXlibSurfaceCreateInfoKHR.PNEXT, value); }
    /** Unsafe version of {@link #flags(int) flags}. */
    public static void nflags(long struct, int value) { UNSAFE.putInt(null, struct + VkXlibSurfaceCreateInfoKHR.FLAGS, value); }
    /** Unsafe version of {@link #dpy(long) dpy}. */
    public static void ndpy(long struct, long value) { memPutAddress(struct + VkXlibSurfaceCreateInfoKHR.DPY, value); }
    /** Unsafe version of {@link #window(long) window}. */
    public static void nwindow(long struct, long value) { memPutCLong(struct + VkXlibSurfaceCreateInfoKHR.WINDOW, value); }

    // -----------------------------------

    /** An array of {@link VkXlibSurfaceCreateInfoKHR} structs. */
    public static class Buffer extends StructBuffer<VkXlibSurfaceCreateInfoKHR, Buffer> implements NativeResource {

        private static final VkXlibSurfaceCreateInfoKHR ELEMENT_FACTORY = VkXlibSurfaceCreateInfoKHR.create(-1L);

        /**
         * Creates a new {@code VkXlibSurfaceCreateInfoKHR.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkXlibSurfaceCreateInfoKHR#SIZEOF}, and its mark will be undefined.
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
        protected VkXlibSurfaceCreateInfoKHR getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link VkXlibSurfaceCreateInfoKHR#sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkXlibSurfaceCreateInfoKHR.nsType(address()); }
        /** @return the value of the {@link VkXlibSurfaceCreateInfoKHR#pNext} field. */
        @NativeType("void const *")
        public long pNext() { return VkXlibSurfaceCreateInfoKHR.npNext(address()); }
        /** @return the value of the {@link VkXlibSurfaceCreateInfoKHR#flags} field. */
        @NativeType("VkXlibSurfaceCreateFlagsKHR")
        public int flags() { return VkXlibSurfaceCreateInfoKHR.nflags(address()); }
        /** @return the value of the {@link VkXlibSurfaceCreateInfoKHR#dpy} field. */
        @NativeType("Display *")
        public long dpy() { return VkXlibSurfaceCreateInfoKHR.ndpy(address()); }
        /** @return the value of the {@link VkXlibSurfaceCreateInfoKHR#window} field. */
        @NativeType("Window")
        public long window() { return VkXlibSurfaceCreateInfoKHR.nwindow(address()); }

        /** Sets the specified value to the {@link VkXlibSurfaceCreateInfoKHR#sType} field. */
        public VkXlibSurfaceCreateInfoKHR.Buffer sType(@NativeType("VkStructureType") int value) { VkXlibSurfaceCreateInfoKHR.nsType(address(), value); return this; }
        /** Sets the {@link KHRXlibSurface#VK_STRUCTURE_TYPE_XLIB_SURFACE_CREATE_INFO_KHR STRUCTURE_TYPE_XLIB_SURFACE_CREATE_INFO_KHR} value to the {@link VkXlibSurfaceCreateInfoKHR#sType} field. */
        public VkXlibSurfaceCreateInfoKHR.Buffer sType$Default() { return sType(KHRXlibSurface.VK_STRUCTURE_TYPE_XLIB_SURFACE_CREATE_INFO_KHR); }
        /** Sets the specified value to the {@link VkXlibSurfaceCreateInfoKHR#pNext} field. */
        public VkXlibSurfaceCreateInfoKHR.Buffer pNext(@NativeType("void const *") long value) { VkXlibSurfaceCreateInfoKHR.npNext(address(), value); return this; }
        /** Sets the specified value to the {@link VkXlibSurfaceCreateInfoKHR#flags} field. */
        public VkXlibSurfaceCreateInfoKHR.Buffer flags(@NativeType("VkXlibSurfaceCreateFlagsKHR") int value) { VkXlibSurfaceCreateInfoKHR.nflags(address(), value); return this; }
        /** Sets the specified value to the {@link VkXlibSurfaceCreateInfoKHR#dpy} field. */
        public VkXlibSurfaceCreateInfoKHR.Buffer dpy(@NativeType("Display *") long value) { VkXlibSurfaceCreateInfoKHR.ndpy(address(), value); return this; }
        /** Sets the specified value to the {@link VkXlibSurfaceCreateInfoKHR#window} field. */
        public VkXlibSurfaceCreateInfoKHR.Buffer window(@NativeType("Window") long value) { VkXlibSurfaceCreateInfoKHR.nwindow(address(), value); return this; }

    }

}