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
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct XrSystemHandTrackingMeshPropertiesMSFT {
 *     XrStructureType type;
 *     void * next;
 *     XrBool32 supportsHandTrackingMesh;
 *     uint32_t maxHandMeshIndexCount;
 *     uint32_t maxHandMeshVertexCount;
 * }</code></pre>
 */
public class XrSystemHandTrackingMeshPropertiesMSFT extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        TYPE,
        NEXT,
        SUPPORTSHANDTRACKINGMESH,
        MAXHANDMESHINDEXCOUNT,
        MAXHANDMESHVERTEXCOUNT;

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

        TYPE = layout.offsetof(0);
        NEXT = layout.offsetof(1);
        SUPPORTSHANDTRACKINGMESH = layout.offsetof(2);
        MAXHANDMESHINDEXCOUNT = layout.offsetof(3);
        MAXHANDMESHVERTEXCOUNT = layout.offsetof(4);
    }

    /**
     * Creates a {@code XrSystemHandTrackingMeshPropertiesMSFT} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public XrSystemHandTrackingMeshPropertiesMSFT(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** Returns the value of the {@code type} field. */
    @NativeType("XrStructureType")
    public int type() { return ntype(address()); }
    /** Returns the value of the {@code next} field. */
    @NativeType("void *")
    public long next() { return nnext(address()); }
    /** Returns the value of the {@code supportsHandTrackingMesh} field. */
    @NativeType("XrBool32")
    public boolean supportsHandTrackingMesh() { return nsupportsHandTrackingMesh(address()) != 0; }
    /** Returns the value of the {@code maxHandMeshIndexCount} field. */
    @NativeType("uint32_t")
    public int maxHandMeshIndexCount() { return nmaxHandMeshIndexCount(address()); }
    /** Returns the value of the {@code maxHandMeshVertexCount} field. */
    @NativeType("uint32_t")
    public int maxHandMeshVertexCount() { return nmaxHandMeshVertexCount(address()); }

    /** Sets the specified value to the {@code type} field. */
    public XrSystemHandTrackingMeshPropertiesMSFT type(@NativeType("XrStructureType") int value) { ntype(address(), value); return this; }
    /** Sets the specified value to the {@code next} field. */
    public XrSystemHandTrackingMeshPropertiesMSFT next(@NativeType("void *") long value) { nnext(address(), value); return this; }
    /** Sets the specified value to the {@code supportsHandTrackingMesh} field. */
    public XrSystemHandTrackingMeshPropertiesMSFT supportsHandTrackingMesh(@NativeType("XrBool32") boolean value) { nsupportsHandTrackingMesh(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@code maxHandMeshIndexCount} field. */
    public XrSystemHandTrackingMeshPropertiesMSFT maxHandMeshIndexCount(@NativeType("uint32_t") int value) { nmaxHandMeshIndexCount(address(), value); return this; }
    /** Sets the specified value to the {@code maxHandMeshVertexCount} field. */
    public XrSystemHandTrackingMeshPropertiesMSFT maxHandMeshVertexCount(@NativeType("uint32_t") int value) { nmaxHandMeshVertexCount(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public XrSystemHandTrackingMeshPropertiesMSFT set(
        int type,
        long next,
        boolean supportsHandTrackingMesh,
        int maxHandMeshIndexCount,
        int maxHandMeshVertexCount
    ) {
        type(type);
        next(next);
        supportsHandTrackingMesh(supportsHandTrackingMesh);
        maxHandMeshIndexCount(maxHandMeshIndexCount);
        maxHandMeshVertexCount(maxHandMeshVertexCount);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public XrSystemHandTrackingMeshPropertiesMSFT set(XrSystemHandTrackingMeshPropertiesMSFT src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code XrSystemHandTrackingMeshPropertiesMSFT} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static XrSystemHandTrackingMeshPropertiesMSFT malloc() {
        return wrap(XrSystemHandTrackingMeshPropertiesMSFT.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code XrSystemHandTrackingMeshPropertiesMSFT} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static XrSystemHandTrackingMeshPropertiesMSFT calloc() {
        return wrap(XrSystemHandTrackingMeshPropertiesMSFT.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code XrSystemHandTrackingMeshPropertiesMSFT} instance allocated with {@link BufferUtils}. */
    public static XrSystemHandTrackingMeshPropertiesMSFT create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(XrSystemHandTrackingMeshPropertiesMSFT.class, memAddress(container), container);
    }

    /** Returns a new {@code XrSystemHandTrackingMeshPropertiesMSFT} instance for the specified memory address. */
    public static XrSystemHandTrackingMeshPropertiesMSFT create(long address) {
        return wrap(XrSystemHandTrackingMeshPropertiesMSFT.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static XrSystemHandTrackingMeshPropertiesMSFT createSafe(long address) {
        return address == NULL ? null : wrap(XrSystemHandTrackingMeshPropertiesMSFT.class, address);
    }

    /**
     * Returns a new {@link XrSystemHandTrackingMeshPropertiesMSFT.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrSystemHandTrackingMeshPropertiesMSFT.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link XrSystemHandTrackingMeshPropertiesMSFT.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrSystemHandTrackingMeshPropertiesMSFT.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrSystemHandTrackingMeshPropertiesMSFT.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static XrSystemHandTrackingMeshPropertiesMSFT.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link XrSystemHandTrackingMeshPropertiesMSFT.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static XrSystemHandTrackingMeshPropertiesMSFT.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static XrSystemHandTrackingMeshPropertiesMSFT.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    // -----------------------------------

    /** Returns a new {@code XrSystemHandTrackingMeshPropertiesMSFT} instance allocated on the thread-local {@link MemoryStack}. */
    public static XrSystemHandTrackingMeshPropertiesMSFT mallocStack() {
        return mallocStack(stackGet());
    }

    /** Returns a new {@code XrSystemHandTrackingMeshPropertiesMSFT} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero. */
    public static XrSystemHandTrackingMeshPropertiesMSFT callocStack() {
        return callocStack(stackGet());
    }

    /**
     * Returns a new {@code XrSystemHandTrackingMeshPropertiesMSFT} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static XrSystemHandTrackingMeshPropertiesMSFT mallocStack(MemoryStack stack) {
        return wrap(XrSystemHandTrackingMeshPropertiesMSFT.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code XrSystemHandTrackingMeshPropertiesMSFT} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static XrSystemHandTrackingMeshPropertiesMSFT callocStack(MemoryStack stack) {
        return wrap(XrSystemHandTrackingMeshPropertiesMSFT.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link XrSystemHandTrackingMeshPropertiesMSFT.Buffer} instance allocated on the thread-local {@link MemoryStack}.
     *
     * @param capacity the buffer capacity
     */
    public static XrSystemHandTrackingMeshPropertiesMSFT.Buffer mallocStack(int capacity) {
        return mallocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link XrSystemHandTrackingMeshPropertiesMSFT.Buffer} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param capacity the buffer capacity
     */
    public static XrSystemHandTrackingMeshPropertiesMSFT.Buffer callocStack(int capacity) {
        return callocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link XrSystemHandTrackingMeshPropertiesMSFT.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrSystemHandTrackingMeshPropertiesMSFT.Buffer mallocStack(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrSystemHandTrackingMeshPropertiesMSFT.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrSystemHandTrackingMeshPropertiesMSFT.Buffer callocStack(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #type}. */
    public static int ntype(long struct) { return UNSAFE.getInt(null, struct + XrSystemHandTrackingMeshPropertiesMSFT.TYPE); }
    /** Unsafe version of {@link #next}. */
    public static long nnext(long struct) { return memGetAddress(struct + XrSystemHandTrackingMeshPropertiesMSFT.NEXT); }
    /** Unsafe version of {@link #supportsHandTrackingMesh}. */
    public static int nsupportsHandTrackingMesh(long struct) { return UNSAFE.getInt(null, struct + XrSystemHandTrackingMeshPropertiesMSFT.SUPPORTSHANDTRACKINGMESH); }
    /** Unsafe version of {@link #maxHandMeshIndexCount}. */
    public static int nmaxHandMeshIndexCount(long struct) { return UNSAFE.getInt(null, struct + XrSystemHandTrackingMeshPropertiesMSFT.MAXHANDMESHINDEXCOUNT); }
    /** Unsafe version of {@link #maxHandMeshVertexCount}. */
    public static int nmaxHandMeshVertexCount(long struct) { return UNSAFE.getInt(null, struct + XrSystemHandTrackingMeshPropertiesMSFT.MAXHANDMESHVERTEXCOUNT); }

    /** Unsafe version of {@link #type(int) type}. */
    public static void ntype(long struct, int value) { UNSAFE.putInt(null, struct + XrSystemHandTrackingMeshPropertiesMSFT.TYPE, value); }
    /** Unsafe version of {@link #next(long) next}. */
    public static void nnext(long struct, long value) { memPutAddress(struct + XrSystemHandTrackingMeshPropertiesMSFT.NEXT, value); }
    /** Unsafe version of {@link #supportsHandTrackingMesh(boolean) supportsHandTrackingMesh}. */
    public static void nsupportsHandTrackingMesh(long struct, int value) { UNSAFE.putInt(null, struct + XrSystemHandTrackingMeshPropertiesMSFT.SUPPORTSHANDTRACKINGMESH, value); }
    /** Unsafe version of {@link #maxHandMeshIndexCount(int) maxHandMeshIndexCount}. */
    public static void nmaxHandMeshIndexCount(long struct, int value) { UNSAFE.putInt(null, struct + XrSystemHandTrackingMeshPropertiesMSFT.MAXHANDMESHINDEXCOUNT, value); }
    /** Unsafe version of {@link #maxHandMeshVertexCount(int) maxHandMeshVertexCount}. */
    public static void nmaxHandMeshVertexCount(long struct, int value) { UNSAFE.putInt(null, struct + XrSystemHandTrackingMeshPropertiesMSFT.MAXHANDMESHVERTEXCOUNT, value); }

    // -----------------------------------

    /** An array of {@link XrSystemHandTrackingMeshPropertiesMSFT} structs. */
    public static class Buffer extends StructBuffer<XrSystemHandTrackingMeshPropertiesMSFT, Buffer> implements NativeResource {

        private static final XrSystemHandTrackingMeshPropertiesMSFT ELEMENT_FACTORY = XrSystemHandTrackingMeshPropertiesMSFT.create(-1L);

        /**
         * Creates a new {@code XrSystemHandTrackingMeshPropertiesMSFT.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link XrSystemHandTrackingMeshPropertiesMSFT#SIZEOF}, and its mark will be undefined.
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
        protected XrSystemHandTrackingMeshPropertiesMSFT getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** Returns the value of the {@code type} field. */
        @NativeType("XrStructureType")
        public int type() { return XrSystemHandTrackingMeshPropertiesMSFT.ntype(address()); }
        /** Returns the value of the {@code next} field. */
        @NativeType("void *")
        public long next() { return XrSystemHandTrackingMeshPropertiesMSFT.nnext(address()); }
        /** Returns the value of the {@code supportsHandTrackingMesh} field. */
        @NativeType("XrBool32")
        public boolean supportsHandTrackingMesh() { return XrSystemHandTrackingMeshPropertiesMSFT.nsupportsHandTrackingMesh(address()) != 0; }
        /** Returns the value of the {@code maxHandMeshIndexCount} field. */
        @NativeType("uint32_t")
        public int maxHandMeshIndexCount() { return XrSystemHandTrackingMeshPropertiesMSFT.nmaxHandMeshIndexCount(address()); }
        /** Returns the value of the {@code maxHandMeshVertexCount} field. */
        @NativeType("uint32_t")
        public int maxHandMeshVertexCount() { return XrSystemHandTrackingMeshPropertiesMSFT.nmaxHandMeshVertexCount(address()); }

        /** Sets the specified value to the {@code type} field. */
        public XrSystemHandTrackingMeshPropertiesMSFT.Buffer type(@NativeType("XrStructureType") int value) { XrSystemHandTrackingMeshPropertiesMSFT.ntype(address(), value); return this; }
        /** Sets the specified value to the {@code next} field. */
        public XrSystemHandTrackingMeshPropertiesMSFT.Buffer next(@NativeType("void *") long value) { XrSystemHandTrackingMeshPropertiesMSFT.nnext(address(), value); return this; }
        /** Sets the specified value to the {@code supportsHandTrackingMesh} field. */
        public XrSystemHandTrackingMeshPropertiesMSFT.Buffer supportsHandTrackingMesh(@NativeType("XrBool32") boolean value) { XrSystemHandTrackingMeshPropertiesMSFT.nsupportsHandTrackingMesh(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@code maxHandMeshIndexCount} field. */
        public XrSystemHandTrackingMeshPropertiesMSFT.Buffer maxHandMeshIndexCount(@NativeType("uint32_t") int value) { XrSystemHandTrackingMeshPropertiesMSFT.nmaxHandMeshIndexCount(address(), value); return this; }
        /** Sets the specified value to the {@code maxHandMeshVertexCount} field. */
        public XrSystemHandTrackingMeshPropertiesMSFT.Buffer maxHandMeshVertexCount(@NativeType("uint32_t") int value) { XrSystemHandTrackingMeshPropertiesMSFT.nmaxHandMeshVertexCount(address(), value); return this; }

    }

}