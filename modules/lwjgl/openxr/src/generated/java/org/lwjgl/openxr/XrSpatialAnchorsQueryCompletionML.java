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
 * Completion structure to retrieve the result of the anchor query.
 * 
 * <h5>Future Return Codes</h5>
 * 
 * <p>{@code futureResult} values:</p>
 * 
 * <dl>
 * <dt><a href="https://registry.khronos.org/OpenXR/specs/1.1/html/xrspec.html#fundamentals-successcodes">Success</a></dt>
 * <dd><ul>
 * <li>{@link XR10#XR_SUCCESS SUCCESS}</li>
 * <li>{@link XR10#XR_SESSION_LOSS_PENDING SESSION_LOSS_PENDING}</li>
 * </ul></dd>
 * <dt><a href="https://registry.khronos.org/OpenXR/specs/1.1/html/xrspec.html#fundamentals-errorcodes">Failure</a></dt>
 * <dd><ul>
 * <li>{@link XR10#XR_ERROR_RUNTIME_FAILURE ERROR_RUNTIME_FAILURE}</li>
 * <li>{@link XR10#XR_ERROR_INSTANCE_LOST ERROR_INSTANCE_LOST}</li>
 * <li>{@link XR10#XR_ERROR_SESSION_LOST ERROR_SESSION_LOST}</li>
 * <li>{@link XR10#XR_ERROR_OUT_OF_MEMORY ERROR_OUT_OF_MEMORY}</li>
 * <li>{@link XR10#XR_ERROR_LIMIT_REACHED ERROR_LIMIT_REACHED}</li>
 * <li>{@link XR10#XR_ERROR_VALIDATION_FAILURE ERROR_VALIDATION_FAILURE}</li>
 * <li>{@link EXTPlaneDetection#XR_ERROR_SPACE_NOT_LOCATABLE_EXT ERROR_SPACE_NOT_LOCATABLE_EXT}</li>
 * <li>{@link MLSpatialAnchors#XR_ERROR_SPATIAL_ANCHORS_SPACE_NOT_LOCATABLE_ML ERROR_SPATIAL_ANCHORS_SPACE_NOT_LOCATABLE_ML}</li>
 * <li>{@link MLSpatialAnchors#XR_ERROR_SPATIAL_ANCHORS_NOT_LOCALIZED_ML ERROR_SPATIAL_ANCHORS_NOT_LOCALIZED_ML}</li>
 * </ul></dd>
 * </dl>
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>The {@link MLSpatialAnchorsStorage XR_ML_spatial_anchors_storage} extension <b>must</b> be enabled prior to using {@link XrSpatialAnchorsQueryCompletionML}</li>
 * <li>{@code type} <b>must</b> be {@link MLSpatialAnchorsStorage#XR_TYPE_SPATIAL_ANCHORS_QUERY_COMPLETION_ML TYPE_SPATIAL_ANCHORS_QUERY_COMPLETION_ML}</li>
 * <li>{@code next} <b>must</b> be {@code NULL} or a valid pointer to the <a href="https://registry.khronos.org/OpenXR/specs/1.0/html/xrspec.html#valid-usage-for-structure-pointer-chains">next structure in a structure chain</a></li>
 * <li>If {@code futureResult} is not 0, {@code futureResult} <b>must</b> be a valid {@code XrResult} value</li>
 * <li>If {@code uuidCapacityInput} is not 0, {@code uuids} <b>must</b> be a pointer to an array of {@code uuidCapacityInput} {@link XrUuidEXT} structures</li>
 * </ul>
 * 
 * <h5>See Also</h5>
 * 
 * <p>{@link XrUuidEXT}, {@link MLSpatialAnchorsStorage#xrQuerySpatialAnchorsAsyncML QuerySpatialAnchorsAsyncML}, {@link MLSpatialAnchorsStorage#xrQuerySpatialAnchorsCompleteML QuerySpatialAnchorsCompleteML}</p>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct XrSpatialAnchorsQueryCompletionML {
 *     XrStructureType {@link #type};
 *     void * {@link #next};
 *     XrResult {@link #futureResult};
 *     uint32_t {@link #uuidCapacityInput};
 *     uint32_t {@link #uuidCountOutput};
 *     {@link XrUuidEXT XrUuidEXT} * {@link #uuids};
 * }</code></pre>
 */
public class XrSpatialAnchorsQueryCompletionML extends Struct<XrSpatialAnchorsQueryCompletionML> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        TYPE,
        NEXT,
        FUTURERESULT,
        UUIDCAPACITYINPUT,
        UUIDCOUNTOUTPUT,
        UUIDS;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(4),
            __member(4),
            __member(4),
            __member(POINTER_SIZE)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        TYPE = layout.offsetof(0);
        NEXT = layout.offsetof(1);
        FUTURERESULT = layout.offsetof(2);
        UUIDCAPACITYINPUT = layout.offsetof(3);
        UUIDCOUNTOUTPUT = layout.offsetof(4);
        UUIDS = layout.offsetof(5);
    }

    protected XrSpatialAnchorsQueryCompletionML(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected XrSpatialAnchorsQueryCompletionML create(long address, @Nullable ByteBuffer container) {
        return new XrSpatialAnchorsQueryCompletionML(address, container);
    }

    /**
     * Creates a {@code XrSpatialAnchorsQueryCompletionML} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public XrSpatialAnchorsQueryCompletionML(ByteBuffer container) {
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
    /** the {@code XrResult} of the asynchronous operation. */
    @NativeType("XrResult")
    public int futureResult() { return nfutureResult(address()); }
    /** the capacity of the {@code uuids} array, or 0 to indicate a request to retrieve the required capacity. */
    @NativeType("uint32_t")
    public int uuidCapacityInput() { return nuuidCapacityInput(address()); }
    /** the number of elements populated in {@code uuids}, or the required capacity in the case that {@code uuidCapacityInput} is insufficient. */
    @NativeType("uint32_t")
    public int uuidCountOutput() { return nuuidCountOutput(address()); }
    /** an array of {@link XrUuidEXT}. */
    @Nullable
    @NativeType("XrUuidEXT *")
    public XrUuidEXT.Buffer uuids() { return nuuids(address()); }

    /** Sets the specified value to the {@link #type} field. */
    public XrSpatialAnchorsQueryCompletionML type(@NativeType("XrStructureType") int value) { ntype(address(), value); return this; }
    /** Sets the {@link MLSpatialAnchorsStorage#XR_TYPE_SPATIAL_ANCHORS_QUERY_COMPLETION_ML TYPE_SPATIAL_ANCHORS_QUERY_COMPLETION_ML} value to the {@link #type} field. */
    public XrSpatialAnchorsQueryCompletionML type$Default() { return type(MLSpatialAnchorsStorage.XR_TYPE_SPATIAL_ANCHORS_QUERY_COMPLETION_ML); }
    /** Sets the specified value to the {@link #next} field. */
    public XrSpatialAnchorsQueryCompletionML next(@NativeType("void *") long value) { nnext(address(), value); return this; }
    /** Sets the specified value to the {@link #futureResult} field. */
    public XrSpatialAnchorsQueryCompletionML futureResult(@NativeType("XrResult") int value) { nfutureResult(address(), value); return this; }
    /** Sets the specified value to the {@link #uuidCapacityInput} field. */
    public XrSpatialAnchorsQueryCompletionML uuidCapacityInput(@NativeType("uint32_t") int value) { nuuidCapacityInput(address(), value); return this; }
    /** Sets the specified value to the {@link #uuidCountOutput} field. */
    public XrSpatialAnchorsQueryCompletionML uuidCountOutput(@NativeType("uint32_t") int value) { nuuidCountOutput(address(), value); return this; }
    /** Sets the address of the specified {@link XrUuidEXT.Buffer} to the {@link #uuids} field. */
    public XrSpatialAnchorsQueryCompletionML uuids(@Nullable @NativeType("XrUuidEXT *") XrUuidEXT.Buffer value) { nuuids(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public XrSpatialAnchorsQueryCompletionML set(
        int type,
        long next,
        int futureResult,
        int uuidCapacityInput,
        int uuidCountOutput,
        @Nullable XrUuidEXT.Buffer uuids
    ) {
        type(type);
        next(next);
        futureResult(futureResult);
        uuidCapacityInput(uuidCapacityInput);
        uuidCountOutput(uuidCountOutput);
        uuids(uuids);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public XrSpatialAnchorsQueryCompletionML set(XrSpatialAnchorsQueryCompletionML src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code XrSpatialAnchorsQueryCompletionML} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static XrSpatialAnchorsQueryCompletionML malloc() {
        return new XrSpatialAnchorsQueryCompletionML(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code XrSpatialAnchorsQueryCompletionML} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static XrSpatialAnchorsQueryCompletionML calloc() {
        return new XrSpatialAnchorsQueryCompletionML(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code XrSpatialAnchorsQueryCompletionML} instance allocated with {@link BufferUtils}. */
    public static XrSpatialAnchorsQueryCompletionML create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new XrSpatialAnchorsQueryCompletionML(memAddress(container), container);
    }

    /** Returns a new {@code XrSpatialAnchorsQueryCompletionML} instance for the specified memory address. */
    public static XrSpatialAnchorsQueryCompletionML create(long address) {
        return new XrSpatialAnchorsQueryCompletionML(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static XrSpatialAnchorsQueryCompletionML createSafe(long address) {
        return address == NULL ? null : new XrSpatialAnchorsQueryCompletionML(address, null);
    }

    /** Downcasts the specified {@code XrFutureCompletionBaseHeaderEXT} instance to {@code XrSpatialAnchorsQueryCompletionML}. */
    public static XrSpatialAnchorsQueryCompletionML create(XrFutureCompletionBaseHeaderEXT value) {
        return new XrSpatialAnchorsQueryCompletionML(value.address(), __getContainer(value));
    }

    /**
     * Returns a new {@link XrSpatialAnchorsQueryCompletionML.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrSpatialAnchorsQueryCompletionML.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link XrSpatialAnchorsQueryCompletionML.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrSpatialAnchorsQueryCompletionML.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrSpatialAnchorsQueryCompletionML.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static XrSpatialAnchorsQueryCompletionML.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link XrSpatialAnchorsQueryCompletionML.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static XrSpatialAnchorsQueryCompletionML.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static XrSpatialAnchorsQueryCompletionML.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /** Downcasts the specified {@code XrFutureCompletionBaseHeaderEXT.Buffer} instance to {@code XrSpatialAnchorsQueryCompletionML.Buffer}. */
    public static XrSpatialAnchorsQueryCompletionML.Buffer create(XrFutureCompletionBaseHeaderEXT.Buffer value) {
        return new XrSpatialAnchorsQueryCompletionML.Buffer(value.address(), __getContainer(value), -1, 0, value.remaining(), value.remaining());
    }

    /**
     * Returns a new {@code XrSpatialAnchorsQueryCompletionML} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static XrSpatialAnchorsQueryCompletionML malloc(MemoryStack stack) {
        return new XrSpatialAnchorsQueryCompletionML(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code XrSpatialAnchorsQueryCompletionML} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static XrSpatialAnchorsQueryCompletionML calloc(MemoryStack stack) {
        return new XrSpatialAnchorsQueryCompletionML(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link XrSpatialAnchorsQueryCompletionML.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrSpatialAnchorsQueryCompletionML.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrSpatialAnchorsQueryCompletionML.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrSpatialAnchorsQueryCompletionML.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #type}. */
    public static int ntype(long struct) { return UNSAFE.getInt(null, struct + XrSpatialAnchorsQueryCompletionML.TYPE); }
    /** Unsafe version of {@link #next}. */
    public static long nnext(long struct) { return memGetAddress(struct + XrSpatialAnchorsQueryCompletionML.NEXT); }
    /** Unsafe version of {@link #futureResult}. */
    public static int nfutureResult(long struct) { return UNSAFE.getInt(null, struct + XrSpatialAnchorsQueryCompletionML.FUTURERESULT); }
    /** Unsafe version of {@link #uuidCapacityInput}. */
    public static int nuuidCapacityInput(long struct) { return UNSAFE.getInt(null, struct + XrSpatialAnchorsQueryCompletionML.UUIDCAPACITYINPUT); }
    /** Unsafe version of {@link #uuidCountOutput}. */
    public static int nuuidCountOutput(long struct) { return UNSAFE.getInt(null, struct + XrSpatialAnchorsQueryCompletionML.UUIDCOUNTOUTPUT); }
    /** Unsafe version of {@link #uuids}. */
    @Nullable public static XrUuidEXT.Buffer nuuids(long struct) { return XrUuidEXT.createSafe(memGetAddress(struct + XrSpatialAnchorsQueryCompletionML.UUIDS), nuuidCapacityInput(struct)); }

    /** Unsafe version of {@link #type(int) type}. */
    public static void ntype(long struct, int value) { UNSAFE.putInt(null, struct + XrSpatialAnchorsQueryCompletionML.TYPE, value); }
    /** Unsafe version of {@link #next(long) next}. */
    public static void nnext(long struct, long value) { memPutAddress(struct + XrSpatialAnchorsQueryCompletionML.NEXT, value); }
    /** Unsafe version of {@link #futureResult(int) futureResult}. */
    public static void nfutureResult(long struct, int value) { UNSAFE.putInt(null, struct + XrSpatialAnchorsQueryCompletionML.FUTURERESULT, value); }
    /** Sets the specified value to the {@code uuidCapacityInput} field of the specified {@code struct}. */
    public static void nuuidCapacityInput(long struct, int value) { UNSAFE.putInt(null, struct + XrSpatialAnchorsQueryCompletionML.UUIDCAPACITYINPUT, value); }
    /** Unsafe version of {@link #uuidCountOutput(int) uuidCountOutput}. */
    public static void nuuidCountOutput(long struct, int value) { UNSAFE.putInt(null, struct + XrSpatialAnchorsQueryCompletionML.UUIDCOUNTOUTPUT, value); }
    /** Unsafe version of {@link #uuids(XrUuidEXT.Buffer) uuids}. */
    public static void nuuids(long struct, @Nullable XrUuidEXT.Buffer value) { memPutAddress(struct + XrSpatialAnchorsQueryCompletionML.UUIDS, memAddressSafe(value)); if (value != null) { nuuidCapacityInput(struct, value.remaining()); } }

    // -----------------------------------

    /** An array of {@link XrSpatialAnchorsQueryCompletionML} structs. */
    public static class Buffer extends StructBuffer<XrSpatialAnchorsQueryCompletionML, Buffer> implements NativeResource {

        private static final XrSpatialAnchorsQueryCompletionML ELEMENT_FACTORY = XrSpatialAnchorsQueryCompletionML.create(-1L);

        /**
         * Creates a new {@code XrSpatialAnchorsQueryCompletionML.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link XrSpatialAnchorsQueryCompletionML#SIZEOF}, and its mark will be undefined.</p>
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
        protected XrSpatialAnchorsQueryCompletionML getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link XrSpatialAnchorsQueryCompletionML#type} field. */
        @NativeType("XrStructureType")
        public int type() { return XrSpatialAnchorsQueryCompletionML.ntype(address()); }
        /** @return the value of the {@link XrSpatialAnchorsQueryCompletionML#next} field. */
        @NativeType("void *")
        public long next() { return XrSpatialAnchorsQueryCompletionML.nnext(address()); }
        /** @return the value of the {@link XrSpatialAnchorsQueryCompletionML#futureResult} field. */
        @NativeType("XrResult")
        public int futureResult() { return XrSpatialAnchorsQueryCompletionML.nfutureResult(address()); }
        /** @return the value of the {@link XrSpatialAnchorsQueryCompletionML#uuidCapacityInput} field. */
        @NativeType("uint32_t")
        public int uuidCapacityInput() { return XrSpatialAnchorsQueryCompletionML.nuuidCapacityInput(address()); }
        /** @return the value of the {@link XrSpatialAnchorsQueryCompletionML#uuidCountOutput} field. */
        @NativeType("uint32_t")
        public int uuidCountOutput() { return XrSpatialAnchorsQueryCompletionML.nuuidCountOutput(address()); }
        /** @return a {@link XrUuidEXT.Buffer} view of the struct array pointed to by the {@link XrSpatialAnchorsQueryCompletionML#uuids} field. */
        @Nullable
        @NativeType("XrUuidEXT *")
        public XrUuidEXT.Buffer uuids() { return XrSpatialAnchorsQueryCompletionML.nuuids(address()); }

        /** Sets the specified value to the {@link XrSpatialAnchorsQueryCompletionML#type} field. */
        public XrSpatialAnchorsQueryCompletionML.Buffer type(@NativeType("XrStructureType") int value) { XrSpatialAnchorsQueryCompletionML.ntype(address(), value); return this; }
        /** Sets the {@link MLSpatialAnchorsStorage#XR_TYPE_SPATIAL_ANCHORS_QUERY_COMPLETION_ML TYPE_SPATIAL_ANCHORS_QUERY_COMPLETION_ML} value to the {@link XrSpatialAnchorsQueryCompletionML#type} field. */
        public XrSpatialAnchorsQueryCompletionML.Buffer type$Default() { return type(MLSpatialAnchorsStorage.XR_TYPE_SPATIAL_ANCHORS_QUERY_COMPLETION_ML); }
        /** Sets the specified value to the {@link XrSpatialAnchorsQueryCompletionML#next} field. */
        public XrSpatialAnchorsQueryCompletionML.Buffer next(@NativeType("void *") long value) { XrSpatialAnchorsQueryCompletionML.nnext(address(), value); return this; }
        /** Sets the specified value to the {@link XrSpatialAnchorsQueryCompletionML#futureResult} field. */
        public XrSpatialAnchorsQueryCompletionML.Buffer futureResult(@NativeType("XrResult") int value) { XrSpatialAnchorsQueryCompletionML.nfutureResult(address(), value); return this; }
        /** Sets the specified value to the {@link XrSpatialAnchorsQueryCompletionML#uuidCapacityInput} field. */
        public XrSpatialAnchorsQueryCompletionML.Buffer uuidCapacityInput(@NativeType("uint32_t") int value) { XrSpatialAnchorsQueryCompletionML.nuuidCapacityInput(address(), value); return this; }
        /** Sets the specified value to the {@link XrSpatialAnchorsQueryCompletionML#uuidCountOutput} field. */
        public XrSpatialAnchorsQueryCompletionML.Buffer uuidCountOutput(@NativeType("uint32_t") int value) { XrSpatialAnchorsQueryCompletionML.nuuidCountOutput(address(), value); return this; }
        /** Sets the address of the specified {@link XrUuidEXT.Buffer} to the {@link XrSpatialAnchorsQueryCompletionML#uuids} field. */
        public XrSpatialAnchorsQueryCompletionML.Buffer uuids(@Nullable @NativeType("XrUuidEXT *") XrUuidEXT.Buffer value) { XrSpatialAnchorsQueryCompletionML.nuuids(address(), value); return this; }

    }

}