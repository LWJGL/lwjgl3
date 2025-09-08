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
 * <pre><code>
 * struct VkPipelineDiscardRectangleStateCreateInfoEXT {
 *     VkStructureType sType;
 *     void const * pNext;
 *     VkPipelineDiscardRectangleStateCreateFlagsEXT flags;
 *     VkDiscardRectangleModeEXT discardRectangleMode;
 *     uint32_t discardRectangleCount;
 *     {@link VkRect2D VkRect2D} const * pDiscardRectangles;
 * }</code></pre>
 */
public class VkPipelineDiscardRectangleStateCreateInfoEXT extends Struct<VkPipelineDiscardRectangleStateCreateInfoEXT> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        FLAGS,
        DISCARDRECTANGLEMODE,
        DISCARDRECTANGLECOUNT,
        PDISCARDRECTANGLES;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(4),
            __member(4),
            __member(4),
            __member(POINTER_SIZE)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        FLAGS = layout.offsetof(2);
        DISCARDRECTANGLEMODE = layout.offsetof(3);
        DISCARDRECTANGLECOUNT = layout.offsetof(4);
        PDISCARDRECTANGLES = layout.offsetof(5);
    }

    protected VkPipelineDiscardRectangleStateCreateInfoEXT(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkPipelineDiscardRectangleStateCreateInfoEXT create(long address, @Nullable ByteBuffer container) {
        return new VkPipelineDiscardRectangleStateCreateInfoEXT(address, container);
    }

    /**
     * Creates a {@code VkPipelineDiscardRectangleStateCreateInfoEXT} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkPipelineDiscardRectangleStateCreateInfoEXT(ByteBuffer container) {
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
    /** @return the value of the {@code flags} field. */
    @NativeType("VkPipelineDiscardRectangleStateCreateFlagsEXT")
    public int flags() { return nflags(address()); }
    /** @return the value of the {@code discardRectangleMode} field. */
    @NativeType("VkDiscardRectangleModeEXT")
    public int discardRectangleMode() { return ndiscardRectangleMode(address()); }
    /** @return the value of the {@code discardRectangleCount} field. */
    @NativeType("uint32_t")
    public int discardRectangleCount() { return ndiscardRectangleCount(address()); }
    /** @return a {@link VkRect2D.Buffer} view of the struct array pointed to by the {@code pDiscardRectangles} field. */
    @NativeType("VkRect2D const *")
    public VkRect2D.@Nullable Buffer pDiscardRectangles() { return npDiscardRectangles(address()); }

    /** Sets the specified value to the {@code sType} field. */
    public VkPipelineDiscardRectangleStateCreateInfoEXT sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link EXTDiscardRectangles#VK_STRUCTURE_TYPE_PIPELINE_DISCARD_RECTANGLE_STATE_CREATE_INFO_EXT STRUCTURE_TYPE_PIPELINE_DISCARD_RECTANGLE_STATE_CREATE_INFO_EXT} value to the {@code sType} field. */
    public VkPipelineDiscardRectangleStateCreateInfoEXT sType$Default() { return sType(EXTDiscardRectangles.VK_STRUCTURE_TYPE_PIPELINE_DISCARD_RECTANGLE_STATE_CREATE_INFO_EXT); }
    /** Sets the specified value to the {@code pNext} field. */
    public VkPipelineDiscardRectangleStateCreateInfoEXT pNext(@NativeType("void const *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@code flags} field. */
    public VkPipelineDiscardRectangleStateCreateInfoEXT flags(@NativeType("VkPipelineDiscardRectangleStateCreateFlagsEXT") int value) { nflags(address(), value); return this; }
    /** Sets the specified value to the {@code discardRectangleMode} field. */
    public VkPipelineDiscardRectangleStateCreateInfoEXT discardRectangleMode(@NativeType("VkDiscardRectangleModeEXT") int value) { ndiscardRectangleMode(address(), value); return this; }
    /** Sets the specified value to the {@code discardRectangleCount} field. */
    public VkPipelineDiscardRectangleStateCreateInfoEXT discardRectangleCount(@NativeType("uint32_t") int value) { ndiscardRectangleCount(address(), value); return this; }
    /** Sets the address of the specified {@link VkRect2D.Buffer} to the {@code pDiscardRectangles} field. */
    public VkPipelineDiscardRectangleStateCreateInfoEXT pDiscardRectangles(@NativeType("VkRect2D const *") VkRect2D.@Nullable Buffer value) { npDiscardRectangles(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkPipelineDiscardRectangleStateCreateInfoEXT set(
        int sType,
        long pNext,
        int flags,
        int discardRectangleMode,
        int discardRectangleCount,
        VkRect2D.@Nullable Buffer pDiscardRectangles
    ) {
        sType(sType);
        pNext(pNext);
        flags(flags);
        discardRectangleMode(discardRectangleMode);
        discardRectangleCount(discardRectangleCount);
        pDiscardRectangles(pDiscardRectangles);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkPipelineDiscardRectangleStateCreateInfoEXT set(VkPipelineDiscardRectangleStateCreateInfoEXT src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkPipelineDiscardRectangleStateCreateInfoEXT} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkPipelineDiscardRectangleStateCreateInfoEXT malloc() {
        return new VkPipelineDiscardRectangleStateCreateInfoEXT(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkPipelineDiscardRectangleStateCreateInfoEXT} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkPipelineDiscardRectangleStateCreateInfoEXT calloc() {
        return new VkPipelineDiscardRectangleStateCreateInfoEXT(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkPipelineDiscardRectangleStateCreateInfoEXT} instance allocated with {@link BufferUtils}. */
    public static VkPipelineDiscardRectangleStateCreateInfoEXT create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkPipelineDiscardRectangleStateCreateInfoEXT(memAddress(container), container);
    }

    /** Returns a new {@code VkPipelineDiscardRectangleStateCreateInfoEXT} instance for the specified memory address. */
    public static VkPipelineDiscardRectangleStateCreateInfoEXT create(long address) {
        return new VkPipelineDiscardRectangleStateCreateInfoEXT(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable VkPipelineDiscardRectangleStateCreateInfoEXT createSafe(long address) {
        return address == NULL ? null : new VkPipelineDiscardRectangleStateCreateInfoEXT(address, null);
    }

    /**
     * Returns a new {@link VkPipelineDiscardRectangleStateCreateInfoEXT.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPipelineDiscardRectangleStateCreateInfoEXT.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkPipelineDiscardRectangleStateCreateInfoEXT.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPipelineDiscardRectangleStateCreateInfoEXT.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPipelineDiscardRectangleStateCreateInfoEXT.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkPipelineDiscardRectangleStateCreateInfoEXT.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkPipelineDiscardRectangleStateCreateInfoEXT.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkPipelineDiscardRectangleStateCreateInfoEXT.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static VkPipelineDiscardRectangleStateCreateInfoEXT.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    // -----------------------------------

    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static VkPipelineDiscardRectangleStateCreateInfoEXT mallocStack() { return malloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static VkPipelineDiscardRectangleStateCreateInfoEXT callocStack() { return calloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static VkPipelineDiscardRectangleStateCreateInfoEXT mallocStack(MemoryStack stack) { return malloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static VkPipelineDiscardRectangleStateCreateInfoEXT callocStack(MemoryStack stack) { return calloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static VkPipelineDiscardRectangleStateCreateInfoEXT.Buffer mallocStack(int capacity) { return malloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static VkPipelineDiscardRectangleStateCreateInfoEXT.Buffer callocStack(int capacity) { return calloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static VkPipelineDiscardRectangleStateCreateInfoEXT.Buffer mallocStack(int capacity, MemoryStack stack) { return malloc(capacity, stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static VkPipelineDiscardRectangleStateCreateInfoEXT.Buffer callocStack(int capacity, MemoryStack stack) { return calloc(capacity, stack); }

    /**
     * Returns a new {@code VkPipelineDiscardRectangleStateCreateInfoEXT} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPipelineDiscardRectangleStateCreateInfoEXT malloc(MemoryStack stack) {
        return new VkPipelineDiscardRectangleStateCreateInfoEXT(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkPipelineDiscardRectangleStateCreateInfoEXT} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPipelineDiscardRectangleStateCreateInfoEXT calloc(MemoryStack stack) {
        return new VkPipelineDiscardRectangleStateCreateInfoEXT(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkPipelineDiscardRectangleStateCreateInfoEXT.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPipelineDiscardRectangleStateCreateInfoEXT.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPipelineDiscardRectangleStateCreateInfoEXT.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPipelineDiscardRectangleStateCreateInfoEXT.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return memGetInt(struct + VkPipelineDiscardRectangleStateCreateInfoEXT.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkPipelineDiscardRectangleStateCreateInfoEXT.PNEXT); }
    /** Unsafe version of {@link #flags}. */
    public static int nflags(long struct) { return memGetInt(struct + VkPipelineDiscardRectangleStateCreateInfoEXT.FLAGS); }
    /** Unsafe version of {@link #discardRectangleMode}. */
    public static int ndiscardRectangleMode(long struct) { return memGetInt(struct + VkPipelineDiscardRectangleStateCreateInfoEXT.DISCARDRECTANGLEMODE); }
    /** Unsafe version of {@link #discardRectangleCount}. */
    public static int ndiscardRectangleCount(long struct) { return memGetInt(struct + VkPipelineDiscardRectangleStateCreateInfoEXT.DISCARDRECTANGLECOUNT); }
    /** Unsafe version of {@link #pDiscardRectangles}. */
    public static VkRect2D.@Nullable Buffer npDiscardRectangles(long struct) { return VkRect2D.createSafe(memGetAddress(struct + VkPipelineDiscardRectangleStateCreateInfoEXT.PDISCARDRECTANGLES), ndiscardRectangleCount(struct)); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { memPutInt(struct + VkPipelineDiscardRectangleStateCreateInfoEXT.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkPipelineDiscardRectangleStateCreateInfoEXT.PNEXT, value); }
    /** Unsafe version of {@link #flags(int) flags}. */
    public static void nflags(long struct, int value) { memPutInt(struct + VkPipelineDiscardRectangleStateCreateInfoEXT.FLAGS, value); }
    /** Unsafe version of {@link #discardRectangleMode(int) discardRectangleMode}. */
    public static void ndiscardRectangleMode(long struct, int value) { memPutInt(struct + VkPipelineDiscardRectangleStateCreateInfoEXT.DISCARDRECTANGLEMODE, value); }
    /** Sets the specified value to the {@code discardRectangleCount} field of the specified {@code struct}. */
    public static void ndiscardRectangleCount(long struct, int value) { memPutInt(struct + VkPipelineDiscardRectangleStateCreateInfoEXT.DISCARDRECTANGLECOUNT, value); }
    /** Unsafe version of {@link #pDiscardRectangles(VkRect2D.Buffer) pDiscardRectangles}. */
    public static void npDiscardRectangles(long struct, VkRect2D.@Nullable Buffer value) { memPutAddress(struct + VkPipelineDiscardRectangleStateCreateInfoEXT.PDISCARDRECTANGLES, memAddressSafe(value)); if (value != null) { ndiscardRectangleCount(struct, value.remaining()); } }

    // -----------------------------------

    /** An array of {@link VkPipelineDiscardRectangleStateCreateInfoEXT} structs. */
    public static class Buffer extends StructBuffer<VkPipelineDiscardRectangleStateCreateInfoEXT, Buffer> implements NativeResource {

        private static final VkPipelineDiscardRectangleStateCreateInfoEXT ELEMENT_FACTORY = VkPipelineDiscardRectangleStateCreateInfoEXT.create(-1L);

        /**
         * Creates a new {@code VkPipelineDiscardRectangleStateCreateInfoEXT.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkPipelineDiscardRectangleStateCreateInfoEXT#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkPipelineDiscardRectangleStateCreateInfoEXT getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkPipelineDiscardRectangleStateCreateInfoEXT.nsType(address()); }
        /** @return the value of the {@code pNext} field. */
        @NativeType("void const *")
        public long pNext() { return VkPipelineDiscardRectangleStateCreateInfoEXT.npNext(address()); }
        /** @return the value of the {@code flags} field. */
        @NativeType("VkPipelineDiscardRectangleStateCreateFlagsEXT")
        public int flags() { return VkPipelineDiscardRectangleStateCreateInfoEXT.nflags(address()); }
        /** @return the value of the {@code discardRectangleMode} field. */
        @NativeType("VkDiscardRectangleModeEXT")
        public int discardRectangleMode() { return VkPipelineDiscardRectangleStateCreateInfoEXT.ndiscardRectangleMode(address()); }
        /** @return the value of the {@code discardRectangleCount} field. */
        @NativeType("uint32_t")
        public int discardRectangleCount() { return VkPipelineDiscardRectangleStateCreateInfoEXT.ndiscardRectangleCount(address()); }
        /** @return a {@link VkRect2D.Buffer} view of the struct array pointed to by the {@code pDiscardRectangles} field. */
        @NativeType("VkRect2D const *")
        public VkRect2D.@Nullable Buffer pDiscardRectangles() { return VkPipelineDiscardRectangleStateCreateInfoEXT.npDiscardRectangles(address()); }

        /** Sets the specified value to the {@code sType} field. */
        public VkPipelineDiscardRectangleStateCreateInfoEXT.Buffer sType(@NativeType("VkStructureType") int value) { VkPipelineDiscardRectangleStateCreateInfoEXT.nsType(address(), value); return this; }
        /** Sets the {@link EXTDiscardRectangles#VK_STRUCTURE_TYPE_PIPELINE_DISCARD_RECTANGLE_STATE_CREATE_INFO_EXT STRUCTURE_TYPE_PIPELINE_DISCARD_RECTANGLE_STATE_CREATE_INFO_EXT} value to the {@code sType} field. */
        public VkPipelineDiscardRectangleStateCreateInfoEXT.Buffer sType$Default() { return sType(EXTDiscardRectangles.VK_STRUCTURE_TYPE_PIPELINE_DISCARD_RECTANGLE_STATE_CREATE_INFO_EXT); }
        /** Sets the specified value to the {@code pNext} field. */
        public VkPipelineDiscardRectangleStateCreateInfoEXT.Buffer pNext(@NativeType("void const *") long value) { VkPipelineDiscardRectangleStateCreateInfoEXT.npNext(address(), value); return this; }
        /** Sets the specified value to the {@code flags} field. */
        public VkPipelineDiscardRectangleStateCreateInfoEXT.Buffer flags(@NativeType("VkPipelineDiscardRectangleStateCreateFlagsEXT") int value) { VkPipelineDiscardRectangleStateCreateInfoEXT.nflags(address(), value); return this; }
        /** Sets the specified value to the {@code discardRectangleMode} field. */
        public VkPipelineDiscardRectangleStateCreateInfoEXT.Buffer discardRectangleMode(@NativeType("VkDiscardRectangleModeEXT") int value) { VkPipelineDiscardRectangleStateCreateInfoEXT.ndiscardRectangleMode(address(), value); return this; }
        /** Sets the specified value to the {@code discardRectangleCount} field. */
        public VkPipelineDiscardRectangleStateCreateInfoEXT.Buffer discardRectangleCount(@NativeType("uint32_t") int value) { VkPipelineDiscardRectangleStateCreateInfoEXT.ndiscardRectangleCount(address(), value); return this; }
        /** Sets the address of the specified {@link VkRect2D.Buffer} to the {@code pDiscardRectangles} field. */
        public VkPipelineDiscardRectangleStateCreateInfoEXT.Buffer pDiscardRectangles(@NativeType("VkRect2D const *") VkRect2D.@Nullable Buffer value) { VkPipelineDiscardRectangleStateCreateInfoEXT.npDiscardRectangles(address(), value); return this; }

    }

}