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

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * The vertex buffer of a hand mesh.
 * 
 * <h5>Description</h5>
 * 
 * <p>An application <b>should</b> preallocate the vertices array using the {@code maxHandMeshVertexCount} in {@link XrSystemHandTrackingMeshPropertiesMSFT} returned from {@link XR10#xrGetSystemProperties GetSystemProperties}. In this way, the application can avoid possible insufficient buffer sizes for each query, and therefore avoid reallocating memory each frame.</p>
 * 
 * <p>The input {@code vertexCapacityInput} <b>must</b> not be 0, and {@code vertices} <b>must</b> not be {@code NULL}, or else the runtime <b>must</b> return {@link XR10#XR_ERROR_VALIDATION_FAILURE ERROR_VALIDATION_FAILURE} on calls to the {@link MSFTHandTrackingMesh#xrUpdateHandMeshMSFT UpdateHandMeshMSFT} function.</p>
 * 
 * <p>If the input {@code vertexCapacityInput} is not sufficient to contain all output vertices, the runtime <b>must</b> return {@link XR10#XR_ERROR_SIZE_INSUFFICIENT ERROR_SIZE_INSUFFICIENT} on calls to the {@link MSFTHandTrackingMesh#xrUpdateHandMeshMSFT UpdateHandMeshMSFT}, do not change content in {@code vertexUpdateTime} and {@code vertices}, and return 0 for {@code vertexCountOutput}.</p>
 * 
 * <p>If the input {@code vertexCapacityInput} is equal to or larger than the {@code maxHandMeshVertexCount} in {@link XrSystemHandTrackingMeshPropertiesMSFT} returned from {@link XR10#xrGetSystemProperties GetSystemProperties}, the runtime <b>must</b> not return {@link XR10#XR_ERROR_SIZE_INSUFFICIENT ERROR_SIZE_INSUFFICIENT} on calls to the {@link MSFTHandTrackingMesh#xrUpdateHandMeshMSFT UpdateHandMeshMSFT} because of insufficient vertex buffer size.</p>
 * 
 * <p>If the input {@code vertexUpdateTime} is 0, and the capacity of the vertices array is sufficient, and hand mesh tracking is active, the runtime <b>must</b> return the latest non-zero {@code vertexUpdateTime}, and fill in the {@code vertexCountOutput} and {@code vertices} fields.</p>
 * 
 * <p>If the input {@code vertexUpdateTime} is not 0, the runtime <b>can</b> either return without changing {@code vertexCountOutput} or the content in {@code vertices}, and return {@link XR10#XR_FALSE FALSE} for {@code vertexBufferChanged} indicating the vertices are not changed; or return a new non-zero {@code vertexUpdateTime} and fill in latest data in {@code vertexCountOutput} and {@code vertices} and return {@link XR10#XR_TRUE TRUE} for {@code vertexBufferChanged} indicating the vertices are updated to a newer version.</p>
 * 
 * <p>An application <b>can</b> keep the {@link XrHandMeshVertexBufferMSFT} structure for each frame in frame loop and use the returned {@code vertexUpdateTime} to detect the changes of the content in {@code vertices}. The application can therefore avoid unnecessary processing of vertices, such as coping them to GPU memory.</p>
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>The {@link MSFTHandTrackingMesh XR_MSFT_hand_tracking_mesh} extension <b>must</b> be enabled prior to using {@link XrHandMeshVertexBufferMSFT}</li>
 * <li>{@code vertices} <b>must</b> be a pointer to an array of {@code vertexCapacityInput} {@link XrHandMeshVertexMSFT} structures</li>
 * <li>The {@code vertexCapacityInput} parameter <b>must</b> be greater than 0</li>
 * </ul>
 * 
 * <h5>See Also</h5>
 * 
 * <p>{@link XrHandMeshMSFT}, {@link XrHandMeshVertexMSFT}, {@link XrSystemHandTrackingMeshPropertiesMSFT}, {@link MSFTHandTrackingMesh#xrUpdateHandMeshMSFT UpdateHandMeshMSFT}</p>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct XrHandMeshVertexBufferMSFT {
 *     XrTime {@link #vertexUpdateTime};
 *     uint32_t {@link #vertexCapacityInput};
 *     uint32_t {@link #vertexCountOutput};
 *     {@link XrHandMeshVertexMSFT XrHandMeshVertexMSFT} * {@link #vertices};
 * }</code></pre>
 */
public class XrHandMeshVertexBufferMSFT extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        VERTEXUPDATETIME,
        VERTEXCAPACITYINPUT,
        VERTEXCOUNTOUTPUT,
        VERTICES;

    static {
        Layout layout = __struct(
            __member(8),
            __member(4),
            __member(4),
            __member(POINTER_SIZE)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        VERTEXUPDATETIME = layout.offsetof(0);
        VERTEXCAPACITYINPUT = layout.offsetof(1);
        VERTEXCOUNTOUTPUT = layout.offsetof(2);
        VERTICES = layout.offsetof(3);
    }

    /**
     * Creates a {@code XrHandMeshVertexBufferMSFT} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public XrHandMeshVertexBufferMSFT(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** an {@code XrTime} representing the time when the runtime receives the vertex buffer content or 0 to indicate a request to retrieve latest vertices regardless of existing content in {@code vertices}. */
    @NativeType("XrTime")
    public long vertexUpdateTime() { return nvertexUpdateTime(address()); }
    /** a positive {@code uint32_t} describes the capacity of the {@code vertices} array. */
    @NativeType("uint32_t")
    public int vertexCapacityInput() { return nvertexCapacityInput(address()); }
    /** a {@code uint32_t} filled in by the runtime with the count of vertices written in {@code vertices}. */
    @NativeType("uint32_t")
    public int vertexCountOutput() { return nvertexCountOutput(address()); }
    /** an array of {@link XrHandMeshVertexMSFT} filled in by the runtime, specifying the vertices of the hand mesh including the position and normal vector in the hand mesh space. */
    @NativeType("XrHandMeshVertexMSFT *")
    public XrHandMeshVertexMSFT.Buffer vertices() { return nvertices(address()); }

    /** Sets the specified value to the {@link #vertexUpdateTime} field. */
    public XrHandMeshVertexBufferMSFT vertexUpdateTime(@NativeType("XrTime") long value) { nvertexUpdateTime(address(), value); return this; }
    /** Sets the specified value to the {@link #vertexCountOutput} field. */
    public XrHandMeshVertexBufferMSFT vertexCountOutput(@NativeType("uint32_t") int value) { nvertexCountOutput(address(), value); return this; }
    /** Sets the address of the specified {@link XrHandMeshVertexMSFT.Buffer} to the {@link #vertices} field. */
    public XrHandMeshVertexBufferMSFT vertices(@NativeType("XrHandMeshVertexMSFT *") XrHandMeshVertexMSFT.Buffer value) { nvertices(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public XrHandMeshVertexBufferMSFT set(
        long vertexUpdateTime,
        int vertexCountOutput,
        XrHandMeshVertexMSFT.Buffer vertices
    ) {
        vertexUpdateTime(vertexUpdateTime);
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
    public XrHandMeshVertexBufferMSFT set(XrHandMeshVertexBufferMSFT src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code XrHandMeshVertexBufferMSFT} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static XrHandMeshVertexBufferMSFT malloc() {
        return wrap(XrHandMeshVertexBufferMSFT.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code XrHandMeshVertexBufferMSFT} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static XrHandMeshVertexBufferMSFT calloc() {
        return wrap(XrHandMeshVertexBufferMSFT.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code XrHandMeshVertexBufferMSFT} instance allocated with {@link BufferUtils}. */
    public static XrHandMeshVertexBufferMSFT create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(XrHandMeshVertexBufferMSFT.class, memAddress(container), container);
    }

    /** Returns a new {@code XrHandMeshVertexBufferMSFT} instance for the specified memory address. */
    public static XrHandMeshVertexBufferMSFT create(long address) {
        return wrap(XrHandMeshVertexBufferMSFT.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static XrHandMeshVertexBufferMSFT createSafe(long address) {
        return address == NULL ? null : wrap(XrHandMeshVertexBufferMSFT.class, address);
    }

    /**
     * Returns a new {@link XrHandMeshVertexBufferMSFT.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrHandMeshVertexBufferMSFT.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link XrHandMeshVertexBufferMSFT.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrHandMeshVertexBufferMSFT.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrHandMeshVertexBufferMSFT.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static XrHandMeshVertexBufferMSFT.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link XrHandMeshVertexBufferMSFT.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static XrHandMeshVertexBufferMSFT.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static XrHandMeshVertexBufferMSFT.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    /**
     * Returns a new {@code XrHandMeshVertexBufferMSFT} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static XrHandMeshVertexBufferMSFT malloc(MemoryStack stack) {
        return wrap(XrHandMeshVertexBufferMSFT.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code XrHandMeshVertexBufferMSFT} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static XrHandMeshVertexBufferMSFT calloc(MemoryStack stack) {
        return wrap(XrHandMeshVertexBufferMSFT.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link XrHandMeshVertexBufferMSFT.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrHandMeshVertexBufferMSFT.Buffer malloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrHandMeshVertexBufferMSFT.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrHandMeshVertexBufferMSFT.Buffer calloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #vertexUpdateTime}. */
    public static long nvertexUpdateTime(long struct) { return UNSAFE.getLong(null, struct + XrHandMeshVertexBufferMSFT.VERTEXUPDATETIME); }
    /** Unsafe version of {@link #vertexCapacityInput}. */
    public static int nvertexCapacityInput(long struct) { return UNSAFE.getInt(null, struct + XrHandMeshVertexBufferMSFT.VERTEXCAPACITYINPUT); }
    /** Unsafe version of {@link #vertexCountOutput}. */
    public static int nvertexCountOutput(long struct) { return UNSAFE.getInt(null, struct + XrHandMeshVertexBufferMSFT.VERTEXCOUNTOUTPUT); }
    /** Unsafe version of {@link #vertices}. */
    public static XrHandMeshVertexMSFT.Buffer nvertices(long struct) { return XrHandMeshVertexMSFT.create(memGetAddress(struct + XrHandMeshVertexBufferMSFT.VERTICES), nvertexCapacityInput(struct)); }

    /** Unsafe version of {@link #vertexUpdateTime(long) vertexUpdateTime}. */
    public static void nvertexUpdateTime(long struct, long value) { UNSAFE.putLong(null, struct + XrHandMeshVertexBufferMSFT.VERTEXUPDATETIME, value); }
    /** Sets the specified value to the {@code vertexCapacityInput} field of the specified {@code struct}. */
    public static void nvertexCapacityInput(long struct, int value) { UNSAFE.putInt(null, struct + XrHandMeshVertexBufferMSFT.VERTEXCAPACITYINPUT, value); }
    /** Unsafe version of {@link #vertexCountOutput(int) vertexCountOutput}. */
    public static void nvertexCountOutput(long struct, int value) { UNSAFE.putInt(null, struct + XrHandMeshVertexBufferMSFT.VERTEXCOUNTOUTPUT, value); }
    /** Unsafe version of {@link #vertices(XrHandMeshVertexMSFT.Buffer) vertices}. */
    public static void nvertices(long struct, XrHandMeshVertexMSFT.Buffer value) { memPutAddress(struct + XrHandMeshVertexBufferMSFT.VERTICES, value.address()); nvertexCapacityInput(struct, value.remaining()); }

    /**
     * Validates pointer members that should not be {@code NULL}.
     *
     * @param struct the struct to validate
     */
    public static void validate(long struct) {
        check(memGetAddress(struct + XrHandMeshVertexBufferMSFT.VERTICES));
    }

    // -----------------------------------

    /** An array of {@link XrHandMeshVertexBufferMSFT} structs. */
    public static class Buffer extends StructBuffer<XrHandMeshVertexBufferMSFT, Buffer> implements NativeResource {

        private static final XrHandMeshVertexBufferMSFT ELEMENT_FACTORY = XrHandMeshVertexBufferMSFT.create(-1L);

        /**
         * Creates a new {@code XrHandMeshVertexBufferMSFT.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link XrHandMeshVertexBufferMSFT#SIZEOF}, and its mark will be undefined.
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
        protected XrHandMeshVertexBufferMSFT getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link XrHandMeshVertexBufferMSFT#vertexUpdateTime} field. */
        @NativeType("XrTime")
        public long vertexUpdateTime() { return XrHandMeshVertexBufferMSFT.nvertexUpdateTime(address()); }
        /** @return the value of the {@link XrHandMeshVertexBufferMSFT#vertexCapacityInput} field. */
        @NativeType("uint32_t")
        public int vertexCapacityInput() { return XrHandMeshVertexBufferMSFT.nvertexCapacityInput(address()); }
        /** @return the value of the {@link XrHandMeshVertexBufferMSFT#vertexCountOutput} field. */
        @NativeType("uint32_t")
        public int vertexCountOutput() { return XrHandMeshVertexBufferMSFT.nvertexCountOutput(address()); }
        /** @return a {@link XrHandMeshVertexMSFT.Buffer} view of the struct array pointed to by the {@link XrHandMeshVertexBufferMSFT#vertices} field. */
        @NativeType("XrHandMeshVertexMSFT *")
        public XrHandMeshVertexMSFT.Buffer vertices() { return XrHandMeshVertexBufferMSFT.nvertices(address()); }

        /** Sets the specified value to the {@link XrHandMeshVertexBufferMSFT#vertexUpdateTime} field. */
        public XrHandMeshVertexBufferMSFT.Buffer vertexUpdateTime(@NativeType("XrTime") long value) { XrHandMeshVertexBufferMSFT.nvertexUpdateTime(address(), value); return this; }
        /** Sets the specified value to the {@link XrHandMeshVertexBufferMSFT#vertexCountOutput} field. */
        public XrHandMeshVertexBufferMSFT.Buffer vertexCountOutput(@NativeType("uint32_t") int value) { XrHandMeshVertexBufferMSFT.nvertexCountOutput(address(), value); return this; }
        /** Sets the address of the specified {@link XrHandMeshVertexMSFT.Buffer} to the {@link XrHandMeshVertexBufferMSFT#vertices} field. */
        public XrHandMeshVertexBufferMSFT.Buffer vertices(@NativeType("XrHandMeshVertexMSFT *") XrHandMeshVertexMSFT.Buffer value) { XrHandMeshVertexBufferMSFT.nvertices(address(), value); return this; }

    }

}