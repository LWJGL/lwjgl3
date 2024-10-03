/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.openxr;

import javax.annotation.*;

import java.nio.*;

import org.lwjgl.*;
import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * Memory Allocation Info.
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>The {@link MLWorldMeshDetection XR_ML_world_mesh_detection} extension <b>must</b> be enabled prior to using {@link XrWorldMeshBufferSizeML}</li>
 * <li>{@code type} <b>must</b> be {@link MLWorldMeshDetection#XR_TYPE_WORLD_MESH_BUFFER_SIZE_ML TYPE_WORLD_MESH_BUFFER_SIZE_ML}</li>
 * <li>{@code next} <b>must</b> be {@code NULL} or a valid pointer to the <a href="https://registry.khronos.org/OpenXR/specs/1.0/html/xrspec.html#valid-usage-for-structure-pointer-chains">next structure in a structure chain</a></li>
 * </ul>
 * 
 * <h5>See Also</h5>
 * 
 * <p>{@link MLWorldMeshDetection#xrAllocateWorldMeshBufferML AllocateWorldMeshBufferML}, {@link MLWorldMeshDetection#xrGetWorldMeshBufferRecommendSizeML GetWorldMeshBufferRecommendSizeML}</p>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct XrWorldMeshBufferSizeML {
 *     XrStructureType {@link #type};
 *     void * {@link #next};
 *     uint32_t {@link #size};
 * }</code></pre>
 */
public class XrWorldMeshBufferSizeML extends Struct<XrWorldMeshBufferSizeML> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        TYPE,
        NEXT,
        SIZE;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        TYPE = layout.offsetof(0);
        NEXT = layout.offsetof(1);
        SIZE = layout.offsetof(2);
    }

    protected XrWorldMeshBufferSizeML(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected XrWorldMeshBufferSizeML create(long address, @Nullable ByteBuffer container) {
        return new XrWorldMeshBufferSizeML(address, container);
    }

    /**
     * Creates a {@code XrWorldMeshBufferSizeML} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public XrWorldMeshBufferSizeML(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** the {@code XrStructureType} of this structure. */
    @NativeType("XrStructureType")
    public int type() { return ntype(address()); }
    /** {@code NULL} or a pointer to the next structure in a structure chain. */
    @NativeType("void *")
    public long next() { return nnext(address()); }
    /** a {@code uint32_t} indicating the number of bytes recommended. */
    @NativeType("uint32_t")
    public int size() { return nsize(address()); }

    /** Sets the specified value to the {@link #type} field. */
    public XrWorldMeshBufferSizeML type(@NativeType("XrStructureType") int value) { ntype(address(), value); return this; }
    /** Sets the {@link MLWorldMeshDetection#XR_TYPE_WORLD_MESH_BUFFER_SIZE_ML TYPE_WORLD_MESH_BUFFER_SIZE_ML} value to the {@link #type} field. */
    public XrWorldMeshBufferSizeML type$Default() { return type(MLWorldMeshDetection.XR_TYPE_WORLD_MESH_BUFFER_SIZE_ML); }
    /** Sets the specified value to the {@link #next} field. */
    public XrWorldMeshBufferSizeML next(@NativeType("void *") long value) { nnext(address(), value); return this; }
    /** Sets the specified value to the {@link #size} field. */
    public XrWorldMeshBufferSizeML size(@NativeType("uint32_t") int value) { nsize(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public XrWorldMeshBufferSizeML set(
        int type,
        long next,
        int size
    ) {
        type(type);
        next(next);
        size(size);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public XrWorldMeshBufferSizeML set(XrWorldMeshBufferSizeML src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code XrWorldMeshBufferSizeML} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static XrWorldMeshBufferSizeML malloc() {
        return new XrWorldMeshBufferSizeML(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code XrWorldMeshBufferSizeML} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static XrWorldMeshBufferSizeML calloc() {
        return new XrWorldMeshBufferSizeML(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code XrWorldMeshBufferSizeML} instance allocated with {@link BufferUtils}. */
    public static XrWorldMeshBufferSizeML create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new XrWorldMeshBufferSizeML(memAddress(container), container);
    }

    /** Returns a new {@code XrWorldMeshBufferSizeML} instance for the specified memory address. */
    public static XrWorldMeshBufferSizeML create(long address) {
        return new XrWorldMeshBufferSizeML(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static XrWorldMeshBufferSizeML createSafe(long address) {
        return address == NULL ? null : new XrWorldMeshBufferSizeML(address, null);
    }

    /**
     * Returns a new {@link XrWorldMeshBufferSizeML.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrWorldMeshBufferSizeML.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link XrWorldMeshBufferSizeML.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrWorldMeshBufferSizeML.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrWorldMeshBufferSizeML.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static XrWorldMeshBufferSizeML.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link XrWorldMeshBufferSizeML.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static XrWorldMeshBufferSizeML.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static XrWorldMeshBufferSizeML.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code XrWorldMeshBufferSizeML} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static XrWorldMeshBufferSizeML malloc(MemoryStack stack) {
        return new XrWorldMeshBufferSizeML(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code XrWorldMeshBufferSizeML} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static XrWorldMeshBufferSizeML calloc(MemoryStack stack) {
        return new XrWorldMeshBufferSizeML(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link XrWorldMeshBufferSizeML.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrWorldMeshBufferSizeML.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrWorldMeshBufferSizeML.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrWorldMeshBufferSizeML.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #type}. */
    public static int ntype(long struct) { return UNSAFE.getInt(null, struct + XrWorldMeshBufferSizeML.TYPE); }
    /** Unsafe version of {@link #next}. */
    public static long nnext(long struct) { return memGetAddress(struct + XrWorldMeshBufferSizeML.NEXT); }
    /** Unsafe version of {@link #size}. */
    public static int nsize(long struct) { return UNSAFE.getInt(null, struct + XrWorldMeshBufferSizeML.SIZE); }

    /** Unsafe version of {@link #type(int) type}. */
    public static void ntype(long struct, int value) { UNSAFE.putInt(null, struct + XrWorldMeshBufferSizeML.TYPE, value); }
    /** Unsafe version of {@link #next(long) next}. */
    public static void nnext(long struct, long value) { memPutAddress(struct + XrWorldMeshBufferSizeML.NEXT, value); }
    /** Unsafe version of {@link #size(int) size}. */
    public static void nsize(long struct, int value) { UNSAFE.putInt(null, struct + XrWorldMeshBufferSizeML.SIZE, value); }

    // -----------------------------------

    /** An array of {@link XrWorldMeshBufferSizeML} structs. */
    public static class Buffer extends StructBuffer<XrWorldMeshBufferSizeML, Buffer> implements NativeResource {

        private static final XrWorldMeshBufferSizeML ELEMENT_FACTORY = XrWorldMeshBufferSizeML.create(-1L);

        /**
         * Creates a new {@code XrWorldMeshBufferSizeML.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link XrWorldMeshBufferSizeML#SIZEOF}, and its mark will be undefined.</p>
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
        protected XrWorldMeshBufferSizeML getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link XrWorldMeshBufferSizeML#type} field. */
        @NativeType("XrStructureType")
        public int type() { return XrWorldMeshBufferSizeML.ntype(address()); }
        /** @return the value of the {@link XrWorldMeshBufferSizeML#next} field. */
        @NativeType("void *")
        public long next() { return XrWorldMeshBufferSizeML.nnext(address()); }
        /** @return the value of the {@link XrWorldMeshBufferSizeML#size} field. */
        @NativeType("uint32_t")
        public int size() { return XrWorldMeshBufferSizeML.nsize(address()); }

        /** Sets the specified value to the {@link XrWorldMeshBufferSizeML#type} field. */
        public XrWorldMeshBufferSizeML.Buffer type(@NativeType("XrStructureType") int value) { XrWorldMeshBufferSizeML.ntype(address(), value); return this; }
        /** Sets the {@link MLWorldMeshDetection#XR_TYPE_WORLD_MESH_BUFFER_SIZE_ML TYPE_WORLD_MESH_BUFFER_SIZE_ML} value to the {@link XrWorldMeshBufferSizeML#type} field. */
        public XrWorldMeshBufferSizeML.Buffer type$Default() { return type(MLWorldMeshDetection.XR_TYPE_WORLD_MESH_BUFFER_SIZE_ML); }
        /** Sets the specified value to the {@link XrWorldMeshBufferSizeML#next} field. */
        public XrWorldMeshBufferSizeML.Buffer next(@NativeType("void *") long value) { XrWorldMeshBufferSizeML.nnext(address(), value); return this; }
        /** Sets the specified value to the {@link XrWorldMeshBufferSizeML#size} field. */
        public XrWorldMeshBufferSizeML.Buffer size(@NativeType("uint32_t") int value) { XrWorldMeshBufferSizeML.nsize(address(), value); return this; }

    }

}