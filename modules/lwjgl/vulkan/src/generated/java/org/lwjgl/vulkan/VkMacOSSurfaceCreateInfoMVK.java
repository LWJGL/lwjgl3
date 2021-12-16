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
 * Structure specifying parameters of a newly created macOS surface object.
 * 
 * <h5>Valid Usage</h5>
 * 
 * <ul>
 * <li>If {@code pView} is a {@code CAMetalLayer} object, it <b>must</b> be a valid {@code CAMetalLayer}</li>
 * <li>If {@code pView} is an {@code NSView} object, it <b>must</b> be a valid {@code NSView}, <b>must</b> be backed by a {@code CALayer} object of type {@code CAMetalLayer}, and {@link MVKMacosSurface#vkCreateMacOSSurfaceMVK CreateMacOSSurfaceMVK} <b>must</b> be called on the main thread</li>
 * </ul>
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>{@code sType} <b>must</b> be {@link MVKMacosSurface#VK_STRUCTURE_TYPE_MACOS_SURFACE_CREATE_INFO_MVK STRUCTURE_TYPE_MACOS_SURFACE_CREATE_INFO_MVK}</li>
 * <li>{@code pNext} <b>must</b> be {@code NULL}</li>
 * <li>{@code flags} <b>must</b> be 0</li>
 * </ul>
 * 
 * <h5>See Also</h5>
 * 
 * <p>{@link MVKMacosSurface#vkCreateMacOSSurfaceMVK CreateMacOSSurfaceMVK}</p>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkMacOSSurfaceCreateInfoMVK {
 *     VkStructureType {@link #sType};
 *     void const * {@link #pNext};
 *     VkMacOSSurfaceCreateFlagsMVK {@link #flags};
 *     void const * {@link #pView};
 * }</code></pre>
 */
public class VkMacOSSurfaceCreateInfoMVK extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        FLAGS,
        PVIEW;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(4),
            __member(POINTER_SIZE)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        FLAGS = layout.offsetof(2);
        PVIEW = layout.offsetof(3);
    }

    /**
     * Creates a {@code VkMacOSSurfaceCreateInfoMVK} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkMacOSSurfaceCreateInfoMVK(ByteBuffer container) {
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
    @NativeType("VkMacOSSurfaceCreateFlagsMVK")
    public int flags() { return nflags(address()); }
    /** a reference to either a {@code CAMetalLayer} object or an {@code NSView} object. */
    @NativeType("void const *")
    public long pView() { return npView(address()); }

    /** Sets the specified value to the {@link #sType} field. */
    public VkMacOSSurfaceCreateInfoMVK sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link MVKMacosSurface#VK_STRUCTURE_TYPE_MACOS_SURFACE_CREATE_INFO_MVK STRUCTURE_TYPE_MACOS_SURFACE_CREATE_INFO_MVK} value to the {@link #sType} field. */
    public VkMacOSSurfaceCreateInfoMVK sType$Default() { return sType(MVKMacosSurface.VK_STRUCTURE_TYPE_MACOS_SURFACE_CREATE_INFO_MVK); }
    /** Sets the specified value to the {@link #pNext} field. */
    public VkMacOSSurfaceCreateInfoMVK pNext(@NativeType("void const *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@link #flags} field. */
    public VkMacOSSurfaceCreateInfoMVK flags(@NativeType("VkMacOSSurfaceCreateFlagsMVK") int value) { nflags(address(), value); return this; }
    /** Sets the specified value to the {@link #pView} field. */
    public VkMacOSSurfaceCreateInfoMVK pView(@NativeType("void const *") long value) { npView(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkMacOSSurfaceCreateInfoMVK set(
        int sType,
        long pNext,
        int flags,
        long pView
    ) {
        sType(sType);
        pNext(pNext);
        flags(flags);
        pView(pView);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkMacOSSurfaceCreateInfoMVK set(VkMacOSSurfaceCreateInfoMVK src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkMacOSSurfaceCreateInfoMVK} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkMacOSSurfaceCreateInfoMVK malloc() {
        return wrap(VkMacOSSurfaceCreateInfoMVK.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code VkMacOSSurfaceCreateInfoMVK} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkMacOSSurfaceCreateInfoMVK calloc() {
        return wrap(VkMacOSSurfaceCreateInfoMVK.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code VkMacOSSurfaceCreateInfoMVK} instance allocated with {@link BufferUtils}. */
    public static VkMacOSSurfaceCreateInfoMVK create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(VkMacOSSurfaceCreateInfoMVK.class, memAddress(container), container);
    }

    /** Returns a new {@code VkMacOSSurfaceCreateInfoMVK} instance for the specified memory address. */
    public static VkMacOSSurfaceCreateInfoMVK create(long address) {
        return wrap(VkMacOSSurfaceCreateInfoMVK.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkMacOSSurfaceCreateInfoMVK createSafe(long address) {
        return address == NULL ? null : wrap(VkMacOSSurfaceCreateInfoMVK.class, address);
    }

    /**
     * Returns a new {@link VkMacOSSurfaceCreateInfoMVK.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkMacOSSurfaceCreateInfoMVK.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkMacOSSurfaceCreateInfoMVK.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkMacOSSurfaceCreateInfoMVK.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkMacOSSurfaceCreateInfoMVK.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkMacOSSurfaceCreateInfoMVK.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link VkMacOSSurfaceCreateInfoMVK.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkMacOSSurfaceCreateInfoMVK.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkMacOSSurfaceCreateInfoMVK.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    // -----------------------------------

    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static VkMacOSSurfaceCreateInfoMVK mallocStack() { return malloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static VkMacOSSurfaceCreateInfoMVK callocStack() { return calloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static VkMacOSSurfaceCreateInfoMVK mallocStack(MemoryStack stack) { return malloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static VkMacOSSurfaceCreateInfoMVK callocStack(MemoryStack stack) { return calloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static VkMacOSSurfaceCreateInfoMVK.Buffer mallocStack(int capacity) { return malloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static VkMacOSSurfaceCreateInfoMVK.Buffer callocStack(int capacity) { return calloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static VkMacOSSurfaceCreateInfoMVK.Buffer mallocStack(int capacity, MemoryStack stack) { return malloc(capacity, stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static VkMacOSSurfaceCreateInfoMVK.Buffer callocStack(int capacity, MemoryStack stack) { return calloc(capacity, stack); }

    /**
     * Returns a new {@code VkMacOSSurfaceCreateInfoMVK} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkMacOSSurfaceCreateInfoMVK malloc(MemoryStack stack) {
        return wrap(VkMacOSSurfaceCreateInfoMVK.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code VkMacOSSurfaceCreateInfoMVK} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkMacOSSurfaceCreateInfoMVK calloc(MemoryStack stack) {
        return wrap(VkMacOSSurfaceCreateInfoMVK.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link VkMacOSSurfaceCreateInfoMVK.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkMacOSSurfaceCreateInfoMVK.Buffer malloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkMacOSSurfaceCreateInfoMVK.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkMacOSSurfaceCreateInfoMVK.Buffer calloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return UNSAFE.getInt(null, struct + VkMacOSSurfaceCreateInfoMVK.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkMacOSSurfaceCreateInfoMVK.PNEXT); }
    /** Unsafe version of {@link #flags}. */
    public static int nflags(long struct) { return UNSAFE.getInt(null, struct + VkMacOSSurfaceCreateInfoMVK.FLAGS); }
    /** Unsafe version of {@link #pView}. */
    public static long npView(long struct) { return memGetAddress(struct + VkMacOSSurfaceCreateInfoMVK.PVIEW); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { UNSAFE.putInt(null, struct + VkMacOSSurfaceCreateInfoMVK.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkMacOSSurfaceCreateInfoMVK.PNEXT, value); }
    /** Unsafe version of {@link #flags(int) flags}. */
    public static void nflags(long struct, int value) { UNSAFE.putInt(null, struct + VkMacOSSurfaceCreateInfoMVK.FLAGS, value); }
    /** Unsafe version of {@link #pView(long) pView}. */
    public static void npView(long struct, long value) { memPutAddress(struct + VkMacOSSurfaceCreateInfoMVK.PVIEW, value); }

    // -----------------------------------

    /** An array of {@link VkMacOSSurfaceCreateInfoMVK} structs. */
    public static class Buffer extends StructBuffer<VkMacOSSurfaceCreateInfoMVK, Buffer> implements NativeResource {

        private static final VkMacOSSurfaceCreateInfoMVK ELEMENT_FACTORY = VkMacOSSurfaceCreateInfoMVK.create(-1L);

        /**
         * Creates a new {@code VkMacOSSurfaceCreateInfoMVK.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkMacOSSurfaceCreateInfoMVK#SIZEOF}, and its mark will be undefined.
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
        protected VkMacOSSurfaceCreateInfoMVK getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link VkMacOSSurfaceCreateInfoMVK#sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkMacOSSurfaceCreateInfoMVK.nsType(address()); }
        /** @return the value of the {@link VkMacOSSurfaceCreateInfoMVK#pNext} field. */
        @NativeType("void const *")
        public long pNext() { return VkMacOSSurfaceCreateInfoMVK.npNext(address()); }
        /** @return the value of the {@link VkMacOSSurfaceCreateInfoMVK#flags} field. */
        @NativeType("VkMacOSSurfaceCreateFlagsMVK")
        public int flags() { return VkMacOSSurfaceCreateInfoMVK.nflags(address()); }
        /** @return the value of the {@link VkMacOSSurfaceCreateInfoMVK#pView} field. */
        @NativeType("void const *")
        public long pView() { return VkMacOSSurfaceCreateInfoMVK.npView(address()); }

        /** Sets the specified value to the {@link VkMacOSSurfaceCreateInfoMVK#sType} field. */
        public VkMacOSSurfaceCreateInfoMVK.Buffer sType(@NativeType("VkStructureType") int value) { VkMacOSSurfaceCreateInfoMVK.nsType(address(), value); return this; }
        /** Sets the {@link MVKMacosSurface#VK_STRUCTURE_TYPE_MACOS_SURFACE_CREATE_INFO_MVK STRUCTURE_TYPE_MACOS_SURFACE_CREATE_INFO_MVK} value to the {@link VkMacOSSurfaceCreateInfoMVK#sType} field. */
        public VkMacOSSurfaceCreateInfoMVK.Buffer sType$Default() { return sType(MVKMacosSurface.VK_STRUCTURE_TYPE_MACOS_SURFACE_CREATE_INFO_MVK); }
        /** Sets the specified value to the {@link VkMacOSSurfaceCreateInfoMVK#pNext} field. */
        public VkMacOSSurfaceCreateInfoMVK.Buffer pNext(@NativeType("void const *") long value) { VkMacOSSurfaceCreateInfoMVK.npNext(address(), value); return this; }
        /** Sets the specified value to the {@link VkMacOSSurfaceCreateInfoMVK#flags} field. */
        public VkMacOSSurfaceCreateInfoMVK.Buffer flags(@NativeType("VkMacOSSurfaceCreateFlagsMVK") int value) { VkMacOSSurfaceCreateInfoMVK.nflags(address(), value); return this; }
        /** Sets the specified value to the {@link VkMacOSSurfaceCreateInfoMVK#pView} field. */
        public VkMacOSSurfaceCreateInfoMVK.Buffer pView(@NativeType("void const *") long value) { VkMacOSSurfaceCreateInfoMVK.npView(address(), value); return this; }

    }

}