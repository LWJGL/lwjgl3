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
 * Scene mesh 32-bit indices.
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>The {@link MSFTSceneUnderstanding XR_MSFT_scene_understanding} extension <b>must</b> be enabled prior to using {@link XrSceneMeshIndicesUint32MSFT}</li>
 * <li>{@code type} <b>must</b> be {@link MSFTSceneUnderstanding#XR_TYPE_SCENE_MESH_INDICES_UINT32_MSFT TYPE_SCENE_MESH_INDICES_UINT32_MSFT}</li>
 * <li>{@code next} <b>must</b> be {@code NULL} or a valid pointer to the <a target="_blank" href="https://www.khronos.org/registry/OpenXR/specs/1.0/html/xrspec.html#valid-usage-for-structure-pointer-chains">next structure in a structure chain</a></li>
 * <li>If {@code indexCapacityInput} is not 0, {@code indices} <b>must</b> be a pointer to an array of {@code indexCapacityInput} {@code uint32_t} values</li>
 * </ul>
 * 
 * <h5>See Also</h5>
 * 
 * <p>{@link XrSceneMeshBuffersMSFT}, {@link MSFTSceneUnderstanding#xrGetSceneMeshBuffersMSFT GetSceneMeshBuffersMSFT}</p>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct XrSceneMeshIndicesUint32MSFT {
 *     XrStructureType {@link #type};
 *     void * {@link #next};
 *     uint32_t {@link #indexCapacityInput};
 *     uint32_t {@link #indexCountOutput};
 *     uint32_t * {@link #indices};
 * }</code></pre>
 */
public class XrSceneMeshIndicesUint32MSFT extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        TYPE,
        NEXT,
        INDEXCAPACITYINPUT,
        INDEXCOUNTOUTPUT,
        INDICES;

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
        INDEXCAPACITYINPUT = layout.offsetof(2);
        INDEXCOUNTOUTPUT = layout.offsetof(3);
        INDICES = layout.offsetof(4);
    }

    /**
     * Creates a {@code XrSceneMeshIndicesUint32MSFT} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public XrSceneMeshIndicesUint32MSFT(ByteBuffer container) {
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
    public int indexCapacityInput() { return nindexCapacityInput(address()); }
    /** a pointer to the count of indices, or a pointer to the required capacity in the case that {@code indexCapacityInput} is 0. */
    @NativeType("uint32_t")
    public int indexCountOutput() { return nindexCountOutput(address()); }
    /** an array of triangle indices filled in by the runtime, specifying the indices of the scene mesh buffer in the vertices array. The triangle indices <b>must</b> be returned in counter-clockwise order and three indices denote one triangle. */
    @Nullable
    @NativeType("uint32_t *")
    public IntBuffer indices() { return nindices(address()); }

    /** Sets the specified value to the {@link #type} field. */
    public XrSceneMeshIndicesUint32MSFT type(@NativeType("XrStructureType") int value) { ntype(address(), value); return this; }
    /** Sets the {@link MSFTSceneUnderstanding#XR_TYPE_SCENE_MESH_INDICES_UINT32_MSFT TYPE_SCENE_MESH_INDICES_UINT32_MSFT} value to the {@link #type} field. */
    public XrSceneMeshIndicesUint32MSFT type$Default() { return type(MSFTSceneUnderstanding.XR_TYPE_SCENE_MESH_INDICES_UINT32_MSFT); }
    /** Sets the specified value to the {@link #next} field. */
    public XrSceneMeshIndicesUint32MSFT next(@NativeType("void *") long value) { nnext(address(), value); return this; }
    /** Sets the specified value to the {@link #indexCapacityInput} field. */
    public XrSceneMeshIndicesUint32MSFT indexCapacityInput(@NativeType("uint32_t") int value) { nindexCapacityInput(address(), value); return this; }
    /** Sets the specified value to the {@link #indexCountOutput} field. */
    public XrSceneMeshIndicesUint32MSFT indexCountOutput(@NativeType("uint32_t") int value) { nindexCountOutput(address(), value); return this; }
    /** Sets the address of the specified {@link IntBuffer} to the {@link #indices} field. */
    public XrSceneMeshIndicesUint32MSFT indices(@Nullable @NativeType("uint32_t *") IntBuffer value) { nindices(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public XrSceneMeshIndicesUint32MSFT set(
        int type,
        long next,
        int indexCapacityInput,
        int indexCountOutput,
        @Nullable IntBuffer indices
    ) {
        type(type);
        next(next);
        indexCapacityInput(indexCapacityInput);
        indexCountOutput(indexCountOutput);
        indices(indices);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public XrSceneMeshIndicesUint32MSFT set(XrSceneMeshIndicesUint32MSFT src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code XrSceneMeshIndicesUint32MSFT} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static XrSceneMeshIndicesUint32MSFT malloc() {
        return wrap(XrSceneMeshIndicesUint32MSFT.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code XrSceneMeshIndicesUint32MSFT} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static XrSceneMeshIndicesUint32MSFT calloc() {
        return wrap(XrSceneMeshIndicesUint32MSFT.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code XrSceneMeshIndicesUint32MSFT} instance allocated with {@link BufferUtils}. */
    public static XrSceneMeshIndicesUint32MSFT create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(XrSceneMeshIndicesUint32MSFT.class, memAddress(container), container);
    }

    /** Returns a new {@code XrSceneMeshIndicesUint32MSFT} instance for the specified memory address. */
    public static XrSceneMeshIndicesUint32MSFT create(long address) {
        return wrap(XrSceneMeshIndicesUint32MSFT.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static XrSceneMeshIndicesUint32MSFT createSafe(long address) {
        return address == NULL ? null : wrap(XrSceneMeshIndicesUint32MSFT.class, address);
    }

    /**
     * Returns a new {@link XrSceneMeshIndicesUint32MSFT.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrSceneMeshIndicesUint32MSFT.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link XrSceneMeshIndicesUint32MSFT.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrSceneMeshIndicesUint32MSFT.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrSceneMeshIndicesUint32MSFT.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static XrSceneMeshIndicesUint32MSFT.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link XrSceneMeshIndicesUint32MSFT.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static XrSceneMeshIndicesUint32MSFT.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static XrSceneMeshIndicesUint32MSFT.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    /**
     * Returns a new {@code XrSceneMeshIndicesUint32MSFT} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static XrSceneMeshIndicesUint32MSFT malloc(MemoryStack stack) {
        return wrap(XrSceneMeshIndicesUint32MSFT.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code XrSceneMeshIndicesUint32MSFT} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static XrSceneMeshIndicesUint32MSFT calloc(MemoryStack stack) {
        return wrap(XrSceneMeshIndicesUint32MSFT.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link XrSceneMeshIndicesUint32MSFT.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrSceneMeshIndicesUint32MSFT.Buffer malloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrSceneMeshIndicesUint32MSFT.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrSceneMeshIndicesUint32MSFT.Buffer calloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #type}. */
    public static int ntype(long struct) { return UNSAFE.getInt(null, struct + XrSceneMeshIndicesUint32MSFT.TYPE); }
    /** Unsafe version of {@link #next}. */
    public static long nnext(long struct) { return memGetAddress(struct + XrSceneMeshIndicesUint32MSFT.NEXT); }
    /** Unsafe version of {@link #indexCapacityInput}. */
    public static int nindexCapacityInput(long struct) { return UNSAFE.getInt(null, struct + XrSceneMeshIndicesUint32MSFT.INDEXCAPACITYINPUT); }
    /** Unsafe version of {@link #indexCountOutput}. */
    public static int nindexCountOutput(long struct) { return UNSAFE.getInt(null, struct + XrSceneMeshIndicesUint32MSFT.INDEXCOUNTOUTPUT); }
    /** Unsafe version of {@link #indices() indices}. */
    @Nullable public static IntBuffer nindices(long struct) { return memIntBufferSafe(memGetAddress(struct + XrSceneMeshIndicesUint32MSFT.INDICES), nindexCapacityInput(struct)); }

    /** Unsafe version of {@link #type(int) type}. */
    public static void ntype(long struct, int value) { UNSAFE.putInt(null, struct + XrSceneMeshIndicesUint32MSFT.TYPE, value); }
    /** Unsafe version of {@link #next(long) next}. */
    public static void nnext(long struct, long value) { memPutAddress(struct + XrSceneMeshIndicesUint32MSFT.NEXT, value); }
    /** Sets the specified value to the {@code indexCapacityInput} field of the specified {@code struct}. */
    public static void nindexCapacityInput(long struct, int value) { UNSAFE.putInt(null, struct + XrSceneMeshIndicesUint32MSFT.INDEXCAPACITYINPUT, value); }
    /** Unsafe version of {@link #indexCountOutput(int) indexCountOutput}. */
    public static void nindexCountOutput(long struct, int value) { UNSAFE.putInt(null, struct + XrSceneMeshIndicesUint32MSFT.INDEXCOUNTOUTPUT, value); }
    /** Unsafe version of {@link #indices(IntBuffer) indices}. */
    public static void nindices(long struct, @Nullable IntBuffer value) { memPutAddress(struct + XrSceneMeshIndicesUint32MSFT.INDICES, memAddressSafe(value)); if (value != null) { nindexCapacityInput(struct, value.remaining()); } }

    // -----------------------------------

    /** An array of {@link XrSceneMeshIndicesUint32MSFT} structs. */
    public static class Buffer extends StructBuffer<XrSceneMeshIndicesUint32MSFT, Buffer> implements NativeResource {

        private static final XrSceneMeshIndicesUint32MSFT ELEMENT_FACTORY = XrSceneMeshIndicesUint32MSFT.create(-1L);

        /**
         * Creates a new {@code XrSceneMeshIndicesUint32MSFT.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link XrSceneMeshIndicesUint32MSFT#SIZEOF}, and its mark will be undefined.
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
        protected XrSceneMeshIndicesUint32MSFT getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link XrSceneMeshIndicesUint32MSFT#type} field. */
        @NativeType("XrStructureType")
        public int type() { return XrSceneMeshIndicesUint32MSFT.ntype(address()); }
        /** @return the value of the {@link XrSceneMeshIndicesUint32MSFT#next} field. */
        @NativeType("void *")
        public long next() { return XrSceneMeshIndicesUint32MSFT.nnext(address()); }
        /** @return the value of the {@link XrSceneMeshIndicesUint32MSFT#indexCapacityInput} field. */
        @NativeType("uint32_t")
        public int indexCapacityInput() { return XrSceneMeshIndicesUint32MSFT.nindexCapacityInput(address()); }
        /** @return the value of the {@link XrSceneMeshIndicesUint32MSFT#indexCountOutput} field. */
        @NativeType("uint32_t")
        public int indexCountOutput() { return XrSceneMeshIndicesUint32MSFT.nindexCountOutput(address()); }
        /** @return a {@link IntBuffer} view of the data pointed to by the {@link XrSceneMeshIndicesUint32MSFT#indices} field. */
        @Nullable
        @NativeType("uint32_t *")
        public IntBuffer indices() { return XrSceneMeshIndicesUint32MSFT.nindices(address()); }

        /** Sets the specified value to the {@link XrSceneMeshIndicesUint32MSFT#type} field. */
        public XrSceneMeshIndicesUint32MSFT.Buffer type(@NativeType("XrStructureType") int value) { XrSceneMeshIndicesUint32MSFT.ntype(address(), value); return this; }
        /** Sets the {@link MSFTSceneUnderstanding#XR_TYPE_SCENE_MESH_INDICES_UINT32_MSFT TYPE_SCENE_MESH_INDICES_UINT32_MSFT} value to the {@link XrSceneMeshIndicesUint32MSFT#type} field. */
        public XrSceneMeshIndicesUint32MSFT.Buffer type$Default() { return type(MSFTSceneUnderstanding.XR_TYPE_SCENE_MESH_INDICES_UINT32_MSFT); }
        /** Sets the specified value to the {@link XrSceneMeshIndicesUint32MSFT#next} field. */
        public XrSceneMeshIndicesUint32MSFT.Buffer next(@NativeType("void *") long value) { XrSceneMeshIndicesUint32MSFT.nnext(address(), value); return this; }
        /** Sets the specified value to the {@link XrSceneMeshIndicesUint32MSFT#indexCapacityInput} field. */
        public XrSceneMeshIndicesUint32MSFT.Buffer indexCapacityInput(@NativeType("uint32_t") int value) { XrSceneMeshIndicesUint32MSFT.nindexCapacityInput(address(), value); return this; }
        /** Sets the specified value to the {@link XrSceneMeshIndicesUint32MSFT#indexCountOutput} field. */
        public XrSceneMeshIndicesUint32MSFT.Buffer indexCountOutput(@NativeType("uint32_t") int value) { XrSceneMeshIndicesUint32MSFT.nindexCountOutput(address(), value); return this; }
        /** Sets the address of the specified {@link IntBuffer} to the {@link XrSceneMeshIndicesUint32MSFT#indices} field. */
        public XrSceneMeshIndicesUint32MSFT.Buffer indices(@Nullable @NativeType("uint32_t *") IntBuffer value) { XrSceneMeshIndicesUint32MSFT.nindices(address(), value); return this; }

    }

}