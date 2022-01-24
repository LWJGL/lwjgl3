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
 * Visibility Mask.
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>The {@link KHRVisibilityMask XR_KHR_visibility_mask} extension <b>must</b> be enabled prior to using {@link XrVisibilityMaskKHR}</li>
 * <li>{@code type} <b>must</b> be {@link KHRVisibilityMask#XR_TYPE_VISIBILITY_MASK_KHR TYPE_VISIBILITY_MASK_KHR}</li>
 * <li>{@code next} <b>must</b> be {@code NULL} or a valid pointer to the <a target="_blank" href="https://www.khronos.org/registry/OpenXR/specs/1.0/html/xrspec.html#valid-usage-for-structure-pointer-chains">next structure in a structure chain</a></li>
 * <li>If {@code vertexCapacityInput} is not 0, {@code vertices} <b>must</b> be a pointer to an array of {@code vertexCapacityInput} {@link XrVector2f} structures</li>
 * <li>If {@code indexCapacityInput} is not 0, {@code indices} <b>must</b> be a pointer to an array of {@code indexCapacityInput} {@code uint32_t} values</li>
 * </ul>
 * 
 * <h5>See Also</h5>
 * 
 * <p>{@link XrVector2f}, {@link KHRVisibilityMask#xrGetVisibilityMaskKHR GetVisibilityMaskKHR}</p>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct XrVisibilityMaskKHR {
 *     XrStructureType {@link #type};
 *     void * {@link #next};
 *     uint32_t {@link #vertexCapacityInput};
 *     uint32_t {@link #vertexCountOutput};
 *     {@link XrVector2f XrVector2f} * {@link #vertices};
 *     uint32_t {@link #indexCapacityInput};
 *     uint32_t {@link #indexCountOutput};
 *     uint32_t * {@link #indices};
 * }</code></pre>
 */
public class XrVisibilityMaskKHR extends Struct implements NativeResource {

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
        VERTICES,
        INDEXCAPACITYINPUT,
        INDEXCOUNTOUTPUT,
        INDICES;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(4),
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
        INDEXCAPACITYINPUT = layout.offsetof(5);
        INDEXCOUNTOUTPUT = layout.offsetof(6);
        INDICES = layout.offsetof(7);
    }

    /**
     * Creates a {@code XrVisibilityMaskKHR} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public XrVisibilityMaskKHR(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** the {@code XrStructureType} of this structure. */
    @NativeType("XrStructureType")
    public int type() { return ntype(address()); }
    /** {@code NULL} or a pointer to the next structure in a structure chain. No such structures are defined in core OpenXR or this extension. */
    @NativeType("void *")
    public long next() { return nnext(address()); }
    /** the capacity of the {@code vertices} array, or 0 to indicate a request to retrieve the required capacity. */
    @NativeType("uint32_t")
    public int vertexCapacityInput() { return nvertexCapacityInput(address()); }
    /** filled in by the runtime with the count of vertices written or the required capacity in the case that {@code vertexCapacityInput} or {@code indexCapacityInput} is 0. */
    @NativeType("uint32_t")
    public int vertexCountOutput() { return nvertexCountOutput(address()); }
    /** an array of vertices filled in by the runtime that specifies mask coordinates in the z=-1 plane of the rendered view—​i.e. one meter in front of the view. When rendering the mask for use in a projection layer, these vertices must be transformed by the application’s projection matrix used for the respective {@link XrCompositionLayerProjectionView}. */
    @Nullable
    @NativeType("XrVector2f *")
    public XrVector2f.Buffer vertices() { return nvertices(address()); }
    /** the capacity of the {@code indices} array, or 0 to indicate a request to retrieve the required capacity. */
    @NativeType("uint32_t")
    public int indexCapacityInput() { return nindexCapacityInput(address()); }
    /** filled in by the runtime with the count of indices written or the required capacity in the case that {@code vertexCapacityInput} or {@code indexCapacityInput} is 0. */
    @NativeType("uint32_t")
    public int indexCountOutput() { return nindexCountOutput(address()); }
    /** an array of indices filled in by the runtime, specifying the indices of the mask geometry in the {@code vertices} array. */
    @Nullable
    @NativeType("uint32_t *")
    public IntBuffer indices() { return nindices(address()); }

    /** Sets the specified value to the {@link #type} field. */
    public XrVisibilityMaskKHR type(@NativeType("XrStructureType") int value) { ntype(address(), value); return this; }
    /** Sets the {@link KHRVisibilityMask#XR_TYPE_VISIBILITY_MASK_KHR TYPE_VISIBILITY_MASK_KHR} value to the {@link #type} field. */
    public XrVisibilityMaskKHR type$Default() { return type(KHRVisibilityMask.XR_TYPE_VISIBILITY_MASK_KHR); }
    /** Sets the specified value to the {@link #next} field. */
    public XrVisibilityMaskKHR next(@NativeType("void *") long value) { nnext(address(), value); return this; }
    /** Sets the specified value to the {@link #vertexCapacityInput} field. */
    public XrVisibilityMaskKHR vertexCapacityInput(@NativeType("uint32_t") int value) { nvertexCapacityInput(address(), value); return this; }
    /** Sets the specified value to the {@link #vertexCountOutput} field. */
    public XrVisibilityMaskKHR vertexCountOutput(@NativeType("uint32_t") int value) { nvertexCountOutput(address(), value); return this; }
    /** Sets the address of the specified {@link XrVector2f.Buffer} to the {@link #vertices} field. */
    public XrVisibilityMaskKHR vertices(@Nullable @NativeType("XrVector2f *") XrVector2f.Buffer value) { nvertices(address(), value); return this; }
    /** Sets the specified value to the {@link #indexCapacityInput} field. */
    public XrVisibilityMaskKHR indexCapacityInput(@NativeType("uint32_t") int value) { nindexCapacityInput(address(), value); return this; }
    /** Sets the specified value to the {@link #indexCountOutput} field. */
    public XrVisibilityMaskKHR indexCountOutput(@NativeType("uint32_t") int value) { nindexCountOutput(address(), value); return this; }
    /** Sets the address of the specified {@link IntBuffer} to the {@link #indices} field. */
    public XrVisibilityMaskKHR indices(@Nullable @NativeType("uint32_t *") IntBuffer value) { nindices(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public XrVisibilityMaskKHR set(
        int type,
        long next,
        int vertexCapacityInput,
        int vertexCountOutput,
        @Nullable XrVector2f.Buffer vertices,
        int indexCapacityInput,
        int indexCountOutput,
        @Nullable IntBuffer indices
    ) {
        type(type);
        next(next);
        vertexCapacityInput(vertexCapacityInput);
        vertexCountOutput(vertexCountOutput);
        vertices(vertices);
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
    public XrVisibilityMaskKHR set(XrVisibilityMaskKHR src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code XrVisibilityMaskKHR} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static XrVisibilityMaskKHR malloc() {
        return wrap(XrVisibilityMaskKHR.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code XrVisibilityMaskKHR} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static XrVisibilityMaskKHR calloc() {
        return wrap(XrVisibilityMaskKHR.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code XrVisibilityMaskKHR} instance allocated with {@link BufferUtils}. */
    public static XrVisibilityMaskKHR create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(XrVisibilityMaskKHR.class, memAddress(container), container);
    }

    /** Returns a new {@code XrVisibilityMaskKHR} instance for the specified memory address. */
    public static XrVisibilityMaskKHR create(long address) {
        return wrap(XrVisibilityMaskKHR.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static XrVisibilityMaskKHR createSafe(long address) {
        return address == NULL ? null : wrap(XrVisibilityMaskKHR.class, address);
    }

    /**
     * Returns a new {@link XrVisibilityMaskKHR.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrVisibilityMaskKHR.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link XrVisibilityMaskKHR.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrVisibilityMaskKHR.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrVisibilityMaskKHR.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static XrVisibilityMaskKHR.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link XrVisibilityMaskKHR.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static XrVisibilityMaskKHR.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static XrVisibilityMaskKHR.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    /**
     * Returns a new {@code XrVisibilityMaskKHR} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static XrVisibilityMaskKHR malloc(MemoryStack stack) {
        return wrap(XrVisibilityMaskKHR.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code XrVisibilityMaskKHR} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static XrVisibilityMaskKHR calloc(MemoryStack stack) {
        return wrap(XrVisibilityMaskKHR.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link XrVisibilityMaskKHR.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrVisibilityMaskKHR.Buffer malloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrVisibilityMaskKHR.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrVisibilityMaskKHR.Buffer calloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #type}. */
    public static int ntype(long struct) { return UNSAFE.getInt(null, struct + XrVisibilityMaskKHR.TYPE); }
    /** Unsafe version of {@link #next}. */
    public static long nnext(long struct) { return memGetAddress(struct + XrVisibilityMaskKHR.NEXT); }
    /** Unsafe version of {@link #vertexCapacityInput}. */
    public static int nvertexCapacityInput(long struct) { return UNSAFE.getInt(null, struct + XrVisibilityMaskKHR.VERTEXCAPACITYINPUT); }
    /** Unsafe version of {@link #vertexCountOutput}. */
    public static int nvertexCountOutput(long struct) { return UNSAFE.getInt(null, struct + XrVisibilityMaskKHR.VERTEXCOUNTOUTPUT); }
    /** Unsafe version of {@link #vertices}. */
    @Nullable public static XrVector2f.Buffer nvertices(long struct) { return XrVector2f.createSafe(memGetAddress(struct + XrVisibilityMaskKHR.VERTICES), nvertexCapacityInput(struct)); }
    /** Unsafe version of {@link #indexCapacityInput}. */
    public static int nindexCapacityInput(long struct) { return UNSAFE.getInt(null, struct + XrVisibilityMaskKHR.INDEXCAPACITYINPUT); }
    /** Unsafe version of {@link #indexCountOutput}. */
    public static int nindexCountOutput(long struct) { return UNSAFE.getInt(null, struct + XrVisibilityMaskKHR.INDEXCOUNTOUTPUT); }
    /** Unsafe version of {@link #indices() indices}. */
    @Nullable public static IntBuffer nindices(long struct) { return memIntBufferSafe(memGetAddress(struct + XrVisibilityMaskKHR.INDICES), nindexCapacityInput(struct)); }

    /** Unsafe version of {@link #type(int) type}. */
    public static void ntype(long struct, int value) { UNSAFE.putInt(null, struct + XrVisibilityMaskKHR.TYPE, value); }
    /** Unsafe version of {@link #next(long) next}. */
    public static void nnext(long struct, long value) { memPutAddress(struct + XrVisibilityMaskKHR.NEXT, value); }
    /** Sets the specified value to the {@code vertexCapacityInput} field of the specified {@code struct}. */
    public static void nvertexCapacityInput(long struct, int value) { UNSAFE.putInt(null, struct + XrVisibilityMaskKHR.VERTEXCAPACITYINPUT, value); }
    /** Unsafe version of {@link #vertexCountOutput(int) vertexCountOutput}. */
    public static void nvertexCountOutput(long struct, int value) { UNSAFE.putInt(null, struct + XrVisibilityMaskKHR.VERTEXCOUNTOUTPUT, value); }
    /** Unsafe version of {@link #vertices(XrVector2f.Buffer) vertices}. */
    public static void nvertices(long struct, @Nullable XrVector2f.Buffer value) { memPutAddress(struct + XrVisibilityMaskKHR.VERTICES, memAddressSafe(value)); if (value != null) { nvertexCapacityInput(struct, value.remaining()); } }
    /** Sets the specified value to the {@code indexCapacityInput} field of the specified {@code struct}. */
    public static void nindexCapacityInput(long struct, int value) { UNSAFE.putInt(null, struct + XrVisibilityMaskKHR.INDEXCAPACITYINPUT, value); }
    /** Unsafe version of {@link #indexCountOutput(int) indexCountOutput}. */
    public static void nindexCountOutput(long struct, int value) { UNSAFE.putInt(null, struct + XrVisibilityMaskKHR.INDEXCOUNTOUTPUT, value); }
    /** Unsafe version of {@link #indices(IntBuffer) indices}. */
    public static void nindices(long struct, @Nullable IntBuffer value) { memPutAddress(struct + XrVisibilityMaskKHR.INDICES, memAddressSafe(value)); if (value != null) { nindexCapacityInput(struct, value.remaining()); } }

    // -----------------------------------

    /** An array of {@link XrVisibilityMaskKHR} structs. */
    public static class Buffer extends StructBuffer<XrVisibilityMaskKHR, Buffer> implements NativeResource {

        private static final XrVisibilityMaskKHR ELEMENT_FACTORY = XrVisibilityMaskKHR.create(-1L);

        /**
         * Creates a new {@code XrVisibilityMaskKHR.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link XrVisibilityMaskKHR#SIZEOF}, and its mark will be undefined.
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
        protected XrVisibilityMaskKHR getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link XrVisibilityMaskKHR#type} field. */
        @NativeType("XrStructureType")
        public int type() { return XrVisibilityMaskKHR.ntype(address()); }
        /** @return the value of the {@link XrVisibilityMaskKHR#next} field. */
        @NativeType("void *")
        public long next() { return XrVisibilityMaskKHR.nnext(address()); }
        /** @return the value of the {@link XrVisibilityMaskKHR#vertexCapacityInput} field. */
        @NativeType("uint32_t")
        public int vertexCapacityInput() { return XrVisibilityMaskKHR.nvertexCapacityInput(address()); }
        /** @return the value of the {@link XrVisibilityMaskKHR#vertexCountOutput} field. */
        @NativeType("uint32_t")
        public int vertexCountOutput() { return XrVisibilityMaskKHR.nvertexCountOutput(address()); }
        /** @return a {@link XrVector2f.Buffer} view of the struct array pointed to by the {@link XrVisibilityMaskKHR#vertices} field. */
        @Nullable
        @NativeType("XrVector2f *")
        public XrVector2f.Buffer vertices() { return XrVisibilityMaskKHR.nvertices(address()); }
        /** @return the value of the {@link XrVisibilityMaskKHR#indexCapacityInput} field. */
        @NativeType("uint32_t")
        public int indexCapacityInput() { return XrVisibilityMaskKHR.nindexCapacityInput(address()); }
        /** @return the value of the {@link XrVisibilityMaskKHR#indexCountOutput} field. */
        @NativeType("uint32_t")
        public int indexCountOutput() { return XrVisibilityMaskKHR.nindexCountOutput(address()); }
        /** @return a {@link IntBuffer} view of the data pointed to by the {@link XrVisibilityMaskKHR#indices} field. */
        @Nullable
        @NativeType("uint32_t *")
        public IntBuffer indices() { return XrVisibilityMaskKHR.nindices(address()); }

        /** Sets the specified value to the {@link XrVisibilityMaskKHR#type} field. */
        public XrVisibilityMaskKHR.Buffer type(@NativeType("XrStructureType") int value) { XrVisibilityMaskKHR.ntype(address(), value); return this; }
        /** Sets the {@link KHRVisibilityMask#XR_TYPE_VISIBILITY_MASK_KHR TYPE_VISIBILITY_MASK_KHR} value to the {@link XrVisibilityMaskKHR#type} field. */
        public XrVisibilityMaskKHR.Buffer type$Default() { return type(KHRVisibilityMask.XR_TYPE_VISIBILITY_MASK_KHR); }
        /** Sets the specified value to the {@link XrVisibilityMaskKHR#next} field. */
        public XrVisibilityMaskKHR.Buffer next(@NativeType("void *") long value) { XrVisibilityMaskKHR.nnext(address(), value); return this; }
        /** Sets the specified value to the {@link XrVisibilityMaskKHR#vertexCapacityInput} field. */
        public XrVisibilityMaskKHR.Buffer vertexCapacityInput(@NativeType("uint32_t") int value) { XrVisibilityMaskKHR.nvertexCapacityInput(address(), value); return this; }
        /** Sets the specified value to the {@link XrVisibilityMaskKHR#vertexCountOutput} field. */
        public XrVisibilityMaskKHR.Buffer vertexCountOutput(@NativeType("uint32_t") int value) { XrVisibilityMaskKHR.nvertexCountOutput(address(), value); return this; }
        /** Sets the address of the specified {@link XrVector2f.Buffer} to the {@link XrVisibilityMaskKHR#vertices} field. */
        public XrVisibilityMaskKHR.Buffer vertices(@Nullable @NativeType("XrVector2f *") XrVector2f.Buffer value) { XrVisibilityMaskKHR.nvertices(address(), value); return this; }
        /** Sets the specified value to the {@link XrVisibilityMaskKHR#indexCapacityInput} field. */
        public XrVisibilityMaskKHR.Buffer indexCapacityInput(@NativeType("uint32_t") int value) { XrVisibilityMaskKHR.nindexCapacityInput(address(), value); return this; }
        /** Sets the specified value to the {@link XrVisibilityMaskKHR#indexCountOutput} field. */
        public XrVisibilityMaskKHR.Buffer indexCountOutput(@NativeType("uint32_t") int value) { XrVisibilityMaskKHR.nindexCountOutput(address(), value); return this; }
        /** Sets the address of the specified {@link IntBuffer} to the {@link XrVisibilityMaskKHR#indices} field. */
        public XrVisibilityMaskKHR.Buffer indices(@Nullable @NativeType("uint32_t *") IntBuffer value) { XrVisibilityMaskKHR.nindices(address(), value); return this; }

    }

}