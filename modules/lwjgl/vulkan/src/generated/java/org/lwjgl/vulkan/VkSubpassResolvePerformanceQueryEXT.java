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
 * struct VkSubpassResolvePerformanceQueryEXT {
 *     VkStructureType sType;
 *     void * pNext;
 *     VkBool32 optimal;
 * }}</pre>
 */
public class VkSubpassResolvePerformanceQueryEXT extends Struct<VkSubpassResolvePerformanceQueryEXT> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        OPTIMAL;

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
        OPTIMAL = layout.offsetof(2);
    }

    protected VkSubpassResolvePerformanceQueryEXT(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkSubpassResolvePerformanceQueryEXT create(long address, @Nullable ByteBuffer container) {
        return new VkSubpassResolvePerformanceQueryEXT(address, container);
    }

    /**
     * Creates a {@code VkSubpassResolvePerformanceQueryEXT} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkSubpassResolvePerformanceQueryEXT(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return the value of the {@code sType} field. */
    @NativeType("VkStructureType")
    public int sType() { return nsType(address()); }
    /** @return the value of the {@code pNext} field. */
    @NativeType("void *")
    public long pNext() { return npNext(address()); }
    /** @return the value of the {@code optimal} field. */
    @NativeType("VkBool32")
    public boolean optimal() { return noptimal(address()) != 0; }

    /** Sets the specified value to the {@code sType} field. */
    public VkSubpassResolvePerformanceQueryEXT sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link EXTMultisampledRenderToSingleSampled#VK_STRUCTURE_TYPE_SUBPASS_RESOLVE_PERFORMANCE_QUERY_EXT STRUCTURE_TYPE_SUBPASS_RESOLVE_PERFORMANCE_QUERY_EXT} value to the {@code sType} field. */
    public VkSubpassResolvePerformanceQueryEXT sType$Default() { return sType(EXTMultisampledRenderToSingleSampled.VK_STRUCTURE_TYPE_SUBPASS_RESOLVE_PERFORMANCE_QUERY_EXT); }
    /** Sets the specified value to the {@code pNext} field. */
    public VkSubpassResolvePerformanceQueryEXT pNext(@NativeType("void *") long value) { npNext(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkSubpassResolvePerformanceQueryEXT set(
        int sType,
        long pNext
    ) {
        sType(sType);
        pNext(pNext);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkSubpassResolvePerformanceQueryEXT set(VkSubpassResolvePerformanceQueryEXT src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkSubpassResolvePerformanceQueryEXT} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkSubpassResolvePerformanceQueryEXT malloc() {
        return new VkSubpassResolvePerformanceQueryEXT(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkSubpassResolvePerformanceQueryEXT} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkSubpassResolvePerformanceQueryEXT calloc() {
        return new VkSubpassResolvePerformanceQueryEXT(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkSubpassResolvePerformanceQueryEXT} instance allocated with {@link BufferUtils}. */
    public static VkSubpassResolvePerformanceQueryEXT create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkSubpassResolvePerformanceQueryEXT(memAddress(container), container);
    }

    /** Returns a new {@code VkSubpassResolvePerformanceQueryEXT} instance for the specified memory address. */
    public static VkSubpassResolvePerformanceQueryEXT create(long address) {
        return new VkSubpassResolvePerformanceQueryEXT(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable VkSubpassResolvePerformanceQueryEXT createSafe(long address) {
        return address == NULL ? null : new VkSubpassResolvePerformanceQueryEXT(address, null);
    }

    /**
     * Returns a new {@link VkSubpassResolvePerformanceQueryEXT.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkSubpassResolvePerformanceQueryEXT.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkSubpassResolvePerformanceQueryEXT.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkSubpassResolvePerformanceQueryEXT.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkSubpassResolvePerformanceQueryEXT.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkSubpassResolvePerformanceQueryEXT.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkSubpassResolvePerformanceQueryEXT.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkSubpassResolvePerformanceQueryEXT.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static VkSubpassResolvePerformanceQueryEXT.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code VkSubpassResolvePerformanceQueryEXT} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkSubpassResolvePerformanceQueryEXT malloc(MemoryStack stack) {
        return new VkSubpassResolvePerformanceQueryEXT(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkSubpassResolvePerformanceQueryEXT} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkSubpassResolvePerformanceQueryEXT calloc(MemoryStack stack) {
        return new VkSubpassResolvePerformanceQueryEXT(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkSubpassResolvePerformanceQueryEXT.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkSubpassResolvePerformanceQueryEXT.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkSubpassResolvePerformanceQueryEXT.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkSubpassResolvePerformanceQueryEXT.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return memGetInt(struct + VkSubpassResolvePerformanceQueryEXT.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkSubpassResolvePerformanceQueryEXT.PNEXT); }
    /** Unsafe version of {@link #optimal}. */
    public static int noptimal(long struct) { return memGetInt(struct + VkSubpassResolvePerformanceQueryEXT.OPTIMAL); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { memPutInt(struct + VkSubpassResolvePerformanceQueryEXT.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkSubpassResolvePerformanceQueryEXT.PNEXT, value); }

    // -----------------------------------

    /** An array of {@link VkSubpassResolvePerformanceQueryEXT} structs. */
    public static class Buffer extends StructBuffer<VkSubpassResolvePerformanceQueryEXT, Buffer> implements NativeResource {

        private static final VkSubpassResolvePerformanceQueryEXT ELEMENT_FACTORY = VkSubpassResolvePerformanceQueryEXT.create(-1L);

        /**
         * Creates a new {@code VkSubpassResolvePerformanceQueryEXT.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkSubpassResolvePerformanceQueryEXT#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkSubpassResolvePerformanceQueryEXT getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkSubpassResolvePerformanceQueryEXT.nsType(address()); }
        /** @return the value of the {@code pNext} field. */
        @NativeType("void *")
        public long pNext() { return VkSubpassResolvePerformanceQueryEXT.npNext(address()); }
        /** @return the value of the {@code optimal} field. */
        @NativeType("VkBool32")
        public boolean optimal() { return VkSubpassResolvePerformanceQueryEXT.noptimal(address()) != 0; }

        /** Sets the specified value to the {@code sType} field. */
        public VkSubpassResolvePerformanceQueryEXT.Buffer sType(@NativeType("VkStructureType") int value) { VkSubpassResolvePerformanceQueryEXT.nsType(address(), value); return this; }
        /** Sets the {@link EXTMultisampledRenderToSingleSampled#VK_STRUCTURE_TYPE_SUBPASS_RESOLVE_PERFORMANCE_QUERY_EXT STRUCTURE_TYPE_SUBPASS_RESOLVE_PERFORMANCE_QUERY_EXT} value to the {@code sType} field. */
        public VkSubpassResolvePerformanceQueryEXT.Buffer sType$Default() { return sType(EXTMultisampledRenderToSingleSampled.VK_STRUCTURE_TYPE_SUBPASS_RESOLVE_PERFORMANCE_QUERY_EXT); }
        /** Sets the specified value to the {@code pNext} field. */
        public VkSubpassResolvePerformanceQueryEXT.Buffer pNext(@NativeType("void *") long value) { VkSubpassResolvePerformanceQueryEXT.npNext(address(), value); return this; }

    }

}