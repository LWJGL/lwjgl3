/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.openxr;

import org.jspecify.annotations.*;

import java.nio.*;

import org.lwjgl.*;
import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * <pre>{@code
 * struct XrSpatialComponentPlaneSemanticLabelListEXT {
 *     XrStructureType type;
 *     void * next;
 *     uint32_t semanticLabelCount;
 *     XrSpatialPlaneSemanticLabelEXT * semanticLabels;
 * }}</pre>
 */
public class XrSpatialComponentPlaneSemanticLabelListEXT extends Struct<XrSpatialComponentPlaneSemanticLabelListEXT> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        TYPE,
        NEXT,
        SEMANTICLABELCOUNT,
        SEMANTICLABELS;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(4),
            __member(POINTER_SIZE)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        TYPE = layout.offsetof(0);
        NEXT = layout.offsetof(1);
        SEMANTICLABELCOUNT = layout.offsetof(2);
        SEMANTICLABELS = layout.offsetof(3);
    }

    protected XrSpatialComponentPlaneSemanticLabelListEXT(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected XrSpatialComponentPlaneSemanticLabelListEXT create(long address, @Nullable ByteBuffer container) {
        return new XrSpatialComponentPlaneSemanticLabelListEXT(address, container);
    }

    /**
     * Creates a {@code XrSpatialComponentPlaneSemanticLabelListEXT} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public XrSpatialComponentPlaneSemanticLabelListEXT(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return the value of the {@code type} field. */
    @NativeType("XrStructureType")
    public int type() { return ntype(address()); }
    /** @return the value of the {@code next} field. */
    @NativeType("void *")
    public long next() { return nnext(address()); }
    /** @return the value of the {@code semanticLabelCount} field. */
    @NativeType("uint32_t")
    public int semanticLabelCount() { return nsemanticLabelCount(address()); }
    /** @return a {@link IntBuffer} view of the data pointed to by the {@code semanticLabels} field. */
    @NativeType("XrSpatialPlaneSemanticLabelEXT *")
    public IntBuffer semanticLabels() { return nsemanticLabels(address()); }

    /** Sets the specified value to the {@code type} field. */
    public XrSpatialComponentPlaneSemanticLabelListEXT type(@NativeType("XrStructureType") int value) { ntype(address(), value); return this; }
    /** Sets the {@link EXTSpatialPlaneTracking#XR_TYPE_SPATIAL_COMPONENT_PLANE_SEMANTIC_LABEL_LIST_EXT TYPE_SPATIAL_COMPONENT_PLANE_SEMANTIC_LABEL_LIST_EXT} value to the {@code type} field. */
    public XrSpatialComponentPlaneSemanticLabelListEXT type$Default() { return type(EXTSpatialPlaneTracking.XR_TYPE_SPATIAL_COMPONENT_PLANE_SEMANTIC_LABEL_LIST_EXT); }
    /** Sets the specified value to the {@code next} field. */
    public XrSpatialComponentPlaneSemanticLabelListEXT next(@NativeType("void *") long value) { nnext(address(), value); return this; }
    /** Sets the address of the specified {@link IntBuffer} to the {@code semanticLabels} field. */
    public XrSpatialComponentPlaneSemanticLabelListEXT semanticLabels(@NativeType("XrSpatialPlaneSemanticLabelEXT *") IntBuffer value) { nsemanticLabels(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public XrSpatialComponentPlaneSemanticLabelListEXT set(
        int type,
        long next,
        IntBuffer semanticLabels
    ) {
        type(type);
        next(next);
        semanticLabels(semanticLabels);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public XrSpatialComponentPlaneSemanticLabelListEXT set(XrSpatialComponentPlaneSemanticLabelListEXT src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code XrSpatialComponentPlaneSemanticLabelListEXT} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static XrSpatialComponentPlaneSemanticLabelListEXT malloc() {
        return new XrSpatialComponentPlaneSemanticLabelListEXT(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code XrSpatialComponentPlaneSemanticLabelListEXT} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static XrSpatialComponentPlaneSemanticLabelListEXT calloc() {
        return new XrSpatialComponentPlaneSemanticLabelListEXT(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code XrSpatialComponentPlaneSemanticLabelListEXT} instance allocated with {@link BufferUtils}. */
    public static XrSpatialComponentPlaneSemanticLabelListEXT create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new XrSpatialComponentPlaneSemanticLabelListEXT(memAddress(container), container);
    }

    /** Returns a new {@code XrSpatialComponentPlaneSemanticLabelListEXT} instance for the specified memory address. */
    public static XrSpatialComponentPlaneSemanticLabelListEXT create(long address) {
        return new XrSpatialComponentPlaneSemanticLabelListEXT(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable XrSpatialComponentPlaneSemanticLabelListEXT createSafe(long address) {
        return address == NULL ? null : new XrSpatialComponentPlaneSemanticLabelListEXT(address, null);
    }

    /**
     * Returns a new {@link XrSpatialComponentPlaneSemanticLabelListEXT.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrSpatialComponentPlaneSemanticLabelListEXT.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link XrSpatialComponentPlaneSemanticLabelListEXT.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrSpatialComponentPlaneSemanticLabelListEXT.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrSpatialComponentPlaneSemanticLabelListEXT.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static XrSpatialComponentPlaneSemanticLabelListEXT.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link XrSpatialComponentPlaneSemanticLabelListEXT.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static XrSpatialComponentPlaneSemanticLabelListEXT.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static XrSpatialComponentPlaneSemanticLabelListEXT.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code XrSpatialComponentPlaneSemanticLabelListEXT} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static XrSpatialComponentPlaneSemanticLabelListEXT malloc(MemoryStack stack) {
        return new XrSpatialComponentPlaneSemanticLabelListEXT(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code XrSpatialComponentPlaneSemanticLabelListEXT} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static XrSpatialComponentPlaneSemanticLabelListEXT calloc(MemoryStack stack) {
        return new XrSpatialComponentPlaneSemanticLabelListEXT(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link XrSpatialComponentPlaneSemanticLabelListEXT.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrSpatialComponentPlaneSemanticLabelListEXT.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrSpatialComponentPlaneSemanticLabelListEXT.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrSpatialComponentPlaneSemanticLabelListEXT.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #type}. */
    public static int ntype(long struct) { return memGetInt(struct + XrSpatialComponentPlaneSemanticLabelListEXT.TYPE); }
    /** Unsafe version of {@link #next}. */
    public static long nnext(long struct) { return memGetAddress(struct + XrSpatialComponentPlaneSemanticLabelListEXT.NEXT); }
    /** Unsafe version of {@link #semanticLabelCount}. */
    public static int nsemanticLabelCount(long struct) { return memGetInt(struct + XrSpatialComponentPlaneSemanticLabelListEXT.SEMANTICLABELCOUNT); }
    /** Unsafe version of {@link #semanticLabels() semanticLabels}. */
    public static IntBuffer nsemanticLabels(long struct) { return memIntBuffer(memGetAddress(struct + XrSpatialComponentPlaneSemanticLabelListEXT.SEMANTICLABELS), nsemanticLabelCount(struct)); }

    /** Unsafe version of {@link #type(int) type}. */
    public static void ntype(long struct, int value) { memPutInt(struct + XrSpatialComponentPlaneSemanticLabelListEXT.TYPE, value); }
    /** Unsafe version of {@link #next(long) next}. */
    public static void nnext(long struct, long value) { memPutAddress(struct + XrSpatialComponentPlaneSemanticLabelListEXT.NEXT, value); }
    /** Sets the specified value to the {@code semanticLabelCount} field of the specified {@code struct}. */
    public static void nsemanticLabelCount(long struct, int value) { memPutInt(struct + XrSpatialComponentPlaneSemanticLabelListEXT.SEMANTICLABELCOUNT, value); }
    /** Unsafe version of {@link #semanticLabels(IntBuffer) semanticLabels}. */
    public static void nsemanticLabels(long struct, IntBuffer value) { memPutAddress(struct + XrSpatialComponentPlaneSemanticLabelListEXT.SEMANTICLABELS, memAddress(value)); nsemanticLabelCount(struct, value.remaining()); }

    /**
     * Validates pointer members that should not be {@code NULL}.
     *
     * @param struct the struct to validate
     */
    public static void validate(long struct) {
        check(memGetAddress(struct + XrSpatialComponentPlaneSemanticLabelListEXT.SEMANTICLABELS));
    }

    // -----------------------------------

    /** An array of {@link XrSpatialComponentPlaneSemanticLabelListEXT} structs. */
    public static class Buffer extends StructBuffer<XrSpatialComponentPlaneSemanticLabelListEXT, Buffer> implements NativeResource {

        private static final XrSpatialComponentPlaneSemanticLabelListEXT ELEMENT_FACTORY = XrSpatialComponentPlaneSemanticLabelListEXT.create(-1L);

        /**
         * Creates a new {@code XrSpatialComponentPlaneSemanticLabelListEXT.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link XrSpatialComponentPlaneSemanticLabelListEXT#SIZEOF}, and its mark will be undefined.</p>
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
        protected XrSpatialComponentPlaneSemanticLabelListEXT getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code type} field. */
        @NativeType("XrStructureType")
        public int type() { return XrSpatialComponentPlaneSemanticLabelListEXT.ntype(address()); }
        /** @return the value of the {@code next} field. */
        @NativeType("void *")
        public long next() { return XrSpatialComponentPlaneSemanticLabelListEXT.nnext(address()); }
        /** @return the value of the {@code semanticLabelCount} field. */
        @NativeType("uint32_t")
        public int semanticLabelCount() { return XrSpatialComponentPlaneSemanticLabelListEXT.nsemanticLabelCount(address()); }
        /** @return a {@link IntBuffer} view of the data pointed to by the {@code semanticLabels} field. */
        @NativeType("XrSpatialPlaneSemanticLabelEXT *")
        public IntBuffer semanticLabels() { return XrSpatialComponentPlaneSemanticLabelListEXT.nsemanticLabels(address()); }

        /** Sets the specified value to the {@code type} field. */
        public XrSpatialComponentPlaneSemanticLabelListEXT.Buffer type(@NativeType("XrStructureType") int value) { XrSpatialComponentPlaneSemanticLabelListEXT.ntype(address(), value); return this; }
        /** Sets the {@link EXTSpatialPlaneTracking#XR_TYPE_SPATIAL_COMPONENT_PLANE_SEMANTIC_LABEL_LIST_EXT TYPE_SPATIAL_COMPONENT_PLANE_SEMANTIC_LABEL_LIST_EXT} value to the {@code type} field. */
        public XrSpatialComponentPlaneSemanticLabelListEXT.Buffer type$Default() { return type(EXTSpatialPlaneTracking.XR_TYPE_SPATIAL_COMPONENT_PLANE_SEMANTIC_LABEL_LIST_EXT); }
        /** Sets the specified value to the {@code next} field. */
        public XrSpatialComponentPlaneSemanticLabelListEXT.Buffer next(@NativeType("void *") long value) { XrSpatialComponentPlaneSemanticLabelListEXT.nnext(address(), value); return this; }
        /** Sets the address of the specified {@link IntBuffer} to the {@code semanticLabels} field. */
        public XrSpatialComponentPlaneSemanticLabelListEXT.Buffer semanticLabels(@NativeType("XrSpatialPlaneSemanticLabelEXT *") IntBuffer value) { XrSpatialComponentPlaneSemanticLabelListEXT.nsemanticLabels(address(), value); return this; }

    }

}