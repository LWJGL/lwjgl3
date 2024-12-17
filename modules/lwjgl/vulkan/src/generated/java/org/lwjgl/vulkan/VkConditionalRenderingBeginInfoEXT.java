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
 * struct VkConditionalRenderingBeginInfoEXT {
 *     VkStructureType sType;
 *     void const * pNext;
 *     VkBuffer buffer;
 *     VkDeviceSize offset;
 *     VkConditionalRenderingFlagsEXT flags;
 * }}</pre>
 */
public class VkConditionalRenderingBeginInfoEXT extends Struct<VkConditionalRenderingBeginInfoEXT> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        BUFFER,
        OFFSET,
        FLAGS;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(8),
            __member(8),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        BUFFER = layout.offsetof(2);
        OFFSET = layout.offsetof(3);
        FLAGS = layout.offsetof(4);
    }

    protected VkConditionalRenderingBeginInfoEXT(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkConditionalRenderingBeginInfoEXT create(long address, @Nullable ByteBuffer container) {
        return new VkConditionalRenderingBeginInfoEXT(address, container);
    }

    /**
     * Creates a {@code VkConditionalRenderingBeginInfoEXT} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkConditionalRenderingBeginInfoEXT(ByteBuffer container) {
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
    /** @return the value of the {@code buffer} field. */
    @NativeType("VkBuffer")
    public long buffer() { return nbuffer(address()); }
    /** @return the value of the {@code offset} field. */
    @NativeType("VkDeviceSize")
    public long offset() { return noffset(address()); }
    /** @return the value of the {@code flags} field. */
    @NativeType("VkConditionalRenderingFlagsEXT")
    public int flags() { return nflags(address()); }

    /** Sets the specified value to the {@code sType} field. */
    public VkConditionalRenderingBeginInfoEXT sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link EXTConditionalRendering#VK_STRUCTURE_TYPE_CONDITIONAL_RENDERING_BEGIN_INFO_EXT STRUCTURE_TYPE_CONDITIONAL_RENDERING_BEGIN_INFO_EXT} value to the {@code sType} field. */
    public VkConditionalRenderingBeginInfoEXT sType$Default() { return sType(EXTConditionalRendering.VK_STRUCTURE_TYPE_CONDITIONAL_RENDERING_BEGIN_INFO_EXT); }
    /** Sets the specified value to the {@code pNext} field. */
    public VkConditionalRenderingBeginInfoEXT pNext(@NativeType("void const *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@code buffer} field. */
    public VkConditionalRenderingBeginInfoEXT buffer(@NativeType("VkBuffer") long value) { nbuffer(address(), value); return this; }
    /** Sets the specified value to the {@code offset} field. */
    public VkConditionalRenderingBeginInfoEXT offset(@NativeType("VkDeviceSize") long value) { noffset(address(), value); return this; }
    /** Sets the specified value to the {@code flags} field. */
    public VkConditionalRenderingBeginInfoEXT flags(@NativeType("VkConditionalRenderingFlagsEXT") int value) { nflags(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkConditionalRenderingBeginInfoEXT set(
        int sType,
        long pNext,
        long buffer,
        long offset,
        int flags
    ) {
        sType(sType);
        pNext(pNext);
        buffer(buffer);
        offset(offset);
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
    public VkConditionalRenderingBeginInfoEXT set(VkConditionalRenderingBeginInfoEXT src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkConditionalRenderingBeginInfoEXT} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkConditionalRenderingBeginInfoEXT malloc() {
        return new VkConditionalRenderingBeginInfoEXT(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkConditionalRenderingBeginInfoEXT} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkConditionalRenderingBeginInfoEXT calloc() {
        return new VkConditionalRenderingBeginInfoEXT(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkConditionalRenderingBeginInfoEXT} instance allocated with {@link BufferUtils}. */
    public static VkConditionalRenderingBeginInfoEXT create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkConditionalRenderingBeginInfoEXT(memAddress(container), container);
    }

    /** Returns a new {@code VkConditionalRenderingBeginInfoEXT} instance for the specified memory address. */
    public static VkConditionalRenderingBeginInfoEXT create(long address) {
        return new VkConditionalRenderingBeginInfoEXT(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable VkConditionalRenderingBeginInfoEXT createSafe(long address) {
        return address == NULL ? null : new VkConditionalRenderingBeginInfoEXT(address, null);
    }

    /**
     * Returns a new {@link VkConditionalRenderingBeginInfoEXT.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkConditionalRenderingBeginInfoEXT.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkConditionalRenderingBeginInfoEXT.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkConditionalRenderingBeginInfoEXT.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkConditionalRenderingBeginInfoEXT.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkConditionalRenderingBeginInfoEXT.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkConditionalRenderingBeginInfoEXT.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkConditionalRenderingBeginInfoEXT.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static VkConditionalRenderingBeginInfoEXT.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    // -----------------------------------

    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static VkConditionalRenderingBeginInfoEXT mallocStack() { return malloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static VkConditionalRenderingBeginInfoEXT callocStack() { return calloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static VkConditionalRenderingBeginInfoEXT mallocStack(MemoryStack stack) { return malloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static VkConditionalRenderingBeginInfoEXT callocStack(MemoryStack stack) { return calloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static VkConditionalRenderingBeginInfoEXT.Buffer mallocStack(int capacity) { return malloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static VkConditionalRenderingBeginInfoEXT.Buffer callocStack(int capacity) { return calloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static VkConditionalRenderingBeginInfoEXT.Buffer mallocStack(int capacity, MemoryStack stack) { return malloc(capacity, stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static VkConditionalRenderingBeginInfoEXT.Buffer callocStack(int capacity, MemoryStack stack) { return calloc(capacity, stack); }

    /**
     * Returns a new {@code VkConditionalRenderingBeginInfoEXT} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkConditionalRenderingBeginInfoEXT malloc(MemoryStack stack) {
        return new VkConditionalRenderingBeginInfoEXT(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkConditionalRenderingBeginInfoEXT} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkConditionalRenderingBeginInfoEXT calloc(MemoryStack stack) {
        return new VkConditionalRenderingBeginInfoEXT(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkConditionalRenderingBeginInfoEXT.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkConditionalRenderingBeginInfoEXT.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkConditionalRenderingBeginInfoEXT.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkConditionalRenderingBeginInfoEXT.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return memGetInt(struct + VkConditionalRenderingBeginInfoEXT.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkConditionalRenderingBeginInfoEXT.PNEXT); }
    /** Unsafe version of {@link #buffer}. */
    public static long nbuffer(long struct) { return memGetLong(struct + VkConditionalRenderingBeginInfoEXT.BUFFER); }
    /** Unsafe version of {@link #offset}. */
    public static long noffset(long struct) { return memGetLong(struct + VkConditionalRenderingBeginInfoEXT.OFFSET); }
    /** Unsafe version of {@link #flags}. */
    public static int nflags(long struct) { return memGetInt(struct + VkConditionalRenderingBeginInfoEXT.FLAGS); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { memPutInt(struct + VkConditionalRenderingBeginInfoEXT.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkConditionalRenderingBeginInfoEXT.PNEXT, value); }
    /** Unsafe version of {@link #buffer(long) buffer}. */
    public static void nbuffer(long struct, long value) { memPutLong(struct + VkConditionalRenderingBeginInfoEXT.BUFFER, value); }
    /** Unsafe version of {@link #offset(long) offset}. */
    public static void noffset(long struct, long value) { memPutLong(struct + VkConditionalRenderingBeginInfoEXT.OFFSET, value); }
    /** Unsafe version of {@link #flags(int) flags}. */
    public static void nflags(long struct, int value) { memPutInt(struct + VkConditionalRenderingBeginInfoEXT.FLAGS, value); }

    // -----------------------------------

    /** An array of {@link VkConditionalRenderingBeginInfoEXT} structs. */
    public static class Buffer extends StructBuffer<VkConditionalRenderingBeginInfoEXT, Buffer> implements NativeResource {

        private static final VkConditionalRenderingBeginInfoEXT ELEMENT_FACTORY = VkConditionalRenderingBeginInfoEXT.create(-1L);

        /**
         * Creates a new {@code VkConditionalRenderingBeginInfoEXT.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkConditionalRenderingBeginInfoEXT#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkConditionalRenderingBeginInfoEXT getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkConditionalRenderingBeginInfoEXT.nsType(address()); }
        /** @return the value of the {@code pNext} field. */
        @NativeType("void const *")
        public long pNext() { return VkConditionalRenderingBeginInfoEXT.npNext(address()); }
        /** @return the value of the {@code buffer} field. */
        @NativeType("VkBuffer")
        public long buffer() { return VkConditionalRenderingBeginInfoEXT.nbuffer(address()); }
        /** @return the value of the {@code offset} field. */
        @NativeType("VkDeviceSize")
        public long offset() { return VkConditionalRenderingBeginInfoEXT.noffset(address()); }
        /** @return the value of the {@code flags} field. */
        @NativeType("VkConditionalRenderingFlagsEXT")
        public int flags() { return VkConditionalRenderingBeginInfoEXT.nflags(address()); }

        /** Sets the specified value to the {@code sType} field. */
        public VkConditionalRenderingBeginInfoEXT.Buffer sType(@NativeType("VkStructureType") int value) { VkConditionalRenderingBeginInfoEXT.nsType(address(), value); return this; }
        /** Sets the {@link EXTConditionalRendering#VK_STRUCTURE_TYPE_CONDITIONAL_RENDERING_BEGIN_INFO_EXT STRUCTURE_TYPE_CONDITIONAL_RENDERING_BEGIN_INFO_EXT} value to the {@code sType} field. */
        public VkConditionalRenderingBeginInfoEXT.Buffer sType$Default() { return sType(EXTConditionalRendering.VK_STRUCTURE_TYPE_CONDITIONAL_RENDERING_BEGIN_INFO_EXT); }
        /** Sets the specified value to the {@code pNext} field. */
        public VkConditionalRenderingBeginInfoEXT.Buffer pNext(@NativeType("void const *") long value) { VkConditionalRenderingBeginInfoEXT.npNext(address(), value); return this; }
        /** Sets the specified value to the {@code buffer} field. */
        public VkConditionalRenderingBeginInfoEXT.Buffer buffer(@NativeType("VkBuffer") long value) { VkConditionalRenderingBeginInfoEXT.nbuffer(address(), value); return this; }
        /** Sets the specified value to the {@code offset} field. */
        public VkConditionalRenderingBeginInfoEXT.Buffer offset(@NativeType("VkDeviceSize") long value) { VkConditionalRenderingBeginInfoEXT.noffset(address(), value); return this; }
        /** Sets the specified value to the {@code flags} field. */
        public VkConditionalRenderingBeginInfoEXT.Buffer flags(@NativeType("VkConditionalRenderingFlagsEXT") int value) { VkConditionalRenderingBeginInfoEXT.nflags(address(), value); return this; }

    }

}