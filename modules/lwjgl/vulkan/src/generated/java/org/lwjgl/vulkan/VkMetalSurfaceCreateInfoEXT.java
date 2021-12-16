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
 * Structure specifying parameters of a newly created Metal surface object.
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>{@code sType} <b>must</b> be {@link EXTMetalSurface#VK_STRUCTURE_TYPE_METAL_SURFACE_CREATE_INFO_EXT STRUCTURE_TYPE_METAL_SURFACE_CREATE_INFO_EXT}</li>
 * <li>{@code pNext} <b>must</b> be {@code NULL}</li>
 * <li>{@code flags} <b>must</b> be 0</li>
 * </ul>
 * 
 * <h5>See Also</h5>
 * 
 * <p>{@link EXTMetalSurface#vkCreateMetalSurfaceEXT CreateMetalSurfaceEXT}</p>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkMetalSurfaceCreateInfoEXT {
 *     VkStructureType {@link #sType};
 *     void const * {@link #pNext};
 *     VkMetalSurfaceCreateFlagsEXT {@link #flags};
 *     CAMetalLayer const * {@link #pLayer};
 * }</code></pre>
 */
public class VkMetalSurfaceCreateInfoEXT extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        FLAGS,
        PLAYER;

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
        PLAYER = layout.offsetof(3);
    }

    /**
     * Creates a {@code VkMetalSurfaceCreateInfoEXT} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkMetalSurfaceCreateInfoEXT(ByteBuffer container) {
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
    @NativeType("VkMetalSurfaceCreateFlagsEXT")
    public int flags() { return nflags(address()); }
    /**
     * @param capacity the number of elements in the returned buffer
     *
     * @return a reference to a {@code CAMetalLayer} object representing a renderable surface.
     */
    @Nullable
    @NativeType("CAMetalLayer const *")
    public PointerBuffer pLayer(int capacity) { return npLayer(address(), capacity); }

    /** Sets the specified value to the {@link #sType} field. */
    public VkMetalSurfaceCreateInfoEXT sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link EXTMetalSurface#VK_STRUCTURE_TYPE_METAL_SURFACE_CREATE_INFO_EXT STRUCTURE_TYPE_METAL_SURFACE_CREATE_INFO_EXT} value to the {@link #sType} field. */
    public VkMetalSurfaceCreateInfoEXT sType$Default() { return sType(EXTMetalSurface.VK_STRUCTURE_TYPE_METAL_SURFACE_CREATE_INFO_EXT); }
    /** Sets the specified value to the {@link #pNext} field. */
    public VkMetalSurfaceCreateInfoEXT pNext(@NativeType("void const *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@link #flags} field. */
    public VkMetalSurfaceCreateInfoEXT flags(@NativeType("VkMetalSurfaceCreateFlagsEXT") int value) { nflags(address(), value); return this; }
    /** Sets the address of the specified {@link PointerBuffer} to the {@link #pLayer} field. */
    public VkMetalSurfaceCreateInfoEXT pLayer(@Nullable @NativeType("CAMetalLayer const *") PointerBuffer value) { npLayer(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkMetalSurfaceCreateInfoEXT set(
        int sType,
        long pNext,
        int flags,
        @Nullable PointerBuffer pLayer
    ) {
        sType(sType);
        pNext(pNext);
        flags(flags);
        pLayer(pLayer);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkMetalSurfaceCreateInfoEXT set(VkMetalSurfaceCreateInfoEXT src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkMetalSurfaceCreateInfoEXT} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkMetalSurfaceCreateInfoEXT malloc() {
        return wrap(VkMetalSurfaceCreateInfoEXT.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code VkMetalSurfaceCreateInfoEXT} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkMetalSurfaceCreateInfoEXT calloc() {
        return wrap(VkMetalSurfaceCreateInfoEXT.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code VkMetalSurfaceCreateInfoEXT} instance allocated with {@link BufferUtils}. */
    public static VkMetalSurfaceCreateInfoEXT create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(VkMetalSurfaceCreateInfoEXT.class, memAddress(container), container);
    }

    /** Returns a new {@code VkMetalSurfaceCreateInfoEXT} instance for the specified memory address. */
    public static VkMetalSurfaceCreateInfoEXT create(long address) {
        return wrap(VkMetalSurfaceCreateInfoEXT.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkMetalSurfaceCreateInfoEXT createSafe(long address) {
        return address == NULL ? null : wrap(VkMetalSurfaceCreateInfoEXT.class, address);
    }

    /**
     * Returns a new {@link VkMetalSurfaceCreateInfoEXT.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkMetalSurfaceCreateInfoEXT.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkMetalSurfaceCreateInfoEXT.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkMetalSurfaceCreateInfoEXT.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkMetalSurfaceCreateInfoEXT.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkMetalSurfaceCreateInfoEXT.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link VkMetalSurfaceCreateInfoEXT.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkMetalSurfaceCreateInfoEXT.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkMetalSurfaceCreateInfoEXT.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    // -----------------------------------

    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static VkMetalSurfaceCreateInfoEXT mallocStack() { return malloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static VkMetalSurfaceCreateInfoEXT callocStack() { return calloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static VkMetalSurfaceCreateInfoEXT mallocStack(MemoryStack stack) { return malloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static VkMetalSurfaceCreateInfoEXT callocStack(MemoryStack stack) { return calloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static VkMetalSurfaceCreateInfoEXT.Buffer mallocStack(int capacity) { return malloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static VkMetalSurfaceCreateInfoEXT.Buffer callocStack(int capacity) { return calloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static VkMetalSurfaceCreateInfoEXT.Buffer mallocStack(int capacity, MemoryStack stack) { return malloc(capacity, stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static VkMetalSurfaceCreateInfoEXT.Buffer callocStack(int capacity, MemoryStack stack) { return calloc(capacity, stack); }

    /**
     * Returns a new {@code VkMetalSurfaceCreateInfoEXT} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkMetalSurfaceCreateInfoEXT malloc(MemoryStack stack) {
        return wrap(VkMetalSurfaceCreateInfoEXT.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code VkMetalSurfaceCreateInfoEXT} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkMetalSurfaceCreateInfoEXT calloc(MemoryStack stack) {
        return wrap(VkMetalSurfaceCreateInfoEXT.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link VkMetalSurfaceCreateInfoEXT.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkMetalSurfaceCreateInfoEXT.Buffer malloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkMetalSurfaceCreateInfoEXT.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkMetalSurfaceCreateInfoEXT.Buffer calloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return UNSAFE.getInt(null, struct + VkMetalSurfaceCreateInfoEXT.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkMetalSurfaceCreateInfoEXT.PNEXT); }
    /** Unsafe version of {@link #flags}. */
    public static int nflags(long struct) { return UNSAFE.getInt(null, struct + VkMetalSurfaceCreateInfoEXT.FLAGS); }
    /** Unsafe version of {@link #pLayer(int) pLayer}. */
    @Nullable public static PointerBuffer npLayer(long struct, int capacity) { return memPointerBufferSafe(memGetAddress(struct + VkMetalSurfaceCreateInfoEXT.PLAYER), capacity); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { UNSAFE.putInt(null, struct + VkMetalSurfaceCreateInfoEXT.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkMetalSurfaceCreateInfoEXT.PNEXT, value); }
    /** Unsafe version of {@link #flags(int) flags}. */
    public static void nflags(long struct, int value) { UNSAFE.putInt(null, struct + VkMetalSurfaceCreateInfoEXT.FLAGS, value); }
    /** Unsafe version of {@link #pLayer(PointerBuffer) pLayer}. */
    public static void npLayer(long struct, @Nullable PointerBuffer value) { memPutAddress(struct + VkMetalSurfaceCreateInfoEXT.PLAYER, memAddressSafe(value)); }

    // -----------------------------------

    /** An array of {@link VkMetalSurfaceCreateInfoEXT} structs. */
    public static class Buffer extends StructBuffer<VkMetalSurfaceCreateInfoEXT, Buffer> implements NativeResource {

        private static final VkMetalSurfaceCreateInfoEXT ELEMENT_FACTORY = VkMetalSurfaceCreateInfoEXT.create(-1L);

        /**
         * Creates a new {@code VkMetalSurfaceCreateInfoEXT.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkMetalSurfaceCreateInfoEXT#SIZEOF}, and its mark will be undefined.
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
        protected VkMetalSurfaceCreateInfoEXT getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link VkMetalSurfaceCreateInfoEXT#sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkMetalSurfaceCreateInfoEXT.nsType(address()); }
        /** @return the value of the {@link VkMetalSurfaceCreateInfoEXT#pNext} field. */
        @NativeType("void const *")
        public long pNext() { return VkMetalSurfaceCreateInfoEXT.npNext(address()); }
        /** @return the value of the {@link VkMetalSurfaceCreateInfoEXT#flags} field. */
        @NativeType("VkMetalSurfaceCreateFlagsEXT")
        public int flags() { return VkMetalSurfaceCreateInfoEXT.nflags(address()); }
        /**
         * @return a {@link PointerBuffer} view of the data pointed to by the {@link VkMetalSurfaceCreateInfoEXT#pLayer} field.
         *
         * @param capacity the number of elements in the returned buffer
         */
        @Nullable
        @NativeType("CAMetalLayer const *")
        public PointerBuffer pLayer(int capacity) { return VkMetalSurfaceCreateInfoEXT.npLayer(address(), capacity); }

        /** Sets the specified value to the {@link VkMetalSurfaceCreateInfoEXT#sType} field. */
        public VkMetalSurfaceCreateInfoEXT.Buffer sType(@NativeType("VkStructureType") int value) { VkMetalSurfaceCreateInfoEXT.nsType(address(), value); return this; }
        /** Sets the {@link EXTMetalSurface#VK_STRUCTURE_TYPE_METAL_SURFACE_CREATE_INFO_EXT STRUCTURE_TYPE_METAL_SURFACE_CREATE_INFO_EXT} value to the {@link VkMetalSurfaceCreateInfoEXT#sType} field. */
        public VkMetalSurfaceCreateInfoEXT.Buffer sType$Default() { return sType(EXTMetalSurface.VK_STRUCTURE_TYPE_METAL_SURFACE_CREATE_INFO_EXT); }
        /** Sets the specified value to the {@link VkMetalSurfaceCreateInfoEXT#pNext} field. */
        public VkMetalSurfaceCreateInfoEXT.Buffer pNext(@NativeType("void const *") long value) { VkMetalSurfaceCreateInfoEXT.npNext(address(), value); return this; }
        /** Sets the specified value to the {@link VkMetalSurfaceCreateInfoEXT#flags} field. */
        public VkMetalSurfaceCreateInfoEXT.Buffer flags(@NativeType("VkMetalSurfaceCreateFlagsEXT") int value) { VkMetalSurfaceCreateInfoEXT.nflags(address(), value); return this; }
        /** Sets the address of the specified {@link PointerBuffer} to the {@link VkMetalSurfaceCreateInfoEXT#pLayer} field. */
        public VkMetalSurfaceCreateInfoEXT.Buffer pLayer(@Nullable @NativeType("CAMetalLayer const *") PointerBuffer value) { VkMetalSurfaceCreateInfoEXT.npLayer(address(), value); return this; }

    }

}