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
 * struct XrHandMeshMSFT {
 *     XrStructureType type;
 *     void * next;
 *     XrBool32 isActive;
 *     XrBool32 indexBufferChanged;
 *     XrBool32 vertexBufferChanged;
 *     {@link XrHandMeshIndexBufferMSFT XrHandMeshIndexBufferMSFT} indexBuffer;
 *     {@link XrHandMeshVertexBufferMSFT XrHandMeshVertexBufferMSFT} vertexBuffer;
 * }}</pre>
 */
public class XrHandMeshMSFT extends Struct<XrHandMeshMSFT> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        TYPE,
        NEXT,
        ISACTIVE,
        INDEXBUFFERCHANGED,
        VERTEXBUFFERCHANGED,
        INDEXBUFFER,
        VERTEXBUFFER;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(4),
            __member(4),
            __member(4),
            __member(XrHandMeshIndexBufferMSFT.SIZEOF, XrHandMeshIndexBufferMSFT.ALIGNOF),
            __member(XrHandMeshVertexBufferMSFT.SIZEOF, XrHandMeshVertexBufferMSFT.ALIGNOF)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        TYPE = layout.offsetof(0);
        NEXT = layout.offsetof(1);
        ISACTIVE = layout.offsetof(2);
        INDEXBUFFERCHANGED = layout.offsetof(3);
        VERTEXBUFFERCHANGED = layout.offsetof(4);
        INDEXBUFFER = layout.offsetof(5);
        VERTEXBUFFER = layout.offsetof(6);
    }

    protected XrHandMeshMSFT(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected XrHandMeshMSFT create(long address, @Nullable ByteBuffer container) {
        return new XrHandMeshMSFT(address, container);
    }

    /**
     * Creates a {@code XrHandMeshMSFT} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public XrHandMeshMSFT(ByteBuffer container) {
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
    /** @return the value of the {@code isActive} field. */
    @NativeType("XrBool32")
    public boolean isActive() { return nisActive(address()) != 0; }
    /** @return the value of the {@code indexBufferChanged} field. */
    @NativeType("XrBool32")
    public boolean indexBufferChanged() { return nindexBufferChanged(address()) != 0; }
    /** @return the value of the {@code vertexBufferChanged} field. */
    @NativeType("XrBool32")
    public boolean vertexBufferChanged() { return nvertexBufferChanged(address()) != 0; }
    /** @return a {@link XrHandMeshIndexBufferMSFT} view of the {@code indexBuffer} field. */
    public XrHandMeshIndexBufferMSFT indexBuffer() { return nindexBuffer(address()); }
    /** @return a {@link XrHandMeshVertexBufferMSFT} view of the {@code vertexBuffer} field. */
    public XrHandMeshVertexBufferMSFT vertexBuffer() { return nvertexBuffer(address()); }

    /** Sets the specified value to the {@code type} field. */
    public XrHandMeshMSFT type(@NativeType("XrStructureType") int value) { ntype(address(), value); return this; }
    /** Sets the {@link MSFTHandTrackingMesh#XR_TYPE_HAND_MESH_MSFT TYPE_HAND_MESH_MSFT} value to the {@code type} field. */
    public XrHandMeshMSFT type$Default() { return type(MSFTHandTrackingMesh.XR_TYPE_HAND_MESH_MSFT); }
    /** Sets the specified value to the {@code next} field. */
    public XrHandMeshMSFT next(@NativeType("void *") long value) { nnext(address(), value); return this; }
    /** Sets the specified value to the {@code isActive} field. */
    public XrHandMeshMSFT isActive(@NativeType("XrBool32") boolean value) { nisActive(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@code indexBufferChanged} field. */
    public XrHandMeshMSFT indexBufferChanged(@NativeType("XrBool32") boolean value) { nindexBufferChanged(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@code vertexBufferChanged} field. */
    public XrHandMeshMSFT vertexBufferChanged(@NativeType("XrBool32") boolean value) { nvertexBufferChanged(address(), value ? 1 : 0); return this; }
    /** Copies the specified {@link XrHandMeshIndexBufferMSFT} to the {@code indexBuffer} field. */
    public XrHandMeshMSFT indexBuffer(XrHandMeshIndexBufferMSFT value) { nindexBuffer(address(), value); return this; }
    /** Passes the {@code indexBuffer} field to the specified {@link java.util.function.Consumer Consumer}. */
    public XrHandMeshMSFT indexBuffer(java.util.function.Consumer<XrHandMeshIndexBufferMSFT> consumer) { consumer.accept(indexBuffer()); return this; }
    /** Copies the specified {@link XrHandMeshVertexBufferMSFT} to the {@code vertexBuffer} field. */
    public XrHandMeshMSFT vertexBuffer(XrHandMeshVertexBufferMSFT value) { nvertexBuffer(address(), value); return this; }
    /** Passes the {@code vertexBuffer} field to the specified {@link java.util.function.Consumer Consumer}. */
    public XrHandMeshMSFT vertexBuffer(java.util.function.Consumer<XrHandMeshVertexBufferMSFT> consumer) { consumer.accept(vertexBuffer()); return this; }

    /** Initializes this struct with the specified values. */
    public XrHandMeshMSFT set(
        int type,
        long next,
        boolean isActive,
        boolean indexBufferChanged,
        boolean vertexBufferChanged,
        XrHandMeshIndexBufferMSFT indexBuffer,
        XrHandMeshVertexBufferMSFT vertexBuffer
    ) {
        type(type);
        next(next);
        isActive(isActive);
        indexBufferChanged(indexBufferChanged);
        vertexBufferChanged(vertexBufferChanged);
        indexBuffer(indexBuffer);
        vertexBuffer(vertexBuffer);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public XrHandMeshMSFT set(XrHandMeshMSFT src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code XrHandMeshMSFT} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static XrHandMeshMSFT malloc() {
        return new XrHandMeshMSFT(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code XrHandMeshMSFT} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static XrHandMeshMSFT calloc() {
        return new XrHandMeshMSFT(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code XrHandMeshMSFT} instance allocated with {@link BufferUtils}. */
    public static XrHandMeshMSFT create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new XrHandMeshMSFT(memAddress(container), container);
    }

    /** Returns a new {@code XrHandMeshMSFT} instance for the specified memory address. */
    public static XrHandMeshMSFT create(long address) {
        return new XrHandMeshMSFT(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable XrHandMeshMSFT createSafe(long address) {
        return address == NULL ? null : new XrHandMeshMSFT(address, null);
    }

    /**
     * Returns a new {@link XrHandMeshMSFT.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrHandMeshMSFT.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link XrHandMeshMSFT.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrHandMeshMSFT.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrHandMeshMSFT.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static XrHandMeshMSFT.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link XrHandMeshMSFT.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static XrHandMeshMSFT.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static XrHandMeshMSFT.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code XrHandMeshMSFT} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static XrHandMeshMSFT malloc(MemoryStack stack) {
        return new XrHandMeshMSFT(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code XrHandMeshMSFT} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static XrHandMeshMSFT calloc(MemoryStack stack) {
        return new XrHandMeshMSFT(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link XrHandMeshMSFT.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrHandMeshMSFT.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrHandMeshMSFT.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrHandMeshMSFT.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #type}. */
    public static int ntype(long struct) { return memGetInt(struct + XrHandMeshMSFT.TYPE); }
    /** Unsafe version of {@link #next}. */
    public static long nnext(long struct) { return memGetAddress(struct + XrHandMeshMSFT.NEXT); }
    /** Unsafe version of {@link #isActive}. */
    public static int nisActive(long struct) { return memGetInt(struct + XrHandMeshMSFT.ISACTIVE); }
    /** Unsafe version of {@link #indexBufferChanged}. */
    public static int nindexBufferChanged(long struct) { return memGetInt(struct + XrHandMeshMSFT.INDEXBUFFERCHANGED); }
    /** Unsafe version of {@link #vertexBufferChanged}. */
    public static int nvertexBufferChanged(long struct) { return memGetInt(struct + XrHandMeshMSFT.VERTEXBUFFERCHANGED); }
    /** Unsafe version of {@link #indexBuffer}. */
    public static XrHandMeshIndexBufferMSFT nindexBuffer(long struct) { return XrHandMeshIndexBufferMSFT.create(struct + XrHandMeshMSFT.INDEXBUFFER); }
    /** Unsafe version of {@link #vertexBuffer}. */
    public static XrHandMeshVertexBufferMSFT nvertexBuffer(long struct) { return XrHandMeshVertexBufferMSFT.create(struct + XrHandMeshMSFT.VERTEXBUFFER); }

    /** Unsafe version of {@link #type(int) type}. */
    public static void ntype(long struct, int value) { memPutInt(struct + XrHandMeshMSFT.TYPE, value); }
    /** Unsafe version of {@link #next(long) next}. */
    public static void nnext(long struct, long value) { memPutAddress(struct + XrHandMeshMSFT.NEXT, value); }
    /** Unsafe version of {@link #isActive(boolean) isActive}. */
    public static void nisActive(long struct, int value) { memPutInt(struct + XrHandMeshMSFT.ISACTIVE, value); }
    /** Unsafe version of {@link #indexBufferChanged(boolean) indexBufferChanged}. */
    public static void nindexBufferChanged(long struct, int value) { memPutInt(struct + XrHandMeshMSFT.INDEXBUFFERCHANGED, value); }
    /** Unsafe version of {@link #vertexBufferChanged(boolean) vertexBufferChanged}. */
    public static void nvertexBufferChanged(long struct, int value) { memPutInt(struct + XrHandMeshMSFT.VERTEXBUFFERCHANGED, value); }
    /** Unsafe version of {@link #indexBuffer(XrHandMeshIndexBufferMSFT) indexBuffer}. */
    public static void nindexBuffer(long struct, XrHandMeshIndexBufferMSFT value) { memCopy(value.address(), struct + XrHandMeshMSFT.INDEXBUFFER, XrHandMeshIndexBufferMSFT.SIZEOF); }
    /** Unsafe version of {@link #vertexBuffer(XrHandMeshVertexBufferMSFT) vertexBuffer}. */
    public static void nvertexBuffer(long struct, XrHandMeshVertexBufferMSFT value) { memCopy(value.address(), struct + XrHandMeshMSFT.VERTEXBUFFER, XrHandMeshVertexBufferMSFT.SIZEOF); }

    // -----------------------------------

    /** An array of {@link XrHandMeshMSFT} structs. */
    public static class Buffer extends StructBuffer<XrHandMeshMSFT, Buffer> implements NativeResource {

        private static final XrHandMeshMSFT ELEMENT_FACTORY = XrHandMeshMSFT.create(-1L);

        /**
         * Creates a new {@code XrHandMeshMSFT.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link XrHandMeshMSFT#SIZEOF}, and its mark will be undefined.</p>
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
        protected XrHandMeshMSFT getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code type} field. */
        @NativeType("XrStructureType")
        public int type() { return XrHandMeshMSFT.ntype(address()); }
        /** @return the value of the {@code next} field. */
        @NativeType("void *")
        public long next() { return XrHandMeshMSFT.nnext(address()); }
        /** @return the value of the {@code isActive} field. */
        @NativeType("XrBool32")
        public boolean isActive() { return XrHandMeshMSFT.nisActive(address()) != 0; }
        /** @return the value of the {@code indexBufferChanged} field. */
        @NativeType("XrBool32")
        public boolean indexBufferChanged() { return XrHandMeshMSFT.nindexBufferChanged(address()) != 0; }
        /** @return the value of the {@code vertexBufferChanged} field. */
        @NativeType("XrBool32")
        public boolean vertexBufferChanged() { return XrHandMeshMSFT.nvertexBufferChanged(address()) != 0; }
        /** @return a {@link XrHandMeshIndexBufferMSFT} view of the {@code indexBuffer} field. */
        public XrHandMeshIndexBufferMSFT indexBuffer() { return XrHandMeshMSFT.nindexBuffer(address()); }
        /** @return a {@link XrHandMeshVertexBufferMSFT} view of the {@code vertexBuffer} field. */
        public XrHandMeshVertexBufferMSFT vertexBuffer() { return XrHandMeshMSFT.nvertexBuffer(address()); }

        /** Sets the specified value to the {@code type} field. */
        public XrHandMeshMSFT.Buffer type(@NativeType("XrStructureType") int value) { XrHandMeshMSFT.ntype(address(), value); return this; }
        /** Sets the {@link MSFTHandTrackingMesh#XR_TYPE_HAND_MESH_MSFT TYPE_HAND_MESH_MSFT} value to the {@code type} field. */
        public XrHandMeshMSFT.Buffer type$Default() { return type(MSFTHandTrackingMesh.XR_TYPE_HAND_MESH_MSFT); }
        /** Sets the specified value to the {@code next} field. */
        public XrHandMeshMSFT.Buffer next(@NativeType("void *") long value) { XrHandMeshMSFT.nnext(address(), value); return this; }
        /** Sets the specified value to the {@code isActive} field. */
        public XrHandMeshMSFT.Buffer isActive(@NativeType("XrBool32") boolean value) { XrHandMeshMSFT.nisActive(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@code indexBufferChanged} field. */
        public XrHandMeshMSFT.Buffer indexBufferChanged(@NativeType("XrBool32") boolean value) { XrHandMeshMSFT.nindexBufferChanged(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@code vertexBufferChanged} field. */
        public XrHandMeshMSFT.Buffer vertexBufferChanged(@NativeType("XrBool32") boolean value) { XrHandMeshMSFT.nvertexBufferChanged(address(), value ? 1 : 0); return this; }
        /** Copies the specified {@link XrHandMeshIndexBufferMSFT} to the {@code indexBuffer} field. */
        public XrHandMeshMSFT.Buffer indexBuffer(XrHandMeshIndexBufferMSFT value) { XrHandMeshMSFT.nindexBuffer(address(), value); return this; }
        /** Passes the {@code indexBuffer} field to the specified {@link java.util.function.Consumer Consumer}. */
        public XrHandMeshMSFT.Buffer indexBuffer(java.util.function.Consumer<XrHandMeshIndexBufferMSFT> consumer) { consumer.accept(indexBuffer()); return this; }
        /** Copies the specified {@link XrHandMeshVertexBufferMSFT} to the {@code vertexBuffer} field. */
        public XrHandMeshMSFT.Buffer vertexBuffer(XrHandMeshVertexBufferMSFT value) { XrHandMeshMSFT.nvertexBuffer(address(), value); return this; }
        /** Passes the {@code vertexBuffer} field to the specified {@link java.util.function.Consumer Consumer}. */
        public XrHandMeshMSFT.Buffer vertexBuffer(java.util.function.Consumer<XrHandMeshVertexBufferMSFT> consumer) { consumer.accept(vertexBuffer()); return this; }

    }

}