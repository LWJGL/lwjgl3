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
 * struct VkVertexInputAttributeDescription2EXT {
 *     VkStructureType sType;
 *     void * pNext;
 *     uint32_t location;
 *     uint32_t binding;
 *     VkFormat format;
 *     uint32_t offset;
 * }}</pre>
 */
public class VkVertexInputAttributeDescription2EXT extends Struct<VkVertexInputAttributeDescription2EXT> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        LOCATION,
        BINDING,
        FORMAT,
        OFFSET;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(4),
            __member(4),
            __member(4),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        LOCATION = layout.offsetof(2);
        BINDING = layout.offsetof(3);
        FORMAT = layout.offsetof(4);
        OFFSET = layout.offsetof(5);
    }

    protected VkVertexInputAttributeDescription2EXT(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkVertexInputAttributeDescription2EXT create(long address, @Nullable ByteBuffer container) {
        return new VkVertexInputAttributeDescription2EXT(address, container);
    }

    /**
     * Creates a {@code VkVertexInputAttributeDescription2EXT} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkVertexInputAttributeDescription2EXT(ByteBuffer container) {
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
    /** @return the value of the {@code location} field. */
    @NativeType("uint32_t")
    public int location() { return nlocation(address()); }
    /** @return the value of the {@code binding} field. */
    @NativeType("uint32_t")
    public int binding() { return nbinding(address()); }
    /** @return the value of the {@code format} field. */
    @NativeType("VkFormat")
    public int format() { return nformat(address()); }
    /** @return the value of the {@code offset} field. */
    @NativeType("uint32_t")
    public int offset() { return noffset(address()); }

    /** Sets the specified value to the {@code sType} field. */
    public VkVertexInputAttributeDescription2EXT sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link EXTShaderObject#VK_STRUCTURE_TYPE_VERTEX_INPUT_ATTRIBUTE_DESCRIPTION_2_EXT STRUCTURE_TYPE_VERTEX_INPUT_ATTRIBUTE_DESCRIPTION_2_EXT} value to the {@code sType} field. */
    public VkVertexInputAttributeDescription2EXT sType$Default() { return sType(EXTShaderObject.VK_STRUCTURE_TYPE_VERTEX_INPUT_ATTRIBUTE_DESCRIPTION_2_EXT); }
    /** Sets the specified value to the {@code pNext} field. */
    public VkVertexInputAttributeDescription2EXT pNext(@NativeType("void *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@code location} field. */
    public VkVertexInputAttributeDescription2EXT location(@NativeType("uint32_t") int value) { nlocation(address(), value); return this; }
    /** Sets the specified value to the {@code binding} field. */
    public VkVertexInputAttributeDescription2EXT binding(@NativeType("uint32_t") int value) { nbinding(address(), value); return this; }
    /** Sets the specified value to the {@code format} field. */
    public VkVertexInputAttributeDescription2EXT format(@NativeType("VkFormat") int value) { nformat(address(), value); return this; }
    /** Sets the specified value to the {@code offset} field. */
    public VkVertexInputAttributeDescription2EXT offset(@NativeType("uint32_t") int value) { noffset(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkVertexInputAttributeDescription2EXT set(
        int sType,
        long pNext,
        int location,
        int binding,
        int format,
        int offset
    ) {
        sType(sType);
        pNext(pNext);
        location(location);
        binding(binding);
        format(format);
        offset(offset);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkVertexInputAttributeDescription2EXT set(VkVertexInputAttributeDescription2EXT src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkVertexInputAttributeDescription2EXT} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkVertexInputAttributeDescription2EXT malloc() {
        return new VkVertexInputAttributeDescription2EXT(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkVertexInputAttributeDescription2EXT} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkVertexInputAttributeDescription2EXT calloc() {
        return new VkVertexInputAttributeDescription2EXT(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkVertexInputAttributeDescription2EXT} instance allocated with {@link BufferUtils}. */
    public static VkVertexInputAttributeDescription2EXT create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkVertexInputAttributeDescription2EXT(memAddress(container), container);
    }

    /** Returns a new {@code VkVertexInputAttributeDescription2EXT} instance for the specified memory address. */
    public static VkVertexInputAttributeDescription2EXT create(long address) {
        return new VkVertexInputAttributeDescription2EXT(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable VkVertexInputAttributeDescription2EXT createSafe(long address) {
        return address == NULL ? null : new VkVertexInputAttributeDescription2EXT(address, null);
    }

    /**
     * Returns a new {@link VkVertexInputAttributeDescription2EXT.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkVertexInputAttributeDescription2EXT.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkVertexInputAttributeDescription2EXT.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkVertexInputAttributeDescription2EXT.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkVertexInputAttributeDescription2EXT.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkVertexInputAttributeDescription2EXT.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkVertexInputAttributeDescription2EXT.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkVertexInputAttributeDescription2EXT.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static VkVertexInputAttributeDescription2EXT.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code VkVertexInputAttributeDescription2EXT} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkVertexInputAttributeDescription2EXT malloc(MemoryStack stack) {
        return new VkVertexInputAttributeDescription2EXT(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkVertexInputAttributeDescription2EXT} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkVertexInputAttributeDescription2EXT calloc(MemoryStack stack) {
        return new VkVertexInputAttributeDescription2EXT(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkVertexInputAttributeDescription2EXT.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkVertexInputAttributeDescription2EXT.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkVertexInputAttributeDescription2EXT.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkVertexInputAttributeDescription2EXT.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return memGetInt(struct + VkVertexInputAttributeDescription2EXT.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkVertexInputAttributeDescription2EXT.PNEXT); }
    /** Unsafe version of {@link #location}. */
    public static int nlocation(long struct) { return memGetInt(struct + VkVertexInputAttributeDescription2EXT.LOCATION); }
    /** Unsafe version of {@link #binding}. */
    public static int nbinding(long struct) { return memGetInt(struct + VkVertexInputAttributeDescription2EXT.BINDING); }
    /** Unsafe version of {@link #format}. */
    public static int nformat(long struct) { return memGetInt(struct + VkVertexInputAttributeDescription2EXT.FORMAT); }
    /** Unsafe version of {@link #offset}. */
    public static int noffset(long struct) { return memGetInt(struct + VkVertexInputAttributeDescription2EXT.OFFSET); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { memPutInt(struct + VkVertexInputAttributeDescription2EXT.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkVertexInputAttributeDescription2EXT.PNEXT, value); }
    /** Unsafe version of {@link #location(int) location}. */
    public static void nlocation(long struct, int value) { memPutInt(struct + VkVertexInputAttributeDescription2EXT.LOCATION, value); }
    /** Unsafe version of {@link #binding(int) binding}. */
    public static void nbinding(long struct, int value) { memPutInt(struct + VkVertexInputAttributeDescription2EXT.BINDING, value); }
    /** Unsafe version of {@link #format(int) format}. */
    public static void nformat(long struct, int value) { memPutInt(struct + VkVertexInputAttributeDescription2EXT.FORMAT, value); }
    /** Unsafe version of {@link #offset(int) offset}. */
    public static void noffset(long struct, int value) { memPutInt(struct + VkVertexInputAttributeDescription2EXT.OFFSET, value); }

    // -----------------------------------

    /** An array of {@link VkVertexInputAttributeDescription2EXT} structs. */
    public static class Buffer extends StructBuffer<VkVertexInputAttributeDescription2EXT, Buffer> implements NativeResource {

        private static final VkVertexInputAttributeDescription2EXT ELEMENT_FACTORY = VkVertexInputAttributeDescription2EXT.create(-1L);

        /**
         * Creates a new {@code VkVertexInputAttributeDescription2EXT.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkVertexInputAttributeDescription2EXT#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkVertexInputAttributeDescription2EXT getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkVertexInputAttributeDescription2EXT.nsType(address()); }
        /** @return the value of the {@code pNext} field. */
        @NativeType("void *")
        public long pNext() { return VkVertexInputAttributeDescription2EXT.npNext(address()); }
        /** @return the value of the {@code location} field. */
        @NativeType("uint32_t")
        public int location() { return VkVertexInputAttributeDescription2EXT.nlocation(address()); }
        /** @return the value of the {@code binding} field. */
        @NativeType("uint32_t")
        public int binding() { return VkVertexInputAttributeDescription2EXT.nbinding(address()); }
        /** @return the value of the {@code format} field. */
        @NativeType("VkFormat")
        public int format() { return VkVertexInputAttributeDescription2EXT.nformat(address()); }
        /** @return the value of the {@code offset} field. */
        @NativeType("uint32_t")
        public int offset() { return VkVertexInputAttributeDescription2EXT.noffset(address()); }

        /** Sets the specified value to the {@code sType} field. */
        public VkVertexInputAttributeDescription2EXT.Buffer sType(@NativeType("VkStructureType") int value) { VkVertexInputAttributeDescription2EXT.nsType(address(), value); return this; }
        /** Sets the {@link EXTShaderObject#VK_STRUCTURE_TYPE_VERTEX_INPUT_ATTRIBUTE_DESCRIPTION_2_EXT STRUCTURE_TYPE_VERTEX_INPUT_ATTRIBUTE_DESCRIPTION_2_EXT} value to the {@code sType} field. */
        public VkVertexInputAttributeDescription2EXT.Buffer sType$Default() { return sType(EXTShaderObject.VK_STRUCTURE_TYPE_VERTEX_INPUT_ATTRIBUTE_DESCRIPTION_2_EXT); }
        /** Sets the specified value to the {@code pNext} field. */
        public VkVertexInputAttributeDescription2EXT.Buffer pNext(@NativeType("void *") long value) { VkVertexInputAttributeDescription2EXT.npNext(address(), value); return this; }
        /** Sets the specified value to the {@code location} field. */
        public VkVertexInputAttributeDescription2EXT.Buffer location(@NativeType("uint32_t") int value) { VkVertexInputAttributeDescription2EXT.nlocation(address(), value); return this; }
        /** Sets the specified value to the {@code binding} field. */
        public VkVertexInputAttributeDescription2EXT.Buffer binding(@NativeType("uint32_t") int value) { VkVertexInputAttributeDescription2EXT.nbinding(address(), value); return this; }
        /** Sets the specified value to the {@code format} field. */
        public VkVertexInputAttributeDescription2EXT.Buffer format(@NativeType("VkFormat") int value) { VkVertexInputAttributeDescription2EXT.nformat(address(), value); return this; }
        /** Sets the specified value to the {@code offset} field. */
        public VkVertexInputAttributeDescription2EXT.Buffer offset(@NativeType("uint32_t") int value) { VkVertexInputAttributeDescription2EXT.noffset(address(), value); return this; }

    }

}