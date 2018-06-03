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

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * <h3>Member documentation</h3>
 * 
 * <ul>
 * <li>{@code AllocVertexCount} &ndash; to be filled in by caller of {@link OVR#ovr_GetViewportStencil GetViewportStencil}</li>
 * <li>{@code UsedVertexCount} &ndash; to be filled in by SDK and returned to caller</li>
 * <li>{@code VertexBuffer} &ndash; to be allocated by caller and filled in by SDK</li>
 * <li>{@code AllocIndexCount} &ndash; to be filled in by caller of {@link OVR#ovr_GetViewportStencil GetViewportStencil}</li>
 * <li>{@code UsedIndexCount} &ndash; to be filled in by SDK and returned to caller</li>
 * <li>{@code IndexBuffer} &ndash; to be allocated by caller and filled in by SDK</li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct ovrViewportStencilMeshBuffer {
 *     int AllocVertexCount;
 *     int UsedVertexCount;
 *     {@link OVRVector2f ovrVector2f} * VertexBuffer;
 *     int AllocIndexCount;
 *     int UsedIndexCount;
 *     uint16_t * IndexBuffer;
 * }</code></pre>
 */
@NativeType("struct ovrViewportStencilMeshBuffer")
public class OVRViewportStencilMeshBuffer extends Struct implements NativeResource {

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

    OVRViewportStencilMeshBuffer(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    /**
     * Creates a {@link OVRViewportStencilMeshBuffer} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public OVRViewportStencilMeshBuffer(ByteBuffer container) {
        this(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** Returns the value of the {@code AllocVertexCount} field. */
    public int AllocVertexCount() { return nAllocVertexCount(address()); }
    /** Returns the value of the {@code UsedVertexCount} field. */
    public int UsedVertexCount() { return nUsedVertexCount(address()); }
    /** Returns a {@link OVRVector2f.Buffer} view of the struct array pointed to by the {@code VertexBuffer} field. */
    @NativeType("ovrVector2f *")
    public OVRVector2f.Buffer VertexBuffer() { return nVertexBuffer(address()); }
    /** Returns the value of the {@code AllocIndexCount} field. */
    public int AllocIndexCount() { return nAllocIndexCount(address()); }
    /** Returns the value of the {@code UsedIndexCount} field. */
    public int UsedIndexCount() { return nUsedIndexCount(address()); }
    /** Returns a {@link ShortBuffer} view of the data pointed to by the {@code IndexBuffer} field. */
    @NativeType("uint16_t *")
    public ShortBuffer IndexBuffer() { return nIndexBuffer(address()); }

    /** Sets the specified value to the {@code UsedVertexCount} field. */
    public OVRViewportStencilMeshBuffer UsedVertexCount(int value) { nUsedVertexCount(address(), value); return this; }
    /** Sets the address of the specified {@link OVRVector2f.Buffer} to the {@code VertexBuffer} field. */
    public OVRViewportStencilMeshBuffer VertexBuffer(@NativeType("ovrVector2f *") OVRVector2f.Buffer value) { nVertexBuffer(address(), value); return this; }
    /** Sets the specified value to the {@code UsedIndexCount} field. */
    public OVRViewportStencilMeshBuffer UsedIndexCount(int value) { nUsedIndexCount(address(), value); return this; }
    /** Sets the address of the specified {@link ShortBuffer} to the {@code IndexBuffer} field. */
    public OVRViewportStencilMeshBuffer IndexBuffer(@NativeType("uint16_t *") ShortBuffer value) { nIndexBuffer(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public OVRViewportStencilMeshBuffer set(
        int UsedVertexCount,
        OVRVector2f.Buffer VertexBuffer,
        int UsedIndexCount,
        ShortBuffer IndexBuffer
    ) {
        UsedVertexCount(UsedVertexCount);
        VertexBuffer(VertexBuffer);
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
    public OVRViewportStencilMeshBuffer set(OVRViewportStencilMeshBuffer src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@link OVRViewportStencilMeshBuffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static OVRViewportStencilMeshBuffer malloc() {
        return create(nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@link OVRViewportStencilMeshBuffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static OVRViewportStencilMeshBuffer calloc() {
        return create(nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@link OVRViewportStencilMeshBuffer} instance allocated with {@link BufferUtils}. */
    public static OVRViewportStencilMeshBuffer create() {
        return new OVRViewportStencilMeshBuffer(BufferUtils.createByteBuffer(SIZEOF));
    }

    /** Returns a new {@link OVRViewportStencilMeshBuffer} instance for the specified memory address. */
    public static OVRViewportStencilMeshBuffer create(long address) {
        return new OVRViewportStencilMeshBuffer(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static OVRViewportStencilMeshBuffer createSafe(long address) {
        return address == NULL ? null : create(address);
    }

    /**
     * Returns a new {@link OVRViewportStencilMeshBuffer.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static OVRViewportStencilMeshBuffer.Buffer malloc(int capacity) {
        return create(__malloc(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link OVRViewportStencilMeshBuffer.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static OVRViewportStencilMeshBuffer.Buffer calloc(int capacity) {
        return create(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link OVRViewportStencilMeshBuffer.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static OVRViewportStencilMeshBuffer.Buffer create(int capacity) {
        return new Buffer(__create(capacity, SIZEOF));
    }

    /**
     * Create a {@link OVRViewportStencilMeshBuffer.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static OVRViewportStencilMeshBuffer.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static OVRViewportStencilMeshBuffer.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : create(address, capacity);
    }

    // -----------------------------------

    /** Returns a new {@link OVRViewportStencilMeshBuffer} instance allocated on the thread-local {@link MemoryStack}. */
    public static OVRViewportStencilMeshBuffer mallocStack() {
        return mallocStack(stackGet());
    }

    /** Returns a new {@link OVRViewportStencilMeshBuffer} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero. */
    public static OVRViewportStencilMeshBuffer callocStack() {
        return callocStack(stackGet());
    }

    /**
     * Returns a new {@link OVRViewportStencilMeshBuffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static OVRViewportStencilMeshBuffer mallocStack(MemoryStack stack) {
        return create(stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@link OVRViewportStencilMeshBuffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static OVRViewportStencilMeshBuffer callocStack(MemoryStack stack) {
        return create(stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link OVRViewportStencilMeshBuffer.Buffer} instance allocated on the thread-local {@link MemoryStack}.
     *
     * @param capacity the buffer capacity
     */
    public static OVRViewportStencilMeshBuffer.Buffer mallocStack(int capacity) {
        return mallocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link OVRViewportStencilMeshBuffer.Buffer} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param capacity the buffer capacity
     */
    public static OVRViewportStencilMeshBuffer.Buffer callocStack(int capacity) {
        return callocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link OVRViewportStencilMeshBuffer.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static OVRViewportStencilMeshBuffer.Buffer mallocStack(int capacity, MemoryStack stack) {
        return create(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link OVRViewportStencilMeshBuffer.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static OVRViewportStencilMeshBuffer.Buffer callocStack(int capacity, MemoryStack stack) {
        return create(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #AllocVertexCount}. */
    public static int nAllocVertexCount(long struct) { return memGetInt(struct + OVRViewportStencilMeshBuffer.ALLOCVERTEXCOUNT); }
    /** Unsafe version of {@link #UsedVertexCount}. */
    public static int nUsedVertexCount(long struct) { return memGetInt(struct + OVRViewportStencilMeshBuffer.USEDVERTEXCOUNT); }
    /** Unsafe version of {@link #VertexBuffer}. */
    public static OVRVector2f.Buffer nVertexBuffer(long struct) { return OVRVector2f.create(memGetAddress(struct + OVRViewportStencilMeshBuffer.VERTEXBUFFER), nAllocVertexCount(struct)); }
    /** Unsafe version of {@link #AllocIndexCount}. */
    public static int nAllocIndexCount(long struct) { return memGetInt(struct + OVRViewportStencilMeshBuffer.ALLOCINDEXCOUNT); }
    /** Unsafe version of {@link #UsedIndexCount}. */
    public static int nUsedIndexCount(long struct) { return memGetInt(struct + OVRViewportStencilMeshBuffer.USEDINDEXCOUNT); }
    /** Unsafe version of {@link #IndexBuffer() IndexBuffer}. */
    public static ShortBuffer nIndexBuffer(long struct) { return memShortBuffer(memGetAddress(struct + OVRViewportStencilMeshBuffer.INDEXBUFFER), nAllocIndexCount(struct)); }

    /** Sets the specified value to the {@code AllocVertexCount} field of the specified {@code struct}. */
    public static void nAllocVertexCount(long struct, int value) { memPutInt(struct + OVRViewportStencilMeshBuffer.ALLOCVERTEXCOUNT, value); }
    /** Unsafe version of {@link #UsedVertexCount(int) UsedVertexCount}. */
    public static void nUsedVertexCount(long struct, int value) { memPutInt(struct + OVRViewportStencilMeshBuffer.USEDVERTEXCOUNT, value); }
    /** Unsafe version of {@link #VertexBuffer(OVRVector2f.Buffer) VertexBuffer}. */
    public static void nVertexBuffer(long struct, OVRVector2f.Buffer value) { memPutAddress(struct + OVRViewportStencilMeshBuffer.VERTEXBUFFER, value.address()); nAllocVertexCount(struct, value.remaining()); }
    /** Sets the specified value to the {@code AllocIndexCount} field of the specified {@code struct}. */
    public static void nAllocIndexCount(long struct, int value) { memPutInt(struct + OVRViewportStencilMeshBuffer.ALLOCINDEXCOUNT, value); }
    /** Unsafe version of {@link #UsedIndexCount(int) UsedIndexCount}. */
    public static void nUsedIndexCount(long struct, int value) { memPutInt(struct + OVRViewportStencilMeshBuffer.USEDINDEXCOUNT, value); }
    /** Unsafe version of {@link #IndexBuffer(ShortBuffer) IndexBuffer}. */
    public static void nIndexBuffer(long struct, ShortBuffer value) { memPutAddress(struct + OVRViewportStencilMeshBuffer.INDEXBUFFER, memAddress(value)); nAllocIndexCount(struct, value.remaining()); }

    /**
     * Validates pointer members that should not be {@code NULL}.
     *
     * @param struct the struct to validate
     */
    public static void validate(long struct) {
        check(memGetAddress(struct + OVRViewportStencilMeshBuffer.VERTEXBUFFER));
        check(memGetAddress(struct + OVRViewportStencilMeshBuffer.INDEXBUFFER));
    }

    /**
     * Calls {@link #validate(long)} for each struct contained in the specified struct array.
     *
     * @param array the struct array to validate
     * @param count the number of structs in {@code array}
     */
    public static void validate(long array, int count) {
        for (int i = 0; i < count; i++) {
            validate(array + i * SIZEOF);
        }
    }

    // -----------------------------------

    /** An array of {@link OVRViewportStencilMeshBuffer} structs. */
    public static class Buffer extends StructBuffer<OVRViewportStencilMeshBuffer, Buffer> implements NativeResource {

        /**
         * Creates a new {@link OVRViewportStencilMeshBuffer.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link OVRViewportStencilMeshBuffer#SIZEOF}, and its mark will be undefined.
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
        protected Buffer newBufferInstance(long address, @Nullable ByteBuffer container, int mark, int pos, int lim, int cap) {
            return new Buffer(address, container, mark, pos, lim, cap);
        }

        @Override
        protected OVRViewportStencilMeshBuffer newInstance(long address) {
            return new OVRViewportStencilMeshBuffer(address, container);
        }

        @Override
        public int sizeof() {
            return SIZEOF;
        }

        /** Returns the value of the {@code AllocVertexCount} field. */
        public int AllocVertexCount() { return OVRViewportStencilMeshBuffer.nAllocVertexCount(address()); }
        /** Returns the value of the {@code UsedVertexCount} field. */
        public int UsedVertexCount() { return OVRViewportStencilMeshBuffer.nUsedVertexCount(address()); }
        /** Returns a {@link OVRVector2f.Buffer} view of the struct array pointed to by the {@code VertexBuffer} field. */
        @NativeType("ovrVector2f *")
        public OVRVector2f.Buffer VertexBuffer() { return OVRViewportStencilMeshBuffer.nVertexBuffer(address()); }
        /** Returns the value of the {@code AllocIndexCount} field. */
        public int AllocIndexCount() { return OVRViewportStencilMeshBuffer.nAllocIndexCount(address()); }
        /** Returns the value of the {@code UsedIndexCount} field. */
        public int UsedIndexCount() { return OVRViewportStencilMeshBuffer.nUsedIndexCount(address()); }
        /** Returns a {@link ShortBuffer} view of the data pointed to by the {@code IndexBuffer} field. */
        @NativeType("uint16_t *")
        public ShortBuffer IndexBuffer() { return OVRViewportStencilMeshBuffer.nIndexBuffer(address()); }

        /** Sets the specified value to the {@code UsedVertexCount} field. */
        public OVRViewportStencilMeshBuffer.Buffer UsedVertexCount(int value) { OVRViewportStencilMeshBuffer.nUsedVertexCount(address(), value); return this; }
        /** Sets the address of the specified {@link OVRVector2f.Buffer} to the {@code VertexBuffer} field. */
        public OVRViewportStencilMeshBuffer.Buffer VertexBuffer(@NativeType("ovrVector2f *") OVRVector2f.Buffer value) { OVRViewportStencilMeshBuffer.nVertexBuffer(address(), value); return this; }
        /** Sets the specified value to the {@code UsedIndexCount} field. */
        public OVRViewportStencilMeshBuffer.Buffer UsedIndexCount(int value) { OVRViewportStencilMeshBuffer.nUsedIndexCount(address(), value); return this; }
        /** Sets the address of the specified {@link ShortBuffer} to the {@code IndexBuffer} field. */
        public OVRViewportStencilMeshBuffer.Buffer IndexBuffer(@NativeType("uint16_t *") ShortBuffer value) { OVRViewportStencilMeshBuffer.nIndexBuffer(address(), value); return this; }

    }

}