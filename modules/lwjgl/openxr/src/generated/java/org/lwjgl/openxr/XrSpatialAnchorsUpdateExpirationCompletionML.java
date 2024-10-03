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
 * Completion structure to retrieve the result of the anchor update.
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
 * <li>{@link MLSpatialAnchorsStorage#XR_ERROR_SPATIAL_ANCHORS_ANCHOR_NOT_FOUND_ML ERROR_SPATIAL_ANCHORS_ANCHOR_NOT_FOUND_ML}</li>
 * <li>{@link MLSpatialAnchors#XR_ERROR_SPATIAL_ANCHORS_NOT_LOCALIZED_ML ERROR_SPATIAL_ANCHORS_NOT_LOCALIZED_ML}</li>
 * </ul></dd>
 * </dl>
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>The {@link MLSpatialAnchorsStorage XR_ML_spatial_anchors_storage} extension <b>must</b> be enabled prior to using {@link XrSpatialAnchorsUpdateExpirationCompletionML}</li>
 * <li>{@code type} <b>must</b> be {@link MLSpatialAnchorsStorage#XR_TYPE_SPATIAL_ANCHORS_UPDATE_EXPIRATION_COMPLETION_ML TYPE_SPATIAL_ANCHORS_UPDATE_EXPIRATION_COMPLETION_ML}</li>
 * <li>{@code next} <b>must</b> be {@code NULL} or a valid pointer to the <a href="https://registry.khronos.org/OpenXR/specs/1.0/html/xrspec.html#valid-usage-for-structure-pointer-chains">next structure in a structure chain</a>. See also: {@link XrSpatialAnchorsUpdateExpirationCompletionDetailsML}</li>
 * <li>{@code futureResult} <b>must</b> be a valid {@code XrResult} value</li>
 * </ul>
 * 
 * <h5>See Also</h5>
 * 
 * <p>{@link MLSpatialAnchorsStorage#xrUpdateSpatialAnchorsExpirationAsyncML UpdateSpatialAnchorsExpirationAsyncML}, {@link MLSpatialAnchorsStorage#xrUpdateSpatialAnchorsExpirationCompleteML UpdateSpatialAnchorsExpirationCompleteML}</p>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct XrSpatialAnchorsUpdateExpirationCompletionML {
 *     XrStructureType {@link #type};
 *     void * {@link #next};
 *     XrResult {@link #futureResult};
 * }</code></pre>
 */
public class XrSpatialAnchorsUpdateExpirationCompletionML extends Struct<XrSpatialAnchorsUpdateExpirationCompletionML> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        TYPE,
        NEXT,
        FUTURERESULT;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        TYPE = layout.offsetof(0);
        NEXT = layout.offsetof(1);
        FUTURERESULT = layout.offsetof(2);
    }

    protected XrSpatialAnchorsUpdateExpirationCompletionML(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected XrSpatialAnchorsUpdateExpirationCompletionML create(long address, @Nullable ByteBuffer container) {
        return new XrSpatialAnchorsUpdateExpirationCompletionML(address, container);
    }

    /**
     * Creates a {@code XrSpatialAnchorsUpdateExpirationCompletionML} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public XrSpatialAnchorsUpdateExpirationCompletionML(ByteBuffer container) {
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

    /** Sets the specified value to the {@link #type} field. */
    public XrSpatialAnchorsUpdateExpirationCompletionML type(@NativeType("XrStructureType") int value) { ntype(address(), value); return this; }
    /** Sets the {@link MLSpatialAnchorsStorage#XR_TYPE_SPATIAL_ANCHORS_UPDATE_EXPIRATION_COMPLETION_ML TYPE_SPATIAL_ANCHORS_UPDATE_EXPIRATION_COMPLETION_ML} value to the {@link #type} field. */
    public XrSpatialAnchorsUpdateExpirationCompletionML type$Default() { return type(MLSpatialAnchorsStorage.XR_TYPE_SPATIAL_ANCHORS_UPDATE_EXPIRATION_COMPLETION_ML); }
    /** Sets the specified value to the {@link #next} field. */
    public XrSpatialAnchorsUpdateExpirationCompletionML next(@NativeType("void *") long value) { nnext(address(), value); return this; }
    /** Prepends the specified {@link XrSpatialAnchorsUpdateExpirationCompletionDetailsML} value to the {@code next} chain. */
    public XrSpatialAnchorsUpdateExpirationCompletionML next(XrSpatialAnchorsUpdateExpirationCompletionDetailsML value) { return this.next(value.next(this.next()).address()); }
    /** Sets the specified value to the {@link #futureResult} field. */
    public XrSpatialAnchorsUpdateExpirationCompletionML futureResult(@NativeType("XrResult") int value) { nfutureResult(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public XrSpatialAnchorsUpdateExpirationCompletionML set(
        int type,
        long next,
        int futureResult
    ) {
        type(type);
        next(next);
        futureResult(futureResult);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public XrSpatialAnchorsUpdateExpirationCompletionML set(XrSpatialAnchorsUpdateExpirationCompletionML src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code XrSpatialAnchorsUpdateExpirationCompletionML} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static XrSpatialAnchorsUpdateExpirationCompletionML malloc() {
        return new XrSpatialAnchorsUpdateExpirationCompletionML(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code XrSpatialAnchorsUpdateExpirationCompletionML} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static XrSpatialAnchorsUpdateExpirationCompletionML calloc() {
        return new XrSpatialAnchorsUpdateExpirationCompletionML(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code XrSpatialAnchorsUpdateExpirationCompletionML} instance allocated with {@link BufferUtils}. */
    public static XrSpatialAnchorsUpdateExpirationCompletionML create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new XrSpatialAnchorsUpdateExpirationCompletionML(memAddress(container), container);
    }

    /** Returns a new {@code XrSpatialAnchorsUpdateExpirationCompletionML} instance for the specified memory address. */
    public static XrSpatialAnchorsUpdateExpirationCompletionML create(long address) {
        return new XrSpatialAnchorsUpdateExpirationCompletionML(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static XrSpatialAnchorsUpdateExpirationCompletionML createSafe(long address) {
        return address == NULL ? null : new XrSpatialAnchorsUpdateExpirationCompletionML(address, null);
    }

    /** Downcasts the specified {@code XrFutureCompletionBaseHeaderEXT} instance to {@code XrSpatialAnchorsUpdateExpirationCompletionML}. */
    public static XrSpatialAnchorsUpdateExpirationCompletionML create(XrFutureCompletionBaseHeaderEXT value) {
        return new XrSpatialAnchorsUpdateExpirationCompletionML(value.address(), __getContainer(value));
    }

    /**
     * Returns a new {@link XrSpatialAnchorsUpdateExpirationCompletionML.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrSpatialAnchorsUpdateExpirationCompletionML.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link XrSpatialAnchorsUpdateExpirationCompletionML.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrSpatialAnchorsUpdateExpirationCompletionML.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrSpatialAnchorsUpdateExpirationCompletionML.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static XrSpatialAnchorsUpdateExpirationCompletionML.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link XrSpatialAnchorsUpdateExpirationCompletionML.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static XrSpatialAnchorsUpdateExpirationCompletionML.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static XrSpatialAnchorsUpdateExpirationCompletionML.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /** Downcasts the specified {@code XrFutureCompletionBaseHeaderEXT.Buffer} instance to {@code XrSpatialAnchorsUpdateExpirationCompletionML.Buffer}. */
    public static XrSpatialAnchorsUpdateExpirationCompletionML.Buffer create(XrFutureCompletionBaseHeaderEXT.Buffer value) {
        return new XrSpatialAnchorsUpdateExpirationCompletionML.Buffer(value.address(), __getContainer(value), -1, 0, value.remaining(), value.remaining());
    }

    /**
     * Returns a new {@code XrSpatialAnchorsUpdateExpirationCompletionML} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static XrSpatialAnchorsUpdateExpirationCompletionML malloc(MemoryStack stack) {
        return new XrSpatialAnchorsUpdateExpirationCompletionML(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code XrSpatialAnchorsUpdateExpirationCompletionML} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static XrSpatialAnchorsUpdateExpirationCompletionML calloc(MemoryStack stack) {
        return new XrSpatialAnchorsUpdateExpirationCompletionML(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link XrSpatialAnchorsUpdateExpirationCompletionML.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrSpatialAnchorsUpdateExpirationCompletionML.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrSpatialAnchorsUpdateExpirationCompletionML.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrSpatialAnchorsUpdateExpirationCompletionML.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #type}. */
    public static int ntype(long struct) { return UNSAFE.getInt(null, struct + XrSpatialAnchorsUpdateExpirationCompletionML.TYPE); }
    /** Unsafe version of {@link #next}. */
    public static long nnext(long struct) { return memGetAddress(struct + XrSpatialAnchorsUpdateExpirationCompletionML.NEXT); }
    /** Unsafe version of {@link #futureResult}. */
    public static int nfutureResult(long struct) { return UNSAFE.getInt(null, struct + XrSpatialAnchorsUpdateExpirationCompletionML.FUTURERESULT); }

    /** Unsafe version of {@link #type(int) type}. */
    public static void ntype(long struct, int value) { UNSAFE.putInt(null, struct + XrSpatialAnchorsUpdateExpirationCompletionML.TYPE, value); }
    /** Unsafe version of {@link #next(long) next}. */
    public static void nnext(long struct, long value) { memPutAddress(struct + XrSpatialAnchorsUpdateExpirationCompletionML.NEXT, value); }
    /** Unsafe version of {@link #futureResult(int) futureResult}. */
    public static void nfutureResult(long struct, int value) { UNSAFE.putInt(null, struct + XrSpatialAnchorsUpdateExpirationCompletionML.FUTURERESULT, value); }

    // -----------------------------------

    /** An array of {@link XrSpatialAnchorsUpdateExpirationCompletionML} structs. */
    public static class Buffer extends StructBuffer<XrSpatialAnchorsUpdateExpirationCompletionML, Buffer> implements NativeResource {

        private static final XrSpatialAnchorsUpdateExpirationCompletionML ELEMENT_FACTORY = XrSpatialAnchorsUpdateExpirationCompletionML.create(-1L);

        /**
         * Creates a new {@code XrSpatialAnchorsUpdateExpirationCompletionML.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link XrSpatialAnchorsUpdateExpirationCompletionML#SIZEOF}, and its mark will be undefined.</p>
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
        protected XrSpatialAnchorsUpdateExpirationCompletionML getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link XrSpatialAnchorsUpdateExpirationCompletionML#type} field. */
        @NativeType("XrStructureType")
        public int type() { return XrSpatialAnchorsUpdateExpirationCompletionML.ntype(address()); }
        /** @return the value of the {@link XrSpatialAnchorsUpdateExpirationCompletionML#next} field. */
        @NativeType("void *")
        public long next() { return XrSpatialAnchorsUpdateExpirationCompletionML.nnext(address()); }
        /** @return the value of the {@link XrSpatialAnchorsUpdateExpirationCompletionML#futureResult} field. */
        @NativeType("XrResult")
        public int futureResult() { return XrSpatialAnchorsUpdateExpirationCompletionML.nfutureResult(address()); }

        /** Sets the specified value to the {@link XrSpatialAnchorsUpdateExpirationCompletionML#type} field. */
        public XrSpatialAnchorsUpdateExpirationCompletionML.Buffer type(@NativeType("XrStructureType") int value) { XrSpatialAnchorsUpdateExpirationCompletionML.ntype(address(), value); return this; }
        /** Sets the {@link MLSpatialAnchorsStorage#XR_TYPE_SPATIAL_ANCHORS_UPDATE_EXPIRATION_COMPLETION_ML TYPE_SPATIAL_ANCHORS_UPDATE_EXPIRATION_COMPLETION_ML} value to the {@link XrSpatialAnchorsUpdateExpirationCompletionML#type} field. */
        public XrSpatialAnchorsUpdateExpirationCompletionML.Buffer type$Default() { return type(MLSpatialAnchorsStorage.XR_TYPE_SPATIAL_ANCHORS_UPDATE_EXPIRATION_COMPLETION_ML); }
        /** Sets the specified value to the {@link XrSpatialAnchorsUpdateExpirationCompletionML#next} field. */
        public XrSpatialAnchorsUpdateExpirationCompletionML.Buffer next(@NativeType("void *") long value) { XrSpatialAnchorsUpdateExpirationCompletionML.nnext(address(), value); return this; }
        /** Prepends the specified {@link XrSpatialAnchorsUpdateExpirationCompletionDetailsML} value to the {@code next} chain. */
        public XrSpatialAnchorsUpdateExpirationCompletionML.Buffer next(XrSpatialAnchorsUpdateExpirationCompletionDetailsML value) { return this.next(value.next(this.next()).address()); }
        /** Sets the specified value to the {@link XrSpatialAnchorsUpdateExpirationCompletionML#futureResult} field. */
        public XrSpatialAnchorsUpdateExpirationCompletionML.Buffer futureResult(@NativeType("XrResult") int value) { XrSpatialAnchorsUpdateExpirationCompletionML.nfutureResult(address(), value); return this; }

    }

}