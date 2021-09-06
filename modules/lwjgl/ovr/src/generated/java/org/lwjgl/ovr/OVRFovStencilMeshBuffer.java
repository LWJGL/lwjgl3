/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.ovr;

import javax.annotation.*;

import java.nio.*;

import org.lwjgl.*;
import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * Contains the data for the fov-stencil mesh. Parts of the struct are filled by the caller while some parts are filled by the SDK.
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct ovrFovStencilMeshBuffer {
 *     int {@link #AllocVertexCount};
 *     int {@link #UsedVertexCount};
 *     {@link OVRVector2f ovrVector2f} * {@link #VertexBuffer};
 *     int {@link #AllocIndexCount};
 *     int {@link #UsedIndexCount};
 *     uint16_t * {@link #IndexBuffer};
 * }</code></pre>
 */
@NativeType("struct ovrFovStencilMeshBuffer")
public class OVRFovStencilMeshBuffer extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        ALLOCVERTEXCOUNT,
        USEDVERTEXCOUNT,
        VERTEXBUFFER,
        ALLOCINDEXCOUNT,
        USEDINDEXCOUNT,
        INDEXBUFFER;

    static {
        Layout layout = __struct(
            __member(4),
            __member(4),
            __member(POINTER_SIZE),
            __member(4),
            __member(4),
            __member(POINTER_SIZE)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        ALLOCVERTEXCOUNT = layout.offsetof(0);
        USEDVERTEXCOUNT = layout.offsetof(1);
        VERTEXBUFFER = layout.offsetof(2);
        ALLOCINDEXCOUNT = layout.offsetof(3);
        USEDINDEXCOUNT = layout.offsetof(4);
        INDEXBUFFER = layout.offsetof(5);
    }

    /**
     * Creates a {@code OVRFovStencilMeshBuffer} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public OVRFovStencilMeshBuffer(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** to be filled in by caller of {@link OVR#ovr_GetFovStencil GetFovStencil} */
    public int AllocVertexCount() { return nAllocVertexCount(address()); }
    /** to be filled in by SDK and returned to caller */
    public int UsedVertexCount() { return nUsedVertexCount(address()); }
    /** to be allocated by caller and filled in by SDK */
    @Nullable
    @NativeType("ovrVector2f *")
    public OVRVector2f.Buffer VertexBuffer() { return nVertexBuffer(address()); }
    /** to be filled in by caller of {@link OVR#ovr_GetFovStencil GetFovStencil} */
    public int AllocIndexCount() { return nAllocIndexCount(address()); }
    /** to be filled in by SDK and returned to caller */
    public int UsedIndexCount() { return nUsedIndexCount(address()); }
    /** to be allocated by caller and filled in by SDK */
    @Nullable
    @NativeType("uint16_t *")
    public ShortBuffer IndexBuffer() { return nIndexBuffer(address()); }

    /** Sets the specified value to the {@link #AllocVertexCount} field. */
    public OVRFovStencilMeshBuffer AllocVertexCount(int value) { nAllocVertexCount(address(), value); return this; }
    /** Sets the specified value to the {@link #UsedVertexCount} field. */
    public OVRFovStencilMeshBuffer UsedVertexCount(int value) { nUsedVertexCount(address(), value); return this; }
    /** Sets the address of the specified {@link OVRVector2f.Buffer} to the {@link #VertexBuffer} field. */
    public OVRFovStencilMeshBuffer VertexBuffer(@Nullable @NativeType("ovrVector2f *") OVRVector2f.Buffer value) { nVertexBuffer(address(), value); return this; }
    /** Sets the specified value to the {@link #AllocIndexCount} field. */
    public OVRFovStencilMeshBuffer AllocIndexCount(int value) { nAllocIndexCount(address(), value); return this; }
    /** Sets the specified value to the {@link #UsedIndexCount} field. */
    public OVRFovStencilMeshBuffer UsedIndexCount(int value) { nUsedIndexCount(address(), value); return this; }
    /** Sets the address of the specified {@link ShortBuffer} to the {@link #IndexBuffer} field. */
    public OVRFovStencilMeshBuffer IndexBuffer(@Nullable @NativeType("uint16_t *") ShortBuffer value) { nIndexBuffer(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public OVRFovStencilMeshBuffer set(
        int AllocVertexCount,
        int UsedVertexCount,
        @Nullable OVRVector2f.Buffer VertexBuffer,
        int AllocIndexCount,
        int UsedIndexCount,
        @Nullable ShortBuffer IndexBuffer
    ) {
        AllocVertexCount(AllocVertexCount);
        UsedVertexCount(UsedVertexCount);
        VertexBuffer(VertexBuffer);
        AllocIndexCount(AllocIndexCount);
        UsedIndexCount(UsedIndexCount);
        IndexBuffer(IndexBuffer);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public OVRFovStencilMeshBuffer set(OVRFovStencilMeshBuffer src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code OVRFovStencilMeshBuffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static OVRFovStencilMeshBuffer malloc() {
        return wrap(OVRFovStencilMeshBuffer.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code OVRFovStencilMeshBuffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static OVRFovStencilMeshBuffer calloc() {
        return wrap(OVRFovStencilMeshBuffer.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code OVRFovStencilMeshBuffer} instance allocated with {@link BufferUtils}. */
    public static OVRFovStencilMeshBuffer create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(OVRFovStencilMeshBuffer.class, memAddress(container), container);
    }

    /** Returns a new {@code OVRFovStencilMeshBuffer} instance for the specified memory address. */
    public static OVRFovStencilMeshBuffer create(long address) {
        return wrap(OVRFovStencilMeshBuffer.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static OVRFovStencilMeshBuffer createSafe(long address) {
        return address == NULL ? null : wrap(OVRFovStencilMeshBuffer.class, address);
    }

    /**
     * Returns a new {@link OVRFovStencilMeshBuffer.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static OVRFovStencilMeshBuffer.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link OVRFovStencilMeshBuffer.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static OVRFovStencilMeshBuffer.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link OVRFovStencilMeshBuffer.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static OVRFovStencilMeshBuffer.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link OVRFovStencilMeshBuffer.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static OVRFovStencilMeshBuffer.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static OVRFovStencilMeshBuffer.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    // -----------------------------------

    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static OVRFovStencilMeshBuffer mallocStack() { return malloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static OVRFovStencilMeshBuffer callocStack() { return calloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static OVRFovStencilMeshBuffer mallocStack(MemoryStack stack) { return malloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static OVRFovStencilMeshBuffer callocStack(MemoryStack stack) { return calloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static OVRFovStencilMeshBuffer.Buffer mallocStack(int capacity) { return malloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static OVRFovStencilMeshBuffer.Buffer callocStack(int capacity) { return calloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static OVRFovStencilMeshBuffer.Buffer mallocStack(int capacity, MemoryStack stack) { return malloc(capacity, stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static OVRFovStencilMeshBuffer.Buffer callocStack(int capacity, MemoryStack stack) { return calloc(capacity, stack); }

    /**
     * Returns a new {@code OVRFovStencilMeshBuffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static OVRFovStencilMeshBuffer malloc(MemoryStack stack) {
        return wrap(OVRFovStencilMeshBuffer.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code OVRFovStencilMeshBuffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static OVRFovStencilMeshBuffer calloc(MemoryStack stack) {
        return wrap(OVRFovStencilMeshBuffer.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link OVRFovStencilMeshBuffer.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static OVRFovStencilMeshBuffer.Buffer malloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link OVRFovStencilMeshBuffer.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static OVRFovStencilMeshBuffer.Buffer calloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #AllocVertexCount}. */
    public static int nAllocVertexCount(long struct) { return UNSAFE.getInt(null, struct + OVRFovStencilMeshBuffer.ALLOCVERTEXCOUNT); }
    /** Unsafe version of {@link #UsedVertexCount}. */
    public static int nUsedVertexCount(long struct) { return UNSAFE.getInt(null, struct + OVRFovStencilMeshBuffer.USEDVERTEXCOUNT); }
    /** Unsafe version of {@link #VertexBuffer}. */
    @Nullable public static OVRVector2f.Buffer nVertexBuffer(long struct) { return OVRVector2f.createSafe(memGetAddress(struct + OVRFovStencilMeshBuffer.VERTEXBUFFER), nAllocVertexCount(struct)); }
    /** Unsafe version of {@link #AllocIndexCount}. */
    public static int nAllocIndexCount(long struct) { return UNSAFE.getInt(null, struct + OVRFovStencilMeshBuffer.ALLOCINDEXCOUNT); }
    /** Unsafe version of {@link #UsedIndexCount}. */
    public static int nUsedIndexCount(long struct) { return UNSAFE.getInt(null, struct + OVRFovStencilMeshBuffer.USEDINDEXCOUNT); }
    /** Unsafe version of {@link #IndexBuffer() IndexBuffer}. */
    @Nullable public static ShortBuffer nIndexBuffer(long struct) { return memShortBufferSafe(memGetAddress(struct + OVRFovStencilMeshBuffer.INDEXBUFFER), nAllocIndexCount(struct)); }

    /** Sets the specified value to the {@code AllocVertexCount} field of the specified {@code struct}. */
    public static void nAllocVertexCount(long struct, int value) { UNSAFE.putInt(null, struct + OVRFovStencilMeshBuffer.ALLOCVERTEXCOUNT, value); }
    /** Unsafe version of {@link #UsedVertexCount(int) UsedVertexCount}. */
    public static void nUsedVertexCount(long struct, int value) { UNSAFE.putInt(null, struct + OVRFovStencilMeshBuffer.USEDVERTEXCOUNT, value); }
    /** Unsafe version of {@link #VertexBuffer(OVRVector2f.Buffer) VertexBuffer}. */
    public static void nVertexBuffer(long struct, @Nullable OVRVector2f.Buffer value) { memPutAddress(struct + OVRFovStencilMeshBuffer.VERTEXBUFFER, memAddressSafe(value)); nAllocVertexCount(struct, value == null ? 0 : value.remaining()); }
    /** Sets the specified value to the {@code AllocIndexCount} field of the specified {@code struct}. */
    public static void nAllocIndexCount(long struct, int value) { UNSAFE.putInt(null, struct + OVRFovStencilMeshBuffer.ALLOCINDEXCOUNT, value); }
    /** Unsafe version of {@link #UsedIndexCount(int) UsedIndexCount}. */
    public static void nUsedIndexCount(long struct, int value) { UNSAFE.putInt(null, struct + OVRFovStencilMeshBuffer.USEDINDEXCOUNT, value); }
    /** Unsafe version of {@link #IndexBuffer(ShortBuffer) IndexBuffer}. */
    public static void nIndexBuffer(long struct, @Nullable ShortBuffer value) { memPutAddress(struct + OVRFovStencilMeshBuffer.INDEXBUFFER, memAddressSafe(value)); nAllocIndexCount(struct, value == null ? 0 : value.remaining()); }

    // -----------------------------------

    /** An array of {@link OVRFovStencilMeshBuffer} structs. */
    public static class Buffer extends StructBuffer<OVRFovStencilMeshBuffer, Buffer> implements NativeResource {

        private static final OVRFovStencilMeshBuffer ELEMENT_FACTORY = OVRFovStencilMeshBuffer.create(-1L);

        /**
         * Creates a new {@code OVRFovStencilMeshBuffer.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link OVRFovStencilMeshBuffer#SIZEOF}, and its mark will be undefined.
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
        protected OVRFovStencilMeshBuffer getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link OVRFovStencilMeshBuffer#AllocVertexCount} field. */
        public int AllocVertexCount() { return OVRFovStencilMeshBuffer.nAllocVertexCount(address()); }
        /** @return the value of the {@link OVRFovStencilMeshBuffer#UsedVertexCount} field. */
        public int UsedVertexCount() { return OVRFovStencilMeshBuffer.nUsedVertexCount(address()); }
        /** @return a {@link OVRVector2f.Buffer} view of the struct array pointed to by the {@link OVRFovStencilMeshBuffer#VertexBuffer} field. */
        @Nullable
        @NativeType("ovrVector2f *")
        public OVRVector2f.Buffer VertexBuffer() { return OVRFovStencilMeshBuffer.nVertexBuffer(address()); }
        /** @return the value of the {@link OVRFovStencilMeshBuffer#AllocIndexCount} field. */
        public int AllocIndexCount() { return OVRFovStencilMeshBuffer.nAllocIndexCount(address()); }
        /** @return the value of the {@link OVRFovStencilMeshBuffer#UsedIndexCount} field. */
        public int UsedIndexCount() { return OVRFovStencilMeshBuffer.nUsedIndexCount(address()); }
        /** @return a {@link ShortBuffer} view of the data pointed to by the {@link OVRFovStencilMeshBuffer#IndexBuffer} field. */
        @Nullable
        @NativeType("uint16_t *")
        public ShortBuffer IndexBuffer() { return OVRFovStencilMeshBuffer.nIndexBuffer(address()); }

        /** Sets the specified value to the {@link OVRFovStencilMeshBuffer#AllocVertexCount} field. */
        public OVRFovStencilMeshBuffer.Buffer AllocVertexCount(int value) { OVRFovStencilMeshBuffer.nAllocVertexCount(address(), value); return this; }
        /** Sets the specified value to the {@link OVRFovStencilMeshBuffer#UsedVertexCount} field. */
        public OVRFovStencilMeshBuffer.Buffer UsedVertexCount(int value) { OVRFovStencilMeshBuffer.nUsedVertexCount(address(), value); return this; }
        /** Sets the address of the specified {@link OVRVector2f.Buffer} to the {@link OVRFovStencilMeshBuffer#VertexBuffer} field. */
        public OVRFovStencilMeshBuffer.Buffer VertexBuffer(@Nullable @NativeType("ovrVector2f *") OVRVector2f.Buffer value) { OVRFovStencilMeshBuffer.nVertexBuffer(address(), value); return this; }
        /** Sets the specified value to the {@link OVRFovStencilMeshBuffer#AllocIndexCount} field. */
        public OVRFovStencilMeshBuffer.Buffer AllocIndexCount(int value) { OVRFovStencilMeshBuffer.nAllocIndexCount(address(), value); return this; }
        /** Sets the specified value to the {@link OVRFovStencilMeshBuffer#UsedIndexCount} field. */
        public OVRFovStencilMeshBuffer.Buffer UsedIndexCount(int value) { OVRFovStencilMeshBuffer.nUsedIndexCount(address(), value); return this; }
        /** Sets the address of the specified {@link ShortBuffer} to the {@link OVRFovStencilMeshBuffer#IndexBuffer} field. */
        public OVRFovStencilMeshBuffer.Buffer IndexBuffer(@Nullable @NativeType("uint16_t *") ShortBuffer value) { OVRFovStencilMeshBuffer.nIndexBuffer(address(), value); return this; }

    }

}