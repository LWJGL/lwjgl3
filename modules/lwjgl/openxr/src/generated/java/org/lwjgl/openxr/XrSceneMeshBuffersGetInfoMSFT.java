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
 * The information to get the scene mesh buffer data.
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>The {@link MSFTSceneUnderstanding XR_MSFT_scene_understanding} extension <b>must</b> be enabled prior to using {@link XrSceneMeshBuffersGetInfoMSFT}</li>
 * <li>{@code type} <b>must</b> be {@link MSFTSceneUnderstanding#XR_TYPE_SCENE_MESH_BUFFERS_GET_INFO_MSFT TYPE_SCENE_MESH_BUFFERS_GET_INFO_MSFT}</li>
 * <li>{@code next} <b>must</b> be {@code NULL} or a valid pointer to the <a target="_blank" href="https://www.khronos.org/registry/OpenXR/specs/1.0/html/xrspec.html#valid-usage-for-structure-pointer-chains">next structure in a structure chain</a></li>
 * </ul>
 * 
 * <h5>See Also</h5>
 * 
 * <p>{@link MSFTSceneUnderstanding#xrGetSceneMeshBuffersMSFT GetSceneMeshBuffersMSFT}</p>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct XrSceneMeshBuffersGetInfoMSFT {
 *     XrStructureType {@link #type};
 *     void const * {@link #next};
 *     uint64_t {@link #meshBufferId};
 * }</code></pre>
 */
public class XrSceneMeshBuffersGetInfoMSFT extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        TYPE,
        NEXT,
        MESHBUFFERID;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(8)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        TYPE = layout.offsetof(0);
        NEXT = layout.offsetof(1);
        MESHBUFFERID = layout.offsetof(2);
    }

    /**
     * Creates a {@code XrSceneMeshBuffersGetInfoMSFT} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public XrSceneMeshBuffersGetInfoMSFT(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** the {@code XrStructureType} of this structure. */
    @NativeType("XrStructureType")
    public int type() { return ntype(address()); }
    /** {@code NULL} or a pointer to the next structure in a structure chain. No such structures are defined in core OpenXR or this extension. */
    @NativeType("void const *")
    public long next() { return nnext(address()); }
    /** the {@code uint64_t} identifier that specifies the scene mesh buffer to read. */
    @NativeType("uint64_t")
    public long meshBufferId() { return nmeshBufferId(address()); }

    /** Sets the specified value to the {@link #type} field. */
    public XrSceneMeshBuffersGetInfoMSFT type(@NativeType("XrStructureType") int value) { ntype(address(), value); return this; }
    /** Sets the {@link MSFTSceneUnderstanding#XR_TYPE_SCENE_MESH_BUFFERS_GET_INFO_MSFT TYPE_SCENE_MESH_BUFFERS_GET_INFO_MSFT} value to the {@link #type} field. */
    public XrSceneMeshBuffersGetInfoMSFT type$Default() { return type(MSFTSceneUnderstanding.XR_TYPE_SCENE_MESH_BUFFERS_GET_INFO_MSFT); }
    /** Sets the specified value to the {@link #next} field. */
    public XrSceneMeshBuffersGetInfoMSFT next(@NativeType("void const *") long value) { nnext(address(), value); return this; }
    /** Sets the specified value to the {@link #meshBufferId} field. */
    public XrSceneMeshBuffersGetInfoMSFT meshBufferId(@NativeType("uint64_t") long value) { nmeshBufferId(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public XrSceneMeshBuffersGetInfoMSFT set(
        int type,
        long next,
        long meshBufferId
    ) {
        type(type);
        next(next);
        meshBufferId(meshBufferId);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public XrSceneMeshBuffersGetInfoMSFT set(XrSceneMeshBuffersGetInfoMSFT src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code XrSceneMeshBuffersGetInfoMSFT} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static XrSceneMeshBuffersGetInfoMSFT malloc() {
        return wrap(XrSceneMeshBuffersGetInfoMSFT.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code XrSceneMeshBuffersGetInfoMSFT} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static XrSceneMeshBuffersGetInfoMSFT calloc() {
        return wrap(XrSceneMeshBuffersGetInfoMSFT.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code XrSceneMeshBuffersGetInfoMSFT} instance allocated with {@link BufferUtils}. */
    public static XrSceneMeshBuffersGetInfoMSFT create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(XrSceneMeshBuffersGetInfoMSFT.class, memAddress(container), container);
    }

    /** Returns a new {@code XrSceneMeshBuffersGetInfoMSFT} instance for the specified memory address. */
    public static XrSceneMeshBuffersGetInfoMSFT create(long address) {
        return wrap(XrSceneMeshBuffersGetInfoMSFT.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static XrSceneMeshBuffersGetInfoMSFT createSafe(long address) {
        return address == NULL ? null : wrap(XrSceneMeshBuffersGetInfoMSFT.class, address);
    }

    /**
     * Returns a new {@link XrSceneMeshBuffersGetInfoMSFT.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrSceneMeshBuffersGetInfoMSFT.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link XrSceneMeshBuffersGetInfoMSFT.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrSceneMeshBuffersGetInfoMSFT.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrSceneMeshBuffersGetInfoMSFT.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static XrSceneMeshBuffersGetInfoMSFT.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link XrSceneMeshBuffersGetInfoMSFT.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static XrSceneMeshBuffersGetInfoMSFT.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static XrSceneMeshBuffersGetInfoMSFT.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    /**
     * Returns a new {@code XrSceneMeshBuffersGetInfoMSFT} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static XrSceneMeshBuffersGetInfoMSFT malloc(MemoryStack stack) {
        return wrap(XrSceneMeshBuffersGetInfoMSFT.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code XrSceneMeshBuffersGetInfoMSFT} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static XrSceneMeshBuffersGetInfoMSFT calloc(MemoryStack stack) {
        return wrap(XrSceneMeshBuffersGetInfoMSFT.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link XrSceneMeshBuffersGetInfoMSFT.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrSceneMeshBuffersGetInfoMSFT.Buffer malloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrSceneMeshBuffersGetInfoMSFT.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrSceneMeshBuffersGetInfoMSFT.Buffer calloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #type}. */
    public static int ntype(long struct) { return UNSAFE.getInt(null, struct + XrSceneMeshBuffersGetInfoMSFT.TYPE); }
    /** Unsafe version of {@link #next}. */
    public static long nnext(long struct) { return memGetAddress(struct + XrSceneMeshBuffersGetInfoMSFT.NEXT); }
    /** Unsafe version of {@link #meshBufferId}. */
    public static long nmeshBufferId(long struct) { return UNSAFE.getLong(null, struct + XrSceneMeshBuffersGetInfoMSFT.MESHBUFFERID); }

    /** Unsafe version of {@link #type(int) type}. */
    public static void ntype(long struct, int value) { UNSAFE.putInt(null, struct + XrSceneMeshBuffersGetInfoMSFT.TYPE, value); }
    /** Unsafe version of {@link #next(long) next}. */
    public static void nnext(long struct, long value) { memPutAddress(struct + XrSceneMeshBuffersGetInfoMSFT.NEXT, value); }
    /** Unsafe version of {@link #meshBufferId(long) meshBufferId}. */
    public static void nmeshBufferId(long struct, long value) { UNSAFE.putLong(null, struct + XrSceneMeshBuffersGetInfoMSFT.MESHBUFFERID, value); }

    // -----------------------------------

    /** An array of {@link XrSceneMeshBuffersGetInfoMSFT} structs. */
    public static class Buffer extends StructBuffer<XrSceneMeshBuffersGetInfoMSFT, Buffer> implements NativeResource {

        private static final XrSceneMeshBuffersGetInfoMSFT ELEMENT_FACTORY = XrSceneMeshBuffersGetInfoMSFT.create(-1L);

        /**
         * Creates a new {@code XrSceneMeshBuffersGetInfoMSFT.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link XrSceneMeshBuffersGetInfoMSFT#SIZEOF}, and its mark will be undefined.
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
        protected XrSceneMeshBuffersGetInfoMSFT getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link XrSceneMeshBuffersGetInfoMSFT#type} field. */
        @NativeType("XrStructureType")
        public int type() { return XrSceneMeshBuffersGetInfoMSFT.ntype(address()); }
        /** @return the value of the {@link XrSceneMeshBuffersGetInfoMSFT#next} field. */
        @NativeType("void const *")
        public long next() { return XrSceneMeshBuffersGetInfoMSFT.nnext(address()); }
        /** @return the value of the {@link XrSceneMeshBuffersGetInfoMSFT#meshBufferId} field. */
        @NativeType("uint64_t")
        public long meshBufferId() { return XrSceneMeshBuffersGetInfoMSFT.nmeshBufferId(address()); }

        /** Sets the specified value to the {@link XrSceneMeshBuffersGetInfoMSFT#type} field. */
        public XrSceneMeshBuffersGetInfoMSFT.Buffer type(@NativeType("XrStructureType") int value) { XrSceneMeshBuffersGetInfoMSFT.ntype(address(), value); return this; }
        /** Sets the {@link MSFTSceneUnderstanding#XR_TYPE_SCENE_MESH_BUFFERS_GET_INFO_MSFT TYPE_SCENE_MESH_BUFFERS_GET_INFO_MSFT} value to the {@link XrSceneMeshBuffersGetInfoMSFT#type} field. */
        public XrSceneMeshBuffersGetInfoMSFT.Buffer type$Default() { return type(MSFTSceneUnderstanding.XR_TYPE_SCENE_MESH_BUFFERS_GET_INFO_MSFT); }
        /** Sets the specified value to the {@link XrSceneMeshBuffersGetInfoMSFT#next} field. */
        public XrSceneMeshBuffersGetInfoMSFT.Buffer next(@NativeType("void const *") long value) { XrSceneMeshBuffersGetInfoMSFT.nnext(address(), value); return this; }
        /** Sets the specified value to the {@link XrSceneMeshBuffersGetInfoMSFT#meshBufferId} field. */
        public XrSceneMeshBuffersGetInfoMSFT.Buffer meshBufferId(@NativeType("uint64_t") long value) { XrSceneMeshBuffersGetInfoMSFT.nmeshBufferId(address(), value); return this; }

    }

}