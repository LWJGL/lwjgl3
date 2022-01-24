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
 * The index buffer of a hand mesh.
 * 
 * <h5>Description</h5>
 * 
 * <p>An application <b>should</b> preallocate the indices array using the {@code maxHandMeshIndexCount} in {@link XrSystemHandTrackingMeshPropertiesMSFT} returned from {@link XR10#xrGetSystemProperties GetSystemProperties}. In this way, the application can avoid possible insufficient buffer sizees for each query, and therefore avoid reallocating memory each frame.</p>
 * 
 * <p>The input {@code indexCapacityInput} <b>must</b> not be 0, and {@code indices} <b>must</b> not be {@code NULL}, or else the runtime <b>must</b> return {@link XR10#XR_ERROR_VALIDATION_FAILURE ERROR_VALIDATION_FAILURE} on calls to the {@link MSFTHandTrackingMesh#xrUpdateHandMeshMSFT UpdateHandMeshMSFT} function.</p>
 * 
 * <p>If the input {@code indexCapacityInput} is not sufficient to contain all output indices, the runtime <b>must</b> return {@link XR10#XR_ERROR_SIZE_INSUFFICIENT ERROR_SIZE_INSUFFICIENT} on calls to {@link MSFTHandTrackingMesh#xrUpdateHandMeshMSFT UpdateHandMeshMSFT}, not change the content in {@code indexBufferKey} and {@code indices}, and return 0 for {@code indexCountOutput}.</p>
 * 
 * <p>If the input {@code indexCapacityInput} is equal to or larger than the {@code maxHandMeshIndexCount} in {@link XrSystemHandTrackingMeshPropertiesMSFT} returned from {@link XR10#xrGetSystemProperties GetSystemProperties}, the runtime <b>must</b> not return {@link XR10#XR_ERROR_SIZE_INSUFFICIENT ERROR_SIZE_INSUFFICIENT} error on {@link MSFTHandTrackingMesh#xrUpdateHandMeshMSFT UpdateHandMeshMSFT} because of insufficient index buffer size.</p>
 * 
 * <p>If the input {@code indexBufferKey} is 0, the capacity of indices array is sufficient, and hand mesh tracking is active, the runtime <b>must</b> return the latest non-zero {@code indexBufferKey}, and fill in {@code indexCountOutput} and {@code indices}.</p>
 * 
 * <p>If the input {@code indexBufferKey} is not 0, the runtime <b>can</b> either return without changing {@code indexCountOutput} or content in {@code indices}, and return {@link XR10#XR_FALSE FALSE} for {@code indexBufferChanged} indicating the indices are not changed; or return a new non-zero {@code indexBufferKey} and fill in latest data in {@code indexCountOutput} and {@code indices}, and return {@link XR10#XR_TRUE TRUE} for {@code indexBufferChanged} indicating the indices are updated to a newer version.</p>
 * 
 * <p>An application <b>can</b> keep the {@link XrHandMeshIndexBufferMSFT} structure for each frame in a frame loop and use the returned {@code indexBufferKey} to identify different triangle list topology described in {@code indices}. The application can therefore avoid unnecessary processing of indices, such as coping them to GPU memory.</p>
 * 
 * <p>The runtime <b>must</b> return the same {@code indexBufferKey} for the same {@code XrHandTrackerEXT} at a given time, regardless of the input {@code XrHandPoseTypeMSFT} in {@link XrHandMeshUpdateInfoMSFT}. This ensures the index buffer has the same mesh topology and allows the application to reason about vertices across different hand pose types. For example, the application <b>can</b> build a procedure to perform UV mapping on vertices of a hand mesh using {@link MSFTHandTrackingMesh#XR_HAND_POSE_TYPE_REFERENCE_OPEN_PALM_MSFT HAND_POSE_TYPE_REFERENCE_OPEN_PALM_MSFT}, and apply the resultant UV data on vertices to the mesh returned from the same hand tracker using {@link MSFTHandTrackingMesh#XR_HAND_POSE_TYPE_TRACKED_MSFT HAND_POSE_TYPE_TRACKED_MSFT}.</p>
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>The {@link MSFTHandTrackingMesh XR_MSFT_hand_tracking_mesh} extension <b>must</b> be enabled prior to using {@link XrHandMeshIndexBufferMSFT}</li>
 * <li>{@code indices} <b>must</b> be a pointer to an array of {@code indexCapacityInput} {@code uint32_t} values</li>
 * <li>The {@code indexCapacityInput} parameter <b>must</b> be greater than 0</li>
 * </ul>
 * 
 * <h5>See Also</h5>
 * 
 * <p>{@link XrHandMeshMSFT}, {@link XrSystemHandTrackingMeshPropertiesMSFT}, {@link MSFTHandTrackingMesh#xrUpdateHandMeshMSFT UpdateHandMeshMSFT}</p>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct XrHandMeshIndexBufferMSFT {
 *     uint32_t {@link #indexBufferKey};
 *     uint32_t {@link #indexCapacityInput};
 *     uint32_t {@link #indexCountOutput};
 *     uint32_t * {@link #indices};
 * }</code></pre>
 */
public class XrHandMeshIndexBufferMSFT extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        INDEXBUFFERKEY,
        INDEXCAPACITYINPUT,
        INDEXCOUNTOUTPUT,
        INDICES;

    static {
        Layout layout = __struct(
            __member(4),
            __member(4),
            __member(4),
            __member(POINTER_SIZE)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        INDEXBUFFERKEY = layout.offsetof(0);
        INDEXCAPACITYINPUT = layout.offsetof(1);
        INDEXCOUNTOUTPUT = layout.offsetof(2);
        INDICES = layout.offsetof(3);
    }

    /**
     * Creates a {@code XrHandMeshIndexBufferMSFT} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public XrHandMeshIndexBufferMSFT(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** a {@code uint32_t} serving as the key of the returned index buffer content or 0 to indicate a request to retrieve the latest indices regardless of existing content in {@code indices}. */
    @NativeType("uint32_t")
    public int indexBufferKey() { return nindexBufferKey(address()); }
    /** a positive {@code uint32_t} describes the capacity of the {@code indices} array. */
    @NativeType("uint32_t")
    public int indexCapacityInput() { return nindexCapacityInput(address()); }
    /** a {@code uint32_t} returned by the runtime with the count of indices written in {@code indices}. */
    @NativeType("uint32_t")
    public int indexCountOutput() { return nindexCountOutput(address()); }
    /** an array of indices filled in by the runtime, specifying the indices of the triangles list in the vertex buffer. */
    @NativeType("uint32_t *")
    public IntBuffer indices() { return nindices(address()); }

    /** Sets the specified value to the {@link #indexBufferKey} field. */
    public XrHandMeshIndexBufferMSFT indexBufferKey(@NativeType("uint32_t") int value) { nindexBufferKey(address(), value); return this; }
    /** Sets the specified value to the {@link #indexCountOutput} field. */
    public XrHandMeshIndexBufferMSFT indexCountOutput(@NativeType("uint32_t") int value) { nindexCountOutput(address(), value); return this; }
    /** Sets the address of the specified {@link IntBuffer} to the {@link #indices} field. */
    public XrHandMeshIndexBufferMSFT indices(@NativeType("uint32_t *") IntBuffer value) { nindices(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public XrHandMeshIndexBufferMSFT set(
        int indexBufferKey,
        int indexCountOutput,
        IntBuffer indices
    ) {
        indexBufferKey(indexBufferKey);
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
    public XrHandMeshIndexBufferMSFT set(XrHandMeshIndexBufferMSFT src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code XrHandMeshIndexBufferMSFT} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static XrHandMeshIndexBufferMSFT malloc() {
        return wrap(XrHandMeshIndexBufferMSFT.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code XrHandMeshIndexBufferMSFT} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static XrHandMeshIndexBufferMSFT calloc() {
        return wrap(XrHandMeshIndexBufferMSFT.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code XrHandMeshIndexBufferMSFT} instance allocated with {@link BufferUtils}. */
    public static XrHandMeshIndexBufferMSFT create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(XrHandMeshIndexBufferMSFT.class, memAddress(container), container);
    }

    /** Returns a new {@code XrHandMeshIndexBufferMSFT} instance for the specified memory address. */
    public static XrHandMeshIndexBufferMSFT create(long address) {
        return wrap(XrHandMeshIndexBufferMSFT.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static XrHandMeshIndexBufferMSFT createSafe(long address) {
        return address == NULL ? null : wrap(XrHandMeshIndexBufferMSFT.class, address);
    }

    /**
     * Returns a new {@link XrHandMeshIndexBufferMSFT.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrHandMeshIndexBufferMSFT.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link XrHandMeshIndexBufferMSFT.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrHandMeshIndexBufferMSFT.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrHandMeshIndexBufferMSFT.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static XrHandMeshIndexBufferMSFT.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link XrHandMeshIndexBufferMSFT.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static XrHandMeshIndexBufferMSFT.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static XrHandMeshIndexBufferMSFT.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    /**
     * Returns a new {@code XrHandMeshIndexBufferMSFT} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static XrHandMeshIndexBufferMSFT malloc(MemoryStack stack) {
        return wrap(XrHandMeshIndexBufferMSFT.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code XrHandMeshIndexBufferMSFT} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static XrHandMeshIndexBufferMSFT calloc(MemoryStack stack) {
        return wrap(XrHandMeshIndexBufferMSFT.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link XrHandMeshIndexBufferMSFT.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrHandMeshIndexBufferMSFT.Buffer malloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrHandMeshIndexBufferMSFT.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrHandMeshIndexBufferMSFT.Buffer calloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #indexBufferKey}. */
    public static int nindexBufferKey(long struct) { return UNSAFE.getInt(null, struct + XrHandMeshIndexBufferMSFT.INDEXBUFFERKEY); }
    /** Unsafe version of {@link #indexCapacityInput}. */
    public static int nindexCapacityInput(long struct) { return UNSAFE.getInt(null, struct + XrHandMeshIndexBufferMSFT.INDEXCAPACITYINPUT); }
    /** Unsafe version of {@link #indexCountOutput}. */
    public static int nindexCountOutput(long struct) { return UNSAFE.getInt(null, struct + XrHandMeshIndexBufferMSFT.INDEXCOUNTOUTPUT); }
    /** Unsafe version of {@link #indices() indices}. */
    public static IntBuffer nindices(long struct) { return memIntBuffer(memGetAddress(struct + XrHandMeshIndexBufferMSFT.INDICES), nindexCapacityInput(struct)); }

    /** Unsafe version of {@link #indexBufferKey(int) indexBufferKey}. */
    public static void nindexBufferKey(long struct, int value) { UNSAFE.putInt(null, struct + XrHandMeshIndexBufferMSFT.INDEXBUFFERKEY, value); }
    /** Sets the specified value to the {@code indexCapacityInput} field of the specified {@code struct}. */
    public static void nindexCapacityInput(long struct, int value) { UNSAFE.putInt(null, struct + XrHandMeshIndexBufferMSFT.INDEXCAPACITYINPUT, value); }
    /** Unsafe version of {@link #indexCountOutput(int) indexCountOutput}. */
    public static void nindexCountOutput(long struct, int value) { UNSAFE.putInt(null, struct + XrHandMeshIndexBufferMSFT.INDEXCOUNTOUTPUT, value); }
    /** Unsafe version of {@link #indices(IntBuffer) indices}. */
    public static void nindices(long struct, IntBuffer value) { memPutAddress(struct + XrHandMeshIndexBufferMSFT.INDICES, memAddress(value)); nindexCapacityInput(struct, value.remaining()); }

    /**
     * Validates pointer members that should not be {@code NULL}.
     *
     * @param struct the struct to validate
     */
    public static void validate(long struct) {
        check(memGetAddress(struct + XrHandMeshIndexBufferMSFT.INDICES));
    }

    // -----------------------------------

    /** An array of {@link XrHandMeshIndexBufferMSFT} structs. */
    public static class Buffer extends StructBuffer<XrHandMeshIndexBufferMSFT, Buffer> implements NativeResource {

        private static final XrHandMeshIndexBufferMSFT ELEMENT_FACTORY = XrHandMeshIndexBufferMSFT.create(-1L);

        /**
         * Creates a new {@code XrHandMeshIndexBufferMSFT.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link XrHandMeshIndexBufferMSFT#SIZEOF}, and its mark will be undefined.
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
        protected XrHandMeshIndexBufferMSFT getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link XrHandMeshIndexBufferMSFT#indexBufferKey} field. */
        @NativeType("uint32_t")
        public int indexBufferKey() { return XrHandMeshIndexBufferMSFT.nindexBufferKey(address()); }
        /** @return the value of the {@link XrHandMeshIndexBufferMSFT#indexCapacityInput} field. */
        @NativeType("uint32_t")
        public int indexCapacityInput() { return XrHandMeshIndexBufferMSFT.nindexCapacityInput(address()); }
        /** @return the value of the {@link XrHandMeshIndexBufferMSFT#indexCountOutput} field. */
        @NativeType("uint32_t")
        public int indexCountOutput() { return XrHandMeshIndexBufferMSFT.nindexCountOutput(address()); }
        /** @return a {@link IntBuffer} view of the data pointed to by the {@link XrHandMeshIndexBufferMSFT#indices} field. */
        @NativeType("uint32_t *")
        public IntBuffer indices() { return XrHandMeshIndexBufferMSFT.nindices(address()); }

        /** Sets the specified value to the {@link XrHandMeshIndexBufferMSFT#indexBufferKey} field. */
        public XrHandMeshIndexBufferMSFT.Buffer indexBufferKey(@NativeType("uint32_t") int value) { XrHandMeshIndexBufferMSFT.nindexBufferKey(address(), value); return this; }
        /** Sets the specified value to the {@link XrHandMeshIndexBufferMSFT#indexCountOutput} field. */
        public XrHandMeshIndexBufferMSFT.Buffer indexCountOutput(@NativeType("uint32_t") int value) { XrHandMeshIndexBufferMSFT.nindexCountOutput(address(), value); return this; }
        /** Sets the address of the specified {@link IntBuffer} to the {@link XrHandMeshIndexBufferMSFT#indices} field. */
        public XrHandMeshIndexBufferMSFT.Buffer indices(@NativeType("uint32_t *") IntBuffer value) { XrHandMeshIndexBufferMSFT.nindices(address(), value); return this; }

    }

}