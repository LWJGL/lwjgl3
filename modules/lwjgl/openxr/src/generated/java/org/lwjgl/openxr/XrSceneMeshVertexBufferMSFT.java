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
 * Scene mesh vertex buffer.
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>The {@link MSFTSceneUnderstanding XR_MSFT_scene_understanding} extension <b>must</b> be enabled prior to using {@link XrSceneMeshVertexBufferMSFT}</li>
 * <li>{@code type} <b>must</b> be {@link MSFTSceneUnderstanding#XR_TYPE_SCENE_MESH_VERTEX_BUFFER_MSFT TYPE_SCENE_MESH_VERTEX_BUFFER_MSFT}</li>
 * <li>{@code next} <b>must</b> be {@code NULL} or a valid pointer to the <a target="_blank" href="https://www.khronos.org/registry/OpenXR/specs/1.0/html/xrspec.html#valid-usage-for-structure-pointer-chains">next structure in a structure chain</a></li>
 * <li>If {@code vertexCapacityInput} is not 0, {@code vertices} <b>must</b> be a pointer to an array of {@code vertexCapacityInput} {@link XrVector3f} structures</li>
 * </ul>
 * 
 * <h5>See Also</h5>
 * 
 * <p>{@link XrSceneMeshBuffersMSFT}, {@link XrVector3f}, {@link MSFTSceneUnderstanding#xrGetSceneMeshBuffersMSFT GetSceneMeshBuffersMSFT}</p>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct XrSceneMeshVertexBufferMSFT {
 *     XrStructureType {@link #type};
 *     void * {@link #next};
 *     uint32_t {@link #vertexCapacityInput};
 *     uint32_t {@link #vertexCountOutput};
 *     {@link XrVector3f XrVector3f} * {@link #vertices};
 * }</code></pre>
 */
public class XrSceneMeshVertexBufferMSFT extends Struct implements NativeResource {

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

    /**
     * Creates a {@code XrSceneMeshVertexBufferMSFT} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public XrSceneMeshVertexBufferMSFT(ByteBuffer container) {
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
    /** the capacity of the array, or 0 to indicate a request to retrieve the required capacity. */
    @NativeType("uint32_t")
    public int vertexCapacityInput() { return nvertexCapacityInput(address()); }
    /** a pointer to the count of vertices, or a pointer to the required capacity in the case that {@code vertexCapacityInput} is 0. */
    @NativeType("uint32_t")
    public int vertexCountOutput() { return nvertexCountOutput(address()); }
    /** an array of {@link XrVector3f} filled in by the runtime returns the position of vertices in the mesh component’s space. */
    @Nullable
    @NativeType("XrVector3f *")
    public XrVector3f.Buffer vertices() { return nvertices(address()); }

    /** Sets the specified value to the {@link #type} field. */
    public XrSceneMeshVertexBufferMSFT type(@NativeType("XrStructureType") int value) { ntype(address(), value); return this; }
    /** Sets the {@link MSFTSceneUnderstanding#XR_TYPE_SCENE_MESH_VERTEX_BUFFER_MSFT TYPE_SCENE_MESH_VERTEX_BUFFER_MSFT} value to the {@link #type} field. */
    public XrSceneMeshVertexBufferMSFT type$Default() { return type(MSFTSceneUnderstanding.XR_TYPE_SCENE_MESH_VERTEX_BUFFER_MSFT); }
    /** Sets the specified value to the {@link #next} field. */
    public XrSceneMeshVertexBufferMSFT next(@NativeType("void *") long value) { nnext(address(), value); return this; }
    /** Sets the specified value to the {@link #vertexCapacityInput} field. */
    public XrSceneMeshVertexBufferMSFT vertexCapacityInput(@NativeType("uint32_t") int value) { nvertexCapacityInput(address(), value); return this; }
    /** Sets the specified value to the {@link #vertexCountOutput} field. */
    public XrSceneMeshVertexBufferMSFT vertexCountOutput(@NativeType("uint32_t") int value) { nvertexCountOutput(address(), value); return this; }
    /** Sets the address of the specified {@link XrVector3f.Buffer} to the {@link #vertices} field. */
    public XrSceneMeshVertexBufferMSFT vertices(@Nullable @NativeType("XrVector3f *") XrVector3f.Buffer value) { nvertices(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public XrSceneMeshVertexBufferMSFT set(
        int type,
        long next,
        int vertexCapacityInput,
        int vertexCountOutput,
        @Nullable XrVector3f.Buffer vertices
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
    public XrSceneMeshVertexBufferMSFT set(XrSceneMeshVertexBufferMSFT src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code XrSceneMeshVertexBufferMSFT} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static XrSceneMeshVertexBufferMSFT malloc() {
        return wrap(XrSceneMeshVertexBufferMSFT.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code XrSceneMeshVertexBufferMSFT} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static XrSceneMeshVertexBufferMSFT calloc() {
        return wrap(XrSceneMeshVertexBufferMSFT.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code XrSceneMeshVertexBufferMSFT} instance allocated with {@link BufferUtils}. */
    public static XrSceneMeshVertexBufferMSFT create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(XrSceneMeshVertexBufferMSFT.class, memAddress(container), container);
    }

    /** Returns a new {@code XrSceneMeshVertexBufferMSFT} instance for the specified memory address. */
    public static XrSceneMeshVertexBufferMSFT create(long address) {
        return wrap(XrSceneMeshVertexBufferMSFT.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static XrSceneMeshVertexBufferMSFT createSafe(long address) {
        return address == NULL ? null : wrap(XrSceneMeshVertexBufferMSFT.class, address);
    }

    /**
     * Returns a new {@link XrSceneMeshVertexBufferMSFT.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrSceneMeshVertexBufferMSFT.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link XrSceneMeshVertexBufferMSFT.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrSceneMeshVertexBufferMSFT.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrSceneMeshVertexBufferMSFT.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static XrSceneMeshVertexBufferMSFT.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link XrSceneMeshVertexBufferMSFT.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static XrSceneMeshVertexBufferMSFT.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static XrSceneMeshVertexBufferMSFT.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    /**
     * Returns a new {@code XrSceneMeshVertexBufferMSFT} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static XrSceneMeshVertexBufferMSFT malloc(MemoryStack stack) {
        return wrap(XrSceneMeshVertexBufferMSFT.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code XrSceneMeshVertexBufferMSFT} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static XrSceneMeshVertexBufferMSFT calloc(MemoryStack stack) {
        return wrap(XrSceneMeshVertexBufferMSFT.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link XrSceneMeshVertexBufferMSFT.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrSceneMeshVertexBufferMSFT.Buffer malloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrSceneMeshVertexBufferMSFT.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrSceneMeshVertexBufferMSFT.Buffer calloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #type}. */
    public static int ntype(long struct) { return UNSAFE.getInt(null, struct + XrSceneMeshVertexBufferMSFT.TYPE); }
    /** Unsafe version of {@link #next}. */
    public static long nnext(long struct) { return memGetAddress(struct + XrSceneMeshVertexBufferMSFT.NEXT); }
    /** Unsafe version of {@link #vertexCapacityInput}. */
    public static int nvertexCapacityInput(long struct) { return UNSAFE.getInt(null, struct + XrSceneMeshVertexBufferMSFT.VERTEXCAPACITYINPUT); }
    /** Unsafe version of {@link #vertexCountOutput}. */
    public static int nvertexCountOutput(long struct) { return UNSAFE.getInt(null, struct + XrSceneMeshVertexBufferMSFT.VERTEXCOUNTOUTPUT); }
    /** Unsafe version of {@link #vertices}. */
    @Nullable public static XrVector3f.Buffer nvertices(long struct) { return XrVector3f.createSafe(memGetAddress(struct + XrSceneMeshVertexBufferMSFT.VERTICES), nvertexCapacityInput(struct)); }

    /** Unsafe version of {@link #type(int) type}. */
    public static void ntype(long struct, int value) { UNSAFE.putInt(null, struct + XrSceneMeshVertexBufferMSFT.TYPE, value); }
    /** Unsafe version of {@link #next(long) next}. */
    public static void nnext(long struct, long value) { memPutAddress(struct + XrSceneMeshVertexBufferMSFT.NEXT, value); }
    /** Sets the specified value to the {@code vertexCapacityInput} field of the specified {@code struct}. */
    public static void nvertexCapacityInput(long struct, int value) { UNSAFE.putInt(null, struct + XrSceneMeshVertexBufferMSFT.VERTEXCAPACITYINPUT, value); }
    /** Unsafe version of {@link #vertexCountOutput(int) vertexCountOutput}. */
    public static void nvertexCountOutput(long struct, int value) { UNSAFE.putInt(null, struct + XrSceneMeshVertexBufferMSFT.VERTEXCOUNTOUTPUT, value); }
    /** Unsafe version of {@link #vertices(XrVector3f.Buffer) vertices}. */
    public static void nvertices(long struct, @Nullable XrVector3f.Buffer value) { memPutAddress(struct + XrSceneMeshVertexBufferMSFT.VERTICES, memAddressSafe(value)); if (value != null) { nvertexCapacityInput(struct, value.remaining()); } }

    // -----------------------------------

    /** An array of {@link XrSceneMeshVertexBufferMSFT} structs. */
    public static class Buffer extends StructBuffer<XrSceneMeshVertexBufferMSFT, Buffer> implements NativeResource {

        private static final XrSceneMeshVertexBufferMSFT ELEMENT_FACTORY = XrSceneMeshVertexBufferMSFT.create(-1L);

        /**
         * Creates a new {@code XrSceneMeshVertexBufferMSFT.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link XrSceneMeshVertexBufferMSFT#SIZEOF}, and its mark will be undefined.
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
        protected XrSceneMeshVertexBufferMSFT getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link XrSceneMeshVertexBufferMSFT#type} field. */
        @NativeType("XrStructureType")
        public int type() { return XrSceneMeshVertexBufferMSFT.ntype(address()); }
        /** @return the value of the {@link XrSceneMeshVertexBufferMSFT#next} field. */
        @NativeType("void *")
        public long next() { return XrSceneMeshVertexBufferMSFT.nnext(address()); }
        /** @return the value of the {@link XrSceneMeshVertexBufferMSFT#vertexCapacityInput} field. */
        @NativeType("uint32_t")
        public int vertexCapacityInput() { return XrSceneMeshVertexBufferMSFT.nvertexCapacityInput(address()); }
        /** @return the value of the {@link XrSceneMeshVertexBufferMSFT#vertexCountOutput} field. */
        @NativeType("uint32_t")
        public int vertexCountOutput() { return XrSceneMeshVertexBufferMSFT.nvertexCountOutput(address()); }
        /** @return a {@link XrVector3f.Buffer} view of the struct array pointed to by the {@link XrSceneMeshVertexBufferMSFT#vertices} field. */
        @Nullable
        @NativeType("XrVector3f *")
        public XrVector3f.Buffer vertices() { return XrSceneMeshVertexBufferMSFT.nvertices(address()); }

        /** Sets the specified value to the {@link XrSceneMeshVertexBufferMSFT#type} field. */
        public XrSceneMeshVertexBufferMSFT.Buffer type(@NativeType("XrStructureType") int value) { XrSceneMeshVertexBufferMSFT.ntype(address(), value); return this; }
        /** Sets the {@link MSFTSceneUnderstanding#XR_TYPE_SCENE_MESH_VERTEX_BUFFER_MSFT TYPE_SCENE_MESH_VERTEX_BUFFER_MSFT} value to the {@link XrSceneMeshVertexBufferMSFT#type} field. */
        public XrSceneMeshVertexBufferMSFT.Buffer type$Default() { return type(MSFTSceneUnderstanding.XR_TYPE_SCENE_MESH_VERTEX_BUFFER_MSFT); }
        /** Sets the specified value to the {@link XrSceneMeshVertexBufferMSFT#next} field. */
        public XrSceneMeshVertexBufferMSFT.Buffer next(@NativeType("void *") long value) { XrSceneMeshVertexBufferMSFT.nnext(address(), value); return this; }
        /** Sets the specified value to the {@link XrSceneMeshVertexBufferMSFT#vertexCapacityInput} field. */
        public XrSceneMeshVertexBufferMSFT.Buffer vertexCapacityInput(@NativeType("uint32_t") int value) { XrSceneMeshVertexBufferMSFT.nvertexCapacityInput(address(), value); return this; }
        /** Sets the specified value to the {@link XrSceneMeshVertexBufferMSFT#vertexCountOutput} field. */
        public XrSceneMeshVertexBufferMSFT.Buffer vertexCountOutput(@NativeType("uint32_t") int value) { XrSceneMeshVertexBufferMSFT.nvertexCountOutput(address(), value); return this; }
        /** Sets the address of the specified {@link XrVector3f.Buffer} to the {@link XrSceneMeshVertexBufferMSFT#vertices} field. */
        public XrSceneMeshVertexBufferMSFT.Buffer vertices(@Nullable @NativeType("XrVector3f *") XrVector3f.Buffer value) { XrSceneMeshVertexBufferMSFT.nvertices(address(), value); return this; }

    }

}