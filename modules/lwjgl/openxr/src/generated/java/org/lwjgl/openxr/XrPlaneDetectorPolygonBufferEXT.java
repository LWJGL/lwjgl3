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

import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * <pre>{@code
 * struct XrPlaneDetectorPolygonBufferEXT {
 *     XrStructureType type;
 *     void * next;
 *     uint32_t vertexCapacityInput;
 *     uint32_t vertexCountOutput;
 *     {@link XrVector2f XrVector2f} * vertices;
 * }}</pre>
 */
public class XrPlaneDetectorPolygonBufferEXT extends Struct<XrPlaneDetectorPolygonBufferEXT> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        TYPE,
        NEXT,
        VERTEXCAPACITYINPUT,
        VERTEXCOUNTOUTPUT,
        VERTICES;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(4),
            __member(4),
            __member(POINTER_SIZE)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        TYPE = layout.offsetof(0);
        NEXT = layout.offsetof(1);
        VERTEXCAPACITYINPUT = layout.offsetof(2);
        VERTEXCOUNTOUTPUT = layout.offsetof(3);
        VERTICES = layout.offsetof(4);
    }

    protected XrPlaneDetectorPolygonBufferEXT(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected XrPlaneDetectorPolygonBufferEXT create(long address, @Nullable ByteBuffer container) {
        return new XrPlaneDetectorPolygonBufferEXT(address, container);
    }

    /**
     * Creates a {@code XrPlaneDetectorPolygonBufferEXT} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public XrPlaneDetectorPolygonBufferEXT(ByteBuffer container) {
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
    /** @return the value of the {@code vertexCapacityInput} field. */
    @NativeType("uint32_t")
    public int vertexCapacityInput() { return nvertexCapacityInput(address()); }
    /** @return the value of the {@code vertexCountOutput} field. */
    @NativeType("uint32_t")
    public int vertexCountOutput() { return nvertexCountOutput(address()); }
    /** @return a {@link XrVector2f.Buffer} view of the struct array pointed to by the {@code vertices} field. */
    @NativeType("XrVector2f *")
    public XrVector2f.@Nullable Buffer vertices() { return nvertices(address()); }

    /** Sets the specified value to the {@code type} field. */
    public XrPlaneDetectorPolygonBufferEXT type(@NativeType("XrStructureType") int value) { ntype(address(), value); return this; }
    /** Sets the {@link EXTPlaneDetection#XR_TYPE_PLANE_DETECTOR_POLYGON_BUFFER_EXT TYPE_PLANE_DETECTOR_POLYGON_BUFFER_EXT} value to the {@code type} field. */
    public XrPlaneDetectorPolygonBufferEXT type$Default() { return type(EXTPlaneDetection.XR_TYPE_PLANE_DETECTOR_POLYGON_BUFFER_EXT); }
    /** Sets the specified value to the {@code next} field. */
    public XrPlaneDetectorPolygonBufferEXT next(@NativeType("void *") long value) { nnext(address(), value); return this; }
    /** Sets the specified value to the {@code vertexCapacityInput} field. */
    public XrPlaneDetectorPolygonBufferEXT vertexCapacityInput(@NativeType("uint32_t") int value) { nvertexCapacityInput(address(), value); return this; }
    /** Sets the specified value to the {@code vertexCountOutput} field. */
    public XrPlaneDetectorPolygonBufferEXT vertexCountOutput(@NativeType("uint32_t") int value) { nvertexCountOutput(address(), value); return this; }
    /** Sets the address of the specified {@link XrVector2f.Buffer} to the {@code vertices} field. */
    public XrPlaneDetectorPolygonBufferEXT vertices(@NativeType("XrVector2f *") XrVector2f.@Nullable Buffer value) { nvertices(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public XrPlaneDetectorPolygonBufferEXT set(
        int type,
        long next,
        int vertexCapacityInput,
        int vertexCountOutput,
        XrVector2f.@Nullable Buffer vertices
    ) {
        type(type);
        next(next);
        vertexCapacityInput(vertexCapacityInput);
        vertexCountOutput(vertexCountOutput);
        vertices(vertices);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public XrPlaneDetectorPolygonBufferEXT set(XrPlaneDetectorPolygonBufferEXT src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code XrPlaneDetectorPolygonBufferEXT} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static XrPlaneDetectorPolygonBufferEXT malloc() {
        return new XrPlaneDetectorPolygonBufferEXT(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code XrPlaneDetectorPolygonBufferEXT} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static XrPlaneDetectorPolygonBufferEXT calloc() {
        return new XrPlaneDetectorPolygonBufferEXT(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code XrPlaneDetectorPolygonBufferEXT} instance allocated with {@link BufferUtils}. */
    public static XrPlaneDetectorPolygonBufferEXT create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new XrPlaneDetectorPolygonBufferEXT(memAddress(container), container);
    }

    /** Returns a new {@code XrPlaneDetectorPolygonBufferEXT} instance for the specified memory address. */
    public static XrPlaneDetectorPolygonBufferEXT create(long address) {
        return new XrPlaneDetectorPolygonBufferEXT(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable XrPlaneDetectorPolygonBufferEXT createSafe(long address) {
        return address == NULL ? null : new XrPlaneDetectorPolygonBufferEXT(address, null);
    }

    /**
     * Returns a new {@link XrPlaneDetectorPolygonBufferEXT.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrPlaneDetectorPolygonBufferEXT.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link XrPlaneDetectorPolygonBufferEXT.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrPlaneDetectorPolygonBufferEXT.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrPlaneDetectorPolygonBufferEXT.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static XrPlaneDetectorPolygonBufferEXT.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link XrPlaneDetectorPolygonBufferEXT.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static XrPlaneDetectorPolygonBufferEXT.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static XrPlaneDetectorPolygonBufferEXT.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code XrPlaneDetectorPolygonBufferEXT} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static XrPlaneDetectorPolygonBufferEXT malloc(MemoryStack stack) {
        return new XrPlaneDetectorPolygonBufferEXT(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code XrPlaneDetectorPolygonBufferEXT} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static XrPlaneDetectorPolygonBufferEXT calloc(MemoryStack stack) {
        return new XrPlaneDetectorPolygonBufferEXT(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link XrPlaneDetectorPolygonBufferEXT.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrPlaneDetectorPolygonBufferEXT.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrPlaneDetectorPolygonBufferEXT.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrPlaneDetectorPolygonBufferEXT.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #type}. */
    public static int ntype(long struct) { return memGetInt(struct + XrPlaneDetectorPolygonBufferEXT.TYPE); }
    /** Unsafe version of {@link #next}. */
    public static long nnext(long struct) { return memGetAddress(struct + XrPlaneDetectorPolygonBufferEXT.NEXT); }
    /** Unsafe version of {@link #vertexCapacityInput}. */
    public static int nvertexCapacityInput(long struct) { return memGetInt(struct + XrPlaneDetectorPolygonBufferEXT.VERTEXCAPACITYINPUT); }
    /** Unsafe version of {@link #vertexCountOutput}. */
    public static int nvertexCountOutput(long struct) { return memGetInt(struct + XrPlaneDetectorPolygonBufferEXT.VERTEXCOUNTOUTPUT); }
    /** Unsafe version of {@link #vertices}. */
    public static XrVector2f.@Nullable Buffer nvertices(long struct) { return XrVector2f.createSafe(memGetAddress(struct + XrPlaneDetectorPolygonBufferEXT.VERTICES), nvertexCapacityInput(struct)); }

    /** Unsafe version of {@link #type(int) type}. */
    public static void ntype(long struct, int value) { memPutInt(struct + XrPlaneDetectorPolygonBufferEXT.TYPE, value); }
    /** Unsafe version of {@link #next(long) next}. */
    public static void nnext(long struct, long value) { memPutAddress(struct + XrPlaneDetectorPolygonBufferEXT.NEXT, value); }
    /** Sets the specified value to the {@code vertexCapacityInput} field of the specified {@code struct}. */
    public static void nvertexCapacityInput(long struct, int value) { memPutInt(struct + XrPlaneDetectorPolygonBufferEXT.VERTEXCAPACITYINPUT, value); }
    /** Unsafe version of {@link #vertexCountOutput(int) vertexCountOutput}. */
    public static void nvertexCountOutput(long struct, int value) { memPutInt(struct + XrPlaneDetectorPolygonBufferEXT.VERTEXCOUNTOUTPUT, value); }
    /** Unsafe version of {@link #vertices(XrVector2f.Buffer) vertices}. */
    public static void nvertices(long struct, XrVector2f.@Nullable Buffer value) { memPutAddress(struct + XrPlaneDetectorPolygonBufferEXT.VERTICES, memAddressSafe(value)); if (value != null) { nvertexCapacityInput(struct, value.remaining()); } }

    // -----------------------------------

    /** An array of {@link XrPlaneDetectorPolygonBufferEXT} structs. */
    public static class Buffer extends StructBuffer<XrPlaneDetectorPolygonBufferEXT, Buffer> implements NativeResource {

        private static final XrPlaneDetectorPolygonBufferEXT ELEMENT_FACTORY = XrPlaneDetectorPolygonBufferEXT.create(-1L);

        /**
         * Creates a new {@code XrPlaneDetectorPolygonBufferEXT.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link XrPlaneDetectorPolygonBufferEXT#SIZEOF}, and its mark will be undefined.</p>
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
        protected XrPlaneDetectorPolygonBufferEXT getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code type} field. */
        @NativeType("XrStructureType")
        public int type() { return XrPlaneDetectorPolygonBufferEXT.ntype(address()); }
        /** @return the value of the {@code next} field. */
        @NativeType("void *")
        public long next() { return XrPlaneDetectorPolygonBufferEXT.nnext(address()); }
        /** @return the value of the {@code vertexCapacityInput} field. */
        @NativeType("uint32_t")
        public int vertexCapacityInput() { return XrPlaneDetectorPolygonBufferEXT.nvertexCapacityInput(address()); }
        /** @return the value of the {@code vertexCountOutput} field. */
        @NativeType("uint32_t")
        public int vertexCountOutput() { return XrPlaneDetectorPolygonBufferEXT.nvertexCountOutput(address()); }
        /** @return a {@link XrVector2f.Buffer} view of the struct array pointed to by the {@code vertices} field. */
        @NativeType("XrVector2f *")
        public XrVector2f.@Nullable Buffer vertices() { return XrPlaneDetectorPolygonBufferEXT.nvertices(address()); }

        /** Sets the specified value to the {@code type} field. */
        public XrPlaneDetectorPolygonBufferEXT.Buffer type(@NativeType("XrStructureType") int value) { XrPlaneDetectorPolygonBufferEXT.ntype(address(), value); return this; }
        /** Sets the {@link EXTPlaneDetection#XR_TYPE_PLANE_DETECTOR_POLYGON_BUFFER_EXT TYPE_PLANE_DETECTOR_POLYGON_BUFFER_EXT} value to the {@code type} field. */
        public XrPlaneDetectorPolygonBufferEXT.Buffer type$Default() { return type(EXTPlaneDetection.XR_TYPE_PLANE_DETECTOR_POLYGON_BUFFER_EXT); }
        /** Sets the specified value to the {@code next} field. */
        public XrPlaneDetectorPolygonBufferEXT.Buffer next(@NativeType("void *") long value) { XrPlaneDetectorPolygonBufferEXT.nnext(address(), value); return this; }
        /** Sets the specified value to the {@code vertexCapacityInput} field. */
        public XrPlaneDetectorPolygonBufferEXT.Buffer vertexCapacityInput(@NativeType("uint32_t") int value) { XrPlaneDetectorPolygonBufferEXT.nvertexCapacityInput(address(), value); return this; }
        /** Sets the specified value to the {@code vertexCountOutput} field. */
        public XrPlaneDetectorPolygonBufferEXT.Buffer vertexCountOutput(@NativeType("uint32_t") int value) { XrPlaneDetectorPolygonBufferEXT.nvertexCountOutput(address(), value); return this; }
        /** Sets the address of the specified {@link XrVector2f.Buffer} to the {@code vertices} field. */
        public XrPlaneDetectorPolygonBufferEXT.Buffer vertices(@NativeType("XrVector2f *") XrVector2f.@Nullable Buffer value) { XrPlaneDetectorPolygonBufferEXT.nvertices(address(), value); return this; }

    }

}