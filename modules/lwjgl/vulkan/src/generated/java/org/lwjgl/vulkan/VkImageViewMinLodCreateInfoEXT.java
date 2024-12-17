/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.vulkan;

import org.jspecify.annotations.*;

import java.nio.*;

import org.lwjgl.*;
import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * <pre>{@code
 * struct VkImageViewMinLodCreateInfoEXT {
 *     VkStructureType sType;
 *     void const * pNext;
 *     float minLod;
 * }}</pre>
 */
public class VkImageViewMinLodCreateInfoEXT extends Struct<VkImageViewMinLodCreateInfoEXT> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        MINLOD;

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
        MINLOD = layout.offsetof(2);
    }

    protected VkImageViewMinLodCreateInfoEXT(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkImageViewMinLodCreateInfoEXT create(long address, @Nullable ByteBuffer container) {
        return new VkImageViewMinLodCreateInfoEXT(address, container);
    }

    /**
     * Creates a {@code VkImageViewMinLodCreateInfoEXT} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkImageViewMinLodCreateInfoEXT(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return the value of the {@code sType} field. */
    @NativeType("VkStructureType")
    public int sType() { return nsType(address()); }
    /** @return the value of the {@code pNext} field. */
    @NativeType("void const *")
    public long pNext() { return npNext(address()); }
    /** @return the value of the {@code minLod} field. */
    public float minLod() { return nminLod(address()); }

    /** Sets the specified value to the {@code sType} field. */
    public VkImageViewMinLodCreateInfoEXT sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link EXTImageViewMinLod#VK_STRUCTURE_TYPE_IMAGE_VIEW_MIN_LOD_CREATE_INFO_EXT STRUCTURE_TYPE_IMAGE_VIEW_MIN_LOD_CREATE_INFO_EXT} value to the {@code sType} field. */
    public VkImageViewMinLodCreateInfoEXT sType$Default() { return sType(EXTImageViewMinLod.VK_STRUCTURE_TYPE_IMAGE_VIEW_MIN_LOD_CREATE_INFO_EXT); }
    /** Sets the specified value to the {@code pNext} field. */
    public VkImageViewMinLodCreateInfoEXT pNext(@NativeType("void const *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@code minLod} field. */
    public VkImageViewMinLodCreateInfoEXT minLod(float value) { nminLod(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkImageViewMinLodCreateInfoEXT set(
        int sType,
        long pNext,
        float minLod
    ) {
        sType(sType);
        pNext(pNext);
        minLod(minLod);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkImageViewMinLodCreateInfoEXT set(VkImageViewMinLodCreateInfoEXT src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkImageViewMinLodCreateInfoEXT} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkImageViewMinLodCreateInfoEXT malloc() {
        return new VkImageViewMinLodCreateInfoEXT(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkImageViewMinLodCreateInfoEXT} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkImageViewMinLodCreateInfoEXT calloc() {
        return new VkImageViewMinLodCreateInfoEXT(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkImageViewMinLodCreateInfoEXT} instance allocated with {@link BufferUtils}. */
    public static VkImageViewMinLodCreateInfoEXT create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkImageViewMinLodCreateInfoEXT(memAddress(container), container);
    }

    /** Returns a new {@code VkImageViewMinLodCreateInfoEXT} instance for the specified memory address. */
    public static VkImageViewMinLodCreateInfoEXT create(long address) {
        return new VkImageViewMinLodCreateInfoEXT(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable VkImageViewMinLodCreateInfoEXT createSafe(long address) {
        return address == NULL ? null : new VkImageViewMinLodCreateInfoEXT(address, null);
    }

    /**
     * Returns a new {@link VkImageViewMinLodCreateInfoEXT.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkImageViewMinLodCreateInfoEXT.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkImageViewMinLodCreateInfoEXT.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkImageViewMinLodCreateInfoEXT.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkImageViewMinLodCreateInfoEXT.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkImageViewMinLodCreateInfoEXT.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkImageViewMinLodCreateInfoEXT.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkImageViewMinLodCreateInfoEXT.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static VkImageViewMinLodCreateInfoEXT.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code VkImageViewMinLodCreateInfoEXT} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkImageViewMinLodCreateInfoEXT malloc(MemoryStack stack) {
        return new VkImageViewMinLodCreateInfoEXT(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkImageViewMinLodCreateInfoEXT} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkImageViewMinLodCreateInfoEXT calloc(MemoryStack stack) {
        return new VkImageViewMinLodCreateInfoEXT(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkImageViewMinLodCreateInfoEXT.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkImageViewMinLodCreateInfoEXT.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkImageViewMinLodCreateInfoEXT.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkImageViewMinLodCreateInfoEXT.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return memGetInt(struct + VkImageViewMinLodCreateInfoEXT.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkImageViewMinLodCreateInfoEXT.PNEXT); }
    /** Unsafe version of {@link #minLod}. */
    public static float nminLod(long struct) { return memGetFloat(struct + VkImageViewMinLodCreateInfoEXT.MINLOD); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { memPutInt(struct + VkImageViewMinLodCreateInfoEXT.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkImageViewMinLodCreateInfoEXT.PNEXT, value); }
    /** Unsafe version of {@link #minLod(float) minLod}. */
    public static void nminLod(long struct, float value) { memPutFloat(struct + VkImageViewMinLodCreateInfoEXT.MINLOD, value); }

    // -----------------------------------

    /** An array of {@link VkImageViewMinLodCreateInfoEXT} structs. */
    public static class Buffer extends StructBuffer<VkImageViewMinLodCreateInfoEXT, Buffer> implements NativeResource {

        private static final VkImageViewMinLodCreateInfoEXT ELEMENT_FACTORY = VkImageViewMinLodCreateInfoEXT.create(-1L);

        /**
         * Creates a new {@code VkImageViewMinLodCreateInfoEXT.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkImageViewMinLodCreateInfoEXT#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkImageViewMinLodCreateInfoEXT getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkImageViewMinLodCreateInfoEXT.nsType(address()); }
        /** @return the value of the {@code pNext} field. */
        @NativeType("void const *")
        public long pNext() { return VkImageViewMinLodCreateInfoEXT.npNext(address()); }
        /** @return the value of the {@code minLod} field. */
        public float minLod() { return VkImageViewMinLodCreateInfoEXT.nminLod(address()); }

        /** Sets the specified value to the {@code sType} field. */
        public VkImageViewMinLodCreateInfoEXT.Buffer sType(@NativeType("VkStructureType") int value) { VkImageViewMinLodCreateInfoEXT.nsType(address(), value); return this; }
        /** Sets the {@link EXTImageViewMinLod#VK_STRUCTURE_TYPE_IMAGE_VIEW_MIN_LOD_CREATE_INFO_EXT STRUCTURE_TYPE_IMAGE_VIEW_MIN_LOD_CREATE_INFO_EXT} value to the {@code sType} field. */
        public VkImageViewMinLodCreateInfoEXT.Buffer sType$Default() { return sType(EXTImageViewMinLod.VK_STRUCTURE_TYPE_IMAGE_VIEW_MIN_LOD_CREATE_INFO_EXT); }
        /** Sets the specified value to the {@code pNext} field. */
        public VkImageViewMinLodCreateInfoEXT.Buffer pNext(@NativeType("void const *") long value) { VkImageViewMinLodCreateInfoEXT.npNext(address(), value); return this; }
        /** Sets the specified value to the {@code minLod} field. */
        public VkImageViewMinLodCreateInfoEXT.Buffer minLod(float value) { VkImageViewMinLodCreateInfoEXT.nminLod(address(), value); return this; }

    }

}