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
 * struct VkPipelineViewportDepthClipControlCreateInfoEXT {
 *     VkStructureType sType;
 *     void const * pNext;
 *     VkBool32 negativeOneToOne;
 * }}</pre>
 */
public class VkPipelineViewportDepthClipControlCreateInfoEXT extends Struct<VkPipelineViewportDepthClipControlCreateInfoEXT> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        NEGATIVEONETOONE;

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
        NEGATIVEONETOONE = layout.offsetof(2);
    }

    protected VkPipelineViewportDepthClipControlCreateInfoEXT(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkPipelineViewportDepthClipControlCreateInfoEXT create(long address, @Nullable ByteBuffer container) {
        return new VkPipelineViewportDepthClipControlCreateInfoEXT(address, container);
    }

    /**
     * Creates a {@code VkPipelineViewportDepthClipControlCreateInfoEXT} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkPipelineViewportDepthClipControlCreateInfoEXT(ByteBuffer container) {
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
    /** @return the value of the {@code negativeOneToOne} field. */
    @NativeType("VkBool32")
    public boolean negativeOneToOne() { return nnegativeOneToOne(address()) != 0; }

    /** Sets the specified value to the {@code sType} field. */
    public VkPipelineViewportDepthClipControlCreateInfoEXT sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link EXTDepthClipControl#VK_STRUCTURE_TYPE_PIPELINE_VIEWPORT_DEPTH_CLIP_CONTROL_CREATE_INFO_EXT STRUCTURE_TYPE_PIPELINE_VIEWPORT_DEPTH_CLIP_CONTROL_CREATE_INFO_EXT} value to the {@code sType} field. */
    public VkPipelineViewportDepthClipControlCreateInfoEXT sType$Default() { return sType(EXTDepthClipControl.VK_STRUCTURE_TYPE_PIPELINE_VIEWPORT_DEPTH_CLIP_CONTROL_CREATE_INFO_EXT); }
    /** Sets the specified value to the {@code pNext} field. */
    public VkPipelineViewportDepthClipControlCreateInfoEXT pNext(@NativeType("void const *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@code negativeOneToOne} field. */
    public VkPipelineViewportDepthClipControlCreateInfoEXT negativeOneToOne(@NativeType("VkBool32") boolean value) { nnegativeOneToOne(address(), value ? 1 : 0); return this; }

    /** Initializes this struct with the specified values. */
    public VkPipelineViewportDepthClipControlCreateInfoEXT set(
        int sType,
        long pNext,
        boolean negativeOneToOne
    ) {
        sType(sType);
        pNext(pNext);
        negativeOneToOne(negativeOneToOne);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkPipelineViewportDepthClipControlCreateInfoEXT set(VkPipelineViewportDepthClipControlCreateInfoEXT src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkPipelineViewportDepthClipControlCreateInfoEXT} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkPipelineViewportDepthClipControlCreateInfoEXT malloc() {
        return new VkPipelineViewportDepthClipControlCreateInfoEXT(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkPipelineViewportDepthClipControlCreateInfoEXT} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkPipelineViewportDepthClipControlCreateInfoEXT calloc() {
        return new VkPipelineViewportDepthClipControlCreateInfoEXT(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkPipelineViewportDepthClipControlCreateInfoEXT} instance allocated with {@link BufferUtils}. */
    public static VkPipelineViewportDepthClipControlCreateInfoEXT create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkPipelineViewportDepthClipControlCreateInfoEXT(memAddress(container), container);
    }

    /** Returns a new {@code VkPipelineViewportDepthClipControlCreateInfoEXT} instance for the specified memory address. */
    public static VkPipelineViewportDepthClipControlCreateInfoEXT create(long address) {
        return new VkPipelineViewportDepthClipControlCreateInfoEXT(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable VkPipelineViewportDepthClipControlCreateInfoEXT createSafe(long address) {
        return address == NULL ? null : new VkPipelineViewportDepthClipControlCreateInfoEXT(address, null);
    }

    /**
     * Returns a new {@link VkPipelineViewportDepthClipControlCreateInfoEXT.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPipelineViewportDepthClipControlCreateInfoEXT.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkPipelineViewportDepthClipControlCreateInfoEXT.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPipelineViewportDepthClipControlCreateInfoEXT.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPipelineViewportDepthClipControlCreateInfoEXT.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkPipelineViewportDepthClipControlCreateInfoEXT.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkPipelineViewportDepthClipControlCreateInfoEXT.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkPipelineViewportDepthClipControlCreateInfoEXT.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static VkPipelineViewportDepthClipControlCreateInfoEXT.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code VkPipelineViewportDepthClipControlCreateInfoEXT} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPipelineViewportDepthClipControlCreateInfoEXT malloc(MemoryStack stack) {
        return new VkPipelineViewportDepthClipControlCreateInfoEXT(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkPipelineViewportDepthClipControlCreateInfoEXT} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPipelineViewportDepthClipControlCreateInfoEXT calloc(MemoryStack stack) {
        return new VkPipelineViewportDepthClipControlCreateInfoEXT(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkPipelineViewportDepthClipControlCreateInfoEXT.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPipelineViewportDepthClipControlCreateInfoEXT.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPipelineViewportDepthClipControlCreateInfoEXT.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPipelineViewportDepthClipControlCreateInfoEXT.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return memGetInt(struct + VkPipelineViewportDepthClipControlCreateInfoEXT.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkPipelineViewportDepthClipControlCreateInfoEXT.PNEXT); }
    /** Unsafe version of {@link #negativeOneToOne}. */
    public static int nnegativeOneToOne(long struct) { return memGetInt(struct + VkPipelineViewportDepthClipControlCreateInfoEXT.NEGATIVEONETOONE); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { memPutInt(struct + VkPipelineViewportDepthClipControlCreateInfoEXT.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkPipelineViewportDepthClipControlCreateInfoEXT.PNEXT, value); }
    /** Unsafe version of {@link #negativeOneToOne(boolean) negativeOneToOne}. */
    public static void nnegativeOneToOne(long struct, int value) { memPutInt(struct + VkPipelineViewportDepthClipControlCreateInfoEXT.NEGATIVEONETOONE, value); }

    // -----------------------------------

    /** An array of {@link VkPipelineViewportDepthClipControlCreateInfoEXT} structs. */
    public static class Buffer extends StructBuffer<VkPipelineViewportDepthClipControlCreateInfoEXT, Buffer> implements NativeResource {

        private static final VkPipelineViewportDepthClipControlCreateInfoEXT ELEMENT_FACTORY = VkPipelineViewportDepthClipControlCreateInfoEXT.create(-1L);

        /**
         * Creates a new {@code VkPipelineViewportDepthClipControlCreateInfoEXT.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkPipelineViewportDepthClipControlCreateInfoEXT#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkPipelineViewportDepthClipControlCreateInfoEXT getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkPipelineViewportDepthClipControlCreateInfoEXT.nsType(address()); }
        /** @return the value of the {@code pNext} field. */
        @NativeType("void const *")
        public long pNext() { return VkPipelineViewportDepthClipControlCreateInfoEXT.npNext(address()); }
        /** @return the value of the {@code negativeOneToOne} field. */
        @NativeType("VkBool32")
        public boolean negativeOneToOne() { return VkPipelineViewportDepthClipControlCreateInfoEXT.nnegativeOneToOne(address()) != 0; }

        /** Sets the specified value to the {@code sType} field. */
        public VkPipelineViewportDepthClipControlCreateInfoEXT.Buffer sType(@NativeType("VkStructureType") int value) { VkPipelineViewportDepthClipControlCreateInfoEXT.nsType(address(), value); return this; }
        /** Sets the {@link EXTDepthClipControl#VK_STRUCTURE_TYPE_PIPELINE_VIEWPORT_DEPTH_CLIP_CONTROL_CREATE_INFO_EXT STRUCTURE_TYPE_PIPELINE_VIEWPORT_DEPTH_CLIP_CONTROL_CREATE_INFO_EXT} value to the {@code sType} field. */
        public VkPipelineViewportDepthClipControlCreateInfoEXT.Buffer sType$Default() { return sType(EXTDepthClipControl.VK_STRUCTURE_TYPE_PIPELINE_VIEWPORT_DEPTH_CLIP_CONTROL_CREATE_INFO_EXT); }
        /** Sets the specified value to the {@code pNext} field. */
        public VkPipelineViewportDepthClipControlCreateInfoEXT.Buffer pNext(@NativeType("void const *") long value) { VkPipelineViewportDepthClipControlCreateInfoEXT.npNext(address(), value); return this; }
        /** Sets the specified value to the {@code negativeOneToOne} field. */
        public VkPipelineViewportDepthClipControlCreateInfoEXT.Buffer negativeOneToOne(@NativeType("VkBool32") boolean value) { VkPipelineViewportDepthClipControlCreateInfoEXT.nnegativeOneToOne(address(), value ? 1 : 0); return this; }

    }

}