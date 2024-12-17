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
 * struct VkDepthBiasRepresentationInfoEXT {
 *     VkStructureType sType;
 *     void const * pNext;
 *     VkDepthBiasRepresentationEXT depthBiasRepresentation;
 *     VkBool32 depthBiasExact;
 * }}</pre>
 */
public class VkDepthBiasRepresentationInfoEXT extends Struct<VkDepthBiasRepresentationInfoEXT> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        DEPTHBIASREPRESENTATION,
        DEPTHBIASEXACT;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(4),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        DEPTHBIASREPRESENTATION = layout.offsetof(2);
        DEPTHBIASEXACT = layout.offsetof(3);
    }

    protected VkDepthBiasRepresentationInfoEXT(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkDepthBiasRepresentationInfoEXT create(long address, @Nullable ByteBuffer container) {
        return new VkDepthBiasRepresentationInfoEXT(address, container);
    }

    /**
     * Creates a {@code VkDepthBiasRepresentationInfoEXT} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkDepthBiasRepresentationInfoEXT(ByteBuffer container) {
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
    /** @return the value of the {@code depthBiasRepresentation} field. */
    @NativeType("VkDepthBiasRepresentationEXT")
    public int depthBiasRepresentation() { return ndepthBiasRepresentation(address()); }
    /** @return the value of the {@code depthBiasExact} field. */
    @NativeType("VkBool32")
    public boolean depthBiasExact() { return ndepthBiasExact(address()) != 0; }

    /** Sets the specified value to the {@code sType} field. */
    public VkDepthBiasRepresentationInfoEXT sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link EXTDepthBiasControl#VK_STRUCTURE_TYPE_DEPTH_BIAS_REPRESENTATION_INFO_EXT STRUCTURE_TYPE_DEPTH_BIAS_REPRESENTATION_INFO_EXT} value to the {@code sType} field. */
    public VkDepthBiasRepresentationInfoEXT sType$Default() { return sType(EXTDepthBiasControl.VK_STRUCTURE_TYPE_DEPTH_BIAS_REPRESENTATION_INFO_EXT); }
    /** Sets the specified value to the {@code pNext} field. */
    public VkDepthBiasRepresentationInfoEXT pNext(@NativeType("void const *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@code depthBiasRepresentation} field. */
    public VkDepthBiasRepresentationInfoEXT depthBiasRepresentation(@NativeType("VkDepthBiasRepresentationEXT") int value) { ndepthBiasRepresentation(address(), value); return this; }
    /** Sets the specified value to the {@code depthBiasExact} field. */
    public VkDepthBiasRepresentationInfoEXT depthBiasExact(@NativeType("VkBool32") boolean value) { ndepthBiasExact(address(), value ? 1 : 0); return this; }

    /** Initializes this struct with the specified values. */
    public VkDepthBiasRepresentationInfoEXT set(
        int sType,
        long pNext,
        int depthBiasRepresentation,
        boolean depthBiasExact
    ) {
        sType(sType);
        pNext(pNext);
        depthBiasRepresentation(depthBiasRepresentation);
        depthBiasExact(depthBiasExact);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkDepthBiasRepresentationInfoEXT set(VkDepthBiasRepresentationInfoEXT src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkDepthBiasRepresentationInfoEXT} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkDepthBiasRepresentationInfoEXT malloc() {
        return new VkDepthBiasRepresentationInfoEXT(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkDepthBiasRepresentationInfoEXT} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkDepthBiasRepresentationInfoEXT calloc() {
        return new VkDepthBiasRepresentationInfoEXT(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkDepthBiasRepresentationInfoEXT} instance allocated with {@link BufferUtils}. */
    public static VkDepthBiasRepresentationInfoEXT create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkDepthBiasRepresentationInfoEXT(memAddress(container), container);
    }

    /** Returns a new {@code VkDepthBiasRepresentationInfoEXT} instance for the specified memory address. */
    public static VkDepthBiasRepresentationInfoEXT create(long address) {
        return new VkDepthBiasRepresentationInfoEXT(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable VkDepthBiasRepresentationInfoEXT createSafe(long address) {
        return address == NULL ? null : new VkDepthBiasRepresentationInfoEXT(address, null);
    }

    /**
     * Returns a new {@link VkDepthBiasRepresentationInfoEXT.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkDepthBiasRepresentationInfoEXT.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkDepthBiasRepresentationInfoEXT.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkDepthBiasRepresentationInfoEXT.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkDepthBiasRepresentationInfoEXT.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkDepthBiasRepresentationInfoEXT.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkDepthBiasRepresentationInfoEXT.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkDepthBiasRepresentationInfoEXT.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static VkDepthBiasRepresentationInfoEXT.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code VkDepthBiasRepresentationInfoEXT} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkDepthBiasRepresentationInfoEXT malloc(MemoryStack stack) {
        return new VkDepthBiasRepresentationInfoEXT(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkDepthBiasRepresentationInfoEXT} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkDepthBiasRepresentationInfoEXT calloc(MemoryStack stack) {
        return new VkDepthBiasRepresentationInfoEXT(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkDepthBiasRepresentationInfoEXT.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkDepthBiasRepresentationInfoEXT.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkDepthBiasRepresentationInfoEXT.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkDepthBiasRepresentationInfoEXT.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return memGetInt(struct + VkDepthBiasRepresentationInfoEXT.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkDepthBiasRepresentationInfoEXT.PNEXT); }
    /** Unsafe version of {@link #depthBiasRepresentation}. */
    public static int ndepthBiasRepresentation(long struct) { return memGetInt(struct + VkDepthBiasRepresentationInfoEXT.DEPTHBIASREPRESENTATION); }
    /** Unsafe version of {@link #depthBiasExact}. */
    public static int ndepthBiasExact(long struct) { return memGetInt(struct + VkDepthBiasRepresentationInfoEXT.DEPTHBIASEXACT); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { memPutInt(struct + VkDepthBiasRepresentationInfoEXT.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkDepthBiasRepresentationInfoEXT.PNEXT, value); }
    /** Unsafe version of {@link #depthBiasRepresentation(int) depthBiasRepresentation}. */
    public static void ndepthBiasRepresentation(long struct, int value) { memPutInt(struct + VkDepthBiasRepresentationInfoEXT.DEPTHBIASREPRESENTATION, value); }
    /** Unsafe version of {@link #depthBiasExact(boolean) depthBiasExact}. */
    public static void ndepthBiasExact(long struct, int value) { memPutInt(struct + VkDepthBiasRepresentationInfoEXT.DEPTHBIASEXACT, value); }

    // -----------------------------------

    /** An array of {@link VkDepthBiasRepresentationInfoEXT} structs. */
    public static class Buffer extends StructBuffer<VkDepthBiasRepresentationInfoEXT, Buffer> implements NativeResource {

        private static final VkDepthBiasRepresentationInfoEXT ELEMENT_FACTORY = VkDepthBiasRepresentationInfoEXT.create(-1L);

        /**
         * Creates a new {@code VkDepthBiasRepresentationInfoEXT.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkDepthBiasRepresentationInfoEXT#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkDepthBiasRepresentationInfoEXT getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkDepthBiasRepresentationInfoEXT.nsType(address()); }
        /** @return the value of the {@code pNext} field. */
        @NativeType("void const *")
        public long pNext() { return VkDepthBiasRepresentationInfoEXT.npNext(address()); }
        /** @return the value of the {@code depthBiasRepresentation} field. */
        @NativeType("VkDepthBiasRepresentationEXT")
        public int depthBiasRepresentation() { return VkDepthBiasRepresentationInfoEXT.ndepthBiasRepresentation(address()); }
        /** @return the value of the {@code depthBiasExact} field. */
        @NativeType("VkBool32")
        public boolean depthBiasExact() { return VkDepthBiasRepresentationInfoEXT.ndepthBiasExact(address()) != 0; }

        /** Sets the specified value to the {@code sType} field. */
        public VkDepthBiasRepresentationInfoEXT.Buffer sType(@NativeType("VkStructureType") int value) { VkDepthBiasRepresentationInfoEXT.nsType(address(), value); return this; }
        /** Sets the {@link EXTDepthBiasControl#VK_STRUCTURE_TYPE_DEPTH_BIAS_REPRESENTATION_INFO_EXT STRUCTURE_TYPE_DEPTH_BIAS_REPRESENTATION_INFO_EXT} value to the {@code sType} field. */
        public VkDepthBiasRepresentationInfoEXT.Buffer sType$Default() { return sType(EXTDepthBiasControl.VK_STRUCTURE_TYPE_DEPTH_BIAS_REPRESENTATION_INFO_EXT); }
        /** Sets the specified value to the {@code pNext} field. */
        public VkDepthBiasRepresentationInfoEXT.Buffer pNext(@NativeType("void const *") long value) { VkDepthBiasRepresentationInfoEXT.npNext(address(), value); return this; }
        /** Sets the specified value to the {@code depthBiasRepresentation} field. */
        public VkDepthBiasRepresentationInfoEXT.Buffer depthBiasRepresentation(@NativeType("VkDepthBiasRepresentationEXT") int value) { VkDepthBiasRepresentationInfoEXT.ndepthBiasRepresentation(address(), value); return this; }
        /** Sets the specified value to the {@code depthBiasExact} field. */
        public VkDepthBiasRepresentationInfoEXT.Buffer depthBiasExact(@NativeType("VkBool32") boolean value) { VkDepthBiasRepresentationInfoEXT.ndepthBiasExact(address(), value ? 1 : 0); return this; }

    }

}