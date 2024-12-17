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
 * struct VkDepthBiasInfoEXT {
 *     VkStructureType sType;
 *     void const * pNext;
 *     float depthBiasConstantFactor;
 *     float depthBiasClamp;
 *     float depthBiasSlopeFactor;
 * }}</pre>
 */
public class VkDepthBiasInfoEXT extends Struct<VkDepthBiasInfoEXT> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        DEPTHBIASCONSTANTFACTOR,
        DEPTHBIASCLAMP,
        DEPTHBIASSLOPEFACTOR;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(4),
            __member(4),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        DEPTHBIASCONSTANTFACTOR = layout.offsetof(2);
        DEPTHBIASCLAMP = layout.offsetof(3);
        DEPTHBIASSLOPEFACTOR = layout.offsetof(4);
    }

    protected VkDepthBiasInfoEXT(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkDepthBiasInfoEXT create(long address, @Nullable ByteBuffer container) {
        return new VkDepthBiasInfoEXT(address, container);
    }

    /**
     * Creates a {@code VkDepthBiasInfoEXT} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkDepthBiasInfoEXT(ByteBuffer container) {
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
    /** @return the value of the {@code depthBiasConstantFactor} field. */
    public float depthBiasConstantFactor() { return ndepthBiasConstantFactor(address()); }
    /** @return the value of the {@code depthBiasClamp} field. */
    public float depthBiasClamp() { return ndepthBiasClamp(address()); }
    /** @return the value of the {@code depthBiasSlopeFactor} field. */
    public float depthBiasSlopeFactor() { return ndepthBiasSlopeFactor(address()); }

    /** Sets the specified value to the {@code sType} field. */
    public VkDepthBiasInfoEXT sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link EXTDepthBiasControl#VK_STRUCTURE_TYPE_DEPTH_BIAS_INFO_EXT STRUCTURE_TYPE_DEPTH_BIAS_INFO_EXT} value to the {@code sType} field. */
    public VkDepthBiasInfoEXT sType$Default() { return sType(EXTDepthBiasControl.VK_STRUCTURE_TYPE_DEPTH_BIAS_INFO_EXT); }
    /** Sets the specified value to the {@code pNext} field. */
    public VkDepthBiasInfoEXT pNext(@NativeType("void const *") long value) { npNext(address(), value); return this; }
    /** Prepends the specified {@link VkDepthBiasRepresentationInfoEXT} value to the {@code pNext} chain. */
    public VkDepthBiasInfoEXT pNext(VkDepthBiasRepresentationInfoEXT value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Sets the specified value to the {@code depthBiasConstantFactor} field. */
    public VkDepthBiasInfoEXT depthBiasConstantFactor(float value) { ndepthBiasConstantFactor(address(), value); return this; }
    /** Sets the specified value to the {@code depthBiasClamp} field. */
    public VkDepthBiasInfoEXT depthBiasClamp(float value) { ndepthBiasClamp(address(), value); return this; }
    /** Sets the specified value to the {@code depthBiasSlopeFactor} field. */
    public VkDepthBiasInfoEXT depthBiasSlopeFactor(float value) { ndepthBiasSlopeFactor(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkDepthBiasInfoEXT set(
        int sType,
        long pNext,
        float depthBiasConstantFactor,
        float depthBiasClamp,
        float depthBiasSlopeFactor
    ) {
        sType(sType);
        pNext(pNext);
        depthBiasConstantFactor(depthBiasConstantFactor);
        depthBiasClamp(depthBiasClamp);
        depthBiasSlopeFactor(depthBiasSlopeFactor);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkDepthBiasInfoEXT set(VkDepthBiasInfoEXT src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkDepthBiasInfoEXT} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkDepthBiasInfoEXT malloc() {
        return new VkDepthBiasInfoEXT(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkDepthBiasInfoEXT} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkDepthBiasInfoEXT calloc() {
        return new VkDepthBiasInfoEXT(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkDepthBiasInfoEXT} instance allocated with {@link BufferUtils}. */
    public static VkDepthBiasInfoEXT create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkDepthBiasInfoEXT(memAddress(container), container);
    }

    /** Returns a new {@code VkDepthBiasInfoEXT} instance for the specified memory address. */
    public static VkDepthBiasInfoEXT create(long address) {
        return new VkDepthBiasInfoEXT(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable VkDepthBiasInfoEXT createSafe(long address) {
        return address == NULL ? null : new VkDepthBiasInfoEXT(address, null);
    }

    /**
     * Returns a new {@link VkDepthBiasInfoEXT.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkDepthBiasInfoEXT.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkDepthBiasInfoEXT.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkDepthBiasInfoEXT.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkDepthBiasInfoEXT.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkDepthBiasInfoEXT.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkDepthBiasInfoEXT.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkDepthBiasInfoEXT.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static VkDepthBiasInfoEXT.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code VkDepthBiasInfoEXT} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkDepthBiasInfoEXT malloc(MemoryStack stack) {
        return new VkDepthBiasInfoEXT(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkDepthBiasInfoEXT} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkDepthBiasInfoEXT calloc(MemoryStack stack) {
        return new VkDepthBiasInfoEXT(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkDepthBiasInfoEXT.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkDepthBiasInfoEXT.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkDepthBiasInfoEXT.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkDepthBiasInfoEXT.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return memGetInt(struct + VkDepthBiasInfoEXT.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkDepthBiasInfoEXT.PNEXT); }
    /** Unsafe version of {@link #depthBiasConstantFactor}. */
    public static float ndepthBiasConstantFactor(long struct) { return memGetFloat(struct + VkDepthBiasInfoEXT.DEPTHBIASCONSTANTFACTOR); }
    /** Unsafe version of {@link #depthBiasClamp}. */
    public static float ndepthBiasClamp(long struct) { return memGetFloat(struct + VkDepthBiasInfoEXT.DEPTHBIASCLAMP); }
    /** Unsafe version of {@link #depthBiasSlopeFactor}. */
    public static float ndepthBiasSlopeFactor(long struct) { return memGetFloat(struct + VkDepthBiasInfoEXT.DEPTHBIASSLOPEFACTOR); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { memPutInt(struct + VkDepthBiasInfoEXT.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkDepthBiasInfoEXT.PNEXT, value); }
    /** Unsafe version of {@link #depthBiasConstantFactor(float) depthBiasConstantFactor}. */
    public static void ndepthBiasConstantFactor(long struct, float value) { memPutFloat(struct + VkDepthBiasInfoEXT.DEPTHBIASCONSTANTFACTOR, value); }
    /** Unsafe version of {@link #depthBiasClamp(float) depthBiasClamp}. */
    public static void ndepthBiasClamp(long struct, float value) { memPutFloat(struct + VkDepthBiasInfoEXT.DEPTHBIASCLAMP, value); }
    /** Unsafe version of {@link #depthBiasSlopeFactor(float) depthBiasSlopeFactor}. */
    public static void ndepthBiasSlopeFactor(long struct, float value) { memPutFloat(struct + VkDepthBiasInfoEXT.DEPTHBIASSLOPEFACTOR, value); }

    // -----------------------------------

    /** An array of {@link VkDepthBiasInfoEXT} structs. */
    public static class Buffer extends StructBuffer<VkDepthBiasInfoEXT, Buffer> implements NativeResource {

        private static final VkDepthBiasInfoEXT ELEMENT_FACTORY = VkDepthBiasInfoEXT.create(-1L);

        /**
         * Creates a new {@code VkDepthBiasInfoEXT.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkDepthBiasInfoEXT#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkDepthBiasInfoEXT getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkDepthBiasInfoEXT.nsType(address()); }
        /** @return the value of the {@code pNext} field. */
        @NativeType("void const *")
        public long pNext() { return VkDepthBiasInfoEXT.npNext(address()); }
        /** @return the value of the {@code depthBiasConstantFactor} field. */
        public float depthBiasConstantFactor() { return VkDepthBiasInfoEXT.ndepthBiasConstantFactor(address()); }
        /** @return the value of the {@code depthBiasClamp} field. */
        public float depthBiasClamp() { return VkDepthBiasInfoEXT.ndepthBiasClamp(address()); }
        /** @return the value of the {@code depthBiasSlopeFactor} field. */
        public float depthBiasSlopeFactor() { return VkDepthBiasInfoEXT.ndepthBiasSlopeFactor(address()); }

        /** Sets the specified value to the {@code sType} field. */
        public VkDepthBiasInfoEXT.Buffer sType(@NativeType("VkStructureType") int value) { VkDepthBiasInfoEXT.nsType(address(), value); return this; }
        /** Sets the {@link EXTDepthBiasControl#VK_STRUCTURE_TYPE_DEPTH_BIAS_INFO_EXT STRUCTURE_TYPE_DEPTH_BIAS_INFO_EXT} value to the {@code sType} field. */
        public VkDepthBiasInfoEXT.Buffer sType$Default() { return sType(EXTDepthBiasControl.VK_STRUCTURE_TYPE_DEPTH_BIAS_INFO_EXT); }
        /** Sets the specified value to the {@code pNext} field. */
        public VkDepthBiasInfoEXT.Buffer pNext(@NativeType("void const *") long value) { VkDepthBiasInfoEXT.npNext(address(), value); return this; }
        /** Prepends the specified {@link VkDepthBiasRepresentationInfoEXT} value to the {@code pNext} chain. */
        public VkDepthBiasInfoEXT.Buffer pNext(VkDepthBiasRepresentationInfoEXT value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Sets the specified value to the {@code depthBiasConstantFactor} field. */
        public VkDepthBiasInfoEXT.Buffer depthBiasConstantFactor(float value) { VkDepthBiasInfoEXT.ndepthBiasConstantFactor(address(), value); return this; }
        /** Sets the specified value to the {@code depthBiasClamp} field. */
        public VkDepthBiasInfoEXT.Buffer depthBiasClamp(float value) { VkDepthBiasInfoEXT.ndepthBiasClamp(address(), value); return this; }
        /** Sets the specified value to the {@code depthBiasSlopeFactor} field. */
        public VkDepthBiasInfoEXT.Buffer depthBiasSlopeFactor(float value) { VkDepthBiasInfoEXT.ndepthBiasSlopeFactor(address(), value); return this; }

    }

}