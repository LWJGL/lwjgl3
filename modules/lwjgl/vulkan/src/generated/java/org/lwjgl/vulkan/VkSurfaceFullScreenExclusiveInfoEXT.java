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
 * Structure specifying the preferred full-screen transition behavior.
 * 
 * <h5>Description</h5>
 * 
 * <p>If this structure is not present, {@code fullScreenExclusive} is considered to be {@link EXTFullScreenExclusive#VK_FULL_SCREEN_EXCLUSIVE_DEFAULT_EXT FULL_SCREEN_EXCLUSIVE_DEFAULT_EXT}.</p>
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>{@code sType} <b>must</b> be {@link EXTFullScreenExclusive#VK_STRUCTURE_TYPE_SURFACE_FULL_SCREEN_EXCLUSIVE_INFO_EXT STRUCTURE_TYPE_SURFACE_FULL_SCREEN_EXCLUSIVE_INFO_EXT}</li>
 * <li>{@code fullScreenExclusive} <b>must</b> be a valid {@code VkFullScreenExclusiveEXT} value</li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkSurfaceFullScreenExclusiveInfoEXT {
 *     VkStructureType {@link #sType};
 *     void * {@link #pNext};
 *     VkFullScreenExclusiveEXT {@link #fullScreenExclusive};
 * }</code></pre>
 */
public class VkSurfaceFullScreenExclusiveInfoEXT extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        FULLSCREENEXCLUSIVE;

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
        FULLSCREENEXCLUSIVE = layout.offsetof(2);
    }

    /**
     * Creates a {@code VkSurfaceFullScreenExclusiveInfoEXT} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkSurfaceFullScreenExclusiveInfoEXT(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** the type of this structure. */
    @NativeType("VkStructureType")
    public int sType() { return nsType(address()); }
    /** {@code NULL} or a pointer to a structure extending this structure. */
    @NativeType("void *")
    public long pNext() { return npNext(address()); }
    /** a {@code VkFullScreenExclusiveEXT} value specifying the preferred full-screen transition behavior. */
    @NativeType("VkFullScreenExclusiveEXT")
    public int fullScreenExclusive() { return nfullScreenExclusive(address()); }

    /** Sets the specified value to the {@link #sType} field. */
    public VkSurfaceFullScreenExclusiveInfoEXT sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link EXTFullScreenExclusive#VK_STRUCTURE_TYPE_SURFACE_FULL_SCREEN_EXCLUSIVE_INFO_EXT STRUCTURE_TYPE_SURFACE_FULL_SCREEN_EXCLUSIVE_INFO_EXT} value to the {@link #sType} field. */
    public VkSurfaceFullScreenExclusiveInfoEXT sType$Default() { return sType(EXTFullScreenExclusive.VK_STRUCTURE_TYPE_SURFACE_FULL_SCREEN_EXCLUSIVE_INFO_EXT); }
    /** Sets the specified value to the {@link #pNext} field. */
    public VkSurfaceFullScreenExclusiveInfoEXT pNext(@NativeType("void *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@link #fullScreenExclusive} field. */
    public VkSurfaceFullScreenExclusiveInfoEXT fullScreenExclusive(@NativeType("VkFullScreenExclusiveEXT") int value) { nfullScreenExclusive(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkSurfaceFullScreenExclusiveInfoEXT set(
        int sType,
        long pNext,
        int fullScreenExclusive
    ) {
        sType(sType);
        pNext(pNext);
        fullScreenExclusive(fullScreenExclusive);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkSurfaceFullScreenExclusiveInfoEXT set(VkSurfaceFullScreenExclusiveInfoEXT src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkSurfaceFullScreenExclusiveInfoEXT} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkSurfaceFullScreenExclusiveInfoEXT malloc() {
        return wrap(VkSurfaceFullScreenExclusiveInfoEXT.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code VkSurfaceFullScreenExclusiveInfoEXT} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkSurfaceFullScreenExclusiveInfoEXT calloc() {
        return wrap(VkSurfaceFullScreenExclusiveInfoEXT.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code VkSurfaceFullScreenExclusiveInfoEXT} instance allocated with {@link BufferUtils}. */
    public static VkSurfaceFullScreenExclusiveInfoEXT create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(VkSurfaceFullScreenExclusiveInfoEXT.class, memAddress(container), container);
    }

    /** Returns a new {@code VkSurfaceFullScreenExclusiveInfoEXT} instance for the specified memory address. */
    public static VkSurfaceFullScreenExclusiveInfoEXT create(long address) {
        return wrap(VkSurfaceFullScreenExclusiveInfoEXT.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkSurfaceFullScreenExclusiveInfoEXT createSafe(long address) {
        return address == NULL ? null : wrap(VkSurfaceFullScreenExclusiveInfoEXT.class, address);
    }

    /**
     * Returns a new {@link VkSurfaceFullScreenExclusiveInfoEXT.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkSurfaceFullScreenExclusiveInfoEXT.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkSurfaceFullScreenExclusiveInfoEXT.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkSurfaceFullScreenExclusiveInfoEXT.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkSurfaceFullScreenExclusiveInfoEXT.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkSurfaceFullScreenExclusiveInfoEXT.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link VkSurfaceFullScreenExclusiveInfoEXT.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkSurfaceFullScreenExclusiveInfoEXT.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkSurfaceFullScreenExclusiveInfoEXT.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    // -----------------------------------

    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static VkSurfaceFullScreenExclusiveInfoEXT mallocStack() { return malloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static VkSurfaceFullScreenExclusiveInfoEXT callocStack() { return calloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static VkSurfaceFullScreenExclusiveInfoEXT mallocStack(MemoryStack stack) { return malloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static VkSurfaceFullScreenExclusiveInfoEXT callocStack(MemoryStack stack) { return calloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static VkSurfaceFullScreenExclusiveInfoEXT.Buffer mallocStack(int capacity) { return malloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static VkSurfaceFullScreenExclusiveInfoEXT.Buffer callocStack(int capacity) { return calloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static VkSurfaceFullScreenExclusiveInfoEXT.Buffer mallocStack(int capacity, MemoryStack stack) { return malloc(capacity, stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static VkSurfaceFullScreenExclusiveInfoEXT.Buffer callocStack(int capacity, MemoryStack stack) { return calloc(capacity, stack); }

    /**
     * Returns a new {@code VkSurfaceFullScreenExclusiveInfoEXT} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkSurfaceFullScreenExclusiveInfoEXT malloc(MemoryStack stack) {
        return wrap(VkSurfaceFullScreenExclusiveInfoEXT.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code VkSurfaceFullScreenExclusiveInfoEXT} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkSurfaceFullScreenExclusiveInfoEXT calloc(MemoryStack stack) {
        return wrap(VkSurfaceFullScreenExclusiveInfoEXT.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link VkSurfaceFullScreenExclusiveInfoEXT.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkSurfaceFullScreenExclusiveInfoEXT.Buffer malloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkSurfaceFullScreenExclusiveInfoEXT.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkSurfaceFullScreenExclusiveInfoEXT.Buffer calloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return UNSAFE.getInt(null, struct + VkSurfaceFullScreenExclusiveInfoEXT.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkSurfaceFullScreenExclusiveInfoEXT.PNEXT); }
    /** Unsafe version of {@link #fullScreenExclusive}. */
    public static int nfullScreenExclusive(long struct) { return UNSAFE.getInt(null, struct + VkSurfaceFullScreenExclusiveInfoEXT.FULLSCREENEXCLUSIVE); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { UNSAFE.putInt(null, struct + VkSurfaceFullScreenExclusiveInfoEXT.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkSurfaceFullScreenExclusiveInfoEXT.PNEXT, value); }
    /** Unsafe version of {@link #fullScreenExclusive(int) fullScreenExclusive}. */
    public static void nfullScreenExclusive(long struct, int value) { UNSAFE.putInt(null, struct + VkSurfaceFullScreenExclusiveInfoEXT.FULLSCREENEXCLUSIVE, value); }

    // -----------------------------------

    /** An array of {@link VkSurfaceFullScreenExclusiveInfoEXT} structs. */
    public static class Buffer extends StructBuffer<VkSurfaceFullScreenExclusiveInfoEXT, Buffer> implements NativeResource {

        private static final VkSurfaceFullScreenExclusiveInfoEXT ELEMENT_FACTORY = VkSurfaceFullScreenExclusiveInfoEXT.create(-1L);

        /**
         * Creates a new {@code VkSurfaceFullScreenExclusiveInfoEXT.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkSurfaceFullScreenExclusiveInfoEXT#SIZEOF}, and its mark will be undefined.
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
        protected VkSurfaceFullScreenExclusiveInfoEXT getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link VkSurfaceFullScreenExclusiveInfoEXT#sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkSurfaceFullScreenExclusiveInfoEXT.nsType(address()); }
        /** @return the value of the {@link VkSurfaceFullScreenExclusiveInfoEXT#pNext} field. */
        @NativeType("void *")
        public long pNext() { return VkSurfaceFullScreenExclusiveInfoEXT.npNext(address()); }
        /** @return the value of the {@link VkSurfaceFullScreenExclusiveInfoEXT#fullScreenExclusive} field. */
        @NativeType("VkFullScreenExclusiveEXT")
        public int fullScreenExclusive() { return VkSurfaceFullScreenExclusiveInfoEXT.nfullScreenExclusive(address()); }

        /** Sets the specified value to the {@link VkSurfaceFullScreenExclusiveInfoEXT#sType} field. */
        public VkSurfaceFullScreenExclusiveInfoEXT.Buffer sType(@NativeType("VkStructureType") int value) { VkSurfaceFullScreenExclusiveInfoEXT.nsType(address(), value); return this; }
        /** Sets the {@link EXTFullScreenExclusive#VK_STRUCTURE_TYPE_SURFACE_FULL_SCREEN_EXCLUSIVE_INFO_EXT STRUCTURE_TYPE_SURFACE_FULL_SCREEN_EXCLUSIVE_INFO_EXT} value to the {@link VkSurfaceFullScreenExclusiveInfoEXT#sType} field. */
        public VkSurfaceFullScreenExclusiveInfoEXT.Buffer sType$Default() { return sType(EXTFullScreenExclusive.VK_STRUCTURE_TYPE_SURFACE_FULL_SCREEN_EXCLUSIVE_INFO_EXT); }
        /** Sets the specified value to the {@link VkSurfaceFullScreenExclusiveInfoEXT#pNext} field. */
        public VkSurfaceFullScreenExclusiveInfoEXT.Buffer pNext(@NativeType("void *") long value) { VkSurfaceFullScreenExclusiveInfoEXT.npNext(address(), value); return this; }
        /** Sets the specified value to the {@link VkSurfaceFullScreenExclusiveInfoEXT#fullScreenExclusive} field. */
        public VkSurfaceFullScreenExclusiveInfoEXT.Buffer fullScreenExclusive(@NativeType("VkFullScreenExclusiveEXT") int value) { VkSurfaceFullScreenExclusiveInfoEXT.nfullScreenExclusive(address(), value); return this; }

    }

}