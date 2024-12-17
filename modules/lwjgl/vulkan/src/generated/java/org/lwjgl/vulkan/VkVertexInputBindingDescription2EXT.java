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
 * struct VkVertexInputBindingDescription2EXT {
 *     VkStructureType sType;
 *     void * pNext;
 *     uint32_t binding;
 *     uint32_t stride;
 *     VkVertexInputRate inputRate;
 *     uint32_t divisor;
 * }}</pre>
 */
public class VkVertexInputBindingDescription2EXT extends Struct<VkVertexInputBindingDescription2EXT> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        BINDING,
        STRIDE,
        INPUTRATE,
        DIVISOR;

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
        BINDING = layout.offsetof(2);
        STRIDE = layout.offsetof(3);
        INPUTRATE = layout.offsetof(4);
        DIVISOR = layout.offsetof(5);
    }

    protected VkVertexInputBindingDescription2EXT(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkVertexInputBindingDescription2EXT create(long address, @Nullable ByteBuffer container) {
        return new VkVertexInputBindingDescription2EXT(address, container);
    }

    /**
     * Creates a {@code VkVertexInputBindingDescription2EXT} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkVertexInputBindingDescription2EXT(ByteBuffer container) {
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
    /** @return the value of the {@code binding} field. */
    @NativeType("uint32_t")
    public int binding() { return nbinding(address()); }
    /** @return the value of the {@code stride} field. */
    @NativeType("uint32_t")
    public int stride() { return nstride(address()); }
    /** @return the value of the {@code inputRate} field. */
    @NativeType("VkVertexInputRate")
    public int inputRate() { return ninputRate(address()); }
    /** @return the value of the {@code divisor} field. */
    @NativeType("uint32_t")
    public int divisor() { return ndivisor(address()); }

    /** Sets the specified value to the {@code sType} field. */
    public VkVertexInputBindingDescription2EXT sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link EXTShaderObject#VK_STRUCTURE_TYPE_VERTEX_INPUT_BINDING_DESCRIPTION_2_EXT STRUCTURE_TYPE_VERTEX_INPUT_BINDING_DESCRIPTION_2_EXT} value to the {@code sType} field. */
    public VkVertexInputBindingDescription2EXT sType$Default() { return sType(EXTShaderObject.VK_STRUCTURE_TYPE_VERTEX_INPUT_BINDING_DESCRIPTION_2_EXT); }
    /** Sets the specified value to the {@code pNext} field. */
    public VkVertexInputBindingDescription2EXT pNext(@NativeType("void *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@code binding} field. */
    public VkVertexInputBindingDescription2EXT binding(@NativeType("uint32_t") int value) { nbinding(address(), value); return this; }
    /** Sets the specified value to the {@code stride} field. */
    public VkVertexInputBindingDescription2EXT stride(@NativeType("uint32_t") int value) { nstride(address(), value); return this; }
    /** Sets the specified value to the {@code inputRate} field. */
    public VkVertexInputBindingDescription2EXT inputRate(@NativeType("VkVertexInputRate") int value) { ninputRate(address(), value); return this; }
    /** Sets the specified value to the {@code divisor} field. */
    public VkVertexInputBindingDescription2EXT divisor(@NativeType("uint32_t") int value) { ndivisor(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkVertexInputBindingDescription2EXT set(
        int sType,
        long pNext,
        int binding,
        int stride,
        int inputRate,
        int divisor
    ) {
        sType(sType);
        pNext(pNext);
        binding(binding);
        stride(stride);
        inputRate(inputRate);
        divisor(divisor);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkVertexInputBindingDescription2EXT set(VkVertexInputBindingDescription2EXT src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkVertexInputBindingDescription2EXT} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkVertexInputBindingDescription2EXT malloc() {
        return new VkVertexInputBindingDescription2EXT(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkVertexInputBindingDescription2EXT} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkVertexInputBindingDescription2EXT calloc() {
        return new VkVertexInputBindingDescription2EXT(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkVertexInputBindingDescription2EXT} instance allocated with {@link BufferUtils}. */
    public static VkVertexInputBindingDescription2EXT create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkVertexInputBindingDescription2EXT(memAddress(container), container);
    }

    /** Returns a new {@code VkVertexInputBindingDescription2EXT} instance for the specified memory address. */
    public static VkVertexInputBindingDescription2EXT create(long address) {
        return new VkVertexInputBindingDescription2EXT(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable VkVertexInputBindingDescription2EXT createSafe(long address) {
        return address == NULL ? null : new VkVertexInputBindingDescription2EXT(address, null);
    }

    /**
     * Returns a new {@link VkVertexInputBindingDescription2EXT.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkVertexInputBindingDescription2EXT.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkVertexInputBindingDescription2EXT.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkVertexInputBindingDescription2EXT.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkVertexInputBindingDescription2EXT.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkVertexInputBindingDescription2EXT.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkVertexInputBindingDescription2EXT.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkVertexInputBindingDescription2EXT.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static VkVertexInputBindingDescription2EXT.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code VkVertexInputBindingDescription2EXT} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkVertexInputBindingDescription2EXT malloc(MemoryStack stack) {
        return new VkVertexInputBindingDescription2EXT(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkVertexInputBindingDescription2EXT} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkVertexInputBindingDescription2EXT calloc(MemoryStack stack) {
        return new VkVertexInputBindingDescription2EXT(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkVertexInputBindingDescription2EXT.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkVertexInputBindingDescription2EXT.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkVertexInputBindingDescription2EXT.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkVertexInputBindingDescription2EXT.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return memGetInt(struct + VkVertexInputBindingDescription2EXT.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkVertexInputBindingDescription2EXT.PNEXT); }
    /** Unsafe version of {@link #binding}. */
    public static int nbinding(long struct) { return memGetInt(struct + VkVertexInputBindingDescription2EXT.BINDING); }
    /** Unsafe version of {@link #stride}. */
    public static int nstride(long struct) { return memGetInt(struct + VkVertexInputBindingDescription2EXT.STRIDE); }
    /** Unsafe version of {@link #inputRate}. */
    public static int ninputRate(long struct) { return memGetInt(struct + VkVertexInputBindingDescription2EXT.INPUTRATE); }
    /** Unsafe version of {@link #divisor}. */
    public static int ndivisor(long struct) { return memGetInt(struct + VkVertexInputBindingDescription2EXT.DIVISOR); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { memPutInt(struct + VkVertexInputBindingDescription2EXT.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkVertexInputBindingDescription2EXT.PNEXT, value); }
    /** Unsafe version of {@link #binding(int) binding}. */
    public static void nbinding(long struct, int value) { memPutInt(struct + VkVertexInputBindingDescription2EXT.BINDING, value); }
    /** Unsafe version of {@link #stride(int) stride}. */
    public static void nstride(long struct, int value) { memPutInt(struct + VkVertexInputBindingDescription2EXT.STRIDE, value); }
    /** Unsafe version of {@link #inputRate(int) inputRate}. */
    public static void ninputRate(long struct, int value) { memPutInt(struct + VkVertexInputBindingDescription2EXT.INPUTRATE, value); }
    /** Unsafe version of {@link #divisor(int) divisor}. */
    public static void ndivisor(long struct, int value) { memPutInt(struct + VkVertexInputBindingDescription2EXT.DIVISOR, value); }

    // -----------------------------------

    /** An array of {@link VkVertexInputBindingDescription2EXT} structs. */
    public static class Buffer extends StructBuffer<VkVertexInputBindingDescription2EXT, Buffer> implements NativeResource {

        private static final VkVertexInputBindingDescription2EXT ELEMENT_FACTORY = VkVertexInputBindingDescription2EXT.create(-1L);

        /**
         * Creates a new {@code VkVertexInputBindingDescription2EXT.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkVertexInputBindingDescription2EXT#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkVertexInputBindingDescription2EXT getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkVertexInputBindingDescription2EXT.nsType(address()); }
        /** @return the value of the {@code pNext} field. */
        @NativeType("void *")
        public long pNext() { return VkVertexInputBindingDescription2EXT.npNext(address()); }
        /** @return the value of the {@code binding} field. */
        @NativeType("uint32_t")
        public int binding() { return VkVertexInputBindingDescription2EXT.nbinding(address()); }
        /** @return the value of the {@code stride} field. */
        @NativeType("uint32_t")
        public int stride() { return VkVertexInputBindingDescription2EXT.nstride(address()); }
        /** @return the value of the {@code inputRate} field. */
        @NativeType("VkVertexInputRate")
        public int inputRate() { return VkVertexInputBindingDescription2EXT.ninputRate(address()); }
        /** @return the value of the {@code divisor} field. */
        @NativeType("uint32_t")
        public int divisor() { return VkVertexInputBindingDescription2EXT.ndivisor(address()); }

        /** Sets the specified value to the {@code sType} field. */
        public VkVertexInputBindingDescription2EXT.Buffer sType(@NativeType("VkStructureType") int value) { VkVertexInputBindingDescription2EXT.nsType(address(), value); return this; }
        /** Sets the {@link EXTShaderObject#VK_STRUCTURE_TYPE_VERTEX_INPUT_BINDING_DESCRIPTION_2_EXT STRUCTURE_TYPE_VERTEX_INPUT_BINDING_DESCRIPTION_2_EXT} value to the {@code sType} field. */
        public VkVertexInputBindingDescription2EXT.Buffer sType$Default() { return sType(EXTShaderObject.VK_STRUCTURE_TYPE_VERTEX_INPUT_BINDING_DESCRIPTION_2_EXT); }
        /** Sets the specified value to the {@code pNext} field. */
        public VkVertexInputBindingDescription2EXT.Buffer pNext(@NativeType("void *") long value) { VkVertexInputBindingDescription2EXT.npNext(address(), value); return this; }
        /** Sets the specified value to the {@code binding} field. */
        public VkVertexInputBindingDescription2EXT.Buffer binding(@NativeType("uint32_t") int value) { VkVertexInputBindingDescription2EXT.nbinding(address(), value); return this; }
        /** Sets the specified value to the {@code stride} field. */
        public VkVertexInputBindingDescription2EXT.Buffer stride(@NativeType("uint32_t") int value) { VkVertexInputBindingDescription2EXT.nstride(address(), value); return this; }
        /** Sets the specified value to the {@code inputRate} field. */
        public VkVertexInputBindingDescription2EXT.Buffer inputRate(@NativeType("VkVertexInputRate") int value) { VkVertexInputBindingDescription2EXT.ninputRate(address(), value); return this; }
        /** Sets the specified value to the {@code divisor} field. */
        public VkVertexInputBindingDescription2EXT.Buffer divisor(@NativeType("uint32_t") int value) { VkVertexInputBindingDescription2EXT.ndivisor(address(), value); return this; }

    }

}