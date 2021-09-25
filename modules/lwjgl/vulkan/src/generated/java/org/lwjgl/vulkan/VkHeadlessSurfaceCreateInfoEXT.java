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
 * Structure specifying parameters of a newly created headless surface object.
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>{@code sType} <b>must</b> be {@link EXTHeadlessSurface#VK_STRUCTURE_TYPE_HEADLESS_SURFACE_CREATE_INFO_EXT STRUCTURE_TYPE_HEADLESS_SURFACE_CREATE_INFO_EXT}</li>
 * <li>{@code pNext} <b>must</b> be {@code NULL}</li>
 * <li>{@code flags} <b>must</b> be 0</li>
 * </ul>
 * 
 * <h5>See Also</h5>
 * 
 * <p>{@link EXTHeadlessSurface#vkCreateHeadlessSurfaceEXT CreateHeadlessSurfaceEXT}</p>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkHeadlessSurfaceCreateInfoEXT {
 *     VkStructureType {@link #sType};
 *     void const * {@link #pNext};
 *     VkHeadlessSurfaceCreateFlagsEXT {@link #flags};
 * }</code></pre>
 */
public class VkHeadlessSurfaceCreateInfoEXT extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        FLAGS;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        FLAGS = layout.offsetof(2);
    }

    /**
     * Creates a {@code VkHeadlessSurfaceCreateInfoEXT} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkHeadlessSurfaceCreateInfoEXT(ByteBuffer container) {
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
    @NativeType("VkHeadlessSurfaceCreateFlagsEXT")
    public int flags() { return nflags(address()); }

    /** Sets the specified value to the {@link #sType} field. */
    public VkHeadlessSurfaceCreateInfoEXT sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link EXTHeadlessSurface#VK_STRUCTURE_TYPE_HEADLESS_SURFACE_CREATE_INFO_EXT STRUCTURE_TYPE_HEADLESS_SURFACE_CREATE_INFO_EXT} value to the {@link #sType} field. */
    public VkHeadlessSurfaceCreateInfoEXT sType$Default() { return sType(EXTHeadlessSurface.VK_STRUCTURE_TYPE_HEADLESS_SURFACE_CREATE_INFO_EXT); }
    /** Sets the specified value to the {@link #pNext} field. */
    public VkHeadlessSurfaceCreateInfoEXT pNext(@NativeType("void const *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@link #flags} field. */
    public VkHeadlessSurfaceCreateInfoEXT flags(@NativeType("VkHeadlessSurfaceCreateFlagsEXT") int value) { nflags(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkHeadlessSurfaceCreateInfoEXT set(
        int sType,
        long pNext,
        int flags
    ) {
        sType(sType);
        pNext(pNext);
        flags(flags);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkHeadlessSurfaceCreateInfoEXT set(VkHeadlessSurfaceCreateInfoEXT src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkHeadlessSurfaceCreateInfoEXT} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkHeadlessSurfaceCreateInfoEXT malloc() {
        return wrap(VkHeadlessSurfaceCreateInfoEXT.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code VkHeadlessSurfaceCreateInfoEXT} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkHeadlessSurfaceCreateInfoEXT calloc() {
        return wrap(VkHeadlessSurfaceCreateInfoEXT.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code VkHeadlessSurfaceCreateInfoEXT} instance allocated with {@link BufferUtils}. */
    public static VkHeadlessSurfaceCreateInfoEXT create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(VkHeadlessSurfaceCreateInfoEXT.class, memAddress(container), container);
    }

    /** Returns a new {@code VkHeadlessSurfaceCreateInfoEXT} instance for the specified memory address. */
    public static VkHeadlessSurfaceCreateInfoEXT create(long address) {
        return wrap(VkHeadlessSurfaceCreateInfoEXT.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkHeadlessSurfaceCreateInfoEXT createSafe(long address) {
        return address == NULL ? null : wrap(VkHeadlessSurfaceCreateInfoEXT.class, address);
    }

    /**
     * Returns a new {@link VkHeadlessSurfaceCreateInfoEXT.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkHeadlessSurfaceCreateInfoEXT.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkHeadlessSurfaceCreateInfoEXT.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkHeadlessSurfaceCreateInfoEXT.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkHeadlessSurfaceCreateInfoEXT.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkHeadlessSurfaceCreateInfoEXT.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link VkHeadlessSurfaceCreateInfoEXT.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkHeadlessSurfaceCreateInfoEXT.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkHeadlessSurfaceCreateInfoEXT.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    // -----------------------------------

    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static VkHeadlessSurfaceCreateInfoEXT mallocStack() { return malloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static VkHeadlessSurfaceCreateInfoEXT callocStack() { return calloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static VkHeadlessSurfaceCreateInfoEXT mallocStack(MemoryStack stack) { return malloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static VkHeadlessSurfaceCreateInfoEXT callocStack(MemoryStack stack) { return calloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static VkHeadlessSurfaceCreateInfoEXT.Buffer mallocStack(int capacity) { return malloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static VkHeadlessSurfaceCreateInfoEXT.Buffer callocStack(int capacity) { return calloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static VkHeadlessSurfaceCreateInfoEXT.Buffer mallocStack(int capacity, MemoryStack stack) { return malloc(capacity, stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static VkHeadlessSurfaceCreateInfoEXT.Buffer callocStack(int capacity, MemoryStack stack) { return calloc(capacity, stack); }

    /**
     * Returns a new {@code VkHeadlessSurfaceCreateInfoEXT} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkHeadlessSurfaceCreateInfoEXT malloc(MemoryStack stack) {
        return wrap(VkHeadlessSurfaceCreateInfoEXT.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code VkHeadlessSurfaceCreateInfoEXT} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkHeadlessSurfaceCreateInfoEXT calloc(MemoryStack stack) {
        return wrap(VkHeadlessSurfaceCreateInfoEXT.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link VkHeadlessSurfaceCreateInfoEXT.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkHeadlessSurfaceCreateInfoEXT.Buffer malloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkHeadlessSurfaceCreateInfoEXT.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkHeadlessSurfaceCreateInfoEXT.Buffer calloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return UNSAFE.getInt(null, struct + VkHeadlessSurfaceCreateInfoEXT.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkHeadlessSurfaceCreateInfoEXT.PNEXT); }
    /** Unsafe version of {@link #flags}. */
    public static int nflags(long struct) { return UNSAFE.getInt(null, struct + VkHeadlessSurfaceCreateInfoEXT.FLAGS); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { UNSAFE.putInt(null, struct + VkHeadlessSurfaceCreateInfoEXT.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkHeadlessSurfaceCreateInfoEXT.PNEXT, value); }
    /** Unsafe version of {@link #flags(int) flags}. */
    public static void nflags(long struct, int value) { UNSAFE.putInt(null, struct + VkHeadlessSurfaceCreateInfoEXT.FLAGS, value); }

    // -----------------------------------

    /** An array of {@link VkHeadlessSurfaceCreateInfoEXT} structs. */
    public static class Buffer extends StructBuffer<VkHeadlessSurfaceCreateInfoEXT, Buffer> implements NativeResource {

        private static final VkHeadlessSurfaceCreateInfoEXT ELEMENT_FACTORY = VkHeadlessSurfaceCreateInfoEXT.create(-1L);

        /**
         * Creates a new {@code VkHeadlessSurfaceCreateInfoEXT.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkHeadlessSurfaceCreateInfoEXT#SIZEOF}, and its mark will be undefined.
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
        protected VkHeadlessSurfaceCreateInfoEXT getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link VkHeadlessSurfaceCreateInfoEXT#sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkHeadlessSurfaceCreateInfoEXT.nsType(address()); }
        /** @return the value of the {@link VkHeadlessSurfaceCreateInfoEXT#pNext} field. */
        @NativeType("void const *")
        public long pNext() { return VkHeadlessSurfaceCreateInfoEXT.npNext(address()); }
        /** @return the value of the {@link VkHeadlessSurfaceCreateInfoEXT#flags} field. */
        @NativeType("VkHeadlessSurfaceCreateFlagsEXT")
        public int flags() { return VkHeadlessSurfaceCreateInfoEXT.nflags(address()); }

        /** Sets the specified value to the {@link VkHeadlessSurfaceCreateInfoEXT#sType} field. */
        public VkHeadlessSurfaceCreateInfoEXT.Buffer sType(@NativeType("VkStructureType") int value) { VkHeadlessSurfaceCreateInfoEXT.nsType(address(), value); return this; }
        /** Sets the {@link EXTHeadlessSurface#VK_STRUCTURE_TYPE_HEADLESS_SURFACE_CREATE_INFO_EXT STRUCTURE_TYPE_HEADLESS_SURFACE_CREATE_INFO_EXT} value to the {@link VkHeadlessSurfaceCreateInfoEXT#sType} field. */
        public VkHeadlessSurfaceCreateInfoEXT.Buffer sType$Default() { return sType(EXTHeadlessSurface.VK_STRUCTURE_TYPE_HEADLESS_SURFACE_CREATE_INFO_EXT); }
        /** Sets the specified value to the {@link VkHeadlessSurfaceCreateInfoEXT#pNext} field. */
        public VkHeadlessSurfaceCreateInfoEXT.Buffer pNext(@NativeType("void const *") long value) { VkHeadlessSurfaceCreateInfoEXT.npNext(address(), value); return this; }
        /** Sets the specified value to the {@link VkHeadlessSurfaceCreateInfoEXT#flags} field. */
        public VkHeadlessSurfaceCreateInfoEXT.Buffer flags(@NativeType("VkHeadlessSurfaceCreateFlagsEXT") int value) { VkHeadlessSurfaceCreateInfoEXT.nflags(address(), value); return this; }

    }

}