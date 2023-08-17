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
 * Specify the data source to create the hand tracker.
 * 
 * <h5>Description</h5>
 * 
 * <p>The {@link XrHandTrackingDataSourceInfoEXT} is a structure that an application <b>can</b> chain to {@link XrHandTrackerCreateInfoEXT}{@code ::next} to specify the hand tracking data sources that the application accepts.</p>
 * 
 * <p>Because the hand tracking device <b>may</b> change during a running session, the runtime <b>may</b> return a valid {@code XrHandTrackerEXT} handle even if there is no currently active hand tracking device or the active device does not safisty any or all data sources requested by the applications’s call to {@link EXTHandTracking#xrCreateHandTrackerEXT CreateHandTrackerEXT}. The runtime <b>may</b> instead return {@link XR10#XR_ERROR_FEATURE_UNSUPPORTED ERROR_FEATURE_UNSUPPORTED} from {@link EXTHandTracking#xrCreateHandTrackerEXT CreateHandTrackerEXT}, if for example the runtime believes it will never be able to satisfy the request.</p>
 * 
 * <p>If any value in {@code requestedDataSources} is duplicated, the runtime <b>must</b> return {@link XR10#XR_ERROR_VALIDATION_FAILURE ERROR_VALIDATION_FAILURE} from the call to {@link EXTHandTracking#xrCreateHandTrackerEXT CreateHandTrackerEXT}. If {@code requestedDataSourceCount} is 0, the runtime <b>must</b> return {@link XR10#XR_ERROR_VALIDATION_FAILURE ERROR_VALIDATION_FAILURE} from the call to {@link EXTHandTracking#xrCreateHandTrackerEXT CreateHandTrackerEXT}.</p>
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>The {@link EXTHandTrackingDataSource XR_EXT_hand_tracking_data_source} extension <b>must</b> be enabled prior to using {@link XrHandTrackingDataSourceInfoEXT}</li>
 * <li>{@code type} <b>must</b> be {@link EXTHandTrackingDataSource#XR_TYPE_HAND_TRACKING_DATA_SOURCE_INFO_EXT TYPE_HAND_TRACKING_DATA_SOURCE_INFO_EXT}</li>
 * <li>{@code next} <b>must</b> be {@code NULL} or a valid pointer to the <a href="https://www.khronos.org/registry/OpenXR/specs/1.0/html/xrspec.html#valid-usage-for-structure-pointer-chains">next structure in a structure chain</a></li>
 * <li>If {@code requestedDataSourceCount} is not 0, {@code requestedDataSources} <b>must</b> be a pointer to an array of {@code requestedDataSourceCount} {@code XrHandTrackingDataSourceEXT} values</li>
 * </ul>
 * 
 * <h5>See Also</h5>
 * 
 * <p>{@link XrHandTrackerCreateInfoEXT}, {@link EXTHandTracking#xrCreateHandTrackerEXT CreateHandTrackerEXT}</p>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct XrHandTrackingDataSourceInfoEXT {
 *     XrStructureType {@link #type};
 *     void const * {@link #next};
 *     uint32_t {@link #requestedDataSourceCount};
 *     XrHandTrackingDataSourceEXT * {@link #requestedDataSources};
 * }</code></pre>
 */
public class XrHandTrackingDataSourceInfoEXT extends Struct<XrHandTrackingDataSourceInfoEXT> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        TYPE,
        NEXT,
        REQUESTEDDATASOURCECOUNT,
        REQUESTEDDATASOURCES;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(4),
            __member(POINTER_SIZE)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        TYPE = layout.offsetof(0);
        NEXT = layout.offsetof(1);
        REQUESTEDDATASOURCECOUNT = layout.offsetof(2);
        REQUESTEDDATASOURCES = layout.offsetof(3);
    }

    protected XrHandTrackingDataSourceInfoEXT(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected XrHandTrackingDataSourceInfoEXT create(long address, @Nullable ByteBuffer container) {
        return new XrHandTrackingDataSourceInfoEXT(address, container);
    }

    /**
     * Creates a {@code XrHandTrackingDataSourceInfoEXT} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public XrHandTrackingDataSourceInfoEXT(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** the {@code XrStructureType} of this structure. */
    @NativeType("XrStructureType")
    public int type() { return ntype(address()); }
    /** {@code NULL} or a pointer to the next structure in a structure chain. */
    @NativeType("void const *")
    public long next() { return nnext(address()); }
    /** the number of elements in the {@code requestedDataSources} array. */
    @NativeType("uint32_t")
    public int requestedDataSourceCount() { return nrequestedDataSourceCount(address()); }
    /** an array of {@code XrHandTrackingDataSourceEXT} that the application accepts. */
    @Nullable
    @NativeType("XrHandTrackingDataSourceEXT *")
    public IntBuffer requestedDataSources() { return nrequestedDataSources(address()); }

    /** Sets the specified value to the {@link #type} field. */
    public XrHandTrackingDataSourceInfoEXT type(@NativeType("XrStructureType") int value) { ntype(address(), value); return this; }
    /** Sets the {@link EXTHandTrackingDataSource#XR_TYPE_HAND_TRACKING_DATA_SOURCE_INFO_EXT TYPE_HAND_TRACKING_DATA_SOURCE_INFO_EXT} value to the {@link #type} field. */
    public XrHandTrackingDataSourceInfoEXT type$Default() { return type(EXTHandTrackingDataSource.XR_TYPE_HAND_TRACKING_DATA_SOURCE_INFO_EXT); }
    /** Sets the specified value to the {@link #next} field. */
    public XrHandTrackingDataSourceInfoEXT next(@NativeType("void const *") long value) { nnext(address(), value); return this; }
    /** Sets the address of the specified {@link IntBuffer} to the {@link #requestedDataSources} field. */
    public XrHandTrackingDataSourceInfoEXT requestedDataSources(@Nullable @NativeType("XrHandTrackingDataSourceEXT *") IntBuffer value) { nrequestedDataSources(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public XrHandTrackingDataSourceInfoEXT set(
        int type,
        long next,
        @Nullable IntBuffer requestedDataSources
    ) {
        type(type);
        next(next);
        requestedDataSources(requestedDataSources);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public XrHandTrackingDataSourceInfoEXT set(XrHandTrackingDataSourceInfoEXT src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code XrHandTrackingDataSourceInfoEXT} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static XrHandTrackingDataSourceInfoEXT malloc() {
        return new XrHandTrackingDataSourceInfoEXT(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code XrHandTrackingDataSourceInfoEXT} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static XrHandTrackingDataSourceInfoEXT calloc() {
        return new XrHandTrackingDataSourceInfoEXT(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code XrHandTrackingDataSourceInfoEXT} instance allocated with {@link BufferUtils}. */
    public static XrHandTrackingDataSourceInfoEXT create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new XrHandTrackingDataSourceInfoEXT(memAddress(container), container);
    }

    /** Returns a new {@code XrHandTrackingDataSourceInfoEXT} instance for the specified memory address. */
    public static XrHandTrackingDataSourceInfoEXT create(long address) {
        return new XrHandTrackingDataSourceInfoEXT(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static XrHandTrackingDataSourceInfoEXT createSafe(long address) {
        return address == NULL ? null : new XrHandTrackingDataSourceInfoEXT(address, null);
    }

    /**
     * Returns a new {@link XrHandTrackingDataSourceInfoEXT.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrHandTrackingDataSourceInfoEXT.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link XrHandTrackingDataSourceInfoEXT.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrHandTrackingDataSourceInfoEXT.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrHandTrackingDataSourceInfoEXT.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static XrHandTrackingDataSourceInfoEXT.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link XrHandTrackingDataSourceInfoEXT.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static XrHandTrackingDataSourceInfoEXT.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static XrHandTrackingDataSourceInfoEXT.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code XrHandTrackingDataSourceInfoEXT} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static XrHandTrackingDataSourceInfoEXT malloc(MemoryStack stack) {
        return new XrHandTrackingDataSourceInfoEXT(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code XrHandTrackingDataSourceInfoEXT} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static XrHandTrackingDataSourceInfoEXT calloc(MemoryStack stack) {
        return new XrHandTrackingDataSourceInfoEXT(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link XrHandTrackingDataSourceInfoEXT.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrHandTrackingDataSourceInfoEXT.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrHandTrackingDataSourceInfoEXT.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrHandTrackingDataSourceInfoEXT.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #type}. */
    public static int ntype(long struct) { return UNSAFE.getInt(null, struct + XrHandTrackingDataSourceInfoEXT.TYPE); }
    /** Unsafe version of {@link #next}. */
    public static long nnext(long struct) { return memGetAddress(struct + XrHandTrackingDataSourceInfoEXT.NEXT); }
    /** Unsafe version of {@link #requestedDataSourceCount}. */
    public static int nrequestedDataSourceCount(long struct) { return UNSAFE.getInt(null, struct + XrHandTrackingDataSourceInfoEXT.REQUESTEDDATASOURCECOUNT); }
    /** Unsafe version of {@link #requestedDataSources() requestedDataSources}. */
    @Nullable public static IntBuffer nrequestedDataSources(long struct) { return memIntBufferSafe(memGetAddress(struct + XrHandTrackingDataSourceInfoEXT.REQUESTEDDATASOURCES), nrequestedDataSourceCount(struct)); }

    /** Unsafe version of {@link #type(int) type}. */
    public static void ntype(long struct, int value) { UNSAFE.putInt(null, struct + XrHandTrackingDataSourceInfoEXT.TYPE, value); }
    /** Unsafe version of {@link #next(long) next}. */
    public static void nnext(long struct, long value) { memPutAddress(struct + XrHandTrackingDataSourceInfoEXT.NEXT, value); }
    /** Sets the specified value to the {@code requestedDataSourceCount} field of the specified {@code struct}. */
    public static void nrequestedDataSourceCount(long struct, int value) { UNSAFE.putInt(null, struct + XrHandTrackingDataSourceInfoEXT.REQUESTEDDATASOURCECOUNT, value); }
    /** Unsafe version of {@link #requestedDataSources(IntBuffer) requestedDataSources}. */
    public static void nrequestedDataSources(long struct, @Nullable IntBuffer value) { memPutAddress(struct + XrHandTrackingDataSourceInfoEXT.REQUESTEDDATASOURCES, memAddressSafe(value)); nrequestedDataSourceCount(struct, value == null ? 0 : value.remaining()); }

    /**
     * Validates pointer members that should not be {@code NULL}.
     *
     * @param struct the struct to validate
     */
    public static void validate(long struct) {
        if (nrequestedDataSourceCount(struct) != 0) {
            check(memGetAddress(struct + XrHandTrackingDataSourceInfoEXT.REQUESTEDDATASOURCES));
        }
    }

    // -----------------------------------

    /** An array of {@link XrHandTrackingDataSourceInfoEXT} structs. */
    public static class Buffer extends StructBuffer<XrHandTrackingDataSourceInfoEXT, Buffer> implements NativeResource {

        private static final XrHandTrackingDataSourceInfoEXT ELEMENT_FACTORY = XrHandTrackingDataSourceInfoEXT.create(-1L);

        /**
         * Creates a new {@code XrHandTrackingDataSourceInfoEXT.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link XrHandTrackingDataSourceInfoEXT#SIZEOF}, and its mark will be undefined.</p>
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
        protected XrHandTrackingDataSourceInfoEXT getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link XrHandTrackingDataSourceInfoEXT#type} field. */
        @NativeType("XrStructureType")
        public int type() { return XrHandTrackingDataSourceInfoEXT.ntype(address()); }
        /** @return the value of the {@link XrHandTrackingDataSourceInfoEXT#next} field. */
        @NativeType("void const *")
        public long next() { return XrHandTrackingDataSourceInfoEXT.nnext(address()); }
        /** @return the value of the {@link XrHandTrackingDataSourceInfoEXT#requestedDataSourceCount} field. */
        @NativeType("uint32_t")
        public int requestedDataSourceCount() { return XrHandTrackingDataSourceInfoEXT.nrequestedDataSourceCount(address()); }
        /** @return a {@link IntBuffer} view of the data pointed to by the {@link XrHandTrackingDataSourceInfoEXT#requestedDataSources} field. */
        @Nullable
        @NativeType("XrHandTrackingDataSourceEXT *")
        public IntBuffer requestedDataSources() { return XrHandTrackingDataSourceInfoEXT.nrequestedDataSources(address()); }

        /** Sets the specified value to the {@link XrHandTrackingDataSourceInfoEXT#type} field. */
        public XrHandTrackingDataSourceInfoEXT.Buffer type(@NativeType("XrStructureType") int value) { XrHandTrackingDataSourceInfoEXT.ntype(address(), value); return this; }
        /** Sets the {@link EXTHandTrackingDataSource#XR_TYPE_HAND_TRACKING_DATA_SOURCE_INFO_EXT TYPE_HAND_TRACKING_DATA_SOURCE_INFO_EXT} value to the {@link XrHandTrackingDataSourceInfoEXT#type} field. */
        public XrHandTrackingDataSourceInfoEXT.Buffer type$Default() { return type(EXTHandTrackingDataSource.XR_TYPE_HAND_TRACKING_DATA_SOURCE_INFO_EXT); }
        /** Sets the specified value to the {@link XrHandTrackingDataSourceInfoEXT#next} field. */
        public XrHandTrackingDataSourceInfoEXT.Buffer next(@NativeType("void const *") long value) { XrHandTrackingDataSourceInfoEXT.nnext(address(), value); return this; }
        /** Sets the address of the specified {@link IntBuffer} to the {@link XrHandTrackingDataSourceInfoEXT#requestedDataSources} field. */
        public XrHandTrackingDataSourceInfoEXT.Buffer requestedDataSources(@Nullable @NativeType("XrHandTrackingDataSourceEXT *") IntBuffer value) { XrHandTrackingDataSourceInfoEXT.nrequestedDataSources(address(), value); return this; }

    }

}